package com.airbnb.lottie.value;

import android.view.animation.Interpolator;
/* compiled from: LottieInterpolatedFloatValue.java */
/* loaded from: classes2.dex */
public class c extends f<Float> {
    public c(Float f5, Float f6) {
        super(f5, f6);
    }

    @Override // com.airbnb.lottie.value.f, com.airbnb.lottie.value.j
    public /* bridge */ /* synthetic */ Object a(b bVar) {
        return super.a(bVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.airbnb.lottie.value.f
    /* renamed from: f */
    public Float e(Float f5, Float f6, float f7) {
        return Float.valueOf(com.airbnb.lottie.utils.g.k(f5.floatValue(), f6.floatValue(), f7));
    }

    public c(Float f5, Float f6, Interpolator interpolator) {
        super(f5, f6, interpolator);
    }
}
