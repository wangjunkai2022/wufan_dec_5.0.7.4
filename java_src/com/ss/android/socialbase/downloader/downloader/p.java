package com.ss.android.socialbase.downloader.downloader;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.ss.android.socialbase.downloader.depend.a;
import com.ss.android.socialbase.downloader.depend.ff;
import com.ss.android.socialbase.downloader.depend.ot;
import com.ss.android.socialbase.downloader.downloader.y;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.impls.DownloadHandleService;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.DownloadTask;
import com.ss.android.socialbase.downloader.network.IDownloadHttpService;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import okhttp3.Dispatcher;
import okhttp3.Dns;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import org.cocos2dx.lib.GameControllerDelegate;
import org.json.JSONObject;
/* loaded from: classes5.dex */
public class p {

    /* renamed from: b  reason: collision with root package name */
    private static volatile com.ss.android.socialbase.downloader.network.qv f61021b;
    private static volatile boolean cl;

    /* renamed from: d  reason: collision with root package name */
    private static volatile ExecutorService f61023d;
    private static int ds;

    /* renamed from: e  reason: collision with root package name */
    private static final List<Object> f61024e;
    private static final List<com.ss.android.socialbase.downloader.depend.b> ev;

    /* renamed from: f  reason: collision with root package name */
    private static volatile y f61025f;
    private static volatile d ff;
    private static boolean fo;

    /* renamed from: g  reason: collision with root package name */
    private static volatile ExecutorService f61026g;

    /* renamed from: i  reason: collision with root package name */
    private static volatile qv f61027i;

    /* renamed from: j  reason: collision with root package name */
    private static volatile ExecutorService f61028j;
    private static final int jb;
    private static volatile IDownloadHttpService jh;
    private static int ju;

    /* renamed from: k  reason: collision with root package name */
    private static volatile IDownloadHttpService f61029k;
    private static final int ky;

    /* renamed from: l  reason: collision with root package name */
    private static volatile n f61030l;
    private static volatile ExecutorService la;
    private static final int lb;

    /* renamed from: m  reason: collision with root package name */
    private static volatile k f61031m;

    /* renamed from: n  reason: collision with root package name */
    private static volatile q f61032n;
    private static boolean nn;
    private static volatile DownloadReceiver ns;

    /* renamed from: o  reason: collision with root package name */
    private static volatile a f61033o;

    /* renamed from: p  reason: collision with root package name */
    private static volatile b f61034p;
    private static volatile ff pd;
    private static volatile com.ss.android.socialbase.downloader.network.u pj;

    /* renamed from: q  reason: collision with root package name */
    private static volatile ExecutorService f61035q;
    private static boolean qb;
    private static volatile q qv;

    /* renamed from: r  reason: collision with root package name */
    private static volatile com.ss.android.socialbase.downloader.network.qv f61036r;

    /* renamed from: s  reason: collision with root package name */
    private static final int f61037s;

    /* renamed from: t  reason: collision with root package name */
    private static volatile jh f61038t;
    private static volatile com.ss.android.socialbase.downloader.i.m td;
    private static int tf;
    private static g to;

    /* renamed from: u  reason: collision with root package name */
    private static volatile com.ss.android.socialbase.downloader.impls.vv f61039u;

    /* renamed from: v  reason: collision with root package name */
    private static volatile ExecutorService f61040v;
    private static volatile la vu;
    private static volatile Context vv;
    private static volatile vv wv;

    /* renamed from: x  reason: collision with root package name */
    private static volatile ExecutorService f61042x;

    /* renamed from: y  reason: collision with root package name */
    private static volatile ExecutorService f61043y;
    private static volatile ScheduledExecutorService ya;
    private static com.ss.android.socialbase.downloader.i.p yj;
    private static volatile com.ss.android.socialbase.downloader.network.u zn;

    /* renamed from: w  reason: collision with root package name */
    private static volatile List<ot> f61041w = new ArrayList();

    /* renamed from: a  reason: collision with root package name */
    private static volatile boolean f61020a = false;

    /* renamed from: c  reason: collision with root package name */
    private static volatile OkHttpClient f61022c = null;
    private static final List<com.ss.android.socialbase.downloader.depend.r> ot = new ArrayList();
    private static boolean cq = false;

    /* loaded from: classes5.dex */
    public interface vv {

        /* renamed from: com.ss.android.socialbase.downloader.downloader.p$vv$vv  reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public interface InterfaceC0641vv {
            void vv();
        }

        r m();

        q vv();

        x vv(InterfaceC0641vv interfaceC0641vv);
    }

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors() + 1;
        jb = availableProcessors;
        lb = (Runtime.getRuntime().availableProcessors() * 2) + 1;
        ky = availableProcessors;
        f61037s = availableProcessors;
        ds = 8192;
        ev = new ArrayList();
        f61024e = new ArrayList();
        nn = true;
        qb = false;
        cl = false;
    }

    private p() {
    }

    public static int a() {
        return ju;
    }

    public static synchronized d b() {
        d dVar;
        synchronized (p.class) {
            dVar = ff;
        }
        return dVar;
    }

    @NonNull
    public static JSONObject c() {
        if (pd != null && pd.vv() != null) {
            return pd.vv();
        }
        return com.ss.android.socialbase.downloader.constants.o.wv;
    }

    public static a cq() {
        return f61033o;
    }

    public static ExecutorService d() {
        if (f61043y == null) {
            synchronized (p.class) {
                if (f61043y == null) {
                    int i4 = lb;
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i4, i4, 15L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new com.ss.android.socialbase.downloader.qv.vv("DownloadThreadPool-chunk-fixed", true));
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    f61043y = threadPoolExecutor;
                }
            }
        }
        return f61043y;
    }

    @NonNull
    public static com.ss.android.socialbase.downloader.i.p ds() {
        if (yj == null) {
            yj = new com.ss.android.socialbase.downloader.i.p() { // from class: com.ss.android.socialbase.downloader.downloader.p.3
                @Override // com.ss.android.socialbase.downloader.i.p
                public void m(int i4, String str, JSONObject jSONObject) {
                }

                @Override // com.ss.android.socialbase.downloader.i.p
                public void vv(int i4, String str, JSONObject jSONObject) {
                }
            };
        }
        return yj;
    }

    public static boolean e() {
        StringBuilder sb = new StringBuilder("supportMultiProc::=");
        sb.append(wv != null);
        com.ss.android.socialbase.downloader.p.vv.vv("wjd", sb.toString());
        return wv != null;
    }

    public static boolean ev() {
        return cl;
    }

    public static synchronized int f() {
        int i4;
        synchronized (p.class) {
            i4 = ds;
        }
        return i4;
    }

    public static q ff() {
        if (qv == null) {
            synchronized (p.class) {
                if (qv == null) {
                    qv = wv.vv();
                }
            }
        }
        return qv;
    }

    public static g fo() {
        return to;
    }

    public static ExecutorService g() {
        if (f61042x == null) {
            synchronized (p.class) {
                if (f61042x == null) {
                    int i4 = f61037s;
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i4, i4, 15L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new com.ss.android.socialbase.downloader.qv.vv("DownloadThreadPool-db-fixed", true));
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    f61042x = threadPoolExecutor;
                }
            }
        }
        return f61042x;
    }

    public static IDownloadHttpService i() {
        return f61029k;
    }

    public static ExecutorService j() {
        if (f61023d == null) {
            synchronized (p.class) {
                if (f61023d == null) {
                    int i4 = ky;
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i4, i4, 15L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new com.ss.android.socialbase.downloader.qv.vv("DownloadThreadPool-mix-fixed", true));
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    f61023d = threadPoolExecutor;
                }
            }
        }
        return f61023d;
    }

    public static la jb() {
        if (vu == null) {
            synchronized (p.class) {
                if (vu == null) {
                    vu = new com.ss.android.socialbase.downloader.impls.k();
                }
            }
        }
        return vu;
    }

    public static ExecutorService jh() {
        if (f61035q == null) {
            synchronized (p.class) {
                if (f61035q == null) {
                    int i4 = jb;
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i4, i4, 15L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new com.ss.android.socialbase.downloader.qv.vv("DownloadThreadPool-cpu-fixed", true));
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    f61035q = threadPoolExecutor;
                }
            }
        }
        return f61035q;
    }

    public static vv ju() {
        return wv;
    }

    public static boolean k() {
        return com.ss.android.socialbase.downloader.n.vv.p().vv("switch_not_auto_boot_service", qb ? 1 : 0) > 0;
    }

    public static synchronized Context ky() {
        Context context;
        synchronized (p.class) {
            context = vv;
        }
        return context;
    }

    public static synchronized jh l() {
        jh jhVar;
        synchronized (p.class) {
            jhVar = f61038t;
        }
        return jhVar;
    }

    public static OkHttpClient la() {
        if (f61022c == null) {
            synchronized (p.class) {
                if (f61022c == null) {
                    f61022c = y().build();
                }
            }
        }
        return f61022c;
    }

    public static y lb() {
        if (f61025f == null) {
            synchronized (p.class) {
                if (f61025f == null) {
                    f61025f = new y.vv();
                }
            }
        }
        return f61025f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static synchronized void m(DownloaderBuilder downloaderBuilder) {
        synchronized (p.class) {
            p(downloaderBuilder);
        }
    }

    public static com.ss.android.socialbase.downloader.i.m n() {
        return td;
    }

    private static void nn() {
        if (ns == null) {
            ns = new DownloadReceiver();
        }
        if (cq) {
            return;
        }
        try {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            vv.registerReceiver(ns, intentFilter);
            cq = true;
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static k ns() {
        if (f61031m == null) {
            synchronized (p.class) {
                if (f61031m == null) {
                    f61031m = new com.ss.android.socialbase.downloader.impls.i();
                }
            }
        }
        return f61031m;
    }

    public static List<ot> o() {
        List<ot> list;
        synchronized (f61041w) {
            list = f61041w;
        }
        return list;
    }

    public static qv ot() {
        if (f61027i == null) {
            synchronized (p.class) {
                if (f61027i == null) {
                    f61027i = new com.ss.android.socialbase.downloader.impls.p();
                }
            }
        }
        return f61027i;
    }

    private static void p(DownloaderBuilder downloaderBuilder) {
        if (downloaderBuilder != null) {
            if (downloaderBuilder.getContext() != null) {
                vv(downloaderBuilder.getContext());
            }
            if (downloaderBuilder.getDownloadCache() != null) {
                vv(downloaderBuilder.getDownloadCache());
            }
            if (downloaderBuilder.getIdGenerator() != null) {
                vv(downloaderBuilder.getIdGenerator());
            }
            if (downloaderBuilder.getChunkCntCalculator() != null) {
                vv(downloaderBuilder.getChunkCntCalculator());
            }
            if (downloaderBuilder.getNotificationClickCallback() != null) {
                vv(downloaderBuilder.getNotificationClickCallback());
            }
            if (downloaderBuilder.getMaxDownloadPoolSize() != 0) {
                m(downloaderBuilder.getMaxDownloadPoolSize());
            }
            if (downloaderBuilder.getHttpService() != null) {
                vv(downloaderBuilder.getHttpService());
            }
            if (downloaderBuilder.getHeadHttpService() != null) {
                vv(downloaderBuilder.getHeadHttpService());
            }
            if (downloaderBuilder.getDownloadLaunchHandler() != null) {
                vv(downloaderBuilder.getDownloadLaunchHandler());
            }
            if (downloaderBuilder.getCPUThreadExecutor() != null) {
                p(downloaderBuilder.getCPUThreadExecutor());
            }
            if (downloaderBuilder.getIOThreadExecutor() != null) {
                i(downloaderBuilder.getIOThreadExecutor());
            }
            if (downloaderBuilder.getMixDefaultDownloadExecutor() != null) {
                o(downloaderBuilder.getMixDefaultDownloadExecutor());
            }
            if (downloaderBuilder.getMixFrequentDownloadExecutor() != null) {
                u(downloaderBuilder.getMixFrequentDownloadExecutor());
            }
            if (downloaderBuilder.getMixApkDownloadExecutor() != null) {
                n(downloaderBuilder.getMixApkDownloadExecutor());
            }
            if (downloaderBuilder.getDBThreadExecutor() != null) {
                qv(downloaderBuilder.getDBThreadExecutor());
            }
            if (downloaderBuilder.getChunkThreadExecutor() != null) {
                vv(downloaderBuilder.getChunkThreadExecutor());
            }
            if (downloaderBuilder.getOkHttpDispatcherExecutor() != null) {
                m(downloaderBuilder.getOkHttpDispatcherExecutor());
            }
            if (!downloaderBuilder.getDownloadCompleteHandlers().isEmpty()) {
                vv(downloaderBuilder.getDownloadCompleteHandlers());
            }
            if (downloaderBuilder.getMonitorConfig() != null) {
                ff = downloaderBuilder.getMonitorConfig();
            }
            if (downloaderBuilder.getWriteBufferSize() > 1024) {
                ds = downloaderBuilder.getWriteBufferSize();
            }
            if (downloaderBuilder.getChunkAdjustCalculator() != null) {
                vv(downloaderBuilder.getChunkAdjustCalculator());
            }
            if (downloaderBuilder.isDownloadInMultiProcess()) {
                f61020a = true;
            }
            if (downloaderBuilder.getDownloadExpSwitch() != 0) {
                ju = downloaderBuilder.getDownloadExpSwitch();
            }
            if (downloaderBuilder.getDownloadSetting() != null) {
                vv(downloaderBuilder.getDownloadSetting());
            }
            if (downloaderBuilder.getDownloadDns() != null) {
                zn = downloaderBuilder.getDownloadDns();
            }
            if (downloaderBuilder.getTTNetHandler() != null) {
                y tTNetHandler = downloaderBuilder.getTTNetHandler();
                f61025f = tTNetHandler;
                if (tTNetHandler.vv()) {
                    vv(f61025f.m());
                    vv(f61025f.p());
                } else {
                    vv(qv());
                    vv(wv());
                }
            }
            m(downloaderBuilder.needAutoRefreshUnSuccessTask());
            if (downloaderBuilder.getDownloadMonitorListener() != null) {
                vv(downloaderBuilder.getDownloadMonitorListener());
            }
        }
    }

    public static b pd() {
        if (f61034p == null) {
            synchronized (p.class) {
                if (f61034p == null) {
                    f61034p = new com.ss.android.socialbase.downloader.impls.wv();
                }
            }
        }
        return f61034p;
    }

    public static boolean pj() {
        return nn;
    }

    public static ExecutorService q() {
        return la != null ? la : j();
    }

    public static IDownloadHttpService qv() {
        if (jh == null) {
            synchronized (p.class) {
                if (jh == null) {
                    jh = new com.ss.android.socialbase.downloader.impls.n();
                }
            }
        }
        return jh;
    }

    public static ExecutorService r() {
        return f61028j != null ? f61028j : jh();
    }

    public static synchronized boolean s() {
        boolean z4;
        synchronized (p.class) {
            z4 = fo;
        }
        return z4;
    }

    public static ExecutorService t() {
        return f61026g != null ? f61026g : j();
    }

    public static List<com.ss.android.socialbase.downloader.depend.r> td() {
        return ot;
    }

    public static n tf() {
        if (f61030l == null) {
            synchronized (p.class) {
                if (f61030l == null) {
                    f61030l = new com.ss.android.socialbase.downloader.impls.m();
                }
            }
        }
        return f61030l;
    }

    public static com.ss.android.socialbase.downloader.network.qv u() {
        return f61021b;
    }

    public static com.ss.android.socialbase.downloader.network.u v() {
        return zn;
    }

    public static q vu() {
        if (f61032n == null) {
            synchronized (p.class) {
                if (f61032n == null) {
                    f61032n = new com.ss.android.socialbase.downloader.impls.qv();
                }
            }
        }
        return f61032n;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static synchronized void vv(DownloaderBuilder downloaderBuilder) {
        synchronized (p.class) {
            if (cl) {
                com.ss.android.socialbase.downloader.p.vv.o("DownloadComponentManager", "component has init");
                return;
            }
            boolean z4 = f61020a;
            p(downloaderBuilder);
            if (f61031m == null) {
                f61031m = new com.ss.android.socialbase.downloader.impls.i();
            }
            if (f61032n == null) {
                f61032n = new com.ss.android.socialbase.downloader.impls.qv();
            }
            if (qv == null && wv != null) {
                qv = wv.vv();
            }
            if (f61034p == null) {
                f61034p = new com.ss.android.socialbase.downloader.impls.wv();
            }
            if (f61039u == null) {
                f61039u = new com.ss.android.socialbase.downloader.impls.o();
            }
            if (f61027i == null) {
                f61027i = new com.ss.android.socialbase.downloader.impls.p();
            }
            if (f61030l == null) {
                f61030l = new com.ss.android.socialbase.downloader.impls.m();
            }
            if (vu == null) {
                vu = new com.ss.android.socialbase.downloader.impls.k();
            }
            int i4 = tf;
            if (i4 <= 0 || i4 > jb) {
                tf = jb;
            }
            nn();
            if (f61020a && !z4 && !com.ss.android.socialbase.downloader.wv.u.p()) {
                com.ss.android.socialbase.downloader.impls.jh.vv(true).startService();
            } else if (com.ss.android.socialbase.downloader.wv.u.i()) {
                ExecutorService r4 = r();
                if (r4 != null) {
                    r4.execute(new Runnable() { // from class: com.ss.android.socialbase.downloader.downloader.p.1
                        @Override // java.lang.Runnable
                        public void run() {
                            Context ky2 = p.ky();
                            if (ky2 != null) {
                                com.ss.android.socialbase.downloader.wv.u.i(ky2);
                            }
                        }
                    });
                }
            } else {
                Context ky2 = ky();
                if (ky2 != null) {
                    com.ss.android.socialbase.downloader.wv.u.i(ky2);
                }
            }
            zn();
            cl = true;
        }
    }

    public static void vv(g gVar) {
    }

    public static com.ss.android.socialbase.downloader.impls.vv w() {
        if (f61039u == null) {
            synchronized (p.class) {
                if (f61039u == null) {
                    f61039u = new com.ss.android.socialbase.downloader.impls.o();
                }
            }
        }
        return f61039u;
    }

    public static com.ss.android.socialbase.downloader.network.qv wv() {
        if (f61036r == null) {
            synchronized (p.class) {
                if (f61036r == null) {
                    f61036r = new com.ss.android.socialbase.downloader.impls.u();
                }
            }
        }
        return f61036r;
    }

    public static ScheduledExecutorService x() {
        if (ya == null) {
            synchronized (p.class) {
                if (ya == null) {
                    ya = new ScheduledThreadPoolExecutor(1, new com.ss.android.socialbase.downloader.qv.vv("DownloadThreadPool-Schedule", true));
                }
            }
        }
        return ya;
    }

    public static OkHttpClient.Builder y() {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        builder.connectTimeout(30000L, timeUnit).readTimeout(30000L, timeUnit).writeTimeout(30000L, timeUnit).retryOnConnectionFailure(true).followRedirects(true).protocols(Collections.singletonList(Protocol.HTTP_1_1));
        if (f61040v != null) {
            builder.dispatcher(new Dispatcher(f61040v));
        }
        return builder;
    }

    public static com.ss.android.socialbase.downloader.network.u ya() {
        if (pj == null) {
            synchronized (p.class) {
                if (pj == null) {
                    pj = new com.ss.android.socialbase.downloader.network.u() { // from class: com.ss.android.socialbase.downloader.downloader.p.2
                        @Override // com.ss.android.socialbase.downloader.network.u
                        public List<InetAddress> vv(String str) throws UnknownHostException {
                            return Dns.SYSTEM.lookup(str);
                        }
                    };
                }
            }
        }
        return pj;
    }

    public static void zn() {
        if (TextUtils.isEmpty(com.ss.android.socialbase.downloader.constants.o.f60949p)) {
            com.ss.android.socialbase.downloader.constants.o.f60949p = "oppo";
            com.ss.android.socialbase.downloader.constants.o.f60946m = "oppo".toUpperCase();
        }
    }

    private static void i(ExecutorService executorService) {
        if (executorService != null) {
            f61028j = executorService;
        }
    }

    private static void n(ExecutorService executorService) {
        if (executorService != null) {
            la = executorService;
        }
    }

    private static void u(ExecutorService executorService) {
        if (executorService != null) {
            f61026g = executorService;
        }
    }

    public static synchronized void m() {
        synchronized (p.class) {
            if (f61020a) {
                return;
            }
            f61020a = true;
            Intent intent = new Intent(ky(), DownloadHandleService.class);
            intent.setAction("com.ss.android.downloader.action.MULTI_PROCESS_NOTIFY");
            ky().startService(intent);
            if (!com.ss.android.socialbase.downloader.wv.u.p()) {
                com.ss.android.socialbase.downloader.impls.jh.vv(true).startService();
            }
        }
    }

    private static void o(ExecutorService executorService) {
        if (executorService != null) {
            f61023d = executorService;
        }
    }

    private static void qv(ExecutorService executorService) {
        if (executorService != null) {
            f61042x = executorService;
        }
    }

    public static void m(com.ss.android.socialbase.downloader.depend.b bVar) {
        List<com.ss.android.socialbase.downloader.depend.b> list = ev;
        synchronized (list) {
            if (bVar != null) {
                if (list.contains(bVar)) {
                    list.remove(bVar);
                }
            }
        }
    }

    public static void m(DownloadTask downloadTask, int i4) {
        List<Object> list = f61024e;
        synchronized (list) {
            Iterator<Object> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static com.ss.android.socialbase.downloader.network.n m(java.lang.String r12, java.util.List<com.ss.android.socialbase.downloader.model.p> r13, int r14, boolean r15, com.ss.android.socialbase.downloader.model.DownloadInfo r16) throws com.ss.android.socialbase.downloader.exception.BaseException, java.io.IOException {
        /*
            r7 = r14
            r0 = 1
            if (r7 != r0) goto L9
            com.ss.android.socialbase.downloader.network.qv r0 = u()
            goto Ld
        L9:
            com.ss.android.socialbase.downloader.network.qv r0 = wv()
        Ld:
            if (r0 == 0) goto L5a
            r1 = 0
            r2 = 0
            r3 = 0
            if (r15 == 0) goto L20
            long r3 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L1a java.io.IOException -> L1d
            goto L20
        L1a:
            r0 = move-exception
            r5 = r12
            goto L40
        L1d:
            r0 = move-exception
            r5 = r12
            goto L43
        L20:
            r5 = r12
            r6 = r13
            com.ss.android.socialbase.downloader.network.n r0 = r0.vv(r12, r13)     // Catch: java.lang.Throwable -> L3f java.io.IOException -> L42
            if (r15 == 0) goto L3e
            r6 = 0
            long r1 = java.lang.System.currentTimeMillis()
            long r8 = r1 - r3
            r10 = 0
            java.lang.String r11 = "head"
            r1 = r0
            r2 = r12
            r3 = r6
            r4 = r8
            r6 = r11
            r7 = r14
            r8 = r10
            r9 = r16
            com.ss.android.socialbase.downloader.i.vv.vv(r1, r2, r3, r4, r6, r7, r8, r9)
        L3e:
            return r0
        L3f:
            r0 = move-exception
        L40:
            r8 = r2
            goto L45
        L42:
            r0 = move-exception
        L43:
            r2 = r0
            throw r2     // Catch: java.lang.Throwable -> L3f
        L45:
            if (r15 == 0) goto L59
            r6 = 0
            long r9 = java.lang.System.currentTimeMillis()
            long r9 = r9 - r3
            java.lang.String r11 = "head"
            r2 = r12
            r3 = r6
            r4 = r9
            r6 = r11
            r7 = r14
            r9 = r16
            com.ss.android.socialbase.downloader.i.vv.vv(r1, r2, r3, r4, r6, r7, r8, r9)
        L59:
            throw r0
        L5a:
            com.ss.android.socialbase.downloader.exception.BaseException r0 = new com.ss.android.socialbase.downloader.exception.BaseException
            r1 = 1022(0x3fe, float:1.432E-42)
            java.io.IOException r2 = new java.io.IOException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "httpService not exist, netLib = "
            r3.<init>(r4)
            r3.append(r14)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            r0.<init>(r1, r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.socialbase.downloader.downloader.p.m(java.lang.String, java.util.List, int, boolean, com.ss.android.socialbase.downloader.model.DownloadInfo):com.ss.android.socialbase.downloader.network.n");
    }

    public static void m(ExecutorService executorService) {
        if (executorService != null) {
            f61040v = executorService;
        }
    }

    public static void m(Runnable runnable) {
        m(runnable, false);
    }

    public static void m(Runnable runnable, boolean z4) {
        if (runnable == null) {
            return;
        }
        if (z4 && !com.ss.android.socialbase.downloader.wv.u.i()) {
            runnable.run();
        } else {
            r().execute(runnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static synchronized void vv() {
        synchronized (p.class) {
            try {
                if (cq && ns != null && vv != null) {
                    vv.unregisterReceiver(ns);
                    cq = false;
                }
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    private static void m(int i4) {
        if (i4 > 0) {
            tf = i4;
        }
    }

    private static void m(boolean z4) {
        nn = z4;
    }

    public static void vv(ot otVar) {
        if (otVar == null) {
            return;
        }
        synchronized (f61041w) {
            f61041w.add(otVar);
        }
    }

    public static void vv(com.ss.android.socialbase.downloader.depend.b bVar) {
        List<com.ss.android.socialbase.downloader.depend.b> list = ev;
        synchronized (list) {
            if (bVar != null) {
                if (!list.contains(bVar)) {
                    list.add(bVar);
                }
            }
        }
    }

    public static void vv(com.ss.android.socialbase.downloader.constants.i iVar) {
        List<com.ss.android.socialbase.downloader.depend.b> list = ev;
        synchronized (list) {
            for (com.ss.android.socialbase.downloader.depend.b bVar : list) {
                if (bVar != null && iVar != com.ss.android.socialbase.downloader.constants.i.SYNC_START && iVar == com.ss.android.socialbase.downloader.constants.i.SYNC_SUCCESS) {
                    bVar.vv();
                }
            }
            if (iVar == com.ss.android.socialbase.downloader.constants.i.SYNC_SUCCESS) {
                ev.clear();
            }
        }
    }

    public static synchronized boolean p() {
        boolean z4;
        synchronized (p.class) {
            z4 = f61020a;
        }
        return z4;
    }

    public static void vv(DownloadTask downloadTask, int i4) {
        List<Object> list = f61024e;
        synchronized (list) {
            Iterator<Object> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
    }

    private static void p(ExecutorService executorService) {
        if (executorService != null) {
            f61035q = executorService;
        }
    }

    public static void p(Runnable runnable) {
        if (runnable == null) {
            return;
        }
        if (!com.ss.android.socialbase.downloader.wv.u.i()) {
            runnable.run();
        } else {
            g().execute(runnable);
        }
    }

    public static com.ss.android.socialbase.downloader.network.wv vv(boolean z4, int i4, String str, List<com.ss.android.socialbase.downloader.model.p> list) throws Exception {
        return vv(z4, i4, str, null, list, 0, false, null);
    }

    public static com.ss.android.socialbase.downloader.network.wv vv(boolean z4, int i4, String str, String str2, List<com.ss.android.socialbase.downloader.model.p> list, int i5, boolean z5, DownloadInfo downloadInfo) throws Exception {
        List<com.ss.android.socialbase.downloader.model.p> list2;
        int i6;
        com.ss.android.socialbase.downloader.network.wv vv2;
        if (!TextUtils.isEmpty(str2)) {
            List<com.ss.android.socialbase.downloader.model.p> arrayList = list == null ? new ArrayList<>() : list;
            arrayList.add(new com.ss.android.socialbase.downloader.model.p("ss_d_request_host_ip_114", str2));
            list2 = arrayList;
            i6 = 1;
        } else if (z4) {
            list2 = list;
            i6 = i5;
        } else {
            i6 = 2;
            list2 = list;
        }
        int[] vv3 = vv(i6);
        Exception exc = null;
        for (int i7 : vv3) {
            try {
                vv2 = vv(i4, str, str2, list2, i7, z5, downloadInfo);
            } catch (Exception e5) {
                if (downloadInfo.isExpiredRedownload() && com.ss.android.socialbase.downloader.wv.u.n(e5) && com.ss.android.socialbase.downloader.wv.u.p(list2)) {
                    com.ss.android.socialbase.downloader.p.vv.vv("dcach::http exception 304, throw excepiton, not retry " + e5);
                    throw e5;
                }
                exc = e5;
            }
            if (vv2 != null) {
                return vv2;
            }
        }
        if (exc == null) {
            return null;
        }
        throw exc;
    }

    private static com.ss.android.socialbase.downloader.network.wv vv(int i4, String str, String str2, List<com.ss.android.socialbase.downloader.model.p> list, int i5, boolean z4, DownloadInfo downloadInfo) throws BaseException, IOException {
        IDownloadHttpService i6 = i5 == 1 ? i() : qv();
        if (i6 != null) {
            long j4 = 0;
            try {
                if (z4) {
                    try {
                        j4 = System.currentTimeMillis();
                    } catch (IOException e5) {
                        e = e5;
                        throw e;
                    } catch (Throwable th) {
                        th = th;
                        if (z4) {
                            com.ss.android.socialbase.downloader.i.vv.vv(null, str, str2, System.currentTimeMillis() - 0, "get", i5, null, downloadInfo);
                        }
                        throw th;
                    }
                }
                try {
                    com.ss.android.socialbase.downloader.network.wv downloadWithConnection = i6.downloadWithConnection(i4, str, list);
                    if (z4) {
                        com.ss.android.socialbase.downloader.i.vv.vv(downloadWithConnection, str, str2, System.currentTimeMillis() - j4, "get", i5, null, downloadInfo);
                    }
                    return downloadWithConnection;
                } catch (IOException e6) {
                    e = e6;
                    throw e;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } else {
            throw new BaseException((int) GameControllerDelegate.BUTTON_SELECT, new IOException("httpService not exist, netLib = " + i5));
        }
    }

    public static com.ss.android.socialbase.downloader.network.n vv(String str, List<com.ss.android.socialbase.downloader.model.p> list) throws Exception {
        return vv(str, list, 0, false, null);
    }

    public static com.ss.android.socialbase.downloader.network.n vv(String str, List<com.ss.android.socialbase.downloader.model.p> list, int i4, boolean z4, DownloadInfo downloadInfo) throws Exception {
        com.ss.android.socialbase.downloader.network.n m4;
        Exception e5 = null;
        for (int i5 : vv(i4)) {
            try {
                m4 = m(str, list, i5, z4, downloadInfo);
            } catch (Exception e6) {
                e5 = e6;
            }
            if (m4 != null) {
                return m4;
            }
        }
        if (e5 == null) {
            return null;
        }
        throw e5;
    }

    private static int[] vv(int i4) {
        return i4 != 1 ? i4 != 2 ? i4 != 3 ? new int[]{1, 0} : new int[]{0, 1} : new int[]{1} : new int[]{0};
    }

    public static synchronized void vv(jh jhVar) {
        synchronized (p.class) {
            if (jhVar != null) {
                f61038t = jhVar;
                if (f61031m instanceof com.ss.android.socialbase.downloader.impls.i) {
                    ((com.ss.android.socialbase.downloader.impls.i) f61031m).qv();
                }
            }
        }
    }

    public static void vv(ExecutorService executorService) {
        if (executorService != null) {
            f61043y = executorService;
        }
    }

    private static void vv(List<com.ss.android.socialbase.downloader.depend.r> list) {
        List<com.ss.android.socialbase.downloader.depend.r> list2 = ot;
        if (list2.isEmpty()) {
            synchronized (list2) {
                list2.addAll(list);
            }
        }
    }

    public static void vv(boolean z4) {
        qb = z4;
    }

    public static void vv(Runnable runnable) {
        vv(runnable, false);
    }

    public static void vv(Runnable runnable, boolean z4) {
        if (runnable == null) {
            return;
        }
        if (z4 && !com.ss.android.socialbase.downloader.wv.u.i()) {
            runnable.run();
        } else {
            jh().execute(runnable);
        }
    }

    public static Future vv(Runnable runnable, long j4, TimeUnit timeUnit) {
        if (runnable == null) {
            return null;
        }
        return x().schedule(runnable, j4, timeUnit);
    }

    public static void vv(IDownloadHttpService iDownloadHttpService) {
        if (iDownloadHttpService != null) {
            f61029k = iDownloadHttpService;
        }
        fo = f61029k != null;
    }

    public static void vv(com.ss.android.socialbase.downloader.network.qv qvVar) {
        if (qvVar != null) {
            f61021b = qvVar;
        }
    }

    private static void vv(k kVar) {
        if (kVar != null) {
            f61031m = kVar;
        }
    }

    private static void vv(b bVar) {
        if (bVar != null) {
            f61034p = bVar;
        }
    }

    private static void vv(com.ss.android.socialbase.downloader.i.m mVar) {
        if (mVar != null) {
            td = mVar;
        }
    }

    public static void vv(ff ffVar) {
        pd = ffVar;
        com.ss.android.socialbase.downloader.n.vv.vv();
    }

    private static void vv(qv qvVar) {
        if (qvVar != null) {
            f61027i = qvVar;
        }
    }

    public static void vv(a aVar) {
        if (aVar != null) {
            f61033o = aVar;
        }
    }

    private static void vv(n nVar) {
        if (nVar != null) {
            f61030l = nVar;
        }
    }

    public static synchronized void vv(Context context) {
        synchronized (p.class) {
            if (context != null) {
                if (vv == null) {
                    vv = context.getApplicationContext();
                    com.ss.android.socialbase.downloader.vv.vv.vv().vv(vv);
                }
            }
        }
    }

    public static int vv(DownloadInfo downloadInfo) {
        if (downloadInfo == null) {
            return 0;
        }
        String taskKey = downloadInfo.getTaskKey();
        if (TextUtils.isEmpty(taskKey)) {
            taskKey = downloadInfo.getUrl();
        }
        return vv(taskKey, downloadInfo.getSavePath());
    }

    public static int vv(String str, String str2) {
        b pd2 = pd();
        if (pd2 == null) {
            return 0;
        }
        return pd2.vv(str, str2);
    }

    public static void vv(com.ss.android.socialbase.downloader.i.p pVar) {
        yj = pVar;
    }

    public static void vv(vv vvVar) {
        com.ss.android.socialbase.downloader.p.vv.vv("wjd", "setIndependentServiceCreator::creator=".concat(String.valueOf(vvVar)));
        wv = vvVar;
    }
}
