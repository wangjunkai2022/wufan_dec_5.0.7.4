package com.airbnb.lottie.model.content;

import android.graphics.PointF;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.animation.content.o;
/* loaded from: classes2.dex */
public class PolystarShape implements c {

    /* renamed from: a  reason: collision with root package name */
    private final String f3954a;

    /* renamed from: b  reason: collision with root package name */
    private final Type f3955b;

    /* renamed from: c  reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.b f3956c;

    /* renamed from: d  reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.m<PointF, PointF> f3957d;

    /* renamed from: e  reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.b f3958e;

    /* renamed from: f  reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.b f3959f;

    /* renamed from: g  reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.b f3960g;

    /* renamed from: h  reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.b f3961h;

    /* renamed from: i  reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.b f3962i;

    /* renamed from: j  reason: collision with root package name */
    private final boolean f3963j;

    /* renamed from: k  reason: collision with root package name */
    private final boolean f3964k;

    /* loaded from: classes2.dex */
    public enum Type {
        STAR(1),
        POLYGON(2);
        
        private final int value;

        Type(int i4) {
            this.value = i4;
        }

        public static Type forValue(int i4) {
            Type[] values;
            for (Type type : values()) {
                if (type.value == i4) {
                    return type;
                }
            }
            return null;
        }
    }

    public PolystarShape(String str, Type type, com.airbnb.lottie.model.animatable.b bVar, com.airbnb.lottie.model.animatable.m<PointF, PointF> mVar, com.airbnb.lottie.model.animatable.b bVar2, com.airbnb.lottie.model.animatable.b bVar3, com.airbnb.lottie.model.animatable.b bVar4, com.airbnb.lottie.model.animatable.b bVar5, com.airbnb.lottie.model.animatable.b bVar6, boolean z4, boolean z5) {
        this.f3954a = str;
        this.f3955b = type;
        this.f3956c = bVar;
        this.f3957d = mVar;
        this.f3958e = bVar2;
        this.f3959f = bVar3;
        this.f3960g = bVar4;
        this.f3961h = bVar5;
        this.f3962i = bVar6;
        this.f3963j = z4;
        this.f3964k = z5;
    }

    @Override // com.airbnb.lottie.model.content.c
    public com.airbnb.lottie.animation.content.c a(LottieDrawable lottieDrawable, com.airbnb.lottie.model.layer.b bVar) {
        return new o(lottieDrawable, bVar, this);
    }

    public com.airbnb.lottie.model.animatable.b b() {
        return this.f3959f;
    }

    public com.airbnb.lottie.model.animatable.b c() {
        return this.f3961h;
    }

    public String d() {
        return this.f3954a;
    }

    public com.airbnb.lottie.model.animatable.b e() {
        return this.f3960g;
    }

    public com.airbnb.lottie.model.animatable.b f() {
        return this.f3962i;
    }

    public com.airbnb.lottie.model.animatable.b g() {
        return this.f3956c;
    }

    public Type getType() {
        return this.f3955b;
    }

    public com.airbnb.lottie.model.animatable.m<PointF, PointF> h() {
        return this.f3957d;
    }

    public com.airbnb.lottie.model.animatable.b i() {
        return this.f3958e;
    }

    public boolean j() {
        return this.f3963j;
    }

    public boolean k() {
        return this.f3964k;
    }
}
