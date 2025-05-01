package com.join.mgps.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.dto.HavenForumListbean;
import com.join.mgps.pref.PrefDef_;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.androidannotations.api.a;
/* loaded from: classes4.dex */
public final class HavenDownActivity_ extends HavenDownActivity implements y3.a, a4.a, a4.b {

    /* renamed from: w  reason: collision with root package name */
    public static final String f33917w = "downloadTask";

    /* renamed from: u  reason: collision with root package name */
    private final a4.c f33918u = new a4.c();

    /* renamed from: v  reason: collision with root package name */
    private final Map<Class<?>, Object> f33919v = new HashMap();

    /* loaded from: classes4.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            HavenDownActivity_.this.h0();
        }
    }

    /* loaded from: classes4.dex */
    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            HavenDownActivity_.this.f0();
        }
    }

    /* loaded from: classes4.dex */
    class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            HavenDownActivity_.this.i0();
        }
    }

    /* loaded from: classes4.dex */
    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            HavenDownActivity_.super.showLoding();
        }
    }

    /* loaded from: classes4.dex */
    class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            HavenDownActivity_.super.j0();
        }
    }

    /* loaded from: classes4.dex */
    class f implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f33925b;

        f(List list) {
            this.f33925b = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            HavenDownActivity_.super.updateUi(this.f33925b);
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
                HavenDownActivity_.super.g0();
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
                HavenDownActivity_.super.loadData();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    public static class i extends org.androidannotations.api.builder.a<i> {

        /* renamed from: a  reason: collision with root package name */
        private Fragment f33929a;

        public i(Context context) {
            super(context, HavenDownActivity_.class);
        }

        public i a(DownloadTask downloadTask) {
            return (i) super.extra("downloadTask", downloadTask);
        }

        @Override // org.androidannotations.api.builder.a, org.androidannotations.api.builder.b
        public org.androidannotations.api.builder.f startForResult(int i4) {
            Fragment fragment = this.f33929a;
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
            super(fragment.getActivity(), HavenDownActivity_.class);
            this.f33929a = fragment;
        }
    }

    private void init_(Bundle bundle) {
        this.f33896l = new PrefDef_(this);
        a4.c.b(this);
        injectExtras_();
    }

    private void injectExtras_() {
        Bundle extras = getIntent().getExtras();
        if (extras == null || !extras.containsKey("downloadTask")) {
            return;
        }
        this.f33895k = (DownloadTask) extras.getSerializable("downloadTask");
    }

    public static i p0(Context context) {
        return new i(context);
    }

    public static i q0(Fragment fragment) {
        return new i(fragment);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.HavenDownActivity
    public void g0() {
        org.androidannotations.api.a.l(new g("", 0L, ""));
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.f33919v.get(cls);
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        return (T) findViewById(i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.HavenDownActivity
    public void j0() {
        org.androidannotations.api.b.e("", new e(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.HavenDownActivity
    public void loadData() {
        org.androidannotations.api.a.l(new h("", 0L, ""));
    }

    @Override // com.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.f33918u);
        init_(bundle);
        super.onCreate(bundle);
        a4.c.c(c5);
        setContentView(R.layout.activity_haven_down);
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f33886b = aVar.internalFindViewById(R.id.topLayout);
        this.f33887c = aVar.internalFindViewById(R.id.showView);
        this.f33888d = aVar.internalFindViewById(R.id.downFrom);
        this.f33889e = aVar.internalFindViewById(R.id.forumData);
        this.f33890f = aVar.internalFindViewById(R.id.layoutq);
        this.f33891g = aVar.internalFindViewById(R.id.goVow);
        this.f33892h = (TextView) aVar.internalFindViewById(R.id.downFromText);
        this.f33893i = (TextView) aVar.internalFindViewById(R.id.appName);
        this.f33894j = (RecyclerView) aVar.internalFindViewById(R.id.recycleView);
        View internalFindViewById = aVar.internalFindViewById(R.id.goforumTagList);
        View view = this.f33891g;
        if (view != null) {
            view.setOnClickListener(new a());
        }
        View view2 = this.f33888d;
        if (view2 != null) {
            view2.setOnClickListener(new b());
        }
        if (internalFindViewById != null) {
            internalFindViewById.setOnClickListener(new c());
        }
        afterviews();
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.f33919v.put(cls, t4);
    }

    @Override // com.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i4) {
        super.setContentView(i4);
        this.f33918u.a(this);
    }

    @Override // android.app.Activity
    public void setIntent(Intent intent) {
        super.setIntent(intent);
        injectExtras_();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.HavenDownActivity
    public void showLoding() {
        org.androidannotations.api.b.e("", new d(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.HavenDownActivity
    public void updateUi(List<HavenForumListbean> list) {
        org.androidannotations.api.b.e("", new f(list), 0L);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        this.f33918u.a(this);
    }

    @Override // com.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        super.setContentView(view);
        this.f33918u.a(this);
    }
}
