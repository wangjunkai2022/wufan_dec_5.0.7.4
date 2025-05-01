package com.join.mgps.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.Fragment;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.pref.PrefDef_;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes4.dex */
public final class PapaPlugGuideActivity_ extends PapaPlugGuideActivity implements y3.a, a4.a, a4.b {

    /* renamed from: l  reason: collision with root package name */
    public static final String f36809l = "from";

    /* renamed from: m  reason: collision with root package name */
    public static final String f36810m = "gameId";

    /* renamed from: j  reason: collision with root package name */
    private final a4.c f36811j = new a4.c();

    /* renamed from: k  reason: collision with root package name */
    private final Map<Class<?>, Object> f36812k = new HashMap();

    /* loaded from: classes4.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            PapaPlugGuideActivity_.this.g0();
        }
    }

    /* loaded from: classes4.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            PapaPlugGuideActivity_.super.i0();
        }
    }

    /* loaded from: classes4.dex */
    public static class c extends org.androidannotations.api.builder.a<c> {

        /* renamed from: a  reason: collision with root package name */
        private Fragment f36815a;

        public c(Context context) {
            super(context, PapaPlugGuideActivity_.class);
        }

        public c a(int i4) {
            return (c) super.extra("from", i4);
        }

        public c b(String str) {
            return (c) super.extra("gameId", str);
        }

        @Override // org.androidannotations.api.builder.a, org.androidannotations.api.builder.b
        public org.androidannotations.api.builder.f startForResult(int i4) {
            Fragment fragment = this.f36815a;
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
            super(fragment.getActivity(), PapaPlugGuideActivity_.class);
            this.f36815a = fragment;
        }
    }

    private void init_(Bundle bundle) {
        this.f36805f = new PrefDef_(this);
        a4.c.b(this);
        injectExtras_();
    }

    private void injectExtras_() {
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            if (extras.containsKey("from")) {
                this.f36806g = extras.getInt("from");
            }
            if (extras.containsKey("gameId")) {
                this.f36807h = extras.getString("gameId");
            }
        }
    }

    public static c k0(Context context) {
        return new c(context);
    }

    public static c l0(Fragment fragment) {
        return new c(fragment);
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.f36812k.get(cls);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.PapaPlugGuideActivity
    public void i0() {
        org.androidannotations.api.b.e("", new b(), 1000L);
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        return (T) findViewById(i4);
    }

    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.f36811j);
        init_(bundle);
        super.onCreate(bundle);
        a4.c.c(c5);
        setContentView(R.layout.papa_plug_guide_notice_layout);
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f36801b = (SimpleDraweeView) aVar.internalFindViewById(R.id.guideImage);
        this.f36802c = (TextView) aVar.internalFindViewById(R.id.iKnow);
        this.f36803d = (TextView) aVar.internalFindViewById(R.id.describe);
        this.f36804e = (TextView) aVar.internalFindViewById(R.id.describe2);
        TextView textView = this.f36802c;
        if (textView != null) {
            textView.setOnClickListener(new a());
        }
        afterview();
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.f36812k.put(cls, t4);
    }

    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i4) {
        super.setContentView(i4);
        this.f36811j.a(this);
    }

    @Override // android.app.Activity
    public void setIntent(Intent intent) {
        super.setIntent(intent);
        injectExtras_();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        this.f36811j.a(this);
    }

    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        super.setContentView(view);
        this.f36811j.a(this);
    }
}
