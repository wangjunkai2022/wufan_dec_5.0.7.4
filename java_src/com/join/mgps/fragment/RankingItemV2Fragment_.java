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
import android.widget.RelativeLayout;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.XListView2;
import com.join.mgps.dto.CollectionBeanSub;
import com.join.mgps.dto.PAPAHomeBeanV7;
import com.join.mgps.ptr.PtrClassicFrameLayout;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.androidannotations.api.a;
/* loaded from: classes3.dex */
public final class RankingItemV2Fragment_ extends RankingItemV2Fragment implements y3.a, a4.a, a4.b {
    private View I;
    private final a4.c H = new a4.c();
    private final Map<Class<?>, Object> J = new HashMap();
    private final IntentFilter K = new IntentFilter();
    private final BroadcastReceiver L = new f();

    /* loaded from: classes3.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            RankingItemV2Fragment_.super.X();
        }
    }

    /* loaded from: classes3.dex */
    class b implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f52716b;

        b(String str) {
            this.f52716b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            RankingItemV2Fragment_.super.showToast(this.f52716b);
        }
    }

    /* loaded from: classes3.dex */
    class c implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PAPAHomeBeanV7.HomeBeanDTO f52718b;

        c(PAPAHomeBeanV7.HomeBeanDTO homeBeanDTO) {
            this.f52718b = homeBeanDTO;
        }

        @Override // java.lang.Runnable
        public void run() {
            RankingItemV2Fragment_.super.q0(this.f52718b);
        }
    }

    /* loaded from: classes3.dex */
    class d extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f52720b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f52721c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(String str, long j4, String str2, String str3, String str4) {
            super(str, j4, str2);
            this.f52720b = str3;
            this.f52721c = str4;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                RankingItemV2Fragment_.super.c0(this.f52720b, this.f52721c);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes3.dex */
    class e extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f52723b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ PAPAHomeBeanV7.HomeBeanDTO f52724c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(String str, long j4, String str2, String str3, PAPAHomeBeanV7.HomeBeanDTO homeBeanDTO) {
            super(str, j4, str2);
            this.f52723b = str3;
            this.f52724c = homeBeanDTO;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                RankingItemV2Fragment_.super.b0(this.f52723b, this.f52724c);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes3.dex */
    class f extends BroadcastReceiver {

        /* renamed from: b  reason: collision with root package name */
        public static final String f52726b = "gameData";

        f() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            RankingItemV2Fragment_.this.l0((CollectionBeanSub) (intent.getExtras() != null ? intent.getExtras() : new Bundle()).getSerializable("gameData"));
        }
    }

    /* loaded from: classes3.dex */
    class g implements View.OnClickListener {
        g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            RankingItemV2Fragment_.this.relodingimag();
        }
    }

    /* loaded from: classes3.dex */
    class h implements View.OnClickListener {
        h() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            RankingItemV2Fragment_.this.k0();
        }
    }

    /* loaded from: classes3.dex */
    class i implements View.OnClickListener {
        i() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            RankingItemV2Fragment_.this.g0();
        }
    }

    /* loaded from: classes3.dex */
    class j implements View.OnClickListener {
        j() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            RankingItemV2Fragment_.this.s0();
        }
    }

    /* loaded from: classes3.dex */
    class k implements View.OnClickListener {
        k() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            RankingItemV2Fragment_.this.setNetwork();
        }
    }

    /* loaded from: classes3.dex */
    class l implements Runnable {
        l() {
        }

        @Override // java.lang.Runnable
        public void run() {
            RankingItemV2Fragment_.super.showLoding();
        }
    }

    /* loaded from: classes3.dex */
    class m implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f52734b;

        m(boolean z4) {
            this.f52734b = z4;
        }

        @Override // java.lang.Runnable
        public void run() {
            RankingItemV2Fragment_.super.t0(this.f52734b);
        }
    }

    /* loaded from: classes3.dex */
    class n implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f52736b;

        n(List list) {
            this.f52736b = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            RankingItemV2Fragment_.super.showMain(this.f52736b);
        }
    }

    /* loaded from: classes3.dex */
    public static class o extends org.androidannotations.api.builder.d<o, RankingItemV2Fragment> {
        @Override // org.androidannotations.api.builder.d
        /* renamed from: a */
        public RankingItemV2Fragment build() {
            RankingItemV2Fragment_ rankingItemV2Fragment_ = new RankingItemV2Fragment_();
            rankingItemV2Fragment_.setArguments(this.args);
            return rankingItemV2Fragment_;
        }
    }

    public static o G0() {
        return new o();
    }

    private void init_(Bundle bundle) {
        a4.c.b(this);
        this.K.addAction(o1.a.I);
        this.K.addAction(o1.a.G);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.RankingItemV2Fragment
    public void X() {
        org.androidannotations.api.b.e("", new a(), 400L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.RankingItemV2Fragment
    public void b0(String str, PAPAHomeBeanV7.HomeBeanDTO homeBeanDTO) {
        org.androidannotations.api.a.l(new e("", 0L, "", str, homeBeanDTO));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.RankingItemV2Fragment
    public void c0(String str, String str2) {
        org.androidannotations.api.a.l(new d("", 0L, "", str, str2));
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.J.get(cls);
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        View view = this.I;
        if (view == null) {
            return null;
        }
        return (T) view.findViewById(i4);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.H);
        init_(bundle);
        super.onCreate(bundle);
        getActivity().registerReceiver(this.L, this.K);
        a4.c.c(c5);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        this.I = onCreateView;
        if (onCreateView == null) {
            this.I = layoutInflater.inflate(R.layout.fragment_rank_item, viewGroup, false);
        }
        return this.I;
    }

    @Override // com.join.mgps.fragment.RankingItemV2Fragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        getActivity().unregisterReceiver(this.L);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.I = null;
        this.f52692e = null;
        this.f52693f = null;
        this.f52694g = null;
        this.f52695h = null;
        this.f52696i = null;
        this.f52697j = null;
        this.f52698k = null;
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f52692e = (RelativeLayout) aVar.internalFindViewById(R.id.rootRl);
        this.f52693f = (XListView2) aVar.internalFindViewById(R.id.classifyListView);
        this.f52694g = (PtrClassicFrameLayout) aVar.internalFindViewById(R.id.mPtrFrame);
        this.f52695h = (LinearLayout) aVar.internalFindViewById(R.id.loding_layout);
        this.f52696i = (LinearLayout) aVar.internalFindViewById(R.id.loding_faile);
        this.f52697j = (LinearLayout) aVar.internalFindViewById(R.id.loading_none);
        this.f52698k = (ImageView) aVar.internalFindViewById(R.id.relodingimag);
        View internalFindViewById = aVar.internalFindViewById(R.id.noneReloadImage);
        View internalFindViewById2 = aVar.internalFindViewById(R.id.mg_loading);
        View internalFindViewById3 = aVar.internalFindViewById(R.id.setAll);
        View internalFindViewById4 = aVar.internalFindViewById(R.id.setNetwork);
        ImageView imageView = this.f52698k;
        if (imageView != null) {
            imageView.setOnClickListener(new g());
        }
        if (internalFindViewById != null) {
            internalFindViewById.setOnClickListener(new h());
        }
        if (internalFindViewById2 != null) {
            internalFindViewById2.setOnClickListener(new i());
        }
        if (internalFindViewById3 != null) {
            internalFindViewById3.setOnClickListener(new j());
        }
        if (internalFindViewById4 != null) {
            internalFindViewById4.setOnClickListener(new k());
        }
        afterViews();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.H.a(this);
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.J.put(cls, t4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.RankingItemV2Fragment
    public void q0(PAPAHomeBeanV7.HomeBeanDTO homeBeanDTO) {
        org.androidannotations.api.b.e("", new c(homeBeanDTO), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.RankingItemV2Fragment
    public void showLoding() {
        org.androidannotations.api.b.e("", new l(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.RankingItemV2Fragment
    public void showMain(List<PAPAHomeBeanV7.HomeBeanDTO> list) {
        org.androidannotations.api.b.e("", new n(list), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.RankingItemV2Fragment
    public void showToast(String str) {
        org.androidannotations.api.b.e("", new b(str), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.RankingItemV2Fragment
    public void t0(boolean z4) {
        org.androidannotations.api.b.e("", new m(z4), 0L);
    }
}
