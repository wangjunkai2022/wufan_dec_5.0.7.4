package com.googlecode.mp4parser;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import tv.danmaku.ijk.media.player.IjkMediaMeta;
/* compiled from: AbstractContainerBox.java */
/* loaded from: classes3.dex */
public class b extends d implements com.coremedia.iso.boxes.d {

    /* renamed from: k  reason: collision with root package name */
    com.coremedia.iso.boxes.j f13603k;

    /* renamed from: l  reason: collision with root package name */
    protected String f13604l;

    /* renamed from: m  reason: collision with root package name */
    protected boolean f13605m;

    /* renamed from: n  reason: collision with root package name */
    private long f13606n;

    public b(String str) {
        this.f13604l = str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public ByteBuffer B() {
        ByteBuffer wrap;
        if (!this.f13605m && getSize() < IjkMediaMeta.AV_CH_WIDE_RIGHT) {
            wrap = ByteBuffer.wrap(new byte[]{0, 0, 0, 0, this.f13604l.getBytes()[0], this.f13604l.getBytes()[1], this.f13604l.getBytes()[2], this.f13604l.getBytes()[3]});
            com.coremedia.iso.i.i(wrap, getSize());
        } else {
            byte[] bArr = new byte[16];
            bArr[3] = 1;
            bArr[4] = this.f13604l.getBytes()[0];
            bArr[5] = this.f13604l.getBytes()[1];
            bArr[6] = this.f13604l.getBytes()[2];
            bArr[7] = this.f13604l.getBytes()[3];
            wrap = ByteBuffer.wrap(bArr);
            wrap.position(8);
            com.coremedia.iso.i.l(wrap, getSize());
        }
        wrap.rewind();
        return wrap;
    }

    public void a(WritableByteChannel writableByteChannel) throws IOException {
        writableByteChannel.write(B());
        u(writableByteChannel);
    }

    @Override // com.coremedia.iso.boxes.d
    public com.coremedia.iso.boxes.j getParent() {
        return this.f13603k;
    }

    public long getSize() {
        long y2 = y();
        return y2 + ((this.f13605m || 8 + y2 >= IjkMediaMeta.AV_CH_WIDE_RIGHT) ? 16 : 8);
    }

    @Override // com.coremedia.iso.boxes.d
    public String getType() {
        return this.f13604l;
    }

    @Override // com.coremedia.iso.boxes.d
    public long j() {
        return this.f13606n;
    }

    public void k(e eVar, ByteBuffer byteBuffer, long j4, com.coremedia.iso.c cVar) throws IOException {
        this.f13606n = eVar.position() - byteBuffer.remaining();
        this.f13605m = byteBuffer.remaining() == 16;
        z(eVar, j4, cVar);
    }

    @Override // com.coremedia.iso.boxes.d
    public void p(com.coremedia.iso.boxes.j jVar) {
        this.f13603k = jVar;
    }

    @Override // com.googlecode.mp4parser.d
    public void z(e eVar, long j4, com.coremedia.iso.c cVar) throws IOException {
        this.f14081c = eVar;
        long position = eVar.position();
        this.f14083e = position;
        this.f14084f = position - ((this.f13605m || 8 + j4 >= IjkMediaMeta.AV_CH_WIDE_RIGHT) ? 16 : 8);
        eVar.G(eVar.position() + j4);
        this.f14085g = eVar.position();
        this.f14080b = cVar;
    }
}
