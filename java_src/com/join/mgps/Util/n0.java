package com.join.mgps.Util;

import android.view.animation.Interpolator;
/* compiled from: HomeAnimInterpolator.java */
/* loaded from: classes3.dex */
public class n0 implements Interpolator {

    /* renamed from: a  reason: collision with root package name */
    float f27947a;

    public n0() {
        this.f27947a = 0.7f;
    }

    private static float a(float f5) {
        return f5 * f5 * 8.0f;
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f5) {
        double pow = Math.pow(2.0d, (-10.0f) * f5);
        double d5 = f5 - 0.1f;
        Double.isNaN(d5);
        double d6 = 0.4f;
        Double.isNaN(d6);
        return (float) ((pow * Math.sin((d5 * 6.283185307179586d) / d6)) + 1.0d);
    }

    public n0(float f5) {
        this.f27947a = 0.7f;
        this.f27947a = f5;
    }
}
