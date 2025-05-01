package com.papa.controller.core.hardware;
/* compiled from: GamepadState.java */
/* loaded from: classes5.dex */
public class f extends a {

    /* renamed from: p  reason: collision with root package name */
    private int f58155p;

    /* renamed from: q  reason: collision with root package name */
    private int f58156q;

    /* renamed from: r  reason: collision with root package name */
    private int f58157r;

    public f() {
    }

    @Override // com.papa.controller.core.hardware.a
    public byte[] a() {
        return super.b(new byte[]{3});
    }

    public int k() {
        return this.f58155p;
    }

    public int l() {
        return this.f58157r;
    }

    public int m() {
        return this.f58156q;
    }

    public void n(int i4) {
        this.f58155p = i4;
    }

    public void o(int i4) {
        this.f58157r = i4;
    }

    public void p(int i4) {
        this.f58156q = i4;
    }

    public f(byte[] bArr) {
        super(bArr);
        if (this.f58137d != 5) {
            return;
        }
        if (this.f58136c > 5) {
            this.f58155p = d(bArr[5]);
        }
        if (this.f58136c > 6) {
            byte b5 = bArr[6];
            this.f58156q = b5 & 1;
            this.f58157r = b5 & 2;
        }
    }
}
