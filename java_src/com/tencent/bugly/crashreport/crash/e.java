package com.tencent.bugly.crashreport.crash;

import android.content.Context;
import android.os.Process;
import com.tencent.bugly.crashreport.common.strategy.StrategyBean;
import com.tencent.bugly.proguard.x;
import com.tencent.bugly.proguard.y;
import com.tencent.bugly.proguard.z;
import java.lang.Thread;
import java.util.HashMap;
/* compiled from: BUGLY */
/* loaded from: classes5.dex */
public final class e implements Thread.UncaughtExceptionHandler {

    /* renamed from: h  reason: collision with root package name */
    private static String f62440h;

    /* renamed from: i  reason: collision with root package name */
    private static final Object f62441i = new Object();

    /* renamed from: a  reason: collision with root package name */
    private Context f62442a;

    /* renamed from: b  reason: collision with root package name */
    private b f62443b;

    /* renamed from: c  reason: collision with root package name */
    private com.tencent.bugly.crashreport.common.strategy.a f62444c;

    /* renamed from: d  reason: collision with root package name */
    private com.tencent.bugly.crashreport.common.info.a f62445d;

    /* renamed from: e  reason: collision with root package name */
    private Thread.UncaughtExceptionHandler f62446e;

    /* renamed from: f  reason: collision with root package name */
    private Thread.UncaughtExceptionHandler f62447f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f62448g = false;

    /* renamed from: j  reason: collision with root package name */
    private int f62449j;

    public e(Context context, b bVar, com.tencent.bugly.crashreport.common.strategy.a aVar, com.tencent.bugly.crashreport.common.info.a aVar2) {
        this.f62442a = context;
        this.f62443b = bVar;
        this.f62444c = aVar;
        this.f62445d = aVar2;
    }

    public final synchronized void a() {
        if (this.f62449j >= 10) {
            x.a("java crash handler over %d, no need set.", 10);
            return;
        }
        this.f62448g = true;
        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        if (defaultUncaughtExceptionHandler != null) {
            if (e.class.getName().equals(defaultUncaughtExceptionHandler.getClass().getName())) {
                return;
            }
            if ("com.android.internal.os.RuntimeInit$UncaughtHandler".equals(defaultUncaughtExceptionHandler.getClass().getName())) {
                x.a("backup system java handler: %s", defaultUncaughtExceptionHandler.toString());
                this.f62447f = defaultUncaughtExceptionHandler;
                this.f62446e = defaultUncaughtExceptionHandler;
            } else {
                x.a("backup java handler: %s", defaultUncaughtExceptionHandler.toString());
                this.f62446e = defaultUncaughtExceptionHandler;
            }
        }
        Thread.setDefaultUncaughtExceptionHandler(this);
        this.f62449j++;
        x.a("registered java monitor: %s", toString());
    }

    public final synchronized void b() {
        this.f62448g = false;
        x.a("close java monitor!", new Object[0]);
        if ("bugly".equals(Thread.getDefaultUncaughtExceptionHandler().getClass().getName())) {
            x.a("Java monitor to unregister: %s", toString());
            Thread.setDefaultUncaughtExceptionHandler(this.f62446e);
            this.f62449j--;
        }
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        synchronized (f62441i) {
            a(thread, th, true, null, null);
        }
    }

    private CrashDetailBean b(Thread thread, Throwable th, boolean z4, String str, byte[] bArr) {
        String a5;
        if (th == null) {
            x.d("We can do nothing with a null throwable.", new Object[0]);
            return null;
        }
        boolean m4 = c.a().m();
        String str2 = (m4 && z4) ? " This Crash Caused By ANR , PLS To Fix ANR , This Trace May Be Not Useful![Bugly]" : "";
        if (m4 && z4) {
            x.e("This Crash Caused By ANR , PLS To Fix ANR , This Trace May Be Not Useful!", new Object[0]);
        }
        CrashDetailBean crashDetailBean = new CrashDetailBean();
        crashDetailBean.C = com.tencent.bugly.crashreport.common.info.b.g();
        crashDetailBean.D = com.tencent.bugly.crashreport.common.info.b.e();
        crashDetailBean.E = com.tencent.bugly.crashreport.common.info.b.i();
        crashDetailBean.F = this.f62445d.l();
        crashDetailBean.G = this.f62445d.k();
        crashDetailBean.H = this.f62445d.m();
        crashDetailBean.f62339w = z.a(this.f62442a, c.f62398e, (String) null);
        byte[] a6 = y.a();
        crashDetailBean.f62341y = a6;
        Object[] objArr = new Object[1];
        objArr[0] = Integer.valueOf(a6 == null ? 0 : a6.length);
        x.a("user log size:%d", objArr);
        crashDetailBean.f62318b = z4 ? 0 : 2;
        crashDetailBean.f62321e = this.f62445d.h();
        com.tencent.bugly.crashreport.common.info.a aVar = this.f62445d;
        crashDetailBean.f62322f = aVar.f62259j;
        crashDetailBean.f62323g = aVar.r();
        crashDetailBean.f62329m = this.f62445d.g();
        String name = th.getClass().getName();
        String b5 = b(th, 1000);
        if (b5 == null) {
            b5 = "";
        }
        Object[] objArr2 = new Object[2];
        objArr2[0] = Integer.valueOf(th.getStackTrace().length);
        objArr2[1] = Boolean.valueOf(th.getCause() != null);
        x.e("stack frame :%d, has cause %b", objArr2);
        String stackTraceElement = th.getStackTrace().length > 0 ? th.getStackTrace()[0].toString() : "";
        Throwable th2 = th;
        while (th2 != null && th2.getCause() != null) {
            th2 = th2.getCause();
        }
        if (th2 != null && th2 != th) {
            crashDetailBean.f62330n = th2.getClass().getName();
            String b6 = b(th2, 1000);
            crashDetailBean.f62331o = b6;
            if (b6 == null) {
                crashDetailBean.f62331o = "";
            }
            if (th2.getStackTrace().length > 0) {
                crashDetailBean.f62332p = th2.getStackTrace()[0].toString();
            }
            StringBuilder sb = new StringBuilder();
            sb.append(name);
            sb.append(":");
            sb.append(b5);
            sb.append("\n");
            sb.append(stackTraceElement);
            sb.append("\n......");
            sb.append("\nCaused by:\n");
            sb.append(crashDetailBean.f62330n);
            sb.append(":");
            sb.append(crashDetailBean.f62331o);
            sb.append("\n");
            a5 = a(th2, c.f62399f);
            sb.append(a5);
            crashDetailBean.f62333q = sb.toString();
        } else {
            crashDetailBean.f62330n = name;
            String str3 = b5 + str2;
            crashDetailBean.f62331o = str3;
            if (str3 == null) {
                crashDetailBean.f62331o = "";
            }
            crashDetailBean.f62332p = stackTraceElement;
            a5 = a(th, c.f62399f);
            crashDetailBean.f62333q = a5;
        }
        crashDetailBean.f62334r = System.currentTimeMillis();
        crashDetailBean.f62337u = z.a(crashDetailBean.f62333q.getBytes());
        try {
            crashDetailBean.f62342z = z.a(c.f62399f, false);
            crashDetailBean.A = this.f62445d.f62253d;
            String str4 = thread.getName() + "(" + thread.getId() + ")";
            crashDetailBean.B = str4;
            crashDetailBean.f62342z.put(str4, a5);
            crashDetailBean.I = this.f62445d.t();
            crashDetailBean.f62324h = this.f62445d.q();
            crashDetailBean.f62325i = this.f62445d.C();
            com.tencent.bugly.crashreport.common.info.a aVar2 = this.f62445d;
            crashDetailBean.M = aVar2.f62250a;
            crashDetailBean.N = aVar2.a();
            if (z4) {
                this.f62443b.d(crashDetailBean);
            } else {
                boolean z5 = str != null && str.length() > 0;
                boolean z6 = bArr != null && bArr.length > 0;
                if (z5) {
                    HashMap hashMap = new HashMap(1);
                    crashDetailBean.O = hashMap;
                    hashMap.put("UserData", str);
                }
                if (z6) {
                    crashDetailBean.U = bArr;
                }
            }
            crashDetailBean.Q = this.f62445d.A();
            crashDetailBean.R = this.f62445d.B();
            crashDetailBean.S = this.f62445d.u();
            crashDetailBean.T = this.f62445d.z();
        } catch (Throwable th3) {
            x.e("handle crash error %s", th3.toString());
        }
        return crashDetailBean;
    }

    private static boolean a(Thread thread) {
        synchronized (f62441i) {
            if (f62440h == null || !thread.getName().equals(f62440h)) {
                f62440h = thread.getName();
                return false;
            }
            return true;
        }
    }

    public final void a(Thread thread, Throwable th, boolean z4, String str, byte[] bArr) {
        if (z4) {
            x.e("Java Crash Happen cause by %s(%d)", thread.getName(), Long.valueOf(thread.getId()));
            if (a(thread)) {
                x.a("this class has handled this exception", new Object[0]);
                if (this.f62447f != null) {
                    x.a("call system handler", new Object[0]);
                    this.f62447f.uncaughtException(thread, th);
                } else {
                    x.e("current process die", new Object[0]);
                    Process.killProcess(Process.myPid());
                    System.exit(1);
                }
            }
        } else {
            x.e("Java Catch Happen", new Object[0]);
        }
        try {
            if (!this.f62448g) {
                x.c("Java crash handler is disable. Just return.", new Object[0]);
                if (z4) {
                    Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f62446e;
                    if (uncaughtExceptionHandler != null && a(uncaughtExceptionHandler)) {
                        x.e("sys default last handle start!", new Object[0]);
                        this.f62446e.uncaughtException(thread, th);
                        x.e("sys default last handle end!", new Object[0]);
                        return;
                    } else if (this.f62447f != null) {
                        x.e("system handle start!", new Object[0]);
                        this.f62447f.uncaughtException(thread, th);
                        x.e("system handle end!", new Object[0]);
                        return;
                    } else {
                        x.e("crashreport last handle start!", new Object[0]);
                        x.e("current process die", new Object[0]);
                        Process.killProcess(Process.myPid());
                        System.exit(1);
                        x.e("crashreport last handle end!", new Object[0]);
                        return;
                    }
                }
                return;
            }
            if (!this.f62444c.b()) {
                x.d("no remote but still store!", new Object[0]);
            }
            if (!this.f62444c.c().f62283e && this.f62444c.b()) {
                x.e("crash report was closed by remote , will not upload to Bugly , print local for helpful!", new Object[0]);
                b.a(z4 ? "JAVA_CRASH" : "JAVA_CATCH", z.a(), this.f62445d.f62253d, thread.getName(), z.a(th), null);
                if (z4) {
                    Thread.UncaughtExceptionHandler uncaughtExceptionHandler2 = this.f62446e;
                    if (uncaughtExceptionHandler2 != null && a(uncaughtExceptionHandler2)) {
                        x.e("sys default last handle start!", new Object[0]);
                        this.f62446e.uncaughtException(thread, th);
                        x.e("sys default last handle end!", new Object[0]);
                        return;
                    } else if (this.f62447f != null) {
                        x.e("system handle start!", new Object[0]);
                        this.f62447f.uncaughtException(thread, th);
                        x.e("system handle end!", new Object[0]);
                        return;
                    } else {
                        x.e("crashreport last handle start!", new Object[0]);
                        x.e("current process die", new Object[0]);
                        Process.killProcess(Process.myPid());
                        System.exit(1);
                        x.e("crashreport last handle end!", new Object[0]);
                        return;
                    }
                }
                return;
            }
            CrashDetailBean b5 = b(thread, th, z4, str, bArr);
            if (b5 == null) {
                x.e("pkg crash datas fail!", new Object[0]);
                if (z4) {
                    Thread.UncaughtExceptionHandler uncaughtExceptionHandler3 = this.f62446e;
                    if (uncaughtExceptionHandler3 != null && a(uncaughtExceptionHandler3)) {
                        x.e("sys default last handle start!", new Object[0]);
                        this.f62446e.uncaughtException(thread, th);
                        x.e("sys default last handle end!", new Object[0]);
                        return;
                    } else if (this.f62447f != null) {
                        x.e("system handle start!", new Object[0]);
                        this.f62447f.uncaughtException(thread, th);
                        x.e("system handle end!", new Object[0]);
                        return;
                    } else {
                        x.e("crashreport last handle start!", new Object[0]);
                        x.e("current process die", new Object[0]);
                        Process.killProcess(Process.myPid());
                        System.exit(1);
                        x.e("crashreport last handle end!", new Object[0]);
                        return;
                    }
                }
                return;
            }
            b.a(z4 ? "JAVA_CRASH" : "JAVA_CATCH", z.a(), this.f62445d.f62253d, thread.getName(), z.a(th), b5);
            if (!this.f62443b.a(b5)) {
                this.f62443b.a(b5, 3000L, z4);
            }
            if (z4) {
                this.f62443b.c(b5);
            }
            if (z4) {
                Thread.UncaughtExceptionHandler uncaughtExceptionHandler4 = this.f62446e;
                if (uncaughtExceptionHandler4 != null && a(uncaughtExceptionHandler4)) {
                    x.e("sys default last handle start!", new Object[0]);
                    this.f62446e.uncaughtException(thread, th);
                    x.e("sys default last handle end!", new Object[0]);
                } else if (this.f62447f != null) {
                    x.e("system handle start!", new Object[0]);
                    this.f62447f.uncaughtException(thread, th);
                    x.e("system handle end!", new Object[0]);
                } else {
                    x.e("crashreport last handle start!", new Object[0]);
                    x.e("current process die", new Object[0]);
                    Process.killProcess(Process.myPid());
                    System.exit(1);
                    x.e("crashreport last handle end!", new Object[0]);
                }
            }
        } catch (Throwable th2) {
            try {
                if (!x.a(th2)) {
                    th2.printStackTrace();
                }
                if (z4) {
                    Thread.UncaughtExceptionHandler uncaughtExceptionHandler5 = this.f62446e;
                    if (uncaughtExceptionHandler5 != null && a(uncaughtExceptionHandler5)) {
                        x.e("sys default last handle start!", new Object[0]);
                        this.f62446e.uncaughtException(thread, th);
                        x.e("sys default last handle end!", new Object[0]);
                    } else if (this.f62447f != null) {
                        x.e("system handle start!", new Object[0]);
                        this.f62447f.uncaughtException(thread, th);
                        x.e("system handle end!", new Object[0]);
                    } else {
                        x.e("crashreport last handle start!", new Object[0]);
                        x.e("current process die", new Object[0]);
                        Process.killProcess(Process.myPid());
                        System.exit(1);
                        x.e("crashreport last handle end!", new Object[0]);
                    }
                }
            } catch (Throwable th3) {
                if (z4) {
                    Thread.UncaughtExceptionHandler uncaughtExceptionHandler6 = this.f62446e;
                    if (uncaughtExceptionHandler6 != null && a(uncaughtExceptionHandler6)) {
                        x.e("sys default last handle start!", new Object[0]);
                        this.f62446e.uncaughtException(thread, th);
                        x.e("sys default last handle end!", new Object[0]);
                    } else if (this.f62447f != null) {
                        x.e("system handle start!", new Object[0]);
                        this.f62447f.uncaughtException(thread, th);
                        x.e("system handle end!", new Object[0]);
                    } else {
                        x.e("crashreport last handle start!", new Object[0]);
                        x.e("current process die", new Object[0]);
                        Process.killProcess(Process.myPid());
                        System.exit(1);
                        x.e("crashreport last handle end!", new Object[0]);
                    }
                }
                throw th3;
            }
        }
    }

    private static String b(Throwable th, int i4) {
        if (th.getMessage() == null) {
            return "";
        }
        if (th.getMessage().length() <= 1000) {
            return th.getMessage();
        }
        return th.getMessage().substring(0, 1000) + "\n[Message over limit size:1000, has been cutted!]";
    }

    private static boolean a(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        StackTraceElement[] stackTrace;
        if (uncaughtExceptionHandler == null) {
            return true;
        }
        String name = uncaughtExceptionHandler.getClass().getName();
        for (StackTraceElement stackTraceElement : Thread.currentThread().getStackTrace()) {
            String className = stackTraceElement.getClassName();
            String methodName = stackTraceElement.getMethodName();
            if (name.equals(className) && "uncaughtException".equals(methodName)) {
                return false;
            }
        }
        return true;
    }

    public final synchronized void a(StrategyBean strategyBean) {
        if (strategyBean != null) {
            boolean z4 = strategyBean.f62283e;
            if (z4 != this.f62448g) {
                x.a("java changed to %b", Boolean.valueOf(z4));
                if (strategyBean.f62283e) {
                    a();
                    return;
                }
                b();
            }
        }
    }

    private static String a(Throwable th, int i4) {
        StackTraceElement[] stackTrace;
        if (th == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        try {
            if (th.getStackTrace() != null) {
                for (StackTraceElement stackTraceElement : th.getStackTrace()) {
                    if (i4 > 0 && sb.length() >= i4) {
                        sb.append("\n[Stack over limit size :" + i4 + " , has been cutted !]");
                        return sb.toString();
                    }
                    sb.append(stackTraceElement.toString());
                    sb.append("\n");
                }
            }
        } catch (Throwable th2) {
            x.e("gen stack error %s", th2.toString());
        }
        return sb.toString();
    }
}
