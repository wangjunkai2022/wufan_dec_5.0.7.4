package com.join.mgps.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.Fragment;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.dto.UpdateIntentDataBean;
import com.join.mgps.pref.PrefDef_;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes4.dex */
public final class UpdateLodingActivity_ extends UpdateLodingActivity implements y3.a, a4.a, a4.b {
    public static final String A = "updateIntentDataBean";

    /* renamed from: y  reason: collision with root package name */
    private final a4.c f38294y = new a4.c();

    /* renamed from: z  reason: collision with root package name */
    private final Map<Class<?>, Object> f38295z = new HashMap();

    /* loaded from: classes4.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            UpdateLodingActivity_.super.l0();
        }
    }

    /* loaded from: classes4.dex */
    public static class b extends org.androidannotations.api.builder.a<b> {

        /* renamed from: a  reason: collision with root package name */
        private Fragment f38297a;

        public b(Context context) {
            super(context, UpdateLodingActivity_.class);
        }

        public b a(UpdateIntentDataBean updateIntentDataBean) {
            return (b) super.extra("updateIntentDataBean", updateIntentDataBean);
        }

        @Override // org.androidannotations.api.builder.a, org.androidannotations.api.builder.b
        public org.androidannotations.api.builder.f startForResult(int i4) {
            Fragment fragment = this.f38297a;
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
            super(fragment.getActivity(), UpdateLodingActivity_.class);
            this.f38297a = fragment;
        }
    }

    private void init_(Bundle bundle) {
        this.f38258f = new PrefDef_(this);
        a4.c.b(this);
        injectExtras_();
    }

    private void injectExtras_() {
        Bundle extras = getIntent().getExtras();
        if (extras == null || !extras.containsKey("updateIntentDataBean")) {
            return;
        }
        this.f38259g = (UpdateIntentDataBean) extras.getSerializable("updateIntentDataBean");
    }

    public static b o0(Context context) {
        return new b(context);
    }

    public static b p0(Fragment fragment) {
        return new b(fragment);
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.f38295z.get(cls);
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        return (T) findViewById(i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.UpdateLodingActivity
    public void l0() {
        org.androidannotations.api.b.e("", new a(), 0L);
    }

    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.f38294y);
        init_(bundle);
        super.onCreate(bundle);
        a4.c.c(c5);
        setContentView(R.layout.update_loding_layout);
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f38254b = (ImageView) aVar.internalFindViewById(R.id.lodingBackImage);
        this.f38255c = (ProgressBar) aVar.internalFindViewById(R.id.progressBar);
        this.f38256d = (TextView) aVar.internalFindViewById(R.id.progressmessage);
        this.f38257e = (ProgressBar) aVar.internalFindViewById(R.id.uZIPLoading);
        afterView();
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.f38295z.put(cls, t4);
    }

    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i4) {
        super.setContentView(i4);
        this.f38294y.a(this);
    }

    @Override // android.app.Activity
    public void setIntent(Intent intent) {
        super.setIntent(intent);
        injectExtras_();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        this.f38294y.a(this);
    }

    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        super.setContentView(view);
        this.f38294y.a(this);
    }
}
