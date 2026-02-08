package com.aheaditec.talsec.security;

import android.content.pm.PackageManager$NameNotFoundException;
import android.os.Build$VERSION;
import android.content.Context;

public interface w0
{
    default String a(final Context context) {
        final String packageName = context.getPackageName();
        try {
            if (Build$VERSION.SDK_INT < 30) {
                return context.getPackageManager().getInstallerPackageName(packageName);
            }
            return context.getPackageManager().getInstallSourceInfo(packageName).getInitiatingPackageName();
        }
        catch (final PackageManager$NameNotFoundException | IllegalArgumentException ex) {
            return null;
        }
    }
    
    default String b(final Context context) {
        final String packageName = context.getPackageName();
        try {
            return context.getPackageManager().getPackageInfo(packageName, 0).versionName;
        }
        catch (final PackageManager$NameNotFoundException | IllegalArgumentException ex) {
            return null;
        }
    }
    
    F a();
    
    String b();
    
    U c();
    
    String d();
    
    g0 e();
    
    String f();
    
    String g();
}
