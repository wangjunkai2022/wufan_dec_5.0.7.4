package com.join.mgps.fragment;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.ForumLoadingView;
import com.join.mgps.customview.XListView2;
import com.join.mgps.dto.CollectionBeanSub;
import com.join.mgps.dto.DetailResultBean;
import java.util.HashMap;
import java.util.Map;
import org.androidannotations.api.a;
/* loaded from: classes3.dex */
public final class ForumGroupPostsFragment_ extends ForumGroupPostsFragment implements y3.a, a4.a, a4.b {
    private View I;
    private final a4.c H = new a4.c();
    private final Map<Class<?>, Object> J = new HashMap();
    private final IntentFilter K = new IntentFilter();
    private final BroadcastReceiver L = new c();

    /* loaded from: classes3.dex */
    class a extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f51311b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, long j4, String str2, String str3) {
            super(str, j4, str2);
            this.f51311b = str3;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                ForumGroupPostsFragment_.super.d0(this.f51311b);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes3.dex */
    class b extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f51313b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, long j4, String str2, int i4) {
            super(str, j4, str2);
            this.f51313b = i4;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                ForumGroupPostsFragment_.super.p0(this.f51313b);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes3.dex */
    class c extends BroadcastReceiver {

        /* renamed from: b  reason: collision with root package name */
        public static final String f51315b = "gameData";

        c() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            ForumGroupPostsFragment_.this.o0((CollectionBeanSub) (intent.getExtras() != null ? intent.getExtras() : new Bundle()).getSerializable("gameData"));
        }
    }

    /* loaded from: classes3.dex */
    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ForumGroupPostsFragment_.super.F0();
        }
    }

    /* loaded from: classes3.dex */
    class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ForumGroupPostsFragment_.super.m0();
        }
    }

    /* loaded from: classes3.dex */
    class f implements Runnable {
        f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ForumGroupPostsFragment_.super.k0();
        }
    }

    /* loaded from: classes3.dex */
    class g implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f51320b;

        g(int i4) {
            this.f51320b = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            ForumGroupPostsFragment_.super.b0(this.f51320b);
        }
    }

    /* loaded from: classes3.dex */
    class h implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DetailResultBean f51322b;

        h(DetailResultBean detailResultBean) {
            this.f51322b = detailResultBean;
        }

        @Override // java.lang.Runnable
        public void run() {
            ForumGroupPostsFragment_.super.E0(this.f51322b);
        }
    }

    /* loaded from: classes3.dex */
    class i implements Runnable {
        i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ForumGroupPostsFragment_.super.C0();
        }
    }

    /* loaded from: classes3.dex */
    class j implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f51325b;

        j(String str) {
            this.f51325b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            ForumGroupPostsFragment_.super.showMessage(this.f51325b);
        }
    }

    /* loaded from: classes3.dex */
    class k extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f51327b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(String str, long j4, String str2, int i4) {
            super(str, j4, str2);
            this.f51327b = i4;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                ForumGroupPostsFragment_.super.f0(this.f51327b);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes3.dex */
    public static class l extends org.androidannotations.api.builder.d<l, ForumGroupPostsFragment> {
        @Override // org.androidannotations.api.builder.d
        /* renamed from: a */
        public ForumGroupPostsFragment build() {
            ForumGroupPostsFragment_ forumGroupPostsFragment_ = new ForumGroupPostsFragment_();
            forumGroupPostsFragment_.setArguments(this.args);
            return forumGroupPostsFragment_;
        }
    }

    public static l S0() {
        return new l();
    }

    private void init_(Bundle bundle) {
        a4.c.b(this);
        this.K.addAction(o1.a.I);
        this.K.addAction(o1.a.G);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.ForumGroupPostsFragment
    public void C0() {
        org.androidannotations.api.b.e("", new i(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.ForumGroupPostsFragment
    public void E0(DetailResultBean detailResultBean) {
        org.androidannotations.api.b.e("", new h(detailResultBean), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.ForumGroupPostsFragment
    public void F0() {
        org.androidannotations.api.b.e("", new d(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.ForumGroupPostsFragment
    public void b0(int i4) {
        org.androidannotations.api.b.e("", new g(i4), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.ForumGroupPostsFragment
    public void d0(String str) {
        org.androidannotations.api.a.l(new a("", 0L, "", str));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.ForumGroupPostsFragment
    public void f0(int i4) {
        org.androidannotations.api.a.l(new k("", 0L, "", i4));
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.J.get(cls);
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        View view = this.I;
        if (view == null) {
            return null;
        }
        return (T) view.findViewById(i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.ForumGroupPostsFragment
    public void k0() {
        org.androidannotations.api.b.e("", new f(), 500L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.ForumGroupPostsFragment
    public void m0() {
        org.androidannotations.api.b.e("", new e(), 0L);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.H);
        init_(bundle);
        super.onCreate(bundle);
        getActivity().registerReceiver(this.L, this.K);
        a4.c.c(c5);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        this.I = onCreateView;
        if (onCreateView == null) {
            this.I = layoutInflater.inflate(R.layout.mg_forum_all_fragment, viewGroup, false);
        }
        return this.I;
    }

    @Override // com.join.mgps.fragment.ForumGroupPostsFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        getActivity().unregisterReceiver(this.L);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.I = null;
        this.f51282l = null;
        this.f51283m = null;
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f51282l = (ForumLoadingView) aVar.internalFindViewById(R.id.loadingView);
        this.f51283m = (XListView2) aVar.internalFindViewById(R.id.forum_posts_list);
        afterViews();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.H.a(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.ForumGroupPostsFragment
    public void p0(int i4) {
        org.androidannotations.api.a.l(new b("", 0L, "", i4));
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.J.put(cls, t4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.ForumGroupPostsFragment
    public void showMessage(String str) {
        org.androidannotations.api.b.e("", new j(str), 0L);
    }
}
