package com.swift.sandhook;

import android.util.Log;
/* loaded from: classes.dex */
public class HookLog {
    public static boolean DEBUG = SandHookConfig.DEBUG;
    public static final String TAG = "SandHook";

    public static int d(String str) {
        return Log.d(TAG, str);
    }

    public static int e(String str) {
        return Log.e(TAG, str);
    }

    public static int i(String str) {
        return Log.i(TAG, str);
    }

    public static int v(String str) {
        return Log.v(TAG, str);
    }

    public static int w(String str) {
        return Log.w(TAG, str);
    }

    public static int e(String str, Throwable th) {
        return Log.e(TAG, str, th);
    }
}
