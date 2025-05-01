package com.facebook.imagepipeline.core;

import android.content.ContentResolver;
import android.net.Uri;
import com.facebook.common.internal.VisibleForTesting;
import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.imagepipeline.producers.d0;
import com.facebook.imagepipeline.producers.i0;
import com.facebook.imagepipeline.producers.n;
import com.facebook.imagepipeline.producers.o;
import com.facebook.imagepipeline.producers.o0;
import com.facebook.imagepipeline.producers.u0;
import com.facebook.imagepipeline.producers.x0;
import com.facebook.imagepipeline.request.ImageRequest;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProducerSequenceFactory.java */
/* loaded from: classes2.dex */
public class l {
    @VisibleForTesting
    Map<i0<com.facebook.common.references.a<com.facebook.imagepipeline.image.c>>, i0<com.facebook.common.references.a<com.facebook.imagepipeline.image.c>>> A = new HashMap();
    @VisibleForTesting
    Map<i0<com.facebook.common.references.a<com.facebook.imagepipeline.image.c>>, i0<Void>> B = new HashMap();
    @VisibleForTesting
    Map<i0<com.facebook.common.references.a<com.facebook.imagepipeline.image.c>>, i0<com.facebook.common.references.a<com.facebook.imagepipeline.image.c>>> C = new HashMap();

    /* renamed from: a  reason: collision with root package name */
    private final ContentResolver f11849a;

    /* renamed from: b  reason: collision with root package name */
    private final k f11850b;

    /* renamed from: c  reason: collision with root package name */
    private final d0 f11851c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f11852d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f11853e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f11854f;

    /* renamed from: g  reason: collision with root package name */
    private final u0 f11855g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f11856h;

    /* renamed from: i  reason: collision with root package name */
    private final boolean f11857i;

    /* renamed from: j  reason: collision with root package name */
    private final boolean f11858j;

    /* renamed from: k  reason: collision with root package name */
    private final com.facebook.imagepipeline.transcoder.d f11859k;
    @VisibleForTesting

    /* renamed from: l  reason: collision with root package name */
    i0<com.facebook.common.references.a<com.facebook.imagepipeline.image.c>> f11860l;
    @VisibleForTesting

    /* renamed from: m  reason: collision with root package name */
    i0<com.facebook.imagepipeline.image.e> f11861m;
    @VisibleForTesting

    /* renamed from: n  reason: collision with root package name */
    i0<com.facebook.imagepipeline.image.e> f11862n;
    @VisibleForTesting

    /* renamed from: o  reason: collision with root package name */
    i0<com.facebook.common.references.a<PooledByteBuffer>> f11863o;
    @VisibleForTesting

    /* renamed from: p  reason: collision with root package name */
    i0<com.facebook.common.references.a<PooledByteBuffer>> f11864p;
    @VisibleForTesting

    /* renamed from: q  reason: collision with root package name */
    i0<Void> f11865q;
    @VisibleForTesting

    /* renamed from: r  reason: collision with root package name */
    i0<Void> f11866r;

    /* renamed from: s  reason: collision with root package name */
    private i0<com.facebook.imagepipeline.image.e> f11867s;
    @VisibleForTesting

    /* renamed from: t  reason: collision with root package name */
    i0<com.facebook.common.references.a<com.facebook.imagepipeline.image.c>> f11868t;
    @VisibleForTesting

    /* renamed from: u  reason: collision with root package name */
    i0<com.facebook.common.references.a<com.facebook.imagepipeline.image.c>> f11869u;
    @VisibleForTesting

    /* renamed from: v  reason: collision with root package name */
    i0<com.facebook.common.references.a<com.facebook.imagepipeline.image.c>> f11870v;
    @VisibleForTesting

    /* renamed from: w  reason: collision with root package name */
    i0<com.facebook.common.references.a<com.facebook.imagepipeline.image.c>> f11871w;
    @VisibleForTesting

    /* renamed from: x  reason: collision with root package name */
    i0<com.facebook.common.references.a<com.facebook.imagepipeline.image.c>> f11872x;
    @VisibleForTesting

    /* renamed from: y  reason: collision with root package name */
    i0<com.facebook.common.references.a<com.facebook.imagepipeline.image.c>> f11873y;
    @VisibleForTesting

    /* renamed from: z  reason: collision with root package name */
    i0<com.facebook.common.references.a<com.facebook.imagepipeline.image.c>> f11874z;

    public l(ContentResolver contentResolver, k kVar, d0 d0Var, boolean z4, boolean z5, u0 u0Var, boolean z6, boolean z7, boolean z8, boolean z9, com.facebook.imagepipeline.transcoder.d dVar) {
        this.f11849a = contentResolver;
        this.f11850b = kVar;
        this.f11851c = d0Var;
        this.f11852d = z4;
        this.f11853e = z5;
        this.f11855g = u0Var;
        this.f11856h = z6;
        this.f11857i = z7;
        this.f11854f = z8;
        this.f11858j = z9;
        this.f11859k = dVar;
    }

    private i0<com.facebook.common.references.a<com.facebook.imagepipeline.image.c>> A(i0<com.facebook.imagepipeline.image.e> i0Var) {
        return B(i0Var, new x0[]{this.f11850b.q()});
    }

    private i0<com.facebook.common.references.a<com.facebook.imagepipeline.image.c>> B(i0<com.facebook.imagepipeline.image.e> i0Var, x0<com.facebook.imagepipeline.image.e>[] x0VarArr) {
        return z(F(D(i0Var), x0VarArr));
    }

    private i0<com.facebook.imagepipeline.image.e> C(i0<com.facebook.imagepipeline.image.e> i0Var) {
        o k4;
        if (com.facebook.imagepipeline.systrace.b.e()) {
            com.facebook.imagepipeline.systrace.b.a("ProducerSequenceFactory#newDiskCacheSequence");
        }
        if (this.f11854f) {
            k4 = this.f11850b.k(this.f11850b.w(i0Var));
        } else {
            k4 = this.f11850b.k(i0Var);
        }
        n j4 = this.f11850b.j(k4);
        if (com.facebook.imagepipeline.systrace.b.e()) {
            com.facebook.imagepipeline.systrace.b.c();
        }
        return j4;
    }

    private i0<com.facebook.imagepipeline.image.e> D(i0<com.facebook.imagepipeline.image.e> i0Var) {
        if (com.facebook.common.webp.c.f10932a && (!this.f11853e || com.facebook.common.webp.c.f10935d == null)) {
            i0Var = this.f11850b.E(i0Var);
        }
        if (this.f11858j) {
            i0Var = C(i0Var);
        }
        return this.f11850b.l(this.f11850b.m(i0Var));
    }

    private i0<com.facebook.imagepipeline.image.e> E(x0<com.facebook.imagepipeline.image.e>[] x0VarArr) {
        return this.f11850b.A(this.f11850b.D(x0VarArr), true, this.f11859k);
    }

    private i0<com.facebook.imagepipeline.image.e> F(i0<com.facebook.imagepipeline.image.e> i0Var, x0<com.facebook.imagepipeline.image.e>[] x0VarArr) {
        return k.g(E(x0VarArr), this.f11850b.C(this.f11850b.A(k.a(i0Var), true, this.f11859k)));
    }

    private static void G(ImageRequest imageRequest) {
        com.facebook.common.internal.h.i(imageRequest);
        com.facebook.common.internal.h.d(imageRequest.i().getValue() <= ImageRequest.RequestLevel.ENCODED_MEMORY_CACHE.getValue());
    }

    private synchronized i0<com.facebook.imagepipeline.image.e> a() {
        if (com.facebook.imagepipeline.systrace.b.e()) {
            com.facebook.imagepipeline.systrace.b.a("ProducerSequenceFactory#getBackgroundLocalFileFetchToEncodeMemorySequence");
        }
        if (this.f11861m == null) {
            if (com.facebook.imagepipeline.systrace.b.e()) {
                com.facebook.imagepipeline.systrace.b.a("ProducerSequenceFactory#getBackgroundLocalFileFetchToEncodeMemorySequence:init");
            }
            this.f11861m = this.f11850b.b(D(this.f11850b.r()), this.f11855g);
            if (com.facebook.imagepipeline.systrace.b.e()) {
                com.facebook.imagepipeline.systrace.b.c();
            }
        }
        if (com.facebook.imagepipeline.systrace.b.e()) {
            com.facebook.imagepipeline.systrace.b.c();
        }
        return this.f11861m;
    }

    private synchronized i0<com.facebook.imagepipeline.image.e> b() {
        if (com.facebook.imagepipeline.systrace.b.e()) {
            com.facebook.imagepipeline.systrace.b.a("ProducerSequenceFactory#getBackgroundNetworkFetchToEncodedMemorySequence");
        }
        if (this.f11862n == null) {
            if (com.facebook.imagepipeline.systrace.b.e()) {
                com.facebook.imagepipeline.systrace.b.a("ProducerSequenceFactory#getBackgroundNetworkFetchToEncodedMemorySequence:init");
            }
            this.f11862n = this.f11850b.b(e(), this.f11855g);
            if (com.facebook.imagepipeline.systrace.b.e()) {
                com.facebook.imagepipeline.systrace.b.c();
            }
        }
        if (com.facebook.imagepipeline.systrace.b.e()) {
            com.facebook.imagepipeline.systrace.b.c();
        }
        return this.f11862n;
    }

    private i0<com.facebook.common.references.a<com.facebook.imagepipeline.image.c>> c(ImageRequest imageRequest) {
        try {
            if (com.facebook.imagepipeline.systrace.b.e()) {
                com.facebook.imagepipeline.systrace.b.a("ProducerSequenceFactory#getBasicDecodedImageSequence");
            }
            com.facebook.common.internal.h.i(imageRequest);
            Uri t4 = imageRequest.t();
            com.facebook.common.internal.h.j(t4, "Uri is null.");
            int u4 = imageRequest.u();
            if (u4 != 0) {
                switch (u4) {
                    case 2:
                        i0<com.facebook.common.references.a<com.facebook.imagepipeline.image.c>> r4 = r();
                        if (com.facebook.imagepipeline.systrace.b.e()) {
                            com.facebook.imagepipeline.systrace.b.c();
                        }
                        return r4;
                    case 3:
                        i0<com.facebook.common.references.a<com.facebook.imagepipeline.image.c>> p4 = p();
                        if (com.facebook.imagepipeline.systrace.b.e()) {
                            com.facebook.imagepipeline.systrace.b.c();
                        }
                        return p4;
                    case 4:
                        if (com.facebook.common.media.a.f(this.f11849a.getType(t4))) {
                            i0<com.facebook.common.references.a<com.facebook.imagepipeline.image.c>> r5 = r();
                            if (com.facebook.imagepipeline.systrace.b.e()) {
                                com.facebook.imagepipeline.systrace.b.c();
                            }
                            return r5;
                        }
                        i0<com.facebook.common.references.a<com.facebook.imagepipeline.image.c>> m4 = m();
                        if (com.facebook.imagepipeline.systrace.b.e()) {
                            com.facebook.imagepipeline.systrace.b.c();
                        }
                        return m4;
                    case 5:
                        i0<com.facebook.common.references.a<com.facebook.imagepipeline.image.c>> l4 = l();
                        if (com.facebook.imagepipeline.systrace.b.e()) {
                            com.facebook.imagepipeline.systrace.b.c();
                        }
                        return l4;
                    case 6:
                        i0<com.facebook.common.references.a<com.facebook.imagepipeline.image.c>> q4 = q();
                        if (com.facebook.imagepipeline.systrace.b.e()) {
                            com.facebook.imagepipeline.systrace.b.c();
                        }
                        return q4;
                    case 7:
                        i0<com.facebook.common.references.a<com.facebook.imagepipeline.image.c>> f5 = f();
                        if (com.facebook.imagepipeline.systrace.b.e()) {
                            com.facebook.imagepipeline.systrace.b.c();
                        }
                        return f5;
                    case 8:
                        return w();
                    default:
                        throw new IllegalArgumentException("Unsupported uri scheme! Uri is: " + x(t4));
                }
            }
            i0<com.facebook.common.references.a<com.facebook.imagepipeline.image.c>> t5 = t();
            if (com.facebook.imagepipeline.systrace.b.e()) {
                com.facebook.imagepipeline.systrace.b.c();
            }
            return t5;
        } finally {
            if (com.facebook.imagepipeline.systrace.b.e()) {
                com.facebook.imagepipeline.systrace.b.c();
            }
        }
    }

    private synchronized i0<com.facebook.common.references.a<com.facebook.imagepipeline.image.c>> d(i0<com.facebook.common.references.a<com.facebook.imagepipeline.image.c>> i0Var) {
        i0<com.facebook.common.references.a<com.facebook.imagepipeline.image.c>> i0Var2;
        i0Var2 = this.C.get(i0Var);
        if (i0Var2 == null) {
            i0Var2 = this.f11850b.f(i0Var);
            this.C.put(i0Var, i0Var2);
        }
        return i0Var2;
    }

    private synchronized i0<com.facebook.imagepipeline.image.e> e() {
        if (com.facebook.imagepipeline.systrace.b.e()) {
            com.facebook.imagepipeline.systrace.b.a("ProducerSequenceFactory#getCommonNetworkFetchToEncodedMemorySequence");
        }
        if (this.f11867s == null) {
            if (com.facebook.imagepipeline.systrace.b.e()) {
                com.facebook.imagepipeline.systrace.b.a("ProducerSequenceFactory#getCommonNetworkFetchToEncodedMemorySequence:init");
            }
            com.facebook.imagepipeline.producers.a a5 = k.a(D(this.f11850b.u(this.f11851c)));
            this.f11867s = a5;
            this.f11867s = this.f11850b.A(a5, this.f11852d && !this.f11856h, this.f11859k);
            if (com.facebook.imagepipeline.systrace.b.e()) {
                com.facebook.imagepipeline.systrace.b.c();
            }
        }
        if (com.facebook.imagepipeline.systrace.b.e()) {
            com.facebook.imagepipeline.systrace.b.c();
        }
        return this.f11867s;
    }

    private synchronized i0<com.facebook.common.references.a<com.facebook.imagepipeline.image.c>> f() {
        if (this.f11873y == null) {
            i0<com.facebook.imagepipeline.image.e> h4 = this.f11850b.h();
            if (com.facebook.common.webp.c.f10932a && (!this.f11853e || com.facebook.common.webp.c.f10935d == null)) {
                h4 = this.f11850b.E(h4);
            }
            this.f11873y = z(this.f11850b.A(k.a(h4), true, this.f11859k));
        }
        return this.f11873y;
    }

    private synchronized i0<Void> h(i0<com.facebook.common.references.a<com.facebook.imagepipeline.image.c>> i0Var) {
        if (!this.B.containsKey(i0Var)) {
            this.B.put(i0Var, k.B(i0Var));
        }
        return this.B.get(i0Var);
    }

    private synchronized i0<com.facebook.common.references.a<com.facebook.imagepipeline.image.c>> l() {
        if (this.f11872x == null) {
            this.f11872x = A(this.f11850b.n());
        }
        return this.f11872x;
    }

    private synchronized i0<com.facebook.common.references.a<com.facebook.imagepipeline.image.c>> m() {
        if (this.f11870v == null) {
            this.f11870v = B(this.f11850b.o(), new x0[]{this.f11850b.p(), this.f11850b.q()});
        }
        return this.f11870v;
    }

    private synchronized i0<Void> o() {
        if (com.facebook.imagepipeline.systrace.b.e()) {
            com.facebook.imagepipeline.systrace.b.a("ProducerSequenceFactory#getLocalFileFetchToEncodedMemoryPrefetchSequence");
        }
        if (this.f11865q == null) {
            if (com.facebook.imagepipeline.systrace.b.e()) {
                com.facebook.imagepipeline.systrace.b.a("ProducerSequenceFactory#getLocalFileFetchToEncodedMemoryPrefetchSequence:init");
            }
            this.f11865q = k.B(a());
            if (com.facebook.imagepipeline.systrace.b.e()) {
                com.facebook.imagepipeline.systrace.b.c();
            }
        }
        if (com.facebook.imagepipeline.systrace.b.e()) {
            com.facebook.imagepipeline.systrace.b.c();
        }
        return this.f11865q;
    }

    private synchronized i0<com.facebook.common.references.a<com.facebook.imagepipeline.image.c>> p() {
        if (this.f11868t == null) {
            this.f11868t = A(this.f11850b.r());
        }
        return this.f11868t;
    }

    private synchronized i0<com.facebook.common.references.a<com.facebook.imagepipeline.image.c>> q() {
        if (this.f11871w == null) {
            this.f11871w = A(this.f11850b.s());
        }
        return this.f11871w;
    }

    private synchronized i0<com.facebook.common.references.a<com.facebook.imagepipeline.image.c>> r() {
        if (this.f11869u == null) {
            this.f11869u = y(this.f11850b.t());
        }
        return this.f11869u;
    }

    private synchronized i0<com.facebook.common.references.a<com.facebook.imagepipeline.image.c>> t() {
        if (com.facebook.imagepipeline.systrace.b.e()) {
            com.facebook.imagepipeline.systrace.b.a("ProducerSequenceFactory#getNetworkFetchSequence");
        }
        if (this.f11860l == null) {
            if (com.facebook.imagepipeline.systrace.b.e()) {
                com.facebook.imagepipeline.systrace.b.a("ProducerSequenceFactory#getNetworkFetchSequence:init");
            }
            this.f11860l = z(e());
            if (com.facebook.imagepipeline.systrace.b.e()) {
                com.facebook.imagepipeline.systrace.b.c();
            }
        }
        if (com.facebook.imagepipeline.systrace.b.e()) {
            com.facebook.imagepipeline.systrace.b.c();
        }
        return this.f11860l;
    }

    private synchronized i0<Void> u() {
        if (com.facebook.imagepipeline.systrace.b.e()) {
            com.facebook.imagepipeline.systrace.b.a("ProducerSequenceFactory#getNetworkFetchToEncodedMemoryPrefetchSequence");
        }
        if (this.f11866r == null) {
            if (com.facebook.imagepipeline.systrace.b.e()) {
                com.facebook.imagepipeline.systrace.b.a("ProducerSequenceFactory#getNetworkFetchToEncodedMemoryPrefetchSequence:init");
            }
            this.f11866r = k.B(b());
            if (com.facebook.imagepipeline.systrace.b.e()) {
                com.facebook.imagepipeline.systrace.b.c();
            }
        }
        if (com.facebook.imagepipeline.systrace.b.e()) {
            com.facebook.imagepipeline.systrace.b.c();
        }
        return this.f11866r;
    }

    private synchronized i0<com.facebook.common.references.a<com.facebook.imagepipeline.image.c>> v(i0<com.facebook.common.references.a<com.facebook.imagepipeline.image.c>> i0Var) {
        if (!this.A.containsKey(i0Var)) {
            this.A.put(i0Var, this.f11850b.x(this.f11850b.y(i0Var)));
        }
        return this.A.get(i0Var);
    }

    private synchronized i0<com.facebook.common.references.a<com.facebook.imagepipeline.image.c>> w() {
        if (this.f11874z == null) {
            this.f11874z = A(this.f11850b.z());
        }
        return this.f11874z;
    }

    private static String x(Uri uri) {
        String valueOf = String.valueOf(uri);
        if (valueOf.length() > 30) {
            return valueOf.substring(0, 30) + "...";
        }
        return valueOf;
    }

    private i0<com.facebook.common.references.a<com.facebook.imagepipeline.image.c>> y(i0<com.facebook.common.references.a<com.facebook.imagepipeline.image.c>> i0Var) {
        return this.f11850b.c(this.f11850b.b(this.f11850b.d(this.f11850b.e(i0Var)), this.f11855g));
    }

    private i0<com.facebook.common.references.a<com.facebook.imagepipeline.image.c>> z(i0<com.facebook.imagepipeline.image.e> i0Var) {
        if (com.facebook.imagepipeline.systrace.b.e()) {
            com.facebook.imagepipeline.systrace.b.a("ProducerSequenceFactory#newBitmapCacheGetToDecodeSequence");
        }
        i0<com.facebook.common.references.a<com.facebook.imagepipeline.image.c>> y2 = y(this.f11850b.i(i0Var));
        if (com.facebook.imagepipeline.systrace.b.e()) {
            com.facebook.imagepipeline.systrace.b.c();
        }
        return y2;
    }

    public i0<Void> g(ImageRequest imageRequest) {
        i0<com.facebook.common.references.a<com.facebook.imagepipeline.image.c>> c5 = c(imageRequest);
        if (this.f11857i) {
            c5 = d(c5);
        }
        return h(c5);
    }

    public i0<com.facebook.common.references.a<com.facebook.imagepipeline.image.c>> i(ImageRequest imageRequest) {
        if (com.facebook.imagepipeline.systrace.b.e()) {
            com.facebook.imagepipeline.systrace.b.a("ProducerSequenceFactory#getDecodedImageProducerSequence");
        }
        i0<com.facebook.common.references.a<com.facebook.imagepipeline.image.c>> c5 = c(imageRequest);
        if (imageRequest.j() != null) {
            c5 = v(c5);
        }
        if (this.f11857i) {
            c5 = d(c5);
        }
        if (com.facebook.imagepipeline.systrace.b.e()) {
            com.facebook.imagepipeline.systrace.b.c();
        }
        return c5;
    }

    public i0<Void> j(ImageRequest imageRequest) {
        G(imageRequest);
        int u4 = imageRequest.u();
        if (u4 != 0) {
            if (u4 != 2 && u4 != 3) {
                Uri t4 = imageRequest.t();
                throw new IllegalArgumentException("Unsupported uri scheme for encoded image fetch! Uri is: " + x(t4));
            }
            return o();
        }
        return u();
    }

    public i0<com.facebook.common.references.a<PooledByteBuffer>> k(ImageRequest imageRequest) {
        try {
            if (com.facebook.imagepipeline.systrace.b.e()) {
                com.facebook.imagepipeline.systrace.b.a("ProducerSequenceFactory#getEncodedImageProducerSequence");
            }
            G(imageRequest);
            Uri t4 = imageRequest.t();
            int u4 = imageRequest.u();
            if (u4 != 0) {
                if (u4 != 2 && u4 != 3) {
                    throw new IllegalArgumentException("Unsupported uri scheme for encoded image fetch! Uri is: " + x(t4));
                }
                return n();
            }
            i0<com.facebook.common.references.a<PooledByteBuffer>> s4 = s();
            if (com.facebook.imagepipeline.systrace.b.e()) {
                com.facebook.imagepipeline.systrace.b.c();
            }
            return s4;
        } finally {
            if (com.facebook.imagepipeline.systrace.b.e()) {
                com.facebook.imagepipeline.systrace.b.c();
            }
        }
    }

    public i0<com.facebook.common.references.a<PooledByteBuffer>> n() {
        synchronized (this) {
            if (com.facebook.imagepipeline.systrace.b.e()) {
                com.facebook.imagepipeline.systrace.b.a("ProducerSequenceFactory#getLocalFileFetchEncodedImageProducerSequence");
            }
            if (this.f11863o == null) {
                if (com.facebook.imagepipeline.systrace.b.e()) {
                    com.facebook.imagepipeline.systrace.b.a("ProducerSequenceFactory#getLocalFileFetchEncodedImageProducerSequence:init");
                }
                this.f11863o = new o0(a());
                if (com.facebook.imagepipeline.systrace.b.e()) {
                    com.facebook.imagepipeline.systrace.b.c();
                }
            }
            if (com.facebook.imagepipeline.systrace.b.e()) {
                com.facebook.imagepipeline.systrace.b.c();
            }
        }
        return this.f11863o;
    }

    public i0<com.facebook.common.references.a<PooledByteBuffer>> s() {
        synchronized (this) {
            if (com.facebook.imagepipeline.systrace.b.e()) {
                com.facebook.imagepipeline.systrace.b.a("ProducerSequenceFactory#getNetworkFetchEncodedImageProducerSequence");
            }
            if (this.f11864p == null) {
                if (com.facebook.imagepipeline.systrace.b.e()) {
                    com.facebook.imagepipeline.systrace.b.a("ProducerSequenceFactory#getNetworkFetchEncodedImageProducerSequence:init");
                }
                this.f11864p = new o0(b());
                if (com.facebook.imagepipeline.systrace.b.e()) {
                    com.facebook.imagepipeline.systrace.b.c();
                }
            }
            if (com.facebook.imagepipeline.systrace.b.e()) {
                com.facebook.imagepipeline.systrace.b.c();
            }
        }
        return this.f11864p;
    }
}
