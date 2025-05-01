package com.join.mgps.activity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.dto.CollectionModuleSevenBean;
import java.util.HashMap;
import java.util.Map;
import org.androidannotations.api.a;
/* loaded from: classes4.dex */
public final class CollectionModuleSevenFragment_ extends CollectionModuleSevenFragment implements y3.a, a4.a, a4.b {

    /* renamed from: q  reason: collision with root package name */
    private View f29152q;

    /* renamed from: p  reason: collision with root package name */
    private final a4.c f29151p = new a4.c();

    /* renamed from: r  reason: collision with root package name */
    private final Map<Class<?>, Object> f29153r = new HashMap();

    /* loaded from: classes4.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CollectionModuleSevenFragment_.this.relodingimag();
        }
    }

    /* loaded from: classes4.dex */
    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CollectionModuleSevenFragment_.this.setNetwork();
        }
    }

    /* loaded from: classes4.dex */
    class c implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f29156b;

        c(String str) {
            this.f29156b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            CollectionModuleSevenFragment_.super.showMessage(this.f29156b);
        }
    }

    /* loaded from: classes4.dex */
    class d implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CollectionModuleSevenBean f29158b;

        d(CollectionModuleSevenBean collectionModuleSevenBean) {
            this.f29158b = collectionModuleSevenBean;
        }

        @Override // java.lang.Runnable
        public void run() {
            CollectionModuleSevenFragment_.super.p0(this.f29158b);
        }
    }

    /* loaded from: classes4.dex */
    class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            CollectionModuleSevenFragment_.super.c0();
        }
    }

    /* loaded from: classes4.dex */
    class f implements Runnable {
        f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            CollectionModuleSevenFragment_.super.showLoding();
        }
    }

    /* loaded from: classes4.dex */
    class g implements Runnable {
        g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            CollectionModuleSevenFragment_.super.showLodingFailed();
        }
    }

    /* loaded from: classes4.dex */
    class h implements Runnable {
        h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            CollectionModuleSevenFragment_.super.showMain();
        }
    }

    /* loaded from: classes4.dex */
    class i extends a.c {
        i(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                CollectionModuleSevenFragment_.super.e0();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    public static class j extends org.androidannotations.api.builder.d<j, CollectionModuleSevenFragment> {
        @Override // org.androidannotations.api.builder.d
        /* renamed from: a */
        public CollectionModuleSevenFragment build() {
            CollectionModuleSevenFragment_ collectionModuleSevenFragment_ = new CollectionModuleSevenFragment_();
            collectionModuleSevenFragment_.setArguments(this.args);
            return collectionModuleSevenFragment_;
        }
    }

    public static j A0() {
        return new j();
    }

    private void init_(Bundle bundle) {
        a4.c.b(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.CollectionModuleSevenFragment
    public void c0() {
        org.androidannotations.api.b.e("", new e(), 500L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.CollectionModuleSevenFragment
    public void e0() {
        org.androidannotations.api.a.l(new i("", 0L, ""));
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.f29153r.get(cls);
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        View view = this.f29152q;
        if (view == null) {
            return null;
        }
        return (T) view.findViewById(i4);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.f29151p);
        init_(bundle);
        super.onCreate(bundle);
        a4.c.c(c5);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        this.f29152q = onCreateView;
        if (onCreateView == null) {
            this.f29152q = layoutInflater.inflate(R.layout.fragment_collection_module_seven, viewGroup, false);
        }
        return this.f29152q;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f29152q = null;
        this.f29138c = null;
        this.f29139d = null;
        this.f29140e = null;
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f29138c = (RecyclerView) aVar.internalFindViewById(R.id.breakListView);
        this.f29139d = (LinearLayout) aVar.internalFindViewById(R.id.loding_layout);
        this.f29140e = (LinearLayout) aVar.internalFindViewById(R.id.loding_faile);
        View internalFindViewById = aVar.internalFindViewById(R.id.relodingimag);
        View internalFindViewById2 = aVar.internalFindViewById(R.id.setNetwork);
        if (internalFindViewById != null) {
            internalFindViewById.setOnClickListener(new a());
        }
        if (internalFindViewById2 != null) {
            internalFindViewById2.setOnClickListener(new b());
        }
        b0();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f29151p.a(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.CollectionModuleSevenFragment
    public void p0(CollectionModuleSevenBean collectionModuleSevenBean) {
        org.androidannotations.api.b.e("", new d(collectionModuleSevenBean), 0L);
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.f29153r.put(cls, t4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.CollectionModuleSevenFragment
    public void showLoding() {
        org.androidannotations.api.b.e("", new f(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.CollectionModuleSevenFragment
    public void showLodingFailed() {
        org.androidannotations.api.b.e("", new g(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.CollectionModuleSevenFragment
    public void showMain() {
        org.androidannotations.api.b.e("", new h(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.CollectionModuleSevenFragment
    public void showMessage(String str) {
        org.androidannotations.api.b.e("", new c(str), 0L);
    }
}
