package com.join.mgps.activity.hideapp;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.pref.PrefDef_;
import java.util.HashMap;
import java.util.Map;
import org.androidannotations.api.builder.f;
/* loaded from: classes4.dex */
public final class HideAppCalculatorActivity_ extends HideAppCalculatorActivity implements y3.a, a4.a, a4.b {

    /* renamed from: p  reason: collision with root package name */
    public static final String f38969p = "isFromBackground";

    /* renamed from: n  reason: collision with root package name */
    private final a4.c f38970n = new a4.c();

    /* renamed from: o  reason: collision with root package name */
    private final Map<Class<?>, Object> f38971o = new HashMap();

    /* loaded from: classes4.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            HideAppCalculatorActivity_.this.back_image();
        }
    }

    /* loaded from: classes4.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            HideAppCalculatorActivity_.super.n0();
        }
    }

    /* loaded from: classes4.dex */
    class c implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f38974b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f38975c;

        c(String str, boolean z4) {
            this.f38974b = str;
            this.f38975c = z4;
        }

        @Override // java.lang.Runnable
        public void run() {
            HideAppCalculatorActivity_.super.p0(this.f38974b, this.f38975c);
        }
    }

    /* loaded from: classes4.dex */
    class d implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f38977b;

        d(String str) {
            this.f38977b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            HideAppCalculatorActivity_.super.showMessage(this.f38977b);
        }
    }

    /* loaded from: classes4.dex */
    public static class e extends org.androidannotations.api.builder.a<e> {

        /* renamed from: a  reason: collision with root package name */
        private Fragment f38979a;

        public e(Context context) {
            super(context, HideAppCalculatorActivity_.class);
        }

        public e a(boolean z4) {
            return (e) super.extra("isFromBackground", z4);
        }

        @Override // org.androidannotations.api.builder.a, org.androidannotations.api.builder.b
        public f startForResult(int i4) {
            Fragment fragment = this.f38979a;
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
            return new f(this.context);
        }

        public e(Fragment fragment) {
            super(fragment.getActivity(), HideAppCalculatorActivity_.class);
            this.f38979a = fragment;
        }
    }

    private void init_(Bundle bundle) {
        this.f38954f = new PrefDef_(this);
        a4.c.b(this);
        injectExtras_();
    }

    private void injectExtras_() {
        Bundle extras = getIntent().getExtras();
        if (extras == null || !extras.containsKey("isFromBackground")) {
            return;
        }
        this.f38955g = extras.getBoolean("isFromBackground");
    }

    public static e t0(Context context) {
        return new e(context);
    }

    public static e u0(Fragment fragment) {
        return new e(fragment);
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.f38971o.get(cls);
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        return (T) findViewById(i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.hideapp.HideAppCalculatorActivity
    public void n0() {
        org.androidannotations.api.b.e("", new b(), 0L);
    }

    @Override // com.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.f38970n);
        init_(bundle);
        super.onCreate(bundle);
        a4.c.c(c5);
        setContentView(R.layout.activity_hide_app_calculator);
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f38950b = aVar.internalFindViewById(R.id.statubar);
        this.f38951c = (TextView) aVar.internalFindViewById(R.id.tvCalResult);
        this.f38952d = (RecyclerView) aVar.internalFindViewById(R.id.rvKeyBoard);
        this.f38953e = (LinearLayout) aVar.internalFindViewById(R.id.hideAppMask);
        View internalFindViewById = aVar.internalFindViewById(R.id.back_image);
        if (internalFindViewById != null) {
            internalFindViewById.setOnClickListener(new a());
        }
        afterviews();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.hideapp.HideAppCalculatorActivity
    public void p0(String str, boolean z4) {
        org.androidannotations.api.b.e("", new c(str, z4), 0L);
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.f38971o.put(cls, t4);
    }

    @Override // com.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i4) {
        super.setContentView(i4);
        this.f38970n.a(this);
    }

    @Override // android.app.Activity
    public void setIntent(Intent intent) {
        super.setIntent(intent);
        injectExtras_();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.hideapp.HideAppCalculatorActivity
    public void showMessage(String str) {
        org.androidannotations.api.b.e("", new d(str), 0L);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        this.f38970n.a(this);
    }

    @Override // com.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        super.setContentView(view);
        this.f38970n.a(this);
    }
}
