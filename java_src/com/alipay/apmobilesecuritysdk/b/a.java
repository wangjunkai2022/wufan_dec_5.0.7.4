package com.alipay.apmobilesecuritysdk.b;

import java.text.SimpleDateFormat;
import java.util.Calendar;
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private String f4632a;

    /* renamed from: b  reason: collision with root package name */
    private String f4633b;

    /* renamed from: c  reason: collision with root package name */
    private String f4634c;

    /* renamed from: d  reason: collision with root package name */
    private String f4635d;

    /* renamed from: e  reason: collision with root package name */
    private String f4636e;

    /* renamed from: f  reason: collision with root package name */
    private String f4637f;

    /* renamed from: g  reason: collision with root package name */
    private String f4638g;

    public a(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f4632a = str;
        this.f4633b = str2;
        this.f4634c = str3;
        this.f4635d = str4;
        this.f4636e = str5;
        this.f4637f = str6;
        this.f4638g = str7;
    }

    public final String toString() {
        StringBuilder sb;
        String str;
        StringBuilder sb2;
        String str2;
        StringBuilder sb3;
        String str3;
        StringBuffer stringBuffer = new StringBuffer(new SimpleDateFormat("yyyyMMddHHmmssSSS").format(Calendar.getInstance().getTime()));
        stringBuffer.append("," + this.f4632a);
        stringBuffer.append("," + this.f4633b);
        stringBuffer.append("," + this.f4634c);
        stringBuffer.append("," + this.f4635d);
        if (com.alipay.security.mobile.module.commonutils.a.b(this.f4636e) || this.f4636e.length() < 20) {
            sb = new StringBuilder(",");
            str = this.f4636e;
        } else {
            sb = new StringBuilder(",");
            str = this.f4636e.substring(0, 20);
        }
        sb.append(str);
        stringBuffer.append(sb.toString());
        if (com.alipay.security.mobile.module.commonutils.a.b(this.f4637f) || this.f4637f.length() < 20) {
            sb2 = new StringBuilder(",");
            str2 = this.f4637f;
        } else {
            sb2 = new StringBuilder(",");
            str2 = this.f4637f.substring(0, 20);
        }
        sb2.append(str2);
        stringBuffer.append(sb2.toString());
        if (com.alipay.security.mobile.module.commonutils.a.b(this.f4638g) || this.f4638g.length() < 20) {
            sb3 = new StringBuilder(",");
            str3 = this.f4638g;
        } else {
            sb3 = new StringBuilder(",");
            str3 = this.f4638g.substring(0, 20);
        }
        sb3.append(str3);
        stringBuffer.append(sb3.toString());
        return stringBuffer.toString();
    }
}
