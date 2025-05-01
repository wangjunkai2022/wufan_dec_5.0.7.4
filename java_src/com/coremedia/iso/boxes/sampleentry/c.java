package com.coremedia.iso.boxes.sampleentry;

import com.coremedia.iso.boxes.j;
import com.coremedia.iso.i;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import tv.danmaku.ijk.media.player.IjkMediaMeta;
/* compiled from: AudioSampleEntry.java */
/* loaded from: classes2.dex */
public final class c extends com.coremedia.iso.boxes.sampleentry.a {
    public static final String C = "samr";
    public static final String D = "sawb";
    public static final String E = "mp4a";
    public static final String F = "drms";
    public static final String G = "alac";
    public static final String H = "owma";
    public static final String I = "ac-3";
    public static final String J = "ec-3";
    public static final String K = "mlpa";
    public static final String L = "dtsl";
    public static final String M = "dtsh";
    public static final String N = "dtse";
    public static final String O = "enca";
    static final /* synthetic */ boolean P = false;
    private long A;
    private byte[] B;

    /* renamed from: p  reason: collision with root package name */
    private int f9884p;

    /* renamed from: q  reason: collision with root package name */
    private int f9885q;

    /* renamed from: r  reason: collision with root package name */
    private long f9886r;

    /* renamed from: s  reason: collision with root package name */
    private int f9887s;

    /* renamed from: t  reason: collision with root package name */
    private int f9888t;

    /* renamed from: u  reason: collision with root package name */
    private int f9889u;

    /* renamed from: v  reason: collision with root package name */
    private long f9890v;

    /* renamed from: w  reason: collision with root package name */
    private long f9891w;

    /* renamed from: x  reason: collision with root package name */
    private long f9892x;

    /* renamed from: y  reason: collision with root package name */
    private long f9893y;

    /* renamed from: z  reason: collision with root package name */
    private int f9894z;

    /* compiled from: AudioSampleEntry.java */
    /* loaded from: classes2.dex */
    class a implements com.coremedia.iso.boxes.d {

        /* renamed from: c  reason: collision with root package name */
        private final /* synthetic */ long f9896c;

        /* renamed from: d  reason: collision with root package name */
        private final /* synthetic */ ByteBuffer f9897d;

        a(long j4, ByteBuffer byteBuffer) {
            this.f9896c = j4;
            this.f9897d = byteBuffer;
        }

        @Override // com.coremedia.iso.boxes.d
        public void a(WritableByteChannel writableByteChannel) throws IOException {
            this.f9897d.rewind();
            writableByteChannel.write(this.f9897d);
        }

        @Override // com.coremedia.iso.boxes.d
        public j getParent() {
            return c.this;
        }

        @Override // com.coremedia.iso.boxes.d
        public long getSize() {
            return this.f9896c;
        }

        @Override // com.coremedia.iso.boxes.d
        public String getType() {
            return "----";
        }

        @Override // com.coremedia.iso.boxes.d
        public long j() {
            return 0L;
        }

        @Override // com.coremedia.iso.boxes.d
        public void k(com.googlecode.mp4parser.e eVar, ByteBuffer byteBuffer, long j4, com.coremedia.iso.c cVar) throws IOException {
            throw new RuntimeException("NotImplemented");
        }

        @Override // com.coremedia.iso.boxes.d
        public void p(j jVar) {
            if (!c.P && jVar != c.this) {
                throw new AssertionError("you cannot diswown this special box");
            }
        }
    }

    public c(String str) {
        super(str);
    }

    public long C() {
        return this.f9892x;
    }

    public long D() {
        return this.f9891w;
    }

    public long E() {
        return this.f9893y;
    }

    public int J() {
        return this.f9884p;
    }

    public int K() {
        return this.f9888t;
    }

    public int N() {
        return this.f9889u;
    }

    public int P() {
        return this.f9894z;
    }

    public long S() {
        return this.A;
    }

    public long T() {
        return this.f9886r;
    }

    public int V() {
        return this.f9885q;
    }

    public long W() {
        return this.f9890v;
    }

    public int X() {
        return this.f9887s;
    }

    public byte[] Y() {
        return this.B;
    }

    public void Z(long j4) {
        this.f9892x = j4;
    }

    @Override // com.coremedia.iso.boxes.sampleentry.a, com.googlecode.mp4parser.b, com.coremedia.iso.boxes.d
    public void a(WritableByteChannel writableByteChannel) throws IOException {
        writableByteChannel.write(B());
        int i4 = this.f9887s;
        ByteBuffer allocate = ByteBuffer.allocate((i4 == 1 ? 16 : 0) + 28 + (i4 == 2 ? 36 : 0));
        allocate.position(6);
        i.f(allocate, this.f9871o);
        i.f(allocate, this.f9887s);
        i.f(allocate, this.f9894z);
        i.i(allocate, this.A);
        i.f(allocate, this.f9884p);
        i.f(allocate, this.f9885q);
        i.f(allocate, this.f9888t);
        i.f(allocate, this.f9889u);
        if (this.f13604l.equals(K)) {
            i.i(allocate, T());
        } else {
            i.i(allocate, T() << 16);
        }
        if (this.f9887s == 1) {
            i.i(allocate, this.f9890v);
            i.i(allocate, this.f9891w);
            i.i(allocate, this.f9892x);
            i.i(allocate, this.f9893y);
        }
        if (this.f9887s == 2) {
            i.i(allocate, this.f9890v);
            i.i(allocate, this.f9891w);
            i.i(allocate, this.f9892x);
            i.i(allocate, this.f9893y);
            allocate.put(this.B);
        }
        writableByteChannel.write((ByteBuffer) allocate.rewind());
        u(writableByteChannel);
    }

    public void a0(long j4) {
        this.f9891w = j4;
    }

    public void b0(long j4) {
        this.f9893y = j4;
    }

    public void c0(int i4) {
        this.f9884p = i4;
    }

    public void d0(int i4) {
        this.f9888t = i4;
    }

    public void e0(int i4) {
        this.f9889u = i4;
    }

    public void f0(int i4) {
        this.f9894z = i4;
    }

    public void g0(long j4) {
        this.A = j4;
    }

    @Override // com.googlecode.mp4parser.b, com.coremedia.iso.boxes.d
    public long getSize() {
        int i4 = this.f9887s;
        int i5 = 16;
        long y2 = (i4 == 1 ? 16 : 0) + 28 + (i4 == 2 ? 36 : 0) + y();
        if (!this.f13605m && 8 + y2 < IjkMediaMeta.AV_CH_WIDE_RIGHT) {
            i5 = 8;
        }
        return y2 + i5;
    }

    public void h0(long j4) {
        this.f9886r = j4;
    }

    public void i0(int i4) {
        this.f9885q = i4;
    }

    public void j0(long j4) {
        this.f9890v = j4;
    }

    @Override // com.coremedia.iso.boxes.sampleentry.a, com.googlecode.mp4parser.b, com.coremedia.iso.boxes.d
    public void k(com.googlecode.mp4parser.e eVar, ByteBuffer byteBuffer, long j4, com.coremedia.iso.c cVar) throws IOException {
        ByteBuffer allocate = ByteBuffer.allocate(28);
        eVar.read(allocate);
        allocate.position(6);
        this.f9871o = com.coremedia.iso.g.i(allocate);
        this.f9887s = com.coremedia.iso.g.i(allocate);
        this.f9894z = com.coremedia.iso.g.i(allocate);
        this.A = com.coremedia.iso.g.l(allocate);
        this.f9884p = com.coremedia.iso.g.i(allocate);
        this.f9885q = com.coremedia.iso.g.i(allocate);
        this.f9888t = com.coremedia.iso.g.i(allocate);
        this.f9889u = com.coremedia.iso.g.i(allocate);
        this.f9886r = com.coremedia.iso.g.l(allocate);
        if (!this.f13604l.equals(K)) {
            this.f9886r >>>= 16;
        }
        if (this.f9887s == 1) {
            ByteBuffer allocate2 = ByteBuffer.allocate(16);
            eVar.read(allocate2);
            allocate2.rewind();
            this.f9890v = com.coremedia.iso.g.l(allocate2);
            this.f9891w = com.coremedia.iso.g.l(allocate2);
            this.f9892x = com.coremedia.iso.g.l(allocate2);
            this.f9893y = com.coremedia.iso.g.l(allocate2);
        }
        if (this.f9887s == 2) {
            ByteBuffer allocate3 = ByteBuffer.allocate(36);
            eVar.read(allocate3);
            allocate3.rewind();
            this.f9890v = com.coremedia.iso.g.l(allocate3);
            this.f9891w = com.coremedia.iso.g.l(allocate3);
            this.f9892x = com.coremedia.iso.g.l(allocate3);
            this.f9893y = com.coremedia.iso.g.l(allocate3);
            byte[] bArr = new byte[20];
            this.B = bArr;
            allocate3.get(bArr);
        }
        if (H.equals(this.f13604l)) {
            System.err.println(H);
            long j5 = j4 - 28;
            int i4 = this.f9887s;
            long j6 = (j5 - (i4 != 1 ? 0 : 16)) - (i4 != 2 ? 0 : 36);
            ByteBuffer allocate4 = ByteBuffer.allocate(com.googlecode.mp4parser.util.c.a(j6));
            eVar.read(allocate4);
            v(new a(j6, allocate4));
            return;
        }
        long j7 = j4 - 28;
        int i5 = this.f9887s;
        z(eVar, (j7 - (i5 != 1 ? 0 : 16)) - (i5 != 2 ? 0 : 36), cVar);
    }

    public void k0(int i4) {
        this.f9887s = i4;
    }

    public void l0(byte[] bArr) {
        this.B = bArr;
    }

    public void m0(String str) {
        this.f13604l = str;
    }

    @Override // com.googlecode.mp4parser.d
    public String toString() {
        return "AudioSampleEntry{bytesPerSample=" + this.f9893y + ", bytesPerFrame=" + this.f9892x + ", bytesPerPacket=" + this.f9891w + ", samplesPerPacket=" + this.f9890v + ", packetSize=" + this.f9889u + ", compressionId=" + this.f9888t + ", soundVersion=" + this.f9887s + ", sampleRate=" + this.f9886r + ", sampleSize=" + this.f9885q + ", channelCount=" + this.f9884p + ", boxes=" + t() + '}';
    }
}
