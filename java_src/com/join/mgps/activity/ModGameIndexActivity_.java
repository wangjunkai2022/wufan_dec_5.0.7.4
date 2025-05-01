package com.join.mgps.activity;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.facebook.drawee.view.SimpleDraweeView;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.google.android.material.tabs.TabLayout;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.MyTouchFrameLayout;
import com.join.mgps.dto.GamedetialModleFourBean;
import com.join.mgps.dto.ModGameDetailBean;
import com.join.mgps.pref.PrefDef_;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.androidannotations.api.a;
/* loaded from: classes4.dex */
public final class ModGameIndexActivity_ extends ModGameIndexActivity implements y3.a, a4.a, a4.b {

    /* renamed from: c2  reason: collision with root package name */
    public static final String f35234c2 = "gameId";

    /* renamed from: d2  reason: collision with root package name */
    public static final String f35235d2 = "standGameId";

    /* renamed from: e2  reason: collision with root package name */
    public static final String f35236e2 = "from";
    private final a4.c Y1 = new a4.c();
    private final Map<Class<?>, Object> Z1 = new HashMap();

    /* renamed from: a2  reason: collision with root package name */
    private final IntentFilter f35237a2 = new IntentFilter();

    /* renamed from: b2  reason: collision with root package name */
    private final BroadcastReceiver f35238b2 = new k();

    /* loaded from: classes4.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ModGameIndexActivity_.this.relodingimag();
        }
    }

    /* loaded from: classes4.dex */
    class a0 implements View.OnClickListener {
        a0() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ModGameIndexActivity_.this.m0();
        }
    }

    /* loaded from: classes4.dex */
    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ModGameIndexActivity_.this.setNetwork();
        }
    }

    /* loaded from: classes4.dex */
    class b0 implements View.OnClickListener {
        b0() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ModGameIndexActivity_.this.l0();
        }
    }

    /* loaded from: classes4.dex */
    class c implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f35243b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ DownloadTask f35244c;

        c(boolean z4, DownloadTask downloadTask) {
            this.f35243b = z4;
            this.f35244c = downloadTask;
        }

        @Override // java.lang.Runnable
        public void run() {
            ModGameIndexActivity_.super.Z0(this.f35243b, this.f35244c);
        }
    }

    /* loaded from: classes4.dex */
    class c0 implements View.OnClickListener {
        c0() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ModGameIndexActivity_.this.q1();
        }
    }

    /* loaded from: classes4.dex */
    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ModGameIndexActivity_.super.t1();
        }
    }

    /* loaded from: classes4.dex */
    public static class d0 extends org.androidannotations.api.builder.a<d0> {

        /* renamed from: a  reason: collision with root package name */
        private Fragment f35248a;

        public d0(Context context) {
            super(context, ModGameIndexActivity_.class);
        }

        public d0 a(String str) {
            return (d0) super.extra("from", str);
        }

        public d0 b(String str) {
            return (d0) super.extra("gameId", str);
        }

        public d0 c(String str) {
            return (d0) super.extra(ModGameIndexActivity_.f35235d2, str);
        }

        @Override // org.androidannotations.api.builder.a, org.androidannotations.api.builder.b
        public org.androidannotations.api.builder.f startForResult(int i4) {
            Fragment fragment = this.f35248a;
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

        public d0(Fragment fragment) {
            super(fragment.getActivity(), ModGameIndexActivity_.class);
            this.f35248a = fragment;
        }
    }

    /* loaded from: classes4.dex */
    class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ModGameIndexActivity_.super.H1();
        }
    }

    /* loaded from: classes4.dex */
    class f implements Runnable {
        f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ModGameIndexActivity_.super.g1();
        }
    }

    /* loaded from: classes4.dex */
    class g implements Runnable {
        g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ModGameIndexActivity_.super.showLodingFailed();
        }
    }

    /* loaded from: classes4.dex */
    class h implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ModGameDetailBean f35252b;

        h(ModGameDetailBean modGameDetailBean) {
            this.f35252b = modGameDetailBean;
        }

        @Override // java.lang.Runnable
        public void run() {
            ModGameIndexActivity_.super.V1(this.f35252b);
        }
    }

    /* loaded from: classes4.dex */
    class i implements Runnable {
        i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ModGameIndexActivity_.super.showLoding();
        }
    }

    /* loaded from: classes4.dex */
    class j implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DownloadTask f35255b;

        j(DownloadTask downloadTask) {
            this.f35255b = downloadTask;
        }

        @Override // java.lang.Runnable
        public void run() {
            ModGameIndexActivity_.super.G1(this.f35255b);
        }
    }

    /* loaded from: classes4.dex */
    class k extends BroadcastReceiver {

        /* renamed from: b  reason: collision with root package name */
        public static final String f35257b = "from";

        k() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            ModGameIndexActivity_.this.N1((intent.getExtras() != null ? intent.getExtras() : new Bundle()).getString("from"));
        }
    }

    /* loaded from: classes4.dex */
    class l implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DownloadTask f35259b;

        l(DownloadTask downloadTask) {
            this.f35259b = downloadTask;
        }

        @Override // java.lang.Runnable
        public void run() {
            ModGameIndexActivity_.super.F1(this.f35259b);
        }
    }

    /* loaded from: classes4.dex */
    class m implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DownloadTask f35261b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ GamedetialModleFourBean f35262c;

        m(DownloadTask downloadTask, GamedetialModleFourBean gamedetialModleFourBean) {
            this.f35261b = downloadTask;
            this.f35262c = gamedetialModleFourBean;
        }

        @Override // java.lang.Runnable
        public void run() {
            ModGameIndexActivity_.super.Q1(this.f35261b, this.f35262c);
        }
    }

    /* loaded from: classes4.dex */
    class n implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f35264b;

        n(boolean z4) {
            this.f35264b = z4;
        }

        @Override // java.lang.Runnable
        public void run() {
            ModGameIndexActivity_.super.T1(this.f35264b);
        }
    }

    /* loaded from: classes4.dex */
    class o implements Runnable {
        o() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ModGameIndexActivity_.super.a1();
        }
    }

    /* loaded from: classes4.dex */
    class p extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DownloadTask f35267b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(String str, long j4, String str2, DownloadTask downloadTask) {
            super(str, j4, str2);
            this.f35267b = downloadTask;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                ModGameIndexActivity_.super.X0(this.f35267b);
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
                ModGameIndexActivity_.super.getDetialData();
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
                ModGameIndexActivity_.super.e1();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class s extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f35271b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        s(String str, long j4, String str2, List list) {
            super(str, j4, str2);
            this.f35271b = list;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                ModGameIndexActivity_.super.c1(this.f35271b);
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
                ModGameIndexActivity_.super.T0();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class u extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DownloadTask f35274b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        u(String str, long j4, String str2, DownloadTask downloadTask) {
            super(str, j4, str2);
            this.f35274b = downloadTask;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                ModGameIndexActivity_.super.Y0(this.f35274b);
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
            ModGameIndexActivity_.this.onBack();
        }
    }

    /* loaded from: classes4.dex */
    class w implements View.OnClickListener {
        w() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ModGameIndexActivity_.this.L1();
        }
    }

    /* loaded from: classes4.dex */
    class x implements View.OnClickListener {
        x() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ModGameIndexActivity_.this.M1();
        }
    }

    /* loaded from: classes4.dex */
    class y implements View.OnClickListener {
        y() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ModGameIndexActivity_.this.o0();
        }
    }

    /* loaded from: classes4.dex */
    class z implements View.OnClickListener {
        z() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ModGameIndexActivity_.this.n0();
        }
    }

    private void init_(Bundle bundle) {
        this.V = new PrefDef_(this);
        a4.c.b(this);
        getWindow().setFlags(1024, 1024);
        injectExtras_();
        supportRequestWindowFeature(1);
        this.f35237a2.addAction(o1.a.f72025s0);
        registerReceiver(this.f35238b2, this.f35237a2);
    }

    private void injectExtras_() {
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            if (extras.containsKey("gameId")) {
                this.I = extras.getString("gameId");
            }
            if (extras.containsKey(f35235d2)) {
                this.J = extras.getString(f35235d2);
            }
            if (extras.containsKey("from")) {
                this.K = extras.getString("from");
            }
        }
    }

    public static d0 o2(Context context) {
        return new d0(context);
    }

    public static d0 p2(Fragment fragment) {
        return new d0(fragment);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ModGameIndexActivity
    public void F1(DownloadTask downloadTask) {
        org.androidannotations.api.b.e("", new l(downloadTask), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ModGameIndexActivity
    public void G1(DownloadTask downloadTask) {
        org.androidannotations.api.b.e("", new j(downloadTask), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ModGameIndexActivity
    public void H1() {
        org.androidannotations.api.b.e("", new e(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ModGameIndexActivity
    public void Q1(DownloadTask downloadTask, GamedetialModleFourBean gamedetialModleFourBean) {
        org.androidannotations.api.b.e("", new m(downloadTask, gamedetialModleFourBean), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ModGameIndexActivity
    public void T0() {
        org.androidannotations.api.a.l(new t("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ModGameIndexActivity
    public void T1(boolean z4) {
        org.androidannotations.api.b.e("", new n(z4), 1000L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ModGameIndexActivity
    public void V1(ModGameDetailBean modGameDetailBean) {
        org.androidannotations.api.b.e("", new h(modGameDetailBean), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ModGameIndexActivity
    public void X0(DownloadTask downloadTask) {
        org.androidannotations.api.a.l(new p("", 0L, "", downloadTask));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ModGameIndexActivity
    public void Y0(DownloadTask downloadTask) {
        org.androidannotations.api.a.l(new u("", 0L, "", downloadTask));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ModGameIndexActivity
    public void Z0(boolean z4, DownloadTask downloadTask) {
        org.androidannotations.api.b.e("", new c(z4, downloadTask), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ModGameIndexActivity
    public void a1() {
        org.androidannotations.api.b.e("", new o(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ModGameIndexActivity
    public void c1(List<String> list) {
        org.androidannotations.api.a.l(new s("", 0L, "", list));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ModGameIndexActivity
    public void e1() {
        org.androidannotations.api.a.l(new r("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ModGameIndexActivity
    public void g1() {
        org.androidannotations.api.b.e("", new f(), 0L);
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.Z1.get(cls);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ModGameIndexActivity
    public void getDetialData() {
        org.androidannotations.api.a.l(new q("", 0L, ""));
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        return (T) findViewById(i4);
    }

    @Override // com.join.mgps.activity.ModGameIndexActivity, com.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.Y1);
        init_(bundle);
        super.onCreate(bundle);
        a4.c.c(c5);
        setContentView(R.layout.activity_mod_game_index);
    }

    @Override // com.join.mgps.activity.ModGameIndexActivity, com.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        unregisterReceiver(this.f35238b2);
        super.onDestroy();
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f35159b = (ImageView) aVar.internalFindViewById(R.id.iv_back);
        this.f35160c = (TextView) aVar.internalFindViewById(R.id.tv_game_name);
        this.f35161d = (SimpleDraweeView) aVar.internalFindViewById(R.id.sdv_image);
        this.f35162e = (LinearLayout) aVar.internalFindViewById(R.id.ll_mod_start);
        this.f35163f = (LinearLayout) aVar.internalFindViewById(R.id.ll_stand_start);
        this.f35164g = (ImageView) aVar.internalFindViewById(R.id.iv_mod_play);
        this.f35165h = (TextView) aVar.internalFindViewById(R.id.tv_mod_type);
        this.f35166i = (TextView) aVar.internalFindViewById(R.id.tv_new_version);
        this.f35167j = (TextView) aVar.internalFindViewById(R.id.tv_stand_type);
        this.f35168k = (TextView) aVar.internalFindViewById(R.id.tv_stand_new_version);
        this.f35169l = (SimpleDraweeView) aVar.internalFindViewById(R.id.tv_open_vip);
        this.f35170m = (ImageView) aVar.internalFindViewById(R.id.iv_stand_font);
        this.f35171n = (ImageView) aVar.internalFindViewById(R.id.iv_mod_font);
        this.f35172o = (TextView) aVar.internalFindViewById(R.id.tv_stand_status);
        this.f35173p = (TextView) aVar.internalFindViewById(R.id.tv_mod_status);
        this.f35176q = (ConstraintLayout) aVar.internalFindViewById(R.id.cl_mod);
        this.f35177r = (TextView) aVar.internalFindViewById(R.id.tv_mod_install_status);
        this.f35178s = (SimpleDraweeView) aVar.internalFindViewById(R.id.sdv_mod_dot);
        this.f35179t = (ViewPager) aVar.internalFindViewById(R.id.viewPager);
        this.f35180u = (TabLayout) aVar.internalFindViewById(R.id.tabLayout);
        this.f35181v = aVar.internalFindViewById(R.id.rightLayout);
        this.f35183w = aVar.internalFindViewById(R.id.loding_layout);
        this.f35184x = aVar.internalFindViewById(R.id.loding_faile);
        this.f35185y = aVar.internalFindViewById(R.id.archiveLayout);
        this.f35186z = (RecyclerView) aVar.internalFindViewById(R.id.rvModGameRecommendShrink);
        this.A = (RecyclerView) aVar.internalFindViewById(R.id.rvModGameRecommendExpand);
        this.B = (ImageView) aVar.internalFindViewById(R.id.btnRecommendToggleShrink);
        this.C = (ImageView) aVar.internalFindViewById(R.id.btnRecommendToggleExpand);
        this.D = (MyTouchFrameLayout) aVar.internalFindViewById(R.id.flRecommendShrink);
        this.E = (MyTouchFrameLayout) aVar.internalFindViewById(R.id.flRecommendExpand);
        this.F = aVar.internalFindViewById(R.id.expandMask);
        this.G = (LinearLayout) aVar.internalFindViewById(R.id.llContainer);
        this.H = (TextView) aVar.internalFindViewById(R.id.tvRecommendAdCount);
        View internalFindViewById = aVar.internalFindViewById(R.id.bgExpand);
        View internalFindViewById2 = aVar.internalFindViewById(R.id.relodingimag);
        View internalFindViewById3 = aVar.internalFindViewById(R.id.setNetwork);
        ImageView imageView = this.f35159b;
        if (imageView != null) {
            imageView.setOnClickListener(new v());
        }
        LinearLayout linearLayout = this.f35162e;
        if (linearLayout != null) {
            linearLayout.setOnClickListener(new w());
        }
        LinearLayout linearLayout2 = this.f35163f;
        if (linearLayout2 != null) {
            linearLayout2.setOnClickListener(new x());
        }
        ImageView imageView2 = this.B;
        if (imageView2 != null) {
            imageView2.setOnClickListener(new y());
        }
        ImageView imageView3 = this.C;
        if (imageView3 != null) {
            imageView3.setOnClickListener(new z());
        }
        View view = this.F;
        if (view != null) {
            view.setOnClickListener(new a0());
        }
        if (internalFindViewById != null) {
            internalFindViewById.setOnClickListener(new b0());
        }
        SimpleDraweeView simpleDraweeView = this.f35169l;
        if (simpleDraweeView != null) {
            simpleDraweeView.setOnClickListener(new c0());
        }
        if (internalFindViewById2 != null) {
            internalFindViewById2.setOnClickListener(new a());
        }
        if (internalFindViewById3 != null) {
            internalFindViewById3.setOnClickListener(new b());
        }
        afterViews();
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.Z1.put(cls, t4);
    }

    @Override // com.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i4) {
        super.setContentView(i4);
        this.Y1.a(this);
    }

    @Override // android.app.Activity
    public void setIntent(Intent intent) {
        super.setIntent(intent);
        injectExtras_();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ModGameIndexActivity
    public void showLoding() {
        org.androidannotations.api.b.e("", new i(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ModGameIndexActivity
    public void showLodingFailed() {
        org.androidannotations.api.b.e("", new g(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ModGameIndexActivity
    public void t1() {
        org.androidannotations.api.b.e("", new d(), 0L);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        this.Y1.a(this);
    }

    @Override // com.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        super.setContentView(view);
        this.Y1.a(this);
    }
}
