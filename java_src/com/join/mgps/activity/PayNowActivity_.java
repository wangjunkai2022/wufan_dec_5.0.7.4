package com.join.mgps.activity;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.Fragment;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.dto.ExtBean;
import com.join.mgps.dto.IntentDataMain;
import com.join.mgps.dto.PapayOrder;
import com.join.mgps.pref.PrefDef_;
import java.util.HashMap;
import java.util.Map;
import org.androidannotations.api.a;
/* loaded from: classes4.dex */
public final class PayNowActivity_ extends PayNowActivity implements y3.a, a4.a, a4.b {
    public static final String W = "order";
    public static final String X = "intentDataMain";
    public static final String Y = "extBean";
    private final a4.c S = new a4.c();
    private final Map<Class<?>, Object> T = new HashMap();
    private final IntentFilter U = new IntentFilter();
    private final BroadcastReceiver V = new b();

    /* loaded from: classes4.dex */
    class a extends a.c {
        a(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                PayNowActivity_.super.checkToken();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class b extends BroadcastReceiver {
        b() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            PayNowActivity_.this.G0(intent);
        }
    }

    /* loaded from: classes4.dex */
    class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            PayNowActivity_.this.p0();
        }
    }

    /* loaded from: classes4.dex */
    class d implements View.OnClickListener {
        d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            PayNowActivity_.this.ok();
        }
    }

    /* loaded from: classes4.dex */
    class e implements View.OnClickListener {
        e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            PayNowActivity_.this.H0();
        }
    }

    /* loaded from: classes4.dex */
    class f implements View.OnClickListener {
        f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            PayNowActivity_.this.o0();
        }
    }

    /* loaded from: classes4.dex */
    class g implements View.OnClickListener {
        g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            PayNowActivity_.this.F0();
        }
    }

    /* loaded from: classes4.dex */
    class h implements View.OnClickListener {
        h() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            PayNowActivity_.this.q0();
        }
    }

    /* loaded from: classes4.dex */
    class i implements View.OnClickListener {
        i() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            PayNowActivity_.this.v0();
        }
    }

    /* loaded from: classes4.dex */
    class j implements View.OnClickListener {
        j() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            PayNowActivity_.this.t0();
        }
    }

    /* loaded from: classes4.dex */
    public static class k extends org.androidannotations.api.builder.a<k> {

        /* renamed from: a  reason: collision with root package name */
        private Fragment f36903a;

        public k(Context context) {
            super(context, PayNowActivity_.class);
        }

        public k a(ExtBean extBean) {
            return (k) super.extra("extBean", extBean);
        }

        public k b(IntentDataMain intentDataMain) {
            return (k) super.extra("intentDataMain", intentDataMain);
        }

        public k c(PapayOrder papayOrder) {
            return (k) super.extra(PayNowActivity_.W, papayOrder);
        }

        @Override // org.androidannotations.api.builder.a, org.androidannotations.api.builder.b
        public org.androidannotations.api.builder.f startForResult(int i4) {
            Fragment fragment = this.f36903a;
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
            super(fragment.getActivity(), PayNowActivity_.class);
            this.f36903a = fragment;
        }
    }

    public static k L0(Context context) {
        return new k(context);
    }

    public static k M0(Fragment fragment) {
        return new k(fragment);
    }

    private void init_(Bundle bundle) {
        this.f36879u = new PrefDef_(this);
        a4.c.b(this);
        injectExtras_();
        this.U.addAction(o1.a.L);
        registerReceiver(this.V, this.U);
    }

    private void injectExtras_() {
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            if (extras.containsKey(W)) {
                this.f36880v = (PapayOrder) extras.getSerializable(W);
            }
            if (extras.containsKey("intentDataMain")) {
                this.f36881w = (IntentDataMain) extras.getSerializable("intentDataMain");
            }
            if (extras.containsKey("extBean")) {
                this.f36882x = (ExtBean) extras.getSerializable("extBean");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.PayNowActivity
    public void checkToken() {
        org.androidannotations.api.a.l(new a("", 0L, ""));
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.T.get(cls);
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        return (T) findViewById(i4);
    }

    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.S);
        init_(bundle);
        super.onCreate(bundle);
        a4.c.c(c5);
        setContentView(R.layout.activity_pay_now);
    }

    @Override // com.join.mgps.activity.PayNowActivity, com.BaseActivity, com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        unregisterReceiver(this.V);
        super.onDestroy();
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f36860b = (LinearLayout) aVar.internalFindViewById(R.id.papa_pay);
        this.f36861c = (TextView) aVar.internalFindViewById(R.id.payTitle);
        this.f36862d = (LinearLayout) aVar.internalFindViewById(R.id.payDefault);
        this.f36863e = (HorizontalScrollView) aVar.internalFindViewById(R.id.payChoisePayType);
        this.f36864f = (LinearLayout) aVar.internalFindViewById(R.id.payLoding);
        this.f36865g = (TextView) aVar.internalFindViewById(R.id.payProduct);
        this.f36866h = (TextView) aVar.internalFindViewById(R.id.payMoney);
        this.f36867i = (TextView) aVar.internalFindViewById(R.id.anotherPayType);
        this.f36868j = (Button) aVar.internalFindViewById(R.id.ok);
        this.f36869k = (ImageView) aVar.internalFindViewById(R.id.weichatPay);
        this.f36870l = (ImageView) aVar.internalFindViewById(R.id.aliPay);
        this.f36871m = (ImageView) aVar.internalFindViewById(R.id.unionpay);
        this.f36872n = (ImageView) aVar.internalFindViewById(R.id.creditCardPay);
        this.f36873o = (LinearLayout) aVar.internalFindViewById(R.id.layoutPabiPay);
        this.f36874p = (LinearLayout) aVar.internalFindViewById(R.id.layouthongbaoPay);
        this.f36875q = (LinearLayout) aVar.internalFindViewById(R.id.layoutWeixin);
        this.f36876r = (LinearLayout) aVar.internalFindViewById(R.id.layoutAlipay);
        this.f36877s = (LinearLayout) aVar.internalFindViewById(R.id.layoutUnionpay);
        this.f36878t = (LinearLayout) aVar.internalFindViewById(R.id.layoutCreditCardPay);
        View internalFindViewById = aVar.internalFindViewById(R.id.pabiPay);
        View internalFindViewById2 = aVar.internalFindViewById(R.id.hongbaoPay);
        TextView textView = this.f36867i;
        if (textView != null) {
            textView.setOnClickListener(new c());
        }
        Button button = this.f36868j;
        if (button != null) {
            button.setOnClickListener(new d());
        }
        ImageView imageView = this.f36869k;
        if (imageView != null) {
            imageView.setOnClickListener(new e());
        }
        ImageView imageView2 = this.f36870l;
        if (imageView2 != null) {
            imageView2.setOnClickListener(new f());
        }
        ImageView imageView3 = this.f36871m;
        if (imageView3 != null) {
            imageView3.setOnClickListener(new g());
        }
        ImageView imageView4 = this.f36872n;
        if (imageView4 != null) {
            imageView4.setOnClickListener(new h());
        }
        if (internalFindViewById != null) {
            internalFindViewById.setOnClickListener(new i());
        }
        if (internalFindViewById2 != null) {
            internalFindViewById2.setOnClickListener(new j());
        }
        afterview();
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.T.put(cls, t4);
    }

    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i4) {
        super.setContentView(i4);
        this.S.a(this);
    }

    @Override // android.app.Activity
    public void setIntent(Intent intent) {
        super.setIntent(intent);
        injectExtras_();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        this.S.a(this);
    }

    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        super.setContentView(view);
        this.S.a(this);
    }
}
