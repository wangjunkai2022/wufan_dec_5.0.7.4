package com.join.mgps.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.Fragment;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.CustomerDownloadView;
import java.util.HashMap;
import java.util.Map;
import org.androidannotations.api.a;
/* loaded from: classes4.dex */
public final class RankingHomeActivity_ extends RankingHomeActivity implements y3.a, a4.a, a4.b {

    /* renamed from: q  reason: collision with root package name */
    public static final String f37085q = "rankType";

    /* renamed from: r  reason: collision with root package name */
    public static final String f37086r = "title";

    /* renamed from: s  reason: collision with root package name */
    public static final String f37087s = "rankTag";

    /* renamed from: t  reason: collision with root package name */
    public static final String f37088t = "dimensionId";

    /* renamed from: o  reason: collision with root package name */
    private final a4.c f37089o = new a4.c();

    /* renamed from: p  reason: collision with root package name */
    private final Map<Class<?>, Object> f37090p = new HashMap();

    /* loaded from: classes4.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            RankingHomeActivity_.this.back_image();
        }
    }

    /* loaded from: classes4.dex */
    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            RankingHomeActivity_.this.g0();
        }
    }

    /* loaded from: classes4.dex */
    class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            RankingHomeActivity_.this.f0();
        }
    }

    /* loaded from: classes4.dex */
    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            RankingHomeActivity_.super.updateDownloadView();
        }
    }

    /* loaded from: classes4.dex */
    class e extends a.c {
        e(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                RankingHomeActivity_.super.getDownloadTaskInfo();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    public static class f extends org.androidannotations.api.builder.a<f> {

        /* renamed from: a  reason: collision with root package name */
        private Fragment f37096a;

        public f(Context context) {
            super(context, RankingHomeActivity_.class);
        }

        public f a(String str) {
            return (f) super.extra(RankingHomeActivity_.f37088t, str);
        }

        public f b(String str) {
            return (f) super.extra(RankingHomeActivity_.f37087s, str);
        }

        public f c(int i4) {
            return (f) super.extra(RankingHomeActivity_.f37085q, i4);
        }

        public f d(String str) {
            return (f) super.extra("title", str);
        }

        @Override // org.androidannotations.api.builder.a, org.androidannotations.api.builder.b
        public org.androidannotations.api.builder.f startForResult(int i4) {
            Fragment fragment = this.f37096a;
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
            super(fragment.getActivity(), RankingHomeActivity_.class);
            this.f37096a = fragment;
        }
    }

    private void init_(Bundle bundle) {
        a4.c.b(this);
        injectExtras_();
    }

    private void injectExtras_() {
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            if (extras.containsKey(f37085q)) {
                this.f37076e = extras.getInt(f37085q);
            }
            if (extras.containsKey("title")) {
                this.f37077f = extras.getString("title");
            }
            if (extras.containsKey(f37087s)) {
                this.f37078g = extras.getString(f37087s);
            }
            if (extras.containsKey(f37088t)) {
                this.f37079h = extras.getString(f37088t);
            }
        }
    }

    public static f j0(Context context) {
        return new f(context);
    }

    public static f k0(Fragment fragment) {
        return new f(fragment);
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.f37090p.get(cls);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.RankingHomeActivity
    public void getDownloadTaskInfo() {
        org.androidannotations.api.a.l(new e("", 0L, ""));
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        return (T) findViewById(i4);
    }

    @Override // com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.f37089o);
        init_(bundle);
        super.onCreate(bundle);
        a4.c.c(c5);
        setContentView(R.layout.rannking_home_activity);
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f37073b = (FrameLayout) aVar.internalFindViewById(R.id.fragment);
        this.f37074c = (TextView) aVar.internalFindViewById(R.id.title_textview);
        this.f37075d = (ImageView) aVar.internalFindViewById(R.id.back_image);
        this.f37080i = (ImageView) aVar.internalFindViewById(R.id.title_normal_search_img);
        this.f37081j = (CustomerDownloadView) aVar.internalFindViewById(R.id.title_normal_download_cdv);
        ImageView imageView = this.f37075d;
        if (imageView != null) {
            imageView.setOnClickListener(new a());
        }
        ImageView imageView2 = this.f37080i;
        if (imageView2 != null) {
            imageView2.setOnClickListener(new b());
        }
        CustomerDownloadView customerDownloadView = this.f37081j;
        if (customerDownloadView != null) {
            customerDownloadView.setOnClickListener(new c());
        }
        afterviews();
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.f37090p.put(cls, t4);
    }

    @Override // com.BaseFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i4) {
        super.setContentView(i4);
        this.f37089o.a(this);
    }

    @Override // android.app.Activity
    public void setIntent(Intent intent) {
        super.setIntent(intent);
        injectExtras_();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.RankingHomeActivity
    public void updateDownloadView() {
        org.androidannotations.api.b.e("", new d(), 0L);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        this.f37089o.a(this);
    }

    @Override // com.BaseFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        super.setContentView(view);
        this.f37089o.a(this);
    }
}
