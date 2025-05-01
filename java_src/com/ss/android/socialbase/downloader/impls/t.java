package com.ss.android.socialbase.downloader.impls;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.SparseArray;
import com.ss.android.socialbase.downloader.downloader.IndependentProcessDownloadService;
import com.ss.android.socialbase.downloader.downloader.wv;
import com.ss.android.socialbase.downloader.model.DownloadTask;
import java.util.List;
/* loaded from: classes5.dex */
public class t extends com.ss.android.socialbase.downloader.downloader.vv implements ServiceConnection {

    /* renamed from: o  reason: collision with root package name */
    private static final String f61110o = t.class.getSimpleName();

    /* renamed from: n  reason: collision with root package name */
    private com.ss.android.socialbase.downloader.downloader.t f61111n;
    private int qv = -1;

    /* renamed from: u  reason: collision with root package name */
    private com.ss.android.socialbase.downloader.downloader.wv f61112u;

    private void n() {
        SparseArray<List<DownloadTask>> clone;
        try {
            synchronized (this.vv) {
                clone = this.vv.clone();
                this.vv.clear();
            }
            if (clone == null || clone.size() <= 0 || com.ss.android.socialbase.downloader.downloader.p.w() == null) {
                return;
            }
            for (int i4 = 0; i4 < clone.size(); i4++) {
                List<DownloadTask> list = clone.get(clone.keyAt(i4));
                if (list != null) {
                    for (DownloadTask downloadTask : list) {
                        try {
                            this.f61112u.vv(com.ss.android.socialbase.downloader.wv.n.vv(downloadTask));
                        } catch (RemoteException e5) {
                            e5.printStackTrace();
                        }
                    }
                }
            }
        } catch (Throwable th) {
            com.ss.android.socialbase.downloader.p.vv.m(f61110o, "resumePendingTaskForIndependent failed", th);
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.vv, com.ss.android.socialbase.downloader.downloader.q
    public void m(DownloadTask downloadTask) {
        if (downloadTask == null) {
            return;
        }
        String str = f61110o;
        StringBuilder sb = new StringBuilder("tryDownload aidlService == null:");
        sb.append(this.f61112u == null);
        com.ss.android.socialbase.downloader.p.vv.m(str, sb.toString());
        if (this.f61112u == null) {
            vv(downloadTask);
            startService(com.ss.android.socialbase.downloader.downloader.p.ky(), this);
            return;
        }
        n();
        try {
            this.f61112u.vv(com.ss.android.socialbase.downloader.wv.n.vv(downloadTask));
        } catch (RemoteException e5) {
            e5.printStackTrace();
        }
    }

    @Override // android.content.ServiceConnection
    public void onBindingDied(ComponentName componentName) {
        this.f61112u = null;
        com.ss.android.socialbase.downloader.downloader.t tVar = this.f61111n;
        if (tVar != null) {
            tVar.qv();
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        String str = f61110o;
        com.ss.android.socialbase.downloader.p.vv.m(str, "onServiceConnected ");
        this.f61112u = wv.vv.vv(iBinder);
        com.ss.android.socialbase.downloader.downloader.t tVar = this.f61111n;
        if (tVar != null) {
            tVar.vv(iBinder);
        }
        StringBuilder sb = new StringBuilder("onServiceConnected aidlService!=null");
        sb.append(this.f61112u != null);
        sb.append(" pendingTasks.size:");
        sb.append(this.vv.size());
        com.ss.android.socialbase.downloader.p.vv.m(str, sb.toString());
        if (this.f61112u != null) {
            com.ss.android.socialbase.downloader.downloader.i.vv().m();
            this.f61059m = true;
            this.f61058i = false;
            int i4 = this.qv;
            if (i4 != -1) {
                try {
                    this.f61112u.jh(i4);
                } catch (RemoteException e5) {
                    e5.printStackTrace();
                }
            }
            if (this.f61112u != null) {
                n();
            }
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        com.ss.android.socialbase.downloader.p.vv.m(f61110o, "onServiceDisconnected ");
        this.f61112u = null;
        this.f61059m = false;
        com.ss.android.socialbase.downloader.downloader.t tVar = this.f61111n;
        if (tVar != null) {
            tVar.qv();
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.vv, com.ss.android.socialbase.downloader.downloader.q
    public void p(DownloadTask downloadTask) {
        if (downloadTask == null) {
            return;
        }
        com.ss.android.socialbase.downloader.downloader.i.vv().vv(downloadTask.getDownloadId(), true);
        vv w4 = com.ss.android.socialbase.downloader.downloader.p.w();
        if (w4 != null) {
            w4.vv(downloadTask);
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.vv
    public void startService(Context context, ServiceConnection serviceConnection) {
        try {
            com.ss.android.socialbase.downloader.p.vv.m(f61110o, "bindService");
            Intent intent = new Intent(context, IndependentProcessDownloadService.class);
            if (com.ss.android.socialbase.downloader.wv.u.vv()) {
                intent.putExtra("fix_downloader_db_sigbus", com.ss.android.socialbase.downloader.n.vv.p().vv("fix_sigbus_downloader_db"));
            }
            if (serviceConnection != null) {
                context.bindService(intent, serviceConnection, 1);
            }
            context.startService(intent);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.vv
    public void stopService(Context context, ServiceConnection serviceConnection) {
        com.ss.android.socialbase.downloader.p.vv.m(f61110o, "stopService");
        this.f61059m = false;
        Intent intent = new Intent(context, IndependentProcessDownloadService.class);
        if (serviceConnection != null) {
            context.unbindService(serviceConnection);
        }
        context.stopService(intent);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.vv, com.ss.android.socialbase.downloader.downloader.q
    public IBinder vv(Intent intent) {
        if (intent != null && intent.getBooleanExtra("fix_downloader_db_sigbus", false)) {
            com.ss.android.socialbase.downloader.n.vv.vv("fix_sigbus_downloader_db", true);
        }
        com.ss.android.socialbase.downloader.p.vv.m(f61110o, "onBind IndependentDownloadBinder");
        return new r();
    }

    @Override // com.ss.android.socialbase.downloader.downloader.vv, com.ss.android.socialbase.downloader.downloader.q
    public void vv(com.ss.android.socialbase.downloader.downloader.t tVar) {
        this.f61111n = tVar;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.vv, com.ss.android.socialbase.downloader.downloader.q
    public void vv(int i4) {
        com.ss.android.socialbase.downloader.downloader.wv wvVar = this.f61112u;
        if (wvVar == null) {
            this.qv = i4;
            return;
        }
        try {
            wvVar.jh(i4);
        } catch (RemoteException e5) {
            e5.printStackTrace();
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.vv, com.ss.android.socialbase.downloader.downloader.q
    public void startService() {
        if (this.f61112u == null) {
            startService(com.ss.android.socialbase.downloader.downloader.p.ky(), this);
        }
    }
}
