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
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.drawee.view.SimpleDraweeView;
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
public final class GameDetialModleThreeActivity_ extends GameDetialModleThreeActivity implements y3.a, a4.a, a4.b {
    private View P1;
    private final a4.c O1 = new a4.c();
    private final Map<Class<?>, Object> Q1 = new HashMap();
    private final IntentFilter R1 = new IntentFilter();
    private final BroadcastReceiver S1 = new k();
    private final IntentFilter T1 = new IntentFilter();
    private final BroadcastReceiver U1 = new v();
    private final IntentFilter V1 = new IntentFilter();
    private final BroadcastReceiver W1 = new g0();
    private final IntentFilter X1 = new IntentFilter();
    private final BroadcastReceiver Y1 = new r0();

    /* loaded from: classes4.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GameDetialModleThreeActivity_.this.F0();
        }
    }

    /* loaded from: classes4.dex */
    class a0 implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ GiftPackageDataInfoBean f31976b;

        a0(GiftPackageDataInfoBean giftPackageDataInfoBean) {
            this.f31976b = giftPackageDataInfoBean;
        }

        @Override // java.lang.Runnable
        public void run() {
            GameDetialModleThreeActivity_.super.L0(this.f31976b);
        }
    }

    /* loaded from: classes4.dex */
    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GameDetialModleThreeActivity_.this.instalButtomButn();
        }
    }

    /* loaded from: classes4.dex */
    class b0 implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ GiftPackageDataOperationBean f31979b;

        b0(GiftPackageDataOperationBean giftPackageDataOperationBean) {
            this.f31979b = giftPackageDataOperationBean;
        }

        @Override // java.lang.Runnable
        public void run() {
            GameDetialModleThreeActivity_.super.M0(this.f31979b);
        }
    }

    /* loaded from: classes4.dex */
    class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GameDetialModleThreeActivity_.this.progress_layout();
        }
    }

    /* loaded from: classes4.dex */
    class c0 implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f31982b;

        c0(int i4) {
            this.f31982b = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            GameDetialModleThreeActivity_.super.V0(this.f31982b);
        }
    }

    /* loaded from: classes4.dex */
    class d implements View.OnClickListener {
        d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GameDetialModleThreeActivity_.this.i0();
        }
    }

    /* loaded from: classes4.dex */
    class d0 implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f31985b;

        d0(int i4) {
            this.f31985b = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            GameDetialModleThreeActivity_.super.U0(this.f31985b);
        }
    }

    /* loaded from: classes4.dex */
    class e implements View.OnClickListener {
        e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GameDetialModleThreeActivity_.this.S0();
        }
    }

    /* loaded from: classes4.dex */
    class e0 implements Runnable {
        e0() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GameDetialModleThreeActivity_.super.W0();
        }
    }

    /* loaded from: classes4.dex */
    class f implements View.OnClickListener {
        f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GameDetialModleThreeActivity_.this.h0();
        }
    }

    /* loaded from: classes4.dex */
    class f0 implements Runnable {
        f0() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GameDetialModleThreeActivity_.super.N0();
        }
    }

    /* loaded from: classes4.dex */
    class g implements View.OnClickListener {
        g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GameDetialModleThreeActivity_.this.I0();
        }
    }

    /* loaded from: classes4.dex */
    class g0 extends BroadcastReceiver {
        g0() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            GameDetialModleThreeActivity_.this.z0(intent);
        }
    }

    /* loaded from: classes4.dex */
    class h implements View.OnClickListener {
        h() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GameDetialModleThreeActivity_.this.J0();
        }
    }

    /* loaded from: classes4.dex */
    class h0 implements Runnable {
        h0() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GameDetialModleThreeActivity_.super.O0();
        }
    }

    /* loaded from: classes4.dex */
    class i implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f31995b;

        i(boolean z4) {
            this.f31995b = z4;
        }

        @Override // java.lang.Runnable
        public void run() {
            GameDetialModleThreeActivity_.super.X0(this.f31995b);
        }
    }

    /* loaded from: classes4.dex */
    class i0 extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CommentBaseBean f31997b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f31998c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f31999d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i0(String str, long j4, String str2, CommentBaseBean commentBaseBean, int i4, int i5) {
            super(str, j4, str2);
            this.f31997b = commentBaseBean;
            this.f31998c = i4;
            this.f31999d = i5;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                GameDetialModleThreeActivity_.super.w0(this.f31997b, this.f31998c, this.f31999d);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class j implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f32001b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f32002c;

        j(int i4, int i5) {
            this.f32001b = i4;
            this.f32002c = i5;
        }

        @Override // java.lang.Runnable
        public void run() {
            GameDetialModleThreeActivity_.super.d0(this.f32001b, this.f32002c);
        }
    }

    /* loaded from: classes4.dex */
    class j0 extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CommentBaseBean f32004b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f32005c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f32006d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j0(String str, long j4, String str2, CommentBaseBean commentBaseBean, int i4, int i5) {
            super(str, j4, str2);
            this.f32004b = commentBaseBean;
            this.f32005c = i4;
            this.f32006d = i5;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                GameDetialModleThreeActivity_.super.y0(this.f32004b, this.f32005c, this.f32006d);
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
            GameDetialModleThreeActivity_.this.B0(intent);
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
                GameDetialModleThreeActivity_.super.r0();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class l implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f32010b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f32011c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f32012d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f32013e;

        l(String str, boolean z4, int i4, int i5) {
            this.f32010b = str;
            this.f32011c = z4;
            this.f32012d = i4;
            this.f32013e = i5;
        }

        @Override // java.lang.Runnable
        public void run() {
            GameDetialModleThreeActivity_.super.D0(this.f32010b, this.f32011c, this.f32012d, this.f32013e);
        }
    }

    /* loaded from: classes4.dex */
    class l0 extends a.c {
        l0(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                GameDetialModleThreeActivity_.super.n0();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class m implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CommentResponse f32016b;

        m(CommentResponse commentResponse) {
            this.f32016b = commentResponse;
        }

        @Override // java.lang.Runnable
        public void run() {
            GameDetialModleThreeActivity_.super.E0(this.f32016b);
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
                GameDetialModleThreeActivity_.super.o0();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class n implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f32019b;

        n(String str) {
            this.f32019b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            GameDetialModleThreeActivity_.super.showToast(this.f32019b);
        }
    }

    /* loaded from: classes4.dex */
    class n0 extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ InformationCommentBean f32021b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n0(String str, long j4, String str2, InformationCommentBean informationCommentBean) {
            super(str, j4, str2);
            this.f32021b = informationCommentBean;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                GameDetialModleThreeActivity_.super.A0(this.f32021b);
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
            GameDetialModleThreeActivity_.super.showLodingFailed();
        }
    }

    /* loaded from: classes4.dex */
    class o0 extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f32024b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o0(String str, long j4, String str2, int i4) {
            super(str, j4, str2);
            this.f32024b = i4;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                GameDetialModleThreeActivity_.super.changeGameFollow(this.f32024b);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class p implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f32026b;

        p(List list) {
            this.f32026b = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            GameDetialModleThreeActivity_.super.showMain(this.f32026b);
        }
    }

    /* loaded from: classes4.dex */
    class p0 extends a.c {
        p0(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                GameDetialModleThreeActivity_.super.getDownloadTaskInfo();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class q implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ GamedetialModleFourBean f32029b;

        q(GamedetialModleFourBean gamedetialModleFourBean) {
            this.f32029b = gamedetialModleFourBean;
        }

        @Override // java.lang.Runnable
        public void run() {
            GameDetialModleThreeActivity_.super.Y0(this.f32029b);
        }
    }

    /* loaded from: classes4.dex */
    class q0 extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ GiftPackageDataInfoBean f32031b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        q0(String str, long j4, String str2, GiftPackageDataInfoBean giftPackageDataInfoBean) {
            super(str, j4, str2);
            this.f32031b = giftPackageDataInfoBean;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                GameDetialModleThreeActivity_.super.p0(this.f32031b);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class r implements Runnable {
        r() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GameDetialModleThreeActivity_.super.P0();
        }
    }

    /* loaded from: classes4.dex */
    class r0 extends BroadcastReceiver {

        /* renamed from: b  reason: collision with root package name */
        public static final String f32034b = "gameData";

        r0() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            GameDetialModleThreeActivity_.this.u0((CollectionBeanSub) (intent.getExtras() != null ? intent.getExtras() : new Bundle()).getSerializable("gameData"));
        }
    }

    /* loaded from: classes4.dex */
    class s implements Runnable {
        s() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GameDetialModleThreeActivity_.super.v0();
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
                GameDetialModleThreeActivity_.super.c0();
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
            GameDetialModleThreeActivity_.super.T0();
        }
    }

    /* loaded from: classes4.dex */
    class t0 implements View.OnClickListener {
        t0() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GameDetialModleThreeActivity_.this.relodingimag();
        }
    }

    /* loaded from: classes4.dex */
    class u implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ResultMainBean f32040b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f32041c;

        u(ResultMainBean resultMainBean, int i4) {
            this.f32040b = resultMainBean;
            this.f32041c = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            GameDetialModleThreeActivity_.super.updateTitleButn(this.f32040b, this.f32041c);
        }
    }

    /* loaded from: classes4.dex */
    class u0 implements View.OnClickListener {
        u0() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GameDetialModleThreeActivity_.this.l0();
        }
    }

    /* loaded from: classes4.dex */
    class v extends BroadcastReceiver {
        v() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            GameDetialModleThreeActivity_.this.Z0();
        }
    }

    /* loaded from: classes4.dex */
    class v0 implements View.OnClickListener {
        v0() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GameDetialModleThreeActivity_.this.setNetwork();
        }
    }

    /* loaded from: classes4.dex */
    class w implements Runnable {
        w() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GameDetialModleThreeActivity_.super.showProgress();
        }
    }

    /* loaded from: classes4.dex */
    class w0 implements View.OnClickListener {
        w0() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GameDetialModleThreeActivity_.this.iv_back();
        }
    }

    /* loaded from: classes4.dex */
    class x implements Runnable {
        x() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GameDetialModleThreeActivity_.super.showInstallButn();
        }
    }

    /* loaded from: classes4.dex */
    class x0 implements View.OnClickListener {
        x0() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GameDetialModleThreeActivity_.this.b0();
        }
    }

    /* loaded from: classes4.dex */
    class y implements Runnable {
        y() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GameDetialModleThreeActivity_.super.updateButn();
        }
    }

    /* loaded from: classes4.dex */
    public static class y0 extends org.androidannotations.api.builder.d<y0, GameDetialModleThreeActivity> {
        @Override // org.androidannotations.api.builder.d
        /* renamed from: a */
        public GameDetialModleThreeActivity build() {
            GameDetialModleThreeActivity_ gameDetialModleThreeActivity_ = new GameDetialModleThreeActivity_();
            gameDetialModleThreeActivity_.setArguments(this.args);
            return gameDetialModleThreeActivity_;
        }
    }

    /* loaded from: classes4.dex */
    class z implements Runnable {
        z() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GameDetialModleThreeActivity_.super.updateDownloadView();
        }
    }

    public static y0 H1() {
        return new y0();
    }

    private void init_(Bundle bundle) {
        this.V = new PrefDef_(getActivity());
        a4.c.b(this);
        this.R1.addAction(o1.a.B);
        this.T1.addAction("com.broadcast.bespeak.sussess");
        this.V1.addAction("com.join,mgps.sim.sdkgamePayfinish");
        this.X1.addAction(o1.a.I);
        this.X1.addAction(o1.a.G);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameDetialModleThreeActivity
    public void A0(InformationCommentBean informationCommentBean) {
        org.androidannotations.api.a.l(new n0("", 0L, "", informationCommentBean));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameDetialModleThreeActivity
    public void D0(String str, boolean z4, int i4, int i5) {
        org.androidannotations.api.b.e("", new l(str, z4, i4, i5), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameDetialModleThreeActivity
    public void E0(CommentResponse commentResponse) {
        org.androidannotations.api.b.e("", new m(commentResponse), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameDetialModleThreeActivity
    public void L0(GiftPackageDataInfoBean giftPackageDataInfoBean) {
        org.androidannotations.api.b.e("", new a0(giftPackageDataInfoBean), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameDetialModleThreeActivity
    public void M0(GiftPackageDataOperationBean giftPackageDataOperationBean) {
        org.androidannotations.api.b.e("", new b0(giftPackageDataOperationBean), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameDetialModleThreeActivity
    public void N0() {
        org.androidannotations.api.b.e("", new f0(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameDetialModleThreeActivity
    public void O0() {
        org.androidannotations.api.b.e("", new h0(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameDetialModleThreeActivity
    public void P0() {
        org.androidannotations.api.b.e("", new r(), 4000L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameDetialModleThreeActivity
    public void T0() {
        org.androidannotations.api.b.e("", new t(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameDetialModleThreeActivity
    public void U0(int i4) {
        org.androidannotations.api.b.e("", new d0(i4), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameDetialModleThreeActivity
    public void V0(int i4) {
        org.androidannotations.api.b.e("", new c0(i4), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameDetialModleThreeActivity
    public void W0() {
        org.androidannotations.api.b.e("", new e0(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameDetialModleThreeActivity
    public void X0(boolean z4) {
        org.androidannotations.api.b.e("", new i(z4), 1000L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameDetialModleThreeActivity
    public void Y0(GamedetialModleFourBean gamedetialModleFourBean) {
        org.androidannotations.api.b.e("", new q(gamedetialModleFourBean), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameDetialModleThreeActivity
    public void c0() {
        org.androidannotations.api.a.l(new s0("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameDetialModleThreeActivity
    public void changeGameFollow(int i4) {
        org.androidannotations.api.a.l(new o0("", 0L, "", i4));
    }

    @Override // com.join.mgps.activity.GameDetialModleThreeActivity
    public void d0(int i4, int i5) {
        org.androidannotations.api.b.e("", new j(i4, i5), 0L);
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.Q1.get(cls);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameDetialModleThreeActivity
    public void getDownloadTaskInfo() {
        org.androidannotations.api.a.l(new p0("", 0L, ""));
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        View view = this.P1;
        if (view == null) {
            return null;
        }
        return (T) view.findViewById(i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameDetialModleThreeActivity
    public void n0() {
        org.androidannotations.api.a.l(new l0("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameDetialModleThreeActivity
    public void o0() {
        org.androidannotations.api.a.l(new m0("", 0L, ""));
    }

    @Override // com.join.mgps.activity.GameDetialModleThreeActivity, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.O1);
        init_(bundle);
        super.onCreate(bundle);
        getActivity().registerReceiver(this.S1, this.R1);
        getActivity().registerReceiver(this.U1, this.T1);
        getActivity().registerReceiver(this.W1, this.V1);
        getActivity().registerReceiver(this.Y1, this.X1);
        a4.c.c(c5);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        this.P1 = onCreateView;
        if (onCreateView == null) {
            this.P1 = layoutInflater.inflate(R.layout.gamedetial_modle_three_activity, viewGroup, false);
        }
        return this.P1;
    }

    @Override // com.join.mgps.activity.GameDetialModleThreeActivity, androidx.fragment.app.Fragment
    public void onDestroy() {
        getActivity().unregisterReceiver(this.S1);
        getActivity().unregisterReceiver(this.U1);
        getActivity().unregisterReceiver(this.W1);
        getActivity().unregisterReceiver(this.Y1);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.P1 = null;
        this.f31929c = null;
        this.f31930d = null;
        this.f31931e = null;
        this.f31932f = null;
        this.f31933g = null;
        this.f31934h = null;
        this.f31935i = null;
        this.f31936j = null;
        this.f31937k = null;
        this.f31938l = null;
        this.f31939m = null;
        this.f31940n = null;
        this.f31941o = null;
        this.f31942p = null;
        this.f31945q = null;
        this.f31946r = null;
        this.f31947s = null;
        this.f31948t = null;
        this.f31949u = null;
        this.f31950v = null;
        this.f31952w = null;
        this.f31953x = null;
        this.f31954y = null;
        this.f31955z = null;
        this.A = null;
        this.B = null;
        this.C = null;
        this.D = null;
        this.E = null;
        this.E1 = null;
        this.F1 = null;
        this.G1 = null;
        this.H1 = null;
        this.I1 = null;
        this.J1 = null;
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f31929c = (TextView) aVar.internalFindViewById(R.id.titleText);
        this.f31930d = (TextView) aVar.internalFindViewById(R.id.title_textview);
        this.f31931e = (ImageView) aVar.internalFindViewById(R.id.iv_back);
        this.f31932f = (ImageView) aVar.internalFindViewById(R.id.search);
        this.f31933g = (ImageView) aVar.internalFindViewById(R.id.share);
        this.f31934h = (ImageView) aVar.internalFindViewById(R.id.downImage);
        this.f31935i = (ImageView) aVar.internalFindViewById(R.id.followImage);
        this.f31936j = (TextView) aVar.internalFindViewById(R.id.followButton);
        this.f31937k = (LinearLayout) aVar.internalFindViewById(R.id.followLayout);
        this.f31938l = (LinearLayout) aVar.internalFindViewById(R.id.layoutGift);
        this.f31939m = (RecyclerView) aVar.internalFindViewById(R.id.recycleView);
        this.f31940n = (TextView) aVar.internalFindViewById(R.id.instalButtomButn);
        this.f31941o = (RelativeLayout) aVar.internalFindViewById(R.id.progressbarLayout);
        this.f31942p = (RelativeLayout) aVar.internalFindViewById(R.id.instalbutnLayout);
        this.f31945q = (ImageView) aVar.internalFindViewById(R.id.butn_showdownload);
        this.f31946r = (TextView) aVar.internalFindViewById(R.id.percent);
        this.f31947s = (ProgressBar) aVar.internalFindViewById(R.id.butnProgressBar);
        this.f31948t = (LinearLayout) aVar.internalFindViewById(R.id.downloadLayout);
        this.f31949u = (RelativeLayout) aVar.internalFindViewById(R.id.title_bar_layout);
        this.f31950v = (RelativeLayout) aVar.internalFindViewById(R.id.downloadRLayout2);
        this.f31952w = (RelativeLayout) aVar.internalFindViewById(R.id.titleTransfer);
        this.f31953x = (ImageView) aVar.internalFindViewById(R.id.search_detial_back);
        this.f31954y = (ImageView) aVar.internalFindViewById(R.id.download_bg);
        this.f31955z = (LinearLayout) aVar.internalFindViewById(R.id.loding_faile);
        this.A = (LinearLayout) aVar.internalFindViewById(R.id.loding_layout);
        this.B = (Button) aVar.internalFindViewById(R.id.setNetwork);
        this.C = (RelativeLayout) aVar.internalFindViewById(R.id.title);
        this.D = (SimpleDraweeView) aVar.internalFindViewById(R.id.giftImage);
        this.E = (TextView) aVar.internalFindViewById(R.id.giftContent);
        this.E1 = (TextView) aVar.internalFindViewById(R.id.biground);
        this.F1 = (ImageView) aVar.internalFindViewById(R.id.downloadLine);
        this.G1 = (ImageView) aVar.internalFindViewById(R.id.search_detial_image);
        this.H1 = (ImageView) aVar.internalFindViewById(R.id.title_normal_search_img);
        this.I1 = (ImageView) aVar.internalFindViewById(R.id.imageLoading);
        this.J1 = (CustomerDownloadView) aVar.internalFindViewById(R.id.title_normal_download_cdv);
        View internalFindViewById = aVar.internalFindViewById(R.id.relodingimag);
        View internalFindViewById2 = aVar.internalFindViewById(R.id.back_image);
        View internalFindViewById3 = aVar.internalFindViewById(R.id.progress_layout);
        View internalFindViewById4 = aVar.internalFindViewById(R.id.shareTwo);
        if (internalFindViewById != null) {
            internalFindViewById.setOnClickListener(new t0());
        }
        LinearLayout linearLayout = this.f31937k;
        if (linearLayout != null) {
            linearLayout.setOnClickListener(new u0());
        }
        Button button = this.B;
        if (button != null) {
            button.setOnClickListener(new v0());
        }
        ImageView imageView = this.f31931e;
        if (imageView != null) {
            imageView.setOnClickListener(new w0());
        }
        if (internalFindViewById2 != null) {
            internalFindViewById2.setOnClickListener(new x0());
        }
        ImageView imageView2 = this.f31953x;
        if (imageView2 != null) {
            imageView2.setOnClickListener(new a());
        }
        TextView textView = this.f31940n;
        if (textView != null) {
            textView.setOnClickListener(new b());
        }
        if (internalFindViewById3 != null) {
            internalFindViewById3.setOnClickListener(new c());
        }
        LinearLayout linearLayout2 = this.f31948t;
        if (linearLayout2 != null) {
            linearLayout2.setOnClickListener(new d());
        }
        CustomerDownloadView customerDownloadView = this.J1;
        if (customerDownloadView != null) {
            customerDownloadView.setOnClickListener(new e());
        }
        ImageView imageView3 = this.f31934h;
        if (imageView3 != null) {
            imageView3.setOnClickListener(new f());
        }
        ImageView imageView4 = this.f31933g;
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
        this.O1.a(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameDetialModleThreeActivity
    public void p0(GiftPackageDataInfoBean giftPackageDataInfoBean) {
        org.androidannotations.api.a.l(new q0("", 0L, "", giftPackageDataInfoBean));
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.Q1.put(cls, t4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameDetialModleThreeActivity
    public void r0() {
        org.androidannotations.api.a.l(new k0("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameDetialModleThreeActivity
    public void showInstallButn() {
        org.androidannotations.api.b.e("", new x(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameDetialModleThreeActivity
    public void showLodingFailed() {
        org.androidannotations.api.b.e("", new o(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameDetialModleThreeActivity
    public void showMain(List<CommentBaseBean> list) {
        org.androidannotations.api.b.e("", new p(list), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameDetialModleThreeActivity
    public void showProgress() {
        org.androidannotations.api.b.e("", new w(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameDetialModleThreeActivity
    public void showToast(String str) {
        org.androidannotations.api.b.e("", new n(str), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameDetialModleThreeActivity
    public void updateButn() {
        org.androidannotations.api.b.e("", new y(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameDetialModleThreeActivity
    public void updateDownloadView() {
        org.androidannotations.api.b.e("", new z(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameDetialModleThreeActivity
    public void updateTitleButn(ResultMainBean resultMainBean, int i4) {
        org.androidannotations.api.b.e("", new u(resultMainBean, i4), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameDetialModleThreeActivity
    public void v0() {
        org.androidannotations.api.b.e("", new s(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameDetialModleThreeActivity
    public void w0(CommentBaseBean commentBaseBean, int i4, int i5) {
        org.androidannotations.api.a.l(new i0("", 0L, "", commentBaseBean, i4, i5));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameDetialModleThreeActivity
    public void y0(CommentBaseBean commentBaseBean, int i4, int i5) {
        org.androidannotations.api.a.l(new j0("", 0L, "", commentBaseBean, i4, i5));
    }
}
