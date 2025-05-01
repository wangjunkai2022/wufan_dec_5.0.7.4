package com.join.mgps.activity;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.dto.ArchievePathMultiBean;
import com.join.mgps.dto.ResponseModel;
import com.join.mgps.dto.UninstallGuessLikeBean;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.androidannotations.api.a;
/* loaded from: classes4.dex */
public final class UninstallWufunActivity_ extends UninstallWufunActivity implements y3.a, a4.a, a4.b {
    private final a4.c F = new a4.c();
    private final Map<Class<?>, Object> G = new HashMap();

    /* loaded from: classes4.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            UninstallWufunActivity_.super.o0();
        }
    }

    /* loaded from: classes4.dex */
    class b implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ UninstallGuessLikeBean f38127b;

        b(UninstallGuessLikeBean uninstallGuessLikeBean) {
            this.f38127b = uninstallGuessLikeBean;
        }

        @Override // java.lang.Runnable
        public void run() {
            UninstallWufunActivity_.super.t0(this.f38127b);
        }
    }

    /* loaded from: classes4.dex */
    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            UninstallWufunActivity_.super.p0();
        }
    }

    /* loaded from: classes4.dex */
    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            UninstallWufunActivity_.super.showLoding();
        }
    }

    /* loaded from: classes4.dex */
    class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            UninstallWufunActivity_.super.showLodingFailed();
        }
    }

    /* loaded from: classes4.dex */
    class f extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f38132b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(String str, long j4, String str2, List list) {
            super(str, j4, str2);
            this.f38132b = list;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                UninstallWufunActivity_.super.l0(this.f38132b);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class g extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f38134b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(String str, long j4, String str2, int i4) {
            super(str, j4, str2);
            this.f38134b = i4;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                UninstallWufunActivity_.super.h0(this.f38134b);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class h extends a.c {
        h(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                UninstallWufunActivity_.super.j0();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class i implements View.OnClickListener {
        i() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            UninstallWufunActivity_.this.setNetwork();
        }
    }

    /* loaded from: classes4.dex */
    class j implements View.OnClickListener {
        j() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            UninstallWufunActivity_.this.relodingimag();
        }
    }

    /* loaded from: classes4.dex */
    class k implements View.OnClickListener {
        k() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            UninstallWufunActivity_.this.q0();
        }
    }

    /* loaded from: classes4.dex */
    class l implements View.OnClickListener {
        l() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            UninstallWufunActivity_.this.r0();
        }
    }

    /* loaded from: classes4.dex */
    class m implements View.OnClickListener {
        m() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            UninstallWufunActivity_.this.back_image();
        }
    }

    /* loaded from: classes4.dex */
    class n implements View.OnClickListener {
        n() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            UninstallWufunActivity_.this.s0();
        }
    }

    /* loaded from: classes4.dex */
    class o implements Runnable {
        o() {
        }

        @Override // java.lang.Runnable
        public void run() {
            UninstallWufunActivity_.super.n0();
        }
    }

    /* loaded from: classes4.dex */
    class p implements Runnable {
        p() {
        }

        @Override // java.lang.Runnable
        public void run() {
            UninstallWufunActivity_.super.i0();
        }
    }

    /* loaded from: classes4.dex */
    class q implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ResponseModel f38145b;

        q(ResponseModel responseModel) {
            this.f38145b = responseModel;
        }

        @Override // java.lang.Runnable
        public void run() {
            UninstallWufunActivity_.super.u0(this.f38145b);
        }
    }

    /* loaded from: classes4.dex */
    public static class r extends org.androidannotations.api.builder.a<r> {

        /* renamed from: a  reason: collision with root package name */
        private Fragment f38147a;

        public r(Context context) {
            super(context, UninstallWufunActivity_.class);
        }

        @Override // org.androidannotations.api.builder.a, org.androidannotations.api.builder.b
        public org.androidannotations.api.builder.f startForResult(int i4) {
            Fragment fragment = this.f38147a;
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
            super(fragment.getActivity(), UninstallWufunActivity_.class);
            this.f38147a = fragment;
        }
    }

    public static r I0(Context context) {
        return new r(context);
    }

    public static r J0(Fragment fragment) {
        return new r(fragment);
    }

    private void init_(Bundle bundle) {
        a4.c.b(this);
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.G.get(cls);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.UninstallWufunActivity
    public void h0(int i4) {
        org.androidannotations.api.a.l(new g("", 0L, "", i4));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.UninstallWufunActivity
    public void i0() {
        org.androidannotations.api.b.e("", new p(), 0L);
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        return (T) findViewById(i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.UninstallWufunActivity
    public void j0() {
        org.androidannotations.api.a.l(new h("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.UninstallWufunActivity
    public void l0(List<String> list) {
        org.androidannotations.api.a.l(new f("", 0L, "", list));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.UninstallWufunActivity
    public void n0() {
        org.androidannotations.api.b.e("", new o(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.UninstallWufunActivity
    public void o0() {
        org.androidannotations.api.b.e("", new a(), 0L);
    }

    @Override // com.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.F);
        init_(bundle);
        super.onCreate(bundle);
        a4.c.c(c5);
        setContentView(R.layout.activity_uninstall_wufun);
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f38099b = aVar.internalFindViewById(R.id.statubar);
        this.f38100c = (RelativeLayout) aVar.internalFindViewById(R.id.headview);
        this.f38101d = (TextView) aVar.internalFindViewById(R.id.title_textview);
        this.f38102e = (CardView) aVar.internalFindViewById(R.id.cardClean);
        this.f38103f = (TextView) aVar.internalFindViewById(R.id.tvCleanSpace);
        this.f38104g = (TextView) aVar.internalFindViewById(R.id.tvClean);
        this.f38105h = (LinearLayout) aVar.internalFindViewById(R.id.llLocalArchiveGame);
        this.f38106i = (TextView) aVar.internalFindViewById(R.id.tvTotalGamePkgSize);
        this.f38107j = (TextView) aVar.internalFindViewById(R.id.tvTotalDataSize);
        this.f38108k = (CardView) aVar.internalFindViewById(R.id.cardRecom);
        this.f38109l = (FrameLayout) aVar.internalFindViewById(R.id.flRecom);
        this.f38110m = aVar.internalFindViewById(R.id.loding_layout);
        this.f38111n = aVar.internalFindViewById(R.id.loding_faile);
        this.f38112o = (TextView) aVar.internalFindViewById(R.id.tvGameTag);
        this.f38113p = (RecyclerView) aVar.internalFindViewById(R.id.rvRecom);
        this.f38114q = (TextView) aVar.internalFindViewById(R.id.tvFinish);
        this.f38115r = (TextView) aVar.internalFindViewById(R.id.tvUninstall);
        this.f38116s = (TextView) aVar.internalFindViewById(R.id.tvNoArchieveGame);
        View internalFindViewById = aVar.internalFindViewById(R.id.setNetwork);
        View internalFindViewById2 = aVar.internalFindViewById(R.id.relodingimag);
        View internalFindViewById3 = aVar.internalFindViewById(R.id.back_image);
        if (internalFindViewById != null) {
            internalFindViewById.setOnClickListener(new i());
        }
        if (internalFindViewById2 != null) {
            internalFindViewById2.setOnClickListener(new j());
        }
        TextView textView = this.f38104g;
        if (textView != null) {
            textView.setOnClickListener(new k());
        }
        TextView textView2 = this.f38114q;
        if (textView2 != null) {
            textView2.setOnClickListener(new l());
        }
        if (internalFindViewById3 != null) {
            internalFindViewById3.setOnClickListener(new m());
        }
        TextView textView3 = this.f38115r;
        if (textView3 != null) {
            textView3.setOnClickListener(new n());
        }
        afterviews();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.UninstallWufunActivity
    public void p0() {
        org.androidannotations.api.b.e("", new c(), 0L);
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.G.put(cls, t4);
    }

    @Override // com.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i4) {
        super.setContentView(i4);
        this.F.a(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.UninstallWufunActivity
    public void showLoding() {
        org.androidannotations.api.b.e("", new d(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.UninstallWufunActivity
    public void showLodingFailed() {
        org.androidannotations.api.b.e("", new e(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.UninstallWufunActivity
    public void t0(UninstallGuessLikeBean uninstallGuessLikeBean) {
        org.androidannotations.api.b.e("", new b(uninstallGuessLikeBean), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.UninstallWufunActivity
    public void u0(ResponseModel<ArchievePathMultiBean> responseModel) {
        org.androidannotations.api.b.e("", new q(responseModel), 0L);
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
