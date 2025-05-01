package com.facebook.imagepipeline.core;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.imagepipeline.cache.p;
import com.facebook.imagepipeline.producers.a0;
import com.facebook.imagepipeline.producers.c0;
import com.facebook.imagepipeline.producers.d0;
import com.facebook.imagepipeline.producers.e0;
import com.facebook.imagepipeline.producers.f0;
import com.facebook.imagepipeline.producers.g0;
import com.facebook.imagepipeline.producers.h0;
import com.facebook.imagepipeline.producers.i0;
import com.facebook.imagepipeline.producers.n;
import com.facebook.imagepipeline.producers.n0;
import com.facebook.imagepipeline.producers.o;
import com.facebook.imagepipeline.producers.p0;
import com.facebook.imagepipeline.producers.q;
import com.facebook.imagepipeline.producers.s0;
import com.facebook.imagepipeline.producers.t;
import com.facebook.imagepipeline.producers.t0;
import com.facebook.imagepipeline.producers.u;
import com.facebook.imagepipeline.producers.u0;
import com.facebook.imagepipeline.producers.v;
import com.facebook.imagepipeline.producers.v0;
import com.facebook.imagepipeline.producers.w;
import com.facebook.imagepipeline.producers.w0;
import com.facebook.imagepipeline.producers.x0;
import com.facebook.imagepipeline.producers.y;
import com.facebook.imagepipeline.producers.z;
import com.facebook.imagepipeline.producers.z0;
/* compiled from: ProducerFactory.java */
/* loaded from: classes2.dex */
public class k {

    /* renamed from: v  reason: collision with root package name */
    private static final int f11827v = 5;

    /* renamed from: a  reason: collision with root package name */
    private ContentResolver f11828a;

    /* renamed from: b  reason: collision with root package name */
    private Resources f11829b;

    /* renamed from: c  reason: collision with root package name */
    private AssetManager f11830c;

    /* renamed from: d  reason: collision with root package name */
    private final com.facebook.common.memory.a f11831d;

    /* renamed from: e  reason: collision with root package name */
    private final com.facebook.imagepipeline.decoder.b f11832e;

    /* renamed from: f  reason: collision with root package name */
    private final com.facebook.imagepipeline.decoder.d f11833f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f11834g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f11835h;

    /* renamed from: i  reason: collision with root package name */
    private final boolean f11836i;

    /* renamed from: j  reason: collision with root package name */
    private final e f11837j;

    /* renamed from: k  reason: collision with root package name */
    private final com.facebook.common.memory.g f11838k;

    /* renamed from: l  reason: collision with root package name */
    private final com.facebook.imagepipeline.cache.e f11839l;

    /* renamed from: m  reason: collision with root package name */
    private final com.facebook.imagepipeline.cache.e f11840m;

    /* renamed from: n  reason: collision with root package name */
    private final p<com.facebook.cache.common.c, PooledByteBuffer> f11841n;

    /* renamed from: o  reason: collision with root package name */
    private final p<com.facebook.cache.common.c, com.facebook.imagepipeline.image.c> f11842o;

    /* renamed from: p  reason: collision with root package name */
    private final com.facebook.imagepipeline.cache.f f11843p;

    /* renamed from: q  reason: collision with root package name */
    private final com.facebook.imagepipeline.bitmaps.f f11844q;

    /* renamed from: r  reason: collision with root package name */
    private final int f11845r;

    /* renamed from: s  reason: collision with root package name */
    private final int f11846s;

    /* renamed from: t  reason: collision with root package name */
    private boolean f11847t;

    /* renamed from: u  reason: collision with root package name */
    private final int f11848u;

    public k(Context context, com.facebook.common.memory.a aVar, com.facebook.imagepipeline.decoder.b bVar, com.facebook.imagepipeline.decoder.d dVar, boolean z4, boolean z5, boolean z6, e eVar, com.facebook.common.memory.g gVar, p<com.facebook.cache.common.c, com.facebook.imagepipeline.image.c> pVar, p<com.facebook.cache.common.c, PooledByteBuffer> pVar2, com.facebook.imagepipeline.cache.e eVar2, com.facebook.imagepipeline.cache.e eVar3, com.facebook.imagepipeline.cache.f fVar, com.facebook.imagepipeline.bitmaps.f fVar2, int i4, int i5, boolean z7, int i6) {
        this.f11828a = context.getApplicationContext().getContentResolver();
        this.f11829b = context.getApplicationContext().getResources();
        this.f11830c = context.getApplicationContext().getAssets();
        this.f11831d = aVar;
        this.f11832e = bVar;
        this.f11833f = dVar;
        this.f11834g = z4;
        this.f11835h = z5;
        this.f11836i = z6;
        this.f11837j = eVar;
        this.f11838k = gVar;
        this.f11842o = pVar;
        this.f11841n = pVar2;
        this.f11839l = eVar2;
        this.f11840m = eVar3;
        this.f11843p = fVar;
        this.f11844q = fVar2;
        this.f11845r = i4;
        this.f11846s = i5;
        this.f11847t = z7;
        this.f11848u = i6;
    }

    public static <T> s0<T> B(i0<T> i0Var) {
        return new s0<>(i0Var);
    }

    public static com.facebook.imagepipeline.producers.a a(i0<com.facebook.imagepipeline.image.e> i0Var) {
        return new com.facebook.imagepipeline.producers.a(i0Var);
    }

    public static com.facebook.imagepipeline.producers.j g(i0<com.facebook.imagepipeline.image.e> i0Var, i0<com.facebook.imagepipeline.image.e> i0Var2) {
        return new com.facebook.imagepipeline.producers.j(i0Var, i0Var2);
    }

    public static <T> e0<T> v() {
        return new e0<>();
    }

    public p0 A(i0<com.facebook.imagepipeline.image.e> i0Var, boolean z4, com.facebook.imagepipeline.transcoder.d dVar) {
        return new p0(this.f11837j.d(), this.f11838k, i0Var, z4, dVar);
    }

    public <T> v0<T> C(i0<T> i0Var) {
        return new v0<>(5, this.f11837j.a(), i0Var);
    }

    public w0 D(x0<com.facebook.imagepipeline.image.e>[] x0VarArr) {
        return new w0(x0VarArr);
    }

    public z0 E(i0<com.facebook.imagepipeline.image.e> i0Var) {
        return new z0(this.f11837j.d(), this.f11838k, i0Var);
    }

    public <T> t0<T> b(i0<T> i0Var, u0 u0Var) {
        return new t0<>(i0Var, u0Var);
    }

    public com.facebook.imagepipeline.producers.f c(i0<com.facebook.common.references.a<com.facebook.imagepipeline.image.c>> i0Var) {
        return new com.facebook.imagepipeline.producers.f(this.f11842o, this.f11843p, i0Var);
    }

    public com.facebook.imagepipeline.producers.g d(i0<com.facebook.common.references.a<com.facebook.imagepipeline.image.c>> i0Var) {
        return new com.facebook.imagepipeline.producers.g(this.f11843p, i0Var);
    }

    public com.facebook.imagepipeline.producers.h e(i0<com.facebook.common.references.a<com.facebook.imagepipeline.image.c>> i0Var) {
        return new com.facebook.imagepipeline.producers.h(this.f11842o, this.f11843p, i0Var);
    }

    public com.facebook.imagepipeline.producers.i f(i0<com.facebook.common.references.a<com.facebook.imagepipeline.image.c>> i0Var) {
        return new com.facebook.imagepipeline.producers.i(i0Var, this.f11845r, this.f11846s, this.f11847t);
    }

    public com.facebook.imagepipeline.producers.k h() {
        return new com.facebook.imagepipeline.producers.k(this.f11838k);
    }

    public com.facebook.imagepipeline.producers.l i(i0<com.facebook.imagepipeline.image.e> i0Var) {
        return new com.facebook.imagepipeline.producers.l(this.f11831d, this.f11837j.c(), this.f11832e, this.f11833f, this.f11834g, this.f11835h, this.f11836i, i0Var, this.f11848u);
    }

    public n j(i0<com.facebook.imagepipeline.image.e> i0Var) {
        return new n(this.f11839l, this.f11840m, this.f11843p, i0Var);
    }

    public o k(i0<com.facebook.imagepipeline.image.e> i0Var) {
        return new o(this.f11839l, this.f11840m, this.f11843p, i0Var);
    }

    public com.facebook.imagepipeline.producers.p l(i0<com.facebook.imagepipeline.image.e> i0Var) {
        return new com.facebook.imagepipeline.producers.p(this.f11843p, i0Var);
    }

    public q m(i0<com.facebook.imagepipeline.image.e> i0Var) {
        return new q(this.f11841n, this.f11843p, i0Var);
    }

    public t n() {
        return new t(this.f11837j.e(), this.f11838k, this.f11830c);
    }

    public u o() {
        return new u(this.f11837j.e(), this.f11838k, this.f11828a);
    }

    public v p() {
        return new v(this.f11837j.e(), this.f11838k, this.f11828a);
    }

    public w q() {
        return new w(this.f11837j.e(), this.f11838k, this.f11828a);
    }

    public y r() {
        return new y(this.f11837j.e(), this.f11838k);
    }

    public z s() {
        return new z(this.f11837j.e(), this.f11838k, this.f11829b);
    }

    public a0 t() {
        return new a0(this.f11837j.e(), this.f11828a);
    }

    public c0 u(d0 d0Var) {
        return new c0(this.f11838k, this.f11831d, d0Var);
    }

    public f0 w(i0<com.facebook.imagepipeline.image.e> i0Var) {
        return new f0(this.f11839l, this.f11843p, this.f11838k, this.f11831d, i0Var);
    }

    public g0 x(i0<com.facebook.common.references.a<com.facebook.imagepipeline.image.c>> i0Var) {
        return new g0(this.f11842o, this.f11843p, i0Var);
    }

    public h0 y(i0<com.facebook.common.references.a<com.facebook.imagepipeline.image.c>> i0Var) {
        return new h0(i0Var, this.f11844q, this.f11837j.d());
    }

    public n0 z() {
        return new n0(this.f11837j.e(), this.f11838k, this.f11828a);
    }
}
