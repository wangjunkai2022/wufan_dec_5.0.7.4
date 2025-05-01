package com.ss.android.downloadlib.addownload.m;
/* loaded from: classes5.dex */
public class n {

    /* renamed from: m  reason: collision with root package name */
    private int f60507m;

    /* renamed from: p  reason: collision with root package name */
    private String f60508p;
    private int vv;

    public n(int i4) {
        this(i4, 0, null);
    }

    public int getType() {
        return this.vv;
    }

    public String m() {
        return this.f60508p;
    }

    public int vv() {
        return this.f60507m;
    }

    public n(int i4, int i5) {
        this(i4, i5, null);
    }

    public n(int i4, String str) {
        this(i4, 0, str);
    }

    public n(int i4, int i5, String str) {
        this.vv = i4;
        this.f60507m = i5;
        this.f60508p = str;
    }
}
