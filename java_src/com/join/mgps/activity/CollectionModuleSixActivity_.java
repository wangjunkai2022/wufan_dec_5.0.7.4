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
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.business.CollectionBeanSubBusiness;
import com.join.mgps.customview.CustomerDownloadView;
import com.join.mgps.customview.XListView2;
import com.join.mgps.dto.CollectionBeanSub;
import com.join.mgps.dto.ExtBean;
import com.join.mgps.ptr.PtrClassicFrameLayout;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.androidannotations.api.a;
/* loaded from: classes4.dex */
public final class CollectionModuleSixActivity_ extends CollectionModuleSixActivity implements y3.a, a4.a, a4.b {
    public static final String A1 = "extBean";

    /* renamed from: v1  reason: collision with root package name */
    public static final String f29194v1 = "collection_id";
    private final a4.c Y = new a4.c();
    private final Map<Class<?>, Object> Z = new HashMap();

    /* renamed from: p0  reason: collision with root package name */
    private final IntentFilter f29195p0 = new IntentFilter();

    /* renamed from: p1  reason: collision with root package name */
    private final BroadcastReceiver f29196p1 = new k();

    /* loaded from: classes4.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CollectionModuleSixActivity_.this.l0();
        }
    }

    /* loaded from: classes4.dex */
    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CollectionModuleSixActivity_.this.k0();
        }
    }

    /* loaded from: classes4.dex */
    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            CollectionModuleSixActivity_.super.showLoding();
        }
    }

    /* loaded from: classes4.dex */
    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            CollectionModuleSixActivity_.super.showLodingFailed();
        }
    }

    /* loaded from: classes4.dex */
    class e implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f29201b;

        e(List list) {
            this.f29201b = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            CollectionModuleSixActivity_.super.s0(this.f29201b);
        }
    }

    /* loaded from: classes4.dex */
    class f implements Runnable {
        f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            CollectionModuleSixActivity_.super.y0();
        }
    }

    /* loaded from: classes4.dex */
    class g implements Runnable {
        g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            CollectionModuleSixActivity_.super.q0();
        }
    }

    /* loaded from: classes4.dex */
    class h implements Runnable {
        h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            CollectionModuleSixActivity_.super.serverConnectionException();
        }
    }

    /* loaded from: classes4.dex */
    class i implements Runnable {
        i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            CollectionModuleSixActivity_.super.p0();
        }
    }

    /* loaded from: classes4.dex */
    class j implements Runnable {
        j() {
        }

        @Override // java.lang.Runnable
        public void run() {
            CollectionModuleSixActivity_.super.updateDownloadView();
        }
    }

    /* loaded from: classes4.dex */
    class k extends BroadcastReceiver {

        /* renamed from: b  reason: collision with root package name */
        public static final String f29208b = "gameData";

        k() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            CollectionModuleSixActivity_.this.r0((CollectionBeanSub) (intent.getExtras() != null ? intent.getExtras() : new Bundle()).getSerializable("gameData"));
        }
    }

    /* loaded from: classes4.dex */
    class l implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f29210b;

        l(int i4) {
            this.f29210b = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            CollectionModuleSixActivity_.super.updateDownloadingPoint(this.f29210b);
        }
    }

    /* loaded from: classes4.dex */
    class m implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f29212b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f29213c;

        m(int i4, int i5) {
            this.f29212b = i4;
            this.f29213c = i5;
        }

        @Override // java.lang.Runnable
        public void run() {
            CollectionModuleSixActivity_.super.t0(this.f29212b, this.f29213c);
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
                CollectionModuleSixActivity_.super.m0();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
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
                CollectionModuleSixActivity_.super.getDownloadTaskInfo();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class p implements View.OnClickListener {
        p() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CollectionModuleSixActivity_.this.o0();
        }
    }

    /* loaded from: classes4.dex */
    class q implements View.OnClickListener {
        q() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CollectionModuleSixActivity_.this.relodingimag();
        }
    }

    /* loaded from: classes4.dex */
    class r implements View.OnClickListener {
        r() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CollectionModuleSixActivity_.this.setNetwork();
        }
    }

    /* loaded from: classes4.dex */
    class s implements View.OnClickListener {
        s() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CollectionModuleSixActivity_.this.back_image();
        }
    }

    /* loaded from: classes4.dex */
    class t implements View.OnClickListener {
        t() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CollectionModuleSixActivity_.this.j0();
        }
    }

    /* loaded from: classes4.dex */
    class u implements View.OnClickListener {
        u() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CollectionModuleSixActivity_.this.v0();
        }
    }

    /* loaded from: classes4.dex */
    class v implements View.OnClickListener {
        v() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CollectionModuleSixActivity_.this.w0();
        }
    }

    /* loaded from: classes4.dex */
    class w implements View.OnClickListener {
        w() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CollectionModuleSixActivity_.this.u0();
        }
    }

    /* loaded from: classes4.dex */
    public static class x extends org.androidannotations.api.builder.a<x> {

        /* renamed from: a  reason: collision with root package name */
        private Fragment f29225a;

        public x(Context context) {
            super(context, CollectionModuleSixActivity_.class);
        }

        public x a(String str) {
            return (x) super.extra("collection_id", str);
        }

        public x b(ExtBean extBean) {
            return (x) super.extra("extBean", extBean);
        }

        @Override // org.androidannotations.api.builder.a, org.androidannotations.api.builder.b
        public org.androidannotations.api.builder.f startForResult(int i4) {
            Fragment fragment = this.f29225a;
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

        public x(Fragment fragment) {
            super(fragment.getActivity(), CollectionModuleSixActivity_.class);
            this.f29225a = fragment;
        }
    }

    public static x L0(Context context) {
        return new x(context);
    }

    public static x M0(Fragment fragment) {
        return new x(fragment);
    }

    private void init_(Bundle bundle) {
        Resources resources = getResources();
        a4.c.b(this);
        this.A = resources.getString(R.string.net_excption);
        this.B = resources.getString(R.string.connect_server_excption);
        injectExtras_();
        this.f29195p0.addAction(o1.a.I);
        this.f29195p0.addAction(o1.a.G);
        registerReceiver(this.f29196p1, this.f29195p0);
    }

    private void injectExtras_() {
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            if (extras.containsKey("collection_id")) {
                this.E = extras.getString("collection_id");
            }
            if (extras.containsKey("extBean")) {
                this.F = (ExtBean) extras.getSerializable("extBean");
            }
        }
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.Z.get(cls);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.CollectionModuleSixActivity
    public void getDownloadTaskInfo() {
        org.androidannotations.api.a.l(new o("", 0L, ""));
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        return (T) findViewById(i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.CollectionModuleSixActivity
    public void m0() {
        org.androidannotations.api.a.l(new n("", 0L, ""));
    }

    @Override // com.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.Y);
        init_(bundle);
        super.onCreate(bundle);
        a4.c.c(c5);
        setContentView(R.layout.activity_collection_module_six);
    }

    @Override // com.join.mgps.activity.CollectionModuleSixActivity, com.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        unregisterReceiver(this.f29196p1);
        super.onDestroy();
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f29166c = (PtrClassicFrameLayout) aVar.internalFindViewById(R.id.mPtrFrame);
        this.f29167d = (XListView2) aVar.internalFindViewById(R.id.breakListView);
        this.f29168e = (TextView) aVar.internalFindViewById(R.id.title_textview);
        this.f29169f = (LinearLayout) aVar.internalFindViewById(R.id.loding_layout);
        this.f29170g = (LinearLayout) aVar.internalFindViewById(R.id.loding_faile);
        this.f29171h = (ImageView) aVar.internalFindViewById(R.id.relodingimag);
        this.f29172i = (ImageView) aVar.internalFindViewById(R.id.back_image);
        this.f29173j = (ImageView) aVar.internalFindViewById(R.id.back_image_rl);
        this.f29174k = (RelativeLayout) aVar.internalFindViewById(R.id.module_six_rl);
        this.f29175l = (RelativeLayout) aVar.internalFindViewById(R.id.moduleSixTitleRl);
        this.f29176m = (RelativeLayout) aVar.internalFindViewById(R.id.title_bar_layout);
        this.f29177n = (ImageView) aVar.internalFindViewById(R.id.title_normal_search_img);
        this.f29178o = (ImageView) aVar.internalFindViewById(R.id.title_normal_search_img_rl);
        this.f29179p = (CustomerDownloadView) aVar.internalFindViewById(R.id.title_normal_download_cdv);
        this.f29180q = (RelativeLayout) aVar.internalFindViewById(R.id.downLayout);
        this.f29181r = (TextView) aVar.internalFindViewById(R.id.biground);
        this.U = (ImageView) aVar.internalFindViewById(R.id.imageLoading);
        this.V = (ImageView) aVar.internalFindViewById(R.id.downloadLine);
        View internalFindViewById = aVar.internalFindViewById(R.id.setNetwork);
        View internalFindViewById2 = aVar.internalFindViewById(R.id.comment);
        LinearLayout linearLayout = this.f29170g;
        if (linearLayout != null) {
            linearLayout.setOnClickListener(new p());
        }
        ImageView imageView = this.f29171h;
        if (imageView != null) {
            imageView.setOnClickListener(new q());
        }
        if (internalFindViewById != null) {
            internalFindViewById.setOnClickListener(new r());
        }
        ImageView imageView2 = this.f29172i;
        if (imageView2 != null) {
            imageView2.setOnClickListener(new s());
        }
        ImageView imageView3 = this.f29173j;
        if (imageView3 != null) {
            imageView3.setOnClickListener(new t());
        }
        ImageView imageView4 = this.f29177n;
        if (imageView4 != null) {
            imageView4.setOnClickListener(new u());
        }
        ImageView imageView5 = this.f29178o;
        if (imageView5 != null) {
            imageView5.setOnClickListener(new v());
        }
        CustomerDownloadView customerDownloadView = this.f29179p;
        if (customerDownloadView != null) {
            customerDownloadView.setOnClickListener(new w());
        }
        RelativeLayout relativeLayout = this.f29180q;
        if (relativeLayout != null) {
            relativeLayout.setOnClickListener(new a());
        }
        if (internalFindViewById2 != null) {
            internalFindViewById2.setOnClickListener(new b());
        }
        afterViews();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.CollectionModuleSixActivity
    public void p0() {
        org.androidannotations.api.b.e("", new i(), 0L);
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.Z.put(cls, t4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.CollectionModuleSixActivity
    public void q0() {
        org.androidannotations.api.b.e("", new g(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.CollectionModuleSixActivity
    public void s0(List<CollectionBeanSubBusiness> list) {
        org.androidannotations.api.b.e("", new e(list), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.CollectionModuleSixActivity
    public void serverConnectionException() {
        org.androidannotations.api.b.e("", new h(), 0L);
    }

    @Override // com.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
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
    @Override // com.join.mgps.activity.CollectionModuleSixActivity
    public void showLoding() {
        org.androidannotations.api.b.e("", new c(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.CollectionModuleSixActivity
    public void showLodingFailed() {
        org.androidannotations.api.b.e("", new d(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.CollectionModuleSixActivity
    public void t0(int i4, int i5) {
        org.androidannotations.api.b.e("", new m(i4, i5), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.CollectionModuleSixActivity
    public void updateDownloadView() {
        org.androidannotations.api.b.e("", new j(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.CollectionModuleSixActivity
    public void updateDownloadingPoint(int i4) {
        org.androidannotations.api.b.e("", new l(i4), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.CollectionModuleSixActivity
    public void y0() {
        org.androidannotations.api.b.e("", new f(), 0L);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        this.Y.a(this);
    }

    @Override // com.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        super.setContentView(view);
        this.Y.a(this);
    }
}
