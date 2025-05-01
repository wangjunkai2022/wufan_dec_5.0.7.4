package com.join.mgps.activity;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.Fragment;
import com.join.android.app.mgsim.wufun.R;
import java.util.HashMap;
import java.util.Map;
import org.androidannotations.api.a;
/* loaded from: classes4.dex */
public final class AccountUpgradeActivity_ extends AccountUpgradeActivity implements y3.a, a4.a, a4.b {

    /* renamed from: m  reason: collision with root package name */
    private final a4.c f28349m = new a4.c();

    /* renamed from: n  reason: collision with root package name */
    private final Map<Class<?>, Object> f28350n = new HashMap();

    /* loaded from: classes4.dex */
    class a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f28351b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f28352c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f28353d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f28354e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f28355f;

        a(String str, String str2, String str3, String str4, int i4) {
            this.f28351b = str;
            this.f28352c = str2;
            this.f28353d = str3;
            this.f28354e = str4;
            this.f28355f = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            AccountUpgradeActivity_.super.r0(this.f28351b, this.f28352c, this.f28353d, this.f28354e, this.f28355f);
        }
    }

    /* loaded from: classes4.dex */
    class b extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f28357b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f28358c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f28359d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f28360e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f28361f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, long j4, String str2, String str3, String str4, String str5, String str6, int i4) {
            super(str, j4, str2);
            this.f28357b = str3;
            this.f28358c = str4;
            this.f28359d = str5;
            this.f28360e = str6;
            this.f28361f = i4;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                AccountUpgradeActivity_.super.t0(this.f28357b, this.f28358c, this.f28359d, this.f28360e, this.f28361f);
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
                AccountUpgradeActivity_.super.touristLogin();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class d extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f28364b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(String str, long j4, String str2, String str3) {
            super(str, j4, str2);
            this.f28364b = str3;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                AccountUpgradeActivity_.super.j0(this.f28364b);
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
            AccountUpgradeActivity_.this.back_image();
        }
    }

    /* loaded from: classes4.dex */
    class f implements View.OnClickListener {
        f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            AccountUpgradeActivity_.this.h0();
        }
    }

    /* loaded from: classes4.dex */
    class g implements View.OnClickListener {
        g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            AccountUpgradeActivity_.this.s0();
        }
    }

    /* loaded from: classes4.dex */
    class h implements View.OnClickListener {
        h() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            AccountUpgradeActivity_.this.k0();
        }
    }

    /* loaded from: classes4.dex */
    class i implements Runnable {
        i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AccountUpgradeActivity_.super.o0();
        }
    }

    /* loaded from: classes4.dex */
    class j implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f28371b;

        j(String str) {
            this.f28371b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            AccountUpgradeActivity_.super.error(this.f28371b);
        }
    }

    /* loaded from: classes4.dex */
    class k implements Runnable {
        k() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AccountUpgradeActivity_.super.n0();
        }
    }

    /* loaded from: classes4.dex */
    class l implements Runnable {
        l() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AccountUpgradeActivity_.super.m0();
        }
    }

    /* loaded from: classes4.dex */
    class m implements Runnable {
        m() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AccountUpgradeActivity_.super.q0();
        }
    }

    /* loaded from: classes4.dex */
    public static class n extends org.androidannotations.api.builder.a<n> {

        /* renamed from: a  reason: collision with root package name */
        private Fragment f28376a;

        public n(Context context) {
            super(context, AccountUpgradeActivity_.class);
        }

        @Override // org.androidannotations.api.builder.a, org.androidannotations.api.builder.b
        public org.androidannotations.api.builder.f startForResult(int i4) {
            Fragment fragment = this.f28376a;
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

        public n(Fragment fragment) {
            super(fragment.getActivity(), AccountUpgradeActivity_.class);
            this.f28376a = fragment;
        }
    }

    public static n D0(Context context) {
        return new n(context);
    }

    public static n E0(Fragment fragment) {
        return new n(fragment);
    }

    private void init_(Bundle bundle) {
        a4.c.b(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.AccountUpgradeActivity
    public void error(String str) {
        org.androidannotations.api.b.e("", new j(str), 0L);
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.f28350n.get(cls);
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        return (T) findViewById(i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.AccountUpgradeActivity
    public void j0(String str) {
        org.androidannotations.api.a.l(new d("", 0L, "", str));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.AccountUpgradeActivity
    public void m0() {
        org.androidannotations.api.b.e("", new l(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.AccountUpgradeActivity
    public void n0() {
        org.androidannotations.api.b.e("", new k(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.AccountUpgradeActivity
    public void o0() {
        org.androidannotations.api.b.e("", new i(), 0L);
    }

    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.f28349m);
        init_(bundle);
        super.onCreate(bundle);
        a4.c.c(c5);
        setContentView(R.layout.mg_account_upgrade);
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f28330b = (TextView) aVar.internalFindViewById(R.id.layout_title);
        this.f28331c = (EditText) aVar.internalFindViewById(R.id.nickname);
        this.f28332d = (EditText) aVar.internalFindViewById(R.id.password);
        this.f28333e = (EditText) aVar.internalFindViewById(R.id.phone);
        this.f28334f = (EditText) aVar.internalFindViewById(R.id.validateCode);
        this.f28335g = (Button) aVar.internalFindViewById(R.id.getValidateCode);
        this.f28336h = (Button) aVar.internalFindViewById(R.id.submit);
        this.f28337i = (LinearLayout) aVar.internalFindViewById(R.id.alternative);
        View internalFindViewById = aVar.internalFindViewById(R.id.back_image);
        if (internalFindViewById != null) {
            internalFindViewById.setOnClickListener(new e());
        }
        LinearLayout linearLayout = this.f28337i;
        if (linearLayout != null) {
            linearLayout.setOnClickListener(new f());
        }
        Button button = this.f28336h;
        if (button != null) {
            button.setOnClickListener(new g());
        }
        Button button2 = this.f28335g;
        if (button2 != null) {
            button2.setOnClickListener(new h());
        }
        afterViews();
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.f28350n.put(cls, t4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.AccountUpgradeActivity
    public void q0() {
        org.androidannotations.api.b.e("", new m(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.AccountUpgradeActivity
    public void r0(String str, String str2, String str3, String str4, int i4) {
        org.androidannotations.api.b.e("", new a(str, str2, str3, str4, i4), 0L);
    }

    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i4) {
        super.setContentView(i4);
        this.f28349m.a(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.AccountUpgradeActivity
    public void t0(String str, String str2, String str3, String str4, int i4) {
        org.androidannotations.api.a.l(new b("", 0L, "", str, str2, str3, str4, i4));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.AccountUpgradeActivity
    public void touristLogin() {
        org.androidannotations.api.a.l(new c("", 0L, ""));
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        this.f28349m.a(this);
    }

    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        super.setContentView(view);
        this.f28349m.a(this);
    }
}
