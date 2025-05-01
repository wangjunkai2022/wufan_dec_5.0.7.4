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
import com.join.mgps.customview.XListView2;
import com.join.mgps.dto.DiscoveryMainDataBean;
import com.join.mgps.dto.ForumBean;
import com.join.mgps.ptr.PtrClassicFrameLayout;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.androidannotations.api.a;
/* loaded from: classes3.dex */
public final class DiscoveryFragment_ extends DiscoveryFragment implements y3.a, a4.a, a4.b {
    private View M;
    private final a4.c L = new a4.c();
    private final Map<Class<?>, Object> N = new HashMap();

    /* loaded from: classes3.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            DiscoveryFragment_.super.p0();
        }
    }

    /* loaded from: classes3.dex */
    class b extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f50930b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, long j4, String str2, int i4) {
            super(str, j4, str2);
            this.f50930b = i4;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                DiscoveryFragment_.super.j0(this.f50930b);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes3.dex */
    class c extends a.c {
        c(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                DiscoveryFragment_.super.h0();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes3.dex */
    class d extends a.c {
        d(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                DiscoveryFragment_.super.loadData();
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
            DiscoveryFragment_.this.V();
        }
    }

    /* loaded from: classes3.dex */
    class f implements View.OnClickListener {
        f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DiscoveryFragment_.this.i0();
        }
    }

    /* loaded from: classes3.dex */
    class g implements View.OnClickListener {
        g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DiscoveryFragment_.this.setNetwork();
        }
    }

    /* loaded from: classes3.dex */
    class h implements View.OnClickListener {
        h() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DiscoveryFragment_.this.loding_faile();
        }
    }

    /* loaded from: classes3.dex */
    class i implements Runnable {
        i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            DiscoveryFragment_.super.n0();
        }
    }

    /* loaded from: classes3.dex */
    class j implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f50939b;

        j(String str) {
            this.f50939b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            DiscoveryFragment_.super.showMessage(this.f50939b);
        }
    }

    /* loaded from: classes3.dex */
    class k implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f50941b;

        k(List list) {
            this.f50941b = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            DiscoveryFragment_.super.q0(this.f50941b);
        }
    }

    /* loaded from: classes3.dex */
    class l implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DiscoveryMainDataBean f50943b;

        l(DiscoveryMainDataBean discoveryMainDataBean) {
            this.f50943b = discoveryMainDataBean;
        }

        @Override // java.lang.Runnable
        public void run() {
            DiscoveryFragment_.super.r0(this.f50943b);
        }
    }

    /* loaded from: classes3.dex */
    class m implements Runnable {
        m() {
        }

        @Override // java.lang.Runnable
        public void run() {
            DiscoveryFragment_.super.o0();
        }
    }

    /* loaded from: classes3.dex */
    public static class n extends org.androidannotations.api.builder.d<n, DiscoveryFragment> {
        @Override // org.androidannotations.api.builder.d
        /* renamed from: a */
        public DiscoveryFragment build() {
            DiscoveryFragment_ discoveryFragment_ = new DiscoveryFragment_();
            discoveryFragment_.setArguments(this.args);
            return discoveryFragment_;
        }
    }

    public static n C0() {
        return new n();
    }

    private void init_(Bundle bundle) {
        a4.c.b(this);
        this.f50727k = AccountUtil_.getInstance_(getActivity());
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.N.get(cls);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.DiscoveryFragment
    public void h0() {
        org.androidannotations.api.a.l(new c("", 0L, ""));
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        View view = this.M;
        if (view == null) {
            return null;
        }
        return (T) view.findViewById(i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.DiscoveryFragment
    public void j0(int i4) {
        org.androidannotations.api.a.l(new b("", 0L, "", i4));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.DiscoveryFragment
    public void loadData() {
        org.androidannotations.api.a.l(new d("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.DiscoveryFragment
    public void n0() {
        org.androidannotations.api.b.e("", new i(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.DiscoveryFragment
    public void o0() {
        org.androidannotations.api.b.e("", new m(), 0L);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.L);
        init_(bundle);
        super.onCreate(bundle);
        a4.c.c(c5);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        this.M = onCreateView;
        if (onCreateView == null) {
            this.M = layoutInflater.inflate(R.layout.fragment_discovery, viewGroup, false);
        }
        return this.M;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.M = null;
        this.f50718b = null;
        this.f50719c = null;
        this.f50720d = null;
        this.f50721e = null;
        this.f50722f = null;
        this.f50723g = null;
        this.f50724h = null;
        this.f50725i = null;
        this.f50726j = null;
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f50718b = (RelativeLayout) aVar.internalFindViewById(R.id.RootRl);
        this.f50719c = (RelativeLayout) aVar.internalFindViewById(R.id.discoveryTitleRl);
        this.f50720d = (PtrClassicFrameLayout) aVar.internalFindViewById(R.id.mPtrFrame);
        this.f50721e = (LinearLayout) aVar.internalFindViewById(R.id.loding_layout);
        this.f50722f = (LinearLayout) aVar.internalFindViewById(R.id.loding_faile);
        this.f50723g = (XListView2) aVar.internalFindViewById(R.id.listView);
        this.f50724h = (ImageView) aVar.internalFindViewById(R.id.discoveryTitleSearchIv);
        this.f50725i = (TextView) aVar.internalFindViewById(R.id.discoveryTitleTx);
        this.f50726j = aVar.internalFindViewById(R.id.statubar);
        View internalFindViewById = aVar.internalFindViewById(R.id.setNetwork);
        RelativeLayout relativeLayout = this.f50718b;
        if (relativeLayout != null) {
            relativeLayout.setOnClickListener(new e());
        }
        LinearLayout linearLayout = this.f50721e;
        if (linearLayout != null) {
            linearLayout.setOnClickListener(new f());
        }
        if (internalFindViewById != null) {
            internalFindViewById.setOnClickListener(new g());
        }
        LinearLayout linearLayout2 = this.f50722f;
        if (linearLayout2 != null) {
            linearLayout2.setOnClickListener(new h());
        }
        afterViews();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.L.a(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.DiscoveryFragment
    public void p0() {
        org.androidannotations.api.b.e("", new a(), 0L);
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.N.put(cls, t4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.DiscoveryFragment
    public void q0(List<ForumBean.ForumPostsBean> list) {
        org.androidannotations.api.b.e("", new k(list), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.DiscoveryFragment
    public void r0(DiscoveryMainDataBean discoveryMainDataBean) {
        org.androidannotations.api.b.e("", new l(discoveryMainDataBean), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.DiscoveryFragment
    public void showMessage(String str) {
        org.androidannotations.api.b.e("", new j(str), 0L);
    }
}
