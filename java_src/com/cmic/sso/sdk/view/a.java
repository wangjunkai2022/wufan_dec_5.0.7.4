package com.cmic.sso.sdk.view;
/* compiled from: LoginProxy.java */
/* loaded from: classes2.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private static a f9449a;

    /* renamed from: b  reason: collision with root package name */
    private InterfaceC0239a f9450b;

    /* compiled from: LoginProxy.java */
    /* renamed from: com.cmic.sso.sdk.view.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public interface InterfaceC0239a {
        void a();
    }

    public static a a() {
        if (f9449a == null) {
            synchronized (a.class) {
                if (f9449a == null) {
                    f9449a = new a();
                }
            }
        }
        return f9449a;
    }

    public InterfaceC0239a b() {
        return this.f9450b;
    }

    public void c() {
        if (this.f9450b != null) {
            this.f9450b = null;
        }
    }

    public void a(InterfaceC0239a interfaceC0239a) {
        this.f9450b = interfaceC0239a;
    }
}
