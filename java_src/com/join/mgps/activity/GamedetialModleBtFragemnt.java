package com.join.mgps.activity;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.MApplication;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.facebook.drawee.drawable.r;
import com.facebook.drawee.view.SimpleDraweeView;
import com.flipboard.bottomsheet.BottomSheetLayout;
import com.flyco.tablayout.SlidingTabLayout;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.google.android.material.appbar.AppBarLayout;
import com.join.android.app.common.utils.APKUtils;
import com.join.android.app.common.utils.JsonMapper;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.component.video.StandardVideoView;
import com.join.android.app.mgsim.wufun.R;
import com.join.kotlin.domain.widget.CornersLinearLayout;
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
import com.join.mgps.customview.CoordinatorLayout;
import com.join.mgps.customview.CustomerDownloadView;
import com.join.mgps.customview.DownloadProgressBar;
import com.join.mgps.customview.FlowLayout;
import com.join.mgps.customview.MStarBar;
import com.join.mgps.customview.MViewpagerV4;
import com.join.mgps.customview.SlidingTabLayoutGameDetailImage;
import com.join.mgps.customview.XListView2;
import com.join.mgps.dialog.DownloadMethodMultiDialog_;
import com.join.mgps.dto.CommentAlllistIntentData;
import com.join.mgps.dto.CommonRequestBean;
import com.join.mgps.dto.DetialShowImageBean;
import com.join.mgps.dto.DomainInfoBean;
import com.join.mgps.dto.ExtBean;
import com.join.mgps.dto.GameFromBooleanBean;
import com.join.mgps.dto.GameFromPopoWinBean;
import com.join.mgps.dto.GamePromptBean;
import com.join.mgps.dto.GameScore;
import com.join.mgps.dto.GamedetialModleFourBean;
import com.join.mgps.dto.GamedetialMoreBean;
import com.join.mgps.dto.QueryDownloadInfoRequestArgs;
import com.join.mgps.dto.QueryDownloadInfoResponseData;
import com.join.mgps.dto.RequestGameIdArgs;
import com.join.mgps.dto.RequestModel;
import com.join.mgps.dto.RequestdetialFolowAndBeSpeak;
import com.join.mgps.dto.ResponseModel;
import com.join.mgps.dto.ResultMainBean;
import com.join.mgps.dto.ServiceState;
import com.join.mgps.dto.ShareBean;
import com.join.mgps.enums.ConstantIntEnum;
import com.join.mgps.enums.Dtype;
import com.join.mgps.fragment.CommentAllListFragment;
import com.join.mgps.fragment.GameFormFragment;
import com.join.mgps.pref.PrefDef_;
import com.join.mgps.ptr.PtrClassicFrameLayout;
import com.papa.sim.statistic.Where;
import com.papa91.arc.ext.ToastManager;
import com.psk.eventmodule.Event;
import com.psk.eventmodule.StatFactory;
import com.uc.crashsdk.export.LogType;
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
import org.androidannotations.annotations.sharedpreferences.Pref;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.springframework.util.LinkedMultiValueMap;
@EFragment(R.layout.gamedetial_modle_bt_fragment)
/* loaded from: classes.dex */
public class GamedetialModleBtFragemnt extends BaseGameDetailFragment implements w1.i {
    static String G2 = "0";
    static String H2 = "";
    static boolean I2 = false;
    private static final String J2 = "view";
    @ViewById
    ImageView A;
    private com.join.android.app.common.manager.b A1;
    com.wufan.user.service.protobuf.n0 A2;
    @ViewById
    ImageView B;
    String B1;
    @ViewById(R.id.title_normal_download_cdv)
    CustomerDownloadView C;
    String C1;
    @ViewById
    ImageView D;
    @ViewById
    TextView E;
    @ViewById
    TextView F;
    boolean F1;
    @ViewById
    CoordinatorLayout G;
    int G1;
    @ViewById
    View H;
    int H1;
    @ViewById
    View I;
    private int I1;
    @ViewById
    View J;
    private GamedetialModleFourBean J1;
    @ViewById
    View K;
    private GamedetialModleFourBean K1;
    @ViewById
    LinearLayout L;
    PopupWindow L1;
    @ViewById
    LinearLayout M;
    LinearLayout M1;
    @ViewById
    View N;
    LinearLayout N1;
    @ViewById
    View O;
    LinearLayout O1;
    @ViewById
    BottomSheetLayout P;
    EditText P1;
    @ViewById
    View Q;
    TextView Q1;
    @ViewById
    LinearLayout R;
    TextView R1;
    @ViewById
    TextView S;
    LinearLayout S1;
    @ViewById
    CornersLinearLayout T;
    public XListView2 T1;
    @ViewById
    RelativeLayout U;
    a0 U1;
    @ViewById
    RelativeLayout V;
    com.join.mgps.rpc.b V1;
    @ViewById
    RelativeLayout W;
    com.join.mgps.rpc.b W1;
    @ViewById
    ImageView X;
    GameFromPopoWinBean X1;
    @ViewById
    RelativeLayout Y;
    PtrClassicFrameLayout Y1;
    @Pref
    PrefDef_ Z;

    /* renamed from: c  reason: collision with root package name */
    String f32851c;

    /* renamed from: d  reason: collision with root package name */
    ExtBean f32853d;

    /* renamed from: e  reason: collision with root package name */
    boolean f32855e;

    /* renamed from: e2  reason: collision with root package name */
    public SimpleDraweeView f32856e2;
    @ViewById

    /* renamed from: f  reason: collision with root package name */
    RelativeLayout f32857f;

    /* renamed from: f2  reason: collision with root package name */
    public TextView f32858f2;
    @ViewById

    /* renamed from: g  reason: collision with root package name */
    View f32859g;

    /* renamed from: g2  reason: collision with root package name */
    public TextView f32860g2;
    @ViewById

    /* renamed from: h  reason: collision with root package name */
    StandardVideoView f32861h;

    /* renamed from: h2  reason: collision with root package name */
    public TextView f32862h2;
    @ViewById

    /* renamed from: i  reason: collision with root package name */
    SimpleDraweeView f32863i;

    /* renamed from: i2  reason: collision with root package name */
    public TextView f32864i2;
    @ViewById

    /* renamed from: j  reason: collision with root package name */
    SlidingTabLayout f32865j;

    /* renamed from: j2  reason: collision with root package name */
    public MStarBar f32866j2;
    @ViewById

    /* renamed from: k  reason: collision with root package name */
    ViewPager f32867k;

    /* renamed from: k2  reason: collision with root package name */
    public LinearLayout f32868k2;
    @ViewById

    /* renamed from: l  reason: collision with root package name */
    SlidingTabLayoutGameDetailImage f32869l;

    /* renamed from: l2  reason: collision with root package name */
    public LinearLayout f32870l2;
    @ViewById

    /* renamed from: m  reason: collision with root package name */
    View f32871m;

    /* renamed from: m2  reason: collision with root package name */
    public SimpleDraweeView f32872m2;
    @ViewById

    /* renamed from: n  reason: collision with root package name */
    ViewPager f32873n;

    /* renamed from: n2  reason: collision with root package name */
    public TextView f32874n2;
    @ViewById

    /* renamed from: o  reason: collision with root package name */
    View f32875o;

    /* renamed from: o2  reason: collision with root package name */
    private LinearLayout f32876o2;
    @ViewById

    /* renamed from: p  reason: collision with root package name */
    AppBarLayout f32877p;

    /* renamed from: p0  reason: collision with root package name */
    boolean f32878p0;

    /* renamed from: p1  reason: collision with root package name */
    com.join.mgps.rpc.e f32879p1;

    /* renamed from: p2  reason: collision with root package name */
    private TextView f32880p2;
    @ViewById

    /* renamed from: q  reason: collision with root package name */
    RelativeLayout f32881q;

    /* renamed from: q2  reason: collision with root package name */
    private TextView f32882q2;
    @ViewById

    /* renamed from: r  reason: collision with root package name */
    RelativeLayout f32883r;

    /* renamed from: r2  reason: collision with root package name */
    private DownloadTask f32884r2;
    @ViewById

    /* renamed from: s  reason: collision with root package name */
    RelativeLayout f32885s;
    @ViewById

    /* renamed from: s2  reason: collision with root package name */
    TextView f32886s2;
    @ViewById

    /* renamed from: t  reason: collision with root package name */
    TextView f32887t;
    @ViewById

    /* renamed from: t2  reason: collision with root package name */
    ImageView f32888t2;
    @ViewById

    /* renamed from: u  reason: collision with root package name */
    RelativeLayout f32889u;
    @ViewById

    /* renamed from: u2  reason: collision with root package name */
    ImageView f32890u2;
    @ViewById

    /* renamed from: v  reason: collision with root package name */
    ConstraintLayout f32891v;

    /* renamed from: v1  reason: collision with root package name */
    GamedetailVideoMainActivity f32892v1;
    @ViewById
    ImageView v2;
    @ViewById

    /* renamed from: w  reason: collision with root package name */
    ImageView f32893w;
    @ViewById

    /* renamed from: w2  reason: collision with root package name */
    ImageView f32894w2;
    @ViewById

    /* renamed from: x  reason: collision with root package name */
    TextView f32895x;

    /* renamed from: x2  reason: collision with root package name */
    private Animation f32896x2;
    @ViewById

    /* renamed from: y  reason: collision with root package name */
    ProgressBar f32897y;
    private int y2;
    @ViewById

    /* renamed from: z  reason: collision with root package name */
    LinearLayout f32898z;

    /* renamed from: z2  reason: collision with root package name */
    private int f32899z2;

    /* renamed from: b  reason: collision with root package name */
    private String f32849b = "GamedetialModleFiveFragemnt";
    int D1 = 0;
    String E1 = "";
    int Z1 = 1;

    /* renamed from: a2  reason: collision with root package name */
    List<GameFromPopoWinBean.DataBean> f32848a2 = new ArrayList();

    /* renamed from: b2  reason: collision with root package name */
    boolean f32850b2 = true;

    /* renamed from: c2  reason: collision with root package name */
    int f32852c2 = 0;

    /* renamed from: d2  reason: collision with root package name */
    boolean f32854d2 = false;
    Map<String, DownloadTask> B2 = new HashMap();
    Map<String, DownloadTask> C2 = new HashMap();
    boolean D2 = false;
    private List<View> E2 = new ArrayList();
    x F2 = new x();

    /* loaded from: classes4.dex */
    class a implements s2.e {
        a() {
        }

        @Override // s2.e
        public void a(Bitmap bitmap) {
            com.join.android.app.component.video.h.e(bitmap);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a0 extends BaseAdapter {

        /* loaded from: classes4.dex */
        class a implements View.OnClickListener {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ int f32902b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ b0 f32903c;

            a(int i4, b0 b0Var) {
                this.f32902b = i4;
                this.f32903c = b0Var;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (GamedetialModleBtFragemnt.this.f32848a2.get(this.f32902b).getCurrent_game_state().equals("0")) {
                    this.f32903c.f32907b.setBackgroundResource(R.drawable.followed_image);
                    GamedetialModleBtFragemnt.this.M1.setVisibility(0);
                    GamedetialModleBtFragemnt.this.T1.setVisibility(8);
                    GamedetialModleBtFragemnt.this.Q1.setVisibility(0);
                    GamedetialModleBtFragemnt.this.R1.setText("收藏成功");
                    GamedetialModleBtFragemnt.this.S1.setVisibility(8);
                    GamedetialModleBtFragemnt.G2 = GamedetialModleBtFragemnt.this.f32848a2.get(this.f32902b).getId();
                    GamedetialModleBtFragemnt gamedetialModleBtFragemnt = GamedetialModleBtFragemnt.this;
                    gamedetialModleBtFragemnt.f32850b2 = false;
                    int i4 = gamedetialModleBtFragemnt.D1 + 1;
                    gamedetialModleBtFragemnt.D1 = i4;
                    if (i4 > 0) {
                        gamedetialModleBtFragemnt.D.setImageResource(R.drawable.followed_image);
                        GamedetialModleBtFragemnt.this.E.setText("已收藏");
                        return;
                    }
                    return;
                }
                this.f32903c.f32907b.setBackgroundResource(R.drawable.follow_none_image);
                GamedetialModleBtFragemnt.this.f32848a2.get(this.f32902b).setCurrent_game_state("0");
                GamedetialModleBtFragemnt gamedetialModleBtFragemnt2 = GamedetialModleBtFragemnt.this;
                gamedetialModleBtFragemnt2.d0(gamedetialModleBtFragemnt2.f32848a2.get(this.f32902b).getId(), GamedetialModleBtFragemnt.this.f32851c, this.f32903c);
                GamedetialModleBtFragemnt gamedetialModleBtFragemnt3 = GamedetialModleBtFragemnt.this;
                int i5 = gamedetialModleBtFragemnt3.D1 - 1;
                gamedetialModleBtFragemnt3.D1 = i5;
                gamedetialModleBtFragemnt3.D1 = i5;
                if (i5 == 0) {
                    gamedetialModleBtFragemnt3.D.setImageResource(R.drawable.follow_none_image);
                    GamedetialModleBtFragemnt.this.E.setText("收藏");
                }
            }
        }

        a0() {
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return GamedetialModleBtFragemnt.this.f32848a2.size();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i4) {
            return GamedetialModleBtFragemnt.this.f32848a2.get(i4);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i4) {
            return i4;
        }

        @Override // android.widget.Adapter
        public View getView(int i4, View view, ViewGroup viewGroup) {
            b0 b0Var;
            if (view == null) {
                view = LayoutInflater.from(GamedetialModleBtFragemnt.this.f32892v1).inflate(R.layout.list_item, (ViewGroup) null);
                b0Var = new b0();
                b0Var.f32906a = (SimpleDraweeView) view.findViewById(R.id.iv_img);
                b0Var.f32907b = (ImageView) view.findViewById(R.id.iv_coll);
                b0Var.f32908c = (TextView) view.findViewById(R.id.tv_title);
                b0Var.f32909d = (TextView) view.findViewById(R.id.tv_size);
                b0Var.f32911f = (RelativeLayout) view.findViewById(R.id.ll_gameform);
                b0Var.f32912g = (RelativeLayout) view.findViewById(R.id.rl_content);
                view.setTag(b0Var);
            } else {
                b0Var = (b0) view.getTag();
            }
            if (GamedetialModleBtFragemnt.this.f32848a2.get(i4).getGame_list().get(0).getGame_ico() != null && !GamedetialModleBtFragemnt.this.f32848a2.get(i4).getGame_list().get(0).getGame_ico().equals("")) {
                b0Var.f32906a.setImageURI(GamedetialModleBtFragemnt.this.f32848a2.get(i4).getGame_list().get(0).getGame_ico());
            } else {
                b0Var.f32906a.setImageResource(R.drawable.main_normal_icon);
            }
            b0Var.f32908c.setText(GamedetialModleBtFragemnt.this.f32848a2.get(i4).getTitle());
            b0Var.f32909d.setText(GamedetialModleBtFragemnt.this.f32848a2.get(i4).getGame_count() + "款");
            if (GamedetialModleBtFragemnt.this.f32848a2.get(i4).getCurrent_game_state().equals("0")) {
                b0Var.f32907b.setBackgroundResource(R.drawable.follow_none_image);
            } else {
                b0Var.f32907b.setBackgroundResource(R.drawable.followed_image);
                GamedetialModleBtFragemnt.this.D1++;
            }
            b0Var.f32912g.setOnClickListener(new a(i4, b0Var));
            return view;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GamedetialModleBtFragemnt.this.f32867k.setCurrentItem(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class b0 {

        /* renamed from: a  reason: collision with root package name */
        SimpleDraweeView f32906a;

        /* renamed from: b  reason: collision with root package name */
        ImageView f32907b;

        /* renamed from: c  reason: collision with root package name */
        TextView f32908c;

        /* renamed from: d  reason: collision with root package name */
        TextView f32909d;

        /* renamed from: e  reason: collision with root package name */
        TextView f32910e;

        /* renamed from: f  reason: collision with root package name */
        RelativeLayout f32911f;

        /* renamed from: g  reason: collision with root package name */
        RelativeLayout f32912g;

        b0() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GamedetialModleBtFragemnt.this.W0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class d implements View.OnClickListener {
        d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            PaPaBannerListActivity_.k0(GamedetialModleBtFragemnt.this.f32892v1).e(1).a(true).c(GamedetialModleBtFragemnt.this.J1.getGame_company_id()).d(GamedetialModleBtFragemnt.this.J1.getCompany_name()).start();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class e implements View.OnClickListener {
        e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GamedetialModleBtFragemnt.this.W0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class f implements View.OnClickListener {
        f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IntentUtil.getInstance().goShareWebActivity(GamedetialModleBtFragemnt.this.f32892v1, GamedetialModleBtFragemnt.this.K1.getActivity_entry().getUrl() + GamedetialModleBtFragemnt.this.K1.getCrc_sign_id());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class g implements Animation.AnimationListener {
        g() {
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
    public class h implements m1.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f32919a;

        h(boolean z4) {
            this.f32919a = z4;
        }

        @Override // com.join.mgps.Util.m1.b
        public void a(m1.c cVar) {
            if (cVar.a() == 1) {
                GamedetialModleBtFragemnt.this.f32892v1.clickBack();
                com.join.mgps.Util.m1 c5 = com.join.mgps.Util.m1.c();
                GamedetialModleBtFragemnt gamedetialModleBtFragemnt = GamedetialModleBtFragemnt.this;
                c5.e(gamedetialModleBtFragemnt.f32892v1, gamedetialModleBtFragemnt.f32853d.getFrom_id(), cVar.b());
                ToastManager.show("授权成功");
            } else if (this.f32919a) {
                GamedetialModleBtFragemnt.this.m1(false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class i implements w1.c {
        i() {
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
    public class j implements ViewPager.OnPageChangeListener {
        j() {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i4) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i4, float f5, int i5) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i4) {
            if (GamedetialModleBtFragemnt.this.A0() && i4 == 0) {
                GamedetialModleBtFragemnt gamedetialModleBtFragemnt = GamedetialModleBtFragemnt.this;
                gamedetialModleBtFragemnt.f32892v1.autoPlayVideo(gamedetialModleBtFragemnt.f32861h);
                return;
            }
            GamedetialModleBtFragemnt.this.pauseVideo();
        }
    }

    /* loaded from: classes4.dex */
    class k implements AppBarLayout.OnOffsetChangedListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f32923a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f32924b;

        k(View view, int i4) {
            this.f32923a = view;
            this.f32924b = i4;
        }

        @Override // com.google.android.material.appbar.AppBarLayout.OnOffsetChangedListener, com.google.android.material.appbar.AppBarLayout.BaseOnOffsetChangedListener
        public void onOffsetChanged(AppBarLayout appBarLayout, int i4) {
            int currentState;
            View view;
            try {
                int abs = Math.abs(i4);
                GamedetialModleBtFragemnt gamedetialModleBtFragemnt = GamedetialModleBtFragemnt.this;
                if (abs < gamedetialModleBtFragemnt.G1 - gamedetialModleBtFragemnt.H1 && ((view = gamedetialModleBtFragemnt.f32859g) == null || view.getVisibility() != 0)) {
                    GamedetialModleBtFragemnt.this.T.setConner_top_right(this.f32924b);
                    GamedetialModleBtFragemnt.this.T.setConner_top_left(this.f32924b);
                    GamedetialModleBtFragemnt.this.T.invalidate();
                    GamedetialModleBtFragemnt.this.f32883r.setVisibility(0);
                    GamedetialModleBtFragemnt.this.f32885s.setVisibility(0);
                    GamedetialModleBtFragemnt.this.f32881q.setVisibility(8);
                    GamedetialModleBtFragemnt.this.W.setBackgroundColor(0);
                    if (GamedetialModleBtFragemnt.this.A1 != null) {
                        GamedetialModleBtFragemnt.this.A1.n(R.color.black_alpha);
                    }
                    GamedetialModleBtFragemnt gamedetialModleBtFragemnt2 = GamedetialModleBtFragemnt.this;
                    StandardVideoView standardVideoView = gamedetialModleBtFragemnt2.f32861h;
                    if (standardVideoView != null && !gamedetialModleBtFragemnt2.D2 && standardVideoView.getCurrentState() == 5 && GamedetialModleBtFragemnt.this.f32861h.d()) {
                        GamedetialModleBtFragemnt.this.f32861h.onVideoResume(false);
                    }
                    this.f32923a.setVisibility(4);
                    return;
                }
                GamedetialModleBtFragemnt.this.T.setConner_top_right(0);
                GamedetialModleBtFragemnt.this.T.setConner_top_left(0);
                GamedetialModleBtFragemnt.this.T.invalidate();
                GamedetialModleBtFragemnt.this.f32881q.setVisibility(0);
                GamedetialModleBtFragemnt.this.f32883r.setVisibility(8);
                GamedetialModleBtFragemnt.this.f32885s.setVisibility(8);
                GamedetialModleBtFragemnt.this.W.setBackgroundColor(-1);
                StandardVideoView standardVideoView2 = GamedetialModleBtFragemnt.this.f32861h;
                if (standardVideoView2 != null && standardVideoView2.d() && (currentState = GamedetialModleBtFragemnt.this.f32861h.getCurrentState()) == 2) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("currentState=");
                    sb.append(currentState);
                    sb.append(" -->performClick");
                    GamedetialModleBtFragemnt.this.f32861h.onVideoPause();
                }
                if (GamedetialModleBtFragemnt.this.A1 != null) {
                    GamedetialModleBtFragemnt.this.A1.n(R.color.black_30_alpha);
                }
                this.f32923a.setVisibility(0);
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class l implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ RelativeLayout.LayoutParams f32926b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ RelativeLayout.LayoutParams f32927c;

        l(RelativeLayout.LayoutParams layoutParams, RelativeLayout.LayoutParams layoutParams2) {
            this.f32926b = layoutParams;
            this.f32927c = layoutParams2;
        }

        @Override // java.lang.Runnable
        public void run() {
            GamedetialModleBtFragemnt gamedetialModleBtFragemnt = GamedetialModleBtFragemnt.this;
            RelativeLayout relativeLayout = gamedetialModleBtFragemnt.U;
            if (relativeLayout != null) {
                gamedetialModleBtFragemnt.G1 = (int) (relativeLayout.getMeasuredHeight() + GamedetialModleBtFragemnt.this.getResources().getDimension(R.dimen.wdp36));
                RelativeLayout.LayoutParams layoutParams = this.f32926b;
                GamedetialModleBtFragemnt gamedetialModleBtFragemnt2 = GamedetialModleBtFragemnt.this;
                layoutParams.height = gamedetialModleBtFragemnt2.G1;
                this.f32927c.height = -1;
                gamedetialModleBtFragemnt2.f32873n.setLayoutParams(layoutParams);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class m implements Runnable {
        m() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GamedetialModleBtFragemnt gamedetialModleBtFragemnt = GamedetialModleBtFragemnt.this;
            RelativeLayout relativeLayout = gamedetialModleBtFragemnt.W;
            if (relativeLayout != null) {
                gamedetialModleBtFragemnt.H1 = (int) (relativeLayout.getMeasuredHeight() + GamedetialModleBtFragemnt.this.getResources().getDimension(R.dimen.wdp18));
                GamedetialModleBtFragemnt gamedetialModleBtFragemnt2 = GamedetialModleBtFragemnt.this;
                gamedetialModleBtFragemnt2.V.setMinimumHeight(gamedetialModleBtFragemnt2.H1);
            }
        }
    }

    /* loaded from: classes4.dex */
    class n implements View.OnClickListener {
        n() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (!AccountUtil_.getInstance_(GamedetialModleBtFragemnt.this.f32892v1).isTourist()) {
                IntentUtil.getInstance().goShareWebActivity(GamedetialModleBtFragemnt.this.getContext(), GamedetialModleBtFragemnt.this.J1.getFeedback_issue_url());
            } else {
                IntentUtil.getInstance().goLogin(GamedetialModleBtFragemnt.this.f32892v1);
            }
        }
    }

    /* loaded from: classes4.dex */
    class o extends BaseAdapter {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f32931b;

        /* loaded from: classes4.dex */
        class a {

            /* renamed from: a  reason: collision with root package name */
            public TextView f32933a;

            a() {
            }
        }

        o(List list) {
            this.f32931b = list;
        }

        @Override // android.widget.Adapter
        /* renamed from: a */
        public String getItem(int i4) {
            return (String) this.f32931b.get(i4);
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return this.f32931b.size();
        }

        @Override // android.widget.Adapter
        public long getItemId(int i4) {
            return i4;
        }

        @Override // android.widget.Adapter
        public View getView(int i4, View view, ViewGroup viewGroup) {
            a aVar;
            Context context = viewGroup.getContext();
            if (view != null) {
                aVar = (a) view.getTag();
            } else {
                a aVar2 = new a();
                View inflate = LayoutInflater.from(context).inflate(R.layout.layout_sheet_golden_finger_item, viewGroup, false);
                aVar2.f32933a = (TextView) inflate.findViewById(R.id.name);
                inflate.setTag(aVar2);
                aVar = aVar2;
                view = inflate;
            }
            aVar.f32933a.setText(getItem(i4));
            ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) aVar.f32933a.getLayoutParams();
            if (i4 == getCount() - 1) {
                ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = context.getResources().getDimensionPixelOffset(R.dimen.wdp20);
            } else {
                ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = 0;
            }
            aVar.f32933a.setLayoutParams(layoutParams);
            return view;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class p implements Runnable {
        p() {
        }

        @Override // java.lang.Runnable
        public void run() {
            CoordinatorLayout.Behavior behavior = ((CoordinatorLayout.LayoutParams) GamedetialModleBtFragemnt.this.f32877p.getLayoutParams()).getBehavior();
            if (behavior != null) {
                int[] iArr = new int[2];
                GamedetialModleBtFragemnt.this.f32865j.getLocationInWindow(iArr);
                GamedetialModleBtFragemnt gamedetialModleBtFragemnt = GamedetialModleBtFragemnt.this;
                behavior.onNestedPreScroll(gamedetialModleBtFragemnt.G, gamedetialModleBtFragemnt.f32877p, gamedetialModleBtFragemnt.f32865j, 0, iArr[1], new int[]{0, 0}, 0);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class q implements ViewPager.OnPageChangeListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ FragmentPagerAdapter f32936b;

        q(FragmentPagerAdapter fragmentPagerAdapter) {
            this.f32936b = fragmentPagerAdapter;
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i4) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i4, float f5, int i5) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i4) {
            int i5 = 0;
            while (i5 < this.f32936b.getCount()) {
                if (this.f32936b.getItem(i5) instanceof w1.n) {
                    ((w1.n) this.f32936b.getItem(i5)).L(i5 == i4);
                }
                i5++;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class r implements PopupWindow.OnDismissListener {
        r() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            GamedetialModleBtFragemnt gamedetialModleBtFragemnt = GamedetialModleBtFragemnt.this;
            gamedetialModleBtFragemnt.Z1 = 1;
            gamedetialModleBtFragemnt.o0();
            GamedetialModleBtFragemnt gamedetialModleBtFragemnt2 = GamedetialModleBtFragemnt.this;
            gamedetialModleBtFragemnt2.D1 = 0;
            gamedetialModleBtFragemnt2.U0(1.0f);
            GamedetialModleBtFragemnt.H2 = GamedetialModleBtFragemnt.this.P1.getText().toString().trim();
            GamedetialModleBtFragemnt gamedetialModleBtFragemnt3 = GamedetialModleBtFragemnt.this;
            if (gamedetialModleBtFragemnt3.f32850b2) {
                return;
            }
            gamedetialModleBtFragemnt3.f32850b2 = true;
            gamedetialModleBtFragemnt3.c0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class s implements com.join.mgps.customview.g {
        s() {
        }

        @Override // com.join.mgps.customview.g
        public void onRefresh() {
            GamedetialModleBtFragemnt gamedetialModleBtFragemnt = GamedetialModleBtFragemnt.this;
            gamedetialModleBtFragemnt.Z1 = 1;
            gamedetialModleBtFragemnt.f0();
            GamedetialModleBtFragemnt.this.u0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class t implements com.join.mgps.customview.f {
        t() {
        }

        @Override // com.join.mgps.customview.f
        public void onLoadMore() {
            GamedetialModleBtFragemnt.this.f0();
            GamedetialModleBtFragemnt.this.u0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class u implements View.OnClickListener {
        u() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GamedetialModleBtFragemnt.this.L1.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class v implements View.OnClickListener {
        v() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GamedetialModleBtFragemnt.I2 = true;
            GamedetialModleBtFragemnt.this.startActivity(new Intent(GamedetialModleBtFragemnt.this.f32892v1, BuildGameFromActivity_.class));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class w implements View.OnClickListener {
        w() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            String trim = GamedetialModleBtFragemnt.this.P1.getText().toString().trim();
            GamedetialModleBtFragemnt.H2 = trim;
            if (com.join.mgps.Util.o.f(trim)) {
                GamedetialModleBtFragemnt.this.showToast("不能上传表情");
                return;
            }
            GamedetialModleBtFragemnt.this.L1.dismiss();
            GamedetialModleBtFragemnt gamedetialModleBtFragemnt = GamedetialModleBtFragemnt.this;
            if (gamedetialModleBtFragemnt.f32850b2) {
                return;
            }
            gamedetialModleBtFragemnt.f32850b2 = true;
            gamedetialModleBtFragemnt.c0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class x extends PagerAdapter {

        /* loaded from: classes4.dex */
        class a implements View.OnTouchListener {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ int f32945b;

            a(int i4) {
                this.f32945b = i4;
            }

            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (GamedetialModleBtFragemnt.this.A0()) {
                    if (this.f32945b != 0) {
                        if (GamedetialModleBtFragemnt.this.z0()) {
                            ScreenshotTrueListAcvity_.intent(GamedetialModleBtFragemnt.this.f32892v1).fromData(GamedetialModleBtFragemnt.this.J1.getGame_screen_shot().get(this.f32945b - 1)).gameId(GamedetialModleBtFragemnt.this.J1.getGame_id()).start();
                        } else {
                            List<DetialShowImageBean> pic_info = GamedetialModleBtFragemnt.this.J1.getPic_info();
                            ArrayList arrayList = new ArrayList();
                            if (pic_info != null) {
                                for (int i4 = 0; i4 < pic_info.size(); i4++) {
                                    arrayList.add(pic_info.get(i4).getRemote().getPath());
                                }
                            }
                            try {
                                Intent intent = new Intent(GamedetialModleBtFragemnt.this.f32892v1, ImagePagerActivity.class);
                                String[] strArr = new String[arrayList.size()];
                                for (int i5 = 0; i5 < arrayList.size(); i5++) {
                                    strArr[i5] = (String) arrayList.get(i5);
                                }
                                if (com.join.mgps.Util.g2.i(GamedetialModleBtFragemnt.this.J1.getVedio_url()) && this.f32945b == 0) {
                                    FullScreenActivity.VideoInfo videoInfo = new FullScreenActivity.VideoInfo();
                                    videoInfo.m(GamedetialModleBtFragemnt.this.J1.getVedio_url());
                                    videoInfo.h(strArr[0]);
                                    FullScreenActivity_.i0(GamedetialModleBtFragemnt.this.f32892v1).a(videoInfo).start();
                                } else {
                                    intent.putExtra("image_urls", strArr);
                                    intent.putExtra("image_index", this.f32945b - 1);
                                    GamedetialModleBtFragemnt.this.f32892v1.startActivity(intent);
                                }
                            } catch (Exception e5) {
                                e5.printStackTrace();
                            }
                        }
                    }
                } else if (GamedetialModleBtFragemnt.this.z0()) {
                    ScreenshotTrueListAcvity_.intent(GamedetialModleBtFragemnt.this.f32892v1).fromData(GamedetialModleBtFragemnt.this.J1.getGame_screen_shot().get(this.f32945b)).gameId(GamedetialModleBtFragemnt.this.J1.getGame_id()).start();
                } else {
                    List<DetialShowImageBean> pic_info2 = GamedetialModleBtFragemnt.this.J1.getPic_info();
                    ArrayList arrayList2 = new ArrayList();
                    if (pic_info2 != null) {
                        for (int i6 = 0; i6 < pic_info2.size(); i6++) {
                            arrayList2.add(pic_info2.get(i6).getRemote().getPath());
                        }
                    }
                    try {
                        Intent intent2 = new Intent(GamedetialModleBtFragemnt.this.f32892v1, ImagePagerActivity.class);
                        String[] strArr2 = new String[arrayList2.size()];
                        for (int i7 = 0; i7 < arrayList2.size(); i7++) {
                            strArr2[i7] = (String) arrayList2.get(i7);
                        }
                        if (com.join.mgps.Util.g2.i(GamedetialModleBtFragemnt.this.J1.getVedio_url()) && this.f32945b == 0) {
                            FullScreenActivity.VideoInfo videoInfo2 = new FullScreenActivity.VideoInfo();
                            videoInfo2.m(GamedetialModleBtFragemnt.this.J1.getVedio_url());
                            videoInfo2.h(strArr2[0]);
                            FullScreenActivity_.i0(GamedetialModleBtFragemnt.this.f32892v1).a(videoInfo2).start();
                        } else {
                            intent2.putExtra("image_urls", strArr2);
                            intent2.putExtra("image_index", this.f32945b - 1);
                            GamedetialModleBtFragemnt.this.f32892v1.startActivity(intent2);
                        }
                    } catch (Exception e6) {
                        e6.printStackTrace();
                    }
                }
                return false;
            }
        }

        x() {
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public void destroyItem(ViewGroup viewGroup, int i4, Object obj) {
            viewGroup.removeView((View) obj);
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public int getCount() {
            return GamedetialModleBtFragemnt.this.E2.size();
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public Object instantiateItem(ViewGroup viewGroup, int i4) {
            viewGroup.addView((View) GamedetialModleBtFragemnt.this.E2.get(i4));
            View view = (View) GamedetialModleBtFragemnt.this.E2.get(i4);
            view.setOnTouchListener(new a(i4));
            return view;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public boolean isViewFromObject(View view, Object obj) {
            return view == obj;
        }
    }

    /* loaded from: classes4.dex */
    class y extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        ImageView f32947a;

        public y(View view) {
            super(view);
            this.f32947a = (ImageView) view.findViewById(R.id.img);
        }
    }

    /* loaded from: classes4.dex */
    class z extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
        z() {
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
            ImageView imageView = new ImageView(GamedetialModleBtFragemnt.this.f32892v1);
            imageView.setImageResource(R.drawable.icon);
            return new y(imageView);
        }
    }

    private void E0() {
        try {
            if (this.f32861h != null) {
                if (!com.join.mgps.Util.g2.i(this.J1.getGame_info_top_video_url()) && !com.join.mgps.Util.g2.i(this.J1.getGame_info_top_pic())) {
                    this.f32859g.setVisibility(0);
                    this.f32863i.setVisibility(8);
                    this.f32861h.setVisibility(8);
                    return;
                }
                if (this.J1.getBt_game_switch() == 1) {
                    MyImageLoader.e(this.f32863i, R.drawable.banner_normal_icon, this.J1.getGame_info_top_pic(), r.c.f11300g);
                    this.f32861h.setVisibility(8);
                    this.f32863i.setVisibility(0);
                    return;
                }
                String game_info_top_video_url = this.J1.getGame_info_top_video_url();
                if (com.join.mgps.Util.g2.h(game_info_top_video_url)) {
                    MyImageLoader.d(this.f32863i, R.drawable.banner_normal_icon, this.J1.getGame_info_top_pic());
                    this.f32861h.setVisibility(8);
                    this.f32863i.setVisibility(0);
                }
                if (com.join.mgps.Util.g2.i(game_info_top_video_url)) {
                    MyImageLoader.h(this.f32861h.f15277b, this.J1.getGame_info_top_pic());
                    this.f32861h.setMuteWhenPlay(false);
                    this.f32861h.setPlayTag(this.E1);
                    this.f32861h.setShowCoverWhenPause(false);
                    if (this.F1) {
                        com.join.android.app.component.video.i.c(this.f32861h, game_info_top_video_url, false, "");
                        com.join.android.app.component.video.i.a(this.f32861h);
                        this.f32861h.setSurfaceToPlay();
                        this.f32861h.setCover(this.J1.getGame_info_top_pic());
                        return;
                    }
                    this.f32861h.setUp(game_info_top_video_url, StandardVideoView.D, this.J1.getGame_name(), this.J1.getGame_info_top_pic());
                    this.f32892v1.autoPlayVideo(this.f32861h);
                }
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void H0(View view) {
        this.P.r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void I0(View view) {
        this.P.r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void J0(GamedetialMoreBean gamedetialMoreBean, View view) {
        IntentUtil.getInstance().goShareWebActivity(this.f32892v1, gamedetialMoreBean.getPrivacy_policy_url());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void K0(GamedetialMoreBean gamedetialMoreBean, View view) {
        GameDetailPermissionActivity_.f0(this.f32892v1).a(gamedetialMoreBean.getSensitive_authority()).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void L0(View view) {
        IntentUtil.getInstance().goShareWebActivity(this.f32892v1, "https://beian.miit.gov.cn/#/home");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ GamedetialModleFourBean M0(GamedetialModleFourBean gamedetialModleFourBean) {
        return gamedetialModleFourBean;
    }

    private void R0() {
    }

    private void S0(String str, String str2, StatFactory.VolcanoOther volcanoOther, boolean z4) {
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
                    StatFactory.Companion.getInstance(this.f32892v1).sendEvent(new StatFactory.VolcanoEvent(Event.check, str2, new StatFactory.SpmData("wufun", str4, str6, str5, true), volcanoOther, z4));
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
                StatFactory.Companion.getInstance(this.f32892v1).sendEvent(new StatFactory.VolcanoEvent(Event.check, str2, new StatFactory.SpmData("wufun", str4, str6, str5, true), volcanoOther, z4));
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
            StatFactory.Companion.getInstance(this.f32892v1).sendEvent(new StatFactory.VolcanoEvent(Event.check, str2, new StatFactory.SpmData("wufun", str4, str6, str5, true), volcanoOther, z4));
        }
        str4 = "home";
        str5 = "0";
        str6 = "";
        StatFactory.Companion.getInstance(this.f32892v1).sendEvent(new StatFactory.VolcanoEvent(Event.check, str2, new StatFactory.SpmData("wufun", str4, str6, str5, true), volcanoOther, z4));
    }

    private int getStatusBarHeight(Context context) {
        int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", q.a.f73126a);
        if (identifier > 0) {
            return context.getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    private void n1() {
        try {
            GameScore game_score = this.J1.getGame_score();
            if ("1".equals(this.J1.getComment_score_switch()) && game_score != null && com.join.mgps.Util.g2.i(game_score.getScore())) {
                if (!"0.0".equals(game_score.getScore()) && !"0".equals(game_score.getScore())) {
                    this.f32880p2.setText(game_score.getScore());
                    this.f32866j2.setIntegerMark(false);
                    this.f32866j2.setEnabled(false);
                    this.f32866j2.setStarMark(game_score.getTotal_stars());
                    this.f32876o2.setVisibility(0);
                    return;
                }
                this.f32882q2.setText("暂未出分");
                this.f32880p2.setText("0");
                this.f32866j2.setIntegerMark(false);
                this.f32866j2.setEnabled(false);
                this.f32866j2.setStarMark(game_score.getTotal_stars());
                this.f32876o2.setVisibility(0);
                return;
            }
            this.f32876o2.setVisibility(8);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public static GamedetialModleBtFragemnt v0(String str, ExtBean extBean, boolean z4) {
        GamedetialModleBtFragemnt_ gamedetialModleBtFragemnt_ = new GamedetialModleBtFragemnt_();
        Bundle bundle = new Bundle();
        bundle.putBoolean(GamedetailVideoMainActivity_.AUTODOWN_EXTRA, z4);
        bundle.putSerializable("extBean", extBean);
        bundle.putString("gameId", str);
        bundle.putBoolean(EndGameDetailActivity_.R, false);
        gamedetialModleBtFragemnt_.setArguments(bundle);
        return gamedetialModleBtFragemnt_;
    }

    public static GamedetialModleBtFragemnt w0(String str, ExtBean extBean, boolean z4, boolean z5, boolean z6) {
        GamedetialModleBtFragemnt_ gamedetialModleBtFragemnt_ = new GamedetialModleBtFragemnt_();
        Bundle bundle = new Bundle();
        bundle.putBoolean(GamedetailVideoMainActivity_.AUTODOWN_EXTRA, z4);
        bundle.putSerializable("extBean", extBean);
        bundle.putString("gameId", str);
        bundle.putBoolean(EndGameDetailActivity_.R, z5);
        bundle.putBoolean(GamedetailVideoMainActivity_.IS_SHOW_COMMENT_EXTRA, z6);
        gamedetialModleBtFragemnt_.setArguments(bundle);
        return gamedetialModleBtFragemnt_;
    }

    boolean A0() {
        return com.join.mgps.Util.g2.i(this.J1.getGame_info_top_video_url()) || com.join.mgps.Util.g2.i(this.J1.getGame_info_top_pic());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void B0() {
        PopupWindow popupWindow = this.L1;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
    }

    @Override // w1.i
    public void C() {
    }

    void C0() {
        this.f32873n.setAdapter(this.F2);
        this.f32869l.setViewPager(this.f32873n);
        if (MViewpagerV4.class.isInstance(this.f32873n)) {
            ((MViewpagerV4) this.f32873n).setIntercept(false);
        }
        this.f32869l.setOnPageChangeListener(new j());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void D0() {
        View inflate = LayoutInflater.from(this.f32892v1).inflate(R.layout.popo_item, (ViewGroup) null);
        U0(0.4f);
        PopupWindow popupWindow = new PopupWindow(inflate, -1, -1, true);
        this.L1 = popupWindow;
        popupWindow.setTouchable(true);
        this.L1.setOutsideTouchable(true);
        this.L1.setFocusable(true);
        this.L1.setBackgroundDrawable(new ColorDrawable());
        this.L1.setSoftInputMode(16);
        this.L1.setOnDismissListener(new r());
        XListView2 xListView2 = (XListView2) inflate.findViewById(R.id.listview);
        this.T1 = xListView2;
        xListView2.setPullRefreshEnable(new s());
        this.T1.setPullLoadEnable(new t());
        this.R1 = (TextView) inflate.findViewById(R.id.tv_show_tips);
        this.O1 = (LinearLayout) inflate.findViewById(R.id.ll_our);
        this.M1 = (LinearLayout) inflate.findViewById(R.id.ll_show_finish);
        this.N1 = (LinearLayout) inflate.findViewById(R.id.ll_dismiss);
        this.P1 = (EditText) inflate.findViewById(R.id.game_ed);
        this.Q1 = (TextView) inflate.findViewById(R.id.tv_finish);
        this.S1 = (LinearLayout) inflate.findViewById(R.id.ll_build);
        this.N1.setOnClickListener(new u());
        this.S1.setOnClickListener(new v());
        this.Q1.setOnClickListener(new w());
        a0 a0Var = new a0();
        this.U1 = a0Var;
        this.T1.setAdapter((ListAdapter) a0Var);
        this.L1.showAtLocation(LayoutInflater.from(this.f32892v1).inflate(R.layout.gamedetial_modle_three_activity, (ViewGroup) null), 81, 0, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void F0() {
        N0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void G0() {
        this.f32892v1.clickBack();
    }

    @Override // w1.i
    public void H() {
        int i4;
        int i5;
        View inflate = LayoutInflater.from(this.f32892v1).inflate(R.layout.layout_game_detail_sheet_profile, (ViewGroup) this.P, false);
        View findViewById = inflate.findViewById(R.id.scrollView);
        View findViewById2 = inflate.findViewById(R.id.close);
        FlowLayout flowLayout = (FlowLayout) inflate.findViewById(R.id.flowLayout);
        View findViewById3 = inflate.findViewById(R.id.uploadGame);
        TextView textView = (TextView) inflate.findViewById(R.id.vendor);
        TextView textView2 = (TextView) inflate.findViewById(R.id.downloadCount);
        TextView textView3 = (TextView) inflate.findViewById(R.id.versionName);
        TextView textView4 = (TextView) inflate.findViewById(R.id.appSize);
        TextView textView5 = (TextView) inflate.findViewById(R.id.date);
        TextView textView6 = (TextView) inflate.findViewById(R.id.updateMessageTitle);
        TextView textView7 = (TextView) inflate.findViewById(R.id.updateMessage);
        TextView textView8 = (TextView) inflate.findViewById(R.id.gameFrom);
        Group group = (Group) inflate.findViewById(R.id.vendorGroup);
        Group group2 = (Group) inflate.findViewById(R.id.sourceGroup);
        TextView textView9 = (TextView) inflate.findViewById(R.id.privacy);
        TextView textView10 = (TextView) inflate.findViewById(R.id.permission);
        TextView textView11 = (TextView) inflate.findViewById(R.id.textViewBeian);
        TextView textView12 = (TextView) inflate.findViewById(R.id.beian);
        findViewById2.setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.activity.h0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GamedetialModleBtFragemnt.this.I0(view);
            }
        });
        ((TextView) inflate.findViewById(R.id.desc)).setText(this.J1.getGame_describe_second());
        if (this.J1.getGame_upgrade_info_switch() == 1) {
            String game_upgrade_info = this.J1.getGame_upgrade_info();
            i4 = 0;
            textView6.setVisibility(0);
            textView7.setVisibility(0);
            textView7.setText(game_upgrade_info);
        } else {
            i4 = 0;
        }
        flowLayout.removeAllViews();
        flowLayout.setVisibility(i4);
        int i6 = Build.VERSION.SDK_INT;
        if (this.J1.getMax_an_compatible_ver() != 0 && i6 >= this.J1.getMin_an_compatible_ver()) {
            this.J1.getMax_an_compatible_ver();
        }
        if (this.J1.getGame_prompt() != null && this.J1.getGame_prompt().size() != 0) {
            flowLayout.setVisibility(0);
            flowLayout.setHorizontalDivider(flowLayout.getResources().getDimensionPixelOffset(R.dimen.wdp20));
            flowLayout.setVerticalDivider(flowLayout.getResources().getDimensionPixelOffset(R.dimen.wdp14));
            for (int i7 = 0; i7 < this.J1.getGame_prompt().size(); i7++) {
                GamePromptBean gamePromptBean = this.J1.getGame_prompt().get(i7);
                if (gamePromptBean != null && gamePromptBean.getId() == 1) {
                    flowLayout.addView(O0(gamePromptBean.getText(), R.drawable.ic_ok, flowLayout));
                }
            }
        }
        final GamedetialMoreBean game_detailed = this.J1.getGame_detailed();
        if (game_detailed != null) {
            textView3.setText(game_detailed.getCurrent_ver());
            textView5.setText(game_detailed.getUpgrade_time());
            textView4.setText(game_detailed.getSize() + "M");
            textView12.setText(game_detailed.getRecord_number());
            textView9.setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.activity.l0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    GamedetialModleBtFragemnt.this.J0(game_detailed, view);
                }
            });
            textView10.setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.activity.k0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    GamedetialModleBtFragemnt.this.K0(game_detailed, view);
                }
            });
            textView12.setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.activity.j0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    GamedetialModleBtFragemnt.this.L0(view);
                }
            });
            if (TextUtils.isEmpty(game_detailed.getRecord_number())) {
                textView11.setVisibility(8);
                textView12.setVisibility(8);
                i5 = 0;
            } else {
                i5 = 0;
                textView11.setVisibility(0);
                textView12.setVisibility(0);
            }
            if (TextUtils.isEmpty(game_detailed.getCompany_name())) {
                group2.setVisibility(4);
            } else {
                group2.setVisibility(i5);
                textView8.setText(game_detailed.getCompany_name());
            }
        }
        textView2.setText(com.join.mgps.Util.g2.b(game_detailed.getDownloads_count()) + "热度");
        findViewById3.setVisibility(0);
        findViewById3.setOnClickListener(new n());
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) findViewById.getLayoutParams();
        BottomSheetLayout bottomSheetLayout = this.P;
        if (bottomSheetLayout != null) {
            layoutParams.height = bottomSheetLayout.getMeasuredHeight();
        }
        a1(inflate);
        findViewById.scrollTo(0, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void N0() {
        if (com.join.android.app.common.utils.j.j(getContext())) {
            try {
                String uid = AccountUtil_.getInstance_(getContext()).getUid();
                String token = AccountUtil_.getInstance_(getContext()).getToken();
                RequestModel<QueryDownloadInfoRequestArgs> requestModel = new RequestModel<>();
                requestModel.setDefault(getContext());
                QueryDownloadInfoRequestArgs queryDownloadInfoRequestArgs = new QueryDownloadInfoRequestArgs();
                queryDownloadInfoRequestArgs.setGameId(this.f32851c);
                queryDownloadInfoRequestArgs.setUid(uid);
                queryDownloadInfoRequestArgs.setToken(token);
                requestModel.setArgs(queryDownloadInfoRequestArgs);
                ResponseModel<QueryDownloadInfoResponseData> body = com.join.mgps.rpc.impl.i.D0().B0().q(requestModel).execute().body();
                if (body == null || body.getCode() != 600) {
                    return;
                }
                Y0(body.getData());
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    View O0(String str, int i4, ViewGroup viewGroup) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        View inflate = LayoutInflater.from(this.f32892v1).inflate(R.layout.layout_tag_game_detail_profile, viewGroup, false);
        ((TextView) inflate.findViewById(R.id.name)).setText(str);
        ((ImageView) inflate.findViewById(R.id.icon)).setBackgroundResource(i4);
        return inflate;
    }

    public void P0(GamedetialModleFourBean gamedetialModleFourBean) {
        try {
            this.E2.clear();
            if (A0()) {
                View inflate = LayoutInflater.from(this.f32892v1).inflate(R.layout.gamedetail_item_video_bt, (ViewGroup) this.f32873n, false);
                this.f32857f = (RelativeLayout) inflate.findViewById(R.id.videolayout);
                this.f32859g = inflate.findViewById(R.id.nullView);
                this.f32861h = (StandardVideoView) inflate.findViewById(R.id.videoPlayer);
                this.f32863i = (SimpleDraweeView) inflate.findViewById(R.id.iv_book_bg);
                this.Q = inflate.findViewById(R.id.v_mask);
                this.U.post(new l((RelativeLayout.LayoutParams) this.f32861h.getLayoutParams(), (RelativeLayout.LayoutParams) this.f32863i.getLayoutParams()));
                this.W.post(new m());
                E0();
                this.E2.add(inflate);
            } else {
                this.A1.n(R.color.black_alpha);
                this.O.setVisibility(0);
            }
            if (!A0()) {
                this.f32873n.setVisibility(4);
                if (this.f32859g == null) {
                    this.f32859g = new View(this.f32892v1);
                }
                this.f32873n.getLayoutParams().height = getResources().getDimensionPixelOffset(R.dimen.wdp100);
                this.f32859g.setVisibility(0);
            }
            this.f32871m.setVisibility(8);
            this.f32869l.setVisibility(8);
            this.f32871m.setVisibility(8);
            this.f32869l.postInvalidate();
            this.F2.notifyDataSetChanged();
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Receiver(actions = {"com.broadcast.bespeak.sussess"})
    public void Q0(Intent intent) {
        if (intent != null) {
            String stringExtra = intent.getStringExtra("gameid");
            int intExtra = intent.getIntExtra("game_book", 0);
            String stringExtra2 = intent.getStringExtra("message");
            DomainInfoBean domainInfoBean = (DomainInfoBean) intent.getSerializableExtra("pd_info");
            g1(stringExtra, intExtra);
            if (intExtra == 1) {
                if (domainInfoBean != null) {
                    UtilsMy.h4(getContext(), domainInfoBean.getInfo(), "game_search_subscribe");
                }
                com.join.mgps.Util.b0.f0(getContext()).J(getContext(), domainInfoBean, stringExtra2);
            }
        }
    }

    void T0(TextView textView, GamedetialModleFourBean gamedetialModleFourBean) {
        try {
            textView.setTextColor(-1);
            int down_status = gamedetialModleFourBean.getDown_status();
            gamedetialModleFourBean.getPay_tag_info();
            String game_id = gamedetialModleFourBean.getGame_id();
            gamedetialModleFourBean.getDownload_source_switch_v2();
            textView.setEnabled(true);
            int w02 = UtilsMy.w0(gamedetialModleFourBean.getPay_tag_info(), gamedetialModleFourBean.getCrc_sign_id());
            boolean z4 = UtilsMy.v0(w02, game_id) > 0;
            if (down_status == 3 && !z4) {
                textView.setTextColor(-1);
                textView.setText(textView.getResources().getString(R.string.download_status_pre_download));
                textView.setBackgroundResource(R.drawable.detial_simple_normal_selecter);
                textView.setVisibility(0);
            } else if ((down_status == 2 || down_status == 6) && !z4) {
                textView.setText("即将开放");
                textView.setEnabled(false);
                textView.setTextColor(-1);
                textView.setBackgroundResource(R.drawable.detial_simple_grey_selecter);
                textView.setVisibility(0);
            } else if (down_status == 6 && !z4) {
                textView.setText("预约");
                textView.setBackgroundResource(R.drawable.detial_simple_normal_selecter);
                textView.setVisibility(0);
            } else {
                this.f32887t.setText(x0(this.f32892v1.getResources().getString(R.string.download_status_download)));
                if (w02 > 0) {
                    textView.setText(textView.getResources().getString(R.string.pay_game_amount, com.join.mgps.Util.g2.m(w02)));
                } else {
                    textView.setTextColor(-1);
                    textView.setBackgroundResource(R.drawable.detial_simple_normal_selecter);
                }
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    @Override // w1.i
    public void U() {
        GamedetialModleFourBean gamedetialModleFourBean = this.J1;
        if (gamedetialModleFourBean == null) {
            return;
        }
        List<String> golden_finger = (gamedetialModleFourBean.getRoom_cfg_info() == null || this.J1.getRoom_cfg_info().getGolden_finger() == null || this.J1.getRoom_cfg_info().getGolden_finger().size() <= 0) ? null : this.J1.getRoom_cfg_info().getGolden_finger();
        if (golden_finger == null) {
            return;
        }
        View inflate = LayoutInflater.from(this.f32892v1).inflate(R.layout.layout_game_detail_sheet_golden_finger, (ViewGroup) this.P, false);
        inflate.findViewById(R.id.close).setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.activity.i0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GamedetialModleBtFragemnt.this.H0(view);
            }
        });
        ((ListView) inflate.findViewById(R.id.listView)).setAdapter((ListAdapter) new o(golden_finger));
        a1(inflate);
    }

    public void U0(float f5) {
        WindowManager.LayoutParams attributes = this.f32892v1.getWindow().getAttributes();
        attributes.alpha = f5;
        if (f5 == 1.0f) {
            this.f32892v1.getWindow().clearFlags(2);
        } else {
            this.f32892v1.getWindow().addFlags(2);
        }
        this.f32892v1.getWindow().setAttributes(attributes);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void V0(b0 b0Var) {
        b0Var.f32907b.setBackgroundResource(R.drawable.follow_none_image);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void W0() {
        ShareBean shareBean = new ShareBean();
        String share_url = this.K1.getShare_url();
        shareBean.setqZoneShareUrl(share_url);
        shareBean.setQqUrl(share_url);
        shareBean.setWechatFriendUrl(share_url);
        shareBean.setWechatShareUrl(share_url);
        shareBean.setWeiboShareUrl(share_url);
        shareBean.setTitle(this.K1.getGame_name());
        shareBean.setText(this.K1.getInfo());
        shareBean.setImageUrl(this.K1.getIco_remote());
        shareBean.setFrom(2);
        shareBean.setGameId(this.K1.getGame_id());
        if (this.K1.getShare_config() != null && this.K1.getShare_config().getShare_switch() == 1) {
            shareBean.setIntentData(this.K1.getShare_config().getJump_info());
        }
        com.join.mgps.Util.s.r(this.f32892v1, shareBean);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void X0() {
        ShareBean shareBean = new ShareBean();
        String share_url = this.K1.getShare_url();
        shareBean.setqZoneShareUrl(share_url);
        shareBean.setQqUrl(share_url);
        shareBean.setWechatFriendUrl(share_url);
        shareBean.setWechatShareUrl(share_url);
        shareBean.setWeiboShareUrl(share_url);
        shareBean.setImageUrl(this.K1.getIco_remote());
        shareBean.setTitle(this.K1.getGame_name());
        shareBean.setText(this.K1.getInfo());
        shareBean.setFrom(2);
        shareBean.setGameId(this.K1.getGame_id());
        if (this.K1.getShare_config() != null && this.K1.getShare_config().getShare_switch() == 1) {
            shareBean.setIntentData(this.K1.getShare_config().getJump_info());
        }
        com.join.mgps.Util.s.r(this.f32892v1, shareBean);
    }

    public void Y0(QueryDownloadInfoResponseData queryDownloadInfoResponseData) {
        if (queryDownloadInfoResponseData != null) {
            ((DownloadMethodMultiDialog_.k) ((DownloadMethodMultiDialog_.k) ((DownloadMethodMultiDialog_.k) DownloadMethodMultiDialog_.y0(this.f32892v1).flags(805306368)).i(this.f32851c).extra("data", queryDownloadInfoResponseData)).extra("fromRecomDown", false)).k(queryDownloadInfoResponseData.isForceShow()).j(true).start();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void Z0(String str) {
        Toast.makeText(this.f32892v1, str, 0).show();
    }

    void a1(View view) {
        if (this.P == null) {
            return;
        }
        view.setPadding(0, getStatusBarHeight(this.f32892v1), 0, 0);
        this.P.I(view);
        this.P.setFocusable(true);
        this.P.setFocusableInTouchMode(true);
    }

    void addFrom(DownloadTask downloadTask) {
        ExtBean extBean = this.f32853d;
        if (extBean == null || TextUtils.isEmpty(extBean.getFrom()) || downloadTask == null) {
            return;
        }
        if ("112".equals(this.f32853d.getFrom())) {
            ExtBean extBean2 = new ExtBean();
            extBean2.setFrom("101");
            extBean2.setPosition("112");
            extBean2.setLocation(this.f32853d.getLocation());
            downloadTask.setExt(JsonMapper.toJsonString(extBean2));
            return;
        }
        this.f32853d.setFrom("101");
        downloadTask.setExt(JsonMapper.toJsonString(this.f32853d));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterView() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f32851c = arguments.getString("gameId");
            this.f32855e = arguments.getBoolean(GamedetailVideoMainActivity_.AUTODOWN_EXTRA);
            this.F1 = arguments.getBoolean(EndGameDetailActivity_.R);
            this.f32878p0 = arguments.getBoolean(GamedetailVideoMainActivity_.IS_SHOW_COMMENT_EXTRA);
            this.f32853d = (ExtBean) arguments.getSerializable("extBean");
        }
        this.E1 = this.f32849b + System.currentTimeMillis();
        if (this.F1) {
            this.E1 = "PapaMainAdapter";
        }
        if (this.f32853d == null) {
            this.f32853d = new ExtBean();
        }
        GamedetailVideoMainActivity gamedetailVideoMainActivity = (GamedetailVideoMainActivity) getActivity();
        this.f32892v1 = gamedetailVideoMainActivity;
        if (gamedetailVideoMainActivity.gethideOrshowCover()) {
            this.N.setVisibility(0);
        } else {
            this.N.setVisibility(8);
        }
        this.H.setVisibility(8);
        this.I.setVisibility(8);
        this.G.setVisibility(8);
        this.f32879p1 = com.join.mgps.rpc.impl.d.P1();
        this.V1 = com.join.mgps.rpc.impl.a.c0();
        this.W1 = com.join.mgps.rpc.impl.a.c0();
        com.join.mgps.Util.d0.a().d(this);
        RequestBeanUtil.getInstance(this.f32892v1);
        this.C1 = RequestBeanUtil.getVersionAndVersionName();
        this.A1 = new com.join.android.app.common.manager.b(this.f32892v1);
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 21) {
            this.f32892v1.getWindow().setFlags(TTAdConstant.KEY_CLICK_AREA, TTAdConstant.KEY_CLICK_AREA);
            this.A1.m(true);
            this.A1.n(R.color.black_alpha);
            View childAt = ((ViewGroup) this.f32892v1.findViewById(16908290)).getChildAt(0);
            if (childAt != null) {
                ViewCompat.setFitsSystemWindows(childAt, false);
            }
            getResources().getDimensionPixelSize(getResources().getIdentifier("status_bar_height", "dimen", q.a.f73126a));
            GamedetailVideoMainActivity gamedetailVideoMainActivity2 = this.f32892v1;
            com.join.mgps.Util.c2.c(gamedetailVideoMainActivity2, com.join.mgps.Util.c2.d(gamedetailVideoMainActivity2));
        }
        if (i4 >= 21) {
            Window window = getActivity().getWindow();
            window.clearFlags(TTAdConstant.KEY_CLICK_AREA);
            window.getDecorView().setSystemUiVisibility(LogType.UNEXP_ANR);
            window.addFlags(Integer.MIN_VALUE);
            window.setStatusBarColor(0);
        } else if (i4 >= 19) {
            getActivity().getWindow().addFlags(TTAdConstant.KEY_CLICK_AREA);
        }
        GamedetialModleFourBean modleFourBeanShow = ((GamedetailVideoMainActivity) getActivity()).getModleFourBeanShow();
        if (modleFourBeanShow != null) {
            this.H.setVisibility(8);
            this.I.setVisibility(8);
            this.G.setVisibility(0);
            o1(modleFourBeanShow);
        } else {
            t0();
        }
        this.I1 = getStatusBarHeight(this.f32892v1);
        CoordinatorLayout.LayoutParams layoutParams = (CoordinatorLayout.LayoutParams) this.W.getLayoutParams();
        View findViewById = this.f32892v1.findViewById(R.id.statuHVIew);
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) findViewById.getLayoutParams();
        if (i4 >= 21) {
            layoutParams2.height = this.I1;
            findViewById.setLayoutParams(layoutParams2);
            ((ViewGroup.MarginLayoutParams) layoutParams).height = getResources().getDimensionPixelOffset(R.dimen.wdp96) + this.I1;
            this.W.setLayoutParams(layoutParams);
        } else {
            ((ViewGroup.MarginLayoutParams) layoutParams).height = getResources().getDimensionPixelOffset(R.dimen.wdp96);
            this.W.setLayoutParams(layoutParams);
            layoutParams2.height = 1;
            findViewById.setLayoutParams(layoutParams2);
        }
        this.G1 = (((int) getResources().getDimension(R.dimen.wdp400)) - ((int) this.f32892v1.getResources().getDimension(R.dimen.wdp96))) - this.I1;
        this.f32877p.addOnOffsetChangedListener((AppBarLayout.OnOffsetChangedListener) new k(findViewById, (int) getResources().getDimension(R.dimen.wdp25)));
        com.join.mgps.customview.CoordinatorLayout coordinatorLayout = this.G;
        if (coordinatorLayout instanceof com.join.mgps.customview.CoordinatorLayout) {
            coordinatorLayout.setSheetLayout(this.P);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread(delay = 4000)
    public void b1() {
        com.join.mgps.Util.c.g(this.f32872m2);
        b1();
    }

    @Override // com.join.mgps.activity.gamedetail.BaseGameDetailFragment
    public void backpressedTofinishActivity() {
        StandardVideoView standardVideoView = this.f32861h;
        if (standardVideoView == null) {
            return;
        }
        standardVideoView.taskShotPic(new a());
        if (this.f32861h.getTimeHas() < 2000) {
            this.f32861h.onAutoCompletion();
        }
        com.join.android.app.component.video.h.f(this.f32861h);
        this.f32861h.getGSYVideoManager().A(this.f32861h);
        this.f32854d2 = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void c0() {
        try {
            com.wufan.user.service.protobuf.n0 accountData = AccountUtil_.getInstance_(this.f32892v1).getAccountData();
            LinkedMultiValueMap linkedMultiValueMap = new LinkedMultiValueMap();
            linkedMultiValueMap.add("uid", Integer.valueOf(accountData.getUid()));
            linkedMultiValueMap.add("token", accountData.getToken());
            linkedMultiValueMap.add("group_id", G2);
            linkedMultiValueMap.add("game_id", this.f32851c);
            linkedMultiValueMap.add("game_title", H2);
            linkedMultiValueMap.add("device_id", this.B1);
            linkedMultiValueMap.add("version", this.C1);
            GameFromBooleanBean Q = this.W1.Q(linkedMultiValueMap);
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

    void c1() {
        try {
            this.f32888t2.setImageResource(R.drawable.line_blue_bg);
            Animation loadAnimation = AnimationUtils.loadAnimation(this.f32892v1, R.anim.img_translate);
            this.f32896x2 = loadAnimation;
            loadAnimation.setFillAfter(true);
            this.f32894w2.setVisibility(0);
            this.f32894w2.startAnimation(this.f32896x2);
            this.f32896x2.setAnimationListener(new g());
        } catch (Exception e5) {
            e5.printStackTrace();
        }
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
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r4 = r2.B2
            boolean r4 = r4.containsKey(r0)
            if (r4 != 0) goto L2d
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r4 = r2.B2
            r4.put(r0, r3)
        L2d:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r4 = r2.C2
            boolean r4 = r4.containsKey(r0)
            if (r4 != 0) goto La7
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r4 = r2.C2
            r4.put(r0, r3)
            goto La7
        L3b:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.B2
            boolean r3 = r3.containsKey(r0)
            if (r3 == 0) goto L48
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.B2
            r3.remove(r0)
        L48:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.C2
            boolean r3 = r3.containsKey(r0)
            if (r3 == 0) goto La7
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.C2
            r3.remove(r0)
            goto La7
        L56:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.C2
            boolean r3 = r3.containsKey(r0)
            if (r3 == 0) goto La7
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.C2
            r3.remove(r0)
            goto La7
        L64:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.B2
            boolean r3 = r3.containsKey(r0)
            if (r3 == 0) goto L71
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.B2
            r3.remove(r0)
        L71:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.C2
            boolean r3 = r3.containsKey(r0)
            if (r3 == 0) goto La7
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.C2
            r3.remove(r0)
            goto La7
        L7f:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.C2
            boolean r3 = r3.containsKey(r0)
            if (r3 == 0) goto La7
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.C2
            r3.remove(r0)
            goto La7
        L8d:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r4 = r2.B2
            boolean r4 = r4.containsKey(r0)
            if (r4 != 0) goto L9a
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r4 = r2.B2
            r4.put(r0, r3)
        L9a:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r4 = r2.C2
            boolean r4 = r4.containsKey(r0)
            if (r4 != 0) goto La7
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r4 = r2.C2
            r4.put(r0, r3)
        La7:
            r2.updateDownloadView()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.mgps.activity.GamedetialModleBtFragemnt.changeDownloadTaskNumber(com.github.snowdream.android.app.downloader.DownloadTask, int):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void changeGameFollow(int i4) {
        String str;
        if (com.join.android.app.common.utils.j.j(this.f32892v1)) {
            com.wufan.user.service.protobuf.n0 accountData = AccountUtil_.getInstance_(this.f32892v1).getAccountData();
            this.A2 = accountData;
            int uid = accountData != null ? accountData.getUid() : 0;
            try {
                PackageInfo packageInfo = this.f32892v1.getPackageManager().getPackageInfo(this.f32892v1.getPackageName(), 0);
                str = packageInfo.versionCode + "_" + packageInfo.versionName;
            } catch (PackageManager.NameNotFoundException e5) {
                e5.printStackTrace();
                str = "";
            }
            RequestdetialFolowAndBeSpeak requestdetialFolowAndBeSpeak = new RequestdetialFolowAndBeSpeak();
            requestdetialFolowAndBeSpeak.setApp_ver(str);
            requestdetialFolowAndBeSpeak.setGame_id(this.K1.getCrc_sign_id());
            requestdetialFolowAndBeSpeak.setUid(uid);
            requestdetialFolowAndBeSpeak.setMobile(this.A2.z());
            CommonRequestBean<RequestGameIdArgs> detialFollowAnd = RequestBeanUtil.getInstance(this.f32892v1).getDetialFollowAnd(requestdetialFolowAndBeSpeak);
            ResultMainBean resultMainBean = null;
            if (i4 == 1) {
                resultMainBean = this.f32879p1.O0(detialFollowAnd);
            } else if (i4 == 2) {
                resultMainBean = this.f32879p1.D(detialFollowAnd);
            } else if (i4 == 3) {
                resultMainBean = this.f32879p1.o(detialFollowAnd);
            } else if (i4 == 4) {
                resultMainBean = this.f32879p1.d0(detialFollowAnd);
            }
            if (resultMainBean != null) {
                updateTitleButn(resultMainBean, i4);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void d0(String str, String str2, b0 b0Var) {
        try {
            if (com.join.android.app.common.utils.j.j(this.f32892v1)) {
                LinkedMultiValueMap linkedMultiValueMap = new LinkedMultiValueMap();
                linkedMultiValueMap.add("uid", Integer.valueOf(this.A2.getUid()));
                linkedMultiValueMap.add("token", this.A2.getToken());
                linkedMultiValueMap.add("group_id", str);
                linkedMultiValueMap.add("game_id", str2);
                linkedMultiValueMap.add("device_id", this.B1);
                linkedMultiValueMap.add("version", this.C1);
                GameFromBooleanBean z4 = this.W1.z(linkedMultiValueMap);
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

    void d1() {
        try {
            this.f32894w2.clearAnimation();
            this.f32894w2.setVisibility(8);
            this.f32888t2.setImageResource(R.drawable.line_white_bg);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void e0() {
        this.N.setVisibility(8);
        ((GamedetailVideoMainActivity_) getActivity()).shakeAnimback();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void e1() {
        IntentUtil.getInstance().goMyGameManagerActivity(this.f32892v1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void f0() {
        try {
            XListView2 xListView2 = this.T1;
            if (xListView2 != null) {
                xListView2.l();
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void f1() {
        XListView2 xListView2 = this.T1;
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
    public void g1(String str, int i4) {
        GamedetialModleFourBean gamedetialModleFourBean;
        if (com.join.mgps.Util.g2.h(str) || (gamedetialModleFourBean = this.K1) == null || this.f32887t == null) {
            return;
        }
        gamedetialModleFourBean.setGame_book(i4);
        UtilsMy.n3(this.f32887t, this.K1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void getDownloadTaskInfo() {
        List<DownloadTask> r4 = p1.f.K().r();
        List<DownloadTask> q4 = p1.f.K().q();
        if (q4 != null && q4.size() > 0) {
            for (DownloadTask downloadTask : q4) {
                this.B2.put(downloadTask.getCrc_link_type_val(), downloadTask);
            }
        }
        if (r4 != null && r4.size() > 0) {
            for (DownloadTask downloadTask2 : r4) {
                this.C2.put(downloadTask2.getCrc_link_type_val(), downloadTask2);
            }
        }
        updateDownloadView();
    }

    @Override // com.join.mgps.activity.gamedetail.BaseGameDetailFragment
    public ViewPager getViewPager() {
        return this.f32867k;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void h1(int i4) {
        try {
            if (i4 < 100) {
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f32886s2.getLayoutParams();
                layoutParams.width = getResources().getDimensionPixelOffset(R.dimen.wdp24);
                layoutParams.height = getResources().getDimensionPixelOffset(R.dimen.wdp24);
                this.f32886s2.setLayoutParams(layoutParams);
                this.f32886s2.setCompoundDrawables(null, null, null, null);
                this.f32886s2.setBackgroundResource(R.drawable.mygame_big_round);
                this.f32886s2.setPadding(1, 0, 0, 1);
            } else {
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.f32886s2.getLayoutParams();
                layoutParams2.width = getResources().getDimensionPixelOffset(R.dimen.dp70);
                layoutParams2.height = getResources().getDimensionPixelOffset(R.dimen.round_large_size);
                layoutParams2.setMargins(4, (int) TypedValue.applyDimension(1, 7.0f, getResources().getDisplayMetrics()), 0, 0);
                this.f32886s2.setGravity(17);
                this.f32886s2.setLayoutParams(layoutParams2);
                this.f32886s2.setCompoundDrawables(null, null, null, null);
                this.f32886s2.setBackgroundResource(R.drawable.message_round);
                this.f32886s2.setPadding(1, 0, 2, 1);
            }
            this.f32886s2.setVisibility(0);
            TextView textView = this.f32886s2;
            textView.setText(i4 + "");
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    @Override // com.join.mgps.activity.gamedetail.BaseGameDetailFragment
    public void hideCover() {
        this.N.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void i1(int i4) {
        if (i4 == 0) {
            d1();
        } else {
            c1();
        }
    }

    void initView() {
        try {
            this.J.setVisibility(8);
            this.F.setText(this.J1.getGame_name());
            E0();
            C0();
            if (!com.join.mgps.Util.g2.i(this.J1.getGame_info_top_video_url()) && !com.join.mgps.Util.g2.i(this.J1.getGame_info_top_pic())) {
                this.f32881q.setVisibility(0);
                this.f32883r.setVisibility(8);
                this.f32885s.setVisibility(8);
                this.W.getBackground().setAlpha(255);
            }
            int dimensionPixelSize = getResources().getDimensionPixelSize(getResources().getIdentifier("status_bar_height", "dimen", q.a.f73126a));
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f32875o.getLayoutParams();
            layoutParams.height = dimensionPixelSize;
            this.f32875o.setLayoutParams(layoutParams);
            this.f32858f2 = (TextView) this.f32892v1.findViewById(R.id.appName);
            this.f32860g2 = (TextView) this.f32892v1.findViewById(R.id.appCompany);
            this.f32862h2 = (TextView) this.f32892v1.findViewById(R.id.appSize);
            this.f32864i2 = (TextView) this.f32892v1.findViewById(R.id.appDownloadCount);
            this.f32866j2 = (MStarBar) this.f32892v1.findViewById(R.id.comment_head_mstarBar);
            this.f32856e2 = (SimpleDraweeView) this.f32892v1.findViewById(R.id.appIcon);
            this.f32868k2 = (LinearLayout) this.f32892v1.findViewById(R.id.companyLayout);
            this.f32870l2 = (LinearLayout) this.f32892v1.findViewById(R.id.layoutGift);
            this.f32872m2 = (SimpleDraweeView) this.f32892v1.findViewById(R.id.giftImage);
            this.f32874n2 = (TextView) this.f32892v1.findViewById(R.id.giftContent);
            this.f32876o2 = (LinearLayout) this.f32892v1.findViewById(R.id.scoreLayout);
            this.f32880p2 = (TextView) this.f32892v1.findViewById(R.id.comment_head_point_tx);
            this.f32882q2 = (TextView) this.f32892v1.findViewById(R.id.comment_head_num_tx);
            MyImageLoader.h(this.f32856e2, this.J1.getIco_remote());
            this.f32858f2.setText(this.J1.getGame_name());
            this.f32860g2.setText(this.J1.getCompany_name());
            if (this.J1.getBespeak_switch() == 1) {
                if (this.J1.getAppSize() != null && !"0.00".equals(this.J1.getAppSize())) {
                    TextView textView = this.f32862h2;
                    textView.setText(this.J1.getAppSize() + "M");
                    this.f32862h2.setVisibility(0);
                } else {
                    this.f32862h2.setVisibility(8);
                }
                if (this.J1.getBespeak_count() == null) {
                    this.f32864i2.setText("已有0人预约");
                } else {
                    TextView textView2 = this.f32864i2;
                    textView2.setText("已有" + this.J1.getBespeak_count() + "人预约");
                }
            } else {
                this.f32862h2.setVisibility(0);
                this.f32864i2.setText(com.join.mgps.Util.g2.c(this.J1.getDown_count()));
                TextView textView3 = this.f32862h2;
                textView3.setText(this.J1.getAppSize() + "M");
                try {
                    if (this.J1.getDown_status() == 5 && this.J1.getSp_tag_info() != null && this.J1.getSp_tag_info().getDown_res() != null) {
                        this.f32864i2.setText(this.J1.getSp_tag_info().getDown_res().getName());
                    }
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
            }
            if (this.J1.getPlugin_num() != null) {
                String plugin_num = this.J1.getPlugin_num();
                if (plugin_num.equals(ConstantIntEnum.H5.value() + "")) {
                    this.f32862h2.setVisibility(8);
                    this.f32864i2.setText(com.join.mgps.Util.g2.c(this.J1.getDown_count()).replace("安装", this.f32892v1.getResources().getString(R.string.download_status_finished)));
                }
            }
            n1();
            this.f32876o2.setOnClickListener(new b());
            if (com.join.mgps.Util.g2.h(this.J1.getCompany_name())) {
                this.f32868k2.setVisibility(8);
            } else {
                this.f32868k2.setVisibility(8);
                this.f32870l2.setOnClickListener(new c());
            }
            this.f32860g2.setOnClickListener(new d());
            if (this.J1.getShare_config() != null && this.J1.getShare_config().getShare_switch() == 1) {
                this.f32870l2.setVisibility(0);
                MyImageLoader.d(this.f32872m2, R.drawable.user_gift, "");
                this.f32870l2.setOnClickListener(new e());
            } else {
                this.f32870l2.setVisibility(8);
            }
            if (this.J1.getActivity_entry() != null) {
                this.f32870l2.setVisibility(0);
                MyImageLoader.h(this.f32872m2, this.J1.getActivity_entry().getPic());
                this.f32874n2.setText(this.J1.getActivity_entry().getTitle());
                b1();
                this.f32870l2.setOnClickListener(new f());
                return;
            }
            this.f32870l2.setVisibility(8);
        } catch (Exception e6) {
            e6.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void instalButtomButn() {
        ExtBean extBean;
        boolean z4;
        int game_book = this.K1.getGame_book();
        if (this.K1.getBespeak_switch() == 1 && game_book != 1 && this.K1.getDown_status() == 2) {
            if (IntentUtil.getInstance().goLoginNetGame(this.f32892v1) || this.K1.getGame_book() == 1) {
                return;
            }
            changeGameFollow(4);
            return;
        }
        if (("" + this.K1.getPlugin_num()).equals("" + ConstantIntEnum.H5.value())) {
            IntentUtil.getInstance().goShareWebActivity(this.f32892v1, this.K1.getDown_url_remote());
            UtilsMy.T2(this.f32884r2, this.f32892v1);
        }
        DownloadTask downloadTask = this.f32884r2;
        int status = downloadTask != null ? downloadTask.getStatus() : 0;
        if (this.f32884r2 != null && UtilsMy.w0(this.K1.getPay_tag_info(), this.K1.getCrc_sign_id()) > 0) {
            status = 43;
        }
        GamedetialModleFourBean gamedetialModleFourBean = this.K1;
        if (gamedetialModleFourBean != null && gamedetialModleFourBean.getMod_info() != null) {
            List<DownloadTask> G = p1.f.K().G(this.K1.getMod_info().getMain_game_id(), this.K1.getMod_info().getMod_game_id());
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
                    this.f32884r2 = p1.f.K().F(this.f32851c);
                } else if (z5) {
                    if (this.K1.getMod_info() != null) {
                        this.f32884r2 = p1.f.K().F(this.K1.getMod_info().getMod_game_id());
                    }
                } else if (z4) {
                    this.f32884r2 = p1.f.K().F(this.f32851c);
                } else {
                    if (this.K1.getMod_info() != null) {
                        this.f32884r2 = p1.f.K().F(this.K1.getMod_info().getMod_game_id());
                    }
                    if (this.f32884r2 == null) {
                        this.f32884r2 = p1.f.K().F(this.f32851c);
                    }
                }
            } else {
                this.f32884r2 = null;
            }
        }
        DownloadTask downloadTask3 = this.f32884r2;
        if (downloadTask3 != null && downloadTask3.getStatus() != 0) {
            DownloadTask downloadTask4 = this.f32884r2;
            if (downloadTask4 != null && (status == 2 || status == 10)) {
                com.php25.PDownload.d.i(downloadTask4);
            } else if (status == 12 || status == 27) {
                return;
            } else {
                if (status == 13) {
                    com.php25.PDownload.d.l(this.f32892v1, downloadTask4);
                    return;
                } else if (status == 5) {
                    UtilsMy.W3(this.f32892v1, downloadTask4, "2");
                } else if (status == 42) {
                    downloadTask4.setVer(this.K1.getVer());
                    this.f32884r2.setVer_name(this.K1.getVer_name());
                    this.f32884r2.setUrl(this.K1.getDown_url_remote());
                    this.f32884r2.setCfg_ver(this.K1.getCfg_ver());
                    this.f32884r2.setCfg_ver_name(this.K1.getCfg_ver_name());
                    this.f32884r2.setCfg_down_url(this.K1.getCfg_down_url());
                    this.f32884r2.setPay_game_amount(this.K1.getPay_tag_info() != null ? this.K1.getPay_tag_info().getPay_game_amount() : 0);
                    DownloadTask downloadTask5 = this.f32884r2;
                    Where where = Where.detail;
                    downloadTask5.setKeyword(where.name());
                    this.f32884r2.setKeyword(where.name());
                    DownloadTask downloadTask6 = this.f32884r2;
                    UtilsMy.z4(downloadTask6, downloadTask6.getCrc_link_type_val());
                    UtilsMy.r4(this.f32892v1, this.f32884r2);
                } else if (status == 9) {
                    if (!com.join.android.app.common.utils.j.j(this.f32892v1)) {
                        ToastManager.show("无网络连接");
                        return;
                    }
                    if (this.K1.getGame_detailed() != null && com.join.mgps.Util.g2.i(this.K1.getGame_detailed().getTpl_two_qq())) {
                        com.join.mgps.Util.b0.f0(this.f32892v1).b0(this.f32892v1, this.K1.getGame_detailed().getTpl_two_qq_key(), this.K1.getGame_detailed().getAd_pic_qq(), this.K1.getGame_detailed().getTpl_two_qq());
                    }
                    int downloadType = this.f32884r2.getDownloadType();
                    if (downloadType == 0 || downloadType == 1) {
                        if (this.f32884r2.getCrc_link_type_val() == null || this.f32884r2.getCrc_link_type_val().equals("")) {
                            return;
                        }
                        addFrom(this.f32884r2);
                        if (UtilsMy.o1(this.f32892v1, this.f32884r2)) {
                            return;
                        }
                        if (this.K1.getDown_status() == 5) {
                            UtilsMy.l1(this.f32892v1, this.f32884r2);
                            return;
                        }
                        com.php25.PDownload.d.b(this.f32884r2);
                        this.f32884r2.setVer(this.K1.getVer());
                        this.f32884r2.setVer_name(this.K1.getVer_name());
                        this.f32884r2.setUrl(this.K1.getDown_url_remote());
                        this.f32884r2.setCfg_ver(this.K1.getCfg_ver());
                        this.f32884r2.setCfg_ver_name(this.K1.getCfg_ver_name());
                        this.f32884r2.setCfg_down_url(this.K1.getCfg_down_url());
                        this.f32884r2.setPay_game_amount(this.K1.getPay_tag_info() != null ? this.K1.getPay_tag_info().getPay_game_amount() : 0);
                        this.f32884r2.setKeyword(Where.detail.name());
                        DownloadTask downloadTask7 = this.f32884r2;
                        UtilsMy.z4(downloadTask7, downloadTask7.getCrc_link_type_val());
                        if (UtilsMy.y0(this.K1.getPay_tag_info(), this.K1.getCrc_sign_id()) > 0) {
                            ExtBean extBean2 = this.f32853d;
                            if (extBean2 != null && "checkgame".equals(extBean2.getFrom())) {
                                UtilsMy.e4(this.f32892v1, this.f32851c, this.f32853d.getFrom_id());
                            } else {
                                if (!UtilsMy.o1(this.f32892v1, this.f32884r2)) {
                                    if (this.K1.getDown_status() == 5) {
                                        UtilsMy.l1(this.f32892v1, this.f32884r2);
                                    } else {
                                        UtilsMy.d4(this.f32892v1, this.f32851c);
                                    }
                                }
                                onDetailDownload();
                            }
                        } else {
                            UtilsMy.C1(this.f32884r2, this.K1);
                            if (!UtilsMy.o1(this.f32892v1, this.f32884r2)) {
                                if (this.K1.getDown_status() == 5) {
                                    UtilsMy.l1(this.f32892v1, this.f32884r2);
                                } else {
                                    UtilsMy.R0(this.f32892v1, this.f32884r2, this.K1.getTp_down_url(), this.K1.getOther_down_switch(), this.K1.getCdn_down_switch());
                                }
                            }
                            onDetailDownload();
                        }
                    } else if (downloadType == 2) {
                        UtilsMy.u4(this.f32884r2);
                    }
                } else if (11 == status) {
                    UtilsMy.a4(downloadTask4, this.f32892v1);
                } else if (43 == status) {
                    k0();
                } else if (48 != status) {
                    k0();
                }
            }
            updateButn();
            return;
        }
        DownloadTask downloadTask8 = this.f32884r2;
        if (downloadTask8 != null) {
            String ext = downloadTask8.getExt();
            if (com.join.mgps.Util.g2.i(ext) && (extBean = (ExtBean) JsonMapper.getInstance().fromJson(ext, ExtBean.class)) != null) {
                String recPosition = extBean.getRecPosition();
                if (com.join.mgps.Util.g2.i(recPosition) && com.join.mgps.Util.g2.i(extBean.getVolcanoOther())) {
                    S0(recPosition, this.f32851c, (StatFactory.VolcanoOther) JsonMapper.getInstance().fromJson(extBean.getVolcanoOther(), StatFactory.VolcanoOther.class), UtilsMy.k2(this.f32884r2.getTipBeans()));
                }
            }
        }
        this.J1.getRecPosition();
        this.J1.setReMarks(this.f32853d.getReMarks());
        this.K1.setDownType(0);
        this.f32853d.setFrom("101");
        this.K1.setExt(JsonMapper.getInstance().toJson(this.f32853d));
        UtilsMy.b1(this.f32892v1, this.K1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void iv_back() {
        if (this.P.getState() != BottomSheetLayout.State.HIDDEN) {
            this.P.r();
            return;
        }
        this.f32892v1.clickBack();
        y0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void j1() {
        XListView2 xListView2 = this.T1;
        if (xListView2 != null) {
            try {
                xListView2.u();
                this.T1.v();
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    void k0() {
        this.f32884r2.setKeyword(Where.detail.name());
        if (this.K1 != null) {
            addFrom(this.f32884r2);
            if (this.K1.getGame_detailed() != null && com.join.mgps.Util.g2.i(this.K1.getGame_detailed().getTpl_two_qq())) {
                com.join.mgps.Util.b0.f0(this.f32892v1).b0(this.f32892v1, this.K1.getGame_detailed().getTpl_two_qq_key(), this.K1.getGame_detailed().getAd_pic_qq(), this.K1.getGame_detailed().getTpl_two_qq());
            }
            if (UtilsMy.y0(this.K1.getPay_tag_info(), this.K1.getCrc_sign_id()) > 0) {
                ExtBean extBean = this.f32853d;
                if (extBean != null && "checkgame".equals(extBean.getFrom())) {
                    UtilsMy.e4(this.f32892v1, this.f32851c, this.f32853d.getFrom_id());
                    return;
                }
                if (!UtilsMy.o1(this.f32892v1, this.f32884r2)) {
                    if (this.K1.getDown_status() == 5) {
                        UtilsMy.l1(this.f32892v1, this.f32884r2);
                    } else {
                        UtilsMy.d4(this.f32892v1, this.f32851c);
                    }
                }
                onDetailDownload();
                return;
            }
            UtilsMy.C1(this.f32884r2, this.K1);
            if (UtilsMy.o1(this.f32892v1, this.f32884r2)) {
                return;
            }
            if (this.K1.getDown_status() == 5) {
                UtilsMy.l1(this.f32892v1, this.f32884r2);
            } else {
                UtilsMy.R0(this.f32892v1, this.f32884r2, this.K1.getTp_down_url(), this.K1.getOther_down_switch(), this.K1.getCdn_down_switch());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void k1() {
        try {
            d1();
            this.f32886s2.setVisibility(8);
            this.f32886s2.setText("");
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void l0(GameFromPopoWinBean gameFromPopoWinBean) {
        for (int i4 = 0; i4 < gameFromPopoWinBean.getData().size(); i4++) {
            this.f32848a2.add(gameFromPopoWinBean.getData().get(i4));
        }
        if (gameFromPopoWinBean.getData().size() < 10 && this.T1 != null) {
            f1();
        }
        a0 a0Var = this.U1;
        if (a0Var != null) {
            a0Var.notifyDataSetChanged();
        }
    }

    void l1() {
        showInstallButn();
        if (this.f32887t != null) {
            if (UtilsMy.w0(this.K1.getPay_tag_info(), this.K1.getCrc_sign_id()) > 0) {
                this.f32887t.setText(this.f32892v1.getResources().getString(R.string.pay_game_amount, this.K1.getPay_tag_info().getPayGameAmount()));
            } else {
                this.f32887t.setText(x0(this.f32892v1.getResources().getString(R.string.download_status_download)));
                this.f32887t.setTextColor(getResources().getColor(R.color.detail_download_normal_txt));
                this.f32887t.setBackgroundResource(R.drawable.detial_simple_normal_selecter1);
            }
        }
        this.f32893w.setImageResource(R.drawable.detail_comment_download_continue);
        GamedetialModleFourBean gamedetialModleFourBean = this.K1;
        if (gamedetialModleFourBean != null) {
            if (gamedetialModleFourBean.getBespeak_switch() == 1 && this.K1.getDown_status() == 2) {
                if (this.K1.getGame_book() == 1) {
                    this.f32887t.setText("已预约");
                    UtilsMy.w0(this.K1.getPay_tag_info(), this.K1.getCrc_sign_id());
                    T0(this.f32887t, this.K1);
                    return;
                }
                this.f32887t.setText("预约");
                return;
            }
            UtilsMy.w0(this.K1.getPay_tag_info(), this.K1.getCrc_sign_id());
            T0(this.f32887t, this.K1);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void m0() {
        if (this.P.getState() != BottomSheetLayout.State.HIDDEN) {
            this.P.r();
            return;
        }
        this.f32892v1.clickBack();
        y0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread(delay = 1000)
    public void m1(boolean z4) {
        ExtBean extBean = this.f32853d;
        if (extBean == null || !"checkgame".equals(extBean.getFrom())) {
            return;
        }
        com.join.mgps.Util.m1.c().b(this.f32892v1, this.f32853d.getFrom_id(), new h(z4));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void n0() {
        try {
            this.y2 = p1.f.K().S();
            int a02 = p1.f.K().a0();
            this.f32899z2 = a02;
            i1(a02);
            int i4 = this.y2;
            if (i4 != 0) {
                h1(i4);
            } else {
                k1();
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        updateDownloadView();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void o0() {
        if (this.f32848a2.size() > 0) {
            this.f32848a2.clear();
            a0 a0Var = this.U1;
            if (a0Var != null) {
                a0Var.notifyDataSetChanged();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void o1(final GamedetialModleFourBean gamedetialModleFourBean) {
        List<DownloadTask> H;
        boolean z4;
        gamedetialModleFourBean.setNodeId("2");
        this.K1 = gamedetialModleFourBean;
        this.J1 = gamedetialModleFourBean;
        try {
            if (gamedetialModleFourBean.getBt_game_switch() == 1 && gamedetialModleFourBean.getGame_ranking_pos() != null) {
                UtilsMy.C(gamedetialModleFourBean.getGame_ranking_pos(), this.M, this.f32892v1);
            }
            gamedetialModleFourBean.set_from_type(this.f32853d.get_from_type());
            gamedetialModleFourBean.set_from(101);
            gamedetialModleFourBean.setRecPosition(this.f32853d.getRecPosition());
            this.K1.set_from_type(this.f32853d.get_from_type());
            this.K1.set_from(101);
            this.K1.setRecPosition(this.f32853d.getRecPosition());
            this.G.setVisibility(0);
            this.H.setVisibility(8);
            this.I.setVisibility(8);
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
            arrayList.add(new FragmentPagerAdapter.a("详情", GameDetialModleFourActivity.A0(this.f32851c, this.f32855e, this.f32853d).g0(this)));
            CommentAllListFragment c02 = CommentAllListFragment.c0(commentAlllistIntentData);
            c02.f0(new w1.b() { // from class: com.join.mgps.activity.m0
                @Override // w1.b
                public final GamedetialModleFourBean a() {
                    GamedetialModleFourBean M0;
                    M0 = GamedetialModleBtFragemnt.M0(GamedetialModleFourBean.this);
                    return M0;
                }
            });
            arrayList.add(new FragmentPagerAdapter.a("评论", c02));
            arrayList.add(new FragmentPagerAdapter.a("游戏单", GameFormFragment.h0(gamedetialModleFourBean.getGame_company_id(), this.f32851c)));
            FragmentPagerAdapter fragmentPagerAdapter = new FragmentPagerAdapter(getChildFragmentManager(), arrayList);
            this.f32867k.setAdapter(fragmentPagerAdapter);
            this.f32867k.setOffscreenPageLimit(3);
            this.f32865j.setViewPager(this.f32867k);
            if (this.f32878p0) {
                int i4 = 0;
                while (true) {
                    if (i4 >= arrayList.size()) {
                        break;
                    } else if (TextUtils.equals("评论", ((FragmentPagerAdapter.a) arrayList.get(i4)).f41977a)) {
                        this.f32867k.setCurrentItem(i4);
                        break;
                    } else {
                        i4++;
                    }
                }
                new Handler().postDelayed(new p(), 1500L);
            }
            this.f32867k.addOnPageChangeListener(new q(fragmentPagerAdapter));
            if (arrayList.size() == 1) {
                this.f32871m.setVisibility(8);
                this.f32869l.setVisibility(8);
            }
            List<ServiceState> game_server_state = this.K1.getGame_server_state();
            if (game_server_state != null && game_server_state.size() > 0) {
                this.R.setVisibility(0);
                ServiceState serviceState = game_server_state.get(0);
                TextView textView = this.S;
                StringBuilder sb = new StringBuilder();
                sb.append(serviceState.getType() == 1 ? "开服" : "合服");
                sb.append("通知:");
                sb.append(com.join.mgps.Util.y.D(serviceState.getAdd_time()));
                sb.append(" ");
                sb.append(com.join.mgps.Util.y.y(serviceState.getAdd_time(), "HH:mm"));
                sb.append(" ");
                sb.append(serviceState.getTitle());
                textView.setText(sb.toString());
            } else {
                this.R.setVisibility(8);
            }
            P0(gamedetialModleFourBean);
            this.f32869l.setData(gamedetialModleFourBean);
            if (this.f32855e && p1.f.K().F(this.f32851c) == null) {
                com.php25.PDownload.d.c(gamedetialModleFourBean.getDownloadtaskDown(), this.f32892v1);
                onDetailDownload();
            }
            GamedetialModleFourBean gamedetialModleFourBean2 = this.K1;
            if (gamedetialModleFourBean2 != null) {
                if (gamedetialModleFourBean2.getGame_follow() == 1) {
                    this.D.setImageResource(R.drawable.followed_image);
                    this.E.setText("已收藏");
                } else {
                    this.D.setImageResource(R.drawable.follow_none_image);
                    this.E.setText("收藏");
                }
            }
            if (gamedetialModleFourBean.getMod_info() != null) {
                H = p1.f.K().G(gamedetialModleFourBean.getMod_info().getMain_game_id(), gamedetialModleFourBean.getMod_info().getMod_game_id());
            } else {
                H = p1.f.K().H(this.K1.getPackageName());
            }
            if (H != null && H.size() > 0) {
                boolean z5 = false;
                loop1: while (true) {
                    z4 = false;
                    for (DownloadTask downloadTask : H) {
                        if (Dtype.MOD.name().equals(downloadTask.getFileType())) {
                            z5 = com.join.mgps.va.overmind.d.o().F(downloadTask.getPackageName()) && downloadTask.getStatus() == 5;
                        } else if (com.join.android.app.common.utils.e.l0(getContext()).d(getContext(), downloadTask.getPackageName()) && downloadTask.getStatus() == 5) {
                            z4 = true;
                        }
                    }
                    break loop1;
                }
                if (z5 && z4) {
                    this.f32884r2 = p1.f.K().F(this.f32851c);
                } else if (z5) {
                    if (this.K1.getMod_info() != null) {
                        this.f32884r2 = p1.f.K().F(this.K1.getMod_info().getMod_game_id());
                    }
                } else if (z4) {
                    this.f32884r2 = p1.f.K().F(this.f32851c);
                } else {
                    if (this.K1.getMod_info() != null) {
                        this.f32884r2 = p1.f.K().F(this.K1.getMod_info().getMod_game_id());
                    }
                    if (this.f32884r2 == null) {
                        this.f32884r2 = p1.f.K().F(this.f32851c);
                    }
                }
            }
            DownloadTask downloadTask2 = this.f32884r2;
            if (downloadTask2 == null) {
                this.f32884r2 = this.K1.getDownloadtaskDown();
                if (UtilsMy.o0(this.K1.getTag_info())) {
                    if (this.f32884r2.getMod_info() == null) {
                        this.f32884r2.setFileType(Dtype.android.name());
                        if (com.join.android.app.common.utils.e.l0(this.f32892v1).d(this.f32892v1, this.K1.getPackageName())) {
                            APKUtils.a l4 = com.join.android.app.common.utils.e.l0(this.f32892v1).l(this.f32892v1, this.K1.getPackageName());
                            if (com.join.mgps.Util.g2.i(this.K1.getVer()) && l4.d() < Integer.parseInt(this.K1.getVer())) {
                                this.f32884r2.setStatus(9);
                            } else {
                                this.f32884r2.setStatus(5);
                            }
                        } else {
                            this.f32884r2.setStatus(0);
                        }
                    }
                } else {
                    this.f32884r2.setStatus(0);
                }
            } else {
                downloadTask2.setDownloadType(0);
                this.f32884r2.setTask_down_type(0);
                this.f32884r2.setScreenshot_pic(this.K1.getScreenshot_pic());
            }
            if (("" + this.K1.getPlugin_num()).equals("" + ConstantIntEnum.H5.value())) {
                GamedetialModleFourBean gamedetialModleFourBean3 = this.K1;
                gamedetialModleFourBean3.setDown_count(gamedetialModleFourBean3.getStart_count());
            }
            updateButn();
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    @Override // com.join.mgps.activity.gamedetail.BaseGameDetailFragment
    public boolean onBackPressedMy() {
        if (com.join.android.app.component.video.a.c0(this.f32892v1, this.E1)) {
            return true;
        }
        BottomSheetLayout bottomSheetLayout = this.P;
        if (bottomSheetLayout == null || bottomSheetLayout.getState() == BottomSheetLayout.State.HIDDEN) {
            return false;
        }
        this.P.r();
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        if (!this.F1) {
            StandardVideoView standardVideoView = this.f32861h;
            if (standardVideoView != null && standardVideoView.d()) {
                this.f32861h.release();
            }
            com.join.android.app.component.video.a.n0(this.E1);
        }
        com.join.mgps.Util.d0.a().e(this);
    }

    void onDetailDownload() {
        ExtBean extBean = this.f32853d;
        if (extBean == null || TextUtils.isEmpty(extBean.getFrom()) || !this.f32853d.getFrom().equals("downloadCenter")) {
            return;
        }
        MobclickAgent.onEvent(this.f32892v1, "detailDownload4.2.0.6");
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    void onDownloadSpeed(com.join.mgps.event.m mVar) {
        if (mVar == null || TextUtils.isEmpty(mVar.a())) {
            return;
        }
        ProgressBar progressBar = this.f32897y;
        if (progressBar instanceof DownloadProgressBar) {
            ((DownloadProgressBar) progressBar).update(mVar.a(), 1);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00c3, code lost:
        if (r6 != 48) goto L65;
     */
    @org.greenrobot.eventbus.Subscribe(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onEventMainThread(com.join.mgps.event.n r6) {
        /*
            Method dump skipped, instructions count: 297
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.mgps.activity.GamedetialModleBtFragemnt.onEventMainThread(com.join.mgps.event.n):void");
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        StandardVideoView standardVideoView;
        StandardVideoView standardVideoView2;
        super.onPause();
        this.D2 = true;
        try {
            if (!this.F1 && (standardVideoView2 = this.f32861h) != null && standardVideoView2.d()) {
                this.f32861h.onVideoPause();
            } else if (this.F1 && (standardVideoView = this.f32861h) != null && standardVideoView.d() && !this.f32854d2) {
                this.f32861h.onVideoPause();
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
        this.D2 = false;
        this.A2 = AccountUtil_.getInstance_(this.f32892v1).getAccountData();
        if (I2) {
            this.Z1 = 1;
            I2 = false;
            u0();
        }
        if (this.f32881q.getVisibility() == 4 && (standardVideoView = this.f32861h) != null && standardVideoView.d()) {
            this.f32861h.onVideoResume(false);
        }
        n0();
        GamedetialModleFourBean gamedetialModleFourBean2 = this.K1;
        if (gamedetialModleFourBean2 != null) {
            if (gamedetialModleFourBean2.getMod_info() != null) {
                H = p1.f.K().G(this.K1.getMod_info().getMod_game_id(), this.K1.getMod_info().getMain_game_id());
            } else {
                H = p1.f.K().H(this.K1.getPackageName());
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
                    r1 = p1.f.K().F(this.f32851c);
                } else if (z5) {
                    if (this.K1.getMod_info() != null) {
                        r1 = p1.f.K().F(this.K1.getMod_info().getMod_game_id());
                    }
                } else if (z4) {
                    r1 = p1.f.K().F(this.f32851c);
                } else {
                    r1 = this.K1.getMod_info() != null ? p1.f.K().F(this.K1.getMod_info().getMod_game_id()) : null;
                    if (r1 == null) {
                        r1 = p1.f.K().F(this.f32851c);
                    }
                }
            }
        }
        if (r1 == null && (gamedetialModleFourBean = this.K1) != null) {
            this.f32884r2 = gamedetialModleFourBean.getDownloadtaskDown();
        }
        if (r1 != null && this.f32884r2 != null) {
            try {
                this.f32884r2 = r1;
                if (r1.getFileType().equals(Dtype.android.name()) && this.f32884r2.getStatus() == 5) {
                    if (this.K1.getMod_info() == null) {
                        com.join.android.app.common.utils.e l02 = com.join.android.app.common.utils.e.l0(this.f32892v1);
                        GamedetailVideoMainActivity gamedetailVideoMainActivity = this.f32892v1;
                        String packageName = this.f32884r2.getPackageName();
                        APKUtils.DEVICE_TYPE device_type = APKUtils.DEVICE_TYPE.ALL;
                        if (Boolean.valueOf(l02.e(gamedetailVideoMainActivity, packageName, device_type)).booleanValue()) {
                            APKUtils.a m4 = com.join.android.app.common.utils.e.l0(this.f32892v1).m(this.f32892v1, this.f32884r2.getPackageName(), device_type);
                            if (com.join.mgps.Util.g2.i(this.f32884r2.getVer()) && m4.d() < Integer.parseInt(this.f32884r2.getVer())) {
                                this.f32884r2.setStatus(9);
                            } else {
                                this.f32884r2.setStatus(5);
                            }
                        } else {
                            this.f32884r2.setStatus(0);
                        }
                    }
                } else {
                    this.f32884r2.setStatus(r1.getStatus());
                }
                updateButn();
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
        UtilsMy.q4(this.f32892v1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click({R.id.ll_notice})
    public void p0() {
        if (this.J1 != null) {
            DetialMoreServiceListActivity_.r0(this.f32892v1).a(this.J1.getCrc_sign_id()).start();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Receiver(actions = {"com.broadcast.bespeak.sussess"})
    public void p1() {
        this.K1.setGame_book(1);
        updateButn();
    }

    @Override // com.join.mgps.activity.gamedetail.BaseGameDetailFragment
    public void pauseVideo() {
        this.D2 = true;
        StandardVideoView standardVideoView = this.f32861h;
        if (standardVideoView == null || !standardVideoView.d()) {
            return;
        }
        this.f32861h.onVideoPause();
    }

    @Override // com.join.mgps.activity.gamedetail.BaseGameDetailFragment
    public void playVideo() {
        StandardVideoView standardVideoView = this.f32861h;
        if (standardVideoView != null) {
            this.f32892v1.autoPlayVideo(standardVideoView);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void progress_layout() {
        DownloadTask downloadTask = this.f32884r2;
        if (downloadTask == null) {
            return;
        }
        if (downloadTask.getStatus() == 2) {
            updateButn();
            com.php25.PDownload.d.i(this.f32884r2);
        } else if (this.f32884r2.getStatus() == 3 || this.f32884r2.getStatus() == 6) {
            updateButn();
            com.php25.PDownload.d.c(this.f32884r2, this.f32892v1);
            onDetailDownload();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void q0() {
        IntentUtil.getInstance().goMyGameManagerActivity(this.f32892v1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void r0() {
        IntentUtil.getInstance().goMyGameManagerActivity(this.f32892v1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void relodingimag() {
        showLoding();
        t0();
    }

    @Override // com.join.mgps.activity.gamedetail.BaseGameDetailFragment
    public void resumVideo() {
        this.D2 = false;
        StandardVideoView standardVideoView = this.f32861h;
        if (standardVideoView != null) {
            if (standardVideoView.d()) {
                this.f32861h.startPlayLogic();
            } else if (this.f32881q.getVisibility() == 4 && this.f32861h.d()) {
                this.f32861h.onVideoResume(false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void s0() {
        if (AccountUtil_.getInstance_(this.f32892v1).isTourist()) {
            ((LoginSplashActivity_.IntentBuilder_) LoginSplashActivity_.intent(this.f32892v1).flags(268435456)).start();
            return;
        }
        D0();
        u0();
    }

    @Override // com.join.mgps.activity.gamedetail.BaseGameDetailFragment
    @UiThread
    public void setCommentNumber(String str) {
        try {
            TextView j4 = this.f32865j.j(1);
            j4.setWidth(getResources().getDimensionPixelOffset(R.dimen.wdp220));
            j4.setText("点评(" + str + ")");
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void setNetwork() {
        UtilsMy.w3(this.f32892v1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showInstallButn() {
        GamedetialModleFourBean gamedetialModleFourBean = this.K1;
        if (gamedetialModleFourBean == null || TextUtils.isEmpty(gamedetialModleFourBean.getCrc_sign_id())) {
            return;
        }
        GamedetialModleFourBean gamedetialModleFourBean2 = this.J1;
        if (gamedetialModleFourBean2 != null && gamedetialModleFourBean2.getSp_tag_info().getSelf_support() != null) {
            ImageView imageView = this.X;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
        } else {
            ImageView imageView2 = this.X;
            if (imageView2 != null) {
                imageView2.setVisibility(0);
            }
        }
        try {
            this.f32889u.setVisibility(8);
            this.f32891v.setVisibility(0);
            this.f32887t.setVisibility(0);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showLoding() {
        try {
            this.H.setVisibility(0);
            this.I.setVisibility(8);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0035 -> B:18:0x003d). Please submit an issue!!! */
    @UiThread
    public void showLodingFailed() {
        try {
            this.H.setVisibility(8);
            try {
                GamedetialModleFourBean gamedetialModleFourBean = this.K1;
                if (gamedetialModleFourBean == null || com.join.mgps.Util.g2.h(gamedetialModleFourBean.getCrc_sign_id())) {
                    this.I.setVisibility(0);
                    this.J.setVisibility(0);
                    if (com.join.android.app.common.utils.j.j(this.f32892v1)) {
                        this.K.setVisibility(8);
                    } else {
                        this.K.setVisibility(0);
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
            ConstraintLayout constraintLayout = this.f32891v;
            if (constraintLayout != null) {
                constraintLayout.setVisibility(8);
            }
            TextView textView = this.f32887t;
            if (textView != null) {
                textView.setVisibility(8);
            }
            RelativeLayout relativeLayout = this.f32889u;
            if (relativeLayout != null) {
                relativeLayout.setVisibility(0);
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showToast(String str) {
        Toast.makeText(this.f32892v1, str, 0).show();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void t0() {
        GamedetialModleFourBean data;
        if (com.join.android.app.common.utils.j.j(this.f32892v1)) {
            try {
                com.wufan.user.service.protobuf.n0 accountData = AccountUtil_.getInstance_(this.f32892v1).getAccountData();
                if (accountData == null) {
                    accountData = com.wufan.user.service.protobuf.n0.f5().build();
                }
                RequestModel requestModel = new RequestModel();
                requestModel.setDefault(this.f32892v1);
                RequestGameIdArgs requestGameIdArgs = new RequestGameIdArgs(this.f32851c, 1, accountData.getUid());
                requestGameIdArgs.setDownloadedGameIdList(p1.f.K().A());
                requestModel.setArgs(requestGameIdArgs);
                ResponseModel<GamedetialModleFourBean> body = com.join.mgps.rpc.impl.i.D0().B0().p(requestModel.makeSign()).execute().body();
                if (body != null && body.getCode() == 200 && (data = body.getData()) != null) {
                    o1(data);
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
    public void u0() {
        try {
            if (com.join.android.app.common.utils.j.j(this.f32892v1)) {
                if (IntentUtil.getInstance().goLoginInteractive(this.f32892v1)) {
                    return;
                }
                this.B1 = "";
                com.wufan.user.service.protobuf.n0 accountData = AccountUtil_.getInstance_(this.f32892v1).getAccountData();
                LinkedMultiValueMap linkedMultiValueMap = new LinkedMultiValueMap();
                linkedMultiValueMap.add("uid", Integer.valueOf(accountData.getUid()));
                linkedMultiValueMap.add("token", accountData.getToken());
                linkedMultiValueMap.add("current_game_id", this.f32851c);
                int i4 = this.Z1;
                this.Z1 = i4 + 1;
                linkedMultiValueMap.add("page", Integer.valueOf(i4));
                linkedMultiValueMap.add("device_id", this.B1);
                linkedMultiValueMap.add("version ", this.C1);
                GameFromPopoWinBean O = this.W1.O(linkedMultiValueMap);
                if (O != null && O.getError() == 0 && O.getData() != null) {
                    j1();
                    if (this.Z1 == 2) {
                        o0();
                    }
                    l0(O);
                    return;
                } else if (O != null && O.getError() == 701) {
                    IntentUtil.getInstance().goMyAccountLoginActivity(this.f32892v1);
                    Z0("Token已失效，请重新登录");
                    IntentUtil.getInstance().goLogin(this.f32892v1);
                    B0();
                    return;
                } else {
                    f1();
                    return;
                }
            }
            showToast("网络出错，请稍后重试");
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void updateButn() {
        if (this.K1 == null || this.f32884r2 == null || this.f32887t == null) {
            return;
        }
        ConstraintLayout constraintLayout = this.f32891v;
        if (constraintLayout != null) {
            constraintLayout.setVisibility(0);
        }
        if (this.K1.getDel_tag() == 1 && !this.K1.getCompany_name().equals("SNK")) {
            this.f32887t.setEnabled(false);
            this.f32887t.setBackgroundResource(R.drawable.detial_simple_grey_selecter);
            this.f32887t.setText("已下架");
            showInstallButn();
            return;
        }
        UtilsMy.j3(this.K1.getSp_tag_info(), this.f32891v, this.f32884r2);
        if (this.K1.getPlugin_num() != null) {
            String plugin_num = this.K1.getPlugin_num();
            if (plugin_num.equals(ConstantIntEnum.H5.value() + "")) {
                this.f32887t.setBackgroundResource(R.drawable.detial_simple_normal_selecter);
                TextView textView = this.f32887t;
                if (textView != null) {
                    textView.setText("打开");
                }
                showInstallButn();
                return;
            }
        }
        TextView textView2 = this.f32887t;
        if (textView2 != null) {
            textView2.setTextColor(getResources().getColor(R.color.white));
            this.f32887t.setBackgroundResource(R.drawable.detial_simple_normal_selecter);
        }
        DownloadTask downloadTask = this.f32884r2;
        int status = downloadTask != null ? downloadTask.getStatus() : 0;
        if (UtilsMy.w0(this.K1.getPay_tag_info(), this.K1.getCrc_sign_id()) > 0) {
            status = 43;
        }
        if (status == 9) {
            showInstallButn();
            this.f32887t.setText("更新");
            this.f32893w.setImageResource(R.drawable.detail_comment_download_continue);
            this.f32893w.setImageResource(R.drawable.detial_simple_install_selecter);
        } else if (status == 12) {
            showInstallButn();
            this.f32887t.setText("解压中..");
        } else if (status == 13) {
            showInstallButn();
            this.f32887t.setText("解压");
            this.f32893w.setImageResource(R.drawable.detail_comment_download_continue);
        } else if (status == 11) {
            showInstallButn();
            this.f32887t.setText("安装");
            this.f32887t.setBackgroundResource(R.drawable.detial_simple_install_selecter);
            this.f32893w.setImageResource(R.drawable.detial_simple_install_selecter);
        } else if (status == 5 || status == 42) {
            showInstallButn();
            m1(true);
            TextView textView3 = this.f32887t;
            if (textView3 != null) {
                textView3.setBackgroundResource(R.drawable.detial_simple_open_selecter);
                this.f32887t.setText(this.f32892v1.getResources().getString(R.string.download_status_finished));
                this.f32893w.setImageResource(R.drawable.detail_comment_download_continue);
            }
        } else if (status == 2) {
            showProgress();
            this.f32893w.setImageResource(R.drawable.detail_comment_download_pause);
            UtilsMy.x4(this.f32884r2);
            this.f32897y.setProgress((int) this.f32884r2.getProgress());
            TextView textView4 = this.f32895x;
            textView4.setText(this.f32884r2.getProgress() + "%");
        } else if (status == 3 || status == 6 || status == 27) {
            showProgress();
            this.f32893w.setImageResource(R.drawable.detail_comment_download_continue);
            UtilsMy.x4(this.f32884r2);
            this.f32897y.setProgress((int) this.f32884r2.getProgress());
            TextView textView5 = this.f32895x;
            textView5.setText(this.f32884r2.getProgress() + "%");
        } else if (status == 10) {
            showInstallButn();
            TextView textView6 = this.f32887t;
            textView6.setText("等待\u3000" + this.K1.getSize() + "M");
            this.f32893w.setImageResource(R.drawable.detail_comment_download_continue);
        } else if (status == 1) {
        } else {
            if (status == 43) {
                l1();
            } else if (status == 48) {
                showInstallButn();
                this.f32887t.setText(this.f32892v1.getResources().getString(R.string.download_status_installing));
            } else {
                l1();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void updateDownloadView() {
        try {
            int S = p1.f.K().S();
            this.C.setDownloadGameNum(S);
            if (S > 0) {
                this.C.d();
            } else {
                this.C.g();
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    void updateProgress(DownloadTask downloadTask) {
        if (downloadTask == null) {
            return;
        }
        ProgressBar progressBar = this.f32897y;
        if (progressBar instanceof DownloadProgressBar) {
            ((DownloadProgressBar) progressBar).update(downloadTask.getCrc_link_type_val(), 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void updateTitleButn(ResultMainBean resultMainBean, int i4) {
        if (resultMainBean.getFlag() == 1) {
            if (i4 == 1) {
                this.K1.setGame_follow(0);
            } else if (i4 == 2) {
                this.K1.setGame_follow(1);
                ToastManager.show("收藏成功");
                this.D.setImageResource(R.drawable.followed_image);
                this.E.setText("已收藏");
            } else if (i4 == 3) {
                this.K1.setGame_book(0);
            } else if (i4 == 4) {
                this.K1.setGame_book(1);
                Intent intent = new Intent("com.broadcast.bespeak.sussess");
                intent.putExtra("gameid", this.K1.getCrc_sign_id());
                this.f32892v1.sendBroadcast(intent);
                com.join.mgps.Util.b0.f0(this.f32892v1).O(this.f32892v1, 1, new i()).show();
            }
            R0();
            updateButn();
        }
    }

    String x0(String str) {
        GamedetialModleFourBean gamedetialModleFourBean = this.K1;
        return (gamedetialModleFourBean == null || TextUtils.isEmpty(gamedetialModleFourBean.getGame_btn_text())) ? str : this.K1.getGame_btn_text().length() > 10 ? this.K1.getGame_btn_text().substring(0, 10) : this.K1.getGame_btn_text();
    }

    void y0() {
        ExtBean extBean = this.f32853d;
        if (extBean == null || TextUtils.isEmpty(extBean.getFrom()) || !this.f32853d.getFrom().equals("updateFromMarket")) {
            return;
        }
        IntentUtil.getInstance().goMGMainActivity2Front(this.f32892v1);
    }

    boolean z0() {
        GamedetialModleFourBean gamedetialModleFourBean = this.J1;
        return (gamedetialModleFourBean == null || gamedetialModleFourBean.getGame_screen_shot() == null || this.J1.getGame_screen_shot().size() <= 0) ? false : true;
    }
}
