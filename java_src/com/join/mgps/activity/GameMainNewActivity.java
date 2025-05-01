package com.join.mgps.activity;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.PackageInfo;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.text.Html;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import app.mgsim.arena.ArenaConstants;
import app.mgsim.arena.ArenaRequest;
import app.mgsim.arena.ArenaRequestFactory;
import app.mgsim.arena.ArenaResponse;
import app.mgsim.arena.SocketError;
import app.mgsim.arena.SocketListener;
import com.facebook.drawee.drawable.r;
import com.facebook.drawee.view.SimpleDraweeView;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.android.app.common.utils.APKUtils;
import com.join.android.app.common.utils.JsonMapper;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.IntentDateBean;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.Util.RequestBeanUtil;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.activity.arena.GameRoomActivity_;
import com.join.mgps.activity.arena.GameRoomListActivity_;
import com.join.mgps.activity.login.LoginSplashActivity_;
import com.join.mgps.adapter.GameRecommendAdapter;
import com.join.mgps.adapter.MemberFunAdapter;
import com.join.mgps.adapter.j1;
import com.join.mgps.db.tables.EMUApkTable;
import com.join.mgps.db.tables.GameMainTable;
import com.join.mgps.db.tables.PlayGameTimeTable;
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
import com.join.mgps.dto.GameMainV3DataBean;
import com.join.mgps.dto.GameMainachieve;
import com.join.mgps.dto.GameMaingameinfo;
import com.join.mgps.dto.GameWorldResponse;
import com.join.mgps.dto.MulPostData;
import com.join.mgps.dto.NetBattleStartGameDto;
import com.join.mgps.dto.PspBattleServer;
import com.join.mgps.dto.RequestCommentAllListArgs;
import com.join.mgps.dto.ResultMainBean;
import com.join.mgps.dto.ResultMessageBean;
import com.join.mgps.dto.ResultResMainBean;
import com.join.mgps.enums.ConstantIntEnum;
import com.join.mgps.pref.PrefDef_;
import com.join.mgps.socket.fight.arena.a;
import com.join.mgps.socket.fight.arena.b;
import com.papa.sim.statistic.Event;
import com.papa91.battle.protocol.GameRoom;
import com.umeng.analytics.MobclickAgent;
import java.util.ArrayList;
import java.util.List;
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
@EActivity(R.layout.activity_game_main_new)
@Fullscreen
/* loaded from: classes4.dex */
public class GameMainNewActivity extends Activity implements j1.a {
    @ViewById
    SimpleDraweeView A;
    @ViewById
    RelativeLayout B;
    @ViewById
    LinearLayout C;
    @Pref
    PrefDef_ C1;
    @Extra
    String D;
    com.join.mgps.rpc.i D1;
    @Extra
    String E;
    int E1;
    private Context F;
    List<PlayGameTimeTable> G;
    private DownloadTask H;
    List<PspBattleServer> J;
    g K;
    com.join.mgps.rpc.l L;
    GameMainV3DataBean M;
    private String N;
    com.wufan.user.service.protobuf.n0 O;
    com.join.mgps.rpc.e P;
    private com.join.mgps.socket.fight.arena.b T;
    private com.join.mgps.socket.fight.arena.a U;
    private com.join.mgps.adapter.j1 V;
    private MemberFunAdapter X;
    private GameRecommendAdapter Y;
    com.join.mgps.rpc.f Z;
    @ViewById

    /* renamed from: b  reason: collision with root package name */
    View f32610b;
    @ViewById

    /* renamed from: c  reason: collision with root package name */
    TextView f32611c;
    @ViewById

    /* renamed from: d  reason: collision with root package name */
    TextView f32612d;
    @ViewById

    /* renamed from: e  reason: collision with root package name */
    TextView f32613e;
    @ViewById

    /* renamed from: f  reason: collision with root package name */
    TextView f32614f;
    @ViewById

    /* renamed from: g  reason: collision with root package name */
    TextView f32615g;
    @ViewById

    /* renamed from: h  reason: collision with root package name */
    TextView f32616h;
    @ViewById

    /* renamed from: i  reason: collision with root package name */
    RecyclerView f32617i;
    @ViewById

    /* renamed from: j  reason: collision with root package name */
    RelativeLayout f32618j;
    @ViewById

    /* renamed from: k  reason: collision with root package name */
    TextView f32619k;
    @ViewById

    /* renamed from: l  reason: collision with root package name */
    TextView f32620l;
    @ViewById

    /* renamed from: m  reason: collision with root package name */
    TextView f32621m;
    @ViewById

    /* renamed from: n  reason: collision with root package name */
    TextView f32622n;
    @ViewById

    /* renamed from: o  reason: collision with root package name */
    TextView f32623o;
    @ViewById

    /* renamed from: p  reason: collision with root package name */
    View f32624p;

    /* renamed from: p0  reason: collision with root package name */
    private String f32625p0;
    @ViewById

    /* renamed from: q  reason: collision with root package name */
    TextView f32627q;
    @ViewById

    /* renamed from: r  reason: collision with root package name */
    View f32628r;
    @ViewById

    /* renamed from: s  reason: collision with root package name */
    RecyclerView f32629s;
    @ViewById

    /* renamed from: t  reason: collision with root package name */
    GridView f32630t;
    @ViewById

    /* renamed from: u  reason: collision with root package name */
    SimpleDraweeView f32631u;
    @ViewById

    /* renamed from: v  reason: collision with root package name */
    SimpleDraweeView f32632v;

    /* renamed from: v1  reason: collision with root package name */
    private String f32633v1;
    @ViewById

    /* renamed from: w  reason: collision with root package name */
    RelativeLayout f32634w;
    @ViewById

    /* renamed from: x  reason: collision with root package name */
    LinearLayout f32635x;
    @ViewById

    /* renamed from: y  reason: collision with root package name */
    RelativeLayout f32636y;
    @ViewById

    /* renamed from: z  reason: collision with root package name */
    RelativeLayout f32637z;
    private String I = "";
    private String Q = "";
    private int R = 0;
    private String S = "";
    private List<DynamicEntranceBean> W = new ArrayList();

    /* renamed from: p1  reason: collision with root package name */
    private Bitmap f32626p1 = null;
    private boolean A1 = false;
    private List<CommentAllListBean.GeneralCommentBean> B1 = new ArrayList();
    List<GameMainCommunityBean.PostsBean> F1 = new ArrayList();
    private CountDownTimer G1 = new d(com.join.mgps.data.c.f49010a, 1000);
    private final b.InterfaceC0385b H1 = new e();
    private final SocketListener.NotifyObserver I1 = new f();

    /* loaded from: classes4.dex */
    class a extends a.b0 {
        a() {
        }

        @Override // com.join.mgps.socket.fight.arena.a.b0, com.join.mgps.socket.fight.arena.a.y
        public void W(int i4, int i5, Object obj) {
            super.W(i4, i5, obj);
        }
    }

    /* loaded from: classes4.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GameMainNewActivity.this.z();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class c implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ GameMainV3DataBean f32640b;

        c(GameMainV3DataBean gameMainV3DataBean) {
            this.f32640b = gameMainV3DataBean;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GameMainNewActivity.this.I(this.f32640b.getSurface_bottom_ad().getTpl_type(), Integer.valueOf(this.f32640b.getSurface_bottom_ad().getLink_type()).intValue(), Integer.valueOf(this.f32640b.getSurface_bottom_ad().getJump_type()).intValue(), this.f32640b.getSurface_bottom_ad().getCrc_link_type_val(), this.f32640b.getSurface_bottom_ad().getLink_type_val());
        }
    }

    /* loaded from: classes4.dex */
    class d extends CountDownTimer {
        d(long j4, long j5) {
            super(j4, j5);
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            GameMainNewActivity.this.L();
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j4) {
        }
    }

    /* loaded from: classes4.dex */
    class e extends b.c {
        e() {
        }

        @Override // com.join.mgps.socket.fight.arena.b.c, com.join.mgps.socket.fight.arena.b.InterfaceC0385b
        public void a() {
            super.a();
        }

        @Override // com.join.mgps.socket.fight.arena.b.c, com.join.mgps.socket.fight.arena.b.InterfaceC0385b
        public void c() {
            super.c();
            if (GameMainNewActivity.this.T == null || GameMainNewActivity.this.T.d() == null) {
                return;
            }
            GameMainNewActivity.this.T.d().z(GameMainNewActivity.this.I1);
        }
    }

    /* loaded from: classes4.dex */
    class f implements SocketListener.NotifyObserver {
        f() {
        }

        @Override // app.mgsim.arena.SocketListener.NotifyObserver
        public void onError(SocketError socketError) {
            if (GameMainNewActivity.this.N()) {
                return;
            }
            int i4 = socketError.errorType;
            if (i4 == 6 || i4 == 2) {
                GameMainNewActivity.this.U();
            } else if (i4 == 5) {
                GameMainNewActivity.this.U();
            } else if (i4 == 3 || i4 == 4) {
                GameMainNewActivity.this.U();
            }
        }

        @Override // app.mgsim.arena.SocketListener.NotifyObserver
        public void onServerResponse(ArenaResponse arenaResponse) {
            if (GameMainNewActivity.this.N()) {
                return;
            }
            if (arenaResponse.responseCode == 0) {
                GameMainNewActivity.this.K(arenaResponse);
            } else if (arenaResponse.responseType.equals(ArenaConstants.ArenaCommand.CMD_LOGIN)) {
                GameMainNewActivity.this.w();
            } else if (arenaResponse.responseType.equals(ArenaConstants.ArenaCommand.CMD_CREATE_GAME_ROOM) || arenaResponse.responseType.equals(ArenaConstants.ArenaCommand.CMD_JOIN_ROOM)) {
                GameMainNewActivity.this.L();
                GameRoom gameRoom = (GameRoom) arenaResponse.data;
                if (GameMainNewActivity.this.T != null && GameMainNewActivity.this.T.d() != null) {
                    GameMainNewActivity.this.T.d().E(null);
                }
                if (arenaResponse.responseType.equals(ArenaConstants.ArenaCommand.CMD_CREATE_GAME_ROOM)) {
                    GameMainNewActivity.this.k();
                    GameRoomActivity_.V2(GameMainNewActivity.this).d(gameRoom.getGameName()).i(gameRoom).c("game_main").start();
                }
            }
        }
    }

    private SimpleDraweeView G() {
        SimpleDraweeView simpleDraweeView = new SimpleDraweeView(this);
        simpleDraweeView.setScaleType(ImageView.ScaleType.FIT_XY);
        return simpleDraweeView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean N() {
        if (isFinishing()) {
            return true;
        }
        return Build.VERSION.SDK_INT >= 17 && isDestroyed();
    }

    private void S() {
        b2.d0 n4 = b2.d0.n();
        StringBuilder sb = new StringBuilder();
        sb.append(this.O.getUid());
        String str = "";
        sb.append("");
        List<PlayGameTimeTable> o4 = n4.o(sb.toString(), this.D);
        this.G = o4;
        if (o4 != null && o4.size() > 0) {
            this.f32615g.setVisibility(0);
            this.f32616h.setVisibility(0);
            this.f32613e.setVisibility(0);
            this.f32614f.setVisibility(0);
            long gamePlayTotalTime = this.G.get(0).getGamePlayTotalTime();
            int i4 = (int) (gamePlayTotalTime / 3600);
            long j4 = gamePlayTotalTime % 3600;
            int i5 = (int) (j4 / 60);
            long j5 = j4 % 60;
            if (i4 != 0) {
                str = "" + i4 + "小时";
            }
            if (i5 != 0) {
                str = str + i5 + "分钟";
            }
            this.f32614f.setText(com.join.mgps.Util.g2.h(str) ? "0分钟" : str);
            if (this.G.get(0).getGamePlayRecentlyTime() > 0) {
                this.f32616h.setText(com.join.android.app.common.utils.g.a(this.G.get(0).getGamePlayRecentlyTime() * 1000));
                return;
            } else {
                this.f32616h.setText("无");
                return;
            }
        }
        this.f32615g.setVisibility(4);
        this.f32616h.setVisibility(4);
        this.f32613e.setVisibility(4);
        this.f32614f.setVisibility(4);
        this.f32614f.setText("0分钟");
        this.f32616h.setText("未玩过");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void U() {
        try {
            Toast.makeText(this, "网络不稳定，请重试", 0).show();
        } catch (Exception unused) {
        }
    }

    private void W(int i4) {
        if (this.B1.size() >= i4) {
            GameMaingameinfo game_info = this.M.getGame_info();
            CommentDetailActivity_.M1(this.F).d(this.D).b(this.B1.get(i4 - 1).getId()).f(game_info.getGame_plugin_num()).a(Integer.valueOf(game_info.getGame_bespeak_switch()).intValue()).e(game_info.getGame_is_started()).h(0).g(game_info.getGame_package()).c(game_info.getGame_comment_score_switch()).start();
        }
    }

    private void Y(int i4) {
        if (this.F1.size() >= i4) {
            int pid = this.F1.get(i4 - 1).getPid();
            ForumBean.ForumPostsBean forumPostsBean = new ForumBean.ForumPostsBean();
            forumPostsBean.setPid(pid);
            com.join.mgps.Util.j0.w0(this.F, forumPostsBean, new ExtBean("0", pid + "", "-1"));
        }
    }

    private void Z(boolean z4) {
        GameMainNetBattle net_battle;
        String str;
        char c5;
        char c6;
        String fight_fun = this.H.getFight_fun();
        if (com.join.mgps.Util.g2.i(fight_fun)) {
            this.W.clear();
            this.V.b();
            if (fight_fun.length() >= 2) {
                char charAt = fight_fun.charAt(1);
                if (fight_fun.length() >= 7) {
                    c5 = fight_fun.charAt(6);
                    if (fight_fun.charAt(5) == '1') {
                        c6 = '1';
                        if ('1' != charAt || '1' == c5) {
                            this.f32618j.setVisibility(0);
                        } else if ('0' == charAt && '0' == c5 && c6 == '1') {
                            this.f32618j.setVisibility(0);
                        } else {
                            this.f32618j.setVisibility(8);
                        }
                    }
                } else {
                    c5 = '0';
                }
                c6 = '0';
                if ('1' != charAt) {
                }
                this.f32618j.setVisibility(0);
            }
            if (fight_fun.length() > 12 && O(this, this.H) && fight_fun.charAt(12) == '1') {
                this.W.add(new DynamicEntranceBean("排位赛", "NEW", 1));
            }
            if (fight_fun.length() > 4 && fight_fun.charAt(4) == '1') {
                this.W.add(new DynamicEntranceBean("练习模式", "", 5));
            }
            if (fight_fun.length() >= 4 && fight_fun.charAt(3) == '1') {
                this.W.add(new DynamicEntranceBean("约战", "", 2));
            }
            if (fight_fun.length() >= 1 && '1' == fight_fun.charAt(0)) {
                this.W.add(new DynamicEntranceBean("本地对战", "", 3));
            }
        }
        if (this.M != null) {
            this.f32636y.setVisibility(8);
            this.f32637z.setVisibility(0);
            GameMaingameinfo game_info = this.M.getGame_info();
            if (game_info != null) {
                String game_back_ground_img = game_info.getGame_back_ground_img();
                if (!com.join.mgps.Util.g2.h(game_back_ground_img)) {
                    this.f32631u.setImageURI(game_back_ground_img);
                }
                this.E1 = game_info.getCommunity_area_id();
                if (z4) {
                    if (!com.join.mgps.Util.g2.h(this.N)) {
                        E(this.N);
                    } else if (this.E1 != 0) {
                        B();
                    } else {
                        y();
                    }
                }
            }
            GameMainV3DataBean.MemberInfoBean member_info = this.M.getMember_info();
            if (member_info != null) {
                if (!com.join.mgps.Util.g2.h(member_info.getPic_remote())) {
                    this.f32632v.setImageURI(member_info.getPic_remote());
                }
                this.f32620l.setText(member_info.getTitle());
                this.f32621m.setText(Html.fromHtml(member_info.getSub_title()));
            }
            List<GameMainV3DataBean.MemberFunBean> member_fun = this.M.getMember_fun();
            if (member_fun != null && member_fun.size() > 0) {
                this.X.c(member_fun);
            }
            List<GameMainV3DataBean.GameRecommendInfoBean> game_recommend_info = this.M.getGame_recommend_info();
            if (game_recommend_info != null && game_recommend_info.size() > 0) {
                this.Y.b(game_recommend_info);
            }
            if (this.M.getNet_battle() != null) {
                this.f32612d.setText(net_battle.getNumber() + "房");
            }
            GameMainV3DataBean.PlayGameInfoBean play_game_info = this.M.getPlay_game_info();
            this.f32615g.setVisibility(4);
            this.f32616h.setVisibility(4);
            this.f32613e.setVisibility(4);
            this.f32614f.setVisibility(4);
            if (play_game_info != null) {
                int file_save_count = play_game_info.getFile_save_count();
                if (play_game_info.getFile_save_switch() == 1) {
                    this.W.add(new DynamicEntranceBean("云存档", file_save_count + "", 4));
                }
                this.V.notifyDataSetChanged();
                long current_play_time = play_game_info.getCurrent_play_time();
                int i4 = (int) (current_play_time / 3600);
                long j4 = current_play_time % 3600;
                int i5 = (int) (j4 / 60);
                long j5 = j4 % 60;
                if (i4 != 0) {
                    str = "" + i4 + "小时";
                } else {
                    str = "";
                }
                if (i5 != 0) {
                    str = str + i5 + "分钟";
                }
                if (com.join.mgps.Util.g2.h(str)) {
                    str = "0分钟";
                }
                this.f32614f.setText(str);
                if (play_game_info.getCurrent_play_time() > 0) {
                    String a5 = com.join.android.app.common.utils.g.a(play_game_info.getLast_play_time() * 1000);
                    b2.d0.n().m(new PlayGameTimeTable(this.O.getUid() + "", this.D, current_play_time, play_game_info.getLast_play_time()));
                    this.f32616h.setText(a5);
                    this.f32615g.setVisibility(0);
                    this.f32616h.setVisibility(0);
                    this.f32613e.setVisibility(0);
                    this.f32614f.setVisibility(0);
                    return;
                }
                b2.d0.n().m(new PlayGameTimeTable(this.O.getUid() + "", this.D, current_play_time, 0L));
                this.f32615g.setVisibility(4);
                this.f32616h.setVisibility(4);
                this.f32613e.setVisibility(4);
                this.f32614f.setVisibility(4);
                return;
            }
            this.f32615g.setVisibility(4);
            this.f32616h.setVisibility(4);
            this.f32613e.setVisibility(4);
            this.f32614f.setVisibility(4);
            this.V.notifyDataSetChanged();
            return;
        }
        this.f32636y.setVisibility(0);
        this.f32637z.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        CountDownTimer countDownTimer = this.G1;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
    }

    private void q() {
        com.papa.sim.statistic.p.l(this).X0(Event.startArchiveManagement, AccountUtil_.getInstance_(this).getUid(), this.D, "1");
        DocumentManageActivity_.S0(this.F).a(1).b(this.D).start();
    }

    private void s() {
        ApFightActivity_.n0(this.F).a(this.D).start();
        com.papa.sim.statistic.p.l(this).y0(this.H.getCrc_link_type_val(), this.O.getUid());
    }

    private void u() {
        MobclickAgent.onEvent(this.F, "onEnterQualifying");
        if (com.join.android.app.common.utils.j.j(this)) {
            if (UtilsMy.W(this.F, this.H) == null) {
                Toast.makeText(this, "正在下载插件...", 1).show();
                L();
                return;
            } else if (this.M == null) {
                return;
            } else {
                GamePaiWeiActivty_.o0(this.F).a(this.D).b(this.M.getGame_info().getMax_battle_count()).start();
                return;
            }
        }
        com.join.mgps.Util.l2.a(this).b("无网络连接");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w() {
        if (com.join.android.app.common.utils.j.j(this)) {
            if (!IntentUtil.getInstance().goLoginBattle(this)) {
                k();
                this.f32610b.setVisibility(0);
                this.G1.start();
                if (UtilsMy.W(this.F, this.H) == null) {
                    Toast.makeText(this, "正在下载插件...", 1).show();
                    L();
                    return;
                }
                com.join.mgps.socket.fight.arena.b bVar = this.T;
                if (bVar != null && bVar.d() != null) {
                    if (this.T.d().s()) {
                        this.T.f(ArenaRequestFactory.createRoom(ArenaConstants.REGISTER_TYPE_GAMEMAIN, this.D, 0, AccountUtil_.getInstance_(this).getAccountData().getUid(), true));
                    } else {
                        ArenaRequest login = ArenaRequestFactory.login(ArenaConstants.REGISTER_TYPE_GAMEMAIN);
                        login.isRefreshing = true;
                        login.isElite = false;
                        this.T.f(login);
                    }
                }
            }
            com.papa.sim.statistic.p.l(this).N0(this.H.getCrc_link_type_val(), this.O.getUid());
            return;
        }
        com.join.mgps.Util.l2.a(this).b("无网络连接");
    }

    private void x() {
        UtilsMy.i(null, this.H, this, 3);
        com.papa.sim.statistic.p.l(this).T0(this.H.getCrc_link_type_val(), this.O.getUid());
        com.papa.sim.statistic.p.l(this).A0(this.H.getCrc_link_type_val(), this.O.getUid());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void A() {
        try {
            GameMainTable o4 = b2.u.n().o(this.D);
            if (o4 != null) {
                GameMainV3DataBean gameMainV3DataBean = (GameMainV3DataBean) JsonMapper.getInstance().fromJson(o4.getGame_main_data(), GameMainV3DataBean.class);
                if (gameMainV3DataBean != null && gameMainV3DataBean.getGame_info() != null) {
                    this.N = gameMainV3DataBean.getGame_info().getCommunity_multi_posts_id();
                }
                if (gameMainV3DataBean != null) {
                    a0(gameMainV3DataBean, false);
                }
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void B() {
        if (com.join.android.app.common.utils.j.j(this)) {
            try {
                ResultResMainBean<GameMainCommunityBean> n4 = this.D1.n(this.E1);
                if (n4 == null || n4.getError() != 0 || n4.getData() == null) {
                    return;
                }
                List<GameMainCommunityBean.PostsBean> posts = n4.getData().getPosts();
                this.F1.clear();
                if (posts != null && posts.size() > 0) {
                    String subject = posts.get(0).getSubject();
                    if (com.join.mgps.Util.g2.h(subject)) {
                        subject = posts.get(0).getMessage();
                    }
                    this.F1.add(new GameMainCommunityBean.PostsBean(subject, posts.get(0).getPid()));
                    if (posts.size() > 1) {
                        String subject2 = posts.get(1).getSubject();
                        if (com.join.mgps.Util.g2.h(subject2)) {
                            subject2 = posts.get(1).getMessage();
                        }
                        this.F1.add(new GameMainCommunityBean.PostsBean(subject2, posts.get(1).getPid()));
                    }
                }
                Q();
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    public RequestCommentAllListArgs C() {
        this.O = AccountUtil_.getInstance_(this.F).getAccountData();
        String d5 = this.C1.commentToken().d();
        com.wufan.user.service.protobuf.n0 n0Var = this.O;
        return RequestBeanUtil.getInstance(this.F).getRequestCommentAllList(1, 10, this.D, n0Var != null ? n0Var.getUid() : 0, d5);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void D() {
        if (com.join.android.app.common.utils.j.j(this.F)) {
            try {
                ForumResponse<ForumData.HomepageRecommendLabel> O = this.D1.O(0, 1, AccountUtil_.getInstance_(this.F).getUid(), AccountUtil_.getInstance_(this.F).getToken());
                if (O == null || O.getError() != 0 || O.getData() == null) {
                    return;
                }
                List<ForumBean.ForumPostsBean> post_list = O.getData().getPost_list();
                this.F1.clear();
                if (post_list != null && post_list.size() > 0) {
                    this.F1.add(new GameMainCommunityBean.PostsBean(post_list.get(0).getSubject(), post_list.get(0).getPid()));
                    if (post_list.size() > 0) {
                        this.F1.add(new GameMainCommunityBean.PostsBean(post_list.get(1).getSubject(), post_list.get(1).getPid()));
                    }
                }
                Q();
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void E(String str) {
        if (com.join.android.app.common.utils.j.j(this)) {
            try {
                ForumResponse<MulPostData> L = this.D1.L(str);
                if (L == null || L.getError() != 0 || L.getData() == null) {
                    return;
                }
                List<ForumBean.ForumPostsBean> posts_list = L.getData().getPosts_list();
                this.F1.clear();
                if (posts_list != null && posts_list.size() > 0) {
                    this.F1.add(new GameMainCommunityBean.PostsBean(posts_list.get(0).getSubject(), posts_list.get(0).getPid()));
                    if (posts_list.size() > 1) {
                        this.F1.add(new GameMainCommunityBean.PostsBean(posts_list.get(1).getSubject(), posts_list.get(1).getPid()));
                    }
                }
                Q();
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void F() {
        try {
            GameWorldResponse<List<PspBattleServer>> v2 = this.L.v();
            if (v2.getError() == 701) {
                l();
            } else if (v2.getError() == 0) {
                this.J = v2.getData();
                T();
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background(delay = 1500)
    public void H() {
    }

    void I(String str, int i4, int i5, String str2, String str3) {
        IntentDateBean intentDateBean = new IntentDateBean();
        intentDateBean.setTpl_type(str);
        intentDateBean.setLink_type(i4);
        intentDateBean.setJump_type(i5);
        intentDateBean.setCrc_link_type_val(str2);
        intentDateBean.setLink_type_val(str3);
        IntentUtil.getInstance().intentActivity(this.F, intentDateBean);
    }

    @Override // com.join.mgps.adapter.j1.a
    public void J(DynamicEntranceBean dynamicEntranceBean) {
        int typeId = dynamicEntranceBean.getTypeId();
        if (typeId == 1) {
            u();
        } else if (typeId == 2) {
            w();
        } else if (typeId == 3) {
            s();
        } else if (typeId == 4) {
            q();
        } else if (typeId != 5) {
        } else {
            x();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void K(ArenaResponse arenaResponse) {
        L();
        int i4 = arenaResponse.errorType;
        if (i4 == 16) {
            this.U.D(com.join.mgps.socket.fight.arena.a.f54752j, 257, Integer.valueOf(arenaResponse.errorType), "无法加入，你被禁止加入该房间", "确定");
        } else if (i4 == 17) {
            this.U.D(com.join.mgps.socket.fight.arena.a.f54752j, 257, Integer.valueOf(arenaResponse.errorType), "该房间为比赛专用房间,非参赛选手无法加入", "我知道了");
        } else if (i4 == 9) {
            this.U.D(com.join.mgps.socket.fight.arena.a.f54752j, 257, Integer.valueOf(arenaResponse.errorType), "房间人数已满你无法加入房间!", "确定");
        } else if (i4 == 7) {
            this.U.D(com.join.mgps.socket.fight.arena.a.f54752j, 256, Integer.valueOf(arenaResponse.errorType), "密码输入错误，请重试!", "取消", "确定", arenaResponse);
        } else if (i4 == 8) {
            this.U.D(com.join.mgps.socket.fight.arena.a.f54752j, 257, Integer.valueOf(arenaResponse.errorType), "房间已经被解散!", "确定");
        } else if (i4 == 11) {
            this.U.D(com.join.mgps.socket.fight.arena.a.f54752j, 257, Integer.valueOf(arenaResponse.errorType), "铜板不足，无法创建房间!", "确定");
        } else if (i4 == 13) {
            this.U.D(com.join.mgps.socket.fight.arena.a.f54752j, 257, Integer.valueOf(arenaResponse.errorType), "铜板不足，无法加入房间", "确定");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void L() {
        this.f32610b.setVisibility(8);
    }

    void M() {
        ((LoginSplashActivity_.IntentBuilder_) LoginSplashActivity_.intent(this.F).flags(268435456)).start();
    }

    boolean O(Context context, DownloadTask downloadTask) {
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
    @UiThread
    public void P() {
        List<CommentAllListBean.GeneralCommentBean> list = this.B1;
        if (list == null) {
            this.f32636y.setVisibility(0);
            this.f32637z.setVisibility(8);
            return;
        }
        if (list.size() > 0) {
            this.f32623o.setText(this.B1.get(0).getContent());
            this.f32623o.setVisibility(0);
            this.f32624p.setVisibility(0);
        } else {
            this.f32623o.setVisibility(4);
            this.f32624p.setVisibility(4);
        }
        if (this.B1.size() > 1) {
            this.f32627q.setText(this.B1.get(1).getContent());
            this.f32627q.setVisibility(0);
            this.f32628r.setVisibility(0);
            return;
        }
        this.f32627q.setVisibility(4);
        this.f32628r.setVisibility(4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void Q() {
        if (this.F1 != null) {
            this.f32636y.setVisibility(8);
            this.f32637z.setVisibility(0);
            if (this.F1.size() > 0) {
                this.f32623o.setText(this.F1.get(0).getSubject());
                this.f32623o.setVisibility(0);
                this.f32624p.setVisibility(0);
            } else {
                this.f32623o.setVisibility(4);
                this.f32624p.setVisibility(4);
            }
            if (this.F1.size() > 1) {
                this.f32627q.setText(this.F1.get(1).getSubject());
                this.f32627q.setVisibility(0);
                this.f32628r.setVisibility(0);
                return;
            }
            this.f32627q.setVisibility(4);
            this.f32628r.setVisibility(4);
            return;
        }
        this.f32636y.setVisibility(0);
        this.f32637z.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void R(GameMainV3DataBean gameMainV3DataBean) {
        try {
            if (gameMainV3DataBean.getSurface_bottom_ad() == null || gameMainV3DataBean.getSurface_bottom_ad().getAd_switch() != 1) {
                return;
            }
            this.B.setVisibility(8);
            this.A.setVisibility(0);
            this.A.setImageURI(gameMainV3DataBean.getSurface_bottom_ad().getPic_remote());
            this.A.getHierarchy().x(r.c.f11295b);
            this.A.setOnClickListener(new c(gameMainV3DataBean));
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void T() {
        g gVar = this.K;
        if (gVar != null && gVar.isShowing()) {
            this.K.dismiss();
        }
        g gVar2 = new g(this.F, R.style.HKDialogLoading);
        this.K = gVar2;
        gVar2.show();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void V() {
        String str;
        GameMainV3DataBean gameMainV3DataBean = this.M;
        if (gameMainV3DataBean == null || gameMainV3DataBean.getMember_info() == null) {
            return;
        }
        GameMainV3DataBean.MemberInfoBean member_info = this.M.getMember_info();
        if (Integer.parseInt(member_info.getLink_type()) == 4 && member_info.getLink_type_val() != null && member_info.getLink_type_val().startsWith(com.facebook.common.util.f.f10923a)) {
            String link_type_val = member_info.getLink_type_val();
            if (link_type_val.contains("?")) {
                str = link_type_val + "&game_id=" + this.D;
            } else {
                str = link_type_val + "?game_id=" + this.D;
            }
            member_info.setLink_type_val(str);
        }
        IntentDateBean intentDateBean = new IntentDateBean();
        intentDateBean.setLink_type(Integer.valueOf(member_info.getLink_type()).intValue());
        intentDateBean.setJump_type(Integer.valueOf(member_info.getJump_type()).intValue());
        intentDateBean.setLink_type_val(member_info.getLink_type_val());
        IntentUtil.getInstance().intentActivity(this.F, intentDateBean);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void X() {
        GameMainV3DataBean gameMainV3DataBean = this.M;
        if (gameMainV3DataBean == null) {
            return;
        }
        GameMaingameinfo game_info = gameMainV3DataBean.getGame_info();
        if (game_info.getGame_comment_score_switch().equals("0")) {
            ForumIndexActivity_.i0(this).start();
        } else {
            CommentAllListActivity_.H0(this.F).f(this.D).i(game_info.getGame_package()).h(game_info.getGame_plugin_num()).a(Integer.valueOf(game_info.getGame_bespeak_switch()).intValue()).g(game_info.getGame_is_started()).j(0).d(game_info.getGame_comment_score_switch()).start();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void a0(GameMainV3DataBean gameMainV3DataBean, boolean z4) {
        this.M = gameMainV3DataBean;
        GameMaingameinfo game_info = gameMainV3DataBean.getGame_info();
        if (game_info != null) {
            this.f32611c.setText(game_info.getGame_name());
        }
        Z(z4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void j() {
        this.F = this;
        this.P = com.join.mgps.rpc.impl.d.P1();
        this.L = com.join.mgps.rpc.impl.l.n0();
        this.D1 = com.join.mgps.rpc.impl.g.A0();
        this.Z = com.join.mgps.rpc.impl.e.m();
        this.A.setVisibility(8);
        this.H = p1.f.K().F(this.D);
        this.O = AccountUtil_.getInstance_(this.F).getAccountData();
        DownloadTask downloadTask = this.H;
        if (downloadTask != null) {
            this.f32611c.setText(downloadTask.getShowName());
        }
        com.join.mgps.adapter.j1 j1Var = new com.join.mgps.adapter.j1(this, this.W, this);
        this.V = j1Var;
        this.f32630t.setAdapter((ListAdapter) j1Var);
        this.f32630t.setOverScrollMode(2);
        int dimension = (int) getResources().getDimension(R.dimen.wdp916);
        int dimension2 = (int) getResources().getDimension(R.dimen.wdp667);
        int dimension3 = (int) getResources().getDimension(R.dimen.wdp27);
        int dimension4 = (int) getResources().getDimension(R.dimen.wdp343);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int i4 = displayMetrics.heightPixels;
        if (Float.valueOf(displayMetrics.widthPixels).floatValue() / i4 > 1.7777778f) {
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(dimension4, -1);
            layoutParams.gravity = 1;
            this.f32635x.setLayoutParams(layoutParams);
        }
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams((dimension * (i4 - (dimension3 * 2))) / dimension2, -1);
        layoutParams2.leftMargin = dimension3;
        layoutParams2.topMargin = dimension3;
        layoutParams2.bottomMargin = dimension3;
        this.f32631u.setLayoutParams(layoutParams2);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(1);
        this.f32629s.setLayoutManager(linearLayoutManager);
        GameRecommendAdapter gameRecommendAdapter = new GameRecommendAdapter(this);
        this.Y = gameRecommendAdapter;
        this.f32629s.setAdapter(gameRecommendAdapter);
        this.X = new MemberFunAdapter(this, this.D);
        this.f32617i.setLayoutManager(new GridLayoutManager(this.F, 4));
        this.f32617i.setAdapter(this.X);
        A();
        z();
        this.U = new com.join.mgps.socket.fight.arena.a(this, new a());
        com.papa.sim.statistic.p.l(this).Z0(Event.indexGameStart, AccountUtil_.getInstance_(this).getUid(), this.D, this.E, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void l() {
        com.join.mgps.Util.l2.a(this).b("登录已失效请您重新登录");
        M();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void m() {
        X();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void n() {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void o() {
        List<CommentAllListBean.GeneralCommentBean> list = this.B1;
        if (list != null && list.size() > 0) {
            W(1);
        } else {
            Y(1);
        }
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        com.join.mgps.socket.fight.arena.a aVar = this.U;
        if (aVar != null) {
            aVar.w();
        }
        com.papa.sim.statistic.p.l(this).z0(this.H.getCrc_link_type_val(), this.O.getUid());
        com.join.mgps.socket.fight.arena.b bVar = this.T;
        if (bVar != null && bVar.d() != null) {
            this.T.d().A(this.I1);
        }
        com.join.mgps.socket.fight.arena.b bVar2 = this.T;
        if (bVar2 != null) {
            bVar2.g();
            this.T.stopService();
            this.T = null;
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        L();
        this.O = AccountUtil_.getInstance_(this).getAccountData();
        if (this.T == null) {
            com.join.mgps.socket.fight.arena.b bVar = new com.join.mgps.socket.fight.arena.b(this, this.H1);
            this.T = bVar;
            bVar.bindService();
        }
        H();
        if (this.H != null) {
            com.papa.sim.statistic.p.l(this).d(p1.f.K().L(this.D, this), 0);
            com.papa.sim.statistic.p.l(this).d(p1.f.K().L(this.D, this), 1);
        }
        if (this.A1) {
            new Handler().postDelayed(new b(), 1500L);
        }
        GameRecommendAdapter gameRecommendAdapter = this.Y;
        if (gameRecommendAdapter != null) {
            gameRecommendAdapter.c();
        }
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
        com.join.mgps.socket.fight.arena.b bVar = this.T;
        if (bVar != null && bVar.d() != null) {
            this.T.d().A(this.I1);
        }
        com.join.mgps.socket.fight.arena.b bVar2 = this.T;
        if (bVar2 != null) {
            bVar2.g();
            this.T.stopService();
            this.T = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void p() {
        List<CommentAllListBean.GeneralCommentBean> list = this.B1;
        if (list != null && list.size() > 0) {
            W(2);
        } else {
            Y(2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void r() {
        char c5;
        char c6;
        com.papa.sim.statistic.p.l(this).R(AccountUtil_.getInstance_(this).getUid());
        com.papa.sim.statistic.p.l(this).y(AccountUtil_.getInstance_(this).getUid(), this.D, "game_main");
        try {
            com.papa.sim.statistic.p.l(this).L0(this.D, Integer.parseInt(AccountUtil_.getInstance_(this).getUid()));
        } catch (Exception unused) {
        }
        GameInfoBean gameInfoBean = new GameInfoBean();
        gameInfoBean.setGame_id(this.D);
        GameMainV3DataBean gameMainV3DataBean = this.M;
        if (gameMainV3DataBean != null) {
            gameInfoBean.setGame_name(gameMainV3DataBean.getGame_info().getGame_name());
        }
        DownloadTask downloadTask = this.H;
        if (downloadTask != null && com.join.mgps.Util.g2.i(downloadTask.getFight_fun())) {
            String fight_fun = this.H.getFight_fun();
            char charAt = fight_fun.charAt(1);
            if (fight_fun.length() >= 7) {
                c6 = fight_fun.charAt(6);
                c5 = fight_fun.charAt(5) == '1' ? '1' : '0';
            } else {
                c5 = '0';
                c6 = '0';
            }
            if ('0' == charAt && '0' == c6 && c5 == '1') {
                F();
                return;
            }
        }
        GameRoomListActivity_.W3(this.F).b(true).c(gameInfoBean).start();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void t() {
        if (this.f32636y.getVisibility() != 0 && this.E1 != 0) {
            IntentUtil.getInstance().goForumGroupActivity(this, this.E1);
        } else {
            X();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void v() {
        int i4;
        int i5;
        GameMainV3DataBean gameMainV3DataBean = this.M;
        if (gameMainV3DataBean != null) {
            int silence_room_switch = gameMainV3DataBean.getNet_battle().getSilence_room_switch();
            if (silence_room_switch == 0) {
                UtilsMy.i(null, this.H, this.F, 0);
            } else {
                String fight_fun = this.H.getFight_fun();
                boolean z4 = com.join.mgps.Util.g2.i(fight_fun) && fight_fun.length() >= 7 && '1' == fight_fun.charAt(6);
                int max_battle_count = this.M.getGame_info() != null ? this.M.getGame_info().getMax_battle_count() : 0;
                if (silence_room_switch == 1) {
                    if (com.join.mgps.Util.g2.i(this.Q) && (i5 = this.R) != 0) {
                        UtilsMy.k(this.H, this.F, 1, this.Q, i5, this.S, max_battle_count);
                    } else {
                        UtilsMy.i(null, this.H, this.F, 0);
                    }
                } else if (silence_room_switch == 2 && z4) {
                    if (com.join.mgps.Util.g2.i(this.Q) && (i4 = this.R) != 0) {
                        UtilsMy.k(this.H, this.F, 1, this.Q, i4, this.S, max_battle_count);
                    } else {
                        UtilsMy.i(null, this.H, this.F, 0);
                    }
                } else {
                    UtilsMy.i(null, this.H, this.F, 0);
                }
            }
        } else {
            UtilsMy.i(null, this.H, this.F, 0);
        }
        com.papa.sim.statistic.p.l(this).I0(this.H.getCrc_link_type_val(), this.O.getUid());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void y() {
        if (com.join.android.app.common.utils.j.j(this.F)) {
            CommentResponse<CommentAllListBean> b5 = this.Z.b(C());
            if (b5 != null) {
                this.B1 = b5.getData_info().getGeneral_comment();
                P();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void z() {
        ResultMessageBean<GameMainV3DataBean> messages;
        try {
            RequestBeanUtil requestBeanUtil = RequestBeanUtil.getInstance(this);
            String str = this.D;
            com.wufan.user.service.protobuf.n0 n0Var = this.O;
            ResultMainBean<GameMainV3DataBean> G = this.P.G(requestBeanUtil.getGameMainData(str, n0Var != null ? n0Var.getUid() : 1));
            this.A1 = true;
            if (G == null || G.getFlag() != 1 || (messages = G.getMessages()) == null) {
                return;
            }
            GameMainV3DataBean data = messages.getData();
            R(data);
            if (data.getGame_info() != null) {
                this.N = data.getGame_info().getCommunity_multi_posts_id();
            }
            GameMainTable o4 = b2.u.n().o(this.D);
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
                o4.setGameid(this.D);
                o4.setGame_main_data(json);
                b2.u.n().update(o4);
            } else {
                GameMainTable gameMainTable = new GameMainTable();
                String json2 = JsonMapper.getInstance().toJson(data);
                gameMainTable.setGameid(this.D);
                gameMainTable.setGame_main_data(json2);
                b2.u.n().k(gameMainTable);
            }
            a0(data, true);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class g extends Dialog {

        /* loaded from: classes4.dex */
        class a implements AdapterView.OnItemClickListener {
            a() {
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i4, long j4) {
                PspBattleServer pspBattleServer = GameMainNewActivity.this.J.get(i4);
                NetBattleStartGameDto netBattleStartGameDto = new NetBattleStartGameDto();
                netBattleStartGameDto.setServerIP(pspBattleServer.getIp());
                netBattleStartGameDto.setServerPort(pspBattleServer.getPort());
                netBattleStartGameDto.setGameID(GameMainNewActivity.this.D + "");
                netBattleStartGameDto.setUserID(AccountUtil_.getInstance_(GameMainNewActivity.this.F).getAccountData().getUid() + "");
                netBattleStartGameDto.setOldGame(0);
                netBattleStartGameDto.setClientIp(GameMainNewActivity.this.I);
                netBattleStartGameDto.setUserName(AccountUtil_.getInstance_(GameMainNewActivity.this.F).getAccountData().getNickname());
                netBattleStartGameDto.setUserIcon(AccountUtil_.getInstance_(GameMainNewActivity.this.F).getAccountData().d0());
                netBattleStartGameDto.setPorder(0);
                UtilsMy.b4(GameMainNewActivity.this.F, netBattleStartGameDto, GameMainNewActivity.this.H, 13);
            }
        }

        /* loaded from: classes4.dex */
        private class b extends BaseAdapter {
            private b() {
            }

            @Override // android.widget.Adapter
            public int getCount() {
                return GameMainNewActivity.this.J.size();
            }

            @Override // android.widget.Adapter
            public Object getItem(int i4) {
                return GameMainNewActivity.this.J.get(i4);
            }

            @Override // android.widget.Adapter
            public long getItemId(int i4) {
                return i4;
            }

            @Override // android.widget.Adapter
            public View getView(int i4, View view, ViewGroup viewGroup) {
                if (view == null) {
                    view = LayoutInflater.from(GameMainNewActivity.this.F).inflate(R.layout.dialog_psp_item, (ViewGroup) null);
                }
                ((TextView) view.findViewById(R.id.name)).setText(GameMainNewActivity.this.J.get(i4).getServer_name());
                ((TextView) view.findViewById(R.id.count)).setText(GameMainNewActivity.this.J.get(i4).getPeople() + "人");
                return view;
            }

            /* synthetic */ b(g gVar, a aVar) {
                this();
            }
        }

        public g(Context context) {
            super(context);
        }

        @Override // android.app.Dialog
        protected void onCreate(Bundle bundle) {
            super.onCreate(bundle);
            requestWindowFeature(1);
            requestWindowFeature(-1);
            View inflate = LayoutInflater.from(GameMainNewActivity.this.F).inflate(R.layout.network_psp_dialog, (ViewGroup) null);
            ListView listView = (ListView) inflate.findViewById(R.id.listview);
            listView.setAdapter((ListAdapter) new b(this, null));
            listView.setOnItemClickListener(new a());
            setContentView(inflate);
        }

        protected g(Context context, boolean z4, DialogInterface.OnCancelListener onCancelListener) {
            super(context, z4, onCancelListener);
        }

        public g(Context context, int i4) {
            super(context, i4);
        }
    }
}
