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
import com.join.mgps.dto.CollectionBeanSub;
import com.join.mgps.dto.GameFromPopoWinBean;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.androidannotations.api.a;
/* loaded from: classes3.dex */
public final class GameFromBuildFragment_ extends GameFromBuildFragment implements y3.a, a4.a, a4.b {
    private View A;

    /* renamed from: z  reason: collision with root package name */
    private final a4.c f51768z = new a4.c();
    private final Map<Class<?>, Object> B = new HashMap();

    /* loaded from: classes3.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GameFromBuildFragment_.super.p0();
        }
    }

    /* loaded from: classes3.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GameFromBuildFragment_.super.c0();
        }
    }

    /* loaded from: classes3.dex */
    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GameFromBuildFragment_.super.showLoding();
        }
    }

    /* loaded from: classes3.dex */
    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GameFromBuildFragment_.super.g0();
        }
    }

    /* loaded from: classes3.dex */
    class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GameFromBuildFragment_.super.showLodingFailed();
        }
    }

    /* loaded from: classes3.dex */
    class f implements Runnable {
        f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GameFromBuildFragment_.super.b0();
        }
    }

    /* loaded from: classes3.dex */
    class g extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f51775b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(String str, long j4, String str2, String str3) {
            super(str, j4, str2);
            this.f51775b = str3;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                GameFromBuildFragment_.super.e0(this.f51775b);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes3.dex */
    class h extends a.c {
        h(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                GameFromBuildFragment_.super.f0();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes3.dex */
    class i implements View.OnClickListener {
        i() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GameFromBuildFragment_.this.relodingimag();
        }
    }

    /* loaded from: classes3.dex */
    class j implements View.OnClickListener {
        j() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GameFromBuildFragment_.this.setNetwork();
        }
    }

    /* loaded from: classes3.dex */
    class k implements Runnable {
        k() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GameFromBuildFragment_.super.a0();
        }
    }

    /* loaded from: classes3.dex */
    class l implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f51781b;

        l(String str) {
            this.f51781b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            GameFromBuildFragment_.super.showToast(this.f51781b);
        }
    }

    /* loaded from: classes3.dex */
    class m implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f51783b;

        m(List list) {
            this.f51783b = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            GameFromBuildFragment_.super.X(this.f51783b);
        }
    }

    /* loaded from: classes3.dex */
    class n implements Runnable {
        n() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GameFromBuildFragment_.super.l0();
        }
    }

    /* loaded from: classes3.dex */
    class o implements Runnable {
        o() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GameFromBuildFragment_.super.m0();
        }
    }

    /* loaded from: classes3.dex */
    class p implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f51787b;

        p(List list) {
            this.f51787b = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            GameFromBuildFragment_.super.W(this.f51787b);
        }
    }

    /* loaded from: classes3.dex */
    class q implements Runnable {
        q() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GameFromBuildFragment_.super.Z();
        }
    }

    /* loaded from: classes3.dex */
    public static class r extends org.androidannotations.api.builder.d<r, GameFromBuildFragment> {
        @Override // org.androidannotations.api.builder.d
        /* renamed from: a */
        public GameFromBuildFragment build() {
            GameFromBuildFragment_ gameFromBuildFragment_ = new GameFromBuildFragment_();
            gameFromBuildFragment_.setArguments(this.args);
            return gameFromBuildFragment_;
        }
    }

    public static r I0() {
        return new r();
    }

    private void init_(Bundle bundle) {
        a4.c.b(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.GameFromBuildFragment
    public void W(List<GameFromPopoWinBean.DataBean> list) {
        org.androidannotations.api.b.e("", new p(list), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.GameFromBuildFragment
    public void X(List<CollectionBeanSub> list) {
        org.androidannotations.api.b.e("", new m(list), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.GameFromBuildFragment
    public void Z() {
        org.androidannotations.api.b.e("", new q(), 0L);
    }

    @Override // com.join.mgps.fragment.GameFromBuildFragment
    public void a0() {
        org.androidannotations.api.b.e("", new k(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.GameFromBuildFragment
    public void b0() {
        org.androidannotations.api.b.e("", new f(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.GameFromBuildFragment
    public void c0() {
        org.androidannotations.api.b.e("", new b(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.GameFromBuildFragment
    public void e0(String str) {
        org.androidannotations.api.a.l(new g("", 0L, "", str));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.GameFromBuildFragment
    public void f0() {
        org.androidannotations.api.a.l(new h("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.GameFromBuildFragment
    public void g0() {
        org.androidannotations.api.b.e("", new d(), 0L);
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.B.get(cls);
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
    @Override // com.join.mgps.fragment.GameFromBuildFragment
    public void l0() {
        org.androidannotations.api.b.e("", new n(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.GameFromBuildFragment
    public void m0() {
        org.androidannotations.api.b.e("", new o(), 0L);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.f51768z);
        init_(bundle);
        super.onCreate(bundle);
        a4.c.c(c5);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        this.A = onCreateView;
        if (onCreateView == null) {
            this.A = layoutInflater.inflate(R.layout.game_build, viewGroup, false);
        }
        return this.A;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.A = null;
        this.f51705b = null;
        this.f51706c = null;
        this.f51707d = null;
        this.f51708e = null;
        this.f51709f = null;
        this.f51710g = null;
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f51705b = (LinearLayout) aVar.internalFindViewById(R.id.tv_nodata);
        this.f51706c = (XListView2) aVar.internalFindViewById(R.id.listview);
        this.f51707d = (LinearLayout) aVar.internalFindViewById(R.id.loding_layout);
        this.f51708e = (LinearLayout) aVar.internalFindViewById(R.id.loding_faile);
        this.f51709f = (Button) aVar.internalFindViewById(R.id.setNetwork);
        ImageView imageView = (ImageView) aVar.internalFindViewById(R.id.relodingimag);
        this.f51710g = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(new i());
        }
        Button button = this.f51709f;
        if (button != null) {
            button.setOnClickListener(new j());
        }
        V();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f51768z.a(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.GameFromBuildFragment
    public void p0() {
        org.androidannotations.api.b.e("", new a(), 0L);
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.B.put(cls, t4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.GameFromBuildFragment
    public void showLoding() {
        org.androidannotations.api.b.e("", new c(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.GameFromBuildFragment
    public void showLodingFailed() {
        org.androidannotations.api.b.e("", new e(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.GameFromBuildFragment
    public void showToast(String str) {
        org.androidannotations.api.b.e("", new l(str), 0L);
    }
}
