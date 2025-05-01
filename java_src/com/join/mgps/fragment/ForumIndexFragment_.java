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
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.ForumIndexHeaderView;
import com.join.mgps.customview.ForumLoadingView;
import com.join.mgps.customview.SlidingTabLayout4;
import com.join.mgps.dto.ForumBannerBean;
import com.join.mgps.dto.ForumData;
import com.join.mgps.dto.RecommenGroupClassify;
import com.join.mgps.dto.RecommendLabelTag;
import com.join.mgps.pref.PrefDef_;
import com.join.mgps.ptr.PtrClassicFrameLayout;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.androidannotations.api.a;
import ru.noties.scrollable.ScrollableLayout;
/* loaded from: classes3.dex */
public final class ForumIndexFragment_ extends ForumIndexFragment implements y3.a, a4.a, a4.b {
    private View Y;
    private final a4.c X = new a4.c();
    private final Map<Class<?>, Object> Z = new HashMap();

    /* renamed from: p0  reason: collision with root package name */
    private final IntentFilter f51365p0 = new IntentFilter();

    /* renamed from: p1  reason: collision with root package name */
    private final BroadcastReceiver f51366p1 = new k();

    /* renamed from: v1  reason: collision with root package name */
    private final IntentFilter f51367v1 = new IntentFilter();
    private final BroadcastReceiver A1 = new u();

    /* loaded from: classes3.dex */
    class a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ForumData.HomepageRecommendGroup f51368b;

        a(ForumData.HomepageRecommendGroup homepageRecommendGroup) {
            this.f51368b = homepageRecommendGroup;
        }

        @Override // java.lang.Runnable
        public void run() {
            ForumIndexFragment_.super.F0(this.f51368b);
        }
    }

    /* loaded from: classes3.dex */
    class a0 implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f51370b;

        a0(List list) {
            this.f51370b = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            ForumIndexFragment_.super.y0(this.f51370b);
        }
    }

    /* loaded from: classes3.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ForumIndexFragment_.super.p0();
        }
    }

    /* loaded from: classes3.dex */
    class b0 implements Runnable {
        b0() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ForumIndexFragment_.super.I0();
        }
    }

    /* loaded from: classes3.dex */
    class c implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ForumBannerBean.ForumBannerDataBannerBean f51374b;

        c(ForumBannerBean.ForumBannerDataBannerBean forumBannerDataBannerBean) {
            this.f51374b = forumBannerDataBannerBean;
        }

        @Override // java.lang.Runnable
        public void run() {
            ForumIndexFragment_.super.D0(this.f51374b);
        }
    }

    /* loaded from: classes3.dex */
    public static class c0 extends org.androidannotations.api.builder.d<c0, ForumIndexFragment> {
        @Override // org.androidannotations.api.builder.d
        /* renamed from: a */
        public ForumIndexFragment build() {
            ForumIndexFragment_ forumIndexFragment_ = new ForumIndexFragment_();
            forumIndexFragment_.setArguments(this.args);
            return forumIndexFragment_;
        }
    }

    /* loaded from: classes3.dex */
    class d implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f51376b;

        d(int i4) {
            this.f51376b = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            ForumIndexFragment_.super.e0(this.f51376b);
        }
    }

    /* loaded from: classes3.dex */
    class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ForumIndexFragment_.super.z0();
        }
    }

    /* loaded from: classes3.dex */
    class f implements Runnable {
        f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ForumIndexFragment_.super.L0();
        }
    }

    /* loaded from: classes3.dex */
    class g implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f51380b;

        g(String str) {
            this.f51380b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            ForumIndexFragment_.super.T(this.f51380b);
        }
    }

    /* loaded from: classes3.dex */
    class h implements Runnable {
        h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ForumIndexFragment_.super.E0();
        }
    }

    /* loaded from: classes3.dex */
    class i implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f51383b;

        i(int i4) {
            this.f51383b = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            ForumIndexFragment_.super.R0(this.f51383b);
        }
    }

    /* loaded from: classes3.dex */
    class j implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f51385b;

        j(int i4) {
            this.f51385b = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            ForumIndexFragment_.super.P0(this.f51385b);
        }
    }

    /* loaded from: classes3.dex */
    class k extends BroadcastReceiver {
        k() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            ForumIndexFragment_.this.V();
        }
    }

    /* loaded from: classes3.dex */
    class l implements Runnable {
        l() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ForumIndexFragment_.super.S0();
        }
    }

    /* loaded from: classes3.dex */
    class m implements Runnable {
        m() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ForumIndexFragment_.super.Q0();
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
                ForumIndexFragment_.super.u0();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes3.dex */
    class o extends a.c {
        o(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                ForumIndexFragment_.super.n0();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes3.dex */
    class p extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f51392b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(String str, long j4, String str2, String str3) {
            super(str, j4, str2);
            this.f51392b = str3;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                ForumIndexFragment_.super.B0(this.f51392b);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes3.dex */
    class q extends a.c {
        q(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                ForumIndexFragment_.super.l0();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes3.dex */
    class r extends a.c {
        r(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                ForumIndexFragment_.super.j0();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes3.dex */
    class s extends a.c {
        s(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                ForumIndexFragment_.super.O0();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes3.dex */
    class t extends a.c {
        t(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                ForumIndexFragment_.super.f0();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes3.dex */
    class u extends BroadcastReceiver {
        u() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            ForumIndexFragment_.this.c0(intent);
        }
    }

    /* loaded from: classes3.dex */
    class v implements View.OnClickListener {
        v() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ForumIndexFragment_.this.W();
        }
    }

    /* loaded from: classes3.dex */
    class w implements View.OnClickListener {
        w() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ForumIndexFragment_.this.d0();
        }
    }

    /* loaded from: classes3.dex */
    class x implements Runnable {
        x() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ForumIndexFragment_.super.M0();
        }
    }

    /* loaded from: classes3.dex */
    class y implements Runnable {
        y() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ForumIndexFragment_.super.G0();
        }
    }

    /* loaded from: classes3.dex */
    class z implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f51403b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ List f51404c;

        z(boolean z4, List list) {
            this.f51403b = z4;
            this.f51404c = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            ForumIndexFragment_.super.H0(this.f51403b, this.f51404c);
        }
    }

    private void init_(Bundle bundle) {
        this.M = new PrefDef_(getActivity());
        a4.c.b(this);
        this.f51365p0.addAction(o1.a.B);
        this.f51367v1.addAction(o1.a.f72036y);
    }

    public static c0 r1() {
        return new c0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.ForumIndexFragment
    public void B0(String str) {
        org.androidannotations.api.a.l(new p("", 0L, "", str));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.ForumIndexFragment
    public void D0(ForumBannerBean.ForumBannerDataBannerBean forumBannerDataBannerBean) {
        org.androidannotations.api.b.e("", new c(forumBannerDataBannerBean), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.ForumIndexFragment
    public void E0() {
        org.androidannotations.api.b.e("", new h(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.ForumIndexFragment
    public void F0(ForumData.HomepageRecommendGroup homepageRecommendGroup) {
        org.androidannotations.api.b.e("", new a(homepageRecommendGroup), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.ForumIndexFragment
    public void G0() {
        org.androidannotations.api.b.e("", new y(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.ForumIndexFragment
    public void H0(boolean z4, List<RecommendLabelTag> list) {
        org.androidannotations.api.b.e("", new z(z4, list), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.ForumIndexFragment
    public void I0() {
        org.androidannotations.api.b.e("", new b0(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.ForumIndexFragment
    public void L0() {
        org.androidannotations.api.b.e("", new f(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.ForumIndexFragment
    public void M0() {
        org.androidannotations.api.b.e("", new x(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.ForumIndexFragment
    public void O0() {
        org.androidannotations.api.a.l(new s("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.ForumIndexFragment
    public void P0(int i4) {
        org.androidannotations.api.b.e("", new j(i4), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.ForumIndexFragment
    public void Q0() {
        org.androidannotations.api.b.e("", new m(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.ForumIndexFragment
    public void R0(int i4) {
        org.androidannotations.api.b.e("", new i(i4), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.ForumIndexFragment
    public void S0() {
        org.androidannotations.api.b.e("", new l(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.ForumIndexFragment, com.join.mgps.fragment.BaseFragment
    public void T(String str) {
        org.androidannotations.api.b.e("", new g(str), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.ForumIndexFragment
    public void e0(int i4) {
        org.androidannotations.api.b.e("", new d(i4), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.ForumIndexFragment
    public void f0() {
        org.androidannotations.api.a.l(new t("", 0L, ""));
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.Z.get(cls);
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        View view = this.Y;
        if (view == null) {
            return null;
        }
        return (T) view.findViewById(i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.ForumIndexFragment
    public void j0() {
        org.androidannotations.api.a.l(new r("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.ForumIndexFragment
    public void l0() {
        org.androidannotations.api.a.l(new q("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.ForumIndexFragment
    public void n0() {
        org.androidannotations.api.a.l(new o("", 0L, ""));
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.X);
        init_(bundle);
        super.onCreate(bundle);
        getActivity().registerReceiver(this.f51366p1, this.f51365p0);
        getActivity().registerReceiver(this.A1, this.f51367v1);
        a4.c.c(c5);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        this.Y = onCreateView;
        if (onCreateView == null) {
            this.Y = layoutInflater.inflate(R.layout.mg_forum_index_fragment, viewGroup, false);
        }
        return this.Y;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        getActivity().unregisterReceiver(this.f51366p1);
        getActivity().unregisterReceiver(this.A1);
        super.onDestroy();
    }

    @Override // com.join.mgps.fragment.ForumIndexFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.Y = null;
        this.f51330c = null;
        this.f51331d = null;
        this.f51332e = null;
        this.f51333f = null;
        this.f51334g = null;
        this.f51335h = null;
        this.f51336i = null;
        this.f51337j = null;
        this.f51338k = null;
        this.f51339l = null;
        this.f51340m = null;
        this.A = null;
        this.C = null;
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f51330c = aVar.internalFindViewById(R.id.actionPlaceHolder);
        this.f51331d = (ImageView) aVar.internalFindViewById(R.id.back_image);
        this.f51332e = aVar.internalFindViewById(R.id.aboutWF);
        this.f51333f = (TextView) aVar.internalFindViewById(R.id.forum_title_center);
        this.f51334g = (ForumLoadingView) aVar.internalFindViewById(R.id.loadingView);
        this.f51335h = (ScrollableLayout) aVar.internalFindViewById(R.id.scrollableLayout);
        this.f51336i = (ForumIndexHeaderView) aVar.internalFindViewById(R.id.headerView);
        this.f51337j = (SlidingTabLayout4) aVar.internalFindViewById(R.id.tabsLayout);
        this.f51338k = (ViewPager) aVar.internalFindViewById(R.id.viewPager);
        this.f51339l = (PtrClassicFrameLayout) aVar.internalFindViewById(R.id.mPtrFrame);
        this.f51340m = (RelativeLayout) aVar.internalFindViewById(R.id.search);
        this.A = (RelativeLayout) aVar.internalFindViewById(R.id.layout_others);
        this.C = (TextView) aVar.internalFindViewById(R.id.bigCenterRound);
        View view = this.f51332e;
        if (view != null) {
            view.setOnClickListener(new v());
        }
        ImageView imageView = this.f51331d;
        if (imageView != null) {
            imageView.setOnClickListener(new w());
        }
        afterViews();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.X.a(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.ForumIndexFragment
    public void p0() {
        org.androidannotations.api.b.e("", new b(), 0L);
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.Z.put(cls, t4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.ForumIndexFragment
    public void u0() {
        org.androidannotations.api.a.l(new n("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.ForumIndexFragment
    public void y0(List<RecommenGroupClassify> list) {
        org.androidannotations.api.b.e("", new a0(list), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.ForumIndexFragment
    public void z0() {
        org.androidannotations.api.b.e("", new e(), 0L);
    }
}
