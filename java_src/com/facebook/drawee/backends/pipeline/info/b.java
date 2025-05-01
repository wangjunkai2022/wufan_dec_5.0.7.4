package com.facebook.drawee.backends.pipeline.info;

import com.facebook.common.internal.g;
import com.facebook.imagepipeline.image.f;
import com.facebook.imagepipeline.request.ImageRequest;
import javax.annotation.Nullable;
/* compiled from: ImagePerfData.java */
/* loaded from: classes.dex */
public class b {

    /* renamed from: u  reason: collision with root package name */
    public static final int f11019u = -1;
    @Nullable

    /* renamed from: a  reason: collision with root package name */
    private final String f11020a;
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    private final String f11021b;
    @Nullable

    /* renamed from: c  reason: collision with root package name */
    private final Object f11022c;
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    private final ImageRequest f11023d;
    @Nullable

    /* renamed from: e  reason: collision with root package name */
    private final f f11024e;

    /* renamed from: f  reason: collision with root package name */
    private final long f11025f;

    /* renamed from: g  reason: collision with root package name */
    private final long f11026g;

    /* renamed from: h  reason: collision with root package name */
    private final long f11027h;

    /* renamed from: i  reason: collision with root package name */
    private final long f11028i;

    /* renamed from: j  reason: collision with root package name */
    private final long f11029j;

    /* renamed from: k  reason: collision with root package name */
    private final long f11030k;

    /* renamed from: l  reason: collision with root package name */
    private final long f11031l;

    /* renamed from: m  reason: collision with root package name */
    private final int f11032m;

    /* renamed from: n  reason: collision with root package name */
    private final boolean f11033n;

    /* renamed from: o  reason: collision with root package name */
    private final int f11034o;

    /* renamed from: p  reason: collision with root package name */
    private final int f11035p;

    /* renamed from: q  reason: collision with root package name */
    private final int f11036q;

    /* renamed from: r  reason: collision with root package name */
    private final long f11037r;

    /* renamed from: s  reason: collision with root package name */
    private final long f11038s;
    @Nullable

    /* renamed from: t  reason: collision with root package name */
    private final String f11039t;

    public b(@Nullable String str, @Nullable String str2, @Nullable ImageRequest imageRequest, @Nullable Object obj, @Nullable f fVar, long j4, long j5, long j6, long j7, long j8, long j9, long j10, int i4, boolean z4, int i5, int i6, int i7, long j11, long j12, @Nullable String str3) {
        this.f11020a = str;
        this.f11021b = str2;
        this.f11023d = imageRequest;
        this.f11022c = obj;
        this.f11024e = fVar;
        this.f11025f = j4;
        this.f11026g = j5;
        this.f11027h = j6;
        this.f11028i = j7;
        this.f11029j = j8;
        this.f11030k = j9;
        this.f11031l = j10;
        this.f11032m = i4;
        this.f11033n = z4;
        this.f11034o = i5;
        this.f11035p = i6;
        this.f11036q = i7;
        this.f11037r = j11;
        this.f11038s = j12;
        this.f11039t = str3;
    }

    public String a() {
        return g.f(this).f("controller ID", this.f11020a).f("request ID", this.f11021b).e("controller submit", this.f11025f).e("controller final image", this.f11027h).e("controller failure", this.f11028i).e("controller cancel", this.f11029j).e("start time", this.f11030k).e("end time", this.f11031l).f("origin", l0.c.b(this.f11032m)).g("prefetch", this.f11033n).f("caller context", this.f11022c).f("image request", this.f11023d).f("image info", this.f11024e).d("on-screen width", this.f11034o).d("on-screen height", this.f11035p).d("visibility state", this.f11036q).f("component tag", this.f11039t).toString();
    }

    @Nullable
    public Object b() {
        return this.f11022c;
    }

    @Nullable
    public String c() {
        return this.f11039t;
    }

    public long d() {
        return this.f11028i;
    }

    public long e() {
        return this.f11027h;
    }

    @Nullable
    public String f() {
        return this.f11020a;
    }

    public long g() {
        return this.f11026g;
    }

    public long h() {
        return this.f11025f;
    }

    public long i() {
        if (m() == -1 || n() == -1) {
            return -1L;
        }
        return m() - n();
    }

    @Nullable
    public f j() {
        return this.f11024e;
    }

    public int k() {
        return this.f11032m;
    }

    @Nullable
    public ImageRequest l() {
        return this.f11023d;
    }

    public long m() {
        return this.f11031l;
    }

    public long n() {
        return this.f11030k;
    }

    public long o() {
        if (g() == -1 || h() == -1) {
            return -1L;
        }
        return g() - h();
    }

    public long p() {
        return this.f11038s;
    }

    public int q() {
        return this.f11035p;
    }

    public int r() {
        return this.f11034o;
    }

    @Nullable
    public String s() {
        return this.f11021b;
    }

    public long t() {
        return this.f11037r;
    }

    public int u() {
        return this.f11036q;
    }

    public boolean v() {
        return this.f11033n;
    }
}
