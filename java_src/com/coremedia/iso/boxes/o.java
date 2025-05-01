package com.coremedia.iso.boxes;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import tv.danmaku.ijk.media.player.IjkMediaMeta;
/* compiled from: DataReferenceBox.java */
/* loaded from: classes2.dex */
public class o extends com.googlecode.mp4parser.b implements v {

    /* renamed from: q  reason: collision with root package name */
    public static final String f9818q = "dref";

    /* renamed from: o  reason: collision with root package name */
    private int f9819o;

    /* renamed from: p  reason: collision with root package name */
    private int f9820p;

    public o() {
        super(f9818q);
    }

    @Override // com.googlecode.mp4parser.b, com.coremedia.iso.boxes.d
    public void a(WritableByteChannel writableByteChannel) throws IOException {
        writableByteChannel.write(B());
        ByteBuffer allocate = ByteBuffer.allocate(8);
        com.coremedia.iso.i.m(allocate, this.f9819o);
        com.coremedia.iso.i.h(allocate, this.f9820p);
        com.coremedia.iso.i.i(allocate, t().size());
        writableByteChannel.write((ByteBuffer) allocate.rewind());
        u(writableByteChannel);
    }

    @Override // com.coremedia.iso.boxes.v
    public int getFlags() {
        return this.f9820p;
    }

    @Override // com.googlecode.mp4parser.b, com.coremedia.iso.boxes.d
    public long getSize() {
        long y2 = y() + 8;
        return y2 + ((this.f13605m || 8 + y2 >= IjkMediaMeta.AV_CH_WIDE_RIGHT) ? 16 : 8);
    }

    @Override // com.coremedia.iso.boxes.v
    public int getVersion() {
        return this.f9819o;
    }

    @Override // com.googlecode.mp4parser.b, com.coremedia.iso.boxes.d
    public void k(com.googlecode.mp4parser.e eVar, ByteBuffer byteBuffer, long j4, com.coremedia.iso.c cVar) throws IOException {
        ByteBuffer allocate = ByteBuffer.allocate(8);
        eVar.read(allocate);
        allocate.rewind();
        this.f9819o = com.coremedia.iso.g.p(allocate);
        this.f9820p = com.coremedia.iso.g.k(allocate);
        z(eVar, j4 - 8, cVar);
    }

    @Override // com.coremedia.iso.boxes.v
    public void setFlags(int i4) {
        this.f9820p = i4;
    }

    @Override // com.coremedia.iso.boxes.v
    public void setVersion(int i4) {
        this.f9819o = i4;
    }
}
