package com.join.mgps.task;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import b2.p;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.android.app.common.servcie.i;
import com.join.android.app.common.utils.APKUtils;
import com.join.android.app.common.utils.l;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.Util.g2;
import com.join.mgps.Util.v;
import com.join.mgps.Util.w2;
import com.join.mgps.db.tables.EMUApkTable;
import com.join.mgps.event.n;
import java.io.File;
/* compiled from: UNPs2ZIPThread.java */
/* loaded from: classes5.dex */
public class f extends Thread implements c {

    /* renamed from: h  reason: collision with root package name */
    private static final String f54887h = f.class.getSimpleName();

    /* renamed from: b  reason: collision with root package name */
    private Context f54888b;

    /* renamed from: c  reason: collision with root package name */
    private DownloadTask f54889c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f54890d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f54891e;

    /* renamed from: f  reason: collision with root package name */
    a f54892f;

    /* renamed from: g  reason: collision with root package name */
    private String f54893g;

    public f(DownloadTask downloadTask, Context context, String str) {
        this.f54890d = true;
        this.f54891e = false;
        this.f54892f = null;
        this.f54889c = downloadTask;
        this.f54888b = context;
        this.f54893g = str;
    }

    @Override // com.join.mgps.task.c
    public void a() {
        this.f54890d = false;
        this.f54892f.a(false);
        DownloadTask downloadTask = this.f54889c;
        if (downloadTask != null) {
            downloadTask.set_from_type(0);
        }
    }

    @Override // com.join.mgps.task.c
    public boolean isRunning() {
        return this.f54890d;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        int i4;
        File file;
        String str;
        long j4;
        File[] listFiles;
        super.run();
        EMUApkTable n4 = p.o().n(this.f54889c.getPlugin_num());
        String apkPath = n4 != null ? n4.getApkPath() : "";
        if (!TextUtils.isEmpty(apkPath) && new File(apkPath).exists()) {
            l.delete(n4.getTag_id());
        }
        if (APKUtils.G(this.f54889c)) {
            i4 = 1;
        } else {
            i4 = APKUtils.L(this.f54889c) ? 2 : 0;
        }
        try {
            try {
                file = new File(this.f54889c.getPath());
                try {
                    com.papa.sim.statistic.p.l(this.f54888b).j1(this.f54889c.getCrc_link_type_val(), AccountUtil_.getInstance_(this.f54888b).getUid(), i4);
                    com.papa.sim.statistic.p.l(this.f54888b).o1(this.f54889c.getPlugin_num(), this.f54889c.getVer() + "_" + this.f54889c.getVer_name(), AccountUtil_.getInstance_(this.f54888b).getUid());
                    str = this.f54893g + net.lingala.zip4j.util.e.F0 + this.f54889c.getVer() + "_" + this.f54889c.getVer_name();
                    if (!g2.h(str)) {
                        File file2 = new File(str);
                        if (!file2.exists()) {
                            file2.mkdirs();
                        }
                    }
                    if (file.exists()) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("zip len=");
                        sb.append(file.length());
                        j4 = System.currentTimeMillis();
                        if (this.f54889c.getSize() >= v.f28103c) {
                            a aVar = new a(file, new File(str));
                            this.f54892f = aVar;
                            aVar.start();
                        } else {
                            this.f54890d = true;
                        }
                        w2.g(file, str);
                    } else {
                        j4 = -1;
                    }
                } catch (Exception e5) {
                    e5.printStackTrace();
                    a aVar2 = this.f54892f;
                    if (aVar2 != null) {
                        aVar2.a(false);
                    }
                    if (!UtilsMy.p2(this.f54888b, this.f54889c, false)) {
                        this.f54888b.sendBroadcast(new Intent(o1.a.f72020q));
                        com.papa.sim.statistic.p.l(this.f54888b).L1("zip...insufficient storage. gameId=" + this.f54889c.getCrc_link_type_val());
                    } else {
                        try {
                            com.papa.sim.statistic.p.l(this.f54888b).L1("zip error[gameId=" + this.f54889c.getCrc_link_type_val() + ",size=" + file.length() + ",brand=" + Build.BRAND + ",model=" + Build.MODEL + "]::" + com.join.mgps.Util.h.c(e5));
                        } catch (Exception unused) {
                        }
                    }
                    i.e().o(this.f54889c);
                }
            } finally {
                this.f54889c.set_from_type(0);
            }
        } catch (Exception e6) {
            e6.printStackTrace();
        }
        if (this.f54890d) {
            a aVar3 = this.f54892f;
            if (aVar3 != null) {
                aVar3.a(false);
            }
            if (str != null && !"".equals(str) && new File(str).exists()) {
                this.f54889c.setProgress(100L);
                UtilsMy.w4(this.f54889c);
                if (j4 != -1) {
                    this.f54889c.setZipCost(file.length() / (System.currentTimeMillis() - j4));
                }
                for (File file3 : new File(str).listFiles()) {
                    if (file3.getName().endsWith(".BIN")) {
                        this.f54889c.setResource_path(file3.getAbsolutePath());
                    }
                    if (file3.getName().endsWith(".apk")) {
                        this.f54889c.setPath(file3.getAbsolutePath());
                        this.f54889c.setGameZipPath(file3.getAbsolutePath());
                    }
                }
                p1.f.K().m(this.f54889c);
                Intent intent = new Intent();
                intent.setAction(o1.a.f72014n);
                intent.putExtra("apkpath", this.f54889c.getGameZipPath());
                this.f54888b.sendBroadcast(intent);
                this.f54889c.setStatus(11);
                p1.f.K().k0(this.f54889c, 11, 100L);
                i.e().k(this.f54889c.getCrc_link_type_val());
                UtilsMy.G3(this.f54888b, this.f54889c, 11);
                org.greenrobot.eventbus.c.f().o(new com.join.mgps.event.l(this.f54889c.getCrc_link_type_val(), 38));
                org.greenrobot.eventbus.c.f().o(new n(this.f54889c, 11));
                i.e().l(this.f54889c.getCrc_link_type_val());
                try {
                    for (DownloadTask downloadTask : p1.f.K().d()) {
                        String plugin_num = this.f54889c.getPlugin_num();
                        if (downloadTask.getPlugin_num().equals(plugin_num) && !plugin_num.equals(downloadTask.getCrc_link_type_val()) && downloadTask.getStatus() == 5) {
                            break;
                        }
                    }
                } catch (Exception e7) {
                    e7.printStackTrace();
                }
                return;
            }
            this.f54889c.setStatus(13);
            i.e().o(this.f54889c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: UNPs2ZIPThread.java */
    /* loaded from: classes5.dex */
    public class a extends Thread {

        /* renamed from: b  reason: collision with root package name */
        private boolean f54894b = true;

        /* renamed from: c  reason: collision with root package name */
        File f54895c;

        /* renamed from: d  reason: collision with root package name */
        File f54896d;

        /* renamed from: e  reason: collision with root package name */
        File f54897e;

        public a(File file, File file2) {
            this.f54897e = null;
            this.f54895c = file;
            this.f54897e = file2;
        }

        public void a(boolean z4) {
            this.f54894b = z4;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            super.run();
            while (this.f54894b) {
                try {
                    long J1 = UtilsMy.J1(this.f54895c);
                    File file = this.f54897e;
                    long length = file != null ? file.length() : 0L;
                    StringBuilder sb = new StringBuilder();
                    sb.append("zip currentSize =");
                    sb.append(J1);
                    sb.append("   surrentApk= ");
                    sb.append(length);
                    long size = f.this.f54889c.getSize() * 2;
                    if (size == 0) {
                        size = 1;
                    }
                    f.this.f54889c.setProgress(((J1 + length) * 100) / size);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("totalSize=");
                    sb2.append(size);
                    sb2.append(";zip progress =");
                    sb2.append(f.this.f54889c.getProgress());
                    UtilsMy.w4(f.this.f54889c);
                    Thread.sleep(1000L);
                } catch (InterruptedException e5) {
                    e5.printStackTrace();
                    f.this.a();
                    return;
                }
            }
        }

        public a(File file, File file2, File file3) {
            this.f54897e = null;
            this.f54895c = file;
            this.f54896d = file2;
            this.f54897e = file3;
        }
    }

    public f(DownloadTask downloadTask, Context context, boolean z4) {
        this.f54890d = true;
        this.f54891e = false;
        this.f54892f = null;
        this.f54889c = downloadTask;
        this.f54888b = context;
        this.f54891e = z4;
    }
}
