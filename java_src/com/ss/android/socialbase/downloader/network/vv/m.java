package com.ss.android.socialbase.downloader.network.vv;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Process;
import android.text.TextUtils;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.network.k;
import com.ss.android.socialbase.downloader.wv.u;
import java.util.List;
import java.util.Map;
import q.a;
/* loaded from: classes5.dex */
public class m {

    /* renamed from: i  reason: collision with root package name */
    private static final Handler f61272i;

    /* renamed from: m  reason: collision with root package name */
    static long f61273m;

    /* renamed from: p  reason: collision with root package name */
    private static final HandlerThread f61274p;
    static long vv;

    static {
        HandlerThread handlerThread = new HandlerThread("Downloader-preconnecter");
        f61274p = handlerThread;
        m();
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        f61272i = handler;
        handler.post(new Runnable() { // from class: com.ss.android.socialbase.downloader.network.vv.m.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    Process.setThreadPriority(10);
                } catch (Throwable unused) {
                }
            }
        });
    }

    private static void m() {
        vv = com.ss.android.socialbase.downloader.n.vv.p().vv("preconnect_connection_outdate_time", a.f73127b);
        f61273m = com.ss.android.socialbase.downloader.n.vv.p().vv("preconnect_head_info_outdate_time", a.f73127b);
        vv.vv().vv(com.ss.android.socialbase.downloader.n.vv.p().vv("preconnect_max_cache_size", 3));
    }

    public static Looper vv() {
        return f61274p.getLooper();
    }

    public static void vv(final String str, final k kVar) {
        f61272i.post(new Runnable() { // from class: com.ss.android.socialbase.downloader.network.vv.m.2
            @Override // java.lang.Runnable
            public void run() {
                if (!TextUtils.isEmpty(str)) {
                    try {
                        try {
                            List<com.ss.android.socialbase.downloader.model.p> m4 = m.m(0L, null, null);
                            r1 = vv.vv().vv(str) ? vv.vv().vv(str, m4) : null;
                            if (r1 == null) {
                                p pVar = new p(str, m4, 0L);
                                try {
                                    pVar.vv();
                                    if (pVar.o()) {
                                        vv.vv().vv(str, pVar);
                                    }
                                    r1 = pVar;
                                } catch (Exception e5) {
                                    e = e5;
                                    r1 = pVar;
                                    e.printStackTrace();
                                    try {
                                        r1.p();
                                        return;
                                    } catch (Throwable unused) {
                                        return;
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                    r1 = pVar;
                                    try {
                                        r1.p();
                                    } catch (Throwable unused2) {
                                    }
                                    throw th;
                                }
                            }
                            Map<String, String> wv = r1.wv();
                            k kVar2 = kVar;
                            if (kVar2 != null) {
                                kVar2.vv(wv);
                            }
                            try {
                                r1.p();
                            } catch (Throwable unused3) {
                            }
                        } catch (Exception e6) {
                            e = e6;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } else {
                    k kVar3 = kVar;
                    if (kVar3 != null) {
                        kVar3.vv(null);
                    }
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static List<com.ss.android.socialbase.downloader.model.p> m(long j4, DownloadInfo downloadInfo, List<com.ss.android.socialbase.downloader.model.p> list) {
        return u.vv(list, downloadInfo == null ? null : downloadInfo.geteTag(), j4, 0L);
    }
}
