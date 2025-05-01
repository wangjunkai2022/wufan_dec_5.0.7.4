package com.ss.android.socialbase.appdownloader;

import android.text.TextUtils;
import org.json.JSONObject;
/* loaded from: classes5.dex */
public class vv {

    /* renamed from: i  reason: collision with root package name */
    public String f60925i;

    /* renamed from: m  reason: collision with root package name */
    public int f60926m = -1;

    /* renamed from: o  reason: collision with root package name */
    public String f60927o;

    /* renamed from: p  reason: collision with root package name */
    public String f60928p;
    public String vv;

    public JSONObject m() {
        JSONObject jSONObject = new JSONObject();
        vv(jSONObject);
        return jSONObject;
    }

    public String vv() {
        return m().toString();
    }

    public void vv(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("ah_plan_type", this.vv);
            jSONObject.put("error_code", String.valueOf(this.f60926m));
            jSONObject.put("error_msg", this.f60928p);
            jSONObject.put("real_device_plan", this.f60925i);
            jSONObject.put("device_plans", this.f60927o);
        } catch (Throwable unused) {
        }
    }

    public static vv vv(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        vv vvVar = new vv();
        try {
            JSONObject jSONObject = new JSONObject(str);
            vvVar.f60927o = jSONObject.optString("device_plans", null);
            vvVar.f60925i = jSONObject.optString("real_device_plan", null);
            vvVar.f60928p = jSONObject.optString("error_msg", null);
            vvVar.vv = jSONObject.optString("ah_plan_type", null);
            String optString = jSONObject.optString("error_code");
            if (TextUtils.isEmpty(optString)) {
                vvVar.f60926m = -1;
            } else {
                vvVar.f60926m = Integer.parseInt(optString);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return vvVar;
    }
}
