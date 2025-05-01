package com.ss.android.downloadlib.addownload;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.kuaishou.weapon.p0.g;
import com.ss.android.download.api.config.IDownloadButtonClickListener;
import com.ss.android.download.api.config.OnItemClickListener;
import com.ss.android.download.api.config.x;
import com.ss.android.download.api.download.DownloadController;
import com.ss.android.download.api.download.DownloadEventConfig;
import com.ss.android.download.api.download.DownloadModel;
import com.ss.android.download.api.download.DownloadStatusChangeListener;
import com.ss.android.download.api.download.p;
import com.ss.android.download.api.model.DownloadShortInfo;
import com.ss.android.downloadad.api.download.AdDownloadModel;
import com.ss.android.downloadlib.addownload.qv;
import com.ss.android.downloadlib.n.r;
import com.ss.android.socialbase.appdownloader.DownloadHandlerService;
import com.ss.android.socialbase.downloader.depend.IDownloadListener;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;
/* loaded from: classes5.dex */
public class o implements n, r.vv {
    private static final String vv = "o";

    /* renamed from: b  reason: collision with root package name */
    private boolean f60531b;

    /* renamed from: d  reason: collision with root package name */
    private DownloadController f60532d;

    /* renamed from: g  reason: collision with root package name */
    private SoftReference<OnItemClickListener> f60533g;

    /* renamed from: i  reason: collision with root package name */
    private i f60534i;

    /* renamed from: j  reason: collision with root package name */
    private DownloadEventConfig f60535j;
    private long jh;

    /* renamed from: k  reason: collision with root package name */
    private final IDownloadListener f60536k;
    private boolean la;

    /* renamed from: m  reason: collision with root package name */
    private final com.ss.android.downloadlib.n.r f60537m;

    /* renamed from: n  reason: collision with root package name */
    private DownloadShortInfo f60538n;

    /* renamed from: o  reason: collision with root package name */
    private WeakReference<Context> f60539o;

    /* renamed from: p  reason: collision with root package name */
    private qv f60540p;

    /* renamed from: q  reason: collision with root package name */
    private DownloadModel f60541q;
    private DownloadInfo qv;

    /* renamed from: r  reason: collision with root package name */
    private String f60542r;

    /* renamed from: t  reason: collision with root package name */
    private long f60543t;

    /* renamed from: u  reason: collision with root package name */
    private final Map<Integer, Object> f60544u;
    private p wv;

    /* renamed from: x  reason: collision with root package name */
    private final boolean f60545x;

    /* renamed from: y  reason: collision with root package name */
    private SoftReference<IDownloadButtonClickListener> f60546y;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public interface m {
        void vv(long j4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public interface vv {
        void vv();
    }

    public o() {
        com.ss.android.downloadlib.n.r rVar = new com.ss.android.downloadlib.n.r(Looper.getMainLooper(), this);
        this.f60537m = rVar;
        this.f60544u = new ConcurrentHashMap();
        this.f60536k = new qv.vv(rVar);
        this.f60543t = -1L;
        this.f60541q = null;
        this.f60535j = null;
        this.f60532d = null;
        this.f60540p = new qv(this);
        this.f60534i = new i(rVar);
        this.f60545x = com.ss.android.socialbase.downloader.n.vv.p().vv("ttdownloader_callback_twice");
    }

    private void b() {
        SoftReference<OnItemClickListener> softReference = this.f60533g;
        if (softReference != null && softReference.get() != null) {
            this.f60533g.get().onItemClick(this.f60541q, jh(), r());
            this.f60533g = null;
            return;
        }
        b.m();
        getContext();
        r();
        jh();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public DownloadShortInfo d() {
        if (this.f60538n == null) {
            this.f60538n = new DownloadShortInfo();
        }
        return this.f60538n;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Context getContext() {
        WeakReference<Context> weakReference = this.f60539o;
        if (weakReference != null && weakReference.get() != null) {
            return this.f60539o.get();
        }
        return b.getContext();
    }

    private void j() {
        p pVar = this.wv;
        if (pVar != null && pVar.getStatus() != AsyncTask.Status.FINISHED) {
            this.wv.cancel(true);
        }
        this.wv = new p();
        if (!TextUtils.isEmpty(this.f60542r)) {
            com.ss.android.downloadlib.n.m.vv(this.wv, this.f60541q.getDownloadUrl(), this.f60541q.getPackageName(), this.f60542r);
        } else {
            com.ss.android.downloadlib.n.m.vv(this.wv, this.f60541q.getDownloadUrl(), this.f60541q.getPackageName());
        }
    }

    @NonNull
    private DownloadEventConfig jh() {
        DownloadEventConfig downloadEventConfig = this.f60535j;
        return downloadEventConfig == null ? new p.vv().vv() : downloadEventConfig;
    }

    private boolean q() {
        if (com.ss.android.socialbase.downloader.n.vv.p().vv("fix_click_start")) {
            DownloadInfo downloadInfo = this.qv;
            if (downloadInfo == null) {
                return true;
            }
            if ((downloadInfo.getStatus() == -3 && this.qv.getCurBytes() <= 0) || this.qv.getStatus() == 0 || this.qv.getStatus() == -4) {
                return true;
            }
            return com.ss.android.socialbase.downloader.wv.u.vv(this.qv.getStatus(), this.qv.getSavePath(), this.qv.getName());
        }
        DownloadInfo downloadInfo2 = this.qv;
        if (downloadInfo2 == null) {
            return true;
        }
        return !(downloadInfo2.getStatus() == -3 || Downloader.getInstance(b.getContext()).canResume(this.qv.getId())) || this.qv.getStatus() == 0;
    }

    @NonNull
    private DownloadController r() {
        if (this.f60532d == null) {
            this.f60532d = new com.ss.android.download.api.download.m();
        }
        return this.f60532d;
    }

    private void t() {
        String str = vv;
        com.ss.android.downloadlib.n.b.vv(str, "pICD", null);
        if (this.f60540p.i(this.qv)) {
            com.ss.android.downloadlib.n.b.vv(str, "pICD BC", null);
            u(false);
            return;
        }
        com.ss.android.downloadlib.n.b.vv(str, "pICD IC", null);
        b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n(final boolean z4) {
        this.f60534i.vv(new com.ss.android.downloadlib.addownload.m.o(this.f60543t, this.f60541q, jh(), r()));
        this.f60534i.vv(0, 0L, 0L, new vv() { // from class: com.ss.android.downloadlib.addownload.o.9
            @Override // com.ss.android.downloadlib.addownload.o.vv
            public void vv() {
                if (o.this.f60534i.vv()) {
                    return;
                }
                o.this.qv(z4);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void qv(boolean z4) {
        for (DownloadStatusChangeListener downloadStatusChangeListener : qv.vv(this.f60544u)) {
            downloadStatusChangeListener.onDownloadStart(this.f60541q, r());
        }
        int vv2 = this.f60540p.vv(b.getContext(), this.f60536k);
        String str = vv;
        com.ss.android.downloadlib.n.b.vv(str, "beginDown id:".concat(String.valueOf(vv2)), null);
        if (vv2 != 0) {
            if (this.qv != null && !com.ss.android.socialbase.downloader.n.vv.p().vv("fix_click_start")) {
                this.f60540p.vv(this.qv, false);
            } else if (z4) {
                this.f60540p.vv();
            }
        } else {
            DownloadInfo vv3 = new DownloadInfo.vv(this.f60541q.getDownloadUrl()).vv();
            vv3.setStatus(-1);
            vv(vv3);
            com.ss.android.downloadlib.i.vv.vv().vv(this.f60543t, new BaseException(2, "start download failed, id=0"));
            com.ss.android.downloadlib.o.p.vv().m("beginDown");
        }
        if (this.f60540p.vv(p())) {
            com.ss.android.downloadlib.n.b.vv(str, "beginDown IC id:".concat(String.valueOf(vv2)), null);
            b();
        }
    }

    @Override // com.ss.android.downloadlib.addownload.n
    public long i() {
        return this.jh;
    }

    public boolean o() {
        return b.wv().optInt("quick_app_enable_switch", 0) == 0 && this.f60541q.getQuickAppModel() != null && !TextUtils.isEmpty(this.f60541q.getQuickAppModel().vv()) && com.ss.android.downloadlib.addownload.p.vv(this.qv) && com.ss.android.downloadlib.n.jh.vv(getContext(), new Intent("android.intent.action.VIEW", Uri.parse(this.f60541q.getQuickAppModel().vv())));
    }

    public boolean p() {
        DownloadInfo downloadInfo = this.qv;
        return (downloadInfo == null || downloadInfo.getStatus() == 0) ? false : true;
    }

    public void u() {
        this.f60537m.post(new Runnable() { // from class: com.ss.android.downloadlib.addownload.o.2
            @Override // java.lang.Runnable
            public void run() {
                for (DownloadStatusChangeListener downloadStatusChangeListener : qv.vv(o.this.f60544u)) {
                    downloadStatusChangeListener.onInstalled(o.this.d());
                }
            }
        });
    }

    public boolean wv() {
        SoftReference<IDownloadButtonClickListener> softReference = this.f60546y;
        if (softReference == null) {
            return false;
        }
        return wv.vv(this.f60541q, softReference.get());
    }

    private boolean p(int i4) {
        if (o()) {
            int i5 = -1;
            String vv2 = this.f60541q.getQuickAppModel().vv();
            if (i4 == 1) {
                i5 = 5;
            } else if (i4 == 2) {
                i5 = 4;
            }
            DownloadModel downloadModel = this.f60541q;
            if (downloadModel instanceof AdDownloadModel) {
                ((AdDownloadModel) downloadModel).setFunnelType(3);
            }
            boolean p4 = com.ss.android.downloadlib.n.wv.p(b.getContext(), vv2);
            if (p4) {
                com.ss.android.downloadlib.i.vv.vv().vv(this.f60543t, i4);
                Message obtain = Message.obtain();
                obtain.what = i5;
                obtain.obj = Long.valueOf(this.f60541q.getId());
                com.ss.android.downloadlib.addownload.p.vv().vv(this, i5, this.f60541q);
            } else {
                com.ss.android.downloadlib.i.vv.vv().vv(this.f60543t, false, 0);
            }
            return p4;
        }
        return false;
    }

    private void u(final boolean z4) {
        DownloadModel downloadModel;
        DownloadController downloadController;
        DownloadController downloadController2;
        String str = vv;
        com.ss.android.downloadlib.n.b.vv(str, "pBCD", null);
        if (q()) {
            com.ss.android.downloadlib.addownload.m.o o4 = com.ss.android.downloadlib.addownload.m.u.vv().o(this.f60543t);
            if (this.la) {
                if (wv()) {
                    if (i(false) && (downloadController2 = o4.f60509i) != null && downloadController2.isAutoDownloadOnCardShow()) {
                        vv(z4, true);
                        return;
                    }
                    return;
                }
                vv(z4, true);
                return;
            } else if (this.f60541q.isAd() && (downloadController = o4.f60509i) != null && downloadController.enableShowComplianceDialog() && o4.f60510m != null && com.ss.android.downloadlib.addownload.compliance.m.vv().vv(o4.f60510m) && com.ss.android.downloadlib.addownload.compliance.m.vv().vv(o4)) {
                return;
            } else {
                vv(z4, true);
                return;
            }
        }
        com.ss.android.downloadlib.n.b.vv(str, "pBCD continue download, status:" + this.qv.getStatus(), null);
        DownloadInfo downloadInfo = this.qv;
        if (downloadInfo != null && (downloadModel = this.f60541q) != null) {
            downloadInfo.setOnlyWifi(downloadModel.isNeedWifi());
        }
        final int status = this.qv.getStatus();
        final int id = this.qv.getId();
        final com.ss.android.downloadad.api.vv.m vv2 = com.ss.android.downloadlib.addownload.m.u.vv().vv(this.qv);
        if (status != -2 && status != -1) {
            if (r.vv(status)) {
                if (this.f60541q.enablePause()) {
                    this.f60534i.vv(true);
                    com.ss.android.downloadlib.p.qv.vv().m(com.ss.android.downloadlib.addownload.m.u.vv().i(this.f60543t));
                    if (com.ss.android.downloadlib.n.o.vv(vv2).vv("cancel_pause_optimise_switch", 0) == 1) {
                        com.ss.android.downloadlib.addownload.i.i.vv().vv(vv2, status, new com.ss.android.downloadlib.addownload.i.qv() { // from class: com.ss.android.downloadlib.addownload.o.6
                            @Override // com.ss.android.downloadlib.addownload.i.qv
                            public void vv(com.ss.android.downloadad.api.vv.m mVar) {
                                if (o.this.qv == null && com.ss.android.socialbase.downloader.n.vv.p().vv("fix_handle_pause")) {
                                    o.this.qv = Downloader.getInstance(b.getContext()).getDownloadInfo(id);
                                }
                                o.this.f60540p.vv(o.this.qv, z4);
                                if (o.this.qv != null && com.ss.android.socialbase.downloader.wv.u.m(b.getContext()) && o.this.qv.isPauseReserveOnWifi()) {
                                    o.this.qv.stopPauseReserveOnWifi();
                                    com.ss.android.downloadlib.i.vv.vv().vv("cancel_pause_reserve_wifi_cancel_on_wifi", vv2);
                                    return;
                                }
                                o oVar = o.this;
                                oVar.vv(id, status, oVar.qv);
                            }
                        }, new com.ss.android.downloadlib.addownload.vv.p() { // from class: com.ss.android.downloadlib.addownload.o.5
                            @Override // com.ss.android.downloadlib.addownload.vv.p
                            public void delete() {
                                o.this.vv(true);
                            }
                        });
                        return;
                    } else {
                        com.ss.android.downloadlib.addownload.i.b.vv().vv(vv2, status, new com.ss.android.downloadlib.addownload.i.qv() { // from class: com.ss.android.downloadlib.addownload.o.7
                            @Override // com.ss.android.downloadlib.addownload.i.qv
                            public void vv(com.ss.android.downloadad.api.vv.m mVar) {
                                if (o.this.qv == null && com.ss.android.socialbase.downloader.n.vv.p().vv("fix_handle_pause")) {
                                    o.this.qv = Downloader.getInstance(b.getContext()).getDownloadInfo(id);
                                }
                                o.this.f60540p.vv(o.this.qv, z4);
                                if (o.this.qv != null && com.ss.android.socialbase.downloader.wv.u.m(b.getContext()) && o.this.qv.isPauseReserveOnWifi()) {
                                    o.this.qv.stopPauseReserveOnWifi();
                                    com.ss.android.downloadlib.i.vv.vv().m("pause_reserve_wifi_cancel_on_wifi", vv2);
                                    return;
                                }
                                o oVar = o.this;
                                oVar.vv(id, status, oVar.qv);
                            }
                        });
                        return;
                    }
                }
                return;
            }
            this.f60540p.vv(this.qv, z4);
            vv(id, status, this.qv);
            return;
        }
        this.f60540p.vv(this.qv, z4);
        if (vv2 != null) {
            vv2.qv(System.currentTimeMillis());
            vv2.wv(this.qv.getCurBytes());
        }
        this.qv.setDownloadFromReserveWifi(false);
        this.f60534i.vv(new com.ss.android.downloadlib.addownload.m.o(this.f60543t, this.f60541q, jh(), r()));
        this.f60534i.vv(id, this.qv.getCurBytes(), this.qv.getTotalBytes(), new vv() { // from class: com.ss.android.downloadlib.addownload.o.3
            @Override // com.ss.android.downloadlib.addownload.o.vv
            public void vv() {
                if (o.this.f60534i.vv()) {
                    return;
                }
                o oVar = o.this;
                oVar.vv(id, status, oVar.qv);
            }
        });
        if (status == -2 && com.ss.android.downloadlib.n.o.vv(vv2).vv("show_pause_continue_toast", 0) == 1) {
            com.ss.android.downloadlib.n.vv().m().postDelayed(new Runnable() { // from class: com.ss.android.downloadlib.addownload.o.4
                @Override // java.lang.Runnable
                public void run() {
                    b.p().vv(13, b.getContext(), o.this.f60541q, "已恢复下载", null, 0);
                }
            }, 500L);
        }
    }

    public boolean i(boolean z4) {
        SoftReference<IDownloadButtonClickListener> softReference = this.f60546y;
        if (softReference != null && softReference.get() != null) {
            try {
                if (!z4) {
                    this.f60546y.get().handleComplianceDialog(true);
                } else {
                    this.f60546y.get().handleMarketFailedComplianceDialog();
                }
                this.f60546y = null;
                return true;
            } catch (Exception unused) {
                com.ss.android.downloadlib.o.p.vv().m("mDownloadButtonClickListener has recycled");
                return false;
            }
        }
        com.ss.android.downloadlib.o.p.vv().m("mDownloadButtonClickListener has recycled");
        return false;
    }

    public void n() {
        if (this.f60544u.size() == 0) {
            return;
        }
        for (DownloadStatusChangeListener downloadStatusChangeListener : qv.vv(this.f60544u)) {
            downloadStatusChangeListener.onIdle();
        }
        DownloadInfo downloadInfo = this.qv;
        if (downloadInfo != null) {
            downloadInfo.setStatus(-4);
        }
    }

    @Override // com.ss.android.downloadlib.addownload.n
    /* renamed from: vv */
    public o m(Context context) {
        if (context != null) {
            this.f60539o = new WeakReference<>(context);
        }
        b.m(context);
        return this;
    }

    private void o(boolean z4) {
        if (com.ss.android.downloadlib.n.o.m(this.f60541q).m("notification_opt_2") == 1 && this.qv != null) {
            com.ss.android.socialbase.downloader.notification.m.vv().u(this.qv.getId());
        }
        u(z4);
    }

    @Override // com.ss.android.downloadlib.addownload.n
    /* renamed from: vv */
    public o m(int i4, DownloadStatusChangeListener downloadStatusChangeListener) {
        if (downloadStatusChangeListener != null) {
            if (b.wv().optInt("back_use_softref_listener") == 1) {
                this.f60544u.put(Integer.valueOf(i4), downloadStatusChangeListener);
            } else if (b.wv().optInt("use_weakref_listener") == 1) {
                this.f60544u.put(Integer.valueOf(i4), new WeakReference(downloadStatusChangeListener));
            } else {
                this.f60544u.put(Integer.valueOf(i4), new SoftReference(downloadStatusChangeListener));
            }
        }
        return this;
    }

    @Override // com.ss.android.downloadlib.addownload.n
    public boolean m() {
        return this.f60531b;
    }

    @Override // com.ss.android.downloadlib.addownload.n
    public void m(final int i4) {
        if (i4 != 1 && i4 != 2) {
            throw new IllegalArgumentException("error actionType");
        }
        this.f60540p.vv(this.f60543t);
        if (!com.ss.android.downloadlib.addownload.m.u.vv().o(this.f60543t).ns()) {
            com.ss.android.downloadlib.o.p.vv().vv("handleDownload ModelBox !isStrictValid");
        }
        if (this.f60540p.vv(i4, this.f60541q)) {
            com.ss.android.downloadlib.addownload.compliance.u.vv().vv(this.f60540p.vv, new com.ss.android.downloadlib.addownload.compliance.qv() { // from class: com.ss.android.downloadlib.addownload.o.1
                @Override // com.ss.android.downloadlib.addownload.compliance.qv
                public void vv(String str) {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.putOpt("download_miui_new_market", 1);
                        jSONObject.putOpt("download_miui_market_deeplink", str);
                        if (!com.ss.android.downloadlib.n.qv.vv(o.this.getContext(), o.this.f60540p.vv, str, jSONObject, true, i4)) {
                            jSONObject.putOpt("download_miui_jump_market_success", 0);
                            com.ss.android.downloadlib.addownload.compliance.u.vv().vv(1, o.this.f60540p.vv, jSONObject);
                            int i5 = i4;
                            if (i5 == 1) {
                                String str2 = o.vv;
                                com.ss.android.socialbase.downloader.p.vv.vv(str2, "miui new rollback fail: handleDownload id:" + o.this.f60543t + ",tryPerformButtonClick:", null);
                                o.this.p(true);
                                return;
                            } else if (i5 != 2) {
                                return;
                            } else {
                                String str3 = o.vv;
                                com.ss.android.socialbase.downloader.p.vv.vv(str3, "miui new rollback fail: handleDownload id:" + o.this.f60543t + ",tryPerformButtonClick:", null);
                                o.this.m(true);
                                return;
                            }
                        }
                        jSONObject.putOpt("download_miui_jump_market_success", 1);
                        com.ss.android.downloadlib.addownload.compliance.u.vv().vv(0, o.this.f60540p.vv, jSONObject);
                    } catch (Exception e5) {
                        com.ss.android.downloadlib.o.p.vv().vv(e5, "generate miui new market param error");
                    }
                }

                @Override // com.ss.android.downloadlib.addownload.compliance.qv
                public void vv() {
                    int i5 = i4;
                    if (i5 == 1) {
                        String str = o.vv;
                        com.ss.android.socialbase.downloader.p.vv.vv(str, "miui new get miui deeplink fail: handleDownload id:" + o.this.f60543t + ",tryPerformButtonClick:", null);
                        o.this.p(true);
                    } else if (i5 != 2) {
                    } else {
                        String str2 = o.vv;
                        com.ss.android.socialbase.downloader.p.vv.vv(str2, "miui new get miui deeplink fail: handleDownload id:" + o.this.f60543t + ",tryPerformButtonClick:", null);
                        o.this.m(true);
                    }
                }
            });
        } else if (this.f60540p.vv(getContext(), i4, this.la)) {
        } else {
            boolean p4 = p(i4);
            if (i4 == 1) {
                if (p4) {
                    return;
                }
                String str = vv;
                com.ss.android.downloadlib.n.b.vv(str, "handleDownload id:" + this.f60543t + ",pIC:", null);
                p(true);
            } else if (i4 == 2 && !p4) {
                String str2 = vv;
                com.ss.android.downloadlib.n.b.vv(str2, "handleDownload id:" + this.f60543t + ",pBC:", null);
                m(true);
            }
        }
    }

    @Override // com.ss.android.downloadlib.addownload.n
    /* renamed from: vv */
    public o m(DownloadModel downloadModel) {
        if (downloadModel != null) {
            if (downloadModel.isAd()) {
                if (downloadModel.getId() <= 0 || TextUtils.isEmpty(downloadModel.getLogExtra())) {
                    com.ss.android.downloadlib.o.p.vv().vv("setDownloadModel ad error");
                }
            } else if (downloadModel.getId() == 0 && (downloadModel instanceof AdDownloadModel)) {
                com.ss.android.downloadlib.o.p.vv().vv(false, "setDownloadModel id=0");
                if (com.ss.android.socialbase.downloader.n.vv.p().vv("fix_model_id")) {
                    ((AdDownloadModel) downloadModel).setId(downloadModel.getDownloadUrl().hashCode());
                }
            }
            com.ss.android.downloadlib.addownload.m.u.vv().vv(downloadModel);
            this.f60543t = downloadModel.getId();
            this.f60541q = downloadModel;
            if (wv.vv(downloadModel)) {
                ((AdDownloadModel) downloadModel).setExtraValue(3L);
                com.ss.android.downloadad.api.vv.m i4 = com.ss.android.downloadlib.addownload.m.u.vv().i(this.f60543t);
                if (i4 != null && i4.jh() != 3) {
                    i4.o(3L);
                    com.ss.android.downloadlib.addownload.m.wv.vv().vv(i4);
                }
            }
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public class p extends AsyncTask<String, Void, DownloadInfo> {
        private p() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: vv */
        public DownloadInfo doInBackground(String... strArr) {
            DownloadInfo downloadInfo = null;
            if (strArr != null) {
                if (strArr.length <= 0 || !TextUtils.isEmpty(strArr[0])) {
                    String str = (strArr.length < 3 || TextUtils.isEmpty(strArr[2])) ? "" : strArr[2];
                    String str2 = strArr[0];
                    if (o.this.f60541q != null && !TextUtils.isEmpty(o.this.f60541q.getFilePath())) {
                        if (TextUtils.isEmpty(str)) {
                            downloadInfo = Downloader.getInstance(b.getContext()).getDownloadInfo(str2, o.this.f60541q.getFilePath());
                        } else {
                            downloadInfo = Downloader.getInstance(b.getContext()).getDownloadInfo(Downloader.getInstance(b.getContext()).getDownloadId(str, o.this.f60541q.getFilePath()));
                        }
                    }
                    if (downloadInfo == null) {
                        if (!TextUtils.isEmpty(str)) {
                            return com.ss.android.socialbase.appdownloader.i.k().vv(b.getContext(), str);
                        }
                        return com.ss.android.socialbase.appdownloader.i.k().vv(b.getContext(), str2);
                    }
                    return downloadInfo;
                }
                return null;
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: vv */
        public void onPostExecute(DownloadInfo downloadInfo) {
            super.onPostExecute(downloadInfo);
            if (isCancelled() || o.this.f60541q == null) {
                return;
            }
            try {
                com.ss.android.downloadlib.addownload.m.p vv = com.ss.android.downloadlib.n.jh.vv(o.this.f60541q.getPackageName(), o.this.f60541q.getVersionCode(), o.this.f60541q.getVersionName());
                com.ss.android.downloadlib.addownload.m.qv.vv().vv(o.this.f60541q.getVersionCode(), vv.m(), com.ss.android.downloadlib.addownload.m.u.vv().vv(downloadInfo));
                boolean vv2 = vv.vv();
                if (downloadInfo != null && downloadInfo.getId() != 0 && (vv2 || !Downloader.getInstance(b.getContext()).isDownloadSuccessAndFileNotExist(downloadInfo))) {
                    Downloader.getInstance(b.getContext()).removeTaskMainListener(downloadInfo.getId());
                    if (o.this.qv == null || o.this.qv.getStatus() != -4) {
                        o.this.qv = downloadInfo;
                        if (o.this.f60545x) {
                            Downloader.getInstance(b.getContext()).setMainThreadListener(o.this.qv.getId(), o.this.f60536k, false);
                        } else {
                            Downloader.getInstance(b.getContext()).setMainThreadListener(o.this.qv.getId(), o.this.f60536k);
                        }
                    } else {
                        o.this.qv = null;
                    }
                    o.this.f60540p.vv(o.this.qv, o.this.d(), qv.vv(o.this.f60544u));
                } else {
                    if (downloadInfo != null && Downloader.getInstance(b.getContext()).isDownloadSuccessAndFileNotExist(downloadInfo)) {
                        com.ss.android.socialbase.downloader.notification.m.vv().u(downloadInfo.getId());
                        o.this.qv = null;
                    }
                    if (o.this.qv != null) {
                        Downloader.getInstance(b.getContext()).removeTaskMainListener(o.this.qv.getId());
                        if (o.this.f60545x) {
                            Downloader.getInstance(o.this.getContext()).setMainThreadListener(o.this.qv.getId(), o.this.f60536k, false);
                        } else {
                            Downloader.getInstance(o.this.getContext()).setMainThreadListener(o.this.qv.getId(), o.this.f60536k);
                        }
                    }
                    if (!vv2) {
                        for (DownloadStatusChangeListener downloadStatusChangeListener : qv.vv(o.this.f60544u)) {
                            downloadStatusChangeListener.onIdle();
                        }
                        o.this.qv = null;
                    } else {
                        o oVar = o.this;
                        oVar.qv = new DownloadInfo.vv(oVar.f60541q.getDownloadUrl()).vv();
                        o.this.qv.setStatus(-3);
                        o.this.f60540p.vv(o.this.qv, o.this.d(), qv.vv(o.this.f60544u));
                    }
                }
                o.this.f60540p.p(o.this.qv);
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    public void p(boolean z4) {
        if (z4) {
            com.ss.android.downloadlib.i.vv.vv().vv(this.f60543t, 1);
        }
        t();
    }

    @Override // com.ss.android.downloadlib.addownload.n
    public void qv() {
        com.ss.android.downloadlib.addownload.m.u.vv().u(this.f60543t);
    }

    public void m(boolean z4) {
        o(z4);
    }

    @Override // com.ss.android.downloadlib.addownload.n
    /* renamed from: vv */
    public o m(DownloadController downloadController) {
        JSONObject extra;
        this.f60532d = downloadController;
        if (com.ss.android.downloadlib.n.o.m(this.f60541q).m("force_auto_open") == 1) {
            r().setLinkMode(1);
        }
        if (com.ss.android.socialbase.downloader.n.vv.p().vv("fix_show_dialog") && (extra = this.f60541q.getExtra()) != null && extra.optInt("subprocess") > 0) {
            r().setEnableNewActivity(false);
        }
        com.ss.android.downloadlib.addownload.m.u.vv().vv(this.f60543t, r());
        return this;
    }

    @Override // com.ss.android.downloadlib.addownload.n
    /* renamed from: vv */
    public o m(DownloadEventConfig downloadEventConfig) {
        this.f60535j = downloadEventConfig;
        this.la = jh().getDownloadScene() == 0;
        com.ss.android.downloadlib.addownload.m.u.vv().vv(this.f60543t, jh());
        return this;
    }

    @Override // com.ss.android.downloadlib.addownload.n
    public n vv(OnItemClickListener onItemClickListener) {
        if (onItemClickListener == null) {
            this.f60533g = null;
        } else {
            this.f60533g = new SoftReference<>(onItemClickListener);
        }
        return this;
    }

    @Override // com.ss.android.downloadlib.addownload.n
    public void vv() {
        this.f60531b = true;
        com.ss.android.downloadlib.addownload.m.u.vv().vv(this.f60543t, jh());
        com.ss.android.downloadlib.addownload.m.u.vv().vv(this.f60543t, r());
        this.f60540p.vv(this.f60543t);
        j();
        if (b.wv().optInt("enable_empty_listener", 1) == 1 && this.f60544u.get(Integer.MIN_VALUE) == null) {
            m(Integer.MIN_VALUE, new com.ss.android.download.api.config.vv());
        }
    }

    @Override // com.ss.android.downloadlib.addownload.n
    public boolean vv(int i4) {
        if (i4 == 0) {
            this.f60544u.clear();
        } else {
            this.f60544u.remove(Integer.valueOf(i4));
        }
        if (this.f60544u.isEmpty()) {
            this.f60531b = false;
            this.jh = System.currentTimeMillis();
            if (this.qv != null) {
                Downloader.getInstance(b.getContext()).removeTaskMainListener(this.qv.getId());
            }
            p pVar = this.wv;
            if (pVar != null && pVar.getStatus() != AsyncTask.Status.FINISHED) {
                this.wv.cancel(true);
            }
            this.f60540p.vv(this.qv);
            String str = vv;
            StringBuilder sb = new StringBuilder("onUnbind removeCallbacksAndMessages, downloadUrl:");
            DownloadInfo downloadInfo = this.qv;
            sb.append(downloadInfo == null ? "" : downloadInfo.getUrl());
            com.ss.android.downloadlib.n.b.vv(str, sb.toString(), null);
            this.f60537m.removeCallbacksAndMessages(null);
            this.f60538n = null;
            this.qv = null;
            return true;
        }
        if (this.f60544u.size() == 1 && this.f60544u.containsKey(Integer.MIN_VALUE)) {
            this.f60540p.m(this.qv);
        }
        return false;
    }

    @Override // com.ss.android.downloadlib.addownload.n
    public void vv(boolean z4) {
        if (this.qv != null) {
            if (z4) {
                com.ss.android.socialbase.appdownloader.p.i m4 = com.ss.android.socialbase.appdownloader.i.k().m();
                if (m4 != null) {
                    m4.vv(this.qv);
                }
                Downloader.getInstance(com.ss.android.socialbase.downloader.downloader.p.ky()).cancel(this.qv.getId(), true);
                return;
            }
            Intent intent = new Intent(b.getContext(), DownloadHandlerService.class);
            intent.setAction("android.ss.intent.action.DOWNLOAD_DELETE");
            intent.putExtra("extra_click_download_ids", this.qv.getId());
            b.getContext().startService(intent);
        }
    }

    @Override // com.ss.android.downloadlib.addownload.n
    public n vv(long j4) {
        if (j4 != 0) {
            DownloadModel vv2 = com.ss.android.downloadlib.addownload.m.u.vv().vv(j4);
            if (vv2 != null) {
                this.f60541q = vv2;
                this.f60543t = j4;
                this.f60540p.vv(j4);
            }
        } else {
            com.ss.android.downloadlib.o.p.vv().vv(false, "setModelId");
        }
        return this;
    }

    @Override // com.ss.android.downloadlib.n.r.vv
    public void vv(Message message) {
        if (message != null && this.f60531b && message.what == 3) {
            this.qv = (DownloadInfo) message.obj;
            this.f60540p.vv(message, d(), this.f60544u);
        }
    }

    public void vv(boolean z4, final boolean z5) {
        if (z4) {
            com.ss.android.downloadlib.i.vv.vv().vv(this.f60543t, 2);
        }
        if (!com.ss.android.downloadlib.n.jh.vv()) {
            if (!com.ss.android.downloadlib.n.k.m(g.f55590j) && !r().enableNewActivity()) {
                this.f60541q.setFilePath(this.f60540p.m());
            }
        } else if (!com.ss.android.downloadlib.n.k.m("android.permission.READ_MEDIA_IMAGES") && !com.ss.android.downloadlib.n.k.m("android.permission.READ_MEDIA_AUDIO") && !com.ss.android.downloadlib.n.k.m("android.permission.READ_MEDIA_VIDEO") && !r().enableNewActivity()) {
            this.f60541q.setFilePath(this.f60540p.m());
        }
        if (com.ss.android.downloadlib.n.o.p(this.f60541q) == 0) {
            com.ss.android.downloadlib.n.b.vv(vv, "pBCD not start", null);
            this.f60540p.vv(new x() { // from class: com.ss.android.downloadlib.addownload.o.8
                @Override // com.ss.android.download.api.config.x
                public void vv() {
                    com.ss.android.downloadlib.n.b.vv(o.vv, "pBCD start download", null);
                    o.this.n(z5);
                }

                @Override // com.ss.android.download.api.config.x
                public void vv(String str) {
                    com.ss.android.downloadlib.n.b.vv(o.vv, "pBCD onDenied", null);
                }
            });
            return;
        }
        n(z5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void vv(int i4, int i5, @NonNull DownloadInfo downloadInfo) {
        if (com.ss.android.socialbase.downloader.n.vv.p().vv("fix_click_start")) {
            if (i5 != -3 && !com.ss.android.socialbase.downloader.downloader.i.vv().o(i4)) {
                vv(false, false);
                return;
            } else {
                com.ss.android.socialbase.appdownloader.i.k().vv(b.getContext(), i4, i5);
                return;
            }
        }
        com.ss.android.socialbase.appdownloader.i.k().vv(b.getContext(), i4, i5);
    }

    private void vv(DownloadInfo downloadInfo) {
        Message obtain = Message.obtain();
        obtain.what = 3;
        obtain.obj = downloadInfo;
        this.f60537m.sendMessage(obtain);
    }

    @Override // com.ss.android.downloadlib.addownload.n
    public n vv(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f60542r = str;
        }
        return this;
    }

    @Override // com.ss.android.downloadlib.addownload.n
    public n vv(IDownloadButtonClickListener iDownloadButtonClickListener) {
        if (iDownloadButtonClickListener == null) {
            this.f60546y = null;
        } else {
            this.f60546y = new SoftReference<>(iDownloadButtonClickListener);
        }
        return this;
    }
}
