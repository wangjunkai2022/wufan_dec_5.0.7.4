package com.coremedia.iso.boxes;

import com.android.dx.io.Opcodes;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import org.aspectj.lang.c;
/* compiled from: SampleDependencyTypeBox.java */
/* loaded from: classes2.dex */
public class r0 extends com.googlecode.mp4parser.c {

    /* renamed from: t  reason: collision with root package name */
    public static final String f9852t = "sdtp";

    /* renamed from: u  reason: collision with root package name */
    private static final /* synthetic */ c.b f9853u = null;

    /* renamed from: v  reason: collision with root package name */
    private static final /* synthetic */ c.b f9854v = null;

    /* renamed from: w  reason: collision with root package name */
    private static final /* synthetic */ c.b f9855w = null;

    /* renamed from: s  reason: collision with root package name */
    private List<a> f9856s;

    /* compiled from: SampleDependencyTypeBox.java */
    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private int f9857a;

        public a(int i4) {
            this.f9857a = i4;
        }

        public int b() {
            return (this.f9857a >> 6) & 3;
        }

        public int c() {
            return (this.f9857a >> 4) & 3;
        }

        public int d() {
            return this.f9857a & 3;
        }

        public int e() {
            return (this.f9857a >> 2) & 3;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && getClass() == obj.getClass() && this.f9857a == ((a) obj).f9857a;
        }

        public void f(int i4) {
            this.f9857a = ((i4 & 3) << 6) | (this.f9857a & 63);
        }

        public void g(int i4) {
            this.f9857a = ((i4 & 3) << 4) | (this.f9857a & 207);
        }

        public void h(int i4) {
            this.f9857a = (i4 & 3) | (this.f9857a & Opcodes.INVOKE_CUSTOM);
        }

        public int hashCode() {
            return this.f9857a;
        }

        public void i(int i4) {
            this.f9857a = ((i4 & 3) << 2) | (this.f9857a & 243);
        }

        public String toString() {
            return "Entry{reserved=" + b() + ", sampleDependsOn=" + c() + ", sampleIsDependentOn=" + e() + ", sampleHasRedundancy=" + d() + '}';
        }
    }

    static {
        s();
    }

    public r0() {
        super(f9852t);
        this.f9856s = new ArrayList();
    }

    private static /* synthetic */ void s() {
        org.aspectj.runtime.reflect.e eVar = new org.aspectj.runtime.reflect.e("SampleDependencyTypeBox.java", r0.class);
        f9853u = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getEntries", "com.coremedia.iso.boxes.SampleDependencyTypeBox", "", "", "", "java.util.List"), 139);
        f9854v = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setEntries", "com.coremedia.iso.boxes.SampleDependencyTypeBox", "java.util.List", "entries", "", "void"), 143);
        f9855w = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "toString", "com.coremedia.iso.boxes.SampleDependencyTypeBox", "", "", "", "java.lang.String"), 148);
    }

    @Override // com.googlecode.mp4parser.a
    public void b(ByteBuffer byteBuffer) {
        t(byteBuffer);
        while (byteBuffer.remaining() > 0) {
            this.f9856s.add(new a(com.coremedia.iso.g.p(byteBuffer)));
        }
    }

    @Override // com.googlecode.mp4parser.a
    protected void c(ByteBuffer byteBuffer) {
        u(byteBuffer);
        for (a aVar : this.f9856s) {
            com.coremedia.iso.i.m(byteBuffer, aVar.f9857a);
        }
    }

    @Override // com.googlecode.mp4parser.a
    protected long e() {
        return this.f9856s.size() + 4;
    }

    public String toString() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(f9855w, this, this));
        return "SampleDependencyTypeBox{entries=" + this.f9856s + '}';
    }

    public List<a> v() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(f9853u, this, this));
        return this.f9856s;
    }

    public void w(List<a> list) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(f9854v, this, this, list));
        this.f9856s = list;
    }
}
