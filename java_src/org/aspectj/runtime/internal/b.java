package org.aspectj.runtime.internal;

import org.aspectj.runtime.internal.cflowstack.g;
/* compiled from: CFlowCounter.java */
/* loaded from: classes7.dex */
public class b {

    /* renamed from: b  reason: collision with root package name */
    private static org.aspectj.runtime.internal.cflowstack.d f72220b;

    /* renamed from: a  reason: collision with root package name */
    private org.aspectj.runtime.internal.cflowstack.a f72221a = f72220b.a();

    static {
        h();
    }

    private static String b(String str, String str2) {
        try {
            return System.getProperty(str, str2);
        } catch (SecurityException unused) {
            return str2;
        }
    }

    private static org.aspectj.runtime.internal.cflowstack.d c() {
        return new org.aspectj.runtime.internal.cflowstack.f();
    }

    private static org.aspectj.runtime.internal.cflowstack.d d() {
        return new g();
    }

    public static String e() {
        return f72220b.getClass().getName();
    }

    private static void h() {
        String b5 = b("aspectj.runtime.cflowstack.usethreadlocal", "unspecified");
        boolean z4 = false;
        if (!b5.equals("unspecified") ? b5.equals("yes") || b5.equals("true") : System.getProperty("java.class.version", "0.0").compareTo("46.0") >= 0) {
            z4 = true;
        }
        if (z4) {
            f72220b = c();
        } else {
            f72220b = d();
        }
    }

    public void a() {
        this.f72221a.a();
        if (this.f72221a.d()) {
            return;
        }
        this.f72221a.b();
    }

    public void f() {
        this.f72221a.c();
    }

    public boolean g() {
        return this.f72221a.d();
    }
}
