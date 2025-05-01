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
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.dto.SimulatorAchievementBean;
import com.join.mgps.dto.SimulatorExitPlayResponseData;
import com.join.mgps.pref.PrefDef_;
import java.util.HashMap;
import java.util.Map;
import org.androidannotations.api.a;
/* loaded from: classes4.dex */
public final class SimulatorExitPlayActivity_ extends SimulatorExitPlayActivity implements y3.a, a4.a, a4.b {
    public static final String L = "gameId";
    public static final String M = "time";
    public static final String N = "hideLevel";
    public static final String O = "level";
    public static final String P = "progress";
    public static final String Q = "max";
    public static final String R = "levelUrl";
    public static final String S = "battleUids";
    public static final String T = "isStatEndGameFailedPoint";
    public static final String U = "endId";
    private final a4.c H = new a4.c();
    private final Map<Class<?>, Object> I = new HashMap();
    private final IntentFilter J = new IntentFilter();
    private final BroadcastReceiver K = new j();

    /* loaded from: classes4.dex */
    class a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ SimulatorExitPlayResponseData f37835b;

        a(SimulatorExitPlayResponseData simulatorExitPlayResponseData) {
            this.f37835b = simulatorExitPlayResponseData;
        }

        @Override // java.lang.Runnable
        public void run() {
            SimulatorExitPlayActivity_.super.w0(this.f37835b);
        }
    }

    /* loaded from: classes4.dex */
    class b implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f37837b;

        b(String str) {
            this.f37837b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            SimulatorExitPlayActivity_.super.toast(this.f37837b);
        }
    }

    /* loaded from: classes4.dex */
    class c implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f37839b;

        c(int i4) {
            this.f37839b = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            SimulatorExitPlayActivity_.super.g0(this.f37839b);
        }
    }

    /* loaded from: classes4.dex */
    class d implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f37841b;

        d(int i4) {
            this.f37841b = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            SimulatorExitPlayActivity_.super.q0(this.f37841b);
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
                SimulatorExitPlayActivity_.super.l0();
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
                SimulatorExitPlayActivity_.super.r0();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class g extends a.c {
        g(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                SimulatorExitPlayActivity_.super.afterLogin();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class h extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f37846b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(String str, long j4, String str2, int i4) {
            super(str, j4, str2);
            this.f37846b = i4;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                SimulatorExitPlayActivity_.super.add(this.f37846b);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class i extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f37848b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(String str, long j4, String str2, int i4) {
            super(str, j4, str2);
            this.f37848b = i4;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                SimulatorExitPlayActivity_.super.p0(this.f37848b);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class j extends BroadcastReceiver {
        j() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            SimulatorExitPlayActivity_.this.afterLogin();
        }
    }

    /* loaded from: classes4.dex */
    class k implements View.OnClickListener {
        k() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SimulatorExitPlayActivity_.this.t0();
        }
    }

    /* loaded from: classes4.dex */
    class l implements View.OnClickListener {
        l() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SimulatorExitPlayActivity_.this.m0();
        }
    }

    /* loaded from: classes4.dex */
    class m implements View.OnClickListener {
        m() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SimulatorExitPlayActivity_.this.resume();
        }
    }

    /* loaded from: classes4.dex */
    class n implements View.OnClickListener {
        n() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SimulatorExitPlayActivity_.this.k0();
        }
    }

    /* loaded from: classes4.dex */
    class o implements Runnable {
        o() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SimulatorExitPlayActivity_.super.x0();
        }
    }

    /* loaded from: classes4.dex */
    class p implements Runnable {
        p() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SimulatorExitPlayActivity_.super.updateTitle();
        }
    }

    /* loaded from: classes4.dex */
    class q implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ SimulatorAchievementBean f37857b;

        q(SimulatorAchievementBean simulatorAchievementBean) {
            this.f37857b = simulatorAchievementBean;
        }

        @Override // java.lang.Runnable
        public void run() {
            SimulatorExitPlayActivity_.super.z0(this.f37857b);
        }
    }

    /* loaded from: classes4.dex */
    class r implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ SimulatorAchievementBean f37859b;

        r(SimulatorAchievementBean simulatorAchievementBean) {
            this.f37859b = simulatorAchievementBean;
        }

        @Override // java.lang.Runnable
        public void run() {
            SimulatorExitPlayActivity_.super.A0(this.f37859b);
        }
    }

    /* loaded from: classes4.dex */
    public static class s extends org.androidannotations.api.builder.a<s> {

        /* renamed from: a  reason: collision with root package name */
        private Fragment f37861a;

        public s(Context context) {
            super(context, SimulatorExitPlayActivity_.class);
        }

        public s a(int[] iArr) {
            return (s) super.extra(SimulatorExitPlayActivity_.S, iArr);
        }

        public s b(String str) {
            return (s) super.extra("endId", str);
        }

        public s c(String str) {
            return (s) super.extra("gameId", str);
        }

        public s d(boolean z4) {
            return (s) super.extra(SimulatorExitPlayActivity_.N, z4);
        }

        public s e(boolean z4) {
            return (s) super.extra(SimulatorExitPlayActivity_.T, z4);
        }

        public s f(int i4) {
            return (s) super.extra(SimulatorExitPlayActivity_.O, i4);
        }

        public s g(String str) {
            return (s) super.extra(SimulatorExitPlayActivity_.R, str);
        }

        public s h(int i4) {
            return (s) super.extra(SimulatorExitPlayActivity_.Q, i4);
        }

        public s i(int i4) {
            return (s) super.extra("progress", i4);
        }

        public s j(int i4) {
            return (s) super.extra("time", i4);
        }

        @Override // org.androidannotations.api.builder.a, org.androidannotations.api.builder.b
        public org.androidannotations.api.builder.f startForResult(int i4) {
            Fragment fragment = this.f37861a;
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

        public s(Fragment fragment) {
            super(fragment.getActivity(), SimulatorExitPlayActivity_.class);
            this.f37861a = fragment;
        }
    }

    public static s O0(Context context) {
        return new s(context);
    }

    public static s P0(Fragment fragment) {
        return new s(fragment);
    }

    private void init_(Bundle bundle) {
        this.D = new PrefDef_(this);
        a4.c.b(this);
        injectExtras_();
        this.J.addAction("com.join.android.app.mgsim.wufun.broadcast.action_login_success");
        registerReceiver(this.K, this.J);
    }

    private void injectExtras_() {
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            if (extras.containsKey("gameId")) {
                this.f37819p = extras.getString("gameId");
            }
            if (extras.containsKey("time")) {
                this.f37820q = extras.getInt("time");
            }
            if (extras.containsKey(N)) {
                this.f37821r = extras.getBoolean(N);
            }
            if (extras.containsKey(O)) {
                this.f37822s = extras.getInt(O);
            }
            if (extras.containsKey("progress")) {
                this.f37823t = extras.getInt("progress");
            }
            if (extras.containsKey(Q)) {
                this.f37824u = extras.getInt(Q);
            }
            if (extras.containsKey(R)) {
                this.f37825v = extras.getString(R);
            }
            if (extras.containsKey(S)) {
                this.f37826w = extras.getIntArray(S);
            }
            if (extras.containsKey(T)) {
                this.f37827x = extras.getBoolean(T);
            }
            if (extras.containsKey("endId")) {
                this.f37828y = extras.getString("endId");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.SimulatorExitPlayActivity
    public void A0(SimulatorAchievementBean simulatorAchievementBean) {
        org.androidannotations.api.b.e("", new r(simulatorAchievementBean), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.SimulatorExitPlayActivity
    public void add(int i4) {
        org.androidannotations.api.a.l(new h("", 0L, "", i4));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.SimulatorExitPlayActivity
    public void afterLogin() {
        org.androidannotations.api.a.l(new g("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.SimulatorExitPlayActivity
    public void g0(int i4) {
        org.androidannotations.api.b.e("", new c(i4), 0L);
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
    @Override // com.join.mgps.activity.SimulatorExitPlayActivity
    public void l0() {
        org.androidannotations.api.a.l(new e("", 0L, ""));
    }

    @Override // com.join.mgps.activity.SimulatorExitPlayActivity, com.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.H);
        init_(bundle);
        super.onCreate(bundle);
        a4.c.c(c5);
        setContentView(R.layout.activity_simulator_exit_play);
    }

    @Override // com.join.mgps.activity.SimulatorExitPlayActivity, com.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        unregisterReceiver(this.K);
        super.onDestroy();
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f37805b = (TextView) aVar.internalFindViewById(R.id.title);
        this.f37806c = (SimpleDraweeView) aVar.internalFindViewById(R.id.adIcon);
        this.f37807d = (TextView) aVar.internalFindViewById(R.id.adTitle);
        this.f37808e = (RecyclerView) aVar.internalFindViewById(R.id.recyclerView);
        this.f37809f = aVar.internalFindViewById(R.id.save);
        this.f37810g = aVar.internalFindViewById(R.id.info);
        this.f37811h = (TextView) aVar.internalFindViewById(R.id.levelName);
        this.f37812i = (TextView) aVar.internalFindViewById(R.id.progressTv);
        this.f37813j = (ImageView) aVar.internalFindViewById(R.id.levelIcon);
        this.f37814k = (ProgressBar) aVar.internalFindViewById(R.id.progressBar);
        this.f37815l = (TextView) aVar.internalFindViewById(R.id.tvTips);
        View internalFindViewById = aVar.internalFindViewById(R.id.resume);
        View internalFindViewById2 = aVar.internalFindViewById(R.id.exit);
        View view = this.f37809f;
        if (view != null) {
            view.setOnClickListener(new k());
        }
        View view2 = this.f37810g;
        if (view2 != null) {
            view2.setOnClickListener(new l());
        }
        if (internalFindViewById != null) {
            internalFindViewById.setOnClickListener(new m());
        }
        if (internalFindViewById2 != null) {
            internalFindViewById2.setOnClickListener(new n());
        }
        afterViews();
    }

    @Override // com.join.mgps.activity.SimulatorExitPlayActivity
    public void p0(int i4) {
        org.androidannotations.api.a.l(new i("", 0L, "", i4));
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.I.put(cls, t4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.SimulatorExitPlayActivity
    public void q0(int i4) {
        org.androidannotations.api.b.e("", new d(i4), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.SimulatorExitPlayActivity
    public void r0() {
        org.androidannotations.api.a.l(new f("", 0L, ""));
    }

    @Override // com.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i4) {
        super.setContentView(i4);
        this.H.a(this);
    }

    @Override // android.app.Activity
    public void setIntent(Intent intent) {
        super.setIntent(intent);
        injectExtras_();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.SimulatorExitPlayActivity
    public void toast(String str) {
        org.androidannotations.api.b.e("", new b(str), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.SimulatorExitPlayActivity
    public void updateTitle() {
        org.androidannotations.api.b.e("", new p(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.SimulatorExitPlayActivity
    public void w0(SimulatorExitPlayResponseData simulatorExitPlayResponseData) {
        org.androidannotations.api.b.e("", new a(simulatorExitPlayResponseData), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.SimulatorExitPlayActivity
    public void x0() {
        org.androidannotations.api.b.e("", new o(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.SimulatorExitPlayActivity
    public void z0(SimulatorAchievementBean simulatorAchievementBean) {
        org.androidannotations.api.b.e("", new q(simulatorAchievementBean), 0L);
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
