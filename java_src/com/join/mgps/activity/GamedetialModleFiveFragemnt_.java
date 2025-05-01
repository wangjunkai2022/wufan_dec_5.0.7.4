package com.join.mgps.activity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager.widget.ViewPager;
import com.facebook.drawee.view.SimpleDraweeView;
import com.flipboard.bottomsheet.BottomSheetLayout;
import com.flyco.tablayout.SlidingTabLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.join.android.app.component.video.StandardVideoView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.activity.GamedetialModleFiveFragemnt;
import com.join.mgps.customview.CoordinatorLayout;
import com.join.mgps.customview.CustomerDownloadView;
import com.join.mgps.dto.GameFromPopoWinBean;
import com.join.mgps.dto.GamedetialModleFourBean;
import com.join.mgps.dto.ResultMainBean;
import com.join.mgps.pref.PrefDef_;
import it.sephiroth.android.library.widget.HListView;
import java.util.HashMap;
import java.util.Map;
import org.androidannotations.api.a;
/* loaded from: classes4.dex */
public final class GamedetialModleFiveFragemnt_ extends GamedetialModleFiveFragemnt implements y3.a, a4.a, a4.b {
    private View C2;
    private final a4.c B2 = new a4.c();
    private final Map<Class<?>, Object> D2 = new HashMap();
    private final IntentFilter E2 = new IntentFilter();
    private final BroadcastReceiver F2 = new k();
    private final BroadcastReceiver G2 = new v();

    /* loaded from: classes4.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GamedetialModleFiveFragemnt_.this.P0();
        }
    }

    /* loaded from: classes4.dex */
    class a0 implements Runnable {
        a0() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GamedetialModleFiveFragemnt_.super.showInstallButn();
        }
    }

    /* loaded from: classes4.dex */
    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GamedetialModleFiveFragemnt_.this.instalButtomButn();
        }
    }

    /* loaded from: classes4.dex */
    class b0 implements Runnable {
        b0() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GamedetialModleFiveFragemnt_.super.updateButn();
        }
    }

    /* loaded from: classes4.dex */
    class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GamedetialModleFiveFragemnt_.this.v0();
        }
    }

    /* loaded from: classes4.dex */
    class c0 implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f33130b;

        c0(String str) {
            this.f33130b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            GamedetialModleFiveFragemnt_.super.setCommentNumber(this.f33130b);
        }
    }

    /* loaded from: classes4.dex */
    class d implements View.OnClickListener {
        d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GamedetialModleFiveFragemnt_.this.q1();
        }
    }

    /* loaded from: classes4.dex */
    class d0 implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f33133b;

        d0(int i4) {
            this.f33133b = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            GamedetialModleFiveFragemnt_.super.u1(this.f33133b);
        }
    }

    /* loaded from: classes4.dex */
    class e implements View.OnClickListener {
        e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GamedetialModleFiveFragemnt_.this.s0();
        }
    }

    /* loaded from: classes4.dex */
    class e0 implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f33136b;

        e0(int i4) {
            this.f33136b = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            GamedetialModleFiveFragemnt_.super.t1(this.f33136b);
        }
    }

    /* loaded from: classes4.dex */
    class f implements View.OnClickListener {
        f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GamedetialModleFiveFragemnt_.this.i1();
        }
    }

    /* loaded from: classes4.dex */
    class f0 implements Runnable {
        f0() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GamedetialModleFiveFragemnt_.super.w1();
        }
    }

    /* loaded from: classes4.dex */
    class g implements View.OnClickListener {
        g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GamedetialModleFiveFragemnt_.this.j1();
        }
    }

    /* loaded from: classes4.dex */
    class g0 implements View.OnClickListener {
        g0() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GamedetialModleFiveFragemnt_.this.relodingimag();
        }
    }

    /* loaded from: classes4.dex */
    class h implements View.OnClickListener {
        h() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GamedetialModleFiveFragemnt_.this.w0();
        }
    }

    /* loaded from: classes4.dex */
    class h0 implements Runnable {
        h0() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GamedetialModleFiveFragemnt_.super.updateDownloadView();
        }
    }

    /* loaded from: classes4.dex */
    class i implements Runnable {
        i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GamedetialModleFiveFragemnt_.super.showLoding();
        }
    }

    /* loaded from: classes4.dex */
    class i0 implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f33145b;

        i0(boolean z4) {
            this.f33145b = z4;
        }

        @Override // java.lang.Runnable
        public void run() {
            GamedetialModleFiveFragemnt_.super.y1(this.f33145b);
        }
    }

    /* loaded from: classes4.dex */
    class j implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ GamedetialModleFourBean f33147b;

        j(GamedetialModleFourBean gamedetialModleFourBean) {
            this.f33147b = gamedetialModleFourBean;
        }

        @Override // java.lang.Runnable
        public void run() {
            GamedetialModleFiveFragemnt_.super.z1(this.f33147b);
        }
    }

    /* loaded from: classes4.dex */
    class j0 implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ResultMainBean f33149b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f33150c;

        j0(ResultMainBean resultMainBean, int i4) {
            this.f33149b = resultMainBean;
            this.f33150c = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            GamedetialModleFiveFragemnt_.super.updateTitleButn(this.f33149b, this.f33150c);
        }
    }

    /* loaded from: classes4.dex */
    class k extends BroadcastReceiver {
        k() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            GamedetialModleFiveFragemnt_.this.A1();
        }
    }

    /* loaded from: classes4.dex */
    class k0 implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f33153b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f33154c;

        k0(String str, int i4) {
            this.f33153b = str;
            this.f33154c = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            GamedetialModleFiveFragemnt_.super.s1(this.f33153b, this.f33154c);
        }
    }

    /* loaded from: classes4.dex */
    class l implements Runnable {
        l() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GamedetialModleFiveFragemnt_.super.g0();
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
                GamedetialModleFiveFragemnt_.super.x0();
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
            GamedetialModleFiveFragemnt_.super.v1();
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
                GamedetialModleFiveFragemnt_.super.y0();
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
            GamedetialModleFiveFragemnt_.super.r1();
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
                GamedetialModleFiveFragemnt_.super.d0();
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
            GamedetialModleFiveFragemnt_.super.J0();
        }
    }

    /* loaded from: classes4.dex */
    class o0 extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f33163b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f33164c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ GamedetialModleFiveFragemnt.c0 f33165d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o0(String str, long j4, String str2, String str3, String str4, GamedetialModleFiveFragemnt.c0 c0Var) {
            super(str, j4, str2);
            this.f33163b = str3;
            this.f33164c = str4;
            this.f33165d = c0Var;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                GamedetialModleFiveFragemnt_.super.e0(this.f33163b, this.f33164c, this.f33165d);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class p implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f33167b;

        p(String str) {
            this.f33167b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            GamedetialModleFiveFragemnt_.super.l1(this.f33167b);
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
                GamedetialModleFiveFragemnt_.super.p0();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class q implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ GameFromPopoWinBean f33170b;

        q(GameFromPopoWinBean gameFromPopoWinBean) {
            this.f33170b = gameFromPopoWinBean;
        }

        @Override // java.lang.Runnable
        public void run() {
            GamedetialModleFiveFragemnt_.super.n0(this.f33170b);
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
                GamedetialModleFiveFragemnt_.super.getDownloadTaskInfo();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class r implements Runnable {
        r() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GamedetialModleFiveFragemnt_.super.q0();
        }
    }

    /* loaded from: classes4.dex */
    class r0 implements View.OnClickListener {
        r0() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GamedetialModleFiveFragemnt_.this.f0();
        }
    }

    /* loaded from: classes4.dex */
    class s implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f33175b;

        s(String str) {
            this.f33175b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            GamedetialModleFiveFragemnt_.super.showToast(this.f33175b);
        }
    }

    /* loaded from: classes4.dex */
    class s0 extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f33177b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        s0(String str, long j4, String str2, int i4) {
            super(str, j4, str2);
            this.f33177b = i4;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                GamedetialModleFiveFragemnt_.super.changeGameFollow(this.f33177b);
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
            GamedetialModleFiveFragemnt_.super.L0();
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
                GamedetialModleFiveFragemnt_.super.X0();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class u implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ GamedetialModleFiveFragemnt.c0 f33181b;

        u(GamedetialModleFiveFragemnt.c0 c0Var) {
            this.f33181b = c0Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            GamedetialModleFiveFragemnt_.super.h1(this.f33181b);
        }
    }

    /* loaded from: classes4.dex */
    class u0 implements View.OnClickListener {
        u0() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GamedetialModleFiveFragemnt_.this.setNetwork();
        }
    }

    /* loaded from: classes4.dex */
    class v extends BroadcastReceiver {
        v() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            GamedetialModleFiveFragemnt_.this.a1(intent);
        }
    }

    /* loaded from: classes4.dex */
    class v0 implements View.OnClickListener {
        v0() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GamedetialModleFiveFragemnt_.this.O0();
        }
    }

    /* loaded from: classes4.dex */
    class w implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f33186b;

        w(String str) {
            this.f33186b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            GamedetialModleFiveFragemnt_.super.r0(this.f33186b);
        }
    }

    /* loaded from: classes4.dex */
    class w0 implements View.OnClickListener {
        w0() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GamedetialModleFiveFragemnt_.this.iv_back();
        }
    }

    /* loaded from: classes4.dex */
    class x implements Runnable {
        x() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GamedetialModleFiveFragemnt_.super.n1();
        }
    }

    /* loaded from: classes4.dex */
    class x0 implements View.OnClickListener {
        x0() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GamedetialModleFiveFragemnt_.this.o0();
        }
    }

    /* loaded from: classes4.dex */
    class y implements Runnable {
        y() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GamedetialModleFiveFragemnt_.super.showLodingFailed();
        }
    }

    /* loaded from: classes4.dex */
    class y0 implements View.OnClickListener {
        y0() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GamedetialModleFiveFragemnt_.this.progress_layout();
        }
    }

    /* loaded from: classes4.dex */
    class z implements Runnable {
        z() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GamedetialModleFiveFragemnt_.super.showProgress();
        }
    }

    /* loaded from: classes4.dex */
    public static class z0 extends org.androidannotations.api.builder.d<z0, GamedetialModleFiveFragemnt> {
        @Override // org.androidannotations.api.builder.d
        /* renamed from: a */
        public GamedetialModleFiveFragemnt build() {
            GamedetialModleFiveFragemnt_ gamedetialModleFiveFragemnt_ = new GamedetialModleFiveFragemnt_();
            gamedetialModleFiveFragemnt_.setArguments(this.args);
            return gamedetialModleFiveFragemnt_;
        }
    }

    private void init_(Bundle bundle) {
        this.Y = new PrefDef_(getActivity());
        a4.c.b(this);
        this.E2.addAction("com.broadcast.bespeak.sussess");
    }

    public static z0 j2() {
        return new z0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GamedetialModleFiveFragemnt
    public void J0() {
        org.androidannotations.api.b.e("", new o(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GamedetialModleFiveFragemnt
    public void L0() {
        org.androidannotations.api.b.e("", new t(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GamedetialModleFiveFragemnt
    public void X0() {
        org.androidannotations.api.a.l(new t0("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GamedetialModleFiveFragemnt
    public void changeGameFollow(int i4) {
        org.androidannotations.api.a.l(new s0("", 0L, "", i4));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GamedetialModleFiveFragemnt
    public void d0() {
        org.androidannotations.api.a.l(new n0("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GamedetialModleFiveFragemnt
    public void e0(String str, String str2, GamedetialModleFiveFragemnt.c0 c0Var) {
        org.androidannotations.api.a.l(new o0("", 0L, "", str, str2, c0Var));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GamedetialModleFiveFragemnt
    public void g0() {
        org.androidannotations.api.b.e("", new l(), 0L);
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.D2.get(cls);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GamedetialModleFiveFragemnt
    public void getDownloadTaskInfo() {
        org.androidannotations.api.a.l(new q0("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GamedetialModleFiveFragemnt
    public void h1(GamedetialModleFiveFragemnt.c0 c0Var) {
        org.androidannotations.api.b.e("", new u(c0Var), 0L);
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        View view = this.C2;
        if (view == null) {
            return null;
        }
        return (T) view.findViewById(i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GamedetialModleFiveFragemnt
    public void l1(String str) {
        org.androidannotations.api.b.e("", new p(str), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GamedetialModleFiveFragemnt
    public void n0(GameFromPopoWinBean gameFromPopoWinBean) {
        org.androidannotations.api.b.e("", new q(gameFromPopoWinBean), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GamedetialModleFiveFragemnt
    public void n1() {
        org.androidannotations.api.b.e("", new x(), 4000L);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.B2);
        init_(bundle);
        super.onCreate(bundle);
        getActivity().registerReceiver(this.F2, this.E2);
        getActivity().registerReceiver(this.G2, this.E2);
        a4.c.c(c5);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        this.C2 = onCreateView;
        if (onCreateView == null) {
            this.C2 = layoutInflater.inflate(R.layout.gamedetial_modle_five_fragment, viewGroup, false);
        }
        return this.C2;
    }

    @Override // com.join.mgps.activity.GamedetialModleFiveFragemnt, androidx.fragment.app.Fragment
    public void onDestroy() {
        getActivity().unregisterReceiver(this.F2);
        getActivity().unregisterReceiver(this.G2);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.C2 = null;
        this.f33029f = null;
        this.f33031g = null;
        this.f33033h = null;
        this.f33035i = null;
        this.f33037j = null;
        this.f33039k = null;
        this.f33041l = null;
        this.f33043m = null;
        this.f33045n = null;
        this.f33047o = null;
        this.f33049p = null;
        this.f33053q = null;
        this.f33055r = null;
        this.f33057s = null;
        this.f33059t = null;
        this.f33061u = null;
        this.f33063v = null;
        this.f33065w = null;
        this.f33067x = null;
        this.f33068y = null;
        this.f33069z = null;
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
        this.f33034h2 = null;
        this.f33036i2 = null;
        this.f33038j2 = null;
        this.f33040k2 = null;
        this.f33042l2 = null;
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f33029f = (RelativeLayout) aVar.internalFindViewById(R.id.videolayout);
        this.f33031g = aVar.internalFindViewById(R.id.nullView);
        this.f33033h = (StandardVideoView) aVar.internalFindViewById(R.id.videoPlayer);
        this.f33035i = (SimpleDraweeView) aVar.internalFindViewById(R.id.iv_book_bg);
        this.f33037j = (SlidingTabLayout) aVar.internalFindViewById(R.id.tabs);
        this.f33039k = (ViewPager) aVar.internalFindViewById(R.id.viewPager);
        this.f33041l = (ViewPager) aVar.internalFindViewById(R.id.viewPager1);
        this.f33043m = (LinearLayout) aVar.internalFindViewById(R.id.ll_tabs);
        this.f33045n = aVar.internalFindViewById(R.id.stauView);
        this.f33047o = (AppBarLayout) aVar.internalFindViewById(R.id.appBarLayout);
        this.f33049p = (CollapsingToolbarLayout) aVar.internalFindViewById(R.id.collapsingToolbarLayout);
        this.f33053q = (RelativeLayout) aVar.internalFindViewById(R.id.title_bar_layout);
        this.f33055r = (RelativeLayout) aVar.internalFindViewById(R.id.downloadRLayout2);
        this.f33057s = (RelativeLayout) aVar.internalFindViewById(R.id.titleTransfer);
        this.f33059t = (TextView) aVar.internalFindViewById(R.id.instalButtomButn);
        this.f33061u = (RelativeLayout) aVar.internalFindViewById(R.id.progressbarLayout);
        this.f33063v = (ConstraintLayout) aVar.internalFindViewById(R.id.instalbutnLayout);
        this.f33065w = (ImageView) aVar.internalFindViewById(R.id.butn_showdownload);
        this.f33067x = (TextView) aVar.internalFindViewById(R.id.percent);
        this.f33068y = (ProgressBar) aVar.internalFindViewById(R.id.butnProgressBar);
        this.f33069z = (LinearLayout) aVar.internalFindViewById(R.id.downloadLayout);
        this.A = (ImageView) aVar.internalFindViewById(R.id.search_detial_back);
        this.B = (ImageView) aVar.internalFindViewById(R.id.download_bg);
        this.C = (CustomerDownloadView) aVar.internalFindViewById(R.id.title_normal_download_cdv);
        this.D = (ImageView) aVar.internalFindViewById(R.id.followImage);
        this.E = (TextView) aVar.internalFindViewById(R.id.followButton);
        this.F = (TextView) aVar.internalFindViewById(R.id.title_textview);
        this.G = (Toolbar) aVar.internalFindViewById(R.id.toolbar);
        this.H = (CoordinatorLayout) aVar.internalFindViewById(R.id.main_content);
        this.I = aVar.internalFindViewById(R.id.loding_layout);
        this.J = aVar.internalFindViewById(R.id.loding_faile);
        this.K = aVar.internalFindViewById(R.id.iv_backx);
        this.L = aVar.internalFindViewById(R.id.setNetwork);
        this.M = aVar.internalFindViewById(R.id.cover);
        this.N = aVar.internalFindViewById(R.id.statuHVIew);
        this.O = (BottomSheetLayout) aVar.internalFindViewById(R.id.sheetLayout);
        this.P = (LinearLayout) aVar.internalFindViewById(R.id.layoutGift);
        this.Q = (SimpleDraweeView) aVar.internalFindViewById(R.id.giftImage);
        this.R = (TextView) aVar.internalFindViewById(R.id.giftContent);
        this.S = (LinearLayout) aVar.internalFindViewById(R.id.ll_top_images);
        this.T = (HListView) aVar.internalFindViewById(R.id.hlv_top_list);
        this.U = (ImageView) aVar.internalFindViewById(R.id.ivGameResource);
        this.V = (RelativeLayout) aVar.internalFindViewById(R.id.rlNormalDownload);
        this.W = (FrameLayout) aVar.internalFindViewById(R.id.fl_game_info);
        this.f33034h2 = (TextView) aVar.internalFindViewById(R.id.biground);
        this.f33036i2 = (ImageView) aVar.internalFindViewById(R.id.downloadLine);
        this.f33038j2 = (ImageView) aVar.internalFindViewById(R.id.search_detial_image);
        this.f33040k2 = (ImageView) aVar.internalFindViewById(R.id.title_normal_search_img);
        this.f33042l2 = (ImageView) aVar.internalFindViewById(R.id.imageLoading);
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
        View view = this.L;
        if (view != null) {
            view.setOnClickListener(new u0());
        }
        ImageView imageView = this.U;
        if (imageView != null) {
            imageView.setOnClickListener(new v0());
        }
        if (internalFindViewById3 != null) {
            internalFindViewById3.setOnClickListener(new w0());
        }
        if (internalFindViewById4 != null) {
            internalFindViewById4.setOnClickListener(new x0());
        }
        if (internalFindViewById5 != null) {
            internalFindViewById5.setOnClickListener(new y0());
        }
        View view2 = this.K;
        if (view2 != null) {
            view2.setOnClickListener(new a());
        }
        TextView textView = this.f33059t;
        if (textView != null) {
            textView.setOnClickListener(new b());
        }
        LinearLayout linearLayout = this.f33069z;
        if (linearLayout != null) {
            linearLayout.setOnClickListener(new c());
        }
        CustomerDownloadView customerDownloadView = this.C;
        if (customerDownloadView != null) {
            customerDownloadView.setOnClickListener(new d());
        }
        if (internalFindViewById6 != null) {
            internalFindViewById6.setOnClickListener(new e());
        }
        if (internalFindViewById7 != null) {
            internalFindViewById7.setOnClickListener(new f());
        }
        if (internalFindViewById8 != null) {
            internalFindViewById8.setOnClickListener(new g());
        }
        if (internalFindViewById9 != null) {
            internalFindViewById9.setOnClickListener(new h());
        }
        afterView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.B2.a(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GamedetialModleFiveFragemnt
    public void p0() {
        org.androidannotations.api.a.l(new p0("", 0L, ""));
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.D2.put(cls, t4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GamedetialModleFiveFragemnt
    public void q0() {
        org.androidannotations.api.b.e("", new r(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GamedetialModleFiveFragemnt
    public void r0(String str) {
        org.androidannotations.api.b.e("", new w(str), 600L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GamedetialModleFiveFragemnt
    public void r1() {
        org.androidannotations.api.b.e("", new n(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GamedetialModleFiveFragemnt
    public void s1(String str, int i4) {
        org.androidannotations.api.b.e("", new k0(str, i4), 0L);
    }

    @Override // com.join.mgps.activity.GamedetialModleFiveFragemnt, com.join.mgps.activity.gamedetail.BaseGameDetailFragment
    public void setCommentNumber(String str) {
        org.androidannotations.api.b.e("", new c0(str), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GamedetialModleFiveFragemnt
    public void showInstallButn() {
        org.androidannotations.api.b.e("", new a0(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GamedetialModleFiveFragemnt
    public void showLoding() {
        org.androidannotations.api.b.e("", new i(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GamedetialModleFiveFragemnt
    public void showLodingFailed() {
        org.androidannotations.api.b.e("", new y(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GamedetialModleFiveFragemnt
    public void showProgress() {
        org.androidannotations.api.b.e("", new z(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GamedetialModleFiveFragemnt
    public void showToast(String str) {
        org.androidannotations.api.b.e("", new s(str), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GamedetialModleFiveFragemnt
    public void t1(int i4) {
        org.androidannotations.api.b.e("", new e0(i4), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GamedetialModleFiveFragemnt
    public void u1(int i4) {
        org.androidannotations.api.b.e("", new d0(i4), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GamedetialModleFiveFragemnt
    public void updateButn() {
        org.androidannotations.api.b.e("", new b0(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GamedetialModleFiveFragemnt
    public void updateDownloadView() {
        org.androidannotations.api.b.e("", new h0(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GamedetialModleFiveFragemnt
    public void updateTitleButn(ResultMainBean resultMainBean, int i4) {
        org.androidannotations.api.b.e("", new j0(resultMainBean, i4), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GamedetialModleFiveFragemnt
    public void v1() {
        org.androidannotations.api.b.e("", new m(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GamedetialModleFiveFragemnt
    public void w1() {
        org.androidannotations.api.b.e("", new f0(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GamedetialModleFiveFragemnt
    public void x0() {
        org.androidannotations.api.a.l(new l0("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GamedetialModleFiveFragemnt
    public void y0() {
        org.androidannotations.api.a.l(new m0("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GamedetialModleFiveFragemnt
    public void y1(boolean z4) {
        org.androidannotations.api.b.e("", new i0(z4), 1000L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GamedetialModleFiveFragemnt
    public void z1(GamedetialModleFourBean gamedetialModleFourBean) {
        org.androidannotations.api.b.e("", new j(gamedetialModleFourBean), 0L);
    }
}
