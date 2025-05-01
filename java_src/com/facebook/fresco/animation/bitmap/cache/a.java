package com.facebook.fresco.animation.bitmap.cache;

import android.graphics.Bitmap;
import android.util.SparseArray;
import com.facebook.common.internal.VisibleForTesting;
import com.facebook.common.internal.h;
import com.facebook.fresco.animation.bitmap.a;
import com.facebook.imagepipeline.image.d;
import com.facebook.imagepipeline.image.g;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;
/* compiled from: FrescoFrameCache.java */
/* loaded from: classes.dex */
public class a implements com.facebook.fresco.animation.bitmap.a {

    /* renamed from: e  reason: collision with root package name */
    private static final Class<?> f11421e = a.class;

    /* renamed from: a  reason: collision with root package name */
    private final com.facebook.imagepipeline.animated.impl.c f11422a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f11423b;
    @GuardedBy("this")

    /* renamed from: c  reason: collision with root package name */
    private final SparseArray<com.facebook.common.references.a<com.facebook.imagepipeline.image.c>> f11424c = new SparseArray<>();
    @GuardedBy("this")
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    private com.facebook.common.references.a<com.facebook.imagepipeline.image.c> f11425d;

    public a(com.facebook.imagepipeline.animated.impl.c cVar, boolean z4) {
        this.f11422a = cVar;
        this.f11423b = z4;
    }

    @VisibleForTesting
    @Nullable
    static com.facebook.common.references.a<Bitmap> i(@Nullable com.facebook.common.references.a<com.facebook.imagepipeline.image.c> aVar) {
        d dVar;
        try {
            if (com.facebook.common.references.a.t(aVar) && (aVar.k() instanceof d) && (dVar = (d) aVar.k()) != null) {
                return dVar.h();
            }
            return null;
        } finally {
            com.facebook.common.references.a.h(aVar);
        }
    }

    @Nullable
    private static com.facebook.common.references.a<com.facebook.imagepipeline.image.c> j(com.facebook.common.references.a<Bitmap> aVar) {
        return com.facebook.common.references.a.u(new d(aVar, g.f11933d, 0));
    }

    private static int k(@Nullable com.facebook.common.references.a<com.facebook.imagepipeline.image.c> aVar) {
        if (com.facebook.common.references.a.t(aVar)) {
            return l(aVar.k());
        }
        return 0;
    }

    private static int l(@Nullable com.facebook.imagepipeline.image.c cVar) {
        if (cVar instanceof com.facebook.imagepipeline.image.b) {
            return com.facebook.imageutils.a.g(((com.facebook.imagepipeline.image.b) cVar).g());
        }
        return 0;
    }

    private synchronized int m() {
        int i4;
        i4 = 0;
        for (int i5 = 0; i5 < this.f11424c.size(); i5++) {
            i4 += k(this.f11424c.valueAt(i5));
        }
        return i4;
    }

    private synchronized void n(int i4) {
        com.facebook.common.references.a<com.facebook.imagepipeline.image.c> aVar = this.f11424c.get(i4);
        if (aVar != null) {
            this.f11424c.delete(i4);
            com.facebook.common.references.a.h(aVar);
            com.facebook.common.logging.a.W(f11421e, "removePreparedReference(%d) removed. Pending frames: %s", Integer.valueOf(i4), this.f11424c);
        }
    }

    @Override // com.facebook.fresco.animation.bitmap.a
    public synchronized void a(int i4, com.facebook.common.references.a<Bitmap> aVar, int i5) {
        h.i(aVar);
        com.facebook.common.references.a<com.facebook.imagepipeline.image.c> j4 = j(aVar);
        if (j4 == null) {
            com.facebook.common.references.a.h(j4);
            return;
        }
        com.facebook.common.references.a<com.facebook.imagepipeline.image.c> a5 = this.f11422a.a(i4, j4);
        if (com.facebook.common.references.a.t(a5)) {
            com.facebook.common.references.a.h(this.f11424c.get(i4));
            this.f11424c.put(i4, a5);
            com.facebook.common.logging.a.W(f11421e, "cachePreparedFrame(%d) cached. Pending frames: %s", Integer.valueOf(i4), this.f11424c);
        }
        com.facebook.common.references.a.h(j4);
    }

    @Override // com.facebook.fresco.animation.bitmap.a
    public synchronized int b() {
        return k(this.f11425d) + m();
    }

    @Override // com.facebook.fresco.animation.bitmap.a
    public synchronized void c(int i4, com.facebook.common.references.a<Bitmap> aVar, int i5) {
        h.i(aVar);
        n(i4);
        com.facebook.common.references.a<com.facebook.imagepipeline.image.c> j4 = j(aVar);
        if (j4 != null) {
            com.facebook.common.references.a.h(this.f11425d);
            this.f11425d = this.f11422a.a(i4, j4);
        }
        com.facebook.common.references.a.h(j4);
    }

    @Override // com.facebook.fresco.animation.bitmap.a
    public synchronized void clear() {
        com.facebook.common.references.a.h(this.f11425d);
        this.f11425d = null;
        for (int i4 = 0; i4 < this.f11424c.size(); i4++) {
            com.facebook.common.references.a.h(this.f11424c.valueAt(i4));
        }
        this.f11424c.clear();
    }

    @Override // com.facebook.fresco.animation.bitmap.a
    @Nullable
    public synchronized com.facebook.common.references.a<Bitmap> d(int i4) {
        return i(com.facebook.common.references.a.d(this.f11425d));
    }

    @Override // com.facebook.fresco.animation.bitmap.a
    @Nullable
    public synchronized com.facebook.common.references.a<Bitmap> e(int i4, int i5, int i6) {
        if (this.f11423b) {
            return i(this.f11422a.d());
        }
        return null;
    }

    @Override // com.facebook.fresco.animation.bitmap.a
    public void f(a.InterfaceC0263a interfaceC0263a) {
    }

    @Override // com.facebook.fresco.animation.bitmap.a
    public synchronized boolean g(int i4) {
        return this.f11422a.b(i4);
    }

    @Override // com.facebook.fresco.animation.bitmap.a
    @Nullable
    public synchronized com.facebook.common.references.a<Bitmap> h(int i4) {
        return i(this.f11422a.c(i4));
    }
}
