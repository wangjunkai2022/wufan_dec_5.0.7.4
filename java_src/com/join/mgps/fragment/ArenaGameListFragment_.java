package com.join.mgps.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.join.android.app.component.xrecyclerview.XRecyclerView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.dto.GameInfoBean;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.androidannotations.api.a;
/* loaded from: classes3.dex */
public final class ArenaGameListFragment_ extends ArenaGameListFragment implements y3.a, a4.a, a4.b {

    /* renamed from: o  reason: collision with root package name */
    private View f49963o;

    /* renamed from: n  reason: collision with root package name */
    private final a4.c f49962n = new a4.c();

    /* renamed from: p  reason: collision with root package name */
    private final Map<Class<?>, Object> f49964p = new HashMap();

    /* loaded from: classes3.dex */
    class a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f49965b;

        a(List list) {
            this.f49965b = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            ArenaGameListFragment_.super.l0(this.f49965b);
        }
    }

    /* loaded from: classes3.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ArenaGameListFragment_.super.showLodingFailed();
        }
    }

    /* loaded from: classes3.dex */
    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ArenaGameListFragment_.super.k0();
        }
    }

    /* loaded from: classes3.dex */
    class d extends a.c {
        d(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                ArenaGameListFragment_.super.loadData();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes3.dex */
    public static class e extends org.androidannotations.api.builder.d<e, ArenaGameListFragment> {
        @Override // org.androidannotations.api.builder.d
        /* renamed from: a */
        public ArenaGameListFragment build() {
            ArenaGameListFragment_ arenaGameListFragment_ = new ArenaGameListFragment_();
            arenaGameListFragment_.setArguments(this.args);
            return arenaGameListFragment_;
        }
    }

    private void init_(Bundle bundle) {
        a4.c.b(this);
    }

    public static e q0() {
        return new e();
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.f49964p.get(cls);
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        View view = this.f49963o;
        if (view == null) {
            return null;
        }
        return (T) view.findViewById(i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.ArenaGameListFragment
    public void k0() {
        org.androidannotations.api.b.e("", new c(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.ArenaGameListFragment
    public void l0(List<GameInfoBean> list) {
        org.androidannotations.api.b.e("", new a(list), 0L);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.join.mgps.fragment.ArenaGameListFragment, com.join.mgps.basefragment.BaseLoadingFragment
    public void loadData() {
        org.androidannotations.api.a.l(new d("", 0L, ""));
    }

    @Override // com.join.mgps.fragment.ArenaGameListFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.f49962n);
        init_(bundle);
        super.onCreate(bundle);
        a4.c.c(c5);
    }

    @Override // com.join.mgps.basefragment.BaseLoadingFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        this.f49963o = onCreateView;
        if (onCreateView == null) {
            this.f49963o = layoutInflater.inflate(R.layout.fragment_gamelist, viewGroup, false);
        }
        return this.f49963o;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f49963o = null;
        this.f49951d = null;
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f49951d = (XRecyclerView) aVar.internalFindViewById(R.id.listView2);
        afterViews();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f49962n.a(this);
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.f49964p.put(cls, t4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.ArenaGameListFragment
    public void showLodingFailed() {
        org.androidannotations.api.b.e("", new b(), 0L);
    }
}
