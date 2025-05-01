package com.tencent.bugly.crashreport.crash.anr;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.FileObserver;
import android.os.Looper;
import android.os.Process;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import com.tencent.bugly.BuglyStrategy;
import com.tencent.bugly.crashreport.common.info.AppInfo;
import com.tencent.bugly.crashreport.crash.CrashDetailBean;
import com.tencent.bugly.crashreport.crash.anr.TraceFileHelper;
import com.tencent.bugly.crashreport.crash.c;
import com.tencent.bugly.proguard.aa;
import com.tencent.bugly.proguard.ab;
import com.tencent.bugly.proguard.ac;
import com.tencent.bugly.proguard.p;
import com.tencent.bugly.proguard.w;
import com.tencent.bugly.proguard.x;
import com.tencent.bugly.proguard.y;
import com.tencent.bugly.proguard.z;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: BUGLY */
/* loaded from: classes5.dex */
public final class b implements ac {

    /* renamed from: m  reason: collision with root package name */
    private static b f62365m;

    /* renamed from: c  reason: collision with root package name */
    private final Context f62368c;

    /* renamed from: d  reason: collision with root package name */
    private final com.tencent.bugly.crashreport.common.info.a f62369d;

    /* renamed from: e  reason: collision with root package name */
    private final w f62370e;

    /* renamed from: f  reason: collision with root package name */
    private String f62371f;

    /* renamed from: g  reason: collision with root package name */
    private final com.tencent.bugly.crashreport.crash.b f62372g;

    /* renamed from: h  reason: collision with root package name */
    private FileObserver f62373h;

    /* renamed from: j  reason: collision with root package name */
    private ab f62375j;

    /* renamed from: k  reason: collision with root package name */
    private int f62376k;

    /* renamed from: a  reason: collision with root package name */
    private AtomicInteger f62366a = new AtomicInteger(0);

    /* renamed from: b  reason: collision with root package name */
    private long f62367b = -1;

    /* renamed from: i  reason: collision with root package name */
    private boolean f62374i = true;

    /* renamed from: l  reason: collision with root package name */
    private ActivityManager.ProcessErrorStateInfo f62377l = new ActivityManager.ProcessErrorStateInfo();

    private b(Context context, com.tencent.bugly.crashreport.common.strategy.a aVar, com.tencent.bugly.crashreport.common.info.a aVar2, w wVar, com.tencent.bugly.crashreport.crash.b bVar) {
        this.f62368c = z.a(context);
        this.f62371f = context.getDir("bugly", 0).getAbsolutePath();
        this.f62369d = aVar2;
        this.f62370e = wVar;
        this.f62372g = bVar;
    }

    private synchronized void c(boolean z4) {
        if (this.f62374i != z4) {
            x.a("user change anr %b", Boolean.valueOf(z4));
            this.f62374i = z4;
        }
    }

    private synchronized void d() {
        if (f()) {
            x.d("start when started!", new Object[0]);
            return;
        }
        FileObserver fileObserver = new FileObserver("/data/anr/", 8) { // from class: com.tencent.bugly.crashreport.crash.anr.b.1
            @Override // android.os.FileObserver
            public final void onEvent(int i4, String str) {
                if (str == null) {
                    return;
                }
                final String str2 = "/data/anr/" + str;
                x.d("watching file %s", str2);
                if (str2.contains("trace")) {
                    b.this.f62370e.a(new Runnable() { // from class: com.tencent.bugly.crashreport.crash.anr.b.1.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            b.this.a(str2);
                        }
                    });
                } else {
                    x.d("not anr file %s", str2);
                }
            }
        };
        this.f62373h = fileObserver;
        fileObserver.startWatching();
        x.a("start anr monitor!", new Object[0]);
        this.f62370e.a(new Runnable() { // from class: com.tencent.bugly.crashreport.crash.anr.b.2
            @Override // java.lang.Runnable
            public final void run() {
                b.this.b();
            }
        });
    }

    private synchronized void e() {
        if (!f()) {
            x.d("close when closed!", new Object[0]);
            return;
        }
        this.f62373h.stopWatching();
        this.f62373h = null;
        x.d("close anr monitor!", new Object[0]);
    }

    private synchronized boolean f() {
        return this.f62373h != null;
    }

    private synchronized boolean g() {
        return this.f62374i;
    }

    private File h() {
        int indexOf;
        long currentTimeMillis = System.currentTimeMillis();
        File file = new File(this.f62371f);
        if (file.exists() && file.isDirectory()) {
            try {
                File[] listFiles = file.listFiles();
                if (listFiles != null && listFiles.length != 0) {
                    int i4 = 24;
                    int length = listFiles.length;
                    int i5 = 0;
                    while (i5 < length) {
                        File file2 = listFiles[i5];
                        String name = file2.getName();
                        if (name.startsWith("jni_mannual_bugly_trace_") && (indexOf = name.indexOf(".txt")) > 0) {
                            long parseLong = Long.parseLong(name.substring(i4, indexOf));
                            long j4 = (currentTimeMillis - parseLong) / 1000;
                            x.c("current time %d trace time is %d s", Long.valueOf(currentTimeMillis), Long.valueOf(parseLong));
                            x.c("current time minus trace time is %d s", Long.valueOf(j4));
                            if (j4 < 30) {
                                return file2;
                            }
                        }
                        i5++;
                        i4 = 24;
                    }
                }
                return null;
            } catch (Throwable th) {
                x.a(th);
                return null;
            }
        }
        return null;
    }

    private synchronized void i() {
        if (f()) {
            x.d("start when started!", new Object[0]);
        } else if (TextUtils.isEmpty(this.f62371f)) {
        } else {
            ab abVar = this.f62375j;
            if (abVar == null || !abVar.isAlive()) {
                ab abVar2 = new ab();
                this.f62375j = abVar2;
                StringBuilder sb = new StringBuilder("Bugly-ThreadMonitor");
                int i4 = this.f62376k;
                this.f62376k = i4 + 1;
                sb.append(i4);
                abVar2.setName(sb.toString());
                this.f62375j.a();
                this.f62375j.a(this);
                this.f62375j.d();
                this.f62370e.a(new Runnable() { // from class: com.tencent.bugly.crashreport.crash.anr.b.3
                    @Override // java.lang.Runnable
                    public final void run() {
                        b.this.b();
                    }
                });
            }
            FileObserver fileObserver = new FileObserver(this.f62371f, 256) { // from class: com.tencent.bugly.crashreport.crash.anr.b.4
                @Override // android.os.FileObserver
                public final void onEvent(int i5, String str) {
                    if (str == null) {
                        return;
                    }
                    x.d("startWatchingPrivateAnrDir %s", str);
                    if (b.a(b.this, str)) {
                        if (b.this.f62375j != null) {
                            b.this.f62375j.a(true);
                            return;
                        }
                        return;
                    }
                    x.c("trace file not caused by sigquit , ignore ", new Object[0]);
                }
            };
            this.f62373h = fileObserver;
            fileObserver.startWatching();
            x.a("startWatchingPrivateAnrDir! dumFilePath is %s", this.f62371f);
            this.f62370e.a(new Runnable() { // from class: com.tencent.bugly.crashreport.crash.anr.b.5
                @Override // java.lang.Runnable
                public final void run() {
                    b.this.b();
                }
            });
        }
    }

    private synchronized void j() {
        if (!f()) {
            x.d("close when closed!", new Object[0]);
            return;
        }
        ab abVar = this.f62375j;
        if (abVar != null) {
            abVar.c();
            this.f62375j.b();
            this.f62375j.b(this);
            this.f62375j = null;
        }
        x.a("stopWatchingPrivateAnrDir", new Object[0]);
        this.f62373h.stopWatching();
        this.f62373h = null;
        x.d("close anr monitor!", new Object[0]);
    }

    static /* synthetic */ boolean a(b bVar, String str) {
        return str.startsWith("bugly_trace_");
    }

    private synchronized void b(boolean z4) {
        if (Build.VERSION.SDK_INT <= 19) {
            if (z4) {
                d();
            } else {
                e();
            }
        } else if (z4) {
            i();
        } else {
            j();
        }
    }

    public static b a(Context context, com.tencent.bugly.crashreport.common.strategy.a aVar, com.tencent.bugly.crashreport.common.info.a aVar2, w wVar, p pVar, com.tencent.bugly.crashreport.crash.b bVar, BuglyStrategy.a aVar3) {
        if (f62365m == null) {
            f62365m = new b(context, aVar, aVar2, wVar, bVar);
        }
        return f62365m;
    }

    public final synchronized void c() {
        x.d("customer decides whether to open or close.", new Object[0]);
    }

    private ActivityManager.ProcessErrorStateInfo a(Context context, long j4) {
        try {
            x.c("to find!", new Object[0]);
            ActivityManager activityManager = (ActivityManager) context.getSystemService(TTDownloadField.TT_ACTIVITY);
            int i4 = 0;
            while (true) {
                x.c("waiting!", new Object[0]);
                List<ActivityManager.ProcessErrorStateInfo> processesInErrorState = activityManager.getProcessesInErrorState();
                if (processesInErrorState != null) {
                    for (ActivityManager.ProcessErrorStateInfo processErrorStateInfo : processesInErrorState) {
                        if (processErrorStateInfo.condition == 2) {
                            x.c("found!", new Object[0]);
                            return processErrorStateInfo;
                        }
                    }
                }
                z.b(500L);
                int i5 = i4 + 1;
                if (i4 >= 40) {
                    x.c("end!", new Object[0]);
                    return null;
                }
                i4 = i5;
            }
        } catch (Exception e5) {
            x.b(e5);
            return null;
        } catch (OutOfMemoryError e6) {
            this.f62377l.pid = Process.myPid();
            ActivityManager.ProcessErrorStateInfo processErrorStateInfo2 = this.f62377l;
            processErrorStateInfo2.shortMsg = "bugly sdk waitForAnrProcessStateChanged encount error:" + e6.getMessage();
            return this.f62377l;
        }
    }

    protected final void b() {
        int indexOf;
        long b5 = z.b() - c.f62400g;
        File file = new File(this.f62371f);
        if (file.exists() && file.isDirectory()) {
            try {
                File[] listFiles = file.listFiles();
                if (listFiles != null && listFiles.length != 0) {
                    int i4 = 0;
                    int i5 = 0;
                    for (File file2 : listFiles) {
                        String name = file2.getName();
                        boolean z4 = true;
                        if (!name.startsWith("bugly_trace_") && !name.startsWith("bugly_trace_")) {
                            z4 = false;
                            x.c("Number Trace file : " + name, new Object[0]);
                            if (z4 && (((indexOf = name.indexOf(".txt")) <= 0 || Long.parseLong(name.substring(i5, indexOf)) < b5) && file2.delete())) {
                                i4++;
                            }
                        }
                        i5 = 12;
                        x.c("Number Trace file : " + name, new Object[0]);
                        if (z4) {
                            i4++;
                        }
                    }
                    x.c("Number of overdue trace files that has deleted: " + i4, new Object[0]);
                }
            } catch (Throwable th) {
                x.a(th);
            }
        }
    }

    private CrashDetailBean a(a aVar) {
        CrashDetailBean crashDetailBean = new CrashDetailBean();
        try {
            crashDetailBean.C = com.tencent.bugly.crashreport.common.info.b.g();
            crashDetailBean.D = com.tencent.bugly.crashreport.common.info.b.e();
            crashDetailBean.E = com.tencent.bugly.crashreport.common.info.b.i();
            crashDetailBean.F = this.f62369d.l();
            crashDetailBean.G = this.f62369d.k();
            crashDetailBean.H = this.f62369d.m();
            if (!com.tencent.bugly.crashreport.common.info.b.m()) {
                crashDetailBean.f62339w = z.a(this.f62368c, c.f62398e, (String) null);
            }
            crashDetailBean.f62318b = 3;
            crashDetailBean.f62321e = this.f62369d.h();
            com.tencent.bugly.crashreport.common.info.a aVar2 = this.f62369d;
            crashDetailBean.f62322f = aVar2.f62259j;
            crashDetailBean.f62323g = aVar2.r();
            crashDetailBean.f62329m = this.f62369d.g();
            crashDetailBean.f62330n = "ANR_EXCEPTION";
            crashDetailBean.f62331o = aVar.f62363f;
            crashDetailBean.f62333q = aVar.f62364g;
            HashMap hashMap = new HashMap();
            crashDetailBean.P = hashMap;
            hashMap.put("BUGLY_CR_01", aVar.f62362e);
            String str = crashDetailBean.f62333q;
            int indexOf = str != null ? str.indexOf("\n") : -1;
            crashDetailBean.f62332p = indexOf > 0 ? crashDetailBean.f62333q.substring(0, indexOf) : "GET_FAIL";
            crashDetailBean.f62334r = aVar.f62360c;
            String str2 = crashDetailBean.f62333q;
            if (str2 != null) {
                crashDetailBean.f62337u = z.a(str2.getBytes());
            }
            crashDetailBean.f62342z = aVar.f62359b;
            crashDetailBean.A = aVar.f62358a;
            crashDetailBean.B = "main(1)";
            crashDetailBean.I = this.f62369d.t();
            crashDetailBean.f62324h = this.f62369d.q();
            crashDetailBean.f62325i = this.f62369d.C();
            crashDetailBean.f62338v = aVar.f62361d;
            com.tencent.bugly.crashreport.common.info.a aVar3 = this.f62369d;
            crashDetailBean.L = aVar3.f62263n;
            crashDetailBean.M = aVar3.f62250a;
            crashDetailBean.N = aVar3.a();
            if (!com.tencent.bugly.crashreport.common.info.b.m()) {
                this.f62372g.d(crashDetailBean);
            }
            crashDetailBean.Q = this.f62369d.A();
            crashDetailBean.R = this.f62369d.B();
            crashDetailBean.S = this.f62369d.u();
            crashDetailBean.T = this.f62369d.z();
            crashDetailBean.f62341y = y.a();
        } catch (Throwable th) {
            if (!x.a(th)) {
                th.printStackTrace();
            }
        }
        return crashDetailBean;
    }

    private static boolean a(String str, String str2, String str3) {
        Map<String, String[]> map;
        Throwable th;
        BufferedWriter bufferedWriter;
        TraceFileHelper.a readTargetDumpInfo = TraceFileHelper.readTargetDumpInfo(str3, str, true);
        if (readTargetDumpInfo != null && (map = readTargetDumpInfo.f62357d) != null && map.size() > 0) {
            File file = new File(str2);
            try {
                if (!file.exists()) {
                    if (!file.getParentFile().exists()) {
                        file.getParentFile().mkdirs();
                    }
                    file.createNewFile();
                }
                if (file.exists() && file.canWrite()) {
                    BufferedWriter bufferedWriter2 = null;
                    try {
                        try {
                            bufferedWriter = new BufferedWriter(new FileWriter(file, false));
                        } catch (IOException e5) {
                            e = e5;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                    try {
                        String[] strArr = readTargetDumpInfo.f62357d.get("main");
                        int i4 = 3;
                        if (strArr != null && strArr.length >= 3) {
                            String str4 = strArr[0];
                            String str5 = strArr[1];
                            String str6 = strArr[2];
                            bufferedWriter.write("\"main\" tid=" + str6 + " :\n" + str4 + "\n" + str5 + "\n\n");
                            bufferedWriter.flush();
                        }
                        for (Map.Entry<String, String[]> entry : readTargetDumpInfo.f62357d.entrySet()) {
                            if (!entry.getKey().equals("main")) {
                                if (entry.getValue() != null && entry.getValue().length >= i4) {
                                    String str7 = entry.getValue()[0];
                                    String str8 = entry.getValue()[1];
                                    String str9 = entry.getValue()[2];
                                    bufferedWriter.write(m.a.f71493g + entry.getKey() + "\" tid=" + str9 + " :\n" + str7 + "\n" + str8 + "\n\n");
                                    bufferedWriter.flush();
                                }
                                i4 = 3;
                            }
                        }
                        try {
                            bufferedWriter.close();
                        } catch (IOException e6) {
                            if (!x.a(e6)) {
                                e6.printStackTrace();
                            }
                        }
                        return true;
                    } catch (IOException e7) {
                        e = e7;
                        bufferedWriter2 = bufferedWriter;
                        if (!x.a(e)) {
                            e.printStackTrace();
                        }
                        x.e("dump trace fail %s", e.getClass().getName() + ":" + e.getMessage());
                        if (bufferedWriter2 != null) {
                            try {
                                bufferedWriter2.close();
                            } catch (IOException e8) {
                                if (!x.a(e8)) {
                                    e8.printStackTrace();
                                }
                            }
                        }
                        return false;
                    } catch (Throwable th3) {
                        th = th3;
                        bufferedWriter2 = bufferedWriter;
                        if (bufferedWriter2 != null) {
                            try {
                                bufferedWriter2.close();
                            } catch (IOException e9) {
                                if (!x.a(e9)) {
                                    e9.printStackTrace();
                                }
                            }
                        }
                        throw th;
                    }
                }
                x.e("backup file create fail %s", str2);
                return false;
            } catch (Exception e10) {
                if (!x.a(e10)) {
                    e10.printStackTrace();
                }
                x.e("backup file create error! %s  %s", e10.getClass().getName() + ":" + e10.getMessage(), str2);
                return false;
            }
        }
        x.e("not found trace dump for %s", str3);
        return false;
    }

    public final boolean a() {
        return this.f62366a.get() != 0;
    }

    private boolean a(Context context, String str, ActivityManager.ProcessErrorStateInfo processErrorStateInfo, long j4, Map<String, String> map) {
        a aVar = new a();
        aVar.f62360c = j4;
        aVar.f62358a = processErrorStateInfo != null ? processErrorStateInfo.processName : AppInfo.a(Process.myPid());
        aVar.f62363f = processErrorStateInfo != null ? processErrorStateInfo.shortMsg : "";
        aVar.f62362e = processErrorStateInfo != null ? processErrorStateInfo.longMsg : "";
        aVar.f62359b = map;
        Thread thread = Looper.getMainLooper().getThread();
        if (map != null) {
            Iterator<String> it2 = map.keySet().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                String next = it2.next();
                if (next.startsWith(thread.getName())) {
                    aVar.f62364g = map.get(next);
                    break;
                }
            }
        }
        if (TextUtils.isEmpty(aVar.f62364g)) {
            aVar.f62364g = "main stack is null , some error may be encountered.";
        }
        Object[] objArr = new Object[7];
        objArr[0] = Long.valueOf(aVar.f62360c);
        objArr[1] = aVar.f62361d;
        objArr[2] = aVar.f62358a;
        objArr[3] = aVar.f62364g;
        objArr[4] = aVar.f62363f;
        objArr[5] = aVar.f62362e;
        Map<String, String> map2 = aVar.f62359b;
        objArr[6] = Integer.valueOf(map2 == null ? 0 : map2.size());
        x.c("anr tm:%d\ntr:%s\nproc:%s\nmain stack:%s\nsMsg:%s\n lMsg:%s\n threads:%d", objArr);
        x.a("found visiable anr , start to upload!", new Object[0]);
        CrashDetailBean a5 = a(aVar);
        if (a5 == null) {
            x.e("pack anr fail!", new Object[0]);
            return false;
        }
        c.a().a(a5);
        if (a5.f62317a >= 0) {
            x.a("backup anr record success!", new Object[0]);
        } else {
            x.d("backup anr record fail!", new Object[0]);
        }
        if (str != null && new File(str).exists()) {
            String str2 = this.f62371f;
            aVar.f62361d = new File(str2, "bugly_trace_" + j4 + ".txt").getAbsolutePath();
            this.f62366a.set(3);
            if (a(str, aVar.f62361d, aVar.f62358a)) {
                x.a("backup trace success", new Object[0]);
            }
        } else {
            File h4 = h();
            x.a("traceFile is %s", h4);
            if (h4 != null) {
                a5.f62338v = h4.getAbsolutePath();
            }
        }
        com.tencent.bugly.crashreport.crash.b.a("ANR", z.a(), aVar.f62358a, "main", aVar.f62364g, a5);
        if (!this.f62372g.a(a5)) {
            this.f62372g.a(a5, 3000L, true);
        }
        this.f62372g.c(a5);
        return true;
    }

    public final void a(String str) {
        synchronized (this) {
            if (this.f62366a.get() != 0) {
                x.c("trace started return ", new Object[0]);
                return;
            }
            this.f62366a.set(1);
            try {
                x.c("read trace first dump for create time!", new Object[0]);
                TraceFileHelper.a readFirstDumpInfo = TraceFileHelper.readFirstDumpInfo(str, false);
                long j4 = readFirstDumpInfo != null ? readFirstDumpInfo.f62356c : -1L;
                if (j4 == -1) {
                    x.d("trace dump fail could not get time!", new Object[0]);
                    j4 = System.currentTimeMillis();
                }
                long j5 = j4;
                if (Math.abs(j5 - this.f62367b) < com.join.mgps.data.c.f49010a) {
                    x.d("should not process ANR too Fre in %d", 10000);
                } else {
                    this.f62367b = j5;
                    this.f62366a.set(1);
                    Map<String, String> a5 = z.a(c.f62399f, false);
                    if (a5 != null && a5.size() > 0) {
                        ActivityManager.ProcessErrorStateInfo a6 = a(this.f62368c, 20000L);
                        this.f62377l = a6;
                        if (a6 == null) {
                            x.c("proc state is unvisiable!", new Object[0]);
                        } else if (a6.pid != Process.myPid()) {
                            x.c("not mind proc!", this.f62377l.processName);
                        } else {
                            x.a("found visiable anr , start to process!", new Object[0]);
                            a(this.f62368c, str, this.f62377l, j5, a5);
                        }
                    }
                    x.d("can't get all thread skip this anr", new Object[0]);
                }
            } finally {
                try {
                } finally {
                }
            }
        }
    }

    public final void a(boolean z4) {
        c(z4);
        boolean g4 = g();
        com.tencent.bugly.crashreport.common.strategy.a a5 = com.tencent.bugly.crashreport.common.strategy.a.a();
        if (a5 != null) {
            g4 = g4 && a5.c().f62283e;
        }
        if (g4 != f()) {
            x.a("anr changed to %b", Boolean.valueOf(g4));
            b(g4);
        }
    }

    @Override // com.tencent.bugly.proguard.ac
    public final boolean a(aa aaVar) {
        Map<String, String> hashMap = new HashMap<>();
        if (aaVar.e().equals(Looper.getMainLooper())) {
            try {
                hashMap = z.a(200000, false);
            } catch (Throwable th) {
                x.b(th);
                hashMap.put("main", th.getMessage());
            }
            Map<String, String> map = hashMap;
            x.c("onThreadBlock found visiable anr , start to process!", new Object[0]);
            String c5 = com.tencent.bugly.crashreport.common.info.b.c(this.f62368c);
            if (!TextUtils.isEmpty(c5) && (c5.contains("XiaoMi") || c5.contains("samsung"))) {
                this.f62377l = a(this.f62368c, 20000L);
            }
            a(this.f62368c, "", this.f62377l, System.currentTimeMillis(), map);
        } else {
            x.c("anr handler onThreadBlock only care main thread ,current thread is: %s", aaVar.d());
        }
        return true;
    }
}
