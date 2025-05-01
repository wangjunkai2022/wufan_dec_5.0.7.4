package com.googlecode.mp4parser.boxes.piff;

import com.coremedia.iso.boxes.k1;
import com.googlecode.mp4parser.annotations.DoNotParseDetail;
import com.googlecode.mp4parser.j;
import com.swift.sandhook.annotation.MethodReflectParams;
import io.netty.handler.codec.memcache.binary.BinaryMemcacheOpcodes;
import org.aspectj.lang.c;
/* compiled from: PiffSampleEncryptionBox.java */
/* loaded from: classes3.dex */
public class a extends com.googlecode.mp4parser.boxes.b {
    private static final /* synthetic */ c.b C = null;
    private static final /* synthetic */ c.b D = null;
    private static final /* synthetic */ c.b E = null;
    private static final /* synthetic */ c.b F = null;
    private static final /* synthetic */ c.b G = null;
    private static final /* synthetic */ c.b H = null;

    static {
        s();
    }

    public a() {
        super(k1.f9761p);
    }

    private static /* synthetic */ void s() {
        org.aspectj.runtime.reflect.e eVar = new org.aspectj.runtime.reflect.e("PiffSampleEncryptionBox.java", a.class);
        C = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getAlgorithmId", "com.googlecode.mp4parser.boxes.piff.PiffSampleEncryptionBox", "", "", "", MethodReflectParams.INT), 46);
        D = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setAlgorithmId", "com.googlecode.mp4parser.boxes.piff.PiffSampleEncryptionBox", MethodReflectParams.INT, "algorithmId", "", "void"), 50);
        E = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getIvSize", "com.googlecode.mp4parser.boxes.piff.PiffSampleEncryptionBox", "", "", "", MethodReflectParams.INT), 54);
        F = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setIvSize", "com.googlecode.mp4parser.boxes.piff.PiffSampleEncryptionBox", MethodReflectParams.INT, "ivSize", "", "void"), 58);
        G = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getKid", "com.googlecode.mp4parser.boxes.piff.PiffSampleEncryptionBox", "", "", "", "[B"), 62);
        H = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setKid", "com.googlecode.mp4parser.boxes.piff.PiffSampleEncryptionBox", "[B", "kid", "", "void"), 66);
    }

    public int D() {
        j.b().c(org.aspectj.runtime.reflect.e.v(C, this, this));
        return this.f13737s;
    }

    public int E() {
        j.b().c(org.aspectj.runtime.reflect.e.v(E, this, this));
        return this.f13738t;
    }

    public byte[] F() {
        j.b().c(org.aspectj.runtime.reflect.e.v(G, this, this));
        return this.f13739u;
    }

    public void G(int i4) {
        j.b().c(org.aspectj.runtime.reflect.e.w(D, this, this, org.aspectj.runtime.internal.e.k(i4)));
        this.f13737s = i4;
    }

    public void H(int i4) {
        j.b().c(org.aspectj.runtime.reflect.e.w(F, this, this, org.aspectj.runtime.internal.e.k(i4)));
        this.f13738t = i4;
    }

    public void I(byte[] bArr) {
        j.b().c(org.aspectj.runtime.reflect.e.w(H, this, this, bArr));
        this.f13739u = bArr;
    }

    @DoNotParseDetail
    public void J(boolean z4) {
        if (z4) {
            setFlags(getFlags() | 1);
        } else {
            setFlags(getFlags() & 16777214);
        }
    }

    @Override // com.googlecode.mp4parser.a
    public byte[] i() {
        return new byte[]{-94, 57, 79, 82, 90, -101, 79, BinaryMemcacheOpcodes.DELETEQ, -94, 68, 108, 66, 124, 100, -115, -12};
    }

    @Override // com.googlecode.mp4parser.boxes.b
    @DoNotParseDetail
    public boolean y() {
        return (getFlags() & 1) > 0;
    }
}
