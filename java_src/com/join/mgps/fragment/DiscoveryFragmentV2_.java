package com.join.mgps.fragment;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;
import com.flyco.tablayout.SlidingTabLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.customview.ViewPagerSlide;
import com.join.mgps.dto.DIscoverTypeBean;
import com.join.mgps.dto.DiscoveryMainDataBean;
import it.sephiroth.android.library.widget.HListView;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.androidannotations.api.a;
/* loaded from: classes3.dex */
public final class DiscoveryFragmentV2_ extends DiscoveryFragmentV2 implements y3.a, a4.a, a4.b {
    private View E;
    private final a4.c D = new a4.c();
    private final Map<Class<?>, Object> F = new HashMap();
    private final IntentFilter G = new IntentFilter();
    private final BroadcastReceiver H = new b();

    /* loaded from: classes3.dex */
    class a extends a.c {
        a(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                DiscoveryFragmentV2_.super.loadData();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes3.dex */
    class b extends BroadcastReceiver {
        b() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            DiscoveryFragmentV2_.this.Z(intent);
        }
    }

    /* loaded from: classes3.dex */
    class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DiscoveryFragmentV2_.this.c0();
        }
    }

    /* loaded from: classes3.dex */
    class d implements View.OnClickListener {
        d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DiscoveryFragmentV2_.this.relodingimag();
        }
    }

    /* loaded from: classes3.dex */
    class e implements View.OnClickListener {
        e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DiscoveryFragmentV2_.this.setNetwork();
        }
    }

    /* loaded from: classes3.dex */
    class f implements Runnable {
        f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            DiscoveryFragmentV2_.super.d0();
        }
    }

    /* loaded from: classes3.dex */
    class g implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f50787b;

        g(List list) {
            this.f50787b = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            DiscoveryFragmentV2_.super.h0(this.f50787b);
        }
    }

    /* loaded from: classes3.dex */
    class h implements Runnable {
        h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            DiscoveryFragmentV2_.super.f0();
        }
    }

    /* loaded from: classes3.dex */
    class i implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DiscoveryMainDataBean f50790b;

        i(DiscoveryMainDataBean discoveryMainDataBean) {
            this.f50790b = discoveryMainDataBean;
        }

        @Override // java.lang.Runnable
        public void run() {
            DiscoveryFragmentV2_.super.g0(this.f50790b);
        }
    }

    /* loaded from: classes3.dex */
    class j extends a.c {
        j(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                DiscoveryFragmentV2_.super.b0();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes3.dex */
    public static class k extends org.androidannotations.api.builder.d<k, DiscoveryFragmentV2> {
        @Override // org.androidannotations.api.builder.d
        /* renamed from: a */
        public DiscoveryFragmentV2 build() {
            DiscoveryFragmentV2_ discoveryFragmentV2_ = new DiscoveryFragmentV2_();
            discoveryFragmentV2_.setArguments(this.args);
            return discoveryFragmentV2_;
        }
    }

    private void init_(Bundle bundle) {
        a4.c.b(this);
        this.f50769s = AccountUtil_.getInstance_(getActivity());
        this.G.addAction("com.join.update.position");
    }

    public static k o0() {
        return new k();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.DiscoveryFragmentV2
    public void b0() {
        org.androidannotations.api.a.l(new j("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.DiscoveryFragmentV2
    public void d0() {
        org.androidannotations.api.b.e("", new f(), 1000L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.DiscoveryFragmentV2
    public void f0() {
        org.androidannotations.api.b.e("", new h(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.DiscoveryFragmentV2
    public void g0(DiscoveryMainDataBean discoveryMainDataBean) {
        org.androidannotations.api.b.e("", new i(discoveryMainDataBean), 0L);
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.F.get(cls);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.DiscoveryFragmentV2
    public void h0(List<DIscoverTypeBean> list) {
        org.androidannotations.api.b.e("", new g(list), 0L);
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        View view = this.E;
        if (view == null) {
            return null;
        }
        return (T) view.findViewById(i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.DiscoveryFragmentV2
    public void loadData() {
        org.androidannotations.api.a.l(new a("", 0L, ""));
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.D);
        init_(bundle);
        super.onCreate(bundle);
        getActivity().registerReceiver(this.H, this.G);
        a4.c.c(c5);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        this.E = onCreateView;
        if (onCreateView == null) {
            this.E = layoutInflater.inflate(R.layout.discovery_fragment_layout, viewGroup, false);
        }
        return this.E;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        getActivity().unregisterReceiver(this.H);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.E = null;
        this.f50752b = null;
        this.f50753c = null;
        this.f50754d = null;
        this.f50755e = null;
        this.f50756f = null;
        this.f50757g = null;
        this.f50758h = null;
        this.f50759i = null;
        this.f50760j = null;
        this.f50761k = null;
        this.f50762l = null;
        this.f50763m = null;
        this.f50764n = null;
        this.f50765o = null;
        this.f50766p = null;
        this.f50767q = null;
        this.f50768r = null;
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f50752b = (CoordinatorLayout) aVar.internalFindViewById(R.id.mPtrFrame);
        this.f50753c = (LinearLayout) aVar.internalFindViewById(R.id.loding_layout);
        this.f50754d = (LinearLayout) aVar.internalFindViewById(R.id.loding_faile);
        this.f50755e = (ViewPagerSlide) aVar.internalFindViewById(R.id.viewpager);
        this.f50756f = (Toolbar) aVar.internalFindViewById(R.id.toolbar);
        this.f50757g = (SlidingTabLayout) aVar.internalFindViewById(R.id.tableLayout);
        this.f50758h = (AppBarLayout) aVar.internalFindViewById(R.id.appbar);
        this.f50759i = (RelativeLayout) aVar.internalFindViewById(R.id.discoveryTopRl);
        this.f50760j = (GridView) aVar.internalFindViewById(R.id.discoveryTopGv);
        this.f50761k = (HListView) aVar.internalFindViewById(R.id.discoveryBottomGv);
        this.f50762l = (TextView) aVar.internalFindViewById(R.id.toFightRl);
        this.f50763m = (NestedScrollView) aVar.internalFindViewById(R.id.bottomNull);
        this.f50764n = (LinearLayout) aVar.internalFindViewById(R.id.toCommunityLl);
        this.f50765o = (TextView) aVar.internalFindViewById(R.id.toCommunityTx);
        this.f50766p = (TextView) aVar.internalFindViewById(R.id.number);
        this.f50767q = (TextView) aVar.internalFindViewById(R.id.nulltext);
        this.f50768r = (TextView) aVar.internalFindViewById(R.id.topBack);
        View internalFindViewById = aVar.internalFindViewById(R.id.relodingimag);
        View internalFindViewById2 = aVar.internalFindViewById(R.id.setNetwork);
        TextView textView = this.f50767q;
        if (textView != null) {
            textView.setOnClickListener(new c());
        }
        if (internalFindViewById != null) {
            internalFindViewById.setOnClickListener(new d());
        }
        if (internalFindViewById2 != null) {
            internalFindViewById2.setOnClickListener(new e());
        }
        afterView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.D.a(this);
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.F.put(cls, t4);
    }
}
