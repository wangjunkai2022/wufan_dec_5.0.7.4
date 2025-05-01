package com.googlecode.mp4parser.boxes;

import com.googlecode.mp4parser.j;
import com.swift.sandhook.annotation.MethodReflectParams;
import java.nio.ByteBuffer;
import java.util.LinkedList;
import java.util.List;
import org.aspectj.lang.c;
/* compiled from: EC3SpecificBox.java */
/* loaded from: classes3.dex */
public class e extends com.googlecode.mp4parser.a {
    private static final /* synthetic */ c.b A = null;

    /* renamed from: r  reason: collision with root package name */
    public static final String f13818r = "dec3";

    /* renamed from: s  reason: collision with root package name */
    private static final /* synthetic */ c.b f13819s = null;

    /* renamed from: t  reason: collision with root package name */
    private static final /* synthetic */ c.b f13820t = null;

    /* renamed from: u  reason: collision with root package name */
    private static final /* synthetic */ c.b f13821u = null;

    /* renamed from: v  reason: collision with root package name */
    private static final /* synthetic */ c.b f13822v = null;

    /* renamed from: w  reason: collision with root package name */
    private static final /* synthetic */ c.b f13823w = null;

    /* renamed from: x  reason: collision with root package name */
    private static final /* synthetic */ c.b f13824x = null;

    /* renamed from: y  reason: collision with root package name */
    private static final /* synthetic */ c.b f13825y = null;

    /* renamed from: z  reason: collision with root package name */
    private static final /* synthetic */ c.b f13826z = null;

    /* renamed from: o  reason: collision with root package name */
    List<a> f13827o;

    /* renamed from: p  reason: collision with root package name */
    int f13828p;

    /* renamed from: q  reason: collision with root package name */
    int f13829q;

    /* compiled from: EC3SpecificBox.java */
    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public int f13830a;

        /* renamed from: b  reason: collision with root package name */
        public int f13831b;

        /* renamed from: c  reason: collision with root package name */
        public int f13832c;

        /* renamed from: d  reason: collision with root package name */
        public int f13833d;

        /* renamed from: e  reason: collision with root package name */
        public int f13834e;

        /* renamed from: f  reason: collision with root package name */
        public int f13835f;

        /* renamed from: g  reason: collision with root package name */
        public int f13836g;

        /* renamed from: h  reason: collision with root package name */
        public int f13837h;

        /* renamed from: i  reason: collision with root package name */
        public int f13838i;

        public String toString() {
            return "Entry{fscod=" + this.f13830a + ", bsid=" + this.f13831b + ", bsmod=" + this.f13832c + ", acmod=" + this.f13833d + ", lfeon=" + this.f13834e + ", reserved=" + this.f13835f + ", num_dep_sub=" + this.f13836g + ", chan_loc=" + this.f13837h + ", reserved2=" + this.f13838i + '}';
        }
    }

    static {
        t();
    }

    public e() {
        super(f13818r);
        this.f13827o = new LinkedList();
    }

    private static /* synthetic */ void t() {
        org.aspectj.runtime.reflect.e eVar = new org.aspectj.runtime.reflect.e("EC3SpecificBox.java", e.class);
        f13819s = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getContentSize", "com.googlecode.mp4parser.boxes.EC3SpecificBox", "", "", "", MethodReflectParams.LONG), 25);
        f13820t = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getContent", "com.googlecode.mp4parser.boxes.EC3SpecificBox", "java.nio.ByteBuffer", "byteBuffer", "", "void"), 65);
        f13821u = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getEntries", "com.googlecode.mp4parser.boxes.EC3SpecificBox", "", "", "", "java.util.List"), 86);
        f13822v = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setEntries", "com.googlecode.mp4parser.boxes.EC3SpecificBox", "java.util.List", "entries", "", "void"), 90);
        f13823w = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "addEntry", "com.googlecode.mp4parser.boxes.EC3SpecificBox", "com.googlecode.mp4parser.boxes.EC3SpecificBox$Entry", "entry", "", "void"), 94);
        f13824x = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getDataRate", "com.googlecode.mp4parser.boxes.EC3SpecificBox", "", "", "", MethodReflectParams.INT), 98);
        f13825y = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setDataRate", "com.googlecode.mp4parser.boxes.EC3SpecificBox", MethodReflectParams.INT, "dataRate", "", "void"), 102);
        f13826z = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getNumIndSub", "com.googlecode.mp4parser.boxes.EC3SpecificBox", "", "", "", MethodReflectParams.INT), 106);
        A = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setNumIndSub", "com.googlecode.mp4parser.boxes.EC3SpecificBox", MethodReflectParams.INT, "numIndSub", "", "void"), 110);
    }

    @Override // com.googlecode.mp4parser.a
    public void b(ByteBuffer byteBuffer) {
        com.googlecode.mp4parser.boxes.mp4.objectdescriptors.c cVar = new com.googlecode.mp4parser.boxes.mp4.objectdescriptors.c(byteBuffer);
        this.f13828p = cVar.c(13);
        this.f13829q = cVar.c(3) + 1;
        for (int i4 = 0; i4 < this.f13829q; i4++) {
            a aVar = new a();
            aVar.f13830a = cVar.c(2);
            aVar.f13831b = cVar.c(5);
            aVar.f13832c = cVar.c(5);
            aVar.f13833d = cVar.c(3);
            aVar.f13834e = cVar.c(1);
            aVar.f13835f = cVar.c(3);
            int c5 = cVar.c(4);
            aVar.f13836g = c5;
            if (c5 > 0) {
                aVar.f13837h = cVar.c(9);
            } else {
                aVar.f13838i = cVar.c(1);
            }
            this.f13827o.add(aVar);
        }
    }

    @Override // com.googlecode.mp4parser.a
    public void c(ByteBuffer byteBuffer) {
        j.b().c(org.aspectj.runtime.reflect.e.w(f13820t, this, this, byteBuffer));
        com.googlecode.mp4parser.boxes.mp4.objectdescriptors.d dVar = new com.googlecode.mp4parser.boxes.mp4.objectdescriptors.d(byteBuffer);
        dVar.a(this.f13828p, 13);
        dVar.a(this.f13827o.size() - 1, 3);
        for (a aVar : this.f13827o) {
            dVar.a(aVar.f13830a, 2);
            dVar.a(aVar.f13831b, 5);
            dVar.a(aVar.f13832c, 5);
            dVar.a(aVar.f13833d, 3);
            dVar.a(aVar.f13834e, 1);
            dVar.a(aVar.f13835f, 3);
            dVar.a(aVar.f13836g, 4);
            if (aVar.f13836g > 0) {
                dVar.a(aVar.f13837h, 9);
            } else {
                dVar.a(aVar.f13838i, 1);
            }
        }
    }

    @Override // com.googlecode.mp4parser.a
    public long e() {
        j.b().c(org.aspectj.runtime.reflect.e.v(f13819s, this, this));
        long j4 = 2;
        for (a aVar : this.f13827o) {
            j4 += aVar.f13836g > 0 ? 4L : 3L;
        }
        return j4;
    }

    public void s(a aVar) {
        j.b().c(org.aspectj.runtime.reflect.e.w(f13823w, this, this, aVar));
        this.f13827o.add(aVar);
    }

    public int u() {
        j.b().c(org.aspectj.runtime.reflect.e.v(f13824x, this, this));
        return this.f13828p;
    }

    public List<a> v() {
        j.b().c(org.aspectj.runtime.reflect.e.v(f13821u, this, this));
        return this.f13827o;
    }

    public int w() {
        j.b().c(org.aspectj.runtime.reflect.e.v(f13826z, this, this));
        return this.f13829q;
    }

    public void x(int i4) {
        j.b().c(org.aspectj.runtime.reflect.e.w(f13825y, this, this, org.aspectj.runtime.internal.e.k(i4)));
        this.f13828p = i4;
    }

    public void y(List<a> list) {
        j.b().c(org.aspectj.runtime.reflect.e.w(f13822v, this, this, list));
        this.f13827o = list;
    }

    public void z(int i4) {
        j.b().c(org.aspectj.runtime.reflect.e.w(A, this, this, org.aspectj.runtime.internal.e.k(i4)));
        this.f13829q = i4;
    }
}
