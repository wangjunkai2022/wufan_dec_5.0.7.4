package com.join.mgps.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.Fragment;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.dto.WxProgram;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes4.dex */
public final class PrivateDomainDefaultActivity_ extends PrivateDomainDefaultActivity implements y3.a, a4.a, a4.b {

    /* renamed from: l  reason: collision with root package name */
    public static final String f36946l = "wxProgram";

    /* renamed from: j  reason: collision with root package name */
    private final a4.c f36947j = new a4.c();

    /* renamed from: k  reason: collision with root package name */
    private final Map<Class<?>, Object> f36948k = new HashMap();

    /* loaded from: classes4.dex */
    public static class a extends org.androidannotations.api.builder.a<a> {

        /* renamed from: a  reason: collision with root package name */
        private Fragment f36949a;

        public a(Context context) {
            super(context, PrivateDomainDefaultActivity_.class);
        }

        public a a(WxProgram wxProgram) {
            return (a) super.extra(PrivateDomainDefaultActivity_.f36946l, wxProgram);
        }

        @Override // org.androidannotations.api.builder.a, org.androidannotations.api.builder.b
        public org.androidannotations.api.builder.f startForResult(int i4) {
            Fragment fragment = this.f36949a;
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

        public a(Fragment fragment) {
            super(fragment.getActivity(), PrivateDomainDefaultActivity_.class);
            this.f36949a = fragment;
        }
    }

    private void init_(Bundle bundle) {
        injectExtras_();
        a4.c.b(this);
    }

    private void injectExtras_() {
        Bundle extras = getIntent().getExtras();
        if (extras == null || !extras.containsKey(f36946l)) {
            return;
        }
        this.f36943i = (WxProgram) extras.getSerializable(f36946l);
    }

    public static a j0(Context context) {
        return new a(context);
    }

    public static a k0(Fragment fragment) {
        return new a(fragment);
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.f36948k.get(cls);
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        return (T) findViewById(i4);
    }

    @Override // com.join.mgps.base.dialog.BaseDialogActivity, com.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.f36947j);
        init_(bundle);
        super.onCreate(bundle);
        a4.c.c(c5);
        setContentView(R.layout.activity_private_domain_default);
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        afterViews();
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.f36948k.put(cls, t4);
    }

    @Override // com.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i4) {
        super.setContentView(i4);
        this.f36947j.a(this);
    }

    @Override // android.app.Activity
    public void setIntent(Intent intent) {
        super.setIntent(intent);
        injectExtras_();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        this.f36947j.a(this);
    }

    @Override // com.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        super.setContentView(view);
        this.f36947j.a(this);
    }
}
