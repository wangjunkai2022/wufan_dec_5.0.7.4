package com.join.mgps.activity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.XListView2;
import com.join.mgps.pref.PrefDef_;
import java.util.HashMap;
import java.util.Map;
import org.androidannotations.api.a;
/* loaded from: classes4.dex */
public final class MyGamePapaFavFragment_ extends MyGamePapaFavFragment implements y3.a, a4.a, a4.b {
    public static final String G = "groupId";
    public static final String H = "title";
    private View C;
    private final a4.c B = new a4.c();
    private final Map<Class<?>, Object> D = new HashMap();
    private final IntentFilter E = new IntentFilter();
    private final BroadcastReceiver F = new i();

    /* loaded from: classes4.dex */
    class a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f35727b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f35728c;

        a(String str, String str2) {
            this.f35727b = str;
            this.f35728c = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            MyGamePapaFavFragment_.super.t0(this.f35727b, this.f35728c);
        }
    }

    /* loaded from: classes4.dex */
    class b implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f35730b;

        b(String str) {
            this.f35730b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            MyGamePapaFavFragment_.super.u0(this.f35730b);
        }
    }

    /* loaded from: classes4.dex */
    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MyGamePapaFavFragment_.super.showMain();
        }
    }

    /* loaded from: classes4.dex */
    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MyGamePapaFavFragment_.super.x0();
        }
    }

    /* loaded from: classes4.dex */
    class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MyGamePapaFavFragment_.super.l0();
        }
    }

    /* loaded from: classes4.dex */
    class f implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f35735b;

        f(String str) {
            this.f35735b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            MyGamePapaFavFragment_.super.o0(this.f35735b);
        }
    }

    /* loaded from: classes4.dex */
    class g extends a.c {
        g(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                MyGamePapaFavFragment_.super.g0();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class h extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f35738b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(String str, long j4, String str2, int i4) {
            super(str, j4, str2);
            this.f35738b = i4;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                MyGamePapaFavFragment_.super.d0(this.f35738b);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class i extends BroadcastReceiver {

        /* renamed from: b  reason: collision with root package name */
        public static final String f35740b = "gameId";

        i() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            MyGamePapaFavFragment_.this.n0((intent.getExtras() != null ? intent.getExtras() : new Bundle()).getString("gameId"));
        }
    }

    /* loaded from: classes4.dex */
    class j implements View.OnClickListener {
        j() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MyGamePapaFavFragment_.this.relodingimag();
        }
    }

    /* loaded from: classes4.dex */
    class k implements View.OnClickListener {
        k() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MyGamePapaFavFragment_.this.setNetwork();
        }
    }

    /* loaded from: classes4.dex */
    class l implements Runnable {
        l() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MyGamePapaFavFragment_.super.k0();
        }
    }

    /* loaded from: classes4.dex */
    class m implements Runnable {
        m() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MyGamePapaFavFragment_.super.w0();
        }
    }

    /* loaded from: classes4.dex */
    class n implements Runnable {
        n() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MyGamePapaFavFragment_.super.e0();
        }
    }

    /* loaded from: classes4.dex */
    class o implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f35747b;

        o(String str) {
            this.f35747b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            MyGamePapaFavFragment_.super.showMessage(this.f35747b);
        }
    }

    /* loaded from: classes4.dex */
    class p implements Runnable {
        p() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MyGamePapaFavFragment_.super.showLoding();
        }
    }

    /* loaded from: classes4.dex */
    class q implements Runnable {
        q() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MyGamePapaFavFragment_.super.showLodingFailed();
        }
    }

    /* loaded from: classes4.dex */
    public static class r extends org.androidannotations.api.builder.d<r, MyGamePapaFavFragment> {
        @Override // org.androidannotations.api.builder.d
        /* renamed from: a */
        public MyGamePapaFavFragment build() {
            MyGamePapaFavFragment_ myGamePapaFavFragment_ = new MyGamePapaFavFragment_();
            myGamePapaFavFragment_.setArguments(this.args);
            return myGamePapaFavFragment_;
        }

        public r b(String str) {
            this.args.putString("groupId", str);
            return this;
        }

        public r c(String str) {
            this.args.putString("title", str);
            return this;
        }
    }

    public static r O0() {
        return new r();
    }

    private void P0() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            if (arguments.containsKey("groupId")) {
                this.f35702g = arguments.getString("groupId");
            }
            if (arguments.containsKey("title")) {
                this.f35703h = arguments.getString("title");
            }
        }
    }

    private void init_(Bundle bundle) {
        this.f35715t = new PrefDef_(getActivity());
        a4.c.b(this);
        P0();
        this.E.addAction(o1.a.f72008k);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MyGamePapaFavFragment
    public void d0(int i4) {
        org.androidannotations.api.a.l(new h("", 0L, "", i4));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MyGamePapaFavFragment
    public void e0() {
        org.androidannotations.api.b.e("", new n(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MyGamePapaFavFragment
    public void g0() {
        org.androidannotations.api.a.l(new g("", 0L, ""));
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.D.get(cls);
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        View view = this.C;
        if (view == null) {
            return null;
        }
        return (T) view.findViewById(i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MyGamePapaFavFragment
    public void k0() {
        org.androidannotations.api.b.e("", new l(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MyGamePapaFavFragment
    public void l0() {
        org.androidannotations.api.b.e("", new e(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MyGamePapaFavFragment
    public void o0(String str) {
        org.androidannotations.api.b.e("", new f(str), 100L);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.B);
        init_(bundle);
        super.onCreate(bundle);
        getActivity().registerReceiver(this.F, this.E);
        a4.c.c(c5);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        this.C = onCreateView;
        if (onCreateView == null) {
            this.C = layoutInflater.inflate(R.layout.fragment_my_game_papa_fav, viewGroup, false);
        }
        return this.C;
    }

    @Override // com.join.mgps.activity.MyGamePapaFavFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        getActivity().unregisterReceiver(this.F);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.C = null;
        this.f35697b = null;
        this.f35698c = null;
        this.f35699d = null;
        this.f35700e = null;
        this.f35701f = null;
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f35697b = (XListView2) aVar.internalFindViewById(R.id.listView);
        this.f35698c = (LinearLayout) aVar.internalFindViewById(R.id.loding_layout);
        this.f35699d = (LinearLayout) aVar.internalFindViewById(R.id.loding_faile);
        this.f35700e = (LinearLayout) aVar.internalFindViewById(R.id.empty_layout);
        this.f35701f = aVar.internalFindViewById(R.id.root);
        View internalFindViewById = aVar.internalFindViewById(R.id.relodingimag);
        View internalFindViewById2 = aVar.internalFindViewById(R.id.setNetwork);
        if (internalFindViewById != null) {
            internalFindViewById.setOnClickListener(new j());
        }
        if (internalFindViewById2 != null) {
            internalFindViewById2.setOnClickListener(new k());
        }
        Z();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.B.a(this);
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.D.put(cls, t4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MyGamePapaFavFragment
    public void showLoding() {
        org.androidannotations.api.b.e("", new p(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MyGamePapaFavFragment
    public void showLodingFailed() {
        org.androidannotations.api.b.e("", new q(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MyGamePapaFavFragment
    public void showMain() {
        org.androidannotations.api.b.e("", new c(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MyGamePapaFavFragment
    public void showMessage(String str) {
        org.androidannotations.api.b.e("", new o(str), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MyGamePapaFavFragment
    public void t0(String str, String str2) {
        org.androidannotations.api.b.e("", new a(str, str2), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MyGamePapaFavFragment
    public void u0(String str) {
        org.androidannotations.api.b.e("", new b(str), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MyGamePapaFavFragment
    public void w0() {
        org.androidannotations.api.b.e("", new m(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MyGamePapaFavFragment
    public void x0() {
        org.androidannotations.api.b.e("", new d(), 0L);
    }
}
