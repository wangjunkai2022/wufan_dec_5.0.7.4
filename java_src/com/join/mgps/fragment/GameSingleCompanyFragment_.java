package com.join.mgps.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.XListView2;
import com.join.mgps.ptr.PtrClassicFrameLayout;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.androidannotations.api.a;
/* loaded from: classes3.dex */
public final class GameSingleCompanyFragment_ extends GameSingleCompanyFragment implements y3.a, a4.a, a4.b {

    /* renamed from: n  reason: collision with root package name */
    private View f51968n;

    /* renamed from: m  reason: collision with root package name */
    private final a4.c f51967m = new a4.c();

    /* renamed from: o  reason: collision with root package name */
    private final Map<Class<?>, Object> f51969o = new HashMap();

    /* loaded from: classes3.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GameSingleCompanyFragment_.this.relodingimag();
        }
    }

    /* loaded from: classes3.dex */
    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GameSingleCompanyFragment_.this.b0();
        }
    }

    /* loaded from: classes3.dex */
    class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GameSingleCompanyFragment_.this.setNetwork();
        }
    }

    /* loaded from: classes3.dex */
    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GameSingleCompanyFragment_.super.showLoding();
        }
    }

    /* loaded from: classes3.dex */
    class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GameSingleCompanyFragment_.super.showLodingFailed();
        }
    }

    /* loaded from: classes3.dex */
    class f implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f51975b;

        f(List list) {
            this.f51975b = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            GameSingleCompanyFragment_.super.showMain(this.f51975b);
        }
    }

    /* loaded from: classes3.dex */
    class g implements Runnable {
        g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GameSingleCompanyFragment_.super.d0();
        }
    }

    /* loaded from: classes3.dex */
    class h implements Runnable {
        h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GameSingleCompanyFragment_.super.c0();
        }
    }

    /* loaded from: classes3.dex */
    class i extends a.c {
        i(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                GameSingleCompanyFragment_.super.Z();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes3.dex */
    public static class j extends org.androidannotations.api.builder.d<j, GameSingleCompanyFragment> {
        @Override // org.androidannotations.api.builder.d
        /* renamed from: a */
        public GameSingleCompanyFragment build() {
            GameSingleCompanyFragment_ gameSingleCompanyFragment_ = new GameSingleCompanyFragment_();
            gameSingleCompanyFragment_.setArguments(this.args);
            return gameSingleCompanyFragment_;
        }
    }

    private void init_(Bundle bundle) {
        a4.c.b(this);
    }

    public static j k0() {
        return new j();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.GameSingleCompanyFragment
    public void Z() {
        org.androidannotations.api.a.l(new i("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.GameSingleCompanyFragment
    public void c0() {
        org.androidannotations.api.b.e("", new h(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.GameSingleCompanyFragment
    public void d0() {
        org.androidannotations.api.b.e("", new g(), 0L);
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.f51969o.get(cls);
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        View view = this.f51968n;
        if (view == null) {
            return null;
        }
        return (T) view.findViewById(i4);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.f51967m);
        init_(bundle);
        super.onCreate(bundle);
        a4.c.c(c5);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        this.f51968n = onCreateView;
        if (onCreateView == null) {
            this.f51968n = layoutInflater.inflate(R.layout.game_single_conpany_layout, viewGroup, false);
        }
        return this.f51968n;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f51968n = null;
        this.f51954b = null;
        this.f51955c = null;
        this.f51956d = null;
        this.f51957e = null;
        this.f51958f = null;
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f51954b = (PtrClassicFrameLayout) aVar.internalFindViewById(R.id.mPtrFrame);
        this.f51955c = (XListView2) aVar.internalFindViewById(R.id.rankListView);
        this.f51956d = (LinearLayout) aVar.internalFindViewById(R.id.loding_layout);
        this.f51957e = (LinearLayout) aVar.internalFindViewById(R.id.loding_faile);
        this.f51958f = (ImageView) aVar.internalFindViewById(R.id.relodingimag);
        View internalFindViewById = aVar.internalFindViewById(R.id.mg_loading);
        View internalFindViewById2 = aVar.internalFindViewById(R.id.setNetwork);
        ImageView imageView = this.f51958f;
        if (imageView != null) {
            imageView.setOnClickListener(new a());
        }
        if (internalFindViewById != null) {
            internalFindViewById.setOnClickListener(new b());
        }
        if (internalFindViewById2 != null) {
            internalFindViewById2.setOnClickListener(new c());
        }
        X();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f51967m.a(this);
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.f51969o.put(cls, t4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.GameSingleCompanyFragment
    public void showLoding() {
        org.androidannotations.api.b.e("", new d(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.GameSingleCompanyFragment
    public void showLodingFailed() {
        org.androidannotations.api.b.e("", new e(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.GameSingleCompanyFragment
    public void showMain(List<v1.b> list) {
        org.androidannotations.api.b.e("", new f(list), 0L);
    }
}
