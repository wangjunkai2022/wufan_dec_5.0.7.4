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
public final class HandShankFCActivity_ extends HandShankFCActivity implements y3.a, a4.a, a4.b {
    private final a4.c J = new a4.c();
    private final Map<Class<?>, Object> K = new HashMap();

    /* loaded from: classes4.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            HandShankFCActivity_.this.w0();
        }
    }

    /* loaded from: classes4.dex */
    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            HandShankFCActivity_.this.E0();
        }
    }

    /* loaded from: classes4.dex */
    class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            HandShankFCActivity_.this.G0();
        }
    }

    /* loaded from: classes4.dex */
    public static class d extends org.androidannotations.api.builder.a<d> {

        /* renamed from: a  reason: collision with root package name */
        private Fragment f33554a;

        public d(Context context) {
            super(context, HandShankFCActivity_.class);
        }

        @Override // org.androidannotations.api.builder.a, org.androidannotations.api.builder.b
        public org.androidannotations.api.builder.f startForResult(int i4) {
            Fragment fragment = this.f33554a;
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
            super(fragment.getActivity(), HandShankFCActivity_.class);
            this.f33554a = fragment;
        }
    }

    public static d J0(Context context) {
        return new d(context);
    }

    public static d K0(Fragment fragment) {
        return new d(fragment);
    }

    private void init_(Bundle bundle) {
        a4.c.b(this);
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.K.get(cls);
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        return (T) findViewById(i4);
    }

    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.J);
        init_(bundle);
        super.onCreate(bundle);
        a4.c.c(c5);
        setContentView(R.layout.activity_fc_key_map1);
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f33525d = (Button) aVar.internalFindViewById(R.id.select);
        this.f33526e = (Button) aVar.internalFindViewById(R.id.start);
        this.f33527f = (Button) aVar.internalFindViewById(R.id.f15589a);
        this.f33528g = (Button) aVar.internalFindViewById(R.id.f15591b);
        this.f33529h = (Button) aVar.internalFindViewById(R.id.f15595c);
        this.f33530i = (Button) aVar.internalFindViewById(R.id.f15596d);
        this.f33531j = (Button) aVar.internalFindViewById(R.id.f15597e);
        this.f33532k = (Button) aVar.internalFindViewById(R.id.f15598f);
        this.f33533l = (Button) aVar.internalFindViewById(R.id.ab);
        this.f33534m = (Button) aVar.internalFindViewById(R.id.cd);
        this.f33535n = (Button) aVar.internalFindViewById(R.id.abc);
        this.f33536o = (Button) aVar.internalFindViewById(R.id.f15599f1);
        this.f33537p = (Button) aVar.internalFindViewById(R.id.f15600f2);
        this.f33538q = (Button) aVar.internalFindViewById(R.id.f15601f3);
        this.f33539r = (Button) aVar.internalFindViewById(R.id.f15602f4);
        this.f33540s = (Button) aVar.internalFindViewById(R.id.sp1);
        this.f33541t = (Button) aVar.internalFindViewById(R.id.sp2);
        this.f33542u = (Button) aVar.internalFindViewById(R.id.sp3);
        this.f33543v = (Button) aVar.internalFindViewById(R.id.sp4);
        this.f33544w = (Button) aVar.internalFindViewById(R.id.sp5);
        this.f33545x = (TextView) aVar.internalFindViewById(R.id.titleText);
        this.f33546y = (Button) aVar.internalFindViewById(R.id.resetButn);
        View internalFindViewById = aVar.internalFindViewById(R.id.backImage);
        View internalFindViewById2 = aVar.internalFindViewById(R.id.okButn);
        if (internalFindViewById != null) {
            internalFindViewById.setOnClickListener(new a());
        }
        if (internalFindViewById2 != null) {
            internalFindViewById2.setOnClickListener(new b());
        }
        Button button = this.f33546y;
        if (button != null) {
            button.setOnClickListener(new c());
        }
        afterViews();
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.K.put(cls, t4);
    }

    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i4) {
        super.setContentView(i4);
        this.J.a(this);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        this.J.a(this);
    }

    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        super.setContentView(view);
        this.J.a(this);
    }
}
