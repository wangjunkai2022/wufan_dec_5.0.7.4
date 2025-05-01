package com.join.mgps.task;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import b2.k;
import b2.n;
import b2.q;
import com.MApplication;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.android.app.common.servcie.i;
import com.join.android.app.common.servcie.r;
import com.join.android.app.common.utils.APKUtils;
import com.join.android.app.common.utils.JsonMapper;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.Util.g0;
import com.join.mgps.Util.g2;
import com.join.mgps.Util.t;
import com.join.mgps.Util.v;
import com.join.mgps.Util.w2;
import com.join.mgps.db.tables.DownloadHistoryTable;
import com.join.mgps.db.tables.DownlodTaskCopyTable;
import com.join.mgps.db.tables.EMUUpdateTable;
import com.join.mgps.dto.ExtBean;
import com.join.mgps.dto.TipBean;
import com.join.mgps.dto.UNZipPathBackBean;
import com.join.mgps.enums.ConstantIntEnum;
import com.join.mgps.enums.Dtype;
import com.join.mgps.event.l;
import com.join.mgps.event.x;
import com.papa.sim.statistic.Event;
import com.papa.sim.statistic.o;
import com.papa.sim.statistic.p;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONObject;
import tv.danmaku.ijk.media.player.IjkMediaMeta;
/* compiled from: UNZIPThread.java */
/* loaded from: classes5.dex */
public class h extends Thread implements c {

    /* renamed from: b  reason: collision with root package name */
    private Context f54909b;

    /* renamed from: c  reason: collision with root package name */
    private DownloadTask f54910c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f54911d = true;

    /* renamed from: e  reason: collision with root package name */
    a f54912e = null;

    /* renamed from: f  reason: collision with root package name */
    private String f54913f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: UNZIPThread.java */
    /* loaded from: classes5.dex */
    public class a extends Thread {

        /* renamed from: b  reason: collision with root package name */
        private boolean f54914b = true;

        /* renamed from: c  reason: collision with root package name */
        File f54915c;

        public a(File file) {
            this.f54915c = file;
        }

        public void a(boolean z4) {
            this.f54914b = z4;
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x00a0 A[Catch: all -> 0x00c8, InterruptedException -> 0x00ca, TryCatch #1 {InterruptedException -> 0x00ca, blocks: (B:3:0x0003, B:5:0x0007, B:8:0x0010, B:11:0x0015, B:22:0x0052, B:24:0x006c, B:26:0x00a0, B:27:0x00c1, B:23:0x0061, B:16:0x0044), top: B:37:0x0003, outer: #0 }] */
        @Override // java.lang.Thread, java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void run() {
            /*
                r8 = this;
                super.run()
            L3:
                boolean r0 = r8.f54914b     // Catch: java.lang.Throwable -> Lc8 java.lang.InterruptedException -> Lca
                if (r0 == 0) goto Ld3
                com.join.mgps.task.h r0 = com.join.mgps.task.h.this     // Catch: java.lang.Throwable -> Lc8 java.lang.InterruptedException -> Lca
                com.github.snowdream.android.app.downloader.DownloadTask r0 = com.join.mgps.task.h.b(r0)     // Catch: java.lang.Throwable -> Lc8 java.lang.InterruptedException -> Lca
                if (r0 != 0) goto L10
                return
            L10:
                java.io.File r0 = r8.f54915c     // Catch: java.lang.Throwable -> Lc8 java.lang.InterruptedException -> Lca
                if (r0 != 0) goto L15
                goto L3
            L15:
                long r0 = com.join.mgps.Util.UtilsMy.J1(r0)     // Catch: java.lang.Throwable -> Lc8 java.lang.InterruptedException -> Lca
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lc8 java.lang.InterruptedException -> Lca
                r2.<init>()     // Catch: java.lang.Throwable -> Lc8 java.lang.InterruptedException -> Lca
                java.lang.String r3 = "zip currentSize ="
                r2.append(r3)     // Catch: java.lang.Throwable -> Lc8 java.lang.InterruptedException -> Lca
                r2.append(r0)     // Catch: java.lang.Throwable -> Lc8 java.lang.InterruptedException -> Lca
                r2 = 2
                com.join.mgps.task.h r4 = com.join.mgps.task.h.this     // Catch: java.lang.Throwable -> Lc8 java.lang.InterruptedException -> Lca
                com.github.snowdream.android.app.downloader.DownloadTask r4 = com.join.mgps.task.h.b(r4)     // Catch: java.lang.Throwable -> Lc8 java.lang.InterruptedException -> Lca
                long r4 = r4.getSize()     // Catch: java.lang.Throwable -> Lc8 java.lang.InterruptedException -> Lca
                long r4 = r4 * r2
                com.join.mgps.task.h r2 = com.join.mgps.task.h.this     // Catch: java.lang.Exception -> L43 java.lang.Throwable -> Lc8
                com.github.snowdream.android.app.downloader.DownloadTask r2 = com.join.mgps.task.h.b(r2)     // Catch: java.lang.Exception -> L43 java.lang.Throwable -> Lc8
                java.lang.String r2 = r2.getUnzip_size()     // Catch: java.lang.Exception -> L43 java.lang.Throwable -> Lc8
                long r4 = java.lang.Long.parseLong(r2)     // Catch: java.lang.Exception -> L43 java.lang.Throwable -> Lc8
                goto L47
            L43:
                r2 = move-exception
                r2.printStackTrace()     // Catch: java.lang.Throwable -> Lc8 java.lang.InterruptedException -> Lca
            L47:
                r2 = 0
                int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
                if (r6 == 0) goto L61
                int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r6 != 0) goto L52
                goto L61
            L52:
                com.join.mgps.task.h r2 = com.join.mgps.task.h.this     // Catch: java.lang.Throwable -> Lc8 java.lang.InterruptedException -> Lca
                com.github.snowdream.android.app.downloader.DownloadTask r2 = com.join.mgps.task.h.b(r2)     // Catch: java.lang.Throwable -> Lc8 java.lang.InterruptedException -> Lca
                r6 = 100
                long r0 = r0 * r6
                long r0 = r0 / r4
                r2.setProgress(r0)     // Catch: java.lang.Throwable -> Lc8 java.lang.InterruptedException -> Lca
                goto L6c
            L61:
                com.join.mgps.task.h r0 = com.join.mgps.task.h.this     // Catch: java.lang.Throwable -> Lc8 java.lang.InterruptedException -> Lca
                com.github.snowdream.android.app.downloader.DownloadTask r0 = com.join.mgps.task.h.b(r0)     // Catch: java.lang.Throwable -> Lc8 java.lang.InterruptedException -> Lca
                r1 = 1
                r0.setProgress(r1)     // Catch: java.lang.Throwable -> Lc8 java.lang.InterruptedException -> Lca
            L6c:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lc8 java.lang.InterruptedException -> Lca
                r0.<init>()     // Catch: java.lang.Throwable -> Lc8 java.lang.InterruptedException -> Lca
                java.lang.String r1 = "totalSize="
                r0.append(r1)     // Catch: java.lang.Throwable -> Lc8 java.lang.InterruptedException -> Lca
                r0.append(r4)     // Catch: java.lang.Throwable -> Lc8 java.lang.InterruptedException -> Lca
                java.lang.String r1 = ";zip progress ="
                r0.append(r1)     // Catch: java.lang.Throwable -> Lc8 java.lang.InterruptedException -> Lca
                com.join.mgps.task.h r1 = com.join.mgps.task.h.this     // Catch: java.lang.Throwable -> Lc8 java.lang.InterruptedException -> Lca
                com.github.snowdream.android.app.downloader.DownloadTask r1 = com.join.mgps.task.h.b(r1)     // Catch: java.lang.Throwable -> Lc8 java.lang.InterruptedException -> Lca
                long r1 = r1.getProgress()     // Catch: java.lang.Throwable -> Lc8 java.lang.InterruptedException -> Lca
                r0.append(r1)     // Catch: java.lang.Throwable -> Lc8 java.lang.InterruptedException -> Lca
                com.join.mgps.task.h r0 = com.join.mgps.task.h.this     // Catch: java.lang.Throwable -> Lc8 java.lang.InterruptedException -> Lca
                com.github.snowdream.android.app.downloader.DownloadTask r0 = com.join.mgps.task.h.b(r0)     // Catch: java.lang.Throwable -> Lc8 java.lang.InterruptedException -> Lca
                com.join.mgps.Util.UtilsMy.w4(r0)     // Catch: java.lang.Throwable -> Lc8 java.lang.InterruptedException -> Lca
                com.join.mgps.task.h r0 = com.join.mgps.task.h.this     // Catch: java.lang.Throwable -> Lc8 java.lang.InterruptedException -> Lca
                java.lang.String r0 = com.join.mgps.task.h.c(r0)     // Catch: java.lang.Throwable -> Lc8 java.lang.InterruptedException -> Lca
                boolean r0 = com.join.mgps.Util.g2.i(r0)     // Catch: java.lang.Throwable -> Lc8 java.lang.InterruptedException -> Lca
                if (r0 == 0) goto Lc1
                org.greenrobot.eventbus.c r0 = org.greenrobot.eventbus.c.f()     // Catch: java.lang.Throwable -> Lc8 java.lang.InterruptedException -> Lca
                com.join.mgps.event.x r1 = new com.join.mgps.event.x     // Catch: java.lang.Throwable -> Lc8 java.lang.InterruptedException -> Lca
                r2 = 6
                com.join.mgps.task.h r3 = com.join.mgps.task.h.this     // Catch: java.lang.Throwable -> Lc8 java.lang.InterruptedException -> Lca
                com.github.snowdream.android.app.downloader.DownloadTask r3 = com.join.mgps.task.h.b(r3)     // Catch: java.lang.Throwable -> Lc8 java.lang.InterruptedException -> Lca
                java.lang.String r3 = r3.getCrc_link_type_val()     // Catch: java.lang.Throwable -> Lc8 java.lang.InterruptedException -> Lca
                com.join.mgps.task.h r4 = com.join.mgps.task.h.this     // Catch: java.lang.Throwable -> Lc8 java.lang.InterruptedException -> Lca
                com.github.snowdream.android.app.downloader.DownloadTask r4 = com.join.mgps.task.h.b(r4)     // Catch: java.lang.Throwable -> Lc8 java.lang.InterruptedException -> Lca
                long r4 = r4.getProgress()     // Catch: java.lang.Throwable -> Lc8 java.lang.InterruptedException -> Lca
                r1.<init>(r2, r3, r4)     // Catch: java.lang.Throwable -> Lc8 java.lang.InterruptedException -> Lca
                r0.o(r1)     // Catch: java.lang.Throwable -> Lc8 java.lang.InterruptedException -> Lca
            Lc1:
                r0 = 1000(0x3e8, double:4.94E-321)
                java.lang.Thread.sleep(r0)     // Catch: java.lang.Throwable -> Lc8 java.lang.InterruptedException -> Lca
                goto L3
            Lc8:
                r0 = move-exception
                goto Ld4
            Lca:
                r0 = move-exception
                r0.printStackTrace()     // Catch: java.lang.Throwable -> Lc8
                com.join.mgps.task.h r0 = com.join.mgps.task.h.this     // Catch: java.lang.Throwable -> Lc8
                r0.a()     // Catch: java.lang.Throwable -> Lc8
            Ld3:
                return
            Ld4:
                goto Ld6
            Ld5:
                throw r0
            Ld6:
                goto Ld5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.join.mgps.task.h.a.run():void");
        }
    }

    public h(DownloadTask downloadTask, Context context) {
        this.f54910c = downloadTask;
        this.f54909b = context;
        if (downloadTask != null && g2.i(downloadTask.getPath()) && g2.i(downloadTask.getExt())) {
            try {
                ExtBean extBean = (ExtBean) JsonMapper.getInstance().fromJson(downloadTask.getExt(), ExtBean.class);
                if (extBean == null || extBean.getDown_from() != 1) {
                    return;
                }
                this.f54913f = v.f28107g + downloadTask.getRomType() + "/roms/";
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x015d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void e(java.lang.String r17, java.lang.String r18, java.lang.String r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.mgps.task.h.e(java.lang.String, java.lang.String, java.lang.String, boolean):void");
    }

    @Override // com.join.mgps.task.c
    public void a() {
        this.f54911d = false;
        this.f54912e.a(false);
        DownloadTask downloadTask = this.f54910c;
        if (downloadTask != null) {
            downloadTask.set_from_type(0);
        }
    }

    boolean d() {
        try {
            DownloadTask downloadTask = this.f54910c;
            if (downloadTask != null && !TextUtils.isEmpty(downloadTask.getResource_url_remote()) && !TextUtils.isEmpty(this.f54910c.getResource_path()) && (this.f54910c.getResource_path().endsWith(".zip") || this.f54910c.getResource_path().endsWith(".zip/"))) {
                File file = new File(this.f54910c.getResource_path());
                if (file.exists()) {
                    return file.isFile();
                }
                return false;
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        return false;
    }

    @Override // java.lang.Thread
    public void interrupt() {
        super.interrupt();
        DownloadTask downloadTask = this.f54910c;
        if (downloadTask != null) {
            downloadTask.set_from_type(0);
        }
    }

    @Override // com.join.mgps.task.c
    public boolean isRunning() {
        return this.f54911d;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        int i4;
        int i5;
        Throwable th;
        File file;
        UNZipPathBackBean uNZipPathBackBean;
        File file2;
        long j4;
        ExtBean extBean;
        String c5;
        super.run();
        if (APKUtils.G(this.f54910c)) {
            i4 = 1;
        } else {
            i4 = APKUtils.L(this.f54910c) ? 2 : 0;
        }
        try {
            try {
                file = new File(this.f54910c.getPath());
            } catch (Throwable th2) {
                th = th2;
                i5 = 0;
                this.f54910c.set_from_type(i5);
                throw th;
            }
        } catch (Exception e5) {
            try {
                e5.printStackTrace();
            } catch (Throwable th3) {
                th = th3;
                i5 = 0;
                th = th;
                this.f54910c.set_from_type(i5);
                throw th;
            }
        }
        try {
            File file3 = null;
            if (file.exists()) {
                StringBuilder sb = new StringBuilder();
                sb.append("zip len=");
                sb.append(file.length());
                j4 = System.currentTimeMillis();
                if (this.f54910c.get_from_type() != 1) {
                    p.l(this.f54909b).j1(this.f54910c.getCrc_link_type_val(), AccountUtil_.getInstance_(this.f54909b).getUid(), i4);
                }
                if (this.f54910c.getSize() >= v.f28103c) {
                    if (this.f54910c.getSize() > IjkMediaMeta.AV_CH_WIDE_LEFT) {
                        c5 = t.d(file, file.getParent(), this.f54910c.getPackageName());
                    } else {
                        c5 = w2.c(file, file.getParent(), this.f54910c.getPackageName());
                    }
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("get rom path");
                    sb2.append(c5);
                    a aVar = new a(new File(c5).getParentFile());
                    this.f54912e = aVar;
                    aVar.start();
                } else {
                    this.f54911d = true;
                }
                if (!g2.h(this.f54913f)) {
                    File file4 = new File(this.f54913f);
                    if (!file4.exists()) {
                        file4.mkdirs();
                    }
                    if (this.f54910c.getSize() > IjkMediaMeta.AV_CH_WIDE_LEFT) {
                        uNZipPathBackBean = t.g(this, file, this.f54913f, this.f54910c.getPackageName());
                    } else {
                        uNZipPathBackBean = w2.h(this, file, this.f54913f, this.f54910c.getPackageName());
                    }
                } else if (this.f54910c.getSize() > IjkMediaMeta.AV_CH_WIDE_LEFT) {
                    uNZipPathBackBean = t.g(this, file, file.getParent(), this.f54910c.getPackageName());
                } else {
                    uNZipPathBackBean = w2.h(this, file, file.getParent(), this.f54910c.getPackageName());
                }
                if (d()) {
                    file2 = new File(this.f54910c.getResource_path());
                    String parent = file2.getParent();
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(ConstantIntEnum.N3DS.value());
                    sb3.append("");
                    w2.f(file2, TextUtils.equals(sb3.toString(), this.f54910c.getPlugin_num()) ? this.f54913f : parent, this.f54910c.getPackageName());
                } else {
                    file2 = null;
                }
                StringBuilder sb4 = new StringBuilder();
                sb4.append("romsPath-");
                sb4.append(uNZipPathBackBean.getGameZipPath());
            } else {
                uNZipPathBackBean = null;
                file2 = null;
                j4 = -1;
            }
            if (this.f54911d) {
                i5 = 0;
                try {
                    a aVar2 = this.f54912e;
                    if (aVar2 != null) {
                        aVar2.a(false);
                    }
                    if (uNZipPathBackBean != null && !g2.h(uNZipPathBackBean.getGameZipPath())) {
                        file3 = new File(uNZipPathBackBean.getGameZipPath());
                    }
                    if (uNZipPathBackBean != null && !"".equals(uNZipPathBackBean) && file3 != null && file3.exists()) {
                        this.f54910c.setProgress(100L);
                        UtilsMy.w4(this.f54910c);
                        if (this.f54910c.getDownloadType() != 2) {
                            this.f54910c.setGameZipPath(uNZipPathBackBean.getGameZipPath());
                            this.f54910c.setSource_down_path(uNZipPathBackBean.getSoucePath());
                            StringBuilder sb5 = new StringBuilder();
                            sb5.append("romsPath3-");
                            sb5.append(this.f54910c.getGameZipPath());
                        }
                        if (j4 != -1) {
                            this.f54910c.setZipCost(file.length() / (System.currentTimeMillis() - j4));
                        }
                        StringBuilder sb6 = new StringBuilder();
                        sb6.append("romsPath4-");
                        sb6.append(this.f54910c.getGameZipPath());
                        StringBuilder sb7 = new StringBuilder();
                        sb7.append("file-");
                        sb7.append(file.getAbsolutePath());
                        UtilsMy.delete(file);
                        if (file2 != null) {
                            UtilsMy.delete(file2);
                        }
                        StringBuilder sb8 = new StringBuilder();
                        sb8.append("romsPath5-");
                        sb8.append(this.f54910c.getGameZipPath());
                        if (this.f54910c.get_from_type() != 1) {
                            DownloadTask downloadTask = this.f54910c;
                            if (downloadTask != null && !TextUtils.isEmpty(downloadTask.getPath()) && this.f54910c.getPath().toLowerCase().contains("/Quark/Download".toLowerCase())) {
                                String ext = this.f54910c.getExt();
                                try {
                                    if (!TextUtils.isEmpty(ext)) {
                                        new JSONObject(ext).put("qkPosition", "qk");
                                    }
                                } catch (Exception unused) {
                                }
                            }
                            r.b(this.f54909b, this.f54910c, Event.gameDownload);
                            String ext2 = this.f54910c.getExt();
                            if (g2.i(ext2) && (extBean = (ExtBean) JsonMapper.getInstance().fromJson(ext2, ExtBean.class)) != null) {
                                String recPosition = extBean.getRecPosition();
                                if (g2.i(recPosition)) {
                                    e(recPosition, this.f54910c.getCrc_link_type_val(), extBean.getVolcanoOther(), UtilsMy.k2(this.f54910c.getTipBeans()));
                                }
                            }
                        }
                        StringBuilder sb9 = new StringBuilder();
                        sb9.append("romsPath6-");
                        sb9.append(this.f54910c.getGameZipPath());
                        int downloadType = this.f54910c.getDownloadType();
                        if (downloadType == 0 || downloadType == 1) {
                            HashMap hashMap = new HashMap();
                            hashMap.put("crc_sign_id", this.f54910c.getCrc_link_type_val());
                            List<EMUUpdateTable> h4 = q.o().h(hashMap);
                            if (h4 != null && h4.size() > 0) {
                                EMUUpdateTable eMUUpdateTable = h4.get(0);
                                this.f54910c.setCfg_ver(eMUUpdateTable.getCfg_ver());
                                this.f54910c.setCfg_ver_name(eMUUpdateTable.getCfg_ver_name());
                                this.f54910c.setCfg_down_url(eMUUpdateTable.getCfg_down_url());
                            }
                            this.f54910c.setStatus(5);
                            try {
                                this.f54910c.setId(p1.f.K().F(this.f54910c.getCrc_link_type_val()).getId());
                                p1.f.K().update(this.f54910c);
                                StringBuilder sb10 = new StringBuilder();
                                sb10.append("mDownloadTask.romwpath=");
                                sb10.append(this.f54910c.getGameZipPath());
                            } catch (Exception e6) {
                                e6.printStackTrace();
                            }
                        } else if (downloadType != 2) {
                            try {
                                p1.f.K().update(this.f54910c);
                            } catch (Exception e7) {
                                e7.printStackTrace();
                            }
                        } else {
                            DownlodTaskCopyTable n4 = n.o().n(this.f54910c.getCrc_link_type_val());
                            JsonMapper jsonMapper = JsonMapper.getInstance();
                            if (n4 != null && n4.getDownloadTask() != null) {
                                DownloadTask downloadTask2 = (DownloadTask) jsonMapper.fromJson(n4.getDownloadTask(), DownloadTask.class);
                                downloadTask2.setTipBeans((ArrayList) jsonMapper.fromJson(this.f54910c.getTips(), jsonMapper.createCollectionType(ArrayList.class, TipBean.class)));
                                if (this.f54910c.getId() != 0) {
                                    downloadTask2.setId(this.f54910c.getId());
                                }
                                HashMap hashMap2 = new HashMap();
                                hashMap2.put("crc_sign_id", this.f54910c.getCrc_link_type_val());
                                List<EMUUpdateTable> h5 = q.o().h(hashMap2);
                                if (h5 != null && h5.size() > 0) {
                                    EMUUpdateTable eMUUpdateTable2 = h5.get(0);
                                    downloadTask2.setCfg_ver(eMUUpdateTable2.getCfg_ver());
                                    downloadTask2.setCfg_ver_name(eMUUpdateTable2.getCfg_ver_name());
                                    downloadTask2.setCfg_down_url(eMUUpdateTable2.getCfg_down_url());
                                }
                                downloadTask2.setDownloadType(1);
                                downloadTask2.setStatus(5);
                                n.o().delete((n) n4);
                                p1.f.K().m(downloadTask2);
                            }
                        }
                        this.f54910c.setStatus(5);
                        p1.f.K().k0(this.f54910c, 5, 100L);
                        UtilsMy.G3(MApplication.f1497x, this.f54910c, 5);
                        if (this.f54910c.getRomType() != null && !this.f54910c.getFileType().equals(Dtype.chajian.name())) {
                            DownloadHistoryTable p4 = k.n().p(this.f54910c.getCrc_link_type_val());
                            if (p4 != null) {
                                p4.setCreate_time(System.currentTimeMillis());
                            } else {
                                p4 = new DownloadHistoryTable();
                                p4.setCrc_link_type_val(this.f54910c.getCrc_link_type_val());
                                p4.setCreate_time(System.currentTimeMillis());
                            }
                            k.n().m(p4);
                        }
                        DownloadTask downloadTask3 = this.f54910c;
                        if (downloadTask3 != null && downloadTask3.getGameZipPath() != null) {
                            try {
                                g0.A(".downloadTask", new File(this.f54910c.getGameZipPath()).getParent(), JsonMapper.getInstance().toJson(this.f54910c));
                            } catch (IOException e8) {
                                e8.printStackTrace();
                            }
                        }
                        Intent intent = new Intent();
                        intent.putExtra("gameId", this.f54910c.getCrc_link_type_val());
                        intent.setAction(o1.a.f72030v);
                        this.f54909b.sendBroadcast(intent);
                        i.e().l(this.f54910c.getCrc_link_type_val());
                        org.greenrobot.eventbus.c.f().o(new l(this.f54910c.getCrc_link_type_val(), 38));
                        org.greenrobot.eventbus.c.f().o(new com.join.mgps.event.n(this.f54910c, 5));
                        o.v(this.f54910c.getCrc_link_type_val());
                        if (!g2.h(this.f54913f)) {
                            org.greenrobot.eventbus.c.f().o(new x(9, this.f54910c.getCrc_link_type_val()));
                        }
                        if (this.f54910c.get_from() != 120) {
                            DownloadTask Z = p1.f.K().Z(Integer.parseInt(this.f54910c.getPlugin_num()));
                            if (Z != null && Z.getDown_type() == 2) {
                                UtilsMy.N2(this.f54909b, this.f54910c.getCrc_link_type_val());
                            } else if (com.join.android.app.common.utils.e.l0(this.f54909b).d(this.f54909b, b2.p.o().n(this.f54910c.getPlugin_num()).getPackage_name())) {
                                UtilsMy.N2(this.f54909b, this.f54910c.getCrc_link_type_val());
                            }
                        }
                        StringBuilder sb11 = new StringBuilder();
                        sb11.append("mDownloadTask.fina=");
                        sb11.append(this.f54910c.getGameZipPath());
                        this.f54910c.set_from_type(0);
                        return;
                    }
                    this.f54910c.setStatus(13);
                    i.e().o(this.f54910c);
                } catch (Throwable th4) {
                    th = th4;
                    th = th;
                    this.f54910c.set_from_type(i5);
                    throw th;
                }
            }
        } catch (Exception e9) {
            e9.printStackTrace();
            p.l(this.f54909b).e2(this.f54910c.getCrc_link_type_val(), AccountUtil_.getInstance_(this.f54909b).getUid(), i4);
            try {
                p.l(this.f54909b).L1("zip error[gameId=" + this.f54910c.getCrc_link_type_val() + ",size=" + file.length() + ",brand=" + Build.BRAND + ",model=" + Build.MODEL + "]::" + com.join.mgps.Util.h.c(e9));
            } catch (Exception unused2) {
            }
            a aVar3 = this.f54912e;
            if (aVar3 != null) {
                aVar3.a(false);
            }
            if (!UtilsMy.p2(this.f54909b, this.f54910c, false)) {
                this.f54909b.sendBroadcast(new Intent(o1.a.f72020q));
                p.l(this.f54909b).L1("zip...insufficient storage. gameId=" + this.f54910c.getCrc_link_type_val());
            } else {
                try {
                    p.l(this.f54909b).L1("zip error[gameId=" + this.f54910c.getCrc_link_type_val() + ",size=" + file.length() + ",brand=" + Build.BRAND + ",model=" + Build.MODEL + "]::" + com.join.mgps.Util.h.c(e9));
                } catch (Exception unused3) {
                }
            }
            i.e().o(this.f54910c);
        }
        this.f54910c.set_from_type(0);
    }

    public h(DownloadTask downloadTask, Context context, String str) {
        this.f54910c = downloadTask;
        this.f54909b = context;
        this.f54913f = str;
    }
}
