package com.kuaishou.weapon.p0;

import android.content.Context;
import android.os.Build;
import android.os.Process;
import dalvik.system.VMRuntime;
/* loaded from: classes5.dex */
public final class dm {

    /* renamed from: a  reason: collision with root package name */
    private static a f55557a;

    /* loaded from: classes5.dex */
    public enum a {
        UNKNOWN,
        ARMEABI_V7A,
        ARM64_V8A
    }

    private dm() {
    }

    public static String a(Context context) {
        return b(context) ? "arm64-v8a" : "armeabi-v7a";
    }

    public static boolean b(Context context) {
        return c(context) == a.ARM64_V8A;
    }

    private static a c(Context context) {
        a aVar = f55557a;
        if (aVar != null) {
            return aVar;
        }
        int i4 = Build.VERSION.SDK_INT;
        if (i4 < 21) {
            f55557a = a.ARMEABI_V7A;
        } else if (i4 >= 23) {
            f55557a = Process.is64Bit() ? a.ARM64_V8A : a.ARMEABI_V7A;
        } else if (i4 >= 21) {
            try {
                f55557a = ((Boolean) VMRuntime.class.getDeclaredMethod("is64Bit", new Class[0]).invoke(VMRuntime.class.getDeclaredMethod("getRuntime", new Class[0]).invoke(VMRuntime.class, new Object[0]), new Object[0])).booleanValue() ? a.ARM64_V8A : a.ARMEABI_V7A;
            } catch (Throwable th) {
                th.printStackTrace();
                try {
                    if (context.getApplicationInfo().nativeLibraryDir.contains("arm64")) {
                        f55557a = a.ARM64_V8A;
                    } else {
                        f55557a = a.UNKNOWN;
                    }
                } catch (Throwable th2) {
                    th2.printStackTrace();
                    f55557a = a.UNKNOWN;
                }
            }
        }
        return f55557a;
    }
}
