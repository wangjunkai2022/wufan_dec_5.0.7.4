package com.alipay.apmobilesecuritysdk.e;

import android.content.Context;
/* loaded from: classes2.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    private static String f4657a = "";

    /* renamed from: b  reason: collision with root package name */
    private static String f4658b = "";

    public static synchronized String a() {
        String str;
        synchronized (f.class) {
            str = f4657a;
        }
        return str;
    }

    public static synchronized void b(b bVar) {
        synchronized (f.class) {
            if (bVar != null) {
                f4657a = bVar.f4648a;
                f4658b = bVar.f4650c;
            }
        }
    }

    public static synchronized boolean c(Context context) {
        synchronized (f.class) {
            try {
                if (Math.abs(System.currentTimeMillis() - e.c(context)) < 86400000) {
                    return true;
                }
            } finally {
                return false;
            }
            return false;
        }
    }

    public static synchronized String d() {
        String str;
        synchronized (f.class) {
            str = f4658b;
        }
        return str;
    }
}
