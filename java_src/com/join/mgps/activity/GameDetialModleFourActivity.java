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
import androidx.annotation.NonNull;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.android.app.common.utils.APKUtils;
import com.join.android.app.common.utils.JsonMapper;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.component.xrecyclerview.XRecyclerView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.AESUtils;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.Util.RequestBeanUtil;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.Util.m1;
import com.join.mgps.activity.gamedetail.GamedetailVideoMainActivity;
import com.join.mgps.activity.gamedetail.GamedetailVideoMainActivity_;
import com.join.mgps.adapter.GameDetialModleFourAdapter;
import com.join.mgps.business.CollectionBeanSubBusiness;
import com.join.mgps.customview.CustomerDownloadView;
import com.join.mgps.db.tables.PurchasedListTable;
import com.join.mgps.dto.BtGameWelfare;
import com.join.mgps.dto.CollectionBeanSub;
import com.join.mgps.dto.CommentAllListBean;
import com.join.mgps.dto.CommentBaseBean;
import com.join.mgps.dto.CommentPraiseBean;
import com.join.mgps.dto.CommentResponse;
import com.join.mgps.dto.CommentTokenBean;
import com.join.mgps.dto.CommonRequestBean;
import com.join.mgps.dto.ExtBean;
import com.join.mgps.dto.ForumBean;
import com.join.mgps.dto.GamePariseRequest;
import com.join.mgps.dto.GameScore;
import com.join.mgps.dto.GamedetialModleFourBean;
import com.join.mgps.dto.GiftPackageDataInfoBean;
import com.join.mgps.dto.GiftPackageDataOperationBean;
import com.join.mgps.dto.GiftPackageOperationBean;
import com.join.mgps.dto.InformationCommentBean;
import com.join.mgps.dto.ModInfoBean;
import com.join.mgps.dto.PariseBackData;
import com.join.mgps.dto.RequestCommentpraiseArgs;
import com.join.mgps.dto.RequestGameIdArgs;
import com.join.mgps.dto.RequestModel;
import com.join.mgps.dto.RequestdetialFolowAndBeSpeak;
import com.join.mgps.dto.ResponseModel;
import com.join.mgps.dto.ResultMainBean;
import com.join.mgps.dto.ShareBean;
import com.join.mgps.dto.TipBean;
import com.join.mgps.enums.ConstantIntEnum;
import com.join.mgps.enums.Dtype;
import com.join.mgps.pref.PrefDef_;
import com.papa.sim.statistic.Event;
import com.papa.sim.statistic.Ext;
import com.papa.sim.statistic.Where;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
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
@EFragment(R.layout.gamedetial_modle_four_activity)
/* loaded from: classes.dex */
public class GameDetialModleFourActivity extends Fragment implements w1.n {
    private static final String Z1 = "GameDetialModleFourAct";
    @ViewById
    LinearLayout A;
    @ViewById
    Button B;
    private com.join.android.app.common.manager.b B1;
    @ViewById
    RelativeLayout C;
    @ViewById
    SimpleDraweeView D;
    @Pref
    PrefDef_ D1;
    @ViewById
    TextView E;
    com.join.mgps.customview.o E1;
    @ViewById
    NestedScrollView F;
    private DownloadTask G;
    private List<CommentBaseBean> G1;
    com.join.mgps.rpc.e H;
    private String H1;
    com.join.mgps.rpc.i I;
    private GameScore I1;
    com.join.mgps.rpc.f J;
    String K;
    ExtBean L;
    boolean M;
    private GameDetialModleFourAdapter N;
    private GamedetialModleFourBean O;
    private int O1;
    private LinearLayoutManager P;
    private int P1;
    private com.join.mgps.customview.o Q;
    @ViewById
    TextView Q1;
    private com.wufan.user.service.protobuf.n0 R;
    @ViewById
    ImageView R1;
    private com.join.mgps.customview.o S;
    @ViewById
    ImageView S1;
    private boolean T;
    @ViewById
    ImageView T1;
    com.join.mgps.recycler.c U;
    @ViewById
    ImageView U1;
    w1.i V;
    @ViewById(R.id.title_normal_download_cdv)
    CustomerDownloadView V1;
    com.join.android.app.component.video.c W;
    private Animation W1;

    /* renamed from: b  reason: collision with root package name */
    private GamedetailVideoMainActivity f31783b;
    @ViewById

    /* renamed from: c  reason: collision with root package name */
    TextView f31784c;
    @ViewById

    /* renamed from: d  reason: collision with root package name */
    TextView f31785d;
    @ViewById

    /* renamed from: e  reason: collision with root package name */
    ImageView f31786e;
    @ViewById

    /* renamed from: f  reason: collision with root package name */
    ImageView f31787f;
    @ViewById

    /* renamed from: g  reason: collision with root package name */
    ImageView f31788g;
    @ViewById

    /* renamed from: h  reason: collision with root package name */
    ImageView f31789h;
    @ViewById

    /* renamed from: i  reason: collision with root package name */
    ImageView f31790i;
    @ViewById

    /* renamed from: j  reason: collision with root package name */
    TextView f31791j;
    @ViewById

    /* renamed from: k  reason: collision with root package name */
    LinearLayout f31792k;
    @ViewById

    /* renamed from: l  reason: collision with root package name */
    LinearLayout f31793l;
    @ViewById

    /* renamed from: m  reason: collision with root package name */
    XRecyclerView f31794m;
    @ViewById

    /* renamed from: n  reason: collision with root package name */
    TextView f31795n;
    @ViewById

    /* renamed from: o  reason: collision with root package name */
    RelativeLayout f31796o;
    @ViewById

    /* renamed from: p  reason: collision with root package name */
    RelativeLayout f31797p;
    @ViewById

    /* renamed from: q  reason: collision with root package name */
    ImageView f31800q;
    @ViewById

    /* renamed from: r  reason: collision with root package name */
    TextView f31801r;
    @ViewById

    /* renamed from: s  reason: collision with root package name */
    ProgressBar f31802s;
    @ViewById

    /* renamed from: t  reason: collision with root package name */
    LinearLayout f31803t;
    @ViewById

    /* renamed from: u  reason: collision with root package name */
    RelativeLayout f31804u;
    @ViewById

    /* renamed from: v  reason: collision with root package name */
    RelativeLayout f31805v;
    @ViewById

    /* renamed from: w  reason: collision with root package name */
    RelativeLayout f31807w;
    @ViewById

    /* renamed from: x  reason: collision with root package name */
    ImageView f31808x;
    @ViewById

    /* renamed from: y  reason: collision with root package name */
    ImageView f31809y;
    @ViewById

    /* renamed from: z  reason: collision with root package name */
    LinearLayout f31810z;
    List<DownloadTask> X = new ArrayList();
    Map<String, DownloadTask> Y = new ConcurrentHashMap();
    private List<CollectionBeanSubBusiness> Z = new ArrayList();

    /* renamed from: p0  reason: collision with root package name */
    private int f31798p0 = 0;

    /* renamed from: p1  reason: collision with root package name */
    private int f31799p1 = 0;

    /* renamed from: v1  reason: collision with root package name */
    private boolean f31806v1 = false;
    private boolean A1 = false;
    int C1 = 2;
    boolean F1 = false;
    private CommentAllListBean.SelfCommentBean J1 = null;
    Runnable K1 = new d();
    private boolean L1 = true;
    Map<String, DownloadTask> M1 = new HashMap();
    Map<String, DownloadTask> N1 = new HashMap();
    com.join.mgps.customview.o X1 = null;
    com.join.mgps.customview.o Y1 = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GameDetialModleFourActivity.this.V0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class b implements w1.j {
        b() {
        }

        @Override // w1.j
        public void a(Object obj) {
            w1.i iVar = GameDetialModleFourActivity.this.V;
            if (iVar != null) {
                iVar.H();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class c implements w1.j {
        c() {
        }

        @Override // w1.j
        public void a(Object obj) {
            w1.i iVar = GameDetialModleFourActivity.this.V;
            if (iVar != null) {
                iVar.U();
            }
        }
    }

    /* loaded from: classes4.dex */
    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (GameDetialModleFourActivity.this.f31783b.isFinishing() || GameDetialModleFourActivity.this.isHidden()) {
                return;
            }
            GameDetialModleFourActivity gameDetialModleFourActivity = GameDetialModleFourActivity.this;
            gameDetialModleFourActivity.W.q(gameDetialModleFourActivity.f31794m);
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
    public class f implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ GiftPackageDataInfoBean f31816b;

        f(GiftPackageDataInfoBean giftPackageDataInfoBean) {
            this.f31816b = giftPackageDataInfoBean;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ((ClipboardManager) GameDetialModleFourActivity.this.f31783b.getSystemService("clipboard")).setText(this.f31816b.getGift_package_code());
            com.join.mgps.Util.l2 a5 = com.join.mgps.Util.l2.a(GameDetialModleFourActivity.this.f31783b);
            a5.b(this.f31816b.getGift_package_code() + "已复制到剪贴板");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class g implements View.OnClickListener {
        g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (GameDetialModleFourActivity.this.S == null || !GameDetialModleFourActivity.this.S.isShowing()) {
                return;
            }
            GameDetialModleFourActivity.this.S.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class h implements View.OnClickListener {
        h() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DownloadTask F;
            if (GameDetialModleFourActivity.this.S != null && GameDetialModleFourActivity.this.S.isShowing()) {
                GameDetialModleFourActivity.this.S.dismiss();
            }
            int status = GameDetialModleFourActivity.this.G != null ? GameDetialModleFourActivity.this.G.getStatus() : 0;
            if (GameDetialModleFourActivity.this.O != null && UtilsMy.w0(GameDetialModleFourActivity.this.O.getPay_tag_info(), GameDetialModleFourActivity.this.O.getCrc_sign_id()) > 0) {
                status = 43;
            }
            if (status != 0) {
                if (status == 5) {
                    UtilsMy.W3(GameDetialModleFourActivity.this.f31783b, GameDetialModleFourActivity.this.G, "2");
                    return;
                } else if (status != 9 && status != 43) {
                    return;
                }
            }
            GameDetialModleFourActivity.this.G.setKeyword(Where.detail.name());
            if (com.join.mgps.Util.g2.i(GameDetialModleFourActivity.this.G.getCrc_link_type_val()) && (F = p1.f.K().F(GameDetialModleFourActivity.this.G.getCrc_link_type_val())) != null) {
                UtilsMy.y4(GameDetialModleFourActivity.this.G, F);
            }
            GameDetialModleFourActivity gameDetialModleFourActivity = GameDetialModleFourActivity.this;
            gameDetialModleFourActivity.addFrom(gameDetialModleFourActivity.G);
            if (GameDetialModleFourActivity.this.O != null) {
                if (UtilsMy.y0(GameDetialModleFourActivity.this.O.getPay_tag_info(), GameDetialModleFourActivity.this.O.getCrc_sign_id()) <= 0) {
                    UtilsMy.C1(GameDetialModleFourActivity.this.G, GameDetialModleFourActivity.this.O);
                    if (GameDetialModleFourActivity.this.O.getDown_status() == 5) {
                        UtilsMy.l1(GameDetialModleFourActivity.this.f31783b, GameDetialModleFourActivity.this.G);
                    } else {
                        UtilsMy.R0(GameDetialModleFourActivity.this.f31783b, GameDetialModleFourActivity.this.G, GameDetialModleFourActivity.this.O.getTp_down_url(), GameDetialModleFourActivity.this.O.getOther_down_switch(), GameDetialModleFourActivity.this.O.getCdn_down_switch());
                    }
                } else {
                    ExtBean extBean = GameDetialModleFourActivity.this.L;
                    if (extBean == null || !"checkgame".equals(extBean.getFrom())) {
                        if (GameDetialModleFourActivity.this.O.getDown_status() == 5) {
                            UtilsMy.l1(GameDetialModleFourActivity.this.f31783b, GameDetialModleFourActivity.this.G);
                        } else {
                            UtilsMy.d4(GameDetialModleFourActivity.this.f31783b, GameDetialModleFourActivity.this.K);
                        }
                    } else {
                        GamedetailVideoMainActivity gamedetailVideoMainActivity = GameDetialModleFourActivity.this.f31783b;
                        GameDetialModleFourActivity gameDetialModleFourActivity2 = GameDetialModleFourActivity.this;
                        UtilsMy.e4(gamedetailVideoMainActivity, gameDetialModleFourActivity2.K, gameDetialModleFourActivity2.L.getFrom_id());
                    }
                }
            }
            GameDetialModleFourActivity.this.G.setStatus(2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class i implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ GiftPackageDataOperationBean f31820b;

        i(GiftPackageDataOperationBean giftPackageDataOperationBean) {
            this.f31820b = giftPackageDataOperationBean;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ((ClipboardManager) GameDetialModleFourActivity.this.f31783b.getSystemService("clipboard")).setText(this.f31820b.getGift_info().getGift_package_code());
            com.join.mgps.Util.l2 a5 = com.join.mgps.Util.l2.a(GameDetialModleFourActivity.this.f31783b);
            a5.b(this.f31820b.getGift_info().getGift_package_code() + "已复制到剪贴板");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class j implements View.OnClickListener {
        j() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (GameDetialModleFourActivity.this.S == null || !GameDetialModleFourActivity.this.S.isShowing()) {
                return;
            }
            GameDetialModleFourActivity.this.S.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class k extends RecyclerView.OnScrollListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LinearLayoutManager f31823a;

        k(LinearLayoutManager linearLayoutManager) {
            this.f31823a = linearLayoutManager;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int i4) {
            super.onScrollStateChanged(recyclerView, i4);
            GameDetialModleFourActivity gameDetialModleFourActivity = GameDetialModleFourActivity.this;
            if (gameDetialModleFourActivity.W == null || gameDetialModleFourActivity.isHidden()) {
                return;
            }
            GameDetialModleFourActivity.this.W.m(recyclerView, i4);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(@NonNull RecyclerView recyclerView, int i4, int i5) {
            super.onScrolled(recyclerView, i4, i5);
            GameDetialModleFourActivity.this.f31799p1 = this.f31823a.findFirstVisibleItemPosition();
            GameDetialModleFourActivity.this.f31798p0 = this.f31823a.findLastVisibleItemPosition();
            GameDetialModleFourActivity gameDetialModleFourActivity = GameDetialModleFourActivity.this;
            if (gameDetialModleFourActivity.W == null || gameDetialModleFourActivity.isHidden()) {
                return;
            }
            GameDetialModleFourActivity gameDetialModleFourActivity2 = GameDetialModleFourActivity.this;
            gameDetialModleFourActivity2.W.i(recyclerView, gameDetialModleFourActivity2.f31799p1, GameDetialModleFourActivity.this.f31798p0 - GameDetialModleFourActivity.this.f31799p1, GameDetialModleFourActivity.this.N.getItemCount());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class l implements View.OnClickListener {
        l() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DownloadTask F;
            if (GameDetialModleFourActivity.this.S != null && GameDetialModleFourActivity.this.S.isShowing()) {
                GameDetialModleFourActivity.this.S.dismiss();
            }
            int status = GameDetialModleFourActivity.this.G != null ? GameDetialModleFourActivity.this.G.getStatus() : 0;
            if (GameDetialModleFourActivity.this.O != null && UtilsMy.w0(GameDetialModleFourActivity.this.O.getPay_tag_info(), GameDetialModleFourActivity.this.O.getCrc_sign_id()) > 0) {
                status = 43;
            }
            if (status != 0) {
                if (status == 5) {
                    UtilsMy.W3(GameDetialModleFourActivity.this.f31783b, GameDetialModleFourActivity.this.G, "2");
                    return;
                } else if (status != 9 && status != 43) {
                    return;
                }
            }
            if (GameDetialModleFourActivity.this.O.getDown_status() == 2) {
                return;
            }
            if (com.join.mgps.Util.g2.i(GameDetialModleFourActivity.this.G.getCrc_link_type_val()) && (F = p1.f.K().F(GameDetialModleFourActivity.this.G.getCrc_link_type_val())) != null) {
                UtilsMy.y4(GameDetialModleFourActivity.this.G, F);
            }
            GameDetialModleFourActivity.this.G.setKeyword(Where.detail.name());
            if (GameDetialModleFourActivity.this.O != null) {
                if (UtilsMy.y0(GameDetialModleFourActivity.this.O.getPay_tag_info(), GameDetialModleFourActivity.this.O.getCrc_sign_id()) > 0) {
                    UtilsMy.d4(GameDetialModleFourActivity.this.f31783b, GameDetialModleFourActivity.this.K);
                } else {
                    GameDetialModleFourActivity gameDetialModleFourActivity = GameDetialModleFourActivity.this;
                    gameDetialModleFourActivity.addFrom(gameDetialModleFourActivity.G);
                    UtilsMy.C1(GameDetialModleFourActivity.this.G, GameDetialModleFourActivity.this.O);
                    if (!UtilsMy.o1(GameDetialModleFourActivity.this.f31783b, GameDetialModleFourActivity.this.G)) {
                        if (GameDetialModleFourActivity.this.O.getDown_status() == 5) {
                            UtilsMy.l1(GameDetialModleFourActivity.this.f31783b, GameDetialModleFourActivity.this.G);
                        } else {
                            UtilsMy.R0(GameDetialModleFourActivity.this.f31783b, GameDetialModleFourActivity.this.G, GameDetialModleFourActivity.this.O.getTp_down_url(), GameDetialModleFourActivity.this.O.getOther_down_switch(), GameDetialModleFourActivity.this.O.getCdn_down_switch());
                        }
                    }
                }
            }
            GameDetialModleFourActivity.this.G.setStatus(2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class m implements Animation.AnimationListener {
        m() {
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
    public class n implements GameDetialModleFourAdapter.p1 {
        n() {
        }

        @Override // com.join.mgps.adapter.GameDetialModleFourAdapter.p1
        public void a(InformationCommentBean informationCommentBean) {
            if (IntentUtil.getInstance().goLoginInteractive(GameDetialModleFourActivity.this.f31783b)) {
                return;
            }
            GameDetialModleFourActivity.this.H0(informationCommentBean);
        }

        @Override // com.join.mgps.adapter.GameDetialModleFourAdapter.p1
        public void b(CommentBaseBean commentBaseBean, int i4, int i5) {
            GameDetialModleFourActivity.this.D0(commentBaseBean, i4, i5);
        }

        @Override // com.join.mgps.adapter.GameDetialModleFourAdapter.p1
        public void c(CommentBaseBean commentBaseBean, int i4, int i5) {
            GameDetialModleFourActivity.this.F0(commentBaseBean, i4, i5);
        }

        @Override // com.join.mgps.adapter.GameDetialModleFourAdapter.p1
        public void d(CommentBaseBean commentBaseBean) {
            GameDetialModleFourActivity.this.E0(commentBaseBean);
        }

        @Override // com.join.mgps.adapter.GameDetialModleFourAdapter.p1
        public void e(InformationCommentBean.Sub sub) {
            InformationCommentBean informationCommentBean = new InformationCommentBean();
            informationCommentBean.setUser_name(sub.getUser_name());
            informationCommentBean.setComment_id(sub.getUser_id());
            informationCommentBean.setUser_id(sub.getUser_id());
            if (GameDetialModleFourActivity.this.O != null) {
                GameCommentActivity_.U0(GameDetialModleFourActivity.this.f31783b).a(GameDetialModleFourActivity.this.O.getCrc_sign_id()).d(true).b(informationCommentBean).start();
            }
        }

        @Override // com.join.mgps.adapter.GameDetialModleFourAdapter.p1
        public void f(InformationCommentBean informationCommentBean) {
            if (GameDetialModleFourActivity.this.O != null) {
                GameCommentActivity_.U0(GameDetialModleFourActivity.this.f31783b).a(GameDetialModleFourActivity.this.O.getCrc_sign_id()).d(true).b(informationCommentBean).start();
            }
        }

        @Override // com.join.mgps.adapter.GameDetialModleFourAdapter.p1
        public void g() {
        }

        @Override // com.join.mgps.adapter.GameDetialModleFourAdapter.p1
        public void h() {
        }

        @Override // com.join.mgps.adapter.GameDetialModleFourAdapter.p1
        public void i() {
            GameDetialModleFourActivity.this.q0();
        }

        @Override // com.join.mgps.adapter.GameDetialModleFourAdapter.p1
        public void j() {
            ForumBean.ForumPostsBean forumPostsBean = new ForumBean.ForumPostsBean();
            forumPostsBean.setPid((int) GameDetialModleFourActivity.this.O.getForum_id());
            com.join.mgps.Util.j0.v0(GameDetialModleFourActivity.this.f31783b, forumPostsBean);
        }

        @Override // com.join.mgps.adapter.GameDetialModleFourAdapter.p1
        public void k() {
            if (GameDetialModleFourActivity.this.O.getGame_book() == 1 || IntentUtil.getInstance().goLoginNetGame(GameDetialModleFourActivity.this.f31783b)) {
                return;
            }
            GameDetialModleFourActivity.this.changeGameFollow(4);
        }

        @Override // com.join.mgps.adapter.GameDetialModleFourAdapter.p1
        public void l(boolean z4, GiftPackageDataInfoBean giftPackageDataInfoBean) {
            if (IntentUtil.getInstance().goLoginNetGame(GameDetialModleFourActivity.this.f31783b)) {
                return;
            }
            if (z4) {
                if (GameDetialModleFourActivity.this.k0(giftPackageDataInfoBean.getGift_package_type())) {
                    GameDetialModleFourActivity.this.v0(giftPackageDataInfoBean);
                    return;
                }
                return;
            }
            GameDetialModleFourActivity.this.W0(giftPackageDataInfoBean);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class o implements XRecyclerView.f {
        o() {
        }

        @Override // com.join.android.app.component.xrecyclerview.XRecyclerView.f
        public void onLoadMore() {
            GameDetialModleFourActivity.this.z0();
        }

        @Override // com.join.android.app.component.xrecyclerview.XRecyclerView.f
        public void onRefresh() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class p implements View.OnClickListener {
        p() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GameDetialModleFourActivity.this.Q0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class q implements View.OnClickListener {
        q() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GameDetialModleFourActivity.this.Q0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class r implements m1.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f31831a;

        r(boolean z4) {
            this.f31831a = z4;
        }

        @Override // com.join.mgps.Util.m1.b
        public void a(m1.c cVar) {
            if (cVar.a() == 1) {
                GameDetialModleFourActivity.this.f31783b.finish();
                com.join.mgps.Util.m1.c().e(GameDetialModleFourActivity.this.f31783b, GameDetialModleFourActivity.this.L.getFrom_id(), cVar.b());
                com.join.mgps.Util.l2.a(GameDetialModleFourActivity.this.f31783b).b("授权成功");
            } else if (this.f31831a) {
                GameDetialModleFourActivity.this.l1(false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class s implements CompoundButton.OnCheckedChangeListener {
        s() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z4) {
            GameDetialModleFourActivity.this.D1.noFavoriteTips().g(Boolean.valueOf(z4));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class t implements View.OnClickListener {
        t() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            com.join.mgps.customview.o oVar = GameDetialModleFourActivity.this.E1;
            if (oVar != null && oVar.isShowing()) {
                GameDetialModleFourActivity.this.E1.dismiss();
            }
            GameDetialModleFourActivity.this.p0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class u implements View.OnClickListener {
        u() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GameDetialModleFourActivity.this.T0();
        }
    }

    public static GameDetialModleFourActivity_ A0(String str, boolean z4, ExtBean extBean) {
        Bundle bundle = new Bundle();
        bundle.putString("gameId", str);
        bundle.putBoolean(GamedetailVideoMainActivity_.AUTODOWN_EXTRA, z4);
        bundle.putSerializable("extBean", extBean);
        GameDetialModleFourActivity_ gameDetialModleFourActivity_ = new GameDetialModleFourActivity_();
        gameDetialModleFourActivity_.setArguments(bundle);
        return gameDetialModleFourActivity_;
    }

    private void I0(DownloadTask downloadTask) {
        Iterator<DownloadTask> it2 = this.X.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            DownloadTask next = it2.next();
            if (next.getCrc_link_type_val().equals(downloadTask.getCrc_link_type_val())) {
                this.Y.remove(next.getCrc_link_type_val());
                it2.remove();
                for (CollectionBeanSubBusiness collectionBeanSubBusiness : this.Z) {
                    if (collectionBeanSubBusiness.getMod_info() != null) {
                        DownloadTask downloadTask2 = this.Y.get(collectionBeanSubBusiness.getMod_info().getMod_game_id());
                        DownloadTask downloadTask3 = this.Y.get(collectionBeanSubBusiness.getGame_id());
                        if (downloadTask2 == null && downloadTask3 == null) {
                            collectionBeanSubBusiness.setDownloadTask(null);
                        } else if (downloadTask2 != null) {
                            collectionBeanSubBusiness.setDownloadTask(downloadTask2);
                        } else if (downloadTask3 != null) {
                            collectionBeanSubBusiness.setDownloadTask(downloadTask3);
                        } else if (collectionBeanSubBusiness.getGame_id().equals(downloadTask.getCrc_link_type_val())) {
                            collectionBeanSubBusiness.setDownloadTask(null);
                        }
                    } else if (collectionBeanSubBusiness.getCrc_sign_id().equals(downloadTask.getCrc_link_type_val())) {
                        collectionBeanSubBusiness.setDownloadTask(null);
                    }
                }
            }
        }
        N0();
    }

    private void J0(DownloadTask downloadTask) {
        Map<String, DownloadTask> map = this.Y;
        if (map == null || downloadTask == null) {
            return;
        }
        try {
            UtilsMy.x4(map.get(downloadTask.getCrc_link_type_val()));
            N0();
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    private void K0(DownloadTask downloadTask) {
        UtilsMy.A4(this.X);
        if (!this.Y.containsKey(downloadTask.getCrc_link_type_val())) {
            this.X.add(downloadTask);
            this.Y.put(downloadTask.getCrc_link_type_val(), downloadTask);
        }
        f1(downloadTask);
        N0();
    }

    private void L0(DownloadTask downloadTask) {
        Map<String, DownloadTask> map = this.Y;
        if (map == null || downloadTask == null) {
            return;
        }
        if (!map.containsKey(downloadTask.getCrc_link_type_val())) {
            this.X.add(downloadTask);
            this.Y.put(downloadTask.getCrc_link_type_val(), downloadTask);
        }
        f1(downloadTask);
        DownloadTask downloadTask2 = this.Y.get(downloadTask.getCrc_link_type_val());
        if (downloadTask2 == null) {
            return;
        }
        downloadTask2.setStatus(downloadTask.getStatus());
        downloadTask2.setVer(downloadTask.getVer());
        downloadTask2.setCfg_ver(downloadTask.getCfg_ver());
        downloadTask2.setSource_ver(downloadTask.getSource_ver());
        N0();
    }

    private void N0() {
        GameDetialModleFourAdapter gameDetialModleFourAdapter = this.N;
        if (gameDetialModleFourAdapter != null) {
            gameDetialModleFourAdapter.notifyDataSetChanged();
        }
    }

    private void R0(List<GameDetialModleFourAdapter.n1> list) {
        GamedetialModleFourBean gamedetialModleFourBean = this.O;
        if (gamedetialModleFourBean == null || gamedetialModleFourBean.getComment_switch() != 1) {
            return;
        }
        int i4 = 0;
        while (this.O.getCommitDataBeanList() != null) {
            if (i4 >= (this.O.getCommitDataBeanList().size() <= 3 ? this.O.getCommitDataBeanList().size() : 3)) {
                break;
            }
            GameDetialModleFourAdapter gameDetialModleFourAdapter = this.N;
            Objects.requireNonNull(gameDetialModleFourAdapter);
            list.add(new GameDetialModleFourAdapter.n1(gameDetialModleFourAdapter, this.O.getCommitDataBeanList().get(i4), 25));
            if (i4 == 0) {
                GameDetialModleFourAdapter gameDetialModleFourAdapter2 = this.N;
                Objects.requireNonNull(gameDetialModleFourAdapter2);
                list.add(new GameDetialModleFourAdapter.n1(gameDetialModleFourAdapter2, "", 27));
            }
            i4++;
        }
        GameDetialModleFourAdapter gameDetialModleFourAdapter3 = this.N;
        Objects.requireNonNull(gameDetialModleFourAdapter3);
        list.add(new GameDetialModleFourAdapter.n1(gameDetialModleFourAdapter3, "评论底部", 16));
    }

    private void S0(InformationCommentBean informationCommentBean, List<GameDetialModleFourAdapter.n1> list) {
        List<InformationCommentBean.Sub> sub = informationCommentBean.getSub();
        if (sub == null || sub.size() <= 0) {
            return;
        }
        GameDetialModleFourAdapter gameDetialModleFourAdapter = this.N;
        Objects.requireNonNull(gameDetialModleFourAdapter);
        list.add(new GameDetialModleFourAdapter.n1(gameDetialModleFourAdapter, new GameDetialModleFourAdapter.r1(informationCommentBean.getComment_id(), informationCommentBean, 0, true), 15));
    }

    private void f1(DownloadTask downloadTask) {
        try {
            for (CollectionBeanSubBusiness collectionBeanSubBusiness : this.Z) {
                if (collectionBeanSubBusiness.getMod_info() != null) {
                    ModInfoBean mod_info = collectionBeanSubBusiness.getMod_info();
                    DownloadTask downloadTask2 = this.Y.get(mod_info.getMain_game_id());
                    boolean z4 = true;
                    boolean z5 = downloadTask2 != null && downloadTask2.getStatus() == 5;
                    DownloadTask downloadTask3 = this.Y.get(mod_info.getMod_game_id());
                    if (downloadTask3 == null || downloadTask3.getStatus() != 5) {
                        z4 = false;
                    }
                    if (z4 && z5) {
                        if (downloadTask.getCrc_link_type_val().equals(collectionBeanSubBusiness.getCrc_sign_id())) {
                            collectionBeanSubBusiness.setDownloadTask(downloadTask);
                            return;
                        }
                    } else if (z4) {
                        if (collectionBeanSubBusiness.getMod_info() != null && downloadTask.getCrc_link_type_val().equals(collectionBeanSubBusiness.getMod_info().getMod_game_id())) {
                            collectionBeanSubBusiness.setDownloadTask(downloadTask);
                            return;
                        }
                    } else if (z5) {
                        if (downloadTask.getCrc_link_type_val().equals(collectionBeanSubBusiness.getCrc_sign_id())) {
                            collectionBeanSubBusiness.setDownloadTask(downloadTask);
                            return;
                        }
                    } else {
                        DownloadTask F = collectionBeanSubBusiness.getMod_info() != null ? p1.f.K().F(collectionBeanSubBusiness.getMod_info().getMod_game_id()) : null;
                        if (F == null) {
                            F = p1.f.K().F(collectionBeanSubBusiness.getCrc_sign_id());
                        }
                        if (F != null && downloadTask.getCrc_link_type_val().equals(F.getCrc_link_type_val())) {
                            collectionBeanSubBusiness.setDownloadTask(downloadTask);
                            return;
                        }
                    }
                } else if (collectionBeanSubBusiness.getCrc_sign_id().equals(downloadTask.getCrc_link_type_val())) {
                    collectionBeanSubBusiness.setDownloadTask(downloadTask);
                    return;
                }
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    private void g1(List<CollectionBeanSubBusiness> list) {
        List<DownloadTask> list2;
        if (list == null || list.size() == 0 || (list2 = this.X) == null || list2.size() == 0) {
            return;
        }
        for (CollectionBeanSubBusiness collectionBeanSubBusiness : list) {
            Iterator<DownloadTask> it2 = this.X.iterator();
            while (true) {
                if (it2.hasNext()) {
                    DownloadTask next = it2.next();
                    if (collectionBeanSubBusiness.getMod_info() != null) {
                        ModInfoBean mod_info = collectionBeanSubBusiness.getMod_info();
                        DownloadTask downloadTask = this.Y.get(mod_info.getMain_game_id());
                        boolean z4 = true;
                        boolean z5 = downloadTask != null && downloadTask.getStatus() == 5;
                        DownloadTask downloadTask2 = this.Y.get(mod_info.getMod_game_id());
                        z4 = (downloadTask2 == null || downloadTask2.getStatus() != 5) ? false : false;
                        if (!z4 || !z5) {
                            if (z4) {
                                if (collectionBeanSubBusiness.getMod_info() != null && next.getCrc_link_type_val().equals(collectionBeanSubBusiness.getMod_info().getMod_game_id())) {
                                    collectionBeanSubBusiness.setDownloadTask(next);
                                    break;
                                }
                            } else if (z5) {
                                if (next.getCrc_link_type_val().equals(collectionBeanSubBusiness.getCrc_sign_id())) {
                                    collectionBeanSubBusiness.setDownloadTask(next);
                                    break;
                                }
                            } else {
                                DownloadTask F = collectionBeanSubBusiness.getMod_info() != null ? p1.f.K().F(collectionBeanSubBusiness.getMod_info().getMod_game_id()) : null;
                                if (F == null) {
                                    F = p1.f.K().F(collectionBeanSubBusiness.getCrc_sign_id());
                                }
                                if (F != null && next.getCrc_link_type_val().equals(F.getCrc_link_type_val())) {
                                    collectionBeanSubBusiness.setDownloadTask(next);
                                    break;
                                }
                            }
                        } else if (next.getCrc_link_type_val().equals(collectionBeanSubBusiness.getCrc_sign_id())) {
                            collectionBeanSubBusiness.setDownloadTask(next);
                            break;
                        }
                    } else if (next.getCrc_link_type_val().equals(collectionBeanSubBusiness.getCrc_sign_id())) {
                        collectionBeanSubBusiness.setDownloadTask(next);
                        break;
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean k0(String str) {
        if (com.join.mgps.Util.g2.h(str)) {
            com.join.mgps.Util.l2.a(this.f31783b).b(this.f31783b.getString(R.string.unknow_gift_type));
            return false;
        }
        com.wufan.user.service.protobuf.n0 accountData = AccountUtil_.getInstance_(this.f31783b).getAccountData();
        if (str.equals("6")) {
            if (!com.join.mgps.Util.b.piv(accountData)) {
                Z0();
                return false;
            }
        } else if (str.equals("7") && accountData.j1() <= 0) {
            Y0();
            return false;
        }
        return true;
    }

    private void l0() {
        com.join.mgps.customview.o oVar = this.X1;
        if (oVar == null || !oVar.isShowing()) {
            return;
        }
        this.X1.dismiss();
    }

    private void m0() {
        com.join.mgps.customview.o oVar = this.Y1;
        if (oVar == null || !oVar.isShowing()) {
            return;
        }
        this.Y1.dismiss();
    }

    private void m1() {
        CollectionBeanSubBusiness collectionBeanSubBusiness;
        DownloadTask downloadTask;
        if (this.f31806v1) {
            return;
        }
        for (int i4 = this.f31799p1; i4 <= this.f31798p0; i4++) {
            GameDetialModleFourAdapter.n1 n1Var = this.N.y().get(i4);
            if (n1Var != null) {
                Object obj = n1Var.f42456a;
                if ((obj instanceof CollectionBeanSubBusiness) && (collectionBeanSubBusiness = (CollectionBeanSubBusiness) obj) != null && (downloadTask = collectionBeanSubBusiness.getDownloadTask()) != null && (downloadTask.getStatus() == 2 || downloadTask.getStatus() == 12)) {
                    View childAt = this.f31794m.getChildAt(i4 - this.f31799p1);
                    try {
                        DownloadTask f5 = com.join.android.app.common.servcie.i.e().f(downloadTask.getCrc_link_type_val());
                        if (f5 == null) {
                            return;
                        }
                        long parseDouble = (long) (Double.parseDouble(f5.getShowSize()) * 1024.0d * 1024.0d);
                        if (downloadTask.getSize() == 0) {
                            ((TextView) childAt.findViewById(R.id.appSize)).setText(UtilsMy.a(f5.getCurrentSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(parseDouble));
                        } else {
                            ((TextView) childAt.findViewById(R.id.appSize)).setText(UtilsMy.a(f5.getCurrentSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(parseDouble));
                        }
                        if (downloadTask.getStatus() == 12) {
                            ((ProgressBar) childAt.findViewById(R.id.progressBarZip)).setProgress((int) f5.getProgress());
                        } else {
                            ((ProgressBar) childAt.findViewById(R.id.progressBar)).setProgress((int) f5.getProgress());
                        }
                        if (downloadTask.getStatus() == 2) {
                            ((TextView) childAt.findViewById(R.id.loding_info)).setText(f5.getSpeed() + "/S");
                        }
                    } catch (Exception e5) {
                        e5.printStackTrace();
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Receiver(actions = {o1.a.G, o1.a.I})
    public void B0(@Receiver.Extra("gameData") CollectionBeanSub collectionBeanSub) {
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
    public void C0() {
        e1();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void D0(CommentBaseBean commentBaseBean, int i4, int i5) {
        if (com.join.android.app.common.utils.j.j(this.f31783b)) {
            try {
                CommentResponse<CommentPraiseBean> h4 = this.J.h(s0(commentBaseBean.getId(), i5, commentBaseBean.getPn()));
                if (h4 != null) {
                    if (h4.getCode() == 801) {
                        P0(h4);
                    } else if (h4.getSucc() != 1) {
                        O0(h4.getMsg(), true, i4, 1);
                    }
                    if (h4.getSucc() == 1) {
                        j0(i4, 1);
                        return;
                    }
                    return;
                }
                O0("操作失败，请稍候再试~", true, i4, 1);
                return;
            } catch (Exception e5) {
                O0("操作失败，请稍候再试~", true, i4, 1);
                e5.printStackTrace();
                return;
            }
        }
        O0("网络连接失败，再试试吧~", true, i4, 1);
    }

    void E0(CommentBaseBean commentBaseBean) {
        CommentDetailActivity_.M1(this.f31783b).d(commentBaseBean.getGame_id()).b(commentBaseBean.getId()).f(this.O.getPlugin_num()).a(this.O.getBespeak_switch()).e(this.O.getIs_started()).c(this.O.getComment_score_switch()).h(this.O.getGame_score().getSgc_switch()).g(this.O.getPackageName()).start();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void F0(CommentBaseBean commentBaseBean, int i4, int i5) {
        if (com.join.android.app.common.utils.j.j(this.f31783b)) {
            try {
                CommentResponse<CommentPraiseBean> l4 = this.J.l(s0(commentBaseBean.getId(), i5, commentBaseBean.getPn()));
                if (l4 != null) {
                    if (l4.getCode() == 801) {
                        P0(l4);
                    } else if (l4.getSucc() != 1) {
                        O0(l4.getMsg(), true, i4, 2);
                    }
                    if (l4.getSucc() == 1) {
                        j0(i4, 2);
                        return;
                    }
                    return;
                }
                O0("操作失败，请稍候再试~", true, i4, 2);
                return;
            } catch (Exception e5) {
                O0("操作失败，请稍候再试~", true, i4, 2);
                e5.printStackTrace();
                return;
            }
        }
        O0("网络连接失败，再试试吧~", true, i4, 2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Receiver(actions = {"com.join,mgps.sim.sdkgamePayfinish"})
    public void G0(Intent intent) {
        this.f31783b.finish();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void H0(InformationCommentBean informationCommentBean) {
        if (com.join.android.app.common.utils.j.j(this.f31783b)) {
            try {
                GamePariseRequest gamePariseRequest = new GamePariseRequest();
                gamePariseRequest.setGame_id(this.K);
                gamePariseRequest.setComment_id(informationCommentBean.getComment_id() + "");
                gamePariseRequest.setUid(this.R.getUid());
                ResultMainBean<List<PariseBackData>> b5 = this.H.b(RequestBeanUtil.getInstance(this.f31783b).getGameDetailParis(gamePariseRequest));
                if (b5 != null && b5.getFlag() == 1) {
                    List<PariseBackData> data = b5.getMessages().getData();
                    if (data.size() > 0) {
                        if (data.get(0).isVal()) {
                            for (CommentBaseBean commentBaseBean : this.G1) {
                            }
                            e1();
                            return;
                        }
                        showToast("你已赞过");
                        return;
                    }
                    showToast("你已赞过");
                    return;
                }
                C0();
                showToast("点赞失败");
                return;
            } catch (Exception e5) {
                e5.printStackTrace();
                C0();
                showToast("点赞失败");
                return;
            }
        }
        showToast("没有网络");
    }

    @Override // w1.n
    public void L(boolean z4) {
        if (z4) {
            this.T = false;
            com.join.android.app.component.video.c cVar = this.W;
            if (cVar != null) {
                cVar.I();
                return;
            }
            return;
        }
        com.join.android.app.component.video.c cVar2 = this.W;
        if (cVar2 != null) {
            cVar2.H();
        }
        this.T = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Receiver(actions = {o1.a.B})
    public void M0(Intent intent) {
        this.R = AccountUtil_.getInstance_(this.f31783b).getAccountData();
        u0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void O0(String str, boolean z4, int i4, int i5) {
        com.join.mgps.Util.l2.a(this.f31783b).b(str);
        if (z4) {
            if (i5 == 1) {
                this.N.H(i4, 0);
            } else {
                this.N.G(i4, 0);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void P0(CommentResponse commentResponse) {
        if (commentResponse.getCode() == 801) {
            x0();
            com.join.mgps.Util.l2.a(this.f31783b).b("数据访问失败，请稍候再试！");
            return;
        }
        com.join.mgps.Util.l2.a(this.f31783b).b(commentResponse.getMsg());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void Q0() {
        IntentUtil.getInstance().goSearchHintActivity(this.f31783b);
        com.papa.sim.statistic.p.l(this.f31783b).u2(Where.detial2, AccountUtil_.getInstance_(this.f31783b).getUid());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void T0() {
        ShareBean shareBean = new ShareBean();
        String share_url = this.O.getShare_url();
        shareBean.setqZoneShareUrl(share_url);
        shareBean.setQqUrl(share_url);
        shareBean.setWechatFriendUrl(share_url);
        shareBean.setWechatShareUrl(share_url);
        shareBean.setWeiboShareUrl(share_url);
        shareBean.setTitle(this.O.getGame_name());
        shareBean.setText(this.O.getInfo());
        shareBean.setImageUrl(this.O.getIco_remote());
        shareBean.setFrom(2);
        shareBean.setGameId(this.O.getGame_id());
        if (this.O.getShare_config() != null && this.O.getShare_config().getShare_switch() == 1) {
            shareBean.setIntentData(this.O.getShare_config().getJump_info());
        }
        com.join.mgps.Util.s.r(this.f31783b, shareBean);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void U0() {
        ShareBean shareBean = new ShareBean();
        String share_url = this.O.getShare_url();
        shareBean.setqZoneShareUrl(share_url);
        shareBean.setQqUrl(share_url);
        shareBean.setWechatFriendUrl(share_url);
        shareBean.setWechatShareUrl(share_url);
        shareBean.setWeiboShareUrl(share_url);
        shareBean.setImageUrl(this.O.getIco_remote());
        shareBean.setTitle(this.O.getGame_name());
        shareBean.setText(this.O.getInfo());
        shareBean.setFrom(2);
        shareBean.setGameId(this.O.getGame_id());
        if (this.O.getShare_config() != null && this.O.getShare_config().getShare_switch() == 1) {
            shareBean.setIntentData(this.O.getShare_config().getJump_info());
        }
        com.join.mgps.Util.s.r(this.f31783b, shareBean);
    }

    void V0() {
        ShareBean shareBean = new ShareBean();
        String str = this.O.getActivity_entry().getUrl() + this.O.getCrc_sign_id();
        shareBean.setqZoneShareUrl(str);
        shareBean.setQqUrl(str);
        shareBean.setWechatFriendUrl(str);
        shareBean.setWechatShareUrl(str);
        shareBean.setWeiboShareUrl(str);
        shareBean.setTitle(this.O.getGame_name());
        shareBean.setText(this.O.getInfo());
        shareBean.setImageUrl(this.O.getIco_remote());
        shareBean.setFrom(2);
        shareBean.setGameId(this.O.getGame_id());
        com.join.mgps.Util.s.r(this.f31783b, shareBean);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:28:0x013a A[Catch: Exception -> 0x015b, TryCatch #0 {Exception -> 0x015b, blocks: (B:3:0x0002, B:5:0x0009, B:7:0x000f, B:8:0x0017, B:10:0x00c8, B:12:0x00ce, B:21:0x00ef, B:26:0x0131, B:28:0x013a, B:29:0x0142, B:31:0x014e, B:34:0x0155, B:22:0x00f5, B:23:0x00fb, B:25:0x0102), top: B:39:0x0002 }] */
    @org.androidannotations.annotations.UiThread
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void W0(com.join.mgps.dto.GiftPackageDataInfoBean r12) {
        /*
            Method dump skipped, instructions count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.mgps.activity.GameDetialModleFourActivity.W0(com.join.mgps.dto.GiftPackageDataInfoBean):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void X0(GiftPackageDataOperationBean giftPackageDataOperationBean) {
        com.join.mgps.customview.o oVar;
        com.join.mgps.customview.o oVar2 = this.S;
        if (oVar2 != null && oVar2.isShowing()) {
            this.S.dismiss();
            this.S = null;
        }
        com.join.mgps.customview.o oVar3 = new com.join.mgps.customview.o(this.f31783b, R.style.MyDialog);
        this.S = oVar3;
        oVar3.setContentView(R.layout.save_code_dialog);
        Button button = (Button) this.S.findViewById(R.id.dialog_button_cancle);
        Button button2 = (Button) this.S.findViewById(R.id.dialog_button_ok);
        TextView textView = (TextView) this.S.findViewById(R.id.moneyText);
        ((TextView) this.S.findViewById(R.id.tip_title)).setText("领号成功");
        ((TextView) this.S.findViewById(R.id.saveCodeContent)).setText(giftPackageDataOperationBean.getGift_info().getGift_package_code());
        button2.setText("关闭");
        button.setText("下载游戏");
        ((TextView) this.S.findViewById(R.id.saveCodeTv)).setOnClickListener(new i(giftPackageDataOperationBean));
        button2.setOnClickListener(new j());
        if (this.O.getDown_status() == 2) {
            button.setEnabled(false);
            button.setText("即将开放");
        }
        DownloadTask downloadTask = this.G;
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
            button.setOnClickListener(new l());
            N0();
            oVar = this.S;
            if (oVar != null || oVar.isShowing()) {
            }
            this.S.show();
            return;
        }
        button.setText("下载游戏");
        if (giftPackageDataOperationBean.getGame_info() != null) {
            UtilsMy.w0(giftPackageDataOperationBean.getGame_info().getPay_tag_info(), giftPackageDataOperationBean.getGame_info().getCrc_sign_id());
            UtilsMy.r3(button, giftPackageDataOperationBean.getGame_info().getDown_status(), giftPackageDataOperationBean.getGame_info().getPay_tag_info(), giftPackageDataOperationBean.getGame_info().getCrc_sign_id());
            UtilsMy.k3(giftPackageDataOperationBean.getGame_info().getSp_tag_info(), textView);
        }
        button.setOnClickListener(new l());
        N0();
        oVar = this.S;
        if (oVar != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void Y0() {
        com.join.mgps.customview.o oVar = this.X1;
        if (oVar != null) {
            if (oVar.isShowing()) {
                return;
            }
        } else {
            this.X1 = com.join.mgps.Util.b0.f0(this.f31783b).c0(this.f31783b);
        }
        this.X1.show();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void Z0() {
        com.join.mgps.customview.o oVar = this.Y1;
        if (oVar != null) {
            if (oVar.isShowing()) {
                return;
            }
        } else {
            this.Y1 = com.join.mgps.Util.b0.f0(this.f31783b).e0(this.f31783b);
        }
        this.Y1.show();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread(delay = 4000)
    public void a1() {
        GameDetialModleFourAdapter gameDetialModleFourAdapter = this.N;
        if (gameDetialModleFourAdapter != null && gameDetialModleFourAdapter.s() != null) {
            com.join.mgps.Util.c.g(this.N.s());
        }
        a1();
    }

    void addFrom(DownloadTask downloadTask) {
        ExtBean extBean = this.L;
        if (extBean == null || TextUtils.isEmpty(extBean.getFrom()) || downloadTask == null || !"112".equals(this.L.getFrom())) {
            return;
        }
        ExtBean extBean2 = new ExtBean();
        extBean2.setFrom("101");
        extBean2.setPosition("112");
        extBean2.setLocation(this.L.getLocation());
        downloadTask.setExt(JsonMapper.toJsonString(extBean2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterView() {
        this.H = com.join.mgps.rpc.impl.d.P1();
        this.I = com.join.mgps.rpc.impl.g.A0();
        this.J = com.join.mgps.rpc.impl.e.m();
        this.f31783b = (GamedetailVideoMainActivity) getActivity();
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.K = arguments.getString("gameId");
            this.M = arguments.getBoolean(GamedetailVideoMainActivity_.AUTODOWN_EXTRA);
            this.L = (ExtBean) arguments.getSerializable("extBean");
        }
        this.f31808x.setVisibility(0);
        this.f31809y.setVisibility(0);
        com.join.mgps.Util.d0.a().d(this);
        this.G = p1.f.K().F(this.K);
        getDownloadTaskInfo();
        this.O = new GamedetialModleFourBean();
        com.join.android.app.component.video.a.n0(Z1);
        this.W = new com.join.android.app.component.video.c(this.f31783b, Z1);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.f31783b);
        this.f31794m.setLayoutManager(linearLayoutManager);
        this.f31794m.addOnScrollListener(new k(linearLayoutManager));
        this.U = new com.join.mgps.recycler.c(linearLayoutManager, this.f31794m);
        if (this.N == null) {
            this.N = new GameDetialModleFourAdapter(requireActivity(), this.O, this.W);
        }
        this.N.L(this.V);
        ExtBean extBean = this.L;
        if (extBean != null) {
            this.N.T(extBean.get_from_type());
        }
        this.f31794m.setAdapter(this.N);
        this.N.M(new n());
        LinearLayoutManager linearLayoutManager2 = (LinearLayoutManager) this.f31794m.getLayoutManager();
        this.P = linearLayoutManager2;
        linearLayoutManager2.setSmoothScrollbarEnabled(true);
        this.P.setAutoMeasureEnabled(true);
        this.f31794m.setLayoutManager(this.P);
        this.A.setVisibility(0);
        this.f31794m.setPullRefreshEnabled(false);
        this.f31794m.setLoadingListener(new o());
        GamedetialModleFourBean modleFourBeanShow = ((GamedetailVideoMainActivity) getActivity()).getModleFourBeanShow();
        if (modleFourBeanShow != null) {
            o1(modleFourBeanShow, false);
        } else {
            t0();
        }
        this.S1.setOnClickListener(new p());
        this.T1.setOnClickListener(new q());
        ExtBean extBean2 = this.L;
        if (extBean2 != null) {
            extBean2.getFrom();
            this.L.getPosition();
            this.L.getLocation();
        }
        l1(false);
    }

    void b1() {
        ImageView imageView = this.R1;
        if (imageView == null) {
            return;
        }
        imageView.setImageResource(R.drawable.line_blue_bg);
        Animation loadAnimation = AnimationUtils.loadAnimation(this.f31783b, R.anim.img_translate);
        this.W1 = loadAnimation;
        loadAnimation.setFillAfter(true);
        this.W1.setFillAfter(true);
        this.U1.setVisibility(0);
        this.U1.startAnimation(this.W1);
        this.W1.setAnimationListener(new m());
    }

    void c1() {
        ImageView imageView = this.U1;
        if (imageView != null) {
            imageView.clearAnimation();
            this.U1.setVisibility(8);
            this.R1.setImageResource(R.drawable.line_white_bg);
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
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r4 = r2.M1
            boolean r4 = r4.containsKey(r0)
            if (r4 != 0) goto L2d
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r4 = r2.M1
            r4.put(r0, r3)
        L2d:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r4 = r2.N1
            boolean r4 = r4.containsKey(r0)
            if (r4 != 0) goto La7
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r4 = r2.N1
            r4.put(r0, r3)
            goto La7
        L3b:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.M1
            boolean r3 = r3.containsKey(r0)
            if (r3 == 0) goto L48
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.M1
            r3.remove(r0)
        L48:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.N1
            boolean r3 = r3.containsKey(r0)
            if (r3 == 0) goto La7
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.N1
            r3.remove(r0)
            goto La7
        L56:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.N1
            boolean r3 = r3.containsKey(r0)
            if (r3 == 0) goto La7
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.N1
            r3.remove(r0)
            goto La7
        L64:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.M1
            boolean r3 = r3.containsKey(r0)
            if (r3 == 0) goto L71
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.M1
            r3.remove(r0)
        L71:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.N1
            boolean r3 = r3.containsKey(r0)
            if (r3 == 0) goto La7
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.N1
            r3.remove(r0)
            goto La7
        L7f:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.N1
            boolean r3 = r3.containsKey(r0)
            if (r3 == 0) goto La7
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.N1
            r3.remove(r0)
            goto La7
        L8d:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r4 = r2.M1
            boolean r4 = r4.containsKey(r0)
            if (r4 != 0) goto L9a
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r4 = r2.M1
            r4.put(r0, r3)
        L9a:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r4 = r2.N1
            boolean r4 = r4.containsKey(r0)
            if (r4 != 0) goto La7
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r4 = r2.N1
            r4.put(r0, r3)
        La7:
            r2.updateDownloadView()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.mgps.activity.GameDetialModleFourActivity.changeDownloadTaskNumber(com.github.snowdream.android.app.downloader.DownloadTask, int):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void changeGameFollow(int i4) {
        String str;
        if (com.join.android.app.common.utils.j.j(this.f31783b)) {
            com.wufan.user.service.protobuf.n0 accountData = AccountUtil_.getInstance_(this.f31783b).getAccountData();
            this.R = accountData;
            int uid = accountData != null ? accountData.getUid() : 0;
            try {
                PackageInfo packageInfo = this.f31783b.getPackageManager().getPackageInfo(this.f31783b.getPackageName(), 0);
                str = packageInfo.versionCode + "_" + packageInfo.versionName;
            } catch (PackageManager.NameNotFoundException e5) {
                e5.printStackTrace();
                str = "";
            }
            RequestdetialFolowAndBeSpeak requestdetialFolowAndBeSpeak = new RequestdetialFolowAndBeSpeak();
            requestdetialFolowAndBeSpeak.setApp_ver(str);
            requestdetialFolowAndBeSpeak.setGame_id(this.O.getCrc_sign_id());
            requestdetialFolowAndBeSpeak.setUid(uid);
            requestdetialFolowAndBeSpeak.setMobile(this.R.z());
            CommonRequestBean<RequestGameIdArgs> detialFollowAnd = RequestBeanUtil.getInstance(this.f31783b).getDetialFollowAnd(requestdetialFolowAndBeSpeak);
            ResultMainBean resultMainBean = null;
            if (i4 == 1) {
                resultMainBean = this.H.O0(detialFollowAnd);
            } else if (i4 == 2) {
                resultMainBean = this.H.D(detialFollowAnd);
            } else if (i4 == 3) {
                resultMainBean = this.H.o(detialFollowAnd);
            } else if (i4 == 4) {
                resultMainBean = this.H.d0(detialFollowAnd);
            }
            if (resultMainBean != null) {
                updateTitleButn(resultMainBean, i4);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void d1() {
        IntentUtil.getInstance().goMyGameManagerActivity(this.f31783b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void e1() {
        if (this.O.getGame_id() != null) {
            o1(this.O, true);
        }
    }

    public GameDetialModleFourActivity g0(w1.i iVar) {
        this.V = iVar;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void getDownloadTaskInfo() {
        List<DownloadTask> r4 = p1.f.K().r();
        List<DownloadTask> q4 = p1.f.K().q();
        if (q4 != null && q4.size() > 0) {
            for (DownloadTask downloadTask : q4) {
                this.M1.put(downloadTask.getCrc_link_type_val(), downloadTask);
            }
        }
        if (r4 != null && r4.size() > 0) {
            for (DownloadTask downloadTask2 : r4) {
                this.N1.put(downloadTask2.getCrc_link_type_val(), downloadTask2);
            }
        }
        updateDownloadView();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void h0() {
        this.f31783b.finish();
        y0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void h1(int i4) {
        try {
            if (i4 < 100) {
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.Q1.getLayoutParams();
                layoutParams.width = getResources().getDimensionPixelOffset(R.dimen.wdp24);
                layoutParams.height = getResources().getDimensionPixelOffset(R.dimen.wdp24);
                this.Q1.setLayoutParams(layoutParams);
                this.Q1.setCompoundDrawables(null, null, null, null);
                this.Q1.setBackgroundResource(R.drawable.mygame_big_round);
                this.Q1.setPadding(1, 0, 0, 1);
            } else {
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.Q1.getLayoutParams();
                layoutParams2.width = getResources().getDimensionPixelOffset(R.dimen.dp70);
                layoutParams2.height = getResources().getDimensionPixelOffset(R.dimen.round_large_size);
                layoutParams2.setMargins(4, (int) TypedValue.applyDimension(1, 7.0f, getResources().getDisplayMetrics()), 0, 0);
                this.Q1.setGravity(17);
                this.Q1.setLayoutParams(layoutParams2);
                this.Q1.setCompoundDrawables(null, null, null, null);
                this.Q1.setBackgroundResource(R.drawable.message_round);
                this.Q1.setPadding(1, 0, 2, 1);
            }
            this.Q1.setVisibility(0);
            TextView textView = this.Q1;
            textView.setText(i4 + "");
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void i0() {
        try {
            this.O1 = p1.f.K().S();
            int a02 = p1.f.K().a0();
            this.P1 = a02;
            i1(a02);
            int i4 = this.O1;
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
    public void i1(int i4) {
        if (i4 == 0) {
            c1();
        } else {
            b1();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void instalButtomButn() {
        int game_book = this.O.getGame_book();
        if (this.O.getBespeak_switch() == 1 && game_book != 1 && this.O.getDown_status() == 2) {
            if (IntentUtil.getInstance().goLoginNetGame(this.f31783b) || this.O.getGame_book() == 1) {
                return;
            }
            changeGameFollow(4);
            return;
        }
        if (("" + this.O.getPlugin_num()).equals("" + ConstantIntEnum.H5.value())) {
            IntentUtil.getInstance().goShareWebActivity(this.f31783b, this.O.getDown_url_remote());
            UtilsMy.T2(this.G, this.f31783b);
        }
        DownloadTask downloadTask = this.G;
        int status = downloadTask != null ? downloadTask.getStatus() : 0;
        if (this.G != null && UtilsMy.w0(this.O.getPay_tag_info(), this.O.getCrc_sign_id()) > 0) {
            status = 43;
        }
        DownloadTask downloadTask2 = this.G;
        if (downloadTask2 == null) {
            return;
        }
        if (downloadTask2 != null && (status == 2 || status == 10)) {
            com.php25.PDownload.d.i(downloadTask2);
        } else if (status == 12 || status == 27) {
            return;
        } else {
            if (status == 13) {
                com.php25.PDownload.d.l(this.f31783b, downloadTask2);
                return;
            } else if (status == 5) {
                UtilsMy.W3(this.f31783b, downloadTask2, "2");
            } else if (status == 42) {
                downloadTask2.setVer(this.O.getVer());
                this.G.setVer_name(this.O.getVer_name());
                this.G.setUrl(this.O.getDown_url_remote());
                this.G.setCfg_ver(this.O.getCfg_ver());
                this.G.setCfg_ver_name(this.O.getCfg_ver_name());
                this.G.setCfg_down_url(this.O.getCfg_down_url());
                this.G.setPay_game_amount(this.O.getPay_tag_info() != null ? this.O.getPay_tag_info().getPay_game_amount() : 0);
                this.G.setKeyword(Where.detail.name());
                DownloadTask downloadTask3 = this.G;
                UtilsMy.z4(downloadTask3, downloadTask3.getCrc_link_type_val());
                UtilsMy.r4(this.f31783b, this.G);
            } else if (status == 9) {
                if (!com.join.android.app.common.utils.j.j(this.f31783b)) {
                    com.join.mgps.Util.l2.a(this.f31783b).b("无网络连接");
                    return;
                }
                if (this.O.getGame_detailed() != null && com.join.mgps.Util.g2.i(this.O.getGame_detailed().getTpl_two_qq())) {
                    com.join.mgps.Util.b0.f0(this.f31783b).b0(this.f31783b, this.O.getGame_detailed().getTpl_two_qq_key(), this.O.getGame_detailed().getAd_pic_qq(), this.O.getGame_detailed().getTpl_two_qq());
                }
                int downloadType = this.G.getDownloadType();
                if (downloadType == 0 || downloadType == 1) {
                    if (this.G.getCrc_link_type_val() == null || this.G.getCrc_link_type_val().equals("")) {
                        return;
                    }
                    addFrom(this.G);
                    if (UtilsMy.o1(this.f31783b, this.G)) {
                        return;
                    }
                    if (this.O.getDown_status() == 5) {
                        UtilsMy.l1(this.f31783b, this.G);
                        return;
                    }
                    com.php25.PDownload.d.b(this.G);
                    this.G.setVer(this.O.getVer());
                    this.G.setVer_name(this.O.getVer_name());
                    this.G.setUrl(this.O.getDown_url_remote());
                    this.G.setCfg_ver(this.O.getCfg_ver());
                    this.G.setCfg_ver_name(this.O.getCfg_ver_name());
                    this.G.setCfg_down_url(this.O.getCfg_down_url());
                    this.G.setPay_game_amount(this.O.getPay_tag_info() != null ? this.O.getPay_tag_info().getPay_game_amount() : 0);
                    this.G.setKeyword(Where.detail.name());
                    DownloadTask downloadTask4 = this.G;
                    UtilsMy.z4(downloadTask4, downloadTask4.getCrc_link_type_val());
                    if (UtilsMy.y0(this.O.getPay_tag_info(), this.O.getCrc_sign_id()) > 0) {
                        ExtBean extBean = this.L;
                        if (extBean != null && "checkgame".equals(extBean.getFrom())) {
                            UtilsMy.e4(this.f31783b, this.K, this.L.getFrom_id());
                        } else if (!UtilsMy.o1(this.f31783b, this.G)) {
                            if (this.O.getDown_status() == 5) {
                                UtilsMy.l1(this.f31783b, this.G);
                            } else {
                                UtilsMy.d4(this.f31783b, this.K);
                            }
                        }
                    } else {
                        UtilsMy.C1(this.G, this.O);
                        if (!UtilsMy.o1(this.f31783b, this.G)) {
                            if (this.O.getDown_status() == 5) {
                                UtilsMy.l1(this.f31783b, this.G);
                            } else {
                                UtilsMy.R0(this.f31783b, this.G, this.O.getTp_down_url(), this.O.getOther_down_switch(), this.O.getCdn_down_switch());
                            }
                        }
                    }
                } else if (downloadType == 2) {
                    UtilsMy.u4(this.G);
                }
            } else if (11 == status) {
                UtilsMy.a4(downloadTask2, this.f31783b);
            } else if (43 == status) {
                downloadTask2.setKeyword(Where.detail.name());
                GamedetialModleFourBean gamedetialModleFourBean = this.O;
                if (gamedetialModleFourBean != null) {
                    if (gamedetialModleFourBean.getGame_detailed() != null && com.join.mgps.Util.g2.i(this.O.getGame_detailed().getTpl_two_qq())) {
                        com.join.mgps.Util.b0.f0(this.f31783b).b0(this.f31783b, this.O.getGame_detailed().getTpl_two_qq_key(), this.O.getGame_detailed().getAd_pic_qq(), this.O.getGame_detailed().getTpl_two_qq());
                    }
                    addFrom(this.G);
                    if (UtilsMy.y0(this.O.getPay_tag_info(), this.O.getCrc_sign_id()) > 0) {
                        ExtBean extBean2 = this.L;
                        if (extBean2 != null && "checkgame".equals(extBean2.getFrom())) {
                            UtilsMy.e4(this.f31783b, this.K, this.L.getFrom_id());
                        } else if (!UtilsMy.o1(this.f31783b, this.G)) {
                            if (this.O.getDown_status() == 5) {
                                UtilsMy.l1(this.f31783b, this.G);
                            } else {
                                UtilsMy.d4(this.f31783b, this.K);
                            }
                        }
                    } else {
                        UtilsMy.C1(this.G, this.O);
                        if (!UtilsMy.o1(this.f31783b, this.G)) {
                            if (this.O.getDown_status() == 5) {
                                UtilsMy.l1(this.f31783b, this.G);
                            } else {
                                UtilsMy.R0(this.f31783b, this.G, this.O.getTp_down_url(), this.O.getOther_down_switch(), this.O.getCdn_down_switch());
                            }
                        }
                    }
                }
            } else {
                downloadTask2.setKeyword(Where.detail.name());
                if (this.O != null) {
                    addFrom(this.G);
                    if (this.O.getGame_detailed() != null && com.join.mgps.Util.g2.i(this.O.getGame_detailed().getTpl_two_qq())) {
                        com.join.mgps.Util.b0.f0(this.f31783b).b0(this.f31783b, this.O.getGame_detailed().getTpl_two_qq_key(), this.O.getGame_detailed().getAd_pic_qq(), this.O.getGame_detailed().getTpl_two_qq());
                    }
                    if (UtilsMy.y0(this.O.getPay_tag_info(), this.O.getCrc_sign_id()) > 0) {
                        ExtBean extBean3 = this.L;
                        if (extBean3 != null && "checkgame".equals(extBean3.getFrom())) {
                            UtilsMy.e4(this.f31783b, this.K, this.L.getFrom_id());
                        } else if (!UtilsMy.o1(this.f31783b, this.G)) {
                            if (this.O.getDown_status() == 5) {
                                UtilsMy.l1(this.f31783b, this.G);
                            } else {
                                UtilsMy.d4(this.f31783b, this.K);
                            }
                        }
                    } else {
                        UtilsMy.C1(this.G, this.O);
                        if (!UtilsMy.o1(this.f31783b, this.G)) {
                            if (this.O.getDown_status() == 5) {
                                UtilsMy.l1(this.f31783b, this.G);
                            } else {
                                UtilsMy.R0(this.f31783b, this.G, this.O.getTp_down_url(), this.O.getOther_down_switch(), this.O.getCdn_down_switch());
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
        this.f31783b.finish();
        y0();
    }

    @UiThread
    public void j0(int i4, int i5) {
        if (i5 == 1) {
            this.N.G(i4, 1);
        } else {
            this.N.H(i4, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void j1(List<CollectionBeanSub> list) {
        XRecyclerView xRecyclerView;
        if (list != null) {
            List<GameDetialModleFourAdapter.n1> y2 = this.N.y();
            if (list.size() > 0) {
                for (CollectionBeanSub collectionBeanSub : list) {
                    CollectionBeanSubBusiness collectionBeanSubBusiness = new CollectionBeanSubBusiness(collectionBeanSub);
                    collectionBeanSubBusiness.set_from(13301);
                    collectionBeanSubBusiness.set_from_type(13301);
                    this.Z.add(collectionBeanSubBusiness);
                    GameDetialModleFourAdapter gameDetialModleFourAdapter = this.N;
                    Objects.requireNonNull(gameDetialModleFourAdapter);
                    y2.add(new GameDetialModleFourAdapter.n1(gameDetialModleFourAdapter, collectionBeanSubBusiness, 41));
                }
                g1(this.Z);
                N0();
            }
            if (list.size() <= 0) {
                XRecyclerView xRecyclerView2 = this.f31794m;
                if (xRecyclerView2 != null) {
                    xRecyclerView2.setNoMore();
                }
            } else {
                XRecyclerView xRecyclerView3 = this.f31794m;
                if (xRecyclerView3 != null) {
                    xRecyclerView3.loadMoreComplete();
                }
            }
        }
        if ((list == null || list.size() <= 0) && (xRecyclerView = this.f31794m) != null) {
            xRecyclerView.setNoMore();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void k1() {
        c1();
        TextView textView = this.Q1;
        if (textView != null) {
            textView.setVisibility(8);
            this.Q1.setText("");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread(delay = 1000)
    public void l1(boolean z4) {
        ExtBean extBean = this.L;
        if (extBean == null || !"checkgame".equals(extBean.getFrom())) {
            return;
        }
        com.join.mgps.Util.m1.c().b(this.f31783b, this.L.getFrom_id(), new r(z4));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void n0() {
        IntentUtil.getInstance().goMyGameManagerActivity(this.f31783b);
    }

    void n1(DownloadTask downloadTask, int i4) {
        if (downloadTask != null) {
            switch (i4) {
                case 1:
                case 2:
                case 7:
                case 8:
                case 9:
                    K0(downloadTask);
                    return;
                case 3:
                    I0(downloadTask);
                    return;
                case 4:
                default:
                    return;
                case 5:
                    L0(downloadTask);
                    return;
                case 6:
                    J0(downloadTask);
                    return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void o0() {
        IntentUtil.getInstance().goMyGameManagerActivity(this.f31783b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void o1(GamedetialModleFourBean gamedetialModleFourBean, boolean z4) {
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
        LinearLayout linearLayout2 = this.f31810z;
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(8);
        }
        this.Z.clear();
        this.O = gamedetialModleFourBean;
        this.f31806v1 = (gamedetialModleFourBean.getSp_tag_info() == null || this.O.getSp_tag_info().getMini_game() == null) ? false : true;
        boolean e6 = com.join.mgps.Util.q1.e(gamedetialModleFourBean.getTag_info());
        this.A1 = e6;
        this.f31794m.setLoadingMoreEnabled(!e6);
        if (this.M && p1.f.K().F(this.K) == null) {
            com.php25.PDownload.d.c(gamedetialModleFourBean.getDownloadtaskDown(), this.f31783b);
        }
        GameDetialModleFourAdapter gameDetialModleFourAdapter = this.N;
        if (gameDetialModleFourAdapter != null) {
            gameDetialModleFourAdapter.I(this.f31783b.getModleFourFragment());
        }
        if (gamedetialModleFourBean.getShare_config() != null && gamedetialModleFourBean.getShare_config().getShare_switch() == 1) {
            this.f31793l.setVisibility(0);
            MyImageLoader.d(this.D, R.drawable.user_gift, "");
            this.f31793l.setOnClickListener(new u());
        } else {
            this.f31793l.setVisibility(8);
        }
        if (gamedetialModleFourBean.getActivity_entry() != null) {
            this.f31793l.setVisibility(0);
            MyImageLoader.h(this.D, gamedetialModleFourBean.getActivity_entry().getPic());
            this.E.setText(gamedetialModleFourBean.getActivity_entry().getTitle());
            this.f31793l.setOnClickListener(new a());
        } else {
            this.f31793l.setVisibility(8);
        }
        GamedetialModleFourBean gamedetialModleFourBean2 = this.O;
        if (gamedetialModleFourBean2 != null) {
            if (gamedetialModleFourBean2.getGame_follow() == 1) {
                this.f31790i.setImageResource(R.drawable.followed_image);
                this.f31791j.setText("已收藏");
            } else {
                this.f31790i.setImageResource(R.drawable.follow_none_image);
                this.f31791j.setText("收藏");
            }
        }
        DownloadTask F = p1.f.K().F(this.K);
        this.G = F;
        if (F == null) {
            this.G = this.O.getDownloadtaskDown();
            if (UtilsMy.o0(this.O.getTag_info())) {
                this.G.setFileType(Dtype.android.name());
                if (com.join.android.app.common.utils.e.l0(this.f31783b).d(this.f31783b, this.O.getPackageName())) {
                    APKUtils.a l4 = com.join.android.app.common.utils.e.l0(this.f31783b).l(this.f31783b, this.O.getPackageName());
                    if (com.join.mgps.Util.g2.i(this.O.getVer()) && l4.d() < Integer.parseInt(this.O.getVer())) {
                        this.G.setStatus(9);
                    } else {
                        this.G.setStatus(5);
                    }
                } else {
                    this.G.setStatus(0);
                }
            } else {
                this.G.setStatus(0);
            }
        } else {
            F.setDownloadType(0);
            this.G.setScreenshot_pic(this.O.getScreenshot_pic());
        }
        if (("" + this.O.getPlugin_num()).equals("" + ConstantIntEnum.H5.value())) {
            GamedetialModleFourBean gamedetialModleFourBean3 = this.O;
            gamedetialModleFourBean3.setDown_count(gamedetialModleFourBean3.getStart_count());
        }
        updateButn();
        try {
            List<CommentBaseBean> list = this.G1;
            if (list != null) {
                this.O.setCommitDataBeanList(list);
            }
            this.O.setSelf_comment(this.J1);
            this.O.setGame_comment_count(this.H1);
            this.O.setGame_score(this.I1);
            this.N.K(gamedetialModleFourBean);
            List<GameDetialModleFourAdapter.n1> y2 = this.N.y();
            y2.clear();
            if (this.A1) {
                if (com.join.mgps.Util.g2.i(gamedetialModleFourBean.getGame_describe_second())) {
                    GameDetialModleFourAdapter gameDetialModleFourAdapter2 = this.N;
                    Objects.requireNonNull(gameDetialModleFourAdapter2);
                    y2.add(new GameDetialModleFourAdapter.n1(gameDetialModleFourAdapter2, gamedetialModleFourBean.getGame_describe_second(), 47));
                }
                List<CollectionBeanSub> similar_games_recommend_pc = this.O.getSimilar_games_recommend_pc();
                if (similar_games_recommend_pc != null && similar_games_recommend_pc.size() > 0) {
                    GameDetialModleFourAdapter gameDetialModleFourAdapter3 = this.N;
                    Objects.requireNonNull(gameDetialModleFourAdapter3);
                    y2.add(new GameDetialModleFourAdapter.n1(gameDetialModleFourAdapter3, similar_games_recommend_pc, 50));
                }
            } else {
                BtGameWelfare game_welfare = this.O.getGame_welfare();
                if (game_welfare != null && (game_welfare.getGame_activity_summary() != null || game_welfare.getGame_benefit_summary() != null)) {
                    GameDetialModleFourAdapter gameDetialModleFourAdapter4 = this.N;
                    Objects.requireNonNull(gameDetialModleFourAdapter4);
                    y2.add(new GameDetialModleFourAdapter.n1(gameDetialModleFourAdapter4, game_welfare, 42));
                }
                if (gamedetialModleFourBean.getBt_game_switch() == 1 && com.join.mgps.Util.g2.i(gamedetialModleFourBean.getEdit_recommend())) {
                    GameDetialModleFourAdapter gameDetialModleFourAdapter5 = this.N;
                    Objects.requireNonNull(gameDetialModleFourAdapter5);
                    GameDetialModleFourAdapter.n1 n1Var = new GameDetialModleFourAdapter.n1(gameDetialModleFourAdapter5, gamedetialModleFourBean.getEdit_recommend(), 39);
                    n1Var.f42461f = "编辑推荐";
                    y2.add(n1Var);
                }
                if (gamedetialModleFourBean.getBt_game_switch() == 1) {
                    if (gamedetialModleFourBean.getGame_screen_shot() != null && gamedetialModleFourBean.getGame_screen_shot().size() > 0) {
                        GameDetialModleFourAdapter gameDetialModleFourAdapter6 = this.N;
                        Objects.requireNonNull(gameDetialModleFourAdapter6);
                        y2.add(new GameDetialModleFourAdapter.n1(gameDetialModleFourAdapter6, null, 28));
                    } else {
                        GameDetialModleFourAdapter gameDetialModleFourAdapter7 = this.N;
                        Objects.requireNonNull(gameDetialModleFourAdapter7);
                        y2.add(new GameDetialModleFourAdapter.n1(gameDetialModleFourAdapter7, null, 5));
                    }
                }
                List<TipBean> game_bt_tag = gamedetialModleFourBean.getGame_bt_tag();
                if (game_bt_tag != null && game_bt_tag.size() > 0) {
                    GameDetialModleFourAdapter gameDetialModleFourAdapter8 = this.N;
                    Objects.requireNonNull(gameDetialModleFourAdapter8);
                    y2.add(new GameDetialModleFourAdapter.n1(gameDetialModleFourAdapter8, game_bt_tag, 43));
                }
                if (this.O.getBt_game_switch() == 1) {
                    String game_exclusive_benefits = this.O.getGame_exclusive_benefits();
                    String game_buy_rebate = this.O.getGame_buy_rebate();
                    if (com.join.mgps.Util.g2.i(game_exclusive_benefits) || com.join.mgps.Util.g2.i(game_buy_rebate)) {
                        GameDetialModleFourAdapter gameDetialModleFourAdapter9 = this.N;
                        Objects.requireNonNull(gameDetialModleFourAdapter9);
                        GameDetialModleFourAdapter.n1 n1Var2 = new GameDetialModleFourAdapter.n1(gameDetialModleFourAdapter9, game_exclusive_benefits, 44);
                        n1Var2.f42461f = game_buy_rebate;
                        y2.add(n1Var2);
                    }
                }
                if (com.join.mgps.Util.g2.i(gamedetialModleFourBean.getGame_describe_second())) {
                    GameDetialModleFourAdapter gameDetialModleFourAdapter10 = this.N;
                    Objects.requireNonNull(gameDetialModleFourAdapter10);
                    y2.add(new GameDetialModleFourAdapter.n1(gameDetialModleFourAdapter10, "游戏简介", 1));
                    if (this.O.getTag_info() != null && this.O.getTag_info().size() > 0) {
                        GameDetialModleFourAdapter gameDetialModleFourAdapter11 = this.N;
                        Objects.requireNonNull(gameDetialModleFourAdapter11);
                        y2.add(new GameDetialModleFourAdapter.n1(gameDetialModleFourAdapter11, null, 4));
                    }
                    GameDetialModleFourAdapter gameDetialModleFourAdapter12 = this.N;
                    Objects.requireNonNull(gameDetialModleFourAdapter12);
                    GameDetialModleFourAdapter.n1 n1Var3 = new GameDetialModleFourAdapter.n1(gamedetialModleFourBean.getGame_describe_second(), 8, 1, new b());
                    n1Var3.f42461f = "游戏简介";
                    y2.add(n1Var3);
                    if (gamedetialModleFourBean.getBt_game_switch() != 1 && com.join.mgps.Util.g2.i(gamedetialModleFourBean.getEdit_recommend())) {
                        GameDetialModleFourAdapter gameDetialModleFourAdapter13 = this.N;
                        Objects.requireNonNull(gameDetialModleFourAdapter13);
                        y2.add(new GameDetialModleFourAdapter.n1(gameDetialModleFourAdapter13, gamedetialModleFourBean.getEdit_recommend(), 39));
                    }
                }
                if (this.O.getBespeak_switch() == 1) {
                    GameDetialModleFourAdapter gameDetialModleFourAdapter14 = this.N;
                    Objects.requireNonNull(gameDetialModleFourAdapter14);
                    y2.add(new GameDetialModleFourAdapter.n1(gameDetialModleFourAdapter14, null, 3));
                }
                if (com.join.mgps.Util.g2.i(gamedetialModleFourBean.getDev_info())) {
                    GameDetialModleFourAdapter gameDetialModleFourAdapter15 = this.N;
                    Objects.requireNonNull(gameDetialModleFourAdapter15);
                    y2.add(new GameDetialModleFourAdapter.n1(gameDetialModleFourAdapter15, "开发者的话", 1));
                    GameDetialModleFourAdapter gameDetialModleFourAdapter16 = this.N;
                    Objects.requireNonNull(gameDetialModleFourAdapter16);
                    y2.add(new GameDetialModleFourAdapter.n1(gameDetialModleFourAdapter16, gamedetialModleFourBean.getDev_info(), 7));
                }
                if (gamedetialModleFourBean.getGame_detailed() != null && com.join.mgps.Util.g2.i(gamedetialModleFourBean.getGame_detailed().getTpl_two_qq())) {
                    GameDetialModleFourAdapter gameDetialModleFourAdapter17 = this.N;
                    Objects.requireNonNull(gameDetialModleFourAdapter17);
                    y2.add(new GameDetialModleFourAdapter.n1(gameDetialModleFourAdapter17, null, 24));
                }
                if (this.O.getMini_program() != null) {
                    if (com.join.mgps.Util.g2.i(this.O.getMini_program().getPic())) {
                        GameDetialModleFourAdapter gameDetialModleFourAdapter18 = this.N;
                        Objects.requireNonNull(gameDetialModleFourAdapter18);
                        y2.add(new GameDetialModleFourAdapter.n1(gameDetialModleFourAdapter18, this.O.getMini_program(), 46));
                    } else {
                        GameDetialModleFourAdapter gameDetialModleFourAdapter19 = this.N;
                        Objects.requireNonNull(gameDetialModleFourAdapter19);
                        y2.add(new GameDetialModleFourAdapter.n1(gameDetialModleFourAdapter19, this.O.getMini_program(), 45));
                    }
                    if (!z4) {
                        com.papa.sim.statistic.p.l(getContext()).O1(Event.pdGameDetails, new Ext().setGameId(this.O.getGame_id()).setIsJoin(this.O.getMini_program().getIs_join()).setTestAbNumber(this.O.getMini_program().getAb_test_number()));
                    }
                }
                if (gamedetialModleFourBean.getAuxiliary_tool() != null) {
                    GameDetialModleFourAdapter gameDetialModleFourAdapter20 = this.N;
                    Objects.requireNonNull(gameDetialModleFourAdapter20);
                    y2.add(new GameDetialModleFourAdapter.n1(gameDetialModleFourAdapter20, "辅助工具", 10));
                }
                int size = (gamedetialModleFourBean.getRoom_cfg_info() == null || gamedetialModleFourBean.getRoom_cfg_info().getGolden_finger() == null || gamedetialModleFourBean.getRoom_cfg_info().getGolden_finger().size() <= 0) ? 0 : gamedetialModleFourBean.getRoom_cfg_info().getGolden_finger().size();
                if ((gamedetialModleFourBean.getGame_prompt() != null && gamedetialModleFourBean.getGame_prompt().size() > 0) || gamedetialModleFourBean.getGame_handle_entrance() != null || gamedetialModleFourBean.getCommunity_entrance_switch() == 1 || size > 0) {
                    GameDetialModleFourAdapter gameDetialModleFourAdapter21 = this.N;
                    Objects.requireNonNull(gameDetialModleFourAdapter21);
                    GameDetialModleFourAdapter.n1 n1Var4 = new GameDetialModleFourAdapter.n1(gameDetialModleFourAdapter21, null, 6, new c());
                    n1Var4.f42461f = Boolean.valueOf(gamedetialModleFourBean.getGame_handle_entrance() != null);
                    n1Var4.f42462g = Integer.valueOf(size);
                    n1Var4.f42463h = Boolean.valueOf(gamedetialModleFourBean.getCommunity_entrance_switch() == 1);
                    y2.add(n1Var4);
                }
                GamedetialModleFourBean gamedetialModleFourBean4 = this.O;
                if (gamedetialModleFourBean4 == null || gamedetialModleFourBean4.getComment_switch() == 1) {
                    GameDetialModleFourAdapter gameDetialModleFourAdapter22 = this.N;
                    Objects.requireNonNull(gameDetialModleFourAdapter22);
                    y2.add(new GameDetialModleFourAdapter.n1(gameDetialModleFourAdapter22, "评论", 13));
                    if (this.O.getCommitDataBeanList() != null && this.O.getCommitDataBeanList().size() > 0) {
                        R0(y2);
                    } else if (this.L1) {
                        this.L1 = false;
                        u0();
                    } else {
                        GameDetialModleFourAdapter gameDetialModleFourAdapter23 = this.N;
                        Objects.requireNonNull(gameDetialModleFourAdapter23);
                        y2.add(new GameDetialModleFourAdapter.n1(gameDetialModleFourAdapter23, "评论", 26));
                        GameDetialModleFourAdapter gameDetialModleFourAdapter24 = this.N;
                        Objects.requireNonNull(gameDetialModleFourAdapter24);
                        y2.add(new GameDetialModleFourAdapter.n1(gameDetialModleFourAdapter24, "评论", 27));
                    }
                }
                GameDetialModleFourAdapter gameDetialModleFourAdapter25 = this.N;
                Objects.requireNonNull(gameDetialModleFourAdapter25);
                y2.add(new GameDetialModleFourAdapter.n1(gameDetialModleFourAdapter25, "同类游戏", 1));
                List<CollectionBeanSub> similar_games_recommend = this.O.getSimilar_games_recommend();
                if (similar_games_recommend != null && similar_games_recommend.size() > 0) {
                    for (CollectionBeanSub collectionBeanSub : similar_games_recommend) {
                        CollectionBeanSubBusiness collectionBeanSubBusiness = new CollectionBeanSubBusiness(collectionBeanSub);
                        collectionBeanSubBusiness.set_from(13301);
                        collectionBeanSubBusiness.set_from_type(13301);
                        this.Z.add(collectionBeanSubBusiness);
                        GameDetialModleFourAdapter gameDetialModleFourAdapter26 = this.N;
                        Objects.requireNonNull(gameDetialModleFourAdapter26);
                        y2.add(new GameDetialModleFourAdapter.n1(gameDetialModleFourAdapter26, collectionBeanSubBusiness, 41));
                    }
                    g1(this.Z);
                }
            }
            N0();
            this.f31794m.removeCallbacks(this.K1);
            this.f31794m.postDelayed(this.K1, 1000L);
        } catch (Exception e7) {
            e7.printStackTrace();
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onChangeComment(com.join.mgps.event.j jVar) {
        if (jVar.getType() == 1 || jVar.getType() == 0 || jVar.getType() == 2) {
            u0();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        List<DownloadTask> d5 = p1.f.K().d();
        this.X = d5;
        if (d5 == null || d5.size() <= 0) {
            return;
        }
        for (DownloadTask downloadTask : this.X) {
            this.Y.put(downloadTask.getCrc_link_type_val(), downloadTask);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        m0();
        l0();
        com.join.mgps.Util.d0.a().e(this);
        com.join.mgps.customview.o oVar = this.S;
        if (oVar != null && oVar.isShowing()) {
            this.S.dismiss();
        }
        com.join.android.app.component.video.c cVar = this.W;
        if (cVar != null) {
            cVar.G();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00cc, code lost:
        if (r12 != 48) goto L59;
     */
    @org.greenrobot.eventbus.Subscribe(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onEventMainThread(com.join.mgps.event.n r12) {
        /*
            Method dump skipped, instructions count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.mgps.activity.GameDetialModleFourActivity.onEventMainThread(com.join.mgps.event.n):void");
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        com.join.android.app.component.video.c cVar = this.W;
        if (cVar != null) {
            cVar.H();
        }
        this.T = true;
        XRecyclerView xRecyclerView = this.f31794m;
        if (xRecyclerView != null) {
            xRecyclerView.removeCallbacks(this.K1);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        GamedetialModleFourBean gamedetialModleFourBean;
        super.onResume();
        this.T = false;
        com.join.android.app.component.video.c cVar = this.W;
        if (cVar != null) {
            cVar.I();
        }
        this.R = AccountUtil_.getInstance_(this.f31783b).getAccountData();
        i0();
        DownloadTask F = this.K != null ? p1.f.K().F(this.K) : null;
        if (F == null && (gamedetialModleFourBean = this.O) != null) {
            this.G = gamedetialModleFourBean.getDownloadtaskDown();
        }
        if (F == null || this.G == null) {
            return;
        }
        try {
            this.G = F;
            if (F.getFileType().equals(Dtype.android.name()) && this.G.getStatus() == 5) {
                if (Boolean.valueOf(com.join.android.app.common.utils.e.l0(this.f31783b).d(this.f31783b, this.G.getPackageName())).booleanValue()) {
                    APKUtils.a l4 = com.join.android.app.common.utils.e.l0(this.f31783b).l(this.f31783b, this.G.getPackageName());
                    if (com.join.mgps.Util.g2.i(this.G.getVer()) && l4.d() < Integer.parseInt(this.G.getVer())) {
                        this.G.setStatus(9);
                    } else {
                        this.G.setStatus(5);
                    }
                } else {
                    this.G.setStatus(11);
                }
            } else {
                this.G.setStatus(F.getStatus());
            }
            updateButn();
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    void p0() {
        if (!com.join.android.app.common.utils.j.j(this.f31783b) || IntentUtil.getInstance().goLoginInteractive(this.f31783b) || this.O.getGame_follow() == 1) {
            return;
        }
        changeGameFollow(2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Receiver(actions = {"com.broadcast.bespeak.sussess"})
    public void p1() {
        this.O.setGame_book(1);
        N0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void progress_layout() {
        DownloadTask downloadTask = this.G;
        if (downloadTask == null) {
            return;
        }
        if (downloadTask.getStatus() == 2) {
            updateButn();
            com.php25.PDownload.d.i(this.G);
        } else if (this.G.getStatus() == 3 || this.G.getStatus() == 6) {
            updateButn();
            com.php25.PDownload.d.c(this.G, this.f31783b);
        }
    }

    void q0() {
        boolean booleanValue = this.D1.noFavoriteTips().d().booleanValue();
        if (IntentUtil.getInstance().goLoginInteractive(this.f31783b)) {
            return;
        }
        if (!booleanValue) {
            if (this.E1 == null) {
                com.join.mgps.customview.o oVar = new com.join.mgps.customview.o(this.f31783b, R.style.MyDialog);
                this.E1 = oVar;
                oVar.setContentView(R.layout.favorite_dialog);
                this.E1.setCanceledOnTouchOutside(true);
            }
            ((CheckBox) this.E1.findViewById(R.id.opt)).setOnCheckedChangeListener(new s());
            ((Button) this.E1.findViewById(R.id.ok)).setOnClickListener(new t());
            com.join.mgps.customview.o oVar2 = this.E1;
            if (oVar2 == null || oVar2.isShowing()) {
                return;
            }
            this.E1.show();
            return;
        }
        p0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void r0() {
        GamedetialModleFourBean gamedetialModleFourBean;
        if (IntentUtil.getInstance().goLoginInteractive(this.f31783b) || (gamedetialModleFourBean = this.O) == null || gamedetialModleFourBean.getGame_follow() == 1) {
            return;
        }
        q0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void relodingimag() {
        this.A.setVisibility(0);
        t0();
    }

    public RequestCommentpraiseArgs s0(String str, int i4, int i5) {
        String str2;
        int i6;
        String str3 = Build.MODEL;
        com.wufan.user.service.protobuf.n0 accountData = AccountUtil_.getInstance_(this.f31783b).getAccountData();
        this.R = accountData;
        if (accountData != null) {
            i6 = accountData.getUid();
            str2 = this.R.getToken();
        } else {
            str2 = "";
            i6 = 0;
        }
        return RequestBeanUtil.getInstance(this.f31783b).getPraiseComment(this.K, this.D1.commentToken().d(), str3, str, str2, i6, i4, i5);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void setNetwork() {
        UtilsMy.w3(this.f31783b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showInstallButn() {
        GamedetialModleFourBean gamedetialModleFourBean = this.O;
        if (gamedetialModleFourBean == null || TextUtils.isEmpty(gamedetialModleFourBean.getCrc_sign_id())) {
            return;
        }
        RelativeLayout relativeLayout = this.f31796o;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(8);
        }
        RelativeLayout relativeLayout2 = this.f31797p;
        if (relativeLayout2 != null) {
            relativeLayout2.setVisibility(0);
        }
        TextView textView = this.f31795n;
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
            GamedetialModleFourBean gamedetialModleFourBean = this.O;
            if (gamedetialModleFourBean == null || com.join.mgps.Util.g2.h(gamedetialModleFourBean.getCrc_sign_id())) {
                LinearLayout linearLayout2 = this.f31810z;
                if (linearLayout2 != null) {
                    linearLayout2.setVisibility(0);
                }
                if (com.join.android.app.common.utils.j.j(this.f31783b)) {
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
        this.G1 = list;
        if (this.O.getGame_id() != null) {
            o1(this.O, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showProgress() {
        RelativeLayout relativeLayout = this.f31797p;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(8);
        }
        TextView textView = this.f31795n;
        if (textView != null) {
            textView.setVisibility(8);
        }
        RelativeLayout relativeLayout2 = this.f31796o;
        if (relativeLayout2 != null) {
            relativeLayout2.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showToast(String str) {
        com.join.mgps.Util.l2.a(this.f31783b).b(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void t0() {
        GamedetialModleFourBean data;
        if (com.join.android.app.common.utils.j.j(this.f31783b)) {
            try {
                com.wufan.user.service.protobuf.n0 accountData = AccountUtil_.getInstance_(this.f31783b).getAccountData();
                if (accountData == null) {
                    accountData = com.wufan.user.service.protobuf.n0.f5().build();
                }
                RequestModel requestModel = new RequestModel();
                requestModel.setDefault(this.f31783b);
                requestModel.setArgs(new RequestGameIdArgs(this.K, 1, accountData.getUid()));
                ResponseModel<GamedetialModleFourBean> body = com.join.mgps.rpc.impl.i.D0().B0().B1(requestModel.makeSign()).execute().body();
                if (body != null && body.getCode() == 200 && (data = body.getData()) != null) {
                    o1(data, false);
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
        if (com.join.android.app.common.utils.j.j(this.f31783b)) {
            com.join.mgps.rpc.impl.e m4 = com.join.mgps.rpc.impl.e.m();
            new CommentAllListBean();
            try {
                CommentResponse<CommentAllListBean> g4 = m4.g(RequestBeanUtil.getInstance(this.f31783b).getGamedetialCommentRequest(this.K, this.D1.commentToken().d(), this.R.getUid() + ""));
                if (g4 != null) {
                    CommentAllListBean data_info = g4.getData_info();
                    if (data_info != null) {
                        this.J1 = data_info.getSelf_comment();
                        this.H1 = data_info.getGame_comment_count();
                        this.I1 = data_info.getGame_score();
                        this.f31783b.getModleFourFragment().setCommentNumber(this.H1);
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

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void updateButn() {
        GamedetialModleFourBean gamedetialModleFourBean = this.O;
        if (gamedetialModleFourBean == null || this.G == null || this.f31797p == null) {
            return;
        }
        if (this.f31806v1) {
            if (gamedetialModleFourBean.getDownloadtaskDown() != null && !this.O.getDownloadtaskDown().isSingleGame() && this.O.getDownloadtaskDown().getStatus() == 11) {
                this.f31795n.setText("安装");
                return;
            } else {
                this.f31795n.setText("打开");
                return;
            }
        }
        UtilsMy.j3(gamedetialModleFourBean.getSp_tag_info(), this.f31797p, this.G);
        if (this.O.getPlugin_num() != null) {
            String plugin_num = this.O.getPlugin_num();
            if (plugin_num.equals(ConstantIntEnum.H5.value() + "")) {
                this.f31795n.setBackgroundResource(R.drawable.detial_simple_normal_selecter);
                this.f31795n.setText("开始");
                showInstallButn();
                return;
            }
        }
        this.f31795n.setBackgroundResource(R.drawable.detial_simple_normal_selecter);
        DownloadTask downloadTask = this.G;
        int status = downloadTask != null ? downloadTask.getStatus() : 0;
        if (UtilsMy.w0(this.O.getPay_tag_info(), this.O.getCrc_sign_id()) > 0) {
            status = 43;
        }
        if (status == 9) {
            showInstallButn();
            this.f31795n.setText("更新");
            this.f31800q.setImageResource(R.drawable.detail_comment_download_continue);
            this.f31800q.setImageResource(R.drawable.detial_simple_install_selecter);
        } else if (status == 12) {
            showInstallButn();
            this.f31795n.setText("解压中..");
        } else if (status == 13) {
            showInstallButn();
            this.f31795n.setText("解压");
            this.f31800q.setImageResource(R.drawable.detail_comment_download_continue);
        } else if (status == 11) {
            showInstallButn();
            this.f31795n.setText("安装");
            this.f31795n.setBackgroundResource(R.drawable.detial_simple_install_selecter);
            this.f31800q.setImageResource(R.drawable.detial_simple_install_selecter);
        } else if (status == 5 || status == 42) {
            showInstallButn();
            l1(true);
            this.f31795n.setBackgroundResource(R.drawable.detial_simple_open_selecter);
            this.f31795n.setText(this.f31783b.getResources().getString(R.string.download_status_finished));
            this.f31800q.setImageResource(R.drawable.detail_comment_download_continue);
        } else if (status == 2) {
            showProgress();
            this.f31800q.setImageResource(R.drawable.detail_comment_download_pause);
            UtilsMy.x4(this.G);
            this.f31802s.setProgress((int) this.G.getProgress());
            TextView textView = this.f31801r;
            textView.setText(this.G.getProgress() + "%");
        } else if (status == 3 || status == 6 || status == 27) {
            showProgress();
            this.f31800q.setImageResource(R.drawable.detail_comment_download_continue);
            UtilsMy.x4(this.G);
            this.f31802s.setProgress((int) this.G.getProgress());
            TextView textView2 = this.f31801r;
            textView2.setText(this.G.getProgress() + "%");
        } else if (status == 10) {
            showInstallButn();
            TextView textView3 = this.f31795n;
            textView3.setText("等待\u3000" + this.O.getSize() + "M");
            this.f31800q.setImageResource(R.drawable.detail_comment_download_continue);
        } else if (status == 1) {
        } else {
            if (status == 43) {
                showInstallButn();
                if (UtilsMy.w0(this.O.getPay_tag_info(), this.O.getCrc_sign_id()) > 0) {
                    this.f31795n.setText(this.f31783b.getResources().getString(R.string.pay_game_amount, this.O.getPay_tag_info().getPayGameAmount()));
                } else {
                    this.f31795n.setText(this.f31783b.getResources().getString(R.string.download_status_download));
                }
                this.f31800q.setImageResource(R.drawable.detail_comment_download_continue);
                GamedetialModleFourBean gamedetialModleFourBean2 = this.O;
                if (gamedetialModleFourBean2 != null) {
                    if (gamedetialModleFourBean2.getBespeak_switch() == 1 && this.O.getDown_status() == 2) {
                        if (this.O.getGame_book() == 1) {
                            this.f31795n.setText("已预约");
                            UtilsMy.w0(this.O.getPay_tag_info(), this.O.getCrc_sign_id());
                            UtilsMy.n3(this.f31795n, this.O);
                            return;
                        }
                        this.f31795n.setText("预约");
                        return;
                    }
                    UtilsMy.w0(this.O.getPay_tag_info(), this.O.getCrc_sign_id());
                    UtilsMy.n3(this.f31795n, this.O);
                }
            } else if (status == 48) {
                showInstallButn();
                this.f31795n.setText(this.f31783b.getResources().getString(R.string.download_status_installing));
            } else {
                showInstallButn();
                if (UtilsMy.w0(this.O.getPay_tag_info(), this.O.getCrc_sign_id()) > 0) {
                    this.f31795n.setText(this.f31783b.getResources().getString(R.string.pay_game_amount, this.O.getPay_tag_info().getPayGameAmount()));
                } else {
                    this.f31795n.setText(this.f31783b.getResources().getString(R.string.download_status_download));
                }
                this.f31800q.setImageResource(R.drawable.detail_comment_download_continue);
                GamedetialModleFourBean gamedetialModleFourBean3 = this.O;
                if (gamedetialModleFourBean3 != null) {
                    if (gamedetialModleFourBean3.getBespeak_switch() == 1 && this.O.getDown_status() == 2) {
                        if (this.O.getGame_book() == 1) {
                            this.f31795n.setText("已预约");
                            UtilsMy.w0(this.O.getPay_tag_info(), this.O.getCrc_sign_id());
                            UtilsMy.n3(this.f31795n, this.O);
                            return;
                        }
                        this.f31795n.setText("预约");
                        return;
                    }
                    UtilsMy.w0(this.O.getPay_tag_info(), this.O.getCrc_sign_id());
                    UtilsMy.n3(this.f31795n, this.O);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void updateDownloadView() {
        int i4;
        try {
            Map<String, DownloadTask> map = this.M1;
            int i5 = 0;
            if (map != null) {
                i5 = map.size();
                i4 = this.N1.size();
            } else {
                i4 = 0;
            }
            this.V1.setDownloadGameNum(i5);
            if (i4 > 0) {
                this.V1.d();
            } else {
                this.V1.g();
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
                this.O.setGame_follow(0);
            } else if (i4 == 2) {
                this.O.setGame_follow(1);
                if (this.f31790i == null) {
                    return;
                }
                com.join.mgps.Util.l2.a(this.f31783b).b("收藏成功");
                this.f31790i.setImageResource(R.drawable.followed_image);
                this.f31791j.setText("已收藏");
            } else if (i4 == 3) {
                this.O.setGame_book(0);
            } else if (i4 == 4) {
                this.O.setGame_book(1);
                Intent intent = new Intent("com.broadcast.bespeak.sussess");
                intent.putExtra("gameid", this.O.getCrc_sign_id());
                this.f31783b.sendBroadcast(intent);
                com.join.mgps.Util.b0.f0(this.f31783b).O(this.f31783b, 1, new e()).show();
            }
            N0();
            updateButn();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void v0(GiftPackageDataInfoBean giftPackageDataInfoBean) {
        if (com.join.android.app.common.utils.j.j(this.f31783b)) {
            try {
                try {
                    GiftPackageOperationBean f02 = this.H.f0(RequestBeanUtil.getInstance(this.f31783b).getGiftPackageOperationRequestBean(this.R.getUid(), giftPackageDataInfoBean.getGift_package_id(), this.K));
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
                        List<GiftPackageDataInfoBean> game_gift_package = this.O.getGame_gift_package();
                        for (int i4 = 0; i4 < game_gift_package.size(); i4++) {
                            GiftPackageDataInfoBean giftPackageDataInfoBean2 = game_gift_package.get(i4);
                            if (giftPackageDataInfoBean.getGift_package_id() == giftPackageDataInfoBean2.getGift_package_id()) {
                                giftPackageDataInfoBean2.setGift_package_status(1);
                                giftPackageDataInfoBean2.setGift_package_overdue(giftPackageDataOperationBean.getGift_info().getGift_package_overdue());
                                giftPackageDataInfoBean2.setGift_package_code(giftPackageDataOperationBean.getGift_info().getGift_package_code());
                            }
                        }
                        this.O.setGame_gift_package(game_gift_package);
                        X0(giftPackageDataOperationBean);
                    }
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
            } finally {
                showToast("领取失败");
            }
        }
    }

    public CommonRequestBean w0() {
        com.wufan.user.service.protobuf.n0 accountData = AccountUtil_.getInstance_(this.f31783b).getAccountData();
        this.R = accountData;
        return RequestBeanUtil.getInstance(this.f31783b).getGameCommentListRequestBean(1, 5, accountData != null ? accountData.getUid() : 0, this.K, new int[]{1});
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void x0() {
        if (com.join.android.app.common.utils.j.j(this.f31783b)) {
            try {
                CommentResponse<CommentTokenBean> c5 = this.J.c(RequestBeanUtil.getInstance(this.f31783b).getTokenRequestBean(AccountUtil_.getInstance_(this.f31783b).getUid(), ""));
                if (c5 == null || c5.getCode() != 0 || c5.getData_info() == null || TextUtils.isEmpty(c5.getData_info().getToken())) {
                    return;
                }
                this.D1.commentToken().g(AESUtils.f(c5.getData_info().getToken() + "|" + c5.getData_info().getTimes()));
                this.D1.lastCheckInTime().g(Long.valueOf(System.currentTimeMillis()));
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    void y0() {
        ExtBean extBean = this.L;
        if (extBean == null || TextUtils.isEmpty(extBean.getFrom()) || !this.L.getFrom().equals("updateFromMarket")) {
            return;
        }
        IntentUtil.getInstance().goMGMainActivity2Front(this.f31783b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void z0() {
        if (com.join.android.app.common.utils.j.j(this.f31783b)) {
            try {
                com.wufan.user.service.protobuf.n0 accountData = AccountUtil_.getInstance_(this.f31783b).getAccountData();
                if (accountData == null) {
                    accountData = com.wufan.user.service.protobuf.n0.f5().build();
                }
                RequestModel requestModel = new RequestModel();
                requestModel.setDefault(this.f31783b);
                String str = this.K;
                int i4 = this.C1;
                this.C1 = i4 + 1;
                RequestGameIdArgs requestGameIdArgs = new RequestGameIdArgs(str, i4, accountData.getUid());
                requestGameIdArgs.setDownloadedGameIdList(p1.f.K().A());
                requestModel.setArgs(requestGameIdArgs);
                ResponseModel<List<CollectionBeanSub>> body = com.join.mgps.rpc.impl.i.D0().B0().s(requestModel.makeSign()).execute().body();
                if (body != null && body.getCode() == 200) {
                    j1(body.getData());
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
}
