package com.airbnb.lottie.model.animatable;

import android.graphics.PointF;
import java.util.List;
/* compiled from: AnimatableSplitDimensionPathValue.java */
/* loaded from: classes2.dex */
public class i implements m<PointF, PointF> {

    /* renamed from: a  reason: collision with root package name */
    private final b f3920a;

    /* renamed from: b  reason: collision with root package name */
    private final b f3921b;

    public i(b bVar, b bVar2) {
        this.f3920a = bVar;
        this.f3921b = bVar2;
    }

    @Override // com.airbnb.lottie.model.animatable.m
    public com.airbnb.lottie.animation.keyframe.a<PointF, PointF> a() {
        return new com.airbnb.lottie.animation.keyframe.n(this.f3920a.a(), this.f3921b.a());
    }

    @Override // com.airbnb.lottie.model.animatable.m
    public List<com.airbnb.lottie.value.a<PointF>> b() {
        throw new UnsupportedOperationException("Cannot call getKeyframes on AnimatableSplitDimensionPathValue.");
    }

    @Override // com.airbnb.lottie.model.animatable.m
    public boolean c() {
        return this.f3920a.c() && this.f3921b.c();
    }
}
