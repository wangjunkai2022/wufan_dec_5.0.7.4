package com.alipay.sdk.packet;

import android.text.TextUtils;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    String f4890a;

    /* renamed from: b  reason: collision with root package name */
    public String f4891b;

    public b(String str, String str2) {
        this.f4890a = str;
        this.f4891b = str2;
    }

    private void b(String str) {
        this.f4890a = str;
    }

    private String c() {
        return this.f4890a;
    }

    private void d(String str) {
        this.f4891b = str;
    }

    private String e() {
        return this.f4891b;
    }

    public final JSONObject a() {
        if (TextUtils.isEmpty(this.f4891b)) {
            return null;
        }
        try {
            return new JSONObject(this.f4891b);
        } catch (Exception unused) {
            return null;
        }
    }

    public final String toString() {
        return "\nenvelop:" + this.f4890a + "\nbody:" + this.f4891b;
    }
}
