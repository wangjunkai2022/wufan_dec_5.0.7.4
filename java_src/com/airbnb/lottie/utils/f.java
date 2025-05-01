package com.airbnb.lottie.utils;
/* compiled from: MeanCalculator.java */
/* loaded from: classes2.dex */
public class f {

    /* renamed from: a  reason: collision with root package name */
    private float f4315a;

    /* renamed from: b  reason: collision with root package name */
    private int f4316b;

    public void a(float f5) {
        float f6 = this.f4315a + f5;
        this.f4315a = f6;
        int i4 = this.f4316b + 1;
        this.f4316b = i4;
        if (i4 == Integer.MAX_VALUE) {
            this.f4315a = f6 / 2.0f;
            this.f4316b = i4 / 2;
        }
    }

    public float b() {
        int i4 = this.f4316b;
        if (i4 == 0) {
            return 0.0f;
        }
        return this.f4315a / i4;
    }
}
