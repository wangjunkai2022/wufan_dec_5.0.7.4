package com.facebook.imagepipeline.producers;

import com.facebook.common.internal.ImmutableMap;
import com.facebook.imagepipeline.request.ImageRequest;
import com.tencent.bugly.Bugly;
/* compiled from: BitmapMemoryCacheProducer.java */
/* loaded from: classes2.dex */
public class h implements i0<com.facebook.common.references.a<com.facebook.imagepipeline.image.c>> {

    /* renamed from: d  reason: collision with root package name */
    public static final String f12211d = "BitmapMemoryCacheProducer";

    /* renamed from: e  reason: collision with root package name */
    public static final String f12212e = "cached_value_found";

    /* renamed from: a  reason: collision with root package name */
    private final com.facebook.imagepipeline.cache.p<com.facebook.cache.common.c, com.facebook.imagepipeline.image.c> f12213a;

    /* renamed from: b  reason: collision with root package name */
    private final com.facebook.imagepipeline.cache.f f12214b;

    /* renamed from: c  reason: collision with root package name */
    private final i0<com.facebook.common.references.a<com.facebook.imagepipeline.image.c>> f12215c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BitmapMemoryCacheProducer.java */
    /* loaded from: classes2.dex */
    public class a extends m<com.facebook.common.references.a<com.facebook.imagepipeline.image.c>, com.facebook.common.references.a<com.facebook.imagepipeline.image.c>> {

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ com.facebook.cache.common.c f12216i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ boolean f12217j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Consumer consumer, com.facebook.cache.common.c cVar, boolean z4) {
            super(consumer);
            this.f12216i = cVar;
            this.f12217j = z4;
        }

        @Override // com.facebook.imagepipeline.producers.b
        /* renamed from: q */
        public void h(com.facebook.common.references.a<com.facebook.imagepipeline.image.c> aVar, int i4) {
            com.facebook.common.references.a<com.facebook.imagepipeline.image.c> aVar2;
            boolean e5;
            try {
                if (com.facebook.imagepipeline.systrace.b.e()) {
                    com.facebook.imagepipeline.systrace.b.a("BitmapMemoryCacheProducer#onNewResultImpl");
                }
                boolean d5 = b.d(i4);
                if (aVar == null) {
                    if (d5) {
                        p().b(null, i4);
                    }
                    if (e5) {
                        return;
                    }
                    return;
                }
                if (!aVar.k().d() && !b.m(i4, 8)) {
                    if (!d5 && (aVar2 = h.this.f12213a.get(this.f12216i)) != null) {
                        com.facebook.imagepipeline.image.h a5 = aVar.k().a();
                        com.facebook.imagepipeline.image.h a6 = aVar2.k().a();
                        if (!a6.a() && a6.c() < a5.c()) {
                            com.facebook.common.references.a.h(aVar2);
                        } else {
                            p().b(aVar2, i4);
                            com.facebook.common.references.a.h(aVar2);
                            if (com.facebook.imagepipeline.systrace.b.e()) {
                                com.facebook.imagepipeline.systrace.b.c();
                                return;
                            }
                            return;
                        }
                    }
                    com.facebook.common.references.a<com.facebook.imagepipeline.image.c> a7 = this.f12217j ? h.this.f12213a.a(this.f12216i, aVar) : null;
                    if (d5) {
                        p().c(1.0f);
                    }
                    Consumer<com.facebook.common.references.a<com.facebook.imagepipeline.image.c>> p4 = p();
                    if (a7 != null) {
                        aVar = a7;
                    }
                    p4.b(aVar, i4);
                    com.facebook.common.references.a.h(a7);
                    if (com.facebook.imagepipeline.systrace.b.e()) {
                        com.facebook.imagepipeline.systrace.b.c();
                        return;
                    }
                    return;
                }
                p().b(aVar, i4);
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

    public h(com.facebook.imagepipeline.cache.p<com.facebook.cache.common.c, com.facebook.imagepipeline.image.c> pVar, com.facebook.imagepipeline.cache.f fVar, i0<com.facebook.common.references.a<com.facebook.imagepipeline.image.c>> i0Var) {
        this.f12213a = pVar;
        this.f12214b = fVar;
        this.f12215c = i0Var;
    }

    @Override // com.facebook.imagepipeline.producers.i0
    public void b(Consumer<com.facebook.common.references.a<com.facebook.imagepipeline.image.c>> consumer, k0 k0Var) {
        boolean e5;
        try {
            if (com.facebook.imagepipeline.systrace.b.e()) {
                com.facebook.imagepipeline.systrace.b.a("BitmapMemoryCacheProducer#produceResults");
            }
            m0 listener = k0Var.getListener();
            String id = k0Var.getId();
            listener.b(id, d());
            com.facebook.cache.common.c a5 = this.f12214b.a(k0Var.a(), k0Var.b());
            com.facebook.common.references.a<com.facebook.imagepipeline.image.c> aVar = this.f12213a.get(a5);
            if (aVar != null) {
                boolean a6 = aVar.k().a().a();
                if (a6) {
                    listener.e(id, d(), listener.d(id) ? ImmutableMap.of("cached_value_found", "true") : null);
                    listener.h(id, d(), true);
                    consumer.c(1.0f);
                }
                consumer.b(aVar, b.k(a6));
                aVar.close();
                if (a6) {
                    if (e5) {
                        return;
                    }
                    return;
                }
            }
            if (k0Var.f().getValue() >= ImageRequest.RequestLevel.BITMAP_MEMORY_CACHE.getValue()) {
                listener.e(id, d(), listener.d(id) ? ImmutableMap.of("cached_value_found", Bugly.SDK_IS_DEV) : null);
                listener.h(id, d(), false);
                consumer.b(null, 1);
                if (com.facebook.imagepipeline.systrace.b.e()) {
                    com.facebook.imagepipeline.systrace.b.c();
                    return;
                }
                return;
            }
            Consumer<com.facebook.common.references.a<com.facebook.imagepipeline.image.c>> e6 = e(consumer, a5, k0Var.a().x());
            listener.e(id, d(), listener.d(id) ? ImmutableMap.of("cached_value_found", Bugly.SDK_IS_DEV) : null);
            if (com.facebook.imagepipeline.systrace.b.e()) {
                com.facebook.imagepipeline.systrace.b.a("mInputProducer.produceResult");
            }
            this.f12215c.b(e6, k0Var);
            if (com.facebook.imagepipeline.systrace.b.e()) {
                com.facebook.imagepipeline.systrace.b.c();
            }
            if (com.facebook.imagepipeline.systrace.b.e()) {
                com.facebook.imagepipeline.systrace.b.c();
            }
        } finally {
            if (com.facebook.imagepipeline.systrace.b.e()) {
                com.facebook.imagepipeline.systrace.b.c();
            }
        }
    }

    protected String d() {
        return f12211d;
    }

    protected Consumer<com.facebook.common.references.a<com.facebook.imagepipeline.image.c>> e(Consumer<com.facebook.common.references.a<com.facebook.imagepipeline.image.c>> consumer, com.facebook.cache.common.c cVar, boolean z4) {
        return new a(consumer, cVar, z4);
    }
}
