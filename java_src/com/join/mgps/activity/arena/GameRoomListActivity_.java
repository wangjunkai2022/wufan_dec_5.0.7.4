package com.join.mgps.activity.arena;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import app.mgsim.arena.ArenaResponse;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.customview.AlwaysMarqueeTextView;
import com.join.mgps.dto.ArenaGameRoomListConfig;
import com.join.mgps.dto.GameInfoBean;
import com.join.mgps.pref.PrefDef_;
import com.papa91.battle.protocol.AreaOnlinePeopleCount;
import com.papa91.battle.protocol.BattleArea;
import com.papa91.battle.protocol.Notification;
import com.papa91.battle.protocol.SimpleRoom;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.androidannotations.api.a;
/* loaded from: classes4.dex */
public final class GameRoomListActivity_ extends GameRoomListActivity implements y3.a, a4.a, a4.b {

    /* renamed from: j3  reason: collision with root package name */
    public static final String f38767j3 = "mGameInfo";

    /* renamed from: k3  reason: collision with root package name */
    public static final String f38768k3 = "isFormHall";

    /* renamed from: l3  reason: collision with root package name */
    public static final String f38769l3 = "filterGame";

    /* renamed from: h3  reason: collision with root package name */
    private final a4.c f38770h3 = new a4.c();

    /* renamed from: i3  reason: collision with root package name */
    private final Map<Class<?>, Object> f38771i3 = new HashMap();

    /* loaded from: classes4.dex */
    class a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f38772b;

        a(int i4) {
            this.f38772b = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            GameRoomListActivity_.super.L2(this.f38772b);
        }
    }

    /* loaded from: classes4.dex */
    class a0 implements Runnable {
        a0() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GameRoomListActivity_.super.V1();
        }
    }

    /* loaded from: classes4.dex */
    class b implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AreaOnlinePeopleCount f38775b;

        b(AreaOnlinePeopleCount areaOnlinePeopleCount) {
            this.f38775b = areaOnlinePeopleCount;
        }

        @Override // java.lang.Runnable
        public void run() {
            GameRoomListActivity_.super.l3(this.f38775b);
        }
    }

    /* loaded from: classes4.dex */
    class b0 implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f38777b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f38778c;

        b0(String str, int i4) {
            this.f38777b = str;
            this.f38778c = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            GameRoomListActivity_.super.i3(this.f38777b, this.f38778c);
        }
    }

    /* loaded from: classes4.dex */
    class c implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Notification f38780b;

        c(Notification notification) {
            this.f38780b = notification;
        }

        @Override // java.lang.Runnable
        public void run() {
            GameRoomListActivity_.super.p2(this.f38780b);
        }
    }

    /* loaded from: classes4.dex */
    class c0 implements Runnable {
        c0() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GameRoomListActivity_.super.F2();
        }
    }

    /* loaded from: classes4.dex */
    class d implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ArenaResponse f38783b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f38784c;

        d(ArenaResponse arenaResponse, boolean z4) {
            this.f38783b = arenaResponse;
            this.f38784c = z4;
        }

        @Override // java.lang.Runnable
        public void run() {
            GameRoomListActivity_.super.o3(this.f38783b, this.f38784c);
        }
    }

    /* loaded from: classes4.dex */
    class d0 implements Runnable {
        d0() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GameRoomListActivity_.super.o2();
        }
    }

    /* loaded from: classes4.dex */
    class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GameRoomListActivity_.super.e3();
        }
    }

    /* loaded from: classes4.dex */
    class e0 extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f38788b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f38789c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e0(String str, long j4, String str2, int i4, boolean z4) {
            super(str, j4, str2);
            this.f38788b = i4;
            this.f38789c = z4;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                GameRoomListActivity_.super.k3(this.f38788b, this.f38789c);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class f implements Runnable {
        f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GameRoomListActivity_.super.d2();
        }
    }

    /* loaded from: classes4.dex */
    class f0 extends a.c {
        f0(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                GameRoomListActivity_.super.O2();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class g implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f38793b;

        g(boolean z4) {
            this.f38793b = z4;
        }

        @Override // java.lang.Runnable
        public void run() {
            GameRoomListActivity_.super.j3(this.f38793b);
        }
    }

    /* loaded from: classes4.dex */
    class g0 implements View.OnClickListener {
        g0() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GameRoomListActivity_.this.iv_back();
        }
    }

    /* loaded from: classes4.dex */
    class h implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ArenaResponse f38796b;

        h(ArenaResponse arenaResponse) {
            this.f38796b = arenaResponse;
        }

        @Override // java.lang.Runnable
        public void run() {
            GameRoomListActivity_.super.handleFailure(this.f38796b);
        }
    }

    /* loaded from: classes4.dex */
    class h0 extends a.c {
        h0(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                GameRoomListActivity_.super.g2();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class i implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ BattleArea f38799b;

        i(BattleArea battleArea) {
            this.f38799b = battleArea;
        }

        @Override // java.lang.Runnable
        public void run() {
            GameRoomListActivity_.super.X2(this.f38799b);
        }
    }

    /* loaded from: classes4.dex */
    class i0 extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f38801b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i0(String str, long j4, String str2, String str3) {
            super(str, j4, str2);
            this.f38801b = str3;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                GameRoomListActivity_.super.f2(this.f38801b);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class j implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ArenaResponse f38803b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f38804c;

        j(ArenaResponse arenaResponse, boolean z4) {
            this.f38803b = arenaResponse;
            this.f38804c = z4;
        }

        @Override // java.lang.Runnable
        public void run() {
            GameRoomListActivity_.super.q2(this.f38803b, this.f38804c);
        }
    }

    /* loaded from: classes4.dex */
    class j0 implements View.OnClickListener {
        j0() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GameRoomListActivity_.this.B2();
        }
    }

    /* loaded from: classes4.dex */
    class k implements View.OnClickListener {
        k() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GameRoomListActivity_.this.S2();
        }
    }

    /* loaded from: classes4.dex */
    class k0 implements View.OnClickListener {
        k0() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GameRoomListActivity_.this.M1();
        }
    }

    /* loaded from: classes4.dex */
    class l implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f38809b;

        l(List list) {
            this.f38809b = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            GameRoomListActivity_.super.r2(this.f38809b);
        }
    }

    /* loaded from: classes4.dex */
    class l0 implements View.OnClickListener {
        l0() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GameRoomListActivity_.this.N1();
        }
    }

    /* loaded from: classes4.dex */
    class m implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f38812b;

        m(List list) {
            this.f38812b = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            GameRoomListActivity_.super.s2(this.f38812b);
        }
    }

    /* loaded from: classes4.dex */
    class m0 implements View.OnClickListener {
        m0() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GameRoomListActivity_.this.close();
        }
    }

    /* loaded from: classes4.dex */
    class n implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f38815b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f38816c;

        n(boolean z4, boolean z5) {
            this.f38815b = z4;
            this.f38816c = z5;
        }

        @Override // java.lang.Runnable
        public void run() {
            GameRoomListActivity_.super.Z1(this.f38815b, this.f38816c);
        }
    }

    /* loaded from: classes4.dex */
    class n0 implements View.OnClickListener {
        n0() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GameRoomListActivity_.this.E2();
        }
    }

    /* loaded from: classes4.dex */
    class o implements Runnable {
        o() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GameRoomListActivity_.super.e2();
        }
    }

    /* loaded from: classes4.dex */
    class o0 implements View.OnClickListener {
        o0() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GameRoomListActivity_.this.J2();
        }
    }

    /* loaded from: classes4.dex */
    class p implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f38821b;

        p(int i4) {
            this.f38821b = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            GameRoomListActivity_.super.T2(this.f38821b);
        }
    }

    /* loaded from: classes4.dex */
    public static class p0 extends org.androidannotations.api.builder.a<p0> {

        /* renamed from: a  reason: collision with root package name */
        private Fragment f38823a;

        public p0(Context context) {
            super(context, GameRoomListActivity_.class);
        }

        public p0 a(boolean z4) {
            return (p0) super.extra(GameRoomListActivity_.f38769l3, z4);
        }

        public p0 b(boolean z4) {
            return (p0) super.extra(GameRoomListActivity_.f38768k3, z4);
        }

        public p0 c(GameInfoBean gameInfoBean) {
            return (p0) super.extra("mGameInfo", gameInfoBean);
        }

        @Override // org.androidannotations.api.builder.a, org.androidannotations.api.builder.b
        public org.androidannotations.api.builder.f startForResult(int i4) {
            Fragment fragment = this.f38823a;
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

        public p0(Fragment fragment) {
            super(fragment.getActivity(), GameRoomListActivity_.class);
            this.f38823a = fragment;
        }
    }

    /* loaded from: classes4.dex */
    class q implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ArenaGameRoomListConfig f38824b;

        q(ArenaGameRoomListConfig arenaGameRoomListConfig) {
            this.f38824b = arenaGameRoomListConfig;
        }

        @Override // java.lang.Runnable
        public void run() {
            GameRoomListActivity_.super.z2(this.f38824b);
        }
    }

    /* loaded from: classes4.dex */
    class r implements Runnable {
        r() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GameRoomListActivity_.super.d3();
        }
    }

    /* loaded from: classes4.dex */
    class s implements Runnable {
        s() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GameRoomListActivity_.super.f3();
        }
    }

    /* loaded from: classes4.dex */
    class t implements Runnable {
        t() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GameRoomListActivity_.super.Y2();
        }
    }

    /* loaded from: classes4.dex */
    class u implements Runnable {
        u() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GameRoomListActivity_.super.v2();
        }
    }

    /* loaded from: classes4.dex */
    class v implements View.OnClickListener {
        v() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GameRoomListActivity_.this.O1();
        }
    }

    /* loaded from: classes4.dex */
    class w implements Runnable {
        w() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GameRoomListActivity_.super.a2();
        }
    }

    /* loaded from: classes4.dex */
    class x implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f38832b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f38833c;

        x(int i4, boolean z4) {
            this.f38832b = i4;
            this.f38833c = z4;
        }

        @Override // java.lang.Runnable
        public void run() {
            GameRoomListActivity_.super.p3(this.f38832b, this.f38833c);
        }
    }

    /* loaded from: classes4.dex */
    class y implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f38835b;

        y(String str) {
            this.f38835b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            GameRoomListActivity_.super.showToast(this.f38835b);
        }
    }

    /* loaded from: classes4.dex */
    class z implements Runnable {
        z() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GameRoomListActivity_.super.u2();
        }
    }

    public static p0 W3(Context context) {
        return new p0(context);
    }

    public static p0 X3(Fragment fragment) {
        return new p0(fragment);
    }

    private void init_(Bundle bundle) {
        this.H1 = new PrefDef_(this);
        a4.c.b(this);
        this.F2 = AccountUtil_.getInstance_(this);
        injectExtras_();
    }

    private void injectExtras_() {
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            if (extras.containsKey("mGameInfo")) {
                this.N = (GameInfoBean) extras.getSerializable("mGameInfo");
            }
            if (extras.containsKey(f38768k3)) {
                this.O = extras.getBoolean(f38768k3);
            }
            if (extras.containsKey(f38769l3)) {
                this.E1 = extras.getBoolean(f38769l3);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.arena.GameRoomListActivity
    public void F2() {
        org.androidannotations.api.b.e("", new c0(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.arena.GameRoomListActivity
    public void L2(int i4) {
        org.androidannotations.api.b.e("", new a(i4), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.arena.GameRoomListActivity
    public void O2() {
        org.androidannotations.api.a.l(new f0("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.arena.GameRoomListActivity
    public void T2(int i4) {
        org.androidannotations.api.b.e("", new p(i4), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.arena.GameRoomListActivity
    public void V1() {
        org.androidannotations.api.b.e("", new a0(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.arena.GameRoomListActivity
    public void X2(BattleArea battleArea) {
        org.androidannotations.api.b.e("", new i(battleArea), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.arena.GameRoomListActivity
    public void Y2() {
        org.androidannotations.api.b.e("", new t(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.arena.GameRoomListActivity
    public void Z1(boolean z4, boolean z5) {
        org.androidannotations.api.b.e("", new n(z4, z5), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.arena.GameRoomListActivity
    public void a2() {
        org.androidannotations.api.b.e("", new w(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.arena.GameRoomListActivity
    public void d2() {
        org.androidannotations.api.b.e("", new f(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.arena.GameRoomListActivity
    public void d3() {
        org.androidannotations.api.b.e("", new r(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.arena.GameRoomListActivity
    public void e2() {
        org.androidannotations.api.b.e("", new o(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.arena.GameRoomListActivity
    public void e3() {
        org.androidannotations.api.b.e("", new e(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.arena.GameRoomListActivity
    public void f2(String str) {
        org.androidannotations.api.a.l(new i0("", 0L, "", str));
    }

    @Override // com.join.mgps.activity.arena.GameRoomListActivity
    public void f3() {
        org.androidannotations.api.b.e("", new s(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.arena.GameRoomListActivity
    public void g2() {
        org.androidannotations.api.a.l(new h0("", 0L, ""));
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.f38771i3.get(cls);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.arena.GameRoomListActivity
    public void handleFailure(ArenaResponse arenaResponse) {
        org.androidannotations.api.b.e("", new h(arenaResponse), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.arena.GameRoomListActivity
    public void i3(String str, int i4) {
        org.androidannotations.api.b.e("", new b0(str, i4), 0L);
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        return (T) findViewById(i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.arena.GameRoomListActivity
    public void j3(boolean z4) {
        org.androidannotations.api.b.e("", new g(z4), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.arena.GameRoomListActivity
    public void k3(int i4, boolean z4) {
        org.androidannotations.api.a.l(new e0("", 0L, "", i4, z4));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.arena.GameRoomListActivity
    public void l3(AreaOnlinePeopleCount areaOnlinePeopleCount) {
        org.androidannotations.api.b.e("", new b(areaOnlinePeopleCount), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.arena.GameRoomListActivity
    public void o2() {
        org.androidannotations.api.b.e("", new d0(), 500L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.arena.GameRoomListActivity
    public void o3(ArenaResponse arenaResponse, boolean z4) {
        org.androidannotations.api.b.e("", new d(arenaResponse, z4), 0L);
    }

    @Override // com.join.mgps.activity.arena.GameRoomListActivity, com.join.mgps.activity.FriendActivity, com.BaseActivity, com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.f38770h3);
        init_(bundle);
        super.onCreate(bundle);
        a4.c.c(c5);
        setContentView(R.layout.activity_game_room_list);
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.P = (TextView) aVar.internalFindViewById(R.id.tv_area);
        this.Q = (TextView) aVar.internalFindViewById(R.id.tv_title);
        this.R = aVar.internalFindViewById(R.id.redPoint);
        this.S = (LinearLayout) aVar.internalFindViewById(R.id.iv_list);
        this.T = (LinearLayout) aVar.internalFindViewById(R.id.ll_standard_room);
        this.U = (TextView) aVar.internalFindViewById(R.id.tv_standard__room_count);
        this.V = (TextView) aVar.internalFindViewById(R.id.tv_standard_room_name);
        this.W = (LinearLayout) aVar.internalFindViewById(R.id.ll_elite_room);
        this.X = (TextView) aVar.internalFindViewById(R.id.tv_elite_room_count);
        this.Y = (TextView) aVar.internalFindViewById(R.id.tv_elite_room_name);
        this.Z = (LinearLayout) aVar.internalFindViewById(R.id.ll_race_room);
        this.f38721p0 = (TextView) aVar.internalFindViewById(R.id.tv_race_room_name);
        this.f38722p1 = (TextView) aVar.internalFindViewById(R.id.tv_race_room_info);
        this.f38729v1 = (TextView) aVar.internalFindViewById(R.id.tv_loading_info);
        this.A1 = (ProgressBar) aVar.internalFindViewById(R.id.progressLoding);
        this.B1 = (LinearLayout) aVar.internalFindViewById(R.id.ll_broadcast);
        this.C1 = (ImageView) aVar.internalFindViewById(R.id.imgIconList);
        this.D1 = aVar.internalFindViewById(R.id.myDragImageView);
        this.F1 = (AlwaysMarqueeTextView) aVar.internalFindViewById(R.id.tv_broadcast);
        this.G1 = (ViewPager) aVar.internalFindViewById(R.id.mViewPager);
        this.W1 = (RelativeLayout) aVar.internalFindViewById(R.id.rl_top);
        this.X1 = (LinearLayout) aVar.internalFindViewById(R.id.ll_battle_area);
        this.f38711f2 = (LinearLayout) aVar.internalFindViewById(R.id.ll_tab);
        this.f38712g2 = (ImageView) aVar.internalFindViewById(R.id.iv_battle_area_arrow);
        this.f38720o2 = (LinearLayout) aVar.internalFindViewById(R.id.ll_error);
        this.f38723p2 = (LinearLayout) aVar.internalFindViewById(R.id.ll_loading);
        this.B2 = (ImageView) aVar.internalFindViewById(R.id.btnFastGame);
        this.C2 = (ImageView) aVar.internalFindViewById(R.id.btnCreateRoom);
        this.D2 = (LinearLayout) aVar.internalFindViewById(R.id.footer);
        this.M2 = (RecyclerView) aVar.internalFindViewById(R.id.recyclerViewGamelist);
        this.N2 = (RecyclerView) aVar.internalFindViewById(R.id.recyclerView);
        this.O2 = aVar.internalFindViewById(R.id.selecterLayout);
        View internalFindViewById = aVar.internalFindViewById(R.id.btnRefresh);
        View internalFindViewById2 = aVar.internalFindViewById(R.id.iv_back);
        View internalFindViewById3 = aVar.internalFindViewById(R.id.btnFastGameM);
        View internalFindViewById4 = aVar.internalFindViewById(R.id.close);
        View internalFindViewById5 = aVar.internalFindViewById(R.id.quanmingxing);
        View view = this.O2;
        if (view != null) {
            view.setOnClickListener(new k());
        }
        if (internalFindViewById != null) {
            internalFindViewById.setOnClickListener(new v());
        }
        if (internalFindViewById2 != null) {
            internalFindViewById2.setOnClickListener(new g0());
        }
        LinearLayout linearLayout = this.S;
        if (linearLayout != null) {
            linearLayout.setOnClickListener(new j0());
        }
        ImageView imageView = this.C2;
        if (imageView != null) {
            imageView.setOnClickListener(new k0());
        }
        if (internalFindViewById3 != null) {
            internalFindViewById3.setOnClickListener(new l0());
        }
        if (internalFindViewById4 != null) {
            internalFindViewById4.setOnClickListener(new m0());
        }
        View view2 = this.D1;
        if (view2 != null) {
            view2.setOnClickListener(new n0());
        }
        if (internalFindViewById5 != null) {
            internalFindViewById5.setOnClickListener(new o0());
        }
        afterViews();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.arena.GameRoomListActivity
    public void p2(Notification notification) {
        org.androidannotations.api.b.e("", new c(notification), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.arena.GameRoomListActivity
    public void p3(int i4, boolean z4) {
        org.androidannotations.api.b.e("", new x(i4, z4), 0L);
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.f38771i3.put(cls, t4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.arena.GameRoomListActivity
    public void q2(ArenaResponse arenaResponse, boolean z4) {
        org.androidannotations.api.b.e("", new j(arenaResponse, z4), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.arena.GameRoomListActivity
    public void r2(List<SimpleRoom> list) {
        org.androidannotations.api.b.e("", new l(list), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.arena.GameRoomListActivity
    public void s2(List<SimpleRoom> list) {
        org.androidannotations.api.b.e("", new m(list), 0L);
    }

    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i4) {
        super.setContentView(i4);
        this.f38770h3.a(this);
    }

    @Override // android.app.Activity
    public void setIntent(Intent intent) {
        super.setIntent(intent);
        injectExtras_();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.arena.GameRoomListActivity
    public void showToast(String str) {
        org.androidannotations.api.b.e("", new y(str), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.arena.GameRoomListActivity
    public void u2() {
        org.androidannotations.api.b.e("", new z(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.arena.GameRoomListActivity
    public void v2() {
        org.androidannotations.api.b.e("", new u(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.arena.GameRoomListActivity
    public void z2(ArenaGameRoomListConfig arenaGameRoomListConfig) {
        org.androidannotations.api.b.e("", new q(arenaGameRoomListConfig), 0L);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        this.f38770h3.a(this);
    }

    @Override // com.join.mgps.activity.FriendActivity, com.BaseActivity, com.BaseFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        super.setContentView(view);
        this.f38770h3.a(this);
    }
}
