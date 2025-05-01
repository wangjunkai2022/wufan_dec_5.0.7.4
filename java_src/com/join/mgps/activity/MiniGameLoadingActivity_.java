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
public final class MiniGameLoadingActivity_ extends MiniGameLoadingActivity implements y3.a, a4.a, a4.b {
    public static final String L = "gameId";
    public static final String M = "isLaunchApp";
    private final a4.c J = new a4.c();
    private final Map<Class<?>, Object> K = new HashMap();

    /* loaded from: classes4.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MiniGameLoadingActivity_.this.x0();
        }
    }

    /* loaded from: classes4.dex */
    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MiniGameLoadingActivity_.this.back();
        }
    }

    /* loaded from: classes4.dex */
    class c implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f35156b;

        c(int i4) {
            this.f35156b = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            MiniGameLoadingActivity_.super.R0(this.f35156b);
        }
    }

    /* loaded from: classes4.dex */
    public static class d extends org.androidannotations.api.builder.a<d> {

        /* renamed from: a  reason: collision with root package name */
        private Fragment f35158a;

        public d(Context context) {
            super(context, MiniGameLoadingActivity_.class);
        }

        public d a(String str) {
            return (d) super.extra("gameId", str);
        }

        public d b(boolean z4) {
            return (d) super.extra("isLaunchApp", z4);
        }

        @Override // org.androidannotations.api.builder.a, org.androidannotations.api.builder.b
        public org.androidannotations.api.builder.f startForResult(int i4) {
            Fragment fragment = this.f35158a;
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
            super(fragment.getActivity(), MiniGameLoadingActivity_.class);
            this.f35158a = fragment;
        }
    }

    public static d T0(Context context) {
        return new d(context);
    }

    public static d U0(Fragment fragment) {
        return new d(fragment);
    }

    private void init_(Bundle bundle) {
        a4.c.b(this);
        injectExtras_();
    }

    private void injectExtras_() {
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            if (extras.containsKey("gameId")) {
                this.f35113c = extras.getString("gameId");
            }
            if (extras.containsKey("isLaunchApp")) {
                this.B = extras.getBoolean("isLaunchApp");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MiniGameLoadingActivity
    public void R0(int i4) {
        org.androidannotations.api.b.e("", new c(i4), 0L);
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.K.get(cls);
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        return (T) findViewById(i4);
    }

    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.J);
        init_(bundle);
        super.onCreate(bundle);
        a4.c.c(c5);
        setContentView(R.layout.activity_mini_game_loading);
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f35112b = aVar.internalFindViewById(R.id.statubar);
        this.f35114d = (SimpleDraweeView) aVar.internalFindViewById(R.id.sdv_image);
        this.f35115e = (TextView) aVar.internalFindViewById(R.id.tv_name);
        this.f35116f = (TextView) aVar.internalFindViewById(R.id.tv_loading_progress);
        this.f35117g = (TextView) aVar.internalFindViewById(R.id.tv_speed);
        this.f35118h = (TextView) aVar.internalFindViewById(R.id.tv_cancel);
        this.f35119i = (PictureHProgress) aVar.internalFindViewById(R.id.pb_progress);
        this.f35120j = (LinearLayout) aVar.internalFindViewById(R.id.ll_back);
        TextView textView = this.f35118h;
        if (textView != null) {
            textView.setOnClickListener(new a());
        }
        LinearLayout linearLayout = this.f35120j;
        if (linearLayout != null) {
            linearLayout.setOnClickListener(new b());
        }
        afterViews();
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.K.put(cls, t4);
    }

    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i4) {
        super.setContentView(i4);
        this.J.a(this);
    }

    @Override // android.app.Activity
    public void setIntent(Intent intent) {
        super.setIntent(intent);
        injectExtras_();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        this.J.a(this);
    }

    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        super.setContentView(view);
        this.J.a(this);
    }
}
