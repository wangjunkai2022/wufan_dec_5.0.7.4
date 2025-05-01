package com.overmind.virtual.oem;

import android.os.Build;
/* loaded from: classes5.dex */
public class BuildCompat {

    /* renamed from: a  reason: collision with root package name */
    private static ROMType f57882a;

    /* loaded from: classes5.dex */
    public enum ROMType {
        EMUI,
        MIUI,
        FLYME,
        COLOR_OS,
        LETV,
        VIVO,
        _360,
        SAMSUNG,
        OTHER
    }

    public static int a() {
        if (Build.VERSION.SDK_INT >= 23) {
            try {
                return Build.VERSION.PREVIEW_SDK_INT;
            } catch (Throwable unused) {
                return 0;
            }
        }
        return 0;
    }

    public static ROMType b() {
        if (f57882a == null) {
            if (e()) {
                f57882a = ROMType.EMUI;
            } else if (h()) {
                f57882a = ROMType.MIUI;
            } else if (f()) {
                f57882a = ROMType.FLYME;
            } else if (d()) {
                f57882a = ROMType.COLOR_OS;
            } else if (c()) {
                f57882a = ROMType._360;
            } else if (g()) {
                f57882a = ROMType.LETV;
            } else if (o()) {
                f57882a = ROMType.VIVO;
            } else if (n()) {
                f57882a = ROMType.SAMSUNG;
            } else {
                f57882a = ROMType.OTHER;
            }
        }
        return f57882a;
    }

    public static boolean c() {
        String a5 = q2.a.a("ro.build.uiversion");
        return a5 != null && a5.toUpperCase().contains("360UI");
    }

    public static boolean d() {
        return q2.a.d("ro.build.version.opporom") || q2.a.d("ro.rom.different.version");
    }

    public static boolean e() {
        if (Build.DISPLAY.toUpperCase().startsWith("EMUI")) {
            return true;
        }
        String a5 = q2.a.a("ro.build.version.emui");
        return a5 != null && a5.contains("EmotionUI");
    }

    public static boolean f() {
        return Build.DISPLAY.toLowerCase().contains("flyme");
    }

    public static boolean g() {
        return Build.MANUFACTURER.equalsIgnoreCase("Letv");
    }

    public static boolean h() {
        return q2.a.c("ro.miui.ui.version.code", 0) > 0;
    }

    public static boolean i() {
        int i4 = Build.VERSION.SDK_INT;
        return i4 > 25 || (i4 == 25 && a() > 0);
    }

    public static boolean j() {
        int i4 = Build.VERSION.SDK_INT;
        return i4 > 27 || (i4 == 27 && a() > 0);
    }

    public static boolean k() {
        int i4 = Build.VERSION.SDK_INT;
        return i4 > 28 || (i4 == 28 && a() > 0);
    }

    public static boolean l() {
        int i4 = Build.VERSION.SDK_INT;
        return i4 > 29 || (i4 == 29 && a() > 0);
    }

    public static boolean m() {
        int i4 = Build.VERSION.SDK_INT;
        return i4 > 30 || (i4 == 30 && a() > 0);
    }

    public static boolean n() {
        return "samsung".equalsIgnoreCase(Build.BRAND) || "samsung".equalsIgnoreCase(Build.MANUFACTURER);
    }

    public static boolean o() {
        return q2.a.d("ro.vivo.os.build.display.id");
    }
}
