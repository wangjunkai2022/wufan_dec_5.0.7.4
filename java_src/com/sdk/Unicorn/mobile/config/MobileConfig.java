package com.sdk.Unicorn.mobile.config;

import com.sdk.Unicorn.base.module.config.BaseConfig;
import com.sdk.f.c;
import com.sdk.l.a;
/* loaded from: classes5.dex */
public class MobileConfig implements c {
    public String apk = BaseConfig.apk;
    public String cm = BaseConfig.cm;

    /* renamed from: c  reason: collision with root package name */
    public int f59915c = 1;

    /* renamed from: v  reason: collision with root package name */
    public String f59918v = "1.0";

    /* renamed from: n  reason: collision with root package name */
    public String f59916n = "ZzxOAuth";

    /* renamed from: r  reason: collision with root package name */
    public long f59917r = System.currentTimeMillis();

    public String getApiKey() {
        return this.apk;
    }

    public String getCM() {
        return this.cm;
    }

    public String toJsonString() {
        return a.a(this);
    }
}
