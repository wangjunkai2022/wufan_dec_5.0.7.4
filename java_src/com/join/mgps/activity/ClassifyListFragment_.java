package com.join.mgps.activity;

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
/* loaded from: classes4.dex */
public final class ClassifyListFragment_ extends ClassifyListFragment implements y3.a, a4.a, a4.b {
    private View G;
    private final a4.c F = new a4.c();
    private final Map<Class<?>, Object> H = new HashMap();
    private final IntentFilter I = new IntentFilter();
    private final BroadcastReceiver J = new c();

    /* loaded from: classes4.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ClassifyListFragment_.super.m0();
        }
    }

    /* loaded from: classes4.dex */
    class b extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f28728b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f28729c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, long j4, String str2, String str3, String str4) {
            super(str, j4, str2);
            this.f28728b = str3;
            this.f28729c = str4;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                ClassifyListFragment_.super.f0(this.f28728b, this.f28729c);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class c extends BroadcastReceiver {

        /* renamed from: b  reason: collision with root package name */
        public static final String f28731b = "gameData";

        c() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            ClassifyListFragment_.this.o0((CollectionBeanSub) (intent.getExtras() != null ? intent.getExtras() : new Bundle()).getSerializable("gameData"));
        }
    }

    /* loaded from: classes4.dex */
    class d implements View.OnClickListener {
        d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ClassifyListFragment_.this.relodingimag();
        }
    }

    /* loaded from: classes4.dex */
    class e implements View.OnClickListener {
        e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ClassifyListFragment_.this.n0();
        }
    }

    /* loaded from: classes4.dex */
    class f implements View.OnClickListener {
        f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ClassifyListFragment_.this.g0();
        }
    }

    /* loaded from: classes4.dex */
    class g implements View.OnClickListener {
        g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ClassifyListFragment_.this.t0();
        }
    }

    /* loaded from: classes4.dex */
    class h implements View.OnClickListener {
        h() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ClassifyListFragment_.this.setNetwork();
        }
    }

    /* loaded from: classes4.dex */
    class i implements Runnable {
        i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ClassifyListFragment_.super.showLoding();
        }
    }

    /* loaded from: classes4.dex */
    class j implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f28739b;

        j(boolean z4) {
            this.f28739b = z4;
        }

        @Override // java.lang.Runnable
        public void run() {
            ClassifyListFragment_.super.x0(this.f28739b);
        }
    }

    /* loaded from: classes4.dex */
    class k implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f28741b;

        k(List list) {
            this.f28741b = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            ClassifyListFragment_.super.showMain(this.f28741b);
        }
    }

    /* loaded from: classes4.dex */
    public static class l extends org.androidannotations.api.builder.d<l, ClassifyListFragment> {
        @Override // org.androidannotations.api.builder.d
        /* renamed from: a */
        public ClassifyListFragment build() {
            ClassifyListFragment_ classifyListFragment_ = new ClassifyListFragment_();
            classifyListFragment_.setArguments(this.args);
            return classifyListFragment_;
        }
    }

    public static l I0() {
        return new l();
    }

    private void init_(Bundle bundle) {
        a4.c.b(this);
        this.I.addAction(o1.a.I);
        this.I.addAction(o1.a.G);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ClassifyListFragment
    public void f0(String str, String str2) {
        org.androidannotations.api.a.l(new b("", 0L, "", str, str2));
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
    @Override // com.join.mgps.activity.ClassifyListFragment
    public void m0() {
        org.androidannotations.api.b.e("", new a(), 0L);
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
            this.G = layoutInflater.inflate(R.layout.classify_list_layout, viewGroup, false);
        }
        return this.G;
    }

    @Override // com.join.mgps.activity.ClassifyListFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        getActivity().unregisterReceiver(this.J);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.G = null;
        this.f28702e = null;
        this.f28703f = null;
        this.f28704g = null;
        this.f28705h = null;
        this.f28706i = null;
        this.f28707j = null;
        this.f28708k = null;
        this.f28709l = null;
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f28702e = (RelativeLayout) aVar.internalFindViewById(R.id.rootRl);
        this.f28703f = (XListView2) aVar.internalFindViewById(R.id.classifyListView);
        this.f28704g = (PtrClassicFrameLayout) aVar.internalFindViewById(R.id.mPtrFrame);
        this.f28705h = (LinearLayout) aVar.internalFindViewById(R.id.loding_layout);
        this.f28706i = (LinearLayout) aVar.internalFindViewById(R.id.loding_faile);
        this.f28707j = (LinearLayout) aVar.internalFindViewById(R.id.loading_none);
        this.f28708k = (ImageView) aVar.internalFindViewById(R.id.relodingimag);
        this.f28709l = (ImageView) aVar.internalFindViewById(R.id.noneReloadImage);
        View internalFindViewById = aVar.internalFindViewById(R.id.mg_loading);
        View internalFindViewById2 = aVar.internalFindViewById(R.id.setAll);
        View internalFindViewById3 = aVar.internalFindViewById(R.id.setNetwork);
        ImageView imageView = this.f28708k;
        if (imageView != null) {
            imageView.setOnClickListener(new d());
        }
        ImageView imageView2 = this.f28709l;
        if (imageView2 != null) {
            imageView2.setOnClickListener(new e());
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
        afterViews();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.F.a(this);
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.H.put(cls, t4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ClassifyListFragment
    public void showLoding() {
        org.androidannotations.api.b.e("", new i(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ClassifyListFragment
    public void showMain(List<CollectionBeanSubBusiness> list) {
        org.androidannotations.api.b.e("", new k(list), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ClassifyListFragment
    public void x0(boolean z4) {
        org.androidannotations.api.b.e("", new j(z4), 0L);
    }
}
