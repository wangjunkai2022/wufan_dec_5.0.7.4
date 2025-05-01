package com.cmic.sso.sdk.d;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: LogBeanEx.java */
/* loaded from: classes2.dex */
public class c extends b {

    /* renamed from: b  reason: collision with root package name */
    public static ArrayList<Throwable> f9315b = new ArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    private JSONObject f9316c;

    /* renamed from: d  reason: collision with root package name */
    private JSONArray f9317d;

    @Override // com.cmic.sso.sdk.d.b
    public void a(JSONArray jSONArray) {
        this.f9317d = jSONArray;
    }

    @Override // com.cmic.sso.sdk.d.b, com.cmic.sso.sdk.c.b.g
    public JSONObject b() {
        JSONObject b5 = super.b();
        try {
            b5.put("event", this.f9316c);
            b5.put("exceptionStackTrace", this.f9317d);
        } catch (JSONException e5) {
            e5.printStackTrace();
        }
        return b5;
    }
}
