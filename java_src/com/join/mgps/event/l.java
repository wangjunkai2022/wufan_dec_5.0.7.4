package com.join.mgps.event;
/* compiled from: DownloadRuntimeEvent.java */
/* loaded from: classes4.dex */
public class l {

    /* renamed from: a  reason: collision with root package name */
    private String f49917a;

    /* renamed from: b  reason: collision with root package name */
    private int f49918b;

    public l(String str, int i4) {
        this.f49917a = str;
        this.f49918b = i4;
    }

    public String a() {
        return this.f49917a;
    }

    public void b(String str) {
        this.f49917a = str;
    }

    public void c(int i4) {
        this.f49918b = i4;
    }

    public int getType() {
        return this.f49918b;
    }
}
