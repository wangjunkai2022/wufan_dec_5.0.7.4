package com.facebook.imagepipeline.producers;

import android.graphics.Bitmap;
import com.facebook.common.internal.ImmutableMap;
import com.facebook.common.internal.VisibleForTesting;
import java.util.Map;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;
/* compiled from: PostprocessorProducer.java */
/* loaded from: classes2.dex */
public class h0 implements i0<com.facebook.common.references.a<com.facebook.imagepipeline.image.c>> {

    /* renamed from: d  reason: collision with root package name */
    public static final String f12219d = "PostprocessorProducer";
    @VisibleForTesting

    /* renamed from: e  reason: collision with root package name */
    static final String f12220e = "Postprocessor";

    /* renamed from: a  reason: collision with root package name */
    private final i0<com.facebook.common.references.a<com.facebook.imagepipeline.image.c>> f12221a;

    /* renamed from: b  reason: collision with root package name */
    private final com.facebook.imagepipeline.bitmaps.f f12222b;

    /* renamed from: c  reason: collision with root package name */
    private final Executor f12223c;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: PostprocessorProducer.java */
    /* loaded from: classes.dex */
    public class b extends m<com.facebook.common.references.a<com.facebook.imagepipeline.image.c>, com.facebook.common.references.a<com.facebook.imagepipeline.image.c>> {

        /* renamed from: i  reason: collision with root package name */
        private final m0 f12224i;

        /* renamed from: j  reason: collision with root package name */
        private final String f12225j;

        /* renamed from: k  reason: collision with root package name */
        private final com.facebook.imagepipeline.request.d f12226k;
        @GuardedBy("PostprocessorConsumer.this")

        /* renamed from: l  reason: collision with root package name */
        private boolean f12227l;
        @GuardedBy("PostprocessorConsumer.this")
        @Nullable

        /* renamed from: m  reason: collision with root package name */
        private com.facebook.common.references.a<com.facebook.imagepipeline.image.c> f12228m;
        @GuardedBy("PostprocessorConsumer.this")

        /* renamed from: n  reason: collision with root package name */
        private int f12229n;
        @GuardedBy("PostprocessorConsumer.this")

        /* renamed from: o  reason: collision with root package name */
        private boolean f12230o;
        @GuardedBy("PostprocessorConsumer.this")

        /* renamed from: p  reason: collision with root package name */
        private boolean f12231p;

        /* compiled from: PostprocessorProducer.java */
        /* loaded from: classes2.dex */
        class a extends e {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ h0 f12233a;

            a(h0 h0Var) {
                this.f12233a = h0Var;
            }

            @Override // com.facebook.imagepipeline.producers.e, com.facebook.imagepipeline.producers.l0
            public void b() {
                b.this.C();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: PostprocessorProducer.java */
        /* renamed from: com.facebook.imagepipeline.producers.h0$b$b  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public class RunnableC0276b implements Runnable {
            RunnableC0276b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                com.facebook.common.references.a aVar;
                int i4;
                synchronized (b.this) {
                    aVar = b.this.f12228m;
                    i4 = b.this.f12229n;
                    b.this.f12228m = null;
                    b.this.f12230o = false;
                }
                if (com.facebook.common.references.a.t(aVar)) {
                    try {
                        b.this.z(aVar, i4);
                    } finally {
                        com.facebook.common.references.a.h(aVar);
                    }
                }
                b.this.x();
            }
        }

        public b(Consumer<com.facebook.common.references.a<com.facebook.imagepipeline.image.c>> consumer, m0 m0Var, String str, com.facebook.imagepipeline.request.d dVar, k0 k0Var) {
            super(consumer);
            this.f12228m = null;
            this.f12229n = 0;
            this.f12230o = false;
            this.f12231p = false;
            this.f12224i = m0Var;
            this.f12225j = str;
            this.f12226k = dVar;
            k0Var.c(new a(h0.this));
        }

        @Nullable
        private Map<String, String> A(m0 m0Var, String str, com.facebook.imagepipeline.request.d dVar) {
            if (m0Var.d(str)) {
                return ImmutableMap.of(h0.f12220e, dVar.getName());
            }
            return null;
        }

        private synchronized boolean B() {
            return this.f12227l;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void C() {
            if (y()) {
                p().a();
            }
        }

        private void D(Throwable th) {
            if (y()) {
                p().onFailure(th);
            }
        }

        private void E(com.facebook.common.references.a<com.facebook.imagepipeline.image.c> aVar, int i4) {
            boolean d5 = com.facebook.imagepipeline.producers.b.d(i4);
            if ((d5 || B()) && !(d5 && y())) {
                return;
            }
            p().b(aVar, i4);
        }

        private com.facebook.common.references.a<com.facebook.imagepipeline.image.c> G(com.facebook.imagepipeline.image.c cVar) {
            com.facebook.imagepipeline.image.d dVar = (com.facebook.imagepipeline.image.d) cVar;
            com.facebook.common.references.a<Bitmap> c5 = this.f12226k.c(dVar.g(), h0.this.f12222b);
            try {
                return com.facebook.common.references.a.u(new com.facebook.imagepipeline.image.d(c5, cVar.a(), dVar.t(), dVar.r()));
            } finally {
                com.facebook.common.references.a.h(c5);
            }
        }

        private synchronized boolean H() {
            if (this.f12227l || !this.f12230o || this.f12231p || !com.facebook.common.references.a.t(this.f12228m)) {
                return false;
            }
            this.f12231p = true;
            return true;
        }

        private boolean I(com.facebook.imagepipeline.image.c cVar) {
            return cVar instanceof com.facebook.imagepipeline.image.d;
        }

        private void J() {
            h0.this.f12223c.execute(new RunnableC0276b());
        }

        private void K(@Nullable com.facebook.common.references.a<com.facebook.imagepipeline.image.c> aVar, int i4) {
            synchronized (this) {
                if (this.f12227l) {
                    return;
                }
                com.facebook.common.references.a<com.facebook.imagepipeline.image.c> aVar2 = this.f12228m;
                this.f12228m = com.facebook.common.references.a.d(aVar);
                this.f12229n = i4;
                this.f12230o = true;
                boolean H = H();
                com.facebook.common.references.a.h(aVar2);
                if (H) {
                    J();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void x() {
            boolean H;
            synchronized (this) {
                this.f12231p = false;
                H = H();
            }
            if (H) {
                J();
            }
        }

        private boolean y() {
            synchronized (this) {
                if (this.f12227l) {
                    return false;
                }
                com.facebook.common.references.a<com.facebook.imagepipeline.image.c> aVar = this.f12228m;
                this.f12228m = null;
                this.f12227l = true;
                com.facebook.common.references.a.h(aVar);
                return true;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void z(com.facebook.common.references.a<com.facebook.imagepipeline.image.c> aVar, int i4) {
            com.facebook.common.internal.h.d(com.facebook.common.references.a.t(aVar));
            if (!I(aVar.k())) {
                E(aVar, i4);
                return;
            }
            this.f12224i.b(this.f12225j, h0.f12219d);
            try {
                try {
                    com.facebook.common.references.a<com.facebook.imagepipeline.image.c> G = G(aVar.k());
                    m0 m0Var = this.f12224i;
                    String str = this.f12225j;
                    m0Var.e(str, h0.f12219d, A(m0Var, str, this.f12226k));
                    E(G, i4);
                    com.facebook.common.references.a.h(G);
                } catch (Exception e5) {
                    m0 m0Var2 = this.f12224i;
                    String str2 = this.f12225j;
                    m0Var2.f(str2, h0.f12219d, e5, A(m0Var2, str2, this.f12226k));
                    D(e5);
                    com.facebook.common.references.a.h(null);
                }
            } catch (Throwable th) {
                com.facebook.common.references.a.h(null);
                throw th;
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.producers.b
        /* renamed from: F */
        public void h(com.facebook.common.references.a<com.facebook.imagepipeline.image.c> aVar, int i4) {
            if (!com.facebook.common.references.a.t(aVar)) {
                if (com.facebook.imagepipeline.producers.b.d(i4)) {
                    E(null, i4);
                    return;
                }
                return;
            }
            K(aVar, i4);
        }

        @Override // com.facebook.imagepipeline.producers.m, com.facebook.imagepipeline.producers.b
        protected void f() {
            C();
        }

        @Override // com.facebook.imagepipeline.producers.m, com.facebook.imagepipeline.producers.b
        protected void g(Throwable th) {
            D(th);
        }
    }

    /* compiled from: PostprocessorProducer.java */
    /* loaded from: classes.dex */
    class c extends m<com.facebook.common.references.a<com.facebook.imagepipeline.image.c>, com.facebook.common.references.a<com.facebook.imagepipeline.image.c>> implements com.facebook.imagepipeline.request.f {
        @GuardedBy("RepeatedPostprocessorConsumer.this")

        /* renamed from: i  reason: collision with root package name */
        private boolean f12236i;
        @GuardedBy("RepeatedPostprocessorConsumer.this")
        @Nullable

        /* renamed from: j  reason: collision with root package name */
        private com.facebook.common.references.a<com.facebook.imagepipeline.image.c> f12237j;

        /* compiled from: PostprocessorProducer.java */
        /* loaded from: classes2.dex */
        class a extends e {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ h0 f12239a;

            a(h0 h0Var) {
                this.f12239a = h0Var;
            }

            @Override // com.facebook.imagepipeline.producers.e, com.facebook.imagepipeline.producers.l0
            public void b() {
                if (c.this.r()) {
                    c.this.p().a();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean r() {
            synchronized (this) {
                if (this.f12236i) {
                    return false;
                }
                com.facebook.common.references.a<com.facebook.imagepipeline.image.c> aVar = this.f12237j;
                this.f12237j = null;
                this.f12236i = true;
                com.facebook.common.references.a.h(aVar);
                return true;
            }
        }

        private void t(com.facebook.common.references.a<com.facebook.imagepipeline.image.c> aVar) {
            synchronized (this) {
                if (this.f12236i) {
                    return;
                }
                com.facebook.common.references.a<com.facebook.imagepipeline.image.c> aVar2 = this.f12237j;
                this.f12237j = com.facebook.common.references.a.d(aVar);
                com.facebook.common.references.a.h(aVar2);
            }
        }

        private void u() {
            synchronized (this) {
                if (this.f12236i) {
                    return;
                }
                com.facebook.common.references.a<com.facebook.imagepipeline.image.c> d5 = com.facebook.common.references.a.d(this.f12237j);
                try {
                    p().b(d5, 0);
                } finally {
                    com.facebook.common.references.a.h(d5);
                }
            }
        }

        @Override // com.facebook.imagepipeline.producers.m, com.facebook.imagepipeline.producers.b
        protected void f() {
            if (r()) {
                p().a();
            }
        }

        @Override // com.facebook.imagepipeline.producers.m, com.facebook.imagepipeline.producers.b
        protected void g(Throwable th) {
            if (r()) {
                p().onFailure(th);
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.producers.b
        /* renamed from: s */
        public void h(com.facebook.common.references.a<com.facebook.imagepipeline.image.c> aVar, int i4) {
            if (com.facebook.imagepipeline.producers.b.e(i4)) {
                return;
            }
            t(aVar);
            u();
        }

        @Override // com.facebook.imagepipeline.request.f
        public synchronized void update() {
            u();
        }

        private c(b bVar, com.facebook.imagepipeline.request.e eVar, k0 k0Var) {
            super(bVar);
            this.f12236i = false;
            this.f12237j = null;
            eVar.b(this);
            k0Var.c(new a(h0.this));
        }
    }

    /* compiled from: PostprocessorProducer.java */
    /* loaded from: classes2.dex */
    class d extends m<com.facebook.common.references.a<com.facebook.imagepipeline.image.c>, com.facebook.common.references.a<com.facebook.imagepipeline.image.c>> {
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.producers.b
        /* renamed from: q */
        public void h(com.facebook.common.references.a<com.facebook.imagepipeline.image.c> aVar, int i4) {
            if (com.facebook.imagepipeline.producers.b.e(i4)) {
                return;
            }
            p().b(aVar, i4);
        }

        private d(b bVar) {
            super(bVar);
        }
    }

    public h0(i0<com.facebook.common.references.a<com.facebook.imagepipeline.image.c>> i0Var, com.facebook.imagepipeline.bitmaps.f fVar, Executor executor) {
        this.f12221a = (i0) com.facebook.common.internal.h.i(i0Var);
        this.f12222b = fVar;
        this.f12223c = (Executor) com.facebook.common.internal.h.i(executor);
    }

    @Override // com.facebook.imagepipeline.producers.i0
    public void b(Consumer<com.facebook.common.references.a<com.facebook.imagepipeline.image.c>> consumer, k0 k0Var) {
        Consumer<com.facebook.common.references.a<com.facebook.imagepipeline.image.c>> dVar;
        m0 listener = k0Var.getListener();
        com.facebook.imagepipeline.request.d j4 = k0Var.a().j();
        b bVar = new b(consumer, listener, k0Var.getId(), j4, k0Var);
        if (j4 instanceof com.facebook.imagepipeline.request.e) {
            dVar = new c(bVar, (com.facebook.imagepipeline.request.e) j4, k0Var);
        } else {
            dVar = new d(bVar);
        }
        this.f12221a.b(dVar, k0Var);
    }
}
