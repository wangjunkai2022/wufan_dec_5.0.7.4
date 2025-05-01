package com.facebook.imagepipeline.producers;

import com.facebook.imagepipeline.request.ImageRequest;
/* compiled from: BranchOnSeparateImagesProducer.java */
/* loaded from: classes2.dex */
public class j implements i0<com.facebook.imagepipeline.image.e> {

    /* renamed from: a  reason: collision with root package name */
    private final i0<com.facebook.imagepipeline.image.e> f12249a;

    /* renamed from: b  reason: collision with root package name */
    private final i0<com.facebook.imagepipeline.image.e> f12250b;

    /* compiled from: BranchOnSeparateImagesProducer.java */
    /* loaded from: classes2.dex */
    private class b extends m<com.facebook.imagepipeline.image.e, com.facebook.imagepipeline.image.e> {

        /* renamed from: i  reason: collision with root package name */
        private k0 f12251i;

        @Override // com.facebook.imagepipeline.producers.m, com.facebook.imagepipeline.producers.b
        protected void g(Throwable th) {
            j.this.f12250b.b(p(), this.f12251i);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.producers.b
        /* renamed from: q */
        public void h(com.facebook.imagepipeline.image.e eVar, int i4) {
            ImageRequest a5 = this.f12251i.a();
            boolean d5 = com.facebook.imagepipeline.producers.b.d(i4);
            boolean c5 = y0.c(eVar, a5.p());
            if (eVar != null && (c5 || a5.h())) {
                if (d5 && c5) {
                    p().b(eVar, i4);
                } else {
                    p().b(eVar, com.facebook.imagepipeline.producers.b.n(i4, 1));
                }
            }
            if (!d5 || c5) {
                return;
            }
            com.facebook.imagepipeline.image.e.d(eVar);
            j.this.f12250b.b(p(), this.f12251i);
        }

        private b(Consumer<com.facebook.imagepipeline.image.e> consumer, k0 k0Var) {
            super(consumer);
            this.f12251i = k0Var;
        }
    }

    public j(i0<com.facebook.imagepipeline.image.e> i0Var, i0<com.facebook.imagepipeline.image.e> i0Var2) {
        this.f12249a = i0Var;
        this.f12250b = i0Var2;
    }

    @Override // com.facebook.imagepipeline.producers.i0
    public void b(Consumer<com.facebook.imagepipeline.image.e> consumer, k0 k0Var) {
        this.f12249a.b(new b(consumer, k0Var), k0Var);
    }
}
