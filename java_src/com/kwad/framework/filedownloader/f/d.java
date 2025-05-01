package com.kwad.framework.filedownloader.f;

import android.util.Log;
/* loaded from: classes5.dex */
public final class d {
    public static boolean ajb;

    public static void a(Object obj, Throwable th, String str, Object... objArr) {
        a(6, obj, th, str, objArr);
    }

    public static void b(Object obj, String str, Object... objArr) {
        a(4, obj, str, objArr);
    }

    public static void c(Object obj, String str, Object... objArr) {
        a(3, obj, str, objArr);
    }

    public static void d(Object obj, String str, Object... objArr) {
        a(5, obj, str, objArr);
    }

    public static void e(Object obj, String str, Object... objArr) {
        a(2, obj, str, objArr);
    }

    private static String f(Object obj) {
        StringBuilder sb = new StringBuilder("FileDownloader.");
        sb.append((obj instanceof Class ? (Class) obj : obj.getClass()).getSimpleName());
        return sb.toString();
    }

    public static void a(Object obj, String str, Object... objArr) {
        a(6, obj, str, objArr);
    }

    private static void a(int i4, Object obj, String str, Object... objArr) {
        a(i4, obj, null, str, objArr);
    }

    private static void a(int i4, Object obj, Throwable th, String str, Object... objArr) {
        if ((i4 >= 5) || ajb) {
            Log.println(i4, f(obj), f.b(str, objArr));
            if (th != null) {
                th.printStackTrace();
            }
        }
    }
}
