package com.tencent.stat;

import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes6.dex */
public class NetworkMonitor {

    /* renamed from: a  reason: collision with root package name */
    private long f62813a = 0;

    /* renamed from: b  reason: collision with root package name */
    private int f62814b = 0;

    /* renamed from: c  reason: collision with root package name */
    private String f62815c = "";

    /* renamed from: d  reason: collision with root package name */
    private int f62816d = 0;

    /* renamed from: e  reason: collision with root package name */
    private String f62817e = "";

    public String getDomain() {
        return this.f62815c;
    }

    public long getMillisecondsConsume() {
        return this.f62813a;
    }

    public int getPort() {
        return this.f62816d;
    }

    public String getRemoteIp() {
        return this.f62817e;
    }

    public int getStatusCode() {
        return this.f62814b;
    }

    public void setDomain(String str) {
        this.f62815c = str;
    }

    public void setMillisecondsConsume(long j4) {
        this.f62813a = j4;
    }

    public void setPort(int i4) {
        this.f62816d = i4;
    }

    public void setRemoteIp(String str) {
        this.f62817e = str;
    }

    public void setStatusCode(int i4) {
        this.f62814b = i4;
    }

    public JSONObject toJSONObject() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("tm", this.f62813a);
            jSONObject.put("st", this.f62814b);
            String str = this.f62815c;
            if (str != null) {
                jSONObject.put(com.kuaishou.weapon.p0.t.f55703v, str);
            }
            jSONObject.put("pt", this.f62816d);
            String str2 = this.f62817e;
            if (str2 != null) {
                jSONObject.put("rip", str2);
            }
            jSONObject.put("ts", System.currentTimeMillis() / 1000);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }
}
