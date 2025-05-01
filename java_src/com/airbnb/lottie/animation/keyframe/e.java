package com.airbnb.lottie.animation.keyframe;

import java.util.List;
/* compiled from: GradientColorKeyframeAnimation.java */
/* loaded from: classes2.dex */
public class e extends g<com.airbnb.lottie.model.content.d> {

    /* renamed from: i  reason: collision with root package name */
    private final com.airbnb.lottie.model.content.d f3788i;

    public e(List<com.airbnb.lottie.value.a<com.airbnb.lottie.model.content.d>> list) {
        super(list);
        com.airbnb.lottie.model.content.d dVar = list.get(0).f4337b;
        int c5 = dVar != null ? dVar.c() : 0;
        this.f3788i = new com.airbnb.lottie.model.content.d(new float[c5], new int[c5]);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.airbnb.lottie.animation.keyframe.a
    /* renamed from: p */
    public com.airbnb.lottie.model.content.d i(com.airbnb.lottie.value.a<com.airbnb.lottie.model.content.d> aVar, float f5) {
        this.f3788i.d(aVar.f4337b, aVar.f4338c, f5);
        return this.f3788i;
    }
}
