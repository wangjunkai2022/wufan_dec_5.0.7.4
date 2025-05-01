package com.join.mgps.mod.activity;

import android.app.ActivityManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.drawable.AnimationDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.activity.ComponentActivity;
import androidx.annotation.Nullable;
import com.MApplication;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.github.snowdream.android.app.downloader.b;
import com.join.android.app.common.utils.APKUtils;
import com.join.android.app.common.utils.JsonMapper;
import com.join.android.app.common.utils.j;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.Util.g2;
import com.join.mgps.Util.h0;
import com.join.mgps.Util.l2;
import com.join.mgps.Util.v;
import com.join.mgps.Util.w0;
import com.join.mgps.Util.x0;
import com.join.mgps.dto.ModInfoBean;
import com.join.mgps.dto.SingleGameModInfoBean;
import com.join.mgps.va.service.MessengerService;
import com.papa91.arc.util.FileUtils;
import com.xinzhu.overmind.Overmind;
import com.xinzhu.overmind.shared.OMProxyActivity;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* loaded from: classes3.dex */
public class ModLoadingActivity extends ComponentActivity implements View.OnSystemUiVisibilityChangeListener {
    public static final String B = "_mod_info";
    private static com.github.snowdream.android.app.downloader.b C = null;
    static b.InterfaceC0290b D = null;
    private static Map<String, com.github.snowdream.android.app.downloader.c> E = new ConcurrentHashMap(0);
    public static int F = 0;
    public static final int G = 2;
    private BroadcastReceiver A;

    /* renamed from: b  reason: collision with root package name */
    String f53550b;

    /* renamed from: c  reason: collision with root package name */
    String f53551c;

    /* renamed from: d  reason: collision with root package name */
    String f53552d;

    /* renamed from: e  reason: collision with root package name */
    String f53553e;

    /* renamed from: f  reason: collision with root package name */
    int f53554f;

    /* renamed from: g  reason: collision with root package name */
    int f53555g;

    /* renamed from: h  reason: collision with root package name */
    int f53556h;

    /* renamed from: i  reason: collision with root package name */
    String f53557i;

    /* renamed from: j  reason: collision with root package name */
    g f53558j;

    /* renamed from: o  reason: collision with root package name */
    private DownloadTask f53563o;

    /* renamed from: p  reason: collision with root package name */
    private LinearLayout f53564p;

    /* renamed from: q  reason: collision with root package name */
    private ProgressBar f53565q;

    /* renamed from: r  reason: collision with root package name */
    private TextView f53566r;

    /* renamed from: s  reason: collision with root package name */
    private TextView f53567s;

    /* renamed from: w  reason: collision with root package name */
    private ImageView f53571w;

    /* renamed from: x  reason: collision with root package name */
    private TextView f53572x;

    /* renamed from: z  reason: collision with root package name */
    AnimationDrawable f53574z;

    /* renamed from: k  reason: collision with root package name */
    boolean f53559k = false;

    /* renamed from: l  reason: collision with root package name */
    List<String> f53560l = new ArrayList();

    /* renamed from: m  reason: collision with root package name */
    List<String> f53561m = new ArrayList();

    /* renamed from: n  reason: collision with root package name */
    boolean f53562n = false;

    /* renamed from: t  reason: collision with root package name */
    private boolean f53568t = false;

    /* renamed from: u  reason: collision with root package name */
    private String f53569u = "";

    /* renamed from: v  reason: collision with root package name */
    private long f53570v = 0;

    /* renamed from: y  reason: collision with root package name */
    private Executor f53573y = new ThreadPoolExecutor(1, 2, 0, TimeUnit.MILLISECONDS, new LinkedBlockingQueue());

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                for (ActivityManager.RunningServiceInfo runningServiceInfo : ((ActivityManager) ModLoadingActivity.this.getSystemService(TTDownloadField.TT_ACTIVITY)).getRunningServices(Integer.MAX_VALUE)) {
                    if (runningServiceInfo.service.getClassName().equals(MessengerService.class.getName())) {
                        w0.a("messenger service is running", new Object[0]);
                        return;
                    }
                }
                w0.a("start messenger service", new Object[0]);
                ModLoadingActivity.this.startService(new Intent(ModLoadingActivity.this, MessengerService.class));
            } catch (SecurityException e5) {
                e5.printStackTrace();
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
            com.join.mgps.va.overmind.d.o().d0();
            ModLoadingActivity.this.I0();
            if (com.join.mgps.va.overmind.d.o().N(ModLoadingActivity.this.f53551c)) {
                ModLoadingActivity.this.A0();
                return;
            }
            com.join.mgps.va.overmind.d o4 = com.join.mgps.va.overmind.d.o();
            ModLoadingActivity modLoadingActivity = ModLoadingActivity.this;
            o4.m(modLoadingActivity, modLoadingActivity.f53551c, modLoadingActivity.f53552d, modLoadingActivity.f53553e, modLoadingActivity.f53554f, modLoadingActivity.f53555g == 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class c implements b.InterfaceC0290b {

        /* loaded from: classes3.dex */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                ModLoadingActivity.this.f53572x.setVisibility(8);
                ModLoadingActivity.this.f53564p.setVisibility(0);
            }
        }

        /* loaded from: classes3.dex */
        class b implements Runnable {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ String f53579b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ int f53580c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ String f53581d;

            b(String str, int i4, String str2) {
                this.f53579b = str;
                this.f53580c = i4;
                this.f53581d = str2;
            }

            @Override // java.lang.Runnable
            public void run() {
                com.github.snowdream.android.app.downloader.c cVar = (com.github.snowdream.android.app.downloader.c) ModLoadingActivity.E.get(this.f53579b);
                if (cVar != null) {
                    ModLoadingActivity.this.f53565q.setProgress(this.f53580c);
                    TextView textView = ModLoadingActivity.this.f53566r;
                    String string = ModLoadingActivity.this.getResources().getString(R.string.s_mod_progress_status_1);
                    textView.setText(String.format(string, UtilsMy.c(cVar.g()) + "", UtilsMy.c(cVar.i()) + "", this.f53580c + "%"));
                    TextView textView2 = ModLoadingActivity.this.f53567s;
                    String string2 = ModLoadingActivity.this.getResources().getString(R.string.s_mod_progress_status_2);
                    textView2.setText(String.format(string2, UtilsMy.c(cVar.i()) + "", this.f53581d + "", "v" + ModLoadingActivity.this.f53553e));
                }
            }
        }

        /* renamed from: com.join.mgps.mod.activity.ModLoadingActivity$c$c  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        class RunnableC0374c implements Runnable {
            RunnableC0374c() {
            }

            @Override // java.lang.Runnable
            public void run() {
                ModLoadingActivity.this.f53564p.setVisibility(8);
                ModLoadingActivity.this.f53572x.setVisibility(0);
            }
        }

        c() {
        }

        @Override // com.github.snowdream.android.app.downloader.b.InterfaceC0290b
        public void onError(String str) {
            ModLoadingActivity.this.K0();
        }

        @Override // com.github.snowdream.android.app.downloader.b.InterfaceC0290b
        public void onFinish(String str) {
            w0.a("onFinish onStart - " + str, new Object[0]);
            com.github.snowdream.android.app.downloader.c cVar = (com.github.snowdream.android.app.downloader.c) ModLoadingActivity.E.get(str);
            if (cVar != null) {
                if (ModLoadingActivity.this.f53563o.isMod()) {
                    if (g2.i(ModLoadingActivity.this.f53569u)) {
                        ModInfoBean modInfoBean = (ModInfoBean) JsonMapper.getInstance().fromJson(ModLoadingActivity.this.f53569u, ModInfoBean.class);
                        if (modInfoBean != null) {
                            ModLoadingActivity.this.f53563o.setResource_url_remote(modInfoBean.getDown_url());
                            modInfoBean.setStatus(14);
                            ModLoadingActivity.this.f53563o.setMod_info(JsonMapper.toJsonString(modInfoBean));
                        } else {
                            ModLoadingActivity.this.f53563o.setMod_info(JsonMapper.toJsonString(ModLoadingActivity.this.f53569u));
                        }
                    }
                } else if (APKUtils.K(ModLoadingActivity.this.f53563o) && g2.i(ModLoadingActivity.this.f53569u)) {
                    SingleGameModInfoBean singleGameModInfoBean = (SingleGameModInfoBean) JsonMapper.getInstance().fromJson(ModLoadingActivity.this.f53569u, SingleGameModInfoBean.class);
                    if (singleGameModInfoBean != null) {
                        ModLoadingActivity.this.f53563o.setResource_url_remote(singleGameModInfoBean.getDownUrl());
                        singleGameModInfoBean.setStatus(14);
                        ModLoadingActivity.this.f53563o.setSingle_game_mod_info(JsonMapper.toJsonString(singleGameModInfoBean));
                    } else {
                        ModLoadingActivity.this.f53563o.setSingle_game_mod_info(JsonMapper.toJsonString(ModLoadingActivity.this.f53569u));
                    }
                }
                ModLoadingActivity modLoadingActivity = ModLoadingActivity.this;
                modLoadingActivity.f53552d = cVar.h() + cVar.k();
                ModLoadingActivity.this.f53563o.setResource_path(ModLoadingActivity.this.f53552d);
                p1.f.K().m(ModLoadingActivity.this.f53563o);
            }
            ModLoadingActivity.this.runOnUiThread(new RunnableC0374c());
            ModLoadingActivity.this.K0();
            ModLoadingActivity.E.remove(str);
        }

        @Override // com.github.snowdream.android.app.downloader.b.InterfaceC0290b
        public void onProgress(String str, int i4, String str2) {
            ModLoadingActivity.this.runOnUiThread(new b(str, i4, str2));
        }

        @Override // com.github.snowdream.android.app.downloader.b.InterfaceC0290b
        public void onStart(String str) {
            w0.a("PreDownloadPlug onStart - " + str, new Object[0]);
            ModLoadingActivity.this.runOnUiThread(new a());
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
    /* loaded from: classes3.dex */
    public class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ModLoadingActivity.this.sendBroadcast(new Intent(OMProxyActivity.f68263e.b()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class e implements Runnable {

        /* loaded from: classes3.dex */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                ModLoadingActivity.this.f53564p.setVisibility(0);
                ModLoadingActivity.this.f53565q.setProgress(0);
                ModLoadingActivity.this.f53567s.setVisibility(8);
                ModLoadingActivity.this.f53566r.setText(String.format(ModLoadingActivity.this.getResources().getString(R.string.s_mod_progress_status_3), "0%"));
            }
        }

        e() {
        }

        @Override // java.lang.Runnable
        public synchronized void run() {
            ModLoadingActivity.this.f53560l.add("copyExtFile");
            com.join.mgps.va.overmind.f fVar = com.join.mgps.va.overmind.f.f54952a;
            String M = fVar.M(ModLoadingActivity.this.f53551c);
            ModLoadingActivity.this.f53570v = FileUtils.fileSize(M);
            Bundle bundle = new Bundle();
            bundle.putString("modPath", ModLoadingActivity.this.f53552d);
            bundle.putString("gameId", ModLoadingActivity.this.f53550b);
            bundle.putLong("obbSize", ModLoadingActivity.this.f53570v);
            ModLoadingActivity modLoadingActivity = ModLoadingActivity.this;
            com.join.mgps.va.overmind.h.a(modLoadingActivity.f53551c, modLoadingActivity.f53556h, bundle);
            if (ModLoadingActivity.this.f53570v == 0) {
                ModLoadingActivity.this.f53561m.add("copyExtFile");
                Overmind.getContext().sendBroadcast(new Intent(com.join.mgps.mod.utils.d.f53637t));
                return;
            }
            long h4 = com.join.mgps.va.overmind.d.o().h(fVar.O(ModLoadingActivity.this.f53551c));
            ModLoadingActivity.this.x0();
            if (ModLoadingActivity.this.f53570v != h4) {
                ModLoadingActivity.this.runOnUiThread(new a());
            } else {
                ModLoadingActivity.this.f53561m.add("copyExtFile");
                Overmind.getContext().sendBroadcast(new Intent(com.join.mgps.mod.utils.d.f53637t));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class f implements Runnable {

        /* loaded from: classes3.dex */
        class a implements Runnable {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ int f53588b;

            a(int i4) {
                this.f53588b = i4;
            }

            @Override // java.lang.Runnable
            public void run() {
                ModLoadingActivity.this.f53565q.setProgress(this.f53588b);
                TextView textView = ModLoadingActivity.this.f53566r;
                String string = ModLoadingActivity.this.getResources().getString(R.string.s_mod_progress_status_3);
                textView.setText(String.format(string, this.f53588b + "%"));
            }
        }

        f() {
        }

        @Override // java.lang.Runnable
        public synchronized void run() {
            while (!ModLoadingActivity.this.f53568t) {
                try {
                    long h4 = com.join.mgps.va.overmind.d.o().h(com.join.mgps.va.overmind.f.f54952a.O(ModLoadingActivity.this.f53551c));
                    ModLoadingActivity modLoadingActivity = ModLoadingActivity.this;
                    modLoadingActivity.f53568t = h4 >= modLoadingActivity.f53570v;
                    int i4 = ModLoadingActivity.this.f53570v == 0 ? 100 : (int) ((h4 / ModLoadingActivity.this.f53570v) * 100);
                    Thread.currentThread();
                    Thread.sleep(1000L);
                    ModLoadingActivity.this.runOnUiThread(new a(i4));
                } catch (InterruptedException e5) {
                    e5.printStackTrace();
                }
            }
            ModLoadingActivity.this.f53561m.add("copyExtFile");
            Overmind.getContext().sendBroadcast(new Intent(com.join.mgps.mod.utils.d.f53637t));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class g extends BroadcastReceiver {
        g() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            if (action.equals(com.join.mgps.mod.utils.d.f53636s)) {
                String stringExtra = intent.getStringExtra("soName");
                if (TextUtils.isEmpty(stringExtra)) {
                    return;
                }
                ModLoadingActivity.this.f53560l.add(stringExtra);
            } else if (action.equals(com.join.mgps.mod.utils.d.f53637t)) {
                String stringExtra2 = intent.getStringExtra("soName");
                if (TextUtils.isEmpty(stringExtra2)) {
                    ModLoadingActivity.this.f53559k = true;
                    ModLoadingActivity.this.z0();
                    return;
                }
                ModLoadingActivity.this.f53561m.add(stringExtra2);
                ModLoadingActivity modLoadingActivity = ModLoadingActivity.this;
                if (modLoadingActivity.f53559k) {
                    modLoadingActivity.z0();
                }
            } else if (action.equals(com.join.mgps.mod.utils.d.f53639v)) {
                ModLoadingActivity.this.finish();
            } else if (action.equals(com.join.mgps.mod.utils.d.f53638u)) {
                ModLoadingActivity.F++;
                h0.i(ModLoadingActivity.this.f53552d);
                h0.i(v.f28107g + "mod/" + ModLoadingActivity.this.f53563o.getPackageName() + "/oat");
                if (g2.i(ModLoadingActivity.this.f53569u) && !j.j(ModLoadingActivity.this) && ModLoadingActivity.F < 2) {
                    ModLoadingActivity modLoadingActivity2 = ModLoadingActivity.this;
                    modLoadingActivity2.y0(modLoadingActivity2.f53550b);
                    return;
                }
                ModLoadingActivity.this.K0();
            }
        }
    }

    /* loaded from: classes3.dex */
    class h extends BroadcastReceiver {
        h() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            if (TextUtils.isEmpty(action) || !action.equals(OMProxyActivity.f68263e.c())) {
                return;
            }
            ModLoadingActivity.this.finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void A0() {
        new Thread(new e()).start();
    }

    private void B0() {
        this.f53550b = getIntent().getStringExtra("gameId");
        this.f53551c = getIntent().getStringExtra("packageName");
        this.f53552d = getIntent().getStringExtra("modPath");
        this.f53553e = getIntent().getStringExtra("modVersion");
        this.f53554f = getIntent().getIntExtra("modCode", 0);
        this.f53555g = getIntent().getIntExtra("modType", 0);
        this.f53556h = getIntent().getIntExtra("userId", 0);
        this.f53557i = getIntent().getStringExtra("typeId");
        this.f53569u = getIntent().getStringExtra("_mod_info");
        if (TextUtils.isEmpty(this.f53551c)) {
            finish();
            return;
        }
        MApplication.f1497x.l().lastLaunchModGameId().g(this.f53550b);
        this.f53564p = (LinearLayout) findViewById(R.id.ll_download_status);
        this.f53565q = (ProgressBar) findViewById(R.id.pb_progress);
        this.f53566r = (TextView) findViewById(R.id.tv_progress_status_1);
        this.f53567s = (TextView) findViewById(R.id.tv_progress_status_2);
        this.f53572x = (TextView) findViewById(R.id.tv_launch_status);
        ImageView imageView = (ImageView) findViewById(R.id.iv_loading);
        this.f53571w = imageView;
        AnimationDrawable animationDrawable = (AnimationDrawable) imageView.getDrawable();
        this.f53574z = animationDrawable;
        animationDrawable.start();
        this.f53558j = new g();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(com.join.mgps.mod.utils.d.f53636s);
        intentFilter.addAction(com.join.mgps.mod.utils.d.f53637t);
        intentFilter.addAction(com.join.mgps.mod.utils.d.f53638u);
        intentFilter.addAction(com.join.mgps.mod.utils.d.f53639v);
        registerReceiver(this.f53558j, intentFilter);
        y0(this.f53550b);
        J0();
        UtilsMy.T1(this, 12, this.f53550b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void C0() {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void D0(Handler handler) {
        if (com.join.mgps.va.overmind.d.o().N(this.f53551c)) {
            com.join.mgps.va.overmind.f fVar = com.join.mgps.va.overmind.f.f54952a;
            String[] strArr = {fVar.M(this.f53551c), fVar.v(this.f53551c), fVar.W()};
            for (int i4 = 0; i4 < 3; i4++) {
                h0.i(strArr[i4]);
            }
        }
        handler.postDelayed(new Runnable() { // from class: com.join.mgps.mod.activity.a
            @Override // java.lang.Runnable
            public final void run() {
                ModLoadingActivity.this.C0();
            }
        }, 5000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void E0(final Handler handler) {
        if (this.f53562n || isFinishing()) {
            return;
        }
        this.f53562n = true;
        this.f53564p.setVisibility(8);
        this.f53572x.setVisibility(0);
        com.join.mgps.va.overmind.d.o().U(this, this.f53556h, this.f53551c);
        MApplication.f1497x.G(true);
        new Thread(new Runnable() { // from class: com.join.mgps.mod.activity.c
            @Override // java.lang.Runnable
            public final void run() {
                ModLoadingActivity.this.D0(handler);
            }
        }).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void F0(String str) {
        l2.a(this).b(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0076, code lost:
        r6 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void I0() {
        /*
            Method dump skipped, instructions count: 304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.mgps.mod.activity.ModLoadingActivity.I0():void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x0() {
        new Thread(new f()).start();
    }

    boolean G0(DownloadTask downloadTask) {
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

    boolean H0() {
        try {
            com.xinzhu.overmind.shared.f fVar = com.xinzhu.overmind.shared.f.f68286a;
            if (!fVar.m() && !fVar.p()) {
                return false;
            }
            File j4 = com.xinzhu.overmind.a.j(this.f53551c);
            if (j4.exists()) {
                if (j4.length() > 314572800) {
                    return true;
                }
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        return false;
    }

    void J0() {
        this.f53573y.execute(new a());
    }

    void K0() {
        try {
            if (com.join.mgps.va.overmind.d.o().N(this.f53551c) && H0()) {
                Intent intent = new Intent(OMProxyActivity.f68263e.a());
                intent.setComponent(new ComponentName(Overmind.getPluginPkg(), OMProxyActivity.class.getName()));
                startActivity(intent);
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        L0();
    }

    void L0() {
        this.f53573y.execute(new b());
    }

    void M0(DownloadTask downloadTask) {
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
            K0();
            return;
        }
        com.github.snowdream.android.app.downloader.c cVar = new com.github.snowdream.android.app.downloader.c(str2, x0.d(str2) + ".mod", v.f28107g + "mod/" + downloadTask.getPackageName() + net.lingala.zip4j.util.e.F0, 0L);
        C.b(cVar);
        if (E == null || cVar.l() == null || cVar.l().equals("")) {
            return;
        }
        String l4 = cVar.l();
        if (E.get(cVar.l()) != null) {
            return;
        }
        synchronized (E) {
            E.put(l4, cVar);
        }
    }

    void hideNavigationBar() {
        if (Build.VERSION.SDK_INT >= 19) {
            setSystemUiVisibility();
        }
    }

    public void initPreDownloadFactory() {
        C = com.github.snowdream.android.app.downloader.b.e();
        c cVar = new c();
        D = cVar;
        C.m(cVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_mod_loading);
        getWindow().getDecorView().setOnSystemUiVisibilityChangeListener(this);
        B0();
        h hVar = new h();
        this.A = hVar;
        registerReceiver(hVar, new IntentFilter(OMProxyActivity.f68263e.c()));
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        this.f53562n = false;
        BroadcastReceiver broadcastReceiver = this.A;
        if (broadcastReceiver != null) {
            unregisterReceiver(broadcastReceiver);
        }
        g gVar = this.f53558j;
        if (gVar != null) {
            unregisterReceiver(gVar);
        }
        AnimationDrawable animationDrawable = this.f53574z;
        if (animationDrawable != null) {
            animationDrawable.stop();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        B0();
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        hideNavigationBar();
    }

    @Override // android.view.View.OnSystemUiVisibilityChangeListener
    public void onSystemUiVisibilityChange(int i4) {
        if (i4 == 0) {
            hideNavigationBar();
        }
    }

    void setSystemUiVisibility() {
        getWindow().getDecorView().setSystemUiVisibility(Build.VERSION.SDK_INT >= 19 ? 5894 : 1799);
    }

    void showToast(final String str) {
        runOnUiThread(new Runnable() { // from class: com.join.mgps.mod.activity.d
            @Override // java.lang.Runnable
            public final void run() {
                ModLoadingActivity.this.F0(str);
            }
        });
    }

    void y0(String str) {
        DownloadTask downloadTask;
        if (TextUtils.isEmpty(str)) {
            showToast("游戏信息[ID]缺失");
            finish();
            return;
        }
        this.f53563o = p1.f.K().F(str);
        if ((g2.i(this.f53569u) && j.j(this) && (downloadTask = this.f53563o) != null && (g2.h(downloadTask.getResource_path()) || !h0.x(this.f53563o.getResource_path()))) || G0(this.f53563o)) {
            M0(this.f53563o);
        } else {
            K0();
        }
    }

    synchronized void z0() {
        boolean z4 = true;
        Iterator<String> it2 = this.f53560l.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            if (!this.f53561m.contains(it2.next())) {
                z4 = false;
                break;
            }
        }
        if (z4) {
            runOnUiThread(new d());
            final Handler handler = new Handler();
            handler.postDelayed(new Runnable() { // from class: com.join.mgps.mod.activity.b
                @Override // java.lang.Runnable
                public final void run() {
                    ModLoadingActivity.this.E0(handler);
                }
            }, 2000L);
        }
    }
}
