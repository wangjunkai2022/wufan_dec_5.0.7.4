package com.join.mgps.activity;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.BaseAppCompatActivity;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.facebook.drawee.view.SimpleDraweeView;
import com.flyco.tablayout.SlidingTabLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.join.android.app.common.utils.JsonMapper;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.component.video.StandardVideoView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.activity.EndGameReportActivity_;
import com.join.mgps.adapter.FragmentPagerAdapter;
import com.join.mgps.dialog.m0;
import com.join.mgps.dto.EndGameBean;
import com.join.mgps.dto.EndGameDetailBean;
import com.join.mgps.dto.GameMainV4DataBean;
import com.join.mgps.dto.RequestEndGameDetailArgs;
import com.join.mgps.dto.RequestEndGameListArgs;
import com.join.mgps.dto.RequestModel;
import com.join.mgps.dto.ResponseModel;
import com.join.mgps.dto.ShareBean;
import com.join.mgps.fragment.EndGameDetailRankingFragment;
import com.join.mgps.fragment.EndGameDetailRankingFragment_;
import com.join.mgps.pref.PrefDef_;
import com.papa.sim.statistic.Data;
import com.papa.sim.statistic.Event;
import com.papa.sim.statistic.Ext;
import com.uc.crashsdk.export.LogType;
import java.text.DecimalFormat;
import java.util.ArrayList;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.Extra;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
import org.androidannotations.annotations.sharedpreferences.Pref;
@EActivity(R.layout.activity_end_game_detail)
/* loaded from: classes4.dex */
public class EndGameDetailActivity extends BaseAppCompatActivity {
    @Extra
    String A;
    @Extra
    String B;
    @Extra
    String C;
    @Extra
    boolean D;
    @Pref
    PrefDef_ E;
    private com.join.mgps.rpc.k F;
    private EndGameDetailBean H;
    private com.join.mgps.dialog.m0 I;
    private boolean J;
    @ViewById

    /* renamed from: b  reason: collision with root package name */
    AppBarLayout f30134b;
    @ViewById

    /* renamed from: c  reason: collision with root package name */
    CollapsingToolbarLayout f30135c;
    @ViewById

    /* renamed from: d  reason: collision with root package name */
    View f30136d;
    @ViewById

    /* renamed from: e  reason: collision with root package name */
    SimpleDraweeView f30137e;
    @ViewById

    /* renamed from: f  reason: collision with root package name */
    StandardVideoView f30138f;
    @ViewById

    /* renamed from: g  reason: collision with root package name */
    TextView f30139g;
    @ViewById

    /* renamed from: h  reason: collision with root package name */
    TextView f30140h;
    @ViewById

    /* renamed from: i  reason: collision with root package name */
    SimpleDraweeView f30141i;
    @ViewById

    /* renamed from: j  reason: collision with root package name */
    TextView f30142j;
    @ViewById

    /* renamed from: k  reason: collision with root package name */
    TextView f30143k;
    @ViewById

    /* renamed from: l  reason: collision with root package name */
    TextView f30144l;
    @ViewById

    /* renamed from: m  reason: collision with root package name */
    SlidingTabLayout f30145m;
    @ViewById

    /* renamed from: n  reason: collision with root package name */
    ViewPager f30146n;
    @ViewById

    /* renamed from: o  reason: collision with root package name */
    LinearLayout f30147o;
    @ViewById

    /* renamed from: p  reason: collision with root package name */
    TextView f30148p;
    @ViewById

    /* renamed from: q  reason: collision with root package name */
    ImageView f30149q;
    @ViewById

    /* renamed from: r  reason: collision with root package name */
    ImageView f30150r;
    @ViewById

    /* renamed from: s  reason: collision with root package name */
    TextView f30151s;
    @ViewById

    /* renamed from: t  reason: collision with root package name */
    LinearLayout f30152t;
    @ViewById

    /* renamed from: u  reason: collision with root package name */
    ConstraintLayout f30153u;
    @ViewById

    /* renamed from: v  reason: collision with root package name */
    LinearLayout f30154v;
    @ViewById

    /* renamed from: w  reason: collision with root package name */
    LinearLayout f30155w;
    @ViewById

    /* renamed from: x  reason: collision with root package name */
    CoordinatorLayout f30156x;
    @ViewById

    /* renamed from: y  reason: collision with root package name */
    ImageView f30157y;
    @ViewById

    /* renamed from: z  reason: collision with root package name */
    SimpleDraweeView f30158z;
    String G = "EndGameDetailActivity";
    private boolean K = false;
    private boolean L = true;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a implements ViewPager.OnPageChangeListener {
        a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i4) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i4, float f5, int i5) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i4) {
            EndGameDetailActivity.this.r0(i4);
        }
    }

    /* loaded from: classes4.dex */
    class b implements s2.e {
        b() {
        }

        @Override // s2.e
        public void a(Bitmap bitmap) {
            com.join.android.app.component.video.h.e(bitmap);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class c implements m0.a {
        c() {
        }

        @Override // com.join.mgps.dialog.m0.a
        public void report() {
            ((EndGameReportActivity_.h) EndGameReportActivity_.q0(EndGameDetailActivity.this).a(EndGameDetailActivity.this.B).flags(805306368)).start();
        }
    }

    private int getStatusBarHeight(Context context) {
        int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", q.a.f73126a);
        if (identifier > 0) {
            return context.getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    private String k0(int i4) {
        float f5 = i4 / 1000.0f;
        if (f5 < 60.0f) {
            return new DecimalFormat("0.00").format(f5) + "秒";
        }
        int i5 = (int) f5;
        return (i5 / 60) + "分" + (i5 % 60) + "秒";
    }

    private void l0() {
        final int dimension = (int) (getResources().getDimension(R.dimen.wdp342) - getStatusBarHeight(this));
        this.f30134b.addOnOffsetChangedListener(new AppBarLayout.OnOffsetChangedListener() { // from class: com.join.mgps.activity.k
            @Override // com.google.android.material.appbar.AppBarLayout.OnOffsetChangedListener, com.google.android.material.appbar.AppBarLayout.BaseOnOffsetChangedListener
            public final void onOffsetChanged(AppBarLayout appBarLayout, int i4) {
                EndGameDetailActivity.this.q0(dimension, appBarLayout, i4);
            }
        });
    }

    private void m0(EndGameBean endGameBean) {
        try {
            if (this.f30138f != null) {
                if (!com.join.mgps.Util.g2.i(endGameBean.getVideo()) && !com.join.mgps.Util.g2.i(endGameBean.getCover())) {
                    this.f30136d.setVisibility(0);
                    this.f30137e.setVisibility(8);
                    this.f30138f.setVisibility(8);
                }
                String video = endGameBean.getVideo();
                if (com.join.mgps.Util.g2.i(video)) {
                    this.f30138f.setMuteWhenPlay(false);
                    this.f30138f.setCover(endGameBean.getCover());
                    this.f30138f.setPlayTag(this.G);
                    this.f30138f.setShowCoverWhenPause(false);
                    if (this.D) {
                        com.join.android.app.component.video.i.c(this.f30138f, video, false, "");
                        com.join.android.app.component.video.i.a(this.f30138f);
                        this.f30138f.setSurfaceToPlay();
                    } else {
                        this.f30138f.setUp(video, StandardVideoView.D, endGameBean.getTitle(), endGameBean.getCover());
                        if (this.f30138f.d()) {
                            this.f30138f.startPlayLogic();
                        }
                    }
                }
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    private void n0(EndGameDetailBean endGameDetailBean) {
        String[] strArr = {"排行榜"};
        ArrayList arrayList = new ArrayList();
        EndGameDetailRankingFragment_.o0().b(endGameDetailBean).build();
        arrayList.add(new FragmentPagerAdapter.a(strArr[0], EndGameDetailRankingFragment_.o0().b(endGameDetailBean).build()));
        this.f30146n.setAdapter(new FragmentPagerAdapter(getSupportFragmentManager(), arrayList));
        this.f30145m.setViewPager(this.f30146n, strArr);
        this.f30146n.addOnPageChangeListener(new a());
        r0(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void q0(int i4, AppBarLayout appBarLayout, int i5) {
        StringBuilder sb = new StringBuilder();
        sb.append("initAppbarListener: ");
        sb.append(i5);
        sb.append("   ");
        sb.append(i4);
        int i6 = i4 + i5;
        if (i6 < 0 && !this.K) {
            this.f30152t.setBackgroundResource(R.color.white);
            this.f30149q.setImageResource(R.drawable.arrow_right_black);
            this.f30150r.setImageResource(R.drawable.ic_dd);
            this.f30151s.setVisibility(0);
            s0(true);
            StandardVideoView standardVideoView = this.f30138f;
            if (standardVideoView != null && standardVideoView.getCurrentState() == 2) {
                this.f30138f.onVideoPause();
            }
            this.K = true;
        } else if (i6 <= 0 || !this.K) {
        } else {
            this.f30152t.setBackgroundResource(R.color.transparent);
            this.f30149q.setImageResource(R.drawable.ic_arrow_right_white);
            this.f30150r.setImageResource(R.drawable.ic_introduction_report_white_v);
            this.f30151s.setVisibility(4);
            s0(false);
            StandardVideoView standardVideoView2 = this.f30138f;
            if (standardVideoView2 != null && standardVideoView2.getCurrentState() == 5) {
                this.f30138f.onVideoResume(false);
            }
            this.K = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r0(int i4) {
        int tabCount = this.f30145m.getTabCount();
        int i5 = 0;
        while (i5 < tabCount) {
            this.f30145m.j(i5).setTypeface(null, i5 == i4 ? 1 : 0);
            i5++;
        }
    }

    private void s0(boolean z4) {
        StringBuilder sb = new StringBuilder();
        sb.append("setStatusBarLight: ");
        sb.append(z4);
        View decorView = getWindow().getDecorView();
        if (decorView != null) {
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(z4 ? systemUiVisibility | 8192 : systemUiVisibility & (-8193));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterviews() {
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 21) {
            Window window = getWindow();
            window.clearFlags(TTAdConstant.KEY_CLICK_AREA);
            window.getDecorView().setSystemUiVisibility(LogType.UNEXP_ANR);
            window.addFlags(Integer.MIN_VALUE);
            window.setStatusBarColor(0);
        } else if (i4 >= 19) {
            getWindow().addFlags(TTAdConstant.KEY_CLICK_AREA);
        }
        if (i4 >= 21) {
            this.f30152t.setPadding(0, getStatusBarHeight(this), 0, 0);
        }
        this.F = com.join.mgps.rpc.impl.i.D0();
        if (com.join.mgps.Util.g2.h(this.E.endGameConfig().d())) {
            getEndGameConfig();
        }
        showLoding();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void getData(boolean z4) {
        if (com.join.android.app.common.utils.j.j(this)) {
            RequestEndGameDetailArgs requestEndGameDetailArgs = new RequestEndGameDetailArgs();
            requestEndGameDetailArgs.setGameId(this.A);
            requestEndGameDetailArgs.setEndgameId(this.B);
            requestEndGameDetailArgs.setUid(AccountUtil_.getInstance_(this).getUid());
            RequestModel requestModel = new RequestModel();
            requestModel.setArgs(requestEndGameDetailArgs);
            requestModel.setDefault(this);
            ResponseModel<EndGameDetailBean> R = this.F.R(requestModel.makeSign());
            if (R != null && R.getCode() == 200) {
                u0(R.getData(), z4);
                return;
            } else {
                showLodingFailed();
                return;
            }
        }
        showLodingFailed();
        showTost(getResources().getString(R.string.net_connect_failed));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void getEndGameConfig() {
        if (com.join.android.app.common.utils.j.j(this)) {
            RequestEndGameListArgs requestEndGameListArgs = new RequestEndGameListArgs();
            requestEndGameListArgs.setUid(AccountUtil_.getInstance_(this).getUid());
            RequestModel requestModel = new RequestModel();
            requestModel.setArgs(requestEndGameListArgs);
            requestModel.setDefault(this);
            ResponseModel<GameMainV4DataBean.EndGameConfigBean> x4 = com.join.mgps.rpc.impl.i.D0().x(requestModel.makeSign());
            if (x4 == null || x4.getCode() != 200 || x4.getData() == null) {
                return;
            }
            this.E.endGameConfig().g(JsonMapper.toJsonString(x4.getData()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void h0() {
        if (AccountUtil_.getInstance_(this).isTourist()) {
            IntentUtil.getInstance().goLogin(this);
            return;
        }
        EndGameDetailBean endGameDetailBean = this.H;
        if (endGameDetailBean == null || endGameDetailBean.getEndgameInfo() == null) {
            return;
        }
        EndGameLaunchActivity_.G0(this).b(this.A).a(this.H.getEndgameInfo()).start();
        try {
            Ext ext = new Ext();
            ext.setPosition("2");
            ext.setEndId(this.H.getEndgameInfo().getEndgameId());
            Data data = new Data();
            data.setGameId(Long.parseLong(this.A));
            com.papa.sim.statistic.p.l(this).i0(Event.gameStartVS, ext, data);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void i0() {
        GameMainV4DataBean.EndGameConfigBean endGameConfigBean;
        EndGameDetailBean endGameDetailBean;
        String d5 = new PrefDef_(this).endGameConfig().d();
        if (!com.join.mgps.Util.g2.i(d5) || (endGameConfigBean = (GameMainV4DataBean.EndGameConfigBean) JsonMapper.getInstance().fromJson(d5, GameMainV4DataBean.EndGameConfigBean.class)) == null || !endGameConfigBean.isEndgame_asset_switch() || (endGameDetailBean = this.H) == null || endGameDetailBean.getEndgameInfo() == null || !TextUtils.equals(this.H.getEndgameInfo().getPublisher(), AccountUtil_.getInstance_(this).getUid())) {
            return;
        }
        IntentUtil.getInstance().goShareWebActivity(this, this.H.getEndgameInfo().getAssetUrl());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void j0() {
        EndGameDetailBean endGameDetailBean = this.H;
        if (endGameDetailBean == null || endGameDetailBean.getEndgameInfo() == null || TextUtils.isEmpty(this.H.getShareUrl())) {
            return;
        }
        ShareBean shareBean = new ShareBean();
        String shareUrl = this.H.getShareUrl();
        shareBean.setqZoneShareUrl(shareUrl);
        shareBean.setQqUrl(shareUrl);
        shareBean.setWechatFriendUrl(shareUrl);
        shareBean.setWechatShareUrl(shareUrl);
        shareBean.setWeiboShareUrl(shareUrl);
        shareBean.setImageUrl(this.H.getEndgameInfo().getGameIcon());
        shareBean.setTitle(this.H.getEndgameInfo().getGameName());
        shareBean.setText("残局挑战");
        shareBean.setFrom(7);
        shareBean.setGameId(this.H.getEndgameInfo().getGameId());
        com.join.mgps.Util.s.r(this, shareBean);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void o0() {
        finish();
    }

    @Override // com.BaseAppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (com.join.android.app.component.video.a.c0(this, this.G)) {
            return;
        }
        this.f30138f.taskShotPic(new b());
        if (this.f30138f.getTimeHas() < 2000) {
            this.f30138f.onAutoCompletion();
        }
        com.join.android.app.component.video.h.f(this.f30138f);
        this.f30138f.getGSYVideoManager().A(this.f30138f);
        this.J = true;
        super.onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (this.D) {
            return;
        }
        StandardVideoView standardVideoView = this.f30138f;
        if (standardVideoView != null) {
            standardVideoView.release();
        }
        com.join.android.app.component.video.a.n0(this.G);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        StandardVideoView standardVideoView;
        StandardVideoView standardVideoView2;
        super.onPause();
        boolean z4 = this.D;
        if (!z4 && (standardVideoView2 = this.f30138f) != null) {
            standardVideoView2.onVideoPause();
        } else if (!z4 || (standardVideoView = this.f30138f) == null || this.J) {
        } else {
            standardVideoView.onVideoPause();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        getData(this.L);
        this.L = false;
        StandardVideoView standardVideoView = this.f30138f;
        if (standardVideoView != null) {
            standardVideoView.onVideoResume();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void p0() {
        if (this.I == null) {
            com.join.mgps.dialog.m0 m0Var = new com.join.mgps.dialog.m0(this);
            this.I = m0Var;
            m0Var.c(new c());
        }
        this.I.setFocusable(true);
        com.join.mgps.dialog.m0 m0Var2 = this.I;
        ImageView imageView = this.f30150r;
        double measuredWidth = imageView.getMeasuredWidth();
        Double.isNaN(measuredWidth);
        double dimension = getResources().getDimension(R.dimen.wdp136);
        Double.isNaN(dimension);
        m0Var2.showAsDropDown(imageView, (int) ((measuredWidth * 0.5d) - dimension), (int) (-getResources().getDimension(R.dimen.wdp10)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void relodingimag() {
        showLoding();
        getData(true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void setNetwork() {
        UtilsMy.w3(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showLoding() {
        com.join.mgps.Util.v0.c("显示加载中");
        LinearLayout linearLayout = this.f30154v;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
        }
        LinearLayout linearLayout2 = this.f30155w;
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(8);
        }
        CoordinatorLayout coordinatorLayout = this.f30156x;
        if (coordinatorLayout != null) {
            coordinatorLayout.setVisibility(8);
        }
        ConstraintLayout constraintLayout = this.f30153u;
        if (constraintLayout != null) {
            constraintLayout.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showLodingFailed() {
        LinearLayout linearLayout = this.f30155w;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
        }
        LinearLayout linearLayout2 = this.f30154v;
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(8);
        }
        CoordinatorLayout coordinatorLayout = this.f30156x;
        if (coordinatorLayout != null) {
            coordinatorLayout.setVisibility(8);
        }
        ConstraintLayout constraintLayout = this.f30153u;
        if (constraintLayout != null) {
            constraintLayout.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showTost(String str) {
        com.join.mgps.Util.l2.a(this).b(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void t0() {
        com.join.mgps.Util.v0.c("显示主界面main");
        LinearLayout linearLayout = this.f30155w;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        LinearLayout linearLayout2 = this.f30154v;
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(8);
        }
        CoordinatorLayout coordinatorLayout = this.f30156x;
        if (coordinatorLayout != null) {
            coordinatorLayout.setVisibility(0);
        }
        ConstraintLayout constraintLayout = this.f30153u;
        if (constraintLayout != null) {
            constraintLayout.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void u0(EndGameDetailBean endGameDetailBean, boolean z4) {
        t0();
        if (endGameDetailBean == null) {
            return;
        }
        this.H = endGameDetailBean;
        if (endGameDetailBean.getEndgameInfo() != null) {
            EndGameBean endgameInfo = endGameDetailBean.getEndgameInfo();
            this.f30151s.setText(endgameInfo.getTitle());
            this.f30139g.setText(endgameInfo.getTitle());
            this.f30140h.setText(endgameInfo.getSubTitle());
            MyImageLoader.h(this.f30141i, endgameInfo.getAvatar());
            MyImageLoader.h(this.f30158z, endgameInfo.getGameIcon());
            this.f30142j.setText(endgameInfo.getNickname());
            this.f30143k.setText(endgameInfo.getChallengeSucRate());
            this.f30157y.setVisibility(endgameInfo.getWin() == 1 ? 0 : 8);
            this.f30144l.setText(endgameInfo.getBestTimes() <= 0 ? "暂无成绩" : k0(endgameInfo.getBestTimes()));
            if (z4) {
                m0(endgameInfo);
                n0(endGameDetailBean);
                return;
            }
            ViewPager viewPager = this.f30146n;
            if (viewPager == null || viewPager.getAdapter() == null) {
                return;
            }
            PagerAdapter adapter = this.f30146n.getAdapter();
            ViewPager viewPager2 = this.f30146n;
            Object instantiateItem = adapter.instantiateItem((ViewGroup) viewPager2, viewPager2.getCurrentItem());
            if (instantiateItem == null || !(instantiateItem instanceof EndGameDetailRankingFragment)) {
                return;
            }
            ((EndGameDetailRankingFragment) instantiateItem).h0(endGameDetailBean);
        }
    }
}
