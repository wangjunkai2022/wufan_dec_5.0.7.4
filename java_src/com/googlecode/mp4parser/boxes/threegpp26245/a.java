package com.googlecode.mp4parser.boxes.threegpp26245;

import com.coremedia.iso.g;
import com.coremedia.iso.i;
import com.coremedia.iso.l;
import com.googlecode.mp4parser.j;
import java.nio.ByteBuffer;
import java.util.LinkedList;
import java.util.List;
import org.aspectj.lang.c;
import org.aspectj.runtime.reflect.e;
/* compiled from: FontTableBox.java */
/* loaded from: classes3.dex */
public class a extends com.googlecode.mp4parser.a {

    /* renamed from: p  reason: collision with root package name */
    public static final String f14059p = "ftab";

    /* renamed from: q  reason: collision with root package name */
    private static final /* synthetic */ c.b f14060q = null;

    /* renamed from: r  reason: collision with root package name */
    private static final /* synthetic */ c.b f14061r = null;

    /* renamed from: o  reason: collision with root package name */
    List<C0303a> f14062o;

    /* compiled from: FontTableBox.java */
    /* renamed from: com.googlecode.mp4parser.boxes.threegpp26245.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static class C0303a {

        /* renamed from: a  reason: collision with root package name */
        int f14063a;

        /* renamed from: b  reason: collision with root package name */
        String f14064b;

        public C0303a() {
        }

        public void a(ByteBuffer byteBuffer) {
            i.f(byteBuffer, this.f14063a);
            i.m(byteBuffer, this.f14064b.length());
            byteBuffer.put(l.b(this.f14064b));
        }

        public int b() {
            return l.c(this.f14064b) + 3;
        }

        public void c(ByteBuffer byteBuffer) {
            this.f14063a = g.i(byteBuffer);
            this.f14064b = g.h(byteBuffer, g.p(byteBuffer));
        }

        public String toString() {
            return "FontRecord{fontId=" + this.f14063a + ", fontname='" + this.f14064b + "'}";
        }

        public C0303a(int i4, String str) {
            this.f14063a = i4;
            this.f14064b = str;
        }
    }

    static {
        s();
    }

    public a() {
        super(f14059p);
        this.f14062o = new LinkedList();
    }

    private static /* synthetic */ void s() {
        e eVar = new e("FontTableBox.java", a.class);
        f14060q = eVar.H(c.f72200a, eVar.E("1", "getEntries", "com.googlecode.mp4parser.boxes.threegpp26245.FontTableBox", "", "", "", "java.util.List"), 52);
        f14061r = eVar.H(c.f72200a, eVar.E("1", "setEntries", "com.googlecode.mp4parser.boxes.threegpp26245.FontTableBox", "java.util.List", "entries", "", "void"), 56);
    }

    @Override // com.googlecode.mp4parser.a
    public void b(ByteBuffer byteBuffer) {
        int i4 = g.i(byteBuffer);
        for (int i5 = 0; i5 < i4; i5++) {
            C0303a c0303a = new C0303a();
            c0303a.c(byteBuffer);
            this.f14062o.add(c0303a);
        }
    }

    @Override // com.googlecode.mp4parser.a
    protected void c(ByteBuffer byteBuffer) {
        i.f(byteBuffer, this.f14062o.size());
        for (C0303a c0303a : this.f14062o) {
            c0303a.a(byteBuffer);
        }
    }

    @Override // com.googlecode.mp4parser.a
    protected long e() {
        int i4 = 2;
        for (C0303a c0303a : this.f14062o) {
            i4 += c0303a.b();
        }
        return i4;
    }

    public List<C0303a> t() {
        j.b().c(e.v(f14060q, this, this));
        return this.f14062o;
    }

    public void u(List<C0303a> list) {
        j.b().c(e.w(f14061r, this, this, list));
        this.f14062o = list;
    }
}
