package com.join.mgps.activity;

import android.app.Activity;
import android.content.Context;
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
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.component.xrecyclerview.XRecyclerView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.activity.GameDetailActivity;
import com.join.mgps.customview.XListView2;
import com.join.mgps.dto.ForumResponseGame;
import com.join.mgps.dto.GameListItemBean;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.androidannotations.api.a;
/* loaded from: classes4.dex */
public final class GameDetailActivity_ extends GameDetailActivity implements y3.a, a4.a, a4.b {
    private final a4.c V1 = new a4.c();
    private final Map<Class<?>, Object> W1 = new HashMap();

    /* loaded from: classes4.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GameDetailActivity_.super.C0();
        }
    }

    /* loaded from: classes4.dex */
    class a0 implements View.OnClickListener {
        a0() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GameDetailActivity_.this.B0();
        }
    }

    /* loaded from: classes4.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GameDetailActivity_.super.m0();
        }
    }

    /* loaded from: classes4.dex */
    class b0 implements View.OnClickListener {
        b0() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GameDetailActivity_.this.K0();
        }
    }

    /* loaded from: classes4.dex */
    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GameDetailActivity_.super.G0();
        }
    }

    /* loaded from: classes4.dex */
    class c0 implements View.OnClickListener {
        c0() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GameDetailActivity_.this.O0();
        }
    }

    /* loaded from: classes4.dex */
    class d implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f31626b;

        d(int i4) {
            this.f31626b = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            GameDetailActivity_.super.E0(this.f31626b);
        }
    }

    /* loaded from: classes4.dex */
    class d0 implements View.OnClickListener {
        d0() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GameDetailActivity_.this.P0();
        }
    }

    /* loaded from: classes4.dex */
    class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GameDetailActivity_.super.l0();
        }
    }

    /* loaded from: classes4.dex */
    class e0 implements View.OnClickListener {
        e0() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GameDetailActivity_.this.setNetwork();
        }
    }

    /* loaded from: classes4.dex */
    class f implements Runnable {
        f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GameDetailActivity_.super.U0();
        }
    }

    /* loaded from: classes4.dex */
    class f0 implements View.OnClickListener {
        f0() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GameDetailActivity_.this.N0();
        }
    }

    /* loaded from: classes4.dex */
    class g implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ForumResponseGame f31633b;

        g(ForumResponseGame forumResponseGame) {
            this.f31633b = forumResponseGame;
        }

        @Override // java.lang.Runnable
        public void run() {
            GameDetailActivity_.super.Q0(this.f31633b);
        }
    }

    /* loaded from: classes4.dex */
    public static class g0 extends org.androidannotations.api.builder.a<g0> {

        /* renamed from: a  reason: collision with root package name */
        private Fragment f31635a;

        public g0(Context context) {
            super(context, GameDetailActivity_.class);
        }

        @Override // org.androidannotations.api.builder.a, org.androidannotations.api.builder.b
        public org.androidannotations.api.builder.f startForResult(int i4) {
            Fragment fragment = this.f31635a;
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

        public g0(Fragment fragment) {
            super(fragment.getActivity(), GameDetailActivity_.class);
            this.f31635a = fragment;
        }
    }

    /* loaded from: classes4.dex */
    class h implements Runnable {
        h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GameDetailActivity_.super.R0();
        }
    }

    /* loaded from: classes4.dex */
    class i implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f31637b;

        i(int i4) {
            this.f31637b = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            GameDetailActivity_.super.w0(this.f31637b);
        }
    }

    /* loaded from: classes4.dex */
    class j implements Runnable {
        j() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GameDetailActivity_.super.F0();
        }
    }

    /* loaded from: classes4.dex */
    class k implements View.OnClickListener {
        k() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GameDetailActivity_.this.relodingimag();
        }
    }

    /* loaded from: classes4.dex */
    class l implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f31641b;

        l(List list) {
            this.f31641b = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            GameDetailActivity_.super.i0(this.f31641b);
        }
    }

    /* loaded from: classes4.dex */
    class m implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ForumResponseGame f31643b;

        m(ForumResponseGame forumResponseGame) {
            this.f31643b = forumResponseGame;
        }

        @Override // java.lang.Runnable
        public void run() {
            GameDetailActivity_.super.k0(this.f31643b);
        }
    }

    /* loaded from: classes4.dex */
    class n implements Runnable {
        n() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GameDetailActivity_.super.v0();
        }
    }

    /* loaded from: classes4.dex */
    class o implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f31646b;

        o(String str) {
            this.f31646b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            GameDetailActivity_.super.J0(this.f31646b);
        }
    }

    /* loaded from: classes4.dex */
    class p implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f31648b;

        p(int i4) {
            this.f31648b = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            GameDetailActivity_.super.h0(this.f31648b);
        }
    }

    /* loaded from: classes4.dex */
    class q implements Runnable {
        q() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GameDetailActivity_.super.showLoding();
        }
    }

    /* loaded from: classes4.dex */
    class r implements Runnable {
        r() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GameDetailActivity_.super.A0();
        }
    }

    /* loaded from: classes4.dex */
    class s implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f31652b;

        s(String str) {
            this.f31652b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            GameDetailActivity_.super.n0(this.f31652b);
        }
    }

    /* loaded from: classes4.dex */
    class t implements Runnable {
        t() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GameDetailActivity_.super.showLodingFailed();
        }
    }

    /* loaded from: classes4.dex */
    class u implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ GameDetailActivity.l f31655b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f31656c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f31657d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ GameListItemBean f31658e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f31659f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ int f31660g;

        u(GameDetailActivity.l lVar, String str, String str2, GameListItemBean gameListItemBean, int i4, int i5) {
            this.f31655b = lVar;
            this.f31656c = str;
            this.f31657d = str2;
            this.f31658e = gameListItemBean;
            this.f31659f = i4;
            this.f31660g = i5;
        }

        @Override // java.lang.Runnable
        public void run() {
            GameDetailActivity_.super.I0(this.f31655b, this.f31656c, this.f31657d, this.f31658e, this.f31659f, this.f31660g);
        }
    }

    /* loaded from: classes4.dex */
    class v implements View.OnClickListener {
        v() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GameDetailActivity_.this.u0();
        }
    }

    /* loaded from: classes4.dex */
    class w extends a.c {
        w(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                GameDetailActivity_.super.j0();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class x extends a.c {
        x(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                GameDetailActivity_.super.D0();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class y extends a.c {
        y(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                GameDetailActivity_.super.o0();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class z implements View.OnClickListener {
        z() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GameDetailActivity_.this.iv_back();
        }
    }

    private void init_(Bundle bundle) {
        a4.c.b(this);
    }

    public static g0 t1(Context context) {
        return new g0(context);
    }

    public static g0 u1(Fragment fragment) {
        return new g0(fragment);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameDetailActivity
    public void A0() {
        org.androidannotations.api.b.e("", new r(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameDetailActivity
    public void C0() {
        org.androidannotations.api.b.e("", new a(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameDetailActivity
    public void D0() {
        org.androidannotations.api.a.l(new x("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameDetailActivity
    public void E0(int i4) {
        org.androidannotations.api.b.e("", new d(i4), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameDetailActivity
    public void F0() {
        org.androidannotations.api.b.e("", new j(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameDetailActivity
    public void G0() {
        org.androidannotations.api.b.e("", new c(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameDetailActivity
    public void I0(GameDetailActivity.l lVar, String str, String str2, GameListItemBean gameListItemBean, int i4, int i5) {
        org.androidannotations.api.b.e("", new u(lVar, str, str2, gameListItemBean, i4, i5), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameDetailActivity
    public void J0(String str) {
        org.androidannotations.api.b.e("", new o(str), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameDetailActivity
    public void Q0(ForumResponseGame forumResponseGame) {
        org.androidannotations.api.b.e("", new g(forumResponseGame), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameDetailActivity
    public void R0() {
        org.androidannotations.api.b.e("", new h(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameDetailActivity
    public void U0() {
        org.androidannotations.api.b.e("", new f(), 0L);
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.W1.get(cls);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameDetailActivity
    public void h0(int i4) {
        org.androidannotations.api.b.e("", new p(i4), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameDetailActivity
    public void i0(List<GameListItemBean> list) {
        org.androidannotations.api.b.e("", new l(list), 0L);
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        return (T) findViewById(i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameDetailActivity
    public void j0() {
        org.androidannotations.api.a.l(new w("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameDetailActivity
    public void k0(ForumResponseGame forumResponseGame) {
        org.androidannotations.api.b.e("", new m(forumResponseGame), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameDetailActivity
    public void l0() {
        org.androidannotations.api.b.e("", new e(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameDetailActivity
    public void m0() {
        org.androidannotations.api.b.e("", new b(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameDetailActivity
    public void n0(String str) {
        org.androidannotations.api.b.e("", new s(str), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameDetailActivity
    public void o0() {
        org.androidannotations.api.a.l(new y("", 0L, ""));
    }

    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.V1);
        init_(bundle);
        super.onCreate(bundle);
        a4.c.c(c5);
        setContentView(R.layout.activity_game_detail);
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f31503b = (LinearLayout) aVar.internalFindViewById(R.id.iv_nome);
        this.f31504c = (XRecyclerView) aVar.internalFindViewById(R.id.xrecycleview);
        this.f31505d = (LinearLayout) aVar.internalFindViewById(R.id.myswip);
        this.f31506e = (XListView2) aVar.internalFindViewById(R.id.listview);
        this.f31507f = (LinearLayout) aVar.internalFindViewById(R.id.loding_layout);
        this.f31508g = (LinearLayout) aVar.internalFindViewById(R.id.loding_faile);
        this.f31509h = (Button) aVar.internalFindViewById(R.id.setNetwork);
        this.f31510i = (RelativeLayout) aVar.internalFindViewById(R.id.iv_back);
        this.f31511j = (SimpleDraweeView) aVar.internalFindViewById(R.id.smv_icon);
        this.f31512k = (TextView) aVar.internalFindViewById(R.id.tv_name);
        this.f31513l = (TextView) aVar.internalFindViewById(R.id.tv_time);
        this.f31514m = (TextView) aVar.internalFindViewById(R.id.tv_btn);
        this.f31515n = (ImageView) aVar.internalFindViewById(R.id.iv_share);
        this.f31516o = (TextView) aVar.internalFindViewById(R.id.tv_game_title2);
        this.f31517p = (TextView) aVar.internalFindViewById(R.id.tv_modify2);
        this.f31520q = (LinearLayout) aVar.internalFindViewById(R.id.ll_gameform_title2);
        this.f31521r = (SimpleDraweeView) aVar.internalFindViewById(R.id.topBack);
        this.f31522s = (LinearLayout) aVar.internalFindViewById(R.id.main);
        this.f31523t = (RelativeLayout) aVar.internalFindViewById(R.id.rl_back_title);
        this.f31524u = (ImageView) aVar.internalFindViewById(R.id.relodingimag);
        this.f31525v = (TextView) aVar.internalFindViewById(R.id.title);
        this.f31527w = (TextView) aVar.internalFindViewById(R.id.changeModle);
        this.f31528x = (TextView) aVar.internalFindViewById(R.id.textView2);
        this.f31529y = (TextView) aVar.internalFindViewById(R.id.failedMessage);
        ImageView imageView = this.f31524u;
        if (imageView != null) {
            imageView.setOnClickListener(new k());
        }
        TextView textView = this.f31527w;
        if (textView != null) {
            textView.setOnClickListener(new v());
        }
        RelativeLayout relativeLayout = this.f31510i;
        if (relativeLayout != null) {
            relativeLayout.setOnClickListener(new z());
        }
        ImageView imageView2 = this.f31515n;
        if (imageView2 != null) {
            imageView2.setOnClickListener(new a0());
        }
        SimpleDraweeView simpleDraweeView = this.f31511j;
        if (simpleDraweeView != null) {
            simpleDraweeView.setOnClickListener(new b0());
        }
        TextView textView2 = this.f31512k;
        if (textView2 != null) {
            textView2.setOnClickListener(new c0());
        }
        TextView textView3 = this.f31513l;
        if (textView3 != null) {
            textView3.setOnClickListener(new d0());
        }
        Button button = this.f31509h;
        if (button != null) {
            button.setOnClickListener(new e0());
        }
        TextView textView4 = this.f31514m;
        if (textView4 != null) {
            textView4.setOnClickListener(new f0());
        }
        g0();
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.W1.put(cls, t4);
    }

    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i4) {
        super.setContentView(i4);
        this.V1.a(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameDetailActivity
    public void showLoding() {
        org.androidannotations.api.b.e("", new q(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameDetailActivity
    public void showLodingFailed() {
        org.androidannotations.api.b.e("", new t(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameDetailActivity
    public void v0() {
        org.androidannotations.api.b.e("", new n(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameDetailActivity
    public void w0(int i4) {
        org.androidannotations.api.b.e("", new i(i4), 0L);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        this.V1.a(this);
    }

    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        super.setContentView(view);
        this.V1.a(this);
    }
}
