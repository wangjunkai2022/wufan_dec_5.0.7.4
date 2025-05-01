package com.join.mgps.activity.hideapp;

import a4.c;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.Fragment;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.pref.PrefDef_;
import java.util.HashMap;
import java.util.Map;
import org.androidannotations.api.builder.f;
/* loaded from: classes4.dex */
public final class HideAppNotebookActivity_ extends HideAppNotebookActivity implements y3.a, a4.a, a4.b {

    /* renamed from: j  reason: collision with root package name */
    public static final String f39004j = "isFromBackground";

    /* renamed from: h  reason: collision with root package name */
    private final c f39005h = new c();

    /* renamed from: i  reason: collision with root package name */
    private final Map<Class<?>, Object> f39006i = new HashMap();

    /* loaded from: classes4.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            HideAppNotebookActivity_.this.back_image();
        }
    }

    /* loaded from: classes4.dex */
    public static class b extends org.androidannotations.api.builder.a<b> {

        /* renamed from: a  reason: collision with root package name */
        private Fragment f39008a;

        public b(Context context) {
            super(context, HideAppNotebookActivity_.class);
        }

        public b a(boolean z4) {
            return (b) super.extra("isFromBackground", z4);
        }

        @Override // org.androidannotations.api.builder.a, org.androidannotations.api.builder.b
        public f startForResult(int i4) {
            Fragment fragment = this.f39008a;
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

        public b(Fragment fragment) {
            super(fragment.getActivity(), HideAppNotebookActivity_.class);
            this.f39008a = fragment;
        }
    }

    public static b h0(Context context) {
        return new b(context);
    }

    public static b i0(Fragment fragment) {
        return new b(fragment);
    }

    private void init_(Bundle bundle) {
        this.f38999d = new PrefDef_(this);
        c.b(this);
        injectExtras_();
    }

    private void injectExtras_() {
        Bundle extras = getIntent().getExtras();
        if (extras == null || !extras.containsKey("isFromBackground")) {
            return;
        }
        this.f39000e = extras.getBoolean("isFromBackground");
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.f39006i.get(cls);
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        return (T) findViewById(i4);
    }

    @Override // com.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        c c5 = c.c(this.f39005h);
        init_(bundle);
        super.onCreate(bundle);
        c.c(c5);
        setContentView(R.layout.activity_hide_app_notebook);
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f38997b = (EditText) aVar.internalFindViewById(R.id.etNote);
        this.f38998c = aVar.internalFindViewById(R.id.statubar);
        View internalFindViewById = aVar.internalFindViewById(R.id.back_image);
        if (internalFindViewById != null) {
            internalFindViewById.setOnClickListener(new a());
        }
        afterviews();
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.f39006i.put(cls, t4);
    }

    @Override // com.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i4) {
        super.setContentView(i4);
        this.f39005h.a(this);
    }

    @Override // android.app.Activity
    public void setIntent(Intent intent) {
        super.setIntent(intent);
        injectExtras_();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        this.f39005h.a(this);
    }

    @Override // com.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        super.setContentView(view);
        this.f39005h.a(this);
    }
}
