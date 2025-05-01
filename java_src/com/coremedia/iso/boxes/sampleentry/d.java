package com.coremedia.iso.boxes.sampleentry;

import com.coremedia.iso.i;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.Arrays;
import tv.danmaku.ijk.media.player.IjkMediaMeta;
/* compiled from: MpegSampleEntry.java */
/* loaded from: classes2.dex */
public class d extends a {
    public d() {
        super("mp4s");
    }

    @Override // com.coremedia.iso.boxes.sampleentry.a, com.googlecode.mp4parser.b, com.coremedia.iso.boxes.d
    public void a(WritableByteChannel writableByteChannel) throws IOException {
        writableByteChannel.write(B());
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.position(6);
        i.f(allocate, this.f9871o);
        writableByteChannel.write((ByteBuffer) allocate.rewind());
        u(writableByteChannel);
    }

    @Override // com.googlecode.mp4parser.b, com.coremedia.iso.boxes.d
    public long getSize() {
        long y2 = y() + 8;
        return y2 + ((this.f13605m || y2 >= IjkMediaMeta.AV_CH_WIDE_RIGHT) ? 16 : 8);
    }

    @Override // com.coremedia.iso.boxes.sampleentry.a, com.googlecode.mp4parser.b, com.coremedia.iso.boxes.d
    public void k(com.googlecode.mp4parser.e eVar, ByteBuffer byteBuffer, long j4, com.coremedia.iso.c cVar) throws IOException {
        ByteBuffer allocate = ByteBuffer.allocate(8);
        eVar.read(allocate);
        allocate.position(6);
        this.f9871o = com.coremedia.iso.g.i(allocate);
        z(eVar, j4 - 8, cVar);
    }

    @Override // com.googlecode.mp4parser.d
    public String toString() {
        return "MpegSampleEntry" + Arrays.asList(t());
    }

    public d(String str) {
        super(str);
    }
}
