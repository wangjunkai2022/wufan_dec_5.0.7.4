package com.join.mgps.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.XListView2;
import com.join.mgps.dto.SearchGameFavoriteListBean;
import com.join.mgps.dto.SearchIntegratedBean;
import com.join.mgps.dto.SearchPostsBean;
import java.util.HashMap;
import java.util.Map;
import org.androidannotations.api.a;
/* loaded from: classes3.dex */
public final class SearchListFragment_ extends SearchListFragment implements y3.a, a4.a, a4.b {
    public static final String C = "currentTab";
    public static final String D = "game_id";
    public static final String E = "keyword";
    private View A;

    /* renamed from: z  reason: collision with root package name */
    private final a4.c f52900z = new a4.c();
    private final Map<Class<?>, Object> B = new HashMap();

    /* loaded from: classes3.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SearchListFragment_.super.hideLoading();
        }
    }

    /* loaded from: classes3.dex */
    class b extends a.c {
        b(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                SearchListFragment_.super.g0();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes3.dex */
    class c extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f52903b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, long j4, String str2, int i4) {
            super(str, j4, str2);
            this.f52903b = i4;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                SearchListFragment_.super.d0(this.f52903b);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes3.dex */
    class d extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f52905b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(String str, long j4, String str2, int i4) {
            super(str, j4, str2);
            this.f52905b = i4;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                SearchListFragment_.super.e0(this.f52905b);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes3.dex */
    class e extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f52907b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(String str, long j4, String str2, int i4) {
            super(str, j4, str2);
            this.f52907b = i4;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                SearchListFragment_.super.f0(this.f52907b);
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
                SearchListFragment_.super.m0();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes3.dex */
    class g implements View.OnClickListener {
        g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SearchListFragment_.this.relodingimag();
        }
    }

    /* loaded from: classes3.dex */
    class h implements View.OnClickListener {
        h() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SearchListFragment_.this.setNetwork();
        }
    }

    /* loaded from: classes3.dex */
    class i implements Runnable {
        i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SearchListFragment_.super.s0();
        }
    }

    /* loaded from: classes3.dex */
    class j implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ SearchIntegratedBean f52913b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f52914c;

        j(SearchIntegratedBean searchIntegratedBean, int i4) {
            this.f52913b = searchIntegratedBean;
            this.f52914c = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            SearchListFragment_.super.o0(this.f52913b, this.f52914c);
        }
    }

    /* loaded from: classes3.dex */
    class k implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ SearchGameFavoriteListBean f52916b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f52917c;

        k(SearchGameFavoriteListBean searchGameFavoriteListBean, int i4) {
            this.f52916b = searchGameFavoriteListBean;
            this.f52917c = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            SearchListFragment_.super.n0(this.f52916b, this.f52917c);
        }
    }

    /* loaded from: classes3.dex */
    class l implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ SearchPostsBean f52919b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f52920c;

        l(SearchPostsBean searchPostsBean, int i4) {
            this.f52919b = searchPostsBean;
            this.f52920c = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            SearchListFragment_.super.p0(this.f52919b, this.f52920c);
        }
    }

    /* loaded from: classes3.dex */
    class m implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f52922b;

        m(String str) {
            this.f52922b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            SearchListFragment_.super.T(this.f52922b);
        }
    }

    /* loaded from: classes3.dex */
    class n implements Runnable {
        n() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SearchListFragment_.super.showLoadingView();
        }
    }

    /* loaded from: classes3.dex */
    class o implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f52925b;

        o(String str) {
            this.f52925b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            SearchListFragment_.super.showLoadFailed(this.f52925b);
        }
    }

    /* loaded from: classes3.dex */
    public static class p extends org.androidannotations.api.builder.d<p, SearchListFragment> {
        @Override // org.androidannotations.api.builder.d
        /* renamed from: a */
        public SearchListFragment build() {
            SearchListFragment_ searchListFragment_ = new SearchListFragment_();
            searchListFragment_.setArguments(this.args);
            return searchListFragment_;
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

    public static p K0() {
        return new p();
    }

    private void L0() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            if (arguments.containsKey("currentTab")) {
                this.f52874e = arguments.getInt("currentTab");
            }
            if (arguments.containsKey("game_id")) {
                this.f52875f = arguments.getString("game_id");
            }
            if (arguments.containsKey("keyword")) {
                this.f52876g = arguments.getString("keyword");
            }
        }
    }

    private void init_(Bundle bundle) {
        a4.c.b(this);
        L0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.SearchListFragment, com.join.mgps.fragment.BaseFragment
    public void T(String str) {
        org.androidannotations.api.b.e("", new m(str), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.SearchListFragment
    public void d0(int i4) {
        org.androidannotations.api.a.l(new c("", 0L, "", i4));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.SearchListFragment
    public void e0(int i4) {
        org.androidannotations.api.a.l(new d("", 0L, "", i4));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.SearchListFragment
    public void f0(int i4) {
        org.androidannotations.api.a.l(new e("", 0L, "", i4));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.SearchListFragment
    public void g0() {
        org.androidannotations.api.a.l(new b("", 0L, ""));
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.B.get(cls);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.SearchListFragment
    public void hideLoading() {
        org.androidannotations.api.b.e("", new a(), 0L);
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        View view = this.A;
        if (view == null) {
            return null;
        }
        return (T) view.findViewById(i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.SearchListFragment
    public void m0() {
        org.androidannotations.api.a.l(new f("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.SearchListFragment
    public void n0(SearchGameFavoriteListBean searchGameFavoriteListBean, int i4) {
        org.androidannotations.api.b.e("", new k(searchGameFavoriteListBean, i4), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.SearchListFragment
    public void o0(SearchIntegratedBean searchIntegratedBean, int i4) {
        org.androidannotations.api.b.e("", new j(searchIntegratedBean, i4), 0L);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.f52900z);
        init_(bundle);
        super.onCreate(bundle);
        a4.c.c(c5);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        this.A = onCreateView;
        if (onCreateView == null) {
            this.A = layoutInflater.inflate(R.layout.fragment_search_list, viewGroup, false);
        }
        return this.A;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.A = null;
        this.f52871b = null;
        this.f52885p = null;
        this.f52886q = null;
        this.f52887r = null;
        this.f52888s = null;
        this.f52889t = null;
        this.f52890u = null;
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f52871b = (XListView2) aVar.internalFindViewById(R.id.listView);
        this.f52885p = aVar.internalFindViewById(R.id.loding_layout);
        this.f52886q = aVar.internalFindViewById(R.id.loding_faile);
        this.f52887r = aVar.internalFindViewById(R.id.relodingimag);
        this.f52888s = (TextView) aVar.internalFindViewById(R.id.failedMessage);
        this.f52889t = (TextView) aVar.internalFindViewById(R.id.setting);
        this.f52890u = (TextView) aVar.internalFindViewById(R.id.setNetwork);
        View view = this.f52887r;
        if (view != null) {
            view.setOnClickListener(new g());
        }
        TextView textView = this.f52890u;
        if (textView != null) {
            textView.setOnClickListener(new h());
        }
        afterViews();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f52900z.a(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.SearchListFragment
    public void p0(SearchPostsBean searchPostsBean, int i4) {
        org.androidannotations.api.b.e("", new l(searchPostsBean, i4), 0L);
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.B.put(cls, t4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.SearchListFragment
    public void s0() {
        org.androidannotations.api.b.e("", new i(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.SearchListFragment
    public void showLoadFailed(String str) {
        org.androidannotations.api.b.e("", new o(str), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.SearchListFragment
    public void showLoadingView() {
        org.androidannotations.api.b.e("", new n(), 0L);
    }
}
