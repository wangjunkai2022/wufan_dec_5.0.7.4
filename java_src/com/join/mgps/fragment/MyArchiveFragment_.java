package com.join.mgps.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.dto.CloudListDataBean;
import com.join.mgps.dto.RomArchived;
import com.join.mgps.fragment.MyArchiveFragment;
import com.join.mgps.pref.PrefDef_;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.androidannotations.api.a;
/* loaded from: classes3.dex */
public final class MyArchiveFragment_ extends MyArchiveFragment implements y3.a, a4.a, a4.b {
    private View Y;
    private final a4.c X = new a4.c();
    private final Map<Class<?>, Object> Z = new HashMap();

    /* loaded from: classes3.dex */
    class a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CloudListDataBean f52312b;

        a(CloudListDataBean cloudListDataBean) {
            this.f52312b = cloudListDataBean;
        }

        @Override // java.lang.Runnable
        public void run() {
            MyArchiveFragment_.super.H0(this.f52312b);
        }
    }

    /* loaded from: classes3.dex */
    public static class a0 extends org.androidannotations.api.builder.d<a0, MyArchiveFragment> {
        @Override // org.androidannotations.api.builder.d
        /* renamed from: a */
        public MyArchiveFragment build() {
            MyArchiveFragment_ myArchiveFragment_ = new MyArchiveFragment_();
            myArchiveFragment_.setArguments(this.args);
            return myArchiveFragment_;
        }
    }

    /* loaded from: classes3.dex */
    class b implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CloudListDataBean f52314b;

        b(CloudListDataBean cloudListDataBean) {
            this.f52314b = cloudListDataBean;
        }

        @Override // java.lang.Runnable
        public void run() {
            MyArchiveFragment_.super.G0(this.f52314b);
        }
    }

    /* loaded from: classes3.dex */
    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MyArchiveFragment_.super.M0();
        }
    }

    /* loaded from: classes3.dex */
    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MyArchiveFragment_.super.N0();
        }
    }

    /* loaded from: classes3.dex */
    class e implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f52318b;

        e(boolean z4) {
            this.f52318b = z4;
        }

        @Override // java.lang.Runnable
        public void run() {
            MyArchiveFragment_.super.C0(this.f52318b);
        }
    }

    /* loaded from: classes3.dex */
    class f implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f52320b;

        f(boolean z4) {
            this.f52320b = z4;
        }

        @Override // java.lang.Runnable
        public void run() {
            MyArchiveFragment_.super.E0(this.f52320b);
        }
    }

    /* loaded from: classes3.dex */
    class g implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f52322b;

        g(String str) {
            this.f52322b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            MyArchiveFragment_.super.L0(this.f52322b);
        }
    }

    /* loaded from: classes3.dex */
    class h implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CloudListDataBean f52324b;

        h(CloudListDataBean cloudListDataBean) {
            this.f52324b = cloudListDataBean;
        }

        @Override // java.lang.Runnable
        public void run() {
            MyArchiveFragment_.super.R0(this.f52324b);
        }
    }

    /* loaded from: classes3.dex */
    class i implements Runnable {
        i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MyArchiveFragment_.super.I0();
        }
    }

    /* loaded from: classes3.dex */
    class j implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f52327b;

        j(String str) {
            this.f52327b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            MyArchiveFragment_.super.D0(this.f52327b);
        }
    }

    /* loaded from: classes3.dex */
    class k implements View.OnClickListener {
        k() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MyArchiveFragment_.this.t0();
        }
    }

    /* loaded from: classes3.dex */
    class l implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f52330b;

        l(String str) {
            this.f52330b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            MyArchiveFragment_.super.showMessage(this.f52330b);
        }
    }

    /* loaded from: classes3.dex */
    class m extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f52332b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(String str, long j4, String str2, int i4) {
            super(str, j4, str2);
            this.f52332b = i4;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                MyArchiveFragment_.super.m0(this.f52332b);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes3.dex */
    class n extends a.c {
        n(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                MyArchiveFragment_.super.n0();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes3.dex */
    class o extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f52335b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f52336c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ MyArchiveFragment.w f52337d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(String str, long j4, String str2, List list, boolean z4, MyArchiveFragment.w wVar) {
            super(str, j4, str2);
            this.f52335b = list;
            this.f52336c = z4;
            this.f52337d = wVar;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                MyArchiveFragment_.super.z0(this.f52335b, this.f52336c, this.f52337d);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes3.dex */
    class p extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CloudListDataBean f52339b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(String str, long j4, String str2, CloudListDataBean cloudListDataBean) {
            super(str, j4, str2);
            this.f52339b = cloudListDataBean;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                MyArchiveFragment_.super.i0(this.f52339b);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes3.dex */
    class q extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CloudListDataBean f52341b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.join.mgps.listener.e f52342c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        q(String str, long j4, String str2, CloudListDataBean cloudListDataBean, com.join.mgps.listener.e eVar) {
            super(str, j4, str2);
            this.f52341b = cloudListDataBean;
            this.f52342c = eVar;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                MyArchiveFragment_.super.Q0(this.f52341b, this.f52342c);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes3.dex */
    class r extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CloudListDataBean f52344b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f52345c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        r(String str, long j4, String str2, CloudListDataBean cloudListDataBean, String str3) {
            super(str, j4, str2);
            this.f52344b = cloudListDataBean;
            this.f52345c = str3;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                MyArchiveFragment_.super.A0(this.f52344b, this.f52345c);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes3.dex */
    class s implements View.OnClickListener {
        s() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MyArchiveFragment_.this.f0();
        }
    }

    /* loaded from: classes3.dex */
    class t implements Runnable {
        t() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MyArchiveFragment_.super.V();
        }
    }

    /* loaded from: classes3.dex */
    class u implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f52349b;

        u(List list) {
            this.f52349b = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            MyArchiveFragment_.super.u0(this.f52349b);
        }
    }

    /* loaded from: classes3.dex */
    class v implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f52351b;

        v(List list) {
            this.f52351b = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            MyArchiveFragment_.super.J0(this.f52351b);
        }
    }

    /* loaded from: classes3.dex */
    class w implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f52353b;

        w(List list) {
            this.f52353b = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            MyArchiveFragment_.super.updateUi(this.f52353b);
        }
    }

    /* loaded from: classes3.dex */
    class x implements Runnable {
        x() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MyArchiveFragment_.super.s0();
        }
    }

    /* loaded from: classes3.dex */
    class y implements Runnable {
        y() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MyArchiveFragment_.super.r0();
        }
    }

    /* loaded from: classes3.dex */
    class z implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f52357b;

        z(List list) {
            this.f52357b = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            MyArchiveFragment_.super.K0(this.f52357b);
        }
    }

    private void init_(Bundle bundle) {
        this.f52253n = new PrefDef_(getActivity());
        a4.c.b(this);
    }

    public static a0 r1() {
        return new a0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.MyArchiveFragment
    public void A0(CloudListDataBean cloudListDataBean, String str) {
        org.androidannotations.api.a.l(new r("", 0L, "", cloudListDataBean, str));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.MyArchiveFragment
    public void C0(boolean z4) {
        org.androidannotations.api.b.e("", new e(z4), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.MyArchiveFragment
    public void D0(String str) {
        org.androidannotations.api.b.e("", new j(str), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.MyArchiveFragment
    public void E0(boolean z4) {
        org.androidannotations.api.b.e("", new f(z4), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.MyArchiveFragment
    public void G0(CloudListDataBean cloudListDataBean) {
        org.androidannotations.api.b.e("", new b(cloudListDataBean), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.MyArchiveFragment
    public void H0(CloudListDataBean cloudListDataBean) {
        org.androidannotations.api.b.e("", new a(cloudListDataBean), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.MyArchiveFragment
    public void I0() {
        org.androidannotations.api.b.e("", new i(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.MyArchiveFragment
    public void J0(List<RomArchived> list) {
        org.androidannotations.api.b.e("", new v(list), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.MyArchiveFragment
    public void K0(List<RomArchived> list) {
        org.androidannotations.api.b.e("", new z(list), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.MyArchiveFragment
    public void L0(String str) {
        org.androidannotations.api.b.e("", new g(str), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.MyArchiveFragment
    public void M0() {
        org.androidannotations.api.b.e("", new c(), 500L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.MyArchiveFragment
    public void N0() {
        org.androidannotations.api.b.e("", new d(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.MyArchiveFragment
    public void Q0(CloudListDataBean cloudListDataBean, com.join.mgps.listener.e eVar) {
        org.androidannotations.api.a.l(new q("", 0L, "", cloudListDataBean, eVar));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.MyArchiveFragment
    public void R0(CloudListDataBean cloudListDataBean) {
        org.androidannotations.api.b.e("", new h(cloudListDataBean), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.MyArchiveFragment
    public void V() {
        org.androidannotations.api.b.e("", new t(), 0L);
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.Z.get(cls);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.MyArchiveFragment
    public void i0(CloudListDataBean cloudListDataBean) {
        org.androidannotations.api.a.l(new p("", 0L, "", cloudListDataBean));
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        View view = this.Y;
        if (view == null) {
            return null;
        }
        return (T) view.findViewById(i4);
    }

    @Override // com.join.mgps.fragment.MyArchiveFragment
    public void m0(int i4) {
        org.androidannotations.api.a.l(new m("", 0L, "", i4));
    }

    @Override // com.join.mgps.fragment.MyArchiveFragment
    public void n0() {
        org.androidannotations.api.a.l(new n("", 0L, ""));
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.X);
        init_(bundle);
        super.onCreate(bundle);
        a4.c.c(c5);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        this.Y = onCreateView;
        if (onCreateView == null) {
            this.Y = layoutInflater.inflate(R.layout.item_archive, viewGroup, false);
        }
        return this.Y;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.Y = null;
        this.f52241b = null;
        this.f52242c = null;
        this.f52243d = null;
        this.f52244e = null;
        this.f52245f = null;
        this.f52246g = null;
        this.f52247h = null;
        this.f52248i = null;
        this.f52249j = null;
        this.f52250k = null;
        this.f52251l = null;
        this.f52252m = null;
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f52241b = (RelativeLayout) aVar.internalFindViewById(R.id.rl_titlebar);
        this.f52242c = (ImageView) aVar.internalFindViewById(R.id.iv_all_select);
        this.f52243d = (TextView) aVar.internalFindViewById(R.id.tv_selectarchive_size);
        this.f52244e = (Button) aVar.internalFindViewById(R.id.btn_archive_down);
        this.f52245f = (Button) aVar.internalFindViewById(R.id.btn_cancel);
        this.f52246g = (RecyclerView) aVar.internalFindViewById(R.id.rcy);
        this.f52247h = (LinearLayout) aVar.internalFindViewById(R.id.ll_nodata);
        this.f52248i = (LinearLayout) aVar.internalFindViewById(R.id.ll_all_select);
        this.f52249j = (TextView) aVar.internalFindViewById(R.id.tv_show_nodata);
        this.f52250k = (RelativeLayout) aVar.internalFindViewById(R.id.rl_showtitle_bc);
        this.f52251l = (TextView) aVar.internalFindViewById(R.id.tv_showtitle_bc);
        this.f52252m = (LinearLayout) aVar.internalFindViewById(R.id.ll_lookdetail);
        LinearLayout linearLayout = this.f52248i;
        if (linearLayout != null) {
            linearLayout.setOnClickListener(new k());
        }
        Button button = this.f52245f;
        if (button != null) {
            button.setOnClickListener(new s());
        }
        afterViews();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.X.a(this);
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.Z.put(cls, t4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.MyArchiveFragment
    public void r0() {
        org.androidannotations.api.b.e("", new y(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.MyArchiveFragment
    public void s0() {
        org.androidannotations.api.b.e("", new x(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.MyArchiveFragment
    public void showMessage(String str) {
        org.androidannotations.api.b.e("", new l(str), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.MyArchiveFragment
    public void u0(List<CloudListDataBean> list) {
        org.androidannotations.api.b.e("", new u(list), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.MyArchiveFragment
    public void updateUi(List<CloudListDataBean> list) {
        org.androidannotations.api.b.e("", new w(list), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.MyArchiveFragment
    public void z0(List<CloudListDataBean> list, boolean z4, MyArchiveFragment.w wVar) {
        org.androidannotations.api.a.l(new o("", 0L, "", list, z4, wVar));
    }
}
