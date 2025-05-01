package com.alipay.apmobilesecuritysdk.d;

import android.content.Context;
/* loaded from: classes2.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private static String f4644a = "";

    /* renamed from: b  reason: collision with root package name */
    private static volatile boolean f4645b;

    /* renamed from: c  reason: collision with root package name */
    private static Context f4646c;

    /* renamed from: d  reason: collision with root package name */
    private static a f4647d;

    private a() {
    }

    public static a a(Context context) {
        if (f4647d == null) {
            synchronized (a.class) {
                if (f4647d == null) {
                    f4647d = new a();
                    f4646c = context;
                }
            }
        }
        return f4647d;
    }

    public static String b() {
        com.alipay.security.mobile.module.commonutils.a.b(f4644a);
        return f4644a;
    }

    public static String c() {
        return f4644a;
    }
}
