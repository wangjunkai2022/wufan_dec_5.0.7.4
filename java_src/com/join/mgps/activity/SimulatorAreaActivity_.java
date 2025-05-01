package com.join.mgps.activity;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.Fragment;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.CustomerDownloadView;
import com.join.mgps.customview.XListView2;
import com.join.mgps.dto.CollectionBeanSub;
import com.join.mgps.dto.SimulatorAreaDataBean;
import java.util.HashMap;
import java.util.Map;
import org.androidannotations.api.a;
/* loaded from: classes4.dex */
public final class SimulatorAreaActivity_ extends SimulatorAreaActivity implements y3.a, a4.a, a4.b {
    public static final String E = "simulatorType";
    public static final String F = "simulatorTitle";
    private final a4.c A = new a4.c();
    private final Map<Class<?>, Object> B = new HashMap();
    private final IntentFilter C = new IntentFilter();
    private final BroadcastReceiver D = new e();

    /* loaded from: classes4.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SimulatorAreaActivity_.super.updateDownloadView();
        }
    }

    /* loaded from: classes4.dex */
    class b implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DownloadTask f37785b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f37786c;

        b(DownloadTask downloadTask, int i4) {
            this.f37785b = downloadTask;
            this.f37786c = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            SimulatorAreaActivity_.super.updateUI(this.f37785b, this.f37786c);
        }
    }

    /* loaded from: classes4.dex */
    class c extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f37788b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f37789c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, long j4, String str2, String str3, int i4) {
            super(str, j4, str2);
            this.f37788b = str3;
            this.f37789c = i4;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                SimulatorAreaActivity_.super.k0(this.f37788b, this.f37789c);
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
                SimulatorAreaActivity_.super.getDownloadTaskInfo();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class e extends BroadcastReceiver {

        /* renamed from: b  reason: collision with root package name */
        public static final String f37792b = "gameData";

        e() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            SimulatorAreaActivity_.this.m0((CollectionBeanSub) (intent.getExtras() != null ? intent.getExtras() : new Bundle()).getSerializable("gameData"));
        }
    }

    /* loaded from: classes4.dex */
    class f implements View.OnClickListener {
        f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SimulatorAreaActivity_.this.l0();
        }
    }

    /* loaded from: classes4.dex */
    class g implements View.OnClickListener {
        g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SimulatorAreaActivity_.this.setNetwork();
        }
    }

    /* loaded from: classes4.dex */
    class h implements View.OnClickListener {
        h() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SimulatorAreaActivity_.this.q0();
        }
    }

    /* loaded from: classes4.dex */
    class i implements View.OnClickListener {
        i() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SimulatorAreaActivity_.this.p0();
        }
    }

    /* loaded from: classes4.dex */
    class j implements View.OnClickListener {
        j() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SimulatorAreaActivity_.this.back_image();
        }
    }

    /* loaded from: classes4.dex */
    class k implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ SimulatorAreaDataBean f37799b;

        k(SimulatorAreaDataBean simulatorAreaDataBean) {
            this.f37799b = simulatorAreaDataBean;
        }

        @Override // java.lang.Runnable
        public void run() {
            SimulatorAreaActivity_.super.o0(this.f37799b);
        }
    }

    /* loaded from: classes4.dex */
    class l implements Runnable {
        l() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SimulatorAreaActivity_.super.n0();
        }
    }

    /* loaded from: classes4.dex */
    class m implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f37802b;

        m(boolean z4) {
            this.f37802b = z4;
        }

        @Override // java.lang.Runnable
        public void run() {
            SimulatorAreaActivity_.super.s0(this.f37802b);
        }
    }

    /* loaded from: classes4.dex */
    public static class n extends org.androidannotations.api.builder.a<n> {

        /* renamed from: a  reason: collision with root package name */
        private Fragment f37804a;

        public n(Context context) {
            super(context, SimulatorAreaActivity_.class);
        }

        public n a(String str) {
            return (n) super.extra(SimulatorAreaActivity_.F, str);
        }

        public n b(int i4) {
            return (n) super.extra(SimulatorAreaActivity_.E, i4);
        }

        @Override // org.androidannotations.api.builder.a, org.androidannotations.api.builder.b
        public org.androidannotations.api.builder.f startForResult(int i4) {
            Fragment fragment = this.f37804a;
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
            super(fragment.getActivity(), SimulatorAreaActivity_.class);
            this.f37804a = fragment;
        }
    }

    public static n A0(Context context) {
        return new n(context);
    }

    public static n B0(Fragment fragment) {
        return new n(fragment);
    }

    private void init_(Bundle bundle) {
        a4.c.b(this);
        injectExtras_();
        this.C.addAction(o1.a.I);
        this.C.addAction(o1.a.G);
        registerReceiver(this.D, this.C);
    }

    private void injectExtras_() {
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            if (extras.containsKey(E)) {
                this.f37764i = extras.getInt(E);
            }
            if (extras.containsKey(F)) {
                this.f37765j = extras.getString(F);
            }
        }
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.B.get(cls);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.SimulatorAreaActivity
    public void getDownloadTaskInfo() {
        org.androidannotations.api.a.l(new d("", 0L, ""));
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        return (T) findViewById(i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.SimulatorAreaActivity
    public void k0(String str, int i4) {
        org.androidannotations.api.a.l(new c("", 0L, "", str, i4));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.SimulatorAreaActivity
    public void n0() {
        org.androidannotations.api.b.e("", new l(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.SimulatorAreaActivity
    public void o0(SimulatorAreaDataBean simulatorAreaDataBean) {
        org.androidannotations.api.b.e("", new k(simulatorAreaDataBean), 0L);
    }

    @Override // com.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.A);
        init_(bundle);
        super.onCreate(bundle);
        a4.c.c(c5);
        setContentView(R.layout.activity_simulator_area);
    }

    @Override // com.join.mgps.activity.SimulatorAreaActivity, com.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        unregisterReceiver(this.D);
        super.onDestroy();
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f37758c = (LinearLayout) aVar.internalFindViewById(R.id.loding_layout);
        this.f37759d = (LinearLayout) aVar.internalFindViewById(R.id.loding_faile);
        this.f37760e = (XListView2) aVar.internalFindViewById(R.id.simulator_listview);
        this.f37761f = (TextView) aVar.internalFindViewById(R.id.title_textview);
        this.f37762g = (ImageView) aVar.internalFindViewById(R.id.title_normal_search_img);
        this.f37763h = (CustomerDownloadView) aVar.internalFindViewById(R.id.title_normal_download_cdv);
        View internalFindViewById = aVar.internalFindViewById(R.id.setNetwork);
        View internalFindViewById2 = aVar.internalFindViewById(R.id.back_image);
        LinearLayout linearLayout = this.f37759d;
        if (linearLayout != null) {
            linearLayout.setOnClickListener(new f());
        }
        if (internalFindViewById != null) {
            internalFindViewById.setOnClickListener(new g());
        }
        ImageView imageView = this.f37762g;
        if (imageView != null) {
            imageView.setOnClickListener(new h());
        }
        CustomerDownloadView customerDownloadView = this.f37763h;
        if (customerDownloadView != null) {
            customerDownloadView.setOnClickListener(new i());
        }
        if (internalFindViewById2 != null) {
            internalFindViewById2.setOnClickListener(new j());
        }
        afterviews();
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.B.put(cls, t4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.SimulatorAreaActivity
    public void s0(boolean z4) {
        org.androidannotations.api.b.e("", new m(z4), 0L);
    }

    @Override // com.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i4) {
        super.setContentView(i4);
        this.A.a(this);
    }

    @Override // android.app.Activity
    public void setIntent(Intent intent) {
        super.setIntent(intent);
        injectExtras_();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.SimulatorAreaActivity
    public void updateDownloadView() {
        org.androidannotations.api.b.e("", new a(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.SimulatorAreaActivity
    public void updateUI(DownloadTask downloadTask, int i4) {
        org.androidannotations.api.b.e("", new b(downloadTask, i4), 0L);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        this.A.a(this);
    }

    @Override // com.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        super.setContentView(view);
        this.A.a(this);
    }
}
