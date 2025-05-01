package com.umeng.analytics;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.text.TextUtils;
import com.umeng.analytics.MobclickAgent;
import com.umeng.analytics.pro.aa;
import com.umeng.analytics.pro.f;
import com.umeng.analytics.pro.k;
import com.umeng.analytics.pro.l;
import com.umeng.analytics.pro.m;
import com.umeng.analytics.pro.n;
import com.umeng.analytics.pro.o;
import com.umeng.analytics.pro.p;
import com.umeng.analytics.pro.q;
import com.umeng.analytics.pro.r;
import com.umeng.analytics.pro.u;
import com.umeng.analytics.pro.v;
import com.umeng.analytics.pro.w;
import com.umeng.analytics.pro.x;
import com.umeng.common.ISysListener;
import com.umeng.commonsdk.UMConfigure;
import com.umeng.commonsdk.config.FieldManager;
import com.umeng.commonsdk.debug.UMLog;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.framework.UMWorkDispatch;
import com.umeng.commonsdk.service.UMGlobalContext;
import com.umeng.commonsdk.statistics.common.DataHelper;
import com.umeng.commonsdk.statistics.common.HelperUtils;
import com.umeng.commonsdk.statistics.common.MLog;
import com.umeng.commonsdk.statistics.internal.PreferenceWrapper;
import com.umeng.commonsdk.utils.UMUtils;
import com.umeng.commonsdk.utils.d;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.microedition.khronos.opengles.GL10;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: InternalAgent.java */
/* loaded from: classes6.dex */
public class b implements p, v {
    private static final String A = "umsp_2";
    private static final String B = "umsp_3";
    private static final String C = "umsp_4";
    private static final String D = "umsp_5";

    /* renamed from: a  reason: collision with root package name */
    private static Context f63231a = null;

    /* renamed from: h  reason: collision with root package name */
    private static final String f63232h = "sp_uapp";

    /* renamed from: i  reason: collision with root package name */
    private static final String f63233i = "prepp_uapp";

    /* renamed from: o  reason: collision with root package name */
    private static final int f63234o = 128;

    /* renamed from: p  reason: collision with root package name */
    private static final int f63235p = 256;

    /* renamed from: q  reason: collision with root package name */
    private static String f63236q = "";

    /* renamed from: r  reason: collision with root package name */
    private static String f63237r = "";

    /* renamed from: t  reason: collision with root package name */
    private static final String f63239t = "ekv_bl_ver";

    /* renamed from: w  reason: collision with root package name */
    private static final String f63241w = "ekv_wl_ver";

    /* renamed from: z  reason: collision with root package name */
    private static final String f63242z = "umsp_1";

    /* renamed from: b  reason: collision with root package name */
    private ISysListener f63243b;

    /* renamed from: c  reason: collision with root package name */
    private r f63244c;

    /* renamed from: d  reason: collision with root package name */
    private x f63245d;

    /* renamed from: e  reason: collision with root package name */
    private m f63246e;

    /* renamed from: f  reason: collision with root package name */
    private w f63247f;

    /* renamed from: g  reason: collision with root package name */
    private n f63248g;

    /* renamed from: j  reason: collision with root package name */
    private boolean f63249j;

    /* renamed from: k  reason: collision with root package name */
    private volatile JSONObject f63250k;

    /* renamed from: l  reason: collision with root package name */
    private volatile JSONObject f63251l;

    /* renamed from: m  reason: collision with root package name */
    private volatile JSONObject f63252m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f63253n;

    /* renamed from: u  reason: collision with root package name */
    private com.umeng.analytics.filter.a f63254u;

    /* renamed from: x  reason: collision with root package name */
    private com.umeng.analytics.filter.b f63255x;

    /* renamed from: y  reason: collision with root package name */
    private o f63256y;

    /* renamed from: s  reason: collision with root package name */
    private static final String f63238s = f.ar;

    /* renamed from: v  reason: collision with root package name */
    private static final String f63240v = f.as;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: InternalAgent.java */
    /* loaded from: classes6.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private static final b f63257a = new b();

        private a() {
        }
    }

    static {
        Context appContext = UMGlobalContext.getAppContext();
        if (appContext != null) {
            f63231a = appContext.getApplicationContext();
        }
    }

    public static b a() {
        return a.f63257a;
    }

    private void i(Context context) {
        try {
            if (context == null) {
                MLog.e("unexpected null context in getNativeSuperProperties");
                return;
            }
            if (f63231a == null) {
                f63231a = context.getApplicationContext();
            }
            SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(context);
            if (this.f63250k == null) {
                this.f63250k = new JSONObject();
            }
            if (this.f63251l == null) {
                this.f63251l = new JSONObject();
            }
            String string = sharedPreferences.getString(f63233i, null);
            if (!TextUtils.isEmpty(string)) {
                try {
                    this.f63252m = new JSONObject(string);
                } catch (JSONException unused) {
                }
            }
            if (this.f63252m == null) {
                this.f63252m = new JSONObject();
            }
        } catch (Throwable unused2) {
        }
    }

    public JSONObject b() {
        return this.f63250k;
    }

    public JSONObject c() {
        return this.f63252m;
    }

    public JSONObject d() {
        return this.f63251l;
    }

    public void e() {
        this.f63251l = null;
    }

    public String f() {
        if (!UMUtils.isMainProgress(f63231a)) {
            MLog.e("getOnResumedActivityName can not be called in child process");
            return null;
        }
        return f63236q;
    }

    public String g() {
        if (!UMUtils.isMainProgress(f63231a)) {
            MLog.e("getOnPausedActivityName can not be called in child process");
            return null;
        }
        return f63237r;
    }

    public void h() {
        try {
            Context context = f63231a;
            if (context != null) {
                if (!UMUtils.isMainProgress(context)) {
                    MLog.e("onStartSessionInternal can not be called in child process");
                    return;
                }
                long currentTimeMillis = System.currentTimeMillis();
                Context context2 = f63231a;
                UMWorkDispatch.sendEvent(context2, 4352, CoreProtocol.getInstance(context2), Long.valueOf(currentTimeMillis));
                Context context3 = f63231a;
                UMWorkDispatch.sendEvent(context3, q.a.f63894g, CoreProtocol.getInstance(context3), Long.valueOf(currentTimeMillis));
            }
            ISysListener iSysListener = this.f63243b;
            if (iSysListener != null) {
                iSysListener.onAppResume();
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void j() {
        try {
            Context context = f63231a;
            if (context == null) {
                return;
            }
            if (!UMUtils.isMainProgress(context)) {
                MLog.e("onProfileSignOff can not be called in child process");
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ts", currentTimeMillis);
            Context context2 = f63231a;
            UMWorkDispatch.sendEvent(context2, q.a.f63893f, CoreProtocol.getInstance(context2), jSONObject);
            Context context3 = f63231a;
            UMWorkDispatch.sendEvent(context3, 4356, CoreProtocol.getInstance(context3), jSONObject);
        } catch (Throwable th) {
            if (MLog.DEBUG) {
                MLog.e(" Excepthon  in  onProfileSignOff", th);
            }
        }
    }

    public synchronized void k() {
        Context context;
        try {
            context = f63231a;
        } catch (Throwable unused) {
        }
        if (context == null) {
            return;
        }
        if (!UMUtils.isMainProgress(context)) {
            MLog.e("unregisterSuperPropertyByCoreProtocol can not be called in child process");
            return;
        }
        if (this.f63250k != null) {
            SharedPreferences.Editor edit = PreferenceWrapper.getDefault(f63231a).edit();
            edit.putString(f63232h, this.f63250k.toString());
            edit.commit();
        } else {
            this.f63250k = new JSONObject();
        }
    }

    public synchronized JSONObject l() {
        Context context;
        try {
            context = f63231a;
        } catch (Throwable unused) {
        }
        if (context == null) {
            return null;
        }
        if (!UMUtils.isMainProgress(context)) {
            MLog.e("getSuperPropertiesJSONObject can not be called in child process");
            return null;
        }
        if (this.f63250k == null) {
            this.f63250k = new JSONObject();
        }
        return this.f63250k;
    }

    public synchronized void m() {
        try {
            Context context = f63231a;
            if (context != null) {
                if (!UMUtils.isMainProgress(context)) {
                    MLog.e("clearSuperPropertiesByCoreProtocol can not be called in child process");
                    return;
                }
                SharedPreferences.Editor edit = PreferenceWrapper.getDefault(f63231a).edit();
                edit.remove(f63232h);
                edit.commit();
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.umeng.analytics.pro.p
    public void n() {
        UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> onIntoBackground triggered.");
        if (AnalyticsConfig.enable && FieldManager.b()) {
            if (FieldManager.allow(d.D)) {
                if (UMWorkDispatch.eventHasExist(q.a.B)) {
                    return;
                }
                UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> 退出时发送策略 被触发！");
                Context context = f63231a;
                UMWorkDispatch.sendEvent(context, q.a.B, CoreProtocol.getInstance(context), null);
                return;
            }
            UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> 退出发送策略: 云控控制字关闭。功能不生效");
        }
    }

    private b() {
        this.f63244c = new r();
        this.f63245d = new x();
        this.f63246e = new m();
        this.f63247f = w.a();
        this.f63248g = null;
        this.f63249j = false;
        this.f63250k = null;
        this.f63251l = null;
        this.f63252m = null;
        this.f63253n = false;
        this.f63254u = null;
        this.f63255x = null;
        this.f63256y = null;
        this.f63244c.a(this);
    }

    private boolean e(String str) {
        if (this.f63254u.enabled() && this.f63254u.matchHit(str)) {
            return true;
        }
        if (this.f63255x.enabled()) {
            if (this.f63255x.matchHit(str)) {
                UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> white list match! id = " + str);
                return false;
            }
            return true;
        }
        return false;
    }

    public void a(Context context) {
        if (context == null) {
            return;
        }
        try {
            if (f63231a == null) {
                f63231a = context.getApplicationContext();
            }
            if (this.f63254u == null) {
                com.umeng.analytics.filter.a aVar = new com.umeng.analytics.filter.a(f63238s, "ekv_bl_ver");
                this.f63254u = aVar;
                aVar.register(f63231a);
            }
            if (this.f63255x == null) {
                com.umeng.analytics.filter.b bVar = new com.umeng.analytics.filter.b(f63240v, "ekv_wl_ver");
                this.f63255x = bVar;
                bVar.register(f63231a);
            }
            if (UMUtils.isMainProgress(f63231a)) {
                if (!this.f63249j) {
                    this.f63249j = true;
                    i(f63231a);
                }
                if (Build.VERSION.SDK_INT > 13) {
                    synchronized (this) {
                        if (!this.f63253n) {
                            n a5 = n.a(context);
                            this.f63248g = a5;
                            if (a5.a()) {
                                this.f63253n = true;
                            }
                            this.f63256y = o.a();
                            try {
                                o.a(context);
                                this.f63256y.a(this);
                            } catch (Throwable unused) {
                            }
                        }
                    }
                } else {
                    this.f63253n = true;
                }
                if (UMConfigure.isDebugLog()) {
                    UMLog.mutlInfo(l.B, 3, "", null, null);
                }
                UMWorkDispatch.registerConnStateObserver(CoreProtocol.getInstance(f63231a));
            }
        } catch (Throwable unused2) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(String str) {
        if (!UMUtils.isMainProgress(f63231a)) {
            MLog.e("onPageEnd can not be called in child process");
            return;
        }
        try {
            if (UMConfigure.AUTO_ACTIVITY_PAGE_COLLECTION != MobclickAgent.PageMode.LEGACY_AUTO) {
                this.f63245d.b(str);
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(Context context) {
        if (context == null) {
            UMLog.aq(l.f63824p, 0, "\\|");
        } else if (UMConfigure.AUTO_ACTIVITY_PAGE_COLLECTION == MobclickAgent.PageMode.AUTO) {
        } else {
            if (f63231a == null) {
                f63231a = context.getApplicationContext();
            }
            if (!UMUtils.isMainProgress(f63231a)) {
                MLog.e("onPause can not be called in child process");
                return;
            }
            if (UMConfigure.isDebugLog() && !(context instanceof Activity)) {
                UMLog.aq(l.f63825q, 2, "\\|");
            }
            try {
                if (!this.f63249j || !this.f63253n) {
                    a(context);
                }
                if (UMConfigure.AUTO_ACTIVITY_PAGE_COLLECTION != MobclickAgent.PageMode.LEGACY_MANUAL) {
                    this.f63246e.b(context.getClass().getName());
                }
                i();
            } catch (Throwable th) {
                if (MLog.DEBUG) {
                    MLog.e("Exception occurred in Mobclick.onRause(). ", th);
                }
            }
            if (UMConfigure.isDebugLog() && (context instanceof Activity)) {
                f63237r = context.getClass().getName();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(Context context) {
        if (context == null) {
            return;
        }
        try {
            if (f63231a == null) {
                f63231a = context.getApplicationContext();
            }
            if (!UMUtils.isMainProgress(f63231a)) {
                MLog.e("onKillProcess can not be called in child process");
                return;
            }
            n nVar = this.f63248g;
            if (nVar != null) {
                nVar.c();
            }
            n.a(context, "onKillProcess");
            m mVar = this.f63246e;
            if (mVar != null) {
                mVar.b();
            }
            x xVar = this.f63245d;
            if (xVar != null) {
                xVar.b();
            }
            Context context2 = f63231a;
            if (context2 != null) {
                w wVar = this.f63247f;
                if (wVar != null) {
                    wVar.c(context2, Long.valueOf(System.currentTimeMillis()));
                }
                q.a(f63231a).d();
                x.a(f63231a);
                if (UMConfigure.AUTO_ACTIVITY_PAGE_COLLECTION == MobclickAgent.PageMode.AUTO) {
                    n.c(f63231a);
                }
                PreferenceWrapper.getDefault(f63231a).edit().commit();
            }
        } catch (Throwable unused) {
        }
    }

    public synchronized void f(Context context) {
        if (context == null) {
            UMLog.aq(l.ah, 0, "\\|");
            return;
        }
        if (f63231a == null) {
            f63231a = context.getApplicationContext();
        }
        if (!UMUtils.isMainProgress(f63231a)) {
            MLog.e("clearSuperProperties can not be called in child process");
            return;
        }
        if (!this.f63249j || !this.f63253n) {
            a(f63231a);
        }
        this.f63250k = new JSONObject();
        Context context2 = f63231a;
        UMWorkDispatch.sendEvent(context2, q.a.f63908u, CoreProtocol.getInstance(context2), null);
    }

    public synchronized void g(Context context) {
        if (context == null) {
            UMLog.aq(l.ap, 0, "\\|");
            return;
        }
        if (f63231a == null) {
            f63231a = context.getApplicationContext();
        }
        if (!UMUtils.isMainProgress(f63231a)) {
            MLog.e("clearPreProperties can not be called in child process");
            return;
        }
        if (!this.f63249j || !this.f63253n) {
            a(f63231a);
        }
        if (this.f63252m.length() > 0) {
            Context context2 = f63231a;
            UMWorkDispatch.sendEvent(context2, q.a.f63912y, CoreProtocol.getInstance(context2), null);
        }
        this.f63252m = new JSONObject();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(Context context) {
        if (context == null) {
            MLog.e("unexpected null context in onResume");
        } else if (UMConfigure.AUTO_ACTIVITY_PAGE_COLLECTION == MobclickAgent.PageMode.AUTO) {
        } else {
            if (f63231a == null) {
                f63231a = context.getApplicationContext();
            }
            if (!UMUtils.isMainProgress(f63231a)) {
                MLog.e("onResume can not be called in child process");
                return;
            }
            if (UMConfigure.isDebugLog() && !(context instanceof Activity)) {
                UMLog.aq(l.f63823o, 2, "\\|");
            }
            try {
                if (!this.f63249j || !this.f63253n) {
                    a(context);
                }
                if (UMConfigure.AUTO_ACTIVITY_PAGE_COLLECTION != MobclickAgent.PageMode.LEGACY_MANUAL) {
                    this.f63246e.a(context.getClass().getName());
                }
                h();
                if (UMConfigure.isDebugLog() && (context instanceof Activity)) {
                    f63236q = context.getClass().getName();
                }
            } catch (Throwable th) {
                MLog.e("Exception occurred in Mobclick.onResume(). ", th);
            }
        }
    }

    public synchronized Object e(Context context, String str) {
        if (context == null) {
            UMLog.aq(l.ai, 0, "\\|");
            return null;
        }
        if (f63231a == null) {
            f63231a = context.getApplicationContext();
        }
        if (!UMUtils.isMainProgress(f63231a)) {
            MLog.e("getSuperProperty can not be called in child process");
            return null;
        } else if (TextUtils.isEmpty(str)) {
            UMLog.aq(l.ag, 0, "\\|");
            return null;
        } else if (!str.equals(f63242z) && !str.equals(A) && !str.equals(B) && !str.equals(C) && !str.equals(D)) {
            MLog.e("please check key or value, must be correct!");
            return null;
        } else {
            if (this.f63250k != null) {
                if (this.f63250k.has(str)) {
                    return this.f63250k.opt(str);
                }
            } else {
                this.f63250k = new JSONObject();
            }
            return null;
        }
    }

    public synchronized JSONObject h(Context context) {
        if (context == null) {
            UMLog.aq(l.aq, 0, "\\|");
            return null;
        }
        if (f63231a == null) {
            f63231a = context.getApplicationContext();
        }
        if (!UMUtils.isMainProgress(f63231a)) {
            MLog.e("getPreProperties can not be called in child process");
            return null;
        }
        if (!this.f63249j || !this.f63253n) {
            a(f63231a);
        }
        if (this.f63252m == null) {
            this.f63252m = new JSONObject();
        }
        JSONObject jSONObject = new JSONObject();
        if (this.f63252m.length() > 0) {
            try {
                jSONObject = new JSONObject(this.f63252m.toString());
            } catch (JSONException unused) {
            }
        }
        return jSONObject;
    }

    public void i() {
        try {
            Context context = f63231a;
            if (context != null) {
                if (!UMUtils.isMainProgress(context)) {
                    MLog.e("onEndSessionInternal can not be called in child process");
                    return;
                }
                Context context2 = f63231a;
                UMWorkDispatch.sendEvent(context2, q.a.f63895h, CoreProtocol.getInstance(context2), Long.valueOf(System.currentTimeMillis()));
                Context context3 = f63231a;
                UMWorkDispatch.sendEvent(context3, q.a.f63891d, CoreProtocol.getInstance(context3), null);
                Context context4 = f63231a;
                UMWorkDispatch.sendEvent(context4, 4099, CoreProtocol.getInstance(context4), null);
                Context context5 = f63231a;
                UMWorkDispatch.sendEvent(context5, q.a.f63896i, CoreProtocol.getInstance(context5), null);
            }
        } catch (Throwable unused) {
        }
        ISysListener iSysListener = this.f63243b;
        if (iSysListener != null) {
            iSysListener.onAppPause();
        }
    }

    public synchronized void f(Context context, String str) {
        if (context == null) {
            UMLog.aq(l.an, 0, "\\|");
            return;
        }
        if (f63231a == null) {
            f63231a = context.getApplicationContext();
        }
        if (!UMUtils.isMainProgress(f63231a)) {
            MLog.e("unregisterPreProperty can not be called in child process");
            return;
        }
        if (!this.f63249j || !this.f63253n) {
            a(f63231a);
        }
        if (this.f63252m == null) {
            this.f63252m = new JSONObject();
        }
        if (str != null && str.length() > 0) {
            if (this.f63252m.has(str)) {
                this.f63252m.remove(str);
                Context context2 = f63231a;
                UMWorkDispatch.sendEvent(context2, q.a.f63911x, CoreProtocol.getInstance(context2), this.f63252m.toString());
            } else if (UMConfigure.isDebugLog()) {
                UMLog.aq(l.ao, 0, "\\|");
            }
            return;
        }
        MLog.e("please check propertics, property is null!");
    }

    private boolean g(String str) {
        if (str != null) {
            try {
                int length = str.trim().getBytes().length;
                if (length >= 0 && length < 256) {
                    return true;
                }
            } catch (Throwable unused) {
            }
        }
        MLog.e("The length of profile value must be less than 256 bytes.");
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(Context context, String str) {
        if (context == null) {
            UMLog.aq(l.f63834z, 0, "\\|");
            return;
        }
        if (f63231a == null) {
            f63231a = context.getApplicationContext();
        }
        if (!UMUtils.isMainProgress(f63231a)) {
            MLog.e("setSecret can not be called in child process");
            return;
        }
        if (!this.f63249j || !this.f63253n) {
            a(f63231a);
        }
        AnalyticsConfig.a(f63231a, str);
    }

    public synchronized void d(Context context, String str) {
        try {
        } catch (Throwable th) {
            th.printStackTrace();
        }
        if (context == null) {
            UMLog.aq(l.ah, 0, "\\|");
            return;
        }
        if (f63231a == null) {
            f63231a = context.getApplicationContext();
        }
        if (!UMUtils.isMainProgress(f63231a)) {
            MLog.e("unregisterSuperProperty can not be called in child process");
            return;
        }
        if (!this.f63249j || !this.f63253n) {
            a(f63231a);
        }
        if (TextUtils.isEmpty(str)) {
            UMLog.aq(l.ag, 0, "\\|");
        } else if (!str.equals(f63242z) && !str.equals(A) && !str.equals(B) && !str.equals(C) && !str.equals(D)) {
            MLog.e("please check key or value, must be correct!");
        } else {
            if (this.f63250k == null) {
                this.f63250k = new JSONObject();
            }
            if (this.f63250k.has(str)) {
                this.f63250k.remove(str);
                Context context2 = f63231a;
                UMWorkDispatch.sendEvent(context2, q.a.f63909v, CoreProtocol.getInstance(context2), str);
            }
        }
    }

    public void b(Context context, String str) {
        try {
            if (context == null) {
                UMLog.aq(l.N, 0, "\\|");
                return;
            }
            if (f63231a == null) {
                f63231a = context.getApplicationContext();
            }
            if (!UMUtils.isMainProgress(f63231a)) {
                MLog.e("onDeepLinkReceived can not be called in child process");
                return;
            }
            if (!this.f63249j || !this.f63253n) {
                a(f63231a);
            }
            if (!TextUtils.isEmpty(str)) {
                HashMap hashMap = new HashMap();
                hashMap.put(f.aK, str);
                a(f63231a, f.aJ, (Map<String, Object>) hashMap, -1L, false);
                return;
            }
            UMLog.aq(l.O, 0, "\\|");
        } catch (Throwable th) {
            if (MLog.DEBUG) {
                MLog.e(th);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(String str) {
        if (!UMUtils.isMainProgress(f63231a)) {
            MLog.e("onPageStart can not be called in child process");
            return;
        }
        try {
            if (UMConfigure.AUTO_ACTIVITY_PAGE_COLLECTION != MobclickAgent.PageMode.LEGACY_AUTO) {
                this.f63245d.a(str);
            }
        } catch (Throwable unused) {
        }
    }

    private boolean c(String str, Object obj) {
        int i4;
        if (TextUtils.isEmpty(str)) {
            MLog.e("key is " + str + ", please check key, illegal");
            return false;
        }
        try {
            i4 = str.getBytes("UTF-8").length;
        } catch (UnsupportedEncodingException unused) {
            i4 = 0;
        }
        if (i4 > 128) {
            MLog.e("key length is " + i4 + ", please check key, illegal");
            return false;
        } else if (obj instanceof String) {
            if (((String) obj).getBytes("UTF-8").length > 256) {
                MLog.e("value length is " + ((String) obj).getBytes("UTF-8").length + ", please check value, illegal");
                return false;
            }
            return true;
        } else if ((obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Double) || (obj instanceof Float)) {
            return true;
        } else {
            MLog.e("value is " + obj + ", please check value, type illegal");
            return false;
        }
    }

    public synchronized String e(Context context) {
        if (context == null) {
            UMLog.aq(l.ai, 0, "\\|");
            return null;
        }
        if (f63231a == null) {
            f63231a = context.getApplicationContext();
        }
        if (!UMUtils.isMainProgress(f63231a)) {
            MLog.e("getSuperProperties can not be called in child process");
            return null;
        } else if (this.f63250k != null) {
            return this.f63250k.toString();
        } else {
            this.f63250k = new JSONObject();
            return null;
        }
    }

    public void a(ISysListener iSysListener) {
        if (!UMUtils.isMainProgress(f63231a)) {
            MLog.e("setSysListener can not be called in child process");
        } else {
            this.f63243b = iSysListener;
        }
    }

    public void a(Context context, int i4) {
        if (context == null) {
            MLog.e("unexpected null context in setVerticalType");
            return;
        }
        if (f63231a == null) {
            f63231a = context.getApplicationContext();
        }
        if (!UMUtils.isMainProgress(f63231a)) {
            MLog.e("setVerticalType can not be called in child process");
            return;
        }
        if (!this.f63249j || !this.f63253n) {
            a(f63231a);
        }
        AnalyticsConfig.a(f63231a, i4);
    }

    private void b(String str, Object obj) {
        try {
            if (this.f63250k == null) {
                this.f63250k = new JSONObject();
            }
            int i4 = 0;
            if (obj.getClass().isArray()) {
                if (obj instanceof String[]) {
                    String[] strArr = (String[]) obj;
                    if (strArr.length > 10) {
                        return;
                    }
                    JSONArray jSONArray = new JSONArray();
                    while (i4 < strArr.length) {
                        if (strArr[i4] != null && !HelperUtils.checkStrLen(strArr[i4], 256)) {
                            jSONArray.put(strArr[i4]);
                        }
                        i4++;
                    }
                    this.f63250k.put(str, jSONArray);
                } else if (obj instanceof long[]) {
                    long[] jArr = (long[]) obj;
                    JSONArray jSONArray2 = new JSONArray();
                    while (i4 < jArr.length) {
                        jSONArray2.put(jArr[i4]);
                        i4++;
                    }
                    this.f63250k.put(str, jSONArray2);
                } else if (obj instanceof int[]) {
                    int[] iArr = (int[]) obj;
                    JSONArray jSONArray3 = new JSONArray();
                    while (i4 < iArr.length) {
                        jSONArray3.put(iArr[i4]);
                        i4++;
                    }
                    this.f63250k.put(str, jSONArray3);
                } else if (obj instanceof float[]) {
                    float[] fArr = (float[]) obj;
                    JSONArray jSONArray4 = new JSONArray();
                    while (i4 < fArr.length) {
                        jSONArray4.put(fArr[i4]);
                        i4++;
                    }
                    this.f63250k.put(str, jSONArray4);
                } else if (obj instanceof double[]) {
                    double[] dArr = (double[]) obj;
                    JSONArray jSONArray5 = new JSONArray();
                    while (i4 < dArr.length) {
                        jSONArray5.put(dArr[i4]);
                        i4++;
                    }
                    this.f63250k.put(str, jSONArray5);
                } else if (obj instanceof short[]) {
                    short[] sArr = (short[]) obj;
                    JSONArray jSONArray6 = new JSONArray();
                    while (i4 < sArr.length) {
                        jSONArray6.put((int) sArr[i4]);
                        i4++;
                    }
                    this.f63250k.put(str, jSONArray6);
                }
            } else if (obj instanceof List) {
                List list = (List) obj;
                JSONArray jSONArray7 = new JSONArray();
                while (i4 < list.size()) {
                    Object obj2 = list.get(i4);
                    if ((obj2 instanceof String) || (obj2 instanceof Long) || (obj2 instanceof Integer) || (obj2 instanceof Float) || (obj2 instanceof Double) || (obj2 instanceof Short)) {
                        jSONArray7.put(list.get(i4));
                    }
                    i4++;
                }
                this.f63250k.put(str, jSONArray7);
            } else if ((obj instanceof String) || (obj instanceof Long) || (obj instanceof Integer) || (obj instanceof Float) || (obj instanceof Double) || (obj instanceof Short)) {
                this.f63250k.put(str, obj);
            }
        } catch (Throwable unused) {
        }
    }

    private boolean f(String str) {
        if (str != null) {
            try {
                int length = str.trim().getBytes().length;
                if (length > 0 && length < 128) {
                    return true;
                }
            } catch (Throwable unused) {
            }
        }
        MLog.e("The length of profile key must be less than 128 bytes.");
        return false;
    }

    public void c(String str) {
        if (g(str)) {
            a(f.O, (Object) str);
        }
    }

    public void a(Context context, String str, HashMap<String, Object> hashMap) {
        if (context == null) {
            return;
        }
        try {
            if (f63231a == null) {
                f63231a = context.getApplicationContext();
            }
            if (!UMUtils.isMainProgress(f63231a)) {
                MLog.e("onGKVEvent can not be called in child process");
                return;
            }
            if (!this.f63249j || !this.f63253n) {
                a(f63231a);
            }
            String str2 = "";
            if (this.f63250k == null) {
                this.f63250k = new JSONObject();
            } else {
                str2 = this.f63250k.toString();
            }
            u.a(f63231a).a(str, hashMap, str2);
        } catch (Throwable th) {
            if (MLog.DEBUG) {
                MLog.e(th);
            }
        }
    }

    public void d(String str) {
        if (g(str)) {
            a(f.P, (Object) str);
        }
    }

    void a(Context context, String str) {
        if (context == null) {
            UMLog.aq(l.f63831w, 0, "\\|");
            return;
        }
        if (f63231a == null) {
            f63231a = context.getApplicationContext();
        }
        if (!UMUtils.isMainProgress(f63231a)) {
            MLog.e("reportError can not be called in child process");
        } else if (TextUtils.isEmpty(str)) {
            if (UMConfigure.isDebugLog()) {
                UMLog.aq(l.f63832x, 0, "\\|");
            }
        } else {
            try {
                if (!this.f63249j || !this.f63253n) {
                    a(f63231a);
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("ts", System.currentTimeMillis());
                jSONObject.put(f.W, 2);
                jSONObject.put("context", str);
                jSONObject.put("__ii", this.f63247f.c());
                Context context2 = f63231a;
                UMWorkDispatch.sendEvent(context2, q.a.f63897j, CoreProtocol.getInstance(context2), jSONObject);
            } catch (Throwable th) {
                if (MLog.DEBUG) {
                    MLog.e(th);
                }
            }
        }
    }

    void a(Context context, Throwable th) {
        if (context != null && th != null) {
            if (f63231a == null) {
                f63231a = context.getApplicationContext();
            }
            if (!UMUtils.isMainProgress(f63231a)) {
                MLog.e("reportError can not be called in child process");
                return;
            }
            try {
                if (!this.f63249j || !this.f63253n) {
                    a(f63231a);
                }
                a(f63231a, DataHelper.convertExceptionToString(th));
                return;
            } catch (Exception e5) {
                if (MLog.DEBUG) {
                    MLog.e(e5);
                    return;
                }
                return;
            }
        }
        UMLog.aq(l.f63833y, 0, "\\|");
    }

    public void a(Context context, String str, String str2, long j4, int i4) {
        if (context == null) {
            return;
        }
        try {
            if (f63231a == null) {
                f63231a = context.getApplicationContext();
            }
            if (!this.f63249j || !this.f63253n) {
                a(f63231a);
            }
            if (e(str)) {
                UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> filter ekv [" + str + "].");
                return;
            }
            String str3 = "";
            if (this.f63250k == null) {
                this.f63250k = new JSONObject();
            } else {
                str3 = this.f63250k.toString();
            }
            u.a(f63231a).a(str, str2, j4, i4, str3);
        } catch (Throwable th) {
            if (MLog.DEBUG) {
                MLog.e(th);
            }
        }
    }

    public synchronized void b(Object obj) {
        Context context;
        try {
            context = f63231a;
        } catch (Throwable unused) {
        }
        if (context == null) {
            return;
        }
        if (!UMUtils.isMainProgress(context)) {
            MLog.e("updateNativePrePropertiesByCoreProtocol can not be called in child process");
            return;
        }
        SharedPreferences.Editor edit = PreferenceWrapper.getDefault(f63231a).edit();
        if (obj != null) {
            String str = (String) obj;
            if (edit != null && !TextUtils.isEmpty(str)) {
                edit.putString(f63233i, str).commit();
            }
        } else if (edit != null) {
            edit.remove(f63233i).commit();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(Context context, String str, Map<String, Object> map, long j4) {
        try {
        } catch (Throwable th) {
            if (MLog.DEBUG) {
                MLog.e(th);
            }
        }
        if (!TextUtils.isEmpty(str)) {
            if (Arrays.asList(f.aL).contains(str)) {
                UMLog.aq(l.f63810b, 0, "\\|");
                return;
            } else if (map.isEmpty()) {
                UMLog.aq(l.f63812d, 0, "\\|");
                return;
            } else {
                for (Map.Entry<String, Object> entry : map.entrySet()) {
                    if (Arrays.asList(f.aL).contains(entry.getKey())) {
                        UMLog.aq(l.f63813e, 0, "\\|");
                        return;
                    }
                }
                a(context, str, map, j4, false);
                return;
            }
        }
        UMLog.aq(l.f63811c, 0, "\\|");
    }

    public void a(Context context, String str, Map<String, Object> map) {
        a(context, str, map, -1L, true);
    }

    private void a(Context context, String str, Map<String, Object> map, long j4, boolean z4) {
        try {
            if (context == null) {
                MLog.e("context is null in onEventNoCheck, please check!");
                return;
            }
            if (f63231a == null) {
                f63231a = context.getApplicationContext();
            }
            if (!this.f63249j || !this.f63253n) {
                a(f63231a);
            }
            if (e(str)) {
                UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> filter ekv [" + str + "].");
                return;
            }
            String str2 = "";
            if (this.f63250k == null) {
                this.f63250k = new JSONObject();
            } else {
                str2 = this.f63250k.toString();
            }
            u.a(f63231a).a(str, map, j4, str2, z4);
        } catch (Throwable th) {
            if (MLog.DEBUG) {
                MLog.e(th);
            }
        }
    }

    @Override // com.umeng.analytics.pro.v
    public void a(Throwable th) {
        try {
            Context context = f63231a;
            if (context == null) {
                return;
            }
            if (!UMUtils.isMainProgress(context)) {
                MLog.e("onAppCrash can not be called in child process");
            } else if (AnalyticsConfig.enable) {
                x xVar = this.f63245d;
                if (xVar != null) {
                    xVar.b();
                }
                n.a(f63231a, "onAppCrash");
                m mVar = this.f63246e;
                if (mVar != null) {
                    mVar.b();
                }
                n nVar = this.f63248g;
                if (nVar != null) {
                    nVar.c();
                }
                w wVar = this.f63247f;
                if (wVar != null) {
                    wVar.c(f63231a, Long.valueOf(System.currentTimeMillis()));
                }
                if (th != null) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("ts", System.currentTimeMillis());
                    jSONObject.put(f.W, 1);
                    jSONObject.put("context", DataHelper.convertExceptionToString(th));
                    k.a(f63231a).a(this.f63247f.c(), jSONObject.toString(), 1);
                }
                q.a(f63231a).d();
                x.a(f63231a);
                if (UMConfigure.AUTO_ACTIVITY_PAGE_COLLECTION == MobclickAgent.PageMode.AUTO) {
                    n.c(f63231a);
                }
                PreferenceWrapper.getDefault(f63231a).edit().commit();
            }
        } catch (Exception e5) {
            if (MLog.DEBUG) {
                MLog.e("Exception in onAppCrash", e5);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(String str, String str2) {
        try {
            Context context = f63231a;
            if (context == null) {
                return;
            }
            if (!UMUtils.isMainProgress(context)) {
                MLog.e("onProfileSignIn can not be called in child process");
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(f.M, str);
            jSONObject.put("uid", str2);
            jSONObject.put("ts", currentTimeMillis);
            Context context2 = f63231a;
            UMWorkDispatch.sendEvent(context2, q.a.f63892e, CoreProtocol.getInstance(context2), jSONObject);
            Context context3 = f63231a;
            UMWorkDispatch.sendEvent(context3, 4356, CoreProtocol.getInstance(context3), jSONObject);
        } catch (Throwable th) {
            if (MLog.DEBUG) {
                MLog.e(" Excepthon  in  onProfileSignIn", th);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(boolean z4) {
        Context context = f63231a;
        if (context == null) {
            return;
        }
        if (!UMUtils.isMainProgress(context)) {
            MLog.e("setCatchUncaughtExceptions can not be called in child process");
        } else if (AnalyticsConfig.CHANGE_CATCH_EXCEPTION_NOTALLOW) {
        } else {
            AnalyticsConfig.CATCH_EXCEPTION = z4;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(GL10 gl10) {
        String[] gpu = UMUtils.getGPU(gl10);
        if (gpu.length == 2) {
            AnalyticsConfig.GPU_VENDER = gpu[0];
            AnalyticsConfig.GPU_RENDERER = gpu[1];
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(double d5, double d6) {
        Context context = f63231a;
        if (context == null) {
            return;
        }
        if (!UMUtils.isMainProgress(context)) {
            MLog.e("setLocation can not be called in child process");
            return;
        }
        if (AnalyticsConfig.f63208a == null) {
            AnalyticsConfig.f63208a = new double[2];
        }
        double[] dArr = AnalyticsConfig.f63208a;
        dArr[0] = d5;
        dArr[1] = d6;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(Context context, MobclickAgent.EScenarioType eScenarioType) {
        if (context == null) {
            MLog.e("unexpected null context in setScenarioType");
            return;
        }
        if (f63231a == null) {
            f63231a = context.getApplicationContext();
        }
        if (!UMUtils.isMainProgress(f63231a)) {
            MLog.e("setScenarioType can not be called in child process");
            return;
        }
        if (eScenarioType != null) {
            a(f63231a, eScenarioType.toValue());
        }
        if (this.f63249j && this.f63253n) {
            return;
        }
        a(f63231a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(long j4) {
        Context context = f63231a;
        if (context == null) {
            return;
        }
        if (!UMUtils.isMainProgress(context)) {
            MLog.e("setSessionContinueMillis can not be called in child process");
            return;
        }
        AnalyticsConfig.kContinueSessionMillis = j4;
        aa.a().a(AnalyticsConfig.kContinueSessionMillis);
    }

    public synchronized void a(Context context, String str, Object obj) {
        int i4 = 0;
        if (context == null) {
            UMLog.aq(l.af, 0, "\\|");
            return;
        }
        if (f63231a == null) {
            f63231a = context.getApplicationContext();
        }
        if (!UMUtils.isMainProgress(f63231a)) {
            MLog.e("registerSuperProperty can not be called in child process");
            return;
        }
        if (!this.f63249j || !this.f63253n) {
            a(f63231a);
        }
        if (!TextUtils.isEmpty(str) && obj != null) {
            if (!str.equals(f63242z) && !str.equals(A) && !str.equals(B) && !str.equals(C) && !str.equals(D)) {
                MLog.e("property name is " + str + ", please check key, must be correct!");
                return;
            } else if ((obj instanceof String) && !HelperUtils.checkStrLen(obj.toString(), 256)) {
                MLog.e("property value is " + obj + ", please check value, lawless!");
                return;
            } else {
                try {
                    if (this.f63250k == null) {
                        this.f63250k = new JSONObject();
                    }
                    if (obj.getClass().isArray()) {
                        if (obj instanceof String[]) {
                            String[] strArr = (String[]) obj;
                            if (strArr.length > 10) {
                                MLog.e("please check value, size is " + strArr.length + ", overstep 10!");
                                return;
                            }
                            JSONArray jSONArray = new JSONArray();
                            while (i4 < strArr.length) {
                                if (strArr[i4] != null && HelperUtils.checkStrLen(strArr[i4], 256)) {
                                    jSONArray.put(strArr[i4]);
                                    i4++;
                                }
                                MLog.e("please check value, length is " + strArr[i4].length() + ", overlength 256!");
                                return;
                            }
                            this.f63250k.put(str, jSONArray);
                        } else if (obj instanceof long[]) {
                            long[] jArr = (long[]) obj;
                            if (jArr.length > 10) {
                                MLog.e("please check value, size is " + jArr.length + ", overstep 10!");
                                return;
                            }
                            JSONArray jSONArray2 = new JSONArray();
                            while (i4 < jArr.length) {
                                jSONArray2.put(jArr[i4]);
                                i4++;
                            }
                            this.f63250k.put(str, jSONArray2);
                        } else if (obj instanceof int[]) {
                            int[] iArr = (int[]) obj;
                            if (iArr.length > 10) {
                                MLog.e("please check value, size is " + iArr.length + ", overstep 10!");
                                return;
                            }
                            JSONArray jSONArray3 = new JSONArray();
                            while (i4 < iArr.length) {
                                jSONArray3.put(iArr[i4]);
                                i4++;
                            }
                            this.f63250k.put(str, jSONArray3);
                        } else if (obj instanceof float[]) {
                            float[] fArr = (float[]) obj;
                            if (fArr.length > 10) {
                                MLog.e("please check value, size is " + fArr.length + ", overstep 10!");
                                return;
                            }
                            JSONArray jSONArray4 = new JSONArray();
                            while (i4 < fArr.length) {
                                jSONArray4.put(fArr[i4]);
                                i4++;
                            }
                            this.f63250k.put(str, jSONArray4);
                        } else if (obj instanceof double[]) {
                            double[] dArr = (double[]) obj;
                            if (dArr.length > 10) {
                                MLog.e("please check value, size is " + dArr.length + ", overstep 10!");
                                return;
                            }
                            JSONArray jSONArray5 = new JSONArray();
                            while (i4 < dArr.length) {
                                jSONArray5.put(dArr[i4]);
                                i4++;
                            }
                            this.f63250k.put(str, jSONArray5);
                        } else if (obj instanceof short[]) {
                            short[] sArr = (short[]) obj;
                            if (sArr.length > 10) {
                                MLog.e("please check value, size is " + sArr.length + ", overstep 10!");
                                return;
                            }
                            JSONArray jSONArray6 = new JSONArray();
                            while (i4 < sArr.length) {
                                jSONArray6.put((int) sArr[i4]);
                                i4++;
                            }
                            this.f63250k.put(str, jSONArray6);
                        } else {
                            MLog.e("please check value, illegal type!");
                            return;
                        }
                    } else {
                        if (!(obj instanceof String) && !(obj instanceof Long) && !(obj instanceof Integer) && !(obj instanceof Float) && !(obj instanceof Double) && !(obj instanceof Short)) {
                            MLog.e("please check value, illegal type!");
                            return;
                        }
                        this.f63250k.put(str, obj);
                    }
                } catch (Throwable unused) {
                }
                Context context2 = f63231a;
                UMWorkDispatch.sendEvent(context2, q.a.f63907t, CoreProtocol.getInstance(context2), this.f63250k.toString());
                return;
            }
        }
        UMLog.aq(l.ag, 0, "\\|");
    }

    public synchronized void a(Object obj) {
        Context context;
        try {
            context = f63231a;
        } catch (Throwable unused) {
        }
        if (context == null) {
            return;
        }
        if (!UMUtils.isMainProgress(context)) {
            MLog.e("registerSuperPropertyByCoreProtocol can not be called in child process");
            return;
        }
        if (obj != null) {
            String str = (String) obj;
            SharedPreferences.Editor edit = PreferenceWrapper.getDefault(f63231a).edit();
            if (edit != null && !TextUtils.isEmpty(str)) {
                edit.putString(f63232h, this.f63250k.toString()).commit();
            }
        }
    }

    public synchronized void a(Context context, List<String> list) {
        try {
        } catch (Throwable th) {
            MLog.e(th);
        }
        if (context == null) {
            UMLog.aq(l.aj, 0, "\\|");
            return;
        }
        if (f63231a == null) {
            f63231a = context.getApplicationContext();
        }
        if (!UMUtils.isMainProgress(f63231a)) {
            MLog.e("setFirstLaunchEvent can not be called in child process");
            return;
        }
        if (!this.f63249j || !this.f63253n) {
            a(f63231a);
        }
        u.a(f63231a).a(list);
    }

    public synchronized void a(Context context, JSONObject jSONObject) {
        String obj;
        Object obj2;
        if (context == null) {
            UMLog.aq(l.al, 0, "\\|");
            return;
        }
        if (f63231a == null) {
            f63231a = context.getApplicationContext();
        }
        if (!UMUtils.isMainProgress(f63231a)) {
            MLog.e("registerPreProperties can not be called in child process");
            return;
        }
        if (!this.f63249j || !this.f63253n) {
            a(f63231a);
        }
        if (this.f63252m == null) {
            this.f63252m = new JSONObject();
        }
        if (jSONObject != null && jSONObject.length() > 0) {
            JSONObject jSONObject2 = null;
            try {
                jSONObject2 = new JSONObject(this.f63252m.toString());
            } catch (Exception unused) {
            }
            if (jSONObject2 == null) {
                jSONObject2 = new JSONObject();
            }
            Iterator<String> keys = jSONObject.keys();
            if (keys != null) {
                while (keys.hasNext()) {
                    try {
                        obj = keys.next().toString();
                        obj2 = jSONObject.get(obj);
                    } catch (Exception unused2) {
                    }
                    if (c(obj, obj2)) {
                        jSONObject2.put(obj, obj2);
                        if (jSONObject2.length() > 10) {
                            MLog.e("please check propertics, size overlength!");
                            return;
                        }
                        continue;
                    } else {
                        return;
                    }
                }
            }
            this.f63252m = jSONObject2;
            if (this.f63252m.length() > 0) {
                Context context2 = f63231a;
                UMWorkDispatch.sendEvent(context2, q.a.f63910w, CoreProtocol.getInstance(context2), this.f63252m.toString());
            }
            return;
        }
        UMLog.aq(l.am, 0, "\\|");
    }

    public void a(String str, Object obj) {
        if (f(str)) {
            if (!(obj instanceof String) && !(obj instanceof Integer) && !(obj instanceof Long) && !(obj instanceof Short) && !(obj instanceof Float) && !(obj instanceof Double)) {
                MLog.e("userProfile: Invalid value type, please check!");
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(f.S, str);
                if (obj instanceof String) {
                    String str2 = (String) obj;
                    if (str2.length() > 0) {
                        str2 = str2.trim();
                    }
                    if (!g(str2)) {
                        return;
                    }
                    jSONObject.put(f.T, str2);
                } else {
                    jSONObject.put(f.T, obj);
                }
                Context context = f63231a;
                UMWorkDispatch.sendEvent(context, q.a.f63904q, CoreProtocol.getInstance(context), jSONObject);
            } catch (Throwable unused) {
            }
        }
    }
}
