package com.mp4parser.iso14496.part30;

import com.coremedia.iso.g;
import com.coremedia.iso.i;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import tv.danmaku.ijk.media.player.IjkMediaMeta;
/* compiled from: XMLSubtitleSampleEntry.java */
/* loaded from: classes5.dex */
public class e extends com.coremedia.iso.boxes.sampleentry.a {

    /* renamed from: s  reason: collision with root package name */
    public static final String f57250s = "stpp";

    /* renamed from: p  reason: collision with root package name */
    private String f57251p;

    /* renamed from: q  reason: collision with root package name */
    private String f57252q;

    /* renamed from: r  reason: collision with root package name */
    private String f57253r;

    public e() {
        super(f57250s);
        this.f57251p = "";
        this.f57252q = "";
        this.f57253r = "";
    }

    public String C() {
        return this.f57253r;
    }

    public String D() {
        return this.f57251p;
    }

    public String E() {
        return this.f57252q;
    }

    public void J(String str) {
        this.f57253r = str;
    }

    public void K(String str) {
        this.f57251p = str;
    }

    public void N(String str) {
        this.f57252q = str;
    }

    @Override // com.coremedia.iso.boxes.sampleentry.a, com.googlecode.mp4parser.b, com.coremedia.iso.boxes.d
    public void a(WritableByteChannel writableByteChannel) throws IOException {
        writableByteChannel.write(B());
        ByteBuffer allocate = ByteBuffer.allocate(this.f57251p.length() + 8 + this.f57252q.length() + this.f57253r.length() + 3);
        allocate.position(6);
        i.f(allocate, this.f9871o);
        i.o(allocate, this.f57251p);
        i.o(allocate, this.f57252q);
        i.o(allocate, this.f57253r);
        writableByteChannel.write((ByteBuffer) allocate.rewind());
        u(writableByteChannel);
    }

    @Override // com.googlecode.mp4parser.b, com.coremedia.iso.boxes.d
    public long getSize() {
        int i4 = 8;
        long y2 = y() + this.f57251p.length() + 8 + this.f57252q.length() + this.f57253r.length() + 3;
        return y2 + ((this.f13605m || 8 + y2 >= IjkMediaMeta.AV_CH_WIDE_RIGHT) ? 16 : 16);
    }

    @Override // com.coremedia.iso.boxes.sampleentry.a, com.googlecode.mp4parser.b, com.coremedia.iso.boxes.d
    public void k(com.googlecode.mp4parser.e eVar, ByteBuffer byteBuffer, long j4, com.coremedia.iso.c cVar) throws IOException {
        ByteBuffer allocate = ByteBuffer.allocate(8);
        eVar.read((ByteBuffer) allocate.rewind());
        allocate.position(6);
        this.f9871o = g.i(allocate);
        long position = eVar.position();
        ByteBuffer allocate2 = ByteBuffer.allocate(1024);
        eVar.read((ByteBuffer) allocate2.rewind());
        String g4 = g.g((ByteBuffer) allocate2.rewind());
        this.f57251p = g4;
        eVar.G(g4.length() + position + 1);
        eVar.read((ByteBuffer) allocate2.rewind());
        this.f57252q = g.g((ByteBuffer) allocate2.rewind());
        eVar.G(this.f57251p.length() + position + this.f57252q.length() + 2);
        eVar.read((ByteBuffer) allocate2.rewind());
        this.f57253r = g.g((ByteBuffer) allocate2.rewind());
        eVar.G(position + this.f57251p.length() + this.f57252q.length() + this.f57253r.length() + 3);
        z(eVar, j4 - ((((byteBuffer.remaining() + this.f57251p.length()) + this.f57252q.length()) + this.f57253r.length()) + 3), cVar);
    }
}
