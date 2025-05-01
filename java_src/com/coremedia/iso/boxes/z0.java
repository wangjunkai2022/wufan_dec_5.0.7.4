package com.coremedia.iso.boxes;

import java.nio.ByteBuffer;
import org.aspectj.lang.c;
/* compiled from: StaticChunkOffsetBox.java */
/* loaded from: classes2.dex */
public class z0 extends f {

    /* renamed from: u  reason: collision with root package name */
    public static final String f10035u = "stco";

    /* renamed from: v  reason: collision with root package name */
    private static final /* synthetic */ c.b f10036v = null;

    /* renamed from: w  reason: collision with root package name */
    private static final /* synthetic */ c.b f10037w = null;

    /* renamed from: t  reason: collision with root package name */
    private long[] f10038t;

    static {
        s();
    }

    public z0() {
        super(f10035u);
        this.f10038t = new long[0];
    }

    private static /* synthetic */ void s() {
        org.aspectj.runtime.reflect.e eVar = new org.aspectj.runtime.reflect.e("StaticChunkOffsetBox.java", z0.class);
        f10036v = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getChunkOffsets", "com.coremedia.iso.boxes.StaticChunkOffsetBox", "", "", "", "[J"), 39);
        f10037w = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setChunkOffsets", "com.coremedia.iso.boxes.StaticChunkOffsetBox", "[J", "chunkOffsets", "", "void"), 48);
    }

    @Override // com.googlecode.mp4parser.a
    public void b(ByteBuffer byteBuffer) {
        t(byteBuffer);
        int a5 = com.googlecode.mp4parser.util.c.a(com.coremedia.iso.g.l(byteBuffer));
        this.f10038t = new long[a5];
        for (int i4 = 0; i4 < a5; i4++) {
            this.f10038t[i4] = com.coremedia.iso.g.l(byteBuffer);
        }
    }

    @Override // com.googlecode.mp4parser.a
    protected void c(ByteBuffer byteBuffer) {
        u(byteBuffer);
        com.coremedia.iso.i.i(byteBuffer, this.f10038t.length);
        for (long j4 : this.f10038t) {
            com.coremedia.iso.i.i(byteBuffer, j4);
        }
    }

    @Override // com.googlecode.mp4parser.a
    protected long e() {
        return (this.f10038t.length * 4) + 8;
    }

    @Override // com.coremedia.iso.boxes.f
    public long[] v() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(f10036v, this, this));
        return this.f10038t;
    }

    @Override // com.coremedia.iso.boxes.f
    public void w(long[] jArr) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(f10037w, this, this, jArr));
        this.f10038t = jArr;
    }
}
