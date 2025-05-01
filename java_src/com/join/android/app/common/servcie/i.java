package com.join.android.app.common.servcie;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import com.MApplication;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.android.app.common.utils.APKUtils;
import com.join.android.app.common.utils.JsonMapper;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.Util.g0;
import com.join.mgps.Util.g2;
import com.join.mgps.Util.l1;
import com.join.mgps.Util.v;
import com.join.mgps.Util.v0;
import com.join.mgps.db.tables.EMUApkTable;
import com.join.mgps.dto.ApkVersionRemarkBean;
import com.join.mgps.dto.RomArchived;
import com.join.mgps.enums.ConstantIntEnum;
import com.join.mgps.enums.Dtype;
import com.join.mgps.pref.PrefDef_;
import com.papa.sim.statistic.Event;
import com.umeng.analytics.MobclickAgent;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: DownloadFactory.java */
/* loaded from: classes.dex */
public class i {

    /* renamed from: a  reason: collision with root package name */
    private static final String f14807a = "DownloadFactory";

    /* renamed from: b  reason: collision with root package name */
    private static Map<String, DownloadTask> f14808b = new ConcurrentHashMap(0);

    /* renamed from: c  reason: collision with root package name */
    private static ThreadPoolExecutor f14809c = new com.join.android.app.common.utils.i(1, 1, 500, TimeUnit.SECONDS, new LinkedBlockingQueue());

    /* renamed from: d  reason: collision with root package name */
    private static Map<String, Runnable> f14810d = new ConcurrentHashMap(0);

    /* renamed from: e  reason: collision with root package name */
    private static i f14811e;

    /* compiled from: DownloadFactory.java */
    /* loaded from: classes3.dex */
    class a extends Handler {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ DownloadTask f14812a;

        a(DownloadTask downloadTask) {
            this.f14812a = downloadTask;
        }

        @Override // android.os.Handler
        public void handleMessage(@NonNull Message message) {
            org.greenrobot.eventbus.c.f().o(new com.join.mgps.event.n(this.f14812a, 3));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DownloadFactory.java */
    /* loaded from: classes3.dex */
    public class b extends Thread {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DownloadTask f14814b;

        b(DownloadTask downloadTask) {
            this.f14814b = downloadTask;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            File parentFile;
            v0.c("删除文件开始时间 " + System.currentTimeMillis());
            p1.f.K().delete((p1.f) this.f14814b);
            File file = new File(this.f14814b.getPath());
            String gameZipPath = this.f14814b.getGameZipPath();
            if (gameZipPath != null && !gameZipPath.equals("")) {
                if (!this.f14814b.getFileType().equals(Dtype.android.name()) && !APKUtils.G(this.f14814b)) {
                    if (!this.f14814b.getFileType().equals(Dtype.chajian.name())) {
                        File parentFile2 = new File(gameZipPath).getParentFile();
                        if (parentFile2 != null) {
                            UtilsMy.delete(parentFile2);
                        }
                        if (!TextUtils.isEmpty(this.f14814b.getPlugin_num()) && (TextUtils.equals(this.f14814b.getPlugin_num(), String.valueOf(ConstantIntEnum.FBA.value())) || TextUtils.equals(this.f14814b.getPlugin_num(), String.valueOf(ConstantIntEnum.FC.value())) || TextUtils.equals(this.f14814b.getPlugin_num(), String.valueOf(ConstantIntEnum.GBA.value())) || TextUtils.equals(this.f14814b.getPlugin_num(), String.valueOf(ConstantIntEnum.MD.value())) || TextUtils.equals(this.f14814b.getPlugin_num(), String.valueOf(ConstantIntEnum.SFC.value())) || TextUtils.equals(this.f14814b.getPlugin_num(), String.valueOf(ConstantIntEnum.PSP.value())) || TextUtils.equals(this.f14814b.getPlugin_num(), String.valueOf(ConstantIntEnum.PS.value())) || TextUtils.equals(this.f14814b.getPlugin_num(), String.valueOf(ConstantIntEnum.WSC.value())) || TextUtils.equals(this.f14814b.getPlugin_num(), String.valueOf(ConstantIntEnum.GBC.value())))) {
                            StringBuilder sb = new StringBuilder();
                            sb.append(v.f28104d);
                            String str = File.separator;
                            sb.append(str);
                            sb.append("papa91");
                            sb.append(str);
                            sb.append(UtilsMy.X1(Integer.parseInt(this.f14814b.getPlugin_num())));
                            sb.append(str);
                            sb.append(this.f14814b.getPackageName());
                            File file2 = new File(sb.toString());
                            if (file2.exists()) {
                                UtilsMy.delete(file2);
                            }
                            File file3 = new File(MApplication.f1497x.getFilesDir() + "/emus/" + UtilsMy.X1(Integer.parseInt(this.f14814b.getPlugin_num())) + str + this.f14814b.getPackageName());
                            if (file3.exists()) {
                                UtilsMy.delete(file3);
                            }
                        }
                    } else if (TextUtils.equals(this.f14814b.getCrc_link_type_val(), String.valueOf(ConstantIntEnum.PS2.value())) && (parentFile = new File(gameZipPath).getParentFile()) != null) {
                        UtilsMy.delete(parentFile);
                    }
                } else {
                    UtilsMy.delete(new File(gameZipPath));
                }
            } else {
                File file4 = new File(this.f14814b.getPath().replace(".zip", ""));
                if (file4.exists()) {
                    UtilsMy.delete(file4);
                }
            }
            if (file.exists()) {
                UtilsMy.delete(file);
            }
            v0.c("删除文件结束时间 " + System.currentTimeMillis());
        }
    }

    private boolean a(DownloadTask downloadTask) {
        if (downloadTask.getFileType().equals(Dtype.apk.name())) {
            List<RomArchived> m4 = g0.m(downloadTask.getPlugin_num(), downloadTask.getGameZipPath());
            if (downloadTask.getPlugin_num().equals("31")) {
                boolean z4 = false;
                boolean z5 = false;
                for (RomArchived romArchived : m4) {
                    if (romArchived.getFileName().contains("_v2")) {
                        z4 = true;
                    } else {
                        z5 = true;
                    }
                }
                Iterator<RomArchived> it2 = m4.iterator();
                while (it2.hasNext()) {
                    RomArchived next = it2.next();
                    if (!z5 || z4) {
                        if (z5 && z4) {
                            if (l1.a(downloadTask.getPackageName())) {
                                if (next.getFileName().contains("_v2")) {
                                    it2.remove();
                                }
                            } else if (!next.getFileName().contains("_v2")) {
                                it2.remove();
                            }
                        }
                    } else if (!l1.a(downloadTask.getPackageName())) {
                        it2.remove();
                    }
                }
            }
            if (downloadTask.getPlugin_num().equals("31")) {
                boolean z6 = false;
                boolean z7 = false;
                for (RomArchived romArchived2 : m4) {
                    if (romArchived2.getFileName().contains("_v2")) {
                        z6 = true;
                    } else {
                        z7 = true;
                    }
                }
                Iterator<RomArchived> it3 = m4.iterator();
                while (it3.hasNext()) {
                    RomArchived next2 = it3.next();
                    if (!z7 || z6) {
                        if (z7 && z6) {
                            if (l1.a(downloadTask.getPackageName())) {
                                if (next2.getFileName().contains("_v2")) {
                                    it3.remove();
                                }
                            } else if (!next2.getFileName().contains("_v2")) {
                                it3.remove();
                            }
                        }
                    } else if (!l1.a(downloadTask.getPackageName())) {
                        it3.remove();
                    }
                }
            }
            if (m4 != null && m4.size() > 0) {
                return true;
            }
        }
        return false;
    }

    public static i e() {
        if (f14811e == null) {
            synchronized (i.class) {
                if (f14811e == null) {
                    f14811e = new i();
                }
            }
        }
        return f14811e;
    }

    public void b(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("del removeTask  ");
        sb.append(str);
        d(f14808b.remove(str));
    }

    public void c(Context context, DownloadTask downloadTask) {
        StringBuilder sb = new StringBuilder();
        sb.append("method delTask() called.");
        sb.append(downloadTask.getShowName());
        sb.append(";status=");
        sb.append(downloadTask.getStatus());
        sb.append(";runtimeStatus=");
        sb.append(downloadTask.getRuntimeStatus().get());
        r.b(context, downloadTask, Event.gameRemove);
        try {
            ((com.join.mgps.task.c) f14810d.get(downloadTask.getCrc_link_type_val())).a();
        } catch (Exception unused) {
        }
        f14810d.remove(downloadTask);
        DownloadTask downloadTask2 = f14808b.get(downloadTask.getCrc_link_type_val());
        if (downloadTask2 != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("status=");
            sb2.append(downloadTask2.getStatus());
            sb2.append(";runtimestatus=");
            sb2.append(downloadTask2.getRuntimeStatus().get());
            f14808b.remove(downloadTask2.getCrc_link_type_val());
            if (downloadTask2.getRuntimeStatus().get() == 29) {
                com.join.android.app.common.utils.o.c(downloadTask2);
                d(downloadTask);
                org.greenrobot.eventbus.c.f().o(new com.join.mgps.event.n(downloadTask2, 7));
            } else if (downloadTask2.getStatus() != 9 && downloadTask2.getStatus() != 3 && downloadTask2.getStatus() != 27 && downloadTask2.getRuntimeStatus().get() != 35 && downloadTask2.getRuntimeStatus().get() != 36 && downloadTask2.getRuntimeStatus().get() != 37 && downloadTask2.getRuntimeStatus().get() != 31 && downloadTask2.getStatus() != 5 && downloadTask2.getStatus() != 13 && downloadTask2.getStatus() != 11) {
                downloadTask2.setStatus(7);
                org.greenrobot.eventbus.c.f().o(new com.join.mgps.event.n(downloadTask2, 7));
            } else {
                p1.f.K().delete((p1.f) downloadTask);
                d(downloadTask);
                org.greenrobot.eventbus.c.f().o(new com.join.mgps.event.n(downloadTask2, 7));
            }
        } else {
            p1.f.K().delete((p1.f) downloadTask);
            d(downloadTask);
            downloadTask.setStatus(7);
            org.greenrobot.eventbus.c.f().o(new com.join.mgps.event.n(downloadTask, 7));
        }
        if (a(downloadTask)) {
            Intent intent = new Intent(o1.a.N);
            intent.putExtra("plugNumber", downloadTask.getPlugin_num());
            intent.putExtra("gameZipPath", downloadTask.getGameZipPath());
            intent.putExtra("PackageName", downloadTask.getPackageName());
            intent.putExtra("romType", downloadTask.getRomType());
            intent.putExtra("gameName", downloadTask.getShowName());
            context.sendBroadcast(intent);
        }
    }

    public void d(DownloadTask downloadTask) {
        new b(downloadTask).start();
    }

    public DownloadTask f(String str) {
        return f14808b.get(str);
    }

    public boolean g(DownloadTask downloadTask) {
        DownloadTask downloadTask2 = f14808b.get(downloadTask.getCrc_link_type_val());
        if (downloadTask2 != null) {
            return downloadTask2.getRuntimeStatus().get() == 29 || downloadTask.getRuntimeStatus().get() == 31 || downloadTask.getRuntimeStatus().get() == 36 || downloadTask2.getStatus() == 5 || downloadTask2.getStatus() == 1 || downloadTask2.getRuntimeStatus().get() != 38;
        }
        return false;
    }

    public DownloadTask h(DownloadTask downloadTask) {
        f14808b.remove(downloadTask.getCrc_link_type_val());
        StringBuilder sb = new StringBuilder();
        sb.append("onFinish removeTask  ");
        sb.append(downloadTask.getCrc_link_type_val());
        return downloadTask;
    }

    public void i(DownloadTask downloadTask) {
        f14808b.put(downloadTask.getCrc_link_type_val(), downloadTask);
    }

    public void j() {
        try {
            for (String str : f14808b.keySet()) {
                DownloadTask downloadTask = f14808b.get(str);
                if (downloadTask.getRuntimeStatus().get() != 29 && downloadTask.getStatus() != 10) {
                    downloadTask.setStatus(3);
                    org.greenrobot.eventbus.c.f().o(new com.join.mgps.event.n(downloadTask, 3));
                    StringBuilder sb = new StringBuilder();
                    sb.append("del removeAllTask  ");
                    sb.append(downloadTask.getCrc_link_type_val());
                    f14808b.remove(downloadTask.getCrc_link_type_val());
                }
                com.join.android.app.common.utils.o.d(downloadTask);
                p1.f.K().j0(downloadTask, 3);
                downloadTask.setStatus(3);
                org.greenrobot.eventbus.c.f().o(new com.join.mgps.event.n(downloadTask, 3));
                org.greenrobot.eventbus.c.f().o(new com.join.mgps.event.l(downloadTask.getCrc_link_type_val(), 38));
                StringBuilder sb2 = new StringBuilder();
                sb2.append("del removeAllTask  ");
                sb2.append(downloadTask.getCrc_link_type_val());
                f14808b.remove(downloadTask.getCrc_link_type_val());
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public DownloadTask k(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("removeTask 1 ");
        sb.append(str);
        return f14808b.remove(str);
    }

    public void l(String str) {
        f14810d.remove(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x012e A[Catch: all -> 0x020f, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x003d, B:7:0x005a, B:9:0x0066, B:11:0x0072, B:13:0x0078, B:15:0x007e, B:18:0x008b, B:19:0x0096, B:22:0x00b5, B:24:0x00c3, B:39:0x011a, B:41:0x012e, B:44:0x0137, B:46:0x0140, B:49:0x0152, B:52:0x015f, B:55:0x0167, B:66:0x01be, B:68:0x0206, B:67:0x01e6, B:56:0x0171, B:58:0x017b, B:60:0x0181, B:62:0x019c, B:64:0x01a4, B:51:0x015a, B:25:0x00e5, B:27:0x00ed, B:29:0x00f3, B:36:0x0108), top: B:74:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0137 A[Catch: all -> 0x020f, TRY_ENTER, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x003d, B:7:0x005a, B:9:0x0066, B:11:0x0072, B:13:0x0078, B:15:0x007e, B:18:0x008b, B:19:0x0096, B:22:0x00b5, B:24:0x00c3, B:39:0x011a, B:41:0x012e, B:44:0x0137, B:46:0x0140, B:49:0x0152, B:52:0x015f, B:55:0x0167, B:66:0x01be, B:68:0x0206, B:67:0x01e6, B:56:0x0171, B:58:0x017b, B:60:0x0181, B:62:0x019c, B:64:0x01a4, B:51:0x015a, B:25:0x00e5, B:27:0x00ed, B:29:0x00f3, B:36:0x0108), top: B:74:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized void m(android.content.Context r8, com.github.snowdream.android.app.downloader.DownloadTask r9, boolean r10) {
        /*
            Method dump skipped, instructions count: 530
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.android.app.common.servcie.i.m(android.content.Context, com.github.snowdream.android.app.downloader.DownloadTask, boolean):void");
    }

    public void n(DownloadTask downloadTask) {
        DownloadTask f5 = f(downloadTask.getCrc_link_type_val());
        if (f5 == null) {
            downloadTask.setStatus(3);
            org.greenrobot.eventbus.c.f().o(new com.join.mgps.event.n(downloadTask, 3));
        }
        if (f5 == null || f5.getStatus() == 5 || f5.getRuntimeStatus().get() == 31 || f5.getStatus() == 7 || f5.getStatus() == 12 || f5.getStatus() == 13 || f5.getRuntimeStatus().get() == 35 || f5.getStatus() == 3) {
            return;
        }
        if (f5.getRuntimeStatus().get() != 29 && f5.getStatus() != 10) {
            f5.setStatus(27);
            org.greenrobot.eventbus.c.f().o(new com.join.mgps.event.n(f5, 27));
            new a(f5).sendEmptyMessageDelayed(1, 200L);
            return;
        }
        com.join.android.app.common.utils.o.d(f5);
        p1.f.K().j0(f5, 3);
        f5.setStatus(3);
        org.greenrobot.eventbus.c.f().o(new com.join.mgps.event.n(f5, 3));
        org.greenrobot.eventbus.c.f().o(new com.join.mgps.event.l(f5.getCrc_link_type_val(), 38));
    }

    public void o(DownloadTask downloadTask) {
        f14810d.remove(downloadTask.getCrc_link_type_val());
        downloadTask.setStatus(13);
        if (downloadTask.getSize() >= v.f28103c) {
            downloadTask.setProgress(1L);
            p1.f.K().k0(downloadTask, 13, 1L);
        } else {
            downloadTask.setProgress(100L);
            p1.f.K().k0(downloadTask, 13, 100L);
        }
        DownloadTask f5 = f(downloadTask.getCrc_link_type_val());
        if (f5 != null) {
            f5.setStatus(downloadTask.getStatus());
            f5.setProgress(downloadTask.getProgress());
        } else {
            f14808b.put(downloadTask.getCrc_link_type_val(), downloadTask);
        }
        v0.d("unzipfailedxx", "send failed");
        org.greenrobot.eventbus.c.f().o(new com.join.mgps.event.l(downloadTask.getCrc_link_type_val(), 46));
        org.greenrobot.eventbus.c.f().o(new com.join.mgps.event.n(downloadTask, 13));
        org.greenrobot.eventbus.c.f().o(new com.join.mgps.event.l(downloadTask.getCrc_link_type_val(), 38));
    }

    public void p(DownloadTask downloadTask) {
        f14810d.remove(downloadTask.getCrc_link_type_val());
        downloadTask.setStatus(13);
        if (downloadTask.getSize() >= v.f28103c) {
            downloadTask.setProgress(1L);
            p1.f.K().k0(downloadTask, 13, 1L);
        } else {
            downloadTask.setProgress(100L);
            p1.f.K().k0(downloadTask, 13, 100L);
        }
        DownloadTask f5 = f(downloadTask.getCrc_link_type_val());
        if (f5 != null) {
            f5.setStatus(downloadTask.getStatus());
            f5.setProgress(downloadTask.getProgress());
        } else {
            f14808b.put(downloadTask.getCrc_link_type_val(), downloadTask);
        }
        v0.d("unzipfailedxx", "send failed");
        org.greenrobot.eventbus.c.f().o(new com.join.mgps.event.n(downloadTask, 13));
        org.greenrobot.eventbus.c.f().o(new com.join.mgps.event.l(downloadTask.getCrc_link_type_val(), 38));
    }

    public void q(Context context, DownloadTask downloadTask) {
        if (downloadTask.getSize() >= v.f28103c) {
            downloadTask.setProgress(1L);
            p1.f.K().k0(downloadTask, 12, 1L);
        } else {
            downloadTask.setProgress(100L);
            p1.f.K().k0(downloadTask, 12, 100L);
        }
        DownloadTask f5 = e().f(downloadTask.getCrc_link_type_val());
        if (f5 != null) {
            f5.setStatus(12);
            f5.setProgress(downloadTask.getProgress());
            f5.setVer(downloadTask.getVer());
            f5.setVer_name(downloadTask.getVer_name());
        } else {
            f14808b.put(downloadTask.getCrc_link_type_val(), downloadTask);
            f5 = downloadTask;
        }
        f5.setStatus(12);
        f5.setRuntimeStatus(new AtomicInteger(36));
        org.greenrobot.eventbus.c.f().o(new com.join.mgps.event.n(f5, 12));
        com.join.mgps.task.c cVar = (com.join.mgps.task.c) f14810d.get(f5.getCrc_link_type_val());
        if (cVar == null || !cVar.isRunning()) {
            if (ConstantIntEnum.PS2.value() != Integer.parseInt(downloadTask.getPlugin_num()) && ConstantIntEnum.N3DS.value() != Integer.parseInt(downloadTask.getPlugin_num())) {
                com.join.mgps.task.g gVar = new com.join.mgps.task.g(f5, context);
                if (f5.getSize() <= v.f28103c) {
                    File file = new File(downloadTask.getPath());
                    EMUApkTable n4 = b2.o.o().n(downloadTask.getPlugin_num());
                    ApkVersionRemarkBean apkVersionRemarkBean = (ApkVersionRemarkBean) JsonMapper.getInstance().fromJson(n4.getRemark(), ApkVersionRemarkBean.class);
                    if (!file.exists()) {
                        o(downloadTask);
                        MobclickAgent.onEvent(context, "onZIPMd5Failed", String.format("%s_%s", n4.getTag_id(), ""));
                        return;
                    }
                    f14810d.put(f5.getCrc_link_type_val(), gVar);
                    gVar.start();
                    return;
                }
                f14810d.put(f5.getCrc_link_type_val(), gVar);
                f14809c.execute(gVar);
            } else if (ContextCompat.checkSelfPermission(context, com.kuaishou.weapon.p0.g.f55590j) != 0) {
                Intent intent = new Intent(o1.a.f72015n0);
                intent.putExtra("gameId", downloadTask.getCrc_link_type_val());
                context.sendBroadcast(intent);
            } else {
                String h4 = com.join.mgps.pref.h.n(context).h();
                if (g2.h(h4)) {
                    UtilsMy.V2(new PrefDef_(context), context, true);
                    h4 = com.join.mgps.pref.h.n(context).h();
                }
                String str = h4 + f5.getPlugin_num();
                try {
                    File file2 = new File(str);
                    if (!file2.exists()) {
                        file2.mkdirs();
                    }
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
                com.join.mgps.task.f fVar = new com.join.mgps.task.f(f5, context, str);
                if (f5.getSize() <= v.f28103c) {
                    File file3 = new File(downloadTask.getPath());
                    EMUApkTable n5 = b2.o.o().n(downloadTask.getPlugin_num());
                    if (!file3.exists()) {
                        o(downloadTask);
                        MobclickAgent.onEvent(context, "onZIPMd5Failed", String.format("%s_%s", n5.getTag_id(), ""));
                        return;
                    }
                    f14810d.put(f5.getCrc_link_type_val(), fVar);
                    fVar.start();
                    return;
                }
                f14810d.put(f5.getCrc_link_type_val(), fVar);
                f14809c.execute(fVar);
            }
        }
    }

    public void r(Context context, DownloadTask downloadTask, boolean z4) {
        if (downloadTask.getSize() >= v.f28103c) {
            downloadTask.setProgress(1L);
            p1.f.K().k0(downloadTask, 12, 1L);
        } else {
            downloadTask.setProgress(100L);
            p1.f.K().k0(downloadTask, 12, 100L);
        }
        DownloadTask f5 = e().f(downloadTask.getCrc_link_type_val());
        if (f5 != null) {
            f5.setStatus(12);
            f5.setProgress(downloadTask.getProgress());
        } else {
            f14808b.put(downloadTask.getCrc_link_type_val(), downloadTask);
            f5 = downloadTask;
        }
        f5.setStatus(12);
        f5.setRuntimeStatus(new AtomicInteger(36));
        org.greenrobot.eventbus.c.f().o(new com.join.mgps.event.n(f5, 12));
        if (z4) {
            int parseInt = Integer.parseInt(f5.getPlugin_num());
            if ((Build.VERSION.SDK_INT <= 29 || (parseInt != ConstantIntEnum.DC.value() && parseInt != ConstantIntEnum.N64.value() && parseInt != ConstantIntEnum.NDS.value() && parseInt != ConstantIntEnum.ONS.value() && parseInt != ConstantIntEnum.VA32.value() && parseInt != ConstantIntEnum.VA64.value())) && parseInt != ConstantIntEnum.PS2.value() && parseInt != ConstantIntEnum.N3DS.value()) {
                com.join.mgps.task.c cVar = (com.join.mgps.task.c) f14810d.get(f5.getCrc_link_type_val());
                if (cVar == null || !cVar.isRunning()) {
                    com.join.mgps.task.h hVar = new com.join.mgps.task.h(f5, context);
                    if (f5.getSize() <= v.f28103c) {
                        hVar.start();
                        return;
                    }
                    f14810d.put(f5.getCrc_link_type_val(), hVar);
                    f14809c.execute(hVar);
                }
            } else if (ContextCompat.checkSelfPermission(context, com.kuaishou.weapon.p0.g.f55590j) != 0) {
                p(downloadTask);
                Intent intent = new Intent(o1.a.f72015n0);
                intent.putExtra("gameId", downloadTask.getCrc_link_type_val());
                context.sendBroadcast(intent);
            } else {
                com.join.mgps.task.c cVar2 = (com.join.mgps.task.c) f14810d.get(f5.getCrc_link_type_val());
                if (cVar2 == null || !cVar2.isRunning()) {
                    String h4 = com.join.mgps.pref.h.n(context).h();
                    if (g2.h(h4)) {
                        UtilsMy.V2(new PrefDef_(context), context, parseInt == ConstantIntEnum.PS2.value() || parseInt == ConstantIntEnum.N3DS.value());
                        h4 = com.join.mgps.pref.h.n(context).h();
                    }
                    String str = h4 + f5.getPlugin_num();
                    try {
                        File file = new File(str);
                        if (!file.exists()) {
                            file.mkdirs();
                        }
                    } catch (Exception e5) {
                        e5.printStackTrace();
                    }
                    Runnable hVar2 = new com.join.mgps.task.h(f5, context, str);
                    if (TextUtils.equals(f5.getCrc_link_type_val(), String.valueOf(ConstantIntEnum.PS2.value())) || TextUtils.equals(f5.getCrc_link_type_val(), String.valueOf(ConstantIntEnum.N3DS.value()))) {
                        hVar2 = new com.join.mgps.task.f(f5, context, str);
                    }
                    if (f5.getSize() <= v.f28103c) {
                        if (hVar2 instanceof com.join.mgps.task.f) {
                            ((com.join.mgps.task.f) hVar2).start();
                            return;
                        } else {
                            ((com.join.mgps.task.h) hVar2).start();
                            return;
                        }
                    }
                    f14810d.put(f5.getCrc_link_type_val(), hVar2);
                    f14809c.execute(hVar2);
                }
            }
        } else if (ContextCompat.checkSelfPermission(context, com.kuaishou.weapon.p0.g.f55590j) != 0) {
            p(downloadTask);
            Intent intent2 = new Intent(o1.a.f72015n0);
            intent2.putExtra("gameId", downloadTask.getCrc_link_type_val());
            context.sendBroadcast(intent2);
        } else {
            com.join.mgps.task.c cVar3 = (com.join.mgps.task.c) f14810d.get(downloadTask.getCrc_link_type_val());
            if (cVar3 == null || !cVar3.isRunning()) {
                com.join.mgps.task.e eVar = new com.join.mgps.task.e(f5, context);
                if (downloadTask.getSize() <= v.f28103c) {
                    eVar.start();
                    return;
                }
                f14810d.put(f5.getCrc_link_type_val(), eVar);
                f14809c.execute(eVar);
            }
        }
    }
}
