package com.join.mgps.activity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.ViewFlipper;
import com.facebook.drawee.view.SimpleDraweeView;
import com.google.android.material.appbar.AppBarLayout;
import com.join.android.app.component.xrecyclerview.XRecyclerView2;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.dto.CollectionBeanSub;
import com.join.mgps.dto.HomeFloatData;
import com.join.mgps.dto.PAPAHomeBeanV7;
import com.join.mgps.dto.VipPopData;
import com.join.mgps.pref.PrefDef_;
import com.join.mgps.ptr.PtrClassicFrameLayout;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.androidannotations.api.a;
/* loaded from: classes4.dex */
public final class PapaMainV3Fragment_ extends PapaMainV3Fragment implements y3.a, a4.a, a4.b {

    /* renamed from: q2  reason: collision with root package name */
    public static final String f36641q2 = "gameId";

    /* renamed from: e2  reason: collision with root package name */
    private View f36643e2;

    /* renamed from: d2  reason: collision with root package name */
    private final a4.c f36642d2 = new a4.c();

    /* renamed from: f2  reason: collision with root package name */
    private final Map<Class<?>, Object> f36644f2 = new HashMap();

    /* renamed from: g2  reason: collision with root package name */
    private final IntentFilter f36645g2 = new IntentFilter();

    /* renamed from: h2  reason: collision with root package name */
    private final BroadcastReceiver f36646h2 = new k();

    /* renamed from: i2  reason: collision with root package name */
    private final IntentFilter f36647i2 = new IntentFilter();

    /* renamed from: j2  reason: collision with root package name */
    private final BroadcastReceiver f36648j2 = new v();

    /* renamed from: k2  reason: collision with root package name */
    private final IntentFilter f36649k2 = new IntentFilter();

    /* renamed from: l2  reason: collision with root package name */
    private final BroadcastReceiver f36650l2 = new g0();

    /* renamed from: m2  reason: collision with root package name */
    private final IntentFilter f36651m2 = new IntentFilter();

    /* renamed from: n2  reason: collision with root package name */
    private final BroadcastReceiver f36652n2 = new r0();

    /* renamed from: o2  reason: collision with root package name */
    private final IntentFilter f36653o2 = new IntentFilter();

    /* renamed from: p2  reason: collision with root package name */
    private final BroadcastReceiver f36654p2 = new t0();

    /* loaded from: classes4.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            PapaMainV3Fragment_.this.W1();
        }
    }

    /* loaded from: classes4.dex */
    class a0 implements Runnable {
        a0() {
        }

        @Override // java.lang.Runnable
        public void run() {
            PapaMainV3Fragment_.super.i2();
        }
    }

    /* loaded from: classes4.dex */
    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            PapaMainV3Fragment_.this.setNetwork();
        }
    }

    /* loaded from: classes4.dex */
    class b0 implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PAPAHomeBeanV7.HomeBeanDTO f36658b;

        b0(PAPAHomeBeanV7.HomeBeanDTO homeBeanDTO) {
            this.f36658b = homeBeanDTO;
        }

        @Override // java.lang.Runnable
        public void run() {
            PapaMainV3Fragment_.super.F1(this.f36658b);
        }
    }

    /* loaded from: classes4.dex */
    class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            PapaMainV3Fragment_.this.c2();
        }
    }

    /* loaded from: classes4.dex */
    class c0 implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PAPAHomeBeanV7.HomeBeanDTO f36661b;

        c0(PAPAHomeBeanV7.HomeBeanDTO homeBeanDTO) {
            this.f36661b = homeBeanDTO;
        }

        @Override // java.lang.Runnable
        public void run() {
            PapaMainV3Fragment_.super.E0(this.f36661b);
        }
    }

    /* loaded from: classes4.dex */
    class d implements View.OnClickListener {
        d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            PapaMainV3Fragment_.this.M0();
        }
    }

    /* loaded from: classes4.dex */
    class d0 implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PAPAHomeBeanV7.HomeBeanDTO f36664b;

        d0(PAPAHomeBeanV7.HomeBeanDTO homeBeanDTO) {
            this.f36664b = homeBeanDTO;
        }

        @Override // java.lang.Runnable
        public void run() {
            PapaMainV3Fragment_.super.J0(this.f36664b);
        }
    }

    /* loaded from: classes4.dex */
    class e implements View.OnClickListener {
        e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            PapaMainV3Fragment_.this.g1();
        }
    }

    /* loaded from: classes4.dex */
    class e0 implements Runnable {
        e0() {
        }

        @Override // java.lang.Runnable
        public void run() {
            PapaMainV3Fragment_.super.e1();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class f implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Intent f36668b;

        f(Intent intent) {
            this.f36668b = intent;
        }

        @Override // java.lang.Runnable
        public void run() {
            PapaMainV3Fragment_.super.t1(this.f36668b);
        }
    }

    /* loaded from: classes4.dex */
    class f0 implements Runnable {
        f0() {
        }

        @Override // java.lang.Runnable
        public void run() {
            PapaMainV3Fragment_.super.d1();
        }
    }

    /* loaded from: classes4.dex */
    class g implements Runnable {
        g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            PapaMainV3Fragment_.super.m2();
        }
    }

    /* loaded from: classes4.dex */
    class g0 extends BroadcastReceiver {
        g0() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            PapaMainV3Fragment_.this.D1(intent);
        }
    }

    /* loaded from: classes4.dex */
    class h implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f36673b;

        h(List list) {
            this.f36673b = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            PapaMainV3Fragment_.super.a2(this.f36673b);
        }
    }

    /* loaded from: classes4.dex */
    class h0 extends a.c {
        h0(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                PapaMainV3Fragment_.super.W0();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class i implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f36676b;

        i(String str) {
            this.f36676b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            PapaMainV3Fragment_.super.d2(this.f36676b);
        }
    }

    /* loaded from: classes4.dex */
    class i0 extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f36678b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f36679c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i0(String str, long j4, String str2, int i4, String str3) {
            super(str, j4, str2);
            this.f36678b = i4;
            this.f36679c = str3;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                PapaMainV3Fragment_.super.Z0(this.f36678b, this.f36679c);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class j implements Runnable {
        j() {
        }

        @Override // java.lang.Runnable
        public void run() {
            PapaMainV3Fragment_.super.X1();
        }
    }

    /* loaded from: classes4.dex */
    class j0 extends a.c {
        j0(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                PapaMainV3Fragment_.super.I0();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class k extends BroadcastReceiver {
        k() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            PapaMainV3Fragment_.this.Z();
        }
    }

    /* loaded from: classes4.dex */
    class k0 extends a.c {
        k0(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                PapaMainV3Fragment_.super.T1();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class l implements Runnable {
        l() {
        }

        @Override // java.lang.Runnable
        public void run() {
            PapaMainV3Fragment_.super.m1();
        }
    }

    /* loaded from: classes4.dex */
    class l0 extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f36686b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l0(String str, long j4, String str2, String str3) {
            super(str, j4, str2);
            this.f36686b = str3;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                PapaMainV3Fragment_.super.F0(this.f36686b);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class m implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PAPAHomeBeanV7 f36688b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f36689c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f36690d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ boolean f36691e;

        m(PAPAHomeBeanV7 pAPAHomeBeanV7, String str, int i4, boolean z4) {
            this.f36688b = pAPAHomeBeanV7;
            this.f36689c = str;
            this.f36690d = i4;
            this.f36691e = z4;
        }

        @Override // java.lang.Runnable
        public void run() {
            PapaMainV3Fragment_.super.f2(this.f36688b, this.f36689c, this.f36690d, this.f36691e);
        }
    }

    /* loaded from: classes4.dex */
    class m0 extends a.c {
        m0(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                PapaMainV3Fragment_.super.R0();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class n implements Runnable {
        n() {
        }

        @Override // java.lang.Runnable
        public void run() {
            PapaMainV3Fragment_.super.q1();
        }
    }

    /* loaded from: classes4.dex */
    class n0 extends a.c {
        n0(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                PapaMainV3Fragment_.super.k1();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class o implements Runnable {
        o() {
        }

        @Override // java.lang.Runnable
        public void run() {
            PapaMainV3Fragment_.super.G1();
        }
    }

    /* loaded from: classes4.dex */
    class o0 extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f36697b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f36698c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o0(String str, long j4, String str2, String str3, int i4) {
            super(str, j4, str2);
            this.f36697b = str3;
            this.f36698c = i4;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                PapaMainV3Fragment_.super.l1(this.f36697b, this.f36698c);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class p implements Runnable {
        p() {
        }

        @Override // java.lang.Runnable
        public void run() {
            PapaMainV3Fragment_.super.s1();
        }
    }

    /* loaded from: classes4.dex */
    class p0 extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PAPAHomeBeanV7 f36701b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p0(String str, long j4, String str2, PAPAHomeBeanV7 pAPAHomeBeanV7) {
            super(str, j4, str2);
            this.f36701b = pAPAHomeBeanV7;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                PapaMainV3Fragment_.super.H1(this.f36701b);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class q implements Runnable {
        q() {
        }

        @Override // java.lang.Runnable
        public void run() {
            PapaMainV3Fragment_.super.Z1();
        }
    }

    /* loaded from: classes4.dex */
    class q0 extends a.c {
        q0(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                PapaMainV3Fragment_.super.Q0();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class r implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f36705b;

        r(String str) {
            this.f36705b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            PapaMainV3Fragment_.super.showMessage(this.f36705b);
        }
    }

    /* loaded from: classes4.dex */
    class r0 extends BroadcastReceiver {
        r0() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            PapaMainV3Fragment_.this.X0(intent);
        }
    }

    /* loaded from: classes4.dex */
    class s implements Runnable {
        s() {
        }

        @Override // java.lang.Runnable
        public void run() {
            PapaMainV3Fragment_.super.Q1();
        }
    }

    /* loaded from: classes4.dex */
    class s0 extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f36709b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ PAPAHomeBeanV7.HomeBeanDTO f36710c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        s0(String str, long j4, String str2, String str3, PAPAHomeBeanV7.HomeBeanDTO homeBeanDTO) {
            super(str, j4, str2);
            this.f36709b = str3;
            this.f36710c = homeBeanDTO;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                PapaMainV3Fragment_.super.P0(this.f36709b, this.f36710c);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class t implements Runnable {
        t() {
        }

        @Override // java.lang.Runnable
        public void run() {
            PapaMainV3Fragment_.super.p1();
        }
    }

    /* loaded from: classes4.dex */
    class t0 extends BroadcastReceiver {

        /* renamed from: b  reason: collision with root package name */
        public static final String f36713b = "gameData";

        t0() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            PapaMainV3Fragment_.this.v1((CollectionBeanSub) (intent.getExtras() != null ? intent.getExtras() : new Bundle()).getSerializable("gameData"));
        }
    }

    /* loaded from: classes4.dex */
    class u implements Runnable {
        u() {
        }

        @Override // java.lang.Runnable
        public void run() {
            PapaMainV3Fragment_.super.showLoding();
        }
    }

    /* loaded from: classes4.dex */
    class u0 implements View.OnClickListener {
        u0() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            PapaMainV3Fragment_.this.I1();
        }
    }

    /* loaded from: classes4.dex */
    class v extends BroadcastReceiver {
        v() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            PapaMainV3Fragment_.this.t1(intent);
        }
    }

    /* loaded from: classes4.dex */
    class v0 implements View.OnClickListener {
        v0() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            PapaMainV3Fragment_.this.o1();
        }
    }

    /* loaded from: classes4.dex */
    class w implements Runnable {
        w() {
        }

        @Override // java.lang.Runnable
        public void run() {
            PapaMainV3Fragment_.super.showLodingFailed();
        }
    }

    /* loaded from: classes4.dex */
    class w0 implements View.OnClickListener {
        w0() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            PapaMainV3Fragment_.this.f1();
        }
    }

    /* loaded from: classes4.dex */
    class x implements Runnable {
        x() {
        }

        @Override // java.lang.Runnable
        public void run() {
            PapaMainV3Fragment_.super.showMain();
        }
    }

    /* loaded from: classes4.dex */
    class x0 implements View.OnClickListener {
        x0() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            PapaMainV3Fragment_.this.relodingimag();
        }
    }

    /* loaded from: classes4.dex */
    class y implements Runnable {
        y() {
        }

        @Override // java.lang.Runnable
        public void run() {
            PapaMainV3Fragment_.super.Y0();
        }
    }

    /* loaded from: classes4.dex */
    public static class y0 extends org.androidannotations.api.builder.d<y0, PapaMainV3Fragment> {
        @Override // org.androidannotations.api.builder.d
        /* renamed from: a */
        public PapaMainV3Fragment build() {
            PapaMainV3Fragment_ papaMainV3Fragment_ = new PapaMainV3Fragment_();
            papaMainV3Fragment_.setArguments(this.args);
            return papaMainV3Fragment_;
        }

        public y0 b(String str) {
            this.args.putString("gameId", str);
            return this;
        }
    }

    /* loaded from: classes4.dex */
    class z implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ HomeFloatData f36724b;

        z(HomeFloatData homeFloatData) {
            this.f36724b = homeFloatData;
        }

        @Override // java.lang.Runnable
        public void run() {
            PapaMainV3Fragment_.super.Y1(this.f36724b);
        }
    }

    public static y0 c3() {
        return new y0();
    }

    private void d3() {
        Bundle arguments = getArguments();
        if (arguments == null || !arguments.containsKey("gameId")) {
            return;
        }
        this.f36611t = arguments.getString("gameId");
    }

    private void init_(Bundle bundle) {
        Resources resources = getActivity().getResources();
        this.f36618z = new PrefDef_(getActivity());
        a4.c.b(this);
        this.f36594e = resources.getString(R.string.net_excption);
        this.f36595f = resources.getString(R.string.connect_server_excption);
        d3();
        this.f36645g2.addAction(o1.a.B);
        this.f36647i2.addAction("android.net.wifi.STATE_CHANGE");
        this.f36647i2.addAction("android.net.wifi.WIFI_STATE_CHANGED");
        this.f36647i2.addAction("android.net.wifi.SCAN_RESULTS");
        this.f36647i2.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        this.f36649k2.addAction("com.broadcast.bespeak.sussess");
        this.f36651m2.addAction("com.papa.maintab.clicked");
        this.f36653o2.addAction(o1.a.I);
        this.f36653o2.addAction(o1.a.G);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.PapaMainV3Fragment
    public void E0(PAPAHomeBeanV7.HomeBeanDTO homeBeanDTO) {
        org.androidannotations.api.b.e("", new c0(homeBeanDTO), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.PapaMainV3Fragment
    public void F0(String str) {
        org.androidannotations.api.a.l(new l0("", 0L, "", str));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.PapaMainV3Fragment
    public void F1(PAPAHomeBeanV7.HomeBeanDTO homeBeanDTO) {
        org.androidannotations.api.b.e("", new b0(homeBeanDTO), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.PapaMainV3Fragment
    public void G1() {
        org.androidannotations.api.b.e("", new o(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.PapaMainV3Fragment
    public void H1(PAPAHomeBeanV7 pAPAHomeBeanV7) {
        org.androidannotations.api.a.l(new p0("", 0L, "", pAPAHomeBeanV7));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.PapaMainV3Fragment
    public void I0() {
        org.androidannotations.api.a.l(new j0("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.PapaMainV3Fragment
    public void J0(PAPAHomeBeanV7.HomeBeanDTO homeBeanDTO) {
        org.androidannotations.api.b.e("", new d0(homeBeanDTO), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.PapaMainV3Fragment
    public void P0(String str, PAPAHomeBeanV7.HomeBeanDTO homeBeanDTO) {
        org.androidannotations.api.a.l(new s0("", 0L, "", str, homeBeanDTO));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.PapaMainV3Fragment
    public void Q0() {
        org.androidannotations.api.a.l(new q0("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.PapaMainV3Fragment
    public void Q1() {
        org.androidannotations.api.b.e("", new s(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.PapaMainV3Fragment
    public void R0() {
        org.androidannotations.api.a.l(new m0("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.PapaMainV3Fragment
    public void T1() {
        org.androidannotations.api.a.l(new k0("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.PapaMainV3Fragment
    public void W0() {
        org.androidannotations.api.a.l(new h0("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.PapaMainV3Fragment
    public void X1() {
        org.androidannotations.api.b.e("", new j(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.PapaMainV3Fragment
    public void Y0() {
        org.androidannotations.api.b.e("", new y(), 2000L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.PapaMainV3Fragment
    public void Y1(HomeFloatData homeFloatData) {
        org.androidannotations.api.b.e("", new z(homeFloatData), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.PapaMainV3Fragment
    public void Z0(int i4, String str) {
        org.androidannotations.api.a.l(new i0("", 0L, "", i4, str));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.PapaMainV3Fragment
    public void Z1() {
        org.androidannotations.api.b.e("", new q(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.PapaMainV3Fragment
    public void a2(List<VipPopData> list) {
        org.androidannotations.api.b.e("", new h(list), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.PapaMainV3Fragment
    public void d1() {
        org.androidannotations.api.b.e("", new f0(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.PapaMainV3Fragment
    public void d2(String str) {
        org.androidannotations.api.b.e("", new i(str), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.PapaMainV3Fragment
    public void e1() {
        org.androidannotations.api.b.e("", new e0(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.PapaMainV3Fragment
    public void f2(PAPAHomeBeanV7 pAPAHomeBeanV7, String str, int i4, boolean z4) {
        org.androidannotations.api.b.e("", new m(pAPAHomeBeanV7, str, i4, z4), 0L);
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.f36644f2.get(cls);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.PapaMainV3Fragment
    public void i2() {
        org.androidannotations.api.b.e("", new a0(), 0L);
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        View view = this.f36643e2;
        if (view == null) {
            return null;
        }
        return (T) view.findViewById(i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.PapaMainV3Fragment
    public void k1() {
        org.androidannotations.api.a.l(new n0("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.PapaMainV3Fragment
    public void l1(String str, int i4) {
        org.androidannotations.api.a.l(new o0("", 0L, "", str, i4));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.PapaMainV3Fragment
    public void m1() {
        org.androidannotations.api.b.e("", new l(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.PapaMainV3Fragment
    public void m2() {
        org.androidannotations.api.b.e("", new g(), 0L);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.f36642d2);
        init_(bundle);
        super.onCreate(bundle);
        getActivity().registerReceiver(this.f36646h2, this.f36645g2);
        getActivity().registerReceiver(this.f36648j2, this.f36647i2);
        getActivity().registerReceiver(this.f36650l2, this.f36649k2);
        getActivity().registerReceiver(this.f36652n2, this.f36651m2);
        getActivity().registerReceiver(this.f36654p2, this.f36653o2);
        a4.c.c(c5);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        this.f36643e2 = onCreateView;
        if (onCreateView == null) {
            this.f36643e2 = layoutInflater.inflate(R.layout.mgpapa_mainfragment_new_layout_v3, viewGroup, false);
        }
        return this.f36643e2;
    }

    @Override // com.join.mgps.activity.PapaMainV3Fragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        getActivity().unregisterReceiver(this.f36646h2);
        getActivity().unregisterReceiver(this.f36648j2);
        getActivity().unregisterReceiver(this.f36650l2);
        getActivity().unregisterReceiver(this.f36652n2);
        getActivity().unregisterReceiver(this.f36654p2);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f36643e2 = null;
        this.f36593d = null;
        this.f36597h = null;
        this.f36598i = null;
        this.f36599j = null;
        this.f36600k = null;
        this.f36601l = null;
        this.f36602m = null;
        this.f36603n = null;
        this.f36604o = null;
        this.f36605p = null;
        this.f36608q = null;
        this.f36609r = null;
        this.f36610s = null;
        this.J = null;
        this.K = null;
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f36593d = (XRecyclerView2) aVar.internalFindViewById(R.id.listview);
        this.f36597h = (TextView) aVar.internalFindViewById(R.id.updateNotice);
        this.f36598i = (LinearLayout) aVar.internalFindViewById(R.id.loding_layout);
        this.f36599j = (LinearLayout) aVar.internalFindViewById(R.id.loding_faile);
        this.f36600k = (ImageView) aVar.internalFindViewById(R.id.movetoTop);
        this.f36601l = aVar.internalFindViewById(R.id.titleSearch);
        this.f36602m = (SimpleDraweeView) aVar.internalFindViewById(R.id.ivFloatad);
        this.f36603n = (ImageView) aVar.internalFindViewById(R.id.imageLoading);
        this.f36604o = aVar.internalFindViewById(R.id.statubar);
        this.f36605p = (FrameLayout) aVar.internalFindViewById(R.id.flTitleSearch);
        this.f36608q = (ViewFlipper) aVar.internalFindViewById(R.id.tvSearchHint);
        this.f36609r = (ImageView) aVar.internalFindViewById(R.id.ivSearchIcon);
        this.f36610s = (AppBarLayout) aVar.internalFindViewById(R.id.appbar);
        this.J = (PtrClassicFrameLayout) aVar.internalFindViewById(R.id.mPtrFrame);
        this.K = aVar.internalFindViewById(R.id.search);
        View internalFindViewById = aVar.internalFindViewById(R.id.relodingimag);
        View internalFindViewById2 = aVar.internalFindViewById(R.id.share);
        View internalFindViewById3 = aVar.internalFindViewById(R.id.setNetwork);
        View view = this.K;
        if (view != null) {
            view.setOnClickListener(new u0());
        }
        ImageView imageView = this.f36600k;
        if (imageView != null) {
            imageView.setOnClickListener(new v0());
        }
        SimpleDraweeView simpleDraweeView = this.f36602m;
        if (simpleDraweeView != null) {
            simpleDraweeView.setOnClickListener(new w0());
        }
        if (internalFindViewById != null) {
            internalFindViewById.setOnClickListener(new x0());
        }
        if (internalFindViewById2 != null) {
            internalFindViewById2.setOnClickListener(new a());
        }
        if (internalFindViewById3 != null) {
            internalFindViewById3.setOnClickListener(new b());
        }
        View view2 = this.f36601l;
        if (view2 != null) {
            view2.setOnClickListener(new c());
        }
        FrameLayout frameLayout = this.f36605p;
        if (frameLayout != null) {
            frameLayout.setOnClickListener(new d());
        }
        ImageView imageView2 = this.f36609r;
        if (imageView2 != null) {
            imageView2.setOnClickListener(new e());
        }
        afterViews();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f36642d2.a(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.PapaMainV3Fragment
    public void p1() {
        org.androidannotations.api.b.e("", new t(), 0L);
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.f36644f2.put(cls, t4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.PapaMainV3Fragment
    public void q1() {
        org.androidannotations.api.b.e("", new n(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.PapaMainV3Fragment
    public void s1() {
        org.androidannotations.api.b.e("", new p(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.PapaMainV3Fragment
    public void showLoding() {
        org.androidannotations.api.b.e("", new u(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.PapaMainV3Fragment
    public void showLodingFailed() {
        org.androidannotations.api.b.e("", new w(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.PapaMainV3Fragment
    public void showMain() {
        org.androidannotations.api.b.e("", new x(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.PapaMainV3Fragment
    public void showMessage(String str) {
        org.androidannotations.api.b.e("", new r(str), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.PapaMainV3Fragment
    public void t1(Intent intent) {
        org.androidannotations.api.b.e("", new f(intent), 0L);
    }
}
