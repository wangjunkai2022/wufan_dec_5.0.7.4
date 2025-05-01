package com.switfpass.pay.activity;

import android.text.TextUtils;
/* loaded from: classes5.dex */
public class q {

    /* renamed from: a  reason: collision with root package name */
    private String f61585a;

    /* renamed from: b  reason: collision with root package name */
    private String f61586b;

    /* renamed from: c  reason: collision with root package name */
    private String f61587c;

    public q(String str) {
        String[] split;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        for (String str2 : str.split(";")) {
            if (str2.startsWith("resultStatus")) {
                this.f61585a = a(str2, "resultStatus");
            }
            if (str2.startsWith("result")) {
                this.f61586b = a(str2, "result");
            }
            if (str2.startsWith("memo")) {
                this.f61587c = a(str2, "memo");
            }
        }
    }

    private static String a(String str, String str2) {
        String str3 = String.valueOf(str2) + "={";
        return str.substring(str.indexOf(str3) + str3.length(), str.lastIndexOf("}"));
    }

    public String b() {
        return this.f61587c;
    }

    public String c() {
        return this.f61586b;
    }

    public String d() {
        return this.f61585a;
    }

    public String toString() {
        return "resultStatus={" + this.f61585a + "};memo={" + this.f61587c + "};result={" + this.f61586b + "}";
    }
}
