package com.join.mgps.fragment;

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
import com.join.mgps.dto.CollectionBeanSub;
import com.join.mgps.dto.PaPaBean;
import com.join.mgps.ptr.PtrClassicFrameLayout;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.androidannotations.api.a;
/* loaded from: classes3.dex */
public final class PaPaStandAloneV2Fragment_ extends PaPaStandAloneV2Fragment implements y3.a, a4.a, a4.b {
    private View D;
    private final a4.c C = new a4.c();
    private final Map<Class<?>, Object> E = new HashMap();
    private final IntentFilter F = new IntentFilter();
    private final BroadcastReceiver G = new c();

    /* loaded from: classes3.dex */
    class a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f52606b;

        a(String str) {
            this.f52606b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            PaPaStandAloneV2Fragment_.super.showToast(this.f52606b);
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
                PaPaStandAloneV2Fragment_.super.b0();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes3.dex */
    class c extends BroadcastReceiver {

        /* renamed from: b  reason: collision with root package name */
        public static final String f52609b = "gameData";

        c() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            PaPaStandAloneV2Fragment_.this.i0((CollectionBeanSub) (intent.getExtras() != null ? intent.getExtras() : new Bundle()).getSerializable("gameData"));
        }
    }

    /* loaded from: classes3.dex */
    class d implements View.OnClickListener {
        d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            PaPaStandAloneV2Fragment_.this.relodingimag();
        }
    }

    /* loaded from: classes3.dex */
    class e implements View.OnClickListener {
        e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            PaPaStandAloneV2Fragment_.this.setNetwork();
        }
    }

    /* loaded from: classes3.dex */
    class f implements Runnable {
        f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            PaPaStandAloneV2Fragment_.super.q0();
        }
    }

    /* loaded from: classes3.dex */
    class g implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f52614b;

        g(List list) {
            this.f52614b = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            PaPaStandAloneV2Fragment_.super.u0(this.f52614b);
        }
    }

    /* loaded from: classes3.dex */
    class h implements Runnable {
        h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            PaPaStandAloneV2Fragment_.super.o0();
        }
    }

    /* loaded from: classes3.dex */
    class i implements Runnable {
        i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            PaPaStandAloneV2Fragment_.super.p0();
        }
    }

    /* loaded from: classes3.dex */
    class j implements Runnable {
        j() {
        }

        @Override // java.lang.Runnable
        public void run() {
            PaPaStandAloneV2Fragment_.super.n0();
        }
    }

    /* loaded from: classes3.dex */
    class k implements Runnable {
        k() {
        }

        @Override // java.lang.Runnable
        public void run() {
            PaPaStandAloneV2Fragment_.super.hideLoading();
        }
    }

    /* loaded from: classes3.dex */
    public static class l extends org.androidannotations.api.builder.d<l, PaPaStandAloneV2Fragment> {
        @Override // org.androidannotations.api.builder.d
        /* renamed from: a */
        public PaPaStandAloneV2Fragment build() {
            PaPaStandAloneV2Fragment_ paPaStandAloneV2Fragment_ = new PaPaStandAloneV2Fragment_();
            paPaStandAloneV2Fragment_.setArguments(this.args);
            return paPaStandAloneV2Fragment_;
        }
    }

    public static l D0() {
        return new l();
    }

    private void init_(Bundle bundle) {
        a4.c.b(this);
        this.F.addAction(o1.a.I);
        this.F.addAction(o1.a.G);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.PaPaStandAloneV2Fragment
    public void b0() {
        org.androidannotations.api.a.l(new b("", 0L, ""));
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.E.get(cls);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.PaPaStandAloneV2Fragment
    public void hideLoading() {
        org.androidannotations.api.b.e("", new k(), 0L);
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        View view = this.D;
        if (view == null) {
            return null;
        }
        return (T) view.findViewById(i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.PaPaStandAloneV2Fragment
    public void n0() {
        org.androidannotations.api.b.e("", new j(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.PaPaStandAloneV2Fragment
    public void o0() {
        org.androidannotations.api.b.e("", new h(), 0L);
    }

    @Override // com.join.mgps.fragment.PaPaStandAloneV2Fragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.C);
        init_(bundle);
        super.onCreate(bundle);
        getActivity().registerReceiver(this.G, this.F);
        a4.c.c(c5);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        this.D = onCreateView;
        if (onCreateView == null) {
            this.D = layoutInflater.inflate(R.layout.fragment_papa_standalone_v2, viewGroup, false);
        }
        return this.D;
    }

    @Override // com.join.mgps.fragment.PaPaStandAloneV2Fragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        getActivity().unregisterReceiver(this.G);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.D = null;
        this.f52583f = null;
        this.f52586i = null;
        this.f52587j = null;
        this.f52588k = null;
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f52583f = (XListView2) aVar.internalFindViewById(R.id.mListView);
        this.f52586i = (LinearLayout) aVar.internalFindViewById(R.id.loding_faile);
        this.f52587j = (LinearLayout) aVar.internalFindViewById(R.id.loding_layout);
        this.f52588k = (PtrClassicFrameLayout) aVar.internalFindViewById(R.id.mPtrFrame);
        View internalFindViewById = aVar.internalFindViewById(R.id.relodingimag);
        View internalFindViewById2 = aVar.internalFindViewById(R.id.setNetwork);
        if (internalFindViewById != null) {
            internalFindViewById.setOnClickListener(new d());
        }
        if (internalFindViewById2 != null) {
            internalFindViewById2.setOnClickListener(new e());
        }
        afterViews();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.C.a(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.PaPaStandAloneV2Fragment
    public void p0() {
        org.androidannotations.api.b.e("", new i(), 0L);
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.E.put(cls, t4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.PaPaStandAloneV2Fragment
    public void q0() {
        org.androidannotations.api.b.e("", new f(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.PaPaStandAloneV2Fragment
    public void showToast(String str) {
        org.androidannotations.api.b.e("", new a(str), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.PaPaStandAloneV2Fragment
    public void u0(List<PaPaBean> list) {
        org.androidannotations.api.b.e("", new g(list), 0L);
    }
}
