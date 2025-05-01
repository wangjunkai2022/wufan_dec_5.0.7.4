package com.join.mgps.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.XListView2;
import com.join.mgps.dto.GiftPackageDataInfoBean;
import com.join.mgps.dto.GiftPackageDataOperationBean;
import com.join.mgps.ptr.PtrClassicFrameLayout;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.androidannotations.api.a;
/* loaded from: classes3.dex */
public final class CodesBoxFragment_ extends CodesBoxFragment implements y3.a, a4.a, a4.b {

    /* renamed from: y  reason: collision with root package name */
    private View f50280y;

    /* renamed from: x  reason: collision with root package name */
    private final a4.c f50279x = new a4.c();

    /* renamed from: z  reason: collision with root package name */
    private final Map<Class<?>, Object> f50281z = new HashMap();

    /* loaded from: classes3.dex */
    class a extends a.c {
        a(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                CodesBoxFragment_.super.c0();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes3.dex */
    class b extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.wufan.user.service.protobuf.n0 f50283b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ GiftPackageDataInfoBean f50284c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, long j4, String str2, com.wufan.user.service.protobuf.n0 n0Var, GiftPackageDataInfoBean giftPackageDataInfoBean) {
            super(str, j4, str2);
            this.f50283b = n0Var;
            this.f50284c = giftPackageDataInfoBean;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                CodesBoxFragment_.super.d0(this.f50283b, this.f50284c);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes3.dex */
    class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CodesBoxFragment_.this.relodingimag();
        }
    }

    /* loaded from: classes3.dex */
    class d implements View.OnClickListener {
        d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CodesBoxFragment_.this.setNetwork();
        }
    }

    /* loaded from: classes3.dex */
    class e implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ GiftPackageDataOperationBean f50288b;

        e(GiftPackageDataOperationBean giftPackageDataOperationBean) {
            this.f50288b = giftPackageDataOperationBean;
        }

        @Override // java.lang.Runnable
        public void run() {
            CodesBoxFragment_.super.f0(this.f50288b);
        }
    }

    /* loaded from: classes3.dex */
    class f implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f50290b;

        f(String str) {
            this.f50290b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            CodesBoxFragment_.super.showToast(this.f50290b);
        }
    }

    /* loaded from: classes3.dex */
    class g implements Runnable {
        g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            CodesBoxFragment_.super.showMain();
        }
    }

    /* loaded from: classes3.dex */
    class h implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f50293b;

        h(List list) {
            this.f50293b = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            CodesBoxFragment_.super.showMain(this.f50293b);
        }
    }

    /* loaded from: classes3.dex */
    class i implements Runnable {
        i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            CodesBoxFragment_.super.h0();
        }
    }

    /* loaded from: classes3.dex */
    class j implements Runnable {
        j() {
        }

        @Override // java.lang.Runnable
        public void run() {
            CodesBoxFragment_.super.i0();
        }
    }

    /* loaded from: classes3.dex */
    class k implements Runnable {
        k() {
        }

        @Override // java.lang.Runnable
        public void run() {
            CodesBoxFragment_.super.g0();
        }
    }

    /* loaded from: classes3.dex */
    public static class l extends org.androidannotations.api.builder.d<l, CodesBoxFragment> {
        @Override // org.androidannotations.api.builder.d
        /* renamed from: a */
        public CodesBoxFragment build() {
            CodesBoxFragment_ codesBoxFragment_ = new CodesBoxFragment_();
            codesBoxFragment_.setArguments(this.args);
            return codesBoxFragment_;
        }
    }

    private void init_(Bundle bundle) {
        a4.c.b(this);
    }

    public static l s0() {
        return new l();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.CodesBoxFragment
    public void c0() {
        org.androidannotations.api.a.l(new a("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.CodesBoxFragment
    public void d0(com.wufan.user.service.protobuf.n0 n0Var, GiftPackageDataInfoBean giftPackageDataInfoBean) {
        org.androidannotations.api.a.l(new b("", 0L, "", n0Var, giftPackageDataInfoBean));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.CodesBoxFragment
    public void f0(GiftPackageDataOperationBean giftPackageDataOperationBean) {
        org.androidannotations.api.b.e("", new e(giftPackageDataOperationBean), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.CodesBoxFragment
    public void g0() {
        org.androidannotations.api.b.e("", new k(), 0L);
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.f50281z.get(cls);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.CodesBoxFragment
    public void h0() {
        org.androidannotations.api.b.e("", new i(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.CodesBoxFragment
    public void i0() {
        org.androidannotations.api.b.e("", new j(), 0L);
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        View view = this.f50280y;
        if (view == null) {
            return null;
        }
        return (T) view.findViewById(i4);
    }

    @Override // com.join.mgps.fragment.CodesBoxFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.f50279x);
        init_(bundle);
        super.onCreate(bundle);
        a4.c.c(c5);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        this.f50280y = onCreateView;
        if (onCreateView == null) {
            this.f50280y = layoutInflater.inflate(R.layout.fragment_codesbox, viewGroup, false);
        }
        return this.f50280y;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f50280y = null;
        this.f50248c = null;
        this.f50249d = null;
        this.f50250e = null;
        this.f50251f = null;
        this.f50252g = null;
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f50248c = (LinearLayout) aVar.internalFindViewById(R.id.loding_layout);
        this.f50249d = (LinearLayout) aVar.internalFindViewById(R.id.loding_faile);
        this.f50250e = (PtrClassicFrameLayout) aVar.internalFindViewById(R.id.mPtrFrame);
        this.f50251f = (XListView2) aVar.internalFindViewById(R.id.listView2);
        this.f50252g = (ListView) aVar.internalFindViewById(R.id.recommendView);
        View internalFindViewById = aVar.internalFindViewById(R.id.relodingimag);
        View internalFindViewById2 = aVar.internalFindViewById(R.id.setNetwork);
        if (internalFindViewById != null) {
            internalFindViewById.setOnClickListener(new c());
        }
        if (internalFindViewById2 != null) {
            internalFindViewById2.setOnClickListener(new d());
        }
        afterViews();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f50279x.a(this);
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.f50281z.put(cls, t4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.CodesBoxFragment
    public void showMain() {
        org.androidannotations.api.b.e("", new g(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.CodesBoxFragment
    public void showToast(String str) {
        org.androidannotations.api.b.e("", new f(str), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.CodesBoxFragment
    public void showMain(List<GiftPackageDataInfoBean> list) {
        org.androidannotations.api.b.e("", new h(list), 0L);
    }
}
