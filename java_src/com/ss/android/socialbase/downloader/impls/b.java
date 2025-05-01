package com.ss.android.socialbase.downloader.impls;

import android.text.TextUtils;
import android.util.SparseArray;
import com.ss.android.socialbase.downloader.constants.DownloadStatus;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* loaded from: classes5.dex */
public class b implements com.ss.android.socialbase.downloader.downloader.k {
    private final SparseArray<DownloadInfo> vv = new SparseArray<>();

    /* renamed from: m  reason: collision with root package name */
    private final SparseArray<List<com.ss.android.socialbase.downloader.model.m>> f61068m = new SparseArray<>();

    /* renamed from: p  reason: collision with root package name */
    private final SparseArray<Map<Long, com.ss.android.socialbase.downloader.u.wv>> f61069p = new SparseArray<>();

    @Override // com.ss.android.socialbase.downloader.downloader.k
    public synchronized List<DownloadInfo> i(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (this.vv.size() == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i4 = 0; i4 < this.vv.size(); i4++) {
            DownloadInfo downloadInfo = this.vv.get(this.vv.keyAt(i4));
            if (downloadInfo != null && !TextUtils.isEmpty(downloadInfo.getMimeType()) && downloadInfo.getMimeType().equals(str) && DownloadStatus.isUnCompletedStatus(downloadInfo.getStatus())) {
                arrayList.add(downloadInfo);
            }
        }
        return arrayList;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.k
    public boolean i() {
        return false;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.k
    public synchronized Map<Long, com.ss.android.socialbase.downloader.u.wv> jh(int i4) {
        return this.f61069p.get(i4);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.k
    public DownloadInfo k(int i4) {
        DownloadInfo m4 = m(i4);
        if (m4 != null) {
            m4.setStatus(-7);
        }
        return m4;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.k
    public synchronized DownloadInfo m(int i4) {
        DownloadInfo downloadInfo;
        try {
            downloadInfo = this.vv.get(i4);
        } catch (Exception e5) {
            e5.printStackTrace();
            downloadInfo = null;
        }
        return downloadInfo;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.k
    public void m(int i4, List<com.ss.android.socialbase.downloader.model.m> list) {
    }

    @Override // com.ss.android.socialbase.downloader.downloader.k
    public void m(com.ss.android.socialbase.downloader.model.m mVar) {
    }

    @Override // com.ss.android.socialbase.downloader.downloader.k
    public DownloadInfo n(int i4) {
        DownloadInfo m4 = m(i4);
        if (m4 != null) {
            m4.setStatus(2);
        }
        return m4;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.k
    public boolean o() {
        return false;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.k
    public synchronized boolean o(int i4) {
        this.vv.remove(i4);
        return true;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.k
    public synchronized List<DownloadInfo> p(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (this.vv.size() == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i4 = 0; i4 < this.vv.size(); i4++) {
            DownloadInfo downloadInfo = this.vv.get(this.vv.keyAt(i4));
            if (downloadInfo != null && !TextUtils.isEmpty(downloadInfo.getMimeType()) && downloadInfo.getMimeType().equals(str) && downloadInfo.getStatus() == -3) {
                arrayList.add(downloadInfo);
            }
        }
        return arrayList;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.k
    public DownloadInfo qv(int i4) {
        DownloadInfo m4 = m(i4);
        if (m4 != null) {
            m4.setStatus(5);
            m4.setFirstDownload(false);
        }
        return m4;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.k
    public synchronized void r(int i4) {
        this.f61069p.remove(i4);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.k
    public synchronized List<com.ss.android.socialbase.downloader.u.wv> t(int i4) {
        Map<Long, com.ss.android.socialbase.downloader.u.wv> map = this.f61069p.get(i4);
        if (map != null && !map.isEmpty()) {
            return new ArrayList(map.values());
        }
        return null;
    }

    public SparseArray<List<com.ss.android.socialbase.downloader.model.m>> u() {
        return this.f61068m;
    }

    public SparseArray<DownloadInfo> vv() {
        return this.vv;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.k
    public void vv(int i4, int i5, int i6, int i7) {
    }

    @Override // com.ss.android.socialbase.downloader.downloader.k
    public DownloadInfo wv(int i4) {
        DownloadInfo m4 = m(i4);
        if (m4 != null) {
            m4.setStatus(1);
        }
        return m4;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.k
    public boolean u(int i4) {
        o(i4);
        i(i4);
        r(i4);
        return true;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.k
    public synchronized List<DownloadInfo> vv(String str) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        try {
            int size = this.vv.size();
            for (int i4 = 0; i4 < size; i4++) {
                DownloadInfo valueAt = this.vv.valueAt(i4);
                if (str != null && str.equals(valueAt.getUrl())) {
                    arrayList.add(valueAt);
                }
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        return arrayList;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.k
    public synchronized List<DownloadInfo> m(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (this.vv.size() == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i4 = 0; i4 < this.vv.size(); i4++) {
            DownloadInfo downloadInfo = this.vv.get(this.vv.keyAt(i4));
            if (downloadInfo != null && !TextUtils.isEmpty(downloadInfo.getMimeType()) && downloadInfo.getMimeType().equals(str) && DownloadStatus.isFailedStatus(downloadInfo.getStatus())) {
                arrayList.add(downloadInfo);
            }
        }
        return arrayList;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.k
    public void vv(com.ss.android.socialbase.downloader.model.m mVar) {
        int b5 = mVar.b();
        List<com.ss.android.socialbase.downloader.model.m> list = this.f61068m.get(b5);
        if (list == null) {
            list = new ArrayList<>();
            this.f61068m.put(b5, list);
        }
        list.add(mVar);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.k
    public synchronized void i(int i4) {
        this.f61068m.remove(i4);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.k
    public synchronized List<com.ss.android.socialbase.downloader.model.m> p(int i4) {
        return this.f61068m.get(i4);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.k
    public synchronized void vv(int i4, int i5, long j4) {
        List<com.ss.android.socialbase.downloader.model.m> p4 = p(i4);
        if (p4 == null) {
            return;
        }
        for (com.ss.android.socialbase.downloader.model.m mVar : p4) {
            if (mVar != null && mVar.la() == i5) {
                mVar.m(j4);
                return;
            }
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.k
    public synchronized void p() {
        this.vv.clear();
        this.f61068m.clear();
    }

    @Override // com.ss.android.socialbase.downloader.downloader.k
    public DownloadInfo i(int i4, long j4) {
        DownloadInfo m4 = m(i4);
        if (m4 != null) {
            m4.setCurBytes(j4, false);
            m4.setStatus(-2);
        }
        return m4;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.k
    public synchronized List<DownloadInfo> m() {
        if (this.vv.size() == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList(this.vv.size());
        for (int i4 = 0; i4 < this.vv.size(); i4++) {
            DownloadInfo valueAt = this.vv.valueAt(i4);
            if (valueAt != null) {
                arrayList.add(valueAt);
            }
        }
        return arrayList;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.k
    public DownloadInfo p(int i4, long j4) {
        DownloadInfo m4 = m(i4);
        if (m4 != null) {
            m4.setCurBytes(j4, false);
            m4.setStatus(-3);
            m4.setFirstDownload(false);
            m4.setFirstSuccess(false);
        }
        return m4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x002b, code lost:
        if (r0.n() == null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002d, code lost:
        r3 = r0.n().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0039, code lost:
        if (r3.hasNext() == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003b, code lost:
        r5 = r3.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0041, code lost:
        if (r5 == null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0047, code lost:
        if (r5.la() != r4) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0049, code lost:
        r5.m(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x004d, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x004f, code lost:
        return;
     */
    @Override // com.ss.android.socialbase.downloader.downloader.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized void vv(int r3, int r4, int r5, long r6) {
        /*
            r2 = this;
            monitor-enter(r2)
            java.util.List r3 = r2.p(r3)     // Catch: java.lang.Throwable -> L52
            if (r3 != 0) goto L9
            monitor-exit(r2)
            return
        L9:
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L52
        Ld:
            boolean r0 = r3.hasNext()     // Catch: java.lang.Throwable -> L52
            if (r0 == 0) goto L50
            java.lang.Object r0 = r3.next()     // Catch: java.lang.Throwable -> L52
            com.ss.android.socialbase.downloader.model.m r0 = (com.ss.android.socialbase.downloader.model.m) r0     // Catch: java.lang.Throwable -> L52
            if (r0 == 0) goto Ld
            int r1 = r0.la()     // Catch: java.lang.Throwable -> L52
            if (r1 != r5) goto Ld
            boolean r1 = r0.u()     // Catch: java.lang.Throwable -> L52
            if (r1 != 0) goto Ld
            java.util.List r3 = r0.n()     // Catch: java.lang.Throwable -> L52
            if (r3 == 0) goto L50
            java.util.List r3 = r0.n()     // Catch: java.lang.Throwable -> L52
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L52
        L35:
            boolean r5 = r3.hasNext()     // Catch: java.lang.Throwable -> L52
            if (r5 == 0) goto L4e
            java.lang.Object r5 = r3.next()     // Catch: java.lang.Throwable -> L52
            com.ss.android.socialbase.downloader.model.m r5 = (com.ss.android.socialbase.downloader.model.m) r5     // Catch: java.lang.Throwable -> L52
            if (r5 == 0) goto L35
            int r0 = r5.la()     // Catch: java.lang.Throwable -> L52
            if (r0 != r4) goto L35
            r5.m(r6)     // Catch: java.lang.Throwable -> L52
            monitor-exit(r2)
            return
        L4e:
            monitor-exit(r2)
            return
        L50:
            monitor-exit(r2)
            return
        L52:
            r3 = move-exception
            monitor-exit(r2)
            goto L56
        L55:
            throw r3
        L56:
            goto L55
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.socialbase.downloader.impls.b.vv(int, int, int, long):void");
    }

    @Override // com.ss.android.socialbase.downloader.downloader.k
    public DownloadInfo m(int i4, long j4) {
        DownloadInfo m4 = m(i4);
        if (m4 != null) {
            m4.setCurBytes(j4, false);
            m4.setStatus(-1);
            m4.setFirstDownload(false);
        }
        return m4;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.k
    public void m(DownloadInfo downloadInfo) {
        vv(downloadInfo);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.k
    public synchronized DownloadInfo vv(int i4, int i5) {
        DownloadInfo m4;
        m4 = m(i4);
        if (m4 != null) {
            m4.setChunkCount(i5);
        }
        return m4;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.k
    public synchronized boolean vv(DownloadInfo downloadInfo) {
        boolean z4 = true;
        if (downloadInfo == null) {
            return true;
        }
        if (this.vv.get(downloadInfo.getId()) == null) {
            z4 = false;
        }
        this.vv.put(downloadInfo.getId(), downloadInfo);
        return z4;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.k
    public DownloadInfo vv(int i4, long j4, String str, String str2) {
        DownloadInfo m4 = m(i4);
        if (m4 != null) {
            m4.setTotalBytes(j4);
            m4.seteTag(str);
            if (TextUtils.isEmpty(m4.getName()) && !TextUtils.isEmpty(str2)) {
                m4.setName(str2);
            }
            m4.setStatus(3);
        }
        return m4;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.k
    public DownloadInfo vv(int i4, long j4) {
        DownloadInfo m4 = m(i4);
        if (m4 != null) {
            m4.setCurBytes(j4, false);
            if (m4.getStatus() != -3 && m4.getStatus() != -2 && !DownloadStatus.isFailedStatus(m4.getStatus()) && m4.getStatus() != -4) {
                m4.setStatus(4);
            }
        }
        return m4;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.k
    public synchronized void vv(int i4, List<com.ss.android.socialbase.downloader.model.m> list) {
        if (list == null) {
            return;
        }
        i(i4);
        for (com.ss.android.socialbase.downloader.model.m mVar : list) {
            if (mVar != null) {
                vv(mVar);
                if (mVar.u()) {
                    for (com.ss.android.socialbase.downloader.model.m mVar2 : mVar.n()) {
                        vv(mVar2);
                    }
                }
            }
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.k
    public synchronized boolean vv(int i4, Map<Long, com.ss.android.socialbase.downloader.u.wv> map) {
        this.f61069p.put(i4, map);
        return false;
    }
}
