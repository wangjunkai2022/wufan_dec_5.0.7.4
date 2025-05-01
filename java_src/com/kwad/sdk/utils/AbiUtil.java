package com.kwad.sdk.utils;

import android.content.Context;
import android.os.Build;
import android.os.Process;
/* loaded from: classes5.dex */
public final class AbiUtil {
    private static Abi aPg;

    /* loaded from: classes5.dex */
    public enum Abi {
        UNKNOWN,
        ARMEABI_V7A,
        ARM64_V8A
    }

    public static String bQ(Context context) {
        return isArm64(context) ? "arm64-v8a" : "armeabi-v7a";
    }

    private static Abi bR(Context context) {
        Abi abi = aPg;
        if (abi != null) {
            return abi;
        }
        int i4 = Build.VERSION.SDK_INT;
        if (i4 < 21) {
            aPg = Abi.ARMEABI_V7A;
        } else if (i4 >= 23) {
            aPg = Process.is64Bit() ? Abi.ARM64_V8A : Abi.ARMEABI_V7A;
        } else if (i4 >= 21) {
            try {
                aPg = ((Boolean) s.callMethod(s.a("dalvik.system.VMRuntime", "getRuntime", new Object[0]), "is64Bit", new Object[0])).booleanValue() ? Abi.ARM64_V8A : Abi.ARMEABI_V7A;
            } catch (Throwable th) {
                th.printStackTrace();
                try {
                    if (context.getApplicationInfo().nativeLibraryDir.contains("arm64")) {
                        aPg = Abi.ARM64_V8A;
                    } else {
                        aPg = Abi.UNKNOWN;
                    }
                } catch (Throwable th2) {
                    th2.printStackTrace();
                    aPg = Abi.UNKNOWN;
                }
            }
        }
        return aPg;
    }

    public static boolean isArm64(Context context) {
        return bR(context) == Abi.ARM64_V8A;
    }
}
