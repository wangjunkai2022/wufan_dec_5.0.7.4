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
import com.join.mgps.dto.GamedetialMoreGiftData;
import com.join.mgps.dto.GiftPackageDataInfoBean;
import com.join.mgps.dto.GiftPackageDataOperationBean;
import com.join.mgps.ptr.PtrClassicFrameLayout;
import java.util.HashMap;
import java.util.Map;
import org.androidannotations.api.a;
/* loaded from: classes4.dex */
public final class GameDetialGiftMoreActivity_ extends GameDetialGiftMoreActivity implements y3.a, a4.a, a4.b {
    public static final String O = "gameId";
    private final a4.c M = new a4.c();
    private final Map<Class<?>, Object> N = new HashMap();

    /* loaded from: classes4.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GameDetialGiftMoreActivity_.super.E0();
        }
    }

    /* loaded from: classes4.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GameDetialGiftMoreActivity_.super.w0();
        }
    }

    /* loaded from: classes4.dex */
    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GameDetialGiftMoreActivity_.super.updateDownloadView();
        }
    }

    /* loaded from: classes4.dex */
    class d implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ GiftPackageDataInfoBean f31715b;

        d(GiftPackageDataInfoBean giftPackageDataInfoBean) {
            this.f31715b = giftPackageDataInfoBean;
        }

        @Override // java.lang.Runnable
        public void run() {
            GameDetialGiftMoreActivity_.super.x0(this.f31715b);
        }
    }

    /* loaded from: classes4.dex */
    class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GameDetialGiftMoreActivity_.super.A0();
        }
    }

    /* loaded from: classes4.dex */
    class f implements Runnable {
        f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GameDetialGiftMoreActivity_.super.B0();
        }
    }

    /* loaded from: classes4.dex */
    class g implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f31719b;

        g(String str) {
            this.f31719b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            GameDetialGiftMoreActivity_.super.showToast(this.f31719b);
        }
    }

    /* loaded from: classes4.dex */
    class h implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ GiftPackageDataOperationBean f31721b;

        h(GiftPackageDataOperationBean giftPackageDataOperationBean) {
            this.f31721b = giftPackageDataOperationBean;
        }

        @Override // java.lang.Runnable
        public void run() {
            GameDetialGiftMoreActivity_.super.y0(this.f31721b);
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
                GameDetialGiftMoreActivity_.super.t0();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class j extends a.c {
        j(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                GameDetialGiftMoreActivity_.super.getDownloadTaskInfo();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class k implements View.OnClickListener {
        k() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GameDetialGiftMoreActivity_.this.relodingimag();
        }
    }

    /* loaded from: classes4.dex */
    class l extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ GiftPackageDataInfoBean f31726b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(String str, long j4, String str2, GiftPackageDataInfoBean giftPackageDataInfoBean) {
            super(str, j4, str2);
            this.f31726b = giftPackageDataInfoBean;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                GameDetialGiftMoreActivity_.super.s0(this.f31726b);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class m implements View.OnClickListener {
        m() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GameDetialGiftMoreActivity_.this.back_image();
        }
    }

    /* loaded from: classes4.dex */
    class n implements View.OnClickListener {
        n() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GameDetialGiftMoreActivity_.this.v0();
        }
    }

    /* loaded from: classes4.dex */
    class o implements View.OnClickListener {
        o() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GameDetialGiftMoreActivity_.this.setNetwork();
        }
    }

    /* loaded from: classes4.dex */
    class p implements View.OnClickListener {
        p() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GameDetialGiftMoreActivity_.this.D0();
        }
    }

    /* loaded from: classes4.dex */
    class q implements View.OnClickListener {
        q() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GameDetialGiftMoreActivity_.this.C0();
        }
    }

    /* loaded from: classes4.dex */
    class r implements Runnable {
        r() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GameDetialGiftMoreActivity_.super.showLoding();
        }
    }

    /* loaded from: classes4.dex */
    class s implements Runnable {
        s() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GameDetialGiftMoreActivity_.super.showLodingFailed();
        }
    }

    /* loaded from: classes4.dex */
    class t implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ GamedetialMoreGiftData f31735b;

        t(GamedetialMoreGiftData gamedetialMoreGiftData) {
            this.f31735b = gamedetialMoreGiftData;
        }

        @Override // java.lang.Runnable
        public void run() {
            GameDetialGiftMoreActivity_.super.z0(this.f31735b);
        }
    }

    /* loaded from: classes4.dex */
    public static class u extends org.androidannotations.api.builder.a<u> {

        /* renamed from: a  reason: collision with root package name */
        private Fragment f31737a;

        public u(Context context) {
            super(context, GameDetialGiftMoreActivity_.class);
        }

        public u a(String str) {
            return (u) super.extra("gameId", str);
        }

        @Override // org.androidannotations.api.builder.a, org.androidannotations.api.builder.b
        public org.androidannotations.api.builder.f startForResult(int i4) {
            Fragment fragment = this.f31737a;
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

        public u(Fragment fragment) {
            super(fragment.getActivity(), GameDetialGiftMoreActivity_.class);
            this.f31737a = fragment;
        }
    }

    public static u T0(Context context) {
        return new u(context);
    }

    public static u U0(Fragment fragment) {
        return new u(fragment);
    }

    private void init_(Bundle bundle) {
        Resources resources = getResources();
        a4.c.b(this);
        this.f31688o = resources.getString(R.string.net_excption);
        this.f31689p = resources.getString(R.string.connect_server_excption);
        injectExtras_();
    }

    private void injectExtras_() {
        Bundle extras = getIntent().getExtras();
        if (extras == null || !extras.containsKey("gameId")) {
            return;
        }
        this.f31691r = extras.getString("gameId");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameDetialGiftMoreActivity
    public void A0() {
        org.androidannotations.api.b.e("", new e(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameDetialGiftMoreActivity
    public void B0() {
        org.androidannotations.api.b.e("", new f(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameDetialGiftMoreActivity
    public void E0() {
        org.androidannotations.api.b.e("", new a(), 0L);
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.N.get(cls);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameDetialGiftMoreActivity
    public void getDownloadTaskInfo() {
        org.androidannotations.api.a.l(new j("", 0L, ""));
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        return (T) findViewById(i4);
    }

    @Override // com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.M);
        init_(bundle);
        super.onCreate(bundle);
        a4.c.c(c5);
        setContentView(R.layout.category_collection_rank);
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f31678e = (PtrClassicFrameLayout) aVar.internalFindViewById(R.id.mPtrFrame);
        this.f31679f = (TextView) aVar.internalFindViewById(R.id.title_textview);
        this.f31680g = (XListView2) aVar.internalFindViewById(R.id.rankListView);
        this.f31681h = (LinearLayout) aVar.internalFindViewById(R.id.loding_layout);
        this.f31682i = (LinearLayout) aVar.internalFindViewById(R.id.loding_faile);
        this.f31683j = (ImageView) aVar.internalFindViewById(R.id.relodingimag);
        this.f31684k = (ImageView) aVar.internalFindViewById(R.id.back_image);
        this.f31685l = (ImageView) aVar.internalFindViewById(R.id.title_normal_search_img);
        this.f31686m = (CustomerDownloadView) aVar.internalFindViewById(R.id.title_normal_download_cdv);
        View internalFindViewById = aVar.internalFindViewById(R.id.mg_loading);
        View internalFindViewById2 = aVar.internalFindViewById(R.id.setNetwork);
        ImageView imageView = this.f31683j;
        if (imageView != null) {
            imageView.setOnClickListener(new k());
        }
        ImageView imageView2 = this.f31684k;
        if (imageView2 != null) {
            imageView2.setOnClickListener(new m());
        }
        if (internalFindViewById != null) {
            internalFindViewById.setOnClickListener(new n());
        }
        if (internalFindViewById2 != null) {
            internalFindViewById2.setOnClickListener(new o());
        }
        ImageView imageView3 = this.f31685l;
        if (imageView3 != null) {
            imageView3.setOnClickListener(new p());
        }
        CustomerDownloadView customerDownloadView = this.f31686m;
        if (customerDownloadView != null) {
            customerDownloadView.setOnClickListener(new q());
        }
        afterViews();
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.N.put(cls, t4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameDetialGiftMoreActivity
    public void s0(GiftPackageDataInfoBean giftPackageDataInfoBean) {
        org.androidannotations.api.a.l(new l("", 0L, "", giftPackageDataInfoBean));
    }

    @Override // com.BaseFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i4) {
        super.setContentView(i4);
        this.M.a(this);
    }

    @Override // android.app.Activity
    public void setIntent(Intent intent) {
        super.setIntent(intent);
        injectExtras_();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameDetialGiftMoreActivity
    public void showLoding() {
        org.androidannotations.api.b.e("", new r(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameDetialGiftMoreActivity
    public void showLodingFailed() {
        org.androidannotations.api.b.e("", new s(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameDetialGiftMoreActivity
    public void showToast(String str) {
        org.androidannotations.api.b.e("", new g(str), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameDetialGiftMoreActivity
    public void t0() {
        org.androidannotations.api.a.l(new i("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameDetialGiftMoreActivity
    public void updateDownloadView() {
        org.androidannotations.api.b.e("", new c(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameDetialGiftMoreActivity
    public void w0() {
        org.androidannotations.api.b.e("", new b(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameDetialGiftMoreActivity
    public void x0(GiftPackageDataInfoBean giftPackageDataInfoBean) {
        org.androidannotations.api.b.e("", new d(giftPackageDataInfoBean), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameDetialGiftMoreActivity
    public void y0(GiftPackageDataOperationBean giftPackageDataOperationBean) {
        org.androidannotations.api.b.e("", new h(giftPackageDataOperationBean), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameDetialGiftMoreActivity
    public void z0(GamedetialMoreGiftData gamedetialMoreGiftData) {
        org.androidannotations.api.b.e("", new t(gamedetialMoreGiftData), 0L);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        this.M.a(this);
    }

    @Override // com.BaseFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        super.setContentView(view);
        this.M.a(this);
    }
}
