package com.join.mgps.activity.arena;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import app.mgsim.arena.ArenaConstants;
import app.mgsim.arena.ArenaLobbyServer;
import app.mgsim.arena.ArenaRequest;
import app.mgsim.arena.ArenaRequestFactory;
import app.mgsim.arena.ArenaResponse;
import app.mgsim.arena.SocketError;
import app.mgsim.arena.SocketListener;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.android.app.common.utils.JsonMapper;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.IntentDateBean;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.Util.RequestBeanUtil;
import com.join.mgps.Util.b0;
import com.join.mgps.Util.c0;
import com.join.mgps.Util.g2;
import com.join.mgps.Util.h1;
import com.join.mgps.Util.l2;
import com.join.mgps.Util.t2;
import com.join.mgps.Util.v0;
import com.join.mgps.Util.w0;
import com.join.mgps.activity.FriendActivity;
import com.join.mgps.activity.NewArenaMainActivty_;
import com.join.mgps.adapter.GameInfoAdapterV2;
import com.join.mgps.customview.AlwaysMarqueeTextView;
import com.join.mgps.customview.y;
import com.join.mgps.dialog.PlugInstallDialog_;
import com.join.mgps.dialog.d1;
import com.join.mgps.dialog.n0;
import com.join.mgps.dto.ArenaAdData;
import com.join.mgps.dto.ArenaGameRoomListConfig;
import com.join.mgps.dto.ArenaPopupInfoBean;
import com.join.mgps.dto.ArenaPopupInfoShareBean;
import com.join.mgps.dto.BattleChallengeConfig;
import com.join.mgps.dto.CollectionCommentRequest;
import com.join.mgps.dto.FriendBean;
import com.join.mgps.dto.GameConfig;
import com.join.mgps.dto.GameInfoBean;
import com.join.mgps.dto.GameListBannerBean;
import com.join.mgps.dto.ResultArenaBean;
import com.join.mgps.dto.ResultMainBean;
import com.join.mgps.dto.ResultResMainBean;
import com.join.mgps.fragment.FriendFragment;
import com.join.mgps.fragment.roomlist.RaceRoomFragment_;
import com.join.mgps.fragment.roomlist.StandardEliteRoomFragment;
import com.join.mgps.fragment.roomlist.StandardEliteRoomFragment_;
import com.join.mgps.pref.PrefDef_;
import com.join.mgps.socket.fight.arena.ArenaService_;
import com.join.mgps.socket.fight.arena.a;
import com.join.mgps.socket.fight.arena.b;
import com.papa.sim.statistic.Event;
import com.papa.sim.statistic.Ext;
import com.papa91.battle.protocol.AreaOnlinePeopleCount;
import com.papa91.battle.protocol.BattleArea;
import com.papa91.battle.protocol.GameRoom;
import com.papa91.battle.protocol.Notification;
import com.papa91.battle.protocol.RoomCategory;
import com.papa91.battle.protocol.RoomCounter;
import com.papa91.battle.protocol.RoomState;
import com.papa91.battle.protocol.SimpleRoom;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.Bean;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.Extra;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
import org.androidannotations.annotations.sharedpreferences.Pref;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
@EActivity(R.layout.activity_game_room_list)
/* loaded from: classes4.dex */
public class GameRoomListActivity extends FriendActivity {
    private static final String Y2 = "GameRoomListActivity";
    private static final int Z2 = 1;

    /* renamed from: a3  reason: collision with root package name */
    private static final int f38699a3 = 2;

    /* renamed from: b3  reason: collision with root package name */
    private static final int f38700b3 = 3;

    /* renamed from: c3  reason: collision with root package name */
    private static boolean f38701c3 = false;

    /* renamed from: d3  reason: collision with root package name */
    private static final int f38702d3 = Color.parseColor("#ffffff");

    /* renamed from: e3  reason: collision with root package name */
    private static final int f38703e3 = Color.parseColor("#ffffff");

    /* renamed from: f3  reason: collision with root package name */
    private static final int f38704f3 = 1;

    /* renamed from: g3  reason: collision with root package name */
    private static final int f38705g3 = 1000;
    @ViewById
    ProgressBar A1;
    private d1 A2;
    @ViewById
    LinearLayout B1;
    @ViewById
    ImageView B2;
    @ViewById
    ImageView C1;
    @ViewById
    ImageView C2;
    @ViewById
    View D1;
    @ViewById
    LinearLayout D2;
    @Extra
    boolean E1;
    @ViewById
    AlwaysMarqueeTextView F1;
    @Bean
    com.join.mgps.Util.b F2;
    @ViewById
    ViewPager G1;
    com.join.mgps.rpc.e G2;
    @Pref
    PrefDef_ H1;
    GameConfig I1;
    private BattleChallengeConfig I2;
    com.join.mgps.rpc.l J2;
    t2.a K2;
    private int L2;
    private com.join.mgps.socket.fight.arena.b M1;
    @ViewById
    RecyclerView M2;
    @Extra
    GameInfoBean N;
    private BattleArea N1;
    @ViewById
    RecyclerView N2;
    @Extra
    boolean O;
    @ViewById
    View O2;
    @ViewById
    TextView P;
    Context P2;
    @ViewById
    TextView Q;
    z Q2;
    @ViewById
    View R;
    int R1;
    GameInfoAdapterV2 R2;
    @ViewById
    LinearLayout S;
    List<GameInfoBean> S2;
    @ViewById
    LinearLayout T;
    @ViewById
    TextView U;
    @ViewById
    TextView V;
    FriendBean V2;
    @ViewById
    LinearLayout W;
    @ViewById
    RelativeLayout W1;
    Dialog W2;
    @ViewById
    TextView X;
    @ViewById
    LinearLayout X1;
    @ViewById
    TextView Y;
    @ViewById
    LinearLayout Z;

    /* renamed from: d2  reason: collision with root package name */
    private com.join.mgps.socket.fight.arena.a f38709d2;

    /* renamed from: e2  reason: collision with root package name */
    private FragmentManager f38710e2;
    @ViewById

    /* renamed from: f2  reason: collision with root package name */
    LinearLayout f38711f2;
    @ViewById

    /* renamed from: g2  reason: collision with root package name */
    ImageView f38712g2;

    /* renamed from: h2  reason: collision with root package name */
    private com.join.mgps.customview.y f38713h2;

    /* renamed from: j2  reason: collision with root package name */
    private BattleArea f38715j2;

    /* renamed from: l2  reason: collision with root package name */
    private ArenaGameRoomListConfig f38717l2;

    /* renamed from: n2  reason: collision with root package name */
    x f38719n2;
    @ViewById

    /* renamed from: o2  reason: collision with root package name */
    LinearLayout f38720o2;
    @ViewById

    /* renamed from: p0  reason: collision with root package name */
    TextView f38721p0;
    @ViewById

    /* renamed from: p1  reason: collision with root package name */
    TextView f38722p1;
    @ViewById

    /* renamed from: p2  reason: collision with root package name */
    LinearLayout f38723p2;

    /* renamed from: r2  reason: collision with root package name */
    private Dialog f38725r2;

    /* renamed from: s2  reason: collision with root package name */
    private TextView f38726s2;

    /* renamed from: t2  reason: collision with root package name */
    private Animation f38727t2;
    @ViewById

    /* renamed from: v1  reason: collision with root package name */
    TextView f38729v1;
    private GameRoom v2;

    /* renamed from: w2  reason: collision with root package name */
    private String f38730w2;

    /* renamed from: x2  reason: collision with root package name */
    private String f38731x2;
    private StandardEliteRoomFragment_ J1 = null;
    private StandardEliteRoomFragment_ K1 = null;
    private RaceRoomFragment_ L1 = null;
    private final b.InterfaceC0385b O1 = new k();
    private volatile boolean P1 = false;
    private volatile boolean Q1 = false;
    private final SocketListener.NotifyObserver S1 = new o();
    private volatile boolean T1 = false;
    private volatile boolean U1 = false;
    private final Object V1 = new Object();
    int Y1 = 0;
    HashMap<String, Integer> Z1 = new HashMap<>();

    /* renamed from: a2  reason: collision with root package name */
    LinkedHashMap<String, SimpleRoom> f38706a2 = new LinkedHashMap<>();

    /* renamed from: b2  reason: collision with root package name */
    private boolean f38707b2 = false;

    /* renamed from: c2  reason: collision with root package name */
    private boolean f38708c2 = false;

    /* renamed from: i2  reason: collision with root package name */
    boolean f38714i2 = false;

    /* renamed from: k2  reason: collision with root package name */
    private final y.e f38716k2 = new v();

    /* renamed from: m2  reason: collision with root package name */
    boolean f38718m2 = true;

    /* renamed from: q2  reason: collision with root package name */
    boolean f38724q2 = false;

    /* renamed from: u2  reason: collision with root package name */
    private int f38728u2 = 3;
    private Handler y2 = new d();

    /* renamed from: z2  reason: collision with root package name */
    private final StandardEliteRoomFragment.n f38732z2 = new e();
    long E2 = 0;
    private CountDownTimer H2 = new f(com.join.mgps.data.c.f49010a, 1000);
    List<GameInfoBean> T2 = new ArrayList();
    private int U2 = -1024;
    Handler X2 = new Handler(new m());

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GameRoomListActivity.this.finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GameRoomListActivity gameRoomListActivity = GameRoomListActivity.this;
            gameRoomListActivity.g3(gameRoomListActivity.W1);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class c implements ViewPager.OnPageChangeListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ArenaGameRoomListConfig f38735b;

        c(ArenaGameRoomListConfig arenaGameRoomListConfig) {
            this.f38735b = arenaGameRoomListConfig;
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i4) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i4, float f5, int i5) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i4) {
            GameRoomListActivity gameRoomListActivity = GameRoomListActivity.this;
            gameRoomListActivity.I2("addOnPageChangeListener onPageSelected position:" + i4);
            if (i4 == 0) {
                GameRoomListActivity.this.T.setBackgroundResource(R.drawable.bg_gamelist_tab_pressed);
                GameRoomListActivity.this.W.setBackgroundResource(R.drawable.bg_gamelist_tab_normal);
                GameRoomListActivity.this.Z.setBackgroundResource(R.drawable.bg_gamelist_tab_normal);
                GameRoomListActivity.this.a3(true);
                GameRoomListActivity.this.B2.setVisibility(0);
                GameRoomListActivity.this.S.setVisibility(0);
                GameRoomListActivity.this.V.setTextColor(GameRoomListActivity.f38703e3);
                GameRoomListActivity.this.U.setTextColor(GameRoomListActivity.f38703e3);
                GameRoomListActivity.this.X.setTextColor(GameRoomListActivity.f38702d3);
                GameRoomListActivity.this.Y.setTextColor(GameRoomListActivity.f38702d3);
                GameRoomListActivity.this.f38721p0.setTextColor(GameRoomListActivity.f38702d3);
                GameRoomListActivity.this.f38722p1.setTextColor(GameRoomListActivity.f38702d3);
                if (!GameRoomListActivity.this.f38707b2) {
                    if (com.join.android.app.common.utils.j.j(GameRoomListActivity.this)) {
                        if (!GameRoomListActivity.this.M1.e()) {
                            GameRoomListActivity.this.M1.bindService();
                        } else {
                            GameRoomListActivity.this.t2();
                        }
                        GameRoomListActivity.this.d3();
                    } else {
                        GameRoomListActivity.this.showToast("当前网络不可用，请检查网络!");
                        GameRoomListActivity.this.Y2();
                    }
                }
            } else if (i4 == 1) {
                ((StandardEliteRoomFragment) GameRoomListActivity.this.f38719n2.getItem(0)).c1();
                GameRoomListActivity.this.a3(true);
                GameRoomListActivity.this.B2.setVisibility(8);
                GameRoomListActivity.this.T.setBackgroundResource(R.drawable.bg_gamelist_tab_normal);
                GameRoomListActivity.this.V.setTextColor(GameRoomListActivity.f38702d3);
                GameRoomListActivity.this.U.setTextColor(GameRoomListActivity.f38702d3);
                if (this.f38735b.getCurrent_collection_cfg().getElite_match_switch() == 1) {
                    GameRoomListActivity.this.S.setVisibility(0);
                    GameRoomListActivity.this.Z.setBackgroundResource(R.drawable.bg_gamelist_tab_normal);
                    GameRoomListActivity.this.W.setBackgroundResource(R.drawable.bg_gamelist_tab_pressed);
                    GameRoomListActivity.this.X.setTextColor(GameRoomListActivity.f38703e3);
                    GameRoomListActivity.this.Y.setTextColor(GameRoomListActivity.f38703e3);
                    GameRoomListActivity.this.f38722p1.setTextColor(GameRoomListActivity.f38702d3);
                    GameRoomListActivity.this.f38721p0.setTextColor(GameRoomListActivity.f38702d3);
                    if (!GameRoomListActivity.this.f38708c2) {
                        if (com.join.android.app.common.utils.j.j(GameRoomListActivity.this)) {
                            if (!GameRoomListActivity.this.M1.e()) {
                                GameRoomListActivity.this.M1.bindService();
                            } else {
                                GameRoomListActivity.this.t2();
                            }
                            GameRoomListActivity.this.d3();
                        } else {
                            GameRoomListActivity.this.showToast("当前网络不可用，请检查网络!");
                            GameRoomListActivity.this.Y2();
                        }
                    }
                } else {
                    GameRoomListActivity.this.S.setVisibility(8);
                    GameRoomListActivity.this.Z.setBackgroundResource(R.drawable.bg_gamelist_tab_pressed);
                    GameRoomListActivity.this.W.setBackgroundResource(R.drawable.bg_gamelist_tab_normal);
                    GameRoomListActivity.this.X.setTextColor(GameRoomListActivity.f38702d3);
                    GameRoomListActivity.this.Y.setTextColor(GameRoomListActivity.f38702d3);
                    GameRoomListActivity.this.f38722p1.setTextColor(GameRoomListActivity.f38703e3);
                    GameRoomListActivity.this.f38721p0.setTextColor(GameRoomListActivity.f38703e3);
                }
            } else if (i4 == 2) {
                GameRoomListActivity.this.T.setBackgroundResource(R.drawable.bg_gamelist_tab_normal);
                GameRoomListActivity.this.W.setBackgroundResource(R.drawable.bg_gamelist_tab_normal);
                GameRoomListActivity.this.Z.setBackgroundResource(R.drawable.bg_gamelist_tab_pressed);
                GameRoomListActivity.this.a3(false);
                GameRoomListActivity.this.S.setVisibility(0);
                GameRoomListActivity.this.V.setTextColor(GameRoomListActivity.f38702d3);
                GameRoomListActivity.this.U.setTextColor(GameRoomListActivity.f38702d3);
                GameRoomListActivity.this.X.setTextColor(GameRoomListActivity.f38702d3);
                GameRoomListActivity.this.Y.setTextColor(GameRoomListActivity.f38702d3);
                GameRoomListActivity.this.f38722p1.setTextColor(GameRoomListActivity.f38703e3);
                GameRoomListActivity.this.f38721p0.setTextColor(GameRoomListActivity.f38703e3);
            }
            Fragment item = GameRoomListActivity.this.f38719n2.getItem(i4);
            if (item != null) {
                item.setUserVisibleHint(true);
            }
        }
    }

    /* loaded from: classes4.dex */
    class d extends Handler {
        d() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            GameRoomListActivity.r1(GameRoomListActivity.this);
            if (GameRoomListActivity.this.f38728u2 >= 1) {
                TextView textView = GameRoomListActivity.this.f38726s2;
                textView.setText("" + GameRoomListActivity.this.f38728u2);
                GameRoomListActivity.this.y2.sendEmptyMessageDelayed(1, 1000L);
                GameRoomListActivity.this.h3();
                return;
            }
            GameRoomListActivity.this.a2();
            if (GameRoomListActivity.this.J1 == null) {
                return;
            }
            if (GameRoomListActivity.this.v2 != null) {
                StandardEliteRoomFragment_ standardEliteRoomFragment_ = GameRoomListActivity.this.J1;
                if (!standardEliteRoomFragment_.B0("" + GameRoomListActivity.this.v2.getGameId())) {
                    StandardEliteRoomFragment_ standardEliteRoomFragment_2 = GameRoomListActivity.this.J1;
                    if (!standardEliteRoomFragment_2.o0("" + GameRoomListActivity.this.v2.getGameId())) {
                        StandardEliteRoomFragment_ standardEliteRoomFragment_3 = GameRoomListActivity.this.J1;
                        standardEliteRoomFragment_3.X0("" + GameRoomListActivity.this.v2.getGameId(), 1015);
                        return;
                    }
                    com.papa.sim.statistic.p l4 = com.papa.sim.statistic.p.l(GameRoomListActivity.this.P2);
                    Event event = Event.JoinLobbyroom;
                    Ext uid = new Ext().setUid(AccountUtil_.getInstance_(GameRoomListActivity.this.P2).getAccountData().getUid());
                    l4.O1(event, uid.setGameId(GameRoomListActivity.this.v2.getGameId() + "").setPosition("1"));
                    GameRoomActivity_.V2(GameRoomListActivity.this).g(true).h(GameRoomListActivity.this.f38730w2).d(GameRoomListActivity.this.v2.getGameName()).i(GameRoomListActivity.this.v2).start();
                    return;
                }
                p1.f K = p1.f.K();
                DownloadTask F = K.F("" + GameRoomListActivity.this.v2.getGameId());
                PlugInstallDialog_.k0(GameRoomListActivity.this).c(b2.o.o().n(F.getPlugin_num())).a(F).b(2).start();
            } else if (!TextUtils.isEmpty(GameRoomListActivity.this.f38731x2)) {
                GameRoomListActivity gameRoomListActivity = GameRoomListActivity.this;
                gameRoomListActivity.showToast(gameRoomListActivity.f38731x2);
            } else {
                GameRoomListActivity.this.showToast("快速加入房间失败，请重试！");
            }
        }
    }

    /* loaded from: classes4.dex */
    class e implements StandardEliteRoomFragment.n {
        e() {
        }

        @Override // com.join.mgps.fragment.roomlist.StandardEliteRoomFragment.n
        public void a(int i4, boolean z4) {
            GameRoomListActivity.this.p3(i4, z4);
            GameRoomListActivity.this.n3();
        }

        @Override // com.join.mgps.fragment.roomlist.StandardEliteRoomFragment.n
        public void b(boolean z4) {
            GameRoomListActivity.this.v2();
        }
    }

    /* loaded from: classes4.dex */
    class f extends CountDownTimer {
        f(long j4, long j5) {
            super(j4, j5);
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            GameRoomListActivity.this.I2("mCreateGameCountDowner onFinish---");
            if (GameRoomListActivity.this.A2 == null || !GameRoomListActivity.this.A2.isShowing()) {
                return;
            }
            GameRoomListActivity.this.A2.dismiss();
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j4) {
            GameRoomListActivity gameRoomListActivity = GameRoomListActivity.this;
            gameRoomListActivity.I2("mCreateGameCountDowner millisUntilFinished:" + j4);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class g implements w {
        g() {
        }

        @Override // com.join.mgps.activity.arena.GameRoomListActivity.w
        public void onItemClick(int i4) {
            GameRoomListActivity gameRoomListActivity = GameRoomListActivity.this;
            gameRoomListActivity.N = gameRoomListActivity.T2.get(i4);
            GameRoomListActivity.this.w0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class h implements GameInfoAdapterV2.e {
        h() {
        }

        @Override // com.join.mgps.adapter.GameInfoAdapterV2.e
        public void a(int i4) {
            GameInfoBean gameInfoBean = GameRoomListActivity.this.S2.get(i4);
            if (gameInfoBean.getGame_id().equals(GameRoomListActivity.this.N.getGame_id())) {
                GameRoomListActivity gameRoomListActivity = GameRoomListActivity.this;
                gameRoomListActivity.N = gameInfoBean;
                try {
                    if (gameRoomListActivity.J1 != null) {
                        GameRoomListActivity.this.J1.D0(GameRoomListActivity.this.N.getGame_id());
                    }
                    if (GameRoomListActivity.this.K1 != null) {
                        GameRoomListActivity.this.K1.D0(GameRoomListActivity.this.N.getGame_id());
                    }
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
            } else {
                GameRoomListActivity gameRoomListActivity2 = GameRoomListActivity.this;
                gameRoomListActivity2.N = gameInfoBean;
                try {
                    if (gameRoomListActivity2.J1 != null) {
                        GameRoomListActivity.this.J1.D0(GameRoomListActivity.this.N.getGame_id());
                        GameRoomListActivity.this.J1.F0(GameRoomListActivity.this.N.getCollection_id());
                    }
                    if (GameRoomListActivity.this.K1 != null) {
                        GameRoomListActivity.this.K1.D0(GameRoomListActivity.this.N.getGame_id());
                        GameRoomListActivity.this.K1.F0(GameRoomListActivity.this.N.getCollection_id());
                    }
                } catch (Exception e6) {
                    e6.printStackTrace();
                }
                GameRoomListActivity.this.g2();
            }
            GameRoomListActivity.this.w2();
            GameRoomListActivity.this.F2();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class i implements Callback<ResultMainBean<ArenaGameRoomListConfig>> {
        i() {
        }

        @Override // retrofit2.Callback
        public void onFailure(Call<ResultMainBean<ArenaGameRoomListConfig>> call, Throwable th) {
        }

        @Override // retrofit2.Callback
        public void onResponse(Call<ResultMainBean<ArenaGameRoomListConfig>> call, Response<ResultMainBean<ArenaGameRoomListConfig>> response) {
            if (GameRoomListActivity.this.f38724q2) {
                return;
            }
            ResultMainBean<ArenaGameRoomListConfig> body = response.body();
            if (body != null && body.getMessages().getData() != null) {
                if (body.getMessages().getData().getCurrent_collection_cfg() == null) {
                    GameRoomListActivity.this.e2();
                    return;
                }
                String collection_id = body.getMessages().getData().getCurrent_collection_cfg().getCollection_id();
                if (!TextUtils.isEmpty(collection_id) && Integer.parseInt(collection_id) > 0) {
                    if (body.getMessages().getData().getGame_list() != null && body.getMessages().getData().getGame_list().size() > 0) {
                        List<GameConfig> game_list = body.getMessages().getData().getGame_list();
                        ArrayList arrayList = new ArrayList();
                        for (GameConfig gameConfig : game_list) {
                            GameInfoBean gameInfoBean = new GameInfoBean();
                            gameInfoBean.setCollection_id(gameConfig.getCollection_id());
                            gameInfoBean.setPic_remote(gameConfig.getGame_ico());
                            gameInfoBean.setGame_ico(gameConfig.getGame_ico());
                            gameInfoBean.setGame_id(gameConfig.getGame_id());
                            gameInfoBean.setGame_name(gameConfig.getGame_name());
                            gameInfoBean.setRoom_count(gameConfig.getRoom_count());
                            gameInfoBean.setTitle(gameConfig.getTitle());
                            gameInfoBean.setPic_cover(gameConfig.getPic_cover());
                            arrayList.add(gameInfoBean);
                        }
                        GameRoomListActivity.this.S2.clear();
                        GameRoomListActivity.this.S2.addAll(arrayList);
                        GameInfoAdapterV2 gameInfoAdapterV2 = GameRoomListActivity.this.R2;
                        if (gameInfoAdapterV2 != null) {
                            gameInfoAdapterV2.notifyDataSetChanged();
                            return;
                        }
                        return;
                    }
                    GameRoomListActivity.this.e2();
                    return;
                }
                GameRoomListActivity.this.e2();
                return;
            }
            GameRoomListActivity.this.showToast("获取游戏配置信息失败！");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class j implements Callback<ResultResMainBean<GameListBannerBean>> {
        j() {
        }

        @Override // retrofit2.Callback
        public void onFailure(Call<ResultResMainBean<GameListBannerBean>> call, Throwable th) {
            GameRoomListActivity.this.w2();
        }

        @Override // retrofit2.Callback
        public void onResponse(Call<ResultResMainBean<GameListBannerBean>> call, Response<ResultResMainBean<GameListBannerBean>> response) {
            ResultResMainBean<GameListBannerBean> body = response.body();
            if (body != null) {
                try {
                    List<GameInfoBean> game_list = body.getData().getGame_list();
                    if (game_list == null || game_list.size() <= 0) {
                        GameRoomListActivity.this.w2();
                        return;
                    }
                    GameRoomListActivity.this.T2.addAll(game_list);
                    x xVar = GameRoomListActivity.this.f38719n2;
                    if (xVar != null) {
                        xVar.notifyDataSetChanged();
                    }
                    GameRoomListActivity.this.F2();
                } catch (Exception e5) {
                    e5.printStackTrace();
                    GameRoomListActivity.this.w2();
                }
            }
        }
    }

    /* loaded from: classes4.dex */
    class k extends b.c {
        k() {
        }

        @Override // com.join.mgps.socket.fight.arena.b.c, com.join.mgps.socket.fight.arena.b.InterfaceC0385b
        public void a() {
            super.a();
            GameRoomListActivity.this.L2(2);
        }

        @Override // com.join.mgps.socket.fight.arena.b.c, com.join.mgps.socket.fight.arena.b.InterfaceC0385b
        public void c() {
            super.c();
            GameRoomListActivity.this.M1.d().z(GameRoomListActivity.this.S1);
            GameRoomListActivity gameRoomListActivity = GameRoomListActivity.this;
            gameRoomListActivity.N1 = gameRoomListActivity.M1.d().n();
            GameRoomListActivity gameRoomListActivity2 = GameRoomListActivity.this;
            gameRoomListActivity2.X2(gameRoomListActivity2.N1);
            GameRoomListActivity.this.t2();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class l implements Callback<ResultMainBean<ArenaAdData>> {
        l() {
        }

        @Override // retrofit2.Callback
        public void onFailure(Call<ResultMainBean<ArenaAdData>> call, Throwable th) {
        }

        @Override // retrofit2.Callback
        public void onResponse(Call<ResultMainBean<ArenaAdData>> call, Response<ResultMainBean<ArenaAdData>> response) {
            View view;
            if (response != null) {
                try {
                    if (response.body() != null) {
                        ResultMainBean<ArenaAdData> body = response.body();
                        if (body.getCode() == 600) {
                            ArenaAdData data = body.getMessages().getData();
                            if (data.isC_has_not_read() && (view = GameRoomListActivity.this.R) != null) {
                                view.setVisibility(0);
                            }
                            List<ArenaPopupInfoShareBean> list = null;
                            String d5 = GameRoomListActivity.this.H1.arenaDialogAdData().d();
                            if (g2.i(d5)) {
                                list = (List) JsonMapper.getInstance().fromJson(d5, JsonMapper.getInstance().createCollectionType(List.class, ArenaPopupInfoShareBean.class));
                                ArrayList<ArenaPopupInfoShareBean> arrayList = new ArrayList();
                                for (ArenaPopupInfoShareBean arenaPopupInfoShareBean : list) {
                                    if (!com.join.mgps.Util.y.u(arenaPopupInfoShareBean.getLastShowTime())) {
                                        arrayList.add(arenaPopupInfoShareBean);
                                    }
                                }
                                for (ArenaPopupInfoShareBean arenaPopupInfoShareBean2 : arrayList) {
                                    list.remove(arenaPopupInfoShareBean2);
                                }
                            }
                            Iterator<ArenaPopupInfoBean> it2 = data.getPopup_info().iterator();
                            while (it2.hasNext() && !GameRoomListActivity.this.U1(it2.next(), list)) {
                            }
                        }
                    }
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
            }
        }
    }

    /* loaded from: classes4.dex */
    class m implements Handler.Callback {
        m() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(@NonNull Message message) {
            GameRoomListActivity gameRoomListActivity = GameRoomListActivity.this;
            Dialog dialog = gameRoomListActivity.W2;
            if (dialog == null || gameRoomListActivity.f38724q2) {
                return false;
            }
            dialog.dismiss();
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class n implements n0.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ArenaPopupInfoBean f38747a;

        n(ArenaPopupInfoBean arenaPopupInfoBean) {
            this.f38747a = arenaPopupInfoBean;
        }

        @Override // com.join.mgps.dialog.n0.c
        public void a(n0 n0Var) {
            n0Var.dismiss();
        }

        @Override // com.join.mgps.dialog.n0.c
        public void b(n0 n0Var) {
            n0Var.dismiss();
            IntentUtil.getInstance().intentActivity(GameRoomListActivity.this.P2, this.f38747a.getJump_info().getIntentDataBean());
            com.papa.sim.statistic.p.l(GameRoomListActivity.this.P2).n2(AccountUtil_.getInstance_(GameRoomListActivity.this.P2).getUid(), "vsButton");
        }
    }

    /* loaded from: classes4.dex */
    class o implements SocketListener.NotifyObserver {
        o() {
        }

        @Override // app.mgsim.arena.SocketListener.NotifyObserver
        public void onError(SocketError socketError) {
            if (GameRoomListActivity.this.A2()) {
                return;
            }
            GameRoomListActivity.this.L2(3);
            int i4 = socketError.errorType;
            if (i4 == 6 || i4 == 2) {
                GameRoomListActivity.this.showToast(socketError.errorInfo);
                GameRoomListActivity.this.d2();
            } else if (i4 == 5) {
                GameRoomListActivity.this.P2();
            } else if (i4 == 3 || i4 == 4) {
                GameRoomListActivity.this.showToast(socketError.errorInfo);
                GameRoomListActivity.this.e3();
            }
        }

        @Override // app.mgsim.arena.SocketListener.NotifyObserver
        public void onServerResponse(ArenaResponse arenaResponse) {
            int i4;
            if (GameRoomListActivity.this.A2()) {
                return;
            }
            if (arenaResponse.responseCode == 0) {
                GameRoomListActivity.this.handleFailure(arenaResponse);
            } else if (arenaResponse.responseType.equals(ArenaConstants.ArenaCommand.CMD_LOGIN)) {
                GameRoomListActivity gameRoomListActivity = GameRoomListActivity.this;
                gameRoomListActivity.N1 = gameRoomListActivity.M1.d().n();
                GameRoomListActivity gameRoomListActivity2 = GameRoomListActivity.this;
                gameRoomListActivity2.X2(gameRoomListActivity2.N1);
                GameRoomListActivity gameRoomListActivity3 = GameRoomListActivity.this;
                ArenaRequest arenaRequest = arenaResponse.request;
                gameRoomListActivity3.Z1(arenaRequest.isElite, arenaRequest.isRefreshing);
            } else if (arenaResponse.responseType.equals(ArenaConstants.ArenaCommand.PUSH_UPDATE_AREA_ONLINE_PEOPLE_BROADCAST)) {
                GameRoomListActivity.this.l3((AreaOnlinePeopleCount) arenaResponse.data);
            } else {
                if (arenaResponse.responseType.equals(ArenaConstants.ArenaCommand.CMD_JOIN_BATTLE_AREA)) {
                    GameRoomListActivity.this.M1.d().D(GameRoomListActivity.this.f38715j2);
                    GameRoomListActivity.this.L2(1);
                } else if (arenaResponse.responseType.equals(ArenaConstants.ArenaCommand.CMD_QUICK_JOIN_ROOM)) {
                    GameRoomListActivity.this.M1.d().E(null);
                    GameRoomListActivity.this.f38730w2 = arenaResponse.joinSpectatorReason;
                    GameRoomListActivity.this.v2 = (GameRoom) arenaResponse.data;
                } else if (arenaResponse.responseType.equals(ArenaConstants.ArenaCommand.PUSH_GLOBAL_BROADCAST_ALL)) {
                    GameRoomListActivity.this.p2((Notification) arenaResponse.data);
                } else if (arenaResponse.responseType.equals(ArenaConstants.ArenaCommand.PUSH_REFRESH_ROOM_LIST_UPDATE)) {
                    GameRoomListActivity.this.I2(ArenaConstants.ArenaCommand.PUSH_REFRESH_ROOM_LIST_UPDATE);
                    GameRoomListActivity.this.s2((List) arenaResponse.data);
                } else if (arenaResponse.responseType.equals(ArenaConstants.ArenaCommand.PUSH_REFRESH_ROOM_LIST_DISSOLVE)) {
                    GameRoomListActivity.this.I2(ArenaConstants.ArenaCommand.PUSH_REFRESH_ROOM_LIST_DISSOLVE);
                    GameRoomListActivity.this.r2((List) arenaResponse.data);
                } else {
                    if (arenaResponse.responseType.equals(ArenaConstants.ArenaCommand.PUSH_FULL_PUSH_ROOM_LIST_ING)) {
                        GameRoomListActivity.this.I2(ArenaConstants.ArenaCommand.PUSH_FULL_PUSH_ROOM_LIST_ING);
                        GameRoomListActivity.this.q2(arenaResponse, false);
                    } else if (arenaResponse.responseType.equals(ArenaConstants.ArenaCommand.PUSH_FULL_PUSH_ROOM_LIST_FINISH)) {
                        GameRoomListActivity.this.I2(ArenaConstants.ArenaCommand.PUSH_FULL_PUSH_ROOM_LIST_FINISH);
                        if (arenaResponse.request.roomType == 1) {
                            GameRoomListActivity.this.P1 = true;
                            GameRoomListActivity.this.o3(arenaResponse, false);
                        } else {
                            GameRoomListActivity.this.o3(arenaResponse, true);
                            GameRoomListActivity.this.Q1 = true;
                        }
                        GameRoomListActivity.this.q2(arenaResponse, true);
                    } else if (arenaResponse.responseType.equals(ArenaConstants.ArenaCommand.CMD_CREATE_GAME_ROOM) || arenaResponse.responseType.equals(ArenaConstants.ArenaCommand.CMD_JOIN_ROOM)) {
                        GameRoomListActivity.this.u2();
                        GameRoom gameRoom = (GameRoom) arenaResponse.data;
                        GameRoomListActivity.this.M1.d().E(null);
                        if (gameRoom.getRoomCategory() == RoomCategory.LIVE) {
                            i4 = 2;
                        } else {
                            i4 = gameRoom.getRoomCategory() == RoomCategory.TOURNAMENT ? 1 : 0;
                        }
                        if (arenaResponse.responseType.equals(ArenaConstants.ArenaCommand.CMD_CREATE_GAME_ROOM)) {
                            com.papa.sim.statistic.p l4 = com.papa.sim.statistic.p.l(GameRoomListActivity.this.P2);
                            Event event = Event.JoinLobbyroom;
                            Ext ext = new Ext();
                            l4.O1(event, ext.setGameId(gameRoom.getGameId() + "").setUid(AccountUtil_.getInstance_(GameRoomListActivity.this.P2).getAccountData().getUid()).setPosition("0"));
                            GameRoomListActivity.this.Q1();
                            int i5 = -1;
                            if (gameRoom.getElite()) {
                                if (GameRoomListActivity.this.K1 != null) {
                                    i5 = GameRoomListActivity.this.K1.v0() != 2 ? 1 : 0;
                                }
                                GameRoomActivity_.V2(GameRoomListActivity.this).l(i4).a(GameRoomListActivity.this.I2).e(i5).d(gameRoom.getGameName()).f(true).i(gameRoom).start();
                                return;
                            }
                            if (GameRoomListActivity.this.J1 != null) {
                                i5 = GameRoomListActivity.this.J1.v0() == 2 ? 0 : 1;
                            }
                            GameRoomActivity_.V2(GameRoomListActivity.this).l(i4).d(gameRoom.getGameName()).e(i5).i(gameRoom).start();
                            return;
                        }
                        com.wufan.user.service.protobuf.n0 accountData = AccountUtil_.getInstance_(GameRoomListActivity.this).getAccountData();
                        if (!g2.h(accountData.getNickname()) && (!accountData.getAccount().equals(accountData.getNickname()) || !accountData.getAccount().startsWith("pa"))) {
                            com.papa.sim.statistic.p l5 = com.papa.sim.statistic.p.l(GameRoomListActivity.this.P2);
                            Event event2 = Event.JoinLobbyroom;
                            Ext uid = new Ext().setUid(AccountUtil_.getInstance_(GameRoomListActivity.this.P2).getAccountData().getUid());
                            l5.O1(event2, uid.setGameId(gameRoom.getGameId() + "").setPosition("1"));
                            GameRoomActivity_.V2(GameRoomListActivity.this).l(i4).h(arenaResponse.joinSpectatorReason).d(gameRoom.getGameName()).i(gameRoom).start();
                            return;
                        }
                        IntentUtil.getInstance().goChangeNickname(GameRoomListActivity.this);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class p implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Notification f38750b;

        p(Notification notification) {
            this.f38750b = notification;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            try {
                String jumpJSON = this.f38750b.getJumpJSON();
                GameRoomListActivity gameRoomListActivity = GameRoomListActivity.this;
                gameRoomListActivity.I2("handleMsgBroadcast jsonValue:" + jumpJSON);
                IntentUtil.getInstance().intentActivity(GameRoomListActivity.this, (IntentDateBean) JsonMapper.getInstance().fromJson(jumpJSON, IntentDateBean.class));
            } catch (Exception e5) {
                GameRoomListActivity gameRoomListActivity2 = GameRoomListActivity.this;
                gameRoomListActivity2.I2("fromJson exception:" + e5.getMessage());
            }
        }
    }

    /* loaded from: classes4.dex */
    class q extends a.b0 {
        q() {
        }

        @Override // com.join.mgps.socket.fight.arena.a.b0, com.join.mgps.socket.fight.arena.a.y
        public void W(int i4, int i5, Object obj) {
            super.W(i4, i5, obj);
            if (i4 == 101 && i5 == 7) {
                GameRoomListActivity.this.b3((ArenaResponse) obj);
            }
        }

        @Override // com.join.mgps.socket.fight.arena.a.b0, com.join.mgps.socket.fight.arena.a.y
        public void q() {
            super.q();
            GameRoomListActivity.this.finish();
        }
    }

    /* loaded from: classes4.dex */
    class r implements View.OnClickListener {
        r() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (GameRoomListActivity.this.G1.getCurrentItem() == 1) {
                GameRoomListActivity.this.G1.setCurrentItem(0);
            } else {
                GameRoomListActivity.this.G1.setCurrentItem(1);
            }
        }
    }

    /* loaded from: classes4.dex */
    class s implements View.OnClickListener {
        s() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (GameRoomListActivity.this.G1.getCurrentItem() == 1) {
                GameRoomListActivity.this.G1.setCurrentItem(0);
            } else {
                GameRoomListActivity.this.G1.setCurrentItem(1);
            }
        }
    }

    /* loaded from: classes4.dex */
    class t implements View.OnClickListener {
        t() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (GameRoomListActivity.this.f38717l2.getCurrent_collection_cfg().getElite_match_switch() == 1) {
                GameRoomListActivity.this.G1.setCurrentItem(2);
            } else {
                GameRoomListActivity.this.G1.setCurrentItem(1);
            }
        }
    }

    /* loaded from: classes4.dex */
    class u implements View.OnClickListener {
        u() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GameRoomListActivity.this.d3();
            if (GameRoomListActivity.this.f38717l2 != null) {
                if (!GameRoomListActivity.this.M1.e()) {
                    GameRoomListActivity.this.M1.bindService();
                    GameRoomListActivity.this.v2();
                    return;
                }
                GameRoomListActivity.this.t2();
                return;
            }
            GameRoomListActivity.this.g2();
        }
    }

    /* loaded from: classes4.dex */
    class v implements y.e {
        v() {
        }

        @Override // com.join.mgps.customview.y.e
        public void a(BattleArea battleArea) {
            GameRoomListActivity.this.f38715j2 = battleArea;
            int number = GameRoomListActivity.this.f38715j2.getNumber();
            BattleArea battleArea2 = BattleArea.BJ;
            if (number == battleArea2.getNumber()) {
                GameRoomListActivity.this.Q2(battleArea2);
                return;
            }
            int number2 = GameRoomListActivity.this.f38715j2.getNumber();
            BattleArea battleArea3 = BattleArea.SH;
            if (number2 == battleArea3.getNumber()) {
                GameRoomListActivity.this.Q2(battleArea3);
            } else {
                GameRoomListActivity.this.Q2(BattleArea.GZ);
            }
        }

        @Override // com.join.mgps.customview.y.e
        public void b(GameConfig gameConfig) {
            try {
                GameRoomListActivity gameRoomListActivity = GameRoomListActivity.this;
                gameRoomListActivity.I1 = gameConfig;
                if (gameRoomListActivity.J1 != null) {
                    GameRoomListActivity.this.J1.D0(gameConfig.getGame_id());
                }
                if (GameRoomListActivity.this.K1 != null) {
                    GameRoomListActivity.this.K1.D0(gameConfig.getGame_id());
                }
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    /* loaded from: classes4.dex */
    public interface w {
        void onItemClick(int i4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public class x extends FragmentPagerAdapter {

        /* renamed from: a  reason: collision with root package name */
        private ArenaGameRoomListConfig f38758a;

        public x(ArenaGameRoomListConfig arenaGameRoomListConfig, FragmentManager fragmentManager) {
            super(fragmentManager);
            this.f38758a = arenaGameRoomListConfig;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public int getCount() {
            return GameRoomListActivity.this.l2(this.f38758a);
        }

        @Override // androidx.fragment.app.FragmentPagerAdapter
        public Fragment getItem(int i4) {
            return GameRoomListActivity.this.R2(i4, this.f38758a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class y extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        View f38760a;

        /* renamed from: b  reason: collision with root package name */
        TextView f38761b;

        public y(@NonNull View view) {
            super(view);
            this.f38760a = view.findViewById(R.id.main);
            this.f38761b = (TextView) view.findViewById(R.id.name);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class z extends RecyclerView.Adapter<y> {

        /* renamed from: a  reason: collision with root package name */
        private w f38763a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public class a implements View.OnClickListener {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ int f38765b;

            a(int i4) {
                this.f38765b = i4;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                z zVar = z.this;
                zVar.notifyItemChanged(GameRoomListActivity.this.U2);
                GameRoomListActivity.this.U2 = this.f38765b;
                z zVar2 = z.this;
                zVar2.notifyItemChanged(GameRoomListActivity.this.U2);
                z.this.f38763a.onItemClick(this.f38765b);
            }
        }

        z() {
        }

        public GameInfoBean b() {
            List<GameInfoBean> list = GameRoomListActivity.this.T2;
            if (list != null && list.size() != 0) {
                if (GameRoomListActivity.this.U2 < 0) {
                    return GameRoomListActivity.this.T2.get(0);
                }
                if (GameRoomListActivity.this.U2 < getItemCount()) {
                    GameRoomListActivity gameRoomListActivity = GameRoomListActivity.this;
                    return gameRoomListActivity.T2.get(gameRoomListActivity.U2);
                }
            }
            return null;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* renamed from: c */
        public void onBindViewHolder(@NonNull y yVar, int i4) {
            GameInfoBean gameInfoBean = GameRoomListActivity.this.T2.get(i4);
            if (GameRoomListActivity.this.U2 != -1024 || !gameInfoBean.getCollection_id().equals(GameRoomListActivity.this.N.getCollection_id())) {
                if (GameRoomListActivity.this.U2 == i4) {
                    yVar.f38761b.setTextColor(-16777216);
                } else {
                    yVar.f38761b.setTextColor(Color.parseColor("#C3C3C3"));
                }
                yVar.f38760a.setSelected(GameRoomListActivity.this.U2 == i4);
            } else {
                GameRoomListActivity.this.U2 = i4;
                yVar.f38760a.setSelected(true);
                yVar.f38761b.setTextColor(-16777216);
            }
            yVar.f38761b.setText(gameInfoBean.getTitle());
            yVar.f38760a.setOnClickListener(new a(i4));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @NonNull
        /* renamed from: d */
        public y onCreateViewHolder(@NonNull ViewGroup viewGroup, int i4) {
            return new y(LayoutInflater.from(GameRoomListActivity.this.P2).inflate(R.layout.newarena_roomselecter_item, viewGroup, false));
        }

        public void e(w wVar) {
            this.f38763a = wVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return GameRoomListActivity.this.T2.size();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A2() {
        if (isFinishing()) {
            return true;
        }
        return Build.VERSION.SDK_INT >= 17 && isDestroyed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ WindowInsets D2(View view, WindowInsets windowInsets) {
        if (h1.b(this)) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.G1.getLayoutParams();
            layoutParams.leftMargin = (int) m2();
            this.G1.setLayoutParams(layoutParams);
        }
        return view.onApplyWindowInsets(windowInsets);
    }

    private void N2(ArenaResponse arenaResponse) {
        synchronized (this.V1) {
            if (arenaResponse.request.roomType == 2) {
                if (this.f38708c2 && this.K1 != null && this.Q1) {
                    this.K1.K0(arenaResponse.request.roomId);
                }
            } else if (this.f38707b2 && this.J1 != null && this.P1) {
                this.J1.K0(arenaResponse.request.roomId);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void P2() {
        ArenaGameRoomListConfig arenaGameRoomListConfig;
        I2("---retryLogin---");
        d3();
        ArenaRequest login = ArenaRequestFactory.login(ArenaConstants.REGISTER_TYPE_GAMELIST);
        if (this.G1.getCurrentItem() == 1 && (arenaGameRoomListConfig = this.f38717l2) != null && arenaGameRoomListConfig.getCurrent_collection_cfg().getElite_match_switch() == 1) {
            login.isElite = true;
            login.isRefreshing = false;
            login.roomType = 2;
        } else {
            login.isElite = false;
            login.isRefreshing = false;
            login.roomType = 1;
        }
        this.M1.f(login);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Q1() {
        CountDownTimer countDownTimer = this.H2;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Q2(BattleArea battleArea) {
        if (battleArea == null) {
            return;
        }
        this.M1.f(ArenaRequestFactory.changeBattleArea(ArenaConstants.REGISTER_TYPE_GAMELIST, battleArea));
    }

    private boolean T1(PopupWindow popupWindow, MotionEvent motionEvent) {
        View contentView;
        if (popupWindow == null || motionEvent == null || (contentView = popupWindow.getContentView()) == null) {
            return false;
        }
        return !W1(contentView, motionEvent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean U1(ArenaPopupInfoBean arenaPopupInfoBean, List<ArenaPopupInfoShareBean> list) {
        if (arenaPopupInfoBean != null && arenaPopupInfoBean.getJump_info() != null) {
            if (list != null) {
                boolean z4 = false;
                for (ArenaPopupInfoShareBean arenaPopupInfoShareBean : list) {
                    if (arenaPopupInfoShareBean.getId() == arenaPopupInfoBean.getId()) {
                        arenaPopupInfoShareBean.setDaily_count(arenaPopupInfoBean.getDaily_count());
                        if (com.join.mgps.Util.y.u(arenaPopupInfoShareBean.getLastShowTime())) {
                            if (arenaPopupInfoShareBean.getHasShowCount() < arenaPopupInfoShareBean.getDaily_count()) {
                                W2(arenaPopupInfoBean);
                                arenaPopupInfoShareBean.setHasShowCount(arenaPopupInfoShareBean.getHasShowCount() + 1);
                                arenaPopupInfoShareBean.setLastShowTime(System.currentTimeMillis());
                                this.H1.arenaDialogAdData().g(JsonMapper.getInstance().toJson(list));
                                return true;
                            }
                            z4 = true;
                        } else {
                            arenaPopupInfoShareBean.setHasShowCount(1);
                            arenaPopupInfoShareBean.setLastShowTime(System.currentTimeMillis());
                            W2(arenaPopupInfoBean);
                            this.H1.arenaDialogAdData().g(JsonMapper.getInstance().toJson(list));
                            v0.d("arenadialog", "22222222222222");
                            return true;
                        }
                    }
                }
                if (!z4) {
                    ArenaPopupInfoShareBean arenaPopupInfoShareBean2 = new ArenaPopupInfoShareBean();
                    arenaPopupInfoShareBean2.setId(arenaPopupInfoBean.getId());
                    arenaPopupInfoShareBean2.setDaily_count(arenaPopupInfoBean.getDaily_count());
                    arenaPopupInfoShareBean2.setLastShowTime(System.currentTimeMillis());
                    arenaPopupInfoShareBean2.setHasShowCount(1);
                    list.add(arenaPopupInfoShareBean2);
                    this.H1.arenaDialogAdData().g(JsonMapper.getInstance().toJson(list));
                    W2(arenaPopupInfoBean);
                    v0.d("arenadialog", "3333333333");
                    return true;
                }
            } else {
                ArenaPopupInfoShareBean arenaPopupInfoShareBean3 = new ArenaPopupInfoShareBean();
                arenaPopupInfoShareBean3.setId(arenaPopupInfoBean.getId());
                arenaPopupInfoShareBean3.setDaily_count(arenaPopupInfoBean.getDaily_count());
                arenaPopupInfoShareBean3.setLastShowTime(System.currentTimeMillis());
                arenaPopupInfoShareBean3.setHasShowCount(1);
                ArrayList arrayList = new ArrayList();
                arrayList.add(arenaPopupInfoShareBean3);
                this.H1.arenaDialogAdData().g(JsonMapper.getInstance().toJson(arrayList));
                W2(arenaPopupInfoBean);
                v0.d("arenadialog", "4444444444");
                return true;
            }
        }
        return false;
    }

    private boolean W1(View view, MotionEvent motionEvent) {
        if (view == null) {
            return false;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int rawX = (int) motionEvent.getRawX();
        int rawY = (int) motionEvent.getRawY();
        return iArr[0] < rawX && iArr[1] < rawY && rawX < iArr[0] + view.getWidth() && rawY < iArr[1] + view.getHeight();
    }

    private void W2(ArenaPopupInfoBean arenaPopupInfoBean) {
        try {
            Dialog dialog = this.W2;
            if (dialog != null) {
                dialog.dismiss();
                this.W2 = null;
            }
            Dialog Q = b0.f0(this).Q(this, arenaPopupInfoBean.getJump_info().getTitle(), arenaPopupInfoBean.getJump_info().getPic_remote(), new n(arenaPopupInfoBean));
            this.W2 = Q;
            Q.show();
            this.W2.setCancelable(false);
            this.X2.sendEmptyMessageDelayed(1, arenaPopupInfoBean.getShow_time());
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    private void Z2() {
        if (S1()) {
            this.v2 = null;
            this.f38731x2 = null;
            this.f38730w2 = "";
            this.f38728u2 = 3;
            this.f38727t2 = AnimationUtils.loadAnimation(this, R.anim.count_downer);
            this.f38725r2 = new Dialog(this, R.style.newtrans_no_floating_dialog);
            View inflate = LayoutInflater.from(this).inflate(R.layout.dialog_fast_join_room, (ViewGroup) null);
            TextView textView = (TextView) inflate.findViewById(R.id.tv_countDown);
            this.f38726s2 = textView;
            textView.setText("" + this.f38728u2);
            this.f38725r2.setContentView(inflate);
            Window window = this.f38725r2.getWindow();
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.height = c0.a(this, 130.0f);
            attributes.width = c0.a(this, 273.0f);
            window.setGravity(17);
            this.f38725r2.show();
            this.f38726s2.startAnimation(this.f38727t2);
            this.y2.sendEmptyMessageDelayed(1, 1000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b3(ArenaResponse arenaResponse) {
        if (arenaResponse == null) {
            return;
        }
        synchronized (this.V1) {
            if (arenaResponse.request.roomType == 2) {
                if (this.f38708c2 && this.K1 != null && this.Q1) {
                    this.K1.R0(arenaResponse.request.roomId);
                }
            } else if (this.f38707b2 && this.J1 != null && this.P1) {
                this.J1.R0(arenaResponse.request.roomId);
            }
        }
    }

    private void c3(String str) {
        d1 d1Var = this.A2;
        if (d1Var != null && d1Var.isShowing()) {
            this.A2.dismiss();
        }
        d1 z4 = b0.f0(this).z(this, str, false);
        this.A2 = z4;
        z4.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h3() {
        this.f38727t2.reset();
        this.f38726s2.startAnimation(this.f38727t2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int l2(ArenaGameRoomListConfig arenaGameRoomListConfig) {
        int i4 = arenaGameRoomListConfig.getCurrent_collection_cfg().getElite_match_switch() == 1 ? 2 : 1;
        return arenaGameRoomListConfig.getCurrent_collection_cfg().getGeneral_match_switch() == 1 ? i4 + 1 : i4;
    }

    static /* synthetic */ int r1(GameRoomListActivity gameRoomListActivity) {
        int i4 = gameRoomListActivity.f38728u2;
        gameRoomListActivity.f38728u2 = i4 - 1;
        return i4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w2() {
        this.O2.setVisibility(8);
    }

    private void x0() {
        com.join.mgps.rpc.impl.l.n0().m0().u(AccountUtil_.getInstance_(this.P2).getUid()).enqueue(new j());
    }

    private void x2() {
        this.N2.setLayoutManager(new LinearLayoutManager(this));
        z zVar = new z();
        this.Q2 = zVar;
        zVar.e(new g());
        this.N2.setAdapter(this.Q2);
        this.P2 = this;
        this.M2.setLayoutManager(new GridLayoutManager(this.P2, ((double) com.join.android.app.common.utils.n.n(this).j(this)) >= 1.9d ? 3 : 2));
        GameInfoAdapterV2 gameInfoAdapterV2 = new GameInfoAdapterV2(this.P2, false);
        this.R2 = gameInfoAdapterV2;
        gameInfoAdapterV2.f(new h());
        this.S2 = this.R2.b();
        this.M2.setAdapter(this.R2);
        x0();
        F2();
    }

    private void y2(ArenaGameRoomListConfig arenaGameRoomListConfig) {
        if (arenaGameRoomListConfig == null) {
            return;
        }
        if (arenaGameRoomListConfig.getCurrent_collection_cfg().getElite_match_switch() == 1) {
            this.f38718m2 = false;
            this.W.setVisibility(0);
        } else {
            this.W.setVisibility(8);
        }
        if (arenaGameRoomListConfig.getCurrent_collection_cfg().getGeneral_match_switch() == 1) {
            this.f38718m2 = false;
            this.Z.setVisibility(0);
        } else {
            this.Z.setVisibility(8);
        }
        if (this.f38718m2) {
            this.f38711f2.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void B2() {
        ArenaGameRoomListConfig arenaGameRoomListConfig;
        StandardEliteRoomFragment_ standardEliteRoomFragment_;
        StandardEliteRoomFragment_ standardEliteRoomFragment_2;
        if (S1()) {
            if (this.G1.getCurrentItem() == 0) {
                if (this.P1 && (standardEliteRoomFragment_2 = this.J1) != null) {
                    standardEliteRoomFragment_2.U0(this.f38716k2, this.M1.d().m(), com.join.mgps.socket.fight.arena.c.b(this.N1), this.R1);
                } else {
                    showToast("正在加载数据，请稍等...");
                }
            } else if (this.G1.getCurrentItem() == 1 && (arenaGameRoomListConfig = this.f38717l2) != null && arenaGameRoomListConfig.getCurrent_collection_cfg().getElite_match_switch() == 1) {
                if (this.Q1 && (standardEliteRoomFragment_ = this.K1) != null) {
                    standardEliteRoomFragment_.U0(this.f38716k2, this.M1.d().m(), com.join.mgps.socket.fight.arena.c.b(this.N1), this.R1);
                } else {
                    showToast("正在加载数据，请稍等...");
                }
            }
            if (this.H1.firstArenaFilterVisit().e(Boolean.TRUE).booleanValue()) {
                this.H1.firstArenaFilterVisit().g(Boolean.FALSE);
                this.C1.setImageDrawable(getResources().getDrawable(R.drawable.icon_list));
            }
        }
    }

    public void C2(int i4, String str, boolean z4) {
        if (S1()) {
            c3("正在加入房间...");
            this.M1.f(ArenaRequestFactory.joinRoom(ArenaConstants.REGISTER_TYPE_GAMELIST, i4, str, z4));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void E2() {
        this.R.setVisibility(8);
        IntentUtil intentUtil = IntentUtil.getInstance();
        intentUtil.goShareWebActivity(this, com.join.mgps.rpc.h.f54095w + "/lobby_active/index/");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void F2() {
        FriendFragment friendFragment;
        GameInfoBean gameInfoBean = this.N;
        if (gameInfoBean == null || (friendFragment = this.f31369c) == null) {
            return;
        }
        friendFragment.N0(gameInfoBean.getCollection_id(), this.S2);
    }

    public void G2(int i4) {
        if ((i4 > 0 && this.L2 < 0) || (i4 < 0 && this.L2 > 0)) {
            this.K2.g();
            this.L2 = 0;
        }
        int i5 = this.L2 + i4;
        this.L2 = i5;
        if (i5 > this.K2.h()) {
            this.K2.l(false);
        } else if (this.L2 < 0) {
            this.K2.l(true);
        }
    }

    public void H2(int i4) {
    }

    void I2(String str) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void J2() {
        IntentDateBean intentDateBean = new IntentDateBean();
        intentDateBean.setLink_type(4);
        intentDateBean.setLink_type_val(com.join.mgps.rpc.h.f54062l + "/static/match_v2/index.html");
        intentDateBean.setFrom("11");
        IntentUtil.getInstance().intentActivity(this, intentDateBean);
    }

    public boolean K2(boolean z4) {
        if (!z4) {
            this.T1 = true;
        } else {
            this.U1 = true;
        }
        com.join.mgps.socket.fight.arena.b bVar = this.M1;
        if (bVar == null || bVar.d() == null || !this.M1.d().s()) {
            ArenaRequest login = ArenaRequestFactory.login(ArenaConstants.REGISTER_TYPE_GAMELIST);
            login.isRefreshing = true;
            login.isElite = z4;
            this.M1.f(login);
        } else if (!z4) {
            k3(1, true);
        } else {
            k3(2, true);
        }
        return true;
    }

    void L1(View view) {
        this.K2 = new t2.a(view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void L2(int i4) {
        this.T1 = true;
        this.U1 = true;
        this.f38707b2 = false;
        this.f38708c2 = false;
        this.P1 = false;
        this.Q1 = false;
        d1 d1Var = this.A2;
        if (d1Var != null && d1Var.isShowing()) {
            this.A2.dismiss();
        }
        StandardEliteRoomFragment_ standardEliteRoomFragment_ = this.K1;
        if (standardEliteRoomFragment_ != null) {
            standardEliteRoomFragment_.b1();
        }
        StandardEliteRoomFragment_ standardEliteRoomFragment_2 = this.J1;
        if (standardEliteRoomFragment_2 != null) {
            standardEliteRoomFragment_2.b1();
        }
        Q1();
        this.y2.removeMessages(1);
        Dialog dialog = this.f38725r2;
        if (dialog != null && dialog.isShowing()) {
            this.f38725r2.dismiss();
        }
        com.join.mgps.socket.fight.arena.a aVar = this.f38709d2;
        if (aVar != null) {
            aVar.w();
        }
        if (i4 != 1) {
            if (i4 == 2) {
                this.f38717l2 = null;
                this.B1.setVisibility(8);
                this.f38723p2.setVisibility(8);
                this.f38720o2.setVisibility(0);
                return;
            } else if (i4 == 3) {
                this.B1.setVisibility(8);
                this.f38723p2.setVisibility(8);
                this.f38720o2.setVisibility(0);
                return;
            } else {
                return;
            }
        }
        StandardEliteRoomFragment_ standardEliteRoomFragment_3 = this.K1;
        if (standardEliteRoomFragment_3 != null) {
            standardEliteRoomFragment_3.I0(new ArrayList(), true);
        }
        StandardEliteRoomFragment_ standardEliteRoomFragment_4 = this.J1;
        if (standardEliteRoomFragment_4 != null) {
            standardEliteRoomFragment_4.I0(new ArrayList(), true);
        }
        BattleArea battleArea = this.f38715j2;
        if (battleArea != null) {
            this.N1 = battleArea;
        }
        t2();
        this.B1.setVisibility(8);
        this.f38723p2.setVisibility(0);
        this.f38720o2.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void M1() {
        ViewPager viewPager;
        com.wufan.user.service.protobuf.n0 accountData = AccountUtil_.getInstance_(this).getAccountData();
        if (!g2.h(accountData.getNickname()) && (!accountData.getAccount().equals(accountData.getNickname()) || !accountData.getAccount().startsWith("pa"))) {
            x xVar = this.f38719n2;
            if (xVar == null || (viewPager = this.G1) == null) {
                return;
            }
            Fragment item = xVar.getItem(viewPager.getCurrentItem());
            if (item instanceof StandardEliteRoomFragment) {
                ((StandardEliteRoomFragment) item).q0();
                return;
            }
            return;
        }
        IntentUtil.getInstance().goChangeNickname(this);
    }

    public void M2() {
        if (this.G1.getCurrentItem() == 0) {
            K2(false);
        } else if (this.G1.getCurrentItem() != 1 || this.K1 == null) {
        } else {
            K2(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void N1() {
        if (this.f38717l2 == null || !com.join.android.app.common.utils.j.j(this) || this.J1 == null) {
            return;
        }
        com.wufan.user.service.protobuf.n0 accountData = AccountUtil_.getInstance_(this).getAccountData();
        if (!g2.h(accountData.getNickname()) && (!accountData.getAccount().equals(accountData.getNickname()) || !accountData.getAccount().startsWith("pa"))) {
            if (this.E2 > 0 && System.currentTimeMillis() - this.E2 <= 1000) {
                I2("btnFastGame so fast ,waiting a moment!");
                return;
            }
            this.E2 = System.currentTimeMillis();
            this.J1.Y0();
            return;
        }
        IntentUtil.getInstance().goChangeNickname(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void O1() {
        x xVar = this.f38719n2;
        if (xVar == null) {
            return;
        }
        ((StandardEliteRoomFragment) xVar.getItem(this.G1.getCurrentItem())).H0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void O2() {
        try {
            String token = this.F2.getAccountData().getToken();
            ResultArenaBean<ArenaLobbyServer> P = this.J2.P(this.F2.getAccountData().getUid(), token);
            if (P != null && P.getError() == 0 && P.getData() != null && P.getData().getDisabled() != 0) {
                ArenaResponse arenaResponse = new ArenaResponse();
                arenaResponse.errorType = 1001;
                arenaResponse.errorInfo = P.getData().getDisabledMessage();
                handleFailure(arenaResponse);
                return;
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        v2();
        g2();
    }

    boolean P1(com.join.mgps.customview.y yVar, View view) {
        boolean booleanValue;
        w0.e("v.setOnClickListener");
        if (yVar == null) {
            return true;
        }
        View view2 = yVar.f48976u;
        if (view2 != null && view2 != view) {
            view2.setTag(Boolean.FALSE);
        }
        if (view.getTag() == null) {
            view.setTag(Boolean.TRUE);
            booleanValue = false;
        } else {
            booleanValue = ((Boolean) view.getTag()).booleanValue();
        }
        if (booleanValue && !this.f38714i2) {
            view.setTag(Boolean.FALSE);
            return false;
        }
        view.setTag(Boolean.TRUE);
        this.f38714i2 = false;
        return true;
    }

    void R1() {
        Intent intent = new Intent(this, ArenaService_.class);
        intent.setAction(ArenaConstants.ACTION_CANCEL_SUBSCRIBE);
        startService(intent);
    }

    Fragment R2(int i4, ArenaGameRoomListConfig arenaGameRoomListConfig) {
        if (i4 == 0) {
            if (this.J1 == null) {
                StandardEliteRoomFragment_ standardEliteRoomFragment_ = new StandardEliteRoomFragment_();
                this.J1 = standardEliteRoomFragment_;
                standardEliteRoomFragment_.O0(this.f38732z2);
                Bundle bundle = new Bundle();
                bundle.putBoolean("isElite", false);
                if (this.E1) {
                    bundle.putString("filterGameId", this.N.getGame_id());
                }
                this.J1.setArguments(bundle);
            }
            return this.J1;
        } else if (i4 != 1) {
            if (i4 == 2) {
                if (this.L1 == null) {
                    this.L1 = new RaceRoomFragment_();
                }
                return this.L1;
            }
            return null;
        } else if (arenaGameRoomListConfig.getCurrent_collection_cfg().getElite_match_switch() == 1) {
            if (this.K1 == null) {
                StandardEliteRoomFragment_ standardEliteRoomFragment_2 = new StandardEliteRoomFragment_();
                this.K1 = standardEliteRoomFragment_2;
                standardEliteRoomFragment_2.O0(this.f38732z2);
                Bundle bundle2 = new Bundle();
                bundle2.putBoolean("isElite", true);
                this.K1.setArguments(bundle2);
            }
            return this.K1;
        } else {
            if (this.L1 == null) {
                this.L1 = new RaceRoomFragment_();
            }
            return this.L1;
        }
    }

    boolean S1() {
        if (com.join.android.app.common.utils.j.j(this)) {
            return true;
        }
        showToast("当前网络不可用，请检查网络!");
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void S2() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void T2(int i4) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.W1.getLayoutParams();
        if (i4 == 1) {
            this.X1.setVisibility(8);
            findViewById(R.id.ll_title_content).setOnClickListener(new b());
        } else {
            this.X1.setVisibility(8);
        }
        this.W1.setLayoutParams(layoutParams);
    }

    public void U2(FriendBean friendBean) {
        this.V2 = friendBean;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void V1() {
        IntentUtil.getInstance().goLoginBattle(this);
    }

    void V2(String str, int i4) {
        int intValue = (this.Z1.containsKey(str) ? this.Z1.get(str).intValue() : 0) + i4;
        this.Z1.put(str, Integer.valueOf(intValue >= 0 ? intValue : 0));
    }

    void X1() {
        this.Z1.clear();
        this.f38706a2.clear();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void X2(BattleArea battleArea) {
        ArenaGameRoomListConfig arenaGameRoomListConfig;
        if (battleArea == null) {
            return;
        }
        this.f38715j2 = battleArea;
        if (this.R1 == 0) {
            this.R1 = battleArea.getNumber();
        }
        com.join.mgps.socket.fight.arena.b bVar = this.M1;
        if (bVar == null || bVar.d() == null || !this.M1.d().s() || (arenaGameRoomListConfig = this.f38717l2) == null || arenaGameRoomListConfig.getCurrent_collection_cfg().getBattle_area() != 1) {
            return;
        }
        this.P.setText(n2());
    }

    public void Y1(String str, boolean z4) {
        if (S1()) {
            if (z4) {
                if (!this.Q1) {
                    return;
                }
            } else if (!this.P1) {
                return;
            }
            c3("正在创建房间...");
            Q1();
            this.H2.start();
            if (z4) {
                f2(str);
            } else {
                i3(str, 0);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void Y2() {
        this.B1.setVisibility(8);
        this.f38723p2.setVisibility(8);
        this.f38720o2.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void Z1(boolean z4, boolean z5) {
        if (!z4) {
            if (z5) {
                this.T1 = true;
            }
            k3(1, z5);
        } else {
            ArenaGameRoomListConfig arenaGameRoomListConfig = this.f38717l2;
            if (arenaGameRoomListConfig != null && arenaGameRoomListConfig.getCurrent_collection_cfg().getElite_match_switch() == 1) {
                if (z5) {
                    this.U1 = true;
                }
                k3(2, z5);
            }
        }
        if (z5) {
            return;
        }
        d3();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void a2() {
        this.y2.removeMessages(1);
        Dialog dialog = this.f38725r2;
        if (dialog == null || !dialog.isShowing() || this.f38724q2) {
            return;
        }
        this.f38725r2.dismiss();
    }

    public void a3(boolean z4) {
        t2.a aVar = this.K2;
        if (aVar != null) {
            aVar.l(z4);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterViews() {
        if (this.N == null) {
            finish();
            return;
        }
        this.G2 = com.join.mgps.rpc.impl.d.P1();
        this.J2 = com.join.mgps.rpc.impl.l.n0();
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 28) {
            WindowManager.LayoutParams attributes = getWindow().getAttributes();
            attributes.layoutInDisplayCutoutMode = 1;
            getWindow().setAttributes(attributes);
        }
        L1(this.D2);
        if (i4 >= 28) {
            try {
                getWindow().getDecorView().setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: com.join.mgps.activity.arena.a
                    @Override // android.view.View.OnApplyWindowInsetsListener
                    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                        WindowInsets D2;
                        D2 = GameRoomListActivity.this.D2(view, windowInsets);
                        return D2;
                    }
                });
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
        this.f38709d2 = new com.join.mgps.socket.fight.arena.a(this, new q());
        this.T.setOnClickListener(new r());
        this.W.setOnClickListener(new s());
        this.Z.setOnClickListener(new t());
        this.M1 = new com.join.mgps.socket.fight.arena.b(this, this.O1);
        this.f38720o2.setOnClickListener(new u());
        this.U.setVisibility(8);
        this.X.setVisibility(8);
        this.f38722p1.setVisibility(8);
        if (com.join.android.app.common.utils.j.j(this)) {
            d3();
            O2();
        } else {
            Y2();
        }
        if (this.H1.firstArenaFilterVisit().e(Boolean.TRUE).booleanValue()) {
            this.C1.setImageDrawable(getResources().getDrawable(R.drawable.icon_list));
        }
        x2();
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        this.f38710e2 = supportFragmentManager;
        try {
            supportFragmentManager.beginTransaction().commit();
        } catch (Exception e6) {
            e6.printStackTrace();
        }
        o2();
    }

    public void b2(long j4) {
        if (S1() && this.f38717l2 != null && this.P1) {
            Dialog dialog = this.f38725r2;
            if (dialog != null && dialog.isShowing()) {
                this.f38725r2.dismiss();
            }
            Z2();
            this.M1.f(ArenaRequestFactory.fastJoinRoom(ArenaConstants.REGISTER_TYPE_GAMELIST, j4, Integer.parseInt(this.f38717l2.getCurrent_collection_cfg().getCollection_id())));
        }
    }

    public void c2() {
        com.papa.sim.statistic.p l4 = com.papa.sim.statistic.p.l(this.P2);
        Event event = Event.JoinLobbyroom;
        Ext uid = new Ext().setUid(AccountUtil_.getInstance_(this.P2).getAccountData().getUid());
        l4.O1(event, uid.setGameId(this.v2.getGameId() + "").setPosition("1"));
        GameRoomActivity_.V2(this).g(true).h(this.f38730w2).d(this.v2.getGameName()).i(this.v2).start();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void close() {
        w2();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void d2() {
        Q1();
        u2();
        com.join.mgps.socket.fight.arena.a aVar = this.f38709d2;
        if (aVar != null) {
            aVar.w();
        }
        a2();
        finish();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void d3() {
        this.B1.setVisibility(8);
        this.f38723p2.setVisibility(0);
        this.f38720o2.setVisibility(8);
        this.f38729v1.setText("数据加载中...");
        this.A1.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void e2() {
        showToast("获取游戏配置信息失败！");
        new Handler().postDelayed(new a(), 1000L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void e3() {
        IntentUtil.getInstance().goLoginBattle(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void f2(String str) {
        try {
            ResultArenaBean<BattleChallengeConfig> E = this.J2.E(this.F2.getAccountData().getUid(), this.F2.getAccountData().getToken(), Long.parseLong(str));
            if (E != null && E.getData() != null) {
                this.I2 = E.getData();
                if (E.getError() == 701) {
                    V1();
                    return;
                } else if (this.I2.getIsBattle()) {
                    i3(str, 50);
                    return;
                } else {
                    i3(str, 500);
                    return;
                }
            }
            u2();
            Q1();
            if (E != null && E.getError() == 701) {
                V1();
            } else {
                showToast("系统错误!");
            }
        } catch (Exception unused) {
            Q1();
            u2();
            if (!com.join.android.app.common.utils.j.j(this)) {
                showToast("当前网络不可用，请检查网络!");
            } else {
                showToast("创建房间失败，请重试！");
            }
        }
    }

    @UiThread
    public void f3() {
        this.B1.setVisibility(8);
        this.f38723p2.setVisibility(0);
        this.f38720o2.setVisibility(8);
        this.f38729v1.setText("暂无游戏房间");
        this.A1.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void g2() {
        String collection_id;
        int i4;
        try {
            if (TextUtils.isEmpty(this.N.getCollection_id())) {
                collection_id = this.N.getGame_id();
                i4 = 1;
            } else {
                collection_id = this.N.getCollection_id();
                i4 = 2;
            }
            ResultMainBean<ArenaGameRoomListConfig> q4 = this.G2.q(RequestBeanUtil.getInstance(this).getRequestArenaRoomListArgs(collection_id, i4));
            if (q4 != null && q4.getMessages().getData() != null) {
                if (q4.getMessages().getData().getCurrent_collection_cfg() == null) {
                    e2();
                    return;
                }
                String collection_id2 = q4.getMessages().getData().getCurrent_collection_cfg().getCollection_id();
                if (!TextUtils.isEmpty(collection_id2) && Integer.parseInt(collection_id2) > 0) {
                    if (q4.getMessages().getData().getGame_list() != null && q4.getMessages().getData().getGame_list().size() > 0) {
                        this.N.setCollection_id(collection_id2);
                        ArenaGameRoomListConfig data = q4.getMessages().getData();
                        this.f38717l2 = data;
                        z2(data);
                        return;
                    }
                    e2();
                    return;
                }
                e2();
                return;
            }
            showToast("获取游戏配置信息失败！");
            Y2();
        } catch (Exception e5) {
            I2("get game config exception:" + e5.getMessage());
            e2();
        }
    }

    void g3(View view) {
        if (this.N1 == null) {
            return;
        }
        List<GameInfoBean> list = this.T2;
        if (list != null && list.size() > 0) {
            this.O2.setVisibility(0);
            try {
                if (this.T2 != null) {
                    int i4 = this.U2;
                    if (i4 != -1024) {
                        this.N2.scrollToPosition(i4);
                    } else {
                        for (int i5 = 0; i5 < this.T2.size(); i5++) {
                            if (this.T2.get(i5).getCollection_id().equals(this.N.getCollection_id())) {
                                this.N2.scrollToPosition(i5);
                            }
                        }
                    }
                }
            } catch (Exception e5) {
                e5.printStackTrace();
            }
            w0();
            return;
        }
        x0();
    }

    public ArenaGameRoomListConfig h2() {
        return this.f38717l2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void handleFailure(ArenaResponse arenaResponse) {
        u2();
        int i4 = arenaResponse.errorType;
        if (i4 == 16) {
            this.f38709d2.D(com.join.mgps.socket.fight.arena.a.f54752j, 257, Integer.valueOf(arenaResponse.errorType), "无法加入，你被禁止加入该房间", "确定");
        } else if (i4 == 17) {
            this.f38709d2.D(com.join.mgps.socket.fight.arena.a.f54752j, 257, Integer.valueOf(arenaResponse.errorType), "该房间为比赛专用房间,非参赛选手无法加入", "我知道了");
        } else if (i4 == 9) {
            this.f38709d2.D(com.join.mgps.socket.fight.arena.a.f54752j, 257, Integer.valueOf(arenaResponse.errorType), "房间人数已满你无法加入房间!", "确定");
        } else if (i4 == 7) {
            this.f38709d2.D(com.join.mgps.socket.fight.arena.a.f54752j, 256, Integer.valueOf(arenaResponse.errorType), "密码输入错误，请重试!", "取消", "确定", arenaResponse);
        } else if (i4 == 8) {
            N2(arenaResponse);
            this.f38709d2.D(com.join.mgps.socket.fight.arena.a.f54752j, 257, Integer.valueOf(arenaResponse.errorType), "房间已经被解散!", "确定");
        } else if (i4 == 11) {
            this.f38709d2.D(com.join.mgps.socket.fight.arena.a.f54752j, 257, Integer.valueOf(arenaResponse.errorType), "铜板不足，无法创建房间!", "确定");
        } else if (i4 == 13) {
            this.f38709d2.D(com.join.mgps.socket.fight.arena.a.f54752j, 257, Integer.valueOf(arenaResponse.errorType), "铜板不足，无法加入房间", "确定");
        } else if (i4 == 10) {
            b3(arenaResponse);
        } else if (i4 == 1001) {
            this.f38709d2.D(com.join.mgps.socket.fight.arena.a.f54752j, Integer.valueOf((int) com.join.mgps.socket.fight.arena.a.f54751i), Integer.valueOf(arenaResponse.errorType), arenaResponse.errorInfo, "确定");
        } else {
            String g4 = com.join.mgps.socket.fight.arena.c.g(arenaResponse);
            if (arenaResponse.responseType == ArenaConstants.ArenaCommand.CMD_QUICK_JOIN_ROOM) {
                this.f38731x2 = "快速加入房间失败 " + g4 + " , 请重试!";
                return;
            }
            showToast(g4);
            if (arenaResponse.responseType == ArenaConstants.ArenaCommand.CMD_SUBSCRIBE_GAME_ROOMLIST) {
                d2();
                return;
            }
            ArenaRequest arenaRequest = arenaResponse.request;
            if (arenaRequest == null || !arenaRequest.isRefreshing) {
                return;
            }
            j3(arenaRequest.isElite);
        }
    }

    public String i2() {
        z zVar = this.Q2;
        GameInfoBean b5 = zVar != null ? zVar.b() : null;
        return b5 != null ? b5.getCollection_id() : "";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void i3(String str, int i4) {
        I2("startCreateRoom gameId:" + str);
        this.M1.f(ArenaRequestFactory.createRoom(ArenaConstants.REGISTER_TYPE_GAMELIST, str, i4, this.F2.getAccountData().getUid()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void iv_back() {
        if (this.O) {
            finish();
            return;
        }
        NewArenaMainActivty_.g1(this).start();
        finish();
    }

    public List<GameInfoBean> j2() {
        return this.S2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void j3(boolean z4) {
        if (z4) {
            StandardEliteRoomFragment_ standardEliteRoomFragment_ = this.K1;
            if (standardEliteRoomFragment_ != null) {
                standardEliteRoomFragment_.b1();
                return;
            }
            return;
        }
        StandardEliteRoomFragment_ standardEliteRoomFragment_2 = this.J1;
        if (standardEliteRoomFragment_2 != null) {
            standardEliteRoomFragment_2.b1();
        }
    }

    public FriendBean k2() {
        return this.V2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void k3(int i4, boolean z4) {
        ArenaRequest subscribeRoomList = ArenaRequestFactory.subscribeRoomList(ArenaConstants.REGISTER_TYPE_GAMELIST, Integer.parseInt(this.f38717l2.getCurrent_collection_cfg().getCollection_id()), i4);
        subscribeRoomList.isRefreshing = z4;
        if (i4 == 1) {
            this.f38707b2 = true;
            subscribeRoomList.roomType = 1;
            subscribeRoomList.isElite = false;
        } else {
            this.f38708c2 = true;
            subscribeRoomList.roomType = 2;
            subscribeRoomList.isElite = true;
        }
        this.M1.f(subscribeRoomList);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void l3(AreaOnlinePeopleCount areaOnlinePeopleCount) {
        try {
            if (TextUtils.isEmpty(n2()) || TextUtils.isEmpty(this.P.getText()) || n2().equals(this.P.getText())) {
                return;
            }
            this.P.setText(n2());
        } catch (Exception e5) {
            e5.printStackTrace();
            this.P.setText(n2());
        }
    }

    public float m2() {
        int identifier = getResources().getIdentifier("status_bar_height", "dimen", q.a.f73126a);
        if (identifier > 0) {
            return getResources().getDimension(identifier);
        }
        return 0.0f;
    }

    void m3() {
        this.P.setText(n2());
        if (h2() != null && h2().getGame_list() != null && h2().getGame_list().size() > 0) {
            for (GameConfig gameConfig : h2().getGame_list()) {
                if (this.Z1.containsKey(gameConfig.getGame_id())) {
                    gameConfig.setRoom_count(this.Z1.get(gameConfig.getGame_id()).intValue());
                }
            }
            com.join.mgps.customview.y yVar = this.f38713h2;
            if (yVar != null) {
                yVar.c(h2().getGame_list());
                return;
            }
            return;
        }
        com.join.mgps.customview.y yVar2 = this.f38713h2;
        if (yVar2 != null) {
            yVar2.c(new ArrayList());
        }
    }

    @Override // com.join.mgps.activity.FriendActivity, com.join.mgps.adapter.FriendListAdapter.b
    public void n(FriendBean friendBean) {
        super.n(friendBean);
    }

    public String n2() {
        com.join.mgps.socket.fight.arena.b bVar;
        ArenaGameRoomListConfig arenaGameRoomListConfig = this.f38717l2;
        String str = "";
        if (arenaGameRoomListConfig == null) {
            finish();
            return "";
        }
        boolean z4 = arenaGameRoomListConfig.getCurrent_collection_cfg().getBattle_area() == 0;
        if (this.f38715j2 != null && this.f38717l2 != null && !z4 && (bVar = this.M1) != null && bVar.d() != null && this.M1.d().s() && this.f38715j2 != BattleArea.ALL) {
            str = "" + com.join.mgps.socket.fight.arena.c.d(this.f38715j2);
        }
        if (h2() != null && h2().getGame_list() != null && h2().getGame_list().size() > 0) {
            if (this.f38717l2 != null && !z4) {
                str = str + ",";
            }
            str = str + h2().getGame_list().size() + "款游戏";
        }
        if (this.Y1 > 0) {
            return str + "," + this.Y1 + "个房间";
        }
        return str;
    }

    void n3() {
        ArrayList arrayList = new ArrayList();
        StandardEliteRoomFragment_ standardEliteRoomFragment_ = this.J1;
        if (standardEliteRoomFragment_ != null) {
            arrayList.addAll(standardEliteRoomFragment_.u0());
        }
        StandardEliteRoomFragment_ standardEliteRoomFragment_2 = this.K1;
        if (standardEliteRoomFragment_2 != null) {
            arrayList.addAll(standardEliteRoomFragment_2.u0());
        }
        this.Y1 = arrayList.size();
        m3();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread(delay = 500)
    public void o2() {
        com.wufan.user.service.protobuf.n0 accountData = AccountUtil_.getInstance_(this).getAccountData();
        CollectionCommentRequest collectionCommentRequest = new CollectionCommentRequest();
        collectionCommentRequest.setCollection_id(this.N.getCollection_id());
        collectionCommentRequest.setUid(accountData.getUid());
        com.join.mgps.rpc.impl.d.P1().O1().N1(RequestBeanUtil.getInstance(this).getDefalutRequestBean(collectionCommentRequest)).enqueue(new l());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void o3(ArenaResponse arenaResponse, boolean z4) {
        ArenaGameRoomListConfig arenaGameRoomListConfig;
        RoomCounter roomCounter = (RoomCounter) ((Object[]) arenaResponse.data)[0];
        if (z4 || this.f38708c2 || (arenaGameRoomListConfig = this.f38717l2) == null || arenaGameRoomListConfig.getCurrent_collection_cfg().getElite_match_switch() != 1) {
            return;
        }
        if (roomCounter.getElite() > 0) {
            TextView textView = this.X;
            textView.setText("（" + roomCounter.getElite() + "房）");
            return;
        }
        this.X.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.join.mgps.activity.FriendActivity, com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i4, int i5, Intent intent) {
        super.onActivityResult(i4, i5, intent);
        try {
            if (i5 == -1) {
                if (i4 == 1015) {
                    com.papa.sim.statistic.p l4 = com.papa.sim.statistic.p.l(this.P2);
                    Event event = Event.JoinLobbyroom;
                    Ext uid = new Ext().setUid(AccountUtil_.getInstance_(this.P2).getAccountData().getUid());
                    l4.O1(event, uid.setGameId(this.v2.getGameId() + "").setPosition("1"));
                    GameRoomActivity_.V2(this).g(true).h(this.f38730w2).d(this.v2.getGameName()).i(this.v2).start();
                } else if (i4 != 1014 || intent == null) {
                } else {
                    String stringExtra = intent.getStringExtra("gameId");
                    if (g2.i(stringExtra)) {
                        b2(Long.parseLong(stringExtra));
                    }
                }
            } else if (i4 != 10001 || intent == null) {
            } else {
                GameInfoBean gameInfoBean = (GameInfoBean) intent.getSerializableExtra("mGameInfo");
                if (gameInfoBean != null) {
                    this.N = gameInfoBean;
                    g2();
                }
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.join.mgps.activity.FriendActivity, com.BaseActivity, com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f31376j = "BATTLE_ROOM_LIST";
        GameInfoBean gameInfoBean = this.N;
        if (gameInfoBean != null) {
            this.f31375i = gameInfoBean.getGame_id();
        }
        super.onCreate(bundle);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.join.mgps.activity.FriendActivity, com.BaseActivity, com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        Q1();
        u2();
        com.join.mgps.socket.fight.arena.a aVar = this.f38709d2;
        if (aVar != null) {
            aVar.w();
        }
        a2();
        R1();
        com.join.mgps.socket.fight.arena.b bVar = this.M1;
        if (bVar != null && bVar.d() != null) {
            this.M1.d().A(this.S1);
        }
        com.join.mgps.socket.fight.arena.b bVar2 = this.M1;
        if (bVar2 != null) {
            bVar2.g();
        }
        super.onDestroy();
        this.f38724q2 = true;
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i4, KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() == 4) {
            iv_back();
            return true;
        }
        return super.onKeyDown(i4, keyEvent);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void p2(Notification notification) {
        if (notification != null) {
            this.B1.setVisibility(0);
            this.F1.setText(notification.getMessage());
            this.B1.setOnClickListener(new p(notification));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void p3(int i4, boolean z4) {
        ArenaGameRoomListConfig arenaGameRoomListConfig;
        try {
            if (z4) {
                if (i4 > 0) {
                    return;
                }
                this.X.setVisibility(8);
            } else if (i4 <= 0) {
                this.U.setVisibility(8);
            } else if (this.f38718m2 && (arenaGameRoomListConfig = this.f38717l2) != null) {
                this.Q.setText(arenaGameRoomListConfig.getCurrent_collection_cfg().getTitle());
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void q2(ArenaResponse arenaResponse, boolean z4) {
        List<SimpleRoom> list;
        ArenaGameRoomListConfig arenaGameRoomListConfig;
        if (arenaResponse == null) {
            return;
        }
        synchronized (this.V1) {
            if (f38701c3) {
                ArrayList arrayList = new ArrayList();
                for (int i4 = 0; i4 < 20; i4++) {
                    int i5 = i4 + 100;
                    SimpleRoom.Builder challengeCoins = SimpleRoom.newBuilder().setAllowPeripheralJoin(true).setAllowSpectatorJoin(true).setCopper(i5).setPlaySeconds((i4 * 5) + 10).setState(RoomState.START).setHasPeripheralPlayer(true).setChallengeCoins(i5);
                    arrayList.add(challengeCoins.setNickname("hulaoda" + i4).build());
                }
                StandardEliteRoomFragment_ standardEliteRoomFragment_ = this.J1;
                if (standardEliteRoomFragment_ != null) {
                    standardEliteRoomFragment_.n0(arrayList, true);
                }
                return;
            }
            if (z4) {
                list = (List) ((Object[]) arenaResponse.data)[1];
            } else {
                list = (List) arenaResponse.data;
            }
            I2("---handlePushRoomListData--data print  begin ");
            X1();
            for (SimpleRoom simpleRoom : list) {
                com.join.mgps.socket.fight.arena.c.r(Y2, simpleRoom);
                LinkedHashMap<String, SimpleRoom> linkedHashMap = this.f38706a2;
                linkedHashMap.put(simpleRoom.getRoomId() + "", simpleRoom);
                V2(simpleRoom.getGameId() + "", 1);
            }
            I2("---handlePushRoomListData--data print  end ");
            I2("handlePushRoomListData ---response.request: " + arenaResponse.request.toString());
            if (arenaResponse.request.roomType == 1) {
                if (this.J1 != null && this.f38707b2) {
                    if (this.T1) {
                        this.T1 = false;
                        this.J1.I0(list, this.P1);
                    } else {
                        this.J1.n0(list, this.P1);
                    }
                }
            } else if (this.K1 != null && this.f38708c2 && (arenaGameRoomListConfig = this.f38717l2) != null && arenaGameRoomListConfig.getCurrent_collection_cfg().getElite_match_switch() == 1) {
                if (this.U1) {
                    this.U1 = false;
                    this.K1.I0(list, this.Q1);
                } else {
                    this.K1.n0(list, this.Q1);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void r2(List<SimpleRoom> list) {
        ArenaGameRoomListConfig arenaGameRoomListConfig;
        StandardEliteRoomFragment_ standardEliteRoomFragment_;
        StandardEliteRoomFragment_ standardEliteRoomFragment_2;
        synchronized (this.V1) {
            if (f38701c3) {
                return;
            }
            I2("---handleRoomListDelete--data print  begin ");
            for (SimpleRoom simpleRoom : list) {
                com.join.mgps.socket.fight.arena.c.r(Y2, simpleRoom);
            }
            I2("---handleRoomListDelete--data print  end ");
            ArrayList<SimpleRoom> arrayList = new ArrayList<>();
            ArrayList<SimpleRoom> arrayList2 = new ArrayList<>();
            for (SimpleRoom simpleRoom2 : list) {
                if (simpleRoom2.getElite()) {
                    arrayList2.add(simpleRoom2);
                } else {
                    arrayList.add(simpleRoom2);
                }
                synchronized (this.f38706a2) {
                    LinkedHashMap<String, SimpleRoom> linkedHashMap = this.f38706a2;
                    linkedHashMap.remove(simpleRoom2.getRoomId() + "");
                    V2(simpleRoom2.getGameId() + "", -1);
                }
            }
            m3();
            if (this.f38707b2 && this.P1 && (standardEliteRoomFragment_2 = this.J1) != null) {
                standardEliteRoomFragment_2.e1(arrayList);
            }
            if (this.f38708c2 && this.Q1 && (arenaGameRoomListConfig = this.f38717l2) != null && arenaGameRoomListConfig.getCurrent_collection_cfg().getElite_match_switch() == 1 && (standardEliteRoomFragment_ = this.K1) != null) {
                standardEliteRoomFragment_.e1(arrayList2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void s2(List<SimpleRoom> list) {
        ArenaGameRoomListConfig arenaGameRoomListConfig;
        StandardEliteRoomFragment_ standardEliteRoomFragment_;
        StandardEliteRoomFragment_ standardEliteRoomFragment_2;
        synchronized (this.V1) {
            if (f38701c3) {
                return;
            }
            I2("---handleRoomListUpdate--data print  begin ");
            for (SimpleRoom simpleRoom : list) {
                com.join.mgps.socket.fight.arena.c.r(Y2, simpleRoom);
            }
            I2("---handleRoomListUpdate--data print  end ");
            ArrayList<SimpleRoom> arrayList = new ArrayList<>();
            ArrayList<SimpleRoom> arrayList2 = new ArrayList<>();
            for (SimpleRoom simpleRoom2 : list) {
                if (simpleRoom2.getElite()) {
                    arrayList2.add(simpleRoom2);
                } else {
                    arrayList.add(simpleRoom2);
                }
            }
            synchronized (this.f38706a2) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                int size = list.size();
                for (int i4 = 0; i4 < size; i4++) {
                    SimpleRoom simpleRoom3 = list.get(i4);
                    LinkedHashMap<String, SimpleRoom> linkedHashMap3 = this.f38706a2;
                    if (linkedHashMap3.containsKey(simpleRoom3.getRoomId() + "")) {
                        linkedHashMap2.put(simpleRoom3.getRoomId() + "", simpleRoom3);
                    } else {
                        linkedHashMap.put(simpleRoom3.getRoomId() + "", simpleRoom3);
                        V2(simpleRoom3.getGameId() + "", 1);
                    }
                }
                for (int i5 = 0; i5 < linkedHashMap2.size(); i5++) {
                    SimpleRoom simpleRoom4 = (SimpleRoom) linkedHashMap2.get(Integer.valueOf(i5));
                    if (simpleRoom4 != null) {
                        LinkedHashMap<String, SimpleRoom> linkedHashMap4 = this.f38706a2;
                        if (linkedHashMap4.containsKey(simpleRoom4.getRoomId() + "")) {
                            LinkedHashMap<String, SimpleRoom> linkedHashMap5 = this.f38706a2;
                            linkedHashMap5.put(simpleRoom4.getRoomId() + "", simpleRoom4);
                        }
                    }
                }
                if (linkedHashMap.size() > 0) {
                    this.f38706a2.putAll(linkedHashMap);
                }
            }
            if (this.f38707b2 && this.P1 && (standardEliteRoomFragment_2 = this.J1) != null) {
                standardEliteRoomFragment_2.f1(arrayList);
            }
            if (this.f38708c2 && this.Q1 && (arenaGameRoomListConfig = this.f38717l2) != null && arenaGameRoomListConfig.getCurrent_collection_cfg().getElite_match_switch() == 1 && (standardEliteRoomFragment_ = this.K1) != null) {
                standardEliteRoomFragment_.f1(arrayList2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showToast(String str) {
        if (A2()) {
            return;
        }
        l2.a(this).b(str);
    }

    void t2() {
        ArenaGameRoomListConfig arenaGameRoomListConfig;
        ArenaGameRoomListConfig arenaGameRoomListConfig2;
        com.join.mgps.socket.fight.arena.b bVar = this.M1;
        if (bVar != null && bVar.d() != null && this.M1.d().s()) {
            if (this.G1.getCurrentItem() == 1 && (arenaGameRoomListConfig2 = this.f38717l2) != null && arenaGameRoomListConfig2.getCurrent_collection_cfg().getElite_match_switch() == 1) {
                Z1(true, false);
                return;
            } else {
                Z1(false, false);
                return;
            }
        }
        ArenaRequest login = ArenaRequestFactory.login(ArenaConstants.REGISTER_TYPE_GAMELIST);
        login.isRefreshing = false;
        if (this.G1.getCurrentItem() == 1 && (arenaGameRoomListConfig = this.f38717l2) != null && arenaGameRoomListConfig.getCurrent_collection_cfg().getElite_match_switch() == 1) {
            login.isElite = true;
            login.roomType = 2;
        } else {
            login.isElite = false;
            login.roomType = 1;
        }
        this.M1.f(login);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void u2() {
        d1 d1Var = this.A2;
        if (d1Var == null || !d1Var.isShowing()) {
            return;
        }
        this.A2.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void v2() {
        this.B1.setVisibility(8);
        this.f38723p2.setVisibility(8);
        this.f38720o2.setVisibility(8);
    }

    void w0() {
        String collection_id;
        int i4;
        try {
            if (TextUtils.isEmpty(this.N.getCollection_id())) {
                collection_id = this.N.getGame_id();
                i4 = 1;
            } else {
                collection_id = this.N.getCollection_id();
                i4 = 2;
            }
            com.join.mgps.rpc.impl.d.P1().O1().q(RequestBeanUtil.getInstance(this).getRequestArenaRoomListArgs(collection_id, i4)).enqueue(new i());
        } catch (Exception unused) {
            e2();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void z2(ArenaGameRoomListConfig arenaGameRoomListConfig) {
        this.Q.setText(arenaGameRoomListConfig.getCurrent_collection_cfg().getTitle());
        T2(1);
        this.f38711f2.setVisibility(0);
        y2(arenaGameRoomListConfig);
        int l22 = l2(arenaGameRoomListConfig);
        x xVar = this.f38719n2;
        if (xVar == null) {
            this.f38719n2 = new x(arenaGameRoomListConfig, getSupportFragmentManager());
            this.G1.setOffscreenPageLimit(l22);
            this.G1.setAdapter(this.f38719n2);
            this.G1.setOnPageChangeListener(new c(arenaGameRoomListConfig));
        } else if (xVar != null) {
            xVar.f38758a = arenaGameRoomListConfig;
            this.f38719n2.notifyDataSetChanged();
        }
        this.G1.setCurrentItem(0);
        if (this.M1.e()) {
            t2();
        } else {
            this.M1.bindService();
        }
        ArenaGameRoomListConfig arenaGameRoomListConfig2 = this.f38717l2;
        if (arenaGameRoomListConfig2 == null || arenaGameRoomListConfig2.getCurrent_collection_cfg() == null) {
            return;
        }
        StandardEliteRoomFragment_ standardEliteRoomFragment_ = this.J1;
        if (standardEliteRoomFragment_ != null) {
            standardEliteRoomFragment_.B = this.f38717l2.getCurrent_collection_cfg().getOnly_show_mobile_gamers_room() == 1 ? 2 : 1;
        }
        StandardEliteRoomFragment_ standardEliteRoomFragment_2 = this.K1;
        if (standardEliteRoomFragment_2 != null) {
            standardEliteRoomFragment_2.B = this.f38717l2.getCurrent_collection_cfg().getOnly_show_mobile_gamers_room() == 1 ? 2 : 1;
        }
    }
}
