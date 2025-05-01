package com.airbnb.lottie.animation.keyframe;

import android.graphics.Color;
import android.graphics.Paint;
import androidx.annotation.Nullable;
import com.airbnb.lottie.animation.keyframe.a;
/* compiled from: DropShadowKeyframeAnimation.java */
/* loaded from: classes2.dex */
public class c implements a.b {

    /* renamed from: h  reason: collision with root package name */
    private static final double f3778h = 0.017453292519943295d;

    /* renamed from: a  reason: collision with root package name */
    private final a.b f3779a;

    /* renamed from: b  reason: collision with root package name */
    private final com.airbnb.lottie.animation.keyframe.a<Integer, Integer> f3780b;

    /* renamed from: c  reason: collision with root package name */
    private final com.airbnb.lottie.animation.keyframe.a<Float, Float> f3781c;

    /* renamed from: d  reason: collision with root package name */
    private final com.airbnb.lottie.animation.keyframe.a<Float, Float> f3782d;

    /* renamed from: e  reason: collision with root package name */
    private final com.airbnb.lottie.animation.keyframe.a<Float, Float> f3783e;

    /* renamed from: f  reason: collision with root package name */
    private final com.airbnb.lottie.animation.keyframe.a<Float, Float> f3784f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f3785g = true;

    /* compiled from: DropShadowKeyframeAnimation.java */
    /* loaded from: classes2.dex */
    class a extends com.airbnb.lottie.value.j<Float> {

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ com.airbnb.lottie.value.j f3786d;

        a(com.airbnb.lottie.value.j jVar) {
            this.f3786d = jVar;
        }

        @Override // com.airbnb.lottie.value.j
        @Nullable
        /* renamed from: e */
        public Float a(com.airbnb.lottie.value.b<Float> bVar) {
            Float f5 = (Float) this.f3786d.a(bVar);
            if (f5 == null) {
                return null;
            }
            return Float.valueOf(f5.floatValue() * 2.55f);
        }
    }

    public c(a.b bVar, com.airbnb.lottie.model.layer.b bVar2, com.airbnb.lottie.parser.j jVar) {
        this.f3779a = bVar;
        com.airbnb.lottie.animation.keyframe.a<Integer, Integer> a5 = jVar.a().a();
        this.f3780b = a5;
        a5.a(this);
        bVar2.i(a5);
        com.airbnb.lottie.animation.keyframe.a<Float, Float> a6 = jVar.d().a();
        this.f3781c = a6;
        a6.a(this);
        bVar2.i(a6);
        com.airbnb.lottie.animation.keyframe.a<Float, Float> a7 = jVar.b().a();
        this.f3782d = a7;
        a7.a(this);
        bVar2.i(a7);
        com.airbnb.lottie.animation.keyframe.a<Float, Float> a8 = jVar.c().a();
        this.f3783e = a8;
        a8.a(this);
        bVar2.i(a8);
        com.airbnb.lottie.animation.keyframe.a<Float, Float> a9 = jVar.e().a();
        this.f3784f = a9;
        a9.a(this);
        bVar2.i(a9);
    }

    @Override // com.airbnb.lottie.animation.keyframe.a.b
    public void a() {
        this.f3785g = true;
        this.f3779a.a();
    }

    public void b(Paint paint) {
        if (this.f3785g) {
            this.f3785g = false;
            double floatValue = this.f3782d.h().floatValue();
            Double.isNaN(floatValue);
            double d5 = floatValue * f3778h;
            float floatValue2 = this.f3783e.h().floatValue();
            float sin = ((float) Math.sin(d5)) * floatValue2;
            float cos = ((float) Math.cos(d5 + 3.141592653589793d)) * floatValue2;
            int intValue = this.f3780b.h().intValue();
            paint.setShadowLayer(this.f3784f.h().floatValue(), sin, cos, Color.argb(Math.round(this.f3781c.h().floatValue()), Color.red(intValue), Color.green(intValue), Color.blue(intValue)));
        }
    }

    public void c(@Nullable com.airbnb.lottie.value.j<Integer> jVar) {
        this.f3780b.n(jVar);
    }

    public void d(@Nullable com.airbnb.lottie.value.j<Float> jVar) {
        this.f3782d.n(jVar);
    }

    public void e(@Nullable com.airbnb.lottie.value.j<Float> jVar) {
        this.f3783e.n(jVar);
    }

    public void f(@Nullable com.airbnb.lottie.value.j<Float> jVar) {
        if (jVar == null) {
            this.f3781c.n(null);
        } else {
            this.f3781c.n(new a(jVar));
        }
    }

    public void g(@Nullable com.airbnb.lottie.value.j<Float> jVar) {
        this.f3784f.n(jVar);
    }
}
