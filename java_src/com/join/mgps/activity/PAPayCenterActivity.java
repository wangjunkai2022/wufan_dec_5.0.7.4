package com.join.mgps.activity;

import android.content.Context;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import com.BaseActivity;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.IntentDateBean;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.adapter.s4;
import com.join.mgps.customview.XListView;
import com.join.mgps.dto.PapayHistoryInfo;
import com.join.mgps.dto.PapayInfo;
import com.join.mgps.dto.PapayRequest;
import com.join.mgps.dto.PapayResultData;
import com.join.mgps.dto.PapayWalletResultMain;
import com.join.mgps.dto.PayAdinfo;
import com.join.mgps.listener.b;
import java.util.List;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.Extra;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
@EActivity(R.layout.papapay_center_layout)
/* loaded from: classes4.dex */
public class PAPayCenterActivity extends BaseActivity implements View.OnClickListener, b.a {
    @ViewById

    /* renamed from: b  reason: collision with root package name */
    XListView f36294b;
    @ViewById

    /* renamed from: c  reason: collision with root package name */
    TextView f36295c;

    /* renamed from: d  reason: collision with root package name */
    TextView f36296d;

    /* renamed from: e  reason: collision with root package name */
    TextView f36297e;

    /* renamed from: f  reason: collision with root package name */
    SimpleDraweeView f36298f;

    /* renamed from: g  reason: collision with root package name */
    Button f36299g;

    /* renamed from: h  reason: collision with root package name */
    ImageView f36300h;

    /* renamed from: i  reason: collision with root package name */
    LinearLayout f36301i;

    /* renamed from: j  reason: collision with root package name */
    s4 f36302j;

    /* renamed from: k  reason: collision with root package name */
    Context f36303k;

    /* renamed from: l  reason: collision with root package name */
    List<PapayHistoryInfo> f36304l;
    @ViewById

    /* renamed from: m  reason: collision with root package name */
    TextView f36305m;
    @ViewById

    /* renamed from: n  reason: collision with root package name */
    LinearLayout f36306n;

    /* renamed from: o  reason: collision with root package name */
    TextView f36307o;
    @Extra

    /* renamed from: p  reason: collision with root package name */
    int f36308p;

    /* renamed from: q  reason: collision with root package name */
    com.join.mgps.rpc.o f36309q;

    /* renamed from: t  reason: collision with root package name */
    private com.wufan.user.service.protobuf.n0 f36312t;

    /* renamed from: u  reason: collision with root package name */
    com.join.mgps.dialog.d1 f36313u;

    /* renamed from: v  reason: collision with root package name */
    private TextView f36314v;

    /* renamed from: w  reason: collision with root package name */
    private TextView f36315w;

    /* renamed from: r  reason: collision with root package name */
    int f36310r = 1;

    /* renamed from: s  reason: collision with root package name */
    private boolean f36311s = false;

    /* renamed from: x  reason: collision with root package name */
    private boolean f36316x = true;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a implements com.join.mgps.customview.f {
        a() {
        }

        @Override // com.join.mgps.customview.f
        public void onLoadMore() {
            if (PAPayCenterActivity.this.f36311s) {
                return;
            }
            PAPayCenterActivity pAPayCenterActivity = PAPayCenterActivity.this;
            pAPayCenterActivity.k0(pAPayCenterActivity.f36312t, PAPayCenterActivity.this.f36310r);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class b implements AdapterView.OnItemClickListener {
        b() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i4, long j4) {
            com.join.mgps.Util.v0.c("click position" + i4);
            int i5 = i4 + (-2);
            if (i5 < 0) {
                return;
            }
            try {
                PapayPayDetialActivity_.g0(PAPayCenterActivity.this.f36303k).a(PAPayCenterActivity.this.f36304l.get(i5)).start();
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class c implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PayAdinfo f36319b;

        c(PayAdinfo payAdinfo) {
            this.f36319b = payAdinfo;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IntentUtil.getInstance().intentActivity(PAPayCenterActivity.this.f36303k, this.f36319b.getLink().getIntentDataBean());
        }
    }

    private void m0() {
        com.wufan.user.service.protobuf.n0 accountData = AccountUtil_.getInstance_(getApplicationContext()).getAccountData();
        this.f36312t = accountData;
        if (accountData == null) {
            IntentUtil.getInstance().goLogin(this.f36303k);
        } else if (this.f36316x) {
            this.f36316x = false;
            this.f36313u.b();
            this.f36310r = 1;
            k0(this.f36312t, 1);
        } else {
            this.f36310r = 1;
            k0(accountData, 1);
            this.f36294b.n();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterview() {
        this.f36309q = com.join.mgps.rpc.impl.n.h();
        this.f36303k = this;
        com.join.mgps.dialog.d1 x4 = com.join.mgps.Util.b0.f0(this).x(this.f36303k);
        this.f36313u = x4;
        x4.setCancelable(true);
        View inflate = LayoutInflater.from(this.f36303k).inflate(R.layout.papapayhead, (ViewGroup) null);
        this.f36296d = (TextView) inflate.findViewById(R.id.pabiNumber);
        this.f36297e = (TextView) inflate.findViewById(R.id.message);
        this.f36298f = (SimpleDraweeView) inflate.findViewById(R.id.papaPayIcon);
        this.f36314v = (TextView) inflate.findViewById(R.id.name);
        this.f36307o = (TextView) inflate.findViewById(R.id.listHead);
        this.f36299g = (Button) inflate.findViewById(R.id.payStart);
        this.f36300h = (ImageView) inflate.findViewById(R.id.more);
        this.f36315w = (TextView) inflate.findViewById(R.id.payRedNumber);
        this.f36301i = (LinearLayout) inflate.findViewById(R.id.hongbaoLayout);
        if (this.f36308p == 2) {
            this.f36295c.setText("悟饭红包");
            this.f36299g.setVisibility(8);
            this.f36307o.setText("红包交易记录");
            this.f36314v.setText("余额(红包)");
        } else {
            this.f36295c.setText("我的饭票");
        }
        this.f36301i.setVisibility(8);
        s4 s4Var = new s4(this.f36303k);
        this.f36302j = s4Var;
        this.f36304l = s4Var.a();
        this.f36294b.addHeaderView(inflate);
        this.f36294b.setAdapter((ListAdapter) this.f36302j);
        this.f36299g.setOnClickListener(this);
        this.f36300h.setOnClickListener(this);
        this.f36301i.setOnClickListener(this);
        this.f36294b.setPreLoadCount(10);
        this.f36294b.setPullLoadEnable(new a());
        this.f36294b.c();
        this.f36294b.setOnItemClickListener(new b());
        com.join.mgps.listener.b.b().a(this);
        m0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void back_image() {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void g0() {
        IntentDateBean intentDateBean = new IntentDateBean();
        intentDateBean.setLink_type(4);
        intentDateBean.setLink_type_val("http://h5.5fun.com/wf_help_pa_money.html");
        IntentUtil.getInstance().intentActivity(this.f36303k, intentDateBean);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void j0() {
        com.join.mgps.dialog.d1 d1Var = this.f36313u;
        if (d1Var == null || !d1Var.isShowing()) {
            return;
        }
        this.f36313u.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void k0(com.wufan.user.service.protobuf.n0 n0Var, int i4) {
        PapayWalletResultMain d5;
        if (com.join.android.app.common.utils.j.j(this.f36303k)) {
            this.f36311s = true;
            try {
                try {
                    PapayRequest papayRequest = new PapayRequest();
                    papayRequest.setLimit(10);
                    papayRequest.setToken(n0Var.getToken());
                    papayRequest.setUid(n0Var.getUid());
                    papayRequest.setPage(i4);
                    if (this.f36308p == 2) {
                        d5 = this.f36309q.c(papayRequest.getParams());
                    } else {
                        d5 = this.f36309q.d(papayRequest.getParams());
                    }
                    if (d5 != null && d5.getError() == 0) {
                        n0(d5.getData(), i4);
                    } else {
                        o0();
                    }
                } catch (Exception e5) {
                    e5.printStackTrace();
                    o0();
                }
                return;
            } finally {
                this.f36311s = false;
                j0();
            }
        }
        j0();
        o0();
    }

    @Override // com.join.mgps.listener.b.a
    public void l() {
        m0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void l0() {
        this.f36294b.setNoMore();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void n0(PapayResultData papayResultData, int i4) {
        if (papayResultData != null) {
            if (i4 == 1) {
                PapayInfo wallet = papayResultData.getWallet();
                if (this.f36308p == 2) {
                    this.f36296d.setText(wallet.getRed_envelope());
                    this.f36301i.setVisibility(8);
                } else {
                    this.f36296d.setText(wallet.getMoney());
                    this.f36301i.setVisibility(0);
                }
                this.f36304l.clear();
                PayAdinfo ad = papayResultData.getAd();
                this.f36297e.setText(ad.getTitle());
                this.f36297e.getPaint().setFlags(8);
                this.f36297e.getPaint().setAntiAlias(true);
                MyImageLoader.h(this.f36298f, ad.getIcon());
                this.f36297e.setOnClickListener(new c(ad));
                TextView textView = this.f36315w;
                textView.setText(Html.fromHtml("余额<font color = '#fd5d58'>" + wallet.getRed_envelope() + "</font>"), TextView.BufferType.SPANNABLE);
            }
            List<PapayHistoryInfo> orders = papayResultData.getOrders();
            if (orders != null && orders.size() > 0) {
                this.f36304l.addAll(orders);
                int i5 = this.f36310r;
                if (i5 == i4) {
                    this.f36310r = i5 + 1;
                }
                o0();
                if (orders.size() < 10) {
                    l0();
                }
                this.f36306n.setVisibility(8);
            } else {
                if (i4 == 1) {
                    this.f36306n.setVisibility(0);
                } else {
                    this.f36306n.setVisibility(8);
                }
                l0();
            }
            this.f36302j.notifyDataSetChanged();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void o0() {
        this.f36294b.q();
        this.f36294b.r();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.hongbaoLayout || id == R.id.more) {
            PAPayCenterActivity_.u0(this.f36303k).a(2).start();
        } else if (id != R.id.payStart) {
        } else {
            PayStartActivity_.z0(this).start();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.join.mgps.listener.b.b().d(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }
}
