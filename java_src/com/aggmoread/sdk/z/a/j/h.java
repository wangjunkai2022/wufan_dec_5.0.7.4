package com.aggmoread.sdk.z.a.j;
/* loaded from: classes2.dex */
public class h extends Exception {

    /* renamed from: b  reason: collision with root package name */
    private int f2205b;

    public h(int i4, String str) {
        super(str);
        this.f2205b = 0;
        this.f2205b = i4;
    }

    public h(int i4, String str, Throwable th) {
        super(str, th);
        this.f2205b = 0;
        this.f2205b = i4;
    }

    public h(int i4, Throwable th) {
        super(th);
        this.f2205b = 0;
        this.f2205b = i4;
    }

    public h(String str) {
        super(str);
        this.f2205b = 0;
    }

    public int a() {
        return this.f2205b;
    }
}
