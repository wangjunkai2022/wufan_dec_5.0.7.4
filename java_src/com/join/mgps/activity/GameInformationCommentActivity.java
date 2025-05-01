package com.join.mgps.activity;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
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
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.activity.login.LoginSplashActivity_;
import com.join.mgps.adapter.InformationAdapterV2;
import com.join.mgps.customview.KeyboardListenLayout;
import com.join.mgps.customview.XListView2;
import com.join.mgps.dto.AddGameInformationCommentArgs;
import com.join.mgps.dto.GameInformationCommentPraiseArgs;
import com.join.mgps.dto.GameInformationCommentRequestV2;
import com.join.mgps.dto.InformationCommentBackV2;
import com.join.mgps.dto.InformationCommentBeanV2;
import com.join.mgps.dto.RequestModel;
import com.join.mgps.dto.ResponseModel;
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
public class GameInformationCommentActivity extends BaseActivity {
    private Context A;
    private InformationAdapterV2 B;
    private List<InformationCommentBeanV2> C;
    private com.wufan.user.service.protobuf.n0 E;
    private int G;
    private ViewTreeObserver H;
    private List<InformationAdapterV2.n> J;
    @ViewById

    /* renamed from: b  reason: collision with root package name */
    RelativeLayout f32312b;
    @ViewById

    /* renamed from: c  reason: collision with root package name */
    ImageView f32313c;
    @ViewById

    /* renamed from: d  reason: collision with root package name */
    TextView f32314d;
    @ViewById

    /* renamed from: e  reason: collision with root package name */
    TextView f32315e;
    @ViewById

    /* renamed from: f  reason: collision with root package name */
    XListView2 f32316f;
    @ViewById

    /* renamed from: g  reason: collision with root package name */
    LinearLayout f32317g;
    @ViewById

    /* renamed from: h  reason: collision with root package name */
    LinearLayout f32318h;
    @ViewById

    /* renamed from: i  reason: collision with root package name */
    FrameLayout f32319i;
    @ViewById

    /* renamed from: j  reason: collision with root package name */
    ClearEditText f32320j;
    @ViewById

    /* renamed from: k  reason: collision with root package name */
    Button f32321k;
    @ViewById

    /* renamed from: l  reason: collision with root package name */
    Button f32322l;
    @ViewById

    /* renamed from: m  reason: collision with root package name */
    TextView f32323m;
    @ViewById

    /* renamed from: n  reason: collision with root package name */
    ImageView f32324n;
    @ViewById

    /* renamed from: o  reason: collision with root package name */
    TextView f32325o;
    @ViewById

    /* renamed from: p  reason: collision with root package name */
    Button f32326p;
    @ViewById

    /* renamed from: q  reason: collision with root package name */
    LinearLayout f32327q;
    @ViewById

    /* renamed from: r  reason: collision with root package name */
    View f32328r;
    @ViewById

    /* renamed from: s  reason: collision with root package name */
    LinearLayout f32329s;
    @ViewById

    /* renamed from: t  reason: collision with root package name */
    HListView f32330t;
    @ViewById

    /* renamed from: u  reason: collision with root package name */
    TextView f32331u;
    @ViewById

    /* renamed from: v  reason: collision with root package name */
    KeyboardListenLayout f32332v;

    /* renamed from: w  reason: collision with root package name */
    com.join.mgps.rpc.e f32333w;
    @Extra

    /* renamed from: x  reason: collision with root package name */
    String f32334x;
    @Extra

    /* renamed from: y  reason: collision with root package name */
    InformationCommentBeanV2 f32335y;

    /* renamed from: z  reason: collision with root package name */
    private int f32336z = 1;
    private boolean D = false;
    Handler F = new a();
    private boolean I = true;
    private com.join.mgps.dialog.d1 K = null;
    com.join.mgps.customview.o L = null;

    /* loaded from: classes4.dex */
    class a extends Handler {
        a() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i4 = message.what;
            if (i4 == 1) {
                if (IntentUtil.getInstance().goLoginInteractive(GameInformationCommentActivity.this.A)) {
                    return;
                }
                GameInformationCommentActivity.this.r0((InformationCommentBeanV2) message.obj);
            } else if (i4 != 2) {
                if (i4 != 3) {
                    return;
                }
                GameInformationCommentActivity.this.f32320j.setFocusable(true);
                GameInformationCommentActivity.this.f32320j.setFocusableInTouchMode(true);
                GameInformationCommentActivity.this.f32320j.requestFocus();
                ((InputMethodManager) GameInformationCommentActivity.this.f32320j.getContext().getSystemService("input_method")).showSoftInput(GameInformationCommentActivity.this.f32320j, 0);
            } else {
                GameInformationCommentActivity gameInformationCommentActivity = GameInformationCommentActivity.this;
                gameInformationCommentActivity.f32335y = (InformationCommentBeanV2) message.obj;
                gameInformationCommentActivity.f32320j.setFocusable(true);
                GameInformationCommentActivity.this.f32320j.setFocusableInTouchMode(true);
                GameInformationCommentActivity.this.f32320j.requestFocus();
                ((InputMethodManager) GameInformationCommentActivity.this.f32320j.getContext().getSystemService("input_method")).showSoftInput(GameInformationCommentActivity.this.f32320j, 0);
                ClearEditText clearEditText = GameInformationCommentActivity.this.f32320j;
                clearEditText.setHint("@" + GameInformationCommentActivity.this.f32335y.getNickname() + ":");
            }
        }
    }

    /* loaded from: classes4.dex */
    class b implements InformationAdapterV2.l {
        b() {
        }

        @Override // com.join.mgps.adapter.InformationAdapterV2.l
        public void a(InformationCommentBeanV2 informationCommentBeanV2) {
            Message obtainMessage = GameInformationCommentActivity.this.F.obtainMessage();
            obtainMessage.what = 1;
            obtainMessage.obj = informationCommentBeanV2;
            obtainMessage.sendToTarget();
        }

        @Override // com.join.mgps.adapter.InformationAdapterV2.l
        public void b(InformationCommentBeanV2 informationCommentBeanV2) {
            ClearEditText clearEditText = GameInformationCommentActivity.this.f32320j;
            clearEditText.setHint("@" + informationCommentBeanV2.getNickname() + "：");
            GameInformationCommentActivity.this.f32320j.setFocusable(true);
            GameInformationCommentActivity.this.f32320j.setFocusableInTouchMode(true);
            GameInformationCommentActivity.this.f32320j.requestFocus();
            ((InputMethodManager) GameInformationCommentActivity.this.f32320j.getContext().getSystemService("input_method")).showSoftInput(GameInformationCommentActivity.this.f32320j, 0);
            GameInformationCommentActivity.this.f32335y = informationCommentBeanV2;
        }

        @Override // com.join.mgps.adapter.InformationAdapterV2.l
        public void c(InformationCommentBeanV2 informationCommentBeanV2) {
            ClearEditText clearEditText = GameInformationCommentActivity.this.f32320j;
            clearEditText.setHint("@" + informationCommentBeanV2.getNickname() + "：");
            GameInformationCommentActivity.this.f32320j.setFocusable(true);
            GameInformationCommentActivity.this.f32320j.setFocusableInTouchMode(true);
            GameInformationCommentActivity.this.f32320j.requestFocus();
            ((InputMethodManager) GameInformationCommentActivity.this.f32320j.getContext().getSystemService("input_method")).showSoftInput(GameInformationCommentActivity.this.f32320j, 0);
            GameInformationCommentActivity gameInformationCommentActivity = GameInformationCommentActivity.this;
            if (gameInformationCommentActivity.f32335y == null) {
                gameInformationCommentActivity.f32335y = new InformationCommentBeanV2();
            }
            GameInformationCommentActivity.this.f32335y.setCommentId(informationCommentBeanV2.getCommentId());
            GameInformationCommentActivity.this.f32335y.setUid(informationCommentBeanV2.getUid());
            GameInformationCommentActivity.this.f32335y.setNickname(informationCommentBeanV2.getNickname());
        }
    }

    /* loaded from: classes4.dex */
    class c implements com.join.mgps.customview.f {
        c() {
        }

        @Override // com.join.mgps.customview.f
        public void onLoadMore() {
            if (GameInformationCommentActivity.this.D) {
                return;
            }
            GameInformationCommentActivity.this.m0();
        }
    }

    /* loaded from: classes4.dex */
    class d implements com.join.mgps.customview.g {
        d() {
        }

        @Override // com.join.mgps.customview.g
        public void onRefresh() {
            if (GameInformationCommentActivity.this.D) {
                return;
            }
            GameInformationCommentActivity.this.f32336z = 1;
            GameInformationCommentActivity.this.m0();
        }
    }

    private com.wufan.user.service.protobuf.n0 accountBean(Context context) {
        return AccountUtil_.getInstance_(context).getAccountData();
    }

    private boolean isLogined(Context context) {
        com.wufan.user.service.protobuf.n0 accountBean = accountBean(context);
        return accountBean != null && com.join.mgps.Util.g2.i(accountBean.getToken());
    }

    private void k0() {
        com.join.mgps.customview.o oVar = this.L;
        if (oVar == null || !oVar.isShowing()) {
            return;
        }
        this.L.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterview() {
        this.f32333w = com.join.mgps.rpc.impl.d.P1();
        this.E = AccountUtil_.getInstance_(this.A).getAccountData();
        this.A = this;
        showLoding();
        this.K = com.join.mgps.Util.b0.f0(this.A).x(this.A);
        m0();
        this.f32314d.setText("评论");
        this.f32320j.setHint("评论一下吧");
        this.f32314d.setVisibility(0);
        this.f32321k.setVisibility(8);
        this.f32326p.setVisibility(8);
        this.f32323m.setVisibility(8);
        this.C = new ArrayList();
        this.J = new ArrayList();
        b bVar = new b();
        if (this.f32335y != null) {
            ClearEditText clearEditText = this.f32320j;
            clearEditText.setHint("@" + this.f32335y.getNickname() + "：");
            this.f32320j.setFocusable(true);
            this.f32320j.setFocusableInTouchMode(true);
            this.f32320j.requestFocus();
            ((InputMethodManager) this.f32320j.getContext().getSystemService("input_method")).showSoftInput(this.f32320j, 0);
        }
        InformationAdapterV2 informationAdapterV2 = new InformationAdapterV2(this.A, this.F, this.J);
        this.B = informationAdapterV2;
        informationAdapterV2.m(bVar);
        this.f32316f.setAdapter((ListAdapter) this.B);
        this.f32316f.setPreLoadCount(5);
        this.f32316f.setVerticalScrollBarEnabled(false);
        this.f32316f.setPullLoadEnable(new c());
        this.f32316f.setPullRefreshEnable(new d());
        this.G = new Random(2000L).nextInt();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void back_image() {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void j0() {
        com.wufan.user.service.protobuf.n0 accountData = AccountUtil_.getInstance_(this.A).getAccountData();
        if (accountData == null) {
            ((LoginSplashActivity_.IntentBuilder_) LoginSplashActivity_.intent(this.A).flags(268435456)).start();
            return;
        }
        String obj = this.f32320j.getText().toString();
        if (obj.length() == 0) {
            com.join.mgps.Util.l2.a(this.A).b("不能发表空字符串");
        } else if (obj.length() < 4) {
            com.join.mgps.Util.l2.a(this.A).b("发表评论不能小于4个");
        } else {
            ((InputMethodManager) getSystemService("input_method")).hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), 2);
            if (IntentUtil.getInstance().goLoginInteractive(this)) {
                return;
            }
            this.f32320j.setText("");
            q0(accountData, obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void l0() {
        this.K.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void m0() {
        if (com.join.android.app.common.utils.j.j(this.A) && !this.D) {
            this.D = true;
            ArrayList arrayList = new ArrayList();
            try {
                try {
                    RequestModel requestModel = new RequestModel();
                    requestModel.setDefault(this.A);
                    GameInformationCommentRequestV2 gameInformationCommentRequestV2 = new GameInformationCommentRequestV2();
                    gameInformationCommentRequestV2.setInformation_id(this.f32334x);
                    InformationCommentBeanV2 informationCommentBeanV2 = this.f32335y;
                    if (informationCommentBeanV2 != null) {
                        gameInformationCommentRequestV2.setComment_id(informationCommentBeanV2.getId());
                    }
                    gameInformationCommentRequestV2.setUid(AccountUtil_.getInstance_(this.A).getUid());
                    gameInformationCommentRequestV2.setToken(AccountUtil_.getInstance_(this.A).getToken());
                    gameInformationCommentRequestV2.setPage(this.f32336z);
                    requestModel.setArgs(gameInformationCommentRequestV2);
                    ResponseModel<InformationCommentBackV2> body = com.join.mgps.rpc.impl.i.D0().B0().h0(requestModel.makeSign()).execute().body();
                    if (body != null && body.getCode() == 200 && body.getData() != null) {
                        InformationCommentBackV2 data = body.getData();
                        if (data != null && data.getComments() != null && data.getComments().size() > 0) {
                            arrayList.addAll(data.getComments());
                        }
                        if (arrayList.size() > 0) {
                            this.f32336z++;
                            u0(arrayList);
                            x0();
                        } else {
                            if (this.f32336z == 1) {
                                u0(arrayList);
                            }
                            x0();
                            o0();
                        }
                    }
                } catch (Exception e5) {
                    e5.printStackTrace();
                    x0();
                    showLodingFailed();
                }
                return;
            } finally {
                this.D = false;
            }
        }
        x0();
        showLodingFailed();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void n0() {
        this.f32336z = 1;
        m0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void o0() {
        this.f32316f.setNoMore();
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
        this.E = AccountUtil_.getInstance_(this.A).getAccountData();
    }

    void p0() {
        this.J.clear();
        if (this.C == null) {
            return;
        }
        for (int i4 = 0; i4 < this.C.size(); i4++) {
            InformationCommentBeanV2 informationCommentBeanV2 = this.C.get(i4);
            this.J.add(new InformationAdapterV2.n(InformationAdapterV2.ViewType.COMMENT, new InformationAdapterV2.n.a(informationCommentBeanV2)));
            List<InformationCommentBeanV2> replyList = informationCommentBeanV2.getReplyList();
            if (replyList != null && replyList.size() > 0) {
                this.J.add(new InformationAdapterV2.n(InformationAdapterV2.ViewType.REPLY, new InformationAdapterV2.n.b(informationCommentBeanV2.getCommentId(), informationCommentBeanV2, 0, true)));
            }
        }
        this.B.notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void q0(com.wufan.user.service.protobuf.n0 n0Var, String str) {
        ResponseModel body;
        if (com.join.android.app.common.utils.j.j(this.A)) {
            if (IntentUtil.getInstance().goLoginInteractive(this)) {
                return;
            }
            t0();
            RequestModel requestModel = new RequestModel();
            requestModel.setDefault(this.A);
            AddGameInformationCommentArgs addGameInformationCommentArgs = new AddGameInformationCommentArgs();
            addGameInformationCommentArgs.setMsg(str);
            addGameInformationCommentArgs.setInformation_id(this.f32334x);
            addGameInformationCommentArgs.setUserToken(n0Var.getToken());
            addGameInformationCommentArgs.setUid(n0Var.getUid() + "");
            InformationCommentBeanV2 informationCommentBeanV2 = this.f32335y;
            if (informationCommentBeanV2 != null) {
                addGameInformationCommentArgs.setRuid(informationCommentBeanV2.getUid());
                addGameInformationCommentArgs.setComment_id(this.f32335y.getId());
            }
            requestModel.setArgs(addGameInformationCommentArgs);
            try {
                try {
                    body = com.join.mgps.rpc.impl.i.D0().B0().k(requestModel.makeSign()).execute().body();
                } catch (Exception e5) {
                    e5.printStackTrace();
                    showMessage("评论失败");
                }
                if (body != null && body.getCode() == 706) {
                    showMessage(getString(R.string.tour_perfect_info_for_comment_toast));
                    IntentUtil.getInstance().goLoginInteractive(this);
                    return;
                }
                if (body != null && body.getCode() == 806) {
                    showMessage(body.getMessage());
                }
                if (body != null && body.getCode() == 200) {
                    showMessage("评论成功");
                    w0();
                } else {
                    showMessage("评论失败");
                }
                return;
            } finally {
                l0();
            }
        }
        showMessage("没有网络，请先检查网络。");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void r0(InformationCommentBeanV2 informationCommentBeanV2) {
        if (com.join.android.app.common.utils.j.j(this)) {
            try {
                if (IntentUtil.getInstance().goLoginInteractive(this)) {
                    return;
                }
                RequestModel requestModel = new RequestModel();
                requestModel.setDefault(this);
                GameInformationCommentPraiseArgs gameInformationCommentPraiseArgs = new GameInformationCommentPraiseArgs();
                gameInformationCommentPraiseArgs.setCommentId(informationCommentBeanV2.getId());
                gameInformationCommentPraiseArgs.setUid(this.E.getUid() + "");
                gameInformationCommentPraiseArgs.setUserToken(this.E.getToken());
                requestModel.setArgs(gameInformationCommentPraiseArgs);
                ResponseModel body = com.join.mgps.rpc.impl.i.D0().B0().P(requestModel.makeSign()).execute().body();
                if (body != null && body.getCode() == 706) {
                    showMessage("完善资料后就可点赞哦");
                    IntentUtil.getInstance().goLoginInteractive(this);
                    return;
                } else if (body != null && body.getCode() == 200) {
                    informationCommentBeanV2.setPraise(Boolean.TRUE);
                    int i4 = 0;
                    try {
                        i4 = informationCommentBeanV2.getLike();
                    } catch (Exception e5) {
                        e5.printStackTrace();
                    }
                    informationCommentBeanV2.setLike(i4 + 1);
                    v0(informationCommentBeanV2);
                    return;
                } else if (body != null && body.getMessage() != null) {
                    showToast(body.getMessage());
                    return;
                } else {
                    showToast("点赞失败");
                    return;
                }
            } catch (Exception e6) {
                e6.printStackTrace();
                showToast("点赞失败");
                return;
            }
        }
        showToast("没有网络");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void relodingimag() {
        this.f32336z = 1;
        showLoding();
        m0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void s0() {
        this.f32320j.setHint("添加评论");
        this.f32335y = null;
        this.f32316f.l();
        this.f32336z = 1;
        m0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void setNetwork() {
        UtilsMy.w3(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showLoding() {
        this.f32317g.setVisibility(0);
        this.f32318h.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showLodingFailed() {
        List<InformationCommentBeanV2> list = this.C;
        if (list != null && list.size() != 0) {
            Toast.makeText(this, getString(R.string.net_connect_failed), 0).show();
            return;
        }
        this.f32318h.setVisibility(0);
        this.f32317g.setVisibility(8);
        this.f32319i.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showMessage(String str) {
        com.join.mgps.Util.l2.a(this.A).b(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showToast(String str) {
        com.join.mgps.Util.l2.a(this.A).b(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void t0() {
        this.K.b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void toastData(RewardBean rewardBean) {
        if (rewardBean != null) {
            rewardBean.getOn_off();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void u0(List<InformationCommentBeanV2> list) {
        if (list != null && list.size() != 0) {
            this.f32315e.setVisibility(8);
            this.f32318h.setVisibility(8);
            this.f32317g.setVisibility(8);
            this.f32319i.setVisibility(0);
            if (this.f32336z == 2) {
                this.C.clear();
            }
            this.C.addAll(list);
            p0();
            if (this.f32335y == null || !this.I) {
                return;
            }
            this.I = false;
            Message message = new Message();
            message.what = 3;
            this.F.sendMessageDelayed(message, 300L);
            if (this.f32335y != null) {
                ClearEditText clearEditText = this.f32320j;
                clearEditText.setHint("@" + this.f32335y.getNickname() + ":");
            }
        } else if (this.f32336z == 1) {
            this.f32318h.setVisibility(8);
            this.f32317g.setVisibility(8);
            this.f32319i.setVisibility(0);
            this.f32315e.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void v0(InformationCommentBeanV2 informationCommentBeanV2) {
        Iterator<InformationCommentBeanV2> it2 = this.C.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            InformationCommentBeanV2 next = it2.next();
            if (TextUtils.equals(informationCommentBeanV2.getId(), next.getId())) {
                next.setPraise(informationCommentBeanV2.getPraise());
                break;
            }
        }
        p0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void w0() {
        this.f32335y = null;
        this.f32320j.setHint("添加评论");
        this.f32336z = 1;
        m0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void x0() {
        this.f32316f.u();
        this.f32316f.v();
    }

    boolean y0() {
        if (accountBean(this.A) == null) {
            return false;
        }
        return !AccountUtil_.getInstance_(this).isTourist();
    }
}
