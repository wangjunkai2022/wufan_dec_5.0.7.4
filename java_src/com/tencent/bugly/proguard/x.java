package com.tencent.bugly.proguard;

import java.util.Locale;
/* compiled from: BUGLY */
/* loaded from: classes5.dex */
public final class x {

    /* renamed from: a  reason: collision with root package name */
    public static String f62732a = "CrashReport";

    /* renamed from: b  reason: collision with root package name */
    public static boolean f62733b = false;

    /* renamed from: c  reason: collision with root package name */
    private static String f62734c = "CrashReportInfo";

    private static boolean a(int i4, String str, Object... objArr) {
        if (f62733b) {
            if (str != null && objArr != null && objArr.length != 0) {
                String.format(Locale.US, str, objArr);
            }
            return i4 == 0 || i4 == 1 || i4 == 2 || i4 == 3 || i4 == 5;
        }
        return false;
    }

    public static boolean b(String str, Object... objArr) {
        return a(5, str, objArr);
    }

    public static boolean c(String str, Object... objArr) {
        return a(1, str, objArr);
    }

    public static boolean d(String str, Object... objArr) {
        return a(2, str, objArr);
    }

    public static boolean e(String str, Object... objArr) {
        return a(3, str, objArr);
    }

    public static boolean b(Class cls, String str, Object... objArr) {
        return a(1, String.format(Locale.US, "[%s] %s", cls.getSimpleName(), str), objArr);
    }

    public static boolean a(String str, Object... objArr) {
        return a(0, str, objArr);
    }

    public static boolean a(Class cls, String str, Object... objArr) {
        return a(0, String.format(Locale.US, "[%s] %s", cls.getSimpleName(), str), objArr);
    }

    public static boolean b(Throwable th) {
        if (f62733b) {
            return a(3, z.a(th), new Object[0]);
        }
        return false;
    }

    public static boolean a(Throwable th) {
        if (f62733b) {
            return a(2, z.a(th), new Object[0]);
        }
        return false;
    }
}
