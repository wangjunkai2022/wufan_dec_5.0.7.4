package com.umeng.analytics.pro;

import java.util.ArrayList;
import org.json.JSONObject;
/* compiled from: AplAction.java */
/* loaded from: classes6.dex */
public class ad extends ab {

    /* renamed from: a  reason: collision with root package name */
    private String f63298a;

    /* renamed from: b  reason: collision with root package name */
    private String f63299b;

    public ad(String str, ArrayList<ac> arrayList) {
        super(str, arrayList);
        this.f63298a = "";
        this.f63299b = "";
    }

    @Override // com.umeng.analytics.pro.ab, com.umeng.analytics.pro.ai
    public JSONObject a(String str, JSONObject jSONObject) {
        JSONObject a5 = super.a(str, jSONObject);
        if (a5 != null) {
            try {
                a5.put(com.umeng.ccg.a.f64026s, this.f63298a);
                a5.put("action", this.f63299b);
            } catch (Throwable unused) {
            }
        }
        return a5;
    }

    public void c(String str) {
        this.f63298a = str;
    }

    public String d() {
        return this.f63298a;
    }

    public String e() {
        return this.f63299b;
    }

    public void d(String str) {
        this.f63299b = str;
    }
}
