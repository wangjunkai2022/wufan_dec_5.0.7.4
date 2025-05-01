package org.aspectj.runtime.internal;

import java.util.Stack;
import org.aspectj.lang.NoAspectBoundException;
import org.aspectj.runtime.internal.cflowstack.g;
/* compiled from: CFlowStack.java */
/* loaded from: classes7.dex */
public class d {

    /* renamed from: b  reason: collision with root package name */
    private static org.aspectj.runtime.internal.cflowstack.d f72237b;

    /* renamed from: a  reason: collision with root package name */
    private org.aspectj.runtime.internal.cflowstack.c f72238a = f72237b.b();

    static {
        p();
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

    private Stack e() {
        return this.f72238a.a();
    }

    public static String f() {
        return f72237b.getClass().getName();
    }

    private static void p() {
        String b5 = b("aspectj.runtime.cflowstack.usethreadlocal", "unspecified");
        boolean z4 = false;
        if (!b5.equals("unspecified") ? b5.equals("yes") || b5.equals("true") : System.getProperty("java.class.version", "0.0").compareTo("46.0") >= 0) {
            z4 = true;
        }
        if (z4) {
            f72237b = c();
        } else {
            f72237b = d();
        }
    }

    public Object a(int i4) {
        b4.a i5 = i();
        if (i5 == null) {
            return null;
        }
        return i5.a(i4);
    }

    public boolean g() {
        return !e().isEmpty();
    }

    public Object h() {
        Stack e5 = e();
        if (!e5.isEmpty()) {
            return e5.peek();
        }
        throw new NoAspectBoundException();
    }

    public b4.a i() {
        Stack e5 = e();
        if (e5.isEmpty()) {
            return null;
        }
        return (b4.a) e5.peek();
    }

    public Object j() {
        b4.a i4 = i();
        if (i4 != null) {
            return i4.b();
        }
        throw new NoAspectBoundException();
    }

    public b4.a k() {
        Stack e5 = e();
        if (e5.isEmpty()) {
            return null;
        }
        return (b4.a) e5.elementAt(0);
    }

    public void l() {
        Stack e5 = e();
        e5.pop();
        if (e5.isEmpty()) {
            this.f72238a.b();
        }
    }

    public void m(Object obj) {
        e().push(obj);
    }

    public void n(Object[] objArr) {
        e().push(new c(objArr));
    }

    public void o(Object obj) {
        e().push(new b4.a(obj));
    }
}
