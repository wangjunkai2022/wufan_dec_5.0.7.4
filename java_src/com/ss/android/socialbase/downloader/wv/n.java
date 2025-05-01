package com.ss.android.socialbase.downloader.wv;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.SparseArray;
import com.ss.android.socialbase.downloader.depend.IDownloadFileUriProvider;
import com.ss.android.socialbase.downloader.depend.IDownloadInterceptor;
import com.ss.android.socialbase.downloader.depend.IDownloadListener;
import com.ss.android.socialbase.downloader.depend.a;
import com.ss.android.socialbase.downloader.depend.d;
import com.ss.android.socialbase.downloader.depend.f;
import com.ss.android.socialbase.downloader.depend.g;
import com.ss.android.socialbase.downloader.depend.j;
import com.ss.android.socialbase.downloader.depend.jh;
import com.ss.android.socialbase.downloader.depend.k;
import com.ss.android.socialbase.downloader.depend.l;
import com.ss.android.socialbase.downloader.depend.la;
import com.ss.android.socialbase.downloader.depend.n;
import com.ss.android.socialbase.downloader.depend.ns;
import com.ss.android.socialbase.downloader.depend.o;
import com.ss.android.socialbase.downloader.depend.ot;
import com.ss.android.socialbase.downloader.depend.q;
import com.ss.android.socialbase.downloader.depend.qv;
import com.ss.android.socialbase.downloader.depend.r;
import com.ss.android.socialbase.downloader.depend.t;
import com.ss.android.socialbase.downloader.depend.u;
import com.ss.android.socialbase.downloader.depend.v;
import com.ss.android.socialbase.downloader.depend.vu;
import com.ss.android.socialbase.downloader.depend.w;
import com.ss.android.socialbase.downloader.depend.wv;
import com.ss.android.socialbase.downloader.depend.x;
import com.ss.android.socialbase.downloader.depend.y;
import com.ss.android.socialbase.downloader.depend.ya;
import com.ss.android.socialbase.downloader.depend.zn;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.DownloadTask;
import com.ss.android.socialbase.downloader.model.vv;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes5.dex */
public class n {
    private static Handler vv = new Handler(Looper.getMainLooper());

    public static com.ss.android.socialbase.downloader.model.vv vv(final DownloadTask downloadTask) {
        if (downloadTask == null) {
            return null;
        }
        return new vv.AbstractBinderC0647vv() { // from class: com.ss.android.socialbase.downloader.wv.n.1
            @Override // com.ss.android.socialbase.downloader.model.vv
            public com.ss.android.socialbase.downloader.depend.n b() throws RemoteException {
                return n.vv(DownloadTask.this.getFileUriProvider());
            }

            @Override // com.ss.android.socialbase.downloader.model.vv
            public w i() throws RemoteException {
                return n.vv(DownloadTask.this.getNotificationClickCallback());
            }

            @Override // com.ss.android.socialbase.downloader.model.vv
            public int jh() throws RemoteException {
                return DownloadTask.this.getDownloadCompleteHandlers().size();
            }

            @Override // com.ss.android.socialbase.downloader.model.vv
            public com.ss.android.socialbase.downloader.depend.k k() throws RemoteException {
                return n.vv(DownloadTask.this.getMonitorDepend());
            }

            @Override // com.ss.android.socialbase.downloader.model.vv
            public com.ss.android.socialbase.downloader.depend.o m() throws RemoteException {
                return n.vv(DownloadTask.this.getChunkStrategy());
            }

            @Override // com.ss.android.socialbase.downloader.model.vv
            public y n() throws RemoteException {
                return n.vv(DownloadTask.this.getForbiddenHandler());
            }

            @Override // com.ss.android.socialbase.downloader.model.vv
            public com.ss.android.socialbase.downloader.depend.qv o() throws RemoteException {
                return n.vv(DownloadTask.this.getInterceptor());
            }

            @Override // com.ss.android.socialbase.downloader.model.vv
            public ns p() throws RemoteException {
                return n.vv(DownloadTask.this.getNotificationEventListener());
            }

            @Override // com.ss.android.socialbase.downloader.model.vv
            public zn qv() throws RemoteException {
                return n.vv(DownloadTask.this.getRetryDelayTimeCalculator());
            }

            @Override // com.ss.android.socialbase.downloader.model.vv
            public com.ss.android.socialbase.downloader.depend.u u() throws RemoteException {
                return n.vv(DownloadTask.this.getDepend());
            }

            @Override // com.ss.android.socialbase.downloader.model.vv
            public DownloadInfo vv() throws RemoteException {
                return DownloadTask.this.getDownloadInfo();
            }

            @Override // com.ss.android.socialbase.downloader.model.vv
            public j wv() throws RemoteException {
                return n.vv(DownloadTask.this.getDiskSpaceHandler());
            }

            @Override // com.ss.android.socialbase.downloader.model.vv
            public com.ss.android.socialbase.downloader.depend.wv m(int i4) throws RemoteException {
                return n.vv(DownloadTask.this.getSingleDownloadListener(u.o(i4)), i4 != com.ss.android.socialbase.downloader.constants.u.SUB.ordinal());
            }

            @Override // com.ss.android.socialbase.downloader.model.vv
            public jh p(int i4) throws RemoteException {
                return n.vv(DownloadTask.this.getDownloadCompleteHandlerByIndex(i4));
            }

            @Override // com.ss.android.socialbase.downloader.model.vv
            public int vv(int i4) throws RemoteException {
                return DownloadTask.this.getDownloadListenerSize(u.o(i4));
            }

            @Override // com.ss.android.socialbase.downloader.model.vv
            public com.ss.android.socialbase.downloader.depend.wv vv(int i4, int i5) throws RemoteException {
                return n.vv(DownloadTask.this.getDownloadListenerByIndex(u.o(i4), i5), i4 != com.ss.android.socialbase.downloader.constants.u.SUB.ordinal());
            }
        };
    }

    public static com.ss.android.socialbase.downloader.depend.wv vv(final IDownloadListener iDownloadListener, final boolean z4) {
        if (iDownloadListener == null) {
            return null;
        }
        return new wv.vv() { // from class: com.ss.android.socialbase.downloader.wv.n.12
            @Override // com.ss.android.socialbase.downloader.depend.wv
            public void i(final DownloadInfo downloadInfo) throws RemoteException {
                if (z4) {
                    n.vv.post(new Runnable() { // from class: com.ss.android.socialbase.downloader.wv.n.12.7
                        @Override // java.lang.Runnable
                        public void run() {
                            IDownloadListener.this.onPause(downloadInfo);
                        }
                    });
                } else {
                    IDownloadListener.this.onPause(downloadInfo);
                }
            }

            @Override // com.ss.android.socialbase.downloader.depend.wv
            public void m(final DownloadInfo downloadInfo) throws RemoteException {
                if (z4) {
                    n.vv.post(new Runnable() { // from class: com.ss.android.socialbase.downloader.wv.n.12.5
                        @Override // java.lang.Runnable
                        public void run() {
                            IDownloadListener.this.onStart(downloadInfo);
                        }
                    });
                } else {
                    IDownloadListener.this.onStart(downloadInfo);
                }
            }

            @Override // com.ss.android.socialbase.downloader.depend.wv
            public void n(final DownloadInfo downloadInfo) throws RemoteException {
                if (z4) {
                    n.vv.post(new Runnable() { // from class: com.ss.android.socialbase.downloader.wv.n.12.11
                        @Override // java.lang.Runnable
                        public void run() {
                            IDownloadListener.this.onFirstStart(downloadInfo);
                        }
                    });
                } else {
                    IDownloadListener.this.onFirstStart(downloadInfo);
                }
            }

            @Override // com.ss.android.socialbase.downloader.depend.wv
            public void o(final DownloadInfo downloadInfo) throws RemoteException {
                if (z4) {
                    n.vv.post(new Runnable() { // from class: com.ss.android.socialbase.downloader.wv.n.12.8
                        @Override // java.lang.Runnable
                        public void run() {
                            IDownloadListener.this.onSuccessed(downloadInfo);
                        }
                    });
                } else {
                    IDownloadListener.this.onSuccessed(downloadInfo);
                }
            }

            @Override // com.ss.android.socialbase.downloader.depend.wv
            public void p(final DownloadInfo downloadInfo) throws RemoteException {
                if (z4) {
                    n.vv.post(new Runnable() { // from class: com.ss.android.socialbase.downloader.wv.n.12.6
                        @Override // java.lang.Runnable
                        public void run() {
                            IDownloadListener.this.onProgress(downloadInfo);
                        }
                    });
                } else {
                    IDownloadListener.this.onProgress(downloadInfo);
                }
            }

            @Override // com.ss.android.socialbase.downloader.depend.wv
            public void qv(final DownloadInfo downloadInfo) throws RemoteException {
                if (z4) {
                    n.vv.post(new Runnable() { // from class: com.ss.android.socialbase.downloader.wv.n.12.12
                        @Override // java.lang.Runnable
                        public void run() {
                            IDownloadListener.this.onFirstSuccess(downloadInfo);
                        }
                    });
                } else {
                    IDownloadListener.this.onFirstSuccess(downloadInfo);
                }
            }

            @Override // com.ss.android.socialbase.downloader.depend.wv
            public void u(final DownloadInfo downloadInfo) throws RemoteException {
                if (z4) {
                    n.vv.post(new Runnable() { // from class: com.ss.android.socialbase.downloader.wv.n.12.10
                        @Override // java.lang.Runnable
                        public void run() {
                            IDownloadListener.this.onCanceled(downloadInfo);
                        }
                    });
                } else {
                    IDownloadListener.this.onCanceled(downloadInfo);
                }
            }

            @Override // com.ss.android.socialbase.downloader.depend.wv
            public int vv() throws RemoteException {
                return IDownloadListener.this.hashCode();
            }

            @Override // com.ss.android.socialbase.downloader.depend.wv
            public void wv(final DownloadInfo downloadInfo) throws RemoteException {
                IDownloadListener iDownloadListener2 = IDownloadListener.this;
                if (iDownloadListener2 instanceof la) {
                    if (z4) {
                        n.vv.post(new Runnable() { // from class: com.ss.android.socialbase.downloader.wv.n.12.4
                            @Override // java.lang.Runnable
                            public void run() {
                                ((la) IDownloadListener.this).vv(downloadInfo);
                            }
                        });
                    } else {
                        ((la) iDownloadListener2).vv(downloadInfo);
                    }
                }
            }

            @Override // com.ss.android.socialbase.downloader.depend.wv
            public void vv(final DownloadInfo downloadInfo) throws RemoteException {
                if (z4) {
                    n.vv.post(new Runnable() { // from class: com.ss.android.socialbase.downloader.wv.n.12.1
                        @Override // java.lang.Runnable
                        public void run() {
                            IDownloadListener.this.onPrepare(downloadInfo);
                        }
                    });
                } else {
                    IDownloadListener.this.onPrepare(downloadInfo);
                }
            }

            @Override // com.ss.android.socialbase.downloader.depend.wv
            public void m(final DownloadInfo downloadInfo, final BaseException baseException) throws RemoteException {
                if (z4) {
                    n.vv.post(new Runnable() { // from class: com.ss.android.socialbase.downloader.wv.n.12.2
                        @Override // java.lang.Runnable
                        public void run() {
                            IDownloadListener.this.onRetry(downloadInfo, baseException);
                        }
                    });
                } else {
                    IDownloadListener.this.onRetry(downloadInfo, baseException);
                }
            }

            @Override // com.ss.android.socialbase.downloader.depend.wv
            public void p(final DownloadInfo downloadInfo, final BaseException baseException) throws RemoteException {
                if (z4) {
                    n.vv.post(new Runnable() { // from class: com.ss.android.socialbase.downloader.wv.n.12.3
                        @Override // java.lang.Runnable
                        public void run() {
                            IDownloadListener.this.onRetryDelay(downloadInfo, baseException);
                        }
                    });
                } else {
                    IDownloadListener.this.onRetryDelay(downloadInfo, baseException);
                }
            }

            @Override // com.ss.android.socialbase.downloader.depend.wv
            public void vv(final DownloadInfo downloadInfo, final BaseException baseException) throws RemoteException {
                if (z4) {
                    n.vv.post(new Runnable() { // from class: com.ss.android.socialbase.downloader.wv.n.12.9
                        @Override // java.lang.Runnable
                        public void run() {
                            IDownloadListener.this.onFailed(downloadInfo, baseException);
                        }
                    });
                } else {
                    IDownloadListener.this.onFailed(downloadInfo, baseException);
                }
            }
        };
    }

    public static ns vv(final vu vuVar) {
        if (vuVar == null) {
            return null;
        }
        return new ns.vv() { // from class: com.ss.android.socialbase.downloader.wv.n.23
            @Override // com.ss.android.socialbase.downloader.depend.ns
            public void vv(int i4, DownloadInfo downloadInfo, String str, String str2) throws RemoteException {
                vu.this.vv(i4, downloadInfo, str, str2);
            }

            @Override // com.ss.android.socialbase.downloader.depend.ns
            public boolean vv(boolean z4) throws RemoteException {
                return vu.this.vv(z4);
            }

            @Override // com.ss.android.socialbase.downloader.depend.ns
            public String vv() throws RemoteException {
                return vu.this.vv();
            }
        };
    }

    public static w vv(final a aVar) {
        if (aVar == null) {
            return null;
        }
        return new w.vv() { // from class: com.ss.android.socialbase.downloader.wv.n.26
            @Override // com.ss.android.socialbase.downloader.depend.w
            public boolean m(DownloadInfo downloadInfo) throws RemoteException {
                return a.this.m(downloadInfo);
            }

            @Override // com.ss.android.socialbase.downloader.depend.w
            public boolean p(DownloadInfo downloadInfo) throws RemoteException {
                return a.this.p(downloadInfo);
            }

            @Override // com.ss.android.socialbase.downloader.depend.w
            public boolean vv(DownloadInfo downloadInfo) throws RemoteException {
                return a.this.vv(downloadInfo);
            }
        };
    }

    public static zn vv(final com.ss.android.socialbase.downloader.downloader.la laVar) {
        if (laVar == null) {
            return null;
        }
        return new zn.vv() { // from class: com.ss.android.socialbase.downloader.wv.n.27
            @Override // com.ss.android.socialbase.downloader.depend.zn
            public long vv(int i4, int i5) throws RemoteException {
                return com.ss.android.socialbase.downloader.downloader.la.this.vv(i4, i5);
            }
        };
    }

    public static y vv(final ya yaVar) {
        if (yaVar == null) {
            return null;
        }
        return new y.vv() { // from class: com.ss.android.socialbase.downloader.wv.n.28
            @Override // com.ss.android.socialbase.downloader.depend.y
            public boolean vv(x xVar) throws RemoteException {
                return ya.this.vv(n.vv(xVar));
            }
        };
    }

    public static com.ss.android.socialbase.downloader.depend.n vv(final IDownloadFileUriProvider iDownloadFileUriProvider) {
        if (iDownloadFileUriProvider == null) {
            return null;
        }
        return new n.vv() { // from class: com.ss.android.socialbase.downloader.wv.n.29
            @Override // com.ss.android.socialbase.downloader.depend.n
            public Uri vv(String str, String str2) throws RemoteException {
                return IDownloadFileUriProvider.this.getUriForFile(str, str2);
            }
        };
    }

    public static v vv(final x xVar) {
        if (xVar == null) {
            return null;
        }
        return new v() { // from class: com.ss.android.socialbase.downloader.wv.n.30
            @Override // com.ss.android.socialbase.downloader.depend.v
            public void vv(List<String> list) {
                try {
                    x.this.vv(list);
                } catch (RemoteException e5) {
                    e5.printStackTrace();
                }
            }

            @Override // com.ss.android.socialbase.downloader.depend.v
            public boolean vv() {
                try {
                    return x.this.vv();
                } catch (RemoteException e5) {
                    e5.printStackTrace();
                    return false;
                }
            }
        };
    }

    public static j vv(final g gVar) {
        if (gVar == null) {
            return null;
        }
        return new j.vv() { // from class: com.ss.android.socialbase.downloader.wv.n.31
            @Override // com.ss.android.socialbase.downloader.depend.j
            public boolean vv(long j4, long j5, q qVar) throws RemoteException {
                return g.this.vv(j4, j5, n.vv(qVar));
            }
        };
    }

    public static d vv(final q qVar) {
        if (qVar == null) {
            return null;
        }
        return new d() { // from class: com.ss.android.socialbase.downloader.wv.n.2
            @Override // com.ss.android.socialbase.downloader.depend.d
            public void vv() {
                try {
                    q.this.vv();
                } catch (RemoteException e5) {
                    e5.printStackTrace();
                }
            }
        };
    }

    public static com.ss.android.socialbase.downloader.depend.u vv(final t tVar) {
        if (tVar == null) {
            return null;
        }
        return new u.vv() { // from class: com.ss.android.socialbase.downloader.wv.n.3
            @Override // com.ss.android.socialbase.downloader.depend.u
            public void vv(DownloadInfo downloadInfo, BaseException baseException, int i4) throws RemoteException {
                t.this.vv(downloadInfo, baseException, i4);
            }
        };
    }

    public static com.ss.android.socialbase.downloader.depend.k vv(final l lVar) {
        if (lVar == null) {
            return null;
        }
        return new k.vv() { // from class: com.ss.android.socialbase.downloader.wv.n.4
            @Override // com.ss.android.socialbase.downloader.depend.k
            public int[] m() throws RemoteException {
                l lVar2 = l.this;
                if (lVar2 instanceof com.ss.android.socialbase.downloader.depend.p) {
                    return ((com.ss.android.socialbase.downloader.depend.p) lVar2).vv();
                }
                return null;
            }

            @Override // com.ss.android.socialbase.downloader.depend.k
            public void vv(String str) throws RemoteException {
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                try {
                    l.this.vv(new JSONObject(str));
                } catch (JSONException e5) {
                    e5.printStackTrace();
                }
            }

            @Override // com.ss.android.socialbase.downloader.depend.k
            public String vv() throws RemoteException {
                return l.this.m();
            }
        };
    }

    public static com.ss.android.socialbase.downloader.depend.o vv(final com.ss.android.socialbase.downloader.downloader.qv qvVar) {
        if (qvVar == null) {
            return null;
        }
        return new o.vv() { // from class: com.ss.android.socialbase.downloader.wv.n.5
            @Override // com.ss.android.socialbase.downloader.depend.o
            public int vv(long j4) throws RemoteException {
                return com.ss.android.socialbase.downloader.downloader.qv.this.vv(j4);
            }
        };
    }

    public static com.ss.android.socialbase.downloader.depend.qv vv(final IDownloadInterceptor iDownloadInterceptor) {
        if (iDownloadInterceptor == null) {
            return null;
        }
        return new qv.vv() { // from class: com.ss.android.socialbase.downloader.wv.n.6
            @Override // com.ss.android.socialbase.downloader.depend.qv
            public boolean vv() throws RemoteException {
                return IDownloadInterceptor.this.intercepte();
            }
        };
    }

    public static DownloadTask vv(com.ss.android.socialbase.downloader.model.vv vvVar) {
        if (vvVar == null) {
            return null;
        }
        try {
            DownloadTask downloadTask = new DownloadTask(vvVar.vv());
            downloadTask.chunkStategy(vv(vvVar.m())).notificationEventListener(vv(vvVar.p())).interceptor(vv(vvVar.o())).depend(vv(vvVar.u())).monitorDepend(vv(vvVar.k())).forbiddenHandler(vv(vvVar.n())).diskSpaceHandler(vv(vvVar.wv())).fileUriProvider(vv(vvVar.b())).notificationClickCallback(vv(vvVar.i())).retryDelayTimeCalculator(vv(vvVar.qv()));
            com.ss.android.socialbase.downloader.constants.u uVar = com.ss.android.socialbase.downloader.constants.u.MAIN;
            com.ss.android.socialbase.downloader.depend.wv m4 = vvVar.m(uVar.ordinal());
            if (m4 != null) {
                downloadTask.mainThreadListenerWithHashCode(m4.hashCode(), vv(m4));
            }
            com.ss.android.socialbase.downloader.constants.u uVar2 = com.ss.android.socialbase.downloader.constants.u.SUB;
            com.ss.android.socialbase.downloader.depend.wv m5 = vvVar.m(uVar2.ordinal());
            if (m5 != null) {
                downloadTask.subThreadListenerWithHashCode(m5.hashCode(), vv(m5));
            }
            com.ss.android.socialbase.downloader.constants.u uVar3 = com.ss.android.socialbase.downloader.constants.u.NOTIFICATION;
            com.ss.android.socialbase.downloader.depend.wv m6 = vvVar.m(uVar3.ordinal());
            if (m6 != null) {
                downloadTask.notificationListenerWithHashCode(m6.hashCode(), vv(m6));
            }
            vv(downloadTask, vvVar, uVar);
            vv(downloadTask, vvVar, uVar2);
            vv(downloadTask, vvVar, uVar3);
            vv(downloadTask, vvVar);
            return downloadTask;
        } catch (RemoteException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    private static void vv(DownloadTask downloadTask, com.ss.android.socialbase.downloader.model.vv vvVar, com.ss.android.socialbase.downloader.constants.u uVar) throws RemoteException {
        SparseArray<IDownloadListener> sparseArray = new SparseArray<>();
        for (int i4 = 0; i4 < vvVar.vv(uVar.ordinal()); i4++) {
            com.ss.android.socialbase.downloader.depend.wv vv2 = vvVar.vv(uVar.ordinal(), i4);
            if (vv2 != null) {
                sparseArray.put(vv2.vv(), vv(vv2));
            }
        }
        downloadTask.setDownloadListeners(sparseArray, uVar);
    }

    private static void vv(DownloadTask downloadTask, com.ss.android.socialbase.downloader.model.vv vvVar) throws RemoteException {
        for (int i4 = 0; i4 < vvVar.jh(); i4++) {
            jh p4 = vvVar.p(i4);
            if (p4 != null) {
                downloadTask.addDownloadCompleteHandler(vv(p4));
            }
        }
    }

    public static vu vv(final ns nsVar) {
        if (nsVar == null) {
            return null;
        }
        return new vu() { // from class: com.ss.android.socialbase.downloader.wv.n.7
            @Override // com.ss.android.socialbase.downloader.depend.vu
            public void vv(int i4, DownloadInfo downloadInfo, String str, String str2) {
                try {
                    ns.this.vv(i4, downloadInfo, str, str2);
                } catch (RemoteException e5) {
                    e5.printStackTrace();
                }
            }

            @Override // com.ss.android.socialbase.downloader.depend.vu
            public boolean vv(boolean z4) {
                try {
                    return ns.this.vv(z4);
                } catch (RemoteException e5) {
                    e5.printStackTrace();
                    return false;
                }
            }

            @Override // com.ss.android.socialbase.downloader.depend.vu
            public String vv() {
                try {
                    return ns.this.vv();
                } catch (RemoteException e5) {
                    e5.printStackTrace();
                    return null;
                }
            }
        };
    }

    public static r vv(final jh jhVar) {
        if (jhVar == null) {
            return null;
        }
        return new r() { // from class: com.ss.android.socialbase.downloader.wv.n.8
            @Override // com.ss.android.socialbase.downloader.depend.r
            public boolean m(DownloadInfo downloadInfo) {
                try {
                    return jh.this.m(downloadInfo);
                } catch (RemoteException e5) {
                    e5.printStackTrace();
                    return false;
                }
            }

            @Override // com.ss.android.socialbase.downloader.depend.r
            public void vv(DownloadInfo downloadInfo) throws BaseException {
                try {
                    jh.this.vv(downloadInfo);
                } catch (RemoteException e5) {
                    throw new BaseException(1008, e5);
                }
            }
        };
    }

    public static jh vv(final r rVar) {
        if (rVar == null) {
            return null;
        }
        return new jh.vv() { // from class: com.ss.android.socialbase.downloader.wv.n.9
            @Override // com.ss.android.socialbase.downloader.depend.jh
            public boolean m(DownloadInfo downloadInfo) throws RemoteException {
                return r.this.m(downloadInfo);
            }

            @Override // com.ss.android.socialbase.downloader.depend.jh
            public void vv(DownloadInfo downloadInfo) throws RemoteException {
                try {
                    r.this.vv(downloadInfo);
                } catch (BaseException e5) {
                    throw new IllegalArgumentException(e5);
                }
            }
        };
    }

    public static a vv(final w wVar) {
        if (wVar == null) {
            return null;
        }
        return new a() { // from class: com.ss.android.socialbase.downloader.wv.n.10
            @Override // com.ss.android.socialbase.downloader.depend.a
            public boolean m(DownloadInfo downloadInfo) {
                try {
                    return w.this.m(downloadInfo);
                } catch (RemoteException e5) {
                    e5.printStackTrace();
                    return false;
                }
            }

            @Override // com.ss.android.socialbase.downloader.depend.a
            public boolean p(DownloadInfo downloadInfo) {
                try {
                    return w.this.p(downloadInfo);
                } catch (RemoteException e5) {
                    e5.printStackTrace();
                    return false;
                }
            }

            @Override // com.ss.android.socialbase.downloader.depend.a
            public boolean vv(DownloadInfo downloadInfo) {
                try {
                    return w.this.vv(downloadInfo);
                } catch (RemoteException e5) {
                    e5.printStackTrace();
                    return false;
                }
            }
        };
    }

    public static com.ss.android.socialbase.downloader.downloader.qv vv(final com.ss.android.socialbase.downloader.depend.o oVar) {
        if (oVar == null) {
            return null;
        }
        return new com.ss.android.socialbase.downloader.downloader.qv() { // from class: com.ss.android.socialbase.downloader.wv.n.11
            @Override // com.ss.android.socialbase.downloader.downloader.qv
            public int vv(long j4) {
                try {
                    return com.ss.android.socialbase.downloader.depend.o.this.vv(j4);
                } catch (RemoteException e5) {
                    e5.printStackTrace();
                    return 0;
                }
            }
        };
    }

    public static t vv(final com.ss.android.socialbase.downloader.depend.u uVar) {
        if (uVar == null) {
            return null;
        }
        return new t() { // from class: com.ss.android.socialbase.downloader.wv.n.13
            @Override // com.ss.android.socialbase.downloader.depend.t
            public void vv(DownloadInfo downloadInfo, BaseException baseException, int i4) {
                if (downloadInfo == null) {
                    return;
                }
                try {
                    com.ss.android.socialbase.downloader.depend.u.this.vv(downloadInfo, baseException, i4);
                } catch (RemoteException e5) {
                    e5.printStackTrace();
                }
            }
        };
    }

    public static l vv(final com.ss.android.socialbase.downloader.depend.k kVar) {
        if (kVar == null) {
            return null;
        }
        return new com.ss.android.socialbase.downloader.depend.p() { // from class: com.ss.android.socialbase.downloader.wv.n.14
            @Override // com.ss.android.socialbase.downloader.depend.l
            public String m() {
                try {
                    return com.ss.android.socialbase.downloader.depend.k.this.vv();
                } catch (RemoteException e5) {
                    e5.printStackTrace();
                    return "";
                }
            }

            @Override // com.ss.android.socialbase.downloader.depend.l
            public void vv(JSONObject jSONObject) {
                if (jSONObject == null) {
                    return;
                }
                try {
                    com.ss.android.socialbase.downloader.depend.k.this.vv(jSONObject.toString());
                } catch (RemoteException e5) {
                    e5.printStackTrace();
                }
            }

            @Override // com.ss.android.socialbase.downloader.depend.p
            public int[] vv() {
                try {
                    return com.ss.android.socialbase.downloader.depend.k.this.m();
                } catch (RemoteException e5) {
                    e5.printStackTrace();
                    return null;
                }
            }
        };
    }

    public static ya vv(final y yVar) {
        if (yVar == null) {
            return null;
        }
        return new ya() { // from class: com.ss.android.socialbase.downloader.wv.n.15
            @Override // com.ss.android.socialbase.downloader.depend.ya
            public boolean vv(v vVar) {
                try {
                    return y.this.vv(n.vv(vVar));
                } catch (RemoteException e5) {
                    e5.printStackTrace();
                    return false;
                }
            }
        };
    }

    public static x vv(final v vVar) {
        if (vVar == null) {
            return null;
        }
        return new x.vv() { // from class: com.ss.android.socialbase.downloader.wv.n.16
            @Override // com.ss.android.socialbase.downloader.depend.x
            public void vv(List<String> list) {
                v.this.vv(list);
            }

            @Override // com.ss.android.socialbase.downloader.depend.x
            public boolean vv() {
                return v.this.vv();
            }
        };
    }

    public static f vv(final ot otVar) {
        if (otVar == null) {
            return null;
        }
        return new f.vv() { // from class: com.ss.android.socialbase.downloader.wv.n.17
            @Override // com.ss.android.socialbase.downloader.depend.f
            public void vv(int i4, int i5) {
                ot.this.vv(i4, i5);
            }
        };
    }

    public static ot vv(final f fVar) {
        if (fVar == null) {
            return null;
        }
        return new ot() { // from class: com.ss.android.socialbase.downloader.wv.n.18
            @Override // com.ss.android.socialbase.downloader.depend.ot
            public void vv(int i4, int i5) {
                try {
                    f.this.vv(i4, i5);
                } catch (RemoteException e5) {
                    e5.printStackTrace();
                }
            }
        };
    }

    public static g vv(final j jVar) {
        if (jVar == null) {
            return null;
        }
        return new g() { // from class: com.ss.android.socialbase.downloader.wv.n.19
            @Override // com.ss.android.socialbase.downloader.depend.g
            public boolean vv(long j4, long j5, d dVar) {
                try {
                    return j.this.vv(j4, j5, n.vv(dVar));
                } catch (RemoteException e5) {
                    e5.printStackTrace();
                    return false;
                }
            }
        };
    }

    public static q vv(final d dVar) {
        if (dVar == null) {
            return null;
        }
        return new q.vv() { // from class: com.ss.android.socialbase.downloader.wv.n.20
            @Override // com.ss.android.socialbase.downloader.depend.q
            public void vv() throws RemoteException {
                d.this.vv();
            }
        };
    }

    public static com.ss.android.socialbase.downloader.downloader.la vv(final zn znVar) {
        if (znVar == null) {
            return null;
        }
        return new com.ss.android.socialbase.downloader.downloader.la() { // from class: com.ss.android.socialbase.downloader.wv.n.21
            @Override // com.ss.android.socialbase.downloader.downloader.la
            public long vv(int i4, int i5) {
                try {
                    return zn.this.vv(i4, i5);
                } catch (RemoteException e5) {
                    e5.printStackTrace();
                    return 0L;
                }
            }
        };
    }

    public static IDownloadInterceptor vv(final com.ss.android.socialbase.downloader.depend.qv qvVar) {
        if (qvVar == null) {
            return null;
        }
        return new IDownloadInterceptor() { // from class: com.ss.android.socialbase.downloader.wv.n.22
            @Override // com.ss.android.socialbase.downloader.depend.IDownloadInterceptor
            public boolean intercepte() {
                try {
                    return com.ss.android.socialbase.downloader.depend.qv.this.vv();
                } catch (RemoteException e5) {
                    e5.printStackTrace();
                    return false;
                }
            }
        };
    }

    public static IDownloadFileUriProvider vv(final com.ss.android.socialbase.downloader.depend.n nVar) {
        if (nVar == null) {
            return null;
        }
        return new IDownloadFileUriProvider() { // from class: com.ss.android.socialbase.downloader.wv.n.24
            @Override // com.ss.android.socialbase.downloader.depend.IDownloadFileUriProvider
            public Uri getUriForFile(String str, String str2) {
                try {
                    return com.ss.android.socialbase.downloader.depend.n.this.vv(str, str2);
                } catch (RemoteException e5) {
                    e5.printStackTrace();
                    return null;
                }
            }
        };
    }

    public static IDownloadListener vv(final com.ss.android.socialbase.downloader.depend.wv wvVar) {
        if (wvVar == null) {
            return null;
        }
        return new la() { // from class: com.ss.android.socialbase.downloader.wv.n.25
            @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
            public void onCanceled(DownloadInfo downloadInfo) {
                try {
                    com.ss.android.socialbase.downloader.depend.wv.this.u(downloadInfo);
                } catch (RemoteException e5) {
                    e5.printStackTrace();
                }
            }

            @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
            public void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
                try {
                    com.ss.android.socialbase.downloader.depend.wv.this.vv(downloadInfo, baseException);
                } catch (RemoteException e5) {
                    e5.printStackTrace();
                }
            }

            @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
            public void onFirstStart(DownloadInfo downloadInfo) {
                try {
                    com.ss.android.socialbase.downloader.depend.wv.this.n(downloadInfo);
                } catch (RemoteException e5) {
                    e5.printStackTrace();
                }
            }

            @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
            public void onFirstSuccess(DownloadInfo downloadInfo) {
                try {
                    com.ss.android.socialbase.downloader.depend.wv.this.qv(downloadInfo);
                } catch (RemoteException e5) {
                    e5.printStackTrace();
                }
            }

            @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
            public void onPause(DownloadInfo downloadInfo) {
                try {
                    com.ss.android.socialbase.downloader.depend.wv.this.i(downloadInfo);
                } catch (RemoteException e5) {
                    e5.printStackTrace();
                }
            }

            @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
            public void onPrepare(DownloadInfo downloadInfo) {
                try {
                    com.ss.android.socialbase.downloader.depend.wv.this.vv(downloadInfo);
                } catch (RemoteException e5) {
                    e5.printStackTrace();
                }
            }

            @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
            public void onProgress(DownloadInfo downloadInfo) {
                try {
                    com.ss.android.socialbase.downloader.depend.wv.this.p(downloadInfo);
                } catch (RemoteException e5) {
                    e5.printStackTrace();
                }
            }

            @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
            public void onRetry(DownloadInfo downloadInfo, BaseException baseException) {
                try {
                    com.ss.android.socialbase.downloader.depend.wv.this.m(downloadInfo, baseException);
                } catch (RemoteException e5) {
                    e5.printStackTrace();
                }
            }

            @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
            public void onRetryDelay(DownloadInfo downloadInfo, BaseException baseException) {
                try {
                    com.ss.android.socialbase.downloader.depend.wv.this.p(downloadInfo, baseException);
                } catch (RemoteException e5) {
                    e5.printStackTrace();
                }
            }

            @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
            public void onStart(DownloadInfo downloadInfo) {
                try {
                    com.ss.android.socialbase.downloader.depend.wv.this.m(downloadInfo);
                } catch (RemoteException e5) {
                    e5.printStackTrace();
                }
            }

            @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
            public void onSuccessed(DownloadInfo downloadInfo) {
                try {
                    com.ss.android.socialbase.downloader.depend.wv.this.o(downloadInfo);
                } catch (RemoteException e5) {
                    e5.printStackTrace();
                }
            }

            @Override // com.ss.android.socialbase.downloader.depend.la
            public void vv(DownloadInfo downloadInfo) {
                try {
                    com.ss.android.socialbase.downloader.depend.wv.this.wv(downloadInfo);
                } catch (RemoteException e5) {
                    e5.printStackTrace();
                }
            }
        };
    }
}
