package com.join.mgps.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.android.app.component.xrecyclerview.XQuickRecyclerView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.dto.CommonGameInfoBean;
import com.join.mgps.ptr.PtrClassicFrameLayout;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.androidannotations.api.a;
/* loaded from: classes3.dex */
public final class FindMiniGameFragment_ extends FindMiniGameFragment implements y3.a, a4.a, a4.b {

    /* renamed from: u  reason: collision with root package name */
    public static final String f51252u = "gameId";

    /* renamed from: s  reason: collision with root package name */
    private View f51254s;

    /* renamed from: r  reason: collision with root package name */
    private final a4.c f51253r = new a4.c();

    /* renamed from: t  reason: collision with root package name */
    private final Map<Class<?>, Object> f51255t = new HashMap();

    /* loaded from: classes3.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            FindMiniGameFragment_.super.c0();
        }
    }

    /* loaded from: classes3.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            FindMiniGameFragment_.super.showLodingFailed();
        }
    }

    /* loaded from: classes3.dex */
    class c extends a.c {
        c(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                FindMiniGameFragment_.super.i0();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes3.dex */
    class d extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f51259b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(String str, long j4, String str2, int i4) {
            super(str, j4, str2);
            this.f51259b = i4;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                FindMiniGameFragment_.super.b0(this.f51259b);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes3.dex */
    class e implements View.OnClickListener {
        e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            FindMiniGameFragment_.this.relodingimag();
        }
    }

    /* loaded from: classes3.dex */
    class f implements View.OnClickListener {
        f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            FindMiniGameFragment_.this.setNetwork();
        }
    }

    /* loaded from: classes3.dex */
    class g implements Runnable {
        g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            FindMiniGameFragment_.super.a0();
        }
    }

    /* loaded from: classes3.dex */
    class h implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DownloadTask f51264b;

        h(DownloadTask downloadTask) {
            this.f51264b = downloadTask;
        }

        @Override // java.lang.Runnable
        public void run() {
            FindMiniGameFragment_.super.d0(this.f51264b);
        }
    }

    /* loaded from: classes3.dex */
    class i implements Runnable {
        i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            FindMiniGameFragment_.super.W();
        }
    }

    /* loaded from: classes3.dex */
    class j implements Runnable {
        j() {
        }

        @Override // java.lang.Runnable
        public void run() {
            FindMiniGameFragment_.super.k0();
        }
    }

    /* loaded from: classes3.dex */
    class k implements Runnable {
        k() {
        }

        @Override // java.lang.Runnable
        public void run() {
            FindMiniGameFragment_.super.m0();
        }
    }

    /* loaded from: classes3.dex */
    class l implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f51269b;

        l(List list) {
            this.f51269b = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            FindMiniGameFragment_.super.l0(this.f51269b);
        }
    }

    /* loaded from: classes3.dex */
    class m implements Runnable {
        m() {
        }

        @Override // java.lang.Runnable
        public void run() {
            FindMiniGameFragment_.super.showLoding();
        }
    }

    /* loaded from: classes3.dex */
    public static class n extends org.androidannotations.api.builder.d<n, FindMiniGameFragment> {
        @Override // org.androidannotations.api.builder.d
        /* renamed from: a */
        public FindMiniGameFragment build() {
            FindMiniGameFragment_ findMiniGameFragment_ = new FindMiniGameFragment_();
            findMiniGameFragment_.setArguments(this.args);
            return findMiniGameFragment_;
        }

        public n b(String str) {
            this.args.putString("gameId", str);
            return this;
        }
    }

    public static n E0() {
        return new n();
    }

    private void F0() {
        Bundle arguments = getArguments();
        if (arguments == null || !arguments.containsKey("gameId")) {
            return;
        }
        this.f51233i = arguments.getString("gameId");
    }

    private void init_(Bundle bundle) {
        a4.c.b(this);
        F0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.FindMiniGameFragment
    public void W() {
        org.androidannotations.api.b.e("", new i(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.FindMiniGameFragment
    public void a0() {
        org.androidannotations.api.b.e("", new g(), 500L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.FindMiniGameFragment
    public void b0(int i4) {
        org.androidannotations.api.a.l(new d("", 0L, "", i4));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.FindMiniGameFragment
    public void c0() {
        org.androidannotations.api.b.e("", new a(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.FindMiniGameFragment
    public void d0(DownloadTask downloadTask) {
        org.androidannotations.api.b.e("", new h(downloadTask), 0L);
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.f51255t.get(cls);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.FindMiniGameFragment
    public void i0() {
        org.androidannotations.api.a.l(new c("", 0L, ""));
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        View view = this.f51254s;
        if (view == null) {
            return null;
        }
        return (T) view.findViewById(i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.FindMiniGameFragment
    public void k0() {
        org.androidannotations.api.b.e("", new j(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.FindMiniGameFragment
    public void l0(List<CommonGameInfoBean> list) {
        org.androidannotations.api.b.e("", new l(list), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.FindMiniGameFragment
    public void m0() {
        org.androidannotations.api.b.e("", new k(), 0L);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.f51253r);
        init_(bundle);
        super.onCreate(bundle);
        a4.c.c(c5);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        this.f51254s = onCreateView;
        if (onCreateView == null) {
            this.f51254s = layoutInflater.inflate(R.layout.fragment_find_mini_game, viewGroup, false);
        }
        return this.f51254s;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f51254s = null;
        this.f51226b = null;
        this.f51227c = null;
        this.f51230f = null;
        this.f51231g = null;
        this.f51232h = null;
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f51226b = (XQuickRecyclerView) aVar.internalFindViewById(R.id.xrv_list);
        this.f51227c = (LinearLayout) aVar.internalFindViewById(R.id.iv_nome);
        this.f51230f = (LinearLayout) aVar.internalFindViewById(R.id.loding_layout);
        this.f51231g = (PtrClassicFrameLayout) aVar.internalFindViewById(R.id.mPtrFrame);
        this.f51232h = (LinearLayout) aVar.internalFindViewById(R.id.loding_faile);
        View internalFindViewById = aVar.internalFindViewById(R.id.relodingimag);
        View internalFindViewById2 = aVar.internalFindViewById(R.id.setNetwork);
        if (internalFindViewById != null) {
            internalFindViewById.setOnClickListener(new e());
        }
        if (internalFindViewById2 != null) {
            internalFindViewById2.setOnClickListener(new f());
        }
        V();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f51253r.a(this);
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.f51255t.put(cls, t4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.FindMiniGameFragment
    public void showLoding() {
        org.androidannotations.api.b.e("", new m(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.FindMiniGameFragment
    public void showLodingFailed() {
        org.androidannotations.api.b.e("", new b(), 0L);
    }
}
