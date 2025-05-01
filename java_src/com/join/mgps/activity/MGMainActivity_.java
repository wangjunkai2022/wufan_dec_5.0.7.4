package com.join.mgps.activity;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.Fragment;
import app.mgsim.arena.ArenaRequest;
import app.mgsim.arena.ArenaResponse;
import com.MApplication;
import com.facebook.drawee.view.SimpleDraweeView;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.IntentDateBean;
import com.join.mgps.customview.CircleDownloadProgressBar;
import com.join.mgps.customview.LightningView;
import com.join.mgps.db.tables.VideoWatchLogTable;
import com.join.mgps.dto.AppBean;
import com.join.mgps.dto.CollectionBeanSub;
import com.join.mgps.dto.GameHeadAd;
import com.join.mgps.dto.JPushIntentData;
import com.join.mgps.dto.OnlineCouponConfigBean;
import com.join.mgps.dto.PopupAdBean;
import com.join.mgps.dto.RewardBean;
import com.join.mgps.dto.SNKGameInfoBean;
import com.join.mgps.dto.TipsInfoBean;
import com.join.mgps.dto.UninstallOnlineGameBean;
import com.join.mgps.dto.VersionDto;
import com.join.mgps.pref.PrefDef_;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.androidannotations.api.a;
/* loaded from: classes4.dex */
public final class MGMainActivity_ extends MGMainActivity implements y3.a, a4.a, a4.b {
    public static final String F = "intentDateBean";
    public static final String G = "intentDateBean22";
    public static final String H = "jPushIntentData";

    /* renamed from: b  reason: collision with root package name */
    private final a4.c f34619b = new a4.c();

    /* renamed from: c  reason: collision with root package name */
    private final Map<Class<?>, Object> f34620c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    private final IntentFilter f34621d = new IntentFilter();

    /* renamed from: e  reason: collision with root package name */
    private final BroadcastReceiver f34622e = new f0();

    /* renamed from: f  reason: collision with root package name */
    private final IntentFilter f34623f = new IntentFilter();

    /* renamed from: g  reason: collision with root package name */
    private final BroadcastReceiver f34624g = new q0();

    /* renamed from: h  reason: collision with root package name */
    private final IntentFilter f34625h = new IntentFilter();

    /* renamed from: i  reason: collision with root package name */
    private final BroadcastReceiver f34626i = new b1();

    /* renamed from: j  reason: collision with root package name */
    private final IntentFilter f34627j = new IntentFilter();

    /* renamed from: k  reason: collision with root package name */
    private final BroadcastReceiver f34628k = new m1();

    /* renamed from: l  reason: collision with root package name */
    private final IntentFilter f34629l = new IntentFilter();

    /* renamed from: m  reason: collision with root package name */
    private final BroadcastReceiver f34630m = new x1();

    /* renamed from: o  reason: collision with root package name */
    private final IntentFilter f34631o = new IntentFilter();

    /* renamed from: p  reason: collision with root package name */
    private final BroadcastReceiver f34632p = new i2();

    /* renamed from: q  reason: collision with root package name */
    private final IntentFilter f34633q = new IntentFilter();

    /* renamed from: s  reason: collision with root package name */
    private final BroadcastReceiver f34634s = new t2();

    /* renamed from: t  reason: collision with root package name */
    private final IntentFilter f34635t = new IntentFilter();

    /* renamed from: u  reason: collision with root package name */
    private final BroadcastReceiver f34636u = new e3();

    /* renamed from: v  reason: collision with root package name */
    private final IntentFilter f34637v = new IntentFilter();

    /* renamed from: w  reason: collision with root package name */
    private final BroadcastReceiver f34638w = new p3();

    /* renamed from: x  reason: collision with root package name */
    private final IntentFilter f34639x = new IntentFilter();

    /* renamed from: y  reason: collision with root package name */
    private final BroadcastReceiver f34640y = new k();

    /* renamed from: z  reason: collision with root package name */
    private final IntentFilter f34641z = new IntentFilter();
    private final BroadcastReceiver A = new v();
    private final IntentFilter B = new IntentFilter();
    private final BroadcastReceiver C = new x();
    private final IntentFilter D = new IntentFilter();
    private final BroadcastReceiver E = new y();

    /* loaded from: classes4.dex */
    class a extends a.c {
        a(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                MGMainActivity_.super.onresumData();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class a0 implements View.OnClickListener {
        a0() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MGMainActivity_.this.mg_category_tabselectClicked();
        }
    }

    /* loaded from: classes4.dex */
    class a1 implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f34644b;

        a1(String str) {
            this.f34644b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            MGMainActivity_.super.sendRegister(this.f34644b);
        }
    }

    /* loaded from: classes4.dex */
    class a2 implements Runnable {
        a2() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MGMainActivity_.super.delayChangeAdshow();
        }
    }

    /* loaded from: classes4.dex */
    class a3 extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f34647b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a3(String str, long j4, String str2, String str3) {
            super(str, j4, str2);
            this.f34647b = str3;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                MGMainActivity_.super.getDetailData(this.f34647b);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class b extends a.c {
        b(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                MGMainActivity_.super.updateAndroidApp();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class b0 implements View.OnClickListener {
        b0() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MGMainActivity_.this.mg_chart_tabselectClicked();
        }
    }

    /* loaded from: classes4.dex */
    class b1 extends BroadcastReceiver {
        b1() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            MGMainActivity_.this.showupdateDialog(intent);
        }
    }

    /* loaded from: classes4.dex */
    class b2 implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DownloadTask f34652b;

        b2(DownloadTask downloadTask) {
            this.f34652b = downloadTask;
        }

        @Override // java.lang.Runnable
        public void run() {
            MGMainActivity_.super.updateStartGameTable(this.f34652b);
        }
    }

    /* loaded from: classes4.dex */
    class b3 extends a.c {
        b3(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                MGMainActivity_.super.checkInstallApp();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class c extends a.c {
        c(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                MGMainActivity_.super.setwifiStadu();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class c0 implements View.OnClickListener {
        c0() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MGMainActivity_.this.mg_emulator_tabselect();
        }
    }

    /* loaded from: classes4.dex */
    class c1 implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f34657b;

        c1(int i4) {
            this.f34657b = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            MGMainActivity_.super.updateLine(this.f34657b);
        }
    }

    /* loaded from: classes4.dex */
    class c2 implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f34659b;

        c2(View view) {
            this.f34659b = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            MGMainActivity_.super.startAlphaBreathAnimation(this.f34659b);
        }
    }

    /* loaded from: classes4.dex */
    class c3 extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f34661b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ List f34662c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c3(String str, long j4, String str2, String str3, List list) {
            super(str, j4, str2);
            this.f34661b = str3;
            this.f34662c = list;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                MGMainActivity_.super.getUnInstallGameInfo(this.f34661b, this.f34662c);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class d extends a.c {
        d(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                MGMainActivity_.super.touristLogin();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class d0 implements View.OnClickListener {
        d0() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MGMainActivity_.this.fightSelect();
        }
    }

    /* loaded from: classes4.dex */
    class d1 implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f34666b;

        d1(int i4) {
            this.f34666b = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            MGMainActivity_.super.updateDownloadingPoint(this.f34666b);
        }
    }

    /* loaded from: classes4.dex */
    class d2 implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DownloadTask f34668b;

        d2(DownloadTask downloadTask) {
            this.f34668b = downloadTask;
        }

        @Override // java.lang.Runnable
        public void run() {
            MGMainActivity_.super.delaydown(this.f34668b);
        }
    }

    /* loaded from: classes4.dex */
    class d3 extends a.c {
        d3(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                MGMainActivity_.super.rewadCopper();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class e extends a.c {
        e(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                MGMainActivity_.super.getUpdateFeature();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class e0 implements Runnable {
        e0() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MGMainActivity_.super.hideSplash();
        }
    }

    /* loaded from: classes4.dex */
    class e1 implements Runnable {
        e1() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MGMainActivity_.super.updateNoOpenPoint();
        }
    }

    /* loaded from: classes4.dex */
    class e2 implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.join.mgps.event.q f34674b;

        e2(com.join.mgps.event.q qVar) {
            this.f34674b = qVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            MGMainActivity_.super.startGameRoom(this.f34674b);
        }
    }

    /* loaded from: classes4.dex */
    class e3 extends BroadcastReceiver {
        e3() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            MGMainActivity_.this.receivedInitAdVideoConfig(intent);
        }
    }

    /* loaded from: classes4.dex */
    class f extends a.c {
        f(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                MGMainActivity_.super.getHomePopupAd();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class f0 extends BroadcastReceiver {
        f0() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            MGMainActivity_.this.recivedShowToast(intent);
        }
    }

    /* loaded from: classes4.dex */
    class f1 implements Runnable {
        f1() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MGMainActivity_.super.updateHidePoint();
        }
    }

    /* loaded from: classes4.dex */
    class f2 implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ArenaRequest f34680b;

        f2(ArenaRequest arenaRequest) {
            this.f34680b = arenaRequest;
        }

        @Override // java.lang.Runnable
        public void run() {
            MGMainActivity_.super.showInputRoomPwdDialog(this.f34680b);
        }
    }

    /* loaded from: classes4.dex */
    class f3 extends a.c {
        f3(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                MGMainActivity_.super.init();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class g extends a.c {
        g(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                MGMainActivity_.super.getBootPageData();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class g0 implements Runnable {
        g0() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MGMainActivity_.super.hideSplash2();
        }
    }

    /* loaded from: classes4.dex */
    class g1 implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ VersionDto f34685b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f34686c;

        g1(VersionDto versionDto, boolean z4) {
            this.f34685b = versionDto;
            this.f34686c = z4;
        }

        @Override // java.lang.Runnable
        public void run() {
            MGMainActivity_.super.showVersionDownLoadHint(this.f34685b, this.f34686c);
        }
    }

    /* loaded from: classes4.dex */
    class g2 implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ArenaResponse f34688b;

        g2(ArenaResponse arenaResponse) {
            this.f34688b = arenaResponse;
        }

        @Override // java.lang.Runnable
        public void run() {
            MGMainActivity_.super.handleFailure(this.f34688b);
        }
    }

    /* loaded from: classes4.dex */
    class g3 extends a.c {
        g3(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                MGMainActivity_.super.checkToken();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class h extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PopupAdBean f34691b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(String str, long j4, String str2, PopupAdBean popupAdBean) {
            super(str, j4, str2);
            this.f34691b = popupAdBean;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                MGMainActivity_.super.preLoad(this.f34691b);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class h0 implements Runnable {
        h0() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MGMainActivity_.super.showRedPoint();
        }
    }

    /* loaded from: classes4.dex */
    class h1 implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ TipsInfoBean f34694b;

        h1(TipsInfoBean tipsInfoBean) {
            this.f34694b = tipsInfoBean;
        }

        @Override // java.lang.Runnable
        public void run() {
            MGMainActivity_.super.updateFindGameRetHot(this.f34694b);
        }
    }

    /* loaded from: classes4.dex */
    class h2 implements Runnable {
        h2() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MGMainActivity_.super.autoSendAdd();
        }
    }

    /* loaded from: classes4.dex */
    class h3 extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f34697b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h3(String str, long j4, String str2, boolean z4) {
            super(str, j4, str2);
            this.f34697b = z4;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                MGMainActivity_.super.startBackups(this.f34697b);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class i extends a.c {
        i(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                MGMainActivity_.super.checkSNKGame();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class i0 implements Runnable {
        i0() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MGMainActivity_.super.hideRedPoint();
        }
    }

    /* loaded from: classes4.dex */
    class i1 implements Runnable {
        i1() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MGMainActivity_.super.startPlayVideo();
        }
    }

    /* loaded from: classes4.dex */
    class i2 extends BroadcastReceiver {
        i2() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            MGMainActivity_.this.recveidDownLiveRes(intent);
        }
    }

    /* loaded from: classes4.dex */
    class i3 extends a.c {
        i3(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                MGMainActivity_.super.startLoadRecommendwifi();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class j extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f34704b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(String str, long j4, String str2, int i4) {
            super(str, j4, str2);
            this.f34704b = i4;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                MGMainActivity_.super.getSNKGameInfo(this.f34704b);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class j0 implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f34706b;

        j0(boolean z4) {
            this.f34706b = z4;
        }

        @Override // java.lang.Runnable
        public void run() {
            MGMainActivity_.super.checkShowOldUserRecom(this.f34706b);
        }
    }

    /* loaded from: classes4.dex */
    class j1 implements Runnable {
        j1() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MGMainActivity_.super.refreshTabIcon();
        }
    }

    /* loaded from: classes4.dex */
    class j2 implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ OnlineCouponConfigBean f34709b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f34710c;

        j2(OnlineCouponConfigBean onlineCouponConfigBean, int i4) {
            this.f34709b = onlineCouponConfigBean;
            this.f34710c = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            MGMainActivity_.super.showOnlineCouponDialog(this.f34709b, this.f34710c);
        }
    }

    /* loaded from: classes4.dex */
    class j3 extends a.c {
        j3(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                MGMainActivity_.super.getdownloadTask();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class k extends BroadcastReceiver {
        k() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            MGMainActivity_.this.downloadPermissGet(intent);
        }
    }

    /* loaded from: classes4.dex */
    class k0 implements Runnable {
        k0() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MGMainActivity_.super.checkRealName();
        }
    }

    /* loaded from: classes4.dex */
    class k1 implements Runnable {
        k1() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MGMainActivity_.super.serverConnectionException();
        }
    }

    /* loaded from: classes4.dex */
    class k2 implements Runnable {
        k2() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MGMainActivity_.super.goToOnekeyLogin();
        }
    }

    /* loaded from: classes4.dex */
    class k3 extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f34717b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k3(String str, long j4, String str2, String str3) {
            super(str, j4, str2);
            this.f34717b = str3;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                MGMainActivity_.super.sendRigester(this.f34717b);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class l extends a.c {
        l(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                MGMainActivity_.super.initAdVideoConfig();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class l0 implements Runnable {
        l0() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MGMainActivity_.super.selectTableDelay();
        }
    }

    /* loaded from: classes4.dex */
    class l1 implements Runnable {
        l1() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MGMainActivity_.super.showDownNotice();
        }
    }

    /* loaded from: classes4.dex */
    class l2 extends a.c {
        l2(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                MGMainActivity_.super.saveUUID();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class l3 extends a.c {
        l3(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                MGMainActivity_.super.checkDownlodingNumber();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class m extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ VideoWatchLogTable f34724b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f34725c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(String str, long j4, String str2, VideoWatchLogTable videoWatchLogTable, boolean z4) {
            super(str, j4, str2);
            this.f34724b = videoWatchLogTable;
            this.f34725c = z4;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                MGMainActivity_.super.videoAdWatchLog(this.f34724b, this.f34725c);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class m0 implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f34727b;

        m0(List list) {
            this.f34727b = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            MGMainActivity_.super.setADCacheData(this.f34727b);
        }
    }

    /* loaded from: classes4.dex */
    class m1 extends BroadcastReceiver {
        m1() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            MGMainActivity_.this.backUpGameFinish(intent);
        }
    }

    /* loaded from: classes4.dex */
    class m2 extends a.c {
        m2(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                MGMainActivity_.super.initApplicationData();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class m3 extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f34731b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m3(String str, long j4, String str2, boolean z4) {
            super(str, j4, str2);
            this.f34731b = z4;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                MGMainActivity_.super.getVideoAdCfg(this.f34731b);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class n extends a.c {
        n(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                MGMainActivity_.super.handleVideoAdWatchLogRecord();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class n0 implements Runnable {
        n0() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MGMainActivity_.super.checkPlugNeedUpdate();
        }
    }

    /* loaded from: classes4.dex */
    class n1 implements Runnable {
        n1() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MGMainActivity_.super.sendHomeDownInstallListPoint();
        }
    }

    /* loaded from: classes4.dex */
    class n2 extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ MApplication f34736b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n2(String str, long j4, String str2, MApplication mApplication) {
            super(str, j4, str2);
            this.f34736b = mApplication;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                MGMainActivity_.super.initOM(this.f34736b);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class n3 extends a.c {
        n3(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                MGMainActivity_.super.getEMUVersion();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class o extends a.c {
        o(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                MGMainActivity_.super.afterLogin();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class o0 implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ long f34740b;

        o0(long j4) {
            this.f34740b = j4;
        }

        @Override // java.lang.Runnable
        public void run() {
            MGMainActivity_.super.startIntentOldUserRecom(this.f34740b);
        }
    }

    /* loaded from: classes4.dex */
    class o1 implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DownloadTask f34742b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f34743c;

        o1(DownloadTask downloadTask, int i4) {
            this.f34742b = downloadTask;
            this.f34743c = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            MGMainActivity_.super.receiveStart(this.f34742b, this.f34743c);
        }
    }

    /* loaded from: classes4.dex */
    class o2 extends a.c {
        o2(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                MGMainActivity_.super.getRootUrl();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class o3 extends a.c {
        o3(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                MGMainActivity_.super.pullUpExtHelper();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class p extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f34747b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(String str, long j4, String str2, int i4) {
            super(str, j4, str2);
            this.f34747b = i4;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                MGMainActivity_.super.reject(this.f34747b);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class p0 implements Runnable {
        p0() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MGMainActivity_.super.addShortCuts();
        }
    }

    /* loaded from: classes4.dex */
    class p1 implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DownloadTask f34750b;

        p1(DownloadTask downloadTask) {
            this.f34750b = downloadTask;
        }

        @Override // java.lang.Runnable
        public void run() {
            MGMainActivity_.super.receiveSuccess(this.f34750b);
        }
    }

    /* loaded from: classes4.dex */
    class p2 extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f34752b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f34753c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p2(String str, long j4, String str2, List list, int i4) {
            super(str, j4, str2);
            this.f34752b = list;
            this.f34753c = i4;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                MGMainActivity_.super.initCheckSNKGame(this.f34752b, this.f34753c);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class p3 extends BroadcastReceiver {
        p3() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            MGMainActivity_.this.downloaddelay(intent);
        }
    }

    /* loaded from: classes4.dex */
    class q extends a.c {
        q(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                MGMainActivity_.super.checkClipBoard2();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class q0 extends BroadcastReceiver {
        q0() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            MGMainActivity_.this.getUpdateIntent(intent);
        }
    }

    /* loaded from: classes4.dex */
    class q1 implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DownloadTask f34758b;

        q1(DownloadTask downloadTask) {
            this.f34758b = downloadTask;
        }

        @Override // java.lang.Runnable
        public void run() {
            MGMainActivity_.super.receiveDelete(this.f34758b);
        }
    }

    /* loaded from: classes4.dex */
    class q2 extends a.c {
        q2(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                MGMainActivity_.super.preloadingAD();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    public static class q3 extends org.androidannotations.api.builder.a<q3> {

        /* renamed from: a  reason: collision with root package name */
        private Fragment f34761a;

        public q3(Context context) {
            super(context, MGMainActivity_.class);
        }

        public q3 a(IntentDateBean intentDateBean) {
            return (q3) super.extra("intentDateBean", intentDateBean);
        }

        public q3 b(IntentDateBean intentDateBean) {
            return (q3) super.extra(MGMainActivity_.G, intentDateBean);
        }

        public q3 c(JPushIntentData jPushIntentData) {
            return (q3) super.extra(MGMainActivity_.H, jPushIntentData);
        }

        @Override // org.androidannotations.api.builder.a, org.androidannotations.api.builder.b
        public org.androidannotations.api.builder.f startForResult(int i4) {
            Fragment fragment = this.f34761a;
            if (fragment != null) {
                fragment.startActivityForResult(this.intent, i4);
            } else {
                Context context = this.context;
                if (context instanceof Activity) {
                    ActivityCompat.startActivityForResult((Activity) context, this.intent, i4, this.lastOptions);
                } else {
                    context.startActivity(this.intent);
                }
            }
            return new org.androidannotations.api.builder.f(this.context);
        }

        public q3(Fragment fragment) {
            super(fragment.getActivity(), MGMainActivity_.class);
            this.f34761a = fragment;
        }
    }

    /* loaded from: classes4.dex */
    class r extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f34762b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        r(String str, long j4, String str2, int i4) {
            super(str, j4, str2);
            this.f34762b = i4;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                MGMainActivity_.super.getOnlineCouponConfig(this.f34762b);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class r0 implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CollectionBeanSub f34764b;

        r0(CollectionBeanSub collectionBeanSub) {
            this.f34764b = collectionBeanSub;
        }

        @Override // java.lang.Runnable
        public void run() {
            MGMainActivity_.super.showSharedGameDialog(this.f34764b);
        }
    }

    /* loaded from: classes4.dex */
    class r1 implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f34766b;

        r1(String str) {
            this.f34766b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            MGMainActivity_.super.error(this.f34766b);
        }
    }

    /* loaded from: classes4.dex */
    class r2 extends a.c {
        r2(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                MGMainActivity_.super.initJPushJoinDevice();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class s extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f34769b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        s(String str, long j4, String str2, boolean z4) {
            super(str, j4, str2);
            this.f34769b = z4;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                MGMainActivity_.super.preLogin(this.f34769b);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class s0 implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f34771b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ List f34772c;

        s0(int i4, List list) {
            this.f34771b = i4;
            this.f34772c = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            MGMainActivity_.super.showInstallAppDialogActivity(this.f34771b, this.f34772c);
        }
    }

    /* loaded from: classes4.dex */
    class s1 implements Runnable {
        s1() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MGMainActivity_.super.showAdM();
        }
    }

    /* loaded from: classes4.dex */
    class s2 extends a.c {
        s2(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                MGMainActivity_.super.getRedPointData();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class t extends a.c {
        t(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                MGMainActivity_.super.getAvailableLoginMethods();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class t0 implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f34777b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ UninstallOnlineGameBean f34778c;

        t0(String str, UninstallOnlineGameBean uninstallOnlineGameBean) {
            this.f34777b = str;
            this.f34778c = uninstallOnlineGameBean;
        }

        @Override // java.lang.Runnable
        public void run() {
            MGMainActivity_.super.gotoInstallAppDialogV2Activity(this.f34777b, this.f34778c);
        }
    }

    /* loaded from: classes4.dex */
    class t1 implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PopupAdBean f34780b;

        t1(PopupAdBean popupAdBean) {
            this.f34780b = popupAdBean;
        }

        @Override // java.lang.Runnable
        public void run() {
            MGMainActivity_.super.showHomePopupAd(this.f34780b);
        }
    }

    /* loaded from: classes4.dex */
    class t2 extends BroadcastReceiver {
        t2() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            MGMainActivity_.this.recveidcoinfloat(intent);
        }
    }

    /* loaded from: classes4.dex */
    class u extends a.c {
        u(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                MGMainActivity_.super.checkQuark();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class u0 implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ RewardBean f34784b;

        u0(RewardBean rewardBean) {
            this.f34784b = rewardBean;
        }

        @Override // java.lang.Runnable
        public void run() {
            MGMainActivity_.super.toastData(this.f34784b);
        }
    }

    /* loaded from: classes4.dex */
    class u1 implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f34786b;

        u1(int i4) {
            this.f34786b = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            MGMainActivity_.super.sanLocalGameIv(this.f34786b);
        }
    }

    /* loaded from: classes4.dex */
    class u2 extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f34788b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        u2(String str, long j4, String str2, boolean z4) {
            super(str, j4, str2);
            this.f34788b = z4;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                MGMainActivity_.super.getData(this.f34788b);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class v extends BroadcastReceiver {
        v() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            MGMainActivity_.this.accountChange(intent);
        }
    }

    /* loaded from: classes4.dex */
    class v0 implements Runnable {
        v0() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MGMainActivity_.super.initViewS();
        }
    }

    /* loaded from: classes4.dex */
    class v1 implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f34792b;

        v1(List list) {
            this.f34792b = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            MGMainActivity_.super.showCheckData(this.f34792b);
        }
    }

    /* loaded from: classes4.dex */
    class v2 extends a.c {
        v2(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                MGMainActivity_.super.getEndGameConfig();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class w extends a.c {
        w(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                MGMainActivity_.super.scanQuarkTask();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class w0 implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f34796b;

        w0(String str) {
            this.f34796b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            MGMainActivity_.super.showMessage(this.f34796b);
        }
    }

    /* loaded from: classes4.dex */
    class w1 implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f34798b;

        w1(String str) {
            this.f34798b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            MGMainActivity_.super.showToast(this.f34798b);
        }
    }

    /* loaded from: classes4.dex */
    class w2 extends a.c {
        w2(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                MGMainActivity_.super.getLogincfgs();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class x extends BroadcastReceiver {
        x() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            MGMainActivity_.this.afterLogin();
        }
    }

    /* loaded from: classes4.dex */
    class x0 implements Runnable {
        x0() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MGMainActivity_.super.updateHistory();
        }
    }

    /* loaded from: classes4.dex */
    class x1 extends BroadcastReceiver {

        /* renamed from: b  reason: collision with root package name */
        public static final String f34803b = "gameId";

        x1() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            MGMainActivity_.this.unreadnotify((intent.getExtras() != null ? intent.getExtras() : new Bundle()).getString("gameId"));
        }
    }

    /* loaded from: classes4.dex */
    class x2 extends a.c {
        x2(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                MGMainActivity_.super.getHaveGameList();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class y extends BroadcastReceiver {

        /* renamed from: b  reason: collision with root package name */
        public static final String f34806b = "packageName";

        y() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            MGMainActivity_.this.emuOnResume((intent.getExtras() != null ? intent.getExtras() : new Bundle()).getString("packageName"));
        }
    }

    /* loaded from: classes4.dex */
    class y0 implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f34808b;

        y0(int i4) {
            this.f34808b = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            MGMainActivity_.super.showBackupFinishDialog(this.f34808b);
        }
    }

    /* loaded from: classes4.dex */
    class y1 implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ SNKGameInfoBean f34810b;

        y1(SNKGameInfoBean sNKGameInfoBean) {
            this.f34810b = sNKGameInfoBean;
        }

        @Override // java.lang.Runnable
        public void run() {
            MGMainActivity_.super.setSNKGameData(this.f34810b);
        }
    }

    /* loaded from: classes4.dex */
    class y2 extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f34812b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        y2(String str, long j4, String str2, List list) {
            super(str, j4, str2);
            this.f34812b = list;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                MGMainActivity_.super.savePurchasedList(this.f34812b);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class z implements View.OnClickListener {
        z() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MGMainActivity_.this.mg_recom_tabselectClicked();
        }
    }

    /* loaded from: classes4.dex */
    class z0 implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f34815b;

        z0(List list) {
            this.f34815b = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            MGMainActivity_.super.getdownloadTaskUI(this.f34815b);
        }
    }

    /* loaded from: classes4.dex */
    class z1 implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.join.mgps.ad.d f34817b;

        z1(com.join.mgps.ad.d dVar) {
            this.f34817b = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            MGMainActivity_.super.delayLoadRewardAd(this.f34817b);
        }
    }

    /* loaded from: classes4.dex */
    class z2 extends a.c {
        z2(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                MGMainActivity_.super.checkPurchasedList();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    public static q3 A2(Context context) {
        return new q3(context);
    }

    public static q3 B2(Fragment fragment) {
        return new q3(fragment);
    }

    private void init_(Bundle bundle) {
        Resources resources = getResources();
        ((MGMainActivity) this).prefDef = new PrefDef_(this);
        a4.c.b(this);
        this.netExcption = resources.getString(R.string.net_excption);
        this.netConnectException = resources.getString(R.string.connect_server_excption);
        injectExtras_();
        this.f34621d.addAction("com.join.intent.showtoast");
        this.f34623f.addAction(o1.a.K);
        this.f34625h.addAction(o1.a.f71999f0);
        this.f34627j.addAction(o1.a.f72036y);
        this.f34629l.addAction(o1.a.f72008k);
        this.f34631o.addAction(o1.a.E);
        this.f34633q.addAction(o1.a.F);
        this.f34635t.addAction(o1.a.f72027t0);
        this.f34637v.addAction(o1.a.f72009k0);
        this.f34639x.addAction(o1.a.f72011l0);
        this.f34641z.addAction(o1.a.B);
        this.B.addAction("com.join.android.app.mgsim.wufun.broadcast.action_login_success");
        this.D.addAction(o1.a.f71997e0);
        registerReceiver(this.f34622e, this.f34621d);
        registerReceiver(this.f34624g, this.f34623f);
        registerReceiver(this.f34626i, this.f34625h);
        registerReceiver(this.f34628k, this.f34627j);
        registerReceiver(this.f34630m, this.f34629l);
        registerReceiver(this.f34632p, this.f34631o);
        registerReceiver(this.f34634s, this.f34633q);
        registerReceiver(this.f34636u, this.f34635t);
        registerReceiver(this.f34638w, this.f34637v);
        registerReceiver(this.f34640y, this.f34639x);
        registerReceiver(this.A, this.f34641z);
        registerReceiver(this.C, this.B);
        registerReceiver(this.E, this.D);
    }

    private void injectExtras_() {
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            if (extras.containsKey("intentDateBean")) {
                this.intentDateBean = (IntentDateBean) extras.getSerializable("intentDateBean");
            }
            if (extras.containsKey(G)) {
                this.intentDateBean22 = (IntentDateBean) extras.getSerializable(G);
            }
            if (extras.containsKey(H)) {
                this.jPushIntentData = (JPushIntentData) extras.getSerializable(H);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MGMainActivity
    public void addShortCuts() {
        org.androidannotations.api.b.e("", new p0(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MGMainActivity
    public void afterLogin() {
        org.androidannotations.api.a.l(new o("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MGMainActivity
    public void autoSendAdd() {
        org.androidannotations.api.b.e("", new h2(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MGMainActivity
    public void checkClipBoard2() {
        org.androidannotations.api.a.l(new q("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MGMainActivity
    public void checkDownlodingNumber() {
        org.androidannotations.api.a.l(new l3("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MGMainActivity
    public void checkInstallApp() {
        org.androidannotations.api.a.l(new b3("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MGMainActivity
    public void checkPlugNeedUpdate() {
        org.androidannotations.api.b.e("", new n0(), 1200L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MGMainActivity
    public void checkPurchasedList() {
        org.androidannotations.api.a.l(new z2("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MGMainActivity
    public void checkQuark() {
        org.androidannotations.api.a.l(new u("", 1500L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MGMainActivity
    public void checkRealName() {
        org.androidannotations.api.b.e("", new k0(), 1000L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MGMainActivity
    public void checkSNKGame() {
        org.androidannotations.api.a.l(new i("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MGMainActivity
    public void checkShowOldUserRecom(boolean z4) {
        org.androidannotations.api.b.e("", new j0(z4), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MGMainActivity
    public void checkToken() {
        org.androidannotations.api.a.l(new g3("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MGMainActivity
    public void delayChangeAdshow() {
        org.androidannotations.api.b.e("", new a2(), 2000L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MGMainActivity
    public void delayLoadRewardAd(com.join.mgps.ad.d dVar) {
        org.androidannotations.api.b.e("", new z1(dVar), 300L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MGMainActivity
    public void delaydown(DownloadTask downloadTask) {
        org.androidannotations.api.b.e("", new d2(downloadTask), 3000L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MGMainActivity
    public void error(String str) {
        org.androidannotations.api.b.e("", new r1(str), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MGMainActivity
    public void getAvailableLoginMethods() {
        org.androidannotations.api.a.l(new t("", 0L, ""));
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.f34620c.get(cls);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MGMainActivity
    public void getBootPageData() {
        org.androidannotations.api.a.l(new g("", 1500L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MGMainActivity
    public void getData(boolean z4) {
        org.androidannotations.api.a.l(new u2("", 1000L, "", z4));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MGMainActivity
    public void getDetailData(String str) {
        org.androidannotations.api.a.l(new a3("", 0L, "", str));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MGMainActivity
    public void getEMUVersion() {
        org.androidannotations.api.a.l(new n3("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MGMainActivity
    public void getEndGameConfig() {
        org.androidannotations.api.a.l(new v2("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MGMainActivity
    public void getHaveGameList() {
        org.androidannotations.api.a.l(new x2("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MGMainActivity
    public void getHomePopupAd() {
        org.androidannotations.api.a.l(new f("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MGMainActivity
    public void getLogincfgs() {
        org.androidannotations.api.a.l(new w2("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MGMainActivity
    public void getOnlineCouponConfig(int i4) {
        org.androidannotations.api.a.l(new r("", 0L, "", i4));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MGMainActivity
    public void getRedPointData() {
        org.androidannotations.api.a.l(new s2("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MGMainActivity
    public void getRootUrl() {
        org.androidannotations.api.a.l(new o2("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MGMainActivity
    public void getSNKGameInfo(int i4) {
        org.androidannotations.api.a.l(new j("", 0L, "", i4));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MGMainActivity
    public void getUnInstallGameInfo(String str, List<DownloadTask> list) {
        org.androidannotations.api.a.l(new c3("", 0L, "", str, list));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MGMainActivity
    public void getUpdateFeature() {
        org.androidannotations.api.a.l(new e("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MGMainActivity
    public void getVideoAdCfg(boolean z4) {
        org.androidannotations.api.a.l(new m3("", 0L, "", z4));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MGMainActivity
    public void getdownloadTask() {
        org.androidannotations.api.a.l(new j3("", 1000L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MGMainActivity
    public void getdownloadTaskUI(List<DownloadTask> list) {
        org.androidannotations.api.b.e("", new z0(list), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MGMainActivity
    public void goToOnekeyLogin() {
        org.androidannotations.api.b.e("", new k2(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MGMainActivity
    public void gotoInstallAppDialogV2Activity(String str, UninstallOnlineGameBean uninstallOnlineGameBean) {
        org.androidannotations.api.b.e("", new t0(str, uninstallOnlineGameBean), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MGMainActivity
    public void handleFailure(ArenaResponse arenaResponse) {
        org.androidannotations.api.b.e("", new g2(arenaResponse), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MGMainActivity
    public void handleVideoAdWatchLogRecord() {
        org.androidannotations.api.a.l(new n("", 5000L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MGMainActivity
    public void hideRedPoint() {
        org.androidannotations.api.b.e("", new i0(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MGMainActivity
    public void hideSplash() {
        org.androidannotations.api.b.e("", new e0(), 1300L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MGMainActivity
    public void hideSplash2() {
        org.androidannotations.api.b.e("", new g0(), 1300L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MGMainActivity
    public void init() {
        org.androidannotations.api.a.l(new f3("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MGMainActivity
    public void initAdVideoConfig() {
        org.androidannotations.api.a.l(new l("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MGMainActivity
    public void initApplicationData() {
        org.androidannotations.api.a.l(new m2("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MGMainActivity
    public void initCheckSNKGame(List<String> list, int i4) {
        org.androidannotations.api.a.l(new p2("", 0L, "", list, i4));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MGMainActivity
    public void initJPushJoinDevice() {
        org.androidannotations.api.a.l(new r2("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MGMainActivity
    public void initOM(MApplication mApplication) {
        org.androidannotations.api.a.l(new n2("", 0L, "", mApplication));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MGMainActivity
    public void initViewS() {
        org.androidannotations.api.b.e("", new v0(), 500L);
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        return (T) findViewById(i4);
    }

    @Override // com.join.mgps.activity.MGMainActivity, com.join.android.app.common.servcie.DownloadBaseActivity, com.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.f34619b);
        init_(bundle);
        super.onCreate(bundle);
        a4.c.c(c5);
        setContentView(R.layout.mg_mainlayout);
    }

    @Override // com.join.mgps.activity.MGMainActivity, com.join.android.app.common.servcie.DownloadBaseActivity, com.join.mgps.activity.MyFragmentActivity1, com.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        unregisterReceiver(this.f34622e);
        unregisterReceiver(this.f34624g);
        unregisterReceiver(this.f34626i);
        unregisterReceiver(this.f34628k);
        unregisterReceiver(this.f34630m);
        unregisterReceiver(this.f34632p);
        unregisterReceiver(this.f34634s);
        unregisterReceiver(this.f34636u);
        unregisterReceiver(this.f34638w);
        unregisterReceiver(this.f34640y);
        unregisterReceiver(this.A);
        unregisterReceiver(this.C);
        unregisterReceiver(this.E);
        super.onDestroy();
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.numberInTab = (LightningView) aVar.internalFindViewById(R.id.numberInTab);
        this.cdp_down_progress = (CircleDownloadProgressBar) aVar.internalFindViewById(R.id.cdp_down_progress);
        this.downlodingGameIcon = (SimpleDraweeView) aVar.internalFindViewById(R.id.downlodingGameIcon);
        this.splash = (ImageView) aVar.internalFindViewById(R.id.splash);
        this.bottom = (LinearLayout) aVar.internalFindViewById(R.id.bottom);
        this.mg_recom_tabselect = (RelativeLayout) aVar.internalFindViewById(R.id.mg_recom_tabselect);
        this.mg_category_tabselect = (LinearLayout) aVar.internalFindViewById(R.id.mg_category_tabselect);
        this.mg_emulator_tabselect = (RelativeLayout) aVar.internalFindViewById(R.id.mg_emulator_tabselect);
        this.mg_recom_image = (ImageView) aVar.internalFindViewById(R.id.mg_recom_image);
        this.mg_recom_text = (TextView) aVar.internalFindViewById(R.id.mg_recom_text);
        this.mg_category_image = (ImageView) aVar.internalFindViewById(R.id.mg_category_image);
        this.mg_category_text = (TextView) aVar.internalFindViewById(R.id.mg_category_text);
        this.mg_chart_image = (ImageView) aVar.internalFindViewById(R.id.mg_chart_image);
        this.gifIcon = (SimpleDraweeView) aVar.internalFindViewById(R.id.gifIcon);
        this.mg_chart_text = (TextView) aVar.internalFindViewById(R.id.mg_chart_text);
        this.mg_emulator_image = (ImageView) aVar.internalFindViewById(R.id.mg_emulator_image);
        this.mg_emulator_text = (TextView) aVar.internalFindViewById(R.id.mg_emulator_text);
        this.fightImage = (ImageView) aVar.internalFindViewById(R.id.fightImage);
        this.fightText = (TextView) aVar.internalFindViewById(R.id.fightText);
        this.red_point = (TextView) aVar.internalFindViewById(R.id.red_point);
        this.fightSelect = (RelativeLayout) aVar.internalFindViewById(R.id.fightSelect);
        this.mg_chart_tabselect = (RelativeLayout) aVar.internalFindViewById(R.id.mg_chart_tabselect);
        this.unreadMessageBadge = (TextView) aVar.internalFindViewById(R.id.unreadMessageBadge);
        this.home_tab_monkey_layout = (RelativeLayout) aVar.internalFindViewById(R.id.home_tab_monkey_layout);
        this.home_tab_default_layout = (LinearLayout) aVar.internalFindViewById(R.id.home_tab_default_layout);
        this.home_tab_monkey_image = (ImageView) aVar.internalFindViewById(R.id.home_tab_monkey_image);
        this.home_tab_huojian_image = (ImageView) aVar.internalFindViewById(R.id.home_tab_huojian_image);
        this.imageView36 = (ImageView) aVar.internalFindViewById(R.id.imageView36);
        this.layout_others = (RelativeLayout) aVar.internalFindViewById(R.id.layout_others);
        this.discoverNormal = (LinearLayout) aVar.internalFindViewById(R.id.discoverNormal);
        this.discoverMessage = (ImageView) aVar.internalFindViewById(R.id.discoverMessage);
        this.discoverHuojian = (ImageView) aVar.internalFindViewById(R.id.discoverHuojian);
        this.notice_text = (TextView) aVar.internalFindViewById(R.id.notice_text);
        this.dialogBack = (TextView) aVar.internalFindViewById(R.id.dialogBack);
        this.notice_layout = (LinearLayout) aVar.internalFindViewById(R.id.notice_layout);
        this.bigCenterRound = (TextView) aVar.internalFindViewById(R.id.bigCenterRound);
        this.miniGameBadge = (TextView) aVar.internalFindViewById(R.id.miniGameBadge);
        this.endGameBadge = (TextView) aVar.internalFindViewById(R.id.endGameBadge);
        RelativeLayout relativeLayout = this.mg_recom_tabselect;
        if (relativeLayout != null) {
            relativeLayout.setOnClickListener(new z());
        }
        LinearLayout linearLayout = this.mg_category_tabselect;
        if (linearLayout != null) {
            linearLayout.setOnClickListener(new a0());
        }
        RelativeLayout relativeLayout2 = this.mg_chart_tabselect;
        if (relativeLayout2 != null) {
            relativeLayout2.setOnClickListener(new b0());
        }
        RelativeLayout relativeLayout3 = this.mg_emulator_tabselect;
        if (relativeLayout3 != null) {
            relativeLayout3.setOnClickListener(new c0());
        }
        RelativeLayout relativeLayout4 = this.fightSelect;
        if (relativeLayout4 != null) {
            relativeLayout4.setOnClickListener(new d0());
        }
        afterViews();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MGMainActivity
    public void onresumData() {
        org.androidannotations.api.a.l(new a("", 1000L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MGMainActivity
    public void preLoad(PopupAdBean popupAdBean) {
        org.androidannotations.api.a.l(new h("", 0L, "", popupAdBean));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MGMainActivity
    public void preLogin(boolean z4) {
        org.androidannotations.api.a.l(new s("", 0L, "", z4));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MGMainActivity
    public void preloadingAD() {
        org.androidannotations.api.a.l(new q2("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MGMainActivity
    public void pullUpExtHelper() {
        org.androidannotations.api.a.l(new o3("", 0L, ""));
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.f34620c.put(cls, t4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MGMainActivity
    public void receiveDelete(DownloadTask downloadTask) {
        org.androidannotations.api.b.e("", new q1(downloadTask), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MGMainActivity
    public void receiveStart(DownloadTask downloadTask, int i4) {
        org.androidannotations.api.b.e("", new o1(downloadTask, i4), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MGMainActivity
    public void receiveSuccess(DownloadTask downloadTask) {
        org.androidannotations.api.b.e("", new p1(downloadTask), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MGMainActivity
    public void refreshTabIcon() {
        org.androidannotations.api.b.e("", new j1(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MGMainActivity
    public void reject(int i4) {
        org.androidannotations.api.a.l(new p("", 0L, "", i4));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MGMainActivity
    public void rewadCopper() {
        org.androidannotations.api.a.l(new d3("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MGMainActivity
    public void sanLocalGameIv(int i4) {
        org.androidannotations.api.b.e("", new u1(i4), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MGMainActivity
    public void savePurchasedList(List<AppBean> list) {
        org.androidannotations.api.a.l(new y2("", 0L, "", list));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MGMainActivity
    public void saveUUID() {
        org.androidannotations.api.a.l(new l2("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MGMainActivity
    public void scanQuarkTask() {
        org.androidannotations.api.a.l(new w("", 3000L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MGMainActivity
    public void selectTableDelay() {
        org.androidannotations.api.b.e("", new l0(), 800L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MGMainActivity
    public void sendHomeDownInstallListPoint() {
        org.androidannotations.api.b.e("", new n1(), 1000L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MGMainActivity
    public void sendRegister(String str) {
        org.androidannotations.api.b.e("", new a1(str), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MGMainActivity
    public void sendRigester(String str) {
        org.androidannotations.api.a.l(new k3("", 0L, "", str));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MGMainActivity
    public void serverConnectionException() {
        org.androidannotations.api.b.e("", new k1(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MGMainActivity
    public void setADCacheData(List<GameHeadAd> list) {
        org.androidannotations.api.b.e("", new m0(list), 0L);
    }

    @Override // com.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i4) {
        super.setContentView(i4);
        this.f34619b.a(this);
    }

    @Override // android.app.Activity
    public void setIntent(Intent intent) {
        super.setIntent(intent);
        injectExtras_();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MGMainActivity
    public void setSNKGameData(SNKGameInfoBean sNKGameInfoBean) {
        org.androidannotations.api.b.e("", new y1(sNKGameInfoBean), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MGMainActivity
    public void setwifiStadu() {
        org.androidannotations.api.a.l(new c("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MGMainActivity
    public void showAdM() {
        org.androidannotations.api.b.e("", new s1(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MGMainActivity
    public void showBackupFinishDialog(int i4) {
        org.androidannotations.api.b.e("", new y0(i4), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MGMainActivity
    public void showCheckData(List<CollectionBeanSub> list) {
        org.androidannotations.api.b.e("", new v1(list), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MGMainActivity
    public void showDownNotice() {
        org.androidannotations.api.b.e("", new l1(), 1500L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MGMainActivity
    public void showHomePopupAd(PopupAdBean popupAdBean) {
        org.androidannotations.api.b.e("", new t1(popupAdBean), 500L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MGMainActivity
    public void showInputRoomPwdDialog(ArenaRequest arenaRequest) {
        org.androidannotations.api.b.e("", new f2(arenaRequest), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MGMainActivity
    public void showInstallAppDialogActivity(int i4, List<DownloadTask> list) {
        org.androidannotations.api.b.e("", new s0(i4, list), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MGMainActivity
    public void showMessage(String str) {
        org.androidannotations.api.b.e("", new w0(str), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MGMainActivity
    public void showOnlineCouponDialog(OnlineCouponConfigBean onlineCouponConfigBean, int i4) {
        org.androidannotations.api.b.e("", new j2(onlineCouponConfigBean, i4), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MGMainActivity
    public void showRedPoint() {
        org.androidannotations.api.b.e("", new h0(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MGMainActivity
    public void showSharedGameDialog(CollectionBeanSub collectionBeanSub) {
        org.androidannotations.api.b.e("", new r0(collectionBeanSub), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MGMainActivity
    public void showToast(String str) {
        org.androidannotations.api.b.e("", new w1(str), 0L);
    }

    @Override // com.join.mgps.activity.MGMainActivity
    public void showVersionDownLoadHint(VersionDto versionDto, boolean z4) {
        org.androidannotations.api.b.e("", new g1(versionDto, z4), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MGMainActivity
    public void startAlphaBreathAnimation(View view) {
        org.androidannotations.api.b.e("", new c2(view), 400L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MGMainActivity
    public void startBackups(boolean z4) {
        org.androidannotations.api.a.l(new h3("", 0L, "", z4));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MGMainActivity
    public void startGameRoom(com.join.mgps.event.q qVar) {
        org.androidannotations.api.b.e("", new e2(qVar), 200L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MGMainActivity
    public void startIntentOldUserRecom(long j4) {
        org.androidannotations.api.b.e("", new o0(j4), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MGMainActivity
    public void startLoadRecommendwifi() {
        org.androidannotations.api.a.l(new i3("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MGMainActivity
    public void startPlayVideo() {
        org.androidannotations.api.b.e("", new i1(), 400L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MGMainActivity
    public void toastData(RewardBean rewardBean) {
        org.androidannotations.api.b.e("", new u0(rewardBean), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MGMainActivity
    public void touristLogin() {
        org.androidannotations.api.a.l(new d("", 1000L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MGMainActivity
    public void updateAndroidApp() {
        org.androidannotations.api.a.l(new b("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MGMainActivity
    public void updateDownloadingPoint(int i4) {
        org.androidannotations.api.b.e("", new d1(i4), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MGMainActivity
    public void updateFindGameRetHot(TipsInfoBean tipsInfoBean) {
        org.androidannotations.api.b.e("", new h1(tipsInfoBean), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MGMainActivity
    public void updateHidePoint() {
        org.androidannotations.api.b.e("", new f1(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MGMainActivity
    public void updateHistory() {
        org.androidannotations.api.b.e("", new x0(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MGMainActivity
    public void updateLine(int i4) {
        org.androidannotations.api.b.e("", new c1(i4), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MGMainActivity
    public void updateNoOpenPoint() {
        org.androidannotations.api.b.e("", new e1(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MGMainActivity
    public void updateStartGameTable(DownloadTask downloadTask) {
        org.androidannotations.api.b.e("", new b2(downloadTask), 500L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MGMainActivity
    public void videoAdWatchLog(VideoWatchLogTable videoWatchLogTable, boolean z4) {
        org.androidannotations.api.a.l(new m("", 0L, "", videoWatchLogTable, z4));
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        this.f34619b.a(this);
    }

    @Override // com.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        super.setContentView(view);
        this.f34619b.a(this);
    }
}
