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
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.XListView2;
import com.join.mgps.dto.CloudListDataBean;
import com.join.mgps.pref.PrefDef_;
import com.join.mgps.ptr.PtrClassicFrameLayout;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.androidannotations.api.a;
/* loaded from: classes3.dex */
public final class CloudListFragment_ extends CloudListFragment implements y3.a, a4.a, a4.b {
    private View J;
    private final a4.c I = new a4.c();
    private final Map<Class<?>, Object> K = new HashMap();
    private final IntentFilter L = new IntentFilter();
    private final BroadcastReceiver M = new k();

    /* loaded from: classes3.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            CloudListFragment_.super.A0();
        }
    }

    /* loaded from: classes3.dex */
    class b implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f50213b;

        b(List list) {
            this.f50213b = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            CloudListFragment_.super.e0(this.f50213b);
        }
    }

    /* loaded from: classes3.dex */
    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            CloudListFragment_.super.E0();
        }
    }

    /* loaded from: classes3.dex */
    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            CloudListFragment_.super.G0();
        }
    }

    /* loaded from: classes3.dex */
    class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            CloudListFragment_.super.y0();
        }
    }

    /* loaded from: classes3.dex */
    class f implements Runnable {
        f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            CloudListFragment_.super.z0();
        }
    }

    /* loaded from: classes3.dex */
    class g implements Runnable {
        g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            CloudListFragment_.super.x0();
        }
    }

    /* loaded from: classes3.dex */
    class h implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f50220b;

        h(String str) {
            this.f50220b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            CloudListFragment_.super.showMessage(this.f50220b);
        }
    }

    /* loaded from: classes3.dex */
    class i implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CloudListDataBean f50222b;

        i(CloudListDataBean cloudListDataBean) {
            this.f50222b = cloudListDataBean;
        }

        @Override // java.lang.Runnable
        public void run() {
            CloudListFragment_.super.D0(this.f50222b);
        }
    }

    /* loaded from: classes3.dex */
    class j implements Runnable {
        j() {
        }

        @Override // java.lang.Runnable
        public void run() {
            CloudListFragment_.super.F0();
        }
    }

    /* loaded from: classes3.dex */
    class k extends BroadcastReceiver {
        k() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            CloudListFragment_.this.s0(intent);
        }
    }

    /* loaded from: classes3.dex */
    class l implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CloudListDataBean f50226b;

        l(CloudListDataBean cloudListDataBean) {
            this.f50226b = cloudListDataBean;
        }

        @Override // java.lang.Runnable
        public void run() {
            CloudListFragment_.super.C0(this.f50226b);
        }
    }

    /* loaded from: classes3.dex */
    class m extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f50228b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(String str, long j4, String str2, int i4) {
            super(str, j4, str2);
            this.f50228b = i4;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                CloudListFragment_.super.m0(this.f50228b);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes3.dex */
    class n extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CloudListDataBean f50230b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(String str, long j4, String str2, CloudListDataBean cloudListDataBean) {
            super(str, j4, str2);
            this.f50230b = cloudListDataBean;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                CloudListFragment_.super.k0(this.f50230b);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes3.dex */
    class o extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CloudListDataBean f50232b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(String str, long j4, String str2, CloudListDataBean cloudListDataBean) {
            super(str, j4, str2);
            this.f50232b = cloudListDataBean;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                CloudListFragment_.super.c0(this.f50232b);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes3.dex */
    class p extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CloudListDataBean f50234b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f50235c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(String str, long j4, String str2, CloudListDataBean cloudListDataBean, int i4) {
            super(str, j4, str2);
            this.f50234b = cloudListDataBean;
            this.f50235c = i4;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                CloudListFragment_.super.X(this.f50234b, this.f50235c);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes3.dex */
    class q extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f50237b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        q(String str, long j4, String str2, int i4) {
            super(str, j4, str2);
            this.f50237b = i4;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                CloudListFragment_.super.B0(this.f50237b);
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
            CloudListFragment_.super.Z();
        }
    }

    /* loaded from: classes3.dex */
    class s implements Runnable {
        s() {
        }

        @Override // java.lang.Runnable
        public void run() {
            CloudListFragment_.super.o0();
        }
    }

    /* loaded from: classes3.dex */
    class t implements Runnable {
        t() {
        }

        @Override // java.lang.Runnable
        public void run() {
            CloudListFragment_.super.showLoding();
        }
    }

    /* loaded from: classes3.dex */
    class u implements Runnable {
        u() {
        }

        @Override // java.lang.Runnable
        public void run() {
            CloudListFragment_.super.showLodingFailed();
        }
    }

    /* loaded from: classes3.dex */
    class v implements Runnable {
        v() {
        }

        @Override // java.lang.Runnable
        public void run() {
            CloudListFragment_.super.W();
        }
    }

    /* loaded from: classes3.dex */
    class w implements Runnable {
        w() {
        }

        @Override // java.lang.Runnable
        public void run() {
            CloudListFragment_.super.r0();
        }
    }

    /* loaded from: classes3.dex */
    class x implements Runnable {
        x() {
        }

        @Override // java.lang.Runnable
        public void run() {
            CloudListFragment_.super.q0();
        }
    }

    /* loaded from: classes3.dex */
    class y implements Runnable {
        y() {
        }

        @Override // java.lang.Runnable
        public void run() {
            CloudListFragment_.super.p0();
        }
    }

    /* loaded from: classes3.dex */
    public static class z extends org.androidannotations.api.builder.d<z, CloudListFragment> {
        @Override // org.androidannotations.api.builder.d
        /* renamed from: a */
        public CloudListFragment build() {
            CloudListFragment_ cloudListFragment_ = new CloudListFragment_();
            cloudListFragment_.setArguments(this.args);
            return cloudListFragment_;
        }
    }

    public static z f1() {
        return new z();
    }

    private void init_(Bundle bundle) {
        this.f50107m = new PrefDef_(getActivity());
        a4.c.b(this);
        this.L.addAction(o1.a.f72007j0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.CloudListFragment
    public void A0() {
        org.androidannotations.api.b.e("", new a(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.CloudListFragment
    public void B0(int i4) {
        org.androidannotations.api.a.l(new q("", 0L, "", i4));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.CloudListFragment
    public void C0(CloudListDataBean cloudListDataBean) {
        org.androidannotations.api.b.e("", new l(cloudListDataBean), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.CloudListFragment
    public void D0(CloudListDataBean cloudListDataBean) {
        org.androidannotations.api.b.e("", new i(cloudListDataBean), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.CloudListFragment
    public void E0() {
        org.androidannotations.api.b.e("", new c(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.CloudListFragment
    public void F0() {
        org.androidannotations.api.b.e("", new j(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.CloudListFragment
    public void G0() {
        org.androidannotations.api.b.e("", new d(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.CloudListFragment
    public void W() {
        org.androidannotations.api.b.e("", new v(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.CloudListFragment
    public void X(CloudListDataBean cloudListDataBean, int i4) {
        org.androidannotations.api.a.l(new p("", 0L, "", cloudListDataBean, i4));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.CloudListFragment
    public void Z() {
        org.androidannotations.api.b.e("", new r(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.CloudListFragment
    public void c0(CloudListDataBean cloudListDataBean) {
        org.androidannotations.api.a.l(new o("", 0L, "", cloudListDataBean));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.CloudListFragment
    public void e0(List<CloudListDataBean> list) {
        org.androidannotations.api.b.e("", new b(list), 0L);
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.K.get(cls);
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        View view = this.J;
        if (view == null) {
            return null;
        }
        return (T) view.findViewById(i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.CloudListFragment
    public void k0(CloudListDataBean cloudListDataBean) {
        org.androidannotations.api.a.l(new n("", 0L, "", cloudListDataBean));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.CloudListFragment
    public void m0(int i4) {
        org.androidannotations.api.a.l(new m("", 0L, "", i4));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.CloudListFragment
    public void o0() {
        org.androidannotations.api.b.e("", new s(), 0L);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.I);
        init_(bundle);
        super.onCreate(bundle);
        getActivity().registerReceiver(this.M, this.L);
        a4.c.c(c5);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        this.J = onCreateView;
        if (onCreateView == null) {
            this.J = layoutInflater.inflate(R.layout.fragment_cloud_list, viewGroup, false);
        }
        return this.J;
    }

    @Override // com.join.mgps.fragment.CloudListFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        getActivity().unregisterReceiver(this.M);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.J = null;
        this.f50097c = null;
        this.f50098d = null;
        this.f50099e = null;
        this.f50100f = null;
        this.f50101g = null;
        this.f50102h = null;
        this.f50103i = null;
        this.f50104j = null;
        this.f50105k = null;
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f50097c = (LinearLayout) aVar.internalFindViewById(R.id.ll_nodata);
        this.f50098d = (XListView2) aVar.internalFindViewById(R.id.rcy_recommed);
        this.f50099e = (PtrClassicFrameLayout) aVar.internalFindViewById(R.id.myswip);
        this.f50100f = (TextView) aVar.internalFindViewById(R.id.tv_show_nodata);
        this.f50101g = (LinearLayout) aVar.internalFindViewById(R.id.loding_layout);
        this.f50102h = (LinearLayout) aVar.internalFindViewById(R.id.loding_faile);
        this.f50103i = (RelativeLayout) aVar.internalFindViewById(R.id.rl_showtitle_bc);
        this.f50104j = (TextView) aVar.internalFindViewById(R.id.tv_showtitle_bc);
        this.f50105k = (LinearLayout) aVar.internalFindViewById(R.id.ll_lookdetail);
        afterView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.I.a(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.CloudListFragment
    public void p0() {
        org.androidannotations.api.b.e("", new y(), 0L);
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.K.put(cls, t4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.CloudListFragment
    public void q0() {
        org.androidannotations.api.b.e("", new x(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.CloudListFragment
    public void r0() {
        org.androidannotations.api.b.e("", new w(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.CloudListFragment
    public void showLoding() {
        org.androidannotations.api.b.e("", new t(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.CloudListFragment
    public void showLodingFailed() {
        org.androidannotations.api.b.e("", new u(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.CloudListFragment
    public void showMessage(String str) {
        org.androidannotations.api.b.e("", new h(str), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.CloudListFragment
    public void x0() {
        org.androidannotations.api.b.e("", new g(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.CloudListFragment
    public void y0() {
        org.androidannotations.api.b.e("", new e(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.CloudListFragment
    public void z0() {
        org.androidannotations.api.b.e("", new f(), 0L);
    }
}
