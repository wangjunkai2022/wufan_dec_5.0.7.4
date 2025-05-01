package com.join.mgps.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.XListView2;
import com.join.mgps.dto.GiftPackageDataInfoBean;
import com.join.mgps.dto.GiftPackageDataOperationBean;
import com.join.mgps.ptr.PtrClassicFrameLayout;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.androidannotations.api.a;
/* loaded from: classes3.dex */
public final class GameOlGiftPackageFragment_ extends GameOlGiftPackageFragment implements y3.a, a4.a, a4.b {
    private View B;
    private final a4.c A = new a4.c();
    private final Map<Class<?>, Object> C = new HashMap();

    /* loaded from: classes3.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GameOlGiftPackageFragment_.super.r0();
        }
    }

    /* loaded from: classes3.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GameOlGiftPackageFragment_.super.n0();
        }
    }

    /* loaded from: classes3.dex */
    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GameOlGiftPackageFragment_.super.p0();
        }
    }

    /* loaded from: classes3.dex */
    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GameOlGiftPackageFragment_.super.q0();
        }
    }

    /* loaded from: classes3.dex */
    class e extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ GiftPackageDataInfoBean f51866b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f51867c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(String str, long j4, String str2, GiftPackageDataInfoBean giftPackageDataInfoBean, int i4) {
            super(str, j4, str2);
            this.f51866b = giftPackageDataInfoBean;
            this.f51867c = i4;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                GameOlGiftPackageFragment_.super.i0(this.f51866b, this.f51867c);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes3.dex */
    class f extends a.c {
        f(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                GameOlGiftPackageFragment_.super.j0();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes3.dex */
    class g implements View.OnClickListener {
        g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GameOlGiftPackageFragment_.this.relodingimag();
        }
    }

    /* loaded from: classes3.dex */
    class h implements View.OnClickListener {
        h() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GameOlGiftPackageFragment_.this.m0();
        }
    }

    /* loaded from: classes3.dex */
    class i implements View.OnClickListener {
        i() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GameOlGiftPackageFragment_.this.setNetwork();
        }
    }

    /* loaded from: classes3.dex */
    class j implements Runnable {
        j() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GameOlGiftPackageFragment_.super.l0();
        }
    }

    /* loaded from: classes3.dex */
    class k implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f51874b;

        k(String str) {
            this.f51874b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            GameOlGiftPackageFragment_.super.showToast(this.f51874b);
        }
    }

    /* loaded from: classes3.dex */
    class l implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ GiftPackageDataOperationBean f51876b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ DownloadTask f51877c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f51878d;

        l(GiftPackageDataOperationBean giftPackageDataOperationBean, DownloadTask downloadTask, int i4) {
            this.f51876b = giftPackageDataOperationBean;
            this.f51877c = downloadTask;
            this.f51878d = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            GameOlGiftPackageFragment_.super.o0(this.f51876b, this.f51877c, this.f51878d);
        }
    }

    /* loaded from: classes3.dex */
    class m implements Runnable {
        m() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GameOlGiftPackageFragment_.super.showLoding();
        }
    }

    /* loaded from: classes3.dex */
    class n implements Runnable {
        n() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GameOlGiftPackageFragment_.super.showLodingFailed();
        }
    }

    /* loaded from: classes3.dex */
    class o implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f51882b;

        o(List list) {
            this.f51882b = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            GameOlGiftPackageFragment_.super.showMain(this.f51882b);
        }
    }

    /* loaded from: classes3.dex */
    public static class p extends org.androidannotations.api.builder.d<p, GameOlGiftPackageFragment> {
        @Override // org.androidannotations.api.builder.d
        /* renamed from: a */
        public GameOlGiftPackageFragment build() {
            GameOlGiftPackageFragment_ gameOlGiftPackageFragment_ = new GameOlGiftPackageFragment_();
            gameOlGiftPackageFragment_.setArguments(this.args);
            return gameOlGiftPackageFragment_;
        }
    }

    public static p E0() {
        return new p();
    }

    private void init_(Bundle bundle) {
        a4.c.b(this);
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.C.get(cls);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.GameOlGiftPackageFragment
    public void i0(GiftPackageDataInfoBean giftPackageDataInfoBean, int i4) {
        org.androidannotations.api.a.l(new e("", 0L, "", giftPackageDataInfoBean, i4));
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        View view = this.B;
        if (view == null) {
            return null;
        }
        return (T) view.findViewById(i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.GameOlGiftPackageFragment
    public void j0() {
        org.androidannotations.api.a.l(new f("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.GameOlGiftPackageFragment
    public void l0() {
        org.androidannotations.api.b.e("", new j(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.GameOlGiftPackageFragment
    public void n0() {
        org.androidannotations.api.b.e("", new b(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.GameOlGiftPackageFragment
    public void o0(GiftPackageDataOperationBean giftPackageDataOperationBean, DownloadTask downloadTask, int i4) {
        org.androidannotations.api.b.e("", new l(giftPackageDataOperationBean, downloadTask, i4), 0L);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.A);
        init_(bundle);
        super.onCreate(bundle);
        a4.c.c(c5);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        this.B = onCreateView;
        if (onCreateView == null) {
            this.B = layoutInflater.inflate(R.layout.game_online_first_layout, viewGroup, false);
        }
        return this.B;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.B = null;
        this.f51827b = null;
        this.f51828c = null;
        this.f51829d = null;
        this.f51830e = null;
        this.f51831f = null;
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f51827b = (PtrClassicFrameLayout) aVar.internalFindViewById(R.id.mPtrFrame);
        this.f51828c = (XListView2) aVar.internalFindViewById(R.id.rankListView);
        this.f51829d = (LinearLayout) aVar.internalFindViewById(R.id.loding_layout);
        this.f51830e = (LinearLayout) aVar.internalFindViewById(R.id.loding_faile);
        this.f51831f = (ImageView) aVar.internalFindViewById(R.id.relodingimag);
        View internalFindViewById = aVar.internalFindViewById(R.id.mg_loading);
        View internalFindViewById2 = aVar.internalFindViewById(R.id.setNetwork);
        ImageView imageView = this.f51831f;
        if (imageView != null) {
            imageView.setOnClickListener(new g());
        }
        if (internalFindViewById != null) {
            internalFindViewById.setOnClickListener(new h());
        }
        if (internalFindViewById2 != null) {
            internalFindViewById2.setOnClickListener(new i());
        }
        d0();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.A.a(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.GameOlGiftPackageFragment
    public void p0() {
        org.androidannotations.api.b.e("", new c(), 0L);
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.C.put(cls, t4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.GameOlGiftPackageFragment
    public void q0() {
        org.androidannotations.api.b.e("", new d(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.GameOlGiftPackageFragment
    public void r0() {
        org.androidannotations.api.b.e("", new a(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.GameOlGiftPackageFragment
    public void showLoding() {
        org.androidannotations.api.b.e("", new m(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.GameOlGiftPackageFragment
    public void showLodingFailed() {
        org.androidannotations.api.b.e("", new n(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.GameOlGiftPackageFragment
    public void showMain(List<v1.a<GiftPackageDataInfoBean>> list) {
        org.androidannotations.api.b.e("", new o(list), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.GameOlGiftPackageFragment
    public void showToast(String str) {
        org.androidannotations.api.b.e("", new k(str), 0L);
    }
}
