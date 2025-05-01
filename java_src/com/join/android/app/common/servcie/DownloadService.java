package com.join.android.app.common.servcie;

import android.app.ActivityManager;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.text.TextUtils;
import com.MApplication;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.android.app.common.utils.APKUtils;
import com.join.android.app.common.utils.JsonMapper;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.RequestBeanUtil;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.Util.d0;
import com.join.mgps.Util.g2;
import com.join.mgps.Util.l2;
import com.join.mgps.Util.q1;
import com.join.mgps.Util.v0;
import com.join.mgps.activity.ModGameIndexActivity;
import com.join.mgps.activity.PapaPlugGuideActivity_;
import com.join.mgps.activity.mygame.dialog.UnzipFailedDialog_;
import com.join.mgps.db.tables.DownloadHistoryTable;
import com.join.mgps.dto.BootPageData;
import com.join.mgps.dto.DetailResultBean;
import com.join.mgps.dto.DownloadScanEvent;
import com.join.mgps.dto.ExtBean;
import com.join.mgps.dto.HomeViewSwich;
import com.join.mgps.dto.ModInfoBean;
import com.join.mgps.dto.ResultMainBean;
import com.join.mgps.enums.Dtype;
import com.join.mgps.pref.PrefDef_;
import com.join.mgps.receiver.BootReceiver_;
import com.papa.sim.statistic.Event;
import com.wufan.user.service.protobuf.n0;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.EService;
import org.androidannotations.annotations.Receiver;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.sharedpreferences.Pref;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
@EService
/* loaded from: classes.dex */
public class DownloadService extends Service {

    /* renamed from: i  reason: collision with root package name */
    private static final String f14755i = "DownloadService";

    /* renamed from: j  reason: collision with root package name */
    private static boolean f14756j;

    /* renamed from: k  reason: collision with root package name */
    private static Context f14757k;

    /* renamed from: l  reason: collision with root package name */
    private static ScheduledExecutorService f14758l = Executors.newScheduledThreadPool(1);

    /* renamed from: m  reason: collision with root package name */
    private static Handler f14759m = new a();

    /* renamed from: n  reason: collision with root package name */
    static ScheduledFuture f14760n;

    /* renamed from: b  reason: collision with root package name */
    com.join.mgps.rpc.e f14761b;
    @Pref

    /* renamed from: c  reason: collision with root package name */
    PrefDef_ f14762c;

    /* renamed from: e  reason: collision with root package name */
    BootReceiver_ f14764e;

    /* renamed from: d  reason: collision with root package name */
    HashMap<String, DownloadTask> f14763d = new HashMap<>();

    /* renamed from: f  reason: collision with root package name */
    boolean f14765f = false;

    /* renamed from: g  reason: collision with root package name */
    private int f14766g = 1000;

    /* renamed from: h  reason: collision with root package name */
    private long f14767h = 0;

    /* loaded from: classes3.dex */
    class a extends Handler {
        a() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what == 0) {
                DownloadService.O();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.join.android.app.common.utils.j.l()) {
                DownloadService.L();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.join.android.app.common.utils.j.k(DownloadService.f14757k)) {
                if (com.join.android.app.common.utils.j.l()) {
                    DownloadService.f14759m.sendEmptyMessage(0);
                    DownloadService.f14760n.cancel(true);
                    return;
                }
                return;
            }
            DownloadService.f14760n.cancel(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Unit A(DownloadTask downloadTask, String str) {
        if (q1.c(f14757k, downloadTask)) {
            return null;
        }
        com.join.android.app.common.utils.e.l0(f14757k).x(this, str);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Unit B(String str) {
        com.join.android.app.common.utils.e.l0(f14757k).x(this, str);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Unit C(String str) {
        com.join.android.app.common.utils.e.l0(f14757k).x(this, str);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Unit D(DownloadTask downloadTask, String str) {
        com.join.android.app.common.utils.e.l0(this).x(this, downloadTask.getGameZipPath());
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static synchronized void L() {
        synchronized (DownloadService.class) {
            if (f14756j) {
                return;
            }
            f14756j = true;
            List<DownloadTask> e02 = p1.f.K().e0();
            if (e02 != null && e02.size() != 0) {
                for (DownloadTask downloadTask : e02) {
                    try {
                        downloadTask.setDownType(UtilsMy.r0(f14757k, downloadTask));
                        HomeViewSwich homeViewSwich = MApplication.R;
                        if (homeViewSwich != null) {
                            downloadTask.setDownLimit(Integer.parseInt(homeViewSwich.getDown_load_speed_limit().getCfg_values_express()));
                        } else {
                            downloadTask.setDownLimit(300);
                        }
                    } catch (Exception e5) {
                        e5.printStackTrace();
                    }
                    DownloadTask f5 = i.e().f(downloadTask.getCrc_link_type_val());
                    if (f5 != null) {
                        try {
                            if (f5.getStatus() != 12 && f5.getStatus() != 13) {
                                f5.setMobleNetNeedStop(0);
                            }
                        } catch (Exception e6) {
                            e6.printStackTrace();
                        }
                    }
                    downloadTask.setStatus(0);
                    p1.f.K().update(downloadTask);
                    q(downloadTask, false);
                }
                f14756j = false;
                return;
            }
            f14756j = false;
        }
    }

    private synchronized void N() {
        try {
            boolean booleanValue = this.f14762c.isOnlyWifiReconnect().e(Boolean.TRUE).booleanValue();
            List<DownloadTask> f02 = p1.f.K().f0();
            if (f02 != null && f02.size() > 0) {
                for (final DownloadTask downloadTask : f02) {
                    try {
                        downloadTask.setDownType(UtilsMy.r0(f14757k, downloadTask));
                        HomeViewSwich homeViewSwich = MApplication.R;
                        if (homeViewSwich != null) {
                            downloadTask.setDownLimit(Integer.parseInt(homeViewSwich.getDown_load_speed_limit().getCfg_values_express()));
                        } else {
                            downloadTask.setDownLimit(300);
                        }
                    } catch (Exception e5) {
                        e5.printStackTrace();
                    }
                    if (booleanValue) {
                        Context context = f14757k;
                        if (context != null) {
                            if (com.join.android.app.common.utils.j.k(context)) {
                                if (downloadTask.getStatus() == 2 || downloadTask.getStatus() == 6 || downloadTask.getStatus() == 10 || downloadTask.getStatus() == 1) {
                                    downloadTask.setStatus(0);
                                    p1.f.K().update(downloadTask);
                                    q(downloadTask, false);
                                }
                            } else {
                                downloadTask.setStatus(6);
                                p1.f.K().update(downloadTask);
                                com.php25.PDownload.d.i(downloadTask);
                            }
                        }
                    } else if (downloadTask.getStatus() == 2 || downloadTask.getStatus() == 6 || downloadTask.getStatus() == 10 || downloadTask.getStatus() == 0 || downloadTask.getStatus() == 1) {
                        downloadTask.setStatus(0);
                        p1.f.K().update(downloadTask);
                        q(downloadTask, false);
                    }
                    if (downloadTask.getStatus() == 12 || downloadTask.getStatus() == 13) {
                        if (downloadTask.getFileType() != null && downloadTask.getFileType().equals(Dtype.apk.name())) {
                            i.e().r(f14757k, downloadTask, true);
                        } else {
                            i.e().r(f14757k, downloadTask, false);
                        }
                    }
                    if (downloadTask.getStatus() == 48) {
                        if (!g2.i(downloadTask.getGameZipPath()) && !g2.i(downloadTask.getPath())) {
                            p1.f.K().n(downloadTask.getCrc_link_type_val());
                        }
                        if (g2.h(downloadTask.getGameZipPath())) {
                            downloadTask.setGameZipPath(downloadTask.getPath());
                        }
                        APKUtils.k0(downloadTask.getGameZipPath(), downloadTask, new Function1() { // from class: com.join.android.app.common.servcie.o
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                Unit D;
                                D = DownloadService.this.D(downloadTask, (String) obj);
                                return D;
                            }
                        });
                    }
                }
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static synchronized void O() {
        synchronized (DownloadService.class) {
            if (!com.join.android.app.common.utils.j.k(f14757k)) {
                f14756j = false;
            } else if (!f14756j) {
                f14756j = true;
                List<DownloadTask> e02 = p1.f.K().e0();
                if (e02 != null && e02.size() != 0) {
                    for (DownloadTask downloadTask : e02) {
                        try {
                            downloadTask.setDownType(UtilsMy.r0(f14757k, downloadTask));
                            HomeViewSwich homeViewSwich = MApplication.R;
                            if (homeViewSwich != null) {
                                downloadTask.setDownLimit(Integer.parseInt(homeViewSwich.getDown_load_speed_limit().getCfg_values_express()));
                            } else {
                                downloadTask.setDownLimit(300);
                            }
                        } catch (Exception e5) {
                            e5.printStackTrace();
                        }
                        DownloadTask f5 = i.e().f(downloadTask.getCrc_link_type_val());
                        if (f5 != null) {
                            try {
                                if (f5.getStatus() != 12 && f5.getStatus() != 13) {
                                    f5.setMobleNetNeedStop(0);
                                }
                            } catch (Exception e6) {
                                e6.printStackTrace();
                            }
                        }
                        downloadTask.setStatus(0);
                        p1.f.K().update(downloadTask);
                        q(downloadTask, false);
                    }
                    f14756j = false;
                    return;
                }
                f14756j = false;
            }
        }
    }

    private synchronized void P() {
        if (com.join.android.app.common.utils.j.k(f14757k)) {
            if (f14760n != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("scheduler status:: isDone =");
                sb.append(f14760n.isDone());
                sb.append(";furture.isCancelled=");
                sb.append(f14760n.isCancelled());
            }
            ScheduledFuture scheduledFuture = f14760n;
            if (scheduledFuture == null || scheduledFuture.isDone() || f14760n.isCancelled()) {
                f14760n = f14758l.scheduleWithFixedDelay(new c(), 5L, 10L, TimeUnit.SECONDS);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void Q(java.lang.String r17, java.lang.String r18, java.lang.String r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 347
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.android.app.common.servcie.DownloadService.Q(java.lang.String, java.lang.String, java.lang.String, boolean):void");
    }

    public static void T(DownloadTask downloadTask) {
        DownloadTask f5;
        if (downloadTask == null || (f5 = i.e().f(downloadTask.getCrc_link_type_val())) == null) {
            return;
        }
        f5.setProgress(downloadTask.getProgress());
        org.greenrobot.eventbus.c.f().o(new com.join.mgps.event.n(downloadTask, 8));
    }

    private static synchronized void q(DownloadTask downloadTask, boolean z4) {
        synchronized (DownloadService.class) {
            r(downloadTask, z4);
        }
    }

    private static synchronized void r(DownloadTask downloadTask, boolean z4) {
        synchronized (DownloadService.class) {
            StringBuilder sb = new StringBuilder();
            sb.append("method downloadStart called.");
            sb.append(downloadTask.getName());
            sb.append(";url=");
            sb.append(downloadTask.getUrl());
            if (!g2.h(downloadTask.getUrl()) && r.a(f14757k, downloadTask)) {
                i.e().m(f14757k, downloadTask, z4);
            }
        }
    }

    private boolean u() {
        String packageName = getApplicationContext().getPackageName();
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) getApplicationContext().getSystemService(TTDownloadField.TT_ACTIVITY)).getRunningAppProcesses();
        if (runningAppProcesses == null) {
            return false;
        }
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.processName.equals(packageName) && runningAppProcessInfo.importance == 100) {
                return true;
            }
        }
        return false;
    }

    private boolean v(DownloadTask downloadTask) {
        ModInfoBean modInfoBean = g2.i(downloadTask.getMod_info()) ? (ModInfoBean) JsonMapper.getInstance().fromJson(downloadTask.getMod_info(), ModInfoBean.class) : null;
        return modInfoBean != null && downloadTask.getCrc_link_type_val().equals(modInfoBean.getMain_game_id());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Unit w(String str, String str2) {
        com.join.android.app.common.utils.e.l0(f14757k).x(f14757k, str);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Unit x(String str) {
        com.join.android.app.common.utils.e.l0(f14757k).x(f14757k, str);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Unit y(String str) {
        com.join.android.app.common.utils.e.l0(f14757k).x(this, str);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Unit z(DownloadTask downloadTask, String str) {
        if (q1.c(f14757k, downloadTask)) {
            return null;
        }
        com.join.android.app.common.utils.e.l0(f14757k).x(this, str);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    @Receiver(actions = {"android.net.wifi.WIFI_STATE_CHANGED", "android.net.wifi.STATE_CHANGE", "android.net.conn.CONNECTIVITY_CHANGE", "android.net.wifi.SCAN_RESULTS"})
    public void E(Intent intent) {
        try {
            String action = intent.getAction();
            if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action) || action.equals("android.net.wifi.STATE_CHANGE") || action.equals("android.net.conn.CONNECTIVITY_CHANGE")) {
                boolean j4 = com.join.android.app.common.utils.j.j(f14757k);
                StringBuilder sb = new StringBuilder();
                sb.append("网络状态：");
                sb.append(j4);
                if (com.join.android.app.common.utils.j.k(f14757k)) {
                    if (!this.f14762c.isFightActivity().d().booleanValue()) {
                        this.f14762c.isWifiConnectedBefore().g(Boolean.TRUE);
                    }
                    this.f14765f = true;
                } else {
                    if (!this.f14762c.isFightActivity().d().booleanValue()) {
                        this.f14762c.isWifiConnectedBefore().g(Boolean.FALSE);
                    }
                    this.f14765f = false;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("wifi状态：");
                sb2.append(com.join.android.app.common.utils.j.k(f14757k));
                StringBuilder sb3 = new StringBuilder();
                sb3.append("移动网络状态：");
                sb3.append(com.join.android.app.common.utils.j.i(f14757k));
                StringBuilder sb4 = new StringBuilder();
                sb4.append("网络连接类型：");
                sb4.append(com.join.android.app.common.utils.j.c(f14757k));
                P();
                f14758l.execute(new b());
            }
            if (action.equals("android.net.wifi.SCAN_RESULTS")) {
                if (this.f14762c.isFightActivity().d().booleanValue()) {
                    return;
                }
                this.f14762c.isWifiConnectedBefore().g(Boolean.TRUE);
            } else if (action.equals("android.net.wifi.WIFI_STATE_CHANGED")) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append("android.net.wifi.WIFI_STATE_CHANGED | ");
                sb5.append(intent.getIntExtra("wifi_state", -1));
                sb5.append(" | ");
                sb5.append(intent.getIntExtra("previous_wifi_state", -1));
                if (this.f14762c.isFightActivity().d().booleanValue()) {
                    return;
                }
                if (intent.getIntExtra("wifi_state", -1) == 0 || intent.getIntExtra("wifi_state", -1) == 1) {
                    this.f14762c.isWifiConnectedBefore().g(Boolean.FALSE);
                }
            } else if (!action.equals("android.net.wifi.STATE_CHANGE") || this.f14762c.isFightActivity().d().booleanValue()) {
            } else {
                this.f14762c.isWifiConnectedBefore().g(Boolean.TRUE);
            }
        } catch (Exception unused) {
        }
    }

    public void F(DownloadTask downloadTask) {
        if (downloadTask == null) {
            return;
        }
        p1.f.K().delete((p1.f) downloadTask);
        i.e().b(downloadTask.getCrc_link_type_val());
        org.greenrobot.eventbus.c.f().o(new com.join.mgps.event.n(downloadTask, 7));
        org.greenrobot.eventbus.c.f().o(new com.join.mgps.event.l(downloadTask.getCrc_link_type_val(), 38));
    }

    public void G(DownloadTask downloadTask) {
        UtilsMy.p2(f14757k, downloadTask, true);
        p1.f.K().j0(downloadTask, 6);
        downloadTask.setStatus(6);
        org.greenrobot.eventbus.c.f().o(new com.join.mgps.event.n(downloadTask, 6));
        org.greenrobot.eventbus.c.f().o(new com.join.mgps.event.l(downloadTask.getCrc_link_type_val(), 38));
        P();
    }

    public void H(final DownloadTask downloadTask) {
        ExtBean extBean;
        ExtBean extBean2;
        ExtBean extBean3;
        ExtBean extBean4;
        v0.c(" permissxx   onfinish");
        downloadTask.setDuration(downloadTask.getSize() / downloadTask.getDuration());
        downloadTask.setCurrentSize((long) (Double.parseDouble(downloadTask.getShowSize()) * 1024.0d * 1024.0d));
        boolean f5 = q1.f(downloadTask.getPackageName());
        boolean z4 = false;
        if (downloadTask.getFileType() != null && downloadTask.getFileType().equals(Dtype.chajian.name())) {
            r.b(f14757k, downloadTask, Event.downloadPlugCompleted);
            String path = downloadTask.getPath();
            downloadTask.setGameZipPath(path);
            downloadTask.setStatus(11);
            try {
                downloadTask.setId(p1.f.K().F(downloadTask.getCrc_link_type_val()).getId());
                p1.f.K().m(downloadTask);
            } catch (Exception e5) {
                e5.printStackTrace();
            }
            i.e().k(downloadTask.getCrc_link_type_val());
            org.greenrobot.eventbus.c.f().o(new com.join.mgps.event.n(downloadTask, 11));
            int intValue = this.f14762c.insatllAppFirst().d().intValue();
            String d5 = this.f14762c.insatllAppFirstData().d();
            if (intValue > 0 && g2.i(d5) && u()) {
                BootPageData bootPageData = (BootPageData) JsonMapper.getInstance().fromJson(d5, BootPageData.class);
                if (bootPageData != null && bootPageData.getGame_setup_boot() != null && downloadTask.getDown_type() == 0) {
                    ((PapaPlugGuideActivity_.c) PapaPlugGuideActivity_.k0(f14757k).a(1).flags(268435456)).b(downloadTask.getCrc_link_type_val()).start();
                    this.f14762c.insatllAppFirst().g(Integer.valueOf(intValue - 1));
                } else if (downloadTask.getDown_type() == 2) {
                    if (com.join.android.app.common.utils.l.r(f14757k, downloadTask, false, new String[0])) {
                        return;
                    }
                    i.e().q(f14757k, downloadTask);
                } else {
                    APKUtils.k0(path, downloadTask, new Function1() { // from class: com.join.android.app.common.servcie.q
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            Unit x4;
                            x4 = DownloadService.x((String) obj);
                            return x4;
                        }
                    });
                }
            } else if (downloadTask.getDown_type() == 2) {
                if (com.join.android.app.common.utils.l.r(f14757k, downloadTask, false, new String[0])) {
                    return;
                }
                i.e().q(f14757k, downloadTask);
            } else {
                APKUtils.k0(path, downloadTask, new Function1() { // from class: com.join.android.app.common.servcie.l
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit y2;
                        y2 = DownloadService.this.y((String) obj);
                        return y2;
                    }
                });
            }
        } else if (downloadTask.getFileType() != null && downloadTask.getFileType().equals(Dtype.apk.name())) {
            if (!f5) {
                r.b(f14757k, downloadTask, Event.gameDownloadCompleted);
            }
            i.e().r(f14757k, downloadTask, true);
        } else {
            String str = "";
            if (downloadTask.getFileType() != null && downloadTask.getFileType().equals(Dtype.android.name()) && !APKUtils.L(downloadTask)) {
                if (Build.VERSION.SDK_INT < 30 && (downloadTask.getRomType().equals(Dtype.androidobb.name()) || downloadTask.getRomType().equals(Dtype.androiddata.name()) || downloadTask.getRomType().equals(Dtype.androidobbdata.name()))) {
                    r.b(f14757k, downloadTask, Event.gameDownloadCompleted);
                    i.e().r(f14757k, downloadTask, false);
                    return;
                }
                if (f5) {
                    String ext = downloadTask.getExt();
                    if (g2.i(ext) && (extBean4 = (ExtBean) JsonMapper.getInstance().fromJson(ext, ExtBean.class)) != null) {
                        str = extBean4.getQkPosition();
                    }
                    q1.t(this, Event.installSuccessQk, downloadTask.getCrc_link_type_val(), str);
                } else {
                    r.b(f14757k, downloadTask, Event.gameDownloadCompleted);
                    r.b(f14757k, downloadTask, Event.gameDownload);
                }
                String ext2 = downloadTask.getExt();
                if (g2.i(ext2) && (extBean3 = (ExtBean) JsonMapper.getInstance().fromJson(ext2, ExtBean.class)) != null) {
                    String recPosition = extBean3.getRecPosition();
                    if (g2.i(recPosition)) {
                        Q(recPosition, downloadTask.getCrc_link_type_val(), extBean3.getVolcanoOther(), UtilsMy.k2(downloadTask.getTipBeans()));
                    }
                }
                String path2 = downloadTask.getPath();
                downloadTask.setGameZipPath(path2);
                downloadTask.setStatus(11);
                try {
                    downloadTask.setId(p1.f.K().F(downloadTask.getCrc_link_type_val()).getId());
                    p1.f.K().m(downloadTask);
                } catch (Exception e6) {
                    e6.printStackTrace();
                }
                int intValue2 = this.f14762c.insatllAppFirst().d().intValue();
                String d6 = this.f14762c.insatllAppFirstData().d();
                if (intValue2 > 0 && g2.i(d6) && u()) {
                    BootPageData bootPageData2 = (BootPageData) JsonMapper.getInstance().fromJson(d6, BootPageData.class);
                    if (bootPageData2 != null && bootPageData2.getGame_setup_boot() != null) {
                        ((PapaPlugGuideActivity_.c) PapaPlugGuideActivity_.k0(f14757k).a(1).flags(268435456)).b(downloadTask.getCrc_link_type_val()).start();
                        this.f14762c.insatllAppFirst().g(Integer.valueOf(intValue2 - 1));
                    } else {
                        APKUtils.k0(path2, downloadTask, new Function1() { // from class: com.join.android.app.common.servcie.n
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                Unit z5;
                                z5 = DownloadService.this.z(downloadTask, (String) obj);
                                return z5;
                            }
                        });
                    }
                } else {
                    APKUtils.k0(path2, downloadTask, new Function1() { // from class: com.join.android.app.common.servcie.m
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            Unit A;
                            A = DownloadService.this.A(downloadTask, (String) obj);
                            return A;
                        }
                    });
                }
                downloadTask.setGameZipPath(path2);
                downloadTask.setStatus(11);
                UtilsMy.G3(f14757k, downloadTask, 11);
                try {
                    downloadTask.setId(p1.f.K().F(downloadTask.getCrc_link_type_val()).getId());
                    p1.f.K().update(downloadTask);
                } catch (Exception e7) {
                    e7.printStackTrace();
                }
                i.e().k(downloadTask.getCrc_link_type_val());
                org.greenrobot.eventbus.c.f().o(new com.join.mgps.event.n(downloadTask, 11));
            } else if ((downloadTask.getFileType() == null || !Dtype.MOD.name().equals(downloadTask.getFileType())) && !APKUtils.L(downloadTask)) {
            } else {
                if ((downloadTask.getTask_down_type() != 0 && downloadTask.getTask_down_type() != 2) || (!downloadTask.getRomType().equals(Dtype.androidobb.name()) && !downloadTask.getRomType().equals(Dtype.androiddata.name()) && !downloadTask.getRomType().equals(Dtype.androidobbdata.name()))) {
                    if (f5) {
                        String ext3 = downloadTask.getExt();
                        if (g2.i(ext3) && (extBean2 = (ExtBean) JsonMapper.getInstance().fromJson(ext3, ExtBean.class)) != null) {
                            str = extBean2.getQkPosition();
                        }
                        q1.t(this, Event.installSuccessQk, downloadTask.getCrc_link_type_val(), str);
                    } else {
                        r.b(f14757k, downloadTask, Event.gameDownloadCompleted);
                        r.b(f14757k, downloadTask, Event.gameDownload);
                    }
                    String ext4 = downloadTask.getExt();
                    if (g2.i(ext4) && (extBean = (ExtBean) JsonMapper.getInstance().fromJson(ext4, ExtBean.class)) != null) {
                        String recPosition2 = extBean.getRecPosition();
                        if (g2.i(recPosition2)) {
                            Q(recPosition2, downloadTask.getCrc_link_type_val(), extBean.getVolcanoOther(), UtilsMy.k2(downloadTask.getTipBeans()));
                        }
                    }
                    if (downloadTask.getTask_down_type() != 0 && downloadTask.getTask_down_type() != 2) {
                        com.join.android.app.common.utils.e.l0(f14757k);
                        APKUtils.C(this, downloadTask);
                    } else {
                        String path3 = downloadTask.getPath();
                        downloadTask.setGameZipPath(path3);
                        z4 = (APKUtils.G(downloadTask) || f5) ? true : true;
                        if (z4) {
                            downloadTask.setStatus(48);
                        } else {
                            downloadTask.setStatus(11);
                        }
                        try {
                            downloadTask.setId(p1.f.K().F(downloadTask.getCrc_link_type_val()).getId());
                            p1.f.K().m(downloadTask);
                        } catch (Exception e8) {
                            e8.printStackTrace();
                        }
                        int intValue3 = this.f14762c.insatllAppFirst().d().intValue();
                        String d7 = this.f14762c.insatllAppFirstData().d();
                        if (intValue3 > 0 && g2.i(d7) && u()) {
                            BootPageData bootPageData3 = (BootPageData) JsonMapper.getInstance().fromJson(d7, BootPageData.class);
                            if (bootPageData3 != null && bootPageData3.getGame_setup_boot() != null && !z4) {
                                ((PapaPlugGuideActivity_.c) PapaPlugGuideActivity_.k0(f14757k).a(1).flags(268435456)).b(downloadTask.getCrc_link_type_val()).start();
                                this.f14762c.insatllAppFirst().g(Integer.valueOf(intValue3 - 1));
                            } else {
                                APKUtils.k0(path3, downloadTask, new Function1() { // from class: com.join.android.app.common.servcie.k
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        Unit B;
                                        B = DownloadService.this.B((String) obj);
                                        return B;
                                    }
                                });
                            }
                        } else {
                            APKUtils.k0(path3, downloadTask, new Function1() { // from class: com.join.android.app.common.servcie.j
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    Unit C;
                                    C = DownloadService.this.C((String) obj);
                                    return C;
                                }
                            });
                        }
                    }
                    try {
                        downloadTask.setId(p1.f.K().F(downloadTask.getCrc_link_type_val()).getId());
                        p1.f.K().update(downloadTask);
                    } catch (Exception e9) {
                        e9.printStackTrace();
                    }
                    UtilsMy.G3(f14757k, downloadTask, 5);
                    i.e().k(downloadTask.getCrc_link_type_val());
                    return;
                }
                r.b(f14757k, downloadTask, Event.gameDownloadCompleted);
                i.e().r(f14757k, downloadTask, false);
            }
        }
    }

    public void I(Long... lArr) {
        try {
            if (System.currentTimeMillis() - this.f14767h > this.f14766g || System.currentTimeMillis() - this.f14767h < 0) {
                org.greenrobot.eventbus.c.f().o(new com.join.mgps.event.n(null, 8));
                this.f14767h = System.currentTimeMillis();
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public void J(DownloadTask downloadTask) {
        downloadTask.setStatus(2);
        downloadTask.setSpeed("0");
        org.greenrobot.eventbus.c.f().o(new com.join.mgps.event.n(downloadTask, 2));
    }

    public void K(DownloadTask downloadTask) {
        if (i.e().f(downloadTask.getCrc_link_type_val()) == null || downloadTask.getStatus() == 7 || downloadTask.getStatus() == 6 || downloadTask.getStatus() == 5) {
            return;
        }
        p1.f.K().j0(downloadTask, 3);
        downloadTask.setStatus(3);
        org.greenrobot.eventbus.c.f().o(new com.join.mgps.event.n(downloadTask, 3));
        org.greenrobot.eventbus.c.f().o(new com.join.mgps.event.l(downloadTask.getCrc_link_type_val(), 38));
        r.b(f14757k, downloadTask, Event.downloadStop);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread(delay = 3000)
    public void M() {
        N();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void R(int i4, int i5) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void S(DetailResultBean detailResultBean) {
        DownloadTask downloadtaskDown;
        if (detailResultBean == null || (downloadtaskDown = detailResultBean.getDownloadtaskDown()) == null) {
            return;
        }
        UtilsMy.z1(downloadtaskDown, detailResultBean);
        if (UtilsMy.x0(downloadtaskDown.getPay_game_amount(), downloadtaskDown.getCrc_link_type_val()) > 0) {
            UtilsMy.d4(f14757k, downloadtaskDown.getCrc_link_type_val());
        } else if (UtilsMy.o1(f14757k, downloadtaskDown)) {
        } else {
            if (detailResultBean.getDown_status() == 5) {
                UtilsMy.l1(f14757k, downloadtaskDown);
            } else {
                UtilsMy.R0(f14757k, downloadtaskDown, downloadtaskDown.getTp_down_url(), downloadtaskDown.getOther_down_switch(), downloadtaskDown.getCdn_down_switch());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Receiver(actions = {o1.a.f72014n})
    public void m(Intent intent) {
        final String stringExtra = intent.getStringExtra("apkpath");
        Intent intent2 = new Intent("android.intent.action.VIEW");
        intent2.setFlags(268435456);
        intent2.setAction("android.intent.action.VIEW");
        APKUtils.k0(stringExtra, p1.f.K().E(stringExtra), new Function1() { // from class: com.join.android.app.common.servcie.p
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit w4;
                w4 = DownloadService.w(stringExtra, (String) obj);
                return w4;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Receiver(actions = {o1.a.f72016o})
    public void n(Intent intent) {
        String stringExtra = intent.getStringExtra("packageName");
        String stringExtra2 = intent.getStringExtra("actionFrom");
        if (stringExtra2.equals(BootReceiver_.f53984a)) {
            p(1, stringExtra);
        } else if (stringExtra2.equals(BootReceiver_.f53985b)) {
            if (TextUtils.equals(stringExtra, q1.f27991b)) {
                this.f14762c.isQuarkSilentDownload().g(Boolean.TRUE);
            }
            if (TextUtils.equals(stringExtra, "xyz.aethersx2.android")) {
                return;
            }
            if ("com.join.android.app.mgsim.wufun.addon".equals(stringExtra)) {
                APKUtils.u(f14757k);
            } else {
                p(2, stringExtra);
            }
        } else if (stringExtra2.equals(BootReceiver_.f53987d)) {
            p(3, stringExtra);
        } else if (stringExtra2.equals(BootReceiver_.f53986c)) {
            if ("com.join.android.app.mgsim.wufun.addon".equals(stringExtra)) {
                APKUtils.u(f14757k);
            }
            if (TextUtils.equals(stringExtra, "xyz.aethersx2.android")) {
                p(2, stringExtra);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0296 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0049 A[SYNTHETIC] */
    @org.androidannotations.annotations.Background
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void o(java.lang.String r14) {
        /*
            Method dump skipped, instructions count: 692
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.android.app.common.servcie.DownloadService.o(java.lang.String):void");
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        f14757k = getApplicationContext();
        this.f14761b = com.join.mgps.rpc.impl.d.P1();
        this.f14764e = new BootReceiver_();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(BootReceiver_.f53984a);
        intentFilter.addAction(BootReceiver_.f53985b);
        intentFilter.addAction(BootReceiver_.f53987d);
        intentFilter.addAction(BootReceiver_.f53986c);
        intentFilter.addAction(BootReceiver_.f53989f);
        intentFilter.addDataScheme("package");
        intentFilter.setPriority(Integer.MAX_VALUE);
        registerReceiver(this.f14764e, intentFilter);
        d0.a().d(this);
        List<DownloadTask> d5 = p1.f.K().d();
        if (d5 != null && d5.size() > 0) {
            for (DownloadTask downloadTask : d5) {
                if (downloadTask.getGameZipPath() != null && downloadTask.getFileType().equals(Dtype.apk) && !new File(downloadTask.getGameZipPath()).exists()) {
                    p1.f.K().delete((p1.f) downloadTask);
                }
            }
            d5.clear();
        }
        M();
    }

    @Override // android.app.Service
    public void onDestroy() {
        com.papa.sim.statistic.p.l(f14757k).e();
        d0.a().e(this);
        BootReceiver_ bootReceiver_ = this.f14764e;
        if (bootReceiver_ != null) {
            unregisterReceiver(bootReceiver_);
        }
        super.onDestroy();
        sendBroadcast(new Intent("com.intent.downloadService.destroyed"));
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onDownloadEvent(com.join.mgps.event.k kVar) {
        StringBuilder sb = new StringBuilder();
        sb.append("method onDownloadEvent called.event=");
        sb.append(kVar.getType());
        DownloadTask a5 = kVar.a();
        int type = kVar.getType();
        if (type != 39) {
            switch (type) {
                case 14:
                    q(a5, true);
                    return;
                case 15:
                    i.e().n(a5);
                    return;
                case 16:
                    i.e().c(f14757k, a5);
                    return;
                case 17:
                    p1.f.K().delete((p1.f) a5);
                    return;
                default:
                    return;
            }
        }
        if (i.e().f(a5.getCrc_link_type_val()) == null) {
            i.e().i(a5);
        }
        org.greenrobot.eventbus.c.f().o(new com.join.mgps.event.l(a5.getCrc_link_type_val(), 36));
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onDownloadRuntimeEvent(com.join.mgps.event.l lVar) {
        DownloadTask f5 = i.e().f(lVar.a());
        if (f5 == null) {
            return;
        }
        if (lVar.getType() != 33) {
            f5.setRuntimeStatus(new AtomicInteger(lVar.getType()));
        }
        if (lVar.getType() == 41) {
            com.papa.sim.statistic.p l4 = com.papa.sim.statistic.p.l(f14757k);
            l4.L1("STATUS_RUNTIME_SIZE_MISMATCH,gameId=" + lVar.a() + ";realSize=" + f5.getSize() + ";atcualSize=" + f5.getActual_size());
            return;
        }
        int type = lVar.getType();
        if (type == 20) {
            J(f5);
        } else if (type == 29) {
            f5.setStatus(10);
            org.greenrobot.eventbus.c.f().o(new com.join.mgps.event.n(f5, 10));
            f5.setRuntimeStatus(new AtomicInteger(38));
        } else if (type == 45) {
            l2.a(f14757k).b("文件出错，重新下载中");
        } else if (type != 46) {
            switch (type) {
                case 31:
                case 36:
                    H(f5);
                    return;
                case 32:
                    G(f5);
                    return;
                case 33:
                    I(new Long[0]);
                    return;
                case 34:
                    F(f5);
                    return;
                case 35:
                    K(f5);
                    return;
                default:
                    return;
            }
        } else {
            v0.d("unzipfailedxx", "recived failed");
            if (!(MApplication.f1497x.getActivity() instanceof ModGameIndexActivity)) {
                ((UnzipFailedDialog_.IntentBuilder_) UnzipFailedDialog_.intent(f14757k).from(1).gameId(f5.getCrc_link_type_val()).flags(268435456)).start();
            }
            i.e().k(f5.getCrc_link_type_val());
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onDownloadScanEvent(DownloadScanEvent downloadScanEvent) {
        DownloadTask task;
        if (downloadScanEvent == null || (task = downloadScanEvent.getTask()) == null) {
            return;
        }
        H(task);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i4, int i5) {
        return super.onStartCommand(intent, 1, i5);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void p(int i4, String str) {
        if (i4 == 1) {
            try {
                if (com.join.android.app.common.utils.j.j(this)) {
                    o(str);
                } else {
                    HashMap<String, DownloadTask> hashMap = this.f14763d;
                    if (hashMap != null && hashMap.containsKey(str)) {
                        DownloadTask downloadTask = this.f14763d.get(str);
                        downloadTask.setOpenTime(System.currentTimeMillis());
                        p1.f.K().m(downloadTask);
                        this.f14763d.remove(str);
                    }
                }
            } catch (Exception e5) {
                e5.printStackTrace();
                return;
            }
        }
        for (DownloadTask downloadTask2 : p1.f.K().d()) {
            if (str.equals(downloadTask2.getPackageName()) && (downloadTask2.getFileType().equals(Dtype.android.name()) || downloadTask2.getFileType().equals(Dtype.chajian.name()))) {
                if (i4 == 1) {
                    downloadTask2.setStatus(5);
                    if (downloadTask2.getRomType() != null && !downloadTask2.getFileType().equals(Dtype.chajian.name())) {
                        DownloadHistoryTable p4 = b2.k.n().p(downloadTask2.getCrc_link_type_val());
                        if (p4 != null) {
                            p4.setCreate_time(System.currentTimeMillis());
                        } else {
                            p4 = new DownloadHistoryTable();
                            p4.setCrc_link_type_val(downloadTask2.getCrc_link_type_val());
                            p4.setCreate_time(System.currentTimeMillis());
                        }
                        b2.k.n().m(p4);
                        UtilsMy.N2(f14757k, downloadTask2.getCrc_link_type_val());
                        PrefDef_ prefDef_ = new PrefDef_(f14757k);
                        prefDef_.lastInstallAppFinish().g(downloadTask2.getCrc_link_type_val());
                        prefDef_.lastInstallApp().g("");
                    } else {
                        try {
                            APKUtils.a l4 = com.join.android.app.common.utils.e.l0(f14757k).l(f14757k, downloadTask2.getPackageName());
                            if (l4 != null) {
                                downloadTask2.setVer(l4.d() + "");
                                downloadTask2.setVer_name(l4.e());
                            }
                        } catch (Exception e6) {
                            e6.printStackTrace();
                        }
                    }
                    try {
                        DownloadTask f5 = i.e().f(downloadTask2.getCrc_link_type_val());
                        if (f5 != null) {
                            f5.setStatus(5);
                        }
                    } catch (Exception e7) {
                        e7.printStackTrace();
                    }
                    p1.f.K().j0(downloadTask2, downloadTask2.getStatus());
                    downloadTask2.setStatus(5);
                    r.b(f14757k, downloadTask2, Event.installAndroidCompleted);
                    org.greenrobot.eventbus.c.f().o(new com.join.mgps.event.n(downloadTask2, 5));
                    try {
                        File file = new File(downloadTask2.getPath());
                        if (file.exists()) {
                            UtilsMy.delete(file);
                        }
                    } catch (Exception e8) {
                        e8.printStackTrace();
                    }
                } else if (i4 == 2) {
                    v0.c("app卸载");
                    v0.c("downloadTask status=" + downloadTask2.getStatus() + "  5是finish状态");
                    if (11 == downloadTask2.getStatus()) {
                        v0.c("downloadTask 安装状态");
                        downloadTask2.setStatus(5);
                        p1.f.K().j0(downloadTask2, downloadTask2.getStatus());
                        org.greenrobot.eventbus.c.f().o(new com.join.mgps.event.n(downloadTask2, 5));
                        DownloadTask f6 = i.e().f(downloadTask2.getCrc_link_type_val());
                        if (f6 != null) {
                            f6.setStatus(5);
                        }
                    } else {
                        v0.c("收到删除广播");
                        DownloadTask f7 = i.e().f(downloadTask2.getCrc_link_type_val());
                        if (!this.f14763d.containsKey(downloadTask2.getPackageName())) {
                            this.f14763d.put(downloadTask2.getPackageName(), downloadTask2);
                        }
                        if (f7 != null) {
                            i.e().k(f7.getCrc_link_type_val());
                        }
                        com.php25.PDownload.d.a(downloadTask2);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Receiver(actions = {o1.a.f72018p})
    public void s(Intent intent) {
        t(intent.getStringExtra("gameId"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void t(String str) {
        if (com.join.android.app.common.utils.j.j(this)) {
            try {
                n0 accountData = AccountUtil_.getInstance_(f14757k).getAccountData();
                ResultMainBean<List<DetailResultBean>> R = this.f14761b.R(RequestBeanUtil.getInstance(this).getAppDetialBean(str, accountData != null ? accountData.getUid() : 0, null));
                if (R == null || R.getFlag() == 0) {
                    if (R != null) {
                        R.getFlag();
                        return;
                    }
                    return;
                }
                List<DetailResultBean> data = R.getMessages().getData();
                if (data.size() != 0) {
                    S(data.get(0));
                }
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }
}
