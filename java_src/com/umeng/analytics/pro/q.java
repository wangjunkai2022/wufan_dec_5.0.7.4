package com.umeng.analytics.pro;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.umeng.analytics.AnalyticsConfig;
import com.umeng.analytics.CoreProtocol;
import com.umeng.analytics.process.UMProcessDBHelper;
import com.umeng.commonsdk.UMConfigure;
import com.umeng.commonsdk.config.FieldManager;
import com.umeng.commonsdk.debug.UMLog;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.framework.UMEnvelopeBuild;
import com.umeng.commonsdk.framework.UMFrUtils;
import com.umeng.commonsdk.framework.UMLogDataProtocol;
import com.umeng.commonsdk.framework.UMWorkDispatch;
import com.umeng.commonsdk.service.UMGlobalContext;
import com.umeng.commonsdk.statistics.common.DeviceConfig;
import com.umeng.commonsdk.statistics.common.HelperUtils;
import com.umeng.commonsdk.statistics.common.MLog;
import com.umeng.commonsdk.statistics.common.ReportPolicy;
import com.umeng.commonsdk.statistics.internal.PreferenceWrapper;
import com.umeng.commonsdk.statistics.internal.StatTracer;
import com.umeng.commonsdk.statistics.noise.ABTest;
import com.umeng.commonsdk.statistics.noise.Defcon;
import com.umeng.commonsdk.utils.JSONArraySortUtil;
import com.umeng.commonsdk.utils.UMUtils;
import com.umeng.umcrash.UMCrashUtils;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: CoreProtocolImpl.java */
/* loaded from: classes6.dex */
public class q {

    /* renamed from: a  reason: collision with root package name */
    private static Context f63862a = null;

    /* renamed from: l  reason: collision with root package name */
    private static final String f63863l = "first_activate_time";

    /* renamed from: m  reason: collision with root package name */
    private static final String f63864m = "ana_is_f";

    /* renamed from: n  reason: collision with root package name */
    private static final String f63865n = "thtstart";

    /* renamed from: o  reason: collision with root package name */
    private static final String f63866o = "dstk_last_time";

    /* renamed from: p  reason: collision with root package name */
    private static final String f63867p = "dstk_cnt";

    /* renamed from: q  reason: collision with root package name */
    private static final String f63868q = "gkvc";

    /* renamed from: r  reason: collision with root package name */
    private static final String f63869r = "ekvc";

    /* renamed from: t  reason: collision with root package name */
    private static final String f63870t = "-1";

    /* renamed from: x  reason: collision with root package name */
    private static final String f63871x = "com.umeng.umcrash.UMCrashUtils";

    /* renamed from: y  reason: collision with root package name */
    private static Class<?> f63872y;

    /* renamed from: z  reason: collision with root package name */
    private static Method f63873z;

    /* renamed from: b  reason: collision with root package name */
    private c f63874b;

    /* renamed from: c  reason: collision with root package name */
    private SharedPreferences f63875c;

    /* renamed from: d  reason: collision with root package name */
    private String f63876d;

    /* renamed from: e  reason: collision with root package name */
    private String f63877e;

    /* renamed from: f  reason: collision with root package name */
    private int f63878f;

    /* renamed from: g  reason: collision with root package name */
    private JSONArray f63879g;

    /* renamed from: h  reason: collision with root package name */
    private final int f63880h;

    /* renamed from: i  reason: collision with root package name */
    private int f63881i;

    /* renamed from: j  reason: collision with root package name */
    private int f63882j;

    /* renamed from: k  reason: collision with root package name */
    private long f63883k;

    /* renamed from: s  reason: collision with root package name */
    private final long f63884s;

    /* renamed from: u  reason: collision with root package name */
    private boolean f63885u;

    /* renamed from: v  reason: collision with root package name */
    private boolean f63886v;

    /* renamed from: w  reason: collision with root package name */
    private Object f63887w;

    /* compiled from: CoreProtocolImpl.java */
    /* loaded from: classes6.dex */
    public static class a {
        public static final int A = 8209;
        public static final int B = 8210;
        public static final int C = 8211;
        public static final int D = 8212;
        public static final int E = 8213;
        public static final int F = 8214;
        public static final int G = 8215;

        /* renamed from: a  reason: collision with root package name */
        public static final int f63888a = 4097;

        /* renamed from: b  reason: collision with root package name */
        public static final int f63889b = 4098;

        /* renamed from: c  reason: collision with root package name */
        public static final int f63890c = 4099;

        /* renamed from: d  reason: collision with root package name */
        public static final int f63891d = 4100;

        /* renamed from: e  reason: collision with root package name */
        public static final int f63892e = 4101;

        /* renamed from: f  reason: collision with root package name */
        public static final int f63893f = 4102;

        /* renamed from: g  reason: collision with root package name */
        public static final int f63894g = 4103;

        /* renamed from: h  reason: collision with root package name */
        public static final int f63895h = 4104;

        /* renamed from: i  reason: collision with root package name */
        public static final int f63896i = 4105;

        /* renamed from: j  reason: collision with root package name */
        public static final int f63897j = 4106;

        /* renamed from: k  reason: collision with root package name */
        public static final int f63898k = 4352;

        /* renamed from: l  reason: collision with root package name */
        public static final int f63899l = 4353;

        /* renamed from: m  reason: collision with root package name */
        public static final int f63900m = 4354;

        /* renamed from: n  reason: collision with root package name */
        public static final int f63901n = 4355;

        /* renamed from: o  reason: collision with root package name */
        public static final int f63902o = 4356;

        /* renamed from: p  reason: collision with root package name */
        public static final int f63903p = 4357;

        /* renamed from: q  reason: collision with root package name */
        public static final int f63904q = 4358;

        /* renamed from: r  reason: collision with root package name */
        public static final int f63905r = 8193;

        /* renamed from: s  reason: collision with root package name */
        public static final int f63906s = 8194;

        /* renamed from: t  reason: collision with root package name */
        public static final int f63907t = 8195;

        /* renamed from: u  reason: collision with root package name */
        public static final int f63908u = 8196;

        /* renamed from: v  reason: collision with root package name */
        public static final int f63909v = 8197;

        /* renamed from: w  reason: collision with root package name */
        public static final int f63910w = 8199;

        /* renamed from: x  reason: collision with root package name */
        public static final int f63911x = 8200;

        /* renamed from: y  reason: collision with root package name */
        public static final int f63912y = 8201;

        /* renamed from: z  reason: collision with root package name */
        public static final int f63913z = 8208;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: CoreProtocolImpl.java */
    /* loaded from: classes6.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private static final q f63914a = new q();

        private b() {
        }
    }

    static {
        h();
    }

    public static q a(Context context) {
        if (f63862a == null && context != null) {
            f63862a = context.getApplicationContext();
        }
        return b.f63914a;
    }

    private void b(JSONObject jSONObject) {
        JSONObject f5;
        if (k.a(UMGlobalContext.getAppContext(f63862a)).c() || (f5 = k.a(UMGlobalContext.getAppContext(f63862a)).f()) == null) {
            return;
        }
        String optString = f5.optString("__av");
        String optString2 = f5.optString("__vc");
        try {
            if (TextUtils.isEmpty(optString)) {
                jSONObject.put(com.umeng.commonsdk.statistics.b.a("app_version"), UMUtils.getAppVersionName(f63862a));
            } else {
                jSONObject.put(com.umeng.commonsdk.statistics.b.a("app_version"), optString);
            }
            if (TextUtils.isEmpty(optString2)) {
                jSONObject.put(com.umeng.commonsdk.statistics.b.a("version_code"), UMUtils.getAppVersionCode(f63862a));
            } else {
                jSONObject.put(com.umeng.commonsdk.statistics.b.a("version_code"), optString2);
            }
        } catch (Throwable unused) {
        }
    }

    private void e(Object obj) {
        try {
            JSONObject jSONObject = (JSONObject) obj;
            if (2050 == jSONObject.getInt("__t")) {
                if (!a(this.f63883k, this.f63881i)) {
                    return;
                }
                this.f63881i++;
            } else if (2049 == jSONObject.getInt("__t")) {
                if (!a(this.f63883k, this.f63882j)) {
                    return;
                }
                this.f63882j++;
            }
            if (AnalyticsConfig.isRealTimeDebugMode()) {
                if (this.f63879g == null) {
                    this.f63879g = new JSONArray();
                }
                this.f63879g.put(jSONObject);
                k.a(f63862a).a(this.f63879g);
                this.f63879g = new JSONArray();
                return;
            }
            if (this.f63879g.length() >= this.f63878f) {
                UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>>*** 超过10个事件，事件落库。");
                k.a(f63862a).a(this.f63879g);
                this.f63879g = new JSONArray();
            }
            if (this.f63883k == 0) {
                this.f63883k = System.currentTimeMillis();
            }
            this.f63879g.put(jSONObject);
        } catch (Throwable th) {
            MLog.e(th);
        }
    }

    private void f(JSONObject jSONObject) {
        JSONObject optJSONObject;
        JSONObject optJSONObject2;
        try {
            if (jSONObject.getJSONObject(com.umeng.commonsdk.statistics.b.a("header")).has(f.aH)) {
                if (jSONObject.has("content")) {
                    jSONObject = jSONObject.getJSONObject("content");
                }
                if (jSONObject.has(com.umeng.commonsdk.statistics.b.a("analytics"))) {
                    JSONObject jSONObject2 = jSONObject.getJSONObject(com.umeng.commonsdk.statistics.b.a("analytics"));
                    if (jSONObject2.has(f.f63701n) && (optJSONObject2 = jSONObject2.getJSONArray(f.f63701n).optJSONObject(0)) != null) {
                        String optString = optJSONObject2.optString("id");
                        if (!TextUtils.isEmpty(optString)) {
                            UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> removeAllInstantData: really delete instant session data");
                            k.a(f63862a).b(optString);
                        }
                    }
                }
                k.a(f63862a).b();
                UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> removeAllInstantData: send INSTANT_SESSION_START_CONTINUE event because OVERSIZE.");
                Context context = f63862a;
                UMWorkDispatch.sendEvent(context, 4353, CoreProtocol.getInstance(context), null);
                return;
            }
            if (jSONObject.has("content")) {
                jSONObject = jSONObject.getJSONObject("content");
            }
            if (jSONObject.has(com.umeng.commonsdk.statistics.b.a("analytics")) && (optJSONObject = jSONObject.optJSONObject(com.umeng.commonsdk.statistics.b.a("analytics"))) != null && optJSONObject.length() > 0 && optJSONObject.has(f.f63701n)) {
                k.a(f63862a).a(true, false);
            }
            k.a(f63862a).b();
        } catch (Exception unused) {
        }
    }

    private static void h() {
        try {
            f63872y = UMCrashUtils.class;
            Method declaredMethod = UMCrashUtils.class.getDeclaredMethod("setPuidAndProvider", String.class, String.class);
            if (declaredMethod != null) {
                f63873z = declaredMethod;
            }
        } catch (Throwable unused) {
        }
    }

    private void i() {
        JSONObject b5 = b(UMEnvelopeBuild.maxDataSpace(f63862a));
        if (b5 == null || b5.length() < 1) {
            return;
        }
        JSONObject jSONObject = (JSONObject) b5.opt("header");
        JSONObject jSONObject2 = (JSONObject) b5.opt("content");
        if (f63862a == null || jSONObject == null || jSONObject2 == null) {
            return;
        }
        UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> constructInstantMessage: request build envelope.");
        JSONObject buildEnvelopeWithExtHeader = UMEnvelopeBuild.buildEnvelopeWithExtHeader(f63862a, jSONObject, jSONObject2);
        if (buildEnvelopeWithExtHeader != null) {
            try {
                if (buildEnvelopeWithExtHeader.has("exception")) {
                    UMRTLog.i(UMRTLog.RTLOG_TAG, "Build envelope error code: " + buildEnvelopeWithExtHeader.getInt("exception"));
                }
            } catch (Throwable unused) {
            }
            if (UMConfigure.isDebugLog()) {
                e(buildEnvelopeWithExtHeader);
            }
            b((Object) buildEnvelopeWithExtHeader);
        }
    }

    private void j() {
        JSONObject buildEnvelopeWithExtHeader;
        JSONObject a5 = a(UMEnvelopeBuild.maxDataSpace(f63862a));
        if (a5 == null || a5.length() < 1) {
            return;
        }
        JSONObject jSONObject = (JSONObject) a5.opt("header");
        JSONObject jSONObject2 = (JSONObject) a5.opt("content");
        Context context = f63862a;
        if (context == null || jSONObject == null || jSONObject2 == null || (buildEnvelopeWithExtHeader = UMEnvelopeBuild.buildEnvelopeWithExtHeader(context, jSONObject, jSONObject2)) == null) {
            return;
        }
        try {
            if (buildEnvelopeWithExtHeader.has("exception")) {
                UMRTLog.i(UMRTLog.RTLOG_TAG, "Build envelope error code: " + buildEnvelopeWithExtHeader.getInt("exception"));
            }
        } catch (Throwable unused) {
        }
        if (UMConfigure.isDebugLog()) {
            d(buildEnvelopeWithExtHeader);
        }
        a((Object) buildEnvelopeWithExtHeader);
    }

    private JSONObject k() {
        JSONObject l4 = l();
        if (l4 != null) {
            try {
                l4.put("st", "1");
            } catch (Throwable unused) {
            }
        }
        return l4;
    }

    private JSONObject l() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (AnalyticsConfig.mWrapperType != null && AnalyticsConfig.mWrapperVersion != null) {
                jSONObject.put(com.umeng.commonsdk.statistics.b.a("wrapper_version"), AnalyticsConfig.mWrapperVersion);
                jSONObject.put(com.umeng.commonsdk.statistics.b.a("wrapper_type"), AnalyticsConfig.mWrapperType);
            }
            int verticalType = AnalyticsConfig.getVerticalType(f63862a);
            jSONObject.put(com.umeng.commonsdk.statistics.b.a(f.f63696i), verticalType);
            String str = "9.6.7";
            if (verticalType == 1) {
                String gameSdkVersion = AnalyticsConfig.getGameSdkVersion(f63862a);
                if (!TextUtils.isEmpty(gameSdkVersion)) {
                    str = gameSdkVersion;
                }
                jSONObject.put(com.umeng.commonsdk.statistics.b.a("sdk_version"), str);
            } else {
                jSONObject.put(com.umeng.commonsdk.statistics.b.a("sdk_version"), "9.6.7");
            }
            String MD5 = HelperUtils.MD5(AnalyticsConfig.getSecretKey(f63862a));
            if (!TextUtils.isEmpty(MD5)) {
                jSONObject.put(com.umeng.commonsdk.statistics.b.a("secret"), MD5);
            }
            String imprintProperty = UMEnvelopeBuild.imprintProperty(f63862a, "pr_ve", null);
            SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(f63862a);
            String imprintProperty2 = UMEnvelopeBuild.imprintProperty(f63862a, f.at, "");
            if (!TextUtils.isEmpty(imprintProperty2)) {
                if (AnalyticsConfig.CLEAR_EKV_BL) {
                    jSONObject.put(com.umeng.commonsdk.statistics.b.a(f.av), "");
                } else {
                    jSONObject.put(com.umeng.commonsdk.statistics.b.a(f.av), imprintProperty2);
                }
            }
            String imprintProperty3 = UMEnvelopeBuild.imprintProperty(f63862a, f.au, "");
            if (!TextUtils.isEmpty(imprintProperty3)) {
                if (AnalyticsConfig.CLEAR_EKV_WL) {
                    jSONObject.put(com.umeng.commonsdk.statistics.b.a(f.aw), "");
                } else {
                    jSONObject.put(com.umeng.commonsdk.statistics.b.a(f.aw), imprintProperty3);
                }
            }
            jSONObject.put(com.umeng.commonsdk.statistics.b.a(f.an), "1.0.0");
            if (s()) {
                jSONObject.put(com.umeng.commonsdk.statistics.b.a(f.ap), "1");
                if (sharedPreferences != null) {
                    sharedPreferences.edit().putLong(f63864m, 0L).commit();
                }
            }
            jSONObject.put(com.umeng.commonsdk.statistics.b.a(f.f63699l), m());
            jSONObject.put(com.umeng.commonsdk.statistics.b.a(f.f63700m), n());
            if (sharedPreferences != null) {
                String string = sharedPreferences.getString("vers_name", "");
                if (!TextUtils.isEmpty(string)) {
                    String format = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(new Date(System.currentTimeMillis()));
                    if (TextUtils.isEmpty(imprintProperty)) {
                        jSONObject.put(com.umeng.commonsdk.statistics.b.a(f.f63699l), sharedPreferences.getString("vers_pre_version", "0"));
                        jSONObject.put(com.umeng.commonsdk.statistics.b.a(f.f63700m), sharedPreferences.getString("vers_date", format));
                    }
                    sharedPreferences.edit().putString("pre_version", string).putString("cur_version", DeviceConfig.getAppVersionName(f63862a)).putString("pre_date", format).remove("vers_name").remove("vers_code").remove("vers_date").remove("vers_pre_version").commit();
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return jSONObject;
    }

    private String m() {
        String str = null;
        try {
            str = UMEnvelopeBuild.imprintProperty(f63862a, "pr_ve", null);
            if (TextUtils.isEmpty(str)) {
                if (!TextUtils.isEmpty(this.f63876d)) {
                    return this.f63876d;
                }
                if (this.f63875c == null) {
                    this.f63875c = PreferenceWrapper.getDefault(f63862a);
                }
                String string = this.f63875c.getString("pre_version", "");
                String appVersionName = DeviceConfig.getAppVersionName(f63862a);
                if (TextUtils.isEmpty(string)) {
                    this.f63875c.edit().putString("pre_version", "0").putString("cur_version", appVersionName).commit();
                    str = "0";
                } else {
                    String string2 = this.f63875c.getString("cur_version", "");
                    if (appVersionName.equals(string2)) {
                        str = string;
                    } else {
                        this.f63875c.edit().putString("pre_version", string2).putString("cur_version", appVersionName).commit();
                        str = string2;
                    }
                }
            }
        } catch (Throwable unused) {
        }
        this.f63876d = str;
        return str;
    }

    private String n() {
        String str = null;
        try {
            str = UMEnvelopeBuild.imprintProperty(f63862a, "ud_da", null);
            if (TextUtils.isEmpty(str)) {
                if (!TextUtils.isEmpty(this.f63877e)) {
                    return this.f63877e;
                }
                if (this.f63875c == null) {
                    this.f63875c = PreferenceWrapper.getDefault(f63862a);
                }
                String string = this.f63875c.getString("pre_date", "");
                if (TextUtils.isEmpty(string)) {
                    string = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(new Date(System.currentTimeMillis()));
                    this.f63875c.edit().putString("pre_date", string).commit();
                } else {
                    String format = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(new Date(System.currentTimeMillis()));
                    if (!string.equals(format)) {
                        this.f63875c.edit().putString("pre_date", format).commit();
                        str = format;
                    }
                }
                str = string;
            }
        } catch (Throwable unused) {
        }
        this.f63877e = str;
        return str;
    }

    private void o() {
        try {
            this.f63881i = 0;
            this.f63882j = 0;
            this.f63883k = System.currentTimeMillis();
            PreferenceWrapper.getDefault(f63862a).edit().putLong(f63866o, System.currentTimeMillis()).putInt(f63867p, 0).commit();
        } catch (Throwable unused) {
        }
    }

    private boolean p() {
        try {
            if (!TextUtils.isEmpty(w.a().b())) {
                b(f63862a);
            }
            if (this.f63879g.length() > 0) {
                for (int i4 = 0; i4 < this.f63879g.length(); i4++) {
                    JSONObject optJSONObject = this.f63879g.optJSONObject(i4);
                    if (optJSONObject != null && optJSONObject.length() > 0) {
                        String optString = optJSONObject.optString("__i");
                        if (TextUtils.isEmpty(optString) || f63870t.equals(optString)) {
                            return false;
                        }
                    }
                }
                return true;
            }
            return false;
        } catch (Throwable unused) {
            return true;
        }
    }

    private void q() {
        if (this.f63879g.length() > 0) {
            JSONArray jSONArray = new JSONArray();
            for (int i4 = 0; i4 < this.f63879g.length(); i4++) {
                try {
                    JSONObject jSONObject = this.f63879g.getJSONObject(i4);
                    if (jSONObject != null && jSONObject.length() > 0) {
                        String optString = jSONObject.optString("__i");
                        boolean isEmpty = TextUtils.isEmpty(optString);
                        String str = f63870t;
                        if (isEmpty || f63870t.equals(optString)) {
                            String b5 = w.a().b();
                            if (!TextUtils.isEmpty(b5)) {
                                str = b5;
                            }
                            jSONObject.put("__i", str);
                        }
                        jSONArray.put(jSONObject);
                    } else {
                        jSONArray.put(jSONObject);
                    }
                } catch (Throwable unused) {
                }
            }
            this.f63879g = jSONArray;
        }
    }

    private void r() {
        Context context;
        SharedPreferences sharedPreferences;
        try {
            if (!s() || (context = f63862a) == null || (sharedPreferences = PreferenceWrapper.getDefault(context)) == null || sharedPreferences.getLong(f63863l, 0L) != 0) {
                return;
            }
            sharedPreferences.edit().putLong(f63863l, System.currentTimeMillis()).commit();
        } catch (Throwable unused) {
        }
    }

    private boolean s() {
        SharedPreferences sharedPreferences;
        try {
            Context context = f63862a;
            if (context == null || (sharedPreferences = PreferenceWrapper.getDefault(context)) == null) {
                return false;
            }
            return sharedPreferences.getLong(f63864m, -1L) != 0;
        } catch (Throwable unused) {
            return false;
        }
    }

    public void b() {
    }

    public void c() {
        b(f63862a);
        d();
        a(true);
    }

    public void d() {
        try {
            if (this.f63879g.length() > 0) {
                UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>>*** flushMemoryData: 事件落库。");
                k.a(f63862a).a(this.f63879g);
                this.f63879g = new JSONArray();
            }
            PreferenceWrapper.getDefault(f63862a).edit().putLong(f63865n, this.f63883k).putInt(f63868q, this.f63881i).putInt(f63869r, this.f63882j).commit();
        } catch (Throwable unused) {
        }
    }

    private q() {
        this.f63874b = null;
        this.f63875c = null;
        this.f63876d = null;
        this.f63877e = null;
        this.f63878f = 10;
        this.f63879g = new JSONArray();
        this.f63880h = 5000;
        this.f63881i = 0;
        this.f63882j = 0;
        this.f63883k = 0L;
        this.f63884s = 28800000L;
        this.f63885u = false;
        this.f63886v = false;
        this.f63887w = new Object();
        try {
            SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(f63862a);
            this.f63883k = sharedPreferences.getLong(f63865n, 0L);
            this.f63881i = sharedPreferences.getInt(f63868q, 0);
            this.f63882j = sharedPreferences.getInt(f63869r, 0);
            this.f63874b = new c();
        } catch (Throwable unused) {
        }
    }

    private void g(JSONObject jSONObject) {
        JSONObject optJSONObject;
        try {
            if (jSONObject.getJSONObject(com.umeng.commonsdk.statistics.b.a("header")).has(f.aH)) {
                if (jSONObject.has("content")) {
                    jSONObject = jSONObject.getJSONObject("content");
                }
                if (jSONObject.has(com.umeng.commonsdk.statistics.b.a("analytics"))) {
                    if (jSONObject.getJSONObject(com.umeng.commonsdk.statistics.b.a("analytics")).has(f.f63701n)) {
                        k.a(f63862a).i();
                        k.a(f63862a).h();
                        k.a(f63862a).b(true, false);
                        k.a(f63862a).a();
                        return;
                    }
                    UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> Error, Should not go to this branch.");
                    return;
                }
                return;
            }
            if (jSONObject.has("content")) {
                jSONObject = jSONObject.getJSONObject("content");
            }
            if (jSONObject.has(com.umeng.commonsdk.statistics.b.a("analytics")) && (optJSONObject = jSONObject.optJSONObject(com.umeng.commonsdk.statistics.b.a("analytics"))) != null && optJSONObject.length() > 0) {
                if (optJSONObject.has(f.f63701n)) {
                    k.a(f63862a).b(true, false);
                }
                if (optJSONObject.has("ekv") || optJSONObject.has(f.Z)) {
                    k.a(f63862a).h();
                }
                if (optJSONObject.has("error")) {
                    k.a(f63862a).i();
                }
            }
            k.a(f63862a).a();
        } catch (Exception unused) {
        }
    }

    /* compiled from: CoreProtocolImpl.java */
    /* loaded from: classes6.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        private ReportPolicy.ReportStrategy f63915a = null;

        /* renamed from: b  reason: collision with root package name */
        private int f63916b = -1;

        /* renamed from: c  reason: collision with root package name */
        private int f63917c = -1;

        /* renamed from: d  reason: collision with root package name */
        private int f63918d = -1;

        /* renamed from: e  reason: collision with root package name */
        private int f63919e = -1;

        /* renamed from: f  reason: collision with root package name */
        private ABTest f63920f;

        public c() {
            this.f63920f = null;
            this.f63920f = ABTest.getService(q.f63862a);
        }

        public void a() {
            try {
                int[] a5 = a(-1, -1);
                this.f63916b = a5[0];
                this.f63917c = a5[1];
            } catch (Throwable unused) {
            }
        }

        protected void b() {
            int i4;
            ReportPolicy.ReportStrategy defconPolicy;
            Defcon service = Defcon.getService(q.f63862a);
            if (!service.isOpen()) {
                boolean z4 = Integer.valueOf(UMEnvelopeBuild.imprintProperty(q.f63862a, "integrated_test", q.f63870t)).intValue() == 1;
                if (UMConfigure.isDebugLog() && z4 && !MLog.DEBUG) {
                    UMLog.mutlInfo(l.K, 3, "\\|", null, null);
                }
                if (MLog.DEBUG && z4) {
                    this.f63915a = new ReportPolicy.DebugPolicy(StatTracer.getInstance(q.f63862a));
                } else if (this.f63920f.isInTest() && "RPT".equals(this.f63920f.getTestName())) {
                    if (this.f63920f.getTestPolicy() == 6) {
                        if (Integer.valueOf(UMEnvelopeBuild.imprintProperty(q.f63862a, "test_report_interval", q.f63870t)).intValue() != -1) {
                            i4 = a(90000);
                        } else {
                            i4 = this.f63917c;
                            if (i4 <= 0) {
                                i4 = this.f63919e;
                            }
                        }
                    } else {
                        i4 = 0;
                    }
                    this.f63915a = b(this.f63920f.getTestPolicy(), i4);
                } else {
                    int i5 = this.f63918d;
                    int i6 = this.f63919e;
                    int i7 = this.f63916b;
                    if (i7 != -1) {
                        i6 = this.f63917c;
                        i5 = i7;
                    }
                    this.f63915a = b(i5, i6);
                }
            } else {
                ReportPolicy.ReportStrategy reportStrategy = this.f63915a;
                if (!((reportStrategy instanceof ReportPolicy.DefconPolicy) && reportStrategy.isValid())) {
                    defconPolicy = new ReportPolicy.DefconPolicy(StatTracer.getInstance(q.f63862a), service);
                } else {
                    defconPolicy = this.f63915a;
                }
                this.f63915a = defconPolicy;
            }
            if (UMConfigure.isDebugLog()) {
                try {
                    ReportPolicy.ReportStrategy reportStrategy2 = this.f63915a;
                    if (reportStrategy2 instanceof ReportPolicy.ReportAtLaunch) {
                        UMLog.mutlInfo(l.I, 3, "", null, null);
                    } else if (reportStrategy2 instanceof ReportPolicy.ReportByInterval) {
                        UMLog.mutlInfo(l.J, 3, "", new String[]{"@"}, new String[]{String.valueOf(((ReportPolicy.ReportByInterval) reportStrategy2).getReportInterval() / 1000)});
                    } else if (reportStrategy2 instanceof ReportPolicy.DebugPolicy) {
                        UMLog.mutlInfo(l.L, 3, "", null, null);
                    } else if (reportStrategy2 instanceof ReportPolicy.ReportQuasiRealtime) {
                        String[] strArr = {String.valueOf(((ReportPolicy.ReportQuasiRealtime) reportStrategy2).getReportInterval() / 1000)};
                        UMLog uMLog = UMConfigure.umDebugLog;
                        UMLog.mutlInfo(l.M, 3, "", new String[]{"@"}, strArr);
                    } else {
                        boolean z5 = reportStrategy2 instanceof ReportPolicy.DefconPolicy;
                    }
                } catch (Throwable unused) {
                }
            }
        }

        public ReportPolicy.ReportStrategy c() {
            b();
            return this.f63915a;
        }

        public int[] a(int i4, int i5) {
            int intValue = Integer.valueOf(UMEnvelopeBuild.imprintProperty(q.f63862a, "report_policy", q.f63870t)).intValue();
            int intValue2 = Integer.valueOf(UMEnvelopeBuild.imprintProperty(q.f63862a, "report_interval", q.f63870t)).intValue();
            if (intValue == -1 || !ReportPolicy.isValid(intValue)) {
                return new int[]{i4, i5};
            }
            if (6 == intValue) {
                return new int[]{intValue, ((intValue2 == -1 || intValue2 < 90 || intValue2 > 86400) ? 90 : 90) * 1000};
            } else if (11 == intValue) {
                return new int[]{intValue, ((intValue2 == -1 || intValue2 < 15 || intValue2 > 3600) ? 15 : 15) * 1000};
            } else {
                return new int[]{i4, i5};
            }
        }

        public int a(int i4) {
            int intValue = Integer.valueOf(UMEnvelopeBuild.imprintProperty(q.f63862a, "test_report_interval", q.f63870t)).intValue();
            return (intValue == -1 || intValue < 90 || intValue > 86400) ? i4 : intValue * 1000;
        }

        private ReportPolicy.ReportStrategy b(int i4, int i5) {
            if (i4 == 0) {
                ReportPolicy.ReportStrategy reportStrategy = this.f63915a;
                return reportStrategy instanceof ReportPolicy.ReportRealtime ? reportStrategy : new ReportPolicy.ReportRealtime();
            } else if (i4 == 1) {
                ReportPolicy.ReportStrategy reportStrategy2 = this.f63915a;
                return reportStrategy2 instanceof ReportPolicy.ReportAtLaunch ? reportStrategy2 : new ReportPolicy.ReportAtLaunch();
            } else if (i4 == 4) {
                ReportPolicy.ReportStrategy reportStrategy3 = this.f63915a;
                return reportStrategy3 instanceof ReportPolicy.ReportDaily ? reportStrategy3 : new ReportPolicy.ReportDaily(StatTracer.getInstance(q.f63862a));
            } else if (i4 == 5) {
                ReportPolicy.ReportStrategy reportStrategy4 = this.f63915a;
                return reportStrategy4 instanceof ReportPolicy.ReportWifiOnly ? reportStrategy4 : new ReportPolicy.ReportWifiOnly(q.f63862a);
            } else if (i4 == 6) {
                ReportPolicy.ReportStrategy reportStrategy5 = this.f63915a;
                if (reportStrategy5 instanceof ReportPolicy.ReportByInterval) {
                    ((ReportPolicy.ReportByInterval) reportStrategy5).setReportInterval(i5);
                    return reportStrategy5;
                }
                return new ReportPolicy.ReportByInterval(StatTracer.getInstance(q.f63862a), i5);
            } else if (i4 == 8) {
                ReportPolicy.ReportStrategy reportStrategy6 = this.f63915a;
                return reportStrategy6 instanceof ReportPolicy.SmartPolicy ? reportStrategy6 : new ReportPolicy.SmartPolicy(StatTracer.getInstance(q.f63862a));
            } else if (i4 != 11) {
                ReportPolicy.ReportStrategy reportStrategy7 = this.f63915a;
                return reportStrategy7 instanceof ReportPolicy.ReportAtLaunch ? reportStrategy7 : new ReportPolicy.ReportAtLaunch();
            } else {
                ReportPolicy.ReportStrategy reportStrategy8 = this.f63915a;
                if (reportStrategy8 instanceof ReportPolicy.ReportQuasiRealtime) {
                    ((ReportPolicy.ReportQuasiRealtime) reportStrategy8).setReportInterval(i5);
                    return reportStrategy8;
                }
                ReportPolicy.ReportQuasiRealtime reportQuasiRealtime = new ReportPolicy.ReportQuasiRealtime();
                reportQuasiRealtime.setReportInterval(i5);
                return reportQuasiRealtime;
            }
        }
    }

    private void c(JSONObject jSONObject) {
        try {
            if (!k.a(f63862a).e()) {
                JSONObject g4 = k.a(f63862a).g();
                if (g4 != null) {
                    String optString = g4.optString("__av");
                    String optString2 = g4.optString("__vc");
                    if (TextUtils.isEmpty(optString)) {
                        jSONObject.put(com.umeng.commonsdk.statistics.b.a("app_version"), UMUtils.getAppVersionName(f63862a));
                    } else {
                        jSONObject.put(com.umeng.commonsdk.statistics.b.a("app_version"), optString);
                    }
                    if (TextUtils.isEmpty(optString2)) {
                        jSONObject.put(com.umeng.commonsdk.statistics.b.a("version_code"), UMUtils.getAppVersionCode(f63862a));
                        return;
                    } else {
                        jSONObject.put(com.umeng.commonsdk.statistics.b.a("version_code"), optString2);
                        return;
                    }
                }
                return;
            }
            jSONObject.put(com.umeng.commonsdk.statistics.b.a("app_version"), UMUtils.getAppVersionName(f63862a));
            jSONObject.put(com.umeng.commonsdk.statistics.b.a("version_code"), UMUtils.getAppVersionCode(f63862a));
        } catch (Throwable unused) {
        }
    }

    public void a() {
        if (f63862a != null) {
            synchronized (this.f63887w) {
                if (this.f63885u) {
                    UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> network is now available, rebuild instant session data packet.");
                    Context context = f63862a;
                    UMWorkDispatch.sendEvent(context, 4353, CoreProtocol.getInstance(context), null);
                }
            }
            synchronized (this.f63887w) {
                if (this.f63886v) {
                    Context context2 = f63862a;
                    UMWorkDispatch.sendEvent(context2, 4354, CoreProtocol.getInstance(context2), null);
                }
            }
        }
    }

    /* compiled from: CoreProtocolImpl.java */
    /* loaded from: classes6.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        private Map<String, Object> f63921a;

        /* renamed from: b  reason: collision with root package name */
        private String f63922b;

        /* renamed from: c  reason: collision with root package name */
        private String f63923c;

        /* renamed from: d  reason: collision with root package name */
        private long f63924d;

        private d() {
            this.f63921a = null;
            this.f63922b = null;
            this.f63923c = null;
            this.f63924d = 0L;
        }

        public Map<String, Object> a() {
            return this.f63921a;
        }

        public String b() {
            return this.f63923c;
        }

        public String c() {
            return this.f63922b;
        }

        public long d() {
            return this.f63924d;
        }

        public d(String str, Map<String, Object> map, String str2, long j4) {
            this.f63921a = null;
            this.f63922b = null;
            this.f63923c = null;
            this.f63924d = 0L;
            this.f63921a = map;
            this.f63922b = str;
            this.f63924d = j4;
            this.f63923c = str2;
        }
    }

    private void h(Object obj) {
        try {
            JSONObject jSONObject = (JSONObject) obj;
            if (jSONObject == null || jSONObject.length() <= 0 || !jSONObject.has("__ii")) {
                return;
            }
            String optString = jSONObject.optString("__ii");
            jSONObject.remove("__ii");
            if (TextUtils.isEmpty(optString)) {
                return;
            }
            k.a(f63862a).a(optString, obj.toString(), 2);
        } catch (Throwable unused) {
        }
    }

    private void d(JSONObject jSONObject) {
        JSONObject jSONObject2;
        if (jSONObject == null) {
            return;
        }
        try {
            if (jSONObject.length() <= 0) {
                return;
            }
            JSONObject jSONObject3 = new JSONObject();
            if (jSONObject.has(com.umeng.commonsdk.statistics.b.a("analytics"))) {
                JSONObject jSONObject4 = jSONObject.getJSONObject(com.umeng.commonsdk.statistics.b.a("analytics"));
                if (jSONObject4.has("ekv")) {
                    jSONObject3.put("ekv", jSONObject4.getJSONArray("ekv"));
                    if (jSONObject3.length() > 0) {
                        if (AnalyticsConfig.isRealTimeDebugMode()) {
                            MLog.d("[埋点验证模式]事件:" + jSONObject3.toString());
                        } else {
                            MLog.d("事件:" + jSONObject3.toString());
                        }
                        jSONObject3 = new JSONObject();
                    }
                }
                if (jSONObject4.has(f.Z)) {
                    jSONObject3.put(f.Z, jSONObject4.getJSONArray(f.Z));
                    if (jSONObject3.length() > 0) {
                        if (AnalyticsConfig.isRealTimeDebugMode()) {
                            MLog.d("[埋点验证模式]游戏事件:" + jSONObject3.toString());
                        } else {
                            MLog.d("游戏事件:" + jSONObject3.toString());
                        }
                        jSONObject3 = new JSONObject();
                    }
                }
                if (jSONObject4.has("error")) {
                    jSONObject3.put("error", jSONObject4.getJSONArray("error"));
                    if (jSONObject3.length() > 0) {
                        if (AnalyticsConfig.isRealTimeDebugMode()) {
                            MLog.d("[埋点验证模式]错误:" + jSONObject3.toString());
                        } else {
                            MLog.d("错误:" + jSONObject3.toString());
                        }
                        jSONObject3 = new JSONObject();
                    }
                }
                if (jSONObject4.has(f.f63701n)) {
                    JSONArray jSONArray = jSONObject4.getJSONArray(f.f63701n);
                    JSONArray jSONArray2 = new JSONArray();
                    for (int i4 = 0; i4 < jSONArray.length(); i4++) {
                        JSONObject jSONObject5 = jSONArray.getJSONObject(i4);
                        if (jSONObject5 != null && jSONObject5.length() > 0) {
                            if (jSONObject5.has(f.f63708u)) {
                                jSONObject5.remove(f.f63708u);
                            }
                            jSONArray2.put(jSONObject5);
                        }
                    }
                    jSONObject3.put(f.f63701n, jSONArray2);
                    if (jSONObject3.length() > 0) {
                        if (AnalyticsConfig.isRealTimeDebugMode()) {
                            MLog.d("[埋点验证模式]会话:" + jSONObject3.toString());
                        } else {
                            MLog.d("会话:" + jSONObject3.toString());
                        }
                        jSONObject3 = new JSONObject();
                    }
                }
                if (jSONObject4.has(f.I)) {
                    jSONObject3.put(f.I, jSONObject4.getJSONObject(f.I));
                }
                if (jSONObject4.has(f.L)) {
                    jSONObject3.put(f.L, jSONObject4.getJSONObject(f.L));
                    if (jSONObject3.length() > 0) {
                        if (AnalyticsConfig.isRealTimeDebugMode()) {
                            MLog.d("[埋点验证模式]账号:" + jSONObject3.toString());
                        } else {
                            MLog.d("账号:" + jSONObject3.toString());
                        }
                        jSONObject3 = new JSONObject();
                    }
                }
            }
            if (jSONObject.has("dplus")) {
                jSONObject3.put("dplus", jSONObject.getJSONObject("dplus"));
            }
            if (jSONObject.has(com.umeng.commonsdk.statistics.b.a("header")) && (jSONObject2 = jSONObject.getJSONObject(com.umeng.commonsdk.statistics.b.a("header"))) != null && jSONObject2.length() > 0) {
                if (jSONObject2.has(com.umeng.commonsdk.statistics.b.a("sdk_version"))) {
                    jSONObject3.put("sdk_version", jSONObject2.getString(com.umeng.commonsdk.statistics.b.a("sdk_version")));
                }
                if (jSONObject2.has(com.umeng.commonsdk.statistics.b.a("device_id"))) {
                    jSONObject3.put("device_id", jSONObject2.getString(com.umeng.commonsdk.statistics.b.a("device_id")));
                }
                if (jSONObject2.has(com.umeng.commonsdk.statistics.b.a("device_model"))) {
                    jSONObject3.put("device_model", jSONObject2.getString(com.umeng.commonsdk.statistics.b.a("device_model")));
                }
                if (jSONObject2.has(com.umeng.commonsdk.statistics.b.a("version_code"))) {
                    jSONObject3.put("version", jSONObject2.getInt(com.umeng.commonsdk.statistics.b.a("version_code")));
                }
                if (jSONObject2.has(com.umeng.commonsdk.statistics.b.a("appkey"))) {
                    jSONObject3.put("appkey", jSONObject2.getString(com.umeng.commonsdk.statistics.b.a("appkey")));
                }
                if (jSONObject2.has(com.umeng.commonsdk.statistics.b.a("channel"))) {
                    jSONObject3.put("channel", jSONObject2.getString(com.umeng.commonsdk.statistics.b.a("channel")));
                }
                if (jSONObject3.length() > 0) {
                    MLog.d("基础信息:" + jSONObject3.toString());
                    jSONObject3 = new JSONObject();
                }
            }
            jSONObject3.length();
        } catch (Throwable th) {
            MLog.e(th);
        }
    }

    public JSONObject b(long j4) {
        if (TextUtils.isEmpty(aa.a().d(UMGlobalContext.getAppContext(f63862a)))) {
            return null;
        }
        JSONObject b5 = k.a(UMGlobalContext.getAppContext(f63862a)).b(false);
        String[] a5 = com.umeng.analytics.c.a(f63862a);
        if (a5 != null && !TextUtils.isEmpty(a5[0]) && !TextUtils.isEmpty(a5[1])) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(f.M, a5[0]);
                jSONObject.put(f.N, a5[1]);
                if (jSONObject.length() > 0) {
                    b5.put(f.L, jSONObject);
                }
            } catch (Throwable unused) {
            }
        }
        int a6 = t.a().a(f63862a);
        if (b5.length() != 1 || b5.optJSONObject(f.L) == null || a6 == 3) {
            t.a().b(b5, f63862a);
            if (b5.length() > 0 || a6 == 3) {
                JSONObject k4 = k();
                if (k4 != null) {
                    b(k4);
                }
                JSONObject jSONObject2 = new JSONObject();
                JSONObject jSONObject3 = new JSONObject();
                try {
                    if (a6 == 3) {
                        jSONObject3.put("analytics", new JSONObject());
                    } else if (b5.length() > 0) {
                        jSONObject3.put("analytics", b5);
                    }
                    if (k4 != null && k4.length() > 0) {
                        jSONObject2.put("header", k4);
                    }
                    if (jSONObject3.length() > 0) {
                        jSONObject2.put("content", jSONObject3);
                    }
                    return b(jSONObject2, j4);
                } catch (Throwable unused2) {
                    return jSONObject2;
                }
            }
            return null;
        }
        return null;
    }

    private boolean c(boolean z4) {
        if (s() || AnalyticsConfig.isRealTimeDebugMode()) {
            return true;
        }
        if (this.f63874b == null) {
            this.f63874b = new c();
        }
        this.f63874b.a();
        ReportPolicy.ReportStrategy c5 = this.f63874b.c();
        boolean shouldSendMessage = c5.shouldSendMessage(z4);
        if (shouldSendMessage) {
            if (((c5 instanceof ReportPolicy.ReportByInterval) || (c5 instanceof ReportPolicy.DebugPolicy) || (c5 instanceof ReportPolicy.ReportQuasiRealtime)) && p()) {
                d();
            }
            if ((c5 instanceof ReportPolicy.DefconPolicy) && p()) {
                d();
            }
            if (UMConfigure.isDebugLog()) {
                MLog.d("数据发送策略 : " + c5.getClass().getSimpleName());
            }
        }
        return shouldSendMessage;
    }

    private void a(String str, String str2) {
        Method method;
        Class<?> cls = f63872y;
        if (cls == null || (method = f63873z) == null) {
            return;
        }
        try {
            method.invoke(cls, str, str2);
        } catch (Throwable unused) {
            UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> reflect call setPuidAndProvider method of crash lib failed.");
        }
    }

    private void e(JSONObject jSONObject) {
        JSONObject jSONObject2;
        if (jSONObject == null) {
            return;
        }
        try {
            if (jSONObject.length() <= 0) {
                return;
            }
            JSONObject jSONObject3 = new JSONObject();
            if (jSONObject.has(com.umeng.commonsdk.statistics.b.a("analytics"))) {
                JSONObject jSONObject4 = jSONObject.getJSONObject(com.umeng.commonsdk.statistics.b.a("analytics"));
                if (jSONObject4.has(f.f63701n)) {
                    JSONArray jSONArray = jSONObject4.getJSONArray(f.f63701n);
                    JSONArray jSONArray2 = new JSONArray();
                    for (int i4 = 0; i4 < jSONArray.length(); i4++) {
                        JSONObject jSONObject5 = jSONArray.getJSONObject(i4);
                        if (jSONObject5 != null && jSONObject5.length() > 0) {
                            jSONArray2.put(jSONObject5);
                        }
                    }
                    jSONObject3.put(f.f63701n, jSONArray2);
                    if (jSONObject3.length() > 0) {
                        MLog.d("本次启动会话:" + jSONObject3.toString());
                        jSONObject3 = new JSONObject();
                    }
                }
                if (jSONObject4.has(f.L)) {
                    jSONObject3.put(f.L, jSONObject4.getJSONObject(f.L));
                    if (jSONObject3.length() > 0) {
                        MLog.d("本次启动账号:" + jSONObject3.toString());
                        jSONObject3 = new JSONObject();
                    }
                }
            }
            if (jSONObject.has(com.umeng.commonsdk.statistics.b.a("header")) && jSONObject.has(com.umeng.commonsdk.statistics.b.a("header")) && (jSONObject2 = jSONObject.getJSONObject(com.umeng.commonsdk.statistics.b.a("header"))) != null && jSONObject2.length() > 0) {
                if (jSONObject2.has(com.umeng.commonsdk.statistics.b.a("sdk_version"))) {
                    jSONObject3.put("sdk_version", jSONObject2.getString(com.umeng.commonsdk.statistics.b.a("sdk_version")));
                }
                if (jSONObject2.has(com.umeng.commonsdk.statistics.b.a("device_id"))) {
                    jSONObject3.put("device_id", jSONObject2.getString(com.umeng.commonsdk.statistics.b.a("device_id")));
                }
                if (jSONObject2.has(com.umeng.commonsdk.statistics.b.a("device_model"))) {
                    jSONObject3.put("device_model", jSONObject2.getString(com.umeng.commonsdk.statistics.b.a("device_model")));
                }
                if (jSONObject2.has(com.umeng.commonsdk.statistics.b.a("version_code"))) {
                    jSONObject3.put("version", jSONObject2.getInt(com.umeng.commonsdk.statistics.b.a("version_code")));
                }
                if (jSONObject2.has(com.umeng.commonsdk.statistics.b.a("appkey"))) {
                    jSONObject3.put("appkey", jSONObject2.getString(com.umeng.commonsdk.statistics.b.a("appkey")));
                }
                if (jSONObject2.has(com.umeng.commonsdk.statistics.b.a("channel"))) {
                    jSONObject3.put("channel", jSONObject2.getString(com.umeng.commonsdk.statistics.b.a("channel")));
                }
                if (jSONObject3.length() > 0) {
                    MLog.d("本次启动基础信息:" + jSONObject3.toString());
                    jSONObject3 = new JSONObject();
                }
            }
            jSONObject3.length();
        } catch (Throwable th) {
            MLog.e(th);
        }
    }

    public void a(Object obj, int i4) {
        if (com.umeng.commonsdk.utils.c.a()) {
            if (i4 != 4357) {
                return;
            }
            try {
                UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> clean db in silent mode.");
                j.a(f63862a);
                com.umeng.commonsdk.utils.c.c(f63862a);
            } catch (Throwable unused) {
            }
        }
        if (AnalyticsConfig.enable) {
            try {
                if (i4 != 4358) {
                    switch (i4) {
                        case 4097:
                            if (UMUtils.isMainProgress(f63862a)) {
                                if (obj != null) {
                                    e(obj);
                                }
                                if (f63870t.equals(((JSONObject) obj).optString("__i"))) {
                                    return;
                                }
                                a(false);
                                return;
                            }
                            UMProcessDBHelper.getInstance(f63862a).insertEventsInSubProcess(UMFrUtils.getSubProcessName(f63862a), new JSONArray().put(obj));
                            return;
                        case 4098:
                            if (obj != null) {
                                e(obj);
                            }
                            if (f63870t.equals(((JSONObject) obj).optString("__i"))) {
                                return;
                            }
                            a(false);
                            return;
                        case 4099:
                            x.a(f63862a);
                            return;
                        case a.f63891d /* 4100 */:
                            n.c(f63862a);
                            return;
                        case a.f63892e /* 4101 */:
                            UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> PROFILE_SIGNIN");
                            a((Object) null, true);
                            g(obj);
                            return;
                        case a.f63893f /* 4102 */:
                            UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> PROFILE_SIGNOFF");
                            a((Object) null, true);
                            f(obj);
                            return;
                        case a.f63894g /* 4103 */:
                            UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> START_SESSION");
                            w.a().a(f63862a, obj);
                            synchronized (this.f63887w) {
                                this.f63886v = true;
                            }
                            return;
                        case a.f63895h /* 4104 */:
                            w.a().c(f63862a, obj);
                            return;
                        case a.f63896i /* 4105 */:
                            d();
                            return;
                        case a.f63897j /* 4106 */:
                            h(obj);
                            return;
                        default:
                            switch (i4) {
                                case 4352:
                                    UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> INSTANT_SESSION_START");
                                    w.a().b(f63862a, obj);
                                    synchronized (this.f63887w) {
                                        this.f63885u = true;
                                    }
                                    return;
                                case 4353:
                                    a(obj, true);
                                    return;
                                case 4354:
                                    c();
                                    return;
                                case 4355:
                                    if (!UMUtils.isMainProgress(f63862a)) {
                                        UMProcessDBHelper.getInstance(f63862a).insertEventsInSubProcess(UMFrUtils.getSubProcessName(f63862a), new JSONArray().put(obj));
                                        return;
                                    } else if (obj != null) {
                                        e(obj);
                                        d();
                                        return;
                                    } else {
                                        return;
                                    }
                                case 4356:
                                    if (obj == null || f63872y == null || f63873z == null) {
                                        return;
                                    }
                                    UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> PROFILE_CHANGE_NOTIFY");
                                    String str = "";
                                    String str2 = "";
                                    if (obj instanceof JSONObject) {
                                        JSONObject jSONObject = (JSONObject) obj;
                                        if (jSONObject.has("uid") && jSONObject.has(f.M)) {
                                            str = jSONObject.getString(f.M);
                                            str2 = jSONObject.getString("uid");
                                        }
                                        a(str2, str);
                                        return;
                                    }
                                    return;
                                default:
                                    switch (i4) {
                                        case a.f63907t /* 8195 */:
                                            com.umeng.analytics.b.a().a(obj);
                                            return;
                                        case a.f63908u /* 8196 */:
                                            com.umeng.analytics.b.a().m();
                                            return;
                                        case a.f63909v /* 8197 */:
                                            com.umeng.analytics.b.a().k();
                                            return;
                                        default:
                                            switch (i4) {
                                                case a.f63910w /* 8199 */:
                                                case a.f63911x /* 8200 */:
                                                    com.umeng.analytics.b.a().b(obj);
                                                    return;
                                                case a.f63912y /* 8201 */:
                                                    com.umeng.analytics.b.a().b((Object) null);
                                                    return;
                                                default:
                                                    switch (i4) {
                                                        case a.f63913z /* 8208 */:
                                                            UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> receive DELAY_BUILD_ENVELOPE event.");
                                                            Context context = f63862a;
                                                            UMWorkDispatch.sendEvent(context, a.A, CoreProtocol.getInstance(context), null);
                                                            Context context2 = f63862a;
                                                            UMWorkDispatch.sendEvent(context2, 4354, CoreProtocol.getInstance(context2), null);
                                                            return;
                                                        case a.A /* 8209 */:
                                                            a(obj, false);
                                                            return;
                                                        case a.B /* 8210 */:
                                                            UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> recv BUILD_ENVELOPE_IMMEDIATELY.");
                                                            if (!UMUtils.isMainProgress(f63862a) || (this.f63874b.c() instanceof ReportPolicy.ReportQuasiRealtime)) {
                                                                return;
                                                            }
                                                            a(true);
                                                            return;
                                                        default:
                                                            switch (i4) {
                                                                case a.E /* 8213 */:
                                                                    if (FieldManager.allow(com.umeng.commonsdk.utils.d.E)) {
                                                                        if (DeviceConfig.getGlobleActivity(f63862a) != null) {
                                                                            w.b(f63862a);
                                                                        }
                                                                        Context context3 = f63862a;
                                                                        UMWorkDispatch.sendEventEx(context3, a.E, CoreProtocol.getInstance(context3), null, 5000L);
                                                                        return;
                                                                    }
                                                                    return;
                                                                case a.F /* 8214 */:
                                                                    if (obj != null && (obj instanceof JSONObject)) {
                                                                        String optString = ((JSONObject) obj).optString(AnalyticsConfig.RTD_START_TIME);
                                                                        String optString2 = ((JSONObject) obj).optString("period");
                                                                        String optString3 = ((JSONObject) obj).optString("debugkey");
                                                                        if (TextUtils.isEmpty(optString) || TextUtils.isEmpty(optString2) || TextUtils.isEmpty(optString3)) {
                                                                            return;
                                                                        }
                                                                        Context context4 = f63862a;
                                                                        String str3 = AnalyticsConfig.RTD_SP_FILE;
                                                                        com.umeng.common.b.a(context4, str3, AnalyticsConfig.RTD_START_TIME, optString);
                                                                        com.umeng.common.b.a(f63862a, str3, "period", optString2);
                                                                        com.umeng.common.b.a(f63862a, str3, "debugkey", optString3);
                                                                        return;
                                                                    }
                                                                    return;
                                                                case a.G /* 8215 */:
                                                                    com.umeng.common.b.a(f63862a, AnalyticsConfig.RTD_SP_FILE);
                                                                    return;
                                                                default:
                                                                    return;
                                                            }
                                                    }
                                            }
                                    }
                            }
                    }
                } else if (obj != null && (obj instanceof JSONObject)) {
                    String optString4 = ((JSONObject) obj).optString(f.S);
                    Object opt = ((JSONObject) obj).opt(f.T);
                    if (TextUtils.isEmpty(optString4)) {
                        return;
                    }
                    String[] a5 = com.umeng.analytics.c.a(f63862a);
                    if (a5 != null && !TextUtils.isEmpty(a5[0]) && !TextUtils.isEmpty(a5[1])) {
                        if (f.O.equals(optString4)) {
                            com.umeng.analytics.c.a((String) opt);
                            return;
                        } else if (f.P.equals(optString4)) {
                            com.umeng.analytics.c.b((String) opt);
                            return;
                        } else {
                            com.umeng.analytics.c.a(optString4, opt);
                            return;
                        }
                    }
                    MLog.e("Please call MobclickAgent.onProfileSignIn() function before set user profile property.");
                }
            } catch (Throwable unused2) {
            }
        }
    }

    private void g(Object obj) {
        try {
            b(f63862a);
            d();
            JSONObject jSONObject = (JSONObject) obj;
            if (jSONObject != null && jSONObject.length() > 0) {
                String string = jSONObject.getString(f.M);
                String string2 = jSONObject.getString("uid");
                long j4 = jSONObject.getLong("ts");
                String[] a5 = com.umeng.analytics.c.a(f63862a);
                if (a5 != null && string.equals(a5[0]) && string2.equals(a5[1])) {
                    return;
                }
                w.a().a(f63862a, j4);
                String c5 = aa.a().c(f63862a);
                boolean b5 = w.a().b(f63862a, j4, false);
                com.umeng.analytics.c.a(f63862a, string, string2);
                UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> onProfileSignIn: force generate new session: session id = " + c5);
                w.a().a(f63862a, j4, true);
                if (b5) {
                    w.a().b(f63862a, j4);
                }
            }
        } catch (Throwable unused) {
        }
    }

    public long f() {
        SharedPreferences sharedPreferences;
        try {
            Context context = f63862a;
            if (context == null || (sharedPreferences = PreferenceWrapper.getDefault(context)) == null) {
                return 0L;
            }
            long j4 = sharedPreferences.getLong(f63863l, 0L);
            if (j4 == 0) {
                try {
                    long currentTimeMillis = System.currentTimeMillis();
                    sharedPreferences.edit().putLong(f63863l, currentTimeMillis).commit();
                    return currentTimeMillis;
                } catch (Throwable unused) {
                }
            }
            return j4;
        } catch (Throwable unused2) {
            return 0L;
        }
    }

    public void c(Object obj) {
        b(f63862a);
        d();
        if (d(false)) {
            j();
        }
    }

    private void f(Object obj) {
        try {
            JSONObject jSONObject = (JSONObject) obj;
            if (jSONObject != null && jSONObject.length() > 0) {
                long j4 = jSONObject.getLong("ts");
                b(f63862a);
                d();
                String[] a5 = com.umeng.analytics.c.a(f63862a);
                if (a5 == null || TextUtils.isEmpty(a5[0]) || TextUtils.isEmpty(a5[1])) {
                    return;
                }
                w.a().a(f63862a, j4);
                String c5 = aa.a().c(f63862a);
                UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> onProfileSignIn: force generate new session: session id = " + c5);
                boolean b5 = w.a().b(f63862a, j4, false);
                com.umeng.analytics.c.b(f63862a);
                w.a().a(f63862a, j4, true);
                if (b5) {
                    w.a().b(f63862a, j4);
                }
            }
        } catch (Throwable th) {
            if (MLog.DEBUG) {
                MLog.e(" Excepthon  in  onProfileSignOff", th);
            }
        }
    }

    private JSONObject b(JSONObject jSONObject, long j4) {
        try {
            if (s.a(jSONObject) > j4) {
                jSONObject = null;
                k.a(f63862a).a(true, false);
                k.a(f63862a).b();
                UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> Instant session packet overload !!! ");
                return null;
            }
            return jSONObject;
        } catch (Throwable unused) {
            return jSONObject;
        }
    }

    public JSONObject b(boolean z4) {
        JSONArray jSONArray;
        JSONArray jSONArray2;
        JSONObject jSONObject = null;
        try {
            jSONObject = k.a(f63862a).a(z4);
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            } else {
                try {
                    if (jSONObject.has(f.f63701n)) {
                        JSONArray jSONArray3 = jSONObject.getJSONArray(f.f63701n);
                        JSONArray jSONArray4 = new JSONArray();
                        int i4 = 0;
                        while (i4 < jSONArray3.length()) {
                            JSONObject jSONObject2 = (JSONObject) jSONArray3.get(i4);
                            JSONArray optJSONArray = jSONObject2.optJSONArray(f.f63707t);
                            JSONArray optJSONArray2 = jSONObject2.optJSONArray(f.f63708u);
                            if (optJSONArray == null && optJSONArray2 != null) {
                                jSONObject2.put(f.f63707t, optJSONArray2);
                                jSONObject2.remove(f.f63708u);
                            }
                            if (optJSONArray != null && optJSONArray2 != null) {
                                ArrayList<JSONObject> arrayList = new ArrayList();
                                for (int i5 = 0; i5 < optJSONArray.length(); i5++) {
                                    arrayList.add((JSONObject) optJSONArray.get(i5));
                                }
                                for (int i6 = 0; i6 < optJSONArray2.length(); i6++) {
                                    arrayList.add((JSONObject) optJSONArray2.get(i6));
                                }
                                JSONArraySortUtil jSONArraySortUtil = new JSONArraySortUtil();
                                jSONArraySortUtil.setCompareKey(f.f63711x);
                                Collections.sort(arrayList, jSONArraySortUtil);
                                JSONArray jSONArray5 = new JSONArray();
                                for (JSONObject jSONObject3 : arrayList) {
                                    jSONArray5.put(jSONObject3);
                                }
                                jSONObject2.put(f.f63707t, jSONArray5);
                                jSONObject2.remove(f.f63708u);
                            }
                            if (jSONObject2.has(f.f63707t)) {
                                JSONArray optJSONArray3 = jSONObject2.optJSONArray(f.f63707t);
                                int i7 = 0;
                                while (i7 < optJSONArray3.length()) {
                                    JSONObject jSONObject4 = optJSONArray3.getJSONObject(i7);
                                    if (jSONObject4.has(f.f63711x)) {
                                        jSONArray2 = jSONArray3;
                                        jSONObject4.put("ts", jSONObject4.getLong(f.f63711x));
                                        jSONObject4.remove(f.f63711x);
                                    } else {
                                        jSONArray2 = jSONArray3;
                                    }
                                    i7++;
                                    jSONArray3 = jSONArray2;
                                }
                                jSONArray = jSONArray3;
                                jSONObject2.put(f.f63707t, optJSONArray3);
                                jSONObject2.put(f.f63713z, optJSONArray3.length());
                            } else {
                                jSONArray = jSONArray3;
                                jSONObject2.put(f.f63713z, 0);
                            }
                            jSONArray4.put(jSONObject2);
                            i4++;
                            jSONArray3 = jSONArray;
                        }
                        jSONObject.put(f.f63701n, jSONArray4);
                    }
                } catch (Exception e5) {
                    MLog.e("merge pages error");
                    e5.printStackTrace();
                }
            }
            SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(f63862a);
            if (sharedPreferences != null) {
                String string = sharedPreferences.getString("userlevel", "");
                if (!TextUtils.isEmpty(string)) {
                    jSONObject.put("userlevel", string);
                }
            }
            String[] a5 = com.umeng.analytics.c.a(f63862a);
            if (a5 != null && !TextUtils.isEmpty(a5[0]) && !TextUtils.isEmpty(a5[1])) {
                JSONObject jSONObject5 = new JSONObject();
                jSONObject5.put(f.M, a5[0]);
                jSONObject5.put(f.N, a5[1]);
                if (jSONObject5.length() > 0) {
                    JSONObject jSONObject6 = new JSONObject();
                    String a6 = com.umeng.analytics.c.a();
                    if (a6 != null) {
                        jSONObject6.put(f.O, a6);
                    }
                    String b5 = com.umeng.analytics.c.b();
                    if (b5 != null) {
                        jSONObject6.put(f.P, b5);
                    }
                    Map<String, Object> c5 = com.umeng.analytics.c.c(f63862a);
                    if (c5 != null && c5.size() > 0) {
                        for (String str : c5.keySet()) {
                            jSONObject6.put(str, c5.get(str));
                        }
                    }
                    if (jSONObject6.length() > 0) {
                        jSONObject5.put("up", jSONObject6);
                    }
                    jSONObject.put(f.L, jSONObject5);
                }
            }
            if (ABTest.getService(f63862a).isInTest()) {
                JSONObject jSONObject7 = new JSONObject();
                jSONObject7.put(ABTest.getService(f63862a).getTestName(), ABTest.getService(f63862a).getGroupInfo());
                jSONObject.put(f.K, jSONObject7);
            }
            t.a().a(jSONObject, f63862a);
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    public void e() {
        if (d(false)) {
            j();
        }
    }

    public void d(Object obj) {
        r();
        m();
        n();
        a(true);
    }

    private boolean d(boolean z4) {
        if (this.f63874b == null) {
            this.f63874b = new c();
        }
        ReportPolicy.ReportStrategy c5 = this.f63874b.c();
        if (c5 instanceof ReportPolicy.DefconPolicy) {
            if (z4) {
                return ((ReportPolicy.DefconPolicy) c5).shouldSendMessageByInstant();
            }
            return c5.shouldSendMessage(false);
        }
        return true;
    }

    public void b(Object obj) {
        if (obj != null) {
            try {
                JSONObject jSONObject = (JSONObject) obj;
                if (jSONObject.length() > 0) {
                    if (jSONObject.has("exception")) {
                        if (101 != jSONObject.getInt("exception")) {
                            f(jSONObject);
                        }
                    } else {
                        f(jSONObject);
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    public void b(Context context) {
        try {
            k.a(context).d();
            q();
        } catch (Throwable unused) {
        }
    }

    public void a(boolean z4) {
        if (c(z4)) {
            if (!(this.f63874b.c() instanceof ReportPolicy.ReportQuasiRealtime)) {
                if (UMEnvelopeBuild.isReadyBuild(f63862a, UMLogDataProtocol.UMBusinessType.U_APP)) {
                    UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> constructMessage()");
                    j();
                }
            } else if (z4) {
                if (UMEnvelopeBuild.isOnline(f63862a)) {
                    UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> send session start in policy ReportQuasiRealtime.");
                    j();
                }
            } else if (UMEnvelopeBuild.isReadyBuild(f63862a, UMLogDataProtocol.UMBusinessType.U_APP)) {
                UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> send normal data in policy ReportQuasiRealtime.");
                j();
            }
        }
    }

    private boolean a(JSONArray jSONArray) {
        int length = jSONArray.length();
        List asList = Arrays.asList("$$_onUMengEnterForeground", "$$_onUMengEnterBackground", "$$_onUMengEnterForegroundInitError");
        int i4 = 0;
        for (int i5 = 0; i5 < length; i5++) {
            try {
                JSONObject optJSONObject = jSONArray.optJSONObject(i5);
                if (optJSONObject != null && asList.contains(optJSONObject.optString("id"))) {
                    i4++;
                }
            } catch (Throwable unused) {
            }
        }
        return i4 >= length;
    }

    private boolean a(JSONObject jSONObject) {
        JSONArray optJSONArray = jSONObject.optJSONArray("ekv");
        int length = optJSONArray.length();
        int i4 = 0;
        for (int i5 = 0; i5 < length; i5++) {
            try {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i5);
                Iterator<String> keys = optJSONObject.keys();
                while (keys.hasNext()) {
                    JSONArray optJSONArray2 = optJSONObject.optJSONArray(keys.next());
                    if (optJSONArray2 != null && a(optJSONArray2)) {
                        i4++;
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return i4 >= length;
    }

    public JSONObject a(long j4) {
        if (TextUtils.isEmpty(aa.a().d(f63862a))) {
            return null;
        }
        JSONObject b5 = b(false);
        int a5 = t.a().a(f63862a);
        if (b5.length() > 0) {
            if (b5.length() == 1) {
                if (b5.optJSONObject(f.L) != null && a5 != 3) {
                    return null;
                }
                if (!TextUtils.isEmpty(b5.optString("userlevel")) && a5 != 3) {
                    return null;
                }
            } else if (b5.length() == 2 && b5.optJSONObject(f.L) != null && !TextUtils.isEmpty(b5.optString("userlevel")) && a5 != 3) {
                return null;
            }
            String optString = b5.optString(f.f63701n);
            String optString2 = b5.optString(f.Z);
            String optString3 = b5.optString("ekv");
            if (TextUtils.isEmpty(optString) && TextUtils.isEmpty(optString2) && !TextUtils.isEmpty(optString3) && a(b5)) {
                return null;
            }
        } else if (a5 != 3) {
            return null;
        }
        JSONObject l4 = l();
        if (l4 != null) {
            c(l4);
        }
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            if (a5 == 3) {
                jSONObject2.put("analytics", new JSONObject());
            } else if (b5.length() > 0) {
                jSONObject2.put("analytics", b5);
            }
            if (l4 != null && l4.length() > 0) {
                jSONObject.put("header", l4);
            }
            if (jSONObject2.length() > 0) {
                jSONObject.put("content", jSONObject2);
            }
            return a(jSONObject, j4);
        } catch (Throwable unused) {
            return jSONObject;
        }
    }

    private JSONObject a(JSONObject jSONObject, long j4) {
        try {
            if (s.a(jSONObject) > j4) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("header");
                jSONObject2.put(f.aH, s.a(jSONObject));
                jSONObject.put("header", jSONObject2);
                return s.a(f63862a, j4, jSONObject);
            }
            return jSONObject;
        } catch (Throwable unused) {
            return jSONObject;
        }
    }

    private boolean a(long j4, int i4) {
        if (j4 != 0) {
            if (System.currentTimeMillis() - j4 <= 28800000) {
                return i4 < 5000;
            }
            o();
            return true;
        }
        return true;
    }

    public void a(Object obj) {
        if (obj != null) {
            try {
                JSONObject jSONObject = (JSONObject) obj;
                if (jSONObject.length() > 0) {
                    if (jSONObject.has("exception")) {
                        if (101 != jSONObject.getInt("exception")) {
                            g(jSONObject);
                        }
                    } else {
                        g(jSONObject);
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    public void a(Object obj, boolean z4) {
        if (z4) {
            if (d(true)) {
                i();
            }
        } else if (UMEnvelopeBuild.isOnline(f63862a) && d(true)) {
            i();
        }
    }
}
