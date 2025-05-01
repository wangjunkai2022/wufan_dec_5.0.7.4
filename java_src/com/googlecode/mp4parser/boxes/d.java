package com.googlecode.mp4parser.boxes;

import com.coremedia.iso.g;
import com.coremedia.iso.i;
import com.googlecode.mp4parser.annotations.DoNotParseDetail;
import com.googlecode.mp4parser.j;
import com.swift.sandhook.annotation.MethodReflectParams;
import java.nio.ByteBuffer;
import org.aspectj.lang.c;
/* compiled from: DTSSpecificBox.java */
/* loaded from: classes3.dex */
public class d extends com.googlecode.mp4parser.a {
    private static final /* synthetic */ c.b A1 = null;
    private static final /* synthetic */ c.b B1 = null;
    private static final /* synthetic */ c.b C1 = null;
    private static final /* synthetic */ c.b D1 = null;
    public static final String E = "ddts";
    private static final /* synthetic */ c.b E1 = null;
    private static final /* synthetic */ c.b F = null;
    private static final /* synthetic */ c.b F1 = null;
    private static final /* synthetic */ c.b G = null;
    private static final /* synthetic */ c.b G1 = null;
    private static final /* synthetic */ c.b H = null;
    private static final /* synthetic */ c.b H1 = null;
    private static final /* synthetic */ c.b I = null;
    private static final /* synthetic */ c.b J = null;
    private static final /* synthetic */ c.b K = null;
    private static final /* synthetic */ c.b L = null;
    private static final /* synthetic */ c.b M = null;
    private static final /* synthetic */ c.b N = null;
    private static final /* synthetic */ c.b O = null;
    private static final /* synthetic */ c.b P = null;
    private static final /* synthetic */ c.b Q = null;
    private static final /* synthetic */ c.b R = null;
    private static final /* synthetic */ c.b S = null;
    private static final /* synthetic */ c.b T = null;
    private static final /* synthetic */ c.b U = null;
    private static final /* synthetic */ c.b V = null;
    private static final /* synthetic */ c.b W = null;
    private static final /* synthetic */ c.b X = null;
    private static final /* synthetic */ c.b Y = null;
    private static final /* synthetic */ c.b Z = null;

    /* renamed from: p0  reason: collision with root package name */
    private static final /* synthetic */ c.b f13774p0 = null;

    /* renamed from: p1  reason: collision with root package name */
    private static final /* synthetic */ c.b f13775p1 = null;

    /* renamed from: v1  reason: collision with root package name */
    private static final /* synthetic */ c.b f13776v1 = null;
    int A;
    int B;
    int C;
    int D;

    /* renamed from: o  reason: collision with root package name */
    long f13777o;

    /* renamed from: p  reason: collision with root package name */
    long f13778p;

    /* renamed from: q  reason: collision with root package name */
    long f13779q;

    /* renamed from: r  reason: collision with root package name */
    int f13780r;

    /* renamed from: s  reason: collision with root package name */
    int f13781s;

    /* renamed from: t  reason: collision with root package name */
    int f13782t;

    /* renamed from: u  reason: collision with root package name */
    int f13783u;

    /* renamed from: v  reason: collision with root package name */
    int f13784v;

    /* renamed from: w  reason: collision with root package name */
    int f13785w;

    /* renamed from: x  reason: collision with root package name */
    int f13786x;

    /* renamed from: y  reason: collision with root package name */
    int f13787y;

    /* renamed from: z  reason: collision with root package name */
    int f13788z;

    static {
        s();
    }

    public d() {
        super(E);
    }

    private static /* synthetic */ void s() {
        org.aspectj.runtime.reflect.e eVar = new org.aspectj.runtime.reflect.e("DTSSpecificBox.java", d.class);
        F = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getAvgBitRate", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "", "", "", MethodReflectParams.LONG), 89);
        G = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setAvgBitRate", "com.googlecode.mp4parser.boxes.DTSSpecificBox", MethodReflectParams.LONG, "avgBitRate", "", "void"), 93);
        P = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getStreamConstruction", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "", "", "", MethodReflectParams.INT), 129);
        Q = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setStreamConstruction", "com.googlecode.mp4parser.boxes.DTSSpecificBox", MethodReflectParams.INT, "streamConstruction", "", "void"), 133);
        R = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getCoreLFEPresent", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "", "", "", MethodReflectParams.INT), 137);
        S = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setCoreLFEPresent", "com.googlecode.mp4parser.boxes.DTSSpecificBox", MethodReflectParams.INT, "coreLFEPresent", "", "void"), 141);
        T = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getCoreLayout", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "", "", "", MethodReflectParams.INT), 145);
        U = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setCoreLayout", "com.googlecode.mp4parser.boxes.DTSSpecificBox", MethodReflectParams.INT, "coreLayout", "", "void"), 149);
        V = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getCoreSize", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "", "", "", MethodReflectParams.INT), 153);
        W = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setCoreSize", "com.googlecode.mp4parser.boxes.DTSSpecificBox", MethodReflectParams.INT, "coreSize", "", "void"), 157);
        X = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getStereoDownmix", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "", "", "", MethodReflectParams.INT), 161);
        Y = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setStereoDownmix", "com.googlecode.mp4parser.boxes.DTSSpecificBox", MethodReflectParams.INT, "stereoDownmix", "", "void"), 165);
        H = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getDTSSamplingFrequency", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "", "", "", MethodReflectParams.LONG), 97);
        Z = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getRepresentationType", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "", "", "", MethodReflectParams.INT), 169);
        f13774p0 = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setRepresentationType", "com.googlecode.mp4parser.boxes.DTSSpecificBox", MethodReflectParams.INT, "representationType", "", "void"), 173);
        f13775p1 = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getChannelLayout", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "", "", "", MethodReflectParams.INT), 177);
        f13776v1 = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setChannelLayout", "com.googlecode.mp4parser.boxes.DTSSpecificBox", MethodReflectParams.INT, "channelLayout", "", "void"), 181);
        A1 = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getMultiAssetFlag", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "", "", "", MethodReflectParams.INT), 185);
        B1 = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setMultiAssetFlag", "com.googlecode.mp4parser.boxes.DTSSpecificBox", MethodReflectParams.INT, "multiAssetFlag", "", "void"), 189);
        C1 = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getLBRDurationMod", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "", "", "", MethodReflectParams.INT), 193);
        D1 = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setLBRDurationMod", "com.googlecode.mp4parser.boxes.DTSSpecificBox", MethodReflectParams.INT, "LBRDurationMod", "", "void"), 197);
        E1 = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getReserved", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "", "", "", MethodReflectParams.INT), 201);
        F1 = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setReserved", "com.googlecode.mp4parser.boxes.DTSSpecificBox", MethodReflectParams.INT, "reserved", "", "void"), 205);
        I = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setDTSSamplingFrequency", "com.googlecode.mp4parser.boxes.DTSSpecificBox", MethodReflectParams.LONG, "DTSSamplingFrequency", "", "void"), 101);
        G1 = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getReservedBoxPresent", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "", "", "", MethodReflectParams.INT), 209);
        H1 = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setReservedBoxPresent", "com.googlecode.mp4parser.boxes.DTSSpecificBox", MethodReflectParams.INT, "reservedBoxPresent", "", "void"), 213);
        J = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getMaxBitRate", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "", "", "", MethodReflectParams.LONG), 105);
        K = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setMaxBitRate", "com.googlecode.mp4parser.boxes.DTSSpecificBox", MethodReflectParams.LONG, "maxBitRate", "", "void"), 109);
        L = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getPcmSampleDepth", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "", "", "", MethodReflectParams.INT), 113);
        M = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setPcmSampleDepth", "com.googlecode.mp4parser.boxes.DTSSpecificBox", MethodReflectParams.INT, "pcmSampleDepth", "", "void"), 117);
        N = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getFrameDuration", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "", "", "", MethodReflectParams.INT), 121);
        O = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setFrameDuration", "com.googlecode.mp4parser.boxes.DTSSpecificBox", MethodReflectParams.INT, "frameDuration", "", "void"), 125);
    }

    public int A() {
        j.b().c(org.aspectj.runtime.reflect.e.v(N, this, this));
        return this.f13781s;
    }

    public int B() {
        j.b().c(org.aspectj.runtime.reflect.e.v(C1, this, this));
        return this.B;
    }

    public long C() {
        j.b().c(org.aspectj.runtime.reflect.e.v(J, this, this));
        return this.f13778p;
    }

    public int D() {
        j.b().c(org.aspectj.runtime.reflect.e.v(A1, this, this));
        return this.A;
    }

    public int E() {
        j.b().c(org.aspectj.runtime.reflect.e.v(L, this, this));
        return this.f13780r;
    }

    public int F() {
        j.b().c(org.aspectj.runtime.reflect.e.v(Z, this, this));
        return this.f13787y;
    }

    public int G() {
        j.b().c(org.aspectj.runtime.reflect.e.v(E1, this, this));
        return this.D;
    }

    public int H() {
        j.b().c(org.aspectj.runtime.reflect.e.v(G1, this, this));
        return this.C;
    }

    public int I() {
        j.b().c(org.aspectj.runtime.reflect.e.v(X, this, this));
        return this.f13786x;
    }

    public int J() {
        j.b().c(org.aspectj.runtime.reflect.e.v(P, this, this));
        return this.f13782t;
    }

    public void K(long j4) {
        j.b().c(org.aspectj.runtime.reflect.e.w(G, this, this, org.aspectj.runtime.internal.e.m(j4)));
        this.f13779q = j4;
    }

    public void L(int i4) {
        j.b().c(org.aspectj.runtime.reflect.e.w(f13776v1, this, this, org.aspectj.runtime.internal.e.k(i4)));
        this.f13788z = i4;
    }

    public void M(int i4) {
        j.b().c(org.aspectj.runtime.reflect.e.w(S, this, this, org.aspectj.runtime.internal.e.k(i4)));
        this.f13783u = i4;
    }

    public void N(int i4) {
        j.b().c(org.aspectj.runtime.reflect.e.w(U, this, this, org.aspectj.runtime.internal.e.k(i4)));
        this.f13784v = i4;
    }

    public void O(int i4) {
        j.b().c(org.aspectj.runtime.reflect.e.w(W, this, this, org.aspectj.runtime.internal.e.k(i4)));
        this.f13785w = i4;
    }

    public void P(long j4) {
        j.b().c(org.aspectj.runtime.reflect.e.w(I, this, this, org.aspectj.runtime.internal.e.m(j4)));
        this.f13777o = j4;
    }

    public void Q(int i4) {
        j.b().c(org.aspectj.runtime.reflect.e.w(O, this, this, org.aspectj.runtime.internal.e.k(i4)));
        this.f13781s = i4;
    }

    public void R(int i4) {
        j.b().c(org.aspectj.runtime.reflect.e.w(D1, this, this, org.aspectj.runtime.internal.e.k(i4)));
        this.B = i4;
    }

    public void S(long j4) {
        j.b().c(org.aspectj.runtime.reflect.e.w(K, this, this, org.aspectj.runtime.internal.e.m(j4)));
        this.f13778p = j4;
    }

    public void T(int i4) {
        j.b().c(org.aspectj.runtime.reflect.e.w(B1, this, this, org.aspectj.runtime.internal.e.k(i4)));
        this.A = i4;
    }

    public void U(int i4) {
        j.b().c(org.aspectj.runtime.reflect.e.w(M, this, this, org.aspectj.runtime.internal.e.k(i4)));
        this.f13780r = i4;
    }

    public void V(int i4) {
        j.b().c(org.aspectj.runtime.reflect.e.w(f13774p0, this, this, org.aspectj.runtime.internal.e.k(i4)));
        this.f13787y = i4;
    }

    public void W(int i4) {
        j.b().c(org.aspectj.runtime.reflect.e.w(F1, this, this, org.aspectj.runtime.internal.e.k(i4)));
        this.D = i4;
    }

    public void X(int i4) {
        j.b().c(org.aspectj.runtime.reflect.e.w(H1, this, this, org.aspectj.runtime.internal.e.k(i4)));
        this.C = i4;
    }

    public void Y(int i4) {
        j.b().c(org.aspectj.runtime.reflect.e.w(Y, this, this, org.aspectj.runtime.internal.e.k(i4)));
        this.f13786x = i4;
    }

    public void Z(int i4) {
        j.b().c(org.aspectj.runtime.reflect.e.w(Q, this, this, org.aspectj.runtime.internal.e.k(i4)));
        this.f13782t = i4;
    }

    @Override // com.googlecode.mp4parser.a
    public void b(ByteBuffer byteBuffer) {
        this.f13777o = g.l(byteBuffer);
        this.f13778p = g.l(byteBuffer);
        this.f13779q = g.l(byteBuffer);
        this.f13780r = g.p(byteBuffer);
        com.googlecode.mp4parser.boxes.mp4.objectdescriptors.c cVar = new com.googlecode.mp4parser.boxes.mp4.objectdescriptors.c(byteBuffer);
        this.f13781s = cVar.c(2);
        this.f13782t = cVar.c(5);
        this.f13783u = cVar.c(1);
        this.f13784v = cVar.c(6);
        this.f13785w = cVar.c(14);
        this.f13786x = cVar.c(1);
        this.f13787y = cVar.c(3);
        this.f13788z = cVar.c(16);
        this.A = cVar.c(1);
        this.B = cVar.c(1);
        this.C = cVar.c(1);
        this.D = cVar.c(5);
    }

    @Override // com.googlecode.mp4parser.a
    protected void c(ByteBuffer byteBuffer) {
        i.i(byteBuffer, this.f13777o);
        i.i(byteBuffer, this.f13778p);
        i.i(byteBuffer, this.f13779q);
        i.m(byteBuffer, this.f13780r);
        com.googlecode.mp4parser.boxes.mp4.objectdescriptors.d dVar = new com.googlecode.mp4parser.boxes.mp4.objectdescriptors.d(byteBuffer);
        dVar.a(this.f13781s, 2);
        dVar.a(this.f13782t, 5);
        dVar.a(this.f13783u, 1);
        dVar.a(this.f13784v, 6);
        dVar.a(this.f13785w, 14);
        dVar.a(this.f13786x, 1);
        dVar.a(this.f13787y, 3);
        dVar.a(this.f13788z, 16);
        dVar.a(this.A, 1);
        dVar.a(this.B, 1);
        dVar.a(this.C, 1);
        dVar.a(this.D, 5);
    }

    @Override // com.googlecode.mp4parser.a
    protected long e() {
        return 20L;
    }

    public long t() {
        j.b().c(org.aspectj.runtime.reflect.e.v(F, this, this));
        return this.f13779q;
    }

    public int u() {
        j.b().c(org.aspectj.runtime.reflect.e.v(f13775p1, this, this));
        return this.f13788z;
    }

    public int v() {
        j.b().c(org.aspectj.runtime.reflect.e.v(R, this, this));
        return this.f13783u;
    }

    public int w() {
        j.b().c(org.aspectj.runtime.reflect.e.v(T, this, this));
        return this.f13784v;
    }

    public int x() {
        j.b().c(org.aspectj.runtime.reflect.e.v(V, this, this));
        return this.f13785w;
    }

    public long y() {
        j.b().c(org.aspectj.runtime.reflect.e.v(H, this, this));
        return this.f13777o;
    }

    @DoNotParseDetail
    public int[] z() {
        int i4;
        int i5;
        int u4 = u();
        if ((u4 & 1) == 1) {
            i4 = 1;
            i5 = 4;
        } else {
            i4 = 0;
            i5 = 0;
        }
        if ((u4 & 2) == 2) {
            i4 += 2;
            i5 = i5 | 1 | 2;
        }
        if ((u4 & 4) == 4) {
            i4 += 2;
            i5 = i5 | 16 | 32;
        }
        if ((u4 & 8) == 8) {
            i4++;
            i5 |= 8;
        }
        if ((u4 & 16) == 16) {
            i4++;
            i5 |= 256;
        }
        if ((u4 & 32) == 32) {
            i4 += 2;
            i5 = i5 | 4096 | 16384;
        }
        if ((u4 & 64) == 64) {
            i4 += 2;
            i5 = i5 | 16 | 32;
        }
        if ((u4 & 128) == 128) {
            i4++;
            i5 |= 8192;
        }
        if ((u4 & 256) == 256) {
            i4++;
            i5 |= 2048;
        }
        if ((u4 & 512) == 512) {
            i4 += 2;
            i5 = i5 | 64 | 128;
        }
        if ((u4 & 1024) == 1024) {
            i4 += 2;
            i5 = i5 | 512 | 1024;
        }
        if ((u4 & 2048) == 2048) {
            i4 += 2;
            i5 = i5 | 16 | 32;
        }
        if ((u4 & 4096) == 4096) {
            i4++;
            i5 |= 8;
        }
        if ((u4 & 8192) == 8192) {
            i4 += 2;
            i5 = i5 | 16 | 32;
        }
        if ((u4 & 16384) == 16384) {
            i4++;
            i5 |= 65536;
        }
        if ((u4 & 32768) == 32768) {
            i4 += 2;
            i5 = 32768 | i5 | 131072;
        }
        if ((u4 & 65536) == 65536) {
            i4++;
        }
        if ((u4 & 131072) == 131072) {
            i4 += 2;
        }
        return new int[]{i4, i5};
    }
}
