package com.join.mgps.ad;

import com.join.mgps.dto.SingleGameAdCfgBean;
import java.io.Serializable;
/* loaded from: classes4.dex */
public class RewardAdParams implements Serializable {

    /* renamed from: b  reason: collision with root package name */
    private String f39617b;

    /* renamed from: c  reason: collision with root package name */
    private String f39618c;

    /* renamed from: d  reason: collision with root package name */
    private int f39619d;

    /* renamed from: e  reason: collision with root package name */
    private int f39620e;

    /* renamed from: f  reason: collision with root package name */
    private SingleGameAdCfgBean f39621f;

    public RewardAdParams(String str, String str2, int i4, int i5, SingleGameAdCfgBean singleGameAdCfgBean) {
        this.f39617b = str;
        this.f39618c = str2;
        this.f39619d = i4;
        this.f39620e = i5;
        this.f39621f = singleGameAdCfgBean;
    }

    public String a() {
        return this.f39618c;
    }

    public int b() {
        return this.f39619d;
    }

    public String c() {
        return this.f39617b;
    }

    public SingleGameAdCfgBean d() {
        return this.f39621f;
    }

    public int e() {
        return this.f39620e;
    }

    public void f(String str) {
        this.f39618c = str;
    }

    public void g(int i4) {
        this.f39619d = i4;
    }

    public void h(String str) {
        this.f39617b = str;
    }

    public void i(SingleGameAdCfgBean singleGameAdCfgBean) {
        this.f39621f = singleGameAdCfgBean;
    }

    public void j(int i4) {
        this.f39620e = i4;
    }
}
