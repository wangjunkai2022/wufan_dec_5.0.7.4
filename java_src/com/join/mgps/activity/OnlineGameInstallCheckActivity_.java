package com.join.mgps.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.pref.PrefDef_;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes4.dex */
public final class OnlineGameInstallCheckActivity_ extends OnlineGameInstallCheckActivity implements y3.a, a4.a, a4.b {

    /* renamed from: v  reason: collision with root package name */
    public static final String f36287v = "gameId";

    /* renamed from: t  reason: collision with root package name */
    private final a4.c f36288t = new a4.c();

    /* renamed from: u  reason: collision with root package name */
    private final Map<Class<?>, Object> f36289u = new HashMap();

    /* loaded from: classes4.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            OnlineGameInstallCheckActivity_.this.back_image();
        }
    }

    /* loaded from: classes4.dex */
    class b implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f36291b;

        b(String str) {
            this.f36291b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            OnlineGameInstallCheckActivity_.super.showToast(this.f36291b);
        }
    }

    /* loaded from: classes4.dex */
    public static class c extends org.androidannotations.api.builder.a<c> {

        /* renamed from: a  reason: collision with root package name */
        private Fragment f36293a;

        public c(Context context) {
            super(context, OnlineGameInstallCheckActivity_.class);
        }

        public c a(String str) {
            return (c) super.extra("gameId", str);
        }

        @Override // org.androidannotations.api.builder.a, org.androidannotations.api.builder.b
        public org.androidannotations.api.builder.f startForResult(int i4) {
            Fragment fragment = this.f36293a;
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
            super(fragment.getActivity(), OnlineGameInstallCheckActivity_.class);
            this.f36293a = fragment;
        }
    }

    private void init_(Bundle bundle) {
        this.f36269j = new PrefDef_(this);
        a4.c.b(this);
        injectExtras_();
    }

    private void injectExtras_() {
        Bundle extras = getIntent().getExtras();
        if (extras == null || !extras.containsKey("gameId")) {
            return;
        }
        this.f36268i = extras.getString("gameId");
    }

    public static c t0(Context context) {
        return new c(context);
    }

    public static c u0(Fragment fragment) {
        return new c(fragment);
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.f36289u.get(cls);
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        return (T) findViewById(i4);
    }

    @Override // com.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.f36288t);
        init_(bundle);
        super.onCreate(bundle);
        a4.c.c(c5);
        setContentView(R.layout.activity_online_game_install_check);
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f36261b = aVar.internalFindViewById(R.id.header);
        this.f36262c = (SimpleDraweeView) aVar.internalFindViewById(R.id.ivGameIcon);
        this.f36263d = (TextView) aVar.internalFindViewById(R.id.tvGameName);
        this.f36264e = (ProgressBar) aVar.internalFindViewById(R.id.progress);
        this.f36265f = (RecyclerView) aVar.internalFindViewById(R.id.rvCheck);
        this.f36266g = (TextView) aVar.internalFindViewById(R.id.tvBtnInstall);
        this.f36267h = (TextView) aVar.internalFindViewById(R.id.tvInstallCount);
        View internalFindViewById = aVar.internalFindViewById(R.id.back_image);
        if (internalFindViewById != null) {
            internalFindViewById.setOnClickListener(new a());
        }
        afterviews();
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.f36289u.put(cls, t4);
    }

    @Override // com.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i4) {
        super.setContentView(i4);
        this.f36288t.a(this);
    }

    @Override // android.app.Activity
    public void setIntent(Intent intent) {
        super.setIntent(intent);
        injectExtras_();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.OnlineGameInstallCheckActivity
    public void showToast(String str) {
        org.androidannotations.api.b.e("", new b(str), 0L);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        this.f36288t.a(this);
    }

    @Override // com.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        super.setContentView(view);
        this.f36288t.a(this);
    }
}
