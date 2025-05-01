package com.join.mgps.activity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;
import com.facebook.drawee.view.SimpleDraweeView;
import com.flyco.tablayout.SlidingTabLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.join.android.app.component.video.StandardVideoView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.activity.GamedetialModleFourFragemnt;
import com.join.mgps.customview.CustomerDownloadView;
import com.join.mgps.customview.SlidingTabLayoutGameDetailImage;
import com.join.mgps.dto.GameFromPopoWinBean;
import com.join.mgps.dto.GamedetialModleFourBean;
import com.join.mgps.dto.ResultMainBean;
import java.util.HashMap;
import java.util.Map;
import org.androidannotations.api.a;
/* loaded from: classes4.dex */
public final class GamedetialModleFourFragemnt_ extends GamedetialModleFourFragemnt implements y3.a, a4.a, a4.b {
    private View y2;

    /* renamed from: x2  reason: collision with root package name */
    private final a4.c f33280x2 = new a4.c();

    /* renamed from: z2  reason: collision with root package name */
    private final Map<Class<?>, Object> f33281z2 = new HashMap();
    private final IntentFilter A2 = new IntentFilter();
    private final BroadcastReceiver B2 = new k();

    /* loaded from: classes4.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GamedetialModleFourFragemnt_.this.k0();
        }
    }

    /* loaded from: classes4.dex */
    class a0 implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f33283b;

        a0(int i4) {
            this.f33283b = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            GamedetialModleFourFragemnt_.super.M0(this.f33283b);
        }
    }

    /* loaded from: classes4.dex */
    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GamedetialModleFourFragemnt_.this.J0();
        }
    }

    /* loaded from: classes4.dex */
    class b0 implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f33286b;

        b0(int i4) {
            this.f33286b = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            GamedetialModleFourFragemnt_.super.L0(this.f33286b);
        }
    }

    /* loaded from: classes4.dex */
    class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GamedetialModleFourFragemnt_.this.j0();
        }
    }

    /* loaded from: classes4.dex */
    class c0 implements Runnable {
        c0() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GamedetialModleFourFragemnt_.super.O0();
        }
    }

    /* loaded from: classes4.dex */
    class d implements View.OnClickListener {
        d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GamedetialModleFourFragemnt_.this.D0();
        }
    }

    /* loaded from: classes4.dex */
    class d0 implements Runnable {
        d0() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GamedetialModleFourFragemnt_.super.updateDownloadView();
        }
    }

    /* loaded from: classes4.dex */
    class e implements View.OnClickListener {
        e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GamedetialModleFourFragemnt_.this.E0();
        }
    }

    /* loaded from: classes4.dex */
    class e0 implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f33293b;

        e0(boolean z4) {
            this.f33293b = z4;
        }

        @Override // java.lang.Runnable
        public void run() {
            GamedetialModleFourFragemnt_.super.P0(this.f33293b);
        }
    }

    /* loaded from: classes4.dex */
    class f implements View.OnClickListener {
        f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GamedetialModleFourFragemnt_.this.l0();
        }
    }

    /* loaded from: classes4.dex */
    class f0 implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ResultMainBean f33296b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f33297c;

        f0(ResultMainBean resultMainBean, int i4) {
            this.f33296b = resultMainBean;
            this.f33297c = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            GamedetialModleFourFragemnt_.super.updateTitleButn(this.f33296b, this.f33297c);
        }
    }

    /* loaded from: classes4.dex */
    class g implements Runnable {
        g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GamedetialModleFourFragemnt_.super.G0();
        }
    }

    /* loaded from: classes4.dex */
    class g0 implements View.OnClickListener {
        g0() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GamedetialModleFourFragemnt_.this.X();
        }
    }

    /* loaded from: classes4.dex */
    class h implements Runnable {
        h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GamedetialModleFourFragemnt_.super.showLoding();
        }
    }

    /* loaded from: classes4.dex */
    class h0 extends a.c {
        h0(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                GamedetialModleFourFragemnt_.super.m0();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class i implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ GamedetialModleFourBean f33303b;

        i(GamedetialModleFourBean gamedetialModleFourBean) {
            this.f33303b = gamedetialModleFourBean;
        }

        @Override // java.lang.Runnable
        public void run() {
            GamedetialModleFourFragemnt_.super.R0(this.f33303b);
        }
    }

    /* loaded from: classes4.dex */
    class i0 extends a.c {
        i0(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                GamedetialModleFourFragemnt_.super.n0();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class j implements Runnable {
        j() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GamedetialModleFourFragemnt_.super.Z();
        }
    }

    /* loaded from: classes4.dex */
    class j0 extends a.c {
        j0(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                GamedetialModleFourFragemnt_.super.V();
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
            GamedetialModleFourFragemnt_.this.S0();
        }
    }

    /* loaded from: classes4.dex */
    class k0 extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f33309b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f33310c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ GamedetialModleFourFragemnt.v f33311d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k0(String str, long j4, String str2, String str3, String str4, GamedetialModleFourFragemnt.v vVar) {
            super(str, j4, str2);
            this.f33309b = str3;
            this.f33310c = str4;
            this.f33311d = vVar;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                GamedetialModleFourFragemnt_.super.W(this.f33309b, this.f33310c, this.f33311d);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class l implements Runnable {
        l() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GamedetialModleFourFragemnt_.super.N0();
        }
    }

    /* loaded from: classes4.dex */
    class l0 extends a.c {
        l0(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                GamedetialModleFourFragemnt_.super.h0();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class m implements Runnable {
        m() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GamedetialModleFourFragemnt_.super.K0();
        }
    }

    /* loaded from: classes4.dex */
    class m0 extends a.c {
        m0(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                GamedetialModleFourFragemnt_.super.getDownloadTaskInfo();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class n implements Runnable {
        n() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GamedetialModleFourFragemnt_.super.t0();
        }
    }

    /* loaded from: classes4.dex */
    class n0 extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f33318b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n0(String str, long j4, String str2, int i4) {
            super(str, j4, str2);
            this.f33318b = i4;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                GamedetialModleFourFragemnt_.super.changeGameFollow(this.f33318b);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class o implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f33320b;

        o(String str) {
            this.f33320b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            GamedetialModleFourFragemnt_.super.F0(this.f33320b);
        }
    }

    /* loaded from: classes4.dex */
    class o0 implements View.OnClickListener {
        o0() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GamedetialModleFourFragemnt_.this.setNetwork();
        }
    }

    /* loaded from: classes4.dex */
    class p implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ GameFromPopoWinBean f33323b;

        p(GameFromPopoWinBean gameFromPopoWinBean) {
            this.f33323b = gameFromPopoWinBean;
        }

        @Override // java.lang.Runnable
        public void run() {
            GamedetialModleFourFragemnt_.super.f0(this.f33323b);
        }
    }

    /* loaded from: classes4.dex */
    class p0 implements View.OnClickListener {
        p0() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GamedetialModleFourFragemnt_.this.iv_back();
        }
    }

    /* loaded from: classes4.dex */
    class q implements Runnable {
        q() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GamedetialModleFourFragemnt_.super.i0();
        }
    }

    /* loaded from: classes4.dex */
    class q0 implements View.OnClickListener {
        q0() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GamedetialModleFourFragemnt_.this.g0();
        }
    }

    /* loaded from: classes4.dex */
    class r implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f33328b;

        r(String str) {
            this.f33328b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            GamedetialModleFourFragemnt_.super.showToast(this.f33328b);
        }
    }

    /* loaded from: classes4.dex */
    class r0 implements View.OnClickListener {
        r0() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GamedetialModleFourFragemnt_.this.progress_layout();
        }
    }

    /* loaded from: classes4.dex */
    class s implements Runnable {
        s() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GamedetialModleFourFragemnt_.super.v0();
        }
    }

    /* loaded from: classes4.dex */
    class s0 implements View.OnClickListener {
        s0() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GamedetialModleFourFragemnt_.this.x0();
        }
    }

    /* loaded from: classes4.dex */
    class t implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ GamedetialModleFourFragemnt.v f33333b;

        t(GamedetialModleFourFragemnt.v vVar) {
            this.f33333b = vVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            GamedetialModleFourFragemnt_.super.C0(this.f33333b);
        }
    }

    /* loaded from: classes4.dex */
    class t0 implements View.OnClickListener {
        t0() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GamedetialModleFourFragemnt_.this.instalButtomButn();
        }
    }

    /* loaded from: classes4.dex */
    class u implements Runnable {
        u() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GamedetialModleFourFragemnt_.super.showLodingFailed();
        }
    }

    /* loaded from: classes4.dex */
    public static class u0 extends org.androidannotations.api.builder.d<u0, GamedetialModleFourFragemnt> {
        @Override // org.androidannotations.api.builder.d
        /* renamed from: a */
        public GamedetialModleFourFragemnt build() {
            GamedetialModleFourFragemnt_ gamedetialModleFourFragemnt_ = new GamedetialModleFourFragemnt_();
            gamedetialModleFourFragemnt_.setArguments(this.args);
            return gamedetialModleFourFragemnt_;
        }
    }

    /* loaded from: classes4.dex */
    class v implements View.OnClickListener {
        v() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GamedetialModleFourFragemnt_.this.relodingimag();
        }
    }

    /* loaded from: classes4.dex */
    class w implements Runnable {
        w() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GamedetialModleFourFragemnt_.super.showProgress();
        }
    }

    /* loaded from: classes4.dex */
    class x implements Runnable {
        x() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GamedetialModleFourFragemnt_.super.showInstallButn();
        }
    }

    /* loaded from: classes4.dex */
    class y implements Runnable {
        y() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GamedetialModleFourFragemnt_.super.updateButn();
        }
    }

    /* loaded from: classes4.dex */
    class z implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f33341b;

        z(String str) {
            this.f33341b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            GamedetialModleFourFragemnt_.super.setCommentNumber(this.f33341b);
        }
    }

    private void init_(Bundle bundle) {
        a4.c.b(this);
        this.A2.addAction("com.broadcast.bespeak.sussess");
    }

    public static u0 y1() {
        return new u0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GamedetialModleFourFragemnt
    public void C0(GamedetialModleFourFragemnt.v vVar) {
        org.androidannotations.api.b.e("", new t(vVar), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GamedetialModleFourFragemnt
    public void F0(String str) {
        org.androidannotations.api.b.e("", new o(str), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GamedetialModleFourFragemnt
    public void G0() {
        org.androidannotations.api.b.e("", new g(), 4000L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GamedetialModleFourFragemnt
    public void K0() {
        org.androidannotations.api.b.e("", new m(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GamedetialModleFourFragemnt
    public void L0(int i4) {
        org.androidannotations.api.b.e("", new b0(i4), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GamedetialModleFourFragemnt
    public void M0(int i4) {
        org.androidannotations.api.b.e("", new a0(i4), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GamedetialModleFourFragemnt
    public void N0() {
        org.androidannotations.api.b.e("", new l(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GamedetialModleFourFragemnt
    public void O0() {
        org.androidannotations.api.b.e("", new c0(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GamedetialModleFourFragemnt
    public void P0(boolean z4) {
        org.androidannotations.api.b.e("", new e0(z4), 1000L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GamedetialModleFourFragemnt
    public void R0(GamedetialModleFourBean gamedetialModleFourBean) {
        org.androidannotations.api.b.e("", new i(gamedetialModleFourBean), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GamedetialModleFourFragemnt
    public void V() {
        org.androidannotations.api.a.l(new j0("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GamedetialModleFourFragemnt
    public void W(String str, String str2, GamedetialModleFourFragemnt.v vVar) {
        org.androidannotations.api.a.l(new k0("", 0L, "", str, str2, vVar));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GamedetialModleFourFragemnt
    public void Z() {
        org.androidannotations.api.b.e("", new j(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GamedetialModleFourFragemnt
    public void changeGameFollow(int i4) {
        org.androidannotations.api.a.l(new n0("", 0L, "", i4));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GamedetialModleFourFragemnt
    public void f0(GameFromPopoWinBean gameFromPopoWinBean) {
        org.androidannotations.api.b.e("", new p(gameFromPopoWinBean), 0L);
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.f33281z2.get(cls);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GamedetialModleFourFragemnt
    public void getDownloadTaskInfo() {
        org.androidannotations.api.a.l(new m0("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GamedetialModleFourFragemnt
    public void h0() {
        org.androidannotations.api.a.l(new l0("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GamedetialModleFourFragemnt
    public void i0() {
        org.androidannotations.api.b.e("", new q(), 0L);
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        View view = this.y2;
        if (view == null) {
            return null;
        }
        return (T) view.findViewById(i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GamedetialModleFourFragemnt
    public void m0() {
        org.androidannotations.api.a.l(new h0("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GamedetialModleFourFragemnt
    public void n0() {
        org.androidannotations.api.a.l(new i0("", 0L, ""));
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.f33280x2);
        init_(bundle);
        super.onCreate(bundle);
        getActivity().registerReceiver(this.B2, this.A2);
        a4.c.c(c5);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        this.y2 = onCreateView;
        if (onCreateView == null) {
            this.y2 = layoutInflater.inflate(R.layout.gamedetial_modle_four_fragment, viewGroup, false);
        }
        return this.y2;
    }

    @Override // com.join.mgps.activity.GamedetialModleFourFragemnt, androidx.fragment.app.Fragment
    public void onDestroy() {
        getActivity().unregisterReceiver(this.B2);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.y2 = null;
        this.f33206f = null;
        this.f33208g = null;
        this.f33210h = null;
        this.f33212i = null;
        this.f33214j = null;
        this.f33216k = null;
        this.f33218l = null;
        this.f33220m = null;
        this.f33222n = null;
        this.f33224o = null;
        this.f33226p = null;
        this.f33230q = null;
        this.f33232r = null;
        this.f33234s = null;
        this.f33236t = null;
        this.f33237u = null;
        this.f33238v = null;
        this.f33240w = null;
        this.f33241x = null;
        this.f33242y = null;
        this.f33243z = null;
        this.A = null;
        this.B = null;
        this.C = null;
        this.D = null;
        this.E = null;
        this.F = null;
        this.G = null;
        this.H = null;
        this.I = null;
        this.J = null;
        this.K = null;
        this.L = null;
        this.M = null;
        this.N = null;
        this.O = null;
        this.P = null;
        this.Q = null;
        this.f33207f2 = null;
        this.f33209g2 = null;
        this.f33211h2 = null;
        this.f33213i2 = null;
        this.f33215j2 = null;
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f33206f = (RelativeLayout) aVar.internalFindViewById(R.id.videolayout);
        this.f33208g = aVar.internalFindViewById(R.id.nullView);
        this.f33210h = (StandardVideoView) aVar.internalFindViewById(R.id.videoPlayer);
        this.f33212i = (SimpleDraweeView) aVar.internalFindViewById(R.id.iv_book_bg);
        this.f33214j = (SlidingTabLayout) aVar.internalFindViewById(R.id.tabs);
        this.f33216k = (ViewPager) aVar.internalFindViewById(R.id.viewPager);
        this.f33218l = (SlidingTabLayoutGameDetailImage) aVar.internalFindViewById(R.id.tabLayout1);
        this.f33220m = aVar.internalFindViewById(R.id.bottomLine);
        this.f33222n = (ViewPager) aVar.internalFindViewById(R.id.viewPager1);
        this.f33224o = aVar.internalFindViewById(R.id.stauView);
        this.f33226p = (AppBarLayout) aVar.internalFindViewById(R.id.appBarLayout);
        this.f33230q = (CollapsingToolbarLayout) aVar.internalFindViewById(R.id.collapsingToolbarLayout);
        this.f33232r = (RelativeLayout) aVar.internalFindViewById(R.id.title_bar_layout);
        this.f33234s = (RelativeLayout) aVar.internalFindViewById(R.id.downloadRLayout2);
        this.f33236t = (RelativeLayout) aVar.internalFindViewById(R.id.titleTransfer);
        this.f33237u = (TextView) aVar.internalFindViewById(R.id.instalButtomButn);
        this.f33238v = (RelativeLayout) aVar.internalFindViewById(R.id.progressbarLayout);
        this.f33240w = (RelativeLayout) aVar.internalFindViewById(R.id.instalbutnLayout);
        this.f33241x = (ImageView) aVar.internalFindViewById(R.id.butn_showdownload);
        this.f33242y = (TextView) aVar.internalFindViewById(R.id.percent);
        this.f33243z = (ProgressBar) aVar.internalFindViewById(R.id.butnProgressBar);
        this.A = (LinearLayout) aVar.internalFindViewById(R.id.downloadLayout);
        this.B = (ImageView) aVar.internalFindViewById(R.id.search_detial_back);
        this.C = (ImageView) aVar.internalFindViewById(R.id.download_bg);
        this.D = (CustomerDownloadView) aVar.internalFindViewById(R.id.title_normal_download_cdv);
        this.E = (ImageView) aVar.internalFindViewById(R.id.followImage);
        this.F = (TextView) aVar.internalFindViewById(R.id.followButton);
        this.G = (TextView) aVar.internalFindViewById(R.id.title_textview);
        this.H = (Toolbar) aVar.internalFindViewById(R.id.toolbar);
        this.I = aVar.internalFindViewById(R.id.main_content);
        this.J = aVar.internalFindViewById(R.id.loding_layout);
        this.K = aVar.internalFindViewById(R.id.loding_faile);
        this.L = aVar.internalFindViewById(R.id.iv_backx);
        this.M = aVar.internalFindViewById(R.id.setNetwork);
        this.N = (LinearLayout) aVar.internalFindViewById(R.id.btTaglayout);
        this.O = (LinearLayout) aVar.internalFindViewById(R.id.tipsLayout);
        this.P = aVar.internalFindViewById(R.id.cover);
        this.Q = aVar.internalFindViewById(R.id.statuHVIew);
        this.f33207f2 = (TextView) aVar.internalFindViewById(R.id.biground);
        this.f33209g2 = (ImageView) aVar.internalFindViewById(R.id.downloadLine);
        this.f33211h2 = (ImageView) aVar.internalFindViewById(R.id.search_detial_image);
        this.f33213i2 = (ImageView) aVar.internalFindViewById(R.id.title_normal_search_img);
        this.f33215j2 = (ImageView) aVar.internalFindViewById(R.id.imageLoading);
        View internalFindViewById = aVar.internalFindViewById(R.id.relodingimag);
        View internalFindViewById2 = aVar.internalFindViewById(R.id.IKnow);
        View internalFindViewById3 = aVar.internalFindViewById(R.id.iv_back);
        View internalFindViewById4 = aVar.internalFindViewById(R.id.back_image);
        View internalFindViewById5 = aVar.internalFindViewById(R.id.progress_layout);
        View internalFindViewById6 = aVar.internalFindViewById(R.id.downImage);
        View internalFindViewById7 = aVar.internalFindViewById(R.id.share);
        View internalFindViewById8 = aVar.internalFindViewById(R.id.shareTwo);
        View internalFindViewById9 = aVar.internalFindViewById(R.id.followLayout);
        if (internalFindViewById != null) {
            internalFindViewById.setOnClickListener(new v());
        }
        if (internalFindViewById2 != null) {
            internalFindViewById2.setOnClickListener(new g0());
        }
        View view = this.M;
        if (view != null) {
            view.setOnClickListener(new o0());
        }
        if (internalFindViewById3 != null) {
            internalFindViewById3.setOnClickListener(new p0());
        }
        if (internalFindViewById4 != null) {
            internalFindViewById4.setOnClickListener(new q0());
        }
        if (internalFindViewById5 != null) {
            internalFindViewById5.setOnClickListener(new r0());
        }
        View view2 = this.L;
        if (view2 != null) {
            view2.setOnClickListener(new s0());
        }
        TextView textView = this.f33237u;
        if (textView != null) {
            textView.setOnClickListener(new t0());
        }
        LinearLayout linearLayout = this.A;
        if (linearLayout != null) {
            linearLayout.setOnClickListener(new a());
        }
        CustomerDownloadView customerDownloadView = this.D;
        if (customerDownloadView != null) {
            customerDownloadView.setOnClickListener(new b());
        }
        if (internalFindViewById6 != null) {
            internalFindViewById6.setOnClickListener(new c());
        }
        if (internalFindViewById7 != null) {
            internalFindViewById7.setOnClickListener(new d());
        }
        if (internalFindViewById8 != null) {
            internalFindViewById8.setOnClickListener(new e());
        }
        if (internalFindViewById9 != null) {
            internalFindViewById9.setOnClickListener(new f());
        }
        afterView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f33280x2.a(this);
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.f33281z2.put(cls, t4);
    }

    @Override // com.join.mgps.activity.GamedetialModleFourFragemnt, com.join.mgps.activity.gamedetail.BaseGameDetailFragment
    public void setCommentNumber(String str) {
        org.androidannotations.api.b.e("", new z(str), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GamedetialModleFourFragemnt
    public void showInstallButn() {
        org.androidannotations.api.b.e("", new x(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GamedetialModleFourFragemnt
    public void showLoding() {
        org.androidannotations.api.b.e("", new h(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GamedetialModleFourFragemnt
    public void showLodingFailed() {
        org.androidannotations.api.b.e("", new u(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GamedetialModleFourFragemnt
    public void showProgress() {
        org.androidannotations.api.b.e("", new w(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GamedetialModleFourFragemnt
    public void showToast(String str) {
        org.androidannotations.api.b.e("", new r(str), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GamedetialModleFourFragemnt
    public void t0() {
        org.androidannotations.api.b.e("", new n(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GamedetialModleFourFragemnt
    public void updateButn() {
        org.androidannotations.api.b.e("", new y(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GamedetialModleFourFragemnt
    public void updateDownloadView() {
        org.androidannotations.api.b.e("", new d0(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GamedetialModleFourFragemnt
    public void updateTitleButn(ResultMainBean resultMainBean, int i4) {
        org.androidannotations.api.b.e("", new f0(resultMainBean, i4), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GamedetialModleFourFragemnt
    public void v0() {
        org.androidannotations.api.b.e("", new s(), 0L);
    }
}
