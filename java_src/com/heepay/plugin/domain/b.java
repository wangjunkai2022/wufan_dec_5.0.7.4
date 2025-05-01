package com.heepay.plugin.domain;

import android.text.TextUtils;
/* loaded from: classes3.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private String f14413a;

    /* renamed from: b  reason: collision with root package name */
    private String f14414b;

    /* renamed from: c  reason: collision with root package name */
    private String f14415c;

    public b(String str) {
        String[] split;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        for (String str2 : str.split(";")) {
            if (str2.startsWith("resultStatus")) {
                this.f14413a = a(str2, "resultStatus");
            }
            if (str2.startsWith("result")) {
                this.f14414b = a(str2, "result");
            }
            if (str2.startsWith("memo")) {
                this.f14415c = a(str2, "memo");
            }
        }
    }

    private String a(String str, String str2) {
        String str3 = str2 + "={";
        return str.substring(str.indexOf(str3) + str3.length(), str.lastIndexOf("}"));
    }

    public String a() {
        return this.f14413a;
    }

    public String toString() {
        return "resultStatus={" + this.f14413a + "};memo={" + this.f14415c + "};result={" + this.f14414b + "}";
    }
}
