package com.facebook.imagepipeline.producers;

import com.facebook.imagepipeline.request.ImageRequest;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
/* compiled from: LocalFetchProducer.java */
/* loaded from: classes2.dex */
public abstract class x implements i0<com.facebook.imagepipeline.image.e> {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f12434a;

    /* renamed from: b  reason: collision with root package name */
    private final com.facebook.common.memory.g f12435b;

    /* compiled from: LocalFetchProducer.java */
    /* loaded from: classes.dex */
    class a extends r0<com.facebook.imagepipeline.image.e> {

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ ImageRequest f12436l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ m0 f12437m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ String f12438n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Consumer consumer, m0 m0Var, String str, String str2, ImageRequest imageRequest, m0 m0Var2, String str3) {
            super(consumer, m0Var, str, str2);
            this.f12436l = imageRequest;
            this.f12437m = m0Var2;
            this.f12438n = str3;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.producers.r0, com.facebook.common.executors.h
        /* renamed from: j */
        public void b(com.facebook.imagepipeline.image.e eVar) {
            com.facebook.imagepipeline.image.e.d(eVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.common.executors.h
        @Nullable
        /* renamed from: k */
        public com.facebook.imagepipeline.image.e c() throws Exception {
            com.facebook.imagepipeline.image.e d5 = x.this.d(this.f12436l);
            if (d5 == null) {
                this.f12437m.h(this.f12438n, x.this.f(), false);
                return null;
            }
            d5.K();
            this.f12437m.h(this.f12438n, x.this.f(), true);
            return d5;
        }
    }

    /* compiled from: LocalFetchProducer.java */
    /* loaded from: classes2.dex */
    class b extends e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ r0 f12440a;

        b(r0 r0Var) {
            this.f12440a = r0Var;
        }

        @Override // com.facebook.imagepipeline.producers.e, com.facebook.imagepipeline.producers.l0
        public void b() {
            this.f12440a.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public x(Executor executor, com.facebook.common.memory.g gVar) {
        this.f12434a = executor;
        this.f12435b = gVar;
    }

    @Override // com.facebook.imagepipeline.producers.i0
    public void b(Consumer<com.facebook.imagepipeline.image.e> consumer, k0 k0Var) {
        m0 listener = k0Var.getListener();
        String id = k0Var.getId();
        a aVar = new a(consumer, listener, f(), id, k0Var.a(), listener, id);
        k0Var.c(new b(aVar));
        this.f12434a.execute(aVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public com.facebook.imagepipeline.image.e c(InputStream inputStream, int i4) throws IOException {
        com.facebook.common.references.a u4;
        com.facebook.common.references.a aVar = null;
        try {
            if (i4 <= 0) {
                u4 = com.facebook.common.references.a.u(this.f12435b.a(inputStream));
            } else {
                u4 = com.facebook.common.references.a.u(this.f12435b.b(inputStream, i4));
            }
            aVar = u4;
            return new com.facebook.imagepipeline.image.e(aVar);
        } finally {
            com.facebook.common.internal.c.b(inputStream);
            com.facebook.common.references.a.h(aVar);
        }
    }

    protected abstract com.facebook.imagepipeline.image.e d(ImageRequest imageRequest) throws IOException;

    /* JADX INFO: Access modifiers changed from: protected */
    public com.facebook.imagepipeline.image.e e(InputStream inputStream, int i4) throws IOException {
        return c(inputStream, i4);
    }

    protected abstract String f();
}
