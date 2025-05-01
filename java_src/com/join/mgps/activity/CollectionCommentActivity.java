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
import com.join.mgps.adapter.InformationAdapter;
import com.join.mgps.customview.KeyboardListenLayout;
import com.join.mgps.customview.XListView2;
import com.join.mgps.dto.CollectionCommentRequest;
import com.join.mgps.dto.InformationCommentBack;
import com.join.mgps.dto.InformationCommentBean;
import com.join.mgps.dto.InformationSendBack;
import com.join.mgps.dto.InformationSendRequestBean;
import com.join.mgps.dto.PariseBackData;
import com.join.mgps.dto.PariseRequest;
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
public class CollectionCommentActivity extends BaseActivity {
    private Context A;
    private InformationAdapter B;
    private List<InformationCommentBean> C;
    private com.wufan.user.service.protobuf.n0 E;
    private int G;
    private ViewTreeObserver H;
    private List<InformationAdapter.n> J;
    com.join.mgps.dialog.d1 K;
    @ViewById

    /* renamed from: b  reason: collision with root package name */
    RelativeLayout f28991b;
    @ViewById

    /* renamed from: c  reason: collision with root package name */
    ImageView f28992c;
    @ViewById

    /* renamed from: d  reason: collision with root package name */
    TextView f28993d;
    @ViewById

    /* renamed from: e  reason: collision with root package name */
    TextView f28994e;
    @ViewById

    /* renamed from: f  reason: collision with root package name */
    XListView2 f28995f;
    @ViewById

    /* renamed from: g  reason: collision with root package name */
    LinearLayout f28996g;
    @ViewById

    /* renamed from: h  reason: collision with root package name */
    LinearLayout f28997h;
    @ViewById

    /* renamed from: i  reason: collision with root package name */
    FrameLayout f28998i;
    @ViewById

    /* renamed from: j  reason: collision with root package name */
    ClearEditText f28999j;
    @ViewById

    /* renamed from: k  reason: collision with root package name */
    Button f29000k;
    @ViewById

    /* renamed from: l  reason: collision with root package name */
    Button f29001l;
    @ViewById

    /* renamed from: m  reason: collision with root package name */
    TextView f29002m;
    @ViewById

    /* renamed from: n  reason: collision with root package name */
    ImageView f29003n;
    @ViewById

    /* renamed from: o  reason: collision with root package name */
    TextView f29004o;
    @ViewById

    /* renamed from: p  reason: collision with root package name */
    Button f29005p;
    @ViewById

    /* renamed from: q  reason: collision with root package name */
    LinearLayout f29006q;
    @ViewById

    /* renamed from: r  reason: collision with root package name */
    View f29007r;
    @ViewById

    /* renamed from: s  reason: collision with root package name */
    LinearLayout f29008s;
    @ViewById

    /* renamed from: t  reason: collision with root package name */
    HListView f29009t;
    @ViewById

    /* renamed from: u  reason: collision with root package name */
    TextView f29010u;
    @ViewById

    /* renamed from: v  reason: collision with root package name */
    KeyboardListenLayout f29011v;

    /* renamed from: w  reason: collision with root package name */
    com.join.mgps.rpc.e f29012w;
    @Extra

    /* renamed from: x  reason: collision with root package name */
    String f29013x;
    @Extra

    /* renamed from: y  reason: collision with root package name */
    InformationCommentBean f29014y;

    /* renamed from: z  reason: collision with root package name */
    private int f29015z = 1;
    private boolean D = false;
    Handler F = new a();
    private boolean I = true;
    com.join.mgps.customview.o L = null;

    /* loaded from: classes4.dex */
    class a extends Handler {
        a() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i4 = message.what;
            if (i4 == 1) {
                if (CollectionCommentActivity.this.E == null) {
                    IntentUtil.getInstance().goLoginInteractive(CollectionCommentActivity.this.A);
                    return;
                }
                CollectionCommentActivity.this.s0((InformationCommentBean) message.obj);
            } else if (i4 != 2) {
                if (i4 != 3) {
                    return;
                }
                CollectionCommentActivity.this.f28999j.setFocusable(true);
                CollectionCommentActivity.this.f28999j.setFocusableInTouchMode(true);
                CollectionCommentActivity.this.f28999j.requestFocus();
                ((InputMethodManager) CollectionCommentActivity.this.f28999j.getContext().getSystemService("input_method")).showSoftInput(CollectionCommentActivity.this.f28999j, 0);
            } else {
                InformationCommentBean informationCommentBean = (InformationCommentBean) message.obj;
                if (informationCommentBean.isTitle()) {
                    return;
                }
                CollectionCommentActivity collectionCommentActivity = CollectionCommentActivity.this;
                collectionCommentActivity.f29014y = informationCommentBean;
                collectionCommentActivity.f28999j.setFocusable(true);
                CollectionCommentActivity.this.f28999j.setFocusableInTouchMode(true);
                CollectionCommentActivity.this.f28999j.requestFocus();
                ((InputMethodManager) CollectionCommentActivity.this.f28999j.getContext().getSystemService("input_method")).showSoftInput(CollectionCommentActivity.this.f28999j, 0);
                ClearEditText clearEditText = CollectionCommentActivity.this.f28999j;
                clearEditText.setHint("@" + CollectionCommentActivity.this.f29014y.getUser_name() + ":");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class b implements InformationAdapter.l {
        b() {
        }

        @Override // com.join.mgps.adapter.InformationAdapter.l
        public void a(InformationCommentBean informationCommentBean) {
            Message obtainMessage = CollectionCommentActivity.this.F.obtainMessage();
            obtainMessage.what = 1;
            obtainMessage.obj = informationCommentBean;
            obtainMessage.sendToTarget();
        }

        @Override // com.join.mgps.adapter.InformationAdapter.l
        public void e(InformationCommentBean.Sub sub) {
            ClearEditText clearEditText = CollectionCommentActivity.this.f28999j;
            clearEditText.setHint("@" + sub.getUser_name() + "：");
            CollectionCommentActivity.this.f28999j.setFocusable(true);
            CollectionCommentActivity.this.f28999j.setFocusableInTouchMode(true);
            CollectionCommentActivity.this.f28999j.requestFocus();
            ((InputMethodManager) CollectionCommentActivity.this.f28999j.getContext().getSystemService("input_method")).showSoftInput(CollectionCommentActivity.this.f28999j, 0);
            CollectionCommentActivity collectionCommentActivity = CollectionCommentActivity.this;
            if (collectionCommentActivity.f29014y == null) {
                collectionCommentActivity.f29014y = new InformationCommentBean();
            }
            CollectionCommentActivity.this.f29014y.setComment_id(sub.getComment_id());
            CollectionCommentActivity.this.f29014y.setUser_id(sub.getUser_id());
            CollectionCommentActivity.this.f29014y.setUser_name(sub.getUser_name());
        }

        @Override // com.join.mgps.adapter.InformationAdapter.l
        public void f(InformationCommentBean informationCommentBean) {
            ClearEditText clearEditText = CollectionCommentActivity.this.f28999j;
            clearEditText.setHint("@" + informationCommentBean.getUser_name() + "：");
            CollectionCommentActivity.this.f28999j.setFocusable(true);
            CollectionCommentActivity.this.f28999j.setFocusableInTouchMode(true);
            CollectionCommentActivity.this.f28999j.requestFocus();
            ((InputMethodManager) CollectionCommentActivity.this.f28999j.getContext().getSystemService("input_method")).showSoftInput(CollectionCommentActivity.this.f28999j, 0);
            CollectionCommentActivity.this.f29014y = informationCommentBean;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class c implements com.join.mgps.customview.f {
        c() {
        }

        @Override // com.join.mgps.customview.f
        public void onLoadMore() {
            if (CollectionCommentActivity.this.D) {
                return;
            }
            CollectionCommentActivity.this.n0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class d implements com.join.mgps.customview.g {
        d() {
        }

        @Override // com.join.mgps.customview.g
        public void onRefresh() {
            if (CollectionCommentActivity.this.D) {
                return;
            }
            CollectionCommentActivity.this.f29015z = 1;
            CollectionCommentActivity.this.n0();
        }
    }

    private com.wufan.user.service.protobuf.n0 accountBean(Context context) {
        return AccountUtil_.getInstance_(context).getAccountData();
    }

    private boolean isLogined(Context context) {
        com.wufan.user.service.protobuf.n0 accountBean = accountBean(context);
        return accountBean != null && com.join.mgps.Util.g2.i(accountBean.getToken());
    }

    private void l0() {
        com.join.mgps.customview.o oVar = this.L;
        if (oVar == null || !oVar.isShowing()) {
            return;
        }
        this.L.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterview() {
        this.f29012w = com.join.mgps.rpc.impl.d.P1();
        this.A = this;
        this.E = AccountUtil_.getInstance_(this).getAccountData();
        this.K = com.join.mgps.Util.b0.f0(this.A).x(this.A);
        showLoding();
        n0();
        this.f28993d.setText("评论");
        this.f28999j.setHint("评论一下吧");
        this.f28993d.setVisibility(0);
        this.f29000k.setVisibility(8);
        this.f29005p.setVisibility(8);
        this.f29002m.setVisibility(8);
        this.C = new ArrayList();
        this.J = new ArrayList();
        b bVar = new b();
        InformationAdapter informationAdapter = new InformationAdapter(this.A, this.F, this.J);
        this.B = informationAdapter;
        informationAdapter.m(bVar);
        this.f28995f.setAdapter((ListAdapter) this.B);
        this.f28995f.setPreLoadCount(5);
        this.f28995f.setVerticalScrollBarEnabled(false);
        this.f28995f.setPullLoadEnable(new c());
        this.f28995f.setPullRefreshEnable(new d());
        this.G = new Random(2000L).nextInt();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void back_image() {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void k0() {
        com.wufan.user.service.protobuf.n0 accountData = AccountUtil_.getInstance_(this.A).getAccountData();
        if (accountData == null) {
            ((LoginSplashActivity_.IntentBuilder_) LoginSplashActivity_.intent(this.A).flags(268435456)).start();
            return;
        }
        String obj = this.f28999j.getText().toString();
        if (obj.length() == 0) {
            com.join.mgps.Util.l2.a(this.A).b("不能发表空字符串");
        } else if (obj.length() < 4) {
            com.join.mgps.Util.l2.a(this.A).b("发表评论不能小于4个");
        } else {
            ((InputMethodManager) getSystemService("input_method")).hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), 2);
            if (IntentUtil.getInstance().goLoginInteractive(this)) {
                return;
            }
            this.f28999j.setText("");
            r0(accountData, obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void m0() {
        this.K.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void n0() {
        if (com.join.android.app.common.utils.j.j(this.A) && !this.D) {
            this.D = true;
            List<InformationCommentBean> arrayList = new ArrayList<>();
            try {
                try {
                    CollectionCommentRequest collectionCommentRequest = new CollectionCommentRequest();
                    collectionCommentRequest.setComment_type(new int[]{1, 2});
                    collectionCommentRequest.setCollection_id(this.f29013x);
                    collectionCommentRequest.setPn(this.f29015z);
                    collectionCommentRequest.setPc(20);
                    com.wufan.user.service.protobuf.n0 n0Var = this.E;
                    if (n0Var != null) {
                        collectionCommentRequest.setUid(n0Var.getUid());
                    }
                    InformationCommentBack data = this.f29012w.f(RequestBeanUtil.getInstance(this).getGameInformationComment(collectionCommentRequest)).getMessages().getData();
                    if (data != null) {
                        List<InformationCommentBean> hot = data.getHot();
                        List<InformationCommentBean> all = data.getAll();
                        if (hot != null && hot.size() > 0) {
                            InformationCommentBean informationCommentBean = new InformationCommentBean();
                            informationCommentBean.setIs_hot(1);
                            informationCommentBean.setTitle(true);
                            arrayList.add(informationCommentBean);
                            arrayList.addAll(hot);
                        }
                        if (all != null && all.size() > 0) {
                            if (this.f29015z == 1) {
                                InformationCommentBean informationCommentBean2 = new InformationCommentBean();
                                informationCommentBean2.setIs_hot(2);
                                informationCommentBean2.setTitle(true);
                                arrayList.add(informationCommentBean2);
                            }
                            arrayList.addAll(all);
                        }
                    }
                    if (arrayList.size() > 0) {
                        if (arrayList.size() == 0) {
                            p0();
                        } else {
                            this.f29015z++;
                        }
                        v0(arrayList);
                        x0();
                    } else {
                        if (this.f29015z == 1) {
                            v0(arrayList);
                        }
                        x0();
                        p0();
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
    public void o0() {
        this.f29015z = 1;
        n0();
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

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void p0() {
        this.f28995f.setNoMore();
    }

    void q0() {
        this.J.clear();
        if (this.C == null) {
            return;
        }
        for (int i4 = 0; i4 < this.C.size(); i4++) {
            InformationCommentBean informationCommentBean = this.C.get(i4);
            if (informationCommentBean.isTitle()) {
                this.J.add(new InformationAdapter.n(InformationAdapter.ViewType.TITLE, new InformationAdapter.n.a(informationCommentBean)));
            } else {
                this.J.add(new InformationAdapter.n(InformationAdapter.ViewType.COMMENT, new InformationAdapter.n.a(informationCommentBean)));
                List<InformationCommentBean.Sub> sub = informationCommentBean.getSub();
                if (sub != null && sub.size() > 0) {
                    this.J.add(new InformationAdapter.n(InformationAdapter.ViewType.REPLY, new InformationAdapter.n.b(informationCommentBean.getComment_id(), informationCommentBean, 0, true)));
                }
            }
        }
        this.B.notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void r0(com.wufan.user.service.protobuf.n0 n0Var, String str) {
        ResultMainBean<InformationSendBack> w12;
        if (com.join.android.app.common.utils.j.j(this.A)) {
            if (IntentUtil.getInstance().goLoginInteractive(this)) {
                return;
            }
            u0();
            InformationSendRequestBean informationSendRequestBean = new InformationSendRequestBean();
            informationSendRequestBean.setCollection_id(this.f29013x);
            informationSendRequestBean.setType(2);
            informationSendRequestBean.setUid(n0Var.getUid());
            informationSendRequestBean.setContent(str);
            informationSendRequestBean.setHead_portrait(n0Var.d0());
            informationSendRequestBean.setUser_name(n0Var.getAccount());
            informationSendRequestBean.setRandom_num(this.G);
            informationSendRequestBean.setIp_address(UtilsMy.P1());
            informationSendRequestBean.setMobile_phone_model(com.join.android.app.common.utils.n.n(this.A).q());
            informationSendRequestBean.setIs_anonymous(0);
            InformationCommentBean informationCommentBean = this.f29014y;
            if (informationCommentBean != null) {
                informationSendRequestBean.setReply_comment_id(informationCommentBean.getComment_id());
                informationSendRequestBean.setReply_comment_user_name(this.f29014y.getUser_name());
                informationSendRequestBean.setReply_comment_user_id(this.f29014y.getUser_id());
            }
            try {
                try {
                    w12 = this.f29012w.w1(RequestBeanUtil.getInstance(this).sendInformationComment(informationSendRequestBean));
                } catch (Exception e5) {
                    e5.printStackTrace();
                    showMessage("评论失败");
                }
                if (w12 != null && w12.getCode() == 706) {
                    showMessage(getString(R.string.tour_perfect_info_for_comment_toast));
                    IntentUtil.getInstance().goLoginInteractive(this);
                    return;
                }
                if (w12.getCode() == 806) {
                    showMessage(w12.getError_info());
                }
                if (w12.getFlag() == 1) {
                    t0();
                    showMessage("评论成功");
                    toastData(w12.getMessages().getData().getIs_reward());
                } else {
                    showMessage("评论失败");
                }
                return;
            } finally {
                m0();
            }
        }
        showMessage("没有网络，请先检查网络。");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void relodingimag() {
        this.f29015z = 1;
        showLoding();
        n0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void s0(InformationCommentBean informationCommentBean) {
        if (com.join.android.app.common.utils.j.j(this)) {
            try {
                if (IntentUtil.getInstance().goLoginInteractive(this)) {
                    return;
                }
                PariseRequest pariseRequest = new PariseRequest();
                pariseRequest.setCollection_id(informationCommentBean.getCollection_id());
                pariseRequest.setComment_id(informationCommentBean.getComment_id());
                pariseRequest.setUid(this.E.getUid());
                ResultMainBean<List<PariseBackData>> u12 = this.f29012w.u1(RequestBeanUtil.getInstance(this).getGameInformationParis(pariseRequest));
                if (u12 != null && u12.getCode() == 706) {
                    showMessage("完善资料后就可点赞哦");
                    IntentUtil.getInstance().goLoginInteractive(this);
                    return;
                } else if (u12 != null && u12.getFlag() == 1) {
                    List<PariseBackData> data = u12.getMessages().getData();
                    if (data.size() > 0) {
                        int i4 = 0;
                        if (data.get(0).isVal()) {
                            informationCommentBean.setHasPraised(true);
                            try {
                                i4 = Integer.parseInt(informationCommentBean.getPraise_count());
                            } catch (Exception e5) {
                                e5.printStackTrace();
                            }
                            informationCommentBean.setPraise_count((i4 + 1) + "");
                            w0(informationCommentBean);
                            return;
                        }
                        showToast("你已赞过");
                        return;
                    }
                    showToast("你已赞过");
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
    public void setNetwork() {
        UtilsMy.w3(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showLoding() {
        this.f28996g.setVisibility(0);
        this.f28997h.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showLodingFailed() {
        List<InformationCommentBean> list = this.C;
        if (list != null && list.size() != 0) {
            Toast.makeText(this, getString(R.string.net_connect_failed), 0).show();
            return;
        }
        this.f28997h.setVisibility(0);
        this.f28996g.setVisibility(8);
        this.f28998i.setVisibility(8);
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
        this.f28999j.setHint("添加评论");
        this.f29014y = null;
        this.f28995f.l();
        this.f29015z = 1;
        n0();
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
    public void u0() {
        this.K.b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void v0(List<InformationCommentBean> list) {
        if (list != null && list.size() != 0) {
            this.f28994e.setVisibility(8);
            this.f28997h.setVisibility(8);
            this.f28996g.setVisibility(8);
            this.f28998i.setVisibility(0);
            if (this.f29015z == 2) {
                this.C.clear();
            }
            this.C.addAll(list);
            q0();
            if (this.f29014y == null || !this.I) {
                return;
            }
            this.I = false;
            Message message = new Message();
            message.what = 3;
            this.F.sendMessageDelayed(message, 300L);
            if (com.join.mgps.Util.g2.h(this.f29014y.getCollection_id())) {
                return;
            }
            ClearEditText clearEditText = this.f28999j;
            clearEditText.setHint("@" + this.f29014y.getUser_name() + ":");
        } else if (this.f29015z == 1) {
            this.f28997h.setVisibility(8);
            this.f28996g.setVisibility(8);
            this.f28998i.setVisibility(0);
            this.f28994e.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void w0(InformationCommentBean informationCommentBean) {
        Iterator<InformationCommentBean> it2 = this.C.iterator();
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
        q0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void x0() {
        this.f28995f.u();
        this.f28995f.v();
    }

    boolean y0() {
        if (accountBean(this.A) == null) {
            return false;
        }
        return !AccountUtil_.getInstance_(this).isTourist();
    }
}
