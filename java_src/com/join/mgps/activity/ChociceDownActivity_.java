package com.join.mgps.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.Fragment;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.dto.GameDownInfo;
import com.join.mgps.dto.UpdateIntentDataBean;
import java.util.HashMap;
import java.util.Map;
import org.androidannotations.api.a;
/* loaded from: classes4.dex */
public final class ChociceDownActivity_ extends ChociceDownActivity implements y3.a, a4.a, a4.b {

    /* renamed from: w  reason: collision with root package name */
    public static final String f28613w = "downloadTask";

    /* renamed from: x  reason: collision with root package name */
    public static final String f28614x = "updateIntentDataBean";

    /* renamed from: y  reason: collision with root package name */
    public static final String f28615y = "from";

    /* renamed from: u  reason: collision with root package name */
    private final a4.c f28616u = new a4.c();

    /* renamed from: v  reason: collision with root package name */
    private final Map<Class<?>, Object> f28617v = new HashMap();

    /* loaded from: classes4.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ChociceDownActivity_.this.g0();
        }
    }

    /* loaded from: classes4.dex */
    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ChociceDownActivity_.this.h0();
        }
    }

    /* loaded from: classes4.dex */
    class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ChociceDownActivity_.this.relodingimag();
        }
    }

    /* loaded from: classes4.dex */
    class d implements View.OnClickListener {
        d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ChociceDownActivity_.this.i0();
        }
    }

    /* loaded from: classes4.dex */
    class e implements View.OnClickListener {
        e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ChociceDownActivity_.this.j0();
        }
    }

    /* loaded from: classes4.dex */
    class f implements Runnable {
        f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ChociceDownActivity_.super.showLoding();
        }
    }

    /* loaded from: classes4.dex */
    class g implements Runnable {
        g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ChociceDownActivity_.super.showLodingFailed();
        }
    }

    /* loaded from: classes4.dex */
    class h implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ GameDownInfo f28625b;

        h(GameDownInfo gameDownInfo) {
            this.f28625b = gameDownInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            ChociceDownActivity_.super.k0(this.f28625b);
        }
    }

    /* loaded from: classes4.dex */
    class i extends a.c {
        i(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                ChociceDownActivity_.super.getData();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    public static class j extends org.androidannotations.api.builder.a<j> {

        /* renamed from: a  reason: collision with root package name */
        private Fragment f28628a;

        public j(Context context) {
            super(context, ChociceDownActivity_.class);
        }

        public j a(DownloadTask downloadTask) {
            return (j) super.extra("downloadTask", downloadTask);
        }

        public j b(int i4) {
            return (j) super.extra("from", i4);
        }

        public j c(UpdateIntentDataBean updateIntentDataBean) {
            return (j) super.extra("updateIntentDataBean", updateIntentDataBean);
        }

        @Override // org.androidannotations.api.builder.a, org.androidannotations.api.builder.b
        public org.androidannotations.api.builder.f startForResult(int i4) {
            Fragment fragment = this.f28628a;
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

        public j(Fragment fragment) {
            super(fragment.getActivity(), ChociceDownActivity_.class);
            this.f28628a = fragment;
        }
    }

    private void init_(Bundle bundle) {
        a4.c.b(this);
        injectExtras_();
    }

    private void injectExtras_() {
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            if (extras.containsKey("downloadTask")) {
                this.f28595l = (DownloadTask) extras.getSerializable("downloadTask");
            }
            if (extras.containsKey("updateIntentDataBean")) {
                this.f28596m = (UpdateIntentDataBean) extras.getSerializable("updateIntentDataBean");
            }
            if (extras.containsKey("from")) {
                this.f28597n = extras.getInt("from");
            }
        }
    }

    public static j q0(Context context) {
        return new j(context);
    }

    public static j r0(Fragment fragment) {
        return new j(fragment);
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.f28617v.get(cls);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ChociceDownActivity
    public void getData() {
        org.androidannotations.api.a.l(new i("", 0L, ""));
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        return (T) findViewById(i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ChociceDownActivity
    public void k0(GameDownInfo gameDownInfo) {
        org.androidannotations.api.b.e("", new h(gameDownInfo), 0L);
    }

    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.f28616u);
        init_(bundle);
        super.onCreate(bundle);
        a4.c.c(c5);
        setContentView(R.layout.choice_down_activity);
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f28585b = (TextView) aVar.internalFindViewById(R.id.title);
        this.f28586c = (TextView) aVar.internalFindViewById(R.id.describ);
        this.f28587d = (ImageView) aVar.internalFindViewById(R.id.closeImage);
        this.f28588e = (TextView) aVar.internalFindViewById(R.id.downFrom1);
        this.f28589f = (TextView) aVar.internalFindViewById(R.id.downFrom2);
        this.f28590g = (TextView) aVar.internalFindViewById(R.id.downFrom11);
        this.f28591h = (TextView) aVar.internalFindViewById(R.id.downFrom21);
        this.f28592i = (TextView) aVar.internalFindViewById(R.id.downFrom3);
        this.f28593j = (RelativeLayout) aVar.internalFindViewById(R.id.main);
        this.f28599p = (LinearLayout) aVar.internalFindViewById(R.id.loding_layout);
        this.f28600q = (LinearLayout) aVar.internalFindViewById(R.id.loding_faile);
        this.f28601r = (ImageView) aVar.internalFindViewById(R.id.relodingimag);
        this.f28602s = (RelativeLayout) aVar.internalFindViewById(R.id.mPtrFrame);
        this.f28603t = (RelativeLayout) aVar.internalFindViewById(R.id.layoutq);
        View internalFindViewById = aVar.internalFindViewById(R.id.closeImage1);
        ImageView imageView = this.f28587d;
        if (imageView != null) {
            imageView.setOnClickListener(new a());
        }
        if (internalFindViewById != null) {
            internalFindViewById.setOnClickListener(new b());
        }
        ImageView imageView2 = this.f28601r;
        if (imageView2 != null) {
            imageView2.setOnClickListener(new c());
        }
        TextView textView = this.f28590g;
        if (textView != null) {
            textView.setOnClickListener(new d());
        }
        TextView textView2 = this.f28591h;
        if (textView2 != null) {
            textView2.setOnClickListener(new e());
        }
        afterviews();
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.f28617v.put(cls, t4);
    }

    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i4) {
        super.setContentView(i4);
        this.f28616u.a(this);
    }

    @Override // android.app.Activity
    public void setIntent(Intent intent) {
        super.setIntent(intent);
        injectExtras_();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ChociceDownActivity
    public void showLoding() {
        org.androidannotations.api.b.e("", new f(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ChociceDownActivity
    public void showLodingFailed() {
        org.androidannotations.api.b.e("", new g(), 0L);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        this.f28616u.a(this);
    }

    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        super.setContentView(view);
        this.f28616u.a(this);
    }
}
