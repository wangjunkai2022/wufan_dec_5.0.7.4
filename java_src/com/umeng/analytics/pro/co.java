package com.umeng.analytics.pro;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.ByteCompanionObject;
/* compiled from: TCompactProtocol.java */
/* loaded from: classes6.dex */
public class co extends cu {

    /* renamed from: d  reason: collision with root package name */
    private static final cz f63597d = new cz("");

    /* renamed from: e  reason: collision with root package name */
    private static final cp f63598e = new cp("", (byte) 0, 0);

    /* renamed from: f  reason: collision with root package name */
    private static final byte[] f63599f;

    /* renamed from: h  reason: collision with root package name */
    private static final byte f63600h = -126;

    /* renamed from: i  reason: collision with root package name */
    private static final byte f63601i = 1;

    /* renamed from: j  reason: collision with root package name */
    private static final byte f63602j = 31;

    /* renamed from: k  reason: collision with root package name */
    private static final byte f63603k = -32;

    /* renamed from: l  reason: collision with root package name */
    private static final int f63604l = 5;

    /* renamed from: a  reason: collision with root package name */
    byte[] f63605a;

    /* renamed from: b  reason: collision with root package name */
    byte[] f63606b;

    /* renamed from: c  reason: collision with root package name */
    byte[] f63607c;

    /* renamed from: m  reason: collision with root package name */
    private bt f63608m;

    /* renamed from: n  reason: collision with root package name */
    private short f63609n;

    /* renamed from: o  reason: collision with root package name */
    private cp f63610o;

    /* renamed from: p  reason: collision with root package name */
    private Boolean f63611p;

    /* renamed from: q  reason: collision with root package name */
    private final long f63612q;

    /* renamed from: r  reason: collision with root package name */
    private byte[] f63613r;

    /* compiled from: TCompactProtocol.java */
    /* loaded from: classes6.dex */
    private static class b {

        /* renamed from: a  reason: collision with root package name */
        public static final byte f63615a = 1;

        /* renamed from: b  reason: collision with root package name */
        public static final byte f63616b = 2;

        /* renamed from: c  reason: collision with root package name */
        public static final byte f63617c = 3;

        /* renamed from: d  reason: collision with root package name */
        public static final byte f63618d = 4;

        /* renamed from: e  reason: collision with root package name */
        public static final byte f63619e = 5;

        /* renamed from: f  reason: collision with root package name */
        public static final byte f63620f = 6;

        /* renamed from: g  reason: collision with root package name */
        public static final byte f63621g = 7;

        /* renamed from: h  reason: collision with root package name */
        public static final byte f63622h = 8;

        /* renamed from: i  reason: collision with root package name */
        public static final byte f63623i = 9;

        /* renamed from: j  reason: collision with root package name */
        public static final byte f63624j = 10;

        /* renamed from: k  reason: collision with root package name */
        public static final byte f63625k = 11;

        /* renamed from: l  reason: collision with root package name */
        public static final byte f63626l = 12;

        private b() {
        }
    }

    static {
        f63599f = r0;
        byte[] bArr = {0, 0, 1, 3, 7, 0, 4, 0, 5, 0, 6, 8, 12, 11, 10, 9};
    }

    public co(di diVar, long j4) {
        super(diVar);
        this.f63608m = new bt(15);
        this.f63609n = (short) 0;
        this.f63610o = null;
        this.f63611p = null;
        this.f63605a = new byte[5];
        this.f63606b = new byte[10];
        this.f63613r = new byte[1];
        this.f63607c = new byte[1];
        this.f63612q = j4;
    }

    private int E() throws cb {
        int i4 = 0;
        if (this.f63642g.h() >= 5) {
            byte[] f5 = this.f63642g.f();
            int g4 = this.f63642g.g();
            int i5 = 0;
            int i6 = 0;
            while (true) {
                byte b5 = f5[g4 + i4];
                i5 |= (b5 & ByteCompanionObject.MAX_VALUE) << i6;
                if ((b5 & 128) != 128) {
                    this.f63642g.a(i4 + 1);
                    return i5;
                }
                i6 += 7;
                i4++;
            }
        } else {
            int i7 = 0;
            while (true) {
                byte u4 = u();
                i4 |= (u4 & ByteCompanionObject.MAX_VALUE) << i7;
                if ((u4 & 128) != 128) {
                    return i4;
                }
                i7 += 7;
            }
        }
    }

    private long F() throws cb {
        byte u4;
        byte b5;
        int i4 = 0;
        long j4 = 0;
        if (this.f63642g.h() >= 10) {
            byte[] f5 = this.f63642g.f();
            int g4 = this.f63642g.g();
            long j5 = 0;
            int i5 = 0;
            while (true) {
                j5 |= (b5 & ByteCompanionObject.MAX_VALUE) << i5;
                if ((f5[g4 + i4] & 128) != 128) {
                    this.f63642g.a(i4 + 1);
                    return j5;
                }
                i5 += 7;
                i4++;
            }
        } else {
            while (true) {
                j4 |= (u4 & ByteCompanionObject.MAX_VALUE) << i4;
                if ((u() & 128) != 128) {
                    return j4;
                }
                i4 += 7;
            }
        }
    }

    private int c(int i4) {
        return (i4 >> 31) ^ (i4 << 1);
    }

    private long c(long j4) {
        return (j4 >> 63) ^ (j4 << 1);
    }

    private boolean c(byte b5) {
        int i4 = b5 & 15;
        return i4 == 1 || i4 == 2;
    }

    private long d(long j4) {
        return (-(j4 & 1)) ^ (j4 >>> 1);
    }

    private byte[] e(int i4) throws cb {
        if (i4 == 0) {
            return new byte[0];
        }
        byte[] bArr = new byte[i4];
        this.f63642g.d(bArr, 0, i4);
        return bArr;
    }

    private void f(int i4) throws cv {
        if (i4 >= 0) {
            long j4 = this.f63612q;
            if (j4 == -1 || i4 <= j4) {
                return;
            }
            throw new cv("Length exceeded max allowed: " + i4);
        }
        throw new cv("Negative length: " + i4);
    }

    private int g(int i4) {
        return (-(i4 & 1)) ^ (i4 >>> 1);
    }

    @Override // com.umeng.analytics.pro.cu
    public ByteBuffer A() throws cb {
        int E = E();
        f(E);
        if (E == 0) {
            return ByteBuffer.wrap(new byte[0]);
        }
        byte[] bArr = new byte[E];
        this.f63642g.d(bArr, 0, E);
        return ByteBuffer.wrap(bArr);
    }

    @Override // com.umeng.analytics.pro.cu
    public void B() {
        this.f63608m.c();
        this.f63609n = (short) 0;
    }

    @Override // com.umeng.analytics.pro.cu
    public void a() throws cb {
    }

    @Override // com.umeng.analytics.pro.cu
    public void a(cs csVar) throws cb {
        b(f63600h);
        d(((csVar.f63636b << 5) & (-32)) | 1);
        b(csVar.f63637c);
        a(csVar.f63635a);
    }

    @Override // com.umeng.analytics.pro.cu
    public void b() throws cb {
        this.f63609n = this.f63608m.a();
    }

    @Override // com.umeng.analytics.pro.cu
    public void c() throws cb {
    }

    @Override // com.umeng.analytics.pro.cu
    public void d() throws cb {
        b((byte) 0);
    }

    @Override // com.umeng.analytics.pro.cu
    public void e() throws cb {
    }

    @Override // com.umeng.analytics.pro.cu
    public void f() throws cb {
    }

    @Override // com.umeng.analytics.pro.cu
    public void g() throws cb {
    }

    @Override // com.umeng.analytics.pro.cu
    public cs h() throws cb {
        byte u4 = u();
        if (u4 == -126) {
            byte u5 = u();
            byte b5 = (byte) (u5 & f63602j);
            if (b5 == 1) {
                int E = E();
                return new cs(z(), (byte) ((u5 >> 5) & 3), E);
            }
            throw new cv("Expected version 1 but got " + ((int) b5));
        }
        throw new cv("Expected protocol id " + Integer.toHexString(-126) + " but got " + Integer.toHexString(u4));
    }

    @Override // com.umeng.analytics.pro.cu
    public void i() throws cb {
    }

    @Override // com.umeng.analytics.pro.cu
    public cz j() throws cb {
        this.f63608m.a(this.f63609n);
        this.f63609n = (short) 0;
        return f63597d;
    }

    @Override // com.umeng.analytics.pro.cu
    public void k() throws cb {
        this.f63609n = this.f63608m.a();
    }

    @Override // com.umeng.analytics.pro.cu
    public cp l() throws cb {
        short s4;
        byte u4 = u();
        if (u4 == 0) {
            return f63598e;
        }
        short s5 = (short) ((u4 & 240) >> 4);
        if (s5 == 0) {
            s4 = v();
        } else {
            s4 = (short) (this.f63609n + s5);
        }
        byte b5 = (byte) (u4 & 15);
        cp cpVar = new cp("", d(b5), s4);
        if (c(u4)) {
            this.f63611p = b5 == 1 ? Boolean.TRUE : Boolean.FALSE;
        }
        this.f63609n = cpVar.f63629c;
        return cpVar;
    }

    @Override // com.umeng.analytics.pro.cu
    public void m() throws cb {
    }

    @Override // com.umeng.analytics.pro.cu
    public cr n() throws cb {
        int E = E();
        byte u4 = E == 0 ? (byte) 0 : u();
        return new cr(d((byte) (u4 >> 4)), d((byte) (u4 & 15)), E);
    }

    @Override // com.umeng.analytics.pro.cu
    public void o() throws cb {
    }

    @Override // com.umeng.analytics.pro.cu
    public cq p() throws cb {
        byte u4 = u();
        int i4 = (u4 >> 4) & 15;
        if (i4 == 15) {
            i4 = E();
        }
        return new cq(d(u4), i4);
    }

    @Override // com.umeng.analytics.pro.cu
    public void q() throws cb {
    }

    @Override // com.umeng.analytics.pro.cu
    public cy r() throws cb {
        return new cy(p());
    }

    @Override // com.umeng.analytics.pro.cu
    public void s() throws cb {
    }

    @Override // com.umeng.analytics.pro.cu
    public boolean t() throws cb {
        Boolean bool = this.f63611p;
        if (bool == null) {
            return u() == 1;
        }
        boolean booleanValue = bool.booleanValue();
        this.f63611p = null;
        return booleanValue;
    }

    @Override // com.umeng.analytics.pro.cu
    public byte u() throws cb {
        if (this.f63642g.h() > 0) {
            byte b5 = this.f63642g.f()[this.f63642g.g()];
            this.f63642g.a(1);
            return b5;
        }
        this.f63642g.d(this.f63607c, 0, 1);
        return this.f63607c[0];
    }

    @Override // com.umeng.analytics.pro.cu
    public short v() throws cb {
        return (short) g(E());
    }

    @Override // com.umeng.analytics.pro.cu
    public int w() throws cb {
        return g(E());
    }

    @Override // com.umeng.analytics.pro.cu
    public long x() throws cb {
        return d(F());
    }

    @Override // com.umeng.analytics.pro.cu
    public double y() throws cb {
        byte[] bArr = new byte[8];
        this.f63642g.d(bArr, 0, 8);
        return Double.longBitsToDouble(a(bArr));
    }

    @Override // com.umeng.analytics.pro.cu
    public String z() throws cb {
        int E = E();
        f(E);
        if (E == 0) {
            return "";
        }
        try {
            if (this.f63642g.h() >= E) {
                String str = new String(this.f63642g.f(), this.f63642g.g(), E, "UTF-8");
                this.f63642g.a(E);
                return str;
            }
            return new String(e(E), "UTF-8");
        } catch (UnsupportedEncodingException unused) {
            throw new cb("UTF-8 not supported!");
        }
    }

    /* compiled from: TCompactProtocol.java */
    /* loaded from: classes6.dex */
    public static class a implements cw {

        /* renamed from: a  reason: collision with root package name */
        private final long f63614a;

        public a() {
            this.f63614a = -1L;
        }

        @Override // com.umeng.analytics.pro.cw
        public cu a(di diVar) {
            return new co(diVar, this.f63614a);
        }

        public a(int i4) {
            this.f63614a = i4;
        }
    }

    private void b(int i4) throws cb {
        int i5 = 0;
        while ((i4 & (-128)) != 0) {
            this.f63605a[i5] = (byte) ((i4 & 127) | 128);
            i4 >>>= 7;
            i5++;
        }
        byte[] bArr = this.f63605a;
        bArr[i5] = (byte) i4;
        this.f63642g.b(bArr, 0, i5 + 1);
    }

    private void d(int i4) throws cb {
        b((byte) i4);
    }

    private byte d(byte b5) throws cv {
        byte b6 = (byte) (b5 & 15);
        switch (b6) {
            case 0:
                return (byte) 0;
            case 1:
            case 2:
                return (byte) 2;
            case 3:
                return (byte) 3;
            case 4:
                return (byte) 6;
            case 5:
                return (byte) 8;
            case 6:
                return (byte) 10;
            case 7:
                return (byte) 4;
            case 8:
                return (byte) 11;
            case 9:
                return (byte) 15;
            case 10:
                return (byte) 14;
            case 11:
                return (byte) 13;
            case 12:
                return (byte) 12;
            default:
                throw new cv("don't know what type: " + ((int) b6));
        }
    }

    private byte e(byte b5) {
        return f63599f[b5];
    }

    private void b(long j4) throws cb {
        int i4 = 0;
        while (((-128) & j4) != 0) {
            this.f63606b[i4] = (byte) ((127 & j4) | 128);
            j4 >>>= 7;
            i4++;
        }
        byte[] bArr = this.f63606b;
        bArr[i4] = (byte) j4;
        this.f63642g.b(bArr, 0, i4 + 1);
    }

    @Override // com.umeng.analytics.pro.cu
    public void a(cz czVar) throws cb {
        this.f63608m.a(this.f63609n);
        this.f63609n = (short) 0;
    }

    @Override // com.umeng.analytics.pro.cu
    public void a(cp cpVar) throws cb {
        if (cpVar.f63628b == 2) {
            this.f63610o = cpVar;
        } else {
            a(cpVar, (byte) -1);
        }
    }

    private void b(byte b5) throws cb {
        byte[] bArr = this.f63613r;
        bArr[0] = b5;
        this.f63642g.b(bArr);
    }

    private void a(cp cpVar, byte b5) throws cb {
        if (b5 == -1) {
            b5 = e(cpVar.f63628b);
        }
        short s4 = cpVar.f63629c;
        short s5 = this.f63609n;
        if (s4 > s5 && s4 - s5 <= 15) {
            d(b5 | ((s4 - s5) << 4));
        } else {
            b(b5);
            a(cpVar.f63629c);
        }
        this.f63609n = cpVar.f63629c;
    }

    public co(di diVar) {
        this(diVar, -1L);
    }

    @Override // com.umeng.analytics.pro.cu
    public void a(cr crVar) throws cb {
        int i4 = crVar.f63634c;
        if (i4 == 0) {
            d(0);
            return;
        }
        b(i4);
        d(e(crVar.f63633b) | (e(crVar.f63632a) << 4));
    }

    @Override // com.umeng.analytics.pro.cu
    public void a(cq cqVar) throws cb {
        a(cqVar.f63630a, cqVar.f63631b);
    }

    @Override // com.umeng.analytics.pro.cu
    public void a(cy cyVar) throws cb {
        a(cyVar.f63652a, cyVar.f63653b);
    }

    @Override // com.umeng.analytics.pro.cu
    public void a(boolean z4) throws cb {
        cp cpVar = this.f63610o;
        if (cpVar != null) {
            a(cpVar, z4 ? (byte) 1 : (byte) 2);
            this.f63610o = null;
            return;
        }
        b(z4 ? (byte) 1 : (byte) 2);
    }

    @Override // com.umeng.analytics.pro.cu
    public void a(byte b5) throws cb {
        b(b5);
    }

    @Override // com.umeng.analytics.pro.cu
    public void a(short s4) throws cb {
        b(c((int) s4));
    }

    @Override // com.umeng.analytics.pro.cu
    public void a(int i4) throws cb {
        b(c(i4));
    }

    @Override // com.umeng.analytics.pro.cu
    public void a(long j4) throws cb {
        b(c(j4));
    }

    @Override // com.umeng.analytics.pro.cu
    public void a(double d5) throws cb {
        byte[] bArr = {0, 0, 0, 0, 0, 0, 0, 0};
        a(Double.doubleToLongBits(d5), bArr, 0);
        this.f63642g.b(bArr);
    }

    @Override // com.umeng.analytics.pro.cu
    public void a(String str) throws cb {
        try {
            byte[] bytes = str.getBytes("UTF-8");
            a(bytes, 0, bytes.length);
        } catch (UnsupportedEncodingException unused) {
            throw new cb("UTF-8 not supported!");
        }
    }

    @Override // com.umeng.analytics.pro.cu
    public void a(ByteBuffer byteBuffer) throws cb {
        a(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), byteBuffer.limit() - byteBuffer.position());
    }

    private void a(byte[] bArr, int i4, int i5) throws cb {
        b(i5);
        this.f63642g.b(bArr, i4, i5);
    }

    protected void a(byte b5, int i4) throws cb {
        if (i4 <= 14) {
            d(e(b5) | (i4 << 4));
            return;
        }
        d(e(b5) | 240);
        b(i4);
    }

    private void a(long j4, byte[] bArr, int i4) {
        bArr[i4 + 0] = (byte) (j4 & 255);
        bArr[i4 + 1] = (byte) ((j4 >> 8) & 255);
        bArr[i4 + 2] = (byte) ((j4 >> 16) & 255);
        bArr[i4 + 3] = (byte) ((j4 >> 24) & 255);
        bArr[i4 + 4] = (byte) ((j4 >> 32) & 255);
        bArr[i4 + 5] = (byte) ((j4 >> 40) & 255);
        bArr[i4 + 6] = (byte) ((j4 >> 48) & 255);
        bArr[i4 + 7] = (byte) ((j4 >> 56) & 255);
    }

    private long a(byte[] bArr) {
        return ((bArr[7] & 255) << 56) | ((bArr[6] & 255) << 48) | ((bArr[5] & 255) << 40) | ((bArr[4] & 255) << 32) | ((bArr[3] & 255) << 24) | ((bArr[2] & 255) << 16) | ((bArr[1] & 255) << 8) | (255 & bArr[0]);
    }
}
