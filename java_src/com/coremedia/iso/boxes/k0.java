package com.coremedia.iso.boxes;

import com.swift.sandhook.annotation.MethodReflectParams;
import java.nio.ByteBuffer;
import org.aspectj.lang.c;
/* compiled from: OmaDrmAccessUnitFormatBox.java */
/* loaded from: classes2.dex */
public final class k0 extends com.googlecode.mp4parser.c {
    private static final /* synthetic */ c.b A = null;
    private static final /* synthetic */ c.b B = null;
    private static final /* synthetic */ c.b C = null;

    /* renamed from: w  reason: collision with root package name */
    public static final String f9753w = "odaf";

    /* renamed from: x  reason: collision with root package name */
    private static final /* synthetic */ c.b f9754x = null;

    /* renamed from: y  reason: collision with root package name */
    private static final /* synthetic */ c.b f9755y = null;

    /* renamed from: z  reason: collision with root package name */
    private static final /* synthetic */ c.b f9756z = null;

    /* renamed from: s  reason: collision with root package name */
    private boolean f9757s;

    /* renamed from: t  reason: collision with root package name */
    private byte f9758t;

    /* renamed from: u  reason: collision with root package name */
    private int f9759u;

    /* renamed from: v  reason: collision with root package name */
    private int f9760v;

    static {
        s();
    }

    public k0() {
        super(f9753w);
    }

    private static /* synthetic */ void s() {
        org.aspectj.runtime.reflect.e eVar = new org.aspectj.runtime.reflect.e("OmaDrmAccessUnitFormatBox.java", k0.class);
        f9754x = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "isSelectiveEncryption", "com.coremedia.iso.boxes.OmaDrmAccessUnitFormatBox", "", "", "", "boolean"), 46);
        f9755y = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getKeyIndicatorLength", "com.coremedia.iso.boxes.OmaDrmAccessUnitFormatBox", "", "", "", MethodReflectParams.INT), 50);
        f9756z = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getInitVectorLength", "com.coremedia.iso.boxes.OmaDrmAccessUnitFormatBox", "", "", "", MethodReflectParams.INT), 54);
        A = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setInitVectorLength", "com.coremedia.iso.boxes.OmaDrmAccessUnitFormatBox", MethodReflectParams.INT, "initVectorLength", "", "void"), 58);
        B = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setKeyIndicatorLength", "com.coremedia.iso.boxes.OmaDrmAccessUnitFormatBox", MethodReflectParams.INT, "keyIndicatorLength", "", "void"), 62);
        C = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setAllBits", "com.coremedia.iso.boxes.OmaDrmAccessUnitFormatBox", MethodReflectParams.BYTE, "allBits", "", "void"), 66);
    }

    public void A(int i4) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(B, this, this, org.aspectj.runtime.internal.e.k(i4)));
        this.f9759u = i4;
    }

    @Override // com.googlecode.mp4parser.a
    public void b(ByteBuffer byteBuffer) {
        t(byteBuffer);
        byte p4 = (byte) com.coremedia.iso.g.p(byteBuffer);
        this.f9758t = p4;
        this.f9757s = (p4 & 128) == 128;
        this.f9759u = com.coremedia.iso.g.p(byteBuffer);
        this.f9760v = com.coremedia.iso.g.p(byteBuffer);
    }

    @Override // com.googlecode.mp4parser.a
    protected void c(ByteBuffer byteBuffer) {
        u(byteBuffer);
        com.coremedia.iso.i.m(byteBuffer, this.f9758t);
        com.coremedia.iso.i.m(byteBuffer, this.f9759u);
        com.coremedia.iso.i.m(byteBuffer, this.f9760v);
    }

    @Override // com.googlecode.mp4parser.a
    protected long e() {
        return 7L;
    }

    public int v() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(f9756z, this, this));
        return this.f9760v;
    }

    public int w() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(f9755y, this, this));
        return this.f9759u;
    }

    public boolean x() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(f9754x, this, this));
        return this.f9757s;
    }

    public void y(byte b5) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(C, this, this, org.aspectj.runtime.internal.e.c(b5)));
        this.f9758t = b5;
        this.f9757s = (b5 & 128) == 128;
    }

    public void z(int i4) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(A, this, this, org.aspectj.runtime.internal.e.k(i4)));
        this.f9760v = i4;
    }
}
