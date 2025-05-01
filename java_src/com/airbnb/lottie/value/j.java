package com.airbnb.lottie.value;

import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
/* compiled from: LottieValueCallback.java */
/* loaded from: classes2.dex */
public class j<T> {

    /* renamed from: a  reason: collision with root package name */
    private final b<T> f4364a;
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    private com.airbnb.lottie.animation.keyframe.a<?, ?> f4365b;
    @Nullable

    /* renamed from: c  reason: collision with root package name */
    protected T f4366c;

    public j() {
        this.f4364a = new b<>();
        this.f4366c = null;
    }

    @Nullable
    public T a(b<T> bVar) {
        return this.f4366c;
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final T b(float f5, float f6, T t4, T t5, float f7, float f8, float f9) {
        return a(this.f4364a.h(f5, f6, t4, t5, f7, f8, f9));
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final void c(@Nullable com.airbnb.lottie.animation.keyframe.a<?, ?> aVar) {
        this.f4365b = aVar;
    }

    public final void d(@Nullable T t4) {
        this.f4366c = t4;
        com.airbnb.lottie.animation.keyframe.a<?, ?> aVar = this.f4365b;
        if (aVar != null) {
            aVar.k();
        }
    }

    public j(@Nullable T t4) {
        this.f4364a = new b<>();
        this.f4366c = null;
        this.f4366c = t4;
    }
}
