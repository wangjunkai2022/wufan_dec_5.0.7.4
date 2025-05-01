package com.join.mgps.fragment;

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
public final class RecommedFragment_ extends RecommedFragment implements y3.a, a4.a, a4.b {
    private View G;
    private final a4.c F = new a4.c();
    private final Map<Class<?>, Object> H = new HashMap();

    /* loaded from: classes3.dex */
    class a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f52779b;

        a(List list) {
            this.f52779b = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            RecommedFragment_.super.e0(this.f52779b);
        }
    }

    /* loaded from: classes3.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            RecommedFragment_.super.B0();
        }
    }

    /* loaded from: classes3.dex */
    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            RecommedFragment_.super.D0();
        }
    }

    /* loaded from: classes3.dex */
    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            RecommedFragment_.super.v0();
        }
    }

    /* loaded from: classes3.dex */
    class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            RecommedFragment_.super.w0();
        }
    }

    /* loaded from: classes3.dex */
    class f implements Runnable {
        f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            RecommedFragment_.super.u0();
        }
    }

    /* loaded from: classes3.dex */
    class g implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f52786b;

        g(String str) {
            this.f52786b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            RecommedFragment_.super.showMessage(this.f52786b);
        }
    }

    /* loaded from: classes3.dex */
    class h implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CloudListDataBean f52788b;

        h(CloudListDataBean cloudListDataBean) {
            this.f52788b = cloudListDataBean;
        }

        @Override // java.lang.Runnable
        public void run() {
            RecommedFragment_.super.A0(this.f52788b);
        }
    }

    /* loaded from: classes3.dex */
    class i implements Runnable {
        i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            RecommedFragment_.super.C0();
        }
    }

    /* loaded from: classes3.dex */
    class j implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CloudListDataBean f52791b;

        j(CloudListDataBean cloudListDataBean) {
            this.f52791b = cloudListDataBean;
        }

        @Override // java.lang.Runnable
        public void run() {
            RecommedFragment_.super.z0(this.f52791b);
        }
    }

    /* loaded from: classes3.dex */
    class k implements Runnable {
        k() {
        }

        @Override // java.lang.Runnable
        public void run() {
            RecommedFragment_.super.Z();
        }
    }

    /* loaded from: classes3.dex */
    class l extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f52794b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(String str, long j4, String str2, int i4) {
            super(str, j4, str2);
            this.f52794b = i4;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                RecommedFragment_.super.l0(this.f52794b);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes3.dex */
    class m extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CloudListDataBean f52796b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(String str, long j4, String str2, CloudListDataBean cloudListDataBean) {
            super(str, j4, str2);
            this.f52796b = cloudListDataBean;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                RecommedFragment_.super.j0(this.f52796b);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes3.dex */
    class n extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CloudListDataBean f52798b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(String str, long j4, String str2, CloudListDataBean cloudListDataBean) {
            super(str, j4, str2);
            this.f52798b = cloudListDataBean;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                RecommedFragment_.super.c0(this.f52798b);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes3.dex */
    class o extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CloudListDataBean f52800b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f52801c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(String str, long j4, String str2, CloudListDataBean cloudListDataBean, int i4) {
            super(str, j4, str2);
            this.f52800b = cloudListDataBean;
            this.f52801c = i4;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                RecommedFragment_.super.X(this.f52800b, this.f52801c);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes3.dex */
    class p extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f52803b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(String str, long j4, String str2, int i4) {
            super(str, j4, str2);
            this.f52803b = i4;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                RecommedFragment_.super.y0(this.f52803b);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes3.dex */
    class q implements Runnable {
        q() {
        }

        @Override // java.lang.Runnable
        public void run() {
            RecommedFragment_.super.n0();
        }
    }

    /* loaded from: classes3.dex */
    class r implements Runnable {
        r() {
        }

        @Override // java.lang.Runnable
        public void run() {
            RecommedFragment_.super.showLoding();
        }
    }

    /* loaded from: classes3.dex */
    class s implements Runnable {
        s() {
        }

        @Override // java.lang.Runnable
        public void run() {
            RecommedFragment_.super.showLodingFailed();
        }
    }

    /* loaded from: classes3.dex */
    class t implements Runnable {
        t() {
        }

        @Override // java.lang.Runnable
        public void run() {
            RecommedFragment_.super.W();
        }
    }

    /* loaded from: classes3.dex */
    class u implements Runnable {
        u() {
        }

        @Override // java.lang.Runnable
        public void run() {
            RecommedFragment_.super.q0();
        }
    }

    /* loaded from: classes3.dex */
    class v implements Runnable {
        v() {
        }

        @Override // java.lang.Runnable
        public void run() {
            RecommedFragment_.super.p0();
        }
    }

    /* loaded from: classes3.dex */
    class w implements Runnable {
        w() {
        }

        @Override // java.lang.Runnable
        public void run() {
            RecommedFragment_.super.o0();
        }
    }

    /* loaded from: classes3.dex */
    class x implements Runnable {
        x() {
        }

        @Override // java.lang.Runnable
        public void run() {
            RecommedFragment_.super.x0();
        }
    }

    /* loaded from: classes3.dex */
    public static class y extends org.androidannotations.api.builder.d<y, RecommedFragment> {
        @Override // org.androidannotations.api.builder.d
        /* renamed from: a */
        public RecommedFragment build() {
            RecommedFragment_ recommedFragment_ = new RecommedFragment_();
            recommedFragment_.setArguments(this.args);
            return recommedFragment_;
        }
    }

    public static y c1() {
        return new y();
    }

    private void init_(Bundle bundle) {
        this.f52749m = new PrefDef_(getActivity());
        a4.c.b(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.RecommedFragment
    public void A0(CloudListDataBean cloudListDataBean) {
        org.androidannotations.api.b.e("", new h(cloudListDataBean), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.RecommedFragment
    public void B0() {
        org.androidannotations.api.b.e("", new b(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.RecommedFragment
    public void C0() {
        org.androidannotations.api.b.e("", new i(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.RecommedFragment
    public void D0() {
        org.androidannotations.api.b.e("", new c(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.RecommedFragment
    public void W() {
        org.androidannotations.api.b.e("", new t(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.RecommedFragment
    public void X(CloudListDataBean cloudListDataBean, int i4) {
        org.androidannotations.api.a.l(new o("", 0L, "", cloudListDataBean, i4));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.RecommedFragment
    public void Z() {
        org.androidannotations.api.b.e("", new k(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.RecommedFragment
    public void c0(CloudListDataBean cloudListDataBean) {
        org.androidannotations.api.a.l(new n("", 0L, "", cloudListDataBean));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.RecommedFragment
    public void e0(List<CloudListDataBean> list) {
        org.androidannotations.api.b.e("", new a(list), 0L);
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.H.get(cls);
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        View view = this.G;
        if (view == null) {
            return null;
        }
        return (T) view.findViewById(i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.RecommedFragment
    public void j0(CloudListDataBean cloudListDataBean) {
        org.androidannotations.api.a.l(new m("", 0L, "", cloudListDataBean));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.RecommedFragment
    public void l0(int i4) {
        org.androidannotations.api.a.l(new l("", 0L, "", i4));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.RecommedFragment
    public void n0() {
        org.androidannotations.api.b.e("", new q(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.RecommedFragment
    public void o0() {
        org.androidannotations.api.b.e("", new w(), 0L);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.F);
        init_(bundle);
        super.onCreate(bundle);
        a4.c.c(c5);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        this.G = onCreateView;
        if (onCreateView == null) {
            this.G = layoutInflater.inflate(R.layout.item_recommed_fragment, viewGroup, false);
        }
        return this.G;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.G = null;
        this.f52739c = null;
        this.f52740d = null;
        this.f52741e = null;
        this.f52742f = null;
        this.f52743g = null;
        this.f52744h = null;
        this.f52745i = null;
        this.f52746j = null;
        this.f52747k = null;
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f52739c = (LinearLayout) aVar.internalFindViewById(R.id.ll_nodata);
        this.f52740d = (XListView2) aVar.internalFindViewById(R.id.rcy_recommed);
        this.f52741e = (PtrClassicFrameLayout) aVar.internalFindViewById(R.id.myswip);
        this.f52742f = (TextView) aVar.internalFindViewById(R.id.tv_show_nodata);
        this.f52743g = (LinearLayout) aVar.internalFindViewById(R.id.loding_layout);
        this.f52744h = (LinearLayout) aVar.internalFindViewById(R.id.loding_faile);
        this.f52745i = (RelativeLayout) aVar.internalFindViewById(R.id.rl_showtitle_bc);
        this.f52746j = (TextView) aVar.internalFindViewById(R.id.tv_showtitle_bc);
        this.f52747k = (LinearLayout) aVar.internalFindViewById(R.id.ll_lookdetail);
        afterView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.F.a(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.RecommedFragment
    public void p0() {
        org.androidannotations.api.b.e("", new v(), 0L);
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.H.put(cls, t4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.RecommedFragment
    public void q0() {
        org.androidannotations.api.b.e("", new u(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.RecommedFragment
    public void showLoding() {
        org.androidannotations.api.b.e("", new r(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.RecommedFragment
    public void showLodingFailed() {
        org.androidannotations.api.b.e("", new s(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.RecommedFragment
    public void showMessage(String str) {
        org.androidannotations.api.b.e("", new g(str), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.RecommedFragment
    public void u0() {
        org.androidannotations.api.b.e("", new f(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.RecommedFragment
    public void v0() {
        org.androidannotations.api.b.e("", new d(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.RecommedFragment
    public void w0() {
        org.androidannotations.api.b.e("", new e(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.RecommedFragment
    public void x0() {
        org.androidannotations.api.b.e("", new x(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.RecommedFragment
    public void y0(int i4) {
        org.androidannotations.api.a.l(new p("", 0L, "", i4));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.RecommedFragment
    public void z0(CloudListDataBean cloudListDataBean) {
        org.androidannotations.api.b.e("", new j(cloudListDataBean), 0L);
    }
}
