package com.join.mgps.activity;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.BaseActivity;
import com.join.android.app.common.view.ClearEditText;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.Util.RequestBeanUtil;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.activity.login.LoginSplashActivity_;
import com.join.mgps.adapter.GameCommentAdapter;
import com.join.mgps.customview.KeyboardListenLayout;
import com.join.mgps.customview.XListView2;
import com.join.mgps.dto.AccountBean;
import com.join.mgps.dto.CommitContextDataBean;
import com.join.mgps.dto.CommitDataBean;
import com.join.mgps.dto.CommonRequestBean;
import com.join.mgps.dto.InformationCommentBack;
import com.join.mgps.dto.InformationCommentBean;
import com.join.mgps.dto.PariseBackData;
import com.join.mgps.dto.ResultMainBean;
import com.join.mgps.dto.RewardBean;
import it.sephiroth.android.library.widget.HListView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.Extra;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
@EActivity(R.layout.information_comment_activity)
/* loaded from: classes4.dex */
public class GameCommentActivity extends BaseActivity {
    @Extra
    InformationCommentBean A;
    private Context C;
    private GameCommentAdapter D;
    private List<InformationCommentBean> E;
    private com.wufan.user.service.protobuf.n0 G;
    private int H;
    private String I;
    private String J;
    int K;
    private ViewTreeObserver M;
    private List<GameCommentAdapter.l> N;
    @ViewById

    /* renamed from: b  reason: collision with root package name */
    RelativeLayout f31443b;
    @ViewById

    /* renamed from: c  reason: collision with root package name */
    ImageView f31444c;
    @ViewById

    /* renamed from: d  reason: collision with root package name */
    TextView f31445d;
    @ViewById

    /* renamed from: e  reason: collision with root package name */
    TextView f31446e;
    @ViewById

    /* renamed from: f  reason: collision with root package name */
    XListView2 f31447f;
    @ViewById

    /* renamed from: g  reason: collision with root package name */
    LinearLayout f31448g;
    @ViewById

    /* renamed from: h  reason: collision with root package name */
    LinearLayout f31449h;
    @ViewById

    /* renamed from: i  reason: collision with root package name */
    FrameLayout f31450i;
    @ViewById

    /* renamed from: j  reason: collision with root package name */
    ClearEditText f31451j;
    @ViewById

    /* renamed from: k  reason: collision with root package name */
    Button f31452k;
    @ViewById

    /* renamed from: l  reason: collision with root package name */
    Button f31453l;
    @ViewById

    /* renamed from: m  reason: collision with root package name */
    TextView f31454m;
    @ViewById

    /* renamed from: n  reason: collision with root package name */
    ImageView f31455n;
    @ViewById

    /* renamed from: o  reason: collision with root package name */
    TextView f31456o;
    @ViewById

    /* renamed from: p  reason: collision with root package name */
    Button f31457p;
    @ViewById

    /* renamed from: q  reason: collision with root package name */
    LinearLayout f31458q;
    @ViewById

    /* renamed from: r  reason: collision with root package name */
    View f31459r;
    @ViewById

    /* renamed from: s  reason: collision with root package name */
    LinearLayout f31460s;
    @ViewById

    /* renamed from: t  reason: collision with root package name */
    HListView f31461t;
    @ViewById

    /* renamed from: u  reason: collision with root package name */
    TextView f31462u;
    @ViewById

    /* renamed from: v  reason: collision with root package name */
    KeyboardListenLayout f31463v;

    /* renamed from: w  reason: collision with root package name */
    com.join.mgps.rpc.e f31464w;
    @Extra

    /* renamed from: x  reason: collision with root package name */
    String f31465x;
    @Extra

    /* renamed from: y  reason: collision with root package name */
    String f31466y;
    @Extra

    /* renamed from: z  reason: collision with root package name */
    boolean f31467z;
    private int B = 1;
    private boolean F = false;
    Handler L = new a();
    com.join.mgps.dialog.d1 O = null;
    com.join.mgps.customview.o P = null;

    /* loaded from: classes4.dex */
    class a extends Handler {
        a() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i4 = message.what;
            if (i4 == 1) {
                if (IntentUtil.getInstance().goLoginInteractive(GameCommentActivity.this.C)) {
                    return;
                }
                GameCommentActivity.this.w0((InformationCommentBean) message.obj);
            } else if (i4 != 2) {
                if (i4 != 3) {
                    return;
                }
                GameCommentActivity.this.f31451j.setFocusable(true);
                GameCommentActivity.this.f31451j.setFocusableInTouchMode(true);
                GameCommentActivity.this.f31451j.requestFocus();
                ((InputMethodManager) GameCommentActivity.this.f31451j.getContext().getSystemService("input_method")).showSoftInput(GameCommentActivity.this.f31451j, 0);
            } else {
                CommitDataBean commitDataBean = (CommitDataBean) message.obj;
                if (commitDataBean.isHas_praised()) {
                    return;
                }
                GameCommentActivity.this.f31451j.setFocusable(true);
                GameCommentActivity.this.f31451j.setFocusableInTouchMode(true);
                GameCommentActivity.this.f31451j.requestFocus();
                ((InputMethodManager) GameCommentActivity.this.f31451j.getContext().getSystemService("input_method")).showSoftInput(GameCommentActivity.this.f31451j, 0);
                ClearEditText clearEditText = GameCommentActivity.this.f31451j;
                clearEditText.setHint("@" + commitDataBean.getUser_name() + ":");
            }
        }
    }

    /* loaded from: classes4.dex */
    class b implements GameCommentAdapter.j {
        b() {
        }

        @Override // com.join.mgps.adapter.GameCommentAdapter.j
        public void a(InformationCommentBean informationCommentBean) {
            Message obtainMessage = GameCommentActivity.this.L.obtainMessage();
            obtainMessage.what = 1;
            obtainMessage.obj = informationCommentBean;
            obtainMessage.sendToTarget();
        }

        @Override // com.join.mgps.adapter.GameCommentAdapter.j
        public void d() {
        }

        @Override // com.join.mgps.adapter.GameCommentAdapter.j
        public void e(InformationCommentBean.Sub sub) {
            ClearEditText clearEditText = GameCommentActivity.this.f31451j;
            clearEditText.setHint("@" + sub.getUser_name() + "：");
            GameCommentActivity.this.f31451j.setFocusable(true);
            GameCommentActivity.this.f31451j.setFocusableInTouchMode(true);
            GameCommentActivity.this.f31451j.requestFocus();
            ((InputMethodManager) GameCommentActivity.this.f31451j.getContext().getSystemService("input_method")).showSoftInput(GameCommentActivity.this.f31451j, 0);
            GameCommentActivity.this.I = sub.getComment_id();
            GameCommentActivity.this.K = Integer.parseInt(sub.getUser_id());
            GameCommentActivity.this.J = sub.getUser_name();
        }

        @Override // com.join.mgps.adapter.GameCommentAdapter.j
        public void f(InformationCommentBean informationCommentBean) {
            ClearEditText clearEditText = GameCommentActivity.this.f31451j;
            clearEditText.setHint("@" + informationCommentBean.getUser_name() + "：");
            GameCommentActivity.this.f31451j.setFocusable(true);
            GameCommentActivity.this.f31451j.setFocusableInTouchMode(true);
            GameCommentActivity.this.f31451j.requestFocus();
            ((InputMethodManager) GameCommentActivity.this.f31451j.getContext().getSystemService("input_method")).showSoftInput(GameCommentActivity.this.f31451j, 0);
            GameCommentActivity.this.I = informationCommentBean.getComment_id();
            GameCommentActivity.this.K = Integer.parseInt(informationCommentBean.getUser_id());
            GameCommentActivity.this.J = informationCommentBean.getUser_name();
        }
    }

    /* loaded from: classes4.dex */
    class c implements com.join.mgps.customview.f {
        c() {
        }

        @Override // com.join.mgps.customview.f
        public void onLoadMore() {
            if (GameCommentActivity.this.F) {
                return;
            }
            GameCommentActivity.this.o0();
        }
    }

    /* loaded from: classes4.dex */
    class d implements com.join.mgps.customview.g {
        d() {
        }

        @Override // com.join.mgps.customview.g
        public void onRefresh() {
            if (GameCommentActivity.this.F) {
                return;
            }
            GameCommentActivity.this.B = 1;
            GameCommentActivity.this.o0();
        }
    }

    private com.wufan.user.service.protobuf.n0 accountBean(Context context) {
        return AccountUtil_.getInstance_(context).getAccountData();
    }

    private boolean isLogined(Context context) {
        com.wufan.user.service.protobuf.n0 accountBean = accountBean(context);
        return accountBean != null && com.join.mgps.Util.g2.i(accountBean.getToken());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void A0() {
        this.O.b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void B0(List<InformationCommentBean> list) {
        if (this.B == 1) {
            this.f31449h.setVisibility(8);
            this.f31448g.setVisibility(8);
            this.f31450i.setVisibility(0);
            this.f31446e.setVisibility(0);
            this.E.clear();
            this.N.clear();
        }
        this.B++;
        this.E.addAll(list);
        l0(list);
        this.f31447f.u();
        this.f31447f.v();
        if (list.size() < 10) {
            this.f31447f.setNoMore();
        }
        this.D.notifyDataSetChanged();
        if (this.f31467z) {
            this.f31467z = false;
            Message message = new Message();
            message.what = 3;
            this.L.sendMessageDelayed(message, 300L);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void C0(InformationCommentBean informationCommentBean) {
        Iterator<InformationCommentBean> it2 = this.E.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            InformationCommentBean next = it2.next();
            if (informationCommentBean.getComment_id() == next.getComment_id()) {
                next.setHasPraised(informationCommentBean.isHasPraised());
                break;
            }
        }
        this.D.notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void D0() {
        this.f31447f.u();
        this.f31447f.v();
    }

    boolean E0() {
        if (accountBean(this.C) == null) {
            return false;
        }
        return !AccountUtil_.getInstance_(this).isTourist();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterview() {
        this.f31464w = com.join.mgps.rpc.impl.d.P1();
        this.C = this;
        com.wufan.user.service.protobuf.n0 accountData = AccountUtil_.getInstance_(this).getAccountData();
        this.G = accountData;
        if (accountData != null) {
            this.H = accountData.getUid();
        }
        this.O = com.join.mgps.Util.b0.f0(this.C).x(this.C);
        showLoding();
        o0();
        this.f31445d.setText("评论");
        this.f31451j.setHint("评论一下吧");
        this.f31445d.setVisibility(0);
        this.f31452k.setVisibility(8);
        this.f31457p.setVisibility(8);
        this.f31454m.setVisibility(8);
        this.N = new ArrayList();
        this.E = new ArrayList();
        b bVar = new b();
        if (this.A != null) {
            ClearEditText clearEditText = this.f31451j;
            clearEditText.setHint("@" + this.A.getUser_name() + "：");
            this.f31451j.setFocusable(true);
            this.f31451j.setFocusableInTouchMode(true);
            this.f31451j.requestFocus();
            ((InputMethodManager) this.f31451j.getContext().getSystemService("input_method")).showSoftInput(this.f31451j, 0);
            this.I = this.A.getComment_id();
            this.K = Integer.parseInt(this.A.getUser_id());
            this.J = this.A.getUser_name();
        }
        GameCommentAdapter gameCommentAdapter = new GameCommentAdapter(this.C, this.N, bVar);
        this.D = gameCommentAdapter;
        this.f31447f.setAdapter((ListAdapter) gameCommentAdapter);
        this.f31447f.setPreLoadCount(10);
        this.f31447f.setVerticalScrollBarEnabled(false);
        this.f31447f.setPullLoadEnable(new c());
        this.f31447f.setPullRefreshEnable(new d());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void back_image() {
        try {
            InputMethodManager inputMethodManager = (InputMethodManager) getSystemService("input_method");
            if (inputMethodManager != null && getCurrentFocus() != null) {
                inputMethodManager.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), 2);
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        finish();
    }

    void l0(List<InformationCommentBean> list) {
        for (int i4 = 0; list != null && i4 < list.size(); i4++) {
            InformationCommentBean informationCommentBean = list.get(i4);
            if (informationCommentBean.isTitle()) {
                this.N.add(new GameCommentAdapter.l(GameCommentAdapter.ViewType.TITLE, new GameCommentAdapter.l.a(informationCommentBean)));
            } else {
                this.N.add(new GameCommentAdapter.l(GameCommentAdapter.ViewType.COMMENT, new GameCommentAdapter.l.a(informationCommentBean)));
                List<InformationCommentBean.Sub> sub = informationCommentBean.getSub();
                if (sub != null && sub.size() > 0) {
                    this.N.add(new GameCommentAdapter.l(GameCommentAdapter.ViewType.REPLY, new GameCommentAdapter.l.b(informationCommentBean.getComment_id(), informationCommentBean, 0, true)));
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void m0() {
        com.wufan.user.service.protobuf.n0 accountData = AccountUtil_.getInstance_(this.C).getAccountData();
        if (accountData == null) {
            ((LoginSplashActivity_.IntentBuilder_) LoginSplashActivity_.intent(this.C).flags(268435456)).start();
            return;
        }
        String obj = this.f31451j.getText().toString();
        if (obj.length() == 0) {
            com.join.mgps.Util.l2.a(this.C).b("不能发表空字符串");
        } else if (obj.length() < 4) {
            com.join.mgps.Util.l2.a(this.C).b("发表评论不能小于4个");
        } else {
            ((InputMethodManager) getSystemService("input_method")).hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), 2);
            if (IntentUtil.getInstance().goLoginInteractive(this)) {
                return;
            }
            this.f31451j.setText("");
            u0(accountData, obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void n0() {
        this.O.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void o0() {
        InformationCommentBack data;
        if (com.join.android.app.common.utils.j.j(this.C)) {
            this.F = true;
            try {
                try {
                    data = this.f31464w.y0(p0()).getMessages().getData();
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
                if (data != null) {
                    List<InformationCommentBean> hot = data.getHot();
                    List<InformationCommentBean> all = data.getAll();
                    List<InformationCommentBean> arrayList = new ArrayList<>();
                    if (hot != null && hot.size() > 0) {
                        InformationCommentBean informationCommentBean = new InformationCommentBean();
                        informationCommentBean.setIs_hot(1);
                        informationCommentBean.setTitle(true);
                        arrayList.add(informationCommentBean);
                        arrayList.addAll(hot);
                    }
                    if (all != null && all.size() > 0) {
                        if (this.B == 1) {
                            InformationCommentBean informationCommentBean2 = new InformationCommentBean();
                            informationCommentBean2.setIs_hot(2);
                            informationCommentBean2.setTitle(true);
                            arrayList.add(informationCommentBean2);
                        }
                        arrayList.addAll(all);
                    }
                    B0(arrayList);
                    this.F = false;
                    return;
                }
                D0();
                showLodingFailed();
                this.F = false;
                return;
            } catch (Throwable th) {
                D0();
                showLodingFailed();
                this.F = false;
                throw th;
            }
        }
        D0();
        showLodingFailed();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        com.wufan.user.service.protobuf.n0 accountData = AccountUtil_.getInstance_(this.C).getAccountData();
        this.G = accountData;
        if (accountData != null) {
            this.H = accountData.getUid();
        }
    }

    public CommonRequestBean p0() {
        com.wufan.user.service.protobuf.n0 accountData = AccountUtil_.getInstance_(this.C).getAccountData();
        this.G = accountData;
        if (accountData != null) {
            this.H = accountData.getUid();
        }
        return RequestBeanUtil.getInstance(this.C).getGameCommentListRequestBean(this.B, 10, this.H, this.f31466y, new int[]{1, 2});
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void q0() {
        this.B = 1;
        o0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void r0(InformationCommentBean informationCommentBean) {
        C0(informationCommentBean);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void relodingimag() {
        this.B = 1;
        showLoding();
        o0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void s0(AccountBean accountBean, String str) {
        if (com.join.android.app.common.utils.j.j(this.C)) {
            A0();
            try {
                try {
                } catch (Exception e5) {
                    e5.printStackTrace();
                    showMessage("评论失败");
                }
                if (IntentUtil.getInstance().goLoginInteractive(this)) {
                    return;
                }
                t0(accountBean, str);
                showMessage("评论失败");
                return;
            } finally {
                n0();
            }
        }
        showMessage("没有网络，请先检查网络。");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void setNetwork() {
        UtilsMy.w3(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showLoding() {
        this.f31448g.setVisibility(0);
        this.f31449h.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showLodingFailed() {
        List<InformationCommentBean> list = this.E;
        if (list != null && list.size() != 0) {
            Toast.makeText(this, getString(R.string.net_connect_failed), 0).show();
            return;
        }
        this.f31450i.setVisibility(8);
        this.f31449h.setVisibility(0);
        this.f31448g.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showMessage(String str) {
        com.join.mgps.Util.l2.a(this.C).b(str);
    }

    public CommonRequestBean t0(AccountBean accountBean, String str) {
        Random random = new Random(2000L);
        return RequestBeanUtil.getInstance(this.C).postGameCommentRequestBean(this.f31466y, this.H, accountBean.getAvatarSrc(), accountBean.getAccount(), com.join.android.app.common.utils.n.n(this.C).q(), UtilsMy.P1(), random.nextInt(), str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void toastData(RewardBean rewardBean) {
        if (rewardBean != null) {
            rewardBean.getOn_off();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void u0(com.wufan.user.service.protobuf.n0 n0Var, String str) {
        if (com.join.android.app.common.utils.j.j(this.C)) {
            A0();
            try {
                try {
                } catch (Exception e5) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("异常");
                    sb.append(e5.getMessage());
                    sb.append(e5.toString());
                    e5.printStackTrace();
                    showMessage("评论失败");
                }
                if (IntentUtil.getInstance().goLoginInteractive(this)) {
                    return;
                }
                ResultMainBean<CommitContextDataBean> n4 = this.f31464w.n(v0(n0Var, str));
                if (n4 != null) {
                    if (n4.getCode() == 706) {
                        showMessage(getString(R.string.tour_perfect_info_for_comment_toast));
                        IntentUtil.getInstance().goLoginInteractive(this);
                        return;
                    }
                    if (n4.getCode() == 806) {
                        showMessage(n4.getError_info());
                    }
                    if (n4.getFlag() == 1) {
                        showMessage("评论成功");
                        z0();
                        toastData(n4.getMessages().getData().getIs_reward());
                    } else {
                        showMessage("评论失败");
                    }
                } else {
                    showMessage("评论失败");
                }
                return;
            } finally {
                n0();
            }
        }
        showMessage("没有网络，请先检查网络。");
    }

    public CommonRequestBean v0(com.wufan.user.service.protobuf.n0 n0Var, String str) {
        Random random = new Random(2000L);
        return RequestBeanUtil.getInstance(this.C).postGameCommentRelpyRequestBean(this.H, this.f31466y, n0Var.d0(), n0Var.getAccount(), com.join.android.app.common.utils.n.n(this.C).q(), UtilsMy.P1(), random.nextInt(), str, this.I, this.J, this.K);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void w0(InformationCommentBean informationCommentBean) {
        if (com.join.android.app.common.utils.j.j(this)) {
            try {
                if (IntentUtil.getInstance().goLoginInteractive(this)) {
                    return;
                }
                ResultMainBean<List<PariseBackData>> b5 = this.f31464w.b(x0(informationCommentBean.getComment_id()));
                if (b5 != null && b5.getFlag() == 1) {
                    List<PariseBackData> data = b5.getMessages().getData();
                    if (data.size() > 0) {
                        int i4 = 0;
                        if (data.get(0).isVal()) {
                            informationCommentBean.setHasPraised(true);
                            try {
                                i4 = Integer.parseInt(informationCommentBean.getPraise_count()) + 1;
                            } catch (Exception e5) {
                                e5.printStackTrace();
                            }
                            informationCommentBean.setPraise_count(i4 + "");
                            C0(informationCommentBean);
                            return;
                        }
                        showMessage("你已赞过");
                        return;
                    }
                    showMessage("你已赞过");
                    return;
                }
                r0(informationCommentBean);
                showMessage("点赞失败");
                return;
            } catch (Exception e6) {
                e6.printStackTrace();
                r0(informationCommentBean);
                showMessage("点赞失败");
                return;
            }
        }
        showMessage("没有网络");
    }

    public CommonRequestBean x0(String str) {
        com.wufan.user.service.protobuf.n0 accountData = AccountUtil_.getInstance_(this.C).getAccountData();
        this.G = accountData;
        if (accountData != null) {
            this.H = accountData.getUid();
        }
        return RequestBeanUtil.getInstance(this.C).postPraisedRequestBean(str, this.H, this.f31466y);
    }

    void y0() {
        this.N.clear();
        l0(this.E);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void z0() {
        this.f31451j.setHint("添加评论");
        this.I = "0";
        this.K = 0;
        this.J = "";
        this.B = 1;
        this.f31447f.l();
        o0();
    }
}
