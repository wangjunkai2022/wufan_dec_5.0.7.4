package com.join.mgps.activity;

import android.text.Html;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import android.widget.Toast;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.IntentDateBean;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.baseactivity.BaseLoadingActivity;
import com.join.mgps.customview.XListView2;
import com.join.mgps.dto.AccountVoucher;
import com.join.mgps.dto.AccountVoucherAd;
import com.join.mgps.dto.AccountVoucherGame;
import com.join.mgps.dto.PapayVoucherResultMain;
import com.join.mgps.dto.ResultMyVoucherGameBean;
import com.join.mgps.listener.a;
import java.util.ArrayList;
import java.util.List;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.Extra;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
import org.springframework.util.LinkedMultiValueMap;
@EActivity(R.layout.activity_my_voucher_game)
/* loaded from: classes4.dex */
public class MyVoucherGameActivity extends BaseLoadingActivity implements a.InterfaceC0373a {
    @ViewById

    /* renamed from: e  reason: collision with root package name */
    TextView f36093e;
    @ViewById

    /* renamed from: f  reason: collision with root package name */
    TextView f36094f;
    @ViewById

    /* renamed from: g  reason: collision with root package name */
    LinearLayout f36095g;
    @ViewById

    /* renamed from: h  reason: collision with root package name */
    XListView2 f36096h;

    /* renamed from: i  reason: collision with root package name */
    com.join.mgps.rpc.o f36097i;

    /* renamed from: j  reason: collision with root package name */
    private int f36098j = 1;
    @ViewById

    /* renamed from: k  reason: collision with root package name */
    TextView f36099k;

    /* renamed from: l  reason: collision with root package name */
    private AccountVoucherAd f36100l;
    @Extra

    /* renamed from: m  reason: collision with root package name */
    AccountVoucher f36101m;

    /* renamed from: n  reason: collision with root package name */
    private com.join.mgps.adapter.y2 f36102n;

    /* renamed from: o  reason: collision with root package name */
    private List<AccountVoucherGame> f36103o;

    /* loaded from: classes4.dex */
    class a implements com.join.mgps.customview.f {
        a() {
        }

        @Override // com.join.mgps.customview.f
        public void onLoadMore() {
            MyVoucherGameActivity.l0(MyVoucherGameActivity.this);
            MyVoucherGameActivity.this.loadData();
        }
    }

    /* loaded from: classes4.dex */
    class b implements com.join.mgps.customview.g {
        b() {
        }

        @Override // com.join.mgps.customview.g
        public void onRefresh() {
            MyVoucherGameActivity.this.f36098j = 1;
            MyVoucherGameActivity.this.loadData();
        }
    }

    static /* synthetic */ int l0(MyVoucherGameActivity myVoucherGameActivity) {
        int i4 = myVoucherGameActivity.f36098j;
        myVoucherGameActivity.f36098j = i4 + 1;
        return i4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterViews() {
        this.f36097i = com.join.mgps.rpc.impl.n.h();
        this.f36103o = new ArrayList();
        this.f36096h.setPreLoadCount(10);
        this.f36099k.setText(R.string.voucher_use);
        com.join.mgps.adapter.y2 y2Var = new com.join.mgps.adapter.y2(this.f36103o, this);
        this.f36102n = y2Var;
        this.f36096h.setAdapter((ListAdapter) y2Var);
        this.f36096h.setPullLoadEnable(new a());
        this.f36096h.setPullRefreshEnable(new b());
        this.f36093e.setText(this.f36101m.getGame_name());
        com.join.mgps.listener.a.b().a(this);
        loadData();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void back_image() {
        finish();
    }

    @Override // com.join.mgps.baseactivity.BaseLoadingActivity
    public int getLoadingLayoutResID() {
        return R.id.layout_my_voucher_game;
    }

    @Override // com.join.mgps.listener.a.InterfaceC0373a
    public void l() {
        this.f36098j = 1;
        loadData();
    }

    @Override // com.join.mgps.baseactivity.BaseLoadingActivity
    @Background
    public void loadData() {
        if (com.join.android.app.common.utils.j.j(this)) {
            try {
                LinkedMultiValueMap linkedMultiValueMap = new LinkedMultiValueMap();
                linkedMultiValueMap.add("uid", AccountUtil_.getInstance_(getApplicationContext()).getUid());
                linkedMultiValueMap.add("token", AccountUtil_.getInstance_(getApplicationContext()).getToken());
                linkedMultiValueMap.add("game_id", this.f36101m.getGame_id() + "");
                linkedMultiValueMap.add("page", this.f36098j + "");
                linkedMultiValueMap.add("limit", com.join.mgps.Util.v.f28122v);
                PapayVoucherResultMain<ResultMyVoucherGameBean> f5 = this.f36097i.f(linkedMultiValueMap);
                if (f5 != null) {
                    if (f5.getError() == 0) {
                        List<AccountVoucherGame> coupons = f5.getData().getCoupons();
                        this.f36100l = f5.getData().getHelp();
                        if (coupons != null) {
                            if (coupons.size() > 0) {
                                if (this.f36098j == 1) {
                                    this.f36103o.clear();
                                    this.f36103o.addAll(coupons);
                                } else {
                                    this.f36103o.addAll(coupons);
                                }
                                q0(f5.getData());
                            } else if (this.f36098j != 1) {
                                m0();
                            }
                        }
                    } else if (this.f36098j == 1) {
                        showLodingFailed();
                    } else {
                        m0();
                    }
                } else {
                    showLodingFailed();
                }
            } catch (Exception e5) {
                e5.printStackTrace();
                showLodingFailed();
            }
        } else {
            showLodingFailed();
            n0();
        }
        p0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void m0() {
        this.f36096h.setNoMore();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void n0() {
        Toast.makeText(this, getString(R.string.net_connect_failed), 0).show();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void o0() {
        if (this.f36100l != null) {
            IntentDateBean intentDateBean = new IntentDateBean();
            intentDateBean.setLink_type(4);
            intentDateBean.setLink_type_val(this.f36100l.getLink().getLink_type_val());
            intentDateBean.setObject(this.f36100l.getTitle());
            IntentUtil.getInstance().intentActivity(this, intentDateBean);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.join.mgps.baseactivity.BaseLoadingActivity, com.BaseActivity, com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.join.mgps.listener.a.b().d(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void p0() {
        this.f36096h.u();
        this.f36096h.v();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void q0(ResultMyVoucherGameBean resultMyVoucherGameBean) {
        if (resultMyVoucherGameBean.getMoney() != null) {
            this.f36095g.setVisibility(0);
            TextView textView = this.f36094f;
            String string = getResources().getString(R.string.voucher_game_header);
            textView.setText(Html.fromHtml(String.format(string, "<font color = '#D33D3E'>" + resultMyVoucherGameBean.getMoney().getCount() + "</font>", "<font color = '#D33D3E'>" + resultMyVoucherGameBean.getMoney().getMoney() + "</font>")));
        } else {
            this.f36095g.setVisibility(8);
        }
        g0();
        this.f36102n.notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void r0() {
        IntentUtil intentUtil = IntentUtil.getInstance();
        intentUtil.goGameDetialActivity(this, this.f36101m.getGame_id() + "", this.f36101m.getGame_tpl(), this.f36101m.getSp_tpl_two_position(), 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showLodingFailed() {
        List<AccountVoucherGame> list = this.f36103o;
        if (list == null || list.size() == 0) {
            h0();
        }
    }
}
