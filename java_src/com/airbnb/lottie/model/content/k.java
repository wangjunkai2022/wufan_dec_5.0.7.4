package com.airbnb.lottie.model.content;

import android.graphics.Path;
import androidx.annotation.Nullable;
import com.airbnb.lottie.LottieDrawable;
/* compiled from: ShapeFill.java */
/* loaded from: classes2.dex */
public class k implements c {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f4029a;

    /* renamed from: b  reason: collision with root package name */
    private final Path.FillType f4030b;

    /* renamed from: c  reason: collision with root package name */
    private final String f4031c;
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.a f4032d;
    @Nullable

    /* renamed from: e  reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.d f4033e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f4034f;

    public k(String str, boolean z4, Path.FillType fillType, @Nullable com.airbnb.lottie.model.animatable.a aVar, @Nullable com.airbnb.lottie.model.animatable.d dVar, boolean z5) {
        this.f4031c = str;
        this.f4029a = z4;
        this.f4030b = fillType;
        this.f4032d = aVar;
        this.f4033e = dVar;
        this.f4034f = z5;
    }

    @Override // com.airbnb.lottie.model.content.c
    public com.airbnb.lottie.animation.content.c a(LottieDrawable lottieDrawable, com.airbnb.lottie.model.layer.b bVar) {
        return new com.airbnb.lottie.animation.content.g(lottieDrawable, bVar, this);
    }

    @Nullable
    public com.airbnb.lottie.model.animatable.a b() {
        return this.f4032d;
    }

    public Path.FillType c() {
        return this.f4030b;
    }

    public String d() {
        return this.f4031c;
    }

    @Nullable
    public com.airbnb.lottie.model.animatable.d e() {
        return this.f4033e;
    }

    public boolean f() {
        return this.f4034f;
    }

    public String toString() {
        return "ShapeFill{color=, fillEnabled=" + this.f4029a + '}';
    }
}
