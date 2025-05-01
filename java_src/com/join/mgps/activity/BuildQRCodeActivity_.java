package com.join.mgps.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.Fragment;
import com.join.android.app.mgsim.wufun.R;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes4.dex */
public final class BuildQRCodeActivity_ extends BuildQRCodeActivity implements y3.a, a4.a, a4.b {
    public static final String E = "ssid";
    private final a4.c C = new a4.c();
    private final Map<Class<?>, Object> D = new HashMap();

    /* loaded from: classes4.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            BuildQRCodeActivity_.this.u0();
        }
    }

    /* loaded from: classes4.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            BuildQRCodeActivity_.super.m0();
        }
    }

    /* loaded from: classes4.dex */
    public static class c extends org.androidannotations.api.builder.a<c> {

        /* renamed from: a  reason: collision with root package name */
        private Fragment f28523a;

        public c(Context context) {
            super(context, BuildQRCodeActivity_.class);
        }

        public c a(String str) {
            return (c) super.extra(BuildQRCodeActivity_.E, str);
        }

        @Override // org.androidannotations.api.builder.a, org.androidannotations.api.builder.b
        public org.androidannotations.api.builder.f startForResult(int i4) {
            Fragment fragment = this.f28523a;
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
            super(fragment.getActivity(), BuildQRCodeActivity_.class);
            this.f28523a = fragment;
        }
    }

    private void init_(Bundle bundle) {
        Resources resources = getResources();
        a4.c.b(this);
        this.f28499g = resources.getString(R.string.title_build_qr_code);
        this.f28512t = resources.getString(R.string.hint_msg_creating_ap_wifi);
        this.f28513u = resources.getString(R.string.hint_msg_create_ap_wifi_failed);
        injectExtras_();
        q0();
    }

    private void injectExtras_() {
        Bundle extras = getIntent().getExtras();
        if (extras == null || !extras.containsKey(E)) {
            return;
        }
        this.f28516x = extras.getString(E);
    }

    public static c y0(Context context) {
        return new c(context);
    }

    public static c z0(Fragment fragment) {
        return new c(fragment);
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.D.get(cls);
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        return (T) findViewById(i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.BuildQRCodeActivity
    public void m0() {
        org.androidannotations.api.b.e("", new b(), 0L);
    }

    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.C);
        init_(bundle);
        super.onCreate(bundle);
        a4.c.c(c5);
        setContentView(R.layout.activity_build_qr_code);
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f28497e = (TextView) aVar.internalFindViewById(R.id.title_textview);
        this.f28498f = (RelativeLayout) aVar.internalFindViewById(R.id.build_qr_code_title);
        this.f28500h = (ViewStub) aVar.internalFindViewById(R.id.qr_code_vstub);
        View internalFindViewById = aVar.internalFindViewById(R.id.back_image);
        if (internalFindViewById != null) {
            internalFindViewById.setOnClickListener(new a());
        }
        r0();
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.D.put(cls, t4);
    }

    @Override // com.join.mgps.baseactivity.BaseLoadingActivity, com.BaseActivity, com.BaseFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i4) {
        super.setContentView(i4);
        this.C.a(this);
    }

    @Override // android.app.Activity
    public void setIntent(Intent intent) {
        super.setIntent(intent);
        injectExtras_();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        this.C.a(this);
    }

    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        super.setContentView(view);
        this.C.a(this);
    }
}
