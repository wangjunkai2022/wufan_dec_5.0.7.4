package com.join.mgps.activity;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.dto.UninstallAppReasonBean;
import java.util.HashMap;
import java.util.Map;
import org.androidannotations.api.a;
/* loaded from: classes4.dex */
public final class UninstallWufunReasonActivity_ extends UninstallWufunReasonActivity implements y3.a, a4.a, a4.b {

    /* renamed from: i  reason: collision with root package name */
    private final a4.c f38213i = new a4.c();

    /* renamed from: j  reason: collision with root package name */
    private final Map<Class<?>, Object> f38214j = new HashMap();

    /* loaded from: classes4.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            UninstallWufunReasonActivity_.this.k0();
        }
    }

    /* loaded from: classes4.dex */
    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            UninstallWufunReasonActivity_.this.j0();
        }
    }

    /* loaded from: classes4.dex */
    class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            UninstallWufunReasonActivity_.this.i0();
        }
    }

    /* loaded from: classes4.dex */
    class d implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ UninstallAppReasonBean f38218b;

        d(UninstallAppReasonBean uninstallAppReasonBean) {
            this.f38218b = uninstallAppReasonBean;
        }

        @Override // java.lang.Runnable
        public void run() {
            UninstallWufunReasonActivity_.super.n0(this.f38218b);
        }
    }

    /* loaded from: classes4.dex */
    class e implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f38220b;

        e(String str) {
            this.f38220b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            UninstallWufunReasonActivity_.super.showToast(this.f38220b);
        }
    }

    /* loaded from: classes4.dex */
    class f implements Runnable {
        f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            UninstallWufunReasonActivity_.super.m0();
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
                UninstallWufunReasonActivity_.super.getData();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class h extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f38224b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(String str, long j4, String str2, String str3) {
            super(str, j4, str2);
            this.f38224b = str3;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                UninstallWufunReasonActivity_.super.l0(this.f38224b);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    public static class i extends org.androidannotations.api.builder.a<i> {

        /* renamed from: a  reason: collision with root package name */
        private Fragment f38226a;

        public i(Context context) {
            super(context, UninstallWufunReasonActivity_.class);
        }

        @Override // org.androidannotations.api.builder.a, org.androidannotations.api.builder.b
        public org.androidannotations.api.builder.f startForResult(int i4) {
            Fragment fragment = this.f38226a;
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

        public i(Fragment fragment) {
            super(fragment.getActivity(), UninstallWufunReasonActivity_.class);
            this.f38226a = fragment;
        }
    }

    private void init_(Bundle bundle) {
        a4.c.b(this);
    }

    public static i t0(Context context) {
        return new i(context);
    }

    public static i u0(Fragment fragment) {
        return new i(fragment);
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.f38214j.get(cls);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.UninstallWufunReasonActivity
    public void getData() {
        org.androidannotations.api.a.l(new g("", 0L, ""));
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        return (T) findViewById(i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.UninstallWufunReasonActivity
    public void l0(String str) {
        org.androidannotations.api.a.l(new h("", 0L, "", str));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.UninstallWufunReasonActivity
    public void m0() {
        org.androidannotations.api.b.e("", new f(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.UninstallWufunReasonActivity
    public void n0(UninstallAppReasonBean uninstallAppReasonBean) {
        org.androidannotations.api.b.e("", new d(uninstallAppReasonBean), 0L);
    }

    @Override // com.join.mgps.activity.UninstallWufunReasonActivity, com.BaseActivity, com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.f38213i);
        init_(bundle);
        super.onCreate(bundle);
        a4.c.c(c5);
        setContentView(R.layout.activity_uninstall_wufun_reason);
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f38205b = (RecyclerView) aVar.internalFindViewById(R.id.rvReportType);
        this.f38206c = (EditText) aVar.internalFindViewById(R.id.etDesc);
        View internalFindViewById = aVar.internalFindViewById(R.id.outside);
        View internalFindViewById2 = aVar.internalFindViewById(R.id.ivClose);
        View internalFindViewById3 = aVar.internalFindViewById(R.id.btnSubmit);
        if (internalFindViewById != null) {
            internalFindViewById.setOnClickListener(new a());
        }
        if (internalFindViewById2 != null) {
            internalFindViewById2.setOnClickListener(new b());
        }
        if (internalFindViewById3 != null) {
            internalFindViewById3.setOnClickListener(new c());
        }
        afterviews();
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.f38214j.put(cls, t4);
    }

    @Override // com.join.mgps.activity.UninstallWufunReasonActivity, com.BaseActivity, com.BaseFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i4) {
        super.setContentView(i4);
        this.f38213i.a(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.UninstallWufunReasonActivity
    public void showToast(String str) {
        org.androidannotations.api.b.e("", new e(str), 0L);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        this.f38213i.a(this);
    }

    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        super.setContentView(view);
        this.f38213i.a(this);
    }
}
