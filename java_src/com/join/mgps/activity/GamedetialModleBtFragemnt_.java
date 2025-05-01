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
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager.widget.ViewPager;
import com.facebook.drawee.view.SimpleDraweeView;
import com.flipboard.bottomsheet.BottomSheetLayout;
import com.flyco.tablayout.SlidingTabLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.join.android.app.component.video.StandardVideoView;
import com.join.android.app.mgsim.wufun.R;
import com.join.kotlin.domain.widget.CornersLinearLayout;
import com.join.mgps.activity.GamedetialModleBtFragemnt;
import com.join.mgps.customview.CoordinatorLayout;
import com.join.mgps.customview.CustomerDownloadView;
import com.join.mgps.customview.SlidingTabLayoutGameDetailImage;
import com.join.mgps.dto.GameFromPopoWinBean;
import com.join.mgps.dto.GamedetialModleFourBean;
import com.join.mgps.dto.ResultMainBean;
import com.join.mgps.pref.PrefDef_;
import java.util.HashMap;
import java.util.Map;
import org.androidannotations.api.a;
/* loaded from: classes4.dex */
public final class GamedetialModleBtFragemnt_ extends GamedetialModleBtFragemnt implements y3.a, a4.a, a4.b {
    private View L2;
    private final a4.c K2 = new a4.c();
    private final Map<Class<?>, Object> M2 = new HashMap();
    private final IntentFilter N2 = new IntentFilter();
    private final BroadcastReceiver O2 = new k();
    private final BroadcastReceiver P2 = new v();

    /* loaded from: classes4.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GamedetialModleBtFragemnt_.this.progress_layout();
        }
    }

    /* loaded from: classes4.dex */
    class a0 implements Runnable {
        a0() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GamedetialModleBtFragemnt_.super.showInstallButn();
        }
    }

    /* loaded from: classes4.dex */
    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GamedetialModleBtFragemnt_.this.G0();
        }
    }

    /* loaded from: classes4.dex */
    class b0 implements Runnable {
        b0() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GamedetialModleBtFragemnt_.super.updateButn();
        }
    }

    /* loaded from: classes4.dex */
    class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GamedetialModleBtFragemnt_.this.instalButtomButn();
        }
    }

    /* loaded from: classes4.dex */
    class c0 implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f32955b;

        c0(String str) {
            this.f32955b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            GamedetialModleBtFragemnt_.super.setCommentNumber(this.f32955b);
        }
    }

    /* loaded from: classes4.dex */
    class d implements View.OnClickListener {
        d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GamedetialModleBtFragemnt_.this.r0();
        }
    }

    /* loaded from: classes4.dex */
    class d0 implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f32958b;

        d0(int i4) {
            this.f32958b = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            GamedetialModleBtFragemnt_.super.i1(this.f32958b);
        }
    }

    /* loaded from: classes4.dex */
    class e implements View.OnClickListener {
        e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GamedetialModleBtFragemnt_.this.e1();
        }
    }

    /* loaded from: classes4.dex */
    class e0 implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f32961b;

        e0(int i4) {
            this.f32961b = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            GamedetialModleBtFragemnt_.super.h1(this.f32961b);
        }
    }

    /* loaded from: classes4.dex */
    class f implements View.OnClickListener {
        f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GamedetialModleBtFragemnt_.this.q0();
        }
    }

    /* loaded from: classes4.dex */
    class f0 implements Runnable {
        f0() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GamedetialModleBtFragemnt_.super.k1();
        }
    }

    /* loaded from: classes4.dex */
    class g implements View.OnClickListener {
        g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GamedetialModleBtFragemnt_.this.W0();
        }
    }

    /* loaded from: classes4.dex */
    class g0 implements View.OnClickListener {
        g0() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GamedetialModleBtFragemnt_.this.relodingimag();
        }
    }

    /* loaded from: classes4.dex */
    class h implements View.OnClickListener {
        h() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GamedetialModleBtFragemnt_.this.X0();
        }
    }

    /* loaded from: classes4.dex */
    class h0 implements Runnable {
        h0() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GamedetialModleBtFragemnt_.super.updateDownloadView();
        }
    }

    /* loaded from: classes4.dex */
    class i implements View.OnClickListener {
        i() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GamedetialModleBtFragemnt_.this.s0();
        }
    }

    /* loaded from: classes4.dex */
    class i0 implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f32970b;

        i0(boolean z4) {
            this.f32970b = z4;
        }

        @Override // java.lang.Runnable
        public void run() {
            GamedetialModleBtFragemnt_.super.m1(this.f32970b);
        }
    }

    /* loaded from: classes4.dex */
    class j implements Runnable {
        j() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GamedetialModleBtFragemnt_.super.b1();
        }
    }

    /* loaded from: classes4.dex */
    class j0 implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ResultMainBean f32973b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f32974c;

        j0(ResultMainBean resultMainBean, int i4) {
            this.f32973b = resultMainBean;
            this.f32974c = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            GamedetialModleBtFragemnt_.super.updateTitleButn(this.f32973b, this.f32974c);
        }
    }

    /* loaded from: classes4.dex */
    class k extends BroadcastReceiver {
        k() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            GamedetialModleBtFragemnt_.this.p1();
        }
    }

    /* loaded from: classes4.dex */
    class k0 implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f32977b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f32978c;

        k0(String str, int i4) {
            this.f32977b = str;
            this.f32978c = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            GamedetialModleBtFragemnt_.super.g1(this.f32977b, this.f32978c);
        }
    }

    /* loaded from: classes4.dex */
    class l implements Runnable {
        l() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GamedetialModleBtFragemnt_.super.showLoding();
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
                GamedetialModleBtFragemnt_.super.t0();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class m implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ GamedetialModleFourBean f32982b;

        m(GamedetialModleFourBean gamedetialModleFourBean) {
            this.f32982b = gamedetialModleFourBean;
        }

        @Override // java.lang.Runnable
        public void run() {
            GamedetialModleBtFragemnt_.super.o1(this.f32982b);
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
                GamedetialModleBtFragemnt_.super.u0();
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
            GamedetialModleBtFragemnt_.super.f0();
        }
    }

    /* loaded from: classes4.dex */
    class n0 extends a.c {
        n0(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                GamedetialModleBtFragemnt_.super.c0();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class o implements Runnable {
        o() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GamedetialModleBtFragemnt_.super.j1();
        }
    }

    /* loaded from: classes4.dex */
    class o0 extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f32988b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f32989c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ GamedetialModleBtFragemnt.b0 f32990d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o0(String str, long j4, String str2, String str3, String str4, GamedetialModleBtFragemnt.b0 b0Var) {
            super(str, j4, str2);
            this.f32988b = str3;
            this.f32989c = str4;
            this.f32990d = b0Var;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                GamedetialModleBtFragemnt_.super.d0(this.f32988b, this.f32989c, this.f32990d);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class p implements Runnable {
        p() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GamedetialModleBtFragemnt_.super.f1();
        }
    }

    /* loaded from: classes4.dex */
    class p0 extends a.c {
        p0(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                GamedetialModleBtFragemnt_.super.n0();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class q implements Runnable {
        q() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GamedetialModleBtFragemnt_.super.B0();
        }
    }

    /* loaded from: classes4.dex */
    class q0 extends a.c {
        q0(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                GamedetialModleBtFragemnt_.super.getDownloadTaskInfo();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class r implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f32996b;

        r(String str) {
            this.f32996b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            GamedetialModleBtFragemnt_.super.Z0(this.f32996b);
        }
    }

    /* loaded from: classes4.dex */
    class r0 implements View.OnClickListener {
        r0() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GamedetialModleBtFragemnt_.this.e0();
        }
    }

    /* loaded from: classes4.dex */
    class s implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ GameFromPopoWinBean f32999b;

        s(GameFromPopoWinBean gameFromPopoWinBean) {
            this.f32999b = gameFromPopoWinBean;
        }

        @Override // java.lang.Runnable
        public void run() {
            GamedetialModleBtFragemnt_.super.l0(this.f32999b);
        }
    }

    /* loaded from: classes4.dex */
    class s0 extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f33001b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        s0(String str, long j4, String str2, int i4) {
            super(str, j4, str2);
            this.f33001b = i4;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                GamedetialModleBtFragemnt_.super.changeGameFollow(this.f33001b);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class t implements Runnable {
        t() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GamedetialModleBtFragemnt_.super.o0();
        }
    }

    /* loaded from: classes4.dex */
    class t0 extends a.c {
        t0(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                GamedetialModleBtFragemnt_.super.N0();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class u implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f33005b;

        u(String str) {
            this.f33005b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            GamedetialModleBtFragemnt_.super.showToast(this.f33005b);
        }
    }

    /* loaded from: classes4.dex */
    class u0 implements View.OnClickListener {
        u0() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GamedetialModleBtFragemnt_.this.setNetwork();
        }
    }

    /* loaded from: classes4.dex */
    class v extends BroadcastReceiver {
        v() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            GamedetialModleBtFragemnt_.this.Q0(intent);
        }
    }

    /* loaded from: classes4.dex */
    class v0 implements View.OnClickListener {
        v0() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GamedetialModleBtFragemnt_.this.p0();
        }
    }

    /* loaded from: classes4.dex */
    class w implements Runnable {
        w() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GamedetialModleBtFragemnt_.super.D0();
        }
    }

    /* loaded from: classes4.dex */
    class w0 implements View.OnClickListener {
        w0() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GamedetialModleBtFragemnt_.this.F0();
        }
    }

    /* loaded from: classes4.dex */
    class x implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ GamedetialModleBtFragemnt.b0 f33012b;

        x(GamedetialModleBtFragemnt.b0 b0Var) {
            this.f33012b = b0Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            GamedetialModleBtFragemnt_.super.V0(this.f33012b);
        }
    }

    /* loaded from: classes4.dex */
    class x0 implements View.OnClickListener {
        x0() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GamedetialModleBtFragemnt_.this.iv_back();
        }
    }

    /* loaded from: classes4.dex */
    class y implements Runnable {
        y() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GamedetialModleBtFragemnt_.super.showLodingFailed();
        }
    }

    /* loaded from: classes4.dex */
    class y0 implements View.OnClickListener {
        y0() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GamedetialModleBtFragemnt_.this.m0();
        }
    }

    /* loaded from: classes4.dex */
    class z implements Runnable {
        z() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GamedetialModleBtFragemnt_.super.showProgress();
        }
    }

    /* loaded from: classes4.dex */
    public static class z0 extends org.androidannotations.api.builder.d<z0, GamedetialModleBtFragemnt> {
        @Override // org.androidannotations.api.builder.d
        /* renamed from: a */
        public GamedetialModleBtFragemnt build() {
            GamedetialModleBtFragemnt_ gamedetialModleBtFragemnt_ = new GamedetialModleBtFragemnt_();
            gamedetialModleBtFragemnt_.setArguments(this.args);
            return gamedetialModleBtFragemnt_;
        }
    }

    public static z0 X1() {
        return new z0();
    }

    private void init_(Bundle bundle) {
        this.Z = new PrefDef_(getActivity());
        a4.c.b(this);
        this.N2.addAction("com.broadcast.bespeak.sussess");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GamedetialModleBtFragemnt
    public void B0() {
        org.androidannotations.api.b.e("", new q(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GamedetialModleBtFragemnt
    public void D0() {
        org.androidannotations.api.b.e("", new w(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GamedetialModleBtFragemnt
    public void N0() {
        org.androidannotations.api.a.l(new t0("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GamedetialModleBtFragemnt
    public void V0(GamedetialModleBtFragemnt.b0 b0Var) {
        org.androidannotations.api.b.e("", new x(b0Var), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GamedetialModleBtFragemnt
    public void Z0(String str) {
        org.androidannotations.api.b.e("", new r(str), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GamedetialModleBtFragemnt
    public void b1() {
        org.androidannotations.api.b.e("", new j(), 4000L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GamedetialModleBtFragemnt
    public void c0() {
        org.androidannotations.api.a.l(new n0("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GamedetialModleBtFragemnt
    public void changeGameFollow(int i4) {
        org.androidannotations.api.a.l(new s0("", 0L, "", i4));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GamedetialModleBtFragemnt
    public void d0(String str, String str2, GamedetialModleBtFragemnt.b0 b0Var) {
        org.androidannotations.api.a.l(new o0("", 0L, "", str, str2, b0Var));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GamedetialModleBtFragemnt
    public void f0() {
        org.androidannotations.api.b.e("", new n(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GamedetialModleBtFragemnt
    public void f1() {
        org.androidannotations.api.b.e("", new p(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GamedetialModleBtFragemnt
    public void g1(String str, int i4) {
        org.androidannotations.api.b.e("", new k0(str, i4), 0L);
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.M2.get(cls);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GamedetialModleBtFragemnt
    public void getDownloadTaskInfo() {
        org.androidannotations.api.a.l(new q0("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GamedetialModleBtFragemnt
    public void h1(int i4) {
        org.androidannotations.api.b.e("", new e0(i4), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GamedetialModleBtFragemnt
    public void i1(int i4) {
        org.androidannotations.api.b.e("", new d0(i4), 0L);
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        View view = this.L2;
        if (view == null) {
            return null;
        }
        return (T) view.findViewById(i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GamedetialModleBtFragemnt
    public void j1() {
        org.androidannotations.api.b.e("", new o(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GamedetialModleBtFragemnt
    public void k1() {
        org.androidannotations.api.b.e("", new f0(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GamedetialModleBtFragemnt
    public void l0(GameFromPopoWinBean gameFromPopoWinBean) {
        org.androidannotations.api.b.e("", new s(gameFromPopoWinBean), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GamedetialModleBtFragemnt
    public void m1(boolean z4) {
        org.androidannotations.api.b.e("", new i0(z4), 1000L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GamedetialModleBtFragemnt
    public void n0() {
        org.androidannotations.api.a.l(new p0("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GamedetialModleBtFragemnt
    public void o0() {
        org.androidannotations.api.b.e("", new t(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GamedetialModleBtFragemnt
    public void o1(GamedetialModleFourBean gamedetialModleFourBean) {
        org.androidannotations.api.b.e("", new m(gamedetialModleFourBean), 0L);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.K2);
        init_(bundle);
        super.onCreate(bundle);
        getActivity().registerReceiver(this.O2, this.N2);
        getActivity().registerReceiver(this.P2, this.N2);
        a4.c.c(c5);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        this.L2 = onCreateView;
        if (onCreateView == null) {
            this.L2 = layoutInflater.inflate(R.layout.gamedetial_modle_bt_fragment, viewGroup, false);
        }
        return this.L2;
    }

    @Override // com.join.mgps.activity.GamedetialModleBtFragemnt, androidx.fragment.app.Fragment
    public void onDestroy() {
        getActivity().unregisterReceiver(this.O2);
        getActivity().unregisterReceiver(this.P2);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.L2 = null;
        this.f32857f = null;
        this.f32859g = null;
        this.f32861h = null;
        this.f32863i = null;
        this.f32865j = null;
        this.f32867k = null;
        this.f32869l = null;
        this.f32871m = null;
        this.f32873n = null;
        this.f32875o = null;
        this.f32877p = null;
        this.f32881q = null;
        this.f32883r = null;
        this.f32885s = null;
        this.f32887t = null;
        this.f32889u = null;
        this.f32891v = null;
        this.f32893w = null;
        this.f32895x = null;
        this.f32897y = null;
        this.f32898z = null;
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
        this.R = null;
        this.S = null;
        this.T = null;
        this.U = null;
        this.V = null;
        this.W = null;
        this.X = null;
        this.Y = null;
        this.f32886s2 = null;
        this.f32888t2 = null;
        this.f32890u2 = null;
        this.v2 = null;
        this.f32894w2 = null;
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f32857f = (RelativeLayout) aVar.internalFindViewById(R.id.videolayout);
        this.f32859g = aVar.internalFindViewById(R.id.nullView);
        this.f32861h = (StandardVideoView) aVar.internalFindViewById(R.id.videoPlayer);
        this.f32863i = (SimpleDraweeView) aVar.internalFindViewById(R.id.iv_book_bg);
        this.f32865j = (SlidingTabLayout) aVar.internalFindViewById(R.id.tabs);
        this.f32867k = (ViewPager) aVar.internalFindViewById(R.id.viewPager);
        this.f32869l = (SlidingTabLayoutGameDetailImage) aVar.internalFindViewById(R.id.tabLayout1);
        this.f32871m = aVar.internalFindViewById(R.id.bottomLine);
        this.f32873n = (ViewPager) aVar.internalFindViewById(R.id.viewPager1);
        this.f32875o = aVar.internalFindViewById(R.id.stauView);
        this.f32877p = (AppBarLayout) aVar.internalFindViewById(R.id.appBarLayout);
        this.f32881q = (RelativeLayout) aVar.internalFindViewById(R.id.title_bar_layout);
        this.f32883r = (RelativeLayout) aVar.internalFindViewById(R.id.downloadRLayout2);
        this.f32885s = (RelativeLayout) aVar.internalFindViewById(R.id.titleTransfer);
        this.f32887t = (TextView) aVar.internalFindViewById(R.id.instalButtomButn);
        this.f32889u = (RelativeLayout) aVar.internalFindViewById(R.id.progressbarLayout);
        this.f32891v = (ConstraintLayout) aVar.internalFindViewById(R.id.instalbutnLayout);
        this.f32893w = (ImageView) aVar.internalFindViewById(R.id.butn_showdownload);
        this.f32895x = (TextView) aVar.internalFindViewById(R.id.percent);
        this.f32897y = (ProgressBar) aVar.internalFindViewById(R.id.butnProgressBar);
        this.f32898z = (LinearLayout) aVar.internalFindViewById(R.id.downloadLayout);
        this.A = (ImageView) aVar.internalFindViewById(R.id.search_detial_back);
        this.B = (ImageView) aVar.internalFindViewById(R.id.download_bg);
        this.C = (CustomerDownloadView) aVar.internalFindViewById(R.id.title_normal_download_cdv);
        this.D = (ImageView) aVar.internalFindViewById(R.id.followImage);
        this.E = (TextView) aVar.internalFindViewById(R.id.followButton);
        this.F = (TextView) aVar.internalFindViewById(R.id.title_textview);
        this.G = (CoordinatorLayout) aVar.internalFindViewById(R.id.main_content);
        this.H = aVar.internalFindViewById(R.id.loding_layout);
        this.I = aVar.internalFindViewById(R.id.loding_faile);
        this.J = aVar.internalFindViewById(R.id.iv_backx);
        this.K = aVar.internalFindViewById(R.id.setNetwork);
        this.L = (LinearLayout) aVar.internalFindViewById(R.id.btTaglayout);
        this.M = (LinearLayout) aVar.internalFindViewById(R.id.tipsLayout);
        this.N = aVar.internalFindViewById(R.id.cover);
        this.O = aVar.internalFindViewById(R.id.statuHVIew);
        this.P = (BottomSheetLayout) aVar.internalFindViewById(R.id.sheetLayout);
        this.Q = aVar.internalFindViewById(R.id.v_mask);
        this.R = (LinearLayout) aVar.internalFindViewById(R.id.ll_notice);
        this.S = (TextView) aVar.internalFindViewById(R.id.tv_notice);
        this.T = (CornersLinearLayout) aVar.internalFindViewById(R.id.cll_view);
        this.U = (RelativeLayout) aVar.internalFindViewById(R.id.rl_top_view);
        this.V = (RelativeLayout) aVar.internalFindViewById(R.id.ll_top_view);
        this.W = (RelativeLayout) aVar.internalFindViewById(R.id.rl_title);
        this.X = (ImageView) aVar.internalFindViewById(R.id.ivGameResource);
        this.Y = (RelativeLayout) aVar.internalFindViewById(R.id.rlNormalDownload);
        this.f32886s2 = (TextView) aVar.internalFindViewById(R.id.biground);
        this.f32888t2 = (ImageView) aVar.internalFindViewById(R.id.downloadLine);
        this.f32890u2 = (ImageView) aVar.internalFindViewById(R.id.search_detial_image);
        this.v2 = (ImageView) aVar.internalFindViewById(R.id.title_normal_search_img);
        this.f32894w2 = (ImageView) aVar.internalFindViewById(R.id.imageLoading);
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
            internalFindViewById.setOnClickListener(new g0());
        }
        if (internalFindViewById2 != null) {
            internalFindViewById2.setOnClickListener(new r0());
        }
        View view = this.K;
        if (view != null) {
            view.setOnClickListener(new u0());
        }
        LinearLayout linearLayout = this.R;
        if (linearLayout != null) {
            linearLayout.setOnClickListener(new v0());
        }
        ImageView imageView = this.X;
        if (imageView != null) {
            imageView.setOnClickListener(new w0());
        }
        if (internalFindViewById3 != null) {
            internalFindViewById3.setOnClickListener(new x0());
        }
        if (internalFindViewById4 != null) {
            internalFindViewById4.setOnClickListener(new y0());
        }
        if (internalFindViewById5 != null) {
            internalFindViewById5.setOnClickListener(new a());
        }
        View view2 = this.J;
        if (view2 != null) {
            view2.setOnClickListener(new b());
        }
        TextView textView = this.f32887t;
        if (textView != null) {
            textView.setOnClickListener(new c());
        }
        LinearLayout linearLayout2 = this.f32898z;
        if (linearLayout2 != null) {
            linearLayout2.setOnClickListener(new d());
        }
        CustomerDownloadView customerDownloadView = this.C;
        if (customerDownloadView != null) {
            customerDownloadView.setOnClickListener(new e());
        }
        if (internalFindViewById6 != null) {
            internalFindViewById6.setOnClickListener(new f());
        }
        if (internalFindViewById7 != null) {
            internalFindViewById7.setOnClickListener(new g());
        }
        if (internalFindViewById8 != null) {
            internalFindViewById8.setOnClickListener(new h());
        }
        if (internalFindViewById9 != null) {
            internalFindViewById9.setOnClickListener(new i());
        }
        afterView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.K2.a(this);
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.M2.put(cls, t4);
    }

    @Override // com.join.mgps.activity.GamedetialModleBtFragemnt, com.join.mgps.activity.gamedetail.BaseGameDetailFragment
    public void setCommentNumber(String str) {
        org.androidannotations.api.b.e("", new c0(str), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GamedetialModleBtFragemnt
    public void showInstallButn() {
        org.androidannotations.api.b.e("", new a0(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GamedetialModleBtFragemnt
    public void showLoding() {
        org.androidannotations.api.b.e("", new l(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GamedetialModleBtFragemnt
    public void showLodingFailed() {
        org.androidannotations.api.b.e("", new y(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GamedetialModleBtFragemnt
    public void showProgress() {
        org.androidannotations.api.b.e("", new z(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GamedetialModleBtFragemnt
    public void showToast(String str) {
        org.androidannotations.api.b.e("", new u(str), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GamedetialModleBtFragemnt
    public void t0() {
        org.androidannotations.api.a.l(new l0("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GamedetialModleBtFragemnt
    public void u0() {
        org.androidannotations.api.a.l(new m0("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GamedetialModleBtFragemnt
    public void updateButn() {
        org.androidannotations.api.b.e("", new b0(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GamedetialModleBtFragemnt
    public void updateDownloadView() {
        org.androidannotations.api.b.e("", new h0(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GamedetialModleBtFragemnt
    public void updateTitleButn(ResultMainBean resultMainBean, int i4) {
        org.androidannotations.api.b.e("", new j0(resultMainBean, i4), 0L);
    }
}
