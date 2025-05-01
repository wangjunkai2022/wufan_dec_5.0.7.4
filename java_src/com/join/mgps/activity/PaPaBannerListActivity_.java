package com.join.mgps.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
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
public final class PaPaBannerListActivity_ extends PaPaBannerListActivity implements y3.a, a4.a, a4.b {

    /* renamed from: q  reason: collision with root package name */
    public static final String f36348q = "type";

    /* renamed from: r  reason: collision with root package name */
    public static final String f36349r = "titleName";

    /* renamed from: s  reason: collision with root package name */
    public static final String f36350s = "enableSearchDownload";

    /* renamed from: t  reason: collision with root package name */
    public static final String f36351t = "params";

    /* renamed from: u  reason: collision with root package name */
    public static final String f36352u = "isSingle";

    /* renamed from: o  reason: collision with root package name */
    private final a4.c f36353o = new a4.c();

    /* renamed from: p  reason: collision with root package name */
    private final Map<Class<?>, Object> f36354p = new HashMap();

    /* loaded from: classes4.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            PaPaBannerListActivity_.this.back_image();
        }
    }

    /* loaded from: classes4.dex */
    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            PaPaBannerListActivity_.this.h0();
        }
    }

    /* loaded from: classes4.dex */
    class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            PaPaBannerListActivity_.this.g0();
        }
    }

    /* loaded from: classes4.dex */
    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            PaPaBannerListActivity_.super.updateDownloadView();
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
                PaPaBannerListActivity_.super.getDownloadTaskInfo();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    public static class f extends org.androidannotations.api.builder.a<f> {

        /* renamed from: a  reason: collision with root package name */
        private Fragment f36360a;

        public f(Context context) {
            super(context, PaPaBannerListActivity_.class);
        }

        public f a(boolean z4) {
            return (f) super.extra(PaPaBannerListActivity_.f36350s, z4);
        }

        public f b(boolean z4) {
            return (f) super.extra("isSingle", z4);
        }

        public f c(String str) {
            return (f) super.extra("params", str);
        }

        public f d(String str) {
            return (f) super.extra(PaPaBannerListActivity_.f36349r, str);
        }

        public f e(int i4) {
            return (f) super.extra("type", i4);
        }

        @Override // org.androidannotations.api.builder.a, org.androidannotations.api.builder.b
        public org.androidannotations.api.builder.f startForResult(int i4) {
            Fragment fragment = this.f36360a;
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
            super(fragment.getActivity(), PaPaBannerListActivity_.class);
            this.f36360a = fragment;
        }
    }

    private void init_(Bundle bundle) {
        a4.c.b(this);
        injectExtras_();
    }

    private void injectExtras_() {
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            if (extras.containsKey("type")) {
                this.f36336b = extras.getInt("type");
            }
            if (extras.containsKey(f36349r)) {
                this.f36337c = extras.getString(f36349r);
            }
            if (extras.containsKey(f36350s)) {
                this.f36338d = extras.getBoolean(f36350s);
            }
            if (extras.containsKey("params")) {
                this.f36339e = extras.getString("params");
            }
            if (extras.containsKey("isSingle")) {
                this.f36340f = extras.getBoolean("isSingle");
            }
        }
    }

    public static f k0(Context context) {
        return new f(context);
    }

    public static f l0(Fragment fragment) {
        return new f(fragment);
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.f36354p.get(cls);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.PaPaBannerListActivity
    public void getDownloadTaskInfo() {
        org.androidannotations.api.a.l(new e("", 0L, ""));
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        return (T) findViewById(i4);
    }

    @Override // com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.f36353o);
        init_(bundle);
        super.onCreate(bundle);
        a4.c.c(c5);
        setContentView(R.layout.activity_papa_banner_list);
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f36341g = (TextView) aVar.internalFindViewById(R.id.title_textview);
        this.f36342h = (ImageView) aVar.internalFindViewById(R.id.title_normal_search_img);
        this.f36343i = (CustomerDownloadView) aVar.internalFindViewById(R.id.title_normal_download_cdv);
        View internalFindViewById = aVar.internalFindViewById(R.id.back_image);
        if (internalFindViewById != null) {
            internalFindViewById.setOnClickListener(new a());
        }
        ImageView imageView = this.f36342h;
        if (imageView != null) {
            imageView.setOnClickListener(new b());
        }
        CustomerDownloadView customerDownloadView = this.f36343i;
        if (customerDownloadView != null) {
            customerDownloadView.setOnClickListener(new c());
        }
        afterViews();
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.f36354p.put(cls, t4);
    }

    @Override // com.BaseFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i4) {
        super.setContentView(i4);
        this.f36353o.a(this);
    }

    @Override // android.app.Activity
    public void setIntent(Intent intent) {
        super.setIntent(intent);
        injectExtras_();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.PaPaBannerListActivity
    public void updateDownloadView() {
        org.androidannotations.api.b.e("", new d(), 0L);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        this.f36353o.a(this);
    }

    @Override // com.BaseFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        super.setContentView(view);
        this.f36353o.a(this);
    }
}
