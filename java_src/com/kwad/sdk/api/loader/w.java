package com.kwad.sdk.api.loader;

import android.os.Build;
import android.os.Process;
/* loaded from: classes5.dex */
final class w {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean is64Bit() {
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 23) {
            return Process.is64Bit();
        }
        if (i4 >= 21) {
            try {
                return ((Boolean) ApiReflect.cg("dalvik.system.VMRuntime").cj("getRuntime").cj("is64Bit").get()).booleanValue();
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
        return false;
    }

    public static String yp() {
        return is64Bit() ? "arm64-v8a" : "armeabi-v7a";
    }
}
