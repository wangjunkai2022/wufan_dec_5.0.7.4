package com.airbnb.lottie.model.content;

import android.graphics.Path;
import androidx.annotation.Nullable;
import com.airbnb.lottie.LottieDrawable;
/* compiled from: GradientFill.java */
/* loaded from: classes2.dex */
public class e implements c {

    /* renamed from: a  reason: collision with root package name */
    private final GradientType f3991a;

    /* renamed from: b  reason: collision with root package name */
    private final Path.FillType f3992b;

    /* renamed from: c  reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.c f3993c;

    /* renamed from: d  reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.d f3994d;

    /* renamed from: e  reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.f f3995e;

    /* renamed from: f  reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.f f3996f;

    /* renamed from: g  reason: collision with root package name */
    private final String f3997g;
    @Nullable

    /* renamed from: h  reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.b f3998h;
    @Nullable

    /* renamed from: i  reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.b f3999i;

    /* renamed from: j  reason: collision with root package name */
    private final boolean f4000j;

    public e(String str, GradientType gradientType, Path.FillType fillType, com.airbnb.lottie.model.animatable.c cVar, com.airbnb.lottie.model.animatable.d dVar, com.airbnb.lottie.model.animatable.f fVar, com.airbnb.lottie.model.animatable.f fVar2, com.airbnb.lottie.model.animatable.b bVar, com.airbnb.lottie.model.animatable.b bVar2, boolean z4) {
        this.f3991a = gradientType;
        this.f3992b = fillType;
        this.f3993c = cVar;
        this.f3994d = dVar;
        this.f3995e = fVar;
        this.f3996f = fVar2;
        this.f3997g = str;
        this.f3998h = bVar;
        this.f3999i = bVar2;
        this.f4000j = z4;
    }

    @Override // com.airbnb.lottie.model.content.c
    public com.airbnb.lottie.animation.content.c a(LottieDrawable lottieDrawable, com.airbnb.lottie.model.layer.b bVar) {
        return new com.airbnb.lottie.animation.content.h(lottieDrawable, bVar, this);
    }

    public com.airbnb.lottie.model.animatable.f b() {
        return this.f3996f;
    }

    public Path.FillType c() {
        return this.f3992b;
    }

    public com.airbnb.lottie.model.animatable.c d() {
        return this.f3993c;
    }

    public GradientType e() {
        return this.f3991a;
    }

    public String f() {
        return this.f3997g;
    }

    public com.airbnb.lottie.model.animatable.d g() {
        return this.f3994d;
    }

    public com.airbnb.lottie.model.animatable.f h() {
        return this.f3995e;
    }

    public boolean i() {
        return this.f4000j;
    }
}
