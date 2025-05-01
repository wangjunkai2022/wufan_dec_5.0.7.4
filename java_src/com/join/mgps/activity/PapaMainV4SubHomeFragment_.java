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
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
import com.join.kotlin.base.widget.recycleview.XQuickRecyclerView;
import com.join.mgps.dto.HomeFloatData;
import com.join.mgps.dto.PapaHomeBeanV9;
import com.join.mgps.pref.PrefDef_;
import com.join.mgps.ptr.PtrClassicFrameLayout;
import java.util.HashMap;
import java.util.Map;
import org.androidannotations.api.a;
/* loaded from: classes4.dex */
public final class PapaMainV4SubHomeFragment_ extends PapaMainV4SubHomeFragment implements y3.a, a4.a, a4.b {
    private View C;
    private final a4.c B = new a4.c();
    private final Map<Class<?>, Object> D = new HashMap();
    private final IntentFilter E = new IntentFilter();
    private final BroadcastReceiver F = new i();

    /* loaded from: classes4.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            PapaMainV4SubHomeFragment_.super.showMain();
        }
    }

    /* loaded from: classes4.dex */
    class b implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ HomeFloatData f36779b;

        b(HomeFloatData homeFloatData) {
            this.f36779b = homeFloatData;
        }

        @Override // java.lang.Runnable
        public void run() {
            PapaMainV4SubHomeFragment_.super.G0(this.f36779b);
        }
    }

    /* loaded from: classes4.dex */
    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            PapaMainV4SubHomeFragment_.super.s0();
        }
    }

    /* loaded from: classes4.dex */
    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            PapaMainV4SubHomeFragment_.super.r0();
        }
    }

    /* loaded from: classes4.dex */
    class e extends a.c {
        e(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                PapaMainV4SubHomeFragment_.super.v0();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class f extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f36784b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(String str, long j4, String str2, int i4) {
            super(str, j4, str2);
            this.f36784b = i4;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                PapaMainV4SubHomeFragment_.super.w0(this.f36784b);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class g extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PapaHomeBeanV9 f36786b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(String str, long j4, String str2, PapaHomeBeanV9 papaHomeBeanV9) {
            super(str, j4, str2);
            this.f36786b = papaHomeBeanV9;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                PapaMainV4SubHomeFragment_.super.C0(this.f36786b);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class h extends a.c {
        h(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                PapaMainV4SubHomeFragment_.super.n0();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class i extends BroadcastReceiver {
        i() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            PapaMainV4SubHomeFragment_.this.W();
        }
    }

    /* loaded from: classes4.dex */
    class j implements View.OnClickListener {
        j() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            PapaMainV4SubHomeFragment_.this.relodingimag();
        }
    }

    /* loaded from: classes4.dex */
    class k implements View.OnClickListener {
        k() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            PapaMainV4SubHomeFragment_.this.setNetwork();
        }
    }

    /* loaded from: classes4.dex */
    class l implements View.OnClickListener {
        l() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            PapaMainV4SubHomeFragment_.this.t0();
        }
    }

    /* loaded from: classes4.dex */
    class m implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PapaHomeBeanV9 f36793b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f36794c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f36795d;

        m(PapaHomeBeanV9 papaHomeBeanV9, int i4, boolean z4) {
            this.f36793b = papaHomeBeanV9;
            this.f36794c = i4;
            this.f36795d = z4;
        }

        @Override // java.lang.Runnable
        public void run() {
            PapaMainV4SubHomeFragment_.super.I0(this.f36793b, this.f36794c, this.f36795d);
        }
    }

    /* loaded from: classes4.dex */
    class n implements Runnable {
        n() {
        }

        @Override // java.lang.Runnable
        public void run() {
            PapaMainV4SubHomeFragment_.super.x0();
        }
    }

    /* loaded from: classes4.dex */
    class o implements Runnable {
        o() {
        }

        @Override // java.lang.Runnable
        public void run() {
            PapaMainV4SubHomeFragment_.super.J0();
        }
    }

    /* loaded from: classes4.dex */
    class p implements Runnable {
        p() {
        }

        @Override // java.lang.Runnable
        public void run() {
            PapaMainV4SubHomeFragment_.super.showLoding();
        }
    }

    /* loaded from: classes4.dex */
    class q implements Runnable {
        q() {
        }

        @Override // java.lang.Runnable
        public void run() {
            PapaMainV4SubHomeFragment_.super.showLodingFailed();
        }
    }

    /* loaded from: classes4.dex */
    public static class r extends org.androidannotations.api.builder.d<r, PapaMainV4SubHomeFragment> {
        @Override // org.androidannotations.api.builder.d
        /* renamed from: a */
        public PapaMainV4SubHomeFragment build() {
            PapaMainV4SubHomeFragment_ papaMainV4SubHomeFragment_ = new PapaMainV4SubHomeFragment_();
            papaMainV4SubHomeFragment_.setArguments(this.args);
            return papaMainV4SubHomeFragment_;
        }
    }

    public static r c1() {
        return new r();
    }

    private void init_(Bundle bundle) {
        this.f36752g = new PrefDef_(getActivity());
        a4.c.b(this);
        this.E.addAction(o1.a.B);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.PapaMainV4SubHomeFragment
    public void C0(PapaHomeBeanV9 papaHomeBeanV9) {
        org.androidannotations.api.a.l(new g("", 0L, "", papaHomeBeanV9));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.PapaMainV4SubHomeFragment
    public void G0(HomeFloatData homeFloatData) {
        org.androidannotations.api.b.e("", new b(homeFloatData), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.PapaMainV4SubHomeFragment
    public void I0(PapaHomeBeanV9 papaHomeBeanV9, int i4, boolean z4) {
        org.androidannotations.api.b.e("", new m(papaHomeBeanV9, i4, z4), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.PapaMainV4SubHomeFragment
    public void J0() {
        org.androidannotations.api.b.e("", new o(), 0L);
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
    @Override // com.join.mgps.activity.PapaMainV4SubHomeFragment
    public void n0() {
        org.androidannotations.api.a.l(new h("", 0L, ""));
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
            this.C = layoutInflater.inflate(R.layout.mgpapa_mainfragment_new_layout_v4_sub_home, viewGroup, false);
        }
        return this.C;
    }

    @Override // com.join.mgps.activity.PapaMainV4SubHomeFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        getActivity().unregisterReceiver(this.F);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.C = null;
        this.f36747b = null;
        this.f36748c = null;
        this.f36749d = null;
        this.f36750e = null;
        this.f36751f = null;
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f36747b = (XQuickRecyclerView) aVar.internalFindViewById(R.id.recyclerView);
        this.f36748c = (PtrClassicFrameLayout) aVar.internalFindViewById(R.id.ptr);
        this.f36749d = (LinearLayout) aVar.internalFindViewById(R.id.loding_layout);
        this.f36750e = (LinearLayout) aVar.internalFindViewById(R.id.loding_faile);
        this.f36751f = (SimpleDraweeView) aVar.internalFindViewById(R.id.ivFloatad);
        View internalFindViewById = aVar.internalFindViewById(R.id.relodingimag);
        View internalFindViewById2 = aVar.internalFindViewById(R.id.setNetwork);
        if (internalFindViewById != null) {
            internalFindViewById.setOnClickListener(new j());
        }
        if (internalFindViewById2 != null) {
            internalFindViewById2.setOnClickListener(new k());
        }
        SimpleDraweeView simpleDraweeView = this.f36751f;
        if (simpleDraweeView != null) {
            simpleDraweeView.setOnClickListener(new l());
        }
        afterViews();
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
    @Override // com.join.mgps.activity.PapaMainV4SubHomeFragment
    public void r0() {
        org.androidannotations.api.b.e("", new d(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.PapaMainV4SubHomeFragment
    public void s0() {
        org.androidannotations.api.b.e("", new c(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.PapaMainV4SubHomeFragment
    public void showLoding() {
        org.androidannotations.api.b.e("", new p(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.PapaMainV4SubHomeFragment
    public void showLodingFailed() {
        org.androidannotations.api.b.e("", new q(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.PapaMainV4SubHomeFragment
    public void showMain() {
        org.androidannotations.api.b.e("", new a(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.PapaMainV4SubHomeFragment
    public void v0() {
        org.androidannotations.api.a.l(new e("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.PapaMainV4SubHomeFragment
    public void w0(int i4) {
        org.androidannotations.api.a.l(new f("", 0L, "", i4));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.PapaMainV4SubHomeFragment
    public void x0() {
        org.androidannotations.api.b.e("", new n(), 0L);
    }
}
