package com.join.mgps.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.Fragment;
import com.join.android.app.component.video.StandardVideoView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.dto.ArchiveListBean;
import com.join.mgps.dto.BossBean;
import java.util.HashMap;
import java.util.Map;
import org.androidannotations.api.a;
/* loaded from: classes4.dex */
public final class CreateEndGameCommitActivity_ extends CreateEndGameCommitActivity implements y3.a, a4.a, a4.b {
    public static final String E = "gameId";
    public static final String F = "bossBean";
    public static final String G = "archiveBean";
    public static final String H = "time";
    private final a4.c C = new a4.c();
    private final Map<Class<?>, Object> D = new HashMap();

    /* loaded from: classes4.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            CreateEndGameCommitActivity_.super.z0();
        }
    }

    /* loaded from: classes4.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            CreateEndGameCommitActivity_.super.m0();
        }
    }

    /* loaded from: classes4.dex */
    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            CreateEndGameCommitActivity_.super.q0();
        }
    }

    /* loaded from: classes4.dex */
    class d implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f29745b;

        d(String str) {
            this.f29745b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            CreateEndGameCommitActivity_.super.showToast(this.f29745b);
        }
    }

    /* loaded from: classes4.dex */
    class e extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f29747b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f29748c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(String str, long j4, String str2, String str3, int i4) {
            super(str, j4, str2);
            this.f29747b = str3;
            this.f29748c = i4;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                CreateEndGameCommitActivity_.super.A0(this.f29747b, this.f29748c);
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
                CreateEndGameCommitActivity_.super.i0();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class g extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f29751b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(String str, long j4, String str2, String str3) {
            super(str, j4, str2);
            this.f29751b = str3;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                CreateEndGameCommitActivity_.super.k0(this.f29751b);
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
            CreateEndGameCommitActivity_.this.back();
        }
    }

    /* loaded from: classes4.dex */
    class i implements View.OnClickListener {
        i() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CreateEndGameCommitActivity_.this.l0();
        }
    }

    /* loaded from: classes4.dex */
    class j implements View.OnClickListener {
        j() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CreateEndGameCommitActivity_.this.s0();
        }
    }

    /* loaded from: classes4.dex */
    class k implements View.OnClickListener {
        k() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CreateEndGameCommitActivity_.this.h0();
        }
    }

    /* loaded from: classes4.dex */
    class l implements Runnable {
        l() {
        }

        @Override // java.lang.Runnable
        public void run() {
            CreateEndGameCommitActivity_.super.o0();
        }
    }

    /* loaded from: classes4.dex */
    class m implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f29758b;

        m(int i4) {
            this.f29758b = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            CreateEndGameCommitActivity_.super.v0(this.f29758b);
        }
    }

    /* loaded from: classes4.dex */
    class n implements Runnable {
        n() {
        }

        @Override // java.lang.Runnable
        public void run() {
            CreateEndGameCommitActivity_.super.p0();
        }
    }

    /* loaded from: classes4.dex */
    class o implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f29761b;

        o(int i4) {
            this.f29761b = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            CreateEndGameCommitActivity_.super.y0(this.f29761b);
        }
    }

    /* loaded from: classes4.dex */
    class p implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f29763b;

        p(int i4) {
            this.f29763b = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            CreateEndGameCommitActivity_.super.w0(this.f29763b);
        }
    }

    /* loaded from: classes4.dex */
    public static class q extends org.androidannotations.api.builder.a<q> {

        /* renamed from: a  reason: collision with root package name */
        private Fragment f29765a;

        public q(Context context) {
            super(context, CreateEndGameCommitActivity_.class);
        }

        public q a(ArchiveListBean archiveListBean) {
            return (q) super.extra(CreateEndGameCommitActivity_.G, archiveListBean);
        }

        public q b(BossBean bossBean) {
            return (q) super.extra(CreateEndGameCommitActivity_.F, bossBean);
        }

        public q c(String str) {
            return (q) super.extra("gameId", str);
        }

        public q d(Long l4) {
            return (q) super.extra("time", l4);
        }

        @Override // org.androidannotations.api.builder.a, org.androidannotations.api.builder.b
        public org.androidannotations.api.builder.f startForResult(int i4) {
            Fragment fragment = this.f29765a;
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
            super(fragment.getActivity(), CreateEndGameCommitActivity_.class);
            this.f29765a = fragment;
        }
    }

    public static q N0(Context context) {
        return new q(context);
    }

    public static q O0(Fragment fragment) {
        return new q(fragment);
    }

    private void init_(Bundle bundle) {
        a4.c.b(this);
        injectExtras_();
    }

    private void injectExtras_() {
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            if (extras.containsKey("gameId")) {
                this.f29713b = extras.getString("gameId");
            }
            if (extras.containsKey(F)) {
                this.f29714c = (BossBean) extras.getSerializable(F);
            }
            if (extras.containsKey(G)) {
                this.f29715d = (ArchiveListBean) extras.getSerializable(G);
            }
            if (extras.containsKey("time")) {
                this.f29717f = (Long) extras.getSerializable("time");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.CreateEndGameCommitActivity
    public void A0(String str, int i4) {
        org.androidannotations.api.a.l(new e("", 0L, "", str, i4));
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.D.get(cls);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.CreateEndGameCommitActivity
    public void i0() {
        org.androidannotations.api.a.l(new f("", 0L, ""));
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        return (T) findViewById(i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.CreateEndGameCommitActivity
    public void k0(String str) {
        org.androidannotations.api.a.l(new g("", 0L, "", str));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.CreateEndGameCommitActivity
    public void m0() {
        org.androidannotations.api.b.e("", new b(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.CreateEndGameCommitActivity
    public void o0() {
        org.androidannotations.api.b.e("", new l(), 0L);
    }

    @Override // com.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.C);
        init_(bundle);
        super.onCreate(bundle);
        a4.c.c(c5);
        setContentView(R.layout.activity_create_end_game_commit);
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f29718g = (EditText) aVar.internalFindViewById(R.id.et_title);
        this.f29719h = (EditText) aVar.internalFindViewById(R.id.et_desc);
        this.f29720i = (StandardVideoView) aVar.internalFindViewById(R.id.svv_view);
        this.f29721j = (LinearLayout) aVar.internalFindViewById(R.id.ll_choose_video);
        this.f29722k = (ImageView) aVar.internalFindViewById(R.id.iv_thumb);
        this.f29723l = (RelativeLayout) aVar.internalFindViewById(R.id.rl_video);
        View internalFindViewById = aVar.internalFindViewById(R.id.iv_back);
        View internalFindViewById2 = aVar.internalFindViewById(R.id.tv_commit);
        View internalFindViewById3 = aVar.internalFindViewById(R.id.iv_delete_video);
        if (internalFindViewById != null) {
            internalFindViewById.setOnClickListener(new h());
        }
        if (internalFindViewById2 != null) {
            internalFindViewById2.setOnClickListener(new i());
        }
        if (internalFindViewById3 != null) {
            internalFindViewById3.setOnClickListener(new j());
        }
        LinearLayout linearLayout = this.f29721j;
        if (linearLayout != null) {
            linearLayout.setOnClickListener(new k());
        }
        afterViews();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.CreateEndGameCommitActivity
    public void p0() {
        org.androidannotations.api.b.e("", new n(), 0L);
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.D.put(cls, t4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.CreateEndGameCommitActivity
    public void q0() {
        org.androidannotations.api.b.e("", new c(), 0L);
    }

    @Override // com.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i4) {
        super.setContentView(i4);
        this.C.a(this);
    }

    @Override // android.app.Activity
    public void setIntent(Intent intent) {
        super.setIntent(intent);
        injectExtras_();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.CreateEndGameCommitActivity
    public void showToast(String str) {
        org.androidannotations.api.b.e("", new d(str), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.CreateEndGameCommitActivity
    public void v0(int i4) {
        org.androidannotations.api.b.e("", new m(i4), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.CreateEndGameCommitActivity
    public void w0(int i4) {
        org.androidannotations.api.b.e("", new p(i4), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.CreateEndGameCommitActivity
    public void y0(int i4) {
        org.androidannotations.api.b.e("", new o(i4), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.CreateEndGameCommitActivity
    public void z0() {
        org.androidannotations.api.b.e("", new a(), 0L);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        this.C.a(this);
    }

    @Override // com.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        super.setContentView(view);
        this.C.a(this);
    }
}
