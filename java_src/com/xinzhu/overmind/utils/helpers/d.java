package com.xinzhu.overmind.utils.helpers;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
/* compiled from: BundleHelper.java */
/* loaded from: classes.dex */
public class d {
    public static IBinder a(Intent intent, String str) {
        Bundle bundleExtra = intent.getBundleExtra(str);
        if (bundleExtra != null) {
            return b(bundleExtra, "binder");
        }
        return null;
    }

    public static IBinder b(Bundle bundle, String str) {
        return bundle.getBinder(str);
    }

    public static void c(Intent intent, String str, IBinder iBinder) {
        Bundle bundle = new Bundle();
        d(bundle, "binder", iBinder);
        intent.putExtra(str, bundle);
    }

    public static void d(Bundle bundle, String str, IBinder iBinder) {
        bundle.putBinder(str, iBinder);
    }
}
