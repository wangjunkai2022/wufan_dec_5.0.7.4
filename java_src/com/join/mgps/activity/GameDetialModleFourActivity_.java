package com.join.mgps.activity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.component.xrecyclerview.XRecyclerView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.CustomerDownloadView;
import com.join.mgps.dto.CollectionBeanSub;
import com.join.mgps.dto.CommentBaseBean;
import com.join.mgps.dto.CommentResponse;
import com.join.mgps.dto.GamedetialModleFourBean;
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
public final class GameDetialModleFourActivity_ extends GameDetialModleFourActivity implements y3.a, a4.a, a4.b {

    /* renamed from: b2  reason: collision with root package name */
    private View f31837b2;

    /* renamed from: a2  reason: collision with root package name */
    private final a4.c f31836a2 = new a4.c();

    /* renamed from: c2  reason: collision with root package name */
    private final Map<Class<?>, Object> f31838c2 = new HashMap();

    /* renamed from: d2  reason: collision with root package name */
    private final IntentFilter f31839d2 = new IntentFilter();

    /* renamed from: e2  reason: collision with root package name */
    private final BroadcastReceiver f31840e2 = new k();

    /* renamed from: f2  reason: collision with root package name */
    private final IntentFilter f31841f2 = new IntentFilter();

    /* renamed from: g2  reason: collision with root package name */
    private final BroadcastReceiver f31842g2 = new v();

    /* renamed from: h2  reason: collision with root package name */
    private final IntentFilter f31843h2 = new IntentFilter();

    /* renamed from: i2  reason: collision with root package name */
    private final BroadcastReceiver f31844i2 = new g0();

    /* renamed from: j2  reason: collision with root package name */
    private final IntentFilter f31845j2 = new IntentFilter();

    /* renamed from: k2  reason: collision with root package name */
    private final BroadcastReceiver f31846k2 = new r0();

    /* loaded from: classes4.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GameDetialModleFourActivity_.this.Q0();
        }
    }

    /* loaded from: classes4.dex */
    class a0 implements Runnable {
        a0() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GameDetialModleFourActivity_.super.updateDownloadView();
        }
    }

    /* loaded from: classes4.dex */
    public static class a1 extends org.androidannotations.api.builder.d<a1, GameDetialModleFourActivity> {
        @Override // org.androidannotations.api.builder.d
        /* renamed from: a */
        public GameDetialModleFourActivity build() {
            GameDetialModleFourActivity_ gameDetialModleFourActivity_ = new GameDetialModleFourActivity_();
            gameDetialModleFourActivity_.setArguments(this.args);
            return gameDetialModleFourActivity_;
        }
    }

    /* loaded from: classes4.dex */
    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GameDetialModleFourActivity_.this.instalButtomButn();
        }
    }

    /* loaded from: classes4.dex */
    class b0 implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ GiftPackageDataInfoBean f31850b;

        b0(GiftPackageDataInfoBean giftPackageDataInfoBean) {
            this.f31850b = giftPackageDataInfoBean;
        }

        @Override // java.lang.Runnable
        public void run() {
            GameDetialModleFourActivity_.super.W0(this.f31850b);
        }
    }

    /* loaded from: classes4.dex */
    class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GameDetialModleFourActivity_.this.progress_layout();
        }
    }

    /* loaded from: classes4.dex */
    class c0 implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ GiftPackageDataOperationBean f31853b;

        c0(GiftPackageDataOperationBean giftPackageDataOperationBean) {
            this.f31853b = giftPackageDataOperationBean;
        }

        @Override // java.lang.Runnable
        public void run() {
            GameDetialModleFourActivity_.super.X0(this.f31853b);
        }
    }

    /* loaded from: classes4.dex */
    class d implements View.OnClickListener {
        d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GameDetialModleFourActivity_.this.o0();
        }
    }

    /* loaded from: classes4.dex */
    class d0 implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f31856b;

        d0(int i4) {
            this.f31856b = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            GameDetialModleFourActivity_.super.i1(this.f31856b);
        }
    }

    /* loaded from: classes4.dex */
    class e implements View.OnClickListener {
        e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GameDetialModleFourActivity_.this.d1();
        }
    }

    /* loaded from: classes4.dex */
    class e0 implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f31859b;

        e0(int i4) {
            this.f31859b = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            GameDetialModleFourActivity_.super.h1(this.f31859b);
        }
    }

    /* loaded from: classes4.dex */
    class f implements View.OnClickListener {
        f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GameDetialModleFourActivity_.this.n0();
        }
    }

    /* loaded from: classes4.dex */
    class f0 implements Runnable {
        f0() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GameDetialModleFourActivity_.super.k1();
        }
    }

    /* loaded from: classes4.dex */
    class g implements View.OnClickListener {
        g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GameDetialModleFourActivity_.this.T0();
        }
    }

    /* loaded from: classes4.dex */
    class g0 extends BroadcastReceiver {
        g0() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            GameDetialModleFourActivity_.this.G0(intent);
        }
    }

    /* loaded from: classes4.dex */
    class h implements View.OnClickListener {
        h() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GameDetialModleFourActivity_.this.U0();
        }
    }

    /* loaded from: classes4.dex */
    class h0 implements Runnable {
        h0() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GameDetialModleFourActivity_.super.Y0();
        }
    }

    /* loaded from: classes4.dex */
    class i implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f31867b;

        i(List list) {
            this.f31867b = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            GameDetialModleFourActivity_.super.j1(this.f31867b);
        }
    }

    /* loaded from: classes4.dex */
    class i0 implements Runnable {
        i0() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GameDetialModleFourActivity_.super.Z0();
        }
    }

    /* loaded from: classes4.dex */
    class j implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f31870b;

        j(boolean z4) {
            this.f31870b = z4;
        }

        @Override // java.lang.Runnable
        public void run() {
            GameDetialModleFourActivity_.super.l1(this.f31870b);
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
                GameDetialModleFourActivity_.super.z0();
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
            GameDetialModleFourActivity_.this.M0(intent);
        }
    }

    /* loaded from: classes4.dex */
    class k0 extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CommentBaseBean f31874b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f31875c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f31876d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k0(String str, long j4, String str2, CommentBaseBean commentBaseBean, int i4, int i5) {
            super(str, j4, str2);
            this.f31874b = commentBaseBean;
            this.f31875c = i4;
            this.f31876d = i5;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                GameDetialModleFourActivity_.super.D0(this.f31874b, this.f31875c, this.f31876d);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class l implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f31878b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f31879c;

        l(int i4, int i5) {
            this.f31878b = i4;
            this.f31879c = i5;
        }

        @Override // java.lang.Runnable
        public void run() {
            GameDetialModleFourActivity_.super.j0(this.f31878b, this.f31879c);
        }
    }

    /* loaded from: classes4.dex */
    class l0 extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CommentBaseBean f31881b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f31882c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f31883d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l0(String str, long j4, String str2, CommentBaseBean commentBaseBean, int i4, int i5) {
            super(str, j4, str2);
            this.f31881b = commentBaseBean;
            this.f31882c = i4;
            this.f31883d = i5;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                GameDetialModleFourActivity_.super.F0(this.f31881b, this.f31882c, this.f31883d);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class m implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f31885b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f31886c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f31887d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f31888e;

        m(String str, boolean z4, int i4, int i5) {
            this.f31885b = str;
            this.f31886c = z4;
            this.f31887d = i4;
            this.f31888e = i5;
        }

        @Override // java.lang.Runnable
        public void run() {
            GameDetialModleFourActivity_.super.O0(this.f31885b, this.f31886c, this.f31887d, this.f31888e);
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
                GameDetialModleFourActivity_.super.x0();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class n implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CommentResponse f31891b;

        n(CommentResponse commentResponse) {
            this.f31891b = commentResponse;
        }

        @Override // java.lang.Runnable
        public void run() {
            GameDetialModleFourActivity_.super.P0(this.f31891b);
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
                GameDetialModleFourActivity_.super.t0();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class o implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f31894b;

        o(String str) {
            this.f31894b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            GameDetialModleFourActivity_.super.showToast(this.f31894b);
        }
    }

    /* loaded from: classes4.dex */
    class o0 extends a.c {
        o0(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                GameDetialModleFourActivity_.super.u0();
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
            GameDetialModleFourActivity_.super.showLodingFailed();
        }
    }

    /* loaded from: classes4.dex */
    class p0 extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ InformationCommentBean f31898b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p0(String str, long j4, String str2, InformationCommentBean informationCommentBean) {
            super(str, j4, str2);
            this.f31898b = informationCommentBean;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                GameDetialModleFourActivity_.super.H0(this.f31898b);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class q implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f31900b;

        q(List list) {
            this.f31900b = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            GameDetialModleFourActivity_.super.showMain(this.f31900b);
        }
    }

    /* loaded from: classes4.dex */
    class q0 extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f31902b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        q0(String str, long j4, String str2, int i4) {
            super(str, j4, str2);
            this.f31902b = i4;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                GameDetialModleFourActivity_.super.changeGameFollow(this.f31902b);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class r implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ GamedetialModleFourBean f31904b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f31905c;

        r(GamedetialModleFourBean gamedetialModleFourBean, boolean z4) {
            this.f31904b = gamedetialModleFourBean;
            this.f31905c = z4;
        }

        @Override // java.lang.Runnable
        public void run() {
            GameDetialModleFourActivity_.super.o1(this.f31904b, this.f31905c);
        }
    }

    /* loaded from: classes4.dex */
    class r0 extends BroadcastReceiver {

        /* renamed from: b  reason: collision with root package name */
        public static final String f31907b = "gameData";

        r0() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            GameDetialModleFourActivity_.this.B0((CollectionBeanSub) (intent.getExtras() != null ? intent.getExtras() : new Bundle()).getSerializable("gameData"));
        }
    }

    /* loaded from: classes4.dex */
    class s implements Runnable {
        s() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GameDetialModleFourActivity_.super.a1();
        }
    }

    /* loaded from: classes4.dex */
    class s0 extends a.c {
        s0(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                GameDetialModleFourActivity_.super.getDownloadTaskInfo();
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
            GameDetialModleFourActivity_.super.C0();
        }
    }

    /* loaded from: classes4.dex */
    class t0 extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ GiftPackageDataInfoBean f31912b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        t0(String str, long j4, String str2, GiftPackageDataInfoBean giftPackageDataInfoBean) {
            super(str, j4, str2);
            this.f31912b = giftPackageDataInfoBean;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                GameDetialModleFourActivity_.super.v0(this.f31912b);
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
            GameDetialModleFourActivity_.super.e1();
        }
    }

    /* loaded from: classes4.dex */
    class u0 extends a.c {
        u0(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                GameDetialModleFourActivity_.super.i0();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class v extends BroadcastReceiver {
        v() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            GameDetialModleFourActivity_.this.p1();
        }
    }

    /* loaded from: classes4.dex */
    class v0 implements View.OnClickListener {
        v0() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GameDetialModleFourActivity_.this.relodingimag();
        }
    }

    /* loaded from: classes4.dex */
    class w implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ResultMainBean f31918b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f31919c;

        w(ResultMainBean resultMainBean, int i4) {
            this.f31918b = resultMainBean;
            this.f31919c = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            GameDetialModleFourActivity_.super.updateTitleButn(this.f31918b, this.f31919c);
        }
    }

    /* loaded from: classes4.dex */
    class w0 implements View.OnClickListener {
        w0() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GameDetialModleFourActivity_.this.r0();
        }
    }

    /* loaded from: classes4.dex */
    class x implements Runnable {
        x() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GameDetialModleFourActivity_.super.showProgress();
        }
    }

    /* loaded from: classes4.dex */
    class x0 implements View.OnClickListener {
        x0() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GameDetialModleFourActivity_.this.setNetwork();
        }
    }

    /* loaded from: classes4.dex */
    class y implements Runnable {
        y() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GameDetialModleFourActivity_.super.showInstallButn();
        }
    }

    /* loaded from: classes4.dex */
    class y0 implements View.OnClickListener {
        y0() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GameDetialModleFourActivity_.this.iv_back();
        }
    }

    /* loaded from: classes4.dex */
    class z implements Runnable {
        z() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GameDetialModleFourActivity_.super.updateButn();
        }
    }

    /* loaded from: classes4.dex */
    class z0 implements View.OnClickListener {
        z0() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GameDetialModleFourActivity_.this.h0();
        }
    }

    public static a1 Z1() {
        return new a1();
    }

    private void init_(Bundle bundle) {
        this.D1 = new PrefDef_(getActivity());
        a4.c.b(this);
        this.f31839d2.addAction(o1.a.B);
        this.f31841f2.addAction("com.broadcast.bespeak.sussess");
        this.f31843h2.addAction("com.join,mgps.sim.sdkgamePayfinish");
        this.f31845j2.addAction(o1.a.I);
        this.f31845j2.addAction(o1.a.G);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameDetialModleFourActivity
    public void C0() {
        org.androidannotations.api.b.e("", new t(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameDetialModleFourActivity
    public void D0(CommentBaseBean commentBaseBean, int i4, int i5) {
        org.androidannotations.api.a.l(new k0("", 0L, "", commentBaseBean, i4, i5));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameDetialModleFourActivity
    public void F0(CommentBaseBean commentBaseBean, int i4, int i5) {
        org.androidannotations.api.a.l(new l0("", 0L, "", commentBaseBean, i4, i5));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameDetialModleFourActivity
    public void H0(InformationCommentBean informationCommentBean) {
        org.androidannotations.api.a.l(new p0("", 0L, "", informationCommentBean));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameDetialModleFourActivity
    public void O0(String str, boolean z4, int i4, int i5) {
        org.androidannotations.api.b.e("", new m(str, z4, i4, i5), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameDetialModleFourActivity
    public void P0(CommentResponse commentResponse) {
        org.androidannotations.api.b.e("", new n(commentResponse), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameDetialModleFourActivity
    public void W0(GiftPackageDataInfoBean giftPackageDataInfoBean) {
        org.androidannotations.api.b.e("", new b0(giftPackageDataInfoBean), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameDetialModleFourActivity
    public void X0(GiftPackageDataOperationBean giftPackageDataOperationBean) {
        org.androidannotations.api.b.e("", new c0(giftPackageDataOperationBean), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameDetialModleFourActivity
    public void Y0() {
        org.androidannotations.api.b.e("", new h0(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameDetialModleFourActivity
    public void Z0() {
        org.androidannotations.api.b.e("", new i0(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameDetialModleFourActivity
    public void a1() {
        org.androidannotations.api.b.e("", new s(), 4000L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameDetialModleFourActivity
    public void changeGameFollow(int i4) {
        org.androidannotations.api.a.l(new q0("", 0L, "", i4));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameDetialModleFourActivity
    public void e1() {
        org.androidannotations.api.b.e("", new u(), 0L);
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.f31838c2.get(cls);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameDetialModleFourActivity
    public void getDownloadTaskInfo() {
        org.androidannotations.api.a.l(new s0("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameDetialModleFourActivity
    public void h1(int i4) {
        org.androidannotations.api.b.e("", new e0(i4), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameDetialModleFourActivity
    public void i0() {
        org.androidannotations.api.a.l(new u0("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameDetialModleFourActivity
    public void i1(int i4) {
        org.androidannotations.api.b.e("", new d0(i4), 0L);
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        View view = this.f31837b2;
        if (view == null) {
            return null;
        }
        return (T) view.findViewById(i4);
    }

    @Override // com.join.mgps.activity.GameDetialModleFourActivity
    public void j0(int i4, int i5) {
        org.androidannotations.api.b.e("", new l(i4, i5), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameDetialModleFourActivity
    public void j1(List<CollectionBeanSub> list) {
        org.androidannotations.api.b.e("", new i(list), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameDetialModleFourActivity
    public void k1() {
        org.androidannotations.api.b.e("", new f0(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameDetialModleFourActivity
    public void l1(boolean z4) {
        org.androidannotations.api.b.e("", new j(z4), 1000L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameDetialModleFourActivity
    public void o1(GamedetialModleFourBean gamedetialModleFourBean, boolean z4) {
        org.androidannotations.api.b.e("", new r(gamedetialModleFourBean, z4), 0L);
    }

    @Override // com.join.mgps.activity.GameDetialModleFourActivity, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.f31836a2);
        init_(bundle);
        super.onCreate(bundle);
        getActivity().registerReceiver(this.f31840e2, this.f31839d2);
        getActivity().registerReceiver(this.f31842g2, this.f31841f2);
        getActivity().registerReceiver(this.f31844i2, this.f31843h2);
        getActivity().registerReceiver(this.f31846k2, this.f31845j2);
        a4.c.c(c5);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        this.f31837b2 = onCreateView;
        if (onCreateView == null) {
            this.f31837b2 = layoutInflater.inflate(R.layout.gamedetial_modle_four_activity, viewGroup, false);
        }
        return this.f31837b2;
    }

    @Override // com.join.mgps.activity.GameDetialModleFourActivity, androidx.fragment.app.Fragment
    public void onDestroy() {
        getActivity().unregisterReceiver(this.f31840e2);
        getActivity().unregisterReceiver(this.f31842g2);
        getActivity().unregisterReceiver(this.f31844i2);
        getActivity().unregisterReceiver(this.f31846k2);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f31837b2 = null;
        this.f31784c = null;
        this.f31785d = null;
        this.f31786e = null;
        this.f31787f = null;
        this.f31788g = null;
        this.f31789h = null;
        this.f31790i = null;
        this.f31791j = null;
        this.f31792k = null;
        this.f31793l = null;
        this.f31794m = null;
        this.f31795n = null;
        this.f31796o = null;
        this.f31797p = null;
        this.f31800q = null;
        this.f31801r = null;
        this.f31802s = null;
        this.f31803t = null;
        this.f31804u = null;
        this.f31805v = null;
        this.f31807w = null;
        this.f31808x = null;
        this.f31809y = null;
        this.f31810z = null;
        this.A = null;
        this.B = null;
        this.C = null;
        this.D = null;
        this.E = null;
        this.F = null;
        this.Q1 = null;
        this.R1 = null;
        this.S1 = null;
        this.T1 = null;
        this.U1 = null;
        this.V1 = null;
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f31784c = (TextView) aVar.internalFindViewById(R.id.titleText);
        this.f31785d = (TextView) aVar.internalFindViewById(R.id.title_textview);
        this.f31786e = (ImageView) aVar.internalFindViewById(R.id.iv_back);
        this.f31787f = (ImageView) aVar.internalFindViewById(R.id.search);
        this.f31788g = (ImageView) aVar.internalFindViewById(R.id.share);
        this.f31789h = (ImageView) aVar.internalFindViewById(R.id.downImage);
        this.f31790i = (ImageView) aVar.internalFindViewById(R.id.followImage);
        this.f31791j = (TextView) aVar.internalFindViewById(R.id.followButton);
        this.f31792k = (LinearLayout) aVar.internalFindViewById(R.id.followLayout);
        this.f31793l = (LinearLayout) aVar.internalFindViewById(R.id.layoutGift);
        this.f31794m = (XRecyclerView) aVar.internalFindViewById(R.id.recycleView);
        this.f31795n = (TextView) aVar.internalFindViewById(R.id.instalButtomButn);
        this.f31796o = (RelativeLayout) aVar.internalFindViewById(R.id.progressbarLayout);
        this.f31797p = (RelativeLayout) aVar.internalFindViewById(R.id.instalbutnLayout);
        this.f31800q = (ImageView) aVar.internalFindViewById(R.id.butn_showdownload);
        this.f31801r = (TextView) aVar.internalFindViewById(R.id.percent);
        this.f31802s = (ProgressBar) aVar.internalFindViewById(R.id.butnProgressBar);
        this.f31803t = (LinearLayout) aVar.internalFindViewById(R.id.downloadLayout);
        this.f31804u = (RelativeLayout) aVar.internalFindViewById(R.id.title_bar_layout);
        this.f31805v = (RelativeLayout) aVar.internalFindViewById(R.id.downloadRLayout2);
        this.f31807w = (RelativeLayout) aVar.internalFindViewById(R.id.titleTransfer);
        this.f31808x = (ImageView) aVar.internalFindViewById(R.id.search_detial_back);
        this.f31809y = (ImageView) aVar.internalFindViewById(R.id.download_bg);
        this.f31810z = (LinearLayout) aVar.internalFindViewById(R.id.loding_faile);
        this.A = (LinearLayout) aVar.internalFindViewById(R.id.loding_layout);
        this.B = (Button) aVar.internalFindViewById(R.id.setNetwork);
        this.C = (RelativeLayout) aVar.internalFindViewById(R.id.title);
        this.D = (SimpleDraweeView) aVar.internalFindViewById(R.id.giftImage);
        this.E = (TextView) aVar.internalFindViewById(R.id.giftContent);
        this.F = (NestedScrollView) aVar.internalFindViewById(R.id.nsv_view);
        this.Q1 = (TextView) aVar.internalFindViewById(R.id.biground);
        this.R1 = (ImageView) aVar.internalFindViewById(R.id.downloadLine);
        this.S1 = (ImageView) aVar.internalFindViewById(R.id.search_detial_image);
        this.T1 = (ImageView) aVar.internalFindViewById(R.id.title_normal_search_img);
        this.U1 = (ImageView) aVar.internalFindViewById(R.id.imageLoading);
        this.V1 = (CustomerDownloadView) aVar.internalFindViewById(R.id.title_normal_download_cdv);
        View internalFindViewById = aVar.internalFindViewById(R.id.relodingimag);
        View internalFindViewById2 = aVar.internalFindViewById(R.id.back_image);
        View internalFindViewById3 = aVar.internalFindViewById(R.id.progress_layout);
        View internalFindViewById4 = aVar.internalFindViewById(R.id.shareTwo);
        if (internalFindViewById != null) {
            internalFindViewById.setOnClickListener(new v0());
        }
        LinearLayout linearLayout = this.f31792k;
        if (linearLayout != null) {
            linearLayout.setOnClickListener(new w0());
        }
        Button button = this.B;
        if (button != null) {
            button.setOnClickListener(new x0());
        }
        ImageView imageView = this.f31786e;
        if (imageView != null) {
            imageView.setOnClickListener(new y0());
        }
        if (internalFindViewById2 != null) {
            internalFindViewById2.setOnClickListener(new z0());
        }
        ImageView imageView2 = this.f31808x;
        if (imageView2 != null) {
            imageView2.setOnClickListener(new a());
        }
        TextView textView = this.f31795n;
        if (textView != null) {
            textView.setOnClickListener(new b());
        }
        if (internalFindViewById3 != null) {
            internalFindViewById3.setOnClickListener(new c());
        }
        LinearLayout linearLayout2 = this.f31803t;
        if (linearLayout2 != null) {
            linearLayout2.setOnClickListener(new d());
        }
        CustomerDownloadView customerDownloadView = this.V1;
        if (customerDownloadView != null) {
            customerDownloadView.setOnClickListener(new e());
        }
        ImageView imageView3 = this.f31789h;
        if (imageView3 != null) {
            imageView3.setOnClickListener(new f());
        }
        ImageView imageView4 = this.f31788g;
        if (imageView4 != null) {
            imageView4.setOnClickListener(new g());
        }
        if (internalFindViewById4 != null) {
            internalFindViewById4.setOnClickListener(new h());
        }
        afterView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f31836a2.a(this);
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.f31838c2.put(cls, t4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameDetialModleFourActivity
    public void showInstallButn() {
        org.androidannotations.api.b.e("", new y(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameDetialModleFourActivity
    public void showLodingFailed() {
        org.androidannotations.api.b.e("", new p(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameDetialModleFourActivity
    public void showMain(List<CommentBaseBean> list) {
        org.androidannotations.api.b.e("", new q(list), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameDetialModleFourActivity
    public void showProgress() {
        org.androidannotations.api.b.e("", new x(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameDetialModleFourActivity
    public void showToast(String str) {
        org.androidannotations.api.b.e("", new o(str), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameDetialModleFourActivity
    public void t0() {
        org.androidannotations.api.a.l(new n0("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameDetialModleFourActivity
    public void u0() {
        org.androidannotations.api.a.l(new o0("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameDetialModleFourActivity
    public void updateButn() {
        org.androidannotations.api.b.e("", new z(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameDetialModleFourActivity
    public void updateDownloadView() {
        org.androidannotations.api.b.e("", new a0(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameDetialModleFourActivity
    public void updateTitleButn(ResultMainBean resultMainBean, int i4) {
        org.androidannotations.api.b.e("", new w(resultMainBean, i4), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameDetialModleFourActivity
    public void v0(GiftPackageDataInfoBean giftPackageDataInfoBean) {
        org.androidannotations.api.a.l(new t0("", 0L, "", giftPackageDataInfoBean));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameDetialModleFourActivity
    public void x0() {
        org.androidannotations.api.a.l(new m0("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameDetialModleFourActivity
    public void z0() {
        org.androidannotations.api.a.l(new j0("", 0L, ""));
    }
}
