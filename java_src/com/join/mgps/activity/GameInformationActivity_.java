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
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.Fragment;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.CustomerDownloadView;
import com.join.mgps.customview.ObservableWebView;
import com.join.mgps.customview.SmartScrollView;
import com.join.mgps.dto.CollectionBeanSub;
import com.join.mgps.dto.ExtBean;
import com.join.mgps.dto.GameInformationBean;
import com.join.mgps.dto.InformationCommentBean;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.androidannotations.api.a;
/* loaded from: classes4.dex */
public final class GameInformationActivity_ extends GameInformationActivity implements y3.a, a4.a, a4.b {
    public static final String J1 = "info_id";
    public static final String K1 = "title";
    public static final String L1 = "extBean";
    public static final String M1 = "defaultDown";
    private final a4.c F1 = new a4.c();
    private final Map<Class<?>, Object> G1 = new HashMap();
    private final IntentFilter H1 = new IntentFilter();
    private final BroadcastReceiver I1 = new k();

    /* loaded from: classes4.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GameInformationActivity_.this.D0();
        }
    }

    /* loaded from: classes4.dex */
    public static class a0 extends org.androidannotations.api.builder.a<a0> {

        /* renamed from: a  reason: collision with root package name */
        private Fragment f32273a;

        public a0(Context context) {
            super(context, GameInformationActivity_.class);
        }

        public a0 a(boolean z4) {
            return (a0) super.extra("defaultDown", z4);
        }

        public a0 b(ExtBean extBean) {
            return (a0) super.extra("extBean", extBean);
        }

        public a0 c(String str) {
            return (a0) super.extra("info_id", str);
        }

        public a0 d(String str) {
            return (a0) super.extra("title", str);
        }

        @Override // org.androidannotations.api.builder.a, org.androidannotations.api.builder.b
        public org.androidannotations.api.builder.f startForResult(int i4) {
            Fragment fragment = this.f32273a;
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

        public a0(Fragment fragment) {
            super(fragment.getActivity(), GameInformationActivity_.class);
            this.f32273a = fragment;
        }
    }

    /* loaded from: classes4.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GameInformationActivity_.super.w0();
        }
    }

    /* loaded from: classes4.dex */
    class c implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f32275b;

        c(List list) {
            this.f32275b = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            GameInformationActivity_.super.B0(this.f32275b);
        }
    }

    /* loaded from: classes4.dex */
    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GameInformationActivity_.super.G0();
        }
    }

    /* loaded from: classes4.dex */
    class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GameInformationActivity_.super.showLoding();
        }
    }

    /* loaded from: classes4.dex */
    class f implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ImageView f32279b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ TextView f32280c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f32281d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f32282e;

        f(ImageView imageView, TextView textView, boolean z4, String str) {
            this.f32279b = imageView;
            this.f32280c = textView;
            this.f32281d = z4;
            this.f32282e = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            GameInformationActivity_.super.I0(this.f32279b, this.f32280c, this.f32281d, this.f32282e);
        }
    }

    /* loaded from: classes4.dex */
    class g implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f32284b;

        g(String str) {
            this.f32284b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            GameInformationActivity_.super.showToast(this.f32284b);
        }
    }

    /* loaded from: classes4.dex */
    class h implements Runnable {
        h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GameInformationActivity_.super.showLodingFailed();
        }
    }

    /* loaded from: classes4.dex */
    class i implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ GameInformationBean f32287b;

        i(GameInformationBean gameInformationBean) {
            this.f32287b = gameInformationBean;
        }

        @Override // java.lang.Runnable
        public void run() {
            GameInformationActivity_.super.C0(this.f32287b);
        }
    }

    /* loaded from: classes4.dex */
    class j implements Runnable {
        j() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GameInformationActivity_.super.o0();
        }
    }

    /* loaded from: classes4.dex */
    class k extends BroadcastReceiver {

        /* renamed from: b  reason: collision with root package name */
        public static final String f32290b = "gameData";

        k() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            GameInformationActivity_.this.x0((CollectionBeanSub) (intent.getExtras() != null ? intent.getExtras() : new Bundle()).getSerializable("gameData"));
        }
    }

    /* loaded from: classes4.dex */
    class l implements Runnable {
        l() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GameInformationActivity_.super.A0();
        }
    }

    /* loaded from: classes4.dex */
    class m implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f32293b;

        m(String str) {
            this.f32293b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            GameInformationActivity_.super.showMessage(this.f32293b);
        }
    }

    /* loaded from: classes4.dex */
    class n implements Runnable {
        n() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GameInformationActivity_.super.updateDownloadView();
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
                GameInformationActivity_.super.t0();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class p extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f32297b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(String str, long j4, String str2, String str3) {
            super(str, j4, str2);
            this.f32297b = str3;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                GameInformationActivity_.super.s0(this.f32297b);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class q extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ InformationCommentBean f32299b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ImageView f32300c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ TextView f32301d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        q(String str, long j4, String str2, InformationCommentBean informationCommentBean, ImageView imageView, TextView textView) {
            super(str, j4, str2);
            this.f32299b = informationCommentBean;
            this.f32300c = imageView;
            this.f32301d = textView;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                GameInformationActivity_.super.y0(this.f32299b, this.f32300c, this.f32301d);
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
                GameInformationActivity_.super.getDownloadTaskInfo();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class s implements View.OnClickListener {
        s() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GameInformationActivity_.this.l0();
        }
    }

    /* loaded from: classes4.dex */
    class t implements View.OnClickListener {
        t() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GameInformationActivity_.this.k0();
        }
    }

    /* loaded from: classes4.dex */
    class u implements View.OnClickListener {
        u() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GameInformationActivity_.this.u0();
        }
    }

    /* loaded from: classes4.dex */
    class v implements View.OnClickListener {
        v() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GameInformationActivity_.this.n0();
        }
    }

    /* loaded from: classes4.dex */
    class w implements View.OnClickListener {
        w() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GameInformationActivity_.this.q0();
        }
    }

    /* loaded from: classes4.dex */
    class x implements View.OnClickListener {
        x() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GameInformationActivity_.this.m0();
        }
    }

    /* loaded from: classes4.dex */
    class y implements View.OnClickListener {
        y() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GameInformationActivity_.this.relodingimag();
        }
    }

    /* loaded from: classes4.dex */
    class z implements View.OnClickListener {
        z() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GameInformationActivity_.this.setNetwork();
        }
    }

    public static a0 Z0(Context context) {
        return new a0(context);
    }

    public static a0 a1(Fragment fragment) {
        return new a0(fragment);
    }

    private void init_(Bundle bundle) {
        Resources resources = getResources();
        a4.c.b(this);
        this.f32077c = resources.getString(R.string.net_excption);
        this.f32078d = resources.getString(R.string.connect_server_excption);
        injectExtras_();
        this.H1.addAction(o1.a.I);
        this.H1.addAction(o1.a.G);
        registerReceiver(this.I1, this.H1);
    }

    private void injectExtras_() {
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            if (extras.containsKey("info_id")) {
                this.D = extras.getString("info_id");
            }
            if (extras.containsKey("title")) {
                this.E = extras.getString("title");
            }
            if (extras.containsKey("extBean")) {
                this.F = (ExtBean) extras.getSerializable("extBean");
            }
            if (extras.containsKey("defaultDown")) {
                this.G = extras.getBoolean("defaultDown");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameInformationActivity
    public void A0() {
        org.androidannotations.api.b.e("", new l(), 1000L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameInformationActivity
    public void B0(List<InformationCommentBean> list) {
        org.androidannotations.api.b.e("", new c(list), 1000L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameInformationActivity
    public void C0(GameInformationBean gameInformationBean) {
        org.androidannotations.api.b.e("", new i(gameInformationBean), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameInformationActivity
    public void G0() {
        org.androidannotations.api.b.e("", new d(), 500L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameInformationActivity
    public void I0(ImageView imageView, TextView textView, boolean z4, String str) {
        org.androidannotations.api.b.e("", new f(imageView, textView, z4, str), 0L);
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.G1.get(cls);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameInformationActivity
    public void getDownloadTaskInfo() {
        org.androidannotations.api.a.l(new r("", 0L, ""));
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        return (T) findViewById(i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameInformationActivity
    public void o0() {
        org.androidannotations.api.b.e("", new j(), 2000L);
    }

    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.F1);
        init_(bundle);
        super.onCreate(bundle);
        a4.c.c(c5);
        setContentView(R.layout.game_information_layout);
    }

    @Override // com.join.mgps.activity.GameInformationActivity, com.BaseActivity, com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        unregisterReceiver(this.I1);
        super.onDestroy();
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f32079e = (TextView) aVar.internalFindViewById(R.id.titleText);
        this.f32080f = (SmartScrollView) aVar.internalFindViewById(R.id.scrollView);
        this.f32081g = (ObservableWebView) aVar.internalFindViewById(R.id.webView);
        this.f32082h = (RelativeLayout) aVar.internalFindViewById(R.id.applayout);
        this.f32083i = (RelativeLayout) aVar.internalFindViewById(R.id.gameCardLayout);
        this.f32084j = (RelativeLayout) aVar.internalFindViewById(R.id.relativeLayout);
        this.f32085k = (LinearLayout) aVar.internalFindViewById(R.id.loding_layout);
        this.f32086l = (LinearLayout) aVar.internalFindViewById(R.id.loding_faile);
        this.f32087m = (SimpleDraweeView) aVar.internalFindViewById(R.id.appIcon);
        this.f32088n = (SimpleDraweeView) aVar.internalFindViewById(R.id.cardIcon);
        this.f32089o = (TextView) aVar.internalFindViewById(R.id.textView69);
        this.f32090p = (TextView) aVar.internalFindViewById(R.id.appname);
        this.f32093q = (TextView) aVar.internalFindViewById(R.id.cardAppname);
        this.f32094r = (TextView) aVar.internalFindViewById(R.id.cardDownNumberText);
        this.f32095s = (TextView) aVar.internalFindViewById(R.id.cardAppSize);
        this.f32096t = (TextView) aVar.internalFindViewById(R.id.cardInfo);
        this.f32097u = (Button) aVar.internalFindViewById(R.id.cardDownButn);
        this.f32098v = (TextView) aVar.internalFindViewById(R.id.appsize);
        this.f32100w = (TextView) aVar.internalFindViewById(R.id.moneyText);
        this.f32101x = (TextView) aVar.internalFindViewById(R.id.moneyText2);
        this.f32102y = (Button) aVar.internalFindViewById(R.id.downloadImage);
        this.f32103z = (ImageView) aVar.internalFindViewById(R.id.shareImg);
        this.A = (ImageView) aVar.internalFindViewById(R.id.comment);
        this.B = (LinearLayout) aVar.internalFindViewById(R.id.main);
        this.C = (CustomerDownloadView) aVar.internalFindViewById(R.id.title_normal_download_cdv);
        this.L = (TextView) aVar.internalFindViewById(R.id.content_title);
        this.M = (TextView) aVar.internalFindViewById(R.id.contentName);
        this.N = (TextView) aVar.internalFindViewById(R.id.contentTime);
        this.O = (TextView) aVar.internalFindViewById(R.id.comment_number);
        this.P = (TextView) aVar.internalFindViewById(R.id.more);
        this.Q = (LinearLayout) aVar.internalFindViewById(R.id.game_information_comment_top);
        this.R = (LinearLayout) aVar.internalFindViewById(R.id.bottom_lay);
        this.S = (LinearLayout) aVar.internalFindViewById(R.id.layout_share);
        this.T = (TextView) aVar.internalFindViewById(R.id.roundMessage);
        View internalFindViewById = aVar.internalFindViewById(R.id.backImage);
        View internalFindViewById2 = aVar.internalFindViewById(R.id.relodingimag);
        View internalFindViewById3 = aVar.internalFindViewById(R.id.setNetwork);
        if (internalFindViewById != null) {
            internalFindViewById.setOnClickListener(new s());
        }
        RelativeLayout relativeLayout = this.f32082h;
        if (relativeLayout != null) {
            relativeLayout.setOnClickListener(new t());
        }
        LinearLayout linearLayout = this.S;
        if (linearLayout != null) {
            linearLayout.setOnClickListener(new u());
        }
        ImageView imageView = this.A;
        if (imageView != null) {
            imageView.setOnClickListener(new v());
        }
        Button button = this.f32102y;
        if (button != null) {
            button.setOnClickListener(new w());
        }
        Button button2 = this.f32097u;
        if (button2 != null) {
            button2.setOnClickListener(new x());
        }
        if (internalFindViewById2 != null) {
            internalFindViewById2.setOnClickListener(new y());
        }
        if (internalFindViewById3 != null) {
            internalFindViewById3.setOnClickListener(new z());
        }
        CustomerDownloadView customerDownloadView = this.C;
        if (customerDownloadView != null) {
            customerDownloadView.setOnClickListener(new a());
        }
        afterview();
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.G1.put(cls, t4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameInformationActivity
    public void s0(String str) {
        org.androidannotations.api.a.l(new p("", 0L, "", str));
    }

    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i4) {
        super.setContentView(i4);
        this.F1.a(this);
    }

    @Override // android.app.Activity
    public void setIntent(Intent intent) {
        super.setIntent(intent);
        injectExtras_();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameInformationActivity
    public void showLoding() {
        org.androidannotations.api.b.e("", new e(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameInformationActivity
    public void showLodingFailed() {
        org.androidannotations.api.b.e("", new h(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameInformationActivity
    public void showMessage(String str) {
        org.androidannotations.api.b.e("", new m(str), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameInformationActivity
    public void showToast(String str) {
        org.androidannotations.api.b.e("", new g(str), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameInformationActivity
    public void t0() {
        org.androidannotations.api.a.l(new o("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameInformationActivity
    public void updateDownloadView() {
        org.androidannotations.api.b.e("", new n(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameInformationActivity
    public void w0() {
        org.androidannotations.api.b.e("", new b(), 1000L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameInformationActivity
    public void y0(InformationCommentBean informationCommentBean, ImageView imageView, TextView textView) {
        org.androidannotations.api.a.l(new q("", 0L, "", informationCommentBean, imageView, textView));
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        this.F1.a(this);
    }

    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        super.setContentView(view);
        this.F1.a(this);
    }
}
