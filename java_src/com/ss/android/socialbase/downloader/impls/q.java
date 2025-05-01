package com.ss.android.socialbase.downloader.impls;

import android.app.Notification;
import android.os.IBinder;
import android.os.RemoteException;
import com.ss.android.socialbase.downloader.depend.IDownloadFileUriProvider;
import com.ss.android.socialbase.downloader.depend.IDownloadListener;
import com.ss.android.socialbase.downloader.depend.a;
import com.ss.android.socialbase.downloader.depend.ot;
import com.ss.android.socialbase.downloader.depend.vu;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.socialbase.downloader.downloader.IndependentProcessDownloadService;
import com.ss.android.socialbase.downloader.downloader.wv;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.DownloadTask;
import java.util.List;
/* loaded from: classes5.dex */
public class q implements com.ss.android.socialbase.downloader.downloader.r, com.ss.android.socialbase.downloader.downloader.t {
    private static final String vv = "q";

    /* renamed from: i  reason: collision with root package name */
    private com.ss.android.socialbase.downloader.downloader.r f61105i = new j();

    /* renamed from: m  reason: collision with root package name */
    private volatile com.ss.android.socialbase.downloader.downloader.wv f61106m;

    /* renamed from: p  reason: collision with root package name */
    private com.ss.android.socialbase.downloader.downloader.q<IndependentProcessDownloadService> f61107p;

    public q() {
        com.ss.android.socialbase.downloader.downloader.q<IndependentProcessDownloadService> ff = com.ss.android.socialbase.downloader.downloader.p.ff();
        this.f61107p = ff;
        ff.vv(this);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.r
    public void b(int i4) {
        com.ss.android.socialbase.downloader.downloader.q<IndependentProcessDownloadService> qVar = this.f61107p;
        if (qVar != null) {
            qVar.vv(i4);
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.r
    public vu d(int i4) {
        if (this.f61106m != null) {
            try {
                return com.ss.android.socialbase.downloader.wv.n.vv(this.f61106m.d(i4));
            } catch (RemoteException e5) {
                e5.printStackTrace();
                return null;
            }
        }
        return null;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.r
    public a g(int i4) {
        if (this.f61106m != null) {
            try {
                return com.ss.android.socialbase.downloader.wv.n.vv(this.f61106m.g(i4));
            } catch (RemoteException e5) {
                e5.printStackTrace();
                return null;
            }
        }
        return null;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.r
    public void i(int i4) {
        if (this.f61106m == null) {
            return;
        }
        try {
            this.f61106m.i(i4);
        } catch (RemoteException e5) {
            e5.printStackTrace();
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.r
    public boolean j(int i4) {
        if (this.f61106m == null) {
            return this.f61105i.j(i4);
        }
        try {
            return this.f61106m.j(i4);
        } catch (RemoteException e5) {
            e5.printStackTrace();
            return false;
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.r
    public boolean jh(int i4) {
        if (this.f61106m == null) {
            return false;
        }
        try {
            return this.f61106m.b(i4);
        } catch (RemoteException e5) {
            e5.printStackTrace();
            return false;
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.r
    public void k(int i4) {
        if (this.f61106m == null) {
            this.f61105i.k(i4);
            return;
        }
        try {
            this.f61106m.k(i4);
        } catch (RemoteException e5) {
            e5.printStackTrace();
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.r
    public IDownloadFileUriProvider la(int i4) {
        if (this.f61106m != null) {
            try {
                return com.ss.android.socialbase.downloader.wv.n.vv(this.f61106m.la(i4));
            } catch (RemoteException e5) {
                e5.printStackTrace();
                return null;
            }
        }
        return null;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.r
    public void m(DownloadInfo downloadInfo) {
    }

    @Override // com.ss.android.socialbase.downloader.downloader.r
    public boolean m(int i4) {
        if (this.f61106m == null) {
            return false;
        }
        try {
            return this.f61106m.m(i4);
        } catch (RemoteException e5) {
            e5.printStackTrace();
            return false;
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.r
    public boolean n(int i4) {
        if (this.f61106m == null) {
            return false;
        }
        try {
            return this.f61106m.n(i4);
        } catch (RemoteException e5) {
            e5.printStackTrace();
            return false;
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.r
    public long o(int i4) {
        if (this.f61106m == null) {
            return 0L;
        }
        try {
            return this.f61106m.o(i4);
        } catch (RemoteException e5) {
            e5.printStackTrace();
            return 0L;
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.r
    public void p(int i4) {
        if (this.f61106m == null) {
            return;
        }
        try {
            this.f61106m.p(i4);
        } catch (RemoteException e5) {
            e5.printStackTrace();
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.r
    public void q(int i4) {
        if (this.f61106m == null) {
            this.f61105i.q(i4);
            return;
        }
        try {
            this.f61106m.q(i4);
        } catch (RemoteException e5) {
            e5.printStackTrace();
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.r
    public DownloadInfo qv(int i4) {
        if (this.f61106m == null) {
            return this.f61105i.qv(i4);
        }
        try {
            return this.f61106m.qv(i4);
        } catch (RemoteException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.r
    public int r(int i4) {
        if (this.f61106m == null) {
            return com.ss.android.socialbase.downloader.downloader.i.vv().m(i4);
        }
        try {
            return this.f61106m.r(i4);
        } catch (RemoteException e5) {
            e5.printStackTrace();
            return -1;
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.r
    public void startService() {
        com.ss.android.socialbase.downloader.downloader.q<IndependentProcessDownloadService> qVar = this.f61107p;
        if (qVar != null) {
            qVar.startService();
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.r
    public boolean t(int i4) {
        if (this.f61106m == null) {
            return this.f61105i.t(i4);
        }
        try {
            return this.f61106m.t(i4);
        } catch (RemoteException e5) {
            e5.printStackTrace();
            return false;
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.r
    public int u(int i4) {
        if (this.f61106m == null) {
            return 0;
        }
        try {
            return this.f61106m.u(i4);
        } catch (RemoteException e5) {
            e5.printStackTrace();
            return 0;
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.r
    public void vv(int i4) {
        if (this.f61106m == null) {
            return;
        }
        try {
            this.f61106m.vv(i4);
        } catch (RemoteException e5) {
            e5.printStackTrace();
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.r
    public List<com.ss.android.socialbase.downloader.model.m> wv(int i4) {
        if (this.f61106m == null) {
            return this.f61105i.wv(i4);
        }
        try {
            return this.f61106m.wv(i4);
        } catch (RemoteException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.r
    public List<DownloadInfo> i() {
        if (this.f61106m == null) {
            return this.f61105i.i();
        }
        try {
            return this.f61106m.m();
        } catch (RemoteException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.r
    public DownloadInfo m(String str, String str2) {
        return qv(vv(str, str2));
    }

    @Override // com.ss.android.socialbase.downloader.downloader.r
    public boolean n() {
        return this.f61106m != null;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.r
    public List<DownloadInfo> o(String str) {
        if (this.f61106m != null) {
            try {
                return this.f61106m.i(str);
            } catch (RemoteException e5) {
                e5.printStackTrace();
                return null;
            }
        }
        return null;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.r
    public List<DownloadInfo> p(String str) {
        if (this.f61106m == null) {
            return this.f61105i.p(str);
        }
        try {
            return this.f61106m.p(str);
        } catch (RemoteException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.r
    public void u() {
        if (this.f61106m == null) {
            this.f61105i.u();
            return;
        }
        try {
            this.f61106m.o();
        } catch (RemoteException e5) {
            e5.printStackTrace();
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.r
    public void vv(int i4, boolean z4) {
        if (this.f61106m == null) {
            return;
        }
        try {
            this.f61106m.vv(i4, z4);
        } catch (RemoteException e5) {
            e5.printStackTrace();
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.t
    public void qv() {
        this.f61106m = null;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.r
    public List<DownloadInfo> m(String str) {
        if (this.f61106m == null) {
            return this.f61105i.m(str);
        }
        try {
            return this.f61106m.m(str);
        } catch (RemoteException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.r
    public boolean o() {
        if (this.f61106m == null) {
            return this.f61105i.o();
        }
        try {
            return this.f61106m.i();
        } catch (RemoteException e5) {
            e5.printStackTrace();
            return false;
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.r
    public void vv() {
        if (this.f61106m == null) {
            return;
        }
        try {
            this.f61106m.vv();
        } catch (RemoteException e5) {
            e5.printStackTrace();
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.r
    public List<DownloadInfo> i(String str) {
        if (this.f61106m == null) {
            return this.f61105i.i(str);
        }
        try {
            return this.f61106m.o(str);
        } catch (RemoteException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.r
    public boolean p() {
        return com.ss.android.socialbase.downloader.downloader.p.s();
    }

    @Override // com.ss.android.socialbase.downloader.downloader.r
    public void p(int i4, boolean z4) {
        if (this.f61106m == null) {
            return;
        }
        try {
            this.f61106m.i(i4, z4);
        } catch (RemoteException e5) {
            e5.printStackTrace();
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.r
    public void m(List<String> list) {
        if (this.f61106m == null) {
            this.f61105i.m(list);
            return;
        }
        try {
            this.f61106m.m(list);
        } catch (RemoteException e5) {
            e5.printStackTrace();
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.r
    public List<DownloadInfo> vv(String str) {
        if (this.f61106m == null) {
            return this.f61105i.vv(str);
        }
        try {
            return this.f61106m.vv(str);
        } catch (RemoteException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.r
    public boolean p(DownloadInfo downloadInfo) {
        if (this.f61106m == null) {
            return this.f61105i.p(downloadInfo);
        }
        try {
            return this.f61106m.m(downloadInfo);
        } catch (RemoteException e5) {
            e5.printStackTrace();
            return false;
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.r
    public void m(int i4, boolean z4) {
        if (this.f61106m == null) {
            this.f61105i.m(i4, z4);
            return;
        }
        try {
            this.f61106m.m(i4, z4);
        } catch (RemoteException e5) {
            e5.printStackTrace();
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.r
    public int vv(String str, String str2) {
        return com.ss.android.socialbase.downloader.downloader.p.vv(str, str2);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.r
    public void vv(List<String> list) {
        if (this.f61106m == null) {
            this.f61105i.vv(list);
            return;
        }
        try {
            this.f61106m.vv(list);
        } catch (RemoteException e5) {
            e5.printStackTrace();
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.r
    public void m(int i4, int i5, IDownloadListener iDownloadListener, com.ss.android.socialbase.downloader.constants.u uVar, boolean z4) {
        if (this.f61106m == null) {
            return;
        }
        try {
            this.f61106m.vv(i4, i5, com.ss.android.socialbase.downloader.wv.n.vv(iDownloadListener, uVar != com.ss.android.socialbase.downloader.constants.u.SUB), uVar.ordinal(), z4);
        } catch (RemoteException e5) {
            e5.printStackTrace();
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.r
    public void vv(int i4, int i5, IDownloadListener iDownloadListener, com.ss.android.socialbase.downloader.constants.u uVar, boolean z4) {
        if (this.f61106m == null) {
            return;
        }
        try {
            this.f61106m.m(i4, i5, com.ss.android.socialbase.downloader.wv.n.vv(iDownloadListener, uVar != com.ss.android.socialbase.downloader.constants.u.SUB), uVar.ordinal(), z4);
        } catch (RemoteException e5) {
            e5.printStackTrace();
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.r
    public boolean m() {
        if (this.f61106m == null) {
            com.ss.android.socialbase.downloader.p.vv.i(vv, "isServiceForeground, aidlService is null");
            return false;
        }
        com.ss.android.socialbase.downloader.p.vv.p(vv, "aidlService.isServiceForeground");
        try {
            return this.f61106m.u();
        } catch (RemoteException e5) {
            e5.printStackTrace();
            return false;
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.r
    public void vv(int i4, int i5, IDownloadListener iDownloadListener, com.ss.android.socialbase.downloader.constants.u uVar, boolean z4, boolean z5) {
        if (this.f61106m == null) {
            return;
        }
        try {
            this.f61106m.vv(i4, i5, com.ss.android.socialbase.downloader.wv.n.vv(iDownloadListener, uVar != com.ss.android.socialbase.downloader.constants.u.SUB), uVar.ordinal(), z4, z5);
        } catch (RemoteException e5) {
            e5.printStackTrace();
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.r
    public boolean vv(DownloadInfo downloadInfo) {
        if (this.f61106m == null) {
            return this.f61105i.vv(downloadInfo);
        }
        try {
            this.f61106m.vv(downloadInfo);
            return false;
        } catch (RemoteException e5) {
            e5.printStackTrace();
            return false;
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.r
    public void m(DownloadTask downloadTask) {
        com.ss.android.socialbase.downloader.downloader.q<IndependentProcessDownloadService> qVar;
        if (downloadTask == null || (qVar = this.f61107p) == null) {
            return;
        }
        qVar.p(downloadTask);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.r
    public void m(int i4, List<com.ss.android.socialbase.downloader.model.m> list) {
        if (this.f61106m == null) {
            this.f61105i.m(i4, list);
            return;
        }
        try {
            this.f61106m.vv(i4, list);
        } catch (RemoteException e5) {
            e5.printStackTrace();
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.r
    public void vv(int i4, Notification notification) {
        if (this.f61106m == null) {
            com.ss.android.socialbase.downloader.p.vv.i(vv, "startForeground, aidlService is null");
            return;
        }
        com.ss.android.socialbase.downloader.p.vv.p(vv, "aidlService.startForeground, id = ".concat(String.valueOf(i4)));
        try {
            this.f61106m.vv(i4, notification);
        } catch (RemoteException e5) {
            e5.printStackTrace();
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.r
    public void vv(boolean z4, boolean z5) {
        if (this.f61106m == null) {
            com.ss.android.socialbase.downloader.p.vv.i(vv, "stopForeground, aidlService is null");
            return;
        }
        com.ss.android.socialbase.downloader.p.vv.p(vv, "aidlService.stopForeground");
        try {
            this.f61106m.vv(z5);
        } catch (RemoteException e5) {
            e5.printStackTrace();
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.r
    public void vv(DownloadTask downloadTask) {
        com.ss.android.socialbase.downloader.downloader.q<IndependentProcessDownloadService> qVar;
        if (downloadTask == null || (qVar = this.f61107p) == null) {
            return;
        }
        qVar.m(downloadTask);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.r
    public void vv(int i4, List<com.ss.android.socialbase.downloader.model.m> list) {
        if (this.f61106m == null) {
            return;
        }
        try {
            this.f61106m.m(i4, list);
        } catch (RemoteException e5) {
            e5.printStackTrace();
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.r
    public void vv(com.ss.android.socialbase.downloader.model.m mVar) {
        if (this.f61106m == null) {
            this.f61105i.vv(mVar);
            return;
        }
        try {
            this.f61106m.vv(mVar);
        } catch (RemoteException e5) {
            e5.printStackTrace();
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.r
    public void vv(int i4, int i5, long j4) {
        if (this.f61106m == null) {
            this.f61105i.vv(i4, i5, j4);
            return;
        }
        try {
            this.f61106m.vv(i4, i5, j4);
        } catch (RemoteException e5) {
            e5.printStackTrace();
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.r
    public void vv(int i4, int i5, int i6, long j4) {
        if (this.f61106m == null) {
            this.f61105i.vv(i4, i5, i6, j4);
            return;
        }
        try {
            this.f61106m.vv(i4, i5, i6, j4);
        } catch (RemoteException e5) {
            e5.printStackTrace();
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.r
    public void vv(int i4, int i5, int i6, int i7) {
        if (this.f61106m == null) {
            this.f61105i.vv(i4, i5, i6, i7);
            return;
        }
        try {
            this.f61106m.vv(i4, i5, i6, i7);
        } catch (RemoteException e5) {
            e5.printStackTrace();
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.r
    public void vv(ot otVar) {
        if (this.f61106m != null) {
            try {
                this.f61106m.vv(com.ss.android.socialbase.downloader.wv.n.vv(otVar));
            } catch (RemoteException e5) {
                e5.printStackTrace();
            }
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.r
    public void vv(int i4, int i5) {
        if (this.f61106m != null) {
            try {
                this.f61106m.vv(i4, i5);
            } catch (RemoteException e5) {
                e5.printStackTrace();
            }
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.r
    public void vv(int i4, vu vuVar) {
        if (this.f61106m != null) {
            try {
                this.f61106m.vv(i4, com.ss.android.socialbase.downloader.wv.n.vv(vuVar));
            } catch (RemoteException e5) {
                e5.printStackTrace();
            }
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.t
    public void vv(IBinder iBinder) {
        this.f61106m = wv.vv.vv(iBinder);
        if (com.ss.android.socialbase.downloader.wv.u.vv()) {
            vv(new ot() { // from class: com.ss.android.socialbase.downloader.impls.q.1
                @Override // com.ss.android.socialbase.downloader.depend.ot
                public void vv(int i4, int i5) {
                    if (i5 != 1) {
                        if (i5 == 2) {
                            Downloader.getInstance(com.ss.android.socialbase.downloader.downloader.p.ky()).cancel(i4);
                            return;
                        }
                        return;
                    }
                    Downloader.getInstance(com.ss.android.socialbase.downloader.downloader.p.ky()).pause(i4);
                    List<com.ss.android.socialbase.downloader.model.m> wv = jh.vv(false).wv(i4);
                    if (wv != null) {
                        jh.vv(true).vv(i4, com.ss.android.socialbase.downloader.wv.u.vv(wv));
                    }
                }
            });
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.r
    public void vv(int i4, long j4) {
        if (this.f61106m == null) {
            return;
        }
        try {
            this.f61106m.vv(i4, j4);
        } catch (RemoteException e5) {
            e5.printStackTrace();
        }
    }
}
