package com.join.mgps.activity;

import android.app.ActivityManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.BaseActivity;
import com.MApplication;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import com.facebook.drawee.view.SimpleDraweeView;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.github.snowdream.android.app.downloader.b;
import com.join.android.app.common.utils.APKUtils;
import com.join.android.app.common.utils.JsonMapper;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.customview.PictureHProgress;
import com.join.mgps.dto.ModInfoBean;
import com.join.mgps.dto.SingleGameModInfoBean;
import com.join.mgps.mod.bean.ModMeta;
import com.join.mgps.pref.PrefDef_;
import com.join.mgps.va.service.MessengerService;
import com.papa91.arc.ext.ToastManager;
import com.papa91.arc.util.FileUtils;
import com.uc.crashsdk.export.LogType;
import com.xinzhu.overmind.Overmind;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.Extra;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
@EActivity(R.layout.activity_mini_game_loading)
/* loaded from: classes.dex */
public class MiniGameLoadingActivity extends BaseActivity {
    public static final String D = "_mod_info";
    private static com.github.snowdream.android.app.downloader.b E = null;
    static b.InterfaceC0290b F = null;
    private static Map<String, com.github.snowdream.android.app.downloader.c> G = new ConcurrentHashMap(0);
    public static int H = 0;
    public static final int I = 2;
    @ViewById

    /* renamed from: b  reason: collision with root package name */
    View f35112b;
    @Extra

    /* renamed from: c  reason: collision with root package name */
    String f35113c;
    @ViewById

    /* renamed from: d  reason: collision with root package name */
    SimpleDraweeView f35114d;
    @ViewById

    /* renamed from: e  reason: collision with root package name */
    TextView f35115e;
    @ViewById

    /* renamed from: f  reason: collision with root package name */
    TextView f35116f;
    @ViewById

    /* renamed from: g  reason: collision with root package name */
    TextView f35117g;
    @ViewById

    /* renamed from: h  reason: collision with root package name */
    TextView f35118h;
    @ViewById

    /* renamed from: i  reason: collision with root package name */
    PictureHProgress f35119i;
    @ViewById

    /* renamed from: j  reason: collision with root package name */
    LinearLayout f35120j;

    /* renamed from: k  reason: collision with root package name */
    DownloadTask f35121k;

    /* renamed from: l  reason: collision with root package name */
    String f35122l;

    /* renamed from: m  reason: collision with root package name */
    String f35123m;

    /* renamed from: n  reason: collision with root package name */
    String f35124n;

    /* renamed from: o  reason: collision with root package name */
    int f35125o;

    /* renamed from: p  reason: collision with root package name */
    int f35126p;

    /* renamed from: q  reason: collision with root package name */
    int f35127q;

    /* renamed from: r  reason: collision with root package name */
    f f35128r;

    /* renamed from: s  reason: collision with root package name */
    boolean f35129s = false;

    /* renamed from: t  reason: collision with root package name */
    List<String> f35130t = new ArrayList();

    /* renamed from: u  reason: collision with root package name */
    List<String> f35131u = new ArrayList();

    /* renamed from: v  reason: collision with root package name */
    boolean f35132v = false;

    /* renamed from: w  reason: collision with root package name */
    private boolean f35133w = false;

    /* renamed from: x  reason: collision with root package name */
    private String f35134x = "";

    /* renamed from: y  reason: collision with root package name */
    private long f35135y = 0;

    /* renamed from: z  reason: collision with root package name */
    private Executor f35136z = new ThreadPoolExecutor(1, 2, 0, TimeUnit.MILLISECONDS, new LinkedBlockingQueue());
    g A = null;
    @Extra
    boolean B = false;
    boolean C = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                for (ActivityManager.RunningServiceInfo runningServiceInfo : ((ActivityManager) MiniGameLoadingActivity.this.getSystemService(TTDownloadField.TT_ACTIVITY)).getRunningServices(Integer.MAX_VALUE)) {
                    if (runningServiceInfo.service.getClassName().equals(MessengerService.class.getName())) {
                        com.join.mgps.Util.w0.a("messenger service is running", new Object[0]);
                        return;
                    }
                }
                com.join.mgps.Util.w0.a("start messenger service", new Object[0]);
                MiniGameLoadingActivity.this.startService(new Intent(MiniGameLoadingActivity.this, MessengerService.class));
            } catch (SecurityException e5) {
                e5.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.join.mgps.va.overmind.d.o().d0();
            MiniGameLoadingActivity.this.J0();
            if (com.join.mgps.va.overmind.d.o().N(MiniGameLoadingActivity.this.f35122l)) {
                MiniGameLoadingActivity.this.A0();
                return;
            }
            com.join.mgps.va.overmind.d o4 = com.join.mgps.va.overmind.d.o();
            MiniGameLoadingActivity miniGameLoadingActivity = MiniGameLoadingActivity.this;
            o4.m(miniGameLoadingActivity, miniGameLoadingActivity.f35122l, miniGameLoadingActivity.f35123m, miniGameLoadingActivity.f35124n, miniGameLoadingActivity.f35125o, miniGameLoadingActivity.f35126p == 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class c implements b.InterfaceC0290b {

        /* loaded from: classes4.dex */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                MiniGameLoadingActivity.this.L0(true);
                MiniGameLoadingActivity.this.M0(true);
            }
        }

        /* loaded from: classes4.dex */
        class b implements Runnable {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ String f35141b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ int f35142c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ String f35143d;

            b(String str, int i4, String str2) {
                this.f35141b = str;
                this.f35142c = i4;
                this.f35143d = str2;
            }

            @Override // java.lang.Runnable
            public void run() {
                com.github.snowdream.android.app.downloader.c cVar = (com.github.snowdream.android.app.downloader.c) MiniGameLoadingActivity.G.get(this.f35141b);
                if (cVar != null) {
                    MiniGameLoadingActivity.this.f35119i.setProgress(this.f35142c);
                    MiniGameLoadingActivity miniGameLoadingActivity = MiniGameLoadingActivity.this;
                    TextView textView = miniGameLoadingActivity.f35116f;
                    String string = miniGameLoadingActivity.getResources().getString(R.string.s_mod_progress_status_1);
                    textView.setText(String.format(string, UtilsMy.c(cVar.g()) + "", UtilsMy.c(cVar.i()) + "", this.f35142c + "%"));
                    MiniGameLoadingActivity miniGameLoadingActivity2 = MiniGameLoadingActivity.this;
                    TextView textView2 = miniGameLoadingActivity2.f35117g;
                    String string2 = miniGameLoadingActivity2.getResources().getString(R.string.s_mod_progress_status_2);
                    textView2.setText(String.format(string2, UtilsMy.c(cVar.i()) + "", this.f35143d + "", "v" + MiniGameLoadingActivity.this.f35124n));
                }
            }
        }

        /* renamed from: com.join.mgps.activity.MiniGameLoadingActivity$c$c  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        class RunnableC0333c implements Runnable {
            RunnableC0333c() {
            }

            @Override // java.lang.Runnable
            public void run() {
                MiniGameLoadingActivity.this.L0(false);
                MiniGameLoadingActivity.this.M0(false);
            }
        }

        c() {
        }

        @Override // com.github.snowdream.android.app.downloader.b.InterfaceC0290b
        public void onError(String str) {
            MiniGameLoadingActivity.this.N0();
        }

        @Override // com.github.snowdream.android.app.downloader.b.InterfaceC0290b
        public void onFinish(String str) {
            com.join.mgps.Util.w0.a("onFinish onStart - " + str, new Object[0]);
            com.github.snowdream.android.app.downloader.c cVar = (com.github.snowdream.android.app.downloader.c) MiniGameLoadingActivity.G.get(str);
            if (cVar != null) {
                if (MiniGameLoadingActivity.this.f35121k.isMod()) {
                    if (com.join.mgps.Util.g2.i(MiniGameLoadingActivity.this.f35134x)) {
                        ModInfoBean modInfoBean = (ModInfoBean) JsonMapper.getInstance().fromJson(MiniGameLoadingActivity.this.f35134x, ModInfoBean.class);
                        if (modInfoBean != null) {
                            MiniGameLoadingActivity.this.f35121k.setResource_url_remote(modInfoBean.getDown_url());
                            modInfoBean.setStatus(14);
                            MiniGameLoadingActivity.this.f35121k.setMod_info(JsonMapper.toJsonString(modInfoBean));
                        } else {
                            MiniGameLoadingActivity miniGameLoadingActivity = MiniGameLoadingActivity.this;
                            miniGameLoadingActivity.f35121k.setMod_info(JsonMapper.toJsonString(miniGameLoadingActivity.f35134x));
                        }
                    }
                } else if (APKUtils.K(MiniGameLoadingActivity.this.f35121k) && com.join.mgps.Util.g2.i(MiniGameLoadingActivity.this.f35134x)) {
                    SingleGameModInfoBean singleGameModInfoBean = (SingleGameModInfoBean) JsonMapper.getInstance().fromJson(MiniGameLoadingActivity.this.f35134x, SingleGameModInfoBean.class);
                    if (singleGameModInfoBean != null) {
                        MiniGameLoadingActivity.this.f35121k.setResource_url_remote(singleGameModInfoBean.getDownUrl());
                        singleGameModInfoBean.setStatus(14);
                        MiniGameLoadingActivity.this.f35121k.setSingle_game_mod_info(JsonMapper.toJsonString(singleGameModInfoBean));
                    } else {
                        MiniGameLoadingActivity miniGameLoadingActivity2 = MiniGameLoadingActivity.this;
                        miniGameLoadingActivity2.f35121k.setSingle_game_mod_info(JsonMapper.toJsonString(miniGameLoadingActivity2.f35134x));
                    }
                }
                MiniGameLoadingActivity miniGameLoadingActivity3 = MiniGameLoadingActivity.this;
                miniGameLoadingActivity3.f35123m = cVar.h() + cVar.k();
                MiniGameLoadingActivity miniGameLoadingActivity4 = MiniGameLoadingActivity.this;
                miniGameLoadingActivity4.f35121k.setResource_path(miniGameLoadingActivity4.f35123m);
                p1.f.K().m(MiniGameLoadingActivity.this.f35121k);
            }
            MiniGameLoadingActivity.this.runOnUiThread(new RunnableC0333c());
            MiniGameLoadingActivity.this.N0();
            MiniGameLoadingActivity.G.remove(str);
        }

        @Override // com.github.snowdream.android.app.downloader.b.InterfaceC0290b
        public void onProgress(String str, int i4, String str2) {
            MiniGameLoadingActivity.this.runOnUiThread(new b(str, i4, str2));
        }

        @Override // com.github.snowdream.android.app.downloader.b.InterfaceC0290b
        public void onStart(String str) {
            com.join.mgps.Util.w0.a("PreDownloadPlug onStart - " + str, new Object[0]);
            MiniGameLoadingActivity.this.runOnUiThread(new a());
        }

        @Override // com.github.snowdream.android.app.downloader.b.InterfaceC0290b
        public void onStop(String str) {
        }

        @Override // com.github.snowdream.android.app.downloader.b.InterfaceC0290b
        public void onWait(String str) {
        }

        @Override // com.github.snowdream.android.app.downloader.b.InterfaceC0290b
        public void updateSize(String str, long j4) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class d implements Runnable {

        /* loaded from: classes4.dex */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                MiniGameLoadingActivity.this.f35119i.setProgress(0);
                MiniGameLoadingActivity miniGameLoadingActivity = MiniGameLoadingActivity.this;
                miniGameLoadingActivity.f35116f.setText(String.format(miniGameLoadingActivity.getResources().getString(R.string.s_mod_progress_status_3), "0%"));
            }
        }

        d() {
        }

        @Override // java.lang.Runnable
        public synchronized void run() {
            MiniGameLoadingActivity.this.f35130t.add("copyExtFile");
            com.join.mgps.va.overmind.f fVar = com.join.mgps.va.overmind.f.f54952a;
            String M = fVar.M(MiniGameLoadingActivity.this.f35122l);
            MiniGameLoadingActivity.this.f35135y = FileUtils.fileSize(M);
            Bundle bundle = new Bundle();
            bundle.putString("modPath", MiniGameLoadingActivity.this.f35123m);
            bundle.putString("gameId", MiniGameLoadingActivity.this.f35113c);
            bundle.putLong("obbSize", MiniGameLoadingActivity.this.f35135y);
            MiniGameLoadingActivity miniGameLoadingActivity = MiniGameLoadingActivity.this;
            com.join.mgps.va.overmind.h.a(miniGameLoadingActivity.f35122l, miniGameLoadingActivity.f35127q, bundle);
            if (MiniGameLoadingActivity.this.f35135y == 0) {
                MiniGameLoadingActivity.this.f35131u.add("copyExtFile");
                Overmind.getContext().sendBroadcast(new Intent(com.join.mgps.mod.utils.d.f53637t));
                return;
            }
            long h4 = com.join.mgps.va.overmind.d.o().h(fVar.O(MiniGameLoadingActivity.this.f35122l));
            MiniGameLoadingActivity.this.w0();
            if (MiniGameLoadingActivity.this.f35135y != h4) {
                MiniGameLoadingActivity.this.runOnUiThread(new a());
            } else {
                MiniGameLoadingActivity.this.f35131u.add("copyExtFile");
                Overmind.getContext().sendBroadcast(new Intent(com.join.mgps.mod.utils.d.f53637t));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class e implements Runnable {

        /* loaded from: classes4.dex */
        class a implements Runnable {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ int f35149b;

            a(int i4) {
                this.f35149b = i4;
            }

            @Override // java.lang.Runnable
            public void run() {
                MiniGameLoadingActivity.this.f35119i.setProgress(this.f35149b);
                MiniGameLoadingActivity miniGameLoadingActivity = MiniGameLoadingActivity.this;
                TextView textView = miniGameLoadingActivity.f35116f;
                String string = miniGameLoadingActivity.getResources().getString(R.string.s_mod_progress_status_3);
                textView.setText(String.format(string, this.f35149b + "%"));
            }
        }

        e() {
        }

        @Override // java.lang.Runnable
        public synchronized void run() {
            while (!MiniGameLoadingActivity.this.f35133w) {
                try {
                    long h4 = com.join.mgps.va.overmind.d.o().h(com.join.mgps.va.overmind.f.f54952a.O(MiniGameLoadingActivity.this.f35122l));
                    MiniGameLoadingActivity miniGameLoadingActivity = MiniGameLoadingActivity.this;
                    miniGameLoadingActivity.f35133w = h4 >= miniGameLoadingActivity.f35135y;
                    int i4 = MiniGameLoadingActivity.this.f35135y == 0 ? 100 : (int) ((h4 / MiniGameLoadingActivity.this.f35135y) * 100);
                    Thread.currentThread();
                    Thread.sleep(1000L);
                    MiniGameLoadingActivity.this.runOnUiThread(new a(i4));
                } catch (InterruptedException e5) {
                    e5.printStackTrace();
                }
            }
            MiniGameLoadingActivity.this.f35131u.add("copyExtFile");
            Overmind.getContext().sendBroadcast(new Intent(com.join.mgps.mod.utils.d.f53637t));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class f extends BroadcastReceiver {
        f() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            if (action.equals(com.join.mgps.mod.utils.d.f53636s)) {
                String stringExtra = intent.getStringExtra("soName");
                if (TextUtils.isEmpty(stringExtra)) {
                    return;
                }
                MiniGameLoadingActivity.this.f35130t.add(stringExtra);
            } else if (action.equals(com.join.mgps.mod.utils.d.f53637t)) {
                String stringExtra2 = intent.getStringExtra("soName");
                if (TextUtils.isEmpty(stringExtra2)) {
                    MiniGameLoadingActivity.this.f35129s = true;
                    MiniGameLoadingActivity.this.z0();
                    return;
                }
                MiniGameLoadingActivity.this.f35131u.add(stringExtra2);
                MiniGameLoadingActivity miniGameLoadingActivity = MiniGameLoadingActivity.this;
                if (miniGameLoadingActivity.f35129s) {
                    miniGameLoadingActivity.z0();
                }
            } else if (action.equals(com.join.mgps.mod.utils.d.f53639v)) {
                MiniGameLoadingActivity.this.finish();
            } else if (action.equals(com.join.mgps.mod.utils.d.f53638u)) {
                MiniGameLoadingActivity.H++;
                com.join.mgps.Util.h0.i(MiniGameLoadingActivity.this.f35123m);
                com.join.mgps.Util.h0.i(com.join.mgps.Util.v.f28107g + "mod/" + MiniGameLoadingActivity.this.f35121k.getPackageName() + "/oat");
                if (com.join.mgps.Util.g2.i(MiniGameLoadingActivity.this.f35134x) && !com.join.android.app.common.utils.j.j(MiniGameLoadingActivity.this) && MiniGameLoadingActivity.H < 2) {
                    MiniGameLoadingActivity miniGameLoadingActivity2 = MiniGameLoadingActivity.this;
                    miniGameLoadingActivity2.y0(miniGameLoadingActivity2.f35113c);
                    return;
                }
                MiniGameLoadingActivity.this.N0();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class g extends Thread {

        /* renamed from: b  reason: collision with root package name */
        private boolean f35152b = true;

        public g() {
        }

        public void a(boolean z4) {
            this.f35152b = z4;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            float f5;
            float f6;
            super.run();
            System.out.println("progress1 开始");
            try {
                Random random = new Random();
                int nextInt = random.nextInt(10) + 70;
                int nextInt2 = random.nextInt(10) + 80;
                int i4 = 0;
                int i5 = 0;
                while (this.f35152b && i4 < 100) {
                    if (i5 < 3) {
                        f5 = nextInt;
                        f6 = 3.0f;
                    } else if (i5 < 3 || i5 >= 15) {
                        this.f35152b = false;
                        MiniGameLoadingActivity.this.R0(i4);
                        i5++;
                        Thread.sleep(1000L);
                    } else {
                        f5 = nextInt2 - nextInt;
                        f6 = 12.0f;
                    }
                    i4 = (int) (i4 + (f5 / f6));
                    MiniGameLoadingActivity.this.R0(i4);
                    i5++;
                    Thread.sleep(1000L);
                }
                MiniGameLoadingActivity.this.R0(100);
            } catch (InterruptedException e5) {
                e5.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void A0() {
        new Thread(new d()).start();
    }

    private void B0() {
        if (getIntent() != null) {
            this.B = getIntent().getBooleanExtra("isLaunchApp", false);
        }
        DownloadTask F2 = p1.f.K().F(this.f35113c);
        this.f35121k = F2;
        if (F2 == null) {
            ToastManager.show("游戏数据获取错误");
            finish();
            return;
        }
        MyImageLoader.n(this.f35114d, F2.getPortraitURL());
        this.f35115e.setText(this.f35121k.getShowName());
        if (this.B) {
            this.f35122l = getIntent().getStringExtra("packageName");
            this.f35123m = getIntent().getStringExtra("modPath");
            this.f35124n = getIntent().getStringExtra("modVersion");
            this.f35125o = getIntent().getIntExtra("modCode", 0);
            this.f35126p = getIntent().getIntExtra("modType", 0);
            this.f35127q = getIntent().getIntExtra("userId", 0);
            this.f35134x = getIntent().getStringExtra("_mod_info");
            if (TextUtils.isEmpty(this.f35122l)) {
                finish();
                return;
            }
            new PrefDef_(this).lastLaunchModGameId().g(this.f35113c);
            this.f35128r = new f();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction(com.join.mgps.mod.utils.d.f53636s);
            intentFilter.addAction(com.join.mgps.mod.utils.d.f53637t);
            intentFilter.addAction(com.join.mgps.mod.utils.d.f53638u);
            intentFilter.addAction(com.join.mgps.mod.utils.d.f53639v);
            registerReceiver(this.f35128r, intentFilter);
            y0(this.f35113c);
            K0();
            M0(false);
            this.f35116f.setText("启动中...");
        } else {
            L0(true);
            M0(true);
        }
        Q0(this.B);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void C0() {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void D0(Handler handler) {
        if (com.join.mgps.va.overmind.d.o().N(this.f35122l)) {
            com.join.mgps.va.overmind.f fVar = com.join.mgps.va.overmind.f.f54952a;
            String[] strArr = {fVar.M(this.f35122l), fVar.v(this.f35122l), fVar.W()};
            for (int i4 = 0; i4 < 3; i4++) {
                com.join.mgps.Util.h0.i(strArr[i4]);
            }
        }
        handler.postDelayed(new Runnable() { // from class: com.join.mgps.activity.m1
            @Override // java.lang.Runnable
            public final void run() {
                MiniGameLoadingActivity.this.C0();
            }
        }, 5000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void E0(final Handler handler) {
        if (this.f35132v || isFinishing()) {
            return;
        }
        this.f35132v = true;
        com.join.mgps.va.overmind.d.o().U(this, this.f35127q, this.f35122l);
        new Thread(new Runnable() { // from class: com.join.mgps.activity.o1
            @Override // java.lang.Runnable
            public final void run() {
                MiniGameLoadingActivity.this.D0(handler);
            }
        }).start();
        g gVar = this.A;
        if (gVar != null) {
            gVar.a(false);
            this.A = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Unit F0(DownloadTask downloadTask) {
        P0(downloadTask);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void G0(String str) {
        com.join.mgps.Util.l2.a(this).b(str);
    }

    private void H0() {
        final DownloadTask F2;
        if (com.join.mgps.Util.g2.i(this.f35113c) && (F2 = p1.f.K().F(this.f35113c)) != null && F2.isMiniGame() && F2.isSingleGame()) {
            if (com.join.mgps.va.overmind.d.o().N(F2.getPackageName()) && (APKUtils.b(this, F2) || APKUtils.g(this, new Function0() { // from class: com.join.mgps.activity.q1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit F0;
                    F0 = MiniGameLoadingActivity.this.F0(F2);
                    return F0;
                }
            }))) {
                return;
            }
            P0(F2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0076, code lost:
        r6 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void J0() {
        /*
            Method dump skipped, instructions count: 304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.mgps.activity.MiniGameLoadingActivity.J0():void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void L0(boolean z4) {
        this.f35119i.setVisibility(z4 ? 0 : 4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void M0(boolean z4) {
        this.f35117g.setVisibility(z4 ? 0 : 4);
    }

    private boolean P0(DownloadTask downloadTask) {
        int i4;
        if (com.join.mgps.va.overmind.d.o().F(downloadTask.getPackageName())) {
            ModInfoBean modInfoBean = (ModInfoBean) JsonMapper.getInstance().fromJson(downloadTask.getMod_info(), ModInfoBean.class);
            ModMeta modMeta = new ModMeta();
            modMeta.setPackageName(downloadTask.getPackageName());
            modMeta.setModPath(downloadTask.getResource_path());
            if (modInfoBean != null) {
                modMeta.setModVersion(modInfoBean.getVer() + "");
                modMeta.setModCode(modInfoBean.getVer());
            }
            modMeta.setGameId(downloadTask.getCrc_link_type_val());
            modMeta.setModType(0);
            modMeta.setAndroidId(com.join.android.app.common.utils.n.n(MApplication.f1497x).e(MApplication.f1497x));
            modMeta.setPlatform("wufun");
            modMeta.setPackage_type("wufun");
            modMeta.setTypeId(UtilsMy.a2(downloadTask));
            try {
                com.join.mgps.va.overmind.d.b0(downloadTask.getPackageName(), downloadTask.getResource_path());
            } catch (Exception e5) {
                e5.printStackTrace();
            }
            com.join.mgps.va.overmind.d.o().W(this, modMeta, downloadTask);
            if (APKUtils.G(downloadTask)) {
                i4 = 1;
            } else {
                i4 = APKUtils.L(downloadTask) ? 2 : 0;
            }
            com.papa.sim.statistic.p.l(this).h1(downloadTask.getCrc_link_type_val(), AccountUtil_.getInstance_(this).getUid(), i4, downloadTask.get_from(), downloadTask.get_from_type(), downloadTask.getExt());
            if (downloadTask.getModInfoBean() != null) {
                UtilsMy.t4(this, downloadTask.getModInfoBean().getMain_game_id());
            } else {
                UtilsMy.t4(this, downloadTask.getCrc_link_type_val());
            }
            return true;
        }
        return false;
    }

    private void Q0(boolean z4) {
        if (z4) {
            this.f35118h.setVisibility(4);
            this.f35120j.setVisibility(4);
            return;
        }
        this.f35118h.setVisibility(0);
        this.f35120j.setVisibility(0);
    }

    private void receiveDelete(DownloadTask downloadTask) {
        if (downloadTask != null && this.f35113c.equals(downloadTask.getCrc_link_type_val())) {
            ToastManager.show("下载文件已删除");
            finish();
        }
    }

    private void receiveError(DownloadTask downloadTask) {
        if (downloadTask == null) {
            return;
        }
        try {
            if (TextUtils.isEmpty(downloadTask.getCrc_link_type_val()) || !downloadTask.getCrc_link_type_val().equals(this.f35113c)) {
                return;
            }
            UtilsMy.x4(downloadTask);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    private void receiveStart(DownloadTask downloadTask) {
        if (downloadTask != null && this.f35113c.equals(downloadTask.getCrc_link_type_val())) {
            this.f35121k = downloadTask;
        }
    }

    private void receiveSuccess(DownloadTask downloadTask) {
        if (downloadTask != null && this.f35113c.equals(downloadTask.getCrc_link_type_val())) {
            this.f35117g.setText("");
            this.f35119i.setProgress(100);
        }
    }

    private void setStatusBar() {
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 21) {
            Window window = getWindow();
            window.clearFlags(TTAdConstant.KEY_CLICK_AREA);
            window.getDecorView().setSystemUiVisibility(LogType.UNEXP_ANR);
            window.addFlags(Integer.MIN_VALUE);
            window.setStatusBarColor(0);
        } else if (i4 >= 19) {
            getWindow().addFlags(TTAdConstant.KEY_CLICK_AREA);
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f35112b.getLayoutParams();
        if (i4 >= 21) {
            layoutParams.height = com.join.android.app.common.utils.n.v(this);
        }
        this.f35112b.setLayoutParams(layoutParams);
    }

    private void updateProgressPartly() {
        DownloadTask downloadTask = this.f35121k;
        if (downloadTask != null) {
            if (downloadTask.getStatus() != 2 && this.f35121k.getStatus() != 12) {
                if (this.f35121k.getStatus() == 5 && !this.B && this.f35113c.equals(this.f35121k.getCrc_link_type_val())) {
                    this.f35119i.setProgress(100);
                    this.f35117g.setText("");
                    return;
                }
                return;
            }
            try {
                if (this.f35113c.equals(this.f35121k.getCrc_link_type_val())) {
                    DownloadTask f5 = com.join.android.app.common.servcie.i.e().f(this.f35121k.getCrc_link_type_val());
                    this.f35119i.setProgress((int) f5.getProgress());
                    TextView textView = this.f35116f;
                    textView.setText("游戏加载中 " + f5.getProgress() + "% \n体验后可对游戏进行评价哦");
                    TextView textView2 = this.f35117g;
                    textView2.setText("当前网速 " + f5.getSpeed() + "/s");
                }
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w0() {
        new Thread(new e()).start();
    }

    boolean I0(DownloadTask downloadTask) {
        ModInfoBean modInfoBean;
        if (downloadTask == null) {
            return false;
        }
        if (!APKUtils.L(downloadTask)) {
            return APKUtils.G(downloadTask) && (modInfoBean = downloadTask.getModInfoBean()) != null && !TextUtils.isEmpty(modInfoBean.getDown_url()) && modInfoBean.getStatus() == 9;
        }
        SingleGameModInfoBean singleGameModInfoBean = downloadTask.getSingleGameModInfoBean();
        return (singleGameModInfoBean == null || TextUtils.isEmpty(singleGameModInfoBean.getDownUrl()) || singleGameModInfoBean.getStatus() != 9) ? false : true;
    }

    void K0() {
        this.f35136z.execute(new a());
    }

    void N0() {
        if (this.B && !this.C) {
            L0(true);
            g gVar = this.A;
            if (gVar != null) {
                gVar.a(false);
                this.A = null;
            }
            g gVar2 = new g();
            this.A = gVar2;
            gVar2.a(true);
            this.A.start();
        }
        this.f35136z.execute(new b());
    }

    void O0(DownloadTask downloadTask) {
        initPreDownloadFactory();
        String str = "";
        boolean L = APKUtils.L(downloadTask);
        if (L) {
            SingleGameModInfoBean singleGameModInfoBean = downloadTask.getSingleGameModInfoBean();
            if (singleGameModInfoBean != null) {
                str = singleGameModInfoBean.getDownUrl();
            }
        } else {
            ModInfoBean modInfoBean = downloadTask.getModInfoBean();
            if (modInfoBean != null) {
                str = modInfoBean.getDown_url();
            }
        }
        String str2 = str;
        if (TextUtils.isEmpty(str2)) {
            StringBuilder sb = new StringBuilder();
            sb.append(downloadTask.getShowName());
            sb.append(", mod url null error, vm=");
            sb.append(L);
            N0();
            return;
        }
        com.github.snowdream.android.app.downloader.c cVar = new com.github.snowdream.android.app.downloader.c(str2, com.join.mgps.Util.x0.d(str2) + ".mod", com.join.mgps.Util.v.f28107g + "mod/" + downloadTask.getPackageName() + net.lingala.zip4j.util.e.F0, 0L);
        E.b(cVar);
        if (G == null || cVar.l() == null || cVar.l().equals("")) {
            return;
        }
        String l4 = cVar.l();
        if (G.get(cVar.l()) != null) {
            return;
        }
        synchronized (G) {
            G.put(l4, cVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void R0(int i4) {
        this.f35119i.setProgress(i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterViews() {
        com.join.mgps.Util.d0.a().d(this);
        setStatusBar();
        if (com.join.mgps.Util.g2.h(this.f35113c)) {
            ToastManager.show("游戏信息获取失败，请重试");
            finish();
            return;
        }
        B0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click({R.id.ll_back})
    public void back() {
        finish();
    }

    public void initPreDownloadFactory() {
        E = com.github.snowdream.android.app.downloader.b.e();
        c cVar = new c();
        F = cVar;
        E.m(cVar);
    }

    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        org.greenrobot.eventbus.c.f().y(this);
        super.onDestroy();
        this.f35132v = false;
        f fVar = this.f35128r;
        if (fVar != null) {
            unregisterReceiver(fVar);
        }
        g gVar = this.A;
        if (gVar != null) {
            gVar.a(false);
            this.A = null;
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onEventMainThread(com.join.mgps.event.n nVar) {
        DownloadTask a5 = nVar.a();
        int c5 = nVar.c();
        if (c5 == 2) {
            updateUI(a5, 1);
        } else if (c5 == 3) {
            updateUI(a5, 2);
        } else if (c5 == 5) {
            updateUI(a5, 5);
            this.C = true;
            H0();
        } else if (c5 == 6) {
            updateUI(a5, 6);
        } else if (c5 == 7) {
            updateUI(a5, 3);
        } else if (c5 == 8) {
            updateProgressPartly();
        } else if (c5 != 48) {
            switch (c5) {
                case 10:
                    updateUI(a5, 7);
                    return;
                case 11:
                    updateUI(a5, 5);
                    finish();
                    return;
                case 12:
                    updateUI(a5, 8);
                    return;
                case 13:
                    updateUI(a5, 9);
                    return;
                default:
                    return;
            }
        } else if (a5 == null || !this.f35113c.equals(a5.getCrc_link_type_val())) {
        } else {
            this.f35116f.setText("游戏安装中...\n体验后可对游戏进行评价哦");
            this.f35117g.setVisibility(4);
            this.f35119i.setVisibility(4);
            this.f35118h.setVisibility(4);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        B0();
    }

    void showToast(final String str) {
        runOnUiThread(new Runnable() { // from class: com.join.mgps.activity.p1
            @Override // java.lang.Runnable
            public final void run() {
                MiniGameLoadingActivity.this.G0(str);
            }
        });
    }

    void updateUI(DownloadTask downloadTask, int i4) {
        if (downloadTask != null) {
            switch (i4) {
                case 1:
                case 2:
                case 7:
                case 8:
                case 9:
                    receiveStart(downloadTask);
                    return;
                case 3:
                    receiveDelete(downloadTask);
                    return;
                case 4:
                default:
                    return;
                case 5:
                    receiveSuccess(downloadTask);
                    return;
                case 6:
                    receiveError(downloadTask);
                    return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click({R.id.tv_cancel})
    public void x0() {
        DownloadTask downloadTask = this.f35121k;
        if (downloadTask != null) {
            com.php25.PDownload.d.i(downloadTask);
        }
        finish();
    }

    void y0(String str) {
        DownloadTask downloadTask;
        if (TextUtils.isEmpty(str)) {
            showToast("游戏信息[ID]缺失");
            finish();
            return;
        }
        this.f35121k = p1.f.K().F(str);
        if ((com.join.mgps.Util.g2.i(this.f35134x) && com.join.android.app.common.utils.j.j(this) && (downloadTask = this.f35121k) != null && (com.join.mgps.Util.g2.h(downloadTask.getResource_path()) || !com.join.mgps.Util.h0.x(this.f35121k.getResource_path()))) || I0(this.f35121k)) {
            O0(this.f35121k);
        } else {
            N0();
        }
    }

    synchronized void z0() {
        boolean z4 = true;
        Iterator<String> it2 = this.f35130t.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            if (!this.f35131u.contains(it2.next())) {
                z4 = false;
                break;
            }
        }
        if (z4) {
            final Handler handler = new Handler();
            handler.postDelayed(new Runnable() { // from class: com.join.mgps.activity.n1
                @Override // java.lang.Runnable
                public final void run() {
                    MiniGameLoadingActivity.this.E0(handler);
                }
            }, 2000L);
        }
    }
}
