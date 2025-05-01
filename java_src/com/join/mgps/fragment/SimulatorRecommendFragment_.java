package com.join.mgps.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.RecyclerView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.dto.CommonGameInfoBean;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.androidannotations.api.a;
/* loaded from: classes3.dex */
public final class SimulatorRecommendFragment_ extends SimulatorRecommendFragment implements y3.a, a4.a, a4.b {

    /* renamed from: j  reason: collision with root package name */
    private View f53129j;

    /* renamed from: i  reason: collision with root package name */
    private final a4.c f53128i = new a4.c();

    /* renamed from: k  reason: collision with root package name */
    private final Map<Class<?>, Object> f53130k = new HashMap();

    /* loaded from: classes3.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SimulatorRecommendFragment_.this.setNetwork();
        }
    }

    /* loaded from: classes3.dex */
    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SimulatorRecommendFragment_.this.relodingimag();
        }
    }

    /* loaded from: classes3.dex */
    class c implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f53133b;

        c(List list) {
            this.f53133b = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            SimulatorRecommendFragment_.super.updateUi(this.f53133b);
        }
    }

    /* loaded from: classes3.dex */
    class d implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f53135b;

        d(String str) {
            this.f53135b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            SimulatorRecommendFragment_.super.showTost(this.f53135b);
        }
    }

    /* loaded from: classes3.dex */
    class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SimulatorRecommendFragment_.super.showLoding();
        }
    }

    /* loaded from: classes3.dex */
    class f implements Runnable {
        f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SimulatorRecommendFragment_.super.showLodingFailed();
        }
    }

    /* loaded from: classes3.dex */
    class g implements Runnable {
        g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SimulatorRecommendFragment_.super.showMain();
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
                SimulatorRecommendFragment_.super.W();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes3.dex */
    public static class i extends org.androidannotations.api.builder.d<i, SimulatorRecommendFragment> {
        @Override // org.androidannotations.api.builder.d
        /* renamed from: a */
        public SimulatorRecommendFragment build() {
            SimulatorRecommendFragment_ simulatorRecommendFragment_ = new SimulatorRecommendFragment_();
            simulatorRecommendFragment_.setArguments(this.args);
            return simulatorRecommendFragment_;
        }
    }

    public static i e0() {
        return new i();
    }

    private void init_(Bundle bundle) {
        a4.c.b(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.SimulatorRecommendFragment
    public void W() {
        org.androidannotations.api.a.l(new h("", 0L, ""));
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.f53130k.get(cls);
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        View view = this.f53129j;
        if (view == null) {
            return null;
        }
        return (T) view.findViewById(i4);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.f53128i);
        init_(bundle);
        super.onCreate(bundle);
        a4.c.c(c5);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        this.f53129j = onCreateView;
        if (onCreateView == null) {
            this.f53129j = layoutInflater.inflate(R.layout.fragment_simulator_recommend, viewGroup, false);
        }
        return this.f53129j;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f53129j = null;
        this.f53120b = null;
        this.f53121c = null;
        this.f53122d = null;
        this.f53123e = null;
        this.f53124f = null;
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f53120b = (RecyclerView) aVar.internalFindViewById(R.id.rvRecom);
        this.f53121c = (TextView) aVar.internalFindViewById(R.id.tvRecGameount);
        this.f53122d = (LinearLayout) aVar.internalFindViewById(R.id.loding_layout);
        this.f53123e = (LinearLayout) aVar.internalFindViewById(R.id.loding_faile);
        this.f53124f = (Group) aVar.internalFindViewById(R.id.groupMain);
        View internalFindViewById = aVar.internalFindViewById(R.id.setNetwork);
        View internalFindViewById2 = aVar.internalFindViewById(R.id.relodingimag);
        if (internalFindViewById != null) {
            internalFindViewById.setOnClickListener(new a());
        }
        if (internalFindViewById2 != null) {
            internalFindViewById2.setOnClickListener(new b());
        }
        V();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f53128i.a(this);
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.f53130k.put(cls, t4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.SimulatorRecommendFragment
    public void showLoding() {
        org.androidannotations.api.b.e("", new e(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.SimulatorRecommendFragment
    public void showLodingFailed() {
        org.androidannotations.api.b.e("", new f(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.SimulatorRecommendFragment
    public void showMain() {
        org.androidannotations.api.b.e("", new g(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.SimulatorRecommendFragment
    public void showTost(String str) {
        org.androidannotations.api.b.e("", new d(str), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.SimulatorRecommendFragment
    public void updateUi(List<CommonGameInfoBean> list) {
        org.androidannotations.api.b.e("", new c(list), 0L);
    }
}
