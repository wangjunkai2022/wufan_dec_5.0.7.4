package com.join.mgps.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.Fragment;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.dto.EndGameBean;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes4.dex */
public final class EndGameLaunchActivity_ extends EndGameLaunchActivity implements y3.a, a4.a, a4.b {

    /* renamed from: u  reason: collision with root package name */
    public static final String f30205u = "gameId";

    /* renamed from: v  reason: collision with root package name */
    public static final String f30206v = "endgameInfo";

    /* renamed from: w  reason: collision with root package name */
    public static final String f30207w = "startMode";

    /* renamed from: x  reason: collision with root package name */
    public static final String f30208x = "playBackUrl";

    /* renamed from: s  reason: collision with root package name */
    private final a4.c f30209s = new a4.c();

    /* renamed from: t  reason: collision with root package name */
    private final Map<Class<?>, Object> f30210t = new HashMap();

    /* loaded from: classes4.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            EndGameLaunchActivity_.super.z0();
        }
    }

    /* loaded from: classes4.dex */
    class b implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f30212b;

        b(String str) {
            this.f30212b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            EndGameLaunchActivity_.super.A0(this.f30212b);
        }
    }

    /* loaded from: classes4.dex */
    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            EndGameLaunchActivity_.super.y0();
        }
    }

    /* loaded from: classes4.dex */
    class d implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f30215b;

        d(int i4) {
            this.f30215b = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            EndGameLaunchActivity_.super.w0(this.f30215b);
        }
    }

    /* loaded from: classes4.dex */
    class e implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f30217b;

        e(String str) {
            this.f30217b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            EndGameLaunchActivity_.super.showTost(this.f30217b);
        }
    }

    /* loaded from: classes4.dex */
    public static class f extends org.androidannotations.api.builder.a<f> {

        /* renamed from: a  reason: collision with root package name */
        private Fragment f30219a;

        public f(Context context) {
            super(context, EndGameLaunchActivity_.class);
        }

        public f a(EndGameBean endGameBean) {
            return (f) super.extra(EndGameLaunchActivity_.f30206v, endGameBean);
        }

        public f b(String str) {
            return (f) super.extra("gameId", str);
        }

        public f c(String str) {
            return (f) super.extra(EndGameLaunchActivity_.f30208x, str);
        }

        public f d(int i4) {
            return (f) super.extra("startMode", i4);
        }

        @Override // org.androidannotations.api.builder.a, org.androidannotations.api.builder.b
        public org.androidannotations.api.builder.f startForResult(int i4) {
            Fragment fragment = this.f30219a;
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

        public f(Fragment fragment) {
            super(fragment.getActivity(), EndGameLaunchActivity_.class);
            this.f30219a = fragment;
        }
    }

    public static f G0(Context context) {
        return new f(context);
    }

    public static f H0(Fragment fragment) {
        return new f(fragment);
    }

    private void init_(Bundle bundle) {
        a4.c.b(this);
        injectExtras_();
    }

    private void injectExtras_() {
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            if (extras.containsKey("gameId")) {
                this.f30184e = extras.getString("gameId");
            }
            if (extras.containsKey(f30206v)) {
                this.f30185f = (EndGameBean) extras.getSerializable(f30206v);
            }
            if (extras.containsKey("startMode")) {
                this.f30186g = extras.getInt("startMode");
            }
            if (extras.containsKey(f30208x)) {
                this.f30187h = extras.getString(f30208x);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.EndGameLaunchActivity
    public void A0(String str) {
        org.androidannotations.api.b.e("", new b(str), 0L);
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.f30210t.get(cls);
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        return (T) findViewById(i4);
    }

    @Override // com.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.f30209s);
        init_(bundle);
        super.onCreate(bundle);
        a4.c.c(c5);
        setContentView(R.layout.activity_end_game_launch);
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f30181b = (SimpleDraweeView) aVar.internalFindViewById(R.id.ivGameIcon);
        this.f30182c = (FrameLayout) aVar.internalFindViewById(R.id.progress);
        this.f30183d = (TextView) aVar.internalFindViewById(R.id.tvLoading);
        afterviews();
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.f30210t.put(cls, t4);
    }

    @Override // com.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i4) {
        super.setContentView(i4);
        this.f30209s.a(this);
    }

    @Override // android.app.Activity
    public void setIntent(Intent intent) {
        super.setIntent(intent);
        injectExtras_();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.EndGameLaunchActivity
    public void showTost(String str) {
        org.androidannotations.api.b.e("", new e(str), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.EndGameLaunchActivity
    public void w0(int i4) {
        org.androidannotations.api.b.e("", new d(i4), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.EndGameLaunchActivity
    public void y0() {
        org.androidannotations.api.b.e("", new c(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.EndGameLaunchActivity
    public void z0() {
        org.androidannotations.api.b.e("", new a(), 0L);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        this.f30209s.a(this);
    }

    @Override // com.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        super.setContentView(view);
        this.f30209s.a(this);
    }
}
