package com.coremedia.iso.boxes;

import com.swift.sandhook.annotation.MethodReflectParams;
import java.nio.ByteBuffer;
import java.util.LinkedList;
import java.util.List;
import org.aspectj.lang.c;
/* compiled from: ItemLocationBox.java */
/* loaded from: classes2.dex */
public class a0 extends com.googlecode.mp4parser.c {
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

    /* renamed from: x  reason: collision with root package name */
    public static final String f9480x = "iloc";

    /* renamed from: y  reason: collision with root package name */
    private static final /* synthetic */ c.b f9481y = null;

    /* renamed from: z  reason: collision with root package name */
    private static final /* synthetic */ c.b f9482z = null;

    /* renamed from: s  reason: collision with root package name */
    public int f9483s;

    /* renamed from: t  reason: collision with root package name */
    public int f9484t;

    /* renamed from: u  reason: collision with root package name */
    public int f9485u;

    /* renamed from: v  reason: collision with root package name */
    public int f9486v;

    /* renamed from: w  reason: collision with root package name */
    public List<b> f9487w;

    static {
        s();
    }

    public a0() {
        super(f9480x);
        this.f9483s = 8;
        this.f9484t = 8;
        this.f9485u = 8;
        this.f9486v = 0;
        this.f9487w = new LinkedList();
    }

    private static /* synthetic */ void s() {
        org.aspectj.runtime.reflect.e eVar = new org.aspectj.runtime.reflect.e("ItemLocationBox.java", a0.class);
        f9481y = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getOffsetSize", "com.coremedia.iso.boxes.ItemLocationBox", "", "", "", MethodReflectParams.INT), 119);
        f9482z = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setOffsetSize", "com.coremedia.iso.boxes.ItemLocationBox", MethodReflectParams.INT, "offsetSize", "", "void"), 123);
        I = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "createItem", "com.coremedia.iso.boxes.ItemLocationBox", "int:int:int:long:java.util.List", "itemId:constructionMethod:dataReferenceIndex:baseOffset:extents", "", "com.coremedia.iso.boxes.ItemLocationBox$Item"), 160);
        J = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "createExtent", "com.coremedia.iso.boxes.ItemLocationBox", "long:long:long", "extentOffset:extentLength:extentIndex", "", "com.coremedia.iso.boxes.ItemLocationBox$Extent"), 285);
        A = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getLengthSize", "com.coremedia.iso.boxes.ItemLocationBox", "", "", "", MethodReflectParams.INT), 127);
        B = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setLengthSize", "com.coremedia.iso.boxes.ItemLocationBox", MethodReflectParams.INT, "lengthSize", "", "void"), 131);
        C = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getBaseOffsetSize", "com.coremedia.iso.boxes.ItemLocationBox", "", "", "", MethodReflectParams.INT), 135);
        D = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setBaseOffsetSize", "com.coremedia.iso.boxes.ItemLocationBox", MethodReflectParams.INT, "baseOffsetSize", "", "void"), 139);
        E = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getIndexSize", "com.coremedia.iso.boxes.ItemLocationBox", "", "", "", MethodReflectParams.INT), 143);
        F = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setIndexSize", "com.coremedia.iso.boxes.ItemLocationBox", MethodReflectParams.INT, "indexSize", "", "void"), 147);
        G = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getItems", "com.coremedia.iso.boxes.ItemLocationBox", "", "", "", "java.util.List"), 151);
        H = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setItems", "com.coremedia.iso.boxes.ItemLocationBox", "java.util.List", "items", "", "void"), 155);
    }

    public int A() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(E, this, this));
        return this.f9486v;
    }

    public List<b> B() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(G, this, this));
        return this.f9487w;
    }

    public int C() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(A, this, this));
        return this.f9484t;
    }

    public int D() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(f9481y, this, this));
        return this.f9483s;
    }

    public void E(int i4) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(D, this, this, org.aspectj.runtime.internal.e.k(i4)));
        this.f9485u = i4;
    }

    public void F(int i4) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(F, this, this, org.aspectj.runtime.internal.e.k(i4)));
        this.f9486v = i4;
    }

    public void G(List<b> list) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(H, this, this, list));
        this.f9487w = list;
    }

    public void H(int i4) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(B, this, this, org.aspectj.runtime.internal.e.k(i4)));
        this.f9484t = i4;
    }

    public void I(int i4) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(f9482z, this, this, org.aspectj.runtime.internal.e.k(i4)));
        this.f9483s = i4;
    }

    @Override // com.googlecode.mp4parser.a
    public void b(ByteBuffer byteBuffer) {
        t(byteBuffer);
        int p4 = com.coremedia.iso.g.p(byteBuffer);
        this.f9483s = p4 >>> 4;
        this.f9484t = p4 & 15;
        int p5 = com.coremedia.iso.g.p(byteBuffer);
        this.f9485u = p5 >>> 4;
        if (getVersion() == 1) {
            this.f9486v = p5 & 15;
        }
        int i4 = com.coremedia.iso.g.i(byteBuffer);
        for (int i5 = 0; i5 < i4; i5++) {
            this.f9487w.add(new b(byteBuffer));
        }
    }

    @Override // com.googlecode.mp4parser.a
    protected void c(ByteBuffer byteBuffer) {
        u(byteBuffer);
        com.coremedia.iso.i.m(byteBuffer, (this.f9483s << 4) | this.f9484t);
        if (getVersion() == 1) {
            com.coremedia.iso.i.m(byteBuffer, (this.f9485u << 4) | this.f9486v);
        } else {
            com.coremedia.iso.i.m(byteBuffer, this.f9485u << 4);
        }
        com.coremedia.iso.i.f(byteBuffer, this.f9487w.size());
        for (b bVar : this.f9487w) {
            bVar.a(byteBuffer);
        }
    }

    @Override // com.googlecode.mp4parser.a
    protected long e() {
        long j4 = 8;
        for (b bVar : this.f9487w) {
            j4 += bVar.b();
        }
        return j4;
    }

    public a v(long j4, long j5, long j6) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.y(J, this, this, new Object[]{org.aspectj.runtime.internal.e.m(j4), org.aspectj.runtime.internal.e.m(j5), org.aspectj.runtime.internal.e.m(j6)}));
        return new a(j4, j5, j6);
    }

    a w(ByteBuffer byteBuffer) {
        return new a(byteBuffer);
    }

    public b x(int i4, int i5, int i6, long j4, List<a> list) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.y(I, this, this, new Object[]{org.aspectj.runtime.internal.e.k(i4), org.aspectj.runtime.internal.e.k(i5), org.aspectj.runtime.internal.e.k(i6), org.aspectj.runtime.internal.e.m(j4), list}));
        return new b(i4, i5, i6, j4, list);
    }

    b y(ByteBuffer byteBuffer) {
        return new b(byteBuffer);
    }

    public int z() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(C, this, this));
        return this.f9485u;
    }

    /* compiled from: ItemLocationBox.java */
    /* loaded from: classes2.dex */
    public class a {

        /* renamed from: a  reason: collision with root package name */
        public long f9488a;

        /* renamed from: b  reason: collision with root package name */
        public long f9489b;

        /* renamed from: c  reason: collision with root package name */
        public long f9490c;

        public a(long j4, long j5, long j6) {
            this.f9488a = j4;
            this.f9489b = j5;
            this.f9490c = j6;
        }

        public void a(ByteBuffer byteBuffer) {
            int i4;
            if (a0.this.getVersion() == 1 && (i4 = a0.this.f9486v) > 0) {
                com.coremedia.iso.j.a(this.f9490c, byteBuffer, i4);
            }
            com.coremedia.iso.j.a(this.f9488a, byteBuffer, a0.this.f9483s);
            com.coremedia.iso.j.a(this.f9489b, byteBuffer, a0.this.f9484t);
        }

        public int b() {
            a0 a0Var = a0.this;
            int i4 = a0Var.f9486v;
            if (i4 <= 0) {
                i4 = 0;
            }
            return i4 + a0Var.f9483s + a0Var.f9484t;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f9490c == aVar.f9490c && this.f9489b == aVar.f9489b && this.f9488a == aVar.f9488a;
        }

        public int hashCode() {
            long j4 = this.f9488a;
            long j5 = this.f9489b;
            long j6 = this.f9490c;
            return (((((int) (j4 ^ (j4 >>> 32))) * 31) + ((int) (j5 ^ (j5 >>> 32)))) * 31) + ((int) (j6 ^ (j6 >>> 32)));
        }

        public String toString() {
            return "Extent{extentOffset=" + this.f9488a + ", extentLength=" + this.f9489b + ", extentIndex=" + this.f9490c + '}';
        }

        public a(ByteBuffer byteBuffer) {
            int i4;
            if (a0.this.getVersion() == 1 && (i4 = a0.this.f9486v) > 0) {
                this.f9490c = com.coremedia.iso.h.a(byteBuffer, i4);
            }
            this.f9488a = com.coremedia.iso.h.a(byteBuffer, a0.this.f9483s);
            this.f9489b = com.coremedia.iso.h.a(byteBuffer, a0.this.f9484t);
        }
    }

    /* compiled from: ItemLocationBox.java */
    /* loaded from: classes2.dex */
    public class b {

        /* renamed from: a  reason: collision with root package name */
        public int f9492a;

        /* renamed from: b  reason: collision with root package name */
        public int f9493b;

        /* renamed from: c  reason: collision with root package name */
        public int f9494c;

        /* renamed from: d  reason: collision with root package name */
        public long f9495d;

        /* renamed from: e  reason: collision with root package name */
        public List<a> f9496e;

        public b(ByteBuffer byteBuffer) {
            this.f9496e = new LinkedList();
            this.f9492a = com.coremedia.iso.g.i(byteBuffer);
            if (a0.this.getVersion() == 1) {
                this.f9493b = com.coremedia.iso.g.i(byteBuffer) & 15;
            }
            this.f9494c = com.coremedia.iso.g.i(byteBuffer);
            int i4 = a0.this.f9485u;
            if (i4 > 0) {
                this.f9495d = com.coremedia.iso.h.a(byteBuffer, i4);
            } else {
                this.f9495d = 0L;
            }
            int i5 = com.coremedia.iso.g.i(byteBuffer);
            for (int i6 = 0; i6 < i5; i6++) {
                this.f9496e.add(new a(byteBuffer));
            }
        }

        public void a(ByteBuffer byteBuffer) {
            com.coremedia.iso.i.f(byteBuffer, this.f9492a);
            if (a0.this.getVersion() == 1) {
                com.coremedia.iso.i.f(byteBuffer, this.f9493b);
            }
            com.coremedia.iso.i.f(byteBuffer, this.f9494c);
            int i4 = a0.this.f9485u;
            if (i4 > 0) {
                com.coremedia.iso.j.a(this.f9495d, byteBuffer, i4);
            }
            com.coremedia.iso.i.f(byteBuffer, this.f9496e.size());
            for (a aVar : this.f9496e) {
                aVar.a(byteBuffer);
            }
        }

        public int b() {
            int i4 = (a0.this.getVersion() == 1 ? 4 : 2) + 2 + a0.this.f9485u + 2;
            for (a aVar : this.f9496e) {
                i4 += aVar.b();
            }
            return i4;
        }

        public void c(long j4) {
            this.f9495d = j4;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            if (this.f9495d == bVar.f9495d && this.f9493b == bVar.f9493b && this.f9494c == bVar.f9494c && this.f9492a == bVar.f9492a) {
                List<a> list = this.f9496e;
                List<a> list2 = bVar.f9496e;
                return list == null ? list2 == null : list.equals(list2);
            }
            return false;
        }

        public int hashCode() {
            long j4 = this.f9495d;
            int i4 = ((((((this.f9492a * 31) + this.f9493b) * 31) + this.f9494c) * 31) + ((int) (j4 ^ (j4 >>> 32)))) * 31;
            List<a> list = this.f9496e;
            return i4 + (list != null ? list.hashCode() : 0);
        }

        public String toString() {
            return "Item{baseOffset=" + this.f9495d + ", itemId=" + this.f9492a + ", constructionMethod=" + this.f9493b + ", dataReferenceIndex=" + this.f9494c + ", extents=" + this.f9496e + '}';
        }

        public b(int i4, int i5, int i6, long j4, List<a> list) {
            this.f9496e = new LinkedList();
            this.f9492a = i4;
            this.f9493b = i5;
            this.f9494c = i6;
            this.f9495d = j4;
            this.f9496e = list;
        }
    }
}
