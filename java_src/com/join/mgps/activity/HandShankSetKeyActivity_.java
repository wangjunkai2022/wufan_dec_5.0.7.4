package com.join.mgps.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.Fragment;
import com.join.android.app.mgsim.wufun.R;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes4.dex */
public final class HandShankSetKeyActivity_ extends HandShankSetKeyActivity implements y3.a, a4.a, a4.b {

    /* renamed from: z  reason: collision with root package name */
    public static final String f33814z = "from";

    /* renamed from: x  reason: collision with root package name */
    private final a4.c f33815x = new a4.c();

    /* renamed from: y  reason: collision with root package name */
    private final Map<Class<?>, Object> f33816y = new HashMap();

    /* loaded from: classes4.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            HandShankSetKeyActivity_.this.z0();
        }
    }

    /* loaded from: classes4.dex */
    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            HandShankSetKeyActivity_.this.B0();
        }
    }

    /* loaded from: classes4.dex */
    class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            HandShankSetKeyActivity_.this.w0();
        }
    }

    /* loaded from: classes4.dex */
    public static class d extends org.androidannotations.api.builder.a<d> {

        /* renamed from: a  reason: collision with root package name */
        private Fragment f33820a;

        public d(Context context) {
            super(context, HandShankSetKeyActivity_.class);
        }

        public d a(String str) {
            return (d) super.extra("from", str);
        }

        @Override // org.androidannotations.api.builder.a, org.androidannotations.api.builder.b
        public org.androidannotations.api.builder.f startForResult(int i4) {
            Fragment fragment = this.f33820a;
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
            super(fragment.getActivity(), HandShankSetKeyActivity_.class);
            this.f33820a = fragment;
        }
    }

    public static d E0(Context context) {
        return new d(context);
    }

    public static d F0(Fragment fragment) {
        return new d(fragment);
    }

    private void init_(Bundle bundle) {
        a4.c.b(this);
        injectExtras_();
    }

    private void injectExtras_() {
        Bundle extras = getIntent().getExtras();
        if (extras == null || !extras.containsKey("from")) {
            return;
        }
        this.f33802t = extras.getString("from");
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.f33816y.get(cls);
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        return (T) findViewById(i4);
    }

    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.f33815x);
        init_(bundle);
        super.onCreate(bundle);
        a4.c.c(c5);
        setContentView(R.layout.handshank_set_key);
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f33788f = (Button) aVar.internalFindViewById(R.id.f15608l2);
        this.f33789g = (Button) aVar.internalFindViewById(R.id.f15607l1);
        this.f33790h = (Button) aVar.internalFindViewById(R.id.f15615r2);
        this.f33791i = (Button) aVar.internalFindViewById(R.id.f15614r1);
        this.f33792j = (Button) aVar.internalFindViewById(R.id.up);
        this.f33793k = (Button) aVar.internalFindViewById(R.id.left);
        this.f33794l = (Button) aVar.internalFindViewById(R.id.right);
        this.f33795m = (Button) aVar.internalFindViewById(R.id.down);
        this.f33796n = (Button) aVar.internalFindViewById(R.id.select);
        this.f33797o = (Button) aVar.internalFindViewById(R.id.start);
        this.f33798p = (Button) aVar.internalFindViewById(R.id.f15620x);
        this.f33799q = (Button) aVar.internalFindViewById(R.id.f15621y);
        this.f33800r = (Button) aVar.internalFindViewById(R.id.f15589a);
        this.f33801s = (Button) aVar.internalFindViewById(R.id.f15591b);
        View internalFindViewById = aVar.internalFindViewById(R.id.okButn);
        View internalFindViewById2 = aVar.internalFindViewById(R.id.resetButn);
        View internalFindViewById3 = aVar.internalFindViewById(R.id.backImage);
        if (internalFindViewById != null) {
            internalFindViewById.setOnClickListener(new a());
        }
        if (internalFindViewById2 != null) {
            internalFindViewById2.setOnClickListener(new b());
        }
        if (internalFindViewById3 != null) {
            internalFindViewById3.setOnClickListener(new c());
        }
        afterViews();
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.f33816y.put(cls, t4);
    }

    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i4) {
        super.setContentView(i4);
        this.f33815x.a(this);
    }

    @Override // android.app.Activity
    public void setIntent(Intent intent) {
        super.setIntent(intent);
        injectExtras_();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        this.f33815x.a(this);
    }

    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        super.setContentView(view);
        this.f33815x.a(this);
    }
}
