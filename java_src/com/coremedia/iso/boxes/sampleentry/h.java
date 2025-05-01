package com.coremedia.iso.boxes.sampleentry;

import com.coremedia.iso.boxes.j;
import com.coremedia.iso.i;
import com.coremedia.iso.l;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import tv.danmaku.ijk.media.player.IjkMediaMeta;
/* compiled from: VisualSampleEntry.java */
/* loaded from: classes2.dex */
public final class h extends com.coremedia.iso.boxes.sampleentry.a implements j {
    public static final String A = "avc3";
    public static final String B = "drmi";
    public static final String C = "hvc1";
    public static final String D = "hev1";
    public static final String E = "encv";
    static final /* synthetic */ boolean F = false;

    /* renamed from: x  reason: collision with root package name */
    public static final String f9918x = "mp4v";

    /* renamed from: y  reason: collision with root package name */
    public static final String f9919y = "s263";

    /* renamed from: z  reason: collision with root package name */
    public static final String f9920z = "avc1";

    /* renamed from: p  reason: collision with root package name */
    private int f9921p;

    /* renamed from: q  reason: collision with root package name */
    private int f9922q;

    /* renamed from: r  reason: collision with root package name */
    private double f9923r;

    /* renamed from: s  reason: collision with root package name */
    private double f9924s;

    /* renamed from: t  reason: collision with root package name */
    private int f9925t;

    /* renamed from: u  reason: collision with root package name */
    private String f9926u;

    /* renamed from: v  reason: collision with root package name */
    private int f9927v;

    /* renamed from: w  reason: collision with root package name */
    private long[] f9928w;

    /* compiled from: VisualSampleEntry.java */
    /* loaded from: classes2.dex */
    class a implements com.googlecode.mp4parser.e {

        /* renamed from: c  reason: collision with root package name */
        private final /* synthetic */ long f9930c;

        /* renamed from: d  reason: collision with root package name */
        private final /* synthetic */ com.googlecode.mp4parser.e f9931d;

        a(long j4, com.googlecode.mp4parser.e eVar) {
            this.f9930c = j4;
            this.f9931d = eVar;
        }

        @Override // com.googlecode.mp4parser.e
        public void G(long j4) throws IOException {
            this.f9931d.G(j4);
        }

        @Override // com.googlecode.mp4parser.e
        public ByteBuffer Q(long j4, long j5) throws IOException {
            return this.f9931d.Q(j4, j5);
        }

        @Override // com.googlecode.mp4parser.e, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.f9931d.close();
        }

        @Override // com.googlecode.mp4parser.e
        public long m(long j4, long j5, WritableByteChannel writableByteChannel) throws IOException {
            return this.f9931d.m(j4, j5, writableByteChannel);
        }

        @Override // com.googlecode.mp4parser.e
        public long position() throws IOException {
            return this.f9931d.position();
        }

        @Override // com.googlecode.mp4parser.e
        public int read(ByteBuffer byteBuffer) throws IOException {
            if (this.f9930c == this.f9931d.position()) {
                return -1;
            }
            if (byteBuffer.remaining() > this.f9930c - this.f9931d.position()) {
                ByteBuffer allocate = ByteBuffer.allocate(com.googlecode.mp4parser.util.c.a(this.f9930c - this.f9931d.position()));
                this.f9931d.read(allocate);
                byteBuffer.put((ByteBuffer) allocate.rewind());
                return allocate.capacity();
            }
            return this.f9931d.read(byteBuffer);
        }

        @Override // com.googlecode.mp4parser.e
        public long size() throws IOException {
            return this.f9930c;
        }
    }

    public h() {
        super(f9920z);
        this.f9923r = 72.0d;
        this.f9924s = 72.0d;
        this.f9925t = 1;
        this.f9926u = "";
        this.f9927v = 24;
        this.f9928w = new long[3];
    }

    public String C() {
        return this.f9926u;
    }

    public int D() {
        return this.f9927v;
    }

    public int E() {
        return this.f9925t;
    }

    public int J() {
        return this.f9922q;
    }

    public double K() {
        return this.f9923r;
    }

    public double N() {
        return this.f9924s;
    }

    public int P() {
        return this.f9921p;
    }

    public void S(String str) {
        this.f9926u = str;
    }

    public void T(int i4) {
        this.f9927v = i4;
    }

    public void V(int i4) {
        this.f9925t = i4;
    }

    public void W(int i4) {
        this.f9922q = i4;
    }

    public void X(double d5) {
        this.f9923r = d5;
    }

    public void Y(String str) {
        this.f13604l = str;
    }

    public void Z(double d5) {
        this.f9924s = d5;
    }

    @Override // com.coremedia.iso.boxes.sampleentry.a, com.googlecode.mp4parser.b, com.coremedia.iso.boxes.d
    public void a(WritableByteChannel writableByteChannel) throws IOException {
        writableByteChannel.write(B());
        ByteBuffer allocate = ByteBuffer.allocate(78);
        allocate.position(6);
        i.f(allocate, this.f9871o);
        i.f(allocate, 0);
        i.f(allocate, 0);
        i.i(allocate, this.f9928w[0]);
        i.i(allocate, this.f9928w[1]);
        i.i(allocate, this.f9928w[2]);
        i.f(allocate, P());
        i.f(allocate, J());
        i.b(allocate, K());
        i.b(allocate, N());
        i.i(allocate, 0L);
        i.f(allocate, E());
        i.m(allocate, l.c(C()));
        allocate.put(l.b(C()));
        int c5 = l.c(C());
        while (c5 < 31) {
            c5++;
            allocate.put((byte) 0);
        }
        i.f(allocate, D());
        i.f(allocate, 65535);
        writableByteChannel.write((ByteBuffer) allocate.rewind());
        u(writableByteChannel);
    }

    public void a0(int i4) {
        this.f9921p = i4;
    }

    @Override // com.googlecode.mp4parser.b, com.coremedia.iso.boxes.d
    public long getSize() {
        long y2 = y() + 78;
        return y2 + ((this.f13605m || 8 + y2 >= IjkMediaMeta.AV_CH_WIDE_RIGHT) ? 16 : 8);
    }

    @Override // com.coremedia.iso.boxes.sampleentry.a, com.googlecode.mp4parser.b, com.coremedia.iso.boxes.d
    public void k(com.googlecode.mp4parser.e eVar, ByteBuffer byteBuffer, long j4, com.coremedia.iso.c cVar) throws IOException {
        long position = eVar.position() + j4;
        ByteBuffer allocate = ByteBuffer.allocate(78);
        eVar.read(allocate);
        allocate.position(6);
        this.f9871o = com.coremedia.iso.g.i(allocate);
        com.coremedia.iso.g.i(allocate);
        com.coremedia.iso.g.i(allocate);
        this.f9928w[0] = com.coremedia.iso.g.l(allocate);
        this.f9928w[1] = com.coremedia.iso.g.l(allocate);
        this.f9928w[2] = com.coremedia.iso.g.l(allocate);
        this.f9921p = com.coremedia.iso.g.i(allocate);
        this.f9922q = com.coremedia.iso.g.i(allocate);
        this.f9923r = com.coremedia.iso.g.d(allocate);
        this.f9924s = com.coremedia.iso.g.d(allocate);
        com.coremedia.iso.g.l(allocate);
        this.f9925t = com.coremedia.iso.g.i(allocate);
        int p4 = com.coremedia.iso.g.p(allocate);
        if (p4 > 31) {
            p4 = 31;
        }
        byte[] bArr = new byte[p4];
        allocate.get(bArr);
        this.f9926u = l.a(bArr);
        if (p4 < 31) {
            allocate.get(new byte[31 - p4]);
        }
        this.f9927v = com.coremedia.iso.g.i(allocate);
        com.coremedia.iso.g.i(allocate);
        z(new a(position, eVar), j4 - 78, cVar);
    }

    public h(String str) {
        super(str);
        this.f9923r = 72.0d;
        this.f9924s = 72.0d;
        this.f9925t = 1;
        this.f9926u = "";
        this.f9927v = 24;
        this.f9928w = new long[3];
    }
}
