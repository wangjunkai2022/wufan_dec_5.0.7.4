package com.join.mgps.activity;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.donkingliang.consecutivescroller.ConsecutiveScrollerLayout;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.common.view.ClearEditText;
import com.join.android.app.component.video.MyVideoView;
import com.join.android.app.component.xrecyclerview.XQuickRecyclerView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.CustomLoadingView;
import com.join.mgps.customview.ForumStickView;
import com.join.mgps.customview.RewardType;
import com.join.mgps.customview.VipView;
import com.join.mgps.dto.CollectionBeanSub;
import com.join.mgps.dto.DetailResultBean;
import com.join.mgps.dto.ExtBean;
import com.join.mgps.dto.ForumBean;
import it.sephiroth.android.library.widget.HListView;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.androidannotations.api.a;
/* loaded from: classes4.dex */
public final class ForumPostsActivity_ extends ForumPostsActivity implements y3.a, a4.a, a4.b {
    public static final String G3 = "extBean";
    private final a4.c C3 = new a4.c();
    private final Map<Class<?>, Object> D3 = new HashMap();
    private final IntentFilter E3 = new IntentFilter();
    private final BroadcastReceiver F3 = new k();

    /* loaded from: classes4.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ForumPostsActivity_.this.F1();
        }
    }

    /* loaded from: classes4.dex */
    class a0 implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f30742b;

        a0(int i4) {
            this.f30742b = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            ForumPostsActivity_.super.Y1(this.f30742b);
        }
    }

    /* loaded from: classes4.dex */
    class a1 extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f30744b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f30745c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a1(String str, long j4, String str2, int i4, int i5) {
            super(str, j4, str2);
            this.f30744b = i4;
            this.f30745c = i5;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                ForumPostsActivity_.super.T0(this.f30744b, this.f30745c);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class b implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f30747b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f30748c;

        b(boolean z4, int i4) {
            this.f30747b = z4;
            this.f30748c = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            ForumPostsActivity_.super.y1(this.f30747b, this.f30748c);
        }
    }

    /* loaded from: classes4.dex */
    class b0 implements Runnable {
        b0() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ForumPostsActivity_.super.F2();
        }
    }

    /* loaded from: classes4.dex */
    class b1 extends a.c {
        b1(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                ForumPostsActivity_.super.L0();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class c implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f30752b;

        c(boolean z4) {
            this.f30752b = z4;
        }

        @Override // java.lang.Runnable
        public void run() {
            ForumPostsActivity_.super.z1(this.f30752b);
        }
    }

    /* loaded from: classes4.dex */
    class c0 implements Runnable {
        c0() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ForumPostsActivity_.super.l2();
        }
    }

    /* loaded from: classes4.dex */
    class c1 implements View.OnClickListener {
        c1() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ForumPostsActivity_.this.back_image();
        }
    }

    /* loaded from: classes4.dex */
    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ForumPostsActivity_.super.H0();
        }
    }

    /* loaded from: classes4.dex */
    class d0 implements Runnable {
        d0() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ForumPostsActivity_.super.k2();
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
                ForumPostsActivity_.super.Q0();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ForumPostsActivity_.super.P2();
        }
    }

    /* loaded from: classes4.dex */
    class e0 implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ForumBean.ForumPostsBean f30760b;

        e0(ForumBean.ForumPostsBean forumPostsBean) {
            this.f30760b = forumPostsBean;
        }

        @Override // java.lang.Runnable
        public void run() {
            ForumPostsActivity_.super.A2(this.f30760b);
        }
    }

    /* loaded from: classes4.dex */
    class e1 extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f30762b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e1(String str, long j4, String str2, String str3) {
            super(str, j4, str2);
            this.f30762b = str3;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                ForumPostsActivity_.super.X0(this.f30762b);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class f implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f30764b;

        f(int i4) {
            this.f30764b = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            ForumPostsActivity_.super.E0(this.f30764b);
        }
    }

    /* loaded from: classes4.dex */
    class f0 implements Runnable {
        f0() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ForumPostsActivity_.super.j2();
        }
    }

    /* loaded from: classes4.dex */
    class f1 extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f30767b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f1(String str, long j4, String str2, String str3) {
            super(str, j4, str2);
            this.f30767b = str3;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                ForumPostsActivity_.super.x0(this.f30767b);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class g implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f30769b;

        g(int i4) {
            this.f30769b = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            ForumPostsActivity_.super.L2(this.f30769b);
        }
    }

    /* loaded from: classes4.dex */
    class g0 implements View.OnClickListener {
        g0() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ForumPostsActivity_.this.A0();
        }
    }

    /* loaded from: classes4.dex */
    class g1 extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f30772b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g1(String str, long j4, String str2, String str3) {
            super(str, j4, str2);
            this.f30772b = str3;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                ForumPostsActivity_.super.n2(this.f30772b);
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
            ForumPostsActivity_.super.P0();
        }
    }

    /* loaded from: classes4.dex */
    class h0 implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ RecyclerView f30775b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f30776c;

        h0(RecyclerView recyclerView, int i4) {
            this.f30775b = recyclerView;
            this.f30776c = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            ForumPostsActivity_.super.W2(this.f30775b, this.f30776c);
        }
    }

    /* loaded from: classes4.dex */
    class h1 extends a.c {
        h1(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                ForumPostsActivity_.super.v2();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class i implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f30779b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f30780c;

        i(int i4, int i5) {
            this.f30779b = i4;
            this.f30780c = i5;
        }

        @Override // java.lang.Runnable
        public void run() {
            ForumPostsActivity_.super.J2(this.f30779b, this.f30780c);
        }
    }

    /* loaded from: classes4.dex */
    class i0 implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ RecyclerView f30782b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f30783c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f30784d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f30785e;

        i0(RecyclerView recyclerView, int i4, int i5, int i6) {
            this.f30782b = recyclerView;
            this.f30783c = i4;
            this.f30784d = i5;
            this.f30785e = i6;
        }

        @Override // java.lang.Runnable
        public void run() {
            ForumPostsActivity_.super.V2(this.f30782b, this.f30783c, this.f30784d, this.f30785e);
        }
    }

    /* loaded from: classes4.dex */
    class i1 extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f30787b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f30788c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f30789d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i1(String str, long j4, String str2, String str3, int i4, String str4) {
            super(str, j4, str2);
            this.f30787b = str3;
            this.f30788c = i4;
            this.f30789d = str4;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                ForumPostsActivity_.super.P1(this.f30787b, this.f30788c, this.f30789d);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class j implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CharSequence f30791b;

        j(CharSequence charSequence) {
            this.f30791b = charSequence;
        }

        @Override // java.lang.Runnable
        public void run() {
            ForumPostsActivity_.super.M2(this.f30791b);
        }
    }

    /* loaded from: classes4.dex */
    class j0 implements Runnable {
        j0() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ForumPostsActivity_.super.B2();
        }
    }

    /* loaded from: classes4.dex */
    class j1 implements View.OnClickListener {
        j1() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ForumPostsActivity_.this.B0();
        }
    }

    /* loaded from: classes4.dex */
    class k extends BroadcastReceiver {

        /* renamed from: b  reason: collision with root package name */
        public static final String f30795b = "gameData";

        k() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            ForumPostsActivity_.this.G1((CollectionBeanSub) (intent.getExtras() != null ? intent.getExtras() : new Bundle()).getSerializable("gameData"));
        }
    }

    /* loaded from: classes4.dex */
    class k0 implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f30797b;

        k0(String str) {
            this.f30797b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            ForumPostsActivity_.super.showMessage(this.f30797b);
        }
    }

    /* loaded from: classes4.dex */
    class k1 implements View.OnClickListener {
        k1() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ForumPostsActivity_.this.z0();
        }
    }

    /* loaded from: classes4.dex */
    class l implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ RewardType f30800b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f30801c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f30802d;

        l(RewardType rewardType, int i4, int i5) {
            this.f30800b = rewardType;
            this.f30801c = i4;
            this.f30802d = i5;
        }

        @Override // java.lang.Runnable
        public void run() {
            ForumPostsActivity_.super.K2(this.f30800b, this.f30801c, this.f30802d);
        }
    }

    /* loaded from: classes4.dex */
    class l0 implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DetailResultBean f30804b;

        l0(DetailResultBean detailResultBean) {
            this.f30804b = detailResultBean;
        }

        @Override // java.lang.Runnable
        public void run() {
            ForumPostsActivity_.super.startDown(this.f30804b);
        }
    }

    /* loaded from: classes4.dex */
    class l1 implements View.OnClickListener {
        l1() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ForumPostsActivity_.this.j1();
        }
    }

    /* loaded from: classes4.dex */
    class m implements Runnable {
        m() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ForumPostsActivity_.super.g1();
        }
    }

    /* loaded from: classes4.dex */
    class m0 implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f30808b;

        m0(String str) {
            this.f30808b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            ForumPostsActivity_.super.B1(this.f30808b);
        }
    }

    /* loaded from: classes4.dex */
    class m1 implements View.OnClickListener {
        m1() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ForumPostsActivity_.this.N1();
        }
    }

    /* loaded from: classes4.dex */
    class n implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ForumBean.ForumPostsBean f30811b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f30812c;

        n(ForumBean.ForumPostsBean forumPostsBean, boolean z4) {
            this.f30811b = forumPostsBean;
            this.f30812c = z4;
        }

        @Override // java.lang.Runnable
        public void run() {
            ForumPostsActivity_.super.x2(this.f30811b, this.f30812c);
        }
    }

    /* loaded from: classes4.dex */
    class n0 implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f30814b;

        n0(String str) {
            this.f30814b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            ForumPostsActivity_.super.C1(this.f30814b);
        }
    }

    /* loaded from: classes4.dex */
    public static class n1 extends org.androidannotations.api.builder.a<n1> {

        /* renamed from: a  reason: collision with root package name */
        private Fragment f30816a;

        public n1(Context context) {
            super(context, ForumPostsActivity_.class);
        }

        public n1 a(ExtBean extBean) {
            return (n1) super.extra("extBean", extBean);
        }

        @Override // org.androidannotations.api.builder.a, org.androidannotations.api.builder.b
        public org.androidannotations.api.builder.f startForResult(int i4) {
            Fragment fragment = this.f30816a;
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

        public n1(Fragment fragment) {
            super(fragment.getActivity(), ForumPostsActivity_.class);
            this.f30816a = fragment;
        }
    }

    /* loaded from: classes4.dex */
    class o implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f30817b;

        o(boolean z4) {
            this.f30817b = z4;
        }

        @Override // java.lang.Runnable
        public void run() {
            ForumPostsActivity_.super.D0(this.f30817b);
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
                ForumPostsActivity_.super.Q1();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class p implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f30820b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f30821c;

        p(List list, int i4) {
            this.f30820b = list;
            this.f30821c = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            ForumPostsActivity_.super.U1(this.f30820b, this.f30821c);
        }
    }

    /* loaded from: classes4.dex */
    class p0 extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f30823b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f30824c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f30825d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p0(String str, long j4, String str2, boolean z4, boolean z5, int i4) {
            super(str, j4, str2);
            this.f30823b = z4;
            this.f30824c = z5;
            this.f30825d = i4;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                ForumPostsActivity_.super.v1(this.f30823b, this.f30824c, this.f30825d);
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
            ForumPostsActivity_.super.x1();
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
                ForumPostsActivity_.super.q2();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class r implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f30829b;

        r(int i4) {
            this.f30829b = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            ForumPostsActivity_.super.H2(this.f30829b);
        }
    }

    /* loaded from: classes4.dex */
    class r0 implements View.OnClickListener {
        r0() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ForumPostsActivity_.this.C0();
        }
    }

    /* loaded from: classes4.dex */
    class s implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f30832b;

        s(String str) {
            this.f30832b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            ForumPostsActivity_.super.error(this.f30832b);
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
                ForumPostsActivity_.super.touristLogin();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class t implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f30835b;

        t(int i4) {
            this.f30835b = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            ForumPostsActivity_.super.e2(this.f30835b);
        }
    }

    /* loaded from: classes4.dex */
    class t0 extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f30837b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        t0(String str, long j4, String str2, int i4) {
            super(str, j4, str2);
            this.f30837b = i4;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                ForumPostsActivity_.super.J0(this.f30837b);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class u implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ForumBean.ForumCommentBean f30839b;

        u(ForumBean.ForumCommentBean forumCommentBean) {
            this.f30839b = forumCommentBean;
        }

        @Override // java.lang.Runnable
        public void run() {
            ForumPostsActivity_.super.X1(this.f30839b);
        }
    }

    /* loaded from: classes4.dex */
    class u0 extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f30841b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f30842c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        u0(String str, long j4, String str2, int i4, int i5) {
            super(str, j4, str2);
            this.f30841b = i4;
            this.f30842c = i5;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                ForumPostsActivity_.super.f1(this.f30841b, this.f30842c);
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
            ForumPostsActivity_.this.H1();
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
                ForumPostsActivity_.super.r2();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class w implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f30846b;

        w(int i4) {
            this.f30846b = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            ForumPostsActivity_.super.S1(this.f30846b);
        }
    }

    /* loaded from: classes4.dex */
    class w0 extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f30848b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        w0(String str, long j4, String str2, int i4) {
            super(str, j4, str2);
            this.f30848b = i4;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                ForumPostsActivity_.super.K0(this.f30848b);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class x implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f30850b;

        x(int i4) {
            this.f30850b = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            ForumPostsActivity_.super.T1(this.f30850b);
        }
    }

    /* loaded from: classes4.dex */
    class x0 extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ListView f30852b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f30853c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f30854d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f30855e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        x0(String str, long j4, String str2, ListView listView, int i4, int i5, int i6) {
            super(str, j4, str2);
            this.f30852b = listView;
            this.f30853c = i4;
            this.f30854d = i5;
            this.f30855e = i6;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                ForumPostsActivity_.super.R1(this.f30852b, this.f30853c, this.f30854d, this.f30855e);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class y implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ForumBean.ForumCommentReplyBean f30857b;

        y(ForumBean.ForumCommentReplyBean forumCommentReplyBean) {
            this.f30857b = forumCommentReplyBean;
        }

        @Override // java.lang.Runnable
        public void run() {
            ForumPostsActivity_.super.V1(this.f30857b);
        }
    }

    /* loaded from: classes4.dex */
    class y0 extends a.c {
        y0(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                ForumPostsActivity_.super.R0();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class z implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ForumBean.ForumCommentReplyBean f30860b;

        z(ForumBean.ForumCommentReplyBean forumCommentReplyBean) {
            this.f30860b = forumCommentReplyBean;
        }

        @Override // java.lang.Runnable
        public void run() {
            ForumPostsActivity_.super.W1(this.f30860b);
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
                ForumPostsActivity_.super.S0();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    public static n1 b4(Context context) {
        return new n1(context);
    }

    public static n1 c4(Fragment fragment) {
        return new n1(fragment);
    }

    private void init_(Bundle bundle) {
        Resources resources = getResources();
        a4.c.b(this);
        this.C1 = resources.getString(R.string.net_excption);
        this.D1 = resources.getString(R.string.connect_server_excption);
        injectExtras_();
        supportRequestWindowFeature(10);
        this.E3.addAction(o1.a.I);
        this.E3.addAction(o1.a.G);
        registerReceiver(this.F3, this.E3);
    }

    private void injectExtras_() {
        Bundle extras = getIntent().getExtras();
        if (extras == null || !extras.containsKey("extBean")) {
            return;
        }
        this.F1 = (ExtBean) extras.getSerializable("extBean");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ForumPostsActivity
    public void A2(ForumBean.ForumPostsBean forumPostsBean) {
        org.androidannotations.api.b.e("", new e0(forumPostsBean), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ForumPostsActivity
    public void B1(String str) {
        org.androidannotations.api.b.e("", new m0(str), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ForumPostsActivity
    public void B2() {
        org.androidannotations.api.b.e("", new j0(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ForumPostsActivity
    public void C1(String str) {
        org.androidannotations.api.b.e("", new n0(str), 0L);
    }

    @Override // com.join.mgps.activity.ForumPostsActivity
    public void D0(boolean z4) {
        org.androidannotations.api.b.e("", new o(z4), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ForumPostsActivity
    public void E0(int i4) {
        org.androidannotations.api.b.e("", new f(i4), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ForumPostsActivity
    public void F2() {
        org.androidannotations.api.b.e("", new b0(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ForumPostsActivity
    public void H0() {
        org.androidannotations.api.b.e("", new d(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ForumPostsActivity
    public void H2(int i4) {
        org.androidannotations.api.b.e("", new r(i4), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ForumPostsActivity
    public void J0(int i4) {
        org.androidannotations.api.a.l(new t0("", 0L, "", i4));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ForumPostsActivity
    public void J2(int i4, int i5) {
        org.androidannotations.api.b.e("", new i(i4, i5), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ForumPostsActivity
    public void K0(int i4) {
        org.androidannotations.api.a.l(new w0("", 0L, "", i4));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ForumPostsActivity
    public void K2(RewardType rewardType, int i4, int i5) {
        org.androidannotations.api.b.e("", new l(rewardType, i4, i5), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ForumPostsActivity
    public void L0() {
        org.androidannotations.api.a.l(new b1("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ForumPostsActivity
    public void L2(int i4) {
        org.androidannotations.api.b.e("", new g(i4), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ForumPostsActivity
    public void M2(CharSequence charSequence) {
        org.androidannotations.api.b.e("", new j(charSequence), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ForumPostsActivity
    public void P0() {
        org.androidannotations.api.b.e("", new h(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ForumPostsActivity
    public void P1(String str, int i4, String str2) {
        org.androidannotations.api.a.l(new i1("", 0L, "", str, i4, str2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ForumPostsActivity
    public void P2() {
        org.androidannotations.api.b.e("", new e(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ForumPostsActivity
    public void Q0() {
        org.androidannotations.api.a.l(new d1("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ForumPostsActivity
    public void Q1() {
        org.androidannotations.api.a.l(new o0("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ForumPostsActivity
    public void R0() {
        org.androidannotations.api.a.l(new y0("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ForumPostsActivity
    public void R1(ListView listView, int i4, int i5, int i6) {
        org.androidannotations.api.a.l(new x0("", 0L, "", listView, i4, i5, i6));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ForumPostsActivity
    public void S0() {
        org.androidannotations.api.a.l(new z0("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ForumPostsActivity
    public void S1(int i4) {
        org.androidannotations.api.b.e("", new w(i4), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ForumPostsActivity
    public void T0(int i4, int i5) {
        org.androidannotations.api.a.l(new a1("", 0L, "", i4, i5));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ForumPostsActivity
    public void T1(int i4) {
        org.androidannotations.api.b.e("", new x(i4), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ForumPostsActivity
    public void U1(List<ForumBean.ForumCommentBean> list, int i4) {
        org.androidannotations.api.b.e("", new p(list, i4), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ForumPostsActivity
    public void V1(ForumBean.ForumCommentReplyBean forumCommentReplyBean) {
        org.androidannotations.api.b.e("", new y(forumCommentReplyBean), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ForumPostsActivity
    public void V2(RecyclerView recyclerView, int i4, int i5, int i6) {
        org.androidannotations.api.b.e("", new i0(recyclerView, i4, i5, i6), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ForumPostsActivity
    public void W1(ForumBean.ForumCommentReplyBean forumCommentReplyBean) {
        org.androidannotations.api.b.e("", new z(forumCommentReplyBean), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ForumPostsActivity
    public void W2(RecyclerView recyclerView, int i4) {
        org.androidannotations.api.b.e("", new h0(recyclerView, i4), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ForumPostsActivity
    public void X0(String str) {
        org.androidannotations.api.a.l(new e1("", 0L, "", str));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ForumPostsActivity
    public void X1(ForumBean.ForumCommentBean forumCommentBean) {
        org.androidannotations.api.b.e("", new u(forumCommentBean), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ForumPostsActivity
    public void Y1(int i4) {
        org.androidannotations.api.b.e("", new a0(i4), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ForumPostsActivity
    public void e2(int i4) {
        org.androidannotations.api.b.e("", new t(i4), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ForumPostsActivity
    public void error(String str) {
        org.androidannotations.api.b.e("", new s(str), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ForumPostsActivity
    public void f1(int i4, int i5) {
        org.androidannotations.api.a.l(new u0("", 0L, "", i4, i5));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ForumPostsActivity
    public void g1() {
        org.androidannotations.api.b.e("", new m(), 0L);
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.D3.get(cls);
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        return (T) findViewById(i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ForumPostsActivity
    public void j2() {
        org.androidannotations.api.b.e("", new f0(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ForumPostsActivity
    public void k2() {
        org.androidannotations.api.b.e("", new d0(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ForumPostsActivity
    public void l2() {
        org.androidannotations.api.b.e("", new c0(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ForumPostsActivity
    public void n2(String str) {
        org.androidannotations.api.a.l(new g1("", 0L, "", str));
    }

    @Override // com.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.C3);
        init_(bundle);
        super.onCreate(bundle);
        a4.c.c(c5);
        setContentView(R.layout.mg_forum_post_activity);
    }

    @Override // com.join.mgps.activity.ForumPostsActivity, com.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        unregisterReceiver(this.F3);
        super.onDestroy();
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f30576b = (RelativeLayout) aVar.internalFindViewById(R.id.actionbarLayout);
        this.f30579c = (ImageView) aVar.internalFindViewById(R.id.back_image);
        this.f30582d = (TextView) aVar.internalFindViewById(R.id.layout_title);
        this.f30585e = (TextView) aVar.internalFindViewById(R.id.forum_post_nickname);
        this.f30588f = (CustomLoadingView) aVar.internalFindViewById(R.id.loadingView);
        this.f30591g = (LinearLayout) aVar.internalFindViewById(R.id.postFunction);
        this.f30594h = (TextView) aVar.internalFindViewById(R.id.postFuncHost);
        this.f30597i = (LinearLayout) aVar.internalFindViewById(R.id.postFuncMore);
        this.f30600j = (LinearLayout) aVar.internalFindViewById(R.id.layout_chat_cell_container);
        this.f30603k = (ClearEditText) aVar.internalFindViewById(R.id.edit_user_comment);
        this.f30606l = (Button) aVar.internalFindViewById(R.id.btn_chat_praise);
        this.f30609m = (Button) aVar.internalFindViewById(R.id.btn_chat_star);
        this.f30612n = (Button) aVar.internalFindViewById(R.id.btn_chat_send);
        this.f30615o = (TextView) aVar.internalFindViewById(R.id.edit_comment_count);
        this.f30618p = (RelativeLayout) aVar.internalFindViewById(R.id.rl_comment_count);
        this.f30623q = (ImageView) aVar.internalFindViewById(R.id.image_add);
        this.f30626r = (TextView) aVar.internalFindViewById(R.id.footer_tip);
        this.f30629s = (Button) aVar.internalFindViewById(R.id.btn_chat_extension);
        this.f30632t = (LinearLayout) aVar.internalFindViewById(R.id.chat_layout_more);
        this.f30635u = aVar.internalFindViewById(R.id.chat_layout_extension);
        this.f30638v = (LinearLayout) aVar.internalFindViewById(R.id.chat_layout_extension_container);
        this.f30641w = (HListView) aVar.internalFindViewById(R.id.matchListView);
        this.f30643x = (SimpleDraweeView) aVar.internalFindViewById(R.id.sdv_head);
        this.f30645y = (VipView) aVar.internalFindViewById(R.id.vipFlag);
        this.f30646z = (TextView) aVar.internalFindViewById(R.id.copperTitleTv);
        this.A = (TextView) aVar.internalFindViewById(R.id.moderator);
        this.B = (TextView) aVar.internalFindViewById(R.id.member_honor);
        this.C = (Button) aVar.internalFindViewById(R.id.forum_post_host);
        this.D = (ImageView) aVar.internalFindViewById(R.id.officialIcon);
        this.E = (ImageView) aVar.internalFindViewById(R.id.forum_post_moderator);
        this.F = (TextView) aVar.internalFindViewById(R.id.forum_post_stickie);
        this.G = (XQuickRecyclerView) aVar.internalFindViewById(R.id.rv_comment_list);
        this.H = (ConsecutiveScrollerLayout) aVar.internalFindViewById(R.id.csl_view);
        this.I = (ForumStickView) aVar.internalFindViewById(R.id.fsv_stick);
        this.J = (ImageView) aVar.internalFindViewById(R.id.iv_more);
        this.K = (RecyclerView) aVar.internalFindViewById(R.id.rv_head);
        this.L = aVar.internalFindViewById(R.id.view_empty);
        this.P2 = (FrameLayout) aVar.internalFindViewById(R.id.videoContainer);
        this.Q2 = (RelativeLayout) aVar.internalFindViewById(R.id.videoLayout);
        this.R2 = (MyVideoView) aVar.internalFindViewById(R.id.video);
        this.S2 = (SimpleDraweeView) aVar.internalFindViewById(R.id.cover);
        this.T2 = (ImageView) aVar.internalFindViewById(R.id.play);
        this.U2 = (LinearLayout) aVar.internalFindViewById(R.id.loadingLayout);
        RelativeLayout relativeLayout = this.f30618p;
        if (relativeLayout != null) {
            relativeLayout.setOnClickListener(new v());
        }
        Button button = this.f30606l;
        if (button != null) {
            button.setOnClickListener(new g0());
        }
        Button button2 = this.f30609m;
        if (button2 != null) {
            button2.setOnClickListener(new r0());
        }
        ImageView imageView = this.f30579c;
        if (imageView != null) {
            imageView.setOnClickListener(new c1());
        }
        Button button3 = this.f30612n;
        if (button3 != null) {
            button3.setOnClickListener(new j1());
        }
        Button button4 = this.f30629s;
        if (button4 != null) {
            button4.setOnClickListener(new k1());
        }
        ImageView imageView2 = this.f30623q;
        if (imageView2 != null) {
            imageView2.setOnClickListener(new l1());
        }
        LinearLayout linearLayout = this.f30597i;
        if (linearLayout != null) {
            linearLayout.setOnClickListener(new m1());
        }
        ImageView imageView3 = this.J;
        if (imageView3 != null) {
            imageView3.setOnClickListener(new a());
        }
        afterViews();
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.D3.put(cls, t4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ForumPostsActivity
    public void q2() {
        org.androidannotations.api.a.l(new q0("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ForumPostsActivity
    public void r2() {
        org.androidannotations.api.a.l(new v0("", 0L, ""));
    }

    @Override // com.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i4) {
        super.setContentView(i4);
        this.C3.a(this);
    }

    @Override // android.app.Activity
    public void setIntent(Intent intent) {
        super.setIntent(intent);
        injectExtras_();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ForumPostsActivity
    public void showMessage(String str) {
        org.androidannotations.api.b.e("", new k0(str), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ForumPostsActivity
    public void startDown(DetailResultBean detailResultBean) {
        org.androidannotations.api.b.e("", new l0(detailResultBean), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ForumPostsActivity
    public void touristLogin() {
        org.androidannotations.api.a.l(new s0("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ForumPostsActivity
    public void v1(boolean z4, boolean z5, int i4) {
        org.androidannotations.api.a.l(new p0("", 0L, "", z4, z5, i4));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ForumPostsActivity
    public void v2() {
        org.androidannotations.api.a.l(new h1("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ForumPostsActivity
    public void x0(String str) {
        org.androidannotations.api.a.l(new f1("", 0L, "", str));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ForumPostsActivity
    public void x1() {
        org.androidannotations.api.b.e("", new q(), 500L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ForumPostsActivity
    public void x2(ForumBean.ForumPostsBean forumPostsBean, boolean z4) {
        org.androidannotations.api.b.e("", new n(forumPostsBean, z4), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ForumPostsActivity
    public void y1(boolean z4, int i4) {
        org.androidannotations.api.b.e("", new b(z4, i4), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ForumPostsActivity
    public void z1(boolean z4) {
        org.androidannotations.api.b.e("", new c(z4), 0L);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        this.C3.a(this);
    }

    @Override // com.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        super.setContentView(view);
        this.C3.a(this);
    }
}
