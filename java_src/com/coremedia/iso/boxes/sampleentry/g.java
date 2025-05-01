package com.coremedia.iso.boxes.sampleentry;

import android.support.v4.media.session.PlaybackStateCompat;
import com.coremedia.iso.i;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.Arrays;
import tv.danmaku.ijk.media.player.IjkMediaMeta;
/* compiled from: TextSampleEntry.java */
/* loaded from: classes2.dex */
public class g extends com.coremedia.iso.boxes.sampleentry.a {

    /* renamed from: v  reason: collision with root package name */
    public static final String f9900v = "tx3g";

    /* renamed from: w  reason: collision with root package name */
    public static final String f9901w = "enct";

    /* renamed from: p  reason: collision with root package name */
    private long f9902p;

    /* renamed from: q  reason: collision with root package name */
    private int f9903q;

    /* renamed from: r  reason: collision with root package name */
    private int f9904r;

    /* renamed from: s  reason: collision with root package name */
    private int[] f9905s;

    /* renamed from: t  reason: collision with root package name */
    private a f9906t;

    /* renamed from: u  reason: collision with root package name */
    private b f9907u;

    /* compiled from: TextSampleEntry.java */
    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        int f9908a;

        /* renamed from: b  reason: collision with root package name */
        int f9909b;

        /* renamed from: c  reason: collision with root package name */
        int f9910c;

        /* renamed from: d  reason: collision with root package name */
        int f9911d;

        public a() {
        }

        public void a(ByteBuffer byteBuffer) {
            i.f(byteBuffer, this.f9908a);
            i.f(byteBuffer, this.f9909b);
            i.f(byteBuffer, this.f9910c);
            i.f(byteBuffer, this.f9911d);
        }

        public int b() {
            return 8;
        }

        public void c(ByteBuffer byteBuffer) {
            this.f9908a = com.coremedia.iso.g.i(byteBuffer);
            this.f9909b = com.coremedia.iso.g.i(byteBuffer);
            this.f9910c = com.coremedia.iso.g.i(byteBuffer);
            this.f9911d = com.coremedia.iso.g.i(byteBuffer);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f9910c == aVar.f9910c && this.f9909b == aVar.f9909b && this.f9911d == aVar.f9911d && this.f9908a == aVar.f9908a;
        }

        public int hashCode() {
            return (((((this.f9908a * 31) + this.f9909b) * 31) + this.f9910c) * 31) + this.f9911d;
        }

        public a(int i4, int i5, int i6, int i7) {
            this.f9908a = i4;
            this.f9909b = i5;
            this.f9910c = i6;
            this.f9911d = i7;
        }
    }

    public g() {
        super(f9900v);
        this.f9905s = new int[4];
        this.f9906t = new a();
        this.f9907u = new b();
    }

    public int[] C() {
        return this.f9905s;
    }

    public a D() {
        return this.f9906t;
    }

    public int E() {
        return this.f9903q;
    }

    public b J() {
        return this.f9907u;
    }

    public int K() {
        return this.f9904r;
    }

    public boolean N() {
        return (this.f9902p & 2048) == 2048;
    }

    public boolean P() {
        return (this.f9902p & PlaybackStateCompat.ACTION_SET_REPEAT_MODE) == PlaybackStateCompat.ACTION_SET_REPEAT_MODE;
    }

    public boolean S() {
        return (this.f9902p & 384) == 384;
    }

    public boolean T() {
        return (this.f9902p & 32) == 32;
    }

    public boolean V() {
        return (this.f9902p & 64) == 64;
    }

    public boolean W() {
        return (this.f9902p & 131072) == 131072;
    }

    public void X(int[] iArr) {
        this.f9905s = iArr;
    }

    public void Y(a aVar) {
        this.f9906t = aVar;
    }

    public void Z(boolean z4) {
        if (z4) {
            this.f9902p |= 2048;
        } else {
            this.f9902p &= -2049;
        }
    }

    @Override // com.coremedia.iso.boxes.sampleentry.a, com.googlecode.mp4parser.b, com.coremedia.iso.boxes.d
    public void a(WritableByteChannel writableByteChannel) throws IOException {
        writableByteChannel.write(B());
        ByteBuffer allocate = ByteBuffer.allocate(38);
        allocate.position(6);
        i.f(allocate, this.f9871o);
        i.i(allocate, this.f9902p);
        i.m(allocate, this.f9903q);
        i.m(allocate, this.f9904r);
        i.m(allocate, this.f9905s[0]);
        i.m(allocate, this.f9905s[1]);
        i.m(allocate, this.f9905s[2]);
        i.m(allocate, this.f9905s[3]);
        this.f9906t.a(allocate);
        this.f9907u.a(allocate);
        writableByteChannel.write((ByteBuffer) allocate.rewind());
        u(writableByteChannel);
    }

    public void a0(boolean z4) {
        if (z4) {
            this.f9902p |= PlaybackStateCompat.ACTION_SET_REPEAT_MODE;
        } else {
            this.f9902p &= -262145;
        }
    }

    public void b0(int i4) {
        this.f9903q = i4;
    }

    public void c0(boolean z4) {
        if (z4) {
            this.f9902p |= 384;
        } else {
            this.f9902p &= -385;
        }
    }

    public void d0(boolean z4) {
        if (z4) {
            this.f9902p |= 32;
        } else {
            this.f9902p &= -33;
        }
    }

    public void e0(boolean z4) {
        if (z4) {
            this.f9902p |= 64;
        } else {
            this.f9902p &= -65;
        }
    }

    public void f0(b bVar) {
        this.f9907u = bVar;
    }

    public void g0(String str) {
        this.f13604l = str;
    }

    @Override // com.googlecode.mp4parser.b, com.coremedia.iso.boxes.d
    public long getSize() {
        long y2 = y() + 38;
        return y2 + ((this.f13605m || y2 >= IjkMediaMeta.AV_CH_WIDE_RIGHT) ? 16 : 8);
    }

    public void h0(int i4) {
        this.f9904r = i4;
    }

    public void i0(boolean z4) {
        if (z4) {
            this.f9902p |= 131072;
        } else {
            this.f9902p &= -131073;
        }
    }

    @Override // com.coremedia.iso.boxes.sampleentry.a, com.googlecode.mp4parser.b, com.coremedia.iso.boxes.d
    public void k(com.googlecode.mp4parser.e eVar, ByteBuffer byteBuffer, long j4, com.coremedia.iso.c cVar) throws IOException {
        ByteBuffer allocate = ByteBuffer.allocate(38);
        eVar.read(allocate);
        allocate.position(6);
        this.f9871o = com.coremedia.iso.g.i(allocate);
        this.f9902p = com.coremedia.iso.g.l(allocate);
        this.f9903q = com.coremedia.iso.g.p(allocate);
        this.f9904r = com.coremedia.iso.g.p(allocate);
        int[] iArr = new int[4];
        this.f9905s = iArr;
        iArr[0] = com.coremedia.iso.g.p(allocate);
        this.f9905s[1] = com.coremedia.iso.g.p(allocate);
        this.f9905s[2] = com.coremedia.iso.g.p(allocate);
        this.f9905s[3] = com.coremedia.iso.g.p(allocate);
        a aVar = new a();
        this.f9906t = aVar;
        aVar.c(allocate);
        b bVar = new b();
        this.f9907u = bVar;
        bVar.c(allocate);
        z(eVar, j4 - 38, cVar);
    }

    @Override // com.googlecode.mp4parser.d
    public String toString() {
        return "TextSampleEntry";
    }

    /* compiled from: TextSampleEntry.java */
    /* loaded from: classes2.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        int f9912a;

        /* renamed from: b  reason: collision with root package name */
        int f9913b;

        /* renamed from: c  reason: collision with root package name */
        int f9914c;

        /* renamed from: d  reason: collision with root package name */
        int f9915d;

        /* renamed from: e  reason: collision with root package name */
        int f9916e;

        /* renamed from: f  reason: collision with root package name */
        int[] f9917f;

        public b() {
            this.f9917f = new int[]{255, 255, 255, 255};
        }

        public void a(ByteBuffer byteBuffer) {
            i.f(byteBuffer, this.f9912a);
            i.f(byteBuffer, this.f9913b);
            i.f(byteBuffer, this.f9914c);
            i.m(byteBuffer, this.f9915d);
            i.m(byteBuffer, this.f9916e);
            i.m(byteBuffer, this.f9917f[0]);
            i.m(byteBuffer, this.f9917f[1]);
            i.m(byteBuffer, this.f9917f[2]);
            i.m(byteBuffer, this.f9917f[3]);
        }

        public int b() {
            return 12;
        }

        public void c(ByteBuffer byteBuffer) {
            this.f9912a = com.coremedia.iso.g.i(byteBuffer);
            this.f9913b = com.coremedia.iso.g.i(byteBuffer);
            this.f9914c = com.coremedia.iso.g.i(byteBuffer);
            this.f9915d = com.coremedia.iso.g.p(byteBuffer);
            this.f9916e = com.coremedia.iso.g.p(byteBuffer);
            int[] iArr = new int[4];
            this.f9917f = iArr;
            iArr[0] = com.coremedia.iso.g.p(byteBuffer);
            this.f9917f[1] = com.coremedia.iso.g.p(byteBuffer);
            this.f9917f[2] = com.coremedia.iso.g.p(byteBuffer);
            this.f9917f[3] = com.coremedia.iso.g.p(byteBuffer);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            return this.f9913b == bVar.f9913b && this.f9915d == bVar.f9915d && this.f9914c == bVar.f9914c && this.f9916e == bVar.f9916e && this.f9912a == bVar.f9912a && Arrays.equals(this.f9917f, bVar.f9917f);
        }

        public int hashCode() {
            int i4 = ((((((((this.f9912a * 31) + this.f9913b) * 31) + this.f9914c) * 31) + this.f9915d) * 31) + this.f9916e) * 31;
            int[] iArr = this.f9917f;
            return i4 + (iArr != null ? Arrays.hashCode(iArr) : 0);
        }

        public b(int i4, int i5, int i6, int i7, int i8, int[] iArr) {
            this.f9917f = new int[]{255, 255, 255, 255};
            this.f9912a = i4;
            this.f9913b = i5;
            this.f9914c = i6;
            this.f9915d = i7;
            this.f9916e = i8;
            this.f9917f = iArr;
        }
    }

    public g(String str) {
        super(str);
        this.f9905s = new int[4];
        this.f9906t = new a();
        this.f9907u = new b();
    }
}
