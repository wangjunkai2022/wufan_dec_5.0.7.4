package com.join.mgps.activity;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
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
public final class MyAccountBindPhoneActivity_ extends MyAccountBindPhoneActivity implements y3.a, a4.a, a4.b {

    /* renamed from: s  reason: collision with root package name */
    private final a4.c f35352s = new a4.c();

    /* renamed from: t  reason: collision with root package name */
    private final Map<Class<?>, Object> f35353t = new HashMap();

    /* loaded from: classes4.dex */
    class a extends a.c {
        a(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                MyAccountBindPhoneActivity_.super.j0();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
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
                MyAccountBindPhoneActivity_.super.i0();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MyAccountBindPhoneActivity_.this.l0();
        }
    }

    /* loaded from: classes4.dex */
    class d implements View.OnClickListener {
        d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MyAccountBindPhoneActivity_.this.n0();
        }
    }

    /* loaded from: classes4.dex */
    class e implements View.OnClickListener {
        e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MyAccountBindPhoneActivity_.this.h0();
        }
    }

    /* loaded from: classes4.dex */
    class f implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f35359b;

        f(String str) {
            this.f35359b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            MyAccountBindPhoneActivity_.super.o0(this.f35359b);
        }
    }

    /* loaded from: classes4.dex */
    class g implements Runnable {
        g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MyAccountBindPhoneActivity_.super.k0();
        }
    }

    /* loaded from: classes4.dex */
    class h implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f35362b;

        h(String str) {
            this.f35362b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            MyAccountBindPhoneActivity_.super.showToast(this.f35362b);
        }
    }

    /* loaded from: classes4.dex */
    class i implements Runnable {
        i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MyAccountBindPhoneActivity_.super.showLoding();
        }
    }

    /* loaded from: classes4.dex */
    class j implements Runnable {
        j() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MyAccountBindPhoneActivity_.super.showLodingDismis();
        }
    }

    /* loaded from: classes4.dex */
    class k extends a.c {
        k(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                MyAccountBindPhoneActivity_.super.m0();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    public static class l extends org.androidannotations.api.builder.a<l> {

        /* renamed from: a  reason: collision with root package name */
        private Fragment f35367a;

        public l(Context context) {
            super(context, MyAccountBindPhoneActivity_.class);
        }

        @Override // org.androidannotations.api.builder.a, org.androidannotations.api.builder.b
        public org.androidannotations.api.builder.f startForResult(int i4) {
            Fragment fragment = this.f35367a;
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

        public l(Fragment fragment) {
            super(fragment.getActivity(), MyAccountBindPhoneActivity_.class);
            this.f35367a = fragment;
        }
    }

    private void init_(Bundle bundle) {
        Resources resources = getResources();
        a4.c.b(this);
        this.f35332b = resources.getString(R.string.net_excption);
    }

    public static l x0(Context context) {
        return new l(context);
    }

    public static l y0(Fragment fragment) {
        return new l(fragment);
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.f35353t.get(cls);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MyAccountBindPhoneActivity
    public void i0() {
        org.androidannotations.api.a.l(new b("", 0L, ""));
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        return (T) findViewById(i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MyAccountBindPhoneActivity
    public void j0() {
        org.androidannotations.api.a.l(new a("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MyAccountBindPhoneActivity
    public void k0() {
        org.androidannotations.api.b.e("", new g(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MyAccountBindPhoneActivity
    public void m0() {
        org.androidannotations.api.a.l(new k("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MyAccountBindPhoneActivity
    public void o0(String str) {
        org.androidannotations.api.b.e("", new f(str), 0L);
    }

    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.f35352s);
        init_(bundle);
        super.onCreate(bundle);
        a4.c.c(c5);
        setContentView(R.layout.bind_phone_activity);
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f35333c = (TextView) aVar.internalFindViewById(R.id.titleText);
        this.f35334d = (TextView) aVar.internalFindViewById(R.id.myAccountTv);
        this.f35335e = (TextView) aVar.internalFindViewById(R.id.securityLevel);
        this.f35336f = (TextView) aVar.internalFindViewById(R.id.securitySuggest);
        this.f35337g = (EditText) aVar.internalFindViewById(R.id.inputPhone);
        this.f35338h = (EditText) aVar.internalFindViewById(R.id.inputCode);
        this.f35339i = (TextView) aVar.internalFindViewById(R.id.getCodeTv);
        this.f35340j = (Button) aVar.internalFindViewById(R.id.settingButn);
        View internalFindViewById = aVar.internalFindViewById(R.id.backImage);
        TextView textView = this.f35339i;
        if (textView != null) {
            textView.setOnClickListener(new c());
        }
        Button button = this.f35340j;
        if (button != null) {
            button.setOnClickListener(new d());
        }
        if (internalFindViewById != null) {
            internalFindViewById.setOnClickListener(new e());
        }
        afterViews();
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.f35353t.put(cls, t4);
    }

    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i4) {
        super.setContentView(i4);
        this.f35352s.a(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MyAccountBindPhoneActivity
    public void showLoding() {
        org.androidannotations.api.b.e("", new i(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MyAccountBindPhoneActivity
    public void showLodingDismis() {
        org.androidannotations.api.b.e("", new j(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MyAccountBindPhoneActivity
    public void showToast(String str) {
        org.androidannotations.api.b.e("", new h(str), 0L);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        this.f35352s.a(this);
    }

    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        super.setContentView(view);
        this.f35352s.a(this);
    }
}
