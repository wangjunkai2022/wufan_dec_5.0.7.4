package com.tencent.stat;

import com.tencent.stat.common.StatLogger;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes6.dex */
public class DeviceInfo {
    public static final int NEW_USER = 0;
    public static final int OLD_USER = 1;
    public static final String TAG_ANDROID_ID = "aid";
    public static final String TAG_FLAG = "__MTA_DEVICE_INFO__";
    public static final String TAG_IMEI = "ui";
    public static final String TAG_MAC = "mc";
    public static final String TAG_MID = "mid";
    public static final String TAG_TIMESTAMPS = "ts";
    public static final String TAG_VERSION = "ver";
    public static final int UPGRADE_USER = 2;

    /* renamed from: h  reason: collision with root package name */
    private static StatLogger f62805h = com.tencent.stat.common.k.b();

    /* renamed from: a  reason: collision with root package name */
    private String f62806a;

    /* renamed from: b  reason: collision with root package name */
    private String f62807b;

    /* renamed from: c  reason: collision with root package name */
    private String f62808c;

    /* renamed from: d  reason: collision with root package name */
    private String f62809d;

    /* renamed from: e  reason: collision with root package name */
    private int f62810e;

    /* renamed from: f  reason: collision with root package name */
    private int f62811f;

    /* renamed from: g  reason: collision with root package name */
    private long f62812g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public DeviceInfo() {
        this.f62806a = null;
        this.f62807b = null;
        this.f62808c = null;
        this.f62809d = "0";
        this.f62811f = 0;
        this.f62812g = 0L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public DeviceInfo(String str, String str2, int i4) {
        this.f62806a = null;
        this.f62807b = null;
        this.f62808c = null;
        this.f62809d = "0";
        this.f62811f = 0;
        this.f62812g = 0L;
        this.f62806a = str;
        this.f62807b = str2;
        this.f62810e = i4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static DeviceInfo a(String str) {
        DeviceInfo deviceInfo = new DeviceInfo();
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (!jSONObject.isNull(TAG_IMEI)) {
                deviceInfo.d(jSONObject.getString(TAG_IMEI));
            }
            if (!jSONObject.isNull("mc")) {
                deviceInfo.e(jSONObject.getString("mc"));
            }
            if (!jSONObject.isNull(TAG_MID)) {
                deviceInfo.c(jSONObject.getString(TAG_MID));
            }
            if (!jSONObject.isNull(TAG_ANDROID_ID)) {
                deviceInfo.b(jSONObject.getString(TAG_ANDROID_ID));
            }
            if (!jSONObject.isNull("ts")) {
                deviceInfo.a(jSONObject.getLong("ts"));
            }
            if (!jSONObject.isNull(TAG_VERSION)) {
                deviceInfo.a(jSONObject.getInt(TAG_VERSION));
            }
        } catch (JSONException e5) {
            f62805h.e((Exception) e5);
        }
        return deviceInfo;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int a() {
        return this.f62811f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int a(DeviceInfo deviceInfo) {
        if (deviceInfo == null) {
            return 1;
        }
        String mid = getMid();
        String mid2 = deviceInfo.getMid();
        if (mid == null || mid2 == null || !mid.equals(mid2)) {
            int a5 = a();
            int a6 = deviceInfo.a();
            if (a5 > a6) {
                return 1;
            }
            if (a5 == a6) {
                long b5 = b();
                long b6 = deviceInfo.b();
                if (b5 > b6) {
                    return 1;
                }
                if (b5 == b6) {
                    return 0;
                }
            }
            return -1;
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(int i4) {
        this.f62811f = i4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(long j4) {
        this.f62812g = j4;
    }

    long b() {
        return this.f62812g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(int i4) {
        this.f62810e = i4;
    }

    void b(String str) {
        this.f62808c = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public JSONObject c() {
        JSONObject jSONObject = new JSONObject();
        try {
            com.tencent.stat.common.k.a(jSONObject, TAG_IMEI, this.f62806a);
            com.tencent.stat.common.k.a(jSONObject, "mc", this.f62807b);
            com.tencent.stat.common.k.a(jSONObject, TAG_MID, this.f62809d);
            com.tencent.stat.common.k.a(jSONObject, TAG_ANDROID_ID, this.f62808c);
            jSONObject.put("ts", this.f62812g);
            jSONObject.put(TAG_VERSION, this.f62811f);
        } catch (JSONException e5) {
            f62805h.e((Exception) e5);
        }
        return jSONObject;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(String str) {
        this.f62809d = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(String str) {
        this.f62806a = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(String str) {
        this.f62807b = str;
    }

    public String getImei() {
        return this.f62806a;
    }

    public String getMac() {
        return this.f62807b;
    }

    public String getMid() {
        return this.f62809d;
    }

    public int getUserType() {
        return this.f62810e;
    }

    public String toString() {
        return c().toString();
    }
}
