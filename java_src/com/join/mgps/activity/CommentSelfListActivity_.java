package com.join.mgps.activity;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.Fragment;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.ForumLoadingView;
import com.join.mgps.customview.XListView2;
import com.join.mgps.dto.FavoritesCenterData;
import com.join.mgps.pref.PrefDef_;
import java.util.HashMap;
import java.util.Map;
import org.androidannotations.api.a;
/* loaded from: classes4.dex */
public final class CommentSelfListActivity_ extends CommentSelfListActivity implements y3.a, a4.a, a4.b {
    public static final String C = "uid";

    /* renamed from: x  reason: collision with root package name */
    private final a4.c f29576x = new a4.c();

    /* renamed from: y  reason: collision with root package name */
    private final Map<Class<?>, Object> f29577y = new HashMap();

    /* renamed from: z  reason: collision with root package name */
    private final IntentFilter f29578z = new IntentFilter();
    private final BroadcastReceiver A = new i();
    private final BroadcastReceiver B = new j();

    /* loaded from: classes4.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            CommentSelfListActivity_.super.A0();
        }
    }

    /* loaded from: classes4.dex */
    class b implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f29580b;

        b(int i4) {
            this.f29580b = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            CommentSelfListActivity_.super.i0(this.f29580b);
        }
    }

    /* loaded from: classes4.dex */
    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            CommentSelfListActivity_.super.y0();
        }
    }

    /* loaded from: classes4.dex */
    class d implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f29583b;

        d(String str) {
            this.f29583b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            CommentSelfListActivity_.super.showMessage(this.f29583b);
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
                CommentSelfListActivity_.super.getData();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class f extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f29586b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(String str, long j4, String str2, int i4) {
            super(str, j4, str2);
            this.f29586b = i4;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                CommentSelfListActivity_.super.l0(this.f29586b);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class g extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f29588b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f29589c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f29590d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(String str, long j4, String str2, int i4, String str3, int i5) {
            super(str, j4, str2);
            this.f29588b = i4;
            this.f29589c = str3;
            this.f29590d = i5;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                CommentSelfListActivity_.super.r0(this.f29588b, this.f29589c, this.f29590d);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class h extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f29592b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f29593c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f29594d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(String str, long j4, String str2, int i4, String str3, int i5) {
            super(str, j4, str2);
            this.f29592b = i4;
            this.f29593c = str3;
            this.f29594d = i5;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                CommentSelfListActivity_.super.j0(this.f29592b, this.f29593c, this.f29594d);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class i extends BroadcastReceiver {
        i() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            CommentSelfListActivity_.this.B0(context);
        }
    }

    /* loaded from: classes4.dex */
    class j extends BroadcastReceiver {
        j() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            CommentSelfListActivity_.this.p0(intent);
        }
    }

    /* loaded from: classes4.dex */
    class k implements View.OnClickListener {
        k() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CommentSelfListActivity_.this.w0();
        }
    }

    /* loaded from: classes4.dex */
    class l implements View.OnClickListener {
        l() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CommentSelfListActivity_.this.x0();
        }
    }

    /* loaded from: classes4.dex */
    class m implements View.OnClickListener {
        m() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CommentSelfListActivity_.this.back();
        }
    }

    /* loaded from: classes4.dex */
    class n implements View.OnClickListener {
        n() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CommentSelfListActivity_.this.back_image();
        }
    }

    /* loaded from: classes4.dex */
    class o implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ FavoritesCenterData f29602b;

        o(FavoritesCenterData favoritesCenterData) {
            this.f29602b = favoritesCenterData;
        }

        @Override // java.lang.Runnable
        public void run() {
            CommentSelfListActivity_.super.C0(this.f29602b);
        }
    }

    /* loaded from: classes4.dex */
    class p implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f29604b;

        p(String str) {
            this.f29604b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            CommentSelfListActivity_.super.f0(this.f29604b);
        }
    }

    /* loaded from: classes4.dex */
    class q implements Runnable {
        q() {
        }

        @Override // java.lang.Runnable
        public void run() {
            CommentSelfListActivity_.super.q0();
        }
    }

    /* loaded from: classes4.dex */
    public static class r extends org.androidannotations.api.builder.a<r> {

        /* renamed from: a  reason: collision with root package name */
        private Fragment f29607a;

        public r(Context context) {
            super(context, CommentSelfListActivity_.class);
        }

        public r a(int i4) {
            return (r) super.extra("uid", i4);
        }

        @Override // org.androidannotations.api.builder.a, org.androidannotations.api.builder.b
        public org.androidannotations.api.builder.f startForResult(int i4) {
            Fragment fragment = this.f29607a;
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

        public r(Fragment fragment) {
            super(fragment.getActivity(), CommentSelfListActivity_.class);
            this.f29607a = fragment;
        }
    }

    public static r P0(Context context) {
        return new r(context);
    }

    public static r Q0(Fragment fragment) {
        return new r(fragment);
    }

    private void init_(Bundle bundle) {
        this.f29557m = new PrefDef_(this);
        a4.c.b(this);
        injectExtras_();
        this.f29578z.addAction(o1.a.f72022r);
        registerReceiver(this.A, this.f29578z);
        registerReceiver(this.B, this.f29578z);
    }

    private void injectExtras_() {
        Bundle extras = getIntent().getExtras();
        if (extras == null || !extras.containsKey("uid")) {
            return;
        }
        this.f29558n = extras.getInt("uid");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.CommentSelfListActivity
    public void A0() {
        org.androidannotations.api.b.e("", new a(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.CommentSelfListActivity
    public void C0(FavoritesCenterData favoritesCenterData) {
        org.androidannotations.api.b.e("", new o(favoritesCenterData), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.CommentSelfListActivity
    public void f0(String str) {
        org.androidannotations.api.b.e("", new p(str), 0L);
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.f29577y.get(cls);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.CommentSelfListActivity
    public void getData() {
        org.androidannotations.api.a.l(new e("", 100L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.CommentSelfListActivity
    public void i0(int i4) {
        org.androidannotations.api.b.e("", new b(i4), 0L);
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        return (T) findViewById(i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.CommentSelfListActivity
    public void j0(int i4, String str, int i5) {
        org.androidannotations.api.a.l(new h("", 0L, "", i4, str, i5));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.CommentSelfListActivity
    public void l0(int i4) {
        org.androidannotations.api.a.l(new f("", 0L, "", i4));
    }

    @Override // com.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.f29576x);
        init_(bundle);
        super.onCreate(bundle);
        a4.c.c(c5);
        setContentView(R.layout.activity_comment_self_list);
    }

    @Override // com.join.mgps.activity.CommentSelfListActivity, com.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        unregisterReceiver(this.A);
        unregisterReceiver(this.B);
        super.onDestroy();
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f29546b = (RelativeLayout) aVar.internalFindViewById(R.id.actionbarLayout);
        this.f29547c = (RelativeLayout) aVar.internalFindViewById(R.id.newTitle);
        this.f29548d = (ImageView) aVar.internalFindViewById(R.id.back_image);
        this.f29549e = (ImageView) aVar.internalFindViewById(R.id.back);
        this.f29550f = aVar.internalFindViewById(R.id.setting2);
        this.f29551g = aVar.internalFindViewById(R.id.setting3);
        this.f29552h = (XListView2) aVar.internalFindViewById(R.id.listview);
        this.f29553i = aVar.internalFindViewById(R.id.titleStatubar);
        this.f29554j = (ForumLoadingView) aVar.internalFindViewById(R.id.loadingView);
        View view = this.f29550f;
        if (view != null) {
            view.setOnClickListener(new k());
        }
        View view2 = this.f29551g;
        if (view2 != null) {
            view2.setOnClickListener(new l());
        }
        ImageView imageView = this.f29549e;
        if (imageView != null) {
            imageView.setOnClickListener(new m());
        }
        ImageView imageView2 = this.f29548d;
        if (imageView2 != null) {
            imageView2.setOnClickListener(new n());
        }
        afterViews();
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.f29577y.put(cls, t4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.CommentSelfListActivity
    public void q0() {
        org.androidannotations.api.b.e("", new q(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.CommentSelfListActivity
    public void r0(int i4, String str, int i5) {
        org.androidannotations.api.a.l(new g("", 0L, "", i4, str, i5));
    }

    @Override // com.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i4) {
        super.setContentView(i4);
        this.f29576x.a(this);
    }

    @Override // android.app.Activity
    public void setIntent(Intent intent) {
        super.setIntent(intent);
        injectExtras_();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.CommentSelfListActivity
    public void showMessage(String str) {
        org.androidannotations.api.b.e("", new d(str), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.CommentSelfListActivity
    public void y0() {
        org.androidannotations.api.b.e("", new c(), 0L);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        this.f29576x.a(this);
    }

    @Override // com.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        super.setContentView(view);
        this.f29576x.a(this);
    }
}
