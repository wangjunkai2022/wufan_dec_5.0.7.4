package com.ss.android.socialbase.downloader.u;

import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class n {

    /* renamed from: d  reason: collision with root package name */
    private long f61405d;

    /* renamed from: j  reason: collision with root package name */
    private final boolean f61408j;

    /* renamed from: n  reason: collision with root package name */
    private final p f61411n;

    /* renamed from: o  reason: collision with root package name */
    private final com.ss.android.socialbase.downloader.n.vv f61412o;

    /* renamed from: p  reason: collision with root package name */
    private final DownloadInfo f61413p;

    /* renamed from: q  reason: collision with root package name */
    private final long f61414q;
    private BaseException qv;

    /* renamed from: r  reason: collision with root package name */
    private final boolean f61415r;

    /* renamed from: t  reason: collision with root package name */
    private final long f61416t;

    /* renamed from: u  reason: collision with root package name */
    private final com.ss.android.socialbase.downloader.qv.u f61417u;
    private final List<jh> vv = new LinkedList();

    /* renamed from: m  reason: collision with root package name */
    private final List<jh> f61410m = new ArrayList();
    private volatile boolean wv = false;

    /* renamed from: k  reason: collision with root package name */
    private volatile boolean f61409k = false;

    /* renamed from: b  reason: collision with root package name */
    private volatile boolean f61404b = false;

    /* renamed from: g  reason: collision with root package name */
    private volatile long f61406g = 0;
    private volatile long la = 0;

    /* renamed from: i  reason: collision with root package name */
    private final com.ss.android.socialbase.downloader.downloader.k f61407i = com.ss.android.socialbase.downloader.downloader.p.ns();
    private final com.ss.android.socialbase.downloader.vv.vv jh = com.ss.android.socialbase.downloader.vv.vv.vv();

    /* JADX INFO: Access modifiers changed from: package-private */
    public n(DownloadInfo downloadInfo, com.ss.android.socialbase.downloader.qv.u uVar, p pVar) {
        this.f61413p = downloadInfo;
        this.f61417u = uVar;
        this.f61411n = pVar;
        com.ss.android.socialbase.downloader.n.vv vv = com.ss.android.socialbase.downloader.n.vv.vv(downloadInfo.getId());
        this.f61412o = vv;
        boolean z4 = vv.vv("sync_strategy", 0) == 1;
        this.f61415r = z4;
        if (z4) {
            this.f61416t = Math.max(vv.vv("sync_interval_ms_fg", 5000), 500L);
            this.f61414q = Math.max(vv.vv("sync_interval_ms_bg", 1000), 500L);
        } else {
            this.f61416t = 0L;
            this.f61414q = 0L;
        }
        this.f61408j = vv.m("monitor_rw") == 1;
    }

    private void m(List<jh> list) throws IOException {
        for (jh jhVar : list) {
            jhVar.p();
        }
    }

    private void p() throws IOException {
        boolean z4 = this.f61408j;
        long nanoTime = z4 ? System.nanoTime() : 0L;
        DownloadInfo downloadInfo = this.f61413p;
        com.ss.android.socialbase.downloader.downloader.k kVar = this.f61407i;
        List<jh> list = this.vv;
        List<jh> list2 = this.f61410m;
        Map<Long, wv> jh = kVar.jh(downloadInfo.getId());
        if (jh == null) {
            jh = new HashMap<>(4);
        }
        synchronized (this) {
            vv(list);
            m(list);
            vv(list, jh);
            if (list2.size() > 0) {
                p(list2);
                list.removeAll(list2);
                list2.clear();
            }
        }
        if (1 != 0) {
            downloadInfo.updateRealDownloadTime(true);
            kVar.vv(downloadInfo.getId(), jh);
            kVar.vv(downloadInfo);
            this.f61406g = downloadInfo.getCurBytes();
        }
        if (z4) {
            this.f61405d += System.nanoTime() - nanoTime;
        }
    }

    private boolean vv(long j4, long j5) {
        return j4 > 65536 && j5 > 500;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void vv(jh jhVar) {
        synchronized (this) {
            this.vv.add(jhVar);
        }
    }

    public void m() {
        this.f61409k = true;
        this.wv = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x028f, code lost:
        r3.m(r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00b8, code lost:
        if (r13 <= 0) goto L258;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00bb, code lost:
        r3.m(r13);
     */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01ed A[Catch: all -> 0x03b1, TryCatch #11 {all -> 0x03b1, blocks: (B:158:0x01e9, B:160:0x01ed, B:163:0x01f3, B:165:0x01f9, B:166:0x01fc, B:167:0x020b, B:204:0x0289, B:205:0x028b, B:244:0x030c, B:246:0x0316, B:248:0x031a, B:285:0x0396, B:287:0x039c, B:288:0x039f, B:289:0x03b0), top: B:347:0x0027, inners: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x01f9 A[Catch: all -> 0x03b1, TryCatch #11 {all -> 0x03b1, blocks: (B:158:0x01e9, B:160:0x01ed, B:163:0x01f3, B:165:0x01f9, B:166:0x01fc, B:167:0x020b, B:204:0x0289, B:205:0x028b, B:244:0x030c, B:246:0x0316, B:248:0x031a, B:285:0x0396, B:287:0x039c, B:288:0x039f, B:289:0x03b0), top: B:347:0x0027, inners: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0316 A[Catch: all -> 0x03b1, TryCatch #11 {all -> 0x03b1, blocks: (B:158:0x01e9, B:160:0x01ed, B:163:0x01f3, B:165:0x01f9, B:166:0x01fc, B:167:0x020b, B:204:0x0289, B:205:0x028b, B:244:0x030c, B:246:0x0316, B:248:0x031a, B:285:0x0396, B:287:0x039c, B:288:0x039f, B:289:0x03b0), top: B:347:0x0027, inners: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:287:0x039c A[Catch: all -> 0x03b1, TryCatch #11 {all -> 0x03b1, blocks: (B:158:0x01e9, B:160:0x01ed, B:163:0x01f3, B:165:0x01f9, B:166:0x01fc, B:167:0x020b, B:204:0x0289, B:205:0x028b, B:244:0x030c, B:246:0x0316, B:248:0x031a, B:285:0x0396, B:287:0x039c, B:288:0x039f, B:289:0x03b0), top: B:347:0x0027, inners: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:300:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x021c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:348:0x00dc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:352:0x03e8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:364:0x03cf A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:368:0x02b0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:370:0x0234 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:372:0x0342 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:378:0x0298 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void vv(com.ss.android.socialbase.downloader.u.i r31) throws com.ss.android.socialbase.downloader.exception.BaseException {
        /*
            Method dump skipped, instructions count: 1087
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.socialbase.downloader.u.n.vv(com.ss.android.socialbase.downloader.u.i):void");
    }

    private void p(List<jh> list) {
        for (jh jhVar : list) {
            jhVar.i();
        }
    }

    private void vv(long j4, boolean z4) throws IOException {
        long j5 = j4 - this.la;
        if (this.f61415r) {
            if (j5 <= (this.jh.m() ? this.f61416t : this.f61414q)) {
                return;
            }
        } else {
            long curBytes = this.f61413p.getCurBytes() - this.f61406g;
            if (!z4 && !vv(curBytes, j5)) {
                return;
            }
        }
        p();
        this.la = j4;
    }

    private void vv(o oVar) {
        synchronized (this) {
            this.f61410m.add((jh) oVar);
        }
    }

    private void vv(List<jh> list) throws IOException {
        for (jh jhVar : list) {
            jhVar.m();
        }
    }

    private void vv(List<jh> list, Map<Long, wv> map) {
        for (jh jhVar : list) {
            wv o4 = jhVar.o();
            wv wvVar = map.get(Long.valueOf(o4.p()));
            if (wvVar == null) {
                map.put(Long.valueOf(o4.p()), new wv(o4));
            } else {
                wvVar.vv(o4.i());
                wvVar.p(o4.u());
            }
        }
    }

    public void vv() {
        this.f61404b = true;
        this.wv = true;
    }
}
