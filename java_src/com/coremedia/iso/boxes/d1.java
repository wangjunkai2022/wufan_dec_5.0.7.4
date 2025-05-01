package com.coremedia.iso.boxes;

import java.lang.ref.SoftReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import org.aspectj.lang.c;
/* compiled from: TimeToSampleBox.java */
/* loaded from: classes2.dex */
public class d1 extends com.googlecode.mp4parser.c {

    /* renamed from: t  reason: collision with root package name */
    public static final String f9566t = "stts";

    /* renamed from: u  reason: collision with root package name */
    static Map<List<a>, SoftReference<long[]>> f9567u;

    /* renamed from: v  reason: collision with root package name */
    static final /* synthetic */ boolean f9568v = false;

    /* renamed from: w  reason: collision with root package name */
    private static final /* synthetic */ c.b f9569w = null;

    /* renamed from: x  reason: collision with root package name */
    private static final /* synthetic */ c.b f9570x = null;

    /* renamed from: y  reason: collision with root package name */
    private static final /* synthetic */ c.b f9571y = null;

    /* renamed from: s  reason: collision with root package name */
    List<a> f9572s;

    /* compiled from: TimeToSampleBox.java */
    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        long f9573a;

        /* renamed from: b  reason: collision with root package name */
        long f9574b;

        public a(long j4, long j5) {
            this.f9573a = j4;
            this.f9574b = j5;
        }

        public long a() {
            return this.f9573a;
        }

        public long b() {
            return this.f9574b;
        }

        public void c(long j4) {
            this.f9573a = j4;
        }

        public void d(long j4) {
            this.f9574b = j4;
        }

        public String toString() {
            return "Entry{count=" + this.f9573a + ", delta=" + this.f9574b + '}';
        }
    }

    static {
        s();
        f9567u = new WeakHashMap();
    }

    public d1() {
        super(f9566t);
        this.f9572s = Collections.emptyList();
    }

    private static /* synthetic */ void s() {
        org.aspectj.runtime.reflect.e eVar = new org.aspectj.runtime.reflect.e("TimeToSampleBox.java", d1.class);
        f9569w = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getEntries", "com.coremedia.iso.boxes.TimeToSampleBox", "", "", "", "java.util.List"), 79);
        f9570x = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setEntries", "com.coremedia.iso.boxes.TimeToSampleBox", "java.util.List", "entries", "", "void"), 83);
        f9571y = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "toString", "com.coremedia.iso.boxes.TimeToSampleBox", "", "", "", "java.lang.String"), 87);
    }

    public static synchronized long[] v(List<a> list) {
        long[] jArr;
        synchronized (d1.class) {
            SoftReference<long[]> softReference = f9567u.get(list);
            if (softReference == null || (jArr = softReference.get()) == null) {
                long j4 = 0;
                for (a aVar : list) {
                    j4 += aVar.a();
                }
                long[] jArr2 = new long[(int) j4];
                int i4 = 0;
                for (a aVar2 : list) {
                    int i5 = 0;
                    while (i5 < aVar2.a()) {
                        jArr2[i4] = aVar2.b();
                        i5++;
                        i4++;
                    }
                }
                f9567u.put(list, new SoftReference<>(jArr2));
                return jArr2;
            }
            return jArr;
        }
    }

    @Override // com.googlecode.mp4parser.a
    public void b(ByteBuffer byteBuffer) {
        t(byteBuffer);
        int a5 = com.googlecode.mp4parser.util.c.a(com.coremedia.iso.g.l(byteBuffer));
        this.f9572s = new ArrayList(a5);
        for (int i4 = 0; i4 < a5; i4++) {
            this.f9572s.add(new a(com.coremedia.iso.g.l(byteBuffer), com.coremedia.iso.g.l(byteBuffer)));
        }
    }

    @Override // com.googlecode.mp4parser.a
    protected void c(ByteBuffer byteBuffer) {
        u(byteBuffer);
        com.coremedia.iso.i.i(byteBuffer, this.f9572s.size());
        for (a aVar : this.f9572s) {
            com.coremedia.iso.i.i(byteBuffer, aVar.a());
            com.coremedia.iso.i.i(byteBuffer, aVar.b());
        }
    }

    @Override // com.googlecode.mp4parser.a
    protected long e() {
        return (this.f9572s.size() * 8) + 8;
    }

    public String toString() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(f9571y, this, this));
        return "TimeToSampleBox[entryCount=" + this.f9572s.size() + "]";
    }

    public List<a> w() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(f9569w, this, this));
        return this.f9572s;
    }

    public void x(List<a> list) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(f9570x, this, this, list));
        this.f9572s = list;
    }
}
