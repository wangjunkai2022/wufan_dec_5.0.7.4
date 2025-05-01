package com.join.mgps.activity;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;
import com.facebook.drawee.view.SimpleDraweeView;
import com.google.android.material.tabs.TabLayout;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.activity.search.SearchIndexData;
import com.join.mgps.customview.FlowLayout;
import com.join.mgps.customview.ForumLoadingView;
import com.join.mgps.customview.WrapContentGridView;
import com.join.mgps.dto.SScrollingTxtBeanV2;
import com.join.mgps.dto.SearchAutoDataBean;
import com.join.mgps.pref.PrefDef_;
import com.youth.banner.Banner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.androidannotations.api.a;
/* loaded from: classes4.dex */
public final class SearchHintActivity_ extends SearchHintActivity implements y3.a, a4.a, a4.b {
    public static final String Q1 = "keyword";
    public static final String R1 = "from";
    public static final String S1 = "keywords";
    public static final String T1 = "interval";
    private final a4.c M1 = new a4.c();
    private final Map<Class<?>, Object> N1 = new HashMap();
    private final IntentFilter O1 = new IntentFilter();
    private final BroadcastReceiver P1 = new k();

    /* loaded from: classes4.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SearchHintActivity_.super.a1();
        }
    }

    /* loaded from: classes4.dex */
    class a0 implements Runnable {
        a0() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SearchHintActivity_.super.l1();
        }
    }

    /* loaded from: classes4.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SearchHintActivity_.super.b1();
        }
    }

    /* loaded from: classes4.dex */
    public static class b0 extends org.androidannotations.api.builder.a<b0> {

        /* renamed from: a  reason: collision with root package name */
        private Fragment f37240a;

        public b0(Context context) {
            super(context, SearchHintActivity_.class);
        }

        public b0 a(int i4) {
            return (b0) super.extra("from", i4);
        }

        public b0 b(int i4) {
            return (b0) super.extra("interval", i4);
        }

        public b0 c(String str) {
            return (b0) super.extra("keyword", str);
        }

        public b0 d(ArrayList<SScrollingTxtBeanV2> arrayList) {
            return (b0) super.extra(SearchHintActivity_.S1, arrayList);
        }

        @Override // org.androidannotations.api.builder.a, org.androidannotations.api.builder.b
        public org.androidannotations.api.builder.f startForResult(int i4) {
            Fragment fragment = this.f37240a;
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

        public b0(Fragment fragment) {
            super(fragment.getActivity(), SearchHintActivity_.class);
            this.f37240a = fragment;
        }
    }

    /* loaded from: classes4.dex */
    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SearchHintActivity_.super.d1();
        }
    }

    /* loaded from: classes4.dex */
    class d implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f37242b;

        d(int i4) {
            this.f37242b = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            SearchHintActivity_.super.n0(this.f37242b);
        }
    }

    /* loaded from: classes4.dex */
    class e implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ SearchIndexData f37244b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f37245c;

        e(SearchIndexData searchIndexData, boolean z4) {
            this.f37244b = searchIndexData;
            this.f37245c = z4;
        }

        @Override // java.lang.Runnable
        public void run() {
            SearchHintActivity_.super.i1(this.f37244b, this.f37245c);
        }
    }

    /* loaded from: classes4.dex */
    class f implements Runnable {
        f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SearchHintActivity_.super.Q0();
        }
    }

    /* loaded from: classes4.dex */
    class g implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f37248b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f37249c;

        g(String str, int i4) {
            this.f37248b = str;
            this.f37249c = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            SearchHintActivity_.super.g1(this.f37248b, this.f37249c);
        }
    }

    /* loaded from: classes4.dex */
    class h implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f37251b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f37252c;

        h(List list, int i4) {
            this.f37251b = list;
            this.f37252c = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            SearchHintActivity_.super.k1(this.f37251b, this.f37252c);
        }
    }

    /* loaded from: classes4.dex */
    class i implements Runnable {
        i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SearchHintActivity_.super.serverConnectionException();
        }
    }

    /* loaded from: classes4.dex */
    class j implements Runnable {
        j() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SearchHintActivity_.super.P0();
        }
    }

    /* loaded from: classes4.dex */
    class k extends BroadcastReceiver {
        k() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            SearchHintActivity_.this.R0(intent);
        }
    }

    /* loaded from: classes4.dex */
    class l implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f37257b;

        l(int i4) {
            this.f37257b = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            SearchHintActivity_.super.m0(this.f37257b);
        }
    }

    /* loaded from: classes4.dex */
    class m extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f37259b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(String str, long j4, String str2, String str3) {
            super(str, j4, str2);
            this.f37259b = str3;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                SearchHintActivity_.super.Y0(this.f37259b);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
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
                SearchHintActivity_.super.L0();
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
                SearchHintActivity_.super.u0();
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
                SearchHintActivity_.super.p0();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class q extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f37264b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        q(String str, long j4, String str2, String str3) {
            super(str, j4, str2);
            this.f37264b = str3;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                SearchHintActivity_.super.t0(this.f37264b);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class r extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f37266b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f37267c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        r(String str, long j4, String str2, String str3, int i4) {
            super(str, j4, str2);
            this.f37266b = str3;
            this.f37267c = i4;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                SearchHintActivity_.super.A0(this.f37266b, this.f37267c);
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
                SearchHintActivity_.super.w0();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class t implements View.OnClickListener {
        t() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SearchHintActivity_.this.U0();
        }
    }

    /* loaded from: classes4.dex */
    class u implements View.OnClickListener {
        u() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SearchHintActivity_.this.G0();
        }
    }

    /* loaded from: classes4.dex */
    class v implements View.OnClickListener {
        v() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SearchHintActivity_.this.e1();
        }
    }

    /* loaded from: classes4.dex */
    class w implements View.OnClickListener {
        w() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SearchHintActivity_.this.F0();
        }
    }

    /* loaded from: classes4.dex */
    class x implements View.OnClickListener {
        x() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SearchHintActivity_.this.q0();
        }
    }

    /* loaded from: classes4.dex */
    class y implements TextView.OnEditorActionListener {
        y() {
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public boolean onEditorAction(TextView textView, int i4, KeyEvent keyEvent) {
            return SearchHintActivity_.this.V0(textView, i4, keyEvent);
        }
    }

    /* loaded from: classes4.dex */
    class z implements Runnable {
        z() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SearchHintActivity_.super.c1();
        }
    }

    public static b0 G1(Context context) {
        return new b0(context);
    }

    public static b0 H1(Fragment fragment) {
        return new b0(fragment);
    }

    private void init_(Bundle bundle) {
        Resources resources = getResources();
        this.f37161p1 = new PrefDef_(this);
        a4.c.b(this);
        this.Q = resources.getString(R.string.net_excption);
        this.R = resources.getString(R.string.connect_server_excption);
        injectExtras_();
        this.O1.addAction("com.broadcast.bespeak.sussess");
        registerReceiver(this.P1, this.O1);
    }

    private void injectExtras_() {
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            if (extras.containsKey("keyword")) {
                this.f37145b = extras.getString("keyword");
            }
            if (extras.containsKey("from")) {
                this.f37146c = extras.getInt("from");
            }
            if (extras.containsKey(S1)) {
                this.f37147d = (ArrayList) extras.getSerializable(S1);
            }
            if (extras.containsKey("interval")) {
                this.f37148e = extras.getInt("interval");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.SearchHintActivity
    public void A0(String str, int i4) {
        org.androidannotations.api.a.l(new r("", 0L, "", str, i4));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.SearchHintActivity
    public void L0() {
        org.androidannotations.api.a.l(new n("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.SearchHintActivity
    public void P0() {
        org.androidannotations.api.b.e("", new j(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.SearchHintActivity
    public void Q0() {
        org.androidannotations.api.b.e("", new f(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.SearchHintActivity
    public void Y0(String str) {
        org.androidannotations.api.a.l(new m("", 0L, "", str));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.SearchHintActivity
    public void a1() {
        org.androidannotations.api.b.e("", new a(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.SearchHintActivity
    public void b1() {
        org.androidannotations.api.b.e("", new b(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.SearchHintActivity
    public void c1() {
        org.androidannotations.api.b.e("", new z(), 300L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.SearchHintActivity
    public void d1() {
        org.androidannotations.api.b.e("", new c(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.SearchHintActivity
    public void g1(String str, int i4) {
        org.androidannotations.api.b.e("", new g(str, i4), 0L);
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.N1.get(cls);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.SearchHintActivity
    public void i1(SearchIndexData searchIndexData, boolean z4) {
        org.androidannotations.api.b.e("", new e(searchIndexData, z4), 0L);
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        return (T) findViewById(i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.SearchHintActivity
    public void k1(List<SearchAutoDataBean> list, int i4) {
        org.androidannotations.api.b.e("", new h(list, i4), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.SearchHintActivity
    public void l1() {
        org.androidannotations.api.b.e("", new a0(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.SearchHintActivity
    public void m0(int i4) {
        org.androidannotations.api.b.e("", new l(i4), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.SearchHintActivity
    public void n0(int i4) {
        org.androidannotations.api.b.e("", new d(i4), 0L);
    }

    @Override // com.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.M1);
        init_(bundle);
        super.onCreate(bundle);
        a4.c.c(c5);
        setContentView(R.layout.search_hint_activity);
    }

    @Override // com.join.mgps.activity.SearchHintActivity, com.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        unregisterReceiver(this.P1);
        super.onDestroy();
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f37149f = (ForumLoadingView) aVar.internalFindViewById(R.id.loadingView);
        this.f37150g = aVar.internalFindViewById(R.id.requestLayout);
        this.f37151h = (ViewPager2) aVar.internalFindViewById(R.id.vf);
        this.f37153j = (EditText) aVar.internalFindViewById(R.id.searchEditText);
        this.f37154k = (ImageView) aVar.internalFindViewById(R.id.img_search);
        this.f37155l = (ImageView) aVar.internalFindViewById(R.id.searchClear);
        this.f37156m = (ImageView) aVar.internalFindViewById(R.id.img_iconback);
        this.f37157n = (LinearLayout) aVar.internalFindViewById(R.id.clearLayout);
        this.f37158o = aVar.internalFindViewById(R.id.recommend);
        this.f37159p = (WrapContentGridView) aVar.internalFindViewById(R.id.wrapGridView);
        this.f37162q = (WrapContentGridView) aVar.internalFindViewById(R.id.gameListGrid);
        this.f37163r = (FlowLayout) aVar.internalFindViewById(R.id.flowLayout);
        this.f37164s = aVar.internalFindViewById(R.id.llHotSearch);
        this.f37165t = aVar.internalFindViewById(R.id.llHotTag);
        this.f37166u = aVar.internalFindViewById(R.id.llGameList);
        this.f37167v = aVar.internalFindViewById(R.id.llRecent);
        this.f37169w = (SimpleDraweeView) aVar.internalFindViewById(R.id.ad);
        this.f37170x = (Banner) aVar.internalFindViewById(R.id.banner);
        this.f37171y = (ViewPager) aVar.internalFindViewById(R.id.viewPager);
        this.f37172z = (TabLayout) aVar.internalFindViewById(R.id.tabLayout);
        this.A = (FlowLayout) aVar.internalFindViewById(R.id.historyFlow);
        this.B = (FlowLayout) aVar.internalFindViewById(R.id.guessLickFlow);
        this.C = aVar.internalFindViewById(R.id.guessliketext);
        this.D = aVar.internalFindViewById(R.id.search_bar_layout);
        this.E = (RelativeLayout) aVar.internalFindViewById(R.id.lLayout_search);
        this.F = (TextView) aVar.internalFindViewById(R.id.tv_search);
        this.G = (ListView) aVar.internalFindViewById(R.id.autoListView);
        this.H = aVar.internalFindViewById(R.id.statubar);
        View internalFindViewById = aVar.internalFindViewById(R.id.clearHistoryx);
        ImageView imageView = this.f37155l;
        if (imageView != null) {
            imageView.setOnClickListener(new t());
        }
        ImageView imageView2 = this.f37154k;
        if (imageView2 != null) {
            imageView2.setOnClickListener(new u());
        }
        TextView textView = this.F;
        if (textView != null) {
            textView.setOnClickListener(new v());
        }
        ImageView imageView3 = this.f37156m;
        if (imageView3 != null) {
            imageView3.setOnClickListener(new w());
        }
        if (internalFindViewById != null) {
            internalFindViewById.setOnClickListener(new x());
        }
        EditText editText = this.f37153j;
        if (editText != null) {
            editText.setOnEditorActionListener(new y());
        }
        afterViews();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.SearchHintActivity
    public void p0() {
        org.androidannotations.api.a.l(new p("", 0L, ""));
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.N1.put(cls, t4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.SearchHintActivity
    public void serverConnectionException() {
        org.androidannotations.api.b.e("", new i(), 0L);
    }

    @Override // com.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i4) {
        super.setContentView(i4);
        this.M1.a(this);
    }

    @Override // android.app.Activity
    public void setIntent(Intent intent) {
        super.setIntent(intent);
        injectExtras_();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.SearchHintActivity
    public void t0(String str) {
        org.androidannotations.api.a.l(new q("", 0L, "", str));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.SearchHintActivity
    public void u0() {
        org.androidannotations.api.a.l(new o("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.SearchHintActivity
    public void w0() {
        org.androidannotations.api.a.l(new s("", 0L, ""));
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        this.M1.a(this);
    }

    @Override // com.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        super.setContentView(view);
        this.M1.a(this);
    }
}
