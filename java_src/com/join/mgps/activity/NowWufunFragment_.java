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
import com.join.mgps.dto.CollectionBeanSub;
import com.join.mgps.dto.TodayWufunBean;
import com.join.mgps.dto.TodayWufunTopic;
import com.join.mgps.ptr.PtrClassicFrameLayout;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.androidannotations.api.a;
/* loaded from: classes4.dex */
public final class NowWufunFragment_ extends NowWufunFragment implements y3.a, a4.a, a4.b {

    /* renamed from: r  reason: collision with root package name */
    private View f36205r;

    /* renamed from: q  reason: collision with root package name */
    private final a4.c f36204q = new a4.c();

    /* renamed from: s  reason: collision with root package name */
    private final Map<Class<?>, Object> f36206s = new HashMap();

    /* renamed from: t  reason: collision with root package name */
    private final IntentFilter f36207t = new IntentFilter();

    /* renamed from: u  reason: collision with root package name */
    private final BroadcastReceiver f36208u = new a();

    /* loaded from: classes4.dex */
    class a extends BroadcastReceiver {

        /* renamed from: b  reason: collision with root package name */
        public static final String f36209b = "gameData";

        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            NowWufunFragment_.this.d0((CollectionBeanSub) (intent.getExtras() != null ? intent.getExtras() : new Bundle()).getSerializable("gameData"));
        }
    }

    /* loaded from: classes4.dex */
    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            NowWufunFragment_.this.relodingimag();
        }
    }

    /* loaded from: classes4.dex */
    class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            NowWufunFragment_.this.setNetwork();
        }
    }

    /* loaded from: classes4.dex */
    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            NowWufunFragment_.super.j0();
        }
    }

    /* loaded from: classes4.dex */
    class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            NowWufunFragment_.super.i0();
        }
    }

    /* loaded from: classes4.dex */
    class f implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f36215b;

        f(List list) {
            this.f36215b = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            NowWufunFragment_.super.k0(this.f36215b);
        }
    }

    /* loaded from: classes4.dex */
    class g implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f36217b;

        g(List list) {
            this.f36217b = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            NowWufunFragment_.super.l0(this.f36217b);
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
                NowWufunFragment_.super.a0();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class i extends a.c {
        i(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                NowWufunFragment_.super.b0();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    public static class j extends org.androidannotations.api.builder.d<j, NowWufunFragment> {
        @Override // org.androidannotations.api.builder.d
        /* renamed from: a */
        public NowWufunFragment build() {
            NowWufunFragment_ nowWufunFragment_ = new NowWufunFragment_();
            nowWufunFragment_.setArguments(this.args);
            return nowWufunFragment_;
        }
    }

    private void init_(Bundle bundle) {
        a4.c.b(this);
        this.f36207t.addAction(o1.a.I);
        this.f36207t.addAction(o1.a.G);
    }

    public static j v0() {
        return new j();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.NowWufunFragment
    public void a0() {
        org.androidannotations.api.a.l(new h("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.NowWufunFragment
    public void b0() {
        org.androidannotations.api.a.l(new i("", 0L, ""));
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.f36206s.get(cls);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.NowWufunFragment
    public void i0() {
        org.androidannotations.api.b.e("", new e(), 0L);
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        View view = this.f36205r;
        if (view == null) {
            return null;
        }
        return (T) view.findViewById(i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.NowWufunFragment
    public void j0() {
        org.androidannotations.api.b.e("", new d(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.NowWufunFragment
    public void k0(List<TodayWufunBean> list) {
        org.androidannotations.api.b.e("", new f(list), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.NowWufunFragment
    public void l0(List<TodayWufunTopic> list) {
        org.androidannotations.api.b.e("", new g(list), 0L);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.f36204q);
        init_(bundle);
        super.onCreate(bundle);
        getActivity().registerReceiver(this.f36208u, this.f36207t);
        a4.c.c(c5);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        this.f36205r = onCreateView;
        if (onCreateView == null) {
            this.f36205r = layoutInflater.inflate(R.layout.now_wufun_fragment_layout, viewGroup, false);
        }
        return this.f36205r;
    }

    @Override // com.join.mgps.activity.NowWufunFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        getActivity().unregisterReceiver(this.f36208u);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f36205r = null;
        this.f36185d = null;
        this.f36186e = null;
        this.f36187f = null;
        this.f36188g = null;
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f36185d = (PtrClassicFrameLayout) aVar.internalFindViewById(R.id.mPtrFrame);
        this.f36186e = (XListView2) aVar.internalFindViewById(R.id.xListView);
        this.f36187f = (LinearLayout) aVar.internalFindViewById(R.id.loding_layout);
        this.f36188g = (LinearLayout) aVar.internalFindViewById(R.id.loding_faile);
        View internalFindViewById = aVar.internalFindViewById(R.id.relodingimag);
        View internalFindViewById2 = aVar.internalFindViewById(R.id.setNetwork);
        if (internalFindViewById != null) {
            internalFindViewById.setOnClickListener(new b());
        }
        if (internalFindViewById2 != null) {
            internalFindViewById2.setOnClickListener(new c());
        }
        V();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f36204q.a(this);
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.f36206s.put(cls, t4);
    }
}
