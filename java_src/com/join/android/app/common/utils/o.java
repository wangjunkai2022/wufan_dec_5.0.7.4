package com.join.android.app.common.utils;

import android.annotation.TargetApi;
import com.github.snowdream.android.app.downloader.DownloadTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* compiled from: ThreadPoolManager.java */
/* loaded from: classes3.dex */
public class o {

    /* renamed from: a  reason: collision with root package name */
    private static String f14907a = "o";

    /* renamed from: b  reason: collision with root package name */
    private static final int f14908b = 3;

    /* renamed from: c  reason: collision with root package name */
    private static ThreadPoolExecutor f14909c = new i(3, 3, 500, TimeUnit.SECONDS, new LinkedBlockingQueue());

    public static synchronized void a() {
        synchronized (o.class) {
            f14909c.getQueue().clear();
        }
    }

    static synchronized boolean b() {
        boolean z4;
        synchronized (o.class) {
            if (f14909c.getQueue().size() <= 0) {
                z4 = f14909c.getActiveCount() == 3;
            }
        }
        return z4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0027, code lost:
        r1.remove();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static synchronized void c(com.github.snowdream.android.app.downloader.DownloadTask r4) {
        /*
            java.lang.Class<com.join.android.app.common.utils.o> r0 = com.join.android.app.common.utils.o.class
            monitor-enter(r0)
            java.util.concurrent.ThreadPoolExecutor r1 = com.join.android.app.common.utils.o.f14909c     // Catch: java.lang.Throwable -> L2c
            java.util.concurrent.BlockingQueue r1 = r1.getQueue()     // Catch: java.lang.Throwable -> L2c
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L2c
        Ld:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L2c
            if (r2 == 0) goto L2a
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L2c
            com.github.snowdream.android.app.downloader.a r2 = (com.github.snowdream.android.app.downloader.a) r2     // Catch: java.lang.Throwable -> L2c
            java.lang.String r2 = r2.h()     // Catch: java.lang.Throwable -> L2c
            java.lang.String r3 = r4.getCrc_link_type_val()     // Catch: java.lang.Throwable -> L2c
            boolean r2 = r2.equals(r3)     // Catch: java.lang.Throwable -> L2c
            if (r2 == 0) goto Ld
            r1.remove()     // Catch: java.lang.Throwable -> L2c
        L2a:
            monitor-exit(r0)
            return
        L2c:
            r4 = move-exception
            monitor-exit(r0)
            goto L30
        L2f:
            throw r4
        L30:
            goto L2f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.android.app.common.utils.o.c(com.github.snowdream.android.app.downloader.DownloadTask):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0027, code lost:
        r3 = new java.lang.StringBuilder();
        r3.append("stopWaitingTask=");
        r3.append(r2.h());
        r5.setStatus(40);
        r1.remove();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static synchronized void d(com.github.snowdream.android.app.downloader.DownloadTask r5) {
        /*
            java.lang.Class<com.join.android.app.common.utils.o> r0 = com.join.android.app.common.utils.o.class
            monitor-enter(r0)
            java.util.concurrent.ThreadPoolExecutor r1 = com.join.android.app.common.utils.o.f14909c     // Catch: java.lang.Throwable -> L43
            java.util.concurrent.BlockingQueue r1 = r1.getQueue()     // Catch: java.lang.Throwable -> L43
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L43
        Ld:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L43
            if (r2 == 0) goto L41
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L43
            com.github.snowdream.android.app.downloader.a r2 = (com.github.snowdream.android.app.downloader.a) r2     // Catch: java.lang.Throwable -> L43
            java.lang.String r3 = r2.h()     // Catch: java.lang.Throwable -> L43
            java.lang.String r4 = r5.getCrc_link_type_val()     // Catch: java.lang.Throwable -> L43
            boolean r3 = r3.equals(r4)     // Catch: java.lang.Throwable -> L43
            if (r3 == 0) goto Ld
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L43
            r3.<init>()     // Catch: java.lang.Throwable -> L43
            java.lang.String r4 = "stopWaitingTask="
            r3.append(r4)     // Catch: java.lang.Throwable -> L43
            java.lang.String r2 = r2.h()     // Catch: java.lang.Throwable -> L43
            r3.append(r2)     // Catch: java.lang.Throwable -> L43
            r2 = 40
            r5.setStatus(r2)     // Catch: java.lang.Throwable -> L43
            r1.remove()     // Catch: java.lang.Throwable -> L43
        L41:
            monitor-exit(r0)
            return
        L43:
            r5 = move-exception
            monitor-exit(r0)
            goto L47
        L46:
            throw r5
        L47:
            goto L46
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.android.app.common.utils.o.d(com.github.snowdream.android.app.downloader.DownloadTask):void");
    }

    @TargetApi(11)
    public static synchronized void e(DownloadTask downloadTask) {
        synchronized (o.class) {
            StringBuilder sb = new StringBuilder();
            sb.append(downloadTask.getStatus());
            sb.append(";getQueue=");
            sb.append(f14909c.getQueue().size());
            sb.append(";exec.getActiveCount()=");
            sb.append(f14909c.getActiveCount());
            sb.append(";core=");
            sb.append(f14909c.getCorePoolSize());
            sb.append(";getPoolSize()=");
            sb.append(f14909c.getPoolSize());
            sb.append("exec.getTaskCount()=");
            sb.append(f14909c.getTaskCount());
            if (b()) {
                org.greenrobot.eventbus.c.f().o(new com.join.mgps.event.l(downloadTask.getCrc_link_type_val(), 29));
            }
            try {
                f14909c.execute(new com.github.snowdream.android.app.downloader.a(downloadTask.getUrl(), downloadTask.getCrc_link_type_val(), downloadTask));
            } catch (Exception unused) {
            }
        }
    }
}
