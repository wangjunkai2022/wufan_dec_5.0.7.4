package com.join.mgps.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.Fragment;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.dto.HavenWishResultBean;
import java.util.HashMap;
import java.util.Map;
import org.androidannotations.api.a;
/* loaded from: classes4.dex */
public final class HavenWishActivity_ extends HavenWishActivity implements y3.a, a4.a, a4.b {

    /* renamed from: i  reason: collision with root package name */
    public static final String f33935i = "downloadTask";

    /* renamed from: g  reason: collision with root package name */
    private final a4.c f33936g = new a4.c();

    /* renamed from: h  reason: collision with root package name */
    private final Map<Class<?>, Object> f33937h = new HashMap();

    /* loaded from: classes4.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            HavenWishActivity_.this.back();
        }
    }

    /* loaded from: classes4.dex */
    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            HavenWishActivity_.this.f0();
        }
    }

    /* loaded from: classes4.dex */
    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            HavenWishActivity_.super.h0();
        }
    }

    /* loaded from: classes4.dex */
    class d implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ HavenWishResultBean f33941b;

        d(HavenWishResultBean havenWishResultBean) {
            this.f33941b = havenWishResultBean;
        }

        @Override // java.lang.Runnable
        public void run() {
            HavenWishActivity_.super.i0(this.f33941b);
        }
    }

    /* loaded from: classes4.dex */
    class e extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f33943b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(String str, long j4, String str2, String str3) {
            super(str, j4, str2);
            this.f33943b = str3;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                HavenWishActivity_.super.g0(this.f33943b);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    public static class f extends org.androidannotations.api.builder.a<f> {

        /* renamed from: a  reason: collision with root package name */
        private Fragment f33945a;

        public f(Context context) {
            super(context, HavenWishActivity_.class);
        }

        public f a(DownloadTask downloadTask) {
            return (f) super.extra("downloadTask", downloadTask);
        }

        @Override // org.androidannotations.api.builder.a, org.androidannotations.api.builder.b
        public org.androidannotations.api.builder.f startForResult(int i4) {
            Fragment fragment = this.f33945a;
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
            super(fragment.getActivity(), HavenWishActivity_.class);
            this.f33945a = fragment;
        }
    }

    private void init_(Bundle bundle) {
        a4.c.b(this);
        injectExtras_();
    }

    private void injectExtras_() {
        Bundle extras = getIntent().getExtras();
        if (extras == null || !extras.containsKey("downloadTask")) {
            return;
        }
        this.f33934f = (DownloadTask) extras.getSerializable("downloadTask");
    }

    public static f m0(Context context) {
        return new f(context);
    }

    public static f n0(Fragment fragment) {
        return new f(fragment);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.HavenWishActivity
    public void g0(String str) {
        org.androidannotations.api.a.l(new e("", 0L, "", str));
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.f33937h.get(cls);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.HavenWishActivity
    public void h0() {
        org.androidannotations.api.b.e("", new c(), 300L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.HavenWishActivity
    public void i0(HavenWishResultBean havenWishResultBean) {
        org.androidannotations.api.b.e("", new d(havenWishResultBean), 0L);
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        return (T) findViewById(i4);
    }

    @Override // com.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.f33936g);
        init_(bundle);
        super.onCreate(bundle);
        a4.c.c(c5);
        setContentView(R.layout.haven_wish_acitivity);
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f33930b = (ImageView) aVar.internalFindViewById(R.id.back);
        this.f33931c = (TextView) aVar.internalFindViewById(R.id.sennd);
        this.f33932d = (EditText) aVar.internalFindViewById(R.id.edittext);
        ImageView imageView = this.f33930b;
        if (imageView != null) {
            imageView.setOnClickListener(new a());
        }
        TextView textView = this.f33931c;
        if (textView != null) {
            textView.setOnClickListener(new b());
        }
        afterviews();
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.f33937h.put(cls, t4);
    }

    @Override // com.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i4) {
        super.setContentView(i4);
        this.f33936g.a(this);
    }

    @Override // android.app.Activity
    public void setIntent(Intent intent) {
        super.setIntent(intent);
        injectExtras_();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        this.f33936g.a(this);
    }

    @Override // com.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        super.setContentView(view);
        this.f33936g.a(this);
    }
}
