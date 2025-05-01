package com.googlecode.mp4parser.boxes.apple;

import com.swift.sandhook.annotation.MethodReflectParams;
import java.nio.ByteBuffer;
import org.aspectj.lang.c;
/* compiled from: AppleVariableSignedIntegerBox.java */
/* loaded from: classes3.dex */
public abstract class j0 extends j {
    private static final /* synthetic */ c.b A = null;
    private static final /* synthetic */ c.b B = null;
    private static final /* synthetic */ c.b C = null;
    private static final /* synthetic */ c.b D = null;

    /* renamed from: y  reason: collision with root package name */
    long f13633y;

    /* renamed from: z  reason: collision with root package name */
    int f13634z;

    static {
        s();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public j0(String str) {
        super(str, 15);
        this.f13634z = 1;
    }

    private static /* synthetic */ void s() {
        org.aspectj.runtime.reflect.e eVar = new org.aspectj.runtime.reflect.e("AppleVariableSignedIntegerBox.java", j0.class);
        A = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getIntLength", "com.googlecode.mp4parser.boxes.apple.AppleVariableSignedIntegerBox", "", "", "", MethodReflectParams.INT), 19);
        B = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setIntLength", "com.googlecode.mp4parser.boxes.apple.AppleVariableSignedIntegerBox", MethodReflectParams.INT, "intLength", "", "void"), 23);
        C = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getValue", "com.googlecode.mp4parser.boxes.apple.AppleVariableSignedIntegerBox", "", "", "", MethodReflectParams.LONG), 27);
        D = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setValue", "com.googlecode.mp4parser.boxes.apple.AppleVariableSignedIntegerBox", MethodReflectParams.LONG, "value", "", "void"), 36);
    }

    @Override // com.googlecode.mp4parser.boxes.apple.j
    protected byte[] C() {
        int v2 = v();
        ByteBuffer wrap = ByteBuffer.wrap(new byte[v2]);
        com.coremedia.iso.j.a(this.f13633y, wrap, v2);
        return wrap.array();
    }

    public int E() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(A, this, this));
        return this.f13634z;
    }

    public long F() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(C, this, this));
        if (!l()) {
            n();
        }
        return this.f13633y;
    }

    public void G(int i4) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(B, this, this, org.aspectj.runtime.internal.e.k(i4)));
        this.f13634z = i4;
    }

    public void H(long j4) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(D, this, this, org.aspectj.runtime.internal.e.m(j4)));
        if (j4 <= 127 && j4 > -128) {
            this.f13634z = 1;
        } else if (j4 <= 32767 && j4 > -32768 && this.f13634z < 2) {
            this.f13634z = 2;
        } else if (j4 <= 8388607 && j4 > -8388608 && this.f13634z < 3) {
            this.f13634z = 3;
        } else {
            this.f13634z = 4;
        }
        this.f13633y = j4;
    }

    @Override // com.googlecode.mp4parser.boxes.apple.j
    protected int v() {
        return this.f13634z;
    }

    @Override // com.googlecode.mp4parser.boxes.apple.j
    protected void y(ByteBuffer byteBuffer) {
        int remaining = byteBuffer.remaining();
        this.f13633y = com.coremedia.iso.h.a(byteBuffer, remaining);
        this.f13634z = remaining;
    }
}
