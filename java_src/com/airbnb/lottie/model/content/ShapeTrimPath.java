package com.airbnb.lottie.model.content;

import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.animation.content.v;
/* loaded from: classes2.dex */
public class ShapeTrimPath implements c {

    /* renamed from: a  reason: collision with root package name */
    private final String f3977a;

    /* renamed from: b  reason: collision with root package name */
    private final Type f3978b;

    /* renamed from: c  reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.b f3979c;

    /* renamed from: d  reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.b f3980d;

    /* renamed from: e  reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.b f3981e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f3982f;

    /* loaded from: classes2.dex */
    public enum Type {
        SIMULTANEOUSLY,
        INDIVIDUALLY;

        public static Type forId(int i4) {
            if (i4 != 1) {
                if (i4 == 2) {
                    return INDIVIDUALLY;
                }
                throw new IllegalArgumentException("Unknown trim path type " + i4);
            }
            return SIMULTANEOUSLY;
        }
    }

    public ShapeTrimPath(String str, Type type, com.airbnb.lottie.model.animatable.b bVar, com.airbnb.lottie.model.animatable.b bVar2, com.airbnb.lottie.model.animatable.b bVar3, boolean z4) {
        this.f3977a = str;
        this.f3978b = type;
        this.f3979c = bVar;
        this.f3980d = bVar2;
        this.f3981e = bVar3;
        this.f3982f = z4;
    }

    @Override // com.airbnb.lottie.model.content.c
    public com.airbnb.lottie.animation.content.c a(LottieDrawable lottieDrawable, com.airbnb.lottie.model.layer.b bVar) {
        return new v(bVar, this);
    }

    public com.airbnb.lottie.model.animatable.b b() {
        return this.f3980d;
    }

    public String c() {
        return this.f3977a;
    }

    public com.airbnb.lottie.model.animatable.b d() {
        return this.f3981e;
    }

    public com.airbnb.lottie.model.animatable.b e() {
        return this.f3979c;
    }

    public boolean f() {
        return this.f3982f;
    }

    public Type getType() {
        return this.f3978b;
    }

    public String toString() {
        return "Trim Path: {start: " + this.f3979c + ", end: " + this.f3980d + ", offset: " + this.f3981e + "}";
    }
}
