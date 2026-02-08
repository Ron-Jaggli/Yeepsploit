package com.gameanalytics.sdk.store;

import android.database.CursorWindow;
import java.io.File;
import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import org.json.JSONObject;
import com.gameanalytics.sdk.utilities.GAUtilities;
import java.util.Locale;
import java.util.ArrayList;
import org.json.JSONArray;
import com.gameanalytics.sdk.state.GAState;
import com.gameanalytics.sdk.events.EGASdkErrorAction;
import com.gameanalytics.sdk.events.EGASdkErrorArea;
import com.gameanalytics.sdk.events.EGASdkErrorCategory;
import com.gameanalytics.sdk.http.GAHTTPApi;
import com.gameanalytics.sdk.logging.GALogger;
import android.database.sqlite.SQLiteDatabase$CursorFactory;
import com.gameanalytics.sdk.device.GADevice;
import android.database.sqlite.SQLiteDatabase;

public class GAStore
{
    private static final GAStore INSTANCE;
    private static final long MaxDbSizeBytes = 6291456L;
    private static final long MaxDbSizeBytesBeforeTrim = 5242880L;
    private String dbPath;
    boolean dbReady;
    private SQLiteDatabase sqlDatabase;
    boolean tableReady;
    
    static {
        INSTANCE = new GAStore();
    }
    
    private GAStore() {
        this.dbPath = "";
        this.sqlDatabase = null;
        this.dbReady = false;
        this.tableReady = false;
    }
    
    public static boolean ensureDatabase(final boolean b) {
        if (getInstance().dbPath.length() == 0) {
            getInstance().dbPath = GADevice.getWritableFilePath() + "/ga.sqlite3";
        }
        try {
            getInstance().sqlDatabase = SQLiteDatabase.openOrCreateDatabase(getInstance().dbPath, (SQLiteDatabase$CursorFactory)null);
            getInstance().dbReady = true;
            GALogger.i("Database opened: " + getInstance().dbPath);
            if (b) {
                GALogger.d("Drop tables");
                executeQuerySync("DROP TABLE ga_events");
                executeQuerySync("DROP TABLE ga_state");
                executeQuerySync("DROP TABLE ga_session");
                executeQuerySync("DROP TABLE ga_progression");
                executeQuerySync("VACUUM");
            }
            if (executeQuerySync("CREATE TABLE IF NOT EXISTS ga_events(status CHAR(50) NOT NULL, category CHAR(50) NOT NULL, session_id CHAR(50) NOT NULL, client_ts CHAR(50) NOT NULL, event TEXT NOT NULL);") == null) {
                return false;
            }
            if (executeQuerySync("SELECT status FROM ga_events LIMIT 0,1") == null) {
                GALogger.d("ga_events corrupt, recreating.");
                executeQuerySync("DROP TABLE ga_events");
                if (executeQuerySync("CREATE TABLE IF NOT EXISTS ga_events(status CHAR(50) NOT NULL, category CHAR(50) NOT NULL, session_id CHAR(50) NOT NULL, client_ts CHAR(50) NOT NULL, event TEXT NOT NULL);") == null) {
                    GALogger.w("ga_events corrupt, could not recreate it.");
                    return false;
                }
            }
            if (executeQuerySync("CREATE TABLE IF NOT EXISTS ga_session(session_id CHAR(50) PRIMARY KEY NOT NULL, timestamp CHAR(50) NOT NULL, event TEXT NOT NULL);") == null) {
                return false;
            }
            if (executeQuerySync("SELECT session_id FROM ga_session LIMIT 0,1") == null) {
                GALogger.d("ga_session corrupt, recreating.");
                executeQuerySync("DROP TABLE ga_session");
                if (executeQuerySync("CREATE TABLE IF NOT EXISTS ga_session(session_id CHAR(50) PRIMARY KEY NOT NULL, timestamp CHAR(50) NOT NULL, event TEXT NOT NULL);") == null) {
                    GALogger.w("ga_session corrupt, could not recreate it.");
                    return false;
                }
            }
            if (executeQuerySync("CREATE TABLE IF NOT EXISTS ga_state(key CHAR(255) PRIMARY KEY NOT NULL, value TEXT);") == null) {
                return false;
            }
            if (executeQuerySync("SELECT key FROM ga_state LIMIT 0,1") == null) {
                GALogger.d("ga_state corrupt, recreating.");
                executeQuerySync("DROP TABLE ga_state");
                if (executeQuerySync("CREATE TABLE IF NOT EXISTS ga_state(key CHAR(255) PRIMARY KEY NOT NULL, value TEXT);") == null) {
                    GALogger.w("ga_state corrupt, could not recreate it.");
                    return false;
                }
            }
            if (executeQuerySync("CREATE TABLE IF NOT EXISTS ga_progression(progression CHAR(255) PRIMARY KEY NOT NULL, tries CHAR(255));") == null) {
                return false;
            }
            if (executeQuerySync("SELECT progression FROM ga_progression LIMIT 0,1") == null) {
                GALogger.d("ga_progression corrupt, recreating.");
                executeQuerySync("DROP TABLE ga_progression");
                if (executeQuerySync("CREATE TABLE IF NOT EXISTS ga_progression(progression CHAR(255) PRIMARY KEY NOT NULL, tries CHAR(255));") == null) {
                    GALogger.w("ga_progression corrupt, could not recreate it.");
                    return false;
                }
            }
            trimEventTable();
            getInstance().tableReady = true;
            GALogger.d("Database tables ensured present");
            return true;
        }
        catch (final Exception ex) {
            getInstance().dbReady = false;
            GALogger.w("Could not open database: " + getInstance().dbPath);
            ex.printStackTrace();
            GAHTTPApi.getInstance().sendSdkErrorEvent(EGASdkErrorCategory.Database, EGASdkErrorArea.Sql, EGASdkErrorAction.DatabaseOpenOrCreate, ex.toString(), GAState.getGameKey(), GAState.getSecretKey());
            return false;
        }
    }
    
    public static JSONArray executeQuerySync(final String s) {
        return executeQuerySync(s, (ArrayList<String>)new ArrayList());
    }
    
    public static JSONArray executeQuerySync(final String s, final ArrayList<String> list) {
        return executeQuerySync(s, list, false);
    }
    
    public static JSONArray executeQuerySync(String s, ArrayList<String> jsonObject, boolean b) {
        if (GAUtilities.stringMatch(s.toUpperCase(Locale.US), "^(UPDATE|INSERT|DELETE)")) {
            b = true;
        }
        final SQLiteDatabase database = getInstance().getDatabase();
        final JSONArray jsonArray = new JSONArray();
        final JSONArray jsonArray2 = null;
        if (b) {
            try {
                database.execSQL("BEGIN;");
            }
            catch (final Exception ex) {
                GALogger.e("SQLITE3 BEGIN ERROR: ");
                ex.printStackTrace();
                GAHTTPApi.getInstance().sendSdkErrorEvent(EGASdkErrorCategory.Database, EGASdkErrorArea.Sql, EGASdkErrorAction.SqlBegin, ex.toString(), GAState.getGameKey(), GAState.getSecretKey());
                return null;
            }
        }
        JSONArray jsonArray4 = null;
        Label_0306: {
            try {
                if (!((ArrayList)jsonObject).isEmpty()) {
                    s = (String)database.rawQuery(s, (String[])((ArrayList)jsonObject).toArray((Object[])new String[((ArrayList)jsonObject).size()]));
                }
                else {
                    s = (String)database.rawQuery(s, (String[])null);
                }
                try {
                    final int columnCount = ((Cursor)s).getColumnCount();
                    while (true) {
                        final JSONArray jsonArray3 = jsonArray;
                        final String s2 = s;
                        if (!((Cursor)s).moveToNext()) {
                            break Label_0306;
                        }
                        jsonObject = new JSONObject();
                        for (int i = 0; i < columnCount; ++i) {
                            final String columnName = ((Cursor)s).getColumnName(i);
                            if (columnName != null) {
                                try {
                                    setColumn((Cursor)s, ((SQLiteCursor)s).getWindow(), ((Cursor)s).getPosition(), i, jsonObject, columnName);
                                }
                                catch (final Exception ex2) {
                                    ex2.printStackTrace();
                                    GAHTTPApi.getInstance().sendSdkErrorEvent(EGASdkErrorCategory.Database, EGASdkErrorArea.Sql, EGASdkErrorAction.SqlSetColumn, ex2.toString(), GAState.getGameKey(), GAState.getSecretKey());
                                }
                            }
                        }
                        jsonArray.put((Object)jsonObject);
                    }
                }
                catch (final Exception ex3) {}
            }
            catch (final Exception ex3) {
                s = null;
            }
            GALogger.e("SQLITE3 PREPARE ERROR: ");
            final Exception ex3;
            ex3.printStackTrace();
            GAHTTPApi.getInstance().sendSdkErrorEvent(EGASdkErrorCategory.Database, EGASdkErrorArea.Sql, EGASdkErrorAction.SqlRawQuery, ex3.toString(), GAState.getGameKey(), GAState.getSecretKey());
            final JSONArray jsonArray3 = null;
            final String s2 = s;
            try {
                ((Cursor)s2).close();
                if (b) {
                    try {
                        database.execSQL("COMMIT");
                    }
                    catch (final Exception ex4) {
                        GALogger.e("SQLITE3 COMMIT ERROR: ");
                        ex4.printStackTrace();
                        GAHTTPApi.getInstance().sendSdkErrorEvent(EGASdkErrorCategory.Database, EGASdkErrorArea.Sql, EGASdkErrorAction.SqlCommit, ex4.toString(), GAState.getGameKey(), GAState.getSecretKey());
                        jsonArray4 = jsonArray2;
                        return jsonArray4;
                    }
                }
                jsonArray4 = jsonArray3;
            }
            catch (final Exception ex5) {
                GALogger.d("SQLITE3 FINALIZE ERROR: ");
                ex5.printStackTrace();
                GAHTTPApi.getInstance().sendSdkErrorEvent(EGASdkErrorCategory.Database, EGASdkErrorArea.Sql, EGASdkErrorAction.SqlCommit, ex5.toString(), GAState.getGameKey(), GAState.getSecretKey());
                jsonArray4 = jsonArray2;
                if (b) {
                    try {
                        database.execSQL("ROLLBACK");
                        jsonArray4 = jsonArray2;
                    }
                    catch (final Exception ex6) {
                        GALogger.e("SQLITE3 ROLLBACK ERROR: ");
                        ex6.printStackTrace();
                        GAHTTPApi.getInstance().sendSdkErrorEvent(EGASdkErrorCategory.Database, EGASdkErrorArea.Sql, EGASdkErrorAction.SqlRollback, ex6.toString(), GAState.getGameKey(), GAState.getSecretKey());
                        jsonArray4 = jsonArray2;
                    }
                }
            }
        }
        return jsonArray4;
    }
    
    private SQLiteDatabase getDatabase() {
        return this.sqlDatabase;
    }
    
    public static long getDbSizeBytes() {
        return new File(getInstance().sqlDatabase.getPath()).length();
    }
    
    private static GAStore getInstance() {
        return GAStore.INSTANCE;
    }
    
    public static boolean getTableReady() {
        return getInstance().tableReady;
    }
    
    public static boolean isDbTooLargeForEvents() {
        return getDbSizeBytes() > 6291456L;
    }
    
    private static void setColumn(final Cursor cursor, final CursorWindow cursorWindow, int type, final int n, final JSONObject jsonObject, final String s) throws Exception {
        try {
            type = cursorWindow.getType(type, n);
            if (type != 1) {
                if (type != 2) {
                    jsonObject.put(s, (Object)cursor.getString(n));
                }
                else {
                    jsonObject.put(s, cursor.getDouble(n));
                }
            }
            else {
                jsonObject.put(s, cursor.getInt(n));
            }
        }
        catch (final Exception ex) {
            ex.printStackTrace();
            throw ex;
        }
    }
    
    public static boolean setState(final String s, final String s2) {
        final boolean b = false;
        boolean b2 = false;
        if (s2 != null && s2.length() != 0) {
            final ArrayList list = new ArrayList();
            list.add((Object)s);
            list.add((Object)s2);
            if (executeQuerySync("INSERT OR REPLACE INTO ga_state (key, value) VALUES(?, ?);", (ArrayList<String>)list, true) != null) {
                b2 = true;
            }
            return b2;
        }
        final ArrayList list2 = new ArrayList();
        list2.add((Object)s);
        boolean b3 = b;
        if (executeQuerySync("DELETE FROM ga_state WHERE key = ?;", (ArrayList<String>)list2) != null) {
            b3 = true;
        }
        return b3;
    }
    
    private static boolean trimEventTable() {
        if (getDbSizeBytes() <= 5242880L) {
            return true;
        }
        final JSONArray executeQuerySync = executeQuerySync("SELECT session_id, Max(client_ts) FROM ga_events GROUP BY session_id ORDER BY client_ts LIMIT 3");
        int i = 0;
        if (executeQuerySync != null && executeQuerySync.length() > 0) {
            String s = "";
            while (i < executeQuerySync.length()) {
                final String s2 = s += executeQuerySync.optString(i, "");
                if (i < executeQuerySync.length() - 1) {
                    s = s2 + ",";
                }
                ++i;
            }
            final String string = "DELETE FROM ga_events WHERE session_id IN (\"" + s + "\");";
            GALogger.w("Database too large when initializing. Deleting the oldest 3 sessions.");
            executeQuerySync(string);
            executeQuerySync("VACUUM");
            return true;
        }
        return false;
    }
}
