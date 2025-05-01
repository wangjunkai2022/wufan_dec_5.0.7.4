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
public final class HandShankGBAActivity_ extends HandShankGBAActivity implements y3.a, a4.a, a4.b {

    /* renamed from: w  reason: collision with root package name */
    private final a4.c f33583w = new a4.c();

    /* renamed from: x  reason: collision with root package name */
    private final Map<Class<?>, Object> f33584x = new HashMap();

    /* loaded from: classes4.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            HandShankGBAActivity_.this.w0();
        }
    }

    /* loaded from: classes4.dex */
    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            HandShankGBAActivity_.this.B0();
        }
    }

    /* loaded from: classes4.dex */
    class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            HandShankGBAActivity_.this.F0();
        }
    }

    /* loaded from: classes4.dex */
    public static class d extends org.androidannotations.api.builder.a<d> {

        /* renamed from: a  reason: collision with root package name */
        private Fragment f33588a;

        public d(Context context) {
            super(context, HandShankGBAActivity_.class);
        }

        @Override // org.androidannotations.api.builder.a, org.androidannotations.api.builder.b
        public org.androidannotations.api.builder.f startForResult(int i4) {
            Fragment fragment = this.f33588a;
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
            super(fragment.getActivity(), HandShankGBAActivity_.class);
            this.f33588a = fragment;
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
        return (T) this.f33584x.get(cls);
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        return (T) findViewById(i4);
    }

    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.f33583w);
        init_(bundle);
        super.onCreate(bundle);
        a4.c.c(c5);
        setContentView(R.layout.activity_gba_key_map);
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f33556e = (Button) aVar.internalFindViewById(R.id.select);
        this.f33557f = (Button) aVar.internalFindViewById(R.id.start);
        this.f33558g = (Button) aVar.internalFindViewById(R.id.turbo_b);
        this.f33559h = (Button) aVar.internalFindViewById(R.id.turbo_a);
        this.f33560i = (Button) aVar.internalFindViewById(R.id.f15606l);
        this.f33561j = (Button) aVar.internalFindViewById(R.id.f15591b);
        this.f33562k = (Button) aVar.internalFindViewById(R.id.f15589a);
        this.f33563l = (Button) aVar.internalFindViewById(R.id.f15613r);
        this.f33564m = (Button) aVar.internalFindViewById(R.id.f15608l2);
        this.f33565n = (TextView) aVar.internalFindViewById(R.id.titleText);
        View internalFindViewById = aVar.internalFindViewById(R.id.backImage);
        View internalFindViewById2 = aVar.internalFindViewById(R.id.okButn);
        View internalFindViewById3 = aVar.internalFindViewById(R.id.resetButn);
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
        this.f33584x.put(cls, t4);
    }

    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i4) {
        super.setContentView(i4);
        this.f33583w.a(this);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        this.f33583w.a(this);
    }

    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        super.setContentView(view);
        this.f33583w.a(this);
    }
}
