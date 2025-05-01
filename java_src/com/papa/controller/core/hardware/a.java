package com.papa.controller.core.hardware;
/* compiled from: GamepadBase.java */
/* loaded from: classes5.dex */
public class a {

    /* renamed from: e  reason: collision with root package name */
    protected static final String f58123e = "GB";

    /* renamed from: f  reason: collision with root package name */
    protected static final int f58124f = 16;

    /* renamed from: g  reason: collision with root package name */
    public static final int f58125g = 1;

    /* renamed from: h  reason: collision with root package name */
    public static final int f58126h = 2;

    /* renamed from: i  reason: collision with root package name */
    public static final int f58127i = 8;

    /* renamed from: j  reason: collision with root package name */
    public static final int f58128j = 3;

    /* renamed from: k  reason: collision with root package name */
    public static final int f58129k = 5;

    /* renamed from: l  reason: collision with root package name */
    public static final int f58130l = 6;

    /* renamed from: m  reason: collision with root package name */
    public static final int f58131m = 246;

    /* renamed from: n  reason: collision with root package name */
    public static final int f58132n = 19;

    /* renamed from: o  reason: collision with root package name */
    public static final int f58133o = 20;

    /* renamed from: a  reason: collision with root package name */
    protected String f58134a;

    /* renamed from: b  reason: collision with root package name */
    protected int f58135b;

    /* renamed from: c  reason: collision with root package name */
    protected int f58136c;

    /* renamed from: d  reason: collision with root package name */
    protected int f58137d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a() {
    }

    public byte[] a() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public byte[] b(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        byte[] bytes = f58123e.getBytes();
        int length = bytes.length + 2 + bArr.length;
        byte[] bArr2 = {16, (byte) length};
        byte[] bArr3 = new byte[length];
        System.arraycopy(bytes, 0, bArr3, 0, bytes.length);
        System.arraycopy(bArr2, 0, bArr3, bytes.length, 2);
        System.arraycopy(bArr, 0, bArr3, bytes.length + 2, bArr.length);
        return bArr3;
    }

    public String c() {
        return this.f58134a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int d(byte b5) {
        return b5 & 255;
    }

    public int e() {
        return this.f58136c;
    }

    public int f() {
        return this.f58135b;
    }

    public void g(String str) {
        this.f58134a = str;
    }

    public int getType() {
        return this.f58137d;
    }

    public void h(int i4) {
        this.f58136c = i4;
    }

    public void i(int i4) {
        this.f58137d = i4;
    }

    public void j(int i4) {
        this.f58135b = i4;
    }

    public a(byte[] bArr) {
        if (bArr == null) {
            return;
        }
        int length = bArr.length;
        this.f58136c = length;
        if (length > 5) {
            byte[] bArr2 = new byte[2];
            this.f58135b = d(bArr[2]);
            this.f58137d = d(bArr[4]);
            System.arraycopy(bArr, 0, bArr2, 0, 2);
            this.f58134a = new String(bArr2);
        }
    }
}
