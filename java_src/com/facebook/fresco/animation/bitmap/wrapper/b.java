package com.facebook.fresco.animation.bitmap.wrapper;

import android.graphics.Bitmap;
import android.graphics.Rect;
import com.facebook.imagepipeline.animated.impl.AnimatedImageCompositor;
import javax.annotation.Nullable;
/* compiled from: AnimatedDrawableBackendFrameRenderer.java */
/* loaded from: classes.dex */
public class b implements com.facebook.fresco.animation.bitmap.b {

    /* renamed from: e  reason: collision with root package name */
    private static final Class<?> f11445e = b.class;

    /* renamed from: a  reason: collision with root package name */
    private final com.facebook.fresco.animation.bitmap.a f11446a;

    /* renamed from: b  reason: collision with root package name */
    private com.facebook.imagepipeline.animated.base.a f11447b;

    /* renamed from: c  reason: collision with root package name */
    private AnimatedImageCompositor f11448c;

    /* renamed from: d  reason: collision with root package name */
    private final AnimatedImageCompositor.b f11449d;

    /* compiled from: AnimatedDrawableBackendFrameRenderer.java */
    /* loaded from: classes.dex */
    class a implements AnimatedImageCompositor.b {
        a() {
        }

        @Override // com.facebook.imagepipeline.animated.impl.AnimatedImageCompositor.b
        public void a(int i4, Bitmap bitmap) {
        }

        @Override // com.facebook.imagepipeline.animated.impl.AnimatedImageCompositor.b
        @Nullable
        public com.facebook.common.references.a<Bitmap> b(int i4) {
            return b.this.f11446a.h(i4);
        }
    }

    public b(com.facebook.fresco.animation.bitmap.a aVar, com.facebook.imagepipeline.animated.base.a aVar2) {
        a aVar3 = new a();
        this.f11449d = aVar3;
        this.f11446a = aVar;
        this.f11447b = aVar2;
        this.f11448c = new AnimatedImageCompositor(aVar2, aVar3);
    }

    @Override // com.facebook.fresco.animation.bitmap.b
    public boolean a(int i4, Bitmap bitmap) {
        try {
            this.f11448c.f(i4, bitmap);
            return true;
        } catch (IllegalStateException e5) {
            com.facebook.common.logging.a.t(f11445e, e5, "Rendering of frame unsuccessful. Frame number: %d", Integer.valueOf(i4));
            return false;
        }
    }

    @Override // com.facebook.fresco.animation.bitmap.b
    public int d() {
        return this.f11447b.getHeight();
    }

    @Override // com.facebook.fresco.animation.bitmap.b
    public void e(@Nullable Rect rect) {
        com.facebook.imagepipeline.animated.base.a g4 = this.f11447b.g(rect);
        if (g4 != this.f11447b) {
            this.f11447b = g4;
            this.f11448c = new AnimatedImageCompositor(g4, this.f11449d);
        }
    }

    @Override // com.facebook.fresco.animation.bitmap.b
    public int f() {
        return this.f11447b.getWidth();
    }
}
