package com.tencent.bugly.crashreport.common.strategy;

import android.content.Context;
import com.alipay.sdk.packet.d;
import com.tencent.bugly.crashreport.biz.b;
import com.tencent.bugly.proguard.ao;
import com.tencent.bugly.proguard.ap;
import com.tencent.bugly.proguard.o;
import com.tencent.bugly.proguard.p;
import com.tencent.bugly.proguard.r;
import com.tencent.bugly.proguard.w;
import com.tencent.bugly.proguard.x;
import com.tencent.bugly.proguard.z;
import java.util.List;
import java.util.Map;
/* compiled from: BUGLY */
/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static int f62301a = 1000;

    /* renamed from: b  reason: collision with root package name */
    private static a f62302b;

    /* renamed from: h  reason: collision with root package name */
    private static String f62303h;

    /* renamed from: c  reason: collision with root package name */
    private final List<com.tencent.bugly.a> f62304c;

    /* renamed from: d  reason: collision with root package name */
    private final w f62305d;

    /* renamed from: e  reason: collision with root package name */
    private final StrategyBean f62306e;

    /* renamed from: f  reason: collision with root package name */
    private StrategyBean f62307f = null;

    /* renamed from: g  reason: collision with root package name */
    private Context f62308g;

    private a(Context context, List<com.tencent.bugly.a> list) {
        String str;
        this.f62308g = context;
        if (com.tencent.bugly.crashreport.common.info.a.a(context) != null) {
            String str2 = com.tencent.bugly.crashreport.common.info.a.a(context).f62274y;
            if ("oversea".equals(str2)) {
                str = "https://astat.bugly.qcloud.com/rqd/async";
            } else {
                str = "na_https".equals(str2) ? "https://astat.bugly.cros.wr.pvp.net/:8180/rqd/async" : "https://astat.bugly.cros.wr.pvp.net/:8180/rqd/async";
            }
            StrategyBean.f62279a = str;
            StrategyBean.f62280b = str;
        }
        this.f62306e = new StrategyBean();
        this.f62304c = list;
        this.f62305d = w.a();
    }

    public static StrategyBean d() {
        byte[] bArr;
        List<r> a5 = p.a().a(2);
        if (a5 == null || a5.size() <= 0 || (bArr = a5.get(0).f62692g) == null) {
            return null;
        }
        return (StrategyBean) z.a(bArr, StrategyBean.CREATOR);
    }

    public final StrategyBean c() {
        StrategyBean strategyBean = this.f62307f;
        if (strategyBean != null) {
            if (!z.c(strategyBean.f62294p)) {
                this.f62307f.f62294p = StrategyBean.f62279a;
            }
            if (!z.c(this.f62307f.f62295q)) {
                this.f62307f.f62295q = StrategyBean.f62280b;
            }
            return this.f62307f;
        }
        if (!z.a(f62303h) && z.c(f62303h)) {
            StrategyBean strategyBean2 = this.f62306e;
            String str = f62303h;
            strategyBean2.f62294p = str;
            strategyBean2.f62295q = str;
        }
        return this.f62306e;
    }

    public final synchronized boolean b() {
        return this.f62307f != null;
    }

    public static synchronized a a(Context context, List<com.tencent.bugly.a> list) {
        a aVar;
        synchronized (a.class) {
            if (f62302b == null) {
                f62302b = new a(context, list);
            }
            aVar = f62302b;
        }
        return aVar;
    }

    public final void a(long j4) {
        this.f62305d.a(new Thread() { // from class: com.tencent.bugly.crashreport.common.strategy.a.1
            @Override // java.lang.Thread, java.lang.Runnable
            public final void run() {
                try {
                    Map<String, byte[]> a5 = p.a().a(a.f62301a, (o) null, true);
                    if (a5 != null) {
                        byte[] bArr = a5.get(d.f4907p);
                        byte[] bArr2 = a5.get("gateway");
                        if (bArr != null) {
                            com.tencent.bugly.crashreport.common.info.a.a(a.this.f62308g).f(new String(bArr));
                        }
                        if (bArr2 != null) {
                            com.tencent.bugly.crashreport.common.info.a.a(a.this.f62308g).e(new String(bArr2));
                        }
                    }
                    a.this.f62307f = a.d();
                    if (a.this.f62307f != null) {
                        if (z.a(a.f62303h) || !z.c(a.f62303h)) {
                            a.this.f62307f.f62294p = StrategyBean.f62279a;
                            a.this.f62307f.f62295q = StrategyBean.f62280b;
                        } else {
                            a.this.f62307f.f62294p = a.f62303h;
                            a.this.f62307f.f62295q = a.f62303h;
                        }
                    }
                } catch (Throwable th) {
                    if (!x.a(th)) {
                        th.printStackTrace();
                    }
                }
                a aVar = a.this;
                aVar.a(aVar.f62307f, false);
            }
        }, j4);
    }

    public static synchronized a a() {
        a aVar;
        synchronized (a.class) {
            aVar = f62302b;
        }
        return aVar;
    }

    protected final void a(StrategyBean strategyBean, boolean z4) {
        x.c("[Strategy] Notify %s", b.class.getName());
        b.a(strategyBean, z4);
        for (com.tencent.bugly.a aVar : this.f62304c) {
            try {
                x.c("[Strategy] Notify %s", aVar.getClass().getName());
                aVar.onServerStrategyChanged(strategyBean);
            } catch (Throwable th) {
                if (!x.a(th)) {
                    th.printStackTrace();
                }
            }
        }
    }

    public static void a(String str) {
        if (!z.a(str) && z.c(str)) {
            f62303h = str;
        } else {
            x.d("URL user set is invalid.", new Object[0]);
        }
    }

    public final void a(ap apVar) {
        if (apVar == null) {
            return;
        }
        StrategyBean strategyBean = this.f62307f;
        if (strategyBean == null || apVar.f62594h != strategyBean.f62292n) {
            StrategyBean strategyBean2 = new StrategyBean();
            strategyBean2.f62283e = apVar.f62587a;
            strategyBean2.f62285g = apVar.f62589c;
            strategyBean2.f62284f = apVar.f62588b;
            if (z.a(f62303h) || !z.c(f62303h)) {
                if (z.c(apVar.f62590d)) {
                    x.c("[Strategy] Upload url changes to %s", apVar.f62590d);
                    strategyBean2.f62294p = apVar.f62590d;
                }
                if (z.c(apVar.f62591e)) {
                    x.c("[Strategy] Exception upload url changes to %s", apVar.f62591e);
                    strategyBean2.f62295q = apVar.f62591e;
                }
            }
            ao aoVar = apVar.f62592f;
            if (aoVar != null && !z.a(aoVar.f62582a)) {
                strategyBean2.f62296r = apVar.f62592f.f62582a;
            }
            long j4 = apVar.f62594h;
            if (j4 != 0) {
                strategyBean2.f62292n = j4;
            }
            Map<String, String> map = apVar.f62593g;
            if (map != null && map.size() > 0) {
                Map<String, String> map2 = apVar.f62593g;
                strategyBean2.f62297s = map2;
                String str = map2.get("B11");
                if (str != null && str.equals("1")) {
                    strategyBean2.f62286h = true;
                } else {
                    strategyBean2.f62286h = false;
                }
                String str2 = apVar.f62593g.get("B3");
                if (str2 != null) {
                    strategyBean2.f62300v = Long.valueOf(str2).longValue();
                }
                int i4 = apVar.f62595i;
                strategyBean2.f62293o = i4;
                strategyBean2.f62299u = i4;
                String str3 = apVar.f62593g.get("B27");
                if (str3 != null && str3.length() > 0) {
                    try {
                        int parseInt = Integer.parseInt(str3);
                        if (parseInt > 0) {
                            strategyBean2.f62298t = parseInt;
                        }
                    } catch (Exception e5) {
                        if (!x.a(e5)) {
                            e5.printStackTrace();
                        }
                    }
                }
                String str4 = apVar.f62593g.get("B25");
                if (str4 != null && str4.equals("1")) {
                    strategyBean2.f62288j = true;
                } else {
                    strategyBean2.f62288j = false;
                }
            }
            x.a("[Strategy] enableCrashReport:%b, enableQuery:%b, enableUserInfo:%b, enableAnr:%b, enableBlock:%b, enableSession:%b, enableSessionTimer:%b, sessionOverTime:%d, enableCocos:%b, strategyLastUpdateTime:%d", Boolean.valueOf(strategyBean2.f62283e), Boolean.valueOf(strategyBean2.f62285g), Boolean.valueOf(strategyBean2.f62284f), Boolean.valueOf(strategyBean2.f62286h), Boolean.valueOf(strategyBean2.f62287i), Boolean.valueOf(strategyBean2.f62290l), Boolean.valueOf(strategyBean2.f62291m), Long.valueOf(strategyBean2.f62293o), Boolean.valueOf(strategyBean2.f62288j), Long.valueOf(strategyBean2.f62292n));
            this.f62307f = strategyBean2;
            if (!z.c(apVar.f62590d)) {
                x.c("[Strategy] download url is null", new Object[0]);
                this.f62307f.f62294p = "";
            }
            if (!z.c(apVar.f62591e)) {
                x.c("[Strategy] download crashurl is null", new Object[0]);
                this.f62307f.f62295q = "";
            }
            p.a().b(2);
            r rVar = new r();
            rVar.f62687b = 2;
            rVar.f62686a = strategyBean2.f62281c;
            rVar.f62690e = strategyBean2.f62282d;
            rVar.f62692g = z.a(strategyBean2);
            p.a().a(rVar);
            a(strategyBean2, true);
        }
    }
}
