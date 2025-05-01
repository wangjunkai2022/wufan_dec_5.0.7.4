package com.join.mgps.activity;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.Fragment;
import com.join.android.app.mgsim.wufun.R;
import java.util.HashMap;
import java.util.Map;
import org.androidannotations.api.a;
/* loaded from: classes4.dex */
public final class MyAccountGetpassByPhone_ extends MyAccountGetpassByPhone implements y3.a, a4.a, a4.b {

    /* renamed from: o  reason: collision with root package name */
    private final a4.c f35444o = new a4.c();

    /* renamed from: p  reason: collision with root package name */
    private final Map<Class<?>, Object> f35445p = new HashMap();

    /* loaded from: classes4.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MyAccountGetpassByPhone_.this.l0();
        }
    }

    /* loaded from: classes4.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MyAccountGetpassByPhone_.super.showLoding();
        }
    }

    /* loaded from: classes4.dex */
    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MyAccountGetpassByPhone_.super.showLodingDismis();
        }
    }

    /* loaded from: classes4.dex */
    class d implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f35449b;

        d(String str) {
            this.f35449b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            MyAccountGetpassByPhone_.super.error(this.f35449b);
        }
    }

    /* loaded from: classes4.dex */
    class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MyAccountGetpassByPhone_.super.success();
        }
    }

    /* loaded from: classes4.dex */
    class f extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f35452b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(String str, long j4, String str2, String str3) {
            super(str, j4, str2);
            this.f35452b = str3;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                MyAccountGetpassByPhone_.super.n0(this.f35452b);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    public static class g extends org.androidannotations.api.builder.a<g> {

        /* renamed from: a  reason: collision with root package name */
        private Fragment f35454a;

        public g(Context context) {
            super(context, MyAccountGetpassByPhone_.class);
        }

        @Override // org.androidannotations.api.builder.a, org.androidannotations.api.builder.b
        public org.androidannotations.api.builder.f startForResult(int i4) {
            Fragment fragment = this.f35454a;
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

        public g(Fragment fragment) {
            super(fragment.getActivity(), MyAccountGetpassByPhone_.class);
            this.f35454a = fragment;
        }
    }

    private void init_(Bundle bundle) {
        a4.c.b(this);
    }

    public static g t0(Context context) {
        return new g(context);
    }

    public static g u0(Fragment fragment) {
        return new g(fragment);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MyAccountGetpassByPhone
    public void error(String str) {
        org.androidannotations.api.b.e("", new d(str), 0L);
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.f35445p.get(cls);
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        return (T) findViewById(i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MyAccountGetpassByPhone
    public void n0(String str) {
        org.androidannotations.api.a.l(new f("", 0L, "", str));
    }

    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.f35444o);
        init_(bundle);
        super.onCreate(bundle);
        a4.c.c(c5);
        setContentView(R.layout.my_account_getpassbyphone);
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f35432e = (EditText) aVar.internalFindViewById(R.id.newPass);
        this.f35433f = (EditText) aVar.internalFindViewById(R.id.reWhitePass);
        Button button = (Button) aVar.internalFindViewById(R.id.okChange);
        this.f35435h = button;
        if (button != null) {
            button.setOnClickListener(new a());
        }
        afterview();
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.f35445p.put(cls, t4);
    }

    @Override // com.join.mgps.activity.BaseAccountActivity, com.BaseActivity, com.BaseFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i4) {
        super.setContentView(i4);
        this.f35444o.a(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MyAccountGetpassByPhone
    public void showLoding() {
        org.androidannotations.api.b.e("", new b(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MyAccountGetpassByPhone
    public void showLodingDismis() {
        org.androidannotations.api.b.e("", new c(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MyAccountGetpassByPhone
    public void success() {
        org.androidannotations.api.b.e("", new e(), 0L);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        this.f35444o.a(this);
    }

    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        super.setContentView(view);
        this.f35444o.a(this);
    }
}
