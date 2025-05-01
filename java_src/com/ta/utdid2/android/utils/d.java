package com.ta.utdid2.android.utils;

import java.lang.reflect.Method;
/* loaded from: classes5.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    private static final String f62049a = "alidebug";

    /* renamed from: b  reason: collision with root package name */
    public static boolean f62050b;

    /* renamed from: c  reason: collision with root package name */
    private static Class<?> f62051c;

    /* renamed from: d  reason: collision with root package name */
    private static Method f62052d;

    /* renamed from: e  reason: collision with root package name */
    private static Method f62053e;

    static {
        f62050b = b(f62049a, 0) == 1;
        f62051c = null;
        f62052d = null;
        f62053e = null;
    }

    public static String a(String str) {
        c();
        try {
            return (String) f62052d.invoke(f62051c, str);
        } catch (Exception e5) {
            e5.printStackTrace();
            return null;
        }
    }

    public static int b(String str, int i4) {
        c();
        try {
            return ((Integer) f62053e.invoke(f62051c, str, Integer.valueOf(i4))).intValue();
        } catch (Exception e5) {
            e5.printStackTrace();
            return i4;
        }
    }

    private static void c() {
        try {
            if (f62051c == null) {
                Class<?> cls = Class.forName("android.os.SystemProperties");
                f62051c = cls;
                f62052d = cls.getDeclaredMethod("get", String.class);
                f62053e = f62051c.getDeclaredMethod("getInt", String.class, Integer.TYPE);
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }
}
