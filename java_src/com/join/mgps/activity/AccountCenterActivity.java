package com.join.mgps.activity;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.BaseActivity;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.common.utils.JsonMapper;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.IntentDateBean;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.Util.RequestBeanUtil;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.customview.PullableScrollView;
import com.join.mgps.customview.VipView;
import com.join.mgps.dto.AccountBean;
import com.join.mgps.dto.AccountResultMainBean;
import com.join.mgps.dto.AccountTokenSuccess;
import com.join.mgps.dto.EverdayLogin;
import com.join.mgps.dto.ForumBean;
import com.join.mgps.dto.ForumData;
import com.join.mgps.dto.ForumResponse;
import com.join.mgps.dto.GameOLHeadAdBean;
import com.join.mgps.dto.RecomCentrebean;
import com.join.mgps.dto.RecomDatabean;
import com.join.mgps.dto.TouristLoginRequestBean;
import com.join.mgps.pref.PrefDef_;
import com.wufan.user.service.protobuf.b0;
import com.wufan.user.service.protobuf.n0;
import java.util.HashMap;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.Receiver;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
import org.androidannotations.annotations.sharedpreferences.Pref;
@EActivity(R.layout.mg_account_center)
/* loaded from: classes4.dex */
public class AccountCenterActivity extends BaseActivity {
    @ViewById
    RelativeLayout A;
    private GameOLHeadAdBean A1;
    @ViewById
    RelativeLayout B;
    private Context B1;
    @Pref
    PrefDef_ C;
    @ViewById
    RelativeLayout C1;
    com.join.mgps.rpc.e D;
    @ViewById
    SimpleDraweeView D1;
    com.join.mgps.rpc.b E;
    @ViewById
    RelativeLayout E1;
    com.join.mgps.rpc.c F;
    @ViewById
    SimpleDraweeView F1;
    com.join.mgps.rpc.o G;
    @ViewById
    SimpleDraweeView G1;
    com.join.mgps.rpc.i H;
    @ViewById
    SimpleDraweeView H1;
    @ViewById
    PullableScrollView I;
    RecomDatabean I1;
    @ViewById
    RelativeLayout J;
    RecomDatabean J1;
    @ViewById
    ImageView K;
    RecomDatabean K1;
    @ViewById
    TextView L;
    RecomDatabean L1;
    @ViewById
    RelativeLayout M;
    RecomDatabean M1;
    int N;
    RecomDatabean N1;
    @ViewById
    View O;
    RecomDatabean O1;
    @ViewById
    ImageView P;
    RecomDatabean P1;
    @ViewById
    LinearLayout Q;
    @ViewById
    LinearLayout Q1;
    @ViewById
    ImageView R;
    @ViewById
    LinearLayout R1;
    @ViewById
    ImageView S;
    @ViewById
    SimpleDraweeView S1;
    @ViewById
    SimpleDraweeView T;
    @ViewById
    SimpleDraweeView T1;
    @ViewById
    TextView U;
    @ViewById
    TextView U1;
    @ViewById
    VipView V;
    @ViewById
    TextView V1;
    @ViewById
    VipView W;
    @ViewById
    TextView W1;
    @ViewById
    VipView X;
    @ViewById
    TextView X1;
    @ViewById
    TextView Y;
    @ViewById
    TextView Y1;
    @ViewById
    View Z1;
    @ViewById

    /* renamed from: b  reason: collision with root package name */
    SimpleDraweeView f28217b;
    @ViewById

    /* renamed from: c  reason: collision with root package name */
    TextView f28218c;
    @ViewById

    /* renamed from: d  reason: collision with root package name */
    TextView f28219d;
    @ViewById

    /* renamed from: e  reason: collision with root package name */
    TextView f28220e;
    @ViewById

    /* renamed from: f  reason: collision with root package name */
    TextView f28221f;
    @ViewById

    /* renamed from: g  reason: collision with root package name */
    LinearLayout f28222g;
    @ViewById

    /* renamed from: h  reason: collision with root package name */
    TextView f28223h;
    @ViewById

    /* renamed from: i  reason: collision with root package name */
    RelativeLayout f28224i;
    @ViewById

    /* renamed from: j  reason: collision with root package name */
    RelativeLayout f28225j;
    @ViewById

    /* renamed from: k  reason: collision with root package name */
    RelativeLayout f28226k;
    @ViewById

    /* renamed from: l  reason: collision with root package name */
    RelativeLayout f28227l;
    @ViewById

    /* renamed from: m  reason: collision with root package name */
    TextView f28228m;
    @ViewById

    /* renamed from: n  reason: collision with root package name */
    TextView f28229n;
    @ViewById

    /* renamed from: o  reason: collision with root package name */
    TextView f28230o;
    @ViewById

    /* renamed from: p  reason: collision with root package name */
    ImageView f28231p;

    /* renamed from: p0  reason: collision with root package name */
    private com.wufan.user.service.protobuf.n0 f28232p0;

    /* renamed from: p1  reason: collision with root package name */
    private boolean f28233p1;
    @ViewById

    /* renamed from: q  reason: collision with root package name */
    TextView f28234q;
    @ViewById

    /* renamed from: r  reason: collision with root package name */
    TextView f28235r;
    @ViewById

    /* renamed from: s  reason: collision with root package name */
    RelativeLayout f28236s;
    @ViewById

    /* renamed from: t  reason: collision with root package name */
    RelativeLayout f28237t;
    @ViewById

    /* renamed from: u  reason: collision with root package name */
    RelativeLayout f28238u;
    @ViewById

    /* renamed from: v  reason: collision with root package name */
    TextView f28239v;

    /* renamed from: v1  reason: collision with root package name */
    private boolean f28240v1;
    @ViewById

    /* renamed from: w  reason: collision with root package name */
    RelativeLayout f28241w;
    @ViewById

    /* renamed from: x  reason: collision with root package name */
    RelativeLayout f28242x;
    @ViewById

    /* renamed from: y  reason: collision with root package name */
    FrameLayout f28243y;
    @ViewById

    /* renamed from: z  reason: collision with root package name */
    RelativeLayout f28244z;
    private int Z = 195;

    /* renamed from: a2  reason: collision with root package name */
    com.join.mgps.customview.o f28216a2 = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (IntentUtil.getInstance().goLogin(view.getContext())) {
                return;
            }
            com.join.mgps.Util.j0.R0(view.getContext());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (IntentUtil.getInstance().goLogin(view.getContext())) {
                return;
            }
            IntentUtil.getInstance().goMYAccountDetialActivity(view.getContext());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (IntentUtil.getInstance().goLogin(view.getContext())) {
                return;
            }
            com.join.mgps.Util.j0.R0(view.getContext());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class d implements View.OnClickListener {
        d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IntentUtil intentUtil = IntentUtil.getInstance();
            AccountCenterActivity accountCenterActivity = AccountCenterActivity.this;
            intentUtil.intentActivity(accountCenterActivity, accountCenterActivity.N1.getSub().get(0).getIntentDataBean());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class e implements View.OnClickListener {
        e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IntentUtil.getInstance().goLogin(view.getContext());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class f implements View.OnClickListener {
        f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IntentUtil.getInstance().goLogin(view.getContext());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class g implements View.OnClickListener {
        g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IntentUtil.getInstance().goLogin(view.getContext());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class h implements View.OnClickListener {
        h() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IntentUtil.getInstance().goVip(AccountCenterActivity.this.B1);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class i implements View.OnClickListener {
        i() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IntentUtil.getInstance().goVip(AccountCenterActivity.this.B1);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class j implements View.OnClickListener {
        j() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (IntentUtil.getInstance().goLogin(view.getContext())) {
                return;
            }
            IntentUtil intentUtil = IntentUtil.getInstance();
            AccountCenterActivity accountCenterActivity = AccountCenterActivity.this;
            intentUtil.intentActivity(accountCenterActivity, accountCenterActivity.J1.getSub().get(0).getIntentDataBean());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class k implements View.OnClickListener {
        k() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IntentUtil intentUtil = IntentUtil.getInstance();
            AccountCenterActivity accountCenterActivity = AccountCenterActivity.this;
            intentUtil.intentActivity(accountCenterActivity, accountCenterActivity.M1.getSub().get(0).getIntentDataBean());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class l implements View.OnClickListener {
        l() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IntentUtil intentUtil = IntentUtil.getInstance();
            AccountCenterActivity accountCenterActivity = AccountCenterActivity.this;
            intentUtil.intentActivity(accountCenterActivity, accountCenterActivity.N1.getSub().get(0).getIntentDataBean());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class m implements View.OnClickListener {
        m() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IntentUtil intentUtil = IntentUtil.getInstance();
            AccountCenterActivity accountCenterActivity = AccountCenterActivity.this;
            intentUtil.intentActivity(accountCenterActivity, accountCenterActivity.O1.getSub().get(0).getIntentDataBean());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class n implements View.OnClickListener {
        n() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IntentUtil intentUtil = IntentUtil.getInstance();
            AccountCenterActivity accountCenterActivity = AccountCenterActivity.this;
            intentUtil.intentActivity(accountCenterActivity, accountCenterActivity.P1.getSub().get(0).getIntentDataBean());
        }
    }

    /* loaded from: classes4.dex */
    class o implements View.OnClickListener {
        o() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            try {
                if (IntentUtil.getInstance().goLogin(view.getContext())) {
                    return;
                }
                IntentUtil.getInstance().intentActivity(AccountCenterActivity.this.B1, AccountCenterActivity.this.A1.getSub().get(0).getIntentDataBean());
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class p implements View.OnClickListener {
        p() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IntentUtil intentUtil = IntentUtil.getInstance();
            AccountCenterActivity accountCenterActivity = AccountCenterActivity.this;
            intentUtil.intentActivity(accountCenterActivity, accountCenterActivity.N1.getSub().get(0).getIntentDataBean());
        }
    }

    private com.wufan.user.service.protobuf.n0 accountBean(Context context) {
        return AccountUtil_.getInstance_(getApplicationContext()).getAccountData();
    }

    private boolean isLogined(Context context) {
        com.wufan.user.service.protobuf.n0 accountBean = accountBean(context);
        return accountBean != null && com.join.mgps.Util.g2.i(accountBean.getToken());
    }

    private void n0() {
        com.join.mgps.customview.o oVar = this.f28216a2;
        if (oVar == null || !oVar.isShowing()) {
            return;
        }
        this.f28216a2.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void A0() {
        if (IntentUtil.getInstance().goLogin(this)) {
            return;
        }
        IntentUtil.getInstance().goPAPayCenterActivity(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void B0() {
        IntentUtil.getInstance().goMGSettingActivity(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void C0() {
        ForumResponse<ForumData.ForumProfilePostsData> k4;
        ForumData.ForumProfilePostsData data;
        ForumBean.ForumProfilePostUserInfoBean user_info;
        if (com.join.android.app.common.utils.j.j(this)) {
            try {
                com.wufan.user.service.protobuf.n0 accountData = AccountUtil_.getInstance_(getApplicationContext()).getAccountData();
                if (accountData == null || accountData.getUid() == 0 || (k4 = this.H.k(accountData.getUid(), accountData.getToken(), 1, 0, "")) == null || (data = k4.getData()) == null || (user_info = data.getUser_info()) == null) {
                    return;
                }
                l0(user_info.getUnread_message());
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void D0() {
        EverdayLogin everdayLogin;
        RecomDatabean recomDatabean;
        this.f28217b.setOnClickListener(null);
        this.f28243y.setOnClickListener(null);
        this.f28218c.setVisibility(8);
        this.f28219d.setText("未登录");
        this.f28217b.setImageResource(R.drawable.unloginstatus);
        this.P.setVisibility(8);
        com.wufan.user.service.protobuf.n0 accountData = AccountUtil_.getInstance_(getApplicationContext()).getAccountData();
        this.f28232p0 = accountData;
        if (accountData.O2() == 1) {
            this.f28238u.setVisibility(0);
        } else {
            this.f28238u.setVisibility(8);
        }
        com.wufan.user.service.protobuf.n0 n0Var = this.f28232p0;
        if (n0Var != null) {
            if (n0Var.x2() != 0) {
                try {
                    this.f28239v.setText(com.join.mgps.Util.g2.a(this.f28232p0.x2()));
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
            }
            this.f28221f.setVisibility(0);
            if (this.f28232p0.y() < System.currentTimeMillis()) {
                this.V.setVipDataForUserCenter(this.f28232p0.M(), 0);
            }
            this.V.setVisibility(0);
            this.W.setVipDataForUserCenter(0, this.f28232p0.M(), true);
            this.W.setVisibility(0);
            String nickname = this.f28232p0.getNickname();
            String d02 = this.f28232p0.d0();
            this.f28220e.setText(this.f28232p0.getAccount());
            this.f28219d.setText(nickname);
            if (!UtilsMy.B3(this, this.f28219d, this.f28232p0.M(), this.f28232p0.j1())) {
                this.f28219d.setTextColor(-1);
            }
            MyImageLoader.t(this.f28217b, d02);
            int i4 = this.f28232p0.i();
            if (i4 > 0) {
                com.join.mgps.Util.s.h(i4, this.f28218c);
                TextView textView = this.f28218c;
                textView.setText("LV." + i4);
            }
            if (this.f28232p0.n2() == 2) {
                this.W.setVipDataForUserCenter(0, 0, true);
                this.V.setVipDataForUserCenter(0, 0);
                this.f28221f.setVisibility(0);
                this.f28222g.setVisibility(8);
                this.f28220e.setVisibility(8);
                this.f28243y.getHeight();
                this.N = com.join.mgps.Util.c0.a(this, this.Z - 50);
                this.P.setVisibility(0);
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(com.join.mgps.Util.c0.a(this, 67.0f), com.join.mgps.Util.c0.a(this, 67.0f));
                layoutParams.addRule(13);
                layoutParams.topMargin = 0;
                this.f28231p.setLayoutParams(layoutParams);
                this.f28217b.setLayoutParams(layoutParams);
            } else {
                this.f28220e.setVisibility(0);
                this.f28221f.setVisibility(8);
                this.f28222g.setVisibility(0);
                this.f28243y.getHeight();
                this.N = com.join.mgps.Util.c0.a(this, this.Z - 50);
                this.P.setVisibility(0);
                RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(com.join.mgps.Util.c0.a(this, 67.0f), com.join.mgps.Util.c0.a(this, 67.0f));
                layoutParams2.addRule(13);
                layoutParams2.topMargin = 0;
                this.f28231p.setLayoutParams(layoutParams2);
                this.f28217b.setLayoutParams(layoutParams2);
            }
            if (this.f28232p0.O1() != 0 && !this.f28240v1 && ((recomDatabean = this.J1) == null || recomDatabean.getMain() == null || this.J1.getMain().getAd_switch() != 1)) {
                this.f28223h.setVisibility(this.f28232p0.O1() != 0 ? 0 : 8);
                TextView textView2 = this.f28223h;
                textView2.setText(this.f28232p0.O1() + "");
            }
            RecomDatabean recomDatabean2 = this.N1;
            if (recomDatabean2 != null && recomDatabean2.getMain() != null && this.N1.getMain().getAd_switch() == 1) {
                this.f28217b.setOnClickListener(new p());
            } else {
                this.f28217b.setOnClickListener(new a());
            }
            com.join.mgps.Util.j0.W0(this.V);
            this.f28243y.setOnClickListener(new b());
            this.f28219d.setOnClickListener(new c());
            String j4 = com.join.mgps.pref.h.n(this).j();
            if (!com.join.mgps.Util.g2.i(j4) || (everdayLogin = (EverdayLogin) JsonMapper.getInstance().fromJson(j4, EverdayLogin.class)) == null) {
                return;
            }
            com.join.android.app.common.utils.g.g(everdayLogin.getHasGetGiftTime());
            return;
        }
        this.f28220e.setVisibility(8);
        this.f28221f.setVisibility(8);
        this.V.setVisibility(8);
        this.W.setVisibility(8);
        RecomDatabean recomDatabean3 = this.N1;
        if (recomDatabean3 != null && recomDatabean3.getMain() != null && this.N1.getMain().getAd_switch() == 1) {
            this.f28217b.setOnClickListener(new d());
        } else {
            this.f28217b.setOnClickListener(new e());
        }
        this.f28243y.setOnClickListener(new f());
        this.f28219d.setOnClickListener(new g());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void E0() {
        this.f28240v1 = true;
        this.U.setText(this.A1.getMain().getSub_title());
        MyImageLoader.h(this.T, this.A1.getMain().getPic_remote());
        this.f28223h.setVisibility(8);
        this.f28237t.setOnClickListener(new o());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void F0() {
        IntentUtil.getInstance().goForumProfileFavoritesActivity(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void G0() {
        if (this.f28233p1) {
            return;
        }
        this.f28233p1 = true;
        showMessage(getString(R.string.pay_token_fail));
        AccountUtil_.getInstance_(getApplicationContext()).accountLoginOut(this);
        touristLogin();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void H0() {
        IntentUtil intentUtil = IntentUtil.getInstance();
        intentUtil.goShareWebActivity(this, com.join.mgps.rpc.h.f54095w + "/Auxiliary_tool");
    }

    @Receiver(actions = {o1.a.B})
    public void I0(Context context) {
        D0();
        touristLogin();
        this.f28232p0 = AccountUtil_.getInstance_(getApplicationContext()).getAccountData();
        if (this.D == null) {
            this.D = com.join.mgps.rpc.impl.d.P1();
        }
        if (this.E == null) {
            this.E = com.join.mgps.rpc.impl.a.c0();
        }
        if (this.F == null) {
            this.F = com.join.mgps.rpc.impl.b.k();
        }
        if (this.G == null) {
            this.G = com.join.mgps.rpc.impl.n.h();
        }
        if (this.H == null) {
            this.H = com.join.mgps.rpc.impl.g.A0();
        }
        J0();
        C0();
    }

    void J0() {
        com.wufan.user.service.protobuf.n0 n0Var = this.f28232p0;
        if (n0Var != null) {
            this.X.setVipData(n0Var.M(), this.f28232p0.j1());
        }
        com.wufan.user.service.protobuf.n0 n0Var2 = this.f28232p0;
        if (n0Var2 != null && com.join.mgps.Util.b.piv(n0Var2)) {
            long y2 = this.f28232p0.y();
            long currentTimeMillis = System.currentTimeMillis();
            long j4 = (y2 - currentTimeMillis) / 86400000;
            if (y2 <= currentTimeMillis) {
                this.Y.setVisibility(8);
            } else if (j4 <= 7) {
                TextView textView = this.Y;
                textView.setText(com.join.mgps.Util.y.n(y2) + "到期");
            } else {
                this.Y.setVisibility(8);
            }
        } else {
            this.Y.setVisibility(0);
            RecomDatabean recomDatabean = this.L1;
            if (recomDatabean != null && recomDatabean.getMain() != null) {
                this.Y.setText(this.L1.getMain().getSub_title());
            } else {
                this.Y.setText("开通VIP，成为悟饭特权派");
            }
            this.Y.setTextColor(getResources().getColor(R.color.vip_color));
        }
        this.C1.setOnClickListener(new h());
    }

    boolean K0() {
        if (accountBean(this) == null) {
            return false;
        }
        return !AccountUtil_.getInstance_(getApplicationContext()).isTourist();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterViews() {
        try {
            this.B1 = this;
            this.J.setBackgroundColor(-1);
            this.N = com.join.mgps.Util.c0.a(this, this.Z - 60);
            this.f28232p0 = AccountUtil_.getInstance_(getApplicationContext()).getAccountData();
            this.D = com.join.mgps.rpc.impl.d.P1();
            y0();
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void back_image() {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void error(String str) {
        com.join.mgps.Util.l2.a(this).b(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void i0() {
        com.papa.sim.statistic.pref.b.k(getApplicationContext()).A(false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void j0() {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click({R.id.face_transfer_rl})
    public void k0() {
        IntentUtil.getInstance().goFaceTransferHomePageActivity(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void l0(int i4) {
        if (i4 < 1) {
            this.f28228m.setVisibility(8);
            return;
        }
        if (i4 < 100) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f28228m.getLayoutParams();
            layoutParams.width = getResources().getDimensionPixelOffset(R.dimen.round_large_size);
            layoutParams.height = getResources().getDimensionPixelOffset(R.dimen.round_large_size);
            this.f28228m.setLayoutParams(layoutParams);
            this.f28228m.setCompoundDrawables(null, null, null, null);
            this.f28228m.setBackgroundResource(R.drawable.mygame_big_round);
            this.f28228m.setPadding(1, 0, 0, 1);
        } else {
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.f28228m.getLayoutParams();
            layoutParams2.width = getResources().getDimensionPixelOffset(R.dimen.dp70);
            layoutParams2.height = getResources().getDimensionPixelOffset(R.dimen.round_large_size);
            layoutParams2.setMargins(0, (int) TypedValue.applyDimension(1, 7.0f, getResources().getDisplayMetrics()), 4, 0);
            this.f28228m.setGravity(17);
            this.f28228m.setLayoutParams(layoutParams2);
            this.f28228m.setCompoundDrawables(null, null, null, null);
            this.f28228m.setBackgroundResource(R.drawable.message_round);
            this.f28228m.setPadding(1, 0, 2, 1);
        }
        TextView textView = this.f28228m;
        textView.setText(i4 + "");
        this.f28228m.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void m0() {
        if (!com.join.android.app.common.utils.j.j(this) || this.f28232p0 == null) {
            return;
        }
        try {
            b0.b k32 = com.wufan.user.service.protobuf.b0.k3();
            k32.e3(this.f28232p0.getUid());
            k32.c3(this.f28232p0.getToken());
            k32.Y2(b3.b.a(this));
            HashMap hashMap = new HashMap();
            hashMap.put("uid", k32.getUid() + "");
            hashMap.put("token", k32.getToken());
            hashMap.put("appVersion", k32.getAppVersion());
            k32.a3(com.join.mgps.Util.x1.d(hashMap));
            com.wufan.user.service.protobuf.d0 e5 = this.F.e(k32.build());
            if (e5 != null) {
                if (e5.getError() == 200) {
                    com.wufan.user.service.protobuf.n0 data = e5.getData();
                    if (data != null && data.getUid() != 0) {
                        n0.b builder = this.f28232p0.toBuilder();
                        builder.j4(data.j1()).s4(data.M()).W3(data.x2()).Q3(data.O2()).e4(data.O1());
                        this.f28232p0 = builder.build();
                        AccountUtil_.getInstance_(getApplicationContext()).saveAccountData(this.f28232p0, getApplicationContext());
                    }
                    D0();
                    this.f28233p1 = false;
                } else if (e5.getError() == 701) {
                    G0();
                }
            }
        } catch (Exception e6) {
            e6.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void o0() {
        IntentUtil.getInstance().goDownloadSettingActivity(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        com.join.mgps.Util.v0.b("AccountCenterActivity", "method onResume() called.");
        D0();
        com.join.mgps.Util.v0.b("AccountCenterActivity", "method refreshViews() called end.");
        touristLogin();
        com.join.mgps.Util.v0.b("AccountCenterActivity", "method touristLogin() called end.");
        this.f28232p0 = AccountUtil_.getInstance_(getApplicationContext()).getAccountData();
        if (this.D == null) {
            this.D = com.join.mgps.rpc.impl.d.P1();
        }
        if (this.E == null) {
            this.E = com.join.mgps.rpc.impl.a.c0();
        }
        if (this.G == null) {
            this.G = com.join.mgps.rpc.impl.n.h();
        }
        if (this.H == null) {
            this.H = com.join.mgps.rpc.impl.g.A0();
        }
        com.join.mgps.Util.v0.b("AccountCenterActivity", "init rpc end.");
        J0();
        com.join.mgps.Util.v0.b("AccountCenterActivity", "method updateVipItem() called end.");
        m0();
        com.join.mgps.Util.v0.b("AccountCenterActivity", "method checkUserInfo() called end.");
        C0();
        com.join.mgps.Util.v0.b("AccountCenterActivity", "method pullMyProfileInfo() called end.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void p0() {
        IntentUtil.getInstance().goFeedback(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void q0(RecomCentrebean recomCentrebean) {
        try {
            RecomDatabean vip = recomCentrebean.getVip();
            this.L1 = vip;
            if (vip != null && vip.getMain() != null && this.L1.getMain().getAd_switch() == 1) {
                this.W1.setText(this.L1.getMain().getTitle());
                this.C1.setVisibility(0);
                MyImageLoader.d(this.D1, R.drawable.papa_vip, this.L1.getMain().getPic_remote());
                this.X.setVipData(this.f28232p0.M(), this.f28232p0.j1());
                if (com.join.mgps.Util.b.piv(this.f28232p0)) {
                    long y2 = this.f28232p0.y();
                    long currentTimeMillis = System.currentTimeMillis();
                    long j4 = (y2 - currentTimeMillis) / 86400000;
                    if (y2 <= currentTimeMillis) {
                        this.Y.setVisibility(8);
                    } else if (j4 <= 7) {
                        TextView textView = this.Y;
                        textView.setText(com.join.mgps.Util.y.n(y2) + "到期");
                    } else {
                        this.Y.setVisibility(8);
                    }
                } else {
                    this.Y.setVisibility(0);
                    RecomDatabean recomDatabean = this.L1;
                    if (recomDatabean != null) {
                        this.Y.setText(recomDatabean.getMain().getSub_title());
                    } else {
                        this.Y.setText("开通VIP，成为悟饭特权派");
                    }
                    this.Y.setTextColor(getResources().getColor(R.color.vip_color));
                }
                this.C1.setOnClickListener(new i());
            } else {
                this.C1.setVisibility(8);
            }
            RecomDatabean copper = recomCentrebean.getCopper();
            this.J1 = copper;
            if (copper != null && copper.getMain() != null && this.J1.getMain().getAd_switch() == 1) {
                this.U.setText(this.J1.getMain().getTitle());
                MyImageLoader.d(this.T, R.drawable.papa_brass, this.J1.getMain().getPic_remote());
                this.f28223h.setText(this.J1.getMain().getSub_title());
                this.f28237t.setOnClickListener(new j());
            } else {
                this.f28223h.setVisibility(0);
            }
            RecomDatabean currency_red_packets = recomCentrebean.getCurrency_red_packets();
            this.M1 = currency_red_packets;
            if (currency_red_packets != null && currency_red_packets.getMain() != null && this.M1.getMain().getAd_switch() == 1) {
                this.f28234q.setText(this.M1.getMain().getTitle());
                this.f28230o.setText(this.M1.getMain().getSub_title());
                MyImageLoader.h(this.H1, this.M1.getMain().getPic_remote());
                this.f28241w.setOnClickListener(new k());
            } else {
                this.f28230o.setVisibility(0);
            }
            RecomDatabean personal_information = recomCentrebean.getPersonal_information();
            this.N1 = personal_information;
            if (personal_information != null && personal_information.getMain() != null && this.N1.getMain().getAd_switch() == 1) {
                this.f28217b.setOnClickListener(new l());
            }
            RecomDatabean members_center_first = recomCentrebean.getMembers_center_first();
            this.O1 = members_center_first;
            if (members_center_first != null && members_center_first.getMain() != null && this.O1.getMain().getAd_switch() == 1) {
                this.Q1.setVisibility(0);
                MyImageLoader.d(this.S1, R.drawable.papa_vip, this.O1.getMain().getPic_remote());
                this.U1.setText(this.O1.getMain().getTitle());
                this.Q1.setOnClickListener(new m());
            }
            RecomDatabean members_center_second = recomCentrebean.getMembers_center_second();
            this.P1 = members_center_second;
            if (members_center_second == null || members_center_second.getMain() == null || this.P1.getMain().getAd_switch() != 1) {
                return;
            }
            if (this.Q1.getVisibility() == 8) {
                this.Z1.setVisibility(8);
            } else {
                this.Z1.setVisibility(0);
            }
            this.R1.setVisibility(0);
            MyImageLoader.d(this.T1, R.drawable.papa_vip, this.P1.getMain().getPic_remote());
            this.V1.setText(this.P1.getMain().getTitle());
            this.R1.setOnClickListener(new n());
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void r0() {
        IntentUtil.getInstance().goJoystickManager(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void s0() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showMessage(String str) {
        com.join.mgps.Util.l2.a(this).b(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void t0() {
        if (IntentUtil.getInstance().goLogin(this)) {
            return;
        }
        IntentUtil.getInstance().goFormDetial(this, "13162");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void touristLogin() {
        if (!com.join.android.app.common.utils.j.j(this) || isLogined(this)) {
            return;
        }
        try {
            TouristLoginRequestBean touristLoginRequestBean = new TouristLoginRequestBean();
            touristLoginRequestBean.setVersion(com.join.android.app.common.utils.n.n(getApplicationContext()).z());
            touristLoginRequestBean.setDevice_id("");
            touristLoginRequestBean.setMac("");
            touristLoginRequestBean.setSource("2");
            touristLoginRequestBean.setTuid(this.C.touriseTUID().d().longValue());
            touristLoginRequestBean.setSign(com.join.mgps.Util.x1.g(touristLoginRequestBean));
            AccountResultMainBean<AccountTokenSuccess> s4 = this.E.s(touristLoginRequestBean.getParams());
            if (s4 == null || s4.getError() != 0) {
                return;
            }
            if (s4.getData().is_success()) {
                AccountBean user_info = s4.getData().getUser_info();
                if (user_info != null) {
                    AccountUtil_.getInstance_(getApplicationContext()).saveAccountData(b3.a.a(user_info), getApplicationContext());
                }
                z0();
                return;
            }
            error(s4.getData().getError_msg());
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void u0() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void v0() {
        IntentUtil.getInstance().goForumProfileMessageActivity(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void w0() {
        IntentUtil.getInstance().goForumMyDynamicActivity(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void x0() {
        IntentDateBean intentDateBean = new IntentDateBean();
        intentDateBean.setLink_type(3);
        intentDateBean.setJump_type(12);
        IntentUtil.getInstance().intentActivity(this, intentDateBean);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void y0() {
        try {
            q0(this.D.B(RequestBeanUtil.getInstance(this).personalCenter()).getMessages().getData().get(0));
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void z0() {
        D0();
    }
}
