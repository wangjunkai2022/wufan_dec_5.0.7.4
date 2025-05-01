package com.airbnb.lottie.animation.keyframe;

import android.graphics.Path;
import android.graphics.PointF;
import androidx.annotation.Nullable;
/* compiled from: PathKeyframe.java */
/* loaded from: classes2.dex */
public class i extends com.airbnb.lottie.value.a<PointF> {
    @Nullable

    /* renamed from: s  reason: collision with root package name */
    private Path f3792s;

    /* renamed from: t  reason: collision with root package name */
    private final com.airbnb.lottie.value.a<PointF> f3793t;

    public i(com.airbnb.lottie.k kVar, com.airbnb.lottie.value.a<PointF> aVar) {
        super(kVar, aVar.f4337b, aVar.f4338c, aVar.f4339d, aVar.f4340e, aVar.f4341f, aVar.f4342g, aVar.f4343h);
        this.f3793t = aVar;
        i();
    }

    public void i() {
        T t4;
        T t5;
        T t6 = this.f4338c;
        boolean z4 = (t6 == 0 || (t5 = this.f4337b) == 0 || !((PointF) t5).equals(((PointF) t6).x, ((PointF) t6).y)) ? false : true;
        T t7 = this.f4337b;
        if (t7 == 0 || (t4 = this.f4338c) == 0 || z4) {
            return;
        }
        com.airbnb.lottie.value.a<PointF> aVar = this.f3793t;
        this.f3792s = com.airbnb.lottie.utils.h.d((PointF) t7, (PointF) t4, aVar.f4350o, aVar.f4351p);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Nullable
    public Path j() {
        return this.f3792s;
    }
}
