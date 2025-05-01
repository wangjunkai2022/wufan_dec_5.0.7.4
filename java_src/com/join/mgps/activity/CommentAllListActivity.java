package com.join.mgps.activity;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import android.widget.Toast;
import com.BaseAppCompatActivity;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.AESUtils;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.Util.RequestBeanUtil;
import com.join.mgps.adapter.CommentAllListAdapter;
import com.join.mgps.customview.HistogramView;
import com.join.mgps.customview.MStarBar;
import com.join.mgps.customview.XListView2;
import com.join.mgps.dto.CommentAllListBean;
import com.join.mgps.dto.CommentBaseBean;
import com.join.mgps.dto.CommentPraiseBean;
import com.join.mgps.dto.CommentResponse;
import com.join.mgps.dto.CommentTokenBean;
import com.join.mgps.dto.RequestCommentAllListArgs;
import com.join.mgps.dto.RequestCommentpraiseArgs;
import com.join.mgps.pref.PrefDef_;
import com.join.mgps.ptr.PtrClassicFrameLayout;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.Extra;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
import org.androidannotations.annotations.sharedpreferences.Pref;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
@EActivity(R.layout.comment_all_list_activity)
/* loaded from: classes.dex */
public class CommentAllListActivity extends BaseAppCompatActivity implements CommentAllListAdapter.h {
    private MStarBar A;
    private TextView B;
    private TextView C;
    private TextView D;
    private TextView E;
    private HistogramView F;
    private HistogramView G;
    private HistogramView H;
    private HistogramView I;
    private HistogramView J;
    private com.wufan.user.service.protobuf.n0 M;
    private int N;
    private String O;
    private CommentBaseBean P;
    private CommentAllListAdapter R;
    private List<CommentAllListAdapter.i> S;
    private List<CommentBaseBean> T;

    /* renamed from: b  reason: collision with root package name */
    private Context f29311b;
    @ViewById

    /* renamed from: c  reason: collision with root package name */
    ImageView f29312c;
    @ViewById

    /* renamed from: d  reason: collision with root package name */
    TextView f29313d;
    @ViewById

    /* renamed from: e  reason: collision with root package name */
    TextView f29314e;
    @ViewById

    /* renamed from: f  reason: collision with root package name */
    PtrClassicFrameLayout f29315f;
    @ViewById

    /* renamed from: g  reason: collision with root package name */
    XListView2 f29316g;
    @ViewById

    /* renamed from: h  reason: collision with root package name */
    LinearLayout f29317h;
    @ViewById

    /* renamed from: i  reason: collision with root package name */
    LinearLayout f29318i;
    @ViewById

    /* renamed from: j  reason: collision with root package name */
    LinearLayout f29319j;

    /* renamed from: k  reason: collision with root package name */
    com.join.mgps.rpc.f f29320k;
    @Pref

    /* renamed from: l  reason: collision with root package name */
    PrefDef_ f29321l;
    @Extra

    /* renamed from: m  reason: collision with root package name */
    String f29322m;
    @Extra

    /* renamed from: n  reason: collision with root package name */
    String f29323n;
    @Extra

    /* renamed from: o  reason: collision with root package name */
    float f29324o;
    @Extra

    /* renamed from: p  reason: collision with root package name */
    String f29325p;
    @Extra

    /* renamed from: q  reason: collision with root package name */
    String f29326q;
    @Extra

    /* renamed from: r  reason: collision with root package name */
    String f29327r;
    @Extra

    /* renamed from: s  reason: collision with root package name */
    int f29328s;
    @Extra

    /* renamed from: t  reason: collision with root package name */
    int f29329t;
    @Extra

    /* renamed from: u  reason: collision with root package name */
    String f29330u;
    @Extra

    /* renamed from: v  reason: collision with root package name */
    int f29331v;

    /* renamed from: w  reason: collision with root package name */
    private View f29332w;

    /* renamed from: x  reason: collision with root package name */
    private LinearLayout f29333x;

    /* renamed from: y  reason: collision with root package name */
    private LinearLayout f29334y;

    /* renamed from: z  reason: collision with root package name */
    private LinearLayout f29335z;
    private int K = 1;
    private boolean L = false;
    private List<CommentAllListBean> Q = new ArrayList();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CommentAllListActivity.this.s0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class b implements com.join.mgps.customview.f {
        b() {
        }

        @Override // com.join.mgps.customview.f
        public void onLoadMore() {
            if (CommentAllListActivity.this.L) {
                return;
            }
            CommentAllListActivity.this.k0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class c implements com.join.mgps.customview.g {
        c() {
        }

        @Override // com.join.mgps.customview.g
        public void onRefresh() {
            if (CommentAllListActivity.this.L) {
                return;
            }
            CommentAllListActivity.this.K = 1;
            CommentAllListActivity.this.k0();
        }
    }

    private int j0(Context context, float f5) {
        return (int) ((f5 * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterView() {
        this.f29320k = com.join.mgps.rpc.impl.e.m();
        this.f29311b = this;
        this.f29313d.setText("全部点评");
        org.greenrobot.eventbus.c.f().t(this);
        com.wufan.user.service.protobuf.n0 accountData = AccountUtil_.getInstance_(this.f29311b).getAccountData();
        this.M = accountData;
        if (accountData != null) {
            this.N = accountData.getUid();
        }
        this.O = this.f29321l.commentToken().d();
        View inflate = LayoutInflater.from(this).inflate(R.layout.comment_list_head_view, (ViewGroup) null);
        this.f29332w = inflate;
        this.F = (HistogramView) inflate.findViewById(R.id.oneHv);
        this.G = (HistogramView) this.f29332w.findViewById(R.id.twoHv);
        this.H = (HistogramView) this.f29332w.findViewById(R.id.threeHv);
        this.I = (HistogramView) this.f29332w.findViewById(R.id.fourHv);
        this.J = (HistogramView) this.f29332w.findViewById(R.id.fiveHv);
        this.A = (MStarBar) this.f29332w.findViewById(R.id.comment_head_mstarBar);
        this.D = (TextView) this.f29332w.findViewById(R.id.comment_head_point_tx);
        this.C = (TextView) this.f29332w.findViewById(R.id.comment_head_nopoint_tx);
        this.E = (TextView) this.f29332w.findViewById(R.id.comment_head_num_tx);
        TextView textView = (TextView) this.f29332w.findViewById(R.id.editText5);
        this.B = textView;
        textView.setText("写评论");
        this.f29333x = (LinearLayout) this.f29332w.findViewById(R.id.start_ll);
        this.f29334y = (LinearLayout) this.f29332w.findViewById(R.id.point_ll);
        this.f29332w.findViewById(R.id.goCommit).setOnClickListener(new a());
        this.A.setIntegerMark(false);
        this.A.setEnabled(false);
        showLoding();
        k0();
        this.T = new ArrayList();
        this.S = new ArrayList();
        this.R = new CommentAllListAdapter(this.f29311b, this.N, this.S, this.f29327r, this.f29329t, this);
        String str = this.f29327r;
        if (str != null && str.equals("1")) {
            this.f29316g.addHeaderView(this.f29332w);
            this.f29314e.setVisibility(8);
        } else {
            this.f29314e.setVisibility(0);
        }
        this.f29316g.setAdapter((ListAdapter) this.R);
        this.f29316g.setPreLoadCount(10);
        this.f29316g.setVerticalScrollBarEnabled(false);
        this.f29316g.setPullLoadEnable(new b());
        this.f29316g.setPullRefreshEnable(new c());
    }

    @Override // com.join.mgps.adapter.CommentAllListAdapter.h
    @Background
    public void b(CommentBaseBean commentBaseBean, int i4, int i5) {
        if (com.join.android.app.common.utils.j.j(this.f29311b)) {
            try {
                CommentResponse<CommentPraiseBean> h4 = this.f29320k.h(l0(commentBaseBean.getId(), i5, commentBaseBean.getPn()));
                if (h4 != null) {
                    if (h4.getCode() == 801) {
                        p0(h4);
                    } else if (h4.getSucc() != 1) {
                        o0(h4.getMsg(), true, i4, 1);
                    }
                    if (h4.getSucc() == 1) {
                        i0(i4, 1);
                        return;
                    }
                    return;
                }
                o0("操作失败，请稍候再试~", true, i4, 1);
                return;
            } catch (Exception e5) {
                o0("操作失败，请稍候再试~", true, i4, 1);
                e5.printStackTrace();
                return;
            }
        }
        o0("网络连接失败，再试试吧~", true, i4, 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void back_image() {
        finish();
    }

    @Override // com.join.mgps.adapter.CommentAllListAdapter.h
    @Background
    public void c(CommentBaseBean commentBaseBean, int i4, int i5) {
        if (com.join.android.app.common.utils.j.j(this.f29311b)) {
            try {
                CommentResponse<CommentPraiseBean> l4 = this.f29320k.l(l0(commentBaseBean.getId(), i5, commentBaseBean.getPn()));
                if (l4 != null) {
                    if (l4.getCode() == 801) {
                        p0(l4);
                    } else if (l4.getSucc() != 1) {
                        o0(l4.getMsg(), true, i4, 2);
                    }
                    if (l4.getSucc() == 1) {
                        i0(i4, 2);
                        return;
                    }
                    return;
                }
                o0("操作失败，请稍候再试~", true, i4, 2);
                return;
            } catch (Exception e5) {
                o0("操作失败，请稍候再试~", true, i4, 2);
                e5.printStackTrace();
                return;
            }
        }
        o0("网络连接失败，再试试吧~", true, i4, 2);
    }

    @Override // com.join.mgps.adapter.CommentAllListAdapter.h
    public void d(CommentBaseBean commentBaseBean) {
        CommentDetailActivity_.M1(this.f29311b).d(commentBaseBean.getGame_id()).b(commentBaseBean.getId()).f(this.f29330u).a(this.f29328s).e(this.f29331v).h(this.f29329t).g(this.f29326q).c(this.f29327r).start();
    }

    void h0(List<CommentBaseBean> list) {
        for (int i4 = 0; list != null && i4 < list.size(); i4++) {
            CommentBaseBean commentBaseBean = list.get(i4);
            if (commentBaseBean.isTitle()) {
                this.S.add(new CommentAllListAdapter.i(CommentAllListAdapter.ViewType.TITLE, new CommentAllListAdapter.i.a(commentBaseBean)));
            } else {
                this.S.add(new CommentAllListAdapter.i(CommentAllListAdapter.ViewType.COMMENT, new CommentAllListAdapter.i.a(commentBaseBean)));
            }
        }
    }

    @UiThread
    public void i0(int i4, int i5) {
        if (i5 == 1) {
            this.R.i(i4, 1);
        } else {
            this.R.j(i4, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void k0() {
        if (com.join.android.app.common.utils.j.j(this.f29311b)) {
            this.L = true;
            try {
                CommentResponse b5 = this.f29320k.b(m0());
                if (b5 != null) {
                    if (b5.getCode() != 0) {
                        p0(b5);
                    }
                    CommentAllListBean.ScoringDetailsBean scoring_details = b5.getData_info().getScoring_details();
                    this.P = b5.getData_info().getSelf_comment();
                    List<CommentAllListBean.HotCommentBean> hot_comment = b5.getData_info().getHot_comment();
                    List<CommentAllListBean.GeneralCommentBean> general_comment = b5.getData_info().getGeneral_comment();
                    List<CommentBaseBean> arrayList = new ArrayList<>();
                    if (scoring_details != null) {
                        q0(scoring_details);
                    }
                    if (hot_comment != null && hot_comment.size() > 0) {
                        CommentBaseBean commentBaseBean = new CommentBaseBean();
                        commentBaseBean.setIs_hot(1);
                        commentBaseBean.setTitle(true);
                        commentBaseBean.setPn(this.K);
                        arrayList.add(commentBaseBean);
                        arrayList.addAll(hot_comment);
                    }
                    if (this.P != null && this.K == 1) {
                        CommentBaseBean commentBaseBean2 = new CommentBaseBean();
                        commentBaseBean2.setIs_hot(2);
                        commentBaseBean2.setTitle(true);
                        commentBaseBean2.setPn(this.K);
                        arrayList.add(commentBaseBean2);
                        this.P.setPn(this.K);
                        arrayList.add(this.P);
                    }
                    if (general_comment != null && general_comment.size() > 0) {
                        if (this.K == 1 && this.P == null) {
                            CommentBaseBean commentBaseBean3 = new CommentBaseBean();
                            commentBaseBean3.setIs_hot(2);
                            commentBaseBean3.setTitle(true);
                            commentBaseBean3.setPn(this.K);
                            arrayList.add(commentBaseBean3);
                        }
                        for (int i4 = 0; i4 < general_comment.size(); i4++) {
                            CommentBaseBean commentBaseBean4 = general_comment.get(i4);
                            commentBaseBean4.setPn(this.K);
                            arrayList.add(commentBaseBean4);
                        }
                    }
                    r0(arrayList);
                    return;
                }
                showLodingFailed();
                return;
            } catch (Exception e5) {
                showLodingFailed();
                e5.printStackTrace();
                return;
            }
        }
        showLodingFailed();
    }

    public RequestCommentpraiseArgs l0(String str, int i4, int i5) {
        String str2;
        String str3 = Build.MODEL;
        this.O = this.f29321l.commentToken().d();
        com.wufan.user.service.protobuf.n0 accountData = AccountUtil_.getInstance_(this.f29311b).getAccountData();
        this.M = accountData;
        if (accountData != null) {
            this.N = accountData.getUid();
            str2 = this.M.getToken();
        } else {
            str2 = "";
        }
        return RequestBeanUtil.getInstance(this.f29311b).getPraiseComment(this.f29325p, this.O, str3, str, str2, this.N, i4, i5);
    }

    public RequestCommentAllListArgs m0() {
        this.M = AccountUtil_.getInstance_(this.f29311b).getAccountData();
        this.O = this.f29321l.commentToken().d();
        com.wufan.user.service.protobuf.n0 n0Var = this.M;
        if (n0Var != null) {
            this.N = n0Var.getUid();
        }
        return RequestBeanUtil.getInstance(this.f29311b).getRequestCommentAllList(this.K, 10, this.f29325p, this.N, this.O);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void n0() {
        if (com.join.android.app.common.utils.j.j(this.f29311b)) {
            try {
                CommentResponse<CommentTokenBean> c5 = this.f29320k.c(RequestBeanUtil.getInstance(this).getTokenRequestBean(AccountUtil_.getInstance_(this).getUid(), ""));
                if (c5 == null || c5.getCode() != 0 || c5.getData_info() == null || TextUtils.isEmpty(c5.getData_info().getToken())) {
                    return;
                }
                this.f29321l.commentToken().g(AESUtils.f(c5.getData_info().getToken() + "|" + c5.getData_info().getTimes()));
                this.f29321l.lastCheckInTime().g(Long.valueOf(System.currentTimeMillis()));
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void o0(String str, boolean z4, int i4, int i5) {
        com.join.mgps.Util.l2.a(this.f29311b).b(str);
        if (z4) {
            if (i5 == 1) {
                this.R.j(i4, 0);
            } else {
                this.R.i(i4, 0);
            }
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onChangeComment(com.join.mgps.event.j jVar) {
        this.K = 1;
        k0();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        org.greenrobot.eventbus.c.f().y(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void p0(CommentResponse commentResponse) {
        if (commentResponse.getCode() == 801) {
            n0();
            com.join.mgps.Util.l2.a(this.f29311b).b("数据访问失败，请稍候再试！");
            return;
        }
        com.join.mgps.Util.l2.a(this.f29311b).b(commentResponse.getMsg());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void q0(CommentAllListBean.ScoringDetailsBean scoringDetailsBean) {
        HistogramView[] histogramViewArr = {this.F, this.G, this.H, this.I, this.J};
        String[] strArr = {"#F47500", "#FFA423", "#FFB53D", "#FBCD36", "#E4DECA"};
        this.D.setText(new DecimalFormat("#.0").format(Double.valueOf(scoringDetailsBean.getTotal_score()).doubleValue()));
        this.A.setStarMark(scoringDetailsBean.getTotal_stars());
        double[] dArr = {Double.valueOf(scoringDetailsBean.getStars_score5()).doubleValue(), Double.valueOf(scoringDetailsBean.getStars_score4()).doubleValue(), Double.valueOf(scoringDetailsBean.getStars_score3()).doubleValue(), Double.valueOf(scoringDetailsBean.getStars_score2()).doubleValue(), Double.valueOf(scoringDetailsBean.getStars_score1()).doubleValue()};
        double d5 = 0.0d;
        int i4 = 0;
        for (int i5 = 0; i5 < 5; i5++) {
            double d6 = dArr[i5];
            if (dArr[i5] > d5) {
                d5 = dArr[i5];
                i4 = i5;
            }
        }
        this.E.setText(scoringDetailsBean.getP_count() + "人");
        if (scoringDetailsBean.getP_count() <= 0) {
            this.A.setStarMark(0.0d);
            this.C.setVisibility(0);
            this.D.setVisibility(8);
            this.E.setVisibility(8);
        } else {
            this.f29334y.setVisibility(0);
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, j0(this, 10.0f));
        for (int i6 = 0; i6 < 5; i6++) {
            histogramViewArr[i6].setAnim(false);
            if (dArr[i6] == 0.0d) {
                histogramViewArr[i6].setProgress(0.0d);
            } else if (i6 == i4) {
                histogramViewArr[i6].setProgress(1.0d);
            } else if (d5 == dArr[i6]) {
                histogramViewArr[i6].setProgress(1.0d);
            } else {
                histogramViewArr[i6].setProgress(dArr[i6] / d5);
            }
            histogramViewArr[i6].setRateBackgroundColor(strArr[i6]);
            histogramViewArr[i6].setLayoutParams(layoutParams);
            histogramViewArr[i6].setOrientation(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void r0(List<CommentBaseBean> list) {
        if (this.K == 1) {
            if (list.size() > 0) {
                this.f29316g.setVisibility(0);
                this.f29315f.setVisibility(0);
                this.f29319j.setVisibility(8);
                this.f29314e.setVisibility(8);
            } else {
                this.f29316g.setVisibility(8);
                this.f29315f.setVisibility(8);
                this.f29319j.setVisibility(0);
                this.f29314e.setVisibility(0);
            }
            this.f29318i.setVisibility(8);
            this.f29317h.setVisibility(8);
            this.T.clear();
            this.S.clear();
        }
        this.K++;
        this.T.addAll(list);
        h0(list);
        this.f29316g.u();
        this.f29316g.v();
        if (list.size() <= 0) {
            this.f29316g.setNoMore();
        }
        this.R.notifyDataSetChanged();
        t0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void s0() {
        if (IntentUtil.getInstance().goLoginInteractive(this.f29311b)) {
            return;
        }
        if (this.R.g() != -1 && this.P != null) {
            CommentCreatActivity_.w0(this.f29311b).f(this.f29325p).j(this.f29326q).d(this.f29327r).c(this.P.getId()).e(Float.valueOf(this.P.getStars_score()).floatValue()).h(this.f29330u).g(1).a(this.f29328s).b(this.P.getContent()).start();
        } else {
            CommentCreatActivity_.w0(this.f29311b).f(this.f29325p).j(this.f29326q).a(this.f29328s).d(this.f29327r).h(this.f29330u).g(1).start();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showLoding() {
        this.f29316g.setVisibility(8);
        this.f29315f.setVisibility(8);
        this.f29318i.setVisibility(8);
        this.f29319j.setVisibility(8);
        this.f29317h.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showLodingFailed() {
        List<CommentAllListBean> list = this.Q;
        if (list != null && list.size() != 0) {
            Toast.makeText(this, getString(R.string.net_connect_failed), 0).show();
        } else {
            this.f29316g.setVisibility(8);
            this.f29315f.setVisibility(8);
            this.f29318i.setVisibility(0);
            this.f29317h.setVisibility(8);
            this.f29319j.setVisibility(8);
            this.f29314e.setVisibility(0);
        }
        t0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showMessage(String str) {
        com.join.mgps.Util.l2.a(this.f29311b).b(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void t0() {
        this.f29316g.u();
        this.f29316g.v();
        this.L = false;
    }
}
