package com.coremedia.iso.boxes;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import tv.danmaku.ijk.media.player.IjkMediaMeta;
/* compiled from: MetaBox.java */
/* loaded from: classes2.dex */
public class g0 extends com.googlecode.mp4parser.b {

    /* renamed from: q  reason: collision with root package name */
    public static final String f9694q = "meta";

    /* renamed from: o  reason: collision with root package name */
    private int f9695o;

    /* renamed from: p  reason: collision with root package name */
    private int f9696p;

    public g0() {
        super("meta");
    }

    protected final long C(ByteBuffer byteBuffer) {
        this.f9695o = com.coremedia.iso.g.p(byteBuffer);
        this.f9696p = com.coremedia.iso.g.k(byteBuffer);
        return 4L;
    }

    protected final void D(ByteBuffer byteBuffer) {
        com.coremedia.iso.i.m(byteBuffer, this.f9695o);
        com.coremedia.iso.i.h(byteBuffer, this.f9696p);
    }

    @Override // com.googlecode.mp4parser.b, com.coremedia.iso.boxes.d
    public void a(WritableByteChannel writableByteChannel) throws IOException {
        writableByteChannel.write(B());
        ByteBuffer allocate = ByteBuffer.allocate(4);
        D(allocate);
        writableByteChannel.write((ByteBuffer) allocate.rewind());
        u(writableByteChannel);
    }

    public int getFlags() {
        return this.f9696p;
    }

    @Override // com.googlecode.mp4parser.b, com.coremedia.iso.boxes.d
    public long getSize() {
        long y2 = y() + 4;
        return y2 + ((this.f13605m || y2 >= IjkMediaMeta.AV_CH_WIDE_RIGHT) ? 16 : 8);
    }

    public int getVersion() {
        return this.f9695o;
    }

    @Override // com.googlecode.mp4parser.b, com.coremedia.iso.boxes.d
    public void k(com.googlecode.mp4parser.e eVar, ByteBuffer byteBuffer, long j4, com.coremedia.iso.c cVar) throws IOException {
        ByteBuffer allocate = ByteBuffer.allocate(4);
        eVar.read(allocate);
        C((ByteBuffer) allocate.rewind());
        z(eVar, j4 - 4, cVar);
    }

    public void setFlags(int i4) {
        this.f9696p = i4;
    }

    public void setVersion(int i4) {
        this.f9695o = i4;
    }
}
