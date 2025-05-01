package com.join.mgps.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import app.mgsim.arena.ArenaResponse;
import com.join.android.app.component.xrecyclerview.XRecyclerView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.dto.BannerBean;
import com.join.mgps.dto.GameInfoBean;
import com.join.mgps.dto.GameListBannerBean;
import com.papa91.battle.protocol.GameRoom;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.androidannotations.api.a;
/* loaded from: classes3.dex */
public final class NewArenaMainFragment_ extends NewArenaMainFragment implements y3.a, a4.a, a4.b {
    private View C1;
    private final a4.c B1 = new a4.c();
    private final Map<Class<?>, Object> D1 = new HashMap();

    /* loaded from: classes3.dex */
    class a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ GameRoom f52463b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f52464c;

        a(GameRoom gameRoom, String str) {
            this.f52463b = gameRoom;
            this.f52464c = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            NewArenaMainFragment_.super.r0(this.f52463b, this.f52464c);
        }
    }

    /* loaded from: classes3.dex */
    class b implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ GameRoom f52466b;

        b(GameRoom gameRoom) {
            this.f52466b = gameRoom;
        }

        @Override // java.lang.Runnable
        public void run() {
            NewArenaMainFragment_.super.P0(this.f52466b);
        }
    }

    /* loaded from: classes3.dex */
    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            NewArenaMainFragment_.super.y0();
        }
    }

    /* loaded from: classes3.dex */
    class d implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ GameListBannerBean f52469b;

        d(GameListBannerBean gameListBannerBean) {
            this.f52469b = gameListBannerBean;
        }

        @Override // java.lang.Runnable
        public void run() {
            NewArenaMainFragment_.super.L0(this.f52469b);
        }
    }

    /* loaded from: classes3.dex */
    class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            NewArenaMainFragment_.super.z0();
        }
    }

    /* loaded from: classes3.dex */
    class f implements Runnable {
        f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            NewArenaMainFragment_.super.C0();
        }
    }

    /* loaded from: classes3.dex */
    class g implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f52473b;

        g(List list) {
            this.f52473b = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            NewArenaMainFragment_.super.J0(this.f52473b);
        }
    }

    /* loaded from: classes3.dex */
    class h implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f52475b;

        h(List list) {
            this.f52475b = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            NewArenaMainFragment_.super.K0(this.f52475b);
        }
    }

    /* loaded from: classes3.dex */
    class i implements Runnable {
        i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            NewArenaMainFragment_.super.showLoding();
        }
    }

    /* loaded from: classes3.dex */
    class j implements Runnable {
        j() {
        }

        @Override // java.lang.Runnable
        public void run() {
            NewArenaMainFragment_.super.showLodingFailed();
        }
    }

    /* loaded from: classes3.dex */
    class k implements View.OnClickListener {
        k() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            NewArenaMainFragment_.this.setNetwork();
        }
    }

    /* loaded from: classes3.dex */
    class l implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f52480b;

        l(String str) {
            this.f52480b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            NewArenaMainFragment_.super.showToast(this.f52480b);
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
                NewArenaMainFragment_.super.p0();
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
                NewArenaMainFragment_.super.H0();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes3.dex */
    class o implements View.OnClickListener {
        o() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            NewArenaMainFragment_.this.relodingimag();
        }
    }

    /* loaded from: classes3.dex */
    class p implements View.OnClickListener {
        p() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            NewArenaMainFragment_.this.F0();
        }
    }

    /* loaded from: classes3.dex */
    class q implements View.OnClickListener {
        q() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            NewArenaMainFragment_.this.I0();
        }
    }

    /* loaded from: classes3.dex */
    class r implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f52487b;

        r(String str) {
            this.f52487b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            NewArenaMainFragment_.super.s0(this.f52487b);
        }
    }

    /* loaded from: classes3.dex */
    class s implements Runnable {
        s() {
        }

        @Override // java.lang.Runnable
        public void run() {
            NewArenaMainFragment_.super.R0();
        }
    }

    /* loaded from: classes3.dex */
    class t implements Runnable {
        t() {
        }

        @Override // java.lang.Runnable
        public void run() {
            NewArenaMainFragment_.super.q0();
        }
    }

    /* loaded from: classes3.dex */
    class u implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ArenaResponse f52491b;

        u(ArenaResponse arenaResponse) {
            this.f52491b = arenaResponse;
        }

        @Override // java.lang.Runnable
        public void run() {
            NewArenaMainFragment_.super.A0(this.f52491b);
        }
    }

    /* loaded from: classes3.dex */
    class v implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ GameRoom f52493b;

        v(GameRoom gameRoom) {
            this.f52493b = gameRoom;
        }

        @Override // java.lang.Runnable
        public void run() {
            NewArenaMainFragment_.super.B0(this.f52493b);
        }
    }

    /* loaded from: classes3.dex */
    public static class w extends org.androidannotations.api.builder.d<w, NewArenaMainFragment> {
        @Override // org.androidannotations.api.builder.d
        /* renamed from: a */
        public NewArenaMainFragment build() {
            NewArenaMainFragment_ newArenaMainFragment_ = new NewArenaMainFragment_();
            newArenaMainFragment_.setArguments(this.args);
            return newArenaMainFragment_;
        }
    }

    private void init_(Bundle bundle) {
        a4.c.b(this);
        this.f52429p = AccountUtil_.getInstance_(getActivity());
    }

    public static w m1() {
        return new w();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.NewArenaMainFragment
    public void A0(ArenaResponse arenaResponse) {
        org.androidannotations.api.b.e("", new u(arenaResponse), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.NewArenaMainFragment
    public void B0(GameRoom gameRoom) {
        org.androidannotations.api.b.e("", new v(gameRoom), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.NewArenaMainFragment
    public void C0() {
        org.androidannotations.api.b.e("", new f(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.NewArenaMainFragment
    public void H0() {
        org.androidannotations.api.a.l(new n("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.NewArenaMainFragment
    public void J0(List<BannerBean> list) {
        org.androidannotations.api.b.e("", new g(list), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.NewArenaMainFragment
    public void K0(List<GameInfoBean> list) {
        org.androidannotations.api.b.e("", new h(list), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.NewArenaMainFragment
    public void L0(GameListBannerBean gameListBannerBean) {
        org.androidannotations.api.b.e("", new d(gameListBannerBean), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.NewArenaMainFragment
    public void P0(GameRoom gameRoom) {
        org.androidannotations.api.b.e("", new b(gameRoom), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.NewArenaMainFragment
    public void R0() {
        org.androidannotations.api.b.e("", new s(), 0L);
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.D1.get(cls);
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        View view = this.C1;
        if (view == null) {
            return null;
        }
        return (T) view.findViewById(i4);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.B1);
        init_(bundle);
        super.onCreate(bundle);
        a4.c.c(c5);
    }

    @Override // com.join.mgps.fragment.NewArenaMainFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        this.C1 = onCreateView;
        if (onCreateView == null) {
            this.C1 = layoutInflater.inflate(R.layout.fragment_new_arenamain, viewGroup, false);
        }
        return this.C1;
    }

    @Override // com.join.mgps.fragment.NewArenaMainFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.C1 = null;
        this.f52418e = null;
        this.f52419f = null;
        this.f52420g = null;
        this.f52421h = null;
        this.f52422i = null;
        this.f52423j = null;
        this.f52424k = null;
        this.f52425l = null;
        this.f52427n = null;
        this.f52428o = null;
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f52418e = (LinearLayout) aVar.internalFindViewById(R.id.searchBack);
        this.f52419f = (LinearLayout) aVar.internalFindViewById(R.id.loding_layout);
        this.f52420g = (LinearLayout) aVar.internalFindViewById(R.id.loding_faile);
        this.f52421h = (LinearLayout) aVar.internalFindViewById(R.id.hit_temp_ll);
        this.f52422i = (XRecyclerView) aVar.internalFindViewById(R.id.listview);
        this.f52423j = aVar.internalFindViewById(R.id.myDragImageView);
        this.f52424k = (LinearLayout) aVar.internalFindViewById(R.id.selecterLayout);
        this.f52425l = (FrameLayout) aVar.internalFindViewById(R.id.fragmentLayout);
        this.f52427n = aVar.internalFindViewById(R.id.ll_main);
        this.f52428o = aVar.internalFindViewById(R.id.redPoint);
        View internalFindViewById = aVar.internalFindViewById(R.id.setNetwork);
        View internalFindViewById2 = aVar.internalFindViewById(R.id.relodingimag);
        if (internalFindViewById != null) {
            internalFindViewById.setOnClickListener(new k());
        }
        if (internalFindViewById2 != null) {
            internalFindViewById2.setOnClickListener(new o());
        }
        View view = this.f52423j;
        if (view != null) {
            view.setOnClickListener(new p());
        }
        LinearLayout linearLayout = this.f52418e;
        if (linearLayout != null) {
            linearLayout.setOnClickListener(new q());
        }
        afterViews();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.B1.a(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.NewArenaMainFragment
    public void p0() {
        org.androidannotations.api.a.l(new m("", 0L, ""));
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.D1.put(cls, t4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.NewArenaMainFragment
    public void q0() {
        org.androidannotations.api.b.e("", new t(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.NewArenaMainFragment
    public void r0(GameRoom gameRoom, String str) {
        org.androidannotations.api.b.e("", new a(gameRoom, str), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.NewArenaMainFragment
    public void s0(String str) {
        org.androidannotations.api.b.e("", new r(str), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.NewArenaMainFragment
    public void showLoding() {
        org.androidannotations.api.b.e("", new i(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.NewArenaMainFragment
    public void showLodingFailed() {
        org.androidannotations.api.b.e("", new j(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.NewArenaMainFragment
    public void showToast(String str) {
        org.androidannotations.api.b.e("", new l(str), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.NewArenaMainFragment
    public void y0() {
        org.androidannotations.api.b.e("", new c(), 500L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.NewArenaMainFragment
    public void z0() {
        org.androidannotations.api.b.e("", new e(), 0L);
    }
}
