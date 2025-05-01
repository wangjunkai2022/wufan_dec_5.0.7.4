package com.join.mgps.fragment;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.XListView;
import java.util.HashMap;
import java.util.Map;
import org.androidannotations.api.a;
/* loaded from: classes3.dex */
public final class MGManageFragment_ extends MGManageFragment implements y3.a, a4.a, a4.b {

    /* renamed from: i  reason: collision with root package name */
    private View f52216i;

    /* renamed from: h  reason: collision with root package name */
    private final a4.c f52215h = new a4.c();

    /* renamed from: j  reason: collision with root package name */
    private final Map<Class<?>, Object> f52217j = new HashMap();

    /* renamed from: k  reason: collision with root package name */
    private final IntentFilter f52218k = new IntentFilter();

    /* renamed from: l  reason: collision with root package name */
    private final BroadcastReceiver f52219l = new a();

    /* loaded from: classes3.dex */
    class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            MGManageFragment_.this.V(intent);
        }
    }

    /* loaded from: classes3.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MGManageFragment_.super.a0();
        }
    }

    /* loaded from: classes3.dex */
    class c implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.wufan.user.service.protobuf.n0 f52222b;

        c(com.wufan.user.service.protobuf.n0 n0Var) {
            this.f52222b = n0Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            MGManageFragment_.super.Z(this.f52222b);
        }
    }

    /* loaded from: classes3.dex */
    class d implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f52224b;

        d(int i4) {
            this.f52224b = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            MGManageFragment_.super.X(this.f52224b);
        }
    }

    /* loaded from: classes3.dex */
    class e extends a.c {
        e(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                MGManageFragment_.super.W();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes3.dex */
    public static class f extends org.androidannotations.api.builder.d<f, MGManageFragment> {
        @Override // org.androidannotations.api.builder.d
        /* renamed from: a */
        public MGManageFragment build() {
            MGManageFragment_ mGManageFragment_ = new MGManageFragment_();
            mGManageFragment_.setArguments(this.args);
            return mGManageFragment_;
        }
    }

    public static f f0() {
        return new f();
    }

    private void init_(Bundle bundle) {
        a4.c.b(this);
        this.f52218k.addAction(o1.a.f72016o);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.MGManageFragment
    public void W() {
        org.androidannotations.api.a.l(new e("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.MGManageFragment
    public void X(int i4) {
        org.androidannotations.api.b.e("", new d(i4), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.MGManageFragment
    public void Z(com.wufan.user.service.protobuf.n0 n0Var) {
        org.androidannotations.api.b.e("", new c(n0Var), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.MGManageFragment
    public void a0() {
        org.androidannotations.api.b.e("", new b(), 0L);
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.f52217j.get(cls);
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        View view = this.f52216i;
        if (view == null) {
            return null;
        }
        return (T) view.findViewById(i4);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.f52215h);
        init_(bundle);
        super.onCreate(bundle);
        getActivity().registerReceiver(this.f52219l, this.f52218k);
        a4.c.c(c5);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        this.f52216i = onCreateView;
        if (onCreateView == null) {
            this.f52216i = layoutInflater.inflate(R.layout.mg_manage_fragment, viewGroup, false);
        }
        return this.f52216i;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        getActivity().unregisterReceiver(this.f52219l);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f52216i = null;
        this.f52212e = null;
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f52212e = (XListView) aVar.internalFindViewById(R.id.manageListView);
        afterViews();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f52215h.a(this);
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.f52217j.put(cls, t4);
    }
}
