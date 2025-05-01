package com.join.mgps.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.Fragment;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.MyGridView;
import com.join.mgps.dto.AccountBean;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.androidannotations.api.a;
/* loaded from: classes4.dex */
public final class MYAccountReginFinishActivity_ extends MYAccountReginFinishActivity implements y3.a, a4.a, a4.b {

    /* renamed from: y  reason: collision with root package name */
    public static final String f35072y = "accountBean";

    /* renamed from: z  reason: collision with root package name */
    public static final String f35073z = "fromWhere";

    /* renamed from: w  reason: collision with root package name */
    private final a4.c f35074w = new a4.c();

    /* renamed from: x  reason: collision with root package name */
    private final Map<Class<?>, Object> f35075x = new HashMap();

    /* loaded from: classes4.dex */
    class a extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f35076b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, long j4, String str2, String str3) {
            super(str, j4, str2);
            this.f35076b = str3;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                MYAccountReginFinishActivity_.super.r0(this.f35076b);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class b extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f35078b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, long j4, String str2, String str3) {
            super(str, j4, str2);
            this.f35078b = str3;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                MYAccountReginFinishActivity_.super.n0(this.f35078b);
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
            MYAccountReginFinishActivity_.this.m0();
        }
    }

    /* loaded from: classes4.dex */
    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MYAccountReginFinishActivity_.super.p0();
        }
    }

    /* loaded from: classes4.dex */
    class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MYAccountReginFinishActivity_.super.l0();
        }
    }

    /* loaded from: classes4.dex */
    class f implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f35083b;

        f(List list) {
            this.f35083b = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            MYAccountReginFinishActivity_.super.o0(this.f35083b);
        }
    }

    /* loaded from: classes4.dex */
    class g implements Runnable {
        g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MYAccountReginFinishActivity_.super.showLoding();
        }
    }

    /* loaded from: classes4.dex */
    class h implements Runnable {
        h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MYAccountReginFinishActivity_.super.showLodingDismis();
        }
    }

    /* loaded from: classes4.dex */
    class i implements Runnable {
        i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MYAccountReginFinishActivity_.super.q0();
        }
    }

    /* loaded from: classes4.dex */
    class j implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f35088b;

        j(String str) {
            this.f35088b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            MYAccountReginFinishActivity_.super.error(this.f35088b);
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
                MYAccountReginFinishActivity_.super.k0();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    public static class l extends org.androidannotations.api.builder.a<l> {

        /* renamed from: a  reason: collision with root package name */
        private Fragment f35091a;

        public l(Context context) {
            super(context, MYAccountReginFinishActivity_.class);
        }

        public l a(AccountBean accountBean) {
            return (l) super.extra(MYAccountReginFinishActivity_.f35072y, accountBean);
        }

        public l b(int i4) {
            return (l) super.extra(MYAccountReginFinishActivity_.f35073z, i4);
        }

        @Override // org.androidannotations.api.builder.a, org.androidannotations.api.builder.b
        public org.androidannotations.api.builder.f startForResult(int i4) {
            Fragment fragment = this.f35091a;
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
            super(fragment.getActivity(), MYAccountReginFinishActivity_.class);
            this.f35091a = fragment;
        }
    }

    public static l C0(Context context) {
        return new l(context);
    }

    public static l D0(Fragment fragment) {
        return new l(fragment);
    }

    private void init_(Bundle bundle) {
        a4.c.b(this);
        injectExtras_();
    }

    private void injectExtras_() {
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            if (extras.containsKey(f35072y)) {
                this.f35061m = (AccountBean) extras.getSerializable(f35072y);
            }
            if (extras.containsKey(f35073z)) {
                this.f35062n = extras.getInt(f35073z);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MYAccountReginFinishActivity
    public void error(String str) {
        org.androidannotations.api.b.e("", new j(str), 0L);
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.f35075x.get(cls);
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        return (T) findViewById(i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MYAccountReginFinishActivity
    public void k0() {
        org.androidannotations.api.a.l(new k("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MYAccountReginFinishActivity
    public void l0() {
        org.androidannotations.api.b.e("", new e(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MYAccountReginFinishActivity
    public void n0(String str) {
        org.androidannotations.api.a.l(new b("", 0L, "", str));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MYAccountReginFinishActivity
    public void o0(List<String> list) {
        org.androidannotations.api.b.e("", new f(list), 0L);
    }

    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.f35074w);
        init_(bundle);
        super.onCreate(bundle);
        a4.c.c(c5);
        setContentView(R.layout.my_account_reginfinish_layout);
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f35051c = (MyGridView) aVar.internalFindViewById(R.id.chooseGridView);
        this.f35052d = (LinearLayout) aVar.internalFindViewById(R.id.loding_layout);
        this.f35053e = (LinearLayout) aVar.internalFindViewById(R.id.loding_faile);
        this.f35054f = (TextView) aVar.internalFindViewById(R.id.title_textview);
        this.f35055g = (ScrollView) aVar.internalFindViewById(R.id.scrollView);
        Button button = (Button) aVar.internalFindViewById(R.id.reginFinish);
        this.f35056h = button;
        if (button != null) {
            button.setOnClickListener(new c());
        }
        afterview();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MYAccountReginFinishActivity
    public void p0() {
        org.androidannotations.api.b.e("", new d(), 0L);
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.f35075x.put(cls, t4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MYAccountReginFinishActivity
    public void q0() {
        org.androidannotations.api.b.e("", new i(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MYAccountReginFinishActivity
    public void r0(String str) {
        org.androidannotations.api.a.l(new a("", 0L, "", str));
    }

    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i4) {
        super.setContentView(i4);
        this.f35074w.a(this);
    }

    @Override // android.app.Activity
    public void setIntent(Intent intent) {
        super.setIntent(intent);
        injectExtras_();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MYAccountReginFinishActivity
    public void showLoding() {
        org.androidannotations.api.b.e("", new g(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MYAccountReginFinishActivity
    public void showLodingDismis() {
        org.androidannotations.api.b.e("", new h(), 0L);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        this.f35074w.a(this);
    }

    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        super.setContentView(view);
        this.f35074w.a(this);
    }
}
