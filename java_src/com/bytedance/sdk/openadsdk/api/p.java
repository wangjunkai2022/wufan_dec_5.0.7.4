package com.bytedance.sdk.openadsdk.api;
/* loaded from: classes2.dex */
public class p {

    /* renamed from: m  reason: collision with root package name */
    private static int f8703m = 4;
    private static boolean vv;

    public static void i(String str, String str2) {
    }

    public static void m(String str, String str2) {
    }

    public static void m(String str, String str2, Throwable th) {
    }

    public static void m(String str, Object... objArr) {
        if (vv && objArr != null && f8703m <= 5) {
            vv(objArr);
        }
    }

    public static void o(String str, String str2) {
    }

    public static void p(String str, String str2) {
    }

    public static void p(String str, String str2, Throwable th) {
    }

    public static void vv(int i4) {
        f8703m = i4;
    }

    public static void vv(String str, String str2) {
    }

    public static void vv(String str, String str2, Throwable th) {
    }

    public static void vv() {
        vv = true;
        vv(3);
    }

    public static void vv(String str, Object... objArr) {
        if (vv && objArr != null && f8703m <= 3) {
            vv(objArr);
        }
    }

    public static void vv(String str) {
        if (vv) {
            i("TTLogger", str);
        }
    }

    private static String vv(Object... objArr) {
        if (objArr == null || objArr.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (Object obj : objArr) {
            if (obj != null) {
                sb.append(obj.toString());
            } else {
                sb.append(" null ");
            }
            sb.append(" ");
        }
        return sb.toString();
    }
}
