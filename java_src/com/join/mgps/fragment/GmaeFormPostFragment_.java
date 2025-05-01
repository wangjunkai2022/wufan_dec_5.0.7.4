package com.join.mgps.fragment;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.android.app.component.video.MyVideoView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.ForumLoadingView;
import com.join.mgps.customview.XListView2;
import com.join.mgps.dto.CollectionBeanSub;
import com.join.mgps.dto.DetailResultBean;
import com.join.mgps.dto.ForumData;
import com.join.mgps.dto.ResultMainBean;
import com.join.mgps.ptr.PtrClassicFrameLayout;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.androidannotations.api.a;
/* loaded from: classes3.dex */
public final class GmaeFormPostFragment_ extends GmaeFormPostFragment implements y3.a, a4.a, a4.b {
    private View O1;
    private final a4.c N1 = new a4.c();
    private final Map<Class<?>, Object> P1 = new HashMap();
    private final IntentFilter Q1 = new IntentFilter();
    private final BroadcastReceiver R1 = new k();

    /* loaded from: classes3.dex */
    class a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f52097b;

        a(String str) {
            this.f52097b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            GmaeFormPostFragment_.super.showToast(this.f52097b);
        }
    }

    /* loaded from: classes3.dex */
    public static class a0 extends org.androidannotations.api.builder.d<a0, GmaeFormPostFragment> {
        @Override // org.androidannotations.api.builder.d
        /* renamed from: a */
        public GmaeFormPostFragment build() {
            GmaeFormPostFragment_ gmaeFormPostFragment_ = new GmaeFormPostFragment_();
            gmaeFormPostFragment_.setArguments(this.args);
            return gmaeFormPostFragment_;
        }
    }

    /* loaded from: classes3.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GmaeFormPostFragment_.super.k1();
        }
    }

    /* loaded from: classes3.dex */
    class c implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AbsListView f52100b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f52101c;

        c(AbsListView absListView, int i4) {
            this.f52100b = absListView;
            this.f52101c = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            GmaeFormPostFragment_.super.A1(this.f52100b, this.f52101c);
        }
    }

    /* loaded from: classes3.dex */
    class d implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AbsListView f52103b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f52104c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f52105d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f52106e;

        d(AbsListView absListView, int i4, int i5, int i6) {
            this.f52103b = absListView;
            this.f52104c = i4;
            this.f52105d = i5;
            this.f52106e = i6;
        }

        @Override // java.lang.Runnable
        public void run() {
            GmaeFormPostFragment_.super.z1(this.f52103b, this.f52104c, this.f52105d, this.f52106e);
        }
    }

    /* loaded from: classes3.dex */
    class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GmaeFormPostFragment_.super.j1();
        }
    }

    /* loaded from: classes3.dex */
    class f implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f52109b;

        f(String str) {
            this.f52109b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            GmaeFormPostFragment_.super.showMessage(this.f52109b);
        }
    }

    /* loaded from: classes3.dex */
    class g implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DownloadTask f52111b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f52112c;

        g(DownloadTask downloadTask, int i4) {
            this.f52111b = downloadTask;
            this.f52112c = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            GmaeFormPostFragment_.super.v1(this.f52111b, this.f52112c);
        }
    }

    /* loaded from: classes3.dex */
    class h implements Runnable {
        h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GmaeFormPostFragment_.super.updateDownloadView();
        }
    }

    /* loaded from: classes3.dex */
    class i implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DetailResultBean f52115b;

        i(DetailResultBean detailResultBean) {
            this.f52115b = detailResultBean;
        }

        @Override // java.lang.Runnable
        public void run() {
            GmaeFormPostFragment_.super.o1(this.f52115b);
        }
    }

    /* loaded from: classes3.dex */
    class j extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f52117b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f52118c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(String str, long j4, String str2, int i4, String str3) {
            super(str, j4, str2);
            this.f52117b = i4;
            this.f52118c = str3;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                GmaeFormPostFragment_.super.i0(this.f52117b, this.f52118c);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes3.dex */
    class k extends BroadcastReceiver {

        /* renamed from: b  reason: collision with root package name */
        public static final String f52120b = "gameData";

        k() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            GmaeFormPostFragment_.this.J0((CollectionBeanSub) (intent.getExtras() != null ? intent.getExtras() : new Bundle()).getSerializable("gameData"));
        }
    }

    /* loaded from: classes3.dex */
    class l extends a.c {
        l(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                GmaeFormPostFragment_.super.y0();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes3.dex */
    class m extends a.c {
        m(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                GmaeFormPostFragment_.super.z0();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes3.dex */
    class n extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f52124b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(String str, long j4, String str2, int i4) {
            super(str, j4, str2);
            this.f52124b = i4;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                GmaeFormPostFragment_.super.A0(this.f52124b);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes3.dex */
    class o extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f52126b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(String str, long j4, String str2, int i4) {
            super(str, j4, str2);
            this.f52126b = i4;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                GmaeFormPostFragment_.super.N0(this.f52126b);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes3.dex */
    class p extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f52128b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f52129c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(String str, long j4, String str2, Context context, int i4) {
            super(str, j4, str2);
            this.f52128b = context;
            this.f52129c = i4;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                GmaeFormPostFragment_.super.m0(this.f52128b, this.f52129c);
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
                GmaeFormPostFragment_.super.getDownloadTaskInfo();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes3.dex */
    class r extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f52132b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        r(String str, long j4, String str2, String str3) {
            super(str, j4, str2);
            this.f52132b = str3;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                GmaeFormPostFragment_.super.o0(this.f52132b);
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
            GmaeFormPostFragment_.this.g0();
        }
    }

    /* loaded from: classes3.dex */
    class t implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ResultMainBean f52135b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f52136c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f52137d;

        t(ResultMainBean resultMainBean, int i4, String str) {
            this.f52135b = resultMainBean;
            this.f52136c = i4;
            this.f52137d = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            GmaeFormPostFragment_.super.w1(this.f52135b, this.f52136c, this.f52137d);
        }
    }

    /* loaded from: classes3.dex */
    class u implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f52139b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f52140c;

        u(List list, int i4) {
            this.f52139b = list;
            this.f52140c = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            GmaeFormPostFragment_.super.P0(this.f52139b, this.f52140c);
        }
    }

    /* loaded from: classes3.dex */
    class v implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f52142b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f52143c;

        v(int i4, boolean z4) {
            this.f52142b = i4;
            this.f52143c = z4;
        }

        @Override // java.lang.Runnable
        public void run() {
            GmaeFormPostFragment_.super.E0(this.f52142b, this.f52143c);
        }
    }

    /* loaded from: classes3.dex */
    class w implements Runnable {
        w() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GmaeFormPostFragment_.super.q1();
        }
    }

    /* loaded from: classes3.dex */
    class x implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f52146b;

        x(int i4) {
            this.f52146b = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            GmaeFormPostFragment_.super.j0(this.f52146b);
        }
    }

    /* loaded from: classes3.dex */
    class y implements Runnable {
        y() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GmaeFormPostFragment_.super.C0();
        }
    }

    /* loaded from: classes3.dex */
    class z implements Runnable {
        z() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GmaeFormPostFragment_.super.h1();
        }
    }

    public static a0 Z1() {
        return new a0();
    }

    private void init_(Bundle bundle) {
        a4.c.b(this);
        this.Q1.addAction(o1.a.I);
        this.Q1.addAction(o1.a.G);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.GmaeFormPostFragment
    public void A0(int i4) {
        org.androidannotations.api.a.l(new n("", 0L, "", i4));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.GmaeFormPostFragment
    public void A1(AbsListView absListView, int i4) {
        org.androidannotations.api.b.e("", new c(absListView, i4), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.GmaeFormPostFragment
    public void C0() {
        org.androidannotations.api.b.e("", new y(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.GmaeFormPostFragment
    public void E0(int i4, boolean z4) {
        org.androidannotations.api.b.e("", new v(i4, z4), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.GmaeFormPostFragment
    public void N0(int i4) {
        org.androidannotations.api.a.l(new o("", 0L, "", i4));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.GmaeFormPostFragment
    public void P0(List<ForumData.ForumUserFavoritesData> list, int i4) {
        org.androidannotations.api.b.e("", new u(list, i4), 0L);
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.P1.get(cls);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.GmaeFormPostFragment
    public void getDownloadTaskInfo() {
        org.androidannotations.api.a.l(new q("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.GmaeFormPostFragment
    public void h1() {
        org.androidannotations.api.b.e("", new z(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.GmaeFormPostFragment
    public void i0(int i4, String str) {
        org.androidannotations.api.a.l(new j("", 0L, "", i4, str));
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        View view = this.O1;
        if (view == null) {
            return null;
        }
        return (T) view.findViewById(i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.GmaeFormPostFragment
    public void j0(int i4) {
        org.androidannotations.api.b.e("", new x(i4), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.GmaeFormPostFragment
    public void j1() {
        org.androidannotations.api.b.e("", new e(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.GmaeFormPostFragment
    public void k1() {
        org.androidannotations.api.b.e("", new b(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.GmaeFormPostFragment
    public void m0(Context context, int i4) {
        org.androidannotations.api.a.l(new p("", 0L, "", context, i4));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.GmaeFormPostFragment
    public void o0(String str) {
        org.androidannotations.api.a.l(new r("", 0L, "", str));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.GmaeFormPostFragment
    public void o1(DetailResultBean detailResultBean) {
        org.androidannotations.api.b.e("", new i(detailResultBean), 0L);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.N1);
        init_(bundle);
        super.onCreate(bundle);
        getActivity().registerReceiver(this.R1, this.Q1);
        a4.c.c(c5);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        this.O1 = onCreateView;
        if (onCreateView == null) {
            this.O1 = layoutInflater.inflate(R.layout.mg_forum_profile_favorites_activity, viewGroup, false);
        }
        return this.O1;
    }

    @Override // com.join.mgps.fragment.GmaeFormPostFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        getActivity().unregisterReceiver(this.R1);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.O1 = null;
        this.f52044b = null;
        this.f52045c = null;
        this.f52046d = null;
        this.f52047e = null;
        this.f52051i = null;
        this.f52052j = null;
        this.I = null;
        this.J = null;
        GmaeFormPostFragment.L1 = null;
        this.K = null;
        this.L = null;
        this.M = null;
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f52044b = (RelativeLayout) aVar.internalFindViewById(R.id.actionbarLayout);
        this.f52045c = (ImageView) aVar.internalFindViewById(R.id.back_image);
        this.f52046d = (TextView) aVar.internalFindViewById(R.id.layout_title);
        this.f52047e = (ForumLoadingView) aVar.internalFindViewById(R.id.loadingView);
        this.f52051i = (XListView2) aVar.internalFindViewById(R.id.forum_posts_list);
        this.f52052j = (PtrClassicFrameLayout) aVar.internalFindViewById(R.id.mPtrFrame);
        this.I = (FrameLayout) aVar.internalFindViewById(R.id.videoContainer);
        this.J = (RelativeLayout) aVar.internalFindViewById(R.id.videoLayout);
        GmaeFormPostFragment.L1 = (MyVideoView) aVar.internalFindViewById(R.id.video);
        this.K = (SimpleDraweeView) aVar.internalFindViewById(R.id.cover);
        this.L = (ImageView) aVar.internalFindViewById(R.id.play);
        this.M = (LinearLayout) aVar.internalFindViewById(R.id.loadingLayout);
        ImageView imageView = this.f52045c;
        if (imageView != null) {
            imageView.setOnClickListener(new s());
        }
        afterViews();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.N1.a(this);
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.P1.put(cls, t4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.GmaeFormPostFragment
    public void q1() {
        org.androidannotations.api.b.e("", new w(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.GmaeFormPostFragment
    public void showMessage(String str) {
        org.androidannotations.api.b.e("", new f(str), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.GmaeFormPostFragment
    public void showToast(String str) {
        org.androidannotations.api.b.e("", new a(str), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.GmaeFormPostFragment
    public void updateDownloadView() {
        org.androidannotations.api.b.e("", new h(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.GmaeFormPostFragment
    public void v1(DownloadTask downloadTask, int i4) {
        org.androidannotations.api.b.e("", new g(downloadTask, i4), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.GmaeFormPostFragment
    public void w1(ResultMainBean resultMainBean, int i4, String str) {
        org.androidannotations.api.b.e("", new t(resultMainBean, i4, str), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.GmaeFormPostFragment
    public void y0() {
        org.androidannotations.api.a.l(new l("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.GmaeFormPostFragment
    public void z0() {
        org.androidannotations.api.a.l(new m("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.GmaeFormPostFragment
    public void z1(AbsListView absListView, int i4, int i5, int i6) {
        org.androidannotations.api.b.e("", new d(absListView, i4, i5, i6), 0L);
    }
}
