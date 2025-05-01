package com.join.mgps.event;

import com.join.mgps.dto.CloudListDataBean;
/* compiled from: CloudEvent.java */
/* loaded from: classes4.dex */
public class f {

    /* renamed from: a  reason: collision with root package name */
    private CloudListDataBean f49887a;

    /* renamed from: b  reason: collision with root package name */
    private int f49888b;

    /* renamed from: c  reason: collision with root package name */
    private String f49889c;

    /* renamed from: d  reason: collision with root package name */
    private int f49890d;

    /* renamed from: e  reason: collision with root package name */
    private String f49891e;

    public f() {
        this.f49888b = 0;
    }

    public CloudListDataBean a() {
        return this.f49887a;
    }

    public String b() {
        return this.f49891e;
    }

    public String c() {
        return this.f49889c;
    }

    public int d() {
        return this.f49890d;
    }

    public int e() {
        return this.f49888b;
    }

    public void f(CloudListDataBean cloudListDataBean) {
        this.f49887a = cloudListDataBean;
    }

    public void g(String str) {
        this.f49891e = str;
    }

    public void h(String str) {
        this.f49889c = str;
    }

    public void i(int i4) {
        this.f49890d = i4;
    }

    public void j(int i4) {
        this.f49888b = i4;
    }

    public f(CloudListDataBean cloudListDataBean, int i4) {
        this.f49888b = 0;
        this.f49887a = cloudListDataBean;
        this.f49888b = i4;
    }

    public f(CloudListDataBean cloudListDataBean, int i4, String str, int i5, String str2) {
        this.f49888b = 0;
        this.f49887a = cloudListDataBean;
        this.f49888b = i4;
        this.f49889c = str;
        this.f49890d = i5;
        this.f49891e = str2;
    }
}
