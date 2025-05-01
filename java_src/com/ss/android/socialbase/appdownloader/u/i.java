package com.ss.android.socialbase.appdownloader.u;

import android.content.Context;
import android.os.Process;
import android.provider.Settings;
import android.text.TextUtils;
import com.tencent.bugly.Bugly;
/* loaded from: classes5.dex */
public class i {

    /* renamed from: i  reason: collision with root package name */
    private static String f60884i;

    /* renamed from: m  reason: collision with root package name */
    private static String f60885m;

    /* renamed from: o  reason: collision with root package name */
    private static Boolean f60886o;

    /* renamed from: p  reason: collision with root package name */
    private static String f60887p;
    private static String vv;

    public static String i() {
        if (f60884i == null) {
            f60884i = vv("getBuildVersion");
        }
        return f60884i;
    }

    public static boolean m(Context context) {
        return context != null && i(context) == 0 && u();
    }

    public static String n() {
        try {
            Class<?> cls = Class.forName("com.huawei.system.BuildEx");
            return (String) cls.getMethod("getOsBrand", new Class[0]).invoke(cls, new Object[0]);
        } catch (Throwable unused) {
            return "";
        }
    }

    public static boolean o() {
        if (f60886o == null) {
            f60886o = Boolean.FALSE;
            try {
                f60886o = Boolean.valueOf("156".equals(vv("ro.config.hw_optb", "0")) && "true".equals(vv("hw_mc.pure_mode.enable", Bugly.SDK_IS_DEV)));
            } catch (Exception unused) {
            }
        }
        return f60886o.booleanValue();
    }

    public static String p() {
        if (f60887p == null) {
            f60887p = vv("getReleaseType");
        }
        return f60887p;
    }

    public static boolean u() {
        return o() && m(m(), vv()) && vv(Process.myUid()) == 0;
    }

    public static boolean vv(Context context) {
        return context != null && p(context) == 0 && o();
    }

    public static String m() {
        if (f60885m == null) {
            f60885m = vv("getVersion");
        }
        return f60885m;
    }

    public static String vv() {
        if (vv == null) {
            vv = vv("getApiVersion");
        }
        return vv;
    }

    public static int i(Context context) {
        return (context == null || Settings.Secure.getInt(context.getContentResolver(), "pure_enhanced_mode_state", 1) != 0) ? 1 : 0;
    }

    public static int p(Context context) {
        if (context != null) {
            if (m(m(), vv())) {
                return Settings.Secure.getInt(context.getContentResolver(), "pure_mode_state", 1) == 0 ? 0 : 1;
            }
            return Settings.Secure.getInt(context.getContentResolver(), "pure_mode_state", 0);
        }
        return 1;
    }

    private static boolean m(String str, String str2) {
        return !TextUtils.isEmpty(str2) && str.startsWith("3");
    }

    private static String vv(String str, String str2) {
        try {
            Class<?> cls = Class.forName("com.huawei.android.os.SystemPropertiesEx");
            return (String) cls.getMethod("get", String.class, String.class).invoke(cls, str, "unknown");
        } catch (Throwable unused) {
            return str2;
        }
    }

    private static int vv(int i4) {
        try {
            Class<?> cls = Class.forName("com.huawei.android.os.UserHandleEx");
            return ((Integer) cls.getMethod("getUserId", Integer.TYPE).invoke(cls, Integer.valueOf(i4))).intValue();
        } catch (Throwable th) {
            th.printStackTrace();
            return 1;
        }
    }

    private static String vv(String str) {
        try {
            Class<?> cls = Class.forName("ohos.system.version.SystemVersion");
            return cls.getMethod(str, new Class[0]).invoke(cls, new Object[0]).toString();
        } catch (Throwable unused) {
            return null;
        }
    }
}
