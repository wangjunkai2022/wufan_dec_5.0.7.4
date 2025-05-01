package com.googlecode.mp4parser.boxes.apple;

import java.nio.ByteBuffer;
import org.aspectj.lang.c;
/* compiled from: AppleCoverBox.java */
/* loaded from: classes3.dex */
public class i extends j {
    private static final int A = 14;
    private static final /* synthetic */ c.b B = null;
    private static final /* synthetic */ c.b C = null;
    private static final /* synthetic */ c.b D = null;

    /* renamed from: z  reason: collision with root package name */
    private static final int f13619z = 13;

    /* renamed from: y  reason: collision with root package name */
    private byte[] f13620y;

    static {
        s();
    }

    public i() {
        super("covr", 1);
    }

    private void F(byte[] bArr, int i4) {
        this.f13620y = bArr;
        this.f13630o = i4;
    }

    private static /* synthetic */ void s() {
        org.aspectj.runtime.reflect.e eVar = new org.aspectj.runtime.reflect.e("AppleCoverBox.java", i.class);
        B = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getCoverData", "com.googlecode.mp4parser.boxes.apple.AppleCoverBox", "", "", "", "[B"), 21);
        C = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setJpg", "com.googlecode.mp4parser.boxes.apple.AppleCoverBox", "[B", "data", "", "void"), 25);
        D = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setPng", "com.googlecode.mp4parser.boxes.apple.AppleCoverBox", "[B", "data", "", "void"), 29);
    }

    @Override // com.googlecode.mp4parser.boxes.apple.j
    protected byte[] C() {
        return this.f13620y;
    }

    public byte[] E() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(B, this, this));
        return this.f13620y;
    }

    public void G(byte[] bArr) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(C, this, this, bArr));
        F(bArr, 13);
    }

    public void H(byte[] bArr) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(D, this, this, bArr));
        F(bArr, 14);
    }

    @Override // com.googlecode.mp4parser.boxes.apple.j
    protected int v() {
        return this.f13620y.length;
    }

    @Override // com.googlecode.mp4parser.boxes.apple.j
    protected void y(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[byteBuffer.limit()];
        this.f13620y = bArr;
        byteBuffer.get(bArr);
    }
}
