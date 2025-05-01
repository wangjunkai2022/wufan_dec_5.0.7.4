package com.coremedia.iso.boxes;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import org.aspectj.lang.c;
/* compiled from: SubSampleInformationBox.java */
/* loaded from: classes2.dex */
public class a1 extends com.googlecode.mp4parser.c {

    /* renamed from: t  reason: collision with root package name */
    public static final String f9498t = "subs";

    /* renamed from: u  reason: collision with root package name */
    private static final /* synthetic */ c.b f9499u = null;

    /* renamed from: v  reason: collision with root package name */
    private static final /* synthetic */ c.b f9500v = null;

    /* renamed from: w  reason: collision with root package name */
    private static final /* synthetic */ c.b f9501w = null;

    /* renamed from: s  reason: collision with root package name */
    private List<a> f9502s;

    /* compiled from: SubSampleInformationBox.java */
    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private long f9503a;

        /* renamed from: b  reason: collision with root package name */
        private List<C0241a> f9504b = new ArrayList();

        /* compiled from: SubSampleInformationBox.java */
        /* renamed from: com.coremedia.iso.boxes.a1$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static class C0241a {

            /* renamed from: a  reason: collision with root package name */
            private long f9505a;

            /* renamed from: b  reason: collision with root package name */
            private int f9506b;

            /* renamed from: c  reason: collision with root package name */
            private int f9507c;

            /* renamed from: d  reason: collision with root package name */
            private long f9508d;

            public int a() {
                return this.f9507c;
            }

            public long b() {
                return this.f9508d;
            }

            public int c() {
                return this.f9506b;
            }

            public long d() {
                return this.f9505a;
            }

            public void e(int i4) {
                this.f9507c = i4;
            }

            public void f(long j4) {
                this.f9508d = j4;
            }

            public void g(int i4) {
                this.f9506b = i4;
            }

            public void h(long j4) {
                this.f9505a = j4;
            }

            public String toString() {
                return "SubsampleEntry{subsampleSize=" + this.f9505a + ", subsamplePriority=" + this.f9506b + ", discardable=" + this.f9507c + ", reserved=" + this.f9508d + '}';
            }
        }

        public long a() {
            return this.f9503a;
        }

        public int b() {
            return this.f9504b.size();
        }

        public List<C0241a> c() {
            return this.f9504b;
        }

        public void d(long j4) {
            this.f9503a = j4;
        }

        public String toString() {
            return "SampleEntry{sampleDelta=" + this.f9503a + ", subsampleCount=" + this.f9504b.size() + ", subsampleEntries=" + this.f9504b + '}';
        }
    }

    static {
        s();
    }

    public a1() {
        super(f9498t);
        this.f9502s = new ArrayList();
    }

    private static /* synthetic */ void s() {
        org.aspectj.runtime.reflect.e eVar = new org.aspectj.runtime.reflect.e("SubSampleInformationBox.java", a1.class);
        f9499u = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getEntries", "com.coremedia.iso.boxes.SubSampleInformationBox", "", "", "", "java.util.List"), 50);
        f9500v = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setEntries", "com.coremedia.iso.boxes.SubSampleInformationBox", "java.util.List", "entries", "", "void"), 54);
        f9501w = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "toString", "com.coremedia.iso.boxes.SubSampleInformationBox", "", "", "", "java.lang.String"), 124);
    }

    @Override // com.googlecode.mp4parser.a
    public void b(ByteBuffer byteBuffer) {
        t(byteBuffer);
        long l4 = com.coremedia.iso.g.l(byteBuffer);
        for (int i4 = 0; i4 < l4; i4++) {
            a aVar = new a();
            aVar.d(com.coremedia.iso.g.l(byteBuffer));
            int i5 = com.coremedia.iso.g.i(byteBuffer);
            for (int i6 = 0; i6 < i5; i6++) {
                a.C0241a c0241a = new a.C0241a();
                c0241a.h(getVersion() == 1 ? com.coremedia.iso.g.l(byteBuffer) : com.coremedia.iso.g.i(byteBuffer));
                c0241a.g(com.coremedia.iso.g.p(byteBuffer));
                c0241a.e(com.coremedia.iso.g.p(byteBuffer));
                c0241a.f(com.coremedia.iso.g.l(byteBuffer));
                aVar.c().add(c0241a);
            }
            this.f9502s.add(aVar);
        }
    }

    @Override // com.googlecode.mp4parser.a
    protected void c(ByteBuffer byteBuffer) {
        u(byteBuffer);
        com.coremedia.iso.i.i(byteBuffer, this.f9502s.size());
        for (a aVar : this.f9502s) {
            com.coremedia.iso.i.i(byteBuffer, aVar.a());
            com.coremedia.iso.i.f(byteBuffer, aVar.b());
            for (a.C0241a c0241a : aVar.c()) {
                if (getVersion() == 1) {
                    com.coremedia.iso.i.i(byteBuffer, c0241a.d());
                } else {
                    com.coremedia.iso.i.f(byteBuffer, com.googlecode.mp4parser.util.c.a(c0241a.d()));
                }
                com.coremedia.iso.i.m(byteBuffer, c0241a.c());
                com.coremedia.iso.i.m(byteBuffer, c0241a.a());
                com.coremedia.iso.i.i(byteBuffer, c0241a.b());
            }
        }
    }

    @Override // com.googlecode.mp4parser.a
    protected long e() {
        long j4 = 8;
        for (a aVar : this.f9502s) {
            j4 = j4 + 4 + 2;
            for (int i4 = 0; i4 < aVar.c().size(); i4++) {
                j4 = (getVersion() == 1 ? j4 + 4 : j4 + 2) + 2 + 4;
            }
        }
        return j4;
    }

    public String toString() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(f9501w, this, this));
        return "SubSampleInformationBox{entryCount=" + this.f9502s.size() + ", entries=" + this.f9502s + '}';
    }

    public List<a> v() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(f9499u, this, this));
        return this.f9502s;
    }

    public void w(List<a> list) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(f9500v, this, this, list));
        this.f9502s = list;
    }
}
