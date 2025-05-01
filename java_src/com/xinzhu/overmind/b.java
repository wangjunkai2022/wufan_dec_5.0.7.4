package com.xinzhu.overmind;

import android.util.Log;
/* compiled from: OLog.java */
/* loaded from: classes.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private static boolean f67445a = false;

    /* renamed from: b  reason: collision with root package name */
    public static final int f67446b = 2;

    /* renamed from: c  reason: collision with root package name */
    public static final int f67447c = 3;

    /* renamed from: d  reason: collision with root package name */
    public static final int f67448d = 4;

    /* renamed from: e  reason: collision with root package name */
    public static final int f67449e = 5;

    /* renamed from: f  reason: collision with root package name */
    public static final int f67450f = 6;

    /* renamed from: g  reason: collision with root package name */
    public static final int f67451g = 7;

    private b() {
    }

    public static int a(String str, String str2) {
        if (f67445a) {
            return Log.d(str, str2);
        }
        return 0;
    }

    public static int b(String str, String str2, Throwable th) {
        if (f67445a) {
            return Log.d(str, str2, th);
        }
        return 0;
    }

    public static int c(String str, String str2) {
        if (f67445a) {
            return Log.e(str, str2);
        }
        return 0;
    }

    public static int d(String str, String str2, Throwable th) {
        if (f67445a) {
            return Log.e(str, str2, th);
        }
        return 0;
    }

    public static String e(Throwable th) {
        return Log.getStackTraceString(th);
    }

    public static int f(String str, String str2) {
        if (f67445a) {
            return Log.i(str, str2);
        }
        return 0;
    }

    public static int g(String str, String str2, Throwable th) {
        if (f67445a) {
            return Log.i(str, str2, th);
        }
        return 0;
    }

    public static boolean h(String str, int i4) {
        return false;
    }

    public static int i(int i4, String str, String str2) {
        if (f67445a) {
            return Log.println(i4, str, str2);
        }
        return 0;
    }

    public static int j(String str, String str2) {
        if (f67445a) {
            return Log.v(str, str2);
        }
        return 0;
    }

    public static int k(String str, String str2, Throwable th) {
        if (f67445a) {
            return Log.v(str, str2, th);
        }
        return 0;
    }

    public static int l(String str, String str2) {
        if (f67445a) {
            return Log.w(str, str2);
        }
        return 0;
    }

    public static int m(String str, String str2, Throwable th) {
        if (f67445a) {
            return Log.w(str, str2, th);
        }
        return 0;
    }

    public static int n(String str, Throwable th) {
        if (f67445a) {
            return Log.w(str, th);
        }
        return 0;
    }

    public static int o(String str, String str2) {
        if (f67445a) {
            return Log.wtf(str, str2);
        }
        return 0;
    }

    public static int p(String str, String str2, Throwable th) {
        if (f67445a) {
            return Log.wtf(str, str2, th);
        }
        return 0;
    }

    public static int q(String str, Throwable th) {
        if (f67445a) {
            return Log.wtf(str, th);
        }
        return 0;
    }
}
