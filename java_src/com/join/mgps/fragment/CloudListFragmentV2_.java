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
import android.widget.TextView;
import com.join.android.app.component.xrecyclerview.XRecyclerView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.dto.CloudListDataBean;
import com.join.mgps.pref.PrefDef_;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.androidannotations.api.a;
/* loaded from: classes3.dex */
public final class CloudListFragmentV2_ extends CloudListFragmentV2 implements y3.a, a4.a, a4.b {
    private View F;
    private final a4.c E = new a4.c();
    private final Map<Class<?>, Object> G = new HashMap();
    private final IntentFilter H = new IntentFilter();
    private final BroadcastReceiver I = new k();

    /* loaded from: classes3.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            CloudListFragmentV2_.super.A0();
        }
    }

    /* loaded from: classes3.dex */
    class b implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f50178b;

        b(List list) {
            this.f50178b = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            CloudListFragmentV2_.super.e0(this.f50178b);
        }
    }

    /* loaded from: classes3.dex */
    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            CloudListFragmentV2_.super.E0();
        }
    }

    /* loaded from: classes3.dex */
    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            CloudListFragmentV2_.super.G0();
        }
    }

    /* loaded from: classes3.dex */
    class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            CloudListFragmentV2_.super.y0();
        }
    }

    /* loaded from: classes3.dex */
    class f implements Runnable {
        f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            CloudListFragmentV2_.super.z0();
        }
    }

    /* loaded from: classes3.dex */
    class g implements Runnable {
        g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            CloudListFragmentV2_.super.x0();
        }
    }

    /* loaded from: classes3.dex */
    class h implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f50185b;

        h(String str) {
            this.f50185b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            CloudListFragmentV2_.super.showMessage(this.f50185b);
        }
    }

    /* loaded from: classes3.dex */
    class i implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CloudListDataBean f50187b;

        i(CloudListDataBean cloudListDataBean) {
            this.f50187b = cloudListDataBean;
        }

        @Override // java.lang.Runnable
        public void run() {
            CloudListFragmentV2_.super.D0(this.f50187b);
        }
    }

    /* loaded from: classes3.dex */
    class j implements Runnable {
        j() {
        }

        @Override // java.lang.Runnable
        public void run() {
            CloudListFragmentV2_.super.F0();
        }
    }

    /* loaded from: classes3.dex */
    class k extends BroadcastReceiver {
        k() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            CloudListFragmentV2_.this.s0(intent);
        }
    }

    /* loaded from: classes3.dex */
    class l implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CloudListDataBean f50191b;

        l(CloudListDataBean cloudListDataBean) {
            this.f50191b = cloudListDataBean;
        }

        @Override // java.lang.Runnable
        public void run() {
            CloudListFragmentV2_.super.C0(this.f50191b);
        }
    }

    /* loaded from: classes3.dex */
    class m extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f50193b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(String str, long j4, String str2, int i4) {
            super(str, j4, str2);
            this.f50193b = i4;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                CloudListFragmentV2_.super.m0(this.f50193b);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes3.dex */
    class n extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CloudListDataBean f50195b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(String str, long j4, String str2, CloudListDataBean cloudListDataBean) {
            super(str, j4, str2);
            this.f50195b = cloudListDataBean;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                CloudListFragmentV2_.super.k0(this.f50195b);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes3.dex */
    class o extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CloudListDataBean f50197b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(String str, long j4, String str2, CloudListDataBean cloudListDataBean) {
            super(str, j4, str2);
            this.f50197b = cloudListDataBean;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                CloudListFragmentV2_.super.c0(this.f50197b);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes3.dex */
    class p extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CloudListDataBean f50199b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f50200c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(String str, long j4, String str2, CloudListDataBean cloudListDataBean, int i4) {
            super(str, j4, str2);
            this.f50199b = cloudListDataBean;
            this.f50200c = i4;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                CloudListFragmentV2_.super.X(this.f50199b, this.f50200c);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes3.dex */
    class q extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f50202b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        q(String str, long j4, String str2, int i4) {
            super(str, j4, str2);
            this.f50202b = i4;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                CloudListFragmentV2_.super.B0(this.f50202b);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes3.dex */
    class r implements Runnable {
        r() {
        }

        @Override // java.lang.Runnable
        public void run() {
            CloudListFragmentV2_.super.Z();
        }
    }

    /* loaded from: classes3.dex */
    class s implements Runnable {
        s() {
        }

        @Override // java.lang.Runnable
        public void run() {
            CloudListFragmentV2_.super.o0();
        }
    }

    /* loaded from: classes3.dex */
    class t implements Runnable {
        t() {
        }

        @Override // java.lang.Runnable
        public void run() {
            CloudListFragmentV2_.super.showLoding();
        }
    }

    /* loaded from: classes3.dex */
    class u implements Runnable {
        u() {
        }

        @Override // java.lang.Runnable
        public void run() {
            CloudListFragmentV2_.super.showLodingFailed();
        }
    }

    /* loaded from: classes3.dex */
    class v implements Runnable {
        v() {
        }

        @Override // java.lang.Runnable
        public void run() {
            CloudListFragmentV2_.super.W();
        }
    }

    /* loaded from: classes3.dex */
    class w implements Runnable {
        w() {
        }

        @Override // java.lang.Runnable
        public void run() {
            CloudListFragmentV2_.super.r0();
        }
    }

    /* loaded from: classes3.dex */
    class x implements Runnable {
        x() {
        }

        @Override // java.lang.Runnable
        public void run() {
            CloudListFragmentV2_.super.q0();
        }
    }

    /* loaded from: classes3.dex */
    class y implements Runnable {
        y() {
        }

        @Override // java.lang.Runnable
        public void run() {
            CloudListFragmentV2_.super.p0();
        }
    }

    /* loaded from: classes3.dex */
    public static class z extends org.androidannotations.api.builder.d<z, CloudListFragmentV2> {
        @Override // org.androidannotations.api.builder.d
        /* renamed from: a */
        public CloudListFragmentV2 build() {
            CloudListFragmentV2_ cloudListFragmentV2_ = new CloudListFragmentV2_();
            cloudListFragmentV2_.setArguments(this.args);
            return cloudListFragmentV2_;
        }
    }

    public static z f1() {
        return new z();
    }

    private void init_(Bundle bundle) {
        this.f50143i = new PrefDef_(getActivity());
        a4.c.b(this);
        this.H.addAction(o1.a.f72007j0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.CloudListFragmentV2
    public void A0() {
        org.androidannotations.api.b.e("", new a(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.CloudListFragmentV2
    public void B0(int i4) {
        org.androidannotations.api.a.l(new q("", 0L, "", i4));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.CloudListFragmentV2
    public void C0(CloudListDataBean cloudListDataBean) {
        org.androidannotations.api.b.e("", new l(cloudListDataBean), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.CloudListFragmentV2
    public void D0(CloudListDataBean cloudListDataBean) {
        org.androidannotations.api.b.e("", new i(cloudListDataBean), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.CloudListFragmentV2
    public void E0() {
        org.androidannotations.api.b.e("", new c(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.CloudListFragmentV2
    public void F0() {
        org.androidannotations.api.b.e("", new j(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.CloudListFragmentV2
    public void G0() {
        org.androidannotations.api.b.e("", new d(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.CloudListFragmentV2
    public void W() {
        org.androidannotations.api.b.e("", new v(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.CloudListFragmentV2
    public void X(CloudListDataBean cloudListDataBean, int i4) {
        org.androidannotations.api.a.l(new p("", 0L, "", cloudListDataBean, i4));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.CloudListFragmentV2
    public void Z() {
        org.androidannotations.api.b.e("", new r(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.CloudListFragmentV2
    public void c0(CloudListDataBean cloudListDataBean) {
        org.androidannotations.api.a.l(new o("", 0L, "", cloudListDataBean));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.CloudListFragmentV2
    public void e0(List<CloudListDataBean> list) {
        org.androidannotations.api.b.e("", new b(list), 0L);
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.G.get(cls);
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        View view = this.F;
        if (view == null) {
            return null;
        }
        return (T) view.findViewById(i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.CloudListFragmentV2
    public void k0(CloudListDataBean cloudListDataBean) {
        org.androidannotations.api.a.l(new n("", 0L, "", cloudListDataBean));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.CloudListFragmentV2
    public void m0(int i4) {
        org.androidannotations.api.a.l(new m("", 0L, "", i4));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.CloudListFragmentV2
    public void o0() {
        org.androidannotations.api.b.e("", new s(), 0L);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.E);
        init_(bundle);
        super.onCreate(bundle);
        getActivity().registerReceiver(this.I, this.H);
        a4.c.c(c5);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        this.F = onCreateView;
        if (onCreateView == null) {
            this.F = layoutInflater.inflate(R.layout.fragment_cloud_list_v2, viewGroup, false);
        }
        return this.F;
    }

    @Override // com.join.mgps.fragment.CloudListFragmentV2, androidx.fragment.app.Fragment
    public void onDestroy() {
        getActivity().unregisterReceiver(this.I);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.F = null;
        this.f50137c = null;
        this.f50138d = null;
        this.f50139e = null;
        this.f50140f = null;
        this.f50141g = null;
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f50137c = (LinearLayout) aVar.internalFindViewById(R.id.ll_nodata);
        this.f50138d = (XRecyclerView) aVar.internalFindViewById(R.id.rcy_recommed);
        this.f50139e = (TextView) aVar.internalFindViewById(R.id.tv_show_nodata);
        this.f50140f = (LinearLayout) aVar.internalFindViewById(R.id.loding_layout);
        this.f50141g = (LinearLayout) aVar.internalFindViewById(R.id.loding_faile);
        afterView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.E.a(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.CloudListFragmentV2
    public void p0() {
        org.androidannotations.api.b.e("", new y(), 0L);
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.G.put(cls, t4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.CloudListFragmentV2
    public void q0() {
        org.androidannotations.api.b.e("", new x(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.CloudListFragmentV2
    public void r0() {
        org.androidannotations.api.b.e("", new w(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.CloudListFragmentV2
    public void showLoding() {
        org.androidannotations.api.b.e("", new t(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.CloudListFragmentV2
    public void showLodingFailed() {
        org.androidannotations.api.b.e("", new u(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.CloudListFragmentV2
    public void showMessage(String str) {
        org.androidannotations.api.b.e("", new h(str), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.CloudListFragmentV2
    public void x0() {
        org.androidannotations.api.b.e("", new g(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.CloudListFragmentV2
    public void y0() {
        org.androidannotations.api.b.e("", new e(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.CloudListFragmentV2
    public void z0() {
        org.androidannotations.api.b.e("", new f(), 0L);
    }
}
