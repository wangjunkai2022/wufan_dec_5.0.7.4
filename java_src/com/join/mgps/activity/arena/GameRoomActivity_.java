package com.join.mgps.activity.arena;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.Fragment;
import app.mgsim.arena.ArenaResponse;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.dto.BattleChallengeConfig;
import com.papa91.battle.protocol.BattleServerAddr;
import com.papa91.battle.protocol.GameRoom;
import com.papa91.battle.protocol.KickInfo;
import java.util.HashMap;
import java.util.Map;
import org.androidannotations.api.a;
/* loaded from: classes4.dex */
public final class GameRoomActivity_ extends GameRoomActivity implements y3.a, a4.a, a4.b {

    /* renamed from: l3  reason: collision with root package name */
    public static final String f38647l3 = "battleChallengeConfig";

    /* renamed from: m3  reason: collision with root package name */
    public static final String f38648m3 = "roomLive";

    /* renamed from: n3  reason: collision with root package name */
    public static final String f38649n3 = "mGameRoom";

    /* renamed from: o3  reason: collision with root package name */
    public static final String f38650o3 = "joinSpectatorReason";

    /* renamed from: p3  reason: collision with root package name */
    public static final String f38651p3 = "gameName";

    /* renamed from: q3  reason: collision with root package name */
    public static final String f38652q3 = "isFastJoinRoom";

    /* renamed from: r3  reason: collision with root package name */
    public static final String f38653r3 = "isCreateRoom";

    /* renamed from: s3  reason: collision with root package name */
    public static final String f38654s3 = "isAllowPcJoin";

    /* renamed from: t3  reason: collision with root package name */
    public static final String f38655t3 = "from";

    /* renamed from: u3  reason: collision with root package name */
    public static final String f38656u3 = "password";

    /* renamed from: v3  reason: collision with root package name */
    public static final String f38657v3 = "position";

    /* renamed from: w3  reason: collision with root package name */
    public static final String f38658w3 = "copper";

    /* renamed from: j3  reason: collision with root package name */
    private final a4.c f38659j3 = new a4.c();

    /* renamed from: k3  reason: collision with root package name */
    private final Map<Class<?>, Object> f38660k3 = new HashMap();

    /* loaded from: classes4.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GameRoomActivity_.super.Q1();
        }
    }

    /* loaded from: classes4.dex */
    public static class a0 extends org.androidannotations.api.builder.a<a0> {

        /* renamed from: a  reason: collision with root package name */
        private Fragment f38662a;

        public a0(Context context) {
            super(context, GameRoomActivity_.class);
        }

        public a0 a(BattleChallengeConfig battleChallengeConfig) {
            return (a0) super.extra(GameRoomActivity_.f38647l3, battleChallengeConfig);
        }

        public a0 b(int i4) {
            return (a0) super.extra(GameRoomActivity_.f38658w3, i4);
        }

        public a0 c(String str) {
            return (a0) super.extra("from", str);
        }

        public a0 d(String str) {
            return (a0) super.extra("gameName", str);
        }

        public a0 e(int i4) {
            return (a0) super.extra(GameRoomActivity_.f38654s3, i4);
        }

        public a0 f(boolean z4) {
            return (a0) super.extra(GameRoomActivity_.f38653r3, z4);
        }

        public a0 g(boolean z4) {
            return (a0) super.extra(GameRoomActivity_.f38652q3, z4);
        }

        public a0 h(String str) {
            return (a0) super.extra(GameRoomActivity_.f38650o3, str);
        }

        public a0 i(GameRoom gameRoom) {
            return (a0) super.extra(GameRoomActivity_.f38649n3, gameRoom);
        }

        public a0 j(String str) {
            return (a0) super.extra(GameRoomActivity_.f38656u3, str);
        }

        public a0 k(int i4) {
            return (a0) super.extra("position", i4);
        }

        public a0 l(int i4) {
            return (a0) super.extra(GameRoomActivity_.f38648m3, i4);
        }

        @Override // org.androidannotations.api.builder.a, org.androidannotations.api.builder.b
        public org.androidannotations.api.builder.f startForResult(int i4) {
            Fragment fragment = this.f38662a;
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

        public a0(Fragment fragment) {
            super(fragment.getActivity(), GameRoomActivity_.class);
            this.f38662a = fragment;
        }
    }

    /* loaded from: classes4.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GameRoomActivity_.super.D1();
        }
    }

    /* loaded from: classes4.dex */
    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GameRoomActivity_.super.i2();
        }
    }

    /* loaded from: classes4.dex */
    class d implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f38665b;

        d(String str) {
            this.f38665b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            GameRoomActivity_.super.showToast(this.f38665b);
        }
    }

    /* loaded from: classes4.dex */
    class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GameRoomActivity_.super.o2();
        }
    }

    /* loaded from: classes4.dex */
    class f implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ BattleServerAddr f38668b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f38669c;

        f(BattleServerAddr battleServerAddr, String str) {
            this.f38668b = battleServerAddr;
            this.f38669c = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            GameRoomActivity_.super.p2(this.f38668b, this.f38669c);
        }
    }

    /* loaded from: classes4.dex */
    class g implements Runnable {
        g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GameRoomActivity_.super.s2();
        }
    }

    /* loaded from: classes4.dex */
    class h implements Runnable {
        h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GameRoomActivity_.super.N1();
        }
    }

    /* loaded from: classes4.dex */
    class i implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f38673b;

        i(int i4) {
            this.f38673b = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            GameRoomActivity_.super.b2(this.f38673b);
        }
    }

    /* loaded from: classes4.dex */
    class j implements Runnable {
        j() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GameRoomActivity_.super.Z1();
        }
    }

    /* loaded from: classes4.dex */
    class k implements View.OnClickListener {
        k() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GameRoomActivity_.this.iv_back();
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
                GameRoomActivity_.super.a2();
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
                GameRoomActivity_.super.t2();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class n extends a.c {
        n(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                GameRoomActivity_.super.L1();
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
                GameRoomActivity_.super.c2();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class p extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f38681b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(String str, long j4, String str2, String str3) {
            super(str, j4, str2);
            this.f38681b = str3;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                GameRoomActivity_.super.M1(this.f38681b);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class q extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f38683b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        q(String str, long j4, String str2, int i4) {
            super(str, j4, str2);
            this.f38683b = i4;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                GameRoomActivity_.super.K1(this.f38683b);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class r extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ GameRoom f38685b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        r(String str, long j4, String str2, GameRoom gameRoom) {
            super(str, j4, str2);
            this.f38685b = gameRoom;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                GameRoomActivity_.super.Y1(this.f38685b);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* loaded from: classes4.dex */
    class s implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f38687b;

        s(String str) {
            this.f38687b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            GameRoomActivity_.super.e2(this.f38687b);
        }
    }

    /* loaded from: classes4.dex */
    class t implements Runnable {
        t() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GameRoomActivity_.super.k2();
        }
    }

    /* loaded from: classes4.dex */
    class u implements Runnable {
        u() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GameRoomActivity_.super.g2();
        }
    }

    /* loaded from: classes4.dex */
    class v implements Runnable {
        v() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GameRoomActivity_.super.j2();
        }
    }

    /* loaded from: classes4.dex */
    class w implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ KickInfo f38692b;

        w(KickInfo kickInfo) {
            this.f38692b = kickInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            GameRoomActivity_.super.P1(this.f38692b);
        }
    }

    /* loaded from: classes4.dex */
    class x implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ArenaResponse f38694b;

        x(ArenaResponse arenaResponse) {
            this.f38694b = arenaResponse;
        }

        @Override // java.lang.Runnable
        public void run() {
            GameRoomActivity_.super.O1(this.f38694b);
        }
    }

    /* loaded from: classes4.dex */
    class y implements Runnable {
        y() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GameRoomActivity_.super.J1();
        }
    }

    /* loaded from: classes4.dex */
    class z implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ GameRoom f38697b;

        z(GameRoom gameRoom) {
            this.f38697b = gameRoom;
        }

        @Override // java.lang.Runnable
        public void run() {
            GameRoomActivity_.super.v2(this.f38697b);
        }
    }

    public static a0 V2(Context context) {
        return new a0(context);
    }

    public static a0 W2(Fragment fragment) {
        return new a0(fragment);
    }

    private void init_(Bundle bundle) {
        a4.c.b(this);
        this.O = AccountUtil_.getInstance_(this);
        injectExtras_();
    }

    private void injectExtras_() {
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            if (extras.containsKey(f38647l3)) {
                this.N = (BattleChallengeConfig) extras.getSerializable(f38647l3);
            }
            if (extras.containsKey(f38648m3)) {
                this.P = extras.getInt(f38648m3);
            }
            if (extras.containsKey(f38649n3)) {
                this.Q = (GameRoom) extras.getSerializable(f38649n3);
            }
            if (extras.containsKey(f38650o3)) {
                this.R = extras.getString(f38650o3);
            }
            if (extras.containsKey("gameName")) {
                this.S = extras.getString("gameName");
            }
            if (extras.containsKey(f38652q3)) {
                this.T = extras.getBoolean(f38652q3);
            }
            if (extras.containsKey(f38653r3)) {
                this.U = extras.getBoolean(f38653r3);
            }
            if (extras.containsKey(f38654s3)) {
                this.V = extras.getInt(f38654s3);
            }
            if (extras.containsKey("from")) {
                this.W = extras.getString("from");
            }
            if (extras.containsKey(f38656u3)) {
                this.X = extras.getString(f38656u3);
            }
            if (extras.containsKey("position")) {
                this.Y = extras.getInt("position");
            }
            if (extras.containsKey(f38658w3)) {
                this.Z = extras.getInt(f38658w3);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.arena.GameRoomActivity
    public void D1() {
        org.androidannotations.api.b.e("", new b(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.arena.GameRoomActivity
    public void J1() {
        org.androidannotations.api.b.e("", new y(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.arena.GameRoomActivity
    public void K1(int i4) {
        org.androidannotations.api.a.l(new q("", 0L, "", i4));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.arena.GameRoomActivity
    public void L1() {
        org.androidannotations.api.a.l(new n("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.arena.GameRoomActivity
    public void M1(String str) {
        org.androidannotations.api.a.l(new p("", 0L, "", str));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.arena.GameRoomActivity
    public void N1() {
        org.androidannotations.api.b.e("", new h(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.arena.GameRoomActivity
    public void O1(ArenaResponse arenaResponse) {
        org.androidannotations.api.b.e("", new x(arenaResponse), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.arena.GameRoomActivity
    public void P1(KickInfo kickInfo) {
        org.androidannotations.api.b.e("", new w(kickInfo), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.arena.GameRoomActivity
    public void Q1() {
        org.androidannotations.api.b.e("", new a(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.arena.GameRoomActivity
    public void Y1(GameRoom gameRoom) {
        org.androidannotations.api.a.l(new r("", 0L, "", gameRoom));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.arena.GameRoomActivity
    public void Z1() {
        org.androidannotations.api.b.e("", new j(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.arena.GameRoomActivity
    public void a2() {
        org.androidannotations.api.a.l(new l("", 3000L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.arena.GameRoomActivity
    public void b2(int i4) {
        org.androidannotations.api.b.e("", new i(i4), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.arena.GameRoomActivity
    public void c2() {
        org.androidannotations.api.a.l(new o("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.arena.GameRoomActivity
    public void e2(String str) {
        org.androidannotations.api.b.e("", new s(str), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.arena.GameRoomActivity
    public void g2() {
        org.androidannotations.api.b.e("", new u(), 0L);
    }

    @Override // y3.a
    public <T> T getBean(Class<T> cls) {
        return (T) this.f38660k3.get(cls);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.arena.GameRoomActivity
    public void i2() {
        org.androidannotations.api.b.e("", new c(), 0L);
    }

    @Override // a4.a
    public <T extends View> T internalFindViewById(int i4) {
        return (T) findViewById(i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.arena.GameRoomActivity
    public void j2() {
        org.androidannotations.api.b.e("", new v(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.arena.GameRoomActivity
    public void k2() {
        org.androidannotations.api.b.e("", new t(), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.arena.GameRoomActivity
    public void o2() {
        org.androidannotations.api.b.e("", new e(), 0L);
    }

    @Override // com.join.mgps.activity.arena.GameRoomActivity, com.join.mgps.activity.FriendActivity, com.BaseActivity, com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        a4.c c5 = a4.c.c(this.f38659j3);
        init_(bundle);
        super.onCreate(bundle);
        a4.c.c(c5);
        setContentView(R.layout.activity_game_room);
    }

    @Override // a4.b
    public void onViewChanged(a4.a aVar) {
        this.f38607p0 = (TextView) aVar.internalFindViewById(R.id.txtHint);
        this.f38608p1 = (TextView) aVar.internalFindViewById(R.id.showTitleMessage);
        this.f38615v1 = (TextView) aVar.internalFindViewById(R.id.txtCopper);
        this.A1 = (LinearLayout) aVar.internalFindViewById(R.id.llCopper);
        this.B1 = (TextView) aVar.internalFindViewById(R.id.tv_gold_info);
        this.C1 = (TextView) aVar.internalFindViewById(R.id.tv_game_name);
        this.D1 = (TextView) aVar.internalFindViewById(R.id.tv_roomNum);
        this.E1 = (TextView) aVar.internalFindViewById(R.id.tv_game_time_state);
        this.F1 = (LinearLayout) aVar.internalFindViewById(R.id.ll_set_challenge_gold);
        this.G1 = (TextView) aVar.internalFindViewById(R.id.tv_copper_plate_count);
        this.H1 = (ImageView) aVar.internalFindViewById(R.id.iv_elite);
        this.I1 = (ImageView) aVar.internalFindViewById(R.id.iv_challenge_gold_arrow);
        this.J1 = (ImageView) aVar.internalFindViewById(R.id.iv_switch_outdevice_in);
        this.K1 = aVar.internalFindViewById(R.id.rlRoomType);
        this.L1 = (TextView) aVar.internalFindViewById(R.id.tvRoomType);
        this.M1 = (RelativeLayout) aVar.internalFindViewById(R.id.rl_net_archive);
        this.N1 = (TextView) aVar.internalFindViewById(R.id.tv_archive_name);
        this.O1 = (ImageView) aVar.internalFindViewById(R.id.iv_arrow_net_archive);
        this.P1 = (LinearLayout) aVar.internalFindViewById(R.id.rl_audience_1);
        this.Q1 = (RelativeLayout) aVar.internalFindViewById(R.id.rl_audience_2);
        this.R1 = aVar.internalFindViewById(R.id.linesee);
        this.S1 = (TextView) aVar.internalFindViewById(R.id.tv_audience);
        this.T1 = (SimpleDraweeView) aVar.internalFindViewById(R.id.iv_audience);
        this.U1 = (LinearLayout) aVar.internalFindViewById(R.id.llPlayMode);
        this.V1 = (RadioButton) aVar.internalFindViewById(R.id.ivPlayModeSwitcher);
        this.W1 = (RadioGroup) aVar.internalFindViewById(R.id.radioGroup);
        this.X1 = aVar.internalFindViewById(R.id.ivPlayModeSwitcherlayout);
        this.Y1 = (TextView) aVar.internalFindViewById(R.id.tv_info_audience);
        this.f38591a2 = aVar.internalFindViewById(R.id.btnEntranceGame);
        this.f38593b2 = (ImageView) aVar.internalFindViewById(R.id.btnEntranceGameI);
        this.f38594c2 = (TextView) aVar.internalFindViewById(R.id.btnEntranceGameM);
        this.f38595d2 = (TextView) aVar.internalFindViewById(R.id.tv_invite_fight);
        this.f38618z2 = (TextView) aVar.internalFindViewById(R.id.tv_audience_name);
        View internalFindViewById = aVar.internalFindViewById(R.id.iv_back);
        if (internalFindViewById != null) {
            internalFindViewById.setOnClickListener(new k());
        }
        afterViews();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.arena.GameRoomActivity
    public void p2(BattleServerAddr battleServerAddr, String str) {
        org.androidannotations.api.b.e("", new f(battleServerAddr, str), 0L);
    }

    @Override // y3.a
    public <T> void putBean(Class<T> cls, T t4) {
        this.f38660k3.put(cls, t4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.arena.GameRoomActivity
    public void s2() {
        org.androidannotations.api.b.e("", new g(), 0L);
    }

    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i4) {
        super.setContentView(i4);
        this.f38659j3.a(this);
    }

    @Override // android.app.Activity
    public void setIntent(Intent intent) {
        super.setIntent(intent);
        injectExtras_();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.arena.GameRoomActivity
    public void showToast(String str) {
        org.androidannotations.api.b.e("", new d(str), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.arena.GameRoomActivity
    public void t2() {
        org.androidannotations.api.a.l(new m("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.activity.arena.GameRoomActivity
    public void v2(GameRoom gameRoom) {
        org.androidannotations.api.b.e("", new z(gameRoom), 0L);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        this.f38659j3.a(this);
    }

    @Override // com.join.mgps.activity.FriendActivity, com.BaseActivity, com.BaseFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        super.setContentView(view);
        this.f38659j3.a(this);
    }
}
