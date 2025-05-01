package com.join.mgps.activity;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.Fragment;
import com.join.android.app.common.view.ClearEditText;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.ForumLoadingView;
import com.join.mgps.customview.RewardType;
import com.join.mgps.customview.XListView;
import com.join.mgps.dto.ForumBean;
import it.sephiroth.android.library.widget.HListView;
import java.util.HashMap;
import java.util.Map;
import org.androidannotations.api.a;
/* loaded from: classes4.dex */
public final class ForumProfileMessageReplyActivity_ extends ForumProfileMessageReplyActivity implements y3.a, a4.a, a4.b {
    private final a4.c Q1 = new a4.c();
    private final Map<Class<?>, Object> R1 = new HashMap();

    /* loaded from: classes4.dex */
    class a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f31163b;

        a(String str) {
            this.f31163b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            ForumProfileMessageReplyActivity_.super.showToast(this.f31163b);
        }
    }

    /* loaded from: classes4.dex */
    class a0 extends a.c {
        a0(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                ForumProfileMessageReplyActivity_.super.j1();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class b implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ RewardType f31166b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f31167c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f31168d;

        b(RewardType rewardType, int i4, int i5) {
            this.f31166b = rewardType;
            this.f31167c = i4;
            this.f31168d = i5;
        }

        @Override // java.lang.Runnable
        public void run() {
            ForumProfileMessageReplyActivity_.super.w1(this.f31166b, this.f31167c, this.f31168d);
        }
    }

    /* loaded from: classes4.dex */
    class b0 extends a.c {
        b0(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                ForumProfileMessageReplyActivity_.super.touristLogin();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ForumProfileMessageReplyActivity_.super.s1();
        }
    }

    /* loaded from: classes4.dex */
    class c0 extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f31172b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c0(String str, long j4, String str2, int i4) {
            super(str, j4, str2);
            this.f31172b = i4;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                ForumProfileMessageReplyActivity_.super.y0(this.f31172b);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ForumProfileMessageReplyActivity_.super.W0();
        }
    }

    /* loaded from: classes4.dex */
    class d0 extends a.c {
        d0(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                ForumProfileMessageReplyActivity_.super.X0();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class e implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f31176b;

        e(String str) {
            this.f31176b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            ForumProfileMessageReplyActivity_.super.error(this.f31176b);
        }
    }

    /* loaded from: classes4.dex */
    class e0 extends a.c {
        e0(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                ForumProfileMessageReplyActivity_.super.k1();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class f implements Runnable {
        f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ForumProfileMessageReplyActivity_.super.E0();
        }
    }

    /* loaded from: classes4.dex */
    class f0 extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f31180b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f0(String str, long j4, String str2, int i4) {
            super(str, j4, str2);
            this.f31180b = i4;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                ForumProfileMessageReplyActivity_.super.z0(this.f31180b);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class g implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ForumBean.ForumCommentBean f31182b;

        g(ForumBean.ForumCommentBean forumCommentBean) {
            this.f31182b = forumCommentBean;
        }

        @Override // java.lang.Runnable
        public void run() {
            ForumProfileMessageReplyActivity_.super.b1(this.f31182b);
        }
    }

    /* loaded from: classes4.dex */
    class g0 implements View.OnClickListener {
        g0() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ForumProfileMessageReplyActivity_.this.r0();
        }
    }

    /* loaded from: classes4.dex */
    class h implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f31185b;

        h(int i4) {
            this.f31185b = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            ForumProfileMessageReplyActivity_.super.Y0(this.f31185b);
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
                ForumProfileMessageReplyActivity_.super.F0();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class i implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f31188b;

        i(int i4) {
            this.f31188b = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            ForumProfileMessageReplyActivity_.super.e1(this.f31188b);
        }
    }

    /* loaded from: classes4.dex */
    class i0 extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f31190b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f31191c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i0(String str, long j4, String str2, int i4, int i5) {
            super(str, j4, str2);
            this.f31190b = i4;
            this.f31191c = i5;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                ForumProfileMessageReplyActivity_.super.G0(this.f31190b, this.f31191c);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class j implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ForumBean.ForumCommentReplyBean f31193b;

        j(ForumBean.ForumCommentReplyBean forumCommentReplyBean) {
            this.f31193b = forumCommentReplyBean;
        }

        @Override // java.lang.Runnable
        public void run() {
            ForumProfileMessageReplyActivity_.super.Z0(this.f31193b);
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
                ForumProfileMessageReplyActivity_.super.A0();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class k implements View.OnClickListener {
        k() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ForumProfileMessageReplyActivity_.this.back_image();
        }
    }

    /* loaded from: classes4.dex */
    class k0 implements View.OnClickListener {
        k0() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ForumProfileMessageReplyActivity_.this.s0();
        }
    }

    /* loaded from: classes4.dex */
    class l implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ForumBean.ForumCommentReplyBean f31198b;

        l(ForumBean.ForumCommentReplyBean forumCommentReplyBean) {
            this.f31198b = forumCommentReplyBean;
        }

        @Override // java.lang.Runnable
        public void run() {
            ForumProfileMessageReplyActivity_.super.a1(this.f31198b);
        }
    }

    /* loaded from: classes4.dex */
    class l0 implements Runnable {
        l0() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ForumProfileMessageReplyActivity_.super.v0();
        }
    }

    /* loaded from: classes4.dex */
    class m implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f31201b;

        m(int i4) {
            this.f31201b = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            ForumProfileMessageReplyActivity_.super.c1(this.f31201b);
        }
    }

    /* loaded from: classes4.dex */
    class m0 implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ForumBean.ForumCommentBean f31203b;

        m0(ForumBean.ForumCommentBean forumCommentBean) {
            this.f31203b = forumCommentBean;
        }

        @Override // java.lang.Runnable
        public void run() {
            ForumProfileMessageReplyActivity_.super.A1(this.f31203b);
        }
    }

    /* loaded from: classes4.dex */
    class n implements Runnable {
        n() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ForumProfileMessageReplyActivity_.super.w0();
        }
    }

    /* loaded from: classes4.dex */
    class n0 implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f31206b;

        n0(int i4) {
            this.f31206b = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            ForumProfileMessageReplyActivity_.super.t0(this.f31206b);
        }
    }

    /* loaded from: classes4.dex */
    class o implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f31208b;

        o(int i4) {
            this.f31208b = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            ForumProfileMessageReplyActivity_.super.x1(this.f31208b);
        }
    }

    /* loaded from: classes4.dex */
    class o0 implements Runnable {
        o0() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ForumProfileMessageReplyActivity_.super.y1();
        }
    }

    /* loaded from: classes4.dex */
    class p implements Runnable {
        p() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ForumProfileMessageReplyActivity_.super.I0();
        }
    }

    /* loaded from: classes4.dex */
    class p0 implements Runnable {
        p0() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ForumProfileMessageReplyActivity_.super.U0();
        }
    }

    /* loaded from: classes4.dex */
    class q implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f31213b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f31214c;

        q(View view, int i4) {
            this.f31213b = view;
            this.f31214c = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            ForumProfileMessageReplyActivity_.super.t1(this.f31213b, this.f31214c);
        }
    }

    /* loaded from: classes4.dex */
    public static class q0 extends org.androidannotations.api.builder.a<q0> {

        /* renamed from: a  reason: collision with root package name */
        private Fragment f31216a;

        public q0(Context context) {
            super(context, ForumProfileMessageReplyActivity_.class);
        }

        @Override // org.androidannotations.api.builder.a, org.androidannotations.api.builder.b
        public org.androidannotations.api.builder.f startForResult(int i4) {
            Fragment fragment = this.f31216a;
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

        public q0(Fragment fragment) {
            super(fragment.getActivity(), ForumProfileMessageReplyActivity_.class);
            this.f31216a = fragment;
        }
    }

    /* loaded from: classes4.dex */
    class r implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f31217b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f31218c;

        r(boolean z4, boolean z5) {
            this.f31217b = z4;
            this.f31218c = z5;
        }

        @Override // java.lang.Runnable
        public void run() {
            ForumProfileMessageReplyActivity_.super.n1(this.f31217b, this.f31218c);
        }
    }

    /* loaded from: classes4.dex */
    class s implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f31220b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f31221c;

        s(boolean z4, int i4) {
            this.f31220b = z4;
            this.f31221c = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            ForumProfileMessageReplyActivity_.super.T0(this.f31220b, this.f31221c);
        }
    }

    /* loaded from: classes4.dex */
    class t implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f31223b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f31224c;

        t(int i4, int i5) {
            this.f31223b = i4;
            this.f31224c = i5;
        }

        @Override // java.lang.Runnable
        public void run() {
            ForumProfileMessageReplyActivity_.super.v1(this.f31223b, this.f31224c);
        }
    }

    /* loaded from: classes4.dex */
    class u implements Runnable {
        u() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ForumProfileMessageReplyActivity_.super.p1();
        }
    }

    /* loaded from: classes4.dex */
    class v implements View.OnClickListener {
        v() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ForumProfileMessageReplyActivity_.this.P0();
        }
    }

    /* loaded from: classes4.dex */
    class w implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f31228b;

        w(String str) {
            this.f31228b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            ForumProfileMessageReplyActivity_.super.showMessage(this.f31228b);
        }
    }

    /* loaded from: classes4.dex */
    class x implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f31230b;

        x(int i4) {
            this.f31230b = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            ForumProfileMessageReplyActivity_.super.u1(this.f31230b);
        }
    }

    /* loaded from: classes4.dex */
    class y extends a.c {
        y(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                ForumProfileMessageReplyActivity_.super.R0();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class z extends a.c {
        z(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                ForumProfileMessageReplyActivity_.super.H0();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    private void init_(Bundle bundle) {
        Resources resources = getResources();
        a4.c.b(this);
        this.f31141x = resources.getString(R.string.net_excption);
        this.f31142y = resources.getString(R.string.connect_server_excption);
    }

    public static q0 o2(Context context) {
        return new q0(context);
    }

    public static q0 p2(Fragment fragment) {
        return new q0(fragment);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ForumProfileMessageReplyActivity
    public void A0() {
        org.androidannotations.api.a.l(new j0("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ForumProfileMessageReplyActivity
    public void A1(ForumBean.ForumCommentBean forumCommentBean) {
        org.androidannotations.api.b.e("", new m0(forumCommentBean), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ForumProfileMessageReplyActivity
    public void E0() {
        org.androidannotations.api.b.e("", new f(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ForumProfileMessageReplyActivity
    public void F0() {
        org.androidannotations.api.a.l(new h0("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ForumProfileMessageReplyActivity
    public void G0(int i4, int i5) {
        org.androidannotations.api.a.l(new i0("", 0L, "", i4, i5));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ForumProfileMessageReplyActivity
    public void H0() {
        org.androidannotations.api.a.l(new z("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ForumProfileMessageReplyActivity
    public void I0() {
        org.androidannotations.api.b.e("", new p(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ForumProfileMessageReplyActivity
    public void R0() {
        org.androidannotations.api.a.l(new y("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ForumProfileMessageReplyActivity
    public void T0(boolean z4, int i4) {
        org.androidannotations.api.b.e("", new s(z4, i4), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ForumProfileMessageReplyActivity
    public void U0() {
        org.androidannotations.api.b.e("", new p0(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ForumProfileMessageReplyActivity
    public void W0() {
        org.androidannotations.api.b.e("", new d(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ForumProfileMessageReplyActivity
    public void X0() {
        org.androidannotations.api.a.l(new d0("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ForumProfileMessageReplyActivity
    public void Y0(int i4) {
        org.androidannotations.api.b.e("", new h(i4), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ForumProfileMessageReplyActivity
    public void Z0(ForumBean.ForumCommentReplyBean forumCommentReplyBean) {
        org.androidannotations.api.b.e("", new j(forumCommentReplyBean), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ForumProfileMessageReplyActivity
    public void a1(ForumBean.ForumCommentReplyBean forumCommentReplyBean) {
        org.androidannotations.api.b.e("", new l(forumCommentReplyBean), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ForumProfileMessageReplyActivity
    public void b1(ForumBean.ForumCommentBean forumCommentBean) {
        org.androidannotations.api.b.e("", new g(forumCommentBean), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ForumProfileMessageReplyActivity
    public void c1(int i4) {
        org.androidannotations.api.b.e("", new m(i4), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ForumProfileMessageReplyActivity
    public void e1(int i4) {
        org.androidannotations.api.b.e("", new i(i4), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ForumProfileMessageReplyActivity
    public void error(String str) {
        org.androidannotations.api.b.e("", new e(str), 0L);
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.R1.get(cls);
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        return (T) findViewById(i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ForumProfileMessageReplyActivity
    public void j1() {
        org.androidannotations.api.a.l(new a0("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ForumProfileMessageReplyActivity
    public void k1() {
        org.androidannotations.api.a.l(new e0("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ForumProfileMessageReplyActivity
    public void n1(boolean z4, boolean z5) {
        org.androidannotations.api.b.e("", new r(z4, z5), 0L);
    }

    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.Q1);
        init_(bundle);
        super.onCreate(bundle);
        a4.c.c(c5);
        setContentView(R.layout.mg_forum_profile_message_reply_activity);
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f31116b = (RelativeLayout) aVar.internalFindViewById(R.id.layout_forum_posts_title);
        this.f31117c = (ImageView) aVar.internalFindViewById(R.id.back_image);
        this.f31118d = (TextView) aVar.internalFindViewById(R.id.layout_title);
        this.f31119e = (TextView) aVar.internalFindViewById(R.id.layout_title_right);
        this.f31120f = (ForumLoadingView) aVar.internalFindViewById(R.id.loadingView);
        this.f31121g = (ClearEditText) aVar.internalFindViewById(R.id.edit_user_comment);
        this.f31122h = (Button) aVar.internalFindViewById(R.id.btn_chat_praise);
        this.f31123i = (Button) aVar.internalFindViewById(R.id.btn_chat_send);
        this.f31124j = (TextView) aVar.internalFindViewById(R.id.edit_comment_count);
        this.f31125k = (ImageView) aVar.internalFindViewById(R.id.image_add);
        this.f31126l = (TextView) aVar.internalFindViewById(R.id.footer_tip);
        this.f31127m = (Button) aVar.internalFindViewById(R.id.btn_chat_extension);
        this.f31128n = (LinearLayout) aVar.internalFindViewById(R.id.chat_layout_more);
        this.f31129o = aVar.internalFindViewById(R.id.chat_layout_extension);
        this.f31130p = (LinearLayout) aVar.internalFindViewById(R.id.chat_layout_extension_container);
        this.f31133q = (HListView) aVar.internalFindViewById(R.id.matchListView);
        this.f31134r = (XListView) aVar.internalFindViewById(R.id.mg_forum_profile_message_list);
        ImageView imageView = this.f31117c;
        if (imageView != null) {
            imageView.setOnClickListener(new k());
        }
        TextView textView = this.f31119e;
        if (textView != null) {
            textView.setOnClickListener(new v());
        }
        Button button = this.f31122h;
        if (button != null) {
            button.setOnClickListener(new g0());
        }
        Button button2 = this.f31123i;
        if (button2 != null) {
            button2.setOnClickListener(new k0());
        }
        afterViews();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ForumProfileMessageReplyActivity
    public void p1() {
        org.androidannotations.api.b.e("", new u(), 0L);
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.R1.put(cls, t4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ForumProfileMessageReplyActivity
    public void s1() {
        org.androidannotations.api.b.e("", new c(), 0L);
    }

    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i4) {
        super.setContentView(i4);
        this.Q1.a(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ForumProfileMessageReplyActivity
    public void showMessage(String str) {
        org.androidannotations.api.b.e("", new w(str), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ForumProfileMessageReplyActivity
    public void showToast(String str) {
        org.androidannotations.api.b.e("", new a(str), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ForumProfileMessageReplyActivity
    public void t0(int i4) {
        org.androidannotations.api.b.e("", new n0(i4), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ForumProfileMessageReplyActivity
    public void t1(View view, int i4) {
        org.androidannotations.api.b.e("", new q(view, i4), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ForumProfileMessageReplyActivity
    public void touristLogin() {
        org.androidannotations.api.a.l(new b0("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ForumProfileMessageReplyActivity
    public void u1(int i4) {
        org.androidannotations.api.b.e("", new x(i4), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ForumProfileMessageReplyActivity
    public void v0() {
        org.androidannotations.api.b.e("", new l0(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ForumProfileMessageReplyActivity
    public void v1(int i4, int i5) {
        org.androidannotations.api.b.e("", new t(i4, i5), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ForumProfileMessageReplyActivity
    public void w0() {
        org.androidannotations.api.b.e("", new n(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ForumProfileMessageReplyActivity
    public void w1(RewardType rewardType, int i4, int i5) {
        org.androidannotations.api.b.e("", new b(rewardType, i4, i5), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ForumProfileMessageReplyActivity
    public void x1(int i4) {
        org.androidannotations.api.b.e("", new o(i4), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ForumProfileMessageReplyActivity
    public void y0(int i4) {
        org.androidannotations.api.a.l(new c0("", 0L, "", i4));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ForumProfileMessageReplyActivity
    public void y1() {
        org.androidannotations.api.b.e("", new o0(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ForumProfileMessageReplyActivity
    public void z0(int i4) {
        org.androidannotations.api.a.l(new f0("", 0L, "", i4));
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        this.Q1.a(this);
    }

    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        super.setContentView(view);
        this.Q1.a(this);
    }
}
