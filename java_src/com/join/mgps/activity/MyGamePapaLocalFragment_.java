package com.join.mgps.activity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.activity.recomend.GamedownRecomendItemBean;
import com.join.mgps.customview.WrapContentGridView;
import com.join.mgps.customview.XListView2;
import com.join.mgps.dto.SNKGameInfoBean;
import com.join.mgps.pref.PrefDef_;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.androidannotations.api.a;
/* loaded from: classes4.dex */
public final class MyGamePapaLocalFragment_ extends MyGamePapaLocalFragment implements y3.a, a4.a, a4.b {
    private View K;
    private final a4.c J = new a4.c();
    private final Map<Class<?>, Object> L = new HashMap();
    private final IntentFilter M = new IntentFilter();
    private final BroadcastReceiver N = new k();
    private final IntentFilter O = new IntentFilter();
    private final BroadcastReceiver P = new n();

    /* loaded from: classes4.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MyGamePapaLocalFragment_.super.a1();
        }
    }

    /* loaded from: classes4.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MyGamePapaLocalFragment_.super.A0();
        }
    }

    /* loaded from: classes4.dex */
    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MyGamePapaLocalFragment_.super.s0();
        }
    }

    /* loaded from: classes4.dex */
    class d implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f35994b;

        d(String str) {
            this.f35994b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            MyGamePapaLocalFragment_.super.F0(this.f35994b);
        }
    }

    /* loaded from: classes4.dex */
    class e implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ SNKGameInfoBean f35996b;

        e(SNKGameInfoBean sNKGameInfoBean) {
            this.f35996b = sNKGameInfoBean;
        }

        @Override // java.lang.Runnable
        public void run() {
            MyGamePapaLocalFragment_.super.V0(this.f35996b);
        }
    }

    /* loaded from: classes4.dex */
    class f implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DownloadTask f35998b;

        f(DownloadTask downloadTask) {
            this.f35998b = downloadTask;
        }

        @Override // java.lang.Runnable
        public void run() {
            MyGamePapaLocalFragment_.super.e1(this.f35998b);
        }
    }

    /* loaded from: classes4.dex */
    class g implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f36000b;

        g(List list) {
            this.f36000b = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            MyGamePapaLocalFragment_.super.Y0(this.f36000b);
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
                MyGamePapaLocalFragment_.super.P0();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class i extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f36003b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(String str, long j4, String str2, List list) {
            super(str, j4, str2);
            this.f36003b = list;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                MyGamePapaLocalFragment_.super.Q0(this.f36003b);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class j extends a.c {
        j(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                MyGamePapaLocalFragment_.super.o0();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class k extends BroadcastReceiver {

        /* renamed from: b  reason: collision with root package name */
        public static final String f36006b = "gameId";

        k() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            MyGamePapaLocalFragment_.this.E0((intent.getExtras() != null ? intent.getExtras() : new Bundle()).getString("gameId"));
        }
    }

    /* loaded from: classes4.dex */
    class l extends a.c {
        l(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                MyGamePapaLocalFragment_.super.r0();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class m extends a.c {
        m(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                MyGamePapaLocalFragment_.super.N0();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class n extends BroadcastReceiver {
        n() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            MyGamePapaLocalFragment_.this.M0();
        }
    }

    /* loaded from: classes4.dex */
    class o implements View.OnClickListener {
        o() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MyGamePapaLocalFragment_.this.g0();
        }
    }

    /* loaded from: classes4.dex */
    class p implements View.OnClickListener {
        p() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MyGamePapaLocalFragment_.this.U0();
        }
    }

    /* loaded from: classes4.dex */
    class q implements View.OnClickListener {
        q() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MyGamePapaLocalFragment_.this.G0();
        }
    }

    /* loaded from: classes4.dex */
    class r implements View.OnClickListener {
        r() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MyGamePapaLocalFragment_.this.y0();
        }
    }

    /* loaded from: classes4.dex */
    class s implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f36015b;

        s(String str) {
            this.f36015b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            MyGamePapaLocalFragment_.super.X0(this.f36015b);
        }
    }

    /* loaded from: classes4.dex */
    class t implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ HashMap f36017b;

        t(HashMap hashMap) {
            this.f36017b = hashMap;
        }

        @Override // java.lang.Runnable
        public void run() {
            MyGamePapaLocalFragment_.super.C0(this.f36017b);
        }
    }

    /* loaded from: classes4.dex */
    class u implements Runnable {
        u() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MyGamePapaLocalFragment_.super.Z0();
        }
    }

    /* loaded from: classes4.dex */
    public static class v extends org.androidannotations.api.builder.d<v, MyGamePapaLocalFragment> {
        @Override // org.androidannotations.api.builder.d
        /* renamed from: a */
        public MyGamePapaLocalFragment build() {
            MyGamePapaLocalFragment_ myGamePapaLocalFragment_ = new MyGamePapaLocalFragment_();
            myGamePapaLocalFragment_.setArguments(this.args);
            return myGamePapaLocalFragment_;
        }
    }

    private void init_(Bundle bundle) {
        this.f35966q = new PrefDef_(getActivity());
        a4.c.b(this);
        this.M.addAction(o1.a.f72008k);
        this.O.addAction(o1.a.I);
    }

    public static v v1() {
        return new v();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MyGamePapaLocalFragment
    public void A0() {
        org.androidannotations.api.b.e("", new b(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MyGamePapaLocalFragment
    public void C0(HashMap<String, Boolean> hashMap) {
        org.androidannotations.api.b.e("", new t(hashMap), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MyGamePapaLocalFragment
    public void F0(String str) {
        org.androidannotations.api.b.e("", new d(str), 100L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MyGamePapaLocalFragment
    public void N0() {
        org.androidannotations.api.a.l(new m("", 1000L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MyGamePapaLocalFragment
    public void P0() {
        org.androidannotations.api.a.l(new h("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MyGamePapaLocalFragment
    public void Q0(List<DownloadTask> list) {
        org.androidannotations.api.a.l(new i("", 0L, "", list));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MyGamePapaLocalFragment
    public void V0(SNKGameInfoBean sNKGameInfoBean) {
        org.androidannotations.api.b.e("", new e(sNKGameInfoBean), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MyGamePapaLocalFragment
    public void X0(String str) {
        org.androidannotations.api.b.e("", new s(str), 500L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MyGamePapaLocalFragment
    public void Y0(List<GamedownRecomendItemBean> list) {
        org.androidannotations.api.b.e("", new g(list), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MyGamePapaLocalFragment
    public void Z0() {
        org.androidannotations.api.b.e("", new u(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MyGamePapaLocalFragment
    public void a1() {
        org.androidannotations.api.b.e("", new a(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MyGamePapaLocalFragment
    public void e1(DownloadTask downloadTask) {
        org.androidannotations.api.b.e("", new f(downloadTask), 0L);
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.L.get(cls);
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        View view = this.K;
        if (view == null) {
            return null;
        }
        return (T) view.findViewById(i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MyGamePapaLocalFragment
    public void o0() {
        org.androidannotations.api.a.l(new j("", 0L, ""));
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.J);
        init_(bundle);
        super.onCreate(bundle);
        getActivity().registerReceiver(this.N, this.M);
        getActivity().registerReceiver(this.P, this.O);
        a4.c.c(c5);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        this.K = onCreateView;
        if (onCreateView == null) {
            this.K = layoutInflater.inflate(R.layout.fragment_papa_game_local, viewGroup, false);
        }
        return this.K;
    }

    @Override // com.join.mgps.activity.MyGamePapaLocalFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        getActivity().unregisterReceiver(this.N);
        getActivity().unregisterReceiver(this.P);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.K = null;
        this.f35951b = null;
        this.f35952c = null;
        this.f35953d = null;
        this.f35954e = null;
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f35951b = (XListView2) aVar.internalFindViewById(R.id.listView);
        this.f35952c = aVar.internalFindViewById(R.id.noGame);
        this.f35953d = aVar.internalFindViewById(R.id.root);
        this.f35954e = (WrapContentGridView) aVar.internalFindViewById(R.id.noGameList);
        View internalFindViewById = aVar.internalFindViewById(R.id.back);
        View internalFindViewById2 = aVar.internalFindViewById(R.id.search);
        View internalFindViewById3 = aVar.internalFindViewById(R.id.plugs);
        View internalFindViewById4 = aVar.internalFindViewById(R.id.needUpdate);
        if (internalFindViewById != null) {
            internalFindViewById.setOnClickListener(new o());
        }
        if (internalFindViewById2 != null) {
            internalFindViewById2.setOnClickListener(new p());
        }
        if (internalFindViewById3 != null) {
            internalFindViewById3.setOnClickListener(new q());
        }
        if (internalFindViewById4 != null) {
            internalFindViewById4.setOnClickListener(new r());
        }
        f0();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.J.a(this);
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.L.put(cls, t4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MyGamePapaLocalFragment
    public void r0() {
        org.androidannotations.api.a.l(new l("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MyGamePapaLocalFragment
    public void s0() {
        org.androidannotations.api.b.e("", new c(), 0L);
    }
}
