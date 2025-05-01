package com.googlecode.mp4parser;

import com.coremedia.iso.boxes.v;
import com.googlecode.mp4parser.annotations.DoNotParseDetail;
import com.swift.sandhook.annotation.MethodReflectParams;
import java.nio.ByteBuffer;
import org.aspectj.lang.c;
/* compiled from: AbstractFullBox.java */
/* loaded from: classes3.dex */
public abstract class c extends a implements v {

    /* renamed from: q  reason: collision with root package name */
    private static final /* synthetic */ c.b f14065q = null;

    /* renamed from: r  reason: collision with root package name */
    private static final /* synthetic */ c.b f14066r = null;

    /* renamed from: o  reason: collision with root package name */
    private int f14067o;

    /* renamed from: p  reason: collision with root package name */
    private int f14068p;

    static {
        s();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public c(String str) {
        super(str);
    }

    private static /* synthetic */ void s() {
        org.aspectj.runtime.reflect.e eVar = new org.aspectj.runtime.reflect.e("AbstractFullBox.java", c.class);
        f14065q = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setVersion", "com.googlecode.mp4parser.AbstractFullBox", MethodReflectParams.INT, "version", "", "void"), 51);
        f14066r = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setFlags", "com.googlecode.mp4parser.AbstractFullBox", MethodReflectParams.INT, "flags", "", "void"), 64);
    }

    @DoNotParseDetail
    public int getFlags() {
        if (!this.f13147e) {
            n();
        }
        return this.f14068p;
    }

    @Override // com.coremedia.iso.boxes.v
    @DoNotParseDetail
    public int getVersion() {
        if (!this.f13147e) {
            n();
        }
        return this.f14067o;
    }

    @Override // com.coremedia.iso.boxes.v
    public void setFlags(int i4) {
        j.b().c(org.aspectj.runtime.reflect.e.w(f14066r, this, this, org.aspectj.runtime.internal.e.k(i4)));
        this.f14068p = i4;
    }

    @Override // com.coremedia.iso.boxes.v
    public void setVersion(int i4) {
        j.b().c(org.aspectj.runtime.reflect.e.w(f14065q, this, this, org.aspectj.runtime.internal.e.k(i4)));
        this.f14067o = i4;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final long t(ByteBuffer byteBuffer) {
        this.f14067o = com.coremedia.iso.g.p(byteBuffer);
        this.f14068p = com.coremedia.iso.g.k(byteBuffer);
        return 4L;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void u(ByteBuffer byteBuffer) {
        com.coremedia.iso.i.m(byteBuffer, this.f14067o);
        com.coremedia.iso.i.h(byteBuffer, this.f14068p);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public c(String str, byte[] bArr) {
        super(str, bArr);
    }
}
