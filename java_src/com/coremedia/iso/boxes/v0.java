package com.coremedia.iso.boxes;

import com.swift.sandhook.annotation.MethodReflectParams;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.aspectj.lang.c;
/* compiled from: SampleToChunkBox.java */
/* loaded from: classes2.dex */
public class v0 extends com.googlecode.mp4parser.c {

    /* renamed from: t  reason: collision with root package name */
    public static final String f9961t = "stsc";

    /* renamed from: u  reason: collision with root package name */
    private static final /* synthetic */ c.b f9962u = null;

    /* renamed from: v  reason: collision with root package name */
    private static final /* synthetic */ c.b f9963v = null;

    /* renamed from: w  reason: collision with root package name */
    private static final /* synthetic */ c.b f9964w = null;

    /* renamed from: x  reason: collision with root package name */
    private static final /* synthetic */ c.b f9965x = null;

    /* renamed from: s  reason: collision with root package name */
    List<a> f9966s;

    /* compiled from: SampleToChunkBox.java */
    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        long f9967a;

        /* renamed from: b  reason: collision with root package name */
        long f9968b;

        /* renamed from: c  reason: collision with root package name */
        long f9969c;

        public a(long j4, long j5, long j6) {
            this.f9967a = j4;
            this.f9968b = j5;
            this.f9969c = j6;
        }

        public long a() {
            return this.f9967a;
        }

        public long b() {
            return this.f9969c;
        }

        public long c() {
            return this.f9968b;
        }

        public void d(long j4) {
            this.f9967a = j4;
        }

        public void e(long j4) {
            this.f9969c = j4;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f9967a == aVar.f9967a && this.f9969c == aVar.f9969c && this.f9968b == aVar.f9968b;
        }

        public void f(long j4) {
            this.f9968b = j4;
        }

        public int hashCode() {
            long j4 = this.f9967a;
            long j5 = this.f9968b;
            long j6 = this.f9969c;
            return (((((int) (j4 ^ (j4 >>> 32))) * 31) + ((int) (j5 ^ (j5 >>> 32)))) * 31) + ((int) (j6 ^ (j6 >>> 32)));
        }

        public String toString() {
            return "Entry{firstChunk=" + this.f9967a + ", samplesPerChunk=" + this.f9968b + ", sampleDescriptionIndex=" + this.f9969c + '}';
        }
    }

    static {
        s();
    }

    public v0() {
        super(f9961t);
        this.f9966s = Collections.emptyList();
    }

    private static /* synthetic */ void s() {
        org.aspectj.runtime.reflect.e eVar = new org.aspectj.runtime.reflect.e("SampleToChunkBox.java", v0.class);
        f9962u = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getEntries", "com.coremedia.iso.boxes.SampleToChunkBox", "", "", "", "java.util.List"), 47);
        f9963v = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setEntries", "com.coremedia.iso.boxes.SampleToChunkBox", "java.util.List", "entries", "", "void"), 51);
        f9964w = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "toString", "com.coremedia.iso.boxes.SampleToChunkBox", "", "", "", "java.lang.String"), 84);
        f9965x = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "blowup", "com.coremedia.iso.boxes.SampleToChunkBox", MethodReflectParams.INT, "chunkCount", "", "[J"), 95);
    }

    @Override // com.googlecode.mp4parser.a
    public void b(ByteBuffer byteBuffer) {
        t(byteBuffer);
        int a5 = com.googlecode.mp4parser.util.c.a(com.coremedia.iso.g.l(byteBuffer));
        this.f9966s = new ArrayList(a5);
        for (int i4 = 0; i4 < a5; i4++) {
            this.f9966s.add(new a(com.coremedia.iso.g.l(byteBuffer), com.coremedia.iso.g.l(byteBuffer), com.coremedia.iso.g.l(byteBuffer)));
        }
    }

    @Override // com.googlecode.mp4parser.a
    protected void c(ByteBuffer byteBuffer) {
        u(byteBuffer);
        com.coremedia.iso.i.i(byteBuffer, this.f9966s.size());
        for (a aVar : this.f9966s) {
            com.coremedia.iso.i.i(byteBuffer, aVar.a());
            com.coremedia.iso.i.i(byteBuffer, aVar.c());
            com.coremedia.iso.i.i(byteBuffer, aVar.b());
        }
    }

    @Override // com.googlecode.mp4parser.a
    protected long e() {
        return (this.f9966s.size() * 12) + 8;
    }

    public String toString() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(f9964w, this, this));
        return "SampleToChunkBox[entryCount=" + this.f9966s.size() + "]";
    }

    public long[] v(int i4) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(f9965x, this, this, org.aspectj.runtime.internal.e.k(i4)));
        long[] jArr = new long[i4];
        LinkedList linkedList = new LinkedList(this.f9966s);
        Collections.reverse(linkedList);
        Iterator it2 = linkedList.iterator();
        a aVar = (a) it2.next();
        while (i4 > 1) {
            jArr[i4 - 1] = aVar.c();
            if (i4 == aVar.a()) {
                aVar = (a) it2.next();
            }
            i4--;
        }
        jArr[0] = aVar.c();
        return jArr;
    }

    public List<a> w() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(f9962u, this, this));
        return this.f9966s;
    }

    public void x(List<a> list) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(f9963v, this, this, list));
        this.f9966s = list;
    }
}
