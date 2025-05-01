package com.ss.android.downloadlib.addownload.vv;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import com.ss.android.download.api.model.m;
import com.ss.android.downloadlib.activity.TTDelegateActivity;
import com.ss.android.downloadlib.addownload.b;
import com.ss.android.downloadlib.addownload.m.u;
import com.ss.android.downloadlib.n.jh;
import com.ss.android.downloadlib.qv;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import java.io.File;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;
/* loaded from: classes5.dex */
public class vv {

    /* renamed from: m  reason: collision with root package name */
    private static vv f60600m = null;
    private static final String vv = "vv";

    /* renamed from: i  reason: collision with root package name */
    private boolean f60601i = false;

    /* renamed from: o  reason: collision with root package name */
    private String f60602o;
    @NonNull

    /* renamed from: p  reason: collision with root package name */
    private CopyOnWriteArrayList<com.ss.android.downloadlib.addownload.m.vv> f60603p;

    /* renamed from: u  reason: collision with root package name */
    private m f60604u;

    /* renamed from: com.ss.android.downloadlib.addownload.vv.vv$vv  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public interface InterfaceC0611vv {
        void vv();
    }

    private vv() {
        m mVar = new m();
        this.f60604u = mVar;
        this.f60603p = mVar.vv("sp_ad_install_back_dialog", "key_uninstalled_list");
    }

    public static vv vv() {
        if (f60600m == null) {
            f60600m = new vv();
        }
        return f60600m;
    }

    public void m(String str) {
        if (TextUtils.isEmpty(str)) {
            this.f60602o = "";
        } else if (TextUtils.equals(this.f60602o, str)) {
            this.f60602o = "";
        }
    }

    private boolean vv(Activity activity, DownloadInfo downloadInfo, boolean z4, InterfaceC0611vv interfaceC0611vv) {
        if (downloadInfo == null) {
            try {
                if (this.f60603p.isEmpty()) {
                    return false;
                }
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
        if (activity != null && !activity.isFinishing()) {
            boolean z5 = true;
            if (downloadInfo != null && this.f60603p.isEmpty()) {
                vv(activity, new com.ss.android.downloadlib.addownload.m.vv(downloadInfo.getId(), 0L, 0L, downloadInfo.getPackageName(), downloadInfo.getTitle(), null, downloadInfo.getTargetFilePath()), z4, interfaceC0611vv);
                return true;
            }
            long lastModified = downloadInfo != null ? new File(downloadInfo.getTargetFilePath()).lastModified() : 0L;
            CopyOnWriteArrayList<com.ss.android.downloadlib.addownload.m.vv> copyOnWriteArrayList = this.f60603p;
            ListIterator<com.ss.android.downloadlib.addownload.m.vv> listIterator = copyOnWriteArrayList.listIterator(copyOnWriteArrayList.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    z5 = false;
                    break;
                }
                com.ss.android.downloadlib.addownload.m.vv previous = listIterator.previous();
                if (previous != null && !jh.o(b.getContext(), previous.f60523i) && jh.vv(previous.f60525n)) {
                    if (new File(previous.f60525n).lastModified() >= lastModified) {
                        vv(activity, previous, z4, interfaceC0611vv);
                    } else {
                        vv(activity, new com.ss.android.downloadlib.addownload.m.vv(downloadInfo.getId(), 0L, 0L, downloadInfo.getPackageName(), downloadInfo.getTitle(), null, downloadInfo.getTargetFilePath()), z4, interfaceC0611vv);
                    }
                }
            }
            com.ss.android.downloadlib.n.b.vv(vv, "tryShowInstallDialog isShow:".concat(String.valueOf(z5)), null);
            return z5;
        }
        return false;
    }

    @MainThread
    public boolean vv(Activity activity, boolean z4, InterfaceC0611vv interfaceC0611vv) {
        if (b.wv().optInt("disable_install_app_dialog") == 1 || this.f60601i) {
            return false;
        }
        return vv(activity, vv(activity), z4, interfaceC0611vv);
    }

    public void vv(Context context, com.ss.android.downloadlib.addownload.m.vv vvVar, boolean z4, InterfaceC0611vv interfaceC0611vv) {
        this.f60603p.clear();
        vv(context, vvVar, interfaceC0611vv, z4);
        this.f60601i = true;
        qv.vv(context).p();
        this.f60604u.m("sp_ad_install_back_dialog", "key_uninstalled_list");
        com.ss.android.downloadlib.n.b.vv(vv, "tryShowInstallDialog isShow:true", null);
    }

    public DownloadInfo vv(Context context) {
        long m4;
        List<DownloadInfo> successedDownloadInfosWithMimeType;
        DownloadInfo downloadInfo = null;
        try {
            m4 = qv.vv(context).m();
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        if (b.wv().optInt("enable_miniapp_dialog", 0) != 0 && (successedDownloadInfosWithMimeType = Downloader.getInstance(context).getSuccessedDownloadInfosWithMimeType("application/vnd.android.package-archive")) != null && !successedDownloadInfosWithMimeType.isEmpty()) {
            long j4 = 0;
            for (DownloadInfo downloadInfo2 : successedDownloadInfosWithMimeType) {
                if (downloadInfo2 != null && !jh.o(context, downloadInfo2.getPackageName()) && jh.vv(downloadInfo2.getTargetFilePath())) {
                    long lastModified = new File(downloadInfo2.getTargetFilePath()).lastModified();
                    if (lastModified >= m4 && downloadInfo2.getExtra() != null) {
                        try {
                            if (new JSONObject(downloadInfo2.getExtra()).has("isMiniApp") && (j4 == 0 || lastModified > j4)) {
                                downloadInfo = downloadInfo2;
                                j4 = lastModified;
                            }
                        } catch (Exception e6) {
                            e6.printStackTrace();
                        }
                    }
                }
            }
            return downloadInfo;
        }
        return null;
    }

    public void vv(long j4, long j5, long j6, String str, String str2, String str3, String str4) {
        for (int i4 = 0; i4 < this.f60603p.size(); i4++) {
            com.ss.android.downloadlib.addownload.m.vv vvVar = this.f60603p.get(i4);
            if (vvVar != null && vvVar.f60524m == j5) {
                this.f60603p.set(i4, new com.ss.android.downloadlib.addownload.m.vv(j4, j5, j6, str, str2, str3, str4));
                this.f60604u.vv("sp_ad_install_back_dialog", "key_uninstalled_list", this.f60603p);
                return;
            }
        }
        this.f60603p.add(new com.ss.android.downloadlib.addownload.m.vv(j4, j5, j6, str, str2, str3, str4));
        this.f60604u.vv("sp_ad_install_back_dialog", "key_uninstalled_list", this.f60603p);
    }

    private void vv(final Context context, final com.ss.android.downloadlib.addownload.m.vv vvVar, final InterfaceC0611vv interfaceC0611vv, boolean z4) {
        final com.ss.android.downloadad.api.vv.m i4 = u.vv().i(vvVar.f60524m);
        if (i4 == null) {
            com.ss.android.downloadlib.o.p.vv().vv("showBackInstallDialog nativeModel null");
            return;
        }
        com.ss.android.download.api.config.jh p4 = b.p();
        m.vv vv2 = new m.vv(context).vv(z4 ? "应用安装确认" : "退出确认");
        Object[] objArr = new Object[1];
        objArr[0] = TextUtils.isEmpty(vvVar.f60526o) ? "刚刚下载的应用" : vvVar.f60526o;
        p4.m(vv2.m(String.format("%1$s下载完成，是否立即安装？", objArr)).p("立即安装").i(z4 ? "暂不安装" : String.format("退出%1$s", context.getResources().getString(context.getApplicationContext().getApplicationInfo().labelRes))).vv(false).vv(jh.vv(context, vvVar.f60525n)).vv(new m.InterfaceC0608m() { // from class: com.ss.android.downloadlib.addownload.vv.vv.1
            @Override // com.ss.android.download.api.model.m.InterfaceC0608m
            public void m(DialogInterface dialogInterface) {
                com.ss.android.downloadlib.i.vv.vv().m("backdialog_exit", i4);
                InterfaceC0611vv interfaceC0611vv2 = interfaceC0611vv;
                if (interfaceC0611vv2 != null) {
                    interfaceC0611vv2.vv();
                }
                vv.this.m("");
                dialogInterface.dismiss();
            }

            @Override // com.ss.android.download.api.model.m.InterfaceC0608m
            public void p(DialogInterface dialogInterface) {
                vv.this.m("");
            }

            @Override // com.ss.android.download.api.model.m.InterfaceC0608m
            public void vv(DialogInterface dialogInterface) {
                com.ss.android.downloadlib.i.vv.vv().m("backdialog_install", i4);
                com.ss.android.socialbase.appdownloader.i.vv(context, (int) vvVar.vv);
                dialogInterface.dismiss();
            }
        }).vv(1).vv());
        com.ss.android.downloadlib.i.vv.vv().m("backdialog_show", i4);
        this.f60602o = vvVar.f60523i;
    }

    public boolean vv(String str) {
        return TextUtils.equals(this.f60602o, str);
    }

    public void vv(com.ss.android.downloadad.api.vv.m mVar) {
        if (b.wv().optInt("enable_open_app_dialog", 0) == 1 && !mVar.cl() && mVar.d() && Build.VERSION.SDK_INT < 34) {
            mVar.b(true);
            TTDelegateActivity.vv(mVar);
        }
    }
}
