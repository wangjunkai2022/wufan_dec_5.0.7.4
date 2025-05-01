package com.join.mgps.activity;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.JavascriptInterface;
import android.webkit.SslErrorHandler;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebStorage;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import com.BaseFragmentActivity;
import com.google.android.material.appbar.AppBarLayout;
import com.join.android.app.mgsim.wufun.R;
import com.join.kotlin.ui.introduction.IntroductionCommentListFragment;
import com.join.kotlin.ui.introduction.IntroductionCommentListFragment_;
import com.join.kotlin.ui.introduction.IntroductionProgressFragment;
import com.join.kotlin.ui.introduction.IntroductionProgressFragment_;
import com.join.kotlin.ui.introduction.MoreIntroductionFragment;
import com.join.kotlin.ui.introduction.MoreIntroductionFragment_;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.customview.NestedScrollWebView;
import com.join.mgps.dto.BbsDetailBean;
import com.join.mgps.dto.IntentDataMain;
import com.join.mgps.dto.IntroductionCommentDetailParamsBean;
import com.join.mgps.dto.RequestBbsDetailArgs;
import com.join.mgps.dto.RequestBbsDispraiseArgs;
import com.join.mgps.dto.RequestBbsPraiseArgs;
import com.join.mgps.dto.RequestModel;
import com.join.mgps.dto.ResponseModel;
import com.join.mgps.dto.TimingBean;
import com.join.mgps.dto.VideoChaptersBean;
import com.join.mgps.pref.PrefDef_;
import com.mgsim.common.fragment.BackHandledFragment;
import com.papa.sim.statistic.Data;
import com.papa.sim.statistic.Event;
import com.papa.sim.statistic.Ext;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.util.LinkedHashMap;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.Extra;
import org.androidannotations.annotations.Receiver;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
import org.androidannotations.annotations.sharedpreferences.Pref;
@EActivity(R.layout.introduction_activity_layout)
/* loaded from: classes4.dex */
public class IntroductionActivity extends BaseFragmentActivity implements com.mgsim.common.fragment.a, w1.h {
    @Extra
    int A;
    FragmentManager B;
    com.join.mgps.rpc.k C;
    String D;
    @Extra
    String E;
    @Extra
    IntroductionCommentDetailParamsBean F;
    Boolean G;
    int H;
    private String I;
    BbsDetailBean J;
    IntroductionProgressFragment K;
    MoreIntroductionFragment L;
    IntroductionCommentListFragment M;
    private String O;
    private BackHandledFragment R;
    PopupWindow S;
    @ViewById

    /* renamed from: d  reason: collision with root package name */
    LinearLayout f34118d;
    @ViewById

    /* renamed from: e  reason: collision with root package name */
    LinearLayout f34119e;

    /* renamed from: f  reason: collision with root package name */
    AppBarLayout f34120f;

    /* renamed from: g  reason: collision with root package name */
    TextView f34121g;
    @ViewById

    /* renamed from: h  reason: collision with root package name */
    TextView f34122h;
    @ViewById

    /* renamed from: i  reason: collision with root package name */
    LinearLayout f34123i;
    @ViewById

    /* renamed from: j  reason: collision with root package name */
    FrameLayout f34124j;
    @ViewById

    /* renamed from: k  reason: collision with root package name */
    RelativeLayout f34125k;
    @ViewById

    /* renamed from: l  reason: collision with root package name */
    FrameLayout f34126l;
    @ViewById

    /* renamed from: m  reason: collision with root package name */
    ImageView f34127m;
    @ViewById

    /* renamed from: n  reason: collision with root package name */
    TextView f34128n;
    @ViewById

    /* renamed from: o  reason: collision with root package name */
    TextView f34129o;

    /* renamed from: p  reason: collision with root package name */
    NestedScrollWebView f34130p;
    @ViewById

    /* renamed from: q  reason: collision with root package name */
    ProgressBar f34131q;
    @ViewById

    /* renamed from: r  reason: collision with root package name */
    FrameLayout f34132r;
    @ViewById

    /* renamed from: s  reason: collision with root package name */
    TextView f34133s;
    @ViewById

    /* renamed from: t  reason: collision with root package name */
    LinearLayout f34134t;
    @Extra

    /* renamed from: u  reason: collision with root package name */
    IntentDataMain f34135u;

    /* renamed from: v  reason: collision with root package name */
    private View f34136v;

    /* renamed from: w  reason: collision with root package name */
    private WebChromeClient f34137w;
    @Extra

    /* renamed from: y  reason: collision with root package name */
    int f34139y;
    @Pref

    /* renamed from: z  reason: collision with root package name */
    PrefDef_ f34140z;

    /* renamed from: b  reason: collision with root package name */
    String f34116b = "IntroductionActivity";

    /* renamed from: c  reason: collision with root package name */
    private Handler f34117c = new a();

    /* renamed from: x  reason: collision with root package name */
    private View f34138x = null;
    Fragment N = null;
    private boolean P = true;
    com.join.mgps.dialog.d1 Q = null;
    boolean T = false;
    boolean U = false;
    long V = 0;
    LinkedHashMap<String, Long> W = new LinkedHashMap<>();

    /* loaded from: classes4.dex */
    class a extends Handler {
        a() {
        }

        @Override // android.os.Handler
        public void handleMessage(@NonNull Message message) {
            super.handleMessage(message);
            int i4 = message.what;
            if (i4 == 1) {
                return;
            }
            if (i4 == 2) {
                IntroductionActivity introductionActivity = IntroductionActivity.this;
                introductionActivity.U(introductionActivity.K);
            } else if (i4 == 3) {
                IntroductionActivity introductionActivity2 = IntroductionActivity.this;
                NestedScrollWebView nestedScrollWebView = introductionActivity2.f34130p;
                introductionActivity2.Q0(nestedScrollWebView, nestedScrollWebView.getMeasuredWidth() / 2, IntroductionActivity.this.f34130p.getMeasuredHeight() / 2);
            } else if (i4 == 4) {
                IntroductionActivity.this.F0();
                IntroductionActivity.this.P = false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IntroductionActivity.this.S.dismiss();
            IntroductionActivity introductionActivity = IntroductionActivity.this;
            if (introductionActivity.J != null) {
                com.papa.sim.statistic.p.l(introductionActivity).q1(Event.singleStartGamePageDetail, Event.ClickBrowser, "", new Ext().setFrom("1").setArticleId(String.valueOf(IntroductionActivity.this.J.getId())).setFromTabId(String.valueOf(IntroductionActivity.this.A)), new Data().setGameId(Long.parseLong(IntroductionActivity.this.E)));
                IntroductionActivity introductionActivity2 = IntroductionActivity.this;
                introductionActivity2.J0(introductionActivity2.J.getSourceUrl());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class d implements View.OnClickListener {
        d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IntroductionActivity.this.S.dismiss();
            IntroductionActivity introductionActivity = IntroductionActivity.this;
            if (introductionActivity.J != null) {
                com.papa.sim.statistic.p.l(introductionActivity).q1(Event.singleStartGamePageDetail, Event.ClickReport, "", new Ext().setFrom("1").setArticleId(String.valueOf(IntroductionActivity.this.J.getId())).setFromTabId(String.valueOf(IntroductionActivity.this.A)), new Data().setGameId(Long.parseLong(IntroductionActivity.this.E)));
                IntentUtil intentUtil = IntentUtil.getInstance();
                IntroductionActivity introductionActivity2 = IntroductionActivity.this;
                intentUtil.goShareWebActivity(introductionActivity2, introductionActivity2.s0());
            }
        }
    }

    /* loaded from: classes4.dex */
    public class e {

        /* renamed from: a  reason: collision with root package name */
        private Context f34146a;

        public e(Context context) {
            this.f34146a = context;
        }

        @JavascriptInterface
        public void openImage(String[] strArr, int i4) {
            Intent intent = new Intent(IntroductionActivity.this, ImagePagerActivity.class);
            intent.putExtra("image_urls", strArr);
            intent.putExtra("image_index", i4);
            IntroductionActivity.this.startActivity(intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public class f extends WebViewClient {
        public f(Context context) {
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            String str2 = IntroductionActivity.this.f34116b;
            com.join.mgps.Util.v0.b(str2, "onPageFinished() called." + str);
            webView.getSettings().setBlockNetworkImage(false);
            IntroductionActivity.this.v0();
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
            String str2 = IntroductionActivity.this.f34116b;
            com.join.mgps.Util.v0.b(str2, "onPageStarted() called." + str);
            IntroductionActivity.this.showLoding();
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i4, String str, String str2) {
            super.onReceivedError(webView, i4, str, str2);
            String str3 = IntroductionActivity.this.f34116b;
            com.join.mgps.Util.v0.b(str3, "onReceivedError() called." + str2);
            if (str2.endsWith(".zip")) {
                return;
            }
            webView.loadDataWithBaseURL(null, "", "text/html", "utf-8", null);
            IntroductionActivity.this.showLodingFailed();
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
            com.join.mgps.Util.v0.b(IntroductionActivity.this.f34116b, "shouldOverrideUrlLoading() called.");
            if (com.join.android.app.common.utils.j.j(IntroductionActivity.this)) {
                if (!str.startsWith("weixin:")) {
                    if (!str.startsWith(com.facebook.common.util.f.f10923a) && !str.startsWith("https") && !str.startsWith("file://")) {
                        try {
                            IntroductionActivity.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                        } catch (Exception e5) {
                            e5.printStackTrace();
                        }
                        return true;
                    }
                    return super.shouldOverrideUrlLoading(webView, str);
                }
                try {
                    IntroductionActivity.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                } catch (Exception e6) {
                    e6.printStackTrace();
                }
            } else {
                com.join.mgps.Util.l2.a(IntroductionActivity.this).b(IntroductionActivity.this.getString(R.string.net_connect_failed));
            }
            return true;
        }
    }

    private void K0() {
        this.f34124j.setVisibility(8);
        this.f34125k.setVisibility(0);
    }

    private void M0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Q0(View view, int i4, int i5) {
        long uptimeMillis = SystemClock.uptimeMillis();
        long uptimeMillis2 = SystemClock.uptimeMillis() + 100;
        float f5 = i4;
        float f6 = i5;
        view.dispatchTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis2, 0, f5, f6, 0));
        view.dispatchTouchEvent(MotionEvent.obtain(uptimeMillis + 1000, uptimeMillis2 + 1000, 1, f5, f6, 0));
    }

    private String S0(String str, int i4) {
        if (com.join.mgps.Util.g2.h(str)) {
            return "";
        }
        if (str.contains("?")) {
            return str + "&t=" + i4;
        }
        return str + "?t=" + i4;
    }

    private void init() {
        initWebSet();
        this.f34130p.setWebChromeClient(new b());
    }

    private int t0() {
        com.wufan.user.service.protobuf.n0 accountData = AccountUtil_.getInstance_(this).getAccountData();
        if (accountData != null) {
            return accountData.getUid();
        }
        return 0;
    }

    private void z0(String str) {
        try {
            if (com.join.android.app.common.utils.j.j(this)) {
                if (this.f34130p == null) {
                    return;
                }
                x0(str);
            } else {
                showLodingFailed();
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void A0() {
        com.join.mgps.Util.v0.b(this.f34116b, "loding_faile() called.");
        if (this.f34130p != null) {
            z0(this.D);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void B0(Integer num) {
        try {
            if (this.U) {
                return;
            }
            if (com.join.android.app.common.utils.j.j(this)) {
                if (IntentUtil.getInstance().goLogin(this)) {
                    showTost("您还未登录请先登录帐号！");
                    this.U = false;
                    return;
                }
                try {
                    this.U = true;
                    RequestBbsDispraiseArgs requestBbsDispraiseArgs = new RequestBbsDispraiseArgs();
                    requestBbsDispraiseArgs.setResourceType("POST");
                    requestBbsDispraiseArgs.setResourceId(num);
                    requestBbsDispraiseArgs.setUid(Integer.valueOf(t0()));
                    RequestModel requestModel = new RequestModel(this);
                    requestModel.setArgs(requestBbsDispraiseArgs);
                    ResponseModel<Boolean> v2 = this.C.v(requestModel.makeSign());
                    this.U = false;
                    if (v2 == null || !v2.getData().booleanValue()) {
                        return;
                    }
                    R0(false);
                    return;
                } catch (Exception e5) {
                    e5.printStackTrace();
                    this.U = false;
                    return;
                }
            }
            this.U = false;
            showTost(getResources().getString(R.string.net_connect_failed));
        } catch (Exception e6) {
            this.U = false;
            e6.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void C0(String str, Integer num) {
        try {
            if (this.T) {
                return;
            }
            if (com.join.android.app.common.utils.j.j(this)) {
                if (IntentUtil.getInstance().goLogin(this)) {
                    showTost("您还未登录请先登录帐号！");
                    this.T = false;
                    return;
                }
                try {
                    this.T = true;
                    RequestBbsPraiseArgs requestBbsPraiseArgs = new RequestBbsPraiseArgs();
                    requestBbsPraiseArgs.setResourceType("POST");
                    requestBbsPraiseArgs.setResourceId(num);
                    requestBbsPraiseArgs.setRuid(str);
                    requestBbsPraiseArgs.setUid(Integer.valueOf(t0()));
                    RequestModel requestModel = new RequestModel(this);
                    requestModel.setArgs(requestBbsPraiseArgs);
                    ResponseModel<Boolean> d02 = this.C.d0(requestModel.makeSign());
                    this.T = false;
                    if (d02 == null || !d02.getData().booleanValue()) {
                        return;
                    }
                    R0(true);
                    com.papa.sim.statistic.p.l(this).q1(Event.singleStartGamePageDetail, Event.ClickLike, "", new Ext().setFrom("1").setArticleId(String.valueOf(this.J.getId())).setFromTabId(String.valueOf(this.A)), new Data().setGameId(Long.parseLong(this.E)));
                    return;
                } catch (Exception e5) {
                    this.T = false;
                    e5.printStackTrace();
                    return;
                }
            }
            this.T = false;
            showTost(getResources().getString(R.string.net_connect_failed));
        } catch (Exception e6) {
            this.T = false;
            e6.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click({R.id.ll_more})
    public void D0() {
        View inflate = getLayoutInflater().inflate(R.layout.introduction_comment_bottom_popwin, (ViewGroup) null);
        PopupWindow popupWindow = new PopupWindow(inflate, -2, -2);
        this.S = popupWindow;
        popupWindow.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#00000000")));
        this.S.setFocusable(true);
        this.S.setOutsideTouchable(true);
        this.S.update();
        Rect rect = new Rect();
        View findViewById = findViewById(R.id.ll_more);
        findViewById.getGlobalVisibleRect(rect);
        this.S.showAtLocation(findViewById(R.id.ll_more), 0, (int) (rect.left - getResources().getDimension(R.dimen.wdp187)), (int) ((rect.bottom - getResources().getDimension(R.dimen.wdp145)) - (findViewById.getHeight() / 2)));
        ((TextView) inflate.findViewById(R.id.tv_pop_open_web)).setOnClickListener(new c());
        ((TextView) inflate.findViewById(R.id.tv_pop_report)).setOnClickListener(new d());
        if (this.J != null) {
            com.papa.sim.statistic.p.l(this).q1(Event.singleStartGamePageDetail, Event.ClickMoreButton, "", new Ext().setFrom("1").setArticleId(String.valueOf(this.J.getId())).setFromTabId(String.valueOf(this.A)), new Data().setGameId(Long.parseLong(this.E)));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click({R.id.ll_close_drawer})
    public void E0() {
        PopupWindow popupWindow = this.S;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
        finish();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click({R.id.ll_comment})
    public void F0() {
        boolean z4;
        if (this.J != null) {
            if (this.M == null) {
                IntroductionCommentListFragment_ introductionCommentListFragment_ = new IntroductionCommentListFragment_();
                this.M = introductionCommentListFragment_;
                introductionCommentListFragment_.setFragmentCallback(this);
                z4 = true;
            } else {
                z4 = false;
            }
            this.M.setVideo(this.J.getType().intValue() == 1);
            this.M.setDuration(this.J.getDuration().intValue());
            this.M.setParams(this.J.getId().intValue(), this.J.getPosterId().intValue(), this.J.getReportUrl(), this.E);
            IntroductionCommentDetailParamsBean introductionCommentDetailParamsBean = this.F;
            if (introductionCommentDetailParamsBean != null) {
                this.M.setCommentId(introductionCommentDetailParamsBean.getParent_comment_id());
                this.M.setFromNotice(this.P);
            }
            IntroductionCommentListFragment introductionCommentListFragment = this.M;
            if (introductionCommentListFragment != null) {
                introductionCommentListFragment.notifyDataChanged(this.J.getId().intValue());
            }
            O0(this.N, this.M, z4);
            com.papa.sim.statistic.p.l(this).q1(Event.singleStartGamePageDetail, Event.ClickComment, "", new Ext().setFrom("1").setArticleId(String.valueOf(this.J.getId())).setFromTabId(String.valueOf(this.A)), new Data().setGameId(Long.parseLong(this.E)));
        }
    }

    @Override // w1.h
    public void G(Object obj) {
        if (obj instanceof TimingBean) {
            String replace = this.J.getVideoH5Tpl().replace("_s_", S0(this.J.getContent(), ((TimingBean) obj).getTime().intValue()));
            this.D = replace;
            z0(replace);
            com.papa.sim.statistic.p.l(this).q1(Event.singleStartGamePageDetail, Event.AjustSpeed, "", new Ext().setFrom("1").setArticleId(String.valueOf(this.J.getId())).setFromTabId(String.valueOf(this.A)), new Data().setGameId(Long.parseLong(this.E)));
        } else if (obj instanceof VideoChaptersBean) {
            String replace2 = this.J.getVideoH5Tpl().replace("_s_", ((VideoChaptersBean) obj).getContent());
            this.D = replace2;
            z0(replace2);
            com.papa.sim.statistic.p.l(this).q1(Event.singleStartGamePageDetail, Event.AjustSeries, "", new Ext().setFrom("1").setArticleId(String.valueOf(this.J.getId())).setFromTabId(String.valueOf(this.A)), new Data().setGameId(Long.parseLong(this.E)));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click({R.id.ll_progress})
    public void G0() {
        if (this.J != null) {
            boolean z4 = false;
            if (this.K == null) {
                IntroductionProgressFragment_ introductionProgressFragment_ = new IntroductionProgressFragment_();
                this.K = introductionProgressFragment_;
                introductionProgressFragment_.setData(this.J);
                z4 = true;
            }
            IntroductionProgressFragment introductionProgressFragment = this.K;
            if (introductionProgressFragment != null) {
                introductionProgressFragment.notifyDataChanged(this.J);
            }
            O0(this.N, this.K, z4);
            if (this.J.getIsCollection().intValue() == 1) {
                com.papa.sim.statistic.p.l(this).q1(Event.singleStartGamePageDetail, Event.ClickSeriesButton, "", new Ext().setFrom("1").setArticleId(String.valueOf(this.J.getId())).setFromTabId(String.valueOf(this.A)), new Data().setGameId(Long.parseLong(this.E)));
            } else {
                com.papa.sim.statistic.p.l(this).q1(Event.singleStartGamePageDetail, Event.ClickSpeedButton, "", new Ext().setFrom("1").setArticleId(String.valueOf(this.J.getId())).setFromTabId(String.valueOf(this.A)), new Data().setGameId(Long.parseLong(this.E)));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click({R.id.ll_recommend})
    public void H0() {
        if (this.J != null) {
            boolean z4 = false;
            if (this.L == null) {
                z4 = true;
                this.L = new MoreIntroductionFragment_();
                Bundle bundle = new Bundle();
                bundle.putInt("tagId", this.J.getId().intValue());
                bundle.putString("gameId", this.E);
                this.L.setArguments(bundle);
            }
            MoreIntroductionFragment moreIntroductionFragment = this.L;
            if (moreIntroductionFragment != null) {
                moreIntroductionFragment.notifyDataChanged(this.J.getId().intValue());
            }
            O0(this.N, this.L, z4);
            com.papa.sim.statistic.p.l(this).q1(Event.singleStartGamePageDetail, Event.ClickRecommandButton, "", new Ext().setFrom("1").setArticleId(String.valueOf(this.J.getId())).setFromTabId(String.valueOf(this.A)), new Data().setGameId(Long.parseLong(this.E)));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click({R.id.ll_praise})
    public void I0() {
        BbsDetailBean bbsDetailBean = this.J;
        if (bbsDetailBean != null) {
            if (bbsDetailBean.getPraise().booleanValue()) {
                B0(this.J.getId());
            } else {
                C0("", this.J.getId());
            }
        }
    }

    void J0(String str) {
        try {
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void L0() {
        z0(this.D);
    }

    public void N0(View view, WebChromeClient.CustomViewCallback customViewCallback, WebChromeClient webChromeClient) {
        this.f34136v = view;
        if (view == null) {
            return;
        }
        this.f34137w = webChromeClient;
        this.f34125k.setVisibility(8);
        this.f34124j.removeAllViews();
        this.f34124j.setVisibility(0);
        this.f34124j.addView(view, new RelativeLayout.LayoutParams(-1, -1));
        M0();
    }

    void O0(Fragment fragment, Fragment fragment2, boolean z4) {
        if (fragment == fragment2) {
            return;
        }
        if (fragment != null) {
            FragmentTransaction beginTransaction = this.B.beginTransaction();
            m0(beginTransaction);
            beginTransaction.hide(fragment);
            try {
                beginTransaction.commit();
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
        if (fragment2 != null) {
            FragmentTransaction beginTransaction2 = this.B.beginTransaction();
            m0(beginTransaction2);
            if (z4) {
                beginTransaction2.add(R.id.fl_front_view, fragment2);
            }
            beginTransaction2.show(fragment2);
            try {
                beginTransaction2.commit();
            } catch (Exception e6) {
                e6.printStackTrace();
            }
            this.N = fragment2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void P0(BbsDetailBean bbsDetailBean) {
        try {
            if (this.F != null && this.P) {
                this.f34117c.sendEmptyMessage(4);
            }
            this.f34132r.removeAllViews();
            this.f34130p = (NestedScrollWebView) View.inflate(this, R.layout.layout_introduction_video, this.f34132r).findViewById(R.id.ns_web_view);
            int intValue = bbsDetailBean.getType().intValue();
            this.H = intValue;
            if (intValue == 1) {
                this.D = bbsDetailBean.getVideoH5Tpl().replace("_s_", bbsDetailBean.getContent());
                r0();
            } else {
                this.D = bbsDetailBean.getContent();
            }
            if ((bbsDetailBean.getTiming() != null && bbsDetailBean.getTiming().size() > 0) || (bbsDetailBean.getVideoChapters() != null && bbsDetailBean.getVideoChapters().size() > 0)) {
                this.f34134t.setVisibility(0);
                if (bbsDetailBean.getIsCollection().intValue() == 1) {
                    this.f34133s.setText("合集");
                    com.papa.sim.statistic.p.l(this).q1(Event.singleStartGamePageDetail, Event.ShowSeriesButton, "", new Ext().setFrom("1").setArticleId(String.valueOf(bbsDetailBean.getId())).setFromTabId(String.valueOf(this.A)), new Data().setGameId(Long.parseLong(this.E)));
                } else {
                    G0();
                    this.f34117c.sendEmptyMessageDelayed(2, 3000L);
                    this.f34133s.setText("进度");
                    com.papa.sim.statistic.p.l(this).q1(Event.singleStartGamePageDetail, Event.ShowSpeedButton, "", new Ext().setFrom("1").setArticleId(String.valueOf(bbsDetailBean.getId())).setFromTabId(String.valueOf(this.A)), new Data().setGameId(Long.parseLong(this.E)));
                }
            } else {
                this.f34134t.setVisibility(8);
            }
            init();
            z0(this.D);
            com.join.mgps.Util.v0.b(this.f34116b, "showMain() called.");
            NestedScrollWebView nestedScrollWebView = this.f34130p;
            if (nestedScrollWebView != null) {
                nestedScrollWebView.setVisibility(0);
            }
            this.f34128n.setText(String.valueOf(bbsDetailBean.getLike()));
            this.f34129o.setText(String.valueOf(bbsDetailBean.getComment()));
            if (bbsDetailBean.getPraise().booleanValue()) {
                this.f34127m.setImageResource(R.drawable.ic_introduction_star_blue);
                this.f34128n.setTextColor(Color.parseColor("#34ACFF"));
                return;
            }
            this.f34127m.setImageResource(R.drawable.ic_introduction_star_white);
            this.f34128n.setTextColor(Color.parseColor("#FFFFFF"));
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void R0(boolean z4) {
        if (z4) {
            this.f34127m.setImageResource(R.drawable.ic_introduction_star_blue);
            BbsDetailBean bbsDetailBean = this.J;
            bbsDetailBean.setLike(Integer.valueOf(bbsDetailBean.getLike().intValue() + 1));
            this.f34128n.setText(String.valueOf(this.J.getLike()));
            this.f34128n.setTextColor(Color.parseColor("#34ACFF"));
        } else {
            this.f34127m.setImageResource(R.drawable.ic_introduction_star_white);
            BbsDetailBean bbsDetailBean2 = this.J;
            bbsDetailBean2.setLike(Integer.valueOf(bbsDetailBean2.getLike().intValue() - 1));
            this.f34128n.setText(String.valueOf(this.J.getLike()));
            this.f34128n.setTextColor(Color.parseColor("#FFFFFF"));
        }
        this.J.setPraise(Boolean.valueOf(z4));
    }

    @Override // w1.h
    public void U(Fragment fragment) {
        if (fragment != null) {
            try {
                this.B.beginTransaction().hide(fragment).commitNowAllowingStateLoss();
                this.N = null;
            } catch (Exception e5) {
                e5.printStackTrace();
                return;
            }
        }
        if (fragment == this.K) {
            this.f34117c.removeMessages(2);
        }
    }

    @Override // com.mgsim.common.fragment.a
    public void V(BackHandledFragment backHandledFragment) {
        this.R = backHandledFragment;
    }

    @Override // w1.h
    public void a0(int i4) {
        String videoH5Tpl = this.J.getVideoH5Tpl();
        String replace = videoH5Tpl.replace("_s_", this.J.getContent() + "&t=" + i4);
        this.D = replace;
        z0(replace);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterview() {
        com.join.mgps.Util.v0.b(this.f34116b, "afterView() called.");
        try {
            TextView textView = this.f34122h;
            if (textView != null) {
                textView.setText("网页加载失败，再试试吧~");
            }
            this.Q = com.join.mgps.Util.b0.f0(this).x(this);
            this.O = "TIME_" + this.f34139y;
            loadData();
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void dismissLoadingDialog() {
        com.join.mgps.dialog.d1 d1Var = this.Q;
        if (d1Var != null) {
            d1Var.dismiss();
        }
    }

    public void initWebSet() {
        this.f34130p.getSettings().setDomStorageEnabled(true);
        this.f34130p.getSettings().setRenderPriority(WebSettings.RenderPriority.HIGH);
        this.f34130p.getSettings().setAppCacheEnabled(true);
        this.I = getApplicationContext().getDir("cacheH5", 0).getPath();
        this.f34130p.getSettings().setAppCachePath(this.I);
        this.f34130p.getSettings().setAllowFileAccess(true);
        this.f34130p.getSettings().setCacheMode(-1);
        this.f34130p.getSettings().setPluginState(WebSettings.PluginState.ON);
        this.f34130p.getSettings().setLoadWithOverviewMode(true);
        this.f34130p.getSettings().setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NARROW_COLUMNS);
        this.f34130p.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        this.f34130p.getSettings().setTextZoom(100);
        this.f34130p.getSettings().setMediaPlaybackRequiresUserGesture(false);
        this.f34130p.getSettings().setUseWideViewPort(true);
        this.f34130p.getSettings().setSupportZoom(false);
        this.f34130p.getSettings().setBuiltInZoomControls(false);
        this.f34130p.getSettings().setJavaScriptEnabled(true);
        this.f34130p.getSettings().setDefaultTextEncodingName("UTF-8");
        this.f34130p.getSettings().setCacheMode(-1);
        this.f34130p.setWebViewClient(new f(this));
        this.f34130p.addJavascriptInterface(new e(this), "papa");
        try {
            if (Build.VERSION.SDK_INT > 27) {
                this.f34130p.getSettings().setSafeBrowsingEnabled(false);
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0053 -> B:18:0x0065). Please submit an issue!!! */
    @Background
    public void loadData() {
        showLoding();
        if (com.join.android.app.common.utils.j.j(this)) {
            try {
                showLoding();
                RequestBbsDetailArgs requestBbsDetailArgs = new RequestBbsDetailArgs();
                requestBbsDetailArgs.setPostId(Integer.valueOf(this.f34139y));
                requestBbsDetailArgs.setUid(Integer.valueOf(t0()));
                RequestModel requestModel = new RequestModel(this);
                requestModel.setArgs(requestBbsDetailArgs);
                ResponseModel<BbsDetailBean> g02 = this.C.g0(requestModel.makeSign());
                if (g02 != null) {
                    try {
                    } catch (Exception e5) {
                        e5.printStackTrace();
                        showLodingFailed();
                    }
                    if (g02.getData() != null) {
                        BbsDetailBean data = g02.getData();
                        this.J = data;
                        P0(data);
                        r0();
                        return;
                    }
                }
                showLodingFailed();
                return;
            } catch (Exception e6) {
                e6.printStackTrace();
                showLodingFailed();
                return;
            }
        }
        showLodingFailed();
    }

    void m0(FragmentTransaction fragmentTransaction) {
        fragmentTransaction.setCustomAnimations(R.anim.from_right, R.anim.out_right);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void n0() {
        this.Q.b();
        this.Q.a("正在上传图片请稍候");
        this.Q.setCancelable(false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Receiver(actions = {o1.a.f72001g0})
    public void o0(Intent intent) {
        finish();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        BackHandledFragment backHandledFragment = this.R;
        if (backHandledFragment == null || !backHandledFragment.a()) {
            if (getSupportFragmentManager().getBackStackEntryCount() == 0) {
                super.onBackPressed();
            } else {
                getSupportFragmentManager().popBackStack();
            }
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.B = getSupportFragmentManager();
        this.C = com.join.mgps.rpc.impl.i.D0();
        if (bundle != null) {
            try {
                NestedScrollWebView nestedScrollWebView = this.f34130p;
                if (nestedScrollWebView != null) {
                    nestedScrollWebView.restoreState(bundle);
                }
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        try {
            if (this.f34135u != null) {
                moveTaskToBack(true);
            }
            NestedScrollWebView nestedScrollWebView = this.f34130p;
            if (nestedScrollWebView != null) {
                nestedScrollWebView.destroy();
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        super.onDestroy();
        p0();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i4, KeyEvent keyEvent) {
        com.join.mgps.Util.v0.b(this.f34116b, "onKeyDown() called.");
        if (i4 == 4 && keyEvent.getRepeatCount() == 0 && w0()) {
            this.f34137w.onHideCustomView();
            return true;
        }
        return super.onKeyDown(i4, keyEvent);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        NestedScrollWebView nestedScrollWebView = this.f34130p;
        if (nestedScrollWebView != null) {
            try {
                nestedScrollWebView.getClass().getMethod("onPause", new Class[0]).invoke(this.f34130p, null);
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
            } catch (NoSuchMethodException e6) {
                e6.printStackTrace();
            } catch (InvocationTargetException e7) {
                e7.printStackTrace();
            }
        }
        super.onPause();
        q0();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        NestedScrollWebView nestedScrollWebView = this.f34130p;
        if (nestedScrollWebView != null) {
            try {
                nestedScrollWebView.getClass().getMethod("onResume", new Class[0]).invoke(this.f34130p, null);
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
            } catch (NoSuchMethodException e6) {
                e6.printStackTrace();
            } catch (InvocationTargetException e7) {
                e7.printStackTrace();
            }
        }
        r0();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        NestedScrollWebView nestedScrollWebView = this.f34130p;
        if (nestedScrollWebView != null) {
            nestedScrollWebView.saveState(bundle);
        }
    }

    void p0() {
        BbsDetailBean bbsDetailBean = this.J;
        if (bbsDetailBean == null || bbsDetailBean.getType().intValue() != 1) {
            return;
        }
        synchronized (this) {
            if (this.W.containsKey(this.O)) {
                Long l4 = this.W.get(this.O);
                if (l4 == null) {
                    l4 = 0L;
                }
                if (l4.longValue() > 0) {
                    long currentTimeMillis = System.currentTimeMillis() - l4.longValue();
                    this.W.remove(this.O);
                    this.V += currentTimeMillis;
                }
            }
            if (this.W.isEmpty() && this.V > 0) {
                com.papa.sim.statistic.p.l(this).q1(Event.singleStartGamePageDetail, Event.videoLookTimes, "", new Ext().setArticleId(String.valueOf(this.f34139y)).setLiveTime(this.V / 1000).setFrom("1"), new Data().setGameId(Long.valueOf(this.E).longValue()));
            }
            this.V = 0L;
        }
    }

    void q0() {
        BbsDetailBean bbsDetailBean = this.J;
        if (bbsDetailBean == null || bbsDetailBean.getType().intValue() != 1) {
            return;
        }
        synchronized (this) {
            if (this.W.containsKey(this.O)) {
                Long l4 = this.W.get(this.O);
                if (l4 == null) {
                    l4 = 0L;
                }
                long currentTimeMillis = System.currentTimeMillis() - l4.longValue();
                this.W.remove(this.O);
                if (this.W.isEmpty()) {
                    this.V += currentTimeMillis;
                }
            }
        }
    }

    @Override // w1.h
    public void r() {
        com.papa.sim.statistic.p.l(this).q1(Event.singleStartGamePageDetail, Event.PostComment, String.valueOf(t0()), new Ext().setFrom("1").setArticleId(String.valueOf(this.J.getId())).setFromTabId(String.valueOf(this.A)), new Data().setGameId(Long.parseLong(this.E)));
    }

    void r0() {
        BbsDetailBean bbsDetailBean = this.J;
        if (bbsDetailBean == null || bbsDetailBean.getType().intValue() != 1) {
            return;
        }
        this.W.put(this.O, Long.valueOf(System.currentTimeMillis()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void relodingimag() {
        loadData();
    }

    @Override // w1.h
    public void s(int i4, int i5, boolean z4) {
        if (this.f34139y == i4) {
            return;
        }
        p0();
        this.f34139y = i4;
        this.G = Boolean.valueOf(z4);
        this.H = i5;
        this.J = null;
        this.O = "TIME_" + i4;
        loadData();
    }

    String s0() {
        BbsDetailBean bbsDetailBean = this.J;
        if (bbsDetailBean == null || !com.join.mgps.Util.g2.i(bbsDetailBean.getReportUrl())) {
            return "";
        }
        if (this.J.getReportUrl().contains("?")) {
            return this.J.getReportUrl() + "&resourceType=POST&ruid=" + this.J.getPosterId() + "&resourceId=" + this.f34139y;
        }
        return this.J.getReportUrl() + "?resourceType=POST&ruid=" + this.J.getPosterId() + "&resourceId=" + this.f34139y;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void setNetwork() {
        com.join.mgps.Util.v0.b(this.f34116b, "setNetwork() called.");
        UtilsMy.w3(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showLoding() {
        try {
            com.join.mgps.Util.v0.b(this.f34116b, "showLoding() called.");
            this.f34118d.setVisibility(0);
            this.f34119e.setVisibility(8);
            NestedScrollWebView nestedScrollWebView = this.f34130p;
            if (nestedScrollWebView != null) {
                nestedScrollWebView.setVisibility(0);
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showLodingFailed() {
        try {
            com.join.mgps.Util.v0.b(this.f34116b, "showLodingFailed() called.");
            this.f34119e.setVisibility(0);
            this.f34118d.setVisibility(8);
            NestedScrollWebView nestedScrollWebView = this.f34130p;
            if (nestedScrollWebView != null) {
                nestedScrollWebView.setVisibility(8);
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showTost(String str) {
        com.join.mgps.Util.l2.a(this).b(str);
    }

    public void u0() {
        this.f34136v = null;
        K0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void v0() {
        this.f34119e.setVisibility(8);
        this.f34118d.setVisibility(8);
    }

    public boolean w0() {
        return this.f34136v != null;
    }

    public void x0(String str) {
        this.f34130p.loadData(str, "text/html", "utf-8");
        this.f34117c.removeMessages(3);
        BbsDetailBean bbsDetailBean = this.J;
        if (bbsDetailBean == null || bbsDetailBean.getType().intValue() != 1) {
            return;
        }
        this.f34117c.sendEmptyMessageDelayed(3, 1300L);
    }

    public void y0(String str) {
        this.f34130p.loadUrl(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class b extends WebChromeClient {

        /* renamed from: a  reason: collision with root package name */
        WebChromeClient.CustomViewCallback f34142a;

        b() {
        }

        @Override // android.webkit.WebChromeClient
        public View getVideoLoadingProgressView() {
            if (IntroductionActivity.this.f34138x == null) {
                LayoutInflater from = LayoutInflater.from(IntroductionActivity.this);
                IntroductionActivity.this.f34138x = from.inflate(R.layout.video_loading_progress, (ViewGroup) null);
            }
            return IntroductionActivity.this.f34138x;
        }

        @Override // android.webkit.WebChromeClient
        public void onHideCustomView() {
            if (IntroductionActivity.this.f34136v == null) {
                return;
            }
            IntroductionActivity.this.f34136v = null;
            try {
                WebChromeClient.CustomViewCallback customViewCallback = this.f34142a;
                if (customViewCallback != null) {
                    customViewCallback.onCustomViewHidden();
                }
            } catch (Exception e5) {
                e5.printStackTrace();
            }
            IntroductionActivity.this.u0();
        }

        @Override // android.webkit.WebChromeClient
        public void onProgressChanged(WebView webView, int i4) {
            ProgressBar progressBar;
            ProgressBar progressBar2;
            ProgressBar progressBar3;
            super.onProgressChanged(webView, i4);
            if (i4 > 10 && (progressBar3 = IntroductionActivity.this.f34131q) != null) {
                progressBar3.setVisibility(0);
            }
            if (i4 > 80 && (progressBar2 = IntroductionActivity.this.f34131q) != null) {
                progressBar2.setVisibility(8);
            }
            if (i4 != 100 || (progressBar = IntroductionActivity.this.f34131q) == null) {
                return;
            }
            progressBar.setVisibility(8);
        }

        @Override // android.webkit.WebChromeClient
        public void onReachedMaxAppCacheSize(long j4, long j5, WebStorage.QuotaUpdater quotaUpdater) {
            try {
                UtilsMy.delete(new File(IntroductionActivity.this.I));
            } catch (Exception e5) {
                e5.printStackTrace();
            }
            super.onReachedMaxAppCacheSize(j4, j5, quotaUpdater);
        }

        @Override // android.webkit.WebChromeClient
        public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
            try {
                if (IntroductionActivity.this.f34136v != null) {
                    customViewCallback.onCustomViewHidden();
                    return;
                }
            } catch (Exception e5) {
                e5.printStackTrace();
            }
            IntroductionActivity.this.f34136v = view;
            this.f34142a = customViewCallback;
            IntroductionActivity.this.N0(view, customViewCallback, this);
        }

        @Override // android.webkit.WebChromeClient
        public void onShowCustomView(View view, int i4, WebChromeClient.CustomViewCallback customViewCallback) {
            onShowCustomView(view, customViewCallback);
        }
    }
}
