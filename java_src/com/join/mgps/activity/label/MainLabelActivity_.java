package com.join.mgps.activity.label;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.customview.MainLabelHeaderView;
import com.join.mgps.customview.SlidingTabLayout6;
import com.join.mgps.dto.MainLabelBean;
import java.util.HashMap;
import java.util.Map;
import org.androidannotations.api.a;
import ru.noties.scrollable.ScrollableLayout;
/* loaded from: classes4.dex */
public final class MainLabelActivity_ extends MainLabelActivity implements y3.a, a4.a, a4.b {
    public static final String R = "tag_id";
    public static final String S = "tag_name";
    public static final String T = "fromType";
    public static final String U = "fid";
    public static final String V = "postingGroup";
    private final a4.c P = new a4.c();
    private final Map<Class<?>, Object> Q = new HashMap();

    /* loaded from: classes4.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MainLabelActivity_.super.w0();
        }
    }

    /* loaded from: classes4.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MainLabelActivity_.super.A0();
        }
    }

    /* loaded from: classes4.dex */
    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MainLabelActivity_.super.z0();
        }
    }

    /* loaded from: classes4.dex */
    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MainLabelActivity_.super.p0();
        }
    }

    /* loaded from: classes4.dex */
    class e implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f39101b;

        e(String str) {
            this.f39101b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            MainLabelActivity_.super.showToast(this.f39101b);
        }
    }

    /* loaded from: classes4.dex */
    class f extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f39103b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(String str, long j4, String str2, int i4) {
            super(str, j4, str2);
            this.f39103b = i4;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                MainLabelActivity_.super.i0(this.f39103b);
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
                MainLabelActivity_.super.o0();
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
            MainLabelActivity_.this.j0();
        }
    }

    /* loaded from: classes4.dex */
    class i implements View.OnClickListener {
        i() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MainLabelActivity_.this.back_image();
        }
    }

    /* loaded from: classes4.dex */
    class j implements View.OnClickListener {
        j() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MainLabelActivity_.this.x0();
        }
    }

    /* loaded from: classes4.dex */
    class k implements View.OnClickListener {
        k() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MainLabelActivity_.this.k0();
        }
    }

    /* loaded from: classes4.dex */
    class l implements View.OnClickListener {
        l() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MainLabelActivity_.this.relodingimag();
        }
    }

    /* loaded from: classes4.dex */
    class m implements View.OnClickListener {
        m() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MainLabelActivity_.this.setNetwork();
        }
    }

    /* loaded from: classes4.dex */
    class n implements Runnable {
        n() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MainLabelActivity_.super.y0();
        }
    }

    /* loaded from: classes4.dex */
    class o implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f39113b;

        o(boolean z4) {
            this.f39113b = z4;
        }

        @Override // java.lang.Runnable
        public void run() {
            MainLabelActivity_.super.C0(this.f39113b);
        }
    }

    /* loaded from: classes4.dex */
    class p implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ MainLabelBean f39115b;

        p(MainLabelBean mainLabelBean) {
            this.f39115b = mainLabelBean;
        }

        @Override // java.lang.Runnable
        public void run() {
            MainLabelActivity_.super.D0(this.f39115b);
        }
    }

    /* loaded from: classes4.dex */
    public static class q extends org.androidannotations.api.builder.a<q> {

        /* renamed from: a  reason: collision with root package name */
        private Fragment f39117a;

        public q(Context context) {
            super(context, MainLabelActivity_.class);
        }

        public q a(int i4) {
            return (q) super.extra("fid", i4);
        }

        public q b(int i4) {
            return (q) super.extra("fromType", i4);
        }

        public q c(String str) {
            return (q) super.extra("postingGroup", str);
        }

        public q d(int i4) {
            return (q) super.extra("tag_id", i4);
        }

        public q e(String str) {
            return (q) super.extra("tag_name", str);
        }

        @Override // org.androidannotations.api.builder.a, org.androidannotations.api.builder.b
        public org.androidannotations.api.builder.f startForResult(int i4) {
            Fragment fragment = this.f39117a;
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
            super(fragment.getActivity(), MainLabelActivity_.class);
            this.f39117a = fragment;
        }
    }

    public static q O0(Context context) {
        return new q(context);
    }

    public static q P0(Fragment fragment) {
        return new q(fragment);
    }

    private void init_(Bundle bundle) {
        a4.c.b(this);
        this.f39058c = AccountUtil_.getInstance_(this);
        injectExtras_();
    }

    private void injectExtras_() {
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            if (extras.containsKey("tag_id")) {
                this.f39061f = extras.getInt("tag_id");
            }
            if (extras.containsKey("tag_name")) {
                this.f39062g = extras.getString("tag_name");
            }
            if (extras.containsKey("fromType")) {
                this.f39063h = extras.getInt("fromType");
            }
            if (extras.containsKey("fid")) {
                this.f39064i = extras.getInt("fid");
            }
            if (extras.containsKey("postingGroup")) {
                this.f39065j = extras.getString("postingGroup");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.label.MainLabelActivity
    public void A0() {
        org.androidannotations.api.b.e("", new b(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.label.MainLabelActivity
    public void C0(boolean z4) {
        org.androidannotations.api.b.e("", new o(z4), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.label.MainLabelActivity
    public void D0(MainLabelBean mainLabelBean) {
        org.androidannotations.api.b.e("", new p(mainLabelBean), 0L);
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.Q.get(cls);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.label.MainLabelActivity
    public void i0(int i4) {
        org.androidannotations.api.a.l(new f("", 0L, "", i4));
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        return (T) findViewById(i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.label.MainLabelActivity
    public void o0() {
        org.androidannotations.api.a.l(new g("", 0L, ""));
    }

    @Override // com.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.P);
        init_(bundle);
        super.onCreate(bundle);
        a4.c.c(c5);
        setContentView(R.layout.activity_main_label);
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f39059d = (LinearLayout) aVar.internalFindViewById(R.id.loding_faile);
        this.f39060e = (LinearLayout) aVar.internalFindViewById(R.id.loding_layout);
        this.f39066k = (TextView) aVar.internalFindViewById(R.id.btnFocus);
        this.f39067l = (Button) aVar.internalFindViewById(R.id.btnSendPosts);
        this.f39068m = (SlidingTabLayout6) aVar.internalFindViewById(R.id.tabsLayout);
        this.f39069n = (ScrollableLayout) aVar.internalFindViewById(R.id.scrollableLayout);
        this.f39070o = (ViewPager) aVar.internalFindViewById(R.id.viewPager);
        this.f39071p = (RelativeLayout) aVar.internalFindViewById(R.id.rl_main);
        this.f39072q = (RelativeLayout) aVar.internalFindViewById(R.id.rl_title);
        this.f39073r = (RelativeLayout) aVar.internalFindViewById(R.id.rlOrderBy);
        this.f39074s = (ImageView) aVar.internalFindViewById(R.id.iv_order);
        this.f39075t = (MainLabelHeaderView) aVar.internalFindViewById(R.id.mScrollableHeader);
        this.f39076u = (SimpleDraweeView) aVar.internalFindViewById(R.id.iv_label_administrator_avatar);
        this.f39077v = (TextView) aVar.internalFindViewById(R.id.tv_label_administrator_nickname);
        this.f39078w = (TextView) aVar.internalFindViewById(R.id.tv_posts_counts);
        this.f39079x = (TextView) aVar.internalFindViewById(R.id.tv_label_name_head);
        this.f39080y = (LinearLayout) aVar.internalFindViewById(R.id.ll_label_property);
        this.F = (ImageView) aVar.internalFindViewById(R.id.iv_close_send_posting);
        this.L = (RelativeLayout) aVar.internalFindViewById(R.id.ll_multi_type_posts);
        View internalFindViewById = aVar.internalFindViewById(R.id.back_image);
        View internalFindViewById2 = aVar.internalFindViewById(R.id.relodingimag);
        View internalFindViewById3 = aVar.internalFindViewById(R.id.setNetwork);
        TextView textView = this.f39066k;
        if (textView != null) {
            textView.setOnClickListener(new h());
        }
        if (internalFindViewById != null) {
            internalFindViewById.setOnClickListener(new i());
        }
        RelativeLayout relativeLayout = this.f39073r;
        if (relativeLayout != null) {
            relativeLayout.setOnClickListener(new j());
        }
        Button button = this.f39067l;
        if (button != null) {
            button.setOnClickListener(new k());
        }
        if (internalFindViewById2 != null) {
            internalFindViewById2.setOnClickListener(new l());
        }
        if (internalFindViewById3 != null) {
            internalFindViewById3.setOnClickListener(new m());
        }
        afterViews();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.label.MainLabelActivity
    public void p0() {
        org.androidannotations.api.b.e("", new d(), 0L);
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.Q.put(cls, t4);
    }

    @Override // com.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i4) {
        super.setContentView(i4);
        this.P.a(this);
    }

    @Override // android.app.Activity
    public void setIntent(Intent intent) {
        super.setIntent(intent);
        injectExtras_();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.label.MainLabelActivity
    public void showToast(String str) {
        org.androidannotations.api.b.e("", new e(str), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.label.MainLabelActivity
    public void w0() {
        org.androidannotations.api.b.e("", new a(), 400L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.label.MainLabelActivity
    public void y0() {
        org.androidannotations.api.b.e("", new n(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.label.MainLabelActivity
    public void z0() {
        org.androidannotations.api.b.e("", new c(), 0L);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        this.P.a(this);
    }

    @Override // com.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        super.setContentView(view);
        this.P.a(this);
    }
}
