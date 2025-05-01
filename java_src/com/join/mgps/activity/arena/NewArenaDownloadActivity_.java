package com.join.mgps.activity.arena;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.Fragment;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.dto.DetailResultBean;
import java.util.HashMap;
import java.util.Map;
import org.androidannotations.api.a;
/* loaded from: classes4.dex */
public final class NewArenaDownloadActivity_ extends NewArenaDownloadActivity implements y3.a, a4.a, a4.b {
    public static final String O = "gameId";
    public static final String P = "hasPlug";
    public static final String Q = "hasRom";
    public static final String R = "from";
    private final a4.c M = new a4.c();
    private final Map<Class<?>, Object> N = new HashMap();

    /* loaded from: classes4.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            NewArenaDownloadActivity_.super.n();
        }
    }

    /* loaded from: classes4.dex */
    class b extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DetailResultBean f38889b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, long j4, String str2, DetailResultBean detailResultBean) {
            super(str, j4, str2);
            this.f38889b = detailResultBean;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                NewArenaDownloadActivity_.super.d(this.f38889b);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class c extends a.c {
        c(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                NewArenaDownloadActivity_.super.g();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class d implements View.OnClickListener {
        d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            NewArenaDownloadActivity_.this.b();
        }
    }

    /* loaded from: classes4.dex */
    class e implements View.OnClickListener {
        e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            NewArenaDownloadActivity_.this.k();
        }
    }

    /* loaded from: classes4.dex */
    class f implements View.OnClickListener {
        f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            NewArenaDownloadActivity_.this.m();
        }
    }

    /* loaded from: classes4.dex */
    class g implements View.OnClickListener {
        g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            NewArenaDownloadActivity_.this.l();
        }
    }

    /* loaded from: classes4.dex */
    class h implements Runnable {
        h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            NewArenaDownloadActivity_.super.e();
        }
    }

    /* loaded from: classes4.dex */
    class i implements Runnable {
        i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            NewArenaDownloadActivity_.super.f();
        }
    }

    /* loaded from: classes4.dex */
    class j implements Runnable {
        j() {
        }

        @Override // java.lang.Runnable
        public void run() {
            NewArenaDownloadActivity_.super.p();
        }
    }

    /* loaded from: classes4.dex */
    class k implements Runnable {
        k() {
        }

        @Override // java.lang.Runnable
        public void run() {
            NewArenaDownloadActivity_.super.i();
        }
    }

    /* loaded from: classes4.dex */
    class l implements Runnable {
        l() {
        }

        @Override // java.lang.Runnable
        public void run() {
            NewArenaDownloadActivity_.super.o();
        }
    }

    /* loaded from: classes4.dex */
    public static class m extends org.androidannotations.api.builder.a<m> {

        /* renamed from: a  reason: collision with root package name */
        private Fragment f38901a;

        public m(Context context) {
            super(context, NewArenaDownloadActivity_.class);
        }

        public m a(String str) {
            return (m) super.extra("from", str);
        }

        public m b(String str) {
            return (m) super.extra("gameId", str);
        }

        public m c(boolean z4) {
            return (m) super.extra(NewArenaDownloadActivity_.P, z4);
        }

        public m d(boolean z4) {
            return (m) super.extra(NewArenaDownloadActivity_.Q, z4);
        }

        @Override // org.androidannotations.api.builder.a, org.androidannotations.api.builder.b
        public org.androidannotations.api.builder.f startForResult(int i4) {
            Fragment fragment = this.f38901a;
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

        public m(Fragment fragment) {
            super(fragment.getActivity(), NewArenaDownloadActivity_.class);
            this.f38901a = fragment;
        }
    }

    public static m A(Context context) {
        return new m(context);
    }

    public static m B(Fragment fragment) {
        return new m(fragment);
    }

    private void y(Bundle bundle) {
        a4.c.b(this);
        z();
    }

    private void z() {
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            if (extras.containsKey("gameId")) {
                this.f38862b = extras.getString("gameId");
            }
            if (extras.containsKey(P)) {
                this.f38863c = extras.getBoolean(P);
            }
            if (extras.containsKey(Q)) {
                this.f38864d = extras.getBoolean(Q);
            }
            if (extras.containsKey("from")) {
                this.f38865e = extras.getString("from");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.arena.NewArenaDownloadActivity
    public void d(DetailResultBean detailResultBean) {
        org.androidannotations.api.a.l(new b("", 0L, "", detailResultBean));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.arena.NewArenaDownloadActivity
    public void e() {
        org.androidannotations.api.b.e("", new h(), 500L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.arena.NewArenaDownloadActivity
    public void f() {
        org.androidannotations.api.b.e("", new i(), 800L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.arena.NewArenaDownloadActivity
    public void g() {
        org.androidannotations.api.a.l(new c("", 0L, ""));
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.N.get(cls);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.arena.NewArenaDownloadActivity
    public void i() {
        org.androidannotations.api.b.e("", new k(), 0L);
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        return (T) findViewById(i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.arena.NewArenaDownloadActivity
    public void n() {
        org.androidannotations.api.b.e("", new a(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.arena.NewArenaDownloadActivity
    public void o() {
        org.androidannotations.api.b.e("", new l(), 0L);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.M);
        y(bundle);
        super.onCreate(bundle);
        a4.c.c(c5);
        setContentView(R.layout.dialog_arena_download_game_plugin);
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f38868h = (SimpleDraweeView) aVar.internalFindViewById(R.id.iv_game_icon);
        this.f38869i = (TextView) aVar.internalFindViewById(R.id.tv_game_name);
        this.f38870j = (TextView) aVar.internalFindViewById(R.id.moneyText);
        this.f38871k = (ProgressBar) aVar.internalFindViewById(R.id.gameProgressBar);
        this.f38872l = (TextView) aVar.internalFindViewById(R.id.tv_game_size);
        this.f38873m = (SimpleDraweeView) aVar.internalFindViewById(R.id.iv_plugin_icon);
        this.f38874n = (TextView) aVar.internalFindViewById(R.id.tv_plugin_name);
        this.f38875o = (ProgressBar) aVar.internalFindViewById(R.id.plugProgressBar);
        this.f38876p = (TextView) aVar.internalFindViewById(R.id.tv_plugin_size);
        this.f38877q = (Button) aVar.internalFindViewById(R.id.btnGoGame);
        this.f38878r = (LinearLayout) aVar.internalFindViewById(R.id.loading_lay);
        this.f38879s = (LinearLayout) aVar.internalFindViewById(R.id.loding_faile);
        this.f38880t = (ImageView) aVar.internalFindViewById(R.id.relodingimag);
        this.f38881u = (Button) aVar.internalFindViewById(R.id.setNetwork);
        this.f38882v = aVar.internalFindViewById(R.id.iv_close);
        this.f38883w = (LinearLayout) aVar.internalFindViewById(R.id.ll_content);
        this.f38884x = (LinearLayout) aVar.internalFindViewById(R.id.ll_plugin);
        this.f38885y = (LinearLayout) aVar.internalFindViewById(R.id.ll_game);
        this.f38886z = (TextView) aVar.internalFindViewById(R.id.tv_info);
        Button button = this.f38877q;
        if (button != null) {
            button.setOnClickListener(new d());
        }
        View view = this.f38882v;
        if (view != null) {
            view.setOnClickListener(new e());
        }
        Button button2 = this.f38881u;
        if (button2 != null) {
            button2.setOnClickListener(new f());
        }
        ImageView imageView = this.f38880t;
        if (imageView != null) {
            imageView.setOnClickListener(new g());
        }
        a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.arena.NewArenaDownloadActivity
    public void p() {
        org.androidannotations.api.b.e("", new j(), 0L);
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.N.put(cls, t4);
    }

    @Override // android.app.Activity
    public void setContentView(int i4) {
        super.setContentView(i4);
        this.M.a(this);
    }

    @Override // android.app.Activity
    public void setIntent(Intent intent) {
        super.setIntent(intent);
        z();
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        this.M.a(this);
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        super.setContentView(view);
        this.M.a(this);
    }
}
