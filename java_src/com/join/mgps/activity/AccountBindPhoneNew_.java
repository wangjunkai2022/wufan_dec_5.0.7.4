package com.join.mgps.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.Fragment;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.dto.AccountAnonymousReginRequest;
import com.join.mgps.dto.AccountRegisterThirdwaiRequestBean;
import java.util.HashMap;
import java.util.Map;
import org.androidannotations.api.a;
/* loaded from: classes4.dex */
public final class AccountBindPhoneNew_ extends AccountBindPhoneNew implements y3.a, a4.a, a4.b {
    public static final String G = "thirdRequestbean";
    public static final String H = "from";
    private final a4.c E = new a4.c();
    private final Map<Class<?>, Object> F = new HashMap();

    /* loaded from: classes4.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AccountBindPhoneNew_.super.t0();
        }
    }

    /* loaded from: classes4.dex */
    class b extends a.c {
        b(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                AccountBindPhoneNew_.super.s0();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class c extends a.c {
        c(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                AccountBindPhoneNew_.super.k0();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class d extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AccountAnonymousReginRequest f28192b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(String str, long j4, String str2, AccountAnonymousReginRequest accountAnonymousReginRequest) {
            super(str, j4, str2);
            this.f28192b = accountAnonymousReginRequest;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                AccountBindPhoneNew_.super.q0(this.f28192b);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class e extends a.c {
        e(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                AccountBindPhoneNew_.super.joinDevice();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class f extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AccountAnonymousReginRequest f28195b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(String str, long j4, String str2, AccountAnonymousReginRequest accountAnonymousReginRequest) {
            super(str, j4, str2);
            this.f28195b = accountAnonymousReginRequest;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                AccountBindPhoneNew_.super.r0(this.f28195b);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class g extends a.c {
        g(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                AccountBindPhoneNew_.super.phoneRegin();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class h extends a.c {
        h(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                AccountBindPhoneNew_.super.thirdRegin();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class i extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f28199b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(String str, long j4, String str2, String str3) {
            super(str, j4, str2);
            this.f28199b = str3;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                AccountBindPhoneNew_.super.n0(this.f28199b);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class j extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f28201b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(String str, long j4, String str2, String str3) {
            super(str, j4, str2);
            this.f28201b = str3;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                AccountBindPhoneNew_.super.o0(this.f28201b);
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
            AccountBindPhoneNew_.this.nextStep();
        }
    }

    /* loaded from: classes4.dex */
    class l implements View.OnClickListener {
        l() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            AccountBindPhoneNew_.this.l0();
        }
    }

    /* loaded from: classes4.dex */
    class m implements View.OnClickListener {
        m() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            AccountBindPhoneNew_.this.p0();
        }
    }

    /* loaded from: classes4.dex */
    class n implements View.OnClickListener {
        n() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            AccountBindPhoneNew_.this.userIcon();
        }
    }

    /* loaded from: classes4.dex */
    class o implements View.OnClickListener {
        o() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            AccountBindPhoneNew_.this.nickNameBution();
        }
    }

    /* loaded from: classes4.dex */
    class p implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f28208b;

        p(String str) {
            this.f28208b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            AccountBindPhoneNew_.super.error(this.f28208b);
        }
    }

    /* loaded from: classes4.dex */
    class q implements Runnable {
        q() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AccountBindPhoneNew_.super.m0();
        }
    }

    /* loaded from: classes4.dex */
    class r implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.wufan.user.service.protobuf.n0 f28211b;

        r(com.wufan.user.service.protobuf.n0 n0Var) {
            this.f28211b = n0Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            AccountBindPhoneNew_.super.showFinishPage(this.f28211b);
        }
    }

    /* loaded from: classes4.dex */
    class s implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AccountAnonymousReginRequest f28213b;

        s(AccountAnonymousReginRequest accountAnonymousReginRequest) {
            this.f28213b = accountAnonymousReginRequest;
        }

        @Override // java.lang.Runnable
        public void run() {
            AccountBindPhoneNew_.super.u0(this.f28213b);
        }
    }

    /* loaded from: classes4.dex */
    public static class t extends org.androidannotations.api.builder.a<t> {

        /* renamed from: a  reason: collision with root package name */
        private Fragment f28215a;

        public t(Context context) {
            super(context, AccountBindPhoneNew_.class);
        }

        public t a(int i4) {
            return (t) super.extra("from", i4);
        }

        public t b(AccountRegisterThirdwaiRequestBean accountRegisterThirdwaiRequestBean) {
            return (t) super.extra("thirdRequestbean", accountRegisterThirdwaiRequestBean);
        }

        @Override // org.androidannotations.api.builder.a, org.androidannotations.api.builder.b
        public org.androidannotations.api.builder.f startForResult(int i4) {
            Fragment fragment = this.f28215a;
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

        public t(Fragment fragment) {
            super(fragment.getActivity(), AccountBindPhoneNew_.class);
            this.f28215a = fragment;
        }
    }

    public static t J0(Context context) {
        return new t(context);
    }

    public static t K0(Fragment fragment) {
        return new t(fragment);
    }

    private void init_(Bundle bundle) {
        a4.c.b(this);
        injectExtras_();
    }

    private void injectExtras_() {
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            if (extras.containsKey("thirdRequestbean")) {
                this.f28160d = (AccountRegisterThirdwaiRequestBean) extras.getSerializable("thirdRequestbean");
            }
            if (extras.containsKey("from")) {
                this.f28161e = extras.getInt("from");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.AccountBindPhoneNew
    public void error(String str) {
        org.androidannotations.api.b.e("", new p(str), 0L);
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.F.get(cls);
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        return (T) findViewById(i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.AccountBindPhoneNew
    public void joinDevice() {
        org.androidannotations.api.a.l(new e("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.AccountBindPhoneNew
    public void k0() {
        org.androidannotations.api.a.l(new c("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.AccountBindPhoneNew
    public void m0() {
        org.androidannotations.api.b.e("", new q(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.AccountBindPhoneNew
    public void n0(String str) {
        org.androidannotations.api.a.l(new i("", 0L, "", str));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.AccountBindPhoneNew
    public void o0(String str) {
        org.androidannotations.api.a.l(new j("", 0L, "", str));
    }

    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.E);
        init_(bundle);
        super.onCreate(bundle);
        a4.c.c(c5);
        setContentView(R.layout.bind_phone_activity_new);
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f28162f = (TextView) aVar.internalFindViewById(R.id.codeTime);
        this.f28163g = (SimpleDraweeView) aVar.internalFindViewById(R.id.userIcon);
        this.f28164h = (TextView) aVar.internalFindViewById(R.id.hintPhone);
        this.f28165i = (TextView) aVar.internalFindViewById(R.id.phoneShow);
        this.f28166j = (EditText) aVar.internalFindViewById(R.id.phoneNumber);
        this.f28167k = (EditText) aVar.internalFindViewById(R.id.password);
        this.f28168l = (EditText) aVar.internalFindViewById(R.id.code);
        this.f28169m = (EditText) aVar.internalFindViewById(R.id.nickName);
        this.f28170n = (LinearLayout) aVar.internalFindViewById(R.id.setPassLayout);
        this.f28171o = (LinearLayout) aVar.internalFindViewById(R.id.editPhone);
        this.f28172p = (LinearLayout) aVar.internalFindViewById(R.id.changeNickNameLayout);
        this.f28173q = (TextView) aVar.internalFindViewById(R.id.nextStep);
        this.f28174r = (TextView) aVar.internalFindViewById(R.id.nextStep2);
        this.f28175s = (TextView) aVar.internalFindViewById(R.id.nickNameBution);
        TextView textView = this.f28173q;
        if (textView != null) {
            textView.setOnClickListener(new k());
        }
        TextView textView2 = this.f28162f;
        if (textView2 != null) {
            textView2.setOnClickListener(new l());
        }
        TextView textView3 = this.f28174r;
        if (textView3 != null) {
            textView3.setOnClickListener(new m());
        }
        SimpleDraweeView simpleDraweeView = this.f28163g;
        if (simpleDraweeView != null) {
            simpleDraweeView.setOnClickListener(new n());
        }
        TextView textView4 = this.f28175s;
        if (textView4 != null) {
            textView4.setOnClickListener(new o());
        }
        afterview();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.AccountBindPhoneNew
    public void phoneRegin() {
        org.androidannotations.api.a.l(new g("", 0L, ""));
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.F.put(cls, t4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.AccountBindPhoneNew
    public void q0(AccountAnonymousReginRequest accountAnonymousReginRequest) {
        org.androidannotations.api.a.l(new d("", 0L, "", accountAnonymousReginRequest));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.AccountBindPhoneNew
    public void r0(AccountAnonymousReginRequest accountAnonymousReginRequest) {
        org.androidannotations.api.a.l(new f("", 0L, "", accountAnonymousReginRequest));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.AccountBindPhoneNew
    public void s0() {
        org.androidannotations.api.a.l(new b("", 0L, ""));
    }

    @Override // com.join.mgps.activity.BaseAccountActivity, com.BaseActivity, com.BaseFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i4) {
        super.setContentView(i4);
        this.E.a(this);
    }

    @Override // android.app.Activity
    public void setIntent(Intent intent) {
        super.setIntent(intent);
        injectExtras_();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.AccountBindPhoneNew
    public void showFinishPage(com.wufan.user.service.protobuf.n0 n0Var) {
        org.androidannotations.api.b.e("", new r(n0Var), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.AccountBindPhoneNew
    public void t0() {
        org.androidannotations.api.b.e("", new a(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.AccountBindPhoneNew
    public void thirdRegin() {
        org.androidannotations.api.a.l(new h("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.AccountBindPhoneNew
    public void u0(AccountAnonymousReginRequest accountAnonymousReginRequest) {
        org.androidannotations.api.b.e("", new s(accountAnonymousReginRequest), 0L);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        this.E.a(this);
    }

    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        super.setContentView(view);
        this.E.a(this);
    }
}
