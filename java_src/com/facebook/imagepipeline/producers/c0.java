package com.facebook.imagepipeline.producers;

import android.os.SystemClock;
import com.facebook.common.internal.VisibleForTesting;
import com.facebook.imagepipeline.producers.d0;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import javax.annotation.Nullable;
/* compiled from: NetworkFetchProducer.java */
/* loaded from: classes.dex */
public class c0 implements i0<com.facebook.imagepipeline.image.e> {

    /* renamed from: d  reason: collision with root package name */
    public static final String f12159d = "NetworkFetchProducer";

    /* renamed from: e  reason: collision with root package name */
    public static final String f12160e = "intermediate_result";

    /* renamed from: f  reason: collision with root package name */
    private static final int f12161f = 16384;
    @VisibleForTesting

    /* renamed from: g  reason: collision with root package name */
    static final long f12162g = 100;

    /* renamed from: a  reason: collision with root package name */
    private final com.facebook.common.memory.g f12163a;

    /* renamed from: b  reason: collision with root package name */
    private final com.facebook.common.memory.a f12164b;

    /* renamed from: c  reason: collision with root package name */
    private final d0 f12165c;

    /* compiled from: NetworkFetchProducer.java */
    /* loaded from: classes2.dex */
    class a implements d0.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ r f12166a;

        a(r rVar) {
            this.f12166a = rVar;
        }

        @Override // com.facebook.imagepipeline.producers.d0.a
        public void a() {
            c0.this.j(this.f12166a);
        }

        @Override // com.facebook.imagepipeline.producers.d0.a
        public void b(InputStream inputStream, int i4) throws IOException {
            if (com.facebook.imagepipeline.systrace.b.e()) {
                com.facebook.imagepipeline.systrace.b.a("NetworkFetcher->onResponse");
            }
            c0.this.l(this.f12166a, inputStream, i4);
            if (com.facebook.imagepipeline.systrace.b.e()) {
                com.facebook.imagepipeline.systrace.b.c();
            }
        }

        @Override // com.facebook.imagepipeline.producers.d0.a
        public void onFailure(Throwable th) {
            c0.this.k(this.f12166a, th);
        }
    }

    public c0(com.facebook.common.memory.g gVar, com.facebook.common.memory.a aVar, d0 d0Var) {
        this.f12163a = gVar;
        this.f12164b = aVar;
        this.f12165c = d0Var;
    }

    protected static float e(int i4, int i5) {
        if (i5 > 0) {
            return i4 / i5;
        }
        double d5 = -i4;
        Double.isNaN(d5);
        return 1.0f - ((float) Math.exp(d5 / 50000.0d));
    }

    @Nullable
    private Map<String, String> f(r rVar, int i4) {
        if (rVar.d().d(rVar.b())) {
            return this.f12165c.d(rVar, i4);
        }
        return null;
    }

    protected static void i(com.facebook.common.memory.i iVar, int i4, @Nullable com.facebook.imagepipeline.common.a aVar, Consumer<com.facebook.imagepipeline.image.e> consumer) {
        com.facebook.imagepipeline.image.e eVar;
        com.facebook.common.references.a u4 = com.facebook.common.references.a.u(iVar.a());
        com.facebook.imagepipeline.image.e eVar2 = null;
        try {
            eVar = new com.facebook.imagepipeline.image.e(u4);
        } catch (Throwable th) {
            th = th;
        }
        try {
            eVar.T(aVar);
            eVar.K();
            consumer.b(eVar, i4);
            com.facebook.imagepipeline.image.e.d(eVar);
            com.facebook.common.references.a.h(u4);
        } catch (Throwable th2) {
            th = th2;
            eVar2 = eVar;
            com.facebook.imagepipeline.image.e.d(eVar2);
            com.facebook.common.references.a.h(u4);
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j(r rVar) {
        rVar.d().g(rVar.b(), f12159d, null);
        rVar.a().a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k(r rVar, Throwable th) {
        rVar.d().f(rVar.b(), f12159d, th, null);
        rVar.d().h(rVar.b(), f12159d, false);
        rVar.a().onFailure(th);
    }

    private boolean m(r rVar) {
        if (rVar.getContext().d()) {
            return this.f12165c.c(rVar);
        }
        return false;
    }

    @Override // com.facebook.imagepipeline.producers.i0
    public void b(Consumer<com.facebook.imagepipeline.image.e> consumer, k0 k0Var) {
        k0Var.getListener().b(k0Var.getId(), f12159d);
        r e5 = this.f12165c.e(consumer, k0Var);
        this.f12165c.a(e5, new a(e5));
    }

    protected void g(com.facebook.common.memory.i iVar, r rVar) {
        Map<String, String> f5 = f(rVar, iVar.size());
        m0 d5 = rVar.d();
        d5.e(rVar.b(), f12159d, f5);
        d5.h(rVar.b(), f12159d, true);
        i(iVar, rVar.e() | 1, rVar.f(), rVar.a());
    }

    protected void h(com.facebook.common.memory.i iVar, r rVar) {
        long uptimeMillis = SystemClock.uptimeMillis();
        if (!m(rVar) || uptimeMillis - rVar.c() < 100) {
            return;
        }
        rVar.h(uptimeMillis);
        rVar.d().j(rVar.b(), f12159d, f12160e);
        i(iVar, rVar.e(), rVar.f(), rVar.a());
    }

    protected void l(r rVar, InputStream inputStream, int i4) throws IOException {
        com.facebook.common.memory.i c5;
        if (i4 > 0) {
            c5 = this.f12163a.f(i4);
        } else {
            c5 = this.f12163a.c();
        }
        byte[] bArr = this.f12164b.get(16384);
        while (true) {
            try {
                int read = inputStream.read(bArr);
                if (read < 0) {
                    this.f12165c.b(rVar, c5.size());
                    g(c5, rVar);
                    return;
                } else if (read > 0) {
                    c5.write(bArr, 0, read);
                    h(c5, rVar);
                    rVar.a().c(e(c5.size(), i4));
                }
            } finally {
                this.f12164b.release(bArr);
                c5.close();
            }
        }
    }
}
