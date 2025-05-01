package com.join.mgps.activity.arena;

import android.content.ClipboardManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.fragment.app.FragmentManager;
import app.mgsim.arena.ArenaConstants;
import app.mgsim.arena.ArenaLobbyServer;
import app.mgsim.arena.ArenaRequestFactory;
import app.mgsim.arena.ArenaResponse;
import app.mgsim.arena.RoomSeatState;
import app.mgsim.arena.SocketError;
import app.mgsim.arena.SocketListener;
import app.mgsim.arena.UserType;
import cn.sharesdk.framework.Platform;
import cn.sharesdk.framework.PlatformActionListener;
import cn.sharesdk.framework.ShareSDK;
import cn.sharesdk.tencent.qq.QQ;
import com.facebook.drawee.view.SimpleDraweeView;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.IntentDateBean;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.Util.a0;
import com.join.mgps.Util.b0;
import com.join.mgps.Util.e2;
import com.join.mgps.Util.g2;
import com.join.mgps.Util.l2;
import com.join.mgps.Util.v0;
import com.join.mgps.Util.y;
import com.join.mgps.activity.FriendActivity;
import com.join.mgps.activity.ShareWebActivity_;
import com.join.mgps.customview.PlayerInfoContainerView;
import com.join.mgps.dialog.d1;
import com.join.mgps.dialog.n;
import com.join.mgps.dto.ArchiveBean;
import com.join.mgps.dto.ArenaGameInfo;
import com.join.mgps.dto.BattleChallengeConfig;
import com.join.mgps.dto.FriendBean;
import com.join.mgps.dto.NetBattleStartGameDto;
import com.join.mgps.dto.ResultArenaBean;
import com.join.mgps.socket.fight.arena.ArenaService_;
import com.join.mgps.socket.fight.arena.a;
import com.join.mgps.socket.fight.arena.b;
import com.papa.sim.statistic.Event;
import com.papa.sim.statistic.Ext;
import com.papa91.arc.bean.ButtonBean;
import com.papa91.battle.protocol.BattleArea;
import com.papa91.battle.protocol.BattleServerAddr;
import com.papa91.battle.protocol.GameRoom;
import com.papa91.battle.protocol.KickInfo;
import com.papa91.battle.protocol.RoomPosition;
import com.papa91.battle.protocol.RoomState;
import io.netty.handler.codec.http.multipart.HttpPostBodyUtil;
import java.util.HashMap;
import java.util.List;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.Bean;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.Extra;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
@EActivity(R.layout.activity_game_room)
/* loaded from: classes.dex */
public class GameRoomActivity extends FriendActivity implements a.y {

    /* renamed from: b3  reason: collision with root package name */
    private static final int f38583b3 = 1000;

    /* renamed from: c3  reason: collision with root package name */
    private static final int f38584c3 = -1;

    /* renamed from: d3  reason: collision with root package name */
    private static final int f38585d3 = Color.parseColor("#47817e");

    /* renamed from: e3  reason: collision with root package name */
    private static final int f38586e3 = 100;

    /* renamed from: f3  reason: collision with root package name */
    private static final int f38587f3 = 102;

    /* renamed from: g3  reason: collision with root package name */
    private static final int f38588g3 = 1000;

    /* renamed from: h3  reason: collision with root package name */
    private static final int f38589h3 = 9;

    /* renamed from: i3  reason: collision with root package name */
    private static final int f38590i3 = 1000;
    @ViewById
    LinearLayout A1;
    @ViewById
    TextView B1;
    private int B2;
    @ViewById
    TextView C1;
    @ViewById
    TextView D1;
    private com.join.mgps.socket.fight.arena.a D2;
    @ViewById
    TextView E1;
    private d1 E2;
    @ViewById
    LinearLayout F1;
    private Drawable F2;
    @ViewById
    TextView G1;
    private Drawable G2;
    @ViewById
    ImageView H1;
    @ViewById
    ImageView I1;
    private FragmentManager I2;
    @ViewById
    ImageView J1;
    private com.join.mgps.customview.input.a J2;
    @ViewById
    View K1;
    com.join.mgps.rpc.l K2;
    @ViewById
    TextView L1;
    @ViewById
    RelativeLayout M1;
    @Extra
    BattleChallengeConfig N;
    @ViewById
    TextView N1;
    private ArchiveBean N2;
    @Bean
    com.join.mgps.Util.b O;
    @ViewById
    ImageView O1;
    ClipboardManager O2;
    @Extra
    int P;
    @ViewById
    LinearLayout P1;
    @Extra
    volatile GameRoom Q;
    @ViewById
    RelativeLayout Q1;
    private String Q2;
    @Extra
    String R;
    @ViewById
    View R1;
    private int R2;
    @Extra
    String S;
    @ViewById
    TextView S1;
    private int S2;
    @Extra
    boolean T;
    @ViewById
    SimpleDraweeView T1;
    private int T2;
    @Extra
    boolean U;
    @ViewById
    LinearLayout U1;
    private int U2;
    @ViewById
    RadioButton V1;
    @Extra
    String W;
    @ViewById
    RadioGroup W1;
    @Extra
    String X;
    @ViewById
    View X1;
    com.join.mgps.rpc.l X2;
    @ViewById
    TextView Y1;
    com.join.mgps.rpc.l Y2;
    @Extra
    int Z;
    private PlayerInfoContainerView Z1;
    private String Z2;
    @ViewById

    /* renamed from: a2  reason: collision with root package name */
    View f38591a2;
    @ViewById

    /* renamed from: b2  reason: collision with root package name */
    ImageView f38593b2;
    @ViewById

    /* renamed from: c2  reason: collision with root package name */
    TextView f38594c2;
    @ViewById

    /* renamed from: d2  reason: collision with root package name */
    TextView f38595d2;

    /* renamed from: e2  reason: collision with root package name */
    private String f38596e2;

    /* renamed from: j2  reason: collision with root package name */
    Context f38601j2;

    /* renamed from: k2  reason: collision with root package name */
    private com.join.mgps.socket.fight.arena.b f38602k2;

    /* renamed from: n2  reason: collision with root package name */
    private int f38605n2;
    @ViewById

    /* renamed from: p0  reason: collision with root package name */
    TextView f38607p0;
    @ViewById

    /* renamed from: p1  reason: collision with root package name */
    TextView f38608p1;

    /* renamed from: q2  reason: collision with root package name */
    private BTN_STATE f38610q2;

    /* renamed from: t2  reason: collision with root package name */
    private int f38613t2;
    @ViewById

    /* renamed from: v1  reason: collision with root package name */
    TextView f38615v1;
    private UserType v2;

    /* renamed from: x2  reason: collision with root package name */
    private boolean f38617x2;
    @ViewById

    /* renamed from: z2  reason: collision with root package name */
    TextView f38618z2;
    @Extra
    int V = -1;
    @Extra
    int Y = -1;

    /* renamed from: f2  reason: collision with root package name */
    private boolean f38597f2 = true;

    /* renamed from: g2  reason: collision with root package name */
    private boolean f38598g2 = true;

    /* renamed from: h2  reason: collision with root package name */
    private boolean f38599h2 = false;

    /* renamed from: i2  reason: collision with root package name */
    private boolean f38600i2 = false;

    /* renamed from: l2  reason: collision with root package name */
    private final b.InterfaceC0385b f38603l2 = new p();

    /* renamed from: m2  reason: collision with root package name */
    private final SocketListener.NotifyObserver f38604m2 = new r();

    /* renamed from: o2  reason: collision with root package name */
    private Handler f38606o2 = new Handler();

    /* renamed from: p2  reason: collision with root package name */
    private Runnable f38609p2 = new t();

    /* renamed from: r2  reason: collision with root package name */
    private boolean f38611r2 = false;

    /* renamed from: s2  reason: collision with root package name */
    private final Handler f38612s2 = new u();

    /* renamed from: u2  reason: collision with root package name */
    private Handler f38614u2 = new v();

    /* renamed from: w2  reason: collision with root package name */
    private final Object f38616w2 = new Object();
    private boolean y2 = false;
    boolean A2 = false;
    private final PlayerInfoContainerView.a C2 = new b();
    private boolean H2 = false;
    com.join.mgps.dialog.n L2 = null;
    long M2 = 0;
    private CountDownTimer P2 = new m(com.join.mgps.data.c.f49010a, 1000);
    private int V2 = -1;
    private ArenaGameInfo W2 = null;

    /* renamed from: a3  reason: collision with root package name */
    boolean f38592a3 = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public enum BTN_STATE {
        BTN_GOTO_GAME_NOW,
        BTN_STATE_START_GAME,
        BTN_STATE_WAITING_GAME,
        BTN_STATE_READY
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (GameRoomActivity.this.y2) {
                GameRoomActivity.this.D2.w();
            }
        }
    }

    /* loaded from: classes4.dex */
    class b implements PlayerInfoContainerView.a {
        b() {
        }

        @Override // com.join.mgps.customview.PlayerInfoContainerView.a
        public void a(RoomPosition roomPosition, int i4) {
            if (GameRoomActivity.this.Q.getState() == RoomState.START || roomPosition.getUid() == Integer.parseInt(GameRoomActivity.this.O.getUid())) {
                return;
            }
            if (GameRoomActivity.this.v2 == UserType.OWNER) {
                com.join.mgps.socket.fight.arena.a aVar = GameRoomActivity.this.D2;
                aVar.D(com.join.mgps.socket.fight.arena.a.f54759q, "位置：" + i4 + "P", RoomSeatState.REMOVE_AND_REPORT, Integer.valueOf(i4), roomPosition);
                return;
            }
            com.join.mgps.socket.fight.arena.a aVar2 = GameRoomActivity.this.D2;
            aVar2.D(com.join.mgps.socket.fight.arena.a.f54759q, "位置：" + i4 + "P", RoomSeatState.REPORT, Integer.valueOf(i4), roomPosition);
        }

        @Override // com.join.mgps.customview.PlayerInfoContainerView.a
        public void b(int i4) {
            if (GameRoomActivity.this.Q.getState() == RoomState.START) {
                GameRoomActivity.this.D2.D(com.join.mgps.socket.fight.arena.a.f54752j, 257, 0, "当前房间已开始，请先进入游戏后再坐下", "确定");
                return;
            }
            com.join.mgps.socket.fight.arena.a aVar = GameRoomActivity.this.D2;
            aVar.D(com.join.mgps.socket.fight.arena.a.f54759q, "位置：" + i4 + "P", RoomSeatState.SEAT, Integer.valueOf(i4));
        }

        @Override // com.join.mgps.customview.PlayerInfoContainerView.a
        public boolean c() {
            return GameRoomActivity.this.v2 == UserType.SPECTATOR;
        }

        @Override // com.join.mgps.customview.PlayerInfoContainerView.a
        public void d() {
            if (!GameRoomActivity.this.Q.getHasJoinPassword()) {
                com.join.mgps.socket.fight.arena.b bVar = GameRoomActivity.this.f38602k2;
                int roomId = GameRoomActivity.this.Q.getRoomId();
                bVar.f(ArenaRequestFactory.setRoomPassword(ArenaConstants.REGISTER_TYPE_GAMEROOM, roomId, ((int) (((Math.random() * 9.0d) + 1.0d) * 1000.0d)) + ""));
            }
            if (GameRoomActivity.this.v2 == UserType.OWNER) {
                Object[] objArr = {"", ""};
                try {
                    objArr = new String[]{GameRoomActivity.this.Q.getGameId() + "", GameRoomActivity.this.Q.getFightId() + ""};
                } catch (Exception unused) {
                }
                GameRoomActivity.this.D2.D(com.join.mgps.socket.fight.arena.a.f54761s, objArr);
            }
        }

        @Override // com.join.mgps.customview.PlayerInfoContainerView.a
        public void e(RoomPosition roomPosition, boolean z4, int i4) {
            RoomState state = GameRoomActivity.this.Q.getState();
            RoomState roomState = RoomState.START;
            if (state == roomState) {
                GameRoomActivity.this.D2.D(com.join.mgps.socket.fight.arena.a.f54752j, 257, 0, "当前房间已开始，请先进入游戏后再坐下", "确定");
            } else if (GameRoomActivity.this.v2 != UserType.OWNER || GameRoomActivity.this.Q.getState() == roomState) {
            } else {
                com.join.mgps.socket.fight.arena.a aVar = GameRoomActivity.this.D2;
                Object[] objArr = new Object[3];
                objArr[0] = "位置：" + i4 + "P";
                objArr[1] = z4 ? RoomSeatState.CLOSE : RoomSeatState.OPEN;
                objArr[2] = Integer.valueOf(i4);
                aVar.D(com.join.mgps.socket.fight.arena.a.f54759q, objArr);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GameRoomActivity gameRoomActivity = GameRoomActivity.this;
            if (gameRoomActivity.f38592a3) {
                return;
            }
            if (!gameRoomActivity.Q.getHasJoinPassword()) {
                com.join.mgps.socket.fight.arena.b bVar = GameRoomActivity.this.f38602k2;
                int roomId = GameRoomActivity.this.Q.getRoomId();
                bVar.f(ArenaRequestFactory.setRoomPassword(ArenaConstants.REGISTER_TYPE_GAMEROOM, roomId, ((int) (((Math.random() * 9.0d) + 1.0d) * 1000.0d)) + ""));
            }
            if (GameRoomActivity.this.v2 == UserType.OWNER) {
                Object[] objArr = {"", ""};
                try {
                    objArr = new String[]{GameRoomActivity.this.Q.getGameId() + "", GameRoomActivity.this.Q.getFightId() + ""};
                } catch (Exception unused) {
                }
                GameRoomActivity.this.D2.D(com.join.mgps.socket.fight.arena.a.f54761s, objArr);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class d implements View.OnClickListener {
        d() {
        }

        boolean a() {
            return GameRoomActivity.this.Q != null && (GameRoomActivity.this.Q.getP3().getUid() > 0 || GameRoomActivity.this.Q.getP4().getUid() > 0);
        }

        public int b() {
            int i4 = (GameRoomActivity.this.Q.getP1().getClosed() || GameRoomActivity.this.Q.getP1().getUid() <= 0) ? 0 : 1;
            if (!GameRoomActivity.this.Q.getP2().getClosed() && GameRoomActivity.this.Q.getP2().getUid() > 0) {
                i4++;
            }
            if (!GameRoomActivity.this.Q.getP3().getClosed() && GameRoomActivity.this.Q.getP3().getUid() > 0) {
                i4++;
            }
            return (GameRoomActivity.this.Q.getP4().getClosed() || GameRoomActivity.this.Q.getP4().getUid() <= 0) ? i4 : i4 + 1;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (GameRoomActivity.this.v2 != UserType.OWNER) {
                return;
            }
            if (GameRoomActivity.this.Q.getState() == RoomState.START && GameRoomActivity.this.f38611r2) {
                GameRoomActivity.this.showToast("房间已经进入倒计时状态，不能再设置！");
            } else if (com.join.mgps.socket.fight.arena.c.a(GameRoomActivity.this.Q, GameRoomActivity.this.O)) {
                GameRoomActivity.this.showToast("已有玩家进入，无法再设置!");
            } else if (b() <= 2 && !a()) {
                GameRoomActivity.this.k2();
            } else {
                GameRoomActivity.this.showToast("仅限2人对战时开启");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class e implements View.OnClickListener {
        e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (GameRoomActivity.this.v2 != UserType.OWNER) {
                return;
            }
            if (!GameRoomActivity.this.Q.getElite()) {
                GameRoomActivity.this.showToast("普通场不可以设置挑战金，如需要设置，请进入精英场!");
            } else if (com.join.mgps.socket.fight.arena.c.a(GameRoomActivity.this.Q, GameRoomActivity.this.O)) {
                GameRoomActivity.this.showToast("已有玩家进入，无法再设置挑战金!");
            } else if (GameRoomActivity.this.Q.getState() != RoomState.START) {
                if (GameRoomActivity.this.f38611r2) {
                    GameRoomActivity.this.showToast("房间已经进入倒计时状态，不能再设置挑战金！");
                    return;
                }
                GameRoomActivity gameRoomActivity = GameRoomActivity.this;
                if (gameRoomActivity.N == null) {
                    gameRoomActivity.f2("正在获取配置信息...");
                    GameRoomActivity.this.L1();
                    return;
                }
                gameRoomActivity.i2();
            } else {
                GameRoomActivity.this.showToast("游戏已经开始，无法设置挑战金!");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class f implements View.OnClickListener {
        f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (GameRoomActivity.this.v2 != UserType.OWNER) {
                return;
            }
            if (GameRoomActivity.this.Q.getState() != RoomState.START) {
                if (!GameRoomActivity.this.f38611r2) {
                    GameRoomActivity.this.D2.D(com.join.mgps.socket.fight.arena.a.f54756n, Long.valueOf(GameRoomActivity.this.Q.getGameId()), GameRoomActivity.this.N2);
                    if (GameRoomActivity.this.D2.z()) {
                        GameRoomActivity.this.D2.C();
                        return;
                    } else {
                        GameRoomActivity.this.showToast("当前游戏暂无网络存档!");
                        return;
                    }
                }
                GameRoomActivity.this.showToast("房间已经进入倒计时状态，不能再设置网络存档！");
                return;
            }
            GameRoomActivity.this.showToast("游戏已经开始，无法设置存档!");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class g implements View.OnClickListener {

        /* loaded from: classes4.dex */
        class a implements x {
            a() {
            }

            @Override // com.join.mgps.activity.arena.GameRoomActivity.x
            public void onFail(int i4) {
            }

            @Override // com.join.mgps.activity.arena.GameRoomActivity.x
            public void onSuccess(int i4, int i5) {
                if (i4 == 3) {
                    GameRoomActivity.this.W1(i5);
                }
            }

            @Override // com.join.mgps.activity.arena.GameRoomActivity.x
            public void onSuccess(int i4, int i5, ButtonBean buttonBean) {
            }
        }

        /* loaded from: classes4.dex */
        class b implements x {
            b() {
            }

            @Override // com.join.mgps.activity.arena.GameRoomActivity.x
            public void onFail(int i4) {
            }

            @Override // com.join.mgps.activity.arena.GameRoomActivity.x
            public void onSuccess(int i4, int i5) {
                if (i4 == 3) {
                    GameRoomActivity.this.W1(i5);
                }
            }

            @Override // com.join.mgps.activity.arena.GameRoomActivity.x
            public void onSuccess(int i4, int i5, ButtonBean buttonBean) {
            }
        }

        g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (!GameRoomActivity.this.Q.getState().equals(RoomState.START)) {
                if (GameRoomActivity.this.v2 == UserType.OWNER) {
                    if (GameRoomActivity.this.f38610q2 != BTN_STATE.BTN_GOTO_GAME_NOW && GameRoomActivity.this.f38610q2 != BTN_STATE.BTN_STATE_START_GAME) {
                        if (GameRoomActivity.this.f38610q2 == BTN_STATE.BTN_STATE_WAITING_GAME) {
                            GameRoomActivity.this.showToast("等待其他玩家准备!");
                        }
                    } else if (GameRoomActivity.this.M2 > 0 && System.currentTimeMillis() - GameRoomActivity.this.M2 < 1000) {
                        v0.b("GameRoomActivity", "start game so fast ,waiting a moment!");
                    } else {
                        GameRoomActivity gameRoomActivity = GameRoomActivity.this;
                        UtilsMy.z0(gameRoomActivity.f38601j2, 3, ((FriendActivity) gameRoomActivity).f31375i, "FIGHT_LOBBY", new a());
                    }
                } else if (GameRoomActivity.this.v2 != UserType.TENANT) {
                    if (GameRoomActivity.this.v2 == UserType.SPECTATOR) {
                        GameRoomActivity.this.showToast("等待游戏开始!");
                    }
                } else {
                    GameRoomActivity gameRoomActivity2 = GameRoomActivity.this;
                    UtilsMy.z0(gameRoomActivity2.f38601j2, 3, ((FriendActivity) gameRoomActivity2).f31375i, "FIGHT_LOBBY", new b());
                }
            } else if (GameRoomActivity.this.M2 > 0 && System.currentTimeMillis() - GameRoomActivity.this.M2 < 1000) {
                v0.b("GameRoomActivity", "start game so fast ,waiting a moment!");
            } else {
                GameRoomActivity.this.M2 = System.currentTimeMillis();
                GameRoomActivity.this.n2();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class h implements View.OnClickListener {
        h() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (GameRoomActivity.this.v2 != UserType.OWNER) {
                return;
            }
            if (GameRoomActivity.this.Q.getState() != RoomState.START) {
                if (GameRoomActivity.this.f38611r2) {
                    GameRoomActivity.this.showToast("房间已经进入倒计时状态，不能再设置！");
                    return;
                } else if (!com.join.mgps.socket.fight.arena.c.a(GameRoomActivity.this.Q, GameRoomActivity.this.O)) {
                    GameRoomActivity.this.f38602k2.f(ArenaRequestFactory.setRoomPeripheralJoin(ArenaConstants.REGISTER_TYPE_GAMEROOM, GameRoomActivity.this.Q.getRoomId(), GameRoomActivity.this.f38598g2));
                    return;
                } else {
                    GameRoomActivity.this.showToast("已有玩家进入，无法再设置!");
                    return;
                }
            }
            GameRoomActivity.this.showToast("游戏已经开始，无法设置外设!");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class i implements View.OnClickListener {
        i() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GameRoomActivity.this.h2();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class j implements n.d {
        j() {
        }

        @Override // com.join.mgps.dialog.n.d
        public void a(int i4, boolean z4, boolean z5, String str) {
            UserType userType = GameRoomActivity.this.v2;
            UserType userType2 = UserType.OWNER;
            if (userType != userType2) {
                return;
            }
            if (i4 != (GameRoomActivity.this.Q.getAllowPCJoin() ? 2 : 1)) {
                if (GameRoomActivity.this.Q.getState() != RoomState.START) {
                    if (GameRoomActivity.this.f38611r2) {
                        GameRoomActivity.this.showToast("房间已经进入倒计时状态，不能再设置！");
                    } else if (!com.join.mgps.socket.fight.arena.c.a(GameRoomActivity.this.Q, GameRoomActivity.this.O)) {
                        GameRoomActivity.this.f38602k2.f(ArenaRequestFactory.setRoomPcJoin(ArenaConstants.REGISTER_TYPE_GAMEROOM, GameRoomActivity.this.Q.getRoomId(), i4 != 2));
                    } else {
                        GameRoomActivity.this.showToast("已有玩家进入，无法再设置!");
                    }
                } else {
                    GameRoomActivity.this.showToast("游戏已经开始，无法设置PC!");
                }
            }
            if (GameRoomActivity.this.v2 == userType2) {
                if (GameRoomActivity.this.Q.getState() != RoomState.START) {
                    if (GameRoomActivity.this.f38611r2) {
                        GameRoomActivity.this.showToast("房间已经进入倒计时状态，不能再设置！");
                    } else {
                        if (GameRoomActivity.this.Q.getAllowSpectatorJoin()) {
                            GameRoomActivity.this.f38597f2 = true;
                        } else {
                            GameRoomActivity.this.f38597f2 = false;
                        }
                        if (GameRoomActivity.this.f38597f2 != z5) {
                            GameRoomActivity.this.f38602k2.f(ArenaRequestFactory.setRoomSpectatorJoin(ArenaConstants.REGISTER_TYPE_GAMEROOM, GameRoomActivity.this.Q.getRoomId(), GameRoomActivity.this.f38597f2));
                        }
                    }
                } else {
                    GameRoomActivity.this.showToast("游戏已经开始，无法设置旁观!");
                }
            }
            if (!z4) {
                if (GameRoomActivity.this.Q.getHasJoinPassword()) {
                    return;
                }
                com.join.mgps.socket.fight.arena.b bVar = GameRoomActivity.this.f38602k2;
                int roomId = GameRoomActivity.this.Q.getRoomId();
                bVar.f(ArenaRequestFactory.setRoomPassword(ArenaConstants.REGISTER_TYPE_GAMEROOM, roomId, "" + str));
            } else if (GameRoomActivity.this.Q.getHasJoinPassword()) {
                GameRoomActivity.this.f38602k2.f(ArenaRequestFactory.setRoomPassword(ArenaConstants.REGISTER_TYPE_GAMEROOM, GameRoomActivity.this.Q.getRoomId(), ""));
            }
        }

        @Override // com.join.mgps.dialog.n.d
        public void b() {
            if (GameRoomActivity.this.v2 != UserType.OWNER) {
                return;
            }
            if (GameRoomActivity.this.Q.getState() != RoomState.START) {
                if (!GameRoomActivity.this.f38611r2) {
                    GameRoomActivity.this.D2.D(com.join.mgps.socket.fight.arena.a.f54756n, Long.valueOf(GameRoomActivity.this.Q.getGameId()), GameRoomActivity.this.N2);
                    if (GameRoomActivity.this.D2.z()) {
                        GameRoomActivity.this.D2.C();
                        return;
                    } else {
                        GameRoomActivity.this.showToast("当前游戏暂无网络存档!");
                        return;
                    }
                }
                GameRoomActivity.this.showToast("房间已经进入倒计时状态，不能再设置网络存档！");
                return;
            }
            GameRoomActivity.this.showToast("游戏已经开始，无法设置存档!");
        }
    }

    /* loaded from: classes4.dex */
    class k implements x {
        k() {
        }

        @Override // com.join.mgps.activity.arena.GameRoomActivity.x
        public void onFail(int i4) {
        }

        @Override // com.join.mgps.activity.arena.GameRoomActivity.x
        public void onSuccess(int i4, int i5) {
        }

        @Override // com.join.mgps.activity.arena.GameRoomActivity.x
        public void onSuccess(int i4, int i5, ButtonBean buttonBean) {
            GameRoomActivity.this.finish();
        }
    }

    /* loaded from: classes4.dex */
    class l implements PlatformActionListener {
        l() {
        }

        @Override // cn.sharesdk.framework.PlatformActionListener
        public void onCancel(Platform platform, int i4) {
        }

        @Override // cn.sharesdk.framework.PlatformActionListener
        public void onComplete(Platform platform, int i4, HashMap<String, Object> hashMap) {
        }

        @Override // cn.sharesdk.framework.PlatformActionListener
        public void onError(Platform platform, int i4, Throwable th) {
            if (GameRoomActivity.this.T1()) {
                return;
            }
            GameRoomActivity.this.showToast("请先安装QQ");
        }
    }

    /* loaded from: classes4.dex */
    class m extends CountDownTimer {
        m(long j4, long j5) {
            super(j4, j5);
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            v0.b("GameRoomActivity", "mStartGameCountDowner onFinish---");
            GameRoomActivity.this.showToast("启动游戏超时！");
            GameRoomActivity.this.C();
            GameRoomActivity.this.J1();
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j4) {
            v0.b("GameRoomActivity", "mStartGameCountDowner millisUntilFinished:" + j4);
        }
    }

    /* loaded from: classes4.dex */
    class n implements x {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ FriendBean f38634a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ GameRoom f38635b;

        n(FriendBean friendBean, GameRoom gameRoom) {
            this.f38634a = friendBean;
            this.f38635b = gameRoom;
        }

        @Override // com.join.mgps.activity.arena.GameRoomActivity.x
        public void onFail(int i4) {
        }

        @Override // com.join.mgps.activity.arena.GameRoomActivity.x
        public void onSuccess(int i4, int i5) {
            com.wufan.friend.chat.c.u().n(this.f38634a.getUid(), this.f38635b.getRoomId(), this.f38635b.getPassword(), this.f38635b.getElite(), this.f38635b.getGameId());
            GameRoomActivity.this.showToast("已发送对战邀请！");
            com.wufan.friend.chat.c.u().e(this.f38634a);
        }

        @Override // com.join.mgps.activity.arena.GameRoomActivity.x
        public void onSuccess(int i4, int i5, ButtonBean buttonBean) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class o implements a0.n0 {
        o() {
        }

        @Override // com.join.mgps.Util.a0.n0
        public boolean a(DialogInterface dialogInterface, int i4, KeyEvent keyEvent) {
            return false;
        }

        @Override // com.join.mgps.Util.a0.n0
        public void onCancel() {
            GameRoomActivity.this.z(com.join.mgps.socket.fight.arena.a.f54757o);
        }

        @Override // com.join.mgps.Util.a0.n0
        public void onDismiss() {
            GameRoomActivity.this.z(com.join.mgps.socket.fight.arena.a.f54757o);
        }
    }

    /* loaded from: classes4.dex */
    class p extends b.c {
        p() {
        }

        @Override // com.join.mgps.socket.fight.arena.b.c, com.join.mgps.socket.fight.arena.b.InterfaceC0385b
        public void c() {
            super.c();
            if (GameRoomActivity.this.f38602k2.d().s()) {
                GameRoomActivity.this.f38602k2.d().z(GameRoomActivity.this.f38604m2);
                GameRoomActivity.this.t2();
                GameRoomActivity gameRoomActivity = GameRoomActivity.this;
                if (gameRoomActivity.U && gameRoomActivity.Q.getElite()) {
                    GameRoomActivity gameRoomActivity2 = GameRoomActivity.this;
                    if (gameRoomActivity2.N != null) {
                        gameRoomActivity2.i2();
                    } else {
                        gameRoomActivity2.showToast("获取配置信息失败！");
                        GameRoomActivity.this.J1();
                    }
                } else {
                    String str = GameRoomActivity.this.W;
                    if (str != null && str.equals("game_main")) {
                        GameRoomActivity.this.f38595d2.performClick();
                    }
                }
                try {
                    GameRoomActivity gameRoomActivity3 = GameRoomActivity.this;
                    int i4 = gameRoomActivity3.V;
                    if (i4 == 0) {
                        gameRoomActivity3.f38602k2.f(ArenaRequestFactory.setRoomPcJoin(ArenaConstants.REGISTER_TYPE_GAMEROOM, GameRoomActivity.this.Q.getRoomId(), true));
                    } else if (i4 == 1) {
                        gameRoomActivity3.f38602k2.f(ArenaRequestFactory.setRoomPcJoin(ArenaConstants.REGISTER_TYPE_GAMEROOM, GameRoomActivity.this.Q.getRoomId(), false));
                    }
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
                if (!g2.i(GameRoomActivity.this.X) || GameRoomActivity.this.Q.getHasJoinPassword()) {
                    return;
                }
                com.join.mgps.socket.fight.arena.b bVar = GameRoomActivity.this.f38602k2;
                int roomId = GameRoomActivity.this.Q.getRoomId();
                bVar.f(ArenaRequestFactory.setRoomPassword(ArenaConstants.REGISTER_TYPE_GAMEROOM, roomId, "" + GameRoomActivity.this.X));
                GameRoomActivity.this.X = "";
                return;
            }
            GameRoomActivity.this.showToast("网络异常！");
            GameRoomActivity.this.J1();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class q implements DialogInterface.OnDismissListener {
        q() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            GameRoomActivity.this.J1();
        }
    }

    /* loaded from: classes4.dex */
    class r implements SocketListener.NotifyObserver {

        /* renamed from: a  reason: collision with root package name */
        volatile boolean f38640a = false;

        r() {
        }

        @Override // app.mgsim.arena.SocketListener.NotifyObserver
        public void onError(SocketError socketError) {
            if (socketError.errorType == 2) {
                GameRoomActivity.this.showToast(socketError.errorInfo);
            } else {
                GameRoomActivity.this.showToast("网络异常!");
            }
            GameRoomActivity.this.J1();
        }

        @Override // app.mgsim.arena.SocketListener.NotifyObserver
        public void onServerResponse(ArenaResponse arenaResponse) {
            if (GameRoomActivity.this.T1()) {
                return;
            }
            if (arenaResponse.responseCode == 0) {
                GameRoomActivity.this.O1(arenaResponse);
            } else if (arenaResponse.responseType.equals(ArenaConstants.ArenaCommand.PUSH_ROOM_READY_TIMEOUT_KICKOUT)) {
                if (GameRoomActivity.this.Q.getRoomId() == ((GameRoom) arenaResponse.data).getRoomId()) {
                    GameRoomActivity.this.g2();
                }
            } else if (arenaResponse.responseType.equals(ArenaConstants.ArenaCommand.PUSH_ROOM_START_TIMEOUT_KICKOUT)) {
                if (GameRoomActivity.this.Q.getRoomId() == ((GameRoom) arenaResponse.data).getRoomId()) {
                    GameRoomActivity.this.j2();
                }
            } else if (arenaResponse.responseType.equals(ArenaConstants.ArenaCommand.CMD_SET_ROOM_PASSWORD_ATTR)) {
                GameRoomActivity.this.v2((GameRoom) arenaResponse.data);
            } else if (arenaResponse.responseType.equals(ArenaConstants.ArenaCommand.CMD_SET_ROOM_CHALLENGE_COINS_ATTR)) {
                GameRoomActivity.this.showToast("挑战金设置成功");
                GameRoomActivity.this.v2((GameRoom) arenaResponse.data);
            } else if (arenaResponse.responseType.equals(ArenaConstants.ArenaCommand.CMD_SET_ROOM_SPECTATOR_JOIN_ATTR)) {
                GameRoomActivity.this.showToast("旁观设置成功");
                GameRoomActivity.this.v2((GameRoom) arenaResponse.data);
            } else if (arenaResponse.responseType.equals(ArenaConstants.ArenaCommand.CMD_SET_ROOM_PERIPHERAL_JOIN_ATTR)) {
                GameRoomActivity.this.showToast("设置成功");
                GameRoomActivity.this.v2((GameRoom) arenaResponse.data);
            } else if (arenaResponse.responseType.equals(ArenaConstants.ArenaCommand.CMD_SET_ROOM_PC_JOIN_ALTR)) {
                GameRoomActivity.this.v2((GameRoom) arenaResponse.data);
            } else if (arenaResponse.responseType.equals(ArenaConstants.ArenaCommand.CMD_SET_ROOM_SERVER_PLAY_MODE)) {
                GameRoomActivity.this.showToast("流畅模式设置成功");
                GameRoomActivity.this.v2((GameRoom) arenaResponse.data);
            } else if (arenaResponse.responseType.equals(ArenaConstants.ArenaCommand.CMD_GET_KICK_OUT_ROOM_POSITION_INFO)) {
                GameRoomActivity.this.P1((KickInfo) arenaResponse.data);
            } else if (!arenaResponse.responseType.equals(ArenaConstants.ArenaCommand.CMD_SET_ROOM_CLOSE_P1_POSITION) && !arenaResponse.responseType.equals(ArenaConstants.ArenaCommand.CMD_SET_ROOM_CLOSE_P2_POSITION) && !arenaResponse.responseType.equals(ArenaConstants.ArenaCommand.CMD_SET_ROOM_CLOSE_P3_POSITION) && !arenaResponse.responseType.equals(ArenaConstants.ArenaCommand.CMD_SET_ROOM_CLOSE_P4_POSITION) && !arenaResponse.responseType.equals(ArenaConstants.ArenaCommand.CMD_KICK_OUT_ROOM_POSITION) && !arenaResponse.responseType.equals(ArenaConstants.ArenaCommand.PUSH_UPDATE_ROOM) && !arenaResponse.responseType.equals(ArenaConstants.ArenaCommand.CMD_PLAYER_READY_GAME) && !arenaResponse.responseType.equals(ArenaConstants.ArenaCommand.CMD_SPECTATOR_SIT)) {
                if (arenaResponse.responseType.equals(ArenaConstants.ArenaCommand.PUSH_DISSOLVE_ROOM)) {
                    GameRoomActivity.this.showToast("房间已经被解散");
                    GameRoomActivity.this.A1();
                    GameRoomActivity.this.J1();
                } else if (arenaResponse.responseType.equals(ArenaConstants.ArenaCommand.PUSH_KICK_ROOM_BROADCAST)) {
                    GameRoomActivity.this.A1();
                    GameRoomActivity.this.e2("你已被踢出房间");
                } else if (arenaResponse.responseType.equals(ArenaConstants.ArenaCommand.PUSH_START_GAME_ROOM_BROADCAST) || arenaResponse.responseType.equals(ArenaConstants.ArenaCommand.CMD_LOBBY_START_GAME)) {
                    GameRoomActivity.this.A1();
                    if (!this.f38640a) {
                        this.f38640a = true;
                        GameRoom gameRoom = (GameRoom) arenaResponse.data;
                        if (GameRoomActivity.this.v2 == UserType.OWNER) {
                            GameRoomActivity.this.Y = 0;
                        } else {
                            GameRoomActivity gameRoomActivity = GameRoomActivity.this;
                            if (gameRoomActivity.Y == -1) {
                                gameRoomActivity.Y = 1;
                            }
                        }
                        com.papa.sim.statistic.p l4 = com.papa.sim.statistic.p.l(GameRoomActivity.this);
                        Event event = Event.PlayLobbyroom;
                        Ext ext = new Ext();
                        Ext uid = ext.setGameId(GameRoomActivity.this.Q.getGameId() + "").setUid(AccountUtil_.getInstance_(GameRoomActivity.this).getAccountData().getUid());
                        l4.O1(event, uid.setPosition(GameRoomActivity.this.Y + ""));
                        GameRoomActivity.this.m2(gameRoom.getBattleServerAddr());
                        GameRoomActivity.this.Q1();
                        return;
                    }
                    v0.b("GameRoomActivity", "the game have been started ,do not start again!");
                }
            } else {
                GameRoomActivity.this.v2((GameRoom) arenaResponse.data);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class s implements DialogInterface.OnDismissListener {
        s() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            GameRoomActivity.this.J1();
        }
    }

    /* loaded from: classes4.dex */
    class t implements Runnable {
        t() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GameRoomActivity.u1(GameRoomActivity.this);
            GameRoomActivity gameRoomActivity = GameRoomActivity.this;
            gameRoomActivity.E1.setText(y.f(gameRoomActivity.f38605n2));
            GameRoomActivity.this.f38606o2.postDelayed(GameRoomActivity.this.f38609p2, 1000L);
        }
    }

    /* loaded from: classes4.dex */
    class u extends Handler {
        u() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            GameRoomActivity.this.V1();
        }
    }

    /* loaded from: classes4.dex */
    class v extends Handler {
        v() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (GameRoomActivity.this.T1()) {
                return;
            }
            GameRoomActivity.z1(GameRoomActivity.this);
            if (GameRoomActivity.this.f38613t2 <= 0) {
                GameRoomActivity.this.D2.D(com.join.mgps.socket.fight.arena.a.f54755m, "对不起，您长时间未开始游戏，您已被踢出房间!");
                GameRoomActivity.this.f38612s2.sendEmptyMessageDelayed(102, 1000L);
            } else if (GameRoomActivity.this.v2 == UserType.OWNER) {
                TextView textView = GameRoomActivity.this.f38608p1;
                textView.setText("对方已准备，请开始游戏(" + GameRoomActivity.this.f38613t2 + ")");
                TextView textView2 = GameRoomActivity.this.f38594c2;
                textView2.setText("(" + GameRoomActivity.this.f38613t2 + "s)");
                GameRoomActivity.this.f38594c2.setVisibility(0);
                GameRoomActivity.this.f38593b2.setImageResource(R.drawable.newarena_start);
                GameRoomActivity.this.f38614u2.sendEmptyMessageDelayed(100, 1000L);
            } else {
                TextView textView3 = GameRoomActivity.this.f38594c2;
                textView3.setText("(" + GameRoomActivity.this.f38613t2 + "s)");
                GameRoomActivity.this.f38594c2.setVisibility(0);
                GameRoomActivity.this.f38593b2.setImageResource(R.drawable.newarena_reday);
                GameRoomActivity.this.f38614u2.sendEmptyMessageDelayed(100, 1000L);
            }
        }
    }

    /* loaded from: classes4.dex */
    class w implements x {
        w() {
        }

        @Override // com.join.mgps.activity.arena.GameRoomActivity.x
        public void onFail(int i4) {
        }

        @Override // com.join.mgps.activity.arena.GameRoomActivity.x
        public void onSuccess(int i4, int i5) {
            if (i4 == 2) {
                GameRoomActivity.this.W1(i5);
            }
        }

        @Override // com.join.mgps.activity.arena.GameRoomActivity.x
        public void onSuccess(int i4, int i5, ButtonBean buttonBean) {
        }
    }

    /* loaded from: classes4.dex */
    public interface x {
        void onFail(int i4);

        void onSuccess(int i4, int i5);

        void onSuccess(int i4, int i5, ButtonBean buttonBean);
    }

    private void B1() {
        CountDownTimer countDownTimer = this.P2;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
    }

    private void E1() {
        ((ClipboardManager) getSystemService("clipboard")).setText("");
    }

    private void F1(String str) {
        ClipboardManager clipboardManager = (ClipboardManager) getSystemService("clipboard");
        this.O2 = clipboardManager;
        clipboardManager.setText(str.trim());
    }

    private String G1() {
        p1.f K = p1.f.K();
        DownloadTask F = K.F("" + this.Q.getGameId());
        if (TextUtils.isEmpty(this.f38596e2)) {
            return "复制这条信息，打开" + I1(128073) + com.join.android.app.mgsim.wufun.b.f15658i + I1(128072) + "即可在游戏【" + F.getShowName() + "】中【大厅对战】好友" + I1(9786) + this.O.getAccountData().getNickname() + I1(9786) + "￥" + this.Q.getGameId() + "￥" + I1(128273) + "$房间" + this.Q.getRoomId() + "$" + I1(128273) + "#对战" + this.Q.getFightId() + "#" + I1(128273);
        }
        return "复制这条信息，打开" + I1(128073) + com.join.android.app.mgsim.wufun.b.f15658i + I1(128072) + "即可在游戏【" + F.getShowName() + "】中【大厅对战】好友" + I1(9786) + this.O.getAccountData().getNickname() + I1(9786) + "￥" + this.Q.getGameId() + "￥" + I1(128273) + "$房间" + this.Q.getRoomId() + "$" + I1(128273) + "#对战" + this.Q.getFightId() + "#&密码:" + this.f38596e2 + m.a.f71490d;
    }

    private void H1(String str) throws Exception {
        PackageInfo packageInfo = getPackageManager().getPackageInfo(str, 0);
        Intent intent = new Intent("android.intent.action.MAIN", (Uri) null);
        intent.addCategory("android.intent.category.LAUNCHER");
        intent.setPackage(packageInfo.packageName);
        ResolveInfo next = getPackageManager().queryIntentActivities(intent, 0).iterator().next();
        if (next != null) {
            ActivityInfo activityInfo = next.activityInfo;
            String str2 = activityInfo.packageName;
            String str3 = activityInfo.name;
            Intent intent2 = new Intent("android.intent.action.MAIN");
            intent2.addFlags(268435456);
            intent2.addCategory("android.intent.category.LAUNCHER");
            intent2.setComponent(new ComponentName(str2, str3));
            startActivity(intent2);
        }
    }

    private String I1(int i4) {
        return String.valueOf(Character.toChars(i4));
    }

    private void R1() {
        this.f38595d2.setOnClickListener(new c());
        this.X1.setOnClickListener(new d());
        this.F1.setOnClickListener(new e());
        RelativeLayout relativeLayout = this.M1;
        if (relativeLayout != null) {
            relativeLayout.setOnClickListener(new f());
        }
        this.f38591a2.setOnClickListener(new g());
        this.J1.setOnClickListener(new h());
        this.K1.setOnClickListener(new i());
    }

    private void S1() {
        RoomPosition p12 = this.Q.getP1();
        if (p12.getUid() == 0) {
            this.R2 = 0;
        } else {
            if (p12.getUid() == this.O.getAccountData().getUid()) {
                this.V2 = 0;
            }
            this.R2 = 1;
        }
        RoomPosition p22 = this.Q.getP2();
        if (p22.getUid() == 0) {
            this.S2 = 0;
        } else {
            if (p22.getUid() == this.O.getAccountData().getUid()) {
                this.V2 = 1;
            }
            this.S2 = 1;
        }
        RoomPosition p32 = this.Q.getP3();
        if (p32.getUid() == 0) {
            this.T2 = 0;
        } else {
            if (p32.getUid() == this.O.getAccountData().getUid()) {
                this.V2 = 2;
            }
            this.T2 = 1;
        }
        RoomPosition p4 = this.Q.getP4();
        if (p4.getUid() == 0) {
            this.U2 = 0;
            return;
        }
        if (p4.getUid() == this.O.getAccountData().getUid()) {
            this.V2 = 3;
        }
        this.U2 = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean T1() {
        if (isFinishing()) {
            return true;
        }
        return Build.VERSION.SDK_INT >= 17 && isDestroyed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void V1() {
        Intent intent = new Intent(this, ArenaService_.class);
        intent.setAction(ArenaConstants.ACTION_LEAVE_ROOM);
        intent.putExtra("gameId", this.Q.getRoomId());
        startService(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void W1(int i4) {
        UserType userType = this.v2;
        if (userType == UserType.OWNER) {
            this.M2 = System.currentTimeMillis();
            n2();
            if (i4 > 0) {
                a2();
            }
        } else if (userType == UserType.TENANT) {
            BTN_STATE btn_state = this.f38610q2;
            if (btn_state == BTN_STATE.BTN_STATE_READY) {
                X1();
            } else if (btn_state == BTN_STATE.BTN_STATE_WAITING_GAME) {
                showToast("等待游戏开始!");
            }
        }
    }

    private void X1() {
        this.f38602k2.f(ArenaRequestFactory.playerReadyGame(ArenaConstants.REGISTER_TYPE_GAMEROOM, this.Q.getRoomId()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f2(String str) {
        if (T1()) {
            return;
        }
        this.D2.w();
        d1 d1Var = this.E2;
        if (d1Var != null && d1Var.isShowing()) {
            try {
                this.E2.dismiss();
            } catch (Exception unused) {
            }
        }
        d1 z4 = b0.f0(this).z(this, str, false);
        this.E2 = z4;
        z4.show();
    }

    private void l2() {
        this.f38611r2 = true;
        this.f38613t2 = 9;
        this.f38614u2.removeMessages(100);
        this.f38614u2.sendEmptyMessageDelayed(100, 1000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m2(BattleServerAddr battleServerAddr) {
        B1();
        if (this.Q.getFastMode()) {
            if (TextUtils.isEmpty(this.Z2)) {
                p2(battleServerAddr, battleServerAddr.getHost());
                return;
            } else {
                p2(battleServerAddr, this.Z2);
                return;
            }
        }
        p2(battleServerAddr, battleServerAddr.getHost());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n2() {
        B1();
        this.P2.start();
        f2("正在启动游戏...");
        this.f38602k2.f(ArenaRequestFactory.startLobbyGame(ArenaConstants.REGISTER_TYPE_GAMEROOM, this.Q.getRoomId()));
    }

    private void r2() {
        this.f38615v1.setVisibility(0);
        this.f38594c2.setVisibility(8);
        if (this.Q != null && this.Q.getElite()) {
            this.f38608p1.setText("等待开始");
        } else if (com.join.mgps.Util.b.piv(AccountUtil_.getInstance_(this).getAccountData())) {
            this.f38608p1.setText("等待开始");
        } else {
            TextView textView = this.f38608p1;
            textView.setText("等待开始，开始后将扣除你" + this.Z + "铜板");
        }
        if (this.Q.getState().equals(RoomState.START)) {
            this.f38610q2 = BTN_STATE.BTN_GOTO_GAME_NOW;
            A1();
            this.f38594c2.setText("(免铜板)");
            this.f38608p1.setText("游戏已开始，请点击观战加入游戏。");
            this.f38594c2.setVisibility(0);
            this.f38593b2.setImageResource(R.drawable.newarena_see);
            this.f38607p0.setText("进入游戏并坐下,即可和其他玩家一起联机对战");
            this.f38615v1.setVisibility(8);
            return;
        }
        if (com.join.mgps.socket.fight.arena.c.n(this.Q)) {
            A1();
            if (this.v2 == UserType.SPECTATOR) {
                this.f38610q2 = BTN_STATE.BTN_STATE_WAITING_GAME;
                this.f38593b2.setImageResource(R.drawable.newarena_whait);
            } else {
                this.f38610q2 = BTN_STATE.BTN_STATE_START_GAME;
                this.f38593b2.setImageResource(R.drawable.newarena_start);
            }
            this.f38607p0.setText("开始游戏后,将扣除您");
        } else if (this.Q.getState().equals(RoomState.WAIT)) {
            UserType userType = this.v2;
            if (userType == UserType.OWNER) {
                A1();
                this.f38610q2 = BTN_STATE.BTN_STATE_WAITING_GAME;
                this.f38608p1.setText("等待玩家准备后开始游戏");
                this.f38593b2.setImageResource(R.drawable.newarena_waitreday);
                this.f38607p0.setText("开始游戏后,将扣除您");
            } else if (userType == UserType.TENANT) {
                if (com.join.mgps.socket.fight.arena.c.h(this.Q, this.O.getAccountData().getUid()).getState() == RoomPosition.State.WAIT) {
                    this.f38610q2 = BTN_STATE.BTN_STATE_READY;
                    if (this.f38611r2) {
                        if (this.Q.getHasJoinPassword()) {
                            A1();
                        }
                    } else if (!this.Q.getHasJoinPassword()) {
                        this.f38608p1.setText("请准备后，等房主开始游戏");
                        this.f38594c2.setText("(倒计时9s)");
                        this.f38594c2.setVisibility(0);
                        this.f38593b2.setImageResource(R.drawable.newarena_reday);
                        l2();
                    } else {
                        A1();
                        this.f38608p1.setText("请准备后，等房主开始游戏");
                        this.f38593b2.setImageResource(R.drawable.newarena_reday);
                        this.f38607p0.setText("开始游戏后,将扣除您");
                    }
                } else {
                    A1();
                    this.f38610q2 = BTN_STATE.BTN_STATE_WAITING_GAME;
                    this.f38593b2.setImageResource(R.drawable.newarena_whait);
                    this.f38607p0.setText("开始游戏后,将扣除您");
                }
            } else {
                A1();
                this.f38610q2 = BTN_STATE.BTN_STATE_WAITING_GAME;
                this.f38593b2.setImageResource(R.drawable.newarena_whait);
                this.f38607p0.setText("开始游戏后,将扣除您");
            }
        } else if (this.Q.getState().equals(RoomState.READY)) {
            if (this.v2 == UserType.OWNER) {
                this.f38610q2 = BTN_STATE.BTN_STATE_START_GAME;
                if (this.f38611r2) {
                    if (this.Q.getHasJoinPassword()) {
                        A1();
                    }
                } else if (!this.Q.getHasJoinPassword()) {
                    this.f38608p1.setText("对方已准备，请开始游戏(9s)");
                    this.f38594c2.setText("(9s)");
                    this.f38594c2.setVisibility(0);
                    this.f38593b2.setImageResource(R.drawable.newarena_start);
                    l2();
                } else {
                    A1();
                    this.f38593b2.setImageResource(R.drawable.newarena_start);
                }
            } else {
                A1();
                this.f38610q2 = BTN_STATE.BTN_STATE_WAITING_GAME;
                this.f38593b2.setImageResource(R.drawable.newarena_whait);
            }
        }
        v0.b("GameRoomActivity", "mBtnState-->" + this.f38610q2);
    }

    static /* synthetic */ int u1(GameRoomActivity gameRoomActivity) {
        int i4 = gameRoomActivity.f38605n2;
        gameRoomActivity.f38605n2 = i4 + 1;
        return i4;
    }

    private void u2() {
        this.f38606o2.removeCallbacks(this.f38609p2);
        if (this.Q.getState() == RoomState.START) {
            int playerSeconds = this.Q.getPlayerSeconds();
            this.f38605n2 = playerSeconds;
            this.E1.setText(y.f(playerSeconds));
            this.f38606o2.postDelayed(this.f38609p2, 1000L);
            return;
        }
        this.E1.setText("等待开始");
    }

    static /* synthetic */ int z1(GameRoomActivity gameRoomActivity) {
        int i4 = gameRoomActivity.f38613t2;
        gameRoomActivity.f38613t2 = i4 - 1;
        return i4;
    }

    void A1() {
        v0.b("GameRoomActivity", "---cancelCountDowner---");
        this.f38613t2 = 0;
        this.f38611r2 = false;
        this.f38614u2.removeMessages(100);
    }

    @Override // com.join.mgps.socket.fight.arena.a.y
    public void C() {
        V1();
        J1();
    }

    public boolean C1(Context context, String str) {
        if (str != null && !"".equals(str)) {
            try {
                context.getPackageManager().getApplicationInfo(str, 8192);
                return true;
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void D1() {
        IntentUtil.getInstance().goLoginBattle(this);
    }

    @Override // com.join.mgps.socket.fight.arena.a.y
    public void E(int i4) {
        this.D2.D(com.join.mgps.socket.fight.arena.a.f54762t, G1(), Integer.valueOf(i4), Long.valueOf(this.Q.getGameId()), Long.valueOf(this.Q.getFightId()));
    }

    @Override // com.join.mgps.socket.fight.arena.a.y
    public void F(ArchiveBean archiveBean, String str) {
        if (this.Q.getState() == RoomState.START) {
            showToast("游戏已经开始，无法设置存档！");
        } else if (this.f38611r2) {
            showToast("房间已经进入倒计时状态，无法再设置网络存档！");
        } else {
            this.N2 = archiveBean;
            this.Q2 = str;
            if (archiveBean != null && !TextUtils.isEmpty(str)) {
                com.join.mgps.dialog.n nVar = this.L2;
                if (nVar != null) {
                    nVar.e(archiveBean.getShowName());
                }
                this.N1.setText(archiveBean.getShowName());
                return;
            }
            com.join.mgps.dialog.n nVar2 = this.L2;
            if (nVar2 != null) {
                nVar2.e("选择");
            }
            this.N1.setText("");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void J1() {
        ClipboardManager clipboardManager = this.O2;
        if (clipboardManager != null) {
            clipboardManager.setText("");
        }
        B1();
        A1();
        Q1();
        com.join.mgps.socket.fight.arena.a aVar = this.D2;
        if (aVar != null) {
            aVar.w();
        }
        this.f38606o2.removeCallbacks(this.f38609p2);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void K1(int i4) {
        String e5 = com.join.mgps.socket.fight.arena.c.e(i4 == 1 ? ArenaConstants.NDS_SERVER_1 : ArenaConstants.NDS_SERVER_2);
        if (TextUtils.isEmpty(e5)) {
            if (i4 == 1) {
                K1(2);
                return;
            }
            return;
        }
        v0.b("GameRoomActivity", "get battle server id for http nds :" + e5);
        this.Z2 = e5;
    }

    @Override // com.join.mgps.socket.fight.arena.a.y
    public void L(RoomSeatState roomSeatState, int i4) {
        if (roomSeatState == RoomSeatState.OPEN) {
            if (this.Q.getState() == RoomState.START) {
                showToast("游戏已经开始，无法开启座位!");
            } else {
                this.f38602k2.f(ArenaRequestFactory.openSit(ArenaConstants.REGISTER_TYPE_GAMEROOM, this.Q.getRoomId(), i4));
            }
        } else if (roomSeatState == RoomSeatState.CLOSE) {
            if (this.Q.getState() == RoomState.START) {
                showToast("游戏已经开始，无法关闭座位!");
            } else {
                this.f38602k2.f(ArenaRequestFactory.closeSit(ArenaConstants.REGISTER_TYPE_GAMEROOM, this.Q.getRoomId(), i4));
            }
        } else if (roomSeatState == RoomSeatState.REMOVE) {
            if (this.Q.getState() == RoomState.START) {
                showToast("游戏已经开始，无法踢人!");
            } else {
                this.f38602k2.f(ArenaRequestFactory.kickOutRoomPosition(ArenaConstants.REGISTER_TYPE_GAMEROOM, this.Q.getRoomId(), i4));
            }
        } else if (roomSeatState == RoomSeatState.SEAT) {
            if (this.Q.getState() == RoomState.START) {
                showToast("游戏已经开始，你无法坐下！");
            } else {
                this.f38602k2.f(ArenaRequestFactory.spectatorSit(ArenaConstants.REGISTER_TYPE_GAMEROOM, this.Q.getRoomId(), i4));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void L1() {
        try {
            ResultArenaBean<BattleChallengeConfig> E = this.K2.E(this.O.getAccountData().getUid(), this.O.getAccountData().getToken(), this.Q.getGameId());
            Q1();
            if (E != null && E.getData() != null) {
                this.N = E.getData();
                i2();
            } else if (E != null && E.getError() == 701) {
                D1();
            } else {
                showToast("获取配置信息失败，请重试！");
            }
        } catch (Exception unused) {
            Q1();
            if (!com.join.android.app.common.utils.j.j(this)) {
                showToast("当前网络不可用，请检查网络!");
                J1();
                return;
            }
            showToast("获取配置信息失败，请重试！");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void M1(String str) {
        try {
            String token = this.O.getAccountData().getToken();
            ResultArenaBean<ArenaLobbyServer> P = this.Y2.P(this.O.getAccountData().getUid(), token);
            if (P != null) {
                if (P.getError() == 0) {
                    if (P.getData() != null) {
                        int startGameCopper = P.getData().getStartGameCopper();
                        this.Z = startGameCopper;
                        if (startGameCopper == 0) {
                            this.Z = 20;
                        }
                        s2();
                    }
                } else if (P.getError() == 701) {
                    showToast("你的手机登陆已经失效，请重新登陆!");
                }
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        try {
            List<ArenaGameInfo> data = this.Y2.r(str).getData();
            for (int i4 = 0; i4 < data.size(); i4++) {
                ArenaGameInfo arenaGameInfo = data.get(i4);
                e2.l(this, arenaGameInfo.getId(), arenaGameInfo);
            }
            this.W2 = (ArenaGameInfo) e2.b(this, this.Q.getGameId() + "");
        } catch (Exception e6) {
            e6.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void N1() {
        if (T1()) {
            return;
        }
        Q1();
        showToast("获取服务器ip失败");
        J1();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void O1(ArenaResponse arenaResponse) {
        d1 d1Var = this.E2;
        if (d1Var != null && d1Var.isShowing()) {
            try {
                this.E2.dismiss();
            } catch (Exception unused) {
            }
        }
        if (arenaResponse.responseType.equals(ArenaConstants.ArenaCommand.CMD_LOBBY_START_GAME) || arenaResponse.responseType.equals(ArenaConstants.ArenaCommand.PUSH_START_GAME_ROOM_BROADCAST)) {
            B1();
        }
        if (arenaResponse.responseType.equals(ArenaConstants.ArenaCommand.CMD_SET_ROOM_SERVER_PLAY_MODE)) {
            showToast("流畅模式设置失败");
            Z1();
        }
        int i4 = arenaResponse.errorType;
        if (i4 == 12) {
            this.D2.D(com.join.mgps.socket.fight.arena.a.f54752j, 257, Integer.valueOf(arenaResponse.errorType), "铜板不足，无法设置挑战金", "确定");
        } else if (i4 != 14) {
            showToast(com.join.mgps.socket.fight.arena.c.g(arenaResponse));
        } else {
            this.D2.D(com.join.mgps.socket.fight.arena.a.f54752j, 257, Integer.valueOf(arenaResponse.errorType), "该房间已经解散", "确定");
            this.D2.x().setOnDismissListener(new s());
        }
    }

    @Override // com.join.mgps.socket.fight.arena.a.y
    public void P(RoomPosition roomPosition, int i4) {
        if (roomPosition.getVip()) {
            showToast("由于对方是悟饭VIP您无法将其踢出房间");
        } else if (roomPosition.getUid() == Integer.parseInt(this.O.getUid()) || this.v2 != UserType.OWNER || this.Q.getState() == RoomState.START) {
        } else {
            this.B2 = i4;
            this.f38602k2.f(ArenaRequestFactory.getKickOutRoomPositionInfo(ArenaConstants.REGISTER_TYPE_GAMEROOM, this.Q.getRoomId(), i4));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void P1(KickInfo kickInfo) {
        this.D2.D(com.join.mgps.socket.fight.arena.a.f54758p, kickInfo, Integer.valueOf(this.B2));
    }

    @Override // com.join.mgps.socket.fight.arena.a.y
    public void Q(RoomPosition roomPosition) {
        if (roomPosition.getUid() != Integer.parseInt(this.O.getUid())) {
            IntentDateBean intentDateBean = new IntentDateBean();
            intentDateBean.setLink_type(4);
            intentDateBean.setLink_type_val(com.join.mgps.rpc.h.f54086t + "report_uid=" + this.O.getUid() + "&reported_uid=" + roomPosition.getUid());
            ShareWebActivity_.t2(this).b(intentDateBean).start();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void Q1() {
        d1 d1Var = this.E2;
        if (d1Var == null || !d1Var.isShowing()) {
            return;
        }
        try {
            this.E2.dismiss();
        } catch (Exception unused) {
        }
    }

    boolean U1(RoomPosition roomPosition, int i4) {
        return roomPosition != null && roomPosition.getUid() == i4;
    }

    @Override // com.join.mgps.socket.fight.arena.a.y
    public void W(int i4, int i5, Object obj) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void Y1(GameRoom gameRoom) {
        com.join.mgps.socket.fight.arena.c.q("GameRoomActivity", gameRoom);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void Z1() {
        if (this.V1.isChecked()) {
            b2(0);
        } else {
            b2(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background(delay = 3000)
    public void a2() {
        sendBroadcast(new Intent("com.show.realname.check"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterViews() {
        setSystemUiHide(true);
        this.X2 = com.join.mgps.rpc.impl.l.n0();
        this.Y2 = com.join.mgps.rpc.impl.k.n0();
        this.f38608p1.setText("等待开始，开始后将扣除你10铜板");
        if (!com.join.android.app.common.utils.j.j(this)) {
            showToast("当前网络不可用!");
            J1();
        }
        if (Build.VERSION.SDK_INT >= 28) {
            WindowManager.LayoutParams attributes = getWindow().getAttributes();
            attributes.layoutInDisplayCutoutMode = 1;
            getWindow().setAttributes(attributes);
        }
        this.K2 = com.join.mgps.rpc.impl.l.n0();
        if (this.Q.getFastMode()) {
            K1(1);
        }
        if (this.Q.getElite()) {
            this.A1.setVisibility(4);
        }
        if (com.join.mgps.Util.b.piv(AccountUtil_.getInstance_(this).getAccountData())) {
            this.A1.setVisibility(4);
        }
        boolean openFastModeBtn = this.Q.getOpenFastModeBtn();
        this.H2 = openFastModeBtn;
        if (openFastModeBtn) {
            this.U1.setVisibility(0);
        }
        if (this.Q.getBattleArea() == BattleArea.ALL) {
            b2(1);
        } else {
            b2(0);
        }
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{Color.parseColor("#f47500"), Color.parseColor("#f47500"), Color.parseColor("#f47500"), Color.parseColor("#f47500")});
        gradientDrawable.setCornerRadius(8.0f);
        GradientDrawable gradientDrawable2 = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{Color.parseColor("#FF8C00"), Color.parseColor("#FF8C00"), Color.parseColor("#FF8C00"), Color.parseColor("#FF8C00")});
        gradientDrawable2.setCornerRadius(8.0f);
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842919}, gradientDrawable2);
        stateListDrawable.addState(new int[0], gradientDrawable);
        this.F2 = stateListDrawable;
        GradientDrawable gradientDrawable3 = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{Color.parseColor("#F47500"), Color.parseColor("#F47500"), Color.parseColor("#F47500")});
        gradientDrawable.setCornerRadius(8.0f);
        this.G2 = gradientDrawable3;
        this.C1.setText(this.S);
        PlayerInfoContainerView playerInfoContainerView = (PlayerInfoContainerView) findViewById(R.id.mPlayerInfoContainerView);
        this.Z1 = playerInfoContainerView;
        playerInfoContainerView.setPlayerInfoCallback(this.C2);
        this.D2 = new com.join.mgps.socket.fight.arena.a(this, this);
        R1();
        M1("" + this.Q.getGameId());
        v2(this.Q);
        if (this.Q != null && this.Q.getRoomId() != 0) {
            com.wufan.friend.chat.c.u().i(0, this.Q.getRoomId());
        }
        com.join.mgps.socket.fight.arena.b bVar = new com.join.mgps.socket.fight.arena.b(this, this.f38603l2);
        this.f38602k2 = bVar;
        bVar.bindService();
        Y1(this.Q);
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        this.I2 = supportFragmentManager;
        try {
            supportFragmentManager.beginTransaction().commit();
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        float j4 = com.join.android.app.common.utils.n.n(this).j(this);
        if (j4 > 1.9d) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.Z1.getLayoutParams();
            layoutParams.rightMargin = getResources().getDimensionPixelOffset(R.dimen.wdp69);
            layoutParams.leftMargin = getResources().getDimensionPixelOffset(R.dimen.wdp65);
            this.Z1.setLayoutParams(layoutParams);
            return;
        }
        float f5 = (j4 * 9.0f) / 16.0f;
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.Z1.getLayoutParams();
        layoutParams2.rightMargin = (int) (getResources().getDimensionPixelOffset(R.dimen.wdp43) * f5);
        layoutParams2.leftMargin = (int) (getResources().getDimensionPixelOffset(R.dimen.wdp43) * f5);
        this.Z1.setLayoutParams(layoutParams2);
    }

    @Override // com.join.mgps.socket.fight.arena.a.y
    public void b0(int i4, String str) {
        if (i4 == 1) {
            o2();
        } else if (i4 != 2) {
        } else {
            F1(str);
            d2();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void b2(int i4) {
        this.W1.clearCheck();
        if (i4 == 1) {
            this.V1.setChecked(true);
        } else {
            this.V1.setChecked(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void c2() {
        Platform.ShareParams shareParams = new Platform.ShareParams();
        shareParams.setShareType(1);
        shareParams.setText(G1());
        Platform platform = ShareSDK.getPlatform(QQ.NAME);
        platform.setPlatformActionListener(new l());
        platform.share(shareParams);
    }

    void d2() {
        try {
            H1("com.tencent.mm");
        } catch (Exception unused) {
            showToast("请先安装微信");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void e2(String str) {
        this.f38600i2 = true;
        b0.f0(this).o(this, new o());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void g2() {
        com.join.mgps.socket.fight.arena.a aVar = this.D2;
        if (aVar != null) {
            aVar.w();
        }
        this.D2.D(com.join.mgps.socket.fight.arena.a.f54755m, "对不起，您长时间未开始游戏，您已被踢出房间!");
    }

    void h2() {
        if (this.L2 == null) {
            this.L2 = new com.join.mgps.dialog.n(this);
        }
        this.L2.f(this.Q, new j());
        if (this.L2.isShowing()) {
            return;
        }
        this.L2.show();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void i2() {
        if (this.N.getIsBattle()) {
            this.D2.D(com.join.mgps.socket.fight.arena.a.f54760r, this.N, Integer.valueOf(this.Q.getChallengeCoins()));
        } else {
            this.D2.D(com.join.mgps.socket.fight.arena.a.f54760r, this.N, this.S);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void iv_back() {
        if (this.f38600i2 && !com.join.android.app.common.utils.j.j(this)) {
            J1();
        } else {
            C();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void j2() {
        this.D2.D(com.join.mgps.socket.fight.arena.a.f54752j, 257, 8, "你在2分钟内无开始，房间已被解散！", "确定");
        this.D2.x().setOnDismissListener(new q());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void k2() {
        boolean isChecked = this.V1.isChecked();
        com.join.mgps.socket.fight.arena.a aVar = this.D2;
        if (aVar != null) {
            aVar.w();
        }
        this.D2.D(com.join.mgps.socket.fight.arena.a.f54763u, Integer.valueOf(isChecked ? 1 : 0));
    }

    @Override // com.join.mgps.activity.FriendActivity, com.join.mgps.adapter.FriendListAdapter.b
    public void n(FriendBean friendBean) {
        GameRoom gameRoom = this.Q;
        if (gameRoom == null) {
            return;
        }
        if (!U1(gameRoom.getP1(), friendBean.getUid()) && !U1(gameRoom.getP2(), friendBean.getUid()) && !U1(gameRoom.getP3(), friendBean.getUid()) && !U1(gameRoom.getP4(), friendBean.getUid())) {
            UtilsMy.z0(this, 3, this.f31375i, "FIGHT_LOBBY", new n(friendBean, gameRoom));
        } else {
            l2.a(this).b("用户已加入房间");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void o2() {
        if (C1(this, "com.tencent.mobileqq")) {
            q2(this);
        } else {
            Toast.makeText(this, "本机未安装QQ应用", 0).show();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.join.mgps.activity.FriendActivity, com.BaseActivity, com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f31376j = "BATTLE_ROOM";
        if (this.Q != null) {
            this.f31375i = this.Q.getGameId() + "";
        }
        this.f38601j2 = this;
        UtilsMy.z0(this, 4, this.f31375i, "FIGHT_LOBBY", new k());
        super.onCreate(bundle);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.join.mgps.activity.FriendActivity, com.BaseActivity, com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        com.join.mgps.socket.fight.arena.b bVar = this.f38602k2;
        if (bVar != null) {
            if (bVar.d() != null) {
                v0.b("GameRoomActivity", "--onStop---removeObserver---");
                this.f38602k2.d().A(this.f38604m2);
            }
            this.f38602k2.g();
        }
        this.y2 = false;
        super.onDestroy();
        E1();
        v0.b("GameRoomActivity", "--onDestroy---");
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onFriendEvent(com.join.mgps.event.q qVar) {
        if (qVar == null || qVar.a() != 3 || this.Q == null || qVar.g() == this.Q.getRoomId()) {
            return;
        }
        finish();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i4, KeyEvent keyEvent) {
        if (i4 == 4 && keyEvent.getAction() == 0) {
            if (this.f38600i2 && !com.join.android.app.common.utils.j.j(this)) {
                J1();
                return true;
            }
            C();
            return true;
        }
        return super.onKeyDown(i4, keyEvent);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.join.mgps.activity.FriendActivity, com.BaseActivity, com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        com.join.mgps.socket.fight.arena.b bVar = this.f38602k2;
        if (bVar == null || bVar.d() == null) {
            return;
        }
        v0.b("GameRoomActivity", "--onResume---registerObserver---");
        this.f38602k2.d().z(this.f38604m2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void p2(BattleServerAddr battleServerAddr, String str) {
        S1();
        int i4 = this.R2 + this.S2 + this.T2 + this.U2;
        NetBattleStartGameDto netBattleStartGameDto = new NetBattleStartGameDto();
        netBattleStartGameDto.setGameID(this.Q.getGameId() + "");
        netBattleStartGameDto.setRoomID(battleServerAddr.getBattleRoomId() + "");
        netBattleStartGameDto.setUserID(this.O.getAccountData().getUid() + "");
        netBattleStartGameDto.setServerIP(str);
        netBattleStartGameDto.setServerPort(battleServerAddr.getPort());
        int i5 = this.P;
        if (i5 == 2) {
            netBattleStartGameDto.setRoomMode(3);
        } else if (i5 == 1) {
            netBattleStartGameDto.setRoomMode(2);
        } else {
            netBattleStartGameDto.setRoomMode(this.Q.getElite() ? 1 : 0);
        }
        netBattleStartGameDto.setAllowPeripheralJoin(this.f38598g2);
        netBattleStartGameDto.setAllowPCJoin(this.f38599h2);
        netBattleStartGameDto.setGameype(this.Q.getGameType().getNumber());
        netBattleStartGameDto.setGroupId(this.Q.getRoomId());
        netBattleStartGameDto.setP1Name("");
        netBattleStartGameDto.setP2Name("");
        netBattleStartGameDto.setOldGame(0);
        netBattleStartGameDto.setUserName(this.O.getAccountData().getNickname());
        netBattleStartGameDto.setUserIcon(this.O.getAccountData().d0());
        netBattleStartGameDto.setGamePlayers(this.Q.getSeatsNumber());
        netBattleStartGameDto.setTcptype(1);
        netBattleStartGameDto.setPorder(this.V2);
        netBattleStartGameDto.setNetPlayers(i4);
        if (!this.Q.getElite()) {
            netBattleStartGameDto.setOpenBattleScore(this.Q.getOpenBattleScore());
        }
        ArenaGameInfo arenaGameInfo = this.W2;
        if (arenaGameInfo != null) {
            netBattleStartGameDto.setResult_show_type(arenaGameInfo.getResult_show_type());
        }
        v0.b("GameRoomActivity", "start game params :" + netBattleStartGameDto.toString());
        p1.f K = p1.f.K();
        UtilsMy.P3(this, netBattleStartGameDto, K.F(this.Q.getGameId() + ""), this.Q2, com.join.mgps.socket.fight.arena.c.i(this.Q.getBattleArea(), this.T));
        J1();
    }

    @Override // com.join.mgps.socket.fight.arena.a.y
    public void q() {
        finish();
    }

    void q2(Context context) {
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.TEXT", G1());
        intent.setType(HttpPostBodyUtil.DEFAULT_TEXT_CONTENT_TYPE);
        try {
            intent.setClassName("com.tencent.mobileqq", "com.tencent.mobileqq.activity.JumpActivity");
            Intent createChooser = Intent.createChooser(intent, "选择分享途径");
            if (createChooser == null) {
                return;
            }
            context.startActivity(createChooser);
        } catch (Exception unused) {
            context.startActivity(intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void s2() {
        TextView textView = this.f38615v1;
        textView.setText(this.Z + "铜板");
        if (this.Q != null && this.Q.getElite()) {
            this.f38608p1.setText("等待开始");
        } else if (com.join.mgps.Util.b.piv(AccountUtil_.getInstance_(this).getAccountData())) {
            this.f38608p1.setText("等待开始");
        } else {
            TextView textView2 = this.f38608p1;
            textView2.setText("等待开始，开始后将扣除你" + this.Z + "铜板");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showToast(String str) {
        if (T1()) {
            return;
        }
        l2.a(this).b(str);
    }

    @Override // com.join.mgps.socket.fight.arena.a.y
    public void t(int i4) {
        if (com.join.mgps.socket.fight.arena.c.a(this.Q, this.O)) {
            showToast("已有玩家进入，无法再设置挑战金!");
        } else if (this.f38611r2) {
            showToast("房间已经进入倒计时状态，无法再设置挑战金！");
        } else if (this.Q.getState() == RoomState.START) {
            showToast("游戏已经开始，无法设置挑战金！");
        } else if (this.Q.getChallengeCoins() == i4) {
        } else {
            this.f38602k2.f(ArenaRequestFactory.setChallengeGolden(ArenaConstants.REGISTER_TYPE_GAMEROOM, this.Q.getRoomId(), i4));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void t2() {
        ArenaResponse o4 = this.f38602k2.d().o(this.Q.getRoomId());
        if (o4 != null) {
            Object obj = o4.data;
            if (obj instanceof GameRoom) {
                GameRoom gameRoom = (GameRoom) obj;
                v0.b("GameRoomActivity", "gameRoom:aaa game id  --...:" + gameRoom.getRoomId() + "----gameRoom  game room id : bbb:" + this.Q.getRoomId());
                if (gameRoom.getRoomId() == this.Q.getRoomId()) {
                    v0.b("GameRoomActivity", "updateGameRoomAsync---...");
                    this.f38604m2.onServerResponse(o4);
                    return;
                }
                return;
            }
            return;
        }
        v0.b("GameRoomActivity", "updateGameRoomAsync--- response is null...");
    }

    @Override // com.join.mgps.socket.fight.arena.a.y
    public void v(int i4) {
        this.f38602k2.f(ArenaRequestFactory.setRoomServerPlayMode(i4, this.Q.getRoomId()));
        b2(i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:56:0x023e A[Catch: all -> 0x030a, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x000f, B:8:0x0011, B:10:0x0017, B:11:0x001f, B:13:0x0021, B:15:0x0053, B:17:0x0094, B:19:0x00a6, B:21:0x00b5, B:23:0x00c1, B:25:0x0109, B:27:0x0112, B:29:0x0137, B:31:0x013f, B:33:0x0152, B:35:0x0158, B:37:0x0163, B:39:0x016a, B:42:0x0170, B:44:0x019f, B:45:0x01bf, B:47:0x01c7, B:52:0x01f0, B:54:0x023a, B:56:0x023e, B:58:0x024d, B:59:0x0252, B:61:0x025a, B:63:0x0261, B:65:0x026f, B:67:0x0292, B:68:0x0298, B:71:0x02a2, B:73:0x02c3, B:74:0x02c9, B:85:0x0302, B:86:0x0308, B:62:0x025e, B:75:0x02cf, B:77:0x02d3, B:79:0x02d7, B:80:0x02db, B:82:0x02e3, B:83:0x02e9, B:84:0x02ee, B:48:0x01d3, B:50:0x01e1, B:51:0x01e9, B:53:0x0200, B:36:0x015e, B:32:0x0149, B:28:0x0125, B:24:0x00f8, B:20:0x00ae, B:16:0x0074), top: B:91:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x02cf A[Catch: all -> 0x030a, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x000f, B:8:0x0011, B:10:0x0017, B:11:0x001f, B:13:0x0021, B:15:0x0053, B:17:0x0094, B:19:0x00a6, B:21:0x00b5, B:23:0x00c1, B:25:0x0109, B:27:0x0112, B:29:0x0137, B:31:0x013f, B:33:0x0152, B:35:0x0158, B:37:0x0163, B:39:0x016a, B:42:0x0170, B:44:0x019f, B:45:0x01bf, B:47:0x01c7, B:52:0x01f0, B:54:0x023a, B:56:0x023e, B:58:0x024d, B:59:0x0252, B:61:0x025a, B:63:0x0261, B:65:0x026f, B:67:0x0292, B:68:0x0298, B:71:0x02a2, B:73:0x02c3, B:74:0x02c9, B:85:0x0302, B:86:0x0308, B:62:0x025e, B:75:0x02cf, B:77:0x02d3, B:79:0x02d7, B:80:0x02db, B:82:0x02e3, B:83:0x02e9, B:84:0x02ee, B:48:0x01d3, B:50:0x01e1, B:51:0x01e9, B:53:0x0200, B:36:0x015e, B:32:0x0149, B:28:0x0125, B:24:0x00f8, B:20:0x00ae, B:16:0x0074), top: B:91:0x0003 }] */
    @org.androidannotations.annotations.UiThread
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void v2(com.papa91.battle.protocol.GameRoom r11) {
        /*
            Method dump skipped, instructions count: 781
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.mgps.activity.arena.GameRoomActivity.v2(com.papa91.battle.protocol.GameRoom):void");
    }

    @Override // com.join.mgps.socket.fight.arena.a.y
    public void z(String str) {
        if (!str.equals(com.join.mgps.socket.fight.arena.a.f54757o) && !str.equals(com.join.mgps.socket.fight.arena.a.f54755m)) {
            if (str.equals(com.join.mgps.socket.fight.arena.a.f54754l)) {
                this.y2 = false;
                return;
            }
            return;
        }
        J1();
    }
}
