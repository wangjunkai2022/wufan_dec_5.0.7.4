package com.join.mgps.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
import java.util.HashMap;
import java.util.Map;
import org.androidannotations.api.a;
/* loaded from: classes3.dex */
public final class DiscoveryPaiweiDetailFragment_ extends DiscoveryPaiweiDetailFragment implements y3.a, a4.a, a4.b {
    public static final String A = "maxBattleCount";

    /* renamed from: z  reason: collision with root package name */
    public static final String f50969z = "gameId";

    /* renamed from: x  reason: collision with root package name */
    private View f50971x;

    /* renamed from: w  reason: collision with root package name */
    private final a4.c f50970w = new a4.c();

    /* renamed from: y  reason: collision with root package name */
    private final Map<Class<?>, Object> f50972y = new HashMap();

    /* loaded from: classes3.dex */
    class a extends a.c {
        a(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                DiscoveryPaiweiDetailFragment_.super.Z();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes3.dex */
    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DiscoveryPaiweiDetailFragment_.this.setNetwork();
        }
    }

    /* loaded from: classes3.dex */
    class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DiscoveryPaiweiDetailFragment_.this.relodingimag();
        }
    }

    /* loaded from: classes3.dex */
    class d implements View.OnClickListener {
        d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DiscoveryPaiweiDetailFragment_.this.W();
        }
    }

    /* loaded from: classes3.dex */
    class e implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f50977b;

        e(String str) {
            this.f50977b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            DiscoveryPaiweiDetailFragment_.super.b0(this.f50977b);
        }
    }

    /* loaded from: classes3.dex */
    class f implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f50979b;

        f(String str) {
            this.f50979b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            DiscoveryPaiweiDetailFragment_.super.showMessage(this.f50979b);
        }
    }

    /* loaded from: classes3.dex */
    class g implements Runnable {
        g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            DiscoveryPaiweiDetailFragment_.super.showLoding();
        }
    }

    /* loaded from: classes3.dex */
    class h implements Runnable {
        h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            DiscoveryPaiweiDetailFragment_.super.showLodingFailed();
        }
    }

    /* loaded from: classes3.dex */
    class i implements Runnable {
        i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            DiscoveryPaiweiDetailFragment_.super.showEmpty();
        }
    }

    /* loaded from: classes3.dex */
    class j implements Runnable {
        j() {
        }

        @Override // java.lang.Runnable
        public void run() {
            DiscoveryPaiweiDetailFragment_.super.showMain();
        }
    }

    /* loaded from: classes3.dex */
    public static class k extends org.androidannotations.api.builder.d<k, DiscoveryPaiweiDetailFragment> {
        @Override // org.androidannotations.api.builder.d
        /* renamed from: a */
        public DiscoveryPaiweiDetailFragment build() {
            DiscoveryPaiweiDetailFragment_ discoveryPaiweiDetailFragment_ = new DiscoveryPaiweiDetailFragment_();
            discoveryPaiweiDetailFragment_.setArguments(this.args);
            return discoveryPaiweiDetailFragment_;
        }

        public k b(String str) {
            this.args.putString("gameId", str);
            return this;
        }

        public k c(int i4) {
            this.args.putInt(DiscoveryPaiweiDetailFragment_.A, i4);
            return this;
        }
    }

    private void init_(Bundle bundle) {
        a4.c.b(this);
        k0();
    }

    public static k j0() {
        return new k();
    }

    private void k0() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            if (arguments.containsKey("gameId")) {
                this.f50958n = arguments.getString("gameId");
            }
            if (arguments.containsKey(A)) {
                this.f50959o = arguments.getInt(A);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.DiscoveryPaiweiDetailFragment
    public void Z() {
        org.androidannotations.api.a.l(new a("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.DiscoveryPaiweiDetailFragment
    public void b0(String str) {
        org.androidannotations.api.b.e("", new e(str), 0L);
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.f50972y.get(cls);
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        View view = this.f50971x;
        if (view == null) {
            return null;
        }
        return (T) view.findViewById(i4);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.f50970w);
        init_(bundle);
        super.onCreate(bundle);
        a4.c.c(c5);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        this.f50971x = onCreateView;
        if (onCreateView == null) {
            this.f50971x = layoutInflater.inflate(R.layout.layout_discovery_paiwei_viewpager, viewGroup, false);
        }
        return this.f50971x;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f50971x = null;
        this.f50946b = null;
        this.f50947c = null;
        this.f50948d = null;
        this.f50949e = null;
        this.f50950f = null;
        this.f50951g = null;
        this.f50952h = null;
        this.f50953i = null;
        this.f50954j = null;
        this.f50955k = null;
        this.f50956l = null;
        this.f50957m = null;
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f50946b = (SimpleDraweeView) aVar.internalFindViewById(R.id.imgCover);
        this.f50947c = (RecyclerView) aVar.internalFindViewById(R.id.rvRank);
        this.f50948d = (CardView) aVar.internalFindViewById(R.id.flMyRank);
        this.f50949e = (TextView) aVar.internalFindViewById(R.id.tvMyRank);
        this.f50950f = (TextView) aVar.internalFindViewById(R.id.tvChanllengeCount);
        this.f50951g = (Group) aVar.internalFindViewById(R.id.main);
        this.f50952h = (LinearLayout) aVar.internalFindViewById(R.id.loding_layout);
        this.f50953i = (LinearLayout) aVar.internalFindViewById(R.id.loding_faile);
        this.f50954j = (LinearLayout) aVar.internalFindViewById(R.id.ll_empty);
        this.f50955k = (TextView) aVar.internalFindViewById(R.id.tvStart);
        this.f50956l = (CardView) aVar.internalFindViewById(R.id.btnStart);
        this.f50957m = (TextView) aVar.internalFindViewById(R.id.editText5);
        View internalFindViewById = aVar.internalFindViewById(R.id.setNetwork);
        View internalFindViewById2 = aVar.internalFindViewById(R.id.relodingimag);
        if (internalFindViewById != null) {
            internalFindViewById.setOnClickListener(new b());
        }
        if (internalFindViewById2 != null) {
            internalFindViewById2.setOnClickListener(new c());
        }
        CardView cardView = this.f50956l;
        if (cardView != null) {
            cardView.setOnClickListener(new d());
        }
        V();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f50970w.a(this);
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.f50972y.put(cls, t4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.DiscoveryPaiweiDetailFragment
    public void showEmpty() {
        org.androidannotations.api.b.e("", new i(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.DiscoveryPaiweiDetailFragment
    public void showLoding() {
        org.androidannotations.api.b.e("", new g(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.DiscoveryPaiweiDetailFragment
    public void showLodingFailed() {
        org.androidannotations.api.b.e("", new h(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.DiscoveryPaiweiDetailFragment
    public void showMain() {
        org.androidannotations.api.b.e("", new j(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.DiscoveryPaiweiDetailFragment
    public void showMessage(String str) {
        org.androidannotations.api.b.e("", new f(str), 0L);
    }
}
