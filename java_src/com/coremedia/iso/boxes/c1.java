package com.coremedia.iso.boxes;

import java.nio.ByteBuffer;
import org.aspectj.lang.c;
/* compiled from: SyncSampleBox.java */
/* loaded from: classes2.dex */
public class c1 extends com.googlecode.mp4parser.c {

    /* renamed from: t  reason: collision with root package name */
    public static final String f9560t = "stss";

    /* renamed from: u  reason: collision with root package name */
    private static final /* synthetic */ c.b f9561u = null;

    /* renamed from: v  reason: collision with root package name */
    private static final /* synthetic */ c.b f9562v = null;

    /* renamed from: w  reason: collision with root package name */
    private static final /* synthetic */ c.b f9563w = null;

    /* renamed from: s  reason: collision with root package name */
    private long[] f9564s;

    static {
        s();
    }

    public c1() {
        super(f9560t);
    }

    private static /* synthetic */ void s() {
        org.aspectj.runtime.reflect.e eVar = new org.aspectj.runtime.reflect.e("SyncSampleBox.java", c1.class);
        f9561u = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getSampleNumber", "com.coremedia.iso.boxes.SyncSampleBox", "", "", "", "[J"), 46);
        f9562v = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "toString", "com.coremedia.iso.boxes.SyncSampleBox", "", "", "", "java.lang.String"), 77);
        f9563w = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setSampleNumber", "com.coremedia.iso.boxes.SyncSampleBox", "[J", "sampleNumber", "", "void"), 81);
    }

    @Override // com.googlecode.mp4parser.a
    public void b(ByteBuffer byteBuffer) {
        t(byteBuffer);
        int a5 = com.googlecode.mp4parser.util.c.a(com.coremedia.iso.g.l(byteBuffer));
        this.f9564s = new long[a5];
        for (int i4 = 0; i4 < a5; i4++) {
            this.f9564s[i4] = com.coremedia.iso.g.l(byteBuffer);
        }
    }

    @Override // com.googlecode.mp4parser.a
    protected void c(ByteBuffer byteBuffer) {
        u(byteBuffer);
        com.coremedia.iso.i.i(byteBuffer, this.f9564s.length);
        for (long j4 : this.f9564s) {
            com.coremedia.iso.i.i(byteBuffer, j4);
        }
    }

    @Override // com.googlecode.mp4parser.a
    protected long e() {
        return (this.f9564s.length * 4) + 8;
    }

    public String toString() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(f9562v, this, this));
        return "SyncSampleBox[entryCount=" + this.f9564s.length + "]";
    }

    public long[] v() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(f9561u, this, this));
        return this.f9564s;
    }

    public void w(long[] jArr) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(f9563w, this, this, jArr));
        this.f9564s = jArr;
    }
}
