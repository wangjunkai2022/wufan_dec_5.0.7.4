package com.facebook.imagepipeline.producers;

import javax.annotation.Nullable;
/* compiled from: ThreadHandoffProducer.java */
/* loaded from: classes2.dex */
public class t0<T> implements i0<T> {

    /* renamed from: c  reason: collision with root package name */
    public static final String f12386c = "BackgroundThreadHandoffProducer";

    /* renamed from: a  reason: collision with root package name */
    private final i0<T> f12387a;

    /* renamed from: b  reason: collision with root package name */
    private final u0 f12388b;

    /* compiled from: ThreadHandoffProducer.java */
    /* loaded from: classes.dex */
    class a extends r0<T> {

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ m0 f12389l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ String f12390m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ Consumer f12391n;

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ k0 f12392o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Consumer consumer, m0 m0Var, String str, String str2, m0 m0Var2, String str3, Consumer consumer2, k0 k0Var) {
            super(consumer, m0Var, str, str2);
            this.f12389l = m0Var2;
            this.f12390m = str3;
            this.f12391n = consumer2;
            this.f12392o = k0Var;
        }

        @Override // com.facebook.imagepipeline.producers.r0, com.facebook.common.executors.h
        protected void b(T t4) {
        }

        @Override // com.facebook.common.executors.h
        @Nullable
        protected T c() throws Exception {
            return null;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.producers.r0, com.facebook.common.executors.h
        public void f(T t4) {
            this.f12389l.e(this.f12390m, t0.f12386c, null);
            t0.this.f12387a.b(this.f12391n, this.f12392o);
        }
    }

    /* compiled from: ThreadHandoffProducer.java */
    /* loaded from: classes2.dex */
    class b extends e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ r0 f12394a;

        b(r0 r0Var) {
            this.f12394a = r0Var;
        }

        @Override // com.facebook.imagepipeline.producers.e, com.facebook.imagepipeline.producers.l0
        public void b() {
            this.f12394a.a();
            t0.this.f12388b.d(this.f12394a);
        }
    }

    public t0(i0<T> i0Var, u0 u0Var) {
        this.f12387a = (i0) com.facebook.common.internal.h.i(i0Var);
        this.f12388b = u0Var;
    }

    @Override // com.facebook.imagepipeline.producers.i0
    public void b(Consumer<T> consumer, k0 k0Var) {
        m0 listener = k0Var.getListener();
        String id = k0Var.getId();
        a aVar = new a(consumer, listener, f12386c, id, listener, id, consumer, k0Var);
        k0Var.c(new b(aVar));
        this.f12388b.a(aVar);
    }
}
