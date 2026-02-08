package com.unity3d.player;

import android.view.MotionEvent;
import android.content.Intent;
import android.app.Activity;
import android.content.Context;
import android.widget.FrameLayout;
import android.os.Bundle;
import android.content.res.Configuration;
import android.view.View;
import androidx.core.view.ViewCompat;
import com.google.androidgamesdk.GameActivity$InputEnabledSurfaceView;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import android.view.SurfaceView;
import com.google.androidgamesdk.GameActivity;

public class UnityPlayerGameActivity extends GameActivity implements IUnityPlayerLifecycleEvents, IUnityPermissionRequestSupport, IUnityPlayerSupport
{
    protected UnityPlayerForGameActivity mUnityPlayer;
    
    static {
        System.loadLibrary("game");
    }
    
    private void applyInsetListener(final SurfaceView surfaceView) {
        surfaceView.getViewTreeObserver().addOnGlobalLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)new UnityPlayerGameActivity$$ExternalSyntheticLambda0(this, surfaceView));
    }
    
    protected GameActivity$InputEnabledSurfaceView createSurfaceView() {
        return new GameActivitySurfaceView(this);
    }
    
    public UnityPlayerForGameActivity getUnityPlayerConnection() {
        return this.mUnityPlayer;
    }
    
    public void onConfigurationChanged(final Configuration configuration) {
        this.mUnityPlayer.configurationChanged(configuration);
        super.onConfigurationChanged(configuration);
    }
    
    protected void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
    }
    
    protected void onCreateSurfaceView() {
        super.onCreateSurfaceView();
        final FrameLayout frameLayout = (FrameLayout)this.findViewById(this.contentViewId);
        this.applyInsetListener((SurfaceView)this.mSurfaceView);
        this.mSurfaceView.setId(UnityPlayerForGameActivity.getUnityViewIdentifier((Context)this));
        this.getIntent().putExtra("unity", this.updateUnityCommandLineArguments(this.getIntent().getStringExtra("unity")));
        this.mUnityPlayer = new UnityPlayerForGameActivity((Activity)this, frameLayout, (SurfaceView)this.mSurfaceView, this);
    }
    
    protected void onDestroy() {
        this.mUnityPlayer.destroy();
        super.onDestroy();
    }
    
    protected void onNewIntent(final Intent intent) {
        super.onNewIntent(intent);
        this.setIntent(intent);
        this.mUnityPlayer.newIntent(intent);
    }
    
    protected void onPause() {
        this.mUnityPlayer.onPause();
        super.onPause();
    }
    
    public void onRequestPermissionsResult(final int n, final String[] array, final int[] array2) {
        super.onRequestPermissionsResult(n, array, array2);
        this.mUnityPlayer.permissionResponse((Activity)this, n, array, array2);
    }
    
    protected void onResume() {
        this.mUnityPlayer.onResume();
        super.onResume();
    }
    
    protected void onStart() {
        this.mUnityPlayer.onStart();
        super.onStart();
    }
    
    protected void onStop() {
        this.mUnityPlayer.onStop();
        super.onStop();
    }
    
    public void onUnityPlayerQuitted() {
    }
    
    public void onUnityPlayerUnloaded() {
    }
    
    public void onWindowFocusChanged(final boolean b) {
        this.mUnityPlayer.windowFocusChanged(b);
        super.onWindowFocusChanged(b);
    }
    
    public void requestPermissions(final PermissionRequest permissionRequest) {
        this.mUnityPlayer.addPermissionRequest(permissionRequest);
    }
    
    protected String updateUnityCommandLineArguments(final String s) {
        return s;
    }
    
    class GameActivitySurfaceView extends GameActivity$InputEnabledSurfaceView
    {
        GameActivity mGameActivity;
        final UnityPlayerGameActivity this$0;
        
        public GameActivitySurfaceView(final UnityPlayerGameActivity this$0, final GameActivity mGameActivity) {
            super((GameActivity)(this.this$0 = this$0), mGameActivity);
            this.mGameActivity = mGameActivity;
        }
        
        public boolean onCapturedPointerEvent(final MotionEvent motionEvent) {
            return this.mGameActivity.onTouchEvent(motionEvent);
        }
    }
}
