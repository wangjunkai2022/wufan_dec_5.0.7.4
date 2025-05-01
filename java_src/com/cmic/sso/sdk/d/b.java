package com.cmic.sso.sdk.d;

import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import com.cmic.sso.sdk.c.b.g;
import com.qq.e.comm.pi.ACTD;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: LogBean.java */
/* loaded from: classes2.dex */
public class b extends g {
    private String A;
    private String B;

    /* renamed from: o  reason: collision with root package name */
    private JSONArray f9303o;

    /* renamed from: y  reason: collision with root package name */
    private String f9313y;

    /* renamed from: z  reason: collision with root package name */
    private String f9314z;

    /* renamed from: b  reason: collision with root package name */
    private String f9290b = null;

    /* renamed from: c  reason: collision with root package name */
    private String f9291c = null;

    /* renamed from: d  reason: collision with root package name */
    private String f9292d = null;

    /* renamed from: e  reason: collision with root package name */
    private String f9293e = null;

    /* renamed from: f  reason: collision with root package name */
    private String f9294f = null;

    /* renamed from: g  reason: collision with root package name */
    private String f9295g = null;

    /* renamed from: h  reason: collision with root package name */
    private String f9296h = null;

    /* renamed from: i  reason: collision with root package name */
    private String f9297i = null;

    /* renamed from: j  reason: collision with root package name */
    private String f9298j = null;

    /* renamed from: k  reason: collision with root package name */
    private String f9299k = "";

    /* renamed from: l  reason: collision with root package name */
    private String f9300l = null;

    /* renamed from: m  reason: collision with root package name */
    private String f9301m = null;

    /* renamed from: n  reason: collision with root package name */
    private String f9302n = null;

    /* renamed from: p  reason: collision with root package name */
    private String f9304p = null;

    /* renamed from: q  reason: collision with root package name */
    private String f9305q = null;

    /* renamed from: r  reason: collision with root package name */
    private String f9306r = null;

    /* renamed from: s  reason: collision with root package name */
    private String f9307s = null;

    /* renamed from: t  reason: collision with root package name */
    private String f9308t = null;

    /* renamed from: u  reason: collision with root package name */
    private String f9309u = null;

    /* renamed from: v  reason: collision with root package name */
    private String f9310v = null;

    /* renamed from: w  reason: collision with root package name */
    private String f9311w = null;

    /* renamed from: x  reason: collision with root package name */
    private String f9312x = null;

    /* renamed from: a  reason: collision with root package name */
    public CopyOnWriteArrayList<Throwable> f9289a = new CopyOnWriteArrayList<>();

    public void A(String str) {
        this.A = str;
    }

    public void B(String str) {
        this.B = str;
    }

    @Override // com.cmic.sso.sdk.c.b.g
    public String a() {
        return null;
    }

    @Override // com.cmic.sso.sdk.c.b.g
    protected String a(String str) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(JSONArray jSONArray) {
        this.f9303o = jSONArray;
    }

    public void b(String str) {
        this.f9290b = str;
    }

    public void c(String str) {
        this.f9313y = str;
    }

    public void d(String str) {
        this.f9311w = str;
    }

    public void e(String str) {
        this.f9312x = str;
    }

    public void f(String str) {
        this.f9307s = str;
    }

    public void g(String str) {
        this.f9301m = str;
    }

    public void h(String str) {
        this.f9300l = str;
    }

    public void i(String str) {
        this.f9299k = str;
    }

    public void j(String str) {
        this.f9292d = str;
    }

    public void k(String str) {
        this.f9293e = str;
    }

    public void l(String str) {
        this.f9294f = str;
    }

    public void m(String str) {
        this.f9297i = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void n(String str) {
        this.f9310v = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void o(String str) {
        this.f9304p = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void p(String str) {
        this.f9308t = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void q(String str) {
        this.f9309u = str;
    }

    public void r(String str) {
        this.f9302n = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void s(String str) {
        this.f9291c = str;
    }

    public void t(String str) {
        this.f9295g = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void v(String str) {
        this.f9306r = str;
    }

    public void w(String str) {
        this.f9296h = str;
    }

    public void x(String str) {
        this.f9298j = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void y(String str) {
        this.f9305q = str;
    }

    public void z(String str) {
        this.f9314z = str;
    }

    @Override // com.cmic.sso.sdk.c.b.g
    public JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(ACTD.APPID_KEY, this.f9290b);
            jSONObject.put("traceId", this.f9291c);
            jSONObject.put(TTDownloadField.TT_APP_NAME, this.f9292d);
            jSONObject.put("appVersion", this.f9293e);
            jSONObject.put("sdkVersion", com.cmic.sso.sdk.auth.c.SDK_VERSION);
            jSONObject.put("clientType", q.a.f73126a);
            jSONObject.put("timeOut", this.f9294f);
            jSONObject.put("requestTime", this.f9295g);
            jSONObject.put("responseTime", this.f9296h);
            jSONObject.put("elapsedTime", this.f9297i);
            jSONObject.put("requestType", this.f9298j);
            jSONObject.put("interfaceType", this.f9299k);
            jSONObject.put("interfaceCode", this.f9300l);
            jSONObject.put("interfaceElasped", this.f9301m);
            jSONObject.put("loginType", this.f9302n);
            jSONObject.put("exceptionStackTrace", this.f9303o);
            jSONObject.put("operatorType", this.f9304p);
            jSONObject.put("networkType", this.f9305q);
            jSONObject.put("networkClass", this.f9306r);
            jSONObject.put("brand", this.f9307s);
            jSONObject.put("reqDevice", this.f9308t);
            jSONObject.put("reqSystem", this.f9309u);
            jSONObject.put("simCardNum", this.f9310v);
            jSONObject.put("imsiState", this.f9311w);
            jSONObject.put("resultCode", this.f9312x);
            jSONObject.put("is_phoneStatePermission", this.f9313y);
            jSONObject.put("AID", this.f9314z);
            jSONObject.put("sysOperType", this.A);
            jSONObject.put("scripType", this.B);
        } catch (JSONException e5) {
            e5.printStackTrace();
        }
        return jSONObject;
    }
}
