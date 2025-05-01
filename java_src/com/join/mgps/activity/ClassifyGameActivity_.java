package com.join.mgps.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.Fragment;
import com.google.android.material.appbar.AppBarLayout;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.CustomerDownloadView;
import com.join.mgps.customview.SlidingTabLayoutNoViewPager;
import com.join.mgps.customview.swiperefresh.SwipeRefresh;
import com.join.mgps.dto.ClassifyGameTagBean;
import java.util.HashMap;
import java.util.Map;
import org.androidannotations.api.a;
/* loaded from: classes4.dex */
public final class ClassifyGameActivity_ extends ClassifyGameActivity implements y3.a, a4.a, a4.b {
    public static final String P = "gameTypeId";
    public static final String Q = "romTypeId";
    public static final String R = "title";
    public static final String S = "topTitle";
    private final a4.c N = new a4.c();
    private final Map<Class<?>, Object> O = new HashMap();

    /* loaded from: classes4.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ClassifyGameActivity_.super.s0();
        }
    }

    /* loaded from: classes4.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ClassifyGameActivity_.super.updateDownloadView();
        }
    }

    /* loaded from: classes4.dex */
    class c extends a.c {
        c(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                ClassifyGameActivity_.super.loadData();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class d extends a.c {
        d(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                ClassifyGameActivity_.super.getDownloadTaskInfo();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class e implements View.OnClickListener {
        e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ClassifyGameActivity_.this.m0();
        }
    }

    /* loaded from: classes4.dex */
    class f implements View.OnClickListener {
        f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ClassifyGameActivity_.this.n0();
        }
    }

    /* loaded from: classes4.dex */
    class g implements View.OnClickListener {
        g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ClassifyGameActivity_.this.v0();
        }
    }

    /* loaded from: classes4.dex */
    class h implements View.OnClickListener {
        h() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ClassifyGameActivity_.this.u0();
        }
    }

    /* loaded from: classes4.dex */
    class i implements View.OnClickListener {
        i() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ClassifyGameActivity_.this.back_image();
        }
    }

    /* loaded from: classes4.dex */
    class j implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ SlidingTabLayoutNoViewPager f28691b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f28692c;

        j(SlidingTabLayoutNoViewPager slidingTabLayoutNoViewPager, int i4) {
            this.f28691b = slidingTabLayoutNoViewPager;
            this.f28692c = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            ClassifyGameActivity_.super.w0(this.f28691b, this.f28692c);
        }
    }

    /* loaded from: classes4.dex */
    class k implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ClassifyGameTagBean f28694b;

        k(ClassifyGameTagBean classifyGameTagBean) {
            this.f28694b = classifyGameTagBean;
        }

        @Override // java.lang.Runnable
        public void run() {
            ClassifyGameActivity_.super.p0(this.f28694b);
        }
    }

    /* loaded from: classes4.dex */
    class l implements Runnable {
        l() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ClassifyGameActivity_.super.h0();
        }
    }

    /* loaded from: classes4.dex */
    class m implements Runnable {
        m() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ClassifyGameActivity_.super.l0();
        }
    }

    /* loaded from: classes4.dex */
    public static class n extends org.androidannotations.api.builder.a<n> {

        /* renamed from: a  reason: collision with root package name */
        private Fragment f28698a;

        public n(Context context) {
            super(context, ClassifyGameActivity_.class);
        }

        public n a(int i4) {
            return (n) super.extra(ClassifyGameActivity_.P, i4);
        }

        public n b(int i4) {
            return (n) super.extra(ClassifyGameActivity_.Q, i4);
        }

        public n c(String str) {
            return (n) super.extra("title", str);
        }

        public n d(String str) {
            return (n) super.extra(ClassifyGameActivity_.S, str);
        }

        @Override // org.androidannotations.api.builder.a, org.androidannotations.api.builder.b
        public org.androidannotations.api.builder.f startForResult(int i4) {
            Fragment fragment = this.f28698a;
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

        public n(Fragment fragment) {
            super(fragment.getActivity(), ClassifyGameActivity_.class);
            this.f28698a = fragment;
        }
    }

    public static n F0(Context context) {
        return new n(context);
    }

    public static n G0(Fragment fragment) {
        return new n(fragment);
    }

    private void init_(Bundle bundle) {
        a4.c.b(this);
        injectExtras_();
    }

    private void injectExtras_() {
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            if (extras.containsKey(P)) {
                this.f28669v = extras.getInt(P);
            }
            if (extras.containsKey(Q)) {
                this.f28670w = extras.getInt(Q);
            }
            if (extras.containsKey("title")) {
                this.f28671x = extras.getString("title");
            }
            if (extras.containsKey(S)) {
                this.f28672y = extras.getString(S);
            }
        }
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.O.get(cls);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ClassifyGameActivity
    public void getDownloadTaskInfo() {
        org.androidannotations.api.a.l(new d("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ClassifyGameActivity
    public void h0() {
        org.androidannotations.api.b.e("", new l(), 0L);
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        return (T) findViewById(i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ClassifyGameActivity
    public void l0() {
        org.androidannotations.api.b.e("", new m(), 0L);
    }

    @Override // com.join.mgps.activity.ClassifyGameActivity
    public void loadData() {
        org.androidannotations.api.a.l(new c("", 0L, ""));
    }

    @Override // com.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.N);
        init_(bundle);
        super.onCreate(bundle);
        a4.c.c(c5);
        setContentView(R.layout.activity_classify_game);
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f28649b = (LinearLayout) aVar.internalFindViewById(R.id.loading_none);
        this.f28650c = (SwipeRefresh) aVar.internalFindViewById(R.id.refreshx);
        this.f28651d = (AppBarLayout) aVar.internalFindViewById(R.id.appbar);
        this.f28652e = (Toolbar) aVar.internalFindViewById(R.id.toolbar);
        this.f28653f = (SlidingTabLayoutNoViewPager) aVar.internalFindViewById(R.id.table1);
        this.f28654g = (SlidingTabLayoutNoViewPager) aVar.internalFindViewById(R.id.table2);
        this.f28655h = (SlidingTabLayoutNoViewPager) aVar.internalFindViewById(R.id.table3);
        this.f28656i = (CustomerDownloadView) aVar.internalFindViewById(R.id.title_normal_download_cdv);
        this.f28657j = (ImageView) aVar.internalFindViewById(R.id.title_normal_search_img);
        this.f28658k = (FrameLayout) aVar.internalFindViewById(R.id.mViewpagerV4);
        this.f28667t = (TextView) aVar.internalFindViewById(R.id.title_textview);
        this.f28668u = (TextView) aVar.internalFindViewById(R.id.selectedType);
        View internalFindViewById = aVar.internalFindViewById(R.id.setAll);
        View internalFindViewById2 = aVar.internalFindViewById(R.id.back_image);
        TextView textView = this.f28668u;
        if (textView != null) {
            textView.setOnClickListener(new e());
        }
        if (internalFindViewById != null) {
            internalFindViewById.setOnClickListener(new f());
        }
        ImageView imageView = this.f28657j;
        if (imageView != null) {
            imageView.setOnClickListener(new g());
        }
        CustomerDownloadView customerDownloadView = this.f28656i;
        if (customerDownloadView != null) {
            customerDownloadView.setOnClickListener(new h());
        }
        if (internalFindViewById2 != null) {
            internalFindViewById2.setOnClickListener(new i());
        }
        afterViews();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ClassifyGameActivity
    public void p0(ClassifyGameTagBean classifyGameTagBean) {
        org.androidannotations.api.b.e("", new k(classifyGameTagBean), 0L);
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.O.put(cls, t4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ClassifyGameActivity
    public void s0() {
        org.androidannotations.api.b.e("", new a(), 0L);
    }

    @Override // com.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i4) {
        super.setContentView(i4);
        this.N.a(this);
    }

    @Override // android.app.Activity
    public void setIntent(Intent intent) {
        super.setIntent(intent);
        injectExtras_();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ClassifyGameActivity
    public void updateDownloadView() {
        org.androidannotations.api.b.e("", new b(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ClassifyGameActivity
    public void w0(SlidingTabLayoutNoViewPager slidingTabLayoutNoViewPager, int i4) {
        org.androidannotations.api.b.e("", new j(slidingTabLayoutNoViewPager, i4), 500L);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        this.N.a(this);
    }

    @Override // com.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        super.setContentView(view);
        this.N.a(this);
    }
}
