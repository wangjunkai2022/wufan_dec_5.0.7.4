package com.coremedia.iso.boxes;

import com.android.dx.io.Opcodes;
import com.facebook.imagepipeline.common.RotationOptions;
import com.swift.sandhook.annotation.MethodReflectParams;
import java.nio.ByteBuffer;
import java.util.Date;
import org.aspectj.lang.c;
import tv.danmaku.ijk.media.player.IjkMediaMeta;
/* compiled from: MovieHeaderBox.java */
/* loaded from: classes2.dex */
public class i0 extends com.googlecode.mp4parser.c {
    private static final /* synthetic */ c.b A1 = null;
    private static final /* synthetic */ c.b B1 = null;
    private static final /* synthetic */ c.b C1 = null;
    private static final /* synthetic */ c.b D1 = null;
    private static final /* synthetic */ c.b E1 = null;
    private static final /* synthetic */ c.b F1 = null;
    public static final String G = "mvhd";
    private static final /* synthetic */ c.b G1 = null;
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
    private static final /* synthetic */ c.b f9725p0 = null;

    /* renamed from: p1  reason: collision with root package name */
    private static final /* synthetic */ c.b f9726p1 = null;

    /* renamed from: v1  reason: collision with root package name */
    private static final /* synthetic */ c.b f9727v1 = null;
    private int A;
    private int B;
    private int C;
    private int D;
    private int E;
    private int F;

    /* renamed from: s  reason: collision with root package name */
    private Date f9728s;

    /* renamed from: t  reason: collision with root package name */
    private Date f9729t;

    /* renamed from: u  reason: collision with root package name */
    private long f9730u;

    /* renamed from: v  reason: collision with root package name */
    private long f9731v;

    /* renamed from: w  reason: collision with root package name */
    private double f9732w;

    /* renamed from: x  reason: collision with root package name */
    private float f9733x;

    /* renamed from: y  reason: collision with root package name */
    private com.googlecode.mp4parser.util.l f9734y;

    /* renamed from: z  reason: collision with root package name */
    private long f9735z;

    static {
        s();
    }

    public i0() {
        super(G);
        this.f9732w = 1.0d;
        this.f9733x = 1.0f;
        this.f9734y = com.googlecode.mp4parser.util.l.f14234j;
    }

    private static /* synthetic */ void s() {
        org.aspectj.runtime.reflect.e eVar = new org.aspectj.runtime.reflect.e("MovieHeaderBox.java", i0.class);
        H = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getCreationTime", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "", "java.util.Date"), 63);
        I = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getModificationTime", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "", "java.util.Date"), 67);
        R = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setModificationTime", "com.coremedia.iso.boxes.MovieHeaderBox", "java.util.Date", "modificationTime", "", "void"), 203);
        S = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setTimescale", "com.coremedia.iso.boxes.MovieHeaderBox", MethodReflectParams.LONG, "timescale", "", "void"), 211);
        T = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setDuration", "com.coremedia.iso.boxes.MovieHeaderBox", MethodReflectParams.LONG, "duration", "", "void"), 215);
        U = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setRate", "com.coremedia.iso.boxes.MovieHeaderBox", MethodReflectParams.DOUBLE, "rate", "", "void"), Opcodes.OR_INT_LIT8);
        V = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setVolume", "com.coremedia.iso.boxes.MovieHeaderBox", "float", "volume", "", "void"), Opcodes.USHR_INT_LIT8);
        W = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setMatrix", "com.coremedia.iso.boxes.MovieHeaderBox", "com.googlecode.mp4parser.util.Matrix", "matrix", "", "void"), 230);
        X = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setNextTrackId", "com.coremedia.iso.boxes.MovieHeaderBox", MethodReflectParams.LONG, "nextTrackId", "", "void"), 234);
        Y = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getPreviewTime", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "", MethodReflectParams.INT), 238);
        Z = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setPreviewTime", "com.coremedia.iso.boxes.MovieHeaderBox", MethodReflectParams.INT, "previewTime", "", "void"), 242);
        f9725p0 = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getPreviewDuration", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "", MethodReflectParams.INT), com.papa.controller.core.hardware.a.f58131m);
        J = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getTimescale", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "", MethodReflectParams.LONG), 71);
        f9726p1 = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setPreviewDuration", "com.coremedia.iso.boxes.MovieHeaderBox", MethodReflectParams.INT, "previewDuration", "", "void"), 250);
        f9727v1 = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getPosterTime", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "", MethodReflectParams.INT), 254);
        A1 = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setPosterTime", "com.coremedia.iso.boxes.MovieHeaderBox", MethodReflectParams.INT, "posterTime", "", "void"), com.join.mgps.socket.fight.arena.a.f54751i);
        B1 = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getSelectionTime", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "", MethodReflectParams.INT), 262);
        C1 = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setSelectionTime", "com.coremedia.iso.boxes.MovieHeaderBox", MethodReflectParams.INT, "selectionTime", "", "void"), 266);
        D1 = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getSelectionDuration", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "", MethodReflectParams.INT), RotationOptions.f11694f);
        E1 = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setSelectionDuration", "com.coremedia.iso.boxes.MovieHeaderBox", MethodReflectParams.INT, "selectionDuration", "", "void"), com.facebook.imageutils.e.f12543d);
        F1 = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getCurrentTime", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "", MethodReflectParams.INT), 278);
        G1 = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setCurrentTime", "com.coremedia.iso.boxes.MovieHeaderBox", MethodReflectParams.INT, "currentTime", "", "void"), 282);
        K = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getDuration", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "", MethodReflectParams.LONG), 75);
        L = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getRate", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "", MethodReflectParams.DOUBLE), 79);
        M = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getVolume", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "", "float"), 83);
        N = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getMatrix", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "", "com.googlecode.mp4parser.util.Matrix"), 87);
        O = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getNextTrackId", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "", MethodReflectParams.LONG), 91);
        P = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "toString", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "", "java.lang.String"), 139);
        Q = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setCreationTime", "com.coremedia.iso.boxes.MovieHeaderBox", "java.util.Date", "creationTime", "", "void"), 195);
    }

    public long A() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(O, this, this));
        return this.f9735z;
    }

    public int B() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(f9727v1, this, this));
        return this.C;
    }

    public int C() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(f9725p0, this, this));
        return this.B;
    }

    public int D() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(Y, this, this));
        return this.A;
    }

    public double E() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(L, this, this));
        return this.f9732w;
    }

    public int F() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(D1, this, this));
        return this.E;
    }

    public int G() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(B1, this, this));
        return this.D;
    }

    public long H() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(J, this, this));
        return this.f9730u;
    }

    public float I() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(M, this, this));
        return this.f9733x;
    }

    public void J(Date date) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(Q, this, this, date));
        this.f9728s = date;
        if (com.googlecode.mp4parser.util.e.a(date) >= IjkMediaMeta.AV_CH_WIDE_RIGHT) {
            setVersion(1);
        }
    }

    public void K(int i4) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(G1, this, this, org.aspectj.runtime.internal.e.k(i4)));
        this.F = i4;
    }

    public void L(long j4) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(T, this, this, org.aspectj.runtime.internal.e.m(j4)));
        this.f9731v = j4;
        if (j4 >= IjkMediaMeta.AV_CH_WIDE_RIGHT) {
            setVersion(1);
        }
    }

    public void M(com.googlecode.mp4parser.util.l lVar) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(W, this, this, lVar));
        this.f9734y = lVar;
    }

    public void N(Date date) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(R, this, this, date));
        this.f9729t = date;
        if (com.googlecode.mp4parser.util.e.a(date) >= IjkMediaMeta.AV_CH_WIDE_RIGHT) {
            setVersion(1);
        }
    }

    public void O(long j4) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(X, this, this, org.aspectj.runtime.internal.e.m(j4)));
        this.f9735z = j4;
    }

    public void P(int i4) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(A1, this, this, org.aspectj.runtime.internal.e.k(i4)));
        this.C = i4;
    }

    public void Q(int i4) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(f9726p1, this, this, org.aspectj.runtime.internal.e.k(i4)));
        this.B = i4;
    }

    public void R(int i4) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(Z, this, this, org.aspectj.runtime.internal.e.k(i4)));
        this.A = i4;
    }

    public void S(double d5) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(U, this, this, org.aspectj.runtime.internal.e.g(d5)));
        this.f9732w = d5;
    }

    public void T(int i4) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(E1, this, this, org.aspectj.runtime.internal.e.k(i4)));
        this.E = i4;
    }

    public void U(int i4) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(C1, this, this, org.aspectj.runtime.internal.e.k(i4)));
        this.D = i4;
    }

    public void V(long j4) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(S, this, this, org.aspectj.runtime.internal.e.m(j4)));
        this.f9730u = j4;
    }

    public void W(float f5) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(V, this, this, org.aspectj.runtime.internal.e.i(f5)));
        this.f9733x = f5;
    }

    @Override // com.googlecode.mp4parser.a
    public void b(ByteBuffer byteBuffer) {
        t(byteBuffer);
        if (getVersion() == 1) {
            this.f9728s = com.googlecode.mp4parser.util.e.b(com.coremedia.iso.g.o(byteBuffer));
            this.f9729t = com.googlecode.mp4parser.util.e.b(com.coremedia.iso.g.o(byteBuffer));
            this.f9730u = com.coremedia.iso.g.l(byteBuffer);
            this.f9731v = com.coremedia.iso.g.o(byteBuffer);
        } else {
            this.f9728s = com.googlecode.mp4parser.util.e.b(com.coremedia.iso.g.l(byteBuffer));
            this.f9729t = com.googlecode.mp4parser.util.e.b(com.coremedia.iso.g.l(byteBuffer));
            this.f9730u = com.coremedia.iso.g.l(byteBuffer);
            this.f9731v = com.coremedia.iso.g.l(byteBuffer);
        }
        this.f9732w = com.coremedia.iso.g.d(byteBuffer);
        this.f9733x = com.coremedia.iso.g.e(byteBuffer);
        com.coremedia.iso.g.i(byteBuffer);
        com.coremedia.iso.g.l(byteBuffer);
        com.coremedia.iso.g.l(byteBuffer);
        this.f9734y = com.googlecode.mp4parser.util.l.a(byteBuffer);
        this.A = byteBuffer.getInt();
        this.B = byteBuffer.getInt();
        this.C = byteBuffer.getInt();
        this.D = byteBuffer.getInt();
        this.E = byteBuffer.getInt();
        this.F = byteBuffer.getInt();
        this.f9735z = com.coremedia.iso.g.l(byteBuffer);
    }

    @Override // com.googlecode.mp4parser.a
    protected void c(ByteBuffer byteBuffer) {
        u(byteBuffer);
        if (getVersion() == 1) {
            com.coremedia.iso.i.l(byteBuffer, com.googlecode.mp4parser.util.e.a(this.f9728s));
            com.coremedia.iso.i.l(byteBuffer, com.googlecode.mp4parser.util.e.a(this.f9729t));
            com.coremedia.iso.i.i(byteBuffer, this.f9730u);
            com.coremedia.iso.i.l(byteBuffer, this.f9731v);
        } else {
            com.coremedia.iso.i.i(byteBuffer, com.googlecode.mp4parser.util.e.a(this.f9728s));
            com.coremedia.iso.i.i(byteBuffer, com.googlecode.mp4parser.util.e.a(this.f9729t));
            com.coremedia.iso.i.i(byteBuffer, this.f9730u);
            com.coremedia.iso.i.i(byteBuffer, this.f9731v);
        }
        com.coremedia.iso.i.b(byteBuffer, this.f9732w);
        com.coremedia.iso.i.c(byteBuffer, this.f9733x);
        com.coremedia.iso.i.f(byteBuffer, 0);
        com.coremedia.iso.i.i(byteBuffer, 0L);
        com.coremedia.iso.i.i(byteBuffer, 0L);
        this.f9734y.c(byteBuffer);
        byteBuffer.putInt(this.A);
        byteBuffer.putInt(this.B);
        byteBuffer.putInt(this.C);
        byteBuffer.putInt(this.D);
        byteBuffer.putInt(this.E);
        byteBuffer.putInt(this.F);
        com.coremedia.iso.i.i(byteBuffer, this.f9735z);
    }

    @Override // com.googlecode.mp4parser.a
    protected long e() {
        return (getVersion() == 1 ? 32L : 20L) + 80;
    }

    public String toString() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(P, this, this));
        return "MovieHeaderBox[creationTime=" + v() + ";modificationTime=" + z() + ";timescale=" + H() + ";duration=" + x() + ";rate=" + E() + ";volume=" + I() + ";matrix=" + this.f9734y + ";nextTrackId=" + A() + "]";
    }

    public Date v() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(H, this, this));
        return this.f9728s;
    }

    public int w() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(F1, this, this));
        return this.F;
    }

    public long x() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(K, this, this));
        return this.f9731v;
    }

    public com.googlecode.mp4parser.util.l y() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(N, this, this));
        return this.f9734y;
    }

    public Date z() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(I, this, this));
        return this.f9729t;
    }
}
