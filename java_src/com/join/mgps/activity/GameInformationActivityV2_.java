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
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.CustomerDownloadView;
import com.join.mgps.dto.CollectionBeanSub;
import com.join.mgps.dto.ExtBean;
import com.join.mgps.dto.GameInformationBean;
import com.join.mgps.dto.InformationCommentBeanV2;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.androidannotations.api.a;
/* loaded from: classes4.dex */
public final class GameInformationActivityV2_ extends GameInformationActivityV2 implements y3.a, a4.a, a4.b {
    public static final String A1 = "title";
    public static final String B1 = "extBean";
    public static final String C1 = "defaultDown";

    /* renamed from: v1  reason: collision with root package name */
    public static final String f32231v1 = "info_id";
    private final a4.c Y = new a4.c();
    private final Map<Class<?>, Object> Z = new HashMap();

    /* renamed from: p0  reason: collision with root package name */
    private final IntentFilter f32232p0 = new IntentFilter();

    /* renamed from: p1  reason: collision with root package name */
    private final BroadcastReceiver f32233p1 = new k();

    /* loaded from: classes4.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GameInformationActivityV2_.super.G0();
        }
    }

    /* loaded from: classes4.dex */
    class b implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f32235b;

        b(List list) {
            this.f32235b = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            GameInformationActivityV2_.super.Q0(this.f32235b);
        }
    }

    /* loaded from: classes4.dex */
    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GameInformationActivityV2_.super.V0();
        }
    }

    /* loaded from: classes4.dex */
    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GameInformationActivityV2_.super.showLoding();
        }
    }

    /* loaded from: classes4.dex */
    class e implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ImageView f32239b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ TextView f32240c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f32241d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f32242e;

        e(ImageView imageView, TextView textView, boolean z4, String str) {
            this.f32239b = imageView;
            this.f32240c = textView;
            this.f32241d = z4;
            this.f32242e = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            GameInformationActivityV2_.super.X0(this.f32239b, this.f32240c, this.f32241d, this.f32242e);
        }
    }

    /* loaded from: classes4.dex */
    class f implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f32244b;

        f(String str) {
            this.f32244b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            GameInformationActivityV2_.super.showToast(this.f32244b);
        }
    }

    /* loaded from: classes4.dex */
    class g implements Runnable {
        g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GameInformationActivityV2_.super.showLodingFailed();
        }
    }

    /* loaded from: classes4.dex */
    class h implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ GameInformationBean f32247b;

        h(GameInformationBean gameInformationBean) {
            this.f32247b = gameInformationBean;
        }

        @Override // java.lang.Runnable
        public void run() {
            GameInformationActivityV2_.super.R0(this.f32247b);
        }
    }

    /* loaded from: classes4.dex */
    class i implements Runnable {
        i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GameInformationActivityV2_.super.P0();
        }
    }

    /* loaded from: classes4.dex */
    class j implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f32250b;

        j(String str) {
            this.f32250b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            GameInformationActivityV2_.super.showMessage(this.f32250b);
        }
    }

    /* loaded from: classes4.dex */
    class k extends BroadcastReceiver {

        /* renamed from: b  reason: collision with root package name */
        public static final String f32252b = "gameData";

        k() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            GameInformationActivityV2_.this.H0((CollectionBeanSub) (intent.getExtras() != null ? intent.getExtras() : new Bundle()).getSerializable("gameData"));
        }
    }

    /* loaded from: classes4.dex */
    class l implements Runnable {
        l() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GameInformationActivityV2_.super.updateDownloadView();
        }
    }

    /* loaded from: classes4.dex */
    class m extends a.c {
        m(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                GameInformationActivityV2_.super.B0();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class n extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f32256b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(String str, long j4, String str2, String str3) {
            super(str, j4, str2);
            this.f32256b = str3;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                GameInformationActivityV2_.super.y0(this.f32256b);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class o extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ InformationCommentBeanV2 f32258b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ImageView f32259c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ TextView f32260d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(String str, long j4, String str2, InformationCommentBeanV2 informationCommentBeanV2, ImageView imageView, TextView textView) {
            super(str, j4, str2);
            this.f32258b = informationCommentBeanV2;
            this.f32259c = imageView;
            this.f32260d = textView;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                GameInformationActivityV2_.super.J0(this.f32258b, this.f32259c, this.f32260d);
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
                GameInformationActivityV2_.super.getDownloadTaskInfo();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class q implements View.OnClickListener {
        q() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GameInformationActivityV2_.this.r0();
        }
    }

    /* loaded from: classes4.dex */
    class r implements View.OnClickListener {
        r() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GameInformationActivityV2_.this.q0();
        }
    }

    /* loaded from: classes4.dex */
    class s implements View.OnClickListener {
        s() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GameInformationActivityV2_.this.E0();
        }
    }

    /* loaded from: classes4.dex */
    class t implements View.OnClickListener {
        t() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GameInformationActivityV2_.this.t0();
        }
    }

    /* loaded from: classes4.dex */
    class u implements View.OnClickListener {
        u() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GameInformationActivityV2_.this.w0();
        }
    }

    /* loaded from: classes4.dex */
    class v implements View.OnClickListener {
        v() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GameInformationActivityV2_.this.relodingimag();
        }
    }

    /* loaded from: classes4.dex */
    class w implements View.OnClickListener {
        w() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GameInformationActivityV2_.this.setNetwork();
        }
    }

    /* loaded from: classes4.dex */
    class x implements View.OnClickListener {
        x() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GameInformationActivityV2_.this.S0();
        }
    }

    /* loaded from: classes4.dex */
    public static class y extends org.androidannotations.api.builder.a<y> {

        /* renamed from: a  reason: collision with root package name */
        private Fragment f32271a;

        public y(Context context) {
            super(context, GameInformationActivityV2_.class);
        }

        public y a(boolean z4) {
            return (y) super.extra("defaultDown", z4);
        }

        public y b(ExtBean extBean) {
            return (y) super.extra("extBean", extBean);
        }

        public y c(String str) {
            return (y) super.extra("info_id", str);
        }

        public y d(String str) {
            return (y) super.extra("title", str);
        }

        @Override // org.androidannotations.api.builder.a, org.androidannotations.api.builder.b
        public org.androidannotations.api.builder.f startForResult(int i4) {
            Fragment fragment = this.f32271a;
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

        public y(Fragment fragment) {
            super(fragment.getActivity(), GameInformationActivityV2_.class);
            this.f32271a = fragment;
        }
    }

    private void init_(Bundle bundle) {
        Resources resources = getResources();
        a4.c.b(this);
        this.f32120c = resources.getString(R.string.net_excption);
        this.f32121d = resources.getString(R.string.connect_server_excption);
        injectExtras_();
        this.f32232p0.addAction(o1.a.I);
        this.f32232p0.addAction(o1.a.G);
        registerReceiver(this.f32233p1, this.f32232p0);
    }

    private void injectExtras_() {
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            if (extras.containsKey("info_id")) {
                this.f32137t = extras.getString("info_id");
            }
            if (extras.containsKey("title")) {
                this.f32138u = extras.getString("title");
            }
            if (extras.containsKey("extBean")) {
                this.f32139v = (ExtBean) extras.getSerializable("extBean");
            }
            if (extras.containsKey("defaultDown")) {
                this.f32140w = extras.getBoolean("defaultDown");
            }
        }
    }

    public static y n1(Context context) {
        return new y(context);
    }

    public static y o1(Fragment fragment) {
        return new y(fragment);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameInformationActivityV2
    public void B0() {
        org.androidannotations.api.a.l(new m("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameInformationActivityV2
    public void G0() {
        org.androidannotations.api.b.e("", new a(), 400L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameInformationActivityV2
    public void J0(InformationCommentBeanV2 informationCommentBeanV2, ImageView imageView, TextView textView) {
        org.androidannotations.api.a.l(new o("", 0L, "", informationCommentBeanV2, imageView, textView));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameInformationActivityV2
    public void P0() {
        org.androidannotations.api.b.e("", new i(), 400L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameInformationActivityV2
    public void Q0(List<InformationCommentBeanV2> list) {
        org.androidannotations.api.b.e("", new b(list), 400L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameInformationActivityV2
    public void R0(GameInformationBean gameInformationBean) {
        org.androidannotations.api.b.e("", new h(gameInformationBean), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameInformationActivityV2
    public void V0() {
        org.androidannotations.api.b.e("", new c(), 500L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameInformationActivityV2
    public void X0(ImageView imageView, TextView textView, boolean z4, String str) {
        org.androidannotations.api.b.e("", new e(imageView, textView, z4, str), 0L);
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.Z.get(cls);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameInformationActivityV2
    public void getDownloadTaskInfo() {
        org.androidannotations.api.a.l(new p("", 0L, ""));
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        return (T) findViewById(i4);
    }

    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.Y);
        init_(bundle);
        super.onCreate(bundle);
        a4.c.c(c5);
        setContentView(R.layout.game_information_layoutv2);
    }

    @Override // com.join.mgps.activity.GameInformationActivityV2, com.BaseActivity, com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        unregisterReceiver(this.f32233p1);
        super.onDestroy();
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f32122e = (TextView) aVar.internalFindViewById(R.id.titleText);
        this.f32123f = (RelativeLayout) aVar.internalFindViewById(R.id.applayout);
        this.f32124g = (RelativeLayout) aVar.internalFindViewById(R.id.relativeLayout);
        this.f32125h = (LinearLayout) aVar.internalFindViewById(R.id.loding_layout);
        this.f32126i = (LinearLayout) aVar.internalFindViewById(R.id.loding_faile);
        this.f32127j = (SimpleDraweeView) aVar.internalFindViewById(R.id.appIcon);
        this.f32128k = (SimpleDraweeView) aVar.internalFindViewById(R.id.usericonMe);
        this.f32129l = (TextView) aVar.internalFindViewById(R.id.appname);
        this.f32130m = (TextView) aVar.internalFindViewById(R.id.appsize);
        this.f32131n = (TextView) aVar.internalFindViewById(R.id.moneyText);
        this.f32132o = (TextView) aVar.internalFindViewById(R.id.moneyText2);
        this.f32133p = (Button) aVar.internalFindViewById(R.id.downloadImage);
        this.f32134q = (ImageView) aVar.internalFindViewById(R.id.shareImg);
        this.f32135r = (ImageView) aVar.internalFindViewById(R.id.comment);
        this.f32136s = (CustomerDownloadView) aVar.internalFindViewById(R.id.title_normal_download_cdv);
        this.B = (TextView) aVar.internalFindViewById(R.id.more);
        this.C = (LinearLayout) aVar.internalFindViewById(R.id.bottom_lay);
        this.D = (LinearLayout) aVar.internalFindViewById(R.id.layout_share);
        this.E = (TextView) aVar.internalFindViewById(R.id.roundMessage);
        this.F = (RecyclerView) aVar.internalFindViewById(R.id.recyclerView);
        View internalFindViewById = aVar.internalFindViewById(R.id.backImage);
        View internalFindViewById2 = aVar.internalFindViewById(R.id.relodingimag);
        View internalFindViewById3 = aVar.internalFindViewById(R.id.setNetwork);
        if (internalFindViewById != null) {
            internalFindViewById.setOnClickListener(new q());
        }
        RelativeLayout relativeLayout = this.f32123f;
        if (relativeLayout != null) {
            relativeLayout.setOnClickListener(new r());
        }
        LinearLayout linearLayout = this.D;
        if (linearLayout != null) {
            linearLayout.setOnClickListener(new s());
        }
        ImageView imageView = this.f32135r;
        if (imageView != null) {
            imageView.setOnClickListener(new t());
        }
        Button button = this.f32133p;
        if (button != null) {
            button.setOnClickListener(new u());
        }
        if (internalFindViewById2 != null) {
            internalFindViewById2.setOnClickListener(new v());
        }
        if (internalFindViewById3 != null) {
            internalFindViewById3.setOnClickListener(new w());
        }
        CustomerDownloadView customerDownloadView = this.f32136s;
        if (customerDownloadView != null) {
            customerDownloadView.setOnClickListener(new x());
        }
        afterview();
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.Z.put(cls, t4);
    }

    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i4) {
        super.setContentView(i4);
        this.Y.a(this);
    }

    @Override // android.app.Activity
    public void setIntent(Intent intent) {
        super.setIntent(intent);
        injectExtras_();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameInformationActivityV2
    public void showLoding() {
        org.androidannotations.api.b.e("", new d(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameInformationActivityV2
    public void showLodingFailed() {
        org.androidannotations.api.b.e("", new g(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameInformationActivityV2
    public void showMessage(String str) {
        org.androidannotations.api.b.e("", new j(str), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameInformationActivityV2
    public void showToast(String str) {
        org.androidannotations.api.b.e("", new f(str), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameInformationActivityV2
    public void updateDownloadView() {
        org.androidannotations.api.b.e("", new l(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameInformationActivityV2
    public void y0(String str) {
        org.androidannotations.api.a.l(new n("", 0L, "", str));
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        this.Y.a(this);
    }

    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        super.setContentView(view);
        this.Y.a(this);
    }
}
