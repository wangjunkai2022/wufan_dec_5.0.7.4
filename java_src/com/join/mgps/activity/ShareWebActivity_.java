package com.join.mgps.activity;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.Fragment;
import app.mgsim.arena.ArenaResponse;
import app.mgsim.arena.SocketError;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.IntentDateBean;
import com.join.mgps.customview.LJWebView;
import com.join.mgps.dto.CreateVipData;
import com.join.mgps.dto.DetailResultBean;
import com.join.mgps.dto.DomainInfoBean;
import com.join.mgps.dto.IntentDataMain;
import com.join.mgps.pref.PrefDef_;
import com.papa91.battle.protocol.GameRoom;
import java.util.HashMap;
import java.util.Map;
import org.androidannotations.api.a;
/* loaded from: classes4.dex */
public final class ShareWebActivity_ extends ShareWebActivity implements y3.a, a4.a, a4.b {

    /* renamed from: k2  reason: collision with root package name */
    public static final String f37692k2 = "intentdate";

    /* renamed from: l2  reason: collision with root package name */
    public static final String f37693l2 = "intentDataMain";

    /* renamed from: m2  reason: collision with root package name */
    public static final String f37694m2 = "supportJavascript";

    /* renamed from: g2  reason: collision with root package name */
    private final a4.c f37695g2 = new a4.c();

    /* renamed from: h2  reason: collision with root package name */
    private final Map<Class<?>, Object> f37696h2 = new HashMap();

    /* renamed from: i2  reason: collision with root package name */
    private final IntentFilter f37697i2 = new IntentFilter();

    /* renamed from: j2  reason: collision with root package name */
    private final BroadcastReceiver f37698j2 = new k();

    /* loaded from: classes4.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ShareWebActivity_.super.showLoding();
        }
    }

    /* loaded from: classes4.dex */
    class a0 implements View.OnClickListener {
        a0() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ShareWebActivity_.this.y1();
        }
    }

    /* loaded from: classes4.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ShareWebActivity_.super.showLodingFailed();
        }
    }

    /* loaded from: classes4.dex */
    class b0 implements View.OnClickListener {
        b0() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ShareWebActivity_.this.U0();
        }
    }

    /* loaded from: classes4.dex */
    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ShareWebActivity_.super.L1();
        }
    }

    /* loaded from: classes4.dex */
    class c0 implements View.OnClickListener {
        c0() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ShareWebActivity_.this.T0();
        }
    }

    /* loaded from: classes4.dex */
    class d implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f37705b;

        d(String str) {
            this.f37705b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            ShareWebActivity_.super.showTost(this.f37705b);
        }
    }

    /* loaded from: classes4.dex */
    class d0 implements View.OnClickListener {
        d0() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ShareWebActivity_.this.setNetwork();
        }
    }

    /* loaded from: classes4.dex */
    class e implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DetailResultBean f37708b;

        e(DetailResultBean detailResultBean) {
            this.f37708b = detailResultBean;
        }

        @Override // java.lang.Runnable
        public void run() {
            ShareWebActivity_.super.startDown(this.f37708b);
        }
    }

    /* loaded from: classes4.dex */
    class e0 implements View.OnClickListener {
        e0() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ShareWebActivity_.this.search();
        }
    }

    /* loaded from: classes4.dex */
    class f implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DetailResultBean f37711b;

        f(DetailResultBean detailResultBean) {
            this.f37711b = detailResultBean;
        }

        @Override // java.lang.Runnable
        public void run() {
            ShareWebActivity_.super.N1(this.f37711b);
        }
    }

    /* loaded from: classes4.dex */
    class f0 implements View.OnClickListener {
        f0() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ShareWebActivity_.this.d1();
        }
    }

    /* loaded from: classes4.dex */
    class g implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DomainInfoBean f37714b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f37715c;

        g(DomainInfoBean domainInfoBean, String str) {
            this.f37714b = domainInfoBean;
            this.f37715c = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            ShareWebActivity_.super.G1(this.f37714b, this.f37715c);
        }
    }

    /* loaded from: classes4.dex */
    class g0 implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f37717b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ IntentDateBean f37718c;

        g0(String str, IntentDateBean intentDateBean) {
            this.f37717b = str;
            this.f37718c = intentDateBean;
        }

        @Override // java.lang.Runnable
        public void run() {
            ShareWebActivity_.super.c1(this.f37717b, this.f37718c);
        }
    }

    /* loaded from: classes4.dex */
    class h implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f37720b;

        h(String str) {
            this.f37720b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            ShareWebActivity_.super.w1(this.f37720b);
        }
    }

    /* loaded from: classes4.dex */
    public static class h0 extends org.androidannotations.api.builder.a<h0> {

        /* renamed from: a  reason: collision with root package name */
        private Fragment f37722a;

        public h0(Context context) {
            super(context, ShareWebActivity_.class);
        }

        public h0 a(IntentDataMain intentDataMain) {
            return (h0) super.extra("intentDataMain", intentDataMain);
        }

        public h0 b(IntentDateBean intentDateBean) {
            return (h0) super.extra("intentdate", intentDateBean);
        }

        public h0 c(boolean z4) {
            return (h0) super.extra(ShareWebActivity_.f37694m2, z4);
        }

        @Override // org.androidannotations.api.builder.a, org.androidannotations.api.builder.b
        public org.androidannotations.api.builder.f startForResult(int i4) {
            Fragment fragment = this.f37722a;
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

        public h0(Fragment fragment) {
            super(fragment.getActivity(), ShareWebActivity_.class);
            this.f37722a = fragment;
        }
    }

    /* loaded from: classes4.dex */
    class i implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f37723b;

        i(boolean z4) {
            this.f37723b = z4;
        }

        @Override // java.lang.Runnable
        public void run() {
            ShareWebActivity_.super.s1(this.f37723b);
        }
    }

    /* loaded from: classes4.dex */
    class j implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f37725b;

        j(String str) {
            this.f37725b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            ShareWebActivity_.super.b1(this.f37725b);
        }
    }

    /* loaded from: classes4.dex */
    class k extends BroadcastReceiver {
        k() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            ShareWebActivity_.this.f1(intent);
        }
    }

    /* loaded from: classes4.dex */
    class l implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ SocketError f37728b;

        l(SocketError socketError) {
            this.f37728b = socketError;
        }

        @Override // java.lang.Runnable
        public void run() {
            ShareWebActivity_.super.z1(this.f37728b);
        }
    }

    /* loaded from: classes4.dex */
    class m implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ GameRoom f37730b;

        m(GameRoom gameRoom) {
            this.f37730b = gameRoom;
        }

        @Override // java.lang.Runnable
        public void run() {
            ShareWebActivity_.super.p1(this.f37730b);
        }
    }

    /* loaded from: classes4.dex */
    class n implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ GameRoom f37732b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f37733c;

        n(GameRoom gameRoom, String str) {
            this.f37732b = gameRoom;
            this.f37733c = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            ShareWebActivity_.super.a1(this.f37732b, this.f37733c);
        }
    }

    /* loaded from: classes4.dex */
    class o implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ GameRoom f37735b;

        o(GameRoom gameRoom) {
            this.f37735b = gameRoom;
        }

        @Override // java.lang.Runnable
        public void run() {
            ShareWebActivity_.super.I1(this.f37735b);
        }
    }

    /* loaded from: classes4.dex */
    class p implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ArenaResponse f37737b;

        p(ArenaResponse arenaResponse) {
            this.f37737b = arenaResponse;
        }

        @Override // java.lang.Runnable
        public void run() {
            ShareWebActivity_.super.handleFailure(this.f37737b);
        }
    }

    /* loaded from: classes4.dex */
    class q implements Runnable {
        q() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ShareWebActivity_.super.K1();
        }
    }

    /* loaded from: classes4.dex */
    class r implements Runnable {
        r() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ShareWebActivity_.super.dismissLoadingDialog();
        }
    }

    /* loaded from: classes4.dex */
    class s implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CreateVipData f37741b;

        s(CreateVipData createVipData) {
            this.f37741b = createVipData;
        }

        @Override // java.lang.Runnable
        public void run() {
            ShareWebActivity_.super.Q1(this.f37741b);
        }
    }

    /* loaded from: classes4.dex */
    class t implements Runnable {
        t() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ShareWebActivity_.super.Z0();
        }
    }

    /* loaded from: classes4.dex */
    class u extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f37744b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f37745c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f37746d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        u(String str, long j4, String str2, String str3, String str4, int i4) {
            super(str, j4, str2);
            this.f37744b = str3;
            this.f37745c = str4;
            this.f37746d = i4;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                ShareWebActivity_.super.h1(this.f37744b, this.f37745c, this.f37746d);
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
            ShareWebActivity_.this.D1();
        }
    }

    /* loaded from: classes4.dex */
    class w extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f37749b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f37750c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f37751d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        w(String str, long j4, String str2, int i4, String str3, String str4) {
            super(str, j4, str2);
            this.f37749b = i4;
            this.f37750c = str3;
            this.f37751d = str4;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                ShareWebActivity_.super.k1(this.f37749b, this.f37750c, this.f37751d);
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
                ShareWebActivity_.super.l1();
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
                ShareWebActivity_.super.checkToken();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class z extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f37755b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        z(String str, long j4, String str2, int i4) {
            super(str, j4, str2);
            this.f37755b = i4;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                ShareWebActivity_.super.Y0(this.f37755b);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    private void init_(Bundle bundle) {
        this.K = new PrefDef_(this);
        a4.c.b(this);
        this.Z = AccountUtil_.getInstance_(this);
        injectExtras_();
        this.f37697i2.addAction(o1.a.f72001g0);
        registerReceiver(this.f37698j2, this.f37697i2);
    }

    private void injectExtras_() {
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            if (extras.containsKey("intentdate")) {
                this.D = (IntentDateBean) extras.getSerializable("intentdate");
            }
            if (extras.containsKey("intentDataMain")) {
                this.E = (IntentDataMain) extras.getSerializable("intentDataMain");
            }
            if (extras.containsKey(f37694m2)) {
                this.F = extras.getBoolean(f37694m2);
            }
        }
    }

    public static h0 t2(Context context) {
        return new h0(context);
    }

    public static h0 u2(Fragment fragment) {
        return new h0(fragment);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ShareWebActivity
    public void G1(DomainInfoBean domainInfoBean, String str) {
        org.androidannotations.api.b.e("", new g(domainInfoBean, str), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ShareWebActivity
    public void I1(GameRoom gameRoom) {
        org.androidannotations.api.b.e("", new o(gameRoom), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ShareWebActivity
    public void K1() {
        org.androidannotations.api.b.e("", new q(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ShareWebActivity
    public void L1() {
        org.androidannotations.api.b.e("", new c(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ShareWebActivity
    public void N1(DetailResultBean detailResultBean) {
        org.androidannotations.api.b.e("", new f(detailResultBean), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ShareWebActivity
    public void Q1(CreateVipData createVipData) {
        org.androidannotations.api.b.e("", new s(createVipData), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ShareWebActivity
    public void Y0(int i4) {
        org.androidannotations.api.a.l(new z("", 0L, "", i4));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ShareWebActivity
    public void Z0() {
        org.androidannotations.api.b.e("", new t(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ShareWebActivity
    public void a1(GameRoom gameRoom, String str) {
        org.androidannotations.api.b.e("", new n(gameRoom, str), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ShareWebActivity
    public void b1(String str) {
        org.androidannotations.api.b.e("", new j(str), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ShareWebActivity
    public void c1(String str, IntentDateBean intentDateBean) {
        org.androidannotations.api.b.e("", new g0(str, intentDateBean), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ShareWebActivity
    public void checkToken() {
        org.androidannotations.api.a.l(new y("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ShareWebActivity
    public void dismissLoadingDialog() {
        org.androidannotations.api.b.e("", new r(), 0L);
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.f37696h2.get(cls);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ShareWebActivity
    public void h1(String str, String str2, int i4) {
        org.androidannotations.api.a.l(new u("", 0L, "", str, str2, i4));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ShareWebActivity
    public void handleFailure(ArenaResponse arenaResponse) {
        org.androidannotations.api.b.e("", new p(arenaResponse), 0L);
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        return (T) findViewById(i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ShareWebActivity
    public void k1(int i4, String str, String str2) {
        org.androidannotations.api.a.l(new w("", 0L, "", i4, str, str2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ShareWebActivity
    public void l1() {
        org.androidannotations.api.a.l(new x("", 0L, ""));
    }

    @Override // com.join.mgps.activity.ShareWebActivity, com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.f37695g2);
        init_(bundle);
        super.onCreate(bundle);
        a4.c.c(c5);
        setContentView(R.layout.share_activity_layout);
    }

    @Override // com.join.mgps.activity.ShareWebActivity, com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        unregisterReceiver(this.f37698j2);
        super.onDestroy();
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f37517e = (LinearLayout) aVar.internalFindViewById(R.id.loding_layout);
        this.f37518f = (LinearLayout) aVar.internalFindViewById(R.id.loding_faile);
        this.f37519g = (RelativeLayout) aVar.internalFindViewById(R.id.title);
        this.f37520h = (TextView) aVar.internalFindViewById(R.id.title_textview);
        this.f37521i = (TextView) aVar.internalFindViewById(R.id.failedMessage);
        this.f37522j = (LinearLayout) aVar.internalFindViewById(R.id.layout_share);
        this.f37523k = (FrameLayout) aVar.internalFindViewById(R.id.video_view);
        this.f37524l = (RelativeLayout) aVar.internalFindViewById(R.id.weblayout);
        this.f37525m = (LJWebView) aVar.internalFindViewById(R.id.web);
        this.f37526n = (ImageView) aVar.internalFindViewById(R.id.refresh);
        this.f37527o = (ImageView) aVar.internalFindViewById(R.id.search);
        this.f37528p = (ImageView) aVar.internalFindViewById(R.id.backNew);
        this.f37531q = (ImageView) aVar.internalFindViewById(R.id.back_imag);
        this.f37532r = (ImageView) aVar.internalFindViewById(R.id.download);
        View internalFindViewById = aVar.internalFindViewById(R.id.setNetwork);
        ImageView imageView = this.f37526n;
        if (imageView != null) {
            imageView.setOnClickListener(new v());
        }
        LinearLayout linearLayout = this.f37518f;
        if (linearLayout != null) {
            linearLayout.setOnClickListener(new a0());
        }
        ImageView imageView2 = this.f37531q;
        if (imageView2 != null) {
            imageView2.setOnClickListener(new b0());
        }
        ImageView imageView3 = this.f37528p;
        if (imageView3 != null) {
            imageView3.setOnClickListener(new c0());
        }
        if (internalFindViewById != null) {
            internalFindViewById.setOnClickListener(new d0());
        }
        ImageView imageView4 = this.f37527o;
        if (imageView4 != null) {
            imageView4.setOnClickListener(new e0());
        }
        ImageView imageView5 = this.f37532r;
        if (imageView5 != null) {
            imageView5.setOnClickListener(new f0());
        }
        this.f37533s = this.f37523k;
        afterview();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ShareWebActivity
    public void p1(GameRoom gameRoom) {
        org.androidannotations.api.b.e("", new m(gameRoom), 0L);
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.f37696h2.put(cls, t4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ShareWebActivity
    public void s1(boolean z4) {
        org.androidannotations.api.b.e("", new i(z4), 0L);
    }

    @Override // com.BaseFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i4) {
        super.setContentView(i4);
        this.f37695g2.a(this);
    }

    @Override // android.app.Activity
    public void setIntent(Intent intent) {
        super.setIntent(intent);
        injectExtras_();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ShareWebActivity
    public void showLoding() {
        org.androidannotations.api.b.e("", new a(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ShareWebActivity
    public void showLodingFailed() {
        org.androidannotations.api.b.e("", new b(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ShareWebActivity
    public void showTost(String str) {
        org.androidannotations.api.b.e("", new d(str), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ShareWebActivity
    public void startDown(DetailResultBean detailResultBean) {
        org.androidannotations.api.b.e("", new e(detailResultBean), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ShareWebActivity
    public void w1(String str) {
        org.androidannotations.api.b.e("", new h(str), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ShareWebActivity
    public void z1(SocketError socketError) {
        org.androidannotations.api.b.e("", new l(socketError), 0L);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        this.f37695g2.a(this);
    }

    @Override // com.BaseFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        super.setContentView(view);
        this.f37695g2.a(this);
    }
}
