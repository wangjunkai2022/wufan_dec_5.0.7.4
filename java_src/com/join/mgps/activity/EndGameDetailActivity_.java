package com.join.mgps.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import com.facebook.drawee.view.SimpleDraweeView;
import com.flyco.tablayout.SlidingTabLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.join.android.app.component.video.StandardVideoView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.dto.EndGameDetailBean;
import com.join.mgps.pref.PrefDef_;
import java.util.HashMap;
import java.util.Map;
import org.androidannotations.api.a;
/* loaded from: classes4.dex */
public final class EndGameDetailActivity_ extends EndGameDetailActivity implements y3.a, a4.a, a4.b {
    public static final String O = "gameId";
    public static final String P = "endGameId";
    public static final String Q = "rules";
    public static final String R = "isFromVideo";
    private final a4.c M = new a4.c();
    private final Map<Class<?>, Object> N = new HashMap();

    /* loaded from: classes4.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            EndGameDetailActivity_.super.showLodingFailed();
        }
    }

    /* loaded from: classes4.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            EndGameDetailActivity_.super.t0();
        }
    }

    /* loaded from: classes4.dex */
    class c implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f30164b;

        c(String str) {
            this.f30164b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            EndGameDetailActivity_.super.showTost(this.f30164b);
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
                EndGameDetailActivity_.super.getEndGameConfig();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class e extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f30167b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(String str, long j4, String str2, boolean z4) {
            super(str, j4, str2);
            this.f30167b = z4;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                EndGameDetailActivity_.super.getData(this.f30167b);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class f implements View.OnClickListener {
        f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            EndGameDetailActivity_.this.o0();
        }
    }

    /* loaded from: classes4.dex */
    class g implements View.OnClickListener {
        g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            EndGameDetailActivity_.this.p0();
        }
    }

    /* loaded from: classes4.dex */
    class h implements View.OnClickListener {
        h() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            EndGameDetailActivity_.this.i0();
        }
    }

    /* loaded from: classes4.dex */
    class i implements View.OnClickListener {
        i() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            EndGameDetailActivity_.this.j0();
        }
    }

    /* loaded from: classes4.dex */
    class j implements View.OnClickListener {
        j() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            EndGameDetailActivity_.this.setNetwork();
        }
    }

    /* loaded from: classes4.dex */
    class k implements View.OnClickListener {
        k() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            EndGameDetailActivity_.this.relodingimag();
        }
    }

    /* loaded from: classes4.dex */
    class l implements View.OnClickListener {
        l() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            EndGameDetailActivity_.this.h0();
        }
    }

    /* loaded from: classes4.dex */
    class m implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ EndGameDetailBean f30176b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f30177c;

        m(EndGameDetailBean endGameDetailBean, boolean z4) {
            this.f30176b = endGameDetailBean;
            this.f30177c = z4;
        }

        @Override // java.lang.Runnable
        public void run() {
            EndGameDetailActivity_.super.u0(this.f30176b, this.f30177c);
        }
    }

    /* loaded from: classes4.dex */
    class n implements Runnable {
        n() {
        }

        @Override // java.lang.Runnable
        public void run() {
            EndGameDetailActivity_.super.showLoding();
        }
    }

    /* loaded from: classes4.dex */
    public static class o extends org.androidannotations.api.builder.a<o> {

        /* renamed from: a  reason: collision with root package name */
        private Fragment f30180a;

        public o(Context context) {
            super(context, EndGameDetailActivity_.class);
        }

        public o a(String str) {
            return (o) super.extra("endGameId", str);
        }

        public o b(String str) {
            return (o) super.extra("gameId", str);
        }

        public o c(boolean z4) {
            return (o) super.extra(EndGameDetailActivity_.R, z4);
        }

        public o d(String str) {
            return (o) super.extra("rules", str);
        }

        @Override // org.androidannotations.api.builder.a, org.androidannotations.api.builder.b
        public org.androidannotations.api.builder.f startForResult(int i4) {
            Fragment fragment = this.f30180a;
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

        public o(Fragment fragment) {
            super(fragment.getActivity(), EndGameDetailActivity_.class);
            this.f30180a = fragment;
        }
    }

    public static o C0(Context context) {
        return new o(context);
    }

    public static o D0(Fragment fragment) {
        return new o(fragment);
    }

    private void init_(Bundle bundle) {
        this.E = new PrefDef_(this);
        a4.c.b(this);
        injectExtras_();
    }

    private void injectExtras_() {
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            if (extras.containsKey("gameId")) {
                this.A = extras.getString("gameId");
            }
            if (extras.containsKey("endGameId")) {
                this.B = extras.getString("endGameId");
            }
            if (extras.containsKey("rules")) {
                this.C = extras.getString("rules");
            }
            if (extras.containsKey(R)) {
                this.D = extras.getBoolean(R);
            }
        }
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.N.get(cls);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.EndGameDetailActivity
    public void getData(boolean z4) {
        org.androidannotations.api.a.l(new e("", 0L, "", z4));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.EndGameDetailActivity
    public void getEndGameConfig() {
        org.androidannotations.api.a.l(new d("", 0L, ""));
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        return (T) findViewById(i4);
    }

    @Override // com.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.M);
        init_(bundle);
        super.onCreate(bundle);
        a4.c.c(c5);
        setContentView(R.layout.activity_end_game_detail);
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f30134b = (AppBarLayout) aVar.internalFindViewById(R.id.appbar);
        this.f30135c = (CollapsingToolbarLayout) aVar.internalFindViewById(R.id.collapsingToolbarLayout);
        this.f30136d = aVar.internalFindViewById(R.id.nullView);
        this.f30137e = (SimpleDraweeView) aVar.internalFindViewById(R.id.iv_book_bg);
        this.f30138f = (StandardVideoView) aVar.internalFindViewById(R.id.videoPlayer);
        this.f30139g = (TextView) aVar.internalFindViewById(R.id.tvTitle);
        this.f30140h = (TextView) aVar.internalFindViewById(R.id.tvIntro);
        this.f30141i = (SimpleDraweeView) aVar.internalFindViewById(R.id.ivAuthorAvatar);
        this.f30142j = (TextView) aVar.internalFindViewById(R.id.tvAuthorName);
        this.f30143k = (TextView) aVar.internalFindViewById(R.id.tvPassRate);
        this.f30144l = (TextView) aVar.internalFindViewById(R.id.tvBestScore);
        this.f30145m = (SlidingTabLayout) aVar.internalFindViewById(R.id.tablayout);
        this.f30146n = (ViewPager) aVar.internalFindViewById(R.id.viewpager);
        this.f30147o = (LinearLayout) aVar.internalFindViewById(R.id.llShare);
        this.f30148p = (TextView) aVar.internalFindViewById(R.id.btnStart);
        this.f30149q = (ImageView) aVar.internalFindViewById(R.id.ivBack);
        this.f30150r = (ImageView) aVar.internalFindViewById(R.id.ivMenu);
        this.f30151s = (TextView) aVar.internalFindViewById(R.id.tvTopTitle);
        this.f30152t = (LinearLayout) aVar.internalFindViewById(R.id.llTop);
        this.f30153u = (ConstraintLayout) aVar.internalFindViewById(R.id.clBottom);
        this.f30154v = (LinearLayout) aVar.internalFindViewById(R.id.loding_layout);
        this.f30155w = (LinearLayout) aVar.internalFindViewById(R.id.loding_faile);
        this.f30156x = (CoordinatorLayout) aVar.internalFindViewById(R.id.coordinatorLayout);
        this.f30157y = (ImageView) aVar.internalFindViewById(R.id.tagPass);
        this.f30158z = (SimpleDraweeView) aVar.internalFindViewById(R.id.ivGameIcon);
        View internalFindViewById = aVar.internalFindViewById(R.id.clAuthor);
        View internalFindViewById2 = aVar.internalFindViewById(R.id.clShare);
        View internalFindViewById3 = aVar.internalFindViewById(R.id.setNetwork);
        View internalFindViewById4 = aVar.internalFindViewById(R.id.relodingimag);
        ImageView imageView = this.f30149q;
        if (imageView != null) {
            imageView.setOnClickListener(new f());
        }
        ImageView imageView2 = this.f30150r;
        if (imageView2 != null) {
            imageView2.setOnClickListener(new g());
        }
        if (internalFindViewById != null) {
            internalFindViewById.setOnClickListener(new h());
        }
        if (internalFindViewById2 != null) {
            internalFindViewById2.setOnClickListener(new i());
        }
        if (internalFindViewById3 != null) {
            internalFindViewById3.setOnClickListener(new j());
        }
        if (internalFindViewById4 != null) {
            internalFindViewById4.setOnClickListener(new k());
        }
        TextView textView = this.f30148p;
        if (textView != null) {
            textView.setOnClickListener(new l());
        }
        afterviews();
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.N.put(cls, t4);
    }

    @Override // com.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
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
    @Override // com.join.mgps.activity.EndGameDetailActivity
    public void showLoding() {
        org.androidannotations.api.b.e("", new n(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.EndGameDetailActivity
    public void showLodingFailed() {
        org.androidannotations.api.b.e("", new a(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.EndGameDetailActivity
    public void showTost(String str) {
        org.androidannotations.api.b.e("", new c(str), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.EndGameDetailActivity
    public void t0() {
        org.androidannotations.api.b.e("", new b(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.EndGameDetailActivity
    public void u0(EndGameDetailBean endGameDetailBean, boolean z4) {
        org.androidannotations.api.b.e("", new m(endGameDetailBean, z4), 0L);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        this.M.a(this);
    }

    @Override // com.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        super.setContentView(view);
        this.M.a(this);
    }
}
