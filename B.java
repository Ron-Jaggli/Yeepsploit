package com.unity3d.player;

import android.view.KeyEvent;
import android.view.View;
import android.view.View$OnKeyListener;

final class b implements View$OnKeyListener
{
    public final boolean onKey(final View view, final int n, final KeyEvent keyEvent) {
        return n == 4 && keyEvent.getAction() == 1;
    }
}
