package com.umeng.analytics.pro;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.statistics.common.DeviceConfig;
import com.umeng.commonsdk.utils.UMUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ModelHelper.java */
/* loaded from: classes6.dex */
public class an {
    public static JSONObject a(Context context, String str) {
        JSONObject jSONObject;
        JSONObject jSONObject2 = null;
        try {
            am amVar = new am();
            String uMId = UMUtils.getUMId(context);
            if (TextUtils.isEmpty(uMId)) {
                return null;
            }
            amVar.a(uMId);
            String appkey = UMUtils.getAppkey(context);
            if (TextUtils.isEmpty(appkey)) {
                return null;
            }
            amVar.b(appkey);
            amVar.c(UMUtils.getAppVersionName(context));
            amVar.d("9.6.7");
            amVar.e(UMUtils.getChannel(context));
            amVar.f(Build.VERSION.SDK_INT + "");
            amVar.g(Build.BRAND);
            amVar.h(Build.MODEL);
            String[] localeInfo = DeviceConfig.getLocaleInfo(context);
            amVar.i(localeInfo[1]);
            amVar.j(localeInfo[0]);
            int[] resolutionArray = DeviceConfig.getResolutionArray(context);
            amVar.b(Integer.valueOf(resolutionArray[1]));
            amVar.a(Integer.valueOf(resolutionArray[0]));
            amVar.k(ar.a(context, "install_datetime", ""));
            try {
                jSONObject = new JSONObject();
            } catch (JSONException e5) {
                e = e5;
            }
            try {
                jSONObject.put(am.f63313a, amVar.a());
                jSONObject.put(am.f63315c, amVar.c());
                jSONObject.put(am.f63314b, amVar.b());
                jSONObject.put(am.f63316d, amVar.d());
                jSONObject.put(am.f63317e, amVar.e());
                jSONObject.put(am.f63318f, amVar.f());
                jSONObject.put(am.f63319g, amVar.g());
                jSONObject.put(am.f63320h, amVar.h());
                jSONObject.put(am.f63323k, amVar.k());
                jSONObject.put(am.f63322j, amVar.j());
                jSONObject.put(am.f63324l, amVar.l());
                jSONObject.put(am.f63321i, amVar.i());
                jSONObject.put(am.f63325m, amVar.m());
                jSONObject.put(bm.al, UMUtils.getZid(context));
                jSONObject.put("platform", q.a.f73126a);
                jSONObject.put("optional", new JSONObject(ar.a()));
                String[] split = str.split("@");
                if (split.length == 4) {
                    try {
                        long parseLong = Long.parseLong(split[0]);
                        String str2 = split[1];
                        jSONObject.put("s1", parseLong);
                        jSONObject.put("s2", str2);
                    } catch (Throwable unused) {
                    }
                }
                try {
                    String str3 = Build.BRAND;
                    String a5 = as.a(str3);
                    String b5 = as.b(str3);
                    if (!TextUtils.isEmpty(a5) && !TextUtils.isEmpty(b5)) {
                        jSONObject.put(am.f63326n, a5);
                        jSONObject.put(am.f63327o, b5);
                    } else {
                        jSONObject.put(am.f63326n, "Android");
                        jSONObject.put(am.f63327o, Build.VERSION.RELEASE);
                    }
                } catch (Throwable unused2) {
                }
                return jSONObject;
            } catch (JSONException e6) {
                e = e6;
                jSONObject2 = jSONObject;
                UMRTLog.e(UMRTLog.RTLOG_TAG, "[getCloudConfigParam] error " + e.getMessage());
                return jSONObject2;
            } catch (Throwable th) {
                th = th;
                jSONObject2 = jSONObject;
                UMRTLog.e(UMRTLog.RTLOG_TAG, "[getCloudConfigParam] error " + th.getMessage());
                return jSONObject2;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static JSONObject a(Context context, int i4, JSONArray jSONArray, String str) {
        JSONObject jSONObject = null;
        try {
            JSONObject jSONObject2 = new JSONObject();
            try {
                String zid = UMUtils.getZid(context);
                if (TextUtils.isEmpty(zid)) {
                    return jSONObject2;
                }
                jSONObject2.put("atoken", zid);
                String deviceToken = UMUtils.getDeviceToken(context);
                if (!TextUtils.isEmpty(deviceToken)) {
                    jSONObject2.put("device_token", deviceToken);
                }
                jSONObject2.put("model", Build.MODEL);
                jSONObject2.put(bm.f63463x, q.a.f73126a);
                jSONObject2.put(bm.f63464y, Build.VERSION.RELEASE);
                jSONObject2.put(com.umeng.ccg.a.f64022o, str);
                jSONObject2.put(com.umeng.ccg.a.f64025r, jSONArray);
                jSONObject2.put(com.kwad.sdk.m.e.TAG, i4);
                return jSONObject2;
            } catch (Throwable unused) {
                jSONObject = jSONObject2;
                return jSONObject;
            }
        } catch (Throwable unused2) {
        }
    }
}
