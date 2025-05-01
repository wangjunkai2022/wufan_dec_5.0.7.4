package com.papa.controller.core.hardware;
/* compiled from: GamepadHardwareInfo.java */
/* loaded from: classes5.dex */
public class c extends a {

    /* renamed from: p  reason: collision with root package name */
    private String f58139p;

    /* renamed from: q  reason: collision with root package name */
    private byte[] f58140q;

    /* renamed from: r  reason: collision with root package name */
    private byte[] f58141r;

    /* renamed from: s  reason: collision with root package name */
    private int f58142s;

    /* renamed from: t  reason: collision with root package name */
    private int f58143t;

    public c() {
    }

    @Override // com.papa.controller.core.hardware.a
    public byte[] a() {
        return super.b(new byte[]{6});
    }

    public int k() {
        return this.f58142s;
    }

    public int l() {
        return this.f58143t;
    }

    public byte[] m() {
        return this.f58141r;
    }

    public String n() {
        return this.f58139p;
    }

    public byte[] o() {
        return this.f58140q;
    }

    public void p(int i4) {
        this.f58142s = i4;
    }

    public void q(int i4) {
        this.f58143t = i4;
    }

    public void r(byte[] bArr) {
        this.f58141r = bArr;
    }

    public void s(String str) {
        this.f58139p = str;
    }

    public void t(byte[] bArr) {
        this.f58140q = bArr;
    }

    public c(byte[] bArr) {
        super(bArr);
        if (this.f58137d != 246) {
            return;
        }
        int i4 = 16;
        byte[] bArr2 = new byte[16];
        byte[] bArr3 = new byte[2];
        byte[] bArr4 = new byte[2];
        if (this.f58136c > 20) {
            System.arraycopy(bArr, 5, bArr2, 0, 16);
            int i5 = 15;
            while (true) {
                if (i5 < 0) {
                    break;
                } else if (bArr2[i5] != 0) {
                    i4 = i5 + 1;
                    break;
                } else {
                    i5--;
                }
            }
            this.f58139p = new String(bArr2, 0, i4);
        }
        if (this.f58136c > 22) {
            System.arraycopy(bArr, 21, bArr3, 0, 2);
            this.f58140q = bArr3;
        }
        if (this.f58136c > 24) {
            System.arraycopy(bArr, 23, bArr4, 0, 2);
            this.f58141r = bArr4;
        }
        if (this.f58136c > 25) {
            byte b5 = bArr[25];
            this.f58142s = b5 & 1;
            this.f58143t = b5 & 2;
        }
    }
}
