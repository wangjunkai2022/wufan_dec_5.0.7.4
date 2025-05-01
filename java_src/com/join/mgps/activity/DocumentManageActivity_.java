package com.join.mgps.activity;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.Fragment;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.dto.ArchiveNumDataBean;
import com.join.mgps.dto.CloudListDataBean;
import com.join.mgps.pref.PrefDef_;
import java.util.HashMap;
import java.util.Map;
import org.androidannotations.api.a;
/* loaded from: classes4.dex */
public final class DocumentManageActivity_ extends DocumentManageActivity implements y3.a, a4.a, a4.b {
    public static final String I1 = "from";
    public static final String J1 = "gameid";
    private final a4.c A1 = new a4.c();
    private final Map<Class<?>, Object> B1 = new HashMap();
    private final IntentFilter C1 = new IntentFilter();
    private final BroadcastReceiver D1 = new k();
    private final IntentFilter E1 = new IntentFilter();
    private final BroadcastReceiver F1 = new m();
    private final IntentFilter G1 = new IntentFilter();
    private final BroadcastReceiver H1 = new n();

    /* loaded from: classes4.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DocumentManageActivity_.this.B0();
        }
    }

    /* loaded from: classes4.dex */
    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DocumentManageActivity_.this.t0();
        }
    }

    /* loaded from: classes4.dex */
    class c implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ArchiveNumDataBean f29928b;

        c(ArchiveNumDataBean archiveNumDataBean) {
            this.f29928b = archiveNumDataBean;
        }

        @Override // java.lang.Runnable
        public void run() {
            DocumentManageActivity_.super.G0(this.f29928b);
        }
    }

    /* loaded from: classes4.dex */
    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            DocumentManageActivity_.super.showRedPoint();
        }
    }

    /* loaded from: classes4.dex */
    class e implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f29931b;

        e(int i4) {
            this.f29931b = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            DocumentManageActivity_.super.H0(this.f29931b);
        }
    }

    /* loaded from: classes4.dex */
    class f implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f29933b;

        f(int i4) {
            this.f29933b = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            DocumentManageActivity_.super.F0(this.f29933b);
        }
    }

    /* loaded from: classes4.dex */
    class g implements Runnable {
        g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            DocumentManageActivity_.super.hideRedPoint();
        }
    }

    /* loaded from: classes4.dex */
    class h implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CloudListDataBean f29936b;

        h(CloudListDataBean cloudListDataBean) {
            this.f29936b = cloudListDataBean;
        }

        @Override // java.lang.Runnable
        public void run() {
            DocumentManageActivity_.super.I0(this.f29936b);
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
                DocumentManageActivity_.super.n0();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class j extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CloudListDataBean f29939b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(String str, long j4, String str2, CloudListDataBean cloudListDataBean) {
            super(str, j4, str2);
            this.f29939b = cloudListDataBean;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                DocumentManageActivity_.super.k0(this.f29939b);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class k extends BroadcastReceiver {
        k() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            DocumentManageActivity_.this.y0(intent);
        }
    }

    /* loaded from: classes4.dex */
    class l extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f29942b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f29943c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f29944d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(String str, long j4, String str2, String str3, String str4, String str5) {
            super(str, j4, str2);
            this.f29942b = str3;
            this.f29943c = str4;
            this.f29944d = str5;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                DocumentManageActivity_.super.l0(this.f29942b, this.f29943c, this.f29944d);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class m extends BroadcastReceiver {
        m() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            DocumentManageActivity_.this.E0();
        }
    }

    /* loaded from: classes4.dex */
    class n extends BroadcastReceiver {
        n() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            DocumentManageActivity_.this.z0(intent);
        }
    }

    /* loaded from: classes4.dex */
    class o implements View.OnClickListener {
        o() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DocumentManageActivity_.this.w0();
        }
    }

    /* loaded from: classes4.dex */
    class p implements View.OnClickListener {
        p() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DocumentManageActivity_.this.v0();
        }
    }

    /* loaded from: classes4.dex */
    class q implements View.OnClickListener {
        q() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DocumentManageActivity_.this.x0();
        }
    }

    /* loaded from: classes4.dex */
    class r implements View.OnClickListener {
        r() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DocumentManageActivity_.this.u0();
        }
    }

    /* loaded from: classes4.dex */
    class s implements View.OnClickListener {
        s() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DocumentManageActivity_.this.A0();
        }
    }

    /* loaded from: classes4.dex */
    class t implements View.OnClickListener {
        t() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DocumentManageActivity_.this.h0();
        }
    }

    /* loaded from: classes4.dex */
    public static class u extends org.androidannotations.api.builder.a<u> {

        /* renamed from: a  reason: collision with root package name */
        private Fragment f29954a;

        public u(Context context) {
            super(context, DocumentManageActivity_.class);
        }

        public u a(int i4) {
            return (u) super.extra("from", i4);
        }

        public u b(String str) {
            return (u) super.extra("gameid", str);
        }

        @Override // org.androidannotations.api.builder.a, org.androidannotations.api.builder.b
        public org.androidannotations.api.builder.f startForResult(int i4) {
            Fragment fragment = this.f29954a;
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
            super(fragment.getActivity(), DocumentManageActivity_.class);
            this.f29954a = fragment;
        }
    }

    public static u S0(Context context) {
        return new u(context);
    }

    public static u T0(Fragment fragment) {
        return new u(fragment);
    }

    private void init_(Bundle bundle) {
        this.f29916v = new PrefDef_(this);
        a4.c.b(this);
        injectExtras_();
        this.C1.addAction(o1.a.f72003h0);
        this.E1.addAction("com.wufun.cloud.showDownDialog");
        this.G1.addAction("com.cloud.downCloud.all");
        registerReceiver(this.D1, this.C1);
        registerReceiver(this.F1, this.E1);
        registerReceiver(this.H1, this.G1);
    }

    private void injectExtras_() {
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            if (extras.containsKey("from")) {
                DocumentManageActivity.f29893v1 = extras.getInt("from");
            }
            if (extras.containsKey("gameid")) {
                this.f29920z = extras.getString("gameid");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.DocumentManageActivity
    public void F0(int i4) {
        org.androidannotations.api.b.e("", new f(i4), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.DocumentManageActivity
    public void G0(ArchiveNumDataBean archiveNumDataBean) {
        org.androidannotations.api.b.e("", new c(archiveNumDataBean), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.DocumentManageActivity
    public void H0(int i4) {
        org.androidannotations.api.b.e("", new e(i4), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.DocumentManageActivity
    public void I0(CloudListDataBean cloudListDataBean) {
        org.androidannotations.api.b.e("", new h(cloudListDataBean), 0L);
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.B1.get(cls);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.DocumentManageActivity
    public void hideRedPoint() {
        org.androidannotations.api.b.e("", new g(), 0L);
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        return (T) findViewById(i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.DocumentManageActivity
    public void k0(CloudListDataBean cloudListDataBean) {
        org.androidannotations.api.a.l(new j("", 0L, "", cloudListDataBean));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.DocumentManageActivity
    public void l0(String str, String str2, String str3) {
        org.androidannotations.api.a.l(new l("", 0L, "", str, str2, str3));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.DocumentManageActivity
    public void n0() {
        org.androidannotations.api.a.l(new i("", 0L, ""));
    }

    @Override // com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.A1);
        init_(bundle);
        super.onCreate(bundle);
        a4.c.c(c5);
        setContentView(R.layout.activity_document_manage);
    }

    @Override // com.join.mgps.activity.DocumentManageActivity, com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        unregisterReceiver(this.D1);
        unregisterReceiver(this.F1);
        unregisterReceiver(this.H1);
        super.onDestroy();
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f29894b = (LinearLayout) aVar.internalFindViewById(R.id.archive_back);
        this.f29895c = (RelativeLayout) aVar.internalFindViewById(R.id.rl_myarchive);
        this.f29896d = (TextView) aVar.internalFindViewById(R.id.tv_myarchive_size);
        this.f29897e = (ImageView) aVar.internalFindViewById(R.id.iv_myarchive_open);
        this.f29898f = (RadioGroup) aVar.internalFindViewById(R.id.rg_myarchive);
        this.f29899g = (RadioButton) aVar.internalFindViewById(R.id.rb_local);
        this.f29900h = (RadioButton) aVar.internalFindViewById(R.id.rb_colud);
        this.f29901i = (RelativeLayout) aVar.internalFindViewById(R.id.rl_shop);
        this.f29902j = (TextView) aVar.internalFindViewById(R.id.tv_shop_size);
        this.f29903k = (ImageView) aVar.internalFindViewById(R.id.iv_shop_open);
        this.f29904l = (RadioGroup) aVar.internalFindViewById(R.id.rg_myshop);
        this.f29905m = (RadioButton) aVar.internalFindViewById(R.id.rb_remoned);
        this.f29906n = (RadioButton) aVar.internalFindViewById(R.id.rb_buy);
        this.f29907o = (LinearLayout) aVar.internalFindViewById(R.id.ll_manage);
        this.f29908p = (TextView) aVar.internalFindViewById(R.id.tv_manage);
        this.f29911q = (FrameLayout) aVar.internalFindViewById(R.id.frag);
        this.f29912r = (RelativeLayout) aVar.internalFindViewById(R.id.rl_bg);
        this.f29913s = (SimpleDraweeView) aVar.internalFindViewById(R.id.simdw);
        this.f29914t = (TextView) aVar.internalFindViewById(R.id.tv_red);
        RadioButton radioButton = this.f29899g;
        if (radioButton != null) {
            radioButton.setOnClickListener(new o());
        }
        RadioButton radioButton2 = this.f29900h;
        if (radioButton2 != null) {
            radioButton2.setOnClickListener(new p());
        }
        RadioButton radioButton3 = this.f29905m;
        if (radioButton3 != null) {
            radioButton3.setOnClickListener(new q());
        }
        RadioButton radioButton4 = this.f29906n;
        if (radioButton4 != null) {
            radioButton4.setOnClickListener(new r());
        }
        RelativeLayout relativeLayout = this.f29895c;
        if (relativeLayout != null) {
            relativeLayout.setOnClickListener(new s());
        }
        LinearLayout linearLayout = this.f29894b;
        if (linearLayout != null) {
            linearLayout.setOnClickListener(new t());
        }
        RelativeLayout relativeLayout2 = this.f29901i;
        if (relativeLayout2 != null) {
            relativeLayout2.setOnClickListener(new a());
        }
        LinearLayout linearLayout2 = this.f29907o;
        if (linearLayout2 != null) {
            linearLayout2.setOnClickListener(new b());
        }
        afterViews();
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.B1.put(cls, t4);
    }

    @Override // com.BaseFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i4) {
        super.setContentView(i4);
        this.A1.a(this);
    }

    @Override // android.app.Activity
    public void setIntent(Intent intent) {
        super.setIntent(intent);
        injectExtras_();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.DocumentManageActivity
    public void showRedPoint() {
        org.androidannotations.api.b.e("", new d(), 0L);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        this.A1.a(this);
    }

    @Override // com.BaseFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        super.setContentView(view);
        this.A1.a(this);
    }
}
