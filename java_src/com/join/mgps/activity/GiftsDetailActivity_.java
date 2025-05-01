package com.join.mgps.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.Fragment;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.dto.GiftPackageDataInfoBean;
import com.join.mgps.dto.GiftPackageDataOperationBean;
import java.util.HashMap;
import java.util.Map;
import org.androidannotations.api.a;
/* loaded from: classes4.dex */
public final class GiftsDetailActivity_ extends GiftsDetailActivity implements y3.a, a4.a, a4.b {
    public static final String C = "gameId";
    public static final String D = "Uid";
    public static final String E = "giftPackageDataInfoBean";
    private final a4.c A = new a4.c();
    private final Map<Class<?>, Object> B = new HashMap();

    /* loaded from: classes4.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GiftsDetailActivity_.super.z0();
        }
    }

    /* loaded from: classes4.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GiftsDetailActivity_.super.r0();
        }
    }

    /* loaded from: classes4.dex */
    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GiftsDetailActivity_.super.A0();
        }
    }

    /* loaded from: classes4.dex */
    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GiftsDetailActivity_.super.B0();
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
                GiftsDetailActivity_.super.m0();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
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
                GiftsDetailActivity_.super.n0();
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
                GiftsDetailActivity_.super.o0();
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
            GiftsDetailActivity_.this.relodingimag();
        }
    }

    /* loaded from: classes4.dex */
    class i implements View.OnClickListener {
        i() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GiftsDetailActivity_.this.back_image();
        }
    }

    /* loaded from: classes4.dex */
    class j implements View.OnClickListener {
        j() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GiftsDetailActivity_.this.s0();
        }
    }

    /* loaded from: classes4.dex */
    class k implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f33382b;

        k(String str) {
            this.f33382b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            GiftsDetailActivity_.super.showToast(this.f33382b);
        }
    }

    /* loaded from: classes4.dex */
    class l implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ GiftPackageDataOperationBean f33384b;

        l(GiftPackageDataOperationBean giftPackageDataOperationBean) {
            this.f33384b = giftPackageDataOperationBean;
        }

        @Override // java.lang.Runnable
        public void run() {
            GiftsDetailActivity_.super.w0(this.f33384b);
        }
    }

    /* loaded from: classes4.dex */
    class m implements Runnable {
        m() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GiftsDetailActivity_.super.x0();
        }
    }

    /* loaded from: classes4.dex */
    class n implements Runnable {
        n() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GiftsDetailActivity_.super.q0();
        }
    }

    /* loaded from: classes4.dex */
    class o implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f33388b;

        o(String str) {
            this.f33388b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            GiftsDetailActivity_.super.t0(this.f33388b);
        }
    }

    /* loaded from: classes4.dex */
    class p implements Runnable {
        p() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GiftsDetailActivity_.super.y0();
        }
    }

    /* loaded from: classes4.dex */
    public static class q extends org.androidannotations.api.builder.a<q> {

        /* renamed from: a  reason: collision with root package name */
        private Fragment f33391a;

        public q(Context context) {
            super(context, GiftsDetailActivity_.class);
        }

        public q a(int i4) {
            return (q) super.extra("Uid", i4);
        }

        public q b(String str) {
            return (q) super.extra("gameId", str);
        }

        public q c(GiftPackageDataInfoBean giftPackageDataInfoBean) {
            return (q) super.extra(GiftsDetailActivity_.E, giftPackageDataInfoBean);
        }

        @Override // org.androidannotations.api.builder.a, org.androidannotations.api.builder.b
        public org.androidannotations.api.builder.f startForResult(int i4) {
            Fragment fragment = this.f33391a;
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
            super(fragment.getActivity(), GiftsDetailActivity_.class);
            this.f33391a = fragment;
        }
    }

    public static q P0(Context context) {
        return new q(context);
    }

    public static q Q0(Fragment fragment) {
        return new q(fragment);
    }

    private void init_(Bundle bundle) {
        a4.c.b(this);
        injectExtras_();
    }

    private void injectExtras_() {
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            if (extras.containsKey("gameId")) {
                this.f33355n = extras.getString("gameId");
            }
            if (extras.containsKey("Uid")) {
                this.f33356o = extras.getInt("Uid");
            }
            if (extras.containsKey(E)) {
                this.f33357p = (GiftPackageDataInfoBean) extras.getSerializable(E);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GiftsDetailActivity
    public void A0() {
        org.androidannotations.api.b.e("", new c(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GiftsDetailActivity
    public void B0() {
        org.androidannotations.api.b.e("", new d(), 0L);
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.B.get(cls);
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        return (T) findViewById(i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GiftsDetailActivity
    public void m0() {
        org.androidannotations.api.a.l(new e("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GiftsDetailActivity
    public void n0() {
        org.androidannotations.api.a.l(new f("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GiftsDetailActivity
    public void o0() {
        org.androidannotations.api.a.l(new g("", 0L, ""));
    }

    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.A);
        init_(bundle);
        super.onCreate(bundle);
        a4.c.c(c5);
        setContentView(R.layout.gift_detail_activity);
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f33344c = (LinearLayout) aVar.internalFindViewById(R.id.loding_layout);
        this.f33345d = (LinearLayout) aVar.internalFindViewById(R.id.loding_faile);
        this.f33346e = (ScrollView) aVar.internalFindViewById(R.id.scrollView);
        this.f33347f = (TextView) aVar.internalFindViewById(R.id.title_textview);
        this.f33348g = (SimpleDraweeView) aVar.internalFindViewById(R.id.giftIcon);
        this.f33349h = (TextView) aVar.internalFindViewById(R.id.giftNameTv);
        this.f33350i = (TextView) aVar.internalFindViewById(R.id.saveCodeTv);
        this.f33351j = (TextView) aVar.internalFindViewById(R.id.saveCodeContent);
        this.f33352k = (TextView) aVar.internalFindViewById(R.id.giftContent);
        this.f33353l = (TextView) aVar.internalFindViewById(R.id.giftTime);
        this.f33354m = (TextView) aVar.internalFindViewById(R.id.giftMethod);
        View internalFindViewById = aVar.internalFindViewById(R.id.relodingimag);
        View internalFindViewById2 = aVar.internalFindViewById(R.id.back_image);
        if (internalFindViewById != null) {
            internalFindViewById.setOnClickListener(new h());
        }
        if (internalFindViewById2 != null) {
            internalFindViewById2.setOnClickListener(new i());
        }
        TextView textView = this.f33350i;
        if (textView != null) {
            textView.setOnClickListener(new j());
        }
        afterViews();
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.B.put(cls, t4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GiftsDetailActivity
    public void q0() {
        org.androidannotations.api.b.e("", new n(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GiftsDetailActivity
    public void r0() {
        org.androidannotations.api.b.e("", new b(), 0L);
    }

    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
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
    @Override // com.join.mgps.activity.GiftsDetailActivity
    public void showToast(String str) {
        org.androidannotations.api.b.e("", new k(str), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GiftsDetailActivity
    public void t0(String str) {
        org.androidannotations.api.b.e("", new o(str), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GiftsDetailActivity
    public void w0(GiftPackageDataOperationBean giftPackageDataOperationBean) {
        org.androidannotations.api.b.e("", new l(giftPackageDataOperationBean), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GiftsDetailActivity
    public void x0() {
        org.androidannotations.api.b.e("", new m(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GiftsDetailActivity
    public void y0() {
        org.androidannotations.api.b.e("", new p(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GiftsDetailActivity
    public void z0() {
        org.androidannotations.api.b.e("", new a(), 0L);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        this.A.a(this);
    }

    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        super.setContentView(view);
        this.A.a(this);
    }
}
