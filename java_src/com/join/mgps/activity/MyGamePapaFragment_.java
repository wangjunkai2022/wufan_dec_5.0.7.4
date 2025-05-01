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
import com.github.snowdream.android.app.downloader.DownloadTask;
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
public final class MyGamePapaFragment_ extends MyGamePapaFragment implements y3.a, a4.a, a4.b {
    private View B1;
    private final a4.c A1 = new a4.c();
    private final Map<Class<?>, Object> C1 = new HashMap();
    private final IntentFilter D1 = new IntentFilter();
    private final BroadcastReceiver E1 = new k();
    private final IntentFilter F1 = new IntentFilter();
    private final BroadcastReceiver G1 = new t();

    /* loaded from: classes4.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MyGamePapaFragment_.this.B0();
        }
    }

    /* loaded from: classes4.dex */
    class a0 implements View.OnClickListener {
        a0() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MyGamePapaFragment_.this.V0();
        }
    }

    /* loaded from: classes4.dex */
    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MyGamePapaFragment_.this.w1();
        }
    }

    /* loaded from: classes4.dex */
    public static class b0 extends org.androidannotations.api.builder.d<b0, MyGamePapaFragment> {
        @Override // org.androidannotations.api.builder.d
        /* renamed from: a */
        public MyGamePapaFragment build() {
            MyGamePapaFragment_ myGamePapaFragment_ = new MyGamePapaFragment_();
            myGamePapaFragment_.setArguments(this.args);
            return myGamePapaFragment_;
        }
    }

    /* loaded from: classes4.dex */
    class c implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f35918b;

        c(String str) {
            this.f35918b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            MyGamePapaFragment_.super.y1(this.f35918b);
        }
    }

    /* loaded from: classes4.dex */
    class d implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ HashMap f35920b;

        d(HashMap hashMap) {
            this.f35920b = hashMap;
        }

        @Override // java.lang.Runnable
        public void run() {
            MyGamePapaFragment_.super.Z0(this.f35920b);
        }
    }

    /* loaded from: classes4.dex */
    class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MyGamePapaFragment_.super.A1();
        }
    }

    /* loaded from: classes4.dex */
    class f implements Runnable {
        f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MyGamePapaFragment_.super.C1();
        }
    }

    /* loaded from: classes4.dex */
    class g implements Runnable {
        g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MyGamePapaFragment_.super.X0();
        }
    }

    /* loaded from: classes4.dex */
    class h implements Runnable {
        h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MyGamePapaFragment_.super.I0();
        }
    }

    /* loaded from: classes4.dex */
    class i implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f35926b;

        i(String str) {
            this.f35926b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            MyGamePapaFragment_.super.c1(this.f35926b);
        }
    }

    /* loaded from: classes4.dex */
    class j implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ SNKGameInfoBean f35928b;

        j(SNKGameInfoBean sNKGameInfoBean) {
            this.f35928b = sNKGameInfoBean;
        }

        @Override // java.lang.Runnable
        public void run() {
            MyGamePapaFragment_.super.v1(this.f35928b);
        }
    }

    /* loaded from: classes4.dex */
    class k extends BroadcastReceiver {

        /* renamed from: b  reason: collision with root package name */
        public static final String f35930b = "gameId";

        k() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            MyGamePapaFragment_.this.b1((intent.getExtras() != null ? intent.getExtras() : new Bundle()).getString("gameId"));
        }
    }

    /* loaded from: classes4.dex */
    class l implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DownloadTask f35932b;

        l(DownloadTask downloadTask) {
            this.f35932b = downloadTask;
        }

        @Override // java.lang.Runnable
        public void run() {
            MyGamePapaFragment_.super.H1(this.f35932b);
        }
    }

    /* loaded from: classes4.dex */
    class m implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f35934b;

        m(List list) {
            this.f35934b = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            MyGamePapaFragment_.super.z1(this.f35934b);
        }
    }

    /* loaded from: classes4.dex */
    class n implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ OnlineCouponConfigBean f35936b;

        n(OnlineCouponConfigBean onlineCouponConfigBean) {
            this.f35936b = onlineCouponConfigBean;
        }

        @Override // java.lang.Runnable
        public void run() {
            MyGamePapaFragment_.super.u1(this.f35936b);
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
                MyGamePapaFragment_.super.n1();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class p extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f35939b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(String str, long j4, String str2, List list) {
            super(str, j4, str2);
            this.f35939b = list;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                MyGamePapaFragment_.super.o1(this.f35939b);
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
                MyGamePapaFragment_.super.D0();
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
                MyGamePapaFragment_.super.H0();
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
                MyGamePapaFragment_.super.l1();
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
            MyGamePapaFragment_.this.k1();
        }
    }

    /* loaded from: classes4.dex */
    class u implements View.OnClickListener {
        u() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MyGamePapaFragment_.this.setNetwork();
        }
    }

    /* loaded from: classes4.dex */
    class v implements View.OnClickListener {
        v() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MyGamePapaFragment_.this.N0();
        }
    }

    /* loaded from: classes4.dex */
    class w implements View.OnClickListener {
        w() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MyGamePapaFragment_.this.T0();
        }
    }

    /* loaded from: classes4.dex */
    class x implements View.OnClickListener {
        x() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MyGamePapaFragment_.this.u0();
        }
    }

    /* loaded from: classes4.dex */
    class y implements View.OnClickListener {
        y() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MyGamePapaFragment_.this.t1();
        }
    }

    /* loaded from: classes4.dex */
    class z implements View.OnClickListener {
        z() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MyGamePapaFragment_.this.e1();
        }
    }

    public static b0 Z1() {
        return new b0();
    }

    private void init_(Bundle bundle) {
        this.J = new PrefDef_(getActivity());
        a4.c.b(this);
        this.D1.addAction(o1.a.f72008k);
        this.F1.addAction(o1.a.I);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MyGamePapaFragment
    public void A1() {
        org.androidannotations.api.b.e("", new e(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MyGamePapaFragment
    public void C1() {
        org.androidannotations.api.b.e("", new f(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MyGamePapaFragment
    public void D0() {
        org.androidannotations.api.a.l(new q("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MyGamePapaFragment
    public void H0() {
        org.androidannotations.api.a.l(new r("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MyGamePapaFragment
    public void H1(DownloadTask downloadTask) {
        org.androidannotations.api.b.e("", new l(downloadTask), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MyGamePapaFragment
    public void I0() {
        org.androidannotations.api.b.e("", new h(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MyGamePapaFragment
    public void X0() {
        org.androidannotations.api.b.e("", new g(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MyGamePapaFragment
    public void Z0(HashMap<String, Boolean> hashMap) {
        org.androidannotations.api.b.e("", new d(hashMap), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MyGamePapaFragment
    public void c1(String str) {
        org.androidannotations.api.b.e("", new i(str), 100L);
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.C1.get(cls);
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        View view = this.B1;
        if (view == null) {
            return null;
        }
        return (T) view.findViewById(i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MyGamePapaFragment
    public void l1() {
        org.androidannotations.api.a.l(new s("", 1000L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MyGamePapaFragment
    public void n1() {
        org.androidannotations.api.a.l(new o("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MyGamePapaFragment
    public void o1(List<DownloadTask> list) {
        org.androidannotations.api.a.l(new p("", 0L, "", list));
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.A1);
        init_(bundle);
        super.onCreate(bundle);
        getActivity().registerReceiver(this.E1, this.D1);
        getActivity().registerReceiver(this.G1, this.F1);
        a4.c.c(c5);
    }

    @Override // com.join.mgps.basefragment.BaseLoadingFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        this.B1 = onCreateView;
        if (onCreateView == null) {
            this.B1 = layoutInflater.inflate(R.layout.fragment_my_game_v1, viewGroup, false);
        }
        return this.B1;
    }

    @Override // com.join.mgps.activity.MyGamePapaFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        getActivity().unregisterReceiver(this.E1);
        getActivity().unregisterReceiver(this.G1);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.B1 = null;
        this.f35787d = null;
        this.f35788e = null;
        this.f35789f = null;
        this.f35790g = null;
        this.f35791h = null;
        this.f35792i = null;
        this.f35793j = null;
        this.f35794k = null;
        this.f35795l = null;
        this.f35796m = null;
        this.f35797n = null;
        this.f35798o = null;
        this.f35799p = null;
        this.f35800q = null;
        this.f35801r = null;
        this.f35802s = null;
        this.f35803t = null;
        this.f35804u = null;
        this.f35805v = null;
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f35787d = aVar.internalFindViewById(R.id.appbar);
        this.f35788e = (XListView2) aVar.internalFindViewById(R.id.listView);
        this.f35789f = aVar.internalFindViewById(R.id.plugsDownloadTip);
        this.f35790g = (TextView) aVar.internalFindViewById(R.id.plugType);
        this.f35791h = (TextView) aVar.internalFindViewById(R.id.plugProgress);
        this.f35792i = aVar.internalFindViewById(R.id.filter);
        this.f35793j = aVar.internalFindViewById(R.id.noGame);
        this.f35794k = (TextView) aVar.internalFindViewById(R.id.filterArr);
        this.f35795l = (TextView) aVar.internalFindViewById(R.id.title);
        this.f35796m = (TextView) aVar.internalFindViewById(R.id.count);
        this.f35797n = aVar.internalFindViewById(R.id.root);
        this.f35798o = aVar.internalFindViewById(R.id.needUpdate);
        this.f35799p = aVar.internalFindViewById(R.id.search);
        this.f35800q = aVar.internalFindViewById(R.id.back);
        this.f35801r = aVar.internalFindViewById(R.id.statubar);
        this.f35802s = (WrapContentGridView) aVar.internalFindViewById(R.id.noGameList);
        this.f35803t = (LinearLayout) aVar.internalFindViewById(R.id.llOnlineCouponBottom);
        this.f35804u = (TextView) aVar.internalFindViewById(R.id.tvOnlineCouponBottomDesc);
        this.f35805v = (ImageView) aVar.internalFindViewById(R.id.ivOnlineCouponBottomClose);
        View internalFindViewById = aVar.internalFindViewById(R.id.setNetwork);
        View internalFindViewById2 = aVar.internalFindViewById(R.id.plugs);
        View internalFindViewById3 = aVar.internalFindViewById(R.id.settings);
        if (internalFindViewById != null) {
            internalFindViewById.setOnClickListener(new u());
        }
        ImageView imageView = this.f35805v;
        if (imageView != null) {
            imageView.setOnClickListener(new v());
        }
        LinearLayout linearLayout = this.f35803t;
        if (linearLayout != null) {
            linearLayout.setOnClickListener(new w());
        }
        View view = this.f35800q;
        if (view != null) {
            view.setOnClickListener(new x());
        }
        View view2 = this.f35799p;
        if (view2 != null) {
            view2.setOnClickListener(new y());
        }
        if (internalFindViewById2 != null) {
            internalFindViewById2.setOnClickListener(new z());
        }
        View view3 = this.f35798o;
        if (view3 != null) {
            view3.setOnClickListener(new a0());
        }
        View view4 = this.f35792i;
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
        this.A1.a(this);
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.C1.put(cls, t4);
    }

    @Override // com.join.mgps.activity.MyGamePapaFragment
    public void u1(OnlineCouponConfigBean onlineCouponConfigBean) {
        org.androidannotations.api.b.e("", new n(onlineCouponConfigBean), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MyGamePapaFragment
    public void v1(SNKGameInfoBean sNKGameInfoBean) {
        org.androidannotations.api.b.e("", new j(sNKGameInfoBean), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MyGamePapaFragment
    public void y1(String str) {
        org.androidannotations.api.b.e("", new c(str), 500L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MyGamePapaFragment
    public void z1(List<GamedownRecomendItemBean> list) {
        org.androidannotations.api.b.e("", new m(list), 0L);
    }
}
