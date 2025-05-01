package com.ss.android.downloadlib.addownload.m;

import com.ss.android.downloadlib.n.jh;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes5.dex */
public class vv {

    /* renamed from: i  reason: collision with root package name */
    public String f60523i;

    /* renamed from: m  reason: collision with root package name */
    public long f60524m;

    /* renamed from: n  reason: collision with root package name */
    public String f60525n;

    /* renamed from: o  reason: collision with root package name */
    public String f60526o;

    /* renamed from: p  reason: collision with root package name */
    public long f60527p;
    public volatile long qv;

    /* renamed from: u  reason: collision with root package name */
    public String f60528u;
    public long vv;

    public vv() {
    }

    public JSONObject vv() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("mDownloadId", this.vv);
            jSONObject.put("mAdId", this.f60524m);
            jSONObject.put("mExtValue", this.f60527p);
            jSONObject.put("mPackageName", this.f60523i);
            jSONObject.put("mAppName", this.f60526o);
            jSONObject.put("mLogExtra", this.f60528u);
            jSONObject.put("mFileName", this.f60525n);
            jSONObject.put("mTimeStamp", this.qv);
        } catch (JSONException e5) {
            e5.printStackTrace();
        }
        return jSONObject;
    }

    public vv(long j4, long j5, long j6, String str, String str2, String str3, String str4) {
        this.vv = j4;
        this.f60524m = j5;
        this.f60527p = j6;
        this.f60523i = str;
        this.f60526o = str2;
        this.f60528u = str3;
        this.f60525n = str4;
    }

    public static vv vv(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        vv vvVar = new vv();
        try {
            vvVar.vv = jh.vv(jSONObject, "mDownloadId");
            vvVar.f60524m = jh.vv(jSONObject, "mAdId");
            vvVar.f60527p = jh.vv(jSONObject, "mExtValue");
            vvVar.f60523i = jSONObject.optString("mPackageName");
            vvVar.f60526o = jSONObject.optString("mAppName");
            vvVar.f60528u = jSONObject.optString("mLogExtra");
            vvVar.f60525n = jSONObject.optString("mFileName");
            vvVar.qv = jh.vv(jSONObject, "mTimeStamp");
            return vvVar;
        } catch (Exception e5) {
            e5.printStackTrace();
            return null;
        }
    }
}
