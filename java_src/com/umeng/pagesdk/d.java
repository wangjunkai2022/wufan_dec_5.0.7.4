package com.umeng.pagesdk;

import android.text.TextUtils;
import com.efs.sdk.base.EfsReporter;
import com.efs.sdk.base.protocol.record.EfsJSONLog;
import com.umeng.pagesdk.b;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes6.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    private static Map<String, Map> f64680a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private static c f64681b;

    private static void a(String str) {
        Map map;
        if (TextUtils.isEmpty(str) || (map = f64680a.get(str)) == null || (r0 = map.entrySet().iterator()) == null) {
            return;
        }
        JSONArray jSONArray = null;
        for (Map.Entry entry : map.entrySet()) {
            if (entry != null) {
                String str2 = (String) entry.getKey();
                Long[] lArr = (Long[]) entry.getValue();
                if (!TextUtils.isEmpty(str2) && lArr != null && lArr.length >= 2) {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("mN", str2);
                        jSONObject.put("mBT", lArr[0]);
                        jSONObject.put("mET", lArr[1]);
                        if (jSONArray == null) {
                            jSONArray = new JSONArray();
                        }
                        jSONArray.put(jSONObject);
                    } catch (JSONException e5) {
                        e5.printStackTrace();
                    }
                }
            }
        }
        if (jSONArray != null) {
            final JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("pN", str);
                jSONObject2.put("pL", jSONArray);
                b.a(PageManger.getApplicationContext()).a(new b.InterfaceC0681b() { // from class: com.umeng.pagesdk.d.1
                    @Override // com.umeng.pagesdk.b.InterfaceC0681b
                    public final void a(a aVar) {
                        try {
                            jSONObject2.put("te", aVar.f64657c);
                            jSONObject2.put("le", aVar.f64655a);
                            EfsJSONLog efsJSONLog = new EfsJSONLog("pageperf");
                            efsJSONLog.put("page", jSONObject2);
                            EfsReporter reporter = PageManger.getReporter();
                            if (reporter != null) {
                                reporter.send(efsJSONLog);
                            }
                        } catch (Exception e6) {
                            e6.printStackTrace();
                        }
                    }
                });
            } catch (JSONException e6) {
                e6.printStackTrace();
            }
        }
    }

    public static void a(String str, String str2, boolean z4) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            boolean z5 = PageManger.isDebug;
        } else if (!PageManger.isInit()) {
            boolean z6 = PageManger.isDebug;
        } else {
            PageConfigManger pageConfigManger = PageManger.getPageConfigManger();
            if (pageConfigManger == null || !pageConfigManger.enableTracer()) {
                boolean z7 = PageManger.isDebug;
                return;
            }
            if (z4) {
                str2 = "UM_".concat(String.valueOf(str2));
            }
            if (f64680a.containsKey(str)) {
                Map map = f64680a.get(str);
                if (map == null) {
                    boolean z8 = PageManger.isDebug;
                } else if (map.containsKey(str2)) {
                } else {
                    if (PageManger.isDebug) {
                        StringBuilder sb = new StringBuilder("tracePageBegin. begin add method. ");
                        sb.append(str2);
                        sb.append(" - ");
                        sb.append(str);
                    }
                    if (z4 || map.size() <= 6) {
                        Long[] lArr = new Long[2];
                        lArr[0] = Long.valueOf(System.currentTimeMillis());
                        map.put(str2, lArr);
                    } else if (PageManger.isDebug) {
                        StringBuilder sb2 = new StringBuilder("tracePageBegin. user trace number of transfinite. ");
                        sb2.append(str2);
                        sb2.append("-");
                        sb2.append(str);
                    }
                }
            } else if (str2.equals("UM_onCreate")) {
                if (PageManger.isDebug) {
                    StringBuilder sb3 = new StringBuilder("tracePageBegin. begin add onCreate. ");
                    sb3.append(str2);
                    sb3.append(" - ");
                    sb3.append(str);
                }
                Long[] lArr2 = new Long[2];
                lArr2[0] = Long.valueOf(System.currentTimeMillis());
                HashMap hashMap = new HashMap();
                hashMap.put(str2, lArr2);
                f64680a.put(str, hashMap);
                c cVar = f64681b;
                if (cVar != null) {
                    cVar.b();
                    c cVar2 = f64681b;
                    cVar2.f64676j = str;
                    cVar2.a();
                    return;
                }
                c cVar3 = new c(PageManger.getApplicationContext());
                f64681b = cVar3;
                cVar3.f64676j = str;
                cVar3.a();
            }
        }
    }

    public static void b(String str, String str2, boolean z4) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            boolean z5 = PageManger.isDebug;
        } else if (!PageManger.isInit()) {
            boolean z6 = PageManger.isDebug;
        } else {
            PageConfigManger pageConfigManger = PageManger.getPageConfigManger();
            if (pageConfigManger == null || !pageConfigManger.enableTracer()) {
                boolean z7 = PageManger.isDebug;
                return;
            }
            if (z4) {
                str2 = "UM_".concat(String.valueOf(str2));
            }
            if (!f64680a.containsKey(str)) {
                if (str2.equals("UM_onPause")) {
                    if (PageManger.isDebug) {
                        "tracePageEnd. onPause stop fps. ".concat(String.valueOf(str));
                    }
                    c cVar = f64681b;
                    if (cVar != null) {
                        cVar.b();
                        return;
                    }
                    return;
                }
                return;
            }
            Map map = f64680a.get(str);
            if (map == null) {
                if (PageManger.isDebug) {
                    StringBuilder sb = new StringBuilder("tracePageEnd. ");
                    sb.append(str);
                    sb.append(" is null in pageMap!");
                }
            } else if (!map.containsKey(str2)) {
                if (PageManger.isDebug) {
                    StringBuilder sb2 = new StringBuilder("tracePageEnd. ");
                    sb2.append(str2);
                    sb2.append(" non-exist in ");
                    sb2.append(str);
                    sb2.append(" map!");
                }
            } else {
                Long[] lArr = (Long[]) map.get(str2);
                if (lArr.length >= 2) {
                    lArr[1] = Long.valueOf(System.currentTimeMillis());
                }
                if (str2.equals("UM_onResume")) {
                    if (PageManger.isDebug) {
                        "tracePageEnd. onResume save data. ".concat(String.valueOf(str));
                    }
                    a(str);
                    if (TextUtils.isEmpty(str) || !f64680a.containsKey(str)) {
                        return;
                    }
                    f64680a.remove(str);
                } else if (str2.equals("UM_onPause")) {
                    if (PageManger.isDebug) {
                        "tracePageEnd. onPause stop fps. ".concat(String.valueOf(str));
                    }
                    c cVar2 = f64681b;
                    if (cVar2 != null) {
                        cVar2.b();
                        f64681b = null;
                    }
                }
            }
        }
    }
}
