package com.airbnb.lottie.animation.keyframe;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import java.util.List;
/* compiled from: PathKeyframeAnimation.java */
/* loaded from: classes2.dex */
public class j extends g<PointF> {

    /* renamed from: i  reason: collision with root package name */
    private final PointF f3794i;

    /* renamed from: j  reason: collision with root package name */
    private final float[] f3795j;

    /* renamed from: k  reason: collision with root package name */
    private final PathMeasure f3796k;

    /* renamed from: l  reason: collision with root package name */
    private i f3797l;

    public j(List<? extends com.airbnb.lottie.value.a<PointF>> list) {
        super(list);
        this.f3794i = new PointF();
        this.f3795j = new float[2];
        this.f3796k = new PathMeasure();
    }

    @Override // com.airbnb.lottie.animation.keyframe.a
    /* renamed from: p */
    public PointF i(com.airbnb.lottie.value.a<PointF> aVar, float f5) {
        PointF pointF;
        i iVar = (i) aVar;
        Path j4 = iVar.j();
        if (j4 == null) {
            return aVar.f4337b;
        }
        com.airbnb.lottie.value.j<A> jVar = this.f3768e;
        if (jVar == 0 || (pointF = (PointF) jVar.b(iVar.f4342g, iVar.f4343h.floatValue(), (PointF) iVar.f4337b, (PointF) iVar.f4338c, e(), f5, f())) == null) {
            if (this.f3797l != iVar) {
                this.f3796k.setPath(j4, false);
                this.f3797l = iVar;
            }
            PathMeasure pathMeasure = this.f3796k;
            pathMeasure.getPosTan(f5 * pathMeasure.getLength(), this.f3795j, null);
            PointF pointF2 = this.f3794i;
            float[] fArr = this.f3795j;
            pointF2.set(fArr[0], fArr[1]);
            return this.f3794i;
        }
        return pointF;
    }
}
