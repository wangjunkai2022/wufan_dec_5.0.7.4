package com.umeng.analytics.pro;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.mediation.MediationConstant;
import com.join.mgps.Util.h0;
import com.join.mgps.activity.ForumPostsTagSelectActivity_;
import com.papa91.common.BaseAppConfig;
import com.umeng.analytics.MobclickAgent;
import com.umeng.analytics.pro.g;
import com.umeng.analytics.pro.k;
import com.umeng.analytics.vshelper.PageNameMonitor;
import com.umeng.commonsdk.UMConfigure;
import com.umeng.commonsdk.config.FieldManager;
import com.umeng.commonsdk.debug.UMLog;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.statistics.common.DeviceConfig;
import com.umeng.commonsdk.utils.UMUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: AutoViewPageTracker.java */
@TargetApi(14)
/* loaded from: classes6.dex */
public class n {

    /* renamed from: a  reason: collision with root package name */
    public static String f63835a;

    /* renamed from: b  reason: collision with root package name */
    boolean f63844b;

    /* renamed from: c  reason: collision with root package name */
    boolean f63845c;

    /* renamed from: f  reason: collision with root package name */
    com.umeng.analytics.vshelper.a f63846f;

    /* renamed from: g  reason: collision with root package name */
    Application.ActivityLifecycleCallbacks f63847g;

    /* renamed from: h  reason: collision with root package name */
    private final Map<String, Long> f63848h;

    /* renamed from: l  reason: collision with root package name */
    private boolean f63849l;

    /* renamed from: m  reason: collision with root package name */
    private int f63850m;

    /* renamed from: n  reason: collision with root package name */
    private int f63851n;

    /* renamed from: i  reason: collision with root package name */
    private static JSONArray f63838i = new JSONArray();

    /* renamed from: j  reason: collision with root package name */
    private static Object f63839j = new Object();

    /* renamed from: k  reason: collision with root package name */
    private static Application f63840k = null;

    /* renamed from: d  reason: collision with root package name */
    static String f63836d = null;

    /* renamed from: e  reason: collision with root package name */
    static int f63837e = -1;

    /* renamed from: o  reason: collision with root package name */
    private static boolean f63841o = true;

    /* renamed from: p  reason: collision with root package name */
    private static Object f63842p = new Object();

    /* renamed from: q  reason: collision with root package name */
    private static br f63843q = new com.umeng.analytics.vshelper.b();

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AutoViewPageTracker.java */
    /* loaded from: classes6.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private static final n f63853a = new n();

        private a() {
        }
    }

    static /* synthetic */ int a(n nVar) {
        int i4 = nVar.f63851n;
        nVar.f63851n = i4 - 1;
        return i4;
    }

    static /* synthetic */ int b(n nVar) {
        int i4 = nVar.f63850m;
        nVar.f63850m = i4 - 1;
        return i4;
    }

    static /* synthetic */ int e(n nVar) {
        int i4 = nVar.f63851n;
        nVar.f63851n = i4 + 1;
        return i4;
    }

    static /* synthetic */ int f(n nVar) {
        int i4 = nVar.f63850m;
        nVar.f63850m = i4 + 1;
        return i4;
    }

    private void g() {
        if (this.f63849l) {
            return;
        }
        this.f63849l = true;
        Application application = f63840k;
        if (application == null || Build.VERSION.SDK_INT < 14) {
            return;
        }
        application.registerActivityLifecycleCallbacks(this.f63847g);
    }

    private n() {
        this.f63848h = new HashMap();
        this.f63849l = false;
        this.f63844b = false;
        this.f63845c = false;
        this.f63850m = 0;
        this.f63851n = 0;
        this.f63846f = PageNameMonitor.getInstance();
        this.f63847g = new Application.ActivityLifecycleCallbacks() { // from class: com.umeng.analytics.pro.n.1
            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityCreated(Activity activity, Bundle bundle) {
                n.f63843q.a(activity, bundle);
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityDestroyed(Activity activity) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPaused(Activity activity) {
                if (FieldManager.allow(com.umeng.commonsdk.utils.d.F)) {
                    UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> onActivityPaused: FirstResumeTrigger enabled.");
                    synchronized (n.f63842p) {
                        if (n.f63841o) {
                            return;
                        }
                    }
                } else {
                    UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> onActivityPaused: FirstResumeTrigger disabled.");
                }
                if (UMConfigure.AUTO_ACTIVITY_PAGE_COLLECTION == MobclickAgent.PageMode.AUTO) {
                    n.this.c(activity);
                    com.umeng.analytics.b.a().i();
                    n.this.f63844b = false;
                    n.f63843q.d(activity);
                } else if (UMConfigure.AUTO_ACTIVITY_PAGE_COLLECTION == MobclickAgent.PageMode.MANUAL) {
                    com.umeng.analytics.b.a().i();
                }
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityResumed(Activity activity) {
                if (FieldManager.allow(com.umeng.commonsdk.utils.d.F)) {
                    UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> onActivityResumed: FirstResumeTrigger enabled.");
                    synchronized (n.f63842p) {
                        if (n.f63841o) {
                            boolean unused = n.f63841o = false;
                        }
                    }
                    n.this.a(activity);
                } else {
                    UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> onActivityResumed: FirstResumeTrigger disabled.");
                    n.this.a(activity);
                }
                n.f63843q.c(activity);
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityStarted(Activity activity) {
                if (activity != null) {
                    if (n.this.f63850m <= 0) {
                        if (n.f63836d == null) {
                            n.f63836d = UUID.randomUUID().toString();
                        }
                        if (n.f63837e == -1) {
                            n.f63837e = activity.isTaskRoot() ? 1 : 0;
                        }
                        if (n.f63837e == 0 && UMUtils.isMainProgress(activity)) {
                            HashMap hashMap = new HashMap();
                            hashMap.put(BaseAppConfig.KEY_ACTIVITY_NAME, activity.toString());
                            hashMap.put(ForumPostsTagSelectActivity_.f30896z, Integer.valueOf(Process.myPid()));
                            hashMap.put("isMainProcess", Integer.valueOf(UMUtils.isMainProgress(activity) ? 1 : 0));
                            com.umeng.analytics.b a5 = com.umeng.analytics.b.a();
                            if (a5 != null) {
                                a5.a((Context) activity, "$$_onUMengEnterForegroundInitError", (Map<String, Object>) hashMap);
                            }
                            n.f63837e = -2;
                            if (UMConfigure.isDebugLog()) {
                                UMLog.mutlInfo(2, l.ar);
                            }
                        } else if (n.f63837e == 1 || !UMUtils.isMainProgress(activity)) {
                            HashMap hashMap2 = new HashMap();
                            hashMap2.put("pairUUID", n.f63836d);
                            hashMap2.put(ForumPostsTagSelectActivity_.f30896z, Integer.valueOf(Process.myPid()));
                            hashMap2.put("isMainProcess", Integer.valueOf(UMUtils.isMainProgress(activity) ? 1 : 0));
                            hashMap2.put(BaseAppConfig.KEY_ACTIVITY_NAME, activity.toString());
                            if (com.umeng.analytics.b.a() != null) {
                                com.umeng.analytics.b.a().a((Context) activity, "$$_onUMengEnterForeground", (Map<String, Object>) hashMap2);
                            }
                        }
                    }
                    if (n.this.f63851n < 0) {
                        n.e(n.this);
                    } else {
                        n.f(n.this);
                    }
                }
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityStopped(Activity activity) {
                MobclickAgent.PageMode pageMode = UMConfigure.AUTO_ACTIVITY_PAGE_COLLECTION;
                MobclickAgent.PageMode pageMode2 = MobclickAgent.PageMode.AUTO;
                if (activity != null) {
                    if (activity.isChangingConfigurations()) {
                        n.a(n.this);
                        return;
                    }
                    n.b(n.this);
                    if (n.this.f63850m <= 0) {
                        if (n.f63837e == 0 && UMUtils.isMainProgress(activity)) {
                            return;
                        }
                        int i4 = n.f63837e;
                        if (i4 == 1 || (i4 == 0 && !UMUtils.isMainProgress(activity))) {
                            HashMap hashMap = new HashMap();
                            hashMap.put("pairUUID", n.f63836d);
                            hashMap.put(MediationConstant.KEY_REASON, "Normal");
                            hashMap.put(ForumPostsTagSelectActivity_.f30896z, Integer.valueOf(Process.myPid()));
                            hashMap.put("isMainProcess", Integer.valueOf(UMUtils.isMainProgress(activity) ? 1 : 0));
                            hashMap.put(BaseAppConfig.KEY_ACTIVITY_NAME, activity.toString());
                            com.umeng.analytics.b a5 = com.umeng.analytics.b.a();
                            if (a5 != null) {
                                a5.a((Context) activity, "$$_onUMengEnterBackground", (Map<String, Object>) hashMap);
                            }
                            if (n.f63836d != null) {
                                n.f63836d = null;
                            }
                        }
                    }
                }
            }
        };
        synchronized (this) {
            if (f63840k != null) {
                g();
            }
        }
    }

    public void c() {
        c((Activity) null);
        b();
    }

    public void b(Context context) {
        synchronized (f63842p) {
            if (f63841o) {
                f63841o = false;
                Activity globleActivity = DeviceConfig.getGlobleActivity(context);
                if (globleActivity == null) {
                    UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> init触发onResume: 无前台Activity，直接退出。");
                    return;
                }
                String localClassName = globleActivity.getLocalClassName();
                UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> init触发onResume: 补救成功，前台Activity名：" + localClassName);
                a(globleActivity);
                return;
            }
            UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> init触发onResume: firstResumeCall = false，直接返回。");
        }
    }

    public static void c(Context context) {
        String jSONArray;
        if (context != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                synchronized (f63839j) {
                    jSONArray = f63838i.toString();
                    f63838i = new JSONArray();
                }
                if (jSONArray.length() > 0) {
                    jSONObject.put(g.d.a.f63759c, new JSONArray(jSONArray));
                    k.a(context).a(w.a().c(), jSONObject, k.a.AUTOPAGE);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public boolean a() {
        return this.f63849l;
    }

    public static synchronized n a(Context context) {
        n nVar;
        synchronized (n.class) {
            if (f63840k == null && context != null) {
                if (context instanceof Activity) {
                    f63840k = ((Activity) context).getApplication();
                } else if (context instanceof Application) {
                    f63840k = (Application) context;
                }
            }
            nVar = a.f63853a;
        }
        return nVar;
    }

    public static void a(Context context, String str) {
        if (f63837e == 1 && UMUtils.isMainProgress(context)) {
            HashMap hashMap = new HashMap();
            hashMap.put("pairUUID", f63836d);
            hashMap.put(MediationConstant.KEY_REASON, str);
            if (f63836d != null) {
                f63836d = null;
            }
            if (context != null) {
                hashMap.put(ForumPostsTagSelectActivity_.f30896z, Integer.valueOf(Process.myPid()));
                hashMap.put("isMainProcess", Integer.valueOf(UMUtils.isMainProgress(context) ? 1 : 0));
                hashMap.put("Context", context.toString());
                com.umeng.analytics.b.a().a(context, "$$_onUMengEnterBackground", (Map<String, Object>) hashMap);
            }
        }
    }

    public void b() {
        this.f63849l = false;
        Application application = f63840k;
        if (application != null) {
            if (Build.VERSION.SDK_INT >= 14) {
                application.unregisterActivityLifecycleCallbacks(this.f63847g);
            }
            f63840k = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(Activity activity) {
        long j4;
        long j5;
        try {
            synchronized (this.f63848h) {
                if (f63835a == null && activity != null) {
                    f63835a = activity.getPackageName() + h0.f27805a + activity.getLocalClassName();
                }
                j4 = 0;
                if (TextUtils.isEmpty(f63835a) || !this.f63848h.containsKey(f63835a)) {
                    j5 = 0;
                } else {
                    long longValue = this.f63848h.get(f63835a).longValue();
                    this.f63848h.remove(f63835a);
                    j4 = System.currentTimeMillis() - longValue;
                    j5 = longValue;
                }
            }
            synchronized (f63839j) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(f.f63709v, f63835a);
                    jSONObject.put("duration", j4);
                    jSONObject.put(f.f63711x, j5);
                    jSONObject.put("type", 0);
                    f63838i.put(jSONObject);
                } catch (Throwable unused) {
                }
            }
        } catch (Throwable unused2) {
        }
    }

    private void b(Activity activity) {
        f63835a = activity.getPackageName() + h0.f27805a + activity.getLocalClassName();
        synchronized (this.f63848h) {
            this.f63848h.put(f63835a, Long.valueOf(System.currentTimeMillis()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Activity activity) {
        if (UMConfigure.AUTO_ACTIVITY_PAGE_COLLECTION != MobclickAgent.PageMode.AUTO) {
            if (UMConfigure.AUTO_ACTIVITY_PAGE_COLLECTION == MobclickAgent.PageMode.MANUAL) {
                synchronized (f63842p) {
                    com.umeng.analytics.b.a().h();
                }
            }
        } else if (activity != null) {
            String str = activity.getPackageName() + h0.f27805a + activity.getLocalClassName();
            this.f63846f.activityResume(str);
            if (this.f63844b) {
                this.f63844b = false;
                if (!TextUtils.isEmpty(f63835a)) {
                    if (f63835a.equals(str)) {
                        return;
                    }
                    b(activity);
                    synchronized (f63842p) {
                        com.umeng.analytics.b.a().h();
                    }
                    return;
                }
                f63835a = str;
                return;
            }
            b(activity);
            synchronized (f63842p) {
                com.umeng.analytics.b.a().h();
            }
        }
    }
}
