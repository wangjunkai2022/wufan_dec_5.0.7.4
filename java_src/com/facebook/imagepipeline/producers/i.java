package com.facebook.imagepipeline.producers;

import android.graphics.Bitmap;
/* compiled from: BitmapPrepareProducer.java */
/* loaded from: classes2.dex */
public class i implements i0<com.facebook.common.references.a<com.facebook.imagepipeline.image.c>> {

    /* renamed from: e  reason: collision with root package name */
    public static final String f12242e = "BitmapPrepareProducer";

    /* renamed from: a  reason: collision with root package name */
    private final i0<com.facebook.common.references.a<com.facebook.imagepipeline.image.c>> f12243a;

    /* renamed from: b  reason: collision with root package name */
    private final int f12244b;

    /* renamed from: c  reason: collision with root package name */
    private final int f12245c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f12246d;

    /* compiled from: BitmapPrepareProducer.java */
    /* loaded from: classes2.dex */
    private static class a extends m<com.facebook.common.references.a<com.facebook.imagepipeline.image.c>, com.facebook.common.references.a<com.facebook.imagepipeline.image.c>> {

        /* renamed from: i  reason: collision with root package name */
        private final int f12247i;

        /* renamed from: j  reason: collision with root package name */
        private final int f12248j;

        a(Consumer<com.facebook.common.references.a<com.facebook.imagepipeline.image.c>> consumer, int i4, int i5) {
            super(consumer);
            this.f12247i = i4;
            this.f12248j = i5;
        }

        private void q(com.facebook.common.references.a<com.facebook.imagepipeline.image.c> aVar) {
            com.facebook.imagepipeline.image.c k4;
            Bitmap g4;
            int rowBytes;
            if (aVar == null || !aVar.r() || (k4 = aVar.k()) == null || k4.isClosed() || !(k4 instanceof com.facebook.imagepipeline.image.d) || (g4 = ((com.facebook.imagepipeline.image.d) k4).g()) == null || (rowBytes = g4.getRowBytes() * g4.getHeight()) < this.f12247i || rowBytes > this.f12248j) {
                return;
            }
            g4.prepareToDraw();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.producers.b
        /* renamed from: r */
        public void h(com.facebook.common.references.a<com.facebook.imagepipeline.image.c> aVar, int i4) {
            q(aVar);
            p().b(aVar, i4);
        }
    }

    public i(i0<com.facebook.common.references.a<com.facebook.imagepipeline.image.c>> i0Var, int i4, int i5, boolean z4) {
        com.facebook.common.internal.h.d(i4 <= i5);
        this.f12243a = (i0) com.facebook.common.internal.h.i(i0Var);
        this.f12244b = i4;
        this.f12245c = i5;
        this.f12246d = z4;
    }

    @Override // com.facebook.imagepipeline.producers.i0
    public void b(Consumer<com.facebook.common.references.a<com.facebook.imagepipeline.image.c>> consumer, k0 k0Var) {
        if (k0Var.e() && !this.f12246d) {
            this.f12243a.b(consumer, k0Var);
        } else {
            this.f12243a.b(new a(consumer, this.f12244b, this.f12245c), k0Var);
        }
    }
}
