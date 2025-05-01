package com.switfpass.pay.utils;

import android.app.Activity;
import android.content.Intent;
/* loaded from: classes5.dex */
public class g {

    /* renamed from: a  reason: collision with root package name */
    public String f61877a;

    /* renamed from: b  reason: collision with root package name */
    public Intent f61878b;

    /* renamed from: c  reason: collision with root package name */
    public int f61879c;

    /* renamed from: d  reason: collision with root package name */
    public Activity f61880d;

    public g() {
        this.f61879c = 0;
    }

    public g(String str, Intent intent) {
        this.f61879c = 0;
        this.f61877a = str;
        this.f61878b = intent;
    }

    public g(String str, Intent intent, int i4, Activity activity) {
        this.f61879c = 0;
        this.f61877a = str;
        this.f61878b = intent;
        this.f61879c = i4;
        this.f61880d = activity;
    }

    public Intent a() {
        return this.f61878b;
    }

    public String b() {
        return this.f61877a;
    }

    public int c() {
        return this.f61879c;
    }

    public void d(Intent intent) {
        this.f61878b = intent;
    }

    public void e(String str) {
        this.f61877a = str;
    }

    public void f(int i4) {
        this.f61879c = i4;
    }
}
