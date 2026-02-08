package com.google.firebase;

import com.google.android.gms.common.internal.Preconditions;

public class FirebaseException extends Exception
{
    @Deprecated
    protected FirebaseException() {
    }
    
    public FirebaseException(final String s) {
        Preconditions.checkNotEmpty(s, (Object)"Detail message must not be empty");
        super(s);
    }
    
    public FirebaseException(final String s, final Throwable t) {
        Preconditions.checkNotEmpty(s, (Object)"Detail message must not be empty");
        super(s, t);
    }
}
