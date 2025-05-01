package com.airbnb.lottie.model.content;

import android.graphics.PointF;
import com.airbnb.lottie.LottieDrawable;
/* compiled from: CircleShape.java */
/* loaded from: classes2.dex */
public class b implements c {

    /* renamed from: a  reason: collision with root package name */
    private final String f3984a;

    /* renamed from: b  reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.m<PointF, PointF> f3985b;

    /* renamed from: c  reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.f f3986c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f3987d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f3988e;

    public b(String str, com.airbnb.lottie.model.animatable.m<PointF, PointF> mVar, com.airbnb.lottie.model.animatable.f fVar, boolean z4, boolean z5) {
        this.f3984a = str;
        this.f3985b = mVar;
        this.f3986c = fVar;
        this.f3987d = z4;
        this.f3988e = z5;
    }

    @Override // com.airbnb.lottie.model.content.c
    public com.airbnb.lottie.animation.content.c a(LottieDrawable lottieDrawable, com.airbnb.lottie.model.layer.b bVar) {
        return new com.airbnb.lottie.animation.content.f(lottieDrawable, bVar, this);
    }

    public String b() {
        return this.f3984a;
    }

    public com.airbnb.lottie.model.animatable.m<PointF, PointF> c() {
        return this.f3985b;
    }

    public com.airbnb.lottie.model.animatable.f d() {
        return this.f3986c;
    }

    public boolean e() {
        return this.f3988e;
    }

    public boolean f() {
        return this.f3987d;
    }
}
