package com.join.mgps.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.Toolbar;
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
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.join.android.app.common.utils.APKUtils;
import com.join.android.app.common.utils.JsonMapper;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.component.video.StandardVideoView;
import com.join.android.app.mgsim.wufun.R;
import com.join.kotlin.ui.cloudarchive.GameDetailEmusCloudListFragment;
import com.join.kotlin.ui.cloudarchive.GameDetailModCloudListFragment;
import com.join.kotlin.ui.cloudarchive.IOnRunListener;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.Util.RequestBeanUtil;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.Util.m1;
import com.join.mgps.activity.gamedetail.BaseGameDetailFragment;
import com.join.mgps.activity.gamedetail.GamedetailVideoMainActivity;
import com.join.mgps.activity.gamedetail.GamedetailVideoMainActivity_;
import com.join.mgps.activity.login.LoginSplashActivity_;
import com.join.mgps.activity.screenshot.ScreenshotGamedetialBean;
import com.join.mgps.activity.screenshot.ScreenshotTrueListAcvity_;
import com.join.mgps.adapter.FragmentPagerAdapter;
import com.join.mgps.customview.CoordinatorLayout;
import com.join.mgps.customview.CustomerDownloadView;
import com.join.mgps.customview.DownloadProgressBar;
import com.join.mgps.customview.FlowLayout;
import com.join.mgps.customview.MViewpagerV4;
import com.join.mgps.customview.XListView2;
import com.join.mgps.customview.widget.detail.GameInfoCardView;
import com.join.mgps.customview.widget.detail.PcGameInfoCardView;
import com.join.mgps.dialog.DownloadMethodMultiDialog_;
import com.join.mgps.dto.CommentAlllistIntentData;
import com.join.mgps.dto.CommonRequestBean;
import com.join.mgps.dto.DetialShowImageBean;
import com.join.mgps.dto.DomainInfoBean;
import com.join.mgps.dto.ExtBean;
import com.join.mgps.dto.ExtInfoBean;
import com.join.mgps.dto.GameCfgBean;
import com.join.mgps.dto.GameFromBooleanBean;
import com.join.mgps.dto.GameFromPopoWinBean;
import com.join.mgps.dto.GamePromptBean;
import com.join.mgps.dto.GamedetialModleFourBean;
import com.join.mgps.dto.GamedetialMoreBean;
import com.join.mgps.dto.ImageInfo;
import com.join.mgps.dto.QueryDownloadInfoRequestArgs;
import com.join.mgps.dto.QueryDownloadInfoResponseData;
import com.join.mgps.dto.RequestGameIdArgs;
import com.join.mgps.dto.RequestModel;
import com.join.mgps.dto.RequestdetialFolowAndBeSpeak;
import com.join.mgps.dto.ResponseModel;
import com.join.mgps.dto.ResultMainBean;
import com.join.mgps.dto.ShareBean;
import com.join.mgps.enums.ConstantIntEnum;
import com.join.mgps.enums.Dtype;
import com.join.mgps.fragment.CommentAllListFragment;
import com.join.mgps.fragment.GameFormFragment;
import com.join.mgps.pref.PrefDef_;
import com.join.mgps.ptr.PtrClassicFrameLayout;
import com.papa.sim.statistic.Ext;
import com.papa.sim.statistic.Where;
import com.papa91.arc.ext.ToastManager;
import com.psk.eventmodule.Event;
import com.psk.eventmodule.StatFactory;
import com.uc.crashsdk.export.LogType;
import com.umeng.analytics.MobclickAgent;
import it.sephiroth.android.library.widget.AdapterView;
import it.sephiroth.android.library.widget.HListView;
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
@EFragment(R.layout.gamedetial_modle_five_fragment)
/* loaded from: classes.dex */
public class GamedetialModleFiveFragemnt extends BaseGameDetailFragment implements w1.i, com.join.mgps.customview.widget.detail.a {
    private static final String A2 = "view";

    /* renamed from: x2  reason: collision with root package name */
    static String f33018x2 = "0";
    static String y2 = "";

    /* renamed from: z2  reason: collision with root package name */
    static boolean f33019z2;
    @ViewById
    ImageView A;
    String A1;
    @ViewById
    ImageView B;
    String B1;
    @ViewById(R.id.title_normal_download_cdv)
    CustomerDownloadView C;
    @ViewById
    ImageView D;
    @ViewById
    TextView E;
    @ViewById
    TextView F;
    @ViewById
    Toolbar G;
    @ViewById
    CoordinatorLayout H;
    boolean H1;
    @ViewById
    View I;
    @ViewById
    View J;
    int J1;
    @ViewById
    View K;
    int K1;
    @ViewById
    View L;
    private int L1;
    @ViewById
    View M;
    private GamedetialModleFourBean M1;
    @ViewById
    View N;
    private GamedetialModleFourBean N1;
    @ViewById
    BottomSheetLayout O;
    PopupWindow O1;
    @ViewById
    LinearLayout P;
    LinearLayout P1;
    @ViewById
    SimpleDraweeView Q;
    LinearLayout Q1;
    @ViewById
    TextView R;
    LinearLayout R1;
    @ViewById
    LinearLayout S;
    EditText S1;
    @ViewById
    HListView T;
    TextView T1;
    @ViewById
    ImageView U;
    TextView U1;
    @ViewById
    RelativeLayout V;
    LinearLayout V1;
    @ViewById
    FrameLayout W;
    public XListView2 W1;
    com.join.mgps.customview.widget.detail.b X;
    b0 X1;
    @Pref
    PrefDef_ Y;
    com.join.mgps.rpc.b Y1;
    boolean Z;
    com.join.mgps.rpc.b Z1;

    /* renamed from: a2  reason: collision with root package name */
    GameFromPopoWinBean f33020a2;

    /* renamed from: b2  reason: collision with root package name */
    PtrClassicFrameLayout f33022b2;

    /* renamed from: c  reason: collision with root package name */
    String f33023c;

    /* renamed from: d  reason: collision with root package name */
    ExtBean f33025d;

    /* renamed from: e  reason: collision with root package name */
    boolean f33027e;
    @ViewById

    /* renamed from: f  reason: collision with root package name */
    RelativeLayout f33029f;
    @ViewById

    /* renamed from: g  reason: collision with root package name */
    View f33031g;

    /* renamed from: g2  reason: collision with root package name */
    private DownloadTask f33032g2;
    @ViewById

    /* renamed from: h  reason: collision with root package name */
    StandardVideoView f33033h;
    @ViewById

    /* renamed from: h2  reason: collision with root package name */
    TextView f33034h2;
    @ViewById

    /* renamed from: i  reason: collision with root package name */
    SimpleDraweeView f33035i;
    @ViewById

    /* renamed from: i2  reason: collision with root package name */
    ImageView f33036i2;
    @ViewById

    /* renamed from: j  reason: collision with root package name */
    SlidingTabLayout f33037j;
    @ViewById

    /* renamed from: j2  reason: collision with root package name */
    ImageView f33038j2;
    @ViewById

    /* renamed from: k  reason: collision with root package name */
    ViewPager f33039k;
    @ViewById

    /* renamed from: k2  reason: collision with root package name */
    ImageView f33040k2;
    @ViewById

    /* renamed from: l  reason: collision with root package name */
    ViewPager f33041l;
    @ViewById

    /* renamed from: l2  reason: collision with root package name */
    ImageView f33042l2;
    @ViewById

    /* renamed from: m  reason: collision with root package name */
    LinearLayout f33043m;

    /* renamed from: m2  reason: collision with root package name */
    private Animation f33044m2;
    @ViewById

    /* renamed from: n  reason: collision with root package name */
    View f33045n;

    /* renamed from: n2  reason: collision with root package name */
    private int f33046n2;
    @ViewById

    /* renamed from: o  reason: collision with root package name */
    AppBarLayout f33047o;

    /* renamed from: o2  reason: collision with root package name */
    private int f33048o2;
    @ViewById

    /* renamed from: p  reason: collision with root package name */
    CollapsingToolbarLayout f33049p;

    /* renamed from: p0  reason: collision with root package name */
    com.join.mgps.rpc.e f33050p0;

    /* renamed from: p1  reason: collision with root package name */
    GamedetailVideoMainActivity f33051p1;

    /* renamed from: p2  reason: collision with root package name */
    com.wufan.user.service.protobuf.n0 f33052p2;
    @ViewById

    /* renamed from: q  reason: collision with root package name */
    RelativeLayout f33053q;
    @ViewById

    /* renamed from: r  reason: collision with root package name */
    RelativeLayout f33055r;
    @ViewById

    /* renamed from: s  reason: collision with root package name */
    RelativeLayout f33057s;
    @ViewById

    /* renamed from: t  reason: collision with root package name */
    TextView f33059t;
    @ViewById

    /* renamed from: u  reason: collision with root package name */
    RelativeLayout f33061u;
    @ViewById

    /* renamed from: v  reason: collision with root package name */
    ConstraintLayout f33063v;

    /* renamed from: v1  reason: collision with root package name */
    private com.join.android.app.common.manager.b f33064v1;
    @ViewById

    /* renamed from: w  reason: collision with root package name */
    ImageView f33065w;
    @ViewById

    /* renamed from: x  reason: collision with root package name */
    TextView f33067x;
    @ViewById

    /* renamed from: y  reason: collision with root package name */
    ProgressBar f33068y;
    @ViewById

    /* renamed from: z  reason: collision with root package name */
    LinearLayout f33069z;

    /* renamed from: b  reason: collision with root package name */
    private String f33021b = "GamedetialModleFiveFragemnt";
    int C1 = 0;
    String D1 = "";
    boolean E1 = false;
    boolean F1 = false;
    boolean G1 = false;
    boolean I1 = false;

    /* renamed from: c2  reason: collision with root package name */
    int f33024c2 = 1;

    /* renamed from: d2  reason: collision with root package name */
    List<GameFromPopoWinBean.DataBean> f33026d2 = new ArrayList();

    /* renamed from: e2  reason: collision with root package name */
    boolean f33028e2 = true;

    /* renamed from: f2  reason: collision with root package name */
    boolean f33030f2 = false;

    /* renamed from: q2  reason: collision with root package name */
    Map<String, DownloadTask> f33054q2 = new HashMap();

    /* renamed from: r2  reason: collision with root package name */
    Map<String, DownloadTask> f33056r2 = new HashMap();

    /* renamed from: s2  reason: collision with root package name */
    boolean f33058s2 = false;

    /* renamed from: t2  reason: collision with root package name */
    private List<y> f33060t2 = new ArrayList();

    /* renamed from: u2  reason: collision with root package name */
    BannerPagerAdapter f33062u2 = new BannerPagerAdapter();
    com.join.mgps.adapter.u0 v2 = null;

    /* renamed from: w2  reason: collision with root package name */
    List<ImageInfo> f33066w2 = new ArrayList();

    /* loaded from: classes4.dex */
    public class BannerPagerAdapter extends PagerAdapter {

        /* loaded from: classes4.dex */
        class a implements View.OnClickListener {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ int f33071b;

            a(int i4) {
                this.f33071b = i4;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                int i4 = 0;
                if (GamedetialModleFiveFragemnt.this.I0()) {
                    if (this.f33071b == 0) {
                        return;
                    }
                    if (GamedetialModleFiveFragemnt.this.H0()) {
                        ScreenshotTrueListAcvity_.intent(GamedetialModleFiveFragemnt.this.f33051p1).fromData(GamedetialModleFiveFragemnt.this.M1.getGame_screen_shot().get(this.f33071b - 1)).gameId(GamedetialModleFiveFragemnt.this.M1.getGame_id()).start();
                        return;
                    }
                    List<DetialShowImageBean> pic_info = GamedetialModleFiveFragemnt.this.M1.getPic_info();
                    ArrayList arrayList = new ArrayList();
                    if (pic_info != null) {
                        for (int i5 = 0; i5 < pic_info.size(); i5++) {
                            arrayList.add(pic_info.get(i5).getRemote().getPath());
                        }
                    }
                    try {
                        Intent intent = new Intent(GamedetialModleFiveFragemnt.this.f33051p1, ImagePagerActivity.class);
                        String[] strArr = new String[arrayList.size()];
                        while (i4 < arrayList.size()) {
                            strArr[i4] = (String) arrayList.get(i4);
                            i4++;
                        }
                        intent.putExtra("image_urls", strArr);
                        intent.putExtra("image_index", this.f33071b - 1);
                        GamedetialModleFiveFragemnt.this.f33051p1.startActivity(intent);
                    } catch (Exception e5) {
                        e5.printStackTrace();
                    }
                } else if (GamedetialModleFiveFragemnt.this.H0()) {
                    ScreenshotTrueListAcvity_.intent(GamedetialModleFiveFragemnt.this.f33051p1).fromData(GamedetialModleFiveFragemnt.this.M1.getGame_screen_shot().get(this.f33071b)).gameId(GamedetialModleFiveFragemnt.this.M1.getGame_id()).start();
                } else {
                    List<DetialShowImageBean> pic_info2 = GamedetialModleFiveFragemnt.this.M1.getPic_info();
                    ArrayList arrayList2 = new ArrayList();
                    if (com.join.mgps.Util.g2.i(GamedetialModleFiveFragemnt.this.M1.getGame_info_top_pic()) && com.join.mgps.Util.g2.i(GamedetialModleFiveFragemnt.this.M1.getGame_info_top_video_url())) {
                        arrayList2.add(GamedetialModleFiveFragemnt.this.M1.getGame_info_top_pic());
                    }
                    if (pic_info2 != null) {
                        for (int i6 = 0; i6 < pic_info2.size(); i6++) {
                            arrayList2.add(pic_info2.get(i6).getRemote().getPath());
                        }
                    }
                    try {
                        Intent intent2 = new Intent(GamedetialModleFiveFragemnt.this.f33051p1, ImagePagerActivity.class);
                        String[] strArr2 = new String[arrayList2.size()];
                        while (i4 < arrayList2.size()) {
                            strArr2[i4] = (String) arrayList2.get(i4);
                            i4++;
                        }
                        intent2.putExtra("image_urls", strArr2);
                        intent2.putExtra("image_index", this.f33071b);
                        GamedetialModleFiveFragemnt.this.f33051p1.startActivity(intent2);
                    } catch (Exception e6) {
                        e6.printStackTrace();
                    }
                }
            }
        }

        public BannerPagerAdapter() {
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public void destroyItem(ViewGroup viewGroup, int i4, Object obj) {
            viewGroup.removeView((View) obj);
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public int getCount() {
            return GamedetialModleFiveFragemnt.this.f33060t2.size();
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public float getPageWidth(int i4) {
            if (((y) GamedetialModleFiveFragemnt.this.f33060t2.get(i4)).f33119a) {
                return 1.0f;
            }
            GamedetialModleFiveFragemnt gamedetialModleFiveFragemnt = GamedetialModleFiveFragemnt.this;
            if (gamedetialModleFiveFragemnt.E1 && ((y) gamedetialModleFiveFragemnt.f33060t2.get(i4)).f33121c == 1) {
                return 1.0f;
            }
            if (((y) GamedetialModleFiveFragemnt.this.f33060t2.get(i4)).f33121c == 1) {
                return 0.33f;
            }
            return super.getPageWidth(i4);
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public Object instantiateItem(ViewGroup viewGroup, int i4) {
            viewGroup.addView(((y) GamedetialModleFiveFragemnt.this.f33060t2.get(i4)).f33120b);
            View e5 = ((y) GamedetialModleFiveFragemnt.this.f33060t2.get(i4)).e();
            e5.setOnClickListener(new a(i4));
            return e5;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public boolean isViewFromObject(View view, Object obj) {
            return view == obj;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            String trim = GamedetialModleFiveFragemnt.this.S1.getText().toString().trim();
            GamedetialModleFiveFragemnt.y2 = trim;
            if (com.join.mgps.Util.o.f(trim)) {
                GamedetialModleFiveFragemnt.this.showToast("不能上传表情");
                return;
            }
            GamedetialModleFiveFragemnt.this.O1.dismiss();
            GamedetialModleFiveFragemnt gamedetialModleFiveFragemnt = GamedetialModleFiveFragemnt.this;
            if (gamedetialModleFiveFragemnt.f33028e2) {
                return;
            }
            gamedetialModleFiveFragemnt.f33028e2 = true;
            gamedetialModleFiveFragemnt.d0();
        }
    }

    /* loaded from: classes4.dex */
    class a0 extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
        a0() {
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
            ImageView imageView = new ImageView(GamedetialModleFiveFragemnt.this.f33051p1);
            imageView.setImageResource(R.drawable.icon);
            return new z(imageView);
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
    public class b0 extends BaseAdapter {

        /* loaded from: classes4.dex */
        class a implements View.OnClickListener {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ GameFromPopoWinBean.DataBean f33077b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ c0 f33078c;

            a(GameFromPopoWinBean.DataBean dataBean, c0 c0Var) {
                this.f33077b = dataBean;
                this.f33078c = c0Var;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (this.f33077b.getCurrent_game_state().equals("0")) {
                    this.f33078c.f33082b.setBackgroundResource(R.drawable.followed_image);
                    GamedetialModleFiveFragemnt.this.P1.setVisibility(0);
                    GamedetialModleFiveFragemnt.this.W1.setVisibility(8);
                    GamedetialModleFiveFragemnt.this.T1.setVisibility(0);
                    GamedetialModleFiveFragemnt.this.U1.setText("收藏成功");
                    GamedetialModleFiveFragemnt.this.V1.setVisibility(8);
                    GamedetialModleFiveFragemnt.f33018x2 = this.f33077b.getId();
                    GamedetialModleFiveFragemnt gamedetialModleFiveFragemnt = GamedetialModleFiveFragemnt.this;
                    gamedetialModleFiveFragemnt.f33028e2 = false;
                    int i4 = gamedetialModleFiveFragemnt.C1 + 1;
                    gamedetialModleFiveFragemnt.C1 = i4;
                    if (i4 > 0) {
                        gamedetialModleFiveFragemnt.D.setImageResource(R.drawable.followed_image);
                        GamedetialModleFiveFragemnt.this.E.setText("已收藏");
                        return;
                    }
                    return;
                }
                this.f33078c.f33082b.setBackgroundResource(R.drawable.follow_none_image);
                this.f33077b.setCurrent_game_state("0");
                GamedetialModleFiveFragemnt.this.e0(this.f33077b.getId(), GamedetialModleFiveFragemnt.this.f33023c, this.f33078c);
                GamedetialModleFiveFragemnt gamedetialModleFiveFragemnt2 = GamedetialModleFiveFragemnt.this;
                int i5 = gamedetialModleFiveFragemnt2.C1 - 1;
                gamedetialModleFiveFragemnt2.C1 = i5;
                gamedetialModleFiveFragemnt2.C1 = i5;
                if (i5 == 0) {
                    gamedetialModleFiveFragemnt2.D.setImageResource(R.drawable.follow_none_image);
                    GamedetialModleFiveFragemnt.this.E.setText("收藏");
                }
            }
        }

        b0() {
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return GamedetialModleFiveFragemnt.this.f33026d2.size();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i4) {
            if (i4 < GamedetialModleFiveFragemnt.this.f33026d2.size()) {
                return GamedetialModleFiveFragemnt.this.f33026d2.get(i4);
            }
            return null;
        }

        @Override // android.widget.Adapter
        public long getItemId(int i4) {
            return i4;
        }

        @Override // android.widget.Adapter
        public View getView(int i4, View view, ViewGroup viewGroup) {
            c0 c0Var;
            if (view == null) {
                view = LayoutInflater.from(GamedetialModleFiveFragemnt.this.f33051p1).inflate(R.layout.list_item, (ViewGroup) null);
                c0Var = new c0();
                c0Var.f33081a = (SimpleDraweeView) view.findViewById(R.id.iv_img);
                c0Var.f33082b = (ImageView) view.findViewById(R.id.iv_coll);
                c0Var.f33083c = (TextView) view.findViewById(R.id.tv_title);
                c0Var.f33084d = (TextView) view.findViewById(R.id.tv_size);
                c0Var.f33086f = (RelativeLayout) view.findViewById(R.id.ll_gameform);
                c0Var.f33087g = (RelativeLayout) view.findViewById(R.id.rl_content);
                view.setTag(c0Var);
            } else {
                c0Var = (c0) view.getTag();
            }
            if (getItem(i4) == null) {
                return view;
            }
            GameFromPopoWinBean.DataBean dataBean = (GameFromPopoWinBean.DataBean) getItem(i4);
            if (dataBean.getGame_list().get(0).getGame_ico() != null && !dataBean.getGame_list().get(0).getGame_ico().equals("")) {
                c0Var.f33081a.setImageURI(dataBean.getGame_list().get(0).getGame_ico());
            } else {
                c0Var.f33081a.setImageResource(R.drawable.main_normal_icon);
            }
            c0Var.f33083c.setText(dataBean.getTitle());
            c0Var.f33084d.setText(dataBean.getGame_count() + "款");
            if (dataBean.getCurrent_game_state().equals("0")) {
                c0Var.f33082b.setBackgroundResource(R.drawable.follow_none_image);
            } else {
                c0Var.f33082b.setBackgroundResource(R.drawable.followed_image);
                GamedetialModleFiveFragemnt.this.C1++;
            }
            c0Var.f33087g.setOnClickListener(new a(dataBean, c0Var));
            return view;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GamedetialModleFiveFragemnt.this.i1();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class c0 {

        /* renamed from: a  reason: collision with root package name */
        SimpleDraweeView f33081a;

        /* renamed from: b  reason: collision with root package name */
        ImageView f33082b;

        /* renamed from: c  reason: collision with root package name */
        TextView f33083c;

        /* renamed from: d  reason: collision with root package name */
        TextView f33084d;

        /* renamed from: e  reason: collision with root package name */
        TextView f33085e;

        /* renamed from: f  reason: collision with root package name */
        RelativeLayout f33086f;

        /* renamed from: g  reason: collision with root package name */
        RelativeLayout f33087g;

        c0() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class d implements View.OnClickListener {
        d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GamedetialModleFiveFragemnt.this.i1();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class e implements View.OnClickListener {
        e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IntentUtil.getInstance().goShareWebActivity(GamedetialModleFiveFragemnt.this.getContext(), GamedetialModleFiveFragemnt.this.M1.getActivity_entry().getUrl() + GamedetialModleFiveFragemnt.this.M1.getCrc_sign_id());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class f implements Animation.AnimationListener {
        f() {
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
    public class g implements m1.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f33092a;

        g(boolean z4) {
            this.f33092a = z4;
        }

        @Override // com.join.mgps.Util.m1.b
        public void a(m1.c cVar) {
            if (cVar.a() == 1) {
                GamedetialModleFiveFragemnt.this.f33051p1.clickBack();
                com.join.mgps.Util.m1 c5 = com.join.mgps.Util.m1.c();
                GamedetialModleFiveFragemnt gamedetialModleFiveFragemnt = GamedetialModleFiveFragemnt.this;
                c5.e(gamedetialModleFiveFragemnt.f33051p1, gamedetialModleFiveFragemnt.f33025d.getFrom_id(), cVar.b());
                ToastManager.show("授权成功");
            } else if (this.f33092a) {
                GamedetialModleFiveFragemnt.this.y1(false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class h implements w1.c {
        h() {
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
    public class i implements ViewPager.OnPageChangeListener {
        i() {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i4) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i4, float f5, int i5) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i4) {
            com.join.mgps.adapter.u0 u0Var = GamedetialModleFiveFragemnt.this.v2;
            if (u0Var != null && i4 < u0Var.getCount() && GamedetialModleFiveFragemnt.this.v2.getItem(i4).isVideo()) {
                GamedetialModleFiveFragemnt.this.d1();
            } else {
                GamedetialModleFiveFragemnt.this.pauseVideo();
            }
            GamedetialModleFiveFragemnt.this.T.P0(i4);
            GamedetialModleFiveFragemnt.this.v2.c(i4);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class j implements AdapterView.d {
        j() {
        }

        @Override // it.sephiroth.android.library.widget.AdapterView.d
        public void a(AdapterView<?> adapterView, View view, int i4, long j4) {
            if (GamedetialModleFiveFragemnt.this.v2.getItem(i4).isVideo()) {
                GamedetialModleFiveFragemnt.this.d1();
            } else {
                GamedetialModleFiveFragemnt.this.pauseVideo();
            }
            GamedetialModleFiveFragemnt.this.f33041l.setCurrentItem(i4);
            GamedetialModleFiveFragemnt.this.v2.c(i4);
        }
    }

    /* loaded from: classes4.dex */
    class k implements AppBarLayout.OnOffsetChangedListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f33097a;

        k(int i4) {
            this.f33097a = i4;
        }

        @Override // com.google.android.material.appbar.AppBarLayout.OnOffsetChangedListener, com.google.android.material.appbar.AppBarLayout.BaseOnOffsetChangedListener
        public void onOffsetChanged(AppBarLayout appBarLayout, int i4) {
            int currentState;
            View view;
            try {
                if (Math.abs(i4) < this.f33097a && ((view = GamedetialModleFiveFragemnt.this.f33031g) == null || view.getVisibility() != 0)) {
                    GamedetialModleFiveFragemnt.this.f33055r.setVisibility(0);
                    GamedetialModleFiveFragemnt.this.f33057s.setVisibility(0);
                    GamedetialModleFiveFragemnt.this.f33053q.setVisibility(8);
                    GamedetialModleFiveFragemnt.this.G.getBackground().setAlpha(0);
                    GamedetialModleFiveFragemnt gamedetialModleFiveFragemnt = GamedetialModleFiveFragemnt.this;
                    StandardVideoView standardVideoView = gamedetialModleFiveFragemnt.f33033h;
                    if (standardVideoView != null && !gamedetialModleFiveFragemnt.f33058s2 && standardVideoView.getCurrentState() == 5 && GamedetialModleFiveFragemnt.this.f33033h.d()) {
                        GamedetialModleFiveFragemnt.this.f33033h.onVideoResume(false);
                    }
                    if (GamedetialModleFiveFragemnt.this.f33064v1 != null) {
                        GamedetialModleFiveFragemnt.this.f33064v1.n(R.color.black_alpha);
                    }
                    GamedetialModleFiveFragemnt.this.N.setVisibility(4);
                    return;
                }
                GamedetialModleFiveFragemnt.this.f33053q.setVisibility(0);
                GamedetialModleFiveFragemnt.this.f33055r.setVisibility(8);
                GamedetialModleFiveFragemnt.this.f33057s.setVisibility(8);
                GamedetialModleFiveFragemnt.this.G.getBackground().setAlpha(255);
                StandardVideoView standardVideoView2 = GamedetialModleFiveFragemnt.this.f33033h;
                if (standardVideoView2 != null && standardVideoView2.d() && (currentState = GamedetialModleFiveFragemnt.this.f33033h.getCurrentState()) == 2) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("currentState=");
                    sb.append(currentState);
                    sb.append(" -->performClick");
                    GamedetialModleFiveFragemnt.this.f33033h.onVideoPause();
                }
                if (GamedetialModleFiveFragemnt.this.f33064v1 != null) {
                    GamedetialModleFiveFragemnt.this.f33064v1.n(R.color.black_30_alpha);
                }
                GamedetialModleFiveFragemnt.this.N.setVisibility(0);
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class l implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f33099b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f33100c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f33101d;

        l(int i4, int i5, int i6) {
            this.f33099b = i4;
            this.f33100c = i5;
            this.f33101d = i6;
        }

        @Override // java.lang.Runnable
        public void run() {
            AppBarLayout appBarLayout;
            GamedetialModleFiveFragemnt gamedetialModleFiveFragemnt = GamedetialModleFiveFragemnt.this;
            int i4 = gamedetialModleFiveFragemnt.I1 ? gamedetialModleFiveFragemnt.J1 : 0;
            int i5 = this.f33099b + this.f33100c + this.f33101d + gamedetialModleFiveFragemnt.L1;
            GamedetialModleFiveFragemnt gamedetialModleFiveFragemnt2 = GamedetialModleFiveFragemnt.this;
            int i6 = (i5 - gamedetialModleFiveFragemnt2.K1) + i4;
            if (i6 <= 0 || (appBarLayout = gamedetialModleFiveFragemnt2.f33047o) == null) {
                return;
            }
            CoordinatorLayout.Behavior behavior = ((CoordinatorLayout.LayoutParams) appBarLayout.getLayoutParams()).getBehavior();
            if (behavior instanceof AppBarLayout.Behavior) {
                ((AppBarLayout.Behavior) behavior).setTopAndBottomOffset(-i6);
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
            View view = GamedetialModleFiveFragemnt.this.I;
            if (view != null) {
                view.setVisibility(8);
            }
            View view2 = GamedetialModleFiveFragemnt.this.J;
            if (view2 != null) {
                view2.setVisibility(8);
            }
        }
    }

    /* loaded from: classes4.dex */
    class n implements View.OnClickListener {
        n() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (!AccountUtil_.getInstance_(GamedetialModleFiveFragemnt.this.f33051p1).isTourist()) {
                IntentUtil.getInstance().goShareWebActivity(GamedetialModleFiveFragemnt.this.getContext(), GamedetialModleFiveFragemnt.this.M1.getFeedback_issue_url());
            } else {
                IntentUtil.getInstance().goLogin(GamedetialModleFiveFragemnt.this.f33051p1);
            }
        }
    }

    /* loaded from: classes4.dex */
    class o extends BaseAdapter {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f33105b;

        /* loaded from: classes4.dex */
        class a {

            /* renamed from: a  reason: collision with root package name */
            public TextView f33107a;

            a() {
            }
        }

        o(List list) {
            this.f33105b = list;
        }

        @Override // android.widget.Adapter
        /* renamed from: a */
        public String getItem(int i4) {
            return (String) this.f33105b.get(i4);
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return this.f33105b.size();
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
                aVar2.f33107a = (TextView) inflate.findViewById(R.id.name);
                inflate.setTag(aVar2);
                aVar = aVar2;
                view = inflate;
            }
            aVar.f33107a.setText(getItem(i4));
            ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) aVar.f33107a.getLayoutParams();
            if (i4 == getCount() - 1) {
                ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = context.getResources().getDimensionPixelOffset(R.dimen.wdp20);
            } else {
                ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = 0;
            }
            aVar.f33107a.setLayoutParams(layoutParams);
            return view;
        }
    }

    /* loaded from: classes4.dex */
    class p implements AdapterView.OnItemClickListener {
        p() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(android.widget.AdapterView<?> adapterView, View view, int i4, long j4) {
            GamedetialModleFiveFragemnt.this.O.r();
            GamedetialModleFiveFragemnt.this.u0(view.getContext(), GameMainActivity4.I2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class q implements w1.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ GamedetialModleFourBean f33110a;

        q(GamedetialModleFourBean gamedetialModleFourBean) {
            this.f33110a = gamedetialModleFourBean;
        }

        @Override // w1.b
        public GamedetialModleFourBean a() {
            return this.f33110a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class r implements IOnRunListener {
        r() {
        }

        @Override // com.join.kotlin.ui.cloudarchive.IOnRunListener
        public void onRun() {
            GamedetialModleFiveFragemnt gamedetialModleFiveFragemnt = GamedetialModleFiveFragemnt.this;
            gamedetialModleFiveFragemnt.u0(gamedetialModleFiveFragemnt.getContext(), "云存档");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class s implements Runnable {
        s() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AppBarLayout appBarLayout;
            CoordinatorLayout.Behavior behavior;
            if (GamedetialModleFiveFragemnt.this.getActivity() == null || GamedetialModleFiveFragemnt.this.getActivity().isFinishing() || GamedetialModleFiveFragemnt.this.getActivity().isDestroyed() || (appBarLayout = GamedetialModleFiveFragemnt.this.f33047o) == null || (behavior = ((CoordinatorLayout.LayoutParams) appBarLayout.getLayoutParams()).getBehavior()) == null) {
                return;
            }
            int[] iArr = new int[2];
            GamedetialModleFiveFragemnt.this.f33037j.getLocationInWindow(iArr);
            GamedetialModleFiveFragemnt gamedetialModleFiveFragemnt = GamedetialModleFiveFragemnt.this;
            behavior.onNestedPreScroll(gamedetialModleFiveFragemnt.H, gamedetialModleFiveFragemnt.f33047o, gamedetialModleFiveFragemnt.f33037j, 0, iArr[1], new int[]{0, 0}, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class t implements PopupWindow.OnDismissListener {
        t() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            GamedetialModleFiveFragemnt gamedetialModleFiveFragemnt = GamedetialModleFiveFragemnt.this;
            gamedetialModleFiveFragemnt.f33024c2 = 1;
            gamedetialModleFiveFragemnt.q0();
            GamedetialModleFiveFragemnt gamedetialModleFiveFragemnt2 = GamedetialModleFiveFragemnt.this;
            gamedetialModleFiveFragemnt2.C1 = 0;
            gamedetialModleFiveFragemnt2.g1(1.0f);
            GamedetialModleFiveFragemnt.y2 = GamedetialModleFiveFragemnt.this.S1.getText().toString().trim();
            GamedetialModleFiveFragemnt gamedetialModleFiveFragemnt3 = GamedetialModleFiveFragemnt.this;
            if (gamedetialModleFiveFragemnt3.f33028e2) {
                return;
            }
            gamedetialModleFiveFragemnt3.f33028e2 = true;
            gamedetialModleFiveFragemnt3.d0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class u implements com.join.mgps.customview.g {
        u() {
        }

        @Override // com.join.mgps.customview.g
        public void onRefresh() {
            GamedetialModleFiveFragemnt gamedetialModleFiveFragemnt = GamedetialModleFiveFragemnt.this;
            gamedetialModleFiveFragemnt.f33024c2 = 1;
            gamedetialModleFiveFragemnt.g0();
            GamedetialModleFiveFragemnt.this.y0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class v implements com.join.mgps.customview.f {
        v() {
        }

        @Override // com.join.mgps.customview.f
        public void onLoadMore() {
            GamedetialModleFiveFragemnt.this.g0();
            GamedetialModleFiveFragemnt.this.y0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class w implements View.OnClickListener {
        w() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GamedetialModleFiveFragemnt.this.O1.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class x implements View.OnClickListener {
        x() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GamedetialModleFiveFragemnt.f33019z2 = true;
            GamedetialModleFiveFragemnt.this.startActivity(new Intent(GamedetialModleFiveFragemnt.this.f33051p1, BuildGameFromActivity_.class));
        }
    }

    /* loaded from: classes4.dex */
    public class y {

        /* renamed from: a  reason: collision with root package name */
        private boolean f33119a;

        /* renamed from: b  reason: collision with root package name */
        private View f33120b;

        /* renamed from: c  reason: collision with root package name */
        private int f33121c;

        public y(boolean z4, View view, int i4) {
            this.f33119a = z4;
            this.f33120b = view;
            this.f33121c = i4;
        }

        public int d() {
            return this.f33121c;
        }

        public View e() {
            return this.f33120b;
        }

        public boolean f() {
            return this.f33119a;
        }

        public void g(int i4) {
            this.f33121c = i4;
        }

        public void h(boolean z4) {
            this.f33119a = z4;
        }

        public void i(View view) {
            this.f33120b = view;
        }
    }

    /* loaded from: classes4.dex */
    class z extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        ImageView f33123a;

        public z(View view) {
            super(view);
            this.f33123a = (ImageView) view.findViewById(R.id.img);
        }
    }

    public static GamedetialModleFiveFragemnt A0(String str, ExtBean extBean, boolean z4, boolean z5, boolean z6) {
        GamedetialModleFiveFragemnt_ gamedetialModleFiveFragemnt_ = new GamedetialModleFiveFragemnt_();
        Bundle bundle = new Bundle();
        bundle.putBoolean(GamedetailVideoMainActivity_.AUTODOWN_EXTRA, z4);
        bundle.putSerializable("extBean", extBean);
        bundle.putString("gameId", str);
        bundle.putBoolean(EndGameDetailActivity_.R, z5);
        bundle.putBoolean(GamedetailVideoMainActivity_.IS_SHOW_COMMENT_EXTRA, z6);
        gamedetialModleFiveFragemnt_.setArguments(bundle);
        return gamedetialModleFiveFragemnt_;
    }

    private int B0(Context context) {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("navigation_bar_height", "dimen", q.a.f73126a);
        if (identifier > 0) {
            return resources.getDimensionPixelSize(identifier);
        }
        return 0;
    }

    private static String D0(Context context, int i4) {
        try {
            return context.getResources().getResourceEntryName(i4);
        } catch (Exception unused) {
            return "";
        }
    }

    public static int E0(Context context) {
        return context.getResources().getDisplayMetrics().heightPixels;
    }

    private int F0(Activity activity) {
        WindowManager windowManager = activity.getWindow().getWindowManager();
        Point point = new Point();
        windowManager.getDefaultDisplay().getRealSize(point);
        return point.y;
    }

    private void M0() {
        try {
            if (this.f33033h != null) {
                if (!com.join.mgps.Util.g2.i(this.M1.getGame_info_top_video_url()) && !com.join.mgps.Util.g2.i(this.M1.getGame_info_top_pic())) {
                    this.f33031g.setVisibility(0);
                    this.f33035i.setVisibility(8);
                    this.f33033h.setVisibility(8);
                    return;
                }
                String game_info_top_video_url = this.M1.getGame_info_top_video_url();
                if (com.join.mgps.Util.g2.h(game_info_top_video_url)) {
                    MyImageLoader.d(this.f33035i, R.drawable.banner_normal_icon, this.M1.getGame_info_top_pic());
                    this.f33033h.setVisibility(8);
                    this.f33035i.setVisibility(0);
                    return;
                }
                MyImageLoader.h(this.f33033h.f15277b, this.M1.getGame_info_top_pic());
                this.f33033h.setMuteWhenPlay(false);
                this.f33033h.setPlayTag(this.D1);
                this.f33033h.setShowCoverWhenPause(false);
                if (this.H1) {
                    com.join.android.app.component.video.i.c(this.f33033h, game_info_top_video_url, false, "");
                    com.join.android.app.component.video.i.a(this.f33033h);
                    this.f33033h.setCover(this.M1.getGame_info_top_pic());
                } else {
                    this.f33033h.setUp(game_info_top_video_url, StandardVideoView.D, this.M1.getGame_name(), this.M1.getGame_info_top_pic());
                }
                r0(game_info_top_video_url);
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Q0(View view) {
        this.O.r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void R0(View view) {
        this.O.r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void S0(View view) {
        this.O.r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void T0(GamedetialMoreBean gamedetialMoreBean, View view) {
        IntentUtil.getInstance().goShareWebActivity(this.f33051p1, gamedetialMoreBean.getPrivacy_policy_url());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void U0(GamedetialMoreBean gamedetialMoreBean, View view) {
        GameDetailPermissionActivity_.f0(this.f33051p1).a(gamedetialMoreBean.getSensitive_authority()).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void V0(View view) {
        IntentUtil.getInstance().goShareWebActivity(this.f33051p1, "https://beian.miit.gov.cn/#/home");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void W0(View view) {
        if (com.join.mgps.Util.g2.h(this.M1.getGame_company_id()) || "0".equals(this.M1.getGame_company_id())) {
            return;
        }
        PaPaBannerListActivity_.k0(this.f33051p1).e(1).a(true).c(this.M1.getGame_company_id()).d(this.M1.getCompany_name()).start();
    }

    private void b1() {
    }

    private void c1() {
        if (this.H1) {
            return;
        }
        StandardVideoView standardVideoView = this.f33033h;
        if (standardVideoView != null) {
            standardVideoView.release();
        }
        com.join.android.app.component.video.a.n0(this.D1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d1() {
        StandardVideoView standardVideoView = this.f33033h;
        if (standardVideoView == null || !standardVideoView.d()) {
            return;
        }
        this.f33058s2 = false;
        this.f33033h.onVideoResume(false);
    }

    private void e1(String str, String str2, StatFactory.VolcanoOther volcanoOther, boolean z4) {
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
                    StatFactory.Companion.getInstance(this.f33051p1).sendEvent(new StatFactory.VolcanoEvent(Event.check, str2, new StatFactory.SpmData("wufun", str4, str6, str5, true), volcanoOther, z4));
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
                StatFactory.Companion.getInstance(this.f33051p1).sendEvent(new StatFactory.VolcanoEvent(Event.check, str2, new StatFactory.SpmData("wufun", str4, str6, str5, true), volcanoOther, z4));
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
            StatFactory.Companion.getInstance(this.f33051p1).sendEvent(new StatFactory.VolcanoEvent(Event.check, str2, new StatFactory.SpmData("wufun", str4, str6, str5, true), volcanoOther, z4));
        }
        str4 = "home";
        str5 = "0";
        str6 = "";
        StatFactory.Companion.getInstance(this.f33051p1).sendEvent(new StatFactory.VolcanoEvent(Event.check, str2, new StatFactory.SpmData("wufun", str4, str6, str5, true), volcanoOther, z4));
    }

    private int getStatusBarHeight(Context context) {
        int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", q.a.f73126a);
        if (identifier > 0) {
            return context.getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    public static GamedetialModleFiveFragemnt z0(String str, ExtBean extBean, boolean z4) {
        GamedetialModleFiveFragemnt_ gamedetialModleFiveFragemnt_ = new GamedetialModleFiveFragemnt_();
        Bundle bundle = new Bundle();
        bundle.putBoolean(GamedetailVideoMainActivity_.AUTODOWN_EXTRA, z4);
        bundle.putSerializable("extBean", extBean);
        bundle.putString("gameId", str);
        bundle.putBoolean(EndGameDetailActivity_.R, false);
        gamedetialModleFiveFragemnt_.setArguments(bundle);
        return gamedetialModleFiveFragemnt_;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Receiver(actions = {"com.broadcast.bespeak.sussess"})
    public void A1() {
        this.N1.setGame_book(1);
        updateButn();
    }

    @Override // w1.i
    public void C() {
        View inflate = LayoutInflater.from(this.f33051p1).inflate(R.layout.layout_pc_game_detail_sheet_profile, (ViewGroup) this.O, false);
        View findViewById = inflate.findViewById(R.id.scrollView);
        TextView textView = (TextView) inflate.findViewById(R.id.tv_label1);
        TextView textView2 = (TextView) inflate.findViewById(R.id.tv_label2);
        TextView textView3 = (TextView) inflate.findViewById(R.id.tv_label3);
        TextView textView4 = (TextView) inflate.findViewById(R.id.tv_label4);
        TextView textView5 = (TextView) inflate.findViewById(R.id.tv_value1);
        TextView textView6 = (TextView) inflate.findViewById(R.id.tv_value2);
        TextView textView7 = (TextView) inflate.findViewById(R.id.tv_value3);
        TextView textView8 = (TextView) inflate.findViewById(R.id.tv_value4);
        TextView textView9 = (TextView) inflate.findViewById(R.id.tv_label21);
        TextView textView10 = (TextView) inflate.findViewById(R.id.tv_label22);
        TextView textView11 = (TextView) inflate.findViewById(R.id.tv_label23);
        TextView textView12 = (TextView) inflate.findViewById(R.id.tv_label24);
        TextView textView13 = (TextView) inflate.findViewById(R.id.tv_label25);
        TextView textView14 = (TextView) inflate.findViewById(R.id.tv_value21);
        TextView textView15 = (TextView) inflate.findViewById(R.id.tv_value22);
        TextView textView16 = (TextView) inflate.findViewById(R.id.tv_value23);
        TextView textView17 = (TextView) inflate.findViewById(R.id.tv_value24);
        TextView textView18 = (TextView) inflate.findViewById(R.id.tv_value25);
        inflate.findViewById(R.id.close).setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.activity.o0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GamedetialModleFiveFragemnt.this.R0(view);
            }
        });
        ExtInfoBean ext_info = this.M1.getExt_info();
        if (ext_info != null && ext_info.getGame_cfg() != null) {
            GameCfgBean game_cfg = ext_info.getGame_cfg();
            textView.setText("类型：");
            textView2.setText("首发日期：");
            textView3.setText("支持语言：");
            textView4.setText("游戏大小：");
            textView5.setText(game_cfg.getGame_type());
            textView6.setText(game_cfg.getFirst_date());
            textView7.setText(game_cfg.getLanguage());
            try {
                textView8.setText(UtilsMy.a((long) (Double.parseDouble(game_cfg.getGame_size()) * 1024.0d * 1024.0d)));
            } catch (Exception e5) {
                e5.printStackTrace();
            }
            textView9.setText("CPU：");
            textView10.setText("内存：");
            textView11.setText("显卡：");
            textView12.setText("操作系统: ");
            textView13.setText("存储空间：");
            textView14.setText(game_cfg.getCpu_info());
            textView15.setText(game_cfg.getMemory_info());
            textView16.setText(game_cfg.getVideo_card_info());
            textView17.setText(game_cfg.getSystem_info());
            textView18.setText(game_cfg.getCapacity_info());
        }
        if (findViewById == null) {
            return;
        }
        ((LinearLayout.LayoutParams) findViewById.getLayoutParams()).height = this.O.getMeasuredHeight();
        m1(inflate);
        findViewById.scrollTo(0, 0);
    }

    String C0(String str) {
        GamedetialModleFourBean gamedetialModleFourBean = this.N1;
        return (gamedetialModleFourBean == null || TextUtils.isEmpty(gamedetialModleFourBean.getGame_btn_text())) ? str : this.N1.getGame_btn_text().length() > 10 ? this.N1.getGame_btn_text().substring(0, 10) : this.N1.getGame_btn_text();
    }

    void G0() {
        ExtBean extBean = this.f33025d;
        if (extBean == null || TextUtils.isEmpty(extBean.getFrom()) || !this.f33025d.getFrom().equals("updateFromMarket")) {
            return;
        }
        IntentUtil.getInstance().goMGMainActivity2Front(this.f33051p1);
    }

    @Override // w1.i
    public void H() {
        int i4;
        int i5;
        View inflate = LayoutInflater.from(this.f33051p1).inflate(R.layout.layout_game_detail_sheet_profile, (ViewGroup) this.O, false);
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
        findViewById2.setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.activity.p0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GamedetialModleFiveFragemnt.this.S0(view);
            }
        });
        ((TextView) inflate.findViewById(R.id.desc)).setText(this.M1.getGame_describe_second());
        if (this.M1.getGame_upgrade_info_switch() == 1) {
            String game_upgrade_info = this.M1.getGame_upgrade_info();
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
        if (this.M1.getMax_an_compatible_ver() != 0 && i6 >= this.M1.getMin_an_compatible_ver()) {
            this.M1.getMax_an_compatible_ver();
        }
        if (this.M1.getGame_prompt() != null && this.M1.getGame_prompt().size() != 0) {
            flowLayout.setVisibility(0);
            flowLayout.setHorizontalDivider(flowLayout.getResources().getDimensionPixelOffset(R.dimen.wdp20));
            flowLayout.setVerticalDivider(flowLayout.getResources().getDimensionPixelOffset(R.dimen.wdp14));
            for (int i7 = 0; i7 < this.M1.getGame_prompt().size(); i7++) {
                GamePromptBean gamePromptBean = this.M1.getGame_prompt().get(i7);
                if (gamePromptBean != null && gamePromptBean.getId() == 1) {
                    flowLayout.addView(Y0(gamePromptBean.getText(), R.drawable.ic_ok, flowLayout));
                }
            }
        }
        final GamedetialMoreBean game_detailed = this.M1.getGame_detailed();
        if (game_detailed != null) {
            textView3.setText(game_detailed.getCurrent_ver());
            textView5.setText(game_detailed.getUpgrade_time());
            textView4.setText(game_detailed.getSize() + "M");
            textView12.setText(game_detailed.getRecord_number());
            textView9.setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.activity.s0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    GamedetialModleFiveFragemnt.this.T0(game_detailed, view);
                }
            });
            textView10.setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.activity.t0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    GamedetialModleFiveFragemnt.this.U0(game_detailed, view);
                }
            });
            textView12.setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.activity.n0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    GamedetialModleFiveFragemnt.this.V0(view);
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
        } else {
            i5 = 0;
        }
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.activity.r0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GamedetialModleFiveFragemnt.this.W0(view);
            }
        });
        findViewById3.setVisibility(i5);
        findViewById3.setOnClickListener(new n());
        if (findViewById == null) {
            return;
        }
        ((LinearLayout.LayoutParams) findViewById.getLayoutParams()).height = this.O.getMeasuredHeight();
        m1(inflate);
        findViewById.scrollTo(0, 0);
    }

    boolean H0() {
        GamedetialModleFourBean gamedetialModleFourBean = this.M1;
        return (gamedetialModleFourBean == null || gamedetialModleFourBean.getGame_screen_shot() == null || this.M1.getGame_screen_shot().size() <= 0) ? false : true;
    }

    boolean I0() {
        return com.join.mgps.Util.g2.i(this.M1.getGame_info_top_video_url()) || com.join.mgps.Util.g2.i(this.M1.getGame_info_top_pic());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void J0() {
        PopupWindow popupWindow = this.O1;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
    }

    @Override // com.join.mgps.customview.widget.detail.a
    public void K() {
        this.f33039k.setCurrentItem(1);
    }

    void K0() {
        this.f33041l.setAdapter(this.f33062u2);
        this.f33041l.addOnPageChangeListener(new i());
        if (MViewpagerV4.class.isInstance(this.f33041l)) {
            ((MViewpagerV4) this.f33041l).setIntercept(false);
        }
        this.T.setOnItemClickListener(new j());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void L0() {
        View inflate = LayoutInflater.from(this.f33051p1).inflate(R.layout.popo_item, (ViewGroup) null);
        g1(0.4f);
        PopupWindow popupWindow = new PopupWindow(inflate, -1, -1, true);
        this.O1 = popupWindow;
        popupWindow.setTouchable(true);
        this.O1.setOutsideTouchable(true);
        this.O1.setFocusable(true);
        this.O1.setBackgroundDrawable(new ColorDrawable());
        this.O1.setSoftInputMode(16);
        this.O1.setOnDismissListener(new t());
        XListView2 xListView2 = (XListView2) inflate.findViewById(R.id.listview);
        this.W1 = xListView2;
        xListView2.setPullRefreshEnable(new u());
        this.W1.setPullLoadEnable(new v());
        this.U1 = (TextView) inflate.findViewById(R.id.tv_show_tips);
        this.R1 = (LinearLayout) inflate.findViewById(R.id.ll_our);
        this.P1 = (LinearLayout) inflate.findViewById(R.id.ll_show_finish);
        this.Q1 = (LinearLayout) inflate.findViewById(R.id.ll_dismiss);
        this.S1 = (EditText) inflate.findViewById(R.id.game_ed);
        this.T1 = (TextView) inflate.findViewById(R.id.tv_finish);
        this.V1 = (LinearLayout) inflate.findViewById(R.id.ll_build);
        this.Q1.setOnClickListener(new w());
        this.V1.setOnClickListener(new x());
        this.T1.setOnClickListener(new a());
        b0 b0Var = new b0();
        this.X1 = b0Var;
        this.W1.setAdapter((ListAdapter) b0Var);
        this.O1.showAtLocation(LayoutInflater.from(this.f33051p1).inflate(R.layout.gamedetial_modle_three_activity, (ViewGroup) null), 81, 0, 0);
    }

    public boolean N0(@NonNull Activity activity) {
        boolean z4;
        int i4;
        ViewGroup viewGroup = (ViewGroup) activity.getWindow().getDecorView();
        int childCount = viewGroup.getChildCount();
        int i5 = 0;
        while (true) {
            if (i5 >= childCount) {
                z4 = false;
                break;
            }
            View childAt = viewGroup.getChildAt(i5);
            int id = childAt.getId();
            if (id != -1 && "navigationBarBackground".equals(D0(activity, id)) && childAt.getVisibility() == 0) {
                z4 = true;
                break;
            }
            i5++;
        }
        if (z4) {
            if (com.join.mgps.Util.r1.x() && (i4 = Build.VERSION.SDK_INT) >= 17 && i4 < 29) {
                try {
                    return Settings.Global.getInt(activity.getContentResolver(), "navigationbar_hide_bar_enabled") == 0;
                } catch (Exception unused) {
                }
            }
            return (viewGroup.getSystemUiVisibility() & 2) == 0;
        }
        return z4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void O0() {
        X0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void P0() {
        this.f33051p1.clickBack();
    }

    @Override // w1.i
    public void U() {
        GamedetialModleFourBean gamedetialModleFourBean = this.M1;
        if (gamedetialModleFourBean == null) {
            return;
        }
        List<String> golden_finger = (gamedetialModleFourBean.getRoom_cfg_info() == null || this.M1.getRoom_cfg_info().getGolden_finger() == null || this.M1.getRoom_cfg_info().getGolden_finger().size() <= 0) ? null : this.M1.getRoom_cfg_info().getGolden_finger();
        if (golden_finger == null) {
            return;
        }
        View inflate = LayoutInflater.from(this.f33051p1).inflate(R.layout.layout_game_detail_sheet_golden_finger, (ViewGroup) this.O, false);
        ListView listView = (ListView) inflate.findViewById(R.id.listView);
        inflate.findViewById(R.id.close).setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.activity.q0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GamedetialModleFiveFragemnt.this.Q0(view);
            }
        });
        listView.setAdapter((ListAdapter) new o(golden_finger));
        listView.setOnItemClickListener(new p());
        m1(inflate);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void X0() {
        if (com.join.android.app.common.utils.j.j(getContext())) {
            try {
                String uid = AccountUtil_.getInstance_(getContext()).getUid();
                String token = AccountUtil_.getInstance_(getContext()).getToken();
                RequestModel<QueryDownloadInfoRequestArgs> requestModel = new RequestModel<>();
                requestModel.setDefault(getContext());
                QueryDownloadInfoRequestArgs queryDownloadInfoRequestArgs = new QueryDownloadInfoRequestArgs();
                queryDownloadInfoRequestArgs.setGameId(this.f33023c);
                queryDownloadInfoRequestArgs.setUid(uid);
                queryDownloadInfoRequestArgs.setToken(token);
                requestModel.setArgs(queryDownloadInfoRequestArgs);
                ResponseModel<QueryDownloadInfoResponseData> body = com.join.mgps.rpc.impl.i.D0().B0().q(requestModel).execute().body();
                if (body == null || body.getCode() != 600) {
                    return;
                }
                k1(body.getData());
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    View Y0(String str, int i4, ViewGroup viewGroup) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        View inflate = LayoutInflater.from(this.f33051p1).inflate(R.layout.layout_tag_game_detail_profile, viewGroup, false);
        ((TextView) inflate.findViewById(R.id.name)).setText(str);
        ((ImageView) inflate.findViewById(R.id.icon)).setBackgroundResource(i4);
        return inflate;
    }

    public void Z0(GamedetialModleFourBean gamedetialModleFourBean) {
        int i4;
        try {
            this.f33060t2.clear();
            this.f33066w2.clear();
            int pic_position = gamedetialModleFourBean.getPic_position();
            ViewGroup.LayoutParams layoutParams = this.f33041l.getLayoutParams();
            if (this.E1 && pic_position == 1) {
                int dimension = (int) getResources().getDimension(R.dimen.wdp1216);
                layoutParams.height = dimension;
                this.f33047o.postDelayed(new l(dimension, (int) getResources().getDimension(R.dimen.wdp236), (int) getResources().getDimension(R.dimen.wdp111)), 20L);
                AppBarLayout appBarLayout = this.f33047o;
                if (appBarLayout != null) {
                    appBarLayout.postDelayed(new m(), 30L);
                }
            } else {
                layoutParams.height = (int) getResources().getDimension(R.dimen.wdp400);
            }
            if (I0()) {
                View inflate = LayoutInflater.from(this.f33051p1).inflate((this.E1 && pic_position == 1) ? R.layout.gamedetail_item_mini_game_video_v : R.layout.gamedetail_item_video, (ViewGroup) this.f33041l, false);
                this.f33029f = (RelativeLayout) inflate.findViewById(R.id.videolayout);
                this.f33031g = inflate.findViewById(R.id.nullView);
                this.f33033h = (StandardVideoView) inflate.findViewById(R.id.videoPlayer);
                this.f33035i = (SimpleDraweeView) inflate.findViewById(R.id.iv_book_bg);
                ((RelativeLayout.LayoutParams) this.f33033h.getLayoutParams()).height = -1;
                ((RelativeLayout.LayoutParams) this.f33035i.getLayoutParams()).height = -1;
                M0();
                this.f33060t2.add(new y(true, inflate, 0));
                this.f33066w2.add(new ImageInfo(gamedetialModleFourBean.getGame_info_top_pic(), gamedetialModleFourBean.getGame_info_top_video_url(), true));
            }
            this.S.setVisibility(0);
            if (pic_position == 1) {
                i4 = this.E1 ? R.layout.gamedetail_item_image_mini_game_v : R.layout.gamedetail_item_image_v_v1;
            } else {
                i4 = R.layout.gamedetail_item_image_v1;
            }
            if (gamedetialModleFourBean.getGame_screen_shot() != null && gamedetialModleFourBean.getGame_screen_shot().size() != 0) {
                for (int i5 = 0; i5 < gamedetialModleFourBean.getGame_screen_shot().size(); i5++) {
                    View inflate2 = LayoutInflater.from(this.f33051p1).inflate(i4, (ViewGroup) this.f33041l, false);
                    ScreenshotGamedetialBean screenshotGamedetialBean = gamedetialModleFourBean.getGame_screen_shot().get(i5);
                    SimpleDraweeView simpleDraweeView = (SimpleDraweeView) inflate2.findViewById(R.id.image);
                    TextView textView = (TextView) inflate2.findViewById(R.id.count);
                    if (pic_position == 1 && !this.E1) {
                        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) simpleDraweeView.getLayoutParams();
                        ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin = (int) getResources().getDimension(R.dimen.wdp12);
                        inflate2.setLayoutParams(layoutParams2);
                    }
                    MyImageLoader.i(simpleDraweeView, screenshotGamedetialBean.getPic(), r.c.f11294a);
                    textView.setText(screenshotGamedetialBean.getCount() + "图");
                    this.f33060t2.add(new y(false, inflate2, pic_position));
                    this.f33066w2.add(new ImageInfo(screenshotGamedetialBean.getPic()));
                }
            } else {
                for (int i6 = 0; i6 < gamedetialModleFourBean.getPic_info().size(); i6++) {
                    View inflate3 = LayoutInflater.from(this.f33051p1).inflate(i4, (ViewGroup) this.f33041l, false);
                    DetialShowImageBean detialShowImageBean = gamedetialModleFourBean.getPic_info().get(i6);
                    SimpleDraweeView simpleDraweeView2 = (SimpleDraweeView) inflate3.findViewById(R.id.image);
                    TextView textView2 = (TextView) inflate3.findViewById(R.id.count);
                    if (pic_position == 1 && !this.E1) {
                        ConstraintLayout.LayoutParams layoutParams3 = (ConstraintLayout.LayoutParams) simpleDraweeView2.getLayoutParams();
                        ((ViewGroup.MarginLayoutParams) layoutParams3).rightMargin = (int) getResources().getDimension(R.dimen.wdp12);
                        inflate3.setLayoutParams(layoutParams3);
                    }
                    MyImageLoader.i(simpleDraweeView2, detialShowImageBean.getRemote().getPath(), r.c.f11294a);
                    textView2.setVisibility(8);
                    this.f33060t2.add(new y(false, inflate3, pic_position));
                    this.f33066w2.add(new ImageInfo(detialShowImageBean.getRemote().getPath()));
                }
            }
            if (this.f33060t2.size() == 1) {
                this.S.setVisibility(8);
                this.S.postInvalidate();
            }
            if (this.v2 == null) {
                this.v2 = new com.join.mgps.adapter.u0(this.f33051p1, pic_position, this.f33066w2);
            }
            this.T.setAdapter((ListAdapter) this.v2);
            K0();
            if (this.v2.getCount() > 0) {
                this.v2.c(0);
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Receiver(actions = {"com.broadcast.bespeak.sussess"})
    public void a1(Intent intent) {
        if (intent != null) {
            String stringExtra = intent.getStringExtra("gameid");
            int intExtra = intent.getIntExtra("game_book", 0);
            String stringExtra2 = intent.getStringExtra("message");
            DomainInfoBean domainInfoBean = (DomainInfoBean) intent.getSerializableExtra("pd_info");
            s1(stringExtra, intExtra);
            if (intExtra == 1) {
                if (domainInfoBean != null) {
                    UtilsMy.h4(getContext(), domainInfoBean.getInfo(), "game_search_subscribe");
                }
                com.join.mgps.Util.b0.f0(getContext()).J(getContext(), domainInfoBean, stringExtra2);
            }
        }
    }

    void addFrom(DownloadTask downloadTask) {
        ExtBean extBean = this.f33025d;
        if (extBean == null || TextUtils.isEmpty(extBean.getFrom()) || downloadTask == null) {
            return;
        }
        if ("112".equals(this.f33025d.getFrom())) {
            ExtBean extBean2 = new ExtBean();
            extBean2.setFrom("101");
            extBean2.setPosition("112");
            extBean2.setLocation(this.f33025d.getLocation());
            downloadTask.setExt(JsonMapper.toJsonString(extBean2));
            return;
        }
        this.f33025d.setFrom("101");
        downloadTask.setExt(JsonMapper.toJsonString(this.f33025d));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterView() {
        Resources resources;
        int i4;
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f33023c = arguments.getString("gameId");
            this.f33027e = arguments.getBoolean(GamedetailVideoMainActivity_.AUTODOWN_EXTRA);
            this.H1 = arguments.getBoolean(EndGameDetailActivity_.R);
            this.Z = arguments.getBoolean(GamedetailVideoMainActivity_.IS_SHOW_COMMENT_EXTRA);
            this.f33025d = (ExtBean) arguments.getSerializable("extBean");
        }
        this.D1 = this.f33021b + System.currentTimeMillis();
        if (this.H1) {
            this.D1 = "PapaMainAdapter";
        }
        if (this.f33025d == null) {
            this.f33025d = new ExtBean();
        }
        GamedetailVideoMainActivity gamedetailVideoMainActivity = (GamedetailVideoMainActivity) getActivity();
        this.f33051p1 = gamedetailVideoMainActivity;
        if (gamedetailVideoMainActivity.gethideOrshowCover()) {
            this.M.setVisibility(0);
        } else {
            this.M.setVisibility(8);
        }
        this.I.setVisibility(8);
        this.J.setVisibility(8);
        this.H.setVisibility(8);
        this.f33050p0 = com.join.mgps.rpc.impl.d.P1();
        this.Y1 = com.join.mgps.rpc.impl.a.c0();
        this.Z1 = com.join.mgps.rpc.impl.a.c0();
        com.join.mgps.Util.d0.a().d(this);
        RequestBeanUtil.getInstance(this.f33051p1);
        this.B1 = RequestBeanUtil.getVersionAndVersionName();
        this.I1 = N0(this.f33051p1);
        this.J1 = B0(this.f33051p1);
        this.K1 = F0(this.f33051p1);
        this.f33064v1 = new com.join.android.app.common.manager.b(this.f33051p1);
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 21) {
            this.f33051p1.getWindow().setFlags(TTAdConstant.KEY_CLICK_AREA, TTAdConstant.KEY_CLICK_AREA);
            this.f33064v1.m(true);
            this.f33064v1.n(R.color.black_alpha);
            View childAt = ((ViewGroup) this.f33051p1.findViewById(16908290)).getChildAt(0);
            if (childAt != null) {
                ViewCompat.setFitsSystemWindows(childAt, false);
            }
            getResources().getDimensionPixelSize(getResources().getIdentifier("status_bar_height", "dimen", q.a.f73126a));
            GamedetailVideoMainActivity gamedetailVideoMainActivity2 = this.f33051p1;
            com.join.mgps.Util.c2.c(gamedetailVideoMainActivity2, com.join.mgps.Util.c2.d(gamedetailVideoMainActivity2));
        }
        if (i5 >= 21) {
            Window window = getActivity().getWindow();
            window.clearFlags(TTAdConstant.KEY_CLICK_AREA);
            window.getDecorView().setSystemUiVisibility(LogType.UNEXP_ANR);
            window.addFlags(Integer.MIN_VALUE);
            window.setStatusBarColor(0);
        } else if (i5 >= 19) {
            getActivity().getWindow().addFlags(TTAdConstant.KEY_CLICK_AREA);
        }
        GamedetialModleFourBean modleFourBeanShow = ((GamedetailVideoMainActivity) getActivity()).getModleFourBeanShow();
        if (modleFourBeanShow != null) {
            this.I.setVisibility(8);
            this.J.setVisibility(8);
            this.H.setVisibility(0);
            z1(modleFourBeanShow);
        } else {
            x0();
        }
        this.L1 = getStatusBarHeight(this.f33051p1);
        this.G.getBackground().setAlpha(0);
        CollapsingToolbarLayout.LayoutParams layoutParams = (CollapsingToolbarLayout.LayoutParams) this.G.getLayoutParams();
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.N.getLayoutParams();
        if (i5 >= 21) {
            layoutParams2.height = this.L1;
            this.N.setLayoutParams(layoutParams2);
            ((FrameLayout.LayoutParams) layoutParams).height = getResources().getDimensionPixelOffset(R.dimen.wdp98) + this.L1;
            this.G.setLayoutParams(layoutParams);
        } else {
            ((FrameLayout.LayoutParams) layoutParams).height = getResources().getDimensionPixelOffset(R.dimen.wdp98);
            this.G.setLayoutParams(layoutParams);
            layoutParams2.height = 1;
            this.N.setLayoutParams(layoutParams2);
        }
        if (this.E1) {
            resources = getResources();
            i4 = R.dimen.wdp1000;
        } else {
            resources = getResources();
            i4 = R.dimen.wdp300;
        }
        this.f33047o.addOnOffsetChangedListener((AppBarLayout.OnOffsetChangedListener) new k(resources.getDimensionPixelOffset(i4)));
        com.join.mgps.customview.CoordinatorLayout coordinatorLayout = this.H;
        if (coordinatorLayout instanceof com.join.mgps.customview.CoordinatorLayout) {
            coordinatorLayout.setSheetLayout(this.O);
        }
    }

    @Override // com.join.mgps.activity.gamedetail.BaseGameDetailFragment
    public void backpressedTofinishActivity() {
        StandardVideoView standardVideoView = this.f33033h;
        if (standardVideoView == null) {
            return;
        }
        standardVideoView.taskShotPic(new b());
        if (this.f33033h.getTimeHas() < 2000) {
            this.f33033h.onAutoCompletion();
        }
        com.join.android.app.component.video.h.f(this.f33033h);
        this.f33033h.getGSYVideoManager().A(this.f33033h);
        this.f33030f2 = true;
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
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r4 = r2.f33054q2
            boolean r4 = r4.containsKey(r0)
            if (r4 != 0) goto L2d
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r4 = r2.f33054q2
            r4.put(r0, r3)
        L2d:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r4 = r2.f33056r2
            boolean r4 = r4.containsKey(r0)
            if (r4 != 0) goto La7
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r4 = r2.f33056r2
            r4.put(r0, r3)
            goto La7
        L3b:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.f33054q2
            boolean r3 = r3.containsKey(r0)
            if (r3 == 0) goto L48
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.f33054q2
            r3.remove(r0)
        L48:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.f33056r2
            boolean r3 = r3.containsKey(r0)
            if (r3 == 0) goto La7
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.f33056r2
            r3.remove(r0)
            goto La7
        L56:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.f33056r2
            boolean r3 = r3.containsKey(r0)
            if (r3 == 0) goto La7
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.f33056r2
            r3.remove(r0)
            goto La7
        L64:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.f33054q2
            boolean r3 = r3.containsKey(r0)
            if (r3 == 0) goto L71
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.f33054q2
            r3.remove(r0)
        L71:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.f33056r2
            boolean r3 = r3.containsKey(r0)
            if (r3 == 0) goto La7
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.f33056r2
            r3.remove(r0)
            goto La7
        L7f:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.f33056r2
            boolean r3 = r3.containsKey(r0)
            if (r3 == 0) goto La7
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.f33056r2
            r3.remove(r0)
            goto La7
        L8d:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r4 = r2.f33054q2
            boolean r4 = r4.containsKey(r0)
            if (r4 != 0) goto L9a
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r4 = r2.f33054q2
            r4.put(r0, r3)
        L9a:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r4 = r2.f33056r2
            boolean r4 = r4.containsKey(r0)
            if (r4 != 0) goto La7
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r4 = r2.f33056r2
            r4.put(r0, r3)
        La7:
            r2.updateDownloadView()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.mgps.activity.GamedetialModleFiveFragemnt.changeDownloadTaskNumber(com.github.snowdream.android.app.downloader.DownloadTask, int):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void changeGameFollow(int i4) {
        String str;
        if (com.join.android.app.common.utils.j.j(this.f33051p1)) {
            com.wufan.user.service.protobuf.n0 accountData = AccountUtil_.getInstance_(this.f33051p1).getAccountData();
            this.f33052p2 = accountData;
            int uid = accountData != null ? accountData.getUid() : 0;
            try {
                PackageInfo packageInfo = this.f33051p1.getPackageManager().getPackageInfo(this.f33051p1.getPackageName(), 0);
                str = packageInfo.versionCode + "_" + packageInfo.versionName;
            } catch (PackageManager.NameNotFoundException e5) {
                e5.printStackTrace();
                str = "";
            }
            RequestdetialFolowAndBeSpeak requestdetialFolowAndBeSpeak = new RequestdetialFolowAndBeSpeak();
            requestdetialFolowAndBeSpeak.setApp_ver(str);
            requestdetialFolowAndBeSpeak.setGame_id(this.N1.getCrc_sign_id());
            requestdetialFolowAndBeSpeak.setUid(uid);
            requestdetialFolowAndBeSpeak.setMobile(this.f33052p2.z());
            CommonRequestBean<RequestGameIdArgs> detialFollowAnd = RequestBeanUtil.getInstance(this.f33051p1).getDetialFollowAnd(requestdetialFolowAndBeSpeak);
            ResultMainBean resultMainBean = null;
            if (i4 == 1) {
                resultMainBean = this.f33050p0.O0(detialFollowAnd);
            } else if (i4 == 2) {
                resultMainBean = this.f33050p0.D(detialFollowAnd);
            } else if (i4 == 3) {
                resultMainBean = this.f33050p0.o(detialFollowAnd);
            } else if (i4 == 4) {
                resultMainBean = this.f33050p0.d0(detialFollowAnd);
            }
            if (resultMainBean != null) {
                updateTitleButn(resultMainBean, i4);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void d0() {
        try {
            com.wufan.user.service.protobuf.n0 accountData = AccountUtil_.getInstance_(this.f33051p1).getAccountData();
            LinkedMultiValueMap linkedMultiValueMap = new LinkedMultiValueMap();
            linkedMultiValueMap.add("uid", Integer.valueOf(accountData.getUid()));
            linkedMultiValueMap.add("token", accountData.getToken());
            linkedMultiValueMap.add("group_id", f33018x2);
            linkedMultiValueMap.add("game_id", this.f33023c);
            linkedMultiValueMap.add("game_title", y2);
            linkedMultiValueMap.add("device_id", this.A1);
            linkedMultiValueMap.add("version", this.B1);
            GameFromBooleanBean Q = this.Z1.Q(linkedMultiValueMap);
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
    public void e0(String str, String str2, c0 c0Var) {
        try {
            if (com.join.android.app.common.utils.j.j(this.f33051p1)) {
                LinkedMultiValueMap linkedMultiValueMap = new LinkedMultiValueMap();
                linkedMultiValueMap.add("uid", Integer.valueOf(this.f33052p2.getUid()));
                linkedMultiValueMap.add("token", this.f33052p2.getToken());
                linkedMultiValueMap.add("group_id", str);
                linkedMultiValueMap.add("game_id", str2);
                linkedMultiValueMap.add("device_id", this.A1);
                linkedMultiValueMap.add("version", this.B1);
                GameFromBooleanBean z4 = this.Z1.z(linkedMultiValueMap);
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
    public void f0() {
        this.M.setVisibility(8);
        ((GamedetailVideoMainActivity_) getActivity()).shakeAnimback();
    }

    void f1(TextView textView, GamedetialModleFourBean gamedetialModleFourBean) {
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
                if (this.G1) {
                    if (com.join.mgps.Util.s0.c() && this.N1.isCpsGame()) {
                        textView.setText(C0(textView.getResources().getString(R.string.download_status_finished)));
                    } else {
                        textView.setText(C0(textView.getResources().getString(R.string.download_status_free)));
                    }
                } else {
                    textView.setText(C0(textView.getResources().getString(R.string.download_status_download)));
                }
                if (w02 > 0) {
                    textView.setText(textView.getResources().getString(R.string.pay_game_amount, com.join.mgps.Util.g2.m(w02)));
                    return;
                }
                textView.setTextColor(-1);
                if (this.G1 && com.join.mgps.Util.s0.c() && this.N1.isCpsGame()) {
                    textView.setBackgroundResource(R.drawable.detial_simple_open_selecter);
                } else {
                    textView.setBackgroundResource(R.drawable.detial_simple_normal_selecter);
                }
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void g0() {
        try {
            XListView2 xListView2 = this.W1;
            if (xListView2 != null) {
                xListView2.l();
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public void g1(float f5) {
        WindowManager.LayoutParams attributes = this.f33051p1.getWindow().getAttributes();
        attributes.alpha = f5;
        if (f5 == 1.0f) {
            this.f33051p1.getWindow().clearFlags(2);
        } else {
            this.f33051p1.getWindow().addFlags(2);
        }
        this.f33051p1.getWindow().setAttributes(attributes);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void getDownloadTaskInfo() {
        List<DownloadTask> r4 = p1.f.K().r();
        List<DownloadTask> q4 = p1.f.K().q();
        if (q4 != null && q4.size() > 0) {
            for (DownloadTask downloadTask : q4) {
                this.f33054q2.put(downloadTask.getCrc_link_type_val(), downloadTask);
            }
        }
        if (r4 != null && r4.size() > 0) {
            for (DownloadTask downloadTask2 : r4) {
                this.f33056r2.put(downloadTask2.getCrc_link_type_val(), downloadTask2);
            }
        }
        updateDownloadView();
    }

    @Override // com.join.mgps.activity.gamedetail.BaseGameDetailFragment
    public ViewPager getViewPager() {
        return this.f33039k;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void h1(c0 c0Var) {
        c0Var.f33082b.setBackgroundResource(R.drawable.follow_none_image);
    }

    @Override // com.join.mgps.activity.gamedetail.BaseGameDetailFragment
    public void hideCover() {
        this.M.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void i1() {
        ShareBean shareBean = new ShareBean();
        String share_url = this.N1.getShare_url();
        shareBean.setqZoneShareUrl(share_url);
        shareBean.setQqUrl(share_url);
        shareBean.setWechatFriendUrl(share_url);
        shareBean.setWechatShareUrl(share_url);
        shareBean.setWeiboShareUrl(share_url);
        shareBean.setTitle(this.N1.getGame_name());
        shareBean.setText(this.N1.getInfo());
        shareBean.setImageUrl(this.N1.getIco_remote());
        shareBean.setFrom(2);
        shareBean.setGameId(this.N1.getGame_id());
        if (this.N1.getShare_config() != null && this.N1.getShare_config().getShare_switch() == 1) {
            shareBean.setIntentData(this.N1.getShare_config().getJump_info());
        }
        com.join.mgps.Util.s.r(this.f33051p1, shareBean);
    }

    void initView() {
        try {
            this.K.setVisibility(8);
            this.F.setText(this.M1.getGame_name());
            M0();
            if (!com.join.mgps.Util.g2.i(this.M1.getGame_info_top_video_url()) && !com.join.mgps.Util.g2.i(this.M1.getGame_info_top_pic())) {
                this.f33053q.setVisibility(0);
                this.f33055r.setVisibility(8);
                this.f33057s.setVisibility(8);
                this.G.getBackground().setAlpha(255);
            }
            GamedetialModleFourBean gamedetialModleFourBean = this.M1;
            if (gamedetialModleFourBean != null) {
                if (com.join.mgps.Util.g2.i(gamedetialModleFourBean.getCompany_name())) {
                    this.P.setOnClickListener(new c());
                }
                if (this.M1.getShare_config() != null && this.M1.getShare_config().getShare_switch() == 1) {
                    this.P.setVisibility(0);
                    MyImageLoader.d(this.Q, R.drawable.user_gift, "");
                    this.P.setOnClickListener(new d());
                } else {
                    this.P.setVisibility(8);
                }
                if (this.M1.getActivity_entry() != null) {
                    this.P.setVisibility(0);
                    MyImageLoader.h(this.Q, this.M1.getActivity_entry().getPic());
                    this.R.setText(this.M1.getActivity_entry().getTitle());
                    n1();
                    this.P.setOnClickListener(new e());
                } else {
                    this.P.setVisibility(8);
                }
                if (this.G1) {
                    this.X = new PcGameInfoCardView(this.f33051p1);
                } else {
                    this.X = new GameInfoCardView(this.f33051p1);
                }
                FrameLayout frameLayout = this.W;
                if (frameLayout != null) {
                    frameLayout.addView(this.X.getContentView());
                }
                this.X.setGameInfoCallback(this);
                this.X.a(this.M1);
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void instalButtomButn() {
        ExtBean extBean;
        boolean z4;
        int game_book = this.N1.getGame_book();
        if (this.N1.getBespeak_switch() == 1 && game_book != 1 && this.N1.getDown_status() == 2) {
            if (IntentUtil.getInstance().goLoginNetGame(this.f33051p1) || this.N1.getGame_book() == 1) {
                return;
            }
            changeGameFollow(4);
            return;
        }
        if (this.G1) {
            com.papa.sim.statistic.p.l(getContext()).O1(com.papa.sim.statistic.Event.clickPcDetailHomeBtn, new Ext().setFrom("1").setGameId(this.f33023c).setQkPosition(com.kuaishou.weapon.p0.t.f55705x));
        }
        if (("" + this.N1.getPlugin_num()).equals("" + ConstantIntEnum.H5.value())) {
            IntentUtil.getInstance().goShareWebActivity(this.f33051p1, this.N1.getDown_url_remote());
            UtilsMy.T2(this.f33032g2, this.f33051p1);
        }
        DownloadTask downloadTask = this.f33032g2;
        int status = downloadTask != null ? downloadTask.getStatus() : 0;
        if (this.f33032g2 != null && UtilsMy.w0(this.N1.getPay_tag_info(), this.N1.getCrc_sign_id()) > 0) {
            status = 43;
        }
        if (this.G1 && com.join.mgps.Util.s0.c() && this.N1.isCpsGame()) {
            com.join.mgps.Util.s0.b();
            return;
        }
        GamedetialModleFourBean gamedetialModleFourBean = this.N1;
        if (gamedetialModleFourBean != null && gamedetialModleFourBean.getMod_info() != null) {
            List<DownloadTask> G = p1.f.K().G(this.N1.getMod_info().getMain_game_id(), this.N1.getMod_info().getMod_game_id());
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
                    this.f33032g2 = p1.f.K().F(this.f33023c);
                } else if (z5) {
                    if (this.N1.getMod_info() != null) {
                        this.f33032g2 = p1.f.K().F(this.N1.getMod_info().getMod_game_id());
                    }
                } else if (z4) {
                    this.f33032g2 = p1.f.K().F(this.f33023c);
                } else {
                    if (this.N1.getMod_info() != null) {
                        this.f33032g2 = p1.f.K().F(this.N1.getMod_info().getMod_game_id());
                    }
                    if (this.f33032g2 == null) {
                        this.f33032g2 = p1.f.K().F(this.f33023c);
                    }
                }
            } else {
                this.f33032g2 = null;
            }
        }
        DownloadTask downloadTask3 = this.f33032g2;
        if (downloadTask3 != null && downloadTask3.getStatus() != 0) {
            DownloadTask downloadTask4 = this.f33032g2;
            if (downloadTask4 != null && (status == 2 || status == 10)) {
                com.php25.PDownload.d.i(downloadTask4);
            } else if (status == 12 || status == 27) {
                return;
            } else {
                if (status == 13) {
                    com.php25.PDownload.d.l(this.f33051p1, downloadTask4);
                    return;
                } else if (status == 5) {
                    UtilsMy.W3(this.f33051p1, downloadTask4, "2");
                } else if (status == 42) {
                    downloadTask4.setVer(this.N1.getVer());
                    this.f33032g2.setVer_name(this.N1.getVer_name());
                    this.f33032g2.setUrl(this.N1.getDown_url_remote());
                    this.f33032g2.setCfg_ver(this.N1.getCfg_ver());
                    this.f33032g2.setCfg_ver_name(this.N1.getCfg_ver_name());
                    this.f33032g2.setCfg_down_url(this.N1.getCfg_down_url());
                    this.f33032g2.setPay_game_amount(this.N1.getPay_tag_info() != null ? this.N1.getPay_tag_info().getPay_game_amount() : 0);
                    DownloadTask downloadTask5 = this.f33032g2;
                    Where where = Where.detail;
                    downloadTask5.setKeyword(where.name());
                    this.f33032g2.setKeyword(where.name());
                    DownloadTask downloadTask6 = this.f33032g2;
                    UtilsMy.z4(downloadTask6, downloadTask6.getCrc_link_type_val());
                    UtilsMy.r4(this.f33051p1, this.f33032g2);
                } else if (status == 9) {
                    if (!com.join.android.app.common.utils.j.j(this.f33051p1)) {
                        ToastManager.show("无网络连接");
                        return;
                    }
                    if (this.N1.getGame_detailed() != null && com.join.mgps.Util.g2.i(this.N1.getGame_detailed().getTpl_two_qq())) {
                        com.join.mgps.Util.b0.f0(this.f33051p1).b0(this.f33051p1, this.N1.getGame_detailed().getTpl_two_qq_key(), this.N1.getGame_detailed().getAd_pic_qq(), this.N1.getGame_detailed().getTpl_two_qq());
                    }
                    int downloadType = this.f33032g2.getDownloadType();
                    if (downloadType == 0 || downloadType == 1) {
                        if (this.f33032g2.getCrc_link_type_val() == null || this.f33032g2.getCrc_link_type_val().equals("")) {
                            return;
                        }
                        addFrom(this.f33032g2);
                        if (UtilsMy.o1(this.f33051p1, this.f33032g2)) {
                            return;
                        }
                        if (this.N1.getDown_status() == 5) {
                            UtilsMy.l1(this.f33051p1, this.f33032g2);
                            return;
                        }
                        com.php25.PDownload.d.b(this.f33032g2);
                        this.f33032g2.setVer(this.N1.getVer());
                        this.f33032g2.setVer_name(this.N1.getVer_name());
                        this.f33032g2.setUrl(this.N1.getDown_url_remote());
                        this.f33032g2.setCfg_ver(this.N1.getCfg_ver());
                        this.f33032g2.setCfg_ver_name(this.N1.getCfg_ver_name());
                        this.f33032g2.setCfg_down_url(this.N1.getCfg_down_url());
                        this.f33032g2.setPay_game_amount(this.N1.getPay_tag_info() != null ? this.N1.getPay_tag_info().getPay_game_amount() : 0);
                        this.f33032g2.setKeyword(Where.detail.name());
                        DownloadTask downloadTask7 = this.f33032g2;
                        UtilsMy.z4(downloadTask7, downloadTask7.getCrc_link_type_val());
                        if (UtilsMy.y0(this.N1.getPay_tag_info(), this.N1.getCrc_sign_id()) > 0) {
                            ExtBean extBean2 = this.f33025d;
                            if (extBean2 != null && "checkgame".equals(extBean2.getFrom())) {
                                UtilsMy.e4(this.f33051p1, this.f33023c, this.f33025d.getFrom_id());
                            } else {
                                if (!UtilsMy.o1(this.f33051p1, this.f33032g2)) {
                                    if (this.N1.getDown_status() == 5) {
                                        UtilsMy.l1(this.f33051p1, this.f33032g2);
                                    } else {
                                        UtilsMy.d4(this.f33051p1, this.f33023c);
                                    }
                                }
                                onDetailDownload();
                            }
                        } else {
                            UtilsMy.C1(this.f33032g2, this.N1);
                            if (!UtilsMy.o1(this.f33051p1, this.f33032g2)) {
                                if (this.N1.getDown_status() == 5) {
                                    UtilsMy.l1(this.f33051p1, this.f33032g2);
                                } else {
                                    UtilsMy.R0(this.f33051p1, this.f33032g2, this.N1.getTp_down_url(), this.N1.getOther_down_switch(), this.N1.getCdn_down_switch());
                                }
                            }
                            onDetailDownload();
                        }
                    } else if (downloadType == 2) {
                        UtilsMy.u4(this.f33032g2);
                    }
                } else if (11 == status) {
                    UtilsMy.a4(downloadTask4, this.f33051p1);
                } else if (43 == status) {
                    m0();
                } else if (48 != status) {
                    m0();
                }
            }
            updateButn();
            return;
        }
        DownloadTask downloadTask8 = this.f33032g2;
        if (downloadTask8 != null) {
            String ext = downloadTask8.getExt();
            if (com.join.mgps.Util.g2.i(ext) && (extBean = (ExtBean) JsonMapper.getInstance().fromJson(ext, ExtBean.class)) != null) {
                String recPosition = extBean.getRecPosition();
                if (com.join.mgps.Util.g2.i(recPosition) && com.join.mgps.Util.g2.i(extBean.getVolcanoOther())) {
                    e1(recPosition, this.f33023c, (StatFactory.VolcanoOther) JsonMapper.getInstance().fromJson(extBean.getVolcanoOther(), StatFactory.VolcanoOther.class), UtilsMy.k2(this.f33032g2.getTipBeans()));
                }
            }
        }
        this.M1.getRecPosition();
        this.M1.setReMarks(this.f33025d.getReMarks());
        this.N1.setDownType(0);
        this.f33025d.setFrom("101");
        this.N1.setExt(JsonMapper.getInstance().toJson(this.f33025d));
        UtilsMy.b1(this.f33051p1, this.N1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void iv_back() {
        if (this.O.getState() != BottomSheetLayout.State.HIDDEN) {
            this.O.r();
            return;
        }
        c1();
        this.f33051p1.clickBack();
        G0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void j1() {
        ShareBean shareBean = new ShareBean();
        String share_url = this.N1.getShare_url();
        shareBean.setqZoneShareUrl(share_url);
        shareBean.setQqUrl(share_url);
        shareBean.setWechatFriendUrl(share_url);
        shareBean.setWechatShareUrl(share_url);
        shareBean.setWeiboShareUrl(share_url);
        shareBean.setImageUrl(this.N1.getIco_remote());
        shareBean.setTitle(this.N1.getGame_name());
        shareBean.setText(this.N1.getInfo());
        shareBean.setFrom(2);
        shareBean.setGameId(this.N1.getGame_id());
        if (this.N1.getShare_config() != null && this.N1.getShare_config().getShare_switch() == 1) {
            shareBean.setIntentData(this.N1.getShare_config().getJump_info());
        }
        com.join.mgps.Util.s.r(this.f33051p1, shareBean);
    }

    public void k1(QueryDownloadInfoResponseData queryDownloadInfoResponseData) {
        if (queryDownloadInfoResponseData != null) {
            ((DownloadMethodMultiDialog_.k) ((DownloadMethodMultiDialog_.k) ((DownloadMethodMultiDialog_.k) DownloadMethodMultiDialog_.y0(this.f33051p1).flags(805306368)).i(this.f33023c).extra("data", queryDownloadInfoResponseData)).extra("fromRecomDown", false)).k(queryDownloadInfoResponseData.isForceShow()).j(true).start();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void l1(String str) {
        Toast.makeText(this.f33051p1, str, 0).show();
    }

    void m0() {
        this.f33032g2.setKeyword(Where.detail.name());
        if (this.N1 != null) {
            addFrom(this.f33032g2);
            if (this.N1.getGame_detailed() != null && com.join.mgps.Util.g2.i(this.N1.getGame_detailed().getTpl_two_qq())) {
                com.join.mgps.Util.b0.f0(this.f33051p1).b0(this.f33051p1, this.N1.getGame_detailed().getTpl_two_qq_key(), this.N1.getGame_detailed().getAd_pic_qq(), this.N1.getGame_detailed().getTpl_two_qq());
            }
            if (UtilsMy.y0(this.N1.getPay_tag_info(), this.N1.getCrc_sign_id()) > 0) {
                ExtBean extBean = this.f33025d;
                if (extBean != null && "checkgame".equals(extBean.getFrom())) {
                    UtilsMy.e4(this.f33051p1, this.f33023c, this.f33025d.getFrom_id());
                    return;
                }
                if (!UtilsMy.o1(this.f33051p1, this.f33032g2)) {
                    if (this.N1.getDown_status() == 5) {
                        UtilsMy.l1(this.f33051p1, this.f33032g2);
                    } else {
                        UtilsMy.d4(this.f33051p1, this.f33023c);
                    }
                }
                onDetailDownload();
                return;
            }
            UtilsMy.C1(this.f33032g2, this.N1);
            if (UtilsMy.o1(this.f33051p1, this.f33032g2)) {
                return;
            }
            if (this.N1.getDown_status() == 5) {
                UtilsMy.l1(this.f33051p1, this.f33032g2);
            } else {
                UtilsMy.R0(this.f33051p1, this.f33032g2, this.N1.getTp_down_url(), this.N1.getOther_down_switch(), this.N1.getCdn_down_switch());
            }
        }
    }

    void m1(View view) {
        if (this.O == null || view == null) {
            return;
        }
        view.setPadding(0, getStatusBarHeight(this.f33051p1), 0, 0);
        this.O.I(view);
        this.O.setFocusable(true);
        this.O.setFocusableInTouchMode(true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void n0(GameFromPopoWinBean gameFromPopoWinBean) {
        for (int i4 = 0; i4 < gameFromPopoWinBean.getData().size(); i4++) {
            this.f33026d2.add(gameFromPopoWinBean.getData().get(i4));
        }
        if (gameFromPopoWinBean.getData().size() < 10 && this.W1 != null) {
            r1();
        }
        b0 b0Var = this.X1;
        if (b0Var != null) {
            b0Var.notifyDataSetChanged();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread(delay = 4000)
    public void n1() {
        com.join.mgps.Util.c.g(this.Q);
        if (isDetached()) {
            return;
        }
        n1();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void o0() {
        if (this.O.getState() != BottomSheetLayout.State.HIDDEN) {
            this.O.r();
            return;
        }
        this.f33051p1.clickBack();
        G0();
    }

    void o1() {
        try {
            this.f33036i2.setImageResource(R.drawable.line_blue_bg);
            Animation loadAnimation = AnimationUtils.loadAnimation(this.f33051p1, R.anim.img_translate);
            this.f33044m2 = loadAnimation;
            loadAnimation.setFillAfter(true);
            this.f33042l2.setVisibility(0);
            this.f33042l2.startAnimation(this.f33044m2);
            this.f33044m2.setAnimationListener(new f());
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    @Override // com.join.mgps.activity.gamedetail.BaseGameDetailFragment
    public boolean onBackPressedMy() {
        if (com.join.android.app.component.video.a.c0(this.f33051p1, this.D1)) {
            return true;
        }
        BottomSheetLayout bottomSheetLayout = this.O;
        if (bottomSheetLayout == null || bottomSheetLayout.getState() == BottomSheetLayout.State.HIDDEN) {
            return false;
        }
        this.O.r();
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        c1();
        com.join.mgps.Util.d0.a().e(this);
        super.onDestroy();
    }

    void onDetailDownload() {
        ExtBean extBean = this.f33025d;
        if (extBean == null || TextUtils.isEmpty(extBean.getFrom()) || !this.f33025d.getFrom().equals("downloadCenter")) {
            return;
        }
        MobclickAgent.onEvent(this.f33051p1, "detailDownload4.2.0.6");
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    void onDownloadSpeed(com.join.mgps.event.m mVar) {
        if (mVar == null || TextUtils.isEmpty(mVar.a()) || this.E1) {
            return;
        }
        ProgressBar progressBar = this.f33068y;
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
        throw new UnsupportedOperationException("Method not decompiled: com.join.mgps.activity.GamedetialModleFiveFragemnt.onEventMainThread(com.join.mgps.event.n):void");
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        StandardVideoView standardVideoView;
        StandardVideoView standardVideoView2;
        super.onPause();
        this.f33058s2 = true;
        try {
            if (!this.H1 && (standardVideoView2 = this.f33033h) != null && standardVideoView2.d()) {
                this.f33033h.onVideoPause();
            } else if (this.H1 && (standardVideoView = this.f33033h) != null && !this.f33030f2 && standardVideoView.d()) {
                this.f33033h.onVideoPause();
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        StandardVideoView standardVideoView;
        GamedetialModleFourBean gamedetialModleFourBean;
        List<DownloadTask> H;
        boolean z4;
        super.onResume();
        this.f33058s2 = false;
        this.f33052p2 = AccountUtil_.getInstance_(this.f33051p1).getAccountData();
        if (f33019z2) {
            this.f33024c2 = 1;
            f33019z2 = false;
            y0();
        }
        if ((this.f33053q.getVisibility() == 4 || this.f33053q.getVisibility() == 8) && (standardVideoView = this.f33033h) != null && standardVideoView.d()) {
            this.f33033h.onVideoResume(false);
        }
        p0();
        GamedetialModleFourBean gamedetialModleFourBean2 = this.N1;
        if (gamedetialModleFourBean2 != null) {
            if (gamedetialModleFourBean2.getMod_info() != null) {
                H = p1.f.K().G(this.N1.getMod_info().getMod_game_id(), this.N1.getMod_info().getMain_game_id());
            } else {
                H = p1.f.K().H(this.N1.getPackageName());
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
                    r1 = p1.f.K().F(this.f33023c);
                } else if (z5) {
                    if (this.N1.getMod_info() != null) {
                        r1 = p1.f.K().F(this.N1.getMod_info().getMod_game_id());
                    }
                } else if (z4) {
                    r1 = p1.f.K().F(this.f33023c);
                } else {
                    r1 = this.N1.getMod_info() != null ? p1.f.K().F(this.N1.getMod_info().getMod_game_id()) : null;
                    if (r1 == null) {
                        r1 = p1.f.K().F(this.f33023c);
                    }
                }
            }
        }
        if (r1 == null && (gamedetialModleFourBean = this.N1) != null) {
            this.f33032g2 = gamedetialModleFourBean.getDownloadtaskDown();
        }
        if (r1 != null && this.f33032g2 != null) {
            try {
                this.f33032g2 = r1;
                if (r1.getFileType().equals(Dtype.android.name()) && this.f33032g2.getStatus() == 5) {
                    if (this.N1.getMod_info() == null) {
                        com.join.android.app.common.utils.e l02 = com.join.android.app.common.utils.e.l0(this.f33051p1);
                        GamedetailVideoMainActivity gamedetailVideoMainActivity = this.f33051p1;
                        String packageName = this.f33032g2.getPackageName();
                        APKUtils.DEVICE_TYPE device_type = APKUtils.DEVICE_TYPE.ALL;
                        if (Boolean.valueOf(l02.e(gamedetailVideoMainActivity, packageName, device_type)).booleanValue()) {
                            APKUtils.a m4 = com.join.android.app.common.utils.e.l0(this.f33051p1).m(this.f33051p1, this.f33032g2.getPackageName(), device_type);
                            if (com.join.mgps.Util.g2.i(this.f33032g2.getVer()) && m4.d() < Integer.parseInt(this.f33032g2.getVer())) {
                                this.f33032g2.setStatus(9);
                            } else {
                                this.f33032g2.setStatus(5);
                            }
                        } else {
                            this.f33032g2.setStatus(0);
                        }
                    }
                } else {
                    this.f33032g2.setStatus(r1.getStatus());
                }
                updateButn();
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
        UtilsMy.q4(this.f33051p1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void p0() {
        try {
            this.f33046n2 = p1.f.K().S();
            int a02 = p1.f.K().a0();
            this.f33048o2 = a02;
            u1(a02);
            int i4 = this.f33046n2;
            if (i4 != 0) {
                t1(i4);
            } else {
                w1();
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        updateDownloadView();
    }

    void p1() {
        try {
            this.f33042l2.clearAnimation();
            this.f33042l2.setVisibility(8);
            this.f33036i2.setImageResource(R.drawable.line_white_bg);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    @Override // com.join.mgps.activity.gamedetail.BaseGameDetailFragment
    public void pauseVideo() {
        this.f33058s2 = true;
        StandardVideoView standardVideoView = this.f33033h;
        if (standardVideoView == null || !standardVideoView.d()) {
            return;
        }
        this.f33033h.onVideoPause();
    }

    @Override // com.join.mgps.activity.gamedetail.BaseGameDetailFragment
    public void playVideo() {
        StandardVideoView standardVideoView = this.f33033h;
        if (standardVideoView != null) {
            this.f33051p1.autoPlayVideo(standardVideoView);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void progress_layout() {
        DownloadTask downloadTask = this.f33032g2;
        if (downloadTask == null) {
            return;
        }
        if (downloadTask.getStatus() == 2) {
            updateButn();
            com.php25.PDownload.d.i(this.f33032g2);
        } else if (this.f33032g2.getStatus() == 3 || this.f33032g2.getStatus() == 6) {
            updateButn();
            com.php25.PDownload.d.c(this.f33032g2, this.f33051p1);
            onDetailDownload();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void q0() {
        if (this.f33026d2.size() > 0) {
            this.f33026d2.clear();
            b0 b0Var = this.X1;
            if (b0Var != null) {
                b0Var.notifyDataSetChanged();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void q1() {
        IntentUtil.getInstance().goMyGameManagerActivity(this.f33051p1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread(delay = 600)
    public void r0(String str) {
        StandardVideoView standardVideoView;
        if (this.f33058s2 || (standardVideoView = this.f33033h) == null || !standardVideoView.d()) {
            return;
        }
        if (this.H1) {
            this.f33033h.setSurfaceToPlay();
        } else {
            this.f33051p1.autoPlayVideo(this.f33033h);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void r1() {
        XListView2 xListView2 = this.W1;
        if (xListView2 != null) {
            try {
                xListView2.g();
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void relodingimag() {
        showLoding();
        x0();
    }

    @Override // com.join.mgps.activity.gamedetail.BaseGameDetailFragment
    public void resumVideo() {
        StandardVideoView standardVideoView;
        StandardVideoView standardVideoView2 = this.f33033h;
        if (standardVideoView2 == null || !this.f33058s2) {
            return;
        }
        this.f33058s2 = false;
        if (standardVideoView2.d()) {
            this.f33033h.startPlayLogic();
        } else if ((this.f33053q.getVisibility() == 4 || this.f33053q.getVisibility() == 8) && (standardVideoView = this.f33033h) != null && standardVideoView.d()) {
            this.f33033h.onVideoResume(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void s0() {
        IntentUtil.getInstance().goMyGameManagerActivity(this.f33051p1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void s1(String str, int i4) {
        GamedetialModleFourBean gamedetialModleFourBean;
        if (com.join.mgps.Util.g2.h(str) || (gamedetialModleFourBean = this.N1) == null || this.f33059t == null) {
            return;
        }
        gamedetialModleFourBean.setGame_book(i4);
        UtilsMy.n3(this.f33059t, this.N1);
    }

    @Override // com.join.mgps.activity.gamedetail.BaseGameDetailFragment
    @UiThread
    public void setCommentNumber(String str) {
        if (this.G1) {
            return;
        }
        try {
            TextView j4 = this.f33037j.j(1);
            j4.setWidth(getResources().getDimensionPixelOffset(R.dimen.wdp220));
            j4.setText("点评(" + str + ")");
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void setNetwork() {
        UtilsMy.w3(this.f33051p1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showInstallButn() {
        GamedetialModleFourBean gamedetialModleFourBean = this.N1;
        if (gamedetialModleFourBean == null || TextUtils.isEmpty(gamedetialModleFourBean.getCrc_sign_id())) {
            return;
        }
        GamedetialModleFourBean gamedetialModleFourBean2 = this.M1;
        if (gamedetialModleFourBean2 != null && this.U != null && gamedetialModleFourBean2.getSp_tag_info() != null && this.M1.getSp_tag_info().getSelf_support() != null) {
            this.U.setVisibility(8);
        } else {
            ImageView imageView = this.U;
            if (imageView != null) {
                imageView.setVisibility(0);
            }
        }
        try {
            RelativeLayout relativeLayout = this.f33061u;
            if (relativeLayout != null) {
                relativeLayout.setVisibility(8);
            }
            ConstraintLayout constraintLayout = this.f33063v;
            if (constraintLayout != null) {
                constraintLayout.setVisibility(0);
            }
            TextView textView = this.f33059t;
            if (textView != null) {
                textView.setVisibility(0);
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showLoding() {
        try {
            this.I.setVisibility(0);
            this.J.setVisibility(8);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0035 -> B:18:0x003d). Please submit an issue!!! */
    @UiThread
    public void showLodingFailed() {
        try {
            this.I.setVisibility(8);
            try {
                GamedetialModleFourBean gamedetialModleFourBean = this.N1;
                if (gamedetialModleFourBean == null || com.join.mgps.Util.g2.h(gamedetialModleFourBean.getCrc_sign_id())) {
                    this.J.setVisibility(0);
                    this.K.setVisibility(0);
                    if (com.join.android.app.common.utils.j.j(this.f33051p1)) {
                        this.L.setVisibility(8);
                    } else {
                        this.L.setVisibility(0);
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
            ConstraintLayout constraintLayout = this.f33063v;
            if (constraintLayout != null) {
                constraintLayout.setVisibility(8);
            }
            TextView textView = this.f33059t;
            if (textView != null) {
                textView.setVisibility(8);
            }
            RelativeLayout relativeLayout = this.f33061u;
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
        Toast.makeText(this.f33051p1, str, 0).show();
    }

    void t0() {
        DownloadTask downloadtaskDown = this.M1.getDownloadtaskDown();
        UtilsMy.z4(downloadtaskDown, downloadtaskDown.getCrc_link_type_val());
        UtilsMy.C1(downloadtaskDown, this.M1);
        if (UtilsMy.o1(this.f33051p1, downloadtaskDown)) {
            return;
        }
        if (this.M1.getDown_status() == 5) {
            UtilsMy.l1(this.f33051p1, downloadtaskDown);
        } else {
            UtilsMy.R0(this.f33051p1, downloadtaskDown, this.M1.getTp_down_url(), this.M1.getOther_down_switch(), this.M1.getCdn_down_switch());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void t1(int i4) {
        try {
            if (i4 < 100) {
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f33034h2.getLayoutParams();
                layoutParams.width = getResources().getDimensionPixelOffset(R.dimen.wdp24);
                layoutParams.height = getResources().getDimensionPixelOffset(R.dimen.wdp24);
                this.f33034h2.setLayoutParams(layoutParams);
                this.f33034h2.setCompoundDrawables(null, null, null, null);
                this.f33034h2.setBackgroundResource(R.drawable.mygame_big_round);
                this.f33034h2.setPadding(1, 0, 0, 1);
            } else {
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.f33034h2.getLayoutParams();
                layoutParams2.width = getResources().getDimensionPixelOffset(R.dimen.dp70);
                layoutParams2.height = getResources().getDimensionPixelOffset(R.dimen.round_large_size);
                layoutParams2.setMargins(4, (int) TypedValue.applyDimension(1, 7.0f, getResources().getDisplayMetrics()), 0, 0);
                this.f33034h2.setGravity(17);
                this.f33034h2.setLayoutParams(layoutParams2);
                this.f33034h2.setCompoundDrawables(null, null, null, null);
                this.f33034h2.setBackgroundResource(R.drawable.message_round);
                this.f33034h2.setPadding(1, 0, 2, 1);
            }
            this.f33034h2.setVisibility(0);
            TextView textView = this.f33034h2;
            textView.setText(i4 + "");
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    void u0(Context context, String str) {
        DownloadTask F = p1.f.K().F(this.M1.getGame_id());
        if (F != null && !TextUtils.isEmpty(str)) {
            if (F.getStatus() == 5) {
                com.join.mgps.Util.l2.a(getContext()).b(context.getResources().getString(R.string.game_detail_down_status, str));
                return;
            } else if (F.getStatus() != 43 && F.getStatus() != 9 && F.getStatus() != 0) {
                com.join.mgps.Util.l2.a(getContext()).b(context.getResources().getString(R.string.game_detail_downing_status, str));
                return;
            } else {
                t0();
                return;
            }
        }
        t0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void u1(int i4) {
        if (i4 == 0) {
            p1();
        } else {
            o1();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void updateButn() {
        if (this.N1 == null || this.f33032g2 == null) {
            return;
        }
        ConstraintLayout constraintLayout = this.f33063v;
        if (constraintLayout != null) {
            constraintLayout.setVisibility(0);
        }
        if (this.N1.getDel_tag() == 1 && !this.N1.getCompany_name().equals("SNK")) {
            TextView textView = this.f33059t;
            if (textView != null) {
                textView.setEnabled(false);
                this.f33059t.setBackgroundResource(R.drawable.detial_simple_grey_selecter);
                this.f33059t.setText("已下架");
            }
            showInstallButn();
        } else if (this.E1) {
            if (this.N1.getDownloadtaskDown() != null && !this.N1.getDownloadtaskDown().isSingleGame() && this.N1.getDownloadtaskDown().getStatus() == 11) {
                TextView textView2 = this.f33059t;
                if (textView2 != null) {
                    textView2.setText("安装");
                }
            } else {
                TextView textView3 = this.f33059t;
                if (textView3 != null) {
                    textView3.setText(C0("打开"));
                }
            }
            showInstallButn();
        } else if (this.f33063v == null) {
        } else {
            UtilsMy.j3(this.N1.getSp_tag_info(), this.f33063v, this.f33032g2);
            if (this.N1.getPlugin_num() != null) {
                String plugin_num = this.N1.getPlugin_num();
                if (plugin_num.equals(ConstantIntEnum.H5.value() + "")) {
                    TextView textView4 = this.f33059t;
                    if (textView4 != null) {
                        textView4.setBackgroundResource(R.drawable.detial_simple_normal_selecter);
                        this.f33059t.setText(C0("开始"));
                    }
                    showInstallButn();
                    return;
                }
            }
            TextView textView5 = this.f33059t;
            if (textView5 != null) {
                textView5.setTextColor(getResources().getColor(R.color.white));
                this.f33059t.setBackgroundResource(R.drawable.detial_simple_normal_selecter);
            }
            DownloadTask downloadTask = this.f33032g2;
            int status = downloadTask != null ? downloadTask.getStatus() : 0;
            if (UtilsMy.w0(this.N1.getPay_tag_info(), this.N1.getCrc_sign_id()) > 0) {
                status = 43;
            }
            if (status == 9) {
                showInstallButn();
                TextView textView6 = this.f33059t;
                if (textView6 != null) {
                    textView6.setText("更新");
                }
                ImageView imageView = this.f33065w;
                if (imageView != null) {
                    imageView.setImageResource(R.drawable.detail_comment_download_continue);
                    this.f33065w.setImageResource(R.drawable.detial_simple_install_selecter);
                }
            } else if (status == 12) {
                showInstallButn();
                TextView textView7 = this.f33059t;
                if (textView7 != null) {
                    textView7.setText("解压中..");
                }
            } else if (status == 13) {
                showInstallButn();
                TextView textView8 = this.f33059t;
                if (textView8 != null) {
                    textView8.setText("解压");
                }
                ImageView imageView2 = this.f33065w;
                if (imageView2 != null) {
                    imageView2.setImageResource(R.drawable.detail_comment_download_continue);
                }
            } else if (status == 11) {
                showInstallButn();
                TextView textView9 = this.f33059t;
                if (textView9 != null) {
                    textView9.setText("安装");
                    this.f33059t.setBackgroundResource(R.drawable.detial_simple_install_selecter);
                }
                ImageView imageView3 = this.f33065w;
                if (imageView3 != null) {
                    imageView3.setImageResource(R.drawable.detial_simple_install_selecter);
                }
            } else if (status == 5 || status == 42) {
                showInstallButn();
                y1(true);
                TextView textView10 = this.f33059t;
                if (textView10 != null) {
                    textView10.setBackgroundResource(R.drawable.detial_simple_open_selecter);
                    this.f33059t.setText(this.f33051p1.getResources().getString(R.string.download_status_finished));
                }
                ImageView imageView4 = this.f33065w;
                if (imageView4 != null) {
                    imageView4.setImageResource(R.drawable.detail_comment_download_continue);
                }
            } else if (status == 2) {
                showProgress();
                ImageView imageView5 = this.f33065w;
                if (imageView5 != null) {
                    imageView5.setImageResource(R.drawable.detail_comment_download_pause);
                }
                UtilsMy.x4(this.f33032g2);
                ProgressBar progressBar = this.f33068y;
                if (progressBar != null) {
                    progressBar.setProgress((int) this.f33032g2.getProgress());
                }
                TextView textView11 = this.f33067x;
                if (textView11 != null) {
                    textView11.setText(this.f33032g2.getProgress() + "%");
                }
            } else if (status == 3 || status == 6 || status == 27) {
                showProgress();
                this.f33065w.setImageResource(R.drawable.detail_comment_download_continue);
                UtilsMy.x4(this.f33032g2);
                ProgressBar progressBar2 = this.f33068y;
                if (progressBar2 != null) {
                    progressBar2.setProgress((int) this.f33032g2.getProgress());
                }
                TextView textView12 = this.f33067x;
                if (textView12 != null) {
                    textView12.setText(this.f33032g2.getProgress() + "%");
                }
            } else if (status == 10) {
                showInstallButn();
                TextView textView13 = this.f33059t;
                if (textView13 != null) {
                    textView13.setText("等待\u3000" + this.N1.getSize() + "M");
                }
                ImageView imageView6 = this.f33065w;
                if (imageView6 != null) {
                    imageView6.setImageResource(R.drawable.detail_comment_download_continue);
                }
            } else if (status == 1) {
            } else {
                if (status == 43) {
                    x1();
                } else if (status == 48) {
                    showInstallButn();
                    TextView textView14 = this.f33059t;
                    if (textView14 != null) {
                        textView14.setText(this.f33051p1.getResources().getString(R.string.download_status_installing));
                    }
                } else {
                    x1();
                }
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
        if (downloadTask == null || this.E1) {
            return;
        }
        ProgressBar progressBar = this.f33068y;
        if (progressBar instanceof DownloadProgressBar) {
            ((DownloadProgressBar) progressBar).update(downloadTask.getCrc_link_type_val(), 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void updateTitleButn(ResultMainBean resultMainBean, int i4) {
        if (resultMainBean.getFlag() == 1) {
            if (i4 == 1) {
                this.N1.setGame_follow(0);
            } else if (i4 == 2) {
                this.N1.setGame_follow(1);
                ToastManager.show("收藏成功");
                this.D.setImageResource(R.drawable.followed_image);
                this.E.setText("已收藏");
            } else if (i4 == 3) {
                this.N1.setGame_book(0);
            } else if (i4 == 4) {
                this.N1.setGame_book(1);
                Intent intent = new Intent("com.broadcast.bespeak.sussess");
                intent.putExtra("gameid", this.N1.getCrc_sign_id());
                this.f33051p1.sendBroadcast(intent);
                com.join.mgps.Util.b0.f0(this.f33051p1).O(this.f33051p1, 1, new h()).show();
            }
            b1();
            updateButn();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void v0() {
        IntentUtil.getInstance().goMyGameManagerActivity(this.f33051p1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void v1() {
        XListView2 xListView2 = this.W1;
        if (xListView2 != null) {
            try {
                xListView2.u();
                this.W1.v();
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void w0() {
        if (AccountUtil_.getInstance_(this.f33051p1).isTourist()) {
            ((LoginSplashActivity_.IntentBuilder_) LoginSplashActivity_.intent(this.f33051p1).flags(268435456)).start();
            return;
        }
        L0();
        y0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void w1() {
        try {
            p1();
            this.f33034h2.setVisibility(8);
            this.f33034h2.setText("");
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void x0() {
        GamedetialModleFourBean data;
        if (com.join.android.app.common.utils.j.j(this.f33051p1)) {
            try {
                com.wufan.user.service.protobuf.n0 accountData = AccountUtil_.getInstance_(this.f33051p1).getAccountData();
                if (accountData == null) {
                    accountData = com.wufan.user.service.protobuf.n0.b5();
                }
                RequestModel requestModel = new RequestModel();
                requestModel.setDefault(this.f33051p1);
                RequestGameIdArgs requestGameIdArgs = new RequestGameIdArgs(this.f33023c, 1, accountData.getUid());
                requestGameIdArgs.setDownloadedGameIdList(p1.f.K().A());
                requestModel.setArgs(requestGameIdArgs);
                ResponseModel<GamedetialModleFourBean> body = com.join.mgps.rpc.impl.i.D0().B0().p(requestModel.makeSign()).execute().body();
                if (body != null && body.getCode() == 200 && (data = body.getData()) != null) {
                    z1(data);
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

    void x1() {
        showInstallButn();
        this.f33059t.setTextColor(getResources().getColor(R.color.white));
        if (this.f33059t != null) {
            if (UtilsMy.w0(this.N1.getPay_tag_info(), this.N1.getCrc_sign_id()) > 0) {
                this.f33059t.setText(this.f33051p1.getResources().getString(R.string.pay_game_amount, this.N1.getPay_tag_info().getPayGameAmount()));
            } else {
                if (this.G1) {
                    if (com.join.mgps.Util.s0.c() && this.N1.isCpsGame()) {
                        this.f33059t.setText(C0(getResources().getString(R.string.download_status_finished)));
                    } else {
                        this.f33059t.setText(C0(getResources().getString(R.string.download_status_free)));
                    }
                } else {
                    this.f33059t.setText(C0(this.f33051p1.getResources().getString(R.string.download_status_download)));
                }
                this.f33059t.setTextColor(getResources().getColor(R.color.detail_download_normal_txt));
                this.f33059t.setBackgroundResource(R.drawable.detial_simple_normal_selecter1);
            }
        }
        this.f33065w.setImageResource(R.drawable.detail_comment_download_continue);
        GamedetialModleFourBean gamedetialModleFourBean = this.N1;
        if (gamedetialModleFourBean == null || this.f33059t == null) {
            return;
        }
        if (gamedetialModleFourBean.getBespeak_switch() == 1 && (this.N1.getDown_status() == 2 || this.N1.getDown_status() == 6)) {
            if (this.N1.getGame_book() == 1) {
                this.f33059t.setText("已预约");
                UtilsMy.w0(this.N1.getPay_tag_info(), this.N1.getCrc_sign_id());
                f1(this.f33059t, this.N1);
                return;
            }
            this.f33059t.setText("预约");
            return;
        }
        UtilsMy.w0(this.N1.getPay_tag_info(), this.N1.getCrc_sign_id());
        f1(this.f33059t, this.N1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void y0() {
        try {
            if (com.join.android.app.common.utils.j.j(this.f33051p1)) {
                if (IntentUtil.getInstance().goLoginInteractive(this.f33051p1)) {
                    return;
                }
                this.A1 = "";
                com.wufan.user.service.protobuf.n0 accountData = AccountUtil_.getInstance_(this.f33051p1).getAccountData();
                LinkedMultiValueMap linkedMultiValueMap = new LinkedMultiValueMap();
                linkedMultiValueMap.add("uid", Integer.valueOf(accountData.getUid()));
                linkedMultiValueMap.add("token", accountData.getToken());
                linkedMultiValueMap.add("current_game_id", this.f33023c);
                int i4 = this.f33024c2;
                this.f33024c2 = i4 + 1;
                linkedMultiValueMap.add("page", Integer.valueOf(i4));
                linkedMultiValueMap.add("device_id", this.A1);
                linkedMultiValueMap.add("version ", this.B1);
                GameFromPopoWinBean O = this.Z1.O(linkedMultiValueMap);
                if (O != null && O.getError() == 0 && O.getData() != null) {
                    v1();
                    if (this.f33024c2 == 2) {
                        q0();
                    }
                    n0(O);
                    return;
                } else if (O != null && O.getError() == 701) {
                    IntentUtil.getInstance().goMyAccountLoginActivity(this.f33051p1);
                    l1("Token已失效，请重新登录");
                    IntentUtil.getInstance().goLogin(this.f33051p1);
                    J0();
                    return;
                } else {
                    r1();
                    return;
                }
            }
            showToast("网络出错，请稍后重试");
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread(delay = 1000)
    public void y1(boolean z4) {
        ExtBean extBean = this.f33025d;
        if (extBean == null || !"checkgame".equals(extBean.getFrom())) {
            return;
        }
        com.join.mgps.Util.m1.c().b(this.f33051p1, this.f33025d.getFrom_id(), new g(z4));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void z1(GamedetialModleFourBean gamedetialModleFourBean) {
        List<DownloadTask> H;
        boolean z4;
        this.N1 = gamedetialModleFourBean;
        this.M1 = gamedetialModleFourBean;
        try {
            this.G1 = com.join.mgps.Util.q1.e(gamedetialModleFourBean.getTag_info());
            this.E1 = (gamedetialModleFourBean.getSp_tag_info() == null || gamedetialModleFourBean.getSp_tag_info().getMini_game() == null) ? false : true;
            if (this.G1) {
                gamedetialModleFourBean.setNodeId("3");
            } else {
                gamedetialModleFourBean.setNodeId("1");
            }
            gamedetialModleFourBean.set_from_type(this.f33025d.get_from_type());
            gamedetialModleFourBean.set_from(101);
            gamedetialModleFourBean.setRecPosition(this.f33025d.getRecPosition());
            this.N1.set_from_type(this.f33025d.get_from_type());
            this.N1.set_from(101);
            this.N1.setRecPosition(this.f33025d.getRecPosition());
            this.H.setVisibility(0);
            int pic_position = gamedetialModleFourBean.getPic_position();
            if (!this.E1 || pic_position != 1) {
                this.I.setVisibility(8);
                this.J.setVisibility(8);
            }
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
            arrayList.add(new FragmentPagerAdapter.a(this.G1 ? "游戏简介" : "详情", GameDetialModleFourActivity.A0(this.f33023c, this.f33027e, this.f33025d).g0(this)));
            if (this.G1) {
                this.f33043m.setVisibility(8);
            } else {
                this.f33043m.setVisibility(0);
                CommentAllListFragment c02 = CommentAllListFragment.c0(commentAlllistIntentData);
                c02.f0(new q(gamedetialModleFourBean));
                arrayList.add(new FragmentPagerAdapter.a("评论", c02));
                if (gamedetialModleFourBean.getStandalone_cloud_archive() != null && gamedetialModleFourBean.getStandalone_cloud_archive().getTag_list() != null && gamedetialModleFourBean.getMod_info() != null) {
                    Bundle bundle = new Bundle();
                    GameDetailModCloudListFragment gameDetailModCloudListFragment = new GameDetailModCloudListFragment();
                    bundle.putString("gameId", gamedetialModleFourBean.getMod_info().getMod_game_id());
                    bundle.putInt("type", 1);
                    bundle.putSerializable("datas", gamedetialModleFourBean.getStandalone_cloud_archive());
                    gameDetailModCloudListFragment.setArguments(bundle);
                    arrayList.add(new FragmentPagerAdapter.a("云存档", gameDetailModCloudListFragment));
                } else if (gamedetialModleFourBean.getRoom_cfg_info() != null && gamedetialModleFourBean.getRoom_cfg_info().getCloud_archive_count() > 0) {
                    Bundle bundle2 = new Bundle();
                    GameDetailEmusCloudListFragment gameDetailEmusCloudListFragment = new GameDetailEmusCloudListFragment();
                    bundle2.putString("gameId", this.f33023c);
                    gameDetailEmusCloudListFragment.setArguments(bundle2);
                    gameDetailEmusCloudListFragment.setMListener(new r());
                    arrayList.add(new FragmentPagerAdapter.a("云存档", gameDetailEmusCloudListFragment));
                }
                arrayList.add(new FragmentPagerAdapter.a("游戏单", GameFormFragment.h0(gamedetialModleFourBean.getGame_company_id(), this.f33023c)));
            }
            FragmentPagerAdapter fragmentPagerAdapter = new FragmentPagerAdapter(getChildFragmentManager(), arrayList);
            this.f33039k.setOffscreenPageLimit(3);
            this.f33039k.setAdapter(fragmentPagerAdapter);
            this.f33037j.setTabSpaceEqual(!this.G1);
            this.f33037j.setViewPager(this.f33039k);
            if (this.Z) {
                int i4 = 0;
                while (true) {
                    if (i4 >= arrayList.size()) {
                        break;
                    } else if (TextUtils.equals("评论", ((FragmentPagerAdapter.a) arrayList.get(i4)).f41977a)) {
                        this.f33039k.setCurrentItem(i4);
                        break;
                    } else {
                        i4++;
                    }
                }
                new Handler().postDelayed(new s(), 1500L);
            }
            if (arrayList.size() == 1) {
                this.T.setVisibility(8);
            }
            Z0(gamedetialModleFourBean);
            if (this.f33027e && p1.f.K().F(this.f33023c) == null) {
                com.php25.PDownload.d.c(gamedetialModleFourBean.getDownloadtaskDown(), this.f33051p1);
                onDetailDownload();
            }
            GamedetialModleFourBean gamedetialModleFourBean2 = this.N1;
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
                H = p1.f.K().H(this.N1.getPackageName());
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
                    this.f33032g2 = p1.f.K().F(this.f33023c);
                } else if (z5) {
                    if (this.N1.getMod_info() != null) {
                        this.f33032g2 = p1.f.K().F(this.N1.getMod_info().getMod_game_id());
                    }
                } else if (z4) {
                    this.f33032g2 = p1.f.K().F(this.f33023c);
                } else {
                    if (this.N1.getMod_info() != null) {
                        this.f33032g2 = p1.f.K().F(this.N1.getMod_info().getMod_game_id());
                    }
                    if (this.f33032g2 == null) {
                        this.f33032g2 = p1.f.K().F(this.f33023c);
                    }
                }
            }
            DownloadTask downloadTask2 = this.f33032g2;
            if (downloadTask2 == null) {
                this.f33032g2 = this.N1.getDownloadtaskDown();
                if (UtilsMy.o0(this.N1.getTag_info())) {
                    if (this.f33032g2.getMod_info() == null) {
                        this.f33032g2.setFileType(Dtype.android.name());
                        if (com.join.android.app.common.utils.e.l0(this.f33051p1).d(this.f33051p1, this.N1.getPackageName())) {
                            APKUtils.a l4 = com.join.android.app.common.utils.e.l0(this.f33051p1).l(this.f33051p1, this.N1.getPackageName());
                            if (com.join.mgps.Util.g2.i(this.N1.getVer()) && l4.d() < Integer.parseInt(this.N1.getVer())) {
                                this.f33032g2.setStatus(9);
                            } else {
                                this.f33032g2.setStatus(5);
                            }
                        } else {
                            this.f33032g2.setStatus(0);
                        }
                    }
                } else {
                    this.f33032g2.setStatus(0);
                }
            } else {
                downloadTask2.setDownloadType(0);
                this.f33032g2.setTask_down_type(0);
                this.f33032g2.setScreenshot_pic(this.N1.getScreenshot_pic());
            }
            if (("" + this.N1.getPlugin_num()).equals("" + ConstantIntEnum.H5.value())) {
                GamedetialModleFourBean gamedetialModleFourBean3 = this.N1;
                gamedetialModleFourBean3.setDown_count(gamedetialModleFourBean3.getStart_count());
            }
            updateButn();
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }
}
