package com.coremedia.iso.boxes;

import java.nio.ByteBuffer;
import org.aspectj.lang.c;
/* compiled from: ChunkOffset64BitBox.java */
/* loaded from: classes2.dex */
public class e extends f {

    /* renamed from: u  reason: collision with root package name */
    public static final String f9581u = "co64";

    /* renamed from: v  reason: collision with root package name */
    private static final /* synthetic */ c.b f9582v = null;

    /* renamed from: w  reason: collision with root package name */
    private static final /* synthetic */ c.b f9583w = null;

    /* renamed from: t  reason: collision with root package name */
    private long[] f9584t;

    static {
        s();
    }

    public e() {
        super(f9581u);
    }

    private static /* synthetic */ void s() {
        org.aspectj.runtime.reflect.e eVar = new org.aspectj.runtime.reflect.e("ChunkOffset64BitBox.java", e.class);
        f9582v = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getChunkOffsets", "com.coremedia.iso.boxes.ChunkOffset64BitBox", "", "", "", "[J"), 23);
        f9583w = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setChunkOffsets", "com.coremedia.iso.boxes.ChunkOffset64BitBox", "[J", "chunkOffsets", "", "void"), 28);
    }

    @Override // com.googlecode.mp4parser.a
    public void b(ByteBuffer byteBuffer) {
        t(byteBuffer);
        int a5 = com.googlecode.mp4parser.util.c.a(com.coremedia.iso.g.l(byteBuffer));
        this.f9584t = new long[a5];
        for (int i4 = 0; i4 < a5; i4++) {
            this.f9584t[i4] = com.coremedia.iso.g.o(byteBuffer);
        }
    }

    @Override // com.googlecode.mp4parser.a
    protected void c(ByteBuffer byteBuffer) {
        u(byteBuffer);
        com.coremedia.iso.i.i(byteBuffer, this.f9584t.length);
        for (long j4 : this.f9584t) {
            com.coremedia.iso.i.l(byteBuffer, j4);
        }
    }

    @Override // com.googlecode.mp4parser.a
    protected long e() {
        return (this.f9584t.length * 8) + 8;
    }

    @Override // com.coremedia.iso.boxes.f
    public long[] v() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(f9582v, this, this));
        return this.f9584t;
    }

    @Override // com.coremedia.iso.boxes.f
    public void w(long[] jArr) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(f9583w, this, this, jArr));
        this.f9584t = jArr;
    }
}
