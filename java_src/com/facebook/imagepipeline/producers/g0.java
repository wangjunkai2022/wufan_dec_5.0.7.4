package com.facebook.imagepipeline.producers;

import com.facebook.common.internal.ImmutableMap;
import com.facebook.common.internal.VisibleForTesting;
import com.facebook.imagepipeline.request.ImageRequest;
import com.tencent.bugly.Bugly;
/* compiled from: PostprocessedBitmapMemoryCacheProducer.java */
/* loaded from: classes2.dex */
public class g0 implements i0<com.facebook.common.references.a<com.facebook.imagepipeline.image.c>> {

    /* renamed from: d  reason: collision with root package name */
    public static final String f12202d = "PostprocessedBitmapMemoryCacheProducer";
    @VisibleForTesting

    /* renamed from: e  reason: collision with root package name */
    static final String f12203e = "cached_value_found";

    /* renamed from: a  reason: collision with root package name */
    private final com.facebook.imagepipeline.cache.p<com.facebook.cache.common.c, com.facebook.imagepipeline.image.c> f12204a;

    /* renamed from: b  reason: collision with root package name */
    private final com.facebook.imagepipeline.cache.f f12205b;

    /* renamed from: c  reason: collision with root package name */
    private final i0<com.facebook.common.references.a<com.facebook.imagepipeline.image.c>> f12206c;

    /* compiled from: PostprocessedBitmapMemoryCacheProducer.java */
    /* loaded from: classes2.dex */
    public static class a extends m<com.facebook.common.references.a<com.facebook.imagepipeline.image.c>, com.facebook.common.references.a<com.facebook.imagepipeline.image.c>> {

        /* renamed from: i  reason: collision with root package name */
        private final com.facebook.cache.common.c f12207i;

        /* renamed from: j  reason: collision with root package name */
        private final boolean f12208j;

        /* renamed from: k  reason: collision with root package name */
        private final com.facebook.imagepipeline.cache.p<com.facebook.cache.common.c, com.facebook.imagepipeline.image.c> f12209k;

        /* renamed from: l  reason: collision with root package name */
        private final boolean f12210l;

        public a(Consumer<com.facebook.common.references.a<com.facebook.imagepipeline.image.c>> consumer, com.facebook.cache.common.c cVar, boolean z4, com.facebook.imagepipeline.cache.p<com.facebook.cache.common.c, com.facebook.imagepipeline.image.c> pVar, boolean z5) {
            super(consumer);
            this.f12207i = cVar;
            this.f12208j = z4;
            this.f12209k = pVar;
            this.f12210l = z5;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.producers.b
        /* renamed from: q */
        public void h(com.facebook.common.references.a<com.facebook.imagepipeline.image.c> aVar, int i4) {
            if (aVar == null) {
                if (b.d(i4)) {
                    p().b(null, i4);
                }
            } else if (!b.e(i4) || this.f12208j) {
                com.facebook.common.references.a<com.facebook.imagepipeline.image.c> a5 = this.f12210l ? this.f12209k.a(this.f12207i, aVar) : null;
                try {
                    p().c(1.0f);
                    Consumer<com.facebook.common.references.a<com.facebook.imagepipeline.image.c>> p4 = p();
                    if (a5 != null) {
                        aVar = a5;
                    }
                    p4.b(aVar, i4);
                } finally {
                    com.facebook.common.references.a.h(a5);
                }
            }
        }
    }

    public g0(com.facebook.imagepipeline.cache.p<com.facebook.cache.common.c, com.facebook.imagepipeline.image.c> pVar, com.facebook.imagepipeline.cache.f fVar, i0<com.facebook.common.references.a<com.facebook.imagepipeline.image.c>> i0Var) {
        this.f12204a = pVar;
        this.f12205b = fVar;
        this.f12206c = i0Var;
    }

    @Override // com.facebook.imagepipeline.producers.i0
    public void b(Consumer<com.facebook.common.references.a<com.facebook.imagepipeline.image.c>> consumer, k0 k0Var) {
        m0 listener = k0Var.getListener();
        String id = k0Var.getId();
        ImageRequest a5 = k0Var.a();
        Object b5 = k0Var.b();
        com.facebook.imagepipeline.request.d j4 = a5.j();
        if (j4 != null && j4.a() != null) {
            listener.b(id, c());
            com.facebook.cache.common.c c5 = this.f12205b.c(a5, b5);
            com.facebook.common.references.a<com.facebook.imagepipeline.image.c> aVar = this.f12204a.get(c5);
            if (aVar != null) {
                listener.e(id, c(), listener.d(id) ? ImmutableMap.of("cached_value_found", "true") : null);
                listener.h(id, f12202d, true);
                consumer.c(1.0f);
                consumer.b(aVar, 1);
                aVar.close();
                return;
            }
            a aVar2 = new a(consumer, c5, j4 instanceof com.facebook.imagepipeline.request.e, this.f12204a, k0Var.a().x());
            listener.e(id, c(), listener.d(id) ? ImmutableMap.of("cached_value_found", Bugly.SDK_IS_DEV) : null);
            this.f12206c.b(aVar2, k0Var);
            return;
        }
        this.f12206c.b(consumer, k0Var);
    }

    protected String c() {
        return f12202d;
    }
}
