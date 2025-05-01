package com.umeng.umzid;

import android.content.Context;
import android.os.Build;
/* loaded from: classes6.dex */
public class Spy {
    public static boolean initSuccess;

    static {
        try {
            System.loadLibrary("umeng-spy");
            initSuccess = true;
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static String getID() {
        if (initSuccess) {
            return getNativeID(Build.VERSION.SDK_INT >= 29);
        }
        return null;
    }

    public static native String getNativeID(boolean z4);

    public static native String getNativeLibraryVersion();

    public static native String getNativeTag(boolean z4, boolean z5, boolean z6);

    public static synchronized String getTag(Context context) {
        boolean j4;
        String nativeTag;
        synchronized (Spy.class) {
            if (context != null) {
                try {
                    j4 = d.j(context);
                } catch (Throwable th) {
                    throw th;
                }
            } else {
                j4 = false;
            }
            nativeTag = getNativeTag(j4, context != null ? d.i(context) : false, Build.VERSION.SDK_INT >= 29);
        }
        return nativeTag;
    }

    public static String getVersion() {
        if (initSuccess) {
            return getNativeLibraryVersion();
        }
        return null;
    }
}
