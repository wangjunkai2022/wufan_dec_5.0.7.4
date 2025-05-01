package com.join.mgps.mod.utils;

import android.content.Context;
import android.os.Looper;
import b2.k;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.android.app.common.servcie.i;
import com.join.android.app.common.servcie.r;
import com.join.android.app.common.utils.APKUtils;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.Util.g2;
import com.join.mgps.Util.h0;
import com.join.mgps.Util.l2;
import com.join.mgps.Util.v;
import com.join.mgps.db.tables.DownloadHistoryTable;
import com.join.mgps.enums.Dtype;
import com.join.mgps.event.n;
import com.join.mgps.pref.PrefDef_;
import com.papa.sim.statistic.Event;
import com.xinzhu.overmind.entity.pm.InstallResult;
import java.io.File;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import p1.f;
/* compiled from: ApkInstaller.java */
/* loaded from: classes3.dex */
public class a {

    /* renamed from: b  reason: collision with root package name */
    private static a f53599b;

    /* renamed from: a  reason: collision with root package name */
    ExecutorService f53600a;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ApkInstaller.java */
    /* renamed from: com.join.mgps.mod.utils.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public class RunnableC0375a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        DownloadTask f53601b;

        /* renamed from: c  reason: collision with root package name */
        boolean f53602c;

        /* renamed from: d  reason: collision with root package name */
        Context f53603d;

        public RunnableC0375a(Context context, DownloadTask downloadTask, boolean z4) {
            this.f53603d = context;
            this.f53601b = downloadTask;
            this.f53602c = z4;
        }

        private void a(DownloadTask downloadTask) {
            if (downloadTask.getFileType().equals(Dtype.MOD.name())) {
                StringBuilder sb = new StringBuilder();
                sb.append(v.f28117q);
                String str = File.separator;
                sb.append(str);
                sb.append(downloadTask.getPackageName());
                File file = new File(sb.toString());
                if (file.exists()) {
                    File file2 = new File(com.join.mgps.va.overmind.d.o().q(true) + str + "data" + str + downloadTask.getPackageName());
                    if (!file2.exists()) {
                        file2.mkdirs();
                    }
                    h0.d(file.getPath(), file2.getPath());
                }
            }
        }

        private void b(DownloadTask downloadTask) {
            if (downloadTask.getFileType().equals(Dtype.MOD.name())) {
                StringBuilder sb = new StringBuilder();
                sb.append(v.f28116p);
                String str = File.separator;
                sb.append(str);
                sb.append(downloadTask.getPackageName());
                File file = new File(sb.toString());
                if (file.exists()) {
                    File file2 = new File(com.join.mgps.va.overmind.d.o().q(true) + str + "obb" + str + downloadTask.getPackageName());
                    if (!file2.exists()) {
                        file2.mkdirs();
                    }
                    h0.d(file.getPath(), file2.getPath());
                }
            }
        }

        private void c(Context context, DownloadTask downloadTask) {
            downloadTask.setStatus(11);
            f.K().j0(downloadTask, downloadTask.getStatus());
            org.greenrobot.eventbus.c.f().o(new n(downloadTask, 11));
        }

        private void d(Context context, DownloadTask downloadTask) {
            downloadTask.setStatus(5);
            if (downloadTask.getRomType() != null && !downloadTask.getFileType().equals(Dtype.chajian.name())) {
                DownloadHistoryTable p4 = k.n().p(downloadTask.getCrc_link_type_val());
                if (p4 != null) {
                    p4.setCreate_time(System.currentTimeMillis());
                } else {
                    p4 = new DownloadHistoryTable();
                    p4.setCrc_link_type_val(downloadTask.getCrc_link_type_val());
                    p4.setCreate_time(System.currentTimeMillis());
                }
                k.n().m(p4);
                UtilsMy.N2(context, downloadTask.getCrc_link_type_val());
                new PrefDef_(context).lastInstallApp().g("");
            } else {
                try {
                    APKUtils.a l4 = com.join.android.app.common.utils.e.l0(context).l(context, downloadTask.getPackageName());
                    if (l4 != null) {
                        downloadTask.setVer(l4.d() + "");
                        downloadTask.setVer_name(l4.e());
                    }
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
            }
            try {
                DownloadTask f5 = i.e().f(downloadTask.getCrc_link_type_val());
                if (f5 != null) {
                    f5.setStatus(5);
                }
            } catch (Exception e6) {
                e6.printStackTrace();
            }
            f.K().j0(downloadTask, downloadTask.getStatus());
            downloadTask.setStatus(5);
            r.b(context, downloadTask, Event.installAndroidCompleted);
            org.greenrobot.eventbus.c.f().o(new n(downloadTask, 5));
            APKUtils.i(downloadTask);
        }

        @Override // java.lang.Runnable
        public void run() {
            InstallResult B;
            DownloadTask downloadTask = this.f53601b;
            if (downloadTask != null) {
                try {
                    try {
                        downloadTask.setStatus(48);
                        f.K().j0(this.f53601b, 48);
                        org.greenrobot.eventbus.c.f().o(new n(this.f53601b, 48));
                        if (this.f53602c) {
                            if (this.f53601b.getRomType().equals(Dtype.androidobb.name())) {
                                b(this.f53601b);
                            } else if (this.f53601b.getRomType().equals(Dtype.androiddata.name())) {
                                a(this.f53601b);
                            } else if (this.f53601b.getRomType().equals(Dtype.androidobbdata.name())) {
                                b(this.f53601b);
                                a(this.f53601b);
                            }
                            B = com.join.mgps.va.overmind.d.o().B(this.f53601b.getPackageName());
                        } else {
                            B = com.join.mgps.va.overmind.d.o().B(this.f53601b.getGameZipPath());
                        }
                    } catch (Exception e5) {
                        e5.printStackTrace();
                        c(this.f53603d, this.f53601b);
                        Looper.prepare();
                    }
                    if (B != null && B.f67790b) {
                        d(this.f53603d, this.f53601b);
                        return;
                    }
                    c(this.f53603d, this.f53601b);
                    Looper.prepare();
                    if (B != null) {
                        String str = B.f67792d;
                        if (g2.i(str)) {
                            l2 a5 = l2.a(this.f53603d);
                            a5.b("安装失败:" + str);
                        } else {
                            l2.a(this.f53603d).b("安装失败");
                        }
                        Looper.loop();
                    }
                    l2.a(this.f53603d).b("安装失败");
                    Looper.loop();
                } catch (Throwable th) {
                    c(this.f53603d, this.f53601b);
                    Looper.prepare();
                    l2.a(this.f53603d).b("安装失败");
                    Looper.loop();
                    throw th;
                }
            }
        }
    }

    private a() {
        ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(3);
        this.f53600a = newFixedThreadPool;
        if (newFixedThreadPool == null || newFixedThreadPool.isTerminated() || this.f53600a.isShutdown()) {
            this.f53600a = Executors.newFixedThreadPool(3);
        }
    }

    public static a a() {
        if (f53599b == null) {
            synchronized (a.class) {
                f53599b = new a();
            }
        }
        return f53599b;
    }

    public void b(Context context, DownloadTask downloadTask, boolean z4) {
        if (downloadTask != null) {
            this.f53600a.submit(new RunnableC0375a(context, downloadTask, z4));
        }
    }
}
