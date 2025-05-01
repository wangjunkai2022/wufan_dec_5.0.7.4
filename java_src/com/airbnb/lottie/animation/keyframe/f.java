package com.airbnb.lottie.animation.keyframe;

import java.util.List;
/* compiled from: IntegerKeyframeAnimation.java */
/* loaded from: classes2.dex */
public class f extends g<Integer> {
    public f(List<com.airbnb.lottie.value.a<Integer>> list) {
        super(list);
    }

    public int p() {
        return q(b(), d());
    }

    int q(com.airbnb.lottie.value.a<Integer> aVar, float f5) {
        Integer num;
        if (aVar.f4337b != null && aVar.f4338c != null) {
            com.airbnb.lottie.value.j<A> jVar = this.f3768e;
            if (jVar != 0 && (num = (Integer) jVar.b(aVar.f4342g, aVar.f4343h.floatValue(), aVar.f4337b, aVar.f4338c, f5, e(), f())) != null) {
                return num.intValue();
            }
            return com.airbnb.lottie.utils.g.l(aVar.g(), aVar.d(), f5);
        }
        throw new IllegalStateException("Missing values for keyframe.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.airbnb.lottie.animation.keyframe.a
    /* renamed from: r */
    public Integer i(com.airbnb.lottie.value.a<Integer> aVar, float f5) {
        return Integer.valueOf(q(aVar, f5));
    }
}
