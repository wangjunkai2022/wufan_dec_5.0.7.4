package com.coremedia.iso.boxes.fragment;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.android.dx.io.Opcodes;
import com.swift.sandhook.annotation.MethodReflectParams;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import org.aspectj.lang.c;
/* compiled from: TrackRunBox.java */
/* loaded from: classes2.dex */
public class n extends com.googlecode.mp4parser.c {
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
    private static final /* synthetic */ c.b M = null;
    private static final /* synthetic */ c.b N = null;
    private static final /* synthetic */ c.b O = null;
    private static final /* synthetic */ c.b P = null;

    /* renamed from: v  reason: collision with root package name */
    public static final String f9674v = "trun";

    /* renamed from: w  reason: collision with root package name */
    private static final /* synthetic */ c.b f9675w = null;

    /* renamed from: x  reason: collision with root package name */
    private static final /* synthetic */ c.b f9676x = null;

    /* renamed from: y  reason: collision with root package name */
    private static final /* synthetic */ c.b f9677y = null;

    /* renamed from: z  reason: collision with root package name */
    private static final /* synthetic */ c.b f9678z = null;

    /* renamed from: s  reason: collision with root package name */
    private int f9679s;

    /* renamed from: t  reason: collision with root package name */
    private g f9680t;

    /* renamed from: u  reason: collision with root package name */
    private List<a> f9681u;

    /* compiled from: TrackRunBox.java */
    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private long f9682a;

        /* renamed from: b  reason: collision with root package name */
        private long f9683b;

        /* renamed from: c  reason: collision with root package name */
        private g f9684c;

        /* renamed from: d  reason: collision with root package name */
        private long f9685d;

        public a() {
        }

        public long i() {
            return this.f9685d;
        }

        public long j() {
            return this.f9682a;
        }

        public g k() {
            return this.f9684c;
        }

        public long l() {
            return this.f9683b;
        }

        public void m(int i4) {
            this.f9685d = i4;
        }

        public void n(long j4) {
            this.f9682a = j4;
        }

        public void o(g gVar) {
            this.f9684c = gVar;
        }

        public void p(long j4) {
            this.f9683b = j4;
        }

        public String toString() {
            return "Entry{duration=" + this.f9682a + ", size=" + this.f9683b + ", dlags=" + this.f9684c + ", compTimeOffset=" + this.f9685d + '}';
        }

        public a(long j4, long j5, g gVar, int i4) {
            this.f9682a = j4;
            this.f9683b = j5;
            this.f9684c = gVar;
            this.f9685d = i4;
        }
    }

    static {
        s();
    }

    public n() {
        super(f9674v);
        this.f9681u = new ArrayList();
    }

    private static /* synthetic */ void s() {
        org.aspectj.runtime.reflect.e eVar = new org.aspectj.runtime.reflect.e("TrackRunBox.java", n.class);
        f9675w = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getEntries", "com.coremedia.iso.boxes.fragment.TrackRunBox", "", "", "", "java.util.List"), 57);
        f9676x = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setDataOffset", "com.coremedia.iso.boxes.fragment.TrackRunBox", MethodReflectParams.INT, "dataOffset", "", "void"), 120);
        G = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setDataOffsetPresent", "com.coremedia.iso.boxes.fragment.TrackRunBox", "boolean", "v", "", "void"), 267);
        H = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setSampleSizePresent", "com.coremedia.iso.boxes.fragment.TrackRunBox", "boolean", "v", "", "void"), 275);
        I = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setSampleDurationPresent", "com.coremedia.iso.boxes.fragment.TrackRunBox", "boolean", "v", "", "void"), 283);
        J = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setSampleFlagsPresent", "com.coremedia.iso.boxes.fragment.TrackRunBox", "boolean", "v", "", "void"), 292);
        K = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setSampleCompositionTimeOffsetPresent", "com.coremedia.iso.boxes.fragment.TrackRunBox", "boolean", "v", "", "void"), 300);
        L = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getDataOffset", "com.coremedia.iso.boxes.fragment.TrackRunBox", "", "", "", MethodReflectParams.INT), 309);
        M = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getFirstSampleFlags", "com.coremedia.iso.boxes.fragment.TrackRunBox", "", "", "", "com.coremedia.iso.boxes.fragment.SampleFlags"), 313);
        N = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setFirstSampleFlags", "com.coremedia.iso.boxes.fragment.TrackRunBox", "com.coremedia.iso.boxes.fragment.SampleFlags", "firstSampleFlags", "", "void"), TypedValues.AttributesType.TYPE_EASING);
        O = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "toString", "com.coremedia.iso.boxes.fragment.TrackRunBox", "", "", "", "java.lang.String"), 327);
        P = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setEntries", "com.coremedia.iso.boxes.fragment.TrackRunBox", "java.util.List", "entries", "", "void"), 342);
        f9677y = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getSampleCompositionTimeOffsets", "com.coremedia.iso.boxes.fragment.TrackRunBox", "", "", "", "[J"), 129);
        f9678z = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getSampleCount", "com.coremedia.iso.boxes.fragment.TrackRunBox", "", "", "", MethodReflectParams.LONG), 238);
        A = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "isDataOffsetPresent", "com.coremedia.iso.boxes.fragment.TrackRunBox", "", "", "", "boolean"), 242);
        B = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "isFirstSampleFlagsPresent", "com.coremedia.iso.boxes.fragment.TrackRunBox", "", "", "", "boolean"), com.papa.controller.core.hardware.a.f58131m);
        C = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "isSampleSizePresent", "com.coremedia.iso.boxes.fragment.TrackRunBox", "", "", "", "boolean"), Opcodes.INVOKE_POLYMORPHIC_RANGE);
        D = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "isSampleDurationPresent", "com.coremedia.iso.boxes.fragment.TrackRunBox", "", "", "", "boolean"), 255);
        E = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "isSampleFlagsPresent", "com.coremedia.iso.boxes.fragment.TrackRunBox", "", "", "", "boolean"), 259);
        F = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "isSampleCompositionTimeOffsetPresent", "com.coremedia.iso.boxes.fragment.TrackRunBox", "", "", "", "boolean"), 263);
    }

    public boolean A() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(A, this, this));
        return (getFlags() & 1) == 1;
    }

    public boolean B() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(B, this, this));
        return (getFlags() & 4) == 4;
    }

    public boolean C() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(F, this, this));
        return (getFlags() & 2048) == 2048;
    }

    public boolean D() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(D, this, this));
        return (getFlags() & 256) == 256;
    }

    public boolean E() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(E, this, this));
        return (getFlags() & 1024) == 1024;
    }

    public boolean F() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(C, this, this));
        return (getFlags() & 512) == 512;
    }

    public void G(int i4) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(f9676x, this, this, org.aspectj.runtime.internal.e.k(i4)));
        if (i4 == -1) {
            setFlags(getFlags() & 16777214);
        } else {
            setFlags(getFlags() | 1);
        }
        this.f9679s = i4;
    }

    public void H(boolean z4) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(G, this, this, org.aspectj.runtime.internal.e.a(z4)));
        if (z4) {
            setFlags(getFlags() | 1);
        } else {
            setFlags(getFlags() & 16777214);
        }
    }

    public void I(List<a> list) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(P, this, this, list));
        this.f9681u = list;
    }

    public void J(g gVar) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(N, this, this, gVar));
        if (gVar == null) {
            setFlags(getFlags() & 16777211);
        } else {
            setFlags(getFlags() | 4);
        }
        this.f9680t = gVar;
    }

    public void K(boolean z4) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(K, this, this, org.aspectj.runtime.internal.e.a(z4)));
        if (z4) {
            setFlags(getFlags() | 2048);
        } else {
            setFlags(getFlags() & 16775167);
        }
    }

    public void L(boolean z4) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(I, this, this, org.aspectj.runtime.internal.e.a(z4)));
        if (z4) {
            setFlags(getFlags() | 256);
        } else {
            setFlags(getFlags() & 16776959);
        }
    }

    public void M(boolean z4) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(J, this, this, org.aspectj.runtime.internal.e.a(z4)));
        if (z4) {
            setFlags(getFlags() | 1024);
        } else {
            setFlags(getFlags() & 16776191);
        }
    }

    public void N(boolean z4) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(H, this, this, org.aspectj.runtime.internal.e.a(z4)));
        if (z4) {
            setFlags(getFlags() | 512);
        } else {
            setFlags(getFlags() & 16776703);
        }
    }

    @Override // com.googlecode.mp4parser.a
    public void b(ByteBuffer byteBuffer) {
        t(byteBuffer);
        long l4 = com.coremedia.iso.g.l(byteBuffer);
        if ((getFlags() & 1) == 1) {
            this.f9679s = com.googlecode.mp4parser.util.c.a(com.coremedia.iso.g.l(byteBuffer));
        } else {
            this.f9679s = -1;
        }
        if ((getFlags() & 4) == 4) {
            this.f9680t = new g(byteBuffer);
        }
        for (int i4 = 0; i4 < l4; i4++) {
            a aVar = new a();
            if ((getFlags() & 256) == 256) {
                aVar.f9682a = com.coremedia.iso.g.l(byteBuffer);
            }
            if ((getFlags() & 512) == 512) {
                aVar.f9683b = com.coremedia.iso.g.l(byteBuffer);
            }
            if ((getFlags() & 1024) == 1024) {
                aVar.f9684c = new g(byteBuffer);
            }
            if ((getFlags() & 2048) == 2048) {
                aVar.f9685d = byteBuffer.getInt();
            }
            this.f9681u.add(aVar);
        }
    }

    @Override // com.googlecode.mp4parser.a
    protected void c(ByteBuffer byteBuffer) {
        u(byteBuffer);
        com.coremedia.iso.i.i(byteBuffer, this.f9681u.size());
        int flags = getFlags();
        if ((flags & 1) == 1) {
            com.coremedia.iso.i.i(byteBuffer, this.f9679s);
        }
        if ((flags & 4) == 4) {
            this.f9680t.a(byteBuffer);
        }
        for (a aVar : this.f9681u) {
            if ((flags & 256) == 256) {
                com.coremedia.iso.i.i(byteBuffer, aVar.f9682a);
            }
            if ((flags & 512) == 512) {
                com.coremedia.iso.i.i(byteBuffer, aVar.f9683b);
            }
            if ((flags & 1024) == 1024) {
                aVar.f9684c.a(byteBuffer);
            }
            if ((flags & 2048) == 2048) {
                if (getVersion() == 0) {
                    com.coremedia.iso.i.i(byteBuffer, aVar.f9685d);
                } else {
                    byteBuffer.putInt((int) aVar.f9685d);
                }
            }
        }
    }

    @Override // com.googlecode.mp4parser.a
    protected long e() {
        int flags = getFlags();
        long j4 = (flags & 1) == 1 ? 12L : 8L;
        if ((flags & 4) == 4) {
            j4 += 4;
        }
        long j5 = (flags & 256) == 256 ? 4L : 0L;
        if ((flags & 512) == 512) {
            j5 += 4;
        }
        if ((flags & 1024) == 1024) {
            j5 += 4;
        }
        if ((flags & 2048) == 2048) {
            j5 += 4;
        }
        return j4 + (j5 * this.f9681u.size());
    }

    public String toString() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(O, this, this));
        return "TrackRunBox{sampleCount=" + this.f9681u.size() + ", dataOffset=" + this.f9679s + ", dataOffsetPresent=" + A() + ", sampleSizePresent=" + F() + ", sampleDurationPresent=" + D() + ", sampleFlagsPresentPresent=" + E() + ", sampleCompositionTimeOffsetPresent=" + C() + ", firstSampleFlags=" + this.f9680t + '}';
    }

    public int v() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(L, this, this));
        return this.f9679s;
    }

    public List<a> w() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(f9675w, this, this));
        return this.f9681u;
    }

    public g x() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(M, this, this));
        return this.f9680t;
    }

    public long[] y() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(f9677y, this, this));
        if (C()) {
            int size = this.f9681u.size();
            long[] jArr = new long[size];
            for (int i4 = 0; i4 < size; i4++) {
                jArr[i4] = this.f9681u.get(i4).i();
            }
            return jArr;
        }
        return null;
    }

    public long z() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(f9678z, this, this));
        return this.f9681u.size();
    }
}
