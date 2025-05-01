package com.join.mgps.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.dto.ClassfyTypeBean;
import com.join.mgps.dto.SearchAutoDataBean;
import com.join.mgps.dto.SearchGameListBean;
import com.zhy.view.flowlayout.TagFlowLayout3;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.androidannotations.api.a;
/* loaded from: classes4.dex */
public final class SearchListActivity1_ extends SearchListActivity1 implements y3.a, a4.a, a4.b {
    public static final String Q = "currentTab";
    public static final String R = "game_id";
    public static final String S = "keyword";
    public static final String T = "isNeedRecommend";
    public static final String U = "from";
    private final a4.c O = new a4.c();
    private final Map<Class<?>, Object> P = new HashMap();

    /* loaded from: classes4.dex */
    class a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f37365b;

        a(int i4) {
            this.f37365b = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            SearchListActivity1_.super.O0(this.f37365b);
        }
    }

    /* loaded from: classes4.dex */
    class b implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f37367b;

        b(boolean z4) {
            this.f37367b = z4;
        }

        @Override // java.lang.Runnable
        public void run() {
            SearchListActivity1_.super.u0(this.f37367b);
        }
    }

    /* loaded from: classes4.dex */
    class c implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f37369b;

        c(String str) {
            this.f37369b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            SearchListActivity1_.super.h0(this.f37369b);
        }
    }

    /* loaded from: classes4.dex */
    class d implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f37371b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f37372c;

        d(List list, String str) {
            this.f37371b = list;
            this.f37372c = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            SearchListActivity1_.super.R0(this.f37371b, this.f37372c);
        }
    }

    /* loaded from: classes4.dex */
    class e extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f37374b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f37375c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(String str, long j4, String str2, int i4, boolean z4) {
            super(str, j4, str2);
            this.f37374b = i4;
            this.f37375c = z4;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                SearchListActivity1_.super.s0(this.f37374b, this.f37375c);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class f extends a.c {
        f(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                SearchListActivity1_.super.D0();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class g extends a.c {
        g(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                SearchListActivity1_.super.H0();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class h extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f37379b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(String str, long j4, String str2, String str3) {
            super(str, j4, str2);
            this.f37379b = str3;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                SearchListActivity1_.super.r0(this.f37379b);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class i implements View.OnClickListener {
        i() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SearchListActivity1_.this.back();
        }
    }

    /* loaded from: classes4.dex */
    class j implements View.OnClickListener {
        j() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SearchListActivity1_.this.search();
        }
    }

    /* loaded from: classes4.dex */
    class k implements View.OnClickListener {
        k() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SearchListActivity1_.this.clear();
        }
    }

    /* loaded from: classes4.dex */
    class l implements View.OnClickListener {
        l() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SearchListActivity1_.this.E0();
        }
    }

    /* loaded from: classes4.dex */
    class m implements View.OnClickListener {
        m() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SearchListActivity1_.this.F0();
        }
    }

    /* loaded from: classes4.dex */
    class n implements View.OnClickListener {
        n() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SearchListActivity1_.this.G0();
        }
    }

    /* loaded from: classes4.dex */
    class o implements Runnable {
        o() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SearchListActivity1_.super.w0();
        }
    }

    /* loaded from: classes4.dex */
    class p implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ SearchGameListBean f37388b;

        p(SearchGameListBean searchGameListBean) {
            this.f37388b = searchGameListBean;
        }

        @Override // java.lang.Runnable
        public void run() {
            SearchListActivity1_.super.Q0(this.f37388b);
        }
    }

    /* loaded from: classes4.dex */
    class q implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ClassfyTypeBean f37390b;

        q(ClassfyTypeBean classfyTypeBean) {
            this.f37390b = classfyTypeBean;
        }

        @Override // java.lang.Runnable
        public void run() {
            SearchListActivity1_.super.K0(this.f37390b);
        }
    }

    /* loaded from: classes4.dex */
    public static class r extends org.androidannotations.api.builder.a<r> {

        /* renamed from: a  reason: collision with root package name */
        private Fragment f37392a;

        public r(Context context) {
            super(context, SearchListActivity1_.class);
        }

        public r a(int i4) {
            return (r) super.extra("currentTab", i4);
        }

        public r b(int i4) {
            return (r) super.extra("from", i4);
        }

        public r c(String str) {
            return (r) super.extra("game_id", str);
        }

        public r d(boolean z4) {
            return (r) super.extra(SearchListActivity1_.T, z4);
        }

        public r e(String str) {
            return (r) super.extra("keyword", str);
        }

        @Override // org.androidannotations.api.builder.a, org.androidannotations.api.builder.b
        public org.androidannotations.api.builder.f startForResult(int i4) {
            Fragment fragment = this.f37392a;
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

        public r(Fragment fragment) {
            super(fragment.getActivity(), SearchListActivity1_.class);
            this.f37392a = fragment;
        }
    }

    public static r d1(Context context) {
        return new r(context);
    }

    public static r e1(Fragment fragment) {
        return new r(fragment);
    }

    private void init_(Bundle bundle) {
        a4.c.b(this);
        injectExtras_();
    }

    private void injectExtras_() {
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            if (extras.containsKey("currentTab")) {
                this.f37331p = extras.getInt("currentTab");
            }
            if (extras.containsKey("game_id")) {
                this.f37332q = extras.getString("game_id");
            }
            if (extras.containsKey("keyword")) {
                this.f37333r = extras.getString("keyword");
            }
            if (extras.containsKey(T)) {
                this.f37334s = extras.getBoolean(T);
            }
            if (extras.containsKey("from")) {
                this.f37335t = extras.getInt("from");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.SearchListActivity1
    public void D0() {
        org.androidannotations.api.a.l(new f("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.SearchListActivity1
    public void H0() {
        org.androidannotations.api.a.l(new g("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.SearchListActivity1
    public void K0(ClassfyTypeBean classfyTypeBean) {
        org.androidannotations.api.b.e("", new q(classfyTypeBean), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.SearchListActivity1
    public void O0(int i4) {
        org.androidannotations.api.b.e("", new a(i4), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.SearchListActivity1
    public void Q0(SearchGameListBean searchGameListBean) {
        org.androidannotations.api.b.e("", new p(searchGameListBean), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.SearchListActivity1
    public void R0(List<SearchAutoDataBean> list, String str) {
        org.androidannotations.api.b.e("", new d(list, str), 0L);
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.P.get(cls);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.SearchListActivity1
    public void h0(String str) {
        org.androidannotations.api.b.e("", new c(str), 0L);
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        return (T) findViewById(i4);
    }

    @Override // com.join.mgps.activity.SearchListActivity1, com.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.O);
        init_(bundle);
        super.onCreate(bundle);
        a4.c.c(c5);
        setContentView(R.layout.search_list_activity1);
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f37317b = aVar.internalFindViewById(R.id.clear);
        this.f37318c = aVar.internalFindViewById(R.id.tagBackground);
        this.f37319d = (TagFlowLayout3) aVar.internalFindViewById(R.id.languages);
        this.f37320e = (TagFlowLayout3) aVar.internalFindViewById(R.id.classifies);
        this.f37321f = (EditText) aVar.internalFindViewById(R.id.input);
        this.f37322g = (TabLayout) aVar.internalFindViewById(R.id.tabLayout);
        this.f37323h = (ViewPager) aVar.internalFindViewById(R.id.viewPager);
        this.f37324i = (ListView) aVar.internalFindViewById(R.id.autoListView);
        this.f37325j = (ImageView) aVar.internalFindViewById(R.id.iv_filter);
        this.f37326k = (LinearLayout) aVar.internalFindViewById(R.id.ll_filter);
        this.f37327l = (ImageView) aVar.internalFindViewById(R.id.back);
        View internalFindViewById = aVar.internalFindViewById(R.id.search);
        View internalFindViewById2 = aVar.internalFindViewById(R.id.tv_filter_close);
        View internalFindViewById3 = aVar.internalFindViewById(R.id.tv_filter_confirm);
        ImageView imageView = this.f37327l;
        if (imageView != null) {
            imageView.setOnClickListener(new i());
        }
        if (internalFindViewById != null) {
            internalFindViewById.setOnClickListener(new j());
        }
        View view = this.f37317b;
        if (view != null) {
            view.setOnClickListener(new k());
        }
        ImageView imageView2 = this.f37325j;
        if (imageView2 != null) {
            imageView2.setOnClickListener(new l());
        }
        if (internalFindViewById2 != null) {
            internalFindViewById2.setOnClickListener(new m());
        }
        if (internalFindViewById3 != null) {
            internalFindViewById3.setOnClickListener(new n());
        }
        afterViews();
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.P.put(cls, t4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.SearchListActivity1
    public void r0(String str) {
        org.androidannotations.api.a.l(new h("", 0L, "", str));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.SearchListActivity1
    public void s0(int i4, boolean z4) {
        org.androidannotations.api.a.l(new e("", 0L, "", i4, z4));
    }

    @Override // com.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i4) {
        super.setContentView(i4);
        this.O.a(this);
    }

    @Override // android.app.Activity
    public void setIntent(Intent intent) {
        super.setIntent(intent);
        injectExtras_();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.SearchListActivity1
    public void u0(boolean z4) {
        org.androidannotations.api.b.e("", new b(z4), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.SearchListActivity1
    public void w0() {
        org.androidannotations.api.b.e("", new o(), 0L);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        this.O.a(this);
    }

    @Override // com.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        super.setContentView(view);
        this.O.a(this);
    }
}
