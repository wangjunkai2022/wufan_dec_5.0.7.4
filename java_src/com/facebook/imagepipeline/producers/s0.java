package com.facebook.imagepipeline.producers;
/* compiled from: SwallowResultProducer.java */
/* loaded from: classes2.dex */
public class s0<T> implements i0<Void> {

    /* renamed from: a  reason: collision with root package name */
    private final i0<T> f12382a;

    /* compiled from: SwallowResultProducer.java */
    /* loaded from: classes2.dex */
    class a extends m<T, Void> {
        a(Consumer consumer) {
            super(consumer);
        }

        @Override // com.facebook.imagepipeline.producers.b
        protected void h(T t4, int i4) {
            if (b.d(i4)) {
                p().b(null, i4);
            }
        }
    }

    public s0(i0<T> i0Var) {
        this.f12382a = i0Var;
    }

    @Override // com.facebook.imagepipeline.producers.i0
    public void b(Consumer<Void> consumer, k0 k0Var) {
        this.f12382a.b(new a(consumer), k0Var);
    }
}
