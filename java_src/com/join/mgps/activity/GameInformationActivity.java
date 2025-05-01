package com.join.mgps.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.http.SslError;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.JavascriptInterface;
import android.webkit.SslErrorHandler;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.BaseActivity;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.facebook.drawee.view.SimpleDraweeView;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.android.app.common.utils.APKUtils;
import com.join.android.app.common.utils.JsonMapper;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.IntentDateBean;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.Util.RequestBeanUtil;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.adapter.FullScreenActivity;
import com.join.mgps.adapter.FullScreenActivity_;
import com.join.mgps.adapter.GameCommentAdapter;
import com.join.mgps.customview.CustomerDownloadView;
import com.join.mgps.customview.ObservableWebView;
import com.join.mgps.customview.SmartScrollView;
import com.join.mgps.customview.WrapContentListView;
import com.join.mgps.db.tables.PurchasedListTable;
import com.join.mgps.dto.CollectionBeanSub;
import com.join.mgps.dto.DetailResultBean;
import com.join.mgps.dto.ExtBean;
import com.join.mgps.dto.GameInformationBean;
import com.join.mgps.dto.GameInformationCommentRequest;
import com.join.mgps.dto.InformationCommentBack;
import com.join.mgps.dto.InformationCommentBean;
import com.join.mgps.dto.InformationCommentBeanV2;
import com.join.mgps.dto.PariseBackData;
import com.join.mgps.dto.PariseRequest;
import com.join.mgps.dto.ResultMainBean;
import com.join.mgps.dto.ShareBean;
import com.join.mgps.enums.ConstantIntEnum;
import com.join.mgps.enums.Dtype;
import com.papa.sim.statistic.Where;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.Extra;
import org.androidannotations.annotations.Receiver;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
import org.androidannotations.annotations.res.StringRes;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
@EActivity(R.layout.game_information_layout)
/* loaded from: classes.dex */
public class GameInformationActivity extends BaseActivity {
    @ViewById
    ImageView A;
    private GameCommentAdapter A1;
    @ViewById
    LinearLayout B;
    private List<GameCommentAdapter.l> B1;
    @ViewById(R.id.title_normal_download_cdv)
    CustomerDownloadView C;
    private List<InformationCommentBean> C1;
    @Extra
    String D;
    private WrapContentListView D1;
    @Extra
    String E;
    @Extra
    ExtBean F;
    @Extra
    boolean G;
    private boolean I;
    private GameInformationBean J;
    private DownloadTask K;
    @ViewById
    TextView L;
    @ViewById
    TextView M;
    @ViewById
    TextView N;
    @ViewById
    TextView O;
    @ViewById
    TextView P;
    @ViewById
    LinearLayout Q;
    @ViewById
    LinearLayout R;
    @ViewById
    LinearLayout S;
    @ViewById
    TextView T;
    private Context U;
    private DetailResultBean V;
    private long W;
    private int Y;
    private com.wufan.user.service.protobuf.n0 Z;

    /* renamed from: b  reason: collision with root package name */
    com.join.mgps.rpc.e f32076b;
    @StringRes(resName = "net_excption")

    /* renamed from: c  reason: collision with root package name */
    String f32077c;
    @StringRes(resName = "connect_server_excption")

    /* renamed from: d  reason: collision with root package name */
    String f32078d;
    @ViewById

    /* renamed from: e  reason: collision with root package name */
    TextView f32079e;
    @ViewById

    /* renamed from: f  reason: collision with root package name */
    SmartScrollView f32080f;
    @ViewById

    /* renamed from: g  reason: collision with root package name */
    ObservableWebView f32081g;
    @ViewById

    /* renamed from: h  reason: collision with root package name */
    RelativeLayout f32082h;
    @ViewById

    /* renamed from: i  reason: collision with root package name */
    RelativeLayout f32083i;
    @ViewById

    /* renamed from: j  reason: collision with root package name */
    RelativeLayout f32084j;
    @ViewById

    /* renamed from: k  reason: collision with root package name */
    LinearLayout f32085k;
    @ViewById

    /* renamed from: l  reason: collision with root package name */
    LinearLayout f32086l;
    @ViewById

    /* renamed from: m  reason: collision with root package name */
    SimpleDraweeView f32087m;
    @ViewById

    /* renamed from: n  reason: collision with root package name */
    SimpleDraweeView f32088n;
    @ViewById

    /* renamed from: o  reason: collision with root package name */
    TextView f32089o;
    @ViewById

    /* renamed from: p  reason: collision with root package name */
    TextView f32090p;

    /* renamed from: p0  reason: collision with root package name */
    private SimpleDraweeView f32091p0;
    @ViewById

    /* renamed from: q  reason: collision with root package name */
    TextView f32093q;
    @ViewById

    /* renamed from: r  reason: collision with root package name */
    TextView f32094r;
    @ViewById

    /* renamed from: s  reason: collision with root package name */
    TextView f32095s;
    @ViewById

    /* renamed from: t  reason: collision with root package name */
    TextView f32096t;
    @ViewById

    /* renamed from: u  reason: collision with root package name */
    Button f32097u;
    @ViewById

    /* renamed from: v  reason: collision with root package name */
    TextView f32098v;
    @ViewById

    /* renamed from: w  reason: collision with root package name */
    TextView f32100w;
    @ViewById

    /* renamed from: x  reason: collision with root package name */
    TextView f32101x;
    @ViewById

    /* renamed from: y  reason: collision with root package name */
    Button f32102y;
    @ViewById

    /* renamed from: z  reason: collision with root package name */
    ImageView f32103z;
    private String H = "";
    private Handler X = new Handler();

    /* renamed from: p1  reason: collision with root package name */
    Map<String, DownloadTask> f32092p1 = new HashMap();

    /* renamed from: v1  reason: collision with root package name */
    Map<String, DownloadTask> f32099v1 = new HashMap();
    com.join.mgps.customview.o E1 = null;

    /* loaded from: classes4.dex */
    class a implements SmartScrollView.a {
        a() {
        }

        @Override // com.join.mgps.customview.SmartScrollView.a
        public void a() {
            GameInformationActivity.this.G0();
        }

        @Override // com.join.mgps.customview.SmartScrollView.a
        public void b() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class b implements GameCommentAdapter.j {
        b() {
        }

        @Override // com.join.mgps.adapter.GameCommentAdapter.j
        public void a(InformationCommentBean informationCommentBean) {
            if (informationCommentBean.isHasPraised()) {
                com.join.mgps.Util.l2.a(GameInformationActivity.this.U).b("你已赞过");
            } else {
                GameInformationActivity.this.y0(informationCommentBean, null, null);
            }
        }

        @Override // com.join.mgps.adapter.GameCommentAdapter.j
        public void d() {
            GameInformationActivity.this.G0();
        }

        @Override // com.join.mgps.adapter.GameCommentAdapter.j
        public void e(InformationCommentBean.Sub sub) {
            InformationCommentBeanV2 informationCommentBeanV2 = new InformationCommentBeanV2();
            informationCommentBeanV2.setCommentId(sub.getComment_id());
            informationCommentBeanV2.setUid(sub.getUser_id());
            informationCommentBeanV2.setNickname(sub.getUser_name());
            GameInformationCommentActivity_.P0(GameInformationActivity.this.U).b(GameInformationActivity.this.D).a(informationCommentBeanV2).start();
        }

        @Override // com.join.mgps.adapter.GameCommentAdapter.j
        public void f(InformationCommentBean informationCommentBean) {
            InformationCommentBeanV2 informationCommentBeanV2 = new InformationCommentBeanV2();
            informationCommentBeanV2.setCommentId(informationCommentBean.getComment_id());
            informationCommentBeanV2.setUid(informationCommentBean.getUser_id());
            informationCommentBeanV2.setNickname(informationCommentBean.getUser_name());
            GameInformationCommentActivity_.P0(GameInformationActivity.this.U).b(GameInformationActivity.this.D).a(informationCommentBeanV2).start();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class c {

        /* loaded from: classes4.dex */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                GameInformationCommentActivity_.P0(GameInformationActivity.this.U).b(GameInformationActivity.this.D).start();
            }
        }

        /* loaded from: classes4.dex */
        class b implements Runnable {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ String f32108b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ String f32109c;

            b(String str, String str2) {
                this.f32108b = str;
                this.f32109c = str2;
            }

            @Override // java.lang.Runnable
            public void run() {
                FullScreenActivity.VideoInfo videoInfo = new FullScreenActivity.VideoInfo();
                videoInfo.m(this.f32108b);
                videoInfo.h(this.f32109c);
                FullScreenActivity_.i0(GameInformationActivity.this.U).a(videoInfo).start();
            }
        }

        /* renamed from: com.join.mgps.activity.GameInformationActivity$c$c  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        class RunnableC0328c implements Runnable {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ String f32111b;

            RunnableC0328c(String str) {
                this.f32111b = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    IntentUtil.getInstance().intentActivity(GameInformationActivity.this, (IntentDateBean) JsonMapper.getInstance().fromJson(this.f32111b, IntentDateBean.class));
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
            }
        }

        c() {
        }

        @JavascriptInterface
        public void intentCommentList() {
            GameInformationActivity.this.X.post(new a());
        }

        @JavascriptInterface
        public void playVideo(String str, String str2) {
            GameInformationActivity.this.X.post(new b(str, str2));
        }

        @JavascriptInterface
        public void startIntent(String str) {
            GameInformationActivity.this.X.post(new RunnableC0328c(str));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class d extends WebViewClient {
        d() {
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            GameInformationActivity.this.Q.setVisibility(0);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            int primaryError = sslError.getPrimaryError();
            if (primaryError == 3 || primaryError == 5) {
                sslErrorHandler.proceed();
            }
            sslErrorHandler.cancel();
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class e implements View.OnClickListener {
        e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            new IntentDateBean();
            IntentUtil intentUtil = IntentUtil.getInstance();
            GameInformationActivity gameInformationActivity = GameInformationActivity.this;
            intentUtil.goGameDetialActivity(gameInformationActivity, gameInformationActivity.V.getCrc_sign_id(), GameInformationActivity.this.V.getGame_info_tpl_type(), GameInformationActivity.this.V.getSp_tpl_two_position(), 116);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class f implements View.OnClickListener {
        f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IntentUtil intentUtil = IntentUtil.getInstance();
            GameInformationActivity gameInformationActivity = GameInformationActivity.this;
            intentUtil.goGameDetialActivity(gameInformationActivity, gameInformationActivity.V.getCrc_sign_id(), GameInformationActivity.this.V.getGame_info_tpl_type(), GameInformationActivity.this.V.getSp_tpl_two_position(), 116);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class g implements View.OnClickListener {
        g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IntentUtil intentUtil = IntentUtil.getInstance();
            GameInformationActivity gameInformationActivity = GameInformationActivity.this;
            intentUtil.goGameDetialActivity(gameInformationActivity, gameInformationActivity.V.getCrc_sign_id(), GameInformationActivity.this.V.getGame_info_tpl_type(), GameInformationActivity.this.V.getSp_tpl_two_position(), 116);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class h implements View.OnClickListener {
        h() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GameInformationCommentActivity_.P0(GameInformationActivity.this.U).b(GameInformationActivity.this.D).start();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class i implements View.OnClickListener {
        i() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (IntentUtil.getInstance().goLoginInteractive(GameInformationActivity.this.U)) {
                return;
            }
            GameInformationCommentActivity_.P0(GameInformationActivity.this.U).b(GameInformationActivity.this.D).start();
        }
    }

    private void E0() {
        DownloadTask downloadTask = this.K;
        if (downloadTask == null) {
            return;
        }
        int status = downloadTask != null ? downloadTask.getStatus() : 0;
        String plugin_num = this.K.getPlugin_num();
        if (plugin_num.equals(ConstantIntEnum.H5.value() + "")) {
            this.f32102y.setBackgroundResource(R.drawable.download_blue_butn);
            this.f32102y.setText("打开");
        } else if (UtilsMy.w0(this.V.getPay_tag_info(), this.V.getCrc_sign_id()) > 0) {
            status = 43;
        }
        if (status != 0 && status != 43) {
            if (status == 48) {
                this.f32102y.setBackgroundResource(R.drawable.download_green_butn);
                this.f32102y.setText("安装中");
                return;
            } else if (status != 2) {
                if (status != 3) {
                    if (status == 5) {
                        this.f32102y.setBackgroundResource(R.drawable.download_maincolor_butn);
                        Button button = this.f32102y;
                        button.setText(button.getResources().getString(R.string.download_status_finished));
                        return;
                    } else if (status != 6) {
                        if (status != 7) {
                            switch (status) {
                                case 9:
                                    this.f32102y.setBackgroundResource(R.drawable.download_green_butn);
                                    this.f32102y.setText("更新");
                                    return;
                                case 10:
                                    this.f32102y.setBackgroundResource(R.drawable.download_blue_butn);
                                    this.f32102y.setText("等待");
                                    return;
                                case 11:
                                    this.f32102y.setBackgroundResource(R.drawable.download_green_butn);
                                    this.f32102y.setText("安装");
                                    return;
                                case 12:
                                    this.f32102y.setBackgroundResource(R.drawable.download_grey_butn);
                                    this.f32102y.setText("解压中");
                                    return;
                                case 13:
                                    this.f32102y.setBackgroundResource(R.drawable.download_blue_butn);
                                    this.f32102y.setText("解压");
                                    return;
                                default:
                                    return;
                            }
                        }
                    }
                }
                this.f32102y.setBackgroundResource(R.drawable.download_blue_butn);
                this.f32102y.setText("继续");
                return;
            } else {
                this.f32102y.setBackgroundResource(R.drawable.download_blue_butn);
                this.f32102y.setText("暂停");
                return;
            }
        }
        this.f32102y.setBackgroundResource(R.drawable.download_green_butn);
        if (UtilsMy.w0(this.V.getPay_tag_info(), this.V.getCrc_sign_id()) > 0) {
            this.f32102y.setText(this.U.getResources().getString(R.string.pay_game_amount, this.V.getPay_tag_info().getPayGameAmount()));
        } else {
            this.f32102y.setText(this.U.getResources().getString(R.string.download_status_download));
        }
        DetailResultBean detailResultBean = this.V;
        if (detailResultBean != null) {
            UtilsMy.w0(detailResultBean.getPay_tag_info(), this.V.getCrc_sign_id());
            UtilsMy.t3(this.f32102y, this.V);
        }
    }

    private void F0() {
        DownloadTask downloadTask = this.K;
        if (downloadTask == null) {
            return;
        }
        int status = downloadTask != null ? downloadTask.getStatus() : 0;
        String plugin_num = this.K.getPlugin_num();
        if (plugin_num.equals(ConstantIntEnum.H5.value() + "")) {
            this.f32102y.setBackgroundResource(R.drawable.download_blue_butn);
            this.f32102y.setText("打开");
        } else if (UtilsMy.w0(this.V.getPay_tag_info(), this.V.getCrc_sign_id()) > 0) {
            status = 43;
        }
        if (status != 0 && status != 43) {
            if (status == 48) {
                this.f32097u.setBackgroundResource(R.drawable.download_green_butn);
                this.f32097u.setText("安装中");
                return;
            } else if (status != 2) {
                if (status != 3) {
                    if (status == 5) {
                        this.f32097u.setBackgroundResource(R.drawable.download_maincolor_butn);
                        Button button = this.f32097u;
                        button.setText(button.getResources().getString(R.string.download_status_finished));
                        return;
                    } else if (status != 6) {
                        if (status != 7) {
                            switch (status) {
                                case 9:
                                    this.f32097u.setBackgroundResource(R.drawable.download_green_butn);
                                    this.f32097u.setText("更新");
                                    return;
                                case 10:
                                    this.f32097u.setBackgroundResource(R.drawable.download_blue_butn);
                                    this.f32097u.setText("等待");
                                    return;
                                case 11:
                                    this.f32097u.setBackgroundResource(R.drawable.download_green_butn);
                                    this.f32097u.setText("安装");
                                    return;
                                case 12:
                                    this.f32097u.setBackgroundResource(R.drawable.download_grey_butn);
                                    this.f32097u.setText("解压中");
                                    return;
                                case 13:
                                    this.f32097u.setBackgroundResource(R.drawable.download_blue_butn);
                                    this.f32097u.setText("解压");
                                    return;
                                default:
                                    return;
                            }
                        }
                    }
                }
                this.f32097u.setBackgroundResource(R.drawable.download_blue_butn);
                this.f32097u.setText("继续");
                return;
            } else {
                this.f32097u.setBackgroundResource(R.drawable.download_blue_butn);
                this.f32097u.setText("暂停");
                return;
            }
        }
        this.f32097u.setBackgroundResource(R.drawable.download_green_butn);
        if (v0(this.V) && !b2.e0.o().p(this.V.getCrc_sign_id())) {
            this.f32097u.setText(this.U.getResources().getString(R.string.pay_game_amount, this.V.getPay_tag_info().getPayGameAmount()));
        } else {
            this.f32097u.setText(this.U.getResources().getString(R.string.download_status_download));
        }
        DetailResultBean detailResultBean = this.V;
        if (detailResultBean != null) {
            UtilsMy.w0(detailResultBean.getPay_tag_info(), this.V.getCrc_sign_id());
            UtilsMy.t3(this.f32097u, this.V);
        }
    }

    private void H0(InformationCommentBean informationCommentBean) {
        GameInformationBean gameInformationBean = this.J;
        if (gameInformationBean != null && gameInformationBean.getComment_switch() == 1) {
            s0(this.D);
        }
        if (this.C1 == null || informationCommentBean == null) {
            return;
        }
        boolean z4 = false;
        for (int i4 = 0; i4 < this.C1.size(); i4++) {
            InformationCommentBean informationCommentBean2 = this.C1.get(i4);
            if (informationCommentBean.getComment_id().equals(informationCommentBean2.getComment_id())) {
                if (informationCommentBean.isHasPraised() != informationCommentBean2.isHasPraised()) {
                    informationCommentBean2.setHasPraised(informationCommentBean.isHasPraised());
                    z4 |= true;
                }
                if (!informationCommentBean.getPraise_count().equals(informationCommentBean2.getPraise_count())) {
                    informationCommentBean2.setPraise_count(informationCommentBean.getPraise_count());
                    z4 |= true;
                }
                if (z4) {
                    break;
                }
            }
        }
        if (z4) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(this.C1);
            B0(arrayList);
        }
    }

    private com.wufan.user.service.protobuf.n0 accountBean(Context context) {
        return AccountUtil_.getInstance_(context).getAccountData();
    }

    private void p0() {
        com.join.mgps.customview.o oVar = this.E1;
        if (oVar == null || !oVar.isShowing()) {
            return;
        }
        this.E1.dismiss();
    }

    private void r0() {
        Activity splashActivity = IntentUtil.getInstance().getSplashActivity();
        if (splashActivity != null) {
            splashActivity.finish();
            IntentUtil.getInstance().setSplashActivity(null);
            Intent intent = new Intent();
            intent.setClass(splashActivity, MGMainActivity_.class);
            intent.setFlags(TTAdConstant.KEY_CLICK_AREA);
            intent.addFlags(536870912);
            startActivity(intent);
        }
        finish();
    }

    private void z0(ListView listView) {
        ListAdapter adapter;
        int i4;
        if (listView == null || (adapter = listView.getAdapter()) == null) {
            return;
        }
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < adapter.getCount(); i7++) {
            View childAt = this.D1.getChildAt(i7);
            if (childAt != null) {
                i4 = childAt.getHeight();
                if (i4 > i6) {
                    i6 = i4;
                }
            } else {
                i4 = 0;
            }
            if (i4 == 0) {
                View view = adapter.getView(i7, null, listView);
                view.measure(0, 0);
                i4 = view.getMeasuredHeight();
            }
            i5 += i4;
        }
        ViewGroup.LayoutParams layoutParams = listView.getLayoutParams();
        layoutParams.height = i5 + (listView.getDividerHeight() * (adapter.getCount() - 1));
        listView.setLayoutParams(layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread(delay = 1000)
    public void A0() {
        LayoutInflater from = LayoutInflater.from(this.U);
        TextView textView = this.O;
        textView.setText(this.Y + "条");
        this.P.setOnClickListener(new h());
        View inflate = from.inflate(R.layout.game_information_edit_message, (ViewGroup) null);
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) inflate.findViewById(R.id.usericonMe);
        this.f32091p0 = simpleDraweeView;
        simpleDraweeView.setImageResource(R.drawable.unloginstatus);
        com.wufan.user.service.protobuf.n0 n0Var = this.Z;
        if (n0Var != null) {
            UtilsMy.s3(this.U, n0Var.d0(), this.f32091p0);
        }
        this.B.addView(inflate);
        ((TextView) inflate.findViewById(R.id.message)).setOnClickListener(new i());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread(delay = 1000)
    public void B0(List<InformationCommentBean> list) {
        ArrayList arrayList = new ArrayList();
        this.C1 = arrayList;
        arrayList.addAll(list);
        if (this.D1 == null) {
            this.B1 = new ArrayList();
            this.D1 = new WrapContentListView(this);
            GameCommentAdapter gameCommentAdapter = new GameCommentAdapter(this.U, this.B1, new b());
            this.A1 = gameCommentAdapter;
            this.D1.setAdapter((ListAdapter) gameCommentAdapter);
            this.D1.setDivider(getResources().getDrawable(R.drawable.transparent_bg));
            this.D1.setLayoutParams(new ViewGroup.LayoutParams(-1, (com.join.android.app.common.utils.n.n(this.U).k(this) - this.R.getHeight()) - this.f32084j.getHeight()));
            this.B.addView(this.D1);
            this.B.addView(LayoutInflater.from(this.U).inflate(R.layout.game_detail_header, (ViewGroup) null));
        }
        this.B1.clear();
        j0(list);
        this.A1.notifyDataSetChanged();
        G0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void C0(GameInformationBean gameInformationBean) {
        this.f32103z.setVisibility(0);
        if (gameInformationBean.getComment_switch() == 1) {
            this.A.setVisibility(0);
            int comment_count = gameInformationBean.getComment_count();
            this.Y = comment_count;
            if (comment_count > 0) {
                this.T.setVisibility(0);
            }
            TextView textView = this.T;
            textView.setText(gameInformationBean.getComment_count() + "");
        } else {
            this.A.setVisibility(8);
            this.T.setVisibility(8);
        }
        this.S.setVisibility(0);
        this.f32086l.setVisibility(8);
        this.f32085k.setVisibility(8);
        this.f32080f.setVisibility(0);
        this.R.setVisibility(0);
        this.L.setText(gameInformationBean.getTitle());
        TextView textView2 = this.M;
        textView2.setText("作者:" + gameInformationBean.getAuthor());
        this.N.setText(gameInformationBean.getRelease_time());
        this.f32081g.setBackgroundColor(-1);
        this.f32081g.getSettings().setJavaScriptEnabled(true);
        this.f32081g.getSettings().setDomStorageEnabled(true);
        this.f32081g.setWebChromeClient(new WebChromeClient());
        this.f32081g.addJavascriptInterface(new c(), "papa");
        this.f32081g.loadDataWithBaseURL("about:blank", gameInformationBean.getContent(), "text/html", "utf-8", null);
        this.f32081g.setWebViewClient(new d());
        this.J = gameInformationBean;
        this.f32081g.setBackgroundColor(-1);
        if (gameInformationBean.getComment_switch() == 1) {
            A0();
            s0(this.D);
        }
        List<DetailResultBean> game_info = gameInformationBean.getGame_info();
        if (game_info != null && game_info.size() != 0) {
            DetailResultBean detailResultBean = game_info.get(0);
            this.V = detailResultBean;
            detailResultBean.set_from(106);
            UtilsMy.k3(this.V.getSp_tag_info(), this.f32100w);
            UtilsMy.k3(this.V.getSp_tag_info(), this.f32101x);
            String crc_sign_id = this.V.getCrc_sign_id();
            this.H = crc_sign_id;
            if (crc_sign_id == null) {
                return;
            }
            DownloadTask F = p1.f.K().F(this.V.getCrc_sign_id());
            this.K = F;
            if (F == null) {
                this.K = this.V.getDownloadtaskDown();
                if (UtilsMy.o0(this.V.getTag_info())) {
                    this.K.setFileType(Dtype.android.name());
                    if (com.join.android.app.common.utils.e.l0(this).d(this, this.V.getPackage_name())) {
                        APKUtils.a l4 = com.join.android.app.common.utils.e.l0(this).l(this, this.V.getPackage_name());
                        if (com.join.mgps.Util.g2.i(this.V.getVer()) && l4.d() < Integer.parseInt(this.V.getVer())) {
                            this.K.setStatus(9);
                        } else {
                            this.K.setStatus(5);
                        }
                    } else {
                        this.K.setStatus(0);
                    }
                } else {
                    this.K.setFileType(Dtype.apk.name());
                    this.K.setStatus(0);
                }
            } else {
                F.setCfg_ver(this.V.getCfg_ver());
                this.K.setCfg_ver_name(this.V.getCfg_ver_name());
                this.K.setCfg_down_url(this.V.getCfg_down_url());
                this.K.setDownloadType(this.V.getDownloadType());
                this.K.setScreenshot_pic(this.V.getScreenshot_pic());
            }
            E0();
            F0();
            MyImageLoader.h(this.f32087m, this.V.getIco_remote());
            this.f32090p.setText(this.V.getGame_name());
            TextView textView3 = this.f32098v;
            textView3.setText("大小：" + this.V.getSize() + "M");
            if (this.V == null) {
                this.f32082h.setVisibility(8);
                this.f32083i.setVisibility(8);
                return;
            }
            this.f32082h.setVisibility(0);
            this.f32083i.setVisibility(0);
            if (this.G) {
                q0();
            }
            this.f32093q.setText(this.V.getGame_name());
            MyImageLoader.h(this.f32088n, this.V.getIco_remote());
            this.f32088n.setOnClickListener(new e());
            this.f32089o.setOnClickListener(new f());
            this.R.setOnClickListener(new g());
            TextView textView4 = this.f32094r;
            textView4.setText(com.join.mgps.Util.g2.b(this.V.getDown_count()) + "热度");
            TextView textView5 = this.f32095s;
            textView5.setText(net.lingala.zip4j.util.e.F0 + this.V.getSize() + "M");
            this.f32096t.setText(this.V.getInfo());
            return;
        }
        this.f32082h.setVisibility(8);
        this.f32083i.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void D0() {
        IntentUtil.getInstance().goMyGameManagerActivity(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread(delay = 500)
    public void G0() {
        z0(this.D1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void I0(ImageView imageView, TextView textView, boolean z4, String str) {
        if (z4) {
            imageView.setImageResource(R.drawable.like);
            textView.setText(str);
            return;
        }
        imageView.setImageResource(R.drawable.unlike);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterview() {
        this.f32076b = com.join.mgps.rpc.impl.d.P1();
        com.join.mgps.Util.d0.a().d(this);
        this.U = this;
        this.f32079e.setText("详情");
        getDownloadTaskInfo();
        this.C.setVisibility(0);
        showLoding();
        this.Q.setVisibility(8);
        t0();
        this.f32080f.setScanScrollChangedListener(new a());
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
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r4 = r2.f32092p1
            boolean r4 = r4.containsKey(r0)
            if (r4 != 0) goto L2d
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r4 = r2.f32092p1
            r4.put(r0, r3)
        L2d:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r4 = r2.f32099v1
            boolean r4 = r4.containsKey(r0)
            if (r4 != 0) goto La7
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r4 = r2.f32099v1
            r4.put(r0, r3)
            goto La7
        L3b:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.f32092p1
            boolean r3 = r3.containsKey(r0)
            if (r3 == 0) goto L48
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.f32092p1
            r3.remove(r0)
        L48:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.f32099v1
            boolean r3 = r3.containsKey(r0)
            if (r3 == 0) goto La7
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.f32099v1
            r3.remove(r0)
            goto La7
        L56:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.f32099v1
            boolean r3 = r3.containsKey(r0)
            if (r3 == 0) goto La7
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.f32099v1
            r3.remove(r0)
            goto La7
        L64:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.f32092p1
            boolean r3 = r3.containsKey(r0)
            if (r3 == 0) goto L71
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.f32092p1
            r3.remove(r0)
        L71:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.f32099v1
            boolean r3 = r3.containsKey(r0)
            if (r3 == 0) goto La7
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.f32099v1
            r3.remove(r0)
            goto La7
        L7f:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.f32099v1
            boolean r3 = r3.containsKey(r0)
            if (r3 == 0) goto La7
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.f32099v1
            r3.remove(r0)
            goto La7
        L8d:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r4 = r2.f32092p1
            boolean r4 = r4.containsKey(r0)
            if (r4 != 0) goto L9a
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r4 = r2.f32092p1
            r4.put(r0, r3)
        L9a:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r4 = r2.f32099v1
            boolean r4 = r4.containsKey(r0)
            if (r4 != 0) goto La7
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r4 = r2.f32099v1
            r4.put(r0, r3)
        La7:
            r2.updateDownloadView()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.mgps.activity.GameInformationActivity.changeDownloadTaskNumber(com.github.snowdream.android.app.downloader.DownloadTask, int):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void getDownloadTaskInfo() {
        List<DownloadTask> r4 = p1.f.K().r();
        List<DownloadTask> q4 = p1.f.K().q();
        if (q4 != null && q4.size() > 0) {
            for (DownloadTask downloadTask : q4) {
                this.f32092p1.put(downloadTask.getCrc_link_type_val(), downloadTask);
            }
        }
        if (r4 != null && r4.size() > 0) {
            for (DownloadTask downloadTask2 : r4) {
                this.f32099v1.put(downloadTask2.getCrc_link_type_val(), downloadTask2);
            }
        }
        updateDownloadView();
    }

    void j0(List<InformationCommentBean> list) {
        for (int i4 = 0; list != null && i4 < list.size(); i4++) {
            InformationCommentBean informationCommentBean = list.get(i4);
            this.B1.add(new GameCommentAdapter.l(GameCommentAdapter.ViewType.COMMENT, new GameCommentAdapter.l.a(informationCommentBean)));
            List<InformationCommentBean.Sub> sub = informationCommentBean.getSub();
            if (sub != null && sub.size() > 0) {
                this.B1.add(new GameCommentAdapter.l(GameCommentAdapter.ViewType.REPLY, new GameCommentAdapter.l.b(informationCommentBean.getComment_id(), informationCommentBean, 0, true)));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void k0() {
        if (this.V == null) {
            return;
        }
        IntentUtil.getInstance().goGameDetialActivity(this, this.V.getCrc_sign_id(), this.V.getGame_info_tpl_type(), this.V.getSp_tpl_two_position(), 116);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void l0() {
        r0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void m0() {
        DownloadTask downloadTask = this.K;
        if (downloadTask == null) {
            return;
        }
        int status = downloadTask != null ? downloadTask.getStatus() : 0;
        if (UtilsMy.w0(this.V.getPay_tag_info(), this.V.getCrc_sign_id()) > 0) {
            status = 43;
        }
        if (status != 0) {
            if (status == 13) {
                com.php25.PDownload.d.l(this, this.K);
                return;
            } else if (status != 43) {
                if (status != 2) {
                    if (status != 3) {
                        if (status == 5) {
                            UtilsMy.T3(this.U, this.K);
                            return;
                        } else if (status != 6) {
                            if (status != 7) {
                                switch (status) {
                                    case 9:
                                        if (!com.join.android.app.common.utils.j.j(this.U)) {
                                            com.join.mgps.Util.l2.a(this.U).b("无网络连接");
                                            return;
                                        }
                                        int downloadType = this.K.getDownloadType();
                                        if (downloadType == 0 || downloadType == 1) {
                                            this.K.setExt1(this.D);
                                            UtilsMy.I2(this.U, this.K);
                                            return;
                                        } else if (downloadType != 2) {
                                            return;
                                        } else {
                                            UtilsMy.u4(this.K);
                                            return;
                                        }
                                    case 10:
                                        break;
                                    case 11:
                                        UtilsMy.a4(this.K, this.U);
                                        return;
                                    default:
                                        return;
                                }
                            }
                        }
                    }
                    com.php25.PDownload.d.c(this.K, this.U);
                    return;
                }
                com.php25.PDownload.d.i(this.K);
                return;
            }
        }
        this.K.setKeyword(Where.article.name());
        this.K.setExt1(this.D);
        if (UtilsMy.y0(this.V.getPay_tag_info(), this.V.getCrc_sign_id()) > 0) {
            UtilsMy.d4(this.U, this.V.getCrc_sign_id());
        } else {
            UtilsMy.z1(this.K, this.V);
            if (!UtilsMy.o1(this.U, this.K)) {
                if (this.V.getDown_status() == 5) {
                    UtilsMy.l1(this.U, this.K);
                } else {
                    UtilsMy.R0(this.U, this.K, this.V.getTp_down_url(), this.V.getOther_down_switch(), this.V.getCdn_down_switch());
                }
            }
        }
        com.papa.sim.statistic.p.l(this.U).B(this.D, AccountUtil_.getInstance_(this.U).getUid());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void n0() {
        GameInformationCommentActivity_.P0(this.U).b(this.D).start();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread(delay = 2000)
    public void o0() {
        this.f32081g.invalidate();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        r0();
        super.onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.join.mgps.Util.d0.a().e(this);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onEventMainThread(com.join.mgps.event.n nVar) {
        DownloadTask a5 = nVar.a();
        changeDownloadTaskNumber(this.K, nVar.c());
        if (a5 != null && this.K != null && a5.getCrc_link_type_val().equals(this.K.getCrc_link_type_val())) {
            this.K.setStatus(a5.getStatus());
            this.K.setPath(a5.getPath());
            this.K.setSize(a5.getSize());
        }
        int c5 = nVar.c();
        if ((c5 == 5 || c5 == 11 || c5 == 48) && a5 != null && this.K != null && a5.getCrc_link_type_val().equals(this.K.getCrc_link_type_val())) {
            this.K = a5;
        }
        E0();
        F0();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        ObservableWebView observableWebView = this.f32081g;
        if (observableWebView != null) {
            try {
                observableWebView.getClass().getMethod("onPause", new Class[0]).invoke(this.f32081g, null);
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
            } catch (NoSuchMethodException e6) {
                e6.printStackTrace();
            } catch (InvocationTargetException e7) {
                e7.printStackTrace();
            }
        }
        super.onPause();
    }

    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        GameInformationBean gameInformationBean = this.J;
        if (gameInformationBean != null && gameInformationBean.getComment_switch() == 1) {
            s0(this.D);
        }
        ObservableWebView observableWebView = this.f32081g;
        if (observableWebView != null) {
            try {
                observableWebView.getClass().getMethod("onResume", new Class[0]).invoke(this.f32081g, null);
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
            } catch (NoSuchMethodException e6) {
                e6.printStackTrace();
            } catch (InvocationTargetException e7) {
                e7.printStackTrace();
            }
        }
        com.wufan.user.service.protobuf.n0 accountData = AccountUtil_.getInstance_(this.U).getAccountData();
        this.Z = accountData;
        if (accountData != null && this.f32091p0 != null) {
            UtilsMy.s3(this.U, accountData.d0(), this.f32091p0);
        }
        if (com.join.mgps.Util.g2.h(this.H)) {
            return;
        }
        DownloadTask F = p1.f.K().F(this.H);
        if (F != null && this.K != null) {
            if (Dtype.android.name().equals(this.K.getFileType()) && this.K.getStatus() == 5) {
                com.join.android.app.common.utils.e l02 = com.join.android.app.common.utils.e.l0(this);
                String packageName = this.K.getPackageName();
                APKUtils.DEVICE_TYPE device_type = APKUtils.DEVICE_TYPE.ALL;
                if (Boolean.valueOf(l02.e(this, packageName, device_type)).booleanValue()) {
                    APKUtils.a m4 = com.join.android.app.common.utils.e.l0(this).m(this, this.K.getPackageName(), device_type);
                    if (com.join.mgps.Util.g2.i(this.K.getVer()) && m4.d() < Integer.parseInt(this.K.getVer())) {
                        this.K.setStatus(9);
                    } else {
                        this.K.setStatus(5);
                    }
                } else {
                    this.K.setStatus(11);
                }
            } else {
                this.K.setStatus(F.getStatus());
            }
            E0();
            F0();
        } else if (F != null || this.K == null) {
        } else {
            if (Dtype.android.name().equals(this.K.getFileType()) && this.K.getStatus() == 5) {
                if (Boolean.valueOf(com.join.android.app.common.utils.e.l0(this).d(this, this.K.getPackageName())).booleanValue()) {
                    APKUtils.a l4 = com.join.android.app.common.utils.e.l0(this).l(this, this.K.getPackageName());
                    if (com.join.mgps.Util.g2.i(this.K.getVer()) && l4.d() < Integer.parseInt(this.K.getVer())) {
                        this.K.setStatus(9);
                    } else {
                        this.K.setStatus(5);
                    }
                } else {
                    this.K.setStatus(0);
                }
            }
            E0();
            F0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void q0() {
        DownloadTask downloadTask = this.K;
        if (downloadTask == null) {
            return;
        }
        int status = downloadTask != null ? downloadTask.getStatus() : 0;
        if (UtilsMy.w0(this.V.getPay_tag_info(), this.V.getCrc_sign_id()) > 0) {
            status = 43;
        }
        if (status != 0) {
            if (status == 13) {
                com.php25.PDownload.d.l(this, this.K);
                return;
            } else if (status != 43) {
                if (status != 2) {
                    if (status != 3) {
                        if (status == 5) {
                            UtilsMy.T3(this.U, this.K);
                            return;
                        } else if (status != 6) {
                            if (status != 7) {
                                switch (status) {
                                    case 9:
                                        if (!com.join.android.app.common.utils.j.j(this.U)) {
                                            com.join.mgps.Util.l2.a(this.U).b("无网络连接");
                                            return;
                                        }
                                        int downloadType = this.K.getDownloadType();
                                        if (downloadType == 0 || downloadType == 1) {
                                            this.K.setExt1(this.D);
                                            UtilsMy.I2(this.U, this.K);
                                            return;
                                        } else if (downloadType != 2) {
                                            return;
                                        } else {
                                            UtilsMy.u4(this.K);
                                            return;
                                        }
                                    case 10:
                                        break;
                                    case 11:
                                        UtilsMy.a4(this.K, this.U);
                                        return;
                                    default:
                                        return;
                                }
                            }
                        }
                    }
                    com.php25.PDownload.d.c(this.K, this.U);
                    return;
                }
                com.php25.PDownload.d.i(this.K);
                return;
            }
        }
        this.K.setKeyword(Where.article.name());
        this.K.setExt1(this.D);
        if (UtilsMy.y0(this.V.getPay_tag_info(), this.V.getCrc_sign_id()) > 0) {
            UtilsMy.d4(this.U, this.V.getCrc_sign_id());
        } else {
            UtilsMy.z1(this.K, this.V);
            if (!UtilsMy.o1(this.U, this.K)) {
                if (this.V.getDown_status() == 5) {
                    UtilsMy.l1(this.U, this.K);
                } else {
                    UtilsMy.R0(this.U, this.K, this.V.getTp_down_url(), this.V.getOther_down_switch(), this.V.getCdn_down_switch());
                }
            }
        }
        com.papa.sim.statistic.p.l(this.U).B(this.D, AccountUtil_.getInstance_(this.U).getUid());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void relodingimag() {
        showLoding();
        t0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void s0(String str) {
        if (com.join.android.app.common.utils.j.j(this)) {
            try {
                GameInformationCommentRequest gameInformationCommentRequest = new GameInformationCommentRequest();
                gameInformationCommentRequest.setComment_type(new int[]{1});
                gameInformationCommentRequest.setInformation_id(str);
                gameInformationCommentRequest.setPn(1);
                gameInformationCommentRequest.setPc(20);
                com.wufan.user.service.protobuf.n0 n0Var = this.Z;
                if (n0Var != null) {
                    gameInformationCommentRequest.setUid(n0Var.getUid());
                }
                ResultMainBean<InformationCommentBack> k02 = this.f32076b.k0(RequestBeanUtil.getInstance(this).getGameInformationComment(gameInformationCommentRequest));
                if (k02 != null && k02.getFlag() == 1) {
                    InformationCommentBack data = k02.getMessages().getData();
                    if (data == null) {
                        w0();
                        return;
                    }
                    List<InformationCommentBean> hot = data.getHot();
                    if (hot == null) {
                        w0();
                        return;
                    } else if (hot.size() > 0) {
                        B0(hot);
                        return;
                    } else {
                        w0();
                        return;
                    }
                }
                w0();
                return;
            } catch (Exception e5) {
                e5.printStackTrace();
                w0();
                return;
            }
        }
        w0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void setNetwork() {
        UtilsMy.w3(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showLoding() {
        this.f32085k.setVisibility(0);
        this.f32086l.setVisibility(8);
        this.f32080f.setVisibility(8);
        this.R.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showLodingFailed() {
        this.f32086l.setVisibility(0);
        this.f32085k.setVisibility(8);
        this.f32080f.setVisibility(8);
        this.R.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showMessage(String str) {
        com.join.mgps.Util.l2.a(this.U).b(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showToast(String str) {
        com.join.mgps.Util.l2.a(this.U).b(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void t0() {
        if (com.join.android.app.common.utils.j.j(this)) {
            try {
                ResultMainBean<List<GameInformationBean>> O = this.f32076b.O(RequestBeanUtil.getInstance(this).getgameInformation(this.D, this.F));
                if (O != null && O.getFlag() == 1) {
                    List<GameInformationBean> data = O.getMessages().getData();
                    if (data.size() > 0) {
                        C0(data.get(0));
                    } else {
                        showLodingFailed();
                    }
                } else {
                    showLodingFailed();
                }
                return;
            } catch (Exception e5) {
                e5.printStackTrace();
                showLodingFailed();
                return;
            }
        }
        showLodingFailed();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void u0() {
        if (this.J != null && System.currentTimeMillis() - this.W > 2000) {
            this.W = System.currentTimeMillis();
            ShareBean shareBean = new ShareBean();
            shareBean.setTitle(this.J.getTitle());
            shareBean.setText("点击查看详情");
            shareBean.setImageUrl(this.J.getShow_pic());
            shareBean.setQqUrl(this.J.getShare_url());
            shareBean.setqZoneShareUrl(this.J.getShare_url());
            shareBean.setWeiboShareUrl(this.J.getShare_url());
            shareBean.setWechatFriendUrl(this.J.getShare_url());
            shareBean.setWechatShareUrl(this.J.getShare_url());
            shareBean.setFrom(3);
            shareBean.setGameId(this.D);
            com.join.mgps.Util.s.r(this, shareBean);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void updateDownloadView() {
        int size = this.f32092p1.size();
        int size2 = this.f32099v1.size();
        this.C.setDownloadGameNum(size);
        if (size2 > 0) {
            this.C.d();
        } else {
            this.C.g();
        }
    }

    boolean v0(DetailResultBean detailResultBean) {
        return (detailResultBean == null || detailResultBean.getPay_tag_info() == null || detailResultBean.getPay_tag_info().getPay_game_amount() <= 0) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread(delay = 1000)
    public void w0() {
        this.B.addView(LayoutInflater.from(this.U).inflate(R.layout.information_footer, (ViewGroup) null));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Receiver(actions = {o1.a.G, o1.a.I})
    public void x0(@Receiver.Extra("gameData") CollectionBeanSub collectionBeanSub) {
        if (collectionBeanSub != null) {
            PurchasedListTable n4 = b2.e0.o().n(collectionBeanSub.getGame_id());
            if (n4 == null) {
                n4 = new PurchasedListTable();
            }
            n4.setGame_id(collectionBeanSub.getGame_id());
            b2.e0.o().m(n4);
        }
        E0();
        F0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void y0(InformationCommentBean informationCommentBean, ImageView imageView, TextView textView) {
        if (com.join.android.app.common.utils.j.j(this)) {
            try {
                if (IntentUtil.getInstance().goLoginInteractive(this)) {
                    return;
                }
                PariseRequest pariseRequest = new PariseRequest();
                pariseRequest.setInformation_id(this.D);
                pariseRequest.setComment_id(informationCommentBean.getComment_id());
                pariseRequest.setUid(this.Z.getUid());
                ResultMainBean<List<PariseBackData>> p02 = this.f32076b.p0(RequestBeanUtil.getInstance(this).getGameInformationParis(pariseRequest));
                if (p02 != null && p02.getCode() == 706) {
                    showMessage("完善资料后就可点赞哦");
                    IntentUtil.getInstance().goLoginInteractive(this);
                    return;
                } else if (p02 != null && p02.getFlag() == 1) {
                    List<PariseBackData> data = p02.getMessages().getData();
                    if (data.size() > 0) {
                        if (data.get(0).isVal()) {
                            informationCommentBean.setHasPraised(true);
                            int parseInt = Integer.parseInt(informationCommentBean.getPraise_count());
                            informationCommentBean.setPraise_count((parseInt + 1) + "");
                            informationCommentBean.setHasPraised(true);
                            H0(informationCommentBean);
                            return;
                        }
                        showToast("你已赞过");
                        informationCommentBean.setHasPraised(true);
                        H0(informationCommentBean);
                        return;
                    }
                    showToast("你已赞过");
                    informationCommentBean.setHasPraised(true);
                    H0(informationCommentBean);
                    return;
                } else {
                    showToast("点赞失败");
                    informationCommentBean.setHasPraised(false);
                    H0(informationCommentBean);
                    return;
                }
            } catch (Exception e5) {
                e5.printStackTrace();
                showToast("点赞失败");
                informationCommentBean.setHasPraised(false);
                H0(informationCommentBean);
                return;
            }
        }
        showToast("没有网络");
        informationCommentBean.setHasPraised(false);
        H0(informationCommentBean);
    }
}
