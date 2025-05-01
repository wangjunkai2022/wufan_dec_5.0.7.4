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
import com.join.mgps.customview.LJWebView;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes4.dex */
public final class ArenaWebViewActivity_ extends ArenaWebViewActivity implements y3.a, a4.a, a4.b {

    /* renamed from: f  reason: collision with root package name */
    public static final String f28473f = "url";

    /* renamed from: d  reason: collision with root package name */
    private final a4.c f28474d = new a4.c();

    /* renamed from: e  reason: collision with root package name */
    private final Map<Class<?>, Object> f28475e = new HashMap();

    /* loaded from: classes4.dex */
    public static class a extends org.androidannotations.api.builder.a<a> {

        /* renamed from: a  reason: collision with root package name */
        private Fragment f28476a;

        public a(Context context) {
            super(context, ArenaWebViewActivity_.class);
        }

        public a a(String str) {
            return (a) super.extra("url", str);
        }

        @Override // org.androidannotations.api.builder.a, org.androidannotations.api.builder.b
        public org.androidannotations.api.builder.f startForResult(int i4) {
            Fragment fragment = this.f28476a;
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
            super(fragment.getActivity(), ArenaWebViewActivity_.class);
            this.f28476a = fragment;
        }
    }

    public static a h0(Context context) {
        return new a(context);
    }

    public static a i0(Fragment fragment) {
        return new a(fragment);
    }

    private void init_(Bundle bundle) {
        a4.c.b(this);
        injectExtras_();
    }

    private void injectExtras_() {
        Bundle extras = getIntent().getExtras();
        if (extras == null || !extras.containsKey("url")) {
            return;
        }
        this.f28471c = extras.getString("url");
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.f28475e.get(cls);
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        return (T) findViewById(i4);
    }

    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.f28474d);
        init_(bundle);
        super.onCreate(bundle);
        a4.c.c(c5);
        setContentView(R.layout.arena_web);
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f28470b = (LJWebView) aVar.internalFindViewById(R.id.web);
        afterViews();
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.f28475e.put(cls, t4);
    }

    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i4) {
        super.setContentView(i4);
        this.f28474d.a(this);
    }

    @Override // android.app.Activity
    public void setIntent(Intent intent) {
        super.setIntent(intent);
        injectExtras_();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        this.f28474d.a(this);
    }

    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        super.setContentView(view);
        this.f28474d.a(this);
    }
}
