package com.cmic.sso.sdk.c.b;

import com.tencent.stat.DeviceInfo;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: GetPhoneNubmerNotify.java */
/* loaded from: classes2.dex */
public class d extends g {

    /* renamed from: a  reason: collision with root package name */
    private final String f9244a;

    /* renamed from: b  reason: collision with root package name */
    private final String f9245b;

    /* renamed from: c  reason: collision with root package name */
    private final String f9246c;

    /* renamed from: d  reason: collision with root package name */
    private String f9247d = "authz";

    /* renamed from: e  reason: collision with root package name */
    private String f9248e;

    public d(String str, String str2, String str3) {
        this.f9244a = str;
        this.f9245b = str2;
        this.f9246c = str3;
    }

    @Override // com.cmic.sso.sdk.c.b.g
    public String a() {
        return this.f9244a;
    }

    @Override // com.cmic.sso.sdk.c.b.g
    protected String a(String str) {
        return null;
    }

    public void b(String str) {
        this.f9247d = str;
    }

    public void c(String str) {
        this.f9248e = str;
    }

    @Override // com.cmic.sso.sdk.c.b.g
    public JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(DeviceInfo.TAG_VERSION, this.f9245b);
            jSONObject.put("data", this.f9246c);
            jSONObject.put("userCapaid", this.f9248e);
            jSONObject.put("funcType", this.f9247d);
        } catch (JSONException e5) {
            e5.printStackTrace();
        }
        return jSONObject;
    }
}
