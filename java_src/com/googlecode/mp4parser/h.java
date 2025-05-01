package com.googlecode.mp4parser;

import com.coremedia.iso.boxes.v;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.List;
import java.util.logging.Logger;
import tv.danmaku.ijk.media.player.IjkMediaMeta;
/* compiled from: FullContainerBox.java */
/* loaded from: classes3.dex */
public abstract class h extends b implements v {

    /* renamed from: q  reason: collision with root package name */
    private static Logger f14092q = Logger.getLogger(h.class.getName());

    /* renamed from: o  reason: collision with root package name */
    private int f14093o;

    /* renamed from: p  reason: collision with root package name */
    private int f14094p;

    public h(String str) {
        super(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.googlecode.mp4parser.b
    public ByteBuffer B() {
        ByteBuffer wrap;
        if (!this.f13605m && getSize() < IjkMediaMeta.AV_CH_WIDE_RIGHT) {
            byte[] bArr = new byte[12];
            bArr[4] = this.f13604l.getBytes()[0];
            bArr[5] = this.f13604l.getBytes()[1];
            bArr[6] = this.f13604l.getBytes()[2];
            bArr[7] = this.f13604l.getBytes()[3];
            wrap = ByteBuffer.wrap(bArr);
            com.coremedia.iso.i.i(wrap, getSize());
            wrap.position(8);
            D(wrap);
        } else {
            byte[] bArr2 = new byte[20];
            bArr2[3] = 1;
            bArr2[4] = this.f13604l.getBytes()[0];
            bArr2[5] = this.f13604l.getBytes()[1];
            bArr2[6] = this.f13604l.getBytes()[2];
            bArr2[7] = this.f13604l.getBytes()[3];
            wrap = ByteBuffer.wrap(bArr2);
            wrap.position(8);
            com.coremedia.iso.i.l(wrap, getSize());
            D(wrap);
        }
        wrap.rewind();
        return wrap;
    }

    protected final long C(ByteBuffer byteBuffer) {
        this.f14093o = com.coremedia.iso.g.p(byteBuffer);
        this.f14094p = com.coremedia.iso.g.k(byteBuffer);
        return 4L;
    }

    protected final void D(ByteBuffer byteBuffer) {
        com.coremedia.iso.i.m(byteBuffer, this.f14093o);
        com.coremedia.iso.i.h(byteBuffer, this.f14094p);
    }

    @Override // com.googlecode.mp4parser.b, com.coremedia.iso.boxes.d
    public void a(WritableByteChannel writableByteChannel) throws IOException {
        super.a(writableByteChannel);
    }

    @Override // com.googlecode.mp4parser.d, com.coremedia.iso.boxes.j
    public <T extends com.coremedia.iso.boxes.d> List<T> g(Class<T> cls) {
        return l(cls, false);
    }

    @Override // com.coremedia.iso.boxes.v
    public int getFlags() {
        return this.f14094p;
    }

    @Override // com.coremedia.iso.boxes.v
    public int getVersion() {
        return this.f14093o;
    }

    @Override // com.googlecode.mp4parser.b, com.coremedia.iso.boxes.d
    public void k(e eVar, ByteBuffer byteBuffer, long j4, com.coremedia.iso.c cVar) throws IOException {
        ByteBuffer allocate = ByteBuffer.allocate(4);
        eVar.read(allocate);
        C((ByteBuffer) allocate.rewind());
        super.k(eVar, byteBuffer, j4, cVar);
    }

    @Override // com.coremedia.iso.boxes.v
    public void setFlags(int i4) {
        this.f14094p = i4;
    }

    @Override // com.coremedia.iso.boxes.v
    public void setVersion(int i4) {
        this.f14093o = i4;
    }

    @Override // com.googlecode.mp4parser.d
    public String toString() {
        return getClass().getSimpleName() + "[childBoxes]";
    }
}
