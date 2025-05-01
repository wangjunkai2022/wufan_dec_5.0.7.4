package com.join.mgps.event;
/* compiled from: DeleteOrModifyCommentEvent.java */
/* loaded from: classes4.dex */
public class j {

    /* renamed from: a  reason: collision with root package name */
    private int f49910a;

    /* renamed from: b  reason: collision with root package name */
    private String f49911b;

    /* renamed from: c  reason: collision with root package name */
    private double f49912c;

    /* renamed from: d  reason: collision with root package name */
    private long f49913d;

    /* renamed from: e  reason: collision with root package name */
    private String f49914e;

    public j(int i4, String str, double d5, long j4, String str2) {
        this.f49910a = i4;
        this.f49911b = str;
        this.f49912c = d5;
        this.f49913d = j4;
        this.f49914e = str2;
    }

    public String a() {
        return this.f49911b;
    }

    public String b() {
        return this.f49914e;
    }

    public double c() {
        return this.f49912c;
    }

    public long d() {
        return this.f49913d;
    }

    public void e(String str) {
        this.f49911b = str;
    }

    public void f(String str) {
        this.f49914e = str;
    }

    public void g(double d5) {
        this.f49912c = d5;
    }

    public int getType() {
        return this.f49910a;
    }

    public void h(long j4) {
        this.f49913d = j4;
    }

    public void i(int i4) {
        this.f49910a = i4;
    }
}
