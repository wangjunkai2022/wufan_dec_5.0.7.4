package com.airbnb.lottie.value;

import androidx.annotation.NonNull;
/* compiled from: LottieRelativeFloatValueCallback.java */
/* loaded from: classes2.dex */
public class g extends j<Float> {
    public g() {
    }

    public Float e(b<Float> bVar) {
        T t4 = this.f4366c;
        if (t4 != 0) {
            return (Float) t4;
        }
        throw new IllegalArgumentException("You must provide a static value in the constructor , call setValue, or override getValue.");
    }

    @Override // com.airbnb.lottie.value.j
    /* renamed from: f */
    public Float a(b<Float> bVar) {
        return Float.valueOf(com.airbnb.lottie.utils.g.k(bVar.g().floatValue(), bVar.b().floatValue(), bVar.c()) + e(bVar).floatValue());
    }

    public g(@NonNull Float f5) {
        super(f5);
    }
}
