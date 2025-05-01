package com.mp4parser.iso14496.part15;

import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import com.mp4parser.iso14496.part15.d;
import com.swift.sandhook.annotation.MethodReflectParams;
import java.nio.ByteBuffer;
import java.util.List;
import org.aspectj.lang.c;
/* compiled from: HevcConfigurationBox.java */
/* loaded from: classes5.dex */
public class c extends com.googlecode.mp4parser.a {
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

    /* renamed from: p  reason: collision with root package name */
    public static final String f57142p = "hvcC";

    /* renamed from: q  reason: collision with root package name */
    private static final /* synthetic */ c.b f57143q = null;

    /* renamed from: r  reason: collision with root package name */
    private static final /* synthetic */ c.b f57144r = null;

    /* renamed from: s  reason: collision with root package name */
    private static final /* synthetic */ c.b f57145s = null;

    /* renamed from: t  reason: collision with root package name */
    private static final /* synthetic */ c.b f57146t = null;

    /* renamed from: u  reason: collision with root package name */
    private static final /* synthetic */ c.b f57147u = null;

    /* renamed from: v  reason: collision with root package name */
    private static final /* synthetic */ c.b f57148v = null;

    /* renamed from: w  reason: collision with root package name */
    private static final /* synthetic */ c.b f57149w = null;

    /* renamed from: x  reason: collision with root package name */
    private static final /* synthetic */ c.b f57150x = null;

    /* renamed from: y  reason: collision with root package name */
    private static final /* synthetic */ c.b f57151y = null;

    /* renamed from: z  reason: collision with root package name */
    private static final /* synthetic */ c.b f57152z = null;

    /* renamed from: o  reason: collision with root package name */
    private d f57153o;

    static {
        s();
    }

    public c() {
        super(f57142p);
        this.f57153o = new d();
    }

    private static /* synthetic */ void s() {
        org.aspectj.runtime.reflect.e eVar = new org.aspectj.runtime.reflect.e("HevcConfigurationBox.java", c.class);
        f57143q = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getHevcDecoderConfigurationRecord", "com.mp4parser.iso14496.part15.HevcConfigurationBox", "", "", "", "com.mp4parser.iso14496.part15.HevcDecoderConfigurationRecord"), 36);
        f57144r = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setHevcDecoderConfigurationRecord", "com.mp4parser.iso14496.part15.HevcConfigurationBox", "com.mp4parser.iso14496.part15.HevcDecoderConfigurationRecord", "hevcDecoderConfigurationRecord", "", "void"), 40);
        A = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getGeneral_level_idc", "com.mp4parser.iso14496.part15.HevcConfigurationBox", "", "", "", MethodReflectParams.INT), 88);
        B = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getMin_spatial_segmentation_idc", "com.mp4parser.iso14496.part15.HevcConfigurationBox", "", "", "", MethodReflectParams.INT), 92);
        C = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getParallelismType", "com.mp4parser.iso14496.part15.HevcConfigurationBox", "", "", "", MethodReflectParams.INT), 96);
        D = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getChromaFormat", "com.mp4parser.iso14496.part15.HevcConfigurationBox", "", "", "", MethodReflectParams.INT), 100);
        E = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getBitDepthLumaMinus8", "com.mp4parser.iso14496.part15.HevcConfigurationBox", "", "", "", MethodReflectParams.INT), 104);
        F = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getBitDepthChromaMinus8", "com.mp4parser.iso14496.part15.HevcConfigurationBox", "", "", "", MethodReflectParams.INT), 108);
        G = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getAvgFrameRate", "com.mp4parser.iso14496.part15.HevcConfigurationBox", "", "", "", MethodReflectParams.INT), 112);
        H = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getNumTemporalLayers", "com.mp4parser.iso14496.part15.HevcConfigurationBox", "", "", "", MethodReflectParams.INT), 116);
        I = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getLengthSizeMinusOne", "com.mp4parser.iso14496.part15.HevcConfigurationBox", "", "", "", MethodReflectParams.INT), 120);
        J = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "isTemporalIdNested", "com.mp4parser.iso14496.part15.HevcConfigurationBox", "", "", "", "boolean"), 124);
        f57145s = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "equals", "com.mp4parser.iso14496.part15.HevcConfigurationBox", "java.lang.Object", "o", "", "boolean"), 45);
        K = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getConstantFrameRate", "com.mp4parser.iso14496.part15.HevcConfigurationBox", "", "", "", MethodReflectParams.INT), 128);
        L = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getArrays", "com.mp4parser.iso14496.part15.HevcConfigurationBox", "", "", "", "java.util.List"), 132);
        f57146t = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", TTDownloadField.TT_HASHCODE, "com.mp4parser.iso14496.part15.HevcConfigurationBox", "", "", "", MethodReflectParams.INT), 58);
        f57147u = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getConfigurationVersion", "com.mp4parser.iso14496.part15.HevcConfigurationBox", "", "", "", MethodReflectParams.INT), 63);
        f57148v = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getGeneral_profile_space", "com.mp4parser.iso14496.part15.HevcConfigurationBox", "", "", "", MethodReflectParams.INT), 67);
        f57149w = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "isGeneral_tier_flag", "com.mp4parser.iso14496.part15.HevcConfigurationBox", "", "", "", "boolean"), 71);
        f57150x = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getGeneral_profile_idc", "com.mp4parser.iso14496.part15.HevcConfigurationBox", "", "", "", MethodReflectParams.INT), 76);
        f57151y = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getGeneral_profile_compatibility_flags", "com.mp4parser.iso14496.part15.HevcConfigurationBox", "", "", "", MethodReflectParams.LONG), 80);
        f57152z = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getGeneral_constraint_indicator_flags", "com.mp4parser.iso14496.part15.HevcConfigurationBox", "", "", "", MethodReflectParams.LONG), 84);
    }

    public long A() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(f57152z, this, this));
        return this.f57153o.f57159f;
    }

    public int B() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(A, this, this));
        return this.f57153o.f57160g;
    }

    public long C() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(f57151y, this, this));
        return this.f57153o.f57158e;
    }

    public int D() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(f57150x, this, this));
        return this.f57153o.f57157d;
    }

    public int E() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(f57148v, this, this));
        return this.f57153o.f57155b;
    }

    public d F() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(f57143q, this, this));
        return this.f57153o;
    }

    public int G() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(I, this, this));
        return this.f57153o.f57175v;
    }

    public int H() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(B, this, this));
        return this.f57153o.f57162i;
    }

    public int I() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(H, this, this));
        return this.f57153o.f57173t;
    }

    public int J() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(C, this, this));
        return this.f57153o.f57164k;
    }

    public boolean K() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(f57149w, this, this));
        return this.f57153o.f57156c;
    }

    public boolean L() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(J, this, this));
        return this.f57153o.f57174u;
    }

    public void M(d dVar) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(f57144r, this, this, dVar));
        this.f57153o = dVar;
    }

    @Override // com.googlecode.mp4parser.a
    protected void b(ByteBuffer byteBuffer) {
        this.f57153o.x(byteBuffer);
    }

    @Override // com.googlecode.mp4parser.a
    protected void c(ByteBuffer byteBuffer) {
        this.f57153o.U(byteBuffer);
    }

    @Override // com.googlecode.mp4parser.a
    protected long e() {
        return this.f57153o.q();
    }

    public boolean equals(Object obj) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(f57145s, this, this, obj));
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        d dVar = this.f57153o;
        d dVar2 = ((c) obj).f57153o;
        return dVar == null ? dVar2 == null : dVar.equals(dVar2);
    }

    public int hashCode() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(f57146t, this, this));
        d dVar = this.f57153o;
        if (dVar != null) {
            return dVar.hashCode();
        }
        return 0;
    }

    public List<d.a> t() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(L, this, this));
        return this.f57153o.f57176w;
    }

    public int u() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(G, this, this));
        return this.f57153o.f57171r;
    }

    public int v() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(F, this, this));
        return this.f57153o.f57170q;
    }

    public int w() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(E, this, this));
        return this.f57153o.f57168o;
    }

    public int x() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(D, this, this));
        return this.f57153o.f57166m;
    }

    public int y() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(f57147u, this, this));
        return this.f57153o.f57154a;
    }

    public int z() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(K, this, this));
        return this.f57153o.f57172s;
    }
}
