package com.umeng.analytics.pro;

import io.netty.handler.codec.http2.Http2CodecUtil;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
/* compiled from: TBinaryProtocol.java */
/* loaded from: classes6.dex */
public class cn extends cu {

    /* renamed from: a  reason: collision with root package name */
    protected static final int f63579a = -65536;

    /* renamed from: b  reason: collision with root package name */
    protected static final int f63580b = -2147418112;

    /* renamed from: h  reason: collision with root package name */
    private static final cz f63581h = new cz();

    /* renamed from: c  reason: collision with root package name */
    protected boolean f63582c;

    /* renamed from: d  reason: collision with root package name */
    protected boolean f63583d;

    /* renamed from: e  reason: collision with root package name */
    protected int f63584e;

    /* renamed from: f  reason: collision with root package name */
    protected boolean f63585f;

    /* renamed from: i  reason: collision with root package name */
    private byte[] f63586i;

    /* renamed from: j  reason: collision with root package name */
    private byte[] f63587j;

    /* renamed from: k  reason: collision with root package name */
    private byte[] f63588k;

    /* renamed from: l  reason: collision with root package name */
    private byte[] f63589l;

    /* renamed from: m  reason: collision with root package name */
    private byte[] f63590m;

    /* renamed from: n  reason: collision with root package name */
    private byte[] f63591n;

    /* renamed from: o  reason: collision with root package name */
    private byte[] f63592o;

    /* renamed from: p  reason: collision with root package name */
    private byte[] f63593p;

    /* compiled from: TBinaryProtocol.java */
    /* loaded from: classes6.dex */
    public static class a implements cw {

        /* renamed from: a  reason: collision with root package name */
        protected boolean f63594a;

        /* renamed from: b  reason: collision with root package name */
        protected boolean f63595b;

        /* renamed from: c  reason: collision with root package name */
        protected int f63596c;

        public a() {
            this(false, true);
        }

        @Override // com.umeng.analytics.pro.cw
        public cu a(di diVar) {
            cn cnVar = new cn(diVar, this.f63594a, this.f63595b);
            int i4 = this.f63596c;
            if (i4 != 0) {
                cnVar.c(i4);
            }
            return cnVar;
        }

        public a(boolean z4, boolean z5) {
            this(z4, z5, 0);
        }

        public a(boolean z4, boolean z5, int i4) {
            this.f63594a = false;
            this.f63595b = true;
            this.f63594a = z4;
            this.f63595b = z5;
            this.f63596c = i4;
        }
    }

    public cn(di diVar) {
        this(diVar, false, true);
    }

    @Override // com.umeng.analytics.pro.cu
    public ByteBuffer A() throws cb {
        int w4 = w();
        d(w4);
        if (this.f63642g.h() >= w4) {
            ByteBuffer wrap = ByteBuffer.wrap(this.f63642g.f(), this.f63642g.g(), w4);
            this.f63642g.a(w4);
            return wrap;
        }
        byte[] bArr = new byte[w4];
        this.f63642g.d(bArr, 0, w4);
        return ByteBuffer.wrap(bArr);
    }

    @Override // com.umeng.analytics.pro.cu
    public void a() {
    }

    @Override // com.umeng.analytics.pro.cu
    public void a(cs csVar) throws cb {
        if (this.f63583d) {
            a(f63580b | csVar.f63636b);
            a(csVar.f63635a);
            a(csVar.f63637c);
            return;
        }
        a(csVar.f63635a);
        a(csVar.f63636b);
        a(csVar.f63637c);
    }

    @Override // com.umeng.analytics.pro.cu
    public void a(cz czVar) {
    }

    public String b(int i4) throws cb {
        try {
            d(i4);
            byte[] bArr = new byte[i4];
            this.f63642g.d(bArr, 0, i4);
            return new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException unused) {
            throw new cb("JVM DOES NOT SUPPORT UTF-8");
        }
    }

    @Override // com.umeng.analytics.pro.cu
    public void b() {
    }

    @Override // com.umeng.analytics.pro.cu
    public void c() {
    }

    public void c(int i4) {
        this.f63584e = i4;
        this.f63585f = true;
    }

    @Override // com.umeng.analytics.pro.cu
    public void d() throws cb {
        a((byte) 0);
    }

    @Override // com.umeng.analytics.pro.cu
    public void e() {
    }

    @Override // com.umeng.analytics.pro.cu
    public void f() {
    }

    @Override // com.umeng.analytics.pro.cu
    public void g() {
    }

    @Override // com.umeng.analytics.pro.cu
    public cs h() throws cb {
        int w4 = w();
        if (w4 < 0) {
            if (((-65536) & w4) == f63580b) {
                return new cs(z(), (byte) (w4 & 255), w());
            }
            throw new cv(4, "Bad version in readMessageBegin");
        } else if (!this.f63582c) {
            return new cs(b(w4), u(), w());
        } else {
            throw new cv(4, "Missing version in readMessageBegin, old client?");
        }
    }

    @Override // com.umeng.analytics.pro.cu
    public void i() {
    }

    @Override // com.umeng.analytics.pro.cu
    public cz j() {
        return f63581h;
    }

    @Override // com.umeng.analytics.pro.cu
    public void k() {
    }

    @Override // com.umeng.analytics.pro.cu
    public cp l() throws cb {
        byte u4 = u();
        return new cp("", u4, u4 == 0 ? (short) 0 : v());
    }

    @Override // com.umeng.analytics.pro.cu
    public void m() {
    }

    @Override // com.umeng.analytics.pro.cu
    public cr n() throws cb {
        return new cr(u(), u(), w());
    }

    @Override // com.umeng.analytics.pro.cu
    public void o() {
    }

    @Override // com.umeng.analytics.pro.cu
    public cq p() throws cb {
        return new cq(u(), w());
    }

    @Override // com.umeng.analytics.pro.cu
    public void q() {
    }

    @Override // com.umeng.analytics.pro.cu
    public cy r() throws cb {
        return new cy(u(), w());
    }

    @Override // com.umeng.analytics.pro.cu
    public void s() {
    }

    @Override // com.umeng.analytics.pro.cu
    public boolean t() throws cb {
        return u() == 1;
    }

    @Override // com.umeng.analytics.pro.cu
    public byte u() throws cb {
        if (this.f63642g.h() >= 1) {
            byte b5 = this.f63642g.f()[this.f63642g.g()];
            this.f63642g.a(1);
            return b5;
        }
        a(this.f63590m, 0, 1);
        return this.f63590m[0];
    }

    @Override // com.umeng.analytics.pro.cu
    public short v() throws cb {
        byte[] bArr = this.f63591n;
        int i4 = 0;
        if (this.f63642g.h() >= 2) {
            bArr = this.f63642g.f();
            i4 = this.f63642g.g();
            this.f63642g.a(2);
        } else {
            a(this.f63591n, 0, 2);
        }
        return (short) ((bArr[i4 + 1] & 255) | ((bArr[i4] & 255) << 8));
    }

    @Override // com.umeng.analytics.pro.cu
    public int w() throws cb {
        byte[] bArr = this.f63592o;
        int i4 = 0;
        if (this.f63642g.h() >= 4) {
            bArr = this.f63642g.f();
            i4 = this.f63642g.g();
            this.f63642g.a(4);
        } else {
            a(this.f63592o, 0, 4);
        }
        return (bArr[i4 + 3] & 255) | ((bArr[i4] & 255) << 24) | ((bArr[i4 + 1] & 255) << 16) | ((bArr[i4 + 2] & 255) << 8);
    }

    @Override // com.umeng.analytics.pro.cu
    public long x() throws cb {
        byte[] bArr = this.f63593p;
        int i4 = 0;
        if (this.f63642g.h() >= 8) {
            bArr = this.f63642g.f();
            i4 = this.f63642g.g();
            this.f63642g.a(8);
        } else {
            a(this.f63593p, 0, 8);
        }
        return (bArr[i4 + 7] & 255) | ((bArr[i4] & 255) << 56) | ((bArr[i4 + 1] & 255) << 48) | ((bArr[i4 + 2] & 255) << 40) | ((bArr[i4 + 3] & 255) << 32) | ((bArr[i4 + 4] & 255) << 24) | ((bArr[i4 + 5] & 255) << 16) | ((bArr[i4 + 6] & 255) << 8);
    }

    @Override // com.umeng.analytics.pro.cu
    public double y() throws cb {
        return Double.longBitsToDouble(x());
    }

    @Override // com.umeng.analytics.pro.cu
    public String z() throws cb {
        int w4 = w();
        if (this.f63642g.h() >= w4) {
            try {
                String str = new String(this.f63642g.f(), this.f63642g.g(), w4, "UTF-8");
                this.f63642g.a(w4);
                return str;
            } catch (UnsupportedEncodingException unused) {
                throw new cb("JVM DOES NOT SUPPORT UTF-8");
            }
        }
        return b(w4);
    }

    public cn(di diVar, boolean z4, boolean z5) {
        super(diVar);
        this.f63582c = false;
        this.f63583d = true;
        this.f63585f = false;
        this.f63586i = new byte[1];
        this.f63587j = new byte[2];
        this.f63588k = new byte[4];
        this.f63589l = new byte[8];
        this.f63590m = new byte[1];
        this.f63591n = new byte[2];
        this.f63592o = new byte[4];
        this.f63593p = new byte[8];
        this.f63582c = z4;
        this.f63583d = z5;
    }

    protected void d(int i4) throws cb {
        if (i4 >= 0) {
            if (this.f63585f) {
                int i5 = this.f63584e - i4;
                this.f63584e = i5;
                if (i5 >= 0) {
                    return;
                }
                throw new cv("Message length exceeded: " + i4);
            }
            return;
        }
        throw new cv("Negative length: " + i4);
    }

    @Override // com.umeng.analytics.pro.cu
    public void a(cp cpVar) throws cb {
        a(cpVar.f63628b);
        a(cpVar.f63629c);
    }

    @Override // com.umeng.analytics.pro.cu
    public void a(cr crVar) throws cb {
        a(crVar.f63632a);
        a(crVar.f63633b);
        a(crVar.f63634c);
    }

    @Override // com.umeng.analytics.pro.cu
    public void a(cq cqVar) throws cb {
        a(cqVar.f63630a);
        a(cqVar.f63631b);
    }

    @Override // com.umeng.analytics.pro.cu
    public void a(cy cyVar) throws cb {
        a(cyVar.f63652a);
        a(cyVar.f63653b);
    }

    @Override // com.umeng.analytics.pro.cu
    public void a(boolean z4) throws cb {
        a(z4 ? (byte) 1 : (byte) 0);
    }

    @Override // com.umeng.analytics.pro.cu
    public void a(byte b5) throws cb {
        byte[] bArr = this.f63586i;
        bArr[0] = b5;
        this.f63642g.b(bArr, 0, 1);
    }

    @Override // com.umeng.analytics.pro.cu
    public void a(short s4) throws cb {
        byte[] bArr = this.f63587j;
        bArr[0] = (byte) ((s4 >> 8) & 255);
        bArr[1] = (byte) (s4 & Http2CodecUtil.MAX_UNSIGNED_BYTE);
        this.f63642g.b(bArr, 0, 2);
    }

    @Override // com.umeng.analytics.pro.cu
    public void a(int i4) throws cb {
        byte[] bArr = this.f63588k;
        bArr[0] = (byte) ((i4 >> 24) & 255);
        bArr[1] = (byte) ((i4 >> 16) & 255);
        bArr[2] = (byte) ((i4 >> 8) & 255);
        bArr[3] = (byte) (i4 & 255);
        this.f63642g.b(bArr, 0, 4);
    }

    @Override // com.umeng.analytics.pro.cu
    public void a(long j4) throws cb {
        byte[] bArr = this.f63589l;
        bArr[0] = (byte) ((j4 >> 56) & 255);
        bArr[1] = (byte) ((j4 >> 48) & 255);
        bArr[2] = (byte) ((j4 >> 40) & 255);
        bArr[3] = (byte) ((j4 >> 32) & 255);
        bArr[4] = (byte) ((j4 >> 24) & 255);
        bArr[5] = (byte) ((j4 >> 16) & 255);
        bArr[6] = (byte) ((j4 >> 8) & 255);
        bArr[7] = (byte) (j4 & 255);
        this.f63642g.b(bArr, 0, 8);
    }

    @Override // com.umeng.analytics.pro.cu
    public void a(double d5) throws cb {
        a(Double.doubleToLongBits(d5));
    }

    @Override // com.umeng.analytics.pro.cu
    public void a(String str) throws cb {
        try {
            byte[] bytes = str.getBytes("UTF-8");
            a(bytes.length);
            this.f63642g.b(bytes, 0, bytes.length);
        } catch (UnsupportedEncodingException unused) {
            throw new cb("JVM DOES NOT SUPPORT UTF-8");
        }
    }

    @Override // com.umeng.analytics.pro.cu
    public void a(ByteBuffer byteBuffer) throws cb {
        int limit = byteBuffer.limit() - byteBuffer.position();
        a(limit);
        this.f63642g.b(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), limit);
    }

    private int a(byte[] bArr, int i4, int i5) throws cb {
        d(i5);
        return this.f63642g.d(bArr, i4, i5);
    }
}
