package com.alipay.sdk.app;
/* loaded from: classes2.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static String f4713a;

    public static String a() {
        i a5 = i.a(i.CANCELED.a());
        return b(a5.a(), a5.b(), "");
    }

    public static String b(int i4, String str, String str2) {
        return "resultStatus={" + i4 + "};memo={" + str + "};result={" + str2 + "}";
    }

    private static void c(String str) {
        f4713a = str;
    }

    private static String d() {
        return f4713a;
    }

    private static String e() {
        i a5 = i.a(i.DOUBLE_REQUEST.a());
        return b(a5.a(), a5.b(), "");
    }

    private static String f() {
        i a5 = i.a(i.PARAMS_ERROR.a());
        return b(a5.a(), a5.b(), "");
    }
}
