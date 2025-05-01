package com.efs.sdk.launch;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.efs.sdk.base.Constants;
import com.efs.sdk.base.EfsReporter;
import com.efs.sdk.base.integrationtesting.IntegrationTestingUtil;
import com.efs.sdk.base.protocol.record.EfsJSONLog;
import com.umeng.umcrash.UMCrash;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private static long f10485a;

    /* renamed from: b  reason: collision with root package name */
    private static long f10486b;

    /* renamed from: c  reason: collision with root package name */
    private static long f10487c;

    /* renamed from: d  reason: collision with root package name */
    private static long f10488d;

    /* renamed from: e  reason: collision with root package name */
    private static long f10489e;

    /* renamed from: f  reason: collision with root package name */
    private static boolean f10490f;

    /* renamed from: g  reason: collision with root package name */
    private static boolean f10491g;

    /* renamed from: h  reason: collision with root package name */
    private static boolean f10492h;

    /* renamed from: i  reason: collision with root package name */
    private static long f10493i;

    /* renamed from: j  reason: collision with root package name */
    private static long f10494j;

    /* renamed from: k  reason: collision with root package name */
    private static int f10495k;

    /* renamed from: l  reason: collision with root package name */
    private static List<EfsJSONLog> f10496l = new ArrayList();

    /* renamed from: m  reason: collision with root package name */
    private static Map<String, Long[]> f10497m = new HashMap();

    public static void a(Activity activity, String str, boolean z4) {
        long currentTimeMillis;
        Context applicationContext;
        String name;
        int i4;
        long j4;
        long j5;
        long j6;
        long j7;
        long j8;
        long j9;
        long j10;
        long j11;
        long j12;
        if (TextUtils.equals(str, LaunchManager.PAGE_ON_CREATE)) {
            if (z4) {
                boolean z5 = LaunchManager.isDebug;
                f10488d = System.currentTimeMillis();
            }
        } else if (TextUtils.equals(str, LaunchManager.PAGE_ON_RE_START)) {
            if (z4 && f10495k == 0) {
                boolean z6 = LaunchManager.isDebug;
                f10489e = System.currentTimeMillis();
                f10491g = true;
            }
        } else if (TextUtils.equals(str, LaunchManager.PAGE_ON_START)) {
            if (z4) {
                boolean z7 = LaunchManager.isDebug;
                f10495k++;
                f10492h = true;
            }
        } else if (!TextUtils.equals(str, LaunchManager.PAGE_ON_RESUME)) {
            if (TextUtils.equals(str, LaunchManager.PAGE_ON_STOP) && z4) {
                boolean z8 = LaunchManager.isDebug;
                f10495k--;
            }
        } else if (z4) {
        } else {
            boolean z9 = LaunchManager.isDebug;
            if (f10490f) {
                f10490f = false;
                long currentTimeMillis2 = System.currentTimeMillis();
                long j13 = currentTimeMillis2 - f10487c;
                if (LaunchManager.isDebug) {
                    "loadTime is ".concat(String.valueOf(j13));
                }
                long j14 = currentTimeMillis2 - f10485a;
                if (LaunchManager.isDebug) {
                    "======>>>>>> coldTime is ".concat(String.valueOf(j14));
                }
                int i5 = !c.d(activity.getApplicationContext()) ? 1 : 0;
                if (LaunchManager.isDebug) {
                    "type is ".concat(String.valueOf(i5));
                }
                a(activity.getApplicationContext(), i5, activity.getClass().getName(), j14, f10485a, f10486b, f10493i, f10487c, f10494j, currentTimeMillis2, j13, 0L, 0L, f10497m);
            } else if (f10495k == 1) {
                if (f10491g) {
                    f10491g = false;
                    j12 = System.currentTimeMillis() - f10489e;
                    if (LaunchManager.isDebug) {
                        "======>>>>>> hotTime is ".concat(String.valueOf(j12));
                    }
                    applicationContext = activity.getApplicationContext();
                    name = activity.getClass().getName();
                    i4 = 2;
                    j4 = 0;
                    j5 = 0;
                    j6 = 0;
                    j7 = 0;
                    j8 = 0;
                    j9 = 0;
                    j10 = 0;
                    j11 = 0;
                    currentTimeMillis = 0;
                } else if (f10492h) {
                    currentTimeMillis = System.currentTimeMillis() - f10488d;
                    if (LaunchManager.isDebug) {
                        "======>>>>>> warmTime is ".concat(String.valueOf(currentTimeMillis));
                    }
                    applicationContext = activity.getApplicationContext();
                    name = activity.getClass().getName();
                    i4 = 3;
                    j4 = 0;
                    j5 = 0;
                    j6 = 0;
                    j7 = 0;
                    j8 = 0;
                    j9 = 0;
                    j10 = 0;
                    j11 = 0;
                    j12 = 0;
                }
                a(applicationContext, i4, name, j4, j5, j6, j7, j8, j9, j10, j11, j12, currentTimeMillis, f10497m);
            }
            f10492h = false;
        }
    }

    private static void a(Context context, int i4, String str, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, Map<String, Long[]> map) {
        String str2;
        String str3;
        int i5;
        List<EfsJSONLog> list;
        StringBuilder sb;
        String generateString;
        Long valueOf;
        if (!LaunchManager.isInit()) {
            if (i4 == 0) {
                boolean z4 = LaunchManager.isDebug;
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("w_type", i4);
                    jSONObject.put("w_url", str);
                    jSONObject.put("l_version", "0.0.7.umeng");
                    jSONObject.put("wl_avgv", j4);
                    jSONObject.put("wd_init", j5);
                    jSONObject.put("wd_inittm", j6);
                    jSONObject.put("wl_init", j7);
                    jSONObject.put("wd_build", j6);
                    jSONObject.put("wd_buildtm", j8);
                    jSONObject.put("wl_build", j9);
                    jSONObject.put("wd_page", j8);
                    jSONObject.put("wd_pagetm", j10);
                    jSONObject.put("wl_page", j11);
                    if (map != null && !map.isEmpty()) {
                        JSONObject jSONObject2 = new JSONObject();
                        for (Map.Entry<String, Long[]> entry : map.entrySet()) {
                            String key = entry.getKey();
                            Long[] value = entry.getValue();
                            if (key != null && value != null) {
                                try {
                                    JSONArray jSONArray = new JSONArray();
                                    jSONArray.put(value[0]);
                                    jSONArray.put(value[1]);
                                    jSONObject2.put(key, jSONArray);
                                } catch (Throwable unused) {
                                }
                            }
                        }
                        jSONObject.put("userExtra", jSONObject2);
                    }
                    c.a(context, jSONObject.toString());
                    if (LaunchManager.isDebug) {
                        new StringBuilder("no init, cache first launch, content is ").append(jSONObject.toString());
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    th.printStackTrace();
                    return;
                }
            }
            if (LaunchManager.isDebug) {
                str2 = "wl_page";
                str3 = "wd_pagetm";
                "no init, cache launch, type is ".concat(String.valueOf(i4));
            } else {
                str2 = "wl_page";
                str3 = "wd_pagetm";
            }
            EfsJSONLog efsJSONLog = new EfsJSONLog(Constants.LOG_TYPE_STARTPERF);
            efsJSONLog.put("w_type", Integer.valueOf(i4));
            efsJSONLog.put("w_url", str);
            efsJSONLog.put("l_version", "0.0.7.umeng");
            if (i4 == 1) {
                efsJSONLog.put("wl_avgv", Long.valueOf(j4));
                efsJSONLog.put("wd_init", Long.valueOf(j5));
                efsJSONLog.put("wd_inittm", Long.valueOf(j6));
                efsJSONLog.put("wl_init", Long.valueOf(j7));
                efsJSONLog.put("wd_build", Long.valueOf(j6));
                efsJSONLog.put("wd_buildtm", Long.valueOf(j8));
                efsJSONLog.put("wl_build", Long.valueOf(j9));
                efsJSONLog.put("wd_page", Long.valueOf(j8));
                efsJSONLog.put(str3, Long.valueOf(j10));
                efsJSONLog.put(str2, Long.valueOf(j11));
                if (map != null && !map.isEmpty()) {
                    JSONObject jSONObject3 = new JSONObject();
                    for (Map.Entry<String, Long[]> entry2 : map.entrySet()) {
                        String key2 = entry2.getKey();
                        Long[] value2 = entry2.getValue();
                        if (key2 != null && value2 != null) {
                            try {
                                JSONArray jSONArray2 = new JSONArray();
                                try {
                                    jSONArray2.put(value2[0]);
                                    try {
                                        jSONArray2.put(value2[1]);
                                        jSONObject3.put(key2, jSONArray2);
                                    } catch (Throwable unused2) {
                                    }
                                } catch (Throwable unused3) {
                                }
                            } catch (Throwable unused4) {
                            }
                        }
                    }
                    efsJSONLog.put("userExtra", jSONObject3);
                }
            } else if (i4 == 2) {
                efsJSONLog.put("wl_avgv", Long.valueOf(j12));
            } else {
                i5 = 3;
                if (i4 == 3) {
                    efsJSONLog.put("wl_avgv", Long.valueOf(j13));
                }
                list = f10496l;
                if (list != null || list.size() >= i5) {
                    boolean z5 = LaunchManager.isDebug;
                    return;
                }
                f10496l.add(efsJSONLog);
                if (!LaunchManager.isDebug) {
                    return;
                }
                sb = new StringBuilder("cache launch report --->>> ");
                generateString = efsJSONLog.generateString();
            }
            i5 = 3;
            list = f10496l;
            if (list != null) {
            }
            boolean z52 = LaunchManager.isDebug;
            return;
        }
        LaunchConfigManager launchConfigManager = LaunchManager.getLaunchConfigManager();
        if ((launchConfigManager == null || !launchConfigManager.enableTracer()) && !IntegrationTestingUtil.isIntegrationTestingInPeriod()) {
            boolean z6 = LaunchManager.isDebug;
            return;
        }
        EfsJSONLog efsJSONLog2 = new EfsJSONLog(Constants.LOG_TYPE_STARTPERF);
        efsJSONLog2.put("w_type", Integer.valueOf(i4));
        efsJSONLog2.put("w_url", str);
        efsJSONLog2.put("l_version", "0.0.7.umeng");
        if (i4 == 0 || i4 == 1) {
            efsJSONLog2.put("wl_avgv", Long.valueOf(j4));
            efsJSONLog2.put("wd_init", Long.valueOf(j5));
            efsJSONLog2.put("wd_inittm", Long.valueOf(j6));
            efsJSONLog2.put("wl_init", Long.valueOf(j7));
            efsJSONLog2.put("wd_build", Long.valueOf(j6));
            efsJSONLog2.put("wd_buildtm", Long.valueOf(j8));
            efsJSONLog2.put("wl_build", Long.valueOf(j9));
            efsJSONLog2.put("wd_page", Long.valueOf(j8));
            efsJSONLog2.put("wd_pagetm", Long.valueOf(j10));
            efsJSONLog2.put("wl_page", Long.valueOf(j11));
            if (map != null && !map.isEmpty()) {
                JSONObject jSONObject4 = new JSONObject();
                for (Map.Entry<String, Long[]> entry3 : map.entrySet()) {
                    String key3 = entry3.getKey();
                    Long[] value3 = entry3.getValue();
                    if (key3 != null && value3 != null) {
                        try {
                            JSONArray jSONArray3 = new JSONArray();
                            jSONArray3.put(value3[0]);
                            jSONArray3.put(value3[1]);
                            jSONObject4.put(key3, jSONArray3);
                        } catch (Throwable unused5) {
                        }
                    }
                }
                efsJSONLog2.put("userExtra", jSONObject4);
            }
        } else {
            if (i4 == 2) {
                valueOf = Long.valueOf(j12);
            } else if (i4 == 3) {
                valueOf = Long.valueOf(j13);
            }
            efsJSONLog2.put("wl_avgv", valueOf);
        }
        String a5 = c.a(context);
        if (LaunchManager.isDebug) {
            "umid is ".concat(String.valueOf(a5));
        }
        if (a5 != null && !TextUtils.isEmpty(a5)) {
            if (LaunchManager.isDebug) {
                new StringBuilder("send current launch report --->>> ").append(efsJSONLog2.generateString());
            }
            EfsReporter reporter = LaunchManager.getReporter();
            if (reporter != null) {
                reporter.send(efsJSONLog2);
                return;
            }
            return;
        }
        List<EfsJSONLog> list2 = f10496l;
        if (list2 == null || list2.size() >= 3) {
            boolean z7 = LaunchManager.isDebug;
            return;
        }
        f10496l.add(efsJSONLog2);
        if (!LaunchManager.isDebug) {
            return;
        }
        sb = new StringBuilder("cache launch report --->>> ");
        generateString = efsJSONLog2.generateString();
        sb.append(generateString);
    }

    public static void a(Context context, String str) {
        boolean z4 = LaunchManager.isDebug;
        if (str == null || TextUtils.isEmpty(str)) {
            str = c.a(context);
        }
        if (str == null || TextUtils.isEmpty(str)) {
            return;
        }
        HashMap hashMap = new HashMap(1);
        hashMap.put(UMCrash.KEY_HEADER_UMID, str);
        if (LaunchManager.getReporter() != null) {
            LaunchManager.getReporter().addPublicParams(hashMap);
        }
        String b5 = c.b(context);
        if (b5 != null && !TextUtils.isEmpty(b5)) {
            try {
                JSONObject jSONObject = new JSONObject(b5);
                jSONObject.put(UMCrash.KEY_HEADER_UMID, str);
                if (a(jSONObject)) {
                    c.c(context);
                }
            } catch (JSONException e5) {
                e5.printStackTrace();
            }
        }
        List<EfsJSONLog> list = f10496l;
        if (list == null || list.size() <= 0) {
            return;
        }
        for (EfsJSONLog efsJSONLog : f10496l) {
            if (efsJSONLog != null) {
                if (LaunchManager.isDebug) {
                    new StringBuilder("send cache launch report --->>> ").append(efsJSONLog.generateString());
                }
                EfsReporter reporter = LaunchManager.getReporter();
                if (reporter != null) {
                    reporter.send(efsJSONLog);
                }
            }
        }
        f10496l.clear();
        f10496l = null;
    }

    public static void a(String str, long j4) {
        Map<String, Long[]> map = f10497m;
        if (map == null || map.containsKey(str) || f10497m.size() >= 10) {
            boolean z4 = LaunchManager.isDebug;
            return;
        }
        Long[] lArr = new Long[2];
        lArr[0] = Long.valueOf(j4);
        f10497m.put(str, lArr);
    }

    public static void a(String str, boolean z4) {
        if (TextUtils.equals(str, LaunchManager.APP_CONSTRUCT)) {
            return;
        }
        if (!TextUtils.equals(str, LaunchManager.APP_ATTACH_BASE_CONTEXT)) {
            if (!TextUtils.equals(str, LaunchManager.APP_ON_CREATE) || z4) {
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            f10487c = currentTimeMillis;
            f10494j = currentTimeMillis - f10486b;
            if (LaunchManager.isDebug) {
                new StringBuilder("buildTime is ").append(f10494j);
            }
        } else if (z4) {
            f10485a = System.currentTimeMillis();
            f10490f = true;
        } else {
            long currentTimeMillis2 = System.currentTimeMillis();
            f10486b = currentTimeMillis2;
            f10493i = currentTimeMillis2 - f10485a;
            if (LaunchManager.isDebug) {
                new StringBuilder("initTime is ").append(f10493i);
            }
        }
    }

    private static boolean a(JSONObject jSONObject) {
        try {
            EfsJSONLog efsJSONLog = new EfsJSONLog(Constants.LOG_TYPE_STARTPERF);
            efsJSONLog.put("w_type", jSONObject.opt("w_type"));
            efsJSONLog.put("w_url", jSONObject.opt("w_url"));
            efsJSONLog.put("l_version", jSONObject.opt("l_version"));
            efsJSONLog.put("wl_avgv", jSONObject.opt("wl_avgv"));
            efsJSONLog.put("wd_init", jSONObject.opt("wd_init"));
            efsJSONLog.put("wd_inittm", jSONObject.opt("wd_inittm"));
            efsJSONLog.put("wl_init", jSONObject.opt("wl_init"));
            efsJSONLog.put("wd_build", jSONObject.opt("wd_build"));
            efsJSONLog.put("wd_buildtm", jSONObject.opt("wd_buildtm"));
            efsJSONLog.put("wl_build", jSONObject.opt("wl_build"));
            efsJSONLog.put("wd_page", jSONObject.opt("wd_page"));
            efsJSONLog.put("wd_pagetm", jSONObject.opt("wd_pagetm"));
            efsJSONLog.put("wl_page", jSONObject.opt("wl_page"));
            efsJSONLog.put("userExtra", jSONObject.opt("userExtra"));
            if (LaunchManager.isDebug) {
                new StringBuilder("send cache cold launch report --->>> ").append(efsJSONLog.generateString());
            }
            EfsReporter reporter = LaunchManager.getReporter();
            if (reporter != null) {
                reporter.send(efsJSONLog);
                return true;
            }
            return false;
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    public static void b(String str, long j4) {
        Map<String, Long[]> map = f10497m;
        if (map == null || !map.containsKey(str)) {
            boolean z4 = LaunchManager.isDebug;
            return;
        }
        Long[] lArr = f10497m.get(str);
        lArr[1] = Long.valueOf(j4);
        f10497m.put(str, lArr);
    }
}
