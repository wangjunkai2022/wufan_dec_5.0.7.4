package com.join.mgps.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.Fragment;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.dto.PlayCfgBean;
import com.join.mgps.dto.ThAdSwitchDataBean;
import com.join.mgps.pref.PrefDef_;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes4.dex */
public final class SplashActivity_ extends SplashActivity implements y3.a, a4.a, a4.b {

    /* renamed from: p1  reason: collision with root package name */
    public static final String f37925p1 = "thAdSwitchDataBean";

    /* renamed from: v1  reason: collision with root package name */
    public static final String f37926v1 = "splashVideoCfg";
    private final a4.c Z = new a4.c();

    /* renamed from: p0  reason: collision with root package name */
    private final Map<Class<?>, Object> f37927p0 = new HashMap();

    /* loaded from: classes4.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SplashActivity_.super.d0();
        }
    }

    /* loaded from: classes4.dex */
    public static class b extends org.androidannotations.api.builder.a<b> {

        /* renamed from: a  reason: collision with root package name */
        private Fragment f37929a;

        public b(Context context) {
            super(context, SplashActivity_.class);
        }

        public b a(PlayCfgBean playCfgBean) {
            return (b) super.extra(SplashActivity_.f37926v1, playCfgBean);
        }

        public b b(ThAdSwitchDataBean thAdSwitchDataBean) {
            return (b) super.extra(SplashActivity_.f37925p1, thAdSwitchDataBean);
        }

        @Override // org.androidannotations.api.builder.a, org.androidannotations.api.builder.b
        public org.androidannotations.api.builder.f startForResult(int i4) {
            Fragment fragment = this.f37929a;
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

        public b(Fragment fragment) {
            super(fragment.getActivity(), SplashActivity_.class);
            this.f37929a = fragment;
        }
    }

    private void h0(Bundle bundle) {
        this.f37881g = new PrefDef_(this);
        a4.c.b(this);
        i0();
    }

    private void i0() {
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            if (extras.containsKey(f37925p1)) {
                this.f37885k = (ThAdSwitchDataBean) extras.getSerializable(f37925p1);
            }
            if (extras.containsKey(f37926v1)) {
                this.f37886l = (PlayCfgBean) extras.getSerializable(f37926v1);
            }
        }
    }

    public static b j0(Context context) {
        return new b(context);
    }

    public static b k0(Fragment fragment) {
        return new b(fragment);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.SplashActivity
    public void d0() {
        org.androidannotations.api.b.e("", new a(), 100L);
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.f37927p0.get(cls);
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        return (T) findViewById(i4);
    }

    @Override // com.join.mgps.activity.SplashActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.Z);
        h0(bundle);
        super.onCreate(bundle);
        a4.c.c(c5);
        setContentView(R.layout.splash_main_layout);
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f37876b = (FrameLayout) aVar.internalFindViewById(R.id.main);
        this.f37887m = (ImageView) aVar.internalFindViewById(R.id.splash_holder);
        this.f37888n = (TextView) aVar.internalFindViewById(R.id.skip_view);
        t();
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.f37927p0.put(cls, t4);
    }

    @Override // android.app.Activity
    public void setContentView(int i4) {
        super.setContentView(i4);
        this.Z.a(this);
    }

    @Override // android.app.Activity
    public void setIntent(Intent intent) {
        super.setIntent(intent);
        i0();
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        this.Z.a(this);
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        super.setContentView(view);
        this.Z.a(this);
    }
}
