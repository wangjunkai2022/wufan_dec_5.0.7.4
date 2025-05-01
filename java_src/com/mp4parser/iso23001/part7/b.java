package com.mp4parser.iso23001.part7;

import com.coremedia.iso.g;
import com.coremedia.iso.i;
import com.googlecode.mp4parser.j;
import com.googlecode.mp4parser.util.o;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.aspectj.lang.c;
import org.aspectj.runtime.reflect.e;
/* compiled from: ProtectionSystemSpecificHeaderBox.java */
/* loaded from: classes5.dex */
public class b extends com.googlecode.mp4parser.c {
    private static final /* synthetic */ c.b A = null;
    private static final /* synthetic */ c.b B = null;
    private static final /* synthetic */ c.b C = null;
    private static final /* synthetic */ c.b D = null;
    private static final /* synthetic */ c.b E = null;

    /* renamed from: v  reason: collision with root package name */
    public static final String f57293v = "pssh";

    /* renamed from: w  reason: collision with root package name */
    public static byte[] f57294w;

    /* renamed from: x  reason: collision with root package name */
    public static byte[] f57295x;

    /* renamed from: y  reason: collision with root package name */
    static final /* synthetic */ boolean f57296y = false;

    /* renamed from: z  reason: collision with root package name */
    private static final /* synthetic */ c.b f57297z = null;

    /* renamed from: s  reason: collision with root package name */
    byte[] f57298s;

    /* renamed from: t  reason: collision with root package name */
    byte[] f57299t;

    /* renamed from: u  reason: collision with root package name */
    List<UUID> f57300u;

    static {
        s();
        f57294w = o.b(UUID.fromString("A2B55680-6F43-11E0-9A3F-0002A5D5C51B"));
        f57295x = o.b(UUID.fromString("9A04F079-9840-4286-AB92-E65BE0885F95"));
    }

    public b() {
        super(f57293v);
        this.f57300u = new ArrayList();
    }

    private static /* synthetic */ void s() {
        e eVar = new e("ProtectionSystemSpecificHeaderBox.java", b.class);
        f57297z = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getKeyIds", "com.mp4parser.iso23001.part7.ProtectionSystemSpecificHeaderBox", "", "", "", "java.util.List"), 43);
        A = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setKeyIds", "com.mp4parser.iso23001.part7.ProtectionSystemSpecificHeaderBox", "java.util.List", "keyIds", "", "void"), 47);
        B = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getSystemId", "com.mp4parser.iso23001.part7.ProtectionSystemSpecificHeaderBox", "", "", "", "[B"), 54);
        C = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setSystemId", "com.mp4parser.iso23001.part7.ProtectionSystemSpecificHeaderBox", "[B", "systemId", "", "void"), 58);
        D = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getContent", "com.mp4parser.iso23001.part7.ProtectionSystemSpecificHeaderBox", "", "", "", "[B"), 63);
        E = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setContent", "com.mp4parser.iso23001.part7.ProtectionSystemSpecificHeaderBox", "[B", "content", "", "void"), 67);
    }

    public void A(byte[] bArr) {
        j.b().c(e.w(C, this, this, bArr));
        this.f57299t = bArr;
    }

    @Override // com.googlecode.mp4parser.a
    protected void b(ByteBuffer byteBuffer) {
        t(byteBuffer);
        byte[] bArr = new byte[16];
        this.f57299t = bArr;
        byteBuffer.get(bArr);
        if (getVersion() > 0) {
            int a5 = com.googlecode.mp4parser.util.c.a(g.l(byteBuffer));
            while (true) {
                int i4 = a5 - 1;
                if (a5 <= 0) {
                    break;
                }
                byte[] bArr2 = new byte[16];
                byteBuffer.get(bArr2);
                this.f57300u.add(o.a(bArr2));
                a5 = i4;
            }
        }
        g.l(byteBuffer);
        byte[] bArr3 = new byte[byteBuffer.remaining()];
        this.f57298s = bArr3;
        byteBuffer.get(bArr3);
    }

    @Override // com.googlecode.mp4parser.a
    protected void c(ByteBuffer byteBuffer) {
        u(byteBuffer);
        byteBuffer.put(this.f57299t, 0, 16);
        if (getVersion() > 0) {
            i.i(byteBuffer, this.f57300u.size());
            for (UUID uuid : this.f57300u) {
                byteBuffer.put(o.b(uuid));
            }
        }
        i.i(byteBuffer, this.f57298s.length);
        byteBuffer.put(this.f57298s);
    }

    @Override // com.googlecode.mp4parser.a
    protected long e() {
        long length = this.f57298s.length + 24;
        return getVersion() > 0 ? length + 4 + (this.f57300u.size() * 16) : length;
    }

    public byte[] v() {
        j.b().c(e.v(D, this, this));
        return this.f57298s;
    }

    public List<UUID> w() {
        j.b().c(e.v(f57297z, this, this));
        return this.f57300u;
    }

    public byte[] x() {
        j.b().c(e.v(B, this, this));
        return this.f57299t;
    }

    public void y(byte[] bArr) {
        j.b().c(e.w(E, this, this, bArr));
        this.f57298s = bArr;
    }

    public void z(List<UUID> list) {
        j.b().c(e.w(A, this, this, list));
        this.f57300u = list;
    }
}
