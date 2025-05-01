package com.facebook.imagepipeline.image;

import javax.annotation.Nullable;
/* compiled from: CloseableAnimatedImage.java */
/* loaded from: classes.dex */
public class a extends c {

    /* renamed from: c  reason: collision with root package name */
    private com.facebook.imagepipeline.animated.base.f f11910c;

    public a(com.facebook.imagepipeline.animated.base.f fVar) {
        this.f11910c = fVar;
    }

    @Override // com.facebook.imagepipeline.image.c
    public synchronized int b() {
        return isClosed() ? 0 : this.f11910c.e().b();
    }

    @Override // com.facebook.imagepipeline.image.c, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this) {
            com.facebook.imagepipeline.animated.base.f fVar = this.f11910c;
            if (fVar == null) {
                return;
            }
            this.f11910c = null;
            fVar.a();
        }
    }

    @Override // com.facebook.imagepipeline.image.c
    public boolean d() {
        return true;
    }

    @Nullable
    public synchronized com.facebook.imagepipeline.animated.base.d g() {
        return isClosed() ? null : this.f11910c.e();
    }

    @Override // com.facebook.imagepipeline.image.f
    public synchronized int getHeight() {
        return isClosed() ? 0 : this.f11910c.e().getHeight();
    }

    @Override // com.facebook.imagepipeline.image.f
    public synchronized int getWidth() {
        return isClosed() ? 0 : this.f11910c.e().getWidth();
    }

    public synchronized com.facebook.imagepipeline.animated.base.f h() {
        return this.f11910c;
    }

    @Override // com.facebook.imagepipeline.image.c
    public synchronized boolean isClosed() {
        return this.f11910c == null;
    }
}
