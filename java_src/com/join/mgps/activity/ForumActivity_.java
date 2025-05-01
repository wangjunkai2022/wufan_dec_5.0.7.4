package com.join.mgps.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.ForumGroupHeaderView;
import com.join.mgps.customview.ForumLoadingView;
import com.join.mgps.customview.SlidingTabLayout4;
import com.join.mgps.dto.ForumData;
import com.join.mgps.ptr.PtrClassicFrameLayout;
import java.util.HashMap;
import java.util.Map;
import org.androidannotations.api.a;
import ru.noties.scrollable.ScrollableLayout;
/* loaded from: classes4.dex */
public final class ForumActivity_ extends ForumActivity implements y3.a, a4.a, a4.b {
    public static final String H = "fid";
    public static final String I = "from";
    private final a4.c F = new a4.c();
    private final Map<Class<?>, Object> G = new HashMap();

    /* loaded from: classes4.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ForumActivity_.super.B0();
        }
    }

    /* loaded from: classes4.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ForumActivity_.super.t0();
        }
    }

    /* loaded from: classes4.dex */
    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ForumActivity_.super.D0();
        }
    }

    /* loaded from: classes4.dex */
    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ForumActivity_.super.F0();
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
                ForumActivity_.super.s0();
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
                ForumActivity_.super.y0();
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
                ForumActivity_.super.o0();
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
            ForumActivity_.this.H0();
        }
    }

    /* loaded from: classes4.dex */
    class i implements View.OnClickListener {
        i() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ForumActivity_.this.back_image();
        }
    }

    /* loaded from: classes4.dex */
    class j implements View.OnClickListener {
        j() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ForumActivity_.this.E0();
        }
    }

    /* loaded from: classes4.dex */
    class k implements View.OnClickListener {
        k() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ForumActivity_.this.l0();
        }
    }

    /* loaded from: classes4.dex */
    class l implements View.OnClickListener {
        l() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ForumActivity_.this.p0();
        }
    }

    /* loaded from: classes4.dex */
    class m implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f30372b;

        m(boolean z4) {
            this.f30372b = z4;
        }

        @Override // java.lang.Runnable
        public void run() {
            ForumActivity_.super.m0(this.f30372b);
        }
    }

    /* loaded from: classes4.dex */
    class n implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ForumData.ForumGroupIndex f30374b;

        n(ForumData.ForumGroupIndex forumGroupIndex) {
            this.f30374b = forumGroupIndex;
        }

        @Override // java.lang.Runnable
        public void run() {
            ForumActivity_.super.G0(this.f30374b);
        }
    }

    /* loaded from: classes4.dex */
    class o implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f30376b;

        o(String str) {
            this.f30376b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            ForumActivity_.super.f0(this.f30376b);
        }
    }

    /* loaded from: classes4.dex */
    class p implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f30378b;

        p(int i4) {
            this.f30378b = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            ForumActivity_.super.n0(this.f30378b);
        }
    }

    /* loaded from: classes4.dex */
    public static class q extends org.androidannotations.api.builder.a<q> {

        /* renamed from: a  reason: collision with root package name */
        private Fragment f30380a;

        public q(Context context) {
            super(context, ForumActivity_.class);
        }

        public q a(int i4) {
            return (q) super.extra("fid", i4);
        }

        public q b(String str) {
            return (q) super.extra("from", str);
        }

        @Override // org.androidannotations.api.builder.a, org.androidannotations.api.builder.b
        public org.androidannotations.api.builder.f startForResult(int i4) {
            Fragment fragment = this.f30380a;
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
            super(fragment.getActivity(), ForumActivity_.class);
            this.f30380a = fragment;
        }
    }

    public static q U0(Context context) {
        return new q(context);
    }

    public static q V0(Fragment fragment) {
        return new q(fragment);
    }

    private void init_(Bundle bundle) {
        a4.c.b(this);
        injectExtras_();
    }

    private void injectExtras_() {
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            if (extras.containsKey("fid")) {
                this.f30339p = extras.getInt("fid");
            }
            if (extras.containsKey("from")) {
                this.f30340q = extras.getString("from");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ForumActivity
    public void B0() {
        org.androidannotations.api.b.e("", new a(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ForumActivity
    public void D0() {
        org.androidannotations.api.b.e("", new c(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ForumActivity
    public void F0() {
        org.androidannotations.api.b.e("", new d(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ForumActivity
    public void G0(ForumData.ForumGroupIndex forumGroupIndex) {
        org.androidannotations.api.b.e("", new n(forumGroupIndex), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ForumActivity
    public void f0(String str) {
        org.androidannotations.api.b.e("", new o(str), 0L);
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.G.get(cls);
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        return (T) findViewById(i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ForumActivity
    public void m0(boolean z4) {
        org.androidannotations.api.b.e("", new m(z4), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ForumActivity
    public void n0(int i4) {
        org.androidannotations.api.b.e("", new p(i4), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ForumActivity
    public void o0() {
        org.androidannotations.api.a.l(new g("", 0L, ""));
    }

    @Override // com.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.F);
        init_(bundle);
        super.onCreate(bundle);
        a4.c.c(c5);
        setContentView(R.layout.mg_forum_group_activity);
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f30325b = (TextView) aVar.internalFindViewById(R.id.forum_title_center);
        this.f30326c = (ImageView) aVar.internalFindViewById(R.id.sreach_image);
        this.f30327d = (Button) aVar.internalFindViewById(R.id.forum_post);
        this.f30328e = aVar.internalFindViewById(R.id.bottom);
        this.f30329f = (ForumLoadingView) aVar.internalFindViewById(R.id.loadingView);
        this.f30330g = (ScrollableLayout) aVar.internalFindViewById(R.id.scrollableLayout);
        this.f30331h = (ForumGroupHeaderView) aVar.internalFindViewById(R.id.headerView);
        this.f30332i = (SlidingTabLayout4) aVar.internalFindViewById(R.id.tabsLayout);
        this.f30333j = (ViewPager) aVar.internalFindViewById(R.id.viewPager);
        this.f30334k = (RelativeLayout) aVar.internalFindViewById(R.id.rlOrderBy);
        this.f30335l = (PtrClassicFrameLayout) aVar.internalFindViewById(R.id.mPtrFrame);
        View internalFindViewById = aVar.internalFindViewById(R.id.back_image);
        View internalFindViewById2 = aVar.internalFindViewById(R.id.btnSendPosts);
        ImageView imageView = this.f30326c;
        if (imageView != null) {
            imageView.setOnClickListener(new h());
        }
        if (internalFindViewById != null) {
            internalFindViewById.setOnClickListener(new i());
        }
        RelativeLayout relativeLayout = this.f30334k;
        if (relativeLayout != null) {
            relativeLayout.setOnClickListener(new j());
        }
        if (internalFindViewById2 != null) {
            internalFindViewById2.setOnClickListener(new k());
        }
        Button button = this.f30327d;
        if (button != null) {
            button.setOnClickListener(new l());
        }
        afterViews();
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.G.put(cls, t4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ForumActivity
    public void s0() {
        org.androidannotations.api.a.l(new e("", 0L, ""));
    }

    @Override // com.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i4) {
        super.setContentView(i4);
        this.F.a(this);
    }

    @Override // android.app.Activity
    public void setIntent(Intent intent) {
        super.setIntent(intent);
        injectExtras_();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ForumActivity
    public void t0() {
        org.androidannotations.api.b.e("", new b(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.ForumActivity
    public void y0() {
        org.androidannotations.api.a.l(new f("", 0L, ""));
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        this.F.a(this);
    }

    @Override // com.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        super.setContentView(view);
        this.F.a(this);
    }
}
