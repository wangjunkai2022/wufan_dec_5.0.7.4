package com.join.mgps.activity;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.Fragment;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.PullableScrollView;
import com.join.mgps.customview.VipView;
import com.join.mgps.dto.RecomCentrebean;
import com.join.mgps.pref.PrefDef_;
import java.util.HashMap;
import java.util.Map;
import org.androidannotations.api.a;
/* loaded from: classes4.dex */
public final class AccountCenterActivity_ extends AccountCenterActivity implements y3.a, a4.a, a4.b {

    /* renamed from: b2  reason: collision with root package name */
    private final a4.c f28261b2 = new a4.c();

    /* renamed from: c2  reason: collision with root package name */
    private final Map<Class<?>, Object> f28262c2 = new HashMap();

    /* renamed from: d2  reason: collision with root package name */
    private final IntentFilter f28263d2 = new IntentFilter();

    /* renamed from: e2  reason: collision with root package name */
    private final BroadcastReceiver f28264e2 = new k();

    /* loaded from: classes4.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            AccountCenterActivity_.this.o0();
        }
    }

    /* loaded from: classes4.dex */
    class a0 implements View.OnClickListener {
        a0() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            AccountCenterActivity_.this.w0();
        }
    }

    /* loaded from: classes4.dex */
    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            AccountCenterActivity_.this.p0();
        }
    }

    /* loaded from: classes4.dex */
    class b0 implements View.OnClickListener {
        b0() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            AccountCenterActivity_.this.v0();
        }
    }

    /* loaded from: classes4.dex */
    class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            AccountCenterActivity_.this.B0();
        }
    }

    /* loaded from: classes4.dex */
    class c0 implements View.OnClickListener {
        c0() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            AccountCenterActivity_.this.A0();
        }
    }

    /* loaded from: classes4.dex */
    class d implements View.OnClickListener {
        d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            AccountCenterActivity_.this.j0();
        }
    }

    /* loaded from: classes4.dex */
    class d0 implements View.OnClickListener {
        d0() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            AccountCenterActivity_.this.r0();
        }
    }

    /* loaded from: classes4.dex */
    class e implements View.OnClickListener {
        e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            AccountCenterActivity_.this.F0();
        }
    }

    /* loaded from: classes4.dex */
    public static class e0 extends org.androidannotations.api.builder.a<e0> {

        /* renamed from: a  reason: collision with root package name */
        private Fragment f28274a;

        public e0(Context context) {
            super(context, AccountCenterActivity_.class);
        }

        @Override // org.androidannotations.api.builder.a, org.androidannotations.api.builder.b
        public org.androidannotations.api.builder.f startForResult(int i4) {
            Fragment fragment = this.f28274a;
            if (fragment != null) {
                fragment.startActivityForResult(this.intent, i4);
            } else {
                Context context = this.context;
                if (context instanceof Activity) {
                    ActivityCompat.startActivityForResult((Activity) context, this.intent, i4, this.lastOptions);
                } else {
                    context.startActivity(this.intent);
                }
            }
            return new org.androidannotations.api.builder.f(this.context);
        }

        public e0(Fragment fragment) {
            super(fragment.getActivity(), AccountCenterActivity_.class);
            this.f28274a = fragment;
        }
    }

    /* loaded from: classes4.dex */
    class f implements View.OnClickListener {
        f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            AccountCenterActivity_.this.x0();
        }
    }

    /* loaded from: classes4.dex */
    class g implements View.OnClickListener {
        g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            AccountCenterActivity_.this.t0();
        }
    }

    /* loaded from: classes4.dex */
    class h implements View.OnClickListener {
        h() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            AccountCenterActivity_.this.k0();
        }
    }

    /* loaded from: classes4.dex */
    class i implements View.OnClickListener {
        i() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            AccountCenterActivity_.this.H0();
        }
    }

    /* loaded from: classes4.dex */
    class j implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ RecomCentrebean f28279b;

        j(RecomCentrebean recomCentrebean) {
            this.f28279b = recomCentrebean;
        }

        @Override // java.lang.Runnable
        public void run() {
            AccountCenterActivity_.super.q0(this.f28279b);
        }
    }

    /* loaded from: classes4.dex */
    class k extends BroadcastReceiver {
        k() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            AccountCenterActivity_.this.I0(context);
        }
    }

    /* loaded from: classes4.dex */
    class l implements Runnable {
        l() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AccountCenterActivity_.super.E0();
        }
    }

    /* loaded from: classes4.dex */
    class m implements Runnable {
        m() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AccountCenterActivity_.super.G0();
        }
    }

    /* loaded from: classes4.dex */
    class n implements Runnable {
        n() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AccountCenterActivity_.super.D0();
        }
    }

    /* loaded from: classes4.dex */
    class o implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f28285b;

        o(int i4) {
            this.f28285b = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            AccountCenterActivity_.super.l0(this.f28285b);
        }
    }

    /* loaded from: classes4.dex */
    class p implements Runnable {
        p() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AccountCenterActivity_.super.z0();
        }
    }

    /* loaded from: classes4.dex */
    class q implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f28288b;

        q(String str) {
            this.f28288b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            AccountCenterActivity_.super.error(this.f28288b);
        }
    }

    /* loaded from: classes4.dex */
    class r implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f28290b;

        r(String str) {
            this.f28290b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            AccountCenterActivity_.super.showMessage(this.f28290b);
        }
    }

    /* loaded from: classes4.dex */
    class s extends a.c {
        s(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                AccountCenterActivity_.super.y0();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class t extends a.c {
        t(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                AccountCenterActivity_.super.m0();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class u extends a.c {
        u(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                AccountCenterActivity_.super.C0();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class v implements View.OnClickListener {
        v() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            AccountCenterActivity_.this.i0();
        }
    }

    /* loaded from: classes4.dex */
    class w extends a.c {
        w(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                AccountCenterActivity_.super.touristLogin();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class x implements View.OnClickListener {
        x() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            AccountCenterActivity_.this.s0();
        }
    }

    /* loaded from: classes4.dex */
    class y implements View.OnClickListener {
        y() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            AccountCenterActivity_.this.back_image();
        }
    }

    /* loaded from: classes4.dex */
    class z implements View.OnClickListener {
        z() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            AccountCenterActivity_.this.u0();
        }
    }

    public static e0 X0(Context context) {
        return new e0(context);
    }

    public static e0 Y0(Fragment fragment) {
        return new e0(fragment);
    }

    private void init_(Bundle bundle) {
        this.C = new PrefDef_(this);
        a4.c.b(this);
        this.f28263d2.addAction(o1.a.B);
        registerReceiver(this.f28264e2, this.f28263d2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.AccountCenterActivity
    public void C0() {
        org.androidannotations.api.a.l(new u("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.AccountCenterActivity
    public void D0() {
        org.androidannotations.api.b.e("", new n(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.AccountCenterActivity
    public void E0() {
        org.androidannotations.api.b.e("", new l(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.AccountCenterActivity
    public void G0() {
        org.androidannotations.api.b.e("", new m(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.AccountCenterActivity
    public void error(String str) {
        org.androidannotations.api.b.e("", new q(str), 0L);
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.f28262c2.get(cls);
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        return (T) findViewById(i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.AccountCenterActivity
    public void l0(int i4) {
        org.androidannotations.api.b.e("", new o(i4), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.AccountCenterActivity
    public void m0() {
        org.androidannotations.api.a.l(new t("", 0L, ""));
    }

    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.f28261b2);
        init_(bundle);
        super.onCreate(bundle);
        a4.c.c(c5);
        setContentView(R.layout.mg_account_center);
    }

    @Override // com.join.mgps.activity.AccountCenterActivity, com.BaseActivity, com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        unregisterReceiver(this.f28264e2);
        super.onDestroy();
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f28217b = (SimpleDraweeView) aVar.internalFindViewById(R.id.avatar);
        this.f28218c = (TextView) aVar.internalFindViewById(R.id.levelBadge);
        this.f28219d = (TextView) aVar.internalFindViewById(R.id.nickname);
        this.f28220e = (TextView) aVar.internalFindViewById(R.id.account);
        this.f28221f = (TextView) aVar.internalFindViewById(R.id.tourTip);
        this.f28222g = (LinearLayout) aVar.internalFindViewById(R.id.vip_lay);
        this.f28223h = (TextView) aVar.internalFindViewById(R.id.papaBrasss);
        this.f28224i = (RelativeLayout) aVar.internalFindViewById(R.id.mGiftBox);
        this.f28225j = (RelativeLayout) aVar.internalFindViewById(R.id.mPosts);
        this.f28226k = (RelativeLayout) aVar.internalFindViewById(R.id.mMessages);
        this.f28227l = (RelativeLayout) aVar.internalFindViewById(R.id.tools);
        this.f28228m = (TextView) aVar.internalFindViewById(R.id.messageBadge);
        this.f28229n = (TextView) aVar.internalFindViewById(R.id.signBadge);
        this.f28230o = (TextView) aVar.internalFindViewById(R.id.papaMoney);
        this.f28231p = (ImageView) aVar.internalFindViewById(R.id.userIconBg);
        this.f28234q = (TextView) aVar.internalFindViewById(R.id.pabiAd);
        this.f28235r = (TextView) aVar.internalFindViewById(R.id.couponNumber);
        this.f28236s = (RelativeLayout) aVar.internalFindViewById(R.id.signIn);
        this.f28237t = (RelativeLayout) aVar.internalFindViewById(R.id.mBrass);
        this.f28238u = (RelativeLayout) aVar.internalFindViewById(R.id.liveLayout);
        this.f28239v = (TextView) aVar.internalFindViewById(R.id.papaliveText);
        this.f28241w = (RelativeLayout) aVar.internalFindViewById(R.id.paCreditCenter);
        this.f28242x = (RelativeLayout) aVar.internalFindViewById(R.id.joystick);
        this.f28243y = (FrameLayout) aVar.internalFindViewById(R.id.userLogin);
        this.f28244z = (RelativeLayout) aVar.internalFindViewById(R.id.downloads);
        this.A = (RelativeLayout) aVar.internalFindViewById(R.id.feedback);
        this.B = (RelativeLayout) aVar.internalFindViewById(R.id.papaMore);
        this.I = (PullableScrollView) aVar.internalFindViewById(R.id.scrollView);
        this.J = (RelativeLayout) aVar.internalFindViewById(R.id.back_layout);
        this.K = (ImageView) aVar.internalFindViewById(R.id.back_image);
        this.L = (TextView) aVar.internalFindViewById(R.id.title_textview);
        this.M = (RelativeLayout) aVar.internalFindViewById(R.id.myGameTip);
        this.O = aVar.internalFindViewById(R.id.accountCenterLine);
        this.P = (ImageView) aVar.internalFindViewById(R.id.userisLogin);
        this.Q = (LinearLayout) aVar.internalFindViewById(R.id.layoutText);
        this.R = (ImageView) aVar.internalFindViewById(R.id.accountCenterImageView);
        this.S = (ImageView) aVar.internalFindViewById(R.id.accountCenterMsgBg);
        this.T = (SimpleDraweeView) aVar.internalFindViewById(R.id.img_brass);
        this.U = (TextView) aVar.internalFindViewById(R.id.brass_title);
        this.V = (VipView) aVar.internalFindViewById(R.id.vipText);
        this.W = (VipView) aVar.internalFindViewById(R.id.svipText);
        this.X = (VipView) aVar.internalFindViewById(R.id.vipItem);
        this.Y = (TextView) aVar.internalFindViewById(R.id.vipMessage);
        this.C1 = (RelativeLayout) aVar.internalFindViewById(R.id.paVip);
        this.D1 = (SimpleDraweeView) aVar.internalFindViewById(R.id.paVipIcon);
        this.E1 = (RelativeLayout) aVar.internalFindViewById(R.id.myVoucher);
        this.F1 = (SimpleDraweeView) aVar.internalFindViewById(R.id.img_voucher);
        this.G1 = (SimpleDraweeView) aVar.internalFindViewById(R.id.img_gift);
        this.H1 = (SimpleDraweeView) aVar.internalFindViewById(R.id.paCreditCenterIcon);
        this.Q1 = (LinearLayout) aVar.internalFindViewById(R.id.vip_lay_1);
        this.R1 = (LinearLayout) aVar.internalFindViewById(R.id.vip_lay_2);
        this.S1 = (SimpleDraweeView) aVar.internalFindViewById(R.id.vip_icon_1);
        this.T1 = (SimpleDraweeView) aVar.internalFindViewById(R.id.vip_icon_2);
        this.U1 = (TextView) aVar.internalFindViewById(R.id.vip_1_txt);
        this.V1 = (TextView) aVar.internalFindViewById(R.id.vip_2_txt);
        this.W1 = (TextView) aVar.internalFindViewById(R.id.paVipAd);
        this.X1 = (TextView) aVar.internalFindViewById(R.id.couponNumberTxt);
        this.Y1 = (TextView) aVar.internalFindViewById(R.id.game_packs_txt);
        this.Z1 = aVar.internalFindViewById(R.id.vip_lay_2_line);
        View internalFindViewById = aVar.internalFindViewById(R.id.face_transfer_rl);
        ImageView imageView = this.R;
        if (imageView != null) {
            imageView.setOnClickListener(new v());
        }
        RelativeLayout relativeLayout = this.f28238u;
        if (relativeLayout != null) {
            relativeLayout.setOnClickListener(new x());
        }
        ImageView imageView2 = this.K;
        if (imageView2 != null) {
            imageView2.setOnClickListener(new y());
        }
        RelativeLayout relativeLayout2 = this.f28224i;
        if (relativeLayout2 != null) {
            relativeLayout2.setOnClickListener(new z());
        }
        RelativeLayout relativeLayout3 = this.f28225j;
        if (relativeLayout3 != null) {
            relativeLayout3.setOnClickListener(new a0());
        }
        RelativeLayout relativeLayout4 = this.f28226k;
        if (relativeLayout4 != null) {
            relativeLayout4.setOnClickListener(new b0());
        }
        RelativeLayout relativeLayout5 = this.f28241w;
        if (relativeLayout5 != null) {
            relativeLayout5.setOnClickListener(new c0());
        }
        RelativeLayout relativeLayout6 = this.f28242x;
        if (relativeLayout6 != null) {
            relativeLayout6.setOnClickListener(new d0());
        }
        RelativeLayout relativeLayout7 = this.f28244z;
        if (relativeLayout7 != null) {
            relativeLayout7.setOnClickListener(new a());
        }
        RelativeLayout relativeLayout8 = this.A;
        if (relativeLayout8 != null) {
            relativeLayout8.setOnClickListener(new b());
        }
        RelativeLayout relativeLayout9 = this.B;
        if (relativeLayout9 != null) {
            relativeLayout9.setOnClickListener(new c());
        }
        RelativeLayout relativeLayout10 = this.J;
        if (relativeLayout10 != null) {
            relativeLayout10.setOnClickListener(new d());
        }
        RelativeLayout relativeLayout11 = this.f28236s;
        if (relativeLayout11 != null) {
            relativeLayout11.setOnClickListener(new e());
        }
        RelativeLayout relativeLayout12 = this.E1;
        if (relativeLayout12 != null) {
            relativeLayout12.setOnClickListener(new f());
        }
        RelativeLayout relativeLayout13 = this.f28237t;
        if (relativeLayout13 != null) {
            relativeLayout13.setOnClickListener(new g());
        }
        if (internalFindViewById != null) {
            internalFindViewById.setOnClickListener(new h());
        }
        RelativeLayout relativeLayout14 = this.f28227l;
        if (relativeLayout14 != null) {
            relativeLayout14.setOnClickListener(new i());
        }
        afterViews();
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.f28262c2.put(cls, t4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.AccountCenterActivity
    public void q0(RecomCentrebean recomCentrebean) {
        org.androidannotations.api.b.e("", new j(recomCentrebean), 0L);
    }

    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i4) {
        super.setContentView(i4);
        this.f28261b2.a(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.AccountCenterActivity
    public void showMessage(String str) {
        org.androidannotations.api.b.e("", new r(str), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.AccountCenterActivity
    public void touristLogin() {
        org.androidannotations.api.a.l(new w("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.AccountCenterActivity
    public void y0() {
        org.androidannotations.api.a.l(new s("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.AccountCenterActivity
    public void z0() {
        org.androidannotations.api.b.e("", new p(), 0L);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        this.f28261b2.a(this);
    }

    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        super.setContentView(view);
        this.f28261b2.a(this);
    }
}
