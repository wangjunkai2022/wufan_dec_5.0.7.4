package com.googlecode.mp4parser.boxes.threegpp26244;

import com.coremedia.iso.g;
import com.coremedia.iso.i;
import com.googlecode.mp4parser.boxes.mp4.objectdescriptors.d;
import com.googlecode.mp4parser.c;
import com.googlecode.mp4parser.j;
import com.swift.sandhook.annotation.MethodReflectParams;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import org.aspectj.lang.c;
import org.aspectj.runtime.reflect.e;
/* compiled from: SegmentIndexBox.java */
/* loaded from: classes3.dex */
public class a extends c {
    private static final /* synthetic */ c.b A = null;
    private static final /* synthetic */ c.b B = null;
    private static final /* synthetic */ c.b C = null;
    private static final /* synthetic */ c.b D = null;
    private static final /* synthetic */ c.b E = null;
    private static final /* synthetic */ c.b F = null;
    private static final /* synthetic */ c.b G = null;
    private static final /* synthetic */ c.b H = null;
    private static final /* synthetic */ c.b I = null;
    private static final /* synthetic */ c.b J = null;
    private static final /* synthetic */ c.b K = null;
    private static final /* synthetic */ c.b L = null;

    /* renamed from: y  reason: collision with root package name */
    public static final String f14045y = "sidx";

    /* renamed from: z  reason: collision with root package name */
    private static final /* synthetic */ c.b f14046z = null;

    /* renamed from: s  reason: collision with root package name */
    List<C0302a> f14047s;

    /* renamed from: t  reason: collision with root package name */
    long f14048t;

    /* renamed from: u  reason: collision with root package name */
    long f14049u;

    /* renamed from: v  reason: collision with root package name */
    long f14050v;

    /* renamed from: w  reason: collision with root package name */
    long f14051w;

    /* renamed from: x  reason: collision with root package name */
    int f14052x;

    /* compiled from: SegmentIndexBox.java */
    /* renamed from: com.googlecode.mp4parser.boxes.threegpp26244.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static class C0302a {

        /* renamed from: a  reason: collision with root package name */
        byte f14053a;

        /* renamed from: b  reason: collision with root package name */
        int f14054b;

        /* renamed from: c  reason: collision with root package name */
        long f14055c;

        /* renamed from: d  reason: collision with root package name */
        byte f14056d;

        /* renamed from: e  reason: collision with root package name */
        byte f14057e;

        /* renamed from: f  reason: collision with root package name */
        int f14058f;

        public C0302a() {
        }

        public byte a() {
            return this.f14053a;
        }

        public int b() {
            return this.f14054b;
        }

        public int c() {
            return this.f14058f;
        }

        public byte d() {
            return this.f14057e;
        }

        public byte e() {
            return this.f14056d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C0302a c0302a = (C0302a) obj;
            return this.f14053a == c0302a.f14053a && this.f14054b == c0302a.f14054b && this.f14058f == c0302a.f14058f && this.f14057e == c0302a.f14057e && this.f14056d == c0302a.f14056d && this.f14055c == c0302a.f14055c;
        }

        public long f() {
            return this.f14055c;
        }

        public void g(byte b5) {
            this.f14053a = b5;
        }

        public void h(int i4) {
            this.f14054b = i4;
        }

        public int hashCode() {
            long j4 = this.f14055c;
            return (((((((((this.f14053a * 31) + this.f14054b) * 31) + ((int) (j4 ^ (j4 >>> 32)))) * 31) + this.f14056d) * 31) + this.f14057e) * 31) + this.f14058f;
        }

        public void i(int i4) {
            this.f14058f = i4;
        }

        public void j(byte b5) {
            this.f14057e = b5;
        }

        public void k(byte b5) {
            this.f14056d = b5;
        }

        public void l(long j4) {
            this.f14055c = j4;
        }

        public String toString() {
            return "Entry{referenceType=" + ((int) this.f14053a) + ", referencedSize=" + this.f14054b + ", subsegmentDuration=" + this.f14055c + ", startsWithSap=" + ((int) this.f14056d) + ", sapType=" + ((int) this.f14057e) + ", sapDeltaTime=" + this.f14058f + '}';
        }

        public C0302a(int i4, int i5, long j4, boolean z4, int i6, int i7) {
            this.f14053a = (byte) i4;
            this.f14054b = i5;
            this.f14055c = j4;
            this.f14056d = z4 ? (byte) 1 : (byte) 0;
            this.f14057e = (byte) i6;
            this.f14058f = i7;
        }
    }

    static {
        s();
    }

    public a() {
        super(f14045y);
        this.f14047s = new ArrayList();
    }

    private static /* synthetic */ void s() {
        e eVar = new e("SegmentIndexBox.java", a.class);
        f14046z = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getEntries", "com.googlecode.mp4parser.boxes.threegpp26244.SegmentIndexBox", "", "", "", "java.util.List"), 128);
        A = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setEntries", "com.googlecode.mp4parser.boxes.threegpp26244.SegmentIndexBox", "java.util.List", "entries", "", "void"), 132);
        J = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getReserved", "com.googlecode.mp4parser.boxes.threegpp26244.SegmentIndexBox", "", "", "", MethodReflectParams.INT), 168);
        K = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setReserved", "com.googlecode.mp4parser.boxes.threegpp26244.SegmentIndexBox", MethodReflectParams.INT, "reserved", "", "void"), 172);
        L = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "toString", "com.googlecode.mp4parser.boxes.threegpp26244.SegmentIndexBox", "", "", "", "java.lang.String"), 298);
        B = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getReferenceId", "com.googlecode.mp4parser.boxes.threegpp26244.SegmentIndexBox", "", "", "", MethodReflectParams.LONG), 136);
        C = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setReferenceId", "com.googlecode.mp4parser.boxes.threegpp26244.SegmentIndexBox", MethodReflectParams.LONG, "referenceId", "", "void"), 140);
        D = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getTimeScale", "com.googlecode.mp4parser.boxes.threegpp26244.SegmentIndexBox", "", "", "", MethodReflectParams.LONG), 144);
        E = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setTimeScale", "com.googlecode.mp4parser.boxes.threegpp26244.SegmentIndexBox", MethodReflectParams.LONG, "timeScale", "", "void"), 148);
        F = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getEarliestPresentationTime", "com.googlecode.mp4parser.boxes.threegpp26244.SegmentIndexBox", "", "", "", MethodReflectParams.LONG), 152);
        G = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setEarliestPresentationTime", "com.googlecode.mp4parser.boxes.threegpp26244.SegmentIndexBox", MethodReflectParams.LONG, "earliestPresentationTime", "", "void"), 156);
        H = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getFirstOffset", "com.googlecode.mp4parser.boxes.threegpp26244.SegmentIndexBox", "", "", "", MethodReflectParams.LONG), 160);
        I = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setFirstOffset", "com.googlecode.mp4parser.boxes.threegpp26244.SegmentIndexBox", MethodReflectParams.LONG, "firstOffset", "", "void"), 164);
    }

    public long A() {
        j.b().c(e.v(D, this, this));
        return this.f14049u;
    }

    public void B(long j4) {
        j.b().c(e.w(G, this, this, org.aspectj.runtime.internal.e.m(j4)));
        this.f14050v = j4;
    }

    public void C(List<C0302a> list) {
        j.b().c(e.w(A, this, this, list));
        this.f14047s = list;
    }

    public void D(long j4) {
        j.b().c(e.w(I, this, this, org.aspectj.runtime.internal.e.m(j4)));
        this.f14051w = j4;
    }

    public void E(long j4) {
        j.b().c(e.w(C, this, this, org.aspectj.runtime.internal.e.m(j4)));
        this.f14048t = j4;
    }

    public void F(int i4) {
        j.b().c(e.w(K, this, this, org.aspectj.runtime.internal.e.k(i4)));
        this.f14052x = i4;
    }

    public void G(long j4) {
        j.b().c(e.w(E, this, this, org.aspectj.runtime.internal.e.m(j4)));
        this.f14049u = j4;
    }

    @Override // com.googlecode.mp4parser.a
    protected void b(ByteBuffer byteBuffer) {
        t(byteBuffer);
        this.f14048t = g.l(byteBuffer);
        this.f14049u = g.l(byteBuffer);
        if (getVersion() == 0) {
            this.f14050v = g.l(byteBuffer);
            this.f14051w = g.l(byteBuffer);
        } else {
            this.f14050v = g.o(byteBuffer);
            this.f14051w = g.o(byteBuffer);
        }
        this.f14052x = g.i(byteBuffer);
        int i4 = g.i(byteBuffer);
        for (int i5 = 0; i5 < i4; i5++) {
            com.googlecode.mp4parser.boxes.mp4.objectdescriptors.c cVar = new com.googlecode.mp4parser.boxes.mp4.objectdescriptors.c(byteBuffer);
            C0302a c0302a = new C0302a();
            c0302a.g((byte) cVar.c(1));
            c0302a.h(cVar.c(31));
            c0302a.l(g.l(byteBuffer));
            com.googlecode.mp4parser.boxes.mp4.objectdescriptors.c cVar2 = new com.googlecode.mp4parser.boxes.mp4.objectdescriptors.c(byteBuffer);
            c0302a.k((byte) cVar2.c(1));
            c0302a.j((byte) cVar2.c(3));
            c0302a.i(cVar2.c(28));
            this.f14047s.add(c0302a);
        }
    }

    @Override // com.googlecode.mp4parser.a
    protected void c(ByteBuffer byteBuffer) {
        u(byteBuffer);
        i.i(byteBuffer, this.f14048t);
        i.i(byteBuffer, this.f14049u);
        if (getVersion() == 0) {
            i.i(byteBuffer, this.f14050v);
            i.i(byteBuffer, this.f14051w);
        } else {
            i.l(byteBuffer, this.f14050v);
            i.l(byteBuffer, this.f14051w);
        }
        i.f(byteBuffer, this.f14052x);
        i.f(byteBuffer, this.f14047s.size());
        for (C0302a c0302a : this.f14047s) {
            d dVar = new d(byteBuffer);
            dVar.a(c0302a.a(), 1);
            dVar.a(c0302a.b(), 31);
            i.i(byteBuffer, c0302a.f());
            d dVar2 = new d(byteBuffer);
            dVar2.a(c0302a.e(), 1);
            dVar2.a(c0302a.d(), 3);
            dVar2.a(c0302a.c(), 28);
        }
    }

    @Override // com.googlecode.mp4parser.a
    protected long e() {
        return 12 + (getVersion() == 0 ? 8 : 16) + 2 + 2 + (this.f14047s.size() * 12);
    }

    public String toString() {
        j.b().c(e.v(L, this, this));
        return "SegmentIndexBox{entries=" + this.f14047s + ", referenceId=" + this.f14048t + ", timeScale=" + this.f14049u + ", earliestPresentationTime=" + this.f14050v + ", firstOffset=" + this.f14051w + ", reserved=" + this.f14052x + '}';
    }

    public long v() {
        j.b().c(e.v(F, this, this));
        return this.f14050v;
    }

    public List<C0302a> w() {
        j.b().c(e.v(f14046z, this, this));
        return this.f14047s;
    }

    public long x() {
        j.b().c(e.v(H, this, this));
        return this.f14051w;
    }

    public long y() {
        j.b().c(e.v(B, this, this));
        return this.f14048t;
    }

    public int z() {
        j.b().c(e.v(J, this, this));
        return this.f14052x;
    }
}
