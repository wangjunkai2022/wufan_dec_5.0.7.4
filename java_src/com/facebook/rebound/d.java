package com.facebook.rebound;
/* compiled from: BouncyConversion.java */
/* loaded from: classes2.dex */
public class d {

    /* renamed from: e  reason: collision with root package name */
    static final /* synthetic */ boolean f12574e = false;

    /* renamed from: a  reason: collision with root package name */
    private final double f12575a;

    /* renamed from: b  reason: collision with root package name */
    private final double f12576b;

    /* renamed from: c  reason: collision with root package name */
    private final double f12577c;

    /* renamed from: d  reason: collision with root package name */
    private final double f12578d;

    public d(double d5, double d6) {
        this.f12577c = d5;
        this.f12578d = d6;
        double k4 = k(j(d6 / 1.7d, 0.0d, 20.0d), 0.0d, 0.8d);
        double k5 = k(j(d5 / 1.7d, 0.0d, 20.0d), 0.5d, 200.0d);
        this.f12575a = k5;
        this.f12576b = l(k4, d(k5), 0.01d);
    }

    private double a(double d5) {
        return ((Math.pow(d5, 3.0d) * 7.0E-4d) - (Math.pow(d5, 2.0d) * 0.031d)) + (d5 * 0.64d) + 1.28d;
    }

    private double b(double d5) {
        return ((Math.pow(d5, 3.0d) * 4.4E-5d) - (Math.pow(d5, 2.0d) * 0.006d)) + (d5 * 0.36d) + 2.0d;
    }

    private double c(double d5) {
        return ((Math.pow(d5, 3.0d) * 4.5E-7d) - (Math.pow(d5, 2.0d) * 3.32E-4d)) + (d5 * 0.1078d) + 5.84d;
    }

    private double d(double d5) {
        if (d5 <= 18.0d) {
            return a(d5);
        }
        if (d5 <= 18.0d || d5 > 44.0d) {
            if (d5 > 44.0d) {
                return c(d5);
            }
            return 0.0d;
        }
        return b(d5);
    }

    private double i(double d5, double d6, double d7) {
        return (d7 * d5) + ((1.0d - d5) * d6);
    }

    private double j(double d5, double d6, double d7) {
        return (d5 - d6) / (d7 - d6);
    }

    private double k(double d5, double d6, double d7) {
        return d6 + (d5 * (d7 - d6));
    }

    private double l(double d5, double d6, double d7) {
        return i((2.0d * d5) - (d5 * d5), d6, d7);
    }

    public double e() {
        return this.f12578d;
    }

    public double f() {
        return this.f12576b;
    }

    public double g() {
        return this.f12575a;
    }

    public double h() {
        return this.f12577c;
    }
}
