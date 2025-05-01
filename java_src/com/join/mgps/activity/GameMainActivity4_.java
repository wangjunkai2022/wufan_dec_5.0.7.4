package com.join.mgps.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import app.mgsim.arena.ArenaResponse;
import com.facebook.drawee.view.SimpleDraweeView;
import com.google.android.material.tabs.TabLayout;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.WrapContentGridView;
import com.join.mgps.dto.GameMainV4DataBean;
import com.join.mgps.dto.OnlineCouponConfigBean;
import com.join.mgps.pref.PrefDef_;
import java.util.HashMap;
import java.util.Map;
import org.androidannotations.api.a;
/* loaded from: classes4.dex */
public final class GameMainActivity4_ extends GameMainActivity4 implements y3.a, a4.a, a4.b {
    public static final String L2 = "gameId";
    public static final String M2 = "from";
    private final a4.c J2 = new a4.c();
    private final Map<Class<?>, Object> K2 = new HashMap();

    /* loaded from: classes4.dex */
    class a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ GameMainV4DataBean f32521b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f32522c;

        a(GameMainV4DataBean gameMainV4DataBean, boolean z4) {
            this.f32521b = gameMainV4DataBean;
            this.f32522c = z4;
        }

        @Override // java.lang.Runnable
        public void run() {
            GameMainActivity4_.super.r2(this.f32521b, this.f32522c);
        }
    }

    /* loaded from: classes4.dex */
    class a0 extends a.c {
        a0(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                GameMainActivity4_.super.z1();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GameMainActivity4_.super.m2();
        }
    }

    /* loaded from: classes4.dex */
    class b0 implements View.OnClickListener {
        b0() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GameMainActivity4_.this.back();
        }
    }

    /* loaded from: classes4.dex */
    class c implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f32527b;

        c(boolean z4) {
            this.f32527b = z4;
        }

        @Override // java.lang.Runnable
        public void run() {
            GameMainActivity4_.super.Y1(this.f32527b);
        }
    }

    /* loaded from: classes4.dex */
    class c0 implements View.OnClickListener {
        c0() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GameMainActivity4_.this.k1();
        }
    }

    /* loaded from: classes4.dex */
    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GameMainActivity4_.super.W1();
        }
    }

    /* loaded from: classes4.dex */
    class d0 implements View.OnClickListener {
        d0() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GameMainActivity4_.this.j2();
        }
    }

    /* loaded from: classes4.dex */
    class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GameMainActivity4_.super.X1();
        }
    }

    /* loaded from: classes4.dex */
    class e0 implements View.OnClickListener {
        e0() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GameMainActivity4_.this.S1();
        }
    }

    /* loaded from: classes4.dex */
    class f implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ GameMainV4DataBean f32534b;

        f(GameMainV4DataBean gameMainV4DataBean) {
            this.f32534b = gameMainV4DataBean;
        }

        @Override // java.lang.Runnable
        public void run() {
            GameMainActivity4_.super.f2(this.f32534b);
        }
    }

    /* loaded from: classes4.dex */
    class f0 implements View.OnClickListener {
        f0() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GameMainActivity4_.this.R1();
        }
    }

    /* loaded from: classes4.dex */
    class g implements Runnable {
        g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GameMainActivity4_.super.x1();
        }
    }

    /* loaded from: classes4.dex */
    class g0 implements View.OnClickListener {
        g0() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GameMainActivity4_.this.T1();
        }
    }

    /* loaded from: classes4.dex */
    class h implements Runnable {
        h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GameMainActivity4_.super.N1();
        }
    }

    /* loaded from: classes4.dex */
    class h0 implements View.OnClickListener {
        h0() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GameMainActivity4_.this.o2();
        }
    }

    /* loaded from: classes4.dex */
    class i implements Runnable {
        i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GameMainActivity4_.super.h2();
        }
    }

    /* loaded from: classes4.dex */
    public static class i0 extends org.androidannotations.api.builder.a<i0> {

        /* renamed from: a  reason: collision with root package name */
        private Fragment f32542a;

        public i0(Context context) {
            super(context, GameMainActivity4_.class);
        }

        public i0 a(String str) {
            return (i0) super.extra("from", str);
        }

        public i0 b(String str) {
            return (i0) super.extra("gameId", str);
        }

        @Override // org.androidannotations.api.builder.a, org.androidannotations.api.builder.b
        public org.androidannotations.api.builder.f startForResult(int i4) {
            Fragment fragment = this.f32542a;
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

        public i0(Fragment fragment) {
            super(fragment.getActivity(), GameMainActivity4_.class);
            this.f32542a = fragment;
        }
    }

    /* loaded from: classes4.dex */
    class j implements Runnable {
        j() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GameMainActivity4_.super.p1();
        }
    }

    /* loaded from: classes4.dex */
    class k implements View.OnClickListener {
        k() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GameMainActivity4_.this.l1();
        }
    }

    /* loaded from: classes4.dex */
    class l implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ArenaResponse f32545b;

        l(ArenaResponse arenaResponse) {
            this.f32545b = arenaResponse;
        }

        @Override // java.lang.Runnable
        public void run() {
            GameMainActivity4_.super.handleFailure(this.f32545b);
        }
    }

    /* loaded from: classes4.dex */
    class m implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ OnlineCouponConfigBean f32547b;

        m(OnlineCouponConfigBean onlineCouponConfigBean) {
            this.f32547b = onlineCouponConfigBean;
        }

        @Override // java.lang.Runnable
        public void run() {
            GameMainActivity4_.super.g2(this.f32547b);
        }
    }

    /* loaded from: classes4.dex */
    class n implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f32549b;

        n(int i4) {
            this.f32549b = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            GameMainActivity4_.super.p2(this.f32549b);
        }
    }

    /* loaded from: classes4.dex */
    class o extends a.c {
        o(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                GameMainActivity4_.super.K1();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class p extends a.c {
        p(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                GameMainActivity4_.super.C1();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
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
                GameMainActivity4_.super.getData();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class r extends a.c {
        r(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                GameMainActivity4_.super.H1();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class s extends a.c {
        s(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                GameMainActivity4_.super.B1();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class t extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f32556b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        t(String str, long j4, String str2, String str3) {
            super(str, j4, str2);
            this.f32556b = str3;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                GameMainActivity4_.super.G1(this.f32556b);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
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
                GameMainActivity4_.super.D1();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class v implements View.OnClickListener {
        v() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GameMainActivity4_.this.s1();
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
                GameMainActivity4_.super.F1();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class x extends a.c {
        x(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                GameMainActivity4_.super.w1();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class y extends a.c {
        y(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                GameMainActivity4_.super.J1();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class z extends a.c {
        z(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                GameMainActivity4_.super.I1();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    public static i0 S2(Context context) {
        return new i0(context);
    }

    public static i0 T2(Fragment fragment) {
        return new i0(fragment);
    }

    private void init_(Bundle bundle) {
        this.f32490s2 = new PrefDef_(this);
        a4.c.b(this);
        getWindow().setFlags(1024, 1024);
        injectExtras_();
        requestWindowFeature(1);
    }

    private void injectExtras_() {
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            if (extras.containsKey("gameId")) {
                this.N = extras.getString("gameId");
            }
            if (extras.containsKey("from")) {
                this.O = extras.getString("from");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameMainActivity4
    public void B1() {
        org.androidannotations.api.a.l(new s("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameMainActivity4
    public void C1() {
        org.androidannotations.api.a.l(new p("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameMainActivity4
    public void D1() {
        org.androidannotations.api.a.l(new u("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameMainActivity4
    public void F1() {
        org.androidannotations.api.a.l(new w("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameMainActivity4
    public void G1(String str) {
        org.androidannotations.api.a.l(new t("", 0L, "", str));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameMainActivity4
    public void H1() {
        org.androidannotations.api.a.l(new r("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameMainActivity4
    public void I1() {
        org.androidannotations.api.a.l(new z("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameMainActivity4
    public void J1() {
        org.androidannotations.api.a.l(new y("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameMainActivity4
    public void K1() {
        org.androidannotations.api.a.l(new o("", 1500L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameMainActivity4
    public void N1() {
        org.androidannotations.api.b.e("", new h(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameMainActivity4
    public void W1() {
        org.androidannotations.api.b.e("", new d(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameMainActivity4
    public void X1() {
        org.androidannotations.api.b.e("", new e(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameMainActivity4
    public void Y1(boolean z4) {
        org.androidannotations.api.b.e("", new c(z4), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameMainActivity4
    public void f2(GameMainV4DataBean gameMainV4DataBean) {
        org.androidannotations.api.b.e("", new f(gameMainV4DataBean), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameMainActivity4
    public void g2(OnlineCouponConfigBean onlineCouponConfigBean) {
        org.androidannotations.api.b.e("", new m(onlineCouponConfigBean), 0L);
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.K2.get(cls);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameMainActivity4
    public void getData() {
        org.androidannotations.api.a.l(new q("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameMainActivity4
    public void h2() {
        org.androidannotations.api.b.e("", new i(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameMainActivity4
    public void handleFailure(ArenaResponse arenaResponse) {
        org.androidannotations.api.b.e("", new l(arenaResponse), 0L);
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        return (T) findViewById(i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameMainActivity4
    public void m2() {
        org.androidannotations.api.b.e("", new b(), 0L);
    }

    @Override // com.join.mgps.activity.GameMainActivity4, com.join.mgps.activity.FriendActivity, com.BaseActivity, com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.J2);
        init_(bundle);
        super.onCreate(bundle);
        a4.c.c(c5);
        setContentView(R.layout.activity_game_main4);
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.P = aVar.internalFindViewById(R.id.ll_loading);
        this.Q = (TextView) aVar.internalFindViewById(R.id.gameName);
        this.R = (TextView) aVar.internalFindViewById(R.id.roomCount);
        this.S = aVar.internalFindViewById(R.id.battleHall);
        this.U = (GridView) aVar.internalFindViewById(R.id.gameMainNewLeftGv);
        this.V = (SimpleDraweeView) aVar.internalFindViewById(R.id.gameImg);
        this.W = aVar.internalFindViewById(R.id.leftContainer);
        this.X = (TabLayout) aVar.internalFindViewById(R.id.tabLayout);
        this.Y = (ViewPager) aVar.internalFindViewById(R.id.viewPager);
        this.Z = (TextView) aVar.internalFindViewById(R.id.vipTitle);
        this.f32485p0 = (WrapContentGridView) aVar.internalFindViewById(R.id.vipFunc);
        this.f32486p1 = aVar.internalFindViewById(R.id.mask);
        this.f32493v1 = (FrameLayout) aVar.internalFindViewById(R.id.expandContainer);
        this.A1 = (ImageView) aVar.internalFindViewById(R.id.ivTips);
        this.B1 = (ImageView) aVar.internalFindViewById(R.id.ivChoose);
        this.C1 = (FrameLayout) aVar.internalFindViewById(R.id.friendContainer);
        View internalFindViewById = aVar.internalFindViewById(R.id.buyVip);
        View internalFindViewById2 = aVar.internalFindViewById(R.id.endGameEntrance);
        View internalFindViewById3 = aVar.internalFindViewById(R.id.back);
        View internalFindViewById4 = aVar.internalFindViewById(R.id.startGame);
        View internalFindViewById5 = aVar.internalFindViewById(R.id.tvBattle);
        if (internalFindViewById != null) {
            internalFindViewById.setOnClickListener(new k());
        }
        if (internalFindViewById2 != null) {
            internalFindViewById2.setOnClickListener(new v());
        }
        if (internalFindViewById3 != null) {
            internalFindViewById3.setOnClickListener(new b0());
        }
        View view = this.S;
        if (view != null) {
            view.setOnClickListener(new c0());
        }
        if (internalFindViewById4 != null) {
            internalFindViewById4.setOnClickListener(new d0());
        }
        ImageView imageView = this.A1;
        if (imageView != null) {
            imageView.setOnClickListener(new e0());
        }
        ImageView imageView2 = this.B1;
        if (imageView2 != null) {
            imageView2.setOnClickListener(new f0());
        }
        View view2 = this.f32486p1;
        if (view2 != null) {
            view2.setOnClickListener(new g0());
        }
        if (internalFindViewById5 != null) {
            internalFindViewById5.setOnClickListener(new h0());
        }
        afterViews();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameMainActivity4
    public void p1() {
        org.androidannotations.api.b.e("", new j(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameMainActivity4
    public void p2(int i4) {
        org.androidannotations.api.b.e("", new n(i4), 0L);
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.K2.put(cls, t4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameMainActivity4
    public void r2(GameMainV4DataBean gameMainV4DataBean, boolean z4) {
        org.androidannotations.api.b.e("", new a(gameMainV4DataBean, z4), 0L);
    }

    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i4) {
        super.setContentView(i4);
        this.J2.a(this);
    }

    @Override // android.app.Activity
    public void setIntent(Intent intent) {
        super.setIntent(intent);
        injectExtras_();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameMainActivity4
    public void w1() {
        org.androidannotations.api.a.l(new x("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameMainActivity4
    public void x1() {
        org.androidannotations.api.b.e("", new g(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameMainActivity4
    public void z1() {
        org.androidannotations.api.a.l(new a0("", 0L, ""));
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        this.J2.a(this);
    }

    @Override // com.join.mgps.activity.FriendActivity, com.BaseActivity, com.BaseFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        super.setContentView(view);
        this.J2.a(this);
    }
}
