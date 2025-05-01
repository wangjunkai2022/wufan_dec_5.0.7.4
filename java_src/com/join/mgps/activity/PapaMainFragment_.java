package com.join.mgps.activity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.XListView2;
import com.join.mgps.dto.BannerBean;
import com.join.mgps.dto.CollectionBeanSub;
import com.join.mgps.dto.HomeFloatData;
import com.join.mgps.dto.PAPAHomeBeanV6;
import com.join.mgps.dto.VipPopData;
import com.join.mgps.pref.PrefDef_;
import com.join.mgps.ptr.PtrClassicFrameLayout;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.androidannotations.api.a;
/* loaded from: classes4.dex */
public final class PapaMainFragment_ extends PapaMainFragment implements y3.a, a4.a, a4.b {
    private View S1;
    private final a4.c R1 = new a4.c();
    private final Map<Class<?>, Object> T1 = new HashMap();
    private final IntentFilter U1 = new IntentFilter();
    private final BroadcastReceiver V1 = new k();
    private final IntentFilter W1 = new IntentFilter();
    private final BroadcastReceiver X1 = new v();
    private final IntentFilter Y1 = new IntentFilter();
    private final BroadcastReceiver Z1 = new g0();

    /* renamed from: a2  reason: collision with root package name */
    private final IntentFilter f36528a2 = new IntentFilter();

    /* renamed from: b2  reason: collision with root package name */
    private final BroadcastReceiver f36529b2 = new j0();

    /* loaded from: classes4.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            PapaMainFragment_.this.setNetwork();
        }
    }

    /* loaded from: classes4.dex */
    class a0 extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f36531b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f36532c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a0(String str, long j4, String str2, int i4, String str3) {
            super(str, j4, str2);
            this.f36531b = i4;
            this.f36532c = str3;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                PapaMainFragment_.super.B0(this.f36531b, this.f36532c);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            PapaMainFragment_.this.s1();
        }
    }

    /* loaded from: classes4.dex */
    class b0 extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f36535b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b0(String str, long j4, String str2, String str3) {
            super(str, j4, str2);
            this.f36535b = str3;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                PapaMainFragment_.super.p0(this.f36535b);
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
            PapaMainFragment_.super.B1();
        }
    }

    /* loaded from: classes4.dex */
    class c0 extends a.c {
        c0(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                PapaMainFragment_.super.u0();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class d implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f36539b;

        d(List list) {
            this.f36539b = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            PapaMainFragment_.super.p1(this.f36539b);
        }
    }

    /* loaded from: classes4.dex */
    class d0 extends a.c {
        d0(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                PapaMainFragment_.super.G0();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class e implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f36542b;

        e(String str) {
            this.f36542b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            PapaMainFragment_.super.u1(this.f36542b);
        }
    }

    /* loaded from: classes4.dex */
    class e0 extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f36544b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f36545c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e0(String str, long j4, String str2, String str3, int i4) {
            super(str, j4, str2);
            this.f36544b = str3;
            this.f36545c = i4;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                PapaMainFragment_.super.I0(this.f36544b, this.f36545c);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class f implements Runnable {
        f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            PapaMainFragment_.super.m1();
        }
    }

    /* loaded from: classes4.dex */
    class f0 extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PAPAHomeBeanV6 f36548b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f0(String str, long j4, String str2, PAPAHomeBeanV6 pAPAHomeBeanV6) {
            super(str, j4, str2);
            this.f36548b = pAPAHomeBeanV6;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                PapaMainFragment_.super.a1(this.f36548b);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class g implements Runnable {
        g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            PapaMainFragment_.super.J0();
        }
    }

    /* loaded from: classes4.dex */
    class g0 extends BroadcastReceiver {
        g0() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            PapaMainFragment_.this.z0(intent);
        }
    }

    /* loaded from: classes4.dex */
    class h implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PAPAHomeBeanV6 f36552b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f36553c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f36554d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ boolean f36555e;

        h(PAPAHomeBeanV6 pAPAHomeBeanV6, String str, int i4, boolean z4) {
            this.f36552b = pAPAHomeBeanV6;
            this.f36553c = str;
            this.f36554d = i4;
            this.f36555e = z4;
        }

        @Override // java.lang.Runnable
        public void run() {
            PapaMainFragment_.super.v1(this.f36552b, this.f36553c, this.f36554d, this.f36555e);
        }
    }

    /* loaded from: classes4.dex */
    class h0 extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f36557b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h0(String str, long j4, String str2, List list) {
            super(str, j4, str2);
            this.f36557b = list;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                PapaMainFragment_.super.Z0(this.f36557b);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class i implements Runnable {
        i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            PapaMainFragment_.super.H0();
        }
    }

    /* loaded from: classes4.dex */
    class i0 extends a.c {
        i0(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                PapaMainFragment_.super.t0();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class j implements Runnable {
        j() {
        }

        @Override // java.lang.Runnable
        public void run() {
            PapaMainFragment_.super.M0();
        }
    }

    /* loaded from: classes4.dex */
    class j0 extends BroadcastReceiver {

        /* renamed from: b  reason: collision with root package name */
        public static final String f36562b = "gameData";

        j0() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            PapaMainFragment_.this.Q0((CollectionBeanSub) (intent.getExtras() != null ? intent.getExtras() : new Bundle()).getSerializable("gameData"));
        }
    }

    /* loaded from: classes4.dex */
    class k extends BroadcastReceiver {
        k() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            PapaMainFragment_.this.X();
        }
    }

    /* loaded from: classes4.dex */
    class k0 implements View.OnClickListener {
        k0() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            PapaMainFragment_.this.c1();
        }
    }

    /* loaded from: classes4.dex */
    class l implements Runnable {
        l() {
        }

        @Override // java.lang.Runnable
        public void run() {
            PapaMainFragment_.super.O0();
        }
    }

    /* loaded from: classes4.dex */
    class l0 implements View.OnClickListener {
        l0() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            PapaMainFragment_.this.K0();
        }
    }

    /* loaded from: classes4.dex */
    class m implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f36568b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f36569c;

        m(List list, boolean z4) {
            this.f36568b = list;
            this.f36569c = z4;
        }

        @Override // java.lang.Runnable
        public void run() {
            PapaMainFragment_.super.j1(this.f36568b, this.f36569c);
        }
    }

    /* loaded from: classes4.dex */
    class m0 implements View.OnClickListener {
        m0() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            PapaMainFragment_.this.D0();
        }
    }

    /* loaded from: classes4.dex */
    class n implements Runnable {
        n() {
        }

        @Override // java.lang.Runnable
        public void run() {
            PapaMainFragment_.super.o1();
        }
    }

    /* loaded from: classes4.dex */
    class n0 implements View.OnClickListener {
        n0() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            PapaMainFragment_.this.relodingimag();
        }
    }

    /* loaded from: classes4.dex */
    class o implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f36574b;

        o(String str) {
            this.f36574b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            PapaMainFragment_.super.showMessage(this.f36574b);
        }
    }

    /* loaded from: classes4.dex */
    class o0 implements View.OnClickListener {
        o0() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            PapaMainFragment_.this.l1();
        }
    }

    /* loaded from: classes4.dex */
    class p implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f36577b;

        p(List list) {
            this.f36577b = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            PapaMainFragment_.super.t1(this.f36577b);
        }
    }

    /* loaded from: classes4.dex */
    public static class p0 extends org.androidannotations.api.builder.d<p0, PapaMainFragment> {
        @Override // org.androidannotations.api.builder.d
        /* renamed from: a */
        public PapaMainFragment build() {
            PapaMainFragment_ papaMainFragment_ = new PapaMainFragment_();
            papaMainFragment_.setArguments(this.args);
            return papaMainFragment_;
        }
    }

    /* loaded from: classes4.dex */
    class q implements Runnable {
        q() {
        }

        @Override // java.lang.Runnable
        public void run() {
            PapaMainFragment_.super.g1();
        }
    }

    /* loaded from: classes4.dex */
    class r implements Runnable {
        r() {
        }

        @Override // java.lang.Runnable
        public void run() {
            PapaMainFragment_.super.L0();
        }
    }

    /* loaded from: classes4.dex */
    class s implements Runnable {
        s() {
        }

        @Override // java.lang.Runnable
        public void run() {
            PapaMainFragment_.super.showLoding();
        }
    }

    /* loaded from: classes4.dex */
    class t implements Runnable {
        t() {
        }

        @Override // java.lang.Runnable
        public void run() {
            PapaMainFragment_.super.showLodingFailed();
        }
    }

    /* loaded from: classes4.dex */
    class u implements Runnable {
        u() {
        }

        @Override // java.lang.Runnable
        public void run() {
            PapaMainFragment_.super.showMain();
        }
    }

    /* loaded from: classes4.dex */
    class v extends BroadcastReceiver {
        v() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            PapaMainFragment_.this.Y0(intent);
        }
    }

    /* loaded from: classes4.dex */
    class w implements Runnable {
        w() {
        }

        @Override // java.lang.Runnable
        public void run() {
            PapaMainFragment_.super.A0();
        }
    }

    /* loaded from: classes4.dex */
    class x implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ HomeFloatData f36586b;

        x(HomeFloatData homeFloatData) {
            this.f36586b = homeFloatData;
        }

        @Override // java.lang.Runnable
        public void run() {
            PapaMainFragment_.super.n1(this.f36586b);
        }
    }

    /* loaded from: classes4.dex */
    class y implements Runnable {
        y() {
        }

        @Override // java.lang.Runnable
        public void run() {
            PapaMainFragment_.super.y1();
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
                PapaMainFragment_.super.y0();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    public static p0 g2() {
        return new p0();
    }

    private void init_(Bundle bundle) {
        Resources resources = getActivity().getResources();
        this.E = new PrefDef_(getActivity());
        a4.c.b(this);
        this.f36481e = resources.getString(R.string.net_excption);
        this.f36482f = resources.getString(R.string.connect_server_excption);
        this.U1.addAction(o1.a.B);
        this.W1.addAction("com.broadcast.bespeak.sussess");
        this.Y1.addAction("com.papa.maintab.clicked");
        this.f36528a2.addAction(o1.a.I);
        this.f36528a2.addAction(o1.a.G);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.PapaMainFragment
    public void A0() {
        org.androidannotations.api.b.e("", new w(), 2000L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.PapaMainFragment
    public void B0(int i4, String str) {
        org.androidannotations.api.a.l(new a0("", 0L, "", i4, str));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.PapaMainFragment
    public void B1() {
        org.androidannotations.api.b.e("", new c(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.PapaMainFragment
    public void G0() {
        org.androidannotations.api.a.l(new d0("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.PapaMainFragment
    public void H0() {
        org.androidannotations.api.b.e("", new i(), 3000L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.PapaMainFragment
    public void I0(String str, int i4) {
        org.androidannotations.api.a.l(new e0("", 0L, "", str, i4));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.PapaMainFragment
    public void J0() {
        org.androidannotations.api.b.e("", new g(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.PapaMainFragment
    public void L0() {
        org.androidannotations.api.b.e("", new r(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.PapaMainFragment
    public void M0() {
        org.androidannotations.api.b.e("", new j(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.PapaMainFragment
    public void O0() {
        org.androidannotations.api.b.e("", new l(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.PapaMainFragment
    public void Z0(List<BannerBean> list) {
        org.androidannotations.api.a.l(new h0("", 0L, "", list));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.PapaMainFragment
    public void a1(PAPAHomeBeanV6 pAPAHomeBeanV6) {
        org.androidannotations.api.a.l(new f0("", 0L, "", pAPAHomeBeanV6));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.PapaMainFragment
    public void g1() {
        org.androidannotations.api.b.e("", new q(), 0L);
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.T1.get(cls);
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        View view = this.S1;
        if (view == null) {
            return null;
        }
        return (T) view.findViewById(i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.PapaMainFragment
    public void j1(List<BannerBean> list, boolean z4) {
        org.androidannotations.api.b.e("", new m(list, z4), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.PapaMainFragment
    public void m1() {
        org.androidannotations.api.b.e("", new f(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.PapaMainFragment
    public void n1(HomeFloatData homeFloatData) {
        org.androidannotations.api.b.e("", new x(homeFloatData), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.PapaMainFragment
    public void o1() {
        org.androidannotations.api.b.e("", new n(), 0L);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.R1);
        init_(bundle);
        super.onCreate(bundle);
        getActivity().registerReceiver(this.V1, this.U1);
        getActivity().registerReceiver(this.X1, this.W1);
        getActivity().registerReceiver(this.Z1, this.Y1);
        getActivity().registerReceiver(this.f36529b2, this.f36528a2);
        a4.c.c(c5);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        this.S1 = onCreateView;
        if (onCreateView == null) {
            this.S1 = layoutInflater.inflate(R.layout.mgpapa_mainfragment_new_layout, viewGroup, false);
        }
        return this.S1;
    }

    @Override // com.join.mgps.activity.PapaMainFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        getActivity().unregisterReceiver(this.V1);
        getActivity().unregisterReceiver(this.X1);
        getActivity().unregisterReceiver(this.Z1);
        getActivity().unregisterReceiver(this.f36529b2);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.S1 = null;
        this.f36480d = null;
        this.f36484h = null;
        this.f36485i = null;
        this.f36486j = null;
        this.f36487k = null;
        this.f36488l = null;
        this.f36489m = null;
        this.f36490n = null;
        this.f36491o = null;
        this.P = null;
        this.Q = null;
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f36480d = (XListView2) aVar.internalFindViewById(R.id.listview);
        this.f36484h = (TextView) aVar.internalFindViewById(R.id.updateNotice);
        this.f36485i = (LinearLayout) aVar.internalFindViewById(R.id.loding_layout);
        this.f36486j = (LinearLayout) aVar.internalFindViewById(R.id.loding_faile);
        this.f36487k = (ImageView) aVar.internalFindViewById(R.id.movetoTop);
        this.f36488l = aVar.internalFindViewById(R.id.titleSearch);
        this.f36489m = (SimpleDraweeView) aVar.internalFindViewById(R.id.ivFloatad);
        this.f36490n = (ImageView) aVar.internalFindViewById(R.id.imageLoading);
        this.f36491o = aVar.internalFindViewById(R.id.statubar);
        this.P = (PtrClassicFrameLayout) aVar.internalFindViewById(R.id.mPtrFrame);
        this.Q = aVar.internalFindViewById(R.id.search);
        View internalFindViewById = aVar.internalFindViewById(R.id.relodingimag);
        View internalFindViewById2 = aVar.internalFindViewById(R.id.share);
        View internalFindViewById3 = aVar.internalFindViewById(R.id.setNetwork);
        View view = this.Q;
        if (view != null) {
            view.setOnClickListener(new k0());
        }
        ImageView imageView = this.f36487k;
        if (imageView != null) {
            imageView.setOnClickListener(new l0());
        }
        SimpleDraweeView simpleDraweeView = this.f36489m;
        if (simpleDraweeView != null) {
            simpleDraweeView.setOnClickListener(new m0());
        }
        if (internalFindViewById != null) {
            internalFindViewById.setOnClickListener(new n0());
        }
        if (internalFindViewById2 != null) {
            internalFindViewById2.setOnClickListener(new o0());
        }
        if (internalFindViewById3 != null) {
            internalFindViewById3.setOnClickListener(new a());
        }
        View view2 = this.f36488l;
        if (view2 != null) {
            view2.setOnClickListener(new b());
        }
        afterViews();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.R1.a(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.PapaMainFragment
    public void p0(String str) {
        org.androidannotations.api.a.l(new b0("", 0L, "", str));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.PapaMainFragment
    public void p1(List<VipPopData> list) {
        org.androidannotations.api.b.e("", new d(list), 0L);
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.T1.put(cls, t4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.PapaMainFragment
    public void showLoding() {
        org.androidannotations.api.b.e("", new s(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.PapaMainFragment
    public void showLodingFailed() {
        org.androidannotations.api.b.e("", new t(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.PapaMainFragment
    public void showMain() {
        org.androidannotations.api.b.e("", new u(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.PapaMainFragment
    public void showMessage(String str) {
        org.androidannotations.api.b.e("", new o(str), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.PapaMainFragment
    public void t0() {
        org.androidannotations.api.a.l(new i0("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.PapaMainFragment
    public void t1(List<BannerBean> list) {
        org.androidannotations.api.b.e("", new p(list), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.PapaMainFragment
    public void u0() {
        org.androidannotations.api.a.l(new c0("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.PapaMainFragment
    public void u1(String str) {
        org.androidannotations.api.b.e("", new e(str), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.PapaMainFragment
    public void v1(PAPAHomeBeanV6 pAPAHomeBeanV6, String str, int i4, boolean z4) {
        org.androidannotations.api.b.e("", new h(pAPAHomeBeanV6, str, i4, z4), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.PapaMainFragment
    public void y0() {
        org.androidannotations.api.a.l(new z("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.PapaMainFragment
    public void y1() {
        org.androidannotations.api.b.e("", new y(), 0L);
    }
}
