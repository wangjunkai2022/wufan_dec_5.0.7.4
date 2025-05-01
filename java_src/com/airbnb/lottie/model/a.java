package com.airbnb.lottie.model;

import android.annotation.SuppressLint;
import android.graphics.PointF;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
/* compiled from: CubicCurveData.java */
@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes2.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private final PointF f3916a;

    /* renamed from: b  reason: collision with root package name */
    private final PointF f3917b;

    /* renamed from: c  reason: collision with root package name */
    private final PointF f3918c;

    public a() {
        this.f3916a = new PointF();
        this.f3917b = new PointF();
        this.f3918c = new PointF();
    }

    public PointF a() {
        return this.f3916a;
    }

    public PointF b() {
        return this.f3917b;
    }

    public PointF c() {
        return this.f3918c;
    }

    public void d(float f5, float f6) {
        this.f3916a.set(f5, f6);
    }

    public void e(float f5, float f6) {
        this.f3917b.set(f5, f6);
    }

    public void f(a aVar) {
        PointF pointF = aVar.f3918c;
        g(pointF.x, pointF.y);
        PointF pointF2 = aVar.f3916a;
        d(pointF2.x, pointF2.y);
        PointF pointF3 = aVar.f3917b;
        e(pointF3.x, pointF3.y);
    }

    public void g(float f5, float f6) {
        this.f3918c.set(f5, f6);
    }

    @NonNull
    @SuppressLint({"DefaultLocale"})
    public String toString() {
        return String.format("v=%.2f,%.2f cp1=%.2f,%.2f cp2=%.2f,%.2f", Float.valueOf(this.f3918c.x), Float.valueOf(this.f3918c.y), Float.valueOf(this.f3916a.x), Float.valueOf(this.f3916a.y), Float.valueOf(this.f3917b.x), Float.valueOf(this.f3917b.y));
    }

    public a(PointF pointF, PointF pointF2, PointF pointF3) {
        this.f3916a = pointF;
        this.f3917b = pointF2;
        this.f3918c = pointF3;
    }
}
