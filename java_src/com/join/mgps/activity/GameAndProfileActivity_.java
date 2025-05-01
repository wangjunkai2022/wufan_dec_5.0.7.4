package com.join.mgps.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import com.flyco.tablayout.SlidingTabLayout;
import com.join.android.app.mgsim.wufun.R;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes4.dex */
public final class GameAndProfileActivity_ extends GameAndProfileActivity implements y3.a, a4.a, a4.b {

    /* renamed from: q  reason: collision with root package name */
    public static final String f31436q = "type";

    /* renamed from: r  reason: collision with root package name */
    public static final String f31437r = "uid";

    /* renamed from: o  reason: collision with root package name */
    private final a4.c f31438o = new a4.c();

    /* renamed from: p  reason: collision with root package name */
    private final Map<Class<?>, Object> f31439p = new HashMap();

    /* loaded from: classes4.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GameAndProfileActivity_.this.g0();
        }
    }

    /* loaded from: classes4.dex */
    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GameAndProfileActivity_.this.iv_back();
        }
    }

    /* loaded from: classes4.dex */
    public static class c extends org.androidannotations.api.builder.a<c> {

        /* renamed from: a  reason: collision with root package name */
        private Fragment f31442a;

        public c(Context context) {
            super(context, GameAndProfileActivity_.class);
        }

        public c a(int i4) {
            return (c) super.extra("type", i4);
        }

        public c b(int i4) {
            return (c) super.extra("uid", i4);
        }

        @Override // org.androidannotations.api.builder.a, org.androidannotations.api.builder.b
        public org.androidannotations.api.builder.f startForResult(int i4) {
            Fragment fragment = this.f31442a;
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
            super(fragment.getActivity(), GameAndProfileActivity_.class);
            this.f31442a = fragment;
        }
    }

    public static c h0(Context context) {
        return new c(context);
    }

    public static c i0(Fragment fragment) {
        return new c(fragment);
    }

    private void init_(Bundle bundle) {
        a4.c.b(this);
        injectExtras_();
    }

    private void injectExtras_() {
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            if (extras.containsKey("type")) {
                this.f31428h = extras.getInt("type");
            }
            if (extras.containsKey("uid")) {
                this.f31429i = extras.getInt("uid");
            }
        }
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.f31439p.get(cls);
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        return (T) findViewById(i4);
    }

    @Override // com.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.f31438o);
        init_(bundle);
        super.onCreate(bundle);
        a4.c.c(c5);
        setContentView(R.layout.activity_game_and_profile);
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f31422b = (SlidingTabLayout) aVar.internalFindViewById(R.id.tableLayout);
        this.f31423c = (ViewPager) aVar.internalFindViewById(R.id.viewPager);
        this.f31424d = (LinearLayout) aVar.internalFindViewById(R.id.iv_back);
        this.f31425e = (RelativeLayout) aVar.internalFindViewById(R.id.tv_back);
        this.f31426f = (TextView) aVar.internalFindViewById(R.id.tv_buildGmae);
        this.f31427g = (TextView) aVar.internalFindViewById(R.id.title);
        TextView textView = this.f31426f;
        if (textView != null) {
            textView.setOnClickListener(new a());
        }
        LinearLayout linearLayout = this.f31424d;
        if (linearLayout != null) {
            linearLayout.setOnClickListener(new b());
        }
        f0();
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.f31439p.put(cls, t4);
    }

    @Override // com.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i4) {
        super.setContentView(i4);
        this.f31438o.a(this);
    }

    @Override // android.app.Activity
    public void setIntent(Intent intent) {
        super.setIntent(intent);
        injectExtras_();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        this.f31438o.a(this);
    }

    @Override // com.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        super.setContentView(view);
        this.f31438o.a(this);
    }
}
