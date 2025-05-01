package com.join.mgps.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.XListView2;
import com.join.mgps.dto.PapayVoucherResultMain;
import com.join.mgps.dto.ResultMyVoucherBean;
import java.util.HashMap;
import java.util.Map;
import org.androidannotations.api.a;
/* loaded from: classes3.dex */
public final class VoucherFragment_ extends VoucherFragment implements y3.a, a4.a, a4.b {

    /* renamed from: s  reason: collision with root package name */
    private View f53220s;

    /* renamed from: r  reason: collision with root package name */
    private final a4.c f53219r = new a4.c();

    /* renamed from: t  reason: collision with root package name */
    private final Map<Class<?>, Object> f53221t = new HashMap();

    /* loaded from: classes3.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            VoucherFragment_.this.i0();
        }
    }

    /* loaded from: classes3.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            VoucherFragment_.super.l0();
        }
    }

    /* loaded from: classes3.dex */
    class c implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PapayVoucherResultMain f53224b;

        c(PapayVoucherResultMain papayVoucherResultMain) {
            this.f53224b = papayVoucherResultMain;
        }

        @Override // java.lang.Runnable
        public void run() {
            VoucherFragment_.super.k0(this.f53224b);
        }
    }

    /* loaded from: classes3.dex */
    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            VoucherFragment_.super.o0();
        }
    }

    /* loaded from: classes3.dex */
    class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            VoucherFragment_.super.n0();
        }
    }

    /* loaded from: classes3.dex */
    class f implements Runnable {
        f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            VoucherFragment_.super.m0();
        }
    }

    /* loaded from: classes3.dex */
    class g implements Runnable {
        g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            VoucherFragment_.super.showLodingFailed();
        }
    }

    /* loaded from: classes3.dex */
    class h implements Runnable {
        h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            VoucherFragment_.super.j0();
        }
    }

    /* loaded from: classes3.dex */
    class i extends a.c {
        i(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                VoucherFragment_.super.loadData();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes3.dex */
    public static class j extends org.androidannotations.api.builder.d<j, VoucherFragment> {
        @Override // org.androidannotations.api.builder.d
        /* renamed from: a */
        public VoucherFragment build() {
            VoucherFragment_ voucherFragment_ = new VoucherFragment_();
            voucherFragment_.setArguments(this.args);
            return voucherFragment_;
        }
    }

    private void init_(Bundle bundle) {
        a4.c.b(this);
    }

    public static j x0() {
        return new j();
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.f53221t.get(cls);
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        View view = this.f53220s;
        if (view == null) {
            return null;
        }
        return (T) view.findViewById(i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.VoucherFragment
    public void j0() {
        org.androidannotations.api.b.e("", new h(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.VoucherFragment
    public void k0(PapayVoucherResultMain<ResultMyVoucherBean> papayVoucherResultMain) {
        org.androidannotations.api.b.e("", new c(papayVoucherResultMain), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.VoucherFragment
    public void l0() {
        org.androidannotations.api.b.e("", new b(), 0L);
    }

    @Override // com.join.mgps.fragment.VoucherFragment, com.join.mgps.basefragment.BaseLoadingFragment
    public void loadData() {
        org.androidannotations.api.a.l(new i("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.VoucherFragment
    public void m0() {
        org.androidannotations.api.b.e("", new f(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.VoucherFragment
    public void n0() {
        org.androidannotations.api.b.e("", new e(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.VoucherFragment
    public void o0() {
        org.androidannotations.api.b.e("", new d(), 0L);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.f53219r);
        init_(bundle);
        super.onCreate(bundle);
        a4.c.c(c5);
    }

    @Override // com.join.mgps.basefragment.BaseLoadingFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        this.f53220s = onCreateView;
        if (onCreateView == null) {
            this.f53220s = layoutInflater.inflate(R.layout.fragment_my_voucher, viewGroup, false);
        }
        return this.f53220s;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f53220s = null;
        this.f53202c = null;
        this.f53204e = null;
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f53202c = (XListView2) aVar.internalFindViewById(R.id.listview);
        LinearLayout linearLayout = (LinearLayout) aVar.internalFindViewById(R.id.hotVoucherLayout);
        this.f53204e = linearLayout;
        if (linearLayout != null) {
            linearLayout.setOnClickListener(new a());
        }
        afterViews();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f53219r.a(this);
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.f53221t.put(cls, t4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.VoucherFragment
    public void showLodingFailed() {
        org.androidannotations.api.b.e("", new g(), 0L);
    }
}
