package com.airbnb.lottie.value;

import android.graphics.PointF;
import android.view.animation.Interpolator;
/* compiled from: LottieInterpolatedPointValue.java */
/* loaded from: classes2.dex */
public class e extends f<PointF> {

    /* renamed from: g  reason: collision with root package name */
    private final PointF f4359g;

    public e(PointF pointF, PointF pointF2) {
        super(pointF, pointF2);
        this.f4359g = new PointF();
    }

    @Override // com.airbnb.lottie.value.f, com.airbnb.lottie.value.j
    public /* bridge */ /* synthetic */ Object a(b bVar) {
        return super.a(bVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.airbnb.lottie.value.f
    /* renamed from: f */
    public PointF e(PointF pointF, PointF pointF2, float f5) {
        this.f4359g.set(com.airbnb.lottie.utils.g.k(pointF.x, pointF2.x, f5), com.airbnb.lottie.utils.g.k(pointF.y, pointF2.y, f5));
        return this.f4359g;
    }

    public e(PointF pointF, PointF pointF2, Interpolator interpolator) {
        super(pointF, pointF2, interpolator);
        this.f4359g = new PointF();
    }
}
