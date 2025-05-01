package com.join.mgps.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import app.mgsim.arena.ArenaResponse;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.dto.GameMainV3DataBean;
import com.join.mgps.pref.PrefDef_;
import java.util.HashMap;
import java.util.Map;
import org.androidannotations.api.a;
/* loaded from: classes4.dex */
public final class GameMainNewActivity_ extends GameMainNewActivity implements y3.a, a4.a, a4.b {
    public static final String L1 = "gameId";
    public static final String M1 = "from";
    private final a4.c J1 = new a4.c();
    private final Map<Class<?>, Object> K1 = new HashMap();

    /* loaded from: classes4.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GameMainNewActivity_.super.X();
        }
    }

    /* loaded from: classes4.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GameMainNewActivity_.super.P();
        }
    }

    /* loaded from: classes4.dex */
    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GameMainNewActivity_.super.Q();
        }
    }

    /* loaded from: classes4.dex */
    class d implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ GameMainV3DataBean f32651b;

        d(GameMainV3DataBean gameMainV3DataBean) {
            this.f32651b = gameMainV3DataBean;
        }

        @Override // java.lang.Runnable
        public void run() {
            GameMainNewActivity_.super.R(this.f32651b);
        }
    }

    /* loaded from: classes4.dex */
    class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GameMainNewActivity_.super.L();
        }
    }

    /* loaded from: classes4.dex */
    class f implements Runnable {
        f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GameMainNewActivity_.super.T();
        }
    }

    /* loaded from: classes4.dex */
    class g implements Runnable {
        g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GameMainNewActivity_.super.l();
        }
    }

    /* loaded from: classes4.dex */
    class h implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ArenaResponse f32656b;

        h(ArenaResponse arenaResponse) {
            this.f32656b = arenaResponse;
        }

        @Override // java.lang.Runnable
        public void run() {
            GameMainNewActivity_.super.K(this.f32656b);
        }
    }

    /* loaded from: classes4.dex */
    class i extends a.c {
        i(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                GameMainNewActivity_.super.H();
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
                GameMainNewActivity_.super.A();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class k implements View.OnClickListener {
        k() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GameMainNewActivity_.this.m();
        }
    }

    /* loaded from: classes4.dex */
    class l extends a.c {
        l(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                GameMainNewActivity_.super.z();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class m extends a.c {
        m(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                GameMainNewActivity_.super.y();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class n extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f32663b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(String str, long j4, String str2, String str3) {
            super(str, j4, str2);
            this.f32663b = str3;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                GameMainNewActivity_.super.E(this.f32663b);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class o extends a.c {
        o(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                GameMainNewActivity_.super.B();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class p extends a.c {
        p(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                GameMainNewActivity_.super.D();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class q extends a.c {
        q(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                GameMainNewActivity_.super.F();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class r implements View.OnClickListener {
        r() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GameMainNewActivity_.this.V();
        }
    }

    /* loaded from: classes4.dex */
    class s implements View.OnClickListener {
        s() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GameMainNewActivity_.this.t();
        }
    }

    /* loaded from: classes4.dex */
    class t implements View.OnClickListener {
        t() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GameMainNewActivity_.this.o();
        }
    }

    /* loaded from: classes4.dex */
    class u implements View.OnClickListener {
        u() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GameMainNewActivity_.this.p();
        }
    }

    /* loaded from: classes4.dex */
    class v implements View.OnClickListener {
        v() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GameMainNewActivity_.this.n();
        }
    }

    /* loaded from: classes4.dex */
    class w implements View.OnClickListener {
        w() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GameMainNewActivity_.this.r();
        }
    }

    /* loaded from: classes4.dex */
    class x implements View.OnClickListener {
        x() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GameMainNewActivity_.this.v();
        }
    }

    /* loaded from: classes4.dex */
    class y implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ GameMainV3DataBean f32675b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f32676c;

        y(GameMainV3DataBean gameMainV3DataBean, boolean z4) {
            this.f32675b = gameMainV3DataBean;
            this.f32676c = z4;
        }

        @Override // java.lang.Runnable
        public void run() {
            GameMainNewActivity_.super.a0(this.f32675b, this.f32676c);
        }
    }

    /* loaded from: classes4.dex */
    public static class z extends org.androidannotations.api.builder.a<z> {

        /* renamed from: a  reason: collision with root package name */
        private Fragment f32678a;

        public z(Context context) {
            super(context, GameMainNewActivity_.class);
        }

        public z a(String str) {
            return (z) super.extra("from", str);
        }

        public z b(String str) {
            return (z) super.extra("gameId", str);
        }

        @Override // org.androidannotations.api.builder.a, org.androidannotations.api.builder.b
        public org.androidannotations.api.builder.f startForResult(int i4) {
            Fragment fragment = this.f32678a;
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

        public z(Fragment fragment) {
            super(fragment.getActivity(), GameMainNewActivity_.class);
            this.f32678a = fragment;
        }
    }

    private void s0(Bundle bundle) {
        this.C1 = new PrefDef_(this);
        a4.c.b(this);
        getWindow().setFlags(1024, 1024);
        t0();
        requestWindowFeature(1);
    }

    private void t0() {
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            if (extras.containsKey("gameId")) {
                this.D = extras.getString("gameId");
            }
            if (extras.containsKey("from")) {
                this.E = extras.getString("from");
            }
        }
    }

    public static z u0(Context context) {
        return new z(context);
    }

    public static z v0(Fragment fragment) {
        return new z(fragment);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameMainNewActivity
    public void A() {
        org.androidannotations.api.a.l(new j("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameMainNewActivity
    public void B() {
        org.androidannotations.api.a.l(new o("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameMainNewActivity
    public void D() {
        org.androidannotations.api.a.l(new p("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameMainNewActivity
    public void E(String str) {
        org.androidannotations.api.a.l(new n("", 0L, "", str));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameMainNewActivity
    public void F() {
        org.androidannotations.api.a.l(new q("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameMainNewActivity
    public void H() {
        org.androidannotations.api.a.l(new i("", 1500L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameMainNewActivity
    public void K(ArenaResponse arenaResponse) {
        org.androidannotations.api.b.e("", new h(arenaResponse), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameMainNewActivity
    public void L() {
        org.androidannotations.api.b.e("", new e(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameMainNewActivity
    public void P() {
        org.androidannotations.api.b.e("", new b(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameMainNewActivity
    public void Q() {
        org.androidannotations.api.b.e("", new c(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameMainNewActivity
    public void R(GameMainV3DataBean gameMainV3DataBean) {
        org.androidannotations.api.b.e("", new d(gameMainV3DataBean), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameMainNewActivity
    public void T() {
        org.androidannotations.api.b.e("", new f(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameMainNewActivity
    public void X() {
        org.androidannotations.api.b.e("", new a(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameMainNewActivity
    public void a0(GameMainV3DataBean gameMainV3DataBean, boolean z4) {
        org.androidannotations.api.b.e("", new y(gameMainV3DataBean, z4), 0L);
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.K1.get(cls);
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        return (T) findViewById(i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameMainNewActivity
    public void l() {
        org.androidannotations.api.b.e("", new g(), 0L);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.J1);
        s0(bundle);
        super.onCreate(bundle);
        a4.c.c(c5);
        setContentView(R.layout.activity_game_main_new);
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f32610b = aVar.internalFindViewById(R.id.ll_loading);
        this.f32611c = (TextView) aVar.internalFindViewById(R.id.gameMainNewNameTx);
        this.f32612d = (TextView) aVar.internalFindViewById(R.id.gameMainNewFightTx);
        this.f32613e = (TextView) aVar.internalFindViewById(R.id.gameMainNewPlayTimeFrontTx);
        this.f32614f = (TextView) aVar.internalFindViewById(R.id.gameMainNewPlayTimeTx);
        this.f32615g = (TextView) aVar.internalFindViewById(R.id.gameMainNewStartTimeFrontTx);
        this.f32616h = (TextView) aVar.internalFindViewById(R.id.gameMainNewStartTimeTx);
        this.f32617i = (RecyclerView) aVar.internalFindViewById(R.id.memberFunRc);
        this.f32618j = (RelativeLayout) aVar.internalFindViewById(R.id.gameMainNewFightRl);
        this.f32619k = (TextView) aVar.internalFindViewById(R.id.toBuyTx);
        this.f32620l = (TextView) aVar.internalFindViewById(R.id.gameMainNewVipTitleTx);
        this.f32621m = (TextView) aVar.internalFindViewById(R.id.gameMainNewVipSubTitleTx);
        this.f32622n = (TextView) aVar.internalFindViewById(R.id.gameMainNewMoreTx);
        this.f32623o = (TextView) aVar.internalFindViewById(R.id.gameMainNewCommunityOneTx);
        this.f32624p = aVar.internalFindViewById(R.id.line1);
        this.f32627q = (TextView) aVar.internalFindViewById(R.id.gameMainNewCommunityTwoTx);
        this.f32628r = aVar.internalFindViewById(R.id.line2);
        this.f32629s = (RecyclerView) aVar.internalFindViewById(R.id.gameMainNewRv);
        this.f32630t = (GridView) aVar.internalFindViewById(R.id.gameMainNewLeftGv);
        this.f32631u = (SimpleDraweeView) aVar.internalFindViewById(R.id.gameMainNewBgIv);
        this.f32632v = (SimpleDraweeView) aVar.internalFindViewById(R.id.iv3);
        this.f32634w = (RelativeLayout) aVar.internalFindViewById(R.id.leftRl);
        this.f32635x = (LinearLayout) aVar.internalFindViewById(R.id.rightLl);
        this.f32636y = (RelativeLayout) aVar.internalFindViewById(R.id.discussNoContentRl);
        this.f32637z = (RelativeLayout) aVar.internalFindViewById(R.id.discussContentRl);
        this.A = (SimpleDraweeView) aVar.internalFindViewById(R.id.sm_reply_img);
        this.B = (RelativeLayout) aVar.internalFindViewById(R.id.rl_reply_text);
        this.C = (LinearLayout) aVar.internalFindViewById(R.id.hit_temp_ll);
        View internalFindViewById = aVar.internalFindViewById(R.id.gameMainNewBackIv);
        View internalFindViewById2 = aVar.internalFindViewById(R.id.gameMainNewStartGameRl);
        RelativeLayout relativeLayout = this.f32636y;
        if (relativeLayout != null) {
            relativeLayout.setOnClickListener(new k());
        }
        TextView textView = this.f32619k;
        if (textView != null) {
            textView.setOnClickListener(new r());
        }
        TextView textView2 = this.f32622n;
        if (textView2 != null) {
            textView2.setOnClickListener(new s());
        }
        TextView textView3 = this.f32623o;
        if (textView3 != null) {
            textView3.setOnClickListener(new t());
        }
        TextView textView4 = this.f32627q;
        if (textView4 != null) {
            textView4.setOnClickListener(new u());
        }
        if (internalFindViewById != null) {
            internalFindViewById.setOnClickListener(new v());
        }
        RelativeLayout relativeLayout2 = this.f32618j;
        if (relativeLayout2 != null) {
            relativeLayout2.setOnClickListener(new w());
        }
        if (internalFindViewById2 != null) {
            internalFindViewById2.setOnClickListener(new x());
        }
        j();
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.K1.put(cls, t4);
    }

    @Override // android.app.Activity
    public void setContentView(int i4) {
        super.setContentView(i4);
        this.J1.a(this);
    }

    @Override // android.app.Activity
    public void setIntent(Intent intent) {
        super.setIntent(intent);
        t0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameMainNewActivity
    public void y() {
        org.androidannotations.api.a.l(new m("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.GameMainNewActivity
    public void z() {
        org.androidannotations.api.a.l(new l("", 0L, ""));
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        this.J1.a(this);
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        super.setContentView(view);
        this.J1.a(this);
    }
}
