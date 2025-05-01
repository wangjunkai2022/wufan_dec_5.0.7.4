package com.googlecode.mp4parser.boxes.apple;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.List;
import tv.danmaku.ijk.media.player.IjkMediaMeta;
/* compiled from: QuicktimeTextSampleEntry.java */
/* loaded from: classes3.dex */
public class t0 extends com.coremedia.iso.boxes.sampleentry.a {
    public static final String F = "text";
    int A;
    int B;
    int C;
    String D;
    int E;

    /* renamed from: p  reason: collision with root package name */
    int f13679p;

    /* renamed from: q  reason: collision with root package name */
    int f13680q;

    /* renamed from: r  reason: collision with root package name */
    int f13681r;

    /* renamed from: s  reason: collision with root package name */
    int f13682s;

    /* renamed from: t  reason: collision with root package name */
    int f13683t;

    /* renamed from: u  reason: collision with root package name */
    long f13684u;

    /* renamed from: v  reason: collision with root package name */
    long f13685v;

    /* renamed from: w  reason: collision with root package name */
    short f13686w;

    /* renamed from: x  reason: collision with root package name */
    short f13687x;

    /* renamed from: y  reason: collision with root package name */
    byte f13688y;

    /* renamed from: z  reason: collision with root package name */
    short f13689z;

    public t0() {
        super("text");
        this.A = 65535;
        this.B = 65535;
        this.C = 65535;
        this.D = "";
    }

    public int C() {
        return this.f13683t;
    }

    public int D() {
        return this.f13682s;
    }

    public int E() {
        return this.f13681r;
    }

    public long J() {
        return this.f13684u;
    }

    public int K() {
        return this.f13679p;
    }

    public short N() {
        return this.f13687x;
    }

    public String P() {
        return this.D;
    }

    public short S() {
        return this.f13686w;
    }

    public int T() {
        return this.C;
    }

    public int V() {
        return this.B;
    }

    public int W() {
        return this.A;
    }

    public long X() {
        return this.f13685v;
    }

    public byte Y() {
        return this.f13688y;
    }

    public short Z() {
        return this.f13689z;
    }

    @Override // com.coremedia.iso.boxes.sampleentry.a, com.googlecode.mp4parser.b, com.coremedia.iso.boxes.d
    public void a(WritableByteChannel writableByteChannel) throws IOException {
        writableByteChannel.write(B());
        String str = this.D;
        ByteBuffer allocate = ByteBuffer.allocate((str != null ? str.length() : 0) + 52);
        allocate.position(6);
        com.coremedia.iso.i.f(allocate, this.E);
        allocate.putInt(this.f13679p);
        allocate.putInt(this.f13680q);
        com.coremedia.iso.i.f(allocate, this.f13681r);
        com.coremedia.iso.i.f(allocate, this.f13682s);
        com.coremedia.iso.i.f(allocate, this.f13683t);
        com.coremedia.iso.i.l(allocate, this.f13684u);
        com.coremedia.iso.i.l(allocate, this.f13685v);
        allocate.putShort(this.f13686w);
        allocate.putShort(this.f13687x);
        allocate.put(this.f13688y);
        allocate.putShort(this.f13689z);
        com.coremedia.iso.i.f(allocate, this.A);
        com.coremedia.iso.i.f(allocate, this.B);
        com.coremedia.iso.i.f(allocate, this.C);
        String str2 = this.D;
        if (str2 != null) {
            com.coremedia.iso.i.m(allocate, str2.length());
            allocate.put(this.D.getBytes());
        }
        writableByteChannel.write((ByteBuffer) allocate.rewind());
    }

    public int a0() {
        return this.f13680q;
    }

    @Override // com.googlecode.mp4parser.d, com.coremedia.iso.boxes.j
    public void b(List<com.coremedia.iso.boxes.d> list) {
        throw new RuntimeException("QuicktimeTextSampleEntries may not have child boxes");
    }

    public void b0(int i4) {
        this.f13683t = i4;
    }

    public void c0(int i4) {
        this.f13682s = i4;
    }

    public void d0(int i4) {
        this.f13681r = i4;
    }

    public void e0(long j4) {
        this.f13684u = j4;
    }

    public void f0(int i4) {
        this.f13679p = i4;
    }

    public void g0(short s4) {
        this.f13687x = s4;
    }

    @Override // com.googlecode.mp4parser.b, com.coremedia.iso.boxes.d
    public long getSize() {
        long y2 = y() + 52;
        String str = this.D;
        long length = y2 + (str != null ? str.length() : 0);
        return length + ((this.f13605m || 8 + length >= IjkMediaMeta.AV_CH_WIDE_RIGHT) ? 16 : 8);
    }

    public void h0(String str) {
        this.D = str;
    }

    public void i0(short s4) {
        this.f13686w = s4;
    }

    public void j0(int i4) {
        this.C = i4;
    }

    @Override // com.coremedia.iso.boxes.sampleentry.a, com.googlecode.mp4parser.b, com.coremedia.iso.boxes.d
    public void k(com.googlecode.mp4parser.e eVar, ByteBuffer byteBuffer, long j4, com.coremedia.iso.c cVar) throws IOException {
        ByteBuffer allocate = ByteBuffer.allocate(com.googlecode.mp4parser.util.c.a(j4));
        eVar.read(allocate);
        allocate.position(6);
        this.E = com.coremedia.iso.g.i(allocate);
        this.f13679p = allocate.getInt();
        this.f13680q = allocate.getInt();
        this.f13681r = com.coremedia.iso.g.i(allocate);
        this.f13682s = com.coremedia.iso.g.i(allocate);
        this.f13683t = com.coremedia.iso.g.i(allocate);
        this.f13684u = com.coremedia.iso.g.o(allocate);
        this.f13685v = com.coremedia.iso.g.o(allocate);
        this.f13686w = allocate.getShort();
        this.f13687x = allocate.getShort();
        this.f13688y = allocate.get();
        this.f13689z = allocate.getShort();
        this.A = com.coremedia.iso.g.i(allocate);
        this.B = com.coremedia.iso.g.i(allocate);
        this.C = com.coremedia.iso.g.i(allocate);
        if (allocate.remaining() > 0) {
            byte[] bArr = new byte[com.coremedia.iso.g.p(allocate)];
            allocate.get(bArr);
            this.D = new String(bArr);
            return;
        }
        this.D = null;
    }

    public void k0(int i4) {
        this.B = i4;
    }

    public void l0(int i4) {
        this.A = i4;
    }

    public void m0(long j4) {
        this.f13685v = j4;
    }

    public void n0(byte b5) {
        this.f13688y = b5;
    }

    public void o0(short s4) {
        this.f13689z = s4;
    }

    public void p0(int i4) {
        this.f13680q = i4;
    }

    @Override // com.googlecode.mp4parser.d
    public void v(com.coremedia.iso.boxes.d dVar) {
        throw new RuntimeException("QuicktimeTextSampleEntries may not have child boxes");
    }
}
