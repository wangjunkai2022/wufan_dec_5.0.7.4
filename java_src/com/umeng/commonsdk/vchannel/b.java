package com.umeng.commonsdk.vchannel;

import android.content.Context;
import com.umeng.commonsdk.service.UMGlobalContext;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: Event.java */
/* loaded from: classes6.dex */
public class b {

    /* renamed from: b  reason: collision with root package name */
    private String f64636b;

    /* renamed from: a  reason: collision with root package name */
    private String f64635a = "_$unknown";

    /* renamed from: c  reason: collision with root package name */
    private long f64637c = 0;

    /* renamed from: d  reason: collision with root package name */
    private long f64638d = 0;

    /* renamed from: e  reason: collision with root package name */
    private String f64639e = a.f64634j;

    /* renamed from: f  reason: collision with root package name */
    private Map<String, Object> f64640f = null;

    public b(Context context) {
        this.f64636b = UMGlobalContext.getInstance(context).getProcessName(context);
    }

    public String a() {
        return this.f64635a;
    }

    public long b() {
        return this.f64637c;
    }

    public Map<String, Object> c() {
        return this.f64640f;
    }

    public JSONObject d() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", this.f64635a);
            jSONObject.put("pn", this.f64636b);
            jSONObject.put("ds", this.f64638d);
            jSONObject.put("ts", this.f64637c);
            Map<String, Object> map = this.f64640f;
            if (map != null && map.size() > 0) {
                for (String str : this.f64640f.keySet()) {
                    jSONObject.put(str, this.f64640f.get(str));
                }
            }
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(jSONObject);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(this.f64639e, jSONArray);
            JSONArray jSONArray2 = new JSONArray();
            jSONArray2.put(jSONObject2);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("ekv", jSONArray2);
            return jSONObject3;
        } catch (Throwable unused) {
            return null;
        }
    }

    public String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder("[");
        sb.append("id:" + this.f64635a + ",");
        sb.append("pn:" + this.f64636b + ",");
        sb.append("ts:" + this.f64637c + ",");
        Map<String, Object> map = this.f64640f;
        if (map != null && map.size() > 0) {
            for (String str : this.f64640f.keySet()) {
                sb.append(this.f64640f.get(str) == null ? str + ": null," : str + ": " + obj.toString() + ",");
            }
        }
        sb.append("ds:" + this.f64638d + "]");
        return sb.toString();
    }

    public void a(String str) {
        this.f64635a = str;
    }

    public void a(long j4) {
        this.f64637c = j4;
    }

    public void a(Map<String, Object> map) {
        this.f64640f = map;
    }
}
