package com.join.mgps.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import app.mgsim.arena.ArenaResponse;
import app.mgsim.arena.SocketError;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.customview.LJNestScrollWebView;
import com.join.mgps.dto.CreateVipData;
import com.join.mgps.dto.DetailResultBean;
import com.join.mgps.pref.PrefDef_;
import com.papa91.battle.protocol.GameRoom;
import java.util.HashMap;
import java.util.Map;
import org.androidannotations.api.a;
/* loaded from: classes3.dex */
public final class CommonWebviewFragment_ extends CommonWebviewFragment implements y3.a, a4.a, a4.b {
    private View Q1;
    private final a4.c P1 = new a4.c();
    private final Map<Class<?>, Object> R1 = new HashMap();

    /* loaded from: classes3.dex */
    class a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DetailResultBean f50615b;

        a(DetailResultBean detailResultBean) {
            this.f50615b = detailResultBean;
        }

        @Override // java.lang.Runnable
        public void run() {
            CommonWebviewFragment_.super.i1(this.f50615b);
        }
    }

    /* loaded from: classes3.dex */
    public static class a0 extends org.androidannotations.api.builder.d<a0, CommonWebviewFragment> {
        @Override // org.androidannotations.api.builder.d
        /* renamed from: a */
        public CommonWebviewFragment build() {
            CommonWebviewFragment_ commonWebviewFragment_ = new CommonWebviewFragment_();
            commonWebviewFragment_.setArguments(this.args);
            return commonWebviewFragment_;
        }
    }

    /* loaded from: classes3.dex */
    class b implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f50617b;

        b(String str) {
            this.f50617b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            CommonWebviewFragment_.super.Y0(this.f50617b);
        }
    }

    /* loaded from: classes3.dex */
    class c implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f50619b;

        c(boolean z4) {
            this.f50619b = z4;
        }

        @Override // java.lang.Runnable
        public void run() {
            CommonWebviewFragment_.super.V0(this.f50619b);
        }
    }

    /* loaded from: classes3.dex */
    class d implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f50621b;

        d(String str) {
            this.f50621b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            CommonWebviewFragment_.super.J0(this.f50621b);
        }
    }

    /* loaded from: classes3.dex */
    class e implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ SocketError f50623b;

        e(SocketError socketError) {
            this.f50623b = socketError;
        }

        @Override // java.lang.Runnable
        public void run() {
            CommonWebviewFragment_.super.Z0(this.f50623b);
        }
    }

    /* loaded from: classes3.dex */
    class f implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ GameRoom f50625b;

        f(GameRoom gameRoom) {
            this.f50625b = gameRoom;
        }

        @Override // java.lang.Runnable
        public void run() {
            CommonWebviewFragment_.super.T0(this.f50625b);
        }
    }

    /* loaded from: classes3.dex */
    class g implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ GameRoom f50627b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f50628c;

        g(GameRoom gameRoom, String str) {
            this.f50627b = gameRoom;
            this.f50628c = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            CommonWebviewFragment_.super.I0(this.f50627b, this.f50628c);
        }
    }

    /* loaded from: classes3.dex */
    class h implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ GameRoom f50630b;

        h(GameRoom gameRoom) {
            this.f50630b = gameRoom;
        }

        @Override // java.lang.Runnable
        public void run() {
            CommonWebviewFragment_.super.d1(this.f50630b);
        }
    }

    /* loaded from: classes3.dex */
    class i implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ArenaResponse f50632b;

        i(ArenaResponse arenaResponse) {
            this.f50632b = arenaResponse;
        }

        @Override // java.lang.Runnable
        public void run() {
            CommonWebviewFragment_.super.S0(this.f50632b);
        }
    }

    /* loaded from: classes3.dex */
    class j implements Runnable {
        j() {
        }

        @Override // java.lang.Runnable
        public void run() {
            CommonWebviewFragment_.super.f1();
        }
    }

    /* loaded from: classes3.dex */
    class k implements View.OnClickListener {
        k() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CommonWebviewFragment_.this.loding_faile();
        }
    }

    /* loaded from: classes3.dex */
    class l implements Runnable {
        l() {
        }

        @Override // java.lang.Runnable
        public void run() {
            CommonWebviewFragment_.super.H0();
        }
    }

    /* loaded from: classes3.dex */
    class m implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CreateVipData f50637b;

        m(CreateVipData createVipData) {
            this.f50637b = createVipData;
        }

        @Override // java.lang.Runnable
        public void run() {
            CommonWebviewFragment_.super.l1(this.f50637b);
        }
    }

    /* loaded from: classes3.dex */
    class n implements Runnable {
        n() {
        }

        @Override // java.lang.Runnable
        public void run() {
            CommonWebviewFragment_.super.G0();
        }
    }

    /* loaded from: classes3.dex */
    class o extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f50640b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f50641c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f50642d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(String str, long j4, String str2, String str3, String str4, int i4) {
            super(str, j4, str2);
            this.f50640b = str3;
            this.f50641c = str4;
            this.f50642d = i4;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                CommonWebviewFragment_.super.L0(this.f50640b, this.f50641c, this.f50642d);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes3.dex */
    class p extends a.c {
        p(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                CommonWebviewFragment_.super.getUserInfo();
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
                CommonWebviewFragment_.super.D0();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes3.dex */
    class r extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f50646b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        r(String str, long j4, String str2, int i4) {
            super(str, j4, str2);
            this.f50646b = i4;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                CommonWebviewFragment_.super.F0(this.f50646b);
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
            CommonWebviewFragment_.this.setNetwork();
        }
    }

    /* loaded from: classes3.dex */
    class t implements View.OnClickListener {
        t() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CommonWebviewFragment_.this.b1();
        }
    }

    /* loaded from: classes3.dex */
    class u implements View.OnClickListener {
        u() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CommonWebviewFragment_.this.K0();
        }
    }

    /* loaded from: classes3.dex */
    class v implements Runnable {
        v() {
        }

        @Override // java.lang.Runnable
        public void run() {
            CommonWebviewFragment_.super.showLoding();
        }
    }

    /* loaded from: classes3.dex */
    class w implements Runnable {
        w() {
        }

        @Override // java.lang.Runnable
        public void run() {
            CommonWebviewFragment_.super.showLodingFailed();
        }
    }

    /* loaded from: classes3.dex */
    class x implements Runnable {
        x() {
        }

        @Override // java.lang.Runnable
        public void run() {
            CommonWebviewFragment_.super.showMain();
        }
    }

    /* loaded from: classes3.dex */
    class y implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f50654b;

        y(String str) {
            this.f50654b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            CommonWebviewFragment_.super.showTost(this.f50654b);
        }
    }

    /* loaded from: classes3.dex */
    class z implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DetailResultBean f50656b;

        z(DetailResultBean detailResultBean) {
            this.f50656b = detailResultBean;
        }

        @Override // java.lang.Runnable
        public void run() {
            CommonWebviewFragment_.super.g1(this.f50656b);
        }
    }

    public static a0 L1() {
        return new a0();
    }

    private void init_(Bundle bundle) {
        this.f50489t = new PrefDef_(getActivity());
        a4.c.b(this);
        this.I = AccountUtil_.getInstance_(getActivity());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.CommonWebviewFragment
    public void D0() {
        org.androidannotations.api.a.l(new q("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.CommonWebviewFragment
    public void F0(int i4) {
        org.androidannotations.api.a.l(new r("", 0L, "", i4));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.CommonWebviewFragment
    public void G0() {
        org.androidannotations.api.b.e("", new n(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.CommonWebviewFragment
    public void H0() {
        org.androidannotations.api.b.e("", new l(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.CommonWebviewFragment
    public void I0(GameRoom gameRoom, String str) {
        org.androidannotations.api.b.e("", new g(gameRoom, str), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.CommonWebviewFragment
    public void J0(String str) {
        org.androidannotations.api.b.e("", new d(str), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.CommonWebviewFragment
    public void L0(String str, String str2, int i4) {
        org.androidannotations.api.a.l(new o("", 0L, "", str, str2, i4));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.CommonWebviewFragment
    public void S0(ArenaResponse arenaResponse) {
        org.androidannotations.api.b.e("", new i(arenaResponse), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.CommonWebviewFragment
    public void T0(GameRoom gameRoom) {
        org.androidannotations.api.b.e("", new f(gameRoom), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.CommonWebviewFragment
    public void V0(boolean z4) {
        org.androidannotations.api.b.e("", new c(z4), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.CommonWebviewFragment
    public void Y0(String str) {
        org.androidannotations.api.b.e("", new b(str), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.CommonWebviewFragment
    public void Z0(SocketError socketError) {
        org.androidannotations.api.b.e("", new e(socketError), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.CommonWebviewFragment
    public void d1(GameRoom gameRoom) {
        org.androidannotations.api.b.e("", new h(gameRoom), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.CommonWebviewFragment
    public void f1() {
        org.androidannotations.api.b.e("", new j(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.CommonWebviewFragment
    public void g1(DetailResultBean detailResultBean) {
        org.androidannotations.api.b.e("", new z(detailResultBean), 0L);
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.R1.get(cls);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.CommonWebviewFragment
    public void getUserInfo() {
        org.androidannotations.api.a.l(new p("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.CommonWebviewFragment
    public void i1(DetailResultBean detailResultBean) {
        org.androidannotations.api.b.e("", new a(detailResultBean), 0L);
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        View view = this.Q1;
        if (view == null) {
            return null;
        }
        return (T) view.findViewById(i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.CommonWebviewFragment
    public void l1(CreateVipData createVipData) {
        org.androidannotations.api.b.e("", new m(createVipData), 0L);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.P1);
        init_(bundle);
        super.onCreate(bundle);
        a4.c.c(c5);
    }

    @Override // com.join.mgps.fragment.CommonWebviewFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        this.Q1 = onCreateView;
        if (onCreateView == null) {
            this.Q1 = layoutInflater.inflate(R.layout.fragment_common_webview, viewGroup, false);
        }
        return this.Q1;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.Q1 = null;
        this.f50472e = null;
        this.f50473f = null;
        this.f50474g = null;
        this.f50475h = null;
        this.f50476i = null;
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f50472e = (LinearLayout) aVar.internalFindViewById(R.id.loding_layout);
        this.f50473f = (LinearLayout) aVar.internalFindViewById(R.id.loding_faile);
        this.f50474g = (TextView) aVar.internalFindViewById(R.id.failedMessage);
        this.f50475h = (RelativeLayout) aVar.internalFindViewById(R.id.weblayout);
        this.f50476i = (LJNestScrollWebView) aVar.internalFindViewById(R.id.web);
        View internalFindViewById = aVar.internalFindViewById(R.id.setNetwork);
        View internalFindViewById2 = aVar.internalFindViewById(R.id.search);
        View internalFindViewById3 = aVar.internalFindViewById(R.id.download);
        LinearLayout linearLayout = this.f50473f;
        if (linearLayout != null) {
            linearLayout.setOnClickListener(new k());
        }
        if (internalFindViewById != null) {
            internalFindViewById.setOnClickListener(new s());
        }
        if (internalFindViewById2 != null) {
            internalFindViewById2.setOnClickListener(new t());
        }
        if (internalFindViewById3 != null) {
            internalFindViewById3.setOnClickListener(new u());
        }
        afterview();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.P1.a(this);
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.R1.put(cls, t4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.CommonWebviewFragment
    public void showLoding() {
        org.androidannotations.api.b.e("", new v(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.CommonWebviewFragment
    public void showLodingFailed() {
        org.androidannotations.api.b.e("", new w(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.CommonWebviewFragment
    public void showMain() {
        org.androidannotations.api.b.e("", new x(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.CommonWebviewFragment
    public void showTost(String str) {
        org.androidannotations.api.b.e("", new y(str), 0L);
    }
}
