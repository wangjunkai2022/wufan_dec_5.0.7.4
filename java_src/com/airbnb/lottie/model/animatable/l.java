package com.airbnb.lottie.model.animatable;

import android.graphics.PointF;
import androidx.annotation.Nullable;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.animation.keyframe.p;
/* compiled from: AnimatableTransform.java */
/* loaded from: classes2.dex */
public class l implements com.airbnb.lottie.animation.content.m, com.airbnb.lottie.model.content.c {
    @Nullable

    /* renamed from: a  reason: collision with root package name */
    private final e f3926a;
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    private final m<PointF, PointF> f3927b;
    @Nullable

    /* renamed from: c  reason: collision with root package name */
    private final g f3928c;
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    private final b f3929d;
    @Nullable

    /* renamed from: e  reason: collision with root package name */
    private final d f3930e;
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    private final b f3931f;
    @Nullable

    /* renamed from: g  reason: collision with root package name */
    private final b f3932g;
    @Nullable

    /* renamed from: h  reason: collision with root package name */
    private final b f3933h;
    @Nullable

    /* renamed from: i  reason: collision with root package name */
    private final b f3934i;

    public l() {
        this(null, null, null, null, null, null, null, null, null);
    }

    @Override // com.airbnb.lottie.model.content.c
    @Nullable
    public com.airbnb.lottie.animation.content.c a(LottieDrawable lottieDrawable, com.airbnb.lottie.model.layer.b bVar) {
        return null;
    }

    public p b() {
        return new p(this);
    }

    @Nullable
    public e c() {
        return this.f3926a;
    }

    @Nullable
    public b d() {
        return this.f3934i;
    }

    @Nullable
    public d e() {
        return this.f3930e;
    }

    @Nullable
    public m<PointF, PointF> f() {
        return this.f3927b;
    }

    @Nullable
    public b g() {
        return this.f3929d;
    }

    @Nullable
    public g h() {
        return this.f3928c;
    }

    @Nullable
    public b i() {
        return this.f3931f;
    }

    @Nullable
    public b j() {
        return this.f3932g;
    }

    @Nullable
    public b k() {
        return this.f3933h;
    }

    public l(@Nullable e eVar, @Nullable m<PointF, PointF> mVar, @Nullable g gVar, @Nullable b bVar, @Nullable d dVar, @Nullable b bVar2, @Nullable b bVar3, @Nullable b bVar4, @Nullable b bVar5) {
        this.f3926a = eVar;
        this.f3927b = mVar;
        this.f3928c = gVar;
        this.f3929d = bVar;
        this.f3930e = dVar;
        this.f3933h = bVar2;
        this.f3934i = bVar3;
        this.f3931f = bVar4;
        this.f3932g = bVar5;
    }
}
