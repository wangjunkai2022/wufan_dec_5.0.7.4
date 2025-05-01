package com.facebook.imagepipeline.producers;

import com.facebook.common.internal.ImmutableMap;
import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.imagepipeline.request.ImageRequest;
import com.tencent.bugly.Bugly;
/* compiled from: EncodedMemoryCacheProducer.java */
/* loaded from: classes2.dex */
public class q implements i0<com.facebook.imagepipeline.image.e> {

    /* renamed from: d  reason: collision with root package name */
    public static final String f12352d = "EncodedMemoryCacheProducer";

    /* renamed from: e  reason: collision with root package name */
    public static final String f12353e = "cached_value_found";

    /* renamed from: a  reason: collision with root package name */
    private final com.facebook.imagepipeline.cache.p<com.facebook.cache.common.c, PooledByteBuffer> f12354a;

    /* renamed from: b  reason: collision with root package name */
    private final com.facebook.imagepipeline.cache.f f12355b;

    /* renamed from: c  reason: collision with root package name */
    private final i0<com.facebook.imagepipeline.image.e> f12356c;

    /* compiled from: EncodedMemoryCacheProducer.java */
    /* loaded from: classes2.dex */
    private static class a extends m<com.facebook.imagepipeline.image.e, com.facebook.imagepipeline.image.e> {

        /* renamed from: i  reason: collision with root package name */
        private final com.facebook.imagepipeline.cache.p<com.facebook.cache.common.c, PooledByteBuffer> f12357i;

        /* renamed from: j  reason: collision with root package name */
        private final com.facebook.cache.common.c f12358j;

        /* renamed from: k  reason: collision with root package name */
        private final boolean f12359k;

        public a(Consumer<com.facebook.imagepipeline.image.e> consumer, com.facebook.imagepipeline.cache.p<com.facebook.cache.common.c, PooledByteBuffer> pVar, com.facebook.cache.common.c cVar, boolean z4) {
            super(consumer);
            this.f12357i = pVar;
            this.f12358j = cVar;
            this.f12359k = z4;
        }

        @Override // com.facebook.imagepipeline.producers.b
        /* renamed from: q */
        public void h(com.facebook.imagepipeline.image.e eVar, int i4) {
            boolean e5;
            try {
                if (com.facebook.imagepipeline.systrace.b.e()) {
                    com.facebook.imagepipeline.systrace.b.a("EncodedMemoryCacheProducer#onNewResultImpl");
                }
                if (!b.e(i4) && eVar != null && !b.l(i4, 10) && eVar.t() != com.facebook.imageformat.c.f11540c) {
                    com.facebook.common.references.a<PooledByteBuffer> h4 = eVar.h();
                    if (h4 != null) {
                        com.facebook.common.references.a<PooledByteBuffer> a5 = this.f12359k ? this.f12357i.a(this.f12358j, h4) : null;
                        com.facebook.common.references.a.h(h4);
                        if (a5 != null) {
                            com.facebook.imagepipeline.image.e eVar2 = new com.facebook.imagepipeline.image.e(a5);
                            eVar2.g(eVar);
                            com.facebook.common.references.a.h(a5);
                            p().c(1.0f);
                            p().b(eVar2, i4);
                            com.facebook.imagepipeline.image.e.d(eVar2);
                            if (e5) {
                                return;
                            }
                            return;
                        }
                    }
                    p().b(eVar, i4);
                    if (com.facebook.imagepipeline.systrace.b.e()) {
                        com.facebook.imagepipeline.systrace.b.c();
                        return;
                    }
                    return;
                }
                p().b(eVar, i4);
                if (com.facebook.imagepipeline.systrace.b.e()) {
                    com.facebook.imagepipeline.systrace.b.c();
                }
            } finally {
                if (com.facebook.imagepipeline.systrace.b.e()) {
                    com.facebook.imagepipeline.systrace.b.c();
                }
            }
        }
    }

    public q(com.facebook.imagepipeline.cache.p<com.facebook.cache.common.c, PooledByteBuffer> pVar, com.facebook.imagepipeline.cache.f fVar, i0<com.facebook.imagepipeline.image.e> i0Var) {
        this.f12354a = pVar;
        this.f12355b = fVar;
        this.f12356c = i0Var;
    }

    @Override // com.facebook.imagepipeline.producers.i0
    public void b(Consumer<com.facebook.imagepipeline.image.e> consumer, k0 k0Var) {
        try {
            if (com.facebook.imagepipeline.systrace.b.e()) {
                com.facebook.imagepipeline.systrace.b.a("EncodedMemoryCacheProducer#produceResults");
            }
            String id = k0Var.getId();
            m0 listener = k0Var.getListener();
            listener.b(id, f12352d);
            com.facebook.cache.common.c d5 = this.f12355b.d(k0Var.a(), k0Var.b());
            com.facebook.common.references.a<PooledByteBuffer> aVar = this.f12354a.get(d5);
            if (aVar != null) {
                com.facebook.imagepipeline.image.e eVar = new com.facebook.imagepipeline.image.e(aVar);
                listener.e(id, f12352d, listener.d(id) ? ImmutableMap.of("cached_value_found", "true") : null);
                listener.h(id, f12352d, true);
                consumer.c(1.0f);
                consumer.b(eVar, 1);
                com.facebook.imagepipeline.image.e.d(eVar);
                com.facebook.common.references.a.h(aVar);
            } else if (k0Var.f().getValue() >= ImageRequest.RequestLevel.ENCODED_MEMORY_CACHE.getValue()) {
                listener.e(id, f12352d, listener.d(id) ? ImmutableMap.of("cached_value_found", Bugly.SDK_IS_DEV) : null);
                listener.h(id, f12352d, false);
                consumer.b(null, 1);
                com.facebook.common.references.a.h(aVar);
                if (com.facebook.imagepipeline.systrace.b.e()) {
                    com.facebook.imagepipeline.systrace.b.c();
                }
            } else {
                a aVar2 = new a(consumer, this.f12354a, d5, k0Var.a().x());
                listener.e(id, f12352d, listener.d(id) ? ImmutableMap.of("cached_value_found", Bugly.SDK_IS_DEV) : null);
                this.f12356c.b(aVar2, k0Var);
                com.facebook.common.references.a.h(aVar);
                if (com.facebook.imagepipeline.systrace.b.e()) {
                    com.facebook.imagepipeline.systrace.b.c();
                }
            }
        } finally {
            if (com.facebook.imagepipeline.systrace.b.e()) {
                com.facebook.imagepipeline.systrace.b.c();
            }
        }
    }
}
