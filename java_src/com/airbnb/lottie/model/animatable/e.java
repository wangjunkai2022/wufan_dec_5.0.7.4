package com.airbnb.lottie.model.animatable;

import android.graphics.PointF;
import java.util.List;
/* compiled from: AnimatablePathValue.java */
/* loaded from: classes2.dex */
public class e implements m<PointF, PointF> {

    /* renamed from: a  reason: collision with root package name */
    private final List<com.airbnb.lottie.value.a<PointF>> f3919a;

    public e(List<com.airbnb.lottie.value.a<PointF>> list) {
        this.f3919a = list;
    }

    @Override // com.airbnb.lottie.model.animatable.m
    public com.airbnb.lottie.animation.keyframe.a<PointF, PointF> a() {
        if (this.f3919a.get(0).h()) {
            return new com.airbnb.lottie.animation.keyframe.k(this.f3919a);
        }
        return new com.airbnb.lottie.animation.keyframe.j(this.f3919a);
    }

    @Override // com.airbnb.lottie.model.animatable.m
    public List<com.airbnb.lottie.value.a<PointF>> b() {
        return this.f3919a;
    }

    @Override // com.airbnb.lottie.model.animatable.m
    public boolean c() {
        return this.f3919a.size() == 1 && this.f3919a.get(0).h();
    }
}
