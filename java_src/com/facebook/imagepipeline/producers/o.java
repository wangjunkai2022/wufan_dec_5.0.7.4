package com.facebook.imagepipeline.producers;

import com.facebook.common.internal.VisibleForTesting;
import com.facebook.imagepipeline.request.ImageRequest;
/* compiled from: DiskCacheWriteProducer.java */
/* loaded from: classes2.dex */
public class o implements i0<com.facebook.imagepipeline.image.e> {
    @VisibleForTesting

    /* renamed from: e  reason: collision with root package name */
    static final String f12317e = "DiskCacheProducer";

    /* renamed from: a  reason: collision with root package name */
    private final com.facebook.imagepipeline.cache.e f12318a;

    /* renamed from: b  reason: collision with root package name */
    private final com.facebook.imagepipeline.cache.e f12319b;

    /* renamed from: c  reason: collision with root package name */
    private final com.facebook.imagepipeline.cache.f f12320c;

    /* renamed from: d  reason: collision with root package name */
    private final i0<com.facebook.imagepipeline.image.e> f12321d;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DiskCacheWriteProducer.java */
    /* loaded from: classes2.dex */
    public static class b extends m<com.facebook.imagepipeline.image.e, com.facebook.imagepipeline.image.e> {

        /* renamed from: i  reason: collision with root package name */
        private final k0 f12322i;

        /* renamed from: j  reason: collision with root package name */
        private final com.facebook.imagepipeline.cache.e f12323j;

        /* renamed from: k  reason: collision with root package name */
        private final com.facebook.imagepipeline.cache.e f12324k;

        /* renamed from: l  reason: collision with root package name */
        private final com.facebook.imagepipeline.cache.f f12325l;

        @Override // com.facebook.imagepipeline.producers.b
        /* renamed from: q */
        public void h(com.facebook.imagepipeline.image.e eVar, int i4) {
            if (!com.facebook.imagepipeline.producers.b.e(i4) && eVar != null && !com.facebook.imagepipeline.producers.b.l(i4, 10) && eVar.t() != com.facebook.imageformat.c.f11540c) {
                ImageRequest a5 = this.f12322i.a();
                com.facebook.cache.common.c d5 = this.f12325l.d(a5, this.f12322i.b());
                if (a5.f() == ImageRequest.CacheChoice.SMALL) {
                    this.f12324k.r(d5, eVar);
                } else {
                    this.f12323j.r(d5, eVar);
                }
                p().b(eVar, i4);
                return;
            }
            p().b(eVar, i4);
        }

        private b(Consumer<com.facebook.imagepipeline.image.e> consumer, k0 k0Var, com.facebook.imagepipeline.cache.e eVar, com.facebook.imagepipeline.cache.e eVar2, com.facebook.imagepipeline.cache.f fVar) {
            super(consumer);
            this.f12322i = k0Var;
            this.f12323j = eVar;
            this.f12324k = eVar2;
            this.f12325l = fVar;
        }
    }

    public o(com.facebook.imagepipeline.cache.e eVar, com.facebook.imagepipeline.cache.e eVar2, com.facebook.imagepipeline.cache.f fVar, i0<com.facebook.imagepipeline.image.e> i0Var) {
        this.f12318a = eVar;
        this.f12319b = eVar2;
        this.f12320c = fVar;
        this.f12321d = i0Var;
    }

    private void c(Consumer<com.facebook.imagepipeline.image.e> consumer, k0 k0Var) {
        if (k0Var.f().getValue() >= ImageRequest.RequestLevel.DISK_CACHE.getValue()) {
            consumer.b(null, 1);
            return;
        }
        if (k0Var.a().w()) {
            consumer = new b(consumer, k0Var, this.f12318a, this.f12319b, this.f12320c);
        }
        this.f12321d.b(consumer, k0Var);
    }

    @Override // com.facebook.imagepipeline.producers.i0
    public void b(Consumer<com.facebook.imagepipeline.image.e> consumer, k0 k0Var) {
        c(consumer, k0Var);
    }
}
