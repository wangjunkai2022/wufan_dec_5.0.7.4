package com.airbnb.lottie.value;
/* compiled from: ScaleXY.java */
/* loaded from: classes2.dex */
public class k {

    /* renamed from: a  reason: collision with root package name */
    private float f4367a;

    /* renamed from: b  reason: collision with root package name */
    private float f4368b;

    public k(float f5, float f6) {
        this.f4367a = f5;
        this.f4368b = f6;
    }

    public boolean a(float f5, float f6) {
        return this.f4367a == f5 && this.f4368b == f6;
    }

    public float b() {
        return this.f4367a;
    }

    public float c() {
        return this.f4368b;
    }

    public void d(float f5, float f6) {
        this.f4367a = f5;
        this.f4368b = f6;
    }

    public String toString() {
        return b() + "x" + c();
    }

    public k() {
        this(1.0f, 1.0f);
    }
}
