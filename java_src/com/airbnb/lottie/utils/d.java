package com.airbnb.lottie.utils;

import com.airbnb.lottie.q0;
/* compiled from: Logger.java */
/* loaded from: classes2.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    private static q0 f4305a = new c();

    public static void a(String str) {
        f4305a.debug(str);
    }

    public static void b(String str, Throwable th) {
        f4305a.debug(str, th);
    }

    public static void c(String str, Throwable th) {
        f4305a.error(str, th);
    }

    public static void d(q0 q0Var) {
        f4305a = q0Var;
    }

    public static void e(String str) {
        f4305a.a(str);
    }

    public static void f(String str, Throwable th) {
        f4305a.b(str, th);
    }
}
