package com.ss.android.socialbase.downloader.u;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.network.p;
import com.ss.android.socialbase.downloader.qv.o;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
/* loaded from: classes5.dex */
public class b implements p.vv, u {

    /* renamed from: b  reason: collision with root package name */
    private com.ss.android.socialbase.downloader.model.i f61367b;

    /* renamed from: d  reason: collision with root package name */
    private BaseException f61368d;
    private int ff;

    /* renamed from: g  reason: collision with root package name */
    private volatile boolean f61369g;

    /* renamed from: i  reason: collision with root package name */
    private final com.ss.android.socialbase.downloader.qv.u f61370i;

    /* renamed from: j  reason: collision with root package name */
    private int f61371j;

    /* renamed from: k  reason: collision with root package name */
    private com.ss.android.socialbase.downloader.model.i f61372k;

    /* renamed from: l  reason: collision with root package name */
    private long f61373l;

    /* renamed from: m  reason: collision with root package name */
    private final t f61374m;
    private long ns;

    /* renamed from: o  reason: collision with root package name */
    private final n f61376o;

    /* renamed from: p  reason: collision with root package name */
    private final m f61377p;

    /* renamed from: r  reason: collision with root package name */
    private long f61379r;
    private final boolean td;
    private float vu;
    private final DownloadInfo vv;

    /* renamed from: x  reason: collision with root package name */
    private final com.ss.android.socialbase.downloader.wv.o f61384x;

    /* renamed from: y  reason: collision with root package name */
    private final com.ss.android.socialbase.downloader.qv.o f61385y;
    private long ya;

    /* renamed from: u  reason: collision with root package name */
    private volatile boolean f61381u = false;

    /* renamed from: n  reason: collision with root package name */
    private volatile boolean f61375n = false;
    private final List<r> qv = new ArrayList();
    private final List<d> wv = new ArrayList();
    private volatile boolean jh = true;

    /* renamed from: t  reason: collision with root package name */
    private final LinkedList<wv> f61380t = new LinkedList<>();

    /* renamed from: q  reason: collision with root package name */
    private final List<wv> f61378q = new ArrayList();
    private final Object la = new Object();

    /* renamed from: v  reason: collision with root package name */
    private volatile boolean f61382v = false;
    private final o.m pd = new o.m() { // from class: com.ss.android.socialbase.downloader.u.b.1

        /* renamed from: m  reason: collision with root package name */
        private int f61386m;

        @Override // com.ss.android.socialbase.downloader.qv.o.m
        public long vv() {
            if (b.this.f61381u || b.this.f61375n) {
                return -1L;
            }
            synchronized (b.this) {
                if (b.this.f61372k == null && b.this.f61367b == null) {
                    long j4 = b.this.ya;
                    if (j4 <= 0) {
                        return -1L;
                    }
                    this.f61386m++;
                    r vv = b.this.vv(false, System.currentTimeMillis(), j4);
                    if (vv != null) {
                        b.this.p(vv);
                        vv.u();
                        return ((this.f61386m / b.this.wv.size()) + 1) * j4;
                    }
                    return j4;
                }
                return -1L;
            }
        }
    };

    /* renamed from: w  reason: collision with root package name */
    private final o.m f61383w = new o.m() { // from class: com.ss.android.socialbase.downloader.u.b.2
        @Override // com.ss.android.socialbase.downloader.qv.o.m
        public long vv() {
            return b.this.g();
        }
    };

    public b(@NonNull DownloadInfo downloadInfo, @NonNull t tVar, com.ss.android.socialbase.downloader.qv.u uVar) {
        this.vv = downloadInfo;
        this.f61374m = tVar;
        m mVar = new m(tVar.i(), tVar.o());
        this.f61377p = mVar;
        this.f61370i = uVar;
        this.f61376o = new n(downloadInfo, uVar, mVar);
        this.f61385y = new com.ss.android.socialbase.downloader.qv.o();
        this.f61384x = new com.ss.android.socialbase.downloader.wv.o();
        this.td = com.ss.android.socialbase.downloader.n.vv.vv(downloadInfo.getId()).m("debug") == 1;
    }

    private void b() {
        com.ss.android.socialbase.downloader.p.vv.p("SegmentDispatcher", "onComplete");
        this.f61377p.p();
        synchronized (this.la) {
            this.la.notify();
        }
    }

    private wv d() {
        int k4;
        wv wvVar = null;
        int i4 = Integer.MAX_VALUE;
        for (wv wvVar2 : this.f61378q) {
            if (vv(wvVar2) > 0 && (k4 = wvVar2.k()) < i4) {
                wvVar = wvVar2;
                i4 = k4;
            }
        }
        return wvVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long g() {
        if (this.f61381u || this.f61375n) {
            return -1L;
        }
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (this) {
            m(currentTimeMillis);
            long b5 = this.f61374m.b();
            if (b5 > 0) {
                long j4 = this.ns;
                if (j4 > 0 && currentTimeMillis - j4 > b5 && vv(currentTimeMillis, b5)) {
                    this.ns = currentTimeMillis;
                    this.ff++;
                }
            }
        }
        return 2000L;
    }

    private wv j() {
        int i4 = 0;
        while (true) {
            wv d5 = d();
            if (d5 == null) {
                return null;
            }
            r rVar = d5.vv;
            if (rVar == null) {
                return d5;
            }
            if (d5.k() >= 2) {
                return null;
            }
            long currentTimeMillis = System.currentTimeMillis();
            m(currentTimeMillis);
            if (currentTimeMillis - rVar.f61436u > 2000 && vv(rVar, currentTimeMillis - 2000, currentTimeMillis, 500L, 1.0d)) {
                if (this.td) {
                    StringBuilder sb = new StringBuilder("obtainSegmentWhenNoNewSegment: isDownloadSpeedPoor segment = ");
                    sb.append(d5);
                    sb.append(", owner.threadIndex = ");
                    sb.append(rVar.f61432p);
                }
                return d5;
            }
            int i5 = i4 + 1;
            if (i4 > 2) {
                if (this.td) {
                    "obtainSegmentWhenNoNewSegment: waitCount > 2, return segment = ".concat(String.valueOf(d5));
                }
                return d5;
            }
            try {
                synchronized (this) {
                    wait(500L);
                }
                i4 = i5;
            } catch (InterruptedException unused) {
                return null;
            }
        }
    }

    private boolean jh() {
        for (r rVar : this.qv) {
            if (!rVar.n()) {
                return false;
            }
        }
        return true;
    }

    private d k() {
        d dVar;
        synchronized (this) {
            int size = this.f61371j % this.wv.size();
            if (this.f61374m.m()) {
                this.f61371j++;
            }
            dVar = this.wv.get(size);
        }
        return dVar;
    }

    private long q() {
        long j4 = 0;
        for (r rVar : this.qv) {
            j4 += rVar.m();
        }
        return j4;
    }

    private void qv() {
        if (this.f61373l > 0) {
            this.ns = System.currentTimeMillis();
            this.f61385y.vv(this.f61383w, 0L);
        }
    }

    private void r() {
        int size;
        if (this.f61379r > 0 && (size = this.f61378q.size()) > 1) {
            ArrayList<wv> arrayList = null;
            int i4 = 0;
            for (int i5 = 1; i5 < size; i5++) {
                wv wvVar = this.f61378q.get(i4);
                wv wvVar2 = this.f61378q.get(i5);
                if (wvVar.o() > wvVar2.p() && wvVar2.vv() <= 0 && wvVar2.vv == null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList(1);
                    }
                    arrayList.add(wvVar2);
                    if (this.td) {
                        StringBuilder sb = new StringBuilder("clearCovered, covered = ");
                        sb.append(wvVar2);
                        sb.append(", prev = ");
                        sb.append(wvVar);
                    }
                } else if (wvVar2.o() > wvVar.o()) {
                    i4++;
                }
            }
            if (arrayList != null) {
                for (wv wvVar3 : arrayList) {
                    this.f61378q.remove(wvVar3);
                    for (r rVar : this.qv) {
                        if (rVar.vv == wvVar3) {
                            if (this.td) {
                                StringBuilder sb2 = new StringBuilder("clearCoveredSegmentLocked: reconnect, segment = ");
                                sb2.append(wvVar3);
                                sb2.append(", threadIndex = ");
                                sb2.append(rVar.f61432p);
                            }
                            rVar.vv(true);
                        }
                    }
                }
            }
        }
    }

    private boolean t() {
        long j4 = this.f61379r;
        if (j4 <= 0) {
            this.f61369g = false;
            return false;
        }
        synchronized (this) {
            long vv = q.vv(this.f61378q);
            com.ss.android.socialbase.downloader.p.vv.p("SegmentDispatcher", "isAllContentDownloaded: firstOffset = ".concat(String.valueOf(vv)));
            if (vv >= j4) {
                this.f61369g = true;
                return true;
            }
            this.f61369g = false;
            return false;
        }
    }

    private void wv() {
        List<String> backUpUrls;
        int jh = this.f61374m.jh();
        if (jh <= 0) {
            this.jh = false;
            o();
            return;
        }
        com.ss.android.socialbase.downloader.network.p vv = com.ss.android.socialbase.downloader.network.p.vv();
        vv.vv(this.vv.getUrl(), this, 2000L);
        if (jh <= 2 || (backUpUrls = this.vv.getBackUpUrls()) == null) {
            return;
        }
        for (String str : backUpUrls) {
            if (!TextUtils.isEmpty(str)) {
                vv.vv(str, this, 2000L);
            }
        }
    }

    private void i() throws BaseException {
        try {
            this.f61376o.vv((i) this.f61377p);
        } catch (j unused) {
        } catch (BaseException e5) {
            com.ss.android.socialbase.downloader.p.vv.o("SegmentDispatcher", "dispatchSegments: loopAndWrite e = ".concat(String.valueOf(e5)));
            vv(e5);
            throw e5;
        }
        if (this.f61375n || this.f61381u) {
            return;
        }
        try {
            synchronized (this) {
                while (!this.f61380t.isEmpty()) {
                    wv poll = this.f61380t.poll();
                    if (poll != null) {
                        vv(this.f61378q, poll, true);
                    }
                }
                p(this.f61378q);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        if (this.f61382v && this.f61368d != null) {
            com.ss.android.socialbase.downloader.p.vv.o("SegmentDispatcher", "dispatchSegments: loopAndWrite  failedException = " + this.f61368d);
            throw this.f61368d;
        }
        if (this.vv.getCurBytes() != this.vv.getTotalBytes()) {
            com.ss.android.socialbase.downloader.i.vv.vv(this.vv, this.f61378q);
        }
        com.ss.android.socialbase.downloader.p.vv.p("SegmentDispatcher", "dispatchSegments::download finished");
    }

    private void m(List<wv> list) {
        long totalBytes = this.vv.getTotalBytes();
        this.f61379r = totalBytes;
        if (totalBytes <= 0) {
            this.f61379r = this.vv.getExpectFileLength();
            com.ss.android.socialbase.downloader.p.vv.p("SegmentDispatcher", "initSegments: getExpectFileLength = " + this.f61379r);
        }
        synchronized (this) {
            this.f61380t.clear();
            if (list != null && !list.isEmpty()) {
                for (wv wvVar : list) {
                    vv((List<wv>) this.f61380t, new wv(wvVar), false);
                }
                i(this.f61380t);
                p(this.f61380t);
                com.ss.android.socialbase.downloader.p.vv.p("SegmentDispatcher", "initSegments: totalLength = " + this.f61379r);
            }
            vv((List<wv>) this.f61380t, new wv(0L, -1L), false);
            com.ss.android.socialbase.downloader.p.vv.p("SegmentDispatcher", "initSegments: totalLength = " + this.f61379r);
        }
    }

    private void n() {
        t tVar = this.f61374m;
        this.ya = tVar.k();
        this.f61373l = tVar.b();
        this.vu = tVar.q();
        int i4 = this.ff;
        if (i4 > 0) {
            this.f61385y.vv(this.pd, i4);
        }
    }

    private void o() {
        int i4;
        if (this.f61379r <= 0 || this.jh) {
            i4 = 1;
        } else {
            i4 = this.f61374m.vv();
            int qv = (int) (this.f61379r / this.f61374m.qv());
            if (i4 > qv) {
                i4 = qv;
            }
        }
        com.ss.android.socialbase.downloader.p.vv.p("SegmentDispatcher", "dispatchReadThread: totalLength = " + this.f61379r + ", threadCount = " + i4);
        int i5 = i4 > 0 ? i4 : 1;
        synchronized (this) {
            do {
                if (this.qv.size() >= i5) {
                    break;
                }
                if (!this.f61375n && !this.f61381u) {
                    vv(k());
                }
                return;
            } while (!this.f61374m.u());
        }
    }

    private void p() throws BaseException, InterruptedException {
        BaseException baseException;
        synchronized (this.la) {
            if (this.f61372k == null && this.f61367b == null) {
                this.la.wait();
            }
        }
        if (this.f61372k == null && this.f61367b == null && (baseException = this.f61368d) != null) {
            throw baseException;
        }
    }

    private void u() {
        this.wv.add(new d(this.vv.getUrl(), true));
        List<String> backUpUrls = this.vv.getBackUpUrls();
        if (backUpUrls != null) {
            for (String str : backUpUrls) {
                if (!TextUtils.isEmpty(str)) {
                    this.wv.add(new d(str, false));
                }
            }
        }
        this.f61374m.vv(this.wv.size());
    }

    public boolean vv(List<wv> list) throws BaseException, InterruptedException {
        try {
            u();
            m(list);
            o();
            n();
            wv();
            long currentTimeMillis = System.currentTimeMillis();
            p();
            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
            this.vv.increaseAllConnectTime(currentTimeMillis2);
            this.vv.setFirstSpeedTime(currentTimeMillis2);
            if (!this.f61375n && !this.f61381u) {
                this.f61370i.vv(this.f61379r);
                qv();
                i();
                return true;
            }
            if (!this.f61375n && !this.f61381u) {
                com.ss.android.socialbase.downloader.p.vv.p("SegmentDispatcher", "finally pause");
                m();
            }
            this.f61385y.m();
            return true;
        } finally {
            if (!this.f61375n && !this.f61381u) {
                com.ss.android.socialbase.downloader.p.vv.p("SegmentDispatcher", "finally pause");
                m();
            }
            this.f61385y.m();
        }
    }

    private void p(List<wv> list) {
        long m4 = q.m(list);
        com.ss.android.socialbase.downloader.p.vv.p("SegmentDispatcher", "checkDownloadBytes: getCurBytes = " + this.vv.getCurBytes() + ", totalBytes = " + this.vv.getTotalBytes() + ", downloadedBytes = " + m4);
        if (m4 > this.vv.getTotalBytes() && this.vv.getTotalBytes() > 0) {
            m4 = this.vv.getTotalBytes();
        }
        if (this.vv.getCurBytes() == this.vv.getTotalBytes() || this.vv.getCurBytes() == m4) {
            return;
        }
        this.vv.setCurBytes(m4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0097, code lost:
        if ((r10.o() - r24.o()) < (r14 / 2)) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void o(com.ss.android.socialbase.downloader.u.r r23, com.ss.android.socialbase.downloader.u.wv r24) throws com.ss.android.socialbase.downloader.u.k {
        /*
            Method dump skipped, instructions count: 634
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.socialbase.downloader.u.b.o(com.ss.android.socialbase.downloader.u.r, com.ss.android.socialbase.downloader.u.wv):void");
    }

    private void m(String str, List<d> list) {
        int vv;
        if (this.td) {
            for (d dVar : list) {
                "addIpListLocked: urlRecord = ".concat(String.valueOf(dVar));
            }
        }
        int jh = this.f61374m.jh();
        if ((jh == 1 || jh == 3) && (vv = vv(str)) >= 0 && vv < this.wv.size()) {
            this.wv.addAll(vv + 1, list);
        } else {
            this.wv.addAll(list);
        }
    }

    private List<d> p(String str, List<InetAddress> list) {
        boolean z4;
        if (list != null && !list.isEmpty()) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            int i4 = 0;
            for (InetAddress inetAddress : list) {
                if (inetAddress != null) {
                    String hostAddress = inetAddress.getHostAddress();
                    if (!TextUtils.isEmpty(hostAddress)) {
                        if (this.td) {
                            "onDnsResolved: ip = ".concat(String.valueOf(hostAddress));
                        }
                        d dVar = new d(str, hostAddress);
                        LinkedList linkedList = (LinkedList) linkedHashMap.get(dVar.f61392p);
                        if (linkedList == null) {
                            linkedList = new LinkedList();
                            linkedHashMap.put(dVar.f61392p, linkedList);
                        }
                        linkedList.add(dVar);
                        i4++;
                    }
                }
            }
            if (i4 > 0) {
                ArrayList arrayList = new ArrayList();
                do {
                    z4 = false;
                    for (Map.Entry entry : linkedHashMap.entrySet()) {
                        LinkedList linkedList2 = (LinkedList) entry.getValue();
                        if (linkedList2 != null && !linkedList2.isEmpty()) {
                            arrayList.add((d) linkedList2.pollFirst());
                            i4--;
                            z4 = true;
                        }
                    }
                    if (i4 <= 0) {
                        break;
                    }
                } while (z4);
                return arrayList;
            }
        }
        return null;
    }

    private void i(List<wv> list) {
        wv wvVar = list.get(0);
        long p4 = wvVar.p();
        if (p4 > 0) {
            wv wvVar2 = new wv(0L, p4 - 1);
            StringBuilder sb = new StringBuilder("fixSegmentsLocked: first = ");
            sb.append(wvVar);
            sb.append(", add new first = ");
            sb.append(wvVar2);
            vv(list, wvVar2, true);
        }
        Iterator<wv> it2 = list.iterator();
        if (it2.hasNext()) {
            wv next = it2.next();
            while (it2.hasNext()) {
                wv next2 = it2.next();
                if (next.u() < next2.p() - 1) {
                    com.ss.android.socialbase.downloader.p.vv.i("SegmentDispatcher", "fixSegment: segment = " + next + ", new end = " + (next2.p() - 1));
                    next.p(next2.p() - 1);
                }
                next = next2;
            }
        }
        wv wvVar3 = list.get(list.size() - 1);
        long totalBytes = this.vv.getTotalBytes();
        if (totalBytes <= 0 || (wvVar3.u() != -1 && wvVar3.u() < totalBytes - 1)) {
            com.ss.android.socialbase.downloader.p.vv.i("SegmentDispatcher", "fixSegment: last segment = " + wvVar3 + ", new end=-1");
            wvVar3.p(-1L);
        }
    }

    private wv m(r rVar, d dVar) {
        while (!this.f61380t.isEmpty()) {
            wv poll = this.f61380t.poll();
            if (poll != null) {
                vv(this.f61378q, poll, true);
                if (vv(poll) > 0 || this.f61379r <= 0) {
                    return poll;
                }
            }
        }
        r();
        wv p4 = p(rVar, dVar);
        if (p4 != null && vv(p4) > 0) {
            vv(this.f61378q, p4, true);
            return p4;
        }
        wv j4 = j();
        if (j4 != null) {
            return j4;
        }
        return null;
    }

    @Override // com.ss.android.socialbase.downloader.u.u
    public void m(r rVar, wv wvVar) throws BaseException {
        synchronized (this) {
            o(rVar, wvVar);
        }
    }

    @Override // com.ss.android.socialbase.downloader.network.p.vv
    public void vv(String str, List<InetAddress> list) {
        if (this.f61375n || this.f61381u) {
            return;
        }
        List<d> list2 = null;
        try {
            list2 = p(str, list);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        synchronized (this) {
            if (list2 != null) {
                m(str, list2);
            }
            this.jh = false;
            this.f61374m.vv(this.wv.size());
            o();
        }
    }

    @Override // com.ss.android.socialbase.downloader.u.u
    public void m(r rVar) {
        com.ss.android.socialbase.downloader.p.vv.p("SegmentDispatcher", "onReaderExit: threadIndex = " + rVar.f61432p);
        synchronized (this) {
            rVar.p(true);
            this.qv.remove(rVar);
            r();
            if (!this.qv.isEmpty()) {
                if (t()) {
                    for (r rVar2 : this.qv) {
                        rVar2.o();
                    }
                }
            }
            b();
        }
    }

    @Override // com.ss.android.socialbase.downloader.u.u
    public void p(r rVar, wv wvVar) {
        synchronized (this) {
            if (wvVar.vv == rVar) {
                com.ss.android.socialbase.downloader.p.vv.p("SegmentDispatcher", "unApplySegment ".concat(String.valueOf(wvVar)));
                wvVar.i(rVar.i());
                wvVar.vv = null;
                rVar.vv();
            }
        }
    }

    @Override // com.ss.android.socialbase.downloader.u.u
    public o i(r rVar, wv wvVar) throws BaseException {
        o vv;
        synchronized (this) {
            jh jhVar = new jh(this.vv, this.f61377p, wvVar);
            this.f61376o.vv(jhVar);
            vv = jhVar.vv();
        }
        return vv;
    }

    private int vv(String str) {
        int size = this.wv.size();
        for (int i4 = 0; i4 < size; i4++) {
            if (TextUtils.equals(this.wv.get(i4).vv, str)) {
                return i4;
            }
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean p(r rVar) {
        synchronized (this) {
            d i4 = i(rVar);
            if (i4 == null) {
                return false;
            }
            return rVar.vv(i4);
        }
    }

    private d i(r rVar) {
        d dVar;
        Iterator<d> it2 = this.wv.iterator();
        d dVar2 = null;
        while (true) {
            if (!it2.hasNext()) {
                dVar = null;
                break;
            }
            dVar = it2.next();
            if (dVar != rVar.f61429m && !dVar.i()) {
                if (dVar2 == null) {
                    dVar2 = dVar;
                }
                if (dVar.vv() <= 0) {
                    break;
                }
            }
        }
        if (this.f61374m.m()) {
            if (dVar != null) {
                return dVar;
            }
            if (this.f61374m.p()) {
                return null;
            }
        }
        return dVar2;
    }

    private void vv(List<wv> list, wv wvVar, boolean z4) {
        long p4 = wvVar.p();
        int size = list.size();
        int i4 = 0;
        while (i4 < size && p4 >= list.get(i4).p()) {
            i4++;
        }
        list.add(i4, wvVar);
        if (z4) {
            wvVar.vv(size);
        }
    }

    private void m(r rVar, wv wvVar, d dVar, com.ss.android.socialbase.downloader.model.i iVar) throws BaseException, com.ss.android.socialbase.downloader.exception.wv {
        r rVar2 = wvVar.vv;
        if (rVar2 != null && rVar2 != rVar) {
            throw new k(1, "segment already has an owner");
        }
        if (rVar.qv() == wvVar.o()) {
            if (!iVar.m()) {
                if (wvVar.o() <= 0) {
                    com.ss.android.socialbase.downloader.p.vv.o("SegmentDispatcher", "parseHttpResponse: segment.getCurrentOffsetRead = " + wvVar.o());
                    if (!iVar.vv()) {
                        int i4 = iVar.f61208p;
                        throw new com.ss.android.socialbase.downloader.exception.m(1004, i4, "2: response code error : " + iVar.f61208p + " segment=" + wvVar);
                    }
                } else {
                    int i5 = iVar.f61208p;
                    throw new com.ss.android.socialbase.downloader.exception.m(1004, i5, "1: response code error : " + iVar.f61208p + " segment=" + wvVar);
                }
            }
            if (dVar.f61387i) {
                if (this.f61372k == null) {
                    this.f61372k = iVar;
                    synchronized (this.la) {
                        this.la.notify();
                    }
                    com.ss.android.socialbase.downloader.qv.u uVar = this.f61370i;
                    if (uVar != null) {
                        uVar.vv(dVar.vv, iVar.f61206m, wvVar.o());
                    }
                    long k4 = iVar.k();
                    if (k4 > 0) {
                        for (wv wvVar2 : this.f61378q) {
                            if (wvVar2.u() <= 0 || wvVar2.u() > k4 - 1) {
                                wvVar2.p(k4 - 1);
                            }
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            vv(iVar);
            if (this.f61367b == null) {
                this.f61367b = iVar;
                if (this.vv.getTotalBytes() <= 0) {
                    long k5 = iVar.k();
                    com.ss.android.socialbase.downloader.p.vv.p("SegmentDispatcher", "checkSegmentHttpResponse:len=" + k5 + ",url=" + dVar.vv);
                    this.vv.setTotalBytes(k5);
                }
                synchronized (this.la) {
                    this.la.notify();
                }
                return;
            }
            return;
        }
        throw new k(5, "applySegment");
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private com.ss.android.socialbase.downloader.u.wv p(com.ss.android.socialbase.downloader.u.r r28, com.ss.android.socialbase.downloader.u.d r29) {
        /*
            Method dump skipped, instructions count: 486
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.socialbase.downloader.u.b.p(com.ss.android.socialbase.downloader.u.r, com.ss.android.socialbase.downloader.u.d):com.ss.android.socialbase.downloader.u.wv");
    }

    private float i(r rVar, d dVar) {
        long m4 = rVar.m();
        int size = this.qv.size();
        if (size <= 1) {
            size = this.f61374m.vv();
        }
        float f5 = 1.0f;
        if (m4 <= 0) {
            float r4 = this.f61374m.r();
            if (r4 <= 0.0f || r4 >= 1.0f) {
                r4 = 1.0f / size;
            }
            if (rVar.f61432p == 0) {
                return r4;
            }
            if (size > 1) {
                f5 = 1.0f - r4;
                size--;
            }
        } else {
            long q4 = q();
            if (q4 > m4) {
                return ((float) m4) / ((float) q4);
            }
        }
        return f5 / size;
    }

    private void vv(d dVar) {
        r rVar = new r(this.vv, this, this.f61377p, dVar, this.qv.size());
        this.qv.add(rVar);
        rVar.vv(com.ss.android.socialbase.downloader.downloader.p.d().submit(rVar));
    }

    @Override // com.ss.android.socialbase.downloader.u.u
    public void vv(r rVar) {
        if (this.td) {
            com.ss.android.socialbase.downloader.p.vv.p("SegmentDispatcher", "onReaderRun, threadIndex = " + rVar.f61432p);
        }
    }

    @Override // com.ss.android.socialbase.downloader.u.u
    public wv vv(r rVar, d dVar) {
        if (this.f61381u || this.f61375n) {
            return null;
        }
        synchronized (this) {
            wv m4 = m(rVar, dVar);
            if (m4 != null) {
                m4.qv();
                if (m4.k() > 1) {
                    return new wv(m4);
                }
            }
            return m4;
        }
    }

    @Override // com.ss.android.socialbase.downloader.u.u
    public void vv(r rVar, wv wvVar) {
        synchronized (this) {
            wvVar.wv();
        }
    }

    @Override // com.ss.android.socialbase.downloader.u.u
    public void vv(r rVar, wv wvVar, d dVar, com.ss.android.socialbase.downloader.model.i iVar) throws BaseException, com.ss.android.socialbase.downloader.exception.wv {
        synchronized (this) {
            if (!this.f61381u && !this.f61375n) {
                m(rVar, wvVar, dVar, iVar);
                rVar.m(false);
                if (this.f61379r <= 0) {
                    long totalBytes = this.vv.getTotalBytes();
                    this.f61379r = totalBytes;
                    if (totalBytes <= 0) {
                        this.f61379r = iVar.k();
                    }
                    o();
                } else if (this.f61374m.u()) {
                    o();
                }
            } else {
                throw new j("connected");
            }
        }
    }

    public void m() {
        com.ss.android.socialbase.downloader.p.vv.p("SegmentDispatcher", "pause1");
        this.f61375n = true;
        synchronized (this) {
            for (r rVar : this.qv) {
                rVar.o();
            }
        }
        this.f61376o.m();
        this.f61377p.p();
    }

    @Override // com.ss.android.socialbase.downloader.u.u
    public void vv(r rVar, d dVar, wv wvVar, BaseException baseException, int i4, int i5) {
        com.ss.android.socialbase.downloader.wv.u.m(baseException);
        int errorCode = baseException.getErrorCode();
        if (((errorCode == 1047 || errorCode == 1074 || errorCode == 1055) ? true : true) || i4 >= i5) {
            p(rVar);
        }
    }

    @Override // com.ss.android.socialbase.downloader.u.u
    public void vv(r rVar, d dVar, wv wvVar, BaseException baseException) {
        synchronized (this) {
            com.ss.android.socialbase.downloader.p.vv.o("SegmentDispatcher", "onSegmentFailed: segment = " + wvVar + ", e = " + baseException);
            rVar.m(true);
            if (rVar.f61432p == 0) {
                this.f61368d = baseException;
            }
            if (jh()) {
                if (this.f61368d == null) {
                    this.f61368d = baseException;
                }
                this.f61382v = true;
                vv(this.f61368d);
            }
        }
    }

    private void m(long j4) {
        this.f61384x.vv(this.vv.getCurBytes(), j4);
        for (r rVar : this.qv) {
            rVar.m(j4);
        }
    }

    private void vv(BaseException baseException) {
        com.ss.android.socialbase.downloader.p.vv.o("SegmentDispatcher", "onError, e = ".concat(String.valueOf(baseException)));
        this.f61368d = baseException;
        this.f61377p.p();
        synchronized (this) {
            for (r rVar : this.qv) {
                rVar.o();
            }
        }
    }

    private void vv(com.ss.android.socialbase.downloader.model.i iVar) throws BaseException {
        com.ss.android.socialbase.downloader.model.i iVar2 = this.f61372k;
        if (iVar2 == null && (iVar2 = this.f61367b) == null) {
            return;
        }
        long k4 = iVar.k();
        long k5 = iVar2.k();
        if (k4 != k5) {
            String str = "total len not equals,len=" + k4 + ",sLen=" + k5 + ",code=" + iVar.f61208p + ",sCode=" + iVar2.f61208p + ",range=" + iVar.o() + ",sRange = " + iVar2.o() + ",url = " + iVar.vv + ",sUrl=" + iVar2.vv;
            com.ss.android.socialbase.downloader.p.vv.o("SegmentDispatcher", str);
            if (k4 > 0 && k5 > 0) {
                throw new BaseException(1074, str);
            }
        }
        String p4 = iVar.p();
        String p5 = iVar2.p();
        if (TextUtils.equals(p4, p5)) {
            return;
        }
        String str2 = "etag not equals with main url, etag = " + p4 + ", mainEtag = " + p5;
        com.ss.android.socialbase.downloader.p.vv.o("SegmentDispatcher", str2);
        if (!TextUtils.isEmpty(p4) && !TextUtils.isEmpty(p5) && !p4.equalsIgnoreCase(p5)) {
            throw new BaseException(1074, str2);
        }
    }

    public void vv() {
        com.ss.android.socialbase.downloader.p.vv.p("SegmentDispatcher", "cancel");
        this.f61381u = true;
        synchronized (this) {
            for (r rVar : this.qv) {
                rVar.o();
            }
        }
        this.f61376o.vv();
        this.f61377p.p();
    }

    private int vv(long j4) {
        int size = this.f61378q.size();
        for (int i4 = 0; i4 < size; i4++) {
            wv wvVar = this.f61378q.get(i4);
            if (wvVar.p() == j4) {
                return i4;
            }
            if (wvVar.p() > j4) {
                return -1;
            }
        }
        return -1;
    }

    private long vv(int i4, int i5) {
        wv wvVar = this.f61378q.get(i4);
        long vv = vv(wvVar);
        int i6 = i4 + 1;
        wv wvVar2 = i6 < i5 ? this.f61378q.get(i6) : null;
        if (wvVar2 == null) {
            return vv;
        }
        long p4 = wvVar2.p() - wvVar.o();
        return vv == -1 ? p4 : Math.min(vv, p4);
    }

    private long vv(wv wvVar) {
        long m4 = wvVar.m();
        if (m4 == -1) {
            long j4 = this.f61379r;
            return j4 > 0 ? j4 - wvVar.o() : m4;
        }
        return m4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public r vv(boolean z4, long j4, long j5) {
        r rVar = null;
        for (r rVar2 : this.qv) {
            if (rVar2.f61432p != 0 || z4) {
                if (rVar2.f61425i > 0 && rVar2.f61431o <= 0 && j4 - rVar2.f61425i > j5 && (rVar == null || rVar2.f61425i < rVar.f61425i)) {
                    rVar = rVar2;
                }
            }
        }
        return rVar;
    }

    private boolean vv(r rVar, long j4, long j5, long j6, double d5) {
        if (rVar.f61436u > 0) {
            long m4 = this.f61384x.m(j4, j5);
            int size = this.qv.size();
            long j7 = size > 0 ? m4 / size : m4;
            long vv = rVar.vv(j4, j5);
            if (vv >= j6) {
                double d6 = j7;
                Double.isNaN(d6);
                if (vv >= d6 * d5) {
                    return false;
                }
            }
            StringBuilder sb = new StringBuilder("isDownloadSpeedPoor: totalSpeed = ");
            sb.append(m4);
            sb.append(", threadAvgSpeed = ");
            sb.append(j7);
            sb.append(", poorSpeed = ");
            sb.append(j6);
            sb.append(", speed = ");
            sb.append(vv);
            sb.append(",threadIndex = ");
            sb.append(rVar.f61432p);
            return true;
        }
        return false;
    }

    private boolean vv(long j4, long j5) {
        long j6 = j4 - j5;
        long m4 = this.f61384x.m(j6, j4);
        int size = this.qv.size();
        if (size > 0) {
            m4 /= size;
        }
        r vv = vv(j6, j4, Math.max(10.0f, ((float) m4) * this.vu), size / 2);
        if (vv != null) {
            p(vv);
            com.ss.android.socialbase.downloader.p.vv.i("SegmentDispatcher", "handlePoorReadThread: reconnect for poor speed, threadIndex = " + vv.f61432p);
            vv.u();
            return true;
        }
        r vv2 = vv(true, j4, j5);
        if (vv2 != null) {
            p(vv2);
            com.ss.android.socialbase.downloader.p.vv.i("SegmentDispatcher", "handlePoorReadThread: reconnect for connect timeout, threadIndex = " + vv2.f61432p);
            vv2.u();
            return true;
        }
        return false;
    }

    private r vv(long j4, long j5, long j6, int i4) {
        long j7 = Long.MAX_VALUE;
        int i5 = 0;
        r rVar = null;
        for (r rVar2 : this.qv) {
            if (rVar2.f61436u > 0) {
                i5++;
                long j8 = j7;
                if (rVar2.f61436u < j4) {
                    long vv = rVar2.vv(j4, j5);
                    if (this.td) {
                        StringBuilder sb = new StringBuilder("findPoorReadThread: speed = ");
                        sb.append(vv);
                        sb.append(", threadIndex = ");
                        sb.append(rVar2.f61432p);
                    }
                    if (vv >= 0 && vv < j8) {
                        j7 = vv;
                        rVar = rVar2;
                    }
                }
                j7 = j8;
            }
        }
        long j9 = j7;
        if (rVar == null || i5 < i4 || j9 >= j6) {
            return null;
        }
        com.ss.android.socialbase.downloader.p.vv.p("SegmentDispatcher", "findPoorReadThread: ----------- minSpeed = " + j9 + ", threadIndex = " + rVar.f61432p);
        return rVar;
    }
}
