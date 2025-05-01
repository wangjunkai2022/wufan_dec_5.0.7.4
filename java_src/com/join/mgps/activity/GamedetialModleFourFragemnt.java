package com.join.mgps.activity;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.MApplication;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.facebook.drawee.view.SimpleDraweeView;
import com.flyco.tablayout.SlidingTabLayout;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.join.android.app.common.utils.APKUtils;
import com.join.android.app.common.utils.JsonMapper;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.component.video.StandardVideoView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.Util.RequestBeanUtil;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.Util.m1;
import com.join.mgps.activity.gamedetail.BaseGameDetailFragment;
import com.join.mgps.activity.gamedetail.GamedetailVideoMainActivity;
import com.join.mgps.activity.gamedetail.GamedetailVideoMainActivity_;
import com.join.mgps.activity.login.LoginSplashActivity_;
import com.join.mgps.activity.screenshot.ScreenshotTrueListAcvity_;
import com.join.mgps.adapter.FragmentPagerAdapter;
import com.join.mgps.adapter.FullScreenActivity;
import com.join.mgps.adapter.FullScreenActivity_;
import com.join.mgps.customview.CustomerDownloadView;
import com.join.mgps.customview.DownloadProgressBar;
import com.join.mgps.customview.MStarBar;
import com.join.mgps.customview.MViewpagerV4;
import com.join.mgps.customview.SlidingTabLayoutGameDetailImage;
import com.join.mgps.customview.XListView2;
import com.join.mgps.dto.CommentAlllistIntentData;
import com.join.mgps.dto.CommonRequestBean;
import com.join.mgps.dto.DetialShowImageBean;
import com.join.mgps.dto.ExtBean;
import com.join.mgps.dto.GameFromBooleanBean;
import com.join.mgps.dto.GameFromPopoWinBean;
import com.join.mgps.dto.GameScore;
import com.join.mgps.dto.GamedetialModleFourBean;
import com.join.mgps.dto.RequestGameIdArgs;
import com.join.mgps.dto.RequestModel;
import com.join.mgps.dto.RequestdetialFolowAndBeSpeak;
import com.join.mgps.dto.ResponseModel;
import com.join.mgps.dto.ResultMainBean;
import com.join.mgps.dto.ShareBean;
import com.join.mgps.dto.TipBean;
import com.join.mgps.enums.ConstantIntEnum;
import com.join.mgps.enums.Dtype;
import com.join.mgps.fragment.CommentAllListFragment;
import com.join.mgps.fragment.GameFormFragment;
import com.join.mgps.ptr.PtrClassicFrameLayout;
import com.papa.sim.statistic.Where;
import com.psk.eventmodule.Event;
import com.psk.eventmodule.StatFactory;
import com.umeng.analytics.MobclickAgent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.Receiver;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.springframework.util.LinkedMultiValueMap;
@EFragment(R.layout.gamedetial_modle_four_fragment)
/* loaded from: classes.dex */
public class GamedetialModleFourFragemnt extends BaseGameDetailFragment {

    /* renamed from: t2  reason: collision with root package name */
    static String f33194t2 = "0";

    /* renamed from: u2  reason: collision with root package name */
    static String f33195u2 = "";
    static boolean v2 = false;

    /* renamed from: w2  reason: collision with root package name */
    private static final String f33196w2 = "view";
    @ViewById
    LinearLayout A;
    LinearLayout A1;
    @ViewById
    ImageView B;
    LinearLayout B1;
    @ViewById
    ImageView C;
    LinearLayout C1;
    @ViewById(R.id.title_normal_download_cdv)
    CustomerDownloadView D;
    EditText D1;
    @ViewById
    ImageView E;
    TextView E1;
    @ViewById
    TextView F;
    TextView F1;
    @ViewById
    TextView G;
    LinearLayout G1;
    @ViewById
    Toolbar H;
    public XListView2 H1;
    @ViewById
    View I;
    u I1;
    @ViewById
    View J;
    com.join.mgps.rpc.b J1;
    @ViewById
    View K;
    com.join.mgps.rpc.b K1;
    @ViewById
    View L;
    GameFromPopoWinBean L1;
    @ViewById
    View M;
    PtrClassicFrameLayout M1;
    @ViewById
    LinearLayout N;
    @ViewById
    LinearLayout O;
    @ViewById
    View P;
    @ViewById
    View Q;
    com.join.mgps.rpc.e R;
    GamedetailVideoMainActivity S;
    public SimpleDraweeView S1;
    private com.join.android.app.common.manager.b T;
    public TextView T1;
    String U;
    public TextView U1;
    String V;
    public TextView V1;
    public TextView W1;
    public MStarBar X1;
    boolean Y;
    public LinearLayout Y1;
    private int Z;
    public LinearLayout Z1;

    /* renamed from: a2  reason: collision with root package name */
    public SimpleDraweeView f33197a2;

    /* renamed from: b2  reason: collision with root package name */
    public TextView f33199b2;

    /* renamed from: c  reason: collision with root package name */
    String f33200c;

    /* renamed from: c2  reason: collision with root package name */
    private LinearLayout f33201c2;

    /* renamed from: d  reason: collision with root package name */
    ExtBean f33202d;

    /* renamed from: d2  reason: collision with root package name */
    private TextView f33203d2;

    /* renamed from: e  reason: collision with root package name */
    boolean f33204e;

    /* renamed from: e2  reason: collision with root package name */
    private DownloadTask f33205e2;
    @ViewById

    /* renamed from: f  reason: collision with root package name */
    RelativeLayout f33206f;
    @ViewById

    /* renamed from: f2  reason: collision with root package name */
    TextView f33207f2;
    @ViewById

    /* renamed from: g  reason: collision with root package name */
    View f33208g;
    @ViewById

    /* renamed from: g2  reason: collision with root package name */
    ImageView f33209g2;
    @ViewById

    /* renamed from: h  reason: collision with root package name */
    StandardVideoView f33210h;
    @ViewById

    /* renamed from: h2  reason: collision with root package name */
    ImageView f33211h2;
    @ViewById

    /* renamed from: i  reason: collision with root package name */
    SimpleDraweeView f33212i;
    @ViewById

    /* renamed from: i2  reason: collision with root package name */
    ImageView f33213i2;
    @ViewById

    /* renamed from: j  reason: collision with root package name */
    SlidingTabLayout f33214j;
    @ViewById

    /* renamed from: j2  reason: collision with root package name */
    ImageView f33215j2;
    @ViewById

    /* renamed from: k  reason: collision with root package name */
    ViewPager f33216k;

    /* renamed from: k2  reason: collision with root package name */
    private Animation f33217k2;
    @ViewById

    /* renamed from: l  reason: collision with root package name */
    SlidingTabLayoutGameDetailImage f33218l;

    /* renamed from: l2  reason: collision with root package name */
    private int f33219l2;
    @ViewById

    /* renamed from: m  reason: collision with root package name */
    View f33220m;

    /* renamed from: m2  reason: collision with root package name */
    private int f33221m2;
    @ViewById

    /* renamed from: n  reason: collision with root package name */
    ViewPager f33222n;

    /* renamed from: n2  reason: collision with root package name */
    com.wufan.user.service.protobuf.n0 f33223n2;
    @ViewById

    /* renamed from: o  reason: collision with root package name */
    View f33224o;
    @ViewById

    /* renamed from: p  reason: collision with root package name */
    AppBarLayout f33226p;

    /* renamed from: p0  reason: collision with root package name */
    private GamedetialModleFourBean f33227p0;

    /* renamed from: p1  reason: collision with root package name */
    private GamedetialModleFourBean f33228p1;
    @ViewById

    /* renamed from: q  reason: collision with root package name */
    CollapsingToolbarLayout f33230q;
    @ViewById

    /* renamed from: r  reason: collision with root package name */
    RelativeLayout f33232r;
    @ViewById

    /* renamed from: s  reason: collision with root package name */
    RelativeLayout f33234s;
    @ViewById

    /* renamed from: t  reason: collision with root package name */
    RelativeLayout f33236t;
    @ViewById

    /* renamed from: u  reason: collision with root package name */
    TextView f33237u;
    @ViewById

    /* renamed from: v  reason: collision with root package name */
    RelativeLayout f33238v;

    /* renamed from: v1  reason: collision with root package name */
    PopupWindow f33239v1;
    @ViewById

    /* renamed from: w  reason: collision with root package name */
    RelativeLayout f33240w;
    @ViewById

    /* renamed from: x  reason: collision with root package name */
    ImageView f33241x;
    @ViewById

    /* renamed from: y  reason: collision with root package name */
    TextView f33242y;
    @ViewById

    /* renamed from: z  reason: collision with root package name */
    ProgressBar f33243z;

    /* renamed from: b  reason: collision with root package name */
    private String f33198b = "GamedetialModleFourFragemnt";
    int W = 0;
    String X = "";
    int N1 = 1;
    List<GameFromPopoWinBean.DataBean> O1 = new ArrayList();
    boolean P1 = true;
    int Q1 = 0;
    boolean R1 = false;

    /* renamed from: o2  reason: collision with root package name */
    Map<String, DownloadTask> f33225o2 = new HashMap();

    /* renamed from: p2  reason: collision with root package name */
    Map<String, DownloadTask> f33229p2 = new HashMap();

    /* renamed from: q2  reason: collision with root package name */
    boolean f33231q2 = false;

    /* renamed from: r2  reason: collision with root package name */
    private List<View> f33233r2 = new ArrayList();

    /* renamed from: s2  reason: collision with root package name */
    r f33235s2 = new r();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GamedetialModleFourFragemnt.this.D0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            PaPaBannerListActivity_.k0(GamedetialModleFourFragemnt.this.S).e(1).a(true).c(GamedetialModleFourFragemnt.this.f33227p0.getGame_company_id()).d(GamedetialModleFourFragemnt.this.f33227p0.getCompany_name()).start();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GamedetialModleFourFragemnt.this.D0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class d implements View.OnClickListener {
        d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IntentUtil.getInstance().goShareWebActivity(GamedetialModleFourFragemnt.this.S, GamedetialModleFourFragemnt.this.f33228p1.getActivity_entry().getUrl() + GamedetialModleFourFragemnt.this.f33228p1.getCrc_sign_id());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class e implements Animation.AnimationListener {
        e() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class f implements m1.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f33249a;

        f(boolean z4) {
            this.f33249a = z4;
        }

        @Override // com.join.mgps.Util.m1.b
        public void a(m1.c cVar) {
            if (cVar.a() == 1) {
                GamedetialModleFourFragemnt.this.S.clickBack();
                com.join.mgps.Util.m1 c5 = com.join.mgps.Util.m1.c();
                GamedetialModleFourFragemnt gamedetialModleFourFragemnt = GamedetialModleFourFragemnt.this;
                c5.e(gamedetialModleFourFragemnt.S, gamedetialModleFourFragemnt.f33202d.getFrom_id(), cVar.b());
                com.join.mgps.Util.l2.a(GamedetialModleFourFragemnt.this.S).b("授权成功");
            } else if (this.f33249a) {
                GamedetialModleFourFragemnt.this.P0(false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class g implements w1.c {
        g() {
        }

        @Override // w1.c
        public void onClickCancle() {
        }

        @Override // w1.c
        public void onClickOk() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class h implements ViewPager.OnPageChangeListener {
        h() {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i4) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i4, float f5, int i5) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i4) {
            if (GamedetialModleFourFragemnt.this.s0() && i4 == 0) {
                GamedetialModleFourFragemnt gamedetialModleFourFragemnt = GamedetialModleFourFragemnt.this;
                gamedetialModleFourFragemnt.S.autoPlayVideo(gamedetialModleFourFragemnt.f33210h);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class i implements AppBarLayout.OnOffsetChangedListener {
        i() {
        }

        @Override // com.google.android.material.appbar.AppBarLayout.OnOffsetChangedListener, com.google.android.material.appbar.AppBarLayout.BaseOnOffsetChangedListener
        public void onOffsetChanged(AppBarLayout appBarLayout, int i4) {
            View view;
            try {
                appBarLayout.getHeight();
                GamedetialModleFourFragemnt.this.H.getHeight();
                int unused = GamedetialModleFourFragemnt.this.Z;
                if (Math.abs(i4) < GamedetialModleFourFragemnt.this.getResources().getDimensionPixelOffset(R.dimen.wdp300) && ((view = GamedetialModleFourFragemnt.this.f33208g) == null || view.getVisibility() != 0)) {
                    GamedetialModleFourFragemnt.this.f33234s.setVisibility(0);
                    GamedetialModleFourFragemnt.this.f33236t.setVisibility(0);
                    GamedetialModleFourFragemnt.this.f33232r.setVisibility(8);
                    GamedetialModleFourFragemnt.this.H.getBackground().setAlpha(0);
                    if (GamedetialModleFourFragemnt.this.T != null) {
                        GamedetialModleFourFragemnt.this.T.n(R.color.black_alpha);
                    }
                    GamedetialModleFourFragemnt gamedetialModleFourFragemnt = GamedetialModleFourFragemnt.this;
                    StandardVideoView standardVideoView = gamedetialModleFourFragemnt.f33210h;
                    if (standardVideoView != null && !gamedetialModleFourFragemnt.f33231q2 && standardVideoView.getCurrentState() == 5) {
                        GamedetialModleFourFragemnt.this.f33210h.onVideoResume(false);
                    }
                    GamedetialModleFourFragemnt.this.Q.setVisibility(4);
                    return;
                }
                GamedetialModleFourFragemnt.this.f33232r.setVisibility(0);
                GamedetialModleFourFragemnt.this.f33234s.setVisibility(8);
                GamedetialModleFourFragemnt.this.f33236t.setVisibility(8);
                GamedetialModleFourFragemnt.this.H.getBackground().setAlpha(255);
                StandardVideoView standardVideoView2 = GamedetialModleFourFragemnt.this.f33210h;
                if (standardVideoView2 == null) {
                    return;
                }
                int currentState = standardVideoView2.getCurrentState();
                if (currentState == 2) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("currentState=");
                    sb.append(currentState);
                    sb.append(" -->performClick");
                    GamedetialModleFourFragemnt.this.f33210h.onVideoPause();
                }
                if (GamedetialModleFourFragemnt.this.T != null) {
                    GamedetialModleFourFragemnt.this.T.n(R.color.black_30_alpha);
                }
                GamedetialModleFourFragemnt.this.Q.setVisibility(0);
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class j implements PopupWindow.OnDismissListener {
        j() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            GamedetialModleFourFragemnt gamedetialModleFourFragemnt = GamedetialModleFourFragemnt.this;
            gamedetialModleFourFragemnt.N1 = 1;
            gamedetialModleFourFragemnt.i0();
            GamedetialModleFourFragemnt gamedetialModleFourFragemnt2 = GamedetialModleFourFragemnt.this;
            gamedetialModleFourFragemnt2.W = 0;
            gamedetialModleFourFragemnt2.B0(1.0f);
            GamedetialModleFourFragemnt.f33195u2 = GamedetialModleFourFragemnt.this.D1.getText().toString().trim();
            GamedetialModleFourFragemnt gamedetialModleFourFragemnt3 = GamedetialModleFourFragemnt.this;
            if (gamedetialModleFourFragemnt3.P1) {
                return;
            }
            gamedetialModleFourFragemnt3.P1 = true;
            gamedetialModleFourFragemnt3.V();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class k implements com.join.mgps.customview.g {
        k() {
        }

        @Override // com.join.mgps.customview.g
        public void onRefresh() {
            GamedetialModleFourFragemnt gamedetialModleFourFragemnt = GamedetialModleFourFragemnt.this;
            gamedetialModleFourFragemnt.N1 = 1;
            gamedetialModleFourFragemnt.Z();
            GamedetialModleFourFragemnt.this.n0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class l implements com.join.mgps.customview.f {
        l() {
        }

        @Override // com.join.mgps.customview.f
        public void onLoadMore() {
            GamedetialModleFourFragemnt.this.Z();
            GamedetialModleFourFragemnt.this.n0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class m implements View.OnClickListener {
        m() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GamedetialModleFourFragemnt.this.f33239v1.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class n implements View.OnClickListener {
        n() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GamedetialModleFourFragemnt.v2 = true;
            GamedetialModleFourFragemnt.this.startActivity(new Intent(GamedetialModleFourFragemnt.this.S, BuildGameFromActivity_.class));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class o implements View.OnClickListener {
        o() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            String trim = GamedetialModleFourFragemnt.this.D1.getText().toString().trim();
            GamedetialModleFourFragemnt.f33195u2 = trim;
            if (com.join.mgps.Util.o.f(trim)) {
                GamedetialModleFourFragemnt.this.showToast("不能上传表情");
                return;
            }
            GamedetialModleFourFragemnt.this.f33239v1.dismiss();
            GamedetialModleFourFragemnt gamedetialModleFourFragemnt = GamedetialModleFourFragemnt.this;
            if (gamedetialModleFourFragemnt.P1) {
                return;
            }
            gamedetialModleFourFragemnt.P1 = true;
            gamedetialModleFourFragemnt.V();
        }
    }

    /* loaded from: classes4.dex */
    class p implements s2.e {
        p() {
        }

        @Override // s2.e
        public void a(Bitmap bitmap) {
            com.join.android.app.component.video.h.e(bitmap);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class q implements View.OnClickListener {
        q() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GamedetialModleFourFragemnt.this.f33216k.setCurrentItem(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class r extends PagerAdapter {

        /* loaded from: classes4.dex */
        class a implements View.OnTouchListener {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ int f33263b;

            a(int i4) {
                this.f33263b = i4;
            }

            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (GamedetialModleFourFragemnt.this.s0()) {
                    if (this.f33263b != 0) {
                        if (GamedetialModleFourFragemnt.this.r0()) {
                            ScreenshotTrueListAcvity_.intent(GamedetialModleFourFragemnt.this.S).fromData(GamedetialModleFourFragemnt.this.f33227p0.getGame_screen_shot().get(this.f33263b - 1)).gameId(GamedetialModleFourFragemnt.this.f33227p0.getGame_id()).start();
                        } else {
                            List<DetialShowImageBean> pic_info = GamedetialModleFourFragemnt.this.f33227p0.getPic_info();
                            ArrayList arrayList = new ArrayList();
                            if (pic_info != null) {
                                for (int i4 = 0; i4 < pic_info.size(); i4++) {
                                    arrayList.add(pic_info.get(i4).getRemote().getPath());
                                }
                            }
                            try {
                                Intent intent = new Intent(GamedetialModleFourFragemnt.this.S, ImagePagerActivity.class);
                                String[] strArr = new String[arrayList.size()];
                                for (int i5 = 0; i5 < arrayList.size(); i5++) {
                                    strArr[i5] = (String) arrayList.get(i5);
                                }
                                if (com.join.mgps.Util.g2.i(GamedetialModleFourFragemnt.this.f33227p0.getVedio_url()) && this.f33263b == 0) {
                                    FullScreenActivity.VideoInfo videoInfo = new FullScreenActivity.VideoInfo();
                                    videoInfo.m(GamedetialModleFourFragemnt.this.f33227p0.getVedio_url());
                                    videoInfo.h(strArr[0]);
                                    FullScreenActivity_.i0(GamedetialModleFourFragemnt.this.S).a(videoInfo).start();
                                } else {
                                    intent.putExtra("image_urls", strArr);
                                    intent.putExtra("image_index", this.f33263b - 1);
                                    GamedetialModleFourFragemnt.this.S.startActivity(intent);
                                }
                            } catch (Exception e5) {
                                e5.printStackTrace();
                            }
                        }
                    }
                } else if (GamedetialModleFourFragemnt.this.r0()) {
                    ScreenshotTrueListAcvity_.intent(GamedetialModleFourFragemnt.this.S).fromData(GamedetialModleFourFragemnt.this.f33227p0.getGame_screen_shot().get(this.f33263b)).gameId(GamedetialModleFourFragemnt.this.f33227p0.getGame_id()).start();
                } else {
                    List<DetialShowImageBean> pic_info2 = GamedetialModleFourFragemnt.this.f33227p0.getPic_info();
                    ArrayList arrayList2 = new ArrayList();
                    if (pic_info2 != null) {
                        for (int i6 = 0; i6 < pic_info2.size(); i6++) {
                            arrayList2.add(pic_info2.get(i6).getRemote().getPath());
                        }
                    }
                    try {
                        Intent intent2 = new Intent(GamedetialModleFourFragemnt.this.S, ImagePagerActivity.class);
                        String[] strArr2 = new String[arrayList2.size()];
                        for (int i7 = 0; i7 < arrayList2.size(); i7++) {
                            strArr2[i7] = (String) arrayList2.get(i7);
                        }
                        if (com.join.mgps.Util.g2.i(GamedetialModleFourFragemnt.this.f33227p0.getVedio_url()) && this.f33263b == 0) {
                            FullScreenActivity.VideoInfo videoInfo2 = new FullScreenActivity.VideoInfo();
                            videoInfo2.m(GamedetialModleFourFragemnt.this.f33227p0.getVedio_url());
                            videoInfo2.h(strArr2[0]);
                            FullScreenActivity_.i0(GamedetialModleFourFragemnt.this.S).a(videoInfo2).start();
                        } else {
                            intent2.putExtra("image_urls", strArr2);
                            intent2.putExtra("image_index", this.f33263b - 1);
                            GamedetialModleFourFragemnt.this.S.startActivity(intent2);
                        }
                    } catch (Exception e6) {
                        e6.printStackTrace();
                    }
                }
                return false;
            }
        }

        r() {
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public void destroyItem(ViewGroup viewGroup, int i4, Object obj) {
            viewGroup.removeView((View) obj);
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public int getCount() {
            return GamedetialModleFourFragemnt.this.f33233r2.size();
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public Object instantiateItem(ViewGroup viewGroup, int i4) {
            viewGroup.addView((View) GamedetialModleFourFragemnt.this.f33233r2.get(i4));
            View view = (View) GamedetialModleFourFragemnt.this.f33233r2.get(i4);
            view.setOnTouchListener(new a(i4));
            return view;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public boolean isViewFromObject(View view, Object obj) {
            return view == obj;
        }
    }

    /* loaded from: classes4.dex */
    class s extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        ImageView f33265a;

        public s(View view) {
            super(view);
            this.f33265a = (ImageView) view.findViewById(R.id.img);
        }
    }

    /* loaded from: classes4.dex */
    class t extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
        t() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return 100;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public long getItemId(int i4) {
            return 0L;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int i4) {
            return super.getItemViewType(i4);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i4) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i4) {
            ImageView imageView = new ImageView(GamedetialModleFourFragemnt.this.S);
            imageView.setImageResource(R.drawable.icon);
            return new s(imageView);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class u extends BaseAdapter {

        /* loaded from: classes4.dex */
        class a implements View.OnClickListener {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ int f33269b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ v f33270c;

            a(int i4, v vVar) {
                this.f33269b = i4;
                this.f33270c = vVar;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (GamedetialModleFourFragemnt.this.O1.get(this.f33269b).getCurrent_game_state().equals("0")) {
                    this.f33270c.f33273b.setBackgroundResource(R.drawable.followed_image);
                    GamedetialModleFourFragemnt.this.A1.setVisibility(0);
                    GamedetialModleFourFragemnt.this.H1.setVisibility(8);
                    GamedetialModleFourFragemnt.this.E1.setVisibility(0);
                    GamedetialModleFourFragemnt.this.F1.setText("收藏成功");
                    GamedetialModleFourFragemnt.this.G1.setVisibility(8);
                    GamedetialModleFourFragemnt.f33194t2 = GamedetialModleFourFragemnt.this.O1.get(this.f33269b).getId();
                    GamedetialModleFourFragemnt gamedetialModleFourFragemnt = GamedetialModleFourFragemnt.this;
                    gamedetialModleFourFragemnt.P1 = false;
                    int i4 = gamedetialModleFourFragemnt.W + 1;
                    gamedetialModleFourFragemnt.W = i4;
                    if (i4 > 0) {
                        gamedetialModleFourFragemnt.E.setImageResource(R.drawable.followed_image);
                        GamedetialModleFourFragemnt.this.F.setText("已收藏");
                        return;
                    }
                    return;
                }
                this.f33270c.f33273b.setBackgroundResource(R.drawable.follow_none_image);
                GamedetialModleFourFragemnt.this.O1.get(this.f33269b).setCurrent_game_state("0");
                GamedetialModleFourFragemnt gamedetialModleFourFragemnt2 = GamedetialModleFourFragemnt.this;
                gamedetialModleFourFragemnt2.W(gamedetialModleFourFragemnt2.O1.get(this.f33269b).getId(), GamedetialModleFourFragemnt.this.f33200c, this.f33270c);
                GamedetialModleFourFragemnt gamedetialModleFourFragemnt3 = GamedetialModleFourFragemnt.this;
                int i5 = gamedetialModleFourFragemnt3.W - 1;
                gamedetialModleFourFragemnt3.W = i5;
                gamedetialModleFourFragemnt3.W = i5;
                if (i5 == 0) {
                    gamedetialModleFourFragemnt3.E.setImageResource(R.drawable.follow_none_image);
                    GamedetialModleFourFragemnt.this.F.setText("收藏");
                }
            }
        }

        u() {
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return GamedetialModleFourFragemnt.this.O1.size();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i4) {
            return GamedetialModleFourFragemnt.this.O1.get(i4);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i4) {
            return i4;
        }

        @Override // android.widget.Adapter
        public View getView(int i4, View view, ViewGroup viewGroup) {
            v vVar;
            if (view == null) {
                view = LayoutInflater.from(GamedetialModleFourFragemnt.this.S).inflate(R.layout.list_item, (ViewGroup) null);
                vVar = new v();
                vVar.f33272a = (SimpleDraweeView) view.findViewById(R.id.iv_img);
                vVar.f33273b = (ImageView) view.findViewById(R.id.iv_coll);
                vVar.f33274c = (TextView) view.findViewById(R.id.tv_title);
                vVar.f33275d = (TextView) view.findViewById(R.id.tv_size);
                vVar.f33277f = (RelativeLayout) view.findViewById(R.id.ll_gameform);
                vVar.f33278g = (RelativeLayout) view.findViewById(R.id.rl_content);
                view.setTag(vVar);
            } else {
                vVar = (v) view.getTag();
            }
            if (GamedetialModleFourFragemnt.this.O1.get(i4).getGame_list().get(0).getGame_ico() != null && !GamedetialModleFourFragemnt.this.O1.get(i4).getGame_list().get(0).getGame_ico().equals("")) {
                vVar.f33272a.setImageURI(GamedetialModleFourFragemnt.this.O1.get(i4).getGame_list().get(0).getGame_ico());
            } else {
                vVar.f33272a.setImageResource(R.drawable.main_normal_icon);
            }
            vVar.f33274c.setText(GamedetialModleFourFragemnt.this.O1.get(i4).getTitle());
            vVar.f33275d.setText(GamedetialModleFourFragemnt.this.O1.get(i4).getGame_count() + "款");
            if (GamedetialModleFourFragemnt.this.O1.get(i4).getCurrent_game_state().equals("0")) {
                vVar.f33273b.setBackgroundResource(R.drawable.follow_none_image);
            } else {
                vVar.f33273b.setBackgroundResource(R.drawable.followed_image);
                GamedetialModleFourFragemnt.this.W++;
            }
            vVar.f33278g.setOnClickListener(new a(i4, vVar));
            return view;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class v {

        /* renamed from: a  reason: collision with root package name */
        SimpleDraweeView f33272a;

        /* renamed from: b  reason: collision with root package name */
        ImageView f33273b;

        /* renamed from: c  reason: collision with root package name */
        TextView f33274c;

        /* renamed from: d  reason: collision with root package name */
        TextView f33275d;

        /* renamed from: e  reason: collision with root package name */
        TextView f33276e;

        /* renamed from: f  reason: collision with root package name */
        RelativeLayout f33277f;

        /* renamed from: g  reason: collision with root package name */
        RelativeLayout f33278g;

        v() {
        }
    }

    private void A0(String str, String str2, StatFactory.VolcanoOther volcanoOther, boolean z4) {
        String str3;
        String str4;
        String str5;
        String str6;
        String[] split = str.split("-");
        String str7 = "模块";
        String str8 = "home";
        str3 = "0";
        if (split.length > 0) {
            if (split.length > 2 && "22".equals(split[0])) {
                if ("4".equals(split[1])) {
                    str7 = "大家都在玩";
                } else if ("13".equals(split[1])) {
                    str7 = "最新网游";
                } else {
                    str7 = "99".equals(split[1]) ? "搜索页" : "";
                }
                str3 = split[2];
            } else if (!TextUtils.equals(split[0], "home") && !TextUtils.equals(split[0], "ranking")) {
                if (split[0].equals("4")) {
                    str3 = split.length > 1 ? split[1] : "0";
                    str6 = "大家都在玩";
                } else if (split[0].equals("7")) {
                    str4 = "home";
                    str5 = split.length > 1 ? split[1] : "0";
                    str6 = "网游推荐";
                    StatFactory.Companion.getInstance(this.S).sendEvent(new StatFactory.VolcanoEvent(Event.check, str2, new StatFactory.SpmData("wufun", str4, str6, str5, true), volcanoOther, z4));
                } else if (split[0].equals("5")) {
                    str3 = split.length > 1 ? split[1] : "0";
                    str6 = "最新网游";
                } else if (split[0].equals("0")) {
                    str3 = split.length > 2 ? split[2] : "0";
                    if (split.length > 3) {
                        str7 = "模块" + split[1];
                        str3 = split[3];
                    }
                }
                str4 = str8;
                str5 = str3;
                StatFactory.Companion.getInstance(this.S).sendEvent(new StatFactory.VolcanoEvent(Event.check, str2, new StatFactory.SpmData("wufun", str4, str6, str5, true), volcanoOther, z4));
            } else {
                str8 = split[0];
                str7 = split.length > 1 ? split[1] : "";
                if (split.length > 2) {
                    str3 = split[2];
                }
            }
            str6 = str7;
            str4 = str8;
            str5 = str3;
            StatFactory.Companion.getInstance(this.S).sendEvent(new StatFactory.VolcanoEvent(Event.check, str2, new StatFactory.SpmData("wufun", str4, str6, str5, true), volcanoOther, z4));
        }
        str4 = "home";
        str5 = "0";
        str6 = "";
        StatFactory.Companion.getInstance(this.S).sendEvent(new StatFactory.VolcanoEvent(Event.check, str2, new StatFactory.SpmData("wufun", str4, str6, str5, true), volcanoOther, z4));
    }

    private void Q0() {
        try {
            GameScore game_score = this.f33227p0.getGame_score();
            if ("1".equals(this.f33227p0.getComment_score_switch()) && game_score != null && com.join.mgps.Util.g2.i(game_score.getScore())) {
                if (!"0.0".equals(game_score.getScore()) && !"0".equals(game_score.getScore())) {
                    this.f33203d2.setText(game_score.getScore());
                    this.X1.setIntegerMark(false);
                    this.X1.setEnabled(false);
                    this.X1.setStarMark(game_score.getTotal_stars());
                    this.f33201c2.setVisibility(0);
                    return;
                }
                this.f33203d2.setText("暂无评分");
                this.f33203d2.setTextSize(14.0f);
                this.f33203d2.setTextColor(Color.parseColor("#8a8a8a"));
                this.X1.setIntegerMark(false);
                this.X1.setEnabled(false);
                this.X1.setStarMark(game_score.getTotal_stars());
                this.f33201c2.setVisibility(0);
                return;
            }
            this.f33201c2.setVisibility(8);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    private int getStatusBarHeight(Context context) {
        int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", q.a.f73126a);
        if (identifier > 0) {
            return context.getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    public static GamedetialModleFourFragemnt o0(String str, ExtBean extBean, boolean z4) {
        GamedetialModleFourFragemnt_ gamedetialModleFourFragemnt_ = new GamedetialModleFourFragemnt_();
        Bundle bundle = new Bundle();
        bundle.putBoolean(GamedetailVideoMainActivity_.AUTODOWN_EXTRA, z4);
        bundle.putSerializable("extBean", extBean);
        bundle.putString("gameId", str);
        bundle.putBoolean(EndGameDetailActivity_.R, false);
        gamedetialModleFourFragemnt_.setArguments(bundle);
        return gamedetialModleFourFragemnt_;
    }

    public static GamedetialModleFourFragemnt p0(String str, ExtBean extBean, boolean z4, boolean z5) {
        GamedetialModleFourFragemnt_ gamedetialModleFourFragemnt_ = new GamedetialModleFourFragemnt_();
        Bundle bundle = new Bundle();
        bundle.putBoolean(GamedetailVideoMainActivity_.AUTODOWN_EXTRA, z4);
        bundle.putSerializable("extBean", extBean);
        bundle.putString("gameId", str);
        bundle.putBoolean(EndGameDetailActivity_.R, z5);
        gamedetialModleFourFragemnt_.setArguments(bundle);
        return gamedetialModleFourFragemnt_;
    }

    private void w0() {
        try {
            if (this.f33210h != null) {
                if (!com.join.mgps.Util.g2.i(this.f33227p0.getGame_info_top_video_url()) && !com.join.mgps.Util.g2.i(this.f33227p0.getGame_info_top_pic())) {
                    this.f33208g.setVisibility(0);
                    this.f33212i.setVisibility(8);
                    this.f33210h.setVisibility(8);
                    return;
                }
                String game_info_top_video_url = this.f33227p0.getGame_info_top_video_url();
                if (com.join.mgps.Util.g2.h(game_info_top_video_url)) {
                    MyImageLoader.d(this.f33212i, R.drawable.banner_normal_icon, this.f33227p0.getGame_info_top_pic());
                    this.f33210h.setVisibility(8);
                    this.f33212i.setVisibility(0);
                }
                if (com.join.mgps.Util.g2.i(game_info_top_video_url)) {
                    MyImageLoader.h(this.f33210h.f15277b, this.f33227p0.getGame_info_top_pic());
                    this.f33210h.setMuteWhenPlay(false);
                    this.f33210h.setPlayTag(this.X);
                    if (this.Y) {
                        com.join.android.app.component.video.i.c(this.f33210h, game_info_top_video_url, false, "");
                        com.join.android.app.component.video.i.a(this.f33210h);
                        this.f33210h.setSurfaceToPlay();
                        this.f33210h.setCover(this.f33227p0.getGame_info_top_pic());
                        return;
                    }
                    this.f33210h.setUp(game_info_top_video_url, StandardVideoView.D, this.f33227p0.getGame_name(), this.f33227p0.getGame_info_top_pic());
                    this.S.autoPlayVideo(this.f33210h);
                }
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    private void z0() {
    }

    public void B0(float f5) {
        WindowManager.LayoutParams attributes = this.S.getWindow().getAttributes();
        attributes.alpha = f5;
        if (f5 == 1.0f) {
            this.S.getWindow().clearFlags(2);
        } else {
            this.S.getWindow().addFlags(2);
        }
        this.S.getWindow().setAttributes(attributes);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void C0(v vVar) {
        vVar.f33273b.setBackgroundResource(R.drawable.follow_none_image);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void D0() {
        ShareBean shareBean = new ShareBean();
        String share_url = this.f33228p1.getShare_url();
        shareBean.setqZoneShareUrl(share_url);
        shareBean.setQqUrl(share_url);
        shareBean.setWechatFriendUrl(share_url);
        shareBean.setWechatShareUrl(share_url);
        shareBean.setWeiboShareUrl(share_url);
        shareBean.setTitle(this.f33228p1.getGame_name());
        shareBean.setText(this.f33228p1.getInfo());
        shareBean.setImageUrl(this.f33228p1.getIco_remote());
        shareBean.setFrom(2);
        shareBean.setGameId(this.f33228p1.getGame_id());
        if (this.f33228p1.getShare_config() != null && this.f33228p1.getShare_config().getShare_switch() == 1) {
            shareBean.setIntentData(this.f33228p1.getShare_config().getJump_info());
        }
        com.join.mgps.Util.s.r(this.S, shareBean);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void E0() {
        ShareBean shareBean = new ShareBean();
        String share_url = this.f33228p1.getShare_url();
        shareBean.setqZoneShareUrl(share_url);
        shareBean.setQqUrl(share_url);
        shareBean.setWechatFriendUrl(share_url);
        shareBean.setWechatShareUrl(share_url);
        shareBean.setWeiboShareUrl(share_url);
        shareBean.setImageUrl(this.f33228p1.getIco_remote());
        shareBean.setTitle(this.f33228p1.getGame_name());
        shareBean.setText(this.f33228p1.getInfo());
        shareBean.setFrom(2);
        shareBean.setGameId(this.f33228p1.getGame_id());
        if (this.f33228p1.getShare_config() != null && this.f33228p1.getShare_config().getShare_switch() == 1) {
            shareBean.setIntentData(this.f33228p1.getShare_config().getJump_info());
        }
        com.join.mgps.Util.s.r(this.S, shareBean);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void F0(String str) {
        Toast.makeText(this.S, str, 0).show();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread(delay = 4000)
    public void G0() {
        com.join.mgps.Util.c.g(this.f33197a2);
        G0();
    }

    void H0() {
        try {
            this.f33209g2.setImageResource(R.drawable.line_blue_bg);
            Animation loadAnimation = AnimationUtils.loadAnimation(this.S, R.anim.img_translate);
            this.f33217k2 = loadAnimation;
            loadAnimation.setFillAfter(true);
            this.f33215j2.setVisibility(0);
            this.f33215j2.startAnimation(this.f33217k2);
            this.f33217k2.setAnimationListener(new e());
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    void I0() {
        try {
            this.f33215j2.clearAnimation();
            this.f33215j2.setVisibility(8);
            this.f33209g2.setImageResource(R.drawable.line_white_bg);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void J0() {
        IntentUtil.getInstance().goMyGameManagerActivity(this.S);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void K0() {
        XListView2 xListView2 = this.H1;
        if (xListView2 != null) {
            try {
                xListView2.g();
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void L0(int i4) {
        try {
            if (i4 < 100) {
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f33207f2.getLayoutParams();
                layoutParams.width = getResources().getDimensionPixelOffset(R.dimen.wdp24);
                layoutParams.height = getResources().getDimensionPixelOffset(R.dimen.wdp24);
                this.f33207f2.setLayoutParams(layoutParams);
                this.f33207f2.setCompoundDrawables(null, null, null, null);
                this.f33207f2.setBackgroundResource(R.drawable.mygame_big_round);
                this.f33207f2.setPadding(1, 0, 0, 1);
            } else {
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.f33207f2.getLayoutParams();
                layoutParams2.width = getResources().getDimensionPixelOffset(R.dimen.dp70);
                layoutParams2.height = getResources().getDimensionPixelOffset(R.dimen.round_large_size);
                layoutParams2.setMargins(4, (int) TypedValue.applyDimension(1, 7.0f, getResources().getDisplayMetrics()), 0, 0);
                this.f33207f2.setGravity(17);
                this.f33207f2.setLayoutParams(layoutParams2);
                this.f33207f2.setCompoundDrawables(null, null, null, null);
                this.f33207f2.setBackgroundResource(R.drawable.message_round);
                this.f33207f2.setPadding(1, 0, 2, 1);
            }
            this.f33207f2.setVisibility(0);
            TextView textView = this.f33207f2;
            textView.setText(i4 + "");
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void M0(int i4) {
        if (i4 == 0) {
            I0();
        } else {
            H0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void N0() {
        XListView2 xListView2 = this.H1;
        if (xListView2 != null) {
            try {
                xListView2.u();
                this.H1.v();
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void O0() {
        try {
            I0();
            this.f33207f2.setVisibility(8);
            this.f33207f2.setText("");
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread(delay = 1000)
    public void P0(boolean z4) {
        ExtBean extBean = this.f33202d;
        if (extBean == null || !"checkgame".equals(extBean.getFrom())) {
            return;
        }
        com.join.mgps.Util.m1.c().b(this.S, this.f33202d.getFrom_id(), new f(z4));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void R0(GamedetialModleFourBean gamedetialModleFourBean) {
        List<DownloadTask> H;
        boolean z4;
        if (gamedetialModleFourBean.getBt_game_switch() == 1) {
            gamedetialModleFourBean.setNodeId("2");
        } else {
            gamedetialModleFourBean.setNodeId("0");
        }
        this.f33228p1 = gamedetialModleFourBean;
        this.f33227p0 = gamedetialModleFourBean;
        try {
            if (gamedetialModleFourBean.getBt_game_switch() == 1) {
                this.N.setVisibility(0);
                this.N.removeAllViews();
                List<TipBean> game_bt_tag = gamedetialModleFourBean.getGame_bt_tag();
                if (game_bt_tag != null) {
                    int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.wdp10);
                    int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(R.dimen.wdp3);
                    boolean z5 = true;
                    for (TipBean tipBean : game_bt_tag) {
                        TextView textView = new TextView(this.S);
                        textView.setPadding(dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset, dimensionPixelOffset2);
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                        layoutParams.rightMargin = getResources().getDimensionPixelOffset(R.dimen.wdp12);
                        if (z5) {
                            layoutParams.leftMargin = getResources().getDimensionPixelOffset(R.dimen.wdp18);
                        }
                        textView.setLayoutParams(layoutParams);
                        textView.setTextColor(-1);
                        textView.setText(tipBean.getName());
                        textView.setTextSize(0, getResources().getDimensionPixelSize(R.dimen.wdp18));
                        if (com.join.mgps.Util.g2.i(tipBean.getColor())) {
                            GradientDrawable gradientDrawable = new GradientDrawable();
                            gradientDrawable.setShape(0);
                            gradientDrawable.setCornerRadius(getResources().getDimensionPixelOffset(R.dimen.wdp4));
                            gradientDrawable.setColor(Color.parseColor(tipBean.getColor()));
                            textView.setBackground(gradientDrawable);
                        }
                        this.N.addView(textView);
                        z5 = false;
                    }
                }
                if (gamedetialModleFourBean.getTag_info() != null) {
                    UtilsMy.M(gamedetialModleFourBean.getTag_info(), this.O, this.S);
                }
            }
            gamedetialModleFourBean.set_from_type(this.f33202d.get_from_type());
            gamedetialModleFourBean.set_from(101);
            gamedetialModleFourBean.setRecPosition(this.f33202d.getRecPosition());
            if (!TextUtils.isEmpty(this.f33202d.getVolcanoOther())) {
                gamedetialModleFourBean.setPosition_path((StatFactory.VolcanoOther) JsonMapper.getInstance().fromJson(this.f33202d.getVolcanoOther(), StatFactory.VolcanoOther.class));
            }
            this.f33228p1.set_from_type(this.f33202d.get_from_type());
            this.f33228p1.set_from(101);
            this.f33228p1.setRecPosition(this.f33202d.getRecPosition());
            if (!TextUtils.isEmpty(this.f33202d.getVolcanoOther())) {
                this.f33228p1.setPosition_path((StatFactory.VolcanoOther) JsonMapper.getInstance().fromJson(this.f33202d.getVolcanoOther(), StatFactory.VolcanoOther.class));
            }
            this.I.setVisibility(0);
            this.J.setVisibility(8);
            this.K.setVisibility(8);
            initView();
            ArrayList arrayList = new ArrayList();
            CommentAlllistIntentData commentAlllistIntentData = new CommentAlllistIntentData();
            commentAlllistIntentData.setGameId(gamedetialModleFourBean.getGame_id());
            commentAlllistIntentData.setPackageName(gamedetialModleFourBean.getPackageName());
            commentAlllistIntentData.setGameType(gamedetialModleFourBean.getPlugin_num());
            commentAlllistIntentData.setGameIsStart(gamedetialModleFourBean.getIs_started());
            if (gamedetialModleFourBean.getGame_score() != null) {
                commentAlllistIntentData.setSgcSwitch(gamedetialModleFourBean.getGame_score().getSgc_switch());
            }
            commentAlllistIntentData.setBespeakSwitch(gamedetialModleFourBean.getBespeak_switch());
            commentAlllistIntentData.setCommentScoreSwitch(gamedetialModleFourBean.getComment_score_switch());
            arrayList.add(new FragmentPagerAdapter.a("详情", GameDetialModleThreeActivity.t0(this.f33200c, this.f33204e, this.f33202d)));
            arrayList.add(new FragmentPagerAdapter.a("点评", CommentAllListFragment.c0(commentAlllistIntentData)));
            arrayList.add(new FragmentPagerAdapter.a("游戏单", GameFormFragment.h0(gamedetialModleFourBean.getGame_company_id(), this.f33200c)));
            this.f33216k.setAdapter(new FragmentPagerAdapter(getChildFragmentManager(), arrayList));
            this.f33216k.setOffscreenPageLimit(3);
            this.f33214j.setViewPager(this.f33216k);
            if (arrayList.size() == 1) {
                this.f33220m.setVisibility(8);
                this.f33218l.setVisibility(8);
            }
            y0(gamedetialModleFourBean);
            this.f33218l.setData(gamedetialModleFourBean);
            if (this.f33204e && p1.f.K().F(this.f33200c) == null) {
                com.php25.PDownload.d.c(gamedetialModleFourBean.getDownloadtaskDown(), this.S);
                onDetailDownload();
            }
            GamedetialModleFourBean gamedetialModleFourBean2 = this.f33228p1;
            if (gamedetialModleFourBean2 != null) {
                if (gamedetialModleFourBean2.getGame_follow() == 1) {
                    this.E.setImageResource(R.drawable.followed_image);
                    this.F.setText("已收藏");
                } else {
                    this.E.setImageResource(R.drawable.follow_none_image);
                    this.F.setText("收藏");
                }
            }
            if (gamedetialModleFourBean.getMod_info() != null) {
                H = p1.f.K().G(gamedetialModleFourBean.getMod_info().getMain_game_id(), gamedetialModleFourBean.getMod_info().getMod_game_id());
            } else {
                H = p1.f.K().H(this.f33228p1.getPackageName());
            }
            if (H != null && H.size() > 0) {
                boolean z6 = false;
                loop1: while (true) {
                    z4 = false;
                    for (DownloadTask downloadTask : H) {
                        if (Dtype.MOD.name().equals(downloadTask.getFileType())) {
                            z6 = com.join.mgps.va.overmind.d.o().F(downloadTask.getPackageName()) && downloadTask.getStatus() == 5;
                        } else if (com.join.android.app.common.utils.e.l0(getContext()).d(getContext(), downloadTask.getPackageName()) && downloadTask.getStatus() == 5) {
                            z4 = true;
                        }
                    }
                    break loop1;
                }
                if (z6 && z4) {
                    this.f33205e2 = p1.f.K().F(this.f33200c);
                } else if (z6) {
                    if (this.f33228p1.getMod_info() != null) {
                        this.f33205e2 = p1.f.K().F(this.f33228p1.getMod_info().getMod_game_id());
                    }
                } else if (z4) {
                    this.f33205e2 = p1.f.K().F(this.f33200c);
                } else {
                    if (this.f33228p1.getMod_info() != null) {
                        this.f33205e2 = p1.f.K().F(this.f33228p1.getMod_info().getMod_game_id());
                    }
                    if (this.f33205e2 == null) {
                        this.f33205e2 = p1.f.K().F(this.f33200c);
                    }
                }
            }
            DownloadTask downloadTask2 = this.f33205e2;
            if (downloadTask2 == null) {
                this.f33205e2 = this.f33228p1.getDownloadtaskDown();
                if (UtilsMy.o0(this.f33228p1.getTag_info())) {
                    if (this.f33205e2.getMod_info() == null) {
                        this.f33205e2.setFileType(Dtype.android.name());
                        if (com.join.android.app.common.utils.e.l0(this.S).d(this.S, this.f33228p1.getPackageName())) {
                            APKUtils.a l4 = com.join.android.app.common.utils.e.l0(this.S).l(this.S, this.f33228p1.getPackageName());
                            if (com.join.mgps.Util.g2.i(this.f33228p1.getVer()) && l4.d() < Integer.parseInt(this.f33228p1.getVer())) {
                                this.f33205e2.setStatus(9);
                            } else {
                                this.f33205e2.setStatus(5);
                            }
                        } else {
                            this.f33205e2.setStatus(0);
                        }
                    }
                } else {
                    this.f33205e2.setStatus(0);
                }
            } else {
                downloadTask2.setDownloadType(0);
                this.f33205e2.setTask_down_type(0);
                this.f33205e2.setScreenshot_pic(this.f33228p1.getScreenshot_pic());
            }
            if (("" + this.f33228p1.getPlugin_num()).equals("" + ConstantIntEnum.H5.value())) {
                GamedetialModleFourBean gamedetialModleFourBean3 = this.f33228p1;
                gamedetialModleFourBean3.setDown_count(gamedetialModleFourBean3.getStart_count());
            }
            updateButn();
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Receiver(actions = {"com.broadcast.bespeak.sussess"})
    public void S0() {
        this.f33228p1.setGame_book(1);
        updateButn();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void V() {
        try {
            com.wufan.user.service.protobuf.n0 accountData = AccountUtil_.getInstance_(this.S).getAccountData();
            LinkedMultiValueMap linkedMultiValueMap = new LinkedMultiValueMap();
            linkedMultiValueMap.add("uid", Integer.valueOf(accountData.getUid()));
            linkedMultiValueMap.add("token", accountData.getToken());
            linkedMultiValueMap.add("group_id", f33194t2);
            linkedMultiValueMap.add("game_id", this.f33200c);
            linkedMultiValueMap.add("game_title", f33195u2);
            linkedMultiValueMap.add("device_id", this.U);
            linkedMultiValueMap.add("version", this.V);
            GameFromBooleanBean Q = this.K1.Q(linkedMultiValueMap);
            if (Q != null && Q.getError() == 0 && Q.getData().isState()) {
                showToast("收藏成功!");
                MApplication.I1 = true;
            } else if (Q.getData().getCode() == 10002) {
                showToast("游戏重复!");
            } else if (10001 == Q.getData().getCode()) {
                showToast("游戏不存在!");
            } else {
                showToast("收藏失败!");
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void W(String str, String str2, v vVar) {
        try {
            if (com.join.android.app.common.utils.j.j(this.S)) {
                LinkedMultiValueMap linkedMultiValueMap = new LinkedMultiValueMap();
                linkedMultiValueMap.add("uid", Integer.valueOf(this.f33223n2.getUid()));
                linkedMultiValueMap.add("token", this.f33223n2.getToken());
                linkedMultiValueMap.add("group_id", str);
                linkedMultiValueMap.add("game_id", str2);
                linkedMultiValueMap.add("device_id", this.U);
                linkedMultiValueMap.add("version", this.V);
                GameFromBooleanBean z4 = this.K1.z(linkedMultiValueMap);
                if (z4 != null && z4.getError() == 0 && z4.getData().isState()) {
                    showToast("已取消该收藏!");
                    MApplication.I1 = true;
                } else {
                    showToast("取消收藏失败!");
                }
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void X() {
        this.P.setVisibility(8);
        ((GamedetailVideoMainActivity_) getActivity()).shakeAnimback();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void Z() {
        try {
            XListView2 xListView2 = this.H1;
            if (xListView2 != null) {
                xListView2.l();
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    void addFrom(DownloadTask downloadTask) {
        ExtBean extBean = this.f33202d;
        if (extBean == null || TextUtils.isEmpty(extBean.getFrom()) || downloadTask == null || !"112".equals(this.f33202d.getFrom())) {
            return;
        }
        ExtBean extBean2 = new ExtBean();
        extBean2.setFrom("101");
        extBean2.setPosition("112");
        extBean2.setLocation(this.f33202d.getLocation());
        downloadTask.setExt(JsonMapper.toJsonString(extBean2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterView() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f33200c = arguments.getString("gameId");
            this.f33204e = arguments.getBoolean(GamedetailVideoMainActivity_.AUTODOWN_EXTRA);
            this.Y = arguments.getBoolean(EndGameDetailActivity_.R);
            this.f33202d = (ExtBean) arguments.getSerializable("extBean");
        }
        this.X = this.f33198b + System.currentTimeMillis();
        if (this.Y) {
            this.X = "PapaMainAdapter";
        }
        if (this.f33202d == null) {
            this.f33202d = new ExtBean();
        }
        GamedetailVideoMainActivity gamedetailVideoMainActivity = (GamedetailVideoMainActivity) getActivity();
        this.S = gamedetailVideoMainActivity;
        if (gamedetailVideoMainActivity.gethideOrshowCover()) {
            this.P.setVisibility(0);
        } else {
            this.P.setVisibility(8);
        }
        this.J.setVisibility(8);
        this.K.setVisibility(8);
        this.I.setVisibility(8);
        this.R = com.join.mgps.rpc.impl.d.P1();
        this.J1 = com.join.mgps.rpc.impl.a.c0();
        this.K1 = com.join.mgps.rpc.impl.a.c0();
        com.join.mgps.Util.d0.a().d(this);
        RequestBeanUtil.getInstance(this.S);
        this.V = RequestBeanUtil.getVersionAndVersionName();
        this.T = new com.join.android.app.common.manager.b(this.S);
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 21) {
            this.S.getWindow().setFlags(TTAdConstant.KEY_CLICK_AREA, TTAdConstant.KEY_CLICK_AREA);
            this.T.m(true);
            this.T.n(R.color.black_30_alpha);
            View childAt = ((ViewGroup) this.S.findViewById(16908290)).getChildAt(0);
            if (childAt != null) {
                ViewCompat.setFitsSystemWindows(childAt, false);
            }
            getResources().getDimensionPixelSize(getResources().getIdentifier("status_bar_height", "dimen", q.a.f73126a));
        }
        if (i4 >= 21) {
            this.T.n(R.color.black_alpha);
            GamedetailVideoMainActivity gamedetailVideoMainActivity2 = this.S;
            com.join.mgps.Util.c2.c(gamedetailVideoMainActivity2, com.join.mgps.Util.c2.d(gamedetailVideoMainActivity2));
        }
        GamedetialModleFourBean modleFourBeanShow = ((GamedetailVideoMainActivity) getActivity()).getModleFourBeanShow();
        if (modleFourBeanShow != null) {
            this.J.setVisibility(8);
            this.K.setVisibility(8);
            this.I.setVisibility(0);
            R0(modleFourBeanShow);
        } else {
            m0();
        }
        this.Z = getStatusBarHeight(this.S);
        this.H.getBackground().setAlpha(0);
        CollapsingToolbarLayout.LayoutParams layoutParams = (CollapsingToolbarLayout.LayoutParams) this.H.getLayoutParams();
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.Q.getLayoutParams();
        if (i4 >= 21) {
            layoutParams2.height = this.Z;
            this.Q.setLayoutParams(layoutParams2);
            ((FrameLayout.LayoutParams) layoutParams).height = getResources().getDimensionPixelOffset(R.dimen.wdp98) + this.Z;
            this.H.setLayoutParams(layoutParams);
        } else {
            ((FrameLayout.LayoutParams) layoutParams).height = getResources().getDimensionPixelOffset(R.dimen.wdp98);
            this.H.setLayoutParams(layoutParams);
            layoutParams2.height = 1;
            this.Q.setLayoutParams(layoutParams2);
        }
        this.f33226p.addOnOffsetChangedListener((AppBarLayout.OnOffsetChangedListener) new i());
    }

    @Override // com.join.mgps.activity.gamedetail.BaseGameDetailFragment
    public void backpressedTofinishActivity() {
        StandardVideoView standardVideoView = this.f33210h;
        if (standardVideoView == null) {
            return;
        }
        standardVideoView.taskShotPic(new p());
        if (this.f33210h.getTimeHas() < 2000) {
            this.f33210h.onAutoCompletion();
        }
        com.join.android.app.component.video.h.f(this.f33210h);
        this.f33210h.getGSYVideoManager().A(this.f33210h);
        this.R1 = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x001c, code lost:
        if (r4 != 11) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void changeDownloadTaskNumber(com.github.snowdream.android.app.downloader.DownloadTask r3, int r4) {
        /*
            r2 = this;
            if (r3 != 0) goto L3
            return
        L3:
            java.lang.String r0 = r3.getCrc_link_type_val()
            r1 = 2
            if (r4 == r1) goto L8d
            r1 = 3
            if (r4 == r1) goto L7f
            r1 = 5
            if (r4 == r1) goto L64
            r1 = 6
            if (r4 == r1) goto L56
            r1 = 7
            if (r4 == r1) goto L3b
            r1 = 10
            if (r4 == r1) goto L20
            r3 = 11
            if (r4 == r3) goto L71
            goto La7
        L20:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r4 = r2.f33225o2
            boolean r4 = r4.containsKey(r0)
            if (r4 != 0) goto L2d
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r4 = r2.f33225o2
            r4.put(r0, r3)
        L2d:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r4 = r2.f33229p2
            boolean r4 = r4.containsKey(r0)
            if (r4 != 0) goto La7
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r4 = r2.f33229p2
            r4.put(r0, r3)
            goto La7
        L3b:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.f33225o2
            boolean r3 = r3.containsKey(r0)
            if (r3 == 0) goto L48
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.f33225o2
            r3.remove(r0)
        L48:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.f33229p2
            boolean r3 = r3.containsKey(r0)
            if (r3 == 0) goto La7
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.f33229p2
            r3.remove(r0)
            goto La7
        L56:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.f33229p2
            boolean r3 = r3.containsKey(r0)
            if (r3 == 0) goto La7
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.f33229p2
            r3.remove(r0)
            goto La7
        L64:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.f33225o2
            boolean r3 = r3.containsKey(r0)
            if (r3 == 0) goto L71
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.f33225o2
            r3.remove(r0)
        L71:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.f33229p2
            boolean r3 = r3.containsKey(r0)
            if (r3 == 0) goto La7
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.f33229p2
            r3.remove(r0)
            goto La7
        L7f:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.f33229p2
            boolean r3 = r3.containsKey(r0)
            if (r3 == 0) goto La7
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.f33229p2
            r3.remove(r0)
            goto La7
        L8d:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r4 = r2.f33225o2
            boolean r4 = r4.containsKey(r0)
            if (r4 != 0) goto L9a
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r4 = r2.f33225o2
            r4.put(r0, r3)
        L9a:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r4 = r2.f33229p2
            boolean r4 = r4.containsKey(r0)
            if (r4 != 0) goto La7
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r4 = r2.f33229p2
            r4.put(r0, r3)
        La7:
            r2.updateDownloadView()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.mgps.activity.GamedetialModleFourFragemnt.changeDownloadTaskNumber(com.github.snowdream.android.app.downloader.DownloadTask, int):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void changeGameFollow(int i4) {
        String str;
        if (com.join.android.app.common.utils.j.j(this.S)) {
            com.wufan.user.service.protobuf.n0 accountData = AccountUtil_.getInstance_(this.S).getAccountData();
            this.f33223n2 = accountData;
            int uid = accountData != null ? accountData.getUid() : 0;
            try {
                PackageInfo packageInfo = this.S.getPackageManager().getPackageInfo(this.S.getPackageName(), 0);
                str = packageInfo.versionCode + "_" + packageInfo.versionName;
            } catch (PackageManager.NameNotFoundException e5) {
                e5.printStackTrace();
                str = "";
            }
            RequestdetialFolowAndBeSpeak requestdetialFolowAndBeSpeak = new RequestdetialFolowAndBeSpeak();
            requestdetialFolowAndBeSpeak.setApp_ver(str);
            requestdetialFolowAndBeSpeak.setGame_id(this.f33228p1.getCrc_sign_id());
            requestdetialFolowAndBeSpeak.setUid(uid);
            requestdetialFolowAndBeSpeak.setMobile(this.f33223n2.z());
            CommonRequestBean<RequestGameIdArgs> detialFollowAnd = RequestBeanUtil.getInstance(this.S).getDetialFollowAnd(requestdetialFolowAndBeSpeak);
            ResultMainBean resultMainBean = null;
            if (i4 == 1) {
                resultMainBean = this.R.O0(detialFollowAnd);
            } else if (i4 == 2) {
                resultMainBean = this.R.D(detialFollowAnd);
            } else if (i4 == 3) {
                resultMainBean = this.R.o(detialFollowAnd);
            } else if (i4 == 4) {
                resultMainBean = this.R.d0(detialFollowAnd);
            }
            if (resultMainBean != null) {
                updateTitleButn(resultMainBean, i4);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void f0(GameFromPopoWinBean gameFromPopoWinBean) {
        for (int i4 = 0; i4 < gameFromPopoWinBean.getData().size(); i4++) {
            this.O1.add(gameFromPopoWinBean.getData().get(i4));
        }
        if (gameFromPopoWinBean.getData().size() < 10 && this.H1 != null) {
            K0();
        }
        u uVar = this.I1;
        if (uVar != null) {
            uVar.notifyDataSetChanged();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void g0() {
        this.S.clickBack();
        q0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void getDownloadTaskInfo() {
        List<DownloadTask> r4 = p1.f.K().r();
        List<DownloadTask> q4 = p1.f.K().q();
        if (q4 != null && q4.size() > 0) {
            for (DownloadTask downloadTask : q4) {
                this.f33225o2.put(downloadTask.getCrc_link_type_val(), downloadTask);
            }
        }
        if (r4 != null && r4.size() > 0) {
            for (DownloadTask downloadTask2 : r4) {
                this.f33229p2.put(downloadTask2.getCrc_link_type_val(), downloadTask2);
            }
        }
        updateDownloadView();
    }

    @Override // com.join.mgps.activity.gamedetail.BaseGameDetailFragment
    public ViewPager getViewPager() {
        return this.f33216k;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void h0() {
        try {
            this.f33219l2 = p1.f.K().S();
            int a02 = p1.f.K().a0();
            this.f33221m2 = a02;
            M0(a02);
            int i4 = this.f33219l2;
            if (i4 != 0) {
                L0(i4);
            } else {
                O0();
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        updateDownloadView();
    }

    @Override // com.join.mgps.activity.gamedetail.BaseGameDetailFragment
    public void hideCover() {
        this.P.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void i0() {
        if (this.O1.size() > 0) {
            this.O1.clear();
            u uVar = this.I1;
            if (uVar != null) {
                uVar.notifyDataSetChanged();
            }
        }
    }

    void initView() {
        try {
            this.L.setVisibility(8);
            this.G.setText(this.f33227p0.getGame_name());
            w0();
            u0();
            if (!com.join.mgps.Util.g2.i(this.f33227p0.getGame_info_top_video_url()) && !com.join.mgps.Util.g2.i(this.f33227p0.getGame_info_top_pic())) {
                this.f33232r.setVisibility(0);
                this.f33234s.setVisibility(8);
                this.f33236t.setVisibility(8);
                this.H.getBackground().setAlpha(255);
                int dimensionPixelSize = getResources().getDimensionPixelSize(getResources().getIdentifier("status_bar_height", "dimen", q.a.f73126a));
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f33224o.getLayoutParams();
                layoutParams.height = dimensionPixelSize;
                this.f33224o.setLayoutParams(layoutParams);
            }
            this.T1 = (TextView) this.S.findViewById(R.id.appName);
            this.U1 = (TextView) this.S.findViewById(R.id.appCompany);
            this.V1 = (TextView) this.S.findViewById(R.id.appSize);
            this.W1 = (TextView) this.S.findViewById(R.id.appDownloadCount);
            this.X1 = (MStarBar) this.S.findViewById(R.id.comment_head_mstarBar);
            this.S1 = (SimpleDraweeView) this.S.findViewById(R.id.appIcon);
            this.Y1 = (LinearLayout) this.S.findViewById(R.id.companyLayout);
            this.Z1 = (LinearLayout) this.S.findViewById(R.id.layoutGift);
            this.f33197a2 = (SimpleDraweeView) this.S.findViewById(R.id.giftImage);
            this.f33199b2 = (TextView) this.S.findViewById(R.id.giftContent);
            this.f33201c2 = (LinearLayout) this.S.findViewById(R.id.scoreLayout);
            this.f33203d2 = (TextView) this.S.findViewById(R.id.comment_head_point_tx);
            MyImageLoader.h(this.S1, this.f33227p0.getIco_remote());
            this.T1.setText(this.f33227p0.getGame_name());
            this.U1.setText(this.f33227p0.getCompany_name());
            if (this.f33227p0.getBespeak_switch() == 1) {
                if (this.f33227p0.getAppSize() != null && !"0.00".equals(this.f33227p0.getAppSize())) {
                    TextView textView = this.V1;
                    textView.setText(this.f33227p0.getAppSize() + "M");
                    this.V1.setVisibility(0);
                } else {
                    this.V1.setVisibility(8);
                }
                if (this.f33227p0.getBespeak_count() == null) {
                    this.W1.setText("已有0人预约");
                } else {
                    TextView textView2 = this.W1;
                    textView2.setText("已有" + this.f33227p0.getBespeak_count() + "人预约");
                }
            } else {
                this.V1.setVisibility(0);
                this.W1.setText(com.join.mgps.Util.g2.c(this.f33227p0.getDown_count()));
                TextView textView3 = this.V1;
                textView3.setText(this.f33227p0.getAppSize() + "M");
                try {
                    if (this.f33227p0.getDown_status() == 5 && this.f33227p0.getSp_tag_info() != null && this.f33227p0.getSp_tag_info().getDown_res() != null) {
                        this.W1.setText(this.f33227p0.getSp_tag_info().getDown_res().getName());
                    }
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
            }
            if (this.f33227p0.getPlugin_num() != null) {
                String plugin_num = this.f33227p0.getPlugin_num();
                if (plugin_num.equals(ConstantIntEnum.H5.value() + "")) {
                    this.V1.setVisibility(8);
                    this.W1.setText(com.join.mgps.Util.g2.c(this.f33227p0.getDown_count()).replace("安装", this.S.getResources().getString(R.string.download_status_finished)));
                }
            }
            Q0();
            this.f33201c2.setOnClickListener(new q());
            if (com.join.mgps.Util.g2.h(this.f33227p0.getCompany_name())) {
                this.Y1.setVisibility(8);
            } else {
                this.Y1.setVisibility(8);
                this.Z1.setOnClickListener(new a());
            }
            this.U1.setOnClickListener(new b());
            if (this.f33227p0.getShare_config() != null && this.f33227p0.getShare_config().getShare_switch() == 1) {
                this.Z1.setVisibility(0);
                MyImageLoader.d(this.f33197a2, R.drawable.user_gift, "");
                this.Z1.setOnClickListener(new c());
            } else {
                this.Z1.setVisibility(8);
            }
            if (this.f33227p0.getActivity_entry() != null) {
                this.Z1.setVisibility(0);
                MyImageLoader.h(this.f33197a2, this.f33227p0.getActivity_entry().getPic());
                this.f33199b2.setText(this.f33227p0.getActivity_entry().getTitle());
                G0();
                this.Z1.setOnClickListener(new d());
                return;
            }
            this.Z1.setVisibility(8);
        } catch (Exception e6) {
            e6.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void instalButtomButn() {
        ExtBean extBean;
        boolean z4;
        int game_book = this.f33228p1.getGame_book();
        if (this.f33228p1.getBespeak_switch() == 1 && game_book != 1 && this.f33228p1.getDown_status() == 2) {
            if (IntentUtil.getInstance().goLoginNetGame(this.S) || this.f33228p1.getGame_book() == 1) {
                return;
            }
            changeGameFollow(4);
            return;
        }
        if (("" + this.f33228p1.getPlugin_num()).equals("" + ConstantIntEnum.H5.value())) {
            IntentUtil.getInstance().goShareWebActivity(this.S, this.f33228p1.getDown_url_remote());
            UtilsMy.T2(this.f33205e2, this.S);
        }
        DownloadTask downloadTask = this.f33205e2;
        int status = downloadTask != null ? downloadTask.getStatus() : 0;
        if (this.f33205e2 != null && UtilsMy.w0(this.f33228p1.getPay_tag_info(), this.f33228p1.getCrc_sign_id()) > 0) {
            status = 43;
        }
        GamedetialModleFourBean gamedetialModleFourBean = this.f33228p1;
        if (gamedetialModleFourBean != null && gamedetialModleFourBean.getMod_info() != null) {
            List<DownloadTask> G = p1.f.K().G(this.f33228p1.getMod_info().getMain_game_id(), this.f33228p1.getMod_info().getMod_game_id());
            if (G != null && G.size() > 0) {
                boolean z5 = false;
                loop0: while (true) {
                    z4 = false;
                    for (DownloadTask downloadTask2 : G) {
                        if (Dtype.MOD.name().equals(downloadTask2.getFileType())) {
                            z5 = com.join.mgps.va.overmind.d.o().F(downloadTask2.getPackageName()) && downloadTask2.getStatus() == 5;
                        } else if (com.join.android.app.common.utils.e.l0(getContext()).d(getContext(), downloadTask2.getPackageName()) && downloadTask2.getStatus() == 5) {
                            z4 = true;
                        }
                    }
                    break loop0;
                }
                if (z5 && z4) {
                    this.f33205e2 = p1.f.K().F(this.f33200c);
                } else if (z5) {
                    if (this.f33228p1.getMod_info() != null) {
                        this.f33205e2 = p1.f.K().F(this.f33228p1.getMod_info().getMod_game_id());
                    }
                } else if (z4) {
                    this.f33205e2 = p1.f.K().F(this.f33200c);
                } else {
                    if (this.f33228p1.getMod_info() != null) {
                        this.f33205e2 = p1.f.K().F(this.f33228p1.getMod_info().getMod_game_id());
                    }
                    if (this.f33205e2 == null) {
                        this.f33205e2 = p1.f.K().F(this.f33200c);
                    }
                }
            } else {
                this.f33205e2 = null;
            }
        }
        DownloadTask downloadTask3 = this.f33205e2;
        if (downloadTask3 != null && downloadTask3.getStatus() != 0) {
            DownloadTask downloadTask4 = this.f33205e2;
            if (downloadTask4 != null && (status == 2 || status == 10)) {
                com.php25.PDownload.d.i(downloadTask4);
            } else if (status == 12 || status == 27) {
                return;
            } else {
                if (status == 13) {
                    com.php25.PDownload.d.l(this.S, downloadTask4);
                    return;
                } else if (status == 5) {
                    UtilsMy.W3(this.S, downloadTask4, "2");
                } else if (status == 42) {
                    downloadTask4.setVer(this.f33228p1.getVer());
                    this.f33205e2.setVer_name(this.f33228p1.getVer_name());
                    this.f33205e2.setUrl(this.f33228p1.getDown_url_remote());
                    this.f33205e2.setCfg_ver(this.f33228p1.getCfg_ver());
                    this.f33205e2.setCfg_ver_name(this.f33228p1.getCfg_ver_name());
                    this.f33205e2.setCfg_down_url(this.f33228p1.getCfg_down_url());
                    this.f33205e2.setPay_game_amount(this.f33228p1.getPay_tag_info() != null ? this.f33228p1.getPay_tag_info().getPay_game_amount() : 0);
                    DownloadTask downloadTask5 = this.f33205e2;
                    Where where = Where.detail;
                    downloadTask5.setKeyword(where.name());
                    this.f33205e2.setKeyword(where.name());
                    DownloadTask downloadTask6 = this.f33205e2;
                    UtilsMy.z4(downloadTask6, downloadTask6.getCrc_link_type_val());
                    UtilsMy.r4(this.S, this.f33205e2);
                } else if (status == 9) {
                    if (!com.join.android.app.common.utils.j.j(this.S)) {
                        com.join.mgps.Util.l2.a(this.S).b("无网络连接");
                        return;
                    }
                    if (this.f33228p1.getGame_detailed() != null && com.join.mgps.Util.g2.i(this.f33228p1.getGame_detailed().getTpl_two_qq())) {
                        com.join.mgps.Util.b0.f0(this.S).b0(this.S, this.f33228p1.getGame_detailed().getTpl_two_qq_key(), this.f33228p1.getGame_detailed().getAd_pic_qq(), this.f33228p1.getGame_detailed().getTpl_two_qq());
                    }
                    int downloadType = this.f33205e2.getDownloadType();
                    if (downloadType == 0 || downloadType == 1) {
                        if (this.f33205e2.getCrc_link_type_val() == null || this.f33205e2.getCrc_link_type_val().equals("")) {
                            return;
                        }
                        addFrom(this.f33205e2);
                        if (UtilsMy.o1(this.S, this.f33205e2)) {
                            return;
                        }
                        if (this.f33228p1.getDown_status() == 5) {
                            UtilsMy.l1(this.S, this.f33205e2);
                            return;
                        }
                        com.php25.PDownload.d.b(this.f33205e2);
                        this.f33205e2.setVer(this.f33228p1.getVer());
                        this.f33205e2.setVer_name(this.f33228p1.getVer_name());
                        this.f33205e2.setUrl(this.f33228p1.getDown_url_remote());
                        this.f33205e2.setCfg_ver(this.f33228p1.getCfg_ver());
                        this.f33205e2.setCfg_ver_name(this.f33228p1.getCfg_ver_name());
                        this.f33205e2.setCfg_down_url(this.f33228p1.getCfg_down_url());
                        this.f33205e2.setPay_game_amount(this.f33228p1.getPay_tag_info() != null ? this.f33228p1.getPay_tag_info().getPay_game_amount() : 0);
                        this.f33205e2.setKeyword(Where.detail.name());
                        DownloadTask downloadTask7 = this.f33205e2;
                        UtilsMy.z4(downloadTask7, downloadTask7.getCrc_link_type_val());
                        if (UtilsMy.y0(this.f33228p1.getPay_tag_info(), this.f33228p1.getCrc_sign_id()) > 0) {
                            ExtBean extBean2 = this.f33202d;
                            if (extBean2 != null && "checkgame".equals(extBean2.getFrom())) {
                                UtilsMy.e4(this.S, this.f33200c, this.f33202d.getFrom_id());
                            } else {
                                if (!UtilsMy.o1(this.S, this.f33205e2)) {
                                    if (this.f33228p1.getDown_status() == 5) {
                                        UtilsMy.l1(this.S, this.f33205e2);
                                    } else {
                                        UtilsMy.d4(this.S, this.f33200c);
                                    }
                                }
                                onDetailDownload();
                            }
                        } else {
                            UtilsMy.C1(this.f33205e2, this.f33228p1);
                            if (!UtilsMy.o1(this.S, this.f33205e2)) {
                                if (this.f33228p1.getDown_status() == 5) {
                                    UtilsMy.l1(this.S, this.f33205e2);
                                } else {
                                    UtilsMy.R0(this.S, this.f33205e2, this.f33228p1.getTp_down_url(), this.f33228p1.getOther_down_switch(), this.f33228p1.getCdn_down_switch());
                                }
                            }
                            onDetailDownload();
                        }
                    } else if (downloadType == 2) {
                        UtilsMy.u4(this.f33205e2);
                    }
                } else if (11 == status) {
                    UtilsMy.a4(downloadTask4, this.S);
                } else if (43 == status) {
                    downloadTask4.setKeyword(Where.detail.name());
                    if (this.f33228p1 != null) {
                        addFrom(this.f33205e2);
                        if (this.f33228p1.getGame_detailed() != null && com.join.mgps.Util.g2.i(this.f33228p1.getGame_detailed().getTpl_two_qq())) {
                            com.join.mgps.Util.b0.f0(this.S).b0(this.S, this.f33228p1.getGame_detailed().getTpl_two_qq_key(), this.f33228p1.getGame_detailed().getAd_pic_qq(), this.f33228p1.getGame_detailed().getTpl_two_qq());
                        }
                        if (UtilsMy.y0(this.f33228p1.getPay_tag_info(), this.f33228p1.getCrc_sign_id()) > 0) {
                            ExtBean extBean3 = this.f33202d;
                            if (extBean3 != null && "checkgame".equals(extBean3.getFrom())) {
                                UtilsMy.e4(this.S, this.f33200c, this.f33202d.getFrom_id());
                            } else {
                                if (!UtilsMy.o1(this.S, this.f33205e2)) {
                                    if (this.f33228p1.getDown_status() == 5) {
                                        UtilsMy.l1(this.S, this.f33205e2);
                                    } else {
                                        UtilsMy.d4(this.S, this.f33200c);
                                    }
                                }
                                onDetailDownload();
                            }
                        } else {
                            UtilsMy.C1(this.f33205e2, this.f33228p1);
                            if (!UtilsMy.o1(this.S, this.f33205e2)) {
                                if (this.f33228p1.getDown_status() == 5) {
                                    UtilsMy.l1(this.S, this.f33205e2);
                                } else {
                                    UtilsMy.R0(this.S, this.f33205e2, this.f33228p1.getTp_down_url(), this.f33228p1.getOther_down_switch(), this.f33228p1.getCdn_down_switch());
                                }
                            }
                        }
                    }
                } else if (48 != status) {
                    downloadTask4.setKeyword(Where.detail.name());
                    if (this.f33228p1 != null) {
                        addFrom(this.f33205e2);
                        if (this.f33228p1.getGame_detailed() != null && com.join.mgps.Util.g2.i(this.f33228p1.getGame_detailed().getTpl_two_qq())) {
                            com.join.mgps.Util.b0.f0(this.S).b0(this.S, this.f33228p1.getGame_detailed().getTpl_two_qq_key(), this.f33228p1.getGame_detailed().getAd_pic_qq(), this.f33228p1.getGame_detailed().getTpl_two_qq());
                        }
                        if (UtilsMy.y0(this.f33228p1.getPay_tag_info(), this.f33228p1.getCrc_sign_id()) > 0) {
                            ExtBean extBean4 = this.f33202d;
                            if (extBean4 != null && "checkgame".equals(extBean4.getFrom())) {
                                UtilsMy.e4(this.S, this.f33200c, this.f33202d.getFrom_id());
                            } else {
                                if (!UtilsMy.o1(this.S, this.f33205e2)) {
                                    if (this.f33228p1.getDown_status() == 5) {
                                        UtilsMy.l1(this.S, this.f33205e2);
                                    } else {
                                        UtilsMy.d4(this.S, this.f33200c);
                                    }
                                }
                                onDetailDownload();
                            }
                        } else {
                            UtilsMy.C1(this.f33205e2, this.f33228p1);
                            if (!UtilsMy.o1(this.S, this.f33205e2)) {
                                if (this.f33228p1.getDown_status() == 5) {
                                    UtilsMy.l1(this.S, this.f33205e2);
                                } else {
                                    UtilsMy.R0(this.S, this.f33205e2, this.f33228p1.getTp_down_url(), this.f33228p1.getOther_down_switch(), this.f33228p1.getCdn_down_switch());
                                }
                            }
                        }
                    }
                }
            }
            updateButn();
            return;
        }
        DownloadTask downloadTask8 = this.f33205e2;
        if (downloadTask8 != null) {
            String ext = downloadTask8.getExt();
            if (com.join.mgps.Util.g2.i(ext) && (extBean = (ExtBean) JsonMapper.getInstance().fromJson(ext, ExtBean.class)) != null) {
                String recPosition = extBean.getRecPosition();
                if (com.join.mgps.Util.g2.i(recPosition) && com.join.mgps.Util.g2.i(extBean.getVolcanoOther())) {
                    A0(recPosition, this.f33200c, (StatFactory.VolcanoOther) JsonMapper.getInstance().fromJson(extBean.getVolcanoOther(), StatFactory.VolcanoOther.class), UtilsMy.k2(this.f33205e2.getTipBeans()));
                }
            }
        }
        this.f33227p0.getRecPosition();
        this.f33227p0.setReMarks(this.f33202d.getReMarks());
        this.f33202d.setFrom("101");
        this.f33228p1.setExt(JsonMapper.getInstance().toJson(this.f33202d));
        UtilsMy.b1(this.S, this.f33228p1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void iv_back() {
        this.S.clickBack();
        q0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void j0() {
        IntentUtil.getInstance().goMyGameManagerActivity(this.S);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void k0() {
        IntentUtil.getInstance().goMyGameManagerActivity(this.S);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void l0() {
        if (AccountUtil_.getInstance_(this.S).isTourist()) {
            ((LoginSplashActivity_.IntentBuilder_) LoginSplashActivity_.intent(this.S).flags(268435456)).start();
            return;
        }
        v0();
        n0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void m0() {
        GamedetialModleFourBean data;
        if (com.join.android.app.common.utils.j.j(this.S)) {
            try {
                com.wufan.user.service.protobuf.n0 accountData = AccountUtil_.getInstance_(this.S).getAccountData();
                if (accountData == null) {
                    accountData = com.wufan.user.service.protobuf.n0.b5();
                }
                RequestModel requestModel = new RequestModel();
                requestModel.setDefault(this.S);
                requestModel.setArgs(new RequestGameIdArgs(this.f33200c, 1, accountData.getUid()));
                ResponseModel<GamedetialModleFourBean> body = com.join.mgps.rpc.impl.i.D0().B0().B1(requestModel.makeSign()).execute().body();
                if (body != null && body.getCode() == 200 && (data = body.getData()) != null) {
                    R0(data);
                    return;
                } else {
                    showLodingFailed();
                    return;
                }
            } catch (Exception e5) {
                e5.printStackTrace();
                showLodingFailed();
                return;
            }
        }
        showLodingFailed();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void n0() {
        try {
            if (com.join.android.app.common.utils.j.j(this.S)) {
                if (IntentUtil.getInstance().goLoginInteractive(this.S)) {
                    return;
                }
                this.U = "";
                com.wufan.user.service.protobuf.n0 accountData = AccountUtil_.getInstance_(this.S).getAccountData();
                LinkedMultiValueMap linkedMultiValueMap = new LinkedMultiValueMap();
                linkedMultiValueMap.add("uid", Integer.valueOf(accountData.getUid()));
                linkedMultiValueMap.add("token", accountData.getToken());
                linkedMultiValueMap.add("current_game_id", this.f33200c);
                int i4 = this.N1;
                this.N1 = i4 + 1;
                linkedMultiValueMap.add("page", Integer.valueOf(i4));
                linkedMultiValueMap.add("device_id", this.U);
                linkedMultiValueMap.add("version ", this.V);
                GameFromPopoWinBean O = this.K1.O(linkedMultiValueMap);
                if (O != null && O.getError() == 0 && O.getData() != null) {
                    N0();
                    if (this.N1 == 2) {
                        i0();
                    }
                    f0(O);
                    return;
                } else if (O != null && O.getError() == 701) {
                    IntentUtil.getInstance().goMyAccountLoginActivity(this.S);
                    F0("Token已失效，请重新登录");
                    IntentUtil.getInstance().goLogin(this.S);
                    t0();
                    return;
                } else {
                    K0();
                    return;
                }
            }
            showToast("网络出错，请稍后重试");
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    @Override // com.join.mgps.activity.gamedetail.BaseGameDetailFragment
    public boolean onBackPressedMy() {
        return com.join.android.app.component.video.a.c0(this.S, this.X);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        if (!this.Y) {
            StandardVideoView standardVideoView = this.f33210h;
            if (standardVideoView != null) {
                standardVideoView.release();
            }
            com.join.android.app.component.video.a.n0(this.X);
        }
        com.join.mgps.Util.d0.a().e(this);
    }

    void onDetailDownload() {
        ExtBean extBean = this.f33202d;
        if (extBean == null || TextUtils.isEmpty(extBean.getFrom()) || !this.f33202d.getFrom().equals("downloadCenter")) {
            return;
        }
        MobclickAgent.onEvent(this.S, "detailDownload4.2.0.6");
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    void onDownloadSpeed(com.join.mgps.event.m mVar) {
        if (mVar == null || TextUtils.isEmpty(mVar.a())) {
            return;
        }
        ProgressBar progressBar = this.f33243z;
        if (progressBar instanceof DownloadProgressBar) {
            ((DownloadProgressBar) progressBar).update(mVar.a(), 1);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x009a, code lost:
        if (r6 != 48) goto L57;
     */
    @org.greenrobot.eventbus.Subscribe(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onEventMainThread(com.join.mgps.event.n r6) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.mgps.activity.GamedetialModleFourFragemnt.onEventMainThread(com.join.mgps.event.n):void");
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        StandardVideoView standardVideoView;
        StandardVideoView standardVideoView2;
        super.onPause();
        this.f33231q2 = true;
        try {
            boolean z4 = this.Y;
            if (!z4 && (standardVideoView2 = this.f33210h) != null) {
                standardVideoView2.onVideoPause();
            } else if (z4 && (standardVideoView = this.f33210h) != null && !this.R1) {
                standardVideoView.onVideoPause();
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        GamedetialModleFourBean gamedetialModleFourBean;
        List<DownloadTask> H;
        boolean z4;
        StandardVideoView standardVideoView;
        super.onResume();
        this.f33231q2 = false;
        this.f33223n2 = AccountUtil_.getInstance_(this.S).getAccountData();
        if (v2) {
            this.N1 = 1;
            v2 = false;
            n0();
        }
        if (this.f33232r.getVisibility() == 4 && (standardVideoView = this.f33210h) != null) {
            standardVideoView.onVideoResume(false);
        }
        h0();
        GamedetialModleFourBean gamedetialModleFourBean2 = this.f33228p1;
        if (gamedetialModleFourBean2 != null) {
            if (gamedetialModleFourBean2.getMod_info() != null) {
                H = p1.f.K().G(this.f33228p1.getMod_info().getMod_game_id(), this.f33228p1.getMod_info().getMain_game_id());
            } else {
                H = p1.f.K().H(this.f33228p1.getPackageName());
            }
            if (H != null && H.size() > 0) {
                boolean z5 = false;
                loop0: while (true) {
                    z4 = false;
                    for (DownloadTask downloadTask : H) {
                        if (Dtype.MOD.name().equals(downloadTask.getFileType())) {
                            z5 = com.join.mgps.va.overmind.d.o().F(downloadTask.getPackageName()) && downloadTask.getStatus() == 5;
                        } else if (com.join.android.app.common.utils.e.l0(getContext()).d(getContext(), downloadTask.getPackageName()) && downloadTask.getStatus() == 5) {
                            z4 = true;
                        }
                    }
                    break loop0;
                }
                if (z5 && z4) {
                    r1 = p1.f.K().F(this.f33200c);
                } else if (z5) {
                    if (this.f33228p1.getMod_info() != null) {
                        r1 = p1.f.K().F(this.f33228p1.getMod_info().getMod_game_id());
                    }
                } else if (z4) {
                    r1 = p1.f.K().F(this.f33200c);
                } else {
                    r1 = this.f33228p1.getMod_info() != null ? p1.f.K().F(this.f33228p1.getMod_info().getMod_game_id()) : null;
                    if (r1 == null) {
                        r1 = p1.f.K().F(this.f33200c);
                    }
                }
            }
        }
        if (r1 == null && (gamedetialModleFourBean = this.f33228p1) != null) {
            this.f33205e2 = gamedetialModleFourBean.getDownloadtaskDown();
        }
        if (r1 == null || this.f33205e2 == null) {
            return;
        }
        try {
            this.f33205e2 = r1;
            if (r1.getFileType().equals(Dtype.android.name()) && this.f33205e2.getStatus() == 5) {
                if (this.f33228p1.getMod_info() == null) {
                    com.join.android.app.common.utils.e l02 = com.join.android.app.common.utils.e.l0(this.S);
                    GamedetailVideoMainActivity gamedetailVideoMainActivity = this.S;
                    String packageName = this.f33205e2.getPackageName();
                    APKUtils.DEVICE_TYPE device_type = APKUtils.DEVICE_TYPE.ALL;
                    if (Boolean.valueOf(l02.e(gamedetailVideoMainActivity, packageName, device_type)).booleanValue()) {
                        APKUtils.a m4 = com.join.android.app.common.utils.e.l0(this.S).m(this.S, this.f33205e2.getPackageName(), device_type);
                        if (com.join.mgps.Util.g2.i(this.f33205e2.getVer()) && m4.d() < Integer.parseInt(this.f33205e2.getVer())) {
                            this.f33205e2.setStatus(9);
                        } else {
                            this.f33205e2.setStatus(5);
                        }
                    } else {
                        this.f33205e2.setStatus(0);
                    }
                }
            } else {
                this.f33205e2.setStatus(r1.getStatus());
            }
            updateButn();
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    @Override // com.join.mgps.activity.gamedetail.BaseGameDetailFragment
    public void pauseVideo() {
        this.f33231q2 = true;
        StandardVideoView standardVideoView = this.f33210h;
        if (standardVideoView != null) {
            standardVideoView.onVideoPause();
        }
    }

    @Override // com.join.mgps.activity.gamedetail.BaseGameDetailFragment
    public void playVideo() {
        StandardVideoView standardVideoView = this.f33210h;
        if (standardVideoView != null) {
            this.S.autoPlayVideo(standardVideoView);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void progress_layout() {
        DownloadTask downloadTask = this.f33205e2;
        if (downloadTask == null) {
            return;
        }
        if (downloadTask.getStatus() == 2) {
            updateButn();
            com.php25.PDownload.d.i(this.f33205e2);
        } else if (this.f33205e2.getStatus() == 3 || this.f33205e2.getStatus() == 6) {
            updateButn();
            com.php25.PDownload.d.c(this.f33205e2, this.S);
            onDetailDownload();
        }
    }

    void q0() {
        ExtBean extBean = this.f33202d;
        if (extBean == null || TextUtils.isEmpty(extBean.getFrom()) || !this.f33202d.getFrom().equals("updateFromMarket")) {
            return;
        }
        IntentUtil.getInstance().goMGMainActivity2Front(this.S);
    }

    boolean r0() {
        GamedetialModleFourBean gamedetialModleFourBean = this.f33227p0;
        return (gamedetialModleFourBean == null || gamedetialModleFourBean.getGame_screen_shot() == null || this.f33227p0.getGame_screen_shot().size() <= 0) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void relodingimag() {
        showLoding();
        m0();
    }

    @Override // com.join.mgps.activity.gamedetail.BaseGameDetailFragment
    public void resumVideo() {
        this.f33231q2 = false;
        StandardVideoView standardVideoView = this.f33210h;
        if (standardVideoView != null) {
            if (standardVideoView.d()) {
                this.f33210h.startPlayLogic();
            } else if (this.f33232r.getVisibility() == 4) {
                this.f33210h.onVideoResume(false);
            }
        }
    }

    boolean s0() {
        return com.join.mgps.Util.g2.i(this.f33227p0.getGame_info_top_video_url()) || com.join.mgps.Util.g2.i(this.f33227p0.getGame_info_top_pic());
    }

    @Override // com.join.mgps.activity.gamedetail.BaseGameDetailFragment
    @UiThread
    public void setCommentNumber(String str) {
        try {
            TextView j4 = this.f33214j.j(1);
            j4.setWidth(getResources().getDimensionPixelOffset(R.dimen.wdp220));
            j4.setText("点评(" + str + ")");
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void setNetwork() {
        UtilsMy.w3(this.S);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showInstallButn() {
        GamedetialModleFourBean gamedetialModleFourBean = this.f33228p1;
        if (gamedetialModleFourBean == null || TextUtils.isEmpty(gamedetialModleFourBean.getCrc_sign_id())) {
            return;
        }
        try {
            this.f33238v.setVisibility(8);
            this.f33240w.setVisibility(0);
            this.f33237u.setVisibility(0);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showLoding() {
        try {
            this.J.setVisibility(0);
            this.K.setVisibility(8);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0035 -> B:18:0x003d). Please submit an issue!!! */
    @UiThread
    public void showLodingFailed() {
        try {
            this.J.setVisibility(8);
            try {
                GamedetialModleFourBean gamedetialModleFourBean = this.f33228p1;
                if (gamedetialModleFourBean == null || com.join.mgps.Util.g2.h(gamedetialModleFourBean.getCrc_sign_id())) {
                    this.K.setVisibility(0);
                    this.L.setVisibility(0);
                    if (com.join.android.app.common.utils.j.j(this.S)) {
                        this.M.setVisibility(8);
                    } else {
                        this.M.setVisibility(0);
                    }
                }
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        } catch (Exception e6) {
            e6.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showProgress() {
        try {
            this.f33240w.setVisibility(8);
            this.f33237u.setVisibility(8);
            this.f33238v.setVisibility(0);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showToast(String str) {
        Toast.makeText(this.S, str, 0).show();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void t0() {
        PopupWindow popupWindow = this.f33239v1;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
    }

    void u0() {
        this.f33222n.setAdapter(this.f33235s2);
        this.f33218l.setViewPager(this.f33222n);
        if (MViewpagerV4.class.isInstance(this.f33222n)) {
            ((MViewpagerV4) this.f33222n).setIntercept(false);
        }
        this.f33218l.setOnPageChangeListener(new h());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void updateButn() {
        GamedetialModleFourBean gamedetialModleFourBean = this.f33228p1;
        if (gamedetialModleFourBean == null || this.f33205e2 == null) {
            return;
        }
        if (gamedetialModleFourBean.getDel_tag() == 1 && !this.f33228p1.getCompany_name().equals("SNK")) {
            this.f33237u.setEnabled(false);
            this.f33237u.setBackgroundResource(R.drawable.detial_simple_grey_selecter);
            this.f33237u.setText("已下架");
            showInstallButn();
        } else if (this.f33240w == null) {
        } else {
            UtilsMy.j3(this.f33228p1.getSp_tag_info(), this.f33240w, this.f33205e2);
            if (this.f33228p1.getPlugin_num() != null) {
                String plugin_num = this.f33228p1.getPlugin_num();
                if (plugin_num.equals(ConstantIntEnum.H5.value() + "")) {
                    this.f33237u.setBackgroundResource(R.drawable.detial_simple_normal_selecter);
                    this.f33237u.setText("开始");
                    showInstallButn();
                    return;
                }
            }
            this.f33237u.setBackgroundResource(R.drawable.detial_simple_normal_selecter);
            DownloadTask downloadTask = this.f33205e2;
            int status = downloadTask != null ? downloadTask.getStatus() : 0;
            if (UtilsMy.w0(this.f33228p1.getPay_tag_info(), this.f33228p1.getCrc_sign_id()) > 0) {
                status = 43;
            }
            if (status == 9) {
                showInstallButn();
                this.f33237u.setText("更新");
                this.f33241x.setImageResource(R.drawable.detail_comment_download_continue);
                this.f33241x.setImageResource(R.drawable.detial_simple_install_selecter);
            } else if (status == 12) {
                showInstallButn();
                this.f33237u.setText("解压中..");
            } else if (status == 13) {
                showInstallButn();
                this.f33237u.setText("解压");
                this.f33241x.setImageResource(R.drawable.detail_comment_download_continue);
            } else if (status == 11) {
                showInstallButn();
                this.f33237u.setText("安装");
                this.f33237u.setBackgroundResource(R.drawable.detial_simple_install_selecter);
                this.f33241x.setImageResource(R.drawable.detial_simple_install_selecter);
            } else if (status == 5 || status == 42) {
                showInstallButn();
                P0(true);
                this.f33237u.setBackgroundResource(R.drawable.detial_simple_open_selecter);
                this.f33237u.setText(this.S.getResources().getString(R.string.download_status_finished));
                this.f33241x.setImageResource(R.drawable.detail_comment_download_continue);
            } else if (status == 2) {
                showProgress();
                this.f33241x.setImageResource(R.drawable.detail_comment_download_pause);
                UtilsMy.x4(this.f33205e2);
                this.f33243z.setProgress((int) this.f33205e2.getProgress());
                TextView textView = this.f33242y;
                textView.setText(this.f33205e2.getProgress() + "%");
            } else if (status == 3 || status == 6 || status == 27) {
                showProgress();
                this.f33241x.setImageResource(R.drawable.detail_comment_download_continue);
                UtilsMy.x4(this.f33205e2);
                this.f33243z.setProgress((int) this.f33205e2.getProgress());
                TextView textView2 = this.f33242y;
                textView2.setText(this.f33205e2.getProgress() + "%");
            } else if (status == 10) {
                showInstallButn();
                TextView textView3 = this.f33237u;
                textView3.setText("等待\u3000" + this.f33228p1.getSize() + "M");
                this.f33241x.setImageResource(R.drawable.detail_comment_download_continue);
            } else if (status == 1) {
            } else {
                if (status == 43) {
                    showInstallButn();
                    if (UtilsMy.w0(this.f33228p1.getPay_tag_info(), this.f33228p1.getCrc_sign_id()) > 0) {
                        this.f33237u.setText(this.S.getResources().getString(R.string.pay_game_amount, this.f33228p1.getPay_tag_info().getPayGameAmount()));
                    } else {
                        this.f33237u.setText(this.S.getResources().getString(R.string.download_status_download));
                    }
                    this.f33241x.setImageResource(R.drawable.detail_comment_download_continue);
                    GamedetialModleFourBean gamedetialModleFourBean2 = this.f33228p1;
                    if (gamedetialModleFourBean2 != null) {
                        if (gamedetialModleFourBean2.getBespeak_switch() == 1 && this.f33228p1.getDown_status() == 2) {
                            if (this.f33228p1.getGame_book() == 1) {
                                this.f33237u.setText("已预约");
                                UtilsMy.w0(this.f33228p1.getPay_tag_info(), this.f33228p1.getCrc_sign_id());
                                UtilsMy.n3(this.f33237u, this.f33228p1);
                                return;
                            }
                            this.f33237u.setText("预约");
                            return;
                        }
                        UtilsMy.w0(this.f33228p1.getPay_tag_info(), this.f33228p1.getCrc_sign_id());
                        UtilsMy.n3(this.f33237u, this.f33228p1);
                    }
                } else if (status == 48) {
                    showInstallButn();
                    this.f33237u.setText(this.S.getResources().getString(R.string.download_status_installing));
                } else {
                    showInstallButn();
                    if (UtilsMy.w0(this.f33228p1.getPay_tag_info(), this.f33228p1.getCrc_sign_id()) > 0) {
                        this.f33237u.setText(this.S.getResources().getString(R.string.pay_game_amount, this.f33228p1.getPay_tag_info().getPayGameAmount()));
                    } else {
                        this.f33237u.setText(this.S.getResources().getString(R.string.download_status_download));
                    }
                    this.f33241x.setImageResource(R.drawable.detail_comment_download_continue);
                    GamedetialModleFourBean gamedetialModleFourBean3 = this.f33228p1;
                    if (gamedetialModleFourBean3 != null) {
                        if (gamedetialModleFourBean3.getBespeak_switch() == 1 && (this.f33228p1.getDown_status() == 2 || this.f33228p1.getDown_status() == 6)) {
                            if (this.f33228p1.getGame_book() == 1) {
                                this.f33237u.setText("已预约");
                                UtilsMy.w0(this.f33228p1.getPay_tag_info(), this.f33228p1.getCrc_sign_id());
                                UtilsMy.n3(this.f33237u, this.f33228p1);
                                return;
                            }
                            this.f33237u.setText("预约");
                            return;
                        }
                        UtilsMy.w0(this.f33228p1.getPay_tag_info(), this.f33228p1.getCrc_sign_id());
                        UtilsMy.n3(this.f33237u, this.f33228p1);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void updateDownloadView() {
        try {
            int S = p1.f.K().S();
            this.D.setDownloadGameNum(S);
            if (S > 0) {
                this.D.d();
            } else {
                this.D.g();
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    void updateProgress(DownloadTask downloadTask) {
        if (downloadTask == null) {
            return;
        }
        ProgressBar progressBar = this.f33243z;
        if (progressBar instanceof DownloadProgressBar) {
            ((DownloadProgressBar) progressBar).update(downloadTask.getCrc_link_type_val(), 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void updateTitleButn(ResultMainBean resultMainBean, int i4) {
        if (resultMainBean.getFlag() == 1) {
            if (i4 == 1) {
                this.f33228p1.setGame_follow(0);
            } else if (i4 == 2) {
                this.f33228p1.setGame_follow(1);
                com.join.mgps.Util.l2.a(this.S).b("收藏成功");
                this.E.setImageResource(R.drawable.followed_image);
                this.F.setText("已收藏");
            } else if (i4 == 3) {
                this.f33228p1.setGame_book(0);
            } else if (i4 == 4) {
                this.f33228p1.setGame_book(1);
                Intent intent = new Intent("com.broadcast.bespeak.sussess");
                intent.putExtra("gameid", this.f33228p1.getCrc_sign_id());
                this.S.sendBroadcast(intent);
                com.join.mgps.Util.b0.f0(this.S).O(this.S, 1, new g()).show();
            }
            z0();
            updateButn();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void v0() {
        View inflate = LayoutInflater.from(this.S).inflate(R.layout.popo_item, (ViewGroup) null);
        B0(0.4f);
        PopupWindow popupWindow = new PopupWindow(inflate, -1, -1, true);
        this.f33239v1 = popupWindow;
        popupWindow.setTouchable(true);
        this.f33239v1.setOutsideTouchable(true);
        this.f33239v1.setFocusable(true);
        this.f33239v1.setBackgroundDrawable(new ColorDrawable());
        this.f33239v1.setSoftInputMode(16);
        this.f33239v1.setOnDismissListener(new j());
        XListView2 xListView2 = (XListView2) inflate.findViewById(R.id.listview);
        this.H1 = xListView2;
        xListView2.setPullRefreshEnable(new k());
        this.H1.setPullLoadEnable(new l());
        this.F1 = (TextView) inflate.findViewById(R.id.tv_show_tips);
        this.C1 = (LinearLayout) inflate.findViewById(R.id.ll_our);
        this.A1 = (LinearLayout) inflate.findViewById(R.id.ll_show_finish);
        this.B1 = (LinearLayout) inflate.findViewById(R.id.ll_dismiss);
        this.D1 = (EditText) inflate.findViewById(R.id.game_ed);
        this.E1 = (TextView) inflate.findViewById(R.id.tv_finish);
        this.G1 = (LinearLayout) inflate.findViewById(R.id.ll_build);
        this.B1.setOnClickListener(new m());
        this.G1.setOnClickListener(new n());
        this.E1.setOnClickListener(new o());
        u uVar = new u();
        this.I1 = uVar;
        this.H1.setAdapter((ListAdapter) uVar);
        this.f33239v1.showAtLocation(LayoutInflater.from(this.S).inflate(R.layout.gamedetial_modle_three_activity, (ViewGroup) null), 81, 0, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void x0() {
        this.S.clickBack();
    }

    public void y0(GamedetialModleFourBean gamedetialModleFourBean) {
        try {
            this.f33233r2.clear();
            if (s0()) {
                View inflate = LayoutInflater.from(this.S).inflate(R.layout.gamedetail_item_video, (ViewGroup) this.f33222n, false);
                this.f33206f = (RelativeLayout) inflate.findViewById(R.id.videolayout);
                this.f33208g = inflate.findViewById(R.id.nullView);
                this.f33210h = (StandardVideoView) inflate.findViewById(R.id.videoPlayer);
                this.f33212i = (SimpleDraweeView) inflate.findViewById(R.id.iv_book_bg);
                ((RelativeLayout.LayoutParams) this.f33210h.getLayoutParams()).height = -1;
                ((RelativeLayout.LayoutParams) this.f33212i.getLayoutParams()).height = -1;
                w0();
                this.f33233r2.add(inflate);
            } else {
                this.T.n(R.color.black_30_alpha);
                this.Q.setVisibility(0);
            }
            if (!s0()) {
                this.f33222n.setVisibility(4);
                if (this.f33208g == null) {
                    this.f33208g = new View(this.S);
                }
                this.f33222n.getLayoutParams().height = getResources().getDimensionPixelOffset(R.dimen.wdp100);
                this.f33208g.setVisibility(0);
            }
            this.f33220m.setVisibility(8);
            this.f33218l.setVisibility(8);
            this.f33220m.setVisibility(8);
            this.f33218l.postInvalidate();
            this.f33235s2.notifyDataSetChanged();
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }
}
