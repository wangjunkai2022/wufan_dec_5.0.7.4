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
import com.flipboard.bottomsheet.BottomSheetLayout;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.LJWebView;
import com.join.mgps.pref.PrefDef_;
import java.util.HashMap;
import java.util.Map;
import org.androidannotations.api.a;
/* loaded from: classes4.dex */
public final class WebViewSearchActivity_ extends WebViewSearchActivity implements y3.a, a4.a, a4.b {
    public static final String Q = "url";
    public static final String R = "downloadTask";
    private final a4.c O = new a4.c();
    private final Map<Class<?>, Object> P = new HashMap();

    /* loaded from: classes4.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            WebViewSearchActivity_.super.E0();
        }
    }

    /* loaded from: classes4.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            WebViewSearchActivity_.super.p0();
        }
    }

    /* loaded from: classes4.dex */
    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            WebViewSearchActivity_.super.H0();
        }
    }

    /* loaded from: classes4.dex */
    class d implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f38451b;

        d(int i4) {
            this.f38451b = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            WebViewSearchActivity_.super.updateLine(this.f38451b);
        }
    }

    /* loaded from: classes4.dex */
    class e implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f38453b;

        e(int i4) {
            this.f38453b = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            WebViewSearchActivity_.super.updateDownloadingPoint(this.f38453b);
        }
    }

    /* loaded from: classes4.dex */
    class f implements Runnable {
        f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            WebViewSearchActivity_.super.updateNoOpenPoint();
        }
    }

    /* loaded from: classes4.dex */
    class g implements Runnable {
        g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            WebViewSearchActivity_.super.updateHidePoint();
        }
    }

    /* loaded from: classes4.dex */
    class h implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DownloadTask f38457b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f38458c;

        h(DownloadTask downloadTask, int i4) {
            this.f38457b = downloadTask;
            this.f38458c = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            WebViewSearchActivity_.super.receiveStart(this.f38457b, this.f38458c);
        }
    }

    /* loaded from: classes4.dex */
    class i implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DownloadTask f38460b;

        i(DownloadTask downloadTask) {
            this.f38460b = downloadTask;
        }

        @Override // java.lang.Runnable
        public void run() {
            WebViewSearchActivity_.super.receiveSuccess(this.f38460b);
        }
    }

    /* loaded from: classes4.dex */
    class j implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DownloadTask f38462b;

        j(DownloadTask downloadTask) {
            this.f38462b = downloadTask;
        }

        @Override // java.lang.Runnable
        public void run() {
            WebViewSearchActivity_.super.receiveDelete(this.f38462b);
        }
    }

    /* loaded from: classes4.dex */
    class k implements View.OnClickListener {
        k() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            WebViewSearchActivity_.this.C0();
        }
    }

    /* loaded from: classes4.dex */
    class l extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f38465b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(String str, long j4, String str2, String str3) {
            super(str, j4, str2);
            this.f38465b = str3;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                WebViewSearchActivity_.super.n0(this.f38465b);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class m extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f38467b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(String str, long j4, String str2, String str3) {
            super(str, j4, str2);
            this.f38467b = str3;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                WebViewSearchActivity_.super.m0(this.f38467b);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class n extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f38469b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(String str, long j4, String str2, String str3) {
            super(str, j4, str2);
            this.f38469b = str3;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                WebViewSearchActivity_.super.l0(this.f38469b);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class o extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f38471b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(String str, long j4, String str2, String str3) {
            super(str, j4, str2);
            this.f38471b = str3;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                WebViewSearchActivity_.super.o0(this.f38471b);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class p extends a.c {
        p(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                WebViewSearchActivity_.super.checkDownlodingNumber();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class q extends a.c {
        q(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                WebViewSearchActivity_.super.getdownloadTask();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class r implements View.OnClickListener {
        r() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            WebViewSearchActivity_.this.B0();
        }
    }

    /* loaded from: classes4.dex */
    class s implements View.OnClickListener {
        s() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            WebViewSearchActivity_.this.D0();
        }
    }

    /* loaded from: classes4.dex */
    class t implements View.OnClickListener {
        t() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            WebViewSearchActivity_.this.z0();
        }
    }

    /* loaded from: classes4.dex */
    class u implements View.OnClickListener {
        u() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            WebViewSearchActivity_.this.I0();
        }
    }

    /* loaded from: classes4.dex */
    class v implements View.OnClickListener {
        v() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            WebViewSearchActivity_.this.close();
        }
    }

    /* loaded from: classes4.dex */
    class w implements Runnable {
        w() {
        }

        @Override // java.lang.Runnable
        public void run() {
            WebViewSearchActivity_.super.showLoading();
        }
    }

    /* loaded from: classes4.dex */
    class x implements Runnable {
        x() {
        }

        @Override // java.lang.Runnable
        public void run() {
            WebViewSearchActivity_.super.G0();
        }
    }

    /* loaded from: classes4.dex */
    class y implements Runnable {
        y() {
        }

        @Override // java.lang.Runnable
        public void run() {
            WebViewSearchActivity_.super.F0();
        }
    }

    /* loaded from: classes4.dex */
    public static class z extends org.androidannotations.api.builder.a<z> {

        /* renamed from: a  reason: collision with root package name */
        private Fragment f38483a;

        public z(Context context) {
            super(context, WebViewSearchActivity_.class);
        }

        public z a(DownloadTask downloadTask) {
            return (z) super.extra("downloadTask", downloadTask);
        }

        public z b(String str) {
            return (z) super.extra("url", str);
        }

        @Override // org.androidannotations.api.builder.a, org.androidannotations.api.builder.b
        public org.androidannotations.api.builder.f startForResult(int i4) {
            Fragment fragment = this.f38483a;
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

        public z(Fragment fragment) {
            super(fragment.getActivity(), WebViewSearchActivity_.class);
            this.f38483a = fragment;
        }
    }

    public static z c1(Context context) {
        return new z(context);
    }

    public static z d1(Fragment fragment) {
        return new z(fragment);
    }

    private void init_(Bundle bundle) {
        this.f38421i = new PrefDef_(this);
        a4.c.b(this);
        injectExtras_();
    }

    private void injectExtras_() {
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            if (extras.containsKey("url")) {
                this.f38432t = extras.getString("url");
            }
            if (extras.containsKey("downloadTask")) {
                this.f38433u = (DownloadTask) extras.getSerializable("downloadTask");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.WebViewSearchActivity
    public void E0() {
        org.androidannotations.api.b.e("", new a(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.WebViewSearchActivity
    public void F0() {
        org.androidannotations.api.b.e("", new y(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.WebViewSearchActivity
    public void G0() {
        org.androidannotations.api.b.e("", new x(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.WebViewSearchActivity
    public void H0() {
        org.androidannotations.api.b.e("", new c(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.WebViewSearchActivity
    public void checkDownlodingNumber() {
        org.androidannotations.api.a.l(new p("", 0L, ""));
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.P.get(cls);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.WebViewSearchActivity
    public void getdownloadTask() {
        org.androidannotations.api.a.l(new q("", 0L, ""));
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        return (T) findViewById(i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.WebViewSearchActivity
    public void l0(String str) {
        org.androidannotations.api.a.l(new n("", 0L, "", str));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.WebViewSearchActivity
    public void m0(String str) {
        org.androidannotations.api.a.l(new m("", 0L, "", str));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.WebViewSearchActivity
    public void n0(String str) {
        org.androidannotations.api.a.l(new l("", 0L, "", str));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.WebViewSearchActivity
    public void o0(String str) {
        org.androidannotations.api.a.l(new o("", 0L, "", str));
    }

    @Override // com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.O);
        init_(bundle);
        super.onCreate(bundle);
        a4.c.c(c5);
        setContentView(R.layout.activity_web_view_search);
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f38417e = (BottomSheetLayout) aVar.internalFindViewById(R.id.bottomSheetLayout);
        this.f38418f = aVar.internalFindViewById(R.id.close);
        this.f38419g = (TextView) aVar.internalFindViewById(R.id.inputUrl);
        this.f38420h = aVar.internalFindViewById(R.id.downloadCenter);
        this.f38422j = (LJWebView) aVar.internalFindViewById(R.id.web);
        this.f38423k = aVar.internalFindViewById(R.id.layoutFail);
        this.f38424l = aVar.internalFindViewById(R.id.layoutLoading);
        this.f38425m = aVar.internalFindViewById(R.id.prev);
        this.f38426n = aVar.internalFindViewById(R.id.next);
        this.f38427o = (ImageView) aVar.internalFindViewById(R.id.prevImg);
        this.f38428p = (ImageView) aVar.internalFindViewById(R.id.nextImg);
        this.f38429q = aVar.internalFindViewById(R.id.refresh);
        this.f38430r = aVar.internalFindViewById(R.id.sniffer);
        this.f38431s = (TextView) aVar.internalFindViewById(R.id.tipSniffing);
        View view = this.f38425m;
        if (view != null) {
            view.setOnClickListener(new k());
        }
        View view2 = this.f38426n;
        if (view2 != null) {
            view2.setOnClickListener(new r());
        }
        View view3 = this.f38429q;
        if (view3 != null) {
            view3.setOnClickListener(new s());
        }
        View view4 = this.f38423k;
        if (view4 != null) {
            view4.setOnClickListener(new t());
        }
        View view5 = this.f38430r;
        if (view5 != null) {
            view5.setOnClickListener(new u());
        }
        View view6 = this.f38418f;
        if (view6 != null) {
            view6.setOnClickListener(new v());
        }
        afterViews();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.WebViewSearchActivity
    public void p0() {
        org.androidannotations.api.b.e("", new b(), 0L);
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.P.put(cls, t4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.WebViewSearchActivity
    public void receiveDelete(DownloadTask downloadTask) {
        org.androidannotations.api.b.e("", new j(downloadTask), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.WebViewSearchActivity
    public void receiveStart(DownloadTask downloadTask, int i4) {
        org.androidannotations.api.b.e("", new h(downloadTask, i4), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.WebViewSearchActivity
    public void receiveSuccess(DownloadTask downloadTask) {
        org.androidannotations.api.b.e("", new i(downloadTask), 0L);
    }

    @Override // com.join.mgps.activity.WebViewSearchActivity, com.BaseFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i4) {
        super.setContentView(i4);
        this.O.a(this);
    }

    @Override // android.app.Activity
    public void setIntent(Intent intent) {
        super.setIntent(intent);
        injectExtras_();
    }

    @Override // com.join.mgps.activity.WebViewSearchActivity
    public void showLoading() {
        org.androidannotations.api.b.e("", new w(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.WebViewSearchActivity
    public void updateDownloadingPoint(int i4) {
        org.androidannotations.api.b.e("", new e(i4), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.WebViewSearchActivity
    public void updateHidePoint() {
        org.androidannotations.api.b.e("", new g(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.WebViewSearchActivity
    public void updateLine(int i4) {
        org.androidannotations.api.b.e("", new d(i4), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.WebViewSearchActivity
    public void updateNoOpenPoint() {
        org.androidannotations.api.b.e("", new f(), 0L);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        this.O.a(this);
    }

    @Override // com.BaseFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        super.setContentView(view);
        this.O.a(this);
    }
}
