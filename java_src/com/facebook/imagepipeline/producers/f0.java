package com.facebook.imagepipeline.producers;

import android.net.Uri;
import com.facebook.common.internal.ImmutableMap;
import com.facebook.common.internal.VisibleForTesting;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.annotation.Nullable;
/* compiled from: PartialDiskCacheProducer.java */
/* loaded from: classes.dex */
public class f0 implements i0<com.facebook.imagepipeline.image.e> {

    /* renamed from: f  reason: collision with root package name */
    public static final String f12179f = "PartialDiskCacheProducer";

    /* renamed from: g  reason: collision with root package name */
    public static final String f12180g = "cached_value_found";

    /* renamed from: h  reason: collision with root package name */
    public static final String f12181h = "encodedImageSize";

    /* renamed from: a  reason: collision with root package name */
    private final com.facebook.imagepipeline.cache.e f12182a;

    /* renamed from: b  reason: collision with root package name */
    private final com.facebook.imagepipeline.cache.f f12183b;

    /* renamed from: c  reason: collision with root package name */
    private final com.facebook.common.memory.g f12184c;

    /* renamed from: d  reason: collision with root package name */
    private final com.facebook.common.memory.a f12185d;

    /* renamed from: e  reason: collision with root package name */
    private final i0<com.facebook.imagepipeline.image.e> f12186e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PartialDiskCacheProducer.java */
    /* loaded from: classes2.dex */
    public class a implements bolts.g<com.facebook.imagepipeline.image.e, Void> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ m0 f12187a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f12188b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Consumer f12189c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ k0 f12190d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ com.facebook.cache.common.c f12191e;

        a(m0 m0Var, String str, Consumer consumer, k0 k0Var, com.facebook.cache.common.c cVar) {
            this.f12187a = m0Var;
            this.f12188b = str;
            this.f12189c = consumer;
            this.f12190d = k0Var;
            this.f12191e = cVar;
        }

        @Override // bolts.g
        /* renamed from: b */
        public Void a(bolts.h<com.facebook.imagepipeline.image.e> hVar) throws Exception {
            if (f0.g(hVar)) {
                this.f12187a.g(this.f12188b, f0.f12179f, null);
                this.f12189c.a();
            } else if (hVar.F()) {
                this.f12187a.f(this.f12188b, f0.f12179f, hVar.A(), null);
                f0.this.i(this.f12189c, this.f12190d, this.f12191e, null);
            } else {
                com.facebook.imagepipeline.image.e B = hVar.B();
                if (B != null) {
                    m0 m0Var = this.f12187a;
                    String str = this.f12188b;
                    m0Var.e(str, f0.f12179f, f0.f(m0Var, str, true, B.z()));
                    com.facebook.imagepipeline.common.a e5 = com.facebook.imagepipeline.common.a.e(B.z() - 1);
                    B.T(e5);
                    int z4 = B.z();
                    ImageRequest a5 = this.f12190d.a();
                    if (e5.a(a5.e())) {
                        this.f12187a.h(this.f12188b, f0.f12179f, true);
                        this.f12189c.b(B, 9);
                    } else {
                        this.f12189c.b(B, 8);
                        f0.this.i(this.f12189c, new q0(ImageRequestBuilder.d(a5).w(com.facebook.imagepipeline.common.a.b(z4 - 1)).a(), this.f12190d), this.f12191e, B);
                    }
                } else {
                    m0 m0Var2 = this.f12187a;
                    String str2 = this.f12188b;
                    m0Var2.e(str2, f0.f12179f, f0.f(m0Var2, str2, false, 0));
                    f0.this.i(this.f12189c, this.f12190d, this.f12191e, B);
                }
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PartialDiskCacheProducer.java */
    /* loaded from: classes2.dex */
    public class b extends e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AtomicBoolean f12193a;

        b(AtomicBoolean atomicBoolean) {
            this.f12193a = atomicBoolean;
        }

        @Override // com.facebook.imagepipeline.producers.e, com.facebook.imagepipeline.producers.l0
        public void b() {
            this.f12193a.set(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: PartialDiskCacheProducer.java */
    /* loaded from: classes.dex */
    public static class c extends m<com.facebook.imagepipeline.image.e, com.facebook.imagepipeline.image.e> {

        /* renamed from: n  reason: collision with root package name */
        private static final int f12195n = 16384;

        /* renamed from: i  reason: collision with root package name */
        private final com.facebook.imagepipeline.cache.e f12196i;

        /* renamed from: j  reason: collision with root package name */
        private final com.facebook.cache.common.c f12197j;

        /* renamed from: k  reason: collision with root package name */
        private final com.facebook.common.memory.g f12198k;

        /* renamed from: l  reason: collision with root package name */
        private final com.facebook.common.memory.a f12199l;
        @Nullable

        /* renamed from: m  reason: collision with root package name */
        private final com.facebook.imagepipeline.image.e f12200m;

        /* synthetic */ c(Consumer consumer, com.facebook.imagepipeline.cache.e eVar, com.facebook.cache.common.c cVar, com.facebook.common.memory.g gVar, com.facebook.common.memory.a aVar, com.facebook.imagepipeline.image.e eVar2, a aVar2) {
            this(consumer, eVar, cVar, gVar, aVar, eVar2);
        }

        private void q(InputStream inputStream, OutputStream outputStream, int i4) throws IOException {
            byte[] bArr = this.f12199l.get(16384);
            int i5 = i4;
            while (i5 > 0) {
                try {
                    int read = inputStream.read(bArr, 0, Math.min(16384, i5));
                    if (read < 0) {
                        break;
                    } else if (read > 0) {
                        outputStream.write(bArr, 0, read);
                        i5 -= read;
                    }
                } finally {
                    this.f12199l.release(bArr);
                }
            }
            if (i5 > 0) {
                throw new IOException(String.format(null, "Failed to read %d bytes - finished %d short", Integer.valueOf(i4), Integer.valueOf(i5)));
            }
        }

        private com.facebook.common.memory.i r(com.facebook.imagepipeline.image.e eVar, com.facebook.imagepipeline.image.e eVar2) throws IOException {
            com.facebook.common.memory.i f5 = this.f12198k.f(eVar2.z() + eVar2.j().f11704a);
            q(eVar.u(), f5, eVar2.j().f11704a);
            q(eVar2.u(), f5, eVar2.z());
            return f5;
        }

        private void t(com.facebook.common.memory.i iVar) {
            com.facebook.imagepipeline.image.e eVar;
            Throwable th;
            com.facebook.common.references.a u4 = com.facebook.common.references.a.u(iVar.a());
            try {
                eVar = new com.facebook.imagepipeline.image.e(u4);
                try {
                    eVar.K();
                    p().b(eVar, 1);
                    com.facebook.imagepipeline.image.e.d(eVar);
                    com.facebook.common.references.a.h(u4);
                } catch (Throwable th2) {
                    th = th2;
                    com.facebook.imagepipeline.image.e.d(eVar);
                    com.facebook.common.references.a.h(u4);
                    throw th;
                }
            } catch (Throwable th3) {
                eVar = null;
                th = th3;
            }
        }

        @Override // com.facebook.imagepipeline.producers.b
        /* renamed from: s */
        public void h(com.facebook.imagepipeline.image.e eVar, int i4) {
            if (com.facebook.imagepipeline.producers.b.e(i4)) {
                return;
            }
            if (this.f12200m != null) {
                try {
                    if (eVar.j() != null) {
                        try {
                            t(r(this.f12200m, eVar));
                        } catch (IOException e5) {
                            com.facebook.common.logging.a.v(f0.f12179f, "Error while merging image data", e5);
                            p().onFailure(e5);
                        }
                        this.f12196i.t(this.f12197j);
                        return;
                    }
                } finally {
                    eVar.close();
                    this.f12200m.close();
                }
            }
            if (com.facebook.imagepipeline.producers.b.m(i4, 8) && com.facebook.imagepipeline.producers.b.d(i4) && eVar.t() != com.facebook.imageformat.c.f11540c) {
                this.f12196i.r(this.f12197j, eVar);
                p().b(eVar, i4);
                return;
            }
            p().b(eVar, i4);
        }

        private c(Consumer<com.facebook.imagepipeline.image.e> consumer, com.facebook.imagepipeline.cache.e eVar, com.facebook.cache.common.c cVar, com.facebook.common.memory.g gVar, com.facebook.common.memory.a aVar, @Nullable com.facebook.imagepipeline.image.e eVar2) {
            super(consumer);
            this.f12196i = eVar;
            this.f12197j = cVar;
            this.f12198k = gVar;
            this.f12199l = aVar;
            this.f12200m = eVar2;
        }
    }

    public f0(com.facebook.imagepipeline.cache.e eVar, com.facebook.imagepipeline.cache.f fVar, com.facebook.common.memory.g gVar, com.facebook.common.memory.a aVar, i0<com.facebook.imagepipeline.image.e> i0Var) {
        this.f12182a = eVar;
        this.f12183b = fVar;
        this.f12184c = gVar;
        this.f12185d = aVar;
        this.f12186e = i0Var;
    }

    private static Uri e(ImageRequest imageRequest) {
        return imageRequest.t().buildUpon().appendQueryParameter("fresco_partial", "true").build();
    }

    @VisibleForTesting
    @Nullable
    static Map<String, String> f(m0 m0Var, String str, boolean z4, int i4) {
        if (m0Var.d(str)) {
            if (z4) {
                return ImmutableMap.of("cached_value_found", String.valueOf(z4), "encodedImageSize", String.valueOf(i4));
            }
            return ImmutableMap.of("cached_value_found", String.valueOf(z4));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean g(bolts.h<?> hVar) {
        return hVar.D() || (hVar.F() && (hVar.A() instanceof CancellationException));
    }

    private bolts.g<com.facebook.imagepipeline.image.e, Void> h(Consumer<com.facebook.imagepipeline.image.e> consumer, k0 k0Var, com.facebook.cache.common.c cVar) {
        return new a(k0Var.getListener(), k0Var.getId(), consumer, k0Var, cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i(Consumer<com.facebook.imagepipeline.image.e> consumer, k0 k0Var, com.facebook.cache.common.c cVar, @Nullable com.facebook.imagepipeline.image.e eVar) {
        this.f12186e.b(new c(consumer, this.f12182a, cVar, this.f12184c, this.f12185d, eVar, null), k0Var);
    }

    private void j(AtomicBoolean atomicBoolean, k0 k0Var) {
        k0Var.c(new b(atomicBoolean));
    }

    @Override // com.facebook.imagepipeline.producers.i0
    public void b(Consumer<com.facebook.imagepipeline.image.e> consumer, k0 k0Var) {
        ImageRequest a5 = k0Var.a();
        if (!a5.w()) {
            this.f12186e.b(consumer, k0Var);
            return;
        }
        k0Var.getListener().b(k0Var.getId(), f12179f);
        com.facebook.cache.common.c b5 = this.f12183b.b(a5, e(a5), k0Var.b());
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.f12182a.p(b5, atomicBoolean).m(h(consumer, k0Var, b5));
        j(atomicBoolean, k0Var);
    }
}
