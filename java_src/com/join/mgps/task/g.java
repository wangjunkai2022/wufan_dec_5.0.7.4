package com.join.mgps.task;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import b2.o;
import b2.p;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.android.app.common.servcie.i;
import com.join.android.app.common.utils.APKUtils;
import com.join.android.app.common.utils.JsonMapper;
import com.join.android.app.common.utils.l;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.Util.g0;
import com.join.mgps.Util.v;
import com.join.mgps.Util.w2;
import com.join.mgps.db.tables.EMUApkArenaTable;
import com.join.mgps.db.tables.EMUApkTable;
import com.join.mgps.event.n;
import java.io.File;
import java.io.IOException;
/* compiled from: UNZIPForPluginThread.java */
/* loaded from: classes5.dex */
public class g extends Thread implements c {

    /* renamed from: c  reason: collision with root package name */
    private Context f54900c;

    /* renamed from: d  reason: collision with root package name */
    private DownloadTask f54901d;

    /* renamed from: g  reason: collision with root package name */
    private String f54904g;

    /* renamed from: b  reason: collision with root package name */
    private String f54899b = "UNZIPForPluginThread";

    /* renamed from: e  reason: collision with root package name */
    public boolean f54902e = true;

    /* renamed from: f  reason: collision with root package name */
    a f54903f = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: UNZIPForPluginThread.java */
    /* loaded from: classes5.dex */
    public class a extends Thread {

        /* renamed from: b  reason: collision with root package name */
        private boolean f54905b = true;

        /* renamed from: c  reason: collision with root package name */
        File f54906c;

        /* renamed from: d  reason: collision with root package name */
        File f54907d;

        public a(File file, File file2) {
            this.f54907d = null;
            this.f54906c = file;
            this.f54907d = file2;
        }

        public void a(boolean z4) {
            this.f54905b = z4;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            super.run();
            while (this.f54905b) {
                try {
                    long J1 = UtilsMy.J1(this.f54906c);
                    File file = this.f54907d;
                    long length = file != null ? file.length() : 0L;
                    StringBuilder sb = new StringBuilder();
                    sb.append("zip currentSize =");
                    sb.append(J1);
                    sb.append("   surrentApk= ");
                    sb.append(length);
                    long size = g.this.f54901d.getSize() * 2;
                    if (size == 0) {
                        size = 1;
                    }
                    g.this.f54901d.setProgress(((J1 + length) * 100) / size);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("totalSize=");
                    sb2.append(size);
                    sb2.append(";zip progress =");
                    sb2.append(g.this.f54901d.getProgress());
                    UtilsMy.w4(g.this.f54901d);
                    Thread.sleep(1000L);
                } catch (InterruptedException e5) {
                    e5.printStackTrace();
                    g.this.a();
                    return;
                }
            }
        }
    }

    public g(DownloadTask downloadTask, Context context) {
        this.f54901d = downloadTask;
        this.f54900c = context;
    }

    @Override // com.join.mgps.task.c
    public void a() {
        this.f54902e = false;
        this.f54903f.a(false);
        DownloadTask downloadTask = this.f54901d;
        if (downloadTask != null) {
            downloadTask.set_from_type(0);
        }
    }

    @Override // java.lang.Thread
    public void interrupt() {
        super.interrupt();
        DownloadTask downloadTask = this.f54901d;
        if (downloadTask != null) {
            downloadTask.set_from_type(0);
        }
    }

    @Override // com.join.mgps.task.c
    public boolean isRunning() {
        return this.f54902e;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        int i4;
        File file;
        String str;
        long j4;
        super.run();
        EMUApkTable n4 = p.o().n(this.f54901d.getPlugin_num());
        String apkPath = n4.getApkPath();
        if (!TextUtils.isEmpty(apkPath) && new File(apkPath).exists()) {
            l.delete(n4.getTag_id());
        }
        if (APKUtils.G(this.f54901d)) {
            i4 = 1;
        } else {
            i4 = APKUtils.L(this.f54901d) ? 2 : 0;
        }
        try {
            try {
                file = new File(this.f54901d.getPath());
                try {
                    com.papa.sim.statistic.p.l(this.f54900c).j1(this.f54901d.getCrc_link_type_val(), AccountUtil_.getInstance_(this.f54900c).getUid(), i4);
                    com.papa.sim.statistic.p.l(this.f54900c).o1(this.f54901d.getPlugin_num(), this.f54901d.getVer() + "_" + this.f54901d.getVer_name(), AccountUtil_.getInstance_(this.f54900c).getUid());
                    str = file.getParent() + net.lingala.zip4j.util.e.F0 + this.f54901d.getVer() + "_" + this.f54901d.getVer_name();
                    if (file.exists()) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("zip len=");
                        sb.append(file.length());
                        j4 = System.currentTimeMillis();
                        if (this.f54901d.getSize() >= v.f28103c) {
                            a aVar = new a(file, new File(str));
                            this.f54903f = aVar;
                            aVar.start();
                        } else {
                            this.f54902e = true;
                        }
                        w2.g(file, str);
                    } else {
                        j4 = -1;
                    }
                } catch (Exception e5) {
                    e5.printStackTrace();
                    a aVar2 = this.f54903f;
                    if (aVar2 != null) {
                        aVar2.a(false);
                    }
                    if (!UtilsMy.p2(this.f54900c, this.f54901d, false)) {
                        this.f54900c.sendBroadcast(new Intent(o1.a.f72020q));
                        com.papa.sim.statistic.p.l(this.f54900c).L1("zip...insufficient storage. gameId=" + this.f54901d.getCrc_link_type_val());
                    } else {
                        try {
                            com.papa.sim.statistic.p.l(this.f54900c).L1("zip error[gameId=" + this.f54901d.getCrc_link_type_val() + ",size=" + file.length() + ",brand=" + Build.BRAND + ",model=" + Build.MODEL + "]::" + com.join.mgps.Util.h.c(e5));
                        } catch (Exception unused) {
                        }
                    }
                    i.e().o(this.f54901d);
                }
            } finally {
                this.f54901d.set_from_type(0);
            }
        } catch (Exception e6) {
            e6.printStackTrace();
        }
        if (this.f54902e) {
            a aVar3 = this.f54903f;
            if (aVar3 != null) {
                aVar3.a(false);
            }
            if (str != null && !"".equals(str) && new File(str).exists()) {
                this.f54901d.setProgress(100L);
                UtilsMy.w4(this.f54901d);
                if (j4 != -1) {
                    this.f54901d.setZipCost(file.length() / (System.currentTimeMillis() - j4));
                }
                String h4 = l.h(this.f54901d.getPlugin_num(), new File(str));
                n4.setApkPath(h4);
                p.o().update(n4);
                l.F(n4);
                EMUApkTable n5 = o.o().n(this.f54901d.getPlugin_num());
                if (n5 != null) {
                    EMUApkArenaTable g4 = o.o().g(Integer.valueOf(n5.getId()));
                    g4.setApkPath(h4);
                    o.o().m(g4);
                    l.E(g4);
                }
                UtilsMy.delete(file);
                this.f54901d.setPath(str);
                this.f54901d.setGameZipPath(str);
                p1.f.K().m(this.f54901d);
                this.f54901d.setStatus(5);
                p1.f.K().k0(this.f54901d, 5, 100L);
                i.e().k(this.f54901d.getCrc_link_type_val());
                UtilsMy.G3(this.f54900c, this.f54901d, 5);
                org.greenrobot.eventbus.c.f().o(new com.join.mgps.event.l(this.f54901d.getCrc_link_type_val(), 38));
                org.greenrobot.eventbus.c.f().o(new n(this.f54901d, 5));
                i.e().l(this.f54901d.getCrc_link_type_val());
                try {
                    for (DownloadTask downloadTask : p1.f.K().d()) {
                        String plugin_num = this.f54901d.getPlugin_num();
                        if (downloadTask.getPlugin_num().equals(plugin_num) && !plugin_num.equals(downloadTask.getCrc_link_type_val()) && downloadTask.getStatus() == 5) {
                            break;
                        }
                    }
                } catch (Exception e7) {
                    e7.printStackTrace();
                }
                DownloadTask downloadTask2 = this.f54901d;
                if (downloadTask2 != null && downloadTask2.getGameZipPath() != null) {
                    try {
                        g0.A(".downloadTask_chajian", new File(this.f54901d.getGameZipPath()).getParent(), JsonMapper.getInstance().toJson(this.f54901d));
                    } catch (IOException e8) {
                        e8.printStackTrace();
                    }
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("mDownloadTask.fina=");
                sb2.append(this.f54901d.getGameZipPath());
                return;
            }
            this.f54901d.setStatus(13);
            i.e().o(this.f54901d);
        }
    }

    public g(DownloadTask downloadTask, Context context, String str) {
        this.f54901d = downloadTask;
        this.f54900c = context;
        this.f54904g = str;
    }
}
