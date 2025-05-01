package com.join.mgps.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.Fragment;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.CustomerDownloadView;
import java.util.HashMap;
import java.util.Map;
import org.androidannotations.api.a;
/* loaded from: classes4.dex */
public final class ClassifyAndRankActivity_ extends ClassifyAndRankActivity implements y3.a, a4.a, a4.b {

    /* renamed from: m  reason: collision with root package name */
    public static final String f28638m = "intentFrom";

    /* renamed from: n  reason: collision with root package name */
    public static final String f28639n = "currentIndex";

    /* renamed from: o  reason: collision with root package name */
    public static final String f28640o = "isFormNewRank";

    /* renamed from: k  reason: collision with root package name */
    private final a4.c f28641k = new a4.c();

    /* renamed from: l  reason: collision with root package name */
    private final Map<Class<?>, Object> f28642l = new HashMap();

    /* loaded from: classes4.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ClassifyAndRankActivity_.this.g0();
        }
    }

    /* loaded from: classes4.dex */
    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ClassifyAndRankActivity_.this.f0();
        }
    }

    /* loaded from: classes4.dex */
    class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ClassifyAndRankActivity_.this.back_image();
        }
    }

    /* loaded from: classes4.dex */
    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ClassifyAndRankActivity_.super.updateDownloadView();
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
                ClassifyAndRankActivity_.super.getDownloadTaskInfo();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    public static class f extends org.androidannotations.api.builder.a<f> {

        /* renamed from: a  reason: collision with root package name */
        private Fragment f28648a;

        public f(Context context) {
            super(context, ClassifyAndRankActivity_.class);
        }

        public f a(int i4) {
            return (f) super.extra(ClassifyAndRankActivity_.f28639n, i4);
        }

        public f b(int i4) {
            return (f) super.extra("intentFrom", i4);
        }

        public f c(boolean z4) {
            return (f) super.extra(ClassifyAndRankActivity_.f28640o, z4);
        }

        @Override // org.androidannotations.api.builder.a, org.androidannotations.api.builder.b
        public org.androidannotations.api.builder.f startForResult(int i4) {
            Fragment fragment = this.f28648a;
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
            super(fragment.getActivity(), ClassifyAndRankActivity_.class);
            this.f28648a = fragment;
        }
    }

    private void init_(Bundle bundle) {
        a4.c.b(this);
        injectExtras_();
    }

    private void injectExtras_() {
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            if (extras.containsKey("intentFrom")) {
                this.f28629b = extras.getInt("intentFrom");
            }
            if (extras.containsKey(f28639n)) {
                this.f28630c = extras.getInt(f28639n);
            }
            if (extras.containsKey(f28640o)) {
                this.f28631d = extras.getBoolean(f28640o);
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
        return (T) this.f28642l.get(cls);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ClassifyAndRankActivity
    public void getDownloadTaskInfo() {
        org.androidannotations.api.a.l(new e("", 0L, ""));
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        return (T) findViewById(i4);
    }

    @Override // com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.f28641k);
        init_(bundle);
        super.onCreate(bundle);
        a4.c.c(c5);
        setContentView(R.layout.classify_and_rank_activity_layout);
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f28632e = (RelativeLayout) aVar.internalFindViewById(R.id.fragment);
        this.f28633f = (TextView) aVar.internalFindViewById(R.id.title_textview);
        this.f28634g = (ImageView) aVar.internalFindViewById(R.id.title_normal_search_img);
        this.f28635h = (CustomerDownloadView) aVar.internalFindViewById(R.id.title_normal_download_cdv);
        View internalFindViewById = aVar.internalFindViewById(R.id.back_image);
        ImageView imageView = this.f28634g;
        if (imageView != null) {
            imageView.setOnClickListener(new a());
        }
        CustomerDownloadView customerDownloadView = this.f28635h;
        if (customerDownloadView != null) {
            customerDownloadView.setOnClickListener(new b());
        }
        if (internalFindViewById != null) {
            internalFindViewById.setOnClickListener(new c());
        }
        afterviews();
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.f28642l.put(cls, t4);
    }

    @Override // com.BaseFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i4) {
        super.setContentView(i4);
        this.f28641k.a(this);
    }

    @Override // android.app.Activity
    public void setIntent(Intent intent) {
        super.setIntent(intent);
        injectExtras_();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ClassifyAndRankActivity
    public void updateDownloadView() {
        org.androidannotations.api.b.e("", new d(), 0L);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        this.f28641k.a(this);
    }

    @Override // com.BaseFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        super.setContentView(view);
        this.f28641k.a(this);
    }
}
