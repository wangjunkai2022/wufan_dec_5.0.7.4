package com.facebook.rebound;
/* compiled from: SpringConfig.java */
/* loaded from: classes2.dex */
public class k {

    /* renamed from: c  reason: collision with root package name */
    public static k f12625c = b(40.0d, 7.0d);

    /* renamed from: a  reason: collision with root package name */
    public double f12626a;

    /* renamed from: b  reason: collision with root package name */
    public double f12627b;

    public k(double d5, double d6) {
        this.f12627b = d5;
        this.f12626a = d6;
    }

    public static k a(double d5, double d6) {
        d dVar = new d(d6, d5);
        return b(dVar.g(), dVar.f());
    }

    public static k b(double d5, double d6) {
        return new k(g.d(d5), g.a(d6));
    }
}
