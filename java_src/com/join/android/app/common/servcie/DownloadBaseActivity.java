package com.join.android.app.common.servcie;

import android.app.ActivityManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.MApplication;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.android.app.common.utils.APKUtils;
import com.join.android.app.common.utils.JsonMapper;
import com.join.mgps.Util.RequestBeanUtil;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.Util.d0;
import com.join.mgps.Util.d1;
import com.join.mgps.Util.g2;
import com.join.mgps.Util.l2;
import com.join.mgps.Util.q1;
import com.join.mgps.Util.v0;
import com.join.mgps.Util.w0;
import com.join.mgps.activity.ModGameIndexActivity;
import com.join.mgps.activity.MyFragmentActivity1;
import com.join.mgps.activity.PapaPlugGuideActivity_;
import com.join.mgps.activity.mygame.dialog.UnzipFailedDialog_;
import com.join.mgps.db.tables.DownloadHistoryTable;
import com.join.mgps.dto.BootPageData;
import com.join.mgps.dto.DetailResultBean;
import com.join.mgps.dto.DownloadScanEvent;
import com.join.mgps.dto.ExtBean;
import com.join.mgps.dto.HomeViewSwich;
import com.join.mgps.dto.ResultMainBean;
import com.join.mgps.dto.SearchDataBean;
import com.join.mgps.enums.ConstantIntEnum;
import com.join.mgps.enums.Dtype;
import com.join.mgps.pref.PrefDef_;
import com.join.mgps.receiver.BootReceiver_;
import com.papa.sim.statistic.Event;
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
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
/* loaded from: classes.dex */
public class DownloadBaseActivity extends MyFragmentActivity1 {
    private static final String TAG = "DownloadBaseActivity";
    private static Context context;
    static ScheduledFuture future;
    private static boolean recovery;
    private static ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
    private BroadcastReceiver apkInstalDownDataOrObbRecverReceiver_;
    private BroadcastReceiver downloadbygameRecverReceiver_;
    j mScreenStatusReceiver;
    private BroadcastReceiver onConnectivityChangedReceiver_;
    PrefDef_ prefDef;
    BootReceiver_ receiver;
    com.join.mgps.rpc.e recommendClient;
    private Handler mHandler = new Handler(new a());
    private final IntentFilter intentFilter1_ = new IntentFilter();
    private IntentFilter intentFilter2_ = new IntentFilter();
    private BroadcastReceiver apkInstalRecverReceiver_ = null;
    private IntentFilter intentFilter3_ = new IntentFilter();
    private IntentFilter intentFilter4_ = new IntentFilter();
    boolean mScreenPowerStatus = true;
    long screenOffTime = 0;
    HashMap<String, DownloadTask> lastRemovedDownloadTasks = new HashMap<>();
    boolean isWifi = false;
    boolean activityHasdestroy = false;
    private int delay = 1000;
    private long lastDelay = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a implements Handler.Callback {
        a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(@NonNull Message message) {
            int i4 = message.what;
            if (i4 == 0) {
                DownloadBaseActivity.this.restartOnlyWifiDownloadTask();
                return false;
            } else if (i4 == 1) {
                DownloadBaseActivity.this.restartDownloadTask();
                return false;
            } else {
                return false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class b extends BroadcastReceiver {
        b() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            DownloadBaseActivity.this.apkInstalRecver(intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class c extends BroadcastReceiver {
        c() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            DownloadBaseActivity.this.downloadbygameRecver(intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class d extends BroadcastReceiver {
        d() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            DownloadBaseActivity.this.onConnectivityChanged(intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class e extends BroadcastReceiver {
        e() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            DownloadBaseActivity.this.apkInstalDownDataOrObbRecver(intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class f implements Callback<ResultMainBean<List<DetailResultBean>>> {
        f() {
        }

        @Override // retrofit2.Callback
        public void onFailure(Call<ResultMainBean<List<DetailResultBean>>> call, Throwable th) {
        }

        @Override // retrofit2.Callback
        public void onResponse(Call<ResultMainBean<List<DetailResultBean>>> call, Response<ResultMainBean<List<DetailResultBean>>> response) {
            ResultMainBean<List<DetailResultBean>> body = response.body();
            if (body == null || body.getFlag() == 0) {
                if (body != null) {
                    body.getFlag();
                    return;
                }
                return;
            }
            List<DetailResultBean> data = body.getMessages().getData();
            if (data.size() != 0) {
                DownloadBaseActivity.this.startDown(data.get(0));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class g implements Callback<ResultMainBean<List<SearchDataBean>>> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f14750b;

        g(String str) {
            this.f14750b = str;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call<ResultMainBean<List<SearchDataBean>>> call, Throwable th) {
        }

        /* JADX WARN: Removed duplicated region for block: B:106:0x024e A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:114:0x003a A[SYNTHETIC] */
        @Override // retrofit2.Callback
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void onResponse(retrofit2.Call<com.join.mgps.dto.ResultMainBean<java.util.List<com.join.mgps.dto.SearchDataBean>>> r14, retrofit2.Response<com.join.mgps.dto.ResultMainBean<java.util.List<com.join.mgps.dto.SearchDataBean>>> r15) {
            /*
                Method dump skipped, instructions count: 616
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.join.android.app.common.servcie.DownloadBaseActivity.g.onResponse(retrofit2.Call, retrofit2.Response):void");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class h implements Runnable {
        h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.join.android.app.common.utils.j.l()) {
                DownloadBaseActivity.this.restartAllNetDownloadTask();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class i implements Runnable {
        i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.join.android.app.common.utils.j.k(DownloadBaseActivity.context)) {
                if (com.join.android.app.common.utils.j.l()) {
                    if (DownloadBaseActivity.this.mHandler != null) {
                        DownloadBaseActivity.this.mHandler.sendEmptyMessage(0);
                    }
                    DownloadBaseActivity.future.cancel(true);
                    return;
                }
                return;
            }
            DownloadBaseActivity.future.cancel(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public class j extends BroadcastReceiver {
        private j() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("android.intent.action.SCREEN_ON".equals(intent.getAction())) {
                long currentTimeMillis = System.currentTimeMillis();
                DownloadBaseActivity downloadBaseActivity = DownloadBaseActivity.this;
                if (currentTimeMillis - downloadBaseActivity.screenOffTime > 240000) {
                    downloadBaseActivity.mHandler.sendEmptyMessageDelayed(1, 3000L);
                }
            } else if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
                DownloadBaseActivity.this.screenOffTime = System.currentTimeMillis();
            }
        }

        /* synthetic */ j(DownloadBaseActivity downloadBaseActivity, a aVar) {
            this();
        }
    }

    private synchronized void download(DownloadTask downloadTask, boolean z4) {
        downloadStart(downloadTask, z4);
    }

    private synchronized void downloadStart(DownloadTask downloadTask, boolean z4) {
        StringBuilder sb = new StringBuilder();
        sb.append("method downloadStart called.");
        sb.append(downloadTask.getName());
        sb.append(";url=");
        sb.append(downloadTask.getUrl());
        if (!g2.h(downloadTask.getUrl()) && r.a(context, downloadTask)) {
            com.join.android.app.common.servcie.i.e().m(context, downloadTask, z4);
        }
    }

    private void initRecviver() {
        if (this.mScreenStatusReceiver == null) {
            this.mScreenStatusReceiver = new j(this, null);
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            registerReceiver(this.mScreenStatusReceiver, intentFilter);
        }
        if (this.receiver == null) {
            this.receiver = new BootReceiver_();
            IntentFilter intentFilter2 = new IntentFilter();
            intentFilter2.addAction(BootReceiver_.f53984a);
            intentFilter2.addAction(BootReceiver_.f53985b);
            intentFilter2.addAction(BootReceiver_.f53987d);
            intentFilter2.addAction(BootReceiver_.f53986c);
            intentFilter2.addAction(BootReceiver_.f53989f);
            intentFilter2.addDataScheme("package");
            intentFilter2.setPriority(Integer.MAX_VALUE);
            context.registerReceiver(this.receiver, intentFilter2);
        }
        this.intentFilter1_.addAction(o1.a.f72014n);
        this.intentFilter2_.addAction(o1.a.f72016o);
        this.intentFilter3_.addAction(o1.a.f72018p);
        this.intentFilter4_.addAction("android.net.wifi.WIFI_STATE_CHANGED");
        this.intentFilter4_.addAction("android.net.wifi.STATE_CHANGE");
        this.intentFilter4_.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        this.intentFilter4_.addAction("android.net.wifi.SCAN_RESULTS");
        if (this.apkInstalRecverReceiver_ == null) {
            b bVar = new b();
            this.apkInstalRecverReceiver_ = bVar;
            context.registerReceiver(bVar, this.intentFilter2_);
        }
        if (this.downloadbygameRecverReceiver_ == null) {
            c cVar = new c();
            this.downloadbygameRecverReceiver_ = cVar;
            context.registerReceiver(cVar, this.intentFilter3_);
        }
        if (this.onConnectivityChangedReceiver_ == null) {
            d dVar = new d();
            this.onConnectivityChangedReceiver_ = dVar;
            context.registerReceiver(dVar, this.intentFilter4_);
        }
        if (this.apkInstalDownDataOrObbRecverReceiver_ == null) {
            e eVar = new e();
            this.apkInstalDownDataOrObbRecverReceiver_ = eVar;
            context.registerReceiver(eVar, this.intentFilter1_);
        }
    }

    private boolean isAppOnForeground() {
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

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Unit lambda$apkInstalDownDataOrObbRecver$0(String str, String str2) {
        com.join.android.app.common.utils.e.l0(context).x(context, str);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Unit lambda$onFinish$2(String str) {
        com.join.android.app.common.utils.e.l0(context).x(context, str);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Unit lambda$onFinish$3(String str) {
        com.join.android.app.common.utils.e.l0(context).x(this, str);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Unit lambda$onFinish$4(DownloadTask downloadTask, String str) {
        if (q1.c(context, downloadTask)) {
            return null;
        }
        com.join.android.app.common.utils.e.l0(context).x(this, str);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Unit lambda$onFinish$5(DownloadTask downloadTask, String str) {
        if (q1.c(context, downloadTask)) {
            return null;
        }
        com.join.android.app.common.utils.e.l0(context).x(this, str);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Unit lambda$onFinish$6(String str) {
        com.join.android.app.common.utils.e.l0(context).x(this, str);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Unit lambda$onFinish$7(String str) {
        com.join.android.app.common.utils.e.l0(context).x(this, str);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Unit lambda$restartDownloadTask$1(String str) {
        com.join.android.app.common.utils.e.l0(this).x(this, str);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void restartAllNetDownloadTask() {
        if (recovery) {
            return;
        }
        recovery = true;
        List<DownloadTask> e02 = p1.f.K().e0();
        if (e02 != null && e02.size() != 0) {
            for (DownloadTask downloadTask : e02) {
                try {
                    downloadTask.setDownType(UtilsMy.r0(context, downloadTask));
                    HomeViewSwich homeViewSwich = MApplication.R;
                    if (homeViewSwich != null) {
                        downloadTask.setDownLimit(Integer.parseInt(homeViewSwich.getDown_load_speed_limit().getCfg_values_express()));
                    } else {
                        downloadTask.setDownLimit(300);
                    }
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
                DownloadTask f5 = com.join.android.app.common.servcie.i.e().f(downloadTask.getCrc_link_type_val());
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
                download(downloadTask, false);
            }
            recovery = false;
            return;
        }
        recovery = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void restartDownloadTask() {
        try {
            if (this.activityHasdestroy) {
                return;
            }
            boolean booleanValue = this.prefDef.isOnlyWifiReconnect().e(Boolean.TRUE).booleanValue();
            List<DownloadTask> f02 = p1.f.K().f0();
            if (f02 == null || f02.size() <= 0) {
                return;
            }
            for (DownloadTask downloadTask : f02) {
                try {
                    downloadTask.setDownType(UtilsMy.r0(context, downloadTask));
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
                    Context context2 = context;
                    if (context2 != null) {
                        if (com.join.android.app.common.utils.j.k(context2)) {
                            if (downloadTask.getStatus() == 2 || downloadTask.getStatus() == 6 || downloadTask.getStatus() == 10 || downloadTask.getStatus() == 1) {
                                downloadTask.setStatus(0);
                                p1.f.K().update(downloadTask);
                                download(downloadTask, false);
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
                    download(downloadTask, false);
                }
                if (downloadTask.getStatus() != 12 && downloadTask.getStatus() != 13) {
                    if (downloadTask.getStatus() == 48) {
                        if (!g2.i(downloadTask.getGameZipPath()) && !g2.i(downloadTask.getPath())) {
                            p1.f.K().n(downloadTask.getCrc_link_type_val());
                        }
                        if (g2.h(downloadTask.getGameZipPath())) {
                            downloadTask.setGameZipPath(downloadTask.getPath());
                        }
                        APKUtils.k0(downloadTask.getGameZipPath(), downloadTask, new Function1() { // from class: com.join.android.app.common.servcie.c
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                Unit lambda$restartDownloadTask$1;
                                lambda$restartDownloadTask$1 = DownloadBaseActivity.this.lambda$restartDownloadTask$1((String) obj);
                                return lambda$restartDownloadTask$1;
                            }
                        });
                    }
                }
                if (downloadTask.getFileType() != null && downloadTask.getFileType().equals(Dtype.apk.name())) {
                    com.join.android.app.common.servcie.i.e().r(context, downloadTask, true);
                } else {
                    com.join.android.app.common.servcie.i.e().r(context, downloadTask, false);
                }
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void restartOnlyWifiDownloadTask() {
        if (!com.join.android.app.common.utils.j.k(context)) {
            recovery = false;
        } else if (!recovery) {
            recovery = true;
            List<DownloadTask> e02 = p1.f.K().e0();
            if (e02 != null && e02.size() != 0) {
                for (DownloadTask downloadTask : e02) {
                    try {
                        downloadTask.setDownType(UtilsMy.r0(context, downloadTask));
                        HomeViewSwich homeViewSwich = MApplication.R;
                        if (homeViewSwich != null) {
                            downloadTask.setDownLimit(Integer.parseInt(homeViewSwich.getDown_load_speed_limit().getCfg_values_express()));
                        } else {
                            downloadTask.setDownLimit(300);
                        }
                    } catch (Exception e5) {
                        e5.printStackTrace();
                    }
                    DownloadTask f5 = com.join.android.app.common.servcie.i.e().f(downloadTask.getCrc_link_type_val());
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
                    download(downloadTask, false);
                }
                recovery = false;
                return;
            }
            recovery = false;
        }
    }

    private synchronized void retryOnSomeTime() {
        if (com.join.android.app.common.utils.j.k(context)) {
            if (future != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("scheduler status:: isDone =");
                sb.append(future.isDone());
                sb.append(";furture.isCancelled=");
                sb.append(future.isCancelled());
            }
            ScheduledFuture scheduledFuture = future;
            if (scheduledFuture == null || scheduledFuture.isDone() || future.isCancelled()) {
                future = scheduler.scheduleWithFixedDelay(new i(), 5L, 10L, TimeUnit.SECONDS);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void sendPointVolcanno(java.lang.String r17, java.lang.String r18, java.lang.String r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 347
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.android.app.common.servcie.DownloadBaseActivity.sendPointVolcanno(java.lang.String, java.lang.String, java.lang.String, boolean):void");
    }

    public static void updatezipProgress(DownloadTask downloadTask) {
        DownloadTask f5;
        if (downloadTask == null || (f5 = com.join.android.app.common.servcie.i.e().f(downloadTask.getCrc_link_type_val())) == null) {
            return;
        }
        f5.setProgress(downloadTask.getProgress());
        org.greenrobot.eventbus.c.f().o(new com.join.mgps.event.n(downloadTask, 8));
    }

    void apkInstalDownDataOrObbRecver(Intent intent) {
        final String stringExtra = intent.getStringExtra("apkpath");
        Intent intent2 = new Intent("android.intent.action.VIEW");
        intent2.setFlags(268435456);
        intent2.setAction("android.intent.action.VIEW");
        APKUtils.k0(stringExtra, p1.f.K().E(stringExtra), new Function1() { // from class: com.join.android.app.common.servcie.g
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit lambda$apkInstalDownDataOrObbRecver$0;
                lambda$apkInstalDownDataOrObbRecver$0 = DownloadBaseActivity.lambda$apkInstalDownDataOrObbRecver$0(stringExtra, (String) obj);
                return lambda$apkInstalDownDataOrObbRecver$0;
            }
        });
    }

    void apkInstalRecver(Intent intent) {
        String stringExtra = intent.getStringExtra("packageName");
        String stringExtra2 = intent.getStringExtra("actionFrom");
        StringBuilder sb = new StringBuilder();
        sb.append("method apkInstalRecver() called.packageName=");
        sb.append(stringExtra);
        sb.append("  actionFrom=");
        sb.append(stringExtra2);
        if (stringExtra2.equals(BootReceiver_.f53984a)) {
            changeDownloadState(1, stringExtra);
        } else if (stringExtra2.equals(BootReceiver_.f53985b)) {
            if (TextUtils.equals(stringExtra, "xyz.aethersx2.android")) {
                return;
            }
            changeDownloadState(2, stringExtra);
        } else if (stringExtra2.equals(BootReceiver_.f53987d)) {
            changeDownloadState(3, stringExtra);
        } else if (stringExtra2.equals(BootReceiver_.f53986c)) {
            if ("com.join.android.app.mgsim.wufun.addon".equals(stringExtra)) {
                APKUtils.u(context);
            }
            if (TextUtils.equals(stringExtra, "xyz.aethersx2.android")) {
                changeDownloadState(2, stringExtra);
            }
        } else {
            BootReceiver_.f53988e.equals(stringExtra2);
        }
    }

    void backH5Downloadgame(String str) {
        try {
            com.join.mgps.rpc.impl.d.P1().O1().H0(RequestBeanUtil.getInstance(this).getAppDataBackRequest(new String[]{str})).enqueue(new g(str));
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    void changeDownloadState(int i4, String str) {
        if (i4 == 1) {
            try {
                if (com.join.android.app.common.utils.j.j(this)) {
                    backH5Downloadgame(str);
                } else {
                    HashMap<String, DownloadTask> hashMap = this.lastRemovedDownloadTasks;
                    if (hashMap != null && hashMap.containsKey(str)) {
                        DownloadTask downloadTask = this.lastRemovedDownloadTasks.get(str);
                        downloadTask.setOpenTime(System.currentTimeMillis());
                        p1.f.K().m(downloadTask);
                        this.lastRemovedDownloadTasks.remove(str);
                    }
                }
            } catch (Exception e5) {
                e5.printStackTrace();
                return;
            }
        }
        for (DownloadTask downloadTask2 : p1.f.K().d()) {
            if (str.equals(downloadTask2.getPackageName()) && (downloadTask2.getFileType().equals(Dtype.android.name()) || downloadTask2.getFileType().equals(Dtype.chajian.name()))) {
                if (i4 != 1) {
                    if (i4 == 2 && !Dtype.MOD.name().equals(downloadTask2.getFileType())) {
                        v0.c("app卸载");
                        v0.c("downloadTask status=" + downloadTask2.getStatus() + "  5是finish状态");
                        if (11 == downloadTask2.getStatus()) {
                            v0.c("downloadTask 安装状态");
                            downloadTask2.setStatus(5);
                            p1.f.K().j0(downloadTask2, downloadTask2.getStatus());
                            org.greenrobot.eventbus.c.f().o(new com.join.mgps.event.n(downloadTask2, 5));
                            DownloadTask f5 = com.join.android.app.common.servcie.i.e().f(downloadTask2.getCrc_link_type_val());
                            if (f5 != null) {
                                f5.setStatus(5);
                            }
                        } else {
                            v0.c("收到删除广播");
                            DownloadTask f6 = com.join.android.app.common.servcie.i.e().f(downloadTask2.getCrc_link_type_val());
                            if (!this.lastRemovedDownloadTasks.containsKey(downloadTask2.getPackageName())) {
                                this.lastRemovedDownloadTasks.put(downloadTask2.getPackageName(), downloadTask2);
                            }
                            if (f6 != null) {
                                com.join.android.app.common.servcie.i.e().k(f6.getCrc_link_type_val());
                            }
                            com.php25.PDownload.d.a(downloadTask2);
                        }
                    }
                } else {
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
                        UtilsMy.N2(this, downloadTask2.getCrc_link_type_val());
                        PrefDef_ prefDef_ = new PrefDef_(context);
                        prefDef_.lastInstallAppFinish().g(downloadTask2.getCrc_link_type_val());
                        prefDef_.lastInstallApp().g("");
                    } else {
                        try {
                            APKUtils.a l4 = com.join.android.app.common.utils.e.l0(context).l(context, downloadTask2.getPackageName());
                            if (l4 != null) {
                                downloadTask2.setVer(l4.d() + "");
                                downloadTask2.setVer_name(l4.e());
                            }
                        } catch (Exception e6) {
                            e6.printStackTrace();
                        }
                    }
                    try {
                        DownloadTask f7 = com.join.android.app.common.servcie.i.e().f(downloadTask2.getCrc_link_type_val());
                        if (f7 != null) {
                            f7.setStatus(5);
                        }
                    } catch (Exception e7) {
                        e7.printStackTrace();
                    }
                    p1.f.K().j0(downloadTask2, downloadTask2.getStatus());
                    downloadTask2.setStatus(5);
                    r.b(context, downloadTask2, Event.installAndroidCompleted);
                    v0.c("downloadTask status=" + downloadTask2.getStatus() + " Event.installAndroidCompleted");
                    org.greenrobot.eventbus.c.f().o(new com.join.mgps.event.n(downloadTask2, 5));
                    try {
                        File file = new File(downloadTask2.getPath());
                        if (file.exists()) {
                            UtilsMy.delete(file);
                        }
                    } catch (Exception e8) {
                        e8.printStackTrace();
                    }
                }
            }
        }
    }

    void downloadbygameRecver(Intent intent) {
        getDetailData(intent.getStringExtra("gameId"));
    }

    @Override // android.app.Activity
    public void finish() {
        j jVar = this.mScreenStatusReceiver;
        if (jVar != null) {
            unregisterReceiver(jVar);
            this.mScreenStatusReceiver = null;
        }
        super.finish();
    }

    void getDetailData(String str) {
        if (com.join.android.app.common.utils.j.j(context)) {
            try {
                com.join.mgps.rpc.impl.d.P1().O1().R(RequestBeanUtil.getInstance(context).getAppDetialBean(str, 0, null)).enqueue(new f());
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    void onConnectivityChanged(Intent intent) {
        try {
            String action = intent.getAction();
            if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action) || action.equals("android.net.wifi.STATE_CHANGE") || action.equals("android.net.conn.CONNECTIVITY_CHANGE")) {
                boolean j4 = com.join.android.app.common.utils.j.j(context);
                StringBuilder sb = new StringBuilder();
                sb.append("网络状态：");
                sb.append(j4);
                if (com.join.android.app.common.utils.j.k(context)) {
                    if (!this.prefDef.isFightActivity().d().booleanValue()) {
                        this.prefDef.isWifiConnectedBefore().g(Boolean.TRUE);
                    }
                    this.isWifi = true;
                } else {
                    if (!this.prefDef.isFightActivity().d().booleanValue()) {
                        this.prefDef.isWifiConnectedBefore().g(Boolean.FALSE);
                    }
                    this.isWifi = false;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("wifi状态：");
                sb2.append(com.join.android.app.common.utils.j.k(context));
                StringBuilder sb3 = new StringBuilder();
                sb3.append("移动网络状态：");
                sb3.append(com.join.android.app.common.utils.j.i(context));
                StringBuilder sb4 = new StringBuilder();
                sb4.append("网络连接类型：");
                sb4.append(com.join.android.app.common.utils.j.c(context));
                retryOnSomeTime();
                scheduler.execute(new h());
            }
            if (action.equals("android.net.wifi.SCAN_RESULTS")) {
                if (this.prefDef.isFightActivity().d().booleanValue()) {
                    return;
                }
                this.prefDef.isWifiConnectedBefore().g(Boolean.TRUE);
            } else if (action.equals("android.net.wifi.WIFI_STATE_CHANGED")) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append("android.net.wifi.WIFI_STATE_CHANGED | ");
                sb5.append(intent.getIntExtra("wifi_state", -1));
                sb5.append(" | ");
                sb5.append(intent.getIntExtra("previous_wifi_state", -1));
                if (this.prefDef.isFightActivity().d().booleanValue()) {
                    return;
                }
                if (intent.getIntExtra("wifi_state", -1) == 0 || intent.getIntExtra("wifi_state", -1) == 1) {
                    this.prefDef.isWifiConnectedBefore().g(Boolean.FALSE);
                }
            } else if (!action.equals("android.net.wifi.STATE_CHANGE") || this.prefDef.isFightActivity().d().booleanValue()) {
            } else {
                this.prefDef.isWifiConnectedBefore().g(Boolean.TRUE);
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        context = getApplicationContext();
        this.activityHasdestroy = false;
        if (d1.b(this) < 26 || Build.VERSION.SDK_INT < 26) {
            return;
        }
        this.recommendClient = com.join.mgps.rpc.impl.d.P1();
        initRecviver();
        d0.a().d(this);
        this.prefDef = new PrefDef_(context);
        List<DownloadTask> d5 = p1.f.K().d();
        if (d5 != null && d5.size() > 0) {
            for (DownloadTask downloadTask : d5) {
                if (downloadTask.getGameZipPath() != null && downloadTask.getFileType().equals(Dtype.apk) && !new File(downloadTask.getGameZipPath()).exists()) {
                    p1.f.K().delete((p1.f) downloadTask);
                }
            }
            d5.clear();
        }
        this.mHandler.sendEmptyMessageDelayed(1, 6000L);
    }

    public void onDelete(DownloadTask downloadTask) {
        if (downloadTask == null) {
            return;
        }
        p1.f.K().delete((p1.f) downloadTask);
        com.join.android.app.common.servcie.i.e().b(downloadTask.getCrc_link_type_val());
        org.greenrobot.eventbus.c.f().o(new com.join.mgps.event.n(downloadTask, 7));
        org.greenrobot.eventbus.c.f().o(new com.join.mgps.event.l(downloadTask.getCrc_link_type_val(), 38));
    }

    @Override // com.join.mgps.activity.MyFragmentActivity1, com.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        BootReceiver_ bootReceiver_;
        this.activityHasdestroy = true;
        if (!this.isBackHome) {
            com.papa.sim.statistic.p.l(context).e();
            try {
                if (d1.b(this) >= 26 && Build.VERSION.SDK_INT >= 26) {
                    if (d0.a().b(this)) {
                        d0.a().e(this);
                    }
                    try {
                        j jVar = this.mScreenStatusReceiver;
                        if (jVar != null) {
                            unregisterReceiver(jVar);
                        }
                    } catch (Exception e5) {
                        e5.printStackTrace();
                    }
                    try {
                        if (!this.isBackHome && (bootReceiver_ = this.receiver) != null) {
                            unregisterReceiver(bootReceiver_);
                        }
                    } catch (Exception e6) {
                        e6.printStackTrace();
                    }
                    try {
                        BroadcastReceiver broadcastReceiver = this.apkInstalDownDataOrObbRecverReceiver_;
                        if (broadcastReceiver != null) {
                            unregisterReceiver(broadcastReceiver);
                        }
                    } catch (Exception e7) {
                        e7.printStackTrace();
                    }
                    try {
                        BroadcastReceiver broadcastReceiver2 = this.apkInstalRecverReceiver_;
                        if (broadcastReceiver2 != null) {
                            unregisterReceiver(broadcastReceiver2);
                        }
                    } catch (Exception e8) {
                        e8.printStackTrace();
                    }
                    try {
                        BroadcastReceiver broadcastReceiver3 = this.downloadbygameRecverReceiver_;
                        if (broadcastReceiver3 != null) {
                            unregisterReceiver(broadcastReceiver3);
                        }
                    } catch (Exception e9) {
                        e9.printStackTrace();
                    }
                    try {
                        BroadcastReceiver broadcastReceiver4 = this.onConnectivityChangedReceiver_;
                        if (broadcastReceiver4 != null) {
                            unregisterReceiver(broadcastReceiver4);
                        }
                    } catch (Exception e10) {
                        w0.e(e10.getLocalizedMessage());
                    }
                    sendBroadcast(new Intent("com.intent.downloadService.destroyed"));
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
        super.onDestroy();
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onDownloadEvent(com.join.mgps.event.k kVar) {
        StringBuilder sb = new StringBuilder();
        sb.append("method onDownloadEvent called.event=");
        sb.append(kVar.getType());
        if (d1.b(this) < 26 || Build.VERSION.SDK_INT < 26) {
            return;
        }
        DownloadTask a5 = kVar.a();
        int type = kVar.getType();
        if (type != 39) {
            switch (type) {
                case 14:
                    download(a5, !q1.c(this, a5));
                    if (TextUtils.isEmpty(a5.getPackageName()) || a5.getPackageName().equals(q1.f27991b)) {
                        return;
                    }
                    this.prefDef.normalDownloadCount().g(1);
                    return;
                case 15:
                    com.join.android.app.common.servcie.i.e().n(a5);
                    return;
                case 16:
                    com.join.android.app.common.servcie.i.e().c(context, a5);
                    return;
                case 17:
                    p1.f.K().delete((p1.f) a5);
                    return;
                default:
                    return;
            }
        }
        if (com.join.android.app.common.servcie.i.e().f(a5.getCrc_link_type_val()) == null) {
            com.join.android.app.common.servcie.i.e().i(a5);
        }
        org.greenrobot.eventbus.c.f().o(new com.join.mgps.event.l(a5.getCrc_link_type_val(), 36));
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onDownloadRuntimeEvent(com.join.mgps.event.l lVar) {
        DownloadTask f5;
        StringBuilder sb = new StringBuilder();
        sb.append("method onRuntimeEvent called.");
        sb.append(lVar.getType());
        if (d1.b(this) < 26 || Build.VERSION.SDK_INT < 26 || (f5 = com.join.android.app.common.servcie.i.e().f(lVar.a())) == null) {
            return;
        }
        if (lVar.getType() != 33) {
            f5.setRuntimeStatus(new AtomicInteger(lVar.getType()));
        }
        if (lVar.getType() == 41) {
            com.papa.sim.statistic.p l4 = com.papa.sim.statistic.p.l(context);
            l4.L1("STATUS_RUNTIME_SIZE_MISMATCH,gameId=" + lVar.a() + ";realSize=" + f5.getSize() + ";atcualSize=" + f5.getActual_size());
            return;
        }
        int type = lVar.getType();
        if (type == 20) {
            onStart(f5);
        } else if (type == 29) {
            f5.setStatus(10);
            org.greenrobot.eventbus.c.f().o(new com.join.mgps.event.n(f5, 10));
            f5.setRuntimeStatus(new AtomicInteger(38));
        } else if (type == 45) {
            l2.a(context).b("文件出错，重新下载中");
        } else if (type != 46) {
            switch (type) {
                case 31:
                case 36:
                    onFinish(f5);
                    return;
                case 32:
                    onError(f5);
                    return;
                case 33:
                    onProgressUpdate(new Long[0]);
                    return;
                case 34:
                    onDelete(f5);
                    return;
                case 35:
                    onStop(f5);
                    return;
                default:
                    return;
            }
        } else {
            v0.d("unzipfailedxx", "recived failed");
            if (!(MApplication.f1497x.getActivity() instanceof ModGameIndexActivity)) {
                ((UnzipFailedDialog_.IntentBuilder_) UnzipFailedDialog_.intent(context).from(1).gameId(f5.getCrc_link_type_val()).flags(268435456)).start();
            }
            com.join.android.app.common.servcie.i.e().k(f5.getCrc_link_type_val());
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onDownloadScanEvent(DownloadScanEvent downloadScanEvent) {
        DownloadTask task;
        if (downloadScanEvent == null || (task = downloadScanEvent.getTask()) == null) {
            return;
        }
        onFinish(task);
    }

    public void onError(DownloadTask downloadTask) {
        UtilsMy.p2(context, downloadTask, true);
        p1.f.K().j0(downloadTask, 6);
        downloadTask.setStatus(6);
        org.greenrobot.eventbus.c.f().o(new com.join.mgps.event.n(downloadTask, 6));
        org.greenrobot.eventbus.c.f().o(new com.join.mgps.event.l(downloadTask.getCrc_link_type_val(), 38));
        retryOnSomeTime();
    }

    public void onFinish(final DownloadTask downloadTask) {
        ExtBean extBean;
        ExtBean extBean2;
        ExtBean extBean3;
        v0.c(" permissxx   onfinish");
        downloadTask.setDuration(downloadTask.getSize() / downloadTask.getDuration());
        downloadTask.setCurrentSize((long) (Double.parseDouble(downloadTask.getShowSize()) * 1024.0d * 1024.0d));
        boolean f5 = q1.f(downloadTask.getPackageName());
        boolean z4 = false;
        if (downloadTask.getFileType() != null && downloadTask.getFileType().equals(Dtype.chajian.name())) {
            r.b(context, downloadTask, Event.downloadPlugCompleted);
            String path = downloadTask.getPath();
            downloadTask.setGameZipPath(path);
            downloadTask.setStatus(11);
            try {
                downloadTask.setId(p1.f.K().F(downloadTask.getCrc_link_type_val()).getId());
                p1.f.K().m(downloadTask);
            } catch (Exception e5) {
                e5.printStackTrace();
            }
            com.join.android.app.common.servcie.i.e().k(downloadTask.getCrc_link_type_val());
            org.greenrobot.eventbus.c.f().o(new com.join.mgps.event.n(downloadTask, 11));
            int intValue = this.prefDef.insatllAppFirst().d().intValue();
            String d5 = this.prefDef.insatllAppFirstData().d();
            if (intValue > 0 && g2.i(d5) && isAppOnForeground()) {
                BootPageData bootPageData = (BootPageData) JsonMapper.getInstance().fromJson(d5, BootPageData.class);
                if (bootPageData != null && bootPageData.getGame_setup_boot() != null && downloadTask.getDown_type() == 0) {
                    ((PapaPlugGuideActivity_.c) PapaPlugGuideActivity_.k0(context).a(1).flags(268435456)).b(downloadTask.getCrc_link_type_val()).start();
                    this.prefDef.insatllAppFirst().g(Integer.valueOf(intValue - 1));
                } else if (ConstantIntEnum.PS2.value() != Integer.parseInt(downloadTask.getPlugin_num()) && ConstantIntEnum.N3DS.value() != Integer.parseInt(downloadTask.getPlugin_num())) {
                    if (downloadTask.getDown_type() == 2) {
                        if (com.join.android.app.common.utils.l.r(context, downloadTask, false, new String[0])) {
                            return;
                        }
                        com.join.android.app.common.servcie.i.e().q(context, downloadTask);
                        return;
                    }
                    APKUtils.k0(path, downloadTask, new Function1() { // from class: com.join.android.app.common.servcie.h
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            Unit lambda$onFinish$2;
                            lambda$onFinish$2 = DownloadBaseActivity.lambda$onFinish$2((String) obj);
                            return lambda$onFinish$2;
                        }
                    });
                } else {
                    com.join.android.app.common.servcie.i.e().q(context, downloadTask);
                }
            } else if (ConstantIntEnum.PS2.value() != Integer.parseInt(downloadTask.getPlugin_num()) && ConstantIntEnum.N3DS.value() != Integer.parseInt(downloadTask.getPlugin_num())) {
                if (downloadTask.getDown_type() == 2) {
                    if (com.join.android.app.common.utils.l.r(context, downloadTask, false, new String[0])) {
                        return;
                    }
                    com.join.android.app.common.servcie.i.e().q(context, downloadTask);
                    return;
                }
                APKUtils.k0(path, downloadTask, new Function1() { // from class: com.join.android.app.common.servcie.d
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit lambda$onFinish$3;
                        lambda$onFinish$3 = DownloadBaseActivity.this.lambda$onFinish$3((String) obj);
                        return lambda$onFinish$3;
                    }
                });
            } else {
                com.join.android.app.common.servcie.i.e().q(context, downloadTask);
            }
        } else if (downloadTask.getFileType() != null && downloadTask.getFileType().equals(Dtype.apk.name())) {
            if (!f5) {
                r.b(context, downloadTask, Event.gameDownloadCompleted);
            }
            com.join.android.app.common.servcie.i.e().r(context, downloadTask, true);
        } else {
            String str = "";
            if (downloadTask.getFileType() != null && downloadTask.getFileType().equals(Dtype.android.name()) && !APKUtils.L(downloadTask)) {
                if (Build.VERSION.SDK_INT < 30 && (downloadTask.getRomType().equals(Dtype.androidobb.name()) || downloadTask.getRomType().equals(Dtype.androiddata.name()) || downloadTask.getRomType().equals(Dtype.androidobbdata.name()))) {
                    if (!f5) {
                        r.b(context, downloadTask, Event.gameDownloadCompleted);
                    }
                    com.join.android.app.common.servcie.i.e().r(context, downloadTask, false);
                    return;
                }
                if (f5) {
                    String ext = downloadTask.getExt();
                    if (g2.i(ext) && (extBean3 = (ExtBean) JsonMapper.getInstance().fromJson(ext, ExtBean.class)) != null) {
                        str = extBean3.getQkPosition();
                    }
                    q1.t(this, Event.installSuccessQk, downloadTask.getCrc_link_type_val(), str);
                } else {
                    r.b(context, downloadTask, Event.gameDownloadCompleted);
                    r.b(context, downloadTask, Event.gameDownload);
                }
                String ext2 = downloadTask.getExt();
                if (g2.i(ext2) && (extBean2 = (ExtBean) JsonMapper.getInstance().fromJson(ext2, ExtBean.class)) != null) {
                    String recPosition = extBean2.getRecPosition();
                    if (g2.i(recPosition)) {
                        sendPointVolcanno(recPosition, downloadTask.getCrc_link_type_val(), extBean2.getVolcanoOther(), UtilsMy.k2(downloadTask.getTipBeans()));
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
                int intValue2 = this.prefDef.insatllAppFirst().d().intValue();
                String d6 = this.prefDef.insatllAppFirstData().d();
                if (intValue2 > 0 && g2.i(d6) && isAppOnForeground()) {
                    BootPageData bootPageData2 = (BootPageData) JsonMapper.getInstance().fromJson(d6, BootPageData.class);
                    if (bootPageData2 != null && bootPageData2.getGame_setup_boot() != null) {
                        ((PapaPlugGuideActivity_.c) PapaPlugGuideActivity_.k0(context).a(1).flags(268435456)).b(downloadTask.getCrc_link_type_val()).start();
                        this.prefDef.insatllAppFirst().g(Integer.valueOf(intValue2 - 1));
                    } else {
                        APKUtils.k0(path2, downloadTask, new Function1() { // from class: com.join.android.app.common.servcie.e
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                Unit lambda$onFinish$4;
                                lambda$onFinish$4 = DownloadBaseActivity.this.lambda$onFinish$4(downloadTask, (String) obj);
                                return lambda$onFinish$4;
                            }
                        });
                    }
                } else {
                    APKUtils.k0(path2, downloadTask, new Function1() { // from class: com.join.android.app.common.servcie.f
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            Unit lambda$onFinish$5;
                            lambda$onFinish$5 = DownloadBaseActivity.this.lambda$onFinish$5(downloadTask, (String) obj);
                            return lambda$onFinish$5;
                        }
                    });
                }
                downloadTask.setGameZipPath(path2);
                downloadTask.setStatus(11);
                UtilsMy.G3(context, downloadTask, 11);
                try {
                    downloadTask.setId(p1.f.K().F(downloadTask.getCrc_link_type_val()).getId());
                    p1.f.K().update(downloadTask);
                } catch (Exception e7) {
                    e7.printStackTrace();
                }
                com.join.android.app.common.servcie.i.e().k(downloadTask.getCrc_link_type_val());
                org.greenrobot.eventbus.c.f().o(new com.join.mgps.event.n(downloadTask, 11));
            } else if ((downloadTask.getFileType() == null || !Dtype.MOD.name().equals(downloadTask.getFileType())) && !APKUtils.L(downloadTask)) {
            } else {
                if ((downloadTask.getTask_down_type() != 0 && downloadTask.getTask_down_type() != 2) || (!downloadTask.getRomType().equals(Dtype.androidobb.name()) && !downloadTask.getRomType().equals(Dtype.androiddata.name()) && !downloadTask.getRomType().equals(Dtype.androidobbdata.name()))) {
                    if (f5) {
                        q1.t(this, Event.installSuccessQk, downloadTask.getCrc_link_type_val(), "");
                    } else {
                        r.b(context, downloadTask, Event.gameDownloadCompleted);
                        r.b(context, downloadTask, Event.gameDownload);
                    }
                    String ext3 = downloadTask.getExt();
                    if (g2.i(ext3) && (extBean = (ExtBean) JsonMapper.getInstance().fromJson(ext3, ExtBean.class)) != null) {
                        String recPosition2 = extBean.getRecPosition();
                        if (g2.i(recPosition2)) {
                            sendPointVolcanno(recPosition2, downloadTask.getCrc_link_type_val(), extBean.getVolcanoOther(), UtilsMy.k2(downloadTask.getTipBeans()));
                        }
                    }
                    if (downloadTask.getTask_down_type() != 0 && downloadTask.getTask_down_type() != 2) {
                        com.join.android.app.common.utils.e.l0(context);
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
                        int intValue3 = this.prefDef.insatllAppFirst().d().intValue();
                        String d7 = this.prefDef.insatllAppFirstData().d();
                        if (intValue3 > 0 && g2.i(d7) && isAppOnForeground()) {
                            BootPageData bootPageData3 = (BootPageData) JsonMapper.getInstance().fromJson(d7, BootPageData.class);
                            if (bootPageData3 != null && bootPageData3.getGame_setup_boot() != null && !z4) {
                                ((PapaPlugGuideActivity_.c) PapaPlugGuideActivity_.k0(context).a(1).flags(268435456)).b(downloadTask.getCrc_link_type_val()).start();
                                this.prefDef.insatllAppFirst().g(Integer.valueOf(intValue3 - 1));
                            } else {
                                APKUtils.k0(path3, downloadTask, new Function1() { // from class: com.join.android.app.common.servcie.a
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        Unit lambda$onFinish$6;
                                        lambda$onFinish$6 = DownloadBaseActivity.this.lambda$onFinish$6((String) obj);
                                        return lambda$onFinish$6;
                                    }
                                });
                            }
                        } else {
                            APKUtils.k0(path3, downloadTask, new Function1() { // from class: com.join.android.app.common.servcie.b
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    Unit lambda$onFinish$7;
                                    lambda$onFinish$7 = DownloadBaseActivity.this.lambda$onFinish$7((String) obj);
                                    return lambda$onFinish$7;
                                }
                            });
                        }
                        downloadTask.setGameZipPath(path3);
                    }
                    UtilsMy.G3(context, downloadTask, 5);
                    com.join.android.app.common.servcie.i.e().k(downloadTask.getCrc_link_type_val());
                    return;
                }
                r.b(context, downloadTask, Event.gameDownloadCompleted);
                com.join.android.app.common.servcie.i.e().r(context, downloadTask, false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.join.mgps.activity.MyFragmentActivity1, com.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    public void onProgressUpdate(Long... lArr) {
        try {
            if (System.currentTimeMillis() - this.lastDelay > this.delay || System.currentTimeMillis() - this.lastDelay < 0) {
                org.greenrobot.eventbus.c.f().o(new com.join.mgps.event.n(null, 8));
                this.lastDelay = System.currentTimeMillis();
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public void onStart(DownloadTask downloadTask) {
        downloadTask.setStatus(2);
        downloadTask.setSpeed("0");
        org.greenrobot.eventbus.c.f().o(new com.join.mgps.event.n(downloadTask, 2));
    }

    public void onStop(DownloadTask downloadTask) {
        if (com.join.android.app.common.servcie.i.e().f(downloadTask.getCrc_link_type_val()) == null || downloadTask.getStatus() == 7 || downloadTask.getStatus() == 6 || downloadTask.getStatus() == 5) {
            return;
        }
        p1.f.K().j0(downloadTask, 3);
        downloadTask.setStatus(3);
        org.greenrobot.eventbus.c.f().o(new com.join.mgps.event.n(downloadTask, 3));
        org.greenrobot.eventbus.c.f().o(new com.join.mgps.event.l(downloadTask.getCrc_link_type_val(), 38));
        r.b(context, downloadTask, Event.downloadStop);
    }

    void startDown(DetailResultBean detailResultBean) {
        DownloadTask downloadtaskDown;
        if (detailResultBean == null || (downloadtaskDown = detailResultBean.getDownloadtaskDown()) == null) {
            return;
        }
        UtilsMy.z1(downloadtaskDown, detailResultBean);
        if (UtilsMy.x0(downloadtaskDown.getPay_game_amount(), downloadtaskDown.getCrc_link_type_val()) > 0) {
            UtilsMy.d4(context, downloadtaskDown.getCrc_link_type_val());
        } else if (UtilsMy.o1(context, downloadtaskDown)) {
        } else {
            if (detailResultBean.getDown_status() == 5) {
                UtilsMy.l1(context, downloadtaskDown);
            } else {
                UtilsMy.R0(context, downloadtaskDown, downloadtaskDown.getTp_down_url(), downloadtaskDown.getOther_down_switch(), downloadtaskDown.getCdn_down_switch());
            }
        }
    }
}
