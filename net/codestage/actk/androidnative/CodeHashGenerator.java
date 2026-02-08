package net.codestage.actk.androidnative;

import java.io.InputStream;
import java.util.HashMap;
import java.util.zip.ZipEntry;
import java.security.MessageDigest;
import java.util.Enumeration;
import java.util.concurrent.ExecutionException;
import java.util.Map;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.jar.JarEntry;
import java.util.Collections;
import java.io.IOException;
import android.content.pm.PackageManager$NameNotFoundException;
import java.util.jar.JarFile;
import java.util.Iterator;
import java.io.File;
import java.util.ArrayList;
import android.util.Log;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.CompletionService;
import java.util.concurrent.Callable;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.Executors;
import java.nio.charset.StandardCharsets;
import java.util.List;

public class CodeHashGenerator
{
    public static String GetArrayHash(final List<String> list) {
        if (list == null) {
            return "";
        }
        final int size = list.size();
        if (size == 0) {
            return "";
        }
        final int length = ((String)list.get(0)).length();
        final byte[][] array = new byte[size][];
        for (int i = 0; i < size; ++i) {
            array[i] = ((String)list.get(i)).getBytes(StandardCharsets.UTF_8);
        }
        final int n = length / 2;
        final byte[] array2 = new byte[n];
        for (int j = 0; j < length; j += 2) {
            int k = 0;
            byte b = 0;
            while (k < size) {
                final byte[] array3 = array[k];
                b ^= (byte)(array3[j + 1] | array3[j] << 4);
                ++k;
            }
            array2[j / 2] = b;
        }
        final StringBuilder sb = new StringBuilder();
        for (int l = 0; l < n; ++l) {
            sb.append(String.format("%02x", new Object[] { array2[l] }));
        }
        return sb.toString().toUpperCase().substring(0, length);
    }
    
    public static void GetCodeHash(final String[] array, final CodeHashCallback codeHashCallback, final int n) {
        final ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor();
        final ExecutorCompletionService executorCompletionService = new ExecutorCompletionService((Executor)singleThreadExecutor);
        final Handler handler = new Handler(Looper.getMainLooper());
        ((CompletionService)executorCompletionService).submit((Callable)new CodeHashGenerator$$ExternalSyntheticLambda2(array, n));
        singleThreadExecutor.shutdown();
        new Thread((Runnable)new CodeHashGenerator$$ExternalSyntheticLambda3((CompletionService)executorCompletionService, handler, codeHashCallback)).start();
    }
    
    private static HashCalculationResult GetCodeHashThread(final FilteringData filteringData, final int n) throws ClassNotFoundException, PackageManager$NameNotFoundException, NoSuchFieldException, IllegalAccessException, IOException {
        final HashCalculationResult hashCalculationResult = new HashCalculationResult();
        final String getApkPath = NativeUtils.GetApkPath();
        if (getApkPath == null) {
            hashCalculationResult.errorText = "[CodeHashGenerator ERROR] Can't get APK path!";
            Log.e(NativeUtils.LogTag, hashCalculationResult.errorText);
            return hashCalculationResult;
        }
        final ArrayList list = new ArrayList();
        final File file = new File(getApkPath);
        if (!file.exists()) {
            hashCalculationResult.errorText = ACTkErrors.GetText("[CodeHashGenerator ERROR] Can't create file for APK path: " + getApkPath);
            Log.e(NativeUtils.LogTag, hashCalculationResult.errorText);
            return hashCalculationResult;
        }
        final File parentFile = file.getParentFile();
        if (parentFile == null) {
            Log.w(NativeUtils.LogTag, "[CodeHashGenerator ERROR] Can't find parent folder of APK file at path: ");
            ((List)list).add((Object)getApkPath);
        }
        else {
            final File[] listFiles = parentFile.listFiles();
            if (listFiles != null && listFiles.length != 0) {
                for (int length = listFiles.length, i = 0; i < length; ++i) {
                    final String path = listFiles[i].getPath();
                    if (path.equals((Object)"")) {
                        Log.w(NativeUtils.LogTag, "[CodeHashGenerator ERROR] Can't get path for file in APK folder!");
                    }
                    else if (path.toLowerCase().endsWith(".apk")) {
                        ((List)list).add((Object)path);
                    }
                }
            }
            else {
                Log.w(NativeUtils.LogTag, "[CodeHashGenerator ERROR] Can't get any files in APK folder at path: ");
                ((List)list).add((Object)getApkPath);
            }
        }
        hashCalculationResult.buildPath = getApkPath;
        final ArrayList list2 = new ArrayList();
        final ArrayList list3 = new ArrayList();
        for (final String s : list) {
            final JarFile getJarFromApk = GetJarFromApk(s);
            if (getJarFromApk == null) {
                hashCalculationResult.errorText = ACTkErrors.GetText("[CodeHashGenerator ERROR] Can't read APK with path: " + s);
                Log.e(NativeUtils.LogTag, hashCalculationResult.errorText);
                return hashCalculationResult;
            }
            HashFiles(getJarFromApk, filteringData, (List<String>)list2, (List<String>)list3, n);
        }
        if (((List)list3).size() == 0) {
            hashCalculationResult.errorText = ACTkErrors.GetText("[CodeHashGenerator ERROR] Nothing to hash!");
            Log.e(NativeUtils.LogTag, hashCalculationResult.errorText);
            return hashCalculationResult;
        }
        hashCalculationResult.buildPath = getApkPath;
        hashCalculationResult.hashes = (String[])((List)list3).toArray((Object[])new String[0]);
        hashCalculationResult.paths = (String[])((List)list2).toArray((Object[])new String[0]);
        hashCalculationResult.summaryHash = GetArrayHash((List<String>)list3);
        return hashCalculationResult;
    }
    
    private static JarFile GetJarFromApk(final String s) throws IOException {
        if (new File(s).exists()) {
            return new JarFile(s);
        }
        return null;
    }
    
    private static void HashFiles(JarFile iterator, final FilteringData filteringData, final List<String> list, final List<String> list2, final int n) {
        final ExecutorService fixedThreadPool = Executors.newFixedThreadPool(n);
        final ArrayList list3 = new ArrayList();
        final Enumeration entries = iterator.entries();
        if (entries == null) {
            Log.e(NativeUtils.LogTag, "[CodeHashGenerator ERROR] Nothing found in APK JAR!");
            return;
        }
        for (final JarEntry jarEntry : Collections.list(entries)) {
            if (jarEntry == null) {
                Log.w(NativeUtils.LogTag, "[CodeHashGenerator ERROR] Some JAR entry is null!");
            }
            else {
                final String name = jarEntry.getName();
                if (name == null) {
                    Log.w(NativeUtils.LogTag, "[CodeHashGenerator ERROR] Some JAR entry has null path!");
                }
                else {
                    if (filteringData.IsIgnored(name)) {
                        continue;
                    }
                    if (!filteringData.IsIncluded(name)) {
                        continue;
                    }
                    ((List)list3).add((Object)fixedThreadPool.submit((Callable)new CodeHashGenerator$$ExternalSyntheticLambda0(iterator, jarEntry, name)));
                }
            }
        }
        fixedThreadPool.shutdown();
        try {
            if (!fixedThreadPool.awaitTermination(1L, TimeUnit.HOURS)) {
                Log.e(NativeUtils.LogTag, "Not all tasks completed within the specified timeout");
            }
            iterator = (JarFile)((List)list3).iterator();
            while (((Iterator)iterator).hasNext()) {
                final Future future = (Future)((Iterator)iterator).next();
                try {
                    final Map map = (Map)future.get();
                    if (map == null) {
                        continue;
                    }
                    list.add((Object)map.get((Object)"path"));
                    list2.add((Object)map.get((Object)"hash"));
                }
                catch (final InterruptedException | ExecutionException ex) {
                    Log.e(NativeUtils.LogTag, "Error while processing file", (Throwable)ex);
                }
            }
        }
        catch (final InterruptedException ex2) {
            Log.e(NativeUtils.LogTag, "Interrupted while waiting for tasks to complete");
        }
    }
    
    private static class HashCalculationResult
    {
        String buildPath;
        String errorText;
        String[] hashes;
        String[] paths;
        String summaryHash;
    }
}
