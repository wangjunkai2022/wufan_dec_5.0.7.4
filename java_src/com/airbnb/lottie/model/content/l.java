package com.airbnb.lottie.model.content;

import com.airbnb.lottie.LottieDrawable;
import java.util.Arrays;
import java.util.List;
/* compiled from: ShapeGroup.java */
/* loaded from: classes2.dex */
public class l implements c {

    /* renamed from: a  reason: collision with root package name */
    private final String f4035a;

    /* renamed from: b  reason: collision with root package name */
    private final List<c> f4036b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f4037c;

    public l(String str, List<c> list, boolean z4) {
        this.f4035a = str;
        this.f4036b = list;
        this.f4037c = z4;
    }

    @Override // com.airbnb.lottie.model.content.c
    public com.airbnb.lottie.animation.content.c a(LottieDrawable lottieDrawable, com.airbnb.lottie.model.layer.b bVar) {
        return new com.airbnb.lottie.animation.content.d(lottieDrawable, bVar, this);
    }

    public List<c> b() {
        return this.f4036b;
    }

    public String c() {
        return this.f4035a;
    }

    public boolean d() {
        return this.f4037c;
    }

    public String toString() {
        return "ShapeGroup{name='" + this.f4035a + "' Shapes: " + Arrays.toString(this.f4036b.toArray()) + '}';
    }
}
