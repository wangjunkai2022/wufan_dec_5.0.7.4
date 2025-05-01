package com.join.mgps.fragment;

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
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.XListView2;
import com.join.mgps.dto.CollectionBeanSub;
import com.join.mgps.dto.GameOLFirstBean;
import com.join.mgps.ptr.PtrClassicFrameLayout;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.androidannotations.api.a;
/* loaded from: classes3.dex */
public final class GameOlFirstFragment_ extends GameOlFirstFragment implements y3.a, a4.a, a4.b {

    /* renamed from: t  reason: collision with root package name */
    private View f51811t;

    /* renamed from: s  reason: collision with root package name */
    private final a4.c f51810s = new a4.c();

    /* renamed from: u  reason: collision with root package name */
    private final Map<Class<?>, Object> f51812u = new HashMap();

    /* renamed from: v  reason: collision with root package name */
    private final IntentFilter f51813v = new IntentFilter();

    /* renamed from: w  reason: collision with root package name */
    private final BroadcastReceiver f51814w = new b();

    /* loaded from: classes3.dex */
    class a extends a.c {
        a(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                GameOlFirstFragment_.super.b0();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes3.dex */
    class b extends BroadcastReceiver {

        /* renamed from: b  reason: collision with root package name */
        public static final String f51816b = "gameData";

        b() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            GameOlFirstFragment_.this.f0((CollectionBeanSub) (intent.getExtras() != null ? intent.getExtras() : new Bundle()).getSerializable("gameData"));
        }
    }

    /* loaded from: classes3.dex */
    class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GameOlFirstFragment_.this.relodingimag();
        }
    }

    /* loaded from: classes3.dex */
    class d implements View.OnClickListener {
        d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GameOlFirstFragment_.this.d0();
        }
    }

    /* loaded from: classes3.dex */
    class e implements View.OnClickListener {
        e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GameOlFirstFragment_.this.setNetwork();
        }
    }

    /* loaded from: classes3.dex */
    class f implements Runnable {
        f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GameOlFirstFragment_.super.showLoding();
        }
    }

    /* loaded from: classes3.dex */
    class g implements Runnable {
        g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GameOlFirstFragment_.super.showLodingFailed();
        }
    }

    /* loaded from: classes3.dex */
    class h implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f51823b;

        h(List list) {
            this.f51823b = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            GameOlFirstFragment_.super.showMain(this.f51823b);
        }
    }

    /* loaded from: classes3.dex */
    class i implements Runnable {
        i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GameOlFirstFragment_.super.l0();
        }
    }

    /* loaded from: classes3.dex */
    class j implements Runnable {
        j() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GameOlFirstFragment_.super.e0();
        }
    }

    /* loaded from: classes3.dex */
    public static class k extends org.androidannotations.api.builder.d<k, GameOlFirstFragment> {
        @Override // org.androidannotations.api.builder.d
        /* renamed from: a */
        public GameOlFirstFragment build() {
            GameOlFirstFragment_ gameOlFirstFragment_ = new GameOlFirstFragment_();
            gameOlFirstFragment_.setArguments(this.args);
            return gameOlFirstFragment_;
        }
    }

    private void init_(Bundle bundle) {
        a4.c.b(this);
        this.f51813v.addAction(o1.a.I);
        this.f51813v.addAction(o1.a.G);
    }

    public static k v0() {
        return new k();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.GameOlFirstFragment
    public void b0() {
        org.androidannotations.api.a.l(new a("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.GameOlFirstFragment
    public void e0() {
        org.androidannotations.api.b.e("", new j(), 0L);
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.f51812u.get(cls);
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        View view = this.f51811t;
        if (view == null) {
            return null;
        }
        return (T) view.findViewById(i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.GameOlFirstFragment
    public void l0() {
        org.androidannotations.api.b.e("", new i(), 0L);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.f51810s);
        init_(bundle);
        super.onCreate(bundle);
        getActivity().registerReceiver(this.f51814w, this.f51813v);
        a4.c.c(c5);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        this.f51811t = onCreateView;
        if (onCreateView == null) {
            this.f51811t = layoutInflater.inflate(R.layout.game_online_first_layout, viewGroup, false);
        }
        return this.f51811t;
    }

    @Override // com.join.mgps.fragment.GameOlFirstFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        getActivity().unregisterReceiver(this.f51814w);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f51811t = null;
        this.f51790b = null;
        this.f51791c = null;
        this.f51792d = null;
        this.f51793e = null;
        this.f51794f = null;
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f51790b = (PtrClassicFrameLayout) aVar.internalFindViewById(R.id.mPtrFrame);
        this.f51791c = (XListView2) aVar.internalFindViewById(R.id.rankListView);
        this.f51792d = (LinearLayout) aVar.internalFindViewById(R.id.loding_layout);
        this.f51793e = (LinearLayout) aVar.internalFindViewById(R.id.loding_faile);
        this.f51794f = (ImageView) aVar.internalFindViewById(R.id.relodingimag);
        View internalFindViewById = aVar.internalFindViewById(R.id.mg_loading);
        View internalFindViewById2 = aVar.internalFindViewById(R.id.setNetwork);
        ImageView imageView = this.f51794f;
        if (imageView != null) {
            imageView.setOnClickListener(new c());
        }
        if (internalFindViewById != null) {
            internalFindViewById.setOnClickListener(new d());
        }
        if (internalFindViewById2 != null) {
            internalFindViewById2.setOnClickListener(new e());
        }
        a0();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f51810s.a(this);
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.f51812u.put(cls, t4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.GameOlFirstFragment
    public void showLoding() {
        org.androidannotations.api.b.e("", new f(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.GameOlFirstFragment
    public void showLodingFailed() {
        org.androidannotations.api.b.e("", new g(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.GameOlFirstFragment
    public void showMain(List<v1.a<GameOLFirstBean>> list) {
        org.androidannotations.api.b.e("", new h(list), 0L);
    }
}
