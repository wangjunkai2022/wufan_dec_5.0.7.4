package com.heepay.plugin.domain;

import com.bytedance.sdk.openadsdk.mediation.MediationConstant;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.zip.GZIPInputStream;
import org.json.JSONObject;
/* loaded from: classes3.dex */
public class g {

    /* renamed from: a  reason: collision with root package name */
    public Exception f14435a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f14436b;

    /* renamed from: c  reason: collision with root package name */
    public String f14437c;

    /* renamed from: d  reason: collision with root package name */
    public String f14438d;

    /* renamed from: e  reason: collision with root package name */
    public String f14439e;

    /* renamed from: f  reason: collision with root package name */
    public String f14440f;

    /* renamed from: g  reason: collision with root package name */
    public String f14441g;

    /* renamed from: h  reason: collision with root package name */
    public String f14442h;

    /* renamed from: i  reason: collision with root package name */
    public String f14443i;

    /* renamed from: j  reason: collision with root package name */
    public String f14444j;

    /* renamed from: k  reason: collision with root package name */
    public String f14445k;

    /* renamed from: l  reason: collision with root package name */
    public String f14446l;

    /* renamed from: m  reason: collision with root package name */
    public String f14447m;

    /* renamed from: n  reason: collision with root package name */
    public int f14448n;

    public g() {
        this.f14436b = false;
    }

    public g(boolean z4, String str, String str2) {
        this.f14436b = false;
        this.f14436b = z4;
        this.f14437c = str2;
        this.f14438d = str;
    }

    private String a(String str) {
        String str2 = this.f14440f;
        if (str2 != null && str2.length() > 0) {
            int i4 = 0;
            try {
                i4 = Integer.parseInt(this.f14440f);
            } catch (Exception unused) {
            }
            if (i4 == 1) {
                try {
                    GZIPInputStream gZIPInputStream = new GZIPInputStream(new ByteArrayInputStream(com.heepay.plugin.a.c.a(str)));
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(gZIPInputStream, Charset.forName("UTF-8")));
                    StringBuffer stringBuffer = new StringBuffer();
                    while (true) {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            String stringBuffer2 = stringBuffer.toString();
                            com.heepay.plugin.c.c.b("GetUnzipValue", "unzipped data is: " + stringBuffer2);
                            gZIPInputStream.close();
                            return stringBuffer2;
                        }
                        stringBuffer.append(readLine);
                    }
                } catch (Exception e5) {
                    com.heepay.plugin.c.c.e("ServiceReturn", com.heepay.plugin.c.b.a(e5));
                }
            }
        }
        return str;
    }

    public String a() {
        return a(this.f14439e);
    }

    public String b() {
        String str = this.f14437c;
        return (str == null || str.length() == 0) ? this.f14438d : str;
    }

    public JSONObject c() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("hasError", this.f14436b);
            jSONObject.put("message", this.f14437c);
            jSONObject.put(MediationConstant.KEY_ERROR_CODE, this.f14438d);
            jSONObject.put("returnValue", this.f14439e);
            jSONObject.put("returnStatus", this.f14448n);
            jSONObject.put("extValue1", this.f14440f);
            jSONObject.put("extValue2", this.f14441g);
            jSONObject.put("extValue3", this.f14442h);
            jSONObject.put("extValue4", this.f14443i);
            jSONObject.put("extValue5", this.f14444j);
            jSONObject.put("extValue6", this.f14445k);
            jSONObject.put("extValue7", this.f14446l);
            jSONObject.put("extValue8", this.f14447m);
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }

    public String toString() {
        return c().toString();
    }
}
