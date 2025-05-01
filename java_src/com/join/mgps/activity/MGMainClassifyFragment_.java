package com.join.mgps.activity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.ToggleButton;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.MViewpagerV4;
import com.join.mgps.customview.SlidingTabLayout;
import com.join.mgps.dto.CategorySimpleBean;
import com.join.mgps.pref.PrefDef_;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.androidannotations.api.a;
/* loaded from: classes4.dex */
public final class MGMainClassifyFragment_ extends MGMainClassifyFragment implements y3.a, a4.a, a4.b {
    private View K;
    private final a4.c J = new a4.c();
    private final Map<Class<?>, Object> L = new HashMap();

    /* loaded from: classes4.dex */
    class a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f34866b;

        a(String str) {
            this.f34866b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            MGMainClassifyFragment_.super.j0(this.f34866b);
        }
    }

    /* loaded from: classes4.dex */
    class b implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f34868b;

        b(List list) {
            this.f34868b = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            MGMainClassifyFragment_.super.o0(this.f34868b);
        }
    }

    /* loaded from: classes4.dex */
    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MGMainClassifyFragment_.super.q0();
        }
    }

    /* loaded from: classes4.dex */
    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MGMainClassifyFragment_.super.p0();
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
                MGMainClassifyFragment_.super.f0();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class f implements View.OnClickListener {
        f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MGMainClassifyFragment_.this.e0();
        }
    }

    /* loaded from: classes4.dex */
    class g implements View.OnClickListener {
        g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MGMainClassifyFragment_.this.setNetwork();
        }
    }

    /* loaded from: classes4.dex */
    class h implements View.OnClickListener {
        h() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MGMainClassifyFragment_.this.relodingimag();
        }
    }

    /* loaded from: classes4.dex */
    class i implements View.OnClickListener {
        i() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MGMainClassifyFragment_.this.i0();
        }
    }

    /* loaded from: classes4.dex */
    class j implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f34877b;

        j(String str) {
            this.f34877b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            MGMainClassifyFragment_.super.l0(this.f34877b);
        }
    }

    /* loaded from: classes4.dex */
    class k implements Runnable {
        k() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MGMainClassifyFragment_.super.n0();
        }
    }

    /* loaded from: classes4.dex */
    class l implements Runnable {
        l() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MGMainClassifyFragment_.super.k0();
        }
    }

    /* loaded from: classes4.dex */
    class m implements Runnable {
        m() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MGMainClassifyFragment_.super.r0();
        }
    }

    /* loaded from: classes4.dex */
    class n implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f34882b;

        n(String str) {
            this.f34882b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            MGMainClassifyFragment_.super.m0(this.f34882b);
        }
    }

    /* loaded from: classes4.dex */
    public static class o extends org.androidannotations.api.builder.d<o, MGMainClassifyFragment> {
        @Override // org.androidannotations.api.builder.d
        /* renamed from: a */
        public MGMainClassifyFragment build() {
            MGMainClassifyFragment_ mGMainClassifyFragment_ = new MGMainClassifyFragment_();
            mGMainClassifyFragment_.setArguments(this.args);
            return mGMainClassifyFragment_;
        }
    }

    public static o D0() {
        return new o();
    }

    private void init_(Bundle bundle) {
        this.E = new PrefDef_(getActivity());
        a4.c.b(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MGMainClassifyFragment
    public void f0() {
        org.androidannotations.api.a.l(new e("", 0L, ""));
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.L.get(cls);
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        View view = this.K;
        if (view == null) {
            return null;
        }
        return (T) view.findViewById(i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MGMainClassifyFragment
    public void j0(String str) {
        org.androidannotations.api.b.e("", new a(str), 1000L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MGMainClassifyFragment
    public void k0() {
        org.androidannotations.api.b.e("", new l(), 1000L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MGMainClassifyFragment
    public void l0(String str) {
        org.androidannotations.api.b.e("", new j(str), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MGMainClassifyFragment
    public void m0(String str) {
        org.androidannotations.api.b.e("", new n(str), 500L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MGMainClassifyFragment
    public void n0() {
        org.androidannotations.api.b.e("", new k(), 500L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MGMainClassifyFragment
    public void o0(List<CategorySimpleBean> list) {
        org.androidannotations.api.b.e("", new b(list), 0L);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.J);
        init_(bundle);
        super.onCreate(bundle);
        a4.c.c(c5);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        this.K = onCreateView;
        if (onCreateView == null) {
            this.K = layoutInflater.inflate(R.layout.my_game_layout, viewGroup, false);
        }
        return this.K;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.K = null;
        this.f34837s = null;
        this.f34838t = null;
        this.f34839u = null;
        this.f34840v = null;
        this.f34841w = null;
        this.f34842x = null;
        this.f34843y = null;
        this.f34844z = null;
        this.A = null;
        this.B = null;
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f34837s = (LinearLayout) aVar.internalFindViewById(R.id.linearLayoutMain);
        this.f34838t = (LinearLayout) aVar.internalFindViewById(R.id.loding_layout);
        this.f34839u = (LinearLayout) aVar.internalFindViewById(R.id.loding_faile);
        this.f34840v = (MViewpagerV4) aVar.internalFindViewById(R.id.mViewpagerV4);
        this.f34841w = (SlidingTabLayout) aVar.internalFindViewById(R.id.mSlidingTabLayout);
        this.f34842x = (ToggleButton) aVar.internalFindViewById(R.id.toggleButton);
        this.f34843y = (TextView) aVar.internalFindViewById(R.id.backTextView);
        this.f34844z = (TextView) aVar.internalFindViewById(R.id.romTypeTitle);
        this.A = (LinearLayout) aVar.internalFindViewById(R.id.searchImage);
        this.B = (ToggleButton) aVar.internalFindViewById(R.id.toggleButtonRom);
        View internalFindViewById = aVar.internalFindViewById(R.id.back_image);
        View internalFindViewById2 = aVar.internalFindViewById(R.id.setNetwork);
        View internalFindViewById3 = aVar.internalFindViewById(R.id.relodingimag);
        if (internalFindViewById != null) {
            internalFindViewById.setOnClickListener(new f());
        }
        if (internalFindViewById2 != null) {
            internalFindViewById2.setOnClickListener(new g());
        }
        if (internalFindViewById3 != null) {
            internalFindViewById3.setOnClickListener(new h());
        }
        LinearLayout linearLayout = this.A;
        if (linearLayout != null) {
            linearLayout.setOnClickListener(new i());
        }
        afterViews();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.J.a(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MGMainClassifyFragment
    public void p0() {
        org.androidannotations.api.b.e("", new d(), 0L);
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.L.put(cls, t4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MGMainClassifyFragment
    public void q0() {
        org.androidannotations.api.b.e("", new c(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MGMainClassifyFragment
    public void r0() {
        org.androidannotations.api.b.e("", new m(), 0L);
    }
}
