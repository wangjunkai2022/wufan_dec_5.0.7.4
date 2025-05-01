package com.join.mgps.activity;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.Fragment;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.IntentDateBean;
import com.join.mgps.activity.MGGameDetailActivity;
import com.join.mgps.customview.CustomerDownloadView;
import com.join.mgps.customview.ScrollTextViewLayout;
import com.join.mgps.dto.CollectionBeanSub;
import com.join.mgps.dto.CommentBaseBean;
import com.join.mgps.dto.CommentResponse;
import com.join.mgps.dto.DetailResultBeanV3;
import com.join.mgps.dto.ExtBean;
import com.join.mgps.dto.GameFromPopoWinBean;
import com.join.mgps.dto.GameVoucherBean;
import com.join.mgps.dto.GiftPackageDataInfoBean;
import com.join.mgps.dto.GiftPackageDataOperationBean;
import com.join.mgps.dto.InformationCommentBean;
import com.join.mgps.dto.ResultMainBean;
import com.join.mgps.pref.PrefDef_;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.androidannotations.api.a;
/* loaded from: classes4.dex */
public final class MGGameDetailActivity_ extends MGGameDetailActivity implements y3.a, a4.a, a4.b {

    /* renamed from: r2  reason: collision with root package name */
    public static final String f34402r2 = "intentdate";

    /* renamed from: s2  reason: collision with root package name */
    public static final String f34403s2 = "extBean";

    /* renamed from: l2  reason: collision with root package name */
    private final a4.c f34404l2 = new a4.c();

    /* renamed from: m2  reason: collision with root package name */
    private final Map<Class<?>, Object> f34405m2 = new HashMap();

    /* renamed from: n2  reason: collision with root package name */
    private final IntentFilter f34406n2 = new IntentFilter();

    /* renamed from: o2  reason: collision with root package name */
    private final BroadcastReceiver f34407o2 = new k();

    /* renamed from: p2  reason: collision with root package name */
    private final IntentFilter f34408p2 = new IntentFilter();

    /* renamed from: q2  reason: collision with root package name */
    private final BroadcastReceiver f34409q2 = new v();

    /* loaded from: classes4.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MGGameDetailActivity_.this.relodingimag();
        }
    }

    /* loaded from: classes4.dex */
    class a0 implements Runnable {
        a0() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MGGameDetailActivity_.super.showLodingFailed();
        }
    }

    /* loaded from: classes4.dex */
    class a1 extends a.c {
        a1(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                MGGameDetailActivity_.super.I0();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MGGameDetailActivity_.this.setNetwork();
        }
    }

    /* loaded from: classes4.dex */
    class b0 implements Runnable {
        b0() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MGGameDetailActivity_.super.Y1();
        }
    }

    /* loaded from: classes4.dex */
    class b1 extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ InformationCommentBean f34415b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b1(String str, long j4, String str2, InformationCommentBean informationCommentBean) {
            super(str, j4, str2);
            this.f34415b = informationCommentBean;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                MGGameDetailActivity_.super.c1(this.f34415b);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MGGameDetailActivity_.this.back_image();
        }
    }

    /* loaded from: classes4.dex */
    class c0 implements Runnable {
        c0() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MGGameDetailActivity_.super.V1();
        }
    }

    /* loaded from: classes4.dex */
    class c1 implements View.OnClickListener {
        c1() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MGGameDetailActivity_.this.i1();
        }
    }

    /* loaded from: classes4.dex */
    class d implements View.OnClickListener {
        d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MGGameDetailActivity_.this.b2();
        }
    }

    /* loaded from: classes4.dex */
    class d0 implements Runnable {
        d0() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MGGameDetailActivity_.super.g2();
        }
    }

    /* loaded from: classes4.dex */
    class d1 extends a.c {
        d1(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                MGGameDetailActivity_.super.checkDownlodingNumber();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class e implements View.OnClickListener {
        e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MGGameDetailActivity_.this.u0();
        }
    }

    /* loaded from: classes4.dex */
    class e0 implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f34424b;

        e0(int i4) {
            this.f34424b = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            MGGameDetailActivity_.super.updateLine(this.f34424b);
        }
    }

    /* loaded from: classes4.dex */
    class e1 extends a.c {
        e1(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                MGGameDetailActivity_.super.getDownloadTaskInfo();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class f implements View.OnClickListener {
        f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MGGameDetailActivity_.this.d2();
        }
    }

    /* loaded from: classes4.dex */
    class f0 implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f34428b;

        f0(int i4) {
            this.f34428b = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            MGGameDetailActivity_.super.updateDownloadingPoint(this.f34428b);
        }
    }

    /* loaded from: classes4.dex */
    class f1 extends a.c {
        f1(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                MGGameDetailActivity_.super.J0();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class g implements View.OnClickListener {
        g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MGGameDetailActivity_.this.c2();
        }
    }

    /* loaded from: classes4.dex */
    class g0 implements View.OnClickListener {
        g0() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MGGameDetailActivity_.this.downloadLayout();
        }
    }

    /* loaded from: classes4.dex */
    class g1 extends a.c {
        g1(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                MGGameDetailActivity_.super.g0();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class h implements Runnable {
        h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MGGameDetailActivity_.super.P0();
        }
    }

    /* loaded from: classes4.dex */
    class h0 implements Runnable {
        h0() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MGGameDetailActivity_.super.updateNoOpenPoint();
        }
    }

    /* loaded from: classes4.dex */
    class h1 extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f34436b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f34437c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ MGGameDetailActivity.w f34438d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h1(String str, long j4, String str2, String str3, String str4, MGGameDetailActivity.w wVar) {
            super(str, j4, str2);
            this.f34436b = str3;
            this.f34437c = str4;
            this.f34438d = wVar;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                MGGameDetailActivity_.super.h0(this.f34436b, this.f34437c, this.f34438d);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class i implements Runnable {
        i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MGGameDetailActivity_.super.f1();
        }
    }

    /* loaded from: classes4.dex */
    class i0 implements Runnable {
        i0() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MGGameDetailActivity_.super.updateDownloadView();
        }
    }

    /* loaded from: classes4.dex */
    class i1 implements View.OnClickListener {
        i1() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MGGameDetailActivity_.this.R1();
        }
    }

    /* loaded from: classes4.dex */
    class j implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ GiftPackageDataInfoBean f34443b;

        j(GiftPackageDataInfoBean giftPackageDataInfoBean) {
            this.f34443b = giftPackageDataInfoBean;
        }

        @Override // java.lang.Runnable
        public void run() {
            MGGameDetailActivity_.super.T1(this.f34443b);
        }
    }

    /* loaded from: classes4.dex */
    class j0 implements Runnable {
        j0() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MGGameDetailActivity_.super.Z1();
        }
    }

    /* loaded from: classes4.dex */
    class j1 implements View.OnClickListener {
        j1() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MGGameDetailActivity_.this.d1();
        }
    }

    /* loaded from: classes4.dex */
    class k extends BroadcastReceiver {
        k() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            MGGameDetailActivity_.this.b1(intent);
        }
    }

    /* loaded from: classes4.dex */
    class k0 implements Runnable {
        k0() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MGGameDetailActivity_.super.a2();
        }
    }

    /* loaded from: classes4.dex */
    class k1 implements View.OnClickListener {
        k1() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MGGameDetailActivity_.this.S0();
        }
    }

    /* loaded from: classes4.dex */
    class l implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ GiftPackageDataOperationBean f34450b;

        l(GiftPackageDataOperationBean giftPackageDataOperationBean) {
            this.f34450b = giftPackageDataOperationBean;
        }

        @Override // java.lang.Runnable
        public void run() {
            MGGameDetailActivity_.super.U1(this.f34450b);
        }
    }

    /* loaded from: classes4.dex */
    class l0 implements Runnable {
        l0() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MGGameDetailActivity_.super.i0();
        }
    }

    /* loaded from: classes4.dex */
    class l1 implements View.OnClickListener {
        l1() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MGGameDetailActivity_.this.D0();
        }
    }

    /* loaded from: classes4.dex */
    class m implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f34454b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f34455c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f34456d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f34457e;

        m(String str, boolean z4, int i4, int i5) {
            this.f34454b = str;
            this.f34455c = z4;
            this.f34456d = i4;
            this.f34457e = i5;
        }

        @Override // java.lang.Runnable
        public void run() {
            MGGameDetailActivity_.super.g1(this.f34454b, this.f34455c, this.f34456d, this.f34457e);
        }
    }

    /* loaded from: classes4.dex */
    class m0 implements Runnable {
        m0() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MGGameDetailActivity_.super.h2();
        }
    }

    /* loaded from: classes4.dex */
    public static class m1 extends org.androidannotations.api.builder.a<m1> {

        /* renamed from: a  reason: collision with root package name */
        private Fragment f34460a;

        public m1(Context context) {
            super(context, MGGameDetailActivity_.class);
        }

        public m1 a(ExtBean extBean) {
            return (m1) super.extra("extBean", extBean);
        }

        public m1 b(IntentDateBean intentDateBean) {
            return (m1) super.extra("intentdate", intentDateBean);
        }

        @Override // org.androidannotations.api.builder.a, org.androidannotations.api.builder.b
        public org.androidannotations.api.builder.f startForResult(int i4) {
            Fragment fragment = this.f34460a;
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

        public m1(Fragment fragment) {
            super(fragment.getActivity(), MGGameDetailActivity_.class);
            this.f34460a = fragment;
        }
    }

    /* loaded from: classes4.dex */
    class n implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CommentResponse f34461b;

        n(CommentResponse commentResponse) {
            this.f34461b = commentResponse;
        }

        @Override // java.lang.Runnable
        public void run() {
            MGGameDetailActivity_.super.h1(this.f34461b);
        }
    }

    /* loaded from: classes4.dex */
    class n0 implements Runnable {
        n0() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MGGameDetailActivity_.super.e2();
        }
    }

    /* loaded from: classes4.dex */
    class o implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f34464b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f34465c;

        o(int i4, int i5) {
            this.f34464b = i4;
            this.f34465c = i5;
        }

        @Override // java.lang.Runnable
        public void run() {
            MGGameDetailActivity_.super.w0(this.f34464b, this.f34465c);
        }
    }

    /* loaded from: classes4.dex */
    class o0 implements Runnable {
        o0() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MGGameDetailActivity_.super.Q0();
        }
    }

    /* loaded from: classes4.dex */
    class p implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f34468b;

        p(boolean z4) {
            this.f34468b = z4;
        }

        @Override // java.lang.Runnable
        public void run() {
            MGGameDetailActivity_.super.i2(this.f34468b);
        }
    }

    /* loaded from: classes4.dex */
    class p0 implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ GameFromPopoWinBean f34470b;

        p0(GameFromPopoWinBean gameFromPopoWinBean) {
            this.f34470b = gameFromPopoWinBean;
        }

        @Override // java.lang.Runnable
        public void run() {
            MGGameDetailActivity_.super.s0(this.f34470b);
        }
    }

    /* loaded from: classes4.dex */
    class q implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ResultMainBean f34472b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f34473c;

        q(ResultMainBean resultMainBean, int i4) {
            this.f34472b = resultMainBean;
            this.f34473c = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            MGGameDetailActivity_.super.j2(this.f34472b, this.f34473c);
        }
    }

    /* loaded from: classes4.dex */
    class q0 implements Runnable {
        q0() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MGGameDetailActivity_.super.y0();
        }
    }

    /* loaded from: classes4.dex */
    class r implements Runnable {
        r() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MGGameDetailActivity_.super.X0();
        }
    }

    /* loaded from: classes4.dex */
    class r0 implements View.OnClickListener {
        r0() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MGGameDetailActivity_.this.z0();
        }
    }

    /* loaded from: classes4.dex */
    class s implements Runnable {
        s() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MGGameDetailActivity_.super.f2();
        }
    }

    /* loaded from: classes4.dex */
    class s0 implements Runnable {
        s0() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MGGameDetailActivity_.super.R0();
        }
    }

    /* loaded from: classes4.dex */
    class t implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f34480b;

        t(String str) {
            this.f34480b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            MGGameDetailActivity_.super.showToast(this.f34480b);
        }
    }

    /* loaded from: classes4.dex */
    class t0 extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ GameVoucherBean f34482b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        t0(String str, long j4, String str2, GameVoucherBean gameVoucherBean) {
            super(str, j4, str2);
            this.f34482b = gameVoucherBean;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                MGGameDetailActivity_.super.N0(this.f34482b);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class u implements Runnable {
        u() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MGGameDetailActivity_.super.T0();
        }
    }

    /* loaded from: classes4.dex */
    class u0 extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ GiftPackageDataInfoBean f34485b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        u0(String str, long j4, String str2, GiftPackageDataInfoBean giftPackageDataInfoBean) {
            super(str, j4, str2);
            this.f34485b = giftPackageDataInfoBean;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                MGGameDetailActivity_.super.K0(this.f34485b);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class v extends BroadcastReceiver {

        /* renamed from: b  reason: collision with root package name */
        public static final String f34487b = "gameData";

        v() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            MGGameDetailActivity_.this.W0((CollectionBeanSub) (intent.getExtras() != null ? intent.getExtras() : new Bundle()).getSerializable("gameData"));
        }
    }

    /* loaded from: classes4.dex */
    class v0 extends a.c {
        v0(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                MGGameDetailActivity_.super.M0();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class w implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f34490b;

        w(List list) {
            this.f34490b = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            MGGameDetailActivity_.super.X1(this.f34490b);
        }
    }

    /* loaded from: classes4.dex */
    class w0 extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CommentBaseBean f34492b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f34493c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f34494d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        w0(String str, long j4, String str2, CommentBaseBean commentBaseBean, int i4, int i5) {
            super(str, j4, str2);
            this.f34492b = commentBaseBean;
            this.f34493c = i4;
            this.f34494d = i5;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                MGGameDetailActivity_.super.Y0(this.f34492b, this.f34493c, this.f34494d);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class x implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DetailResultBeanV3 f34496b;

        x(DetailResultBeanV3 detailResultBeanV3) {
            this.f34496b = detailResultBeanV3;
        }

        @Override // java.lang.Runnable
        public void run() {
            MGGameDetailActivity_.super.W1(this.f34496b);
        }
    }

    /* loaded from: classes4.dex */
    class x0 extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CommentBaseBean f34498b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f34499c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f34500d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        x0(String str, long j4, String str2, CommentBaseBean commentBaseBean, int i4, int i5) {
            super(str, j4, str2);
            this.f34498b = commentBaseBean;
            this.f34499c = i4;
            this.f34500d = i5;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                MGGameDetailActivity_.super.a1(this.f34498b, this.f34499c, this.f34500d);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class y implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DetailResultBeanV3 f34502b;

        y(DetailResultBeanV3 detailResultBeanV3) {
            this.f34502b = detailResultBeanV3;
        }

        @Override // java.lang.Runnable
        public void run() {
            MGGameDetailActivity_.super.p1(this.f34502b);
        }
    }

    /* loaded from: classes4.dex */
    class y0 extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f34504b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        y0(String str, long j4, String str2, int i4) {
            super(str, j4, str2);
            this.f34504b = i4;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                MGGameDetailActivity_.super.v0(this.f34504b);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class z implements Runnable {
        z() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MGGameDetailActivity_.super.showLoding();
        }
    }

    /* loaded from: classes4.dex */
    class z0 extends a.c {
        z0(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                MGGameDetailActivity_.super.H0();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    public static m1 g3(Context context) {
        return new m1(context);
    }

    public static m1 h3(Fragment fragment) {
        return new m1(fragment);
    }

    private void init_(Bundle bundle) {
        this.J = new PrefDef_(this);
        a4.c.b(this);
        injectExtras_();
        this.f34406n2.addAction("com.join,mgps.sim.sdkgamePayfinish");
        this.f34408p2.addAction(o1.a.I);
        this.f34408p2.addAction(o1.a.G);
        registerReceiver(this.f34407o2, this.f34406n2);
        registerReceiver(this.f34409q2, this.f34408p2);
    }

    private void injectExtras_() {
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            if (extras.containsKey("intentdate")) {
                this.H = (IntentDateBean) extras.getSerializable("intentdate");
            }
            if (extras.containsKey("extBean")) {
                this.I = (ExtBean) extras.getSerializable("extBean");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MGGameDetailActivity
    public void H0() {
        org.androidannotations.api.a.l(new z0("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MGGameDetailActivity
    public void I0() {
        org.androidannotations.api.a.l(new a1("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MGGameDetailActivity
    public void J0() {
        org.androidannotations.api.a.l(new f1("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MGGameDetailActivity
    public void K0(GiftPackageDataInfoBean giftPackageDataInfoBean) {
        org.androidannotations.api.a.l(new u0("", 0L, "", giftPackageDataInfoBean));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MGGameDetailActivity
    public void M0() {
        org.androidannotations.api.a.l(new v0("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MGGameDetailActivity
    public void N0(GameVoucherBean gameVoucherBean) {
        org.androidannotations.api.a.l(new t0("", 0L, "", gameVoucherBean));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MGGameDetailActivity
    public void P0() {
        org.androidannotations.api.b.e("", new h(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MGGameDetailActivity
    public void Q0() {
        org.androidannotations.api.b.e("", new o0(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MGGameDetailActivity
    public void R0() {
        org.androidannotations.api.b.e("", new s0(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MGGameDetailActivity
    public void T0() {
        org.androidannotations.api.b.e("", new u(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MGGameDetailActivity
    public void T1(GiftPackageDataInfoBean giftPackageDataInfoBean) {
        org.androidannotations.api.b.e("", new j(giftPackageDataInfoBean), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MGGameDetailActivity
    public void U1(GiftPackageDataOperationBean giftPackageDataOperationBean) {
        org.androidannotations.api.b.e("", new l(giftPackageDataOperationBean), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MGGameDetailActivity
    public void V1() {
        org.androidannotations.api.b.e("", new c0(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MGGameDetailActivity
    public void W1(DetailResultBeanV3 detailResultBeanV3) {
        org.androidannotations.api.b.e("", new x(detailResultBeanV3), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MGGameDetailActivity
    public void X0() {
        org.androidannotations.api.b.e("", new r(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MGGameDetailActivity
    public void X1(List<CommentBaseBean> list) {
        org.androidannotations.api.b.e("", new w(list), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MGGameDetailActivity
    public void Y0(CommentBaseBean commentBaseBean, int i4, int i5) {
        org.androidannotations.api.a.l(new w0("", 0L, "", commentBaseBean, i4, i5));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MGGameDetailActivity
    public void Y1() {
        org.androidannotations.api.b.e("", new b0(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MGGameDetailActivity
    public void Z1() {
        org.androidannotations.api.b.e("", new j0(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MGGameDetailActivity
    public void a1(CommentBaseBean commentBaseBean, int i4, int i5) {
        org.androidannotations.api.a.l(new x0("", 0L, "", commentBaseBean, i4, i5));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MGGameDetailActivity
    public void a2() {
        org.androidannotations.api.b.e("", new k0(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MGGameDetailActivity
    public void c1(InformationCommentBean informationCommentBean) {
        org.androidannotations.api.a.l(new b1("", 0L, "", informationCommentBean));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MGGameDetailActivity
    public void checkDownlodingNumber() {
        org.androidannotations.api.a.l(new d1("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MGGameDetailActivity
    public void e2() {
        org.androidannotations.api.b.e("", new n0(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MGGameDetailActivity
    public void f1() {
        org.androidannotations.api.b.e("", new i(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MGGameDetailActivity
    public void f2() {
        org.androidannotations.api.b.e("", new s(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MGGameDetailActivity
    public void g0() {
        org.androidannotations.api.a.l(new g1("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MGGameDetailActivity
    public void g1(String str, boolean z4, int i4, int i5) {
        org.androidannotations.api.b.e("", new m(str, z4, i4, i5), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MGGameDetailActivity
    public void g2() {
        org.androidannotations.api.b.e("", new d0(), 0L);
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.f34405m2.get(cls);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MGGameDetailActivity
    public void getDownloadTaskInfo() {
        org.androidannotations.api.a.l(new e1("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MGGameDetailActivity
    public void h0(String str, String str2, MGGameDetailActivity.w wVar) {
        org.androidannotations.api.a.l(new h1("", 0L, "", str, str2, wVar));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MGGameDetailActivity
    public void h1(CommentResponse commentResponse) {
        org.androidannotations.api.b.e("", new n(commentResponse), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MGGameDetailActivity
    public void h2() {
        org.androidannotations.api.b.e("", new m0(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MGGameDetailActivity
    public void i0() {
        org.androidannotations.api.b.e("", new l0(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MGGameDetailActivity
    public void i2(boolean z4) {
        org.androidannotations.api.b.e("", new p(z4), 1000L);
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        return (T) findViewById(i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MGGameDetailActivity
    public void j2(ResultMainBean resultMainBean, int i4) {
        org.androidannotations.api.b.e("", new q(resultMainBean, i4), 0L);
    }

    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.f34404l2);
        init_(bundle);
        super.onCreate(bundle);
        a4.c.c(c5);
        setContentView(R.layout.mg_game_detail_layout);
    }

    @Override // com.join.mgps.activity.MGGameDetailActivity, com.BaseActivity, com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        unregisterReceiver(this.f34407o2);
        unregisterReceiver(this.f34409q2);
        super.onDestroy();
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f34332b = aVar.internalFindViewById(R.id.topBarline);
        this.f34334c = (RelativeLayout) aVar.internalFindViewById(R.id.title_bar_layout);
        this.f34336d = (RelativeLayout) aVar.internalFindViewById(R.id.downloadRLayout2);
        this.f34338e = (LinearLayout) aVar.internalFindViewById(R.id.loding_faile);
        this.f34340f = (LinearLayout) aVar.internalFindViewById(R.id.loding_layout);
        this.f34342g = (TextView) aVar.internalFindViewById(R.id.gameDescribeInit);
        this.f34344h = (ListView) aVar.internalFindViewById(R.id.gameListView);
        this.f34345i = (RelativeLayout) aVar.internalFindViewById(R.id.detialDownBottom);
        this.f34346j = (TextView) aVar.internalFindViewById(R.id.title_textview);
        this.f34347k = (ImageView) aVar.internalFindViewById(R.id.back_image);
        this.f34348l = (TextView) aVar.internalFindViewById(R.id.instalButtomButn);
        this.f34349m = (RelativeLayout) aVar.internalFindViewById(R.id.progressbarLayout);
        this.f34350n = (RelativeLayout) aVar.internalFindViewById(R.id.instalbutnLayout);
        this.f34351o = (ImageView) aVar.internalFindViewById(R.id.butn_showdownload);
        this.f34352p = (TextView) aVar.internalFindViewById(R.id.percent);
        this.f34355q = (ProgressBar) aVar.internalFindViewById(R.id.butnProgressBar);
        this.f34356r = (LinearLayout) aVar.internalFindViewById(R.id.downloadLayout);
        this.f34357s = (TextView) aVar.internalFindViewById(R.id.scroll_text);
        this.f34358t = (TextView) aVar.internalFindViewById(R.id.biground);
        this.f34359u = (ScrollTextViewLayout) aVar.internalFindViewById(R.id.scroll_text_layout);
        this.f34360v = (ImageView) aVar.internalFindViewById(R.id.hasNewFinishedGameImage);
        this.f34362w = (ImageView) aVar.internalFindViewById(R.id.downloadLine);
        this.f34363x = (ImageView) aVar.internalFindViewById(R.id.imageLoading);
        this.f34364y = (ImageView) aVar.internalFindViewById(R.id.search_detial_image);
        this.f34365z = (ImageView) aVar.internalFindViewById(R.id.title_normal_search_img);
        this.A = aVar.internalFindViewById(R.id.linebutn);
        this.B = (ImageView) aVar.internalFindViewById(R.id.share);
        this.C = (RelativeLayout) aVar.internalFindViewById(R.id.container);
        this.D = (ImageView) aVar.internalFindViewById(R.id.backBtn);
        this.E = (CustomerDownloadView) aVar.internalFindViewById(R.id.title_normal_download_cdv);
        View internalFindViewById = aVar.internalFindViewById(R.id.detial_search_layout);
        View internalFindViewById2 = aVar.internalFindViewById(R.id.search_detial_back);
        View internalFindViewById3 = aVar.internalFindViewById(R.id.progress_layout);
        View internalFindViewById4 = aVar.internalFindViewById(R.id.downloadRLayout);
        View internalFindViewById5 = aVar.internalFindViewById(R.id.relodingimag);
        View internalFindViewById6 = aVar.internalFindViewById(R.id.setNetwork);
        LinearLayout linearLayout = this.f34356r;
        if (linearLayout != null) {
            linearLayout.setOnClickListener(new g0());
        }
        if (internalFindViewById != null) {
            internalFindViewById.setOnClickListener(new r0());
        }
        if (internalFindViewById2 != null) {
            internalFindViewById2.setOnClickListener(new c1());
        }
        ImageView imageView = this.B;
        if (imageView != null) {
            imageView.setOnClickListener(new i1());
        }
        if (internalFindViewById3 != null) {
            internalFindViewById3.setOnClickListener(new j1());
        }
        TextView textView = this.f34348l;
        if (textView != null) {
            textView.setOnClickListener(new k1());
        }
        if (internalFindViewById4 != null) {
            internalFindViewById4.setOnClickListener(new l1());
        }
        if (internalFindViewById5 != null) {
            internalFindViewById5.setOnClickListener(new a());
        }
        if (internalFindViewById6 != null) {
            internalFindViewById6.setOnClickListener(new b());
        }
        ImageView imageView2 = this.f34347k;
        if (imageView2 != null) {
            imageView2.setOnClickListener(new c());
        }
        RelativeLayout relativeLayout = this.f34334c;
        if (relativeLayout != null) {
            relativeLayout.setOnClickListener(new d());
        }
        ImageView imageView3 = this.D;
        if (imageView3 != null) {
            imageView3.setOnClickListener(new e());
        }
        ImageView imageView4 = this.f34365z;
        if (imageView4 != null) {
            imageView4.setOnClickListener(new f());
        }
        CustomerDownloadView customerDownloadView = this.E;
        if (customerDownloadView != null) {
            customerDownloadView.setOnClickListener(new g());
        }
        afterViews();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MGGameDetailActivity
    public void p1(DetailResultBeanV3 detailResultBeanV3) {
        org.androidannotations.api.b.e("", new y(detailResultBeanV3), 300L);
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.f34405m2.put(cls, t4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MGGameDetailActivity
    public void s0(GameFromPopoWinBean gameFromPopoWinBean) {
        org.androidannotations.api.b.e("", new p0(gameFromPopoWinBean), 0L);
    }

    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i4) {
        super.setContentView(i4);
        this.f34404l2.a(this);
    }

    @Override // android.app.Activity
    public void setIntent(Intent intent) {
        super.setIntent(intent);
        injectExtras_();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MGGameDetailActivity
    public void showLoding() {
        org.androidannotations.api.b.e("", new z(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MGGameDetailActivity
    public void showLodingFailed() {
        org.androidannotations.api.b.e("", new a0(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MGGameDetailActivity
    public void showToast(String str) {
        org.androidannotations.api.b.e("", new t(str), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MGGameDetailActivity
    public void updateDownloadView() {
        org.androidannotations.api.b.e("", new i0(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MGGameDetailActivity
    public void updateDownloadingPoint(int i4) {
        org.androidannotations.api.b.e("", new f0(i4), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MGGameDetailActivity
    public void updateLine(int i4) {
        org.androidannotations.api.b.e("", new e0(i4), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MGGameDetailActivity
    public void updateNoOpenPoint() {
        org.androidannotations.api.b.e("", new h0(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MGGameDetailActivity
    public void v0(int i4) {
        org.androidannotations.api.a.l(new y0("", 0L, "", i4));
    }

    @Override // com.join.mgps.activity.MGGameDetailActivity
    public void w0(int i4, int i5) {
        org.androidannotations.api.b.e("", new o(i4, i5), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MGGameDetailActivity
    public void y0() {
        org.androidannotations.api.b.e("", new q0(), 0L);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        this.f34404l2.a(this);
    }

    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        super.setContentView(view);
        this.f34404l2.a(this);
    }
}
