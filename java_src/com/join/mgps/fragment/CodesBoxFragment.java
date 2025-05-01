package com.join.mgps.fragment;

import android.content.ClipboardManager;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.Util.RequestBeanUtil;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.Util.l2;
import com.join.mgps.activity.GiftsDetailActivity_;
import com.join.mgps.customview.XListView2;
import com.join.mgps.dto.CommonRequestBean;
import com.join.mgps.dto.DetailResultBean;
import com.join.mgps.dto.GiftPackageBean;
import com.join.mgps.dto.GiftPackageDataInfoBean;
import com.join.mgps.dto.GiftPackageDataOperationBean;
import com.join.mgps.dto.GiftPackageOperationBean;
import com.join.mgps.ptr.PtrClassicFrameLayout;
import java.util.ArrayList;
import java.util.List;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
@EFragment(R.layout.fragment_codesbox)
/* loaded from: classes.dex */
public class CodesBoxFragment extends Fragment {

    /* renamed from: b  reason: collision with root package name */
    com.join.mgps.rpc.e f50247b;
    @ViewById

    /* renamed from: c  reason: collision with root package name */
    LinearLayout f50248c;
    @ViewById

    /* renamed from: d  reason: collision with root package name */
    LinearLayout f50249d;
    @ViewById

    /* renamed from: e  reason: collision with root package name */
    PtrClassicFrameLayout f50250e;
    @ViewById

    /* renamed from: f  reason: collision with root package name */
    XListView2 f50251f;
    @ViewById

    /* renamed from: g  reason: collision with root package name */
    ListView f50252g;

    /* renamed from: h  reason: collision with root package name */
    int f50253h;

    /* renamed from: i  reason: collision with root package name */
    private TextView f50254i;

    /* renamed from: j  reason: collision with root package name */
    private Context f50255j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f50256k;

    /* renamed from: l  reason: collision with root package name */
    private int f50257l;

    /* renamed from: m  reason: collision with root package name */
    private int f50258m;

    /* renamed from: n  reason: collision with root package name */
    private List<GiftPackageDataInfoBean> f50259n;

    /* renamed from: o  reason: collision with root package name */
    private List<GiftPackageDataInfoBean> f50260o;

    /* renamed from: p  reason: collision with root package name */
    private com.join.mgps.adapter.c f50261p;

    /* renamed from: q  reason: collision with root package name */
    private com.join.mgps.adapter.d f50262q;

    /* renamed from: r  reason: collision with root package name */
    private RelativeLayout f50263r;

    /* renamed from: s  reason: collision with root package name */
    private com.join.mgps.customview.o f50264s;

    /* renamed from: t  reason: collision with root package name */
    private DownloadTask f50265t;

    /* renamed from: u  reason: collision with root package name */
    private TextView f50266u;

    /* renamed from: v  reason: collision with root package name */
    Handler f50267v = new a();

    /* renamed from: w  reason: collision with root package name */
    private Button f50268w;

    /* loaded from: classes3.dex */
    class a extends Handler {
        a() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            com.wufan.user.service.protobuf.n0 accountData = AccountUtil_.getInstance_(CodesBoxFragment.this.f50255j.getApplicationContext()).getAccountData();
            if (IntentUtil.getInstance().goLoginNetGame(CodesBoxFragment.this.f50255j)) {
                return;
            }
            CodesBoxFragment.this.d0(accountData, (GiftPackageDataInfoBean) message.obj);
        }
    }

    /* loaded from: classes3.dex */
    class b implements com.join.mgps.customview.f {
        b() {
        }

        @Override // com.join.mgps.customview.f
        public void onLoadMore() {
            if (CodesBoxFragment.this.f50256k) {
                return;
            }
            CodesBoxFragment.this.c0();
        }
    }

    /* loaded from: classes3.dex */
    class c implements com.join.mgps.customview.g {
        c() {
        }

        @Override // com.join.mgps.customview.g
        public void onRefresh() {
            if (CodesBoxFragment.this.f50256k) {
                return;
            }
            CodesBoxFragment.this.f50257l = 1;
            CodesBoxFragment.this.c0();
        }
    }

    /* loaded from: classes3.dex */
    class d implements AdapterView.OnItemClickListener {
        d() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i4, long j4) {
            if (i4 > CodesBoxFragment.this.f50259n.size() || i4 < 0) {
                return;
            }
            GiftsDetailActivity_.P0(CodesBoxFragment.this.f50255j).c((GiftPackageDataInfoBean) CodesBoxFragment.this.f50259n.get(i4)).a(CodesBoxFragment.this.f50253h).start();
        }
    }

    /* loaded from: classes3.dex */
    class e implements View.OnClickListener {
        e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class f implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ GiftPackageDataOperationBean f50274b;

        f(GiftPackageDataOperationBean giftPackageDataOperationBean) {
            this.f50274b = giftPackageDataOperationBean;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ((ClipboardManager) CodesBoxFragment.this.f50255j.getSystemService("clipboard")).setText(this.f50274b.getGift_info().getGift_package_code());
            l2 a5 = l2.a(CodesBoxFragment.this.f50255j);
            a5.b(this.f50274b.getGift_info().getGift_package_code() + "已复制到剪贴板");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class g implements View.OnClickListener {
        g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (CodesBoxFragment.this.f50264s == null || !CodesBoxFragment.this.f50264s.isShowing()) {
                return;
            }
            CodesBoxFragment.this.f50264s.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class h implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DetailResultBean f50277b;

        h(DetailResultBean detailResultBean) {
            this.f50277b = detailResultBean;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (CodesBoxFragment.this.f50264s != null && CodesBoxFragment.this.f50264s.isShowing()) {
                CodesBoxFragment.this.f50264s.dismiss();
            }
            int status = CodesBoxFragment.this.f50265t != null ? CodesBoxFragment.this.f50265t.getStatus() : 0;
            DetailResultBean detailResultBean = this.f50277b;
            if (detailResultBean != null && UtilsMy.w0(detailResultBean.getPay_tag_info(), this.f50277b.getCrc_sign_id()) > 0) {
                status = 43;
            }
            if (status != 0) {
                if (status == 5) {
                    UtilsMy.T3(CodesBoxFragment.this.f50255j, CodesBoxFragment.this.f50265t);
                    return;
                } else if (status != 9 && status != 43) {
                    return;
                }
            }
            DetailResultBean detailResultBean2 = this.f50277b;
            if (detailResultBean2 != null) {
                if (UtilsMy.y0(detailResultBean2.getPay_tag_info(), this.f50277b.getCrc_sign_id()) > 0) {
                    UtilsMy.d4(CodesBoxFragment.this.getActivity(), CodesBoxFragment.this.f50265t.getCrc_link_type_val());
                } else {
                    UtilsMy.z1(CodesBoxFragment.this.f50265t, this.f50277b);
                    if (!UtilsMy.o1(CodesBoxFragment.this.f50255j, CodesBoxFragment.this.f50265t)) {
                        if (this.f50277b.getDown_status() == 5) {
                            UtilsMy.l1(CodesBoxFragment.this.f50255j, CodesBoxFragment.this.f50265t);
                        } else {
                            UtilsMy.R0(CodesBoxFragment.this.f50255j, CodesBoxFragment.this.f50265t, this.f50277b.getTp_down_url(), this.f50277b.getOther_down_switch(), this.f50277b.getCdn_down_switch());
                        }
                    }
                }
            }
            CodesBoxFragment.this.f50265t.setStatus(2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterViews() {
        this.f50247b = com.join.mgps.rpc.impl.d.P1();
        this.f50257l = 1;
        com.join.mgps.Util.d0.a().d(this);
        this.f50251f.setPreLoadCount(10);
        this.f50251f.setPullLoadEnable(new b());
        this.f50251f.setPullRefreshEnable(new c());
        this.f50251f.setOnItemClickListener(new d());
        this.f50258m = 20;
        this.f50259n = new ArrayList();
        this.f50260o = new ArrayList();
        this.f50261p = new com.join.mgps.adapter.c(this.f50255j, this.f50259n);
        this.f50262q = new com.join.mgps.adapter.d(this.f50255j, this.f50260o, this.f50267v);
        View inflate = LayoutInflater.from(this.f50255j).inflate(R.layout.codes_box_header, (ViewGroup) null);
        this.f50263r = (RelativeLayout) inflate.findViewById(R.id.emptyGiftPackageLayout);
        this.f50254i = (TextView) inflate.findViewById(R.id.textview_gift_get);
        this.f50263r.setOnClickListener(new e());
        this.f50251f.setAdapter((ListAdapter) this.f50261p);
        this.f50252g.addHeaderView(inflate);
        this.f50252g.setAdapter((ListAdapter) this.f50262q);
        h0();
        c0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void c0() {
        if (com.join.android.app.common.utils.j.j(this.f50255j)) {
            this.f50256k = true;
            try {
                try {
                    GiftPackageBean L0 = this.f50247b.L0(e0(this.f50257l));
                    if (L0 != null && L0.getFlag().equals("1")) {
                        List<GiftPackageDataInfoBean> user = L0.getMessages().getData().getUser();
                        List<GiftPackageDataInfoBean> recommend = L0.getMessages().getData().getRecommend();
                        if (user != null && user.size() > 0) {
                            this.f50257l++;
                            showMain(user);
                        } else if (recommend != null && this.f50257l == 1) {
                            this.f50260o.clear();
                            this.f50260o.addAll(recommend);
                            showMain();
                        } else {
                            g0();
                        }
                    } else {
                        g0();
                    }
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
                return;
            } finally {
                this.f50256k = false;
                i0();
            }
        }
        g0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void d0(com.wufan.user.service.protobuf.n0 n0Var, GiftPackageDataInfoBean giftPackageDataInfoBean) {
        try {
            if (com.join.android.app.common.utils.j.j(this.f50255j)) {
                try {
                    GiftPackageOperationBean f02 = this.f50247b.f0(RequestBeanUtil.getInstance(this.f50255j.getApplicationContext()).getGiftPackageOperationRequestBean(n0Var.getUid(), giftPackageDataInfoBean.getGift_package_id(), giftPackageDataInfoBean.getGift_package_game_id()));
                    if (f02 != null) {
                        if (f02.getFlag().equals("0")) {
                            String error_info = f02.getError_info();
                            if (error_info == null || !f02.getCode().equals("1001")) {
                                return;
                            }
                            showToast(error_info);
                            return;
                        }
                        List<GiftPackageDataOperationBean> data = f02.getMessages().getData();
                        if (data == null || data.size() <= 0) {
                            return;
                        }
                        GiftPackageDataOperationBean giftPackageDataOperationBean = data.get(0);
                        giftPackageDataInfoBean.setGift_package_status(1);
                        for (int i4 = 0; i4 < this.f50259n.size(); i4++) {
                            GiftPackageDataInfoBean giftPackageDataInfoBean2 = this.f50259n.get(i4);
                            if (giftPackageDataInfoBean.getGift_package_id() == giftPackageDataInfoBean2.getGift_package_id()) {
                                giftPackageDataInfoBean2.setGift_package_status(1);
                                giftPackageDataInfoBean2.setGift_package_overdue(giftPackageDataInfoBean.getGift_package_overdue());
                            }
                        }
                        List<GiftPackageDataInfoBean> list = this.f50260o;
                        if (list != null && list.size() > 0) {
                            c0();
                        }
                        f0(giftPackageDataOperationBean);
                    }
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
            }
        } finally {
            showToast("领取失败");
        }
    }

    public CommonRequestBean e0(int i4) {
        return RequestBeanUtil.getInstance(this.f50255j.getApplicationContext()).getGiftPackageRequestBean(this.f50253h, i4, this.f50258m, "");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0186  */
    @org.androidannotations.annotations.UiThread
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void f0(com.join.mgps.dto.GiftPackageDataOperationBean r11) {
        /*
            Method dump skipped, instructions count: 429
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.mgps.fragment.CodesBoxFragment.f0(com.join.mgps.dto.GiftPackageDataOperationBean):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void g0() {
        try {
            if (this.f50257l == 1) {
                this.f50263r.setVisibility(8);
                this.f50248c.setVisibility(8);
                this.f50249d.setVisibility(0);
                this.f50250e.setVisibility(8);
            } else {
                this.f50251f.setNoMore();
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void h0() {
        try {
            this.f50263r.setVisibility(8);
            this.f50248c.setVisibility(0);
            this.f50249d.setVisibility(8);
            this.f50250e.setVisibility(8);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void i0() {
        this.f50251f.v();
        this.f50251f.u();
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        this.f50255j = context;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f50253h = arguments.getInt("uid");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        com.join.mgps.Util.d0.a().e(this);
        com.join.mgps.customview.o oVar = this.f50264s;
        if (oVar != null && oVar.isShowing()) {
            this.f50264s.dismiss();
        }
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        this.f50255j = null;
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onEventMainThread(com.join.mgps.event.n nVar) {
        DownloadTask a5 = nVar.a();
        if (a5 == null || this.f50265t == null || !a5.getCrc_link_type_val().equals(this.f50265t.getCrc_link_type_val())) {
            return;
        }
        this.f50265t = a5;
        int c5 = nVar.c();
        if (c5 != 5) {
            if (c5 == 8) {
                DownloadTask downloadTask = this.f50265t;
                if (downloadTask == null || downloadTask.getPath() == null) {
                    return;
                }
                UtilsMy.x4(this.f50265t);
                return;
            } else if (c5 != 11 && c5 != 48) {
                return;
            }
        }
        if (this.f50265t == null || !a5.getCrc_link_type_val().equals(this.f50265t.getCrc_link_type_val())) {
            return;
        }
        this.f50265t = a5;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void relodingimag() {
        this.f50257l = 1;
        h0();
        c0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void setNetwork() {
        Context context = this.f50255j;
        if (context != null) {
            UtilsMy.w3(context);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showMain() {
        if (this.f50255j == null) {
            return;
        }
        try {
            this.f50263r.setVisibility(0);
            this.f50248c.setVisibility(8);
            this.f50249d.setVisibility(8);
            this.f50250e.setVisibility(8);
            this.f50252g.setVisibility(0);
            this.f50262q.notifyDataSetChanged();
            if (this.f50260o.size() == 0) {
                this.f50254i.setText(this.f50255j.getResources().getString(R.string.mygift_no));
            } else {
                this.f50254i.setText(this.f50255j.getResources().getString(R.string.mygift_recommend));
            }
        } catch (Resources.NotFoundException e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showToast(String str) {
        Context context = this.f50255j;
        if (context != null) {
            l2.a(context).b(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showMain(List<GiftPackageDataInfoBean> list) {
        if (this.f50255j == null) {
            return;
        }
        if (this.f50257l == 2) {
            this.f50259n.clear();
        }
        try {
            this.f50263r.setVisibility(8);
            this.f50248c.setVisibility(8);
            this.f50249d.setVisibility(8);
            this.f50250e.setVisibility(0);
            this.f50252g.setVisibility(8);
            if (list.size() > 0) {
                this.f50259n.addAll(list);
                if (list.size() < this.f50257l) {
                    this.f50251f.setNoMore();
                }
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        this.f50261p.notifyDataSetChanged();
    }
}
