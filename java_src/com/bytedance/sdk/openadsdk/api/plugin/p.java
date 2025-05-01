package com.bytedance.sdk.openadsdk.api.plugin;

import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.sdk.openadsdk.AdConfig;
import com.bytedance.sdk.openadsdk.TTAdManager;
import com.bytedance.sdk.openadsdk.TTAdSdk;
import com.bytedance.sdk.openadsdk.TTAppContextHolder;
import com.bytedance.sdk.openadsdk.TTCustomController;
import com.qq.e.comm.pi.ACTD;
import com.umeng.umcrash.UMCrash;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
final class p {

    /* renamed from: m  reason: collision with root package name */
    private static SharedPreferences f8725m;

    /* renamed from: p  reason: collision with root package name */
    private static final List<Pair<String, JSONObject>> f8726p = new CopyOnWriteArrayList();
    static final Map<String, String> vv = new HashMap();

    private static void i(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        TTAdManager adManager = TTAdSdk.getAdManager();
        if (adManager != null) {
            Bundle bundle = new Bundle();
            bundle.putInt("action", 1);
            bundle.putString("event_name", str);
            bundle.putString("event_extra", jSONObject.toString());
            adManager.getExtra(Bundle.class, bundle);
            return;
        }
        o(str, jSONObject);
    }

    public static void m(String str, JSONObject jSONObject) {
        f8726p.add(new Pair<>(str, jSONObject));
    }

    private static void o(final String str, final JSONObject jSONObject) {
        com.bytedance.sdk.openadsdk.o.vv.vv().m(new Runnable() { // from class: com.bytedance.sdk.openadsdk.api.plugin.p.1
            @Override // java.lang.Runnable
            public void run() {
                ArrayList arrayList = new ArrayList();
                arrayList.add(p.u(str, jSONObject));
                p.m(arrayList);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static JSONObject u(String str, JSONObject jSONObject) {
        String str2 = "6.2.1.7";
        JSONObject jSONObject2 = new JSONObject();
        try {
            int i4 = Build.VERSION.SDK_INT;
            jSONObject.put("os_api", i4);
            jSONObject.put("support_abi", Arrays.toString(i4 >= 21 ? Build.SUPPORTED_ABIS : new String[]{Build.CPU_ABI, Build.CPU_ABI2}));
            jSONObject2.put("ad_sdk_version", "6.2.1.7");
            String vv2 = o.vv("com.byted.pangle");
            if (!TextUtils.isEmpty(vv2)) {
                str2 = vv2;
            }
            jSONObject2.put(PluginConstants.KEY_PLUGIN_VERSION, str2);
            jSONObject2.put(UMCrash.SP_KEY_TIMESTAMP, System.currentTimeMillis() / 1000);
            jSONObject2.put("is_plugin", true);
            Map<String, String> map = vv;
            jSONObject.put(ACTD.APPID_KEY, map.get(ACTD.APPID_KEY));
            jSONObject2.put("event_extra", jSONObject.toString());
            jSONObject2.put("type", str);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("model", Build.MODEL);
            jSONObject3.put("vendor", Build.MANUFACTURER);
            jSONObject3.put("imei", map.get("imei"));
            jSONObject3.put("oaid", map.get("oaid"));
            jSONObject2.put("device_info", jSONObject3);
        } catch (JSONException unused) {
        }
        return jSONObject2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void m(List<JSONObject> list) {
        if (list == null) {
            return;
        }
        if (f8725m == null) {
            f8725m = TTAppContextHolder.getContext().getSharedPreferences("tt_sdk_settings_other", 0);
        }
        String format = String.format("https://%s%s", f8725m.getString("url_stats", "api-access.pangolin-sdk-toutiao.com"), "/api/ad/union/sdk/stats/batch/");
        JSONObject jSONObject = new JSONObject();
        try {
            List<Pair<String, JSONObject>> list2 = f8726p;
            if (list2.size() > 0) {
                for (Pair<String, JSONObject> pair : list2) {
                    list.add(u((String) pair.first, (JSONObject) pair.second));
                }
                f8726p.clear();
            }
            jSONObject.put("stats_list", new JSONArray((Collection) list));
        } catch (Exception unused) {
        }
        com.bytedance.sdk.openadsdk.api.plugin.m.p.vv().vv(true, format, com.bytedance.sdk.openadsdk.api.plugin.p.m.vv(jSONObject).toString().getBytes());
    }

    public static void vv(int i4, String str, long j4) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("duration", Long.valueOf(j4));
            jSONObject.putOpt("code", Integer.valueOf(i4));
            jSONObject.putOpt("message", str);
            jSONObject.putOpt("load_record", m.vv());
        } catch (JSONException e5) {
            e5.printStackTrace();
        }
        o("plugin_load_failed", jSONObject);
    }

    public static void vv(String str, JSONObject jSONObject) {
        i("zeus_".concat(String.valueOf(str)), jSONObject);
    }

    public static void vv() {
        List<Pair<String, JSONObject>> list = f8726p;
        if (list.size() <= 0) {
            return;
        }
        try {
            for (Pair<String, JSONObject> pair : list) {
                if (pair != null) {
                    i((String) pair.first, (JSONObject) pair.second);
                }
            }
            f8726p.clear();
        } catch (Exception unused) {
        }
    }

    public static void vv(AdConfig adConfig) {
        if (adConfig == null) {
            return;
        }
        Map<String, String> map = vv;
        map.put(ACTD.APPID_KEY, adConfig.getAppId());
        int pluginUpdateConfig = adConfig.getPluginUpdateConfig();
        map.put("plugin_update_conf", pluginUpdateConfig != 0 ? String.valueOf(pluginUpdateConfig) : "2");
        TTCustomController customController = adConfig.getCustomController();
        if (customController != null) {
            try {
                map.put("oaid", customController.getDevOaid());
                map.put("imei", customController.getDevImei());
            } catch (Exception unused) {
            }
        }
    }
}
