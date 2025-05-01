package com.join.mgps.activity;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.Fragment;
import com.join.android.app.mgsim.wufun.R;
import java.util.HashMap;
import java.util.Map;
import org.androidannotations.api.a;
/* loaded from: classes4.dex */
public final class MyAccountMMSCodeGetpassbackFinish_ extends MyAccountMMSCodeGetpassbackFinish implements y3.a, a4.a, a4.b {

    /* renamed from: r  reason: collision with root package name */
    private final a4.c f35559r = new a4.c();

    /* renamed from: s  reason: collision with root package name */
    private final Map<Class<?>, Object> f35560s = new HashMap();

    /* loaded from: classes4.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MyAccountMMSCodeGetpassbackFinish_.this.n0();
        }
    }

    /* loaded from: classes4.dex */
    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MyAccountMMSCodeGetpassbackFinish_.this.l0();
        }
    }

    /* loaded from: classes4.dex */
    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MyAccountMMSCodeGetpassbackFinish_.super.showLoding();
        }
    }

    /* loaded from: classes4.dex */
    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MyAccountMMSCodeGetpassbackFinish_.super.showLodingDismis();
        }
    }

    /* loaded from: classes4.dex */
    class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MyAccountMMSCodeGetpassbackFinish_.super.o0();
        }
    }

    /* loaded from: classes4.dex */
    class f implements Runnable {
        f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MyAccountMMSCodeGetpassbackFinish_.super.j0();
        }
    }

    /* loaded from: classes4.dex */
    class g implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f35567b;

        g(String str) {
            this.f35567b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            MyAccountMMSCodeGetpassbackFinish_.super.error(this.f35567b);
        }
    }

    /* loaded from: classes4.dex */
    class h extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f35569b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(String str, long j4, String str2, String str3) {
            super(str, j4, str2);
            this.f35569b = str3;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                MyAccountMMSCodeGetpassbackFinish_.super.k0(this.f35569b);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class i extends a.c {
        i(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                MyAccountMMSCodeGetpassbackFinish_.super.m0();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    public static class j extends org.androidannotations.api.builder.a<j> {

        /* renamed from: a  reason: collision with root package name */
        private Fragment f35572a;

        public j(Context context) {
            super(context, MyAccountMMSCodeGetpassbackFinish_.class);
        }

        @Override // org.androidannotations.api.builder.a, org.androidannotations.api.builder.b
        public org.androidannotations.api.builder.f startForResult(int i4) {
            Fragment fragment = this.f35572a;
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

        public j(Fragment fragment) {
            super(fragment.getActivity(), MyAccountMMSCodeGetpassbackFinish_.class);
            this.f35572a = fragment;
        }
    }

    private void init_(Bundle bundle) {
        a4.c.b(this);
    }

    public static j x0(Context context) {
        return new j(context);
    }

    public static j y0(Fragment fragment) {
        return new j(fragment);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MyAccountMMSCodeGetpassbackFinish
    public void error(String str) {
        org.androidannotations.api.b.e("", new g(str), 0L);
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.f35560s.get(cls);
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        return (T) findViewById(i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MyAccountMMSCodeGetpassbackFinish
    public void j0() {
        org.androidannotations.api.b.e("", new f(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MyAccountMMSCodeGetpassbackFinish
    public void k0(String str) {
        org.androidannotations.api.a.l(new h("", 0L, "", str));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MyAccountMMSCodeGetpassbackFinish
    public void m0() {
        org.androidannotations.api.a.l(new i("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MyAccountMMSCodeGetpassbackFinish
    public void o0() {
        org.androidannotations.api.b.e("", new e(), 0L);
    }

    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.f35559r);
        init_(bundle);
        super.onCreate(bundle);
        a4.c.c(c5);
        setContentView(R.layout.my_account_regin_sendmmscode_layout);
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f35539g = (EditText) aVar.internalFindViewById(R.id.mmsCode);
        this.f35540h = (TextView) aVar.internalFindViewById(R.id.phoneNumber);
        this.f35542j = (TextView) aVar.internalFindViewById(R.id.resendCode);
        Button button = (Button) aVar.internalFindViewById(R.id.sendCode);
        this.f35543k = button;
        if (button != null) {
            button.setOnClickListener(new a());
        }
        TextView textView = this.f35542j;
        if (textView != null) {
            textView.setOnClickListener(new b());
        }
        afterview();
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.f35560s.put(cls, t4);
    }

    @Override // com.join.mgps.activity.BaseAccountActivity, com.BaseActivity, com.BaseFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i4) {
        super.setContentView(i4);
        this.f35559r.a(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MyAccountMMSCodeGetpassbackFinish
    public void showLoding() {
        org.androidannotations.api.b.e("", new c(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MyAccountMMSCodeGetpassbackFinish
    public void showLodingDismis() {
        org.androidannotations.api.b.e("", new d(), 0L);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        this.f35559r.a(this);
    }

    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        super.setContentView(view);
        this.f35559r.a(this);
    }
}
