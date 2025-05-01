package com.join.mgps.activity;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.Fragment;
import com.join.android.app.mgsim.wufun.R;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes4.dex */
public final class HandShankPSPActivity_ extends HandShankPSPActivity implements y3.a, a4.a, a4.b {

    /* renamed from: v  reason: collision with root package name */
    private final a4.c f33746v = new a4.c();

    /* renamed from: w  reason: collision with root package name */
    private final Map<Class<?>, Object> f33747w = new HashMap();

    /* loaded from: classes4.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            HandShankPSPActivity_.this.w0();
        }
    }

    /* loaded from: classes4.dex */
    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            HandShankPSPActivity_.this.B0();
        }
    }

    /* loaded from: classes4.dex */
    class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            HandShankPSPActivity_.this.F0();
        }
    }

    /* loaded from: classes4.dex */
    public static class d extends org.androidannotations.api.builder.a<d> {

        /* renamed from: a  reason: collision with root package name */
        private Fragment f33751a;

        public d(Context context) {
            super(context, HandShankPSPActivity_.class);
        }

        @Override // org.androidannotations.api.builder.a, org.androidannotations.api.builder.b
        public org.androidannotations.api.builder.f startForResult(int i4) {
            Fragment fragment = this.f33751a;
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
            super(fragment.getActivity(), HandShankPSPActivity_.class);
            this.f33751a = fragment;
        }
    }

    public static d I0(Context context) {
        return new d(context);
    }

    public static d J0(Fragment fragment) {
        return new d(fragment);
    }

    private void init_(Bundle bundle) {
        a4.c.b(this);
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.f33747w.get(cls);
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        return (T) findViewById(i4);
    }

    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.f33746v);
        init_(bundle);
        super.onCreate(bundle);
        a4.c.c(c5);
        setContentView(R.layout.activity_psp_key_map);
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f33719d = (Button) aVar.internalFindViewById(R.id.select);
        this.f33720e = (Button) aVar.internalFindViewById(R.id.start);
        this.f33721f = (Button) aVar.internalFindViewById(R.id.f15606l);
        this.f33722g = (Button) aVar.internalFindViewById(R.id.f15613r);
        this.f33723h = (Button) aVar.internalFindViewById(R.id.f15621y);
        this.f33724i = (Button) aVar.internalFindViewById(R.id.f15620x);
        this.f33725j = (Button) aVar.internalFindViewById(R.id.f15591b);
        this.f33726k = (Button) aVar.internalFindViewById(R.id.f15589a);
        this.f33727l = (Button) aVar.internalFindViewById(R.id.resetButn);
        this.f33728m = (TextView) aVar.internalFindViewById(R.id.titleText);
        View internalFindViewById = aVar.internalFindViewById(R.id.backImage);
        View internalFindViewById2 = aVar.internalFindViewById(R.id.okButn);
        if (internalFindViewById != null) {
            internalFindViewById.setOnClickListener(new a());
        }
        if (internalFindViewById2 != null) {
            internalFindViewById2.setOnClickListener(new b());
        }
        Button button = this.f33727l;
        if (button != null) {
            button.setOnClickListener(new c());
        }
        afterViews();
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.f33747w.put(cls, t4);
    }

    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i4) {
        super.setContentView(i4);
        this.f33746v.a(this);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        this.f33746v.a(this);
    }

    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        super.setContentView(view);
        this.f33746v.a(this);
    }
}
