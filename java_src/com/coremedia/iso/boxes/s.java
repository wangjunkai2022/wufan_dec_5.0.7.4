package com.coremedia.iso.boxes;

import com.googlecode.mp4parser.annotations.DoNotParseDetail;
import com.swift.sandhook.annotation.MethodReflectParams;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import org.aspectj.lang.c;
/* compiled from: FileTypeBox.java */
/* loaded from: classes2.dex */
public class s extends com.googlecode.mp4parser.a {

    /* renamed from: r  reason: collision with root package name */
    public static final String f9858r = "ftyp";

    /* renamed from: s  reason: collision with root package name */
    private static final /* synthetic */ c.b f9859s = null;

    /* renamed from: t  reason: collision with root package name */
    private static final /* synthetic */ c.b f9860t = null;

    /* renamed from: u  reason: collision with root package name */
    private static final /* synthetic */ c.b f9861u = null;

    /* renamed from: v  reason: collision with root package name */
    private static final /* synthetic */ c.b f9862v = null;

    /* renamed from: w  reason: collision with root package name */
    private static final /* synthetic */ c.b f9863w = null;

    /* renamed from: x  reason: collision with root package name */
    private static final /* synthetic */ c.b f9864x = null;

    /* renamed from: o  reason: collision with root package name */
    private String f9865o;

    /* renamed from: p  reason: collision with root package name */
    private long f9866p;

    /* renamed from: q  reason: collision with root package name */
    private List<String> f9867q;

    static {
        s();
    }

    public s() {
        super(f9858r);
        this.f9867q = Collections.emptyList();
    }

    private static /* synthetic */ void s() {
        org.aspectj.runtime.reflect.e eVar = new org.aspectj.runtime.reflect.e("FileTypeBox.java", s.class);
        f9859s = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getMajorBrand", "com.coremedia.iso.boxes.FileTypeBox", "", "", "", "java.lang.String"), 85);
        f9860t = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setMajorBrand", "com.coremedia.iso.boxes.FileTypeBox", "java.lang.String", "majorBrand", "", "void"), 94);
        f9861u = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setMinorVersion", "com.coremedia.iso.boxes.FileTypeBox", MethodReflectParams.LONG, "minorVersion", "", "void"), 103);
        f9862v = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getMinorVersion", "com.coremedia.iso.boxes.FileTypeBox", "", "", "", MethodReflectParams.LONG), 113);
        f9863w = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getCompatibleBrands", "com.coremedia.iso.boxes.FileTypeBox", "", "", "", "java.util.List"), 122);
        f9864x = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setCompatibleBrands", "com.coremedia.iso.boxes.FileTypeBox", "java.util.List", "compatibleBrands", "", "void"), 126);
    }

    @Override // com.googlecode.mp4parser.a
    public void b(ByteBuffer byteBuffer) {
        this.f9865o = com.coremedia.iso.g.b(byteBuffer);
        this.f9866p = com.coremedia.iso.g.l(byteBuffer);
        int remaining = byteBuffer.remaining() / 4;
        this.f9867q = new LinkedList();
        for (int i4 = 0; i4 < remaining; i4++) {
            this.f9867q.add(com.coremedia.iso.g.b(byteBuffer));
        }
    }

    @Override // com.googlecode.mp4parser.a
    protected void c(ByteBuffer byteBuffer) {
        byteBuffer.put(com.coremedia.iso.f.C(this.f9865o));
        com.coremedia.iso.i.i(byteBuffer, this.f9866p);
        for (String str : this.f9867q) {
            byteBuffer.put(com.coremedia.iso.f.C(str));
        }
    }

    @Override // com.googlecode.mp4parser.a
    protected long e() {
        return (this.f9867q.size() * 4) + 8;
    }

    public List<String> t() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(f9863w, this, this));
        return this.f9867q;
    }

    @DoNotParseDetail
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FileTypeBox[");
        sb.append("majorBrand=");
        sb.append(u());
        sb.append(";");
        sb.append("minorVersion=");
        sb.append(v());
        for (String str : this.f9867q) {
            sb.append(";");
            sb.append("compatibleBrand=");
            sb.append(str);
        }
        sb.append("]");
        return sb.toString();
    }

    public String u() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(f9859s, this, this));
        return this.f9865o;
    }

    public long v() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(f9862v, this, this));
        return this.f9866p;
    }

    public void w(List<String> list) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(f9864x, this, this, list));
        this.f9867q = list;
    }

    public void x(String str) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(f9860t, this, this, str));
        this.f9865o = str;
    }

    public void y(long j4) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(f9861u, this, this, org.aspectj.runtime.internal.e.m(j4)));
        this.f9866p = j4;
    }

    public s(String str, long j4, List<String> list) {
        super(f9858r);
        this.f9867q = Collections.emptyList();
        this.f9865o = str;
        this.f9866p = j4;
        this.f9867q = list;
    }
}
