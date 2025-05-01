package com.coremedia.iso.boxes.sampleentry;

import com.coremedia.iso.i;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import tv.danmaku.ijk.media.player.IjkMediaMeta;
/* compiled from: Ovc1VisualSampleEntryImpl.java */
/* loaded from: classes2.dex */
public class e extends a {

    /* renamed from: q  reason: collision with root package name */
    public static final String f9898q = "ovc1";

    /* renamed from: p  reason: collision with root package name */
    private byte[] f9899p;

    public e() {
        super(f9898q);
        this.f9899p = new byte[0];
    }

    public byte[] C() {
        return this.f9899p;
    }

    public void D(byte[] bArr) {
        this.f9899p = bArr;
    }

    @Override // com.coremedia.iso.boxes.sampleentry.a, com.googlecode.mp4parser.b, com.coremedia.iso.boxes.d
    public void a(WritableByteChannel writableByteChannel) throws IOException {
        writableByteChannel.write(B());
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.position(6);
        i.f(allocate, this.f9871o);
        writableByteChannel.write((ByteBuffer) allocate.rewind());
        writableByteChannel.write(ByteBuffer.wrap(this.f9899p));
    }

    @Override // com.googlecode.mp4parser.b, com.coremedia.iso.boxes.d
    public long getSize() {
        int i4 = 16;
        if (!this.f13605m && this.f9899p.length + 16 < IjkMediaMeta.AV_CH_WIDE_RIGHT) {
            i4 = 8;
        }
        return i4 + this.f9899p.length + 8;
    }

    @Override // com.coremedia.iso.boxes.sampleentry.a, com.googlecode.mp4parser.b, com.coremedia.iso.boxes.d
    public void k(com.googlecode.mp4parser.e eVar, ByteBuffer byteBuffer, long j4, com.coremedia.iso.c cVar) throws IOException {
        ByteBuffer allocate = ByteBuffer.allocate(com.googlecode.mp4parser.util.c.a(j4));
        eVar.read(allocate);
        allocate.position(6);
        this.f9871o = com.coremedia.iso.g.i(allocate);
        byte[] bArr = new byte[allocate.remaining()];
        this.f9899p = bArr;
        allocate.get(bArr);
    }
}
