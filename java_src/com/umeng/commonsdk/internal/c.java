package com.umeng.commonsdk.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.umeng.analytics.CoreProtocol;
import com.umeng.analytics.pro.aw;
import com.umeng.analytics.pro.ay;
import com.umeng.analytics.pro.bk;
import com.umeng.analytics.pro.bm;
import com.umeng.analytics.pro.bo;
import com.umeng.analytics.pro.bp;
import com.umeng.analytics.pro.bq;
import com.umeng.analytics.pro.q;
import com.umeng.commonsdk.UMConfigureImpl;
import com.umeng.commonsdk.UMInnerManager;
import com.umeng.commonsdk.config.FieldManager;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.framework.UMEnvelopeBuild;
import com.umeng.commonsdk.framework.UMLogDataProtocol;
import com.umeng.commonsdk.framework.UMWorkDispatch;
import com.umeng.commonsdk.listener.OnGetOaidListener;
import com.umeng.commonsdk.service.UMGlobalContext;
import com.umeng.commonsdk.statistics.SdkVersion;
import com.umeng.commonsdk.statistics.UMServerURL;
import com.umeng.commonsdk.statistics.common.DeviceConfig;
import com.umeng.commonsdk.statistics.idtracking.i;
import com.umeng.commonsdk.utils.UMUtils;
import com.umeng.commonsdk.utils.onMessageSendListener;
import com.umeng.umzid.ZIDManager;
import java.io.File;
import java.lang.reflect.Method;
import org.json.JSONObject;
/* compiled from: UMInternalDataProtocol.java */
/* loaded from: classes6.dex */
public class c implements UMLogDataProtocol {

    /* renamed from: b  reason: collision with root package name */
    public static final String f64260b = "preInitInvokedFlag";

    /* renamed from: c  reason: collision with root package name */
    public static final String f64261c = "policyGrantInvokedFlag";

    /* renamed from: d  reason: collision with root package name */
    public static final String f64262d = "policyGrantResult";

    /* renamed from: f  reason: collision with root package name */
    private static int f64263f = 1;

    /* renamed from: e  reason: collision with root package name */
    private Context f64271e;

    /* renamed from: a  reason: collision with root package name */
    public static final String f64259a = aw.b().b(aw.f63386q);

    /* renamed from: g  reason: collision with root package name */
    private static Class<?> f64264g = null;

    /* renamed from: h  reason: collision with root package name */
    private static Method f64265h = null;

    /* renamed from: i  reason: collision with root package name */
    private static Method f64266i = null;

    /* renamed from: j  reason: collision with root package name */
    private static Method f64267j = null;

    /* renamed from: k  reason: collision with root package name */
    private static volatile String f64268k = "";

    /* renamed from: l  reason: collision with root package name */
    private static volatile String f64269l = "";

    /* renamed from: m  reason: collision with root package name */
    private static boolean f64270m = false;

    static {
        c();
    }

    public c(Context context) {
        if (context != null) {
            this.f64271e = context.getApplicationContext();
        }
    }

    public static String b() {
        Method method;
        if (!TextUtils.isEmpty(f64269l)) {
            return f64269l;
        }
        Class<?> cls = f64264g;
        if (cls == null || (method = f64265h) == null || f64267j == null) {
            return "";
        }
        try {
            Object invoke = method.invoke(cls, new Object[0]);
            if (invoke != null) {
                String str = (String) f64267j.invoke(invoke, new Object[0]);
                try {
                    f64269l = str;
                } catch (Throwable unused) {
                }
                return str;
            }
            return "";
        } catch (Throwable unused2) {
            return "";
        }
    }

    private static void c() {
        try {
            f64264g = ZIDManager.class;
            Method declaredMethod = ZIDManager.class.getDeclaredMethod("getInstance", new Class[0]);
            if (declaredMethod != null) {
                f64265h = declaredMethod;
            }
            Method declaredMethod2 = f64264g.getDeclaredMethod("getZID", Context.class);
            if (declaredMethod2 != null) {
                f64266i = declaredMethod2;
            }
            Method declaredMethod3 = f64264g.getDeclaredMethod("getSDKVersion", new Class[0]);
            if (declaredMethod3 != null) {
                f64267j = declaredMethod3;
            }
        } catch (Throwable unused) {
        }
    }

    private void d() {
        bo a5 = bo.a(this.f64271e);
        bp a6 = a5.a(bq.f63520c);
        if (a6 != null) {
            UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> [有状态]二级缓存记录构建成真正信封。");
            try {
                String str = a6.f63512a;
                String str2 = a6.f63513b;
                JSONObject a7 = new com.umeng.commonsdk.statistics.b().a(this.f64271e.getApplicationContext(), new JSONObject(a6.f63514c), new JSONObject(a6.f63515d), a6.f63516e, str2, a6.f63517f);
                if (a7 != null && a7.has("exception")) {
                    UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> [有状态]二级缓存记录构建真正信封 失败。删除二级缓存记录");
                } else {
                    UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> [有状态]二级缓存记录构建真正信封 成功! 删除二级缓存记录。");
                }
                a5.a(bq.f63520c, str);
                a5.b();
            } catch (Throwable unused) {
            }
        }
    }

    private void e() {
        if (!f64270m) {
            if (FieldManager.allow(com.umeng.commonsdk.utils.d.G)) {
                f64270m = true;
                a(this.f64271e, new OnGetOaidListener() { // from class: com.umeng.commonsdk.internal.c.4
                    @Override // com.umeng.commonsdk.listener.OnGetOaidListener
                    public void onGetOaid(String str) {
                        UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> OAID云控参数更新(不采集->采集)：采集完成");
                        if (!TextUtils.isEmpty(str)) {
                            try {
                                SharedPreferences sharedPreferences = c.this.f64271e.getSharedPreferences(i.f64446a, 0);
                                if (sharedPreferences != null) {
                                    SharedPreferences.Editor edit = sharedPreferences.edit();
                                    edit.putString(i.f64447b, str);
                                    edit.commit();
                                }
                            } catch (Throwable unused) {
                            }
                            UMWorkDispatch.sendEvent(c.this.f64271e, a.f64252w, b.a(c.this.f64271e).a(), null);
                            return;
                        }
                        UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> oaid返回null或者空串，不需要 伪冷启动。");
                    }
                });
            }
        } else if (FieldManager.allow(com.umeng.commonsdk.utils.d.G)) {
        } else {
            f64270m = false;
        }
    }

    private void f() {
        if (FieldManager.allow(com.umeng.commonsdk.utils.d.G)) {
            f64270m = true;
            UMConfigureImpl.registerInterruptFlag();
            UMConfigureImpl.init(this.f64271e);
            f64263f++;
            UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> 要读取 oaid，需等待读取结果.");
            UMConfigureImpl.registerMessageSendListener(new onMessageSendListener() { // from class: com.umeng.commonsdk.internal.c.5
                @Override // com.umeng.commonsdk.utils.onMessageSendListener
                public void onMessageSend() {
                    if (c.this.f64271e != null) {
                        UMWorkDispatch.sendEvent(c.this.f64271e, a.f64253x, b.a(c.this.f64271e).a(), null);
                    }
                    UMConfigureImpl.removeMessageSendListener(this);
                }
            });
            a(this.f64271e, true);
        }
    }

    private void g() {
        if (f64263f <= 0) {
            h();
            e(this.f64271e);
        }
    }

    private void h() {
        UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> 真实构建条件满足，开始构建业务信封。");
        if (UMUtils.isMainProgress(this.f64271e)) {
            f(this.f64271e);
            UMInnerManager.sendInnerPackage(this.f64271e);
            if (!FieldManager.allow(com.umeng.commonsdk.utils.d.ar) && SdkVersion.SDK_TYPE == 0 && UMUtils.isMainProgress(this.f64271e)) {
                Context context = this.f64271e;
                UMWorkDispatch.sendEvent(context, a.G, b.a(context).a(), null, 5000L);
            }
            Context context2 = this.f64271e;
            UMWorkDispatch.sendEvent(context2, q.a.f63913z, CoreProtocol.getInstance(context2), null);
            Context context3 = this.f64271e;
            UMWorkDispatch.sendEvent(context3, a.f64249t, b.a(context3).a(), null);
        }
    }

    @Override // com.umeng.commonsdk.framework.UMLogDataProtocol
    public void removeCacheData(Object obj) {
    }

    @Override // com.umeng.commonsdk.framework.UMLogDataProtocol
    public JSONObject setupReportData(long j4) {
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x02bc A[Catch: all -> 0x0436, TryCatch #1 {all -> 0x0436, blocks: (B:20:0x008b, B:22:0x0093, B:24:0x00a2, B:25:0x00a5, B:26:0x00b0, B:41:0x0112, B:45:0x0144, B:51:0x015c, B:53:0x0178, B:55:0x017e, B:56:0x018e, B:58:0x01b9, B:61:0x01c3, B:63:0x01c7, B:65:0x01db, B:84:0x0278, B:86:0x028f, B:88:0x029a, B:91:0x02a1, B:93:0x02a7, B:95:0x02b2, B:100:0x02bc, B:102:0x02c2, B:103:0x02ce, B:104:0x02d5), top: B:138:0x0079 }] */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02d5 A[Catch: all -> 0x0436, TRY_LEAVE, TryCatch #1 {all -> 0x0436, blocks: (B:20:0x008b, B:22:0x0093, B:24:0x00a2, B:25:0x00a5, B:26:0x00b0, B:41:0x0112, B:45:0x0144, B:51:0x015c, B:53:0x0178, B:55:0x017e, B:56:0x018e, B:58:0x01b9, B:61:0x01c3, B:63:0x01c7, B:65:0x01db, B:84:0x0278, B:86:0x028f, B:88:0x029a, B:91:0x02a1, B:93:0x02a7, B:95:0x02b2, B:100:0x02bc, B:102:0x02c2, B:103:0x02ce, B:104:0x02d5), top: B:138:0x0079 }] */
    @Override // com.umeng.commonsdk.framework.UMLogDataProtocol
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void workEvent(java.lang.Object r10, int r11) {
        /*
            Method dump skipped, instructions count: 1158
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.internal.c.workEvent(java.lang.Object, int):void");
    }

    public String a() {
        Method method;
        if (!TextUtils.isEmpty(f64268k)) {
            return f64268k;
        }
        Class<?> cls = f64264g;
        if (cls == null || (method = f64265h) == null || f64266i == null) {
            return "";
        }
        try {
            Object invoke = method.invoke(cls, new Object[0]);
            if (invoke != null) {
                String str = (String) f64266i.invoke(invoke, this.f64271e);
                try {
                    f64268k = str;
                } catch (Throwable unused) {
                }
                return str;
            }
            return "";
        } catch (Throwable unused2) {
            return "";
        }
    }

    private void b(Context context) {
        try {
            String imprintProperty = UMEnvelopeBuild.imprintProperty(context, bm.f63446g, "");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(com.umeng.commonsdk.statistics.b.a("appkey"), UMGlobalContext.getInstance(context).getAppkey());
            jSONObject.put(com.umeng.commonsdk.statistics.b.a(bm.f63446g), imprintProperty);
            JSONObject buildSilentEnvelopeWithExtHeader = UMEnvelopeBuild.buildSilentEnvelopeWithExtHeader(context, jSONObject, null, UMServerURL.SILENT_HEART_BEAT);
            if (buildSilentEnvelopeWithExtHeader != null && buildSilentEnvelopeWithExtHeader.has("exception")) {
                UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> 构建心跳报文失败.");
            } else {
                UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> 构建心跳报文 成功!!!");
            }
        } catch (Throwable unused) {
        }
    }

    private void a(Context context) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(com.umeng.commonsdk.statistics.b.a("appkey"), UMGlobalContext.getInstance(context).getAppkey());
            jSONObject.put(com.umeng.commonsdk.statistics.b.a("app_version"), UMGlobalContext.getInstance(context).getAppVersion());
            jSONObject.put(com.umeng.commonsdk.statistics.b.a(bm.f63463x), "Android");
            JSONObject buildZeroEnvelopeWithExtHeader = UMEnvelopeBuild.buildZeroEnvelopeWithExtHeader(context, jSONObject, null, UMServerURL.ZCFG_PATH);
            if (buildZeroEnvelopeWithExtHeader != null && buildZeroEnvelopeWithExtHeader.has("exception")) {
                UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> 构建零号报文失败.");
            } else {
                UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> 构建零号报文 成功!!!");
            }
        } catch (Throwable unused) {
        }
    }

    private void e(Context context) {
        Object invoke;
        Method declaredMethod;
        Context applicationContext = context.getApplicationContext();
        String appkey = UMUtils.getAppkey(context);
        try {
            Class<?> a5 = a("com.umeng.umzid.ZIDManager");
            Method declaredMethod2 = a5.getDeclaredMethod("getInstance", new Class[0]);
            if (declaredMethod2 == null || (invoke = declaredMethod2.invoke(a5, new Object[0])) == null || (declaredMethod = a5.getDeclaredMethod("init", Context.class, String.class, a("com.umeng.umzid.IZIDCompletionCallback"))) == null) {
                return;
            }
            declaredMethod.invoke(invoke, applicationContext, appkey, null);
        } catch (Throwable unused) {
        }
    }

    private static void c(final Context context) {
        if (FieldManager.allow(com.umeng.commonsdk.utils.d.G)) {
            a(context, new OnGetOaidListener() { // from class: com.umeng.commonsdk.internal.c.3
                @Override // com.umeng.commonsdk.listener.OnGetOaidListener
                public void onGetOaid(String str) {
                    if (TextUtils.isEmpty(str)) {
                        return;
                    }
                    try {
                        SharedPreferences sharedPreferences = context.getSharedPreferences(i.f64446a, 0);
                        if (sharedPreferences == null || sharedPreferences.getString(i.f64447b, "").equalsIgnoreCase(str)) {
                            return;
                        }
                        UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> 更新本地缓存OAID");
                        SharedPreferences.Editor edit = sharedPreferences.edit();
                        edit.putString(i.f64447b, str);
                        edit.commit();
                    } catch (Throwable unused) {
                    }
                }
            });
        }
    }

    private static void f(Context context) {
        File filesDir = context.getFilesDir();
        File file = new File(filesDir.getAbsolutePath() + File.separator + bq.f63529l);
        if (file.exists()) {
            return;
        }
        try {
            file.createNewFile();
        } catch (Throwable unused) {
        }
    }

    public static void a(final Context context, final boolean z4) {
        new Thread(new Runnable() { // from class: com.umeng.commonsdk.internal.c.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    SharedPreferences sharedPreferences = context.getSharedPreferences(i.f64446a, 0);
                    long currentTimeMillis = System.currentTimeMillis();
                    String a5 = ay.a(context);
                    long currentTimeMillis2 = System.currentTimeMillis();
                    if (!TextUtils.isEmpty(a5) && sharedPreferences != null) {
                        SharedPreferences.Editor edit = sharedPreferences.edit();
                        edit.putString(i.f64448c, (currentTimeMillis2 - currentTimeMillis) + "");
                        edit.commit();
                    }
                    if (sharedPreferences != null) {
                        SharedPreferences.Editor edit2 = sharedPreferences.edit();
                        edit2.putString(i.f64447b, a5);
                        edit2.commit();
                    }
                    if (DeviceConfig.isHonorDevice()) {
                        if (bk.c()) {
                            String c5 = ay.c(context);
                            if (sharedPreferences != null) {
                                SharedPreferences.Editor edit3 = sharedPreferences.edit();
                                edit3.putString(com.umeng.commonsdk.statistics.idtracking.c.f64423b, c5);
                                edit3.commit();
                            }
                        } else if (bk.b() && sharedPreferences != null) {
                            SharedPreferences.Editor edit4 = sharedPreferences.edit();
                            edit4.putString(com.umeng.commonsdk.statistics.idtracking.c.f64423b, a5);
                            edit4.commit();
                        }
                    }
                    if (z4) {
                        UMConfigureImpl.removeInterruptFlag();
                    }
                } catch (Throwable unused) {
                }
            }
        }).start();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0035 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void d(android.content.Context r11) {
        /*
            r10 = this;
            if (r11 != 0) goto L3
            return
        L3:
            java.lang.String r0 = com.umeng.analytics.AnalyticsConfig.RTD_SP_FILE
            java.lang.String r1 = "debugkey"
            java.lang.String r2 = com.umeng.common.b.a(r11, r0, r1)
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L90
            java.lang.String r3 = "startTime"
            java.lang.String r3 = com.umeng.common.b.a(r11, r0, r3)
            java.lang.String r4 = "period"
            java.lang.String r0 = com.umeng.common.b.a(r11, r0, r4)
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            r5 = 0
            if (r4 != 0) goto L2e
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch: java.lang.Throwable -> L2e
            long r3 = r3.longValue()     // Catch: java.lang.Throwable -> L2e
            goto L2f
        L2e:
            r3 = r5
        L2f:
            boolean r7 = android.text.TextUtils.isEmpty(r0)
            if (r7 != 0) goto L3e
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch: java.lang.Throwable -> L3e
            long r7 = r0.longValue()     // Catch: java.lang.Throwable -> L3e
            goto L3f
        L3e:
            r7 = r5
        L3f:
            java.lang.String r0 = "MobclickRT"
            int r9 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r9 == 0) goto L86
            int r9 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r9 != 0) goto L4a
            goto L86
        L4a:
            long r5 = java.lang.System.currentTimeMillis()
            long r5 = r5 - r3
            r3 = 60
            long r7 = r7 * r3
            r3 = 1000(0x3e8, double:4.94E-321)
            long r7 = r7 * r3
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 <= 0) goto L6f
            java.lang.String r1 = "--->>> [RTD]本地缓存dk值已经超时，清除缓存数据。"
            com.umeng.commonsdk.debug.UMRTLog.i(r0, r1)
            java.lang.String r0 = com.umeng.analytics.AnalyticsConfig.RTD_SP_FILE
            com.umeng.common.b.a(r11, r0)
            boolean r11 = com.umeng.analytics.AnalyticsConfig.isRealTimeDebugMode()
            if (r11 == 0) goto L90
            com.umeng.analytics.AnalyticsConfig.turnOffRealTimeDebug()
            goto L90
        L6f:
            java.util.HashMap r11 = new java.util.HashMap
            r11.<init>()
            r11.put(r1, r2)
            boolean r1 = com.umeng.analytics.AnalyticsConfig.isRealTimeDebugMode()
            if (r1 != 0) goto L90
            java.lang.String r1 = "--->>> [RTD]本地缓存dk值在有效期内，切换到埋点验证模式。"
            com.umeng.commonsdk.debug.UMRTLog.i(r0, r1)
            com.umeng.analytics.AnalyticsConfig.turnOnRealTimeDebug(r11)
            goto L90
        L86:
            java.lang.String r1 = "--->>> [RTD]本地缓存startTime或者duration值无效，清除缓存数据"
            com.umeng.commonsdk.debug.UMRTLog.i(r0, r1)
            java.lang.String r0 = com.umeng.analytics.AnalyticsConfig.RTD_SP_FILE
            com.umeng.common.b.a(r11, r0)
        L90:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.internal.c.d(android.content.Context):void");
    }

    private static void a(Context context, final OnGetOaidListener onGetOaidListener) {
        if (context == null) {
            return;
        }
        final Context applicationContext = context.getApplicationContext();
        new Thread(new Runnable() { // from class: com.umeng.commonsdk.internal.c.2
            @Override // java.lang.Runnable
            public void run() {
                String a5 = ay.a(applicationContext);
                OnGetOaidListener onGetOaidListener2 = onGetOaidListener;
                if (onGetOaidListener2 != null) {
                    onGetOaidListener2.onGetOaid(a5);
                }
            }
        }).start();
    }

    private static Class<?> a(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
