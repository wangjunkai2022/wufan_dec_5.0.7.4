package com.facebook.imagepipeline.animated.base;

import android.graphics.Bitmap;
import android.graphics.Canvas;
/* compiled from: DelegatingAnimatedDrawableBackend.java */
/* loaded from: classes2.dex */
public abstract class h implements a {

    /* renamed from: a  reason: collision with root package name */
    private final a f11572a;

    public h(a aVar) {
        this.f11572a = aVar;
    }

    @Override // com.facebook.imagepipeline.animated.base.a
    public int a() {
        return this.f11572a.a();
    }

    @Override // com.facebook.imagepipeline.animated.base.a
    public int b() {
        return this.f11572a.b();
    }

    @Override // com.facebook.imagepipeline.animated.base.a
    public int c() {
        return this.f11572a.c();
    }

    @Override // com.facebook.imagepipeline.animated.base.a
    public void d() {
        this.f11572a.d();
    }

    @Override // com.facebook.imagepipeline.animated.base.a
    public AnimatedDrawableFrameInfo e(int i4) {
        return this.f11572a.e(i4);
    }

    @Override // com.facebook.imagepipeline.animated.base.a
    public void f(int i4, Canvas canvas) {
        this.f11572a.f(i4, canvas);
    }

    @Override // com.facebook.imagepipeline.animated.base.a
    public int getHeight() {
        return this.f11572a.getHeight();
    }

    @Override // com.facebook.imagepipeline.animated.base.a
    public int getWidth() {
        return this.f11572a.getWidth();
    }

    @Override // com.facebook.imagepipeline.animated.base.a
    public boolean h(int i4) {
        return this.f11572a.h(i4);
    }

    @Override // com.facebook.imagepipeline.animated.base.a
    public int i(int i4) {
        return this.f11572a.i(i4);
    }

    @Override // com.facebook.imagepipeline.animated.base.a
    public com.facebook.common.references.a<Bitmap> j(int i4) {
        return this.f11572a.j(i4);
    }

    @Override // com.facebook.imagepipeline.animated.base.a
    public int k(int i4) {
        return this.f11572a.k(i4);
    }

    @Override // com.facebook.imagepipeline.animated.base.a
    public int l() {
        return this.f11572a.l();
    }

    @Override // com.facebook.imagepipeline.animated.base.a
    public int m(int i4) {
        return this.f11572a.m(i4);
    }

    @Override // com.facebook.imagepipeline.animated.base.a
    public int n() {
        return this.f11572a.n();
    }

    @Override // com.facebook.imagepipeline.animated.base.a
    public int o() {
        return this.f11572a.o();
    }

    @Override // com.facebook.imagepipeline.animated.base.a
    public int p() {
        return this.f11572a.p();
    }

    @Override // com.facebook.imagepipeline.animated.base.a
    public f q() {
        return this.f11572a.q();
    }

    protected a r() {
        return this.f11572a;
    }
}
