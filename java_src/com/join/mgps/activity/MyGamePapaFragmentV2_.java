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
import android.widget.TextView;
import androidx.viewpager2.widget.ViewPager2;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.google.android.material.tabs.TabLayout;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.activity.recomend.GamedownRecomendItemBean;
import com.join.mgps.customview.WrapContentGridView;
import com.join.mgps.customview.XListView2;
import com.join.mgps.dto.OnlineCouponConfigBean;
import com.join.mgps.dto.SNKGameInfoBean;
import com.join.mgps.pref.PrefDef_;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.androidannotations.api.a;
/* loaded from: classes4.dex */
public final class MyGamePapaFragmentV2_ extends MyGamePapaFragmentV2 implements y3.a, a4.a, a4.b {
    private View E1;
    private final a4.c D1 = new a4.c();
    private final Map<Class<?>, Object> F1 = new HashMap();
    private final IntentFilter G1 = new IntentFilter();
    private final BroadcastReceiver H1 = new k();
    private final IntentFilter I1 = new IntentFilter();
    private final BroadcastReceiver J1 = new t();

    /* loaded from: classes4.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MyGamePapaFragmentV2_.this.C0();
        }
    }

    /* loaded from: classes4.dex */
    class a0 implements View.OnClickListener {
        a0() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MyGamePapaFragmentV2_.this.W0();
        }
    }

    /* loaded from: classes4.dex */
    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MyGamePapaFragmentV2_.this.y1();
        }
    }

    /* loaded from: classes4.dex */
    public static class b0 extends org.androidannotations.api.builder.d<b0, MyGamePapaFragmentV2> {
        @Override // org.androidannotations.api.builder.d
        /* renamed from: a */
        public MyGamePapaFragmentV2 build() {
            MyGamePapaFragmentV2_ myGamePapaFragmentV2_ = new MyGamePapaFragmentV2_();
            myGamePapaFragmentV2_.setArguments(this.args);
            return myGamePapaFragmentV2_;
        }
    }

    /* loaded from: classes4.dex */
    class c implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f35882b;

        c(String str) {
            this.f35882b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            MyGamePapaFragmentV2_.super.A1(this.f35882b);
        }
    }

    /* loaded from: classes4.dex */
    class d implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ HashMap f35884b;

        d(HashMap hashMap) {
            this.f35884b = hashMap;
        }

        @Override // java.lang.Runnable
        public void run() {
            MyGamePapaFragmentV2_.super.a1(this.f35884b);
        }
    }

    /* loaded from: classes4.dex */
    class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MyGamePapaFragmentV2_.super.C1();
        }
    }

    /* loaded from: classes4.dex */
    class f implements Runnable {
        f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MyGamePapaFragmentV2_.super.E1();
        }
    }

    /* loaded from: classes4.dex */
    class g implements Runnable {
        g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MyGamePapaFragmentV2_.super.Y0();
        }
    }

    /* loaded from: classes4.dex */
    class h implements Runnable {
        h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MyGamePapaFragmentV2_.super.J0();
        }
    }

    /* loaded from: classes4.dex */
    class i implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f35890b;

        i(String str) {
            this.f35890b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            MyGamePapaFragmentV2_.super.d1(this.f35890b);
        }
    }

    /* loaded from: classes4.dex */
    class j implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ SNKGameInfoBean f35892b;

        j(SNKGameInfoBean sNKGameInfoBean) {
            this.f35892b = sNKGameInfoBean;
        }

        @Override // java.lang.Runnable
        public void run() {
            MyGamePapaFragmentV2_.super.x1(this.f35892b);
        }
    }

    /* loaded from: classes4.dex */
    class k extends BroadcastReceiver {

        /* renamed from: b  reason: collision with root package name */
        public static final String f35894b = "gameId";

        k() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            MyGamePapaFragmentV2_.this.c1((intent.getExtras() != null ? intent.getExtras() : new Bundle()).getString("gameId"));
        }
    }

    /* loaded from: classes4.dex */
    class l implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DownloadTask f35896b;

        l(DownloadTask downloadTask) {
            this.f35896b = downloadTask;
        }

        @Override // java.lang.Runnable
        public void run() {
            MyGamePapaFragmentV2_.super.J1(this.f35896b);
        }
    }

    /* loaded from: classes4.dex */
    class m implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f35898b;

        m(List list) {
            this.f35898b = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            MyGamePapaFragmentV2_.super.B1(this.f35898b);
        }
    }

    /* loaded from: classes4.dex */
    class n implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ OnlineCouponConfigBean f35900b;

        n(OnlineCouponConfigBean onlineCouponConfigBean) {
            this.f35900b = onlineCouponConfigBean;
        }

        @Override // java.lang.Runnable
        public void run() {
            MyGamePapaFragmentV2_.super.w1(this.f35900b);
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
                MyGamePapaFragmentV2_.super.o1();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class p extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f35903b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(String str, long j4, String str2, List list) {
            super(str, j4, str2);
            this.f35903b = list;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                MyGamePapaFragmentV2_.super.p1(this.f35903b);
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
                MyGamePapaFragmentV2_.super.E0();
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
                MyGamePapaFragmentV2_.super.I0();
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
                MyGamePapaFragmentV2_.super.m1();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class t extends BroadcastReceiver {
        t() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            MyGamePapaFragmentV2_.this.l1();
        }
    }

    /* loaded from: classes4.dex */
    class u implements View.OnClickListener {
        u() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MyGamePapaFragmentV2_.this.setNetwork();
        }
    }

    /* loaded from: classes4.dex */
    class v implements View.OnClickListener {
        v() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MyGamePapaFragmentV2_.this.O0();
        }
    }

    /* loaded from: classes4.dex */
    class w implements View.OnClickListener {
        w() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MyGamePapaFragmentV2_.this.U0();
        }
    }

    /* loaded from: classes4.dex */
    class x implements View.OnClickListener {
        x() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MyGamePapaFragmentV2_.this.v0();
        }
    }

    /* loaded from: classes4.dex */
    class y implements View.OnClickListener {
        y() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MyGamePapaFragmentV2_.this.v1();
        }
    }

    /* loaded from: classes4.dex */
    class z implements View.OnClickListener {
        z() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MyGamePapaFragmentV2_.this.f1();
        }
    }

    public static b0 b2() {
        return new b0();
    }

    private void init_(Bundle bundle) {
        this.L = new PrefDef_(getActivity());
        a4.c.b(this);
        this.G1.addAction(o1.a.f72008k);
        this.I1.addAction(o1.a.I);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MyGamePapaFragmentV2
    public void A1(String str) {
        org.androidannotations.api.b.e("", new c(str), 500L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MyGamePapaFragmentV2
    public void B1(List<GamedownRecomendItemBean> list) {
        org.androidannotations.api.b.e("", new m(list), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MyGamePapaFragmentV2
    public void C1() {
        org.androidannotations.api.b.e("", new e(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MyGamePapaFragmentV2
    public void E0() {
        org.androidannotations.api.a.l(new q("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MyGamePapaFragmentV2
    public void E1() {
        org.androidannotations.api.b.e("", new f(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MyGamePapaFragmentV2
    public void I0() {
        org.androidannotations.api.a.l(new r("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MyGamePapaFragmentV2
    public void J0() {
        org.androidannotations.api.b.e("", new h(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MyGamePapaFragmentV2
    public void J1(DownloadTask downloadTask) {
        org.androidannotations.api.b.e("", new l(downloadTask), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MyGamePapaFragmentV2
    public void Y0() {
        org.androidannotations.api.b.e("", new g(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MyGamePapaFragmentV2
    public void a1(HashMap<String, Boolean> hashMap) {
        org.androidannotations.api.b.e("", new d(hashMap), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MyGamePapaFragmentV2
    public void d1(String str) {
        org.androidannotations.api.b.e("", new i(str), 100L);
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.F1.get(cls);
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        View view = this.E1;
        if (view == null) {
            return null;
        }
        return (T) view.findViewById(i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MyGamePapaFragmentV2
    public void m1() {
        org.androidannotations.api.a.l(new s("", 1000L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MyGamePapaFragmentV2
    public void o1() {
        org.androidannotations.api.a.l(new o("", 0L, ""));
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.D1);
        init_(bundle);
        super.onCreate(bundle);
        getActivity().registerReceiver(this.H1, this.G1);
        getActivity().registerReceiver(this.J1, this.I1);
        a4.c.c(c5);
    }

    @Override // com.join.mgps.basefragment.BaseLoadingFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        this.E1 = onCreateView;
        if (onCreateView == null) {
            this.E1 = layoutInflater.inflate(R.layout.fragment_my_game, viewGroup, false);
        }
        return this.E1;
    }

    @Override // com.join.mgps.activity.MyGamePapaFragmentV2, androidx.fragment.app.Fragment
    public void onDestroy() {
        getActivity().unregisterReceiver(this.H1);
        getActivity().unregisterReceiver(this.J1);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.E1 = null;
        this.f35830d = null;
        this.f35831e = null;
        this.f35832f = null;
        this.f35833g = null;
        this.f35834h = null;
        this.f35835i = null;
        this.f35836j = null;
        this.f35837k = null;
        this.f35838l = null;
        this.f35839m = null;
        this.f35840n = null;
        this.f35841o = null;
        this.f35842p = null;
        this.f35845q = null;
        this.f35846r = null;
        this.f35847s = null;
        this.f35848t = null;
        this.f35849u = null;
        this.f35850v = null;
        this.f35851w = null;
        this.f35852x = null;
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f35830d = aVar.internalFindViewById(R.id.appbar);
        this.f35831e = (XListView2) aVar.internalFindViewById(R.id.listView);
        this.f35832f = aVar.internalFindViewById(R.id.plugsDownloadTip);
        this.f35833g = (TextView) aVar.internalFindViewById(R.id.plugType);
        this.f35834h = (TextView) aVar.internalFindViewById(R.id.plugProgress);
        this.f35835i = aVar.internalFindViewById(R.id.filter);
        this.f35836j = aVar.internalFindViewById(R.id.noGame);
        this.f35837k = (TextView) aVar.internalFindViewById(R.id.filterArr);
        this.f35838l = (TextView) aVar.internalFindViewById(R.id.title);
        this.f35839m = (TextView) aVar.internalFindViewById(R.id.count);
        this.f35840n = aVar.internalFindViewById(R.id.root);
        this.f35841o = aVar.internalFindViewById(R.id.needUpdate);
        this.f35842p = aVar.internalFindViewById(R.id.search);
        this.f35845q = aVar.internalFindViewById(R.id.back);
        this.f35846r = aVar.internalFindViewById(R.id.statubar);
        this.f35847s = (WrapContentGridView) aVar.internalFindViewById(R.id.noGameList);
        this.f35848t = (LinearLayout) aVar.internalFindViewById(R.id.llOnlineCouponBottom);
        this.f35849u = (TextView) aVar.internalFindViewById(R.id.tvOnlineCouponBottomDesc);
        this.f35850v = (ImageView) aVar.internalFindViewById(R.id.ivOnlineCouponBottomClose);
        this.f35851w = (ViewPager2) aVar.internalFindViewById(R.id.vp);
        this.f35852x = (TabLayout) aVar.internalFindViewById(R.id.tabs);
        View internalFindViewById = aVar.internalFindViewById(R.id.setNetwork);
        View internalFindViewById2 = aVar.internalFindViewById(R.id.plugs);
        View internalFindViewById3 = aVar.internalFindViewById(R.id.settings);
        if (internalFindViewById != null) {
            internalFindViewById.setOnClickListener(new u());
        }
        ImageView imageView = this.f35850v;
        if (imageView != null) {
            imageView.setOnClickListener(new v());
        }
        LinearLayout linearLayout = this.f35848t;
        if (linearLayout != null) {
            linearLayout.setOnClickListener(new w());
        }
        View view = this.f35845q;
        if (view != null) {
            view.setOnClickListener(new x());
        }
        View view2 = this.f35842p;
        if (view2 != null) {
            view2.setOnClickListener(new y());
        }
        if (internalFindViewById2 != null) {
            internalFindViewById2.setOnClickListener(new z());
        }
        View view3 = this.f35841o;
        if (view3 != null) {
            view3.setOnClickListener(new a0());
        }
        View view4 = this.f35835i;
        if (view4 != null) {
            view4.setOnClickListener(new a());
        }
        if (internalFindViewById3 != null) {
            internalFindViewById3.setOnClickListener(new b());
        }
        afterViews();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.D1.a(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MyGamePapaFragmentV2
    public void p1(List<DownloadTask> list) {
        org.androidannotations.api.a.l(new p("", 0L, "", list));
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.F1.put(cls, t4);
    }

    @Override // com.join.mgps.activity.MyGamePapaFragmentV2
    public void w1(OnlineCouponConfigBean onlineCouponConfigBean) {
        org.androidannotations.api.b.e("", new n(onlineCouponConfigBean), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MyGamePapaFragmentV2
    public void x1(SNKGameInfoBean sNKGameInfoBean) {
        org.androidannotations.api.b.e("", new j(sNKGameInfoBean), 0L);
    }
}
