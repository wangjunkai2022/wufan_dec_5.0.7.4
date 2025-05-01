package com.join.mgps.activity.arena;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.join.android.app.component.xrecyclerview.XRecyclerView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.dto.GameInfoBean;
import com.join.mgps.dto.NewArenaGameListBean;
import com.join.mgps.dto.ResultResMainBean;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.androidannotations.api.a;
/* loaded from: classes4.dex */
public final class ArenaGameListFragmentMain_ extends ArenaGameListFragmentMain implements y3.a, a4.a, a4.b {
    private View A;

    /* renamed from: z  reason: collision with root package name */
    private final a4.c f38569z = new a4.c();
    private final Map<Class<?>, Object> B = new HashMap();

    /* loaded from: classes4.dex */
    class a extends a.c {
        a(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                ArenaGameListFragmentMain_.super.g0();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class b extends a.c {
        b(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                ArenaGameListFragmentMain_.super.f0();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ArenaGameListFragmentMain_.this.a0();
        }
    }

    /* loaded from: classes4.dex */
    class d implements View.OnClickListener {
        d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ArenaGameListFragmentMain_.this.relodingimag();
        }
    }

    /* loaded from: classes4.dex */
    class e implements View.OnClickListener {
        e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ArenaGameListFragmentMain_.this.setNetwork();
        }
    }

    /* loaded from: classes4.dex */
    class f implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f38575b;

        f(List list) {
            this.f38575b = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            ArenaGameListFragmentMain_.super.j0(this.f38575b);
        }
    }

    /* loaded from: classes4.dex */
    class g implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ResultResMainBean f38577b;

        g(ResultResMainBean resultResMainBean) {
            this.f38577b = resultResMainBean;
        }

        @Override // java.lang.Runnable
        public void run() {
            ArenaGameListFragmentMain_.super.c0(this.f38577b);
        }
    }

    /* loaded from: classes4.dex */
    class h implements Runnable {
        h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ArenaGameListFragmentMain_.super.i0();
        }
    }

    /* loaded from: classes4.dex */
    class i implements Runnable {
        i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ArenaGameListFragmentMain_.super.h0();
        }
    }

    /* loaded from: classes4.dex */
    class j implements Runnable {
        j() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ArenaGameListFragmentMain_.super.hideLoading();
        }
    }

    /* loaded from: classes4.dex */
    class k extends a.c {
        k(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                ArenaGameListFragmentMain_.super.e0();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    public static class l extends org.androidannotations.api.builder.d<l, ArenaGameListFragmentMain> {
        @Override // org.androidannotations.api.builder.d
        /* renamed from: a */
        public ArenaGameListFragmentMain build() {
            ArenaGameListFragmentMain_ arenaGameListFragmentMain_ = new ArenaGameListFragmentMain_();
            arenaGameListFragmentMain_.setArguments(this.args);
            return arenaGameListFragmentMain_;
        }
    }

    private void init_(Bundle bundle) {
        a4.c.b(this);
        this.f38558m = AccountUtil_.getInstance_(getActivity());
    }

    public static l s0() {
        return new l();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.arena.ArenaGameListFragmentMain
    public void c0(ResultResMainBean<NewArenaGameListBean> resultResMainBean) {
        org.androidannotations.api.b.e("", new g(resultResMainBean), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.arena.ArenaGameListFragmentMain
    public void e0() {
        org.androidannotations.api.a.l(new k("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.arena.ArenaGameListFragmentMain
    public void f0() {
        org.androidannotations.api.a.l(new b("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.arena.ArenaGameListFragmentMain
    public void g0() {
        org.androidannotations.api.a.l(new a("", 0L, ""));
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.B.get(cls);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.arena.ArenaGameListFragmentMain
    public void h0() {
        org.androidannotations.api.b.e("", new i(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.arena.ArenaGameListFragmentMain
    public void hideLoading() {
        org.androidannotations.api.b.e("", new j(), 200L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.arena.ArenaGameListFragmentMain
    public void i0() {
        org.androidannotations.api.b.e("", new h(), 0L);
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        View view = this.A;
        if (view == null) {
            return null;
        }
        return (T) view.findViewById(i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.arena.ArenaGameListFragmentMain
    public void j0(List<GameInfoBean> list) {
        org.androidannotations.api.b.e("", new f(list), 0L);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.f38569z);
        init_(bundle);
        super.onCreate(bundle);
        a4.c.c(c5);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        this.A = onCreateView;
        if (onCreateView == null) {
            this.A = layoutInflater.inflate(R.layout.activity_arena_gamelist_fragment, viewGroup, false);
        }
        return this.A;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.A = null;
        this.f38549d = null;
        this.f38550e = null;
        this.f38553h = null;
        this.f38554i = null;
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f38549d = (LinearLayout) aVar.internalFindViewById(R.id.loding_layout);
        this.f38550e = (XRecyclerView) aVar.internalFindViewById(R.id.listview);
        this.f38553h = (LinearLayout) aVar.internalFindViewById(R.id.loding_faile);
        this.f38554i = (RelativeLayout) aVar.internalFindViewById(R.id.layout_others_list);
        View internalFindViewById = aVar.internalFindViewById(R.id.back_image);
        View internalFindViewById2 = aVar.internalFindViewById(R.id.relodingimag);
        View internalFindViewById3 = aVar.internalFindViewById(R.id.setNetwork);
        if (internalFindViewById != null) {
            internalFindViewById.setOnClickListener(new c());
        }
        if (internalFindViewById2 != null) {
            internalFindViewById2.setOnClickListener(new d());
        }
        if (internalFindViewById3 != null) {
            internalFindViewById3.setOnClickListener(new e());
        }
        afterViews();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f38569z.a(this);
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.B.put(cls, t4);
    }
}
