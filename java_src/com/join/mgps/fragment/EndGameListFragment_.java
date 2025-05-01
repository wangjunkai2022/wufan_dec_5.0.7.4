package com.join.mgps.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.join.android.app.component.xrecyclerview.XRecyclerView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.dto.EndGameBean;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.androidannotations.api.a;
/* loaded from: classes3.dex */
public final class EndGameListFragment_ extends EndGameListFragment implements y3.a, a4.a, a4.b {

    /* renamed from: w  reason: collision with root package name */
    public static final String f51155w = "gameId";

    /* renamed from: x  reason: collision with root package name */
    public static final String f51156x = "type";

    /* renamed from: y  reason: collision with root package name */
    public static final String f51157y = "rules";

    /* renamed from: z  reason: collision with root package name */
    public static final String f51158z = "ext";

    /* renamed from: u  reason: collision with root package name */
    private View f51160u;

    /* renamed from: t  reason: collision with root package name */
    private final a4.c f51159t = new a4.c();

    /* renamed from: v  reason: collision with root package name */
    private final Map<Class<?>, Object> f51161v = new HashMap();

    /* loaded from: classes3.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            EndGameListFragment_.super.showMain();
        }
    }

    /* loaded from: classes3.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            EndGameListFragment_.super.showEmpty();
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
                EndGameListFragment_.super.i0();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes3.dex */
    class d implements View.OnClickListener {
        d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            EndGameListFragment_.this.setNetwork();
        }
    }

    /* loaded from: classes3.dex */
    class e implements View.OnClickListener {
        e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            EndGameListFragment_.this.relodingimag();
        }
    }

    /* loaded from: classes3.dex */
    class f implements Runnable {
        f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            EndGameListFragment_.super.j0();
        }
    }

    /* loaded from: classes3.dex */
    class g implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f51168b;

        g(List list) {
            this.f51168b = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            EndGameListFragment_.super.o0(this.f51168b);
        }
    }

    /* loaded from: classes3.dex */
    class h implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f51170b;

        h(String str) {
            this.f51170b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            EndGameListFragment_.super.showTost(this.f51170b);
        }
    }

    /* loaded from: classes3.dex */
    class i implements Runnable {
        i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            EndGameListFragment_.super.k0();
        }
    }

    /* loaded from: classes3.dex */
    class j implements Runnable {
        j() {
        }

        @Override // java.lang.Runnable
        public void run() {
            EndGameListFragment_.super.g0();
        }
    }

    /* loaded from: classes3.dex */
    class k implements Runnable {
        k() {
        }

        @Override // java.lang.Runnable
        public void run() {
            EndGameListFragment_.super.showLoding();
        }
    }

    /* loaded from: classes3.dex */
    class l implements Runnable {
        l() {
        }

        @Override // java.lang.Runnable
        public void run() {
            EndGameListFragment_.super.showLodingFailed();
        }
    }

    /* loaded from: classes3.dex */
    public static class m extends org.androidannotations.api.builder.d<m, EndGameListFragment> {
        @Override // org.androidannotations.api.builder.d
        /* renamed from: a */
        public EndGameListFragment build() {
            EndGameListFragment_ endGameListFragment_ = new EndGameListFragment_();
            endGameListFragment_.setArguments(this.args);
            return endGameListFragment_;
        }

        public m b(String str) {
            this.args.putString("ext", str);
            return this;
        }

        public m c(String str) {
            this.args.putString("gameId", str);
            return this;
        }

        public m d(String str) {
            this.args.putString("rules", str);
            return this;
        }

        public m e(int i4) {
            this.args.putInt("type", i4);
            return this;
        }
    }

    public static m A0() {
        return new m();
    }

    private void B0() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            if (arguments.containsKey("gameId")) {
                this.f51118f = arguments.getString("gameId");
            }
            if (arguments.containsKey("type")) {
                this.f51119g = arguments.getInt("type");
            }
            if (arguments.containsKey("rules")) {
                this.f51120h = arguments.getString("rules");
            }
            if (arguments.containsKey("ext")) {
                this.f51121i = arguments.getString("ext");
            }
        }
    }

    private void init_(Bundle bundle) {
        a4.c.b(this);
        B0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.EndGameListFragment
    public void g0() {
        org.androidannotations.api.b.e("", new j(), 0L);
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.f51161v.get(cls);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.EndGameListFragment
    public void i0() {
        org.androidannotations.api.a.l(new c("", 0L, ""));
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        View view = this.f51160u;
        if (view == null) {
            return null;
        }
        return (T) view.findViewById(i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.EndGameListFragment
    public void j0() {
        org.androidannotations.api.b.e("", new f(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.EndGameListFragment
    public void k0() {
        org.androidannotations.api.b.e("", new i(), 500L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.EndGameListFragment
    public void o0(List<EndGameBean> list) {
        org.androidannotations.api.b.e("", new g(list), 0L);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.f51159t);
        init_(bundle);
        super.onCreate(bundle);
        a4.c.c(c5);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        this.f51160u = onCreateView;
        if (onCreateView == null) {
            this.f51160u = layoutInflater.inflate(R.layout.fragment_end_game_list, viewGroup, false);
        }
        return this.f51160u;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f51160u = null;
        this.f51114b = null;
        this.f51115c = null;
        this.f51116d = null;
        this.f51117e = null;
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f51114b = (XRecyclerView) aVar.internalFindViewById(R.id.recyclerView);
        this.f51115c = (LinearLayout) aVar.internalFindViewById(R.id.loding_layout);
        this.f51116d = (LinearLayout) aVar.internalFindViewById(R.id.loding_faile);
        this.f51117e = (LinearLayout) aVar.internalFindViewById(R.id.ll_empty);
        View internalFindViewById = aVar.internalFindViewById(R.id.setNetwork);
        View internalFindViewById2 = aVar.internalFindViewById(R.id.relodingimag);
        if (internalFindViewById != null) {
            internalFindViewById.setOnClickListener(new d());
        }
        if (internalFindViewById2 != null) {
            internalFindViewById2.setOnClickListener(new e());
        }
        f0();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f51159t.a(this);
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.f51161v.put(cls, t4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.EndGameListFragment
    public void showEmpty() {
        org.androidannotations.api.b.e("", new b(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.EndGameListFragment
    public void showLoding() {
        org.androidannotations.api.b.e("", new k(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.EndGameListFragment
    public void showLodingFailed() {
        org.androidannotations.api.b.e("", new l(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.EndGameListFragment
    public void showMain() {
        org.androidannotations.api.b.e("", new a(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.EndGameListFragment
    public void showTost(String str) {
        org.androidannotations.api.b.e("", new h(str), 0L);
    }
}
