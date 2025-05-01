package com.join.mgps.Util;

import java.util.MissingFormatArgumentException;
/* compiled from: Logger.java */
/* loaded from: classes.dex */
public class w0 {

    /* renamed from: a  reason: collision with root package name */
    private static final String f28138a = "WF";

    /* renamed from: b  reason: collision with root package name */
    private static boolean f28139b;

    public static void a(String str, Object... objArr) {
        try {
            if (f28139b) {
                String.format(str, objArr);
            }
        } catch (MissingFormatArgumentException unused) {
        }
    }

    public static void b(String str, Throwable th) {
    }

    public static void c(String str, Object... objArr) {
        try {
            if (f28139b) {
                String.format(str, objArr);
            }
        } catch (MissingFormatArgumentException unused) {
        }
    }

    public static void d(String str, Object... objArr) {
        try {
            if (f28139b) {
                String.format(str, objArr);
            }
        } catch (MissingFormatArgumentException unused) {
        }
    }

    public static void e(String... strArr) {
        if (f28139b) {
            String str = "";
            for (int i4 = 0; i4 < strArr.length; i4++) {
                str = str + " " + strArr[i4];
            }
        }
    }

    public static void f(String str, Object... objArr) {
        try {
            if (f28139b) {
                String.format(str, objArr);
            }
        } catch (MissingFormatArgumentException unused) {
        }
    }
}
