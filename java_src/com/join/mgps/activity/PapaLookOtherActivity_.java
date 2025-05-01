package com.join.mgps.activity;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.Fragment;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.CustomerDownloadView;
import com.join.mgps.dto.CollectionDataBean;
import java.util.HashMap;
import java.util.Map;
import org.androidannotations.api.a;
/* loaded from: classes4.dex */
public final class PapaLookOtherActivity_ extends PapaLookOtherActivity implements y3.a, a4.a, a4.b {

    /* renamed from: v  reason: collision with root package name */
    private final a4.c f36457v = new a4.c();

    /* renamed from: w  reason: collision with root package name */
    private final Map<Class<?>, Object> f36458w = new HashMap();

    /* loaded from: classes4.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            PapaLookOtherActivity_.super.showLoding();
        }
    }

    /* loaded from: classes4.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            PapaLookOtherActivity_.super.showLodingFailed();
        }
    }

    /* loaded from: classes4.dex */
    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            PapaLookOtherActivity_.super.k0();
        }
    }

    /* loaded from: classes4.dex */
    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            PapaLookOtherActivity_.super.updateDownloadView();
        }
    }

    /* loaded from: classes4.dex */
    class e implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f36463b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f36464c;

        e(int i4, int i5) {
            this.f36463b = i4;
            this.f36464c = i5;
        }

        @Override // java.lang.Runnable
        public void run() {
            PapaLookOtherActivity_.super.l0(this.f36463b, this.f36464c);
        }
    }

    /* loaded from: classes4.dex */
    class f extends a.c {
        f(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                PapaLookOtherActivity_.super.g0();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
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
                PapaLookOtherActivity_.super.getDownloadTaskInfo();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class h implements View.OnClickListener {
        h() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            PapaLookOtherActivity_.this.back_image();
        }
    }

    /* loaded from: classes4.dex */
    class i implements View.OnClickListener {
        i() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            PapaLookOtherActivity_.this.relodingimag();
        }
    }

    /* loaded from: classes4.dex */
    class j implements View.OnClickListener {
        j() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            PapaLookOtherActivity_.this.setNetwork();
        }
    }

    /* loaded from: classes4.dex */
    class k implements View.OnClickListener {
        k() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            PapaLookOtherActivity_.this.n0();
        }
    }

    /* loaded from: classes4.dex */
    class l implements View.OnClickListener {
        l() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            PapaLookOtherActivity_.this.m0();
        }
    }

    /* loaded from: classes4.dex */
    class m implements View.OnClickListener {
        m() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            PapaLookOtherActivity_.this.f0();
        }
    }

    /* loaded from: classes4.dex */
    class n implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f36474b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ CollectionDataBean f36475c;

        n(int i4, CollectionDataBean collectionDataBean) {
            this.f36474b = i4;
            this.f36475c = collectionDataBean;
        }

        @Override // java.lang.Runnable
        public void run() {
            PapaLookOtherActivity_.super.j0(this.f36474b, this.f36475c);
        }
    }

    /* loaded from: classes4.dex */
    class o implements Runnable {
        o() {
        }

        @Override // java.lang.Runnable
        public void run() {
            PapaLookOtherActivity_.super.serverConnectionException();
        }
    }

    /* loaded from: classes4.dex */
    class p implements Runnable {
        p() {
        }

        @Override // java.lang.Runnable
        public void run() {
            PapaLookOtherActivity_.super.i0();
        }
    }

    /* loaded from: classes4.dex */
    public static class q extends org.androidannotations.api.builder.a<q> {

        /* renamed from: a  reason: collision with root package name */
        private Fragment f36479a;

        public q(Context context) {
            super(context, PapaLookOtherActivity_.class);
        }

        @Override // org.androidannotations.api.builder.a, org.androidannotations.api.builder.b
        public org.androidannotations.api.builder.f startForResult(int i4) {
            Fragment fragment = this.f36479a;
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

        public q(Fragment fragment) {
            super(fragment.getActivity(), PapaLookOtherActivity_.class);
            this.f36479a = fragment;
        }
    }

    private void init_(Bundle bundle) {
        Resources resources = getResources();
        a4.c.b(this);
        this.f36441e = resources.getString(R.string.net_excption);
        this.f36442f = resources.getString(R.string.connect_server_excption);
    }

    public static q y0(Context context) {
        return new q(context);
    }

    public static q z0(Fragment fragment) {
        return new q(fragment);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.PapaLookOtherActivity
    public void g0() {
        org.androidannotations.api.a.l(new f("", 0L, ""));
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.f36458w.get(cls);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.PapaLookOtherActivity
    public void getDownloadTaskInfo() {
        org.androidannotations.api.a.l(new g("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.PapaLookOtherActivity
    public void i0() {
        org.androidannotations.api.b.e("", new p(), 0L);
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        return (T) findViewById(i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.PapaLookOtherActivity
    public void j0(int i4, CollectionDataBean collectionDataBean) {
        org.androidannotations.api.b.e("", new n(i4, collectionDataBean), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.PapaLookOtherActivity
    public void k0() {
        org.androidannotations.api.b.e("", new c(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.PapaLookOtherActivity
    public void l0(int i4, int i5) {
        org.androidannotations.api.b.e("", new e(i4, i5), 0L);
    }

    @Override // com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.f36457v);
        init_(bundle);
        super.onCreate(bundle);
        a4.c.c(c5);
        setContentView(R.layout.papeverday_new_activity_layout);
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f36443g = (TextView) aVar.internalFindViewById(R.id.title_textview);
        this.f36445i = (LinearLayout) aVar.internalFindViewById(R.id.loding_layout);
        this.f36446j = (LinearLayout) aVar.internalFindViewById(R.id.loding_faile);
        this.f36447k = (FrameLayout) aVar.internalFindViewById(R.id.fragment);
        this.f36448l = (ImageView) aVar.internalFindViewById(R.id.title_normal_search_img);
        this.f36449m = (CustomerDownloadView) aVar.internalFindViewById(R.id.title_normal_download_cdv);
        this.f36453q = (RelativeLayout) aVar.internalFindViewById(R.id.commentParent);
        this.f36454r = (ImageView) aVar.internalFindViewById(R.id.comment);
        this.f36455s = (TextView) aVar.internalFindViewById(R.id.roundMessage);
        View internalFindViewById = aVar.internalFindViewById(R.id.back_image);
        View internalFindViewById2 = aVar.internalFindViewById(R.id.relodingimag);
        View internalFindViewById3 = aVar.internalFindViewById(R.id.setNetwork);
        if (internalFindViewById != null) {
            internalFindViewById.setOnClickListener(new h());
        }
        if (internalFindViewById2 != null) {
            internalFindViewById2.setOnClickListener(new i());
        }
        if (internalFindViewById3 != null) {
            internalFindViewById3.setOnClickListener(new j());
        }
        ImageView imageView = this.f36448l;
        if (imageView != null) {
            imageView.setOnClickListener(new k());
        }
        CustomerDownloadView customerDownloadView = this.f36449m;
        if (customerDownloadView != null) {
            customerDownloadView.setOnClickListener(new l());
        }
        ImageView imageView2 = this.f36454r;
        if (imageView2 != null) {
            imageView2.setOnClickListener(new m());
        }
        afterview();
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.f36458w.put(cls, t4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.PapaLookOtherActivity
    public void serverConnectionException() {
        org.androidannotations.api.b.e("", new o(), 0L);
    }

    @Override // com.BaseFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i4) {
        super.setContentView(i4);
        this.f36457v.a(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.PapaLookOtherActivity
    public void showLoding() {
        org.androidannotations.api.b.e("", new a(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.PapaLookOtherActivity
    public void showLodingFailed() {
        org.androidannotations.api.b.e("", new b(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.PapaLookOtherActivity
    public void updateDownloadView() {
        org.androidannotations.api.b.e("", new d(), 0L);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        this.f36457v.a(this);
    }

    @Override // com.BaseFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        super.setContentView(view);
        this.f36457v.a(this);
    }
}
