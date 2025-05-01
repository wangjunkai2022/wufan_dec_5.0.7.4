package com.efs.sdk.base.core.d;
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public String f10373a;

    /* renamed from: b  reason: collision with root package name */
    public byte f10374b;

    /* renamed from: c  reason: collision with root package name */
    public int f10375c = 0;

    /* renamed from: d  reason: collision with root package name */
    public String f10376d = "none";

    /* renamed from: e  reason: collision with root package name */
    public int f10377e = 1;

    /* renamed from: f  reason: collision with root package name */
    long f10378f = 0;

    /* renamed from: g  reason: collision with root package name */
    int f10379g = 1;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(String str, byte b5) {
        this.f10374b = (byte) 2;
        this.f10373a = str;
        if (b5 > 0 && 3 >= b5) {
            this.f10374b = b5;
            return;
        }
        throw new IllegalArgumentException("log protocol flag invalid : ".concat(String.valueOf((int) b5)));
    }
}
