package com.join.mgps.activity;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.Fragment;
import com.join.android.app.mgsim.wufun.R;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes4.dex */
public final class NowWufunActivity_ extends NowWufunActivity implements y3.a, a4.a, a4.b {

    /* renamed from: q  reason: collision with root package name */
    public static final String f36170q = "fromTo";

    /* renamed from: m  reason: collision with root package name */
    private final a4.c f36171m = new a4.c();

    /* renamed from: n  reason: collision with root package name */
    private final Map<Class<?>, Object> f36172n = new HashMap();

    /* renamed from: o  reason: collision with root package name */
    private final IntentFilter f36173o = new IntentFilter();

    /* renamed from: p  reason: collision with root package name */
    private final BroadcastReceiver f36174p = new a();

    /* loaded from: classes4.dex */
    class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            NowWufunActivity_.this.k0(intent);
        }
    }

    /* loaded from: classes4.dex */
    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            NowWufunActivity_.this.l0();
        }
    }

    /* loaded from: classes4.dex */
    class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            NowWufunActivity_.this.i0();
        }
    }

    /* loaded from: classes4.dex */
    class d implements View.OnClickListener {
        d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            NowWufunActivity_.this.f0();
        }
    }

    /* loaded from: classes4.dex */
    class e implements View.OnClickListener {
        e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            NowWufunActivity_.this.o0();
        }
    }

    /* loaded from: classes4.dex */
    class f implements View.OnClickListener {
        f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            NowWufunActivity_.this.n0();
        }
    }

    /* loaded from: classes4.dex */
    class g implements View.OnClickListener {
        g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            NowWufunActivity_.this.back_image();
        }
    }

    /* loaded from: classes4.dex */
    public static class h extends org.androidannotations.api.builder.a<h> {

        /* renamed from: a  reason: collision with root package name */
        private Fragment f36182a;

        public h(Context context) {
            super(context, NowWufunActivity_.class);
        }

        public h a(int i4) {
            return (h) super.extra(NowWufunActivity_.f36170q, i4);
        }

        @Override // org.androidannotations.api.builder.a, org.androidannotations.api.builder.b
        public org.androidannotations.api.builder.f startForResult(int i4) {
            Fragment fragment = this.f36182a;
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
            super(fragment.getActivity(), NowWufunActivity_.class);
            this.f36182a = fragment;
        }
    }

    private void init_(Bundle bundle) {
        a4.c.b(this);
        injectExtras_();
        this.f36173o.addAction("com.intent.nowwufun.everdaytab");
        registerReceiver(this.f36174p, this.f36173o);
    }

    private void injectExtras_() {
        Bundle extras = getIntent().getExtras();
        if (extras == null || !extras.containsKey(f36170q)) {
            return;
        }
        this.f36159b = extras.getInt(f36170q);
    }

    public static h p0(Context context) {
        return new h(context);
    }

    public static h q0(Fragment fragment) {
        return new h(fragment);
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.f36172n.get(cls);
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        return (T) findViewById(i4);
    }

    @Override // com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.f36171m);
        init_(bundle);
        super.onCreate(bundle);
        a4.c.c(c5);
        setContentView(R.layout.now_wufun_activity_layout);
    }

    @Override // com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        unregisterReceiver(this.f36174p);
        super.onDestroy();
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f36160c = (FrameLayout) aVar.internalFindViewById(R.id.fragmentLayout);
        this.f36161d = (TextView) aVar.internalFindViewById(R.id.title_textview);
        this.f36162e = (TextView) aVar.internalFindViewById(R.id.nowWufun);
        this.f36163f = (TextView) aVar.internalFindViewById(R.id.everdayFind);
        this.f36164g = (TextView) aVar.internalFindViewById(R.id.broadcast);
        this.f36165h = (TextView) aVar.internalFindViewById(R.id.todayNew);
        this.f36166i = (TextView) aVar.internalFindViewById(R.id.tallk);
        View internalFindViewById = aVar.internalFindViewById(R.id.back_image);
        TextView textView = this.f36162e;
        if (textView != null) {
            textView.setOnClickListener(new b());
        }
        TextView textView2 = this.f36163f;
        if (textView2 != null) {
            textView2.setOnClickListener(new c());
        }
        TextView textView3 = this.f36164g;
        if (textView3 != null) {
            textView3.setOnClickListener(new d());
        }
        TextView textView4 = this.f36165h;
        if (textView4 != null) {
            textView4.setOnClickListener(new e());
        }
        TextView textView5 = this.f36166i;
        if (textView5 != null) {
            textView5.setOnClickListener(new f());
        }
        if (internalFindViewById != null) {
            internalFindViewById.setOnClickListener(new g());
        }
        afterviews();
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.f36172n.put(cls, t4);
    }

    @Override // com.BaseFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i4) {
        super.setContentView(i4);
        this.f36171m.a(this);
    }

    @Override // android.app.Activity
    public void setIntent(Intent intent) {
        super.setIntent(intent);
        injectExtras_();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        this.f36171m.a(this);
    }

    @Override // com.BaseFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        super.setContentView(view);
        this.f36171m.a(this);
    }
}
