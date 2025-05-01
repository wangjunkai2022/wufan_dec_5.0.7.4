package com.xinzhu.overmind.utils;

import android.os.Build;
import com.ss.android.download.api.constant.BaseConstants;
/* compiled from: BuildInfo.java */
/* loaded from: classes.dex */
public final class e {
    public static boolean a() {
        return z(21);
    }

    public static boolean b() {
        return z(22);
    }

    public static boolean c() {
        return z(23);
    }

    public static boolean d() {
        return z(24);
    }

    public static boolean e() {
        return z(25);
    }

    public static boolean f() {
        return z(29);
    }

    public static boolean g() {
        return z(30);
    }

    public static boolean h() {
        return z(31);
    }

    public static boolean i() {
        return z(32);
    }

    public static boolean j() {
        return z(33);
    }

    public static boolean k() {
        return z(34);
    }

    private static int l() {
        if (Build.VERSION.SDK_INT >= 23) {
            return Build.VERSION.PREVIEW_SDK_INT;
        }
        return 0;
    }

    public static boolean m() {
        throw new RuntimeException("TODO");
    }

    public static boolean n() {
        return Build.BRAND.trim().toUpperCase().contains(BaseConstants.ROM_OPPO_UPPER_CONSTANT);
    }

    public static boolean o() {
        String b5 = com.xinzhu.overmind.utils.helpers.m.b("ro.build.version.emui", null);
        return b5 != null && b5.contains("EmotionUI");
    }

    public static boolean p() {
        try {
            return com.xinzhu.haunted.meizu.security.a.f67423b != null;
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean q() {
        try {
            Class<?> cls = Class.forName("com.huawei.system.BuildEx");
            return "harmony".equalsIgnoreCase(cls.getMethod("getOsBrand", new Class[0]).invoke(cls, new Object[0]).toString());
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean r() {
        throw new RuntimeException("TODO");
    }

    public static boolean s() {
        return com.xinzhu.overmind.utils.helpers.m.b("ro.miui.ui.version.name", null) != null;
    }

    public static boolean t() {
        return Build.BRAND.equalsIgnoreCase("samsung") || Build.MANUFACTURER.equalsIgnoreCase("samsung");
    }

    public static boolean u() {
        return y();
    }

    public static boolean v() {
        String b5 = com.xinzhu.overmind.utils.helpers.m.b("ro.vivo.os.build.display.id", null);
        return (b5 == null || b5.isEmpty()) ? false : true;
    }

    public static boolean w() {
        return z(26);
    }

    public static boolean x() {
        return z(27);
    }

    public static boolean y() {
        return z(28);
    }

    private static boolean z(int i4) {
        int i5 = Build.VERSION.SDK_INT;
        if (i5 < i4) {
            return i5 == i4 - 1 && l() > 0;
        }
        return true;
    }
}
