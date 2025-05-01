package com.mp4parser.iso14496.part15;

import com.swift.sandhook.annotation.MethodReflectParams;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import org.aspectj.lang.c;
/* compiled from: AvcConfigurationBox.java */
/* loaded from: classes5.dex */
public final class a extends com.googlecode.mp4parser.a {
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
    private static final /* synthetic */ c.b Q = null;
    private static final /* synthetic */ c.b R = null;
    private static final /* synthetic */ c.b S = null;
    private static final /* synthetic */ c.b T = null;

    /* renamed from: p  reason: collision with root package name */
    public static final String f57113p = "avcC";

    /* renamed from: q  reason: collision with root package name */
    private static final /* synthetic */ c.b f57114q = null;

    /* renamed from: r  reason: collision with root package name */
    private static final /* synthetic */ c.b f57115r = null;

    /* renamed from: s  reason: collision with root package name */
    private static final /* synthetic */ c.b f57116s = null;

    /* renamed from: t  reason: collision with root package name */
    private static final /* synthetic */ c.b f57117t = null;

    /* renamed from: u  reason: collision with root package name */
    private static final /* synthetic */ c.b f57118u = null;

    /* renamed from: v  reason: collision with root package name */
    private static final /* synthetic */ c.b f57119v = null;

    /* renamed from: w  reason: collision with root package name */
    private static final /* synthetic */ c.b f57120w = null;

    /* renamed from: x  reason: collision with root package name */
    private static final /* synthetic */ c.b f57121x = null;

    /* renamed from: y  reason: collision with root package name */
    private static final /* synthetic */ c.b f57122y = null;

    /* renamed from: z  reason: collision with root package name */
    private static final /* synthetic */ c.b f57123z = null;

    /* renamed from: o  reason: collision with root package name */
    public b f57124o;

    static {
        s();
    }

    public a() {
        super(f57113p);
        this.f57124o = new b();
    }

    private static /* synthetic */ void s() {
        org.aspectj.runtime.reflect.e eVar = new org.aspectj.runtime.reflect.e("AvcConfigurationBox.java", a.class);
        f57114q = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getConfigurationVersion", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "", MethodReflectParams.INT), 44);
        f57115r = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getAvcProfileIndication", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "", MethodReflectParams.INT), 48);
        A = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setAvcLevelIndication", "com.mp4parser.iso14496.part15.AvcConfigurationBox", MethodReflectParams.INT, "avcLevelIndication", "", "void"), 84);
        B = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setLengthSizeMinusOne", "com.mp4parser.iso14496.part15.AvcConfigurationBox", MethodReflectParams.INT, "lengthSizeMinusOne", "", "void"), 88);
        C = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setSequenceParameterSets", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "java.util.List", "sequenceParameterSets", "", "void"), 92);
        D = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setPictureParameterSets", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "java.util.List", "pictureParameterSets", "", "void"), 96);
        E = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getChromaFormat", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "", MethodReflectParams.INT), 100);
        F = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setChromaFormat", "com.mp4parser.iso14496.part15.AvcConfigurationBox", MethodReflectParams.INT, "chromaFormat", "", "void"), 104);
        G = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getBitDepthLumaMinus8", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "", MethodReflectParams.INT), 108);
        H = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setBitDepthLumaMinus8", "com.mp4parser.iso14496.part15.AvcConfigurationBox", MethodReflectParams.INT, "bitDepthLumaMinus8", "", "void"), 112);
        I = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getBitDepthChromaMinus8", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "", MethodReflectParams.INT), 116);
        J = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setBitDepthChromaMinus8", "com.mp4parser.iso14496.part15.AvcConfigurationBox", MethodReflectParams.INT, "bitDepthChromaMinus8", "", "void"), 120);
        f57116s = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getProfileCompatibility", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "", MethodReflectParams.INT), 52);
        K = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getSequenceParameterSetExts", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "", "java.util.List"), 124);
        L = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setSequenceParameterSetExts", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "java.util.List", "sequenceParameterSetExts", "", "void"), 128);
        M = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "hasExts", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "", "boolean"), 132);
        N = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setHasExts", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "boolean", "hasExts", "", "void"), 136);
        O = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getContentSize", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "", MethodReflectParams.LONG), 147);
        P = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getContent", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "java.nio.ByteBuffer", "byteBuffer", "", "void"), 153);
        Q = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getSPS", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "", "[Ljava.lang.String;"), 158);
        R = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getPPS", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "", "[Ljava.lang.String;"), 162);
        S = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getavcDecoderConfigurationRecord", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "", "com.mp4parser.iso14496.part15.AvcDecoderConfigurationRecord"), 167);
        T = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "toString", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "", "java.lang.String"), 172);
        f57117t = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getAvcLevelIndication", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "", MethodReflectParams.INT), 56);
        f57118u = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getLengthSizeMinusOne", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "", MethodReflectParams.INT), 60);
        f57119v = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getSequenceParameterSets", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "", "java.util.List"), 64);
        f57120w = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getPictureParameterSets", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "", "java.util.List"), 68);
        f57121x = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setConfigurationVersion", "com.mp4parser.iso14496.part15.AvcConfigurationBox", MethodReflectParams.INT, "configurationVersion", "", "void"), 72);
        f57122y = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setAvcProfileIndication", "com.mp4parser.iso14496.part15.AvcConfigurationBox", MethodReflectParams.INT, "avcProfileIndication", "", "void"), 76);
        f57123z = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setProfileCompatibility", "com.mp4parser.iso14496.part15.AvcConfigurationBox", MethodReflectParams.INT, "profileCompatibility", "", "void"), 80);
    }

    public String[] A() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(R, this, this));
        return this.f57124o.c();
    }

    public List<byte[]> B() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(f57120w, this, this));
        return Collections.unmodifiableList(this.f57124o.f57131g);
    }

    public int C() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(f57116s, this, this));
        return this.f57124o.f57127c;
    }

    public String[] D() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(Q, this, this));
        return this.f57124o.e();
    }

    public List<byte[]> E() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(K, this, this));
        return this.f57124o.f57136l;
    }

    public List<byte[]> F() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(f57119v, this, this));
        return Collections.unmodifiableList(this.f57124o.f57130f);
    }

    public b G() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(S, this, this));
        return this.f57124o;
    }

    public boolean H() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(M, this, this));
        return this.f57124o.f57132h;
    }

    public void I(int i4) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(A, this, this, org.aspectj.runtime.internal.e.k(i4)));
        this.f57124o.f57128d = i4;
    }

    public void J(int i4) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(f57122y, this, this, org.aspectj.runtime.internal.e.k(i4)));
        this.f57124o.f57126b = i4;
    }

    public void K(int i4) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(J, this, this, org.aspectj.runtime.internal.e.k(i4)));
        this.f57124o.f57135k = i4;
    }

    public void L(int i4) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(H, this, this, org.aspectj.runtime.internal.e.k(i4)));
        this.f57124o.f57134j = i4;
    }

    public void M(int i4) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(F, this, this, org.aspectj.runtime.internal.e.k(i4)));
        this.f57124o.f57133i = i4;
    }

    public void N(int i4) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(f57121x, this, this, org.aspectj.runtime.internal.e.k(i4)));
        this.f57124o.f57125a = i4;
    }

    public void O(boolean z4) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(N, this, this, org.aspectj.runtime.internal.e.a(z4)));
        this.f57124o.f57132h = z4;
    }

    public void P(int i4) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(B, this, this, org.aspectj.runtime.internal.e.k(i4)));
        this.f57124o.f57129e = i4;
    }

    public void Q(List<byte[]> list) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(D, this, this, list));
        this.f57124o.f57131g = list;
    }

    public void R(int i4) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(f57123z, this, this, org.aspectj.runtime.internal.e.k(i4)));
        this.f57124o.f57127c = i4;
    }

    public void S(List<byte[]> list) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(L, this, this, list));
        this.f57124o.f57136l = list;
    }

    public void T(List<byte[]> list) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(C, this, this, list));
        this.f57124o.f57130f = list;
    }

    @Override // com.googlecode.mp4parser.a
    public void b(ByteBuffer byteBuffer) {
        this.f57124o = new b(byteBuffer);
    }

    @Override // com.googlecode.mp4parser.a
    public void c(ByteBuffer byteBuffer) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(P, this, this, byteBuffer));
        this.f57124o.a(byteBuffer);
    }

    @Override // com.googlecode.mp4parser.a
    public long e() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(O, this, this));
        return this.f57124o.b();
    }

    public int t() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(f57117t, this, this));
        return this.f57124o.f57128d;
    }

    public String toString() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(T, this, this));
        return "AvcConfigurationBox{avcDecoderConfigurationRecord=" + this.f57124o + '}';
    }

    public int u() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(f57115r, this, this));
        return this.f57124o.f57126b;
    }

    public int v() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(I, this, this));
        return this.f57124o.f57135k;
    }

    public int w() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(G, this, this));
        return this.f57124o.f57134j;
    }

    public int x() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(E, this, this));
        return this.f57124o.f57133i;
    }

    public int y() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(f57114q, this, this));
        return this.f57124o.f57125a;
    }

    public int z() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(f57118u, this, this));
        return this.f57124o.f57129e;
    }
}
