package com.googlecode.mp4parser.boxes.apple;

import com.swift.sandhook.annotation.MethodReflectParams;
import java.nio.ByteBuffer;
import org.aspectj.lang.c;
/* compiled from: PixelAspectRationAtom.java */
/* loaded from: classes3.dex */
public class s0 extends com.googlecode.mp4parser.a {

    /* renamed from: q  reason: collision with root package name */
    public static final String f13672q = "pasp";

    /* renamed from: r  reason: collision with root package name */
    private static final /* synthetic */ c.b f13673r = null;

    /* renamed from: s  reason: collision with root package name */
    private static final /* synthetic */ c.b f13674s = null;

    /* renamed from: t  reason: collision with root package name */
    private static final /* synthetic */ c.b f13675t = null;

    /* renamed from: u  reason: collision with root package name */
    private static final /* synthetic */ c.b f13676u = null;

    /* renamed from: o  reason: collision with root package name */
    private int f13677o;

    /* renamed from: p  reason: collision with root package name */
    private int f13678p;

    static {
        s();
    }

    public s0() {
        super(f13672q);
    }

    private static /* synthetic */ void s() {
        org.aspectj.runtime.reflect.e eVar = new org.aspectj.runtime.reflect.e("PixelAspectRationAtom.java", s0.class);
        f13673r = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "gethSpacing", "com.googlecode.mp4parser.boxes.apple.PixelAspectRationAtom", "", "", "", MethodReflectParams.INT), 35);
        f13674s = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "sethSpacing", "com.googlecode.mp4parser.boxes.apple.PixelAspectRationAtom", MethodReflectParams.INT, "hSpacing", "", "void"), 39);
        f13675t = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getvSpacing", "com.googlecode.mp4parser.boxes.apple.PixelAspectRationAtom", "", "", "", MethodReflectParams.INT), 43);
        f13676u = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setvSpacing", "com.googlecode.mp4parser.boxes.apple.PixelAspectRationAtom", MethodReflectParams.INT, "vSpacing", "", "void"), 47);
    }

    @Override // com.googlecode.mp4parser.a
    protected void b(ByteBuffer byteBuffer) {
        this.f13677o = byteBuffer.getInt();
        this.f13678p = byteBuffer.getInt();
    }

    @Override // com.googlecode.mp4parser.a
    protected void c(ByteBuffer byteBuffer) {
        byteBuffer.putInt(this.f13677o);
        byteBuffer.putInt(this.f13678p);
    }

    @Override // com.googlecode.mp4parser.a
    protected long e() {
        return 8L;
    }

    public int t() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(f13673r, this, this));
        return this.f13677o;
    }

    public int u() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(f13675t, this, this));
        return this.f13678p;
    }

    public void v(int i4) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(f13674s, this, this, org.aspectj.runtime.internal.e.k(i4)));
        this.f13677o = i4;
    }

    public void w(int i4) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(f13676u, this, this, org.aspectj.runtime.internal.e.k(i4)));
        this.f13678p = i4;
    }
}
