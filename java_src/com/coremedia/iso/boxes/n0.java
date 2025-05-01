package com.coremedia.iso.boxes;

import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import org.aspectj.lang.c;
/* compiled from: ProgressiveDownloadInformationBox.java */
/* loaded from: classes2.dex */
public class n0 extends com.googlecode.mp4parser.c {

    /* renamed from: t  reason: collision with root package name */
    public static final String f9806t = "pdin";

    /* renamed from: u  reason: collision with root package name */
    private static final /* synthetic */ c.b f9807u = null;

    /* renamed from: v  reason: collision with root package name */
    private static final /* synthetic */ c.b f9808v = null;

    /* renamed from: w  reason: collision with root package name */
    private static final /* synthetic */ c.b f9809w = null;

    /* renamed from: s  reason: collision with root package name */
    List<a> f9810s;

    /* compiled from: ProgressiveDownloadInformationBox.java */
    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        long f9811a;

        /* renamed from: b  reason: collision with root package name */
        long f9812b;

        public a(long j4, long j5) {
            this.f9811a = j4;
            this.f9812b = j5;
        }

        public long a() {
            return this.f9812b;
        }

        public long b() {
            return this.f9811a;
        }

        public void c(long j4) {
            this.f9812b = j4;
        }

        public void d(long j4) {
            this.f9811a = j4;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f9812b == aVar.f9812b && this.f9811a == aVar.f9811a;
        }

        public int hashCode() {
            long j4 = this.f9811a;
            long j5 = this.f9812b;
            return (((int) (j4 ^ (j4 >>> 32))) * 31) + ((int) (j5 ^ (j5 >>> 32)));
        }

        public String toString() {
            return "Entry{rate=" + this.f9811a + ", initialDelay=" + this.f9812b + '}';
        }
    }

    static {
        s();
    }

    public n0() {
        super(f9806t);
        this.f9810s = Collections.emptyList();
    }

    private static /* synthetic */ void s() {
        org.aspectj.runtime.reflect.e eVar = new org.aspectj.runtime.reflect.e("ProgressiveDownloadInformationBox.java", n0.class);
        f9807u = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getEntries", "com.coremedia.iso.boxes.ProgressiveDownloadInformationBox", "", "", "", "java.util.List"), 38);
        f9808v = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setEntries", "com.coremedia.iso.boxes.ProgressiveDownloadInformationBox", "java.util.List", "entries", "", "void"), 42);
        f9809w = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "toString", "com.coremedia.iso.boxes.ProgressiveDownloadInformationBox", "", "", "", "java.lang.String"), 112);
    }

    @Override // com.googlecode.mp4parser.a
    public void b(ByteBuffer byteBuffer) {
        t(byteBuffer);
        this.f9810s = new LinkedList();
        while (byteBuffer.remaining() >= 8) {
            this.f9810s.add(new a(com.coremedia.iso.g.l(byteBuffer), com.coremedia.iso.g.l(byteBuffer)));
        }
    }

    @Override // com.googlecode.mp4parser.a
    protected void c(ByteBuffer byteBuffer) {
        u(byteBuffer);
        for (a aVar : this.f9810s) {
            com.coremedia.iso.i.i(byteBuffer, aVar.b());
            com.coremedia.iso.i.i(byteBuffer, aVar.a());
        }
    }

    @Override // com.googlecode.mp4parser.a
    protected long e() {
        return (this.f9810s.size() * 8) + 4;
    }

    public String toString() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(f9809w, this, this));
        return "ProgressiveDownloadInfoBox{entries=" + this.f9810s + '}';
    }

    public List<a> v() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(f9807u, this, this));
        return this.f9810s;
    }

    public void w(List<a> list) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(f9808v, this, this, list));
        this.f9810s = list;
    }
}
