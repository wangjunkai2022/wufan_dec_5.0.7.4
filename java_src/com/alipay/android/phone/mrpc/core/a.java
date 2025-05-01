package com.alipay.android.phone.mrpc.core;
/* loaded from: classes2.dex */
public final class a extends Exception {

    /* renamed from: d  reason: collision with root package name */
    private static final long f4513d = -6320569206365033676L;

    /* renamed from: e  reason: collision with root package name */
    public static final int f4514e = 0;

    /* renamed from: f  reason: collision with root package name */
    public static final int f4515f = 1;

    /* renamed from: g  reason: collision with root package name */
    public static final int f4516g = 2;

    /* renamed from: h  reason: collision with root package name */
    public static final int f4517h = 3;

    /* renamed from: i  reason: collision with root package name */
    public static final int f4518i = 4;

    /* renamed from: j  reason: collision with root package name */
    public static final int f4519j = 5;

    /* renamed from: k  reason: collision with root package name */
    public static final int f4520k = 6;

    /* renamed from: l  reason: collision with root package name */
    public static final int f4521l = 7;

    /* renamed from: m  reason: collision with root package name */
    public static final int f4522m = 8;

    /* renamed from: n  reason: collision with root package name */
    public static final int f4523n = 9;

    /* renamed from: b  reason: collision with root package name */
    private int f4524b;

    /* renamed from: c  reason: collision with root package name */
    private String f4525c;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public a(java.lang.Integer r3, java.lang.String r4) {
        /*
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Http Transport error"
            r0.append(r1)
            if (r3 == 0) goto L19
            java.lang.String r1 = "["
            r0.append(r1)
            r0.append(r3)
            java.lang.String r1 = "]"
            r0.append(r1)
        L19:
            java.lang.String r1 = " : "
            r0.append(r1)
            if (r4 == 0) goto L23
            r0.append(r4)
        L23:
            java.lang.String r0 = r0.toString()
            r2.<init>(r0)
            int r3 = r3.intValue()
            r2.f4524b = r3
            r2.f4525c = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.android.phone.mrpc.core.a.<init>(java.lang.Integer, java.lang.String):void");
    }

    private a(String str) {
        super(str);
        this.f4524b = 0;
        this.f4525c = str;
    }

    public final int a() {
        return this.f4524b;
    }

    public final String b() {
        return this.f4525c;
    }
}
