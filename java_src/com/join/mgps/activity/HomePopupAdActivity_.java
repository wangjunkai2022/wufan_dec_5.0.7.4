package com.join.mgps.activity;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.Fragment;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.component.photoviewer.MultiTouchViewPager;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.dto.EverdayLogin;
import java.util.HashMap;
import java.util.Map;
import me.relex.circleindicator.CircleIndicator;
/* loaded from: classes4.dex */
public final class HomePopupAdActivity_ extends HomePopupAdActivity implements y3.a, a4.a, a4.b {

    /* renamed from: t  reason: collision with root package name */
    public static final String f33974t = "adJson";

    /* renamed from: u  reason: collision with root package name */
    public static final String f33975u = "everdayLogin";

    /* renamed from: v  reason: collision with root package name */
    public static final String f33976v = "isFromAccountCenter";

    /* renamed from: p  reason: collision with root package name */
    private final a4.c f33977p = new a4.c();

    /* renamed from: q  reason: collision with root package name */
    private final Map<Class<?>, Object> f33978q = new HashMap();

    /* renamed from: r  reason: collision with root package name */
    private final IntentFilter f33979r = new IntentFilter();

    /* renamed from: s  reason: collision with root package name */
    private final BroadcastReceiver f33980s = new a();

    /* loaded from: classes4.dex */
    class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            HomePopupAdActivity_.this.j0();
        }
    }

    /* loaded from: classes4.dex */
    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            HomePopupAdActivity_.this.l0();
        }
    }

    /* loaded from: classes4.dex */
    public static class c extends org.androidannotations.api.builder.a<c> {

        /* renamed from: a  reason: collision with root package name */
        private Fragment f33983a;

        public c(Context context) {
            super(context, HomePopupAdActivity_.class);
        }

        public c a(String str) {
            return (c) super.extra("adJson", str);
        }

        public c b(EverdayLogin everdayLogin) {
            return (c) super.extra("everdayLogin", everdayLogin);
        }

        public c c(boolean z4) {
            return (c) super.extra("isFromAccountCenter", z4);
        }

        @Override // org.androidannotations.api.builder.a, org.androidannotations.api.builder.b
        public org.androidannotations.api.builder.f startForResult(int i4) {
            Fragment fragment = this.f33983a;
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

        public c(Fragment fragment) {
            super(fragment.getActivity(), HomePopupAdActivity_.class);
            this.f33983a = fragment;
        }
    }

    private void init_(Bundle bundle) {
        a4.c.b(this);
        injectExtras_();
        this.f33979r.addAction(o1.a.A);
        registerReceiver(this.f33980s, this.f33979r);
    }

    private void injectExtras_() {
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            if (extras.containsKey("adJson")) {
                this.f33949e = extras.getString("adJson");
            }
            if (extras.containsKey("everdayLogin")) {
                this.f33950f = (EverdayLogin) extras.getSerializable("everdayLogin");
            }
            if (extras.containsKey("isFromAccountCenter")) {
                this.f33951g = extras.getBoolean("isFromAccountCenter");
            }
        }
    }

    public static c m0(Context context) {
        return new c(context);
    }

    public static c n0(Fragment fragment) {
        return new c(fragment);
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.f33978q.get(cls);
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        return (T) findViewById(i4);
    }

    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.f33977p);
        init_(bundle);
        super.onCreate(bundle);
        a4.c.c(c5);
        setContentView(R.layout.home_popup_ad_activity);
    }

    @Override // com.join.mgps.activity.HomePopupAdActivity, com.BaseActivity, com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        unregisterReceiver(this.f33980s);
        super.onDestroy();
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f33946b = (SimpleDraweeView) aVar.internalFindViewById(R.id.more);
        this.f33947c = (MultiTouchViewPager) aVar.internalFindViewById(R.id.viewPager);
        this.f33948d = (CircleIndicator) aVar.internalFindViewById(R.id.indicator);
        View internalFindViewById = aVar.internalFindViewById(R.id.parentLayout);
        if (internalFindViewById != null) {
            internalFindViewById.setOnClickListener(new b());
        }
        afterViews();
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.f33978q.put(cls, t4);
    }

    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i4) {
        super.setContentView(i4);
        this.f33977p.a(this);
    }

    @Override // android.app.Activity
    public void setIntent(Intent intent) {
        super.setIntent(intent);
        injectExtras_();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        this.f33977p.a(this);
    }

    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        super.setContentView(view);
        this.f33977p.a(this);
    }
}
