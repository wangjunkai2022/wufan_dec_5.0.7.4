package com.join.mgps.activity;

import android.app.Activity;
import android.app.Dialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import app.mgsim.arena.ArenaConstants;
import app.mgsim.arena.ArenaLobbyServer;
import app.mgsim.arena.ArenaRequest;
import app.mgsim.arena.ArenaRequestFactory;
import app.mgsim.arena.ArenaResponse;
import app.mgsim.arena.SocketError;
import app.mgsim.arena.SocketListener;
import com.MApplication;
import com.bytedance.sdk.openadsdk.TTNativeExpressAd;
import com.facebook.drawee.view.SimpleDraweeView;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.github.snowdream.android.app.downloader.b;
import com.join.android.app.common.utils.APKUtils;
import com.join.android.app.common.utils.JsonMapper;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.IntentDateBean;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.Util.RequestBeanUtil;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.activity.arena.GameRoomActivity;
import com.join.mgps.activity.arena.GameRoomActivity_;
import com.join.mgps.activity.arena.GameRoomListActivity_;
import com.join.mgps.activity.login.LoginSplashActivity_;
import com.join.mgps.ad.c;
import com.join.mgps.adapter.GameRecommendAdapter1;
import com.join.mgps.adapter.j1;
import com.join.mgps.db.tables.CloudDownRecoderTable;
import com.join.mgps.db.tables.EMUApkTable;
import com.join.mgps.db.tables.GameMainTable;
import com.join.mgps.db.tables.PlayGameTimeTable;
import com.join.mgps.dialog.l1;
import com.join.mgps.dialog.x;
import com.join.mgps.dto.ArchiveColudArgs;
import com.join.mgps.dto.ArchiveNumDataBean;
import com.join.mgps.dto.CloudListDataBean;
import com.join.mgps.dto.CommentAllListBean;
import com.join.mgps.dto.CommentResponse;
import com.join.mgps.dto.CommonMultiItemBean;
import com.join.mgps.dto.DomainInfoBean;
import com.join.mgps.dto.DynamicEntranceBean;
import com.join.mgps.dto.ExtBean;
import com.join.mgps.dto.ForumBean;
import com.join.mgps.dto.ForumData;
import com.join.mgps.dto.ForumResponse;
import com.join.mgps.dto.GameInfoBean;
import com.join.mgps.dto.GameMainCommunityBean;
import com.join.mgps.dto.GameMainDataBean;
import com.join.mgps.dto.GameMainNetBattle;
import com.join.mgps.dto.GameMainV4DataBean;
import com.join.mgps.dto.GameMainachieve;
import com.join.mgps.dto.GameMaingameinfo;
import com.join.mgps.dto.GameMasteryLevel;
import com.join.mgps.dto.GameTimeLevel;
import com.join.mgps.dto.GameWorldResponse;
import com.join.mgps.dto.MulPostData;
import com.join.mgps.dto.NetBattleStartGameDto;
import com.join.mgps.dto.OnlineCouponConfigBean;
import com.join.mgps.dto.PdAdCfgBean;
import com.join.mgps.dto.PlayCfgBean;
import com.join.mgps.dto.PspBattleServer;
import com.join.mgps.dto.RecommendAd;
import com.join.mgps.dto.RequestCommentAllListArgs;
import com.join.mgps.dto.RequestGameIdArgs;
import com.join.mgps.dto.RequestModel;
import com.join.mgps.dto.RequestSimulatorAchievementListArgs;
import com.join.mgps.dto.ResponseModel;
import com.join.mgps.dto.ResultArenaBean;
import com.join.mgps.dto.ResultResMainBean;
import com.join.mgps.dto.RomArchived;
import com.join.mgps.dto.SimulatorAdCfgBean;
import com.join.mgps.dto.SimulatorAllAchievementBean;
import com.join.mgps.enums.ConstantIntEnum;
import com.join.mgps.pref.PrefDef_;
import com.join.mgps.service.CommonService_;
import com.join.mgps.socket.fight.arena.a;
import com.join.mgps.socket.fight.arena.b;
import com.papa.sim.statistic.Event;
import com.papa.sim.statistic.Ext;
import com.papa91.arc.bean.ButtonBean;
import com.papa91.arc.common.constants.BAction;
import com.papa91.arc.http.utils.PrefUtil;
import com.papa91.battle.protocol.GameRoom;
import com.qq.e.ads.nativ.NativeExpressADView;
import com.umeng.analytics.MobclickAgent;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.Extra;
import org.androidannotations.annotations.Fullscreen;
import org.androidannotations.annotations.Receiver;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
import org.androidannotations.annotations.WindowFeature;
import org.androidannotations.annotations.sharedpreferences.Pref;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
@WindowFeature({1})
@EActivity(R.layout.activity_game_main_3)
@Fullscreen
/* loaded from: classes.dex */
public class GameMainActivity3 extends FriendActivity implements j1.a {
    r A1;
    com.join.mgps.rpc.l B1;
    GameMainV4DataBean C1;
    private String D1;
    com.wufan.user.service.protobuf.n0 E1;
    com.join.mgps.rpc.k F1;
    private com.join.mgps.socket.fight.arena.b J1;
    private com.join.mgps.socket.fight.arena.a K1;
    private com.join.mgps.adapter.j1 L1;
    @Extra
    String N;
    com.join.mgps.rpc.f N1;
    @Extra
    String O;
    com.join.mgps.rpc.d O1;
    @ViewById
    View P;
    private GameRecommendAdapter1 P1;
    @ViewById
    TextView Q;
    private EmuOutResultReceiver Q1;
    @ViewById
    TextView R;
    com.github.snowdream.android.app.downloader.b R1;
    @ViewById
    View S;
    private b.InterfaceC0290b S1;
    View T;
    com.join.mgps.dialog.x T1;
    @ViewById
    GridView U;
    @ViewById
    SimpleDraweeView V;
    @ViewById
    View W;
    @ViewById
    RecyclerView X;
    private Context Y;
    List<PlayGameTimeTable> Z;
    private com.join.mgps.dialog.l1 Z1;
    @Pref

    /* renamed from: b2  reason: collision with root package name */
    PrefDef_ f32372b2;

    /* renamed from: c2  reason: collision with root package name */
    com.join.mgps.rpc.i f32373c2;

    /* renamed from: d2  reason: collision with root package name */
    int f32374d2;

    /* renamed from: j2  reason: collision with root package name */
    List<RomArchived> f32380j2;

    /* renamed from: m2  reason: collision with root package name */
    ArchiveNumDataBean f32383m2;

    /* renamed from: n2  reason: collision with root package name */
    PlayCfgBean f32384n2;

    /* renamed from: p0  reason: collision with root package name */
    private DownloadTask f32386p0;

    /* renamed from: q2  reason: collision with root package name */
    com.join.mgps.ad.x f32389q2;

    /* renamed from: r2  reason: collision with root package name */
    com.join.mgps.ad.f f32390r2;

    /* renamed from: s2  reason: collision with root package name */
    PlayCfgBean f32391s2;

    /* renamed from: u2  reason: collision with root package name */
    com.join.mgps.ad.v f32393u2;

    /* renamed from: v1  reason: collision with root package name */
    List<PspBattleServer> f32394v1;

    /* renamed from: x2  reason: collision with root package name */
    com.join.mgps.ad.e f32396x2;
    com.join.mgps.ad.j y2;

    /* renamed from: p1  reason: collision with root package name */
    private String f32387p1 = "";
    private String G1 = "";
    private int H1 = 0;
    private String I1 = "";
    private List<DynamicEntranceBean> M1 = new ArrayList();
    Map<String, CloudListDataBean> U1 = new HashMap();
    int V1 = 1;
    int W1 = 0;
    List<CommonMultiItemBean> X1 = new ArrayList();
    private boolean Y1 = false;

    /* renamed from: a2  reason: collision with root package name */
    private List<CommentAllListBean.GeneralCommentBean> f32371a2 = new ArrayList();

    /* renamed from: e2  reason: collision with root package name */
    List<GameMainCommunityBean.PostsBean> f32375e2 = new ArrayList();

    /* renamed from: f2  reason: collision with root package name */
    private CountDownTimer f32376f2 = new n(com.join.mgps.data.c.f49010a, 1000);

    /* renamed from: g2  reason: collision with root package name */
    private final b.InterfaceC0385b f32377g2 = new o();

    /* renamed from: h2  reason: collision with root package name */
    private final SocketListener.NotifyObserver f32378h2 = new p();

    /* renamed from: i2  reason: collision with root package name */
    public boolean f32379i2 = false;

    /* renamed from: k2  reason: collision with root package name */
    public boolean f32381k2 = true;

    /* renamed from: l2  reason: collision with root package name */
    public boolean f32382l2 = true;

    /* renamed from: o2  reason: collision with root package name */
    boolean f32385o2 = false;

    /* renamed from: p2  reason: collision with root package name */
    boolean f32388p2 = false;

    /* renamed from: t2  reason: collision with root package name */
    protected int f32392t2 = 315;
    List<TTNativeExpressAd> v2 = null;

    /* renamed from: w2  reason: collision with root package name */
    List<NativeExpressADView> f32395w2 = null;

    /* loaded from: classes4.dex */
    public class EmuOutResultReceiver extends BroadcastReceiver {
        public EmuOutResultReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (BAction.ACTION_EMU_GAME_OUT_AD.equals(intent.getAction())) {
                int intExtra = intent.getIntExtra("eventType", 0);
                int intExtra2 = intent.getIntExtra("eventFlag", 0);
                intent.getStringExtra("packageName");
                if (intExtra != 0) {
                    com.join.mgps.event.a aVar = new com.join.mgps.event.a(intExtra);
                    aVar.e(intExtra2);
                    GameMainActivity3.this.onADEvent(aVar);
                }
            }
        }
    }

    /* loaded from: classes4.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GameMainActivity3.this.q2();
            GameMainActivity3.this.t2();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class b extends com.join.mgps.ad.x {
        b(Context context, String str, String str2) {
            super(context, str, str2);
        }

        @Override // com.join.mgps.ad.d, com.join.mgps.ad.t, com.join.mgps.ad.n
        public void a(String str, int i4, int i5) {
            super.a(str, i4, i5);
            l(Event.Emu_ExitAd_Close.name(), str);
        }

        @Override // com.join.mgps.ad.d, com.join.mgps.ad.t, com.join.mgps.ad.n
        public void b(boolean z4) {
            super.b(z4);
        }

        @Override // com.join.mgps.ad.d, com.join.mgps.ad.t, com.join.mgps.ad.n
        public void onADClick() {
            super.onADClick();
            MApplication.f1497x.G(true);
            l(Event.Emu_ExitAd_Click.name(), this.f39682f);
        }

        @Override // com.join.mgps.ad.d, com.join.mgps.ad.t, com.join.mgps.ad.n
        public void onADShow() {
            super.onADShow();
            l(Event.Emu_ExitAd_Pop.name(), this.f39682f);
        }

        @Override // com.join.mgps.ad.d, com.join.mgps.ad.t, com.join.mgps.ad.n
        public void onInitSuccess() {
            super.onInitSuccess();
            h(false);
        }

        @Override // com.join.mgps.ad.d, com.join.mgps.ad.t, com.join.mgps.ad.n
        public void onVideoCached() {
            super.onVideoCached();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class c extends com.join.mgps.ad.f {
        c(Context context, String str, String str2) {
            super(context, str, str2);
        }

        @Override // com.join.mgps.ad.d, com.join.mgps.ad.t, com.join.mgps.ad.n
        public void a(String str, int i4, int i5) {
            super.a(str, i4, i5);
            l(Event.Emu_ExitAd_Close.name(), str);
        }

        @Override // com.join.mgps.ad.d, com.join.mgps.ad.t, com.join.mgps.ad.n
        public void b(boolean z4) {
            super.b(z4);
        }

        @Override // com.join.mgps.ad.d, com.join.mgps.ad.t, com.join.mgps.ad.n
        public void onADClick() {
            super.onADClick();
            MApplication.f1497x.G(true);
            l(Event.Emu_ExitAd_Click.name(), this.f39682f);
        }

        @Override // com.join.mgps.ad.d, com.join.mgps.ad.t, com.join.mgps.ad.n
        public void onADShow() {
            super.onADShow();
            l(Event.Emu_ExitAd_Pop.name(), this.f39682f);
        }

        @Override // com.join.mgps.ad.d, com.join.mgps.ad.t, com.join.mgps.ad.n
        public void onInitSuccess() {
            super.onInitSuccess();
            h(false);
        }

        @Override // com.join.mgps.ad.d, com.join.mgps.ad.t, com.join.mgps.ad.n
        public void onVideoCached() {
            super.onVideoCached();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class d extends com.join.mgps.ad.v {
        d(Context context, String str, String str2) {
            super(context, str, str2);
        }

        @Override // com.join.mgps.ad.o, com.join.mgps.ad.m
        public void onInitSuccess() {
            super.onInitSuccess();
            double d5 = GameMainActivity3.this.f32392t2;
            Double.isNaN(d5);
            b(3, (int) (d5 * 0.875d), 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class e implements c.a<TTNativeExpressAd> {
        e() {
        }

        @Override // com.join.mgps.ad.c.a
        /* renamed from: b */
        public void a(TTNativeExpressAd tTNativeExpressAd) {
        }

        @Override // com.join.mgps.ad.c.a
        public void onADLoaded(List<TTNativeExpressAd> list) {
            GameMainActivity3 gameMainActivity3 = GameMainActivity3.this;
            if (gameMainActivity3.v2 == null) {
                gameMainActivity3.v2 = new ArrayList();
            }
            GameMainActivity3.this.v2.addAll(list);
            if (GameMainActivity3.this.v2.size() < 6) {
                GameMainActivity3.this.Z1();
            }
        }

        @Override // com.join.mgps.ad.c.a
        public void onAdClick() {
            GameMainActivity3.this.k2(Event.Exit_flowad_click.name(), GameMainActivity3.this.N);
            MApplication.f1497x.G(true);
        }

        @Override // com.join.mgps.ad.c.a
        public void onAdShow() {
            GameMainActivity3.this.k2(Event.Exit_flowad_pop_tt.name(), GameMainActivity3.this.N);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class f extends com.join.mgps.ad.e {
        f(Context context, String str, String str2) {
            super(context, str, str2);
        }

        @Override // com.join.mgps.ad.o, com.join.mgps.ad.m
        public void onInitSuccess() {
            super.onInitSuccess();
            double d5 = GameMainActivity3.this.f32392t2;
            Double.isNaN(d5);
            b(3, (int) (d5 * 0.8d), -2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class g implements c.a<NativeExpressADView> {
        g() {
        }

        @Override // com.join.mgps.ad.c.a
        /* renamed from: b */
        public void a(NativeExpressADView nativeExpressADView) {
            org.greenrobot.eventbus.c.f().o(new com.join.mgps.event.u(6, nativeExpressADView));
        }

        @Override // com.join.mgps.ad.c.a
        public void onADLoaded(List<NativeExpressADView> list) {
            GameMainActivity3 gameMainActivity3 = GameMainActivity3.this;
            if (gameMainActivity3.f32395w2 == null) {
                gameMainActivity3.f32395w2 = new ArrayList();
            }
            GameMainActivity3.this.f32395w2.addAll(list);
            if (GameMainActivity3.this.f32395w2.size() < 6) {
                GameMainActivity3.this.Z1();
            }
        }

        @Override // com.join.mgps.ad.c.a
        public void onAdClick() {
            GameMainActivity3.this.k2(Event.Exit_flowad_click.name(), GameMainActivity3.this.N);
            MApplication.f1497x.G(true);
        }

        @Override // com.join.mgps.ad.c.a
        public void onAdShow() {
            GameMainActivity3.this.k2(Event.Exit_flowad_pop_gdt.name(), GameMainActivity3.this.N);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class h extends com.join.mgps.ad.j {
        h(Context context, String str, String str2) {
            super(context, str, str2);
        }

        @Override // com.join.mgps.ad.d, com.join.mgps.ad.t, com.join.mgps.ad.n
        public void a(String str, int i4, int i5) {
            super.a(str, i4, i5);
        }

        @Override // com.join.mgps.ad.d, com.join.mgps.ad.t, com.join.mgps.ad.n
        public void b(boolean z4) {
            super.b(z4);
            l(Event.Stopad_GromoreSdk_loading.name(), this.f39682f);
        }

        @Override // com.join.mgps.ad.d, com.join.mgps.ad.t, com.join.mgps.ad.n
        public void onADClick() {
            super.onADClick();
            l(Event.Stopad_GromoreSdk_Click.name(), this.f39682f);
        }

        @Override // com.join.mgps.ad.d, com.join.mgps.ad.t, com.join.mgps.ad.n
        public void onADShow() {
            super.onADShow();
            l(Event.Stopad_GromoreSdk_Show.name(), this.f39682f);
        }

        @Override // com.join.mgps.ad.d, com.join.mgps.ad.t, com.join.mgps.ad.n
        public void onInitSuccess() {
            super.onInitSuccess();
            h(false);
        }

        @Override // com.join.mgps.ad.d, com.join.mgps.ad.t, com.join.mgps.ad.n
        public void onVideoCached() {
            super.onVideoCached();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class i extends a.b0 {
        i() {
        }

        @Override // com.join.mgps.socket.fight.arena.a.b0, com.join.mgps.socket.fight.arena.a.y
        public void W(int i4, int i5, Object obj) {
            super.W(i4, i5, obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class j implements x.c {
        j() {
        }

        @Override // com.join.mgps.dialog.x.c
        public void a(com.join.mgps.dialog.x xVar) {
            xVar.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class k implements x.c {
        k() {
        }

        @Override // com.join.mgps.dialog.x.c
        public void a(com.join.mgps.dialog.x xVar) {
            GameMainActivity3.this.R1.i();
            xVar.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class l implements l1.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ DomainInfoBean f32409a;

        l(DomainInfoBean domainInfoBean) {
            this.f32409a = domainInfoBean;
        }

        @Override // com.join.mgps.dialog.l1.a
        public void a() {
            GameMainActivity3.this.Z1.dismiss();
        }

        @Override // com.join.mgps.dialog.l1.a
        public void b() {
            UtilsMy.h4(GameMainActivity3.this, this.f32409a.getInfo(), "simulator_start_win");
            com.papa.sim.statistic.p.l(GameMainActivity3.this).O1(Event.pdSimulatorStartWinClick, new Ext().setGameId(GameMainActivity3.this.N).setIsJoin(this.f32409a.getIs_join()).setTestAbNumber(this.f32409a.getAb_test_number()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class m implements GameRoomActivity.x {
        m() {
        }

        @Override // com.join.mgps.activity.arena.GameRoomActivity.x
        public void onFail(int i4) {
            GameMainActivity3.this.B2();
        }

        @Override // com.join.mgps.activity.arena.GameRoomActivity.x
        public void onSuccess(int i4, int i5) {
            GameMainActivity3.this.B2();
        }

        @Override // com.join.mgps.activity.arena.GameRoomActivity.x
        public void onSuccess(int i4, int i5, ButtonBean buttonBean) {
        }
    }

    /* loaded from: classes4.dex */
    class n extends CountDownTimer {
        n(long j4, long j5) {
            super(j4, j5);
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            GameMainActivity3.this.N1();
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j4) {
        }
    }

    /* loaded from: classes4.dex */
    class o extends b.c {
        o() {
        }

        @Override // com.join.mgps.socket.fight.arena.b.c, com.join.mgps.socket.fight.arena.b.InterfaceC0385b
        public void a() {
            super.a();
        }

        @Override // com.join.mgps.socket.fight.arena.b.c, com.join.mgps.socket.fight.arena.b.InterfaceC0385b
        public void c() {
            super.c();
            if (GameMainActivity3.this.J1 == null || GameMainActivity3.this.J1.d() == null) {
                return;
            }
            GameMainActivity3.this.J1.d().z(GameMainActivity3.this.f32378h2);
        }
    }

    /* loaded from: classes4.dex */
    class p implements SocketListener.NotifyObserver {
        p() {
        }

        @Override // app.mgsim.arena.SocketListener.NotifyObserver
        public void onError(SocketError socketError) {
            if (GameMainActivity3.this.V1()) {
                return;
            }
            int i4 = socketError.errorType;
            if (i4 == 6 || i4 == 2) {
                GameMainActivity3.this.z2();
            } else if (i4 == 5) {
                GameMainActivity3.this.z2();
            } else if (i4 == 3 || i4 == 4) {
                GameMainActivity3.this.z2();
            }
        }

        @Override // app.mgsim.arena.SocketListener.NotifyObserver
        public void onServerResponse(ArenaResponse arenaResponse) {
            if (GameMainActivity3.this.V1()) {
                return;
            }
            if (arenaResponse.responseCode == 0) {
                GameMainActivity3.this.handleFailure(arenaResponse);
            } else if (arenaResponse.responseType.equals(ArenaConstants.ArenaCommand.CMD_LOGIN)) {
                GameMainActivity3.this.y1();
            } else if (arenaResponse.responseType.equals(ArenaConstants.ArenaCommand.CMD_CREATE_GAME_ROOM) || arenaResponse.responseType.equals(ArenaConstants.ArenaCommand.CMD_JOIN_ROOM)) {
                GameMainActivity3.this.N1();
                GameRoom gameRoom = (GameRoom) arenaResponse.data;
                if (GameMainActivity3.this.J1 != null && GameMainActivity3.this.J1.d() != null) {
                    GameMainActivity3.this.J1.d().E(null);
                }
                if (arenaResponse.responseType.equals(ArenaConstants.ArenaCommand.CMD_CREATE_GAME_ROOM)) {
                    GameMainActivity3.this.m1();
                    GameRoomActivity_.V2(GameMainActivity3.this).d(gameRoom.getGameName()).i(gameRoom).c("game_main").start();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class q implements b.InterfaceC0290b {
        q() {
        }

        @Override // com.github.snowdream.android.app.downloader.b.InterfaceC0290b
        public void onError(String str) {
            GameMainActivity3 gameMainActivity3 = GameMainActivity3.this;
            int i4 = gameMainActivity3.W1 + 1;
            gameMainActivity3.W1 = i4;
            if (gameMainActivity3.V1 == i4) {
                gameMainActivity3.T1.dismiss();
            }
            GameMainActivity3.this.R1.l(str);
            CloudListDataBean cloudListDataBean = GameMainActivity3.this.U1.get(str);
            if (cloudListDataBean == null) {
                return;
            }
            com.join.mgps.event.f fVar = new com.join.mgps.event.f();
            cloudListDataBean.setStatus(6);
            fVar.f(cloudListDataBean);
            fVar.j(6);
            org.greenrobot.eventbus.c.f().o(fVar);
        }

        @Override // com.github.snowdream.android.app.downloader.b.InterfaceC0290b
        public void onFinish(String str) {
            GameMainActivity3 gameMainActivity3 = GameMainActivity3.this;
            if (gameMainActivity3.V1 == gameMainActivity3.W1) {
                gameMainActivity3.T1.dismiss();
            }
            GameMainActivity3 gameMainActivity32 = GameMainActivity3.this;
            gameMainActivity32.W1++;
            gameMainActivity32.R1.l(str);
            CloudListDataBean cloudListDataBean = GameMainActivity3.this.U1.get(str);
            if (cloudListDataBean == null) {
                return;
            }
            if (cloudListDataBean.getArchiveFilePath().contains(com.join.mgps.Util.v.f28108h)) {
                GameMainActivity3.this.t1(cloudListDataBean);
                return;
            }
            CloudDownRecoderTable cloudDownRecoderTable = new CloudDownRecoderTable();
            cloudDownRecoderTable.setGameId(GameMainActivity3.this.N);
            cloudDownRecoderTable.setFilePath(cloudListDataBean.getArchiveFilePath());
            cloudDownRecoderTable.setFileName(cloudListDataBean.getArchiveFileName());
            cloudDownRecoderTable.setMd5(cloudListDataBean.getFileMd5());
            b2.i.o().k(cloudDownRecoderTable);
            com.join.mgps.event.f fVar = new com.join.mgps.event.f();
            cloudListDataBean.setStatus(0);
            fVar.f(cloudListDataBean);
            fVar.j(0);
            org.greenrobot.eventbus.c.f().o(fVar);
        }

        @Override // com.github.snowdream.android.app.downloader.b.InterfaceC0290b
        public void onProgress(String str, int i4, String str2) {
            CloudListDataBean cloudListDataBean = GameMainActivity3.this.U1.get(str);
            if (cloudListDataBean == null) {
                return;
            }
            com.join.mgps.event.f fVar = new com.join.mgps.event.f();
            cloudListDataBean.setStatus(3);
            fVar.f(cloudListDataBean);
            fVar.j(3);
            fVar.g(str2);
            fVar.i(i4);
            fVar.h(UtilsMy.d((cloudListDataBean.getFileSize() * i4) / 100) + net.lingala.zip4j.util.e.F0 + UtilsMy.d(cloudListDataBean.getFileSize()) + "K");
            org.greenrobot.eventbus.c.f().o(fVar);
            GameMainActivity3 gameMainActivity3 = GameMainActivity3.this;
            int i5 = gameMainActivity3.V1;
            if (i5 > 1) {
                if (i5 != 0) {
                    gameMainActivity3.T1.c(GameMainActivity3.this.W1 + net.lingala.zip4j.util.e.F0 + GameMainActivity3.this.V1, fVar.b(), fVar.d());
                    return;
                }
                return;
            }
            com.join.mgps.dialog.x xVar = gameMainActivity3.T1;
            if (xVar != null) {
                xVar.c(fVar.c(), fVar.b() + "/S", fVar.d());
            }
        }

        @Override // com.github.snowdream.android.app.downloader.b.InterfaceC0290b
        public void onStart(String str) {
            GameMainActivity3 gameMainActivity3 = GameMainActivity3.this;
            int i4 = gameMainActivity3.V1;
            if (i4 == 1 || i4 == 0) {
                return;
            }
            com.join.mgps.dialog.x xVar = gameMainActivity3.T1;
            xVar.c(GameMainActivity3.this.W1 + net.lingala.zip4j.util.e.F0 + GameMainActivity3.this.V1, "0K", 100 / GameMainActivity3.this.V1);
        }

        @Override // com.github.snowdream.android.app.downloader.b.InterfaceC0290b
        public void onStop(String str) {
            GameMainActivity3 gameMainActivity3 = GameMainActivity3.this;
            int i4 = gameMainActivity3.W1 + 1;
            gameMainActivity3.W1 = i4;
            if (gameMainActivity3.V1 == i4) {
                gameMainActivity3.T1.dismiss();
            }
            GameMainActivity3.this.R1.l(str);
            CloudListDataBean cloudListDataBean = GameMainActivity3.this.U1.get(str);
            if (cloudListDataBean == null) {
                return;
            }
            com.join.mgps.event.f fVar = new com.join.mgps.event.f();
            cloudListDataBean.setStatus(6);
            fVar.f(cloudListDataBean);
            fVar.j(6);
            org.greenrobot.eventbus.c.f().o(fVar);
        }

        @Override // com.github.snowdream.android.app.downloader.b.InterfaceC0290b
        public void onWait(String str) {
        }

        @Override // com.github.snowdream.android.app.downloader.b.InterfaceC0290b
        public void updateSize(String str, long j4) {
        }
    }

    private void A1() {
        UtilsMy.i(null, this.f32386p0, this, 3);
        com.papa.sim.statistic.p.l(this).T0(this.f32386p0.getCrc_link_type_val(), this.E1.getUid());
        com.papa.sim.statistic.p.l(this).A0(this.f32386p0.getCrc_link_type_val(), this.E1.getUid());
    }

    private ArchiveColudArgs C1() {
        if (this.E1 == null) {
            return RequestBeanUtil.getInstance(this.Y).getArchiveNum("", "", this.N);
        }
        RequestBeanUtil requestBeanUtil = RequestBeanUtil.getInstance(this.Y);
        return requestBeanUtil.getArchiveNum(this.E1.getUid() + "", this.E1.getToken(), this.N);
    }

    private void C2(int i4) {
        GameMaingameinfo gameInfo;
        if (this.f32371a2.size() < i4 || (gameInfo = this.C1.getGameInfo()) == null) {
            return;
        }
        CommentDetailActivity_.M1(this.Y).d(this.N).b(this.f32371a2.get(i4 - 1).getId()).f(gameInfo.getGame_plugin_num()).a(Integer.valueOf(gameInfo.getGame_bespeak_switch()).intValue()).e(gameInfo.getGame_is_started()).h(0).g(gameInfo.getGame_package()).c(gameInfo.getGame_comment_score_switch()).start();
    }

    private void E2(int i4) {
        if (this.f32375e2.size() >= i4) {
            int pid = this.f32375e2.get(i4 - 1).getPid();
            ForumBean.ForumPostsBean forumPostsBean = new ForumBean.ForumPostsBean();
            forumPostsBean.setPid(pid);
            com.join.mgps.Util.j0.w0(this.Y, forumPostsBean, new ExtBean("0", pid + "", "-1"));
        }
    }

    private void H2(boolean z4) {
        char c5;
        char c6;
        String fight_fun = this.f32386p0.getFight_fun();
        if (com.join.mgps.Util.g2.i(fight_fun)) {
            this.M1.clear();
            this.L1.b();
            if (fight_fun.length() >= 2) {
                char charAt = fight_fun.charAt(1);
                if (fight_fun.length() >= 7) {
                    c5 = fight_fun.charAt(6);
                    if (fight_fun.charAt(5) == '1') {
                        c6 = '1';
                        if ('1' != charAt || '1' == c5) {
                            this.S.setVisibility(0);
                            this.R.setVisibility(0);
                        } else if ('0' == charAt && '0' == c5 && c6 == '1') {
                            this.S.setVisibility(0);
                            this.R.setVisibility(0);
                        } else {
                            this.S.setVisibility(0);
                            this.R.setVisibility(8);
                        }
                    }
                } else {
                    c5 = '0';
                }
                c6 = '0';
                if ('1' != charAt) {
                }
                this.S.setVisibility(0);
                this.R.setVisibility(0);
            }
            if (fight_fun.length() > 12 && X1(this, this.f32386p0) && fight_fun.charAt(12) == '1') {
                this.M1.add(new DynamicEntranceBean("排位赛", "NEW", 1));
            }
            if (fight_fun.length() > 14 && X1(this, this.f32386p0) && fight_fun.charAt(14) == '1') {
                this.M1.add(new DynamicEntranceBean("排位赛", "NEW", 14));
            }
            if (fight_fun.length() > 4 && fight_fun.charAt(4) == '1') {
                this.M1.add(new DynamicEntranceBean("练习模式", "", 5));
            }
            if (fight_fun.length() >= 4 && fight_fun.charAt(3) == '1') {
                this.M1.add(new DynamicEntranceBean("约战", "", 2));
            }
            if (fight_fun.length() >= 1 && '1' == fight_fun.charAt(0)) {
                this.M1.add(new DynamicEntranceBean("本地对战", "", 3));
            }
        }
        if (this.C1 != null) {
            this.T.setVisibility(8);
            n2(true);
            GameMaingameinfo gameInfo = this.C1.getGameInfo();
            if (gameInfo != null) {
                String game_back_ground_img = gameInfo.getGame_back_ground_img();
                if (!com.join.mgps.Util.g2.h(game_back_ground_img)) {
                    this.V.setImageURI(game_back_ground_img);
                }
                this.f32374d2 = gameInfo.getCommunity_area_id();
                if (z4) {
                    if (!com.join.mgps.Util.g2.h(this.D1)) {
                        I1(this.D1);
                    } else if (this.f32374d2 != 0) {
                        F1();
                    } else {
                        D1();
                    }
                }
            }
            this.X1.clear();
            if (this.P1 != null) {
                GameMainV4DataBean.MemberInfoBean memberInfo = this.C1.getMemberInfo();
                CommonMultiItemBean commonMultiItemBean = new CommonMultiItemBean(0, this.C1.getMemberFun());
                commonMultiItemBean.setExtData(memberInfo);
                this.X1.add(commonMultiItemBean);
            }
            DomainInfoBean pd_info = this.C1.getPd_info();
            if (pd_info != null) {
                this.X1.add(new CommonMultiItemBean(3, pd_info));
                com.papa.sim.statistic.p.l(this).O1(Event.pdSimulatorStartDetails, new Ext().setGameId(this.N).setIsJoin(pd_info.getIs_join()).setTestAbNumber(pd_info.getAb_test_number()));
            }
            GameMainNetBattle netBattle = this.C1.getNetBattle();
            if (netBattle != null) {
                TextView textView = this.R;
                StringBuilder sb = new StringBuilder();
                sb.append(netBattle.getNumber() < 0 ? 0 : netBattle.getNumber());
                sb.append("房");
                textView.setText(sb.toString());
                DownloadTask downloadTask = this.f32386p0;
                if (downloadTask != null && !downloadTask.isFightFun()) {
                    this.R.setVisibility(8);
                } else {
                    this.R.setVisibility(0);
                }
            } else {
                this.R.setVisibility(8);
            }
            GameMainV4DataBean.PlayGameInfoBean playGameInfo = this.C1.getPlayGameInfo();
            if (playGameInfo != null) {
                int file_save_count = playGameInfo.getFile_save_count();
                if (playGameInfo.getFile_save_switch() == 1) {
                    List<DynamicEntranceBean> list = this.M1;
                    list.add(new DynamicEntranceBean("云存档", file_save_count + "", 4));
                }
            }
            List<RecommendAd> recommendAdList = this.C1.getRecommendAdList();
            if (recommendAdList != null && recommendAdList.size() > 0) {
                for (RecommendAd recommendAd : recommendAdList) {
                    this.X1.add(new CommonMultiItemBean(1, recommendAd));
                }
            }
            if (com.join.mgps.Util.q1.v() && this.C1.getJp_info() != null) {
                this.X1.add(new CommonMultiItemBean(2, this.C1.getJp_info()));
            }
            if (this.C1.getPd_info_popup() != null) {
                s2(this.C1.getPd_info_popup());
            }
            this.P1.setNewData(this.X1);
            return;
        }
        this.T.setVisibility(0);
        n2(false);
    }

    private void T1() {
        if (this.f31379m) {
            return;
        }
        this.R1 = com.github.snowdream.android.app.downloader.b.e();
        q qVar = new q();
        this.S1 = qVar;
        this.R1.m(qVar);
        this.R1.i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean V1() {
        if (isFinishing()) {
            return true;
        }
        return Build.VERSION.SDK_INT >= 17 && isDestroyed();
    }

    private boolean W1() {
        return getWindow().getDecorView().getVisibility() == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Z1() {
        PlayCfgBean playCfgBean = this.f32391s2;
        if (playCfgBean != null) {
            if (playCfgBean.getSdk_type() == 1) {
                e2(this, this.f32391s2);
            } else if (this.f32391s2.getSdk_type() == 2) {
                b2(this, this.f32391s2);
            }
        }
    }

    private boolean g2() {
        com.wufan.user.service.protobuf.n0 accountData = AccountUtil_.getInstance_(this.Y).getAccountData();
        return accountData == null || !com.join.mgps.Util.b.piv(accountData);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m1() {
        CountDownTimer countDownTimer = this.f32376f2;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
    }

    private boolean p2() {
        PdAdCfgBean convertStr2Bean = PdAdCfgBean.convertStr2Bean(this.f32372b2.pd_ad_config().d());
        if (convertStr2Bean != null && convertStr2Bean.canShowSimulatorPopup()) {
            if (convertStr2Bean != null) {
                convertStr2Bean.updateSimulatorPopupShowTimes();
            }
            return true;
        }
        return false;
    }

    private void q1() {
        List<TTNativeExpressAd> list = this.v2;
        if (list != null) {
            list.clear();
        }
        List<NativeExpressADView> list2 = this.f32395w2;
        if (list2 != null) {
            list2.clear();
        }
    }

    public static long r1(String str, String str2) {
        try {
            return new SimpleDateFormat(str2).parse(str).getTime();
        } catch (Exception e5) {
            e5.printStackTrace();
            return 0L;
        }
    }

    private void v1() {
        com.papa.sim.statistic.p.l(this).X0(Event.startArchiveManagement, AccountUtil_.getInstance_(this).getUid(), this.N, "1");
        DocumentManageActivity_.S0(this.Y).a(1).b(this.N).start();
    }

    private void w1() {
        ApFightActivity_.n0(this.Y).a(this.N).start();
        com.papa.sim.statistic.p.l(this).y0(this.f32386p0.getCrc_link_type_val(), this.E1.getUid());
    }

    private void x1(int i4) {
        MobclickAgent.onEvent(this.Y, "onEnterQualifying");
        if (com.join.android.app.common.utils.j.j(this)) {
            if (UtilsMy.W(this.Y, this.f32386p0) == null) {
                Toast.makeText(this, "正在下载插件...", 1).show();
                N1();
                return;
            } else if (this.C1 == null) {
                return;
            } else {
                GamePaiWeiActivty_.o0(this.Y).a(this.N).b(this.C1.getGameInfo().getMax_battle_count()).c(i4).start();
                return;
            }
        }
        showToast("无网络连接");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z2() {
        try {
            Toast.makeText(this, "网络不稳定，请重试", 0).show();
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void A2() {
        if (this.f32386p0 == null) {
            this.f32386p0 = p1.f.K().F(this.N);
        }
        DownloadTask downloadTask = this.f32386p0;
        if (downloadTask != null) {
            EMUApkTable Z1 = UtilsMy.Z1(downloadTask.getRomType());
            if (Z1 != null) {
                if (Z1.getDown_type() == 2) {
                    B2();
                    return;
                } else if (new PrefDef_(this.Y).launch_game_switch().d().booleanValue()) {
                    UtilsMy.z0(this.Y, 1, this.N, "RAW_SIMULATOR", new m());
                    return;
                } else {
                    B2();
                    return;
                }
            }
            showToast("游戏启动失败，请重试");
            return;
        }
        showToast("游戏启动失败，请重试");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void B1() {
        if (com.join.android.app.common.utils.j.j(this)) {
            try {
                RequestModel requestModel = new RequestModel();
                requestModel.setDefault(this);
                RequestSimulatorAchievementListArgs requestSimulatorAchievementListArgs = new RequestSimulatorAchievementListArgs();
                requestSimulatorAchievementListArgs.setGameId(this.N);
                requestSimulatorAchievementListArgs.setUid(AccountUtil_.getInstance_(this).getUid());
                requestSimulatorAchievementListArgs.setToken(AccountUtil_.getInstance_(this).getToken());
                requestModel.setArgs(requestSimulatorAchievementListArgs);
                ResponseModel<SimulatorAllAchievementBean> c02 = this.F1.c0(requestModel.makeSign());
                if (c02 == null || c02.getData() == null) {
                    return;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("getAllAchievementsData: ");
                sb.append(JsonMapper.getInstance().toJson(c02.getData().getAchievement_list()));
                PrefUtil.getInstance(this.Y).save("all_achievements", JsonMapper.getInstance().toJson(c02.getData().getAchievement_list()));
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0145  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void B2() {
        /*
            Method dump skipped, instructions count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.mgps.activity.GameMainActivity3.B2():void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void D1() {
        if (com.join.android.app.common.utils.j.j(this.Y)) {
            CommentResponse<CommentAllListBean> b5 = this.N1.b(G1());
            if (b5 != null) {
                this.f32371a2 = b5.getData_info().getGeneral_comment();
                l2();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void D2() {
        GameMainV4DataBean gameMainV4DataBean = this.C1;
        if (gameMainV4DataBean == null || gameMainV4DataBean.getGameInfo() == null) {
            return;
        }
        GameMaingameinfo gameInfo = this.C1.getGameInfo();
        if (!TextUtils.isEmpty(gameInfo.getGame_comment_score_switch()) && !gameInfo.getGame_comment_score_switch().equals("0")) {
            CommentAllListActivity_.H0(this.Y).f(this.N).i(gameInfo.getGame_package()).h(gameInfo.getGame_plugin_num()).a(gameInfo.getGame_bespeak_switch() == null ? 0 : Integer.parseInt(gameInfo.getGame_bespeak_switch())).g(gameInfo.getGame_is_started()).j(0).d(gameInfo.getGame_comment_score_switch()).start();
        } else {
            ForumIndexActivity_.i0(this).start();
        }
    }

    @Override // com.join.mgps.activity.FriendActivity
    protected boolean E0() {
        DownloadTask F = p1.f.K().F(this.N);
        return F == null || !String.valueOf(ConstantIntEnum.GBA.value()).equals(F.getPlugin_num());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void E1() {
        GameMainTable o4 = b2.u.n().o(this.N);
        if (o4 != null) {
            GameMainV4DataBean gameMainV4DataBean = (GameMainV4DataBean) JsonMapper.getInstance().fromJson(o4.getGame_main_data(), GameMainV4DataBean.class);
            if (gameMainV4DataBean != null && gameMainV4DataBean.getGameInfo() != null) {
                this.D1 = gameMainV4DataBean.getGameInfo().getCommunity_multi_posts_id();
            }
            if (gameMainV4DataBean != null) {
                J2(gameMainV4DataBean, false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void F1() {
        if (com.join.android.app.common.utils.j.j(this)) {
            try {
                ResultResMainBean<GameMainCommunityBean> n4 = this.f32373c2.n(this.f32374d2);
                if (n4 == null || n4.getError() != 0 || n4.getData() == null) {
                    return;
                }
                List<GameMainCommunityBean.PostsBean> posts = n4.getData().getPosts();
                this.f32375e2.clear();
                if (posts != null && posts.size() > 0) {
                    String subject = posts.get(0).getSubject();
                    if (com.join.mgps.Util.g2.h(subject)) {
                        subject = posts.get(0).getMessage();
                    }
                    this.f32375e2.add(new GameMainCommunityBean.PostsBean(subject, posts.get(0).getPid()));
                    if (posts.size() > 1) {
                        String subject2 = posts.get(1).getSubject();
                        if (com.join.mgps.Util.g2.h(subject2)) {
                            subject2 = posts.get(1).getMessage();
                        }
                        this.f32375e2.add(new GameMainCommunityBean.PostsBean(subject2, posts.get(1).getPid()));
                    }
                }
                m2();
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    void F2() {
        IntentUtil.getInstance().goFormDetial(this.Y, "8873670");
    }

    public RequestCommentAllListArgs G1() {
        this.E1 = AccountUtil_.getInstance_(this.Y).getAccountData();
        String d5 = this.f32372b2.commentToken().d();
        com.wufan.user.service.protobuf.n0 n0Var = this.E1;
        return RequestBeanUtil.getInstance(this.Y).getRequestCommentAllList(1, 10, this.N, n0Var != null ? n0Var.getUid() : 0, d5);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void G2(int i4) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void H1() {
        if (com.join.android.app.common.utils.j.j(this.Y)) {
            try {
                ForumResponse<ForumData.HomepageRecommendLabel> O = this.f32373c2.O(0, 1, AccountUtil_.getInstance_(this.Y).getUid(), AccountUtil_.getInstance_(this.Y).getToken());
                if (O == null || O.getError() != 0 || O.getData() == null) {
                    return;
                }
                List<ForumBean.ForumPostsBean> post_list = O.getData().getPost_list();
                this.f32375e2.clear();
                if (post_list != null && post_list.size() > 0) {
                    this.f32375e2.add(new GameMainCommunityBean.PostsBean(post_list.get(0).getSubject(), post_list.get(0).getPid()));
                    if (post_list.size() > 0) {
                        this.f32375e2.add(new GameMainCommunityBean.PostsBean(post_list.get(1).getSubject(), post_list.get(1).getPid()));
                    }
                }
                m2();
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void I1(String str) {
        if (com.join.android.app.common.utils.j.j(this)) {
            try {
                ForumResponse<MulPostData> L = this.f32373c2.L(str);
                if (L == null || L.getError() != 0 || L.getData() == null) {
                    return;
                }
                List<ForumBean.ForumPostsBean> posts_list = L.getData().getPosts_list();
                this.f32375e2.clear();
                if (posts_list != null && posts_list.size() > 0) {
                    this.f32375e2.add(new GameMainCommunityBean.PostsBean(posts_list.get(0).getSubject(), posts_list.get(0).getPid()));
                    if (posts_list.size() > 1) {
                        this.f32375e2.add(new GameMainCommunityBean.PostsBean(posts_list.get(1).getSubject(), posts_list.get(1).getPid()));
                    }
                }
                m2();
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void I2(CloudListDataBean cloudListDataBean) {
        com.join.mgps.event.f fVar = new com.join.mgps.event.f();
        cloudListDataBean.setStatus(0);
        fVar.f(cloudListDataBean);
        fVar.j(0);
        org.greenrobot.eventbus.c.f().o(fVar);
    }

    @Override // com.join.mgps.adapter.j1.a
    public void J(DynamicEntranceBean dynamicEntranceBean) {
        int typeId = dynamicEntranceBean.getTypeId();
        if (typeId != 14) {
            switch (typeId) {
                case 1:
                    x1(1);
                    return;
                case 2:
                    y1();
                    return;
                case 3:
                    w1();
                    return;
                case 4:
                    v1();
                    return;
                case 5:
                    A1();
                    return;
                case 6:
                    s1();
                    return;
                case 7:
                    F2();
                    return;
                default:
                    return;
            }
        }
        x1(14);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void J1() {
        try {
            ArchiveNumDataBean f5 = this.O1.f(C1().getArgs());
            this.f32383m2 = f5;
            if (f5 == null || f5.getCode() != 600) {
                return;
            }
            this.f32372b2.getArchiveCoinPref().g(Integer.valueOf(this.f32383m2.getData_info().getArchiveCoin()));
            this.f32372b2.cloudVipLink().g(this.f32383m2.getData_info().getVipLink());
            DownloadTask F = p1.f.K().F(this.N);
            if (F != null) {
                this.f32380j2 = com.join.mgps.Util.g0.m(F.getPlugin_num(), F.getGameZipPath());
                if (F.getPlugin_num().equals("31")) {
                    boolean z4 = false;
                    boolean z5 = false;
                    for (RomArchived romArchived : this.f32380j2) {
                        if (romArchived.getFileName().contains("_v2")) {
                            z4 = true;
                        } else {
                            z5 = true;
                        }
                    }
                    Iterator<RomArchived> it2 = this.f32380j2.iterator();
                    while (it2.hasNext()) {
                        RomArchived next = it2.next();
                        if (z5 && !z4) {
                            this.f32381k2 = false;
                            if (!com.join.mgps.Util.l1.a(F.getPackageName())) {
                                it2.remove();
                            }
                        } else if (z5 && z4) {
                            if (com.join.mgps.Util.l1.a(F.getPackageName())) {
                                this.f32382l2 = false;
                                if (next.getFileName().contains("_v2")) {
                                    it2.remove();
                                }
                            } else if (!next.getFileName().contains("_v2")) {
                                it2.remove();
                            }
                        }
                    }
                }
                if (F.getPlugin_num().equals("33")) {
                    RomArchived romArchived2 = null;
                    long j4 = 0;
                    for (RomArchived romArchived3 : this.f32380j2) {
                        long r12 = r1(romArchived3.getArchivedTime(), "MM月dd日 HH:mm");
                        if (j4 == 0) {
                            romArchived2 = romArchived3;
                            j4 = r12;
                        }
                        if (j4 > r12) {
                            romArchived2 = romArchived3;
                            j4 = r12;
                        }
                    }
                    if (romArchived2 != null && romArchived2.getFileName().contains("vba")) {
                        o2(true);
                    }
                }
                List<RomArchived> list = this.f32380j2;
                if (list != null) {
                    G2(list.size());
                    return;
                } else {
                    G2(0);
                    return;
                }
            }
            G2(0);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void J2(GameMainV4DataBean gameMainV4DataBean, boolean z4) {
        this.C1 = gameMainV4DataBean;
        GameMaingameinfo gameInfo = gameMainV4DataBean.getGameInfo();
        if (gameInfo != null) {
            this.Q.setText(gameInfo.getGame_name());
        }
        H2(z4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void K1() {
        try {
            GameWorldResponse<List<PspBattleServer>> v2 = this.B1.v();
            if (v2.getError() == 701) {
                p1();
            } else if (v2.getError() == 0) {
                this.f32394v1 = v2.getData();
                x2();
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public int L1(Context context) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
        return (int) (displayMetrics.heightPixels / displayMetrics.density);
    }

    void M1(String str, int i4, int i5, String str2, String str3) {
        IntentDateBean intentDateBean = new IntentDateBean();
        intentDateBean.setTpl_type(str);
        intentDateBean.setLink_type(i4);
        intentDateBean.setJump_type(i5);
        intentDateBean.setCrc_link_type_val(str2);
        intentDateBean.setLink_type_val(str3);
        IntentUtil.getInstance().intentActivity(this.Y, intentDateBean);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void N1() {
        this.P.setVisibility(8);
    }

    public void O1(Context context, String str, String str2) {
        if (this.f32396x2 == null && com.join.mgps.Util.g2.i(str)) {
            f fVar = new f(context, str, str2);
            this.f32396x2 = fVar;
            fVar.e(new g());
            this.f32396x2.a();
            return;
        }
        com.join.mgps.ad.e eVar = this.f32396x2;
        double d5 = this.f32392t2;
        Double.isNaN(d5);
        eVar.b(3, (int) (d5 * 0.8d), -2);
    }

    public void P1(Context context, String str, String str2) {
        if (this.f32390r2 == null && com.join.mgps.Util.g2.i(str)) {
            c cVar = new c(context, str, str2);
            this.f32390r2 = cVar;
            cVar.e();
            return;
        }
        this.f32390r2.h(false);
    }

    public void Q1(Context context, String str, String str2) {
        if (this.y2 == null && com.join.mgps.Util.g2.i(str)) {
            h hVar = new h(context, str, str2);
            this.y2 = hVar;
            hVar.e();
            return;
        }
        this.y2.h(false);
    }

    public void R1(Context context, String str, String str2) {
        if (this.f32393u2 == null && com.join.mgps.Util.g2.i(str)) {
            d dVar = new d(context, str, str2);
            this.f32393u2 = dVar;
            dVar.e(new e());
            this.f32393u2.a();
            return;
        }
        com.join.mgps.ad.v vVar = this.f32393u2;
        double d5 = this.f32392t2;
        Double.isNaN(d5);
        vVar.b(3, (int) (d5 * 0.875d), 0);
    }

    public void S1(Context context, String str, String str2) {
        if (this.f32389q2 == null && com.join.mgps.Util.g2.i(str)) {
            b bVar = new b(context, str, str2);
            this.f32389q2 = bVar;
            bVar.e();
            return;
        }
        this.f32389q2.h(false);
    }

    void U1() {
        ((LoginSplashActivity_.IntentBuilder_) LoginSplashActivity_.intent(this.Y).flags(268435456)).start();
    }

    boolean X1(Context context, DownloadTask downloadTask) {
        int i4;
        if (downloadTask == null) {
            return false;
        }
        try {
            i4 = Integer.parseInt(downloadTask.getPlugin_num());
        } catch (Exception unused) {
            i4 = 0;
        }
        try {
            if (i4 == ConstantIntEnum.FBA.value() || i4 == ConstantIntEnum.FC.value()) {
                EMUApkTable n4 = b2.o.o().n(downloadTask.getRomType());
                if (new APKUtils().d(context, n4.getPackage_name())) {
                    try {
                        try {
                            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(n4.getPackage_name(), 0);
                            if (packageInfo == null) {
                                return false;
                            }
                            try {
                                return packageInfo.versionCode > 330;
                            } catch (Exception unused2) {
                                return true;
                            }
                        } catch (Exception e5) {
                            e5.getLocalizedMessage();
                            return false;
                        }
                    } catch (Exception e6) {
                        e6.printStackTrace();
                        return false;
                    }
                } else if (n4.getDown_type() == 2 && n4.getDown_type() == 2) {
                    return com.join.android.app.common.utils.l.t(context, n4, false, new String[0]);
                } else {
                    return false;
                }
            }
            return true;
        } catch (Exception e7) {
            e7.printStackTrace();
            return true;
        }
    }

    public void Y1() {
        if (g2()) {
            this.f32391s2 = null;
            String d5 = this.f32372b2.simulator_exit_information_cfg().d();
            SimulatorAdCfgBean simulatorAdCfgBean = com.join.mgps.Util.g2.i(d5) ? (SimulatorAdCfgBean) JsonMapper.getInstance().fromJson(d5, SimulatorAdCfgBean.class) : null;
            if (simulatorAdCfgBean == null || simulatorAdCfgBean.getSwitch_state() != 1) {
                return;
            }
            List<PlayCfgBean> play_cfg = simulatorAdCfgBean.getPlay_cfg();
            int i4 = 0;
            if (play_cfg != null && play_cfg.size() > 0) {
                ArrayList arrayList = new ArrayList();
                for (PlayCfgBean playCfgBean : play_cfg) {
                    arrayList.add(Double.valueOf(playCfgBean.getProbability()));
                }
                i4 = com.join.mgps.ad.p.b(arrayList);
            }
            this.f32391s2 = play_cfg.get(i4);
            Z1();
        }
    }

    public void a2() {
        if (g2()) {
            this.f32384n2 = null;
            String d5 = this.f32372b2.simulator_exit_open_cfg().d();
            SimulatorAdCfgBean simulatorAdCfgBean = com.join.mgps.Util.g2.i(d5) ? (SimulatorAdCfgBean) JsonMapper.getInstance().fromJson(d5, SimulatorAdCfgBean.class) : null;
            if (simulatorAdCfgBean == null || simulatorAdCfgBean.getSwitch_state() != 1) {
                return;
            }
            List<PlayCfgBean> play_cfg = simulatorAdCfgBean.getPlay_cfg();
            int i4 = 0;
            if (play_cfg != null && play_cfg.size() > 0) {
                ArrayList arrayList = new ArrayList();
                for (PlayCfgBean playCfgBean : play_cfg) {
                    arrayList.add(Double.valueOf(playCfgBean.getProbability()));
                }
                i4 = com.join.mgps.ad.p.b(arrayList);
            }
            PlayCfgBean playCfgBean2 = play_cfg.get(i4);
            this.f32384n2 = playCfgBean2;
            if (playCfgBean2 != null) {
                if (playCfgBean2.getSdk_type() == 1) {
                    f2(this, this.f32384n2);
                } else if (this.f32384n2.getSdk_type() == 2) {
                    c2(this, this.f32384n2);
                } else if (this.f32384n2.getSdk_type() == 7) {
                    d2(this, this.f32384n2);
                    System.out.println("AD_LOG_TAG 加载融合广告 退出广告");
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterViews() {
        this.Y = this;
        setSystemUiHide(true);
        this.F1 = com.join.mgps.rpc.impl.i.D0();
        this.B1 = com.join.mgps.rpc.impl.l.n0();
        this.f32373c2 = com.join.mgps.rpc.impl.g.A0();
        this.N1 = com.join.mgps.rpc.impl.e.m();
        this.O1 = com.join.mgps.rpc.impl.c.k();
        this.f32386p0 = p1.f.K().F(this.N);
        this.E1 = AccountUtil_.getInstance_(this.Y).getAccountData();
        DownloadTask downloadTask = this.f32386p0;
        if (downloadTask != null) {
            this.Q.setText(downloadTask.getShowName());
        }
        this.T = new View(this);
        com.join.mgps.adapter.j1 j1Var = new com.join.mgps.adapter.j1(this, this.M1, this);
        this.L1 = j1Var;
        this.U.setAdapter((ListAdapter) j1Var);
        this.U.setOverScrollMode(2);
        int dimension = (int) getResources().getDimension(R.dimen.wdp27);
        getResources().getDimension(R.dimen.wdp343);
        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams((((int) getResources().getDimension(R.dimen.wdp916)) * (getResources().getDisplayMetrics().heightPixels - (dimension * 2))) / ((int) getResources().getDimension(R.dimen.wdp667)), -1);
        ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = dimension;
        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = dimension;
        ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = dimension;
        this.V.setLayoutParams(layoutParams);
        E1();
        getData();
        B1();
        this.K1 = new com.join.mgps.socket.fight.arena.a(this, new i());
        if (notchtools.geek.com.notchtools.b.o().c(getWindow())) {
            ((ConstraintLayout.LayoutParams) this.W.getLayoutParams()).setMarginStart(notchtools.geek.com.notchtools.b.o().e(getWindow()) + getResources().getDimensionPixelOffset(R.dimen.wdp10));
        }
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(1);
        this.X.setLayoutManager(linearLayoutManager);
        GameRecommendAdapter1 gameRecommendAdapter1 = new GameRecommendAdapter1(this);
        this.P1 = gameRecommendAdapter1;
        gameRecommendAdapter1.setGameId(this.N);
        this.X.setAdapter(this.P1);
        com.papa.sim.statistic.p.l(this).Z0(Event.indexGameStart, AccountUtil_.getInstance_(this).getUid(), this.N, this.O, 0);
        if (this.Q1 == null) {
            this.Q1 = new EmuOutResultReceiver();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction(o1.a.V);
            intentFilter.addAction(BAction.ACTION_EMU_GAME_OUT_AD);
            registerReceiver(this.Q1, intentFilter);
        }
        if (!this.f31379m) {
            T1();
            this.T1 = new com.join.mgps.dialog.x(this, R.style.HKDialogLoading).f("存档下载中").e("取消下载").b("后台运行").d(new k()).a(new j());
        }
        if (!E0()) {
            J1();
        }
        o1();
    }

    public void b2(Context context, PlayCfgBean playCfgBean) {
        O1(context, playCfgBean.getSdk_key(), playCfgBean.getAd_id());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void back() {
        finish();
    }

    public void c2(Context context, PlayCfgBean playCfgBean) {
        P1(context, playCfgBean.getSdk_key(), playCfgBean.getAd_id());
    }

    public void d2(Context context, PlayCfgBean playCfgBean) {
        Q1(context, playCfgBean.getSdk_key(), playCfgBean.getAd_id());
    }

    public void e2(Context context, PlayCfgBean playCfgBean) {
        R1(context, playCfgBean.getSdk_key(), playCfgBean.getAd_id());
    }

    public void f2(Context context, PlayCfgBean playCfgBean) {
        S1(context, playCfgBean.getSdk_key(), playCfgBean.getAd_id());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void getData() {
        try {
            RequestModel<RequestGameIdArgs> requestModel = new RequestModel<>();
            requestModel.setDefault(this);
            String str = this.N;
            com.wufan.user.service.protobuf.n0 n0Var = this.E1;
            RequestGameIdArgs requestGameIdArgs = new RequestGameIdArgs(str, 1, 1, n0Var != null ? n0Var.getUid() : 1);
            requestGameIdArgs.setGameId(this.N);
            requestGameIdArgs.setToken(AccountUtil_.getInstance_(this).getToken());
            requestModel.setArgs(requestGameIdArgs);
            ResponseModel<GameMainV4DataBean> r02 = this.F1.r0(requestModel);
            this.Y1 = true;
            if (r02 == null || r02.getFlag() != 1) {
                return;
            }
            GameMainV4DataBean data = r02.getData();
            v2(data);
            if (data != null && data.getGameInfo() != null) {
                this.D1 = data.getGameInfo().getCommunity_multi_posts_id();
            }
            GameMainTable o4 = b2.u.n().o(this.N);
            if (o4 != null) {
                GameMainachieve achieve = data.getAchieve();
                GameMainDataBean gameMainDataBean = (GameMainDataBean) JsonMapper.getInstance().fromJson(o4.getGame_main_data(), GameMainDataBean.class);
                if (gameMainDataBean != null) {
                    GameMainachieve achieve2 = gameMainDataBean.getAchieve();
                    if (achieve != null && achieve2 != null) {
                        achieve.setLastShowVerTime(achieve2.getLastShowVerTime());
                    }
                }
                String json = JsonMapper.getInstance().toJson(data);
                o4.setGameid(this.N);
                o4.setGame_main_data(json);
                b2.u.n().update(o4);
            } else {
                GameMainTable gameMainTable = new GameMainTable();
                String json2 = JsonMapper.getInstance().toJson(data);
                gameMainTable.setGameid(this.N);
                gameMainTable.setGame_main_data(json2);
                b2.u.n().k(gameMainTable);
            }
            J2(data, true);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    void h2() {
        D2();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void handleFailure(ArenaResponse arenaResponse) {
        N1();
        int i4 = arenaResponse.errorType;
        if (i4 == 16) {
            this.K1.D(com.join.mgps.socket.fight.arena.a.f54752j, 257, Integer.valueOf(arenaResponse.errorType), "无法加入，你被禁止加入该房间", "确定");
        } else if (i4 == 17) {
            this.K1.D(com.join.mgps.socket.fight.arena.a.f54752j, 257, Integer.valueOf(arenaResponse.errorType), "该房间为比赛专用房间,非参赛选手无法加入", "我知道了");
        } else if (i4 == 9) {
            this.K1.D(com.join.mgps.socket.fight.arena.a.f54752j, 257, Integer.valueOf(arenaResponse.errorType), "房间人数已满你无法加入房间!", "确定");
        } else if (i4 == 7) {
            this.K1.D(com.join.mgps.socket.fight.arena.a.f54752j, 256, Integer.valueOf(arenaResponse.errorType), "密码输入错误，请重试!", "取消", "确定", arenaResponse);
        } else if (i4 == 8) {
            this.K1.D(com.join.mgps.socket.fight.arena.a.f54752j, 257, Integer.valueOf(arenaResponse.errorType), "房间已经被解散!", "确定");
        } else if (i4 == 11) {
            this.K1.D(com.join.mgps.socket.fight.arena.a.f54752j, 257, Integer.valueOf(arenaResponse.errorType), "铜板不足，无法创建房间!", "确定");
        } else if (i4 == 13) {
            this.K1.D(com.join.mgps.socket.fight.arena.a.f54752j, 257, Integer.valueOf(arenaResponse.errorType), "铜板不足，无法加入房间", "确定");
        } else if (i4 == 1001) {
            this.K1.D(com.join.mgps.socket.fight.arena.a.f54752j, Integer.valueOf((int) com.join.mgps.socket.fight.arena.a.f54751i), Integer.valueOf(arenaResponse.errorType), arenaResponse.errorInfo, "确定");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Receiver(actions = {o1.a.f72005i0})
    public void i2(Intent intent) {
        if (!this.f31379m && W1()) {
            this.V1 = 1;
            this.W1 = 1;
            CloudListDataBean cloudListDataBean = (CloudListDataBean) intent.getSerializableExtra("downCloud");
            this.U1.put(cloudListDataBean.getArchiveFile(), cloudListDataBean);
            cloudListDataBean.setStatus(3);
            this.R1.b(new com.github.snowdream.android.app.downloader.c(cloudListDataBean.getArchiveFile(), cloudListDataBean.getArchiveFileName(), new File(cloudListDataBean.getArchiveFilePath()).getParent() + File.separator, cloudListDataBean.getFileSize()));
            org.greenrobot.eventbus.c.f().o(cloudListDataBean);
            this.T1.show();
            this.T1.c("1/" + UtilsMy.d(cloudListDataBean.getFileSize()) + "K", "0", 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void j1() {
        char c5;
        char c6;
        com.papa.sim.statistic.p.l(this).R(AccountUtil_.getInstance_(this).getUid());
        com.papa.sim.statistic.p.l(this).y(AccountUtil_.getInstance_(this).getUid(), this.N, "game_main");
        try {
            com.papa.sim.statistic.p.l(this).L0(this.N, Integer.parseInt(AccountUtil_.getInstance_(this).getUid()));
        } catch (Exception unused) {
        }
        GameInfoBean gameInfoBean = new GameInfoBean();
        gameInfoBean.setGame_id(this.N);
        GameMainV4DataBean gameMainV4DataBean = this.C1;
        if (gameMainV4DataBean != null && gameMainV4DataBean.getGameInfo() != null) {
            gameInfoBean.setGame_name(this.C1.getGameInfo().getGame_name());
        }
        DownloadTask downloadTask = this.f32386p0;
        if (downloadTask != null && com.join.mgps.Util.g2.i(downloadTask.getFight_fun())) {
            String fight_fun = this.f32386p0.getFight_fun();
            char charAt = fight_fun.charAt(1);
            if (fight_fun.length() >= 7) {
                c6 = fight_fun.charAt(6);
                c5 = fight_fun.charAt(5) == '1' ? '1' : '0';
            } else {
                c5 = '0';
                c6 = '0';
            }
            if ('0' == charAt && '0' == c6 && c5 == '1') {
                K1();
                return;
            }
        }
        DownloadTask downloadTask2 = this.f32386p0;
        if (downloadTask2 != null && downloadTask2.isFightFun()) {
            n1();
            GameRoomListActivity_.W3(this.Y).b(true).c(gameInfoBean).start();
            return;
        }
        NewArenaMainActivty_.g1(this).start();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Receiver(actions = {"com.cloud.downCloud.all"})
    public void j2(Intent intent) {
        if (!this.f31379m && W1()) {
            List<CloudListDataBean> list = (List) intent.getSerializableExtra("downClouds");
            this.V1 = list.size();
            com.join.mgps.dialog.x xVar = this.T1;
            if (xVar != null) {
                xVar.show();
                this.T1.c("1/" + list.size(), "0K", 1);
            }
            this.W1 = 1;
            if (this.V1 != 0) {
                this.T1.c("1/" + list.size(), "0K", 100 / this.V1);
            }
            for (CloudListDataBean cloudListDataBean : list) {
                this.U1.put(cloudListDataBean.getArchiveFile(), cloudListDataBean);
                String archiveFileName = cloudListDataBean.getArchiveFileName();
                StringBuilder sb = new StringBuilder();
                sb.append(com.join.mgps.Util.v.f28108h);
                String str = File.separator;
                sb.append(str);
                sb.append(cloudListDataBean.getArchiveFileName());
                cloudListDataBean.setArchiveFilePath(sb.toString());
                cloudListDataBean.setStatus(3);
                this.R1.b(new com.github.snowdream.android.app.downloader.c(cloudListDataBean.getArchiveFile(), archiveFileName, new File(cloudListDataBean.getArchiveFilePath()).getParent() + str, cloudListDataBean.getFileSize()));
                org.greenrobot.eventbus.c.f().o(cloudListDataBean);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void k1() {
        String str;
        GameMainV4DataBean gameMainV4DataBean = this.C1;
        if (gameMainV4DataBean == null || gameMainV4DataBean.getMemberInfo() == null) {
            return;
        }
        GameMainV4DataBean.MemberInfoBean memberInfo = this.C1.getMemberInfo();
        if (Integer.parseInt(memberInfo.getLink_type()) == 4 && memberInfo.getLink_type_val() != null && memberInfo.getLink_type_val().startsWith(com.facebook.common.util.f.f10923a)) {
            String link_type_val = memberInfo.getLink_type_val();
            if (link_type_val.contains("?")) {
                str = link_type_val + "&game_id=" + this.N;
            } else {
                str = link_type_val + "?game_id=" + this.N;
            }
            memberInfo.setLink_type_val(str);
        }
        IntentDateBean intentDateBean = new IntentDateBean();
        intentDateBean.setLink_type(Integer.valueOf(memberInfo.getLink_type()).intValue());
        intentDateBean.setJump_type(Integer.valueOf(memberInfo.getJump_type()).intValue());
        intentDateBean.setLink_type_val(memberInfo.getLink_type_val());
        IntentUtil.getInstance().intentActivity(this.Y, intentDateBean);
    }

    public void k2(String str, String str2) {
        Intent intent = new Intent("com.join.android.app.mgsim.wufun.broadcast.emu.commonpoint");
        intent.putExtra(CommonService_.b0.f54290b, str);
        intent.putExtra("gameId", str2);
        sendBroadcast(intent);
    }

    void l1() {
        GameMainV4DataBean gameMainV4DataBean = this.C1;
        if (gameMainV4DataBean == null || gameMainV4DataBean.getGameMasteryLevel() == null) {
            return;
        }
        try {
            GameMasteryLevel gameMasteryLevel = this.C1.getGameMasteryLevel();
            int i4 = 0;
            int[] iArr = new int[0];
            int current_lv_times = gameMasteryLevel.getCurrent_lv_times();
            int next_lv_times = gameMasteryLevel.getNext_lv_times();
            if (!TextUtils.isEmpty(gameMasteryLevel.getLevel()) && !gameMasteryLevel.getLevel().equals("传说") && !gameMasteryLevel.getLevel().equals("宗师") && !gameMasteryLevel.getLevel().equals("精英")) {
                gameMasteryLevel.getLevel().equals("资深");
            }
            try {
                ArrayList arrayList = (ArrayList) JsonMapper.getInstance().fromJson(this.f32372b2.gameTimeLvCfg().d(), JsonMapper.getInstance().createCollectionType(ArrayList.class, GameTimeLevel.class));
                if (arrayList != null) {
                    iArr = new int[arrayList.size()];
                    for (int i5 = 0; i5 < arrayList.size(); i5++) {
                        iArr[i5] = ((GameTimeLevel) arrayList.get(i5)).getVal();
                    }
                }
            } catch (Exception e5) {
                e5.printStackTrace();
            }
            int i6 = current_lv_times + 0;
            int i7 = 0;
            while (i4 < iArr.length) {
                int i8 = i4 + 1;
                int i9 = iArr[i4] - i7;
                if (i6 > i9 && i4 != iArr.length - 1) {
                    i6 -= i9;
                    next_lv_times = i9;
                    i7 = iArr[i4];
                    i4 = i8;
                }
                next_lv_times = i9;
            }
            Math.min(i6, next_lv_times);
        } catch (Exception e6) {
            e6.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void l2() {
        if (this.f32371a2 == null) {
            this.T.setVisibility(0);
            n2(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void m2() {
        if (this.f32375e2 != null) {
            this.T.setVisibility(8);
            n2(true);
            return;
        }
        this.T.setVisibility(0);
        n2(false);
    }

    void n1() {
        if (this.J1.d() != null) {
            this.J1.d().A(this.f32378h2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void n2(boolean z4) {
        Iterator<DynamicEntranceBean> it2 = this.M1.iterator();
        while (it2.hasNext()) {
            DynamicEntranceBean next = it2.next();
            if (next.getTypeId() == 6 || next.getTypeId() == 7) {
                it2.remove();
            }
        }
        if (z4) {
            this.M1.add(new DynamicEntranceBean("社区", "", 6));
        }
        if (String.valueOf(ConstantIntEnum.PS2.value()).equals(this.f32386p0.getPlugin_num())) {
            this.M1.add(new DynamicEntranceBean("手柄设置", "", 7));
        }
        this.L1.notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void o1() {
        File[] listFiles;
        DownloadTask F = p1.f.K().F(this.N);
        if (F == null) {
            return;
        }
        String X1 = UtilsMy.X1(Integer.parseInt(F.getPlugin_num()));
        if (TextUtils.isEmpty(X1)) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(getExternalFilesDir("backup"));
        String str = File.separator;
        sb.append(str);
        sb.append(F.getCrc_link_type_val());
        File file = new File(sb.toString());
        if (!file.exists() || !file.isDirectory() || file.listFiles() == null || file.listFiles().length <= 0) {
            return;
        }
        File file2 = new File(getExternalFilesDir("papa91") + str + X1 + str + F.getPackageName());
        for (File file3 : file.listFiles()) {
            com.join.mgps.Util.h0.c(file3.getAbsolutePath(), file2.getAbsolutePath() + File.separator + file3.getName());
        }
        com.join.mgps.Util.h0.h(file.getAbsolutePath(), true);
    }

    public void o2(boolean z4) {
        this.f32379i2 = z4;
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onADEvent(com.join.mgps.event.a aVar) {
        if (aVar == null) {
            return;
        }
        if (aVar.a() == 1) {
            this.f32392t2 = L1(this);
            q1();
            if (aVar.b() == 0) {
                Y1();
            }
            a2();
            this.f32385o2 = false;
        } else if (aVar.a() == 2) {
            q1();
            this.f32385o2 = true;
        } else if (aVar.a() == 3) {
            q1();
            Y1();
        } else if (aVar.a() != 4 || this.f32391s2 == null) {
        } else {
            com.join.mgps.event.u uVar = new com.join.mgps.event.u(5);
            if (this.f32391s2.getSdk_type() == 1) {
                uVar.d(1);
                uVar.e(this.v2);
                PrintStream printStream = System.out;
                printStream.println("111112 size:" + this.v2.size());
            } else if (this.f32391s2.getSdk_type() == 2) {
                uVar.d(2);
                uVar.e(this.f32395w2);
            }
            org.greenrobot.eventbus.c.f().o(uVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.join.mgps.activity.FriendActivity, com.BaseActivity, com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f31376j = "GAME_HOME_PAGE";
        this.f31375i = this.N;
        super.onCreate(bundle);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.join.mgps.activity.FriendActivity, com.BaseActivity, com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        b.InterfaceC0290b interfaceC0290b;
        com.join.mgps.socket.fight.arena.a aVar = this.K1;
        if (aVar != null) {
            aVar.w();
        }
        if (this.f32386p0 != null) {
            com.papa.sim.statistic.p.l(this).z0(this.f32386p0.getCrc_link_type_val(), this.E1.getUid());
        }
        com.join.mgps.socket.fight.arena.b bVar = this.J1;
        if (bVar != null && bVar.d() != null) {
            this.J1.d().A(this.f32378h2);
        }
        com.join.mgps.socket.fight.arena.b bVar2 = this.J1;
        if (bVar2 != null) {
            bVar2.g();
            this.J1.stopService();
            this.J1 = null;
        }
        EmuOutResultReceiver emuOutResultReceiver = this.Q1;
        if (emuOutResultReceiver != null) {
            unregisterReceiver(emuOutResultReceiver);
        }
        com.join.mgps.ad.x xVar = this.f32389q2;
        if (xVar != null) {
            xVar.x();
        }
        com.join.mgps.ad.f fVar = this.f32390r2;
        if (fVar != null) {
            fVar.w();
        }
        com.join.mgps.ad.v vVar = this.f32393u2;
        if (vVar != null) {
            vVar.c();
        }
        com.join.mgps.ad.e eVar = this.f32396x2;
        if (eVar != null) {
            eVar.c();
        }
        this.v2 = null;
        this.f32395w2 = null;
        Handler handler = this.f31374h;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        super.onDestroy();
        com.github.snowdream.android.app.downloader.b bVar3 = this.R1;
        if (bVar3 == null || (interfaceC0290b = this.S1) == null) {
            return;
        }
        bVar3.j(interfaceC0290b);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.join.mgps.activity.FriendActivity, com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        if (TextUtils.isEmpty(intent.getStringExtra("gameId")) || TextUtils.equals(intent.getStringExtra("gameId"), this.N)) {
            return;
        }
        this.N = intent.getStringExtra("gameId");
        this.O = intent.getStringExtra("from");
        this.f31376j = "GAME_HOME_PAGE";
        this.f31375i = this.N;
        afterViews();
        super.onNewIntent(intent);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.join.mgps.activity.FriendActivity, com.BaseActivity, com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        N1();
        this.E1 = AccountUtil_.getInstance_(this).getAccountData();
        if (this.J1 == null) {
            com.join.mgps.socket.fight.arena.b bVar = new com.join.mgps.socket.fight.arena.b(this, this.f32377g2);
            this.J1 = bVar;
            bVar.bindService();
        }
        if (this.f32386p0 != null) {
            com.papa.sim.statistic.p.l(this).d(p1.f.K().L(this.N, this), 0);
            com.papa.sim.statistic.p.l(this).d(p1.f.K().L(this.N, this), 1);
        }
        if (!this.f31379m) {
            T1();
        }
        com.join.mgps.Util.b0.f0(this).e(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        this.f31374h.postDelayed(new a(), 60L);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        com.join.mgps.socket.fight.arena.b bVar = this.J1;
        if (bVar != null && bVar.d() != null) {
            this.J1.d().A(this.f32378h2);
        }
        com.join.mgps.socket.fight.arena.b bVar2 = this.J1;
        if (bVar2 != null) {
            bVar2.g();
            this.J1.stopService();
            this.J1 = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void p1() {
        showToast("登录已失效请您重新登录");
        U1();
    }

    public void q2() {
        if (g2() && this.f32385o2) {
            PlayCfgBean playCfgBean = this.f32384n2;
            if (playCfgBean != null) {
                if (playCfgBean.getSdk_type() == 1) {
                    com.join.mgps.ad.x xVar = this.f32389q2;
                    if (xVar != null) {
                        xVar.r(this, this.N);
                        this.f32388p2 = true;
                        this.f32372b2.lastLaunchModGameId().g("");
                    }
                } else if (this.f32384n2.getSdk_type() == 2) {
                    com.join.mgps.ad.f fVar = this.f32390r2;
                    if (fVar != null) {
                        fVar.r(this, this.N);
                        this.f32388p2 = true;
                        this.f32372b2.lastLaunchModGameId().g("");
                    }
                } else if (this.f32384n2.getSdk_type() == 7) {
                    com.join.mgps.ad.j jVar = this.y2;
                    if (jVar != null) {
                        jVar.r(this, this.N);
                        this.f32388p2 = true;
                        this.f32372b2.lastLaunchModGameId().g("");
                    }
                    System.out.println("AD_LOG_TAG 显示融合广告 退出广告");
                }
            }
            this.f32385o2 = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Receiver(actions = {"com.wufun.cloud.game.main.showDownDialog"})
    public void r2() {
        if (!this.f31379m && this.R1.g() > 0) {
            this.T1.show();
        }
    }

    void s1() {
        if (this.T.getVisibility() != 0 && this.f32374d2 != 0) {
            IntentUtil.getInstance().goForumGroupActivity(this, this.f32374d2);
        } else {
            D2();
        }
    }

    void s2(DomainInfoBean domainInfoBean) {
        com.join.mgps.dialog.l1 l1Var = this.Z1;
        if ((l1Var == null || !l1Var.isShowing()) && p2() && domainInfoBean != null) {
            com.join.mgps.dialog.l1 l1Var2 = new com.join.mgps.dialog.l1(this, domainInfoBean);
            this.Z1 = l1Var2;
            l1Var2.t(new l(domainInfoBean));
            this.Z1.show();
            com.papa.sim.statistic.p.l(this).O1(Event.pdSimulatorStartWin, new Ext().setGameId(this.N).setIsJoin(domainInfoBean.getIs_join()).setTestAbNumber(domainInfoBean.getAb_test_number()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showToast(String str) {
        if (com.join.mgps.Util.g2.i(str)) {
            com.join.mgps.Util.l2.a(this).b(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void t1(CloudListDataBean cloudListDataBean) {
        DownloadTask F = p1.f.K().F(this.N);
        String p4 = UtilsMy.p4(F.getGameZipPath());
        String X1 = UtilsMy.X1(Integer.parseInt(F.getPlugin_num()));
        File file = new File(com.join.mgps.Util.v.f28104d);
        StringBuilder sb = new StringBuilder();
        sb.append(file.getAbsolutePath());
        String str = File.separator;
        sb.append(str);
        sb.append("papa91");
        sb.append(str);
        sb.append(X1);
        sb.append(str);
        String sb2 = sb.toString();
        String substring = p4.substring(p4.lastIndexOf(47) + 1, p4.length());
        File file2 = new File(sb2 + substring);
        if (!file2.exists()) {
            file2.mkdirs();
        }
        String str2 = new String(sb2 + substring + str + cloudListDataBean.getArchiveFileName());
        if (new File(cloudListDataBean.getArchiveFilePath()).exists()) {
            boolean c5 = com.join.mgps.Util.h0.c(cloudListDataBean.getArchiveFilePath(), str2);
            u1(cloudListDataBean.getArchiveCover(), file2.getAbsolutePath() + str, cloudListDataBean.getArchiveFileName() + ".png");
            if (c5) {
                UtilsMy.delete(new File(cloudListDataBean.getArchiveFilePath()));
                cloudListDataBean.setArchiveFilePath(str2);
            }
            I2(cloudListDataBean);
        }
    }

    public void t2() {
        if (this.f32388p2) {
            return;
        }
        this.f32388p2 = com.join.mgps.Util.b0.f0(this).e(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void u1(String str, String str2, String str3) {
        File file;
        File file2 = null;
        try {
            File file3 = new File(str2);
            if (!file3.exists()) {
                file3.mkdirs();
            }
            file = new File(str2 + str3);
        } catch (Exception e5) {
            e = e5;
        }
        try {
            if (file.exists()) {
                UtilsMy.delete(file);
            }
            file.createNewFile();
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            httpURLConnection.setConnectTimeout(5000);
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.setDoInput(true);
            if (httpURLConnection.getResponseCode() == 200) {
                InputStream inputStream = httpURLConnection.getInputStream();
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read != -1) {
                        fileOutputStream.write(bArr, 0, read);
                    } else {
                        inputStream.close();
                        fileOutputStream.close();
                        return;
                    }
                }
            } else if (file.exists()) {
                UtilsMy.delete(file);
            }
        } catch (Exception e6) {
            e = e6;
            file2 = file;
            try {
                e.printStackTrace();
                if (file2 == null || !file2.exists()) {
                    return;
                }
                UtilsMy.delete(file2);
            } catch (Exception e7) {
                e7.printStackTrace();
            }
        }
    }

    public void u2(Activity activity, String str) {
        com.join.mgps.ad.j jVar = this.y2;
        if (jVar != null) {
            jVar.r(activity, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void v2(GameMainV4DataBean gameMainV4DataBean) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void w2(OnlineCouponConfigBean onlineCouponConfigBean) {
        com.join.mgps.Util.b0.f0(this).V(this, onlineCouponConfigBean, 3);
        com.papa.sim.statistic.p.l(this).Q1(Event.quitSingleSuccessUpRedBag, AccountUtil_.getInstance_(this).getAccountData().getUid());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void x2() {
        r rVar = this.A1;
        if (rVar != null && rVar.isShowing()) {
            this.A1.dismiss();
        }
        r rVar2 = new r(this.Y, R.style.HKDialogLoading);
        this.A1 = rVar2;
        rVar2.show();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void y1() {
        try {
            com.wufan.user.service.protobuf.n0 accountData = AccountUtil_.getInstance_(this).getAccountData();
            if (accountData == null) {
                N1();
                return;
            }
            String token = accountData.getToken();
            ResultArenaBean<ArenaLobbyServer> P = com.join.mgps.rpc.impl.l.n0().P(accountData.getUid(), token);
            if (P == null || P.getError() != 0 || P.getData() == null) {
                return;
            }
            if (P.getData().getDisabled() != 0) {
                ArenaResponse arenaResponse = new ArenaResponse();
                arenaResponse.errorType = 1001;
                arenaResponse.errorInfo = "邀请失败：该玩家已被封禁！";
                handleFailure(arenaResponse);
                return;
            }
            z1();
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public void y2(Activity activity, String str) {
        if (activity == null || this.f32389q2 == null || activity.isDestroyed()) {
            return;
        }
        this.f32389q2.r(activity, str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void z1() {
        if (com.join.android.app.common.utils.j.j(this)) {
            if (!IntentUtil.getInstance().goLoginBattle(this)) {
                m1();
                this.P.setVisibility(0);
                this.f32376f2.start();
                if (UtilsMy.W(this.Y, this.f32386p0) == null) {
                    Toast.makeText(this, "正在下载插件...", 1).show();
                    N1();
                    return;
                }
                com.join.mgps.socket.fight.arena.b bVar = this.J1;
                if (bVar != null && bVar.d() != null) {
                    if (this.J1.d().s()) {
                        com.wufan.friend.chat.c.u().V(null);
                        this.J1.f(ArenaRequestFactory.createRoom(ArenaConstants.REGISTER_TYPE_GAMEMAIN, this.N, 0, AccountUtil_.getInstance_(this).getAccountData().getUid(), true));
                    } else {
                        ArenaRequest login = ArenaRequestFactory.login(ArenaConstants.REGISTER_TYPE_GAMEMAIN);
                        login.isRefreshing = true;
                        login.isElite = false;
                        this.J1.f(login);
                    }
                }
            }
            com.papa.sim.statistic.p.l(this).N0(this.f32386p0.getCrc_link_type_val(), this.E1.getUid());
            return;
        }
        showToast("无网络连接");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class r extends Dialog {

        /* loaded from: classes4.dex */
        class a implements AdapterView.OnItemClickListener {
            a() {
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i4, long j4) {
                PspBattleServer pspBattleServer = GameMainActivity3.this.f32394v1.get(i4);
                NetBattleStartGameDto netBattleStartGameDto = new NetBattleStartGameDto();
                netBattleStartGameDto.setServerIP(pspBattleServer.getIp());
                netBattleStartGameDto.setServerPort(pspBattleServer.getPort());
                netBattleStartGameDto.setGameID(GameMainActivity3.this.N + "");
                netBattleStartGameDto.setUserID(AccountUtil_.getInstance_(GameMainActivity3.this.Y).getAccountData().getUid() + "");
                netBattleStartGameDto.setOldGame(0);
                netBattleStartGameDto.setClientIp(GameMainActivity3.this.f32387p1);
                netBattleStartGameDto.setUserName(AccountUtil_.getInstance_(GameMainActivity3.this.Y).getAccountData().getNickname());
                netBattleStartGameDto.setUserIcon(AccountUtil_.getInstance_(GameMainActivity3.this.Y).getAccountData().d0());
                netBattleStartGameDto.setPorder(0);
                UtilsMy.b4(GameMainActivity3.this.Y, netBattleStartGameDto, GameMainActivity3.this.f32386p0, 13);
            }
        }

        /* loaded from: classes4.dex */
        private class b extends BaseAdapter {
            private b() {
            }

            @Override // android.widget.Adapter
            public int getCount() {
                return GameMainActivity3.this.f32394v1.size();
            }

            @Override // android.widget.Adapter
            public Object getItem(int i4) {
                return GameMainActivity3.this.f32394v1.get(i4);
            }

            @Override // android.widget.Adapter
            public long getItemId(int i4) {
                return i4;
            }

            @Override // android.widget.Adapter
            public View getView(int i4, View view, ViewGroup viewGroup) {
                if (view == null) {
                    view = LayoutInflater.from(GameMainActivity3.this.Y).inflate(R.layout.dialog_psp_item, (ViewGroup) null);
                }
                ((TextView) view.findViewById(R.id.name)).setText(GameMainActivity3.this.f32394v1.get(i4).getServer_name());
                ((TextView) view.findViewById(R.id.count)).setText(GameMainActivity3.this.f32394v1.get(i4).getPeople() + "人");
                return view;
            }

            /* synthetic */ b(r rVar, i iVar) {
                this();
            }
        }

        public r(Context context) {
            super(context);
        }

        @Override // android.app.Dialog
        protected void onCreate(Bundle bundle) {
            super.onCreate(bundle);
            requestWindowFeature(1);
            requestWindowFeature(-1);
            View inflate = LayoutInflater.from(GameMainActivity3.this.Y).inflate(R.layout.network_psp_dialog, (ViewGroup) null);
            ListView listView = (ListView) inflate.findViewById(R.id.listview);
            listView.setAdapter((ListAdapter) new b(this, null));
            listView.setOnItemClickListener(new a());
            setContentView(inflate);
        }

        protected r(Context context, boolean z4, DialogInterface.OnCancelListener onCancelListener) {
            super(context, z4, onCancelListener);
        }

        public r(Context context, int i4) {
            super(context, i4);
        }
    }
}
