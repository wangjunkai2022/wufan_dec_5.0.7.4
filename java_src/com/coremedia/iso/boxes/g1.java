package com.coremedia.iso.boxes;

import com.android.dx.io.Opcodes;
import com.swift.sandhook.annotation.MethodReflectParams;
import java.nio.ByteBuffer;
import java.util.Date;
import org.aspectj.lang.c;
import tv.danmaku.ijk.media.player.IjkMediaMeta;
/* compiled from: TrackHeaderBox.java */
/* loaded from: classes2.dex */
public class g1 extends com.googlecode.mp4parser.c {
    private static final /* synthetic */ c.b A1 = null;
    private static final /* synthetic */ c.b B1 = null;
    public static final String C = "tkhd";
    private static final /* synthetic */ c.b C1 = null;
    private static final /* synthetic */ c.b D = null;
    private static final /* synthetic */ c.b D1 = null;
    private static final /* synthetic */ c.b E = null;
    private static final /* synthetic */ c.b F = null;
    private static final /* synthetic */ c.b G = null;
    private static final /* synthetic */ c.b H = null;
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
    private static final /* synthetic */ c.b f9697p0 = null;

    /* renamed from: p1  reason: collision with root package name */
    private static final /* synthetic */ c.b f9698p1 = null;

    /* renamed from: v1  reason: collision with root package name */
    private static final /* synthetic */ c.b f9699v1 = null;
    private double A;
    private double B;

    /* renamed from: s  reason: collision with root package name */
    private Date f9700s;

    /* renamed from: t  reason: collision with root package name */
    private Date f9701t;

    /* renamed from: u  reason: collision with root package name */
    private long f9702u;

    /* renamed from: v  reason: collision with root package name */
    private long f9703v;

    /* renamed from: w  reason: collision with root package name */
    private int f9704w;

    /* renamed from: x  reason: collision with root package name */
    private int f9705x;

    /* renamed from: y  reason: collision with root package name */
    private float f9706y;

    /* renamed from: z  reason: collision with root package name */
    private com.googlecode.mp4parser.util.l f9707z;

    static {
        s();
    }

    public g1() {
        super(C);
        this.f9707z = com.googlecode.mp4parser.util.l.f14234j;
    }

    private static /* synthetic */ void s() {
        org.aspectj.runtime.reflect.e eVar = new org.aspectj.runtime.reflect.e("TrackHeaderBox.java", g1.class);
        D = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getCreationTime", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "", "java.util.Date"), 60);
        E = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getModificationTime", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "", "java.util.Date"), 64);
        N = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getContent", "com.coremedia.iso.boxes.TrackHeaderBox", "java.nio.ByteBuffer", "byteBuffer", "", "void"), 142);
        O = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "toString", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "", "java.lang.String"), 170);
        P = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setCreationTime", "com.coremedia.iso.boxes.TrackHeaderBox", "java.util.Date", "creationTime", "", "void"), 196);
        Q = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setModificationTime", "com.coremedia.iso.boxes.TrackHeaderBox", "java.util.Date", "modificationTime", "", "void"), 203);
        R = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setTrackId", "com.coremedia.iso.boxes.TrackHeaderBox", MethodReflectParams.LONG, "trackId", "", "void"), 211);
        S = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setDuration", "com.coremedia.iso.boxes.TrackHeaderBox", MethodReflectParams.LONG, "duration", "", "void"), 215);
        T = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setLayer", "com.coremedia.iso.boxes.TrackHeaderBox", MethodReflectParams.INT, "layer", "", "void"), Opcodes.OR_INT_LIT8);
        U = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setAlternateGroup", "com.coremedia.iso.boxes.TrackHeaderBox", MethodReflectParams.INT, "alternateGroup", "", "void"), Opcodes.USHR_INT_LIT8);
        V = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setVolume", "com.coremedia.iso.boxes.TrackHeaderBox", "float", "volume", "", "void"), 230);
        W = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setMatrix", "com.coremedia.iso.boxes.TrackHeaderBox", "com.googlecode.mp4parser.util.Matrix", "matrix", "", "void"), 234);
        F = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getTrackId", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "", MethodReflectParams.LONG), 68);
        X = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setWidth", "com.coremedia.iso.boxes.TrackHeaderBox", MethodReflectParams.DOUBLE, "width", "", "void"), 238);
        Y = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setHeight", "com.coremedia.iso.boxes.TrackHeaderBox", MethodReflectParams.DOUBLE, "height", "", "void"), 242);
        Z = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "isEnabled", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "", "boolean"), 247);
        f9697p0 = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "isInMovie", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "", "boolean"), Opcodes.INVOKE_POLYMORPHIC_RANGE);
        f9698p1 = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "isInPreview", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "", "boolean"), 255);
        f9699v1 = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "isInPoster", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "", "boolean"), 259);
        A1 = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setEnabled", "com.coremedia.iso.boxes.TrackHeaderBox", "boolean", "enabled", "", "void"), 263);
        B1 = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setInMovie", "com.coremedia.iso.boxes.TrackHeaderBox", "boolean", "inMovie", "", "void"), 271);
        C1 = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setInPreview", "com.coremedia.iso.boxes.TrackHeaderBox", "boolean", "inPreview", "", "void"), 279);
        D1 = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setInPoster", "com.coremedia.iso.boxes.TrackHeaderBox", "boolean", "inPoster", "", "void"), 287);
        G = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getDuration", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "", MethodReflectParams.LONG), 72);
        H = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getLayer", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "", MethodReflectParams.INT), 76);
        I = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getAlternateGroup", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "", MethodReflectParams.INT), 80);
        J = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getVolume", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "", "float"), 84);
        K = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getMatrix", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "", "com.googlecode.mp4parser.util.Matrix"), 88);
        L = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getWidth", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "", MethodReflectParams.DOUBLE), 92);
        M = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getHeight", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "", MethodReflectParams.DOUBLE), 96);
    }

    public com.googlecode.mp4parser.util.l A() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(K, this, this));
        return this.f9707z;
    }

    public Date B() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(E, this, this));
        return this.f9701t;
    }

    public long C() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(F, this, this));
        return this.f9702u;
    }

    public float D() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(J, this, this));
        return this.f9706y;
    }

    public double E() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(L, this, this));
        return this.A;
    }

    public boolean F() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(Z, this, this));
        return (getFlags() & 1) > 0;
    }

    public boolean G() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(f9697p0, this, this));
        return (getFlags() & 2) > 0;
    }

    public boolean H() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(f9699v1, this, this));
        return (getFlags() & 8) > 0;
    }

    public boolean I() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(f9698p1, this, this));
        return (getFlags() & 4) > 0;
    }

    public void J(int i4) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(U, this, this, org.aspectj.runtime.internal.e.k(i4)));
        this.f9705x = i4;
    }

    public void K(Date date) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(P, this, this, date));
        this.f9700s = date;
        if (com.googlecode.mp4parser.util.e.a(date) >= IjkMediaMeta.AV_CH_WIDE_RIGHT) {
            setVersion(1);
        }
    }

    public void L(long j4) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(S, this, this, org.aspectj.runtime.internal.e.m(j4)));
        this.f9703v = j4;
        if (j4 >= IjkMediaMeta.AV_CH_WIDE_RIGHT) {
            setFlags(1);
        }
    }

    public void M(boolean z4) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(A1, this, this, org.aspectj.runtime.internal.e.a(z4)));
        if (z4) {
            setFlags(getFlags() | 1);
        } else {
            setFlags(getFlags() & (-2));
        }
    }

    public void N(double d5) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(Y, this, this, org.aspectj.runtime.internal.e.g(d5)));
        this.B = d5;
    }

    public void O(boolean z4) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(B1, this, this, org.aspectj.runtime.internal.e.a(z4)));
        if (z4) {
            setFlags(getFlags() | 2);
        } else {
            setFlags(getFlags() & (-3));
        }
    }

    public void P(boolean z4) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(D1, this, this, org.aspectj.runtime.internal.e.a(z4)));
        if (z4) {
            setFlags(getFlags() | 8);
        } else {
            setFlags(getFlags() & (-9));
        }
    }

    public void Q(boolean z4) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(C1, this, this, org.aspectj.runtime.internal.e.a(z4)));
        if (z4) {
            setFlags(getFlags() | 4);
        } else {
            setFlags(getFlags() & (-5));
        }
    }

    public void R(int i4) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(T, this, this, org.aspectj.runtime.internal.e.k(i4)));
        this.f9704w = i4;
    }

    public void S(com.googlecode.mp4parser.util.l lVar) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(W, this, this, lVar));
        this.f9707z = lVar;
    }

    public void T(Date date) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(Q, this, this, date));
        this.f9701t = date;
        if (com.googlecode.mp4parser.util.e.a(date) >= IjkMediaMeta.AV_CH_WIDE_RIGHT) {
            setVersion(1);
        }
    }

    public void U(long j4) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(R, this, this, org.aspectj.runtime.internal.e.m(j4)));
        this.f9702u = j4;
    }

    public void V(float f5) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(V, this, this, org.aspectj.runtime.internal.e.i(f5)));
        this.f9706y = f5;
    }

    public void W(double d5) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(X, this, this, org.aspectj.runtime.internal.e.g(d5)));
        this.A = d5;
    }

    @Override // com.googlecode.mp4parser.a
    public void b(ByteBuffer byteBuffer) {
        t(byteBuffer);
        if (getVersion() == 1) {
            this.f9700s = com.googlecode.mp4parser.util.e.b(com.coremedia.iso.g.o(byteBuffer));
            this.f9701t = com.googlecode.mp4parser.util.e.b(com.coremedia.iso.g.o(byteBuffer));
            this.f9702u = com.coremedia.iso.g.l(byteBuffer);
            com.coremedia.iso.g.l(byteBuffer);
            long j4 = byteBuffer.getLong();
            this.f9703v = j4;
            if (j4 < -1) {
                throw new RuntimeException("The tracks duration is bigger than Long.MAX_VALUE");
            }
        } else {
            this.f9700s = com.googlecode.mp4parser.util.e.b(com.coremedia.iso.g.l(byteBuffer));
            this.f9701t = com.googlecode.mp4parser.util.e.b(com.coremedia.iso.g.l(byteBuffer));
            this.f9702u = com.coremedia.iso.g.l(byteBuffer);
            com.coremedia.iso.g.l(byteBuffer);
            this.f9703v = com.coremedia.iso.g.l(byteBuffer);
        }
        com.coremedia.iso.g.l(byteBuffer);
        com.coremedia.iso.g.l(byteBuffer);
        this.f9704w = com.coremedia.iso.g.i(byteBuffer);
        this.f9705x = com.coremedia.iso.g.i(byteBuffer);
        this.f9706y = com.coremedia.iso.g.e(byteBuffer);
        com.coremedia.iso.g.i(byteBuffer);
        this.f9707z = com.googlecode.mp4parser.util.l.a(byteBuffer);
        this.A = com.coremedia.iso.g.d(byteBuffer);
        this.B = com.coremedia.iso.g.d(byteBuffer);
    }

    @Override // com.googlecode.mp4parser.a
    public void c(ByteBuffer byteBuffer) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(N, this, this, byteBuffer));
        u(byteBuffer);
        if (getVersion() == 1) {
            com.coremedia.iso.i.l(byteBuffer, com.googlecode.mp4parser.util.e.a(this.f9700s));
            com.coremedia.iso.i.l(byteBuffer, com.googlecode.mp4parser.util.e.a(this.f9701t));
            com.coremedia.iso.i.i(byteBuffer, this.f9702u);
            com.coremedia.iso.i.i(byteBuffer, 0L);
            com.coremedia.iso.i.l(byteBuffer, this.f9703v);
        } else {
            com.coremedia.iso.i.i(byteBuffer, com.googlecode.mp4parser.util.e.a(this.f9700s));
            com.coremedia.iso.i.i(byteBuffer, com.googlecode.mp4parser.util.e.a(this.f9701t));
            com.coremedia.iso.i.i(byteBuffer, this.f9702u);
            com.coremedia.iso.i.i(byteBuffer, 0L);
            com.coremedia.iso.i.i(byteBuffer, this.f9703v);
        }
        com.coremedia.iso.i.i(byteBuffer, 0L);
        com.coremedia.iso.i.i(byteBuffer, 0L);
        com.coremedia.iso.i.f(byteBuffer, this.f9704w);
        com.coremedia.iso.i.f(byteBuffer, this.f9705x);
        com.coremedia.iso.i.c(byteBuffer, this.f9706y);
        com.coremedia.iso.i.f(byteBuffer, 0);
        this.f9707z.c(byteBuffer);
        com.coremedia.iso.i.b(byteBuffer, this.A);
        com.coremedia.iso.i.b(byteBuffer, this.B);
    }

    @Override // com.googlecode.mp4parser.a
    protected long e() {
        return (getVersion() == 1 ? 36L : 24L) + 60;
    }

    public String toString() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(O, this, this));
        return "TrackHeaderBox[creationTime=" + w() + ";modificationTime=" + B() + ";trackId=" + C() + ";duration=" + x() + ";layer=" + z() + ";alternateGroup=" + v() + ";volume=" + D() + ";matrix=" + this.f9707z + ";width=" + E() + ";height=" + y() + "]";
    }

    public int v() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(I, this, this));
        return this.f9705x;
    }

    public Date w() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(D, this, this));
        return this.f9700s;
    }

    public long x() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(G, this, this));
        return this.f9703v;
    }

    public double y() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(M, this, this));
        return this.B;
    }

    public int z() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(H, this, this));
        return this.f9704w;
    }
}
