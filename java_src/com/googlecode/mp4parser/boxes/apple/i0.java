package com.googlecode.mp4parser.boxes.apple;

import com.swift.sandhook.annotation.MethodReflectParams;
import java.nio.ByteBuffer;
import org.aspectj.lang.c;
/* compiled from: AppleTrackNumberBox.java */
/* loaded from: classes3.dex */
public class i0 extends j {
    private static final /* synthetic */ c.b A = null;
    private static final /* synthetic */ c.b B = null;
    private static final /* synthetic */ c.b C = null;
    private static final /* synthetic */ c.b D = null;

    /* renamed from: y  reason: collision with root package name */
    int f13621y;

    /* renamed from: z  reason: collision with root package name */
    int f13622z;

    static {
        s();
    }

    public i0() {
        super("trkn", 0);
    }

    private static /* synthetic */ void s() {
        org.aspectj.runtime.reflect.e eVar = new org.aspectj.runtime.reflect.e("AppleTrackNumberBox.java", i0.class);
        A = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getA", "com.googlecode.mp4parser.boxes.apple.AppleTrackNumberBox", "", "", "", MethodReflectParams.INT), 16);
        B = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setA", "com.googlecode.mp4parser.boxes.apple.AppleTrackNumberBox", MethodReflectParams.INT, "a", "", "void"), 20);
        C = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getB", "com.googlecode.mp4parser.boxes.apple.AppleTrackNumberBox", "", "", "", MethodReflectParams.INT), 24);
        D = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setB", "com.googlecode.mp4parser.boxes.apple.AppleTrackNumberBox", MethodReflectParams.INT, com.kuaishou.weapon.p0.t.f55693l, "", "void"), 28);
    }

    @Override // com.googlecode.mp4parser.boxes.apple.j
    protected byte[] C() {
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.putInt(this.f13621y);
        allocate.putInt(this.f13622z);
        return allocate.array();
    }

    public int E() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(A, this, this));
        return this.f13621y;
    }

    public int F() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(C, this, this));
        return this.f13622z;
    }

    public void G(int i4) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(B, this, this, org.aspectj.runtime.internal.e.k(i4)));
        this.f13621y = i4;
    }

    public void H(int i4) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(D, this, this, org.aspectj.runtime.internal.e.k(i4)));
        this.f13622z = i4;
    }

    @Override // com.googlecode.mp4parser.boxes.apple.j
    protected int v() {
        return 8;
    }

    @Override // com.googlecode.mp4parser.boxes.apple.j
    protected void y(ByteBuffer byteBuffer) {
        this.f13621y = byteBuffer.getInt();
        this.f13622z = byteBuffer.getInt();
    }
}
