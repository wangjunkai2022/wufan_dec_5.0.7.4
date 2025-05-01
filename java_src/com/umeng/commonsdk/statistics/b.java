package com.umeng.commonsdk.statistics;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.text.TextUtils;
import android.util.Base64;
import com.coremedia.iso.boxes.k1;
import com.efs.sdk.base.core.util.NetworkUtil;
import com.kuaishou.weapon.p0.g;
import com.umeng.analytics.AnalyticsConfig;
import com.umeng.analytics.pro.as;
import com.umeng.analytics.pro.bk;
import com.umeng.analytics.pro.bm;
import com.umeng.analytics.pro.ce;
import com.umeng.analytics.pro.f;
import com.umeng.commonsdk.config.FieldManager;
import com.umeng.commonsdk.framework.UMEnvelopeBuild;
import com.umeng.commonsdk.framework.UMFrUtils;
import com.umeng.commonsdk.internal.crash.UMCrashManager;
import com.umeng.commonsdk.statistics.common.DataHelper;
import com.umeng.commonsdk.statistics.common.DeviceConfig;
import com.umeng.commonsdk.statistics.common.ULog;
import com.umeng.commonsdk.statistics.idtracking.Envelope;
import com.umeng.commonsdk.statistics.idtracking.ImprintHandler;
import com.umeng.commonsdk.statistics.internal.PreferenceWrapper;
import com.umeng.commonsdk.utils.UMUtils;
import com.umeng.commonsdk.utils.d;
import io.netty.handler.codec.http.websocketx.WebSocketServerHandshaker;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: EnvelopeManager.java */
/* loaded from: classes6.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    public static String f64357a = null;

    /* renamed from: b  reason: collision with root package name */
    public static String f64358b = "";

    /* renamed from: c  reason: collision with root package name */
    private static final String f64359c = "EnvelopeManager";

    /* renamed from: d  reason: collision with root package name */
    private static final String f64360d = "debug.umeng.umTaskId";

    /* renamed from: e  reason: collision with root package name */
    private static final String f64361e = "debug.umeng.umCaseId";

    /* renamed from: f  reason: collision with root package name */
    private static final String f64362f = "empty";

    /* renamed from: g  reason: collision with root package name */
    private static String f64363g = "";

    /* renamed from: h  reason: collision with root package name */
    private static String f64364h = "";

    /* renamed from: i  reason: collision with root package name */
    private static String f64365i;

    /* renamed from: j  reason: collision with root package name */
    private static Map<String, String> f64366j;

    /* renamed from: l  reason: collision with root package name */
    private static boolean f64367l;

    /* renamed from: k  reason: collision with root package name */
    private int f64368k = 0;

    static {
        HashMap hashMap = new HashMap();
        f64366j = hashMap;
        hashMap.put("header", "#h");
        f64366j.put(bm.f63460u, "#sdt");
        f64366j.put(bm.Q, "#ac");
        f64366j.put("device_model", "#dm");
        f64366j.put(bm.f63446g, "#umid");
        f64366j.put(bm.f63463x, bm.f63463x);
        f64366j.put("language", "#lang");
        f64366j.put(bm.ai, "#dt");
        f64366j.put(bm.f63465z, "#rl");
        f64366j.put(bm.H, "#dmf");
        f64366j.put("device_name", "#dn");
        f64366j.put("platform_version", "#pv");
        f64366j.put("font_size_setting", "#fss");
        f64366j.put(bm.f63464y, "#ov");
        f64366j.put(bm.I, "#did");
        f64366j.put("platform_sdk_version", "#psv");
        f64366j.put(bm.F, "#db");
        f64366j.put("appkey", "#ak");
        f64366j.put(bm.Y, "#itr");
        f64366j.put("id_type", "#it");
        f64366j.put(k1.f9761p, "#ud");
        f64366j.put("device_id", "#dd");
        f64366j.put(bm.X, "#imp");
        f64366j.put("sdk_version", "#sv");
        f64366j.put("st", "#st");
        f64366j.put("analytics", "#a");
        f64366j.put(bm.f63454o, "#pkg");
        f64366j.put(bm.f63455p, "#sig");
        f64366j.put(bm.f63456q, "#sis1");
        f64366j.put(bm.f63457r, "#sis");
        f64366j.put("app_version", "#av");
        f64366j.put("version_code", "#vc");
        f64366j.put(bm.f63461v, "#imd");
        f64366j.put(bm.B, "#mnc");
        f64366j.put(bm.E, "#boa");
        f64366j.put(bm.G, "#mant");
        f64366j.put(bm.M, "#tz");
        f64366j.put(bm.O, "#ct");
        f64366j.put(bm.P, "#car");
        f64366j.put(bm.f63458s, "#disn");
        f64366j.put(bm.T, "#nt");
        f64366j.put(bm.f63441b, "#cv");
        f64366j.put(bm.f63443d, "#mv");
        f64366j.put(bm.f63442c, "#cot");
        f64366j.put(bm.f63444e, "#mod");
        f64366j.put(bm.aj, "#al");
        f64366j.put("session_id", "#sid");
        f64366j.put(bm.S, "#ip");
        f64366j.put(bm.U, "#sre");
        f64366j.put(bm.V, "#fre");
        f64366j.put(bm.W, "#ret");
        f64366j.put("channel", "#chn");
        f64366j.put("wrapper_type", "#wt");
        f64366j.put("wrapper_version", "#wv");
        f64366j.put(bm.aZ, "#tsv");
        f64366j.put(bm.ba, "#rps");
        f64366j.put(bm.bf, "#mov");
        f64366j.put(f.f63696i, "#vt");
        f64366j.put("secret", "#sec");
        f64366j.put(f.an, "#prv");
        f64366j.put(f.f63699l, "#$prv");
        f64366j.put(f.f63700m, "#uda");
        f64366j.put(bm.f63440a, "#tok");
        f64366j.put(bm.aR, "#iv");
        f64366j.put(bm.R, "#ast");
        f64366j.put("backstate", "#bst");
        f64366j.put("zdata_ver", "#zv");
        f64366j.put("zdata_req_ts", "#zrt");
        f64366j.put("app_b_v", "#bv");
        f64366j.put("zdata", "#zta");
        f64366j.put(bm.ap, "#mt");
        f64366j.put(bm.am, "#zsv");
        f64366j.put("others_OS", "#oos");
    }

    public static String a(String str) {
        return f64366j.containsKey(str) ? f64366j.get(str) : str;
    }

    private static boolean b() {
        f64363g = UMUtils.getSystemProperty(f64360d, "");
        f64364h = UMUtils.getSystemProperty(f64361e, "");
        return (!TextUtils.isEmpty(f64363g) && !f64362f.equals(f64363g)) && (!TextUtils.isEmpty(f64364h) && !f64362f.equals(f64364h));
    }

    public static void a() {
        if (f64365i != null) {
            f64365i = null;
            com.umeng.commonsdk.statistics.idtracking.f.a();
        }
    }

    public JSONObject b(Context context, JSONObject jSONObject, JSONObject jSONObject2, String str) {
        try {
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put(a("header"), new JSONObject());
            try {
                if (b()) {
                    jSONObject.put("umTaskId", f64363g);
                    jSONObject.put("umCaseId", f64364h);
                }
            } catch (Throwable unused) {
            }
            if (jSONObject != null) {
                jSONObject3 = a(jSONObject3, jSONObject);
            }
            if (jSONObject3 != null && jSONObject2 != null) {
                Iterator<String> keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    if (next != null && (next instanceof String)) {
                        String str2 = next;
                        if (jSONObject2.opt(str2) != null) {
                            try {
                                jSONObject3.put(str2, jSONObject2.opt(str2));
                            } catch (Exception unused2) {
                            }
                        }
                    }
                }
            }
            if (jSONObject3 != null && DataHelper.largeThanMaxSize(jSONObject3.toString().getBytes().length, DataHelper.ENVELOPE_ENTITY_RAW_LENGTH_MAX)) {
                SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(context);
                if (sharedPreferences != null) {
                    sharedPreferences.edit().putInt("serial", sharedPreferences.getInt("serial", 1) + 1).commit();
                }
                return a(113, jSONObject3);
            }
            Envelope envelope = null;
            if (jSONObject3 != null && (envelope = a(context, jSONObject3.toString().getBytes())) == null) {
                return a(111, jSONObject3);
            }
            Envelope envelope2 = envelope;
            if (envelope2 != null && DataHelper.largeThanMaxSize(envelope2.toBinary().length, DataHelper.ENVELOPE_LENGTH_MAX)) {
                return a(114, jSONObject3);
            }
            int a5 = a(context, envelope2, "z==1.2.0", DeviceConfig.getAppVersionName(context), str);
            if (a5 != 0) {
                return a(a5, jSONObject3);
            }
            if (ULog.DEBUG) {
                StringBuilder sb = new StringBuilder();
                sb.append("constructHeader size is ");
                sb.append(jSONObject3.toString().getBytes().length);
            }
            return jSONObject3;
        } catch (Throwable th) {
            UMCrashManager.reportCrash(context, th);
            return a(110, new JSONObject());
        }
    }

    public static long a(Context context) {
        long j4 = DataHelper.ENVELOPE_ENTITY_RAW_LENGTH_MAX - DataHelper.ENVELOPE_EXTRA_LENGTH;
        if (ULog.DEBUG) {
            StringBuilder sb = new StringBuilder();
            sb.append("free size is ");
            sb.append(j4);
        }
        return j4;
    }

    private JSONObject a(int i4, JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                jSONObject.put("exception", i4);
            } catch (Exception unused) {
            }
            return jSONObject;
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("exception", i4);
        } catch (Exception unused2) {
        }
        return jSONObject2;
    }

    public JSONObject a(Context context, JSONObject jSONObject, JSONObject jSONObject2, String str, String str2, String str3) {
        JSONObject jSONObject3;
        String str4;
        boolean z4;
        String str5;
        Envelope envelope;
        JSONObject optJSONObject;
        if (ULog.DEBUG && jSONObject != null && jSONObject2 != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("headerJSONObject size is ");
            sb.append(jSONObject.toString().getBytes().length);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("bodyJSONObject size is ");
            sb2.append(jSONObject2.toString().getBytes().length);
        }
        JSONObject jSONObject4 = null;
        if (context != null && jSONObject2 != null) {
            try {
                if (jSONObject2.has("analytics") && (optJSONObject = jSONObject2.optJSONObject("analytics")) != null && optJSONObject.has(f.f63701n)) {
                    str4 = str2;
                    z4 = true;
                } else {
                    str4 = str2;
                    z4 = false;
                }
                JSONObject a5 = a(context, str4, z4);
                if (a5 != null && jSONObject != null) {
                    a5 = a(a5, jSONObject);
                }
                JSONObject jSONObject5 = a5;
                if (jSONObject5 != null) {
                    Iterator<String> keys = jSONObject2.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        if (next != null && (next instanceof String)) {
                            String str6 = next;
                            if (jSONObject2.opt(str6) != null) {
                                try {
                                    jSONObject5.put(a(str6), jSONObject2.opt(str6));
                                } catch (Exception unused) {
                                }
                            }
                        }
                    }
                }
                if (TextUtils.isEmpty(str2)) {
                    str4 = "u";
                }
                String str7 = TextUtils.isEmpty(str3) ? "1.0.0" : str3;
                if (jSONObject5 != null) {
                    String str8 = str4 + "==" + str7 + "&=";
                    if (TextUtils.isEmpty(str8)) {
                        return a(101, jSONObject5);
                    }
                    if (str8.endsWith("&=")) {
                        str8 = str8.substring(0, str8.length() - 2);
                    }
                    str5 = str8;
                } else {
                    str5 = null;
                }
                if (jSONObject5 != null) {
                    try {
                        com.umeng.commonsdk.statistics.idtracking.f a6 = com.umeng.commonsdk.statistics.idtracking.f.a(context);
                        if (a6 != null) {
                            a6.b();
                            String encodeToString = Base64.encodeToString(new ce().a(a6.c()), 0);
                            if (!TextUtils.isEmpty(encodeToString)) {
                                JSONObject jSONObject6 = jSONObject5.getJSONObject(a("header"));
                                jSONObject6.put(a(bm.Y), encodeToString);
                                jSONObject5.put(a("header"), jSONObject6);
                            }
                        }
                    } catch (Exception unused2) {
                    }
                }
                if (jSONObject5 != null && DataHelper.largeThanMaxSize(jSONObject5.toString().getBytes().length, DataHelper.ENVELOPE_ENTITY_RAW_LENGTH_MAX)) {
                    SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(context);
                    if (sharedPreferences != null) {
                        sharedPreferences.edit().putInt("serial", sharedPreferences.getInt("serial", 1) + 1).commit();
                    }
                    return a(113, jSONObject5);
                }
                if (jSONObject5 != null) {
                    Envelope a7 = a(context, jSONObject5.toString().getBytes());
                    if (a7 == null) {
                        return a(111, jSONObject5);
                    }
                    envelope = a7;
                } else {
                    envelope = null;
                }
                if (envelope != null && DataHelper.largeThanMaxSize(envelope.toBinary().length, DataHelper.ENVELOPE_LENGTH_MAX)) {
                    return a(114, jSONObject5);
                }
                int a8 = a(context, envelope, str5, jSONObject5 != null ? jSONObject5.optJSONObject(a("header")).optString(a("app_version")) : null, str);
                if (a8 != 0) {
                    return a(a8, jSONObject5);
                }
                if (ULog.DEBUG) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("constructHeader size is ");
                    sb3.append(jSONObject5.toString().getBytes().length);
                }
                if (!str5.startsWith(bm.aH) && !str5.startsWith("i") && !str5.startsWith(bm.aM) && !str5.startsWith("a") && !com.umeng.commonsdk.stateless.b.a()) {
                    new com.umeng.commonsdk.stateless.b(context);
                    com.umeng.commonsdk.stateless.b.b();
                }
                return jSONObject5;
            } catch (Throwable th) {
                UMCrashManager.reportCrash(context, th);
                if (jSONObject != null) {
                    try {
                        jSONObject3 = new JSONObject();
                    } catch (Exception e5) {
                        e = e5;
                    }
                    try {
                        jSONObject3.put("header", jSONObject);
                    } catch (JSONException unused3) {
                    } catch (Exception e6) {
                        e = e6;
                        jSONObject4 = jSONObject3;
                        UMCrashManager.reportCrash(context, e);
                        return a(110, jSONObject4);
                    }
                    jSONObject4 = jSONObject3;
                }
                if (jSONObject4 == null) {
                    jSONObject4 = new JSONObject();
                }
                Iterator<String> keys2 = jSONObject2.keys();
                while (keys2.hasNext()) {
                    String next2 = keys2.next();
                    if (next2 != null && (next2 instanceof String)) {
                        String str9 = next2;
                        if (jSONObject2.opt(str9) != null) {
                            try {
                                jSONObject4.put(str9, jSONObject2.opt(str9));
                            } catch (Exception unused4) {
                            }
                        }
                    }
                }
                return a(110, jSONObject4);
            }
        }
        return a(110, (JSONObject) null);
    }

    private static int[] b(Context context) {
        int[] iArr = new int[3];
        try {
            SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences(com.umeng.commonsdk.internal.c.f64259a, 0);
            if (sharedPreferences != null) {
                iArr[0] = sharedPreferences.getInt(com.umeng.commonsdk.internal.c.f64260b, 0);
                iArr[1] = sharedPreferences.getInt(com.umeng.commonsdk.internal.c.f64261c, 0);
                iArr[2] = sharedPreferences.getInt("policyGrantResult", 0);
            }
        } catch (Throwable unused) {
        }
        return iArr;
    }

    public JSONObject a(Context context, JSONObject jSONObject, JSONObject jSONObject2, String str) {
        try {
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put(a("header"), new JSONObject());
            if (jSONObject != null) {
                jSONObject3 = a(jSONObject3, jSONObject);
            }
            if (jSONObject3 != null && jSONObject2 != null) {
                Iterator<String> keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    if (next != null && (next instanceof String)) {
                        String str2 = next;
                        if (jSONObject2.opt(str2) != null) {
                            try {
                                jSONObject3.put(str2, jSONObject2.opt(str2));
                            } catch (Exception unused) {
                            }
                        }
                    }
                }
            }
            if (jSONObject3 != null && DataHelper.largeThanMaxSize(jSONObject3.toString().getBytes().length, DataHelper.ENVELOPE_ENTITY_RAW_LENGTH_MAX)) {
                SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(context);
                if (sharedPreferences != null) {
                    sharedPreferences.edit().putInt("serial", sharedPreferences.getInt("serial", 1) + 1).commit();
                }
                return a(113, jSONObject3);
            }
            Envelope envelope = null;
            if (jSONObject3 != null && (envelope = a(context, jSONObject3.toString().getBytes())) == null) {
                return a(111, jSONObject3);
            }
            Envelope envelope2 = envelope;
            if (envelope2 != null && DataHelper.largeThanMaxSize(envelope2.toBinary().length, DataHelper.ENVELOPE_LENGTH_MAX)) {
                return a(114, jSONObject3);
            }
            int a5 = a(context, envelope2, "h==1.2.0", "", str);
            if (a5 != 0) {
                return a(a5, jSONObject3);
            }
            if (ULog.DEBUG) {
                StringBuilder sb = new StringBuilder();
                sb.append("constructHeader size is ");
                sb.append(jSONObject3.toString().getBytes().length);
            }
            return jSONObject3;
        } catch (Throwable th) {
            UMCrashManager.reportCrash(context, th);
            return a(110, new JSONObject());
        }
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:150:0x0412 -> B:171:0x0412). Please submit an issue!!! */
    private static JSONObject a(Context context, String str, boolean z4) {
        SharedPreferences sharedPreferences;
        JSONObject jSONObject;
        try {
            SharedPreferences sharedPreferences2 = PreferenceWrapper.getDefault(context);
            if (!TextUtils.isEmpty(f64365i)) {
                try {
                    jSONObject = new JSONObject(f64365i);
                    sharedPreferences = sharedPreferences2;
                } catch (Exception unused) {
                    sharedPreferences = sharedPreferences2;
                    jSONObject = null;
                }
            } else {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put(a(bm.f63455p), DeviceConfig.getAppMD5Signature(context));
                jSONObject2.put(a(bm.f63456q), DeviceConfig.getAppSHA1Key(context));
                jSONObject2.put(a(bm.f63457r), DeviceConfig.getAppHashKey(context));
                jSONObject2.put(a("app_version"), DeviceConfig.getAppVersionName(context));
                jSONObject2.put(a("version_code"), Integer.parseInt(DeviceConfig.getAppVersionCode(context)));
                jSONObject2.put(a(bm.f63461v), DeviceConfig.getDeviceIdUmengMD5(context));
                jSONObject2.put(a(bm.f63462w), DeviceConfig.getCPU());
                String mccmnc = DeviceConfig.getMCCMNC(context);
                if (!TextUtils.isEmpty(mccmnc)) {
                    jSONObject2.put(a(bm.B), mccmnc);
                    f64358b = mccmnc;
                } else {
                    jSONObject2.put(a(bm.B), "");
                }
                if (FieldManager.allow(d.I)) {
                    String subOSName = DeviceConfig.getSubOSName(context);
                    if (!TextUtils.isEmpty(subOSName)) {
                        jSONObject2.put(a(bm.K), subOSName);
                    }
                    String subOSVersion = DeviceConfig.getSubOSVersion(context);
                    if (!TextUtils.isEmpty(subOSVersion)) {
                        jSONObject2.put(a(bm.L), subOSVersion);
                    }
                }
                String deviceType = DeviceConfig.getDeviceType(context);
                if (!TextUtils.isEmpty(deviceType)) {
                    jSONObject2.put(a(bm.ai), deviceType);
                }
                jSONObject2.put(a(bm.f63454o), DeviceConfig.getPackageName(context));
                jSONObject2.put(a(bm.f63460u), "Android");
                jSONObject2.put(a("device_id"), DeviceConfig.getDeviceId(context));
                jSONObject2.put(a("device_model"), Build.MODEL);
                jSONObject2.put(a(bm.E), Build.BOARD);
                jSONObject2.put(a(bm.F), Build.BRAND);
                sharedPreferences = sharedPreferences2;
                jSONObject2.put(a(bm.G), Build.TIME);
                jSONObject2.put(a(bm.H), Build.MANUFACTURER);
                jSONObject2.put(a(bm.I), Build.ID);
                jSONObject2.put(a("device_name"), Build.DEVICE);
                jSONObject2.put(a(bm.f63464y), Build.VERSION.RELEASE);
                jSONObject2.put(a(bm.f63463x), "Android");
                int[] resolutionArray = DeviceConfig.getResolutionArray(context);
                if (resolutionArray != null) {
                    String a5 = a(bm.f63465z);
                    jSONObject2.put(a5, resolutionArray[1] + WebSocketServerHandshaker.SUB_PROTOCOL_WILDCARD + resolutionArray[0]);
                }
                jSONObject2.put(a("mc"), DeviceConfig.getMac(context));
                jSONObject2.put(a(bm.M), DeviceConfig.getTimeZone(context));
                String[] localeInfo = DeviceConfig.getLocaleInfo(context);
                jSONObject2.put(a(bm.O), localeInfo[0]);
                jSONObject2.put(a("language"), localeInfo[1]);
                jSONObject2.put(a(bm.P), DeviceConfig.getNetworkOperatorName(context));
                jSONObject2.put(a(bm.f63458s), DeviceConfig.getAppName(context));
                String[] networkAccessMode = DeviceConfig.getNetworkAccessMode(context);
                if ("Wi-Fi".equals(networkAccessMode[0])) {
                    jSONObject2.put(a(bm.Q), NetworkUtil.NETWORK_TYPE_WIFI);
                } else if ("2G/3G".equals(networkAccessMode[0])) {
                    jSONObject2.put(a(bm.Q), "2G/3G");
                } else {
                    jSONObject2.put(a(bm.Q), "unknow");
                }
                if (!"".equals(networkAccessMode[1])) {
                    jSONObject2.put(a(bm.R), networkAccessMode[1]);
                }
                if (DeviceConfig.isHarmony(context)) {
                    jSONObject2.put(a("others_OS"), "harmony");
                } else {
                    jSONObject2.put(a("others_OS"), "Android");
                }
                jSONObject2.put(a(bm.T), DeviceConfig.getNetworkType(context));
                jSONObject2.put(a(bm.f63441b), "9.6.7");
                jSONObject2.put(a(bm.f63442c), SdkVersion.SDK_TYPE);
                jSONObject2.put(a(bm.f63443d), "1");
                if (!TextUtils.isEmpty(f64357a)) {
                    jSONObject2.put(a(bm.f63444e), f64357a);
                }
                jSONObject2.put(a(bm.aj), Build.VERSION.SDK_INT);
                if (!TextUtils.isEmpty(UMUtils.VALUE_REC_VERSION_NAME)) {
                    jSONObject2.put(a(bm.af), UMUtils.VALUE_REC_VERSION_NAME);
                }
                try {
                    String uUIDForZid = UMUtils.getUUIDForZid(context);
                    if (TextUtils.isEmpty(uUIDForZid)) {
                        UMUtils.setUUIDForZid(context);
                        uUIDForZid = UMUtils.getUUIDForZid(context);
                    }
                    jSONObject2.put(a("session_id"), uUIDForZid);
                } catch (Throwable unused2) {
                }
                try {
                    if (DeviceConfig.hasRequestPermission(context, "android.permission.PACKAGE_USAGE_STATS")) {
                        jSONObject2.put(bm.ar, "1");
                        if (DeviceConfig.hasOpsPermission(context.getApplicationContext())) {
                            jSONObject2.put(bm.as, "1");
                        }
                    }
                    if (DeviceConfig.isSystemApp(context)) {
                        jSONObject2.put(bm.aq, "1");
                    }
                } catch (Throwable unused3) {
                }
                if (DeviceConfig.isHonorDevice()) {
                    try {
                        if (bk.c()) {
                            jSONObject2.put(bm.at, 2);
                        }
                        if (bk.b()) {
                            jSONObject2.put(bm.at, 3);
                        }
                    } catch (Throwable unused4) {
                    }
                }
                f64365i = jSONObject2.toString();
                jSONObject = jSONObject2;
            }
            if (jSONObject == null) {
                return null;
            }
            try {
                jSONObject.put(a(bm.ak), UMUtils.getOaidRequiredTime(context));
            } catch (Exception unused5) {
            }
            try {
                SharedPreferences sharedPreferences3 = sharedPreferences;
                jSONObject.put(a(bm.U), sharedPreferences3.getInt("successful_request", 0));
                jSONObject.put(a(bm.V), sharedPreferences3.getInt(bm.V, 0));
                jSONObject.put(a(bm.W), sharedPreferences3.getInt("last_request_spent_ms", 0));
                String zid = UMUtils.getZid(context);
                if (!TextUtils.isEmpty(zid)) {
                    jSONObject.put(a(bm.al), zid);
                }
                if (!TextUtils.isEmpty(UMUtils.VALUE_ASMS_VERSION)) {
                    jSONObject.put(a(bm.am), UMUtils.VALUE_ASMS_VERSION);
                }
            } catch (Exception unused6) {
            }
            jSONObject.put(a("channel"), UMUtils.getChannel(context));
            jSONObject.put(a("appkey"), UMUtils.getAppkey(context));
            try {
                String deviceToken = UMUtils.getDeviceToken(context);
                if (!TextUtils.isEmpty(deviceToken)) {
                    jSONObject.put(a(bm.f63440a), deviceToken);
                }
            } catch (Exception e5) {
                UMCrashManager.reportCrash(context, e5);
            }
            try {
                String imprintProperty = UMEnvelopeBuild.imprintProperty(context, bm.f63446g, null);
                if (!TextUtils.isEmpty(imprintProperty)) {
                    jSONObject.put(a(bm.f63446g), imprintProperty);
                }
            } catch (Exception e6) {
                UMCrashManager.reportCrash(context, e6);
            }
            try {
                jSONObject.put(a("wrapper_type"), a.f64354a);
                jSONObject.put(a("wrapper_version"), a.f64355b);
            } catch (Exception unused7) {
            }
            try {
                int targetSdkVersion = UMUtils.getTargetSdkVersion(context);
                boolean checkPermission = UMUtils.checkPermission(context, g.f55583c);
                jSONObject.put(a(bm.aZ), targetSdkVersion);
                if (checkPermission) {
                    jSONObject.put(a(bm.ba), "yes");
                } else {
                    jSONObject.put(a(bm.ba), "no");
                }
            } catch (Throwable unused8) {
            }
            try {
                if (b()) {
                    jSONObject.put("umTaskId", f64363g);
                    jSONObject.put("umCaseId", f64364h);
                }
            } catch (Throwable unused9) {
            }
            if ((bm.aM.equals(str) || "a".equals(str)) && z4) {
                try {
                    int[] b5 = b(context);
                    jSONObject.put(a(bm.bw), String.valueOf(b5[0]) + String.valueOf(b5[1]) + String.valueOf(b5[2]));
                } catch (Throwable unused10) {
                }
            }
            try {
                Map<String, String> moduleTags = TagHelper.getModuleTags();
                if (moduleTags != null && moduleTags.size() > 0) {
                    JSONObject jSONObject3 = new JSONObject();
                    for (Map.Entry<String, String> entry : moduleTags.entrySet()) {
                        jSONObject3.put(entry.getKey(), entry.getValue());
                    }
                    jSONObject.put(a(bm.ap), jSONObject3);
                }
            } catch (Throwable unused11) {
            }
            try {
                String realTimeDebugKey = AnalyticsConfig.getRealTimeDebugKey();
                if (!TextUtils.isEmpty(realTimeDebugKey)) {
                    jSONObject.put(a(bm.bv), realTimeDebugKey);
                }
            } catch (Throwable unused12) {
            }
            try {
                JSONObject moduleVer = UMUtils.getModuleVer();
                if (moduleVer.length() > 0) {
                    jSONObject.put(a(bm.bf), moduleVer);
                }
            } catch (Throwable unused13) {
            }
            try {
                String apmFlag = UMUtils.getApmFlag();
                if (!TextUtils.isEmpty(apmFlag)) {
                    jSONObject.put(a(bm.bu), apmFlag);
                }
            } catch (Throwable unused14) {
            }
            try {
                String str2 = Build.BRAND;
                String a6 = as.a(str2);
                String b6 = as.b(str2);
                jSONObject.put(bm.bd, a6);
                jSONObject.put(bm.be, b6);
            } catch (Throwable unused15) {
            }
            byte[] a7 = ImprintHandler.getImprintService(context).a();
            if (a7 != null && a7.length > 0) {
                try {
                    jSONObject.put(a(bm.X), Base64.encodeToString(a7, 0));
                } catch (JSONException e7) {
                    UMCrashManager.reportCrash(context, e7);
                }
            }
            if (jSONObject.length() > 0) {
                return new JSONObject().put(a("header"), jSONObject);
            }
            return null;
        } catch (Throwable th) {
            UMCrashManager.reportCrash(context, th);
            return null;
        }
    }

    private JSONObject a(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject != null && jSONObject2 != null && jSONObject.opt(a("header")) != null && (jSONObject.opt(a("header")) instanceof JSONObject)) {
            JSONObject jSONObject3 = (JSONObject) jSONObject.opt(a("header"));
            Iterator<String> keys = jSONObject2.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (next != null && (next instanceof String)) {
                    String str = next;
                    if (jSONObject2.opt(str) != null) {
                        try {
                            jSONObject3.put(str, jSONObject2.opt(str));
                            if (str.equals(a(f.f63696i)) && (jSONObject2.opt(str) instanceof Integer)) {
                                this.f64368k = ((Integer) jSONObject2.opt(str)).intValue();
                            }
                        } catch (Exception unused) {
                        }
                    }
                }
            }
        }
        return jSONObject;
    }

    private Envelope a(Context context, byte[] bArr) {
        String imprintProperty = UMEnvelopeBuild.imprintProperty(context, "codex", null);
        int i4 = -1;
        try {
            if (!TextUtils.isEmpty(imprintProperty)) {
                i4 = Integer.valueOf(imprintProperty).intValue();
            }
        } catch (NumberFormatException e5) {
            UMCrashManager.reportCrash(context, e5);
        }
        if (i4 == 0) {
            return Envelope.genEnvelope(context, UMUtils.getAppkey(context), bArr);
        }
        if (i4 == 1) {
            return Envelope.genEncryptEnvelope(context, UMUtils.getAppkey(context), bArr);
        }
        if (f64367l) {
            return Envelope.genEncryptEnvelope(context, UMUtils.getAppkey(context), bArr);
        }
        return Envelope.genEnvelope(context, UMUtils.getAppkey(context), bArr);
    }

    private int a(Context context, Envelope envelope, String str, String str2, String str3) {
        if (context == null || envelope == null || TextUtils.isEmpty(str)) {
            return 101;
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = DeviceConfig.getAppVersionName(context);
        }
        String b5 = com.umeng.commonsdk.stateless.d.b(str3);
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("&&");
        sb.append(str2);
        sb.append("_");
        sb.append(System.currentTimeMillis());
        sb.append("_");
        sb.append(b5);
        sb.append(".log");
        byte[] binary = envelope.toBinary();
        if (com.umeng.commonsdk.utils.c.a()) {
            if (str.startsWith(bm.aK)) {
                return UMFrUtils.saveEnvelopeFile(context, sb.toString(), binary);
            }
            return 122;
        } else if (str.startsWith(bm.aK)) {
            return 122;
        } else {
            if (!str.startsWith(bm.aH) && !str.startsWith("i") && !str.startsWith("a") && !str.startsWith(bm.aM)) {
                return com.umeng.commonsdk.stateless.d.a(context, com.umeng.commonsdk.stateless.a.f64329f, sb.toString(), binary);
            }
            return UMFrUtils.saveEnvelopeFile(context, sb.toString(), binary);
        }
    }

    public static void a(boolean z4) {
        f64367l = z4;
    }
}
