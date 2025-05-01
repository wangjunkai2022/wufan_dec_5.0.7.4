package com.facebook.imagepipeline.producers;

import com.facebook.common.memory.PooledByteBuffer;
/* compiled from: RemoveImageTransformMetaDataProducer.java */
/* loaded from: classes2.dex */
public class o0 implements i0<com.facebook.common.references.a<PooledByteBuffer>> {

    /* renamed from: a  reason: collision with root package name */
    private final i0<com.facebook.imagepipeline.image.e> f12326a;

    /* compiled from: RemoveImageTransformMetaDataProducer.java */
    /* loaded from: classes2.dex */
    private class b extends m<com.facebook.imagepipeline.image.e, com.facebook.common.references.a<PooledByteBuffer>> {
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.producers.b
        /* renamed from: q */
        public void h(com.facebook.imagepipeline.image.e eVar, int i4) {
            try {
                r0 = com.facebook.imagepipeline.image.e.J(eVar) ? eVar.h() : null;
                p().b(r0, i4);
            } finally {
                com.facebook.common.references.a.h(r0);
            }
        }

        private b(Consumer<com.facebook.common.references.a<PooledByteBuffer>> consumer) {
            super(consumer);
        }
    }

    public o0(i0<com.facebook.imagepipeline.image.e> i0Var) {
        this.f12326a = i0Var;
    }

    @Override // com.facebook.imagepipeline.producers.i0
    public void b(Consumer<com.facebook.common.references.a<PooledByteBuffer>> consumer, k0 k0Var) {
        this.f12326a.b(new b(consumer), k0Var);
    }
}
