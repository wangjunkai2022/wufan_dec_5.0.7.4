package com.join.mgps.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.Fragment;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.dto.AccountReginBean;
import java.util.HashMap;
import java.util.Map;
import org.androidannotations.api.a;
/* loaded from: classes4.dex */
public final class MYAccountReginActivity_ extends MYAccountReginActivity implements y3.a, a4.a, a4.b {

    /* renamed from: s  reason: collision with root package name */
    public static final String f35031s = "reginBean";

    /* renamed from: q  reason: collision with root package name */
    private final a4.c f35032q = new a4.c();

    /* renamed from: r  reason: collision with root package name */
    private final Map<Class<?>, Object> f35033r = new HashMap();

    /* loaded from: classes4.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MYAccountReginActivity_.this.j0();
        }
    }

    /* loaded from: classes4.dex */
    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MYAccountReginActivity_.this.m0();
        }
    }

    /* loaded from: classes4.dex */
    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MYAccountReginActivity_.super.showLoding();
        }
    }

    /* loaded from: classes4.dex */
    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MYAccountReginActivity_.super.showLodingDismis();
        }
    }

    /* loaded from: classes4.dex */
    class e implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f35038b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f35039c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f35040d;

        e(String str, String str2, String str3) {
            this.f35038b = str;
            this.f35039c = str2;
            this.f35040d = str3;
        }

        @Override // java.lang.Runnable
        public void run() {
            MYAccountReginActivity_.super.l0(this.f35038b, this.f35039c, this.f35040d);
        }
    }

    /* loaded from: classes4.dex */
    class f implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f35042b;

        f(String str) {
            this.f35042b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            MYAccountReginActivity_.super.error(this.f35042b);
        }
    }

    /* loaded from: classes4.dex */
    class g extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f35044b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f35045c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f35046d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(String str, long j4, String str2, String str3, String str4, String str5) {
            super(str, j4, str2);
            this.f35044b = str3;
            this.f35045c = str4;
            this.f35046d = str5;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                MYAccountReginActivity_.super.k0(this.f35044b, this.f35045c, this.f35046d);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    public static class h extends org.androidannotations.api.builder.a<h> {

        /* renamed from: a  reason: collision with root package name */
        private Fragment f35048a;

        public h(Context context) {
            super(context, MYAccountReginActivity_.class);
        }

        public h a(AccountReginBean accountReginBean) {
            return (h) super.extra(MYAccountReginActivity_.f35031s, accountReginBean);
        }

        @Override // org.androidannotations.api.builder.a, org.androidannotations.api.builder.b
        public org.androidannotations.api.builder.f startForResult(int i4) {
            Fragment fragment = this.f35048a;
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

        public h(Fragment fragment) {
            super(fragment.getActivity(), MYAccountReginActivity_.class);
            this.f35048a = fragment;
        }
    }

    private void init_(Bundle bundle) {
        a4.c.b(this);
        injectExtras_();
    }

    private void injectExtras_() {
        Bundle extras = getIntent().getExtras();
        if (extras == null || !extras.containsKey(f35031s)) {
            return;
        }
        this.f35026o = (AccountReginBean) extras.getSerializable(f35031s);
    }

    public static h t0(Context context) {
        return new h(context);
    }

    public static h u0(Fragment fragment) {
        return new h(fragment);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MYAccountReginActivity
    public void error(String str) {
        org.androidannotations.api.b.e("", new f(str), 0L);
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.f35033r.get(cls);
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        return (T) findViewById(i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MYAccountReginActivity
    public void k0(String str, String str2, String str3) {
        org.androidannotations.api.a.l(new g("", 0L, "", str, str2, str3));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MYAccountReginActivity
    public void l0(String str, String str2, String str3) {
        org.androidannotations.api.b.e("", new e(str, str2, str3), 0L);
    }

    @Override // com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.f35032q);
        init_(bundle);
        super.onCreate(bundle);
        a4.c.c(c5);
        setContentView(R.layout.my_account_regin_activity_layout);
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f35014c = (EditText) aVar.internalFindViewById(R.id.telPhone);
        this.f35015d = (EditText) aVar.internalFindViewById(R.id.password);
        this.f35016e = (EditText) aVar.internalFindViewById(R.id.userName);
        this.f35017f = (CheckBox) aVar.internalFindViewById(R.id.agreeCheckBox);
        this.f35019h = (TextView) aVar.internalFindViewById(R.id.titleText);
        this.f35020i = (Button) aVar.internalFindViewById(R.id.reginButton);
        View internalFindViewById = aVar.internalFindViewById(R.id.backImage);
        if (internalFindViewById != null) {
            internalFindViewById.setOnClickListener(new a());
        }
        Button button = this.f35020i;
        if (button != null) {
            button.setOnClickListener(new b());
        }
        afterView();
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.f35033r.put(cls, t4);
    }

    @Override // com.BaseFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i4) {
        super.setContentView(i4);
        this.f35032q.a(this);
    }

    @Override // android.app.Activity
    public void setIntent(Intent intent) {
        super.setIntent(intent);
        injectExtras_();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MYAccountReginActivity
    public void showLoding() {
        org.androidannotations.api.b.e("", new c(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MYAccountReginActivity
    public void showLodingDismis() {
        org.androidannotations.api.b.e("", new d(), 0L);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        this.f35032q.a(this);
    }

    @Override // com.BaseFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        super.setContentView(view);
        this.f35032q.a(this);
    }
}
