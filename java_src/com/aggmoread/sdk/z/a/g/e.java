package com.aggmoread.sdk.z.a.g;
/* loaded from: classes2.dex */
public final class e {

    /* renamed from: c  reason: collision with root package name */
    public static final e f2108c = new e(50005, "容器已销毁！");

    /* renamed from: d  reason: collision with root package name */
    public static final e f2109d = new e(50005, "未指定广告容器！");

    /* renamed from: e  reason: collision with root package name */
    public static final e f2110e = new e(50006, "图片加载失败！");

    /* renamed from: f  reason: collision with root package name */
    public static final e f2111f = new e(50007, "图片加载失败！");

    /* renamed from: g  reason: collision with root package name */
    public static final e f2112g = new e(50008, "activity is null！");

    /* renamed from: h  reason: collision with root package name */
    public static final e f2113h = new e(50001, "广告未初始化！");

    /* renamed from: a  reason: collision with root package name */
    private int f2114a;

    /* renamed from: b  reason: collision with root package name */
    private String f2115b;

    public e(int i4, String str) {
        this.f2114a = -1;
        this.f2114a = i4;
        this.f2115b = str;
    }

    public int a() {
        return this.f2114a;
    }

    public String b() {
        return this.f2115b;
    }

    public String toString() {
        return "JuHeApiError{errorCode=" + this.f2114a + ", errorMessage='" + this.f2115b + "'}";
    }
}
