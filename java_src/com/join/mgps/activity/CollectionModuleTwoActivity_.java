package com.join.mgps.activity;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.Fragment;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.business.CollectionBeanSubBusiness;
import com.join.mgps.customview.CustomerDownloadView;
import com.join.mgps.customview.XListView2;
import com.join.mgps.dto.CollectionBeanSub;
import com.join.mgps.dto.ExtBean;
import com.join.mgps.ptr.PtrClassicFrameLayout;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.androidannotations.api.a;
/* loaded from: classes4.dex */
public final class CollectionModuleTwoActivity_ extends CollectionModuleTwoActivity implements y3.a, a4.a, a4.b {
    public static final String S = "collection_id";
    public static final String T = "extBean";
    private final a4.c O = new a4.c();
    private final Map<Class<?>, Object> P = new HashMap();
    private final IntentFilter Q = new IntentFilter();
    private final BroadcastReceiver R = new j();

    /* loaded from: classes4.dex */
    class a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f29288b;

        a(List list) {
            this.f29288b = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            CollectionModuleTwoActivity_.super.q0(this.f29288b);
        }
    }

    /* loaded from: classes4.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            CollectionModuleTwoActivity_.super.v0();
        }
    }

    /* loaded from: classes4.dex */
    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            CollectionModuleTwoActivity_.super.o0();
        }
    }

    /* loaded from: classes4.dex */
    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            CollectionModuleTwoActivity_.super.serverConnectionException();
        }
    }

    /* loaded from: classes4.dex */
    class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            CollectionModuleTwoActivity_.super.n0();
        }
    }

    /* loaded from: classes4.dex */
    class f implements Runnable {
        f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            CollectionModuleTwoActivity_.super.updateDownloadView();
        }
    }

    /* loaded from: classes4.dex */
    class g implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f29295b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f29296c;

        g(int i4, int i5) {
            this.f29295b = i4;
            this.f29296c = i5;
        }

        @Override // java.lang.Runnable
        public void run() {
            CollectionModuleTwoActivity_.super.r0(this.f29295b, this.f29296c);
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
                CollectionModuleTwoActivity_.super.l0();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
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
                CollectionModuleTwoActivity_.super.getDownloadTaskInfo();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class j extends BroadcastReceiver {

        /* renamed from: b  reason: collision with root package name */
        public static final String f29300b = "gameData";

        j() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            CollectionModuleTwoActivity_.this.p0((CollectionBeanSub) (intent.getExtras() != null ? intent.getExtras() : new Bundle()).getSerializable("gameData"));
        }
    }

    /* loaded from: classes4.dex */
    class k implements View.OnClickListener {
        k() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CollectionModuleTwoActivity_.this.relodingimag();
        }
    }

    /* loaded from: classes4.dex */
    class l implements View.OnClickListener {
        l() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CollectionModuleTwoActivity_.this.setNetwork();
        }
    }

    /* loaded from: classes4.dex */
    class m implements View.OnClickListener {
        m() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CollectionModuleTwoActivity_.this.back_image();
        }
    }

    /* loaded from: classes4.dex */
    class n implements View.OnClickListener {
        n() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CollectionModuleTwoActivity_.this.t0();
        }
    }

    /* loaded from: classes4.dex */
    class o implements View.OnClickListener {
        o() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CollectionModuleTwoActivity_.this.s0();
        }
    }

    /* loaded from: classes4.dex */
    class p implements View.OnClickListener {
        p() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CollectionModuleTwoActivity_.this.j0();
        }
    }

    /* loaded from: classes4.dex */
    class q implements Runnable {
        q() {
        }

        @Override // java.lang.Runnable
        public void run() {
            CollectionModuleTwoActivity_.super.showLoding();
        }
    }

    /* loaded from: classes4.dex */
    class r implements Runnable {
        r() {
        }

        @Override // java.lang.Runnable
        public void run() {
            CollectionModuleTwoActivity_.super.showLodingFailed();
        }
    }

    /* loaded from: classes4.dex */
    public static class s extends org.androidannotations.api.builder.a<s> {

        /* renamed from: a  reason: collision with root package name */
        private Fragment f29310a;

        public s(Context context) {
            super(context, CollectionModuleTwoActivity_.class);
        }

        public s a(String str) {
            return (s) super.extra("collection_id", str);
        }

        public s b(ExtBean extBean) {
            return (s) super.extra("extBean", extBean);
        }

        @Override // org.androidannotations.api.builder.a, org.androidannotations.api.builder.b
        public org.androidannotations.api.builder.f startForResult(int i4) {
            Fragment fragment = this.f29310a;
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

        public s(Fragment fragment) {
            super(fragment.getActivity(), CollectionModuleTwoActivity_.class);
            this.f29310a = fragment;
        }
    }

    public static s H0(Context context) {
        return new s(context);
    }

    public static s I0(Fragment fragment) {
        return new s(fragment);
    }

    private void init_(Bundle bundle) {
        Resources resources = getResources();
        a4.c.b(this);
        this.f29278t = resources.getString(R.string.net_excption);
        this.f29279u = resources.getString(R.string.connect_server_excption);
        injectExtras_();
        this.Q.addAction(o1.a.I);
        this.Q.addAction(o1.a.G);
        registerReceiver(this.R, this.Q);
    }

    private void injectExtras_() {
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            if (extras.containsKey("collection_id")) {
                this.f29282x = extras.getString("collection_id");
            }
            if (extras.containsKey("extBean")) {
                this.f29283y = (ExtBean) extras.getSerializable("extBean");
            }
        }
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.P.get(cls);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.CollectionModuleTwoActivity
    public void getDownloadTaskInfo() {
        org.androidannotations.api.a.l(new i("", 0L, ""));
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        return (T) findViewById(i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.CollectionModuleTwoActivity
    public void l0() {
        org.androidannotations.api.a.l(new h("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.CollectionModuleTwoActivity
    public void n0() {
        org.androidannotations.api.b.e("", new e(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.CollectionModuleTwoActivity
    public void o0() {
        org.androidannotations.api.b.e("", new c(), 0L);
    }

    @Override // com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.O);
        init_(bundle);
        super.onCreate(bundle);
        a4.c.c(c5);
        setContentView(R.layout.category_collection_break);
    }

    @Override // com.join.mgps.activity.CollectionModuleTwoActivity, com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        unregisterReceiver(this.R);
        super.onDestroy();
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f29261c = (PtrClassicFrameLayout) aVar.internalFindViewById(R.id.mPtrFrame);
        this.f29262d = (XListView2) aVar.internalFindViewById(R.id.breakListView);
        this.f29263e = (TextView) aVar.internalFindViewById(R.id.title_textview);
        this.f29264f = (LinearLayout) aVar.internalFindViewById(R.id.loding_layout);
        this.f29265g = (LinearLayout) aVar.internalFindViewById(R.id.loding_faile);
        this.f29266h = (ImageView) aVar.internalFindViewById(R.id.relodingimag);
        this.f29267i = (ImageView) aVar.internalFindViewById(R.id.back_image);
        this.f29268j = (ImageView) aVar.internalFindViewById(R.id.title_normal_search_img);
        this.f29269k = (CustomerDownloadView) aVar.internalFindViewById(R.id.title_normal_download_cdv);
        this.K = (RelativeLayout) aVar.internalFindViewById(R.id.commentParent);
        this.L = (ImageView) aVar.internalFindViewById(R.id.comment);
        this.M = (TextView) aVar.internalFindViewById(R.id.roundMessage);
        View internalFindViewById = aVar.internalFindViewById(R.id.setNetwork);
        ImageView imageView = this.f29266h;
        if (imageView != null) {
            imageView.setOnClickListener(new k());
        }
        if (internalFindViewById != null) {
            internalFindViewById.setOnClickListener(new l());
        }
        ImageView imageView2 = this.f29267i;
        if (imageView2 != null) {
            imageView2.setOnClickListener(new m());
        }
        ImageView imageView3 = this.f29268j;
        if (imageView3 != null) {
            imageView3.setOnClickListener(new n());
        }
        CustomerDownloadView customerDownloadView = this.f29269k;
        if (customerDownloadView != null) {
            customerDownloadView.setOnClickListener(new o());
        }
        ImageView imageView4 = this.L;
        if (imageView4 != null) {
            imageView4.setOnClickListener(new p());
        }
        afterViews();
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.P.put(cls, t4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.CollectionModuleTwoActivity
    public void q0(List<CollectionBeanSubBusiness> list) {
        org.androidannotations.api.b.e("", new a(list), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.CollectionModuleTwoActivity
    public void r0(int i4, int i5) {
        org.androidannotations.api.b.e("", new g(i4, i5), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.CollectionModuleTwoActivity
    public void serverConnectionException() {
        org.androidannotations.api.b.e("", new d(), 0L);
    }

    @Override // com.BaseFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i4) {
        super.setContentView(i4);
        this.O.a(this);
    }

    @Override // android.app.Activity
    public void setIntent(Intent intent) {
        super.setIntent(intent);
        injectExtras_();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.CollectionModuleTwoActivity
    public void showLoding() {
        org.androidannotations.api.b.e("", new q(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.CollectionModuleTwoActivity
    public void showLodingFailed() {
        org.androidannotations.api.b.e("", new r(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.CollectionModuleTwoActivity
    public void updateDownloadView() {
        org.androidannotations.api.b.e("", new f(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.CollectionModuleTwoActivity
    public void v0() {
        org.androidannotations.api.b.e("", new b(), 0L);
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
