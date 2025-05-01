package com.join.mgps.activity;

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
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.SharedElementCallback;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.viewpager.widget.ViewPager;
import app.mgsim.arena.ArenaConstants;
import app.mgsim.arena.ArenaLobbyServer;
import app.mgsim.arena.ArenaRequest;
import app.mgsim.arena.ArenaRequestFactory;
import app.mgsim.arena.ArenaResponse;
import app.mgsim.arena.SocketError;
import app.mgsim.arena.SocketListener;
import com.facebook.drawee.view.SimpleDraweeView;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.google.android.material.tabs.TabLayout;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.join.android.app.common.utils.APKUtils;
import com.join.android.app.common.utils.JsonMapper;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.IntentDateBean;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.Util.RequestBeanUtil;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.activity.GameMainActivity4;
import com.join.mgps.activity.arena.GameRoomActivity;
import com.join.mgps.activity.arena.GameRoomActivity_;
import com.join.mgps.activity.arena.GameRoomListActivity_;
import com.join.mgps.activity.login.LoginSplashActivity_;
import com.join.mgps.adapter.j1;
import com.join.mgps.customview.NavigationAdapter;
import com.join.mgps.customview.WrapContentGridView;
import com.join.mgps.db.tables.EMUApkTable;
import com.join.mgps.db.tables.GameMainTable;
import com.join.mgps.db.tables.PlayGameTimeTable;
import com.join.mgps.dialog.c2;
import com.join.mgps.dto.ArchiveColudArgs;
import com.join.mgps.dto.ArchiveNumDataBean;
import com.join.mgps.dto.CommentAllListBean;
import com.join.mgps.dto.CommentResponse;
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
import com.join.mgps.dto.PspBattleServer;
import com.join.mgps.dto.RequestCommentAllListArgs;
import com.join.mgps.dto.RequestGameIdArgs;
import com.join.mgps.dto.RequestModel;
import com.join.mgps.dto.RequestSimulatorAchievementListArgs;
import com.join.mgps.dto.ResponseModel;
import com.join.mgps.dto.ResultArenaBean;
import com.join.mgps.dto.ResultResMainBean;
import com.join.mgps.dto.RomArchived;
import com.join.mgps.dto.SimulatorAllAchievementBean;
import com.join.mgps.dto.SimulatorMomentBean;
import com.join.mgps.enums.ConstantIntEnum;
import com.join.mgps.fragment.CloudListFragmentV2_;
import com.join.mgps.fragment.SimulatorGoldFingerFragment_;
import com.join.mgps.fragment.SimulatorIntroductionFragment_;
import com.join.mgps.fragment.SimulatorLaunchAchievementFragment_;
import com.join.mgps.fragment.SimulatorLaunchMomentFragment_;
import com.join.mgps.fragment.SimulatorRecommendFragment_;
import com.join.mgps.pref.PrefDef_;
import com.join.mgps.recycler.ViewPager2SlowScrollHelper;
import com.join.mgps.socket.fight.arena.a;
import com.join.mgps.socket.fight.arena.b;
import com.papa.sim.statistic.Event;
import com.papa91.arc.bean.AchievementBean;
import com.papa91.arc.bean.ButtonBean;
import com.papa91.arc.dialog.AchievmentTipsDialog;
import com.papa91.arc.http.utils.PrefUtil;
import com.papa91.battle.protocol.GameRoom;
import com.umeng.analytics.MobclickAgent;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import m.framework.ui.widget.asyncview.AsyncImageView;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.Extra;
import org.androidannotations.annotations.Fullscreen;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
import org.androidannotations.annotations.WindowFeature;
import org.androidannotations.annotations.sharedpreferences.Pref;
@WindowFeature({1})
@EActivity(R.layout.activity_game_main4)
@Fullscreen
/* loaded from: classes4.dex */
public class GameMainActivity4 extends FriendActivity implements j1.a {
    public static final String E2 = "动态";
    public static final String F2 = "成就";
    public static final String G2 = "存档商店";
    public static final String H2 = "攻略";
    public static final String I2 = "金手指";
    @ViewById
    ImageView A1;
    List<RomArchived> A2;
    @ViewById
    ImageView B1;
    @ViewById
    FrameLayout C1;
    private Context D1;
    ArchiveNumDataBean D2;
    List<PlayGameTimeTable> E1;
    private DownloadTask F1;
    List<PspBattleServer> H1;
    l I1;
    com.join.mgps.rpc.l J1;
    GameMainV4DataBean K1;
    private String L1;
    com.wufan.user.service.protobuf.n0 M1;
    @Extra
    String N;
    com.join.mgps.rpc.k N1;
    @Extra
    String O;
    @ViewById
    View P;
    @ViewById
    TextView Q;
    @ViewById
    TextView R;
    private com.join.mgps.socket.fight.arena.b R1;
    @ViewById
    View S;
    private com.join.mgps.socket.fight.arena.a S1;
    View T;
    private com.join.mgps.adapter.j1 T1;
    @ViewById
    GridView U;
    @ViewById
    SimpleDraweeView V;
    com.join.mgps.rpc.f V1;
    @ViewById
    View W;
    com.join.mgps.rpc.j W1;
    @ViewById
    TabLayout X;
    com.join.mgps.rpc.d X1;
    @ViewById
    ViewPager Y;
    private EmuOutResultReceiver Y1;
    @ViewById
    TextView Z;
    private FragmentManager Z1;

    /* renamed from: a2  reason: collision with root package name */
    private SimulatorRecommendFragment_ f32470a2;

    /* renamed from: b2  reason: collision with root package name */
    private SimulatorIntroductionFragment_ f32471b2;

    /* renamed from: c2  reason: collision with root package name */
    private SimulatorIntroductionFragment_ f32472c2;

    /* renamed from: d2  reason: collision with root package name */
    private com.join.mgps.adapter.c2 f32473d2;

    /* renamed from: e2  reason: collision with root package name */
    private Gson f32474e2;

    /* renamed from: f2  reason: collision with root package name */
    private int f32475f2;

    /* renamed from: g2  reason: collision with root package name */
    private int f32476g2;

    /* renamed from: i2  reason: collision with root package name */
    private AchievmentTipsDialog f32478i2;

    /* renamed from: j2  reason: collision with root package name */
    private com.join.mgps.dialog.c2 f32479j2;

    /* renamed from: k2  reason: collision with root package name */
    private NavigationAdapter f32480k2;

    /* renamed from: l2  reason: collision with root package name */
    private ArrayList<Fragment> f32481l2;

    /* renamed from: m2  reason: collision with root package name */
    private ArrayList<String> f32482m2;

    /* renamed from: n2  reason: collision with root package name */
    private ViewPager2SlowScrollHelper f32483n2;

    /* renamed from: o2  reason: collision with root package name */
    private boolean f32484o2;
    @ViewById

    /* renamed from: p0  reason: collision with root package name */
    WrapContentGridView f32485p0;
    @ViewById

    /* renamed from: p1  reason: collision with root package name */
    View f32486p1;
    @Pref

    /* renamed from: s2  reason: collision with root package name */
    PrefDef_ f32490s2;

    /* renamed from: t2  reason: collision with root package name */
    com.join.mgps.rpc.i f32491t2;

    /* renamed from: u2  reason: collision with root package name */
    int f32492u2;
    @ViewById

    /* renamed from: v1  reason: collision with root package name */
    FrameLayout f32493v1;
    private String G1 = "";
    private String O1 = "";
    private int P1 = 0;
    private String Q1 = "";
    private List<DynamicEntranceBean> U1 = new ArrayList();

    /* renamed from: h2  reason: collision with root package name */
    List<m> f32477h2 = new ArrayList();

    /* renamed from: p2  reason: collision with root package name */
    private boolean f32487p2 = false;

    /* renamed from: q2  reason: collision with root package name */
    Runnable f32488q2 = new e();

    /* renamed from: r2  reason: collision with root package name */
    private List<CommentAllListBean.GeneralCommentBean> f32489r2 = new ArrayList();
    List<GameMainCommunityBean.PostsBean> v2 = new ArrayList();

    /* renamed from: w2  reason: collision with root package name */
    private CountDownTimer f32494w2 = new g(com.join.mgps.data.c.f49010a, 1000);

    /* renamed from: x2  reason: collision with root package name */
    private final b.InterfaceC0385b f32495x2 = new h();
    private final SocketListener.NotifyObserver y2 = new i();

    /* renamed from: z2  reason: collision with root package name */
    public boolean f32496z2 = false;
    public boolean B2 = true;
    public boolean C2 = true;

    /* loaded from: classes4.dex */
    public class EmuOutResultReceiver extends BroadcastReceiver {
        public EmuOutResultReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            GameMainActivity4.this.I1();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GameMainActivity4.this.f32486p1.setVisibility(8);
            GameMainActivity4.this.C1.setVisibility(8);
            GameMainActivity4.this.f32493v1.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class b extends SharedElementCallback {
        b() {
        }

        @Override // androidx.core.app.SharedElementCallback
        public void onSharedElementEnd(List<String> list, List<View> list2, List<View> list3) {
            super.onSharedElementEnd(list, list2, list3);
            for (View view : list2) {
                if (view instanceof SimpleDraweeView) {
                    view.setVisibility(0);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class c extends a.b0 {
        c() {
        }

        @Override // com.join.mgps.socket.fight.arena.a.b0, com.join.mgps.socket.fight.arena.a.y
        public void W(int i4, int i5, Object obj) {
            super.W(i4, i5, obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class d implements ViewPager.OnPageChangeListener {
        d() {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i4) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i4, float f5, int i5) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i4) {
            GameMainActivity4.this.B1.setVisibility(8);
            GameMainActivity4.this.A1.setVisibility(8);
            if (!GameMainActivity4.E2.equals(GameMainActivity4.this.f32482m2.get(i4))) {
                if (GameMainActivity4.F2.equals(GameMainActivity4.this.f32482m2.get(i4))) {
                    GameMainActivity4.this.A1.setVisibility(0);
                    return;
                }
                return;
            }
            GameMainActivity4.this.B1.setVisibility(0);
        }
    }

    /* loaded from: classes4.dex */
    class e implements Runnable {

        /* loaded from: classes4.dex */
        class a extends LinearSmoothScroller {
            a(Context context) {
                super(context);
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.recyclerview.widget.LinearSmoothScroller
            public float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
                return super.calculateSpeedPerPixel(displayMetrics) * 30.0f;
            }

            @Override // androidx.recyclerview.widget.LinearSmoothScroller
            protected int getVerticalSnapPreference() {
                return -1;
            }
        }

        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a aVar = new a(GameMainActivity4.this.D1);
            GameMainActivity4.d1(GameMainActivity4.this);
            aVar.setTargetPosition(GameMainActivity4.this.f32475f2);
            GameMainActivity4 gameMainActivity4 = GameMainActivity4.this;
            if (gameMainActivity4.f31374h == null) {
                gameMainActivity4.f31374h = new Handler();
            }
            GameMainActivity4.this.f31374h.postDelayed(this, 3000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class f implements GameRoomActivity.x {
        f() {
        }

        @Override // com.join.mgps.activity.arena.GameRoomActivity.x
        public void onFail(int i4) {
            GameMainActivity4.this.k2();
        }

        @Override // com.join.mgps.activity.arena.GameRoomActivity.x
        public void onSuccess(int i4, int i5) {
            GameMainActivity4.this.k2();
        }

        @Override // com.join.mgps.activity.arena.GameRoomActivity.x
        public void onSuccess(int i4, int i5, ButtonBean buttonBean) {
        }
    }

    /* loaded from: classes4.dex */
    class g extends CountDownTimer {
        g(long j4, long j5) {
            super(j4, j5);
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            GameMainActivity4.this.N1();
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j4) {
        }
    }

    /* loaded from: classes4.dex */
    class h extends b.c {
        h() {
        }

        @Override // com.join.mgps.socket.fight.arena.b.c, com.join.mgps.socket.fight.arena.b.InterfaceC0385b
        public void a() {
            super.a();
        }

        @Override // com.join.mgps.socket.fight.arena.b.c, com.join.mgps.socket.fight.arena.b.InterfaceC0385b
        public void c() {
            super.c();
            if (GameMainActivity4.this.R1 == null || GameMainActivity4.this.R1.d() == null) {
                return;
            }
            GameMainActivity4.this.R1.d().z(GameMainActivity4.this.y2);
        }
    }

    /* loaded from: classes4.dex */
    class i implements SocketListener.NotifyObserver {
        i() {
        }

        @Override // app.mgsim.arena.SocketListener.NotifyObserver
        public void onError(SocketError socketError) {
            if (GameMainActivity4.this.P1()) {
                return;
            }
            int i4 = socketError.errorType;
            if (i4 == 6 || i4 == 2) {
                GameMainActivity4.this.i2();
            } else if (i4 == 5) {
                GameMainActivity4.this.i2();
            } else if (i4 == 3 || i4 == 4) {
                GameMainActivity4.this.i2();
            }
        }

        @Override // app.mgsim.arena.SocketListener.NotifyObserver
        public void onServerResponse(ArenaResponse arenaResponse) {
            if (GameMainActivity4.this.P1()) {
                return;
            }
            if (arenaResponse.responseCode == 0) {
                GameMainActivity4.this.handleFailure(arenaResponse);
            } else if (arenaResponse.responseType.equals(ArenaConstants.ArenaCommand.CMD_LOGIN)) {
                GameMainActivity4.this.w1();
            } else if (arenaResponse.responseType.equals(ArenaConstants.ArenaCommand.CMD_CREATE_GAME_ROOM) || arenaResponse.responseType.equals(ArenaConstants.ArenaCommand.CMD_JOIN_ROOM)) {
                GameMainActivity4.this.N1();
                GameRoom gameRoom = (GameRoom) arenaResponse.data;
                if (GameMainActivity4.this.R1 != null && GameMainActivity4.this.R1.d() != null) {
                    GameMainActivity4.this.R1.d().E(null);
                }
                if (arenaResponse.responseType.equals(ArenaConstants.ArenaCommand.CMD_CREATE_GAME_ROOM)) {
                    GameMainActivity4.this.n1();
                    GameRoomActivity_.V2(GameMainActivity4.this).d(gameRoom.getGameName()).i(gameRoom).c("game_main").start();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class j implements c2.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Fragment f32508a;

        j(Fragment fragment) {
            this.f32508a = fragment;
        }

        @Override // com.join.mgps.dialog.c2.a
        public void a(int i4) {
            ((SimulatorLaunchMomentFragment_) this.f32508a).f0(i4);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class k extends Dialog {

        /* renamed from: b  reason: collision with root package name */
        private ArrayList<AchievementBean.AchievementInfo> f32510b;

        public k(@NonNull Context context, ArrayList<AchievementBean.AchievementInfo> arrayList) {
            super(context);
            this.f32510b = arrayList;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void c(View view) {
            dismiss();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void d(View view) {
            GameMainActivity4.this.Y.setCurrentItem(1);
            dismiss();
        }

        @Override // android.app.Dialog
        protected void onCreate(Bundle bundle) {
            super.onCreate(bundle);
            setContentView(R.layout.dialog_achievement_done);
            Window window = getWindow();
            window.setBackgroundDrawableResource(AsyncImageView.DEFAULT_TRANSPARENT);
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.width = (int) GameMainActivity4.this.D1.getResources().getDimension(R.dimen.wdp610);
            attributes.height = (int) GameMainActivity4.this.D1.getResources().getDimension(R.dimen.wdp636);
            attributes.gravity = 17;
            window.setAttributes(attributes);
            window.getDecorView().setPadding(0, 0, 0, 0);
            ((ImageView) findViewById(R.id.ivClose)).setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.activity.f0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    GameMainActivity4.k.this.c(view);
                }
            });
            ((TextView) findViewById(R.id.tvToAll)).setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.activity.e0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    GameMainActivity4.k.this.d(view);
                }
            });
            ((TextView) findViewById(R.id.tvTitle)).setText("恭喜解锁" + this.f32510b.size() + "个新成就");
            ArrayList<AchievementBean.AchievementInfo> arrayList = this.f32510b;
            AchievementBean.AchievementInfo achievementInfo = arrayList.get(arrayList.size() + (-1));
            MyImageLoader.h((SimpleDraweeView) findViewById(R.id.ivAchievement), achievementInfo.getIcon());
            ((TextView) findViewById(R.id.tvAchievement)).setText(achievementInfo.getName());
            ((TextView) findViewById(R.id.tvRate)).setText(achievementInfo.getUnlock_rate() + "%玩家已解锁");
        }
    }

    /* loaded from: classes4.dex */
    class m {

        /* renamed from: a  reason: collision with root package name */
        public int f32515a;

        /* renamed from: c  reason: collision with root package name */
        public int f32517c;

        /* renamed from: e  reason: collision with root package name */
        public String f32519e;

        /* renamed from: b  reason: collision with root package name */
        public String f32516b = "#82888E";

        /* renamed from: d  reason: collision with root package name */
        public String f32518d = "#FFFFFF";

        m() {
        }
    }

    private ArchiveColudArgs A1() {
        if (this.M1 == null) {
            return RequestBeanUtil.getInstance(this.D1).getArchiveNum("", "", this.N);
        }
        RequestBeanUtil requestBeanUtil = RequestBeanUtil.getInstance(this.D1);
        return requestBeanUtil.getArchiveNum(this.M1.getUid() + "", this.M1.getToken(), this.N);
    }

    private void M1() {
        FragmentTransaction beginTransaction = this.Z1.beginTransaction();
        if (this.f32472c2 != null) {
            beginTransaction.setCustomAnimations(R.anim.from_right, R.anim.out_right);
            beginTransaction.hide(this.f32472c2);
        }
        beginTransaction.commit();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean P1() {
        if (isFinishing()) {
            return true;
        }
        return Build.VERSION.SDK_INT >= 17 && isDestroyed();
    }

    private void c2() {
        if (this.f32474e2 == null) {
            this.f32474e2 = new Gson();
        }
        String string = getSharedPreferences("Papa_Stat_SharedPreferences", 4).getString("achievement_done", "");
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(string)) {
            Iterator<JsonElement> it2 = JsonParser.parseString(string).getAsJsonArray().iterator();
            while (it2.hasNext()) {
                arrayList.add((AchievementBean.AchievementInfo) this.f32474e2.fromJson(it2.next(), (Class<Object>) AchievementBean.AchievementInfo.class));
            }
        }
        if (arrayList.size() > 0) {
            new k(this.D1, arrayList).show();
            PrefUtil.getInstance(this.D1).save("achievement_done", "");
        }
    }

    static /* synthetic */ int d1(GameMainActivity4 gameMainActivity4) {
        int i4 = gameMainActivity4.f32475f2;
        gameMainActivity4.f32475f2 = i4 + 1;
        return i4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i2() {
        try {
            Toast.makeText(this, "网络不稳定，请重试", 0).show();
        } catch (Exception unused) {
        }
    }

    private void l2(int i4) {
        GameMaingameinfo gameInfo;
        if (this.f32489r2.size() < i4 || (gameInfo = this.K1.getGameInfo()) == null) {
            return;
        }
        CommentDetailActivity_.M1(this.D1).d(this.N).b(this.f32489r2.get(i4 - 1).getId()).f(gameInfo.getGame_plugin_num()).a(Integer.valueOf(gameInfo.getGame_bespeak_switch()).intValue()).e(gameInfo.getGame_is_started()).h(0).g(gameInfo.getGame_package()).c(gameInfo.getGame_comment_score_switch()).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n1() {
        CountDownTimer countDownTimer = this.f32494w2;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
    }

    private void n2(int i4) {
        if (this.v2.size() >= i4) {
            int pid = this.v2.get(i4 - 1).getPid();
            ForumBean.ForumPostsBean forumPostsBean = new ForumBean.ForumPostsBean();
            forumPostsBean.setPid(pid);
            com.join.mgps.Util.j0.w0(this.D1, forumPostsBean, new ExtBean("0", pid + "", "-1"));
        }
    }

    public static long q1(String str, String str2) {
        try {
            return new SimpleDateFormat(str2).parse(str).getTime();
        } catch (Exception e5) {
            e5.printStackTrace();
            return 0L;
        }
    }

    private void q2(boolean z4) {
        char c5;
        char c6;
        String fight_fun = this.F1.getFight_fun();
        if (com.join.mgps.Util.g2.i(fight_fun)) {
            this.U1.clear();
            this.T1.b();
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
            if (fight_fun.length() > 12 && Q1(this, this.F1) && fight_fun.charAt(12) == '1') {
                this.U1.add(new DynamicEntranceBean("排位赛", "NEW", 1));
            }
            if (fight_fun.length() > 14 && Q1(this, this.F1) && fight_fun.charAt(14) == '1') {
                this.U1.add(new DynamicEntranceBean("排位赛", "NEW", 14));
            }
            if (fight_fun.length() > 4 && fight_fun.charAt(4) == '1') {
                this.U1.add(new DynamicEntranceBean("练习模式", "", 5));
            }
            if (fight_fun.length() >= 4 && fight_fun.charAt(3) == '1') {
                this.U1.add(new DynamicEntranceBean("约战", "", 2));
            }
            if (fight_fun.length() >= 1 && '1' == fight_fun.charAt(0)) {
                this.U1.add(new DynamicEntranceBean("本地对战", "", 3));
            }
        }
        if (this.K1 != null) {
            if (z4) {
                FragmentTransaction beginTransaction = this.Z1.beginTransaction();
                SimulatorRecommendFragment_ simulatorRecommendFragment_ = this.f32470a2;
                if (simulatorRecommendFragment_ == null) {
                    this.f32470a2 = new SimulatorRecommendFragment_();
                    Bundle bundle = new Bundle();
                    bundle.putString("gameId", this.N);
                    this.f32470a2.setArguments(bundle);
                    beginTransaction.add(R.id.frameLayout, this.f32470a2);
                } else {
                    beginTransaction.show(simulatorRecommendFragment_);
                }
                beginTransaction.commit();
            }
            if (this.K1.getMemberInfo() != null) {
                this.Z.setText(this.K1.getMemberInfo().getTitle());
            }
            if (this.K1.getMemberFun() != null) {
                List<GameMainV4DataBean.MemberFunBean> memberFun = this.K1.getMemberFun();
                if (this.f32473d2 == null) {
                    this.f32473d2 = new com.join.mgps.adapter.c2(this, this.N);
                }
                this.f32485p0.setAdapter((ListAdapter) this.f32473d2);
                if (memberFun != null && memberFun.size() > 0) {
                    this.f32473d2.d(memberFun);
                    this.f32473d2.notifyDataSetChanged();
                }
            }
            this.T.setVisibility(8);
            Y1(true);
            GameMaingameinfo gameInfo = this.K1.getGameInfo();
            if (gameInfo != null) {
                String game_back_ground_img = gameInfo.getGame_back_ground_img();
                if (!com.join.mgps.Util.g2.h(game_back_ground_img)) {
                    this.V.setImageURI(game_back_ground_img);
                }
                this.f32492u2 = gameInfo.getCommunity_area_id();
                if (z4) {
                    if (!com.join.mgps.Util.g2.h(this.L1)) {
                        G1(this.L1);
                    } else if (this.f32492u2 != 0) {
                        D1();
                    } else {
                        B1();
                    }
                }
            }
            GameMainNetBattle netBattle = this.K1.getNetBattle();
            if (netBattle != null) {
                TextView textView = this.R;
                StringBuilder sb = new StringBuilder();
                sb.append(netBattle.getNumber() < 0 ? 0 : netBattle.getNumber());
                sb.append("房");
                textView.setText(sb.toString());
                DownloadTask downloadTask = this.F1;
                if (downloadTask != null && !downloadTask.isFightFun()) {
                    this.R.setVisibility(8);
                } else {
                    this.R.setVisibility(0);
                }
            } else {
                this.R.setVisibility(8);
            }
            GameMainV4DataBean.PlayGameInfoBean playGameInfo = this.K1.getPlayGameInfo();
            if (playGameInfo != null) {
                int file_save_count = playGameInfo.getFile_save_count();
                if (playGameInfo.getFile_save_switch() == 1) {
                    List<DynamicEntranceBean> list = this.U1;
                    list.add(new DynamicEntranceBean("云存档", file_save_count + "", 4));
                    return;
                }
                return;
            }
            return;
        }
        this.T.setVisibility(0);
        Y1(false);
    }

    private void s2() {
        this.f32481l2 = new ArrayList<>();
        this.f32482m2 = new ArrayList<>();
        if (this.f32484o2) {
            CloudListFragmentV2_ cloudListFragmentV2_ = new CloudListFragmentV2_();
            Bundle bundle = new Bundle();
            bundle.putInt("type", 1);
            bundle.putString("gameid", this.N);
            bundle.putInt("typeIndex", 3);
            cloudListFragmentV2_.setArguments(bundle);
            this.f32481l2.add(cloudListFragmentV2_);
            this.f32482m2.add(G2);
        }
        SimulatorLaunchMomentFragment_ simulatorLaunchMomentFragment_ = new SimulatorLaunchMomentFragment_();
        Bundle bundle2 = new Bundle();
        bundle2.putString("gameId", this.N);
        simulatorLaunchMomentFragment_.setArguments(bundle2);
        this.f32481l2.add(simulatorLaunchMomentFragment_);
        this.f32482m2.add(E2);
        SimulatorLaunchAchievementFragment_ simulatorLaunchAchievementFragment_ = new SimulatorLaunchAchievementFragment_();
        Bundle bundle3 = new Bundle();
        bundle3.putString("gameId", this.N);
        simulatorLaunchAchievementFragment_.setArguments(bundle3);
        this.f32481l2.add(simulatorLaunchAchievementFragment_);
        this.f32482m2.add(F2);
        GameMainV4DataBean gameMainV4DataBean = this.K1;
        if (gameMainV4DataBean != null && gameMainV4DataBean.isBbs_switch()) {
            SimulatorIntroductionFragment_ simulatorIntroductionFragment_ = new SimulatorIntroductionFragment_();
            Bundle bundle4 = new Bundle();
            bundle4.putString("gameId", this.N);
            bundle4.putString("draftUrl", this.K1.getBbs_strategy_contribute_url());
            bundle4.putBoolean("isExpand", true);
            simulatorIntroductionFragment_.setArguments(bundle4);
            this.f32481l2.add(simulatorIntroductionFragment_);
            this.f32482m2.add(H2);
        }
        if (this.K1.getMemberFun() != null) {
            List<GameMainV4DataBean.MemberFunBean> memberFun = this.K1.getMemberFun();
            List<String> arrayList = new ArrayList<>();
            for (GameMainV4DataBean.MemberFunBean memberFunBean : memberFun) {
                if (memberFunBean.getType() == 1) {
                    arrayList = memberFunBean.getContents();
                }
            }
            if (this.f32473d2 == null) {
                this.f32473d2 = new com.join.mgps.adapter.c2(this, this.N);
            }
            if (arrayList != null && arrayList.size() > 0) {
                SimulatorGoldFingerFragment_ simulatorGoldFingerFragment_ = new SimulatorGoldFingerFragment_();
                Bundle bundle5 = new Bundle();
                bundle5.putSerializable("contents", new ArrayList(arrayList));
                simulatorGoldFingerFragment_.setArguments(bundle5);
                this.f32481l2.add(simulatorGoldFingerFragment_);
                this.f32482m2.add(I2);
            }
        }
        this.f32480k2 = new NavigationAdapter(this.Z1, this.f32481l2, this.f32482m2);
        this.Y.setOffscreenPageLimit(2);
        this.Y.setAdapter(this.f32480k2);
        this.Y.addOnPageChangeListener(new d());
        this.X.setupWithViewPager(this.Y);
        this.A1.setVisibility(8);
        if (E2.equals(this.f32482m2.get(0))) {
            this.B1.setVisibility(0);
        } else {
            this.B1.setVisibility(8);
        }
    }

    private void t1() {
        com.papa.sim.statistic.p.l(this).X0(Event.startArchiveManagement, AccountUtil_.getInstance_(this).getUid(), this.N, "1");
        DocumentManageActivity_.S0(this.D1).a(1).b(this.N).start();
    }

    private void u1() {
        ApFightActivity_.n0(this.D1).a(this.N).start();
        com.papa.sim.statistic.p.l(this).y0(this.F1.getCrc_link_type_val(), this.M1.getUid());
    }

    private void v1(int i4) {
        MobclickAgent.onEvent(this.D1, "onEnterQualifying");
        if (com.join.android.app.common.utils.j.j(this)) {
            if (UtilsMy.W(this.D1, this.F1) == null) {
                Toast.makeText(this, "正在下载插件...", 1).show();
                N1();
                return;
            } else if (this.K1 == null) {
                return;
            } else {
                GamePaiWeiActivty_.o0(this.D1).a(this.N).b(this.K1.getGameInfo().getMax_battle_count()).c(i4).start();
                return;
            }
        }
        com.join.mgps.Util.l2.a(this).b("无网络连接");
    }

    private void y1() {
        UtilsMy.i(null, this.F1, this, 3);
        com.papa.sim.statistic.p.l(this).T0(this.F1.getCrc_link_type_val(), this.M1.getUid());
        com.papa.sim.statistic.p.l(this).A0(this.F1.getCrc_link_type_val(), this.M1.getUid());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void B1() {
        if (com.join.android.app.common.utils.j.j(this.D1)) {
            CommentResponse<CommentAllListBean> b5 = this.V1.b(E1());
            if (b5 != null) {
                this.f32489r2 = b5.getData_info().getGeneral_comment();
                W1();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void C1() {
        GameMainTable o4 = b2.u.n().o(this.N);
        if (o4 != null) {
            GameMainV4DataBean gameMainV4DataBean = (GameMainV4DataBean) JsonMapper.getInstance().fromJson(o4.getGame_main_data(), GameMainV4DataBean.class);
            if (gameMainV4DataBean != null && gameMainV4DataBean.getGameInfo() != null) {
                this.L1 = gameMainV4DataBean.getGameInfo().getCommunity_multi_posts_id();
            }
            if (gameMainV4DataBean != null) {
                r2(gameMainV4DataBean, false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void D1() {
        if (com.join.android.app.common.utils.j.j(this)) {
            try {
                ResultResMainBean<GameMainCommunityBean> n4 = this.f32491t2.n(this.f32492u2);
                if (n4 == null || n4.getError() != 0 || n4.getData() == null) {
                    return;
                }
                List<GameMainCommunityBean.PostsBean> posts = n4.getData().getPosts();
                this.v2.clear();
                if (posts != null && posts.size() > 0) {
                    String subject = posts.get(0).getSubject();
                    if (com.join.mgps.Util.g2.h(subject)) {
                        subject = posts.get(0).getMessage();
                    }
                    this.v2.add(new GameMainCommunityBean.PostsBean(subject, posts.get(0).getPid()));
                    if (posts.size() > 1) {
                        String subject2 = posts.get(1).getSubject();
                        if (com.join.mgps.Util.g2.h(subject2)) {
                            subject2 = posts.get(1).getMessage();
                        }
                        this.v2.add(new GameMainCommunityBean.PostsBean(subject2, posts.get(1).getPid()));
                    }
                }
                X1();
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    public RequestCommentAllListArgs E1() {
        this.M1 = AccountUtil_.getInstance_(this.D1).getAccountData();
        String d5 = this.f32490s2.commentToken().d();
        com.wufan.user.service.protobuf.n0 n0Var = this.M1;
        return RequestBeanUtil.getInstance(this.D1).getRequestCommentAllList(1, 10, this.N, n0Var != null ? n0Var.getUid() : 0, d5);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void F1() {
        if (com.join.android.app.common.utils.j.j(this.D1)) {
            try {
                ForumResponse<ForumData.HomepageRecommendLabel> O = this.f32491t2.O(0, 1, AccountUtil_.getInstance_(this.D1).getUid(), AccountUtil_.getInstance_(this.D1).getToken());
                if (O == null || O.getError() != 0 || O.getData() == null) {
                    return;
                }
                List<ForumBean.ForumPostsBean> post_list = O.getData().getPost_list();
                this.v2.clear();
                if (post_list != null && post_list.size() > 0) {
                    this.v2.add(new GameMainCommunityBean.PostsBean(post_list.get(0).getSubject(), post_list.get(0).getPid()));
                    if (post_list.size() > 0) {
                        this.v2.add(new GameMainCommunityBean.PostsBean(post_list.get(1).getSubject(), post_list.get(1).getPid()));
                    }
                }
                X1();
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void G1(String str) {
        if (com.join.android.app.common.utils.j.j(this)) {
            try {
                ForumResponse<MulPostData> L = this.f32491t2.L(str);
                if (L == null || L.getError() != 0 || L.getData() == null) {
                    return;
                }
                List<ForumBean.ForumPostsBean> posts_list = L.getData().getPosts_list();
                this.v2.clear();
                if (posts_list != null && posts_list.size() > 0) {
                    this.v2.add(new GameMainCommunityBean.PostsBean(posts_list.get(0).getSubject(), posts_list.get(0).getPid()));
                    if (posts_list.size() > 1) {
                        this.v2.add(new GameMainCommunityBean.PostsBean(posts_list.get(1).getSubject(), posts_list.get(1).getPid()));
                    }
                }
                X1();
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void H1() {
        try {
            ArchiveNumDataBean f5 = this.X1.f(A1().getArgs());
            this.D2 = f5;
            if (f5 == null || f5.getCode() != 600) {
                return;
            }
            this.f32490s2.getArchiveCoinPref().g(Integer.valueOf(this.D2.getData_info().getArchiveCoin()));
            this.f32490s2.cloudVipLink().g(this.D2.getData_info().getVipLink());
            DownloadTask F = p1.f.K().F(this.N);
            if (F != null) {
                this.A2 = com.join.mgps.Util.g0.m(F.getPlugin_num(), F.getGameZipPath());
                if (F.getPlugin_num().equals("31")) {
                    boolean z4 = false;
                    boolean z5 = false;
                    for (RomArchived romArchived : this.A2) {
                        if (romArchived.getFileName().contains("_v2")) {
                            z4 = true;
                        } else {
                            z5 = true;
                        }
                    }
                    Iterator<RomArchived> it2 = this.A2.iterator();
                    while (it2.hasNext()) {
                        RomArchived next = it2.next();
                        if (z5 && !z4) {
                            this.B2 = false;
                            if (!com.join.mgps.Util.l1.a(F.getPackageName())) {
                                it2.remove();
                            }
                        } else if (z5 && z4) {
                            if (com.join.mgps.Util.l1.a(F.getPackageName())) {
                                this.C2 = false;
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
                    for (RomArchived romArchived3 : this.A2) {
                        long q12 = q1(romArchived3.getArchivedTime(), "MM月dd日 HH:mm");
                        if (j4 == 0) {
                            romArchived2 = romArchived3;
                            j4 = q12;
                        }
                        if (j4 > q12) {
                            romArchived2 = romArchived3;
                            j4 = q12;
                        }
                    }
                    if (romArchived2 != null && romArchived2.getFileName().contains("vba")) {
                        a2(true);
                    }
                }
                List<RomArchived> list = this.A2;
                if (list != null) {
                    p2(list.size());
                    return;
                } else {
                    p2(0);
                    return;
                }
            }
            p2(0);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void I1() {
    }

    @Override // com.join.mgps.adapter.j1.a
    public void J(DynamicEntranceBean dynamicEntranceBean) {
        int typeId = dynamicEntranceBean.getTypeId();
        if (typeId != 14) {
            switch (typeId) {
                case 1:
                    v1(1);
                    return;
                case 2:
                    w1();
                    return;
                case 3:
                    u1();
                    return;
                case 4:
                    t1();
                    return;
                case 5:
                    y1();
                    return;
                case 6:
                    r1();
                    return;
                default:
                    return;
            }
        }
        v1(14);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void J1() {
        try {
            GameWorldResponse<List<PspBattleServer>> v2 = this.J1.v();
            if (v2.getError() == 701) {
                p1();
            } else if (v2.getError() == 0) {
                this.H1 = v2.getData();
                h2();
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background(delay = 1500)
    public void K1() {
    }

    void L1(String str, int i4, int i5, String str2, String str3) {
        IntentDateBean intentDateBean = new IntentDateBean();
        intentDateBean.setTpl_type(str);
        intentDateBean.setLink_type(i4);
        intentDateBean.setJump_type(i5);
        intentDateBean.setCrc_link_type_val(str2);
        intentDateBean.setLink_type_val(str3);
        IntentUtil.getInstance().intentActivity(this.D1, intentDateBean);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void N1() {
        this.P.setVisibility(8);
    }

    void O1() {
        ((LoginSplashActivity_.IntentBuilder_) LoginSplashActivity_.intent(this.D1).flags(268435456)).start();
    }

    boolean Q1(Context context, DownloadTask downloadTask) {
        int i4;
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

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void R1() {
        Fragment item = ((NavigationAdapter) this.Y.getAdapter()).getItem(this.f32482m2.indexOf(E2));
        if (item instanceof SimulatorLaunchMomentFragment_) {
            int b02 = ((SimulatorLaunchMomentFragment_) item).b0();
            if (this.f32479j2 == null) {
                com.join.mgps.dialog.c2 c2Var = new com.join.mgps.dialog.c2(this, b02);
                this.f32479j2 = c2Var;
                c2Var.e(new j(item));
            }
            this.f32479j2.setFocusable(true);
            com.join.mgps.dialog.c2 c2Var2 = this.f32479j2;
            ImageView imageView = this.B1;
            double measuredWidth = imageView.getMeasuredWidth();
            Double.isNaN(measuredWidth);
            double dimension = getResources().getDimension(R.dimen.wdp136);
            Double.isNaN(dimension);
            c2Var2.showAsDropDown(imageView, (int) ((measuredWidth * 0.8d) - dimension), (int) (-getResources().getDimension(R.dimen.wdp10)));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void S1() {
        if (this.f32478i2 == null) {
            this.f32478i2 = new AchievmentTipsDialog(this.D1);
        }
        this.f32478i2.setFocusable(true);
        AchievmentTipsDialog achievmentTipsDialog = this.f32478i2;
        ImageView imageView = this.A1;
        double measuredWidth = imageView.getMeasuredWidth();
        Double.isNaN(measuredWidth);
        double dimension = this.D1.getResources().getDimension(R.dimen.wdp336);
        Double.isNaN(dimension);
        achievmentTipsDialog.showAsDropDown(imageView, (int) ((measuredWidth * 0.8d) - dimension), (int) (-getResources().getDimension(R.dimen.wdp10)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void T1() {
        z0();
        M1();
        if (this.f31374h == null) {
            this.f31374h = new Handler();
        }
        this.f31374h.postDelayed(new a(), 200L);
    }

    void U1() {
        m2();
    }

    public void V1() {
        PrefUtil.getInstance(this.D1).save("isHasAchievement", Boolean.FALSE);
        this.B1.setVisibility(8);
        ArrayList<Fragment> arrayList = this.f32481l2;
        if (arrayList == null || arrayList.size() <= 0 || this.f32480k2 == null) {
            return;
        }
        Iterator<Fragment> it2 = this.f32481l2.iterator();
        while (it2.hasNext()) {
            if (it2.next() instanceof SimulatorLaunchAchievementFragment_) {
                it2.remove();
                this.f32482m2.remove(F2);
            }
        }
        this.f32480k2.d(this.f32481l2, this.f32482m2);
        this.f32480k2.notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void W1() {
        if (this.f32489r2 == null) {
            this.T.setVisibility(0);
            Y1(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void X1() {
        if (this.v2 != null) {
            this.T.setVisibility(8);
            Y1(true);
            return;
        }
        this.T.setVisibility(0);
        Y1(false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void Y1(boolean z4) {
        int i4 = 0;
        while (true) {
            if (i4 >= this.U1.size()) {
                break;
            }
            DynamicEntranceBean dynamicEntranceBean = this.U1.get(i4);
            if (dynamicEntranceBean.getTypeId() == 6) {
                this.U1.remove(dynamicEntranceBean);
                break;
            }
            i4++;
        }
        if (z4) {
            this.U1.add(new DynamicEntranceBean("社区", "", 6));
        }
        this.T1.notifyDataSetChanged();
    }

    public void Z1(List<SimulatorMomentBean.BasicInfo> list) {
    }

    public void a2(boolean z4) {
        this.f32496z2 = z4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterViews() {
        this.D1 = this;
        setSystemUiHide(true);
        PrefUtil.getInstance(this.D1).save("achievement_done", "");
        PrefUtil.getInstance(this.D1).save("isHasAchievement", Boolean.TRUE);
        this.Z1 = getSupportFragmentManager();
        this.N1 = com.join.mgps.rpc.impl.i.D0();
        this.J1 = com.join.mgps.rpc.impl.l.n0();
        this.f32491t2 = com.join.mgps.rpc.impl.g.A0();
        this.W1 = com.join.mgps.rpc.impl.h.p();
        this.X1 = com.join.mgps.rpc.impl.c.k();
        this.V1 = com.join.mgps.rpc.impl.e.m();
        DownloadTask F = p1.f.K().F(this.N);
        this.F1 = F;
        if (F != null && TextUtils.equals(F.getPlugin_num(), String.valueOf(ConstantIntEnum.GBA.value()))) {
            this.f32484o2 = true;
        }
        this.M1 = AccountUtil_.getInstance_(this.D1).getAccountData();
        DownloadTask downloadTask = this.F1;
        if (downloadTask != null) {
            this.Q.setText(downloadTask.getShowName());
        }
        this.T = new View(this);
        com.join.mgps.adapter.j1 j1Var = new com.join.mgps.adapter.j1(this, this.U1, this);
        this.T1 = j1Var;
        this.U.setAdapter((ListAdapter) j1Var);
        this.U.setOverScrollMode(2);
        this.V.setLayoutParams(new ConstraintLayout.LayoutParams((((int) getResources().getDimension(R.dimen.wdp916)) * getResources().getDisplayMetrics().heightPixels) / ((int) getResources().getDimension(R.dimen.wdp667)), -1));
        C1();
        getData();
        z1();
        if (this.f32484o2) {
            H1();
        }
        this.S1 = new com.join.mgps.socket.fight.arena.a(this, new c());
        if (notchtools.geek.com.notchtools.b.o().c(getWindow())) {
            ((ConstraintLayout.LayoutParams) this.W.getLayoutParams()).setMarginStart(notchtools.geek.com.notchtools.b.o().e(getWindow()) + getResources().getDimensionPixelOffset(R.dimen.wdp10));
        }
        new LinearLayoutManager(this).setOrientation(1);
        com.papa.sim.statistic.p.l(this).Z0(Event.indexGameStart, AccountUtil_.getInstance_(this).getUid(), this.N, this.O, 0);
        if (this.Y1 == null) {
            this.Y1 = new EmuOutResultReceiver();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction(o1.a.V);
            registerReceiver(this.Y1, intentFilter);
        }
        this.X.clearOnTabSelectedListeners();
        this.X.removeAllTabs();
    }

    public void b2(int i4) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void back() {
        finish();
    }

    public void d2() {
        this.C1.setVisibility(0);
        y0(0);
        this.f32486p1.setVisibility(0);
    }

    public void e2() {
        FragmentTransaction beginTransaction = this.Z1.beginTransaction();
        beginTransaction.setCustomAnimations(R.anim.from_right, R.anim.out_right);
        SimulatorIntroductionFragment_ simulatorIntroductionFragment_ = this.f32472c2;
        if (simulatorIntroductionFragment_ == null) {
            this.f32472c2 = new SimulatorIntroductionFragment_();
            Bundle bundle = new Bundle();
            bundle.putString("gameId", this.N);
            bundle.putString("draftUrl", this.K1.getBbs_strategy_contribute_url());
            bundle.putBoolean("isExpand", true);
            this.f32472c2.setArguments(bundle);
            beginTransaction.add(R.id.expandContainer, this.f32472c2);
        } else {
            beginTransaction.show(simulatorIntroductionFragment_);
        }
        beginTransaction.commit();
        this.f32493v1.setVisibility(0);
        this.f32486p1.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void f2(GameMainV4DataBean gameMainV4DataBean) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void g2(OnlineCouponConfigBean onlineCouponConfigBean) {
        com.join.mgps.Util.b0.f0(this).V(this, onlineCouponConfigBean, 3);
        com.papa.sim.statistic.p.l(this).Q1(Event.quitSingleSuccessUpRedBag, AccountUtil_.getInstance_(this).getAccountData().getUid());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void getData() {
        try {
            RequestModel<RequestGameIdArgs> requestModel = new RequestModel<>();
            requestModel.setDefault(this);
            String str = this.N;
            com.wufan.user.service.protobuf.n0 n0Var = this.M1;
            RequestGameIdArgs requestGameIdArgs = new RequestGameIdArgs(str, 1, 1, n0Var != null ? n0Var.getUid() : 1);
            requestGameIdArgs.setGameId(this.N);
            requestGameIdArgs.setToken(AccountUtil_.getInstance_(this).getToken());
            requestModel.setArgs(requestGameIdArgs);
            ResponseModel<GameMainV4DataBean> j4 = this.N1.j(requestModel);
            this.f32487p2 = true;
            if (j4 == null || j4.getFlag() != 1) {
                return;
            }
            GameMainV4DataBean data = j4.getData();
            f2(data);
            if (data != null && data.getGameInfo() != null) {
                this.L1 = data.getGameInfo().getCommunity_multi_posts_id();
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
            r2(data, true);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void h2() {
        l lVar = this.I1;
        if (lVar != null && lVar.isShowing()) {
            this.I1.dismiss();
        }
        l lVar2 = new l(this.D1, R.style.HKDialogLoading);
        this.I1 = lVar2;
        lVar2.show();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void handleFailure(ArenaResponse arenaResponse) {
        N1();
        int i4 = arenaResponse.errorType;
        if (i4 == 16) {
            this.S1.D(com.join.mgps.socket.fight.arena.a.f54752j, 257, Integer.valueOf(arenaResponse.errorType), "无法加入，你被禁止加入该房间", "确定");
        } else if (i4 == 17) {
            this.S1.D(com.join.mgps.socket.fight.arena.a.f54752j, 257, Integer.valueOf(arenaResponse.errorType), "该房间为比赛专用房间,非参赛选手无法加入", "我知道了");
        } else if (i4 == 9) {
            this.S1.D(com.join.mgps.socket.fight.arena.a.f54752j, 257, Integer.valueOf(arenaResponse.errorType), "房间人数已满你无法加入房间!", "确定");
        } else if (i4 == 7) {
            this.S1.D(com.join.mgps.socket.fight.arena.a.f54752j, 256, Integer.valueOf(arenaResponse.errorType), "密码输入错误，请重试!", "取消", "确定", arenaResponse);
        } else if (i4 == 8) {
            this.S1.D(com.join.mgps.socket.fight.arena.a.f54752j, 257, Integer.valueOf(arenaResponse.errorType), "房间已经被解散!", "确定");
        } else if (i4 == 11) {
            this.S1.D(com.join.mgps.socket.fight.arena.a.f54752j, 257, Integer.valueOf(arenaResponse.errorType), "铜板不足，无法创建房间!", "确定");
        } else if (i4 == 13) {
            this.S1.D(com.join.mgps.socket.fight.arena.a.f54752j, 257, Integer.valueOf(arenaResponse.errorType), "铜板不足，无法加入房间", "确定");
        } else if (i4 == 1001) {
            this.S1.D(com.join.mgps.socket.fight.arena.a.f54752j, Integer.valueOf((int) com.join.mgps.socket.fight.arena.a.f54751i), Integer.valueOf(arenaResponse.errorType), arenaResponse.errorInfo, "确定");
        }
    }

    public boolean isLogined(Context context) {
        com.wufan.user.service.protobuf.n0 accountData = AccountUtil_.getInstance_(context).getAccountData();
        return (accountData == null || !com.join.mgps.Util.g2.i(accountData.getToken()) || AccountUtil_.getInstance_(context).isTourist()) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void j2() {
        if (UtilsMy.Z1(this.F1.getRomType()).getDown_type() == 2) {
            k2();
        } else if (new PrefDef_(this.D1).launch_game_switch().d().booleanValue()) {
            UtilsMy.z0(this.D1, 1, this.N, "RAW_SIMULATOR", new f());
        } else {
            k2();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void k1() {
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
        GameMainV4DataBean gameMainV4DataBean = this.K1;
        if (gameMainV4DataBean != null && gameMainV4DataBean.getGameInfo() != null) {
            gameInfoBean.setGame_name(this.K1.getGameInfo().getGame_name());
        }
        DownloadTask downloadTask = this.F1;
        if (downloadTask != null && com.join.mgps.Util.g2.i(downloadTask.getFight_fun())) {
            String fight_fun = this.F1.getFight_fun();
            char charAt = fight_fun.charAt(1);
            if (fight_fun.length() >= 7) {
                c6 = fight_fun.charAt(6);
                c5 = fight_fun.charAt(5) == '1' ? '1' : '0';
            } else {
                c5 = '0';
                c6 = '0';
            }
            if ('0' == charAt && '0' == c6 && c5 == '1') {
                J1();
                return;
            }
        }
        DownloadTask downloadTask2 = this.F1;
        if (downloadTask2 != null && downloadTask2.isFightFun()) {
            o1();
            GameRoomListActivity_.W3(this.D1).b(true).c(gameInfoBean).start();
            return;
        }
        NewArenaMainActivty_.g1(this).start();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0129  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void k2() {
        /*
            Method dump skipped, instructions count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.mgps.activity.GameMainActivity4.k2():void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void l1() {
        String str;
        GameMainV4DataBean gameMainV4DataBean = this.K1;
        if (gameMainV4DataBean == null || gameMainV4DataBean.getMemberInfo() == null) {
            return;
        }
        GameMainV4DataBean.MemberInfoBean memberInfo = this.K1.getMemberInfo();
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
        IntentUtil.getInstance().intentActivity(this.D1, intentDateBean);
    }

    void m1() {
        GameMainV4DataBean gameMainV4DataBean = this.K1;
        if (gameMainV4DataBean == null || gameMainV4DataBean.getGameMasteryLevel() == null) {
            return;
        }
        try {
            GameMasteryLevel gameMasteryLevel = this.K1.getGameMasteryLevel();
            int i4 = 0;
            int[] iArr = new int[0];
            int current_lv_times = gameMasteryLevel.getCurrent_lv_times();
            int next_lv_times = gameMasteryLevel.getNext_lv_times();
            if (!TextUtils.isEmpty(gameMasteryLevel.getLevel()) && !gameMasteryLevel.getLevel().equals("传说") && !gameMasteryLevel.getLevel().equals("宗师") && !gameMasteryLevel.getLevel().equals("精英")) {
                gameMasteryLevel.getLevel().equals("资深");
            }
            try {
                ArrayList arrayList = (ArrayList) JsonMapper.getInstance().fromJson(this.f32490s2.gameTimeLvCfg().d(), JsonMapper.getInstance().createCollectionType(ArrayList.class, GameTimeLevel.class));
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
    public void m2() {
        GameMainV4DataBean gameMainV4DataBean = this.K1;
        if (gameMainV4DataBean == null || gameMainV4DataBean.getGameInfo() == null) {
            return;
        }
        GameMaingameinfo gameInfo = this.K1.getGameInfo();
        if (!TextUtils.isEmpty(gameInfo.getGame_comment_score_switch()) && !gameInfo.getGame_comment_score_switch().equals("0")) {
            CommentAllListActivity_.H0(this.D1).f(this.N).i(gameInfo.getGame_package()).h(gameInfo.getGame_plugin_num()).a(Integer.valueOf(gameInfo.getGame_bespeak_switch()).intValue()).g(gameInfo.getGame_is_started()).j(0).d(gameInfo.getGame_comment_score_switch()).start();
        } else {
            ForumIndexActivity_.i0(this).start();
        }
    }

    void o1() {
        if (this.R1.d() != null) {
            this.R1.d().A(this.y2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void o2() {
        d2();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.join.mgps.activity.FriendActivity, com.BaseActivity, com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f31376j = "GAME_HOME_PAGE";
        this.f31375i = this.N;
        super.onCreate(bundle);
        setExitSharedElementCallback(new b());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.join.mgps.activity.FriendActivity, com.BaseActivity, com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        com.join.mgps.socket.fight.arena.a aVar = this.S1;
        if (aVar != null) {
            aVar.w();
        }
        com.papa.sim.statistic.p.l(this).z0(this.F1.getCrc_link_type_val(), this.M1.getUid());
        com.join.mgps.socket.fight.arena.b bVar = this.R1;
        if (bVar != null && bVar.d() != null) {
            this.R1.d().A(this.y2);
        }
        com.join.mgps.socket.fight.arena.b bVar2 = this.R1;
        if (bVar2 != null) {
            bVar2.g();
            this.R1.stopService();
            this.R1 = null;
        }
        EmuOutResultReceiver emuOutResultReceiver = this.Y1;
        if (emuOutResultReceiver != null) {
            unregisterReceiver(emuOutResultReceiver);
        }
        super.onDestroy();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.join.mgps.activity.FriendActivity, com.BaseActivity, com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        N1();
        this.M1 = AccountUtil_.getInstance_(this).getAccountData();
        if (this.R1 == null) {
            com.join.mgps.socket.fight.arena.b bVar = new com.join.mgps.socket.fight.arena.b(this, this.f32495x2);
            this.R1 = bVar;
            bVar.bindService();
        }
        K1();
        if (this.F1 != null) {
            com.papa.sim.statistic.p.l(this).d(p1.f.K().L(this.N, this), 0);
            com.papa.sim.statistic.p.l(this).d(p1.f.K().L(this.N, this), 1);
        }
        if (AccountUtil_.getInstance_(this).isTourist()) {
            return;
        }
        c2();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        com.join.mgps.socket.fight.arena.b bVar = this.R1;
        if (bVar != null && bVar.d() != null) {
            this.R1.d().A(this.y2);
        }
        com.join.mgps.socket.fight.arena.b bVar2 = this.R1;
        if (bVar2 != null) {
            bVar2.g();
            this.R1.stopService();
            this.R1 = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void p1() {
        com.join.mgps.Util.l2.a(this).b("登录已失效请您重新登录");
        O1();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void p2(int i4) {
    }

    void r1() {
        if (this.T.getVisibility() != 0 && this.f32492u2 != 0) {
            IntentUtil.getInstance().goForumGroupActivity(this, this.f32492u2);
        } else {
            m2();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void r2(GameMainV4DataBean gameMainV4DataBean, boolean z4) {
        this.K1 = gameMainV4DataBean;
        GameMaingameinfo gameInfo = gameMainV4DataBean.getGameInfo();
        if (gameInfo != null) {
            this.Q.setText(gameInfo.getGame_name());
        }
        q2(z4);
        if (z4) {
            s2();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void s1() {
        EndGameActivity_.U0(this).start();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void w1() {
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
            x1();
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void x1() {
        if (com.join.android.app.common.utils.j.j(this)) {
            if (!IntentUtil.getInstance().goLoginBattle(this)) {
                n1();
                this.P.setVisibility(0);
                this.f32494w2.start();
                if (UtilsMy.W(this.D1, this.F1) == null) {
                    Toast.makeText(this, "正在下载插件...", 1).show();
                    N1();
                    return;
                }
                com.join.mgps.socket.fight.arena.b bVar = this.R1;
                if (bVar != null && bVar.d() != null) {
                    if (this.R1.d().s()) {
                        com.wufan.friend.chat.c.u().V(null);
                        this.R1.f(ArenaRequestFactory.createRoom(ArenaConstants.REGISTER_TYPE_GAMEMAIN, this.N, 0, AccountUtil_.getInstance_(this).getAccountData().getUid(), true));
                    } else {
                        ArenaRequest login = ArenaRequestFactory.login(ArenaConstants.REGISTER_TYPE_GAMEMAIN);
                        login.isRefreshing = true;
                        login.isElite = false;
                        this.R1.f(login);
                    }
                }
            }
            com.papa.sim.statistic.p.l(this).N0(this.F1.getCrc_link_type_val(), this.M1.getUid());
            return;
        }
        com.join.mgps.Util.l2.a(this).b("无网络连接");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void z1() {
        if (com.join.android.app.common.utils.j.j(this)) {
            try {
                RequestModel requestModel = new RequestModel();
                requestModel.setDefault(this);
                RequestSimulatorAchievementListArgs requestSimulatorAchievementListArgs = new RequestSimulatorAchievementListArgs();
                requestSimulatorAchievementListArgs.setGameId(this.N);
                requestSimulatorAchievementListArgs.setUid(AccountUtil_.getInstance_(this).getUid());
                requestSimulatorAchievementListArgs.setToken(AccountUtil_.getInstance_(this).getToken());
                requestModel.setArgs(requestSimulatorAchievementListArgs);
                ResponseModel<SimulatorAllAchievementBean> c02 = this.N1.c0(requestModel.makeSign());
                if (c02 == null || c02.getData() == null) {
                    return;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("getAllAchievementsData: ");
                sb.append(JsonMapper.getInstance().toJson(c02.getData().getAchievement_list()));
                PrefUtil.getInstance(this.D1).save("all_achievements", JsonMapper.getInstance().toJson(c02.getData().getAchievement_list()));
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class l extends Dialog {

        /* loaded from: classes4.dex */
        class a implements AdapterView.OnItemClickListener {
            a() {
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i4, long j4) {
                PspBattleServer pspBattleServer = GameMainActivity4.this.H1.get(i4);
                NetBattleStartGameDto netBattleStartGameDto = new NetBattleStartGameDto();
                netBattleStartGameDto.setServerIP(pspBattleServer.getIp());
                netBattleStartGameDto.setServerPort(pspBattleServer.getPort());
                netBattleStartGameDto.setGameID(GameMainActivity4.this.N + "");
                netBattleStartGameDto.setUserID(AccountUtil_.getInstance_(GameMainActivity4.this.D1).getAccountData().getUid() + "");
                netBattleStartGameDto.setOldGame(0);
                netBattleStartGameDto.setClientIp(GameMainActivity4.this.G1);
                netBattleStartGameDto.setUserName(AccountUtil_.getInstance_(GameMainActivity4.this.D1).getAccountData().getNickname());
                netBattleStartGameDto.setUserIcon(AccountUtil_.getInstance_(GameMainActivity4.this.D1).getAccountData().d0());
                netBattleStartGameDto.setPorder(0);
                UtilsMy.b4(GameMainActivity4.this.D1, netBattleStartGameDto, GameMainActivity4.this.F1, 13);
            }
        }

        /* loaded from: classes4.dex */
        private class b extends BaseAdapter {
            private b() {
            }

            @Override // android.widget.Adapter
            public int getCount() {
                return GameMainActivity4.this.H1.size();
            }

            @Override // android.widget.Adapter
            public Object getItem(int i4) {
                return GameMainActivity4.this.H1.get(i4);
            }

            @Override // android.widget.Adapter
            public long getItemId(int i4) {
                return i4;
            }

            @Override // android.widget.Adapter
            public View getView(int i4, View view, ViewGroup viewGroup) {
                if (view == null) {
                    view = LayoutInflater.from(GameMainActivity4.this.D1).inflate(R.layout.dialog_psp_item, (ViewGroup) null);
                }
                ((TextView) view.findViewById(R.id.name)).setText(GameMainActivity4.this.H1.get(i4).getServer_name());
                ((TextView) view.findViewById(R.id.count)).setText(GameMainActivity4.this.H1.get(i4).getPeople() + "人");
                return view;
            }

            /* synthetic */ b(l lVar, b bVar) {
                this();
            }
        }

        public l(Context context) {
            super(context);
        }

        @Override // android.app.Dialog
        protected void onCreate(Bundle bundle) {
            super.onCreate(bundle);
            requestWindowFeature(1);
            requestWindowFeature(-1);
            View inflate = LayoutInflater.from(GameMainActivity4.this.D1).inflate(R.layout.network_psp_dialog, (ViewGroup) null);
            ListView listView = (ListView) inflate.findViewById(R.id.listview);
            listView.setAdapter((ListAdapter) new b(this, null));
            listView.setOnItemClickListener(new a());
            setContentView(inflate);
        }

        protected l(Context context, boolean z4, DialogInterface.OnCancelListener onCancelListener) {
            super(context, z4, onCancelListener);
        }

        public l(Context context, int i4) {
            super(context, i4);
        }
    }
}
