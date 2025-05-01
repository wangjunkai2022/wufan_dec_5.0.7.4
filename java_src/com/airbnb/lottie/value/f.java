package com.airbnb.lottie.value;

import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
/* compiled from: LottieInterpolatedValue.java */
/* loaded from: classes2.dex */
abstract class f<T> extends j<T> {

    /* renamed from: d  reason: collision with root package name */
    private final T f4360d;

    /* renamed from: e  reason: collision with root package name */
    private final T f4361e;

    /* renamed from: f  reason: collision with root package name */
    private final Interpolator f4362f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(T t4, T t5) {
        this(t4, t5, new LinearInterpolator());
    }

    @Override // com.airbnb.lottie.value.j
    public T a(b<T> bVar) {
        return e(this.f4360d, this.f4361e, this.f4362f.getInterpolation(bVar.e()));
    }

    abstract T e(T t4, T t5, float f5);

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(T t4, T t5, Interpolator interpolator) {
        this.f4360d = t4;
        this.f4361e = t5;
        this.f4362f = interpolator;
    }
}
