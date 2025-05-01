package com.umeng.analytics.pro;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.umeng.analytics.AnalyticsConfig;
import com.umeng.analytics.CoreProtocol;
import com.umeng.analytics.pro.aa;
import com.umeng.analytics.pro.g;
import com.umeng.analytics.pro.k;
import com.umeng.analytics.pro.q;
import com.umeng.analytics.process.UMProcessDBDatasSender;
import com.umeng.commonsdk.config.FieldManager;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.framework.UMWorkDispatch;
import com.umeng.commonsdk.service.UMGlobalContext;
import com.umeng.commonsdk.statistics.AnalyticsConstants;
import com.umeng.commonsdk.statistics.common.MLog;
import com.umeng.commonsdk.statistics.internal.PreferenceWrapper;
import com.umeng.commonsdk.utils.UMUtils;
import java.lang.reflect.Method;
import org.json.JSONObject;
/* compiled from: SessionTracker.java */
/* loaded from: classes6.dex */
public class w implements aa.a {

    /* renamed from: a  reason: collision with root package name */
    public static final String f63942a = "session_start_time";

    /* renamed from: b  reason: collision with root package name */
    public static final String f63943b = "session_end_time";

    /* renamed from: c  reason: collision with root package name */
    public static final String f63944c = "session_id";

    /* renamed from: d  reason: collision with root package name */
    public static final String f63945d = "pre_session_id";

    /* renamed from: e  reason: collision with root package name */
    public static final String f63946e = "a_start_time";

    /* renamed from: f  reason: collision with root package name */
    public static final String f63947f = "a_end_time";

    /* renamed from: g  reason: collision with root package name */
    public static final String f63948g = "fg_count";

    /* renamed from: h  reason: collision with root package name */
    private static String f63949h = null;

    /* renamed from: i  reason: collision with root package name */
    private static Context f63950i = null;

    /* renamed from: j  reason: collision with root package name */
    private static boolean f63951j = false;

    /* renamed from: k  reason: collision with root package name */
    private static long f63952k = 0;

    /* renamed from: l  reason: collision with root package name */
    private static boolean f63953l = true;

    /* renamed from: m  reason: collision with root package name */
    private static long f63954m;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SessionTracker.java */
    /* loaded from: classes6.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private static final w f63955a = new w();

        private a() {
        }
    }

    public static w a() {
        return a.f63955a;
    }

    public static void b(Context context) {
        SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(f63950i);
        if (sharedPreferences != null) {
            long j4 = sharedPreferences.getLong(f63948g, 0L);
            SharedPreferences.Editor edit = sharedPreferences.edit();
            if (edit != null) {
                edit.putLong(f63948g, j4 + 1);
                edit.commit();
            }
        }
    }

    private void d(Context context) {
        try {
            SharedPreferences.Editor edit = PreferenceWrapper.getDefault(context).edit();
            edit.putLong(f63948g, 0L);
            edit.commit();
        } catch (Throwable unused) {
        }
    }

    private String e(Context context) {
        if (f63950i == null && context != null) {
            f63950i = context.getApplicationContext();
        }
        String d5 = aa.a().d(f63950i);
        try {
            f(context);
            q.a(f63950i).d((Object) null);
        } catch (Throwable unused) {
        }
        return d5;
    }

    private void f(Context context) {
        q.a(context).b(context);
        q.a(context).d();
    }

    public void c(Context context, Object obj) {
        try {
            if (f63950i == null && context != null) {
                f63950i = context.getApplicationContext();
            }
            long longValue = ((Long) obj).longValue();
            SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(context);
            if (sharedPreferences == null) {
                return;
            }
            if (sharedPreferences.getLong(f63946e, 0L) == 0) {
                MLog.e("onPause called before onResume");
                return;
            }
            SharedPreferences.Editor edit = sharedPreferences.edit();
            UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> onEndSessionInternal: write activity end time = " + longValue);
            edit.putLong(f63947f, longValue);
            edit.putLong(f63943b, longValue);
            edit.commit();
        } catch (Throwable unused) {
        }
    }

    private w() {
        aa.a().a(this);
    }

    public static long a(Context context) {
        try {
            return PreferenceWrapper.getDefault(context).getLong(f63948g, 0L);
        } catch (Throwable unused) {
            return 0L;
        }
    }

    public void a(Context context, long j4) {
        SharedPreferences.Editor edit;
        SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(f63950i);
        if (sharedPreferences == null || (edit = sharedPreferences.edit()) == null) {
            return;
        }
        edit.putLong(f63942a, j4);
        edit.commit();
    }

    public void b(Context context, Object obj) {
        long longValue;
        try {
            if (f63950i == null) {
                f63950i = UMGlobalContext.getAppContext(context);
            }
            if (obj == null) {
                longValue = System.currentTimeMillis();
            } else {
                longValue = ((Long) obj).longValue();
            }
            SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(f63950i);
            if (sharedPreferences == null) {
                return;
            }
            f63952k = sharedPreferences.getLong(f63947f, 0L);
            UMRTLog.i(UMRTLog.RTLOG_TAG, "------>>> lastActivityEndTime: " + f63952k);
            String string = sharedPreferences.getString(f.aF, "");
            String appVersionName = UMUtils.getAppVersionName(f63950i);
            SharedPreferences.Editor edit = sharedPreferences.edit();
            if (edit == null) {
                return;
            }
            if (!TextUtils.isEmpty(string) && !string.equals(appVersionName)) {
                UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> requestNewInstantSessionIf: version upgrade");
                edit.putLong(f63942a, longValue);
                edit.commit();
                q.a(f63950i).a((Object) null, true);
                String c5 = aa.a().c(f63950i);
                UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> force generate new session: session id = " + c5);
                f63951j = true;
                a(f63950i, longValue, true);
            } else if (aa.a().e(f63950i)) {
                UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> More then 30 sec from last session.");
                f63951j = true;
                edit.putLong(f63942a, longValue);
                edit.commit();
                a(f63950i, longValue, false);
            } else {
                UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> less then 30 sec from last session, do nothing.");
                f63951j = false;
            }
        } catch (Throwable unused) {
        }
    }

    public void a(Context context, Object obj) {
        SharedPreferences.Editor edit;
        try {
            if (f63950i == null && context != null) {
                f63950i = context.getApplicationContext();
            }
            long longValue = ((Long) obj).longValue();
            SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(f63950i);
            if (sharedPreferences == null || (edit = sharedPreferences.edit()) == null) {
                return;
            }
            String string = sharedPreferences.getString(f.aF, "");
            String appVersionName = UMUtils.getAppVersionName(f63950i);
            if (TextUtils.isEmpty(string)) {
                edit.putInt("versioncode", Integer.parseInt(UMUtils.getAppVersionCode(context)));
                edit.putString(f.aF, appVersionName);
                edit.commit();
            } else if (!string.equals(appVersionName)) {
                UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> onStartSessionInternal: upgrade version: " + string + "-> " + appVersionName);
                int i4 = sharedPreferences.getInt("versioncode", 0);
                String string2 = sharedPreferences.getString("pre_date", "");
                String string3 = sharedPreferences.getString("pre_version", "");
                String string4 = sharedPreferences.getString(f.aF, "");
                edit.putInt("versioncode", Integer.parseInt(UMUtils.getAppVersionCode(context)));
                edit.putString(f.aF, appVersionName);
                edit.putString("vers_date", string2);
                edit.putString("vers_pre_version", string3);
                edit.putString("cur_version", string4);
                edit.putInt("vers_code", i4);
                edit.putString("vers_name", string);
                edit.commit();
                if (f63953l) {
                    f63953l = false;
                }
                if (f63951j) {
                    f63951j = false;
                    b(f63950i, longValue, true);
                    b(f63950i, longValue);
                    return;
                }
                return;
            }
            if (f63951j) {
                f63951j = false;
                if (f63953l) {
                    f63953l = false;
                }
                f63949h = e(context);
                MLog.d("创建新会话: " + f63949h);
                UMRTLog.i(UMRTLog.RTLOG_TAG, "mSessionChanged flag has been set, Start new session: " + f63949h);
                return;
            }
            f63949h = sharedPreferences.getString("session_id", null);
            edit.putLong(f63946e, longValue);
            edit.putLong(f63947f, 0L);
            edit.commit();
            MLog.d("延续上一个会话: " + f63949h);
            UMRTLog.i(UMRTLog.RTLOG_TAG, "Extend current session: " + f63949h);
            if (f63953l) {
                f63953l = false;
                if (FieldManager.allow(com.umeng.commonsdk.utils.d.E)) {
                    Context context2 = f63950i;
                    UMWorkDispatch.sendEventEx(context2, q.a.E, CoreProtocol.getInstance(context2), null, 0L);
                }
            }
            f(context);
            q.a(f63950i).a(false);
        } catch (Throwable unused) {
        }
    }

    @Deprecated
    public String c(Context context) {
        try {
            if (f63949h == null) {
                return PreferenceWrapper.getDefault(context).getString("session_id", null);
            }
        } catch (Throwable unused) {
        }
        return f63949h;
    }

    @Deprecated
    public String c() {
        return c(f63950i);
    }

    public boolean b(Context context, long j4, boolean z4) {
        SharedPreferences sharedPreferences;
        String a5;
        long j5;
        boolean z5 = false;
        try {
            sharedPreferences = PreferenceWrapper.getDefault(context);
        } catch (Throwable unused) {
        }
        if (sharedPreferences == null || (a5 = aa.a().a(f63950i)) == null) {
            return false;
        }
        long j6 = sharedPreferences.getLong(f63946e, 0L);
        long j7 = sharedPreferences.getLong(f63947f, 0L);
        if (j6 > 0 && j7 == 0) {
            z5 = true;
            if (z4) {
                j5 = f63952k;
                if (j5 == 0) {
                    UMRTLog.i(UMRTLog.RTLOG_TAG, "------>>> lastActivityEndTime = 0, In-app upgrade, use currentTime: = " + j4);
                    j5 = j4;
                } else {
                    UMRTLog.i(UMRTLog.RTLOG_TAG, "------>>> lastActivityEndTime != 0, app upgrade, use lastActivityEndTime: = " + f63952k);
                }
                c(f63950i, Long.valueOf(j5));
            } else {
                c(f63950i, Long.valueOf(j4));
                j5 = j4;
            }
            JSONObject jSONObject = new JSONObject();
            if (z4) {
                jSONObject.put(g.d.a.f63763g, j5);
            } else {
                jSONObject.put(g.d.a.f63763g, j4);
            }
            JSONObject b5 = com.umeng.analytics.b.a().b();
            if (b5 != null && b5.length() > 0) {
                jSONObject.put("__sp", b5);
            }
            JSONObject c5 = com.umeng.analytics.b.a().c();
            if (c5 != null && c5.length() > 0) {
                jSONObject.put("__pp", c5);
            }
            if (FieldManager.allow(com.umeng.commonsdk.utils.d.E)) {
                UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>>*** foregroundCount = " + f63954m);
                jSONObject.put(g.d.a.f63764h, f63954m);
                f63954m = 0L;
            } else {
                jSONObject.put(g.d.a.f63764h, 0L);
            }
            k.a(context).a(a5, jSONObject, k.a.END);
            q.a(f63950i).e();
        }
        return z5;
    }

    public void b(Context context, long j4) {
        if (PreferenceWrapper.getDefault(context) == null) {
            return;
        }
        try {
            q.a(f63950i).c((Object) null);
        } catch (Throwable unused) {
        }
    }

    public String a(Context context, long j4, boolean z4) {
        String b5 = aa.a().b(context);
        UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> onInstantSessionInternal: current session id = " + b5);
        if (TextUtils.isEmpty(b5)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("__e", j4);
            JSONObject b6 = com.umeng.analytics.b.a().b();
            if (b6 != null && b6.length() > 0) {
                jSONObject.put("__sp", b6);
            }
            JSONObject c5 = com.umeng.analytics.b.a().c();
            if (c5 != null && c5.length() > 0) {
                jSONObject.put("__pp", c5);
            }
            k.a(context).a(b5, jSONObject, k.a.INSTANTSESSIONBEGIN);
            q.a(context).a(jSONObject, z4);
        } catch (Throwable unused) {
        }
        return b5;
    }

    @Deprecated
    public String b() {
        return f63949h;
    }

    @Override // com.umeng.analytics.pro.aa.a
    public void a(String str, String str2, long j4, long j5, long j6) {
        a(f63950i, str2, j4, j5, j6);
        UMRTLog.i(UMRTLog.RTLOG_TAG, "saveSessionToDB: complete");
        if (AnalyticsConstants.SUB_PROCESS_EVENT) {
            Context context = f63950i;
            UMWorkDispatch.sendEvent(context, UMProcessDBDatasSender.UM_PROCESS_EVENT_KEY, UMProcessDBDatasSender.getInstance(context), Long.valueOf(System.currentTimeMillis()));
        }
    }

    @Override // com.umeng.analytics.pro.aa.a
    public void a(String str, long j4, long j5, long j6) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        a(str, j4);
    }

    private void a(Context context, String str, long j4, long j5, long j6) {
        if (TextUtils.isEmpty(f63949h)) {
            f63949h = aa.a().a(f63950i);
        }
        if (TextUtils.isEmpty(str) || str.equals(f63949h)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(g.d.a.f63763g, j5);
            jSONObject.put(g.d.a.f63764h, j6);
            JSONObject b5 = com.umeng.analytics.b.a().b();
            if (b5 != null && b5.length() > 0) {
                jSONObject.put("__sp", b5);
            }
            JSONObject c5 = com.umeng.analytics.b.a().c();
            if (c5 != null && c5.length() > 0) {
                jSONObject.put("__pp", c5);
            }
            k.a(context).a(f63949h, jSONObject, k.a.END);
        } catch (Exception unused) {
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("__e", j4);
            k.a(context).a(str, jSONObject2, k.a.BEGIN);
            if (FieldManager.allow(com.umeng.commonsdk.utils.d.E)) {
                f63954m = j6;
                d(context);
                Context context2 = f63950i;
                UMWorkDispatch.sendEventEx(context2, q.a.E, CoreProtocol.getInstance(context2), null, 0L);
            }
        } catch (Exception unused2) {
        }
        f63949h = str;
    }

    private void a(String str, long j4) {
        SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(f63950i);
        if (sharedPreferences == null) {
            return;
        }
        long j5 = sharedPreferences.getLong(f63943b, 0L);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("__ii", str);
            jSONObject.put("__e", j4);
            jSONObject.put(g.d.a.f63763g, j5);
            double[] location = AnalyticsConfig.getLocation();
            if (location != null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put(f.C, location[0]);
                jSONObject2.put(f.D, location[1]);
                jSONObject2.put("ts", System.currentTimeMillis());
                jSONObject.put(g.d.a.f63761e, jSONObject2);
            }
            Class<?> cls = Class.forName("android.net.TrafficStats");
            Class<?> cls2 = Integer.TYPE;
            Method method = cls.getMethod("getUidRxBytes", cls2);
            Method method2 = cls.getMethod("getUidTxBytes", cls2);
            int i4 = f63950i.getApplicationInfo().uid;
            if (i4 == -1) {
                return;
            }
            long longValue = ((Long) method.invoke(null, Integer.valueOf(i4))).longValue();
            long longValue2 = ((Long) method2.invoke(null, Integer.valueOf(i4))).longValue();
            if (longValue > 0 && longValue2 > 0) {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put(f.H, longValue);
                jSONObject3.put(f.G, longValue2);
                jSONObject.put(g.d.a.f63760d, jSONObject3);
            }
            k.a(f63950i).a(str, jSONObject, k.a.NEWSESSION);
            x.a(f63950i);
            n.c(f63950i);
        } catch (Throwable unused) {
        }
    }
}
