package com.join.mgps.Util;

import java.io.Serializable;
/* loaded from: classes3.dex */
public class IntentToDetialBean implements Serializable {

    /* renamed from: b  reason: collision with root package name */
    private String f27430b;

    /* renamed from: c  reason: collision with root package name */
    private float f27431c;

    /* renamed from: d  reason: collision with root package name */
    private String f27432d;

    /* renamed from: e  reason: collision with root package name */
    private String f27433e;

    /* renamed from: f  reason: collision with root package name */
    private int f27434f;

    public IntentToDetialBean() {
        this.f27434f = 0;
    }

    public String a() {
        return this.f27432d;
    }

    public String b() {
        return this.f27430b;
    }

    public int c() {
        return this.f27434f;
    }

    public String d() {
        return this.f27433e;
    }

    public float e() {
        return this.f27431c;
    }

    public void f(String str) {
        this.f27432d = str;
    }

    public void g(String str) {
        this.f27430b = str;
    }

    public void h(int i4) {
        this.f27434f = i4;
    }

    public void i(String str) {
        this.f27433e = str;
    }

    public void j(float f5) {
        this.f27431c = f5;
    }

    public IntentToDetialBean(String str, float f5, String str2, String str3, int i4) {
        this.f27434f = 0;
        this.f27430b = str;
        this.f27431c = f5;
        this.f27432d = str2;
        this.f27433e = str3;
        this.f27434f = i4;
    }
}
