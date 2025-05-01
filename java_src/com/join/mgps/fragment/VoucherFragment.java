package com.join.mgps.fragment;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import android.widget.Toast;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.activity.HotVoucherActivity_;
import com.join.mgps.adapter.x2;
import com.join.mgps.basefragment.BaseLoadingFragment;
import com.join.mgps.customview.XListView2;
import com.join.mgps.dto.AccountVoucher;
import com.join.mgps.dto.AccountVoucherAd;
import com.join.mgps.dto.AccountVoucherGameBean;
import com.join.mgps.dto.PapayVoucherResultMain;
import com.join.mgps.dto.ResultMyVoucherBean;
import com.join.mgps.listener.a;
import java.util.ArrayList;
import java.util.List;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
import org.springframework.util.LinkedMultiValueMap;
@EFragment(R.layout.fragment_my_voucher)
/* loaded from: classes3.dex */
public class VoucherFragment extends BaseLoadingFragment implements a.InterfaceC0373a {
    @ViewById

    /* renamed from: c  reason: collision with root package name */
    XListView2 f53202c;

    /* renamed from: d  reason: collision with root package name */
    com.join.mgps.rpc.o f53203d;
    @ViewById

    /* renamed from: e  reason: collision with root package name */
    LinearLayout f53204e;

    /* renamed from: f  reason: collision with root package name */
    private int f53205f = 1;

    /* renamed from: g  reason: collision with root package name */
    private View f53206g;

    /* renamed from: h  reason: collision with root package name */
    private TextView f53207h;

    /* renamed from: i  reason: collision with root package name */
    private TextView f53208i;

    /* renamed from: j  reason: collision with root package name */
    private LinearLayout f53209j;

    /* renamed from: k  reason: collision with root package name */
    private LinearLayout f53210k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f53211l;

    /* renamed from: m  reason: collision with root package name */
    private x2 f53212m;

    /* renamed from: n  reason: collision with root package name */
    private List<Object> f53213n;

    /* renamed from: o  reason: collision with root package name */
    private AccountVoucherAd f53214o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f53215p;

    /* renamed from: q  reason: collision with root package name */
    private Context f53216q;

    /* loaded from: classes3.dex */
    class a implements com.join.mgps.customview.f {
        a() {
        }

        @Override // com.join.mgps.customview.f
        public void onLoadMore() {
            VoucherFragment.g0(VoucherFragment.this);
            VoucherFragment.this.loadData();
        }
    }

    /* loaded from: classes3.dex */
    class b implements com.join.mgps.customview.g {
        b() {
        }

        @Override // com.join.mgps.customview.g
        public void onRefresh() {
            VoucherFragment.this.f53205f = 1;
            VoucherFragment.this.loadData();
        }
    }

    static /* synthetic */ int g0(VoucherFragment voucherFragment) {
        int i4 = voucherFragment.f53205f;
        voucherFragment.f53205f = i4 + 1;
        return i4;
    }

    @Override // com.join.mgps.basefragment.BaseLoadingFragment
    protected int W() {
        return R.layout.fragment_my_voucher;
    }

    @Override // com.join.mgps.basefragment.BaseLoadingFragment
    public int X() {
        return R.id.layout_my_voucher;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterViews() {
        this.f53203d = com.join.mgps.rpc.impl.n.h();
        this.f53216q = getContext();
        this.f53213n = new ArrayList();
        x2 x2Var = new x2(this.f53213n, getContext());
        this.f53212m = x2Var;
        this.f53202c.setAdapter((ListAdapter) x2Var);
        this.f53202c.setPreLoadCount(10);
        this.f53202c.setPullLoadEnable(new a());
        this.f53202c.setPullRefreshEnable(new b());
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.search_failed_header, (ViewGroup) null);
        this.f53206g = inflate;
        this.f53209j = (LinearLayout) inflate.findViewById(R.id.searchHeaderLayout);
        this.f53210k = (LinearLayout) this.f53206g.findViewById(R.id.messageLayout);
        this.f53207h = (TextView) this.f53206g.findViewById(R.id.messageHeader);
        TextView textView = (TextView) this.f53206g.findViewById(R.id.textView2);
        this.f53208i = textView;
        textView.setText(getString(R.string.voucher_my_number));
        this.f53207h.setText(getString(R.string.voucher_my_no));
        this.f53202c.addHeaderView(this.f53206g);
        com.join.mgps.listener.a.b().a(this);
        loadData();
    }

    public AccountVoucherAd h0() {
        return this.f53214o;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void i0() {
        HotVoucherActivity_.x0(this).start();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void j0() {
        this.f53202c.setNoMore();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void k0(PapayVoucherResultMain<ResultMyVoucherBean> papayVoucherResultMain) {
        List<AccountVoucherGameBean> recommend = papayVoucherResultMain.getData().getRecommend();
        this.f53211l = true;
        this.f53213n.clear();
        if (recommend != null && recommend.size() > 0) {
            this.f53213n.addAll(recommend);
            this.f53210k.setVisibility(0);
            this.f53209j.setBackgroundResource(R.drawable.white_drawable);
        } else {
            this.f53210k.setVisibility(8);
            this.f53209j.setBackgroundResource(R.color.activity_default_background);
        }
        n0();
        j0();
        this.f53202c.g();
        if (recommend == null || recommend.size() <= 0) {
            this.f53202c.e();
        }
    }

    @Override // com.join.mgps.listener.a.InterfaceC0373a
    public void l() {
        this.f53205f = 1;
        this.f53202c.q();
        loadData();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void l0() {
        Toast.makeText(getContext(), getString(R.string.net_connect_failed), 0).show();
    }

    @Override // com.join.mgps.basefragment.BaseLoadingFragment
    @Background
    public void loadData() {
        Context context = this.f53216q;
        if (context == null) {
            return;
        }
        if (com.join.android.app.common.utils.j.j(context)) {
            try {
                LinkedMultiValueMap linkedMultiValueMap = new LinkedMultiValueMap();
                linkedMultiValueMap.add("uid", AccountUtil_.getInstance_(this.f53216q).getUid());
                linkedMultiValueMap.add("token", AccountUtil_.getInstance_(this.f53216q).getToken());
                linkedMultiValueMap.add("page", this.f53205f + "");
                linkedMultiValueMap.add("limit", com.join.mgps.Util.v.f28122v);
                PapayVoucherResultMain<ResultMyVoucherBean> l4 = this.f53203d.l(linkedMultiValueMap);
                if (l4 != null) {
                    if (l4.getError() == 0) {
                        List<AccountVoucher> coupons = l4.getData().getCoupons();
                        this.f53214o = l4.getData().getAd();
                        this.f53215p = l4.getData().is_show_recommend_bar();
                        if (coupons != null) {
                            if (coupons.size() > 0) {
                                if (this.f53205f == 1) {
                                    this.f53213n.clear();
                                    this.f53213n.addAll(coupons);
                                    this.f53211l = false;
                                } else {
                                    this.f53213n.addAll(coupons);
                                }
                                n0();
                                if (coupons.size() <= 10) {
                                    j0();
                                }
                            } else if (this.f53205f == 1) {
                                k0(l4);
                            }
                        } else if (this.f53205f == 1) {
                            k0(l4);
                        }
                    } else if (this.f53205f == 1) {
                        showLodingFailed();
                    } else {
                        j0();
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
            l0();
        }
        m0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void m0() {
        this.f53202c.u();
        this.f53202c.v();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void n0() {
        if (this.f53211l && this.f53205f == 1) {
            this.f53209j.setVisibility(0);
        } else {
            this.f53209j.setVisibility(8);
        }
        if (this.f53213n.size() == 0) {
            this.f53202c.g();
        } else {
            this.f53202c.q();
        }
        if (this.f53215p) {
            this.f53204e.setVisibility(0);
        } else {
            this.f53204e.setVisibility(8);
        }
        a0();
        this.f53212m.notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void o0() {
        n0();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        com.join.mgps.listener.a.b().d(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showLodingFailed() {
        List<Object> list = this.f53213n;
        if (list == null || list.size() == 0) {
            c0();
        }
    }
}
