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
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.Fragment;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.adapter.EverydayNewGameAdapter;
import com.join.mgps.customview.CustomerDownloadView;
import com.join.mgps.customview.ForumLoadingView;
import com.join.mgps.customview.XListView4NewGame;
import com.join.mgps.dto.CollectionBeanSub;
import com.join.mgps.dto.ExtBean;
import com.join.mgps.ptr.PtrClassicFrameLayout;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.androidannotations.api.a;
/* loaded from: classes4.dex */
public final class PapaEverydayNewGameActivity_ extends PapaEverydayNewGameActivity implements y3.a, a4.a, a4.b {
    public static final String A = "extBean";

    /* renamed from: w  reason: collision with root package name */
    private final a4.c f36417w = new a4.c();

    /* renamed from: x  reason: collision with root package name */
    private final Map<Class<?>, Object> f36418x = new HashMap();

    /* renamed from: y  reason: collision with root package name */
    private final IntentFilter f36419y = new IntentFilter();

    /* renamed from: z  reason: collision with root package name */
    private final BroadcastReceiver f36420z = new b();

    /* loaded from: classes4.dex */
    class a extends a.c {
        a(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                PapaEverydayNewGameActivity_.super.getDownloadTaskInfo();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class b extends BroadcastReceiver {

        /* renamed from: b  reason: collision with root package name */
        public static final String f36422b = "gameData";

        b() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            PapaEverydayNewGameActivity_.this.w0((CollectionBeanSub) (intent.getExtras() != null ? intent.getExtras() : new Bundle()).getSerializable("gameData"));
        }
    }

    /* loaded from: classes4.dex */
    class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            PapaEverydayNewGameActivity_.this.back_image();
        }
    }

    /* loaded from: classes4.dex */
    class d implements View.OnClickListener {
        d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            PapaEverydayNewGameActivity_.this.A0();
        }
    }

    /* loaded from: classes4.dex */
    class e implements View.OnClickListener {
        e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            PapaEverydayNewGameActivity_.this.z0();
        }
    }

    /* loaded from: classes4.dex */
    class f implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f36427b;

        f(List list) {
            this.f36427b = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            PapaEverydayNewGameActivity_.super.r0(this.f36427b);
        }
    }

    /* loaded from: classes4.dex */
    class g implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f36429b;

        g(String str) {
            this.f36429b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            PapaEverydayNewGameActivity_.super.showToast(this.f36429b);
        }
    }

    /* loaded from: classes4.dex */
    class h implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f36431b;

        h(int i4) {
            this.f36431b = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            PapaEverydayNewGameActivity_.super.i0(this.f36431b);
        }
    }

    /* loaded from: classes4.dex */
    class i implements Runnable {
        i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            PapaEverydayNewGameActivity_.super.updateDownloadView();
        }
    }

    /* loaded from: classes4.dex */
    class j extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f36434b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(String str, long j4, String str2, int i4) {
            super(str, j4, str2);
            this.f36434b = i4;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                PapaEverydayNewGameActivity_.super.o0(this.f36434b);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    public static class k extends org.androidannotations.api.builder.a<k> {

        /* renamed from: a  reason: collision with root package name */
        private Fragment f36436a;

        public k(Context context) {
            super(context, PapaEverydayNewGameActivity_.class);
        }

        public k a(ExtBean extBean) {
            return (k) super.extra("extBean", extBean);
        }

        @Override // org.androidannotations.api.builder.a, org.androidannotations.api.builder.b
        public org.androidannotations.api.builder.f startForResult(int i4) {
            Fragment fragment = this.f36436a;
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

        public k(Fragment fragment) {
            super(fragment.getActivity(), PapaEverydayNewGameActivity_.class);
            this.f36436a = fragment;
        }
    }

    public static k J0(Context context) {
        return new k(context);
    }

    public static k K0(Fragment fragment) {
        return new k(fragment);
    }

    private void init_(Bundle bundle) {
        a4.c.b(this);
        injectExtras_();
        this.f36419y.addAction(o1.a.I);
        this.f36419y.addAction(o1.a.G);
        registerReceiver(this.f36420z, this.f36419y);
    }

    private void injectExtras_() {
        Bundle extras = getIntent().getExtras();
        if (extras == null || !extras.containsKey("extBean")) {
            return;
        }
        this.f36404p = (ExtBean) extras.getSerializable("extBean");
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.f36418x.get(cls);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.PapaEverydayNewGameActivity
    public void getDownloadTaskInfo() {
        org.androidannotations.api.a.l(new a("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.PapaEverydayNewGameActivity
    public void i0(int i4) {
        org.androidannotations.api.b.e("", new h(i4), 0L);
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        return (T) findViewById(i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.PapaEverydayNewGameActivity
    public void o0(int i4) {
        org.androidannotations.api.a.l(new j("", 0L, "", i4));
    }

    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.f36417w);
        init_(bundle);
        super.onCreate(bundle);
        a4.c.c(c5);
        setContentView(R.layout.activity_everyday_new_game);
    }

    @Override // com.join.mgps.activity.PapaEverydayNewGameActivity, com.BaseActivity, com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        unregisterReceiver(this.f36420z);
        super.onDestroy();
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f36390b = (RelativeLayout) aVar.internalFindViewById(R.id.actionbarLayout);
        this.f36391c = (ImageView) aVar.internalFindViewById(R.id.back_image);
        this.f36392d = (TextView) aVar.internalFindViewById(R.id.title_textview);
        this.f36393e = (ForumLoadingView) aVar.internalFindViewById(R.id.loadingView);
        this.f36394f = (XListView4NewGame) aVar.internalFindViewById(R.id.listView);
        this.f36395g = (PtrClassicFrameLayout) aVar.internalFindViewById(R.id.mPtrFrame);
        this.f36396h = (ImageView) aVar.internalFindViewById(R.id.title_normal_search_img);
        this.f36397i = (CustomerDownloadView) aVar.internalFindViewById(R.id.title_normal_download_cdv);
        ImageView imageView = this.f36391c;
        if (imageView != null) {
            imageView.setOnClickListener(new c());
        }
        ImageView imageView2 = this.f36396h;
        if (imageView2 != null) {
            imageView2.setOnClickListener(new d());
        }
        CustomerDownloadView customerDownloadView = this.f36397i;
        if (customerDownloadView != null) {
            customerDownloadView.setOnClickListener(new e());
        }
        afterViews();
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.f36418x.put(cls, t4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.PapaEverydayNewGameActivity
    public void r0(List<EverydayNewGameAdapter.j> list) {
        org.androidannotations.api.b.e("", new f(list), 0L);
    }

    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i4) {
        super.setContentView(i4);
        this.f36417w.a(this);
    }

    @Override // android.app.Activity
    public void setIntent(Intent intent) {
        super.setIntent(intent);
        injectExtras_();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.PapaEverydayNewGameActivity
    public void showToast(String str) {
        org.androidannotations.api.b.e("", new g(str), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.PapaEverydayNewGameActivity
    public void updateDownloadView() {
        org.androidannotations.api.b.e("", new i(), 0L);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        this.f36417w.a(this);
    }

    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        super.setContentView(view);
        this.f36417w.a(this);
    }
}
