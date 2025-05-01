package com.coremedia.iso.boxes.dece;

import com.coremedia.iso.g;
import com.coremedia.iso.i;
import com.googlecode.mp4parser.c;
import com.googlecode.mp4parser.j;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import org.aspectj.lang.c;
import org.aspectj.runtime.reflect.e;
/* compiled from: TrickPlayBox.java */
/* loaded from: classes2.dex */
public class a extends c {

    /* renamed from: t  reason: collision with root package name */
    public static final String f9575t = "trik";

    /* renamed from: u  reason: collision with root package name */
    private static final /* synthetic */ c.b f9576u = null;

    /* renamed from: v  reason: collision with root package name */
    private static final /* synthetic */ c.b f9577v = null;

    /* renamed from: w  reason: collision with root package name */
    private static final /* synthetic */ c.b f9578w = null;

    /* renamed from: s  reason: collision with root package name */
    private List<C0242a> f9579s;

    /* compiled from: TrickPlayBox.java */
    /* renamed from: com.coremedia.iso.boxes.dece.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0242a {

        /* renamed from: a  reason: collision with root package name */
        private int f9580a;

        public C0242a() {
        }

        public int b() {
            return this.f9580a & 63;
        }

        public int c() {
            return (this.f9580a >> 6) & 3;
        }

        public void d(int i4) {
            this.f9580a = (i4 & 63) | this.f9580a;
        }

        public void e(int i4) {
            int i5 = this.f9580a & 31;
            this.f9580a = i5;
            this.f9580a = ((i4 & 3) << 6) | i5;
        }

        public String toString() {
            return "Entry{picType=" + c() + ",dependencyLevel=" + b() + '}';
        }

        public C0242a(int i4) {
            this.f9580a = i4;
        }
    }

    static {
        s();
    }

    public a() {
        super(f9575t);
        this.f9579s = new ArrayList();
    }

    private static /* synthetic */ void s() {
        e eVar = new e("TrickPlayBox.java", a.class);
        f9576u = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setEntries", "com.coremedia.iso.boxes.dece.TrickPlayBox", "java.util.List", "entries", "", "void"), 32);
        f9577v = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getEntries", "com.coremedia.iso.boxes.dece.TrickPlayBox", "", "", "", "java.util.List"), 36);
        f9578w = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "toString", "com.coremedia.iso.boxes.dece.TrickPlayBox", "", "", "", "java.lang.String"), 103);
    }

    @Override // com.googlecode.mp4parser.a
    public void b(ByteBuffer byteBuffer) {
        t(byteBuffer);
        while (byteBuffer.remaining() > 0) {
            this.f9579s.add(new C0242a(g.p(byteBuffer)));
        }
    }

    @Override // com.googlecode.mp4parser.a
    protected void c(ByteBuffer byteBuffer) {
        u(byteBuffer);
        for (C0242a c0242a : this.f9579s) {
            i.m(byteBuffer, c0242a.f9580a);
        }
    }

    @Override // com.googlecode.mp4parser.a
    protected long e() {
        return this.f9579s.size() + 4;
    }

    public String toString() {
        j.b().c(e.v(f9578w, this, this));
        return "TrickPlayBox{entries=" + this.f9579s + '}';
    }

    public List<C0242a> v() {
        j.b().c(e.v(f9577v, this, this));
        return this.f9579s;
    }

    public void w(List<C0242a> list) {
        j.b().c(e.w(f9576u, this, this, list));
        this.f9579s = list;
    }
}
