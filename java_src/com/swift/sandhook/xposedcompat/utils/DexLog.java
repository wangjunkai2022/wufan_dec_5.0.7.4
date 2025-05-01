package com.swift.sandhook.xposedcompat.utils;

import android.util.Log;
import com.swift.sandhook.HookLog;
import java.lang.reflect.Member;
/* loaded from: classes.dex */
public class DexLog {
    public static boolean DEBUG = HookLog.DEBUG;
    public static final String TAG = "SandXposed";

    public static int d(String str) {
        return Log.d("SandXposed", str);
    }

    public static int e(String str) {
        return Log.e("SandXposed", str);
    }

    public static int i(String str) {
        return Log.i("SandXposed", str);
    }

    public static void printCallOriginError(Member member) {
        if (member != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("method <");
            sb.append(member.toString());
            sb.append("> call origin error!");
        }
    }

    public static void printMethodHookIn(Member member) {
        if (!DEBUG || member == null) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("method <");
        sb.append(member.toString());
        sb.append("> hook in");
    }

    public static int v(String str) {
        return Log.v("SandXposed", str);
    }

    public static int w(String str) {
        return Log.w("SandXposed", str);
    }

    public static int e(String str, Throwable th) {
        return Log.e("SandXposed", str, th);
    }
}
