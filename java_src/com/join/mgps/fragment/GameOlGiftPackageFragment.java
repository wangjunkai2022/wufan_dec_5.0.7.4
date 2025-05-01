package com.join.mgps.fragment;

import android.app.Activity;
import android.content.ClipboardManager;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.Util.RequestBeanUtil;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.Util.g2;
import com.join.mgps.Util.l2;
import com.join.mgps.activity.GiftsDetailActivity_;
import com.join.mgps.adapter.l1;
import com.join.mgps.customview.XListView2;
import com.join.mgps.dto.CommonRequestBean;
import com.join.mgps.dto.DetailResultBean;
import com.join.mgps.dto.GiftPackageDataInfoBean;
import com.join.mgps.dto.GiftPackageDataOperationBean;
import com.join.mgps.dto.GiftPackageOperationBean;
import com.join.mgps.dto.ResultMainBean;
import com.join.mgps.ptr.PtrClassicFrameLayout;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
@EFragment(R.layout.game_online_first_layout)
/* loaded from: classes3.dex */
public class GameOlGiftPackageFragment extends Fragment implements AbsListView.OnScrollListener {
    @ViewById

    /* renamed from: b  reason: collision with root package name */
    PtrClassicFrameLayout f51827b;
    @ViewById

    /* renamed from: c  reason: collision with root package name */
    XListView2 f51828c;
    @ViewById

    /* renamed from: d  reason: collision with root package name */
    LinearLayout f51829d;
    @ViewById

    /* renamed from: e  reason: collision with root package name */
    LinearLayout f51830e;
    @ViewById

    /* renamed from: f  reason: collision with root package name */
    ImageView f51831f;

    /* renamed from: g  reason: collision with root package name */
    com.join.mgps.rpc.e f51832g;

    /* renamed from: h  reason: collision with root package name */
    private Activity f51833h;

    /* renamed from: j  reason: collision with root package name */
    private List<DownloadTask> f51835j;

    /* renamed from: m  reason: collision with root package name */
    List<v1.a<GiftPackageDataInfoBean>> f51838m;

    /* renamed from: n  reason: collision with root package name */
    private int f51839n;

    /* renamed from: o  reason: collision with root package name */
    private int f51840o;

    /* renamed from: q  reason: collision with root package name */
    private l1 f51842q;

    /* renamed from: t  reason: collision with root package name */
    private TextView f51845t;

    /* renamed from: u  reason: collision with root package name */
    private com.wufan.user.service.protobuf.n0 f51846u;

    /* renamed from: v  reason: collision with root package name */
    private com.join.mgps.customview.o f51847v;

    /* renamed from: w  reason: collision with root package name */
    private com.join.mgps.dialog.d1 f51848w;

    /* renamed from: i  reason: collision with root package name */
    private boolean f51834i = false;

    /* renamed from: k  reason: collision with root package name */
    private Map<String, DownloadTask> f51836k = new ConcurrentHashMap();

    /* renamed from: l  reason: collision with root package name */
    private int f51837l = 1;

    /* renamed from: p  reason: collision with root package name */
    private boolean f51841p = false;

    /* renamed from: r  reason: collision with root package name */
    private Handler f51843r = new a();

    /* renamed from: s  reason: collision with root package name */
    com.join.mgps.customview.o f51844s = null;

    /* renamed from: x  reason: collision with root package name */
    private boolean f51849x = true;

    /* renamed from: y  reason: collision with root package name */
    com.join.mgps.customview.o f51850y = null;

    /* renamed from: z  reason: collision with root package name */
    com.join.mgps.customview.o f51851z = null;

    /* loaded from: classes3.dex */
    class a extends Handler {
        a() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (IntentUtil.getInstance().goLoginNetGame(GameOlGiftPackageFragment.this.f51833h)) {
                return;
            }
            GiftPackageDataInfoBean giftPackageDataInfoBean = (GiftPackageDataInfoBean) message.obj;
            if (GameOlGiftPackageFragment.this.e0(giftPackageDataInfoBean.getGift_package_type())) {
                if (GameOlGiftPackageFragment.this.f51848w != null) {
                    GameOlGiftPackageFragment.this.f51848w.b();
                }
                GameOlGiftPackageFragment.this.i0(giftPackageDataInfoBean, message.what);
            }
        }
    }

    /* loaded from: classes3.dex */
    class b implements com.join.mgps.customview.g {
        b() {
        }

        @Override // com.join.mgps.customview.g
        public void onRefresh() {
            if (GameOlGiftPackageFragment.this.f51834i) {
                return;
            }
            GameOlGiftPackageFragment.this.f51837l = 1;
            GameOlGiftPackageFragment.this.f51849x = true;
            GameOlGiftPackageFragment.this.j0();
        }
    }

    /* loaded from: classes3.dex */
    class c implements com.join.mgps.customview.f {
        c() {
        }

        @Override // com.join.mgps.customview.f
        public void onLoadMore() {
            if (GameOlGiftPackageFragment.this.f51834i) {
                return;
            }
            GameOlGiftPackageFragment.this.j0();
        }
    }

    /* loaded from: classes3.dex */
    class d implements AdapterView.OnItemClickListener {
        d() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i4, long j4) {
            GiftPackageDataInfoBean c5;
            if (i4 > GameOlGiftPackageFragment.this.f51838m.size() || i4 < 0 || (c5 = GameOlGiftPackageFragment.this.f51838m.get(i4).c()) == null) {
                return;
            }
            if (AccountUtil_.getInstance_(GameOlGiftPackageFragment.this.f51833h).getAccountData() == null) {
                IntentUtil.getInstance().goLoginNetGame(GameOlGiftPackageFragment.this.f51833h);
            } else {
                GiftsDetailActivity_.P0(GameOlGiftPackageFragment.this.f51833h).c(c5).start();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class e implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ GiftPackageDataOperationBean f51856b;

        e(GiftPackageDataOperationBean giftPackageDataOperationBean) {
            this.f51856b = giftPackageDataOperationBean;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ((ClipboardManager) GameOlGiftPackageFragment.this.f51833h.getSystemService("clipboard")).setText(this.f51856b.getGift_info().getGift_package_code());
            l2 a5 = l2.a(GameOlGiftPackageFragment.this.f51833h);
            a5.b(this.f51856b.getGift_info().getGift_package_code() + "已复制到剪贴板");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class f implements View.OnClickListener {
        f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (GameOlGiftPackageFragment.this.f51847v == null || !GameOlGiftPackageFragment.this.f51847v.isShowing()) {
                return;
            }
            GameOlGiftPackageFragment.this.f51847v.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class g implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DownloadTask f51859b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ DetailResultBean f51860c;

        g(DownloadTask downloadTask, DetailResultBean detailResultBean) {
            this.f51859b = downloadTask;
            this.f51860c = detailResultBean;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (GameOlGiftPackageFragment.this.f51847v != null && GameOlGiftPackageFragment.this.f51847v.isShowing()) {
                GameOlGiftPackageFragment.this.f51847v.dismiss();
            }
            int status = this.f51859b.getStatus();
            if (status != 0) {
                if (status == 5) {
                    UtilsMy.T3(GameOlGiftPackageFragment.this.f51833h, this.f51859b);
                    return;
                } else if (status != 9) {
                    return;
                }
            }
            if (UtilsMy.o1(GameOlGiftPackageFragment.this.f51833h, this.f51859b)) {
                return;
            }
            if (this.f51860c.getDown_status() == 5) {
                UtilsMy.l1(GameOlGiftPackageFragment.this.f51833h, this.f51859b);
                return;
            }
            com.php25.PDownload.d.c(this.f51859b, GameOlGiftPackageFragment.this.f51833h);
            this.f51859b.setStatus(2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean e0(String str) {
        if (g2.h(str)) {
            l2.a(this.f51833h).b(this.f51833h.getString(R.string.unknow_gift_type));
            return false;
        }
        com.wufan.user.service.protobuf.n0 accountData = AccountUtil_.getInstance_(this.f51833h).getAccountData();
        if (str.equals("6")) {
            if (!com.join.mgps.Util.b.piv(accountData)) {
                q0();
                return false;
            }
        } else if (str.equals("7") && accountData.j1() <= 0) {
            p0();
            return false;
        }
        return true;
    }

    private void f0() {
        com.join.mgps.customview.o oVar = this.f51844s;
        if (oVar == null || !oVar.isShowing()) {
            return;
        }
        this.f51844s.dismiss();
    }

    private void g0() {
        com.join.mgps.customview.o oVar = this.f51850y;
        if (oVar == null || !oVar.isShowing()) {
            return;
        }
        this.f51850y.dismiss();
    }

    private void h0() {
        com.join.mgps.customview.o oVar = this.f51851z;
        if (oVar == null || !oVar.isShowing()) {
            return;
        }
        this.f51851z.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void d0() {
        this.f51832g = com.join.mgps.rpc.impl.d.P1();
        this.f51833h = getActivity();
        List<DownloadTask> d5 = p1.f.K().d();
        this.f51835j = d5;
        if (d5 != null && d5.size() > 0) {
            for (DownloadTask downloadTask : this.f51835j) {
                this.f51836k.put(downloadTask.getCrc_link_type_val(), downloadTask);
                com.join.mgps.Util.v0.d("infoo", this.f51835j.size() + " tasksiz     mapsize  " + downloadTask.getStatus());
                com.join.mgps.Util.v0.d("infoo", downloadTask.toString());
            }
        }
        l1 l1Var = new l1(this.f51833h, this.f51843r);
        this.f51842q = l1Var;
        this.f51838m = l1Var.d();
        this.f51828c.setPreLoadCount(10);
        this.f51828c.setPullRefreshEnable(new b());
        this.f51828c.setPullLoadEnable(new c());
        this.f51828c.setOnItemClickListener(new d());
        this.f51828c.setOnScrollListener(this);
        this.f51828c.setAdapter((ListAdapter) this.f51842q);
        this.f51848w = com.join.mgps.Util.b0.f0(this.f51833h).x(this.f51833h);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void i0(GiftPackageDataInfoBean giftPackageDataInfoBean, int i4) {
        try {
            if (com.join.android.app.common.utils.j.j(this.f51833h)) {
                try {
                    GiftPackageOperationBean f02 = this.f51832g.f0(RequestBeanUtil.getInstance(this.f51833h).getGiftPackageOperationRequestBean(this.f51846u.getUid(), giftPackageDataInfoBean.getGift_package_id(), giftPackageDataInfoBean.getGift_package_game_id()));
                    if (f02 != null) {
                        if (f02.getFlag().equals("0")) {
                            String error_info = f02.getError_info();
                            if (error_info != null && f02.getCode().equals("1001")) {
                                showToast(error_info);
                            }
                            return;
                        }
                        List<GiftPackageDataOperationBean> data = f02.getMessages().getData();
                        if (data != null && data.size() > 0) {
                            GiftPackageDataOperationBean giftPackageDataOperationBean = data.get(0);
                            giftPackageDataInfoBean.setGift_package_status(1);
                            for (v1.a<GiftPackageDataInfoBean> aVar : this.f51838m) {
                                if (aVar.c() != null && aVar.c().getGift_package_id() == giftPackageDataInfoBean.getGift_package_id()) {
                                    aVar.c().setGift_package_status(1);
                                }
                            }
                            DetailResultBean game_info = giftPackageDataOperationBean.getGame_info();
                            DownloadTask downloadtaskDown = game_info != null ? game_info.getDownloadtaskDown() : null;
                            DownloadTask F = p1.f.K().F(downloadtaskDown.getCrc_link_type_val());
                            if (F != null) {
                                o0(giftPackageDataOperationBean, F, i4);
                            } else {
                                o0(giftPackageDataOperationBean, downloadtaskDown, i4);
                            }
                        } else {
                            showToast("领取失败");
                        }
                    } else {
                        showToast("领取失败");
                    }
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
                return;
            }
            showToast("领取失败");
        } finally {
            l0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void j0() {
        if (com.join.android.app.common.utils.j.j(this.f51833h)) {
            this.f51834i = true;
            try {
                try {
                    ResultMainBean<List<GiftPackageDataInfoBean>> t4 = this.f51832g.t(k0(this.f51837l));
                    if (t4 != null && t4.getFlag() == 1) {
                        List<GiftPackageDataInfoBean> data = t4.getMessages().getData();
                        if (data != null) {
                            ArrayList arrayList = new ArrayList();
                            if (data.size() > 0) {
                                String str = "";
                                for (GiftPackageDataInfoBean giftPackageDataInfoBean : data) {
                                    long gift_package_times_begin = giftPackageDataInfoBean.getGift_package_times_begin() * 1000;
                                    if (!str.equals(com.join.mgps.Util.y.k(gift_package_times_begin))) {
                                        str = com.join.mgps.Util.y.k(gift_package_times_begin);
                                        v1.a<GiftPackageDataInfoBean> aVar = new v1.a<>();
                                        aVar.i(1);
                                        aVar.j(str);
                                        arrayList.add(aVar);
                                    }
                                    v1.a<GiftPackageDataInfoBean> aVar2 = new v1.a<>();
                                    aVar2.i(2);
                                    aVar2.h(giftPackageDataInfoBean);
                                    arrayList.add(aVar2);
                                }
                                if (data.size() < 10) {
                                    n0();
                                }
                            } else {
                                n0();
                            }
                            this.f51837l++;
                            showMain(arrayList);
                            r0();
                        } else if (this.f51837l == 1) {
                            showLodingFailed();
                        } else {
                            n0();
                        }
                    } else if (this.f51837l == 1) {
                        showLodingFailed();
                        r0();
                    } else {
                        r0();
                        n0();
                    }
                } catch (Exception e5) {
                    e5.printStackTrace();
                    r0();
                    showLodingFailed();
                }
                return;
            } finally {
                this.f51834i = false;
            }
        }
        r0();
        showLodingFailed();
    }

    public CommonRequestBean k0(int i4) {
        com.wufan.user.service.protobuf.n0 accountData = AccountUtil_.getInstance_(this.f51833h).getAccountData();
        return RequestBeanUtil.getInstance(this.f51833h).getGameOLGiftRequest(i4, 20, accountData != null ? accountData.getUid() : 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void l0() {
        com.join.mgps.dialog.d1 d1Var = this.f51848w;
        if (d1Var != null) {
            d1Var.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void m0() {
        this.f51837l = 1;
        j0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void n0() {
        this.f51828c.setNoMore();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void o0(GiftPackageDataOperationBean giftPackageDataOperationBean, DownloadTask downloadTask, int i4) {
        this.f51842q.notifyDataSetChanged();
        com.join.mgps.customview.o oVar = new com.join.mgps.customview.o(this.f51833h, R.style.MyDialog);
        this.f51847v = oVar;
        oVar.setContentView(R.layout.save_code_dialog);
        Button button = (Button) this.f51847v.findViewById(R.id.dialog_button_cancle);
        Button button2 = (Button) this.f51847v.findViewById(R.id.dialog_button_ok);
        LinearLayout linearLayout = (LinearLayout) this.f51847v.findViewById(R.id.layoutTop);
        LinearLayout linearLayout2 = (LinearLayout) this.f51847v.findViewById(R.id.layoutBottom);
        TextView textView = (TextView) this.f51847v.findViewById(R.id.tip_title);
        TextView textView2 = (TextView) this.f51847v.findViewById(R.id.saveCodeTv);
        TextView textView3 = (TextView) this.f51847v.findViewById(R.id.saveCodeContent);
        TextView textView4 = (TextView) this.f51847v.findViewById(R.id.dialog_time);
        this.f51845t = (TextView) this.f51847v.findViewById(R.id.moneyText);
        if (i4 == 1) {
            linearLayout.setVisibility(0);
            linearLayout2.setVisibility(8);
            textView.setText("领号成功");
        } else if (i4 == 2) {
            textView.setText("已领取");
            linearLayout.setVisibility(8);
            linearLayout2.setVisibility(0);
            textView4.setText(com.join.mgps.Util.y.x(giftPackageDataOperationBean.getGift_info().getGift_package_times_end()));
        }
        DetailResultBean game_info = giftPackageDataOperationBean.getGame_info();
        textView3.setText(giftPackageDataOperationBean.getGift_info().getGift_package_code());
        button2.setText("关闭");
        button.setText("下载游戏");
        textView2.setOnClickListener(new e(giftPackageDataOperationBean));
        button2.setOnClickListener(new f());
        if (downloadTask != null) {
            int status = downloadTask.getStatus();
            if (status != 0) {
                if (status == 5) {
                    button.setText("启动游戏");
                } else if (status != 9) {
                    button.setText("下载中..");
                }
                button.setOnClickListener(new g(downloadTask, game_info));
            }
            button.setText("下载游戏");
            if (game_info != null) {
                UtilsMy.k3(game_info.getSp_tag_info(), this.f51845t);
            }
            button.setOnClickListener(new g(downloadTask, game_info));
        }
        com.join.mgps.customview.o oVar2 = this.f51847v;
        if (oVar2 == null || oVar2.isShowing()) {
            return;
        }
        this.f51847v.show();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        g0();
        h0();
        com.join.mgps.dialog.d1 d1Var = this.f51848w;
        if (d1Var != null) {
            d1Var.dismiss();
        }
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.f51846u = AccountUtil_.getInstance_(this.f51833h).getAccountData();
        this.f51837l = 1;
        showLoding();
        j0();
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(AbsListView absListView, int i4, int i5, int i6) {
        this.f51839n = (i5 + i4) - 1;
        this.f51840o = i4;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(AbsListView absListView, int i4) {
        this.f51841p = i4 != 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void p0() {
        com.join.mgps.customview.o oVar = this.f51850y;
        if (oVar != null) {
            if (oVar.isShowing()) {
                return;
            }
        } else {
            this.f51850y = com.join.mgps.Util.b0.f0(this.f51833h).c0(this.f51833h);
        }
        this.f51850y.show();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void q0() {
        com.join.mgps.customview.o oVar = this.f51851z;
        if (oVar != null) {
            if (oVar.isShowing()) {
                return;
            }
        } else {
            this.f51851z = com.join.mgps.Util.b0.f0(this.f51833h).e0(this.f51833h);
        }
        this.f51851z.show();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void r0() {
        this.f51828c.u();
        this.f51828c.v();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void relodingimag() {
        this.f51837l = 1;
        showLoding();
        j0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void setNetwork() {
        UtilsMy.w3(getActivity());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showLoding() {
        this.f51829d.setVisibility(0);
        this.f51830e.setVisibility(8);
        this.f51827b.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showLodingFailed() {
        List<v1.a<GiftPackageDataInfoBean>> list = this.f51838m;
        if (list == null || list.size() == 0) {
            this.f51830e.setVisibility(0);
            this.f51829d.setVisibility(8);
            this.f51827b.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showMain(List<v1.a<GiftPackageDataInfoBean>> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        this.f51830e.setVisibility(8);
        this.f51829d.setVisibility(8);
        this.f51827b.setVisibility(0);
        if (this.f51837l == 2) {
            this.f51838m.clear();
        }
        this.f51838m.addAll(list);
        if (this.f51837l == 2) {
            this.f51838m.size();
        }
        com.join.mgps.Util.v0.d("infoo", this.f51838m.size() + "   showMain");
        this.f51842q.notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showToast(String str) {
        l2.a(this.f51833h).b(str);
    }
}
