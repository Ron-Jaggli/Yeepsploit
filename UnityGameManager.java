package com.unity3d.player;

import android.app.GameManager;
import android.content.Context;

public class UnityGameManager
{
    private static Object mGameManager;
    
    public static Object getGameManager(final Context context) {
        String s;
        if (!PlatformSupport.SNOW_CONE_SUPPORT) {
            s = "getGameManager: API level not supported. API level 31 is required.";
        }
        else {
            final Object mGameManager = UnityGameManager.mGameManager;
            if (mGameManager != null) {
                return mGameManager;
            }
            if (context != null) {
                return UnityGameManager.mGameManager = context.getSystemService((Class)GameManager.class);
            }
            s = "UnityGame: Request for GameManager supplied with null context.";
        }
        D.Log(6, s);
        return null;
    }
    
    public static int getGameMode(final Context context) {
        String s;
        if (!PlatformSupport.SNOW_CONE_SUPPORT) {
            s = "getGameMode: API level not supported. API level 31 is required.";
        }
        else {
            final GameManager gameManager = (GameManager)getGameManager(context);
            if (gameManager != null) {
                return gameManager.getGameMode();
            }
            s = "UnityGame: GameManager not available.";
        }
        D.Log(6, s);
        return 0;
    }
}
