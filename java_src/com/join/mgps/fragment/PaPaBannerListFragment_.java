package com.join.mgps.fragment;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.XListView2;
import com.join.mgps.dto.CollectionBeanSub;
import com.join.mgps.dto.PaPaBean;
import com.join.mgps.ptr.PtrClassicFrameLayout;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.androidannotations.api.a;
/* loaded from: classes3.dex */
public final class PaPaBannerListFragment_ extends PaPaBannerListFragment implements y3.a, a4.a, a4.b {
    private View K;
    private final a4.c J = new a4.c();
    private final Map<Class<?>, Object> L = new HashMap();
    private final IntentFilter M = new IntentFilter();
    private final BroadcastReceiver N = new c();

    /* loaded from: classes3.dex */
    class a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f52536b;

        a(String str) {
            this.f52536b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            PaPaBannerListFragment_.super.showToast(this.f52536b);
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
                PaPaBannerListFragment_.super.Z();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes3.dex */
    class c extends BroadcastReceiver {

        /* renamed from: b  reason: collision with root package name */
        public static final String f52539b = "gameData";

        c() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            PaPaBannerListFragment_.this.n0((CollectionBeanSub) (intent.getExtras() != null ? intent.getExtras() : new Bundle()).getSerializable("gameData"));
        }
    }

    /* loaded from: classes3.dex */
    class d implements View.OnClickListener {
        d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            PaPaBannerListFragment_.this.relodingimag();
        }
    }

    /* loaded from: classes3.dex */
    class e implements View.OnClickListener {
        e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            PaPaBannerListFragment_.this.setNetwork();
        }
    }

    /* loaded from: classes3.dex */
    class f implements Runnable {
        f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            PaPaBannerListFragment_.super.v0();
        }
    }

    /* loaded from: classes3.dex */
    class g implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f52544b;

        g(List list) {
            this.f52544b = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            PaPaBannerListFragment_.super.A0(this.f52544b);
        }
    }

    /* loaded from: classes3.dex */
    class h implements Runnable {
        h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            PaPaBannerListFragment_.super.t0();
        }
    }

    /* loaded from: classes3.dex */
    class i implements Runnable {
        i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            PaPaBannerListFragment_.super.u0();
        }
    }

    /* loaded from: classes3.dex */
    class j implements Runnable {
        j() {
        }

        @Override // java.lang.Runnable
        public void run() {
            PaPaBannerListFragment_.super.s0();
        }
    }

    /* loaded from: classes3.dex */
    class k implements Runnable {
        k() {
        }

        @Override // java.lang.Runnable
        public void run() {
            PaPaBannerListFragment_.super.hideLoading();
        }
    }

    /* loaded from: classes3.dex */
    public static class l extends org.androidannotations.api.builder.d<l, PaPaBannerListFragment> {
        @Override // org.androidannotations.api.builder.d
        /* renamed from: a */
        public PaPaBannerListFragment build() {
            PaPaBannerListFragment_ paPaBannerListFragment_ = new PaPaBannerListFragment_();
            paPaBannerListFragment_.setArguments(this.args);
            return paPaBannerListFragment_;
        }
    }

    public static l N0() {
        return new l();
    }

    private void init_(Bundle bundle) {
        a4.c.b(this);
        this.M.addAction(o1.a.I);
        this.M.addAction(o1.a.G);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.PaPaBannerListFragment
    public void A0(List<PaPaBean> list) {
        org.androidannotations.api.b.e("", new g(list), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.PaPaBannerListFragment
    public void Z() {
        org.androidannotations.api.a.l(new b("", 0L, ""));
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.L.get(cls);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.PaPaBannerListFragment
    public void hideLoading() {
        org.androidannotations.api.b.e("", new k(), 0L);
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        View view = this.K;
        if (view == null) {
            return null;
        }
        return (T) view.findViewById(i4);
    }

    @Override // com.join.mgps.fragment.PaPaBannerListFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.J);
        init_(bundle);
        super.onCreate(bundle);
        getActivity().registerReceiver(this.N, this.M);
        a4.c.c(c5);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        this.K = onCreateView;
        if (onCreateView == null) {
            this.K = layoutInflater.inflate(R.layout.fragment_papa_banner_list, viewGroup, false);
        }
        return this.K;
    }

    @Override // com.join.mgps.fragment.PaPaBannerListFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        getActivity().unregisterReceiver(this.N);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.K = null;
        this.f52513f = null;
        this.f52516i = null;
        this.f52517j = null;
        this.f52518k = null;
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f52513f = (XListView2) aVar.internalFindViewById(R.id.mListView);
        this.f52516i = (LinearLayout) aVar.internalFindViewById(R.id.loding_faile);
        this.f52517j = (LinearLayout) aVar.internalFindViewById(R.id.loding_layout);
        this.f52518k = (PtrClassicFrameLayout) aVar.internalFindViewById(R.id.mPtrFrame);
        View internalFindViewById = aVar.internalFindViewById(R.id.relodingimag);
        View internalFindViewById2 = aVar.internalFindViewById(R.id.setNetwork);
        if (internalFindViewById != null) {
            internalFindViewById.setOnClickListener(new d());
        }
        if (internalFindViewById2 != null) {
            internalFindViewById2.setOnClickListener(new e());
        }
        afterViews();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.J.a(this);
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.L.put(cls, t4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.PaPaBannerListFragment
    public void s0() {
        org.androidannotations.api.b.e("", new j(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.PaPaBannerListFragment
    public void showToast(String str) {
        org.androidannotations.api.b.e("", new a(str), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.PaPaBannerListFragment
    public void t0() {
        org.androidannotations.api.b.e("", new h(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.PaPaBannerListFragment
    public void u0() {
        org.androidannotations.api.b.e("", new i(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.PaPaBannerListFragment
    public void v0() {
        org.androidannotations.api.b.e("", new f(), 0L);
    }
}
