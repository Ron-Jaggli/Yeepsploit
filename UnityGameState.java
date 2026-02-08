package com.unity3d.player;

import android.app.GameState;
import android.app.GameManager;
import android.content.Context;

public class UnityGameState
{
    private static String ModeName(final int n) {
        if (n == 0) {
            return "UNKNOWN";
        }
        if (n == 1) {
            return "NONE";
        }
        if (n == 2) {
            return "GAMEPLAY_INTERRUPTIBLE";
        }
        if (n == 3) {
            return "GAMEPLAY_UNINTERRUPTIBLE";
        }
        if (n != 4) {
            return String.valueOf(n);
        }
        return "CONTENT";
    }
    
    public static void setGameState(final Context context, final boolean b, final int n) {
        if (!PlatformSupport.TIRAMISU_SUPPORT) {
            D.Log(6, "setGameState: API level not supported. API level 33 is required.");
            return;
        }
        final GameManager gameManager = (GameManager)UnityGameManager.getGameManager(context);
        if (gameManager == null) {
            D.Log(6, "UnityGame: GameManager not available.");
            return;
        }
        D.Log(4, "SetGameState: " + b + " " + n);
        gameManager.setGameState(new GameState(b, n));
    }
    
    public static void setGameState(final Context context, final boolean b, final int n, final int n2, final int n3) {
        if (!PlatformSupport.TIRAMISU_SUPPORT) {
            D.Log(6, "setGameState: API level not supported. API level 33 is required.");
            return;
        }
        final GameManager gameManager = (GameManager)UnityGameManager.getGameManager(context);
        if (gameManager == null) {
            D.Log(6, "UnityGame: GameManager not available.");
            return;
        }
        D.Log(4, "SetGameState: isLoading: " + b + ", mode: " + ModeName(n) + ", label: " + n2 + ", quality: " + n3);
        gameManager.setGameState(new GameState(b, n, n2, n3));
    }
}
