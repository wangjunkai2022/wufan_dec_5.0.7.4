package com.join.mgps.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.XListView2;
import com.join.mgps.dto.GameFromPopoWinBean;
import com.join.mgps.ptr.PtrClassicFrameLayout;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.androidannotations.api.a;
/* loaded from: classes3.dex */
public final class GameSubscribeFragment_ extends GameSubscribeFragment implements y3.a, a4.a, a4.b {

    /* renamed from: s  reason: collision with root package name */
    private View f52007s;

    /* renamed from: r  reason: collision with root package name */
    private final a4.c f52006r = new a4.c();

    /* renamed from: t  reason: collision with root package name */
    private final Map<Class<?>, Object> f52008t = new HashMap();

    /* loaded from: classes3.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GameSubscribeFragment_.super.c0();
        }
    }

    /* loaded from: classes3.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GameSubscribeFragment_.super.showLodingFailed();
        }
    }

    /* loaded from: classes3.dex */
    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GameSubscribeFragment_.super.Z();
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
                GameSubscribeFragment_.super.b0();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes3.dex */
    class e implements View.OnClickListener {
        e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GameSubscribeFragment_.this.relodingimag();
        }
    }

    /* loaded from: classes3.dex */
    class f implements View.OnClickListener {
        f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GameSubscribeFragment_.this.setNetwork();
        }
    }

    /* loaded from: classes3.dex */
    class g implements Runnable {
        g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GameSubscribeFragment_.super.e0();
        }
    }

    /* loaded from: classes3.dex */
    class h implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f52016b;

        h(List list) {
            this.f52016b = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            GameSubscribeFragment_.super.W(this.f52016b);
        }
    }

    /* loaded from: classes3.dex */
    class i implements Runnable {
        i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GameSubscribeFragment_.super.d0();
        }
    }

    /* loaded from: classes3.dex */
    class j implements Runnable {
        j() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GameSubscribeFragment_.super.X();
        }
    }

    /* loaded from: classes3.dex */
    class k implements Runnable {
        k() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GameSubscribeFragment_.super.f0();
        }
    }

    /* loaded from: classes3.dex */
    class l implements Runnable {
        l() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GameSubscribeFragment_.super.a0();
        }
    }

    /* loaded from: classes3.dex */
    class m implements Runnable {
        m() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GameSubscribeFragment_.super.showLoding();
        }
    }

    /* loaded from: classes3.dex */
    public static class n extends org.androidannotations.api.builder.d<n, GameSubscribeFragment> {
        @Override // org.androidannotations.api.builder.d
        /* renamed from: a */
        public GameSubscribeFragment build() {
            GameSubscribeFragment_ gameSubscribeFragment_ = new GameSubscribeFragment_();
            gameSubscribeFragment_.setArguments(this.args);
            return gameSubscribeFragment_;
        }
    }

    private void init_(Bundle bundle) {
        a4.c.b(this);
    }

    public static n r0() {
        return new n();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.GameSubscribeFragment
    public void W(List<GameFromPopoWinBean.DataBean> list) {
        org.androidannotations.api.b.e("", new h(list), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.GameSubscribeFragment
    public void X() {
        org.androidannotations.api.b.e("", new j(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.GameSubscribeFragment
    public void Z() {
        org.androidannotations.api.b.e("", new c(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.GameSubscribeFragment
    public void a0() {
        org.androidannotations.api.b.e("", new l(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.GameSubscribeFragment
    public void b0() {
        org.androidannotations.api.a.l(new d("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.GameSubscribeFragment
    public void c0() {
        org.androidannotations.api.b.e("", new a(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.GameSubscribeFragment
    public void d0() {
        org.androidannotations.api.b.e("", new i(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.GameSubscribeFragment
    public void e0() {
        org.androidannotations.api.b.e("", new g(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.GameSubscribeFragment
    public void f0() {
        org.androidannotations.api.b.e("", new k(), 0L);
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.f52008t.get(cls);
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        View view = this.f52007s;
        if (view == null) {
            return null;
        }
        return (T) view.findViewById(i4);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.f52006r);
        init_(bundle);
        super.onCreate(bundle);
        a4.c.c(c5);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        this.f52007s = onCreateView;
        if (onCreateView == null) {
            this.f52007s = layoutInflater.inflate(R.layout.game_build, viewGroup, false);
        }
        return this.f52007s;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f52007s = null;
        this.f51980b = null;
        this.f51981c = null;
        this.f51982d = null;
        this.f51983e = null;
        this.f51984f = null;
        this.f51985g = null;
        this.f51986h = null;
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f51980b = (LinearLayout) aVar.internalFindViewById(R.id.tv_nodata);
        this.f51981c = (PtrClassicFrameLayout) aVar.internalFindViewById(R.id.myswip);
        this.f51982d = (XListView2) aVar.internalFindViewById(R.id.listview);
        this.f51983e = (LinearLayout) aVar.internalFindViewById(R.id.loding_layout);
        this.f51984f = (LinearLayout) aVar.internalFindViewById(R.id.loding_faile);
        this.f51985g = (Button) aVar.internalFindViewById(R.id.setNetwork);
        ImageView imageView = (ImageView) aVar.internalFindViewById(R.id.relodingimag);
        this.f51986h = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(new e());
        }
        Button button = this.f51985g;
        if (button != null) {
            button.setOnClickListener(new f());
        }
        V();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f52006r.a(this);
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.f52008t.put(cls, t4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.GameSubscribeFragment
    public void showLoding() {
        org.androidannotations.api.b.e("", new m(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.GameSubscribeFragment
    public void showLodingFailed() {
        org.androidannotations.api.b.e("", new b(), 0L);
    }
}
