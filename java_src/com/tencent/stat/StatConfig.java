package com.tencent.stat;

import android.content.Context;
import com.tencent.stat.common.StatConstants;
import com.tencent.stat.common.StatLogger;
import java.util.Iterator;
import org.apache.http.HttpHost;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes6.dex */
public class StatConfig {

    /* renamed from: n  reason: collision with root package name */
    private static String f62838n;

    /* renamed from: o  reason: collision with root package name */
    private static String f62839o;

    /* renamed from: e  reason: collision with root package name */
    private static StatLogger f62829e = com.tencent.stat.common.k.b();

    /* renamed from: a  reason: collision with root package name */
    static b f62825a = new b(2);

    /* renamed from: b  reason: collision with root package name */
    static b f62826b = new b(1);

    /* renamed from: f  reason: collision with root package name */
    private static StatReportStrategy f62830f = StatReportStrategy.APP_LAUNCH;

    /* renamed from: g  reason: collision with root package name */
    private static boolean f62831g = true;

    /* renamed from: h  reason: collision with root package name */
    private static int f62832h = 30000;

    /* renamed from: i  reason: collision with root package name */
    private static int f62833i = 1024;

    /* renamed from: j  reason: collision with root package name */
    private static int f62834j = 30;

    /* renamed from: k  reason: collision with root package name */
    private static int f62835k = 3;

    /* renamed from: l  reason: collision with root package name */
    private static int f62836l = 30;

    /* renamed from: c  reason: collision with root package name */
    static String f62827c = "__HIBERNATE__";

    /* renamed from: m  reason: collision with root package name */
    private static String f62837m = null;

    /* renamed from: d  reason: collision with root package name */
    static String f62828d = "";

    /* renamed from: p  reason: collision with root package name */
    private static int f62840p = 1440;

    /* renamed from: q  reason: collision with root package name */
    private static int f62841q = 1024;

    /* renamed from: r  reason: collision with root package name */
    private static boolean f62842r = true;

    /* renamed from: s  reason: collision with root package name */
    private static long f62843s = 0;

    /* renamed from: t  reason: collision with root package name */
    private static long f62844t = q.a.f73127b;
    public static boolean isAutoExceptionCaught = true;

    /* renamed from: u  reason: collision with root package name */
    private static String f62845u = "http://pingma.qq.com:80/mstat/report";

    /* renamed from: v  reason: collision with root package name */
    private static int f62846v = 0;

    /* renamed from: w  reason: collision with root package name */
    private static volatile int f62847w = 0;

    /* renamed from: x  reason: collision with root package name */
    private static int f62848x = 20;

    /* renamed from: y  reason: collision with root package name */
    private static int f62849y = 0;

    /* renamed from: z  reason: collision with root package name */
    private static boolean f62850z = false;
    private static int A = 4096;
    private static boolean B = false;
    private static String C = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a() {
        return f62834j;
    }

    static String a(Context context) {
        return com.tencent.stat.common.k.d(com.tencent.stat.common.p.a(context, "_mta_ky_tag_", (String) null));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String a(String str, String str2) {
        String string;
        try {
            string = f62826b.f62924b.getString(str);
        } catch (Throwable th) {
            f62829e.w(th);
        }
        return string != null ? string : str2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static synchronized void a(int i4) {
        synchronized (StatConfig.class) {
            f62847w = i4;
        }
    }

    static void a(Context context, String str) {
        if (str != null) {
            com.tencent.stat.common.p.b(context, "_mta_ky_tag_", com.tencent.stat.common.k.c(str));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(b bVar) {
        int i4 = bVar.f62923a;
        if (i4 == f62826b.f62923a) {
            f62826b = bVar;
            b(bVar.f62924b);
        } else if (i4 == f62825a.f62923a) {
            f62825a = bVar;
        }
    }

    static void a(b bVar, JSONObject jSONObject) {
        boolean z4 = false;
        try {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (next.equalsIgnoreCase("v")) {
                    int i4 = jSONObject.getInt(next);
                    if (bVar.f62926d != i4) {
                        z4 = true;
                    }
                    bVar.f62926d = i4;
                } else if (next.equalsIgnoreCase("c")) {
                    String string = jSONObject.getString("c");
                    if (string.length() > 0) {
                        bVar.f62924b = new JSONObject(string);
                    }
                } else if (next.equalsIgnoreCase("m")) {
                    bVar.f62925c = jSONObject.getString("m");
                }
            }
            if (z4) {
                n a5 = n.a(d.a());
                if (a5 != null) {
                    a5.a(bVar);
                }
                if (bVar.f62923a == f62826b.f62923a) {
                    b(bVar.f62924b);
                    c(bVar.f62924b);
                }
            }
        } catch (JSONException e5) {
            f62829e.e((Exception) e5);
        } catch (Throwable th) {
            f62829e.e(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(JSONObject jSONObject) {
        JSONObject jSONObject2;
        b bVar;
        try {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (next.equalsIgnoreCase(Integer.toString(f62826b.f62923a))) {
                    jSONObject2 = jSONObject.getJSONObject(next);
                    bVar = f62826b;
                } else if (next.equalsIgnoreCase(Integer.toString(f62825a.f62923a))) {
                    jSONObject2 = jSONObject.getJSONObject(next);
                    bVar = f62825a;
                } else if (!next.equalsIgnoreCase("rs")) {
                    return;
                } else {
                    StatReportStrategy statReportStrategy = StatReportStrategy.getStatReportStrategy(jSONObject.getInt(next));
                    if (statReportStrategy != null) {
                        f62830f = statReportStrategy;
                        StatLogger statLogger = f62829e;
                        statLogger.d("Change to ReportStrategy:" + statReportStrategy.name());
                    }
                }
                a(bVar, jSONObject2);
            }
        } catch (JSONException e5) {
            f62829e.e((Exception) e5);
        }
    }

    static void a(boolean z4) {
        StatNativeCrashReport.setNativeCrashDebugEnable(z4);
    }

    static boolean a(int i4, int i5, int i6) {
        return i4 >= i5 && i4 <= i6;
    }

    private static boolean a(String str) {
        if (str == null) {
            return false;
        }
        String str2 = f62838n;
        if (str2 == null) {
            f62838n = str;
            return true;
        } else if (str2.contains(str)) {
            return false;
        } else {
            f62838n += "|" + str;
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static HttpHost b() {
        String str = f62837m;
        if (str == null || str.length() <= 0) {
            return null;
        }
        String str2 = f62837m;
        String[] split = str2.split(":");
        int i4 = 80;
        if (split.length == 2) {
            str2 = split[0];
            i4 = Integer.parseInt(split[1]);
        }
        return new HttpHost(str2, i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(int i4) {
        if (i4 < 0) {
            return;
        }
        f62849y = i4;
    }

    static void b(JSONObject jSONObject) {
        try {
            StatReportStrategy statReportStrategy = StatReportStrategy.getStatReportStrategy(jSONObject.getInt("rs"));
            if (statReportStrategy != null) {
                setStatSendStrategy(statReportStrategy);
            }
        } catch (JSONException unused) {
            f62829e.d("rs not found.");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static synchronized void c() {
        synchronized (StatConfig.class) {
            f62847w++;
        }
    }

    static void c(JSONObject jSONObject) {
        try {
            String string = jSONObject.getString(f62827c);
            StatLogger statLogger = f62829e;
            statLogger.d("hibernateVer:" + string + ", current version:" + StatConstants.VERSION);
            long b5 = com.tencent.stat.common.k.b(string);
            if (com.tencent.stat.common.k.b(StatConstants.VERSION) <= b5) {
                com.tencent.stat.common.p.b(d.a(), f62827c, b5);
                setEnableStatService(false);
                StatLogger statLogger2 = f62829e;
                statLogger2.warn("MTA has disable for SDK version of " + string + " or lower.");
            }
        } catch (JSONException unused) {
            f62829e.d("__HIBERNATE__ not found.");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void d() {
        f62849y++;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int e() {
        return f62849y;
    }

    public static synchronized String getAppKey(Context context) {
        synchronized (StatConfig.class) {
            String str = f62838n;
            if (str != null) {
                return str;
            }
            if (context != null && str == null) {
                f62838n = com.tencent.stat.common.k.i(context);
            }
            String str2 = f62838n;
            if (str2 == null || str2.trim().length() == 0) {
                f62829e.error("AppKey can not be null or empty, please read Developer's Guide first!");
            }
            return f62838n;
        }
    }

    public static int getCurSessionStatReportCount() {
        return f62847w;
    }

    public static String getCustomProperty(String str) {
        try {
            return f62825a.f62924b.getString(str);
        } catch (Throwable th) {
            f62829e.e(th);
            return null;
        }
    }

    public static String getCustomProperty(String str, String str2) {
        String string;
        try {
            string = f62825a.f62924b.getString(str);
        } catch (Throwable th) {
            f62829e.e(th);
        }
        return string != null ? string : str2;
    }

    public static String getCustomUserId(Context context) {
        if (context == null) {
            f62829e.error("Context for getCustomUid is null.");
            return null;
        }
        if (C == null) {
            C = com.tencent.stat.common.p.a(context, "MTA_CUSTOM_UID", "");
        }
        return C;
    }

    public static DeviceInfo getDeviceInfo(Context context) {
        return StatMid.getDeviceInfo(context);
    }

    public static synchronized String getInstallChannel(Context context) {
        synchronized (StatConfig.class) {
            String str = f62839o;
            if (str != null) {
                return str;
            }
            String j4 = com.tencent.stat.common.k.j(context);
            f62839o = j4;
            if (j4 == null || j4.trim().length() == 0) {
                f62829e.w("installChannel can not be null or empty, please read Developer's Guide first!");
            }
            return f62839o;
        }
    }

    public static int getMaxBatchReportCount() {
        return f62836l;
    }

    public static int getMaxDaySessionNumbers() {
        return f62848x;
    }

    public static int getMaxParallelTimmingEvents() {
        return f62841q;
    }

    public static int getMaxReportEventLength() {
        return A;
    }

    public static int getMaxSendRetryCount() {
        return f62835k;
    }

    public static int getMaxSessionStatReportCount() {
        return f62846v;
    }

    public static int getMaxStoreEventCount() {
        return f62833i;
    }

    public static String getMid(Context context) {
        return StatMid.getMid(context);
    }

    public static String getQQ() {
        return f62828d;
    }

    public static int getSendPeriodMinutes() {
        return f62840p;
    }

    public static int getSessionTimoutMillis() {
        return f62832h;
    }

    public static String getStatReportUrl() {
        return f62845u;
    }

    public static StatReportStrategy getStatSendStrategy() {
        return f62830f;
    }

    public static void initNativeCrashReport(Context context, String str) {
        if (isEnableStatService()) {
            if (context == null) {
                f62829e.error("The Context of StatConfig.initNativeCrashReport() can not be null!");
            } else {
                StatNativeCrashReport.initNativeCrash(context, str);
            }
        }
    }

    public static boolean isAutoExceptionCaught() {
        return isAutoExceptionCaught;
    }

    public static boolean isDebugEnable() {
        return com.tencent.stat.common.k.b().isDebugEnable();
    }

    public static boolean isEnableConcurrentProcess() {
        return B;
    }

    public static boolean isEnableSmartReporting() {
        return f62842r;
    }

    public static boolean isEnableStatService() {
        return f62831g;
    }

    public static void setAppKey(Context context, String str) {
        StatLogger statLogger;
        String str2;
        if (context == null) {
            statLogger = f62829e;
            str2 = "ctx in StatConfig.setAppKey() is null";
        } else if (str != null && str.length() <= 256) {
            if (f62838n == null) {
                f62838n = a(context);
            }
            if (a(str) || a(com.tencent.stat.common.k.i(context))) {
                a(context, f62838n);
                return;
            }
            return;
        } else {
            statLogger = f62829e;
            str2 = "appkey in StatConfig.setAppKey() is null or exceed 256 bytes";
        }
        statLogger.error(str2);
    }

    public static void setAppKey(String str) {
        StatLogger statLogger;
        String str2;
        if (str == null) {
            statLogger = f62829e;
            str2 = "appkey in StatConfig.setAppKey() is null";
        } else if (str.length() <= 256) {
            f62838n = str;
            return;
        } else {
            statLogger = f62829e;
            str2 = "The length of appkey cann't exceed 256 bytes.";
        }
        statLogger.error(str2);
    }

    public static void setAutoExceptionCaught(boolean z4) {
        isAutoExceptionCaught = z4;
    }

    public static void setCustomUserId(Context context, String str) {
        if (context == null) {
            f62829e.error("Context for setCustomUid is null.");
            return;
        }
        com.tencent.stat.common.p.b(context, "MTA_CUSTOM_UID", str);
        C = str;
    }

    public static void setDebugEnable(boolean z4) {
        com.tencent.stat.common.k.b().setDebugEnable(z4);
        a(z4);
    }

    public static void setEnableConcurrentProcess(boolean z4) {
        B = z4;
    }

    public static void setEnableSmartReporting(boolean z4) {
        f62842r = z4;
    }

    public static void setEnableStatService(boolean z4) {
        f62831g = z4;
        if (z4) {
            return;
        }
        f62829e.warn("!!!!!!MTA StatService has been disabled!!!!!!");
    }

    public static void setInstallChannel(String str) {
        if (str.length() > 128) {
            f62829e.error("the length of installChannel can not exceed the range of 128 bytes.");
        } else {
            f62839o = str;
        }
    }

    public static void setMaxBatchReportCount(int i4) {
        if (a(i4, 2, 1000)) {
            f62836l = i4;
        } else {
            f62829e.error("setMaxBatchReportCount can not exceed the range of [2,1000].");
        }
    }

    public static void setMaxDaySessionNumbers(int i4) {
        if (i4 <= 0) {
            f62829e.e("maxDaySessionNumbers must be greater than 0.");
        } else {
            f62848x = i4;
        }
    }

    public static void setMaxParallelTimmingEvents(int i4) {
        if (a(i4, 1, 4096)) {
            f62841q = i4;
        } else {
            f62829e.error("setMaxParallelTimmingEvents can not exceed the range of [1, 4096].");
        }
    }

    public static void setMaxReportEventLength(int i4) {
        if (i4 <= 0) {
            f62829e.error("maxReportEventLength on setMaxReportEventLength() must greater than 0.");
        } else {
            A = i4;
        }
    }

    public static void setMaxSendRetryCount(int i4) {
        if (a(i4, 1, 1000)) {
            f62835k = i4;
        } else {
            f62829e.error("setMaxSendRetryCount can not exceed the range of [1,1000].");
        }
    }

    public static void setMaxSessionStatReportCount(int i4) {
        if (i4 < 0) {
            f62829e.error("maxSessionStatReportCount cannot be less than 0.");
        } else {
            f62846v = i4;
        }
    }

    public static void setMaxStoreEventCount(int i4) {
        if (a(i4, 0, 500000)) {
            f62833i = i4;
        } else {
            f62829e.error("setMaxStoreEventCount can not exceed the range of [0, 500000].");
        }
    }

    public static void setQQ(Context context, String str) {
        StatService.reportQQ(context, str);
    }

    public static void setSendPeriodMinutes(int i4) {
        if (a(i4, 1, 10080)) {
            f62840p = i4;
        } else {
            f62829e.error("setSendPeriodMinutes can not exceed the range of [1, 7*24*60] minutes.");
        }
    }

    public static void setSessionTimoutMillis(int i4) {
        if (a(i4, 1000, 86400000)) {
            f62832h = i4;
        } else {
            f62829e.error("setSessionTimoutMillis can not exceed the range of [1000, 24 * 60 * 60 * 1000].");
        }
    }

    public static void setStatReportUrl(String str) {
        if (str == null || str.length() == 0) {
            f62829e.error("statReportUrl cannot be null or empty.");
        } else {
            f62845u = str;
        }
    }

    public static void setStatSendStrategy(StatReportStrategy statReportStrategy) {
        f62830f = statReportStrategy;
        StatLogger statLogger = f62829e;
        statLogger.d("Change to statSendStrategy: " + statReportStrategy);
    }
}
