package com.coremedia.iso.boxes;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.aspectj.lang.c;
/* compiled from: CompositionTimeToSample.java */
/* loaded from: classes2.dex */
public class i extends com.googlecode.mp4parser.c {

    /* renamed from: t  reason: collision with root package name */
    public static final String f9718t = "ctts";

    /* renamed from: u  reason: collision with root package name */
    static final /* synthetic */ boolean f9719u = false;

    /* renamed from: v  reason: collision with root package name */
    private static final /* synthetic */ c.b f9720v = null;

    /* renamed from: w  reason: collision with root package name */
    private static final /* synthetic */ c.b f9721w = null;

    /* renamed from: s  reason: collision with root package name */
    List<a> f9722s;

    /* compiled from: CompositionTimeToSample.java */
    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        int f9723a;

        /* renamed from: b  reason: collision with root package name */
        int f9724b;

        public a(int i4, int i5) {
            this.f9723a = i4;
            this.f9724b = i5;
        }

        public int a() {
            return this.f9723a;
        }

        public int b() {
            return this.f9724b;
        }

        public void c(int i4) {
            this.f9723a = i4;
        }

        public void d(int i4) {
            this.f9724b = i4;
        }

        public String toString() {
            return "Entry{count=" + this.f9723a + ", offset=" + this.f9724b + '}';
        }
    }

    static {
        s();
    }

    public i() {
        super(f9718t);
        this.f9722s = Collections.emptyList();
    }

    private static /* synthetic */ void s() {
        org.aspectj.runtime.reflect.e eVar = new org.aspectj.runtime.reflect.e("CompositionTimeToSample.java", i.class);
        f9720v = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getEntries", "com.coremedia.iso.boxes.CompositionTimeToSample", "", "", "", "java.util.List"), 57);
        f9721w = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setEntries", "com.coremedia.iso.boxes.CompositionTimeToSample", "java.util.List", "entries", "", "void"), 61);
    }

    public static int[] v(List<a> list) {
        long j4 = 0;
        for (a aVar : list) {
            j4 += aVar.a();
        }
        int[] iArr = new int[(int) j4];
        int i4 = 0;
        for (a aVar2 : list) {
            int i5 = 0;
            while (i5 < aVar2.a()) {
                iArr[i4] = aVar2.b();
                i5++;
                i4++;
            }
        }
        return iArr;
    }

    @Override // com.googlecode.mp4parser.a
    public void b(ByteBuffer byteBuffer) {
        t(byteBuffer);
        int a5 = com.googlecode.mp4parser.util.c.a(com.coremedia.iso.g.l(byteBuffer));
        this.f9722s = new ArrayList(a5);
        for (int i4 = 0; i4 < a5; i4++) {
            this.f9722s.add(new a(com.googlecode.mp4parser.util.c.a(com.coremedia.iso.g.l(byteBuffer)), byteBuffer.getInt()));
        }
    }

    @Override // com.googlecode.mp4parser.a
    protected void c(ByteBuffer byteBuffer) {
        u(byteBuffer);
        com.coremedia.iso.i.i(byteBuffer, this.f9722s.size());
        for (a aVar : this.f9722s) {
            com.coremedia.iso.i.i(byteBuffer, aVar.a());
            byteBuffer.putInt(aVar.b());
        }
    }

    @Override // com.googlecode.mp4parser.a
    protected long e() {
        return (this.f9722s.size() * 8) + 8;
    }

    public List<a> w() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(f9720v, this, this));
        return this.f9722s;
    }

    public void x(List<a> list) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(f9721w, this, this, list));
        this.f9722s = list;
    }
}
