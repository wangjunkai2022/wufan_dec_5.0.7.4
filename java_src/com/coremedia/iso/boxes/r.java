package com.coremedia.iso.boxes;

import java.nio.ByteBuffer;
import java.util.LinkedList;
import java.util.List;
import org.aspectj.lang.c;
/* compiled from: EditListBox.java */
/* loaded from: classes2.dex */
public class r extends com.googlecode.mp4parser.c {

    /* renamed from: t  reason: collision with root package name */
    public static final String f9843t = "elst";

    /* renamed from: u  reason: collision with root package name */
    private static final /* synthetic */ c.b f9844u = null;

    /* renamed from: v  reason: collision with root package name */
    private static final /* synthetic */ c.b f9845v = null;

    /* renamed from: w  reason: collision with root package name */
    private static final /* synthetic */ c.b f9846w = null;

    /* renamed from: s  reason: collision with root package name */
    private List<a> f9847s;

    static {
        s();
    }

    public r() {
        super(f9843t);
        this.f9847s = new LinkedList();
    }

    private static /* synthetic */ void s() {
        org.aspectj.runtime.reflect.e eVar = new org.aspectj.runtime.reflect.e("EditListBox.java", r.class);
        f9844u = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getEntries", "com.coremedia.iso.boxes.EditListBox", "", "", "", "java.util.List"), 68);
        f9845v = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setEntries", "com.coremedia.iso.boxes.EditListBox", "java.util.List", "entries", "", "void"), 72);
        f9846w = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "toString", "com.coremedia.iso.boxes.EditListBox", "", "", "", "java.lang.String"), 108);
    }

    @Override // com.googlecode.mp4parser.a
    public void b(ByteBuffer byteBuffer) {
        t(byteBuffer);
        int a5 = com.googlecode.mp4parser.util.c.a(com.coremedia.iso.g.l(byteBuffer));
        this.f9847s = new LinkedList();
        for (int i4 = 0; i4 < a5; i4++) {
            this.f9847s.add(new a(this, byteBuffer));
        }
    }

    @Override // com.googlecode.mp4parser.a
    protected void c(ByteBuffer byteBuffer) {
        u(byteBuffer);
        com.coremedia.iso.i.i(byteBuffer, this.f9847s.size());
        for (a aVar : this.f9847s) {
            aVar.a(byteBuffer);
        }
    }

    @Override // com.googlecode.mp4parser.a
    protected long e() {
        int size;
        if (getVersion() == 1) {
            size = this.f9847s.size() * 20;
        } else {
            size = this.f9847s.size() * 12;
        }
        return size + 8;
    }

    public String toString() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(f9846w, this, this));
        return "EditListBox{entries=" + this.f9847s + '}';
    }

    public List<a> v() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(f9844u, this, this));
        return this.f9847s;
    }

    public void w(List<a> list) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(f9845v, this, this, list));
        this.f9847s = list;
    }

    /* compiled from: EditListBox.java */
    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        r f9848a;

        /* renamed from: b  reason: collision with root package name */
        private long f9849b;

        /* renamed from: c  reason: collision with root package name */
        private long f9850c;

        /* renamed from: d  reason: collision with root package name */
        private double f9851d;

        public a(r rVar, long j4, long j5, double d5) {
            this.f9849b = j4;
            this.f9850c = j5;
            this.f9851d = d5;
            this.f9848a = rVar;
        }

        public void a(ByteBuffer byteBuffer) {
            if (this.f9848a.getVersion() == 1) {
                com.coremedia.iso.i.l(byteBuffer, this.f9849b);
                byteBuffer.putLong(this.f9850c);
            } else {
                com.coremedia.iso.i.i(byteBuffer, com.googlecode.mp4parser.util.c.a(this.f9849b));
                byteBuffer.putInt(com.googlecode.mp4parser.util.c.a(this.f9850c));
            }
            com.coremedia.iso.i.b(byteBuffer, this.f9851d);
        }

        public double b() {
            return this.f9851d;
        }

        public long c() {
            return this.f9850c;
        }

        public long d() {
            return this.f9849b;
        }

        public void e(double d5) {
            this.f9851d = d5;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f9850c == aVar.f9850c && this.f9849b == aVar.f9849b;
        }

        public void f(long j4) {
            this.f9850c = j4;
        }

        public void g(long j4) {
            this.f9849b = j4;
        }

        public int hashCode() {
            long j4 = this.f9849b;
            long j5 = this.f9850c;
            return (((int) (j4 ^ (j4 >>> 32))) * 31) + ((int) (j5 ^ (j5 >>> 32)));
        }

        public String toString() {
            return "Entry{segmentDuration=" + this.f9849b + ", mediaTime=" + this.f9850c + ", mediaRate=" + this.f9851d + '}';
        }

        public a(r rVar, ByteBuffer byteBuffer) {
            if (rVar.getVersion() == 1) {
                this.f9849b = com.coremedia.iso.g.o(byteBuffer);
                this.f9850c = byteBuffer.getLong();
                this.f9851d = com.coremedia.iso.g.d(byteBuffer);
            } else {
                this.f9849b = com.coremedia.iso.g.l(byteBuffer);
                this.f9850c = byteBuffer.getInt();
                this.f9851d = com.coremedia.iso.g.d(byteBuffer);
            }
            this.f9848a = rVar;
        }
    }
}
