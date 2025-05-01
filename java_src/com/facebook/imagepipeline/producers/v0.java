package com.facebook.imagepipeline.producers;

import android.util.Pair;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;
/* compiled from: ThrottlingProducer.java */
/* loaded from: classes2.dex */
public class v0<T> implements i0<T> {

    /* renamed from: f  reason: collision with root package name */
    public static final String f12410f = "ThrottlingProducer";

    /* renamed from: a  reason: collision with root package name */
    private final i0<T> f12411a;

    /* renamed from: b  reason: collision with root package name */
    private final int f12412b;

    /* renamed from: e  reason: collision with root package name */
    private final Executor f12415e;
    @GuardedBy("this")

    /* renamed from: d  reason: collision with root package name */
    private final ConcurrentLinkedQueue<Pair<Consumer<T>, k0>> f12414d = new ConcurrentLinkedQueue<>();
    @GuardedBy("this")

    /* renamed from: c  reason: collision with root package name */
    private int f12413c = 0;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ThrottlingProducer.java */
    /* loaded from: classes2.dex */
    public class b extends m<T, T> {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ThrottlingProducer.java */
        /* loaded from: classes2.dex */
        public class a implements Runnable {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ Pair f12417b;

            a(Pair pair) {
                this.f12417b = pair;
            }

            @Override // java.lang.Runnable
            public void run() {
                v0 v0Var = v0.this;
                Pair pair = this.f12417b;
                v0Var.f((Consumer) pair.first, (k0) pair.second);
            }
        }

        private void q() {
            Pair pair;
            synchronized (v0.this) {
                pair = (Pair) v0.this.f12414d.poll();
                if (pair == null) {
                    v0.d(v0.this);
                }
            }
            if (pair != null) {
                v0.this.f12415e.execute(new a(pair));
            }
        }

        @Override // com.facebook.imagepipeline.producers.m, com.facebook.imagepipeline.producers.b
        protected void f() {
            p().a();
            q();
        }

        @Override // com.facebook.imagepipeline.producers.m, com.facebook.imagepipeline.producers.b
        protected void g(Throwable th) {
            p().onFailure(th);
            q();
        }

        @Override // com.facebook.imagepipeline.producers.b
        protected void h(T t4, int i4) {
            p().b(t4, i4);
            if (com.facebook.imagepipeline.producers.b.d(i4)) {
                q();
            }
        }

        private b(Consumer<T> consumer) {
            super(consumer);
        }
    }

    public v0(int i4, Executor executor, i0<T> i0Var) {
        this.f12412b = i4;
        this.f12415e = (Executor) com.facebook.common.internal.h.i(executor);
        this.f12411a = (i0) com.facebook.common.internal.h.i(i0Var);
    }

    static /* synthetic */ int d(v0 v0Var) {
        int i4 = v0Var.f12413c;
        v0Var.f12413c = i4 - 1;
        return i4;
    }

    @Override // com.facebook.imagepipeline.producers.i0
    public void b(Consumer<T> consumer, k0 k0Var) {
        boolean z4;
        k0Var.getListener().b(k0Var.getId(), f12410f);
        synchronized (this) {
            int i4 = this.f12413c;
            z4 = true;
            if (i4 >= this.f12412b) {
                this.f12414d.add(Pair.create(consumer, k0Var));
            } else {
                this.f12413c = i4 + 1;
                z4 = false;
            }
        }
        if (z4) {
            return;
        }
        f(consumer, k0Var);
    }

    void f(Consumer<T> consumer, k0 k0Var) {
        k0Var.getListener().e(k0Var.getId(), f12410f, null);
        this.f12411a.b(new b(consumer), k0Var);
    }
}
