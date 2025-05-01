package com.mp4parser.iso14496.part12;

import com.coremedia.iso.g;
import com.coremedia.iso.i;
import com.googlecode.mp4parser.j;
import com.swift.sandhook.annotation.MethodReflectParams;
import java.nio.ByteBuffer;
import org.aspectj.lang.c;
import org.aspectj.runtime.reflect.e;
/* compiled from: BitRateBox.java */
/* loaded from: classes5.dex */
public final class a extends com.googlecode.mp4parser.a {

    /* renamed from: r  reason: collision with root package name */
    public static final String f57087r = "btrt";

    /* renamed from: s  reason: collision with root package name */
    private static final /* synthetic */ c.b f57088s = null;

    /* renamed from: t  reason: collision with root package name */
    private static final /* synthetic */ c.b f57089t = null;

    /* renamed from: u  reason: collision with root package name */
    private static final /* synthetic */ c.b f57090u = null;

    /* renamed from: v  reason: collision with root package name */
    private static final /* synthetic */ c.b f57091v = null;

    /* renamed from: w  reason: collision with root package name */
    private static final /* synthetic */ c.b f57092w = null;

    /* renamed from: x  reason: collision with root package name */
    private static final /* synthetic */ c.b f57093x = null;

    /* renamed from: o  reason: collision with root package name */
    private long f57094o;

    /* renamed from: p  reason: collision with root package name */
    private long f57095p;

    /* renamed from: q  reason: collision with root package name */
    private long f57096q;

    static {
        s();
    }

    public a() {
        super(f57087r);
    }

    private static /* synthetic */ void s() {
        e eVar = new e("BitRateBox.java", a.class);
        f57088s = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getBufferSizeDb", "com.mp4parser.iso14496.part12.BitRateBox", "", "", "", MethodReflectParams.LONG), 74);
        f57089t = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setBufferSizeDb", "com.mp4parser.iso14496.part12.BitRateBox", MethodReflectParams.LONG, "bufferSizeDb", "", "void"), 82);
        f57090u = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getMaxBitrate", "com.mp4parser.iso14496.part12.BitRateBox", "", "", "", MethodReflectParams.LONG), 90);
        f57091v = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setMaxBitrate", "com.mp4parser.iso14496.part12.BitRateBox", MethodReflectParams.LONG, "maxBitrate", "", "void"), 98);
        f57092w = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getAvgBitrate", "com.mp4parser.iso14496.part12.BitRateBox", "", "", "", MethodReflectParams.LONG), 106);
        f57093x = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setAvgBitrate", "com.mp4parser.iso14496.part12.BitRateBox", MethodReflectParams.LONG, "avgBitrate", "", "void"), 114);
    }

    @Override // com.googlecode.mp4parser.a
    public void b(ByteBuffer byteBuffer) {
        this.f57094o = g.l(byteBuffer);
        this.f57095p = g.l(byteBuffer);
        this.f57096q = g.l(byteBuffer);
    }

    @Override // com.googlecode.mp4parser.a
    protected void c(ByteBuffer byteBuffer) {
        i.i(byteBuffer, this.f57094o);
        i.i(byteBuffer, this.f57095p);
        i.i(byteBuffer, this.f57096q);
    }

    @Override // com.googlecode.mp4parser.a
    protected long e() {
        return 12L;
    }

    public long t() {
        j.b().c(e.v(f57092w, this, this));
        return this.f57096q;
    }

    public long u() {
        j.b().c(e.v(f57088s, this, this));
        return this.f57094o;
    }

    public long v() {
        j.b().c(e.v(f57090u, this, this));
        return this.f57095p;
    }

    public void w(long j4) {
        j.b().c(e.w(f57093x, this, this, org.aspectj.runtime.internal.e.m(j4)));
        this.f57096q = j4;
    }

    public void x(long j4) {
        j.b().c(e.w(f57089t, this, this, org.aspectj.runtime.internal.e.m(j4)));
        this.f57094o = j4;
    }

    public void y(long j4) {
        j.b().c(e.w(f57091v, this, this, org.aspectj.runtime.internal.e.m(j4)));
        this.f57095p = j4;
    }
}
