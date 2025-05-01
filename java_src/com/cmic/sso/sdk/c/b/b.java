package com.cmic.sso.sdk.c.b;

import com.join.mgps.dto.Constant;
import com.qq.e.comm.pi.ACTD;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: GetConfigParameter.java */
/* loaded from: classes2.dex */
public class b extends g {

    /* renamed from: a  reason: collision with root package name */
    private String f9236a;

    /* renamed from: b  reason: collision with root package name */
    private String f9237b;

    /* renamed from: c  reason: collision with root package name */
    private String f9238c;

    /* renamed from: d  reason: collision with root package name */
    private String f9239d;

    /* renamed from: e  reason: collision with root package name */
    private String f9240e;

    /* renamed from: f  reason: collision with root package name */
    private String f9241f;

    /* renamed from: g  reason: collision with root package name */
    private String f9242g;

    @Override // com.cmic.sso.sdk.c.b.g
    public String a() {
        return this.f9241f;
    }

    @Override // com.cmic.sso.sdk.c.b.g
    public JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("version", this.f9236a);
            jSONObject.put("apptype", this.f9237b);
            jSONObject.put("phone_ID", this.f9238c);
            jSONObject.put("certflag", this.f9239d);
            jSONObject.put("sdkversion", this.f9240e);
            jSONObject.put(ACTD.APPID_KEY, this.f9241f);
            jSONObject.put("expandparams", "");
            jSONObject.put(Constant.MD5, this.f9242g);
        } catch (JSONException e5) {
            e5.printStackTrace();
        }
        return jSONObject;
    }

    public void c(String str) {
        this.f9237b = str;
    }

    public void d(String str) {
        this.f9238c = str;
    }

    public void e(String str) {
        this.f9239d = str;
    }

    public void f(String str) {
        this.f9240e = str;
    }

    public void g(String str) {
        this.f9241f = str;
    }

    public void h(String str) {
        this.f9242g = str;
    }

    @Override // com.cmic.sso.sdk.c.b.g
    protected String a(String str) {
        return this.f9236a + this.f9240e + this.f9241f + "iYm0HAnkxQtpvN44";
    }

    public void b(String str) {
        this.f9236a = str;
    }
}
