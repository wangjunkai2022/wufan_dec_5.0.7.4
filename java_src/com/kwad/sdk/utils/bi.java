package com.kwad.sdk.utils;

import android.annotation.SuppressLint;
import java.io.IOException;
/* loaded from: classes5.dex */
public final class bi {
    private static Class<?> aRp;

    private static <T> T a(String str, T t4, com.kwad.sdk.f.b<String, T> bVar) {
        String ha = ha(str);
        if (ha == null) {
            return t4;
        }
        try {
            return bVar.apply(ha);
        } catch (Throwable unused) {
            return t4;
        }
    }

    public static String get(String str) {
        Object k4 = k("get", str);
        if (k4 instanceof String) {
            return (String) k4;
        }
        return ha(str);
    }

    public static boolean getBoolean(String str, boolean z4) {
        Object k4 = k("getBoolean", str, Boolean.valueOf(z4));
        if (k4 instanceof Boolean) {
            return ((Boolean) k4).booleanValue();
        }
        return ((Boolean) a(str, Boolean.valueOf(z4), new com.kwad.sdk.f.b<String, Boolean>() { // from class: com.kwad.sdk.utils.bi.4
            private static Boolean he(String str2) {
                return Boolean.valueOf(Boolean.parseBoolean(str2));
            }

            @Override // com.kwad.sdk.f.b
            public final /* synthetic */ Boolean apply(String str2) {
                return he(str2);
            }
        })).booleanValue();
    }

    public static int getInt(String str, int i4) {
        Object k4 = k("getInt", str, Integer.valueOf(i4));
        if (k4 instanceof Integer) {
            return ((Integer) k4).intValue();
        }
        return ((Integer) a(str, Integer.valueOf(i4), new com.kwad.sdk.f.b<String, Integer>() { // from class: com.kwad.sdk.utils.bi.2
            private static Integer hc(String str2) {
                return Integer.valueOf(Integer.parseInt(str2));
            }

            @Override // com.kwad.sdk.f.b
            public final /* synthetic */ Integer apply(String str2) {
                return hc(str2);
            }
        })).intValue();
    }

    public static long getLong(String str, long j4) {
        Object k4 = k("getLong", str, Long.valueOf(j4));
        if (k4 instanceof Long) {
            return ((Long) k4).longValue();
        }
        return ((Long) a(str, Long.valueOf(j4), new com.kwad.sdk.f.b<String, Long>() { // from class: com.kwad.sdk.utils.bi.3
            private static Long hd(String str2) {
                return Long.valueOf(Long.parseLong(str2));
            }

            @Override // com.kwad.sdk.f.b
            public final /* synthetic */ Long apply(String str2) {
                return hd(str2);
            }
        })).longValue();
    }

    private static String ha(String str) {
        try {
            Runtime runtime = Runtime.getRuntime();
            return com.kwad.sdk.crash.utils.h.c(runtime.exec("getprop " + str).getInputStream());
        } catch (IOException e5) {
            com.kwad.sdk.core.e.c.printStackTrace(e5);
            return null;
        }
    }

    @SuppressLint({"PrivateApi"})
    private static Object k(String str, Object... objArr) {
        try {
            if (aRp == null) {
                aRp = Class.forName("android.os.SystemProperties");
            }
            return s.b(aRp, str, objArr);
        } catch (Throwable th) {
            com.kwad.sdk.core.e.c.printStackTrace(th);
            return null;
        }
    }

    public static String get(String str, String str2) {
        Object k4 = k("get", str, str2);
        if (k4 instanceof String) {
            return (String) k4;
        }
        return (String) a(str, str2, new com.kwad.sdk.f.b<String, String>() { // from class: com.kwad.sdk.utils.bi.1
            private static String hb(String str3) {
                return str3;
            }

            @Override // com.kwad.sdk.f.b
            public final /* synthetic */ String apply(String str3) {
                return hb(str3);
            }
        });
    }
}
