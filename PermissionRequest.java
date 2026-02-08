package com.unity3d.player;

public class PermissionRequest
{
    static final int DENIED = 2;
    static final int DENIED_DONT_ASK_AGAIN = 3;
    static final int GRANTED = 1;
    private IPermissionRequestCallbacks mCallbacks;
    private String[] mPermissionNames;
    
    public PermissionRequest(final String[] mPermissionNames, final IPermissionRequestCallbacks mCallbacks) {
        this.mPermissionNames = mPermissionNames;
        this.mCallbacks = mCallbacks;
    }
    
    String[] getPermissionNames() {
        return this.mPermissionNames;
    }
    
    void permissionResponse(final String[] array, final int[] array2) {
        final IPermissionRequestCallbacks mCallbacks = this.mCallbacks;
        if (mCallbacks == null) {
            return;
        }
        mCallbacks.onPermissionResult(array, array2);
    }
}
