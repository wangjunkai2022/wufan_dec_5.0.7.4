package com.umeng.analytics.pro;

import android.os.Build;
import android.text.TextUtils;
/* compiled from: DeviceUtil.java */
/* loaded from: classes6.dex */
public class bk {

    /* renamed from: a  reason: collision with root package name */
    private static final String f63436a = "ro.build.version.emui";

    /* renamed from: b  reason: collision with root package name */
    private static final String f63437b = "hw_sc.build.platform.version";

    public static boolean a() {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return !TextUtils.isEmpty((String) cls.getMethod("get", String.class, String.class).invoke(cls, "ro.build.flyme.version", ""));
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean b() {
        return f() && !g();
    }

    public static boolean c() {
        return f() && g();
    }

    public static boolean d() {
        String str = Build.BRAND;
        if (!str.equalsIgnoreCase("huawei") && !str.equalsIgnoreCase("honor") && !str.equalsIgnoreCase("华为")) {
            String a5 = a(f63436a);
            String a6 = a(f63437b);
            if (TextUtils.isEmpty(a5) && TextUtils.isEmpty(a6)) {
                return false;
            }
        }
        return true;
    }

    public static boolean e() {
        return !TextUtils.isEmpty(a("ro.coolos.version"));
    }

    private static boolean f() {
        return Build.MANUFACTURER.equalsIgnoreCase("HONOR");
    }

    private static boolean g() {
        return !TextUtils.isEmpty(a(f63436a));
    }

    private static String a(String str) {
        try {
            return (String) Class.forName("android.os.SystemProperties").getDeclaredMethod("get", String.class).invoke(null, str);
        } catch (Throwable unused) {
            return "";
        }
    }
}
