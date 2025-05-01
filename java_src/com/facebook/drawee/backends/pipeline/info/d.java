package com.facebook.drawee.backends.pipeline.info;

import com.facebook.imagepipeline.image.f;
import com.facebook.imagepipeline.request.ImageRequest;
import javax.annotation.Nullable;
/* compiled from: ImagePerfState.java */
/* loaded from: classes.dex */
public class d {
    @Nullable

    /* renamed from: a  reason: collision with root package name */
    private String f11050a;
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    private String f11051b;
    @Nullable

    /* renamed from: c  reason: collision with root package name */
    private ImageRequest f11052c;
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    private Object f11053d;
    @Nullable

    /* renamed from: e  reason: collision with root package name */
    private f f11054e;

    /* renamed from: n  reason: collision with root package name */
    private boolean f11063n;
    @Nullable

    /* renamed from: u  reason: collision with root package name */
    private String f11070u;

    /* renamed from: f  reason: collision with root package name */
    private long f11055f = -1;

    /* renamed from: g  reason: collision with root package name */
    private long f11056g = -1;

    /* renamed from: h  reason: collision with root package name */
    private long f11057h = -1;

    /* renamed from: i  reason: collision with root package name */
    private long f11058i = -1;

    /* renamed from: j  reason: collision with root package name */
    private long f11059j = -1;

    /* renamed from: k  reason: collision with root package name */
    private long f11060k = -1;

    /* renamed from: l  reason: collision with root package name */
    private long f11061l = -1;

    /* renamed from: m  reason: collision with root package name */
    private int f11062m = -1;

    /* renamed from: o  reason: collision with root package name */
    private int f11064o = -1;

    /* renamed from: p  reason: collision with root package name */
    private int f11065p = -1;

    /* renamed from: q  reason: collision with root package name */
    private int f11066q = -1;

    /* renamed from: r  reason: collision with root package name */
    private int f11067r = -1;

    /* renamed from: s  reason: collision with root package name */
    private long f11068s = -1;

    /* renamed from: t  reason: collision with root package name */
    private long f11069t = -1;

    public int a() {
        return this.f11066q;
    }

    public void b() {
        this.f11051b = null;
        this.f11052c = null;
        this.f11053d = null;
        this.f11054e = null;
        this.f11055f = -1L;
        this.f11057h = -1L;
        this.f11058i = -1L;
        this.f11059j = -1L;
        this.f11060k = -1L;
        this.f11061l = -1L;
        this.f11062m = 1;
        this.f11063n = false;
        this.f11064o = -1;
        this.f11065p = -1;
        this.f11066q = -1;
        this.f11067r = -1;
        this.f11068s = -1L;
        this.f11069t = -1L;
        this.f11070u = null;
    }

    public void c(@Nullable Object obj) {
        this.f11053d = obj;
    }

    public void d(@Nullable String str) {
        this.f11070u = str;
    }

    public void e(long j4) {
        this.f11059j = j4;
    }

    public void f(long j4) {
        this.f11058i = j4;
    }

    public void g(long j4) {
        this.f11057h = j4;
    }

    public void h(@Nullable String str) {
        this.f11050a = str;
    }

    public void i(long j4) {
        this.f11056g = j4;
    }

    public void j(long j4) {
        this.f11055f = j4;
    }

    public void k(@Nullable f fVar) {
        this.f11054e = fVar;
    }

    public void l(int i4) {
        this.f11066q = i4;
    }

    public void m(int i4) {
        this.f11062m = i4;
    }

    public void n(@Nullable ImageRequest imageRequest) {
        this.f11052c = imageRequest;
    }

    public void o(long j4) {
        this.f11061l = j4;
    }

    public void p(long j4) {
        this.f11060k = j4;
    }

    public void q(long j4) {
        this.f11069t = j4;
    }

    public void r(int i4) {
        this.f11065p = i4;
    }

    public void s(int i4) {
        this.f11064o = i4;
    }

    public void t(boolean z4) {
        this.f11063n = z4;
    }

    public void u(@Nullable String str) {
        this.f11051b = str;
    }

    public void v(long j4) {
        this.f11068s = j4;
    }

    public void w(boolean z4) {
        this.f11067r = z4 ? 1 : 2;
    }

    public b x() {
        return new b(this.f11050a, this.f11051b, this.f11052c, this.f11053d, this.f11054e, this.f11055f, this.f11056g, this.f11057h, this.f11058i, this.f11059j, this.f11060k, this.f11061l, this.f11062m, this.f11063n, this.f11064o, this.f11065p, this.f11067r, this.f11068s, this.f11069t, this.f11070u);
    }
}
