package com.facebook.imagepipeline.producers;

import android.graphics.Bitmap;
import com.facebook.common.internal.ImmutableMap;
import com.facebook.common.util.ExceptionWithNoStacktrace;
import com.facebook.imagepipeline.producers.JobScheduler;
import com.facebook.imagepipeline.request.ImageRequest;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;
/* compiled from: DecodeProducer.java */
/* loaded from: classes2.dex */
public class l implements i0<com.facebook.common.references.a<com.facebook.imagepipeline.image.c>> {

    /* renamed from: j  reason: collision with root package name */
    public static final String f12263j = "DecodeProducer";

    /* renamed from: k  reason: collision with root package name */
    public static final String f12264k = "bitmapSize";

    /* renamed from: l  reason: collision with root package name */
    public static final String f12265l = "hasGoodQuality";

    /* renamed from: m  reason: collision with root package name */
    public static final String f12266m = "isFinal";

    /* renamed from: n  reason: collision with root package name */
    public static final String f12267n = "imageFormat";

    /* renamed from: o  reason: collision with root package name */
    public static final String f12268o = "encodedImageSize";

    /* renamed from: p  reason: collision with root package name */
    public static final String f12269p = "requestedImageSize";

    /* renamed from: q  reason: collision with root package name */
    public static final String f12270q = "sampleSize";

    /* renamed from: a  reason: collision with root package name */
    private final com.facebook.common.memory.a f12271a;

    /* renamed from: b  reason: collision with root package name */
    private final Executor f12272b;

    /* renamed from: c  reason: collision with root package name */
    private final com.facebook.imagepipeline.decoder.b f12273c;

    /* renamed from: d  reason: collision with root package name */
    private final com.facebook.imagepipeline.decoder.d f12274d;

    /* renamed from: e  reason: collision with root package name */
    private final i0<com.facebook.imagepipeline.image.e> f12275e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f12276f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f12277g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f12278h;

    /* renamed from: i  reason: collision with root package name */
    private final int f12279i;

    /* compiled from: DecodeProducer.java */
    /* loaded from: classes2.dex */
    private class a extends c {
        public a(Consumer<com.facebook.common.references.a<com.facebook.imagepipeline.image.c>> consumer, k0 k0Var, boolean z4, int i4) {
            super(consumer, k0Var, z4, i4);
        }

        @Override // com.facebook.imagepipeline.producers.l.c
        protected synchronized boolean E(com.facebook.imagepipeline.image.e eVar, int i4) {
            if (com.facebook.imagepipeline.producers.b.e(i4)) {
                return false;
            }
            return super.E(eVar, i4);
        }

        @Override // com.facebook.imagepipeline.producers.l.c
        protected int w(com.facebook.imagepipeline.image.e eVar) {
            return eVar.z();
        }

        @Override // com.facebook.imagepipeline.producers.l.c
        protected com.facebook.imagepipeline.image.h x() {
            return com.facebook.imagepipeline.image.g.d(0, false, false);
        }
    }

    /* compiled from: DecodeProducer.java */
    /* loaded from: classes2.dex */
    private class b extends c {

        /* renamed from: q  reason: collision with root package name */
        private final com.facebook.imagepipeline.decoder.e f12281q;

        /* renamed from: r  reason: collision with root package name */
        private final com.facebook.imagepipeline.decoder.d f12282r;

        /* renamed from: s  reason: collision with root package name */
        private int f12283s;

        public b(Consumer<com.facebook.common.references.a<com.facebook.imagepipeline.image.c>> consumer, k0 k0Var, com.facebook.imagepipeline.decoder.e eVar, com.facebook.imagepipeline.decoder.d dVar, boolean z4, int i4) {
            super(consumer, k0Var, z4, i4);
            this.f12281q = (com.facebook.imagepipeline.decoder.e) com.facebook.common.internal.h.i(eVar);
            this.f12282r = (com.facebook.imagepipeline.decoder.d) com.facebook.common.internal.h.i(dVar);
            this.f12283s = 0;
        }

        @Override // com.facebook.imagepipeline.producers.l.c
        protected synchronized boolean E(com.facebook.imagepipeline.image.e eVar, int i4) {
            boolean E = super.E(eVar, i4);
            if ((com.facebook.imagepipeline.producers.b.e(i4) || com.facebook.imagepipeline.producers.b.m(i4, 8)) && !com.facebook.imagepipeline.producers.b.m(i4, 4) && com.facebook.imagepipeline.image.e.J(eVar) && eVar.t() == com.facebook.imageformat.b.f11528a) {
                if (!this.f12281q.h(eVar)) {
                    return false;
                }
                int d5 = this.f12281q.d();
                int i5 = this.f12283s;
                if (d5 <= i5) {
                    return false;
                }
                if (d5 < this.f12282r.a(i5) && !this.f12281q.e()) {
                    return false;
                }
                this.f12283s = d5;
            }
            return E;
        }

        @Override // com.facebook.imagepipeline.producers.l.c
        protected int w(com.facebook.imagepipeline.image.e eVar) {
            return this.f12281q.c();
        }

        @Override // com.facebook.imagepipeline.producers.l.c
        protected com.facebook.imagepipeline.image.h x() {
            return this.f12282r.b(this.f12281q.d());
        }
    }

    /* compiled from: DecodeProducer.java */
    /* loaded from: classes.dex */
    private abstract class c extends m<com.facebook.imagepipeline.image.e, com.facebook.common.references.a<com.facebook.imagepipeline.image.c>> {

        /* renamed from: p  reason: collision with root package name */
        private static final int f12285p = 10;

        /* renamed from: i  reason: collision with root package name */
        private final String f12286i;

        /* renamed from: j  reason: collision with root package name */
        private final k0 f12287j;

        /* renamed from: k  reason: collision with root package name */
        private final m0 f12288k;

        /* renamed from: l  reason: collision with root package name */
        private final com.facebook.imagepipeline.common.b f12289l;
        @GuardedBy("this")

        /* renamed from: m  reason: collision with root package name */
        private boolean f12290m;

        /* renamed from: n  reason: collision with root package name */
        private final JobScheduler f12291n;

        /* compiled from: DecodeProducer.java */
        /* loaded from: classes2.dex */
        class a implements JobScheduler.d {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ l f12293a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ k0 f12294b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ int f12295c;

            a(l lVar, k0 k0Var, int i4) {
                this.f12293a = lVar;
                this.f12294b = k0Var;
                this.f12295c = i4;
            }

            @Override // com.facebook.imagepipeline.producers.JobScheduler.d
            public void a(com.facebook.imagepipeline.image.e eVar, int i4) {
                if (eVar != null) {
                    if (l.this.f12276f || !com.facebook.imagepipeline.producers.b.m(i4, 16)) {
                        ImageRequest a5 = this.f12294b.a();
                        if (l.this.f12277g || !com.facebook.common.util.f.m(a5.t())) {
                            eVar.Z(com.facebook.imagepipeline.transcoder.a.b(a5.r(), a5.p(), eVar, this.f12295c));
                        }
                    }
                    c.this.u(eVar, i4);
                }
            }
        }

        /* compiled from: DecodeProducer.java */
        /* loaded from: classes2.dex */
        class b extends e {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ l f12297a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ boolean f12298b;

            b(l lVar, boolean z4) {
                this.f12297a = lVar;
                this.f12298b = z4;
            }

            @Override // com.facebook.imagepipeline.producers.e, com.facebook.imagepipeline.producers.l0
            public void a() {
                if (c.this.f12287j.d()) {
                    c.this.f12291n.h();
                }
            }

            @Override // com.facebook.imagepipeline.producers.e, com.facebook.imagepipeline.producers.l0
            public void b() {
                if (this.f12298b) {
                    c.this.y();
                }
            }
        }

        public c(Consumer<com.facebook.common.references.a<com.facebook.imagepipeline.image.c>> consumer, k0 k0Var, boolean z4, int i4) {
            super(consumer);
            this.f12286i = "ProgressiveDecoder";
            this.f12287j = k0Var;
            this.f12288k = k0Var.getListener();
            com.facebook.imagepipeline.common.b g4 = k0Var.a().g();
            this.f12289l = g4;
            this.f12290m = false;
            this.f12291n = new JobScheduler(l.this.f12272b, new a(l.this, k0Var, i4), g4.f11707a);
            k0Var.c(new b(l.this, z4));
        }

        private void A(com.facebook.imagepipeline.image.c cVar, int i4) {
            com.facebook.common.references.a<com.facebook.imagepipeline.image.c> u4 = com.facebook.common.references.a.u(cVar);
            try {
                C(com.facebook.imagepipeline.producers.b.d(i4));
                p().b(u4, i4);
            } finally {
                com.facebook.common.references.a.h(u4);
            }
        }

        private synchronized boolean B() {
            return this.f12290m;
        }

        private void C(boolean z4) {
            synchronized (this) {
                if (z4) {
                    if (!this.f12290m) {
                        p().c(1.0f);
                        this.f12290m = true;
                        this.f12291n.c();
                    }
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Can't wrap try/catch for region: R(8:23|24|(10:(14:28|(12:32|33|34|35|37|38|39|(1:41)|42|43|44|45)|59|33|34|35|37|38|39|(0)|42|43|44|45)|(12:32|33|34|35|37|38|39|(0)|42|43|44|45)|37|38|39|(0)|42|43|44|45)|60|59|33|34|35) */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x00fd, code lost:
            r0 = e;
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x00fe, code lost:
            r2 = null;
         */
        /* JADX WARN: Removed duplicated region for block: B:42:0x00dd  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void u(com.facebook.imagepipeline.image.e r19, int r20) {
            /*
                Method dump skipped, instructions count: 334
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.producers.l.c.u(com.facebook.imagepipeline.image.e, int):void");
        }

        @Nullable
        private Map<String, String> v(@Nullable com.facebook.imagepipeline.image.c cVar, long j4, com.facebook.imagepipeline.image.h hVar, boolean z4, String str, String str2, String str3, String str4) {
            if (this.f12288k.d(this.f12287j.getId())) {
                String valueOf = String.valueOf(j4);
                String valueOf2 = String.valueOf(hVar.b());
                String valueOf3 = String.valueOf(z4);
                if (cVar instanceof com.facebook.imagepipeline.image.d) {
                    Bitmap g4 = ((com.facebook.imagepipeline.image.d) cVar).g();
                    HashMap hashMap = new HashMap(8);
                    hashMap.put(l.f12264k, g4.getWidth() + "x" + g4.getHeight());
                    hashMap.put("queueTime", valueOf);
                    hashMap.put(l.f12265l, valueOf2);
                    hashMap.put(l.f12266m, valueOf3);
                    hashMap.put("encodedImageSize", str2);
                    hashMap.put(l.f12267n, str);
                    hashMap.put(l.f12269p, str3);
                    hashMap.put(l.f12270q, str4);
                    return ImmutableMap.a(hashMap);
                }
                HashMap hashMap2 = new HashMap(7);
                hashMap2.put("queueTime", valueOf);
                hashMap2.put(l.f12265l, valueOf2);
                hashMap2.put(l.f12266m, valueOf3);
                hashMap2.put("encodedImageSize", str2);
                hashMap2.put(l.f12267n, str);
                hashMap2.put(l.f12269p, str3);
                hashMap2.put(l.f12270q, str4);
                return ImmutableMap.a(hashMap2);
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void y() {
            C(true);
            p().a();
        }

        private void z(Throwable th) {
            C(true);
            p().onFailure(th);
        }

        @Override // com.facebook.imagepipeline.producers.b
        /* renamed from: D */
        public void h(com.facebook.imagepipeline.image.e eVar, int i4) {
            try {
                if (com.facebook.imagepipeline.systrace.b.e()) {
                    com.facebook.imagepipeline.systrace.b.a("DecodeProducer#onNewResultImpl");
                }
                boolean d5 = com.facebook.imagepipeline.producers.b.d(i4);
                if (d5 && !com.facebook.imagepipeline.image.e.J(eVar)) {
                    z(new ExceptionWithNoStacktrace("Encoded image is not valid."));
                } else if (!E(eVar, i4)) {
                    if (com.facebook.imagepipeline.systrace.b.e()) {
                        com.facebook.imagepipeline.systrace.b.c();
                    }
                } else {
                    boolean m4 = com.facebook.imagepipeline.producers.b.m(i4, 4);
                    if (d5 || m4 || this.f12287j.d()) {
                        this.f12291n.h();
                    }
                    if (com.facebook.imagepipeline.systrace.b.e()) {
                        com.facebook.imagepipeline.systrace.b.c();
                    }
                }
            } finally {
                if (com.facebook.imagepipeline.systrace.b.e()) {
                    com.facebook.imagepipeline.systrace.b.c();
                }
            }
        }

        protected boolean E(com.facebook.imagepipeline.image.e eVar, int i4) {
            return this.f12291n.k(eVar, i4);
        }

        @Override // com.facebook.imagepipeline.producers.m, com.facebook.imagepipeline.producers.b
        public void f() {
            y();
        }

        @Override // com.facebook.imagepipeline.producers.m, com.facebook.imagepipeline.producers.b
        public void g(Throwable th) {
            z(th);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.producers.m, com.facebook.imagepipeline.producers.b
        public void i(float f5) {
            super.i(f5 * 0.99f);
        }

        protected abstract int w(com.facebook.imagepipeline.image.e eVar);

        protected abstract com.facebook.imagepipeline.image.h x();
    }

    public l(com.facebook.common.memory.a aVar, Executor executor, com.facebook.imagepipeline.decoder.b bVar, com.facebook.imagepipeline.decoder.d dVar, boolean z4, boolean z5, boolean z6, i0<com.facebook.imagepipeline.image.e> i0Var, int i4) {
        this.f12271a = (com.facebook.common.memory.a) com.facebook.common.internal.h.i(aVar);
        this.f12272b = (Executor) com.facebook.common.internal.h.i(executor);
        this.f12273c = (com.facebook.imagepipeline.decoder.b) com.facebook.common.internal.h.i(bVar);
        this.f12274d = (com.facebook.imagepipeline.decoder.d) com.facebook.common.internal.h.i(dVar);
        this.f12276f = z4;
        this.f12277g = z5;
        this.f12275e = (i0) com.facebook.common.internal.h.i(i0Var);
        this.f12278h = z6;
        this.f12279i = i4;
    }

    @Override // com.facebook.imagepipeline.producers.i0
    public void b(Consumer<com.facebook.common.references.a<com.facebook.imagepipeline.image.c>> consumer, k0 k0Var) {
        Consumer<com.facebook.imagepipeline.image.e> bVar;
        try {
            if (com.facebook.imagepipeline.systrace.b.e()) {
                com.facebook.imagepipeline.systrace.b.a("DecodeProducer#produceResults");
            }
            if (!com.facebook.common.util.f.m(k0Var.a().t())) {
                bVar = new a(consumer, k0Var, this.f12278h, this.f12279i);
            } else {
                bVar = new b(consumer, k0Var, new com.facebook.imagepipeline.decoder.e(this.f12271a), this.f12274d, this.f12278h, this.f12279i);
            }
            this.f12275e.b(bVar, k0Var);
        } finally {
            if (com.facebook.imagepipeline.systrace.b.e()) {
                com.facebook.imagepipeline.systrace.b.c();
            }
        }
    }
}
