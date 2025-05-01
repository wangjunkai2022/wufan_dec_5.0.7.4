package com.join.mgps.activity;

import android.app.Activity;
import android.app.Dialog;
import android.content.ClipboardManager;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AbsListView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import com.BaseActivity;
import com.MApplication;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.facebook.drawee.view.SimpleDraweeView;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.android.app.common.utils.APKUtils;
import com.join.android.app.common.utils.JsonMapper;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.AESUtils;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.IntentDateBean;
import com.join.mgps.Util.IntentToDetialBean;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.Util.RequestBeanUtil;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.Util.m1;
import com.join.mgps.activity.login.LoginSplashActivity_;
import com.join.mgps.adapter.MGGameDetailAdapter;
import com.join.mgps.customview.CustomerDownloadView;
import com.join.mgps.customview.ScrollTextViewLayout;
import com.join.mgps.customview.XListView2;
import com.join.mgps.db.tables.PurchasedListTable;
import com.join.mgps.dto.AccountGetVoucherResult;
import com.join.mgps.dto.CollectionBeanSub;
import com.join.mgps.dto.CommentAllListBean;
import com.join.mgps.dto.CommentBaseBean;
import com.join.mgps.dto.CommentPraiseBean;
import com.join.mgps.dto.CommentResponse;
import com.join.mgps.dto.CommentTokenBean;
import com.join.mgps.dto.CommonRequestBean;
import com.join.mgps.dto.DetailResultBeanV3;
import com.join.mgps.dto.DetialIntentBean;
import com.join.mgps.dto.ExtBean;
import com.join.mgps.dto.ForumBean;
import com.join.mgps.dto.GameDetialBookTag;
import com.join.mgps.dto.GameDetialStrategyItem;
import com.join.mgps.dto.GameDetialStrategyTag;
import com.join.mgps.dto.GameFromBooleanBean;
import com.join.mgps.dto.GameFromPopoWinBean;
import com.join.mgps.dto.GamePariseRequest;
import com.join.mgps.dto.GameScore;
import com.join.mgps.dto.GameVoucherBean;
import com.join.mgps.dto.GiftPackageDataInfoBean;
import com.join.mgps.dto.GiftPackageDataOperationBean;
import com.join.mgps.dto.GiftPackageOperationBean;
import com.join.mgps.dto.InformationCommentBean;
import com.join.mgps.dto.PapayVoucherResultMain;
import com.join.mgps.dto.PariseBackData;
import com.join.mgps.dto.RecommendInfomationBean;
import com.join.mgps.dto.RequestCommentpraiseArgs;
import com.join.mgps.dto.RequestGameIdArgs;
import com.join.mgps.dto.RequestdetialFolowAndBeSpeak;
import com.join.mgps.dto.ResultMainBean;
import com.join.mgps.dto.ServiceState;
import com.join.mgps.dto.ShareBean;
import com.join.mgps.dto.TipBean;
import com.join.mgps.enums.Dtype;
import com.join.mgps.pref.PrefDef_;
import com.join.mgps.ptr.PtrClassicFrameLayout;
import com.papa.sim.statistic.Where;
import com.umeng.analytics.MobclickAgent;
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
import org.androidannotations.annotations.Receiver;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
import org.androidannotations.annotations.sharedpreferences.Pref;
import org.springframework.util.LinkedMultiValueMap;
@EActivity(R.layout.mg_game_detail_layout)
/* loaded from: classes.dex */
public class MGGameDetailActivity extends BaseActivity {

    /* renamed from: h2  reason: collision with root package name */
    private static final String f34327h2 = "MGGameDetailActivity";

    /* renamed from: i2  reason: collision with root package name */
    static String f34328i2 = "0";

    /* renamed from: j2  reason: collision with root package name */
    static String f34329j2 = "";

    /* renamed from: k2  reason: collision with root package name */
    static boolean f34330k2;
    @ViewById
    View A;
    com.join.mgps.rpc.f A1;
    @ViewById
    ImageView B;
    @ViewById
    RelativeLayout C;
    @ViewById
    ImageView D;
    private List<MGGameDetailAdapter.y0> D1;
    @ViewById(R.id.title_normal_download_cdv)
    CustomerDownloadView E;
    private RelativeLayout E1;
    com.join.mgps.rpc.e F;
    com.join.mgps.customview.o F1;
    com.join.mgps.rpc.o G;
    @Extra
    IntentDateBean H;
    private String H1;
    @Extra
    ExtBean I;
    private GameScore I1;
    @Pref
    PrefDef_ J;
    private Activity K;
    private DownloadTask L;
    String L1;
    private DetailResultBeanV3 M;
    String M1;
    private IntentDateBean N;
    private IntentToDetialBean O;
    String O1;
    PopupWindow P1;
    private int Q;
    LinearLayout Q1;
    private int R;
    LinearLayout R1;
    private MGGameDetailAdapter S;
    LinearLayout S1;
    private Animation T;
    EditText T1;
    private com.wufan.user.service.protobuf.n0 U;
    TextView U1;
    private int V;
    TextView V1;
    LinearLayout W1;
    private Dialog X;
    public XListView2 X1;
    private com.join.android.app.common.manager.b Y;
    v Y1;
    private com.join.mgps.dialog.d1 Z;
    com.join.mgps.rpc.b Z1;

    /* renamed from: a2  reason: collision with root package name */
    com.join.mgps.rpc.b f34331a2;
    @ViewById

    /* renamed from: b  reason: collision with root package name */
    View f34332b;

    /* renamed from: b2  reason: collision with root package name */
    GameFromPopoWinBean f34333b2;
    @ViewById

    /* renamed from: c  reason: collision with root package name */
    RelativeLayout f34334c;

    /* renamed from: c2  reason: collision with root package name */
    PtrClassicFrameLayout f34335c2;
    @ViewById

    /* renamed from: d  reason: collision with root package name */
    RelativeLayout f34336d;
    @ViewById

    /* renamed from: e  reason: collision with root package name */
    LinearLayout f34338e;
    @ViewById(resName = "loding_layout")

    /* renamed from: f  reason: collision with root package name */
    LinearLayout f34340f;
    @ViewById

    /* renamed from: g  reason: collision with root package name */
    TextView f34342g;
    @ViewById

    /* renamed from: h  reason: collision with root package name */
    ListView f34344h;
    @ViewById

    /* renamed from: i  reason: collision with root package name */
    RelativeLayout f34345i;
    @ViewById

    /* renamed from: j  reason: collision with root package name */
    TextView f34346j;
    @ViewById

    /* renamed from: k  reason: collision with root package name */
    ImageView f34347k;
    @ViewById

    /* renamed from: l  reason: collision with root package name */
    TextView f34348l;
    @ViewById

    /* renamed from: m  reason: collision with root package name */
    RelativeLayout f34349m;
    @ViewById

    /* renamed from: n  reason: collision with root package name */
    RelativeLayout f34350n;
    @ViewById

    /* renamed from: o  reason: collision with root package name */
    ImageView f34351o;
    @ViewById

    /* renamed from: p  reason: collision with root package name */
    TextView f34352p;

    /* renamed from: p0  reason: collision with root package name */
    private boolean f34353p0;
    @ViewById

    /* renamed from: q  reason: collision with root package name */
    ProgressBar f34355q;
    @ViewById

    /* renamed from: r  reason: collision with root package name */
    LinearLayout f34356r;
    @ViewById

    /* renamed from: s  reason: collision with root package name */
    TextView f34357s;
    @ViewById

    /* renamed from: t  reason: collision with root package name */
    TextView f34358t;
    @ViewById

    /* renamed from: u  reason: collision with root package name */
    ScrollTextViewLayout f34359u;
    @ViewById

    /* renamed from: v  reason: collision with root package name */
    ImageView f34360v;
    @ViewById

    /* renamed from: w  reason: collision with root package name */
    ImageView f34362w;
    @ViewById

    /* renamed from: x  reason: collision with root package name */
    ImageView f34363x;
    @ViewById

    /* renamed from: y  reason: collision with root package name */
    ImageView f34364y;
    @ViewById

    /* renamed from: z  reason: collision with root package name */
    ImageView f34365z;
    private boolean P = false;
    private int W = 0;

    /* renamed from: p1  reason: collision with root package name */
    Map<String, DownloadTask> f34354p1 = new HashMap();

    /* renamed from: v1  reason: collision with root package name */
    Map<String, DownloadTask> f34361v1 = new HashMap();
    Handler B1 = new k();
    com.join.mgps.customview.o C1 = null;
    private CommentAllListBean.SelfCommentBean G1 = null;
    com.join.mgps.customview.o J1 = null;
    com.join.mgps.customview.o K1 = null;
    int N1 = 0;

    /* renamed from: d2  reason: collision with root package name */
    int f34337d2 = 1;

    /* renamed from: e2  reason: collision with root package name */
    List<GameFromPopoWinBean.DataBean> f34339e2 = new ArrayList();

    /* renamed from: f2  reason: collision with root package name */
    boolean f34341f2 = true;

    /* renamed from: g2  reason: collision with root package name */
    int f34343g2 = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a implements MGGameDetailAdapter.v0 {
        a() {
        }

        @Override // com.join.mgps.adapter.MGGameDetailAdapter.v0
        public void a(InformationCommentBean informationCommentBean) {
        }

        @Override // com.join.mgps.adapter.MGGameDetailAdapter.v0
        public void b(CommentBaseBean commentBaseBean, int i4, int i5) {
            MGGameDetailActivity.this.Y0(commentBaseBean, i4, i5);
        }

        @Override // com.join.mgps.adapter.MGGameDetailAdapter.v0
        public void c(CommentBaseBean commentBaseBean, int i4, int i5) {
            MGGameDetailActivity.this.a1(commentBaseBean, i4, i5);
        }

        @Override // com.join.mgps.adapter.MGGameDetailAdapter.v0
        public void d(CommentBaseBean commentBaseBean) {
            MGGameDetailActivity.this.Z0(commentBaseBean);
        }

        @Override // com.join.mgps.adapter.MGGameDetailAdapter.v0
        public void e(InformationCommentBean.Sub sub) {
            InformationCommentBean informationCommentBean = new InformationCommentBean();
            informationCommentBean.setUser_name(sub.getUser_name());
            informationCommentBean.setComment_id(sub.getUser_id());
            informationCommentBean.setUser_id(sub.getUser_id());
            if (MGGameDetailActivity.this.M != null) {
                GameCommentActivity_.U0(MGGameDetailActivity.this.K).a(MGGameDetailActivity.this.M.getCrc_sign_id()).d(true).b(informationCommentBean).start();
            }
        }

        @Override // com.join.mgps.adapter.MGGameDetailAdapter.v0
        public void f(CommentBaseBean commentBaseBean) {
            if (MGGameDetailActivity.this.M != null) {
                MGGameDetailActivity.this.Z0(commentBaseBean);
            }
        }

        @Override // com.join.mgps.adapter.MGGameDetailAdapter.v0
        public void g() {
        }

        @Override // com.join.mgps.adapter.MGGameDetailAdapter.v0
        public void h() {
        }

        @Override // com.join.mgps.adapter.MGGameDetailAdapter.v0
        public void i() {
            if (AccountUtil_.getInstance_(MGGameDetailActivity.this.K).isTourist()) {
                ((LoginSplashActivity_.IntentBuilder_) LoginSplashActivity_.intent(MGGameDetailActivity.this.K).flags(268435456)).start();
                return;
            }
            MGGameDetailActivity.this.R0();
            MGGameDetailActivity.this.J0();
        }

        @Override // com.join.mgps.adapter.MGGameDetailAdapter.v0
        public void j() {
            ForumBean.ForumPostsBean forumPostsBean = new ForumBean.ForumPostsBean();
            forumPostsBean.setPid((int) MGGameDetailActivity.this.M.getForum_id());
            com.join.mgps.Util.j0.v0(MGGameDetailActivity.this, forumPostsBean);
        }

        @Override // com.join.mgps.adapter.MGGameDetailAdapter.v0
        public void k() {
            if (MGGameDetailActivity.this.M.getGame_book() == 1 || IntentUtil.getInstance().goLoginNetGame(MGGameDetailActivity.this.K)) {
                return;
            }
            MGGameDetailActivity.this.v0(4);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class b implements m1.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f34367a;

        b(boolean z4) {
            this.f34367a = z4;
        }

        @Override // com.join.mgps.Util.m1.b
        public void a(m1.c cVar) {
            if (cVar.a() == 1) {
                MGGameDetailActivity.this.finish();
                com.join.mgps.Util.m1.c().e(MGGameDetailActivity.this.K, MGGameDetailActivity.this.I.getFrom_id(), cVar.b());
                com.join.mgps.Util.l2.a(MGGameDetailActivity.this.K).b("授权成功");
            } else if (this.f34367a) {
                MGGameDetailActivity.this.i2(false);
            }
        }
    }

    /* loaded from: classes4.dex */
    class c implements CompoundButton.OnCheckedChangeListener {
        c() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z4) {
            MGGameDetailActivity.this.J.noFavoriteTips().g(Boolean.valueOf(z4));
        }
    }

    /* loaded from: classes4.dex */
    class d implements View.OnClickListener {
        d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            com.join.mgps.customview.o oVar = MGGameDetailActivity.this.F1;
            if (oVar != null && oVar.isShowing()) {
                MGGameDetailActivity.this.F1.dismiss();
            }
            MGGameDetailActivity.this.E0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class e implements w1.c {
        e() {
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
    public class g implements PopupWindow.OnDismissListener {
        g() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            MGGameDetailActivity mGGameDetailActivity = MGGameDetailActivity.this;
            mGGameDetailActivity.f34337d2 = 1;
            mGGameDetailActivity.y0();
            MGGameDetailActivity mGGameDetailActivity2 = MGGameDetailActivity.this;
            mGGameDetailActivity2.N1 = 0;
            mGGameDetailActivity2.E1(1.0f);
            MGGameDetailActivity.f34329j2 = MGGameDetailActivity.this.T1.getText().toString().trim();
            MGGameDetailActivity mGGameDetailActivity3 = MGGameDetailActivity.this;
            if (mGGameDetailActivity3.f34341f2) {
                return;
            }
            mGGameDetailActivity3.f34341f2 = true;
            mGGameDetailActivity3.g0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class h implements com.join.mgps.customview.g {
        h() {
        }

        @Override // com.join.mgps.customview.g
        public void onRefresh() {
            MGGameDetailActivity mGGameDetailActivity = MGGameDetailActivity.this;
            mGGameDetailActivity.f34337d2 = 1;
            mGGameDetailActivity.i0();
            MGGameDetailActivity.this.J0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class i implements com.join.mgps.customview.f {
        i() {
        }

        @Override // com.join.mgps.customview.f
        public void onLoadMore() {
            MGGameDetailActivity.this.i0();
            MGGameDetailActivity.this.J0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class j implements View.OnClickListener {
        j() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MGGameDetailActivity.this.P1.dismiss();
        }
    }

    /* loaded from: classes4.dex */
    class k extends Handler {
        k() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            MGGameDetailActivity mGGameDetailActivity = MGGameDetailActivity.this;
            mGGameDetailActivity.U = AccountUtil_.getInstance_(mGGameDetailActivity.getApplicationContext()).getAccountData();
            int i4 = message.what;
            if (i4 == 1) {
                if (IntentUtil.getInstance().goLoginInteractive(MGGameDetailActivity.this.K)) {
                    return;
                }
                MGGameDetailActivity.this.c1((InformationCommentBean) message.obj);
            } else if (i4 == 2) {
                if (IntentUtil.getInstance().goLoginNetGame(MGGameDetailActivity.this.K)) {
                    return;
                }
                MGGameDetailActivity.this.T1((GiftPackageDataInfoBean) message.obj);
            } else if (i4 != 3) {
                if (i4 == 4 && !IntentUtil.getInstance().goLoginNetGame(MGGameDetailActivity.this.K)) {
                    MGGameDetailActivity mGGameDetailActivity2 = MGGameDetailActivity.this;
                    mGGameDetailActivity2.Z = com.join.mgps.Util.b0.f0(mGGameDetailActivity2.K).x(MGGameDetailActivity.this.K);
                    MGGameDetailActivity.this.Z.show();
                    MGGameDetailActivity.this.N0((GameVoucherBean) message.obj);
                }
            } else if (IntentUtil.getInstance().goLoginNetGame(MGGameDetailActivity.this.K)) {
            } else {
                GiftPackageDataInfoBean giftPackageDataInfoBean = (GiftPackageDataInfoBean) message.obj;
                if (MGGameDetailActivity.this.x0(giftPackageDataInfoBean.getGift_package_type())) {
                    MGGameDetailActivity.this.K0(giftPackageDataInfoBean);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class l implements View.OnClickListener {
        l() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MGGameDetailActivity.f34330k2 = true;
            MGGameDetailActivity.this.startActivity(new Intent(MGGameDetailActivity.this, BuildGameFromActivity_.class));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class m implements View.OnClickListener {
        m() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            String trim = MGGameDetailActivity.this.T1.getText().toString().trim();
            MGGameDetailActivity.f34329j2 = trim;
            if (com.join.mgps.Util.o.f(trim)) {
                MGGameDetailActivity.this.showToast("不能上传表情");
                return;
            }
            MGGameDetailActivity.this.P1.dismiss();
            MGGameDetailActivity mGGameDetailActivity = MGGameDetailActivity.this;
            if (mGGameDetailActivity.f34341f2) {
                return;
            }
            mGGameDetailActivity.f34341f2 = true;
            mGGameDetailActivity.g0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class n implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ GiftPackageDataInfoBean f34380b;

        n(GiftPackageDataInfoBean giftPackageDataInfoBean) {
            this.f34380b = giftPackageDataInfoBean;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ((ClipboardManager) MGGameDetailActivity.this.K.getSystemService("clipboard")).setText(this.f34380b.getGift_package_code());
            com.join.mgps.Util.l2 a5 = com.join.mgps.Util.l2.a(MGGameDetailActivity.this.K);
            a5.b(this.f34380b.getGift_package_code() + "已复制到剪贴板");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class o implements View.OnClickListener {
        o() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (MGGameDetailActivity.this.X == null || !MGGameDetailActivity.this.X.isShowing()) {
                return;
            }
            MGGameDetailActivity.this.X.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class p implements View.OnClickListener {
        p() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DownloadTask F;
            if (MGGameDetailActivity.this.X != null && MGGameDetailActivity.this.X.isShowing()) {
                MGGameDetailActivity.this.X.dismiss();
            }
            int status = MGGameDetailActivity.this.L != null ? MGGameDetailActivity.this.L.getStatus() : 0;
            if (UtilsMy.w0(MGGameDetailActivity.this.M.getPay_tag_info(), MGGameDetailActivity.this.M.getCrc_sign_id()) > 0) {
                status = 43;
            }
            if (status != 0) {
                if (status == 5) {
                    UtilsMy.W3(MGGameDetailActivity.this.K, MGGameDetailActivity.this.L, "2");
                    return;
                } else if (status != 9 && status != 43) {
                    return;
                }
            }
            MGGameDetailActivity.this.L.setKeyword(Where.detail.name());
            if (com.join.mgps.Util.g2.i(MGGameDetailActivity.this.L.getCrc_link_type_val()) && (F = p1.f.K().F(MGGameDetailActivity.this.L.getCrc_link_type_val())) != null) {
                UtilsMy.y4(MGGameDetailActivity.this.L, F);
            }
            MGGameDetailActivity mGGameDetailActivity = MGGameDetailActivity.this;
            mGGameDetailActivity.t0(mGGameDetailActivity.L);
            if (MGGameDetailActivity.this.M != null) {
                if (UtilsMy.y0(MGGameDetailActivity.this.M.getPay_tag_info(), MGGameDetailActivity.this.M.getCrc_sign_id()) <= 0) {
                    UtilsMy.A1(MGGameDetailActivity.this.L, MGGameDetailActivity.this.M);
                    if (!UtilsMy.o1(MGGameDetailActivity.this.K, MGGameDetailActivity.this.L)) {
                        if (MGGameDetailActivity.this.M.getDown_status() == 5) {
                            UtilsMy.l1(MGGameDetailActivity.this.K, MGGameDetailActivity.this.L);
                        } else {
                            UtilsMy.R0(MGGameDetailActivity.this.K, MGGameDetailActivity.this.L, MGGameDetailActivity.this.M.getTp_down_url(), MGGameDetailActivity.this.M.getOther_down_switch(), MGGameDetailActivity.this.M.getCdn_down_switch());
                        }
                    }
                    MGGameDetailActivity.this.V0();
                } else {
                    ExtBean extBean = MGGameDetailActivity.this.I;
                    if (extBean == null || !"checkgame".equals(extBean.getFrom())) {
                        UtilsMy.d4(MGGameDetailActivity.this.K, MGGameDetailActivity.this.M.getCrc_sign_id());
                    } else {
                        UtilsMy.e4(MGGameDetailActivity.this.K, MGGameDetailActivity.this.M.getCrc_sign_id(), MGGameDetailActivity.this.I.getFrom_id());
                    }
                }
            }
            MGGameDetailActivity.this.L.setStatus(2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class q implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ GiftPackageDataOperationBean f34384b;

        q(GiftPackageDataOperationBean giftPackageDataOperationBean) {
            this.f34384b = giftPackageDataOperationBean;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ((ClipboardManager) MGGameDetailActivity.this.K.getSystemService("clipboard")).setText(this.f34384b.getGift_info().getGift_package_code());
            com.join.mgps.Util.l2 a5 = com.join.mgps.Util.l2.a(MGGameDetailActivity.this.K);
            a5.b(this.f34384b.getGift_info().getGift_package_code() + "已复制到剪贴板");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class r implements View.OnClickListener {
        r() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (MGGameDetailActivity.this.X == null || !MGGameDetailActivity.this.X.isShowing()) {
                return;
            }
            MGGameDetailActivity.this.X.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class s implements View.OnClickListener {
        s() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DownloadTask F;
            if (MGGameDetailActivity.this.X != null && MGGameDetailActivity.this.X.isShowing()) {
                MGGameDetailActivity.this.X.dismiss();
            }
            int status = MGGameDetailActivity.this.L != null ? MGGameDetailActivity.this.L.getStatus() : 0;
            if (UtilsMy.w0(MGGameDetailActivity.this.M.getPay_tag_info(), MGGameDetailActivity.this.M.getCrc_sign_id()) > 0) {
                status = 43;
            }
            if (status != 0) {
                if (status == 5) {
                    UtilsMy.W3(MGGameDetailActivity.this.K, MGGameDetailActivity.this.L, "2");
                    return;
                } else if (status != 9 && status != 43) {
                    return;
                }
            }
            if (MGGameDetailActivity.this.M.getDown_status() == 2) {
                return;
            }
            MGGameDetailActivity.this.L.setKeyword(Where.detail.name());
            if (com.join.mgps.Util.g2.i(MGGameDetailActivity.this.L.getCrc_link_type_val()) && (F = p1.f.K().F(MGGameDetailActivity.this.L.getCrc_link_type_val())) != null) {
                UtilsMy.y4(MGGameDetailActivity.this.L, F);
            }
            MGGameDetailActivity mGGameDetailActivity = MGGameDetailActivity.this;
            mGGameDetailActivity.t0(mGGameDetailActivity.L);
            if (MGGameDetailActivity.this.M != null) {
                if (UtilsMy.y0(MGGameDetailActivity.this.M.getPay_tag_info(), MGGameDetailActivity.this.M.getCrc_sign_id()) > 0) {
                    UtilsMy.d4(MGGameDetailActivity.this.K, MGGameDetailActivity.this.M.getCrc_sign_id());
                } else {
                    UtilsMy.A1(MGGameDetailActivity.this.L, MGGameDetailActivity.this.M);
                    if (!UtilsMy.o1(MGGameDetailActivity.this.K, MGGameDetailActivity.this.L)) {
                        if (MGGameDetailActivity.this.M.getDown_status() == 5) {
                            UtilsMy.l1(MGGameDetailActivity.this.K, MGGameDetailActivity.this.L);
                        } else {
                            UtilsMy.R0(MGGameDetailActivity.this.K, MGGameDetailActivity.this.L, MGGameDetailActivity.this.M.getTp_down_url(), MGGameDetailActivity.this.M.getOther_down_switch(), MGGameDetailActivity.this.M.getCdn_down_switch());
                        }
                    }
                    MGGameDetailActivity.this.V0();
                }
            }
            MGGameDetailActivity.this.L.setStatus(2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class t implements View.OnClickListener {
        t() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MGGameDetailActivity.this.i1();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class u implements AbsListView.OnScrollListener {
        u() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i4, int i5, int i6) {
            try {
                if (i4 == 0) {
                    View childAt = MGGameDetailActivity.this.f34344h.getChildAt(0);
                    if (childAt != null && childAt.getTop() == 0) {
                        if (MGGameDetailActivity.this.M.getSp_tpl_two_position() != 0) {
                            if (MGGameDetailActivity.this.M.getBespeak_switch() == 1) {
                                MGGameDetailActivity.this.f34332b.setVisibility(8);
                                MGGameDetailActivity.this.D.setVisibility(0);
                                MGGameDetailActivity.this.f34334c.setVisibility(8);
                                if (Build.VERSION.SDK_INT >= 21) {
                                    MGGameDetailActivity.this.Y.n(R.color.transparent);
                                }
                            } else {
                                MGGameDetailActivity.this.D.setVisibility(8);
                                MGGameDetailActivity.this.f34334c.setVisibility(0);
                                MGGameDetailActivity.this.f34332b.setVisibility(0);
                                if (Build.VERSION.SDK_INT >= 21) {
                                    MGGameDetailActivity.this.Y.n(R.color.ov_status_bar);
                                }
                            }
                        } else {
                            MGGameDetailActivity.this.f34332b.setVisibility(8);
                            MGGameDetailActivity.this.D.setVisibility(0);
                            MGGameDetailActivity.this.f34334c.setVisibility(8);
                            if (Build.VERSION.SDK_INT >= 21) {
                                MGGameDetailActivity.this.Y.n(R.color.transparent);
                            }
                        }
                    } else {
                        MGGameDetailActivity.this.D.setVisibility(8);
                        MGGameDetailActivity.this.f34334c.setVisibility(0);
                        MGGameDetailActivity.this.f34332b.setVisibility(0);
                        if (Build.VERSION.SDK_INT >= 21 && MGGameDetailActivity.this.Y != null) {
                            MGGameDetailActivity.this.Y.n(R.color.ov_status_bar);
                        }
                    }
                } else {
                    MGGameDetailActivity.this.D.setVisibility(8);
                    MGGameDetailActivity.this.f34334c.setVisibility(0);
                    MGGameDetailActivity.this.f34332b.setVisibility(0);
                    if (Build.VERSION.SDK_INT >= 21) {
                        MGGameDetailActivity.this.Y.n(R.color.ov_status_bar);
                    }
                }
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i4) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class v extends BaseAdapter {

        /* loaded from: classes4.dex */
        class a implements View.OnClickListener {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ int f34391b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ w f34392c;

            a(int i4, w wVar) {
                this.f34391b = i4;
                this.f34392c = wVar;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (MGGameDetailActivity.this.f34339e2.get(this.f34391b).getCurrent_game_state().equals("0")) {
                    this.f34392c.f34395b.setBackgroundResource(R.drawable.followed_image);
                    MGGameDetailActivity.this.Q1.setVisibility(0);
                    MGGameDetailActivity.this.X1.setVisibility(8);
                    MGGameDetailActivity.this.U1.setVisibility(0);
                    MGGameDetailActivity.this.V1.setText("收藏成功");
                    MGGameDetailActivity.this.W1.setVisibility(8);
                    MGGameDetailActivity.f34328i2 = MGGameDetailActivity.this.f34339e2.get(this.f34391b).getId();
                    MGGameDetailActivity mGGameDetailActivity = MGGameDetailActivity.this;
                    mGGameDetailActivity.f34341f2 = false;
                    int i4 = mGGameDetailActivity.N1 + 1;
                    mGGameDetailActivity.N1 = i4;
                    if (i4 > 0) {
                        mGGameDetailActivity.M.setGame_follow(1);
                        MGGameDetailActivity.this.e1();
                        return;
                    }
                    return;
                }
                this.f34392c.f34395b.setBackgroundResource(R.drawable.follow_none_image);
                MGGameDetailActivity.this.f34339e2.get(this.f34391b).setCurrent_game_state("0");
                MGGameDetailActivity mGGameDetailActivity2 = MGGameDetailActivity.this;
                mGGameDetailActivity2.h0(mGGameDetailActivity2.f34339e2.get(this.f34391b).getId(), MGGameDetailActivity.this.O1, this.f34392c);
                MGGameDetailActivity mGGameDetailActivity3 = MGGameDetailActivity.this;
                int i5 = mGGameDetailActivity3.N1 - 1;
                mGGameDetailActivity3.N1 = i5;
                mGGameDetailActivity3.N1 = i5;
                if (i5 == 0) {
                    mGGameDetailActivity3.M.setGame_follow(0);
                    MGGameDetailActivity.this.e1();
                }
            }
        }

        v() {
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return MGGameDetailActivity.this.f34339e2.size();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i4) {
            return MGGameDetailActivity.this.f34339e2.get(i4);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i4) {
            return i4;
        }

        @Override // android.widget.Adapter
        public View getView(int i4, View view, ViewGroup viewGroup) {
            w wVar;
            if (view == null) {
                view = LayoutInflater.from(MGGameDetailActivity.this.K).inflate(R.layout.list_item, (ViewGroup) null);
                wVar = new w();
                wVar.f34394a = (SimpleDraweeView) view.findViewById(R.id.iv_img);
                wVar.f34395b = (ImageView) view.findViewById(R.id.iv_coll);
                wVar.f34396c = (TextView) view.findViewById(R.id.tv_title);
                wVar.f34397d = (TextView) view.findViewById(R.id.tv_size);
                wVar.f34399f = (RelativeLayout) view.findViewById(R.id.ll_gameform);
                wVar.f34400g = (RelativeLayout) view.findViewById(R.id.rl_content);
                view.setTag(wVar);
            } else {
                wVar = (w) view.getTag();
            }
            if (MGGameDetailActivity.this.f34339e2.get(i4).getGame_list().get(0).getGame_ico() != null && !MGGameDetailActivity.this.f34339e2.get(i4).getGame_list().get(0).getGame_ico().equals("")) {
                wVar.f34394a.setImageURI(MGGameDetailActivity.this.f34339e2.get(i4).getGame_list().get(0).getGame_ico());
            } else {
                wVar.f34394a.setImageResource(R.drawable.main_normal_icon);
            }
            wVar.f34396c.setText(MGGameDetailActivity.this.f34339e2.get(i4).getTitle());
            wVar.f34397d.setText(MGGameDetailActivity.this.f34339e2.get(i4).getGame_count() + "款");
            if (MGGameDetailActivity.this.f34339e2.get(i4).getCurrent_game_state().equals("0")) {
                wVar.f34395b.setBackgroundResource(R.drawable.follow_none_image);
            } else {
                wVar.f34395b.setBackgroundResource(R.drawable.followed_image);
                MGGameDetailActivity.this.N1++;
            }
            wVar.f34400g.setOnClickListener(new a(i4, wVar));
            return view;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class w {

        /* renamed from: a  reason: collision with root package name */
        SimpleDraweeView f34394a;

        /* renamed from: b  reason: collision with root package name */
        ImageView f34395b;

        /* renamed from: c  reason: collision with root package name */
        TextView f34396c;

        /* renamed from: d  reason: collision with root package name */
        TextView f34397d;

        /* renamed from: e  reason: collision with root package name */
        TextView f34398e;

        /* renamed from: f  reason: collision with root package name */
        RelativeLayout f34399f;

        /* renamed from: g  reason: collision with root package name */
        RelativeLayout f34400g;

        w() {
        }
    }

    private void A0() {
        com.join.mgps.customview.o oVar = this.C1;
        if (oVar == null || !oVar.isShowing()) {
            return;
        }
        this.C1.dismiss();
    }

    private void A1() {
    }

    private void B0() {
        com.join.mgps.customview.o oVar = this.J1;
        if (oVar == null || !oVar.isShowing()) {
            return;
        }
        this.J1.dismiss();
    }

    private void B1() {
        if (this.M.getGame_prompt() == null || this.M.getGame_prompt().size() == 0) {
            return;
        }
        this.D1.add(new MGGameDetailAdapter.y0(MGGameDetailAdapter.ViewType.MESSAGE, new MGGameDetailAdapter.y0.p(this.M.getGame_prompt())));
        C1();
    }

    private void C0() {
        com.join.mgps.customview.o oVar = this.K1;
        if (oVar == null || !oVar.isShowing()) {
            return;
        }
        this.K1.dismiss();
    }

    private void C1() {
        this.D1.add(new MGGameDetailAdapter.y0(MGGameDetailAdapter.ViewType.NULLITEM, null));
    }

    private void D1(int i4) {
        MGGameDetailAdapter.ViewType viewType = MGGameDetailAdapter.ViewType.NULLITEM;
        this.D1.add(new MGGameDetailAdapter.y0(viewType, i4 + ""));
    }

    private void F1() {
        DetailResultBeanV3 detailResultBeanV3 = this.M;
        if (detailResultBeanV3 == null || detailResultBeanV3.getRecommend_game() == null || this.M.getRecommend_game().size() < 1) {
            return;
        }
        this.D1.add(new MGGameDetailAdapter.y0(MGGameDetailAdapter.ViewType.GAME_ITEM_TOP, new MGGameDetailAdapter.y0.o(null, "相关推荐")));
    }

    private void G1() {
        if (this.M.getRecommend_game_switch() == 0) {
            return;
        }
        this.D1.add(new MGGameDetailAdapter.y0(MGGameDetailAdapter.ViewType.RECOMMEND, new MGGameDetailAdapter.y0.q(this.M.getRecommend_game_switch(), this.M.getRecommend_game())));
        C1();
    }

    private void H1() {
        DetailResultBeanV3 detailResultBeanV3;
        if (this.M.getGame_server_switch() == 0 || (detailResultBeanV3 = this.M) == null || detailResultBeanV3.getGame_server_state() == null || this.M.getGame_server_state().size() < 1) {
            return;
        }
        List<ServiceState> game_server_state = this.M.getGame_server_state();
        for (int i4 = 0; i4 < game_server_state.size(); i4++) {
            ServiceState serviceState = game_server_state.get(i4);
            this.D1.add(new MGGameDetailAdapter.y0(MGGameDetailAdapter.ViewType.SERVICEITEM, new MGGameDetailAdapter.y0.l(serviceState.getTitle(), serviceState.getType(), serviceState.getAdd_time())));
        }
        C1();
    }

    private void I1() {
        DetailResultBeanV3 detailResultBeanV3;
        if (this.M.getGame_server_switch() == 0 || (detailResultBeanV3 = this.M) == null || detailResultBeanV3.getGame_server_state() == null || this.M.getGame_server_state().size() < 1) {
            return;
        }
        DetialIntentBean detialIntentBean = new DetialIntentBean();
        detialIntentBean.setGameId(this.M.getCrc_sign_id());
        detialIntentBean.setIntentType(3);
        this.D1.add(new MGGameDetailAdapter.y0(MGGameDetailAdapter.ViewType.GAME_ITEM_TOP, new MGGameDetailAdapter.y0.o(detialIntentBean, "开服合服")));
    }

    private void J1() {
        List<GameDetialStrategyItem> posts;
        DetailResultBeanV3 detailResultBeanV3 = this.M;
        if (detailResultBeanV3 == null || detailResultBeanV3.getGame_strategy() == null || (posts = this.M.getGame_strategy().getPosts()) == null || posts.size() < 1) {
            return;
        }
        for (int i4 = 0; i4 < posts.size(); i4++) {
            GameDetialStrategyItem gameDetialStrategyItem = posts.get(i4);
            if (i4 == 0 && gameDetialStrategyItem.getPic_list().length > 0) {
                if (gameDetialStrategyItem.getPic_list().length == 1) {
                    RecommendInfomationBean recommendInfomationBean = new RecommendInfomationBean();
                    recommendInfomationBean.setPic_list(gameDetialStrategyItem.getPic_list());
                    recommendInfomationBean.setPost_id(gameDetialStrategyItem.getId());
                    recommendInfomationBean.setPraise(gameDetialStrategyItem.getPraise());
                    recommendInfomationBean.setCommit(gameDetialStrategyItem.getCommit());
                    recommendInfomationBean.setTimes(gameDetialStrategyItem.getAdd_time() / 1000);
                    recommendInfomationBean.setTitle(gameDetialStrategyItem.getSubject());
                    recommendInfomationBean.setView(gameDetialStrategyItem.getView());
                    GameDetialBookTag tag_name = gameDetialStrategyItem.getTag_name();
                    recommendInfomationBean.setType(tag_name.getTitle());
                    recommendInfomationBean.setType_color(tag_name.getColor());
                    this.D1.add(new MGGameDetailAdapter.y0(MGGameDetailAdapter.ViewType.INFORMATIONTOP, new MGGameDetailAdapter.y0.k(false, 1, recommendInfomationBean)));
                } else {
                    this.D1.add(new MGGameDetailAdapter.y0(MGGameDetailAdapter.ViewType.STRAYTEGYITEM_NOIMAGE, new MGGameDetailAdapter.y0.m(gameDetialStrategyItem, true)));
                    this.D1.add(new MGGameDetailAdapter.y0(MGGameDetailAdapter.ViewType.STRAYTEGYITEM_IMAGE, new MGGameDetailAdapter.y0.m(gameDetialStrategyItem)));
                }
            } else {
                this.D1.add(new MGGameDetailAdapter.y0(MGGameDetailAdapter.ViewType.STRAYTEGYITEM_NOIMAGE, new MGGameDetailAdapter.y0.m(gameDetialStrategyItem)));
            }
        }
        C1();
    }

    private void K1() {
        List<GameDetialStrategyTag> tags;
        DetailResultBeanV3 detailResultBeanV3 = this.M;
        if (detailResultBeanV3 == null || detailResultBeanV3.getGame_strategy() == null || (tags = this.M.getGame_strategy().getTags()) == null || tags.size() < 1) {
            return;
        }
        this.D1.add(new MGGameDetailAdapter.y0(MGGameDetailAdapter.ViewType.STRAYTEGYTABLE, new MGGameDetailAdapter.y0.n(tags)));
    }

    private void L1() {
        DetailResultBeanV3 detailResultBeanV3 = this.M;
        if (detailResultBeanV3 == null || detailResultBeanV3.getGame_strategy() == null) {
            return;
        }
        DetialIntentBean detialIntentBean = new DetialIntentBean();
        detialIntentBean.setGameId(this.M.getCrc_sign_id());
        detialIntentBean.setIntentType(1);
        if (this.M.getGame_strategy() != null) {
            detialIntentBean.setStrategyTags(this.M.getGame_strategy().getTags());
        }
        detialIntentBean.setStartegyTab(0);
        this.D1.add(new MGGameDetailAdapter.y0(MGGameDetailAdapter.ViewType.GAME_ITEM_TOP, new MGGameDetailAdapter.y0.o(detialIntentBean, GameMainActivity4.H2)));
    }

    private void M1() {
        this.D1.add(new MGGameDetailAdapter.y0(MGGameDetailAdapter.ViewType.TITLE, new MGGameDetailAdapter.y0.s(this.M.getIco_remote(), this.M.getGame_name(), this.M.getTag_info(), this.M.getDown_count(), this.M.getDown_count_manual(), this.M.getCompany_name(), this.M.getSize(), this.M.getGame_follow(), this.M.getGame_book(), this.M.getFollow_background_img(), this.M.getGame_book_tag(), this.M.getBespeak_switch())));
    }

    private void N1() {
        this.D1.add(new MGGameDetailAdapter.y0(MGGameDetailAdapter.ViewType.UPDATE_RECORD, new MGGameDetailAdapter.y0.t(this.M.getGame_upgrade_info_switch(), this.M.getGame_upgrade_info())));
    }

    private void O1() {
        this.D1.add(new MGGameDetailAdapter.y0(MGGameDetailAdapter.ViewType.VIEWPAGE, new MGGameDetailAdapter.y0.u(this.M.getVedio_cover_pic(), this.M.getPic_info(), this.M.getPic_position(), this.M.getVedio_url())));
    }

    private void P1() {
        DetailResultBeanV3 detailResultBeanV3 = this.M;
        if (detailResultBeanV3 == null || detailResultBeanV3.getGame_coupon_list() == null || this.M.getGame_coupon_list().size() < 1) {
            return;
        }
        for (int i4 = 0; i4 < this.M.getGame_coupon_list().size(); i4++) {
            this.D1.add(new MGGameDetailAdapter.y0(MGGameDetailAdapter.ViewType.VOUCHER, new MGGameDetailAdapter.y0.v(true, this.M.getGame_coupon_list().get(i4))));
        }
    }

    private void Q1() {
        this.D1.add(new MGGameDetailAdapter.y0(MGGameDetailAdapter.ViewType.WEB, new MGGameDetailAdapter.y0.w(this.M.getEdit_recommend(), this.M.getGame_describe_second(), this.M.getLineCount())));
    }

    private void S1() {
        showLoding();
        H0();
    }

    private void j1() {
        DetailResultBeanV3 detailResultBeanV3 = this.M;
        if (detailResultBeanV3 == null || detailResultBeanV3.getBanner() == null || this.M.getBanner().size() < 1) {
            return;
        }
        this.D1.add(new MGGameDetailAdapter.y0(MGGameDetailAdapter.ViewType.DETIAL_ADGROUP, new MGGameDetailAdapter.y0.d(this.M.getBanner())));
    }

    private void k1() {
        DetailResultBeanV3 detailResultBeanV3 = this.M;
        if (detailResultBeanV3 == null || detailResultBeanV3.getComment_switch() != 1) {
            return;
        }
        this.M.setSelf_comment(this.G1);
        this.M.setGame_comment_count(this.H1);
        this.M.setGame_score(this.I1);
        for (int i4 = 0; this.M.getCommitDataBeanList() != null && i4 < this.M.getCommitDataBeanList().size(); i4++) {
            this.D1.add(new MGGameDetailAdapter.y0(MGGameDetailAdapter.ViewType.COMMIT, new MGGameDetailAdapter.y0.a(this.M.getComment_switch() == 1, this.M.getCommitDataBeanList().get(i4), true)));
        }
    }

    private void l1() {
        DetailResultBeanV3 detailResultBeanV3 = this.M;
        if (detailResultBeanV3 != null) {
            if (detailResultBeanV3.getComment_switch() != 1) {
                return;
            }
            this.D1.add(new MGGameDetailAdapter.y0(MGGameDetailAdapter.ViewType.COMMIT_FOOTER, new MGGameDetailAdapter.y0.b(this.M.getComment_switch() == 1, this.M.getComment_count(), this.M.getCrc_sign_id())));
        }
    }

    private void m1() {
        this.D1.add(new MGGameDetailAdapter.y0(MGGameDetailAdapter.ViewType.COMMIT_HEADER, new MGGameDetailAdapter.y0.c(this.M.getRecommend_information_switch(), this.M.getRecommend_game_switch(), this.M.getComment_switch(), this.M.getComment_count(), this.M.getCrc_sign_id())));
    }

    private void n1(CommentBaseBean commentBaseBean) {
    }

    private void q1() {
        if (this.M == null) {
            return;
        }
        this.D1.add(new MGGameDetailAdapter.y0(MGGameDetailAdapter.ViewType.GAME_ITEM_TOP, new MGGameDetailAdapter.y0.o(null, "游戏详情")));
    }

    private void r1() {
        if (this.M.getGame_service_switch() == 0) {
            return;
        }
        this.D1.add(new MGGameDetailAdapter.y0(MGGameDetailAdapter.ViewType.GAME_FAST_ENTRY, new MGGameDetailAdapter.y0.e(this.M.getForum_id(), this.M.getServer_qq(), this.M.getPlayer_qq(), this.M.getFast_entry_no4(), this.M.getForum_count())));
    }

    private void s1() {
        DetailResultBeanV3 detailResultBeanV3 = this.M;
        if (detailResultBeanV3 == null || detailResultBeanV3.getRecommend_adinfo_switch() == 0 || this.M.getRecommend_ad_info() == null || this.M.getRecommend_ad_info().size() == 0) {
            return;
        }
        this.D1.add(new MGGameDetailAdapter.y0(MGGameDetailAdapter.ViewType.GAMEAD, new MGGameDetailAdapter.y0.f(this.M.getRecommend_adinfo_switch(), this.M.getRecommend_ad_info())));
    }

    private void t1() {
    }

    private void u1() {
        MGGameDetailAdapter.y0 y0Var;
        DetailResultBeanV3 detailResultBeanV3 = this.M;
        if (detailResultBeanV3 == null) {
            return;
        }
        List<GiftPackageDataInfoBean> game_gift_package = detailResultBeanV3.getGame_gift_package();
        List<ServiceState> game_server_state = this.M.getGame_server_state();
        if ((game_gift_package == null || game_gift_package.size() == 0) && (game_server_state == null || game_server_state.size() == 0)) {
            return;
        }
        if (this.M.getGame_server_switch() == 1) {
            y0Var = new MGGameDetailAdapter.y0(MGGameDetailAdapter.ViewType.GIFT_AND_SERVICE, new MGGameDetailAdapter.y0.j(this.M.getGame_gift_package(), this.M.getGame_server_state()));
        } else {
            y0Var = new MGGameDetailAdapter.y0(MGGameDetailAdapter.ViewType.GIFT_AND_SERVICE, new MGGameDetailAdapter.y0.j(this.M.getGame_gift_package(), null));
        }
        this.D1.add(y0Var);
    }

    private void v1() {
        DetailResultBeanV3 detailResultBeanV3 = this.M;
        if (detailResultBeanV3 == null || detailResultBeanV3.getGame_gift_package() == null || this.M.getGame_gift_package().size() < 1) {
            return;
        }
        this.D1.add(new MGGameDetailAdapter.y0(MGGameDetailAdapter.ViewType.GAME_GIFTS_BOTTOM, new MGGameDetailAdapter.y0.g(true)));
    }

    private void w1() {
        DetailResultBeanV3 detailResultBeanV3 = this.M;
        if (detailResultBeanV3 == null || detailResultBeanV3.getGame_gift_package() == null || this.M.getGame_gift_package().size() < 1) {
            return;
        }
        for (int i4 = 0; i4 < this.M.getGame_gift_package().size(); i4++) {
            this.D1.add(new MGGameDetailAdapter.y0(MGGameDetailAdapter.ViewType.GAME_GIFTS_ITEM, new MGGameDetailAdapter.y0.h(true, this.M.getGame_gift_package().get(i4))));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean x0(String str) {
        if (com.join.mgps.Util.g2.h(str)) {
            com.join.mgps.Util.l2.a(this.K).b(this.K.getString(R.string.unknow_gift_type));
            return false;
        }
        com.wufan.user.service.protobuf.n0 accountData = AccountUtil_.getInstance_(this.K).getAccountData();
        if (str.equals("6")) {
            if (!com.join.mgps.Util.b.piv(accountData)) {
                a2();
                return false;
            }
        } else if (str.equals("7") && accountData.j1() <= 0) {
            Z1();
            return false;
        }
        return true;
    }

    private void x1() {
        DetailResultBeanV3 detailResultBeanV3 = this.M;
        if (detailResultBeanV3 == null || detailResultBeanV3.getGame_gift_package() == null || this.M.getGame_gift_package().size() < 1) {
            return;
        }
        DetialIntentBean detialIntentBean = new DetialIntentBean();
        detialIntentBean.setGameId(this.M.getCrc_sign_id());
        detialIntentBean.setIntentType(4);
        this.D1.add(new MGGameDetailAdapter.y0(MGGameDetailAdapter.ViewType.GAME_ITEM_TOP, new MGGameDetailAdapter.y0.o(detialIntentBean, "福利礼包")));
    }

    private void y1() {
        DetailResultBeanV3 detailResultBeanV3 = this.M;
        if (detailResultBeanV3 == null || detailResultBeanV3.getRecommend_information_switch() != 1) {
            return;
        }
        List<RecommendInfomationBean> recommend_information = this.M.getRecommend_information();
        if (this.M == null || recommend_information == null || recommend_information.size() < 2) {
            return;
        }
        int i4 = 0;
        while (i4 < recommend_information.size()) {
            this.D1.add(new MGGameDetailAdapter.y0(MGGameDetailAdapter.ViewType.INFORMATION, new MGGameDetailAdapter.y0.k(i4 != 0, this.M.getRecommend_information_switch(), recommend_information.get(i4))));
            i4++;
        }
        C1();
    }

    private void z1() {
        DetailResultBeanV3 detailResultBeanV3 = this.M;
        if (detailResultBeanV3 == null || detailResultBeanV3.getRecommend_information() == null || this.M.getRecommend_information().size() < 1 || this.M.getRecommend_information_switch() != 1) {
            return;
        }
        DetialIntentBean detialIntentBean = new DetialIntentBean();
        detialIntentBean.setGameId(this.M.getCrc_sign_id());
        detialIntentBean.setIntentType(2);
        this.D1.add(new MGGameDetailAdapter.y0(MGGameDetailAdapter.ViewType.GAME_ITEM_TOP, new MGGameDetailAdapter.y0.o(detialIntentBean, "最新资讯")));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void D0() {
        IntentUtil.getInstance().goMyGameManagerActivity(this);
        this.f34359u.p();
        this.f34363x.setVisibility(8);
        this.J.isNewFinishedGame().g(Boolean.FALSE);
        this.f34360v.setVisibility(8);
    }

    void E0() {
        if (!com.join.android.app.common.utils.j.j(this) || IntentUtil.getInstance().goLoginInteractive(this.K) || this.M.getGame_follow() == 1) {
            return;
        }
        v0(2);
    }

    public void E1(float f5) {
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.alpha = f5;
        if (f5 == 1.0f) {
            getWindow().clearFlags(2);
        } else {
            getWindow().addFlags(2);
        }
        getWindow().setAttributes(attributes);
    }

    void F0() {
        boolean booleanValue = this.J.noFavoriteTips().d().booleanValue();
        if (IntentUtil.getInstance().goLoginInteractive(this.K)) {
            return;
        }
        if (!booleanValue) {
            if (this.F1 == null) {
                com.join.mgps.customview.o oVar = new com.join.mgps.customview.o(this.K, R.style.MyDialog);
                this.F1 = oVar;
                oVar.setContentView(R.layout.favorite_dialog);
                this.F1.setCanceledOnTouchOutside(true);
            }
            ((CheckBox) this.F1.findViewById(R.id.opt)).setOnCheckedChangeListener(new c());
            ((Button) this.F1.findViewById(R.id.ok)).setOnClickListener(new d());
            com.join.mgps.customview.o oVar2 = this.F1;
            if (oVar2 == null || oVar2.isShowing()) {
                return;
            }
            this.F1.show();
            return;
        }
        E0();
    }

    public RequestCommentpraiseArgs G0(String str, int i4, int i5) {
        String str2;
        int i6;
        String str3 = Build.MODEL;
        com.wufan.user.service.protobuf.n0 accountData = AccountUtil_.getInstance_(this.K).getAccountData();
        this.U = accountData;
        if (accountData != null) {
            i6 = accountData.getUid();
            str2 = this.U.getToken();
        } else {
            str2 = "";
            i6 = 0;
        }
        return RequestBeanUtil.getInstance(this.K).getPraiseComment(this.O1, this.J.commentToken().d(), str3, str, str2, i6, i4, i5);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void H0() {
        if (com.join.android.app.common.utils.j.j(this.K)) {
            try {
                com.wufan.user.service.protobuf.n0 accountData = AccountUtil_.getInstance_(getApplicationContext()).getAccountData();
                this.U = accountData;
                ResultMainBean<List<DetailResultBeanV3>> T = this.F.T(RequestBeanUtil.getInstance(getApplicationContext()).getAppDetialBean(this.N.getCrc_link_type_val(), accountData != null ? accountData.getUid() : 0, this.I));
                if (T != null && T.getFlag() != 0) {
                    List<DetailResultBeanV3> data = T.getMessages().getData();
                    if (data != null && data.size() > 0) {
                        DetailResultBeanV3 detailResultBeanV3 = data.get(0);
                        if (detailResultBeanV3 != null) {
                            W1(detailResultBeanV3);
                            p1(detailResultBeanV3);
                        } else if (this.f34353p0) {
                        } else {
                            showLodingFailed();
                        }
                    } else if (this.f34353p0) {
                    } else {
                        showLodingFailed();
                    }
                } else if (this.f34353p0) {
                } else {
                    showLodingFailed();
                }
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        } else if (this.f34353p0) {
        } else {
            showLodingFailed();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void I0() {
        if (com.join.android.app.common.utils.j.j(this.K)) {
            com.join.mgps.rpc.impl.e m4 = com.join.mgps.rpc.impl.e.m();
            new CommentAllListBean();
            try {
                CommentResponse<CommentAllListBean> g4 = m4.g(RequestBeanUtil.getInstance(this.K).getGamedetialCommentRequest(this.O1, this.J.commentToken().d(), this.U.getUid() + ""));
                if (g4 != null) {
                    CommentAllListBean data_info = g4.getData_info();
                    if (data_info != null) {
                        this.G1 = data_info.getSelf_comment();
                        this.H1 = data_info.getGame_comment_count();
                        this.I1 = data_info.getGame_score();
                    }
                    if (data_info != null && data_info.getHot_comment() != null && data_info.getHot_comment().size() >= 0) {
                        List<CommentAllListBean.HotCommentBean> hot_comment = data_info.getHot_comment();
                        ArrayList arrayList = new ArrayList();
                        for (CommentAllListBean.HotCommentBean hotCommentBean : hot_comment) {
                            arrayList.add(hotCommentBean);
                        }
                        X1(arrayList);
                        return;
                    }
                    X1(new ArrayList());
                    return;
                }
                X1(new ArrayList());
            } catch (Exception e5) {
                e5.printStackTrace();
                X1(new ArrayList());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void J0() {
        try {
            if (com.join.android.app.common.utils.j.j(this.K)) {
                if (IntentUtil.getInstance().goLoginInteractive(this.K)) {
                    return;
                }
                this.L1 = "";
                com.wufan.user.service.protobuf.n0 accountData = AccountUtil_.getInstance_(this.K).getAccountData();
                LinkedMultiValueMap linkedMultiValueMap = new LinkedMultiValueMap();
                linkedMultiValueMap.add("uid", Integer.valueOf(accountData.getUid()));
                linkedMultiValueMap.add("token", accountData.getToken());
                linkedMultiValueMap.add("current_game_id", this.O1);
                int i4 = this.f34337d2;
                this.f34337d2 = i4 + 1;
                linkedMultiValueMap.add("page", Integer.valueOf(i4));
                linkedMultiValueMap.add("device_id", this.L1);
                linkedMultiValueMap.add("version", this.M1);
                GameFromPopoWinBean O = this.f34331a2.O(linkedMultiValueMap);
                if (O != null && O.getError() == 0 && O.getData() != null) {
                    h2();
                    if (this.f34337d2 == 2) {
                        y0();
                    }
                    s0(O);
                    return;
                } else if (O != null && O.getError() == 701) {
                    IntentUtil.getInstance().goMyAccountLoginActivity(this.K);
                    showToast("Token已失效，请重新登录");
                    IntentUtil.getInstance().goLogin(this.K);
                    Q0();
                    return;
                } else {
                    e2();
                    return;
                }
            }
            showToast("网络出错，请稍后重试");
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void K0(GiftPackageDataInfoBean giftPackageDataInfoBean) {
        if (com.join.android.app.common.utils.j.j(this.K)) {
            try {
                try {
                    GiftPackageOperationBean f02 = this.F.f0(RequestBeanUtil.getInstance(getApplicationContext()).getGiftPackageOperationRequestBean(this.U.getUid(), giftPackageDataInfoBean.getGift_package_id(), this.N.getCrc_link_type_val()));
                    if (f02 != null) {
                        if (f02.getFlag().equals("0")) {
                            String error_info = f02.getError_info();
                            if (error_info == null || !f02.getCode().equals("1001")) {
                                return;
                            }
                            showToast(error_info);
                            return;
                        }
                        List<GiftPackageDataOperationBean> data = f02.getMessages().getData();
                        if (data == null || data.size() <= 0) {
                            return;
                        }
                        GiftPackageDataOperationBean giftPackageDataOperationBean = data.get(0);
                        List<GiftPackageDataInfoBean> game_gift_package = this.M.getGame_gift_package();
                        for (int i4 = 0; i4 < game_gift_package.size(); i4++) {
                            GiftPackageDataInfoBean giftPackageDataInfoBean2 = game_gift_package.get(i4);
                            if (giftPackageDataInfoBean.getGift_package_id() == giftPackageDataInfoBean2.getGift_package_id()) {
                                giftPackageDataInfoBean2.setGift_package_status(1);
                                giftPackageDataInfoBean2.setGift_package_overdue(giftPackageDataOperationBean.getGift_info().getGift_package_overdue());
                                giftPackageDataInfoBean2.setGift_package_code(giftPackageDataOperationBean.getGift_info().getGift_package_code());
                            }
                        }
                        this.M.setGame_gift_package(game_gift_package);
                        U1(giftPackageDataOperationBean);
                    }
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
            } finally {
                showToast("领取失败");
            }
        }
    }

    public CommonRequestBean L0() {
        com.wufan.user.service.protobuf.n0 accountData = AccountUtil_.getInstance_(getApplicationContext()).getAccountData();
        this.U = accountData;
        if (accountData != null) {
            this.V = accountData.getUid();
        }
        return RequestBeanUtil.getInstance(getApplicationContext()).getGameCommentListRequestBean(1, 5, this.V, this.N.getCrc_link_type_val(), new int[]{1});
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void M0() {
        if (com.join.android.app.common.utils.j.j(this.K)) {
            try {
                CommentResponse<CommentTokenBean> c5 = this.A1.c(RequestBeanUtil.getInstance(this.K).getTokenRequestBean(AccountUtil_.getInstance_(this.K).getUid(), ""));
                if (c5 == null || c5.getCode() != 0 || c5.getData_info() == null || TextUtils.isEmpty(c5.getData_info().getToken())) {
                    return;
                }
                this.J.commentToken().g(AESUtils.f(c5.getData_info().getToken() + "|" + c5.getData_info().getTimes()));
                this.J.lastCheckInTime().g(Long.valueOf(System.currentTimeMillis()));
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void N0(GameVoucherBean gameVoucherBean) {
        if (com.join.android.app.common.utils.j.j(this.K)) {
            try {
                LinkedMultiValueMap linkedMultiValueMap = new LinkedMultiValueMap();
                com.wufan.user.service.protobuf.n0 accountData = AccountUtil_.getInstance_(getApplicationContext()).getAccountData();
                linkedMultiValueMap.add("uid", accountData.getUid() + "");
                linkedMultiValueMap.add("token", accountData.getToken());
                linkedMultiValueMap.add("coupon_id", gameVoucherBean.getGame_coupon_id() + "");
                PapayVoucherResultMain<AccountGetVoucherResult> a5 = this.G.a(linkedMultiValueMap);
                if (a5 != null && a5.getError() == 0 && a5.getData() != null) {
                    showToast(getString(R.string.voucher_get_success));
                    for (GameVoucherBean gameVoucherBean2 : this.M.getGame_coupon_list()) {
                        String game_coupon_id = gameVoucherBean2.getGame_coupon_id();
                        if (game_coupon_id.equals(a5.getData().getCoupon_code().getCoupon_id() + "")) {
                            gameVoucherBean2.setGame_coupon_status(2);
                            f1();
                        }
                    }
                } else {
                    showToast(getString(R.string.voucher_get_fail));
                }
            } catch (Exception e5) {
                e5.printStackTrace();
                showToast(getString(R.string.voucher_get_fail));
            }
        } else {
            showToast(getString(R.string.voucher_get_fail));
        }
        P0();
    }

    void O0() {
        ExtBean extBean = this.I;
        if (extBean == null || TextUtils.isEmpty(extBean.getFrom()) || !this.I.getFrom().equals("updateFromMarket")) {
            return;
        }
        IntentUtil.getInstance().goMGMainActivity2Front(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void P0() {
        com.join.mgps.dialog.d1 d1Var = this.Z;
        if (d1Var == null || !d1Var.isShowing()) {
            return;
        }
        this.Z.dismiss();
        this.Z = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void Q0() {
        PopupWindow popupWindow = this.P1;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void R0() {
        View inflate = LayoutInflater.from(this.K).inflate(R.layout.popo_item, (ViewGroup) null);
        E1(0.4f);
        PopupWindow popupWindow = new PopupWindow(inflate, -1, -1, true);
        this.P1 = popupWindow;
        popupWindow.setTouchable(true);
        this.P1.setOutsideTouchable(true);
        this.P1.setFocusable(true);
        this.P1.setBackgroundDrawable(new ColorDrawable());
        this.P1.setSoftInputMode(16);
        this.P1.setOnDismissListener(new g());
        XListView2 xListView2 = (XListView2) inflate.findViewById(R.id.listview);
        this.X1 = xListView2;
        xListView2.setPullRefreshEnable(new h());
        this.X1.setPullLoadEnable(new i());
        this.V1 = (TextView) inflate.findViewById(R.id.tv_show_tips);
        this.S1 = (LinearLayout) inflate.findViewById(R.id.ll_our);
        this.Q1 = (LinearLayout) inflate.findViewById(R.id.ll_show_finish);
        this.R1 = (LinearLayout) inflate.findViewById(R.id.ll_dismiss);
        this.T1 = (EditText) inflate.findViewById(R.id.game_ed);
        this.U1 = (TextView) inflate.findViewById(R.id.tv_finish);
        this.W1 = (LinearLayout) inflate.findViewById(R.id.ll_build);
        this.R1.setOnClickListener(new j());
        this.W1.setOnClickListener(new l());
        this.U1.setOnClickListener(new m());
        v vVar = new v();
        this.Y1 = vVar;
        this.X1.setAdapter((ListAdapter) vVar);
        this.P1.showAtLocation(LayoutInflater.from(this.K).inflate(R.layout.gamedetial_modle_three_activity, (ViewGroup) null), 81, 0, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void R1() {
        ShareBean shareBean = new ShareBean();
        String share_url = this.M.getShare_url();
        shareBean.setqZoneShareUrl(share_url);
        shareBean.setQqUrl(share_url);
        shareBean.setWechatFriendUrl(share_url);
        shareBean.setWechatShareUrl(share_url);
        shareBean.setWeiboShareUrl(share_url);
        shareBean.setTitle(this.M.getGame_name());
        shareBean.setText(this.M.getInfo());
        shareBean.setImageUrl(this.M.getIco_remote());
        shareBean.setFrom(2);
        shareBean.setGameId(this.M.getCrc_sign_id());
        com.join.mgps.Util.s.r(this.K, shareBean);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void S0() {
        DetailResultBeanV3 detailResultBeanV3;
        StringBuilder sb = new StringBuilder();
        sb.append("method instalButtomButn() called.status=");
        sb.append(this.L.getStatus());
        int game_book = this.M.getGame_book();
        if (this.M.getBespeak_switch() == 1 && game_book != 1 && this.M.getDown_status() == 2) {
            if (IntentUtil.getInstance().goLoginInteractive(this.K) || game_book == 1) {
                return;
            }
            v0(4);
            return;
        }
        DownloadTask downloadTask = this.L;
        int status = downloadTask != null ? downloadTask.getStatus() : 0;
        if (this.L != null && (detailResultBeanV3 = this.M) != null && UtilsMy.w0(detailResultBeanV3.getPay_tag_info(), this.M.getCrc_sign_id()) > 0) {
            status = 43;
        }
        DownloadTask downloadTask2 = this.L;
        if (downloadTask2 == null) {
            return;
        }
        if (downloadTask2 != null && (status == 2 || status == 10)) {
            com.php25.PDownload.d.i(downloadTask2);
        } else if (status == 12 || status == 27) {
            return;
        } else {
            if (status == 13) {
                com.php25.PDownload.d.l(this.K, downloadTask2);
                return;
            } else if (status == 5) {
                UtilsMy.W3(this.K, downloadTask2, "2");
            } else if (status == 42) {
                downloadTask2.setVer(this.M.getVer());
                this.L.setVer_name(this.M.getVer_name());
                this.L.setUrl(this.M.getDown_url_remote());
                this.L.setCfg_ver(this.M.getCfg_ver());
                this.L.setCfg_ver_name(this.M.getCfg_ver_name());
                this.L.setCfg_down_url(this.M.getCfg_down_url());
                this.L.setKeyword(Where.detail.name());
                UtilsMy.r4(this.K, this.L);
            } else if (status == 9) {
                if (!com.join.android.app.common.utils.j.j(this.K)) {
                    com.join.mgps.Util.l2.a(this.K).b("无网络连接");
                    return;
                }
                int downloadType = this.L.getDownloadType();
                if (downloadType == 0 || downloadType == 1) {
                    if (this.L.getCrc_link_type_val() == null || this.L.getCrc_link_type_val().equals("")) {
                        return;
                    }
                    t0(this.L);
                    if (UtilsMy.o1(this.K, this.L)) {
                        return;
                    }
                    if (this.M.getDown_status() == 5) {
                        UtilsMy.l1(this, this.L);
                        return;
                    }
                    com.php25.PDownload.d.b(this.L);
                    this.L.setVer(this.M.getVer());
                    this.L.setVer_name(this.M.getVer_name());
                    this.L.setUrl(this.M.getDown_url_remote());
                    this.L.setCfg_ver(this.M.getCfg_ver());
                    this.L.setCfg_ver_name(this.M.getCfg_ver_name());
                    this.L.setCfg_down_url(this.M.getCfg_down_url());
                    this.L.setKeyword(Where.detail.name());
                    com.php25.PDownload.d.c(this.L, this.K);
                    V0();
                } else if (downloadType == 2) {
                    UtilsMy.u4(this.L);
                }
            } else if (11 == status) {
                UtilsMy.a4(downloadTask2, this.K);
            } else if (43 == status) {
                downloadTask2.setKeyword(Where.detail.name());
                t0(this.L);
                DetailResultBeanV3 detailResultBeanV32 = this.M;
                if (detailResultBeanV32 != null) {
                    if (UtilsMy.y0(detailResultBeanV32.getPay_tag_info(), this.M.getCrc_sign_id()) > 0) {
                        UtilsMy.d4(this.K, this.M.getCrc_sign_id());
                    } else if (!UtilsMy.o1(this.K, this.L)) {
                        if (this.M.getDown_status() == 5) {
                            UtilsMy.l1(this.K, this.L);
                        } else {
                            UtilsMy.A1(this.L, this.M);
                            if (!UtilsMy.o1(this.K, this.L)) {
                                if (this.M.getDown_status() == 5) {
                                    UtilsMy.l1(this.K, this.L);
                                } else {
                                    UtilsMy.R0(this.K, this.L, this.M.getTp_down_url(), this.M.getOther_down_switch(), this.M.getCdn_down_switch());
                                }
                            }
                            V0();
                        }
                    }
                }
                this.f34359u.setTextArray(new String[]{"", "size", "", "size"});
                this.f34359u.setIsStop(false);
                this.f34359u.o();
            } else {
                downloadTask2.setKeyword(Where.detail.name());
                t0(this.L);
                DetailResultBeanV3 detailResultBeanV33 = this.M;
                if (detailResultBeanV33 != null) {
                    if (UtilsMy.y0(detailResultBeanV33.getPay_tag_info(), this.M.getCrc_sign_id()) > 0) {
                        UtilsMy.d4(this.K, this.M.getCrc_sign_id());
                    } else {
                        UtilsMy.A1(this.L, this.M);
                        if (!UtilsMy.o1(this.K, this.L)) {
                            if (this.M.getDown_status() == 5) {
                                UtilsMy.l1(this.K, this.L);
                            } else {
                                UtilsMy.R0(this.K, this.L, this.M.getTp_down_url(), this.M.getOther_down_switch(), this.M.getCdn_down_switch());
                            }
                        }
                        V0();
                    }
                }
                this.f34359u.setTextArray(new String[]{"", "size", "", "size"});
                this.f34359u.setIsStop(false);
                this.f34359u.o();
            }
        }
        g2();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void T0() {
        ((LoginSplashActivity_.IntentBuilder_) LoginSplashActivity_.intent(this.K).flags(268435456)).start();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:27:0x013a  */
    @org.androidannotations.annotations.UiThread
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void T1(com.join.mgps.dto.GiftPackageDataInfoBean r11) {
        /*
            Method dump skipped, instructions count: 347
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.mgps.activity.MGGameDetailActivity.T1(com.join.mgps.dto.GiftPackageDataInfoBean):void");
    }

    boolean U0(DetailResultBeanV3 detailResultBeanV3) {
        return (detailResultBeanV3 == null || detailResultBeanV3.getPay_tag_info() == null || detailResultBeanV3.getPay_tag_info().getPay_game_amount() <= 0) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void U1(GiftPackageDataOperationBean giftPackageDataOperationBean) {
        Dialog dialog;
        Dialog dialog2 = this.X;
        if (dialog2 != null && dialog2.isShowing()) {
            this.X.dismiss();
            this.X = null;
        }
        com.join.mgps.customview.o oVar = new com.join.mgps.customview.o(this.K, R.style.MyDialog);
        this.X = oVar;
        oVar.setContentView(R.layout.save_code_dialog);
        Button button = (Button) this.X.findViewById(R.id.dialog_button_cancle);
        Button button2 = (Button) this.X.findViewById(R.id.dialog_button_ok);
        TextView textView = (TextView) this.X.findViewById(R.id.moneyText);
        ((TextView) this.X.findViewById(R.id.tip_title)).setText("领号成功");
        ((TextView) this.X.findViewById(R.id.saveCodeContent)).setText(giftPackageDataOperationBean.getGift_info().getGift_package_code());
        button2.setText("关闭");
        button.setText("下载游戏");
        ((TextView) this.X.findViewById(R.id.saveCodeTv)).setOnClickListener(new q(giftPackageDataOperationBean));
        button2.setOnClickListener(new r());
        if (this.M.getDown_status() == 2) {
            button.setEnabled(false);
            button.setText("即将开放");
        }
        DownloadTask downloadTask = this.L;
        int status = downloadTask != null ? downloadTask.getStatus() : 0;
        if (giftPackageDataOperationBean.getGame_info() != null && UtilsMy.w0(giftPackageDataOperationBean.getGame_info().getPay_tag_info(), giftPackageDataOperationBean.getGame_info().getCrc_sign_id()) > 0) {
            status = 43;
        }
        if (status != 0) {
            if (status == 5) {
                button.setText("启动游戏");
            } else if (status != 9 && status != 43) {
                button.setText("下载中..");
            }
            button.setOnClickListener(new s());
            e1();
            dialog = this.X;
            if (dialog != null || dialog.isShowing()) {
            }
            this.X.show();
            return;
        }
        button.setText("下载游戏");
        if (giftPackageDataOperationBean.getGame_info() != null) {
            UtilsMy.w0(giftPackageDataOperationBean.getGame_info().getPay_tag_info(), giftPackageDataOperationBean.getGame_info().getCrc_sign_id());
            UtilsMy.r3(button, giftPackageDataOperationBean.getGame_info().getDown_status(), giftPackageDataOperationBean.getGame_info().getPay_tag_info(), giftPackageDataOperationBean.getGame_info().getCrc_sign_id());
            UtilsMy.k3(giftPackageDataOperationBean.getGame_info().getSp_tag_info(), textView);
        }
        button.setOnClickListener(new s());
        e1();
        dialog = this.X;
        if (dialog != null) {
        }
    }

    void V0() {
        ExtBean extBean = this.I;
        if (extBean == null || TextUtils.isEmpty(extBean.getFrom()) || !this.I.getFrom().equals("downloadCenter")) {
            return;
        }
        MobclickAgent.onEvent(this, "detailDownload4.2.0.6");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void V1() {
        this.f34350n.setVisibility(0);
        this.f34348l.setVisibility(0);
        this.f34349m.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Receiver(actions = {o1.a.G, o1.a.I})
    public void W0(@Receiver.Extra("gameData") CollectionBeanSub collectionBeanSub) {
        if (collectionBeanSub != null) {
            PurchasedListTable n4 = b2.e0.o().n(collectionBeanSub.getGame_id());
            if (n4 == null) {
                n4 = new PurchasedListTable();
            }
            n4.setGame_id(collectionBeanSub.getGame_id());
            b2.e0.o().m(n4);
        }
        g2();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void W1(DetailResultBeanV3 detailResultBeanV3) {
        try {
            this.f34340f.setVisibility(8);
            this.f34344h.setVisibility(0);
            this.f34338e.setVisibility(8);
            this.f34345i.setVisibility(0);
            if (detailResultBeanV3 != null) {
                this.f34342g.setText(detailResultBeanV3.getGame_describe_second());
            }
            this.S.f0(0);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void X0() {
        f2();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void X1(List<CommentBaseBean> list) {
        this.M.setCommitDataBeanList(list);
        e1();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void Y0(CommentBaseBean commentBaseBean, int i4, int i5) {
        if (com.join.android.app.common.utils.j.j(this.K)) {
            try {
                CommentResponse<CommentPraiseBean> h4 = this.A1.h(G0(commentBaseBean.getId(), i5, commentBaseBean.getPn()));
                if (h4 != null) {
                    if (h4.getCode() == 801) {
                        h1(h4);
                    } else if (h4.getSucc() != 1) {
                        g1(h4.getMsg(), true, i4, 1);
                    }
                    if (h4.getSucc() == 1) {
                        w0(i4, 1);
                        return;
                    }
                    return;
                }
                g1("操作失败，请稍候再试~", true, i4, 1);
                return;
            } catch (Exception e5) {
                g1("操作失败，请稍候再试~", true, i4, 1);
                e5.printStackTrace();
                return;
            }
        }
        g1("网络连接失败，再试试吧~", true, i4, 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void Y1() {
        this.f34350n.setVisibility(8);
        this.f34348l.setVisibility(8);
        this.f34349m.setVisibility(0);
    }

    void Z0(CommentBaseBean commentBaseBean) {
        CommentDetailActivity_.M1(this.K).d(commentBaseBean.getGame_id()).b(commentBaseBean.getId()).f(this.M.getPlugin_num()).a(this.M.getBespeak_switch()).e(0).c("0").h(0).g(this.M.getPackage_name()).start();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void Z1() {
        com.join.mgps.customview.o oVar = this.J1;
        if (oVar != null) {
            if (oVar.isShowing()) {
                return;
            }
        } else {
            this.J1 = com.join.mgps.Util.b0.f0(this.K).c0(this.K);
        }
        this.J1.show();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void a1(CommentBaseBean commentBaseBean, int i4, int i5) {
        if (com.join.android.app.common.utils.j.j(this.K)) {
            try {
                CommentResponse<CommentPraiseBean> l4 = this.A1.l(G0(commentBaseBean.getId(), i5, commentBaseBean.getPn()));
                if (l4 != null) {
                    if (l4.getCode() == 801) {
                        h1(l4);
                    } else if (l4.getSucc() != 1) {
                        g1(l4.getMsg(), true, i4, 2);
                    }
                    if (l4.getSucc() == 1) {
                        w0(i4, 2);
                        return;
                    }
                    return;
                }
                g1("操作失败，请稍候再试~", true, i4, 2);
                return;
            } catch (Exception e5) {
                g1("操作失败，请稍候再试~", true, i4, 2);
                e5.printStackTrace();
                return;
            }
        }
        g1("网络连接失败，再试试吧~", true, i4, 2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void a2() {
        com.join.mgps.customview.o oVar = this.K1;
        if (oVar != null) {
            if (oVar.isShowing()) {
                return;
            }
        } else {
            this.K1 = com.join.mgps.Util.b0.f0(this.K).e0(this.K);
        }
        this.K1.show();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterViews() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        if (this.I == null) {
            this.I = new ExtBean();
        }
        this.F = com.join.mgps.rpc.impl.d.P1();
        this.G = com.join.mgps.rpc.impl.n.h();
        this.f34331a2 = com.join.mgps.rpc.impl.a.c0();
        this.A1 = com.join.mgps.rpc.impl.e.m();
        this.O1 = this.H.getCrc_link_type_val();
        RequestBeanUtil.getInstance(this.K);
        this.M1 = RequestBeanUtil.getVersionAndVersionName();
        try {
            this.K = this;
            getDownloadTaskInfo();
            com.join.mgps.Util.d0.a().d(this.K);
            this.f34365z.setVisibility(8);
            this.B.setVisibility(0);
            this.E.setVisibility(0);
            this.f34364y.setOnClickListener(new t());
            this.K = this;
            initData();
            S1();
            this.f34364y.setImageResource(R.drawable.search_image);
            this.f34344h.setOnScrollListener(new u());
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        ExtBean extBean = this.I;
        if (extBean != null) {
            String from = extBean.getFrom();
            String position = this.I.getPosition();
            String location = this.I.getLocation();
            this.I.getDataFlag();
            str2 = position;
            str = from;
            str3 = location;
            str4 = this.I.getKeyword();
            str5 = this.I.getWhere();
        } else {
            str = "";
            str2 = str;
            str3 = str2;
            str4 = str3;
            str5 = str4;
        }
        if (com.join.mgps.Util.g2.i(str2)) {
            com.papa.sim.statistic.p.l(getApplicationContext()).s2(this.N.getCrc_link_type_val(), AccountUtil_.getInstance_(getApplicationContext()).getUid(), str, str2, str3, "normalCustom", str4, str5);
        } else {
            com.papa.sim.statistic.p.l(getApplicationContext()).r2(this.N.getCrc_link_type_val(), AccountUtil_.getInstance_(getApplicationContext()).getUid(), this.I.get_from_type());
        }
        if (Build.VERSION.SDK_INT >= 21) {
            Window window = getWindow();
            window.addFlags(TTAdConstant.KEY_CLICK_AREA);
            window.addFlags(Integer.MIN_VALUE);
            com.join.android.app.common.manager.b bVar = new com.join.android.app.common.manager.b(this);
            this.Y = bVar;
            bVar.m(true);
            this.Y.n(R.color.transparent);
            com.join.mgps.Util.c2.c(this, com.join.mgps.Util.c2.d(this));
            View childAt = ((ViewGroup) findViewById(16908290)).getChildAt(0);
            if (childAt != null) {
                ViewCompat.setFitsSystemWindows(childAt, false);
            }
            int dimensionPixelSize = getResources().getDimensionPixelSize(getResources().getIdentifier("status_bar_height", "dimen", q.a.f73126a));
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.setMargins(0, dimensionPixelSize, 0, 0);
            this.D.setLayoutParams(layoutParams);
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, (int) getResources().getDimension(R.dimen.wdp100));
            layoutParams2.setMargins(0, dimensionPixelSize, 0, 0);
            this.f34334c.setLayoutParams(layoutParams2);
        }
        i2(false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Receiver(actions = {"com.join,mgps.sim.sdkgamePayfinish"})
    public void b1(Intent intent) {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void b2() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void back_image() {
        this.K.finish();
        O0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void c1(InformationCommentBean informationCommentBean) {
        if (com.join.android.app.common.utils.j.j(this.K)) {
            try {
                GamePariseRequest gamePariseRequest = new GamePariseRequest();
                gamePariseRequest.setGame_id(this.N.getCrc_link_type_val());
                gamePariseRequest.setComment_id(informationCommentBean.getComment_id() + "");
                gamePariseRequest.setUid(this.U.getUid());
                ResultMainBean<List<PariseBackData>> b5 = this.F.b(RequestBeanUtil.getInstance(getApplicationContext()).getGameDetailParis(gamePariseRequest));
                if (b5 != null && b5.getFlag() == 1) {
                    List<PariseBackData> data = b5.getMessages().getData();
                    if (data.size() > 0) {
                        int i4 = 0;
                        if (data.get(0).isVal()) {
                            try {
                                i4 = Integer.parseInt(informationCommentBean.getPraise_count()) + 1;
                            } catch (Exception e5) {
                                e5.printStackTrace();
                            }
                            informationCommentBean.setPraise_count(i4 + "");
                            f2();
                            return;
                        }
                        showToast("你已赞过");
                        return;
                    }
                    showToast("你已赞过");
                    return;
                }
                X0();
                showToast("点赞失败");
                return;
            } catch (Exception e6) {
                e6.printStackTrace();
                X0();
                showToast("点赞失败");
                return;
            }
        }
        showToast("没有网络");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void c2() {
        IntentUtil.getInstance().goMyGameManagerActivity(this);
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
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r4 = r2.f34354p1
            boolean r4 = r4.containsKey(r0)
            if (r4 != 0) goto L2d
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r4 = r2.f34354p1
            r4.put(r0, r3)
        L2d:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r4 = r2.f34361v1
            boolean r4 = r4.containsKey(r0)
            if (r4 != 0) goto La7
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r4 = r2.f34361v1
            r4.put(r0, r3)
            goto La7
        L3b:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.f34354p1
            boolean r3 = r3.containsKey(r0)
            if (r3 == 0) goto L48
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.f34354p1
            r3.remove(r0)
        L48:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.f34361v1
            boolean r3 = r3.containsKey(r0)
            if (r3 == 0) goto La7
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.f34361v1
            r3.remove(r0)
            goto La7
        L56:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.f34361v1
            boolean r3 = r3.containsKey(r0)
            if (r3 == 0) goto La7
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.f34361v1
            r3.remove(r0)
            goto La7
        L64:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.f34354p1
            boolean r3 = r3.containsKey(r0)
            if (r3 == 0) goto L71
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.f34354p1
            r3.remove(r0)
        L71:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.f34361v1
            boolean r3 = r3.containsKey(r0)
            if (r3 == 0) goto La7
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.f34361v1
            r3.remove(r0)
            goto La7
        L7f:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.f34361v1
            boolean r3 = r3.containsKey(r0)
            if (r3 == 0) goto La7
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.f34361v1
            r3.remove(r0)
            goto La7
        L8d:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r4 = r2.f34354p1
            boolean r4 = r4.containsKey(r0)
            if (r4 != 0) goto L9a
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r4 = r2.f34354p1
            r4.put(r0, r3)
        L9a:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r4 = r2.f34361v1
            boolean r4 = r4.containsKey(r0)
            if (r4 != 0) goto La7
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r4 = r2.f34361v1
            r4.put(r0, r3)
        La7:
            r2.updateDownloadView()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.mgps.activity.MGGameDetailActivity.changeDownloadTaskNumber(com.github.snowdream.android.app.downloader.DownloadTask, int):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void checkDownlodingNumber() {
        try {
            this.Q = p1.f.K().S();
            int a02 = p1.f.K().a0();
            this.R = a02;
            updateLine(a02);
            int i4 = this.Q;
            if (i4 != 0) {
                updateDownloadingPoint(i4);
            } else {
                updateNoOpenPoint();
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void d1() {
        StringBuilder sb = new StringBuilder();
        sb.append("method progress_layout() called.status=");
        sb.append(this.L.getStatus());
        DownloadTask downloadTask = this.L;
        if (downloadTask == null) {
            return;
        }
        if (downloadTask.getStatus() == 2) {
            g2();
            com.php25.PDownload.d.i(this.L);
        } else if (this.L.getStatus() == 3 || this.L.getStatus() == 6) {
            g2();
            com.php25.PDownload.d.c(this.L, this.K);
            V0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void d2() {
        SearchHintActivity_.G1(this).start();
        com.papa.sim.statistic.p.l(this.K).u2(Where.detial2, AccountUtil_.getInstance_(this.K).getUid());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void downloadLayout() {
        IntentUtil.getInstance().goMyGameManagerActivity(this);
    }

    synchronized void e1() {
        try {
            if (this.D1 == null) {
                this.D1 = new ArrayList();
            }
            this.D1.clear();
            this.M.setSp_tpl_two_position(0);
            if (com.join.mgps.Util.g2.h(this.M.getBackground_color())) {
                this.M.setBackground_color("#230404");
            }
            try {
                this.C.setBackgroundColor(Color.parseColor(this.M.getBackground_color()));
                this.f34344h.setBackgroundColor(Color.parseColor(this.M.getBackground_color()));
            } catch (Exception e5) {
                e5.printStackTrace();
            }
            this.f34345i.setBackgroundColor(1275068416);
            this.A.setVisibility(8);
            M1();
            if (this.M.getSp_tpl_two_banner_switch() == 1) {
                j1();
            }
            z1();
            A1();
            y1();
            u1();
            L1();
            K1();
            J1();
            q1();
            O1();
            Q1();
            t1();
            s1();
            B1();
            r1();
            F1();
            G1();
            m1();
            k1();
            l1();
            this.S.notifyDataSetChanged();
        } catch (Exception e6) {
            e6.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void e2() {
        XListView2 xListView2 = this.X1;
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
    public void f1() {
        e1();
        com.join.mgps.listener.a.b().c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void f2() {
        if (this.M.getComment_switch() == 1) {
            I0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void g0() {
        try {
            com.wufan.user.service.protobuf.n0 accountData = AccountUtil_.getInstance_(this.K).getAccountData();
            LinkedMultiValueMap linkedMultiValueMap = new LinkedMultiValueMap();
            linkedMultiValueMap.add("uid", Integer.valueOf(accountData.getUid()));
            linkedMultiValueMap.add("token", accountData.getToken());
            linkedMultiValueMap.add("group_id", f34328i2);
            linkedMultiValueMap.add("game_id", this.O1);
            linkedMultiValueMap.add("game_title", f34329j2);
            linkedMultiValueMap.add("device_id", this.L1);
            linkedMultiValueMap.add("version", this.M1);
            GameFromBooleanBean Q = this.f34331a2.Q(linkedMultiValueMap);
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
    @UiThread
    public void g1(String str, boolean z4, int i4, int i5) {
        com.join.mgps.Util.l2.a(this.K).b(str);
        if (z4) {
            if (i5 == 1) {
                this.S.U(i4, 0);
            } else {
                this.S.T(i4, 0);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void g2() {
        DetailResultBeanV3 detailResultBeanV3 = this.M;
        if (detailResultBeanV3 == null || this.L == null) {
            return;
        }
        UtilsMy.j3(detailResultBeanV3.getSp_tag_info(), this.f34350n, this.L);
        ((TextView) this.f34350n.findViewById(R.id.moneyText)).setTextColor(-1);
        StringBuilder sb = new StringBuilder();
        sb.append("method updateButn() called.status=");
        sb.append(this.L.getStatus());
        this.f34348l.setBackgroundResource(R.drawable.detial_simple_normal_selecter);
        DownloadTask downloadTask = this.L;
        int status = downloadTask != null ? downloadTask.getStatus() : 0;
        if (UtilsMy.w0(this.M.getPay_tag_info(), this.M.getCrc_sign_id()) > 0) {
            status = 43;
        }
        if (status == 9) {
            V1();
            this.f34348l.setText("更新");
            this.f34351o.setImageResource(R.drawable.detail_comment_download_continue);
            this.f34351o.setImageResource(R.drawable.detial_simple_install_selecter);
        } else if (status == 12) {
            V1();
            this.f34348l.setText("解压中..");
        } else if (status == 13) {
            V1();
            this.f34348l.setText("解压");
            this.f34351o.setImageResource(R.drawable.detail_comment_download_continue);
        } else if (status == 11) {
            V1();
            this.f34348l.setText("安装");
            this.f34348l.setBackgroundResource(R.drawable.detial_simple_install_selecter);
            this.f34351o.setImageResource(R.drawable.detial_simple_install_selecter);
        } else if (status == 5 || status == 42) {
            V1();
            i2(true);
            this.f34348l.setBackgroundResource(R.drawable.detial_simple_open_selecter);
            this.f34348l.setText(this.K.getResources().getString(R.string.download_status_finished));
            this.f34351o.setImageResource(R.drawable.detail_comment_download_continue);
        } else if (status == 2) {
            Y1();
            this.f34351o.setImageResource(R.drawable.detail_comment_download_pause);
            UtilsMy.x4(this.L);
            this.f34355q.setProgress((int) this.L.getProgress());
            TextView textView = this.f34352p;
            textView.setText(this.L.getProgress() + "%");
        } else if (status == 3 || status == 6 || status == 27) {
            Y1();
            this.f34351o.setImageResource(R.drawable.detail_comment_download_continue);
            UtilsMy.x4(this.L);
            this.f34355q.setProgress((int) this.L.getProgress());
            TextView textView2 = this.f34352p;
            textView2.setText(this.L.getProgress() + "%");
        } else if (status == 10) {
            V1();
            TextView textView3 = this.f34348l;
            textView3.setText("等待\u3000" + this.M.getSize() + "M");
            this.f34351o.setImageResource(R.drawable.detail_comment_download_continue);
        } else if (status == 1) {
        } else {
            if (status == 43) {
                V1();
                if (U0(this.M) && !b2.e0.o().p(this.M.getCrc_sign_id())) {
                    this.f34348l.setText(this.K.getResources().getString(R.string.pay_game_amount, this.M.getPay_tag_info().getPayGameAmount()));
                } else {
                    this.f34348l.setText(this.K.getResources().getString(R.string.download_status_download));
                }
                this.f34351o.setImageResource(R.drawable.detail_comment_download_continue);
                DetailResultBeanV3 detailResultBeanV32 = this.M;
                if (detailResultBeanV32 != null) {
                    if (detailResultBeanV32.getBespeak_switch() == 1 && this.M.getDown_status() == 2) {
                        if (this.M.getGame_book() == 1) {
                            this.f34348l.setText("已预约");
                            UtilsMy.w0(this.M.getPay_tag_info(), this.M.getCrc_sign_id());
                            UtilsMy.m3(this.f34348l, this.M);
                            return;
                        }
                        this.f34348l.setText("预约");
                        return;
                    }
                    UtilsMy.w0(this.M.getPay_tag_info(), this.M.getCrc_sign_id());
                    UtilsMy.m3(this.f34348l, this.M);
                }
            } else if (status == 48) {
                V1();
                this.f34348l.setText(this.K.getResources().getString(R.string.download_status_installing));
            } else {
                V1();
                if (U0(this.M) && !b2.e0.o().p(this.M.getCrc_sign_id())) {
                    this.f34348l.setText(this.K.getResources().getString(R.string.pay_game_amount, this.M.getPay_tag_info().getPayGameAmount()));
                } else {
                    this.f34348l.setText(this.K.getResources().getString(R.string.download_status_download));
                }
                this.f34351o.setImageResource(R.drawable.detail_comment_download_continue);
                DetailResultBeanV3 detailResultBeanV33 = this.M;
                if (detailResultBeanV33 != null) {
                    if (detailResultBeanV33.getBespeak_switch() == 1 && this.M.getDown_status() == 2) {
                        if (this.M.getGame_book() == 1) {
                            this.f34348l.setText("已预约");
                            UtilsMy.w0(this.M.getPay_tag_info(), this.M.getCrc_sign_id());
                            UtilsMy.m3(this.f34348l, this.M);
                            return;
                        }
                        this.f34348l.setText("预约");
                        return;
                    }
                    UtilsMy.w0(this.M.getPay_tag_info(), this.M.getCrc_sign_id());
                    UtilsMy.m3(this.f34348l, this.M);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void getDownloadTaskInfo() {
        List<DownloadTask> r4 = p1.f.K().r();
        List<DownloadTask> q4 = p1.f.K().q();
        if (q4 != null && q4.size() > 0) {
            for (DownloadTask downloadTask : q4) {
                this.f34354p1.put(downloadTask.getCrc_link_type_val(), downloadTask);
            }
        }
        if (r4 != null && r4.size() > 0) {
            for (DownloadTask downloadTask2 : r4) {
                this.f34361v1.put(downloadTask2.getCrc_link_type_val(), downloadTask2);
            }
        }
        updateDownloadView();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void h0(String str, String str2, w wVar) {
        try {
            if (com.join.android.app.common.utils.j.j(this.K)) {
                LinkedMultiValueMap linkedMultiValueMap = new LinkedMultiValueMap();
                linkedMultiValueMap.add("uid", Integer.valueOf(this.U.getUid()));
                linkedMultiValueMap.add("token", this.U.getToken());
                linkedMultiValueMap.add("group_id", str);
                linkedMultiValueMap.add("game_id", str2);
                linkedMultiValueMap.add("device_id", this.L1);
                linkedMultiValueMap.add("version", this.M1);
                GameFromBooleanBean z4 = this.f34331a2.z(linkedMultiValueMap);
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
    @UiThread
    public void h1(CommentResponse commentResponse) {
        if (commentResponse.getCode() == 801) {
            M0();
            com.join.mgps.Util.l2.a(this.K).b("数据访问失败，请稍候再试！");
            return;
        }
        com.join.mgps.Util.l2.a(this.K).b(commentResponse.getMsg());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void h2() {
        XListView2 xListView2 = this.X1;
        if (xListView2 != null) {
            try {
                xListView2.u();
                this.X1.v();
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void i0() {
        try {
            XListView2 xListView2 = this.X1;
            if (xListView2 != null) {
                xListView2.l();
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void i1() {
        IntentUtil.getInstance().goSearchHintActivity(this.K);
        com.papa.sim.statistic.p.l(this.K).u2(Where.detial2, AccountUtil_.getInstance_(this.K).getUid());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread(delay = 1000)
    public void i2(boolean z4) {
        ExtBean extBean = this.I;
        if (extBean == null || !"checkgame".equals(extBean.getFrom())) {
            return;
        }
        com.join.mgps.Util.m1.c().b(this.K, this.I.getFrom_id(), new b(z4));
    }

    void initData() {
        this.M = new DetailResultBeanV3();
        IntentDateBean intentDateBean = this.H;
        this.N = intentDateBean;
        try {
            if (intentDateBean.getObject() != null && (this.N.getObject() instanceof IntentToDetialBean)) {
                IntentToDetialBean intentToDetialBean = (IntentToDetialBean) this.N.getObject();
                this.O = intentToDetialBean;
                this.f34346j.setText(intentToDetialBean.b());
                this.M.setIco_remote(this.O.d());
                this.M.setDescribe(this.O.b());
                this.M.setGame_name("");
            } else if (this.N.getObject() != null && (this.N.getObject() instanceof Boolean)) {
                this.P = ((Boolean) this.N.getObject()).booleanValue();
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        this.f34344h.addFooterView(LayoutInflater.from(this.K).inflate(R.layout.game_detail_header, (ViewGroup) null));
        this.D1 = new ArrayList();
        MGGameDetailAdapter mGGameDetailAdapter = new MGGameDetailAdapter(this, this.M, this.B1, this.E1, this.D1);
        this.S = mGGameDetailAdapter;
        this.f34344h.setAdapter((ListAdapter) mGGameDetailAdapter);
        this.S.Y(new a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void j2(ResultMainBean resultMainBean, int i4) {
        if (resultMainBean.getFlag() == 1) {
            if (i4 == 2) {
                this.M.setGame_follow(1);
                com.join.mgps.Util.l2.a(this.K).b("收藏成功");
            } else if (i4 == 3) {
                this.M.setGame_book(0);
            } else if (i4 == 4) {
                this.M.setGame_book(1);
                Intent intent = new Intent("com.broadcast.bespeak.sussess");
                intent.putExtra("gameid", this.M.getCrc_sign_id());
                sendBroadcast(intent);
                com.join.mgps.Util.b0.f0(this.K).O(this.K, 1, new e()).show();
            }
            e1();
            g2();
        }
    }

    void o1(int i4) {
        this.f34355q.setProgress(i4);
        TextView textView = this.f34352p;
        textView.setText(i4 + "%");
    }

    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        C0();
        B0();
        com.join.mgps.Util.d0.a().e(this.K);
        Dialog dialog = this.X;
        if (dialog != null && dialog.isShowing()) {
            this.X.dismiss();
        }
        A0();
        super.onDestroy();
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0099, code lost:
        if (r6 != 48) goto L52;
     */
    @org.greenrobot.eventbus.Subscribe(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onEventMainThread(com.join.mgps.event.n r6) {
        /*
            Method dump skipped, instructions count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.mgps.activity.MGGameDetailActivity.onEventMainThread(com.join.mgps.event.n):void");
    }

    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        DetailResultBeanV3 detailResultBeanV3;
        super.onResume();
        if (f34330k2) {
            this.f34337d2 = 1;
            f34330k2 = false;
            J0();
        }
        if (this.J.isNewFinishedGame().d().booleanValue()) {
            this.f34360v.setVisibility(0);
        } else {
            this.f34360v.setVisibility(8);
        }
        f2();
        this.f34359u.setDrawable(getResources().getDrawable(R.drawable.papa_download_selector));
        checkDownlodingNumber();
        DownloadTask F = this.N != null ? p1.f.K().F(this.N.getCrc_link_type_val()) : null;
        if (F == null && (detailResultBeanV3 = this.M) != null) {
            this.L = detailResultBeanV3.getDownloadtaskDown();
        }
        if (F == null || this.L == null) {
            return;
        }
        this.L = F;
        if (F.getFileType().equals(Dtype.android.name()) && this.L.getStatus() == 5) {
            if (Boolean.valueOf(com.join.android.app.common.utils.e.l0(getApplicationContext()).d(getApplicationContext(), this.L.getPackageName())).booleanValue()) {
                APKUtils.a l4 = com.join.android.app.common.utils.e.l0(getApplicationContext()).l(this.K, this.L.getPackageName());
                if (com.join.mgps.Util.g2.i(this.L.getVer()) && l4.d() < Integer.parseInt(this.L.getVer())) {
                    this.L.setStatus(9);
                } else {
                    this.L.setStatus(5);
                }
            } else {
                this.L.setStatus(11);
            }
        } else {
            this.L.setStatus(F.getStatus());
        }
        g2();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread(delay = 300)
    public void p1(DetailResultBeanV3 detailResultBeanV3) {
        this.f34353p0 = true;
        this.M.setCdn_down_switch(detailResultBeanV3.getCdn_down_switch());
        this.M.setCfg_ver(detailResultBeanV3.getCfg_ver());
        this.M.setCfg_down_url(detailResultBeanV3.getCfg_down_url());
        this.M.setCfg_lowest_ver(detailResultBeanV3.getCfg_lowest_ver());
        this.M.setCfg_ver_name(detailResultBeanV3.getCfg_ver_name());
        this.M.setComment_count(detailResultBeanV3.getComment_count());
        this.M.setComment_count_manual(detailResultBeanV3.getComment_count_manual());
        this.M.setComment_people_count(detailResultBeanV3.getComment_people_count());
        this.M.setComment_people_count_manual(detailResultBeanV3.getComment_people_count_manual());
        this.M.setCompany_name(detailResultBeanV3.getCompany_name());
        this.M.setComposite_score(detailResultBeanV3.getComposite_score());
        this.M.setCrc_sign_id(detailResultBeanV3.getCrc_sign_id());
        this.M.setDown_count(detailResultBeanV3.getDown_count());
        this.M.setDownloadType(detailResultBeanV3.getDownloadType());
        this.M.setDescribe(detailResultBeanV3.getDescribe());
        this.M.setDown_url_local(detailResultBeanV3.getDown_url_local());
        this.M.setDown_count_manual(detailResultBeanV3.getDown_count_manual());
        this.M.setDown_url_remote(detailResultBeanV3.getDown_url_remote());
        this.M.setEdit_recommend(detailResultBeanV3.getEdit_recommend());
        this.M.setFight_funv2(detailResultBeanV3.getFight_funv2());
        this.M.setFight_type(detailResultBeanV3.getFight_type());
        this.M.setForum_id(detailResultBeanV3.getForum_id());
        this.M.setForum_switch(detailResultBeanV3.getForum_switch());
        this.M.setGame_info_tpl_type(detailResultBeanV3.getGame_info_tpl_type());
        this.M.setGame_info_top_pic(detailResultBeanV3.getGame_info_top_pic());
        this.M.setGame_name(detailResultBeanV3.getGame_name());
        this.M.setGame_upgrade_info(detailResultBeanV3.getGame_upgrade_info());
        this.M.setGame_upgrade_info_switch(detailResultBeanV3.getGame_upgrade_info_switch());
        this.M.setIco_remote(detailResultBeanV3.getIco_remote());
        this.M.setIs_world(detailResultBeanV3.getIs_world());
        this.M.setIs_network(detailResultBeanV3.getIs_network());
        this.M.setInfo(detailResultBeanV3.getInfo());
        this.M.setIco_local(detailResultBeanV3.getIco_local());
        this.M.setIs_fight(detailResultBeanV3.getIs_fight());
        this.M.setLock_sp(detailResultBeanV3.getLock_sp());
        this.M.setOther_down_switch(detailResultBeanV3.getOther_down_switch());
        this.M.setPic_info(detailResultBeanV3.getPic_info());
        this.M.setPlugin_screenshot(detailResultBeanV3.getPlugin_screenshot());
        this.M.setPlugin_num(detailResultBeanV3.getPlugin_num());
        this.M.setPlugin_lowest_ver_name(detailResultBeanV3.getPlugin_lowest_ver_name());
        this.M.setPlugin_lowest_ver(detailResultBeanV3.getPlugin_lowest_ver());
        this.M.setPackage_name(detailResultBeanV3.getPackage_name());
        this.M.setPapa_explain(detailResultBeanV3.getPapa_explain());
        this.M.setPercen_praise(detailResultBeanV3.getPercen_praise());
        this.M.setPercen_stars(detailResultBeanV3.getPercen_stars());
        this.M.setPercen_stars(detailResultBeanV3.getPercen_stars());
        this.M.setRecommend_game(detailResultBeanV3.getRecommend_game());
        this.M.setRecommend_game_switch(detailResultBeanV3.getRecommend_game_switch());
        this.M.setRecommend_information(detailResultBeanV3.getRecommend_information());
        this.M.setRom_lowest_ver(detailResultBeanV3.getRom_lowest_ver());
        this.M.setSource_ver_name(detailResultBeanV3.getSource_ver_name());
        this.M.setSource_ver(detailResultBeanV3.getSource_ver());
        this.M.setSync_memory(detailResultBeanV3.getSync_memory());
        this.M.setScore_count(detailResultBeanV3.getScore_count());
        this.M.setScore_count_manual(detailResultBeanV3.getScore_count_manual());
        this.M.setScreenshot_pic(detailResultBeanV3.getScreenshot_pic());
        this.M.setSharer(detailResultBeanV3.getSharer());
        this.M.setSign_id(detailResultBeanV3.getSign_id());
        this.M.setSize(detailResultBeanV3.getSize());
        this.M.setTp_down_url(detailResultBeanV3.getTp_down_url());
        this.M.setTab_page_info(detailResultBeanV3.getTab_page_info());
        this.M.setTag_info(detailResultBeanV3.getTag_info());
        this.M.setUnzip_size(detailResultBeanV3.getUnzip_size());
        this.M.setVedio_cover_pic(detailResultBeanV3.getVedio_cover_pic());
        this.M.setVedio_url(detailResultBeanV3.getVedio_url());
        this.M.setVer(detailResultBeanV3.getVer());
        this.M.setVer_name(detailResultBeanV3.getVer_name());
        this.M.setWorld_shop(detailResultBeanV3.getWorld_shop());
        this.M.setWorld_area(detailResultBeanV3.getWorld_area());
        this.M.setDown_url_remote(detailResultBeanV3.getDown_url_remote());
        this.M.setApk_sign(detailResultBeanV3.getApk_sign());
        this.M.setFight_screenshot_pic(detailResultBeanV3.getFight_screenshot_pic());
        this.M.setLast_week_down_count(detailResultBeanV3.getLast_week_down_count());
        this.M.setRecommend_ad_info(detailResultBeanV3.getRecommend_ad_info());
        this.M.setGame_describe_second(detailResultBeanV3.getGame_describe_second());
        this.M.setGame_prompt(detailResultBeanV3.getGame_prompt());
        this.M.setRecommend_information_switch(detailResultBeanV3.getRecommend_information_switch());
        this.M.setRecommend_adinfo_switch(detailResultBeanV3.getRecommend_adinfo_switch());
        this.M.setComment_switch(detailResultBeanV3.getComment_switch());
        this.M.setPic_position(detailResultBeanV3.getPic_position());
        this.M.setGame_coupon_list(detailResultBeanV3.getGame_coupon_list());
        this.M.setGame_gift_package(detailResultBeanV3.getGame_gift_package());
        this.M.setGift_package_switch(detailResultBeanV3.getGift_package_switch());
        this.M.setDown_status(detailResultBeanV3.getDown_status());
        this.M.setPanel_switch(detailResultBeanV3.getPanel_switch());
        this.M.setBanner(detailResultBeanV3.getBanner());
        this.M.setGame_server_state(detailResultBeanV3.getGame_server_state());
        this.M.setGame_strategy(detailResultBeanV3.getGame_strategy());
        this.M.setFast_entry_no4(detailResultBeanV3.getFast_entry_no4());
        this.M.setGame_book_tag(detailResultBeanV3.getGame_book_tag());
        this.M.setGame_follow(detailResultBeanV3.getGame_follow());
        this.M.setGame_book(detailResultBeanV3.getGame_book());
        this.M.setSp_tpl_two_banner_switch(detailResultBeanV3.getSp_tpl_two_banner_switch());
        this.M.setSp_tpl_two_position(detailResultBeanV3.getSp_tpl_two_position());
        this.M.setServer_qq(detailResultBeanV3.getServer_qq());
        this.M.setPlayer_qq(detailResultBeanV3.getPlayer_qq());
        this.M.setFollow_background_img(detailResultBeanV3.getFollow_background_img());
        this.M.setForum_count(detailResultBeanV3.getForum_count());
        this.M.setBespeak_switch(detailResultBeanV3.getBespeak_switch());
        this.M.setBackground_color(detailResultBeanV3.getBackground_color());
        this.M.setGame_server_switch(detailResultBeanV3.getGame_server_switch());
        this.M.setGame_service_switch(detailResultBeanV3.getGame_service_switch());
        this.M.setFast_entry_switch(detailResultBeanV3.getFast_entry_switch());
        this.M.setBespeak_count(detailResultBeanV3.getBespeak_count());
        this.M.setDown_count(detailResultBeanV3.getDown_count());
        this.M.setShare_url(detailResultBeanV3.getShare_url());
        this.M.setSp_tag_info(detailResultBeanV3.getSp_tag_info());
        this.M.setPay_tag_info(detailResultBeanV3.getPay_tag_info());
        this.M.set_from_type(this.I.get_from_type());
        this.M.set_from(101);
        int height = this.f34342g.getHeight() / this.f34342g.getLineHeight();
        this.W = height;
        this.M.setLineCount(height);
        e1();
        if (this.M.getComment_switch() == 1) {
            I0();
        }
        this.f34346j.setText(this.M.getGame_name());
        if (this.N != null) {
            this.L = p1.f.K().F(this.N.getCrc_link_type_val());
        }
        DownloadTask downloadTask = this.L;
        if (downloadTask == null) {
            this.L = this.M.getDownloadtaskDown();
            if (UtilsMy.o0(this.M.getTag_info())) {
                this.L.setFileType(Dtype.android.name());
                if (com.join.android.app.common.utils.e.l0(getApplicationContext()).d(getApplicationContext(), this.M.getPackage_name())) {
                    APKUtils.a l4 = com.join.android.app.common.utils.e.l0(getApplicationContext()).l(getApplicationContext(), this.M.getPackage_name());
                    if (com.join.mgps.Util.g2.i(this.M.getVer()) && l4.d() < Integer.parseInt(this.M.getVer())) {
                        this.L.setStatus(9);
                    } else {
                        this.L.setStatus(5);
                    }
                } else {
                    this.L.setStatus(0);
                }
            } else {
                this.L.setStatus(0);
            }
        } else {
            downloadTask.setDownloadType(this.M.getDownloadType());
            this.L.setScreenshot_pic(this.M.getScreenshot_pic());
        }
        g2();
        if (this.P) {
            S0();
        }
        if (UtilsMy.u0(this.M.getTag_info()) || Integer.parseInt(this.M.getPlugin_num()) != 46) {
            return;
        }
        Iterator<TipBean> it2 = detailResultBeanV3.getTag_info().iterator();
        while (it2.hasNext() && !it2.next().getId().equals("23")) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void relodingimag() {
        showLoding();
        H0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void s0(GameFromPopoWinBean gameFromPopoWinBean) {
        for (int i4 = 0; i4 < gameFromPopoWinBean.getData().size(); i4++) {
            this.f34339e2.add(gameFromPopoWinBean.getData().get(i4));
        }
        if (gameFromPopoWinBean.getData().size() < 10 && this.X1 != null) {
            e2();
        }
        v vVar = this.Y1;
        if (vVar != null) {
            vVar.notifyDataSetChanged();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void setNetwork() {
        UtilsMy.w3(this.K);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showLoding() {
        this.f34340f.setVisibility(0);
        this.f34338e.setVisibility(8);
        this.f34344h.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showLodingFailed() {
        this.f34340f.setVisibility(8);
        this.f34338e.setVisibility(0);
        this.f34344h.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showToast(String str) {
        com.join.mgps.Util.l2.a(this.K).b(str);
    }

    void startLineAnimation() {
        this.f34362w.setImageResource(R.drawable.line_blue_bg);
        Animation loadAnimation = AnimationUtils.loadAnimation(this.K, R.anim.img_translate);
        this.T = loadAnimation;
        loadAnimation.setFillAfter(true);
        this.f34363x.setVisibility(0);
        this.f34363x.startAnimation(this.T);
        this.T.setAnimationListener(new f());
    }

    void stopLineAnimation() {
        this.f34363x.clearAnimation();
        this.f34363x.setVisibility(8);
        this.f34362w.setImageResource(R.drawable.line_grey_bg);
    }

    void t0(DownloadTask downloadTask) {
        ExtBean extBean = this.I;
        if (extBean == null || TextUtils.isEmpty(extBean.getFrom()) || downloadTask == null || !"112".equals(this.I.getFrom())) {
            return;
        }
        ExtBean extBean2 = new ExtBean();
        extBean2.setFrom("101");
        extBean2.setPosition("112");
        extBean2.setLocation(this.I.getLocation());
        downloadTask.setExt(JsonMapper.toJsonString(extBean2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void u0() {
        this.K.finish();
        O0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void updateDownloadView() {
        try {
            int size = this.f34354p1.size();
            int size2 = this.f34361v1.size();
            this.E.setDownloadGameNum(size);
            StringBuilder sb = new StringBuilder();
            sb.append("updateDownloadView: ");
            sb.append(size2);
            sb.append("::::已经进入下载队列中的数量:::");
            sb.append(size);
            if (size2 > 0) {
                this.E.d();
            } else {
                this.E.g();
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void updateDownloadingPoint(int i4) {
        if (i4 < 100) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f34358t.getLayoutParams();
            layoutParams.width = getResources().getDimensionPixelOffset(R.dimen.round_large_size);
            layoutParams.height = getResources().getDimensionPixelOffset(R.dimen.round_large_size);
            this.f34358t.setLayoutParams(layoutParams);
            this.f34358t.setCompoundDrawables(null, null, null, null);
            this.f34358t.setBackgroundResource(R.drawable.mygame_big_round);
            this.f34358t.setPadding(1, 0, 0, 1);
        } else {
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.f34358t.getLayoutParams();
            layoutParams2.width = getResources().getDimensionPixelOffset(R.dimen.dp70);
            layoutParams2.height = getResources().getDimensionPixelOffset(R.dimen.round_large_size);
            layoutParams2.setMargins(4, (int) TypedValue.applyDimension(1, 7.0f, getResources().getDisplayMetrics()), 0, 0);
            this.f34358t.setGravity(17);
            this.f34358t.setLayoutParams(layoutParams2);
            this.f34358t.setCompoundDrawables(null, null, null, null);
            this.f34358t.setBackgroundResource(R.drawable.message_round);
            this.f34358t.setPadding(1, 0, 2, 1);
        }
        this.f34358t.setVisibility(0);
        TextView textView = this.f34358t;
        textView.setText(i4 + "");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void updateLine(int i4) {
        if (i4 == 0) {
            stopLineAnimation();
        } else {
            startLineAnimation();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void updateNoOpenPoint() {
        stopLineAnimation();
        this.f34358t.setVisibility(8);
        this.f34358t.setText("");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void v0(int i4) {
        String str;
        if (com.join.android.app.common.utils.j.j(this.K)) {
            com.wufan.user.service.protobuf.n0 accountData = AccountUtil_.getInstance_(getApplicationContext()).getAccountData();
            this.U = accountData;
            int uid = accountData != null ? accountData.getUid() : 0;
            try {
                PackageInfo packageInfo = this.K.getPackageManager().getPackageInfo(this.K.getPackageName(), 0);
                str = packageInfo.versionCode + "_" + packageInfo.versionName;
            } catch (PackageManager.NameNotFoundException e5) {
                e5.printStackTrace();
                str = "";
            }
            RequestdetialFolowAndBeSpeak requestdetialFolowAndBeSpeak = new RequestdetialFolowAndBeSpeak();
            requestdetialFolowAndBeSpeak.setApp_ver(str);
            requestdetialFolowAndBeSpeak.setGame_id(this.M.getCrc_sign_id());
            requestdetialFolowAndBeSpeak.setUid(uid);
            requestdetialFolowAndBeSpeak.setMobile(this.U.z());
            CommonRequestBean<RequestGameIdArgs> detialFollowAnd = RequestBeanUtil.getInstance(this.K).getDetialFollowAnd(requestdetialFolowAndBeSpeak);
            ResultMainBean resultMainBean = null;
            if (i4 == 1) {
                resultMainBean = this.F.O0(detialFollowAnd);
            } else if (i4 == 2) {
                resultMainBean = this.F.D(detialFollowAnd);
            } else if (i4 == 3) {
                resultMainBean = this.F.o(detialFollowAnd);
            } else if (i4 == 4) {
                resultMainBean = this.F.d0(detialFollowAnd);
            }
            if (resultMainBean != null) {
                j2(resultMainBean, i4);
            }
        }
    }

    @UiThread
    public void w0(int i4, int i5) {
        if (i5 == 1) {
            this.S.T(i4, 1);
        } else {
            this.S.U(i4, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void y0() {
        if (this.f34339e2.size() > 0) {
            this.f34339e2.clear();
            v vVar = this.Y1;
            if (vVar != null) {
                vVar.notifyDataSetChanged();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void z0() {
        IntentUtil.getInstance().goSearchHintActivity(this.K);
        com.papa.sim.statistic.p.l(this.K).u2(Where.detial1, AccountUtil_.getInstance_(this.K).getUid());
    }
}
