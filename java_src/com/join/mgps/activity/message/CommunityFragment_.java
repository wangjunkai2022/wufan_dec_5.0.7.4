package com.join.mgps.activity.message;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.activity.message.CommunityFragment;
import com.join.mgps.customview.XListView2;
import com.join.mgps.ptr.PtrClassicFrameLayout;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.androidannotations.api.a;
/* loaded from: classes4.dex */
public final class CommunityFragment_ extends CommunityFragment implements y3.a, a4.a, a4.b {
    private View D;
    private final a4.c C = new a4.c();
    private final Map<Class<?>, Object> E = new HashMap();

    /* loaded from: classes4.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            CommunityFragment_.super.k0();
        }
    }

    /* loaded from: classes4.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            CommunityFragment_.super.b0();
        }
    }

    /* loaded from: classes4.dex */
    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            CommunityFragment_.super.showLoding();
        }
    }

    /* loaded from: classes4.dex */
    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            CommunityFragment_.super.a0();
        }
    }

    /* loaded from: classes4.dex */
    class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            CommunityFragment_.super.showLodingFailed();
        }
    }

    /* loaded from: classes4.dex */
    class f implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f39199b;

        f(String str) {
            this.f39199b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            CommunityFragment_.super.showToast(this.f39199b);
        }
    }

    /* loaded from: classes4.dex */
    class g implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f39201b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f39202c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f39203d;

        g(int i4, int i5, String str) {
            this.f39201b = i4;
            this.f39202c = i5;
            this.f39203d = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            CommunityFragment_.super.i0(this.f39201b, this.f39202c, this.f39203d);
        }
    }

    /* loaded from: classes4.dex */
    class h extends a.c {
        h(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                CommunityFragment_.super.Z();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class i extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f39206b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f39207c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f39208d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(String str, long j4, String str2, String str3, int i4, int i5) {
            super(str, j4, str2);
            this.f39206b = str3;
            this.f39207c = i4;
            this.f39208d = i5;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                CommunityFragment_.super.e0(this.f39206b, this.f39207c, this.f39208d);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class j implements View.OnClickListener {
        j() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CommunityFragment_.this.setNetwork();
        }
    }

    /* loaded from: classes4.dex */
    class k implements View.OnClickListener {
        k() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CommunityFragment_.this.l0();
        }
    }

    /* loaded from: classes4.dex */
    class l implements Runnable {
        l() {
        }

        @Override // java.lang.Runnable
        public void run() {
            CommunityFragment_.super.V();
        }
    }

    /* loaded from: classes4.dex */
    class m implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f39213b;

        m(List list) {
            this.f39213b = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            CommunityFragment_.super.X(this.f39213b);
        }
    }

    /* loaded from: classes4.dex */
    class n implements Runnable {
        n() {
        }

        @Override // java.lang.Runnable
        public void run() {
            CommunityFragment_.super.m0();
        }
    }

    /* loaded from: classes4.dex */
    class o implements Runnable {
        o() {
        }

        @Override // java.lang.Runnable
        public void run() {
            CommunityFragment_.super.f0();
        }
    }

    /* loaded from: classes4.dex */
    class p implements Runnable {
        p() {
        }

        @Override // java.lang.Runnable
        public void run() {
            CommunityFragment_.super.j0();
        }
    }

    /* loaded from: classes4.dex */
    class q implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f39218b;

        q(int i4) {
            this.f39218b = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            CommunityFragment_.super.g0(this.f39218b);
        }
    }

    /* loaded from: classes4.dex */
    class r implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f39220b;

        r(List list) {
            this.f39220b = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            CommunityFragment_.super.d0(this.f39220b);
        }
    }

    /* loaded from: classes4.dex */
    public static class s extends org.androidannotations.api.builder.d<s, CommunityFragment> {
        @Override // org.androidannotations.api.builder.d
        /* renamed from: a */
        public CommunityFragment build() {
            CommunityFragment_ communityFragment_ = new CommunityFragment_();
            communityFragment_.setArguments(this.args);
            return communityFragment_;
        }
    }

    public static s D0() {
        return new s();
    }

    private void init_(Bundle bundle) {
        a4.c.b(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.message.CommunityFragment
    public void V() {
        org.androidannotations.api.b.e("", new l(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.message.CommunityFragment
    public void X(List<CommunityFragment.i> list) {
        org.androidannotations.api.b.e("", new m(list), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.message.CommunityFragment
    public void Z() {
        org.androidannotations.api.a.l(new h("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.message.CommunityFragment
    public void a0() {
        org.androidannotations.api.b.e("", new d(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.message.CommunityFragment
    public void b0() {
        org.androidannotations.api.b.e("", new b(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.message.CommunityFragment
    public void d0(List<CommunityFragment.i> list) {
        org.androidannotations.api.b.e("", new r(list), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.message.CommunityFragment
    public void e0(String str, int i4, int i5) {
        org.androidannotations.api.a.l(new i("", 0L, "", str, i4, i5));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.message.CommunityFragment
    public void f0() {
        org.androidannotations.api.b.e("", new o(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.message.CommunityFragment
    public void g0(int i4) {
        org.androidannotations.api.b.e("", new q(i4), 0L);
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.E.get(cls);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.message.CommunityFragment
    public void i0(int i4, int i5, String str) {
        org.androidannotations.api.b.e("", new g(i4, i5, str), 0L);
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        View view = this.D;
        if (view == null) {
            return null;
        }
        return (T) view.findViewById(i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.message.CommunityFragment
    public void j0() {
        org.androidannotations.api.b.e("", new p(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.message.CommunityFragment
    public void k0() {
        org.androidannotations.api.b.e("", new a(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.message.CommunityFragment
    public void m0() {
        org.androidannotations.api.b.e("", new n(), 0L);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.C);
        init_(bundle);
        super.onCreate(bundle);
        a4.c.c(c5);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        this.D = onCreateView;
        if (onCreateView == null) {
            this.D = layoutInflater.inflate(R.layout.fragment_communtity, viewGroup, false);
        }
        return this.D;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.D = null;
        this.f39127b = null;
        this.f39128c = null;
        this.f39129d = null;
        this.f39131f = null;
        this.f39132g = null;
        this.f39133h = null;
        this.f39134i = null;
        this.f39138m = null;
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f39127b = (LinearLayout) aVar.internalFindViewById(R.id.thumbslayout);
        this.f39128c = (PtrClassicFrameLayout) aVar.internalFindViewById(R.id.myswip);
        this.f39129d = (XListView2) aVar.internalFindViewById(R.id.listview);
        this.f39131f = (LinearLayout) aVar.internalFindViewById(R.id.loding_layout);
        this.f39132g = (LinearLayout) aVar.internalFindViewById(R.id.loding_faile);
        this.f39133h = (LinearLayout) aVar.internalFindViewById(R.id.iv_nome);
        this.f39134i = (TextView) aVar.internalFindViewById(R.id.redTips);
        Button button = (Button) aVar.internalFindViewById(R.id.setNetwork);
        this.f39138m = button;
        if (button != null) {
            button.setOnClickListener(new j());
        }
        LinearLayout linearLayout = this.f39127b;
        if (linearLayout != null) {
            linearLayout.setOnClickListener(new k());
        }
        afterViews();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.C.a(this);
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.E.put(cls, t4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.message.CommunityFragment
    public void showLoding() {
        org.androidannotations.api.b.e("", new c(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.message.CommunityFragment
    public void showLodingFailed() {
        org.androidannotations.api.b.e("", new e(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.message.CommunityFragment
    public void showToast(String str) {
        org.androidannotations.api.b.e("", new f(str), 0L);
    }
}
