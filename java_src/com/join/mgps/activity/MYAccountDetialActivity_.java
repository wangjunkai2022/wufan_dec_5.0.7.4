package com.join.mgps.activity;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.Fragment;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.pref.PrefDef_;
import java.util.HashMap;
import java.util.Map;
import org.androidannotations.api.a;
/* loaded from: classes4.dex */
public final class MYAccountDetialActivity_ extends MYAccountDetialActivity implements y3.a, a4.a, a4.b {
    private final a4.c J = new a4.c();
    private final Map<Class<?>, Object> K = new HashMap();

    /* loaded from: classes4.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MYAccountDetialActivity_.this.u0();
        }
    }

    /* loaded from: classes4.dex */
    public static class a0 extends org.androidannotations.api.builder.a<a0> {

        /* renamed from: a  reason: collision with root package name */
        private Fragment f34979a;

        public a0(Context context) {
            super(context, MYAccountDetialActivity_.class);
        }

        @Override // org.androidannotations.api.builder.a, org.androidannotations.api.builder.b
        public org.androidannotations.api.builder.f startForResult(int i4) {
            Fragment fragment = this.f34979a;
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

        public a0(Fragment fragment) {
            super(fragment.getActivity(), MYAccountDetialActivity_.class);
            this.f34979a = fragment;
        }
    }

    /* loaded from: classes4.dex */
    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MYAccountDetialActivity_.this.back_image();
        }
    }

    /* loaded from: classes4.dex */
    class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MYAccountDetialActivity_.this.l0();
        }
    }

    /* loaded from: classes4.dex */
    class d implements View.OnClickListener {
        d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MYAccountDetialActivity_.this.m0();
        }
    }

    /* loaded from: classes4.dex */
    class e implements View.OnClickListener {
        e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MYAccountDetialActivity_.this.j0();
        }
    }

    /* loaded from: classes4.dex */
    class f implements Runnable {
        f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MYAccountDetialActivity_.super.E0();
        }
    }

    /* loaded from: classes4.dex */
    class g implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f34985b;

        g(String str) {
            this.f34985b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            MYAccountDetialActivity_.super.error(this.f34985b);
        }
    }

    /* loaded from: classes4.dex */
    class h implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f34987b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f34988c;

        h(String str, String str2) {
            this.f34987b = str;
            this.f34988c = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            MYAccountDetialActivity_.super.t0(this.f34987b, this.f34988c);
        }
    }

    /* loaded from: classes4.dex */
    class i implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f34990b;

        i(String str) {
            this.f34990b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            MYAccountDetialActivity_.super.showToast(this.f34990b);
        }
    }

    /* loaded from: classes4.dex */
    class j implements Runnable {
        j() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MYAccountDetialActivity_.super.s0();
        }
    }

    /* loaded from: classes4.dex */
    class k implements View.OnClickListener {
        k() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MYAccountDetialActivity_.this.v0();
        }
    }

    /* loaded from: classes4.dex */
    class l implements Runnable {
        l() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MYAccountDetialActivity_.super.showLodingDismis();
        }
    }

    /* loaded from: classes4.dex */
    class m implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.wufan.user.service.protobuf.n0 f34995b;

        m(com.wufan.user.service.protobuf.n0 n0Var) {
            this.f34995b = n0Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            MYAccountDetialActivity_.super.p0(this.f34995b);
        }
    }

    /* loaded from: classes4.dex */
    class n implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f34997b;

        n(String str) {
            this.f34997b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            MYAccountDetialActivity_.super.showMessage(this.f34997b);
        }
    }

    /* loaded from: classes4.dex */
    class o extends a.c {
        o(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                MYAccountDetialActivity_.super.x0();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class p extends a.c {
        p(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                MYAccountDetialActivity_.super.F0();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class q extends a.c {
        q(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                MYAccountDetialActivity_.super.o0();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class r extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f35002b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f35003c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        r(String str, long j4, String str2, String str3, int i4) {
            super(str, j4, str2);
            this.f35002b = str3;
            this.f35003c = i4;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                MYAccountDetialActivity_.super.k0(this.f35002b, this.f35003c);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class s implements View.OnClickListener {
        s() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MYAccountDetialActivity_.this.i0();
        }
    }

    /* loaded from: classes4.dex */
    class t implements View.OnClickListener {
        t() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MYAccountDetialActivity_.this.z0();
        }
    }

    /* loaded from: classes4.dex */
    class u implements View.OnClickListener {
        u() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MYAccountDetialActivity_.this.G0();
        }
    }

    /* loaded from: classes4.dex */
    class v implements View.OnClickListener {
        v() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MYAccountDetialActivity_.this.y0();
        }
    }

    /* loaded from: classes4.dex */
    class w implements View.OnClickListener {
        w() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MYAccountDetialActivity_.this.A0();
        }
    }

    /* loaded from: classes4.dex */
    class x implements View.OnClickListener {
        x() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MYAccountDetialActivity_.this.B0();
        }
    }

    /* loaded from: classes4.dex */
    class y implements View.OnClickListener {
        y() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MYAccountDetialActivity_.this.w0();
        }
    }

    /* loaded from: classes4.dex */
    class z implements View.OnClickListener {
        z() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MYAccountDetialActivity_.this.D0();
        }
    }

    public static a0 T0(Context context) {
        return new a0(context);
    }

    public static a0 U0(Fragment fragment) {
        return new a0(fragment);
    }

    private void init_(Bundle bundle) {
        this.f34964r = new PrefDef_(this);
        a4.c.b(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MYAccountDetialActivity
    public void E0() {
        org.androidannotations.api.b.e("", new f(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MYAccountDetialActivity
    public void F0() {
        org.androidannotations.api.a.l(new p("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MYAccountDetialActivity
    public void error(String str) {
        org.androidannotations.api.b.e("", new g(str), 0L);
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.K.get(cls);
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        return (T) findViewById(i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MYAccountDetialActivity
    public void k0(String str, int i4) {
        org.androidannotations.api.a.l(new r("", 0L, "", str, i4));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MYAccountDetialActivity
    public void o0() {
        org.androidannotations.api.a.l(new q("", 0L, ""));
    }

    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.J);
        init_(bundle);
        super.onCreate(bundle);
        a4.c.c(c5);
        setContentView(R.layout.my_account_detial_layout);
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f34951e = (TextView) aVar.internalFindViewById(R.id.title_textview);
        this.f34952f = (TextView) aVar.internalFindViewById(R.id.levelTv);
        this.f34953g = (TextView) aVar.internalFindViewById(R.id.name);
        this.f34954h = (TextView) aVar.internalFindViewById(R.id.pabi);
        this.f34955i = (TextView) aVar.internalFindViewById(R.id.xingbie);
        this.f34956j = (TextView) aVar.internalFindViewById(R.id.expTv);
        this.f34957k = (SimpleDraweeView) aVar.internalFindViewById(R.id.iconImage);
        this.f34958l = (TextView) aVar.internalFindViewById(R.id.accountNameTv);
        this.f34959m = (TextView) aVar.internalFindViewById(R.id.phoneTv);
        this.f34960n = (TextView) aVar.internalFindViewById(R.id.passwordTv);
        this.f34961o = (TextView) aVar.internalFindViewById(R.id.hasBindWechat);
        this.f34962p = (TextView) aVar.internalFindViewById(R.id.hasBindWebo);
        this.f34963q = (TextView) aVar.internalFindViewById(R.id.hasBindQQ);
        this.f34966t = (TextView) aVar.internalFindViewById(R.id.tv_rank);
        View internalFindViewById = aVar.internalFindViewById(R.id.iconLayout);
        View internalFindViewById2 = aVar.internalFindViewById(R.id.accountNameLayout);
        View internalFindViewById3 = aVar.internalFindViewById(R.id.pabiLayout);
        View internalFindViewById4 = aVar.internalFindViewById(R.id.xingbieLayout);
        View internalFindViewById5 = aVar.internalFindViewById(R.id.nameLayout);
        View internalFindViewById6 = aVar.internalFindViewById(R.id.passwordLayout);
        View internalFindViewById7 = aVar.internalFindViewById(R.id.phoneLayout);
        View internalFindViewById8 = aVar.internalFindViewById(R.id.levelLayout);
        View internalFindViewById9 = aVar.internalFindViewById(R.id.unSubscribe);
        View internalFindViewById10 = aVar.internalFindViewById(R.id.exitLogin);
        View internalFindViewById11 = aVar.internalFindViewById(R.id.back_image);
        View internalFindViewById12 = aVar.internalFindViewById(R.id.bindWechartLayout);
        View internalFindViewById13 = aVar.internalFindViewById(R.id.bindWeiboLayout);
        View internalFindViewById14 = aVar.internalFindViewById(R.id.bindQQLayout);
        if (internalFindViewById != null) {
            internalFindViewById.setOnClickListener(new k());
        }
        if (internalFindViewById2 != null) {
            internalFindViewById2.setOnClickListener(new s());
        }
        if (internalFindViewById3 != null) {
            internalFindViewById3.setOnClickListener(new t());
        }
        if (internalFindViewById4 != null) {
            internalFindViewById4.setOnClickListener(new u());
        }
        if (internalFindViewById5 != null) {
            internalFindViewById5.setOnClickListener(new v());
        }
        if (internalFindViewById6 != null) {
            internalFindViewById6.setOnClickListener(new w());
        }
        if (internalFindViewById7 != null) {
            internalFindViewById7.setOnClickListener(new x());
        }
        if (internalFindViewById8 != null) {
            internalFindViewById8.setOnClickListener(new y());
        }
        if (internalFindViewById9 != null) {
            internalFindViewById9.setOnClickListener(new z());
        }
        if (internalFindViewById10 != null) {
            internalFindViewById10.setOnClickListener(new a());
        }
        if (internalFindViewById11 != null) {
            internalFindViewById11.setOnClickListener(new b());
        }
        if (internalFindViewById12 != null) {
            internalFindViewById12.setOnClickListener(new c());
        }
        if (internalFindViewById13 != null) {
            internalFindViewById13.setOnClickListener(new d());
        }
        if (internalFindViewById14 != null) {
            internalFindViewById14.setOnClickListener(new e());
        }
        afterview();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MYAccountDetialActivity
    public void p0(com.wufan.user.service.protobuf.n0 n0Var) {
        org.androidannotations.api.b.e("", new m(n0Var), 0L);
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.K.put(cls, t4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MYAccountDetialActivity
    public void s0() {
        org.androidannotations.api.b.e("", new j(), 0L);
    }

    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i4) {
        super.setContentView(i4);
        this.J.a(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MYAccountDetialActivity
    public void showLodingDismis() {
        org.androidannotations.api.b.e("", new l(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MYAccountDetialActivity
    public void showMessage(String str) {
        org.androidannotations.api.b.e("", new n(str), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MYAccountDetialActivity
    public void showToast(String str) {
        org.androidannotations.api.b.e("", new i(str), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MYAccountDetialActivity
    public void t0(String str, String str2) {
        org.androidannotations.api.b.e("", new h(str, str2), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MYAccountDetialActivity
    public void x0() {
        org.androidannotations.api.a.l(new o("", 0L, ""));
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        this.J.a(this);
    }

    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        super.setContentView(view);
        this.J.a(this);
    }
}
