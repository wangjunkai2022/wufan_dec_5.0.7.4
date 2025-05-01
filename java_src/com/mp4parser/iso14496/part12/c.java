package com.mp4parser.iso14496.part12;

import com.coremedia.iso.f;
import com.coremedia.iso.g;
import com.coremedia.iso.i;
import com.googlecode.mp4parser.j;
import com.swift.sandhook.annotation.MethodReflectParams;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.aspectj.lang.c;
import org.aspectj.runtime.reflect.e;
/* compiled from: SampleAuxiliaryInformationSizesBox.java */
/* loaded from: classes5.dex */
public class c extends com.googlecode.mp4parser.c {
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

    /* renamed from: x  reason: collision with root package name */
    public static final String f57105x = "saiz";

    /* renamed from: y  reason: collision with root package name */
    static final /* synthetic */ boolean f57106y = false;

    /* renamed from: z  reason: collision with root package name */
    private static final /* synthetic */ c.b f57107z = null;

    /* renamed from: s  reason: collision with root package name */
    private short f57108s;

    /* renamed from: t  reason: collision with root package name */
    private short[] f57109t;

    /* renamed from: u  reason: collision with root package name */
    private int f57110u;

    /* renamed from: v  reason: collision with root package name */
    private String f57111v;

    /* renamed from: w  reason: collision with root package name */
    private String f57112w;

    static {
        s();
    }

    public c() {
        super(f57105x);
        this.f57109t = new short[0];
    }

    private static /* synthetic */ void s() {
        e eVar = new e("SampleAuxiliaryInformationSizesBox.java", c.class);
        f57107z = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getSize", "com.mp4parser.iso14496.part12.SampleAuxiliaryInformationSizesBox", MethodReflectParams.INT, "index", "", MethodReflectParams.SHORT), 57);
        A = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getAuxInfoType", "com.mp4parser.iso14496.part12.SampleAuxiliaryInformationSizesBox", "", "", "", "java.lang.String"), 107);
        J = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setSampleCount", "com.mp4parser.iso14496.part12.SampleAuxiliaryInformationSizesBox", MethodReflectParams.INT, "sampleCount", "", "void"), 144);
        K = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "toString", "com.mp4parser.iso14496.part12.SampleAuxiliaryInformationSizesBox", "", "", "", "java.lang.String"), 149);
        B = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setAuxInfoType", "com.mp4parser.iso14496.part12.SampleAuxiliaryInformationSizesBox", "java.lang.String", "auxInfoType", "", "void"), 111);
        C = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getAuxInfoTypeParameter", "com.mp4parser.iso14496.part12.SampleAuxiliaryInformationSizesBox", "", "", "", "java.lang.String"), 115);
        D = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setAuxInfoTypeParameter", "com.mp4parser.iso14496.part12.SampleAuxiliaryInformationSizesBox", "java.lang.String", "auxInfoTypeParameter", "", "void"), 119);
        E = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getDefaultSampleInfoSize", "com.mp4parser.iso14496.part12.SampleAuxiliaryInformationSizesBox", "", "", "", MethodReflectParams.INT), 123);
        F = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setDefaultSampleInfoSize", "com.mp4parser.iso14496.part12.SampleAuxiliaryInformationSizesBox", MethodReflectParams.INT, "defaultSampleInfoSize", "", "void"), 127);
        G = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getSampleInfoSizes", "com.mp4parser.iso14496.part12.SampleAuxiliaryInformationSizesBox", "", "", "", "[S"), 132);
        H = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setSampleInfoSizes", "com.mp4parser.iso14496.part12.SampleAuxiliaryInformationSizesBox", "[S", "sampleInfoSizes", "", "void"), 136);
        I = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getSampleCount", "com.mp4parser.iso14496.part12.SampleAuxiliaryInformationSizesBox", "", "", "", MethodReflectParams.INT), 140);
    }

    public short A(int i4) {
        j.b().c(e.w(f57107z, this, this, org.aspectj.runtime.internal.e.k(i4)));
        if (x() == 0) {
            return this.f57109t[i4];
        }
        return this.f57108s;
    }

    public void B(String str) {
        j.b().c(e.w(B, this, this, str));
        this.f57111v = str;
    }

    public void C(String str) {
        j.b().c(e.w(D, this, this, str));
        this.f57112w = str;
    }

    public void D(int i4) {
        j.b().c(e.w(F, this, this, org.aspectj.runtime.internal.e.k(i4)));
        this.f57108s = (short) i4;
    }

    public void E(int i4) {
        j.b().c(e.w(J, this, this, org.aspectj.runtime.internal.e.k(i4)));
        this.f57110u = i4;
    }

    public void F(short[] sArr) {
        j.b().c(e.w(H, this, this, sArr));
        this.f57109t = Arrays.copyOf(sArr, sArr.length);
    }

    @Override // com.googlecode.mp4parser.a
    public void b(ByteBuffer byteBuffer) {
        t(byteBuffer);
        if ((getFlags() & 1) == 1) {
            this.f57111v = g.b(byteBuffer);
            this.f57112w = g.b(byteBuffer);
        }
        this.f57108s = (short) g.p(byteBuffer);
        int a5 = com.googlecode.mp4parser.util.c.a(g.l(byteBuffer));
        this.f57110u = a5;
        if (this.f57108s == 0) {
            this.f57109t = new short[a5];
            for (int i4 = 0; i4 < this.f57110u; i4++) {
                this.f57109t[i4] = (short) g.p(byteBuffer);
            }
        }
    }

    @Override // com.googlecode.mp4parser.a
    protected void c(ByteBuffer byteBuffer) {
        u(byteBuffer);
        if ((getFlags() & 1) == 1) {
            byteBuffer.put(f.C(this.f57111v));
            byteBuffer.put(f.C(this.f57112w));
        }
        i.m(byteBuffer, this.f57108s);
        if (this.f57108s == 0) {
            i.i(byteBuffer, this.f57109t.length);
            for (short s4 : this.f57109t) {
                i.m(byteBuffer, s4);
            }
            return;
        }
        i.i(byteBuffer, this.f57110u);
    }

    @Override // com.googlecode.mp4parser.a
    protected long e() {
        return ((getFlags() & 1) == 1 ? 12 : 4) + 5 + (this.f57108s == 0 ? this.f57109t.length : 0);
    }

    public String toString() {
        j.b().c(e.v(K, this, this));
        return "SampleAuxiliaryInformationSizesBox{defaultSampleInfoSize=" + ((int) this.f57108s) + ", sampleCount=" + this.f57110u + ", auxInfoType='" + this.f57111v + "', auxInfoTypeParameter='" + this.f57112w + "'}";
    }

    public String v() {
        j.b().c(e.v(A, this, this));
        return this.f57111v;
    }

    public String w() {
        j.b().c(e.v(C, this, this));
        return this.f57112w;
    }

    public int x() {
        j.b().c(e.v(E, this, this));
        return this.f57108s;
    }

    public int y() {
        j.b().c(e.v(I, this, this));
        return this.f57110u;
    }

    public short[] z() {
        j.b().c(e.v(G, this, this));
        short[] sArr = this.f57109t;
        return Arrays.copyOf(sArr, sArr.length);
    }
}
