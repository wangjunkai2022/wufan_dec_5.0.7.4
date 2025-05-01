package com.join.mgps.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.Fragment;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.dto.AccountRegisterThirdwaiRequestBean;
import com.join.mgps.dto.RewardBean;
import com.join.mgps.pref.PrefDef_;
import java.util.HashMap;
import java.util.Map;
import org.androidannotations.api.a;
/* loaded from: classes4.dex */
public final class MyAccountLoginActivity_ extends MyAccountLoginActivity implements y3.a, a4.a, a4.b {
    public static final String K = "intentFrom";
    public static final String L = "fromIndex";
    private final a4.c I = new a4.c();
    private final Map<Class<?>, Object> J = new HashMap();

    /* loaded from: classes4.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MyAccountLoginActivity_.this.xieyi();
        }
    }

    /* loaded from: classes4.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MyAccountLoginActivity_.super.showLoding();
        }
    }

    /* loaded from: classes4.dex */
    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MyAccountLoginActivity_.super.showLodingDismis();
        }
    }

    /* loaded from: classes4.dex */
    class d implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f35501b;

        d(String str) {
            this.f35501b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            MyAccountLoginActivity_.super.error(this.f35501b);
        }
    }

    /* loaded from: classes4.dex */
    class e implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.wufan.user.service.protobuf.n0 f35503b;

        e(com.wufan.user.service.protobuf.n0 n0Var) {
            this.f35503b = n0Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            MyAccountLoginActivity_.super.loginSuccess(this.f35503b);
        }
    }

    /* loaded from: classes4.dex */
    class f implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f35505b;

        f(String str) {
            this.f35505b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            MyAccountLoginActivity_.super.showToast(this.f35505b);
        }
    }

    /* loaded from: classes4.dex */
    class g implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AccountRegisterThirdwaiRequestBean f35507b;

        g(AccountRegisterThirdwaiRequestBean accountRegisterThirdwaiRequestBean) {
            this.f35507b = accountRegisterThirdwaiRequestBean;
        }

        @Override // java.lang.Runnable
        public void run() {
            MyAccountLoginActivity_.super.goRegin(this.f35507b);
        }
    }

    /* loaded from: classes4.dex */
    class h implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f35509b;

        h(String str) {
            this.f35509b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            MyAccountLoginActivity_.super.showMessage(this.f35509b);
        }
    }

    /* loaded from: classes4.dex */
    class i implements Runnable {
        i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MyAccountLoginActivity_.super.t0();
        }
    }

    /* loaded from: classes4.dex */
    class j implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.wufan.user.service.protobuf.n0 f35512b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ RewardBean f35513c;

        j(com.wufan.user.service.protobuf.n0 n0Var, RewardBean rewardBean) {
            this.f35512b = n0Var;
            this.f35513c = rewardBean;
        }

        @Override // java.lang.Runnable
        public void run() {
            MyAccountLoginActivity_.super.loginSuccess(this.f35512b, this.f35513c);
        }
    }

    /* loaded from: classes4.dex */
    class k implements View.OnClickListener {
        k() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MyAccountLoginActivity_.this.u0();
        }
    }

    /* loaded from: classes4.dex */
    class l extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f35516b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f35517c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(String str, long j4, String str2, String str3, String str4) {
            super(str, j4, str2);
            this.f35516b = str3;
            this.f35517c = str4;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                MyAccountLoginActivity_.super.getLogin(this.f35516b, this.f35517c);
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
                MyAccountLoginActivity_.super.joinDevice();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class n extends a.c {
        n(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                MyAccountLoginActivity_.super.v0();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class o extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f35521b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f35522c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f35523d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f35524e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String f35525f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(String str, long j4, String str2, int i4, String str3, String str4, int i5, String str5) {
            super(str, j4, str2);
            this.f35521b = i4;
            this.f35522c = str3;
            this.f35523d = str4;
            this.f35524e = i5;
            this.f35525f = str5;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                MyAccountLoginActivity_.super.login(this.f35521b, this.f35522c, this.f35523d, this.f35524e, this.f35525f);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class p implements View.OnClickListener {
        p() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MyAccountLoginActivity_.this.s0();
        }
    }

    /* loaded from: classes4.dex */
    class q implements View.OnClickListener {
        q() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MyAccountLoginActivity_.this.n0();
        }
    }

    /* loaded from: classes4.dex */
    class r implements View.OnClickListener {
        r() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MyAccountLoginActivity_.this.p0();
        }
    }

    /* loaded from: classes4.dex */
    class s implements View.OnClickListener {
        s() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MyAccountLoginActivity_.this.q0();
        }
    }

    /* loaded from: classes4.dex */
    class t implements View.OnClickListener {
        t() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MyAccountLoginActivity_.this.r0();
        }
    }

    /* loaded from: classes4.dex */
    class u implements View.OnClickListener {
        u() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MyAccountLoginActivity_.this.o0();
        }
    }

    /* loaded from: classes4.dex */
    class v implements View.OnClickListener {
        v() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MyAccountLoginActivity_.this.back_image();
        }
    }

    /* loaded from: classes4.dex */
    class w implements View.OnClickListener {
        w() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MyAccountLoginActivity_.this.shengming();
        }
    }

    /* loaded from: classes4.dex */
    public static class x extends org.androidannotations.api.builder.a<x> {

        /* renamed from: a  reason: collision with root package name */
        private Fragment f35535a;

        public x(Context context) {
            super(context, MyAccountLoginActivity_.class);
        }

        public x a(int i4) {
            return (x) super.extra(MyAccountLoginActivity_.L, i4);
        }

        public x b(int i4) {
            return (x) super.extra("intentFrom", i4);
        }

        @Override // org.androidannotations.api.builder.a, org.androidannotations.api.builder.b
        public org.androidannotations.api.builder.f startForResult(int i4) {
            Fragment fragment = this.f35535a;
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

        public x(Fragment fragment) {
            super(fragment.getActivity(), MyAccountLoginActivity_.class);
            this.f35535a = fragment;
        }
    }

    public static x J0(Context context) {
        return new x(context);
    }

    public static x K0(Fragment fragment) {
        return new x(fragment);
    }

    private void init_(Bundle bundle) {
        Resources resources = getResources();
        this.f35489y = new PrefDef_(this);
        a4.c.b(this);
        this.f35471g = resources.getString(R.string.net_excption);
        this.f35472h = resources.getString(R.string.connect_server_excption);
        injectExtras_();
    }

    private void injectExtras_() {
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            if (extras.containsKey("intentFrom")) {
                this.f35483s = extras.getInt("intentFrom");
            }
            if (extras.containsKey(L)) {
                this.f35488x = extras.getInt(L);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MyAccountLoginActivity
    public void error(String str) {
        org.androidannotations.api.b.e("", new d(str), 0L);
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.J.get(cls);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MyAccountLoginActivity
    public void getLogin(String str, String str2) {
        org.androidannotations.api.a.l(new l("", 0L, "", str, str2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MyAccountLoginActivity
    public void goRegin(AccountRegisterThirdwaiRequestBean accountRegisterThirdwaiRequestBean) {
        org.androidannotations.api.b.e("", new g(accountRegisterThirdwaiRequestBean), 0L);
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        return (T) findViewById(i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MyAccountLoginActivity
    public void joinDevice() {
        org.androidannotations.api.a.l(new m("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MyAccountLoginActivity
    public void login(int i4, String str, String str2, int i5, String str3) {
        org.androidannotations.api.a.l(new o("", 0L, "", i4, str, str2, i5, str3));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MyAccountLoginActivity
    public void loginSuccess(com.wufan.user.service.protobuf.n0 n0Var) {
        org.androidannotations.api.b.e("", new e(n0Var), 0L);
    }

    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.I);
        init_(bundle);
        super.onCreate(bundle);
        a4.c.c(c5);
        setContentView(R.layout.my_account_login_layout);
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f35473i = (EditText) aVar.internalFindViewById(R.id.username);
        this.f35474j = (TextView) aVar.internalFindViewById(R.id.passwordTitle);
        this.f35475k = (TextView) aVar.internalFindViewById(R.id.userNameTitle);
        this.f35476l = (EditText) aVar.internalFindViewById(R.id.password);
        this.f35477m = (CheckBox) aVar.internalFindViewById(R.id.checkBox);
        this.f35478n = (TextView) aVar.internalFindViewById(R.id.loginbutn);
        this.f35479o = (TextView) aVar.internalFindViewById(R.id.xieyi);
        View internalFindViewById = aVar.internalFindViewById(R.id.signUp);
        View internalFindViewById2 = aVar.internalFindViewById(R.id.fergetbutn);
        View internalFindViewById3 = aVar.internalFindViewById(R.id.loginQQ);
        View internalFindViewById4 = aVar.internalFindViewById(R.id.loginWechat);
        View internalFindViewById5 = aVar.internalFindViewById(R.id.loginWeibo);
        View internalFindViewById6 = aVar.internalFindViewById(R.id.login);
        View internalFindViewById7 = aVar.internalFindViewById(R.id.back_image);
        View internalFindViewById8 = aVar.internalFindViewById(R.id.shengming);
        if (internalFindViewById != null) {
            internalFindViewById.setOnClickListener(new k());
        }
        TextView textView = this.f35478n;
        if (textView != null) {
            textView.setOnClickListener(new p());
        }
        if (internalFindViewById2 != null) {
            internalFindViewById2.setOnClickListener(new q());
        }
        if (internalFindViewById3 != null) {
            internalFindViewById3.setOnClickListener(new r());
        }
        if (internalFindViewById4 != null) {
            internalFindViewById4.setOnClickListener(new s());
        }
        if (internalFindViewById5 != null) {
            internalFindViewById5.setOnClickListener(new t());
        }
        if (internalFindViewById6 != null) {
            internalFindViewById6.setOnClickListener(new u());
        }
        if (internalFindViewById7 != null) {
            internalFindViewById7.setOnClickListener(new v());
        }
        if (internalFindViewById8 != null) {
            internalFindViewById8.setOnClickListener(new w());
        }
        TextView textView2 = this.f35479o;
        if (textView2 != null) {
            textView2.setOnClickListener(new a());
        }
        afterView();
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.J.put(cls, t4);
    }

    @Override // com.join.mgps.activity.BaseAccountActivity, com.BaseActivity, com.BaseFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i4) {
        super.setContentView(i4);
        this.I.a(this);
    }

    @Override // android.app.Activity
    public void setIntent(Intent intent) {
        super.setIntent(intent);
        injectExtras_();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MyAccountLoginActivity
    public void showLoding() {
        org.androidannotations.api.b.e("", new b(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MyAccountLoginActivity
    public void showLodingDismis() {
        org.androidannotations.api.b.e("", new c(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MyAccountLoginActivity
    public void showMessage(String str) {
        org.androidannotations.api.b.e("", new h(str), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MyAccountLoginActivity
    public void showToast(String str) {
        org.androidannotations.api.b.e("", new f(str), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MyAccountLoginActivity
    public void t0() {
        org.androidannotations.api.b.e("", new i(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MyAccountLoginActivity
    public void v0() {
        org.androidannotations.api.a.l(new n("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MyAccountLoginActivity
    public void loginSuccess(com.wufan.user.service.protobuf.n0 n0Var, RewardBean rewardBean) {
        org.androidannotations.api.b.e("", new j(n0Var, rewardBean), 0L);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        this.I.a(this);
    }

    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        super.setContentView(view);
        this.I.a(this);
    }
}
