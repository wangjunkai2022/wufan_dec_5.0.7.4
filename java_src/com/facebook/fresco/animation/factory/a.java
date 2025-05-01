package com.facebook.fresco.animation.factory;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.net.Uri;
import com.facebook.common.internal.k;
import com.facebook.common.time.c;
import com.facebook.fresco.animation.bitmap.BitmapAnimationBackend;
import com.facebook.imagepipeline.animated.base.d;
import com.facebook.imagepipeline.animated.impl.b;
import com.facebook.imagepipeline.bitmaps.f;
import com.facebook.imagepipeline.cache.h;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
/* compiled from: ExperimentalBitmapAnimationDrawableFactory.java */
/* loaded from: classes2.dex */
public class a implements t0.a {

    /* renamed from: i  reason: collision with root package name */
    public static final int f11492i = 0;

    /* renamed from: j  reason: collision with root package name */
    public static final int f11493j = 1;

    /* renamed from: k  reason: collision with root package name */
    public static final int f11494k = 2;

    /* renamed from: l  reason: collision with root package name */
    public static final int f11495l = 3;

    /* renamed from: a  reason: collision with root package name */
    private final b f11496a;

    /* renamed from: b  reason: collision with root package name */
    private final ScheduledExecutorService f11497b;

    /* renamed from: c  reason: collision with root package name */
    private final ExecutorService f11498c;

    /* renamed from: d  reason: collision with root package name */
    private final c f11499d;

    /* renamed from: e  reason: collision with root package name */
    private final f f11500e;

    /* renamed from: f  reason: collision with root package name */
    private final h<com.facebook.cache.common.c, com.facebook.imagepipeline.image.c> f11501f;

    /* renamed from: g  reason: collision with root package name */
    private final k<Integer> f11502g;

    /* renamed from: h  reason: collision with root package name */
    private final k<Integer> f11503h;

    /* compiled from: ExperimentalBitmapAnimationDrawableFactory.java */
    /* renamed from: com.facebook.fresco.animation.factory.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0266a implements com.facebook.cache.common.c {

        /* renamed from: b  reason: collision with root package name */
        private static final String f11504b = "anim://";

        /* renamed from: a  reason: collision with root package name */
        private final String f11505a;

        public C0266a(int i4) {
            this.f11505a = f11504b + i4;
        }

        @Override // com.facebook.cache.common.c
        public String a() {
            return this.f11505a;
        }

        @Override // com.facebook.cache.common.c
        public boolean b(Uri uri) {
            return uri.toString().startsWith(this.f11505a);
        }
    }

    public a(b bVar, ScheduledExecutorService scheduledExecutorService, ExecutorService executorService, c cVar, f fVar, h<com.facebook.cache.common.c, com.facebook.imagepipeline.image.c> hVar, k<Integer> kVar, k<Integer> kVar2) {
        this.f11496a = bVar;
        this.f11497b = scheduledExecutorService;
        this.f11498c = executorService;
        this.f11499d = cVar;
        this.f11500e = fVar;
        this.f11501f = hVar;
        this.f11502g = kVar;
        this.f11503h = kVar2;
    }

    private com.facebook.imagepipeline.animated.base.a c(com.facebook.imagepipeline.animated.base.f fVar) {
        d e5 = fVar.e();
        return this.f11496a.a(fVar, new Rect(0, 0, e5.getWidth(), e5.getHeight()));
    }

    private com.facebook.imagepipeline.animated.impl.c d(com.facebook.imagepipeline.animated.base.f fVar) {
        return new com.facebook.imagepipeline.animated.impl.c(new C0266a(fVar.hashCode()), this.f11501f);
    }

    private com.facebook.fresco.animation.backend.a e(com.facebook.imagepipeline.animated.base.f fVar) {
        com.facebook.fresco.animation.bitmap.preparation.d dVar;
        com.facebook.fresco.animation.bitmap.preparation.b bVar;
        com.facebook.imagepipeline.animated.base.a c5 = c(fVar);
        com.facebook.fresco.animation.bitmap.a f5 = f(fVar);
        com.facebook.fresco.animation.bitmap.wrapper.b bVar2 = new com.facebook.fresco.animation.bitmap.wrapper.b(f5, c5);
        int intValue = this.f11503h.get().intValue();
        if (intValue > 0) {
            com.facebook.fresco.animation.bitmap.preparation.d dVar2 = new com.facebook.fresco.animation.bitmap.preparation.d(intValue);
            bVar = g(bVar2);
            dVar = dVar2;
        } else {
            dVar = null;
            bVar = null;
        }
        return com.facebook.fresco.animation.backend.c.r(new BitmapAnimationBackend(this.f11500e, f5, new com.facebook.fresco.animation.bitmap.wrapper.a(c5), bVar2, dVar, bVar), this.f11499d, this.f11497b);
    }

    private com.facebook.fresco.animation.bitmap.a f(com.facebook.imagepipeline.animated.base.f fVar) {
        int intValue = this.f11502g.get().intValue();
        if (intValue != 1) {
            if (intValue != 2) {
                if (intValue != 3) {
                    return new com.facebook.fresco.animation.bitmap.cache.c();
                }
                return new com.facebook.fresco.animation.bitmap.cache.b();
            }
            return new com.facebook.fresco.animation.bitmap.cache.a(d(fVar), false);
        }
        return new com.facebook.fresco.animation.bitmap.cache.a(d(fVar), true);
    }

    private com.facebook.fresco.animation.bitmap.preparation.b g(com.facebook.fresco.animation.bitmap.b bVar) {
        return new com.facebook.fresco.animation.bitmap.preparation.c(this.f11500e, bVar, Bitmap.Config.ARGB_8888, this.f11498c);
    }

    @Override // t0.a
    public boolean a(com.facebook.imagepipeline.image.c cVar) {
        return cVar instanceof com.facebook.imagepipeline.image.a;
    }

    @Override // t0.a
    /* renamed from: h */
    public com.facebook.fresco.animation.drawable.a b(com.facebook.imagepipeline.image.c cVar) {
        return new com.facebook.fresco.animation.drawable.a(e(((com.facebook.imagepipeline.image.a) cVar).h()));
    }
}
