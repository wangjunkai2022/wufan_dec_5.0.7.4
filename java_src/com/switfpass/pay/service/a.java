package com.switfpass.pay.service;

import com.switfpass.pay.enmu.LocalRetCode;
import org.json.JSONObject;
/* loaded from: classes5.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    public LocalRetCode f61764a = LocalRetCode.ERR_OTHER;

    /* renamed from: b  reason: collision with root package name */
    public String f61765b;

    /* renamed from: c  reason: collision with root package name */
    public int f61766c;

    /* renamed from: d  reason: collision with root package name */
    public int f61767d;

    /* renamed from: e  reason: collision with root package name */
    public String f61768e;

    public void a(String str) {
        if (str != null && str.length() > 0) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.has("access_token")) {
                    this.f61765b = jSONObject.getString("access_token");
                    this.f61766c = jSONObject.getInt("expires_in");
                    this.f61764a = LocalRetCode.ERR_OK;
                    return;
                }
                this.f61767d = jSONObject.getInt("errcode");
                this.f61768e = jSONObject.getString("errmsg");
                this.f61764a = LocalRetCode.ERR_JSON;
                return;
            } catch (Exception unused) {
            }
        }
        this.f61764a = LocalRetCode.ERR_JSON;
    }
}
