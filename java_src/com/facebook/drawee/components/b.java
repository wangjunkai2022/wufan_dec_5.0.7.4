package com.facebook.drawee.components;
/* compiled from: RetryManager.java */
/* loaded from: classes2.dex */
public class b {

    /* renamed from: d  reason: collision with root package name */
    private static final int f11080d = 4;

    /* renamed from: a  reason: collision with root package name */
    private boolean f11081a;

    /* renamed from: b  reason: collision with root package name */
    private int f11082b;

    /* renamed from: c  reason: collision with root package name */
    private int f11083c;

    public b() {
        a();
    }

    public static b c() {
        return new b();
    }

    public void a() {
        this.f11081a = false;
        this.f11082b = 4;
        e();
    }

    public boolean b() {
        return this.f11081a;
    }

    public void d() {
        this.f11083c++;
    }

    public void e() {
        this.f11083c = 0;
    }

    public void f(int i4) {
        this.f11082b = i4;
    }

    public void g(boolean z4) {
        this.f11081a = z4;
    }

    public boolean h() {
        return this.f11081a && this.f11083c < this.f11082b;
    }
}
