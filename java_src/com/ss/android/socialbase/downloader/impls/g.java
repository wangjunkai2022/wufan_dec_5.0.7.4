package com.ss.android.socialbase.downloader.impls;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.SparseArray;
import com.join.mgps.data.c;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.vv.vv;
import java.util.ArrayList;
import java.util.Collections;
import org.json.JSONObject;
/* loaded from: classes5.dex */
public class g implements Handler.Callback, vv.InterfaceC0653vv {
    private static volatile g vv;
    private static m wv;

    /* renamed from: o  reason: collision with root package name */
    private final boolean f61073o;
    private ConnectivityManager qv;

    /* renamed from: u  reason: collision with root package name */
    private long f61075u;

    /* renamed from: p  reason: collision with root package name */
    private final Handler f61074p = new Handler(Looper.getMainLooper(), this);

    /* renamed from: i  reason: collision with root package name */
    private final SparseArray<vv> f61070i = new SparseArray<>();

    /* renamed from: n  reason: collision with root package name */
    private int f61072n = 0;

    /* renamed from: m  reason: collision with root package name */
    private final Context f61071m = com.ss.android.socialbase.downloader.downloader.p.ky();

    /* loaded from: classes5.dex */
    public interface m {
        void vv(DownloadInfo downloadInfo, long j4, boolean z4, int i4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static class vv {

        /* renamed from: b  reason: collision with root package name */
        private long f61079b;

        /* renamed from: i  reason: collision with root package name */
        final int f61080i;
        private boolean jh;

        /* renamed from: k  reason: collision with root package name */
        private boolean f61081k;

        /* renamed from: m  reason: collision with root package name */
        final int f61082m;

        /* renamed from: n  reason: collision with root package name */
        final int[] f61083n;

        /* renamed from: o  reason: collision with root package name */
        final int f61084o;

        /* renamed from: p  reason: collision with root package name */
        final int f61085p;
        private int qv;

        /* renamed from: u  reason: collision with root package name */
        final boolean f61086u;
        final int vv;
        private int wv;

        vv(int i4, int i5, int i6, int i7, int i8, boolean z4, int[] iArr) {
            i7 = i7 < 3000 ? 3000 : i7;
            i8 = i8 < 5000 ? 5000 : i8;
            this.vv = i4;
            this.f61082m = i5;
            this.f61085p = i6;
            this.f61080i = i7;
            this.f61084o = i8;
            this.f61086u = z4;
            this.f61083n = iArr;
            this.qv = i7;
        }

        int i() {
            return this.qv;
        }

        void p() {
            this.qv = this.f61080i;
        }

        synchronized void m() {
            this.wv++;
        }

        boolean vv(long j4, int i4, int i5, boolean z4) {
            if (!this.jh) {
                com.ss.android.socialbase.downloader.p.vv.p("RetryScheduler", "canRetry: mIsWaitingRetry is false, return false!!!");
                return false;
            } else if (this.f61082m >= i4 && this.wv < this.f61085p) {
                if (!this.f61081k || i5 == 2) {
                    return z4 || j4 - this.f61079b >= ((long) this.f61080i);
                }
                return false;
            } else {
                return false;
            }
        }

        synchronized void vv() {
            this.qv += this.f61084o;
        }

        synchronized void vv(long j4) {
            this.f61079b = j4;
        }
    }

    private g() {
        u();
        this.f61073o = com.ss.android.socialbase.downloader.wv.u.p();
        com.ss.android.socialbase.downloader.vv.vv.vv().vv(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int n() {
        try {
            if (this.qv == null) {
                this.qv = (ConnectivityManager) this.f61071m.getApplicationContext().getSystemService("connectivity");
            }
            NetworkInfo activeNetworkInfo = this.qv.getActiveNetworkInfo();
            if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                return activeNetworkInfo.getType() == 1 ? 2 : 1;
            }
        } catch (Exception unused) {
        }
        return 0;
    }

    private void u() {
        if (com.ss.android.socialbase.downloader.n.vv.p().vv("use_network_callback", 0) != 1) {
            return;
        }
        com.ss.android.socialbase.downloader.downloader.p.jh().execute(new Runnable() { // from class: com.ss.android.socialbase.downloader.impls.g.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    if (g.this.f61071m == null || Build.VERSION.SDK_INT < 21) {
                        return;
                    }
                    g gVar = g.this;
                    gVar.qv = (ConnectivityManager) gVar.f61071m.getApplicationContext().getSystemService("connectivity");
                    g.this.qv.registerNetworkCallback(new NetworkRequest.Builder().build(), new ConnectivityManager.NetworkCallback() { // from class: com.ss.android.socialbase.downloader.impls.g.1.1
                        @Override // android.net.ConnectivityManager.NetworkCallback
                        public void onAvailable(Network network) {
                            com.ss.android.socialbase.downloader.p.vv.m("RetryScheduler", "network onAvailable: ");
                            g.this.vv(1, true);
                        }
                    });
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
            }
        });
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what == 0) {
            m(message.arg1, message.arg2 == 1);
        } else {
            com.ss.android.socialbase.downloader.p.vv.p("RetryScheduler", "handleMessage, doSchedulerRetry, id = " + message.what);
            vv(message.what);
        }
        return true;
    }

    private vv i(int i4) {
        int[] iArr;
        int i5;
        int i6;
        boolean z4;
        com.ss.android.socialbase.downloader.n.vv vv2 = com.ss.android.socialbase.downloader.n.vv.vv(i4);
        boolean z5 = false;
        int vv3 = vv2.vv("retry_schedule", 0);
        JSONObject i7 = vv2.i("retry_schedule_config");
        int i8 = 60;
        if (i7 != null) {
            int optInt = i7.optInt("max_count", 60);
            int optInt2 = i7.optInt("interval_sec", 60);
            int optInt3 = i7.optInt("interval_sec_acceleration", 60);
            if (Build.VERSION.SDK_INT >= 21 && wv != null && i7.optInt("use_job_scheduler", 0) == 1) {
                z5 = true;
            }
            iArr = vv(i7.optString("allow_error_code"));
            i5 = optInt3;
            z4 = z5;
            i6 = optInt;
            i8 = optInt2;
        } else {
            iArr = null;
            i5 = 60;
            i6 = 60;
            z4 = false;
        }
        return new vv(i4, vv3, i6, i8 * 1000, i5 * 1000, z4, iArr);
    }

    private void m(final int i4, final boolean z4) {
        com.ss.android.socialbase.downloader.downloader.p.jh().execute(new Runnable() { // from class: com.ss.android.socialbase.downloader.impls.g.2
            @Override // java.lang.Runnable
            public void run() {
                int n4;
                try {
                    if (g.this.f61072n > 0 && (n4 = g.this.n()) != 0) {
                        com.ss.android.socialbase.downloader.p.vv.p("RetryScheduler", "doScheduleAllTaskRetry: mWaitingRetryTasksCount = " + g.this.f61072n);
                        long currentTimeMillis = System.currentTimeMillis();
                        ArrayList<vv> arrayList = new ArrayList();
                        synchronized (g.this.f61070i) {
                            for (int i5 = 0; i5 < g.this.f61070i.size(); i5++) {
                                vv vvVar = (vv) g.this.f61070i.valueAt(i5);
                                if (vvVar != null && vvVar.vv(currentTimeMillis, i4, n4, z4)) {
                                    if (z4) {
                                        vvVar.p();
                                    }
                                    arrayList.add(vvVar);
                                }
                            }
                        }
                        if (arrayList.size() > 0) {
                            for (vv vvVar2 : arrayList) {
                                g.this.vv(vvVar2.vv, n4, false);
                            }
                        }
                    }
                } catch (Exception unused) {
                }
            }
        });
    }

    private void p(int i4) {
        synchronized (this.f61070i) {
            this.f61070i.remove(i4);
        }
    }

    public void o() {
        vv(5, false);
    }

    private vv m(int i4) {
        vv vvVar = this.f61070i.get(i4);
        if (vvVar == null) {
            synchronized (this.f61070i) {
                vvVar = this.f61070i.get(i4);
                if (vvVar == null) {
                    vvVar = i(i4);
                }
                this.f61070i.put(i4, vvVar);
            }
        }
        return vvVar;
    }

    public static g vv() {
        if (vv == null) {
            synchronized (g.class) {
                if (vv == null) {
                    vv = new g();
                }
            }
        }
        return vv;
    }

    @Override // com.ss.android.socialbase.downloader.vv.vv.InterfaceC0653vv
    public void p() {
        vv(3, false);
    }

    @Override // com.ss.android.socialbase.downloader.vv.vv.InterfaceC0653vv
    public void m() {
        vv(4, false);
    }

    public static void vv(m mVar) {
        wv = mVar;
    }

    public void i() {
        vv(2, true);
    }

    public void vv(DownloadInfo downloadInfo) {
        if (downloadInfo == null || TextUtils.isEmpty(com.ss.android.socialbase.downloader.constants.o.vv) || !com.ss.android.socialbase.downloader.constants.o.vv.equals(downloadInfo.getMimeType())) {
            return;
        }
        vv(downloadInfo, downloadInfo.isOnlyWifi() || downloadInfo.isPauseReserveOnWifi(), n());
    }

    private void vv(DownloadInfo downloadInfo, boolean z4, int i4) {
        BaseException failedException = downloadInfo.getFailedException();
        if (failedException == null) {
            return;
        }
        vv m4 = m(downloadInfo.getId());
        if (m4.wv > m4.f61085p) {
            com.ss.android.socialbase.downloader.p.vv.i("RetryScheduler", "tryStartScheduleRetry, id = " + m4.vv + ", mRetryCount = " + m4.wv + ", maxCount = " + m4.f61085p);
            return;
        }
        int errorCode = failedException.getErrorCode();
        if (!com.ss.android.socialbase.downloader.wv.u.qv(failedException) && !com.ss.android.socialbase.downloader.wv.u.wv(failedException) && (!downloadInfo.statusInPause() || !downloadInfo.isPauseReserveOnWifi())) {
            if (!vv(m4, errorCode)) {
                return;
            }
            com.ss.android.socialbase.downloader.p.vv.p("RetryScheduler", "allow error code, id = " + m4.vv + ", error code = " + errorCode);
        }
        m4.f61081k = z4;
        synchronized (this.f61070i) {
            if (!m4.jh) {
                m4.jh = true;
                this.f61072n++;
            }
        }
        int i5 = m4.i();
        com.ss.android.socialbase.downloader.p.vv.p("RetryScheduler", "tryStartScheduleRetry: id = " + m4.vv + ", delayTimeMills = " + i5 + ", mWaitingRetryTasks = " + this.f61072n);
        if (!m4.f61086u) {
            if (z4) {
                return;
            }
            this.f61074p.removeMessages(downloadInfo.getId());
            this.f61074p.sendEmptyMessageDelayed(downloadInfo.getId(), i5);
            return;
        }
        if (i4 == 0) {
            m4.p();
        }
        m mVar = wv;
        if (mVar != null) {
            mVar.vv(downloadInfo, i5, z4, i4);
        }
        if (this.f61073o) {
            m4.vv(System.currentTimeMillis());
            m4.m();
            m4.vv();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void vv(int i4, boolean z4) {
        if (this.f61072n <= 0) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (this) {
            if (!z4) {
                if (currentTimeMillis - this.f61075u < c.f49010a) {
                    return;
                }
            }
            this.f61075u = currentTimeMillis;
            com.ss.android.socialbase.downloader.p.vv.p("RetryScheduler", "scheduleAllTaskRetry, level = [" + i4 + "], force = [" + z4 + "]");
            if (z4) {
                this.f61074p.removeMessages(0);
            }
            Message obtain = Message.obtain();
            obtain.what = 0;
            obtain.arg1 = i4;
            obtain.arg2 = z4 ? 1 : 0;
            this.f61074p.sendMessageDelayed(obtain, 2000L);
        }
    }

    public void vv(final int i4) {
        com.ss.android.socialbase.downloader.downloader.p.jh().execute(new Runnable() { // from class: com.ss.android.socialbase.downloader.impls.g.3
            @Override // java.lang.Runnable
            public void run() {
                try {
                    g gVar = g.this;
                    gVar.vv(i4, gVar.n(), true);
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void vv(int i4, int i5, boolean z4) {
        com.ss.android.socialbase.downloader.downloader.g reserveWifiStatusListener;
        boolean z5;
        Context context = this.f61071m;
        if (context == null) {
            return;
        }
        synchronized (this.f61070i) {
            vv vvVar = this.f61070i.get(i4);
            if (vvVar == null) {
                return;
            }
            boolean z6 = true;
            if (vvVar.jh) {
                vvVar.jh = false;
                int i6 = this.f61072n - 1;
                this.f61072n = i6;
                if (i6 < 0) {
                    this.f61072n = 0;
                }
            }
            com.ss.android.socialbase.downloader.p.vv.p("RetryScheduler", "doSchedulerRetryInSubThread: downloadId = " + i4 + ", retryCount = " + vvVar.wv + ", mWaitingRetryTasksCount = " + this.f61072n);
            DownloadInfo downloadInfo = Downloader.getInstance(context).getDownloadInfo(i4);
            if (downloadInfo == null) {
                p(i4);
                return;
            }
            com.ss.android.socialbase.downloader.p.vv.o("RetryScheduler", "doSchedulerRetryInSubThread，id:".concat(String.valueOf(i4)));
            int realStatus = downloadInfo.getRealStatus();
            if (realStatus != -3 && realStatus != -4) {
                if (realStatus == -5 || (realStatus == -2 && downloadInfo.isPauseReserveOnWifi())) {
                    if (realStatus == -2 && (reserveWifiStatusListener = Downloader.getInstance(com.ss.android.socialbase.downloader.downloader.p.ky()).getReserveWifiStatusListener()) != null) {
                        reserveWifiStatusListener.vv(downloadInfo, 4, 3);
                    }
                    com.ss.android.socialbase.downloader.downloader.jh l4 = com.ss.android.socialbase.downloader.downloader.p.l();
                    if (l4 != null) {
                        l4.vv(Collections.singletonList(downloadInfo), 3);
                    }
                    p(i4);
                    return;
                } else if (realStatus != -1) {
                    return;
                } else {
                    if (i5 != 0) {
                        z5 = true;
                    } else if (!vvVar.f61086u) {
                        return;
                    } else {
                        z5 = false;
                    }
                    BaseException failedException = downloadInfo.getFailedException();
                    if (z5 && com.ss.android.socialbase.downloader.wv.u.qv(failedException)) {
                        z5 = vv(downloadInfo, failedException);
                    }
                    vvVar.m();
                    if (z5) {
                        com.ss.android.socialbase.downloader.p.vv.p("RetryScheduler", "doSchedulerRetry: restart task, ****** id = " + vvVar.vv);
                        vvVar.vv(System.currentTimeMillis());
                        if (z4) {
                            vvVar.vv();
                        }
                        downloadInfo.setRetryScheduleCount(vvVar.wv);
                        if (downloadInfo.getStatus() == -1) {
                            Downloader.getInstance(context).restart(downloadInfo.getId());
                            return;
                        }
                        return;
                    }
                    if (z4) {
                        vvVar.vv();
                    }
                    if (!downloadInfo.isOnlyWifi() && !downloadInfo.isPauseReserveOnWifi()) {
                        z6 = false;
                    }
                    vv(downloadInfo, z6, i5);
                    return;
                }
            }
            p(i4);
        }
    }

    private boolean vv(vv vvVar, int i4) {
        int[] iArr = vvVar.f61083n;
        if (iArr != null && iArr.length != 0) {
            for (int i5 : iArr) {
                if (i5 == i4) {
                    return true;
                }
            }
        }
        return false;
    }

    private int[] vv(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            String[] split = str.split(",");
            if (split.length <= 0) {
                return null;
            }
            int[] iArr = new int[split.length];
            for (int i4 = 0; i4 < split.length; i4++) {
                iArr[i4] = Integer.parseInt(split[i4]);
            }
            return iArr;
        } catch (Throwable unused) {
            return null;
        }
    }

    private boolean vv(DownloadInfo downloadInfo, BaseException baseException) {
        long j4;
        long totalBytes;
        try {
            j4 = com.ss.android.socialbase.downloader.wv.u.i(downloadInfo.getTempPath());
        } catch (BaseException e5) {
            e5.printStackTrace();
            j4 = 0;
        }
        if (baseException instanceof com.ss.android.socialbase.downloader.exception.i) {
            totalBytes = ((com.ss.android.socialbase.downloader.exception.i) baseException).m();
        } else {
            totalBytes = downloadInfo.getTotalBytes() - downloadInfo.getCurBytes();
        }
        if (j4 < totalBytes) {
            com.ss.android.socialbase.downloader.n.vv vv2 = com.ss.android.socialbase.downloader.n.vv.vv(downloadInfo.getId());
            if (vv2.vv("space_fill_part_download", 0) == 1) {
                if (j4 > 0) {
                    int vv3 = vv2.vv("space_fill_min_keep_mb", 100);
                    if (vv3 > 0) {
                        long j5 = j4 - (vv3 * 1048576);
                        com.ss.android.socialbase.downloader.p.vv.p("RetryScheduler", "retry schedule: available = " + com.ss.android.socialbase.downloader.wv.u.vv(j4) + "MB, minKeep = " + vv3 + "MB, canDownload = " + com.ss.android.socialbase.downloader.wv.u.vv(j5) + "MB");
                        if (j5 <= 0) {
                            com.ss.android.socialbase.downloader.p.vv.i("RetryScheduler", "doSchedulerRetryInSubThread: canDownload <= 0 , canRetry = false !!!!");
                            return false;
                        }
                    }
                } else if (vv2.vv("download_when_space_negative", 0) != 1) {
                }
            }
            return false;
        }
        return true;
    }
}
