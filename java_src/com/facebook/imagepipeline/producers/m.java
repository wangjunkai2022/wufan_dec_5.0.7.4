package com.facebook.imagepipeline.producers;
/* compiled from: DelegatingConsumer.java */
/* loaded from: classes2.dex */
public abstract class m<I, O> extends b<I> {

    /* renamed from: h  reason: collision with root package name */
    private final Consumer<O> f12300h;

    public m(Consumer<O> consumer) {
        this.f12300h = consumer;
    }

    @Override // com.facebook.imagepipeline.producers.b
    protected void f() {
        this.f12300h.a();
    }

    @Override // com.facebook.imagepipeline.producers.b
    protected void g(Throwable th) {
        this.f12300h.onFailure(th);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.producers.b
    public void i(float f5) {
        this.f12300h.c(f5);
    }

    public Consumer<O> p() {
        return this.f12300h;
    }
}
