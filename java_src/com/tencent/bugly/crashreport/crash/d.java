package com.tencent.bugly.crashreport.crash;

import android.content.Context;
import com.tencent.bugly.crashreport.common.strategy.StrategyBean;
import com.tencent.bugly.proguard.w;
import com.tencent.bugly.proguard.x;
import com.tencent.bugly.proguard.y;
import com.tencent.bugly.proguard.z;
import java.util.LinkedHashMap;
import java.util.Map;
/* compiled from: BUGLY */
/* loaded from: classes5.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    private static d f62428a;

    /* renamed from: b  reason: collision with root package name */
    private com.tencent.bugly.crashreport.common.strategy.a f62429b;

    /* renamed from: c  reason: collision with root package name */
    private com.tencent.bugly.crashreport.common.info.a f62430c;

    /* renamed from: d  reason: collision with root package name */
    private b f62431d;

    /* renamed from: e  reason: collision with root package name */
    private Context f62432e;

    private d(Context context) {
        c a5 = c.a();
        if (a5 == null) {
            return;
        }
        this.f62429b = com.tencent.bugly.crashreport.common.strategy.a.a();
        this.f62430c = com.tencent.bugly.crashreport.common.info.a.a(context);
        this.f62431d = a5.f62410p;
        this.f62432e = context;
        w.a().a(new Runnable() { // from class: com.tencent.bugly.crashreport.crash.d.1
            @Override // java.lang.Runnable
            public final void run() {
                d.a(d.this);
            }
        });
    }

    static /* synthetic */ void a(d dVar) {
        x.c("[ExtraCrashManager] Trying to notify Bugly agents.", new Object[0]);
        try {
            Class<?> cls = Class.forName("com.tencent.bugly.agent.GameAgent");
            dVar.f62430c.getClass();
            z.a(cls, "sdkPackageName", "com.tencent.bugly", null);
            x.c("[ExtraCrashManager] Bugly game agent has been notified.", new Object[0]);
        } catch (Throwable unused) {
            x.a("[ExtraCrashManager] no game agent", new Object[0]);
        }
    }

    static /* synthetic */ void a(d dVar, Thread thread, int i4, String str, String str2, String str3, Map map) {
        String str4;
        String str5;
        String str6;
        Thread currentThread = thread == null ? Thread.currentThread() : thread;
        if (i4 == 4) {
            str4 = "Unity";
        } else if (i4 == 5 || i4 == 6) {
            str4 = "Cocos";
        } else if (i4 != 8) {
            x.d("[ExtraCrashManager] Unknown extra crash type: %d", Integer.valueOf(i4));
            return;
        } else {
            str4 = "H5";
        }
        x.e("[ExtraCrashManager] %s Crash Happen", str4);
        try {
            if (!dVar.f62429b.b()) {
                x.d("[ExtraCrashManager] There is no remote strategy, but still store it.", new Object[0]);
            }
            StrategyBean c5 = dVar.f62429b.c();
            if (!c5.f62283e && dVar.f62429b.b()) {
                x.e("[ExtraCrashManager] Crash report was closed by remote , will not upload to Bugly , print local for helpful!", new Object[0]);
                String a5 = z.a();
                String str7 = dVar.f62430c.f62253d;
                String name = currentThread.getName();
                b.a(str4, a5, str7, name, str + "\n" + str2 + "\n" + str3, null);
                x.e("[ExtraCrashManager] Successfully handled.", new Object[0]);
                return;
            }
            if (i4 == 5 || i4 == 6) {
                if (!c5.f62288j) {
                    x.e("[ExtraCrashManager] %s report is disabled.", str4);
                    x.e("[ExtraCrashManager] Successfully handled.", new Object[0]);
                    return;
                }
            } else if (i4 == 8 && !c5.f62289k) {
                x.e("[ExtraCrashManager] %s report is disabled.", str4);
                x.e("[ExtraCrashManager] Successfully handled.", new Object[0]);
                return;
            }
            int i5 = i4 != 8 ? i4 : 5;
            CrashDetailBean crashDetailBean = new CrashDetailBean();
            crashDetailBean.C = com.tencent.bugly.crashreport.common.info.b.g();
            crashDetailBean.D = com.tencent.bugly.crashreport.common.info.b.e();
            crashDetailBean.E = com.tencent.bugly.crashreport.common.info.b.i();
            crashDetailBean.F = dVar.f62430c.l();
            crashDetailBean.G = dVar.f62430c.k();
            crashDetailBean.H = dVar.f62430c.m();
            crashDetailBean.f62339w = z.a(dVar.f62432e, c.f62398e, (String) null);
            crashDetailBean.f62318b = i5;
            crashDetailBean.f62321e = dVar.f62430c.h();
            com.tencent.bugly.crashreport.common.info.a aVar = dVar.f62430c;
            crashDetailBean.f62322f = aVar.f62259j;
            crashDetailBean.f62323g = aVar.r();
            crashDetailBean.f62329m = dVar.f62430c.g();
            crashDetailBean.f62330n = str;
            crashDetailBean.f62331o = str2;
            str5 = "";
            if (str3 != null) {
                String[] split = str3.split("\n");
                str5 = split.length > 0 ? split[0] : "";
                str6 = str3;
            } else {
                str6 = "";
            }
            crashDetailBean.f62332p = str5;
            crashDetailBean.f62333q = str6;
            crashDetailBean.f62334r = System.currentTimeMillis();
            crashDetailBean.f62337u = z.a(crashDetailBean.f62333q.getBytes());
            crashDetailBean.f62342z = z.a(c.f62399f, false);
            crashDetailBean.A = dVar.f62430c.f62253d;
            crashDetailBean.B = currentThread.getName() + "(" + currentThread.getId() + ")";
            crashDetailBean.I = dVar.f62430c.t();
            crashDetailBean.f62324h = dVar.f62430c.q();
            com.tencent.bugly.crashreport.common.info.a aVar2 = dVar.f62430c;
            crashDetailBean.M = aVar2.f62250a;
            crashDetailBean.N = aVar2.a();
            if (!c.a().p()) {
                dVar.f62431d.d(crashDetailBean);
            }
            crashDetailBean.Q = dVar.f62430c.A();
            crashDetailBean.R = dVar.f62430c.B();
            crashDetailBean.S = dVar.f62430c.u();
            crashDetailBean.T = dVar.f62430c.z();
            crashDetailBean.f62341y = y.a();
            if (crashDetailBean.O == null) {
                crashDetailBean.O = new LinkedHashMap();
            }
            if (map != null) {
                crashDetailBean.O.putAll(map);
            }
            String a6 = z.a();
            String str8 = dVar.f62430c.f62253d;
            String name2 = currentThread.getName();
            b.a(str4, a6, str8, name2, str + "\n" + str2 + "\n" + str3, crashDetailBean);
            if (!dVar.f62431d.a(crashDetailBean)) {
                dVar.f62431d.a(crashDetailBean, 3000L, false);
            }
            x.e("[ExtraCrashManager] Successfully handled.", new Object[0]);
        } catch (Throwable th) {
            try {
                if (!x.a(th)) {
                    th.printStackTrace();
                }
                x.e("[ExtraCrashManager] Successfully handled.", new Object[0]);
            } catch (Throwable th2) {
                x.e("[ExtraCrashManager] Successfully handled.", new Object[0]);
                throw th2;
            }
        }
    }

    public static d a(Context context) {
        if (f62428a == null) {
            f62428a = new d(context);
        }
        return f62428a;
    }

    public static void a(final Thread thread, final int i4, final String str, final String str2, final String str3, final Map<String, String> map) {
        w.a().a(new Runnable() { // from class: com.tencent.bugly.crashreport.crash.d.2
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    if (d.f62428a != null) {
                        d.a(d.f62428a, thread, i4, str, str2, str3, map);
                    } else {
                        x.e("[ExtraCrashManager] Extra crash manager has not been initialized.", new Object[0]);
                    }
                } catch (Throwable th) {
                    if (!x.b(th)) {
                        th.printStackTrace();
                    }
                    x.e("[ExtraCrashManager] Crash error %s %s %s", str, str2, str3);
                }
            }
        });
    }
}
