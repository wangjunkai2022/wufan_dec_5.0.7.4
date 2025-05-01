package com.join.mgps.activity;

import android.widget.ListAdapter;
import android.widget.TextView;
import android.widget.Toast;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.baseactivity.BaseLoadingActivity;
import com.join.mgps.customview.XListView2;
import com.join.mgps.dto.AccountVoucherAd;
import com.join.mgps.dto.AccountVoucherGameBean;
import com.join.mgps.dto.PapayVoucherResultMain;
import com.join.mgps.dto.ResultMyVoucherBean;
import java.util.ArrayList;
import java.util.List;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
import org.springframework.util.LinkedMultiValueMap;
@EActivity(R.layout.activity_listview)
/* loaded from: classes4.dex */
public class HotVoucherActivity extends BaseLoadingActivity {
    @ViewById

    /* renamed from: e  reason: collision with root package name */
    TextView f34038e;
    @ViewById

    /* renamed from: f  reason: collision with root package name */
    TextView f34039f;
    @ViewById

    /* renamed from: g  reason: collision with root package name */
    XListView2 f34040g;

    /* renamed from: h  reason: collision with root package name */
    com.join.mgps.rpc.o f34041h;

    /* renamed from: i  reason: collision with root package name */
    private int f34042i = 1;

    /* renamed from: j  reason: collision with root package name */
    private com.join.mgps.adapter.u1 f34043j;

    /* renamed from: k  reason: collision with root package name */
    private List<AccountVoucherGameBean> f34044k;

    /* renamed from: l  reason: collision with root package name */
    private AccountVoucherAd f34045l;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a implements com.join.mgps.customview.f {
        a() {
        }

        @Override // com.join.mgps.customview.f
        public void onLoadMore() {
            HotVoucherActivity.l0(HotVoucherActivity.this);
            HotVoucherActivity.this.loadData();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class b implements com.join.mgps.customview.g {
        b() {
        }

        @Override // com.join.mgps.customview.g
        public void onRefresh() {
            HotVoucherActivity.this.f34042i = 1;
            HotVoucherActivity.this.loadData();
        }
    }

    static /* synthetic */ int l0(HotVoucherActivity hotVoucherActivity) {
        int i4 = hotVoucherActivity.f34042i;
        hotVoucherActivity.f34042i = i4 + 1;
        return i4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterViews() {
        this.f34041h = com.join.mgps.rpc.impl.n.h();
        this.f34038e.setText("热门代金券");
        this.f34039f.setVisibility(8);
        this.f34044k = new ArrayList();
        com.join.mgps.adapter.u1 u1Var = new com.join.mgps.adapter.u1(this, this.f34044k);
        this.f34043j = u1Var;
        this.f34040g.setAdapter((ListAdapter) u1Var);
        this.f34040g.setPreLoadCount(10);
        this.f34040g.setPullLoadEnable(new a());
        this.f34040g.setPullRefreshEnable(new b());
        loadData();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void back_image() {
        finish();
    }

    @Override // com.join.mgps.baseactivity.BaseLoadingActivity
    public int getLoadingLayoutResID() {
        return R.id.activity_listview;
    }

    @Override // com.join.mgps.baseactivity.BaseLoadingActivity
    @Background
    public void loadData() {
        if (com.join.android.app.common.utils.j.j(getApplicationContext())) {
            try {
                LinkedMultiValueMap linkedMultiValueMap = new LinkedMultiValueMap();
                linkedMultiValueMap.add("uid", AccountUtil_.getInstance_(getApplicationContext()).getUid());
                linkedMultiValueMap.add("token", AccountUtil_.getInstance_(getApplicationContext()).getToken());
                linkedMultiValueMap.add("page", this.f34042i + "");
                linkedMultiValueMap.add("limit", com.join.mgps.Util.v.f28122v);
                PapayVoucherResultMain<ResultMyVoucherBean> b5 = this.f34041h.b(linkedMultiValueMap);
                if (b5 != null) {
                    if (b5.getError() == 0 && b5.getData() != null) {
                        List<AccountVoucherGameBean> recommend = b5.getData().getRecommend();
                        this.f34044k.addAll(recommend);
                        p0();
                        if (recommend.size() < 10) {
                            m0();
                        }
                    } else {
                        showLodingFailed();
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
        o0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void m0() {
        this.f34040g.setNoMore();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void n0() {
        Toast.makeText(this, getString(R.string.net_connect_failed), 0).show();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void o0() {
        this.f34040g.u();
        this.f34040g.v();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void p0() {
        if (this.f34044k.size() == 0) {
            this.f34040g.setNoMore();
            showNoDataLayoutTwo();
            setTextViewNoData(getString(R.string.voucher_recommend_no));
        } else {
            this.f34040g.q();
            g0();
        }
        this.f34043j.notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showLodingFailed() {
        List<AccountVoucherGameBean> list = this.f34044k;
        if (list == null || list.size() == 0) {
            h0();
        }
    }
}
