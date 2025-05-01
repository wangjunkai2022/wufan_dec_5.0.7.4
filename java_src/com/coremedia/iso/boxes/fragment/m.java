package com.coremedia.iso.boxes.fragment;

import com.swift.sandhook.annotation.MethodReflectParams;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.aspectj.lang.c;
/* compiled from: TrackFragmentRandomAccessBox.java */
/* loaded from: classes2.dex */
public class m extends com.googlecode.mp4parser.c {
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
    public static final String f9661y = "tfra";

    /* renamed from: z  reason: collision with root package name */
    private static final /* synthetic */ c.b f9662z = null;

    /* renamed from: s  reason: collision with root package name */
    private long f9663s;

    /* renamed from: t  reason: collision with root package name */
    private int f9664t;

    /* renamed from: u  reason: collision with root package name */
    private int f9665u;

    /* renamed from: v  reason: collision with root package name */
    private int f9666v;

    /* renamed from: w  reason: collision with root package name */
    private int f9667w;

    /* renamed from: x  reason: collision with root package name */
    private List<a> f9668x;

    /* compiled from: TrackFragmentRandomAccessBox.java */
    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private long f9669a;

        /* renamed from: b  reason: collision with root package name */
        private long f9670b;

        /* renamed from: c  reason: collision with root package name */
        private long f9671c;

        /* renamed from: d  reason: collision with root package name */
        private long f9672d;

        /* renamed from: e  reason: collision with root package name */
        private long f9673e;

        public a() {
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f9670b == aVar.f9670b && this.f9673e == aVar.f9673e && this.f9669a == aVar.f9669a && this.f9671c == aVar.f9671c && this.f9672d == aVar.f9672d;
        }

        public int hashCode() {
            long j4 = this.f9669a;
            long j5 = this.f9670b;
            long j6 = this.f9671c;
            long j7 = this.f9672d;
            long j8 = this.f9673e;
            return (((((((((int) (j4 ^ (j4 >>> 32))) * 31) + ((int) (j5 ^ (j5 >>> 32)))) * 31) + ((int) (j6 ^ (j6 >>> 32)))) * 31) + ((int) (j7 ^ (j7 >>> 32)))) * 31) + ((int) (j8 ^ (j8 >>> 32)));
        }

        public long k() {
            return this.f9670b;
        }

        public long l() {
            return this.f9673e;
        }

        public long m() {
            return this.f9669a;
        }

        public long n() {
            return this.f9671c;
        }

        public long o() {
            return this.f9672d;
        }

        public void p(long j4) {
            this.f9670b = j4;
        }

        public void q(long j4) {
            this.f9673e = j4;
        }

        public void r(long j4) {
            this.f9669a = j4;
        }

        public void s(long j4) {
            this.f9671c = j4;
        }

        public void t(long j4) {
            this.f9672d = j4;
        }

        public String toString() {
            return "Entry{time=" + this.f9669a + ", moofOffset=" + this.f9670b + ", trafNumber=" + this.f9671c + ", trunNumber=" + this.f9672d + ", sampleNumber=" + this.f9673e + '}';
        }

        public a(long j4, long j5, long j6, long j7, long j8) {
            this.f9670b = j5;
            this.f9673e = j8;
            this.f9669a = j4;
            this.f9671c = j6;
            this.f9672d = j7;
        }
    }

    static {
        s();
    }

    public m() {
        super(f9661y);
        this.f9665u = 2;
        this.f9666v = 2;
        this.f9667w = 2;
        this.f9668x = Collections.emptyList();
    }

    private static /* synthetic */ void s() {
        org.aspectj.runtime.reflect.e eVar = new org.aspectj.runtime.reflect.e("TrackFragmentRandomAccessBox.java", m.class);
        f9662z = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setTrackId", "com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox", MethodReflectParams.LONG, "trackId", "", "void"), 145);
        A = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setLengthSizeOfTrafNum", "com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox", MethodReflectParams.INT, "lengthSizeOfTrafNum", "", "void"), 149);
        J = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getEntries", "com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox", "", "", "", "java.util.List"), 185);
        K = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setEntries", "com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox", "java.util.List", "entries", "", "void"), 189);
        L = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "toString", "com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox", "", "", "", "java.lang.String"), 290);
        B = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setLengthSizeOfTrunNum", "com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox", MethodReflectParams.INT, "lengthSizeOfTrunNum", "", "void"), 153);
        C = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setLengthSizeOfSampleNum", "com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox", MethodReflectParams.INT, "lengthSizeOfSampleNum", "", "void"), 157);
        D = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getTrackId", "com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox", "", "", "", MethodReflectParams.LONG), 161);
        E = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getReserved", "com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox", "", "", "", MethodReflectParams.INT), 165);
        F = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getLengthSizeOfTrafNum", "com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox", "", "", "", MethodReflectParams.INT), 169);
        G = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getLengthSizeOfTrunNum", "com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox", "", "", "", MethodReflectParams.INT), 173);
        H = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getLengthSizeOfSampleNum", "com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox", "", "", "", MethodReflectParams.INT), 177);
        I = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getNumberOfEntries", "com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox", "", "", "", MethodReflectParams.LONG), 181);
    }

    public int A() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(E, this, this));
        return this.f9664t;
    }

    public long B() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(D, this, this));
        return this.f9663s;
    }

    public void C(List<a> list) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(K, this, this, list));
        this.f9668x = list;
    }

    public void D(int i4) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(C, this, this, org.aspectj.runtime.internal.e.k(i4)));
        this.f9667w = i4;
    }

    public void E(int i4) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(A, this, this, org.aspectj.runtime.internal.e.k(i4)));
        this.f9665u = i4;
    }

    public void F(int i4) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(B, this, this, org.aspectj.runtime.internal.e.k(i4)));
        this.f9666v = i4;
    }

    public void G(long j4) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(f9662z, this, this, org.aspectj.runtime.internal.e.m(j4)));
        this.f9663s = j4;
    }

    @Override // com.googlecode.mp4parser.a
    public void b(ByteBuffer byteBuffer) {
        t(byteBuffer);
        this.f9663s = com.coremedia.iso.g.l(byteBuffer);
        long l4 = com.coremedia.iso.g.l(byteBuffer);
        this.f9664t = (int) (l4 >> 6);
        this.f9665u = (((int) (63 & l4)) >> 4) + 1;
        this.f9666v = (((int) (12 & l4)) >> 2) + 1;
        this.f9667w = ((int) (l4 & 3)) + 1;
        long l5 = com.coremedia.iso.g.l(byteBuffer);
        this.f9668x = new ArrayList();
        for (int i4 = 0; i4 < l5; i4++) {
            a aVar = new a();
            if (getVersion() == 1) {
                aVar.f9669a = com.coremedia.iso.g.o(byteBuffer);
                aVar.f9670b = com.coremedia.iso.g.o(byteBuffer);
            } else {
                aVar.f9669a = com.coremedia.iso.g.l(byteBuffer);
                aVar.f9670b = com.coremedia.iso.g.l(byteBuffer);
            }
            aVar.f9671c = com.coremedia.iso.h.a(byteBuffer, this.f9665u);
            aVar.f9672d = com.coremedia.iso.h.a(byteBuffer, this.f9666v);
            aVar.f9673e = com.coremedia.iso.h.a(byteBuffer, this.f9667w);
            this.f9668x.add(aVar);
        }
    }

    @Override // com.googlecode.mp4parser.a
    protected void c(ByteBuffer byteBuffer) {
        u(byteBuffer);
        com.coremedia.iso.i.i(byteBuffer, this.f9663s);
        com.coremedia.iso.i.i(byteBuffer, (this.f9664t << 6) | (((this.f9665u - 1) & 3) << 4) | (((this.f9666v - 1) & 3) << 2) | ((this.f9667w - 1) & 3));
        com.coremedia.iso.i.i(byteBuffer, this.f9668x.size());
        for (a aVar : this.f9668x) {
            if (getVersion() == 1) {
                com.coremedia.iso.i.l(byteBuffer, aVar.f9669a);
                com.coremedia.iso.i.l(byteBuffer, aVar.f9670b);
            } else {
                com.coremedia.iso.i.i(byteBuffer, aVar.f9669a);
                com.coremedia.iso.i.i(byteBuffer, aVar.f9670b);
            }
            com.coremedia.iso.j.a(aVar.f9671c, byteBuffer, this.f9665u);
            com.coremedia.iso.j.a(aVar.f9672d, byteBuffer, this.f9666v);
            com.coremedia.iso.j.a(aVar.f9673e, byteBuffer, this.f9667w);
        }
    }

    @Override // com.googlecode.mp4parser.a
    protected long e() {
        int size;
        if (getVersion() == 1) {
            size = this.f9668x.size() * 16;
        } else {
            size = this.f9668x.size() * 8;
        }
        return 16 + size + (this.f9665u * this.f9668x.size()) + (this.f9666v * this.f9668x.size()) + (this.f9667w * this.f9668x.size());
    }

    public String toString() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(L, this, this));
        return "TrackFragmentRandomAccessBox{trackId=" + this.f9663s + ", entries=" + this.f9668x + '}';
    }

    public List<a> v() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(J, this, this));
        return Collections.unmodifiableList(this.f9668x);
    }

    public int w() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(H, this, this));
        return this.f9667w;
    }

    public int x() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(F, this, this));
        return this.f9665u;
    }

    public int y() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(G, this, this));
        return this.f9666v;
    }

    public long z() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(I, this, this));
        return this.f9668x.size();
    }
}
