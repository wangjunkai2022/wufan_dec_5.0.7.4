package com.airbnb.lottie.model.content;
/* loaded from: classes2.dex */
public class Mask {

    /* renamed from: a  reason: collision with root package name */
    private final MaskMode f3947a;

    /* renamed from: b  reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.h f3948b;

    /* renamed from: c  reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.d f3949c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f3950d;

    /* loaded from: classes2.dex */
    public enum MaskMode {
        MASK_MODE_ADD,
        MASK_MODE_SUBTRACT,
        MASK_MODE_INTERSECT,
        MASK_MODE_NONE
    }

    public Mask(MaskMode maskMode, com.airbnb.lottie.model.animatable.h hVar, com.airbnb.lottie.model.animatable.d dVar, boolean z4) {
        this.f3947a = maskMode;
        this.f3948b = hVar;
        this.f3949c = dVar;
        this.f3950d = z4;
    }

    public MaskMode a() {
        return this.f3947a;
    }

    public com.airbnb.lottie.model.animatable.h b() {
        return this.f3948b;
    }

    public com.airbnb.lottie.model.animatable.d c() {
        return this.f3949c;
    }

    public boolean d() {
        return this.f3950d;
    }
}
