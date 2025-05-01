package com.join.mgps.activity;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.ViewFlipper;
import androidx.appcompat.widget.Toolbar;
import com.facebook.drawee.view.SimpleDraweeView;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.join.android.app.common.utils.JsonMapper;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.Util.RequestBeanUtil;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.Util.WifiUtils;
import com.join.mgps.customview.ViewPagerWithADs;
import com.join.mgps.db.tables.GameMainTable;
import com.join.mgps.dto.BannerBean;
import com.join.mgps.dto.GameInfoBean;
import com.join.mgps.dto.GameMainDataBean;
import com.join.mgps.dto.GameMainNetBattle;
import com.join.mgps.dto.GameMainPostBean;
import com.join.mgps.dto.GameMainachieve;
import com.join.mgps.dto.GameMaingameinfo;
import com.join.mgps.dto.ResultMainBean;
import com.join.mgps.dto.ResultMessageBean;
import com.join.mgps.dto.ResultValbean;
import com.join.mgps.pref.PrefDef_;
import java.util.List;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.Extra;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
import org.androidannotations.annotations.sharedpreferences.Pref;
@EActivity(R.layout.activity_game_mainv2)
/* loaded from: classes4.dex */
public class GameMainActivityv2 extends Activity {
    private DownloadTask A;
    GameMainDataBean B;
    private String C = "";
    private boolean D = false;
    @ViewById

    /* renamed from: b  reason: collision with root package name */
    TextView f32564b;
    @ViewById

    /* renamed from: c  reason: collision with root package name */
    ImageView f32565c;
    @ViewById

    /* renamed from: d  reason: collision with root package name */
    ImageView f32566d;
    @ViewById

    /* renamed from: e  reason: collision with root package name */
    ImageView f32567e;
    @ViewById

    /* renamed from: f  reason: collision with root package name */
    SimpleDraweeView f32568f;
    @ViewById

    /* renamed from: g  reason: collision with root package name */
    TextView f32569g;
    @ViewById

    /* renamed from: h  reason: collision with root package name */
    TextView f32570h;
    @ViewById

    /* renamed from: i  reason: collision with root package name */
    SimpleDraweeView f32571i;
    @ViewById

    /* renamed from: j  reason: collision with root package name */
    SimpleDraweeView f32572j;
    @ViewById

    /* renamed from: k  reason: collision with root package name */
    LinearLayout f32573k;
    @ViewById

    /* renamed from: l  reason: collision with root package name */
    LinearLayout f32574l;
    @ViewById

    /* renamed from: m  reason: collision with root package name */
    LinearLayout f32575m;
    @ViewById

    /* renamed from: n  reason: collision with root package name */
    RelativeLayout f32576n;
    @ViewById

    /* renamed from: o  reason: collision with root package name */
    RelativeLayout f32577o;
    @ViewById

    /* renamed from: p  reason: collision with root package name */
    RelativeLayout f32578p;
    @ViewById

    /* renamed from: q  reason: collision with root package name */
    ViewPagerWithADs f32579q;
    @ViewById

    /* renamed from: r  reason: collision with root package name */
    LinearLayout f32580r;
    @ViewById

    /* renamed from: s  reason: collision with root package name */
    ViewFlipper f32581s;
    @ViewById

    /* renamed from: t  reason: collision with root package name */
    TextView f32582t;
    @Extra

    /* renamed from: u  reason: collision with root package name */
    String f32583u;
    @Pref

    /* renamed from: v  reason: collision with root package name */
    PrefDef_ f32584v;

    /* renamed from: w  reason: collision with root package name */
    com.join.mgps.rpc.e f32585w;

    /* renamed from: x  reason: collision with root package name */
    com.wufan.user.service.protobuf.n0 f32586x;

    /* renamed from: y  reason: collision with root package name */
    private Toolbar f32587y;

    /* renamed from: z  reason: collision with root package name */
    Context f32588z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a implements AppBarLayout.OnOffsetChangedListener {
        a() {
        }

        @Override // com.google.android.material.appbar.AppBarLayout.OnOffsetChangedListener, com.google.android.material.appbar.AppBarLayout.BaseOnOffsetChangedListener
        public void onOffsetChanged(AppBarLayout appBarLayout, int i4) {
            int totalScrollRange = appBarLayout.getTotalScrollRange();
            GameMainActivityv2.this.f32588z.getResources().getDimensionPixelOffset(R.dimen.action_bar_height);
            if (i4 == 0) {
                GameMainActivityv2.this.f32564b.setTextColor(-1);
                GameMainActivityv2.this.f32564b.setText("游戏主页");
                GameMainActivityv2.this.f32565c.setImageResource(R.drawable.icon_black_bg_back);
            } else if ((-i4) >= totalScrollRange - 5) {
                GameMainActivityv2.this.f32564b.setTextColor(-12303292);
                GameMainActivityv2 gameMainActivityv2 = GameMainActivityv2.this;
                gameMainActivityv2.f32564b.setText(gameMainActivityv2.A.getShowName());
                GameMainActivityv2.this.f32565c.setImageResource(R.drawable.gamemain_titleback);
            } else {
                GameMainActivityv2.this.f32564b.setTextColor(-1);
                GameMainActivityv2.this.f32564b.setText("游戏主页");
                GameMainActivityv2.this.f32565c.setImageResource(R.drawable.icon_black_bg_back);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class b implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ BannerBean f32590b;

        b(BannerBean bannerBean) {
            this.f32590b = bannerBean;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IntentUtil.getInstance().intentActivity(GameMainActivityv2.this.f32588z, this.f32590b.getIntentDataBean());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class c implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ GameMainPostBean f32592b;

        c(GameMainPostBean gameMainPostBean) {
            this.f32592b = gameMainPostBean;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IntentUtil.getInstance().goFormDetial(GameMainActivityv2.this.f32588z, this.f32592b.getId());
        }
    }

    private void j() {
        if (Build.VERSION.SDK_INT == 19) {
            ((FrameLayout.LayoutParams) ((Toolbar) findViewById(R.id.toolbar)).getLayoutParams()).topMargin = com.join.mgps.Util.c1.d(this);
        }
    }

    private void p() {
        ((AppBarLayout) findViewById(R.id.appBarLayout)).addOnOffsetChangedListener((AppBarLayout.OnOffsetChangedListener) new a());
    }

    private void q() {
        GameMainNetBattle net_battle;
        String fight_fun = this.A.getFight_fun();
        if (com.join.mgps.Util.g2.i(fight_fun)) {
            if (fight_fun.length() >= 1) {
                if ('1' == fight_fun.charAt(0)) {
                    this.f32578p.setVisibility(0);
                } else {
                    this.f32578p.setVisibility(8);
                }
            }
            if (fight_fun.length() >= 2) {
                if ('1' == fight_fun.charAt(1)) {
                    this.f32574l.setVisibility(0);
                    GameMainDataBean gameMainDataBean = this.B;
                    if (gameMainDataBean != null && (net_battle = gameMainDataBean.getNet_battle()) != null) {
                        TextView textView = this.f32582t;
                        textView.setText(Html.fromHtml("<font color = '#F47500'>" + net_battle.getNumber() + "个房间</font>正在对战,进入\"<font color = '#F47500'>约战</font>\",\"<font color = '#F47500'>大厅对战</font>\""), TextView.BufferType.SPANNABLE);
                    }
                    com.wufan.user.service.protobuf.n0 n0Var = this.f32586x;
                    if (n0Var != null && n0Var.n2() == 2) {
                        this.D = false;
                        this.f32566d.setImageResource(R.drawable.switch_close);
                        this.f32566d.setEnabled(false);
                        return;
                    }
                    GameMainDataBean gameMainDataBean2 = this.B;
                    if (gameMainDataBean2 != null && gameMainDataBean2.getNet_battle() != null && this.B.getNet_battle().getSilence_room_switch() == 0) {
                        this.D = false;
                        this.f32566d.setImageResource(R.drawable.switch_close);
                        return;
                    }
                    GameMainDataBean gameMainDataBean3 = this.B;
                    if (gameMainDataBean3 != null && gameMainDataBean3.getNet_battle() != null && this.B.getNet_battle().getSilence_room_switch() == 1) {
                        this.D = true;
                        this.f32566d.setImageResource(R.drawable.switch_open);
                        return;
                    } else if (fight_fun.length() >= 7) {
                        if ('1' == fight_fun.charAt(6)) {
                            this.D = true;
                            this.f32566d.setImageResource(R.drawable.switch_open);
                            return;
                        }
                        this.D = false;
                        this.f32566d.setImageResource(R.drawable.switch_close);
                        return;
                    } else {
                        this.f32577o.setVisibility(8);
                        return;
                    }
                }
                this.f32574l.setVisibility(8);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void b() {
        j();
        this.f32588z = this;
        CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) findViewById(R.id.collapsingToolbarLayout);
        collapsingToolbarLayout.setScrimVisibleHeightTrigger(this.f32588z.getResources().getDimensionPixelOffset(R.dimen.action_bar_height) + this.f32588z.getResources().getDimensionPixelSize(this.f32588z.getResources().getIdentifier("status_bar_height", "dimen", q.a.f73126a)) + 5);
        collapsingToolbarLayout.setScrimAnimationDuration(200L);
        p();
        this.f32585w = com.join.mgps.rpc.impl.d.P1();
        this.A = p1.f.K().F(this.f32583u);
        this.f32586x = AccountUtil_.getInstance_(this.f32588z).getAccountData();
        q();
        DownloadTask downloadTask = this.A;
        if (downloadTask != null) {
            MyImageLoader.d(this.f32571i, R.drawable.banner_normal_icon, downloadTask.getPortraitURL());
            this.f32569g.setText(this.A.getShowName());
            UtilsMy.I(this.A.getScore(), this.A.getDown_count(), this.A.getShowSize(), this.A.getSp_tag_info(), this.A.getTipBeans(), this.f32573k, this.f32588z);
            this.f32582t.setText(Html.fromHtml("进入\"<font color = '#F47500'>约战</font>\",\"<font color = '#F47500'>大厅对战</font>\""), TextView.BufferType.SPANNABLE);
        }
        f();
        e();
        if (WifiUtils.getInstance(getApplicationContext()).isWifiEnable()) {
            this.f32584v.isWifiConnectedBefore().g(Boolean.TRUE);
        } else {
            this.f32584v.isWifiConnectedBefore().g(Boolean.FALSE);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void c() {
        GameMainDataBean gameMainDataBean = this.B;
        if (gameMainDataBean != null) {
            GameMainNetBattle net_battle = gameMainDataBean.getNet_battle();
            int silence_room_switch = net_battle.getSilence_room_switch();
            if (silence_room_switch == 0) {
                UtilsMy.i(null, this.A, this.f32588z, 0);
                return;
            }
            String fight_fun = this.A.getFight_fun();
            boolean z4 = com.join.mgps.Util.g2.i(fight_fun) && fight_fun.length() >= 7 && '1' == fight_fun.charAt(6);
            int max_battle_count = this.B.getGame_info() != null ? this.B.getGame_info().getMax_battle_count() : 0;
            if (silence_room_switch == 1) {
                UtilsMy.k(this.A, this.f32588z, 1, net_battle.getIp(), net_battle.getPort(), this.C, max_battle_count);
                return;
            } else if (silence_room_switch == 2 && z4) {
                UtilsMy.k(this.A, this.f32588z, 1, net_battle.getIp(), net_battle.getPort(), this.C, max_battle_count);
                return;
            } else {
                UtilsMy.i(null, this.A, this.f32588z, 0);
                return;
            }
        }
        UtilsMy.i(null, this.A, this.f32588z, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void d() {
        IntentUtil.getInstance().goForumFid(this.f32588z, (int) this.A.getPlugin_area_val());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void e() {
        ResultMessageBean<List<GameMainDataBean>> messages;
        try {
            RequestBeanUtil requestBeanUtil = RequestBeanUtil.getInstance(this);
            String str = this.f32583u;
            com.wufan.user.service.protobuf.n0 n0Var = this.f32586x;
            ResultMainBean<List<GameMainDataBean>> a12 = this.f32585w.a1(requestBeanUtil.getGameMainData(str, n0Var != null ? n0Var.getUid() : 1));
            if (a12 == null || a12.getFlag() != 1 || (messages = a12.getMessages()) == null) {
                return;
            }
            List<GameMainDataBean> data = messages.getData();
            if (data.size() > 0) {
                GameMainDataBean gameMainDataBean = data.get(0);
                GameMainTable o4 = b2.u.n().o(this.f32583u);
                if (o4 != null) {
                    GameMainachieve achieve = gameMainDataBean.getAchieve();
                    GameMainDataBean gameMainDataBean2 = (GameMainDataBean) JsonMapper.getInstance().fromJson(o4.getGame_main_data(), GameMainDataBean.class);
                    if (gameMainDataBean2 != null) {
                        GameMainachieve achieve2 = gameMainDataBean2.getAchieve();
                        if (achieve != null && achieve2 != null) {
                            achieve.setLastShowVerTime(achieve2.getLastShowVerTime());
                        }
                    }
                    String json = JsonMapper.getInstance().toJson(gameMainDataBean);
                    o4.setGameid(this.f32583u);
                    o4.setGame_main_data(json);
                    b2.u.n().update(o4);
                } else {
                    GameMainTable gameMainTable = new GameMainTable();
                    String json2 = JsonMapper.getInstance().toJson(gameMainDataBean);
                    gameMainTable.setGameid(this.f32583u);
                    gameMainTable.setGame_main_data(json2);
                    b2.u.n().k(gameMainTable);
                }
                r(gameMainDataBean);
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void f() {
        GameMainTable o4 = b2.u.n().o(this.f32583u);
        if (o4 != null) {
            GameMainDataBean gameMainDataBean = (GameMainDataBean) JsonMapper.getInstance().fromJson(o4.getGame_main_data(), GameMainDataBean.class);
            if (gameMainDataBean != null) {
                r(gameMainDataBean);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void g() {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void h() {
        if (this.D) {
            this.D = false;
            this.f32566d.setImageResource(R.drawable.switch_close);
            if (this.B.getNet_battle() != null) {
                this.B.getNet_battle().setSilence_room_switch(0);
            } else {
                this.B.setNet_battle(new GameMainNetBattle());
                this.B.getNet_battle().setSilence_room_switch(0);
            }
            o(0);
            return;
        }
        this.D = true;
        this.f32566d.setImageResource(R.drawable.switch_open);
        if (this.B.getNet_battle() != null) {
            this.B.getNet_battle().setSilence_room_switch(1);
        } else {
            this.B.setNet_battle(new GameMainNetBattle());
            this.B.getNet_battle().setSilence_room_switch(1);
        }
        o(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void i() {
        new GameInfoBean().setGame_id(this.f32583u);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void k() {
        GameMainDataBean gameMainDataBean;
        GameMainachieve achieve;
        if (IntentUtil.getInstance().goLoginBattle(this) || (gameMainDataBean = this.B) == null || (achieve = gameMainDataBean.getAchieve()) == null) {
            return;
        }
        IntentUtil.getInstance().goShareWebActivity(this.f32588z, achieve.getUrl());
        achieve.setLastShowVerTime(achieve.getTime());
        GameMainTable o4 = b2.u.n().o(this.f32583u);
        String json = JsonMapper.getInstance().toJson(this.B);
        o4.setGameid(this.f32583u);
        o4.setGame_main_data(json);
        b2.u.n().update(o4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void l() {
        GameMainDataBean gameMainDataBean = this.B;
        if (gameMainDataBean != null) {
            gameMainDataBean.getGame_info();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void m() {
        IntentUtil.getInstance().goGameDetialActivity(this.f32588z, this.A.getCrc_link_type_val(), this.A.getGame_info_tpl_type(), this.A.getSp_tpl_two_position(), this.A.get_from_type());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void n() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void o(int i4) {
        try {
            ResultMainBean<List<ResultValbean>> u4 = this.f32585w.u(RequestBeanUtil.getInstance(this.f32588z).getSilenceSwitch(this.f32583u, this.f32586x.getUid(), i4));
            com.join.mgps.Util.v0.d("ssss", u4.getCode() + "");
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        if (Build.VERSION.SDK_INT == 19) {
            getWindow().addFlags(256);
            getWindow().addFlags(512);
        }
        super.onCreate(bundle);
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        com.wufan.user.service.protobuf.n0 accountData = AccountUtil_.getInstance_(this).getAccountData();
        this.f32586x = accountData;
        if (accountData.n2() == 2) {
            this.f32566d.setImageResource(R.drawable.switch_close);
            this.f32566d.setEnabled(false);
            return;
        }
        this.f32566d.setEnabled(true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void r(GameMainDataBean gameMainDataBean) {
        this.B = gameMainDataBean;
        GameMaingameinfo game_info = gameMainDataBean.getGame_info();
        if (game_info != null) {
            MyImageLoader.d(this.f32568f, R.drawable.banner_normal_icon, game_info.getGame_surface_head_image());
            this.f32569g.setText(this.A.getShowName());
            UtilsMy.I(game_info.getScore(), game_info.getDown_count(), this.A.getShowSize(), this.A.getSp_tag_info(), this.A.getTipBeans(), this.f32573k, this.f32588z);
        }
        GameMainachieve achieve = gameMainDataBean.getAchieve();
        if (achieve != null && (achieve.getLastShowVerTime() == 0 || achieve.getLastShowVerTime() != achieve.getTime())) {
            MyImageLoader.h(this.f32572j, achieve.getPic_addr());
        }
        q();
        List<BannerBean> local_battle = gameMainDataBean.getLocal_battle();
        if (local_battle != null && local_battle.size() > 0) {
            this.f32575m.setVisibility(0);
            this.f32579q.setAll(this.f32588z, local_battle, 11, 32, 4000, 0);
        } else {
            this.f32575m.setVisibility(8);
        }
        List<BannerBean> ad_position = gameMainDataBean.getAd_position();
        if (ad_position != null && ad_position.size() > 0) {
            this.f32581s.removeAllViews();
            this.f32581s.setInAnimation(AnimationUtils.loadAnimation(this.f32588z, R.anim.slide_in_topline));
            this.f32581s.setOutAnimation(AnimationUtils.loadAnimation(this.f32588z, R.anim.slide_out_topline));
            this.f32581s.setFlipInterval(5000);
            for (BannerBean bannerBean : ad_position) {
                View inflate = LayoutInflater.from(this.f32588z).inflate(R.layout.gamemain_fliper_item, (ViewGroup) null);
                MyImageLoader.d((SimpleDraweeView) inflate.findViewById(R.id.icon), R.drawable.main_normal_icon, bannerBean.getPic_remote());
                ((TextView) inflate.findViewById(R.id.fliperText)).setText(bannerBean.getTitle());
                ((LinearLayout) inflate.findViewById(R.id.fliperItem)).setOnClickListener(new b(bannerBean));
                this.f32581s.addView(inflate);
            }
            this.f32581s.startFlipping();
            this.f32581s.setVisibility(0);
        } else {
            this.f32581s.setVisibility(8);
        }
        List<GameMainPostBean> post_id = gameMainDataBean.getPost_id();
        if (post_id == null || post_id.size() <= 0) {
            return;
        }
        for (GameMainPostBean gameMainPostBean : post_id) {
            View inflate2 = LayoutInflater.from(this.f32588z).inflate(R.layout.game_main_forunpost_item, (ViewGroup) null);
            ((TextView) inflate2.findViewById(R.id.tv_discuss_first)).setText(gameMainPostBean.getTitle());
            ((LinearLayout) inflate2.findViewById(R.id.ll_discuss_first)).setOnClickListener(new c(gameMainPostBean));
            this.f32580r.addView(inflate2);
        }
    }
}
