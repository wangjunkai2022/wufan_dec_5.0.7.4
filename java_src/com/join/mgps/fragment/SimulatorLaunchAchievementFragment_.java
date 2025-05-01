package com.join.mgps.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.dto.SimulatorAchievementBean;
import java.util.HashMap;
import java.util.Map;
import org.androidannotations.api.a;
/* loaded from: classes3.dex */
public final class SimulatorLaunchAchievementFragment_ extends SimulatorLaunchAchievementFragment implements y3.a, a4.a, a4.b {

    /* renamed from: n  reason: collision with root package name */
    private View f53030n;

    /* renamed from: m  reason: collision with root package name */
    private final a4.c f53029m = new a4.c();

    /* renamed from: o  reason: collision with root package name */
    private final Map<Class<?>, Object> f53031o = new HashMap();

    /* loaded from: classes3.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SimulatorLaunchAchievementFragment_.this.setNetwork();
        }
    }

    /* loaded from: classes3.dex */
    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SimulatorLaunchAchievementFragment_.this.relodingimag();
        }
    }

    /* loaded from: classes3.dex */
    class c implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ SimulatorAchievementBean f53034b;

        c(SimulatorAchievementBean simulatorAchievementBean) {
            this.f53034b = simulatorAchievementBean;
        }

        @Override // java.lang.Runnable
        public void run() {
            SimulatorLaunchAchievementFragment_.super.a0(this.f53034b);
        }
    }

    /* loaded from: classes3.dex */
    class d implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f53036b;

        d(String str) {
            this.f53036b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            SimulatorLaunchAchievementFragment_.super.showTost(this.f53036b);
        }
    }

    /* loaded from: classes3.dex */
    class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SimulatorLaunchAchievementFragment_.super.showLoding();
        }
    }

    /* loaded from: classes3.dex */
    class f implements Runnable {
        f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SimulatorLaunchAchievementFragment_.super.showLodingFailed();
        }
    }

    /* loaded from: classes3.dex */
    class g implements Runnable {
        g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SimulatorLaunchAchievementFragment_.super.showMain();
        }
    }

    /* loaded from: classes3.dex */
    class h implements Runnable {
        h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SimulatorLaunchAchievementFragment_.super.showEmpty();
        }
    }

    /* loaded from: classes3.dex */
    class i extends a.c {
        i(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                SimulatorLaunchAchievementFragment_.super.X();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes3.dex */
    public static class j extends org.androidannotations.api.builder.d<j, SimulatorLaunchAchievementFragment> {
        @Override // org.androidannotations.api.builder.d
        /* renamed from: a */
        public SimulatorLaunchAchievementFragment build() {
            SimulatorLaunchAchievementFragment_ simulatorLaunchAchievementFragment_ = new SimulatorLaunchAchievementFragment_();
            simulatorLaunchAchievementFragment_.setArguments(this.args);
            return simulatorLaunchAchievementFragment_;
        }
    }

    public static j i0() {
        return new j();
    }

    private void init_(Bundle bundle) {
        a4.c.b(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.SimulatorLaunchAchievementFragment
    public void X() {
        org.androidannotations.api.a.l(new i("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.SimulatorLaunchAchievementFragment
    public void a0(SimulatorAchievementBean simulatorAchievementBean) {
        org.androidannotations.api.b.e("", new c(simulatorAchievementBean), 0L);
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.f53031o.get(cls);
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        View view = this.f53030n;
        if (view == null) {
            return null;
        }
        return (T) view.findViewById(i4);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.f53029m);
        init_(bundle);
        super.onCreate(bundle);
        a4.c.c(c5);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        this.f53030n = onCreateView;
        if (onCreateView == null) {
            this.f53030n = layoutInflater.inflate(R.layout.fragment_simulator_launch_achievement, viewGroup, false);
        }
        return this.f53030n;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f53030n = null;
        this.f52988b = null;
        this.f52989c = null;
        this.f52990d = null;
        this.f52991e = null;
        this.f52992f = null;
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f52988b = (LinearLayout) aVar.internalFindViewById(R.id.loding_layout);
        this.f52989c = (LinearLayout) aVar.internalFindViewById(R.id.loding_faile);
        this.f52990d = (LinearLayout) aVar.internalFindViewById(R.id.ll_empty);
        this.f52991e = (NestedScrollView) aVar.internalFindViewById(R.id.nes);
        this.f52992f = (RecyclerView) aVar.internalFindViewById(R.id.rvAchievement);
        View internalFindViewById = aVar.internalFindViewById(R.id.setNetwork);
        View internalFindViewById2 = aVar.internalFindViewById(R.id.relodingimag);
        if (internalFindViewById != null) {
            internalFindViewById.setOnClickListener(new a());
        }
        if (internalFindViewById2 != null) {
            internalFindViewById2.setOnClickListener(new b());
        }
        W();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f53029m.a(this);
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.f53031o.put(cls, t4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.SimulatorLaunchAchievementFragment
    public void showEmpty() {
        org.androidannotations.api.b.e("", new h(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.SimulatorLaunchAchievementFragment
    public void showLoding() {
        org.androidannotations.api.b.e("", new e(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.SimulatorLaunchAchievementFragment
    public void showLodingFailed() {
        org.androidannotations.api.b.e("", new f(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.SimulatorLaunchAchievementFragment
    public void showMain() {
        org.androidannotations.api.b.e("", new g(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.SimulatorLaunchAchievementFragment
    public void showTost(String str) {
        org.androidannotations.api.b.e("", new d(str), 0L);
    }
}
