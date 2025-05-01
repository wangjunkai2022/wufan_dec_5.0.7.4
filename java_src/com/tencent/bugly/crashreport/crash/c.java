package com.tencent.bugly.crashreport.crash;

import android.content.Context;
import com.tencent.bugly.BuglyStrategy;
import com.tencent.bugly.crashreport.common.info.AppInfo;
import com.tencent.bugly.crashreport.common.strategy.StrategyBean;
import com.tencent.bugly.crashreport.crash.jni.NativeCrashHandler;
import com.tencent.bugly.proguard.o;
import com.tencent.bugly.proguard.p;
import com.tencent.bugly.proguard.r;
import com.tencent.bugly.proguard.u;
import com.tencent.bugly.proguard.w;
import com.tencent.bugly.proguard.x;
import com.tencent.bugly.proguard.z;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: BUGLY */
/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static int f62394a = 0;

    /* renamed from: b  reason: collision with root package name */
    public static boolean f62395b = false;

    /* renamed from: c  reason: collision with root package name */
    public static int f62396c = 2;

    /* renamed from: d  reason: collision with root package name */
    public static boolean f62397d = true;

    /* renamed from: e  reason: collision with root package name */
    public static int f62398e = 20480;

    /* renamed from: f  reason: collision with root package name */
    public static int f62399f = 20480;

    /* renamed from: g  reason: collision with root package name */
    public static long f62400g = 604800000;

    /* renamed from: h  reason: collision with root package name */
    public static String f62401h = null;

    /* renamed from: i  reason: collision with root package name */
    public static boolean f62402i = false;

    /* renamed from: j  reason: collision with root package name */
    public static String f62403j = null;

    /* renamed from: k  reason: collision with root package name */
    public static int f62404k = 5000;

    /* renamed from: l  reason: collision with root package name */
    public static boolean f62405l = true;

    /* renamed from: m  reason: collision with root package name */
    public static boolean f62406m;

    /* renamed from: n  reason: collision with root package name */
    public static String f62407n;

    /* renamed from: o  reason: collision with root package name */
    public static String f62408o;

    /* renamed from: r  reason: collision with root package name */
    private static c f62409r;

    /* renamed from: p  reason: collision with root package name */
    public final b f62410p;

    /* renamed from: q  reason: collision with root package name */
    private final Context f62411q;

    /* renamed from: s  reason: collision with root package name */
    private final e f62412s;

    /* renamed from: t  reason: collision with root package name */
    private final NativeCrashHandler f62413t;

    /* renamed from: u  reason: collision with root package name */
    private com.tencent.bugly.crashreport.common.strategy.a f62414u;

    /* renamed from: v  reason: collision with root package name */
    private w f62415v;

    /* renamed from: w  reason: collision with root package name */
    private final com.tencent.bugly.crashreport.crash.anr.b f62416w;

    /* renamed from: x  reason: collision with root package name */
    private Boolean f62417x;

    /* renamed from: y  reason: collision with root package name */
    private int f62418y = 31;

    /* renamed from: z  reason: collision with root package name */
    private boolean f62419z = false;

    /* compiled from: BUGLY */
    /* renamed from: com.tencent.bugly.crashreport.crash.c$2  reason: invalid class name */
    /* loaded from: classes5.dex */
    final class AnonymousClass2 extends Thread {
        AnonymousClass2() {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            ArrayList arrayList;
            if (!z.a(c.this.f62411q, "local_crash_lock", (long) com.join.mgps.data.c.f49010a)) {
                x.c("Failed to lock file for uploading local crash.", new Object[0]);
                return;
            }
            List<CrashDetailBean> a5 = c.this.f62410p.a();
            if (a5 != null && a5.size() > 0) {
                x.c("Size of crash list: %s", Integer.valueOf(a5.size()));
                int size = a5.size();
                if (size > 20) {
                    ArrayList arrayList2 = new ArrayList();
                    Collections.sort(a5);
                    for (int i4 = 0; i4 < 20; i4++) {
                        arrayList2.add(a5.get((size - 1) - i4));
                    }
                    arrayList = arrayList2;
                } else {
                    arrayList = a5;
                }
                c.this.f62410p.a(arrayList, 0L, false, false, false);
            } else {
                x.c("no crash need to be uploaded at this start", new Object[0]);
            }
            z.b(c.this.f62411q, "local_crash_lock");
        }
    }

    private c(int i4, Context context, w wVar, boolean z4, BuglyStrategy.a aVar, o oVar, String str) {
        f62394a = i4;
        Context a5 = z.a(context);
        this.f62411q = a5;
        this.f62414u = com.tencent.bugly.crashreport.common.strategy.a.a();
        this.f62415v = wVar;
        u a6 = u.a();
        p a7 = p.a();
        b bVar = new b(i4, a5, a6, a7, this.f62414u, aVar, oVar);
        this.f62410p = bVar;
        com.tencent.bugly.crashreport.common.info.a a8 = com.tencent.bugly.crashreport.common.info.a.a(a5);
        this.f62412s = new e(a5, bVar, this.f62414u, a8);
        NativeCrashHandler nativeCrashHandler = NativeCrashHandler.getInstance(a5, a8, bVar, this.f62414u, wVar, z4, str);
        this.f62413t = nativeCrashHandler;
        a8.D = nativeCrashHandler;
        this.f62416w = com.tencent.bugly.crashreport.crash.anr.b.a(a5, this.f62414u, a8, wVar, a7, bVar, aVar);
    }

    public final synchronized void c() {
        this.f62412s.a();
        this.f62413t.setUserOpened(true);
        this.f62416w.a(true);
    }

    public final synchronized void d() {
        this.f62412s.b();
        this.f62413t.setUserOpened(false);
        this.f62416w.a(false);
    }

    public final void e() {
        this.f62412s.b();
    }

    public final void f() {
        this.f62412s.a();
    }

    public final void g() {
        this.f62413t.setUserOpened(false);
    }

    public final void h() {
        this.f62413t.setUserOpened(true);
    }

    public final void i() {
        this.f62416w.a(true);
    }

    public final void j() {
        this.f62416w.a(false);
    }

    public final void k() {
        this.f62413t.enableCatchAnrTrace();
    }

    public final synchronized void l() {
        int i4 = 0;
        while (true) {
            int i5 = i4 + 1;
            if (i4 < 30) {
                try {
                    x.a("try main sleep for make a test anr! try:%d/30 , kill it if you don't want to wait!", Integer.valueOf(i5));
                    z.b(5000L);
                    i4 = i5;
                } catch (Throwable th) {
                    if (x.a(th)) {
                        return;
                    }
                    th.printStackTrace();
                    return;
                }
            }
        }
    }

    public final boolean m() {
        return this.f62416w.a();
    }

    public final void n() {
        this.f62413t.checkUploadRecordCrash();
    }

    public final void o() {
        if (com.tencent.bugly.crashreport.common.info.a.b().f62253d.equals(AppInfo.a(this.f62411q))) {
            this.f62413t.removeEmptyNativeRecordFiles();
        }
    }

    public final boolean p() {
        return this.f62419z;
    }

    public final boolean q() {
        return (this.f62418y & 16) > 0;
    }

    public final boolean r() {
        return (this.f62418y & 8) > 0;
    }

    public final boolean s() {
        return (this.f62418y & 4) > 0;
    }

    public final boolean t() {
        return (this.f62418y & 2) > 0;
    }

    public final boolean u() {
        return (this.f62418y & 1) > 0;
    }

    public static synchronized c a(int i4, Context context, boolean z4, BuglyStrategy.a aVar, o oVar, String str) {
        c cVar;
        synchronized (c.class) {
            if (f62409r == null) {
                f62409r = new c(1004, context, w.a(), z4, aVar, null, null);
            }
            cVar = f62409r;
        }
        return cVar;
    }

    public final boolean b() {
        Boolean bool = this.f62417x;
        if (bool != null) {
            return bool.booleanValue();
        }
        String str = com.tencent.bugly.crashreport.common.info.a.b().f62253d;
        List<r> a5 = p.a().a(1);
        ArrayList arrayList = new ArrayList();
        if (a5 != null && a5.size() > 0) {
            for (r rVar : a5) {
                if (str.equals(rVar.f62688c)) {
                    this.f62417x = Boolean.TRUE;
                    arrayList.add(rVar);
                }
            }
            if (arrayList.size() > 0) {
                p.a().a(arrayList);
            }
            return true;
        }
        this.f62417x = Boolean.FALSE;
        return false;
    }

    public static synchronized c a() {
        c cVar;
        synchronized (c.class) {
            cVar = f62409r;
        }
        return cVar;
    }

    public final void a(StrategyBean strategyBean) {
        this.f62412s.a(strategyBean);
        this.f62413t.onStrategyChanged(strategyBean);
        this.f62416w.c();
        w.a().a(new AnonymousClass2(), 3000L);
    }

    public final synchronized void a(boolean z4, boolean z5, boolean z6) {
        this.f62413t.testNativeCrash(z4, z5, z6);
    }

    public final void a(final Thread thread, final Throwable th, boolean z4, String str, byte[] bArr, final boolean z5) {
        this.f62415v.a(new Runnable() { // from class: com.tencent.bugly.crashreport.crash.c.1
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    x.c("post a throwable %b", Boolean.valueOf(r2));
                    c.this.f62412s.a(thread, th, false, r5, r6);
                    if (z5) {
                        x.a("clear user datas", new Object[0]);
                        com.tencent.bugly.crashreport.common.info.a.a(c.this.f62411q).v();
                    }
                } catch (Throwable th2) {
                    if (!x.b(th2)) {
                        th2.printStackTrace();
                    }
                    x.e("java catch error: %s", th.toString());
                }
            }
        });
    }

    public final void a(CrashDetailBean crashDetailBean) {
        this.f62410p.e(crashDetailBean);
    }

    public final void a(long j4) {
        w.a().a(new AnonymousClass2(), j4);
    }

    public final void a(int i4) {
        this.f62418y = i4;
    }

    public final void a(boolean z4) {
        this.f62419z = z4;
    }
}
