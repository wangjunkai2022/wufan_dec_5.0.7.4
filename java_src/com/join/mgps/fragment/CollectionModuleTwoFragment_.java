package com.join.mgps.fragment;

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
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.business.CollectionBeanSubBusiness;
import com.join.mgps.customview.XListView2;
import com.join.mgps.dto.CollectionBeanSub;
import com.join.mgps.dto.CollectionDataBean;
import com.join.mgps.ptr.PtrClassicFrameLayout;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.androidannotations.api.a;
/* loaded from: classes3.dex */
public final class CollectionModuleTwoFragment_ extends CollectionModuleTwoFragment implements y3.a, a4.a, a4.b {
    private View F;
    private final a4.c E = new a4.c();
    private final Map<Class<?>, Object> G = new HashMap();
    private final IntentFilter H = new IntentFilter();
    private final BroadcastReceiver I = new d();

    /* loaded from: classes3.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            CollectionModuleTwoFragment_.super.d0();
        }
    }

    /* loaded from: classes3.dex */
    class b extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CollectionDataBean f50369b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, long j4, String str2, CollectionDataBean collectionDataBean) {
            super(str, j4, str2);
            this.f50369b = collectionDataBean;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                CollectionModuleTwoFragment_.super.b0(this.f50369b);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes3.dex */
    class c extends a.c {
        c(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                CollectionModuleTwoFragment_.super.a0();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes3.dex */
    class d extends BroadcastReceiver {

        /* renamed from: b  reason: collision with root package name */
        public static final String f50372b = "gameData";

        d() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            CollectionModuleTwoFragment_.this.f0((CollectionBeanSub) (intent.getExtras() != null ? intent.getExtras() : new Bundle()).getSerializable("gameData"));
        }
    }

    /* loaded from: classes3.dex */
    class e implements View.OnClickListener {
        e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CollectionModuleTwoFragment_.this.relodingimag();
        }
    }

    /* loaded from: classes3.dex */
    class f implements View.OnClickListener {
        f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CollectionModuleTwoFragment_.this.setNetwork();
        }
    }

    /* loaded from: classes3.dex */
    class g implements Runnable {
        g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            CollectionModuleTwoFragment_.super.showLoding();
        }
    }

    /* loaded from: classes3.dex */
    class h implements Runnable {
        h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            CollectionModuleTwoFragment_.super.showLodingFailed();
        }
    }

    /* loaded from: classes3.dex */
    class i implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f50378b;

        i(List list) {
            this.f50378b = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            CollectionModuleTwoFragment_.super.showMain(this.f50378b);
        }
    }

    /* loaded from: classes3.dex */
    class j implements Runnable {
        j() {
        }

        @Override // java.lang.Runnable
        public void run() {
            CollectionModuleTwoFragment_.super.o0();
        }
    }

    /* loaded from: classes3.dex */
    class k implements Runnable {
        k() {
        }

        @Override // java.lang.Runnable
        public void run() {
            CollectionModuleTwoFragment_.super.e0();
        }
    }

    /* loaded from: classes3.dex */
    class l implements Runnable {
        l() {
        }

        @Override // java.lang.Runnable
        public void run() {
            CollectionModuleTwoFragment_.super.k0();
        }
    }

    /* loaded from: classes3.dex */
    public static class m extends org.androidannotations.api.builder.d<m, CollectionModuleTwoFragment> {
        @Override // org.androidannotations.api.builder.d
        /* renamed from: a */
        public CollectionModuleTwoFragment build() {
            CollectionModuleTwoFragment_ collectionModuleTwoFragment_ = new CollectionModuleTwoFragment_();
            collectionModuleTwoFragment_.setArguments(this.args);
            return collectionModuleTwoFragment_;
        }
    }

    public static m A0() {
        return new m();
    }

    private void init_(Bundle bundle) {
        Resources resources = getActivity().getResources();
        a4.c.b(this);
        this.f50354p = resources.getString(R.string.net_excption);
        this.f50355q = resources.getString(R.string.connect_server_excption);
        this.H.addAction(o1.a.I);
        this.H.addAction(o1.a.G);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.CollectionModuleTwoFragment
    public void a0() {
        org.androidannotations.api.a.l(new c("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.CollectionModuleTwoFragment
    public void b0(CollectionDataBean collectionDataBean) {
        org.androidannotations.api.a.l(new b("", 0L, "", collectionDataBean));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.CollectionModuleTwoFragment
    public void d0() {
        org.androidannotations.api.b.e("", new a(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.CollectionModuleTwoFragment
    public void e0() {
        org.androidannotations.api.b.e("", new k(), 0L);
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.G.get(cls);
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        View view = this.F;
        if (view == null) {
            return null;
        }
        return (T) view.findViewById(i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.CollectionModuleTwoFragment
    public void k0() {
        org.androidannotations.api.b.e("", new l(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.CollectionModuleTwoFragment
    public void o0() {
        org.androidannotations.api.b.e("", new j(), 0L);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.E);
        init_(bundle);
        super.onCreate(bundle);
        getActivity().registerReceiver(this.I, this.H);
        a4.c.c(c5);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        this.F = onCreateView;
        if (onCreateView == null) {
            this.F = layoutInflater.inflate(R.layout.collection_break, viewGroup, false);
        }
        return this.F;
    }

    @Override // com.join.mgps.fragment.CollectionModuleTwoFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        getActivity().unregisterReceiver(this.I);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.F = null;
        this.f50342d = null;
        this.f50343e = null;
        this.f50344f = null;
        this.f50345g = null;
        this.f50346h = null;
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f50342d = (PtrClassicFrameLayout) aVar.internalFindViewById(R.id.mPtrFrame);
        this.f50343e = (XListView2) aVar.internalFindViewById(R.id.breakListView);
        this.f50344f = (LinearLayout) aVar.internalFindViewById(R.id.loding_layout);
        this.f50345g = (LinearLayout) aVar.internalFindViewById(R.id.loding_faile);
        this.f50346h = (ImageView) aVar.internalFindViewById(R.id.relodingimag);
        View internalFindViewById = aVar.internalFindViewById(R.id.setNetwork);
        ImageView imageView = this.f50346h;
        if (imageView != null) {
            imageView.setOnClickListener(new e());
        }
        if (internalFindViewById != null) {
            internalFindViewById.setOnClickListener(new f());
        }
        afterViews();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.E.a(this);
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.G.put(cls, t4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.CollectionModuleTwoFragment
    public void showLoding() {
        org.androidannotations.api.b.e("", new g(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.CollectionModuleTwoFragment
    public void showLodingFailed() {
        org.androidannotations.api.b.e("", new h(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.CollectionModuleTwoFragment
    public void showMain(List<CollectionBeanSubBusiness> list) {
        org.androidannotations.api.b.e("", new i(list), 0L);
    }
}
