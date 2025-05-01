package com.googlecode.mp4parser.boxes.apple;

import com.swift.sandhook.annotation.MethodReflectParams;
import java.nio.ByteBuffer;
import org.aspectj.lang.c;
/* compiled from: AppleDiskNumberBox.java */
/* loaded from: classes3.dex */
public class l extends j {
    private static final /* synthetic */ c.b A = null;
    private static final /* synthetic */ c.b B = null;
    private static final /* synthetic */ c.b C = null;
    private static final /* synthetic */ c.b D = null;

    /* renamed from: y  reason: collision with root package name */
    int f13635y;

    /* renamed from: z  reason: collision with root package name */
    short f13636z;

    static {
        s();
    }

    public l() {
        super("disk", 0);
    }

    private static /* synthetic */ void s() {
        org.aspectj.runtime.reflect.e eVar = new org.aspectj.runtime.reflect.e("AppleDiskNumberBox.java", l.class);
        A = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getA", "com.googlecode.mp4parser.boxes.apple.AppleDiskNumberBox", "", "", "", MethodReflectParams.INT), 16);
        B = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setA", "com.googlecode.mp4parser.boxes.apple.AppleDiskNumberBox", MethodReflectParams.INT, "a", "", "void"), 20);
        C = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getB", "com.googlecode.mp4parser.boxes.apple.AppleDiskNumberBox", "", "", "", MethodReflectParams.SHORT), 24);
        D = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setB", "com.googlecode.mp4parser.boxes.apple.AppleDiskNumberBox", MethodReflectParams.SHORT, com.kuaishou.weapon.p0.t.f55693l, "", "void"), 28);
    }

    @Override // com.googlecode.mp4parser.boxes.apple.j
    protected byte[] C() {
        ByteBuffer allocate = ByteBuffer.allocate(6);
        allocate.putInt(this.f13635y);
        allocate.putShort(this.f13636z);
        return allocate.array();
    }

    public int E() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(A, this, this));
        return this.f13635y;
    }

    public short F() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(C, this, this));
        return this.f13636z;
    }

    public void G(int i4) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(B, this, this, org.aspectj.runtime.internal.e.k(i4)));
        this.f13635y = i4;
    }

    public void H(short s4) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(D, this, this, org.aspectj.runtime.internal.e.o(s4)));
        this.f13636z = s4;
    }

    @Override // com.googlecode.mp4parser.boxes.apple.j
    protected int v() {
        return 6;
    }

    @Override // com.googlecode.mp4parser.boxes.apple.j
    protected void y(ByteBuffer byteBuffer) {
        this.f13635y = byteBuffer.getInt();
        this.f13636z = byteBuffer.getShort();
    }
}
