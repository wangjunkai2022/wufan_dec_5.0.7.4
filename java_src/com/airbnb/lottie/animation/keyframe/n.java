package com.airbnb.lottie.animation.keyframe;

import android.graphics.PointF;
import androidx.annotation.Nullable;
import java.util.Collections;
/* compiled from: SplitDimensionPathKeyframeAnimation.java */
/* loaded from: classes2.dex */
public class n extends a<PointF, PointF> {

    /* renamed from: i  reason: collision with root package name */
    private final PointF f3803i;

    /* renamed from: j  reason: collision with root package name */
    private final PointF f3804j;

    /* renamed from: k  reason: collision with root package name */
    private final a<Float, Float> f3805k;

    /* renamed from: l  reason: collision with root package name */
    private final a<Float, Float> f3806l;
    @Nullable

    /* renamed from: m  reason: collision with root package name */
    protected com.airbnb.lottie.value.j<Float> f3807m;
    @Nullable

    /* renamed from: n  reason: collision with root package name */
    protected com.airbnb.lottie.value.j<Float> f3808n;

    public n(a<Float, Float> aVar, a<Float, Float> aVar2) {
        super(Collections.emptyList());
        this.f3803i = new PointF();
        this.f3804j = new PointF();
        this.f3805k = aVar;
        this.f3806l = aVar2;
        m(f());
    }

    @Override // com.airbnb.lottie.animation.keyframe.a
    public void m(float f5) {
        this.f3805k.m(f5);
        this.f3806l.m(f5);
        this.f3803i.set(this.f3805k.h().floatValue(), this.f3806l.h().floatValue());
        for (int i4 = 0; i4 < this.f3764a.size(); i4++) {
            this.f3764a.get(i4).a();
        }
    }

    @Override // com.airbnb.lottie.animation.keyframe.a
    /* renamed from: p */
    public PointF h() {
        return i(null, 0.0f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.airbnb.lottie.animation.keyframe.a
    /* renamed from: q */
    public PointF i(com.airbnb.lottie.value.a<PointF> aVar, float f5) {
        Float f6;
        com.airbnb.lottie.value.a<Float> b5;
        com.airbnb.lottie.value.a<Float> b6;
        Float f7 = null;
        if (this.f3807m == null || (b6 = this.f3805k.b()) == null) {
            f6 = null;
        } else {
            float d5 = this.f3805k.d();
            Float f8 = b6.f4343h;
            com.airbnb.lottie.value.j<Float> jVar = this.f3807m;
            float f9 = b6.f4342g;
            f6 = jVar.b(f9, f8 == null ? f9 : f8.floatValue(), b6.f4337b, b6.f4338c, f5, f5, d5);
        }
        if (this.f3808n != null && (b5 = this.f3806l.b()) != null) {
            float d6 = this.f3806l.d();
            Float f10 = b5.f4343h;
            com.airbnb.lottie.value.j<Float> jVar2 = this.f3808n;
            float f11 = b5.f4342g;
            f7 = jVar2.b(f11, f10 == null ? f11 : f10.floatValue(), b5.f4337b, b5.f4338c, f5, f5, d6);
        }
        if (f6 == null) {
            this.f3804j.set(this.f3803i.x, 0.0f);
        } else {
            this.f3804j.set(f6.floatValue(), 0.0f);
        }
        if (f7 == null) {
            PointF pointF = this.f3804j;
            pointF.set(pointF.x, this.f3803i.y);
        } else {
            PointF pointF2 = this.f3804j;
            pointF2.set(pointF2.x, f7.floatValue());
        }
        return this.f3804j;
    }

    public void r(@Nullable com.airbnb.lottie.value.j<Float> jVar) {
        com.airbnb.lottie.value.j<Float> jVar2 = this.f3807m;
        if (jVar2 != null) {
            jVar2.c(null);
        }
        this.f3807m = jVar;
        if (jVar != null) {
            jVar.c(this);
        }
    }

    public void s(@Nullable com.airbnb.lottie.value.j<Float> jVar) {
        com.airbnb.lottie.value.j<Float> jVar2 = this.f3808n;
        if (jVar2 != null) {
            jVar2.c(null);
        }
        this.f3808n = jVar;
        if (jVar != null) {
            jVar.c(this);
        }
    }
}
