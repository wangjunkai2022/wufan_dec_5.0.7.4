package com.qq.e.comm.constants;

import java.util.Map;
import org.json.JSONObject;
/* loaded from: classes5.dex */
public class LoadAdParams {

    /* renamed from: a  reason: collision with root package name */
    private LoginType f59820a;

    /* renamed from: b  reason: collision with root package name */
    private String f59821b;

    /* renamed from: c  reason: collision with root package name */
    private String f59822c;

    /* renamed from: d  reason: collision with root package name */
    private String f59823d;

    /* renamed from: e  reason: collision with root package name */
    private Map<String, String> f59824e;

    /* renamed from: f  reason: collision with root package name */
    private JSONObject f59825f;

    /* renamed from: g  reason: collision with root package name */
    private final JSONObject f59826g = new JSONObject();

    public Map getDevExtra() {
        return this.f59824e;
    }

    public String getDevExtraJsonString() {
        try {
            Map<String, String> map = this.f59824e;
            return (map == null || map.size() <= 0) ? "" : new JSONObject(this.f59824e).toString();
        } catch (Exception e5) {
            e5.printStackTrace();
            return "";
        }
    }

    public JSONObject getExtraInfo() {
        return this.f59825f;
    }

    public String getLoginAppId() {
        return this.f59821b;
    }

    public String getLoginOpenid() {
        return this.f59822c;
    }

    public LoginType getLoginType() {
        return this.f59820a;
    }

    public JSONObject getParams() {
        return this.f59826g;
    }

    public String getUin() {
        return this.f59823d;
    }

    public void setDevExtra(Map<String, String> map) {
        this.f59824e = map;
    }

    public void setExtraInfo(JSONObject jSONObject) {
        this.f59825f = jSONObject;
    }

    public void setLoginAppId(String str) {
        this.f59821b = str;
    }

    public void setLoginOpenid(String str) {
        this.f59822c = str;
    }

    public void setLoginType(LoginType loginType) {
        this.f59820a = loginType;
    }

    public void setUin(String str) {
        this.f59823d = str;
    }

    public String toString() {
        return "LoadAdParams{, loginType=" + this.f59820a + ", loginAppId=" + this.f59821b + ", loginOpenid=" + this.f59822c + ", uin=" + this.f59823d + ", passThroughInfo=" + this.f59824e + ", extraInfo=" + this.f59825f + '}';
    }
}
