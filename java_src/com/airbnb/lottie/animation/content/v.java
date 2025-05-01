package com.airbnb.lottie.animation.content;

import com.airbnb.lottie.animation.keyframe.a;
import com.airbnb.lottie.model.content.ShapeTrimPath;
import java.util.ArrayList;
import java.util.List;
/* compiled from: TrimPathContent.java */
/* loaded from: classes2.dex */
public class v implements c, a.b {

    /* renamed from: a  reason: collision with root package name */
    private final String f3757a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f3758b;

    /* renamed from: c  reason: collision with root package name */
    private final List<a.b> f3759c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    private final ShapeTrimPath.Type f3760d;

    /* renamed from: e  reason: collision with root package name */
    private final com.airbnb.lottie.animation.keyframe.a<?, Float> f3761e;

    /* renamed from: f  reason: collision with root package name */
    private final com.airbnb.lottie.animation.keyframe.a<?, Float> f3762f;

    /* renamed from: g  reason: collision with root package name */
    private final com.airbnb.lottie.animation.keyframe.a<?, Float> f3763g;

    public v(com.airbnb.lottie.model.layer.b bVar, ShapeTrimPath shapeTrimPath) {
        this.f3757a = shapeTrimPath.c();
        this.f3758b = shapeTrimPath.f();
        this.f3760d = shapeTrimPath.getType();
        com.airbnb.lottie.animation.keyframe.a<Float, Float> a5 = shapeTrimPath.e().a();
        this.f3761e = a5;
        com.airbnb.lottie.animation.keyframe.a<Float, Float> a6 = shapeTrimPath.b().a();
        this.f3762f = a6;
        com.airbnb.lottie.animation.keyframe.a<Float, Float> a7 = shapeTrimPath.d().a();
        this.f3763g = a7;
        bVar.i(a5);
        bVar.i(a6);
        bVar.i(a7);
        a5.a(this);
        a6.a(this);
        a7.a(this);
    }

    @Override // com.airbnb.lottie.animation.keyframe.a.b
    public void a() {
        for (int i4 = 0; i4 < this.f3759c.size(); i4++) {
            this.f3759c.get(i4).a();
        }
    }

    @Override // com.airbnb.lottie.animation.content.c
    public void b(List<c> list, List<c> list2) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(a.b bVar) {
        this.f3759c.add(bVar);
    }

    public com.airbnb.lottie.animation.keyframe.a<?, Float> e() {
        return this.f3762f;
    }

    public com.airbnb.lottie.animation.keyframe.a<?, Float> g() {
        return this.f3763g;
    }

    @Override // com.airbnb.lottie.animation.content.c
    public String getName() {
        return this.f3757a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ShapeTrimPath.Type getType() {
        return this.f3760d;
    }

    public com.airbnb.lottie.animation.keyframe.a<?, Float> i() {
        return this.f3761e;
    }

    public boolean j() {
        return this.f3758b;
    }
}
