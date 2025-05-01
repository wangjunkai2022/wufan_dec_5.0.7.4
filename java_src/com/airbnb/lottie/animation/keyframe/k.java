package com.airbnb.lottie.animation.keyframe;

import android.graphics.PointF;
import java.util.List;
/* compiled from: PointKeyframeAnimation.java */
/* loaded from: classes2.dex */
public class k extends g<PointF> {

    /* renamed from: i  reason: collision with root package name */
    private final PointF f3798i;

    public k(List<com.airbnb.lottie.value.a<PointF>> list) {
        super(list);
        this.f3798i = new PointF();
    }

    @Override // com.airbnb.lottie.animation.keyframe.a
    /* renamed from: p */
    public PointF i(com.airbnb.lottie.value.a<PointF> aVar, float f5) {
        return j(aVar, f5, f5, f5);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.airbnb.lottie.animation.keyframe.a
    /* renamed from: q */
    public PointF j(com.airbnb.lottie.value.a<PointF> aVar, float f5, float f6, float f7) {
        PointF pointF;
        PointF pointF2;
        PointF pointF3 = aVar.f4337b;
        if (pointF3 != null && (pointF = aVar.f4338c) != null) {
            PointF pointF4 = pointF3;
            PointF pointF5 = pointF;
            com.airbnb.lottie.value.j<A> jVar = this.f3768e;
            if (jVar == 0 || (pointF2 = (PointF) jVar.b(aVar.f4342g, aVar.f4343h.floatValue(), pointF4, pointF5, f5, e(), f())) == null) {
                PointF pointF6 = this.f3798i;
                float f8 = pointF4.x;
                float f9 = f8 + (f6 * (pointF5.x - f8));
                float f10 = pointF4.y;
                pointF6.set(f9, f10 + (f7 * (pointF5.y - f10)));
                return this.f3798i;
            }
            return pointF2;
        }
        throw new IllegalStateException("Missing values for keyframe.");
    }
}
