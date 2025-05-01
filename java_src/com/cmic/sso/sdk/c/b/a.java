package com.cmic.sso.sdk.c.b;

import java.net.URLEncoder;
/* compiled from: BaseScripParameter.java */
/* loaded from: classes2.dex */
public abstract class a extends g {

    /* renamed from: a  reason: collision with root package name */
    protected String f9213a = "";

    /* renamed from: b  reason: collision with root package name */
    protected String f9214b = "";

    /* renamed from: c  reason: collision with root package name */
    protected String f9215c = "";

    /* renamed from: d  reason: collision with root package name */
    protected String f9216d = "";

    /* renamed from: e  reason: collision with root package name */
    protected String f9217e = "";

    /* renamed from: f  reason: collision with root package name */
    protected String f9218f = "";

    /* renamed from: g  reason: collision with root package name */
    protected String f9219g = "";

    /* renamed from: h  reason: collision with root package name */
    protected String f9220h = "";

    /* renamed from: i  reason: collision with root package name */
    protected String f9221i = "";

    /* renamed from: j  reason: collision with root package name */
    protected String f9222j = "0";

    /* renamed from: k  reason: collision with root package name */
    protected String f9223k = "1.0";

    /* renamed from: l  reason: collision with root package name */
    protected String f9224l = "";

    /* renamed from: m  reason: collision with root package name */
    protected String f9225m = "";

    /* renamed from: n  reason: collision with root package name */
    protected String f9226n = "";

    /* renamed from: o  reason: collision with root package name */
    protected String f9227o = "";

    /* renamed from: p  reason: collision with root package name */
    protected String f9228p = "";

    /* renamed from: q  reason: collision with root package name */
    protected String f9229q = "";

    /* renamed from: r  reason: collision with root package name */
    protected String f9230r = "";

    /* renamed from: s  reason: collision with root package name */
    protected String f9231s = "";

    /* renamed from: t  reason: collision with root package name */
    protected String f9232t = "";

    /* renamed from: u  reason: collision with root package name */
    protected String f9233u = "001";

    /* renamed from: v  reason: collision with root package name */
    protected String f9234v = "";

    /* renamed from: w  reason: collision with root package name */
    protected String f9235w = "";

    @Override // com.cmic.sso.sdk.c.b.g
    public String a() {
        return this.f9215c;
    }

    public void a_(String str) {
        this.f9234v = str;
    }

    public void b(String str) {
        this.f9213a = t(str);
    }

    public void c(String str) {
        this.f9214b = t(str);
    }

    public void d(String str) {
        this.f9215c = t(str);
    }

    public void e(String str) {
        this.f9217e = t(str);
    }

    public void f(String str) {
        this.f9218f = t(str);
    }

    public void g(String str) {
        this.f9219g = URLEncoder.encode(t(str));
    }

    public void h(String str) {
        this.f9220h = URLEncoder.encode(t(str));
    }

    public void i(String str) {
        this.f9221i = URLEncoder.encode(t(str));
    }

    public void j(String str) {
        this.f9222j = t(str);
    }

    public void k(String str) {
        this.f9223k = t(str);
    }

    public void l(String str) {
        this.f9225m = t(str);
    }

    public void m(String str) {
        this.f9226n = t(str);
    }

    public void n(String str) {
        this.f9228p = t(str);
    }

    public void o(String str) {
        this.f9229q = t(str);
    }

    public void p(String str) {
        this.f9230r = t(str);
    }

    public void q(String str) {
        this.f9231s = t(str);
    }

    public void r(String str) {
        this.f9232t = t(str);
    }

    public void s(String str) {
        this.f9235w = str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String t(String str) {
        return str == null ? "" : str;
    }
}
