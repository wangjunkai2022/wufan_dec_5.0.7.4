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
public final class ForumPostsFragment_ extends ForumPostsFragment implements y3.a, a4.a, a4.b {
    private View G;
    private final a4.c F = new a4.c();
    private final Map<Class<?>, Object> H = new HashMap();
    private final IntentFilter I = new IntentFilter();
    private final BroadcastReceiver J = new b();

    /* loaded from: classes3.dex */
    class a extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f51443b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, long j4, String str2, int i4) {
            super(str, j4, str2);
            this.f51443b = i4;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                ForumPostsFragment_.super.o0(this.f51443b);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes3.dex */
    class b extends BroadcastReceiver {

        /* renamed from: b  reason: collision with root package name */
        public static final String f51445b = "gameData";

        b() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            ForumPostsFragment_.this.n0((CollectionBeanSub) (intent.getExtras() != null ? intent.getExtras() : new Bundle()).getSerializable("gameData"));
        }
    }

    /* loaded from: classes3.dex */
    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ForumPostsFragment_.super.E0();
        }
    }

    /* loaded from: classes3.dex */
    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ForumPostsFragment_.super.l0();
        }
    }

    /* loaded from: classes3.dex */
    class e implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f51449b;

        e(int i4) {
            this.f51449b = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            ForumPostsFragment_.super.a0(this.f51449b);
        }
    }

    /* loaded from: classes3.dex */
    class f implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DetailResultBean f51451b;

        f(DetailResultBean detailResultBean) {
            this.f51451b = detailResultBean;
        }

        @Override // java.lang.Runnable
        public void run() {
            ForumPostsFragment_.super.D0(this.f51451b);
        }
    }

    /* loaded from: classes3.dex */
    class g implements Runnable {
        g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ForumPostsFragment_.super.B0();
        }
    }

    /* loaded from: classes3.dex */
    class h implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f51454b;

        h(String str) {
            this.f51454b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            ForumPostsFragment_.super.showMessage(this.f51454b);
        }
    }

    /* loaded from: classes3.dex */
    class i extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f51456b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(String str, long j4, String str2, int i4) {
            super(str, j4, str2);
            this.f51456b = i4;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                ForumPostsFragment_.super.e0(this.f51456b);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes3.dex */
    class j extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f51458b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(String str, long j4, String str2, String str3) {
            super(str, j4, str2);
            this.f51458b = str3;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                ForumPostsFragment_.super.c0(this.f51458b);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes3.dex */
    public static class k extends org.androidannotations.api.builder.d<k, ForumPostsFragment> {
        @Override // org.androidannotations.api.builder.d
        /* renamed from: a */
        public ForumPostsFragment build() {
            ForumPostsFragment_ forumPostsFragment_ = new ForumPostsFragment_();
            forumPostsFragment_.setArguments(this.args);
            return forumPostsFragment_;
        }
    }

    public static k R0() {
        return new k();
    }

    private void init_(Bundle bundle) {
        a4.c.b(this);
        this.I.addAction(o1.a.I);
        this.I.addAction(o1.a.G);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.ForumPostsFragment
    public void B0() {
        org.androidannotations.api.b.e("", new g(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.ForumPostsFragment
    public void D0(DetailResultBean detailResultBean) {
        org.androidannotations.api.b.e("", new f(detailResultBean), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.ForumPostsFragment
    public void E0() {
        org.androidannotations.api.b.e("", new c(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.ForumPostsFragment
    public void a0(int i4) {
        org.androidannotations.api.b.e("", new e(i4), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.ForumPostsFragment
    public void c0(String str) {
        org.androidannotations.api.a.l(new j("", 0L, "", str));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.ForumPostsFragment
    public void e0(int i4) {
        org.androidannotations.api.a.l(new i("", 0L, "", i4));
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.H.get(cls);
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        View view = this.G;
        if (view == null) {
            return null;
        }
        return (T) view.findViewById(i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.ForumPostsFragment
    public void l0() {
        org.androidannotations.api.b.e("", new d(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.ForumPostsFragment
    public void o0(int i4) {
        org.androidannotations.api.a.l(new a("", 0L, "", i4));
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.F);
        init_(bundle);
        super.onCreate(bundle);
        getActivity().registerReceiver(this.J, this.I);
        a4.c.c(c5);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        this.G = onCreateView;
        if (onCreateView == null) {
            this.G = layoutInflater.inflate(R.layout.mg_forum_all_fragment, viewGroup, false);
        }
        return this.G;
    }

    @Override // com.join.mgps.fragment.ForumPostsFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        getActivity().unregisterReceiver(this.J);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.G = null;
        this.f51416l = null;
        this.f51417m = null;
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f51416l = (ForumLoadingView) aVar.internalFindViewById(R.id.loadingView);
        this.f51417m = (XListView2) aVar.internalFindViewById(R.id.forum_posts_list);
        afterViews();
    }

    @Override // com.join.mgps.fragment.ForumPostsFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.F.a(this);
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.H.put(cls, t4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.ForumPostsFragment
    public void showMessage(String str) {
        org.androidannotations.api.b.e("", new h(str), 0L);
    }
}
