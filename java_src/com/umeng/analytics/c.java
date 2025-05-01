package com.umeng.analytics;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Base64;
import com.umeng.analytics.pro.av;
import com.umeng.analytics.pro.f;
import com.umeng.commonsdk.UMConfigure;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.service.UMGlobalContext;
import com.umeng.commonsdk.statistics.common.MLog;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONStringer;
import org.json.JSONTokener;
/* compiled from: InternalConfig.java */
/* loaded from: classes6.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    private static final int f63258a = 20;

    /* renamed from: b  reason: collision with root package name */
    private static final String f63259b = "umeng_pcp";

    /* renamed from: c  reason: collision with root package name */
    private static final String f63260c = "mob";

    /* renamed from: d  reason: collision with root package name */
    private static final String f63261d = "em";

    /* renamed from: e  reason: collision with root package name */
    private static final String f63262e = "cp";

    /* renamed from: f  reason: collision with root package name */
    private static final String f63263f = "pk";

    /* renamed from: g  reason: collision with root package name */
    private static final String f63264g = "pv";

    /* renamed from: h  reason: collision with root package name */
    private static String[] f63265h = new String[2];

    /* renamed from: i  reason: collision with root package name */
    private static Object f63266i = new Object();

    /* renamed from: j  reason: collision with root package name */
    private static Map<String, Object> f63267j = new HashMap();

    public static void a(Context context, String str, String str2) {
        String[] strArr = f63265h;
        strArr[0] = str;
        strArr[1] = str2;
        if (context != null) {
            com.umeng.common.b.a(context).a(str, str2);
        }
    }

    public static void b(Context context) {
        String[] strArr = f63265h;
        strArr[0] = null;
        strArr[1] = null;
        if (context != null) {
            com.umeng.common.b.a(context).b();
        }
    }

    public static Map<String, Object> c(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(f63259b, 0);
        String string = sharedPreferences.getString("cp", "");
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            String str = new String(av.a(Base64.decode(string, 0), UMConfigure.sAppkey.getBytes()));
            if (str.length() > 0) {
                HashMap hashMap = new HashMap();
                try {
                    JSONArray jSONArray = (JSONArray) new JSONTokener(str).nextValue();
                    for (int i4 = 0; i4 < jSONArray.length(); i4++) {
                        JSONObject jSONObject = jSONArray.getJSONObject(i4);
                        hashMap.put(jSONObject.getString("pk"), jSONObject.get("pv"));
                    }
                    sharedPreferences.edit().putString("cp", "").apply();
                    return hashMap;
                } catch (Throwable unused) {
                    return hashMap;
                }
            }
            return null;
        } catch (Throwable unused2) {
            return null;
        }
    }

    public static String[] a(Context context) {
        String[] a5;
        if (TextUtils.isEmpty(f63265h[0]) || TextUtils.isEmpty(f63265h[1])) {
            if (context == null || (a5 = com.umeng.common.b.a(context).a()) == null) {
                return null;
            }
            String[] strArr = f63265h;
            strArr[0] = a5[0];
            strArr[1] = a5[1];
            return strArr;
        }
        return f63265h;
    }

    public static void b(String str) {
        Context appContext = UMGlobalContext.getAppContext();
        if (appContext != null) {
            try {
                SharedPreferences sharedPreferences = appContext.getSharedPreferences(f63259b, 0);
                byte[] a5 = av.a(str.getBytes(), UMConfigure.sAppkey.getBytes());
                sharedPreferences.edit().putString(f63261d, a5.length == 0 ? f.Q : Base64.encodeToString(a5, 0)).apply();
            } catch (Throwable unused) {
            }
        }
    }

    public static void a(String str) {
        Context appContext = UMGlobalContext.getAppContext();
        if (appContext != null) {
            try {
                SharedPreferences sharedPreferences = appContext.getSharedPreferences(f63259b, 0);
                byte[] a5 = av.a(str.getBytes(), UMConfigure.sAppkey.getBytes());
                sharedPreferences.edit().putString(f63260c, a5.length == 0 ? f.Q : Base64.encodeToString(a5, 0)).apply();
            } catch (Throwable unused) {
            }
        }
    }

    public static String b() {
        Context appContext = UMGlobalContext.getAppContext();
        if (appContext != null) {
            try {
                SharedPreferences sharedPreferences = appContext.getSharedPreferences(f63259b, 0);
                String string = sharedPreferences.getString(f63261d, "");
                if (f.Q.equals(string)) {
                    sharedPreferences.edit().putString(f63261d, "").apply();
                    return "";
                } else if (TextUtils.isEmpty(string)) {
                    return null;
                } else {
                    sharedPreferences.edit().putString(f63261d, "").apply();
                    return new String(av.a(Base64.decode(string, 0), UMConfigure.sAppkey.getBytes()));
                }
            } catch (Throwable unused) {
                return null;
            }
        }
        return null;
    }

    public static String a() {
        Context appContext = UMGlobalContext.getAppContext();
        if (appContext != null) {
            try {
                SharedPreferences sharedPreferences = appContext.getSharedPreferences(f63259b, 0);
                String string = sharedPreferences.getString(f63260c, "");
                if (f.Q.equals(string)) {
                    sharedPreferences.edit().putString(f63260c, "").apply();
                    return "";
                } else if (TextUtils.isEmpty(string)) {
                    return null;
                } else {
                    sharedPreferences.edit().putString(f63260c, "").apply();
                    return new String(av.a(Base64.decode(string, 0), UMConfigure.sAppkey.getBytes()));
                }
            } catch (Throwable unused) {
                return null;
            }
        }
        return null;
    }

    public static void a(Context context, Map<String, Object> map) {
        if (map != null) {
            JSONStringer jSONStringer = new JSONStringer();
            try {
                synchronized (f63266i) {
                    jSONStringer.array();
                    for (String str : map.keySet()) {
                        jSONStringer.object();
                        jSONStringer.key("pk");
                        jSONStringer.value(str);
                        jSONStringer.key("pv");
                        jSONStringer.value(map.get(str));
                        jSONStringer.endObject();
                    }
                    jSONStringer.endArray();
                }
                SharedPreferences sharedPreferences = context.getSharedPreferences(f63259b, 0);
                sharedPreferences.edit().putString("cp", Base64.encodeToString(av.a(jSONStringer.toString().getBytes(), UMConfigure.sAppkey.getBytes()), 0)).apply();
            } catch (Throwable unused) {
            }
        }
    }

    public static void a(String str, Object obj) {
        synchronized (f63266i) {
            if (f63267j.containsKey(str)) {
                UMRTLog.i(UMRTLog.RTLOG_TAG, "更新账号自定义KV: key=" + str + "; val=" + obj);
                f63267j.put(str, obj);
                a(UMGlobalContext.getAppContext(), f63267j);
            } else if (f63267j.size() >= 20) {
                UMRTLog.i(UMRTLog.RTLOG_TAG, "设置账号自定义KV: 已经设置20个KV键值对，忽略设置请求。");
                MLog.e("userProfile: Only 20 user-defined key-value pairs can be configured, please check!");
            } else {
                UMRTLog.i(UMRTLog.RTLOG_TAG, "设置账号自定义KV: key=" + str + "; val=" + obj);
                f63267j.put(str, obj);
                a(UMGlobalContext.getAppContext(), f63267j);
            }
        }
    }
}
