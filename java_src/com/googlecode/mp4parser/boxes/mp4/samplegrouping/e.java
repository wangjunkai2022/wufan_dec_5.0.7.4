package com.googlecode.mp4parser.boxes.mp4.samplegrouping;

import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import com.googlecode.mp4parser.j;
import com.swift.sandhook.annotation.MethodReflectParams;
import java.nio.ByteBuffer;
import java.util.LinkedList;
import java.util.List;
import org.aspectj.lang.c;
/* compiled from: SampleGroupDescriptionBox.java */
/* loaded from: classes3.dex */
public class e extends com.googlecode.mp4parser.c {
    private static final /* synthetic */ c.b A = null;
    private static final /* synthetic */ c.b B = null;

    /* renamed from: u  reason: collision with root package name */
    public static final String f13999u = "sgpd";

    /* renamed from: v  reason: collision with root package name */
    private static final /* synthetic */ c.b f14000v = null;

    /* renamed from: w  reason: collision with root package name */
    private static final /* synthetic */ c.b f14001w = null;

    /* renamed from: x  reason: collision with root package name */
    private static final /* synthetic */ c.b f14002x = null;

    /* renamed from: y  reason: collision with root package name */
    private static final /* synthetic */ c.b f14003y = null;

    /* renamed from: z  reason: collision with root package name */
    private static final /* synthetic */ c.b f14004z = null;

    /* renamed from: s  reason: collision with root package name */
    private int f14005s;

    /* renamed from: t  reason: collision with root package name */
    private List<b> f14006t;

    static {
        s();
    }

    public e() {
        super(f13999u);
        this.f14006t = new LinkedList();
        setVersion(1);
    }

    private static /* synthetic */ void s() {
        org.aspectj.runtime.reflect.e eVar = new org.aspectj.runtime.reflect.e("SampleGroupDescriptionBox.java", e.class);
        f14000v = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getDefaultLength", "com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleGroupDescriptionBox", "", "", "", MethodReflectParams.INT), 145);
        f14001w = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setDefaultLength", "com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleGroupDescriptionBox", MethodReflectParams.INT, "defaultLength", "", "void"), 149);
        f14002x = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getGroupEntries", "com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleGroupDescriptionBox", "", "", "", "java.util.List"), 153);
        f14003y = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setGroupEntries", "com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleGroupDescriptionBox", "java.util.List", "groupEntries", "", "void"), 157);
        f14004z = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "equals", "com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleGroupDescriptionBox", "java.lang.Object", "o", "", "boolean"), 162);
        A = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", TTDownloadField.TT_HASHCODE, "com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleGroupDescriptionBox", "", "", "", MethodReflectParams.INT), 183);
        B = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "toString", "com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleGroupDescriptionBox", "", "", "", "java.lang.String"), 191);
    }

    private b x(ByteBuffer byteBuffer, String str) {
        b hVar;
        if (d.f13997b.equals(str)) {
            hVar = new d();
        } else if (c.f13988g.equals(str)) {
            hVar = new c();
        } else if (a.f13984d.equals(str)) {
            hVar = new a();
        } else if (i.f14022c.equals(str)) {
            hVar = new i();
        } else if (g.f14017c.equals(str)) {
            hVar = new g();
        } else if (com.mp4parser.iso14496.part15.g.f57197c.equals(str)) {
            hVar = new com.mp4parser.iso14496.part15.g();
        } else if (com.mp4parser.iso14496.part15.h.f57200l.equals(str)) {
            hVar = new com.mp4parser.iso14496.part15.h();
        } else if (com.mp4parser.iso14496.part15.i.f57212b.equals(str)) {
            hVar = new com.mp4parser.iso14496.part15.i();
        } else if (com.mp4parser.iso14496.part15.f.f57196a.equals(str)) {
            hVar = new com.mp4parser.iso14496.part15.f();
        } else {
            hVar = new h(str);
        }
        hVar.b(byteBuffer);
        return hVar;
    }

    @Override // com.googlecode.mp4parser.a
    protected void b(ByteBuffer byteBuffer) {
        t(byteBuffer);
        if (getVersion() == 1) {
            String b5 = com.coremedia.iso.g.b(byteBuffer);
            if (getVersion() == 1) {
                this.f14005s = com.googlecode.mp4parser.util.c.a(com.coremedia.iso.g.l(byteBuffer));
            }
            long l4 = com.coremedia.iso.g.l(byteBuffer);
            while (true) {
                long j4 = l4 - 1;
                if (l4 <= 0) {
                    return;
                }
                int i4 = this.f14005s;
                if (getVersion() == 1) {
                    if (this.f14005s == 0) {
                        i4 = com.googlecode.mp4parser.util.c.a(com.coremedia.iso.g.l(byteBuffer));
                    }
                    int position = byteBuffer.position() + i4;
                    ByteBuffer slice = byteBuffer.slice();
                    slice.limit(i4);
                    this.f14006t.add(x(slice, b5));
                    byteBuffer.position(position);
                    l4 = j4;
                } else {
                    throw new RuntimeException("This should be implemented");
                }
            }
        } else {
            throw new RuntimeException("SampleGroupDescriptionBox are only supported in version 1");
        }
    }

    @Override // com.googlecode.mp4parser.a
    protected void c(ByteBuffer byteBuffer) {
        u(byteBuffer);
        byteBuffer.put(com.coremedia.iso.f.C(this.f14006t.get(0).getType()));
        if (getVersion() == 1) {
            com.coremedia.iso.i.i(byteBuffer, this.f14005s);
        }
        com.coremedia.iso.i.i(byteBuffer, this.f14006t.size());
        for (b bVar : this.f14006t) {
            if (getVersion() == 1 && this.f14005s == 0) {
                com.coremedia.iso.i.i(byteBuffer, bVar.a().limit());
            }
            byteBuffer.put(bVar.a());
        }
    }

    @Override // com.googlecode.mp4parser.a
    protected long e() {
        long j4 = (getVersion() == 1 ? 12L : 8L) + 4;
        for (b bVar : this.f14006t) {
            if (getVersion() == 1 && this.f14005s == 0) {
                j4 += 4;
            }
            j4 += bVar.c();
        }
        return j4;
    }

    public boolean equals(Object obj) {
        j.b().c(org.aspectj.runtime.reflect.e.w(f14004z, this, this, obj));
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        if (this.f14005s != eVar.f14005s) {
            return false;
        }
        List<b> list = this.f14006t;
        List<b> list2 = eVar.f14006t;
        return list == null ? list2 == null : list.equals(list2);
    }

    public int hashCode() {
        j.b().c(org.aspectj.runtime.reflect.e.v(A, this, this));
        int i4 = (this.f14005s + 0) * 31;
        List<b> list = this.f14006t;
        return i4 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        j.b().c(org.aspectj.runtime.reflect.e.v(B, this, this));
        StringBuilder sb = new StringBuilder("SampleGroupDescriptionBox{groupingType='");
        sb.append(this.f14006t.size() > 0 ? this.f14006t.get(0).getType() : "????");
        sb.append('\'');
        sb.append(", defaultLength=");
        sb.append(this.f14005s);
        sb.append(", groupEntries=");
        sb.append(this.f14006t);
        sb.append('}');
        return sb.toString();
    }

    public int v() {
        j.b().c(org.aspectj.runtime.reflect.e.v(f14000v, this, this));
        return this.f14005s;
    }

    public List<b> w() {
        j.b().c(org.aspectj.runtime.reflect.e.v(f14002x, this, this));
        return this.f14006t;
    }

    public void y(int i4) {
        j.b().c(org.aspectj.runtime.reflect.e.w(f14001w, this, this, org.aspectj.runtime.internal.e.k(i4)));
        this.f14005s = i4;
    }

    public void z(List<b> list) {
        j.b().c(org.aspectj.runtime.reflect.e.w(f14003y, this, this, list));
        this.f14006t = list;
    }
}
