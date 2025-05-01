package com.join.mgps.fragment;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.dto.FriendAccountInfo;
import com.join.mgps.dto.FriendBean;
import com.wufan.friend.chat.protocol.l1;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.androidannotations.api.a;
/* loaded from: classes3.dex */
public final class FriendFragment_ extends FriendFragment implements y3.a, a4.a, a4.b {
    private View F;
    private final a4.c E = new a4.c();
    private final Map<Class<?>, Object> G = new HashMap();
    private final IntentFilter H = new IntentFilter();
    private final BroadcastReceiver I = new k();

    /* loaded from: classes3.dex */
    class a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ FriendAccountInfo f51551b;

        a(FriendAccountInfo friendAccountInfo) {
            this.f51551b = friendAccountInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            FriendFragment_.super.h1(this.f51551b);
        }
    }

    /* loaded from: classes3.dex */
    class a0 implements View.OnClickListener {
        a0() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            FriendFragment_.this.L0();
        }
    }

    /* loaded from: classes3.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            FriendFragment_.super.f1();
        }
    }

    /* loaded from: classes3.dex */
    class b0 implements View.OnClickListener {
        b0() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            FriendFragment_.this.l0();
        }
    }

    /* loaded from: classes3.dex */
    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            FriendFragment_.super.i1();
        }
    }

    /* loaded from: classes3.dex */
    class c0 implements View.OnClickListener {
        c0() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            FriendFragment_.this.V0();
        }
    }

    /* loaded from: classes3.dex */
    class d implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f51558b;

        d(int i4) {
            this.f51558b = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            FriendFragment_.super.Y0(this.f51558b);
        }
    }

    /* loaded from: classes3.dex */
    class d0 implements View.OnClickListener {
        d0() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            FriendFragment_.this.j1();
        }
    }

    /* loaded from: classes3.dex */
    class e implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f51561b;

        e(List list) {
            this.f51561b = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            FriendFragment_.super.updateUi(this.f51561b);
        }
    }

    /* loaded from: classes3.dex */
    class e0 implements View.OnClickListener {
        e0() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            FriendFragment_.this.A0();
        }
    }

    /* loaded from: classes3.dex */
    class f implements Runnable {
        f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            FriendFragment_.super.M0();
        }
    }

    /* loaded from: classes3.dex */
    public static class f0 extends org.androidannotations.api.builder.d<f0, FriendFragment> {
        @Override // org.androidannotations.api.builder.d
        /* renamed from: a */
        public FriendFragment build() {
            FriendFragment_ friendFragment_ = new FriendFragment_();
            friendFragment_.setArguments(this.args);
            return friendFragment_;
        }
    }

    /* loaded from: classes3.dex */
    class g implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f51565b;

        g(String str) {
            this.f51565b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            FriendFragment_.super.e1(this.f51565b);
        }
    }

    /* loaded from: classes3.dex */
    class h implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.wufan.friend.chat.protocol.v f51567b;

        h(com.wufan.friend.chat.protocol.v vVar) {
            this.f51567b = vVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            FriendFragment_.super.Q0(this.f51567b);
        }
    }

    /* loaded from: classes3.dex */
    class i implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.wufan.friend.chat.protocol.e f51569b;

        i(com.wufan.friend.chat.protocol.e eVar) {
            this.f51569b = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            FriendFragment_.super.O0(this.f51569b);
        }
    }

    /* loaded from: classes3.dex */
    class j implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ l1 f51571b;

        j(l1 l1Var) {
            this.f51571b = l1Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            FriendFragment_.super.S0(this.f51571b);
        }
    }

    /* loaded from: classes3.dex */
    class k extends BroadcastReceiver {
        k() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            FriendFragment_.this.j0();
        }
    }

    /* loaded from: classes3.dex */
    class l implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.wufan.friend.chat.protocol.g f51574b;

        l(com.wufan.friend.chat.protocol.g gVar) {
            this.f51574b = gVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            FriendFragment_.super.P0(this.f51574b);
        }
    }

    /* loaded from: classes3.dex */
    class m implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.wufan.friend.chat.protocol.x f51576b;

        m(com.wufan.friend.chat.protocol.x xVar) {
            this.f51576b = xVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            FriendFragment_.super.R0(this.f51576b);
        }
    }

    /* loaded from: classes3.dex */
    class n implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.wufan.friend.chat.protocol.x f51578b;

        n(com.wufan.friend.chat.protocol.x xVar) {
            this.f51578b = xVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            FriendFragment_.super.g1(this.f51578b);
        }
    }

    /* loaded from: classes3.dex */
    class o implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f51580b;

        o(int i4) {
            this.f51580b = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            FriendFragment_.super.Z0(this.f51580b);
        }
    }

    /* loaded from: classes3.dex */
    class p implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f51582b;

        p(String str) {
            this.f51582b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            FriendFragment_.super.showToast(this.f51582b);
        }
    }

    /* loaded from: classes3.dex */
    class q implements Runnable {
        q() {
        }

        @Override // java.lang.Runnable
        public void run() {
            FriendFragment_.super.c1();
        }
    }

    /* loaded from: classes3.dex */
    class r implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Boolean f51585b;

        r(Boolean bool) {
            this.f51585b = bool;
        }

        @Override // java.lang.Runnable
        public void run() {
            FriendFragment_.super.i0(this.f51585b);
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
                FriendFragment_.super.w0();
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
                FriendFragment_.super.x0();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes3.dex */
    class u extends a.c {
        u(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                FriendFragment_.super.y0();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes3.dex */
    class v implements View.OnClickListener {
        v() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            FriendFragment_.this.X0();
        }
    }

    /* loaded from: classes3.dex */
    class w extends a.c {
        w(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                FriendFragment_.super.v0();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes3.dex */
    class x extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f51592b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        x(String str, long j4, String str2, int i4) {
            super(str, j4, str2);
            this.f51592b = i4;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                FriendFragment_.super.h0(this.f51592b);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes3.dex */
    class y implements View.OnClickListener {
        y() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            FriendFragment_.this.U0();
        }
    }

    /* loaded from: classes3.dex */
    class z implements View.OnClickListener {
        z() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            FriendFragment_.this.T0();
        }
    }

    public static f0 G1() {
        return new f0();
    }

    private void init_(Bundle bundle) {
        a4.c.b(this);
        this.H.addAction("com.join.android.app.mgsim.wufun.broadcast.action_login_success");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.FriendFragment
    public void M0() {
        org.androidannotations.api.b.e("", new f(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.FriendFragment
    public void O0(com.wufan.friend.chat.protocol.e eVar) {
        org.androidannotations.api.b.e("", new i(eVar), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.FriendFragment
    public void P0(com.wufan.friend.chat.protocol.g gVar) {
        org.androidannotations.api.b.e("", new l(gVar), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.FriendFragment
    public void Q0(com.wufan.friend.chat.protocol.v vVar) {
        org.androidannotations.api.b.e("", new h(vVar), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.FriendFragment
    public void R0(com.wufan.friend.chat.protocol.x xVar) {
        org.androidannotations.api.b.e("", new m(xVar), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.FriendFragment
    public void S0(l1 l1Var) {
        org.androidannotations.api.b.e("", new j(l1Var), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.FriendFragment
    public void Y0(int i4) {
        org.androidannotations.api.b.e("", new d(i4), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.FriendFragment
    public void Z0(int i4) {
        org.androidannotations.api.b.e("", new o(i4), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.FriendFragment
    public void c1() {
        org.androidannotations.api.b.e("", new q(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.FriendFragment
    public void e1(String str) {
        org.androidannotations.api.b.e("", new g(str), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.FriendFragment
    public void f1() {
        org.androidannotations.api.b.e("", new b(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.FriendFragment
    public void g1(com.wufan.friend.chat.protocol.x xVar) {
        org.androidannotations.api.b.e("", new n(xVar), 0L);
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.G.get(cls);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.FriendFragment
    public void h0(int i4) {
        org.androidannotations.api.a.l(new x("", 0L, "", i4));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.FriendFragment
    public void h1(FriendAccountInfo friendAccountInfo) {
        org.androidannotations.api.b.e("", new a(friendAccountInfo), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.FriendFragment
    public void i0(Boolean bool) {
        org.androidannotations.api.b.e("", new r(bool), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.FriendFragment
    public void i1() {
        org.androidannotations.api.b.e("", new c(), 0L);
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        View view = this.F;
        if (view == null) {
            return null;
        }
        return (T) view.findViewById(i4);
    }

    @Override // com.join.mgps.fragment.FriendFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.E);
        init_(bundle);
        super.onCreate(bundle);
        getActivity().registerReceiver(this.I, this.H);
        a4.c.c(c5);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        this.F = onCreateView;
        if (onCreateView == null) {
            this.F = layoutInflater.inflate(R.layout.fragment_friend_my, viewGroup, false);
        }
        return this.F;
    }

    @Override // com.join.mgps.fragment.FriendFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        getActivity().unregisterReceiver(this.I);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.F = null;
        this.f51525b = null;
        this.f51526c = null;
        this.f51527d = null;
        this.f51528e = null;
        this.f51529f = null;
        this.f51530g = null;
        this.f51531h = null;
        this.f51532i = null;
        this.f51533j = null;
        this.f51534k = null;
        this.f51535l = null;
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f51525b = (SimpleDraweeView) aVar.internalFindViewById(R.id.avatar);
        this.f51526c = (TextView) aVar.internalFindViewById(R.id.nickname);
        this.f51527d = (TextView) aVar.internalFindViewById(R.id.unlogin);
        this.f51528e = (TextView) aVar.internalFindViewById(R.id.onlineState);
        this.f51529f = (TextView) aVar.internalFindViewById(R.id.msgCount);
        this.f51530g = aVar.internalFindViewById(R.id.icVip);
        this.f51531h = aVar.internalFindViewById(R.id.msg);
        this.f51532i = aVar.internalFindViewById(R.id.noRecord);
        this.f51533j = aVar.internalFindViewById(R.id.searchFriend);
        this.f51534k = aVar.internalFindViewById(R.id.onlineStateArr);
        this.f51535l = (RecyclerView) aVar.internalFindViewById(R.id.recyclerView);
        View internalFindViewById = aVar.internalFindViewById(R.id.qq);
        View internalFindViewById2 = aVar.internalFindViewById(R.id.wechat);
        View internalFindViewById3 = aVar.internalFindViewById(R.id.inviteFriend);
        View view = this.f51533j;
        if (view != null) {
            view.setOnClickListener(new v());
        }
        View view2 = this.f51534k;
        if (view2 != null) {
            view2.setOnClickListener(new y());
        }
        TextView textView = this.f51528e;
        if (textView != null) {
            textView.setOnClickListener(new z());
        }
        View view3 = this.f51531h;
        if (view3 != null) {
            view3.setOnClickListener(new a0());
        }
        SimpleDraweeView simpleDraweeView = this.f51525b;
        if (simpleDraweeView != null) {
            simpleDraweeView.setOnClickListener(new b0());
        }
        if (internalFindViewById != null) {
            internalFindViewById.setOnClickListener(new c0());
        }
        if (internalFindViewById2 != null) {
            internalFindViewById2.setOnClickListener(new d0());
        }
        if (internalFindViewById3 != null) {
            internalFindViewById3.setOnClickListener(new e0());
        }
        afterViews();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.E.a(this);
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.G.put(cls, t4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.FriendFragment
    public void showToast(String str) {
        org.androidannotations.api.b.e("", new p(str), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.FriendFragment
    public void updateUi(List<FriendBean> list) {
        org.androidannotations.api.b.e("", new e(list), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.FriendFragment
    public void v0() {
        org.androidannotations.api.a.l(new w("", 200L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.FriendFragment
    public void w0() {
        org.androidannotations.api.a.l(new s("", 100L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.FriendFragment
    public void x0() {
        org.androidannotations.api.a.l(new t("", 200L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.FriendFragment
    public void y0() {
        org.androidannotations.api.a.l(new u("", 200L, ""));
    }
}
