package com.ss.android.socialbase.appdownloader;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Environment;
import android.text.TextUtils;
import com.facebook.common.util.f;
import com.join.mgps.receiver.BootReceiver_;
import com.ss.android.socialbase.appdownloader.p.k;
import com.ss.android.socialbase.appdownloader.p.r;
import com.ss.android.socialbase.downloader.depend.c;
import com.ss.android.socialbase.downloader.depend.pd;
import com.ss.android.socialbase.downloader.depend.vu;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.socialbase.downloader.impls.g;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.DownloadTask;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
/* loaded from: classes5.dex */
public class i {

    /* renamed from: m  reason: collision with root package name */
    private static volatile i f60780m = null;

    /* renamed from: n  reason: collision with root package name */
    private static boolean f60781n = false;
    private static boolean qv = false;

    /* renamed from: u  reason: collision with root package name */
    private static boolean f60782u = false;
    private static final String vv = "i";

    /* renamed from: d  reason: collision with root package name */
    private com.ss.android.socialbase.appdownloader.p.u f60784d;

    /* renamed from: g  reason: collision with root package name */
    private k f60785g;

    /* renamed from: i  reason: collision with root package name */
    private String f60786i;

    /* renamed from: j  reason: collision with root package name */
    private r f60787j;
    private com.ss.android.socialbase.appdownloader.p.p jh;

    /* renamed from: k  reason: collision with root package name */
    private int f60788k;
    private pd la;

    /* renamed from: p  reason: collision with root package name */
    private String f60790p;

    /* renamed from: q  reason: collision with root package name */
    private com.ss.android.socialbase.appdownloader.p.n f60791q;

    /* renamed from: r  reason: collision with root package name */
    private com.ss.android.socialbase.appdownloader.p.i f60792r;

    /* renamed from: t  reason: collision with root package name */
    private com.ss.android.socialbase.appdownloader.p.qv f60793t;
    private Future wv;

    /* renamed from: x  reason: collision with root package name */
    private c f60794x;

    /* renamed from: o  reason: collision with root package name */
    private DownloadReceiver f60789o = new DownloadReceiver();

    /* renamed from: b  reason: collision with root package name */
    private boolean f60783b = false;

    private i() {
    }

    public static i k() {
        if (f60780m == null) {
            synchronized (i.class) {
                if (f60780m == null) {
                    f60780m = new i();
                }
            }
        }
        return f60780m;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void la() {
        synchronized (this.f60789o) {
            if (f60781n) {
                return;
            }
            try {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                intentFilter.addAction("android.intent.action.BOOT_COMPLETED");
                intentFilter.addAction("android.ss.intent.action.DOWNLOAD_COMPLETE");
                IntentFilter intentFilter2 = new IntentFilter();
                intentFilter2.addAction("android.intent.action.MEDIA_MOUNTED");
                intentFilter2.addDataScheme(f.f10925c);
                com.ss.android.socialbase.downloader.downloader.p.ky().registerReceiver(this.f60789o, intentFilter);
                com.ss.android.socialbase.downloader.downloader.p.ky().registerReceiver(this.f60789o, intentFilter2);
                f60781n = true;
            } catch (Exception e5) {
                e5.printStackTrace();
            }
            String str = vv;
            com.ss.android.socialbase.downloader.p.vv.m(str, "registerDownloadReceiver mIsRegistered:" + f60781n);
        }
    }

    private void x() {
        this.f60788k = com.ss.android.socialbase.downloader.n.vv.p().vv("app_install_keep_receiver_time_s", 60);
        String str = vv;
        com.ss.android.socialbase.downloader.p.vv.m(str, "tryUnRegisterTempAppInstallDownloadReceiver mAppInstallReceiverKeepTime:" + this.f60788k);
        if (this.f60788k <= 0) {
            return;
        }
        Future future = this.wv;
        if (future != null) {
            try {
                future.cancel(true);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        this.wv = com.ss.android.socialbase.downloader.downloader.p.vv(new Runnable() { // from class: com.ss.android.socialbase.appdownloader.i.1
            @Override // java.lang.Runnable
            public void run() {
                com.ss.android.socialbase.downloader.p.vv.m(i.vv, "registerDownloadReceiver tryUnRegisterTempAppInstallDownloadReceiver run inner");
                i.this.jh();
                i.this.la();
            }
        }, this.f60788k, TimeUnit.SECONDS);
    }

    private void y() {
        if (Build.VERSION.SDK_INT >= 21) {
            g.vv(new g.m() { // from class: com.ss.android.socialbase.appdownloader.i.2
                @Override // com.ss.android.socialbase.downloader.impls.g.m
                public void vv(DownloadInfo downloadInfo, long j4, boolean z4, int i4) {
                    RetryJobSchedulerService.vv(downloadInfo, j4, z4, i4);
                }
            });
        }
    }

    public void b() {
        if (com.ss.android.socialbase.downloader.n.vv.p().vv("enable_app_install_receiver", 1) <= 0) {
            com.ss.android.socialbase.downloader.p.vv.m(vv, "disable app install receiver");
            return;
        }
        synchronized (this.f60789o) {
            if (qv) {
                x();
                return;
            }
            try {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction(BootReceiver_.f53984a);
                intentFilter.addAction(BootReceiver_.f53987d);
                intentFilter.addDataScheme("package");
                com.ss.android.socialbase.downloader.downloader.p.ky().registerReceiver(this.f60789o, intentFilter);
                qv = true;
            } catch (Throwable th) {
                th.printStackTrace();
            }
            x();
            String str = vv;
            com.ss.android.socialbase.downloader.p.vv.m(str, "tryRegisterTempAppInstallDownloadReceiver mIsAppInstallRegistered:" + f60781n);
        }
    }

    public c d() {
        return this.f60794x;
    }

    public String i() {
        return this.f60786i;
    }

    public pd j() {
        return this.la;
    }

    public void jh() {
        synchronized (this.f60789o) {
            try {
                if (f60781n) {
                    com.ss.android.socialbase.downloader.downloader.p.ky().unregisterReceiver(this.f60789o);
                }
            } catch (Exception e5) {
                e5.printStackTrace();
            }
            f60781n = false;
            qv = false;
        }
        com.ss.android.socialbase.downloader.p.vv.m(vv, "registerDownloadReceiver unRegisterDownloadReceiver");
    }

    public k n() {
        return this.f60785g;
    }

    public com.ss.android.socialbase.appdownloader.p.u o() {
        return this.f60784d;
    }

    public com.ss.android.socialbase.appdownloader.p.qv p() {
        return this.f60793t;
    }

    public com.ss.android.socialbase.downloader.downloader.g q() {
        return Downloader.getInstance(com.ss.android.socialbase.downloader.downloader.p.ky()).getReserveWifiStatusListener();
    }

    public File qv() {
        return Downloader.getInstance(com.ss.android.socialbase.downloader.downloader.p.ky()).getGlobalSaveDir();
    }

    public r r() {
        return this.f60787j;
    }

    public com.ss.android.socialbase.appdownloader.p.n t() {
        return this.f60791q;
    }

    public boolean u() {
        return com.ss.android.socialbase.downloader.n.vv.m().optInt("package_flag_config", 1) == 1;
    }

    public String wv() {
        return this.f60790p;
    }

    private void p(Context context) {
        if (context == null || f60782u) {
            return;
        }
        com.ss.android.socialbase.downloader.constants.o.vv("application/vnd.android.package-archive");
        com.ss.android.socialbase.downloader.downloader.p.vv(context);
        com.ss.android.socialbase.downloader.downloader.p.vv(new com.ss.android.socialbase.appdownloader.i.m());
        la();
        y();
        f60782u = true;
    }

    public com.ss.android.socialbase.appdownloader.p.i m() {
        return this.f60792r;
    }

    public void m(String str) {
        Downloader.getInstance(com.ss.android.socialbase.downloader.downloader.p.ky()).setDefaultSavePath(str);
    }

    public com.ss.android.socialbase.appdownloader.p.p vv() {
        return this.jh;
    }

    private DownloadInfo m(Context context, String str) {
        List<DownloadInfo> downloadInfoList = Downloader.getInstance(context).getDownloadInfoList(str);
        if (downloadInfoList != null) {
            for (DownloadInfo downloadInfo : downloadInfoList) {
                if (downloadInfo != null && downloadInfo.isSavePathRedirected()) {
                    return downloadInfo;
                }
            }
            return null;
        }
        return null;
    }

    public void vv(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f60786i = str;
    }

    public void vv(k kVar) {
        this.f60785g = kVar;
    }

    public List<DownloadInfo> m(Context context) {
        return Downloader.getInstance(context).getDownloadingDownloadInfosWithMimeType("application/vnd.android.package-archive");
    }

    @Deprecated
    public void vv(Context context, String str, com.ss.android.socialbase.appdownloader.p.p pVar, com.ss.android.socialbase.appdownloader.p.i iVar, com.ss.android.socialbase.appdownloader.p.qv qvVar) {
        if (pVar != null) {
            this.jh = pVar;
        }
        if (iVar != null) {
            this.f60792r = iVar;
        }
        if (qvVar != null) {
            this.f60793t = qvVar;
        }
        p(context);
    }

    public static boolean vv(Context context, int i4) {
        return p.vv(context, i4, true) == 1;
    }

    public void vv(Context context, int i4, int i5) {
        try {
            switch (i5) {
                case -4:
                case -1:
                    Downloader.getInstance(context).restart(i4);
                    return;
                case -3:
                    p.vv(context, i4, true);
                    return;
                case -2:
                    Downloader.getInstance(context).resume(i4);
                    return;
                case 0:
                case 6:
                default:
                    return;
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 7:
                case 8:
                    Downloader.getInstance(context).pause(i4);
                    return;
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(27:37|(1:39)|40|(2:44|45)|48|(1:116)(1:55)|56|(2:62|(1:64)(19:65|66|(1:68)|69|(3:71|(2:74|72)|75)|76|77|78|(1:80)(1:113)|81|82|(6:87|(1:110)(1:91)|92|(1:96)|(1:(1:108)(1:107))|109)|111|(1:89)|110|92|(2:94|96)|(0)|109))|115|66|(0)|69|(0)|76|77|78|(0)(0)|81|82|(8:84|87|(0)|110|92|(0)|(0)|109)|111|(0)|110|92|(0)|(0)|109) */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0142 A[Catch: all -> 0x0393, TryCatch #1 {all -> 0x0393, blocks: (B:8:0x0010, B:11:0x0023, B:15:0x002c, B:17:0x003a, B:18:0x0042, B:20:0x004a, B:21:0x0053, B:24:0x005a, B:26:0x0066, B:29:0x0072, B:31:0x0080, B:32:0x0084, B:34:0x008b, B:37:0x0093, B:40:0x009e, B:42:0x00b2, B:45:0x00cc, B:48:0x00e5, B:50:0x00eb, B:54:0x00fc, B:56:0x0102, B:58:0x0108, B:60:0x010e, B:62:0x0114, B:64:0x0122, B:65:0x013c, B:67:0x0142, B:68:0x0147, B:70:0x0151, B:71:0x0155, B:73:0x015b, B:74:0x0165, B:80:0x0190, B:82:0x0196, B:88:0x01a2, B:90:0x01ae, B:92:0x01be, B:94:0x033a, B:96:0x0344, B:99:0x034f, B:101:0x0355, B:103:0x035b, B:105:0x0365, B:107:0x036b, B:108:0x037b), top: B:121:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0151 A[Catch: all -> 0x0393, TryCatch #1 {all -> 0x0393, blocks: (B:8:0x0010, B:11:0x0023, B:15:0x002c, B:17:0x003a, B:18:0x0042, B:20:0x004a, B:21:0x0053, B:24:0x005a, B:26:0x0066, B:29:0x0072, B:31:0x0080, B:32:0x0084, B:34:0x008b, B:37:0x0093, B:40:0x009e, B:42:0x00b2, B:45:0x00cc, B:48:0x00e5, B:50:0x00eb, B:54:0x00fc, B:56:0x0102, B:58:0x0108, B:60:0x010e, B:62:0x0114, B:64:0x0122, B:65:0x013c, B:67:0x0142, B:68:0x0147, B:70:0x0151, B:71:0x0155, B:73:0x015b, B:74:0x0165, B:80:0x0190, B:82:0x0196, B:88:0x01a2, B:90:0x01ae, B:92:0x01be, B:94:0x033a, B:96:0x0344, B:99:0x034f, B:101:0x0355, B:103:0x035b, B:105:0x0365, B:107:0x036b, B:108:0x037b), top: B:121:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x016f A[Catch: all -> 0x0190, TryCatch #0 {all -> 0x0190, blocks: (B:75:0x0169, B:77:0x016f, B:79:0x017a, B:78:0x0175), top: B:119:0x0169 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0175 A[Catch: all -> 0x0190, TryCatch #0 {all -> 0x0190, blocks: (B:75:0x0169, B:77:0x016f, B:79:0x017a, B:78:0x0175), top: B:119:0x0169 }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01a2 A[Catch: all -> 0x0393, TryCatch #1 {all -> 0x0393, blocks: (B:8:0x0010, B:11:0x0023, B:15:0x002c, B:17:0x003a, B:18:0x0042, B:20:0x004a, B:21:0x0053, B:24:0x005a, B:26:0x0066, B:29:0x0072, B:31:0x0080, B:32:0x0084, B:34:0x008b, B:37:0x0093, B:40:0x009e, B:42:0x00b2, B:45:0x00cc, B:48:0x00e5, B:50:0x00eb, B:54:0x00fc, B:56:0x0102, B:58:0x0108, B:60:0x010e, B:62:0x0114, B:64:0x0122, B:65:0x013c, B:67:0x0142, B:68:0x0147, B:70:0x0151, B:71:0x0155, B:73:0x015b, B:74:0x0165, B:80:0x0190, B:82:0x0196, B:88:0x01a2, B:90:0x01ae, B:92:0x01be, B:94:0x033a, B:96:0x0344, B:99:0x034f, B:101:0x0355, B:103:0x035b, B:105:0x0365, B:107:0x036b, B:108:0x037b), top: B:121:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x033a A[Catch: all -> 0x0393, TryCatch #1 {all -> 0x0393, blocks: (B:8:0x0010, B:11:0x0023, B:15:0x002c, B:17:0x003a, B:18:0x0042, B:20:0x004a, B:21:0x0053, B:24:0x005a, B:26:0x0066, B:29:0x0072, B:31:0x0080, B:32:0x0084, B:34:0x008b, B:37:0x0093, B:40:0x009e, B:42:0x00b2, B:45:0x00cc, B:48:0x00e5, B:50:0x00eb, B:54:0x00fc, B:56:0x0102, B:58:0x0108, B:60:0x010e, B:62:0x0114, B:64:0x0122, B:65:0x013c, B:67:0x0142, B:68:0x0147, B:70:0x0151, B:71:0x0155, B:73:0x015b, B:74:0x0165, B:80:0x0190, B:82:0x0196, B:88:0x01a2, B:90:0x01ae, B:92:0x01be, B:94:0x033a, B:96:0x0344, B:99:0x034f, B:101:0x0355, B:103:0x035b, B:105:0x0365, B:107:0x036b, B:108:0x037b), top: B:121:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x034d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int vv(com.ss.android.socialbase.appdownloader.u r23) {
        /*
            Method dump skipped, instructions count: 957
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.socialbase.appdownloader.i.vv(com.ss.android.socialbase.appdownloader.u):int");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void vv(DownloadTask downloadTask, int i4, boolean z4) {
        if (downloadTask == null) {
            return;
        }
        downloadTask.download();
        DownloadInfo downloadInfo = downloadTask.getDownloadInfo();
        if (downloadInfo != null) {
            downloadInfo.setAntiHijackErrorCode(i4);
        }
        if (downloadInfo == null || !z4) {
            return;
        }
        downloadInfo.setSavePathRedirected(z4);
    }

    private List<com.ss.android.socialbase.downloader.model.p> vv(List<com.ss.android.socialbase.downloader.model.p> list) {
        ArrayList arrayList = new ArrayList();
        boolean z4 = false;
        if (list != null && list.size() > 0) {
            for (com.ss.android.socialbase.downloader.model.p pVar : list) {
                if (pVar != null && !TextUtils.isEmpty(pVar.vv()) && !TextUtils.isEmpty(pVar.m())) {
                    if (pVar.vv().equals("User-Agent")) {
                        z4 = true;
                    }
                    arrayList.add(new com.ss.android.socialbase.downloader.model.p(pVar.vv(), pVar.m()));
                }
            }
        }
        if (!z4) {
            arrayList.add(new com.ss.android.socialbase.downloader.model.p("User-Agent", com.ss.android.socialbase.appdownloader.m.vv.vv));
        }
        return arrayList;
    }

    public String vv(String str, String str2) {
        return (TextUtils.isEmpty(str) || !str.endsWith(".apk") || p.p(str2)) ? str2 : "application/vnd.android.package-archive";
    }

    private vu vv(final com.ss.android.socialbase.appdownloader.p.o oVar) {
        if (oVar == null) {
            return null;
        }
        return new vu() { // from class: com.ss.android.socialbase.appdownloader.i.5
            @Override // com.ss.android.socialbase.downloader.depend.vu
            public void vv(int i4, DownloadInfo downloadInfo, String str, String str2) {
                if (i4 != 1 && i4 != 3) {
                    switch (i4) {
                        case 5:
                        case 6:
                        case 7:
                            break;
                        case 8:
                            downloadInfo.getPackageName();
                            return;
                        case 9:
                            com.ss.android.socialbase.downloader.downloader.p.ky();
                            return;
                        default:
                            return;
                    }
                }
                downloadInfo.getStatus();
                downloadInfo.getDownloadTime();
            }

            @Override // com.ss.android.socialbase.downloader.depend.vu
            public boolean vv(boolean z4) {
                return oVar.vv(z4);
            }

            @Override // com.ss.android.socialbase.downloader.depend.vu
            public String vv() {
                return oVar.vv();
            }
        };
    }

    public DownloadInfo vv(Context context, String str) {
        if (!TextUtils.isEmpty(str) && context != null) {
            try {
                DownloadInfo vv2 = vv(context, str, qv());
                if (vv2 == null) {
                    vv2 = vv(context, str, context.getExternalFilesDir(Environment.DIRECTORY_DOWNLOADS));
                }
                if (vv2 == null) {
                    vv2 = vv(context, str, Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS));
                }
                if (vv2 == null) {
                    vv2 = vv(context, str, context.getFilesDir());
                }
                return (vv2 == null && com.ss.android.socialbase.downloader.n.vv.p().vv("get_download_info_by_list")) ? m(context, str) : vv2;
            } catch (Throwable th) {
                com.ss.android.socialbase.downloader.p.vv.m(vv, String.format("getAppDownloadInfo error:%s", th.getMessage()));
            }
        }
        return null;
    }

    private DownloadInfo vv(Context context, String str, File file) {
        if (context == null || TextUtils.isEmpty(str) || file == null) {
            return null;
        }
        return Downloader.getInstance(context).getDownloadInfo(str, file.getAbsolutePath());
    }

    public List<DownloadInfo> vv(Context context) {
        return Downloader.getInstance(context).getUnCompletedDownloadInfosWithMimeType("application/vnd.android.package-archive");
    }

    public void vv(com.ss.android.socialbase.appdownloader.p.n nVar) {
        this.f60791q = nVar;
    }

    public void vv(com.ss.android.socialbase.downloader.downloader.g gVar) {
        Downloader.getInstance(com.ss.android.socialbase.downloader.downloader.p.ky()).setReserveWifiStatusListener(gVar);
    }

    public void vv(pd pdVar) {
        this.la = pdVar;
    }

    public void vv(c cVar) {
        this.f60794x = cVar;
    }
}
