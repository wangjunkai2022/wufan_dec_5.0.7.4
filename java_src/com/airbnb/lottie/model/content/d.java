package com.airbnb.lottie.model.content;
/* compiled from: GradientColor.java */
/* loaded from: classes2.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    private final float[] f3989a;

    /* renamed from: b  reason: collision with root package name */
    private final int[] f3990b;

    public d(float[] fArr, int[] iArr) {
        this.f3989a = fArr;
        this.f3990b = iArr;
    }

    public int[] a() {
        return this.f3990b;
    }

    public float[] b() {
        return this.f3989a;
    }

    public int c() {
        return this.f3990b.length;
    }

    public void d(d dVar, d dVar2, float f5) {
        if (dVar.f3990b.length == dVar2.f3990b.length) {
            for (int i4 = 0; i4 < dVar.f3990b.length; i4++) {
                this.f3989a[i4] = com.airbnb.lottie.utils.g.k(dVar.f3989a[i4], dVar2.f3989a[i4], f5);
                this.f3990b[i4] = com.airbnb.lottie.utils.b.c(f5, dVar.f3990b[i4], dVar2.f3990b[i4]);
            }
            return;
        }
        throw new IllegalArgumentException("Cannot interpolate between gradients. Lengths vary (" + dVar.f3990b.length + " vs " + dVar2.f3990b.length + ")");
    }
}
