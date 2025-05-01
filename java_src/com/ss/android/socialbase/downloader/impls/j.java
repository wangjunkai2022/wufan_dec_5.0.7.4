package com.ss.android.socialbase.downloader.impls;

import android.app.Notification;
import com.ss.android.socialbase.downloader.depend.IDownloadFileUriProvider;
import com.ss.android.socialbase.downloader.depend.IDownloadListener;
import com.ss.android.socialbase.downloader.depend.a;
import com.ss.android.socialbase.downloader.depend.ot;
import com.ss.android.socialbase.downloader.depend.vu;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.DownloadTask;
import java.util.List;
/* loaded from: classes5.dex */
public class j implements com.ss.android.socialbase.downloader.downloader.r {

    /* renamed from: i  reason: collision with root package name */
    private final boolean f61094i;

    /* renamed from: m  reason: collision with root package name */
    private final com.ss.android.socialbase.downloader.downloader.k f61095m;

    /* renamed from: p  reason: collision with root package name */
    private final com.ss.android.socialbase.downloader.downloader.q f61096p;
    private final vv vv;

    public j() {
        this(false);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.r
    public void b(int i4) {
        com.ss.android.socialbase.downloader.p.vv.vv(i4);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.r
    public vu d(int i4) {
        vv vvVar = this.vv;
        if (vvVar != null) {
            return vvVar.wv(i4);
        }
        return null;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.r
    public a g(int i4) {
        vv vvVar = this.vv;
        a qv = vvVar != null ? vvVar.qv(i4) : null;
        return qv == null ? com.ss.android.socialbase.downloader.downloader.p.cq() : qv;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.r
    public void i(int i4) {
        vv vvVar = this.vv;
        if (vvVar != null) {
            vvVar.n(i4);
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.r
    public boolean j(int i4) {
        return this.f61095m.u(i4);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.r
    public boolean jh(int i4) {
        vv vvVar = this.vv;
        if (vvVar != null) {
            return vvVar.b(i4);
        }
        return false;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.r
    public void k(int i4) {
        vv vvVar = this.vv;
        if (vvVar != null) {
            vvVar.r(i4);
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.r
    public IDownloadFileUriProvider la(int i4) {
        vv vvVar = this.vv;
        if (vvVar != null) {
            return vvVar.k(i4);
        }
        return null;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.r
    public boolean m(int i4) {
        vv vvVar = this.vv;
        if (vvVar != null) {
            return vvVar.t(i4);
        }
        return false;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.r
    public boolean n(int i4) {
        vv vvVar = this.vv;
        if (vvVar != null) {
            return vvVar.vv(i4);
        }
        return false;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.r
    public long o(int i4) {
        DownloadInfo m4;
        com.ss.android.socialbase.downloader.downloader.k kVar = this.f61095m;
        if (kVar == null || (m4 = kVar.m(i4)) == null) {
            return 0L;
        }
        int chunkCount = m4.getChunkCount();
        if (chunkCount <= 1) {
            return m4.getCurBytes();
        }
        List<com.ss.android.socialbase.downloader.model.m> p4 = this.f61095m.p(i4);
        if (p4 == null || p4.size() != chunkCount) {
            return 0L;
        }
        return com.ss.android.socialbase.downloader.wv.u.m(p4);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.r
    public void p(int i4) {
        vv vvVar = this.vv;
        if (vvVar != null) {
            vvVar.u(i4);
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.r
    public void q(int i4) {
        this.f61095m.i(i4);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.r
    public DownloadInfo qv(int i4) {
        vv vvVar = this.vv;
        if (vvVar != null) {
            return vvVar.i(i4);
        }
        return null;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.r
    public int r(int i4) {
        return com.ss.android.socialbase.downloader.downloader.i.vv().vv(i4);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.r
    public void startService() {
    }

    @Override // com.ss.android.socialbase.downloader.downloader.r
    public boolean t(int i4) {
        return this.f61095m.o(i4);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.r
    public int u(int i4) {
        DownloadInfo i5;
        vv vvVar = this.vv;
        if (vvVar == null || (i5 = vvVar.i(i4)) == null) {
            return 0;
        }
        return i5.getStatus();
    }

    @Override // com.ss.android.socialbase.downloader.downloader.r
    public void vv(int i4) {
        vv vvVar = this.vv;
        if (vvVar != null) {
            vvVar.o(i4);
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.r
    public List<com.ss.android.socialbase.downloader.model.m> wv(int i4) {
        return this.f61095m.p(i4);
    }

    public j(boolean z4) {
        this.vv = com.ss.android.socialbase.downloader.downloader.p.w();
        this.f61095m = com.ss.android.socialbase.downloader.downloader.p.ns();
        if (!z4) {
            this.f61096p = com.ss.android.socialbase.downloader.downloader.p.vu();
        } else {
            this.f61096p = com.ss.android.socialbase.downloader.downloader.p.ff();
        }
        this.f61094i = com.ss.android.socialbase.downloader.n.vv.p().m("service_alive", false);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.r
    public List<DownloadInfo> i() {
        com.ss.android.socialbase.downloader.downloader.k kVar = this.f61095m;
        if (kVar != null) {
            return kVar.m();
        }
        return null;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.r
    public List<DownloadInfo> m(String str) {
        com.ss.android.socialbase.downloader.downloader.k kVar = this.f61095m;
        if (kVar != null) {
            return kVar.m(str);
        }
        return null;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.r
    public boolean n() {
        com.ss.android.socialbase.downloader.downloader.q qVar;
        return this.f61094i && (qVar = this.f61096p) != null && qVar.vv();
    }

    @Override // com.ss.android.socialbase.downloader.downloader.r
    public List<DownloadInfo> p(String str) {
        com.ss.android.socialbase.downloader.downloader.k kVar = this.f61095m;
        if (kVar != null) {
            return kVar.p(str);
        }
        return null;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.r
    public void vv(int i4, boolean z4) {
        vv vvVar = this.vv;
        if (vvVar != null) {
            vvVar.vv(i4, z4);
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.r
    public void u() {
        this.f61095m.p();
    }

    public void i(int i4, boolean z4) {
        vv vvVar = this.vv;
        if (vvVar != null) {
            vvVar.p(i4, z4);
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.r
    public void m(List<String> list) {
        vv vvVar = this.vv;
        if (vvVar != null) {
            vvVar.m(list);
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.r
    public boolean p() {
        return com.ss.android.socialbase.downloader.downloader.p.s();
    }

    @Override // com.ss.android.socialbase.downloader.downloader.r
    public void vv() {
        vv vvVar = this.vv;
        if (vvVar != null) {
            vvVar.m();
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.r
    public void p(int i4, boolean z4) {
        com.ss.android.socialbase.downloader.downloader.i.vv().vv(i4, z4);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.r
    public List<DownloadInfo> i(String str) {
        com.ss.android.socialbase.downloader.downloader.k kVar = this.f61095m;
        if (kVar != null) {
            return kVar.i(str);
        }
        return null;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.r
    public DownloadInfo m(String str, String str2) {
        return qv(com.ss.android.socialbase.downloader.downloader.p.vv(str, str2));
    }

    @Override // com.ss.android.socialbase.downloader.downloader.r
    public boolean p(DownloadInfo downloadInfo) {
        return this.f61095m.vv(downloadInfo);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.r
    public void vv(List<String> list) {
        vv vvVar = this.vv;
        if (vvVar != null) {
            vvVar.vv(list);
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.r
    public List<DownloadInfo> o(String str) {
        vv vvVar = this.vv;
        if (vvVar != null) {
            return vvVar.m(str);
        }
        return null;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.r
    public void m(int i4, boolean z4) {
        vv vvVar = this.vv;
        if (vvVar != null) {
            vvVar.m(i4, z4);
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.r
    public List<DownloadInfo> vv(String str) {
        vv vvVar = this.vv;
        if (vvVar != null) {
            return vvVar.vv(str);
        }
        return null;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.r
    public boolean o() {
        return this.f61095m.i();
    }

    @Override // com.ss.android.socialbase.downloader.downloader.r
    public void m(int i4, int i5, IDownloadListener iDownloadListener, com.ss.android.socialbase.downloader.constants.u uVar, boolean z4) {
        vv vvVar = this.vv;
        if (vvVar != null) {
            vvVar.vv(i4, i5, iDownloadListener, uVar, z4);
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.r
    public int vv(String str, String str2) {
        return com.ss.android.socialbase.downloader.downloader.p.vv(str, str2);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.r
    public void vv(int i4, int i5, IDownloadListener iDownloadListener, com.ss.android.socialbase.downloader.constants.u uVar, boolean z4) {
        vv vvVar = this.vv;
        if (vvVar != null) {
            vvVar.m(i4, i5, iDownloadListener, uVar, z4);
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.r
    public boolean m() {
        com.ss.android.socialbase.downloader.downloader.q qVar = this.f61096p;
        if (qVar != null) {
            return qVar.m();
        }
        return false;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.r
    public void vv(int i4, int i5, IDownloadListener iDownloadListener, com.ss.android.socialbase.downloader.constants.u uVar, boolean z4, boolean z5) {
        vv vvVar = this.vv;
        if (vvVar != null) {
            vvVar.vv(i4, i5, iDownloadListener, uVar, z4, z5);
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.r
    public void m(DownloadTask downloadTask) {
        com.ss.android.socialbase.downloader.downloader.q qVar = this.f61096p;
        if (qVar != null) {
            qVar.p(downloadTask);
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.r
    public boolean vv(DownloadInfo downloadInfo) {
        if (downloadInfo == null) {
            return false;
        }
        boolean vv = com.ss.android.socialbase.downloader.wv.u.vv(downloadInfo.getStatus(), downloadInfo.getSavePath(), downloadInfo.getName());
        if (vv) {
            if (com.ss.android.socialbase.downloader.wv.vv.vv(33554432)) {
                m(downloadInfo.getId(), true);
            } else {
                i(downloadInfo.getId(), true);
            }
        }
        return vv;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.r
    public void m(DownloadInfo downloadInfo) {
        this.f61095m.m(downloadInfo);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.r
    public void m(int i4, List<com.ss.android.socialbase.downloader.model.m> list) {
        this.f61095m.m(i4, list);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.r
    public void vv(int i4, Notification notification) {
        com.ss.android.socialbase.downloader.downloader.q qVar = this.f61096p;
        if (qVar != null) {
            qVar.vv(i4, notification);
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.r
    public void vv(boolean z4, boolean z5) {
        com.ss.android.socialbase.downloader.downloader.q qVar = this.f61096p;
        if (qVar != null) {
            qVar.vv(z5);
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.r
    public void vv(DownloadTask downloadTask) {
        com.ss.android.socialbase.downloader.downloader.q qVar = this.f61096p;
        if (qVar != null) {
            qVar.m(downloadTask);
        } else if (downloadTask != null) {
            com.ss.android.socialbase.downloader.i.vv.vv(downloadTask.getMonitorDepend(), downloadTask.getDownloadInfo(), new BaseException(1003, "downloadServiceHandler is null"), downloadTask.getDownloadInfo() != null ? downloadTask.getDownloadInfo().getStatus() : 0);
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.r
    public void vv(int i4, List<com.ss.android.socialbase.downloader.model.m> list) {
        this.f61095m.vv(i4, list);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.r
    public void vv(com.ss.android.socialbase.downloader.model.m mVar) {
        this.f61095m.vv(mVar);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.r
    public void vv(int i4, int i5, long j4) {
        this.f61095m.vv(i4, i5, j4);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.r
    public void vv(int i4, int i5, int i6, long j4) {
        this.f61095m.vv(i4, i5, i6, j4);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.r
    public void vv(int i4, int i5, int i6, int i7) {
        this.f61095m.vv(i4, i5, i6, i7);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.r
    public void vv(ot otVar) {
        com.ss.android.socialbase.downloader.downloader.p.vv(otVar);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.r
    public void vv(int i4, int i5) {
        if (com.ss.android.socialbase.downloader.downloader.p.o() != null) {
            for (ot otVar : com.ss.android.socialbase.downloader.downloader.p.o()) {
                if (otVar != null) {
                    otVar.vv(i5, i4);
                }
            }
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.r
    public void vv(int i4, vu vuVar) {
        vv vvVar = this.vv;
        if (vvVar != null) {
            vvVar.vv(i4, vuVar);
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.r
    public void vv(int i4, long j4) {
        vv vvVar = this.vv;
        if (vvVar != null) {
            vvVar.m(i4, j4);
        }
    }
}
