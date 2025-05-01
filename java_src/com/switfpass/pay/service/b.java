package com.switfpass.pay.service;

import com.switfpass.pay.enmu.LocalRetCode;
import org.json.JSONObject;
/* loaded from: classes5.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    public LocalRetCode f61769a = LocalRetCode.ERR_OTHER;

    /* renamed from: b  reason: collision with root package name */
    public String f61770b;

    /* renamed from: c  reason: collision with root package name */
    public int f61771c;

    /* renamed from: d  reason: collision with root package name */
    public String f61772d;

    public void a(String str) {
        LocalRetCode localRetCode;
        if (str != null && str.length() > 0) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.has("prepayid")) {
                    this.f61770b = jSONObject.getString("prepayid");
                    localRetCode = LocalRetCode.ERR_OK;
                } else {
                    localRetCode = LocalRetCode.ERR_JSON;
                }
                this.f61769a = localRetCode;
                this.f61771c = jSONObject.getInt("errcode");
                this.f61772d = jSONObject.getString("errmsg");
                return;
            } catch (Exception unused) {
            }
        }
        this.f61769a = LocalRetCode.ERR_JSON;
    }
}
