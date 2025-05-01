package com.join.mgps.activity;

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
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.PictureHProgress;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes4.dex */
public final class QuarkLoadingActivity_ extends QuarkLoadingActivity implements y3.a, a4.a, a4.b {

    /* renamed from: u  reason: collision with root package name */
    public static final String f37025u = "quarkId";

    /* renamed from: v  reason: collision with root package name */
    public static final String f37026v = "quarkGameUrl";

    /* renamed from: w  reason: collision with root package name */
    public static final String f37027w = "gameName";

    /* renamed from: x  reason: collision with root package name */
    public static final String f37028x = "gameIconUrl";

    /* renamed from: y  reason: collision with root package name */
    public static final String f37029y = "isLaunchApp";

    /* renamed from: s  reason: collision with root package name */
    private final a4.c f37030s = new a4.c();

    /* renamed from: t  reason: collision with root package name */
    private final Map<Class<?>, Object> f37031t = new HashMap();

    /* loaded from: classes4.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            QuarkLoadingActivity_.this.h0();
        }
    }

    /* loaded from: classes4.dex */
    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            QuarkLoadingActivity_.this.back();
        }
    }

    /* loaded from: classes4.dex */
    class c implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f37034b;

        c(int i4) {
            this.f37034b = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            QuarkLoadingActivity_.super.r0(this.f37034b);
        }
    }

    /* loaded from: classes4.dex */
    public static class d extends org.androidannotations.api.builder.a<d> {

        /* renamed from: a  reason: collision with root package name */
        private Fragment f37036a;

        public d(Context context) {
            super(context, QuarkLoadingActivity_.class);
        }

        public d a(String str) {
            return (d) super.extra("gameIconUrl", str);
        }

        public d b(String str) {
            return (d) super.extra("gameName", str);
        }

        public d c(boolean z4) {
            return (d) super.extra("isLaunchApp", z4);
        }

        public d d(String str) {
            return (d) super.extra(QuarkLoadingActivity_.f37026v, str);
        }

        public d e(String str) {
            return (d) super.extra(QuarkLoadingActivity_.f37025u, str);
        }

        @Override // org.androidannotations.api.builder.a, org.androidannotations.api.builder.b
        public org.androidannotations.api.builder.f startForResult(int i4) {
            Fragment fragment = this.f37036a;
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

        public d(Fragment fragment) {
            super(fragment.getActivity(), QuarkLoadingActivity_.class);
            this.f37036a = fragment;
        }
    }

    private void init_(Bundle bundle) {
        a4.c.b(this);
        injectExtras_();
    }

    private void injectExtras_() {
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            if (extras.containsKey(f37025u)) {
                this.f37000c = extras.getString(f37025u);
            }
            if (extras.containsKey(f37026v)) {
                this.f37001d = extras.getString(f37026v);
            }
            if (extras.containsKey("gameName")) {
                this.f37002e = extras.getString("gameName");
            }
            if (extras.containsKey("gameIconUrl")) {
                this.f37003f = extras.getString("gameIconUrl");
            }
            if (extras.containsKey("isLaunchApp")) {
                this.f37012o = extras.getBoolean("isLaunchApp");
            }
        }
    }

    public static d t0(Context context) {
        return new d(context);
    }

    public static d u0(Fragment fragment) {
        return new d(fragment);
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.f37031t.get(cls);
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        return (T) findViewById(i4);
    }

    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.f37030s);
        init_(bundle);
        super.onCreate(bundle);
        a4.c.c(c5);
        setContentView(R.layout.activity_quark_loading);
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f36999b = aVar.internalFindViewById(R.id.statubar);
        this.f37004g = (SimpleDraweeView) aVar.internalFindViewById(R.id.sdv_image);
        this.f37005h = (TextView) aVar.internalFindViewById(R.id.tv_name);
        this.f37006i = (TextView) aVar.internalFindViewById(R.id.tv_loading_progress);
        this.f37007j = (PictureHProgress) aVar.internalFindViewById(R.id.pb_progress);
        this.f37008k = (LinearLayout) aVar.internalFindViewById(R.id.ll_back);
        View internalFindViewById = aVar.internalFindViewById(R.id.tv_cancel);
        if (internalFindViewById != null) {
            internalFindViewById.setOnClickListener(new a());
        }
        LinearLayout linearLayout = this.f37008k;
        if (linearLayout != null) {
            linearLayout.setOnClickListener(new b());
        }
        afterViews();
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.f37031t.put(cls, t4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.QuarkLoadingActivity
    public void r0(int i4) {
        org.androidannotations.api.b.e("", new c(i4), 0L);
    }

    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i4) {
        super.setContentView(i4);
        this.f37030s.a(this);
    }

    @Override // android.app.Activity
    public void setIntent(Intent intent) {
        super.setIntent(intent);
        injectExtras_();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        this.f37030s.a(this);
    }

    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        super.setContentView(view);
        this.f37030s.a(this);
    }
}
