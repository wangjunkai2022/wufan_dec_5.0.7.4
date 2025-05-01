package com.coremedia.iso.boxes.fragment;

import com.android.dx.io.Opcodes;
import com.swift.sandhook.annotation.MethodReflectParams;
import java.nio.ByteBuffer;
import org.aspectj.lang.c;
/* compiled from: TrackFragmentHeaderBox.java */
/* loaded from: classes2.dex */
public class l extends com.googlecode.mp4parser.c {
    public static final String A = "tfhd";
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

    /* renamed from: s  reason: collision with root package name */
    private long f9653s;

    /* renamed from: t  reason: collision with root package name */
    private long f9654t;

    /* renamed from: u  reason: collision with root package name */
    private long f9655u;

    /* renamed from: v  reason: collision with root package name */
    private long f9656v;

    /* renamed from: w  reason: collision with root package name */
    private long f9657w;

    /* renamed from: x  reason: collision with root package name */
    private g f9658x;

    /* renamed from: y  reason: collision with root package name */
    private boolean f9659y;

    /* renamed from: z  reason: collision with root package name */
    private boolean f9660z;

    static {
        s();
    }

    public l() {
        super(A);
        this.f9654t = -1L;
        this.f9656v = -1L;
        this.f9657w = -1L;
    }

    private static /* synthetic */ void s() {
        org.aspectj.runtime.reflect.e eVar = new org.aspectj.runtime.reflect.e("TrackFragmentHeaderBox.java", l.class);
        B = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "hasBaseDataOffset", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "", "", "", "boolean"), 126);
        C = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "hasSampleDescriptionIndex", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "", "", "", "boolean"), 130);
        L = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getDefaultSampleFlags", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "", "", "", "com.coremedia.iso.boxes.fragment.SampleFlags"), 166);
        M = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "isDurationIsEmpty", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "", "", "", "boolean"), 170);
        N = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "isDefaultBaseIsMoof", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "", "", "", "boolean"), 174);
        O = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setTrackId", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", MethodReflectParams.LONG, "trackId", "", "void"), 178);
        P = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setBaseDataOffset", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", MethodReflectParams.LONG, "baseDataOffset", "", "void"), 182);
        Q = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setSampleDescriptionIndex", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", MethodReflectParams.LONG, "sampleDescriptionIndex", "", "void"), 191);
        R = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setDefaultSampleDuration", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", MethodReflectParams.LONG, "defaultSampleDuration", "", "void"), 200);
        S = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setDefaultSampleSize", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", MethodReflectParams.LONG, "defaultSampleSize", "", "void"), 205);
        T = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setDefaultSampleFlags", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "com.coremedia.iso.boxes.fragment.SampleFlags", "defaultSampleFlags", "", "void"), 210);
        U = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setDurationIsEmpty", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "boolean", "durationIsEmpty", "", "void"), 215);
        D = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "hasDefaultSampleDuration", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "", "", "", "boolean"), 134);
        V = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setDefaultBaseIsMoof", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "boolean", "defaultBaseIsMoof", "", "void"), 220);
        W = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "toString", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "", "", "", "java.lang.String"), Opcodes.USHR_INT_LIT8);
        E = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "hasDefaultSampleSize", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "", "", "", "boolean"), 138);
        F = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "hasDefaultSampleFlags", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "", "", "", "boolean"), 142);
        G = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getTrackId", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "", "", "", MethodReflectParams.LONG), 146);
        H = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getBaseDataOffset", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "", "", "", MethodReflectParams.LONG), 150);
        I = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getSampleDescriptionIndex", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "", "", "", MethodReflectParams.LONG), 154);
        J = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getDefaultSampleDuration", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "", "", "", MethodReflectParams.LONG), 158);
        K = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getDefaultSampleSize", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "", "", "", MethodReflectParams.LONG), 162);
    }

    public long A() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(G, this, this));
        return this.f9653s;
    }

    public boolean B() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(B, this, this));
        return (getFlags() & 1) != 0;
    }

    public boolean C() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(D, this, this));
        return (getFlags() & 8) != 0;
    }

    public boolean D() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(F, this, this));
        return (getFlags() & 32) != 0;
    }

    public boolean E() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(E, this, this));
        return (getFlags() & 16) != 0;
    }

    public boolean F() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(C, this, this));
        return (getFlags() & 2) != 0;
    }

    public boolean G() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(N, this, this));
        return this.f9660z;
    }

    public boolean H() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(M, this, this));
        return this.f9659y;
    }

    public void I(long j4) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(P, this, this, org.aspectj.runtime.internal.e.m(j4)));
        if (j4 == -1) {
            setFlags(getFlags() & 2147483646);
        } else {
            setFlags(getFlags() | 1);
        }
        this.f9654t = j4;
    }

    public void J(boolean z4) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(V, this, this, org.aspectj.runtime.internal.e.a(z4)));
        setFlags(getFlags() | 131072);
        this.f9660z = z4;
    }

    public void K(long j4) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(R, this, this, org.aspectj.runtime.internal.e.m(j4)));
        setFlags(getFlags() | 8);
        this.f9656v = j4;
    }

    public void L(g gVar) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(T, this, this, gVar));
        setFlags(getFlags() | 32);
        this.f9658x = gVar;
    }

    public void M(long j4) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(S, this, this, org.aspectj.runtime.internal.e.m(j4)));
        setFlags(getFlags() | 16);
        this.f9657w = j4;
    }

    public void N(boolean z4) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(U, this, this, org.aspectj.runtime.internal.e.a(z4)));
        setFlags(getFlags() | 65536);
        this.f9659y = z4;
    }

    public void O(long j4) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(Q, this, this, org.aspectj.runtime.internal.e.m(j4)));
        if (j4 == -1) {
            setFlags(getFlags() & 2147483645);
        } else {
            setFlags(getFlags() | 2);
        }
        this.f9655u = j4;
    }

    public void P(long j4) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(O, this, this, org.aspectj.runtime.internal.e.m(j4)));
        this.f9653s = j4;
    }

    @Override // com.googlecode.mp4parser.a
    public void b(ByteBuffer byteBuffer) {
        t(byteBuffer);
        this.f9653s = com.coremedia.iso.g.l(byteBuffer);
        if ((getFlags() & 1) == 1) {
            this.f9654t = com.coremedia.iso.g.o(byteBuffer);
        }
        if ((getFlags() & 2) == 2) {
            this.f9655u = com.coremedia.iso.g.l(byteBuffer);
        }
        if ((getFlags() & 8) == 8) {
            this.f9656v = com.coremedia.iso.g.l(byteBuffer);
        }
        if ((getFlags() & 16) == 16) {
            this.f9657w = com.coremedia.iso.g.l(byteBuffer);
        }
        if ((getFlags() & 32) == 32) {
            this.f9658x = new g(byteBuffer);
        }
        if ((getFlags() & 65536) == 65536) {
            this.f9659y = true;
        }
        if ((getFlags() & 131072) == 131072) {
            this.f9660z = true;
        }
    }

    @Override // com.googlecode.mp4parser.a
    protected void c(ByteBuffer byteBuffer) {
        u(byteBuffer);
        com.coremedia.iso.i.i(byteBuffer, this.f9653s);
        if ((getFlags() & 1) == 1) {
            com.coremedia.iso.i.l(byteBuffer, v());
        }
        if ((getFlags() & 2) == 2) {
            com.coremedia.iso.i.i(byteBuffer, z());
        }
        if ((getFlags() & 8) == 8) {
            com.coremedia.iso.i.i(byteBuffer, w());
        }
        if ((getFlags() & 16) == 16) {
            com.coremedia.iso.i.i(byteBuffer, y());
        }
        if ((getFlags() & 32) == 32) {
            this.f9658x.a(byteBuffer);
        }
    }

    @Override // com.googlecode.mp4parser.a
    protected long e() {
        int flags = getFlags();
        long j4 = (flags & 1) == 1 ? 16L : 8L;
        if ((flags & 2) == 2) {
            j4 += 4;
        }
        if ((flags & 8) == 8) {
            j4 += 4;
        }
        if ((flags & 16) == 16) {
            j4 += 4;
        }
        return (flags & 32) == 32 ? j4 + 4 : j4;
    }

    public String toString() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(W, this, this));
        return "TrackFragmentHeaderBox{trackId=" + this.f9653s + ", baseDataOffset=" + this.f9654t + ", sampleDescriptionIndex=" + this.f9655u + ", defaultSampleDuration=" + this.f9656v + ", defaultSampleSize=" + this.f9657w + ", defaultSampleFlags=" + this.f9658x + ", durationIsEmpty=" + this.f9659y + ", defaultBaseIsMoof=" + this.f9660z + '}';
    }

    public long v() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(H, this, this));
        return this.f9654t;
    }

    public long w() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(J, this, this));
        return this.f9656v;
    }

    public g x() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(L, this, this));
        return this.f9658x;
    }

    public long y() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(K, this, this));
        return this.f9657w;
    }

    public long z() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(I, this, this));
        return this.f9655u;
    }
}
