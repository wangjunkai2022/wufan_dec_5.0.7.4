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
public final class CollectionModuleFourFragment_ extends CollectionModuleFourFragment implements y3.a, a4.a, a4.b {

    /* renamed from: z  reason: collision with root package name */
    private View f50325z;

    /* renamed from: y  reason: collision with root package name */
    private final a4.c f50324y = new a4.c();
    private final Map<Class<?>, Object> A = new HashMap();
    private final IntentFilter B = new IntentFilter();
    private final BroadcastReceiver C = new c();

    /* loaded from: classes3.dex */
    class a extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CollectionDataBean f50326b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, long j4, String str2, CollectionDataBean collectionDataBean) {
            super(str, j4, str2);
            this.f50326b = collectionDataBean;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                CollectionModuleFourFragment_.super.a0(this.f50326b);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
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
                CollectionModuleFourFragment_.super.b0();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes3.dex */
    class c extends BroadcastReceiver {

        /* renamed from: b  reason: collision with root package name */
        public static final String f50329b = "gameData";

        c() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            CollectionModuleFourFragment_.this.f0((CollectionBeanSub) (intent.getExtras() != null ? intent.getExtras() : new Bundle()).getSerializable("gameData"));
        }
    }

    /* loaded from: classes3.dex */
    class d implements View.OnClickListener {
        d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CollectionModuleFourFragment_.this.relodingimag();
        }
    }

    /* loaded from: classes3.dex */
    class e implements View.OnClickListener {
        e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CollectionModuleFourFragment_.this.d0();
        }
    }

    /* loaded from: classes3.dex */
    class f implements View.OnClickListener {
        f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CollectionModuleFourFragment_.this.setNetwork();
        }
    }

    /* loaded from: classes3.dex */
    class g implements Runnable {
        g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            CollectionModuleFourFragment_.super.showLoding();
        }
    }

    /* loaded from: classes3.dex */
    class h implements Runnable {
        h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            CollectionModuleFourFragment_.super.showLodingFailed();
        }
    }

    /* loaded from: classes3.dex */
    class i implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f50336b;

        i(List list) {
            this.f50336b = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            CollectionModuleFourFragment_.super.showMain(this.f50336b);
        }
    }

    /* loaded from: classes3.dex */
    class j implements Runnable {
        j() {
        }

        @Override // java.lang.Runnable
        public void run() {
            CollectionModuleFourFragment_.super.n0();
        }
    }

    /* loaded from: classes3.dex */
    class k implements Runnable {
        k() {
        }

        @Override // java.lang.Runnable
        public void run() {
            CollectionModuleFourFragment_.super.e0();
        }
    }

    /* loaded from: classes3.dex */
    public static class l extends org.androidannotations.api.builder.d<l, CollectionModuleFourFragment> {
        @Override // org.androidannotations.api.builder.d
        /* renamed from: a */
        public CollectionModuleFourFragment build() {
            CollectionModuleFourFragment_ collectionModuleFourFragment_ = new CollectionModuleFourFragment_();
            collectionModuleFourFragment_.setArguments(this.args);
            return collectionModuleFourFragment_;
        }
    }

    private void init_(Bundle bundle) {
        Resources resources = getActivity().getResources();
        a4.c.b(this);
        this.f50310m = resources.getString(R.string.net_excption);
        this.f50311n = resources.getString(R.string.connect_server_excption);
        this.B.addAction(o1.a.I);
        this.B.addAction(o1.a.G);
    }

    public static l x0() {
        return new l();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.CollectionModuleFourFragment
    public void a0(CollectionDataBean collectionDataBean) {
        org.androidannotations.api.a.l(new a("", 0L, "", collectionDataBean));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.CollectionModuleFourFragment
    public void b0() {
        org.androidannotations.api.a.l(new b("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.CollectionModuleFourFragment
    public void e0() {
        org.androidannotations.api.b.e("", new k(), 0L);
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.A.get(cls);
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        View view = this.f50325z;
        if (view == null) {
            return null;
        }
        return (T) view.findViewById(i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.CollectionModuleFourFragment
    public void n0() {
        org.androidannotations.api.b.e("", new j(), 0L);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.f50324y);
        init_(bundle);
        super.onCreate(bundle);
        getActivity().registerReceiver(this.C, this.B);
        a4.c.c(c5);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        this.f50325z = onCreateView;
        if (onCreateView == null) {
            this.f50325z = layoutInflater.inflate(R.layout.collection_rank, viewGroup, false);
        }
        return this.f50325z;
    }

    @Override // com.join.mgps.fragment.CollectionModuleFourFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        getActivity().unregisterReceiver(this.C);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f50325z = null;
        this.f50299b = null;
        this.f50300c = null;
        this.f50301d = null;
        this.f50302e = null;
        this.f50303f = null;
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f50299b = (PtrClassicFrameLayout) aVar.internalFindViewById(R.id.mPtrFrame);
        this.f50300c = (XListView2) aVar.internalFindViewById(R.id.rankListView);
        this.f50301d = (LinearLayout) aVar.internalFindViewById(R.id.loding_layout);
        this.f50302e = (LinearLayout) aVar.internalFindViewById(R.id.loding_faile);
        this.f50303f = (ImageView) aVar.internalFindViewById(R.id.relodingimag);
        View internalFindViewById = aVar.internalFindViewById(R.id.mg_loading);
        View internalFindViewById2 = aVar.internalFindViewById(R.id.setNetwork);
        ImageView imageView = this.f50303f;
        if (imageView != null) {
            imageView.setOnClickListener(new d());
        }
        if (internalFindViewById != null) {
            internalFindViewById.setOnClickListener(new e());
        }
        if (internalFindViewById2 != null) {
            internalFindViewById2.setOnClickListener(new f());
        }
        afterViews();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f50324y.a(this);
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.A.put(cls, t4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.CollectionModuleFourFragment
    public void showLoding() {
        org.androidannotations.api.b.e("", new g(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.CollectionModuleFourFragment
    public void showLodingFailed() {
        org.androidannotations.api.b.e("", new h(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.CollectionModuleFourFragment
    public void showMain(List<CollectionBeanSubBusiness> list) {
        org.androidannotations.api.b.e("", new i(list), 0L);
    }
}
