package com.join.mgps.fragment;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.AESUtils;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.Util.RequestBeanUtil;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.Util.g2;
import com.join.mgps.Util.l2;
import com.join.mgps.activity.CommentCreatActivity_;
import com.join.mgps.activity.CommentDetailActivity_;
import com.join.mgps.adapter.CommentAllListFragmentAdapter;
import com.join.mgps.customview.LoadMoreRecyclerView;
import com.join.mgps.dto.CommentAllListBean;
import com.join.mgps.dto.CommentAlllistIntentData;
import com.join.mgps.dto.CommentBaseBean;
import com.join.mgps.dto.CommentPraiseBean;
import com.join.mgps.dto.CommentResponse;
import com.join.mgps.dto.CommentTokenBean;
import com.join.mgps.dto.GamedetialModleFourBean;
import com.join.mgps.dto.RequestCommentAllListArgs;
import com.join.mgps.dto.RequestCommentpraiseArgs;
import com.join.mgps.pref.PrefDef_;
import java.util.ArrayList;
import java.util.List;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
import org.androidannotations.annotations.sharedpreferences.Pref;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
@EFragment(R.layout.comment_all_list_fragment)
/* loaded from: classes.dex */
public class CommentAllListFragment extends Fragment implements CommentAllListFragmentAdapter.h {
    private CommentBaseBean A;
    private CommentAllListFragmentAdapter C;
    private List<CommentAllListFragmentAdapter.i> D;
    private List<CommentBaseBean> E;
    private w1.b F;

    /* renamed from: b  reason: collision with root package name */
    private Context f50411b;
    @ViewById

    /* renamed from: c  reason: collision with root package name */
    ImageView f50412c;
    @ViewById

    /* renamed from: d  reason: collision with root package name */
    TextView f50413d;
    @ViewById

    /* renamed from: e  reason: collision with root package name */
    TextView f50414e;
    @ViewById

    /* renamed from: f  reason: collision with root package name */
    LoadMoreRecyclerView f50415f;
    @ViewById

    /* renamed from: g  reason: collision with root package name */
    LinearLayout f50416g;
    @ViewById

    /* renamed from: h  reason: collision with root package name */
    LinearLayout f50417h;
    @ViewById

    /* renamed from: i  reason: collision with root package name */
    NestedScrollView f50418i;

    /* renamed from: j  reason: collision with root package name */
    com.join.mgps.rpc.f f50419j;
    @Pref

    /* renamed from: k  reason: collision with root package name */
    PrefDef_ f50420k;

    /* renamed from: l  reason: collision with root package name */
    String f50421l;

    /* renamed from: m  reason: collision with root package name */
    String f50422m;

    /* renamed from: n  reason: collision with root package name */
    float f50423n;

    /* renamed from: o  reason: collision with root package name */
    String f50424o;

    /* renamed from: p  reason: collision with root package name */
    String f50425p;

    /* renamed from: q  reason: collision with root package name */
    String f50426q;

    /* renamed from: r  reason: collision with root package name */
    int f50427r;

    /* renamed from: s  reason: collision with root package name */
    int f50428s;

    /* renamed from: t  reason: collision with root package name */
    String f50429t;

    /* renamed from: u  reason: collision with root package name */
    int f50430u;

    /* renamed from: x  reason: collision with root package name */
    private com.wufan.user.service.protobuf.n0 f50433x;

    /* renamed from: y  reason: collision with root package name */
    private int f50434y;

    /* renamed from: z  reason: collision with root package name */
    private String f50435z;

    /* renamed from: v  reason: collision with root package name */
    private int f50431v = 1;

    /* renamed from: w  reason: collision with root package name */
    private boolean f50432w = false;
    private List<CommentAllListBean> B = new ArrayList();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a implements LoadMoreRecyclerView.b {
        a() {
        }

        @Override // com.join.mgps.customview.LoadMoreRecyclerView.b
        public void onLoadMore() {
            CommentAllListFragment.this.X();
        }
    }

    public static CommentAllListFragment c0(CommentAlllistIntentData commentAlllistIntentData) {
        Bundle bundle = new Bundle();
        bundle.putSerializable("intentData", commentAlllistIntentData);
        CommentAllListFragment_ commentAllListFragment_ = new CommentAllListFragment_();
        commentAllListFragment_.setArguments(bundle);
        return commentAllListFragment_;
    }

    @Override // com.join.mgps.adapter.CommentAllListFragmentAdapter.h
    public void I() {
        h0();
    }

    void V(List<CommentBaseBean> list) {
        for (int i4 = 0; list != null && i4 < list.size(); i4++) {
            CommentBaseBean commentBaseBean = list.get(i4);
            if (commentBaseBean.isTitle()) {
                this.D.add(new CommentAllListFragmentAdapter.i(CommentAllListFragmentAdapter.ViewType.TITLE, new CommentAllListFragmentAdapter.i.a(commentBaseBean)));
            } else {
                this.D.add(new CommentAllListFragmentAdapter.i(CommentAllListFragmentAdapter.ViewType.COMMENT, new CommentAllListFragmentAdapter.i.a(commentBaseBean)));
            }
        }
    }

    @UiThread
    public void W(int i4, int i5) {
        if (i5 == 1) {
            this.C.h(i4, 1);
        } else {
            this.C.i(i4, 1);
        }
        this.f50415f.getAdapter().notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void X() {
        if (com.join.android.app.common.utils.j.j(this.f50411b)) {
            this.f50432w = true;
            try {
                CommentResponse b5 = this.f50419j.b(a0());
                if (b5 != null) {
                    if (b5.getCode() != 0) {
                        e0(b5);
                    }
                    CommentAllListBean.ScoringDetailsBean scoring_details = b5.getData_info().getScoring_details();
                    CommentAllListBean.SelfCommentBean self_comment = b5.getData_info().getSelf_comment();
                    this.A = self_comment;
                    this.C.l(self_comment);
                    List<CommentAllListBean.HotCommentBean> hot_comment = b5.getData_info().getHot_comment();
                    List<CommentAllListBean.GeneralCommentBean> general_comment = b5.getData_info().getGeneral_comment();
                    List<CommentBaseBean> arrayList = new ArrayList<>();
                    if (hot_comment != null && hot_comment.size() > 0) {
                        CommentBaseBean commentBaseBean = new CommentBaseBean();
                        commentBaseBean.setIs_hot(1);
                        commentBaseBean.setTitle(true);
                        commentBaseBean.setPn(this.f50431v);
                        arrayList.add(commentBaseBean);
                        arrayList.addAll(hot_comment);
                    }
                    if (this.A != null && this.f50431v == 1) {
                        CommentBaseBean commentBaseBean2 = new CommentBaseBean();
                        commentBaseBean2.setIs_hot(2);
                        commentBaseBean2.setTitle(true);
                        commentBaseBean2.setPn(this.f50431v);
                        arrayList.add(commentBaseBean2);
                        this.A.setPn(this.f50431v);
                        arrayList.add(this.A);
                    }
                    if (general_comment != null && general_comment.size() > 0) {
                        if (this.f50431v == 1 && this.A == null) {
                            CommentBaseBean commentBaseBean3 = new CommentBaseBean();
                            commentBaseBean3.setIs_hot(2);
                            commentBaseBean3.setTitle(true);
                            commentBaseBean3.setPn(this.f50431v);
                            arrayList.add(commentBaseBean3);
                        }
                        for (int i4 = 0; i4 < general_comment.size(); i4++) {
                            CommentBaseBean commentBaseBean4 = general_comment.get(i4);
                            commentBaseBean4.setPn(this.f50431v);
                            arrayList.add(commentBaseBean4);
                        }
                    }
                    g0(arrayList, scoring_details);
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

    public RequestCommentpraiseArgs Z(String str, int i4, int i5) {
        String str2;
        String str3 = Build.MODEL;
        this.f50435z = this.f50420k.commentToken().d();
        com.wufan.user.service.protobuf.n0 accountData = AccountUtil_.getInstance_(this.f50411b).getAccountData();
        this.f50433x = accountData;
        if (accountData != null) {
            this.f50434y = accountData.getUid();
            str2 = this.f50433x.getToken();
        } else {
            str2 = "";
        }
        return RequestBeanUtil.getInstance(this.f50411b).getPraiseComment(this.f50424o, this.f50435z, str3, str, str2, this.f50434y, i4, i5);
    }

    public RequestCommentAllListArgs a0() {
        this.f50433x = AccountUtil_.getInstance_(this.f50411b).getAccountData();
        this.f50435z = this.f50420k.commentToken().d();
        com.wufan.user.service.protobuf.n0 n0Var = this.f50433x;
        if (n0Var != null) {
            this.f50434y = n0Var.getUid();
        }
        return RequestBeanUtil.getInstance(this.f50411b).getRequestCommentAllList(this.f50431v, 10, this.f50424o, this.f50434y, this.f50435z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterView() {
        this.f50419j = com.join.mgps.rpc.impl.e.m();
        CommentAlllistIntentData commentAlllistIntentData = (CommentAlllistIntentData) getArguments().getSerializable("intentData");
        this.f50421l = commentAlllistIntentData.getCommentId();
        this.f50422m = commentAlllistIntentData.getCommentContent();
        this.f50423n = commentAlllistIntentData.getCommentStars();
        this.f50424o = commentAlllistIntentData.getGameId();
        this.f50425p = commentAlllistIntentData.getPackageName();
        this.f50426q = commentAlllistIntentData.getCommentScoreSwitch();
        this.f50427r = commentAlllistIntentData.getBespeakSwitch();
        this.f50428s = commentAlllistIntentData.getSgcSwitch();
        this.f50429t = commentAlllistIntentData.getGameType();
        this.f50430u = commentAlllistIntentData.getGameIsStart();
        this.f50411b = getContext();
        this.f50413d.setText("全部点评");
        if (!org.greenrobot.eventbus.c.f().m(this)) {
            org.greenrobot.eventbus.c.f().t(this);
        }
        com.wufan.user.service.protobuf.n0 accountData = AccountUtil_.getInstance_(this.f50411b).getAccountData();
        this.f50433x = accountData;
        if (accountData != null) {
            this.f50434y = accountData.getUid();
        }
        this.f50435z = this.f50420k.commentToken().d();
        showLoding();
        X();
        this.E = new ArrayList();
        ArrayList arrayList = new ArrayList();
        this.D = arrayList;
        this.C = new CommentAllListFragmentAdapter(this.f50411b, this.f50434y, arrayList, this.f50426q, this.f50428s, this);
        this.f50415f.setLayoutManager(new LinearLayoutManager(getContext()));
        this.f50415f.setAdapter(this.C);
        this.f50415f.setVerticalScrollBarEnabled(false);
        this.f50415f.setAutoLoadMoreEnable(true);
        this.f50415f.setLoadMoreListener(new a());
    }

    @Override // com.join.mgps.adapter.CommentAllListFragmentAdapter.h
    @Background
    public void b(CommentBaseBean commentBaseBean, int i4, int i5) {
        if (com.join.android.app.common.utils.j.j(this.f50411b)) {
            try {
                CommentResponse<CommentPraiseBean> h4 = this.f50419j.h(Z(commentBaseBean.getId(), i5, commentBaseBean.getPn()));
                if (h4 != null) {
                    if (h4.getCode() == 801) {
                        e0(h4);
                    } else if (h4.getSucc() != 1) {
                        d0(h4.getMsg(), true, i4, 1);
                    }
                    if (h4.getSucc() == 1) {
                        W(i4, 1);
                        return;
                    }
                    return;
                }
                d0("操作失败，请稍候再试~", true, i4, 1);
                return;
            } catch (Exception e5) {
                d0("操作失败，请稍候再试~", true, i4, 1);
                e5.printStackTrace();
                return;
            }
        }
        d0("网络连接失败，再试试吧~", true, i4, 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void b0() {
        if (com.join.android.app.common.utils.j.j(this.f50411b)) {
            try {
                CommentResponse<CommentTokenBean> c5 = this.f50419j.c(RequestBeanUtil.getInstance(this.f50411b).getTokenRequestBean(AccountUtil_.getInstance_(this.f50411b).getUid(), ""));
                if (c5 == null || c5.getCode() != 0 || c5.getData_info() == null || TextUtils.isEmpty(c5.getData_info().getToken())) {
                    return;
                }
                this.f50420k.commentToken().g(AESUtils.f(c5.getData_info().getToken() + "|" + c5.getData_info().getTimes()));
                this.f50420k.lastCheckInTime().g(Long.valueOf(System.currentTimeMillis()));
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    @Override // com.join.mgps.adapter.CommentAllListFragmentAdapter.h
    @Background
    public void c(CommentBaseBean commentBaseBean, int i4, int i5) {
        if (com.join.android.app.common.utils.j.j(this.f50411b)) {
            try {
                CommentResponse<CommentPraiseBean> l4 = this.f50419j.l(Z(commentBaseBean.getId(), i5, commentBaseBean.getPn()));
                if (l4 != null) {
                    if (l4.getCode() == 801) {
                        e0(l4);
                    } else if (l4.getSucc() != 1) {
                        d0(l4.getMsg(), true, i4, 2);
                    }
                    if (l4.getSucc() == 1) {
                        W(i4, 2);
                        return;
                    }
                    return;
                }
                d0("操作失败，请稍候再试~", true, i4, 2);
                return;
            } catch (Exception e5) {
                d0("操作失败，请稍候再试~", true, i4, 2);
                e5.printStackTrace();
                return;
            }
        }
        d0("网络连接失败，再试试吧~", true, i4, 2);
    }

    @Override // com.join.mgps.adapter.CommentAllListFragmentAdapter.h
    public void d(CommentBaseBean commentBaseBean) {
        CommentDetailActivity_.M1(this.f50411b).d(commentBaseBean.getGame_id()).b(commentBaseBean.getId()).f(this.f50429t).a(this.f50427r).e(this.f50430u).h(this.f50428s).g(this.f50425p).c(this.f50426q).start();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void d0(String str, boolean z4, int i4, int i5) {
        l2.a(this.f50411b).b(str);
        if (z4) {
            if (i5 == 1) {
                this.C.i(i4, 0);
            } else {
                this.C.h(i4, 0);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void e0(CommentResponse commentResponse) {
        if (commentResponse.getCode() == 801) {
            b0();
            l2.a(this.f50411b).b("数据访问失败，请稍候再试！");
            return;
        }
        l2.a(this.f50411b).b(commentResponse.getMsg());
    }

    public void f0(w1.b bVar) {
        this.F = bVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void g0(List<CommentBaseBean> list, CommentAllListBean.ScoringDetailsBean scoringDetailsBean) {
        String str;
        try {
            if (this.f50431v == 1) {
                if (list.size() > 0) {
                    this.f50415f.setVisibility(0);
                    this.f50418i.setVisibility(8);
                } else {
                    this.f50415f.setVisibility(8);
                    this.f50418i.setVisibility(0);
                }
                this.f50417h.setVisibility(8);
                this.f50416g.setVisibility(8);
                this.E.clear();
                this.D.clear();
                if (scoringDetailsBean != null && (str = this.f50426q) != null && str.equals("1")) {
                    this.D.add(new CommentAllListFragmentAdapter.i(CommentAllListFragmentAdapter.ViewType.HEAD, scoringDetailsBean));
                }
            }
            this.f50431v++;
            this.E.addAll(list);
            V(list);
            if (list.size() == 0) {
                this.f50415f.k(false);
            } else {
                this.f50415f.k(true);
            }
            this.C.notifyDataSetChanged();
            if (list.size() == 0) {
                this.f50415f.k(false);
            } else {
                i0();
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click({R.id.goCommit})
    public void goComment() {
        w1.b bVar;
        GamedetialModleFourBean a5;
        com.wufan.user.service.protobuf.n0 accountData = AccountUtil_.getInstance_(this.f50411b).getAccountData();
        if (!g2.h(accountData.getNickname()) && (!accountData.getAccount().equals(accountData.getNickname()) || !accountData.getAccount().startsWith("pa"))) {
            if (IntentUtil.getInstance().goLoginInteractive(this.f50411b) || (bVar = this.F) == null || (a5 = bVar.a()) == null) {
                return;
            }
            if (a5.getSelf_comment() == null) {
                CommentCreatActivity_.w0(this.f50411b).f(a5.getGame_id()).j(a5.getPackageName()).h(a5.getPlugin_num()).g(a5.getIs_started()).a(a5.getBespeak_switch()).d(a5.getComment_score_switch()).start();
                return;
            }
            CommentAllListBean.SelfCommentBean self_comment = a5.getSelf_comment();
            CommentCreatActivity_.w0(this.f50411b).f(a5.getGame_id()).j(a5.getPackageName()).d(a5.getComment_score_switch()).c(self_comment.getId()).e(Float.valueOf(self_comment.getStars_score()).floatValue()).a(a5.getBespeak_switch()).h(a5.getPlugin_num()).g(a5.getIs_started()).b(self_comment.getContent()).start();
            return;
        }
        IntentUtil.getInstance().goChangeNickname(this.f50411b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void h0() {
        if (IntentUtil.getInstance().goLoginInteractive(this.f50411b)) {
            return;
        }
        com.wufan.user.service.protobuf.n0 accountData = AccountUtil_.getInstance_(this.f50411b).getAccountData();
        if (!g2.h(accountData.getNickname()) && (!accountData.getAccount().equals(accountData.getNickname()) || !accountData.getAccount().startsWith("pa"))) {
            if (this.C.f() != -1 && this.A != null) {
                CommentCreatActivity_.w0(this.f50411b).f(this.f50424o).j(this.f50425p).d(this.f50426q).c(this.A.getId()).e(Float.valueOf(this.A.getStars_score()).floatValue()).h(this.f50429t).g(1).a(this.f50427r).b(this.A.getContent()).start();
                return;
            } else {
                CommentCreatActivity_.w0(this.f50411b).f(this.f50424o).j(this.f50425p).a(this.f50427r).d(this.f50426q).h(this.f50429t).g(1).start();
                return;
            }
        }
        IntentUtil.getInstance().goChangeNickname(this.f50411b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void i0() {
        try {
            this.f50415f.setLoadingMore(false);
            this.f50415f.k(true);
            if (this.E.size() < 10) {
                this.f50415f.k(false);
            }
            this.C.notifyDataSetChanged();
            this.f50432w = false;
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onChangeComment(com.join.mgps.event.j jVar) {
        this.f50431v = 1;
        X();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        org.greenrobot.eventbus.c.f().y(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void relodingimag() {
        this.f50431v = 1;
        X();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void setNetwork() {
        UtilsMy.w3(getContext());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showLoding() {
        try {
            this.f50415f.setVisibility(8);
            this.f50417h.setVisibility(8);
            this.f50418i.setVisibility(8);
            this.f50416g.setVisibility(0);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showLodingFailed() {
        try {
            List<CommentAllListBean> list = this.B;
            if (list != null && list.size() != 0) {
                Toast.makeText(this.f50411b, getString(R.string.net_connect_failed), 0).show();
                i0();
            }
            this.f50415f.setVisibility(8);
            this.f50417h.setVisibility(0);
            this.f50416g.setVisibility(8);
            this.f50418i.setVisibility(8);
            i0();
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showMessage(String str) {
        l2.a(this.f50411b).b(str);
    }
}
