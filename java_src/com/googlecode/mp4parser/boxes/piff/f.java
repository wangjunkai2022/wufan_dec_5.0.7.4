package com.googlecode.mp4parser.boxes.piff;

import com.coremedia.iso.boxes.k1;
import com.coremedia.iso.g;
import com.coremedia.iso.i;
import com.googlecode.mp4parser.j;
import com.googlecode.mp4parser.util.o;
import io.netty.handler.codec.memcache.binary.BinaryMemcacheOpcodes;
import java.nio.ByteBuffer;
import java.util.UUID;
import org.aspectj.lang.c;
/* compiled from: UuidBasedProtectionSystemSpecificHeaderBox.java */
/* loaded from: classes3.dex */
public class f extends com.googlecode.mp4parser.c {
    private static final /* synthetic */ c.b A = null;
    private static final /* synthetic */ c.b B = null;

    /* renamed from: u  reason: collision with root package name */
    public static byte[] f14037u;

    /* renamed from: v  reason: collision with root package name */
    private static final /* synthetic */ c.b f14038v = null;

    /* renamed from: w  reason: collision with root package name */
    private static final /* synthetic */ c.b f14039w = null;

    /* renamed from: x  reason: collision with root package name */
    private static final /* synthetic */ c.b f14040x = null;

    /* renamed from: y  reason: collision with root package name */
    private static final /* synthetic */ c.b f14041y = null;

    /* renamed from: z  reason: collision with root package name */
    private static final /* synthetic */ c.b f14042z = null;

    /* renamed from: s  reason: collision with root package name */
    UUID f14043s;

    /* renamed from: t  reason: collision with root package name */
    c f14044t;

    static {
        s();
        f14037u = new byte[]{-48, -118, 79, BinaryMemcacheOpcodes.FLUSHQ, 16, -13, 74, -126, -74, -56, 50, -40, -85, -95, -125, -45};
    }

    public f() {
        super(k1.f9761p, f14037u);
    }

    private static /* synthetic */ void s() {
        org.aspectj.runtime.reflect.e eVar = new org.aspectj.runtime.reflect.e("UuidBasedProtectionSystemSpecificHeaderBox.java", f.class);
        f14038v = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getSystemId", "com.googlecode.mp4parser.boxes.piff.UuidBasedProtectionSystemSpecificHeaderBox", "", "", "", "java.util.UUID"), 67);
        f14039w = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setSystemId", "com.googlecode.mp4parser.boxes.piff.UuidBasedProtectionSystemSpecificHeaderBox", "java.util.UUID", "systemId", "", "void"), 71);
        f14040x = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getSystemIdString", "com.googlecode.mp4parser.boxes.piff.UuidBasedProtectionSystemSpecificHeaderBox", "", "", "", "java.lang.String"), 75);
        f14041y = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getProtectionSpecificHeader", "com.googlecode.mp4parser.boxes.piff.UuidBasedProtectionSystemSpecificHeaderBox", "", "", "", "com.googlecode.mp4parser.boxes.piff.ProtectionSpecificHeader"), 79);
        f14042z = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getProtectionSpecificHeaderString", "com.googlecode.mp4parser.boxes.piff.UuidBasedProtectionSystemSpecificHeaderBox", "", "", "", "java.lang.String"), 83);
        A = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setProtectionSpecificHeader", "com.googlecode.mp4parser.boxes.piff.UuidBasedProtectionSystemSpecificHeaderBox", "com.googlecode.mp4parser.boxes.piff.ProtectionSpecificHeader", "protectionSpecificHeader", "", "void"), 87);
        B = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "toString", "com.googlecode.mp4parser.boxes.piff.UuidBasedProtectionSystemSpecificHeaderBox", "", "", "", "java.lang.String"), 92);
    }

    public void A(UUID uuid) {
        j.b().c(org.aspectj.runtime.reflect.e.w(f14039w, this, this, uuid));
        this.f14043s = uuid;
    }

    @Override // com.googlecode.mp4parser.a
    protected void b(ByteBuffer byteBuffer) {
        t(byteBuffer);
        byte[] bArr = new byte[16];
        byteBuffer.get(bArr);
        this.f14043s = o.a(bArr);
        com.googlecode.mp4parser.util.c.a(g.l(byteBuffer));
        this.f14044t = c.a(this.f14043s, byteBuffer);
    }

    @Override // com.googlecode.mp4parser.a
    protected void c(ByteBuffer byteBuffer) {
        u(byteBuffer);
        i.l(byteBuffer, this.f14043s.getMostSignificantBits());
        i.l(byteBuffer, this.f14043s.getLeastSignificantBits());
        ByteBuffer b5 = this.f14044t.b();
        b5.rewind();
        i.i(byteBuffer, b5.limit());
        byteBuffer.put(b5);
    }

    @Override // com.googlecode.mp4parser.a
    protected long e() {
        return this.f14044t.b().limit() + 24;
    }

    @Override // com.googlecode.mp4parser.a
    public byte[] i() {
        return f14037u;
    }

    public String toString() {
        j.b().c(org.aspectj.runtime.reflect.e.v(B, this, this));
        return "UuidBasedProtectionSystemSpecificHeaderBox{systemId=" + this.f14043s.toString() + ", dataSize=" + this.f14044t.b().limit() + '}';
    }

    public c v() {
        j.b().c(org.aspectj.runtime.reflect.e.v(f14041y, this, this));
        return this.f14044t;
    }

    public String w() {
        j.b().c(org.aspectj.runtime.reflect.e.v(f14042z, this, this));
        return this.f14044t.toString();
    }

    public UUID x() {
        j.b().c(org.aspectj.runtime.reflect.e.v(f14038v, this, this));
        return this.f14043s;
    }

    public String y() {
        j.b().c(org.aspectj.runtime.reflect.e.v(f14040x, this, this));
        return this.f14043s.toString();
    }

    public void z(c cVar) {
        j.b().c(org.aspectj.runtime.reflect.e.w(A, this, this, cVar));
        this.f14044t = cVar;
    }
}
