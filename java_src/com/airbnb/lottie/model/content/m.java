package com.airbnb.lottie.model.content;

import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.animation.content.s;
/* compiled from: ShapePath.java */
/* loaded from: classes2.dex */
public class m implements c {

    /* renamed from: a  reason: collision with root package name */
    private final String f4038a;

    /* renamed from: b  reason: collision with root package name */
    private final int f4039b;

    /* renamed from: c  reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.h f4040c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f4041d;

    public m(String str, int i4, com.airbnb.lottie.model.animatable.h hVar, boolean z4) {
        this.f4038a = str;
        this.f4039b = i4;
        this.f4040c = hVar;
        this.f4041d = z4;
    }

    @Override // com.airbnb.lottie.model.content.c
    public com.airbnb.lottie.animation.content.c a(LottieDrawable lottieDrawable, com.airbnb.lottie.model.layer.b bVar) {
        return new s(lottieDrawable, bVar, this);
    }

    public String b() {
        return this.f4038a;
    }

    public com.airbnb.lottie.model.animatable.h c() {
        return this.f4040c;
    }

    public boolean d() {
        return this.f4041d;
    }

    public String toString() {
        return "ShapePath{name=" + this.f4038a + ", index=" + this.f4039b + '}';
    }
}
