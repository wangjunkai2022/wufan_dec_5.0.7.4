package com.join.mgps.activity;

import android.content.ClipboardManager;
import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import com.BaseFragmentActivity;
import com.facebook.drawee.view.SimpleDraweeView;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.Util.RequestBeanUtil;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.customview.CustomerDownloadView;
import com.join.mgps.customview.XListView2;
import com.join.mgps.dto.CollectionBeanSub;
import com.join.mgps.dto.CommonRequestBean;
import com.join.mgps.dto.DetialMoreGameInfo;
import com.join.mgps.dto.GamedetialMoreGiftData;
import com.join.mgps.dto.GiftPackageDataInfoBean;
import com.join.mgps.dto.GiftPackageDataOperationBean;
import com.join.mgps.dto.GiftPackageOperationBean;
import com.join.mgps.dto.ResultMessageBean;
import com.join.mgps.ptr.PtrClassicFrameLayout;
import com.papa.sim.statistic.Where;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.Extra;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
import org.androidannotations.annotations.res.StringRes;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
@EActivity(R.layout.category_collection_rank)
/* loaded from: classes.dex */
public class GameDetialGiftMoreActivity extends BaseFragmentActivity implements AbsListView.OnScrollListener {
    private com.wufan.user.service.protobuf.n0 B;
    private CollectionBeanSub C;
    private com.join.mgps.customview.o E;
    private com.join.mgps.customview.o F;
    private DownloadTask G;
    private View H;

    /* renamed from: b  reason: collision with root package name */
    private Context f31675b;

    /* renamed from: c  reason: collision with root package name */
    private List<GiftPackageDataInfoBean> f31676c;

    /* renamed from: d  reason: collision with root package name */
    private com.join.mgps.adapter.l0 f31677d;
    @ViewById

    /* renamed from: e  reason: collision with root package name */
    PtrClassicFrameLayout f31678e;
    @ViewById

    /* renamed from: f  reason: collision with root package name */
    TextView f31679f;
    @ViewById

    /* renamed from: g  reason: collision with root package name */
    XListView2 f31680g;
    @ViewById

    /* renamed from: h  reason: collision with root package name */
    LinearLayout f31681h;
    @ViewById

    /* renamed from: i  reason: collision with root package name */
    LinearLayout f31682i;
    @ViewById

    /* renamed from: j  reason: collision with root package name */
    ImageView f31683j;
    @ViewById

    /* renamed from: k  reason: collision with root package name */
    ImageView f31684k;
    @ViewById(R.id.title_normal_search_img)

    /* renamed from: l  reason: collision with root package name */
    ImageView f31685l;
    @ViewById(R.id.title_normal_download_cdv)

    /* renamed from: m  reason: collision with root package name */
    CustomerDownloadView f31686m;

    /* renamed from: n  reason: collision with root package name */
    com.join.mgps.rpc.e f31687n;
    @StringRes(resName = "net_excption")

    /* renamed from: o  reason: collision with root package name */
    String f31688o;
    @StringRes(resName = "connect_server_excption")

    /* renamed from: p  reason: collision with root package name */
    String f31689p;
    @Extra

    /* renamed from: r  reason: collision with root package name */
    String f31691r;

    /* renamed from: s  reason: collision with root package name */
    List<DownloadTask> f31692s;

    /* renamed from: q  reason: collision with root package name */
    private int f31690q = 1;

    /* renamed from: t  reason: collision with root package name */
    private int f31693t = 0;

    /* renamed from: u  reason: collision with root package name */
    private Map<String, DownloadTask> f31694u = new ConcurrentHashMap();

    /* renamed from: v  reason: collision with root package name */
    Map<String, DownloadTask> f31695v = new HashMap();

    /* renamed from: w  reason: collision with root package name */
    Map<String, DownloadTask> f31696w = new HashMap();

    /* renamed from: x  reason: collision with root package name */
    private String f31697x = "";

    /* renamed from: y  reason: collision with root package name */
    private int f31698y = 0;

    /* renamed from: z  reason: collision with root package name */
    private boolean f31699z = false;
    private int A = 0;
    Handler D = new b();
    private boolean I = true;
    private boolean J = false;
    com.join.mgps.customview.o K = null;
    com.join.mgps.customview.o L = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DownloadTask F;
            if (GameDetialGiftMoreActivity.this.E != null && GameDetialGiftMoreActivity.this.E.isShowing()) {
                GameDetialGiftMoreActivity.this.E.dismiss();
            }
            int status = GameDetialGiftMoreActivity.this.G != null ? GameDetialGiftMoreActivity.this.G.getStatus() : 0;
            if (GameDetialGiftMoreActivity.this.C != null && UtilsMy.w0(GameDetialGiftMoreActivity.this.C.getPay_tag_info(), GameDetialGiftMoreActivity.this.C.getCrc_sign_id()) > 0) {
                status = 43;
            }
            if (status != 0) {
                if (status == 5) {
                    UtilsMy.T3(GameDetialGiftMoreActivity.this.f31675b, GameDetialGiftMoreActivity.this.G);
                    return;
                } else if (status != 9 && status != 43) {
                    return;
                }
            }
            GameDetialGiftMoreActivity.this.G.setKeyword(Where.detail.name());
            if (com.join.mgps.Util.g2.i(GameDetialGiftMoreActivity.this.G.getCrc_link_type_val()) && (F = p1.f.K().F(GameDetialGiftMoreActivity.this.G.getCrc_link_type_val())) != null) {
                UtilsMy.y4(GameDetialGiftMoreActivity.this.G, F);
            }
            if (GameDetialGiftMoreActivity.this.C != null) {
                if (UtilsMy.y0(GameDetialGiftMoreActivity.this.C.getPay_tag_info(), GameDetialGiftMoreActivity.this.C.getCrc_sign_id()) > 0) {
                    UtilsMy.d4(GameDetialGiftMoreActivity.this.f31675b, GameDetialGiftMoreActivity.this.G.getCrc_link_type_val());
                } else {
                    UtilsMy.y1(GameDetialGiftMoreActivity.this.G, GameDetialGiftMoreActivity.this.C);
                    if (!UtilsMy.o1(GameDetialGiftMoreActivity.this.f31675b, GameDetialGiftMoreActivity.this.G)) {
                        if (GameDetialGiftMoreActivity.this.C.getDown_status() == 5) {
                            UtilsMy.l1(GameDetialGiftMoreActivity.this.f31675b, GameDetialGiftMoreActivity.this.G);
                        } else {
                            UtilsMy.R0(GameDetialGiftMoreActivity.this.f31675b, GameDetialGiftMoreActivity.this.G, GameDetialGiftMoreActivity.this.C.getTp_down_url(), GameDetialGiftMoreActivity.this.C.getOther_down_switch(), GameDetialGiftMoreActivity.this.C.getCdn_down_switch());
                        }
                    }
                }
            }
            GameDetialGiftMoreActivity.this.G.setStatus(2);
        }
    }

    /* loaded from: classes4.dex */
    class b extends Handler {
        b() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            GameDetialGiftMoreActivity gameDetialGiftMoreActivity = GameDetialGiftMoreActivity.this;
            gameDetialGiftMoreActivity.B = AccountUtil_.getInstance_(gameDetialGiftMoreActivity.getApplicationContext()).getAccountData();
            int i4 = message.what;
            if (i4 != 2) {
                if (i4 == 3 && !IntentUtil.getInstance().goLoginNetGame(GameDetialGiftMoreActivity.this.f31675b)) {
                    GiftPackageDataInfoBean giftPackageDataInfoBean = (GiftPackageDataInfoBean) message.obj;
                    if (GameDetialGiftMoreActivity.this.p0(giftPackageDataInfoBean.getGift_package_type())) {
                        GameDetialGiftMoreActivity.this.s0(giftPackageDataInfoBean);
                    }
                }
            } else if (IntentUtil.getInstance().goLoginNetGame(GameDetialGiftMoreActivity.this.f31675b)) {
            } else {
                GameDetialGiftMoreActivity.this.x0((GiftPackageDataInfoBean) message.obj);
            }
        }
    }

    /* loaded from: classes4.dex */
    class c implements com.join.mgps.customview.f {
        c() {
        }

        @Override // com.join.mgps.customview.f
        public void onLoadMore() {
            if (GameDetialGiftMoreActivity.this.f31699z) {
                return;
            }
            GameDetialGiftMoreActivity.this.t0();
        }
    }

    /* loaded from: classes4.dex */
    class d implements com.join.mgps.customview.g {
        d() {
        }

        @Override // com.join.mgps.customview.g
        public void onRefresh() {
            if (GameDetialGiftMoreActivity.this.f31699z) {
                return;
            }
            GameDetialGiftMoreActivity.this.f31690q = 1;
            GameDetialGiftMoreActivity.this.t0();
        }
    }

    /* loaded from: classes4.dex */
    class e implements AdapterView.OnItemClickListener {
        e() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i4, long j4) {
            if (GameDetialGiftMoreActivity.this.J) {
                i4--;
            }
            if (i4 > GameDetialGiftMoreActivity.this.f31676c.size() || i4 < 0) {
                return;
            }
            GiftPackageDataInfoBean giftPackageDataInfoBean = (GiftPackageDataInfoBean) GameDetialGiftMoreActivity.this.f31676c.get(i4);
            com.wufan.user.service.protobuf.n0 accountData = AccountUtil_.getInstance_(GameDetialGiftMoreActivity.this.f31675b).getAccountData();
            if (accountData == null) {
                GiftsDetailActivity_.P0(GameDetialGiftMoreActivity.this.f31675b).c(giftPackageDataInfoBean).start();
            } else {
                GiftsDetailActivity_.P0(GameDetialGiftMoreActivity.this.f31675b).c(giftPackageDataInfoBean).a(accountData.getUid()).start();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class f implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ GiftPackageDataInfoBean f31705b;

        f(GiftPackageDataInfoBean giftPackageDataInfoBean) {
            this.f31705b = giftPackageDataInfoBean;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ((ClipboardManager) GameDetialGiftMoreActivity.this.f31675b.getSystemService("clipboard")).setText(this.f31705b.getGift_package_code());
            com.join.mgps.Util.l2 a5 = com.join.mgps.Util.l2.a(GameDetialGiftMoreActivity.this.f31675b);
            a5.b(this.f31705b.getGift_package_code() + "已复制到剪贴板");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class g implements View.OnClickListener {
        g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (GameDetialGiftMoreActivity.this.E == null || !GameDetialGiftMoreActivity.this.E.isShowing()) {
                return;
            }
            GameDetialGiftMoreActivity.this.E.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class h implements View.OnClickListener {
        h() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DownloadTask F;
            if (GameDetialGiftMoreActivity.this.E != null && GameDetialGiftMoreActivity.this.E.isShowing()) {
                GameDetialGiftMoreActivity.this.E.dismiss();
            }
            int status = GameDetialGiftMoreActivity.this.G != null ? GameDetialGiftMoreActivity.this.G.getStatus() : 0;
            if (GameDetialGiftMoreActivity.this.C != null && UtilsMy.w0(GameDetialGiftMoreActivity.this.C.getPay_tag_info(), GameDetialGiftMoreActivity.this.C.getCrc_sign_id()) > 0) {
                status = 43;
            }
            if (status != 0) {
                if (status == 5) {
                    UtilsMy.T3(GameDetialGiftMoreActivity.this.f31675b, GameDetialGiftMoreActivity.this.G);
                    return;
                } else if (status != 9 && status != 43) {
                    return;
                }
            }
            GameDetialGiftMoreActivity.this.G.setKeyword(Where.detail.name());
            if (com.join.mgps.Util.g2.i(GameDetialGiftMoreActivity.this.G.getCrc_link_type_val()) && (F = p1.f.K().F(GameDetialGiftMoreActivity.this.G.getCrc_link_type_val())) != null) {
                UtilsMy.y4(GameDetialGiftMoreActivity.this.G, F);
            }
            if (GameDetialGiftMoreActivity.this.C != null) {
                if (UtilsMy.y0(GameDetialGiftMoreActivity.this.C.getPay_tag_info(), GameDetialGiftMoreActivity.this.C.getCrc_sign_id()) > 0) {
                    UtilsMy.d4(GameDetialGiftMoreActivity.this.f31675b, GameDetialGiftMoreActivity.this.G.getCrc_link_type_val());
                } else {
                    UtilsMy.y1(GameDetialGiftMoreActivity.this.G, GameDetialGiftMoreActivity.this.C);
                    if (!UtilsMy.o1(GameDetialGiftMoreActivity.this.f31675b, GameDetialGiftMoreActivity.this.G)) {
                        if (GameDetialGiftMoreActivity.this.C.getDown_status() == 5) {
                            UtilsMy.l1(GameDetialGiftMoreActivity.this.f31675b, GameDetialGiftMoreActivity.this.G);
                        } else {
                            UtilsMy.R0(GameDetialGiftMoreActivity.this.f31675b, GameDetialGiftMoreActivity.this.G, GameDetialGiftMoreActivity.this.C.getTp_down_url(), GameDetialGiftMoreActivity.this.C.getOther_down_switch(), GameDetialGiftMoreActivity.this.C.getCdn_down_switch());
                        }
                    }
                }
            }
            GameDetialGiftMoreActivity.this.G.setStatus(2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class i implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ GiftPackageDataOperationBean f31709b;

        i(GiftPackageDataOperationBean giftPackageDataOperationBean) {
            this.f31709b = giftPackageDataOperationBean;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ((ClipboardManager) GameDetialGiftMoreActivity.this.f31675b.getSystemService("clipboard")).setText(this.f31709b.getGift_info().getGift_package_code());
            com.join.mgps.Util.l2 a5 = com.join.mgps.Util.l2.a(GameDetialGiftMoreActivity.this.f31675b);
            a5.b(this.f31709b.getGift_info().getGift_package_code() + "已复制到剪贴板");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class j implements View.OnClickListener {
        j() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (GameDetialGiftMoreActivity.this.E == null || !GameDetialGiftMoreActivity.this.E.isShowing()) {
                return;
            }
            GameDetialGiftMoreActivity.this.E.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean p0(String str) {
        if (com.join.mgps.Util.g2.h(str)) {
            com.join.mgps.Util.l2.a(this.f31675b).b(this.f31675b.getString(R.string.unknow_gift_type));
            return false;
        }
        com.wufan.user.service.protobuf.n0 accountData = AccountUtil_.getInstance_(this.f31675b).getAccountData();
        if (str.equals("6")) {
            if (!com.join.mgps.Util.b.piv(accountData)) {
                B0();
                return false;
            }
        } else if (str.equals("7") && accountData.j1() <= 0) {
            A0();
            return false;
        }
        return true;
    }

    private void q0() {
        com.join.mgps.customview.o oVar = this.K;
        if (oVar == null || !oVar.isShowing()) {
            return;
        }
        this.K.dismiss();
    }

    private void r0() {
        com.join.mgps.customview.o oVar = this.L;
        if (oVar == null || !oVar.isShowing()) {
            return;
        }
        this.L.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void A0() {
        com.join.mgps.customview.o oVar = this.K;
        if (oVar != null) {
            if (oVar.isShowing()) {
                return;
            }
        } else {
            this.K = com.join.mgps.Util.b0.f0(this.f31675b).c0(this.f31675b);
        }
        this.K.show();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void B0() {
        com.join.mgps.customview.o oVar = this.L;
        if (oVar != null) {
            if (oVar.isShowing()) {
                return;
            }
        } else {
            this.L = com.join.mgps.Util.b0.f0(this.f31675b).e0(this.f31675b);
        }
        this.L.show();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void C0() {
        IntentUtil.getInstance().goMyGameManagerActivity(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void D0() {
        SearchHintActivity_.G1(this.f31675b).start();
        com.papa.sim.statistic.p.l(this.f31675b).u2(Where.modufour, AccountUtil_.getInstance_(this.f31675b).getUid());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void E0() {
        this.f31680g.v();
        this.f31680g.u();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterViews() {
        this.f31687n = com.join.mgps.rpc.impl.d.P1();
        this.f31675b = this;
        getDownloadTaskInfo();
        com.join.mgps.Util.d0.a().d(this.f31675b);
        this.G = p1.f.K().F(this.f31691r);
        this.H = LayoutInflater.from(this.f31675b).inflate(R.layout.gamedetial_more_gift_top_layout, (ViewGroup) null);
        com.join.mgps.adapter.l0 l0Var = new com.join.mgps.adapter.l0(this.f31675b, this.D);
        this.f31677d = l0Var;
        this.f31676c = l0Var.b();
        this.f31679f.setText("礼包");
        showLoding();
        this.f31680g.setPreLoadCount(10);
        this.f31680g.setPullLoadEnable(new c());
        this.f31680g.setPullRefreshEnable(new d());
        this.f31680g.setOnItemClickListener(new e());
        this.f31680g.setOnScrollListener(this);
        this.f31680g.setAdapter((ListAdapter) this.f31677d);
        t0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void back_image() {
        finish();
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x001c, code lost:
        if (r4 != 11) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void changeDownloadTaskNumber(com.github.snowdream.android.app.downloader.DownloadTask r3, int r4) {
        /*
            r2 = this;
            if (r3 != 0) goto L3
            return
        L3:
            java.lang.String r0 = r3.getCrc_link_type_val()
            r1 = 2
            if (r4 == r1) goto L8d
            r1 = 3
            if (r4 == r1) goto L7f
            r1 = 5
            if (r4 == r1) goto L64
            r1 = 6
            if (r4 == r1) goto L56
            r1 = 7
            if (r4 == r1) goto L3b
            r1 = 10
            if (r4 == r1) goto L20
            r3 = 11
            if (r4 == r3) goto L71
            goto La7
        L20:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r4 = r2.f31695v
            boolean r4 = r4.containsKey(r0)
            if (r4 != 0) goto L2d
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r4 = r2.f31695v
            r4.put(r0, r3)
        L2d:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r4 = r2.f31696w
            boolean r4 = r4.containsKey(r0)
            if (r4 != 0) goto La7
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r4 = r2.f31696w
            r4.put(r0, r3)
            goto La7
        L3b:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.f31695v
            boolean r3 = r3.containsKey(r0)
            if (r3 == 0) goto L48
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.f31695v
            r3.remove(r0)
        L48:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.f31696w
            boolean r3 = r3.containsKey(r0)
            if (r3 == 0) goto La7
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.f31696w
            r3.remove(r0)
            goto La7
        L56:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.f31696w
            boolean r3 = r3.containsKey(r0)
            if (r3 == 0) goto La7
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.f31696w
            r3.remove(r0)
            goto La7
        L64:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.f31695v
            boolean r3 = r3.containsKey(r0)
            if (r3 == 0) goto L71
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.f31695v
            r3.remove(r0)
        L71:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.f31696w
            boolean r3 = r3.containsKey(r0)
            if (r3 == 0) goto La7
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.f31696w
            r3.remove(r0)
            goto La7
        L7f:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.f31696w
            boolean r3 = r3.containsKey(r0)
            if (r3 == 0) goto La7
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.f31696w
            r3.remove(r0)
            goto La7
        L8d:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r4 = r2.f31695v
            boolean r4 = r4.containsKey(r0)
            if (r4 != 0) goto L9a
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r4 = r2.f31695v
            r4.put(r0, r3)
        L9a:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r4 = r2.f31696w
            boolean r4 = r4.containsKey(r0)
            if (r4 != 0) goto La7
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r4 = r2.f31696w
            r4.put(r0, r3)
        La7:
            r2.updateDownloadView()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.mgps.activity.GameDetialGiftMoreActivity.changeDownloadTaskNumber(com.github.snowdream.android.app.downloader.DownloadTask, int):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void getDownloadTaskInfo() {
        List<DownloadTask> r4 = p1.f.K().r();
        List<DownloadTask> q4 = p1.f.K().q();
        if (q4 != null && q4.size() > 0) {
            for (DownloadTask downloadTask : q4) {
                this.f31695v.put(downloadTask.getCrc_link_type_val(), downloadTask);
            }
        }
        if (r4 != null && r4.size() > 0) {
            for (DownloadTask downloadTask2 : r4) {
                this.f31696w.put(downloadTask2.getCrc_link_type_val(), downloadTask2);
            }
        }
        updateDownloadView();
    }

    @Override // com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        com.join.mgps.Util.d0.a().e(this.f31675b);
        super.onDestroy();
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onEventMainThread(com.join.mgps.event.n nVar) {
        DownloadTask a5 = nVar.a();
        if (a5 == null || this.G == null || !a5.getCrc_link_type_val().equals(this.G.getCrc_link_type_val())) {
            return;
        }
        this.G = a5;
        int c5 = nVar.c();
        if ((c5 == 5 || c5 == 11 || c5 == 48) && this.G != null && a5.getCrc_link_type_val().equals(this.G.getCrc_link_type_val())) {
            this.G = a5;
        }
    }

    @Override // com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        this.B = AccountUtil_.getInstance_(this.f31675b).getAccountData();
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(AbsListView absListView, int i4, int i5, int i6) {
        this.f31693t = (i5 + i4) - 1;
        this.f31698y = i4;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(AbsListView absListView, int i4) {
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void relodingimag() {
        this.f31690q = 1;
        showLoding();
        t0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void s0(GiftPackageDataInfoBean giftPackageDataInfoBean) {
        try {
            if (com.join.android.app.common.utils.j.j(this.f31675b)) {
                try {
                    GiftPackageOperationBean f02 = this.f31687n.f0(RequestBeanUtil.getInstance(getApplicationContext()).getGiftPackageOperationRequestBean(this.B.getUid(), giftPackageDataInfoBean.getGift_package_id(), this.f31691r));
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
                        List<GiftPackageDataInfoBean> list = this.f31676c;
                        for (int i4 = 0; i4 < list.size(); i4++) {
                            GiftPackageDataInfoBean giftPackageDataInfoBean2 = list.get(i4);
                            if (giftPackageDataInfoBean.getGift_package_id() == giftPackageDataInfoBean2.getGift_package_id()) {
                                giftPackageDataInfoBean2.setGift_package_status(1);
                                giftPackageDataInfoBean2.setGift_package_overdue(giftPackageDataOperationBean.getGift_info().getGift_package_overdue());
                                giftPackageDataInfoBean2.setGift_package_code(giftPackageDataOperationBean.getGift_info().getGift_package_code());
                            }
                        }
                        y0(giftPackageDataOperationBean);
                    }
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
            }
        } finally {
            showToast("领取失败");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void setNetwork() {
        UtilsMy.w3(this.f31675b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showLoding() {
        this.f31681h.setVisibility(0);
        this.f31682i.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showLodingFailed() {
        List<GiftPackageDataInfoBean> list = this.f31676c;
        if (list == null || list.size() == 0) {
            this.f31682i.setVisibility(0);
            this.f31681h.setVisibility(8);
            this.f31678e.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showToast(String str) {
        com.join.mgps.Util.l2.a(this.f31675b).b(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void t0() {
        int uid;
        new ArrayList();
        if (com.join.android.app.common.utils.j.j(this.f31675b)) {
            this.f31699z = true;
            try {
                try {
                    com.wufan.user.service.protobuf.n0 n0Var = this.B;
                    if (n0Var != null) {
                        uid = n0Var.getUid();
                    } else {
                        com.wufan.user.service.protobuf.n0 accountData = AccountUtil_.getInstance_(this.f31675b).getAccountData();
                        this.B = accountData;
                        uid = accountData.getUid();
                    }
                    ResultMessageBean<GamedetialMoreGiftData> messages = this.f31687n.X(u0(this.f31691r, this.f31690q, 0, uid)).getMessages();
                    if (messages != null) {
                        GamedetialMoreGiftData data = messages.getData();
                        if (data != null) {
                            if (data.getGift_list() != null && data.getGift_list().size() == 0) {
                                w0();
                            } else if (data.getGift_list() != null && data.getGift_list().size() > 0) {
                                this.f31690q++;
                            }
                            z0(data);
                            E0();
                        } else {
                            w0();
                        }
                    } else {
                        E0();
                        showLodingFailed();
                    }
                } catch (Exception e5) {
                    e5.printStackTrace();
                    E0();
                    showLodingFailed();
                }
                return;
            } finally {
                this.f31699z = false;
            }
        }
        E0();
        showLodingFailed();
    }

    public CommonRequestBean u0(String str, int i4, int i5, int i6) {
        return RequestBeanUtil.getInstance(this.f31675b).getDetialImfMore(str, i4, i5, i6);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void updateDownloadView() {
        int size = this.f31695v.size();
        int size2 = this.f31696w.size();
        this.f31686m.setDownloadGameNum(size);
        if (size2 > 0) {
            this.f31686m.d();
        } else {
            this.f31686m.g();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void v0() {
        this.f31690q = 1;
        t0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void w0() {
        this.f31680g.setNoMore();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void x0(GiftPackageDataInfoBean giftPackageDataInfoBean) {
        CollectionBeanSub collectionBeanSub;
        com.join.mgps.customview.o oVar;
        com.join.mgps.customview.o oVar2 = this.E;
        if (oVar2 != null && oVar2.isShowing()) {
            this.E.dismiss();
            this.E = null;
        }
        com.join.mgps.customview.o oVar3 = new com.join.mgps.customview.o(this.f31675b, R.style.MyDialog);
        this.E = oVar3;
        oVar3.setContentView(R.layout.save_code_dialog);
        Button button = (Button) this.E.findViewById(R.id.dialog_button_cancle);
        Button button2 = (Button) this.E.findViewById(R.id.dialog_button_ok);
        ((LinearLayout) this.E.findViewById(R.id.layoutTop)).setVisibility(8);
        ((LinearLayout) this.E.findViewById(R.id.layoutBottom)).setVisibility(0);
        TextView textView = (TextView) this.E.findViewById(R.id.moneyText);
        ((TextView) this.E.findViewById(R.id.tip_title)).setText("领号成功");
        ((TextView) this.E.findViewById(R.id.saveCodeContent)).setText(giftPackageDataInfoBean.getGift_package_code());
        button2.setText("关闭");
        button.setText("下载游戏");
        ((TextView) this.E.findViewById(R.id.dialog_time)).setText(com.join.mgps.Util.y.v(giftPackageDataInfoBean.getGift_package_times_end()));
        ((TextView) this.E.findViewById(R.id.saveCodeTv)).setOnClickListener(new f(giftPackageDataInfoBean));
        button2.setOnClickListener(new g());
        DownloadTask downloadTask = this.G;
        int status = downloadTask != null ? downloadTask.getStatus() : 0;
        if (UtilsMy.w0(this.C.getPay_tag_info(), this.C.getCrc_sign_id()) > 0) {
            status = 43;
        }
        if (status != 0) {
            if (status == 5) {
                button.setText("启动游戏");
            } else if (status != 9 && status != 43) {
                button.setText("下载中..");
            }
            collectionBeanSub = this.C;
            if (collectionBeanSub != null && collectionBeanSub.getDown_status() == 2) {
                button.setEnabled(false);
                button.setText("即将开放");
            }
            button.setOnClickListener(new h());
            oVar = this.E;
            if (oVar != null || oVar.isShowing()) {
            }
            this.E.show();
            return;
        }
        button.setText("下载游戏");
        CollectionBeanSub collectionBeanSub2 = this.C;
        if (collectionBeanSub2 != null) {
            UtilsMy.w0(collectionBeanSub2.getPay_tag_info(), this.C.getCrc_sign_id());
            UtilsMy.r3(button, this.C.getDown_status(), this.C.getPay_tag_info(), this.C.getCrc_sign_id());
            button.setBackgroundColor(-1);
            UtilsMy.k3(this.C.getSp_tag_info(), textView);
        }
        collectionBeanSub = this.C;
        if (collectionBeanSub != null) {
            button.setEnabled(false);
            button.setText("即将开放");
        }
        button.setOnClickListener(new h());
        oVar = this.E;
        if (oVar != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void y0(GiftPackageDataOperationBean giftPackageDataOperationBean) {
        CollectionBeanSub collectionBeanSub;
        com.join.mgps.customview.o oVar;
        com.join.mgps.customview.o oVar2 = this.E;
        if (oVar2 != null && oVar2.isShowing()) {
            this.E.dismiss();
            this.E = null;
        }
        com.join.mgps.customview.o oVar3 = new com.join.mgps.customview.o(this.f31675b, R.style.MyDialog);
        this.E = oVar3;
        oVar3.setContentView(R.layout.save_code_dialog);
        Button button = (Button) this.E.findViewById(R.id.dialog_button_cancle);
        Button button2 = (Button) this.E.findViewById(R.id.dialog_button_ok);
        TextView textView = (TextView) this.E.findViewById(R.id.moneyText);
        ((TextView) this.E.findViewById(R.id.tip_title)).setText("领号成功");
        ((TextView) this.E.findViewById(R.id.saveCodeContent)).setText(giftPackageDataOperationBean.getGift_info().getGift_package_code());
        button2.setText("关闭");
        button.setText("下载游戏");
        ((TextView) this.E.findViewById(R.id.saveCodeTv)).setOnClickListener(new i(giftPackageDataOperationBean));
        button2.setOnClickListener(new j());
        DownloadTask downloadTask = this.G;
        int status = downloadTask != null ? downloadTask.getStatus() : 0;
        if (giftPackageDataOperationBean.getGame_info() != null && UtilsMy.w0(giftPackageDataOperationBean.getGame_info().getPay_tag_info(), giftPackageDataOperationBean.getGame_info().getCrc_sign_id()) > 0) {
            status = 43;
        }
        if (status != 0) {
            if (status == 5) {
                button.setText("启动游戏");
            } else if (status != 9 && status != 43) {
                button.setText("下载中..");
            }
            collectionBeanSub = this.C;
            if (collectionBeanSub != null && collectionBeanSub.getDown_status() == 2) {
                button.setEnabled(false);
                button.setText("即将开放");
            }
            button.setOnClickListener(new a());
            this.f31677d.notifyDataSetChanged();
            oVar = this.E;
            if (oVar != null || oVar.isShowing()) {
            }
            this.E.show();
            return;
        }
        button.setText("下载游戏");
        if (giftPackageDataOperationBean.getGame_info() != null) {
            UtilsMy.w0(giftPackageDataOperationBean.getGame_info().getPay_tag_info(), giftPackageDataOperationBean.getGame_info().getCrc_sign_id());
            UtilsMy.r3(button, giftPackageDataOperationBean.getGame_info().getDown_status(), giftPackageDataOperationBean.getGame_info().getPay_tag_info(), giftPackageDataOperationBean.getGame_info().getCrc_sign_id());
            button.setBackgroundColor(-1);
            UtilsMy.k3(giftPackageDataOperationBean.getGame_info().getSp_tag_info(), textView);
        }
        collectionBeanSub = this.C;
        if (collectionBeanSub != null) {
            button.setEnabled(false);
            button.setText("即将开放");
        }
        button.setOnClickListener(new a());
        this.f31677d.notifyDataSetChanged();
        oVar = this.E;
        if (oVar != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void z0(GamedetialMoreGiftData gamedetialMoreGiftData) {
        if (gamedetialMoreGiftData == null || gamedetialMoreGiftData.getGift_list() == null || gamedetialMoreGiftData.getGift_list().size() == 0) {
            return;
        }
        this.f31682i.setVisibility(8);
        this.f31681h.setVisibility(8);
        this.f31678e.setVisibility(0);
        if (this.f31690q == 2) {
            this.f31676c.clear();
            DetialMoreGameInfo game_info = gamedetialMoreGiftData.getGame_info();
            this.C = game_info;
            TextView textView = this.f31679f;
            textView.setText(this.C.getGame_name() + "礼包");
            LinearLayout linearLayout = (LinearLayout) this.H.findViewById(R.id.tipsLayout);
            MyImageLoader.h((SimpleDraweeView) this.H.findViewById(R.id.appIcon), game_info.getIco_remote());
            ((TextView) this.H.findViewById(R.id.appName)).setText(game_info.getGame_name());
            ((TextView) this.H.findViewById(R.id.appSize)).setText("礼包总数：" + game_info.getGift_package_count());
            UtilsMy.I(game_info.getScore(), game_info.getDown_count(), game_info.getSize(), game_info.getSp_tag_info(), game_info.getTag_info(), linearLayout, this.f31675b);
            if (this.I) {
                this.G = game_info.getDownloadtaskDown();
                this.f31680g.addHeaderView(this.H);
                this.J = true;
                this.I = false;
            }
        }
        this.f31676c.addAll(gamedetialMoreGiftData.getGift_list());
        if (this.f31690q == 2) {
            this.f31676c.size();
            this.f31677d.notifyDataSetChanged();
            return;
        }
        this.f31677d.notifyDataSetChanged();
    }
}
