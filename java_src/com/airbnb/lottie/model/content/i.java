package com.airbnb.lottie.model.content;

import androidx.annotation.Nullable;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.animation.content.r;
/* compiled from: RoundedCorners.java */
/* loaded from: classes2.dex */
public class i implements c {

    /* renamed from: a  reason: collision with root package name */
    private final String f4024a;

    /* renamed from: b  reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.m<Float, Float> f4025b;

    public i(String str, com.airbnb.lottie.model.animatable.m<Float, Float> mVar) {
        this.f4024a = str;
        this.f4025b = mVar;
    }

    @Override // com.airbnb.lottie.model.content.c
    @Nullable
    public com.airbnb.lottie.animation.content.c a(LottieDrawable lottieDrawable, com.airbnb.lottie.model.layer.b bVar) {
        return new r(lottieDrawable, bVar, this);
    }

    public com.airbnb.lottie.model.animatable.m<Float, Float> b() {
        return this.f4025b;
    }

    public String c() {
        return this.f4024a;
    }
}
