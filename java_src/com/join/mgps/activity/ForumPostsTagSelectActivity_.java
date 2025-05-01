package com.join.mgps.activity;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.Fragment;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.ForumLoadingView;
import com.join.mgps.customview.XListView2;
import com.join.mgps.dto.CollectionBeanSub;
import com.join.mgps.dto.RecommendLabelTag;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.androidannotations.api.a;
/* loaded from: classes4.dex */
public final class ForumPostsTagSelectActivity_ extends ForumPostsTagSelectActivity implements y3.a, a4.a, a4.b {

    /* renamed from: x  reason: collision with root package name */
    public static final String f30894x = "action";

    /* renamed from: y  reason: collision with root package name */
    public static final String f30895y = "post_type";

    /* renamed from: z  reason: collision with root package name */
    public static final String f30896z = "pid";

    /* renamed from: t  reason: collision with root package name */
    private final a4.c f30897t = new a4.c();

    /* renamed from: u  reason: collision with root package name */
    private final Map<Class<?>, Object> f30898u = new HashMap();

    /* renamed from: v  reason: collision with root package name */
    private final IntentFilter f30899v = new IntentFilter();

    /* renamed from: w  reason: collision with root package name */
    private final BroadcastReceiver f30900w = new a();

    /* loaded from: classes4.dex */
    class a extends BroadcastReceiver {

        /* renamed from: b  reason: collision with root package name */
        public static final String f30901b = "gameData";

        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            ForumPostsTagSelectActivity_.this.l0((CollectionBeanSub) (intent.getExtras() != null ? intent.getExtras() : new Bundle()).getSerializable("gameData"));
        }
    }

    /* loaded from: classes4.dex */
    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ForumPostsTagSelectActivity_.this.m0();
        }
    }

    /* loaded from: classes4.dex */
    class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ForumPostsTagSelectActivity_.this.back_image();
        }
    }

    /* loaded from: classes4.dex */
    class d implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f30905b;

        d(List list) {
            this.f30905b = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            ForumPostsTagSelectActivity_.super.q0(this.f30905b);
        }
    }

    /* loaded from: classes4.dex */
    class e implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f30907b;

        e(String str) {
            this.f30907b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            ForumPostsTagSelectActivity_.super.f0(this.f30907b);
        }
    }

    /* loaded from: classes4.dex */
    class f implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f30909b;

        f(int i4) {
            this.f30909b = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            ForumPostsTagSelectActivity_.super.g0(this.f30909b);
        }
    }

    /* loaded from: classes4.dex */
    class g extends a.c {
        g(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                ForumPostsTagSelectActivity_.super.o0();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class h extends a.c {
        h(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                ForumPostsTagSelectActivity_.super.p0();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    public static class i extends org.androidannotations.api.builder.a<i> {

        /* renamed from: a  reason: collision with root package name */
        private Fragment f30913a;

        public i(Context context) {
            super(context, ForumPostsTagSelectActivity_.class);
        }

        public i a(int i4) {
            return (i) super.extra("action", i4);
        }

        public i b(int i4) {
            return (i) super.extra(ForumPostsTagSelectActivity_.f30896z, i4);
        }

        public i c(int i4) {
            return (i) super.extra(ForumPostsTagSelectActivity_.f30895y, i4);
        }

        @Override // org.androidannotations.api.builder.a, org.androidannotations.api.builder.b
        public org.androidannotations.api.builder.f startForResult(int i4) {
            Fragment fragment = this.f30913a;
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

        public i(Fragment fragment) {
            super(fragment.getActivity(), ForumPostsTagSelectActivity_.class);
            this.f30913a = fragment;
        }
    }

    private void init_(Bundle bundle) {
        a4.c.b(this);
        injectExtras_();
        this.f30899v.addAction(o1.a.I);
        this.f30899v.addAction(o1.a.G);
        registerReceiver(this.f30900w, this.f30899v);
    }

    private void injectExtras_() {
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            if (extras.containsKey("action")) {
                this.f30882m = extras.getInt("action");
            }
            if (extras.containsKey(f30895y)) {
                this.f30883n = extras.getInt(f30895y);
            }
            if (extras.containsKey(f30896z)) {
                this.f30884o = extras.getInt(f30896z);
            }
        }
    }

    public static i w0(Context context) {
        return new i(context);
    }

    public static i x0(Fragment fragment) {
        return new i(fragment);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ForumPostsTagSelectActivity
    public void f0(String str) {
        org.androidannotations.api.b.e("", new e(str), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ForumPostsTagSelectActivity
    public void g0(int i4) {
        org.androidannotations.api.b.e("", new f(i4), 0L);
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.f30898u.get(cls);
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        return (T) findViewById(i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ForumPostsTagSelectActivity
    public void o0() {
        org.androidannotations.api.a.l(new g("", 0L, ""));
    }

    @Override // com.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.f30897t);
        init_(bundle);
        super.onCreate(bundle);
        a4.c.c(c5);
        setContentView(R.layout.activity_forum_posts_tag_select);
    }

    @Override // com.join.mgps.activity.ForumPostsTagSelectActivity, com.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        unregisterReceiver(this.f30900w);
        super.onDestroy();
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f30871b = (RelativeLayout) aVar.internalFindViewById(R.id.actionbarLayout);
        this.f30872c = (ImageView) aVar.internalFindViewById(R.id.back_image);
        this.f30873d = (TextView) aVar.internalFindViewById(R.id.layout_title);
        this.f30874e = (XListView2) aVar.internalFindViewById(R.id.listView);
        this.f30875f = (ForumLoadingView) aVar.internalFindViewById(R.id.loadingView);
        Button button = (Button) aVar.internalFindViewById(R.id.release);
        this.f30876g = button;
        if (button != null) {
            button.setOnClickListener(new b());
        }
        ImageView imageView = this.f30872c;
        if (imageView != null) {
            imageView.setOnClickListener(new c());
        }
        afterViews();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ForumPostsTagSelectActivity
    public void p0() {
        org.androidannotations.api.a.l(new h("", 0L, ""));
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.f30898u.put(cls, t4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ForumPostsTagSelectActivity
    public void q0(List<RecommendLabelTag> list) {
        org.androidannotations.api.b.e("", new d(list), 0L);
    }

    @Override // com.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i4) {
        super.setContentView(i4);
        this.f30897t.a(this);
    }

    @Override // android.app.Activity
    public void setIntent(Intent intent) {
        super.setIntent(intent);
        injectExtras_();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        this.f30897t.a(this);
    }

    @Override // com.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        super.setContentView(view);
        this.f30897t.a(this);
    }
}
