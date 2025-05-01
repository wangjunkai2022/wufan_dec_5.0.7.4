package com.kwad.library.solder.lib.d;

import android.os.Build;
import android.os.Process;
import com.join.mgps.mod.utils.d;
import com.kwad.sdk.utils.s;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes5.dex */
public final class a {
    private static String alf;
    private static String alg;
    private static final Map<String, String> alh;

    static {
        HashMap hashMap = new HashMap();
        alh = hashMap;
        hashMap.put(d.f53623f, d.f53623f);
        hashMap.put("mips64", "mips64");
        hashMap.put(d.f53622e, d.f53622e);
        hashMap.put("x86_64", "x86_64");
        hashMap.put("arm64", "arm64-v8a");
    }

    private static boolean is64Bit() {
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 23) {
            return Process.is64Bit();
        }
        if (i4 >= 21) {
            Boolean bool = null;
            try {
                bool = (Boolean) s.callMethod(s.a("dalvik.system.VMRuntime", "getRuntime", new Object[0]), "is64Bit", new Object[0]);
            } catch (Exception e5) {
                e5.printStackTrace();
            }
            if (bool != null) {
                return bool.booleanValue();
            }
            return false;
        }
        return false;
    }

    public static String yp() {
        return is64Bit() ? "arm64-v8a" : "armeabi-v7a";
    }
}
