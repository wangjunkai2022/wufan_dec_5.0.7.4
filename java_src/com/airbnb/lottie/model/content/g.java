package com.airbnb.lottie.model.content;

import android.graphics.PointF;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.animation.content.p;
/* compiled from: RectangleShape.java */
/* loaded from: classes2.dex */
public class g implements c {

    /* renamed from: a  reason: collision with root package name */
    private final String f4014a;

    /* renamed from: b  reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.m<PointF, PointF> f4015b;

    /* renamed from: c  reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.m<PointF, PointF> f4016c;

    /* renamed from: d  reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.b f4017d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f4018e;

    public g(String str, com.airbnb.lottie.model.animatable.m<PointF, PointF> mVar, com.airbnb.lottie.model.animatable.m<PointF, PointF> mVar2, com.airbnb.lottie.model.animatable.b bVar, boolean z4) {
        this.f4014a = str;
        this.f4015b = mVar;
        this.f4016c = mVar2;
        this.f4017d = bVar;
        this.f4018e = z4;
    }

    @Override // com.airbnb.lottie.model.content.c
    public com.airbnb.lottie.animation.content.c a(LottieDrawable lottieDrawable, com.airbnb.lottie.model.layer.b bVar) {
        return new p(lottieDrawable, bVar, this);
    }

    public com.airbnb.lottie.model.animatable.b b() {
        return this.f4017d;
    }

    public String c() {
        return this.f4014a;
    }

    public com.airbnb.lottie.model.animatable.m<PointF, PointF> d() {
        return this.f4015b;
    }

    public com.airbnb.lottie.model.animatable.m<PointF, PointF> e() {
        return this.f4016c;
    }

    public boolean f() {
        return this.f4018e;
    }

    public String toString() {
        return "RectangleShape{position=" + this.f4015b + ", size=" + this.f4016c + '}';
    }
}
