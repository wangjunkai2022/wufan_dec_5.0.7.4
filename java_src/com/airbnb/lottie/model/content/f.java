package com.airbnb.lottie.model.content;

import androidx.annotation.Nullable;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.content.ShapeStroke;
import java.util.List;
/* compiled from: GradientStroke.java */
/* loaded from: classes2.dex */
public class f implements c {

    /* renamed from: a  reason: collision with root package name */
    private final String f4001a;

    /* renamed from: b  reason: collision with root package name */
    private final GradientType f4002b;

    /* renamed from: c  reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.c f4003c;

    /* renamed from: d  reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.d f4004d;

    /* renamed from: e  reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.f f4005e;

    /* renamed from: f  reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.f f4006f;

    /* renamed from: g  reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.b f4007g;

    /* renamed from: h  reason: collision with root package name */
    private final ShapeStroke.LineCapType f4008h;

    /* renamed from: i  reason: collision with root package name */
    private final ShapeStroke.LineJoinType f4009i;

    /* renamed from: j  reason: collision with root package name */
    private final float f4010j;

    /* renamed from: k  reason: collision with root package name */
    private final List<com.airbnb.lottie.model.animatable.b> f4011k;
    @Nullable

    /* renamed from: l  reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.b f4012l;

    /* renamed from: m  reason: collision with root package name */
    private final boolean f4013m;

    public f(String str, GradientType gradientType, com.airbnb.lottie.model.animatable.c cVar, com.airbnb.lottie.model.animatable.d dVar, com.airbnb.lottie.model.animatable.f fVar, com.airbnb.lottie.model.animatable.f fVar2, com.airbnb.lottie.model.animatable.b bVar, ShapeStroke.LineCapType lineCapType, ShapeStroke.LineJoinType lineJoinType, float f5, List<com.airbnb.lottie.model.animatable.b> list, @Nullable com.airbnb.lottie.model.animatable.b bVar2, boolean z4) {
        this.f4001a = str;
        this.f4002b = gradientType;
        this.f4003c = cVar;
        this.f4004d = dVar;
        this.f4005e = fVar;
        this.f4006f = fVar2;
        this.f4007g = bVar;
        this.f4008h = lineCapType;
        this.f4009i = lineJoinType;
        this.f4010j = f5;
        this.f4011k = list;
        this.f4012l = bVar2;
        this.f4013m = z4;
    }

    @Override // com.airbnb.lottie.model.content.c
    public com.airbnb.lottie.animation.content.c a(LottieDrawable lottieDrawable, com.airbnb.lottie.model.layer.b bVar) {
        return new com.airbnb.lottie.animation.content.i(lottieDrawable, bVar, this);
    }

    public ShapeStroke.LineCapType b() {
        return this.f4008h;
    }

    @Nullable
    public com.airbnb.lottie.model.animatable.b c() {
        return this.f4012l;
    }

    public com.airbnb.lottie.model.animatable.f d() {
        return this.f4006f;
    }

    public com.airbnb.lottie.model.animatable.c e() {
        return this.f4003c;
    }

    public GradientType f() {
        return this.f4002b;
    }

    public ShapeStroke.LineJoinType g() {
        return this.f4009i;
    }

    public List<com.airbnb.lottie.model.animatable.b> h() {
        return this.f4011k;
    }

    public float i() {
        return this.f4010j;
    }

    public String j() {
        return this.f4001a;
    }

    public com.airbnb.lottie.model.animatable.d k() {
        return this.f4004d;
    }

    public com.airbnb.lottie.model.animatable.f l() {
        return this.f4005e;
    }

    public com.airbnb.lottie.model.animatable.b m() {
        return this.f4007g;
    }

    public boolean n() {
        return this.f4013m;
    }
}
