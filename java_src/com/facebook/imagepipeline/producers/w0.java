package com.facebook.imagepipeline.producers;
/* compiled from: ThumbnailBranchProducer.java */
/* loaded from: classes2.dex */
public class w0 implements i0<com.facebook.imagepipeline.image.e> {

    /* renamed from: a  reason: collision with root package name */
    private final x0<com.facebook.imagepipeline.image.e>[] f12429a;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ThumbnailBranchProducer.java */
    /* loaded from: classes2.dex */
    public class a extends m<com.facebook.imagepipeline.image.e, com.facebook.imagepipeline.image.e> {

        /* renamed from: i  reason: collision with root package name */
        private final k0 f12430i;

        /* renamed from: j  reason: collision with root package name */
        private final int f12431j;

        /* renamed from: k  reason: collision with root package name */
        private final com.facebook.imagepipeline.common.d f12432k;

        public a(Consumer<com.facebook.imagepipeline.image.e> consumer, k0 k0Var, int i4) {
            super(consumer);
            this.f12430i = k0Var;
            this.f12431j = i4;
            this.f12432k = k0Var.a().p();
        }

        @Override // com.facebook.imagepipeline.producers.m, com.facebook.imagepipeline.producers.b
        protected void g(Throwable th) {
            if (w0.this.e(this.f12431j + 1, p(), this.f12430i)) {
                return;
            }
            p().onFailure(th);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.producers.b
        /* renamed from: q */
        public void h(com.facebook.imagepipeline.image.e eVar, int i4) {
            if (eVar != null && (b.e(i4) || y0.c(eVar, this.f12432k))) {
                p().b(eVar, i4);
            } else if (b.d(i4)) {
                com.facebook.imagepipeline.image.e.d(eVar);
                if (w0.this.e(this.f12431j + 1, p(), this.f12430i)) {
                    return;
                }
                p().b(null, 1);
            }
        }
    }

    public w0(x0<com.facebook.imagepipeline.image.e>... x0VarArr) {
        x0<com.facebook.imagepipeline.image.e>[] x0VarArr2 = (x0[]) com.facebook.common.internal.h.i(x0VarArr);
        this.f12429a = x0VarArr2;
        com.facebook.common.internal.h.g(0, x0VarArr2.length);
    }

    private int d(int i4, com.facebook.imagepipeline.common.d dVar) {
        while (true) {
            x0<com.facebook.imagepipeline.image.e>[] x0VarArr = this.f12429a;
            if (i4 >= x0VarArr.length) {
                return -1;
            }
            if (x0VarArr[i4].a(dVar)) {
                return i4;
            }
            i4++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean e(int i4, Consumer<com.facebook.imagepipeline.image.e> consumer, k0 k0Var) {
        int d5 = d(i4, k0Var.a().p());
        if (d5 == -1) {
            return false;
        }
        this.f12429a[d5].b(new a(consumer, k0Var, d5), k0Var);
        return true;
    }

    @Override // com.facebook.imagepipeline.producers.i0
    public void b(Consumer<com.facebook.imagepipeline.image.e> consumer, k0 k0Var) {
        if (k0Var.a().p() == null) {
            consumer.b(null, 1);
        } else if (e(0, consumer, k0Var)) {
        } else {
            consumer.b(null, 1);
        }
    }
}
