package com.coremedia.iso.boxes;

import com.swift.sandhook.annotation.MethodReflectParams;
import java.nio.ByteBuffer;
import org.aspectj.lang.c;
/* compiled from: VideoMediaHeaderBox.java */
/* loaded from: classes2.dex */
public class m1 extends a {

    /* renamed from: u  reason: collision with root package name */
    public static final String f9789u = "vmhd";

    /* renamed from: v  reason: collision with root package name */
    private static final /* synthetic */ c.b f9790v = null;

    /* renamed from: w  reason: collision with root package name */
    private static final /* synthetic */ c.b f9791w = null;

    /* renamed from: x  reason: collision with root package name */
    private static final /* synthetic */ c.b f9792x = null;

    /* renamed from: y  reason: collision with root package name */
    private static final /* synthetic */ c.b f9793y = null;

    /* renamed from: z  reason: collision with root package name */
    private static final /* synthetic */ c.b f9794z = null;

    /* renamed from: s  reason: collision with root package name */
    private int f9795s;

    /* renamed from: t  reason: collision with root package name */
    private int[] f9796t;

    static {
        s();
    }

    public m1() {
        super(f9789u);
        this.f9795s = 0;
        this.f9796t = new int[3];
        setFlags(1);
    }

    private static /* synthetic */ void s() {
        org.aspectj.runtime.reflect.e eVar = new org.aspectj.runtime.reflect.e("VideoMediaHeaderBox.java", m1.class);
        f9790v = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getGraphicsmode", "com.coremedia.iso.boxes.VideoMediaHeaderBox", "", "", "", MethodReflectParams.INT), 39);
        f9791w = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getOpcolor", "com.coremedia.iso.boxes.VideoMediaHeaderBox", "", "", "", "[I"), 43);
        f9792x = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "toString", "com.coremedia.iso.boxes.VideoMediaHeaderBox", "", "", "", "java.lang.String"), 71);
        f9793y = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setOpcolor", "com.coremedia.iso.boxes.VideoMediaHeaderBox", "[I", "opcolor", "", "void"), 75);
        f9794z = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setGraphicsmode", "com.coremedia.iso.boxes.VideoMediaHeaderBox", MethodReflectParams.INT, "graphicsmode", "", "void"), 79);
    }

    @Override // com.googlecode.mp4parser.a
    public void b(ByteBuffer byteBuffer) {
        t(byteBuffer);
        this.f9795s = com.coremedia.iso.g.i(byteBuffer);
        this.f9796t = new int[3];
        for (int i4 = 0; i4 < 3; i4++) {
            this.f9796t[i4] = com.coremedia.iso.g.i(byteBuffer);
        }
    }

    @Override // com.googlecode.mp4parser.a
    protected void c(ByteBuffer byteBuffer) {
        u(byteBuffer);
        com.coremedia.iso.i.f(byteBuffer, this.f9795s);
        for (int i4 : this.f9796t) {
            com.coremedia.iso.i.f(byteBuffer, i4);
        }
    }

    @Override // com.googlecode.mp4parser.a
    protected long e() {
        return 12L;
    }

    public String toString() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(f9792x, this, this));
        return "VideoMediaHeaderBox[graphicsmode=" + v() + ";opcolor0=" + w()[0] + ";opcolor1=" + w()[1] + ";opcolor2=" + w()[2] + "]";
    }

    public int v() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(f9790v, this, this));
        return this.f9795s;
    }

    public int[] w() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(f9791w, this, this));
        return this.f9796t;
    }

    public void x(int i4) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(f9794z, this, this, org.aspectj.runtime.internal.e.k(i4)));
        this.f9795s = i4;
    }

    public void y(int[] iArr) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(f9793y, this, this, iArr));
        this.f9796t = iArr;
    }
}
