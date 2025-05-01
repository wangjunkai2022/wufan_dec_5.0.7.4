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
import com.join.mgps.dto.DiscoveryHeaderMenuBean;
import com.join.mgps.dto.DiscoveryMainDataBean;
import com.join.mgps.dto.ForumBean;
import com.join.mgps.ptr.PtrClassicFrameLayout;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.androidannotations.api.a;
/* loaded from: classes3.dex */
public final class DiscoveryFragmentV4_ extends DiscoveryFragmentV4 implements y3.a, a4.a, a4.b {
    private View J;
    private final a4.c I = new a4.c();
    private final Map<Class<?>, Object> K = new HashMap();

    /* loaded from: classes3.dex */
    class a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DiscoveryMainDataBean f50903b;

        a(DiscoveryMainDataBean discoveryMainDataBean) {
            this.f50903b = discoveryMainDataBean;
        }

        @Override // java.lang.Runnable
        public void run() {
            DiscoveryFragmentV4_.super.w0(this.f50903b);
        }
    }

    /* loaded from: classes3.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            DiscoveryFragmentV4_.super.showMain();
        }
    }

    /* loaded from: classes3.dex */
    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            DiscoveryFragmentV4_.super.t0();
        }
    }

    /* loaded from: classes3.dex */
    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            DiscoveryFragmentV4_.super.u0();
        }
    }

    /* loaded from: classes3.dex */
    class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            DiscoveryFragmentV4_.super.updateDownloadView();
        }
    }

    /* loaded from: classes3.dex */
    class f extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f50909b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(String str, long j4, String str2, int i4) {
            super(str, j4, str2);
            this.f50909b = i4;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                DiscoveryFragmentV4_.super.m0(this.f50909b);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes3.dex */
    class g extends a.c {
        g(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                DiscoveryFragmentV4_.super.k0();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
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
                DiscoveryFragmentV4_.super.j0();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes3.dex */
    class i extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DiscoveryHeaderMenuBean f50913b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(String str, long j4, String str2, DiscoveryHeaderMenuBean discoveryHeaderMenuBean) {
            super(str, j4, str2);
            this.f50913b = discoveryHeaderMenuBean;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                DiscoveryFragmentV4_.super.p0(this.f50913b);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes3.dex */
    class j extends a.c {
        j(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                DiscoveryFragmentV4_.super.loadData();
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
            DiscoveryFragmentV4_.this.W();
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
                DiscoveryFragmentV4_.super.getDownloadTaskInfo();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes3.dex */
    class m implements View.OnClickListener {
        m() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DiscoveryFragmentV4_.this.l0();
        }
    }

    /* loaded from: classes3.dex */
    class n implements View.OnClickListener {
        n() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DiscoveryFragmentV4_.this.setNetwork();
        }
    }

    /* loaded from: classes3.dex */
    class o implements View.OnClickListener {
        o() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DiscoveryFragmentV4_.this.loding_faile();
        }
    }

    /* loaded from: classes3.dex */
    class p implements View.OnClickListener {
        p() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DiscoveryFragmentV4_.this.downloadView1();
        }
    }

    /* loaded from: classes3.dex */
    class q implements Runnable {
        q() {
        }

        @Override // java.lang.Runnable
        public void run() {
            DiscoveryFragmentV4_.super.s0();
        }
    }

    /* loaded from: classes3.dex */
    class r implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f50923b;

        r(String str) {
            this.f50923b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            DiscoveryFragmentV4_.super.showMessage(this.f50923b);
        }
    }

    /* loaded from: classes3.dex */
    class s implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f50925b;

        s(List list) {
            this.f50925b = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            DiscoveryFragmentV4_.super.x0(this.f50925b);
        }
    }

    /* loaded from: classes3.dex */
    class t implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f50927b;

        t(List list) {
            this.f50927b = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            DiscoveryFragmentV4_.super.v0(this.f50927b);
        }
    }

    /* loaded from: classes3.dex */
    public static class u extends org.androidannotations.api.builder.d<u, DiscoveryFragmentV4> {
        @Override // org.androidannotations.api.builder.d
        /* renamed from: a */
        public DiscoveryFragmentV4 build() {
            DiscoveryFragmentV4_ discoveryFragmentV4_ = new DiscoveryFragmentV4_();
            discoveryFragmentV4_.setArguments(this.args);
            return discoveryFragmentV4_;
        }
    }

    public static u O0() {
        return new u();
    }

    private void init_(Bundle bundle) {
        a4.c.b(this);
        this.f50876l = AccountUtil_.getInstance_(getActivity());
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.K.get(cls);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.DiscoveryFragmentV4
    public void getDownloadTaskInfo() {
        org.androidannotations.api.a.l(new l("", 0L, ""));
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
    @Override // com.join.mgps.fragment.DiscoveryFragmentV4
    public void j0() {
        org.androidannotations.api.a.l(new h("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.DiscoveryFragmentV4
    public void k0() {
        org.androidannotations.api.a.l(new g("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.DiscoveryFragmentV4
    public void loadData() {
        org.androidannotations.api.a.l(new j("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.DiscoveryFragmentV4
    public void m0(int i4) {
        org.androidannotations.api.a.l(new f("", 0L, "", i4));
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.I);
        init_(bundle);
        super.onCreate(bundle);
        a4.c.c(c5);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        this.J = onCreateView;
        if (onCreateView == null) {
            this.J = layoutInflater.inflate(R.layout.fragment_discovery, viewGroup, false);
        }
        return this.J;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.J = null;
        this.f50866b = null;
        this.f50867c = null;
        this.f50868d = null;
        this.f50869e = null;
        this.f50870f = null;
        this.f50871g = null;
        this.f50872h = null;
        this.f50873i = null;
        this.f50874j = null;
        this.f50875k = null;
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f50866b = (RelativeLayout) aVar.internalFindViewById(R.id.RootRl);
        this.f50867c = (RelativeLayout) aVar.internalFindViewById(R.id.discoveryTitleRl);
        this.f50868d = (PtrClassicFrameLayout) aVar.internalFindViewById(R.id.mPtrFrame);
        this.f50869e = (LinearLayout) aVar.internalFindViewById(R.id.loding_layout);
        this.f50870f = (LinearLayout) aVar.internalFindViewById(R.id.loding_faile);
        this.f50871g = (XListView2) aVar.internalFindViewById(R.id.listView);
        this.f50872h = (ImageView) aVar.internalFindViewById(R.id.discoveryTitleSearchIv);
        this.f50873i = (TextView) aVar.internalFindViewById(R.id.discoveryTitleTx);
        this.f50874j = aVar.internalFindViewById(R.id.statubar);
        this.f50875k = (CustomerDownloadView) aVar.internalFindViewById(R.id.downloadView1);
        View internalFindViewById = aVar.internalFindViewById(R.id.setNetwork);
        RelativeLayout relativeLayout = this.f50866b;
        if (relativeLayout != null) {
            relativeLayout.setOnClickListener(new k());
        }
        LinearLayout linearLayout = this.f50869e;
        if (linearLayout != null) {
            linearLayout.setOnClickListener(new m());
        }
        if (internalFindViewById != null) {
            internalFindViewById.setOnClickListener(new n());
        }
        LinearLayout linearLayout2 = this.f50870f;
        if (linearLayout2 != null) {
            linearLayout2.setOnClickListener(new o());
        }
        CustomerDownloadView customerDownloadView = this.f50875k;
        if (customerDownloadView != null) {
            customerDownloadView.setOnClickListener(new p());
        }
        afterViews();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.I.a(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.DiscoveryFragmentV4
    public void p0(DiscoveryHeaderMenuBean discoveryHeaderMenuBean) {
        org.androidannotations.api.a.l(new i("", 0L, "", discoveryHeaderMenuBean));
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.K.put(cls, t4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.DiscoveryFragmentV4
    public void s0() {
        org.androidannotations.api.b.e("", new q(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.DiscoveryFragmentV4
    public void showMain() {
        org.androidannotations.api.b.e("", new b(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.DiscoveryFragmentV4
    public void showMessage(String str) {
        org.androidannotations.api.b.e("", new r(str), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.DiscoveryFragmentV4
    public void t0() {
        org.androidannotations.api.b.e("", new c(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.DiscoveryFragmentV4
    public void u0() {
        org.androidannotations.api.b.e("", new d(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.DiscoveryFragmentV4
    public void updateDownloadView() {
        org.androidannotations.api.b.e("", new e(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.DiscoveryFragmentV4
    public void v0(List<ForumBean.ForumPostsBean> list) {
        org.androidannotations.api.b.e("", new t(list), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.DiscoveryFragmentV4
    public void w0(DiscoveryMainDataBean discoveryMainDataBean) {
        org.androidannotations.api.b.e("", new a(discoveryMainDataBean), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.DiscoveryFragmentV4
    public void x0(List<DiscoveryHeaderMenuBean> list) {
        org.androidannotations.api.b.e("", new s(list), 0L);
    }
}
