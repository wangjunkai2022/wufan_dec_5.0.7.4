package com.airbnb.lottie.value;

import android.graphics.PointF;
import androidx.annotation.NonNull;
/* compiled from: LottieRelativePointValueCallback.java */
/* loaded from: classes2.dex */
public class i extends j<PointF> {

    /* renamed from: d  reason: collision with root package name */
    private final PointF f4363d;

    public i() {
        this.f4363d = new PointF();
    }

    public PointF e(b<PointF> bVar) {
        T t4 = this.f4366c;
        if (t4 != 0) {
            return (PointF) t4;
        }
        throw new IllegalArgumentException("You must provide a static value in the constructor , call setValue, or override getValue.");
    }

    @Override // com.airbnb.lottie.value.j
    /* renamed from: f */
    public final PointF a(b<PointF> bVar) {
        this.f4363d.set(com.airbnb.lottie.utils.g.k(bVar.g().x, bVar.b().x, bVar.c()), com.airbnb.lottie.utils.g.k(bVar.g().y, bVar.b().y, bVar.c()));
        PointF e5 = e(bVar);
        this.f4363d.offset(e5.x, e5.y);
        return this.f4363d;
    }

    public i(@NonNull PointF pointF) {
        super(pointF);
        this.f4363d = new PointF();
    }
}
