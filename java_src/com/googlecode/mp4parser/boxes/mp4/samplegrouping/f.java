package com.googlecode.mp4parser.boxes.mp4.samplegrouping;

import com.googlecode.mp4parser.j;
import java.nio.ByteBuffer;
import java.util.LinkedList;
import java.util.List;
import org.aspectj.lang.c;
/* compiled from: SampleToGroupBox.java */
/* loaded from: classes3.dex */
public class f extends com.googlecode.mp4parser.c {
    private static final /* synthetic */ c.b A = null;
    private static final /* synthetic */ c.b B = null;

    /* renamed from: v  reason: collision with root package name */
    public static final String f14007v = "sbgp";

    /* renamed from: w  reason: collision with root package name */
    private static final /* synthetic */ c.b f14008w = null;

    /* renamed from: x  reason: collision with root package name */
    private static final /* synthetic */ c.b f14009x = null;

    /* renamed from: y  reason: collision with root package name */
    private static final /* synthetic */ c.b f14010y = null;

    /* renamed from: z  reason: collision with root package name */
    private static final /* synthetic */ c.b f14011z = null;

    /* renamed from: s  reason: collision with root package name */
    private String f14012s;

    /* renamed from: t  reason: collision with root package name */
    private String f14013t;

    /* renamed from: u  reason: collision with root package name */
    List<a> f14014u;

    /* compiled from: SampleToGroupBox.java */
    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private long f14015a;

        /* renamed from: b  reason: collision with root package name */
        private int f14016b;

        public a(long j4, int i4) {
            this.f14015a = j4;
            this.f14016b = i4;
        }

        public int a() {
            return this.f14016b;
        }

        public long b() {
            return this.f14015a;
        }

        public void c(int i4) {
            this.f14016b = i4;
        }

        public void d(long j4) {
            this.f14015a = j4;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f14016b == aVar.f14016b && this.f14015a == aVar.f14015a;
        }

        public int hashCode() {
            long j4 = this.f14015a;
            return (((int) (j4 ^ (j4 >>> 32))) * 31) + this.f14016b;
        }

        public String toString() {
            return "Entry{sampleCount=" + this.f14015a + ", groupDescriptionIndex=" + this.f14016b + '}';
        }
    }

    static {
        s();
    }

    public f() {
        super(f14007v);
        this.f14014u = new LinkedList();
    }

    private static /* synthetic */ void s() {
        org.aspectj.runtime.reflect.e eVar = new org.aspectj.runtime.reflect.e("SampleToGroupBox.java", f.class);
        f14008w = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getGroupingType", "com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleToGroupBox", "", "", "", "java.lang.String"), 150);
        f14009x = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setGroupingType", "com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleToGroupBox", "java.lang.String", "groupingType", "", "void"), 154);
        f14010y = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getGroupingTypeParameter", "com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleToGroupBox", "", "", "", "java.lang.String"), 158);
        f14011z = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setGroupingTypeParameter", "com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleToGroupBox", "java.lang.String", "groupingTypeParameter", "", "void"), 162);
        A = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getEntries", "com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleToGroupBox", "", "", "", "java.util.List"), 166);
        B = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setEntries", "com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleToGroupBox", "java.util.List", "entries", "", "void"), 170);
    }

    public void A(String str) {
        j.b().c(org.aspectj.runtime.reflect.e.w(f14011z, this, this, str));
        this.f14013t = str;
    }

    @Override // com.googlecode.mp4parser.a
    protected void b(ByteBuffer byteBuffer) {
        t(byteBuffer);
        this.f14012s = com.coremedia.iso.g.b(byteBuffer);
        if (getVersion() == 1) {
            this.f14013t = com.coremedia.iso.g.b(byteBuffer);
        }
        long l4 = com.coremedia.iso.g.l(byteBuffer);
        while (true) {
            long j4 = l4 - 1;
            if (l4 <= 0) {
                return;
            }
            this.f14014u.add(new a(com.googlecode.mp4parser.util.c.a(com.coremedia.iso.g.l(byteBuffer)), com.googlecode.mp4parser.util.c.a(com.coremedia.iso.g.l(byteBuffer))));
            l4 = j4;
        }
    }

    @Override // com.googlecode.mp4parser.a
    protected void c(ByteBuffer byteBuffer) {
        u(byteBuffer);
        byteBuffer.put(this.f14012s.getBytes());
        if (getVersion() == 1) {
            byteBuffer.put(this.f14013t.getBytes());
        }
        com.coremedia.iso.i.i(byteBuffer, this.f14014u.size());
        for (a aVar : this.f14014u) {
            com.coremedia.iso.i.i(byteBuffer, aVar.b());
            com.coremedia.iso.i.i(byteBuffer, aVar.a());
        }
    }

    @Override // com.googlecode.mp4parser.a
    protected long e() {
        return getVersion() == 1 ? (this.f14014u.size() * 8) + 16 : (this.f14014u.size() * 8) + 12;
    }

    public List<a> v() {
        j.b().c(org.aspectj.runtime.reflect.e.v(A, this, this));
        return this.f14014u;
    }

    public String w() {
        j.b().c(org.aspectj.runtime.reflect.e.v(f14008w, this, this));
        return this.f14012s;
    }

    public String x() {
        j.b().c(org.aspectj.runtime.reflect.e.v(f14010y, this, this));
        return this.f14013t;
    }

    public void y(List<a> list) {
        j.b().c(org.aspectj.runtime.reflect.e.w(B, this, this, list));
        this.f14014u = list;
    }

    public void z(String str) {
        j.b().c(org.aspectj.runtime.reflect.e.w(f14009x, this, this, str));
        this.f14012s = str;
    }
}
