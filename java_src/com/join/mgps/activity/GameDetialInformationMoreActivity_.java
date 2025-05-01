package com.join.mgps.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.Fragment;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.CustomerDownloadView;
import com.join.mgps.customview.XListView2;
import com.join.mgps.dto.DetialIntentBean;
import com.join.mgps.dto.RecommendInfomationBean;
import com.join.mgps.ptr.PtrClassicFrameLayout;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.androidannotations.api.a;
/* loaded from: classes4.dex */
public final class GameDetialInformationMoreActivity_ extends GameDetialInformationMoreActivity implements y3.a, a4.a, a4.b {
    public static final String G = "detialIntentBean";
    private final a4.c E = new a4.c();
    private final Map<Class<?>, Object> F = new HashMap();

    /* loaded from: classes4.dex */
    class a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f31768b;

        a(List list) {
            this.f31768b = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            GameDetialInformationMoreActivity_.super.q0(this.f31768b);
        }
    }

    /* loaded from: classes4.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GameDetialInformationMoreActivity_.super.t0();
        }
    }

    /* loaded from: classes4.dex */
    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GameDetialInformationMoreActivity_.super.o0();
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
                GameDetialInformationMoreActivity_.super.l0();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class e implements View.OnClickListener {
        e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GameDetialInformationMoreActivity_.this.relodingimag();
        }
    }

    /* loaded from: classes4.dex */
    class f implements View.OnClickListener {
        f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GameDetialInformationMoreActivity_.this.back_image();
        }
    }

    /* loaded from: classes4.dex */
    class g implements View.OnClickListener {
        g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GameDetialInformationMoreActivity_.this.n0();
        }
    }

    /* loaded from: classes4.dex */
    class h implements View.OnClickListener {
        h() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GameDetialInformationMoreActivity_.this.setNetwork();
        }
    }

    /* loaded from: classes4.dex */
    class i implements View.OnClickListener {
        i() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GameDetialInformationMoreActivity_.this.s0();
        }
    }

    /* loaded from: classes4.dex */
    class j implements View.OnClickListener {
        j() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GameDetialInformationMoreActivity_.this.r0();
        }
    }

    /* loaded from: classes4.dex */
    class k implements Runnable {
        k() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GameDetialInformationMoreActivity_.super.k0();
        }
    }

    /* loaded from: classes4.dex */
    class l implements Runnable {
        l() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GameDetialInformationMoreActivity_.super.showLoding();
        }
    }

    /* loaded from: classes4.dex */
    class m implements Runnable {
        m() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GameDetialInformationMoreActivity_.super.showLodingFailed();
        }
    }

    /* loaded from: classes4.dex */
    public static class n extends org.androidannotations.api.builder.a<n> {

        /* renamed from: a  reason: collision with root package name */
        private Fragment f31782a;

        public n(Context context) {
            super(context, GameDetialInformationMoreActivity_.class);
        }

        public n a(DetialIntentBean detialIntentBean) {
            return (n) super.extra(GameDetialInformationMoreActivity_.G, detialIntentBean);
        }

        @Override // org.androidannotations.api.builder.a, org.androidannotations.api.builder.b
        public org.androidannotations.api.builder.f startForResult(int i4) {
            Fragment fragment = this.f31782a;
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
            super(fragment.getActivity(), GameDetialInformationMoreActivity_.class);
            this.f31782a = fragment;
        }
    }

    public static n B0(Context context) {
        return new n(context);
    }

    public static n C0(Fragment fragment) {
        return new n(fragment);
    }

    private void init_(Bundle bundle) {
        Resources resources = getResources();
        a4.c.b(this);
        this.f31753q = resources.getString(R.string.net_excption);
        this.f31754r = resources.getString(R.string.connect_server_excption);
        injectExtras_();
    }

    private void injectExtras_() {
        Bundle extras = getIntent().getExtras();
        if (extras == null || !extras.containsKey(G)) {
            return;
        }
        this.f31756t = (DetialIntentBean) extras.getSerializable(G);
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.F.get(cls);
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        return (T) findViewById(i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameDetialInformationMoreActivity
    public void k0() {
        org.androidannotations.api.b.e("", new k(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameDetialInformationMoreActivity
    public void l0() {
        org.androidannotations.api.a.l(new d("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameDetialInformationMoreActivity
    public void o0() {
        org.androidannotations.api.b.e("", new c(), 0L);
    }

    @Override // com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.E);
        init_(bundle);
        super.onCreate(bundle);
        a4.c.c(c5);
        setContentView(R.layout.detial_more_imformation_layout);
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f31741e = (PtrClassicFrameLayout) aVar.internalFindViewById(R.id.mPtrFrame);
        this.f31742f = (TextView) aVar.internalFindViewById(R.id.title_textview);
        this.f31743g = (XListView2) aVar.internalFindViewById(R.id.rankListView);
        this.f31744h = (LinearLayout) aVar.internalFindViewById(R.id.loding_layout);
        this.f31745i = (LinearLayout) aVar.internalFindViewById(R.id.loding_faile);
        this.f31746j = (ImageView) aVar.internalFindViewById(R.id.relodingimag);
        this.f31747k = (ImageView) aVar.internalFindViewById(R.id.back_image);
        this.f31748l = (LinearLayout) aVar.internalFindViewById(R.id.tabs);
        this.f31749m = (LinearLayout) aVar.internalFindViewById(R.id.group);
        this.f31750n = (ImageView) aVar.internalFindViewById(R.id.title_normal_search_img);
        this.f31751o = (CustomerDownloadView) aVar.internalFindViewById(R.id.title_normal_download_cdv);
        View internalFindViewById = aVar.internalFindViewById(R.id.mg_loading);
        View internalFindViewById2 = aVar.internalFindViewById(R.id.setNetwork);
        ImageView imageView = this.f31746j;
        if (imageView != null) {
            imageView.setOnClickListener(new e());
        }
        ImageView imageView2 = this.f31747k;
        if (imageView2 != null) {
            imageView2.setOnClickListener(new f());
        }
        if (internalFindViewById != null) {
            internalFindViewById.setOnClickListener(new g());
        }
        if (internalFindViewById2 != null) {
            internalFindViewById2.setOnClickListener(new h());
        }
        ImageView imageView3 = this.f31750n;
        if (imageView3 != null) {
            imageView3.setOnClickListener(new i());
        }
        CustomerDownloadView customerDownloadView = this.f31751o;
        if (customerDownloadView != null) {
            customerDownloadView.setOnClickListener(new j());
        }
        afterViews();
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.F.put(cls, t4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameDetialInformationMoreActivity
    public void q0(List<RecommendInfomationBean> list) {
        org.androidannotations.api.b.e("", new a(list), 0L);
    }

    @Override // com.BaseFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i4) {
        super.setContentView(i4);
        this.E.a(this);
    }

    @Override // android.app.Activity
    public void setIntent(Intent intent) {
        super.setIntent(intent);
        injectExtras_();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameDetialInformationMoreActivity
    public void showLoding() {
        org.androidannotations.api.b.e("", new l(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameDetialInformationMoreActivity
    public void showLodingFailed() {
        org.androidannotations.api.b.e("", new m(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameDetialInformationMoreActivity
    public void t0() {
        org.androidannotations.api.b.e("", new b(), 0L);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        this.E.a(this);
    }

    @Override // com.BaseFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        super.setContentView(view);
        this.E.a(this);
    }
}
