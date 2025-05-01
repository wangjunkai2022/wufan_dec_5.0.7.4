package com.join.mgps.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.Fragment;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.dto.AccountBean;
import com.join.mgps.dto.AccountReginBean;
import com.join.mgps.dto.RewardBean;
import java.util.HashMap;
import java.util.Map;
import org.androidannotations.api.a;
/* loaded from: classes4.dex */
public final class MyAccountMMSCodeReginFinish_ extends MyAccountMMSCodeReginFinish implements y3.a, a4.a, a4.b {

    /* renamed from: t  reason: collision with root package name */
    public static final String f35597t = "accountReginBean";

    /* renamed from: r  reason: collision with root package name */
    private final a4.c f35598r = new a4.c();

    /* renamed from: s  reason: collision with root package name */
    private final Map<Class<?>, Object> f35599s = new HashMap();

    /* loaded from: classes4.dex */
    class a extends a.c {
        a(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                MyAccountMMSCodeReginFinish_.super.m0();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class b extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AccountReginBean f35601b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, long j4, String str2, AccountReginBean accountReginBean) {
            super(str, j4, str2);
            this.f35601b = accountReginBean;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                MyAccountMMSCodeReginFinish_.super.i0(this.f35601b);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class c extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f35603b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, long j4, String str2, String str3) {
            super(str, j4, str2);
            this.f35603b = str3;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                MyAccountMMSCodeReginFinish_.super.j0(this.f35603b);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class d implements View.OnClickListener {
        d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MyAccountMMSCodeReginFinish_.this.g0();
        }
    }

    /* loaded from: classes4.dex */
    class e implements View.OnClickListener {
        e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MyAccountMMSCodeReginFinish_.this.n0();
        }
    }

    /* loaded from: classes4.dex */
    class f implements View.OnClickListener {
        f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MyAccountMMSCodeReginFinish_.this.l0();
        }
    }

    /* loaded from: classes4.dex */
    class g implements Runnable {
        g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MyAccountMMSCodeReginFinish_.super.showLoding();
        }
    }

    /* loaded from: classes4.dex */
    class h implements Runnable {
        h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MyAccountMMSCodeReginFinish_.super.showLodingDismis();
        }
    }

    /* loaded from: classes4.dex */
    class i implements Runnable {
        i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MyAccountMMSCodeReginFinish_.super.h0();
        }
    }

    /* loaded from: classes4.dex */
    class j implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f35611b;

        j(String str) {
            this.f35611b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            MyAccountMMSCodeReginFinish_.super.error(this.f35611b);
        }
    }

    /* loaded from: classes4.dex */
    class k implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AccountBean f35613b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ RewardBean f35614c;

        k(AccountBean accountBean, RewardBean rewardBean) {
            this.f35613b = accountBean;
            this.f35614c = rewardBean;
        }

        @Override // java.lang.Runnable
        public void run() {
            MyAccountMMSCodeReginFinish_.super.k0(this.f35613b, this.f35614c);
        }
    }

    /* loaded from: classes4.dex */
    class l implements Runnable {
        l() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MyAccountMMSCodeReginFinish_.super.o0();
        }
    }

    /* loaded from: classes4.dex */
    public static class m extends org.androidannotations.api.builder.a<m> {

        /* renamed from: a  reason: collision with root package name */
        private Fragment f35617a;

        public m(Context context) {
            super(context, MyAccountMMSCodeReginFinish_.class);
        }

        public m a(AccountReginBean accountReginBean) {
            return (m) super.extra(MyAccountMMSCodeReginFinish_.f35597t, accountReginBean);
        }

        @Override // org.androidannotations.api.builder.a, org.androidannotations.api.builder.b
        public org.androidannotations.api.builder.f startForResult(int i4) {
            Fragment fragment = this.f35617a;
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

        public m(Fragment fragment) {
            super(fragment.getActivity(), MyAccountMMSCodeReginFinish_.class);
            this.f35617a = fragment;
        }
    }

    public static m A0(Fragment fragment) {
        return new m(fragment);
    }

    private void init_(Bundle bundle) {
        a4.c.b(this);
        injectExtras_();
    }

    private void injectExtras_() {
        Bundle extras = getIntent().getExtras();
        if (extras == null || !extras.containsKey(f35597t)) {
            return;
        }
        this.f35585n = (AccountReginBean) extras.getSerializable(f35597t);
    }

    public static m z0(Context context) {
        return new m(context);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MyAccountMMSCodeReginFinish
    public void error(String str) {
        org.androidannotations.api.b.e("", new j(str), 0L);
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.f35599s.get(cls);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MyAccountMMSCodeReginFinish
    public void h0() {
        org.androidannotations.api.b.e("", new i(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MyAccountMMSCodeReginFinish
    public void i0(AccountReginBean accountReginBean) {
        org.androidannotations.api.a.l(new b("", 0L, "", accountReginBean));
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        return (T) findViewById(i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MyAccountMMSCodeReginFinish
    public void j0(String str) {
        org.androidannotations.api.a.l(new c("", 0L, "", str));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MyAccountMMSCodeReginFinish
    public void k0(AccountBean accountBean, RewardBean rewardBean) {
        org.androidannotations.api.b.e("", new k(accountBean, rewardBean), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MyAccountMMSCodeReginFinish
    public void m0() {
        org.androidannotations.api.a.l(new a("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MyAccountMMSCodeReginFinish
    public void o0() {
        org.androidannotations.api.b.e("", new l(), 0L);
    }

    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.f35598r);
        init_(bundle);
        super.onCreate(bundle);
        a4.c.c(c5);
        setContentView(R.layout.my_account_regin_sendmmscode_layout);
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f35576e = (EditText) aVar.internalFindViewById(R.id.mmsCode);
        this.f35577f = (TextView) aVar.internalFindViewById(R.id.resendCode);
        this.f35578g = (TextView) aVar.internalFindViewById(R.id.phoneNumber);
        this.f35579h = (TextView) aVar.internalFindViewById(R.id.titleText);
        this.f35581j = (Button) aVar.internalFindViewById(R.id.sendCode);
        View internalFindViewById = aVar.internalFindViewById(R.id.backImage);
        if (internalFindViewById != null) {
            internalFindViewById.setOnClickListener(new d());
        }
        Button button = this.f35581j;
        if (button != null) {
            button.setOnClickListener(new e());
        }
        TextView textView = this.f35577f;
        if (textView != null) {
            textView.setOnClickListener(new f());
        }
        afterview();
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.f35599s.put(cls, t4);
    }

    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i4) {
        super.setContentView(i4);
        this.f35598r.a(this);
    }

    @Override // android.app.Activity
    public void setIntent(Intent intent) {
        super.setIntent(intent);
        injectExtras_();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MyAccountMMSCodeReginFinish
    public void showLoding() {
        org.androidannotations.api.b.e("", new g(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MyAccountMMSCodeReginFinish
    public void showLodingDismis() {
        org.androidannotations.api.b.e("", new h(), 0L);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        this.f35598r.a(this);
    }

    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        super.setContentView(view);
        this.f35598r.a(this);
    }
}
