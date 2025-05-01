package com.tencent.bugly.crashreport.biz;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import com.tencent.bugly.BuglyStrategy;
import com.tencent.bugly.crashreport.biz.a;
import com.tencent.bugly.crashreport.common.strategy.StrategyBean;
import com.tencent.bugly.proguard.w;
import com.tencent.bugly.proguard.x;
import com.tencent.bugly.proguard.z;
/* compiled from: BUGLY */
/* loaded from: classes4.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    public static a f62231a = null;

    /* renamed from: b  reason: collision with root package name */
    private static boolean f62232b = false;

    /* renamed from: c  reason: collision with root package name */
    private static int f62233c = 10;

    /* renamed from: d  reason: collision with root package name */
    private static long f62234d = 300000;

    /* renamed from: e  reason: collision with root package name */
    private static long f62235e = 30000;

    /* renamed from: f  reason: collision with root package name */
    private static long f62236f = 0;

    /* renamed from: g  reason: collision with root package name */
    private static int f62237g = 0;

    /* renamed from: h  reason: collision with root package name */
    private static long f62238h = 0;

    /* renamed from: i  reason: collision with root package name */
    private static long f62239i = 0;

    /* renamed from: j  reason: collision with root package name */
    private static long f62240j = 0;

    /* renamed from: k  reason: collision with root package name */
    private static Application.ActivityLifecycleCallbacks f62241k = null;

    /* renamed from: l  reason: collision with root package name */
    private static Class<?> f62242l = null;

    /* renamed from: m  reason: collision with root package name */
    private static boolean f62243m = true;

    static /* synthetic */ String a(String str, String str2) {
        return z.a() + "  " + str + "  " + str2 + "\n";
    }

    static /* synthetic */ int g() {
        int i4 = f62237g;
        f62237g = i4 + 1;
        return i4;
    }

    public static void a(final Context context, final BuglyStrategy buglyStrategy) {
        long j4;
        if (f62232b) {
            return;
        }
        boolean z4 = com.tencent.bugly.crashreport.common.info.a.a(context).f62254e;
        f62243m = z4;
        f62231a = new a(context, z4);
        f62232b = true;
        if (buglyStrategy != null) {
            f62242l = buglyStrategy.getUserInfoActivity();
            j4 = buglyStrategy.getAppReportDelay();
        } else {
            j4 = 0;
        }
        if (j4 <= 0) {
            c(context, buglyStrategy);
        } else {
            w.a().a(new Runnable() { // from class: com.tencent.bugly.crashreport.biz.b.1
                @Override // java.lang.Runnable
                public final void run() {
                    b.c(context, buglyStrategy);
                }
            }, j4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0068 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void c(android.content.Context r14, com.tencent.bugly.BuglyStrategy r15) {
        /*
            Method dump skipped, instructions count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.crashreport.biz.b.c(android.content.Context, com.tencent.bugly.BuglyStrategy):void");
    }

    public static void a(long j4) {
        if (j4 < 0) {
            j4 = com.tencent.bugly.crashreport.common.strategy.a.a().c().f62293o;
        }
        f62236f = j4;
    }

    public static void a(StrategyBean strategyBean, boolean z4) {
        w a5;
        a aVar = f62231a;
        if (aVar != null && !z4 && (a5 = w.a()) != null) {
            a5.a(new a.AnonymousClass2());
        }
        if (strategyBean == null) {
            return;
        }
        long j4 = strategyBean.f62293o;
        if (j4 > 0) {
            f62235e = j4;
        }
        int i4 = strategyBean.f62298t;
        if (i4 > 0) {
            f62233c = i4;
        }
        long j5 = strategyBean.f62299u;
        if (j5 > 0) {
            f62234d = j5;
        }
    }

    public static void a() {
        a aVar = f62231a;
        if (aVar != null) {
            aVar.a(2, false, 0L);
        }
    }

    public static void a(Context context) {
        if (!f62232b || context == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 14) {
            Application application = context.getApplicationContext() instanceof Application ? (Application) context.getApplicationContext() : null;
            if (application != null) {
                try {
                    Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = f62241k;
                    if (activityLifecycleCallbacks != null) {
                        application.unregisterActivityLifecycleCallbacks(activityLifecycleCallbacks);
                    }
                } catch (Exception e5) {
                    if (!x.a(e5)) {
                        e5.printStackTrace();
                    }
                }
            }
        }
        f62232b = false;
    }
}
