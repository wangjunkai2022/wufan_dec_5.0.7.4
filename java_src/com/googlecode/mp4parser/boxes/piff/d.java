package com.googlecode.mp4parser.boxes.piff;

import com.coremedia.iso.boxes.k1;
import com.coremedia.iso.g;
import com.coremedia.iso.i;
import com.googlecode.mp4parser.j;
import com.swift.sandhook.annotation.MethodReflectParams;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import org.aspectj.lang.c;
/* compiled from: TfrfBox.java */
/* loaded from: classes3.dex */
public class d extends com.googlecode.mp4parser.c {

    /* renamed from: t  reason: collision with root package name */
    private static final /* synthetic */ c.b f14026t = null;

    /* renamed from: u  reason: collision with root package name */
    private static final /* synthetic */ c.b f14027u = null;

    /* renamed from: v  reason: collision with root package name */
    private static final /* synthetic */ c.b f14028v = null;

    /* renamed from: s  reason: collision with root package name */
    public List<a> f14029s;

    /* compiled from: TfrfBox.java */
    /* loaded from: classes3.dex */
    public class a {

        /* renamed from: a  reason: collision with root package name */
        long f14030a;

        /* renamed from: b  reason: collision with root package name */
        long f14031b;

        public a() {
        }

        public long a() {
            return this.f14031b;
        }

        public long b() {
            return this.f14030a;
        }

        public String toString() {
            return "Entry{fragmentAbsoluteTime=" + this.f14030a + ", fragmentAbsoluteDuration=" + this.f14031b + '}';
        }
    }

    static {
        s();
    }

    public d() {
        super(k1.f9761p);
        this.f14029s = new ArrayList();
    }

    private static /* synthetic */ void s() {
        org.aspectj.runtime.reflect.e eVar = new org.aspectj.runtime.reflect.e("TfrfBox.java", d.class);
        f14026t = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getFragmentCount", "com.googlecode.mp4parser.boxes.piff.TfrfBox", "", "", "", MethodReflectParams.LONG), 91);
        f14027u = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getEntries", "com.googlecode.mp4parser.boxes.piff.TfrfBox", "", "", "", "java.util.List"), 95);
        f14028v = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "toString", "com.googlecode.mp4parser.boxes.piff.TfrfBox", "", "", "", "java.lang.String"), 100);
    }

    @Override // com.googlecode.mp4parser.a
    public void b(ByteBuffer byteBuffer) {
        t(byteBuffer);
        int p4 = g.p(byteBuffer);
        for (int i4 = 0; i4 < p4; i4++) {
            a aVar = new a();
            if (getVersion() == 1) {
                aVar.f14030a = g.o(byteBuffer);
                aVar.f14031b = g.o(byteBuffer);
            } else {
                aVar.f14030a = g.l(byteBuffer);
                aVar.f14031b = g.l(byteBuffer);
            }
            this.f14029s.add(aVar);
        }
    }

    @Override // com.googlecode.mp4parser.a
    protected void c(ByteBuffer byteBuffer) {
        u(byteBuffer);
        i.m(byteBuffer, this.f14029s.size());
        for (a aVar : this.f14029s) {
            if (getVersion() == 1) {
                i.l(byteBuffer, aVar.f14030a);
                i.l(byteBuffer, aVar.f14031b);
            } else {
                i.i(byteBuffer, aVar.f14030a);
                i.i(byteBuffer, aVar.f14031b);
            }
        }
    }

    @Override // com.googlecode.mp4parser.a
    protected long e() {
        return (this.f14029s.size() * (getVersion() == 1 ? 16 : 8)) + 5;
    }

    @Override // com.googlecode.mp4parser.a
    public byte[] i() {
        return new byte[]{-44, Byte.MIN_VALUE, 126, -14, -54, 57, 70, -107, -114, 84, 38, -53, -98, 70, -89, -97};
    }

    public String toString() {
        j.b().c(org.aspectj.runtime.reflect.e.v(f14028v, this, this));
        return "TfrfBox{entries=" + this.f14029s + '}';
    }

    public List<a> v() {
        j.b().c(org.aspectj.runtime.reflect.e.v(f14027u, this, this));
        return this.f14029s;
    }

    public long w() {
        j.b().c(org.aspectj.runtime.reflect.e.v(f14026t, this, this));
        return this.f14029s.size();
    }
}
