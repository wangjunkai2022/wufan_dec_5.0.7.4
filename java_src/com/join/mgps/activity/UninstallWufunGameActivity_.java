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
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.dto.UninstallGuessLikeBean;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.androidannotations.api.a;
/* loaded from: classes4.dex */
public final class UninstallWufunGameActivity_ extends UninstallWufunGameActivity implements y3.a, a4.a, a4.b {
    public static final String P = "gameId";
    private final a4.c L = new a4.c();
    private final Map<Class<?>, Object> M = new HashMap();
    private final IntentFilter N = new IntentFilter();
    private final BroadcastReceiver O = new k();

    /* loaded from: classes4.dex */
    class a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f38181b;

        a(boolean z4) {
            this.f38181b = z4;
        }

        @Override // java.lang.Runnable
        public void run() {
            UninstallWufunGameActivity_.super.z0(this.f38181b);
        }
    }

    /* loaded from: classes4.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            UninstallWufunGameActivity_.super.v0();
        }
    }

    /* loaded from: classes4.dex */
    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            UninstallWufunGameActivity_.super.w0();
        }
    }

    /* loaded from: classes4.dex */
    class d implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ UninstallGuessLikeBean f38185b;

        d(UninstallGuessLikeBean uninstallGuessLikeBean) {
            this.f38185b = uninstallGuessLikeBean;
        }

        @Override // java.lang.Runnable
        public void run() {
            UninstallWufunGameActivity_.super.E0(this.f38185b);
        }
    }

    /* loaded from: classes4.dex */
    class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            UninstallWufunGameActivity_.super.A0();
        }
    }

    /* loaded from: classes4.dex */
    class f implements Runnable {
        f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            UninstallWufunGameActivity_.super.showLoding();
        }
    }

    /* loaded from: classes4.dex */
    class g implements Runnable {
        g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            UninstallWufunGameActivity_.super.showLodingFailed();
        }
    }

    /* loaded from: classes4.dex */
    class h implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f38190b;

        h(String str) {
            this.f38190b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            UninstallWufunGameActivity_.super.showToast(this.f38190b);
        }
    }

    /* loaded from: classes4.dex */
    class i extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f38192b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(String str, long j4, String str2, List list) {
            super(str, j4, str2);
            this.f38192b = list;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                UninstallWufunGameActivity_.super.s0(this.f38192b);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class j extends a.c {
        j(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                UninstallWufunGameActivity_.super.p0();
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
            UninstallWufunGameActivity_.this.apkInstalRecver(intent);
        }
    }

    /* loaded from: classes4.dex */
    class l implements View.OnClickListener {
        l() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            UninstallWufunGameActivity_.this.setNetwork();
        }
    }

    /* loaded from: classes4.dex */
    class m implements View.OnClickListener {
        m() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            UninstallWufunGameActivity_.this.relodingimag();
        }
    }

    /* loaded from: classes4.dex */
    class n implements View.OnClickListener {
        n() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            UninstallWufunGameActivity_.this.back_image();
        }
    }

    /* loaded from: classes4.dex */
    class o implements View.OnClickListener {
        o() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            UninstallWufunGameActivity_.this.B0();
        }
    }

    /* loaded from: classes4.dex */
    class p implements View.OnClickListener {
        p() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            UninstallWufunGameActivity_.this.n0();
        }
    }

    /* loaded from: classes4.dex */
    class q implements View.OnClickListener {
        q() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            UninstallWufunGameActivity_.this.o0();
        }
    }

    /* loaded from: classes4.dex */
    class r implements View.OnClickListener {
        r() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            UninstallWufunGameActivity_.this.C0();
        }
    }

    /* loaded from: classes4.dex */
    class s implements View.OnClickListener {
        s() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            UninstallWufunGameActivity_.this.D0();
        }
    }

    /* loaded from: classes4.dex */
    public static class t extends org.androidannotations.api.builder.a<t> {

        /* renamed from: a  reason: collision with root package name */
        private Fragment f38204a;

        public t(Context context) {
            super(context, UninstallWufunGameActivity_.class);
        }

        public t a(String str) {
            return (t) super.extra("gameId", str);
        }

        @Override // org.androidannotations.api.builder.a, org.androidannotations.api.builder.b
        public org.androidannotations.api.builder.f startForResult(int i4) {
            Fragment fragment = this.f38204a;
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

        public t(Fragment fragment) {
            super(fragment.getActivity(), UninstallWufunGameActivity_.class);
            this.f38204a = fragment;
        }
    }

    public static t R0(Context context) {
        return new t(context);
    }

    public static t S0(Fragment fragment) {
        return new t(fragment);
    }

    private void init_(Bundle bundle) {
        a4.c.b(this);
        injectExtras_();
        this.N.addAction(o1.a.f72016o);
        registerReceiver(this.O, this.N);
    }

    private void injectExtras_() {
        Bundle extras = getIntent().getExtras();
        if (extras == null || !extras.containsKey("gameId")) {
            return;
        }
        this.f38171y = extras.getString("gameId");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.UninstallWufunGameActivity
    public void A0() {
        org.androidannotations.api.b.e("", new e(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.UninstallWufunGameActivity
    public void E0(UninstallGuessLikeBean uninstallGuessLikeBean) {
        org.androidannotations.api.b.e("", new d(uninstallGuessLikeBean), 0L);
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.M.get(cls);
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        return (T) findViewById(i4);
    }

    @Override // com.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.L);
        init_(bundle);
        super.onCreate(bundle);
        a4.c.c(c5);
        setContentView(R.layout.activity_uninstall_wufun_game);
    }

    @Override // com.join.mgps.activity.UninstallWufunGameActivity, com.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        unregisterReceiver(this.O);
        super.onDestroy();
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f38148b = aVar.internalFindViewById(R.id.statubar);
        this.f38149c = (RelativeLayout) aVar.internalFindViewById(R.id.headview);
        this.f38150d = (TextView) aVar.internalFindViewById(R.id.title_textview);
        this.f38151e = (FrameLayout) aVar.internalFindViewById(R.id.cardDelete);
        this.f38152f = (FrameLayout) aVar.internalFindViewById(R.id.toComment);
        this.f38153g = (SimpleDraweeView) aVar.internalFindViewById(R.id.gameIcon1);
        this.f38154h = (TextView) aVar.internalFindViewById(R.id.gameName1);
        this.f38155i = (TextView) aVar.internalFindViewById(R.id.gameDesc1);
        this.f38156j = (TextView) aVar.internalFindViewById(R.id.gameStatus1);
        this.f38157k = (ImageView) aVar.internalFindViewById(R.id.checkbox1);
        this.f38158l = (ConstraintLayout) aVar.internalFindViewById(R.id.game1);
        this.f38159m = (SimpleDraweeView) aVar.internalFindViewById(R.id.gameIcon2);
        this.f38160n = (TextView) aVar.internalFindViewById(R.id.gameName2);
        this.f38161o = (TextView) aVar.internalFindViewById(R.id.gameStatus2);
        this.f38162p = (ImageView) aVar.internalFindViewById(R.id.checkbox2);
        this.f38163q = (ConstraintLayout) aVar.internalFindViewById(R.id.game2);
        this.f38164r = (TextView) aVar.internalFindViewById(R.id.tvDeleteAll);
        this.f38165s = (TextView) aVar.internalFindViewById(R.id.tvDeleteGameOnly);
        this.f38166t = (CardView) aVar.internalFindViewById(R.id.cardRecom);
        this.f38167u = (FrameLayout) aVar.internalFindViewById(R.id.flRecom);
        this.f38168v = (RecyclerView) aVar.internalFindViewById(R.id.rvRecom);
        this.f38169w = aVar.internalFindViewById(R.id.loding_layout);
        this.f38170x = aVar.internalFindViewById(R.id.loding_faile);
        View internalFindViewById = aVar.internalFindViewById(R.id.setNetwork);
        View internalFindViewById2 = aVar.internalFindViewById(R.id.relodingimag);
        View internalFindViewById3 = aVar.internalFindViewById(R.id.back_image);
        if (internalFindViewById != null) {
            internalFindViewById.setOnClickListener(new l());
        }
        if (internalFindViewById2 != null) {
            internalFindViewById2.setOnClickListener(new m());
        }
        if (internalFindViewById3 != null) {
            internalFindViewById3.setOnClickListener(new n());
        }
        FrameLayout frameLayout = this.f38152f;
        if (frameLayout != null) {
            frameLayout.setOnClickListener(new o());
        }
        ConstraintLayout constraintLayout = this.f38158l;
        if (constraintLayout != null) {
            constraintLayout.setOnClickListener(new p());
        }
        ConstraintLayout constraintLayout2 = this.f38163q;
        if (constraintLayout2 != null) {
            constraintLayout2.setOnClickListener(new q());
        }
        TextView textView = this.f38164r;
        if (textView != null) {
            textView.setOnClickListener(new r());
        }
        TextView textView2 = this.f38165s;
        if (textView2 != null) {
            textView2.setOnClickListener(new s());
        }
        afterviews();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.UninstallWufunGameActivity
    public void p0() {
        org.androidannotations.api.a.l(new j("", 0L, ""));
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.M.put(cls, t4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.UninstallWufunGameActivity
    public void s0(List<String> list) {
        org.androidannotations.api.a.l(new i("", 0L, "", list));
    }

    @Override // com.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i4) {
        super.setContentView(i4);
        this.L.a(this);
    }

    @Override // android.app.Activity
    public void setIntent(Intent intent) {
        super.setIntent(intent);
        injectExtras_();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.UninstallWufunGameActivity
    public void showLoding() {
        org.androidannotations.api.b.e("", new f(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.UninstallWufunGameActivity
    public void showLodingFailed() {
        org.androidannotations.api.b.e("", new g(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.UninstallWufunGameActivity
    public void showToast(String str) {
        org.androidannotations.api.b.e("", new h(str), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.UninstallWufunGameActivity
    public void v0() {
        org.androidannotations.api.b.e("", new b(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.UninstallWufunGameActivity
    public void w0() {
        org.androidannotations.api.b.e("", new c(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.UninstallWufunGameActivity
    public void z0(boolean z4) {
        org.androidannotations.api.b.e("", new a(z4), 0L);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        this.L.a(this);
    }

    @Override // com.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        super.setContentView(view);
        this.L.a(this);
    }
}
