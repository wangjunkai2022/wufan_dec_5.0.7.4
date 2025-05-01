package com.join.mgps.activity.hideapp;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.pref.PrefDef_;
import java.util.HashMap;
import java.util.Map;
import org.androidannotations.api.builder.f;
/* loaded from: classes4.dex */
public final class HideAppSetPwdActivity_ extends HideAppSetPwdActivity implements y3.a, a4.a, a4.b {

    /* renamed from: l  reason: collision with root package name */
    public static final String f39021l = "hideType";

    /* renamed from: j  reason: collision with root package name */
    private final a4.c f39022j = new a4.c();

    /* renamed from: k  reason: collision with root package name */
    private final Map<Class<?>, Object> f39023k = new HashMap();

    /* loaded from: classes4.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            HideAppSetPwdActivity_.this.back_image();
        }
    }

    /* loaded from: classes4.dex */
    class b implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f39025b;

        b(String str) {
            this.f39025b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            HideAppSetPwdActivity_.super.showMessage(this.f39025b);
        }
    }

    /* loaded from: classes4.dex */
    public static class c extends org.androidannotations.api.builder.a<c> {

        /* renamed from: a  reason: collision with root package name */
        private Fragment f39027a;

        public c(Context context) {
            super(context, HideAppSetPwdActivity_.class);
        }

        public c a(int i4) {
            return (c) super.extra(HideAppSetPwdActivity_.f39021l, i4);
        }

        @Override // org.androidannotations.api.builder.a, org.androidannotations.api.builder.b
        public f startForResult(int i4) {
            Fragment fragment = this.f39027a;
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
            return new f(this.context);
        }

        public c(Fragment fragment) {
            super(fragment.getActivity(), HideAppSetPwdActivity_.class);
            this.f39027a = fragment;
        }
    }

    private void init_(Bundle bundle) {
        this.f39014g = new PrefDef_(this);
        a4.c.b(this);
        injectExtras_();
    }

    private void injectExtras_() {
        Bundle extras = getIntent().getExtras();
        if (extras == null || !extras.containsKey(f39021l)) {
            return;
        }
        this.f39013f = extras.getInt(f39021l);
    }

    public static c t0(Context context) {
        return new c(context);
    }

    public static c u0(Fragment fragment) {
        return new c(fragment);
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.f39023k.get(cls);
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        return (T) findViewById(i4);
    }

    @Override // com.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.f39022j);
        init_(bundle);
        super.onCreate(bundle);
        a4.c.c(c5);
        setContentView(R.layout.activity_hide_app_set_pwd);
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f39009b = (LinearLayout) aVar.internalFindViewById(R.id.llPwd);
        this.f39010c = (TextView) aVar.internalFindViewById(R.id.title_textview);
        this.f39011d = aVar.internalFindViewById(R.id.statubar);
        this.f39012e = (RecyclerView) aVar.internalFindViewById(R.id.rvKeyBoard);
        View internalFindViewById = aVar.internalFindViewById(R.id.back_image);
        if (internalFindViewById != null) {
            internalFindViewById.setOnClickListener(new a());
        }
        afterviews();
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.f39023k.put(cls, t4);
    }

    @Override // com.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i4) {
        super.setContentView(i4);
        this.f39022j.a(this);
    }

    @Override // android.app.Activity
    public void setIntent(Intent intent) {
        super.setIntent(intent);
        injectExtras_();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.hideapp.HideAppSetPwdActivity
    public void showMessage(String str) {
        org.androidannotations.api.b.e("", new b(str), 0L);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        this.f39022j.a(this);
    }

    @Override // com.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        super.setContentView(view);
        this.f39022j.a(this);
    }
}
