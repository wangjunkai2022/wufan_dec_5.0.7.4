package com.facebook.imagepipeline.animated.base;
/* loaded from: classes2.dex */
public class AnimatedDrawableFrameInfo {

    /* renamed from: a  reason: collision with root package name */
    public final int f11547a;

    /* renamed from: b  reason: collision with root package name */
    public final int f11548b;

    /* renamed from: c  reason: collision with root package name */
    public final int f11549c;

    /* renamed from: d  reason: collision with root package name */
    public final int f11550d;

    /* renamed from: e  reason: collision with root package name */
    public final int f11551e;

    /* renamed from: f  reason: collision with root package name */
    public final BlendOperation f11552f;

    /* renamed from: g  reason: collision with root package name */
    public final DisposalMethod f11553g;

    /* loaded from: classes2.dex */
    public enum BlendOperation {
        BLEND_WITH_PREVIOUS,
        NO_BLEND
    }

    /* loaded from: classes2.dex */
    public enum DisposalMethod {
        DISPOSE_DO_NOT,
        DISPOSE_TO_BACKGROUND,
        DISPOSE_TO_PREVIOUS
    }

    public AnimatedDrawableFrameInfo(int i4, int i5, int i6, int i7, int i8, BlendOperation blendOperation, DisposalMethod disposalMethod) {
        this.f11547a = i4;
        this.f11548b = i5;
        this.f11549c = i6;
        this.f11550d = i7;
        this.f11551e = i8;
        this.f11552f = blendOperation;
        this.f11553g = disposalMethod;
    }
}
