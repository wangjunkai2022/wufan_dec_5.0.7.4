package com.join.mgps.activity;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.Fragment;
import com.join.android.app.mgsim.wufun.R;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes4.dex */
public final class VideoSettingActivity_ extends VideoSettingActivity implements y3.a, a4.a, a4.b {

    /* renamed from: o  reason: collision with root package name */
    private final a4.c f38386o = new a4.c();

    /* renamed from: p  reason: collision with root package name */
    private final Map<Class<?>, Object> f38387p = new HashMap();

    /* loaded from: classes4.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            VideoSettingActivity_.this.k0();
        }
    }

    /* loaded from: classes4.dex */
    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            VideoSettingActivity_.this.m0();
        }
    }

    /* loaded from: classes4.dex */
    class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            VideoSettingActivity_.this.l0();
        }
    }

    /* loaded from: classes4.dex */
    class d implements View.OnClickListener {
        d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            VideoSettingActivity_.this.g0();
        }
    }

    /* loaded from: classes4.dex */
    class e implements View.OnClickListener {
        e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            VideoSettingActivity_.this.i0();
        }
    }

    /* loaded from: classes4.dex */
    class f implements View.OnClickListener {
        f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            VideoSettingActivity_.this.h0();
        }
    }

    /* loaded from: classes4.dex */
    class g implements View.OnClickListener {
        g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            VideoSettingActivity_.this.back_image();
        }
    }

    /* loaded from: classes4.dex */
    public static class h extends org.androidannotations.api.builder.a<h> {

        /* renamed from: a  reason: collision with root package name */
        private Fragment f38395a;

        public h(Context context) {
            super(context, VideoSettingActivity_.class);
        }

        @Override // org.androidannotations.api.builder.a, org.androidannotations.api.builder.b
        public org.androidannotations.api.builder.f startForResult(int i4) {
            Fragment fragment = this.f38395a;
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

        public h(Fragment fragment) {
            super(fragment.getActivity(), VideoSettingActivity_.class);
            this.f38395a = fragment;
        }
    }

    private void init_(Bundle bundle) {
        a4.c.b(this);
    }

    public static h n0(Context context) {
        return new h(context);
    }

    public static h o0(Fragment fragment) {
        return new h(fragment);
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.f38387p.get(cls);
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        return (T) findViewById(i4);
    }

    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.f38386o);
        init_(bundle);
        super.onCreate(bundle);
        a4.c.c(c5);
        setContentView(R.layout.video_setting_activity);
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f38373b = (TextView) aVar.internalFindViewById(R.id.title_textview);
        this.f38374c = aVar.internalFindViewById(R.id.videoAllNet);
        this.f38375d = aVar.internalFindViewById(R.id.videoOnlyWifi);
        this.f38376e = aVar.internalFindViewById(R.id.videoNotPlay);
        this.f38377f = (ImageView) aVar.internalFindViewById(R.id.videoAllNetSwitch);
        this.f38378g = (ImageView) aVar.internalFindViewById(R.id.videoOnlyWifiSwitch);
        this.f38379h = (ImageView) aVar.internalFindViewById(R.id.videoNotPlaySwitch);
        this.f38380i = aVar.internalFindViewById(R.id.homevideoAllNet);
        this.f38381j = aVar.internalFindViewById(R.id.homevideoOnlyWifi);
        this.f38382k = aVar.internalFindViewById(R.id.homevideoNotPlay);
        this.f38383l = (ImageView) aVar.internalFindViewById(R.id.homevideoAllNetSwitch);
        this.f38384m = (ImageView) aVar.internalFindViewById(R.id.homevideoOnlyWifiSwitch);
        this.f38385n = (ImageView) aVar.internalFindViewById(R.id.homevideoNotPlaySwitch);
        View internalFindViewById = aVar.internalFindViewById(R.id.back_image);
        View view = this.f38374c;
        if (view != null) {
            view.setOnClickListener(new a());
        }
        View view2 = this.f38375d;
        if (view2 != null) {
            view2.setOnClickListener(new b());
        }
        View view3 = this.f38376e;
        if (view3 != null) {
            view3.setOnClickListener(new c());
        }
        View view4 = this.f38380i;
        if (view4 != null) {
            view4.setOnClickListener(new d());
        }
        View view5 = this.f38381j;
        if (view5 != null) {
            view5.setOnClickListener(new e());
        }
        View view6 = this.f38382k;
        if (view6 != null) {
            view6.setOnClickListener(new f());
        }
        if (internalFindViewById != null) {
            internalFindViewById.setOnClickListener(new g());
        }
        afterview();
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.f38387p.put(cls, t4);
    }

    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i4) {
        super.setContentView(i4);
        this.f38386o.a(this);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        this.f38386o.a(this);
    }

    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        super.setContentView(view);
        this.f38386o.a(this);
    }
}
