package com.facebook.imagepipeline.core;

import android.content.Context;
import android.os.Build;
import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.imagepipeline.cache.m;
import com.facebook.imagepipeline.cache.o;
import com.facebook.imagepipeline.producers.u0;
import javax.annotation.Nullable;
import javax.annotation.concurrent.NotThreadSafe;
/* compiled from: ImagePipelineFactory.java */
@NotThreadSafe
/* loaded from: classes.dex */
public class i {

    /* renamed from: s  reason: collision with root package name */
    private static final Class<?> f11801s = i.class;

    /* renamed from: t  reason: collision with root package name */
    private static i f11802t;

    /* renamed from: a  reason: collision with root package name */
    private final u0 f11803a;

    /* renamed from: b  reason: collision with root package name */
    private final ImagePipelineConfig f11804b;

    /* renamed from: c  reason: collision with root package name */
    private com.facebook.imagepipeline.cache.h<com.facebook.cache.common.c, com.facebook.imagepipeline.image.c> f11805c;

    /* renamed from: d  reason: collision with root package name */
    private o<com.facebook.cache.common.c, com.facebook.imagepipeline.image.c> f11806d;

    /* renamed from: e  reason: collision with root package name */
    private com.facebook.imagepipeline.cache.h<com.facebook.cache.common.c, PooledByteBuffer> f11807e;

    /* renamed from: f  reason: collision with root package name */
    private o<com.facebook.cache.common.c, PooledByteBuffer> f11808f;

    /* renamed from: g  reason: collision with root package name */
    private com.facebook.imagepipeline.cache.e f11809g;

    /* renamed from: h  reason: collision with root package name */
    private com.facebook.cache.disk.h f11810h;

    /* renamed from: i  reason: collision with root package name */
    private com.facebook.imagepipeline.decoder.b f11811i;

    /* renamed from: j  reason: collision with root package name */
    private g f11812j;

    /* renamed from: k  reason: collision with root package name */
    private com.facebook.imagepipeline.transcoder.d f11813k;

    /* renamed from: l  reason: collision with root package name */
    private k f11814l;

    /* renamed from: m  reason: collision with root package name */
    private l f11815m;

    /* renamed from: n  reason: collision with root package name */
    private com.facebook.imagepipeline.cache.e f11816n;

    /* renamed from: o  reason: collision with root package name */
    private com.facebook.cache.disk.h f11817o;

    /* renamed from: p  reason: collision with root package name */
    private com.facebook.imagepipeline.bitmaps.f f11818p;

    /* renamed from: q  reason: collision with root package name */
    private com.facebook.imagepipeline.platform.f f11819q;

    /* renamed from: r  reason: collision with root package name */
    private com.facebook.imagepipeline.animated.factory.a f11820r;

    public i(ImagePipelineConfig imagePipelineConfig) {
        if (com.facebook.imagepipeline.systrace.b.e()) {
            com.facebook.imagepipeline.systrace.b.a("ImagePipelineConfig()");
        }
        this.f11804b = (ImagePipelineConfig) com.facebook.common.internal.h.i(imagePipelineConfig);
        this.f11803a = new u0(imagePipelineConfig.getExecutorSupplier().a());
        if (com.facebook.imagepipeline.systrace.b.e()) {
            com.facebook.imagepipeline.systrace.b.c();
        }
    }

    @Nullable
    private com.facebook.imagepipeline.animated.factory.a b() {
        if (this.f11820r == null) {
            this.f11820r = com.facebook.imagepipeline.animated.factory.b.a(m(), this.f11804b.getExecutorSupplier(), c());
        }
        return this.f11820r;
    }

    private com.facebook.imagepipeline.decoder.b g() {
        com.facebook.imagepipeline.decoder.b bVar;
        if (this.f11811i == null) {
            if (this.f11804b.getImageDecoder() != null) {
                this.f11811i = this.f11804b.getImageDecoder();
            } else {
                com.facebook.imagepipeline.animated.factory.a b5 = b();
                com.facebook.imagepipeline.decoder.b bVar2 = null;
                if (b5 != null) {
                    bVar2 = b5.b(this.f11804b.getBitmapConfig());
                    bVar = b5.c(this.f11804b.getBitmapConfig());
                } else {
                    bVar = null;
                }
                if (this.f11804b.getImageDecoderConfig() == null) {
                    this.f11811i = new com.facebook.imagepipeline.decoder.a(bVar2, bVar, n());
                } else {
                    this.f11811i = new com.facebook.imagepipeline.decoder.a(bVar2, bVar, n(), this.f11804b.getImageDecoderConfig().a());
                    com.facebook.imageformat.d.e().g(this.f11804b.getImageDecoderConfig().b());
                }
            }
        }
        return this.f11811i;
    }

    private com.facebook.imagepipeline.transcoder.d i() {
        if (this.f11813k == null) {
            if (this.f11804b.getImageTranscoderFactory() == null && this.f11804b.getImageTranscoderType() == null && this.f11804b.getExperiments().m()) {
                this.f11813k = new com.facebook.imagepipeline.transcoder.h(this.f11804b.getExperiments().d());
            } else {
                this.f11813k = new com.facebook.imagepipeline.transcoder.f(this.f11804b.getExperiments().d(), this.f11804b.getExperiments().g(), this.f11804b.getImageTranscoderFactory(), this.f11804b.getImageTranscoderType());
            }
        }
        return this.f11813k;
    }

    public static i j() {
        return (i) com.facebook.common.internal.h.j(f11802t, "ImagePipelineFactory was not initialized!");
    }

    private k o() {
        if (this.f11814l == null) {
            this.f11814l = this.f11804b.getExperiments().e().a(this.f11804b.getContext(), this.f11804b.getPoolFactory().k(), g(), this.f11804b.getProgressiveJpegConfig(), this.f11804b.isDownsampleEnabled(), this.f11804b.isResizeAndRotateEnabledForNetwork(), this.f11804b.getExperiments().j(), this.f11804b.getExecutorSupplier(), this.f11804b.getPoolFactory().h(this.f11804b.getMemoryChunkType()), d(), f(), k(), q(), this.f11804b.getCacheKeyFactory(), m(), this.f11804b.getExperiments().c(), this.f11804b.getExperiments().b(), this.f11804b.getExperiments().a(), this.f11804b.getExperiments().d());
        }
        return this.f11814l;
    }

    private l p() {
        boolean z4 = Build.VERSION.SDK_INT >= 24 && this.f11804b.getExperiments().f();
        if (this.f11815m == null) {
            this.f11815m = new l(this.f11804b.getContext().getApplicationContext().getContentResolver(), o(), this.f11804b.getNetworkFetcher(), this.f11804b.isResizeAndRotateEnabledForNetwork(), this.f11804b.getExperiments().o(), this.f11803a, this.f11804b.isDownsampleEnabled(), z4, this.f11804b.getExperiments().n(), this.f11804b.isDiskCacheEnabled(), i());
        }
        return this.f11815m;
    }

    private com.facebook.imagepipeline.cache.e q() {
        if (this.f11816n == null) {
            this.f11816n = new com.facebook.imagepipeline.cache.e(r(), this.f11804b.getPoolFactory().h(this.f11804b.getMemoryChunkType()), this.f11804b.getPoolFactory().i(), this.f11804b.getExecutorSupplier().e(), this.f11804b.getExecutorSupplier().b(), this.f11804b.getImageCacheStatsTracker());
        }
        return this.f11816n;
    }

    public static synchronized boolean s() {
        boolean z4;
        synchronized (i.class) {
            z4 = f11802t != null;
        }
        return z4;
    }

    public static synchronized void t(Context context) {
        synchronized (i.class) {
            if (com.facebook.imagepipeline.systrace.b.e()) {
                com.facebook.imagepipeline.systrace.b.a("ImagePipelineFactory#initialize");
            }
            u(ImagePipelineConfig.newBuilder(context).build());
            if (com.facebook.imagepipeline.systrace.b.e()) {
                com.facebook.imagepipeline.systrace.b.c();
            }
        }
    }

    public static synchronized void u(ImagePipelineConfig imagePipelineConfig) {
        synchronized (i.class) {
            if (f11802t != null) {
                com.facebook.common.logging.a.k0(f11801s, "ImagePipelineFactory has already been initialized! `ImagePipelineFactory.initialize(...)` should only be called once to avoid unexpected behavior.");
            }
            f11802t = new i(imagePipelineConfig);
        }
    }

    public static void v(i iVar) {
        f11802t = iVar;
    }

    public static synchronized void w() {
        synchronized (i.class) {
            i iVar = f11802t;
            if (iVar != null) {
                iVar.d().b(com.facebook.common.internal.a.b());
                f11802t.f().b(com.facebook.common.internal.a.b());
                f11802t = null;
            }
        }
    }

    @Nullable
    public t0.a a(Context context) {
        com.facebook.imagepipeline.animated.factory.a b5 = b();
        if (b5 == null) {
            return null;
        }
        return b5.a(context);
    }

    public com.facebook.imagepipeline.cache.h<com.facebook.cache.common.c, com.facebook.imagepipeline.image.c> c() {
        if (this.f11805c == null) {
            this.f11805c = com.facebook.imagepipeline.cache.a.b(this.f11804b.getBitmapMemoryCacheParamsSupplier(), this.f11804b.getMemoryTrimmableRegistry(), this.f11804b.getBitmapMemoryCacheTrimStrategy());
        }
        return this.f11805c;
    }

    public o<com.facebook.cache.common.c, com.facebook.imagepipeline.image.c> d() {
        if (this.f11806d == null) {
            this.f11806d = com.facebook.imagepipeline.cache.b.a(c(), this.f11804b.getImageCacheStatsTracker());
        }
        return this.f11806d;
    }

    public com.facebook.imagepipeline.cache.h<com.facebook.cache.common.c, PooledByteBuffer> e() {
        if (this.f11807e == null) {
            this.f11807e = com.facebook.imagepipeline.cache.l.a(this.f11804b.getEncodedMemoryCacheParamsSupplier(), this.f11804b.getMemoryTrimmableRegistry());
        }
        return this.f11807e;
    }

    public o<com.facebook.cache.common.c, PooledByteBuffer> f() {
        if (this.f11808f == null) {
            this.f11808f = m.a(e(), this.f11804b.getImageCacheStatsTracker());
        }
        return this.f11808f;
    }

    public g h() {
        if (this.f11812j == null) {
            this.f11812j = new g(p(), this.f11804b.getRequestListeners(), this.f11804b.getIsPrefetchEnabledSupplier(), d(), f(), k(), q(), this.f11804b.getCacheKeyFactory(), this.f11803a, com.facebook.common.internal.l.a(Boolean.FALSE), this.f11804b.getExperiments().l());
        }
        return this.f11812j;
    }

    public com.facebook.imagepipeline.cache.e k() {
        if (this.f11809g == null) {
            this.f11809g = new com.facebook.imagepipeline.cache.e(l(), this.f11804b.getPoolFactory().h(this.f11804b.getMemoryChunkType()), this.f11804b.getPoolFactory().i(), this.f11804b.getExecutorSupplier().e(), this.f11804b.getExecutorSupplier().b(), this.f11804b.getImageCacheStatsTracker());
        }
        return this.f11809g;
    }

    public com.facebook.cache.disk.h l() {
        if (this.f11810h == null) {
            this.f11810h = this.f11804b.getFileCacheFactory().a(this.f11804b.getMainDiskCacheConfig());
        }
        return this.f11810h;
    }

    public com.facebook.imagepipeline.bitmaps.f m() {
        if (this.f11818p == null) {
            this.f11818p = com.facebook.imagepipeline.bitmaps.g.a(this.f11804b.getPoolFactory(), n());
        }
        return this.f11818p;
    }

    public com.facebook.imagepipeline.platform.f n() {
        if (this.f11819q == null) {
            this.f11819q = com.facebook.imagepipeline.platform.g.a(this.f11804b.getPoolFactory(), this.f11804b.getExperiments().k());
        }
        return this.f11819q;
    }

    public com.facebook.cache.disk.h r() {
        if (this.f11817o == null) {
            this.f11817o = this.f11804b.getFileCacheFactory().a(this.f11804b.getSmallImageDiskCacheConfig());
        }
        return this.f11817o;
    }
}
