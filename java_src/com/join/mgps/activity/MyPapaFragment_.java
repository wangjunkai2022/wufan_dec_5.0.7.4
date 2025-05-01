package com.join.mgps.activity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.XListView2;
import com.join.mgps.pref.PrefDef_;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes4.dex */
public final class MyPapaFragment_ extends MyPapaFragment implements y3.a, a4.a, a4.b {

    /* renamed from: o  reason: collision with root package name */
    private View f36085o;

    /* renamed from: n  reason: collision with root package name */
    private final a4.c f36084n = new a4.c();

    /* renamed from: p  reason: collision with root package name */
    private final Map<Class<?>, Object> f36086p = new HashMap();

    /* loaded from: classes4.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MyPapaFragment_.this.relodingimag();
        }
    }

    /* loaded from: classes4.dex */
    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MyPapaFragment_.this.setNetwork();
        }
    }

    /* loaded from: classes4.dex */
    class c implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f36089b;

        c(List list) {
            this.f36089b = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            MyPapaFragment_.super.X(this.f36089b);
        }
    }

    /* loaded from: classes4.dex */
    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MyPapaFragment_.super.W();
        }
    }

    /* loaded from: classes4.dex */
    class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MyPapaFragment_.super.V();
        }
    }

    /* loaded from: classes4.dex */
    public static class f extends org.androidannotations.api.builder.d<f, MyPapaFragment> {
        @Override // org.androidannotations.api.builder.d
        /* renamed from: a */
        public MyPapaFragment build() {
            MyPapaFragment_ myPapaFragment_ = new MyPapaFragment_();
            myPapaFragment_.setArguments(this.args);
            return myPapaFragment_;
        }
    }

    public static f f0() {
        return new f();
    }

    private void init_(Bundle bundle) {
        this.f36077g = new PrefDef_(getActivity());
        a4.c.b(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MyPapaFragment
    public void V() {
        org.androidannotations.api.b.e("", new e(), 0L);
    }

    @Override // com.join.mgps.activity.MyPapaFragment
    public void W() {
        org.androidannotations.api.b.e("", new d(), 0L);
    }

    @Override // com.join.mgps.activity.MyPapaFragment
    public void X(List<DownloadTask> list) {
        org.androidannotations.api.b.e("", new c(list), 0L);
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.f36086p.get(cls);
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        View view = this.f36085o;
        if (view == null) {
            return null;
        }
        return (T) view.findViewById(i4);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.f36084n);
        init_(bundle);
        super.onCreate(bundle);
        a4.c.c(c5);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        this.f36085o = onCreateView;
        if (onCreateView == null) {
            this.f36085o = layoutInflater.inflate(R.layout.my_papa_layout, viewGroup, false);
        }
        return this.f36085o;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f36085o = null;
        this.f36078h = null;
        this.f36079i = null;
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f36078h = (XListView2) aVar.internalFindViewById(R.id.classifyListView);
        this.f36079i = (LinearLayout) aVar.internalFindViewById(R.id.noneLayout);
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
        this.f36084n.a(this);
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.f36086p.put(cls, t4);
    }
}
