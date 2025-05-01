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
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.Fragment;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.dto.BbsDetailBean;
import com.join.mgps.dto.IntentDataMain;
import com.join.mgps.dto.IntroductionCommentDetailParamsBean;
import com.join.mgps.pref.PrefDef_;
import java.util.HashMap;
import java.util.Map;
import org.androidannotations.api.a;
/* loaded from: classes4.dex */
public final class IntroductionActivity_ extends IntroductionActivity implements y3.a, a4.a, a4.b {
    public static final String A1 = "tagId";
    public static final String B1 = "gameId";
    public static final String C1 = "params";

    /* renamed from: p1  reason: collision with root package name */
    public static final String f34149p1 = "intentDataMain";

    /* renamed from: v1  reason: collision with root package name */
    public static final String f34150v1 = "postId";
    private final a4.c X = new a4.c();
    private final Map<Class<?>, Object> Y = new HashMap();
    private final IntentFilter Z = new IntentFilter();

    /* renamed from: p0  reason: collision with root package name */
    private final BroadcastReceiver f34151p0 = new k();

    /* loaded from: classes4.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IntroductionActivity_.this.G0();
        }
    }

    /* loaded from: classes4.dex */
    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IntroductionActivity_.this.I0();
        }
    }

    /* loaded from: classes4.dex */
    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IntroductionActivity_.super.showLoding();
        }
    }

    /* loaded from: classes4.dex */
    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IntroductionActivity_.super.showLodingFailed();
        }
    }

    /* loaded from: classes4.dex */
    class e implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ BbsDetailBean f34156b;

        e(BbsDetailBean bbsDetailBean) {
            this.f34156b = bbsDetailBean;
        }

        @Override // java.lang.Runnable
        public void run() {
            IntroductionActivity_.super.P0(this.f34156b);
        }
    }

    /* loaded from: classes4.dex */
    class f implements Runnable {
        f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IntroductionActivity_.super.v0();
        }
    }

    /* loaded from: classes4.dex */
    class g implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f34159b;

        g(String str) {
            this.f34159b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IntroductionActivity_.super.showTost(this.f34159b);
        }
    }

    /* loaded from: classes4.dex */
    class h implements Runnable {
        h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IntroductionActivity_.super.dismissLoadingDialog();
        }
    }

    /* loaded from: classes4.dex */
    class i implements Runnable {
        i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IntroductionActivity_.super.n0();
        }
    }

    /* loaded from: classes4.dex */
    class j implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f34163b;

        j(boolean z4) {
            this.f34163b = z4;
        }

        @Override // java.lang.Runnable
        public void run() {
            IntroductionActivity_.super.R0(this.f34163b);
        }
    }

    /* loaded from: classes4.dex */
    class k extends BroadcastReceiver {
        k() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IntroductionActivity_.this.o0(intent);
        }
    }

    /* loaded from: classes4.dex */
    class l extends a.c {
        l(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                IntroductionActivity_.super.loadData();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class m extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f34167b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Integer f34168c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(String str, long j4, String str2, String str3, Integer num) {
            super(str, j4, str2);
            this.f34167b = str3;
            this.f34168c = num;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                IntroductionActivity_.super.C0(this.f34167b, this.f34168c);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class n extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Integer f34170b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(String str, long j4, String str2, Integer num) {
            super(str, j4, str2);
            this.f34170b = num;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                IntroductionActivity_.super.B0(this.f34170b);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class o implements View.OnClickListener {
        o() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IntroductionActivity_.this.L0();
        }
    }

    /* loaded from: classes4.dex */
    class p implements View.OnClickListener {
        p() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IntroductionActivity_.this.A0();
        }
    }

    /* loaded from: classes4.dex */
    class q implements View.OnClickListener {
        q() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IntroductionActivity_.this.setNetwork();
        }
    }

    /* loaded from: classes4.dex */
    class r implements View.OnClickListener {
        r() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IntroductionActivity_.this.D0();
        }
    }

    /* loaded from: classes4.dex */
    class s implements View.OnClickListener {
        s() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IntroductionActivity_.this.relodingimag();
        }
    }

    /* loaded from: classes4.dex */
    class t implements View.OnClickListener {
        t() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IntroductionActivity_.this.H0();
        }
    }

    /* loaded from: classes4.dex */
    class u implements View.OnClickListener {
        u() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IntroductionActivity_.this.E0();
        }
    }

    /* loaded from: classes4.dex */
    class v implements View.OnClickListener {
        v() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IntroductionActivity_.this.F0();
        }
    }

    /* loaded from: classes4.dex */
    public static class w extends org.androidannotations.api.builder.a<w> {

        /* renamed from: a  reason: collision with root package name */
        private Fragment f34180a;

        public w(Context context) {
            super(context, IntroductionActivity_.class);
        }

        public w a(String str) {
            return (w) super.extra("gameId", str);
        }

        public w b(IntentDataMain intentDataMain) {
            return (w) super.extra("intentDataMain", intentDataMain);
        }

        public w c(IntroductionCommentDetailParamsBean introductionCommentDetailParamsBean) {
            return (w) super.extra("params", introductionCommentDetailParamsBean);
        }

        public w d(int i4) {
            return (w) super.extra(IntroductionActivity_.f34150v1, i4);
        }

        public w e(int i4) {
            return (w) super.extra("tagId", i4);
        }

        @Override // org.androidannotations.api.builder.a, org.androidannotations.api.builder.b
        public org.androidannotations.api.builder.f startForResult(int i4) {
            Fragment fragment = this.f34180a;
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

        public w(Fragment fragment) {
            super(fragment.getActivity(), IntroductionActivity_.class);
            this.f34180a = fragment;
        }
    }

    public static w e1(Context context) {
        return new w(context);
    }

    public static w f1(Fragment fragment) {
        return new w(fragment);
    }

    private void init_(Bundle bundle) {
        this.f34140z = new PrefDef_(this);
        a4.c.b(this);
        injectExtras_();
        this.Z.addAction(o1.a.f72001g0);
        registerReceiver(this.f34151p0, this.Z);
    }

    private void injectExtras_() {
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            if (extras.containsKey("intentDataMain")) {
                this.f34135u = (IntentDataMain) extras.getSerializable("intentDataMain");
            }
            if (extras.containsKey(f34150v1)) {
                this.f34139y = extras.getInt(f34150v1);
            }
            if (extras.containsKey("tagId")) {
                this.A = extras.getInt("tagId");
            }
            if (extras.containsKey("gameId")) {
                this.E = extras.getString("gameId");
            }
            if (extras.containsKey("params")) {
                this.F = (IntroductionCommentDetailParamsBean) extras.getSerializable("params");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.IntroductionActivity
    public void B0(Integer num) {
        org.androidannotations.api.a.l(new n("", 0L, "", num));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.IntroductionActivity
    public void C0(String str, Integer num) {
        org.androidannotations.api.a.l(new m("", 0L, "", str, num));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.IntroductionActivity
    public void P0(BbsDetailBean bbsDetailBean) {
        org.androidannotations.api.b.e("", new e(bbsDetailBean), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.IntroductionActivity
    public void R0(boolean z4) {
        org.androidannotations.api.b.e("", new j(z4), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.IntroductionActivity
    public void dismissLoadingDialog() {
        org.androidannotations.api.b.e("", new h(), 0L);
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.Y.get(cls);
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        return (T) findViewById(i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.IntroductionActivity
    public void loadData() {
        org.androidannotations.api.a.l(new l("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.IntroductionActivity
    public void n0() {
        org.androidannotations.api.b.e("", new i(), 0L);
    }

    @Override // com.join.mgps.activity.IntroductionActivity, com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.X);
        init_(bundle);
        super.onCreate(bundle);
        a4.c.c(c5);
        setContentView(R.layout.introduction_activity_layout);
    }

    @Override // com.join.mgps.activity.IntroductionActivity, com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        unregisterReceiver(this.f34151p0);
        super.onDestroy();
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f34118d = (LinearLayout) aVar.internalFindViewById(R.id.loding_layout);
        this.f34119e = (LinearLayout) aVar.internalFindViewById(R.id.loding_faile);
        this.f34122h = (TextView) aVar.internalFindViewById(R.id.failedMessage);
        this.f34123i = (LinearLayout) aVar.internalFindViewById(R.id.layout_share);
        this.f34124j = (FrameLayout) aVar.internalFindViewById(R.id.video_view);
        this.f34125k = (RelativeLayout) aVar.internalFindViewById(R.id.weblayout);
        this.f34126l = (FrameLayout) aVar.internalFindViewById(R.id.fl_front_view);
        this.f34127m = (ImageView) aVar.internalFindViewById(R.id.iv_praise);
        this.f34128n = (TextView) aVar.internalFindViewById(R.id.tv_praise_num);
        this.f34129o = (TextView) aVar.internalFindViewById(R.id.tv_comment_num);
        this.f34131q = (ProgressBar) aVar.internalFindViewById(R.id.pb_progress);
        this.f34132r = (FrameLayout) aVar.internalFindViewById(R.id.fl_content);
        this.f34133s = (TextView) aVar.internalFindViewById(R.id.tv_type);
        this.f34134t = (LinearLayout) aVar.internalFindViewById(R.id.ll_progress);
        View internalFindViewById = aVar.internalFindViewById(R.id.refresh);
        View internalFindViewById2 = aVar.internalFindViewById(R.id.setNetwork);
        View internalFindViewById3 = aVar.internalFindViewById(R.id.ll_more);
        View internalFindViewById4 = aVar.internalFindViewById(R.id.relodingimag);
        View internalFindViewById5 = aVar.internalFindViewById(R.id.ll_recommend);
        View internalFindViewById6 = aVar.internalFindViewById(R.id.ll_close_drawer);
        View internalFindViewById7 = aVar.internalFindViewById(R.id.ll_comment);
        View internalFindViewById8 = aVar.internalFindViewById(R.id.ll_praise);
        if (internalFindViewById != null) {
            internalFindViewById.setOnClickListener(new o());
        }
        LinearLayout linearLayout = this.f34119e;
        if (linearLayout != null) {
            linearLayout.setOnClickListener(new p());
        }
        if (internalFindViewById2 != null) {
            internalFindViewById2.setOnClickListener(new q());
        }
        if (internalFindViewById3 != null) {
            internalFindViewById3.setOnClickListener(new r());
        }
        if (internalFindViewById4 != null) {
            internalFindViewById4.setOnClickListener(new s());
        }
        if (internalFindViewById5 != null) {
            internalFindViewById5.setOnClickListener(new t());
        }
        if (internalFindViewById6 != null) {
            internalFindViewById6.setOnClickListener(new u());
        }
        if (internalFindViewById7 != null) {
            internalFindViewById7.setOnClickListener(new v());
        }
        LinearLayout linearLayout2 = this.f34134t;
        if (linearLayout2 != null) {
            linearLayout2.setOnClickListener(new a());
        }
        if (internalFindViewById8 != null) {
            internalFindViewById8.setOnClickListener(new b());
        }
        afterview();
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.Y.put(cls, t4);
    }

    @Override // com.BaseFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i4) {
        super.setContentView(i4);
        this.X.a(this);
    }

    @Override // android.app.Activity
    public void setIntent(Intent intent) {
        super.setIntent(intent);
        injectExtras_();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.IntroductionActivity
    public void showLoding() {
        org.androidannotations.api.b.e("", new c(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.IntroductionActivity
    public void showLodingFailed() {
        org.androidannotations.api.b.e("", new d(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.IntroductionActivity
    public void showTost(String str) {
        org.androidannotations.api.b.e("", new g(str), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.IntroductionActivity
    public void v0() {
        org.androidannotations.api.b.e("", new f(), 0L);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        this.X.a(this);
    }

    @Override // com.BaseFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        super.setContentView(view);
        this.X.a(this);
    }
}
