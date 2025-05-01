package com.join.mgps.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.Fragment;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.XListView2;
import com.join.mgps.dto.AccountVoucher;
import com.join.mgps.dto.ResultMyVoucherGameBean;
import java.util.HashMap;
import java.util.Map;
import org.androidannotations.api.a;
/* loaded from: classes4.dex */
public final class MyVoucherGameActivity_ extends MyVoucherGameActivity implements y3.a, a4.a, a4.b {

    /* renamed from: r  reason: collision with root package name */
    public static final String f36106r = "mVoucher";

    /* renamed from: p  reason: collision with root package name */
    private final a4.c f36107p = new a4.c();

    /* renamed from: q  reason: collision with root package name */
    private final Map<Class<?>, Object> f36108q = new HashMap();

    /* loaded from: classes4.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MyVoucherGameActivity_.this.back_image();
        }
    }

    /* loaded from: classes4.dex */
    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MyVoucherGameActivity_.this.r0();
        }
    }

    /* loaded from: classes4.dex */
    class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MyVoucherGameActivity_.this.o0();
        }
    }

    /* loaded from: classes4.dex */
    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MyVoucherGameActivity_.super.n0();
        }
    }

    /* loaded from: classes4.dex */
    class e implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ResultMyVoucherGameBean f36113b;

        e(ResultMyVoucherGameBean resultMyVoucherGameBean) {
            this.f36113b = resultMyVoucherGameBean;
        }

        @Override // java.lang.Runnable
        public void run() {
            MyVoucherGameActivity_.super.q0(this.f36113b);
        }
    }

    /* loaded from: classes4.dex */
    class f implements Runnable {
        f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MyVoucherGameActivity_.super.p0();
        }
    }

    /* loaded from: classes4.dex */
    class g implements Runnable {
        g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MyVoucherGameActivity_.super.showLodingFailed();
        }
    }

    /* loaded from: classes4.dex */
    class h implements Runnable {
        h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MyVoucherGameActivity_.super.m0();
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
                MyVoucherGameActivity_.super.loadData();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    public static class j extends org.androidannotations.api.builder.a<j> {

        /* renamed from: a  reason: collision with root package name */
        private Fragment f36119a;

        public j(Context context) {
            super(context, MyVoucherGameActivity_.class);
        }

        public j a(AccountVoucher accountVoucher) {
            return (j) super.extra(MyVoucherGameActivity_.f36106r, accountVoucher);
        }

        @Override // org.androidannotations.api.builder.a, org.androidannotations.api.builder.b
        public org.androidannotations.api.builder.f startForResult(int i4) {
            Fragment fragment = this.f36119a;
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
            super(fragment.getActivity(), MyVoucherGameActivity_.class);
            this.f36119a = fragment;
        }
    }

    private void init_(Bundle bundle) {
        a4.c.b(this);
        injectExtras_();
    }

    private void injectExtras_() {
        Bundle extras = getIntent().getExtras();
        if (extras == null || !extras.containsKey(f36106r)) {
            return;
        }
        this.f36101m = (AccountVoucher) extras.getSerializable(f36106r);
    }

    public static j y0(Context context) {
        return new j(context);
    }

    public static j z0(Fragment fragment) {
        return new j(fragment);
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.f36108q.get(cls);
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        return (T) findViewById(i4);
    }

    @Override // com.join.mgps.activity.MyVoucherGameActivity, com.join.mgps.baseactivity.BaseLoadingActivity
    public void loadData() {
        org.androidannotations.api.a.l(new i("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MyVoucherGameActivity
    public void m0() {
        org.androidannotations.api.b.e("", new h(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MyVoucherGameActivity
    public void n0() {
        org.androidannotations.api.b.e("", new d(), 0L);
    }

    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.f36107p);
        init_(bundle);
        super.onCreate(bundle);
        a4.c.c(c5);
        setContentView(R.layout.activity_my_voucher_game);
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f36093e = (TextView) aVar.internalFindViewById(R.id.title_textview);
        this.f36094f = (TextView) aVar.internalFindViewById(R.id.gamrVoucherNumber);
        this.f36095g = (LinearLayout) aVar.internalFindViewById(R.id.voucherGameDetail);
        this.f36096h = (XListView2) aVar.internalFindViewById(R.id.listview);
        this.f36099k = (TextView) aVar.internalFindViewById(R.id.textTopRight);
        View internalFindViewById = aVar.internalFindViewById(R.id.back_image);
        if (internalFindViewById != null) {
            internalFindViewById.setOnClickListener(new a());
        }
        LinearLayout linearLayout = this.f36095g;
        if (linearLayout != null) {
            linearLayout.setOnClickListener(new b());
        }
        TextView textView = this.f36099k;
        if (textView != null) {
            textView.setOnClickListener(new c());
        }
        afterViews();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MyVoucherGameActivity
    public void p0() {
        org.androidannotations.api.b.e("", new f(), 0L);
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.f36108q.put(cls, t4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MyVoucherGameActivity
    public void q0(ResultMyVoucherGameBean resultMyVoucherGameBean) {
        org.androidannotations.api.b.e("", new e(resultMyVoucherGameBean), 0L);
    }

    @Override // com.join.mgps.baseactivity.BaseLoadingActivity, com.BaseActivity, com.BaseFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i4) {
        super.setContentView(i4);
        this.f36107p.a(this);
    }

    @Override // android.app.Activity
    public void setIntent(Intent intent) {
        super.setIntent(intent);
        injectExtras_();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.MyVoucherGameActivity
    public void showLodingFailed() {
        org.androidannotations.api.b.e("", new g(), 0L);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        this.f36107p.a(this);
    }

    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        super.setContentView(view);
        this.f36107p.a(this);
    }
}
