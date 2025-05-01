package com.papa.controller.core.hardware;
/* compiled from: GamepadInput.java */
/* loaded from: classes5.dex */
public class d extends a {
    private int A;
    private int B;
    private int C;
    private int D;
    private int E;
    private int F;
    private int G;
    private int[] H;
    private int[] I;
    private int[] J;
    private int[] K;

    /* renamed from: p  reason: collision with root package name */
    private int f58144p;

    /* renamed from: q  reason: collision with root package name */
    private int f58145q;

    /* renamed from: r  reason: collision with root package name */
    private int f58146r;

    /* renamed from: s  reason: collision with root package name */
    private int f58147s;

    /* renamed from: t  reason: collision with root package name */
    private int f58148t;

    /* renamed from: u  reason: collision with root package name */
    private int f58149u;

    /* renamed from: v  reason: collision with root package name */
    private int f58150v;

    /* renamed from: w  reason: collision with root package name */
    private int f58151w;

    /* renamed from: x  reason: collision with root package name */
    private int f58152x;

    /* renamed from: y  reason: collision with root package name */
    private int f58153y;

    /* renamed from: z  reason: collision with root package name */
    private int f58154z;

    public d() {
    }

    private int H(byte b5, int i4) {
        return ((b5 & 255) & i4) == i4 ? 1 : 0;
    }

    private int[] p(byte[] bArr, int i4) {
        int[] iArr = new int[2];
        if (bArr == null || bArr.length < i4 + 2) {
            iArr[0] = 128;
            iArr[1] = 128;
            return iArr;
        }
        iArr[0] = bArr[i4] & 255;
        iArr[1] = bArr[i4 + 1] & 255;
        return iArr;
    }

    public int A() {
        return this.f58147s;
    }

    public int B() {
        return this.f58148t;
    }

    public int C() {
        return this.f58150v;
    }

    public int D() {
        return this.f58151w;
    }

    public int E() {
        return this.f58144p;
    }

    public int F() {
        return this.B;
    }

    public int G() {
        return this.C;
    }

    public void I(int i4) {
        this.f58154z = i4;
    }

    public void J(int[] iArr) {
        this.H = iArr;
    }

    public void K(int[] iArr) {
        this.I = iArr;
    }

    public void L(int[] iArr) {
        this.J = iArr;
    }

    public void M(int[] iArr) {
        this.K = iArr;
    }

    public void N(int i4) {
        this.A = i4;
    }

    public void O(int i4) {
        this.f58149u = i4;
    }

    public void P(int i4) {
        this.f58145q = i4;
    }

    public void Q(int i4) {
        this.f58152x = i4;
    }

    public void R(int i4) {
        this.f58153y = i4;
    }

    public void S(int i4) {
        this.D = i4;
    }

    public void T(int i4) {
        this.F = i4;
    }

    public void U(int i4) {
        this.f58146r = i4;
    }

    public void V(int i4) {
        this.E = i4;
    }

    public void W(int i4) {
        this.G = i4;
    }

    public void X(int i4) {
        this.f58147s = i4;
    }

    public void Y(int i4) {
        this.f58148t = i4;
    }

    public void Z(int i4) {
        this.f58150v = i4;
    }

    public void a0(int i4) {
        this.f58151w = i4;
    }

    public void b0(int i4) {
        this.f58144p = i4;
    }

    public void c0(int i4) {
        this.B = i4;
    }

    public void d0(int i4) {
        this.C = i4;
    }

    public int k() {
        return this.f58154z;
    }

    public int l() {
        return this.H[0];
    }

    public int m() {
        return this.I[0];
    }

    public int n() {
        return this.J[0];
    }

    public int o() {
        return this.K[0];
    }

    public int q() {
        return this.A;
    }

    public int r() {
        return this.f58149u;
    }

    public int s() {
        return this.f58145q;
    }

    public int t() {
        return this.f58152x;
    }

    public int u() {
        return this.f58153y;
    }

    public int v() {
        return this.D;
    }

    public int w() {
        return this.F;
    }

    public int x() {
        return this.f58146r;
    }

    public int y() {
        return this.E;
    }

    public int z() {
        return this.G;
    }

    public d(byte[] bArr) {
        super(bArr);
        if (this.f58136c < 23 || this.f58137d != 1) {
            return;
        }
        byte b5 = bArr[5];
        this.f58144p = H(b5, 1);
        this.f58145q = H(b5, 2);
        this.f58146r = H(b5, 4);
        this.f58147s = H(b5, 8);
        this.f58148t = H(b5, 16);
        this.f58149u = H(b5, 32);
        this.f58150v = H(b5, 64);
        this.f58151w = H(b5, 128);
        byte b6 = bArr[6];
        this.f58152x = H(b6, 1);
        this.f58153y = H(b6, 2);
        this.f58154z = d(bArr[7]);
        this.A = d(bArr[8]);
        this.B = d(bArr[9]);
        this.C = d(bArr[10]);
        this.D = d(bArr[11]);
        this.E = d(bArr[12]);
        this.F = d(bArr[13]);
        this.G = d(bArr[14]);
        this.H = p(bArr, 15);
        this.I = p(bArr, 17);
        this.J = p(bArr, 19);
        this.K = p(bArr, 21);
    }
}
