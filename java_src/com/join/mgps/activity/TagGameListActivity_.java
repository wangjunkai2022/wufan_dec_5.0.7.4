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
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.business.CollectionBeanSubBusiness;
import com.join.mgps.customview.CustomerDownloadView;
import com.join.mgps.customview.XListView2;
import com.join.mgps.dto.CollectionBeanSub;
import com.join.mgps.ptr.PtrClassicFrameLayout;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.androidannotations.api.a;
/* loaded from: classes4.dex */
public final class TagGameListActivity_ extends TagGameListActivity implements y3.a, a4.a, a4.b {
    public static final String N = "from";
    public static final String O = "tagId";
    public static final String P = "tag";
    public static final String Q = "tagType";
    public static final String R = "companyName";
    public static final String S = "isSingle";
    private final a4.c J = new a4.c();
    private final Map<Class<?>, Object> K = new HashMap();
    private final IntentFilter L = new IntentFilter();
    private final BroadcastReceiver M = new i();

    /* loaded from: classes4.dex */
    class a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f38025b;

        a(List list) {
            this.f38025b = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            TagGameListActivity_.super.p0(this.f38025b);
        }
    }

    /* loaded from: classes4.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TagGameListActivity_.super.u0();
        }
    }

    /* loaded from: classes4.dex */
    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TagGameListActivity_.super.n0();
        }
    }

    /* loaded from: classes4.dex */
    class d implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DownloadTask f38029b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f38030c;

        d(DownloadTask downloadTask, int i4) {
            this.f38029b = downloadTask;
            this.f38030c = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            TagGameListActivity_.super.updateUI(this.f38029b, this.f38030c);
        }
    }

    /* loaded from: classes4.dex */
    class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TagGameListActivity_.super.updateDownloadView();
        }
    }

    /* loaded from: classes4.dex */
    class f implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f38033b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f38034c;

        f(int i4, int i5) {
            this.f38033b = i4;
            this.f38034c = i5;
        }

        @Override // java.lang.Runnable
        public void run() {
            TagGameListActivity_.super.q0(this.f38033b, this.f38034c);
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
                TagGameListActivity_.super.k0();
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
                TagGameListActivity_.super.getDownloadTaskInfo();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class i extends BroadcastReceiver {

        /* renamed from: b  reason: collision with root package name */
        public static final String f38038b = "gameData";

        i() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            TagGameListActivity_.this.o0((CollectionBeanSub) (intent.getExtras() != null ? intent.getExtras() : new Bundle()).getSerializable("gameData"));
        }
    }

    /* loaded from: classes4.dex */
    class j implements View.OnClickListener {
        j() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            TagGameListActivity_.this.relodingimag();
        }
    }

    /* loaded from: classes4.dex */
    class k implements View.OnClickListener {
        k() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            TagGameListActivity_.this.back_image();
        }
    }

    /* loaded from: classes4.dex */
    class l implements View.OnClickListener {
        l() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            TagGameListActivity_.this.m0();
        }
    }

    /* loaded from: classes4.dex */
    class m implements View.OnClickListener {
        m() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            TagGameListActivity_.this.setNetwork();
        }
    }

    /* loaded from: classes4.dex */
    class n implements View.OnClickListener {
        n() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            TagGameListActivity_.this.s0();
        }
    }

    /* loaded from: classes4.dex */
    class o implements View.OnClickListener {
        o() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            TagGameListActivity_.this.r0();
        }
    }

    /* loaded from: classes4.dex */
    class p implements Runnable {
        p() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TagGameListActivity_.super.showLoding();
        }
    }

    /* loaded from: classes4.dex */
    class q implements Runnable {
        q() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TagGameListActivity_.super.showLodingFailed();
        }
    }

    /* loaded from: classes4.dex */
    public static class r extends org.androidannotations.api.builder.a<r> {

        /* renamed from: a  reason: collision with root package name */
        private Fragment f38048a;

        public r(Context context) {
            super(context, TagGameListActivity_.class);
        }

        public r a(String str) {
            return (r) super.extra(TagGameListActivity_.R, str);
        }

        public r b(int i4) {
            return (r) super.extra("from", i4);
        }

        public r c(boolean z4) {
            return (r) super.extra("isSingle", z4);
        }

        public r d(String str) {
            return (r) super.extra("tag", str);
        }

        public r e(int i4) {
            return (r) super.extra("tagId", i4);
        }

        public r f(String str) {
            return (r) super.extra(TagGameListActivity_.Q, str);
        }

        @Override // org.androidannotations.api.builder.a, org.androidannotations.api.builder.b
        public org.androidannotations.api.builder.f startForResult(int i4) {
            Fragment fragment = this.f38048a;
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

        public r(Fragment fragment) {
            super(fragment.getActivity(), TagGameListActivity_.class);
            this.f38048a = fragment;
        }
    }

    public static r F0(Context context) {
        return new r(context);
    }

    public static r G0(Fragment fragment) {
        return new r(fragment);
    }

    private void init_(Bundle bundle) {
        Resources resources = getResources();
        a4.c.b(this);
        this.f38011p = resources.getString(R.string.net_excption);
        this.f38012q = resources.getString(R.string.connect_server_excption);
        injectExtras_();
        this.L.addAction(o1.a.I);
        this.L.addAction(o1.a.G);
        registerReceiver(this.M, this.L);
    }

    private void injectExtras_() {
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            if (extras.containsKey("from")) {
                this.f38014s = extras.getInt("from");
            }
            if (extras.containsKey("tagId")) {
                this.f38015t = extras.getInt("tagId");
            }
            if (extras.containsKey("tag")) {
                this.f38016u = extras.getString("tag");
            }
            if (extras.containsKey(Q)) {
                this.f38017v = extras.getString(Q);
            }
            if (extras.containsKey(R)) {
                this.f38018w = extras.getString(R);
            }
            if (extras.containsKey("isSingle")) {
                this.f38019x = extras.getBoolean("isSingle");
            }
        }
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.K.get(cls);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.TagGameListActivity
    public void getDownloadTaskInfo() {
        org.androidannotations.api.a.l(new h("", 0L, ""));
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        return (T) findViewById(i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.TagGameListActivity
    public void k0() {
        org.androidannotations.api.a.l(new g("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.TagGameListActivity
    public void n0() {
        org.androidannotations.api.b.e("", new c(), 0L);
    }

    @Override // com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.J);
        init_(bundle);
        super.onCreate(bundle);
        a4.c.c(c5);
        setContentView(R.layout.category_collection_rank);
    }

    @Override // com.join.mgps.activity.TagGameListActivity, com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        unregisterReceiver(this.M);
        super.onDestroy();
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f38000e = (PtrClassicFrameLayout) aVar.internalFindViewById(R.id.mPtrFrame);
        this.f38001f = (TextView) aVar.internalFindViewById(R.id.title_textview);
        this.f38002g = (XListView2) aVar.internalFindViewById(R.id.rankListView);
        this.f38003h = (LinearLayout) aVar.internalFindViewById(R.id.loding_layout);
        this.f38004i = (LinearLayout) aVar.internalFindViewById(R.id.loding_faile);
        this.f38005j = (ImageView) aVar.internalFindViewById(R.id.relodingimag);
        this.f38006k = (ImageView) aVar.internalFindViewById(R.id.back_image);
        this.f38007l = (ImageView) aVar.internalFindViewById(R.id.title_normal_search_img);
        this.f38008m = (CustomerDownloadView) aVar.internalFindViewById(R.id.title_normal_download_cdv);
        this.G = (RelativeLayout) aVar.internalFindViewById(R.id.commentParent);
        this.H = (ImageView) aVar.internalFindViewById(R.id.comment);
        this.I = (TextView) aVar.internalFindViewById(R.id.roundMessage);
        View internalFindViewById = aVar.internalFindViewById(R.id.mg_loading);
        View internalFindViewById2 = aVar.internalFindViewById(R.id.setNetwork);
        ImageView imageView = this.f38005j;
        if (imageView != null) {
            imageView.setOnClickListener(new j());
        }
        ImageView imageView2 = this.f38006k;
        if (imageView2 != null) {
            imageView2.setOnClickListener(new k());
        }
        if (internalFindViewById != null) {
            internalFindViewById.setOnClickListener(new l());
        }
        if (internalFindViewById2 != null) {
            internalFindViewById2.setOnClickListener(new m());
        }
        ImageView imageView3 = this.f38007l;
        if (imageView3 != null) {
            imageView3.setOnClickListener(new n());
        }
        CustomerDownloadView customerDownloadView = this.f38008m;
        if (customerDownloadView != null) {
            customerDownloadView.setOnClickListener(new o());
        }
        afterViews();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.TagGameListActivity
    public void p0(List<CollectionBeanSubBusiness> list) {
        org.androidannotations.api.b.e("", new a(list), 0L);
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.K.put(cls, t4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.TagGameListActivity
    public void q0(int i4, int i5) {
        org.androidannotations.api.b.e("", new f(i4, i5), 0L);
    }

    @Override // com.BaseFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i4) {
        super.setContentView(i4);
        this.J.a(this);
    }

    @Override // android.app.Activity
    public void setIntent(Intent intent) {
        super.setIntent(intent);
        injectExtras_();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.TagGameListActivity
    public void showLoding() {
        org.androidannotations.api.b.e("", new p(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.TagGameListActivity
    public void showLodingFailed() {
        org.androidannotations.api.b.e("", new q(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.TagGameListActivity
    public void u0() {
        org.androidannotations.api.b.e("", new b(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.TagGameListActivity
    public void updateDownloadView() {
        org.androidannotations.api.b.e("", new e(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.TagGameListActivity
    public void updateUI(DownloadTask downloadTask, int i4) {
        org.androidannotations.api.b.e("", new d(downloadTask, i4), 0L);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        this.J.a(this);
    }

    @Override // com.BaseFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        super.setContentView(view);
        this.J.a(this);
    }
}
