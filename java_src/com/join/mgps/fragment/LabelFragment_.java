package com.join.mgps.fragment;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.XListView2;
import com.join.mgps.dto.CollectionBeanSub;
import com.join.mgps.dto.DetailResultBean;
import com.join.mgps.dto.ForumBean;
import com.join.mgps.ptr.PtrClassicFrameLayout;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.androidannotations.api.a;
/* loaded from: classes3.dex */
public final class LabelFragment_ extends LabelFragment implements y3.a, a4.a, a4.b {
    private View G;
    private final a4.c F = new a4.c();
    private final Map<Class<?>, Object> H = new HashMap();
    private final IntentFilter I = new IntentFilter();
    private final BroadcastReceiver J = new k();

    /* loaded from: classes3.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            LabelFragment_.super.hideLoading();
        }
    }

    /* loaded from: classes3.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            LabelFragment_.super.B0();
        }
    }

    /* loaded from: classes3.dex */
    class c implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DetailResultBean f52183b;

        c(DetailResultBean detailResultBean) {
            this.f52183b = detailResultBean;
        }

        @Override // java.lang.Runnable
        public void run() {
            LabelFragment_.super.D0(this.f52183b);
        }
    }

    /* loaded from: classes3.dex */
    class d implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f52185b;

        d(String str) {
            this.f52185b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            LabelFragment_.super.showToast(this.f52185b);
        }
    }

    /* loaded from: classes3.dex */
    class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            LabelFragment_.super.g0();
        }
    }

    /* loaded from: classes3.dex */
    class f implements Runnable {
        f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            LabelFragment_.super.y0();
        }
    }

    /* loaded from: classes3.dex */
    class g implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f52189b;

        g(String str) {
            this.f52189b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            LabelFragment_.super.showMessage(this.f52189b);
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
                LabelFragment_.super.d0();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes3.dex */
    class i extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f52192b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(String str, long j4, String str2, String str3) {
            super(str, j4, str2);
            this.f52192b = str3;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                LabelFragment_.super.a0(this.f52192b);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes3.dex */
    class j extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f52194b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(String str, long j4, String str2, int i4) {
            super(str, j4, str2);
            this.f52194b = i4;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                LabelFragment_.super.k0(this.f52194b);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes3.dex */
    class k extends BroadcastReceiver {

        /* renamed from: b  reason: collision with root package name */
        public static final String f52196b = "gameData";

        k() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            LabelFragment_.this.j0((CollectionBeanSub) (intent.getExtras() != null ? intent.getExtras() : new Bundle()).getSerializable("gameData"));
        }
    }

    /* loaded from: classes3.dex */
    class l implements View.OnClickListener {
        l() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            LabelFragment_.this.relodingimag();
        }
    }

    /* loaded from: classes3.dex */
    class m implements View.OnClickListener {
        m() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            LabelFragment_.this.setNetwork();
        }
    }

    /* loaded from: classes3.dex */
    class n implements Runnable {
        n() {
        }

        @Override // java.lang.Runnable
        public void run() {
            LabelFragment_.super.E0();
        }
    }

    /* loaded from: classes3.dex */
    class o implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f52201b;

        o(List list) {
            this.f52201b = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            LabelFragment_.super.G0(this.f52201b);
        }
    }

    /* loaded from: classes3.dex */
    class p implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f52203b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f52204c;

        p(List list, int i4) {
            this.f52203b = list;
            this.f52204c = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            LabelFragment_.super.H0(this.f52203b, this.f52204c);
        }
    }

    /* loaded from: classes3.dex */
    class q implements Runnable {
        q() {
        }

        @Override // java.lang.Runnable
        public void run() {
            LabelFragment_.super.C0();
        }
    }

    /* loaded from: classes3.dex */
    class r implements Runnable {
        r() {
        }

        @Override // java.lang.Runnable
        public void run() {
            LabelFragment_.super.A0();
        }
    }

    /* loaded from: classes3.dex */
    class s implements Runnable {
        s() {
        }

        @Override // java.lang.Runnable
        public void run() {
            LabelFragment_.super.z0();
        }
    }

    /* loaded from: classes3.dex */
    public static class t extends org.androidannotations.api.builder.d<t, LabelFragment> {
        @Override // org.androidannotations.api.builder.d
        /* renamed from: a */
        public LabelFragment build() {
            LabelFragment_ labelFragment_ = new LabelFragment_();
            labelFragment_.setArguments(this.args);
            return labelFragment_;
        }
    }

    public static t Z0() {
        return new t();
    }

    private void init_(Bundle bundle) {
        a4.c.b(this);
        this.I.addAction(o1.a.I);
        this.I.addAction(o1.a.G);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.LabelFragment
    public void A0() {
        org.androidannotations.api.b.e("", new r(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.LabelFragment
    public void B0() {
        org.androidannotations.api.b.e("", new b(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.LabelFragment
    public void C0() {
        org.androidannotations.api.b.e("", new q(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.LabelFragment
    public void D0(DetailResultBean detailResultBean) {
        org.androidannotations.api.b.e("", new c(detailResultBean), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.LabelFragment
    public void E0() {
        org.androidannotations.api.b.e("", new n(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.LabelFragment
    public void G0(List<ForumBean.ForumPostsBean> list) {
        org.androidannotations.api.b.e("", new o(list), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.LabelFragment
    public void H0(List<ForumBean.ForumPostsBean> list, int i4) {
        org.androidannotations.api.b.e("", new p(list, i4), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.LabelFragment
    public void a0(String str) {
        org.androidannotations.api.a.l(new i("", 0L, "", str));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.LabelFragment
    public void d0() {
        org.androidannotations.api.a.l(new h("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.LabelFragment
    public void g0() {
        org.androidannotations.api.b.e("", new e(), 500L);
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.H.get(cls);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.LabelFragment
    public void hideLoading() {
        org.androidannotations.api.b.e("", new a(), 0L);
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
    @Override // com.join.mgps.fragment.LabelFragment
    public void k0(int i4) {
        org.androidannotations.api.a.l(new j("", 0L, "", i4));
    }

    @Override // com.join.mgps.fragment.LabelFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.F);
        init_(bundle);
        super.onCreate(bundle);
        getActivity().registerReceiver(this.J, this.I);
        a4.c.c(c5);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        this.G = onCreateView;
        if (onCreateView == null) {
            this.G = layoutInflater.inflate(R.layout.fragment_lable, viewGroup, false);
        }
        return this.G;
    }

    @Override // com.join.mgps.fragment.LabelFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        getActivity().unregisterReceiver(this.J);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.G = null;
        this.f52156h = null;
        this.f52157i = null;
        this.f52158j = null;
        this.f52159k = null;
        this.f52169u = null;
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f52156h = (LinearLayout) aVar.internalFindViewById(R.id.loding_faile);
        this.f52157i = (LinearLayout) aVar.internalFindViewById(R.id.loding_layout);
        this.f52158j = (XListView2) aVar.internalFindViewById(R.id.mListView);
        this.f52159k = (PtrClassicFrameLayout) aVar.internalFindViewById(R.id.mPtrFrame);
        this.f52169u = (ImageView) aVar.internalFindViewById(R.id.iv_no_data);
        View internalFindViewById = aVar.internalFindViewById(R.id.relodingimag);
        View internalFindViewById2 = aVar.internalFindViewById(R.id.setNetwork);
        if (internalFindViewById != null) {
            internalFindViewById.setOnClickListener(new l());
        }
        if (internalFindViewById2 != null) {
            internalFindViewById2.setOnClickListener(new m());
        }
        afterViews();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.F.a(this);
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.H.put(cls, t4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.LabelFragment
    public void showMessage(String str) {
        org.androidannotations.api.b.e("", new g(str), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.LabelFragment
    public void showToast(String str) {
        org.androidannotations.api.b.e("", new d(str), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.LabelFragment
    public void y0() {
        org.androidannotations.api.b.e("", new f(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.LabelFragment
    public void z0() {
        org.androidannotations.api.b.e("", new s(), 0L);
    }
}
