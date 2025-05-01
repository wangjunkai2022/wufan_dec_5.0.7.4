package com.join.mgps.fragment;

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
import android.widget.RelativeLayout;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.business.CollectionBeanSubBusiness;
import com.join.mgps.customview.XListView2;
import com.join.mgps.dto.CollectionBeanSub;
import com.join.mgps.ptr.PtrClassicFrameLayout;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.androidannotations.api.a;
/* loaded from: classes3.dex */
public final class RankingItemFragment_ extends RankingItemFragment implements y3.a, a4.a, a4.b {
    private View M;
    private final a4.c L = new a4.c();
    private final Map<Class<?>, Object> N = new HashMap();
    private final IntentFilter O = new IntentFilter();
    private final BroadcastReceiver P = new d();

    /* loaded from: classes3.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            RankingItemFragment_.super.q0();
        }
    }

    /* loaded from: classes3.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            RankingItemFragment_.super.c0();
        }
    }

    /* loaded from: classes3.dex */
    class c extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f52674b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f52675c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, long j4, String str2, String str3, String str4) {
            super(str, j4, str2);
            this.f52674b = str3;
            this.f52675c = str4;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                RankingItemFragment_.super.e0(this.f52674b, this.f52675c);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes3.dex */
    class d extends BroadcastReceiver {

        /* renamed from: b  reason: collision with root package name */
        public static final String f52677b = "gameData";

        d() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            RankingItemFragment_.this.s0((CollectionBeanSub) (intent.getExtras() != null ? intent.getExtras() : new Bundle()).getSerializable("gameData"));
        }
    }

    /* loaded from: classes3.dex */
    class e implements View.OnClickListener {
        e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            RankingItemFragment_.this.relodingimag();
        }
    }

    /* loaded from: classes3.dex */
    class f implements View.OnClickListener {
        f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            RankingItemFragment_.this.r0();
        }
    }

    /* loaded from: classes3.dex */
    class g implements View.OnClickListener {
        g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            RankingItemFragment_.this.n0();
        }
    }

    /* loaded from: classes3.dex */
    class h implements View.OnClickListener {
        h() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            RankingItemFragment_.this.z0();
        }
    }

    /* loaded from: classes3.dex */
    class i implements View.OnClickListener {
        i() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            RankingItemFragment_.this.setNetwork();
        }
    }

    /* loaded from: classes3.dex */
    class j implements Runnable {
        j() {
        }

        @Override // java.lang.Runnable
        public void run() {
            RankingItemFragment_.super.showLoding();
        }
    }

    /* loaded from: classes3.dex */
    class k implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f52685b;

        k(boolean z4) {
            this.f52685b = z4;
        }

        @Override // java.lang.Runnable
        public void run() {
            RankingItemFragment_.super.D0(this.f52685b);
        }
    }

    /* loaded from: classes3.dex */
    class l implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f52687b;

        l(List list) {
            this.f52687b = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            RankingItemFragment_.super.showMain(this.f52687b);
        }
    }

    /* loaded from: classes3.dex */
    public static class m extends org.androidannotations.api.builder.d<m, RankingItemFragment> {
        @Override // org.androidannotations.api.builder.d
        /* renamed from: a */
        public RankingItemFragment build() {
            RankingItemFragment_ rankingItemFragment_ = new RankingItemFragment_();
            rankingItemFragment_.setArguments(this.args);
            return rankingItemFragment_;
        }
    }

    public static m O0() {
        return new m();
    }

    private void init_(Bundle bundle) {
        a4.c.b(this);
        this.O.addAction(o1.a.I);
        this.O.addAction(o1.a.G);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.RankingItemFragment
    public void D0(boolean z4) {
        org.androidannotations.api.b.e("", new k(z4), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.RankingItemFragment
    public void c0() {
        org.androidannotations.api.b.e("", new b(), 400L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.RankingItemFragment
    public void e0(String str, String str2) {
        org.androidannotations.api.a.l(new c("", 0L, "", str, str2));
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.N.get(cls);
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        View view = this.M;
        if (view == null) {
            return null;
        }
        return (T) view.findViewById(i4);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.L);
        init_(bundle);
        super.onCreate(bundle);
        getActivity().registerReceiver(this.P, this.O);
        a4.c.c(c5);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        this.M = onCreateView;
        if (onCreateView == null) {
            this.M = layoutInflater.inflate(R.layout.fragment_rank_item, viewGroup, false);
        }
        return this.M;
    }

    @Override // com.join.mgps.fragment.RankingItemFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        getActivity().unregisterReceiver(this.P);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.M = null;
        this.f52649e = null;
        this.f52650f = null;
        this.f52651g = null;
        this.f52652h = null;
        this.f52653i = null;
        this.f52654j = null;
        this.f52655k = null;
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f52649e = (RelativeLayout) aVar.internalFindViewById(R.id.rootRl);
        this.f52650f = (XListView2) aVar.internalFindViewById(R.id.classifyListView);
        this.f52651g = (PtrClassicFrameLayout) aVar.internalFindViewById(R.id.mPtrFrame);
        this.f52652h = (LinearLayout) aVar.internalFindViewById(R.id.loding_layout);
        this.f52653i = (LinearLayout) aVar.internalFindViewById(R.id.loding_faile);
        this.f52654j = (LinearLayout) aVar.internalFindViewById(R.id.loading_none);
        this.f52655k = (ImageView) aVar.internalFindViewById(R.id.relodingimag);
        View internalFindViewById = aVar.internalFindViewById(R.id.noneReloadImage);
        View internalFindViewById2 = aVar.internalFindViewById(R.id.mg_loading);
        View internalFindViewById3 = aVar.internalFindViewById(R.id.setAll);
        View internalFindViewById4 = aVar.internalFindViewById(R.id.setNetwork);
        ImageView imageView = this.f52655k;
        if (imageView != null) {
            imageView.setOnClickListener(new e());
        }
        if (internalFindViewById != null) {
            internalFindViewById.setOnClickListener(new f());
        }
        if (internalFindViewById2 != null) {
            internalFindViewById2.setOnClickListener(new g());
        }
        if (internalFindViewById3 != null) {
            internalFindViewById3.setOnClickListener(new h());
        }
        if (internalFindViewById4 != null) {
            internalFindViewById4.setOnClickListener(new i());
        }
        afterViews();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.L.a(this);
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.N.put(cls, t4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.RankingItemFragment
    public void q0() {
        org.androidannotations.api.b.e("", new a(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.RankingItemFragment
    public void showLoding() {
        org.androidannotations.api.b.e("", new j(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.RankingItemFragment
    public void showMain(List<CollectionBeanSubBusiness> list) {
        org.androidannotations.api.b.e("", new l(list), 0L);
    }
}
