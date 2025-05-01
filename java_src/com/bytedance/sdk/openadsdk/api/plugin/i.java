package com.bytedance.sdk.openadsdk.api.plugin;

import android.os.SystemClock;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class i {

    /* renamed from: i  reason: collision with root package name */
    private Map<String, Long> f8704i = new HashMap();

    /* renamed from: m  reason: collision with root package name */
    private long f8705m;

    /* renamed from: p  reason: collision with root package name */
    private long f8706p;
    private String vv;

    private i(String str, long j4) {
        this.vv = str;
        this.f8705m = j4;
        this.f8706p = j4;
    }

    public static i vv(String str) {
        return new i(str, SystemClock.elapsedRealtime());
    }

    public long m(String str) {
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.f8706p;
        this.f8706p = SystemClock.elapsedRealtime();
        this.f8704i.put(str, Long.valueOf(elapsedRealtime));
        return elapsedRealtime;
    }

    public long vv() {
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.f8705m;
        this.f8704i.put(this.vv, Long.valueOf(elapsedRealtime));
        return elapsedRealtime;
    }

    public long m() {
        return this.f8705m;
    }

    public void vv(JSONObject jSONObject, long j4) {
        if (jSONObject == null) {
            return;
        }
        for (Map.Entry<String, Long> entry : this.f8704i.entrySet()) {
            String key = entry.getKey();
            Long value = entry.getValue();
            if (!TextUtils.isEmpty(key) && value.longValue() > j4) {
                try {
                    jSONObject.put(key, value);
                } catch (JSONException unused) {
                }
            }
        }
    }
}
