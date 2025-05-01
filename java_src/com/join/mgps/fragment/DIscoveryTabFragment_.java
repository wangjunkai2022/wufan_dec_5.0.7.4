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
import android.widget.TextView;
import com.join.android.app.component.xrecyclerview.XRecyclerView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.swiperefresh.SwipeRefresh;
import com.join.mgps.dto.DiscoverListItemBean;
import com.join.mgps.dto.DiscoverListWeiboItemBean;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.androidannotations.api.a;
/* loaded from: classes3.dex */
public final class DIscoveryTabFragment_ extends DIscoveryTabFragment implements y3.a, a4.a, a4.b {

    /* renamed from: r  reason: collision with root package name */
    private View f50696r;

    /* renamed from: q  reason: collision with root package name */
    private final a4.c f50695q = new a4.c();

    /* renamed from: s  reason: collision with root package name */
    private final Map<Class<?>, Object> f50697s = new HashMap();

    /* renamed from: t  reason: collision with root package name */
    private final IntentFilter f50698t = new IntentFilter();

    /* renamed from: u  reason: collision with root package name */
    private final BroadcastReceiver f50699u = new d();

    /* loaded from: classes3.dex */
    class a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f50700b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f50701c;

        a(List list, int i4) {
            this.f50700b = list;
            this.f50701c = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            DIscoveryTabFragment_.super.e0(this.f50700b, this.f50701c);
        }
    }

    /* loaded from: classes3.dex */
    class b extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f50703b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, long j4, String str2, int i4) {
            super(str, j4, str2);
            this.f50703b = i4;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                DIscoveryTabFragment_.super.loadData(this.f50703b);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes3.dex */
    class c extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f50705b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, long j4, String str2, int i4) {
            super(str, j4, str2);
            this.f50705b = i4;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                DIscoveryTabFragment_.super.X(this.f50705b);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes3.dex */
    class d extends BroadcastReceiver {
        d() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            DIscoveryTabFragment_.this.W(intent);
        }
    }

    /* loaded from: classes3.dex */
    class e implements View.OnClickListener {
        e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DIscoveryTabFragment_.this.setNetwork();
        }
    }

    /* loaded from: classes3.dex */
    class f implements View.OnClickListener {
        f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DIscoveryTabFragment_.this.relodingimag();
        }
    }

    /* loaded from: classes3.dex */
    class g implements Runnable {
        g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            DIscoveryTabFragment_.super.showLoding();
        }
    }

    /* loaded from: classes3.dex */
    class h implements Runnable {
        h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            DIscoveryTabFragment_.super.Z();
        }
    }

    /* loaded from: classes3.dex */
    class i implements Runnable {
        i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            DIscoveryTabFragment_.super.a0();
        }
    }

    /* loaded from: classes3.dex */
    class j implements Runnable {
        j() {
        }

        @Override // java.lang.Runnable
        public void run() {
            DIscoveryTabFragment_.super.c0();
        }
    }

    /* loaded from: classes3.dex */
    class k implements Runnable {
        k() {
        }

        @Override // java.lang.Runnable
        public void run() {
            DIscoveryTabFragment_.super.b0();
        }
    }

    /* loaded from: classes3.dex */
    class l implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f50715b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f50716c;

        l(List list, int i4) {
            this.f50715b = list;
            this.f50716c = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            DIscoveryTabFragment_.super.d0(this.f50715b, this.f50716c);
        }
    }

    /* loaded from: classes3.dex */
    public static class m extends org.androidannotations.api.builder.d<m, DIscoveryTabFragment> {
        @Override // org.androidannotations.api.builder.d
        /* renamed from: a */
        public DIscoveryTabFragment build() {
            DIscoveryTabFragment_ dIscoveryTabFragment_ = new DIscoveryTabFragment_();
            dIscoveryTabFragment_.setArguments(this.args);
            return dIscoveryTabFragment_;
        }
    }

    private void init_(Bundle bundle) {
        a4.c.b(this);
        this.f50698t.addAction("com.join.update.position2");
    }

    public static m o0() {
        return new m();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.DIscoveryTabFragment
    public void X(int i4) {
        org.androidannotations.api.a.l(new c("", 0L, "", i4));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.DIscoveryTabFragment
    public void Z() {
        org.androidannotations.api.b.e("", new h(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.DIscoveryTabFragment
    public void a0() {
        org.androidannotations.api.b.e("", new i(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.DIscoveryTabFragment
    public void b0() {
        org.androidannotations.api.b.e("", new k(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.DIscoveryTabFragment
    public void c0() {
        org.androidannotations.api.b.e("", new j(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.DIscoveryTabFragment
    public void d0(List<DiscoverListItemBean> list, int i4) {
        org.androidannotations.api.b.e("", new l(list, i4), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.DIscoveryTabFragment
    public void e0(List<DiscoverListWeiboItemBean> list, int i4) {
        org.androidannotations.api.b.e("", new a(list, i4), 0L);
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.f50697s.get(cls);
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        View view = this.f50696r;
        if (view == null) {
            return null;
        }
        return (T) view.findViewById(i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.DIscoveryTabFragment
    public void loadData(int i4) {
        org.androidannotations.api.a.l(new b("", 0L, "", i4));
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.f50695q);
        init_(bundle);
        super.onCreate(bundle);
        getActivity().registerReceiver(this.f50699u, this.f50698t);
        a4.c.c(c5);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        this.f50696r = onCreateView;
        if (onCreateView == null) {
            this.f50696r = layoutInflater.inflate(R.layout.discovery_tab_fragment_layout, viewGroup, false);
        }
        return this.f50696r;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        getActivity().unregisterReceiver(this.f50699u);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f50696r = null;
        this.f50658b = null;
        this.f50659c = null;
        this.f50660d = null;
        this.f50661e = null;
        this.f50662f = null;
        this.f50663g = null;
        this.f50664h = null;
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f50658b = (XRecyclerView) aVar.internalFindViewById(R.id.recyclerView);
        this.f50659c = (SwipeRefresh) aVar.internalFindViewById(R.id.refreshx);
        this.f50660d = (LinearLayout) aVar.internalFindViewById(R.id.loding_layout);
        this.f50661e = (LinearLayout) aVar.internalFindViewById(R.id.loading_none);
        this.f50662f = (LinearLayout) aVar.internalFindViewById(R.id.loding_faile);
        this.f50663g = (ImageView) aVar.internalFindViewById(R.id.relodingimag);
        this.f50664h = (TextView) aVar.internalFindViewById(R.id.noneMessage);
        View internalFindViewById = aVar.internalFindViewById(R.id.setNetwork);
        if (internalFindViewById != null) {
            internalFindViewById.setOnClickListener(new e());
        }
        ImageView imageView = this.f50663g;
        if (imageView != null) {
            imageView.setOnClickListener(new f());
        }
        V();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f50695q.a(this);
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.f50697s.put(cls, t4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.DIscoveryTabFragment
    public void showLoding() {
        org.androidannotations.api.b.e("", new g(), 0L);
    }
}
