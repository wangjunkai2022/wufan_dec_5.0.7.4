package com.join.mgps.activity;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.TextView;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import app.mgsim.arena.ArenaResponse;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.dto.CloudListDataBean;
import com.join.mgps.dto.GameMainV4DataBean;
import com.join.mgps.dto.OnlineCouponConfigBean;
import com.join.mgps.pref.PrefDef_;
import java.util.HashMap;
import java.util.Map;
import org.androidannotations.api.a;
/* loaded from: classes4.dex */
public final class GameMainActivity3_ extends GameMainActivity3 implements y3.a, a4.a, a4.b {
    public static final String H2 = "gameId";
    public static final String I2 = "from";

    /* renamed from: z2  reason: collision with root package name */
    private final a4.c f32419z2 = new a4.c();
    private final Map<Class<?>, Object> A2 = new HashMap();
    private final IntentFilter B2 = new IntentFilter();
    private final BroadcastReceiver C2 = new k();
    private final IntentFilter D2 = new IntentFilter();
    private final BroadcastReceiver E2 = new v();
    private final IntentFilter F2 = new IntentFilter();
    private final BroadcastReceiver G2 = new c0();

    /* loaded from: classes4.dex */
    class a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f32420b;

        a(boolean z4) {
            this.f32420b = z4;
        }

        @Override // java.lang.Runnable
        public void run() {
            GameMainActivity3_.super.n2(this.f32420b);
        }
    }

    /* loaded from: classes4.dex */
    class a0 extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f32422b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f32423c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f32424d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a0(String str, long j4, String str2, String str3, String str4, String str5) {
            super(str, j4, str2);
            this.f32422b = str3;
            this.f32423c = str4;
            this.f32424d = str5;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                GameMainActivity3_.super.u1(this.f32422b, this.f32423c, this.f32424d);
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
            GameMainActivity3_.super.l2();
        }
    }

    /* loaded from: classes4.dex */
    class b0 extends a.c {
        b0(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                GameMainActivity3_.super.B1();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GameMainActivity3_.super.m2();
        }
    }

    /* loaded from: classes4.dex */
    class c0 extends BroadcastReceiver {
        c0() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            GameMainActivity3_.this.j2(intent);
        }
    }

    /* loaded from: classes4.dex */
    class d implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ GameMainV4DataBean f32430b;

        d(GameMainV4DataBean gameMainV4DataBean) {
            this.f32430b = gameMainV4DataBean;
        }

        @Override // java.lang.Runnable
        public void run() {
            GameMainActivity3_.super.v2(this.f32430b);
        }
    }

    /* loaded from: classes4.dex */
    class d0 implements View.OnClickListener {
        d0() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GameMainActivity3_.this.k1();
        }
    }

    /* loaded from: classes4.dex */
    class e implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f32433b;

        e(String str) {
            this.f32433b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            GameMainActivity3_.super.showToast(this.f32433b);
        }
    }

    /* loaded from: classes4.dex */
    class e0 implements View.OnClickListener {
        e0() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GameMainActivity3_.this.back();
        }
    }

    /* loaded from: classes4.dex */
    class f implements Runnable {
        f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GameMainActivity3_.super.z1();
        }
    }

    /* loaded from: classes4.dex */
    class f0 implements View.OnClickListener {
        f0() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GameMainActivity3_.this.j1();
        }
    }

    /* loaded from: classes4.dex */
    class g implements Runnable {
        g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GameMainActivity3_.super.N1();
        }
    }

    /* loaded from: classes4.dex */
    class g0 implements View.OnClickListener {
        g0() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GameMainActivity3_.this.A2();
        }
    }

    /* loaded from: classes4.dex */
    class h implements Runnable {
        h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GameMainActivity3_.super.x2();
        }
    }

    /* loaded from: classes4.dex */
    class h0 implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ GameMainV4DataBean f32441b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f32442c;

        h0(GameMainV4DataBean gameMainV4DataBean, boolean z4) {
            this.f32441b = gameMainV4DataBean;
            this.f32442c = z4;
        }

        @Override // java.lang.Runnable
        public void run() {
            GameMainActivity3_.super.J2(this.f32441b, this.f32442c);
        }
    }

    /* loaded from: classes4.dex */
    class i implements Runnable {
        i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GameMainActivity3_.super.p1();
        }
    }

    /* loaded from: classes4.dex */
    class i0 implements Runnable {
        i0() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GameMainActivity3_.super.D2();
        }
    }

    /* loaded from: classes4.dex */
    class j implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ArenaResponse f32446b;

        j(ArenaResponse arenaResponse) {
            this.f32446b = arenaResponse;
        }

        @Override // java.lang.Runnable
        public void run() {
            GameMainActivity3_.super.handleFailure(this.f32446b);
        }
    }

    /* loaded from: classes4.dex */
    public static class j0 extends org.androidannotations.api.builder.a<j0> {

        /* renamed from: a  reason: collision with root package name */
        private Fragment f32448a;

        public j0(Context context) {
            super(context, GameMainActivity3_.class);
        }

        public j0 a(String str) {
            return (j0) super.extra("from", str);
        }

        public j0 b(String str) {
            return (j0) super.extra("gameId", str);
        }

        @Override // org.androidannotations.api.builder.a, org.androidannotations.api.builder.b
        public org.androidannotations.api.builder.f startForResult(int i4) {
            Fragment fragment = this.f32448a;
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

        public j0(Fragment fragment) {
            super(fragment.getActivity(), GameMainActivity3_.class);
            this.f32448a = fragment;
        }
    }

    /* loaded from: classes4.dex */
    class k extends BroadcastReceiver {
        k() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            GameMainActivity3_.this.i2(intent);
        }
    }

    /* loaded from: classes4.dex */
    class l implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f32450b;

        l(int i4) {
            this.f32450b = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            GameMainActivity3_.super.G2(this.f32450b);
        }
    }

    /* loaded from: classes4.dex */
    class m implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ OnlineCouponConfigBean f32452b;

        m(OnlineCouponConfigBean onlineCouponConfigBean) {
            this.f32452b = onlineCouponConfigBean;
        }

        @Override // java.lang.Runnable
        public void run() {
            GameMainActivity3_.super.w2(this.f32452b);
        }
    }

    /* loaded from: classes4.dex */
    class n implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CloudListDataBean f32454b;

        n(CloudListDataBean cloudListDataBean) {
            this.f32454b = cloudListDataBean;
        }

        @Override // java.lang.Runnable
        public void run() {
            GameMainActivity3_.super.I2(this.f32454b);
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
                GameMainActivity3_.super.o1();
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
                GameMainActivity3_.super.E1();
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
                GameMainActivity3_.super.getData();
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
                GameMainActivity3_.super.D1();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class s extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f32460b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        s(String str, long j4, String str2, String str3) {
            super(str, j4, str2);
            this.f32460b = str3;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                GameMainActivity3_.super.I1(this.f32460b);
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
                GameMainActivity3_.super.F1();
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
                GameMainActivity3_.super.H1();
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
            GameMainActivity3_.this.r2();
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
                GameMainActivity3_.super.y1();
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
                GameMainActivity3_.super.K1();
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
                GameMainActivity3_.super.J1();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class z extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CloudListDataBean f32468b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        z(String str, long j4, String str2, CloudListDataBean cloudListDataBean) {
            super(str, j4, str2);
            this.f32468b = cloudListDataBean;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                GameMainActivity3_.super.t1(this.f32468b);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    private void init_(Bundle bundle) {
        this.f32372b2 = new PrefDef_(this);
        a4.c.b(this);
        getWindow().setFlags(1024, 1024);
        injectExtras_();
        requestWindowFeature(1);
        this.B2.addAction(o1.a.f72005i0);
        this.D2.addAction("com.wufun.cloud.game.main.showDownDialog");
        this.F2.addAction("com.cloud.downCloud.all");
        registerReceiver(this.C2, this.B2);
        registerReceiver(this.E2, this.D2);
        registerReceiver(this.G2, this.F2);
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

    public static j0 m3(Context context) {
        return new j0(context);
    }

    public static j0 n3(Fragment fragment) {
        return new j0(fragment);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameMainActivity3
    public void B1() {
        org.androidannotations.api.a.l(new b0("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameMainActivity3
    public void D1() {
        org.androidannotations.api.a.l(new r("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameMainActivity3
    public void D2() {
        org.androidannotations.api.b.e("", new i0(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameMainActivity3
    public void E1() {
        org.androidannotations.api.a.l(new p("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameMainActivity3
    public void F1() {
        org.androidannotations.api.a.l(new t("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameMainActivity3
    public void G2(int i4) {
        org.androidannotations.api.b.e("", new l(i4), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameMainActivity3
    public void H1() {
        org.androidannotations.api.a.l(new u("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameMainActivity3
    public void I1(String str) {
        org.androidannotations.api.a.l(new s("", 0L, "", str));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameMainActivity3
    public void I2(CloudListDataBean cloudListDataBean) {
        org.androidannotations.api.b.e("", new n(cloudListDataBean), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameMainActivity3
    public void J1() {
        org.androidannotations.api.a.l(new y("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameMainActivity3
    public void J2(GameMainV4DataBean gameMainV4DataBean, boolean z4) {
        org.androidannotations.api.b.e("", new h0(gameMainV4DataBean, z4), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameMainActivity3
    public void K1() {
        org.androidannotations.api.a.l(new x("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameMainActivity3
    public void N1() {
        org.androidannotations.api.b.e("", new g(), 0L);
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.A2.get(cls);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameMainActivity3
    public void getData() {
        org.androidannotations.api.a.l(new q("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameMainActivity3
    public void handleFailure(ArenaResponse arenaResponse) {
        org.androidannotations.api.b.e("", new j(arenaResponse), 0L);
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        return (T) findViewById(i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameMainActivity3
    public void l2() {
        org.androidannotations.api.b.e("", new b(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameMainActivity3
    public void m2() {
        org.androidannotations.api.b.e("", new c(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameMainActivity3
    public void n2(boolean z4) {
        org.androidannotations.api.b.e("", new a(z4), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameMainActivity3
    public void o1() {
        org.androidannotations.api.a.l(new o("", 0L, ""));
    }

    @Override // com.join.mgps.activity.GameMainActivity3, com.join.mgps.activity.FriendActivity, com.BaseActivity, com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.f32419z2);
        init_(bundle);
        super.onCreate(bundle);
        a4.c.c(c5);
        setContentView(R.layout.activity_game_main_3);
    }

    @Override // com.join.mgps.activity.GameMainActivity3, com.join.mgps.activity.FriendActivity, com.BaseActivity, com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        unregisterReceiver(this.C2);
        unregisterReceiver(this.E2);
        unregisterReceiver(this.G2);
        super.onDestroy();
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
        this.X = (RecyclerView) aVar.internalFindViewById(R.id.gameMainNewRv);
        View internalFindViewById = aVar.internalFindViewById(R.id.buyVip);
        View internalFindViewById2 = aVar.internalFindViewById(R.id.back);
        View internalFindViewById3 = aVar.internalFindViewById(R.id.startGame);
        if (internalFindViewById != null) {
            internalFindViewById.setOnClickListener(new d0());
        }
        if (internalFindViewById2 != null) {
            internalFindViewById2.setOnClickListener(new e0());
        }
        View view = this.S;
        if (view != null) {
            view.setOnClickListener(new f0());
        }
        if (internalFindViewById3 != null) {
            internalFindViewById3.setOnClickListener(new g0());
        }
        afterViews();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameMainActivity3
    public void p1() {
        org.androidannotations.api.b.e("", new i(), 0L);
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.A2.put(cls, t4);
    }

    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i4) {
        super.setContentView(i4);
        this.f32419z2.a(this);
    }

    @Override // android.app.Activity
    public void setIntent(Intent intent) {
        super.setIntent(intent);
        injectExtras_();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameMainActivity3
    public void showToast(String str) {
        org.androidannotations.api.b.e("", new e(str), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameMainActivity3
    public void t1(CloudListDataBean cloudListDataBean) {
        org.androidannotations.api.a.l(new z("", 0L, "", cloudListDataBean));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameMainActivity3
    public void u1(String str, String str2, String str3) {
        org.androidannotations.api.a.l(new a0("", 0L, "", str, str2, str3));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameMainActivity3
    public void v2(GameMainV4DataBean gameMainV4DataBean) {
        org.androidannotations.api.b.e("", new d(gameMainV4DataBean), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameMainActivity3
    public void w2(OnlineCouponConfigBean onlineCouponConfigBean) {
        org.androidannotations.api.b.e("", new m(onlineCouponConfigBean), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameMainActivity3
    public void x2() {
        org.androidannotations.api.b.e("", new h(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameMainActivity3
    public void y1() {
        org.androidannotations.api.a.l(new w("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameMainActivity3
    public void z1() {
        org.androidannotations.api.b.e("", new f(), 0L);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        this.f32419z2.a(this);
    }

    @Override // com.join.mgps.activity.FriendActivity, com.BaseActivity, com.BaseFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        super.setContentView(view);
        this.f32419z2.a(this);
    }
}
