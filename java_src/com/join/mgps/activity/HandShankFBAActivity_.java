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
public final class HandShankFBAActivity_ extends HandShankFBAActivity implements y3.a, a4.a, a4.b {
    private final a4.c J = new a4.c();
    private final Map<Class<?>, Object> K = new HashMap();

    /* loaded from: classes4.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            HandShankFBAActivity_.this.w0();
        }
    }

    /* loaded from: classes4.dex */
    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            HandShankFBAActivity_.this.E0();
        }
    }

    /* loaded from: classes4.dex */
    class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            HandShankFBAActivity_.this.G0();
        }
    }

    /* loaded from: classes4.dex */
    public static class d extends org.androidannotations.api.builder.a<d> {

        /* renamed from: a  reason: collision with root package name */
        private Fragment f33524a;

        public d(Context context) {
            super(context, HandShankFBAActivity_.class);
        }

        @Override // org.androidannotations.api.builder.a, org.androidannotations.api.builder.b
        public org.androidannotations.api.builder.f startForResult(int i4) {
            Fragment fragment = this.f33524a;
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
            super(fragment.getActivity(), HandShankFBAActivity_.class);
            this.f33524a = fragment;
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
        setContentView(R.layout.activity_fba_key_map1);
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f33495d = (Button) aVar.internalFindViewById(R.id.select);
        this.f33496e = (Button) aVar.internalFindViewById(R.id.start);
        this.f33497f = (Button) aVar.internalFindViewById(R.id.f15589a);
        this.f33498g = (Button) aVar.internalFindViewById(R.id.f15591b);
        this.f33499h = (Button) aVar.internalFindViewById(R.id.f15595c);
        this.f33500i = (Button) aVar.internalFindViewById(R.id.f15596d);
        this.f33501j = (Button) aVar.internalFindViewById(R.id.f15597e);
        this.f33502k = (Button) aVar.internalFindViewById(R.id.f15598f);
        this.f33503l = (Button) aVar.internalFindViewById(R.id.ab);
        this.f33504m = (Button) aVar.internalFindViewById(R.id.cd);
        this.f33505n = (Button) aVar.internalFindViewById(R.id.abc);
        this.f33506o = (Button) aVar.internalFindViewById(R.id.f15599f1);
        this.f33507p = (Button) aVar.internalFindViewById(R.id.f15600f2);
        this.f33508q = (Button) aVar.internalFindViewById(R.id.f15601f3);
        this.f33509r = (Button) aVar.internalFindViewById(R.id.f15602f4);
        this.f33510s = (Button) aVar.internalFindViewById(R.id.sp1);
        this.f33511t = (Button) aVar.internalFindViewById(R.id.sp2);
        this.f33512u = (Button) aVar.internalFindViewById(R.id.sp3);
        this.f33513v = (Button) aVar.internalFindViewById(R.id.sp4);
        this.f33514w = (Button) aVar.internalFindViewById(R.id.sp5);
        this.f33515x = (TextView) aVar.internalFindViewById(R.id.titleText);
        this.f33516y = (Button) aVar.internalFindViewById(R.id.resetButn);
        View internalFindViewById = aVar.internalFindViewById(R.id.backImage);
        View internalFindViewById2 = aVar.internalFindViewById(R.id.okButn);
        if (internalFindViewById != null) {
            internalFindViewById.setOnClickListener(new a());
        }
        if (internalFindViewById2 != null) {
            internalFindViewById2.setOnClickListener(new b());
        }
        Button button = this.f33516y;
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
