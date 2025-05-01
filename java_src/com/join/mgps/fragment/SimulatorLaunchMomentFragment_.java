package com.join.mgps.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.widget.NestedScrollView;
import com.join.android.app.component.xrecyclerview.XRecyclerView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.dto.SimulatorMomentBean;
import java.util.HashMap;
import java.util.Map;
import org.androidannotations.api.a;
/* loaded from: classes3.dex */
public final class SimulatorLaunchMomentFragment_ extends SimulatorLaunchMomentFragment implements y3.a, a4.a, a4.b {

    /* renamed from: t  reason: collision with root package name */
    private View f53098t;

    /* renamed from: s  reason: collision with root package name */
    private final a4.c f53097s = new a4.c();

    /* renamed from: u  reason: collision with root package name */
    private final Map<Class<?>, Object> f53099u = new HashMap();

    /* loaded from: classes3.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SimulatorLaunchMomentFragment_.super.showEmpty();
        }
    }

    /* loaded from: classes3.dex */
    class b extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f53101b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, long j4, String str2, int i4) {
            super(str, j4, str2);
            this.f53101b = i4;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                SimulatorLaunchMomentFragment_.super.a0(this.f53101b);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes3.dex */
    class c extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f53103b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, long j4, String str2, int i4) {
            super(str, j4, str2);
            this.f53103b = i4;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                SimulatorLaunchMomentFragment_.super.c0(this.f53103b);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes3.dex */
    class d extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f53105b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(String str, long j4, String str2, int i4) {
            super(str, j4, str2);
            this.f53105b = i4;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                SimulatorLaunchMomentFragment_.super.d0(this.f53105b);
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
            SimulatorLaunchMomentFragment_.this.setNetwork();
        }
    }

    /* loaded from: classes3.dex */
    class f implements View.OnClickListener {
        f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SimulatorLaunchMomentFragment_.this.relodingimag();
        }
    }

    /* loaded from: classes3.dex */
    class g implements Runnable {
        g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SimulatorLaunchMomentFragment_.super.g0();
        }
    }

    /* loaded from: classes3.dex */
    class h implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f53110b;

        h(int i4) {
            this.f53110b = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            SimulatorLaunchMomentFragment_.super.e0(this.f53110b);
        }
    }

    /* loaded from: classes3.dex */
    class i implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ SimulatorMomentBean f53112b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f53113c;

        i(SimulatorMomentBean simulatorMomentBean, int i4) {
            this.f53112b = simulatorMomentBean;
            this.f53113c = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            SimulatorLaunchMomentFragment_.super.h0(this.f53112b, this.f53113c);
        }
    }

    /* loaded from: classes3.dex */
    class j implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f53115b;

        j(String str) {
            this.f53115b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            SimulatorLaunchMomentFragment_.super.showTost(this.f53115b);
        }
    }

    /* loaded from: classes3.dex */
    class k implements Runnable {
        k() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SimulatorLaunchMomentFragment_.super.showLoding();
        }
    }

    /* loaded from: classes3.dex */
    class l implements Runnable {
        l() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SimulatorLaunchMomentFragment_.super.showLodingFailed();
        }
    }

    /* loaded from: classes3.dex */
    class m implements Runnable {
        m() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SimulatorLaunchMomentFragment_.super.showMain();
        }
    }

    /* loaded from: classes3.dex */
    public static class n extends org.androidannotations.api.builder.d<n, SimulatorLaunchMomentFragment> {
        @Override // org.androidannotations.api.builder.d
        /* renamed from: a */
        public SimulatorLaunchMomentFragment build() {
            SimulatorLaunchMomentFragment_ simulatorLaunchMomentFragment_ = new SimulatorLaunchMomentFragment_();
            simulatorLaunchMomentFragment_.setArguments(this.args);
            return simulatorLaunchMomentFragment_;
        }
    }

    private void init_(Bundle bundle) {
        a4.c.b(this);
    }

    public static n t0() {
        return new n();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.SimulatorLaunchMomentFragment
    public void a0(int i4) {
        org.androidannotations.api.a.l(new b("", 0L, "", i4));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.SimulatorLaunchMomentFragment
    public void c0(int i4) {
        org.androidannotations.api.a.l(new c("", 0L, "", i4));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.SimulatorLaunchMomentFragment
    public void d0(int i4) {
        org.androidannotations.api.a.l(new d("", 0L, "", i4));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.SimulatorLaunchMomentFragment
    public void e0(int i4) {
        org.androidannotations.api.b.e("", new h(i4), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.SimulatorLaunchMomentFragment
    public void g0() {
        org.androidannotations.api.b.e("", new g(), 0L);
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.f53099u.get(cls);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.SimulatorLaunchMomentFragment
    public void h0(SimulatorMomentBean simulatorMomentBean, int i4) {
        org.androidannotations.api.b.e("", new i(simulatorMomentBean, i4), 0L);
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        View view = this.f53098t;
        if (view == null) {
            return null;
        }
        return (T) view.findViewById(i4);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.f53097s);
        init_(bundle);
        super.onCreate(bundle);
        a4.c.c(c5);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        this.f53098t = onCreateView;
        if (onCreateView == null) {
            this.f53098t = layoutInflater.inflate(R.layout.fragment_simulator_launch_moment, viewGroup, false);
        }
        return this.f53098t;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f53098t = null;
        this.f53046b = null;
        this.f53047c = null;
        this.f53048d = null;
        this.f53049e = null;
        this.f53050f = null;
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f53046b = (XRecyclerView) aVar.internalFindViewById(R.id.recyclerView);
        this.f53047c = (LinearLayout) aVar.internalFindViewById(R.id.loding_layout);
        this.f53048d = (LinearLayout) aVar.internalFindViewById(R.id.loding_faile);
        this.f53049e = (LinearLayout) aVar.internalFindViewById(R.id.ll_empty);
        this.f53050f = (NestedScrollView) aVar.internalFindViewById(R.id.nes);
        View internalFindViewById = aVar.internalFindViewById(R.id.setNetwork);
        View internalFindViewById2 = aVar.internalFindViewById(R.id.relodingimag);
        if (internalFindViewById != null) {
            internalFindViewById.setOnClickListener(new e());
        }
        if (internalFindViewById2 != null) {
            internalFindViewById2.setOnClickListener(new f());
        }
        Z();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f53097s.a(this);
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.f53099u.put(cls, t4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.SimulatorLaunchMomentFragment
    public void showEmpty() {
        org.androidannotations.api.b.e("", new a(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.SimulatorLaunchMomentFragment
    public void showLoding() {
        org.androidannotations.api.b.e("", new k(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.SimulatorLaunchMomentFragment
    public void showLodingFailed() {
        org.androidannotations.api.b.e("", new l(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.SimulatorLaunchMomentFragment
    public void showMain() {
        org.androidannotations.api.b.e("", new m(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.SimulatorLaunchMomentFragment
    public void showTost(String str) {
        org.androidannotations.api.b.e("", new j(str), 0L);
    }
}
