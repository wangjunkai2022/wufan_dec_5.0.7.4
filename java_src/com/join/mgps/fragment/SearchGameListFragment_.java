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
import android.widget.TextView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.component.xrecyclerview.XQuickRecyclerView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.dto.CommonGameInfoBean;
import com.join.mgps.dto.DomainInfoBean;
import com.join.mgps.dto.SearchGameListBean;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.androidannotations.api.a;
/* loaded from: classes3.dex */
public final class SearchGameListFragment_ extends SearchGameListFragment implements y3.a, a4.a, a4.b {
    public static final String N = "currentTab";
    public static final String O = "game_id";
    public static final String P = "keyword";
    private View J;
    private final a4.c I = new a4.c();
    private final Map<Class<?>, Object> K = new HashMap();
    private final IntentFilter L = new IntentFilter();
    private final BroadcastReceiver M = new g();

    /* loaded from: classes3.dex */
    class a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f52843b;

        a(String str) {
            this.f52843b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            SearchGameListFragment_.super.T(this.f52843b);
        }
    }

    /* loaded from: classes3.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SearchGameListFragment_.super.showLoadingView();
        }
    }

    /* loaded from: classes3.dex */
    class c implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f52846b;

        c(String str) {
            this.f52846b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            SearchGameListFragment_.super.showLoadFailed(this.f52846b);
        }
    }

    /* loaded from: classes3.dex */
    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SearchGameListFragment_.super.hideLoading();
        }
    }

    /* loaded from: classes3.dex */
    class e extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f52849b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f52850c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(String str, long j4, String str2, int i4, boolean z4) {
            super(str, j4, str2);
            this.f52849b = i4;
            this.f52850c = z4;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                SearchGameListFragment_.super.j0(this.f52849b, this.f52850c);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes3.dex */
    class f extends a.c {
        f(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                SearchGameListFragment_.super.q0();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes3.dex */
    class g extends BroadcastReceiver {
        g() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            SearchGameListFragment_.this.p0(intent);
        }
    }

    /* loaded from: classes3.dex */
    class h implements View.OnClickListener {
        h() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SearchGameListFragment_.this.relodingimag();
        }
    }

    /* loaded from: classes3.dex */
    class i implements View.OnClickListener {
        i() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SearchGameListFragment_.this.setNetwork();
        }
    }

    /* loaded from: classes3.dex */
    class j implements Runnable {
        j() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SearchGameListFragment_.super.e0();
        }
    }

    /* loaded from: classes3.dex */
    class k implements Runnable {
        k() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SearchGameListFragment_.super.v0();
        }
    }

    /* loaded from: classes3.dex */
    class l implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f52858b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f52859c;

        l(String str, int i4) {
            this.f52858b = str;
            this.f52859c = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            SearchGameListFragment_.super.w0(this.f52858b, this.f52859c);
        }
    }

    /* loaded from: classes3.dex */
    class m implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f52861b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f52862c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f52863d;

        m(List list, boolean z4, boolean z5) {
            this.f52861b = list;
            this.f52862c = z4;
            this.f52863d = z5;
        }

        @Override // java.lang.Runnable
        public void run() {
            SearchGameListFragment_.super.t0(this.f52861b, this.f52862c, this.f52863d);
        }
    }

    /* loaded from: classes3.dex */
    class n implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ SearchGameListBean f52865b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f52866c;

        n(SearchGameListBean searchGameListBean, int i4) {
            this.f52865b = searchGameListBean;
            this.f52866c = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            SearchGameListFragment_.super.s0(this.f52865b, this.f52866c);
        }
    }

    /* loaded from: classes3.dex */
    class o implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f52868b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ DomainInfoBean f52869c;

        o(boolean z4, DomainInfoBean domainInfoBean) {
            this.f52868b = z4;
            this.f52869c = domainInfoBean;
        }

        @Override // java.lang.Runnable
        public void run() {
            SearchGameListFragment_.super.u0(this.f52868b, this.f52869c);
        }
    }

    /* loaded from: classes3.dex */
    public static class p extends org.androidannotations.api.builder.d<p, SearchGameListFragment> {
        @Override // org.androidannotations.api.builder.d
        /* renamed from: a */
        public SearchGameListFragment build() {
            SearchGameListFragment_ searchGameListFragment_ = new SearchGameListFragment_();
            searchGameListFragment_.setArguments(this.args);
            return searchGameListFragment_;
        }

        public p b(int i4) {
            this.args.putInt("currentTab", i4);
            return this;
        }

        public p c(String str) {
            this.args.putString("game_id", str);
            return this;
        }

        public p d(String str) {
            this.args.putString("keyword", str);
            return this;
        }
    }

    public static p O0() {
        return new p();
    }

    private void P0() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            if (arguments.containsKey("currentTab")) {
                this.f52822k = arguments.getInt("currentTab");
            }
            if (arguments.containsKey("game_id")) {
                this.f52823l = arguments.getString("game_id");
            }
            if (arguments.containsKey("keyword")) {
                this.f52824m = arguments.getString("keyword");
            }
        }
    }

    private void init_(Bundle bundle) {
        a4.c.b(this);
        P0();
        this.L.addAction("com.broadcast.bespeak.sussess");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.SearchGameListFragment, com.join.mgps.fragment.BaseFragment
    public void T(String str) {
        org.androidannotations.api.b.e("", new a(str), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.SearchGameListFragment
    public void e0() {
        org.androidannotations.api.b.e("", new j(), 500L);
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.K.get(cls);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.SearchGameListFragment
    public void hideLoading() {
        org.androidannotations.api.b.e("", new d(), 0L);
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        View view = this.J;
        if (view == null) {
            return null;
        }
        return (T) view.findViewById(i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.SearchGameListFragment
    public void j0(int i4, boolean z4) {
        org.androidannotations.api.a.l(new e("", 0L, "", i4, z4));
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.I);
        init_(bundle);
        super.onCreate(bundle);
        getActivity().registerReceiver(this.M, this.L);
        a4.c.c(c5);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        this.J = onCreateView;
        if (onCreateView == null) {
            this.J = layoutInflater.inflate(R.layout.fragment_search_game_list, viewGroup, false);
        }
        return this.J;
    }

    @Override // com.join.mgps.fragment.SearchGameListFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        getActivity().unregisterReceiver(this.M);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.J = null;
        this.f52813b = null;
        this.f52814c = null;
        this.f52815d = null;
        this.f52816e = null;
        this.f52817f = null;
        this.f52818g = null;
        this.f52836y = null;
        this.f52837z = null;
        this.A = null;
        this.B = null;
        this.C = null;
        this.D = null;
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f52813b = (XQuickRecyclerView) aVar.internalFindViewById(R.id.rv_list_data);
        this.f52814c = aVar.internalFindViewById(R.id.v_no_data);
        this.f52815d = aVar.internalFindViewById(R.id.v_pd_view);
        this.f52816e = (SimpleDraweeView) aVar.internalFindViewById(R.id.sdv_image);
        this.f52817f = (ImageView) aVar.internalFindViewById(R.id.icon);
        this.f52818g = (TextView) aVar.internalFindViewById(R.id.name);
        this.f52836y = aVar.internalFindViewById(R.id.loding_layout);
        this.f52837z = aVar.internalFindViewById(R.id.loding_faile);
        this.A = aVar.internalFindViewById(R.id.relodingimag);
        this.B = (TextView) aVar.internalFindViewById(R.id.failedMessage);
        this.C = (TextView) aVar.internalFindViewById(R.id.setting);
        this.D = (TextView) aVar.internalFindViewById(R.id.setNetwork);
        View view = this.A;
        if (view != null) {
            view.setOnClickListener(new h());
        }
        TextView textView = this.D;
        if (textView != null) {
            textView.setOnClickListener(new i());
        }
        afterViews();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.I.a(this);
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.K.put(cls, t4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.SearchGameListFragment
    public void q0() {
        org.androidannotations.api.a.l(new f("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.SearchGameListFragment
    public void s0(SearchGameListBean searchGameListBean, int i4) {
        org.androidannotations.api.b.e("", new n(searchGameListBean, i4), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.SearchGameListFragment
    public void showLoadFailed(String str) {
        org.androidannotations.api.b.e("", new c(str), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.SearchGameListFragment
    public void showLoadingView() {
        org.androidannotations.api.b.e("", new b(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.SearchGameListFragment
    public void t0(List<CommonGameInfoBean> list, boolean z4, boolean z5) {
        org.androidannotations.api.b.e("", new m(list, z4, z5), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.SearchGameListFragment
    public void u0(boolean z4, DomainInfoBean domainInfoBean) {
        org.androidannotations.api.b.e("", new o(z4, domainInfoBean), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.SearchGameListFragment
    public void v0() {
        org.androidannotations.api.b.e("", new k(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.SearchGameListFragment
    public void w0(String str, int i4) {
        org.androidannotations.api.b.e("", new l(str, i4), 0L);
    }
}
