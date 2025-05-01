package com.airbnb.lottie.value;

import android.view.animation.Interpolator;
/* compiled from: LottieInterpolatedIntegerValue.java */
/* loaded from: classes2.dex */
public class d extends f<Integer> {
    public d(Integer num, Integer num2) {
        super(num, num2);
    }

    @Override // com.airbnb.lottie.value.f, com.airbnb.lottie.value.j
    public /* bridge */ /* synthetic */ Object a(b bVar) {
        return super.a(bVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.airbnb.lottie.value.f
    /* renamed from: f */
    public Integer e(Integer num, Integer num2, float f5) {
        return Integer.valueOf(com.airbnb.lottie.utils.g.l(num.intValue(), num2.intValue(), f5));
    }

    public d(Integer num, Integer num2, Interpolator interpolator) {
        super(num, num2, interpolator);
    }
}
