package com.facebook.fresco.animation.bitmap.preparation;

import android.graphics.Bitmap;
import android.util.SparseArray;
import com.facebook.imagepipeline.bitmaps.f;
import java.util.concurrent.ExecutorService;
/* compiled from: DefaultBitmapFramePreparer.java */
/* loaded from: classes2.dex */
public class c implements b {

    /* renamed from: f  reason: collision with root package name */
    private static final Class<?> f11430f = c.class;

    /* renamed from: a  reason: collision with root package name */
    private final f f11431a;

    /* renamed from: b  reason: collision with root package name */
    private final com.facebook.fresco.animation.bitmap.b f11432b;

    /* renamed from: c  reason: collision with root package name */
    private final Bitmap.Config f11433c;

    /* renamed from: d  reason: collision with root package name */
    private final ExecutorService f11434d;

    /* renamed from: e  reason: collision with root package name */
    private final SparseArray<Runnable> f11435e = new SparseArray<>();

    /* compiled from: DefaultBitmapFramePreparer.java */
    /* loaded from: classes2.dex */
    private class a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        private final com.facebook.fresco.animation.bitmap.a f11436b;

        /* renamed from: c  reason: collision with root package name */
        private final com.facebook.fresco.animation.backend.a f11437c;

        /* renamed from: d  reason: collision with root package name */
        private final int f11438d;

        /* renamed from: e  reason: collision with root package name */
        private final int f11439e;

        public a(com.facebook.fresco.animation.backend.a aVar, com.facebook.fresco.animation.bitmap.a aVar2, int i4, int i5) {
            this.f11437c = aVar;
            this.f11436b = aVar2;
            this.f11438d = i4;
            this.f11439e = i5;
        }

        private boolean a(int i4, int i5) {
            com.facebook.common.references.a<Bitmap> e5;
            int i6 = 2;
            try {
                if (i5 == 1) {
                    e5 = this.f11436b.e(i4, this.f11437c.f(), this.f11437c.d());
                } else if (i5 != 2) {
                    return false;
                } else {
                    e5 = c.this.f11431a.e(this.f11437c.f(), this.f11437c.d(), c.this.f11433c);
                    i6 = -1;
                }
                boolean b5 = b(i4, e5, i5);
                com.facebook.common.references.a.h(e5);
                return (b5 || i6 == -1) ? b5 : a(i4, i6);
            } catch (RuntimeException e6) {
                com.facebook.common.logging.a.l0(c.f11430f, "Failed to create frame bitmap", e6);
                return false;
            } finally {
                com.facebook.common.references.a.h(null);
            }
        }

        private boolean b(int i4, com.facebook.common.references.a<Bitmap> aVar, int i5) {
            if (com.facebook.common.references.a.t(aVar) && c.this.f11432b.a(i4, aVar.k())) {
                com.facebook.common.logging.a.V(c.f11430f, "Frame %d ready.", Integer.valueOf(this.f11438d));
                synchronized (c.this.f11435e) {
                    this.f11436b.a(this.f11438d, aVar, i5);
                }
                return true;
            }
            return false;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (this.f11436b.g(this.f11438d)) {
                    com.facebook.common.logging.a.V(c.f11430f, "Frame %d is cached already.", Integer.valueOf(this.f11438d));
                    synchronized (c.this.f11435e) {
                        c.this.f11435e.remove(this.f11439e);
                    }
                    return;
                }
                if (a(this.f11438d, 1)) {
                    com.facebook.common.logging.a.V(c.f11430f, "Prepared frame frame %d.", Integer.valueOf(this.f11438d));
                } else {
                    com.facebook.common.logging.a.s(c.f11430f, "Could not prepare frame %d.", Integer.valueOf(this.f11438d));
                }
                synchronized (c.this.f11435e) {
                    c.this.f11435e.remove(this.f11439e);
                }
            } catch (Throwable th) {
                synchronized (c.this.f11435e) {
                    c.this.f11435e.remove(this.f11439e);
                    throw th;
                }
            }
        }
    }

    public c(f fVar, com.facebook.fresco.animation.bitmap.b bVar, Bitmap.Config config, ExecutorService executorService) {
        this.f11431a = fVar;
        this.f11432b = bVar;
        this.f11433c = config;
        this.f11434d = executorService;
    }

    private static int g(com.facebook.fresco.animation.backend.a aVar, int i4) {
        return (aVar.hashCode() * 31) + i4;
    }

    @Override // com.facebook.fresco.animation.bitmap.preparation.b
    public boolean a(com.facebook.fresco.animation.bitmap.a aVar, com.facebook.fresco.animation.backend.a aVar2, int i4) {
        int g4 = g(aVar2, i4);
        synchronized (this.f11435e) {
            if (this.f11435e.get(g4) != null) {
                com.facebook.common.logging.a.V(f11430f, "Already scheduled decode job for frame %d", Integer.valueOf(i4));
                return true;
            } else if (aVar.g(i4)) {
                com.facebook.common.logging.a.V(f11430f, "Frame %d is cached already.", Integer.valueOf(i4));
                return true;
            } else {
                a aVar3 = new a(aVar2, aVar, i4, g4);
                this.f11435e.put(g4, aVar3);
                this.f11434d.execute(aVar3);
                return true;
            }
        }
    }
}
