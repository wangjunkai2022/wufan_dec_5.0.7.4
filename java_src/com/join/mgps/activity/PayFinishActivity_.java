package com.join.mgps.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.Fragment;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.dto.PapayResult;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes4.dex */
public final class PayFinishActivity_ extends PayFinishActivity implements y3.a, a4.a, a4.b {

    /* renamed from: h  reason: collision with root package name */
    public static final String f36852h = "papayResult";

    /* renamed from: f  reason: collision with root package name */
    private final a4.c f36853f = new a4.c();

    /* renamed from: g  reason: collision with root package name */
    private final Map<Class<?>, Object> f36854g = new HashMap();

    /* loaded from: classes4.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            PayFinishActivity_.this.h0();
        }
    }

    /* loaded from: classes4.dex */
    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            PayFinishActivity_.this.i0();
        }
    }

    /* loaded from: classes4.dex */
    class c implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f36857b;

        c(String str) {
            this.f36857b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            PayFinishActivity_.super.showTost(this.f36857b);
        }
    }

    /* loaded from: classes4.dex */
    public static class d extends org.androidannotations.api.builder.a<d> {

        /* renamed from: a  reason: collision with root package name */
        private Fragment f36859a;

        public d(Context context) {
            super(context, PayFinishActivity_.class);
        }

        public d a(PapayResult papayResult) {
            return (d) super.extra("papayResult", papayResult);
        }

        @Override // org.androidannotations.api.builder.a, org.androidannotations.api.builder.b
        public org.androidannotations.api.builder.f startForResult(int i4) {
            Fragment fragment = this.f36859a;
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

        public d(Fragment fragment) {
            super(fragment.getActivity(), PayFinishActivity_.class);
            this.f36859a = fragment;
        }
    }

    private void init_(Bundle bundle) {
        a4.c.b(this);
        injectExtras_();
    }

    private void injectExtras_() {
        Bundle extras = getIntent().getExtras();
        if (extras == null || !extras.containsKey("papayResult")) {
            return;
        }
        this.f36846b = (PapayResult) extras.getSerializable("papayResult");
    }

    public static d k0(Context context) {
        return new d(context);
    }

    public static d l0(Fragment fragment) {
        return new d(fragment);
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.f36854g.get(cls);
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        return (T) findViewById(i4);
    }

    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.f36853f);
        init_(bundle);
        super.onCreate(bundle);
        a4.c.c(c5);
        setContentView(R.layout.payfinish_activirty);
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        View internalFindViewById = aVar.internalFindViewById(R.id.closed);
        View internalFindViewById2 = aVar.internalFindViewById(R.id.downButn);
        if (internalFindViewById != null) {
            internalFindViewById.setOnClickListener(new a());
        }
        if (internalFindViewById2 != null) {
            internalFindViewById2.setOnClickListener(new b());
        }
        afterview();
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.f36854g.put(cls, t4);
    }

    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i4) {
        super.setContentView(i4);
        this.f36853f.a(this);
    }

    @Override // android.app.Activity
    public void setIntent(Intent intent) {
        super.setIntent(intent);
        injectExtras_();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.PayFinishActivity
    public void showTost(String str) {
        org.androidannotations.api.b.e("", new c(str), 0L);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        this.f36853f.a(this);
    }

    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        super.setContentView(view);
        this.f36853f.a(this);
    }
}
