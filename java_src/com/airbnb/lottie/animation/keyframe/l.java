package com.airbnb.lottie.animation.keyframe;

import java.util.List;
/* compiled from: ScaleKeyframeAnimation.java */
/* loaded from: classes2.dex */
public class l extends g<com.airbnb.lottie.value.k> {

    /* renamed from: i  reason: collision with root package name */
    private final com.airbnb.lottie.value.k f3799i;

    public l(List<com.airbnb.lottie.value.a<com.airbnb.lottie.value.k>> list) {
        super(list);
        this.f3799i = new com.airbnb.lottie.value.k();
    }

    @Override // com.airbnb.lottie.animation.keyframe.a
    /* renamed from: p */
    public com.airbnb.lottie.value.k i(com.airbnb.lottie.value.a<com.airbnb.lottie.value.k> aVar, float f5) {
        com.airbnb.lottie.value.k kVar;
        com.airbnb.lottie.value.k kVar2;
        com.airbnb.lottie.value.k kVar3 = aVar.f4337b;
        if (kVar3 != null && (kVar = aVar.f4338c) != null) {
            com.airbnb.lottie.value.k kVar4 = kVar3;
            com.airbnb.lottie.value.k kVar5 = kVar;
            com.airbnb.lottie.value.j<A> jVar = this.f3768e;
            if (jVar == 0 || (kVar2 = (com.airbnb.lottie.value.k) jVar.b(aVar.f4342g, aVar.f4343h.floatValue(), kVar4, kVar5, f5, e(), f())) == null) {
                this.f3799i.d(com.airbnb.lottie.utils.g.k(kVar4.b(), kVar5.b(), f5), com.airbnb.lottie.utils.g.k(kVar4.c(), kVar5.c(), f5));
                return this.f3799i;
            }
            return kVar2;
        }
        throw new IllegalStateException("Missing values for keyframe.");
    }
}
