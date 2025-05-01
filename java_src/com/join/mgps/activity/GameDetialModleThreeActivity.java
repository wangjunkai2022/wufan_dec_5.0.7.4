package com.join.mgps.activity;

import android.content.ClipboardManager;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.android.app.common.utils.APKUtils;
import com.join.android.app.common.utils.JsonMapper;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.AESUtils;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.Util.RequestBeanUtil;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.Util.m1;
import com.join.mgps.activity.gamedetail.GamedetailVideoMainActivity;
import com.join.mgps.activity.gamedetail.GamedetailVideoMainActivity_;
import com.join.mgps.adapter.GameDetialModleThreeAdapter;
import com.join.mgps.customview.CustomerDownloadView;
import com.join.mgps.db.tables.PurchasedListTable;
import com.join.mgps.dto.BTActivityBean;
import com.join.mgps.dto.CollectionBeanSub;
import com.join.mgps.dto.CommentAllListBean;
import com.join.mgps.dto.CommentBaseBean;
import com.join.mgps.dto.CommentPraiseBean;
import com.join.mgps.dto.CommentResponse;
import com.join.mgps.dto.CommentTokenBean;
import com.join.mgps.dto.CommonRequestBean;
import com.join.mgps.dto.ExtBean;
import com.join.mgps.dto.ForumBean;
import com.join.mgps.dto.GameDetailCloudArchive;
import com.join.mgps.dto.GamePariseRequest;
import com.join.mgps.dto.GameScore;
import com.join.mgps.dto.GamedetialModleFourBean;
import com.join.mgps.dto.GiftPackageDataInfoBean;
import com.join.mgps.dto.GiftPackageDataOperationBean;
import com.join.mgps.dto.GiftPackageOperationBean;
import com.join.mgps.dto.InformationCommentBean;
import com.join.mgps.dto.PariseBackData;
import com.join.mgps.dto.RequestCommentpraiseArgs;
import com.join.mgps.dto.RequestGameIdArgs;
import com.join.mgps.dto.RequestModel;
import com.join.mgps.dto.RequestdetialFolowAndBeSpeak;
import com.join.mgps.dto.ResponseModel;
import com.join.mgps.dto.ResultMainBean;
import com.join.mgps.dto.ServiceState;
import com.join.mgps.dto.ShareBean;
import com.join.mgps.enums.ConstantIntEnum;
import com.join.mgps.enums.Dtype;
import com.join.mgps.pref.PrefDef_;
import com.papa.sim.statistic.Where;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
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
@EFragment(R.layout.gamedetial_modle_three_activity)
/* loaded from: classes.dex */
public class GameDetialModleThreeActivity extends Fragment {
    private static final String N1 = "GameDetialModleThreeAct";
    @ViewById
    LinearLayout A;
    @ViewById
    Button B;
    @ViewById
    RelativeLayout C;
    private int C1;
    @ViewById
    SimpleDraweeView D;
    private int D1;
    @ViewById
    TextView E;
    @ViewById
    TextView E1;
    private DownloadTask F;
    @ViewById
    ImageView F1;
    com.join.mgps.rpc.e G;
    @ViewById
    ImageView G1;
    com.join.mgps.rpc.i H;
    @ViewById
    ImageView H1;
    com.join.mgps.rpc.f I;
    @ViewById
    ImageView I1;
    String J;
    @ViewById(R.id.title_normal_download_cdv)
    CustomerDownloadView J1;
    ExtBean K;
    private Animation K1;
    boolean L;
    private GameDetialModleThreeAdapter M;
    private GamedetialModleFourBean N;
    private LinearLayoutManager O;
    private com.join.mgps.customview.o P;
    private com.wufan.user.service.protobuf.n0 Q;
    private com.join.mgps.customview.o R;
    private boolean S;
    com.join.mgps.recycler.c T;
    private com.join.android.app.common.manager.b U;
    @Pref
    PrefDef_ V;
    com.join.mgps.customview.o W;
    private List<CommentBaseBean> Y;
    private String Z;

    /* renamed from: b  reason: collision with root package name */
    private GamedetailVideoMainActivity f31928b;
    @ViewById

    /* renamed from: c  reason: collision with root package name */
    TextView f31929c;
    @ViewById

    /* renamed from: d  reason: collision with root package name */
    TextView f31930d;
    @ViewById

    /* renamed from: e  reason: collision with root package name */
    ImageView f31931e;
    @ViewById

    /* renamed from: f  reason: collision with root package name */
    ImageView f31932f;
    @ViewById

    /* renamed from: g  reason: collision with root package name */
    ImageView f31933g;
    @ViewById

    /* renamed from: h  reason: collision with root package name */
    ImageView f31934h;
    @ViewById

    /* renamed from: i  reason: collision with root package name */
    ImageView f31935i;
    @ViewById

    /* renamed from: j  reason: collision with root package name */
    TextView f31936j;
    @ViewById

    /* renamed from: k  reason: collision with root package name */
    LinearLayout f31937k;
    @ViewById

    /* renamed from: l  reason: collision with root package name */
    LinearLayout f31938l;
    @ViewById

    /* renamed from: m  reason: collision with root package name */
    RecyclerView f31939m;
    @ViewById

    /* renamed from: n  reason: collision with root package name */
    TextView f31940n;
    @ViewById

    /* renamed from: o  reason: collision with root package name */
    RelativeLayout f31941o;
    @ViewById

    /* renamed from: p  reason: collision with root package name */
    RelativeLayout f31942p;

    /* renamed from: p0  reason: collision with root package name */
    private GameScore f31943p0;
    @ViewById

    /* renamed from: q  reason: collision with root package name */
    ImageView f31945q;
    @ViewById

    /* renamed from: r  reason: collision with root package name */
    TextView f31946r;
    @ViewById

    /* renamed from: s  reason: collision with root package name */
    ProgressBar f31947s;
    @ViewById

    /* renamed from: t  reason: collision with root package name */
    LinearLayout f31948t;
    @ViewById

    /* renamed from: u  reason: collision with root package name */
    RelativeLayout f31949u;
    @ViewById

    /* renamed from: v  reason: collision with root package name */
    RelativeLayout f31950v;
    @ViewById

    /* renamed from: w  reason: collision with root package name */
    RelativeLayout f31952w;
    @ViewById

    /* renamed from: x  reason: collision with root package name */
    ImageView f31953x;
    @ViewById

    /* renamed from: y  reason: collision with root package name */
    ImageView f31954y;
    @ViewById

    /* renamed from: z  reason: collision with root package name */
    LinearLayout f31955z;
    boolean X = false;

    /* renamed from: p1  reason: collision with root package name */
    private CommentAllListBean.SelfCommentBean f31944p1 = null;

    /* renamed from: v1  reason: collision with root package name */
    private boolean f31951v1 = true;
    Map<String, DownloadTask> A1 = new HashMap();
    Map<String, DownloadTask> B1 = new HashMap();
    com.join.mgps.customview.o L1 = null;
    com.join.mgps.customview.o M1 = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ GiftPackageDataInfoBean f31956b;

        a(GiftPackageDataInfoBean giftPackageDataInfoBean) {
            this.f31956b = giftPackageDataInfoBean;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ((ClipboardManager) GameDetialModleThreeActivity.this.f31928b.getSystemService("clipboard")).setText(this.f31956b.getGift_package_code());
            com.join.mgps.Util.l2 a5 = com.join.mgps.Util.l2.a(GameDetialModleThreeActivity.this.f31928b);
            a5.b(this.f31956b.getGift_package_code() + "已复制到剪贴板");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (GameDetialModleThreeActivity.this.R == null || !GameDetialModleThreeActivity.this.R.isShowing()) {
                return;
            }
            GameDetialModleThreeActivity.this.R.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DownloadTask F;
            if (GameDetialModleThreeActivity.this.R != null && GameDetialModleThreeActivity.this.R.isShowing()) {
                GameDetialModleThreeActivity.this.R.dismiss();
            }
            int status = GameDetialModleThreeActivity.this.F != null ? GameDetialModleThreeActivity.this.F.getStatus() : 0;
            if (GameDetialModleThreeActivity.this.N != null && UtilsMy.w0(GameDetialModleThreeActivity.this.N.getPay_tag_info(), GameDetialModleThreeActivity.this.N.getCrc_sign_id()) > 0) {
                status = 43;
            }
            if (status != 0) {
                if (status == 5) {
                    UtilsMy.W3(GameDetialModleThreeActivity.this.f31928b, GameDetialModleThreeActivity.this.F, "2");
                    return;
                } else if (status != 9 && status != 43) {
                    return;
                }
            }
            GameDetialModleThreeActivity.this.F.setKeyword(Where.detail.name());
            if (com.join.mgps.Util.g2.i(GameDetialModleThreeActivity.this.F.getCrc_link_type_val()) && (F = p1.f.K().F(GameDetialModleThreeActivity.this.F.getCrc_link_type_val())) != null) {
                UtilsMy.y4(GameDetialModleThreeActivity.this.F, F);
            }
            GameDetialModleThreeActivity gameDetialModleThreeActivity = GameDetialModleThreeActivity.this;
            gameDetialModleThreeActivity.addFrom(gameDetialModleThreeActivity.F);
            if (GameDetialModleThreeActivity.this.N != null) {
                if (UtilsMy.y0(GameDetialModleThreeActivity.this.N.getPay_tag_info(), GameDetialModleThreeActivity.this.N.getCrc_sign_id()) <= 0) {
                    UtilsMy.C1(GameDetialModleThreeActivity.this.F, GameDetialModleThreeActivity.this.N);
                    if (!UtilsMy.o1(GameDetialModleThreeActivity.this.f31928b, GameDetialModleThreeActivity.this.F)) {
                        if (GameDetialModleThreeActivity.this.N.getDown_status() == 5) {
                            UtilsMy.l1(GameDetialModleThreeActivity.this.f31928b, GameDetialModleThreeActivity.this.F);
                        } else {
                            UtilsMy.R0(GameDetialModleThreeActivity.this.f31928b, GameDetialModleThreeActivity.this.F, GameDetialModleThreeActivity.this.N.getTp_down_url(), GameDetialModleThreeActivity.this.N.getOther_down_switch(), GameDetialModleThreeActivity.this.N.getCdn_down_switch());
                        }
                    }
                } else {
                    ExtBean extBean = GameDetialModleThreeActivity.this.K;
                    if (extBean == null || !"checkgame".equals(extBean.getFrom())) {
                        if (!UtilsMy.o1(GameDetialModleThreeActivity.this.f31928b, GameDetialModleThreeActivity.this.F)) {
                            if (GameDetialModleThreeActivity.this.N.getDown_status() == 5) {
                                UtilsMy.l1(GameDetialModleThreeActivity.this.f31928b, GameDetialModleThreeActivity.this.F);
                            } else {
                                UtilsMy.d4(GameDetialModleThreeActivity.this.f31928b, GameDetialModleThreeActivity.this.J);
                            }
                        }
                    } else {
                        GamedetailVideoMainActivity gamedetailVideoMainActivity = GameDetialModleThreeActivity.this.f31928b;
                        GameDetialModleThreeActivity gameDetialModleThreeActivity2 = GameDetialModleThreeActivity.this;
                        UtilsMy.e4(gamedetailVideoMainActivity, gameDetialModleThreeActivity2.J, gameDetialModleThreeActivity2.K.getFrom_id());
                    }
                }
            }
            GameDetialModleThreeActivity.this.F.setStatus(2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class d implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ GiftPackageDataOperationBean f31960b;

        d(GiftPackageDataOperationBean giftPackageDataOperationBean) {
            this.f31960b = giftPackageDataOperationBean;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ((ClipboardManager) GameDetialModleThreeActivity.this.f31928b.getSystemService("clipboard")).setText(this.f31960b.getGift_info().getGift_package_code());
            com.join.mgps.Util.l2 a5 = com.join.mgps.Util.l2.a(GameDetialModleThreeActivity.this.f31928b);
            a5.b(this.f31960b.getGift_info().getGift_package_code() + "已复制到剪贴板");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class e implements View.OnClickListener {
        e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (GameDetialModleThreeActivity.this.R == null || !GameDetialModleThreeActivity.this.R.isShowing()) {
                return;
            }
            GameDetialModleThreeActivity.this.R.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class f implements View.OnClickListener {
        f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DownloadTask F;
            if (GameDetialModleThreeActivity.this.R != null && GameDetialModleThreeActivity.this.R.isShowing()) {
                GameDetialModleThreeActivity.this.R.dismiss();
            }
            int status = GameDetialModleThreeActivity.this.F != null ? GameDetialModleThreeActivity.this.F.getStatus() : 0;
            if (GameDetialModleThreeActivity.this.N != null && UtilsMy.w0(GameDetialModleThreeActivity.this.N.getPay_tag_info(), GameDetialModleThreeActivity.this.N.getCrc_sign_id()) > 0) {
                status = 43;
            }
            if (status != 0) {
                if (status == 5) {
                    UtilsMy.W3(GameDetialModleThreeActivity.this.f31928b, GameDetialModleThreeActivity.this.F, "2");
                    return;
                } else if (status != 9 && status != 43) {
                    return;
                }
            }
            if (GameDetialModleThreeActivity.this.N.getDown_status() == 2) {
                return;
            }
            if (com.join.mgps.Util.g2.i(GameDetialModleThreeActivity.this.F.getCrc_link_type_val()) && (F = p1.f.K().F(GameDetialModleThreeActivity.this.F.getCrc_link_type_val())) != null) {
                UtilsMy.y4(GameDetialModleThreeActivity.this.F, F);
            }
            GameDetialModleThreeActivity.this.F.setKeyword(Where.detail.name());
            if (GameDetialModleThreeActivity.this.N != null) {
                if (UtilsMy.y0(GameDetialModleThreeActivity.this.N.getPay_tag_info(), GameDetialModleThreeActivity.this.N.getCrc_sign_id()) > 0) {
                    UtilsMy.d4(GameDetialModleThreeActivity.this.f31928b, GameDetialModleThreeActivity.this.J);
                } else {
                    GameDetialModleThreeActivity gameDetialModleThreeActivity = GameDetialModleThreeActivity.this;
                    gameDetialModleThreeActivity.addFrom(gameDetialModleThreeActivity.F);
                    UtilsMy.C1(GameDetialModleThreeActivity.this.F, GameDetialModleThreeActivity.this.N);
                    if (!UtilsMy.o1(GameDetialModleThreeActivity.this.f31928b, GameDetialModleThreeActivity.this.F)) {
                        if (GameDetialModleThreeActivity.this.N.getDown_status() == 5) {
                            UtilsMy.l1(GameDetialModleThreeActivity.this.f31928b, GameDetialModleThreeActivity.this.F);
                        } else {
                            UtilsMy.R0(GameDetialModleThreeActivity.this.f31928b, GameDetialModleThreeActivity.this.F, GameDetialModleThreeActivity.this.N.getTp_down_url(), GameDetialModleThreeActivity.this.N.getOther_down_switch(), GameDetialModleThreeActivity.this.N.getCdn_down_switch());
                        }
                    }
                }
            }
            GameDetialModleThreeActivity.this.F.setStatus(2);
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
    public class h implements GameDetialModleThreeAdapter.c1 {
        h() {
        }

        @Override // com.join.mgps.adapter.GameDetialModleThreeAdapter.c1
        public void a(InformationCommentBean informationCommentBean) {
            if (IntentUtil.getInstance().goLoginInteractive(GameDetialModleThreeActivity.this.f31928b)) {
                return;
            }
            GameDetialModleThreeActivity.this.A0(informationCommentBean);
        }

        @Override // com.join.mgps.adapter.GameDetialModleThreeAdapter.c1
        public void b(CommentBaseBean commentBaseBean, int i4, int i5) {
            GameDetialModleThreeActivity.this.w0(commentBaseBean, i4, i5);
        }

        @Override // com.join.mgps.adapter.GameDetialModleThreeAdapter.c1
        public void c(CommentBaseBean commentBaseBean, int i4, int i5) {
            GameDetialModleThreeActivity.this.y0(commentBaseBean, i4, i5);
        }

        @Override // com.join.mgps.adapter.GameDetialModleThreeAdapter.c1
        public void d(CommentBaseBean commentBaseBean) {
            GameDetialModleThreeActivity.this.x0(commentBaseBean);
        }

        @Override // com.join.mgps.adapter.GameDetialModleThreeAdapter.c1
        public void e(InformationCommentBean.Sub sub) {
            InformationCommentBean informationCommentBean = new InformationCommentBean();
            informationCommentBean.setUser_name(sub.getUser_name());
            informationCommentBean.setComment_id(sub.getUser_id());
            informationCommentBean.setUser_id(sub.getUser_id());
            if (GameDetialModleThreeActivity.this.N != null) {
                GameCommentActivity_.U0(GameDetialModleThreeActivity.this.f31928b).a(GameDetialModleThreeActivity.this.N.getCrc_sign_id()).d(true).b(informationCommentBean).start();
            }
        }

        @Override // com.join.mgps.adapter.GameDetialModleThreeAdapter.c1
        public void f(InformationCommentBean informationCommentBean) {
            if (GameDetialModleThreeActivity.this.N != null) {
                GameCommentActivity_.U0(GameDetialModleThreeActivity.this.f31928b).a(GameDetialModleThreeActivity.this.N.getCrc_sign_id()).d(true).b(informationCommentBean).start();
            }
        }

        @Override // com.join.mgps.adapter.GameDetialModleThreeAdapter.c1
        public void g() {
        }

        @Override // com.join.mgps.adapter.GameDetialModleThreeAdapter.c1
        public void h() {
        }

        @Override // com.join.mgps.adapter.GameDetialModleThreeAdapter.c1
        public void i() {
            GameDetialModleThreeActivity.this.k0();
        }

        @Override // com.join.mgps.adapter.GameDetialModleThreeAdapter.c1
        public void j() {
            ForumBean.ForumPostsBean forumPostsBean = new ForumBean.ForumPostsBean();
            forumPostsBean.setPid((int) GameDetialModleThreeActivity.this.N.getForum_id());
            com.join.mgps.Util.j0.v0(GameDetialModleThreeActivity.this.f31928b, forumPostsBean);
        }

        @Override // com.join.mgps.adapter.GameDetialModleThreeAdapter.c1
        public void k() {
            if (GameDetialModleThreeActivity.this.N.getGame_book() == 1 || IntentUtil.getInstance().goLoginNetGame(GameDetialModleThreeActivity.this.f31928b)) {
                return;
            }
            GameDetialModleThreeActivity.this.changeGameFollow(4);
        }

        @Override // com.join.mgps.adapter.GameDetialModleThreeAdapter.c1
        public void l(boolean z4, GiftPackageDataInfoBean giftPackageDataInfoBean) {
            if (IntentUtil.getInstance().goLoginNetGame(GameDetialModleThreeActivity.this.f31928b)) {
                return;
            }
            if (z4) {
                if (GameDetialModleThreeActivity.this.e0(giftPackageDataInfoBean.getGift_package_type())) {
                    GameDetialModleThreeActivity.this.p0(giftPackageDataInfoBean);
                    return;
                }
                return;
            }
            GameDetialModleThreeActivity.this.L0(giftPackageDataInfoBean);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class i implements View.OnClickListener {
        i() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GameDetialModleThreeActivity.this.F0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class j implements View.OnClickListener {
        j() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GameDetialModleThreeActivity.this.F0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class k implements m1.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f31968a;

        k(boolean z4) {
            this.f31968a = z4;
        }

        @Override // com.join.mgps.Util.m1.b
        public void a(m1.c cVar) {
            if (cVar.a() == 1) {
                GameDetialModleThreeActivity.this.f31928b.finish();
                com.join.mgps.Util.m1.c().e(GameDetialModleThreeActivity.this.f31928b, GameDetialModleThreeActivity.this.K.getFrom_id(), cVar.b());
                com.join.mgps.Util.l2.a(GameDetialModleThreeActivity.this.f31928b).b("授权成功");
            } else if (this.f31968a) {
                GameDetialModleThreeActivity.this.X0(false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class l implements CompoundButton.OnCheckedChangeListener {
        l() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z4) {
            GameDetialModleThreeActivity.this.V.noFavoriteTips().g(Boolean.valueOf(z4));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class m implements View.OnClickListener {
        m() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            com.join.mgps.customview.o oVar = GameDetialModleThreeActivity.this.W;
            if (oVar != null && oVar.isShowing()) {
                GameDetialModleThreeActivity.this.W.dismiss();
            }
            GameDetialModleThreeActivity.this.j0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class n implements View.OnClickListener {
        n() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GameDetialModleThreeActivity.this.I0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class o implements View.OnClickListener {
        o() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GameDetialModleThreeActivity.this.K0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class p implements w1.c {
        p() {
        }

        @Override // w1.c
        public void onClickCancle() {
        }

        @Override // w1.c
        public void onClickOk() {
        }
    }

    private void C0() {
        this.M.notifyDataSetChanged();
    }

    private void G0(List<GameDetialModleThreeAdapter.b1> list) {
        GamedetialModleFourBean gamedetialModleFourBean = this.N;
        if (gamedetialModleFourBean == null || gamedetialModleFourBean.getComment_switch() != 1) {
            return;
        }
        for (int i4 = 0; this.N.getCommitDataBeanList() != null && i4 < this.N.getCommitDataBeanList().size(); i4++) {
            GameDetialModleThreeAdapter gameDetialModleThreeAdapter = this.M;
            Objects.requireNonNull(gameDetialModleThreeAdapter);
            list.add(new GameDetialModleThreeAdapter.b1(this.N.getCommitDataBeanList().get(i4), 25));
            if (i4 == 0) {
                GameDetialModleThreeAdapter gameDetialModleThreeAdapter2 = this.M;
                Objects.requireNonNull(gameDetialModleThreeAdapter2);
                list.add(new GameDetialModleThreeAdapter.b1("", 27));
            }
        }
        GameDetialModleThreeAdapter gameDetialModleThreeAdapter3 = this.M;
        Objects.requireNonNull(gameDetialModleThreeAdapter3);
        list.add(new GameDetialModleThreeAdapter.b1("评论底部", 16));
    }

    private void H0(InformationCommentBean informationCommentBean, List<GameDetialModleThreeAdapter.b1> list) {
        List<InformationCommentBean.Sub> sub = informationCommentBean.getSub();
        if (sub == null || sub.size() <= 0) {
            return;
        }
        GameDetialModleThreeAdapter gameDetialModleThreeAdapter = this.M;
        Objects.requireNonNull(gameDetialModleThreeAdapter);
        list.add(new GameDetialModleThreeAdapter.b1(new GameDetialModleThreeAdapter.d1(informationCommentBean.getComment_id(), informationCommentBean, 0, true), 15));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean e0(String str) {
        if (com.join.mgps.Util.g2.h(str)) {
            com.join.mgps.Util.l2.a(this.f31928b).b(this.f31928b.getString(R.string.unknow_gift_type));
            return false;
        }
        com.wufan.user.service.protobuf.n0 accountData = AccountUtil_.getInstance_(this.f31928b).getAccountData();
        if (str.equals("6")) {
            if (!com.join.mgps.Util.b.piv(accountData)) {
                O0();
                return false;
            }
        } else if (str.equals("7") && accountData.j1() <= 0) {
            N0();
            return false;
        }
        return true;
    }

    private void f0() {
        com.join.mgps.customview.o oVar = this.L1;
        if (oVar == null || !oVar.isShowing()) {
            return;
        }
        this.L1.dismiss();
    }

    private void g0() {
        com.join.mgps.customview.o oVar = this.M1;
        if (oVar == null || !oVar.isShowing()) {
            return;
        }
        this.M1.dismiss();
    }

    public static GameDetialModleThreeActivity_ t0(String str, boolean z4, ExtBean extBean) {
        Bundle bundle = new Bundle();
        bundle.putString("gameId", str);
        bundle.putBoolean(GamedetailVideoMainActivity_.AUTODOWN_EXTRA, z4);
        bundle.putSerializable("extBean", extBean);
        GameDetialModleThreeActivity_ gameDetialModleThreeActivity_ = new GameDetialModleThreeActivity_();
        gameDetialModleThreeActivity_.setArguments(bundle);
        return gameDetialModleThreeActivity_;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void A0(InformationCommentBean informationCommentBean) {
        if (com.join.android.app.common.utils.j.j(this.f31928b)) {
            try {
                GamePariseRequest gamePariseRequest = new GamePariseRequest();
                gamePariseRequest.setGame_id(this.J);
                gamePariseRequest.setComment_id(informationCommentBean.getComment_id() + "");
                gamePariseRequest.setUid(this.Q.getUid());
                ResultMainBean<List<PariseBackData>> b5 = this.G.b(RequestBeanUtil.getInstance(this.f31928b).getGameDetailParis(gamePariseRequest));
                if (b5 != null && b5.getFlag() == 1) {
                    List<PariseBackData> data = b5.getMessages().getData();
                    if (data.size() > 0) {
                        if (data.get(0).isVal()) {
                            for (CommentBaseBean commentBaseBean : this.Y) {
                            }
                            T0();
                            return;
                        }
                        showToast("你已赞过");
                        return;
                    }
                    showToast("你已赞过");
                    return;
                }
                v0();
                showToast("点赞失败");
                return;
            } catch (Exception e5) {
                e5.printStackTrace();
                v0();
                showToast("点赞失败");
                return;
            }
        }
        showToast("没有网络");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Receiver(actions = {o1.a.B})
    public void B0(Intent intent) {
        this.Q = AccountUtil_.getInstance_(this.f31928b).getAccountData();
        o0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void D0(String str, boolean z4, int i4, int i5) {
        com.join.mgps.Util.l2.a(this.f31928b).b(str);
        if (z4) {
            if (i5 == 1) {
                this.M.G(i4, 0);
            } else {
                this.M.F(i4, 0);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void E0(CommentResponse commentResponse) {
        if (commentResponse.getCode() == 801) {
            r0();
            com.join.mgps.Util.l2.a(this.f31928b).b("数据访问失败，请稍候再试！");
            return;
        }
        com.join.mgps.Util.l2.a(this.f31928b).b(commentResponse.getMsg());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void F0() {
        IntentUtil.getInstance().goSearchHintActivity(this.f31928b);
        com.papa.sim.statistic.p.l(this.f31928b).u2(Where.detial2, AccountUtil_.getInstance_(this.f31928b).getUid());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void I0() {
        ShareBean shareBean = new ShareBean();
        String share_url = this.N.getShare_url();
        shareBean.setqZoneShareUrl(share_url);
        shareBean.setQqUrl(share_url);
        shareBean.setWechatFriendUrl(share_url);
        shareBean.setWechatShareUrl(share_url);
        shareBean.setWeiboShareUrl(share_url);
        shareBean.setTitle(this.N.getGame_name());
        shareBean.setText(this.N.getInfo());
        shareBean.setImageUrl(this.N.getIco_remote());
        shareBean.setFrom(2);
        shareBean.setGameId(this.N.getGame_id());
        if (this.N.getShare_config() != null && this.N.getShare_config().getShare_switch() == 1) {
            shareBean.setIntentData(this.N.getShare_config().getJump_info());
        }
        com.join.mgps.Util.s.r(this.f31928b, shareBean);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void J0() {
        ShareBean shareBean = new ShareBean();
        String share_url = this.N.getShare_url();
        shareBean.setqZoneShareUrl(share_url);
        shareBean.setQqUrl(share_url);
        shareBean.setWechatFriendUrl(share_url);
        shareBean.setWechatShareUrl(share_url);
        shareBean.setWeiboShareUrl(share_url);
        shareBean.setImageUrl(this.N.getIco_remote());
        shareBean.setTitle(this.N.getGame_name());
        shareBean.setText(this.N.getInfo());
        shareBean.setFrom(2);
        shareBean.setGameId(this.N.getGame_id());
        if (this.N.getShare_config() != null && this.N.getShare_config().getShare_switch() == 1) {
            shareBean.setIntentData(this.N.getShare_config().getJump_info());
        }
        com.join.mgps.Util.s.r(this.f31928b, shareBean);
    }

    void K0() {
        ShareBean shareBean = new ShareBean();
        String str = this.N.getActivity_entry().getUrl() + this.N.getCrc_sign_id();
        shareBean.setqZoneShareUrl(str);
        shareBean.setQqUrl(str);
        shareBean.setWechatFriendUrl(str);
        shareBean.setWechatShareUrl(str);
        shareBean.setWeiboShareUrl(str);
        shareBean.setTitle(this.N.getGame_name());
        shareBean.setText(this.N.getInfo());
        shareBean.setImageUrl(this.N.getIco_remote());
        shareBean.setFrom(2);
        shareBean.setGameId(this.N.getGame_id());
        com.join.mgps.Util.s.r(this.f31928b, shareBean);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:28:0x013a A[Catch: Exception -> 0x015b, TryCatch #0 {Exception -> 0x015b, blocks: (B:3:0x0002, B:5:0x0009, B:7:0x000f, B:8:0x0017, B:10:0x00c8, B:12:0x00ce, B:21:0x00ef, B:26:0x0131, B:28:0x013a, B:29:0x0142, B:31:0x014e, B:34:0x0155, B:22:0x00f5, B:23:0x00fb, B:25:0x0102), top: B:39:0x0002 }] */
    @org.androidannotations.annotations.UiThread
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void L0(com.join.mgps.dto.GiftPackageDataInfoBean r12) {
        /*
            Method dump skipped, instructions count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.mgps.activity.GameDetialModleThreeActivity.L0(com.join.mgps.dto.GiftPackageDataInfoBean):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void M0(GiftPackageDataOperationBean giftPackageDataOperationBean) {
        com.join.mgps.customview.o oVar;
        com.join.mgps.customview.o oVar2 = this.R;
        if (oVar2 != null && oVar2.isShowing()) {
            this.R.dismiss();
            this.R = null;
        }
        com.join.mgps.customview.o oVar3 = new com.join.mgps.customview.o(this.f31928b, R.style.MyDialog);
        this.R = oVar3;
        oVar3.setContentView(R.layout.save_code_dialog);
        Button button = (Button) this.R.findViewById(R.id.dialog_button_cancle);
        Button button2 = (Button) this.R.findViewById(R.id.dialog_button_ok);
        TextView textView = (TextView) this.R.findViewById(R.id.moneyText);
        ((TextView) this.R.findViewById(R.id.tip_title)).setText("领号成功");
        ((TextView) this.R.findViewById(R.id.saveCodeContent)).setText(giftPackageDataOperationBean.getGift_info().getGift_package_code());
        button2.setText("关闭");
        button.setText("下载游戏");
        ((TextView) this.R.findViewById(R.id.saveCodeTv)).setOnClickListener(new d(giftPackageDataOperationBean));
        button2.setOnClickListener(new e());
        if (this.N.getDown_status() == 2) {
            button.setEnabled(false);
            button.setText("即将开放");
        }
        DownloadTask downloadTask = this.F;
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
            button.setOnClickListener(new f());
            C0();
            oVar = this.R;
            if (oVar != null || oVar.isShowing()) {
            }
            this.R.show();
            return;
        }
        button.setText("下载游戏");
        if (giftPackageDataOperationBean.getGame_info() != null) {
            UtilsMy.w0(giftPackageDataOperationBean.getGame_info().getPay_tag_info(), giftPackageDataOperationBean.getGame_info().getCrc_sign_id());
            UtilsMy.r3(button, giftPackageDataOperationBean.getGame_info().getDown_status(), giftPackageDataOperationBean.getGame_info().getPay_tag_info(), giftPackageDataOperationBean.getGame_info().getCrc_sign_id());
            UtilsMy.k3(giftPackageDataOperationBean.getGame_info().getSp_tag_info(), textView);
        }
        button.setOnClickListener(new f());
        C0();
        oVar = this.R;
        if (oVar != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void N0() {
        com.join.mgps.customview.o oVar = this.L1;
        if (oVar != null) {
            if (oVar.isShowing()) {
                return;
            }
        } else {
            this.L1 = com.join.mgps.Util.b0.f0(this.f31928b).c0(this.f31928b);
        }
        this.L1.show();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void O0() {
        com.join.mgps.customview.o oVar = this.M1;
        if (oVar != null) {
            if (oVar.isShowing()) {
                return;
            }
        } else {
            this.M1 = com.join.mgps.Util.b0.f0(this.f31928b).e0(this.f31928b);
        }
        this.M1.show();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread(delay = 4000)
    public void P0() {
        GameDetialModleThreeAdapter gameDetialModleThreeAdapter = this.M;
        if (gameDetialModleThreeAdapter != null && gameDetialModleThreeAdapter.s() != null) {
            com.join.mgps.Util.c.g(this.M.s());
        }
        P0();
    }

    void Q0() {
        ImageView imageView = this.F1;
        if (imageView == null) {
            return;
        }
        imageView.setImageResource(R.drawable.line_blue_bg);
        Animation loadAnimation = AnimationUtils.loadAnimation(this.f31928b, R.anim.img_translate);
        this.K1 = loadAnimation;
        loadAnimation.setFillAfter(true);
        this.I1.setVisibility(0);
        this.I1.startAnimation(this.K1);
        this.K1.setAnimationListener(new g());
    }

    void R0() {
        ImageView imageView = this.I1;
        if (imageView != null) {
            imageView.clearAnimation();
            this.I1.setVisibility(8);
            this.F1.setImageResource(R.drawable.line_white_bg);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void S0() {
        IntentUtil.getInstance().goMyGameManagerActivity(this.f31928b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void T0() {
        if (this.N.getGame_id() != null) {
            Y0(this.N);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void U0(int i4) {
        try {
            if (i4 < 100) {
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.E1.getLayoutParams();
                layoutParams.width = getResources().getDimensionPixelOffset(R.dimen.wdp24);
                layoutParams.height = getResources().getDimensionPixelOffset(R.dimen.wdp24);
                this.E1.setLayoutParams(layoutParams);
                this.E1.setCompoundDrawables(null, null, null, null);
                this.E1.setBackgroundResource(R.drawable.mygame_big_round);
                this.E1.setPadding(1, 0, 0, 1);
            } else {
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.E1.getLayoutParams();
                layoutParams2.width = getResources().getDimensionPixelOffset(R.dimen.dp70);
                layoutParams2.height = getResources().getDimensionPixelOffset(R.dimen.round_large_size);
                layoutParams2.setMargins(4, (int) TypedValue.applyDimension(1, 7.0f, getResources().getDisplayMetrics()), 0, 0);
                this.E1.setGravity(17);
                this.E1.setLayoutParams(layoutParams2);
                this.E1.setCompoundDrawables(null, null, null, null);
                this.E1.setBackgroundResource(R.drawable.message_round);
                this.E1.setPadding(1, 0, 2, 1);
            }
            this.E1.setVisibility(0);
            TextView textView = this.E1;
            textView.setText(i4 + "");
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void V0(int i4) {
        if (i4 == 0) {
            R0();
        } else {
            Q0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void W0() {
        R0();
        TextView textView = this.E1;
        if (textView != null) {
            textView.setVisibility(8);
            this.E1.setText("");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread(delay = 1000)
    public void X0(boolean z4) {
        ExtBean extBean = this.K;
        if (extBean == null || !"checkgame".equals(extBean.getFrom())) {
            return;
        }
        com.join.mgps.Util.m1.c().b(this.f31928b, this.K.getFrom_id(), new k(z4));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void Y0(GamedetialModleFourBean gamedetialModleFourBean) {
        List<GiftPackageDataInfoBean> game_gift_package;
        try {
            LinearLayout linearLayout = this.A;
            if (linearLayout != null) {
                linearLayout.setVisibility(8);
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        if (gamedetialModleFourBean == null) {
            return;
        }
        LinearLayout linearLayout2 = this.f31955z;
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(8);
        }
        this.N = gamedetialModleFourBean;
        if (this.L && p1.f.K().F(this.J) == null) {
            com.php25.PDownload.d.c(gamedetialModleFourBean.getDownloadtaskDown(), this.f31928b);
        }
        if (gamedetialModleFourBean.getShare_config() != null && gamedetialModleFourBean.getShare_config().getShare_switch() == 1) {
            this.f31938l.setVisibility(0);
            MyImageLoader.d(this.D, R.drawable.user_gift, "");
            this.f31938l.setOnClickListener(new n());
        } else {
            this.f31938l.setVisibility(8);
        }
        if (gamedetialModleFourBean.getActivity_entry() != null) {
            this.f31938l.setVisibility(0);
            MyImageLoader.h(this.D, gamedetialModleFourBean.getActivity_entry().getPic());
            this.E.setText(gamedetialModleFourBean.getActivity_entry().getTitle());
            this.f31938l.setOnClickListener(new o());
        } else {
            this.f31938l.setVisibility(8);
        }
        GamedetialModleFourBean gamedetialModleFourBean2 = this.N;
        if (gamedetialModleFourBean2 != null) {
            if (gamedetialModleFourBean2.getGame_follow() == 1) {
                this.f31935i.setImageResource(R.drawable.followed_image);
                this.f31936j.setText("已收藏");
            } else {
                this.f31935i.setImageResource(R.drawable.follow_none_image);
                this.f31936j.setText("收藏");
            }
        }
        DownloadTask F = p1.f.K().F(this.J);
        this.F = F;
        if (F == null) {
            this.F = this.N.getDownloadtaskDown();
            if (UtilsMy.o0(this.N.getTag_info())) {
                this.F.setFileType(Dtype.android.name());
                if (com.join.android.app.common.utils.e.l0(this.f31928b).d(this.f31928b, this.N.getPackageName())) {
                    APKUtils.a l4 = com.join.android.app.common.utils.e.l0(this.f31928b).l(this.f31928b, this.N.getPackageName());
                    if (com.join.mgps.Util.g2.i(this.N.getVer()) && l4.d() < Integer.parseInt(this.N.getVer())) {
                        this.F.setStatus(9);
                    } else {
                        this.F.setStatus(5);
                    }
                } else {
                    this.F.setStatus(0);
                }
            } else {
                this.F.setStatus(0);
            }
        } else {
            F.setDownloadType(0);
            this.F.setScreenshot_pic(this.N.getScreenshot_pic());
        }
        if (("" + this.N.getPlugin_num()).equals("" + ConstantIntEnum.H5.value())) {
            GamedetialModleFourBean gamedetialModleFourBean3 = this.N;
            gamedetialModleFourBean3.setDown_count(gamedetialModleFourBean3.getStart_count());
        }
        updateButn();
        try {
            List<CommentBaseBean> list = this.Y;
            if (list != null) {
                this.N.setCommitDataBeanList(list);
            }
            this.N.setSelf_comment(this.f31944p1);
            this.N.setGame_comment_count(this.Z);
            this.N.setGame_score(this.f31943p0);
            this.M.I(gamedetialModleFourBean);
            List<GameDetialModleThreeAdapter.b1> x4 = this.M.x();
            x4.clear();
            if (this.N.getBt_game_switch() == 1) {
                if (this.N.getBt_game_coupon_count() > 0) {
                    GameDetialModleThreeAdapter gameDetialModleThreeAdapter = this.M;
                    Objects.requireNonNull(gameDetialModleThreeAdapter);
                    x4.add(new GameDetialModleThreeAdapter.b1(Integer.valueOf(this.N.getBt_game_coupon_count()), 36));
                }
                String game_exclusive_benefits = this.N.getGame_exclusive_benefits();
                if (com.join.mgps.Util.g2.i(game_exclusive_benefits)) {
                    GameDetialModleThreeAdapter gameDetialModleThreeAdapter2 = this.M;
                    Objects.requireNonNull(gameDetialModleThreeAdapter2);
                    x4.add(new GameDetialModleThreeAdapter.b1("专属福利", 1));
                    GameDetialModleThreeAdapter gameDetialModleThreeAdapter3 = this.M;
                    Objects.requireNonNull(gameDetialModleThreeAdapter3);
                    x4.add(new GameDetialModleThreeAdapter.b1(game_exclusive_benefits, 8));
                }
                String game_buy_rebate = this.N.getGame_buy_rebate();
                if (com.join.mgps.Util.g2.i(game_exclusive_benefits)) {
                    GameDetialModleThreeAdapter gameDetialModleThreeAdapter4 = this.M;
                    Objects.requireNonNull(gameDetialModleThreeAdapter4);
                    x4.add(new GameDetialModleThreeAdapter.b1("充值返利", 1));
                    GameDetialModleThreeAdapter gameDetialModleThreeAdapter5 = this.M;
                    Objects.requireNonNull(gameDetialModleThreeAdapter5);
                    x4.add(new GameDetialModleThreeAdapter.b1(game_buy_rebate, 8));
                }
                List<BTActivityBean> activities = this.N.getActivities();
                if (activities != null && activities.size() > 0) {
                    GameDetialModleThreeAdapter gameDetialModleThreeAdapter6 = this.M;
                    Objects.requireNonNull(gameDetialModleThreeAdapter6);
                    x4.add(new GameDetialModleThreeAdapter.b1("活动公告", 1));
                    for (BTActivityBean bTActivityBean : activities) {
                        GameDetialModleThreeAdapter gameDetialModleThreeAdapter7 = this.M;
                        Objects.requireNonNull(gameDetialModleThreeAdapter7);
                        x4.add(new GameDetialModleThreeAdapter.b1(bTActivityBean, 38));
                    }
                }
                List<ServiceState> game_server_state = this.N.getGame_server_state();
                if (game_server_state != null && game_server_state.size() > 0) {
                    GameDetialModleThreeAdapter gameDetialModleThreeAdapter8 = this.M;
                    Objects.requireNonNull(gameDetialModleThreeAdapter8);
                    x4.add(new GameDetialModleThreeAdapter.b1("开合服", 1));
                    int i4 = 0;
                    for (ServiceState serviceState : game_server_state) {
                        i4++;
                        if (i4 <= 3) {
                            GameDetialModleThreeAdapter gameDetialModleThreeAdapter9 = this.M;
                            Objects.requireNonNull(gameDetialModleThreeAdapter9);
                            x4.add(new GameDetialModleThreeAdapter.b1(serviceState, 37));
                        }
                    }
                }
                List<GiftPackageDataInfoBean> game_gift_package2 = this.N.getGame_gift_package();
                if (game_gift_package2 != null && game_gift_package2.size() > 0) {
                    GameDetialModleThreeAdapter gameDetialModleThreeAdapter10 = this.M;
                    Objects.requireNonNull(gameDetialModleThreeAdapter10);
                    x4.add(new GameDetialModleThreeAdapter.b1("福利礼包", 1));
                    for (GiftPackageDataInfoBean giftPackageDataInfoBean : game_gift_package2) {
                        GameDetialModleThreeAdapter gameDetialModleThreeAdapter11 = this.M;
                        Objects.requireNonNull(gameDetialModleThreeAdapter11);
                        x4.add(new GameDetialModleThreeAdapter.b1(giftPackageDataInfoBean, 9));
                    }
                }
            }
            if (this.N.getBespeak_switch() == 1) {
                GameDetialModleThreeAdapter gameDetialModleThreeAdapter12 = this.M;
                Objects.requireNonNull(gameDetialModleThreeAdapter12);
                x4.add(new GameDetialModleThreeAdapter.b1(null, 3));
            }
            if (com.join.mgps.Util.g2.i(gamedetialModleFourBean.getDev_info())) {
                GameDetialModleThreeAdapter gameDetialModleThreeAdapter13 = this.M;
                Objects.requireNonNull(gameDetialModleThreeAdapter13);
                x4.add(new GameDetialModleThreeAdapter.b1("开发者的话", 1));
                GameDetialModleThreeAdapter gameDetialModleThreeAdapter14 = this.M;
                Objects.requireNonNull(gameDetialModleThreeAdapter14);
                x4.add(new GameDetialModleThreeAdapter.b1(gamedetialModleFourBean.getDev_info(), 7));
            }
            if (com.join.mgps.Util.g2.i(gamedetialModleFourBean.getEdit_recommend())) {
                GameDetialModleThreeAdapter gameDetialModleThreeAdapter15 = this.M;
                Objects.requireNonNull(gameDetialModleThreeAdapter15);
                x4.add(new GameDetialModleThreeAdapter.b1("编辑推荐", 1));
                GameDetialModleThreeAdapter gameDetialModleThreeAdapter16 = this.M;
                Objects.requireNonNull(gameDetialModleThreeAdapter16);
                x4.add(new GameDetialModleThreeAdapter.b1(gamedetialModleFourBean.getEdit_recommend(), 7));
            }
            if (this.N.getBt_game_switch() == 0 && this.N.getTag_info() != null && this.N.getTag_info().size() > 0) {
                GameDetialModleThreeAdapter gameDetialModleThreeAdapter17 = this.M;
                Objects.requireNonNull(gameDetialModleThreeAdapter17);
                x4.add(new GameDetialModleThreeAdapter.b1(null, 4));
            }
            if (gamedetialModleFourBean.getGame_screen_shot() != null && gamedetialModleFourBean.getGame_screen_shot().size() > 0) {
                GameDetialModleThreeAdapter gameDetialModleThreeAdapter18 = this.M;
                Objects.requireNonNull(gameDetialModleThreeAdapter18);
                x4.add(new GameDetialModleThreeAdapter.b1("真实截图", 1));
                GameDetialModleThreeAdapter gameDetialModleThreeAdapter19 = this.M;
                Objects.requireNonNull(gameDetialModleThreeAdapter19);
                x4.add(new GameDetialModleThreeAdapter.b1(null, 28));
            } else {
                GameDetialModleThreeAdapter gameDetialModleThreeAdapter20 = this.M;
                Objects.requireNonNull(gameDetialModleThreeAdapter20);
                x4.add(new GameDetialModleThreeAdapter.b1(null, 5));
            }
            if (com.join.mgps.Util.g2.i(gamedetialModleFourBean.getGame_describe_second())) {
                GameDetialModleThreeAdapter gameDetialModleThreeAdapter21 = this.M;
                Objects.requireNonNull(gameDetialModleThreeAdapter21);
                x4.add(new GameDetialModleThreeAdapter.b1("简介", 1));
                GameDetialModleThreeAdapter gameDetialModleThreeAdapter22 = this.M;
                Objects.requireNonNull(gameDetialModleThreeAdapter22);
                x4.add(new GameDetialModleThreeAdapter.b1(gamedetialModleFourBean.getGame_describe_second(), 8));
            }
            if (gamedetialModleFourBean.getGame_detailed() != null && com.join.mgps.Util.g2.i(gamedetialModleFourBean.getGame_detailed().getTpl_two_qq())) {
                GameDetialModleThreeAdapter gameDetialModleThreeAdapter23 = this.M;
                Objects.requireNonNull(gameDetialModleThreeAdapter23);
                x4.add(new GameDetialModleThreeAdapter.b1(null, 24));
            }
            if (this.N.getBt_game_switch() == 0 && (game_gift_package = this.N.getGame_gift_package()) != null && game_gift_package.size() > 0) {
                GameDetialModleThreeAdapter gameDetialModleThreeAdapter24 = this.M;
                Objects.requireNonNull(gameDetialModleThreeAdapter24);
                x4.add(new GameDetialModleThreeAdapter.b1("福利礼包", 1));
                for (GiftPackageDataInfoBean giftPackageDataInfoBean2 : game_gift_package) {
                    GameDetialModleThreeAdapter gameDetialModleThreeAdapter25 = this.M;
                    Objects.requireNonNull(gameDetialModleThreeAdapter25);
                    x4.add(new GameDetialModleThreeAdapter.b1(giftPackageDataInfoBean2, 9));
                }
            }
            if (gamedetialModleFourBean.getAuxiliary_tool() != null) {
                GameDetialModleThreeAdapter gameDetialModleThreeAdapter26 = this.M;
                Objects.requireNonNull(gameDetialModleThreeAdapter26);
                x4.add(new GameDetialModleThreeAdapter.b1("辅助工具", 10));
            }
            if (gamedetialModleFourBean.getGame_prompt() != null && gamedetialModleFourBean.getGame_prompt().size() > 0) {
                GameDetialModleThreeAdapter gameDetialModleThreeAdapter27 = this.M;
                Objects.requireNonNull(gameDetialModleThreeAdapter27);
                x4.add(new GameDetialModleThreeAdapter.b1(null, 6));
            }
            if (gamedetialModleFourBean.getRoom_cfg_info() != null) {
                if (gamedetialModleFourBean.getRoom_cfg_info().getGolden_finger() != null && gamedetialModleFourBean.getRoom_cfg_info().getGolden_finger().size() > 0) {
                    GameDetialModleThreeAdapter gameDetialModleThreeAdapter28 = this.M;
                    Objects.requireNonNull(gameDetialModleThreeAdapter28);
                    x4.add(new GameDetialModleThreeAdapter.b1(GameMainActivity4.I2, 1));
                    GameDetialModleThreeAdapter gameDetialModleThreeAdapter29 = this.M;
                    Objects.requireNonNull(gameDetialModleThreeAdapter29);
                    x4.add(new GameDetialModleThreeAdapter.b1(gamedetialModleFourBean.getRoom_cfg_info().getGolden_finger(), 35));
                }
                if (gamedetialModleFourBean.getRoom_cfg_info().getCloud_archive() != null && gamedetialModleFourBean.getRoom_cfg_info().getCloud_archive().size() > 0) {
                    GameDetialModleThreeAdapter gameDetialModleThreeAdapter30 = this.M;
                    Objects.requireNonNull(gameDetialModleThreeAdapter30);
                    x4.add(new GameDetialModleThreeAdapter.b1("云存档", 1));
                    for (int i5 = 0; i5 < gamedetialModleFourBean.getRoom_cfg_info().getCloud_archive().size() && i5 <= 1; i5++) {
                        GameDetailCloudArchive gameDetailCloudArchive = gamedetialModleFourBean.getRoom_cfg_info().getCloud_archive().get(i5);
                        if (i5 == 0) {
                            gameDetailCloudArchive.setHideTop(1);
                        }
                        if (i5 == 3 || i5 == gamedetialModleFourBean.getRoom_cfg_info().getCloud_archive().size() - 1) {
                            if (gamedetialModleFourBean.getRoom_cfg_info().getOne_touch_skill() != null && gamedetialModleFourBean.getRoom_cfg_info().getOne_touch_skill().size() > 0) {
                                gameDetailCloudArchive.setDivider(1);
                            }
                            if (gamedetialModleFourBean.getRoom_cfg_info().getCheck_point() != null && gamedetialModleFourBean.getRoom_cfg_info().getCheck_point().size() > 0) {
                                gameDetailCloudArchive.setDivider(1);
                            }
                        }
                        GameDetialModleThreeAdapter gameDetialModleThreeAdapter31 = this.M;
                        Objects.requireNonNull(gameDetialModleThreeAdapter31);
                        x4.add(new GameDetialModleThreeAdapter.b1(gameDetailCloudArchive, 31));
                    }
                }
            }
            if (gamedetialModleFourBean.getGame_handle_entrance() != null) {
                GameDetialModleThreeAdapter gameDetialModleThreeAdapter32 = this.M;
                Objects.requireNonNull(gameDetialModleThreeAdapter32);
                x4.add(new GameDetialModleThreeAdapter.b1("支持手柄", 1));
            }
            if (gamedetialModleFourBean.getCommunity_entrance_switch() == 1) {
                GameDetialModleThreeAdapter gameDetialModleThreeAdapter33 = this.M;
                Objects.requireNonNull(gameDetialModleThreeAdapter33);
                x4.add(new GameDetialModleThreeAdapter.b1("社区讨论", 1));
            }
            if (gamedetialModleFourBean.getGame_upgrade_info_switch() == 1 || gamedetialModleFourBean.getGame_detailed() != null) {
                GameDetialModleThreeAdapter gameDetialModleThreeAdapter34 = this.M;
                Objects.requireNonNull(gameDetialModleThreeAdapter34);
                x4.add(new GameDetialModleThreeAdapter.b1("", 34));
            }
            GamedetialModleFourBean gamedetialModleFourBean4 = this.N;
            if (gamedetialModleFourBean4 == null || gamedetialModleFourBean4.getComment_switch() == 1) {
                GameDetialModleThreeAdapter gameDetialModleThreeAdapter35 = this.M;
                Objects.requireNonNull(gameDetialModleThreeAdapter35);
                x4.add(new GameDetialModleThreeAdapter.b1("评论", 13));
                if (this.N.getCommitDataBeanList() != null && this.N.getCommitDataBeanList().size() > 0) {
                    G0(x4);
                } else if (this.f31951v1) {
                    this.f31951v1 = false;
                    o0();
                } else {
                    GameDetialModleThreeAdapter gameDetialModleThreeAdapter36 = this.M;
                    Objects.requireNonNull(gameDetialModleThreeAdapter36);
                    x4.add(new GameDetialModleThreeAdapter.b1("评论", 26));
                    GameDetialModleThreeAdapter gameDetialModleThreeAdapter37 = this.M;
                    Objects.requireNonNull(gameDetialModleThreeAdapter37);
                    x4.add(new GameDetialModleThreeAdapter.b1("评论", 27));
                }
            }
            if (this.N.getGame_favorites_top5() != null) {
                GameDetialModleThreeAdapter gameDetialModleThreeAdapter38 = this.M;
                Objects.requireNonNull(gameDetialModleThreeAdapter38);
                x4.add(new GameDetialModleThreeAdapter.b1("游戏单", 1));
                GameDetialModleThreeAdapter gameDetialModleThreeAdapter39 = this.M;
                Objects.requireNonNull(gameDetialModleThreeAdapter39);
                x4.add(new GameDetialModleThreeAdapter.b1("搜藏该游戏的游戏单", 29));
            }
            if (this.N.getBt_game_switch() == 1) {
                if (this.N.getBt_game_recommend() != null && this.N.getBt_game_recommend().size() > 0) {
                    GameDetialModleThreeAdapter gameDetialModleThreeAdapter40 = this.M;
                    Objects.requireNonNull(gameDetialModleThreeAdapter40);
                    x4.add(new GameDetialModleThreeAdapter.b1("猜你喜欢", 1));
                    GameDetialModleThreeAdapter gameDetialModleThreeAdapter41 = this.M;
                    Objects.requireNonNull(gameDetialModleThreeAdapter41);
                    x4.add(new GameDetialModleThreeAdapter.b1(4, 17));
                }
            } else {
                if (this.N.getRecommend_game_switch() == 1) {
                    GameDetialModleThreeAdapter gameDetialModleThreeAdapter42 = this.M;
                    Objects.requireNonNull(gameDetialModleThreeAdapter42);
                    x4.add(new GameDetialModleThreeAdapter.b1("同类游戏", 1));
                    GameDetialModleThreeAdapter gameDetialModleThreeAdapter43 = this.M;
                    Objects.requireNonNull(gameDetialModleThreeAdapter43);
                    x4.add(new GameDetialModleThreeAdapter.b1(1, 17));
                }
                if (this.N.getDown_and_down() != null && this.N.getDown_and_down().size() > 0) {
                    GameDetialModleThreeAdapter gameDetialModleThreeAdapter44 = this.M;
                    Objects.requireNonNull(gameDetialModleThreeAdapter44);
                    x4.add(new GameDetialModleThreeAdapter.b1("下了还会下", 1));
                    GameDetialModleThreeAdapter gameDetialModleThreeAdapter45 = this.M;
                    Objects.requireNonNull(gameDetialModleThreeAdapter45);
                    x4.add(new GameDetialModleThreeAdapter.b1(2, 17));
                }
            }
            this.M.notifyDataSetChanged();
        } catch (Exception e6) {
            e6.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Receiver(actions = {"com.broadcast.bespeak.sussess"})
    public void Z0() {
        this.N.setGame_book(1);
        this.M.notifyDataSetChanged();
    }

    void addFrom(DownloadTask downloadTask) {
        ExtBean extBean = this.K;
        if (extBean == null || TextUtils.isEmpty(extBean.getFrom()) || downloadTask == null || !"112".equals(this.K.getFrom())) {
            return;
        }
        ExtBean extBean2 = new ExtBean();
        extBean2.setFrom("101");
        extBean2.setPosition("112");
        extBean2.setLocation(this.K.getLocation());
        downloadTask.setExt(JsonMapper.toJsonString(extBean2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterView() {
        this.G = com.join.mgps.rpc.impl.d.P1();
        this.H = com.join.mgps.rpc.impl.g.A0();
        this.I = com.join.mgps.rpc.impl.e.m();
        this.f31928b = (GamedetailVideoMainActivity) getActivity();
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.J = arguments.getString("gameId");
            this.L = arguments.getBoolean(GamedetailVideoMainActivity_.AUTODOWN_EXTRA);
            this.K = (ExtBean) arguments.getSerializable("extBean");
        }
        this.f31953x.setVisibility(0);
        this.f31954y.setVisibility(0);
        com.join.mgps.Util.d0.a().d(this);
        this.F = p1.f.K().F(this.J);
        getDownloadTaskInfo();
        this.N = new GamedetialModleFourBean();
        GameDetialModleThreeAdapter gameDetialModleThreeAdapter = new GameDetialModleThreeAdapter(requireActivity(), this.f31928b.getModleFourFragment(), this.N);
        this.M = gameDetialModleThreeAdapter;
        ExtBean extBean = this.K;
        if (extBean != null) {
            gameDetialModleThreeAdapter.Q(extBean.get_from_type());
        }
        this.f31939m.setAdapter(this.M);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.f31928b);
        this.f31939m.setLayoutManager(linearLayoutManager);
        this.T = new com.join.mgps.recycler.c(linearLayoutManager, this.f31939m);
        this.M.J(new h());
        LinearLayoutManager linearLayoutManager2 = (LinearLayoutManager) this.f31939m.getLayoutManager();
        this.O = linearLayoutManager2;
        linearLayoutManager2.setSmoothScrollbarEnabled(true);
        this.O.setAutoMeasureEnabled(true);
        this.f31939m.setLayoutManager(this.O);
        this.A.setVisibility(0);
        GamedetialModleFourBean modleFourBeanShow = ((GamedetailVideoMainActivity) getActivity()).getModleFourBeanShow();
        if (modleFourBeanShow != null) {
            Y0(modleFourBeanShow);
        } else {
            n0();
        }
        this.G1.setOnClickListener(new i());
        this.H1.setOnClickListener(new j());
        ExtBean extBean2 = this.K;
        if (extBean2 != null) {
            extBean2.getFrom();
            this.K.getPosition();
            this.K.getLocation();
        }
        X0(false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void b0() {
        this.f31928b.finish();
        s0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void c0() {
        try {
            this.C1 = p1.f.K().S();
            int a02 = p1.f.K().a0();
            this.D1 = a02;
            V0(a02);
            int i4 = this.C1;
            if (i4 != 0) {
                U0(i4);
            } else {
                W0();
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        updateDownloadView();
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
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r4 = r2.A1
            boolean r4 = r4.containsKey(r0)
            if (r4 != 0) goto L2d
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r4 = r2.A1
            r4.put(r0, r3)
        L2d:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r4 = r2.B1
            boolean r4 = r4.containsKey(r0)
            if (r4 != 0) goto La7
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r4 = r2.B1
            r4.put(r0, r3)
            goto La7
        L3b:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.A1
            boolean r3 = r3.containsKey(r0)
            if (r3 == 0) goto L48
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.A1
            r3.remove(r0)
        L48:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.B1
            boolean r3 = r3.containsKey(r0)
            if (r3 == 0) goto La7
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.B1
            r3.remove(r0)
            goto La7
        L56:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.B1
            boolean r3 = r3.containsKey(r0)
            if (r3 == 0) goto La7
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.B1
            r3.remove(r0)
            goto La7
        L64:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.A1
            boolean r3 = r3.containsKey(r0)
            if (r3 == 0) goto L71
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.A1
            r3.remove(r0)
        L71:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.B1
            boolean r3 = r3.containsKey(r0)
            if (r3 == 0) goto La7
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.B1
            r3.remove(r0)
            goto La7
        L7f:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.B1
            boolean r3 = r3.containsKey(r0)
            if (r3 == 0) goto La7
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.B1
            r3.remove(r0)
            goto La7
        L8d:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r4 = r2.A1
            boolean r4 = r4.containsKey(r0)
            if (r4 != 0) goto L9a
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r4 = r2.A1
            r4.put(r0, r3)
        L9a:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r4 = r2.B1
            boolean r4 = r4.containsKey(r0)
            if (r4 != 0) goto La7
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r4 = r2.B1
            r4.put(r0, r3)
        La7:
            r2.updateDownloadView()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.mgps.activity.GameDetialModleThreeActivity.changeDownloadTaskNumber(com.github.snowdream.android.app.downloader.DownloadTask, int):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void changeGameFollow(int i4) {
        String str;
        if (com.join.android.app.common.utils.j.j(this.f31928b)) {
            com.wufan.user.service.protobuf.n0 accountData = AccountUtil_.getInstance_(this.f31928b).getAccountData();
            this.Q = accountData;
            int uid = accountData != null ? accountData.getUid() : 0;
            try {
                PackageInfo packageInfo = this.f31928b.getPackageManager().getPackageInfo(this.f31928b.getPackageName(), 0);
                str = packageInfo.versionCode + "_" + packageInfo.versionName;
            } catch (PackageManager.NameNotFoundException e5) {
                e5.printStackTrace();
                str = "";
            }
            RequestdetialFolowAndBeSpeak requestdetialFolowAndBeSpeak = new RequestdetialFolowAndBeSpeak();
            requestdetialFolowAndBeSpeak.setApp_ver(str);
            requestdetialFolowAndBeSpeak.setGame_id(this.N.getCrc_sign_id());
            requestdetialFolowAndBeSpeak.setUid(uid);
            requestdetialFolowAndBeSpeak.setMobile(this.Q.z());
            CommonRequestBean<RequestGameIdArgs> detialFollowAnd = RequestBeanUtil.getInstance(this.f31928b).getDetialFollowAnd(requestdetialFolowAndBeSpeak);
            ResultMainBean resultMainBean = null;
            if (i4 == 1) {
                resultMainBean = this.G.O0(detialFollowAnd);
            } else if (i4 == 2) {
                resultMainBean = this.G.D(detialFollowAnd);
            } else if (i4 == 3) {
                resultMainBean = this.G.o(detialFollowAnd);
            } else if (i4 == 4) {
                resultMainBean = this.G.d0(detialFollowAnd);
            }
            if (resultMainBean != null) {
                updateTitleButn(resultMainBean, i4);
            }
        }
    }

    @UiThread
    public void d0(int i4, int i5) {
        if (i5 == 1) {
            this.M.F(i4, 1);
        } else {
            this.M.G(i4, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void getDownloadTaskInfo() {
        List<DownloadTask> r4 = p1.f.K().r();
        List<DownloadTask> q4 = p1.f.K().q();
        if (q4 != null && q4.size() > 0) {
            for (DownloadTask downloadTask : q4) {
                this.A1.put(downloadTask.getCrc_link_type_val(), downloadTask);
            }
        }
        if (r4 != null && r4.size() > 0) {
            for (DownloadTask downloadTask2 : r4) {
                this.B1.put(downloadTask2.getCrc_link_type_val(), downloadTask2);
            }
        }
        updateDownloadView();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void h0() {
        IntentUtil.getInstance().goMyGameManagerActivity(this.f31928b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void i0() {
        IntentUtil.getInstance().goMyGameManagerActivity(this.f31928b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void instalButtomButn() {
        int game_book = this.N.getGame_book();
        if (this.N.getBespeak_switch() == 1 && game_book != 1 && this.N.getDown_status() == 2) {
            if (IntentUtil.getInstance().goLoginNetGame(this.f31928b) || this.N.getGame_book() == 1) {
                return;
            }
            changeGameFollow(4);
            return;
        }
        if (("" + this.N.getPlugin_num()).equals("" + ConstantIntEnum.H5.value())) {
            IntentUtil.getInstance().goShareWebActivity(this.f31928b, this.N.getDown_url_remote());
            UtilsMy.T2(this.F, this.f31928b);
        }
        DownloadTask downloadTask = this.F;
        int status = downloadTask != null ? downloadTask.getStatus() : 0;
        if (this.F != null && UtilsMy.w0(this.N.getPay_tag_info(), this.N.getCrc_sign_id()) > 0) {
            status = 43;
        }
        DownloadTask downloadTask2 = this.F;
        if (downloadTask2 == null) {
            return;
        }
        if (downloadTask2 != null && (status == 2 || status == 10)) {
            com.php25.PDownload.d.i(downloadTask2);
        } else if (status == 12 || status == 27) {
            return;
        } else {
            if (status == 13) {
                com.php25.PDownload.d.l(this.f31928b, downloadTask2);
                return;
            } else if (status == 5) {
                UtilsMy.W3(this.f31928b, downloadTask2, "2");
            } else if (status == 42) {
                downloadTask2.setVer(this.N.getVer());
                this.F.setVer_name(this.N.getVer_name());
                this.F.setUrl(this.N.getDown_url_remote());
                this.F.setCfg_ver(this.N.getCfg_ver());
                this.F.setCfg_ver_name(this.N.getCfg_ver_name());
                this.F.setCfg_down_url(this.N.getCfg_down_url());
                this.F.setPay_game_amount(this.N.getPay_tag_info() != null ? this.N.getPay_tag_info().getPay_game_amount() : 0);
                DownloadTask downloadTask3 = this.F;
                Where where = Where.detail;
                downloadTask3.setKeyword(where.name());
                this.F.setKeyword(where.name());
                DownloadTask downloadTask4 = this.F;
                UtilsMy.z4(downloadTask4, downloadTask4.getCrc_link_type_val());
                UtilsMy.r4(this.f31928b, this.F);
            } else if (status == 9) {
                if (!com.join.android.app.common.utils.j.j(this.f31928b)) {
                    com.join.mgps.Util.l2.a(this.f31928b).b("无网络连接");
                    return;
                }
                if (this.N.getGame_detailed() != null && com.join.mgps.Util.g2.i(this.N.getGame_detailed().getTpl_two_qq())) {
                    com.join.mgps.Util.b0.f0(this.f31928b).b0(this.f31928b, this.N.getGame_detailed().getTpl_two_qq_key(), this.N.getGame_detailed().getAd_pic_qq(), this.N.getGame_detailed().getTpl_two_qq());
                }
                int downloadType = this.F.getDownloadType();
                if (downloadType == 0 || downloadType == 1) {
                    if (this.F.getCrc_link_type_val() == null || this.F.getCrc_link_type_val().equals("")) {
                        return;
                    }
                    addFrom(this.F);
                    if (UtilsMy.o1(this.f31928b, this.F)) {
                        return;
                    }
                    if (this.N.getDown_status() == 5) {
                        UtilsMy.l1(this.f31928b, this.F);
                        return;
                    }
                    com.php25.PDownload.d.b(this.F);
                    this.F.setVer(this.N.getVer());
                    this.F.setVer_name(this.N.getVer_name());
                    this.F.setUrl(this.N.getDown_url_remote());
                    this.F.setCfg_ver(this.N.getCfg_ver());
                    this.F.setCfg_ver_name(this.N.getCfg_ver_name());
                    this.F.setCfg_down_url(this.N.getCfg_down_url());
                    this.F.setPay_game_amount(this.N.getPay_tag_info() != null ? this.N.getPay_tag_info().getPay_game_amount() : 0);
                    this.F.setKeyword(Where.detail.name());
                    DownloadTask downloadTask5 = this.F;
                    UtilsMy.z4(downloadTask5, downloadTask5.getCrc_link_type_val());
                    if (UtilsMy.y0(this.N.getPay_tag_info(), this.N.getCrc_sign_id()) > 0) {
                        ExtBean extBean = this.K;
                        if (extBean != null && "checkgame".equals(extBean.getFrom())) {
                            UtilsMy.e4(this.f31928b, this.J, this.K.getFrom_id());
                        } else if (!UtilsMy.o1(this.f31928b, this.F)) {
                            if (this.N.getDown_status() == 5) {
                                UtilsMy.l1(this.f31928b, this.F);
                            } else {
                                UtilsMy.d4(this.f31928b, this.J);
                            }
                        }
                    } else {
                        UtilsMy.C1(this.F, this.N);
                        if (!UtilsMy.o1(this.f31928b, this.F)) {
                            if (this.N.getDown_status() == 5) {
                                UtilsMy.l1(this.f31928b, this.F);
                            } else {
                                UtilsMy.R0(this.f31928b, this.F, this.N.getTp_down_url(), this.N.getOther_down_switch(), this.N.getCdn_down_switch());
                            }
                        }
                    }
                } else if (downloadType == 2) {
                    UtilsMy.u4(this.F);
                }
            } else if (11 == status) {
                UtilsMy.a4(downloadTask2, this.f31928b);
            } else if (43 == status) {
                downloadTask2.setKeyword(Where.detail.name());
                GamedetialModleFourBean gamedetialModleFourBean = this.N;
                if (gamedetialModleFourBean != null) {
                    if (gamedetialModleFourBean.getGame_detailed() != null && com.join.mgps.Util.g2.i(this.N.getGame_detailed().getTpl_two_qq())) {
                        com.join.mgps.Util.b0.f0(this.f31928b).b0(this.f31928b, this.N.getGame_detailed().getTpl_two_qq_key(), this.N.getGame_detailed().getAd_pic_qq(), this.N.getGame_detailed().getTpl_two_qq());
                    }
                    addFrom(this.F);
                    if (UtilsMy.y0(this.N.getPay_tag_info(), this.N.getCrc_sign_id()) > 0) {
                        ExtBean extBean2 = this.K;
                        if (extBean2 != null && "checkgame".equals(extBean2.getFrom())) {
                            UtilsMy.e4(this.f31928b, this.J, this.K.getFrom_id());
                        } else if (!UtilsMy.o1(this.f31928b, this.F)) {
                            if (this.N.getDown_status() == 5) {
                                UtilsMy.l1(this.f31928b, this.F);
                            } else {
                                UtilsMy.d4(this.f31928b, this.J);
                            }
                        }
                    } else {
                        UtilsMy.C1(this.F, this.N);
                        if (!UtilsMy.o1(this.f31928b, this.F)) {
                            if (this.N.getDown_status() == 5) {
                                UtilsMy.l1(this.f31928b, this.F);
                            } else {
                                UtilsMy.R0(this.f31928b, this.F, this.N.getTp_down_url(), this.N.getOther_down_switch(), this.N.getCdn_down_switch());
                            }
                        }
                    }
                }
            } else {
                downloadTask2.setKeyword(Where.detail.name());
                if (this.N != null) {
                    addFrom(this.F);
                    if (this.N.getGame_detailed() != null && com.join.mgps.Util.g2.i(this.N.getGame_detailed().getTpl_two_qq())) {
                        com.join.mgps.Util.b0.f0(this.f31928b).b0(this.f31928b, this.N.getGame_detailed().getTpl_two_qq_key(), this.N.getGame_detailed().getAd_pic_qq(), this.N.getGame_detailed().getTpl_two_qq());
                    }
                    if (UtilsMy.y0(this.N.getPay_tag_info(), this.N.getCrc_sign_id()) > 0) {
                        ExtBean extBean3 = this.K;
                        if (extBean3 != null && "checkgame".equals(extBean3.getFrom())) {
                            UtilsMy.e4(this.f31928b, this.J, this.K.getFrom_id());
                        } else if (!UtilsMy.o1(this.f31928b, this.F)) {
                            if (this.N.getDown_status() == 5) {
                                UtilsMy.l1(this.f31928b, this.F);
                            } else {
                                UtilsMy.d4(this.f31928b, this.J);
                            }
                        }
                    } else {
                        UtilsMy.C1(this.F, this.N);
                        if (!UtilsMy.o1(this.f31928b, this.F)) {
                            if (this.N.getDown_status() == 5) {
                                UtilsMy.l1(this.f31928b, this.F);
                            } else {
                                UtilsMy.R0(this.f31928b, this.F, this.N.getTp_down_url(), this.N.getOther_down_switch(), this.N.getCdn_down_switch());
                            }
                        }
                    }
                }
            }
        }
        updateButn();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void iv_back() {
        this.f31928b.finish();
        s0();
    }

    void j0() {
        if (!com.join.android.app.common.utils.j.j(this.f31928b) || IntentUtil.getInstance().goLoginInteractive(this.f31928b) || this.N.getGame_follow() == 1) {
            return;
        }
        changeGameFollow(2);
    }

    void k0() {
        boolean booleanValue = this.V.noFavoriteTips().d().booleanValue();
        if (IntentUtil.getInstance().goLoginInteractive(this.f31928b)) {
            return;
        }
        if (!booleanValue) {
            if (this.W == null) {
                com.join.mgps.customview.o oVar = new com.join.mgps.customview.o(this.f31928b, R.style.MyDialog);
                this.W = oVar;
                oVar.setContentView(R.layout.favorite_dialog);
                this.W.setCanceledOnTouchOutside(true);
            }
            ((CheckBox) this.W.findViewById(R.id.opt)).setOnCheckedChangeListener(new l());
            ((Button) this.W.findViewById(R.id.ok)).setOnClickListener(new m());
            com.join.mgps.customview.o oVar2 = this.W;
            if (oVar2 == null || oVar2.isShowing()) {
                return;
            }
            this.W.show();
            return;
        }
        j0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void l0() {
        GamedetialModleFourBean gamedetialModleFourBean;
        if (IntentUtil.getInstance().goLoginInteractive(this.f31928b) || (gamedetialModleFourBean = this.N) == null || gamedetialModleFourBean.getGame_follow() == 1) {
            return;
        }
        k0();
    }

    public RequestCommentpraiseArgs m0(String str, int i4, int i5) {
        String str2;
        int i6;
        String str3 = Build.MODEL;
        com.wufan.user.service.protobuf.n0 accountData = AccountUtil_.getInstance_(this.f31928b).getAccountData();
        this.Q = accountData;
        if (accountData != null) {
            i6 = accountData.getUid();
            str2 = this.Q.getToken();
        } else {
            str2 = "";
            i6 = 0;
        }
        return RequestBeanUtil.getInstance(this.f31928b).getPraiseComment(this.J, this.V.commentToken().d(), str3, str, str2, i6, i4, i5);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void n0() {
        GamedetialModleFourBean data;
        if (com.join.android.app.common.utils.j.j(this.f31928b)) {
            try {
                com.wufan.user.service.protobuf.n0 accountData = AccountUtil_.getInstance_(this.f31928b).getAccountData();
                if (accountData == null) {
                    accountData = com.wufan.user.service.protobuf.n0.b5();
                }
                RequestModel requestModel = new RequestModel();
                requestModel.setDefault(this.f31928b);
                requestModel.setArgs(new RequestGameIdArgs(this.J, 1, accountData.getUid()));
                ResponseModel<GamedetialModleFourBean> body = com.join.mgps.rpc.impl.i.D0().B0().B1(requestModel.makeSign()).execute().body();
                if (body != null && body.getCode() == 200 && (data = body.getData()) != null) {
                    Y0(data);
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
    public void o0() {
        if (com.join.android.app.common.utils.j.j(this.f31928b)) {
            com.join.mgps.rpc.impl.e m4 = com.join.mgps.rpc.impl.e.m();
            new CommentAllListBean();
            try {
                CommentResponse<CommentAllListBean> g4 = m4.g(RequestBeanUtil.getInstance(this.f31928b).getGamedetialCommentRequest(this.J, this.V.commentToken().d(), this.Q.getUid() + ""));
                if (g4 != null) {
                    CommentAllListBean data_info = g4.getData_info();
                    if (data_info != null) {
                        this.f31944p1 = data_info.getSelf_comment();
                        this.Z = data_info.getGame_comment_count();
                        this.f31943p0 = data_info.getGame_score();
                        this.f31928b.getModleFourFragment().setCommentNumber(this.Z);
                    }
                    if (data_info != null && data_info.getHot_comment() != null && data_info.getHot_comment().size() >= 0) {
                        List<CommentAllListBean.HotCommentBean> hot_comment = data_info.getHot_comment();
                        ArrayList arrayList = new ArrayList();
                        for (CommentAllListBean.HotCommentBean hotCommentBean : hot_comment) {
                            arrayList.add(hotCommentBean);
                        }
                        showMain(arrayList);
                        return;
                    }
                    showMain(new ArrayList());
                    return;
                }
                showMain(new ArrayList());
            } catch (Exception e5) {
                e5.printStackTrace();
                showMain(new ArrayList());
            }
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onChangeComment(com.join.mgps.event.j jVar) {
        if (jVar.getType() == 1 || jVar.getType() == 0 || jVar.getType() == 2) {
            o0();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        g0();
        f0();
        com.join.mgps.Util.d0.a().e(this);
        com.join.mgps.customview.o oVar = this.R;
        if (oVar == null || !oVar.isShowing()) {
            return;
        }
        this.R.dismiss();
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0086, code lost:
        if (r6 != 48) goto L52;
     */
    @org.greenrobot.eventbus.Subscribe(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onEventMainThread(com.join.mgps.event.n r6) {
        /*
            r5 = this;
            com.github.snowdream.android.app.downloader.DownloadTask r0 = r6.a()
            int r1 = r6.c()
            r5.changeDownloadTaskNumber(r0, r1)
            int r1 = r6.c()
            java.lang.String r2 = "%"
            r3 = 8
            if (r1 != r3) goto L4b
            com.github.snowdream.android.app.downloader.DownloadTask r6 = r5.F
            if (r6 == 0) goto L4a
            java.lang.String r6 = r6.getPath()
            if (r6 == 0) goto L4a
            com.github.snowdream.android.app.downloader.DownloadTask r6 = r5.F
            com.join.mgps.Util.UtilsMy.x4(r6)
            android.widget.ProgressBar r6 = r5.f31947s
            com.github.snowdream.android.app.downloader.DownloadTask r0 = r5.F
            long r0 = r0.getProgress()
            int r1 = (int) r0
            r6.setProgress(r1)
            android.widget.TextView r6 = r5.f31946r
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            com.github.snowdream.android.app.downloader.DownloadTask r1 = r5.F
            long r3 = r1.getProgress()
            r0.append(r3)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r6.setText(r0)
        L4a:
            return
        L4b:
            if (r0 == 0) goto Le3
            com.github.snowdream.android.app.downloader.DownloadTask r1 = r5.F
            if (r1 == 0) goto Le3
            java.lang.String r1 = r0.getCrc_link_type_val()
            com.github.snowdream.android.app.downloader.DownloadTask r4 = r5.F
            java.lang.String r4 = r4.getCrc_link_type_val()
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto Le3
            r5.F = r0
            int r6 = r6.c()
            r1 = 2
            if (r6 == r1) goto Ldd
            r1 = 3
            if (r6 == r1) goto Ld9
            r1 = 5
            if (r6 == r1) goto Lbf
            r1 = 6
            if (r6 == r1) goto Ld9
            r1 = 7
            if (r6 == r1) goto Ld9
            if (r6 == r3) goto L89
            r1 = 10
            if (r6 == r1) goto Ld9
            r1 = 11
            if (r6 == r1) goto Lbf
            r1 = 27
            if (r6 == r1) goto Ld9
            r1 = 48
            if (r6 == r1) goto Lbf
            goto Le3
        L89:
            com.github.snowdream.android.app.downloader.DownloadTask r6 = r5.F
            if (r6 == 0) goto Lbe
            java.lang.String r6 = r6.getPath()
            if (r6 == 0) goto Lbe
            com.github.snowdream.android.app.downloader.DownloadTask r6 = r5.F
            com.join.mgps.Util.UtilsMy.x4(r6)
            android.widget.ProgressBar r6 = r5.f31947s
            com.github.snowdream.android.app.downloader.DownloadTask r0 = r5.F
            long r0 = r0.getProgress()
            int r1 = (int) r0
            r6.setProgress(r1)
            android.widget.TextView r6 = r5.f31946r
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            com.github.snowdream.android.app.downloader.DownloadTask r1 = r5.F
            long r3 = r1.getProgress()
            r0.append(r3)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r6.setText(r0)
        Lbe:
            return
        Lbf:
            com.github.snowdream.android.app.downloader.DownloadTask r6 = r5.F
            if (r6 == 0) goto Ld5
            java.lang.String r6 = r0.getCrc_link_type_val()
            com.github.snowdream.android.app.downloader.DownloadTask r1 = r5.F
            java.lang.String r1 = r1.getCrc_link_type_val()
            boolean r6 = r6.equals(r1)
            if (r6 == 0) goto Ld5
            r5.F = r0
        Ld5:
            r5.c0()
            goto Le3
        Ld9:
            r5.c0()
            goto Le3
        Ldd:
            r5.Q0()
            r5.c0()
        Le3:
            r5.updateButn()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.mgps.activity.GameDetialModleThreeActivity.onEventMainThread(com.join.mgps.event.n):void");
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        this.S = true;
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        GamedetialModleFourBean gamedetialModleFourBean;
        super.onResume();
        this.S = false;
        this.Q = AccountUtil_.getInstance_(this.f31928b).getAccountData();
        c0();
        DownloadTask F = this.J != null ? p1.f.K().F(this.J) : null;
        if (F == null && (gamedetialModleFourBean = this.N) != null) {
            this.F = gamedetialModleFourBean.getDownloadtaskDown();
        }
        if (F == null || this.F == null) {
            return;
        }
        try {
            this.F = F;
            if (F.getFileType().equals(Dtype.android.name()) && this.F.getStatus() == 5) {
                if (Boolean.valueOf(com.join.android.app.common.utils.e.l0(this.f31928b).d(this.f31928b, this.F.getPackageName())).booleanValue()) {
                    APKUtils.a l4 = com.join.android.app.common.utils.e.l0(this.f31928b).l(this.f31928b, this.F.getPackageName());
                    if (com.join.mgps.Util.g2.i(this.F.getVer()) && l4.d() < Integer.parseInt(this.F.getVer())) {
                        this.F.setStatus(9);
                    } else {
                        this.F.setStatus(5);
                    }
                } else {
                    this.F.setStatus(11);
                }
            } else {
                this.F.setStatus(F.getStatus());
            }
            updateButn();
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void p0(GiftPackageDataInfoBean giftPackageDataInfoBean) {
        if (com.join.android.app.common.utils.j.j(this.f31928b)) {
            try {
                try {
                    GiftPackageOperationBean f02 = this.G.f0(RequestBeanUtil.getInstance(this.f31928b).getGiftPackageOperationRequestBean(this.Q.getUid(), giftPackageDataInfoBean.getGift_package_id(), this.J));
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
                        List<GiftPackageDataInfoBean> game_gift_package = this.N.getGame_gift_package();
                        for (int i4 = 0; i4 < game_gift_package.size(); i4++) {
                            GiftPackageDataInfoBean giftPackageDataInfoBean2 = game_gift_package.get(i4);
                            if (giftPackageDataInfoBean.getGift_package_id() == giftPackageDataInfoBean2.getGift_package_id()) {
                                giftPackageDataInfoBean2.setGift_package_status(1);
                                giftPackageDataInfoBean2.setGift_package_overdue(giftPackageDataOperationBean.getGift_info().getGift_package_overdue());
                                giftPackageDataInfoBean2.setGift_package_code(giftPackageDataOperationBean.getGift_info().getGift_package_code());
                            }
                        }
                        this.N.setGame_gift_package(game_gift_package);
                        M0(giftPackageDataOperationBean);
                    }
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
            } finally {
                showToast("领取失败");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void progress_layout() {
        DownloadTask downloadTask = this.F;
        if (downloadTask == null) {
            return;
        }
        if (downloadTask.getStatus() == 2) {
            updateButn();
            com.php25.PDownload.d.i(this.F);
        } else if (this.F.getStatus() == 3 || this.F.getStatus() == 6) {
            updateButn();
            com.php25.PDownload.d.c(this.F, this.f31928b);
        }
    }

    public CommonRequestBean q0() {
        com.wufan.user.service.protobuf.n0 accountData = AccountUtil_.getInstance_(this.f31928b).getAccountData();
        this.Q = accountData;
        return RequestBeanUtil.getInstance(this.f31928b).getGameCommentListRequestBean(1, 5, accountData != null ? accountData.getUid() : 0, this.J, new int[]{1});
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void r0() {
        if (com.join.android.app.common.utils.j.j(this.f31928b)) {
            try {
                CommentResponse<CommentTokenBean> c5 = this.I.c(RequestBeanUtil.getInstance(this.f31928b).getTokenRequestBean(AccountUtil_.getInstance_(this.f31928b).getUid(), ""));
                if (c5 == null || c5.getCode() != 0 || c5.getData_info() == null || TextUtils.isEmpty(c5.getData_info().getToken())) {
                    return;
                }
                this.V.commentToken().g(AESUtils.f(c5.getData_info().getToken() + "|" + c5.getData_info().getTimes()));
                this.V.lastCheckInTime().g(Long.valueOf(System.currentTimeMillis()));
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void relodingimag() {
        this.A.setVisibility(0);
        n0();
    }

    void s0() {
        ExtBean extBean = this.K;
        if (extBean == null || TextUtils.isEmpty(extBean.getFrom()) || !this.K.getFrom().equals("updateFromMarket")) {
            return;
        }
        IntentUtil.getInstance().goMGMainActivity2Front(this.f31928b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void setNetwork() {
        UtilsMy.w3(this.f31928b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showInstallButn() {
        GamedetialModleFourBean gamedetialModleFourBean = this.N;
        if (gamedetialModleFourBean == null || TextUtils.isEmpty(gamedetialModleFourBean.getCrc_sign_id())) {
            return;
        }
        RelativeLayout relativeLayout = this.f31941o;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(8);
        }
        RelativeLayout relativeLayout2 = this.f31942p;
        if (relativeLayout2 != null) {
            relativeLayout2.setVisibility(0);
        }
        TextView textView = this.f31940n;
        if (textView != null) {
            textView.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showLodingFailed() {
        LinearLayout linearLayout = this.A;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        try {
            GamedetialModleFourBean gamedetialModleFourBean = this.N;
            if (gamedetialModleFourBean == null || com.join.mgps.Util.g2.h(gamedetialModleFourBean.getCrc_sign_id())) {
                LinearLayout linearLayout2 = this.f31955z;
                if (linearLayout2 != null) {
                    linearLayout2.setVisibility(0);
                }
                if (com.join.android.app.common.utils.j.j(this.f31928b)) {
                    this.B.setVisibility(8);
                } else {
                    this.B.setVisibility(0);
                }
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showMain(List<CommentBaseBean> list) {
        this.Y = list;
        if (this.N.getGame_id() != null) {
            Y0(this.N);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showProgress() {
        RelativeLayout relativeLayout = this.f31942p;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(8);
        }
        TextView textView = this.f31940n;
        if (textView != null) {
            textView.setVisibility(8);
        }
        RelativeLayout relativeLayout2 = this.f31941o;
        if (relativeLayout2 != null) {
            relativeLayout2.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showToast(String str) {
        com.join.mgps.Util.l2.a(this.f31928b).b(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Receiver(actions = {o1.a.G, o1.a.I})
    public void u0(@Receiver.Extra("gameData") CollectionBeanSub collectionBeanSub) {
        if (collectionBeanSub != null) {
            PurchasedListTable n4 = b2.e0.o().n(collectionBeanSub.getGame_id());
            if (n4 == null) {
                n4 = new PurchasedListTable();
            }
            n4.setGame_id(collectionBeanSub.getGame_id());
            b2.e0.o().m(n4);
        }
        updateButn();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void updateButn() {
        GamedetialModleFourBean gamedetialModleFourBean = this.N;
        if (gamedetialModleFourBean == null || this.F == null || this.f31942p == null) {
            return;
        }
        UtilsMy.j3(gamedetialModleFourBean.getSp_tag_info(), this.f31942p, this.F);
        if (this.N.getPlugin_num() != null) {
            String plugin_num = this.N.getPlugin_num();
            if (plugin_num.equals(ConstantIntEnum.H5.value() + "")) {
                this.f31940n.setBackgroundResource(R.drawable.detial_simple_normal_selecter);
                this.f31940n.setText("开始");
                showInstallButn();
                return;
            }
        }
        this.f31940n.setBackgroundResource(R.drawable.detial_simple_normal_selecter);
        DownloadTask downloadTask = this.F;
        int status = downloadTask != null ? downloadTask.getStatus() : 0;
        if (UtilsMy.w0(this.N.getPay_tag_info(), this.N.getCrc_sign_id()) > 0) {
            status = 43;
        }
        if (status == 9) {
            showInstallButn();
            this.f31940n.setText("更新");
            this.f31945q.setImageResource(R.drawable.detail_comment_download_continue);
            this.f31945q.setImageResource(R.drawable.detial_simple_install_selecter);
        } else if (status == 12) {
            showInstallButn();
            this.f31940n.setText("解压中..");
        } else if (status == 13) {
            showInstallButn();
            this.f31940n.setText("解压");
            this.f31945q.setImageResource(R.drawable.detail_comment_download_continue);
        } else if (status == 11) {
            showInstallButn();
            this.f31940n.setText("安装");
            this.f31940n.setBackgroundResource(R.drawable.detial_simple_install_selecter);
            this.f31945q.setImageResource(R.drawable.detial_simple_install_selecter);
        } else if (status == 5 || status == 42) {
            showInstallButn();
            X0(true);
            this.f31940n.setBackgroundResource(R.drawable.detial_simple_open_selecter);
            this.f31940n.setText(this.f31928b.getResources().getString(R.string.download_status_finished));
            this.f31945q.setImageResource(R.drawable.detail_comment_download_continue);
        } else if (status == 2) {
            showProgress();
            this.f31945q.setImageResource(R.drawable.detail_comment_download_pause);
            UtilsMy.x4(this.F);
            this.f31947s.setProgress((int) this.F.getProgress());
            TextView textView = this.f31946r;
            textView.setText(this.F.getProgress() + "%");
        } else if (status == 3 || status == 6 || status == 27) {
            showProgress();
            this.f31945q.setImageResource(R.drawable.detail_comment_download_continue);
            UtilsMy.x4(this.F);
            this.f31947s.setProgress((int) this.F.getProgress());
            TextView textView2 = this.f31946r;
            textView2.setText(this.F.getProgress() + "%");
        } else if (status == 10) {
            showInstallButn();
            TextView textView3 = this.f31940n;
            textView3.setText("等待\u3000" + this.N.getSize() + "M");
            this.f31945q.setImageResource(R.drawable.detail_comment_download_continue);
        } else if (status == 1) {
        } else {
            if (status == 43) {
                showInstallButn();
                if (UtilsMy.w0(this.N.getPay_tag_info(), this.N.getCrc_sign_id()) > 0) {
                    this.f31940n.setText(this.f31928b.getResources().getString(R.string.pay_game_amount, this.N.getPay_tag_info().getPayGameAmount()));
                } else {
                    this.f31940n.setText(this.f31928b.getResources().getString(R.string.download_status_download));
                }
                this.f31945q.setImageResource(R.drawable.detail_comment_download_continue);
                GamedetialModleFourBean gamedetialModleFourBean2 = this.N;
                if (gamedetialModleFourBean2 != null) {
                    if (gamedetialModleFourBean2.getBespeak_switch() == 1 && this.N.getDown_status() == 2) {
                        if (this.N.getGame_book() == 1) {
                            this.f31940n.setText("已预约");
                            UtilsMy.w0(this.N.getPay_tag_info(), this.N.getCrc_sign_id());
                            UtilsMy.n3(this.f31940n, this.N);
                            return;
                        }
                        this.f31940n.setText("预约");
                        return;
                    }
                    UtilsMy.w0(this.N.getPay_tag_info(), this.N.getCrc_sign_id());
                    UtilsMy.n3(this.f31940n, this.N);
                }
            } else if (status == 48) {
                showInstallButn();
                this.f31940n.setText(this.f31928b.getResources().getString(R.string.download_status_installing));
            } else {
                showInstallButn();
                if (UtilsMy.w0(this.N.getPay_tag_info(), this.N.getCrc_sign_id()) > 0) {
                    this.f31940n.setText(this.f31928b.getResources().getString(R.string.pay_game_amount, this.N.getPay_tag_info().getPayGameAmount()));
                } else {
                    this.f31940n.setText(this.f31928b.getResources().getString(R.string.download_status_download));
                }
                this.f31945q.setImageResource(R.drawable.detail_comment_download_continue);
                GamedetialModleFourBean gamedetialModleFourBean3 = this.N;
                if (gamedetialModleFourBean3 != null) {
                    if (gamedetialModleFourBean3.getBespeak_switch() == 1 && this.N.getDown_status() == 2) {
                        if (this.N.getGame_book() == 1) {
                            this.f31940n.setText("已预约");
                            UtilsMy.w0(this.N.getPay_tag_info(), this.N.getCrc_sign_id());
                            UtilsMy.n3(this.f31940n, this.N);
                            return;
                        }
                        this.f31940n.setText("预约");
                        return;
                    }
                    UtilsMy.w0(this.N.getPay_tag_info(), this.N.getCrc_sign_id());
                    UtilsMy.n3(this.f31940n, this.N);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void updateDownloadView() {
        int i4;
        try {
            Map<String, DownloadTask> map = this.A1;
            int i5 = 0;
            if (map != null) {
                i5 = map.size();
                i4 = this.B1.size();
            } else {
                i4 = 0;
            }
            this.J1.setDownloadGameNum(i5);
            if (i4 > 0) {
                this.J1.d();
            } else {
                this.J1.g();
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void updateTitleButn(ResultMainBean resultMainBean, int i4) {
        if (resultMainBean.getFlag() == 1) {
            if (i4 == 1) {
                this.N.setGame_follow(0);
            } else if (i4 == 2) {
                this.N.setGame_follow(1);
                if (this.f31935i == null) {
                    return;
                }
                com.join.mgps.Util.l2.a(this.f31928b).b("收藏成功");
                this.f31935i.setImageResource(R.drawable.followed_image);
                this.f31936j.setText("已收藏");
            } else if (i4 == 3) {
                this.N.setGame_book(0);
            } else if (i4 == 4) {
                this.N.setGame_book(1);
                Intent intent = new Intent("com.broadcast.bespeak.sussess");
                intent.putExtra("gameid", this.N.getCrc_sign_id());
                this.f31928b.sendBroadcast(intent);
                com.join.mgps.Util.b0.f0(this.f31928b).O(this.f31928b, 1, new p()).show();
            }
            C0();
            updateButn();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void v0() {
        T0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void w0(CommentBaseBean commentBaseBean, int i4, int i5) {
        if (com.join.android.app.common.utils.j.j(this.f31928b)) {
            try {
                CommentResponse<CommentPraiseBean> h4 = this.I.h(m0(commentBaseBean.getId(), i5, commentBaseBean.getPn()));
                if (h4 != null) {
                    if (h4.getCode() == 801) {
                        E0(h4);
                    } else if (h4.getSucc() != 1) {
                        D0(h4.getMsg(), true, i4, 1);
                    }
                    if (h4.getSucc() == 1) {
                        d0(i4, 1);
                        return;
                    }
                    return;
                }
                D0("操作失败，请稍候再试~", true, i4, 1);
                return;
            } catch (Exception e5) {
                D0("操作失败，请稍候再试~", true, i4, 1);
                e5.printStackTrace();
                return;
            }
        }
        D0("网络连接失败，再试试吧~", true, i4, 1);
    }

    void x0(CommentBaseBean commentBaseBean) {
        CommentDetailActivity_.M1(this.f31928b).d(commentBaseBean.getGame_id()).b(commentBaseBean.getId()).f(this.N.getPlugin_num()).a(this.N.getBespeak_switch()).e(this.N.getIs_started()).c(this.N.getComment_score_switch()).h(this.N.getGame_score().getSgc_switch()).g(this.N.getPackageName()).start();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void y0(CommentBaseBean commentBaseBean, int i4, int i5) {
        if (com.join.android.app.common.utils.j.j(this.f31928b)) {
            try {
                CommentResponse<CommentPraiseBean> l4 = this.I.l(m0(commentBaseBean.getId(), i5, commentBaseBean.getPn()));
                if (l4 != null) {
                    if (l4.getCode() == 801) {
                        E0(l4);
                    } else if (l4.getSucc() != 1) {
                        D0(l4.getMsg(), true, i4, 2);
                    }
                    if (l4.getSucc() == 1) {
                        d0(i4, 2);
                        return;
                    }
                    return;
                }
                D0("操作失败，请稍候再试~", true, i4, 2);
                return;
            } catch (Exception e5) {
                D0("操作失败，请稍候再试~", true, i4, 2);
                e5.printStackTrace();
                return;
            }
        }
        D0("网络连接失败，再试试吧~", true, i4, 2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Receiver(actions = {"com.join,mgps.sim.sdkgamePayfinish"})
    public void z0(Intent intent) {
        this.f31928b.finish();
    }
}
