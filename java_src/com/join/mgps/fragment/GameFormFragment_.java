package com.join.mgps.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.join.android.app.component.xrecyclerview.XRecyclerView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.fragment.GameFormFragment;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.androidannotations.api.a;
/* loaded from: classes3.dex */
public final class GameFormFragment_ extends GameFormFragment implements y3.a, a4.a, a4.b {

    /* renamed from: u  reason: collision with root package name */
    private View f51691u;

    /* renamed from: t  reason: collision with root package name */
    private final a4.c f51690t = new a4.c();

    /* renamed from: v  reason: collision with root package name */
    private final Map<Class<?>, Object> f51692v = new HashMap();

    /* loaded from: classes3.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GameFormFragment_.super.showLodingFailed();
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
                GameFormFragment_.super.d0();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes3.dex */
    class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GameFormFragment_.this.relodingimag();
        }
    }

    /* loaded from: classes3.dex */
    class d implements View.OnClickListener {
        d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GameFormFragment_.this.setNetwork();
        }
    }

    /* loaded from: classes3.dex */
    class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GameFormFragment_.super.X();
        }
    }

    /* loaded from: classes3.dex */
    class f implements Runnable {
        f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GameFormFragment_.super.i0();
        }
    }

    /* loaded from: classes3.dex */
    class g implements Runnable {
        g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GameFormFragment_.super.k0();
        }
    }

    /* loaded from: classes3.dex */
    class h implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f51700b;

        h(List list) {
            this.f51700b = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            GameFormFragment_.super.j0(this.f51700b);
        }
    }

    /* loaded from: classes3.dex */
    class i implements Runnable {
        i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GameFormFragment_.super.c0();
        }
    }

    /* loaded from: classes3.dex */
    class j implements Runnable {
        j() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GameFormFragment_.super.showLoding();
        }
    }

    /* loaded from: classes3.dex */
    class k implements Runnable {
        k() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GameFormFragment_.super.e0();
        }
    }

    /* loaded from: classes3.dex */
    public static class l extends org.androidannotations.api.builder.d<l, GameFormFragment> {
        @Override // org.androidannotations.api.builder.d
        /* renamed from: a */
        public GameFormFragment build() {
            GameFormFragment_ gameFormFragment_ = new GameFormFragment_();
            gameFormFragment_.setArguments(this.args);
            return gameFormFragment_;
        }
    }

    private void init_(Bundle bundle) {
        a4.c.b(this);
    }

    public static l u0() {
        return new l();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.GameFormFragment
    public void X() {
        org.androidannotations.api.b.e("", new e(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.GameFormFragment
    public void c0() {
        org.androidannotations.api.b.e("", new i(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.GameFormFragment
    public void d0() {
        org.androidannotations.api.a.l(new b("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.GameFormFragment
    public void e0() {
        org.androidannotations.api.b.e("", new k(), 0L);
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.f51692v.get(cls);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.GameFormFragment
    public void i0() {
        org.androidannotations.api.b.e("", new f(), 0L);
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        View view = this.f51691u;
        if (view == null) {
            return null;
        }
        return (T) view.findViewById(i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.GameFormFragment
    public void j0(List<GameFormFragment.f> list) {
        org.androidannotations.api.b.e("", new h(list), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.GameFormFragment
    public void k0() {
        org.androidannotations.api.b.e("", new g(), 0L);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.f51690t);
        init_(bundle);
        super.onCreate(bundle);
        a4.c.c(c5);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        this.f51691u = onCreateView;
        if (onCreateView == null) {
            this.f51691u = layoutInflater.inflate(R.layout.fragment_gamefrom, viewGroup, false);
        }
        return this.f51691u;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f51691u = null;
        this.f51648b = null;
        this.f51649c = null;
        this.f51652f = null;
        this.f51653g = null;
        this.f51654h = null;
        this.f51661o = null;
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f51648b = (XRecyclerView) aVar.internalFindViewById(R.id.comment_all_list);
        this.f51649c = (LinearLayout) aVar.internalFindViewById(R.id.iv_nome);
        this.f51652f = (Button) aVar.internalFindViewById(R.id.setNetwork);
        this.f51653g = (LinearLayout) aVar.internalFindViewById(R.id.loding_layout);
        this.f51654h = (LinearLayout) aVar.internalFindViewById(R.id.loding_faile);
        ImageView imageView = (ImageView) aVar.internalFindViewById(R.id.relodingimag);
        this.f51661o = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(new c());
        }
        Button button = this.f51652f;
        if (button != null) {
            button.setOnClickListener(new d());
        }
        V();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f51690t.a(this);
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.f51692v.put(cls, t4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.GameFormFragment
    public void showLoding() {
        org.androidannotations.api.b.e("", new j(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.GameFormFragment
    public void showLodingFailed() {
        org.androidannotations.api.b.e("", new a(), 0L);
    }
}
