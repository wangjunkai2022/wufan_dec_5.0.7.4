package com.join.mgps.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.XListView;
import java.util.HashMap;
import java.util.Map;
import org.androidannotations.api.a;
/* loaded from: classes3.dex */
public final class MyVoucherGameFragment_ extends MyVoucherGameFragment implements y3.a, a4.a, a4.b {

    /* renamed from: k  reason: collision with root package name */
    private View f52404k;

    /* renamed from: j  reason: collision with root package name */
    private final a4.c f52403j = new a4.c();

    /* renamed from: l  reason: collision with root package name */
    private final Map<Class<?>, Object> f52405l = new HashMap();

    /* loaded from: classes3.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MyVoucherGameFragment_.this.relodingimag();
        }
    }

    /* loaded from: classes3.dex */
    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MyVoucherGameFragment_.this.setNetwork();
        }
    }

    /* loaded from: classes3.dex */
    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MyVoucherGameFragment_.super.X();
        }
    }

    /* loaded from: classes3.dex */
    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MyVoucherGameFragment_.super.showLoding();
        }
    }

    /* loaded from: classes3.dex */
    class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MyVoucherGameFragment_.super.W();
        }
    }

    /* loaded from: classes3.dex */
    class f implements Runnable {
        f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MyVoucherGameFragment_.super.showLodingFailed();
        }
    }

    /* loaded from: classes3.dex */
    class g implements Runnable {
        g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MyVoucherGameFragment_.super.V();
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
                MyVoucherGameFragment_.super.loadData();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes3.dex */
    public static class i extends org.androidannotations.api.builder.d<i, MyVoucherGameFragment> {
        @Override // org.androidannotations.api.builder.d
        /* renamed from: a */
        public MyVoucherGameFragment build() {
            MyVoucherGameFragment_ myVoucherGameFragment_ = new MyVoucherGameFragment_();
            myVoucherGameFragment_.setArguments(this.args);
            return myVoucherGameFragment_;
        }
    }

    public static i f0() {
        return new i();
    }

    private void init_(Bundle bundle) {
        a4.c.b(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.MyVoucherGameFragment
    public void V() {
        org.androidannotations.api.b.e("", new g(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.MyVoucherGameFragment
    public void W() {
        org.androidannotations.api.b.e("", new e(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.MyVoucherGameFragment
    public void X() {
        org.androidannotations.api.b.e("", new c(), 0L);
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.f52405l.get(cls);
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        View view = this.f52404k;
        if (view == null) {
            return null;
        }
        return (T) view.findViewById(i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.MyVoucherGameFragment
    public void loadData() {
        org.androidannotations.api.a.l(new h("", 0L, ""));
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.f52403j);
        init_(bundle);
        super.onCreate(bundle);
        a4.c.c(c5);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        this.f52404k = onCreateView;
        if (onCreateView == null) {
            this.f52404k = layoutInflater.inflate(R.layout.layout_listview, viewGroup, false);
        }
        return this.f52404k;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f52404k = null;
        this.f52396c = null;
        this.f52397d = null;
        this.f52398e = null;
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f52396c = (XListView) aVar.internalFindViewById(R.id.listview);
        this.f52397d = (LinearLayout) aVar.internalFindViewById(R.id.loding_layout);
        this.f52398e = (LinearLayout) aVar.internalFindViewById(R.id.loding_faile);
        View internalFindViewById = aVar.internalFindViewById(R.id.relodingimag);
        View internalFindViewById2 = aVar.internalFindViewById(R.id.setNetwork);
        if (internalFindViewById != null) {
            internalFindViewById.setOnClickListener(new a());
        }
        if (internalFindViewById2 != null) {
            internalFindViewById2.setOnClickListener(new b());
        }
        afterViews();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f52403j.a(this);
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.f52405l.put(cls, t4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.MyVoucherGameFragment
    public void showLoding() {
        org.androidannotations.api.b.e("", new d(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.MyVoucherGameFragment
    public void showLodingFailed() {
        org.androidannotations.api.b.e("", new f(), 0L);
    }
}
