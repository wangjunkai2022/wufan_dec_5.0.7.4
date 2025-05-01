package com;

import android.app.Activity;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.multidex.MultiDex;
import com.bytedance.sdk.openadsdk.mediation.MediationConstant;
import com.danikula.videocache.i;
import com.join.android.app.common.http.MiitHelper;
import com.join.android.app.common.utils.JsonMapper;
import com.join.android.app.common.utils.n;
import com.join.android.app.mgsim.wufun.R;
import com.join.kotlin.base.BaseApp;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.Util.g0;
import com.join.mgps.Util.g2;
import com.join.mgps.Util.m0;
import com.join.mgps.Util.r0;
import com.join.mgps.Util.s1;
import com.join.mgps.activity.MGMainActivity;
import com.join.mgps.activity.NoticeTopAnimActivityDialog_;
import com.join.mgps.activity.login.LoginCfgsBean;
import com.join.mgps.ad.x;
import com.join.mgps.ad.z;
import com.join.mgps.dialog.g2;
import com.join.mgps.dto.GameHeadAd;
import com.join.mgps.dto.HomeViewSwich;
import com.join.mgps.dto.MessageRedPointBean;
import com.join.mgps.dto.PlayCfgBean;
import com.join.mgps.dto.PublicVideoCfgBean;
import com.join.mgps.dto.SScrollingTxtBeanV2;
import com.join.mgps.dto.SimulatorAdPlayConfig;
import com.join.mgps.dto.SimulatorAdPlayRecord;
import com.join.mgps.dto.SimulatorRunAdTextCfgBean;
import com.join.mgps.dto.SingleGameRunAdTextCfgBean;
import com.join.mgps.pref.PrefDef_;
import com.join.mgps.service.CommonService_;
import com.netease.nis.quicklogin.QuickLogin;
import com.papa.sim.statistic.Event;
import com.papa.sim.statistic.o;
import com.papa.sim.statistic.s;
import com.papa91.arc.CContext;
import com.papa91.arc.bean.RequestHeaders;
import com.papa91.wrapper.UserPrefs;
import com.psk.eventmodule.net.util.DeviceIdUtil;
import com.sdk.Unicorn.base.module.manager.SDKManager;
import com.umeng.commonsdk.UMConfigure;
import com.wufan.user.service.protobuf.n0;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
/*  JADX ERROR: NullPointerException in pass: ProcessKotlinInternals
    java.lang.NullPointerException
    	at jadx.core.dex.visitors.kotlin.ProcessKotlinInternals.processMth(ProcessKotlinInternals.java:92)
    	at jadx.core.dex.visitors.kotlin.ProcessKotlinInternals.visit(ProcessKotlinInternals.java:83)
    */
/* loaded from: classes.dex */
public class MApplication extends BaseApp implements Application.ActivityLifecycleCallbacks, ViewModelStoreOwner {
    public static com.join.android.app.common.servcie.i B1;
    public static String G;
    public static ArrayList<SScrollingTxtBeanV2> G1;
    public static String H;
    public static int H1;
    private static int J1;
    public static HomeViewSwich R;
    public static LoginCfgsBean S;
    public static List<SimulatorRunAdTextCfgBean> Z;

    /* renamed from: p0  reason: collision with root package name */
    public static SingleGameRunAdTextCfgBean f1492p0;

    /* renamed from: p1  reason: collision with root package name */
    public static PublicVideoCfgBean f1493p1;

    /* renamed from: c  reason: collision with root package name */
    private PrefDef_ f1501c;

    /* renamed from: d  reason: collision with root package name */
    private String f1502d;

    /* renamed from: k  reason: collision with root package name */
    private com.danikula.videocache.i f1509k;

    /* renamed from: l  reason: collision with root package name */
    private Activity f1510l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f1511m;

    /* renamed from: o  reason: collision with root package name */
    private ViewModelStore f1513o;

    /* renamed from: p  reason: collision with root package name */
    CContext.IVideoAdListener f1514p;

    /* renamed from: q  reason: collision with root package name */
    x f1515q;

    /* renamed from: r  reason: collision with root package name */
    com.join.mgps.ad.j f1516r;

    /* renamed from: s  reason: collision with root package name */
    z f1517s;

    /* renamed from: t  reason: collision with root package name */
    com.join.mgps.ad.f f1518t;

    /* renamed from: u  reason: collision with root package name */
    com.join.mgps.ad.h f1519u;

    /* renamed from: v  reason: collision with root package name */
    private static final String f1494v = MApplication.class.getSimpleName();

    /* renamed from: w  reason: collision with root package name */
    public static boolean f1496w = true;

    /* renamed from: x  reason: collision with root package name */
    public static MApplication f1497x = null;

    /* renamed from: y  reason: collision with root package name */
    public static String f1498y = "";

    /* renamed from: z  reason: collision with root package name */
    public static String f1499z = "";
    public static String A = "";
    public static String B = "";
    public static String C = "";
    public static String D = "";
    public static int E = 0;
    public static String F = "";
    public static String I = "";
    public static String J = "0";
    public static String K = "";
    public static String L = "0";
    public static MessageRedPointBean.MessagesBean.DataBean M = null;
    public static boolean N = false;
    public static String O = "";
    public static int P = 0;
    public static int Q = 0;
    public static boolean T = false;
    public static boolean U = false;
    public static int V = 0;
    public static GameHeadAd W = null;
    public static Bitmap X = null;
    public static boolean Y = false;

    /* renamed from: v1  reason: collision with root package name */
    public static int f1495v1 = 2;
    public static String A1 = "";
    public static boolean C1 = false;
    public static boolean D1 = false;
    public static boolean E1 = false;
    public static List<String> F1 = new ArrayList();
    public static boolean I1 = false;

    /* renamed from: b  reason: collision with root package name */
    private List<Activity> f1500b = new LinkedList();

    /* renamed from: e  reason: collision with root package name */
    boolean f1503e = false;

    /* renamed from: f  reason: collision with root package name */
    private final BroadcastReceiver f1504f = new h();

    /* renamed from: g  reason: collision with root package name */
    private final String f1505g = MediationConstant.KEY_REASON;

    /* renamed from: h  reason: collision with root package name */
    private final String f1506h = "homekey";

    /* renamed from: i  reason: collision with root package name */
    private final String f1507i = "recentapps";

    /* renamed from: j  reason: collision with root package name */
    private final BroadcastReceiver f1508j = new i();

    /* renamed from: n  reason: collision with root package name */
    public boolean f1512n = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends z {
        a(Context context, String str, String str2) {
            super(context, str, str2);
        }

        @Override // com.join.mgps.ad.d, com.join.mgps.ad.t, com.join.mgps.ad.n
        public void a(String str, int i4, int i5) {
            super.a(str, i4, i5);
            l(Event.Emu_PatchAd_Close.name(), str);
        }

        @Override // com.join.mgps.ad.d, com.join.mgps.ad.t, com.join.mgps.ad.n
        public void b(boolean z4) {
            super.b(z4);
        }

        @Override // com.join.mgps.ad.d, com.join.mgps.ad.t, com.join.mgps.ad.n
        public void onADClick() {
            super.onADClick();
            l(Event.Emu_PatchAd_Click.name(), this.f39682f);
        }

        @Override // com.join.mgps.ad.d, com.join.mgps.ad.t, com.join.mgps.ad.n
        public void onADShow() {
            super.onADShow();
            l(Event.Emu_PatchAd_Pop.name(), this.f39682f);
        }

        @Override // com.join.mgps.ad.d, com.join.mgps.ad.t, com.join.mgps.ad.n
        public void onInitSuccess() {
            super.onInitSuccess();
            h(false);
        }

        @Override // com.join.mgps.ad.d, com.join.mgps.ad.t, com.join.mgps.ad.n
        public void onVideoCached() {
            super.onVideoCached();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b extends com.join.mgps.ad.f {
        b(Context context, String str, String str2) {
            super(context, str, str2);
        }

        @Override // com.join.mgps.ad.d, com.join.mgps.ad.t, com.join.mgps.ad.n
        public void a(String str, int i4, int i5) {
            super.a(str, i4, i5);
            l(Event.Emu_PatchAd_Close.name(), str);
        }

        @Override // com.join.mgps.ad.d, com.join.mgps.ad.t, com.join.mgps.ad.n
        public void b(boolean z4) {
            super.b(z4);
        }

        @Override // com.join.mgps.ad.d, com.join.mgps.ad.t, com.join.mgps.ad.n
        public void onADClick() {
            super.onADClick();
            l(Event.Emu_PatchAd_Click.name(), this.f39682f);
        }

        @Override // com.join.mgps.ad.d, com.join.mgps.ad.t, com.join.mgps.ad.n
        public void onADShow() {
            super.onADShow();
            l(Event.Emu_PatchAd_Pop.name(), this.f39682f);
        }

        @Override // com.join.mgps.ad.d, com.join.mgps.ad.t, com.join.mgps.ad.n
        public void onInitSuccess() {
            super.onInitSuccess();
            h(false);
        }

        @Override // com.join.mgps.ad.d, com.join.mgps.ad.t, com.join.mgps.ad.n
        public void onVideoCached() {
            super.onVideoCached();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c extends com.join.mgps.ad.h {
        c(Context context, String str, String str2) {
            super(context, str, str2);
        }

        @Override // com.join.mgps.ad.d, com.join.mgps.ad.t, com.join.mgps.ad.n
        public void a(String str, int i4, int i5) {
            super.a(str, i4, i5);
            l(Event.Emu_PatchAd_Close.name(), str);
        }

        @Override // com.join.mgps.ad.d, com.join.mgps.ad.t, com.join.mgps.ad.n
        public void b(boolean z4) {
            super.b(z4);
        }

        @Override // com.join.mgps.ad.d, com.join.mgps.ad.t, com.join.mgps.ad.n
        public void onADClick() {
            super.onADClick();
            l(Event.Emu_PatchAd_Click.name(), this.f39682f);
        }

        @Override // com.join.mgps.ad.d, com.join.mgps.ad.t, com.join.mgps.ad.n
        public void onADShow() {
            super.onADShow();
            l(Event.Emu_PatchAd_Pop.name(), this.f39682f);
        }

        @Override // com.join.mgps.ad.d, com.join.mgps.ad.t, com.join.mgps.ad.n
        public void onInitSuccess() {
            super.onInitSuccess();
            h(false);
        }

        @Override // com.join.mgps.ad.d, com.join.mgps.ad.t, com.join.mgps.ad.n
        public void onVideoCached() {
            super.onVideoCached();
        }
    }

    /* loaded from: classes.dex */
    class d implements o.g {
        d() {
        }

        @Override // com.papa.sim.statistic.o.g
        public int a() {
            try {
                return !AccountUtil_.getInstance_(MApplication.this).isTourist();
            } catch (Exception e5) {
                e5.printStackTrace();
                return 0;
            }
        }

        @Override // com.papa.sim.statistic.o.g
        public int b() {
            try {
                return MApplication.f1497x.l().isBsideInt().d().intValue();
            } catch (Exception e5) {
                e5.printStackTrace();
                return 0;
            }
        }
    }

    /* loaded from: classes.dex */
    class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                p1.e.d(MApplication.f1497x).b("mgdb");
            } catch (Exception e5) {
                e5.printStackTrace();
            }
            s1.a(MApplication.f1497x);
        }
    }

    /* loaded from: classes.dex */
    class f extends Thread {
        f() {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            super.run();
            MApplication.this.sendBroadcast(new Intent(o1.a.f72028u));
            try {
                if (new PrefDef_(MApplication.f1497x).firstShowUserPermiss().d().booleanValue()) {
                    return;
                }
                MApplication.this.p();
                MApplication.this.E();
            } catch (Exception unused) {
            }
        }
    }

    /* loaded from: classes.dex */
    class g implements MiitHelper.a {

        /* loaded from: classes2.dex */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                MApplication.this.E();
            }
        }

        g() {
        }

        @Override // com.join.android.app.common.http.MiitHelper.a
        public void a(@NonNull String str) {
            if (!g2.i(str)) {
                str = "";
            }
            MApplication.I = str;
            s.f(MApplication.f1497x).u(MApplication.I);
            new Thread(new a()).start();
        }
    }

    /* loaded from: classes.dex */
    class h extends BroadcastReceiver {
        h() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            UtilsMy.Q3(MApplication.this.getApplicationContext());
        }
    }

    /* loaded from: classes.dex */
    class i extends BroadcastReceiver {
        i() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String stringExtra;
            if (!intent.getAction().equals("android.intent.action.CLOSE_SYSTEM_DIALOGS") || (stringExtra = intent.getStringExtra(MediationConstant.KEY_REASON)) == null) {
                return;
            }
            if (stringExtra.equals("homekey")) {
                UtilsMy.A(context);
            }
            if (stringExtra.equals("recentapps")) {
                UtilsMy.A(context);
            }
        }
    }

    /* loaded from: classes.dex */
    class j implements CContext.IVideoAdListener {

        /* renamed from: a  reason: collision with root package name */
        PlayCfgBean f1530a;

        /* renamed from: b  reason: collision with root package name */
        PlayCfgBean f1531b;

        /* renamed from: c  reason: collision with root package name */
        SharedPreferences f1532c;

        /* renamed from: e  reason: collision with root package name */
        com.join.mgps.dialog.g2 f1534e;

        /* renamed from: d  reason: collision with root package name */
        long f1533d = 0;

        /* renamed from: f  reason: collision with root package name */
        int f1535f = 0;

        /* renamed from: g  reason: collision with root package name */
        int f1536g = 0;

        /* renamed from: h  reason: collision with root package name */
        long f1537h = 0;

        /* renamed from: i  reason: collision with root package name */
        boolean f1538i = false;

        /* renamed from: j  reason: collision with root package name */
        boolean f1539j = false;

        /* loaded from: classes2.dex */
        class a implements g2.a {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ String f1541a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ int f1542b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ n0 f1543c;

            a(String str, int i4, n0 n0Var) {
                this.f1541a = str;
                this.f1542b = i4;
                this.f1543c = n0Var;
            }

            @Override // com.join.mgps.dialog.g2.a
            public void a() {
                Intent intent = new Intent("com.tools.AdBroadcast");
                intent.putExtra("playCfg", j.this.f1531b);
                intent.putExtra("gameId", this.f1541a);
                intent.putExtra(NoticeTopAnimActivityDialog_.f36148o, this.f1542b);
                intent.putExtra("adCount", j.this.f1535f);
                intent.putExtra("howTimes", j.this.f1536g);
                intent.putExtra("close", j.this.f1539j);
                intent.putExtra("action", 1005);
                MApplication.this.sendBroadcast(intent);
                j jVar = j.this;
                if (jVar.f1539j) {
                    MApplication.this.F(Event.Customgoldfinger_AdUnnecessary_Vedio.name(), this.f1541a);
                } else {
                    MApplication.this.F(Event.Customgoldfinger_AdMust_Vedio.name(), this.f1541a);
                }
            }

            @Override // com.join.mgps.dialog.g2.a
            public void b(boolean z4) {
                Intent intent = new Intent();
                intent.setAction("com.emu.ad.result");
                intent.putExtra("adAction", 1008);
                HashMap hashMap = new HashMap();
                hashMap.put(NoticeTopAnimActivityDialog_.f36148o, Integer.valueOf(this.f1542b));
                hashMap.put("close", Boolean.valueOf(z4));
                intent.putExtra(MGMainActivity.KEY_EXTRAS, JsonMapper.toJsonString(hashMap));
                MApplication.f1497x.sendBroadcast(intent);
                if (j.this.f1535f > 0) {
                    j jVar = j.this;
                    new UserPrefs(MApplication.f1497x).setGoldFingerAdGamesConfig(this.f1541a, this.f1543c.getUid() + "", jVar.f1536g + 1, jVar.f1535f);
                }
            }

            @Override // com.join.mgps.dialog.g2.a
            public void onShow() {
                j jVar = j.this;
                if (jVar.f1539j) {
                    MApplication.this.F(Event.Customgoldfinger_AdUnnecessary_Pop.name(), this.f1541a);
                } else {
                    MApplication.this.F(Event.Customgoldfinger_AdMust_Pop.name(), this.f1541a);
                }
            }
        }

        j() {
            this.f1532c = MApplication.this.getSharedPreferences("PrefDef", 4);
        }

        /* JADX WARN: Removed duplicated region for block: B:31:0x009f  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x00c2  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x00ce  */
        /* JADX WARN: Removed duplicated region for block: B:55:0x00fe  */
        /* JADX WARN: Removed duplicated region for block: B:58:0x0119  */
        /* JADX WARN: Removed duplicated region for block: B:61:0x0127  */
        /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
        @Override // com.papa91.arc.CContext.IVideoAdListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void loadAd(android.app.Activity r14, java.lang.String r15) {
            /*
                Method dump skipped, instructions count: 369
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.MApplication.j.loadAd(android.app.Activity, java.lang.String):void");
        }

        @Override // com.papa91.arc.CContext.IVideoAdListener
        public void loadEndAd(int i4, String str, String str2) {
            PlayCfgBean playCfgBean = new PlayCfgBean();
            playCfgBean.setSdk_type(i4);
            playCfgBean.setAd_id(str);
            playCfgBean.setSdk_key(str2);
            if (i4 == 1) {
                Intent intent = new Intent("com.tools.AdBroadcast");
                intent.putExtra("playCfg", playCfgBean);
                intent.putExtra("action", 1101);
                MApplication.this.sendBroadcast(intent);
            } else if (i4 == 2) {
                MApplication mApplication = MApplication.this;
                mApplication.z(mApplication.f1510l, playCfgBean);
            }
        }

        @Override // com.papa91.arc.CContext.IVideoAdListener
        public void showAd(Activity activity, String str, String str2) {
            List<SimulatorAdPlayRecord> list;
            String string = this.f1532c.getString("simulator_play_records", "");
            SimulatorAdPlayRecord simulatorAdPlayRecord = null;
            SimulatorAdPlayConfig simulatorAdPlayConfig = com.join.mgps.Util.g2.i(string) ? (SimulatorAdPlayConfig) JsonMapper.getInstance().fromJson(string, SimulatorAdPlayConfig.class) : null;
            if (simulatorAdPlayConfig == null) {
                simulatorAdPlayConfig = new SimulatorAdPlayConfig();
                simulatorAdPlayConfig.setRecord_time(System.currentTimeMillis());
            }
            if (this.f1530a != null) {
                if (CContext.SCENE_FC.equals(str2)) {
                    simulatorAdPlayRecord = simulatorAdPlayConfig.getPlayConfig(simulatorAdPlayConfig.getSimulator_fc_cfg(), this.f1530a.getSdk_type());
                    if (simulatorAdPlayConfig.getSimulator_fc_cfg() == null) {
                        simulatorAdPlayConfig.setSimulator_fc_cfg(new ArrayList());
                    }
                    list = simulatorAdPlayConfig.getSimulator_fc_cfg();
                } else if (CContext.SCENE_FBA.equals(str2)) {
                    simulatorAdPlayRecord = simulatorAdPlayConfig.getPlayConfig(simulatorAdPlayConfig.getSimulator_jj_cfg(), this.f1530a.getSdk_type());
                    if (simulatorAdPlayConfig.getSimulator_jj_cfg() == null) {
                        simulatorAdPlayConfig.setSimulator_jj_cfg(new ArrayList());
                    }
                    list = simulatorAdPlayConfig.getSimulator_jj_cfg();
                } else if (CContext.SCENE_GBA.equals(str2)) {
                    simulatorAdPlayRecord = simulatorAdPlayConfig.getPlayConfig(simulatorAdPlayConfig.getSimulator_gba_cfg(), this.f1530a.getSdk_type());
                    if (simulatorAdPlayConfig.getSimulator_gba_cfg() == null) {
                        simulatorAdPlayConfig.setSimulator_gba_cfg(new ArrayList());
                    }
                    list = simulatorAdPlayConfig.getSimulator_gba_cfg();
                } else if (CContext.SCENE_PSP.equals(str2)) {
                    simulatorAdPlayRecord = simulatorAdPlayConfig.getPlayConfig(simulatorAdPlayConfig.getSimulator_psp_cfg(), this.f1530a.getSdk_type());
                    if (simulatorAdPlayConfig.getSimulator_psp_cfg() == null) {
                        simulatorAdPlayConfig.setSimulator_psp_cfg(new ArrayList());
                    }
                    list = simulatorAdPlayConfig.getSimulator_psp_cfg();
                } else {
                    list = null;
                }
                if (simulatorAdPlayRecord == null) {
                    list.add(new SimulatorAdPlayRecord(this.f1530a.getSdk_type(), 1, (int) Double.parseDouble(this.f1530a.getProbability())));
                } else {
                    simulatorAdPlayRecord.add();
                }
                this.f1532c.edit().putString("simulator_play_records", JsonMapper.toJsonString(simulatorAdPlayConfig)).commit();
                if (this.f1530a.getSdk_type() == 1) {
                    Intent intent = new Intent("com.tools.AdBroadcast");
                    intent.putExtra("gameId", str);
                    intent.putExtra("action", 1002);
                    MApplication.this.sendBroadcast(intent);
                } else if (this.f1530a.getSdk_type() == 2) {
                    com.join.mgps.ad.f fVar = MApplication.this.f1518t;
                    if (fVar != null) {
                        fVar.r(activity, str);
                    }
                } else if (this.f1530a.getSdk_type() == 7) {
                    MApplication.this.H(activity, str);
                    System.out.println("AD_LOG_TAG 显示融合广告");
                }
            }
        }

        @Override // com.papa91.arc.CContext.IVideoAdListener
        public void showEndAd(int i4, String str) {
            MApplication mApplication;
            com.join.mgps.ad.f fVar;
            if (i4 == 1) {
                Intent intent = new Intent("com.tools.AdBroadcast");
                intent.putExtra("gameId", str);
                intent.putExtra("action", SDKManager.CODE_WRITE_SETTINGS_PERMISSION);
                MApplication.this.sendBroadcast(intent);
            } else if (i4 != 2 || (fVar = (mApplication = MApplication.this).f1518t) == null) {
            } else {
                fVar.r(mApplication.f1510l, str);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:35:0x00d5  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x011c  */
        /* JADX WARN: Removed duplicated region for block: B:82:0x01ce  */
        /* JADX WARN: Type inference failed for: r11v3 */
        /* JADX WARN: Type inference failed for: r11v4 */
        /* JADX WARN: Type inference failed for: r11v5, types: [boolean] */
        @Override // com.papa91.arc.CContext.IVideoAdListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void showGoldAdDialog(android.app.Activity r18, java.lang.String r19, int r20) {
            /*
                Method dump skipped, instructions count: 639
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.MApplication.j.showGoldAdDialog(android.app.Activity, java.lang.String, int):void");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class k extends x {
        k(Context context, String str, String str2) {
            super(context, str, str2);
        }

        @Override // com.join.mgps.ad.d, com.join.mgps.ad.t, com.join.mgps.ad.n
        public void a(String str, int i4, int i5) {
            super.a(str, i4, i5);
            l(Event.Emu_PatchAd_Close.name(), str);
        }

        @Override // com.join.mgps.ad.d, com.join.mgps.ad.t, com.join.mgps.ad.n
        public void b(boolean z4) {
            super.b(z4);
        }

        @Override // com.join.mgps.ad.d, com.join.mgps.ad.t, com.join.mgps.ad.n
        public void onADClick() {
            super.onADClick();
            MApplication.this.f1512n = true;
            l(Event.Emu_PatchAd_Click.name(), this.f39682f);
        }

        @Override // com.join.mgps.ad.d, com.join.mgps.ad.t, com.join.mgps.ad.n
        public void onADShow() {
            super.onADShow();
            l(Event.Emu_PatchAd_Pop.name(), this.f39682f);
        }

        @Override // com.join.mgps.ad.d, com.join.mgps.ad.t, com.join.mgps.ad.n
        public void onInitSuccess() {
            super.onInitSuccess();
            h(false);
        }

        @Override // com.join.mgps.ad.d, com.join.mgps.ad.t, com.join.mgps.ad.n
        public void onVideoCached() {
            super.onVideoCached();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class l extends com.join.mgps.ad.j {
        l(Context context, String str, String str2) {
            super(context, str, str2);
        }

        @Override // com.join.mgps.ad.d, com.join.mgps.ad.t, com.join.mgps.ad.n
        public void a(String str, int i4, int i5) {
            super.a(str, i4, i5);
        }

        @Override // com.join.mgps.ad.d, com.join.mgps.ad.t, com.join.mgps.ad.n
        public void b(boolean z4) {
            super.b(z4);
            l(Event.Stopad_GromoreSdk_loading.name(), this.f39682f);
        }

        @Override // com.join.mgps.ad.d, com.join.mgps.ad.t, com.join.mgps.ad.n
        public void onADClick() {
            super.onADClick();
            l(Event.Stopad_GromoreSdk_Click.name(), this.f39682f);
        }

        @Override // com.join.mgps.ad.d, com.join.mgps.ad.t, com.join.mgps.ad.n
        public void onADShow() {
            super.onADShow();
            l(Event.Stopad_GromoreSdk_Show.name(), this.f39682f);
        }

        @Override // com.join.mgps.ad.d, com.join.mgps.ad.t, com.join.mgps.ad.n
        public void onInitSuccess() {
            super.onInitSuccess();
            h(false);
        }

        @Override // com.join.mgps.ad.d, com.join.mgps.ad.t, com.join.mgps.ad.n
        public void onVideoCached() {
            super.onVideoCached();
        }
    }

    private com.danikula.videocache.i D() {
        return new i.b(this).i(1073741824L).h(20).b();
    }

    public static int g() {
        return J1;
    }

    static String h(Context context) {
        String str = null;
        try {
            if (context.getExternalCacheDir() != null) {
                str = context.getExternalCacheDir().getCanonicalPath();
            }
        } catch (IOException e5) {
            e5.printStackTrace();
        }
        if (TextUtils.isEmpty(str)) {
            return Environment.getExternalStorageDirectory() + "/yg";
        }
        return str;
    }

    public static QuickLogin i() {
        QuickLogin quickLogin = QuickLogin.getInstance();
        quickLogin.init(j(), "7fb44e42eeec4a95a2d0905f5c54d52f");
        quickLogin.setDebugMode(false);
        return quickLogin;
    }

    public static Context j() {
        return f1497x;
    }

    private PlayCfgBean k(List<PlayCfgBean> list, int i4) {
        if (list == null || list.size() <= i4) {
            return null;
        }
        return list.get(i4);
    }

    public static com.danikula.videocache.i m(Context context) {
        MApplication mApplication = (MApplication) context.getApplicationContext();
        com.danikula.videocache.i iVar = mApplication.f1509k;
        if (iVar == null) {
            com.danikula.videocache.i D2 = mApplication.D();
            mApplication.f1509k = D2;
            return D2;
        }
        return iVar;
    }

    public static QuickLogin n() {
        QuickLogin quickLogin = QuickLogin.getInstance();
        quickLogin.init(j(), "543ff4f5e60441349f54f8716f84e97b");
        quickLogin.setDebugMode(false);
        return quickLogin;
    }

    private void q() {
        j jVar = new j();
        this.f1514p = jVar;
        CContext.setVideoAdListener(jVar);
        CContext.setLifeListener(new CContext.IActivityLifeCycleListener() { // from class: com.e
            @Override // com.papa91.arc.CContext.IActivityLifeCycleListener
            public final void onCreated() {
                MApplication.this.w();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void w() {
        Intent intent = new Intent("com.tools.AdBroadcast");
        intent.putExtra("action", 1009);
        sendBroadcast(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void x() {
    }

    public void A(Context context, PlayCfgBean playCfgBean) {
        t(context, playCfgBean.getSdk_key(), playCfgBean.getAd_id());
    }

    public void B(Context context, PlayCfgBean playCfgBean) {
        u(context, playCfgBean.getSdk_key(), playCfgBean.getAd_id());
    }

    public void C(Context context, PlayCfgBean playCfgBean) {
        v(context, playCfgBean.getSdk_key(), playCfgBean.getAd_id());
    }

    public void E() {
        String b5;
        String H2 = com.join.mgps.pref.h.n(this).H();
        try {
            if (com.join.mgps.Util.g2.h(H2)) {
                String str = Environment.getExternalStorageDirectory().getAbsolutePath() + File.separator + ".papakey";
                b5 = "";
                if (new File(str).exists()) {
                    b5 = com.join.mgps.Util.k.b((ContextCompat.checkSelfPermission(f1497x, com.kuaishou.weapon.p0.g.f55590j) == 0 ? g0.x(f1497x, str) : "").getBytes());
                }
            } else {
                b5 = com.join.mgps.Util.k.b(H2.getBytes());
            }
            if (com.join.mgps.Util.g2.h(F) || com.join.mgps.Util.g2.h(f1499z) || com.join.mgps.Util.g2.h(G)) {
                p();
            }
            RequestHeaders requestHeaders = new RequestHeaders();
            requestHeaders.setWufankey(b5);
            requestHeaders.setWf_d(f1498y);
            requestHeaders.setWf_a(G);
            requestHeaders.setWf_ad(f1499z);
            requestHeaders.setWf_m(A);
            requestHeaders.setWf_i(B);
            requestHeaders.setWf_pm(C);
            requestHeaders.setWf_sn(D);
            requestHeaders.setAndroid_ver(F);
            requestHeaders.setWf_o(I);
            requestHeaders.setArm64(J);
            requestHeaders.setWf_single(E);
            com.join.mgps.pref.h.n(f1497x).p0(JsonMapper.toJsonString(requestHeaders));
            DeviceIdUtil deviceIdUtil = DeviceIdUtil.getInstance(f1497x);
            deviceIdUtil.setOaid(I);
            deviceIdUtil.setImei(f1498y);
            deviceIdUtil.setUmengKey(UMConfigure.getUMIDString(f1497x));
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public void F(String str, String str2) {
        Intent intent = new Intent("com.join.android.app.mgsim.wufun.broadcast.emu.commonpoint");
        intent.putExtra(CommonService_.b0.f54290b, str);
        intent.putExtra("gameId", str2);
        sendBroadcast(intent);
    }

    public void G(boolean z4) {
        this.f1512n = z4;
    }

    public void H(Activity activity, String str) {
        com.join.mgps.ad.j jVar = this.f1516r;
        if (jVar != null) {
            jVar.r(activity, str);
        }
    }

    public void I(Activity activity, String str) {
        x xVar = this.f1515q;
        if (xVar != null) {
            xVar.r(activity, str);
        }
    }

    public void J(Activity activity, String str) {
        z zVar = this.f1517s;
        if (zVar != null) {
            zVar.r(activity, str);
        }
    }

    @Override // com.join.mgps.va.overmind.VApp, android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        MultiDex.install(context);
    }

    public void e(Activity activity) {
        this.f1500b.add(activity);
    }

    public void f() {
        for (Activity activity : this.f1500b) {
            activity.finish();
        }
        this.f1500b.clear();
    }

    public Activity getActivity() {
        return this.f1510l;
    }

    @Override // com.join.kotlin.base.BaseApp, androidx.lifecycle.ViewModelStoreOwner
    @NonNull
    public ViewModelStore getViewModelStore() {
        return this.f1513o;
    }

    public PrefDef_ l() {
        if (this.f1501c == null) {
            this.f1501c = new PrefDef_(f1497x);
        }
        return this.f1501c;
    }

    public String o() {
        return A1;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        this.f1510l = activity;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        if (activity != null) {
            ((ViewGroup) activity.getWindow().getDecorView().findViewById(16908290)).findViewById(R.id.hideAppMask);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        this.f1510l = activity;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        ViewGroup viewGroup;
        View findViewById;
        this.f1510l = activity;
        J1++;
        if (activity != null && (findViewById = (viewGroup = (ViewGroup) activity.getWindow().getDecorView().findViewById(16908290)).findViewById(R.id.hideAppMask)) != null) {
            viewGroup.removeView(findViewById);
        }
        if (this.f1502d.equals(getPackageName()) && J1 == 1 && this.f1511m && !this.f1512n && this.f1502d.equals(getPackageName())) {
            UtilsMy.A0();
        }
        this.f1511m = false;
        if (activity != null) {
            String className = activity.getComponentName().getClassName();
            if (className.contains("com.join") || className.contains("com.papa")) {
                this.f1512n = false;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        J1--;
        if (!this.f1502d.equals(getPackageName()) || J1 > 0 || this.f1511m) {
            return;
        }
        this.f1511m = true;
    }

    /*  JADX ERROR: Failed to decode insn: 0x0155: SPUT r5, method: com.MApplication.onCreate():void
        java.util.ConcurrentModificationException
        	at java.base/java.util.ArrayList$Itr.checkForComodification(ArrayList.java:1043)
        	at java.base/java.util.ArrayList$Itr.next(ArrayList.java:997)
        	at jadx.core.dex.nodes.ClassNode.searchField(ClassNode.java:492)
        	at jadx.core.dex.nodes.RootNode.resolveField(RootNode.java:441)
        	at jadx.core.dex.instructions.InsnDecoder.tryResolveFieldType(InsnDecoder.java:539)
        	at jadx.core.dex.instructions.InsnDecoder.decode(InsnDecoder.java:385)
        	at jadx.core.dex.instructions.InsnDecoder.lambda$process$0(InsnDecoder.java:53)
        	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:85)
        	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:48)
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:148)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:409)
        	at jadx.core.ProcessClass.process(ProcessClass.java:67)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:107)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:383)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:331)
        */
    @Override // com.join.kotlin.base.BaseApp, com.join.mgps.va.overmind.VApp, com.papa91.arc.MApplication, com.papa91.arc.BuglyApplication, android.app.Application
    public void onCreate() {
        /*
            Method dump skipped, instructions count: 617
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.MApplication.onCreate():void");
    }

    @Override // android.app.Application
    public void onTerminate() {
        super.onTerminate();
        if (!this.f1503e) {
            unregisterReceiver(this.f1504f);
            unregisterReceiver(this.f1508j);
        }
        System.exit(0);
    }

    public void p() {
        try {
            r0.j(getApplicationContext(), 1);
            String i4 = n.n(f1497x).i();
            f1498y = i4;
            try {
                f1498y = com.join.mgps.Util.a.d(i4, "");
            } catch (Exception e5) {
                e5.printStackTrace();
            }
            f1499z = com.papa.sim.statistic.k.a(f1497x);
            String y2 = com.join.mgps.pref.h.n(this).y();
            if (!"".equals(f1499z) && !"0".equals(f1499z) && !"-1".equals(f1499z) && "".equals(y2)) {
                com.join.mgps.pref.h.n(this).m0(f1499z);
            }
            com.join.mgps.pref.h.n(this).l0(f1499z);
            String e6 = n.n(f1497x).e(f1497x);
            G = e6;
            try {
                H = e6;
                G = com.join.mgps.Util.a.d(e6, "");
            } catch (Exception e7) {
                e7.printStackTrace();
            }
            String o4 = n.n(f1497x).o();
            A = o4;
            try {
                A = com.join.mgps.Util.a.d(o4, "");
            } catch (Exception e8) {
                e8.printStackTrace();
            }
            String e9 = m0.e();
            B = e9;
            try {
                B = com.join.mgps.Util.a.d(e9, "");
                C = com.join.mgps.Util.a.d(Build.MODEL, "");
                D = com.join.mgps.Util.a.d(com.join.mgps.Util.g.a(this, getPackageName()), "");
            } catch (Exception e10) {
                e10.printStackTrace();
            }
            F = Build.VERSION.RELEASE;
            E = com.constant.a.b(f1497x);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    public void r(Context context, String str, String str2) {
        if (this.f1518t == null && com.join.mgps.Util.g2.i(str)) {
            b bVar = new b(context, str, str2);
            this.f1518t = bVar;
            bVar.e();
            return;
        }
        this.f1518t.h(false);
    }

    public void s(Context context, String str, String str2) {
        if (this.f1519u == null && com.join.mgps.Util.g2.i(str)) {
            c cVar = new c(context, str, str2);
            this.f1519u = cVar;
            cVar.e();
            return;
        }
        this.f1519u.h(false);
    }

    public void t(Context context, String str, String str2) {
        if (this.f1516r == null && com.join.mgps.Util.g2.i(str)) {
            l lVar = new l(context, str, str2);
            this.f1516r = lVar;
            lVar.e();
            return;
        }
        this.f1516r.h(false);
    }

    public void u(Context context, String str, String str2) {
        if (this.f1515q == null && com.join.mgps.Util.g2.i(str)) {
            k kVar = new k(context, str, str2);
            this.f1515q = kVar;
            kVar.e();
            return;
        }
        this.f1515q.h(false);
    }

    public void v(Context context, String str, String str2) {
        if (this.f1517s == null && com.join.mgps.Util.g2.i(str)) {
            a aVar = new a(context, str, str2);
            this.f1517s = aVar;
            aVar.e();
            return;
        }
        this.f1517s.h(false);
    }

    public void y(Context context, PlayCfgBean playCfgBean) {
        r(context, playCfgBean.getSdk_key(), playCfgBean.getAd_id());
    }

    public void z(Context context, PlayCfgBean playCfgBean) {
        s(context, playCfgBean.getSdk_key(), playCfgBean.getAd_id());
    }
}
