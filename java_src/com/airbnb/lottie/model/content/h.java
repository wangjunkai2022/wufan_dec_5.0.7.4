package com.airbnb.lottie.model.content;

import androidx.annotation.Nullable;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.animation.content.q;
/* compiled from: Repeater.java */
/* loaded from: classes2.dex */
public class h implements c {

    /* renamed from: a  reason: collision with root package name */
    private final String f4019a;

    /* renamed from: b  reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.b f4020b;

    /* renamed from: c  reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.b f4021c;

    /* renamed from: d  reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.l f4022d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f4023e;

    public h(String str, com.airbnb.lottie.model.animatable.b bVar, com.airbnb.lottie.model.animatable.b bVar2, com.airbnb.lottie.model.animatable.l lVar, boolean z4) {
        this.f4019a = str;
        this.f4020b = bVar;
        this.f4021c = bVar2;
        this.f4022d = lVar;
        this.f4023e = z4;
    }

    @Override // com.airbnb.lottie.model.content.c
    @Nullable
    public com.airbnb.lottie.animation.content.c a(LottieDrawable lottieDrawable, com.airbnb.lottie.model.layer.b bVar) {
        return new q(lottieDrawable, bVar, this);
    }

    public com.airbnb.lottie.model.animatable.b b() {
        return this.f4020b;
    }

    public String c() {
        return this.f4019a;
    }

    public com.airbnb.lottie.model.animatable.b d() {
        return this.f4021c;
    }

    public com.airbnb.lottie.model.animatable.l e() {
        return this.f4022d;
    }

    public boolean f() {
        return this.f4023e;
    }
}
