package com.googlecode.mp4parser.boxes.basemediaformat;

import com.googlecode.mp4parser.j;
import com.mp4parser.iso14496.part15.b;
import com.swift.sandhook.annotation.MethodReflectParams;
import java.nio.ByteBuffer;
import java.util.List;
import org.aspectj.lang.c;
import org.aspectj.runtime.reflect.e;
/* compiled from: AvcNalUnitStorageBox.java */
/* loaded from: classes3.dex */
public class a extends com.googlecode.mp4parser.a {

    /* renamed from: p  reason: collision with root package name */
    public static final String f13741p = "avcn";

    /* renamed from: q  reason: collision with root package name */
    private static final /* synthetic */ c.b f13742q = null;

    /* renamed from: r  reason: collision with root package name */
    private static final /* synthetic */ c.b f13743r = null;

    /* renamed from: s  reason: collision with root package name */
    private static final /* synthetic */ c.b f13744s = null;

    /* renamed from: t  reason: collision with root package name */
    private static final /* synthetic */ c.b f13745t = null;

    /* renamed from: u  reason: collision with root package name */
    private static final /* synthetic */ c.b f13746u = null;

    /* renamed from: v  reason: collision with root package name */
    private static final /* synthetic */ c.b f13747v = null;

    /* renamed from: w  reason: collision with root package name */
    private static final /* synthetic */ c.b f13748w = null;

    /* renamed from: x  reason: collision with root package name */
    private static final /* synthetic */ c.b f13749x = null;

    /* renamed from: o  reason: collision with root package name */
    b f13750o;

    static {
        s();
    }

    public a() {
        super(f13741p);
    }

    private static /* synthetic */ void s() {
        e eVar = new e("AvcNalUnitStorageBox.java", a.class);
        f13742q = eVar.H(c.f72200a, eVar.E("1", "getAvcDecoderConfigurationRecord", "com.googlecode.mp4parser.boxes.basemediaformat.AvcNalUnitStorageBox", "", "", "", "com.mp4parser.iso14496.part15.AvcDecoderConfigurationRecord"), 44);
        f13743r = eVar.H(c.f72200a, eVar.E("1", "getLengthSizeMinusOne", "com.googlecode.mp4parser.boxes.basemediaformat.AvcNalUnitStorageBox", "", "", "", MethodReflectParams.INT), 49);
        f13744s = eVar.H(c.f72200a, eVar.E("1", "getSPS", "com.googlecode.mp4parser.boxes.basemediaformat.AvcNalUnitStorageBox", "", "", "", "[Ljava.lang.String;"), 53);
        f13745t = eVar.H(c.f72200a, eVar.E("1", "getPPS", "com.googlecode.mp4parser.boxes.basemediaformat.AvcNalUnitStorageBox", "", "", "", "[Ljava.lang.String;"), 57);
        f13746u = eVar.H(c.f72200a, eVar.E("1", "getSequenceParameterSetsAsStrings", "com.googlecode.mp4parser.boxes.basemediaformat.AvcNalUnitStorageBox", "", "", "", "java.util.List"), 61);
        f13747v = eVar.H(c.f72200a, eVar.E("1", "getSequenceParameterSetExtsAsStrings", "com.googlecode.mp4parser.boxes.basemediaformat.AvcNalUnitStorageBox", "", "", "", "java.util.List"), 65);
        f13748w = eVar.H(c.f72200a, eVar.E("1", "getPictureParameterSetsAsStrings", "com.googlecode.mp4parser.boxes.basemediaformat.AvcNalUnitStorageBox", "", "", "", "java.util.List"), 69);
        f13749x = eVar.H(c.f72200a, eVar.E("1", "toString", "com.googlecode.mp4parser.boxes.basemediaformat.AvcNalUnitStorageBox", "", "", "", "java.lang.String"), 89);
    }

    @Override // com.googlecode.mp4parser.a
    public void b(ByteBuffer byteBuffer) {
        this.f13750o = new b(byteBuffer);
    }

    @Override // com.googlecode.mp4parser.a
    protected void c(ByteBuffer byteBuffer) {
        this.f13750o.a(byteBuffer);
    }

    @Override // com.googlecode.mp4parser.a
    protected long e() {
        return this.f13750o.b();
    }

    public b t() {
        j.b().c(e.v(f13742q, this, this));
        return this.f13750o;
    }

    public String toString() {
        j.b().c(e.v(f13749x, this, this));
        return "AvcNalUnitStorageBox{SPS=" + this.f13750o.g() + ",PPS=" + this.f13750o.d() + ",lengthSize=" + (this.f13750o.f57129e + 1) + '}';
    }

    public int u() {
        j.b().c(e.v(f13743r, this, this));
        return this.f13750o.f57129e;
    }

    public String[] v() {
        j.b().c(e.v(f13745t, this, this));
        return this.f13750o.c();
    }

    public List<String> w() {
        j.b().c(e.v(f13748w, this, this));
        return this.f13750o.d();
    }

    public String[] x() {
        j.b().c(e.v(f13744s, this, this));
        return this.f13750o.e();
    }

    public List<String> y() {
        j.b().c(e.v(f13747v, this, this));
        return this.f13750o.f();
    }

    public List<String> z() {
        j.b().c(e.v(f13746u, this, this));
        return this.f13750o.g();
    }

    public a(com.mp4parser.iso14496.part15.a aVar) {
        super(f13741p);
        this.f13750o = aVar.G();
    }
}
