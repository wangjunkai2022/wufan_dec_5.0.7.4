package com.coremedia.iso.boxes.fragment;

import com.googlecode.mp4parser.annotations.DoNotParseDetail;
import com.swift.sandhook.annotation.MethodReflectParams;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import org.aspectj.lang.c;
/* compiled from: SegmentTypeBox.java */
/* loaded from: classes2.dex */
public class h extends com.googlecode.mp4parser.a {

    /* renamed from: r  reason: collision with root package name */
    public static final String f9629r = "styp";

    /* renamed from: s  reason: collision with root package name */
    private static final /* synthetic */ c.b f9630s = null;

    /* renamed from: t  reason: collision with root package name */
    private static final /* synthetic */ c.b f9631t = null;

    /* renamed from: u  reason: collision with root package name */
    private static final /* synthetic */ c.b f9632u = null;

    /* renamed from: v  reason: collision with root package name */
    private static final /* synthetic */ c.b f9633v = null;

    /* renamed from: w  reason: collision with root package name */
    private static final /* synthetic */ c.b f9634w = null;

    /* renamed from: x  reason: collision with root package name */
    private static final /* synthetic */ c.b f9635x = null;

    /* renamed from: o  reason: collision with root package name */
    private String f9636o;

    /* renamed from: p  reason: collision with root package name */
    private long f9637p;

    /* renamed from: q  reason: collision with root package name */
    private List<String> f9638q;

    static {
        s();
    }

    public h() {
        super(f9629r);
        this.f9638q = Collections.emptyList();
    }

    private static /* synthetic */ void s() {
        org.aspectj.runtime.reflect.e eVar = new org.aspectj.runtime.reflect.e("SegmentTypeBox.java", h.class);
        f9630s = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getMajorBrand", "com.coremedia.iso.boxes.fragment.SegmentTypeBox", "", "", "", "java.lang.String"), 85);
        f9631t = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setMajorBrand", "com.coremedia.iso.boxes.fragment.SegmentTypeBox", "java.lang.String", "majorBrand", "", "void"), 94);
        f9632u = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setMinorVersion", "com.coremedia.iso.boxes.fragment.SegmentTypeBox", MethodReflectParams.LONG, "minorVersion", "", "void"), 103);
        f9633v = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getMinorVersion", "com.coremedia.iso.boxes.fragment.SegmentTypeBox", "", "", "", MethodReflectParams.LONG), 113);
        f9634w = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getCompatibleBrands", "com.coremedia.iso.boxes.fragment.SegmentTypeBox", "", "", "", "java.util.List"), 122);
        f9635x = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setCompatibleBrands", "com.coremedia.iso.boxes.fragment.SegmentTypeBox", "java.util.List", "compatibleBrands", "", "void"), 126);
    }

    @Override // com.googlecode.mp4parser.a
    public void b(ByteBuffer byteBuffer) {
        this.f9636o = com.coremedia.iso.g.b(byteBuffer);
        this.f9637p = com.coremedia.iso.g.l(byteBuffer);
        int remaining = byteBuffer.remaining() / 4;
        this.f9638q = new LinkedList();
        for (int i4 = 0; i4 < remaining; i4++) {
            this.f9638q.add(com.coremedia.iso.g.b(byteBuffer));
        }
    }

    @Override // com.googlecode.mp4parser.a
    protected void c(ByteBuffer byteBuffer) {
        byteBuffer.put(com.coremedia.iso.f.C(this.f9636o));
        com.coremedia.iso.i.i(byteBuffer, this.f9637p);
        for (String str : this.f9638q) {
            byteBuffer.put(com.coremedia.iso.f.C(str));
        }
    }

    @Override // com.googlecode.mp4parser.a
    protected long e() {
        return (this.f9638q.size() * 4) + 8;
    }

    public List<String> t() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(f9634w, this, this));
        return this.f9638q;
    }

    @DoNotParseDetail
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SegmentTypeBox[");
        sb.append("majorBrand=");
        sb.append(u());
        sb.append(";");
        sb.append("minorVersion=");
        sb.append(v());
        for (String str : this.f9638q) {
            sb.append(";");
            sb.append("compatibleBrand=");
            sb.append(str);
        }
        sb.append("]");
        return sb.toString();
    }

    public String u() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(f9630s, this, this));
        return this.f9636o;
    }

    public long v() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(f9633v, this, this));
        return this.f9637p;
    }

    public void w(List<String> list) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(f9635x, this, this, list));
        this.f9638q = list;
    }

    public void x(String str) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(f9631t, this, this, str));
        this.f9636o = str;
    }

    public void y(long j4) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(f9632u, this, this, org.aspectj.runtime.internal.e.m(j4)));
        this.f9637p = j4;
    }

    public h(String str, long j4, List<String> list) {
        super(f9629r);
        this.f9638q = Collections.emptyList();
        this.f9636o = str;
        this.f9637p = j4;
        this.f9638q = list;
    }
}
