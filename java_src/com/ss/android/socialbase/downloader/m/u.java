package com.ss.android.socialbase.downloader.m;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import com.ss.android.socialbase.downloader.downloader.SqlDownloadCacheService;
import com.ss.android.socialbase.downloader.downloader.p;
import com.ss.android.socialbase.downloader.downloader.x;
import com.ss.android.socialbase.downloader.m.m;
import com.ss.android.socialbase.downloader.m.p;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.u.wv;
import io.netty.handler.traffic.AbstractTrafficShapingHandler;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
/* loaded from: classes5.dex */
public class u implements ServiceConnection, x {

    /* renamed from: i  reason: collision with root package name */
    private static long f61168i;

    /* renamed from: m  reason: collision with root package name */
    private static boolean f61169m;

    /* renamed from: p  reason: collision with root package name */
    private static int f61170p;

    /* renamed from: n  reason: collision with root package name */
    private p.vv.InterfaceC0641vv f61172n;
    @Nullable
    private p vv;
    private Future<?> wv;

    /* renamed from: o  reason: collision with root package name */
    private Handler f61173o = new Handler(Looper.getMainLooper());

    /* renamed from: u  reason: collision with root package name */
    private m f61174u = null;
    private Runnable qv = new Runnable() { // from class: com.ss.android.socialbase.downloader.m.u.1
        @Override // java.lang.Runnable
        public void run() {
            if (u.f61169m || u.this.f61172n == null) {
                return;
            }
            u.this.f61172n.vv();
        }
    };

    /* renamed from: k  reason: collision with root package name */
    private CountDownLatch f61171k = new CountDownLatch(1);

    public u() {
        SqlDownloadCacheService.vv(com.ss.android.socialbase.downloader.downloader.p.ky(), this);
    }

    static /* synthetic */ p.vv.InterfaceC0641vv vv(u uVar) {
        return uVar.f61172n;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.k
    public Map<Long, wv> jh(int i4) {
        return null;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.k
    public DownloadInfo k(int i4) {
        try {
            p pVar = this.vv;
            if (pVar != null) {
                return pVar.k(i4);
            }
            return null;
        } catch (RemoteException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
        f61169m = true;
        this.f61173o.removeCallbacks(this.qv);
        try {
            this.vv = p.vv.vv(iBinder);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        this.wv = com.ss.android.socialbase.downloader.downloader.p.jh().submit(new Runnable() { // from class: com.ss.android.socialbase.downloader.m.u.2
            @Override // java.lang.Runnable
            public void run() {
                synchronized (this) {
                    try {
                        if (u.this.f61174u != null && u.this.vv != null) {
                            u.this.vv.vv(u.this.f61174u);
                        }
                        u.this.f61171k.countDown();
                        iBinder.linkToDeath(new IBinder.DeathRecipient() { // from class: com.ss.android.socialbase.downloader.m.u.2.1
                            @Override // android.os.IBinder.DeathRecipient
                            public void binderDied() {
                                boolean unused = u.f61169m = false;
                                if (u.this.n() || u.this.f61172n == null) {
                                    return;
                                }
                                u.this.f61173o.postDelayed(u.this.qv, 2000L);
                            }
                        }, 0);
                    } catch (Throwable unused) {
                    }
                }
            }
        });
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        this.vv = null;
        f61169m = false;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.k
    public void r(int i4) {
    }

    @Override // com.ss.android.socialbase.downloader.downloader.k
    /* renamed from: vv */
    public ArrayList<wv> t(int i4) {
        return null;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.k
    public boolean vv(int i4, Map<Long, wv> map) {
        return false;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.k
    public DownloadInfo wv(int i4) {
        try {
            p pVar = this.vv;
            if (pVar != null) {
                return pVar.wv(i4);
            }
            return null;
        } catch (RemoteException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean n() {
        if (Build.VERSION.SDK_INT < 26 && !f61169m) {
            if (f61170p > 5) {
                com.ss.android.socialbase.downloader.p.vv.i("SqlDownloadCacheAidlWra", "bindMainProcess: bind too many times!!! ");
                return false;
            }
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - f61168i < AbstractTrafficShapingHandler.DEFAULT_MAX_TIME) {
                com.ss.android.socialbase.downloader.p.vv.i("SqlDownloadCacheAidlWra", "bindMainProcess: time too short since last bind!!! ");
                return false;
            }
            f61170p++;
            f61168i = currentTimeMillis;
            this.f61173o.postDelayed(new Runnable() { // from class: com.ss.android.socialbase.downloader.m.u.3
                @Override // java.lang.Runnable
                public void run() {
                    SqlDownloadCacheService.vv(com.ss.android.socialbase.downloader.downloader.p.ky(), u.this);
                }
            }, 1000L);
            return true;
        }
        return false;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.k
    public List<DownloadInfo> i(String str) {
        try {
            p pVar = this.vv;
            if (pVar != null) {
                return pVar.i(str);
            }
            return null;
        } catch (RemoteException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.k
    public DownloadInfo m(int i4) {
        try {
            p pVar = this.vv;
            if (pVar != null) {
                return pVar.m(i4);
            }
            return null;
        } catch (RemoteException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.k
    public boolean o(int i4) {
        try {
            p pVar = this.vv;
            if (pVar != null) {
                return pVar.o(i4);
            }
            return false;
        } catch (RemoteException e5) {
            e5.printStackTrace();
            return false;
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.k
    public List<DownloadInfo> p(String str) {
        try {
            p pVar = this.vv;
            if (pVar != null) {
                return pVar.p(str);
            }
            return null;
        } catch (RemoteException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.k
    public DownloadInfo qv(int i4) {
        try {
            p pVar = this.vv;
            if (pVar != null) {
                return pVar.qv(i4);
            }
            return null;
        } catch (RemoteException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.k
    public boolean u(int i4) {
        try {
            p pVar = this.vv;
            if (pVar != null) {
                return pVar.u(i4);
            }
            return false;
        } catch (RemoteException e5) {
            e5.printStackTrace();
            return false;
        }
    }

    public void vv(p.vv.InterfaceC0641vv interfaceC0641vv) {
        this.f61172n = interfaceC0641vv;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.x
    public void vv(final SparseArray<DownloadInfo> sparseArray, final SparseArray<List<com.ss.android.socialbase.downloader.model.m>> sparseArray2, final i iVar) {
        com.ss.android.socialbase.downloader.downloader.p.jh().submit(new Runnable() { // from class: com.ss.android.socialbase.downloader.m.u.4
            @Override // java.lang.Runnable
            public void run() {
                boolean z4;
                i iVar2;
                Future future;
                u.this.vv(new m.vv() { // from class: com.ss.android.socialbase.downloader.m.u.4.1
                    @Override // com.ss.android.socialbase.downloader.m.m
                    public void vv(Map map, Map map2) {
                        com.ss.android.socialbase.downloader.wv.u.vv(sparseArray, map);
                        com.ss.android.socialbase.downloader.wv.u.vv(sparseArray2, map2);
                        iVar.vv();
                        u.this.vv((m) null);
                    }
                });
                try {
                    z4 = !u.this.f61171k.await(5000L, TimeUnit.MILLISECONDS);
                } catch (Throwable th) {
                    th.printStackTrace();
                    z4 = false;
                }
                if (z4 && (future = u.this.wv) != null) {
                    future.cancel(true);
                }
                u.this.vv();
                if (!z4 || (iVar2 = iVar) == null) {
                    return;
                }
                iVar2.vv();
            }
        });
    }

    @Override // com.ss.android.socialbase.downloader.downloader.k
    public void i(int i4) {
        try {
            p pVar = this.vv;
            if (pVar != null) {
                pVar.i(i4);
            }
        } catch (RemoteException e5) {
            e5.printStackTrace();
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.k
    public List<DownloadInfo> m(String str) {
        try {
            p pVar = this.vv;
            if (pVar != null) {
                return pVar.m(str);
            }
            return null;
        } catch (RemoteException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.k
    public boolean o() {
        try {
            p pVar = this.vv;
            if (pVar != null) {
                return pVar.o();
            }
            return false;
        } catch (RemoteException e5) {
            e5.printStackTrace();
            return false;
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.k
    public List<com.ss.android.socialbase.downloader.model.m> p(int i4) {
        try {
            p pVar = this.vv;
            if (pVar != null) {
                return pVar.p(i4);
            }
            return null;
        } catch (RemoteException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    public void vv(m mVar) {
        synchronized (this) {
            p pVar = this.vv;
            if (pVar != null) {
                try {
                    pVar.vv(mVar);
                } catch (RemoteException e5) {
                    e5.printStackTrace();
                }
            } else {
                this.f61174u = mVar;
            }
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.k
    public DownloadInfo i(int i4, long j4) {
        try {
            p pVar = this.vv;
            if (pVar != null) {
                return pVar.i(i4, j4);
            }
            return null;
        } catch (RemoteException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.k
    public List<DownloadInfo> m() {
        try {
            p pVar = this.vv;
            if (pVar != null) {
                return pVar.m();
            }
            return null;
        } catch (RemoteException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.k
    public void p() {
        try {
            p pVar = this.vv;
            if (pVar != null) {
                pVar.p();
            }
        } catch (RemoteException e5) {
            e5.printStackTrace();
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.k
    public boolean i() {
        try {
            p pVar = this.vv;
            if (pVar != null) {
                return pVar.i();
            }
            return false;
        } catch (RemoteException e5) {
            e5.printStackTrace();
            return false;
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.k
    public void m(com.ss.android.socialbase.downloader.model.m mVar) {
        try {
            p pVar = this.vv;
            if (pVar != null) {
                pVar.m(mVar);
            }
        } catch (RemoteException e5) {
            e5.printStackTrace();
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.k
    public DownloadInfo p(int i4, long j4) {
        try {
            p pVar = this.vv;
            if (pVar != null) {
                return pVar.p(i4, j4);
            }
            return null;
        } catch (RemoteException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    public void vv() {
        try {
            p pVar = this.vv;
            if (pVar != null) {
                pVar.vv();
            }
        } catch (RemoteException e5) {
            e5.printStackTrace();
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.k
    public DownloadInfo n(int i4) {
        try {
            p pVar = this.vv;
            if (pVar != null) {
                return pVar.n(i4);
            }
            return null;
        } catch (RemoteException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.k
    public DownloadInfo m(int i4, long j4) {
        try {
            p pVar = this.vv;
            if (pVar != null) {
                return pVar.m(i4, j4);
            }
            return null;
        } catch (RemoteException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.k
    public List<DownloadInfo> vv(String str) {
        try {
            p pVar = this.vv;
            if (pVar != null) {
                return pVar.vv(str);
            }
            return null;
        } catch (RemoteException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.k
    public void m(DownloadInfo downloadInfo) {
        try {
            p pVar = this.vv;
            if (pVar != null) {
                pVar.m(downloadInfo);
            }
        } catch (RemoteException e5) {
            e5.printStackTrace();
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.k
    public void vv(com.ss.android.socialbase.downloader.model.m mVar) {
        try {
            p pVar = this.vv;
            if (pVar != null) {
                pVar.vv(mVar);
            }
        } catch (RemoteException e5) {
            e5.printStackTrace();
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.k
    public void m(int i4, List<com.ss.android.socialbase.downloader.model.m> list) {
        try {
            p pVar = this.vv;
            if (pVar != null) {
                pVar.m(i4, list);
            }
        } catch (RemoteException e5) {
            e5.printStackTrace();
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.k
    public void vv(int i4, int i5, long j4) {
        try {
            p pVar = this.vv;
            if (pVar != null) {
                pVar.vv(i4, i5, j4);
            }
        } catch (RemoteException e5) {
            e5.printStackTrace();
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.k
    public void vv(int i4, int i5, int i6, long j4) {
        try {
            p pVar = this.vv;
            if (pVar != null) {
                pVar.vv(i4, i5, i6, j4);
            }
        } catch (RemoteException e5) {
            e5.printStackTrace();
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.k
    public void vv(int i4, int i5, int i6, int i7) {
        try {
            p pVar = this.vv;
            if (pVar != null) {
                pVar.vv(i4, i5, i6, i7);
            }
        } catch (RemoteException e5) {
            e5.printStackTrace();
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.k
    public DownloadInfo vv(int i4, int i5) {
        try {
            p pVar = this.vv;
            if (pVar != null) {
                return pVar.vv(i4, i5);
            }
            return null;
        } catch (RemoteException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.k
    public boolean vv(DownloadInfo downloadInfo) {
        try {
            p pVar = this.vv;
            if (pVar != null) {
                return pVar.vv(downloadInfo);
            }
            return false;
        } catch (RemoteException e5) {
            e5.printStackTrace();
            return false;
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.k
    public DownloadInfo vv(int i4, long j4, String str, String str2) {
        try {
            p pVar = this.vv;
            if (pVar != null) {
                return pVar.vv(i4, j4, str, str2);
            }
            return null;
        } catch (RemoteException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.k
    public DownloadInfo vv(int i4, long j4) {
        try {
            p pVar = this.vv;
            if (pVar != null) {
                return pVar.vv(i4, j4);
            }
            return null;
        } catch (RemoteException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.k
    public void vv(int i4, List<com.ss.android.socialbase.downloader.model.m> list) {
        try {
            p pVar = this.vv;
            if (pVar != null) {
                pVar.vv(i4, list);
            }
        } catch (RemoteException e5) {
            e5.printStackTrace();
        }
    }
}
