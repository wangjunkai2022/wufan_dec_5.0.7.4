package com.airbnb.lottie.animation.keyframe;

import java.util.List;
/* compiled from: FloatKeyframeAnimation.java */
/* loaded from: classes2.dex */
public class d extends g<Float> {
    public d(List<com.airbnb.lottie.value.a<Float>> list) {
        super(list);
    }

    public float p() {
        return q(b(), d());
    }

    float q(com.airbnb.lottie.value.a<Float> aVar, float f5) {
        Float f6;
        if (aVar.f4337b != null && aVar.f4338c != null) {
            com.airbnb.lottie.value.j<A> jVar = this.f3768e;
            if (jVar != 0 && (f6 = (Float) jVar.b(aVar.f4342g, aVar.f4343h.floatValue(), aVar.f4337b, aVar.f4338c, f5, e(), f())) != null) {
                return f6.floatValue();
            }
            return com.airbnb.lottie.utils.g.k(aVar.f(), aVar.c(), f5);
        }
        throw new IllegalStateException("Missing values for keyframe.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.airbnb.lottie.animation.keyframe.a
    /* renamed from: r */
    public Float i(com.airbnb.lottie.value.a<Float> aVar, float f5) {
        return Float.valueOf(q(aVar, f5));
    }
}
