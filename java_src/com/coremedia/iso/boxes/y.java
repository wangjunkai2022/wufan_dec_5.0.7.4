package com.coremedia.iso.boxes;

import com.swift.sandhook.annotation.MethodReflectParams;
import java.nio.ByteBuffer;
import org.aspectj.lang.c;
/* compiled from: HintMediaHeaderBox.java */
/* loaded from: classes2.dex */
public class y extends a {
    private static final /* synthetic */ c.b A = null;
    private static final /* synthetic */ c.b B = null;

    /* renamed from: w  reason: collision with root package name */
    public static final String f10019w = "hmhd";

    /* renamed from: x  reason: collision with root package name */
    private static final /* synthetic */ c.b f10020x = null;

    /* renamed from: y  reason: collision with root package name */
    private static final /* synthetic */ c.b f10021y = null;

    /* renamed from: z  reason: collision with root package name */
    private static final /* synthetic */ c.b f10022z = null;

    /* renamed from: s  reason: collision with root package name */
    private int f10023s;

    /* renamed from: t  reason: collision with root package name */
    private int f10024t;

    /* renamed from: u  reason: collision with root package name */
    private long f10025u;

    /* renamed from: v  reason: collision with root package name */
    private long f10026v;

    static {
        s();
    }

    public y() {
        super(f10019w);
    }

    private static /* synthetic */ void s() {
        org.aspectj.runtime.reflect.e eVar = new org.aspectj.runtime.reflect.e("HintMediaHeaderBox.java", y.class);
        f10020x = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getMaxPduSize", "com.coremedia.iso.boxes.HintMediaHeaderBox", "", "", "", MethodReflectParams.INT), 42);
        f10021y = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getAvgPduSize", "com.coremedia.iso.boxes.HintMediaHeaderBox", "", "", "", MethodReflectParams.INT), 46);
        f10022z = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getMaxBitrate", "com.coremedia.iso.boxes.HintMediaHeaderBox", "", "", "", MethodReflectParams.LONG), 50);
        A = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getAvgBitrate", "com.coremedia.iso.boxes.HintMediaHeaderBox", "", "", "", MethodReflectParams.LONG), 54);
        B = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "toString", "com.coremedia.iso.boxes.HintMediaHeaderBox", "", "", "", "java.lang.String"), 84);
    }

    @Override // com.googlecode.mp4parser.a
    public void b(ByteBuffer byteBuffer) {
        t(byteBuffer);
        this.f10023s = com.coremedia.iso.g.i(byteBuffer);
        this.f10024t = com.coremedia.iso.g.i(byteBuffer);
        this.f10025u = com.coremedia.iso.g.l(byteBuffer);
        this.f10026v = com.coremedia.iso.g.l(byteBuffer);
        com.coremedia.iso.g.l(byteBuffer);
    }

    @Override // com.googlecode.mp4parser.a
    protected void c(ByteBuffer byteBuffer) {
        u(byteBuffer);
        com.coremedia.iso.i.f(byteBuffer, this.f10023s);
        com.coremedia.iso.i.f(byteBuffer, this.f10024t);
        com.coremedia.iso.i.i(byteBuffer, this.f10025u);
        com.coremedia.iso.i.i(byteBuffer, this.f10026v);
        com.coremedia.iso.i.i(byteBuffer, 0L);
    }

    @Override // com.googlecode.mp4parser.a
    protected long e() {
        return 20L;
    }

    public String toString() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(B, this, this));
        return "HintMediaHeaderBox{maxPduSize=" + this.f10023s + ", avgPduSize=" + this.f10024t + ", maxBitrate=" + this.f10025u + ", avgBitrate=" + this.f10026v + '}';
    }

    public long v() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(A, this, this));
        return this.f10026v;
    }

    public int w() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(f10021y, this, this));
        return this.f10024t;
    }

    public long x() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(f10022z, this, this));
        return this.f10025u;
    }

    public int y() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(f10020x, this, this));
        return this.f10023s;
    }
}
