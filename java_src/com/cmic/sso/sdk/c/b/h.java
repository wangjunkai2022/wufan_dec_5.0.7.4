package com.cmic.sso.sdk.c.b;

import com.join.mgps.dto.Constant;
import com.qq.e.comm.pi.ACTD;
import com.tencent.stat.DeviceInfo;
import com.umeng.umcrash.UMCrash;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ScripAndTokenParameter.java */
/* loaded from: classes2.dex */
public class h extends a {

    /* renamed from: x  reason: collision with root package name */
    protected String f9263x = "";

    /* renamed from: y  reason: collision with root package name */
    protected String f9264y = "";

    @Override // com.cmic.sso.sdk.c.b.g
    protected String a(String str) {
        return this.f9214b + this.f9215c + this.f9216d + this.f9217e + this.f9218f + this.f9219g + this.f9220h + this.f9221i + this.f9222j + this.f9225m + this.f9226n + str + this.f9227o + this.f9229q + this.f9230r + this.f9231s + this.f9232t + this.f9233u + this.f9234v + this.f9263x + this.f9264y + this.f9235w;
    }

    @Override // com.cmic.sso.sdk.c.b.a
    public void a_(String str) {
        this.f9234v = t(str);
    }

    @Override // com.cmic.sso.sdk.c.b.g
    public JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(DeviceInfo.TAG_VERSION, this.f9213a);
            jSONObject.put("sdkver", this.f9214b);
            jSONObject.put(ACTD.APPID_KEY, this.f9215c);
            jSONObject.put("imsi", this.f9216d);
            jSONObject.put("operatortype", this.f9217e);
            jSONObject.put("networktype", this.f9218f);
            jSONObject.put("mobilebrand", this.f9219g);
            jSONObject.put("mobilemodel", this.f9220h);
            jSONObject.put("mobilesystem", this.f9221i);
            jSONObject.put("clienttype", this.f9222j);
            jSONObject.put("interfacever", this.f9223k);
            jSONObject.put("expandparams", this.f9224l);
            jSONObject.put("msgid", this.f9225m);
            jSONObject.put(UMCrash.SP_KEY_TIMESTAMP, this.f9226n);
            jSONObject.put("subimsi", this.f9227o);
            jSONObject.put(Constant.MD5, this.f9228p);
            jSONObject.put("apppackage", this.f9229q);
            jSONObject.put("appsign", this.f9230r);
            jSONObject.put("ipv4_list", this.f9231s);
            jSONObject.put("ipv6_list", this.f9232t);
            jSONObject.put("sdkType", this.f9233u);
            jSONObject.put("tempPDR", this.f9234v);
            jSONObject.put("scrip", this.f9263x);
            jSONObject.put("userCapaid", this.f9264y);
            jSONObject.put("funcType", this.f9235w);
        } catch (JSONException e5) {
            e5.printStackTrace();
        }
        return jSONObject;
    }

    public String toString() {
        return this.f9213a + m.a.f71490d + this.f9214b + m.a.f71490d + this.f9215c + m.a.f71490d + this.f9216d + m.a.f71490d + this.f9217e + m.a.f71490d + this.f9218f + m.a.f71490d + this.f9219g + m.a.f71490d + this.f9220h + m.a.f71490d + this.f9221i + m.a.f71490d + this.f9222j + m.a.f71490d + this.f9223k + m.a.f71490d + this.f9224l + m.a.f71490d + this.f9225m + m.a.f71490d + this.f9226n + m.a.f71490d + this.f9227o + m.a.f71490d + this.f9228p + m.a.f71490d + this.f9229q + m.a.f71490d + this.f9230r + "&&" + this.f9231s + m.a.f71490d + this.f9232t + m.a.f71490d + this.f9233u + m.a.f71490d + this.f9234v + m.a.f71490d + this.f9263x + m.a.f71490d + this.f9264y + m.a.f71490d + this.f9235w;
    }

    public void v(String str) {
        this.f9263x = t(str);
    }

    public void w(String str) {
        this.f9264y = t(str);
    }
}
