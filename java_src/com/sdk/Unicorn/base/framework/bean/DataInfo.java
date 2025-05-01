package com.sdk.Unicorn.base.framework.bean;

import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes5.dex */
public class DataInfo extends JSONObject {
    public DataInfo() {
        try {
            put("r", System.currentTimeMillis());
        } catch (JSONException unused) {
        }
    }

    public JSONObject putData(String str, Object obj) {
        try {
            return super.put(str, obj);
        } catch (Exception unused) {
            return this;
        }
    }

    public String toAESString() {
        return "";
    }
}
