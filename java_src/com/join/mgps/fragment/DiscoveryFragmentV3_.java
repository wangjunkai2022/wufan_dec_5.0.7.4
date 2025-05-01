package com.join.mgps.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.customview.CustomerDownloadView;
import com.join.mgps.customview.XListView2;
import com.join.mgps.dto.CommonGameInfoBean;
import com.join.mgps.dto.DiscoveryMainDataBean;
import com.join.mgps.dto.EndGameNameBean;
import com.join.mgps.dto.ForumBean;
import com.join.mgps.ptr.PtrClassicFrameLayout;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.androidannotations.api.a;
/* loaded from: classes3.dex */
public final class DiscoveryFragmentV3_ extends DiscoveryFragmentV3 implements y3.a, a4.a, a4.b {
    private View W;
    private final a4.c V = new a4.c();
    private final Map<Class<?>, Object> X = new HashMap();

    /* loaded from: classes3.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            DiscoveryFragmentV3_.super.v0();
        }
    }

    /* loaded from: classes3.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            DiscoveryFragmentV3_.super.y0();
        }
    }

    /* loaded from: classes3.dex */
    class c implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ EndGameNameBean f50836b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f50837c;

        c(EndGameNameBean endGameNameBean, int i4) {
            this.f50836b = endGameNameBean;
            this.f50837c = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            DiscoveryFragmentV3_.super.K0(this.f50836b, this.f50837c);
        }
    }

    /* loaded from: classes3.dex */
    class d implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f50839b;

        d(List list) {
            this.f50839b = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            DiscoveryFragmentV3_.super.J0(this.f50839b);
        }
    }

    /* loaded from: classes3.dex */
    class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            DiscoveryFragmentV3_.super.o0();
        }
    }

    /* loaded from: classes3.dex */
    class f implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DiscoveryMainDataBean f50842b;

        f(DiscoveryMainDataBean discoveryMainDataBean) {
            this.f50842b = discoveryMainDataBean;
        }

        @Override // java.lang.Runnable
        public void run() {
            DiscoveryFragmentV3_.super.I0(this.f50842b);
        }
    }

    /* loaded from: classes3.dex */
    class g implements Runnable {
        g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            DiscoveryFragmentV3_.super.F0();
        }
    }

    /* loaded from: classes3.dex */
    class h implements Runnable {
        h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            DiscoveryFragmentV3_.super.G0();
        }
    }

    /* loaded from: classes3.dex */
    class i implements Runnable {
        i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            DiscoveryFragmentV3_.super.updateDownloadView();
        }
    }

    /* loaded from: classes3.dex */
    class j extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f50847b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(String str, long j4, String str2, int i4) {
            super(str, j4, str2);
            this.f50847b = i4;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                DiscoveryFragmentV3_.super.z0(this.f50847b);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes3.dex */
    class k implements View.OnClickListener {
        k() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DiscoveryFragmentV3_.this.Z();
        }
    }

    /* loaded from: classes3.dex */
    class l extends a.c {
        l(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                DiscoveryFragmentV3_.super.t0();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes3.dex */
    class m extends a.c {
        m(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                DiscoveryFragmentV3_.super.loadData();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes3.dex */
    class n extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f50852b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(String str, long j4, String str2, int i4) {
            super(str, j4, str2);
            this.f50852b = i4;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                DiscoveryFragmentV3_.super.u0(this.f50852b);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes3.dex */
    class o extends a.c {
        o(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                DiscoveryFragmentV3_.super.s0();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes3.dex */
    class p extends a.c {
        p(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                DiscoveryFragmentV3_.super.getDownloadTaskInfo();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes3.dex */
    class q implements View.OnClickListener {
        q() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DiscoveryFragmentV3_.this.w0();
        }
    }

    /* loaded from: classes3.dex */
    class r implements View.OnClickListener {
        r() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DiscoveryFragmentV3_.this.setNetwork();
        }
    }

    /* loaded from: classes3.dex */
    class s implements View.OnClickListener {
        s() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DiscoveryFragmentV3_.this.loding_faile();
        }
    }

    /* loaded from: classes3.dex */
    class t implements View.OnClickListener {
        t() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DiscoveryFragmentV3_.this.downloadView1();
        }
    }

    /* loaded from: classes3.dex */
    class u implements Runnable {
        u() {
        }

        @Override // java.lang.Runnable
        public void run() {
            DiscoveryFragmentV3_.super.E0();
        }
    }

    /* loaded from: classes3.dex */
    class v implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f50861b;

        v(String str) {
            this.f50861b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            DiscoveryFragmentV3_.super.showMessage(this.f50861b);
        }
    }

    /* loaded from: classes3.dex */
    class w implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f50863b;

        w(List list) {
            this.f50863b = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            DiscoveryFragmentV3_.super.H0(this.f50863b);
        }
    }

    /* loaded from: classes3.dex */
    class x implements Runnable {
        x() {
        }

        @Override // java.lang.Runnable
        public void run() {
            DiscoveryFragmentV3_.super.x0();
        }
    }

    /* loaded from: classes3.dex */
    public static class y extends org.androidannotations.api.builder.d<y, DiscoveryFragmentV3> {
        @Override // org.androidannotations.api.builder.d
        /* renamed from: a */
        public DiscoveryFragmentV3 build() {
            DiscoveryFragmentV3_ discoveryFragmentV3_ = new DiscoveryFragmentV3_();
            discoveryFragmentV3_.setArguments(this.args);
            return discoveryFragmentV3_;
        }
    }

    public static y f1() {
        return new y();
    }

    private void init_(Bundle bundle) {
        a4.c.b(this);
        this.f50803l = AccountUtil_.getInstance_(getActivity());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.DiscoveryFragmentV3
    public void E0() {
        org.androidannotations.api.b.e("", new u(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.DiscoveryFragmentV3
    public void F0() {
        org.androidannotations.api.b.e("", new g(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.DiscoveryFragmentV3
    public void G0() {
        org.androidannotations.api.b.e("", new h(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.DiscoveryFragmentV3
    public void H0(List<ForumBean.ForumPostsBean> list) {
        org.androidannotations.api.b.e("", new w(list), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.DiscoveryFragmentV3
    public void I0(DiscoveryMainDataBean discoveryMainDataBean) {
        org.androidannotations.api.b.e("", new f(discoveryMainDataBean), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.DiscoveryFragmentV3
    public void J0(List<CommonGameInfoBean> list) {
        org.androidannotations.api.b.e("", new d(list), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.DiscoveryFragmentV3
    public void K0(EndGameNameBean endGameNameBean, int i4) {
        org.androidannotations.api.b.e("", new c(endGameNameBean, i4), 0L);
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.X.get(cls);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.DiscoveryFragmentV3
    public void getDownloadTaskInfo() {
        org.androidannotations.api.a.l(new p("", 0L, ""));
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        View view = this.W;
        if (view == null) {
            return null;
        }
        return (T) view.findViewById(i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.DiscoveryFragmentV3
    public void loadData() {
        org.androidannotations.api.a.l(new m("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.DiscoveryFragmentV3
    public void o0() {
        org.androidannotations.api.b.e("", new e(), 0L);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.V);
        init_(bundle);
        super.onCreate(bundle);
        a4.c.c(c5);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        this.W = onCreateView;
        if (onCreateView == null) {
            this.W = layoutInflater.inflate(R.layout.fragment_discovery, viewGroup, false);
        }
        return this.W;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.W = null;
        this.f50793b = null;
        this.f50794c = null;
        this.f50795d = null;
        this.f50796e = null;
        this.f50797f = null;
        this.f50798g = null;
        this.f50799h = null;
        this.f50800i = null;
        this.f50801j = null;
        this.f50802k = null;
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f50793b = (RelativeLayout) aVar.internalFindViewById(R.id.RootRl);
        this.f50794c = (RelativeLayout) aVar.internalFindViewById(R.id.discoveryTitleRl);
        this.f50795d = (PtrClassicFrameLayout) aVar.internalFindViewById(R.id.mPtrFrame);
        this.f50796e = (LinearLayout) aVar.internalFindViewById(R.id.loding_layout);
        this.f50797f = (LinearLayout) aVar.internalFindViewById(R.id.loding_faile);
        this.f50798g = (XListView2) aVar.internalFindViewById(R.id.listView);
        this.f50799h = (ImageView) aVar.internalFindViewById(R.id.discoveryTitleSearchIv);
        this.f50800i = (TextView) aVar.internalFindViewById(R.id.discoveryTitleTx);
        this.f50801j = aVar.internalFindViewById(R.id.statubar);
        this.f50802k = (CustomerDownloadView) aVar.internalFindViewById(R.id.downloadView1);
        View internalFindViewById = aVar.internalFindViewById(R.id.setNetwork);
        RelativeLayout relativeLayout = this.f50793b;
        if (relativeLayout != null) {
            relativeLayout.setOnClickListener(new k());
        }
        LinearLayout linearLayout = this.f50796e;
        if (linearLayout != null) {
            linearLayout.setOnClickListener(new q());
        }
        if (internalFindViewById != null) {
            internalFindViewById.setOnClickListener(new r());
        }
        LinearLayout linearLayout2 = this.f50797f;
        if (linearLayout2 != null) {
            linearLayout2.setOnClickListener(new s());
        }
        CustomerDownloadView customerDownloadView = this.f50802k;
        if (customerDownloadView != null) {
            customerDownloadView.setOnClickListener(new t());
        }
        afterViews();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.V.a(this);
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.X.put(cls, t4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.DiscoveryFragmentV3
    public void s0() {
        org.androidannotations.api.a.l(new o("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.DiscoveryFragmentV3
    public void showMessage(String str) {
        org.androidannotations.api.b.e("", new v(str), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.DiscoveryFragmentV3
    public void t0() {
        org.androidannotations.api.a.l(new l("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.DiscoveryFragmentV3
    public void u0(int i4) {
        org.androidannotations.api.a.l(new n("", 0L, "", i4));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.DiscoveryFragmentV3
    public void updateDownloadView() {
        org.androidannotations.api.b.e("", new i(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.DiscoveryFragmentV3
    public void v0() {
        org.androidannotations.api.b.e("", new a(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.DiscoveryFragmentV3
    public void x0() {
        org.androidannotations.api.b.e("", new x(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.DiscoveryFragmentV3
    public void y0() {
        org.androidannotations.api.b.e("", new b(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.DiscoveryFragmentV3
    public void z0(int i4) {
        org.androidannotations.api.a.l(new j("", 0L, "", i4));
    }
}
