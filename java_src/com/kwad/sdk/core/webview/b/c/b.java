package com.kwad.sdk.core.webview.b.c;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.mediation.MediationConstant;
import com.kwad.components.offline.api.core.api.ILoggerReporter;
import com.kwad.sdk.commercial.model.HybridLoadMsg;
import com.kwad.sdk.commercial.model.WebViewLoadMsg;
import com.kwad.sdk.utils.t;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import net.lingala.zip4j.util.e;
import org.json.JSONObject;
/* loaded from: classes5.dex */
public final class b {
    public static final Map<String, JSONObject> aFN = new HashMap();
    public static boolean aFO = true;

    /* loaded from: classes5.dex */
    public static class a {
        public String msg;
    }

    public static void a(com.kwad.sdk.g.a.b bVar, int i4) {
        com.kwad.sdk.commercial.b.a(ILoggerReporter.Category.APM_LOG, new HybridLoadMsg().setSceneId(bVar.aJm).setH5Version(bVar.version).setLoadType(bVar.loadType).setState(i4).setPackageUrl(bVar.packageUrl).setInterval(String.valueOf(System.currentTimeMillis() - bVar.Jf())));
    }

    public static void ae(String str, String str2) {
        JSONObject fe = fe(str);
        t.putValue(fe, "c_" + str2, System.currentTimeMillis());
    }

    private static void af(String str, String str2) {
        a(str, str2, 1, "");
    }

    public static void ag(String str, String str2) {
        a(str, "", 2, str2);
    }

    public static void c(String str, String str2, String str3) {
        if (str3.contains(e.F0)) {
            str3 = str3.substring(str3.lastIndexOf(e.F0) + 1);
        }
        JSONObject fe = fe(str);
        t.putValue(fe, "c_responseStart_" + str2 + "_" + str3, System.currentTimeMillis());
    }

    public static void d(String str, String str2, String str3) {
        if (str3.contains(e.F0)) {
            str3 = str3.substring(str3.lastIndexOf(e.F0) + 1);
        }
        JSONObject fe = fe(str);
        t.putValue(fe, "c_responseEnd_" + str2 + "_" + str3, System.currentTimeMillis());
    }

    private static JSONObject fe(String str) {
        Map<String, JSONObject> map = aFN;
        JSONObject jSONObject = map.get(str);
        if (jSONObject == null) {
            JSONObject jSONObject2 = new JSONObject();
            map.put(str, jSONObject2);
            return jSONObject2;
        }
        return jSONObject;
    }

    private static void ff(String str) {
        aFN.remove(str);
    }

    public static void fg(String str) {
        JSONObject fe = fe(str);
        long HH = com.kwad.sdk.core.webview.b.a.HG().HH();
        long currentTimeMillis = HH <= 0 ? -1L : System.currentTimeMillis() - HH;
        t.putValue(fe, "c_loadUrl", System.currentTimeMillis());
        t.putValue(fe, "c_init_interval", currentTimeMillis);
        t.putValue(fe, "c_init_state", aFO ? 1 : 2);
        aFO = false;
    }

    public static void a(com.kwad.sdk.g.a.b bVar, int i4, int i5, String str) {
        com.kwad.sdk.commercial.b.a(ILoggerReporter.Category.ERROR_LOG, new HybridLoadMsg().setSceneId(bVar.aJm).setH5Version(bVar.version).setLoadType(bVar.loadType).setState(0).setPackageUrl(bVar.packageUrl).setFailState(i5).setInterval(String.valueOf(System.currentTimeMillis() - bVar.Jf())).setFailReason(str));
    }

    public static void a(String str, String str2, int i4, String str3, long j4) {
        com.kwad.sdk.commercial.b.b(i4 == 2 ? ILoggerReporter.Category.ERROR_LOG : ILoggerReporter.Category.APM_LOG, new HybridLoadMsg().setSceneId(str2).setUrl(str).setState(i4).setInterval(String.valueOf((j4 > 60000 || j4 < 0) ? -1L : -1L)).setFailReason(str3));
    }

    public static void a(String str, String str2, String str3, String str4) {
        JSONObject fe = fe(str2);
        t.putValue(fe, "c_" + str3, System.currentTimeMillis());
        if (str3.equals("pageStatus")) {
            try {
                if (TextUtils.isEmpty(str4)) {
                    return;
                }
                JSONObject jSONObject = new JSONObject(str4);
                int optInt = jSONObject.optInt("status");
                String optString = jSONObject.optString(MediationConstant.KEY_ERROR_MSG, "");
                String optString2 = jSONObject.optString("webViewCostParams", "");
                if (!TextUtils.isEmpty(optString2)) {
                    JSONObject jSONObject2 = new JSONObject(optString2);
                    Iterator<String> keys = jSONObject2.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        fe.put(next, jSONObject2.opt(next));
                    }
                }
                if (!TextUtils.isEmpty(str)) {
                    if (optInt == 1) {
                        af(str, str2);
                    } else {
                        ag(str, optString);
                    }
                }
            } catch (Exception e5) {
                com.kwad.sdk.core.e.c.printStackTrace(e5);
            } finally {
                ff(str2);
            }
        }
    }

    private static void a(String str, String str2, int i4, String str3) {
        long currentTimeMillis;
        JSONObject jSONObject = aFN.get(str2);
        if (jSONObject == null) {
            currentTimeMillis = -3;
        } else {
            long optLong = jSONObject.optLong("c_loadUrl");
            if (optLong <= 0) {
                currentTimeMillis = -2;
            } else {
                currentTimeMillis = System.currentTimeMillis() - optLong;
                if (currentTimeMillis > 100000 || currentTimeMillis < 0) {
                    currentTimeMillis = -1;
                }
            }
        }
        com.kwad.sdk.commercial.b.a(i4 == 2 ? ILoggerReporter.Category.ERROR_LOG : ILoggerReporter.Category.APM_LOG, new WebViewLoadMsg().setUrl(str).setState(i4).setCostTime(jSONObject != null ? jSONObject.toString() : "").setInterval(String.valueOf(currentTimeMillis)).setFailReason(str3));
        ff(str2);
    }
}
