package com.join.mgps.activity;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.join.android.app.mgsim.wufun.R;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.androidannotations.api.a;
/* loaded from: classes4.dex */
public final class CleanSpaceActivity_ extends CleanSpaceActivity implements y3.a, a4.a, a4.b {
    private final a4.c H = new a4.c();
    private final Map<Class<?>, Object> I = new HashMap();

    /* loaded from: classes4.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            CleanSpaceActivity_.super.o0();
        }
    }

    /* loaded from: classes4.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            CleanSpaceActivity_.super.showLoding();
        }
    }

    /* loaded from: classes4.dex */
    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            CleanSpaceActivity_.super.showLodingFailed();
        }
    }

    /* loaded from: classes4.dex */
    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            CleanSpaceActivity_.super.C0();
        }
    }

    /* loaded from: classes4.dex */
    class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            CleanSpaceActivity_.super.D0();
        }
    }

    /* loaded from: classes4.dex */
    class f extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f28845b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(String str, long j4, String str2, List list) {
            super(str, j4, str2);
            this.f28845b = list;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                CleanSpaceActivity_.super.v0(this.f28845b);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class g extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f28847b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(String str, long j4, String str2, int i4) {
            super(str, j4, str2);
            this.f28847b = i4;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                CleanSpaceActivity_.super.t0(this.f28847b);
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
            CleanSpaceActivity_.this.back_image();
        }
    }

    /* loaded from: classes4.dex */
    class i implements View.OnClickListener {
        i() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CleanSpaceActivity_.this.m0();
        }
    }

    /* loaded from: classes4.dex */
    class j implements View.OnClickListener {
        j() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CleanSpaceActivity_.this.E0();
        }
    }

    /* loaded from: classes4.dex */
    class k implements View.OnClickListener {
        k() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CleanSpaceActivity_.this.relodingimag();
        }
    }

    /* loaded from: classes4.dex */
    class l implements View.OnClickListener {
        l() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CleanSpaceActivity_.this.setNetwork();
        }
    }

    /* loaded from: classes4.dex */
    class m implements Runnable {
        m() {
        }

        @Override // java.lang.Runnable
        public void run() {
            CleanSpaceActivity_.super.F0();
        }
    }

    /* loaded from: classes4.dex */
    class n implements Runnable {
        n() {
        }

        @Override // java.lang.Runnable
        public void run() {
            CleanSpaceActivity_.super.w0();
        }
    }

    /* loaded from: classes4.dex */
    class o implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f28856b;

        o(String str) {
            this.f28856b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            CleanSpaceActivity_.super.k0(this.f28856b);
        }
    }

    /* loaded from: classes4.dex */
    class p implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f28858b;

        p(String str) {
            this.f28858b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            CleanSpaceActivity_.super.A0(this.f28858b);
        }
    }

    /* loaded from: classes4.dex */
    public static class q extends org.androidannotations.api.builder.a<q> {

        /* renamed from: a  reason: collision with root package name */
        private Fragment f28860a;

        public q(Context context) {
            super(context, CleanSpaceActivity_.class);
        }

        @Override // org.androidannotations.api.builder.a, org.androidannotations.api.builder.b
        public org.androidannotations.api.builder.f startForResult(int i4) {
            Fragment fragment = this.f28860a;
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
            super(fragment.getActivity(), CleanSpaceActivity_.class);
            this.f28860a = fragment;
        }
    }

    public static q R0(Context context) {
        return new q(context);
    }

    public static q S0(Fragment fragment) {
        return new q(fragment);
    }

    private void init_(Bundle bundle) {
        a4.c.b(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.CleanSpaceActivity
    public void A0(String str) {
        org.androidannotations.api.b.e("", new p(str), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.CleanSpaceActivity
    public void C0() {
        org.androidannotations.api.b.e("", new d(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.CleanSpaceActivity
    public void D0() {
        org.androidannotations.api.b.e("", new e(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.CleanSpaceActivity
    public void F0() {
        org.androidannotations.api.b.e("", new m(), 0L);
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.I.get(cls);
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        return (T) findViewById(i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.CleanSpaceActivity
    public void k0(String str) {
        org.androidannotations.api.b.e("", new o(str), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.CleanSpaceActivity
    public void o0() {
        org.androidannotations.api.b.e("", new a(), 0L);
    }

    @Override // com.join.mgps.activity.CleanSpaceActivity, com.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.H);
        init_(bundle);
        super.onCreate(bundle);
        a4.c.c(c5);
        setContentView(R.layout.activity_clean_space);
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f28785b = (TextView) aVar.internalFindViewById(R.id.tvSysSpace);
        this.f28786c = (ImageView) aVar.internalFindViewById(R.id.checkboxSys);
        this.f28787d = (TextView) aVar.internalFindViewById(R.id.tvTitleMyGame);
        this.f28788e = (RecyclerView) aVar.internalFindViewById(R.id.rvMyGame);
        this.f28789f = (Group) aVar.internalFindViewById(R.id.groupMyGame);
        this.f28790g = (Group) aVar.internalFindViewById(R.id.groupContent);
        this.f28791h = (TextView) aVar.internalFindViewById(R.id.tvTitleSimulator);
        this.f28792i = (RecyclerView) aVar.internalFindViewById(R.id.rvSimulator);
        this.f28793j = (Group) aVar.internalFindViewById(R.id.groupSimulator);
        this.f28794k = (FrameLayout) aVar.internalFindViewById(R.id.flBottom);
        this.f28795l = (TextView) aVar.internalFindViewById(R.id.tvTotalData);
        this.f28796m = (TextView) aVar.internalFindViewById(R.id.tvClean);
        this.f28797n = (LinearLayout) aVar.internalFindViewById(R.id.loding_layout);
        this.f28798o = (LinearLayout) aVar.internalFindViewById(R.id.loding_faile);
        this.f28799p = (LinearLayout) aVar.internalFindViewById(R.id.empty_layout);
        View internalFindViewById = aVar.internalFindViewById(R.id.back_image);
        View internalFindViewById2 = aVar.internalFindViewById(R.id.cardCleanSys);
        View internalFindViewById3 = aVar.internalFindViewById(R.id.relodingimag);
        View internalFindViewById4 = aVar.internalFindViewById(R.id.setNetwork);
        if (internalFindViewById != null) {
            internalFindViewById.setOnClickListener(new h());
        }
        if (internalFindViewById2 != null) {
            internalFindViewById2.setOnClickListener(new i());
        }
        TextView textView = this.f28796m;
        if (textView != null) {
            textView.setOnClickListener(new j());
        }
        if (internalFindViewById3 != null) {
            internalFindViewById3.setOnClickListener(new k());
        }
        if (internalFindViewById4 != null) {
            internalFindViewById4.setOnClickListener(new l());
        }
        afterviews();
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.I.put(cls, t4);
    }

    @Override // com.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i4) {
        super.setContentView(i4);
        this.H.a(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.CleanSpaceActivity
    public void showLoding() {
        org.androidannotations.api.b.e("", new b(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.CleanSpaceActivity
    public void showLodingFailed() {
        org.androidannotations.api.b.e("", new c(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.CleanSpaceActivity
    public void t0(int i4) {
        org.androidannotations.api.a.l(new g("", 0L, "", i4));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.CleanSpaceActivity
    public void v0(List<String> list) {
        org.androidannotations.api.a.l(new f("", 0L, "", list));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.CleanSpaceActivity
    public void w0() {
        org.androidannotations.api.b.e("", new n(), 0L);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        this.H.a(this);
    }

    @Override // com.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        super.setContentView(view);
        this.H.a(this);
    }
}
