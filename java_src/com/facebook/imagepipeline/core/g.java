package com.facebook.imagepipeline.core;

import android.net.Uri;
import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.imagepipeline.cache.p;
import com.facebook.imagepipeline.common.Priority;
import com.facebook.imagepipeline.producers.i0;
import com.facebook.imagepipeline.producers.q0;
import com.facebook.imagepipeline.producers.u0;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLong;
import javax.annotation.Nullable;
import javax.annotation.concurrent.ThreadSafe;
/* compiled from: ImagePipeline.java */
@ThreadSafe
/* loaded from: classes.dex */
public class g {

    /* renamed from: m  reason: collision with root package name */
    private static final CancellationException f11737m = new CancellationException("Prefetching is not enabled");

    /* renamed from: a  reason: collision with root package name */
    private final l f11738a;

    /* renamed from: b  reason: collision with root package name */
    private final v0.c f11739b;

    /* renamed from: c  reason: collision with root package name */
    private final com.facebook.common.internal.k<Boolean> f11740c;

    /* renamed from: d  reason: collision with root package name */
    private final p<com.facebook.cache.common.c, com.facebook.imagepipeline.image.c> f11741d;

    /* renamed from: e  reason: collision with root package name */
    private final p<com.facebook.cache.common.c, PooledByteBuffer> f11742e;

    /* renamed from: f  reason: collision with root package name */
    private final com.facebook.imagepipeline.cache.e f11743f;

    /* renamed from: g  reason: collision with root package name */
    private final com.facebook.imagepipeline.cache.e f11744g;

    /* renamed from: h  reason: collision with root package name */
    private final com.facebook.imagepipeline.cache.f f11745h;

    /* renamed from: i  reason: collision with root package name */
    private final u0 f11746i;

    /* renamed from: j  reason: collision with root package name */
    private final com.facebook.common.internal.k<Boolean> f11747j;

    /* renamed from: k  reason: collision with root package name */
    private AtomicLong f11748k = new AtomicLong();

    /* renamed from: l  reason: collision with root package name */
    private final com.facebook.common.internal.k<Boolean> f11749l;

    /* compiled from: ImagePipeline.java */
    /* loaded from: classes2.dex */
    class a implements com.facebook.common.internal.k<com.facebook.datasource.c<com.facebook.common.references.a<com.facebook.imagepipeline.image.c>>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ImageRequest f11750a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Object f11751b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ImageRequest.RequestLevel f11752c;

        a(ImageRequest imageRequest, Object obj, ImageRequest.RequestLevel requestLevel) {
            this.f11750a = imageRequest;
            this.f11751b = obj;
            this.f11752c = requestLevel;
        }

        @Override // com.facebook.common.internal.k
        /* renamed from: a */
        public com.facebook.datasource.c<com.facebook.common.references.a<com.facebook.imagepipeline.image.c>> get() {
            return g.this.j(this.f11750a, this.f11751b, this.f11752c);
        }

        public String toString() {
            return com.facebook.common.internal.g.f(this).f("uri", this.f11750a.t()).toString();
        }
    }

    /* compiled from: ImagePipeline.java */
    /* loaded from: classes2.dex */
    class b implements com.facebook.common.internal.k<com.facebook.datasource.c<com.facebook.common.references.a<com.facebook.imagepipeline.image.c>>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ImageRequest f11754a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Object f11755b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ImageRequest.RequestLevel f11756c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ v0.c f11757d;

        b(ImageRequest imageRequest, Object obj, ImageRequest.RequestLevel requestLevel, v0.c cVar) {
            this.f11754a = imageRequest;
            this.f11755b = obj;
            this.f11756c = requestLevel;
            this.f11757d = cVar;
        }

        @Override // com.facebook.common.internal.k
        /* renamed from: a */
        public com.facebook.datasource.c<com.facebook.common.references.a<com.facebook.imagepipeline.image.c>> get() {
            return g.this.k(this.f11754a, this.f11755b, this.f11756c, this.f11757d);
        }

        public String toString() {
            return com.facebook.common.internal.g.f(this).f("uri", this.f11754a.t()).toString();
        }
    }

    /* compiled from: ImagePipeline.java */
    /* loaded from: classes2.dex */
    class c implements com.facebook.common.internal.k<com.facebook.datasource.c<com.facebook.common.references.a<PooledByteBuffer>>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ImageRequest f11759a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Object f11760b;

        c(ImageRequest imageRequest, Object obj) {
            this.f11759a = imageRequest;
            this.f11760b = obj;
        }

        @Override // com.facebook.common.internal.k
        /* renamed from: a */
        public com.facebook.datasource.c<com.facebook.common.references.a<PooledByteBuffer>> get() {
            return g.this.m(this.f11759a, this.f11760b);
        }

        public String toString() {
            return com.facebook.common.internal.g.f(this).f("uri", this.f11759a.t()).toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ImagePipeline.java */
    /* loaded from: classes2.dex */
    public class d implements com.facebook.common.internal.i<com.facebook.cache.common.c> {
        d() {
        }

        @Override // com.facebook.common.internal.i
        /* renamed from: a */
        public boolean apply(com.facebook.cache.common.c cVar) {
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ImagePipeline.java */
    /* loaded from: classes2.dex */
    public class e implements bolts.g<Boolean, Void> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.facebook.datasource.i f11763a;

        e(com.facebook.datasource.i iVar) {
            this.f11763a = iVar;
        }

        @Override // bolts.g
        /* renamed from: b */
        public Void a(bolts.h<Boolean> hVar) throws Exception {
            this.f11763a.setResult(Boolean.valueOf((hVar.D() || hVar.F() || !hVar.B().booleanValue()) ? false : true));
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ImagePipeline.java */
    /* loaded from: classes2.dex */
    public class f implements bolts.g<Boolean, bolts.h<Boolean>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.facebook.cache.common.c f11765a;

        f(com.facebook.cache.common.c cVar) {
            this.f11765a = cVar;
        }

        @Override // bolts.g
        /* renamed from: b */
        public bolts.h<Boolean> a(bolts.h<Boolean> hVar) throws Exception {
            if (hVar.D() || hVar.F() || !hVar.B().booleanValue()) {
                return g.this.f11744g.k(this.f11765a);
            }
            return bolts.h.z(Boolean.TRUE);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ImagePipeline.java */
    /* renamed from: com.facebook.imagepipeline.core.g$g  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class C0269g implements com.facebook.common.internal.i<com.facebook.cache.common.c> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Uri f11767a;

        C0269g(Uri uri) {
            this.f11767a = uri;
        }

        @Override // com.facebook.common.internal.i
        /* renamed from: a */
        public boolean apply(com.facebook.cache.common.c cVar) {
            return cVar.b(this.f11767a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ImagePipeline.java */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class h {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f11769a;

        static {
            int[] iArr = new int[ImageRequest.CacheChoice.values().length];
            f11769a = iArr;
            try {
                iArr[ImageRequest.CacheChoice.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11769a[ImageRequest.CacheChoice.SMALL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public g(l lVar, Set<v0.c> set, com.facebook.common.internal.k<Boolean> kVar, p<com.facebook.cache.common.c, com.facebook.imagepipeline.image.c> pVar, p<com.facebook.cache.common.c, PooledByteBuffer> pVar2, com.facebook.imagepipeline.cache.e eVar, com.facebook.imagepipeline.cache.e eVar2, com.facebook.imagepipeline.cache.f fVar, u0 u0Var, com.facebook.common.internal.k<Boolean> kVar2, com.facebook.common.internal.k<Boolean> kVar3) {
        this.f11738a = lVar;
        this.f11739b = new v0.b(set);
        this.f11740c = kVar;
        this.f11741d = pVar;
        this.f11742e = pVar2;
        this.f11743f = eVar;
        this.f11744g = eVar2;
        this.f11745h = fVar;
        this.f11746i = u0Var;
        this.f11747j = kVar2;
        this.f11749l = kVar3;
    }

    private com.facebook.common.internal.i<com.facebook.cache.common.c> J(Uri uri) {
        return new C0269g(uri);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private <T> com.facebook.datasource.c<com.facebook.common.references.a<T>> P(com.facebook.imagepipeline.producers.i0<com.facebook.common.references.a<T>> r11, com.facebook.imagepipeline.request.ImageRequest r12, com.facebook.imagepipeline.request.ImageRequest.RequestLevel r13, java.lang.Object r14, @javax.annotation.Nullable v0.c r15) {
        /*
            r10 = this;
            boolean r0 = com.facebook.imagepipeline.systrace.b.e()
            if (r0 == 0) goto Lb
            java.lang.String r0 = "ImagePipeline#submitFetchRequest"
            com.facebook.imagepipeline.systrace.b.a(r0)
        Lb:
            v0.c r15 = r10.y(r12, r15)
            com.facebook.imagepipeline.request.ImageRequest$RequestLevel r0 = r12.i()     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L4f
            com.facebook.imagepipeline.request.ImageRequest$RequestLevel r6 = com.facebook.imagepipeline.request.ImageRequest.RequestLevel.getMax(r0, r13)     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L4f
            com.facebook.imagepipeline.producers.q0 r13 = new com.facebook.imagepipeline.producers.q0     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L4f
            java.lang.String r3 = r10.p()     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L4f
            r7 = 0
            boolean r0 = r12.n()     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L4f
            if (r0 != 0) goto L32
            android.net.Uri r0 = r12.t()     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L4f
            boolean r0 = com.facebook.common.util.f.m(r0)     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L4f
            if (r0 != 0) goto L2f
            goto L32
        L2f:
            r0 = 0
            r8 = 0
            goto L34
        L32:
            r0 = 1
            r8 = 1
        L34:
            com.facebook.imagepipeline.common.Priority r9 = r12.m()     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L4f
            r1 = r13
            r2 = r12
            r4 = r15
            r5 = r14
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L4f
            com.facebook.datasource.c r11 = com.facebook.imagepipeline.datasource.e.A(r11, r13, r15)     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L4f
            boolean r12 = com.facebook.imagepipeline.systrace.b.e()
            if (r12 == 0) goto L4c
            com.facebook.imagepipeline.systrace.b.c()
        L4c:
            return r11
        L4d:
            r11 = move-exception
            goto L5e
        L4f:
            r11 = move-exception
            com.facebook.datasource.c r11 = com.facebook.datasource.d.c(r11)     // Catch: java.lang.Throwable -> L4d
            boolean r12 = com.facebook.imagepipeline.systrace.b.e()
            if (r12 == 0) goto L5d
            com.facebook.imagepipeline.systrace.b.c()
        L5d:
            return r11
        L5e:
            boolean r12 = com.facebook.imagepipeline.systrace.b.e()
            if (r12 == 0) goto L67
            com.facebook.imagepipeline.systrace.b.c()
        L67:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.core.g.P(com.facebook.imagepipeline.producers.i0, com.facebook.imagepipeline.request.ImageRequest, com.facebook.imagepipeline.request.ImageRequest$RequestLevel, java.lang.Object, v0.c):com.facebook.datasource.c");
    }

    private com.facebook.datasource.c<Void> Q(i0<Void> i0Var, ImageRequest imageRequest, ImageRequest.RequestLevel requestLevel, Object obj, Priority priority) {
        v0.c y2 = y(imageRequest, null);
        try {
            return com.facebook.imagepipeline.datasource.g.z(i0Var, new q0(imageRequest, p(), y2, obj, ImageRequest.RequestLevel.getMax(imageRequest.i(), requestLevel), true, false, priority), y2);
        } catch (Exception e5) {
            return com.facebook.datasource.d.c(e5);
        }
    }

    public boolean A(ImageRequest imageRequest) {
        if (imageRequest == null) {
            return false;
        }
        com.facebook.common.references.a<com.facebook.imagepipeline.image.c> aVar = this.f11741d.get(this.f11745h.a(imageRequest, null));
        try {
            return com.facebook.common.references.a.t(aVar);
        } finally {
            com.facebook.common.references.a.h(aVar);
        }
    }

    public com.facebook.datasource.c<Boolean> B(Uri uri) {
        return C(ImageRequest.b(uri));
    }

    public com.facebook.datasource.c<Boolean> C(ImageRequest imageRequest) {
        com.facebook.cache.common.c d5 = this.f11745h.d(imageRequest, null);
        com.facebook.datasource.i s4 = com.facebook.datasource.i.s();
        this.f11743f.k(d5).q(new f(d5)).m(new e(s4));
        return s4;
    }

    public boolean D(Uri uri) {
        return E(uri, ImageRequest.CacheChoice.SMALL) || E(uri, ImageRequest.CacheChoice.DEFAULT);
    }

    public boolean E(Uri uri, ImageRequest.CacheChoice cacheChoice) {
        return F(ImageRequestBuilder.u(uri).x(cacheChoice).a());
    }

    public boolean F(ImageRequest imageRequest) {
        com.facebook.cache.common.c d5 = this.f11745h.d(imageRequest, null);
        int i4 = h.f11769a[imageRequest.f().ordinal()];
        if (i4 != 1) {
            if (i4 != 2) {
                return false;
            }
            return this.f11744g.n(d5);
        }
        return this.f11743f.n(d5);
    }

    public com.facebook.common.internal.k<Boolean> G() {
        return this.f11749l;
    }

    public boolean H() {
        return this.f11746i.c();
    }

    public void I() {
        this.f11746i.e();
    }

    public com.facebook.datasource.c<Void> K(ImageRequest imageRequest, Object obj) {
        boolean booleanValue;
        i0<Void> g4;
        if (!this.f11740c.get().booleanValue()) {
            return com.facebook.datasource.d.c(f11737m);
        }
        try {
            Boolean y2 = imageRequest.y();
            if (y2 != null) {
                booleanValue = !y2.booleanValue();
            } else {
                booleanValue = this.f11747j.get().booleanValue();
            }
            if (booleanValue) {
                g4 = this.f11738a.j(imageRequest);
            } else {
                g4 = this.f11738a.g(imageRequest);
            }
            return Q(g4, imageRequest, ImageRequest.RequestLevel.FULL_FETCH, obj, Priority.MEDIUM);
        } catch (Exception e5) {
            return com.facebook.datasource.d.c(e5);
        }
    }

    public com.facebook.datasource.c<Void> L(ImageRequest imageRequest, Object obj) {
        return M(imageRequest, obj, Priority.MEDIUM);
    }

    public com.facebook.datasource.c<Void> M(ImageRequest imageRequest, Object obj, Priority priority) {
        if (!this.f11740c.get().booleanValue()) {
            return com.facebook.datasource.d.c(f11737m);
        }
        try {
            return Q(this.f11738a.j(imageRequest), imageRequest, ImageRequest.RequestLevel.FULL_FETCH, obj, priority);
        } catch (Exception e5) {
            return com.facebook.datasource.d.c(e5);
        }
    }

    public void N() {
        this.f11746i.f();
    }

    public <T> com.facebook.datasource.c<com.facebook.common.references.a<T>> O(i0<com.facebook.common.references.a<T>> i0Var, q0 q0Var, v0.c cVar) {
        if (com.facebook.imagepipeline.systrace.b.e()) {
            com.facebook.imagepipeline.systrace.b.a("ImagePipeline#submitFetchRequest");
        }
        try {
            try {
                com.facebook.datasource.c<com.facebook.common.references.a<T>> A = com.facebook.imagepipeline.datasource.e.A(i0Var, q0Var, cVar);
                if (com.facebook.imagepipeline.systrace.b.e()) {
                    com.facebook.imagepipeline.systrace.b.c();
                }
                return A;
            } catch (Exception e5) {
                com.facebook.datasource.c<com.facebook.common.references.a<T>> c5 = com.facebook.datasource.d.c(e5);
                if (com.facebook.imagepipeline.systrace.b.e()) {
                    com.facebook.imagepipeline.systrace.b.c();
                }
                return c5;
            }
        } catch (Throwable th) {
            if (com.facebook.imagepipeline.systrace.b.e()) {
                com.facebook.imagepipeline.systrace.b.c();
            }
            throw th;
        }
    }

    public void b() {
        d();
        c();
    }

    public void c() {
        this.f11743f.j();
        this.f11744g.j();
    }

    public void d() {
        d dVar = new d();
        this.f11741d.b(dVar);
        this.f11742e.b(dVar);
    }

    public void e(Uri uri) {
        h(uri);
        f(uri);
    }

    public void f(Uri uri) {
        g(ImageRequest.b(uri));
    }

    public void g(ImageRequest imageRequest) {
        com.facebook.cache.common.c d5 = this.f11745h.d(imageRequest, null);
        this.f11743f.t(d5);
        this.f11744g.t(d5);
    }

    public void h(Uri uri) {
        com.facebook.common.internal.i<com.facebook.cache.common.c> J = J(uri);
        this.f11741d.b(J);
        this.f11742e.b(J);
    }

    public com.facebook.datasource.c<com.facebook.common.references.a<com.facebook.imagepipeline.image.c>> i(ImageRequest imageRequest, Object obj) {
        return j(imageRequest, obj, ImageRequest.RequestLevel.FULL_FETCH);
    }

    public com.facebook.datasource.c<com.facebook.common.references.a<com.facebook.imagepipeline.image.c>> j(ImageRequest imageRequest, Object obj, ImageRequest.RequestLevel requestLevel) {
        return k(imageRequest, obj, requestLevel, null);
    }

    public com.facebook.datasource.c<com.facebook.common.references.a<com.facebook.imagepipeline.image.c>> k(ImageRequest imageRequest, Object obj, ImageRequest.RequestLevel requestLevel, @Nullable v0.c cVar) {
        try {
            return P(this.f11738a.i(imageRequest), imageRequest, requestLevel, obj, cVar);
        } catch (Exception e5) {
            return com.facebook.datasource.d.c(e5);
        }
    }

    public com.facebook.datasource.c<com.facebook.common.references.a<com.facebook.imagepipeline.image.c>> l(ImageRequest imageRequest, Object obj, @Nullable v0.c cVar) {
        return k(imageRequest, obj, ImageRequest.RequestLevel.FULL_FETCH, cVar);
    }

    public com.facebook.datasource.c<com.facebook.common.references.a<PooledByteBuffer>> m(ImageRequest imageRequest, Object obj) {
        return n(imageRequest, obj, null);
    }

    public com.facebook.datasource.c<com.facebook.common.references.a<PooledByteBuffer>> n(ImageRequest imageRequest, Object obj, @Nullable v0.c cVar) {
        com.facebook.common.internal.h.i(imageRequest.t());
        try {
            i0<com.facebook.common.references.a<PooledByteBuffer>> k4 = this.f11738a.k(imageRequest);
            if (imageRequest.p() != null) {
                imageRequest = ImageRequestBuilder.d(imageRequest).F(null).a();
            }
            return P(k4, imageRequest, ImageRequest.RequestLevel.FULL_FETCH, obj, cVar);
        } catch (Exception e5) {
            return com.facebook.datasource.d.c(e5);
        }
    }

    public com.facebook.datasource.c<com.facebook.common.references.a<com.facebook.imagepipeline.image.c>> o(ImageRequest imageRequest, Object obj) {
        return j(imageRequest, obj, ImageRequest.RequestLevel.BITMAP_MEMORY_CACHE);
    }

    public String p() {
        return String.valueOf(this.f11748k.getAndIncrement());
    }

    public p<com.facebook.cache.common.c, com.facebook.imagepipeline.image.c> q() {
        return this.f11741d;
    }

    @Nullable
    public com.facebook.cache.common.c r(@Nullable ImageRequest imageRequest, Object obj) {
        if (com.facebook.imagepipeline.systrace.b.e()) {
            com.facebook.imagepipeline.systrace.b.a("ImagePipeline#getCacheKey");
        }
        com.facebook.imagepipeline.cache.f fVar = this.f11745h;
        com.facebook.cache.common.c cVar = null;
        if (fVar != null && imageRequest != null) {
            if (imageRequest.j() != null) {
                cVar = fVar.c(imageRequest, obj);
            } else {
                cVar = fVar.a(imageRequest, obj);
            }
        }
        if (com.facebook.imagepipeline.systrace.b.e()) {
            com.facebook.imagepipeline.systrace.b.c();
        }
        return cVar;
    }

    public com.facebook.imagepipeline.cache.f s() {
        return this.f11745h;
    }

    @Nullable
    public com.facebook.common.references.a<com.facebook.imagepipeline.image.c> t(@Nullable com.facebook.cache.common.c cVar) {
        p<com.facebook.cache.common.c, com.facebook.imagepipeline.image.c> pVar = this.f11741d;
        if (pVar == null || cVar == null) {
            return null;
        }
        com.facebook.common.references.a<com.facebook.imagepipeline.image.c> aVar = pVar.get(cVar);
        if (aVar == null || aVar.k().a().a()) {
            return aVar;
        }
        aVar.close();
        return null;
    }

    public com.facebook.common.internal.k<com.facebook.datasource.c<com.facebook.common.references.a<com.facebook.imagepipeline.image.c>>> u(ImageRequest imageRequest, Object obj, ImageRequest.RequestLevel requestLevel) {
        return new a(imageRequest, obj, requestLevel);
    }

    public com.facebook.common.internal.k<com.facebook.datasource.c<com.facebook.common.references.a<com.facebook.imagepipeline.image.c>>> v(ImageRequest imageRequest, Object obj, ImageRequest.RequestLevel requestLevel, @Nullable v0.c cVar) {
        return new b(imageRequest, obj, requestLevel, cVar);
    }

    public com.facebook.common.internal.k<com.facebook.datasource.c<com.facebook.common.references.a<PooledByteBuffer>>> w(ImageRequest imageRequest, Object obj) {
        return new c(imageRequest, obj);
    }

    public l x() {
        return this.f11738a;
    }

    public v0.c y(ImageRequest imageRequest, @Nullable v0.c cVar) {
        if (cVar == null) {
            if (imageRequest.o() == null) {
                return this.f11739b;
            }
            return new v0.b(this.f11739b, imageRequest.o());
        } else if (imageRequest.o() == null) {
            return new v0.b(this.f11739b, cVar);
        } else {
            return new v0.b(this.f11739b, cVar, imageRequest.o());
        }
    }

    public boolean z(Uri uri) {
        if (uri == null) {
            return false;
        }
        return this.f11741d.c(J(uri));
    }
}
