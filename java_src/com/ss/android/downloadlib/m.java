package com.ss.android.downloadlib;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.ss.android.download.api.config.IDownloadButtonClickListener;
import com.ss.android.download.api.download.DownloadController;
import com.ss.android.download.api.download.DownloadEventConfig;
import com.ss.android.download.api.download.DownloadModel;
import com.ss.android.download.api.download.DownloadStatusChangeListener;
import com.ss.android.download.api.model.m;
import com.ss.android.downloadad.api.download.AdDownloadController;
import com.ss.android.downloadad.api.download.AdDownloadEventConfig;
import com.ss.android.downloadad.api.download.AdDownloadModel;
import com.ss.android.downloadlib.addownload.b;
import com.ss.android.downloadlib.n.jh;
import com.ss.android.downloadlib.n.wv;
import com.ss.android.downloadlib.o.m;
import org.json.JSONObject;
/* loaded from: classes5.dex */
public class m implements com.ss.android.downloadad.api.m {

    /* renamed from: m  reason: collision with root package name */
    private static volatile m f60616m = null;
    private static String vv = "m";

    /* renamed from: p  reason: collision with root package name */
    private qv f60617p = qv.vv(b.getContext());

    private m() {
    }

    public static DownloadEventConfig p() {
        return new AdDownloadEventConfig.Builder().setClickButtonTag("landing_h5_download_ad_button").setClickItemTag("landing_h5_download_ad_button").setClickStartLabel("click_start_detail").setClickPauseLabel("click_pause_detail").setClickContinueLabel("click_continue_detail").setClickInstallLabel("click_install_detail").setClickOpenLabel("click_open_detail").setStorageDenyLabel("storage_deny_detail").setDownloadScene(1).setIsEnableClickEvent(false).setIsEnableNoChargeClickEvent(true).setIsEnableV3Event(false).build();
    }

    public Dialog m(Context context, String str, boolean z4, final DownloadModel downloadModel, DownloadEventConfig downloadEventConfig, DownloadController downloadController, DownloadStatusChangeListener downloadStatusChangeListener, int i4, boolean z5, IDownloadButtonClickListener iDownloadButtonClickListener) {
        if (vv(downloadModel.getId())) {
            if (z5) {
                vv(downloadModel.getId(), downloadEventConfig, downloadController);
            } else {
                m(downloadModel.getId());
            }
            return null;
        } else if (context == null || TextUtils.isEmpty(downloadModel.getDownloadUrl())) {
            return null;
        } else {
            this.f60617p.vv(context, i4, downloadStatusChangeListener, downloadModel);
            boolean z6 = true;
            final DownloadEventConfig downloadEventConfig2 = (DownloadEventConfig) jh.vv(downloadEventConfig, p());
            final DownloadController downloadController2 = (DownloadController) jh.vv(downloadController, m());
            downloadEventConfig2.setDownloadScene(1);
            boolean z7 = (b.wv().optInt("disable_lp_dialog", 0) == 1) | z4;
            if (!downloadController2.enableShowComplianceDialog() || !com.ss.android.downloadlib.addownload.compliance.m.vv().vv(downloadModel)) {
                z6 = z7;
            }
            if (z6) {
                this.f60617p.vv(downloadModel.getDownloadUrl(), downloadModel.getId(), 2, downloadEventConfig2, downloadController2, iDownloadButtonClickListener);
                return null;
            }
            String str2 = vv;
            com.ss.android.downloadlib.n.b.vv(str2, "tryStartDownload show dialog appName:" + downloadModel.getDownloadUrl(), null);
            Dialog m4 = b.p().m(new m.vv(context).vv(downloadModel.getName()).m("确认要下载此应用吗？").p("确认").i("取消").vv(new m.InterfaceC0608m() { // from class: com.ss.android.downloadlib.m.2
                @Override // com.ss.android.download.api.model.m.InterfaceC0608m
                public void m(DialogInterface dialogInterface) {
                    com.ss.android.downloadlib.i.vv.vv().vv("landing_download_dialog_cancel", downloadModel, downloadEventConfig2, downloadController2);
                    dialogInterface.dismiss();
                }

                @Override // com.ss.android.download.api.model.m.InterfaceC0608m
                public void p(DialogInterface dialogInterface) {
                    com.ss.android.downloadlib.i.vv.vv().vv("landing_download_dialog_cancel", downloadModel, downloadEventConfig2, downloadController2);
                }

                @Override // com.ss.android.download.api.model.m.InterfaceC0608m
                public void vv(DialogInterface dialogInterface) {
                    m.this.f60617p.vv(downloadModel.getDownloadUrl(), downloadModel.getId(), 2, downloadEventConfig2, downloadController2);
                    com.ss.android.downloadlib.i.vv.vv().vv("landing_download_dialog_confirm", downloadModel, downloadEventConfig2, downloadController2);
                    dialogInterface.dismiss();
                }
            }).vv(0).vv());
            com.ss.android.downloadlib.i.vv.vv().vv("landing_download_dialog_show", downloadModel, downloadEventConfig2, downloadController2);
            return m4;
        }
    }

    public static m vv() {
        if (f60616m == null) {
            synchronized (m.class) {
                if (f60616m == null) {
                    f60616m = new m();
                }
            }
        }
        return f60616m;
    }

    @Override // com.ss.android.downloadad.api.m
    public Dialog vv(Context context, String str, boolean z4, @NonNull DownloadModel downloadModel, DownloadEventConfig downloadEventConfig, DownloadController downloadController, DownloadStatusChangeListener downloadStatusChangeListener, int i4) {
        return vv(context, str, z4, downloadModel, downloadEventConfig, downloadController, downloadStatusChangeListener, i4, false);
    }

    @Override // com.ss.android.downloadad.api.m
    public Dialog vv(Context context, String str, boolean z4, @NonNull DownloadModel downloadModel, DownloadEventConfig downloadEventConfig, DownloadController downloadController, DownloadStatusChangeListener downloadStatusChangeListener, int i4, IDownloadButtonClickListener iDownloadButtonClickListener) {
        return vv(context, str, z4, downloadModel, downloadEventConfig, downloadController, downloadStatusChangeListener, i4, false, iDownloadButtonClickListener);
    }

    public Dialog vv(Context context, String str, boolean z4, @NonNull DownloadModel downloadModel, DownloadEventConfig downloadEventConfig, DownloadController downloadController, DownloadStatusChangeListener downloadStatusChangeListener, int i4, boolean z5) {
        return vv(context, str, z4, downloadModel, downloadEventConfig, downloadController, downloadStatusChangeListener, i4, z5, null);
    }

    public Dialog vv(final Context context, final String str, final boolean z4, @NonNull final DownloadModel downloadModel, final DownloadEventConfig downloadEventConfig, final DownloadController downloadController, final DownloadStatusChangeListener downloadStatusChangeListener, final int i4, final boolean z5, final IDownloadButtonClickListener iDownloadButtonClickListener) {
        return (Dialog) com.ss.android.downloadlib.o.m.vv(new m.vv<Dialog>() { // from class: com.ss.android.downloadlib.m.1
            @Override // com.ss.android.downloadlib.o.m.vv
            /* renamed from: vv */
            public Dialog m() {
                return m.this.m(context, str, z4, downloadModel, downloadEventConfig, downloadController, downloadStatusChangeListener, i4, z5, iDownloadButtonClickListener);
            }
        });
    }

    @Override // com.ss.android.downloadad.api.m
    public boolean vv(Context context, long j4, String str, DownloadStatusChangeListener downloadStatusChangeListener, int i4) {
        com.ss.android.downloadad.api.vv.m i5 = com.ss.android.downloadlib.addownload.m.u.vv().i(j4);
        if (i5 != null) {
            this.f60617p.vv(context, i4, downloadStatusChangeListener, i5.di());
            return true;
        }
        DownloadModel vv2 = com.ss.android.downloadlib.addownload.m.u.vv().vv(j4);
        if (vv2 != null) {
            this.f60617p.vv(context, i4, downloadStatusChangeListener, vv2);
            return true;
        }
        return false;
    }

    @Override // com.ss.android.downloadad.api.m
    public boolean vv(long j4, int i4) {
        DownloadModel vv2 = com.ss.android.downloadlib.addownload.m.u.vv().vv(j4);
        if (vv2 != null) {
            this.f60617p.vv(vv2.getDownloadUrl(), i4);
            return true;
        }
        return false;
    }

    public void vv(long j4, DownloadEventConfig downloadEventConfig, DownloadController downloadController) {
        DownloadModel vv2 = com.ss.android.downloadlib.addownload.m.u.vv().vv(j4);
        com.ss.android.downloadad.api.vv.m i4 = com.ss.android.downloadlib.addownload.m.u.vv().i(j4);
        if (vv2 == null && i4 != null) {
            vv2 = i4.di();
        }
        if (vv2 == null) {
            return;
        }
        if (downloadEventConfig != null && downloadController != null && !(downloadEventConfig instanceof com.ss.android.download.api.download.p) && !(downloadController instanceof com.ss.android.download.api.download.m)) {
            downloadEventConfig.setDownloadScene(1);
            this.f60617p.vv(vv2.getDownloadUrl(), j4, 2, downloadEventConfig, downloadController);
            return;
        }
        m(j4);
    }

    public void m(long j4) {
        DownloadModel vv2 = com.ss.android.downloadlib.addownload.m.u.vv().vv(j4);
        com.ss.android.downloadad.api.vv.m i4 = com.ss.android.downloadlib.addownload.m.u.vv().i(j4);
        if (vv2 == null && i4 != null) {
            vv2 = i4.di();
        }
        if (vv2 == null) {
            return;
        }
        DownloadEventConfig m4 = com.ss.android.downloadlib.addownload.m.u.vv().m(j4);
        DownloadController p4 = com.ss.android.downloadlib.addownload.m.u.vv().p(j4);
        if (m4 instanceof com.ss.android.download.api.download.p) {
            m4 = null;
        }
        if (p4 instanceof com.ss.android.download.api.download.m) {
            p4 = null;
        }
        if (i4 == null) {
            if (m4 == null) {
                m4 = p();
            }
            if (p4 == null) {
                p4 = m();
            }
        } else {
            if (m4 == null) {
                m4 = new AdDownloadEventConfig.Builder().setClickButtonTag(i4.k()).setRefer(i4.wv()).setIsEnableV3Event(i4.r()).setIsEnableClickEvent(false).setClickStartLabel("click_start_detail").setClickPauseLabel("click_pause_detail").setClickContinueLabel("click_continue_detail").setClickInstallLabel("click_install_detail").setStorageDenyLabel("storage_deny_detail").build();
            }
            if (p4 == null) {
                p4 = i4.dj();
            }
        }
        DownloadEventConfig downloadEventConfig = m4;
        downloadEventConfig.setDownloadScene(1);
        this.f60617p.vv(vv2.getDownloadUrl(), j4, 2, downloadEventConfig, p4);
    }

    @Override // com.ss.android.downloadad.api.m
    public boolean vv(long j4) {
        return (com.ss.android.downloadlib.addownload.m.u.vv().vv(j4) == null && com.ss.android.downloadlib.addownload.m.u.vv().i(j4) == null) ? false : true;
    }

    @Override // com.ss.android.downloadad.api.m
    public boolean vv(Context context, Uri uri, DownloadModel downloadModel, DownloadEventConfig downloadEventConfig, DownloadController downloadController) {
        return vv(context, uri, downloadModel, downloadEventConfig, downloadController, null);
    }

    @Override // com.ss.android.downloadad.api.m
    public boolean vv(final Context context, final Uri uri, final DownloadModel downloadModel, final DownloadEventConfig downloadEventConfig, final DownloadController downloadController, final IDownloadButtonClickListener iDownloadButtonClickListener) {
        return ((Boolean) com.ss.android.downloadlib.o.m.vv(new m.vv<Boolean>() { // from class: com.ss.android.downloadlib.m.3
            @Override // com.ss.android.downloadlib.o.m.vv
            /* renamed from: vv */
            public Boolean m() {
                return Boolean.valueOf(m.this.m(context, uri, downloadModel, downloadEventConfig, downloadController, iDownloadButtonClickListener));
            }
        })).booleanValue();
    }

    public static DownloadController vv(boolean z4) {
        AdDownloadController.Builder shouldUseNewWebView = new AdDownloadController.Builder().setLinkMode(0).setIsEnableBackDialog(true).setIsEnableMultipleDownload(false).setShouldUseNewWebView(false);
        if (z4) {
            shouldUseNewWebView.setDownloadMode(2);
        } else {
            shouldUseNewWebView.setDownloadMode(0);
        }
        return shouldUseNewWebView.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean m(Context context, Uri uri, DownloadModel downloadModel, DownloadEventConfig downloadEventConfig, DownloadController downloadController, IDownloadButtonClickListener iDownloadButtonClickListener) {
        DownloadController downloadController2 = downloadController;
        if (com.ss.android.download.api.p.vv.vv(uri) && b.wv().optInt("disable_market") != 1) {
            Context context2 = context == null ? b.getContext() : context;
            String m4 = com.ss.android.download.api.p.vv.m(uri);
            if (downloadModel == null) {
                return wv.vv(context2, m4).getType() == 5;
            }
            if (!TextUtils.isEmpty(m4) && (downloadModel instanceof AdDownloadModel)) {
                ((AdDownloadModel) downloadModel).setPackageName(m4);
            }
            if (downloadController2 != null) {
                downloadController2.setDownloadMode(2);
            } else if ((downloadModel instanceof AdDownloadModel) && TextUtils.isEmpty(downloadModel.getDownloadUrl())) {
                ((AdDownloadModel) downloadModel).setDownloadUrl(uri.toString());
                downloadController2 = vv(true);
            } else if (downloadModel.getDownloadUrl().startsWith("market")) {
                downloadController2 = vv(true);
            } else {
                downloadController2 = m();
            }
            com.ss.android.downloadlib.addownload.m.o oVar = new com.ss.android.downloadlib.addownload.m.o(downloadModel.getId(), downloadModel, (DownloadEventConfig) jh.vv(downloadEventConfig, p()), downloadController2);
            com.ss.android.downloadlib.addownload.m.u.vv().vv(oVar.f60510m);
            com.ss.android.downloadlib.addownload.m.u.vv().vv(oVar.vv, oVar.f60512p);
            com.ss.android.downloadlib.addownload.m.u.vv().vv(oVar.vv, oVar.f60509i);
            if (jh.vv(downloadModel) && com.ss.android.socialbase.downloader.n.vv.p().m("app_link_opt") == 1 && com.ss.android.downloadlib.m.vv.vv(oVar)) {
                return true;
            }
            JSONObject jSONObject = new JSONObject();
            jh.vv(jSONObject, "market_url", uri.toString());
            jh.vv(jSONObject, "download_scene", (Object) 1);
            com.ss.android.downloadlib.i.vv.vv().m("market_click_open", jSONObject, oVar);
            com.ss.android.downloadlib.addownload.m.n vv2 = wv.vv(context2, oVar, m4);
            String vv3 = jh.vv(vv2.m(), "open_market");
            if (vv2.getType() == 5) {
                com.ss.android.downloadlib.m.vv.vv(vv3, jSONObject, oVar, true);
                return true;
            } else if (vv2.getType() == 6) {
                jh.vv(jSONObject, "error_code", Integer.valueOf(vv2.vv()));
                com.ss.android.downloadlib.i.vv.vv().m("market_open_failed", jSONObject, oVar);
                if (com.ss.android.downloadlib.addownload.wv.vv(downloadModel, iDownloadButtonClickListener)) {
                    iDownloadButtonClickListener.handleMarketFailedComplianceDialog();
                }
                return false;
            } else {
                return true;
            }
        }
        return false;
    }

    public static DownloadController m() {
        return vv(false);
    }
}
